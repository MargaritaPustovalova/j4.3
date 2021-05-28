public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        long creditamount = 1000000;
        int month = 12;
        double percent = 9.99;
        double monthlypayment = service.calculate(creditamount, month, percent);
        System.out.println(monthlypayment);
    }
}