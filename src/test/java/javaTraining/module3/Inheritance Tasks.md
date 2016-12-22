### Create more specialized classes of Animal - Lion and Elephant (**Inheritance, IS-A relationship, Order of Calling Constructors, 'Super' keyword**)
1. Override behaviour and fields from Super class (**Method Overriding**)
    1. Is it possible to override instance variables?
2. Provide interfaces for writing and reading class fields
3. Initialize Lion and Elephant objects and set all instance variables.
4. Invoke all behaviors

### 'Final' keyword
1. Add new behavior to Animal class and make it so that it won`t be possible to override it in subclasses (**‘final’ methods**)
    1. Purpose - class has a method implementation that should not be changed and it is critical to the consistent state of the object
2. Change Lion class so that it could not be subclassed (**final classes**)
3. Add new instance variable to Lion class and make it so that variable can only be initialized once and it won`t be possible to change the value afterwards(**final variables**)
4. Add a constant to Animal class


### Takeaways:
**Inheritance**
- Inheritance defines a hierarchical relationship among classes wherein one class shares the attributes and methods defined in one or more classes.
- A **superclass**/base class/parent class – the class from which the attributes and behavior are derived.
- A **subclass**/derived class/child class – a class that derives attributes and behavior from another class
- Inheritance is one of the language constructs that encourages the **re-use** of code by allowing the behavior of existing classes to be extended and specialized

**Method Overriding**
- Method Overriding allows a subclass to redefine methods of the same signature from the superclass.
- The key benefit of overriding is the ability to define/defer behavior specific to subclasses.
- An overridden method must have:
    * The same name
    * The same number of parameters and types
    * The same return type
- Which overridden method to call is based on the actual object type and decided at runtime.

- **'final'** member modifier - Declares a member as a constant and cannot be modified once declared


