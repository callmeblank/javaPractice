-Instance variables live within the object they belong to, on
the Heap.
- If the instance variable is a reference to an object, both
the reference and the object it refers to are on the Heap.
- A constructor is the code that runs when you say new on
a class type.
- A constructor must have the same name as the class, and
must not have a return type.
- You can use a constructor to initialize the state (i.e. the
instance variables) of the object being constructed.
- If you don’t put a constructor in your class, the compiler
will put in a default constructor.
- The default constructor is always a no-arg constructor.
- If you put a constructor—any constructor—in your class,
the compiler will not build the default constructor.
- If you want a no-arg constructor, and you’ve already put
in a constructor with arguments, you’ll have to build the
no-arg constructor yourself.
- Always provide a no-arg constructor if you can, to make it
easy for programmers to make a working object. Supply
default values.
- Overloaded constructors means you have more than one
constructor in your class.
- Overloaded constructors must have different argument
lists.
- You cannot have two constructors with the same
argument lists. An argument list includes the order and/or
type of arguments.
- Instance variables are assigned a default value, even
when you don’t explicitly assign one. The default values
are 0/0.0/false for primitives, and null for references.