
# <p style="text-align: center;"> TODA CURD👋</p>


<p align="center">
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
<a href="Spring Boot url" >
    <img alt="Spring Boot" src="https://img.shields.io/badge/Spring Boot-3.0.6-brightgreen.svg" />
</a>
</p>

---

<p align="left">
## * Frameworks and Language used


    1. Springboot framework
    2. core java
    3. lombok


*  Data flow

1. Controller
   * AddressController
   * BookController
* CourseController
  * LaptopController
* StudentController


    2. model
        * Address
        * Book
	* Course
        * Laptop
	* Student
 
    3. service
        * AddressService
        * BookService
	* CourseService
        * LaptopService
	* StudentService


    4. repository
        * IAddressRepo
        * IBookRepo
	* ICourseRepo
        * ILaptopRepo
	* IStudentRepo


## Data Flow
* Todo
    * todoId
    * name
    * isTodoDoneStatus
* Controller
    *  @GetMapping("todos")
    *  @GetMapping("Todo/done")
    *  @GetMapping("Todo/pending")
    *  @PostMapping("Todo")
    *  @PutMapping("todo/status/{id}/{status}")
    *  @DeleteMapping("todo/delete")

  
## Data Structure used in my project


    ArrayList


## Project Summary
In Spring Boot, mapping refers to the process of associating HTTP requests to specific methods in controller classes that handle those requests. These mappings are used to define the endpoints for RESTful APIs or web applications, enabling communication between clients (e.g., browsers, mobile apps) and the server.

