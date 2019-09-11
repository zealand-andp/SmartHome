public class Main {

    public static void main(String[] args) {
        Tandbørste patricksTandbørste = new Tandbørste();
               patricksTandbørste.start();
        if (patricksTandbørste.erStartet == true)
            System.out.println("PASS");
        else
            System.out.println("FAIL");

    }
}
