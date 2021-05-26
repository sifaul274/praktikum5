package praktikum5;
final class OperasiBilanganAbsCetak {
    private static void cetakSemua(OperasiBilanganAbs[]OB, double a, double b){
        OB[0] = new OperasiPenjumlahan();
        OB[1] = new OperasiPengurangan();
        OB[2] = new OperasiPerkalian();
        OB[3] = new OperasiPembagian();
        
        System.out.println(" - - - - - - - - - - -");
        System.out.println("| Angka Pertama\t: " + a + " |");
        System.out.println("| Angka Kedua\t: " + b + " |");
        System.out.println(" - - - - - - - - - - -");
        
        for (int i = 0; i < OB.length; i++) {
            OB[i].set_A(a);
            OB[i].set_B(b);
            OB[i].set_C();
            OB[i].tampil();
        }
    }
    public static void main(String[]args){
        OperasiBilanganAbs[] abs1 = new OperasiBilanganAbs[4];
        cetakSemua(abs1, 6.5, 0.5);
    }
}