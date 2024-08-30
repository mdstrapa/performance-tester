public class App {

    public static void main(String[] args) {
        System.out.println("=======================");
        System.out.println("Test start ------------");
        long startTimestamp = System.currentTimeMillis();
        System.out.println();
        System.out.println("Start: " + startTimestamp);

        String myString = "a";

        for(int c = 0;c<900000;c++){
            myString = myString + "a";
        }

        long endTimestamp = System.currentTimeMillis();
        System.out.println("End:   " + endTimestamp);

        System.out.println("Total processing time: " + ((endTimestamp - startTimestamp)/1000) + " seconds");

        System.out.println();
        System.out.println("Test end --------------");
        System.out.println("=======================");
    }

}
