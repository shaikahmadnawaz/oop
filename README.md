# OOP

**Class** - The class is the template of an object.  
class - logical construct

**Object** - The object is an instance(physical thing) of a class.  
object - physical reality

- Objects are stored in the heap memory.
- Variables are stored in the stack memory.

**new** - Dynamically allocates memory at run time and return reference to it.

**constructor** - Special function, that runs when you create an object and it allocates some variables.

**this** - Refers to the current object in a method or constructor

**package** - A package in Java is used to group related classes. Think of it as a folder in a file directory. We use packages to avoid name conflicts, and to write a better maintainable code.

**static** - In static we'll create only one instance of that static member that's shared across all instances of the class.

- When a member is declared as static it can be acessed before any of the object of class is being created and without referencing to that object we can access the variables.
- static variables are independent on objects.
- A static method can access only a static data.
- You cannot use this keyword inside the static method.

**singleton** - a singleton class is a class that can have only one object (an instance of the class) at a time. After the first time, if we try to instantiate the Singleton class, the new variable also points to the first instance created.
