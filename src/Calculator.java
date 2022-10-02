import java.util.List;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) throws Exception {
        int chislo1, chislo2;
        Scanner scanner = new Scanner(System.in);
        String primer = scanner.nextLine();
        String primer1 = primer.trim();
        String[] words = primer1.split(" ");
        String x = String.valueOf(words[0]);
        String znak = String.valueOf(words[1]);
        String z = String.valueOf(words[2]);

        if (words.length > 3) throw new Exception("Должна быть одна операнда и две переменных");

        List<String> rim = List.of("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X");
        List<String> arab = List.of("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
        if (arab.contains(x) && arab.contains(z)) {
            chislo1 = arab.indexOf(x);
            chislo2 = arab.indexOf(z);
            System.out.println(Vychislenie.OperArab(chislo1, chislo2, znak));

        } else if (rim.contains(x) && rim.contains(z)) {
            chislo1 = rim.indexOf(x) + 1;
            chislo2 = rim.indexOf(z) + 1;
            int a = Vychislenie.OperArab(chislo1, chislo2, znak);
            if (a > 0) {
                IntToRoman.IntToRoman(a);
            } else {
                throw new Exception("Только положительные числа для римских");
            }
        } else {
            throw new Exception("Неподходящие числа");
        }
    }
}




