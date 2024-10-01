import java.util.scanner;
public class tugas{ 
    public static void main(String[ ] args){
        
        int bilangan = 6;
        
        int hasil = 0;
        for(int i = 1; i <= bilangan; i++) {
            hasil += bilangan;
        }
        System.out.println("Hasil pangkat dua dari " + bilangan + " adalah " + hasil);

// 1. Analisis kompleksitas algoritma : pada program yang telah kita jalankan terbut menggunakan notasi big 0(n) 
// karena pada input dengan iterasi yang di lakukan oleh program adalah sama 
// 2. simulasi perhitungan data menghitung pangkat 6^2 iterasi = 1,2,3,4,5
//contoh : 
//      iterasi ke 1, hasil 0 + 6 = 6
//      iterasi ke 2, hasil 6 + 6 = 12
//      iterasi ke 3, hasil 12 + 6 = 18
//      iterasi ke 4, hasil 18 + 6 = 24
//      iterasi ke 5, hasil 24 + 6 = 30














    }
} 