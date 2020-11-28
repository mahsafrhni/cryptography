public class Test {
    public static void main(String[] args) {
    }

    public static void EncryptAffineCipher(char x, int a, int b) {
        System.out.println(numToChar(((a * ChartoNum(x)) + b) % 26));
    }

    public static void EncryptShiftCipher(char a, int key) {
        System.out.println(numToChar((ChartoNum(a) + key) % 26));
    }

    public static int ChartoNum(char a) {  //a=0
        return a - 'A';
    }

    public static char numToChar(int a) {
        return (char) (a + 'A');
    }
}
