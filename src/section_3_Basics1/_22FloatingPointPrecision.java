package section_3_Basics1;

public class _22FloatingPointPrecision {
    public static void main(String[] args) {
        int myIntValue = 5 / 2;
        System.out.println(myIntValue);
        float myFloatValue = 5f / 2f;
        System.out.println(myFloatValue);
        double myDoubleValue = 5d / 2d;
        System.out.println(myDoubleValue);
        int myIntValue1 = 5 / 3;
        System.out.println(myIntValue1);
        float myFloatValue1 = 5f / 3f;
        System.out.println(myFloatValue1);
        double myDoubleValue1 = 5d / 3d;
        System.out.println(myDoubleValue1);
        double myDoubleValue2 = 5.00 / 3.00;
        System.out.println(myDoubleValue2);

        // convert given number of pounds to kilograms
        // 1 pounds = 0.45359237 kg

        double pounds = 200d;
        double poundToKg = pounds * 0.45359237d;
        System.out.println(poundToKg);
    }
}
