public class DataTypeInDepth {
    public static void main(String[] args) {
        /*
        data types are used to classify and define the type of data
        that a variable can hold

        there are 2 type of data types:

        1. primitive data types : pre defined, fixed size.
        2. Non - Primitive data types : customize and no fixed size.

         */

        byte maxHoldCapOfByte = 127; // greater number or smaller than 2^7-1 (+ -) will throw an error eg >128 (2^7 -1)
        byte minHoldCapOfByte = -128;

        short maxHoldCapOfShort = 32767;
        short minHoldCapOfShort = -32768;

        int maxHoldCapOfInt = -2147483648;
        int minHoldCapOfInt = 2147483647;

        long minHoldCapLong = -9223372036854775808L;
        long MaxHoldCapLong = 9223372036854775807L;


        float minHoldCapFloat = Float.MIN_VALUE;
        float maxHoldCapFloat = Float.MAX_VALUE;

        double minHoldCapDouble = Float.MIN_VALUE;
        double maxHoldCapDouble = Float.MAX_VALUE;

        // Question which s the first line to trigger a compiler error;

        double d1 = 5f;
        double d2 = 5.0;
        float f1 = 5f;
        //float f2 = 5.0; // this one is wrong

        //which of the following declarations does not compile?

        //double num1, int num2 =0; //This one is correct

//        int num1, num2;
//        int num1,num2 =0;
//        int num1 =0;num2=0;

        // Print all unicode java use unicode that has

        char ch = 257;

        System.out.println(ch);

//        for (char i = 0; i < 65535; i++) { // as per the char  range  65535 but unicode has lot more than that so lets print all those
//            System.out.print(i);
//
//            if(i%80 == 0) System.out.println();
//        }
        for (int i = 0; i < 155063; i++) {
            if(Character.isDefined(i)){
                System.out.print(Character.toChars(i));
                if(i%80 == 0) System.out.println();

            }
        }

    }
}
