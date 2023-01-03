package myapp

import com.demo.Model

class ModelController {
    def dispalyModels = {
        def allModels = Model.list();
        [listOfModels:allModels]
    }
}
