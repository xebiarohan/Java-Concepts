# Java-Concepts
Core Java Concepts

### 1. Primitive types

            // 1. byte, value range from -128 to 127, 8-bit signed two's compliment integer
            byte  byteValue = -128;
            
            //2. short, value range from -32768 to 32767, 16-bit signed two's compliment integer
            short shortValue = 100;

            // int, value range from 2^32 to 2^32 -1 , 32-bit signed two's compliment integer
            int intValue = 1;

            //long, value range from 2^64 to 2^64-1, 64-bit signed two's compliment integer
            long longValue = 123123;

            //float, 32-bit floating point
            float floatValue = 1.1f;

            //double, 64-bit floating point, default for decimal values
            double doubleValue = 2.222222222221231231;

            //boolean , 1-bit, can have either true or false
            boolean booleanValue = true;

            //char is single 16-bit unicode Character
            char charValue = 'A';



### 2. Serialization


        Its a mechanism of writing the state of an object into byte code. It is mainly used
        in hibernate, JPA.

        The reverse operation of serialization is called deserialization in which byte-stream
        is converted into an object.

        It is independent of platform, means we can serialize an object in 1 platform and can
        deserialize it into another platform

        Use case : It is used when we want to send an object over a network

        Class must implement Serializable interface for serialization mechanism.

        Serializable is a marker interface

        ObjectOutputStream class is used to convert primitive types and Java Objects into byte-
        stream

        ObjectInputStream class is used to convert Byte-stream into primitive types and object

        If a parent class is implementing Serializable interface then then its child class
        automatically inherits those properties. no need to separately add serializable
        interface. (IS-A relationship).

        If a class has reference of other class then all the reference must be serializable
        otherwise NotSerializableException will come. (HAS-A relationship)

        Static members of the class will not be serialized because static is a part of class
        not object.

        In case of Array or collection, all the elements of those must be serializable.

        Externalizable interface provide mechanism to converting the state of the object
        into compact byte-stream

        Externalizable is not a marker interface. gives 2 method writeExternal and
        readExternal

        If we want to restrict any member from serialization process. we can do it using
        transient keyword. So on deserialization process it will give default value.

        The serialization process at runtime associates an id with each Serializable class
        which is known as SerialVersionUID. It is used to verify the sender and receiver of the
        serialized object.


### 3. Sorting Algorithms

        Selection sort : O(n^2)
        Bubble sort : O(n^2)
        Insertion sort : O(n^2)
        Quick sort : O(nlog(n))
        Merge sort : O(nlog(n))
        Heap sort : O(nlog(n))

### 4  Default values

        byte : 0
        short : 0
        int : 0
        long : 0
        float : 0.0f
        double : 0.0d
        String : null
        boolean : false


        All the objects have null as there default value like :

        Integer i;     // null as default
        Long l;
        Double d;
        Float f;
        Boolean bool;
        Short sh;
        Byte by;

### 5 SOLID principles

        Single Responsibility : A class should have a sigle responsibility and it should have
        only one reason to change.
            Advantage: Easy to test, better code readability,Lower coupling

        Open/Close principle : A class should be open for extension but closed for mmmodification

        Liskov substitution : If class A is a subtype of class B then we should be able to replace
            class B with class A without any disruption in the behaviour of the program.

        Interface segregation : Larger interfaces should be split into smaller ones. By doing so, we can
            ensure that implementing classes only need to be concerned about the methods that are of
            interest to them.

        Dependency Injection : The principle of Dependency Inversion refers to the decoupling of software
            modules. This way, instead of high-level modules depending on low-level modules, both will
            depend on abstractions.

        Reference : https://www.baeldung.com/solid-principles


