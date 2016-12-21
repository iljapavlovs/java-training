
- (if not yet created) Create new class - a home for all kinds of animals. Name it for example as 'Zoo'.
-  Create a interface method in Washable interface class - wash(). Implement the interface by Animal class.
- Create a method (name it prepareAnimal()) which will invoke wash() method of a corresponding Animal depending on which kind of an Animal was provided to this method as a parameter.(HINT - parameteres should be set to interface type)
- Invoke prepareAnimal() from main method in a separate class by providing Lion and Elephant objects to the method.


What is the difference between **abstract classes** and **interfaces**?

*** Takeaways:
- An Interface defines a contract by specifying a set of method templates that an implementing class needs to follow
- An interface provides only a form for a class but no implementation
- An interface defines what a class can do but not how the class will do it

- A class implementing interfaces is required to override the inherited methods
- Interfaces are implemented using the 'implements' keyword
- Rules on implementing the interface methods
* Must have the same method signature and return type
* Cannot narrow the method accessibility
* Cannot specify broader checked exceptions
- Interface **variables** are implicitly public final static
- Interface **methods** are implicitly public abstract

from http://stackoverflow.com/questions/3528420/why-do-we-need-interfaces-in-java#answer-17163473:
An interface is a contract (or a protocol, or a common understanding) of what the classes can do.
When a class implements a certain interface,
it promises to provide implementation to all the abstract methods declared in the interface.
Interface defines a set of common behaviors.
The classes implement the interface agree to these behaviors and provide their own implementation to the behaviors.
This allows you to program at the interface,
instead of the actual implementation. One of the main usage of interface is provide a communication contract between two objects.
If you know a class implements an interface,
then you know that class contains concrete implementations of the methods declared in that interface, and you are guaranteed to be able to invoke these methods safely. In other words, two objects can communicate based on the contract defined in the interface, instead of their specific implementation.

Secondly, Java does not support multiple inheritance (whereas C++ does).
Multiple inheritance permits you to derive a subclass from more than one direct superclass.
This poses a problem if two direct superclasses have conflicting implementations. (Which one to follow in the subclass?).
However, multiple inheritance does have its place. Java does this by permitting you to "implements" more than one interfaces
(but you can only "extends" from a single superclass).
Since interfaces contain only abstract methods without actual implementation,
no conflict can arise among the multiple interfaces. (Interface can hold constants but is not recommended.
If a subclass implements two interfaces with conflicting constants, the compiler will flag out a compilation error.)