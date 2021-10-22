import java.math.BigDecimal;

public class zadanie5Biloivanov {
    public static void main(String[] args) {
        float netto = 9.99f;
        float VAT = netto * 23 / 100;
        float brutto = netto + VAT;
        BigDecimal bigDecimal_BRUTTO = new BigDecimal(brutto * 10000);
        BigDecimal bigDecimal_NETTO = new BigDecimal(netto * 10000);
        System.out.println("Price with VAT is " + bigDecimal_BRUTTO);
        System.out.println("Price without VAT is " + bigDecimal_NETTO);
        System.out.println("Difference is " + bigDecimal_BRUTTO.subtract(bigDecimal_NETTO));
    }
}
