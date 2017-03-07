# java-training

## Training Plan



# Module 1
### 1. What is Java?
First and foremost I recommend starting learning Java programming language with

1. I-III chapters from "Head First Java" book
2. Java ["Getting Started"](https://docs.oracle.com/javase/tutorial/getStarted/index.html) tutorial from ORACLE
3. II-III chapters from ["Thinking in Java"](https://iamgodsom.files.wordpress.com/2014/08/java-the-complete-reference-7th-edition.pdf) book 
---

1. Main concepts
2. What is JVM and what`s the purpose
3. Compiled vs Interpreted languages
    * **Tasks**: 
        * illustrate example of running java code in JVM and explain
4. JDK vs JRE
    * **Tasks**: 
        * Whats the purpose of each of them?
5. Installation
6. Hello World example
    * **Tasks**: 
        * Writing and Running Hello World from command line
        * Writing and Running Hello World from IDE
7. Java Source File Structure
    * **Tasks**: 
        * List components of Java Source File

### 2. Language Basics
#### 1. Variables
  1. Declaration and Initialization (Variable Assignment);
      * The data type of the value being assigned must be compatible with the data type of the variable receiving the value
  2. Variable Scoping
   * Refers to portions or sections of a program where the variable has value and is said to be ‘visible’
    1. Types of variables by scope:
        - Class Variables
        - Instance Variables
        - Local Variables
3. Data Types
    - Primitive Data Types
    - Reference Data Types
4. Type Conversion
    - Implicit casting
    - Explicit Casting

Questions - What does "Strongly (static) Typed language" and "Loosely Typed Language" means?

##### 2. Arrays

##### 3. Operators

##### 4. Expressions, Statements, and Blocks

##### 5. Control Flow Statements
- The if-then and if-then-else Statements
- The switch Statement
- The while and do-while Statements
- The for Statement

#### 6. Branching Statements
- break
- continue
- return

#Module 2
### 3. Object-Oriented Programming Concepts
- What Is an Object?
- What Is a Class?
- What Is Inheritance?
- What Is an Interface?
- What Is a Package?

### 4. Classes and Objects
1. Classes
    1. Declaring Classes
    2. Declaring Member Variables
    3. Defining Methods
    4. Providing Constructors for Your Classes
    5. Passing Information to a Method or a Constructor
2. Objects
    1. Creating Objects
    2. Using Objects
    3. Using the this Keyword
    4. Controlling Access to Members of a Class
    5. Understanding Instance and Class Members
    6. Initializing Fields
    7. Nested Classes (Optional)
    8. Inner Class Example (Optional)
    9. Enum Types
    10. Annotations

#Module 3/4
### 5. Inheritance
1. Overriding and Hiding Methods and Fields
2. Using the Keyword `super`
3. Object as a Superclass (Dynamic binding, Polymorphism)
4. Writing Final Classes and Methods
5. Abstract Classes
6. Reference Casting
7. “Object” class
8. Composition (vs Inheritance)
    * http://www.javaworld.com/article/2076814/core-java/inheritance-versus-composition--which-one-should-you-choose-.html

#Module 3/4
### 6. Interfaces
1. Defining an Interface
2. Implementing an Interface
3. Using an Interface as a Type

---

### 7. Strings

### 8. Exceptions
1. What Is an Exception?
2. Catching and Handling Exceptions
3. The try...catch...finally Blocks
4. Specifying the Exceptions Thrown by a Method
5. How to Throw Exceptions
6. Chained Exceptions
7. Creating Exception Classes
8. Checked/Unchecked Exceptions

### 9. Collections
1. Interfaces and Implementations
2. Collection and Map Interface
3. Set Interface and implementation
4. List Interface and implementation
5. Queue Intreface and implementation
6. Ordering a collection
    - Collections.sort() 
    - implement Comparable interface
    - implement Comparator interface

### 10. Generics
1. Why use Generics?
    - https://www.youtube.com/watch?v=4Rpr7aeSzxA
    - https://www.youtube.com/watch?v=WPxcQtVWVKY
    - https://www.youtube.com/watch?v=rOBtgaXaba0 

### 11. Basic I/O
1. I/O Streams
2. Byte Streams
3. Character Streams
4. Buffered Streams
5. Scanning
6. Formatting
7. Data Streams
8. Object Streams
9. File I/O
10. File Objects

### Design Patterns
* Creational Patterns
* Structural Patterns
* Behavioral Patterns

### Platform
1. Command line arguments
2. Properties
3. Environment
4. System properties

### Database access
1. JDBC basics
2. Executing SQL

### Unit testing
1. Basics
2. JUnit
3. TestNg

### Build tools
1. Maven
    - http://stackoverflow.com/questions/16205778/what-are-maven-goals-and-phases-and-what-is-their-difference 

### Version Control Systems
1. Git
    - difference with SVN and other centralized CVS systems
    - actions:
        * initalizing a git repo
        * adding to tracking
        * cloning
        * commiting
        * pushing
        * pulling
        * merging
    - Branching Strategies
    - Handling conflicts 
    - Pull Requests

### Continuos Integration Process
 - http://slides.com/iljapavlovs/deck-4/fullscreen#/ 

### Web App basics
 - FE vs BE
    * https://developer.mozilla.org/en-US/docs/Learn/Server-side/First_steps/Introduction 
 - Web Server 
    * https://developer.mozilla.org/en-US/docs/Learn/Common_questions/What_is_a_web_server
    * https://developer.mozilla.org/en-US/docs/Learn/Getting_started_with_the_web/How_the_Web_works
    * https://www.youtube.com/watch?v=syuIHCMHQgc
 - Static vs Dynamic sites
    * https://developer.mozilla.org/en-US/docs/Learn/Server-side/First_steps/Client-Server_overview
### Serialization/Deserialization
 - JSON
    - https://www.youtube.com/watch?v=syuIHCMHQgc
 - XML
 
### Topics to read on
 - Networking
 - UML
 - Coding Standards
 - Clarity and Maintainability

### Misc
   * Bash scripting - https://cmdchallenge.com/ 
   * Books to read:
        * http://automation-remarks.com/knigi-aqa/index.html