public class CreditPaymentService {
        public double calculate(double principal, double interestRate, int timeOfPayments) {
            double monthlyInterestRate = interestRate / 12;
            double monthlyPayment = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, timeOfPayments))
                    / (Math.pow(1 + monthlyInterestRate, timeOfPayments) - 1);
            return (int) monthlyPayment;
        }
    }
