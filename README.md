# Design Patterns with kotlin

## what's design patterns?
#### design patterns are typical solutions to commonly occurring problems in software design.

## What's GOF ?
#### GOF stands for gang of four
#### Gang of four is four authors Erich Gamma, Richard Helm, Ralph Johnson and John Vlissides published a book titled Design Patterns - Elements of Reusable Object-Oriented Software which initiated the concept of Design Pattern in Software development.

## Types of Design Patterns 
1. [Creational Patterns](#p-idcreational-creational-patterns-p)  
2. [Structural Patterns](#p-idstructural-structural-patterns-p)
3. [Behavioral Patterns](#p-idbehavioral-behavioral-patterns-p) 
4. [J2EE Patterns](#p-idj2ee-j2ee-patterns-p) 
    
    

<img src="images/types_of_patterns.webp" alt="design patterns">


## <p id="creational"> Creational Patterns </p>

### Singleton Pattern 
is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

<img src="images/singleton-1.webp" alt="singleton pattern">

### Factory Method Pattern
a creational design pattern that provides an interface for creating objects in a superclass, but allows subclasses to alter the type of objects that will be created.

<img src="images/factory-method-1.webp" alt="factory method pattern">

### Abstract Factory Pattern
is a creational design pattern that lets you produce families of related objects without specifying their concrete classes.

<img src="images/abstract-factory.png" alt="abstract factory pattern">


### Builder Pattern
is a creational design pattern that lets you construct complex objects step by step. The pattern allows you to produce different types and representations of an object using the same construction code.

<img src="images/builder-pattern.webp" alt="abstract factory pattern">

**Director:**  _notifies the builder whenever a part of the product should be built, which can be perfectly done by the client_ 


## <p id="structural"> Structural Patterns </p>

### Proxy Pattern
a structural design pattern that lets you provide a substitute or placeholder for another object.

**Intent:** When we want to control access to an object.

<img src="images/proxy.png" alt="abstract factory pattern">


### Facade pattern

a structural design pattern that provides a simplified interface to a library, a framework, or any other complex set of classes.

<img src="images/facade.png" alt="abstract factory pattern">


### Flyweight pattern

is a structural design pattern that lets you fit more objects into the available amount of RAM by sharing common parts of state between multiple objects instead of keeping all of the data in each object.

**Intrinsic Attributes** : attributes which do not change
**Extrinsic Attributes** : attributes which change in each initialization

<img src="images/flyweight.png" alt="abstract factory pattern">

### Decorator pattern

is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.

<img src="images/decorator.png" alt="abstract factory pattern">

## <p id="behavioral"> Behavioral Patterns </p>

### Command pattern

a behavioral design pattern that allows encapsulating a request or an operation as an object.

<img src="images/command-pattern.png" alt="abstract factory pattern">

- <B>Benefits of Command Pattern:</B>
1. Decoupling: It decouples the sender of a request from the receiver, providing loose coupling between the two.
2. Undo/Redo Functionality: It facilitates implementing undo and redo functionalities by storing command history.
3. Flexibility and Extensibility: New commands can be added without changing existing client or receiver code.


### Memento pattern (Snapshot)

is a behavioral design pattern that lets you save and restore the previous state of an object without revealing the details of its implementation.

1. **Originator:**  The Originator class can produce snapshots of its own state, as well as restore its state from snapshots when needed. [Player class]
2. **Memento:**  The Memento is a value object that acts as a snapshot of the originator’s state. It’s a common practice to make the memento immutable and pass it the data only once, via the constructor [PlayerMemento class]
3. **CareTaker:**  The Caretaker knows not only “when” and “why” to capture the originator’s state, but also when the state should be restored.<Br>A caretaker can keep track of the originator’s history by storing a stack of mementos. When the originator has to travel back in history, the caretaker fetches the topmost memento from the stack and passes it to the originator’s restoration method.


### State Pattern

The State Design Pattern is a behavioral design pattern that allows an object to alter its behavior when its internal state changes. This pattern is useful when an object needs to change its behavior based on internal state changes without directly changing its class.


* **Context**: It's the class that contains the state and delegates state-specific requests to the state classes. The context object maintains a reference to the current state object.
* **State**: It's an interface or an abstract class that defines a set of methods that encapsulate the behavior associated with a particular state of the context.
* **Concrete** States: These are the classes that implement the State interface. Each concrete state provides its own implementation of the behavior associated with the context's state.

### Strategy Pattern

is a behavioral design pattern that lets you define a family of algorithms, put each of them into a separate class, and make their objects interchangeable at runtime.

<img src="images/strategy.png" alt="abstract factory pattern">

### Visitor Pattern

is a behavioral design pattern that allows adding new behaviors to existing class hierarchy without altering any existing code.

**Structure of the Visitor Pattern**:

1. **Visitor Interface:** Defines a visit method for each concrete element type.
2. **Concrete Visitor:** Implements the Visitor interface and defines the operations to be performed on each element type.
3. **Element Interface:** Defines an accept method that takes a visitor as an argument.
4. **Concrete Element:** Implements the Element interface and provides the accept method implementation.
5. **Object Structure:** A collection or structure of elements that can accept a visitor.

### Mediator Pattern

is a behavioral design pattern that defines an object that centralizes communication between various components or classes without them having direct references to each other. It promotes loose coupling by preventing classes from directly communicating with each other, instead, they communicate through a mediator.

**Mediator pattern components:**

1. **Mediator** is the interface that declares the sendMessage method for communication between colleagues.
2. **Colleague** is another interface that declares methods for sending and receiving messages.
3. **ConcreteMediator** is a concrete implementation of the mediator interface that maintains a list of colleagues and facilitates communication between them.
4. **ConcreteColleague** is a concrete implementation of the colleague interface. Each colleague registers with the mediator, and when a colleague sends a message, the mediator relays it to the other colleagues.

### Template Pattern

s a behavioral design pattern that defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.

**Components:**
1. **Abstract class:(super class)** defines the skeleton of an algorithm
2. **subclasses:** overrides algorithm methods 

_abstract class may contain **Template Method** Which execute algorithm's steps_ 

<img src="images/template.png" alt="abstract factory pattern">

## <p id="j2ee"> J2EE Patterns </p>

* **J2EE** stands for **J**ava **2** platform **E**nterprise **E**dition 
* Also known as Java Enterprise Edition **(JEE)**
* J2EE design patterns are built for the developing the Enterprise Web-based Applications.

**Examples**
1. DTO (Data Transfer Object) Pattern:
   * **Purpose:** Transfers data between systems, with no business logic.
   * **Example:** Using a DTO to transfer data between a web tier and an EJB tier in a multi-tiered J2EE application.
2. MVC (Model View Controller) Pattern:
   * **Purpose:** Separates an application into three main components: Model (business logic and data), View (user interface), and Controller (handles user input and updates the model).
   * **Example:** Implementing MVC in a J2EE web application, where Servlets or controllers manage the flow, JSPs handle the presentation, and EJBs or POJOs represent the model.
     Session Facade Pattern:
3. Session Facade
   * **Purpose:** Provides a simplified interface to a set of interfaces in a subsystem.
   * **Example:** A session facade is often used in EJBs to provide a high-level, coarse-grained interface to a set of fine-grained interfaces.

## Sources
* [Refactoring Guru](https://refactoring.guru/design-patterns)
* [TutorialsPoint](https://www.tutorialspoint.com/design_pattern/index.htm)
* [Java design patterns](https://java-design-patterns.com/patterns/)

## Books
* [Design Patterns: Elements of Reusable Object-Oriented Software](https://a.co/d/gJpPhQ5)
* [Head First Design Patterns: Building Extensible and Maintainable Object-Oriented Software](https://a.co/d/afJ9HJO)

