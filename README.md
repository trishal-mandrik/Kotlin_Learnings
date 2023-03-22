# Kotlin_Learnings

# Work only on your folder. Don't edit other folders but you can see what others are coding on there folder.

# Share the problem statement you are solving with others also, so that others can also solve those. Then we can see how others are writing solution for a particular problem.


# New Practice Assignment
# 
# Day 1
4. Solve (Hands on)
4.1 Accept 2 double values from User (using Scanner). Check data type.
. If arguments are not doubles , supply suitable error message & terminate.
If numbers are double values , print its average.
Hint : Method of Scanner to use : hasNextDouble , nextDouble 

4.2 Display food menu to user. User will select items from menu along with the quantity. (eg 1. Dosa 2. Samosa 3. Idli ... 10 . Generate Bill ) Assign fixed prices to food items(hard code the prices)
When user enters 'Generate Bill' option(10) , display total bill & exit.


OR 
Create java application for the following
Accept 2 numbers from user & operation to perform
1. Add 2.Subtract 3. Multiply 4.Divide 5.Exit
Display the result of the operation. 
Java app must continue to run till user chooses exit option.

OR
Prompt user for how many numbers(double) to accept
Create suitable data structure to hold these numbers.
Prompt user to populate the values in data structure
Display the same.
Prompt user for option
1. Double nums
2. Square nums
3. Square root nums
4. Exit
As per the option , apply this operation on all nums in the data structure
display the result.

Additional reference for long to float conversion
https://stackoverflow.com/questions/15229323/java-why-is-converting-a-long-64-to-float-32-considered-widening/15229379


# Day 2


Create a  class Point2D  , under package "com.cdac.geometry" for representing a point in x-y co-ordinate system.

4.1 Create a parameterized constructor to accept x & y co-ords.

4.2 Add  show() method  --to return point's x & y co-ords
eg : public String show() {.....}

4.3 Add a non static  , isEqual method to Point2D class : boolean returning method : must return true if both points are having same x,y co-ords or false otherwise.
eg : public boolean isEqual(Point2d anotherPoint)
{
 return this.x == anotherPoint.x && ....;
}

eg : p1.isEqual(p2); 
OR
p2.isEqual(p1)

4.4 Add a non static method , calculateDistance , to calc distance between 2 points
Hint : use distance formula.

eg : In Tester :
double distance=p1.calculateDistance(p2);

In Point2D class
import static java.lang.Math.*;

public double calculateDistance(Point2d anotherPoint)
{
   return sqrt(pow(this.x-anotherPoint.x,2),......);
}

4.5  Create a driver  class(for UI)  , in the "tester" package "TestPoint" , with main(..)

4.6  Accept x,y co-ordinates for 2 points n store the info.
4.7  Display x,y co-ordinates of both of the points plotted  (using show() method)
4.8  Find out if the points  are same or different (Hint : isEqual)
Print the message accordingly. (print SAME or DIFFERENT)
If points are not same , display distance between these 2 points.
------------------------


# Day 3

3. Hands on
Continue with day3.1 project , TestBoxArray

 Double box width for all boxes having volume > 100.
Can you use for-each for above requirement ?
If yes , Try it out !

4. If you have completed Point2D based day2 assignment , try this.

4.1   Create a driver  class(for UI)  , in the "tester" package "TestPoints" , with main(..)

