package MainPackage.wrapperclass;

public class WrapperAutoAndUnBoxing {
    int a=100;
    Integer i =a; //WRAPPING OF VARIABLE INTO OBJECT i.e AUTOBOXING
    int b = i; // OBJECT IS CONVERT INTO VARIABLE i.e UNBOXING


    Character c1; /** class Character implements java.io.Serializable, Comparable<Character> **/
    Byte b1;  /** class Byte extends Number implements Comparable<Byte> **/
    Short s1;  /**  class Short extends Number implements Comparable<Short> **/
    Integer i1; /** class Integer extends Number implements Comparable<Integer> **/
    Long l1;  /** class Long extends Number implements Comparable<Integer> **/
    Float f1;  /** class Float extends Number implements Comparable<Integer> **/
    Double d1; /** class Double extends Number implements Comparable<Integer> **/
    Boolean b2; /**  class Boolean implements java.io.Serializable,
 Comparable<Boolean> **/
    /**class Number implements java.io.Serializable **/


    public static void main(String[] args) {
        WrapperAutoAndUnBoxing wab = new WrapperAutoAndUnBoxing();
        System.out.println(wab.i);
        System.out.println(wab.b);



    }
}
