public class CalcPi {
    public static void main(String[] args) throws Exception {
        double n = 1.0;
        double EvenOdd = 1.0;
        double totalFruction = 0.0;
        int numOfTerms = Integer.parseInt(args[0]);

        for (int i = 0; i < numOfTerms; i++) {
            double fruction = EvenOdd/n;
            totalFruction += fruction; 
            n += 2;
            EvenOdd *= -1;
        }
		double pie = 4 * totalFruction;
		
		System.out.println("pi according to Java: " + Math.PI);
		System.out.println("pi, approximated:     " + pie);  
    }
}
// max int value is 2147483647:
// $ java CalcPi 2147483647
// pi according to Java: 3.141592653589793
// pi, approximated:     3.141592654053932