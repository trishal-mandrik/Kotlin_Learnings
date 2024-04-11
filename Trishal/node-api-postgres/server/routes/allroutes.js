const controller = require('../controller/users');

const integrated = [
    {
        'path' : '/users',
        'method' : 'get',
        'middlewares' : [],
        'handlers' : controller.getUsers
    },
    {
        'path' : '/users/:id',
        'method' : 'get',
        'middlewares' : [],
        'handlers' : controller.getUserById
    },
    {
        'path' : '/users',
        'method' : 'post',
        'middlewares' : [],
        'handlers' : controller.createUser
    },
    {
        'path' : '/users/:id',
        'method' : 'put',
        'middlewares' : [],
        'handlers' : controller.updateUser
    },
    {
        'path' : '/users/:id',
        'method' : 'delete',
        'middlewares' : [],
        'handlers' : controller.deleteUser
    },
];

module.exports = integrated;