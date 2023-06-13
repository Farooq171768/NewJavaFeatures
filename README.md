# NewJavaFeatures
Functional interfaces(SAM interfaces) and Lambda expressions:


SAM- Single Abstract Method  -> Multiple dafault methods and static methods are allowed in Interface
@FunctionalInteface- annotation does not allow to add more than one abstract methods in an interface.It is not 
	mandatory but required.Raise compilation error while writing multiple abstract methods
		Best example for functional interface is 'Runnable interface'

Functional interfaces are scattered in Java JDK but java.util.function package contains bunch of SAMs

Major benefits of functional interfaces is to use Lambda expressions to instantiate them.


Since functional interfaces have only one method, lambda expressions can easily provide the method implementation.
We just need to provide method arguments and business logic.

Anonymous class is bulkier than Lambda expression class and also an extra 'Class$' file is created in bin folder of workspace


The interface can also declare the abstract methos from 'java.lang.Object' class, but still the interface can be called as 
Functinal interface.

Once you add an abstract method to the interface(SAM Interface) even after annotating @FunctionalInterface, then the compiler/IDE will flag as an error.

Inteface can extend another interface and in case the interface it is extending a functional interface,it does not have any abstrct method, then it is also a functional interfce.
