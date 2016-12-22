### Polymorphism Task

- Create new class  - a home for all kinds of animals(**Composition, HAS-A relationship**) . Name it for example as 'Zoo'.
- Create new method in Animal class - wash(). Just output 'Washing...' to console. Override it in child classes by adding what kind of animal is being washed. (**Overriding toString() method from Object class**)
- Create a method (name it prepareAnimal(...)) which will invoke wash() method of a corresponding Animal depending on which kind of an Animal was provided to this method as a parameter.(**Objects as Parameters**)
- Invoke prepareAnimal() from main method in a separate class by providing Lion and Elephant objects to the method.


### Takeaways:
- **Dynamic binding** means the JVM will decide at runtime which method implementation to invoke based on the class of the object.
- **Polymorphism** means you can use a variable of a superclass type to hold a reference to an object whose class is the superclass or any of its subclasses.
- Tne of the prime benefits of dynamic binding and polymorphism is that they can help make code easier to change.
If you have a fragment of code that uses a variable of a superclass type, such as Fruit, you could later create a brand new subclass, such as Banana,
and the old code fragment will work without change with instances of the new subclass.
If Banana overrides any of Fruit's methods that are invoked by the code fragment, dynamic binding will ensure that Banana's implementation of those methods gets executed.
This will be true even though class Banana didn't exist when the code fragment was written and compiled

### Reading:
- http://www.artima.com/objectsandjava/webuscript/PolymorphismInterfaces1.html



