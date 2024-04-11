const Pool = require('pg').Pool;
const controller = {};

const pool = new Pool({
    user: 'me',
    host: 'localhost',
    database: 'api',
    password: 'password',
    port: 5432,
});

// GET all users
controller.getUsers = async (req, res) => {
    try {
        await pool.query('Select * from public.users order by id ASC', (error, result) => {
            if(error) throw error;
            res.status(200).json(result.rows);
        });
    } catch (e) {
        console.error(e);
    }

}

// GET a single user by ID
controller.getUserById = async (req, res) => {
    const id = parseInt(req.params.id)

    try {
        await pool.query('Select * from users where id = $1', [id], (error, results) => {
            if(error) throw error

            res.status(200).json(results.rows)
        })
    } catch (e) {
        console.error(e);
    }

}

// POST a new user
controller.createUser = async (req, res) => {
    const { name, email } = req.body;
    try {
        await pool.query('Insert into users (name, email) values ($1, $2) returning *', [name, email], (error, results) => {
            if(error) throw error;

            res.status(200).send(`User added with ID: ${results.rows[0].id}`)
        })
    } catch (e) {
        console.error(e);
    }

}

// PUT updated data in an existing user
controller.updateUser = async (req, res) => {
    const id = parseInt(req.params.id);
    const { name, email } = req.body;

    try {
        await pool.query(
            'UPDATE users SET name = $1, email = $2 where id = $3',
            [name, email, id],
            (error, results) => {
                if(error) {
                    throw error
                }
                res.status(200).send(`User modified with ID: ${id}`)
            }
        )
    } catch (e) {
        console.error(e);
    }

}

// DELETE a user
controller.deleteUser = async (req, res) => {
    const id = parseInt(req.params.id);

    try {
        await pool.query('DELETE FROM users where id = $1', [id], (error, results) => {
            if (error) {
                throw error
            }
            res.status(200).send(`User deleted with ID: ${id}`);
        })
    } catch (e) {
        console.error(e);
    }

}

module.exports = controller;