### 6 Comparator and Comparable

        We can sort primitive type array using Arrays.sort() method eg :
           int[] intArr = {5,9,1,10};
           Arrays.sort(intArr);

        We can sort Wrapper class using compareTo methods.
            String str1 = "alpha";
            String str2 = "beta";

            int output = str1.compareTo(str2);  // value of output can be 1,0,-1

        For custom class we have to implement Comparable interface and implement compareTo
        method.

        If for some reason we want to sort our class on different properties then we use
        comparator. Its an functional interface. we can merge multiple sortings like :

            Comparator<Employee> comparing = Comparator
                            .comparing(Employee::getAge)
                            .thenComparing(Employee::getDepartment)
                            .reversed();

         Differences :

         Comparable interface can be used to provide single way of sorting whereas Comparator
         interface is used to provide different ways of sorting.
         For using Comparable, Class needs to implement it whereas for using Comparator we don’t
         need to make any change in the class.
         Comparable interface is in java.lang package whereas Comparator interface is present in
         java.util package.
         We don’t need to make any code changes at client side for using Comparable, Arrays.sort()
         or Collection.sort() methods automatically uses the compareTo() method of the class. For
         Comparator, client needs to provide the Comparator class to use in compare() method.


### 7 Design Patterns

        - Builder Pattern
            Used in POJO classes for easy object creation

        - Factory Pattern
            Its a creational pattern. In this we create object based on some condition
            and without exposing the creational logic to client

        - Strategy Pattern
            Its a behavioral design pattern
            In Strategy pattern, a class behavior or its algorithm can be changed at run time.

        Difference between Strategy and Factory
            Factory is creational design pattern, it is used to cleate a class object. based on
            input value we decides which object will get created. Strategy design pattern is a
            behaviour design pattern in which we decide algorithm at run time. We can use factory and
            strategy togather.

        - Singleton
            Singleton design pattern ensures that there will be only 1 instance of the class
            in the java virtual machine
            Ways to create Singleton class
                Eager loaded : it will create object on class initialization
                Static block initialization : similar to  eager loaded just object is initialized
                                               in static block for error handling
                Lazy initialization : It will create instance when first time we call method to
                                        get the instance.
                ThreadSafe initialization : initialization using syncronised keyword
                Enum class : Java enum ensures that enum value is instantiated only once in
                             a Java program

        - Template
            The Template Method pattern is known as a behavioural pattern. it is used to manage
            algorithm and relationship between objects.

        - Adapter
            Adapter pattern works as a bridge between two incompatible interfaces. This type of
            design pattern comes under structural pattern as this pattern combines the capability of
            two independent interfaces.

        - Prototype
            Its a creational design pattern. It is used when the creation of new object is a costly
            affair and time consuming and we already have a similar object.
            Prototype provide a mechanism to create a new object by copying from current object
            and then we can modify new object as per the requirement.

        - Abstract factory
            An abstract factory pattern is also called the Factory of Factories or Kit. In other words,
            this pattern has a super-factory that creates other factories This design pattern comes under
            the creational pattern.

