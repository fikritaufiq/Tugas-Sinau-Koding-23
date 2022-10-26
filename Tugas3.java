import java.util.Scanner;

public class Tugas3 {
    private static Scanner sc = new Scanner(System.in);
    
    private static int input_menu;
    private static double luas, keliling;
    
    public static void main(String[] args) {
        System.out.println("===== Menghitung Luas dan Keliling ====");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Lingkaran");
        System.out.println("4. Segitiga Sama Kaki");
        System.out.println("5. Segitiga Siku-siku");
        
        System.out.print("- Masukkan angka = "); input_menu = sc.nextInt();
        
        switch (input_menu) {
        case 1:
            hitung_persegi();
            break;
        case 2:
            hitung_persegipjg();
            break;
        case 3:
            hitung_lingkaran();
            break;
        case 4:
            hitung_segitigakaki();
            break;

        default:
            System.out.println("Menu tidak ada");
            break;
        }
    }
    
    private static double hitung_tinggisegitiga(double sisi_miring, double sisi_alas)
    {
        double result = Math.sqrt(Math.pow(sisi_miring, 2) - Math.pow(sisi_alas, 2));
        return result;
    }
    
    private static void output_hasil(double luas, double keliling)
    {
        System.out.println("* Luas = "+luas);
        System.out.println("* Keliling = "+keliling);
        System.out.println("---------------------");
    }
        

    private static void hitung_persegi() {
        double panjang_sisi;
        
        System.out.println("\n\n---- 1. Persegi ----");
        System.out.print("- Panjang sisi = "); panjang_sisi = sc.nextDouble();
        
        luas = Math.pow(panjang_sisi, 2);
        keliling = 4 * panjang_sisi;
        
        output_hasil(luas, keliling);
        
    }
    
    private static void hitung_persegipjg() {
        double panjang, lebar;
        
        System.out.println("\n\n---- 2. Persegi Panjang ----");
        System.out.print("- Panjang = "); panjang = sc.nextDouble();
        System.out.print("- Lebar = "); lebar = sc.nextDouble();
        
        luas = panjang * lebar;
        keliling = (2 * panjang) + (2 * lebar);
        
        output_hasil(luas, keliling);
    }
    
    private static void hitung_lingkaran() {
        double jari_jari;
        
        System.out.println("\n\n---- 2. Lingkaran ----");
        System.out.print("- Jari-jari = "); jari_jari = sc.nextDouble();
        
        //jari_jari = hitung_lingkaran(panjang_sisi, 0.5 * panjang_sisi);        
        luas =  3.14 * jari_jari * jari_jari;
        keliling = 3.14 * jari_jari * 2;
        
        output_hasil(luas, keliling);
        
    }
    
    private static void hitung_segitigakaki() {
        double sisi_miring, sisi_alas, tinggi;
        
        System.out.println("\n\n---- 2. Segitiga Sama Kaki ----");
        System.out.print("- Panjang Sisi Miring = "); sisi_miring = sc.nextDouble();
        System.out.print("- Panjang Sisi Alas = "); sisi_alas = sc.nextDouble();
        
        tinggi = hitung_tinggisegitiga(sisi_miring, 0.5 * sisi_alas);
        luas = 0.5 * sisi_alas * tinggi;
        keliling = (2 * sisi_miring) + sisi_alas;
        
        output_hasil(luas, keliling);
    }

}