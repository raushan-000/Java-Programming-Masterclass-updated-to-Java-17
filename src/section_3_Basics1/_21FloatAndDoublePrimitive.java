package section_3_Basics1;

public class _21FloatAndDoublePrimitive {
    public static void main(String[] args) {
        float myMaxFloatValue = Float.MAX_VALUE;
        float myMinFloatValue = Float.MIN_VALUE;
        System.out.println("float minimum value : " + myMinFloatValue);
        System.out.println("float maximum value : " + myMaxFloatValue);
        System.out.println("float size : " + Float.SIZE);
        double myMaxDoubleValue = Double.MAX_VALUE;
        double myMinDoubleValue = Double.MIN_VALUE;
        System.out.println("Double minimum value : " + myMinDoubleValue);
        System.out.println("Double maximum value : " + myMaxDoubleValue);
        System.out.println("Double size : " + Double.SIZE);

        int myInt = 4;
        float myFloat = 6;
        float myFloat1 = 6.33f;
        double myDouble = 5;
        System.out.println(myInt);
        System.out.println(myFloat);
        System.out.println(myFloat1);
        System.out.println(myDouble);

    }
}
