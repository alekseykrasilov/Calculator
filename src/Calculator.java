import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        int chislo1, chislo2;
        Scanner scanner = new Scanner(System.in);
        String primer = scanner.nextLine();
        String primerBezProbelov = primer.trim();
        String[] primerSort = primerBezProbelov.split(" ");
        String var1 = String.valueOf(primerSort[0]);
        String znak = String.valueOf(primerSort[1]);
        String var2 = String.valueOf(primerSort[2]);

        if (primerSort.length > 3) throw new Exception("Должна быть одна операнда и две переменных");

        List<String> rim = List.of("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");
        List<String> arab = List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10");

        if (arab.contains(var1) && arab.contains(var2)) {
            chislo1 = arab.indexOf(var1);
            chislo2 = arab.indexOf(var2);
            System.out.println(Vychislenie.schetArab(chislo1, chislo2, znak));
        } else if (rim.contains(var1) && rim.contains(var2)) {
            chislo1 = rim.indexOf(var1) + 1;
            chislo2 = rim.indexOf(var2) + 1;
            int a = Vychislenie.schetArab(chislo1, chislo2, znak);
            if (a > 0) {
                ArabToRoman.arabToRoman(a);
            } else {
                throw new Exception("Только положительные числа для римских");
            }
        } else if (arab.contains(var1) & (rim.contains(var2)) | (rim.contains(var1) & arab.contains(var2))) {
            throw new Exception("Либо только арабские, либо только римские");
        } else {
            throw new Exception("Неподходящие числа");
        }
    }
}





