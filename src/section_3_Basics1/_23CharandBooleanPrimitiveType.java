package section_3_Basics1;

public class _23CharandBooleanPrimitiveType {
    public static void main(String[] args) {

        System.out.println("char size is : " + Character.SIZE);
        char myChar = 'D';
        System.out.println(myChar);
        char myUnicode = '\u0044';
        System.out.println(myUnicode);
        char myDecimalCode = 68;
        System.out.println(myDecimalCode);
        System.out.println(myChar + myUnicode + myDecimalCode);
        char mySimpleChar = '?';
        System.out.println(mySimpleChar);
        char myUnicode1 = '\u003f';
        System.out.println(myUnicode1);
        char myDecimalCode1 = 63;
        System.out.println(myDecimalCode1);
        System.out.println(mySimpleChar + myUnicode1 + myDecimalCode1);

        // boolean
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue  = false;
        System.out.println(myTrueBooleanValue);
        System.out.println(myFalseBooleanValue);
    }
}
