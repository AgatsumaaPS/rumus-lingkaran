//Kelas Lingkaran
public class lingkaran {
    // Atribut
    private int radius;

    // Konstruktor
    public lingkaran(int radius) {
        this.radius = radius;
    }

    // Method untuk menghitung luas
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }

    // Metode untuk mendapatkan radius
    public int getRadius() {
        return radius;
    }

    // Class Utama
    public static void main(String[] args) {
        // Membuat objek Lingkaran
        lingkaran lingkaran = new lingkaran(10);

        // Menghitung Luas lingkaran
        double luas = lingkaran.hitungLuas();

        // Output
        System.out.println("Radius Lingkaran = " + lingkaran.getRadius() + " cm");
        System.out.println("Luas Lingkaran adalah = " + luas + " cm²");
    }
}