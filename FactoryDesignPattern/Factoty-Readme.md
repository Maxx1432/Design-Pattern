The Factory Design Pattern is a creational design pattern that provides an interface for creating objects
in a superclass but allows subclasses to alter the type of objects that will be created. 
This promotes loose coupling between client classes and the classes they instantiate.

Key Components:

    Product (Abstract Class/Interface)
    The interface or abstract class that defines the structure of the objects created by the factory.

    ConcreteProduct (Implementations)
    Classes that implement the Product interface or extend the abstract class. These are the actual objects being created.

    Creator (Abstract Class/Interface)
    Declares the factory method, which returns an object of type Product.

    ConcreteCreator (Factory Class)
    Implements the factory method to create specific types of ConcreteProduct.

                         <<interface>>
                         Product
                           |
          -------------------------------------
          |                                   |
    ConcreteProductA                    ConcreteProductB
          ^                                   ^
          |                                   |
       <<interface>>                     <<interface>>
         Creator
          |                                       |
       --------------------------------------------
       |                                          |
ConcreteCreatorA                        ConcreteCreatorB

Class & Interface Breakdown

    Product (Interface):
        Acts as the base interface for the objects that the factory creates.

    ConcreteProductA / ConcreteProductB (Classes):
        Implements the Product interface. These are the actual classes to be instantiated.

    Creator (Interface or Abstract Class):
        Declares the factory method. This interface provides a method to create products.

    ConcreteCreatorA / ConcreteCreatorB (Classes):
        Implements the factory method. These classes decide which concrete product to instantiate.