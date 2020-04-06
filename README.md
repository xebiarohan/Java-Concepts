# Java-Concepts
Core Java Concepts





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






