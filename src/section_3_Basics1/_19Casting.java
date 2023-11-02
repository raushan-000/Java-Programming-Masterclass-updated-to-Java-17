package section_3_Basics1;

public class _19Casting {
    public static void main(String[] args) {
        short myMinShortValue = Short.MIN_VALUE;
        int myMinIntValue = Integer.MIN_VALUE;
        byte myMinByteValue = Byte.MIN_VALUE, myMaxByteValue = Byte.MAX_VALUE;
        System.out.println(myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMaxByteValue / 2);
        System.out.println(myNewByteValue);
        short myNewShortValue = (short) (myMinShortValue * 2);
        short myNewShortValue1 = (short) (myMinShortValue / 2);
        System.out.println(myNewShortValue);
        System.out.println(myNewShortValue1);
    }
}
