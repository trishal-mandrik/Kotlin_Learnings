package myapp

import com.demo.Make

class MakeController {
    def getAllMake = {
        def lstOfMakes = Make.list()
        [list : lstOfMakes]
    }
}
