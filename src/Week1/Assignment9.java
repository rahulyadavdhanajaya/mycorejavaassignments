package Week1;

public class Assignment9 {
    public static void main(String[] args) {
        int month=10;
        String monthString;
        switch (month){
            case 1:  monthString = "January";
                break;
            case 2:  monthString = "February";
                break;
            case 3:  monthString = "March";
                break;
            case 4:  monthString = "April";
                break;
            case 5:  monthString = "May";
                break;
            case 6:  monthString = "June";
                break;
            case 7:  monthString = "July";
                break;
            case 8:  monthString = "August";
                break;
            case 9:  monthString = "September";
                break;
            case 10: monthString = "October";
                break;
            case 11: monthString = "November";
                break;
            case 12: monthString = "December";
                break;
            default: monthString = "Invalid month";
                break;
        }
        System.out.println(monthString);
    }
}
//if (args.length == 0) {
  //      System.out.println("Please enter the month in numbers");
    //    System.exit(0);
      //  }
//
  //      int month = Integer.parseInt(args[0]);
    //    if (month < 1 || month > 12) {
      //  System.out.println("Invalid month");
        //System.exit(0);
    //    }

     //   String monthStr = Month.of(month).name();
    //    monthStr = monthStr.substring(0, 1).toUpperCase() + monthStr.substring(1).toLowerCase();
      //  System.out.println(monthStr);