Ask user , how many points to plot? : 100
Create suitable array.
4.2  Accept x,y co-ordinates for all the points n store it suitably. : for loop
4.3   Display x,y co-ordinates of all the points plotted so far ,using for-each loop.
4.4   Accept 2 indices from user .
Find out if the points at these indices are same or different (Hint : isEqual)
Print the message accordingly. 
If points are not same , display distance between these 2 points.
eg : In Tester 
sop("Enter 2 indices");
int index1=...
int index2=...
if (....validate indices ....)
{
   if(points[index1].isEqual(....) .....
}
else 
sop(err mesg!);


# Day 5
5. Hands on 

5.1 Can you arrange Fruit,Apple,Orange,Mango in inheritance hierarchy ?
Use tight encapsulation.

5.2 Properties (instance variables)  : color : String , weight : double , name:String, fresh : boolean

5.3 Add suitable constructors.

5.4 Override  toString correctly to return state of all fruits (return only  : name ,color , weight )

5.5 Add a taste() method : public String taste()

For Fruit : Can you identify taste of any general fruit ?
So will you add a taste() with this definition : returns "no specific taste" OR can u apply abstraction(now or may be later !)

Apple : should return  "sweet n sour"
Mango : should return  "sweet"
Orange : should return  "sour"

5.6 Add specific functionality , in the sub classes
In Mango : public void pulp() {Display name n color of the fruit + a mesg  creating  pulp!}
In Orange : public void juice() {Display name n weight of the fruit + a mesg extracting juice!}
In Apple : public void jam() {Display name of the fruit + a mesg  making jam!}


5.7 Add all of above classes under the package "com.app.fruits"
5.8 Create java application FruitBasket , with main method , as a tester
5.9 Prompt user for the basket size n create suitable data structure

5.10 Supply options
1. Add Mango
2. Add Orange
3. Add Apple
NOTE : You will be adding a fresh fruit in the basket , in all of above options.

4. Display names of all fruits in the basket.

5. Display name,color,weight , taste of all fresh fruits , in the basket.


6. Mark a fruit in a basket , as stale(=not fresh)
i/p : index 
o/p : error message (in case of invalid index) or mark it stale

7. Mark all sour fruits stale 
Hint : Use equals() method of the String class.

8. Invoke fruit specific functionality (pulp / juice / jam)
i/p : index
Invoke correct functionality (pulp / juice / jam)

10. Exit 
--------------------
Query

Tester 

Person p=new Person("a1","b1");
Student s=p;//javac err
OR 
Student s=(Student) p;//javac err : no  , illgeal casting : detected at run time : CCE
s.study();//will not reach here : as code aborts earlier !!!!!!

# Day 6
Create Java application for fixed stack & growable stack based on Stack i/f , for storing customer details

Customer has : id(int), name (string) , address(string)
Provide suitable constructor n toString


Steps
3.1 Create Customer class
3.2 Stack interface -- push & pop functionality for Customer refs. & declare STACK_SIZE as a constant. 
3.3 Create implementation class of Stack i/f -- FixedStack (array based)
3.4 Create another implementation class of Stack i/f-- GrowableStack (array based)
Can you add inheritance between Fixed Stack n Growable Stack ? YES 

3.5
Create Tester class (Hint :  use dynamic method dispatch using interfaces)
Display Menu
Note : Must use 1 switch-case only. You won't need any complex nested control structure
Once user selects either fixed or growable stack , user shouldn't be allowed to change the selection of the stack.

1 -- Choose Fixed Stack
Hint : fixed stack instance :
ctor
ref=new FixedStack();

2 -- Choose Growable Stack
Accept following options only after initial selection

3 -- Push data 
I/P : Accept customer details & store these details in the earlier chosen stack or give error mesg : NO stack chosen !!!
In case user has chosen fixed stack , n stack is full give err mesg. 
In case of growable stack , should be able to save customer details w/o getting err.

4 --- Pop data & display the same (from the earlier chosen stack or give error mesg : NO stack chosen !!!)
No inputs are required : pop customer details from the top of the stack

5 -- Exit

# Day 7
1 try to complete , Day6's stack assignment
 use exception handling , to raise run time errors.


# Day 8

Java enum
Showroom Management system , which will keep track of vehicles added in the showroom.

1. Prompt showroom capacity
Create suitable array.

Options
1. Add Vehicle to the showroom.
Accept data --validate all i/ps --success -- add vehicle
o.w : throw exc (built in / custom exc)

2. Display all vehicle details

10. Exit

Add  validation rules (in a separate class , as static methods)
1 manufactureDate : must be in current financial year(1st Apr 2022 ---31st Mar 2023)
Currently use hard coded values for date boundary.

2 Vehicle color must be from the available color.

3 Base price : min 10000 , max 100000

4. OPTIONAL (based upon equals) 
 No dup vehicles should be added in the showroom

# Day 9

3. Hands on.
Create application for customer management system.
(initial part only !)

3.1 Customer : id(int) name(string),email(string),password(string),registrationAmount(double),dob(Date),type (ServicePlan : enum)
ServicePlan : SILVER,GOLD,DIAMOND,PLATINUM
Depending on the plan chosen customer can avail different types of services

Registration amounts for different plans 
SILVER :  500
GOLD : 1000
DIAMOND : 1500
PLATINUM : 2000

customer id should be system generated , using auto increment.

Unique ID(Composite Primary Key ) : email & dob(date of birth) (2 customers are SAME iff their email ids & dob is same)
3.2 

Validation Rules 
email must contain "@" & should be end with either  ".com" or ".org"  domain
password must be min 4 max 10 chars long. Must contain atleast 1 special character : # @ $ % * 
Examplle for alphanumeric strong password
"[a-z]+[A-Z]+[#@$%*\\-]+[0-9]+"

dob should be before 1st Jan 1995
duplicate customer details should not be stored.
Customer should pay  correct reg amount as per the selected plan 

Centralized exception handling is expected.

3.3 Create a simple tester , only for customer registration today.

Accept n Validate customer details.
Iff it's valid , create customer instance n display it's details
o.w display error message via custom exception

# Day 11


2. Hands on
Customer Management System , based upon collection framework

2.1 Create new project , as day11_assignment
Copy your Customer , enums , custom exceptions n validation rules n make necessary changes.

2.3 Write a tester class with the following options.

Options
1. Customer registration
i/p : all customer details (invoke validation rules n  only in case of success store customer details )
otherwise display error message

2. Customer Login
i/p : email , dob , password
Hint : indexOf(customer ref) ---> -1 =>  invalid email or DoB --> throw exc
get(index) ---> validated customer ref  => PK details are valid 
chk password ( equals of String) ---valid => success message
=>throw exc :  invalid  password !

3. Link Adhar Card
i/p email dob
In case of success , accept Adhar card details n link it.

Think : Where will you store Adhar card details ? What is the relationship between Customer n Adhar card ? : Composition , achieved via inner class
Adhar card details 
adhar card no (string) , location 

4. Change Password
i/p : email ,dob ,  old password , new password
In case of correct credentials n if Adhar card details are linked , allow user for changing password.
Steps :
authenticate customer --  failure -- exc
success --chk if customer's adhar card is linked ? --- null chking --null => not yet linked ! --exc
validate new pwd -- success --setter for pwd.

5. Unsubscribe a customer
(Remove customer details)
i/p : email ,dob
Steps : Create customer obj : wrapping PK
Use remove(Object o) : rets true => success ---Customer  un subscribed .....
o.w : throw exc 


6. Upgrade all senior citizens (users with age > 60 ) with , Diamond plan to Platinum plan 
Hint : You can hard code the date as 60 years before the current date.
(i.e Can hard code it  1st Jan 1962)
Steps :
Since search criteria : DoB n plan => non PK based ---CAN NOT use any ready func(eg : contains/indexOf...) --will have to iterate : for-each
If a match is found (based on Dob n plan) --upgrade the plan and update reg amount : to keep consistency.

# Day 12

4 If time permits (Optional work)
4.1 Sort the customer details ,  as per email n dob : using natural ordering
4.2 Sort the customer details  , as per only DoB : using custom ordering with ano innner class
4.3 Sort the customer details  , as per DoB n service plan chosen

# Day13
1. Complete pending CMS , including the sorting.

2. import day13.1 , to revise Iterator , ListIterator n LinkedList

3. import day13.2 , to revise different types of sets.
Revise (hashCode n equals) : following both parts of the contract.

4. import day13.3 to revise hashing (hashCode n equals) :  following only mandatory part of the contract.
Compare the performance , using observation file.


# Day 14
1.import day14.1 , to revise hashing algorithm using a HashSet.

1. Revise hashing algorithm in HashSet , by importing day14.1 

1.2 Understand hashing algorithm with code sample, diagram n observations
1.3 Refer to <ready code> , for Java 8 new Date Handling examples
1.4 Refer to Map API n it's internals.

2. Solve
Create a new eclipse project (day14.1_assignment) 

1. Store book details in a library in hashing based data structure : HashSet
Book details : title(string),category(enum),price(double),publishDate(LocalDate) ,authorName(string),quantity(int)
Unique ID : book title
Accept at least 5 book details from user & confirm if hash set is working in a correct manner.

3. Create another new eclipse project (day14.2_assignment) , for basic library management system

Store book details in a library in hashing based data structure : HashMap

Book details : title(string),category(enum),price(double),publishDate(LocalDate),authorName(string),quantity(int)

Unique ID : book title
We are not adding any extra validations rules here , to keep the focus on HashMap

Create a pre-populated map with sample data.(put) :atleast 5 entries

Supply following options
2.1 Add book.
I/P Book details
In case of a new book , store book details in the map.
In case of duplicate title , just update the quantity
Soln : HashMap<String,Book> books =populateData();


sop("Enter Title of the Book");
sc.nextLine(); //to read off pending new line char/s from the scanner
String title=sc.nextLine();
if(books.containsKey(title))
{
  sop("Qty to add");
 Book b= books.get(title);
 b.setQty(b.getQty()+sc.nextInt());  
 sop("qty updated...");
} else
{
  sop("rem. book dtls ")
  books.put(title,new Book(title,.....));
  sop("new book added ...");
}

2.2 Display All books in a library

2.3 Issue out a single copy of the book.
i/p book title
If the book is found , update the quantity suitably.
Otherwise , raise suitable exception

2.4 Return a book
i/p book title
If the book is found , update the quantity suitably.
Otherwise , raise suitable exception

2.5 Remove book
i/p book title
If the book is found , remove book's entry(key n value pair) from the library. 
Otherwise , raise suitable exception


# Day15
1. import day15.1 , to revise HashMap objectives.

2. import day15.2 , to revise

2.1 wild card (?) , extends n super keywords in generic syntax
2.2 Go through the code samples thoroughly.
2.3 defualt methods in java interfaces.

3. Solve "generic-questions.txt"

4. Refer to ready code (Emp based hierarchy)

Create a Utils class : non generic class 
4.1 Add a static method to compute salary of ANY Collection of emps / mgr/ salesmgr / tempworker.
Test cases : AL<Emp> , Vector<Worker> , LinkedList<Mgr>, HS<Mgr> , TS<SalesMgr>....
Hint : public static void invokeComputeSal(List<? extends Emp> emps)
{
  for(Emp e : emps)
   e.computeSalary();
}
From Tester 
AL<Emp> myEmps=new AL<>();
add some emps....
invokeComputeSal(myEmps);

Vector<Worker> workers=new Vector<>();
workers.add(new Worker(..));.......//10 workers
invokeComputeSal(workers);

4.2 Write a method to find max number from List of any numbers (integer / float / double ...) n return it to the caller.
eg : T max=list.get(0);
for(int i=1;i<list.size()-1;i++)
        if(max.compareTo(list.get(i)) <= 0)
           max=list.get(i);
....

4.3 Optional exercise (Try it last)
Write a method in Utils class , to copy references from any type of the list to any other type of the list  ? 
If no , explain the reason.
How to modify above copy method with suitable restrictions ?

It should pass following tests
4.1 You should be able to copy references from AL<Worker> to ANY List<Emp>
4.2 You should be able to copy references from Vector<Mgr> to ANY List<Emp>
4.3 You should be able to copy references from LinkedList<SalesMgr> to ANY List<Emp>
4.4 Refer to earlier Fruits hierarchy (from Q 3)
You should be able to copy references from LinkedList<WaterMelon> to ANY List<Melon>
You should be able to copy references from ArrayList<WaterMelon> to ANY List<Fruit>

Note : You are not allowed to use a readymade Collections method.

5. Complete pending work

6.Optional assignment

In Emp based organization 
Emp details : empId(int) , organizationName(string), empName, salary, deptId(int)

PK : empId n name of the organization.

Create sufficient no of records of emps(to test all possible combinations in composite PK)  n store them suitably in the hash map , to ensure constant time performance.
Hint : Create a custom key class : EmpKey 
state : empId(int) , organizationName(string)
which methods u will have override ? hashCode n equals 
+ imple Comparable

# Day 16

1. Complete earlier pending work.

2. import day16.1 to revise
Functional interfaces , lambda expression , Functional streams programming

3. Hands on
Continue with Library Management System .

3.1 
Can you replace BookUtils class by the i/f ? YES
Make necessary changes

Methods 
1. static HashMap<String,Book>  popoulateMap() {...}

2. Add a method in BookUtils(i/f) , to accept Map of books , copy it's references into the List. Return list to the caller.
eg : static List<Book> populateList(HashMap<String,Book> books)
{
 .....
}

(lambda expression exercise)

1. Write a tester to display books from the list.
eg : forEach n lambda expression or method ref.

2. Refer to Collection i/f 's higher order function :  removeIf
Use it to remove all books published before a specific date.
eg : user i/p :  date (string) --> LocalDate
map -- values --- removeIf --filter/predicate : isBefore
display map : map --forEach

3. Refer Map i/f higher order function : forEach
Use it to display book title along with complete book details(w/o converting it into collection view)
eg : map --forEach --sop(k+" "+v);

4. Sorting : custom ordering
Use populated List of Books from BookUtils.
Sort them as per books price , using custom ordering n lambda expression.
eg :
Func literal
Comparator<Book> comp=....
 list.sort(comp);

# Day 17
1. Complete Day16 assignments first. (Mandatory work )


2. Import , day17.1 to revise functional programming .

3. Import day17.2 to revise I/O handling

4. Optional work
(refer to day16-data\day16_help\ready code) n copy core classes n utils

Write tester/s for the following

1. Display all student details from a list

2. Display all student details(list) sorted as per GPA 

3. Write a tester to print average of  gpa of students for the specified subject

4 Print name of specified subject  topper

5 Print no of  failures for the specified subject chosen  from user.
(gpa < 5 : failed case)

6. Display student details from the map , sorted as per student's roll no.

7. Display student details from the map , sorted as per student's gpa.

8. Print names  of first 3 specified subject  toppers.

9. Can a student have multiple hobbies ? YES !
Add AT LEAST  2 hobbies , in every Student details.
9.1 Display phone nos of all students.
Hint : map
9.2 Display hobbies of all students.
Hint : flatMap

# Day 18

NO new assignments !!!!!

1. Revise thoroughly , entire week's contents , with special focus on collection framework n I/O

Refer to today's sequence.txt

2. import day18.1 , to revise text file handling
3. import day18.2 , to revise bin file handling , using Data I/O streams
4. import day 8.3 , to go through serialization.
5. Do read "serialization_in_detail.txt" , at least till the part we have covered.
6. Spend time in practice . In case of any questions , do write to me , I will try to respond ASAP !

# Day 19 
1. Revise in a quick manner seriliazation n de-serial.
(eclipse projects : day19.1 , day19.2 , day19.3)

2. We will revise multi threading together n solve assignments later.


3. Create multi threaded java application --- having 3 threads
main , even , odd 

Create EvenPrinterTask , OddPrinterTask 

Accept from user (in main thread)-- start & end values.
Pass these values from main to child threads.

Even no printer thread  should print even nos within range, with small delay (sleep=200ms)
Odd no printer thread should print odd nos within range , with small delay (sleep=250ms)


Ensure no orphans.

Solve above using extends Threads first & then using  implements Runnable scenario.
(You can try business logic of threads in imperative style manner n later functional style)