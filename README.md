# Java-Concepts
Core Java Concepts

1. Primitive types

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



3. Serialization


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


3. Sorting Algorithms

        Selection sort : O(n^2)
        Bubble sort : O(n^2)
        Insertion sort : O(n^2)
        Quick sort : O(nlog(n))
        Merge sort : O(nlog(n))
        Heap sort : O(nlog(n))

4  Default values

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






