- A method can throw an exception when something fails at runtime.
- An exception is always an object of type Exception. (Which, as you 
remember from the polymorphism chapters means the object is from a 
class that has Exception somewhere up its inheritance tree.) 
- The compiler does NOT pay attention to exceptions that are of 
type RuntimeException. A RuntimeException does not have to be 
declared or wrapped in a try/catch (although you’re free to do either or 
both of those things)
- All Exceptions the compiler cares about are called ‘checked 
exceptions’ which really means compiler-checked exceptions. Only 
RuntimeExceptions are excluded from compiler checking. All other 
exceptions must be acknowledged in your code, according to the 
rules.
- A method throws an exception with the keyword throw, followed by 
a new exception object:
 throw new NoCaffeineException();
- Methods that might throw a checked exception must announce it with 
a throws Exception declaration.
- If your code calls a checked-exception-throwing method, it must 
reassure the compiler that precautions have been taken. 
- If you’re prepared to handle the exception, wrap the call in a try/catch, 
and put your exception handling/recovery code in the catch block.
- If you’re not prepared to handle the exception, you can still make the 
compiler happy by officially ‘ducking’ the exception. We’ll talk about 
ducking a little later in this chapter.