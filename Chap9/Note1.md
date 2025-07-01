Java has two areas of memory we care about:
the Stack and the Heap.
- Instance variables are variables declared
inside a class but outside any method.
- Local variables are variables declared inside a
method or method parameter.
- All local variables live on the stack, in the
frame corresponding to the method where the
variables are declared.
- Object reference variables work just like primi-
tive variables—if the reference is declared as a
local variable, it goes on the stack.
- All objects live in the heap, regardless of
whether the reference is a local or instance
variable.