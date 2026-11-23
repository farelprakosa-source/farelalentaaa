public class uts {

    public static void main(String[] args) {
        int x = 50;
        int y = 10;

        int hasil1 = methodJumlah(x, y);
        int hasil2 = methodKurang(x, y);
        int hasil3 = methodKali(x, y);
        int hasil4 = methodBagi(x, y);

        System.out.println("Jumlah : " + hasil1 + "\nKurang : " + hasil2 + "\nKali : " + hasil3 + "\nBagi : " + hasil4);
    }

    public static int methodJumlah(int x, int y) {
        int jumlah = x + y;
        return jumlah;
    }
    
    public static int methodKurang(int x, int y) {
        int jumlah = x - y;
        return jumlah;
    }

    public static int methodKali(int x, int y) {
        int jumlah = x * y;
        return jumlah;
    }
    
    public static int methodBagi(int x, int y) {
        int jumlah = x / y;
        return jumlah;
    }
}