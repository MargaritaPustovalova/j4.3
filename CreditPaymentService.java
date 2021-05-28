import static java.lang.Math.pow;

public class CreditPaymentService {
    public double calculate (long creditamount, int month, double persent) {
        double monthlypayment;
        monthlypayment = creditamount * (persent/100/12 + persent/100/12 / (pow((1 + persent/100/12),month)-1));
        System.out.println(monthlypayment);
        return monthlypayment;
    }

}
