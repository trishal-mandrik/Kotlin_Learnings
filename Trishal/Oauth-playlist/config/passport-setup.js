const passport = require('passport')
const GoogleStrategy = require('passport-google-oauth20').Strategy
const keys = require('./keys')
const User = require('../models/user-model')

passport.serializeUser((user, done) => {
        done(null, user.id)
})

passport.deserializeUser((id, done) => {
        User.findById(id).then((user) => {
                done(null, user)
        })
})

passport.use(
    new GoogleStrategy({
      //options for the Google strategy
        clientID: keys.google.clientID,
        callbackURL: '/auth/google/redirect',
        clientSecret: keys.google.clientSecret
}, (accessToken, refreshToken, profile, done) => {
            console.log(profile)
            User.findOne({googleId: profile.id}).then((currentUser) => {
                    if(currentUser){
                            //already have this user
                            console.log('user is: ', currentUser)
                            done(null, currentUser)
                    } else {
                            // if not, create user in our db
                            new User({
                                    googleId: profile.id,
                                    username: profile.displayName,
                                    thumbnail: profile._json.picture
                            }).save().then((newUser) => {
                                    console.log('created new user: ', newUser)
                                    done(null, newUser)
                            })
                    }
            })

    })
)