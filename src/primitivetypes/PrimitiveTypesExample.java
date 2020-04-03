package primitivetypes;

public class PrimitiveTypesExample {
    public static void main(String[] args) {

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

    }
}
