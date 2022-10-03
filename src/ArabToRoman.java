public class ArabToRoman {
    public static String arabToRoman(int num) {
        var keys = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        var vals = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder ret = new StringBuilder();
        int ind = 0;

        while (ind < keys.length) {
            while (num >= vals[ind]) {
                var d = num / vals[ind];
                num = num % vals[ind];
                for (int i = 0; i < d; i++)
                    ret.append(keys[ind]);
            }
            ind++;
        }
        System.out.println(ret.toString());
        return ret.toString();

    }
}
