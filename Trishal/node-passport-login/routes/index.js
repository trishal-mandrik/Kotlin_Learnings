const express = require('express')
const {ensureAuthenticated} = require("../config/auth");
const router = express.Router();

//welcome page
router.get('/', (req, res) => res.render('Welcome'));

//dashboard
router.get('/dashboard', ensureAuthenticated, (req, res) => res.render('dashboard', {
    user: req.user.name
}))
module.exports = router;