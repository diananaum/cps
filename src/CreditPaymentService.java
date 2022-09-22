public class CreditPaymentService {

    //Размер аннуитетного взноса A = K * S
    // А — ежемесячная плата; K — коэффициент аннуитета; S — сумма займа.

    //Коэффициент аннуитета вычисляется по формуле: K = i * (1 + i)n / ((1 + i)n - 1)
    //i — месячная процентная ставка (годовая ставка (y) / 1200),
    // n — количество месяцев, в течение которых выплачивается кредит

    public double calculate(double s, double y, double n) {

        double i = y / 1200;

        double a1 = 1 + i;
        double b1 = n;
        double v = Math.pow(a1, b1);

        double k = i * v / (v - 1);

        double a = k * s;
        return a;
    }
}
