package intent.intent.intent.intent;

import android.os.Parcel;
import android.os.Parcelable;

public class Berita implements Parcelable{
    private String judul;
    private String deskripsi;
    private String kategori;
    private String tanggal;
    private String penulis;
    private String gambar;

    Berita() {

    }

    Berita(String judul, String deskripsi, String kategori, String tanggal, String penulis, String gambar) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.kategori = kategori;
        this.tanggal = tanggal;
        this.penulis = penulis;
        this.gambar = gambar;
    }

    private Berita(Parcel in) {
        judul = in.readString();
        deskripsi = in.readString();
        kategori = in.readString();
        tanggal = in.readString();
        penulis = in.readString();
        gambar = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(judul);
        dest.writeString(deskripsi);
        dest.writeString(kategori);
        dest.writeString(tanggal);
        dest.writeString(penulis);
        dest.writeString(gambar);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Berita> CREATOR = new Creator<Berita>() {
        @Override
        public Berita createFromParcel(Parcel in) {
            return new Berita(in);
        }

        @Override
        public Berita[] newArray(int size) {
            return new Berita[size];
        }
    };

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
