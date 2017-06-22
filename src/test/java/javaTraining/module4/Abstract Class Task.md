### Abstract Class Task

Now think about Animal class - basically, it is not something concrete as a Dog or a Cat.
It is an abstraction and there is no such thing as a concrete Animal in real world, hence Animal cannot be instantiated.

### What is the purpose of abstract classes?
http://tutorials.jenkov.com/java/abstract-classes.html
http://stackoverflow.com/questions/6007089/how-and-when-to-use-an-abstract-class#answer-33040904

Make Animal as **abstract** class.
- Now think which methods of Animal class can be abstract?
    * **Hint** - When an operation is performed in a different way, it is a good candidate for an abstract method (forcing subclasses to provide a custom implementation)
    * makeNoise() method is a good candidate to be abstract since different kinds of animals make noises differently.


### Takeaways:
- An Abstract Class is a class that provides common behavior across a set of subclasses, but is not itself designed to have instances of its own
- An abstract class is designed as a template for other classes to follow by dictating behavior that must be implemented by its subclasses
- An abstract class can extend a class, an abstract class or implement an interface
- An abstract class can implement one or many interfaces
- An abstract class can extend only one abstract class


- Abstract classes may or may not contain abstract methods, i.e., methods without body ( public void get(); )
- But, if a class has at least one abstract method, then the class must be declared abstract.
- If a class is declared abstract, it cannot be **instantiated**.
- To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.
- If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.
https://www.tutorialspoint.com/java/java_abstraction.htm


Pазница между абстрактным классом и интерфейсом

Абстрактный класс — это класс, у которого не реализован один или больше методов
Интерфейс — это абстрактный класс, у которого ни один метод не реализован, все они публичные и нет переменных класса.
Aбстрактный класс наследуется(etxends), а интерфейс реализуется (implements).
Hаследовать может только 1 класс, а реализовать сколько угодно.

Абстрактный класс может реализовывать методы, интерфейс не может реализовывать методы.

