import java.util.Scanner;
public class BOXING_UNBOXING_DEMO
{
    public static void main(String[] args)
    {
        // Primitive types
        int primitiveInt = 200;
        char primitiveChar = 'A';
        byte primitiveByte = 20;
        short primitiveShort = 300;
        long primitiveLong = 1000000L;
        float primitiveFloat = 10.7f;
        double primitiveDouble = 16.6;
        boolean primitiveBoolean = true;

        // Autoboxing: Converting primitives to wrapper objects
        Integer boxedInt = primitiveInt;
        Character boxedChar = primitiveChar;
        Byte boxedByte = primitiveByte;
        Short boxedShort = primitiveShort;
        Long boxedLong = primitiveLong;
        Float boxedFloat = primitiveFloat;
        Double boxedDouble = primitiveDouble;
        Boolean boxedBoolean = primitiveBoolean;

        System.out.println("Autoboxing:");
        System.out.println("The Boxed Integer is: " + boxedInt);
        System.out.println("The Boxed Character is: " + boxedChar);
        System.out.println("The Boxed Byte is: " + boxedByte);
        System.out.println("The Boxed Short is: " + boxedShort);
        System.out.println("The Boxed Long is: " + boxedLong);
        System.out.println("The Boxed Float is: " + boxedFloat);
        System.out.println("The Boxed Double is: " + boxedDouble);
        System.out.println("The Boxed Boolean is: " + boxedBoolean);

        // Unboxing: Converting wrapper objects back to primitives
        int unboxedInt = boxedInt;
        char unboxedChar = boxedChar;
        byte unboxedByte = boxedByte;
        short unboxedShort = boxedShort;
        long unboxedLong = boxedLong;
        float unboxedFloat = boxedFloat;
        double unboxedDouble = boxedDouble;
        boolean unboxedBoolean = boxedBoolean;

        System.out.println("\nUnboxing:");
        System.out.println("The Unboxed Integer is: " + unboxedInt);
        System.out.println("The Unboxed Character is: " + unboxedChar);
        System.out.println("The Unboxed Byte is: " + unboxedByte);
        System.out.println("The Unboxed Short is: " + unboxedShort);
        System.out.println("The Unboxed Long is: " + unboxedLong);
        System.out.println("The Unboxed Float is: " + unboxedFloat);
        System.out.println("The Unboxed Double is: " + unboxedDouble);
        System.out.println("The Unboxed Boolean is: " + unboxedBoolean);
    }
}
