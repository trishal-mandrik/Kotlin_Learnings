const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');
const helmet = require("helmet")
const cleanroutes = require('express-clean-routes');
const routes = require('./server/routes');
const app = express();
const port = 3000;

app.use(bodyParser.json());
app.use(bodyParser.urlencoded({ extended: true }));
app.use(cors());
app.use(helmet());

helmet.contentSecurityPolicy({
    useDefaults: true,
    directives: {
        "font-src": ["'self'", "external-website.com"],
        // allowing styles from any website
        "style-src": null,
    },
})

app.use('/', cleanroutes(routes));

// app.use((req, res, next) => {
//     const error = new Error("Something went wrong");
//     next(error);
// });
//
// app.use((err, req, res, next) => {
//     console.error('Error:', err.message);
//     res.status(500).send('Internal Server Error');
// })

app.listen(port, () => {
    console.log(`App running on ${port}`);
});