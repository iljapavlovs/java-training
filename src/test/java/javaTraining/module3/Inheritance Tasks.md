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