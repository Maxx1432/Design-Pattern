The Abstract Factory Design Pattern is a creational design pattern that provides an interface for creating 
families of related or dependent objects without specifying their concrete classes. 
It is useful when a system needs to be independent of how its objects are created, composed, and represented.


Abstract Factory Pattern Key Components

    AbstractFactory (Interface/Abstract Class)
        Declares an interface for creating abstract products.

    ConcreteFactory (Class)
        Implements the creation methods declared in the AbstractFactory.

    AbstractProduct (Interface/Abstract Class)
        Declares an interface for a type of product.

    ConcreteProduct (Class)
        Implements the AbstractProduct interface.

    Client (Class)
        Uses the AbstractFactory and AbstractProduct interface

                     <<interface>>
                   AbstractFactory
              +-----------------------+
              | + createProductA()    |
              | + createProductB()    |
              +-----------------------+
                        ▲
      -----------------------------------------
      |                                       |
+-------------------------+       +-------------------------+
|   ConcreteFactory1      |       |   ConcreteFactory2      |
| + createProductA()      |       | + createProductA()      |
| + createProductB()      |       | + createProductB()      |
+-------------------------+       +-------------------------+

             <<interface>>                       <<interface>>
           AbstractProductA                    AbstractProductB
              +----------------+               +----------------+
              |                |               |                |
              v                v               v                v
+------------------+   +------------------+  +------------------+  +------------------+
| ConcreteProductA1|   | ConcreteProductA2|  | ConcreteProductB1|  | ConcreteProductB2|
+------------------+   +------------------+  +------------------+  +------------------+

                              <<Client>>
                                |
                                | Uses AbstractFactory
                                | and AbstractProduct
                                v
                             ClientClass

Description of Diagram

    AbstractFactory (Interface):
        Declares factory methods like createProductA() and createProductB() for creating abstract products.

    ConcreteFactory1 / ConcreteFactory2 (Classes):
        Implement the AbstractFactory interface to create families of related products.
        ConcreteFactory1 creates ConcreteProductA1 and ConcreteProductB1.
        ConcreteFactory2 creates ConcreteProductA2 and ConcreteProductB2.

    AbstractProductA / AbstractProductB (Interfaces):
        Define the structure of product families.

    ConcreteProductA1, ConcreteProductA2, ConcreteProductB1, ConcreteProductB2 (Classes):
        Implement the corresponding abstract product interfaces.

    Client (Class):
        Uses the AbstractFactory and AbstractProduct interfaces to create and use products.
        The client code is decoupled from the concrete product and factory classes.