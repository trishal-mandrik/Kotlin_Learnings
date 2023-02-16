//----------------------------------------INTERFACE-----------------------------------------------

//Interface can contains both NORMAL METHODS and ABSTRACT METHODS
//But they contains only ABSTRACT PROPERTIES
//Interface are NOT class
//You cannot create instance of an Interface similar to an ABSTRACT CLASS

interface MyInterfaceListener { //You cannot create the instance of interface
    fun onTouch()               //Methods in interface are abstract by default

    fun onClick() {             //Normal methods are public and open by default but NOT FINAL
        println("MyInterfaceListener: onClick")
    }
}

interface MySecondInterface {   //You cannot create the instance of interface

    fun onTouch() {             //Normal Method
        println("MySecondInterface: onTouch")
    }

    fun onClick() {             //Normal methods are public and open by default but NOT FINAL
        println("MySecondInterface: onClick")
    }
}

class MyButton: MyInterfaceListener, MySecondInterface {

    override fun onTouch() {
        super<MyInterfaceListener>.onClick()
        super<MySecondInterface>.onClick()
    }

    override fun onClick() {
        super.onTouch()
    }
}

