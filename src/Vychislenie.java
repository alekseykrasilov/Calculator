public class Vychislenie {
    public static int schetArab(int chislo1, int chislo2, String znak) throws Exception {
        int result = 0;
        switch (znak) {
            case "+":
                result = chislo1 + chislo2;
                break;
            case "-":
                result = chislo1 - chislo2;
                break;
            case "*":
                result = chislo1 * chislo2;
                break;
            case "/":
                result = chislo1 / chislo2;
                break;
            default:
                throw new Exception("Неправильный арифметический знак");
        }
        return result;
    }
}
