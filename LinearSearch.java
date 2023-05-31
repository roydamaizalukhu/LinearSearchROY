public class LinearSearch {
    public static void main(String[] args) {
        // Inisialisasi data mahasiswa
        String[] nim = {"1102021", "1102022", "1102023", "1102024", "1102025", "1102026"};
        String[] nama = {"Andri Hariadi", "Dewi Lestari", "Dewi Agustin", "Reni Indrayanti", "Toni Sukmawan", "Toni Gunawan"};
        String[] alamat = {"Bandung", "Surabaya", "Malang", "Malang", "Surabaya", "Bandung"};
        
        // Data yang dicari
        String search = "Toni";
        
        // Memanggil fungsi linearSearch untuk mencari data
        linearSearch(nim, nama, alamat, search);
    }
    
    public static void linearSearch(String[] nim, String[] nama, String[] alamat, String search) {
        boolean found = false;
        
        // Melakukan pencarian linear
        for (int i = 0; i < nama.length; i++) {
            if (nama[i].toLowerCase().contains(search.toLowerCase())) {
                found = true;
                System.out.println((i+1) + ". " + nim[i] + " – " + nama[i] + " – " + alamat[i] + " – Data nomor " + (i+1));
            }
        }
        
        // Jika tidak ditemukan
        if (!found) {
            System.out.println("Data yang Anda cari tidak ditemukan");
        }
    }
}
