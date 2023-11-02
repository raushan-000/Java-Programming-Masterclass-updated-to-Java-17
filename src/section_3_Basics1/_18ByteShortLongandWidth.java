package section_3_Basics1;

public class _18ByteShortLongandWidth {
    public static void main(String[] args) {
        System.out.println(
                "Byte value range ( " + Byte.MAX_VALUE + " to " + Byte.MIN_VALUE + ")" + " size : " + Byte.SIZE);
        System.out.println(
                "Short value range ( " + Short.MAX_VALUE + " to " + Short.MIN_VALUE + ")" + " size : " + Short.SIZE);
        System.out.println(
                "Long value range ( " + Long.MAX_VALUE + " to " + Long.MIN_VALUE + ")" + " size : " + Long.SIZE);
        System.out.println("A Long has width of " + Long.SIZE);

        long mylongValue = 2649281662186765186L; // use L in last to represent long data type
        // if we don't use L it will give error as integer value to large
        System.out.println(mylongValue);
    }
}