### 8 Generics

        “Java Generics are a language feature that allows for definition and use of generic
         types and methods.”

         Generics add type safety at compile time.

         It helps to make Collection Object homogeneous

         Saves from ClassCastException

         Type Erasure : It means all the extra information added using generics will be removed
         at compile time during byte code generation. It is also required for backward compatibility.

        A class is Generic if it declares 1 or more type parameter like

                public class GenericClass<T,E> {
                    private T key;
                    private E value;
                }

        Here generic variables in class name is equal to the variables type parameter declared
        in class (T and E).

        Now we can use this class as
            GenericClass<Integer,Integer> integers = new GenericClass();
            GenericClass<String,Integer> strings = new GenericClass();

        Same rules apply for the interface as well

            public interface GenericInterface<T,E> {
                T  firstMethod();
                E  secondMethod();
            }

        We can define generic methods inside non-generic class and the scope of type variable is
        inside the method only.

             public <T,E> void genericMethod(T key,E value) {
                    System.out.println(key);
                    System.out.println(E);

                }

        Type parameter should be defined in front of return type of method if generic method is
        not a part of generic class.

        They can static as well as non-static methods

        Generic constructor follows the same rule as other methods.They can come inside Generic class
        or can be in any other class also.

            public class ClassWithGenericConstructor<T> {
                private T key;
                private T value;

                public ClassWithGenericConstructor(T key,T value) {
                    this.key = key;
                    this.value = value;
                }
            }


            public class ClassWithGenericConstructor {
                public <T> ClassWithGenericConstructor(T key,T value) {
                    System.out.println(key);
                }
            }

        Generics in Array :
        Array preserves their type information means it will throw error if we add different type
        of data into it and Generics use type erasure, which is contradictory So we cannot instantiate
        a generic array in Java

            public class GenericArray<T> {
                // this one is fine
                public T[] notYetInstantiatedArray;

                // causes compiler error; Cannot create a generic array of T
                public T[] array = new T[5];
            }

        WildCards in Generics
        WildCards defines unknown data types in Generics, Using it with super and extends is used
        to restrict the types used in Generic class like


            declarations :
            Collection<?> coll = new ArrayList<String>();
            List<? extends Number> list = new ArrayList<Long>();
            Pair<String,?> pair = new Pair<String,Integer>();


        WildCards are of 2 types bounded and unbounded

        Unbounded in which we can add any type like :
            Collection<?> coll = new ArrayList<String>();

        In bounded we restrict the type which we can use using extends and super.
            In extends we can use class which extends the given class like

                List<? extends Number> list = new ArrayList<Long>();

            here we can use any class which extends Number like Long,Integer,Double etc

            In super we can use classes which is a super class is given class

                 List<? super Integer> list = new ArrayList<Number>();
            here we can use any class which is a super class of Integer


        what is not allowed in Generics


        Static fields of type is not allowed
             private static T member; //This is not allowed

        Cant create instance of type parameter directly
            new  T();   // not allowed

        Not compatible with primitive types
            List<int> ids = new ArrayList<>();    //Not allowed

        Generic Exception class is not allowed
            public class GenericException<T> extends Exception {}

### 9 Early and late binding

        Binding is the association of method call to the method defination. It can happen at
        compile time as well as at run time.
        Late binding gave us the flexibility of  changing algorithm at run-time
        Example of early binding is simple method call, overloaded method, static, final methods
        Examples of  late binding is overriding(run time polymorphism)

### 10 Types of Reference in Java

    Strong reference :
        There object are not garbage collected as long as they are strongly reachable through a chain
        of strong references. Strong reference refers to the reference from stack to the actual object in
        heap.
            eg : StringBuilder builder = new StringBuilder();

    Weak reference :
        These objects will surely be garbage collected when ever the next garbage collector process runs.
            eg: WeakReference<StringBuilder> reference = new WeakReference<>(new StringBuilder());

    Soft reference :
        These objects will only be garbage collected when there is no more memory left. Java guarantees
        that all soft refence will garbage collectedd before it throws OutOfMemoryError exception.
            eg SoftReference<StringBuilder> reference = new SoftReference<>(new StringBuilder());

    Phantom reference :
        The referent is never accessible directly through the API and this is why we need a reference queue
         to work with this type of references.


### 11  super() and super

    Difference between super and super()
    super is used to call the parent class methods and variables like
        System.out.println(super.x);   // it will print value of x which is defined in super class
        super.method();
    for interface default variables and methods we need to add Interface name as well like :
        InterfaceName.super.variableName;
        InterfaceName.super.methodName();
     super() is used to call the parent class constructor. it is used in child class  constructor
     as a mandatory first line.
    You want to create a object of the current class, but there may be a couple of properties that
    the current class is acquiring from the parent class through inheritance for which we need to
    first have those values initialised and created in the parent class object and super() in this
    case does it for the current class by calling the constructor of the parent class.
    This makes sure that the current object creation is done consistently and which is why we need
    to have it as the first statement


### 12 instanceOf

  The java instanceof operator is used to test whether the object is an instance of the specified
  type (class or subclass or interface).

  instanceOf is mostly used for downcasting like :

            if(p instanceof B){
            B b=(B)p;      //Downcasting
            b.b();
            }

