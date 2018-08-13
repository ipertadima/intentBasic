package intent.intent.intent.intent;

import java.io.Serializable;

public class News implements Serializable {
    private String judul;
    private String deskripsi;
    private String kategori;
    private String tanggal;
    private String penulis;
    private String gambar;

    News() {

    }

    News(String judul, String deskripsi, String kategori, String tanggal, String penulis, String gambar) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.kategori = kategori;
        this.tanggal = tanggal;
        this.penulis = penulis;
        this.gambar = gambar;
    }

    public String getJudul() {
        return judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getKategori() {
        return kategori;
    }

    public String getTanggal() {
        return tanggal;
    }

    public String getPenulis() {
        return penulis;
    }

    public String getGambar() {
        return gambar;
    }
}
