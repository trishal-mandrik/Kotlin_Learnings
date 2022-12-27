package myapp

class HelloController {
    def index = {
        render "<h1>Hello Sir, Good Noon" + new Date() + "</h1>";

    }

    def test ={

        def x = "Hey"
        def y = "Good Morning"
        def date = new Date()
        [x:x,y:y,date:date]
    }

    def goodNooon = {
        render "Hello Sir, You are welcomed here..."
    }

    def renderSomething ={
        redirect (action : index())
    }
}