### 13 Equals and HashCode
  Java equals() and hashCode() methods are present in Object class. So every java class gets the
  default implementation of equals() and hashCode().

        public boolean equals(Object obj) {
                return (this == obj);
            }


        @HotSpotIntrinsicCandidate
        public native int hashCode();


  If two objects are equal according to equals() method, then their hash code must be same.

  If two objects are unequal according to equals() method, their hash code are not required to be different.

  Java hashCode() and equals() method are used in Hash table based implementations in java for storing and
  retrieving data

  Use same properties in both equals() and hashCode() method implementations, so that their contract doesn’t
  violate when any properties is updated.

          @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                EqualsAndHashCodeExample that = (EqualsAndHashCodeExample) o;
                return Objects.equals(firstName, that.firstName) &&
                        Objects.equals(lastName, that.lastName) &&
                        Objects.equals(age, that.age);
            }

            @Override
            public int hashCode() {

                return Objects.hash(firstName, lastName, age);
            }

  First identify the “Bucket” to use using the “key” hash code.
  If there are no objects present in the bucket with same hash code, then add the object for put operation and return null for get operation.
  If there are other objects in the bucket with same hash code, then “key” equals method comes into play.
  If equals() return true and it’s a put operation, then object value is overridden.
  If equals() return false and it’s a put operation, then new entry is added to the bucket.
  If equals() return true and it’s a get operation, then object value is returned.
  If equals() return false and it’s a get operation, then null is returned.


### 14. Does Java "pass-by-reference" or "pass-by-value"?

So the answer is Java is pass by value. But the question is which value and that depends

It depends upon the type of parameter like :

#### Primitive type variable
If we are passing the primitive type parameter like int,float,boolean etc. In this case parameter value
itself is passed 
example :

```java
    public static void main(String[] args) {
        int a =10;
        changePrimitiveType(a);
        System.out.println(a);   //10
        
    }   
     
     
    public static void changePrimitiveType(int num) {
        num = 20;
    }

```

So here the value of a will be 10. because we pass a value in changePrimitiveType method
not reference of a. So the change in other methods will not impact the original value.


#### Primitive type array

```java
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4};
        changeIntArrayValue(arr);   
        sysyem.out.println(arr[0]);  //20
    }
     
     public static void changeValue(int[] array) {
         array[0]=20;
    }
```

In case of array we pass reference value. So the array in main method and changeValue method is same.
Any change in one method will be reflected in other.

but there is a catch. If I change the array itself with new array like

```java
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4};
        changeIntArrayValue(arr);   
        sysyem.out.println(arr[0]);  //1
    }
    
    public static void changeValue(int[] arr) {
         arr = new int[3];
         arr[0] = 20;
    }
```

In this case the value of arr[0] will remain 1. Why ?

Because in changeMethod we created a new array which is pointing to some other memory location
and here arr object will work as a local variable. So it will not change value in main method.


#### Collections

Collection will work same as any other Object

```java
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        intList.add(1);
        changeList(intList);
        System.out.println(intList);  // [1,5]
    }
    
    public static void changeList(List<Integer> integers) {
        System.out.println(integers.size());
        integers.add(5);
    }

```

#### Custom class also works same as other Objects

```java
    public static void main(String[] args){
              Person person = new Person("Rohan");
              setNewName(person);
              System.out.println(person.getName());   //Vishu
      
              createNewName(person);
              person.getName();
              System.out.println(person.getName());   //Vishu
    }
    
    public static void setNewName(Person person) {
        Person p = person;
        p.setName("Vishu");
    }

    public static void createNewName(Person person) {
        person = new Person("Rohan");
    }

```

Here first it will print "Vishu" because Object in main and setNewName method are same (passing reference value).

Second time also it will print "Vishu" because in createNewName method we are creating new Person Object. So the person variable
is now becomes local variable in createNewName. It will not change person object in main method. So name remain same in
main method i.e. "Vishu".