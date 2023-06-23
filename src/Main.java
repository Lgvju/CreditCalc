//исходные данные - сумма кредита -principal - 1 млн рублей
///время займа кредита - 1, 2, 3 года
//процентная ставка - 9,9 %
//в качестве исходных взяты цифры из примера

public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        double principal1 = 1000000;
        double interestRate1 = 0.0999;
        int timeOfPayments1 = 12;
        double monthlyPayment1 = service.calculate(principal1, interestRate1, timeOfPayments1);
        System.out.println("Monthly payment 1: " + monthlyPayment1);

        double principal2 = 1000000;
        double interestRate2 = 0.0999;
        int timeOfPayments2 = 24;
        double monthlyPayment2 = service.calculate(principal2, interestRate2, timeOfPayments2);
        System.out.println("Monthly payment 2: " + monthlyPayment2);

        double principal3 = 1000000;
        double interestRate3 = 0.0999;
        int timeOfPayments3 = 36;
        double monthlyPayment3 = service.calculate(principal3, interestRate3, timeOfPayments3);
        System.out.println("Monthly payment 3: " + monthlyPayment3);
    }
}
