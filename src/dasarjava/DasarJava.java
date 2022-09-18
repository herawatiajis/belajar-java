package dasarjava;
public class DasarJava {
    public static void main(String[] args) {
        // belajar tipe data variabel
        //Tipe data nonPrimitif
        String nama = "Herawati";
        System.out.println(nama);
        //Tipe data primitif
        char kelas = 'E';
        System.out.println(kelas);
        boolean perempuan = true;
        System.out.println(perempuan);
        //Tipe data bilangan bulat
        byte umur = 19;
        System.out.println(umur);
        short angkatan = 2021;
        System.out.println(angkatan);
        int uang_saku= 10_000;
        System.out.println(uang_saku);
        long saldo = 1000_000_000;
        System.out.println(saldo);
        float tb = 1.4f;
        System.out.println(tb);
        double bb = 52.5;
        System.out.println(bb);
        
        //operator aritmatika
        int nilai1,nilai2;
        nilai1 = 15;
        nilai2 = 5;
        System.out.println(nilai1 + nilai2);
        System.out.println(nilai1 - nilai2);
        System.out.println(nilai1 * nilai2);
        System.out.println(nilai1 / nilai2);
        System.out.println(nilai1 % nilai2);
        
        //operator perbandingan
        System.out.println(nilai1 == nilai2);
        System.out.println(nilai1 != nilai2);
        System.out.println(nilai1 > nilai2);
        System.out.println(nilai1 < nilai2);
        System.out.println(nilai1 >= nilai2);
        System.out.println(nilai1 <= nilai2);
        
        //operator assigment
        int hasil = 2;
        System.out.println(hasil);
        hasil += 3;
        System.out.println(hasil);
        hasil -= 3;
        System.out.println(hasil);
        hasil *= 3;
        System.out.println(hasil);
        hasil /= 3;
        System.out.println(hasil);
        hasil %= 3;
        System.out.println(hasil);
        
        //operator logika
        boolean index_nilai1 = true;
        boolean index_nilai2 = false;
        
        
        System.out.println(index_nilai1 && index_nilai2);
        System.out.println(index_nilai1 || index_nilai2);
        System.out.println(index_nilai1 | index_nilai2);
        
        
    }
    
}
