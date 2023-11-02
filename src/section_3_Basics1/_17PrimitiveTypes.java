package section_3_Basics1;

public class _17PrimitiveTypes {
    public static void main(String[] args) {
        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        int myNumber = 2_345_34_72;
        System.out.println("Integer minimun value : " + myMinIntValue);
        System.out.println("Integer maximum value : " + myMaxIntValue);
        System.out.println("size of int : " + Integer.SIZE);
        System.out.println("Busted Integer minimun value : " + (myMinIntValue - 1));
        System.out.println("Busted Integer maximum value : " + (myMaxIntValue + 1));

        System.out.println(myNumber);

    }
}
