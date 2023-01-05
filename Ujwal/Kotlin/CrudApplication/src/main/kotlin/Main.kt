import java.lang.*
import java.util.*
/*      ""  A Menu Driven CRUD Application for Employee Adding details  in  MutableList    ""
 */
    fun main(args: Array<String>) {
        val listOfEmployee = mutableListOf<Employee>()
        val itr=listOfEmployee.iterator()
        var flag = true
        var reader=Scanner(System.`in`)




        while (flag) {
            println("""Enter your choice 
                   1.ADD 
                   2.Delete 
                   3.update  
                   4.print Employee list 
                   5.Exit""".trimMargin())
            var choice: Int = reader.nextInt()
            when (choice) {

                1 -> {
                    println("Add Employee: Name,Age,Employee_id,salary ")
                    var emp1:Employee=addEmployee()

                    listOfEmployee.add(emp1)

                    println("Employee Added")

                }


                2 -> {
                    try {
                        var len: Int = (listOfEmployee.size) - 1
                        println("Enter --> Emp_id")
                        var id: Int = reader.nextInt()
                        for (i in 0..len) {
                            if (id == listOfEmployee.get(i).Emp_id) {
                                listOfEmployee.removeAt(i)
                                println("Employee Deleted")
                                break
                            }

                            }


                    }
                    catch (e:Exception){
                        println("Error Occured: Entered Wrong Input")
                    }
                    //
                // println("Employee Deleted")


                }

                3 -> {

                    println("Update Employee details")
                    try {

                        println("Enter --> Emp_id")
                        var id: Int = reader.nextInt()
                        println("Enter   Name , Age , Emp_id , Salary")
                        for (i in 0 until listOfEmployee.size) {
                            if (id == listOfEmployee.get(i).Emp_id) {
                                listOfEmployee.get(i).let{

                                    it.name= readLine().toString()
                                    it.age=reader.nextInt()
                                    it.Emp_id=reader.nextInt()
                                    it.salary=reader.nextLong()
                                }
                                println(" Employee details updated")
                                break
                            }
                        }

                    }
                    catch (e:Exception){
                        println("Error Occured : Entered Wrong Input")
                        break
                    }

                }






                4 -> {
                    println("Employee Details")
                    println("****************************************")
                    for (list in listOfEmployee){
                        list.apply {
                            println("Name: "+name)
                            println("Age: "+age)
                            println("Employee Id: "+Emp_id)
                            println("Salary :"+salary)
                        }
                        println("****************************************")
                    }
                    println("Number of employee's ---> "+listOfEmployee.size)
                }



                5 -> {

                    flag = false
                    println("Program Exited")
                }

            }


        }

    }

    fun addEmployee():Employee{
        var reader=Scanner(System.`in`)
        var emp=Employee()
        emp.apply {
            name= readLine().toString()
            age=reader.nextInt()
            Emp_id=reader.nextInt()
            salary=reader.nextLong()
        }
        return emp
    }

