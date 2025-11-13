public class TimeCalc {
    public static void main(String[] args) {
        String time = args[0];
        int minutesToAdd = Integer.parseInt(args[1]);

        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));

        int totalMinutes = hours * 60 + minutes + minutesToAdd;

        int totalHours = totalMinutes / 60;
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);

        String printedH = "" + newHours;
        if (newHours < 10) { 
            printedH = "0" + newHours;
        }

        String printedM = "" + newMinutes;
        if (newMinutes < 10) {
            printedM = "0" + newMinutes;
        }

        System.out.println(printedH + ":" + printedM);

    }
}


// $ java TimeCalc 14:09 9
// 14:858