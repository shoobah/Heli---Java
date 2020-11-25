public class natlog {
    public static void main(String [] args) {
        // set the start values
        double eNew = 1, eOld = 0;
        int factorial = 1, n = 1;
        // do the things in { } until the statement in the while(...) is false
        do {
            factorial *= n++; //multiply factorial with n then increase n by 1
            eOld = eNew; // store eNew value in eOld to use for comparison in the while statement below
            eNew = eOld + 1D / factorial; // calculate new value for eNew
            System.out.println(eNew);
        } while (Math.abs(eNew - eOld) > 1E-5); //check if the difference between the old and the new value is bigger than 0.00001. If it is do the loop again
    }
}
