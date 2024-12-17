The Builder Design Pattern is a creational design pattern that separates the construction of 
a complex object from its representation. 
It allows you to create different representations of an object using the same construction process.

Builder Design Pattern Key Components

    Product (Class):
        The complex object that needs to be built.

    Builder (Interface/Abstract Class):
        Declares the construction steps to build parts of the product.

    ConcreteBuilder (Class):
        Implements the Builder interface and defines specific steps to build the product.

    Director (Class):
        Controls the construction process by using the Builder interface.

    Client:
        Uses the Director and Builder to construct the object.


                               +-------------------+
                               |      Director     |
                               +-------------------+
                               | + construct()     |
                               +-------------------+
                                         |
                                         v
                             +-------------------+
                             |     <<interface>>  |
                             |       Builder      |
                             +-------------------+
                             | + buildPartA()    |
                             | + buildPartB()    |
                             | + getResult()     |
                             +-------------------+
                                         ▲
             -------------------------------------------------------
             |                                                     |
+-------------------------+                     +-------------------------+
|     ConcreteBuilder1    |                     |     ConcreteBuilder2    |
| + buildPartA()          |                     | + buildPartA()          |
| + buildPartB()          |                     | + buildPartB()          |
| + getResult()           |                     | + getResult()           |
+-------------------------+                     +-------------------------+
|                                         |
v                                         v
+-------------------+                   +-------------------+
|      Product1     |                   |      Product2     |
+-------------------+                   +-------------------+

                               <<Client>>
                                 |
                                 v
                              ClientClass

Explanation of Components

    Director:
        The class that constructs the product using the Builder interface. It directs the building process step by step.

    Builder (Interface):
        Specifies methods for creating parts of the product (buildPartA, buildPartB) and retrieving the result (getResult).

    ConcreteBuilder1 and ConcreteBuilder2:
        Implement the Builder interface to provide specific ways to construct and assemble parts of the product.

    Product1 and Product2:
        These are the objects being built. They are constructed step by step by the builders.

    Client:
        The client instructs the Director to use a specific ConcreteBuilder to construct the desired product.

Real-Life Analogy
Imagine building a house:

    Director: The construction supervisor who oversees the process.
    Builder: The blueprint defining the steps to build the house.
    ConcreteBuilder: Workers who follow the blueprint to build specific types of houses (e.g., wooden house, brick house).
    Product: The completed house.