# POCs 

### Java 8 features 

#### ForEach in Iterable interface

    ---Sample Code (i.e. With Anonymous Class)---:
    
		List<Integer> tempList = new ArrayList<Integer>();
    tempList.forEach(new Consumer<Integer>() {

			public void accept(Integer val) {
				System.out.println("ForEach anonymous class Value = " + val);
			}
		});
		
#### Java Streams
-- More to Explore (used Benchmarking + in IXC)

#### Java Time API
  It has always been hard to work with Date, Time and Time Zones in java. There was no standard approach or API in java for date and time in Java. One of the nice addition in Java 8 is the java.time package that will streamline the process of working with time in java.
  *Reference*: https://www.journaldev.com/2800/java-8-date-localdate-localdatetime-instant

#### Functional Interfaces and Lambda Expressions


#### Miscellaneous Points: 
#1  min(), max() and sum() methods in Integer, Long and Double wrapper classes.
#2  logicalAnd(), logicalOr() and logicalXor() methods in Boolean class.
#3  



## Design Patterns

  ### Structural design Patterns
  
  #### Decorator
  Decorator pattern allows a user to add new functionality to an existing object without altering its structure. This pattern acts as a wrapper to existing class.
  
  ##### Advantages of Decorator Design Pattern
  	We can have any number of decorators and also in any order.
	It extends functionality of object without affecting any other object.
  
  ##### Disadvantage of Decorator Design Pattern
	The main disadvantage of decorator design pattern is code maintainability because this pattern creates lots of similar decorators which are sometimes hard to maintain and distinguish.
  
  #### Adapter 
  This pattern involves a single class which is responsible to join functionalities of independent or incompatible interfaces. A real life example could be a case of card reader which acts as an adapter between memory card and a laptop. You plugin the memory card into card reader and card reader into the laptop so that memory card can be read via laptop.
  https://stackabuse.com/structural-design-patterns-in-java/#adapter
  
  ##### Advantages of Adapter Design Pattern
  	Helps achieve reusability and flexibility.
	It allows two or more previously incompatible objects to interact.
	
  ##### Disadvantages of Adapter Design Pattern
  	All requests are forwarded, so there is a slight increase in the overhead.
  
  #### Composition 
  Composition helps to implement has-a relationship in classes. We can use java inheritance or Object composition in java for code reuse.
  Composite pattern is used where we need to treat a group of objects in similar way as a single object. Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy. This pattern creates a tree structure of group of objects.
  (Used in IXC with in form of CommonRequest POJO usage within other pojo's)
  *Reference*: https://www.journaldev.com/1325/composition-in-java-example
  
  ##### Advantages of the Composition design pattern include:
	We can control the visibility of other object to client classes and reuse only what we need.

  ##### Disadvantages include:
	Due to tight coupling between classes, it will be hard to make changes in hierarchy Also there can be a case when there will some unnessary object creation .  
  
  #### Facade
  Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system.This pattern adds an interface to existing system to hide its complexities.
  (For e.g. Used in IXC wihthin filter and we hide complexity within applyFilter Method)
  
  ##### Advantages of the facade design pattern include:
	Simplifies the use of a complex library/collection of classes.
	Concentrates the code for that library/collection of classes into one point in your code.
	Reduces the coupling between your code and the library/collection of classes.

  ##### Disadvantages include:
	Adds a layer of indirection which may affect performance.
	May make your code base bigger.
	Developers will need to learn to use. For example, we may need documentation for libraries.
  
  #### Flyweight
  Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase  performance. This pattern provides ways to decrease object count thus improving the object structure of application.
  E.x. - Caching of metadata, Connection Pool, Thread pool
  (For e.g. we used to cache metadata in IXC within maps of pojo wrt their unique ids)
  
  ##### Advantages of Flyweight Design Pattern
	Reduce memory usage by sharing heavy objects.
	Improved data caching for higher response time.
	Increased performance due to a lesser number of heavy objects.
  ##### Drawbacks of Flyweight Design Pattern
	This makes garbage collection unfriendly solution, as per the implementation, shared objects may be not eligible for garbage collection.
	There will be a cost to keep objects in sync.
  
  #### Proxy
  In proxy pattern, we create object having original object to interface its functionality to outer world.
  Usage example:
  Like an college's internet, which restricts few site access. The proxy first checks the host you are connecting to, if it is not part of restricted site list, then it connects to the real internet. This example is based on Protection proxies.
  *Reference*:https://www.geeksforgeeks.org/proxy-design-pattern/
  
  ##### Advantages of Proxy Design Pattern
	One of the advantages of Proxy pattern is security.
	This pattern avoids duplication of objects which might be huge size and memory intensive. This in turn increases the performance of the application.
  ##### Drawbacks of Proxy Design Pattern
	This pattern introduces another layer of abstraction which sometimes may be an issue if the RealSubject code is accessed by some of the clients directly and some of them might access the Proxy classes. This might cause disparate behaviour.

  
  ### Creational Design Patterns
  
  #### Singleton
  This pattern involves a single class which is responsible to create an object while making sure that only single object gets created. This class provides a way to access its only object which can be accessed directly without need to instantiate the object of the class.
  *Reference*:https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
