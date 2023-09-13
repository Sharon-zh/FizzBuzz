public class Multiples {
    public static int main(Integer n, Integer a, Integer b){
        int i = 1;
        int num = 0;
        while (i < n) {
            if (i % a == 0 || i % b == 0) {
                num++;
            }
            i++;
        }
        return num;
    }
}

