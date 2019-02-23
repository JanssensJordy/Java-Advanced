package app;
public class VrouwTest{
    public static void testVrouw(Vrouw dame){
        System.out.println("Test van de vrouw: " + dame.toString());

        System.out.println(dame.getName() + " zegt: " + dame.praat());

        System.out.println(dame.getName() + " vertelt ons: " + dame.tel());
    }
}