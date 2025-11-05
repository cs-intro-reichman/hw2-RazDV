public class CalcPi {
    public static void main(String[] args) throws Exception {
        Double n = 1.0;
        Double EvenOdd = 1.0;
        Double totalFruction = 0.0;
        int numOfTerms = Integer.parseInt(args[0]);

        for (int i = 0; i < numOfTerms; i++) {
            Double fruction = EvenOdd/n;
            totalFruction += fruction; 
            double pie = 4 * totalFruction;
            n += 2;
            EvenOdd *= -1;
            if (i == numOfTerms - 1) {
                System.out.println("pi according to Java: " + Math.PI);
                System.out.println("pi, approximated:     " + pie);  
            }
        }
    }
}
