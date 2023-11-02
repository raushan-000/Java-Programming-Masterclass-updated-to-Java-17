package section_3_Basics1;

public class _20PrimitiveTypeChalllenge {
    public static void main(String[] args) {
        byte myByte = 112;
        short myShort = 30256;
        int myInt = 343535;
        long myLong = (50000L + (myByte + myShort + myInt) * 10L);
        System.out.println(myLong);
    }
}
