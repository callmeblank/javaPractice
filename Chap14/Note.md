$ You can save an object’s state by serializing the object.
$ To serialize an object, you need an ObjectOutputStream (from the 
java.io package)
$ Streams are either connection streams or chain streams 
$ Connection streams can represent a connection to a source or 
destination, typically a file, network socket connection, or the 
console.
$ Chain streams cannot connect to a source or destination and must 
be chained to a connection (or other) stream.
$ To serialize an object to a file, make a FileOuputStream and chain it 
into an ObjectOutputStream.
$ To serialize an object, call writeObject(theObject) on the 
ObjectOutputStream. You do not need to call methods on the 
FileOutputStream.
$ To be serialized, an object must implement the Serializable interface. 
If a superclass of the class implements Serializable, the subclass will 
automatically be serializable even if it does not specifically declare 
implements Serializable.
$ When an object is serialized, its entire object graph is serialized. That 
means any objects referenced by the serialized object’s instance 
variables are serialized, and any objects referenced by those 
objects...and so on.
$ If any object in the graph is not serializable, an exception will be 
thrown at runtime, unless the instance variable referring to the object 
is skipped.
$ Mark an instance variable with the transient keyword if you want 
serialization to skip that variable. The variable will be restored as null 
(for object references) or default values (for primitives).
$ During deserialization, the class of all objects in the graph must be 
available to the JVM.
$ You read objects in (using readObject()) in the order in which they 
were originally written.
$ The return type of readObject() is type Object, so deserialized 
objects must be cast to their real type.
$ Static variables are not serialized! It doesn’t make sense to save 
a static variable value as part of a specific object’s state, since all 
objects of that type share only a single value—the one in the class.