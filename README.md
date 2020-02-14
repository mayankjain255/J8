# J8
POC's for Java 8 features 

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

  ### Structural design Pattern
  
  #### Decorator
  Decorator pattern allows a user to add new functionality to an existing object without altering its structure. This pattern acts as a wrapper to existing class.
  
  #### Adapter 
  This pattern involves a single class which is responsible to join functionalities of independent or incompatible interfaces. A real life example could be a case of card reader which acts as an adapter between memory card and a laptop. You plugin the memory card into card reader and card reader into the laptop so that memory card can be read via laptop.
  
  #### Composition 
  Composition helps to implement has-a relationship in classes. We can use java inheritance or Object composition in java for code reuse.
  Composite pattern is used where we need to treat a group of objects in similar way as a single object. Composite pattern composes objects in term of a tree structure to represent part as well as whole hierarchy. This pattern creates a tree structure of group of objects.
  (Used in IXC with in form of CommonRequest POJO usage within other pojo's)
  *Reference*: https://www.journaldev.com/1325/composition-in-java-example
  
  #### Facade
  Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system.This pattern adds an interface to existing system to hide its complexities.
  (For e.g. Used in IXC wihthin filter and we hide complexity within applyFilter Method)
  
  #### Flyweight
  Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase  performance. This pattern provides ways to decrease object count thus improving the object structure of application.
  (For e.g. we used to cache metadata in IXC within maps of pojo wrt their unique ids)
  
  #### Proxy
  In proxy pattern, we create object having original object to interface its functionality to outer world.
  Usage example:
  Like an college's internet, which restricts few site access. The proxy first checks the host you are connecting to, if it is not part of restricted site list, then it connects to the real internet. This example is based on Protection proxies.
  *Reference*:https://www.geeksforgeeks.org/proxy-design-pattern/
  
