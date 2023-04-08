package MainPackage.wrapperclass;



public class UtilityMethods {
    //UTILITY METHODS

    public static void main(String[] args) {
        int a=100;
     float f = Integer.valueOf(a); // TO CONVERT INT VALUE FLOAT DATA TYPE
        System.out.println(f);


        double d = Character.valueOf('a');//TO CONVERT CHAR VALUE INTO DOUBLE
        System.out.println(d);

        int i = Character.valueOf('a');//TO CONVERT CHAR VALUE INTO INT
        System.out.println(i);

        double s=Integer.valueOf(20);//Unnecessary boxing
        System.out.println(s);

        double s1 = Float.valueOf(10.0f);
        System.out.println(s1);

        float f1 = Character.valueOf('d');
        System.out.println(f1);

       long l6 = Integer.valueOf(13);
        System.out.println(l6);

        String a10 = "1025";
        int a11 = Integer.valueOf(a10);
        System.out.println(a11);

        //int k = Double.valueOf(10.5d); //Incompatible error Shown by compiler

    }
}
