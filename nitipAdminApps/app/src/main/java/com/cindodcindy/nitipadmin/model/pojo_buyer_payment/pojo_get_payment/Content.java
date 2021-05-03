
package com.cindodcindy.nitipadmin.model.pojo_buyer_payment.pojo_get_payment;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class Content {

    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("namaPengirimUang")
    @Expose
    private String namaPengirimUang;
    @SerializedName("bankPengirimUang")
    @Expose
    private String bankPengirimUang;
    @SerializedName("tanggalTransfer")
    @Expose
    private String tanggalTransfer;
    @SerializedName("uangSejumlah")
    @Expose
    private String uangSejumlah;
    @SerializedName("phonePenerimaBarang")
    @Expose
    private String phonePenerimaBarang;
    @SerializedName("phonePengirimBarang")
    @Expose
    private String phonePengirimBarang;
    @SerializedName("idBuyer")
    @Expose
    private long idBuyer;
    @SerializedName("idSeller")
    @Expose
    private long idSeller;
    @SerializedName("namaPenerimUang")
    @Expose
    private String namaPenerimUang;
    @SerializedName("noRekPenerimaUang")
    @Expose
    private String noRekPenerimaUang;
    @SerializedName("bankPenerimaUang")
    @Expose
    private String bankPenerimaUang;
    @SerializedName("jumlahTfPenerimaUang")
    @Expose
    private String jumlahTfPenerimaUang;
    @SerializedName("waktuPenerimaUang")
    @Expose
    private String waktuPenerimaUang;
    @SerializedName("namaPembeli")
    @Expose
    private String namaPembeli;
    @SerializedName("alamatPembeli")
    @Expose
    private String alamatPembeli;
    @SerializedName("alamatPenerima")
    @Expose
    private String alamatPenerima;
    @SerializedName("namaPenerima")
    @Expose
    private String namaPenerima;
    @SerializedName("jenisBarangKirim")
    @Expose
    private String jenisBarangKirim;
    @SerializedName("kapasitasBarang")
    @Expose
    private String kapasitasBarang;
    @SerializedName("namaPenjual")
    @Expose
    private String namaPenjual;
    @SerializedName("asal")
    @Expose
    private String asal;
    @SerializedName("tujuan")
    @Expose
    private String tujuan;
    @SerializedName("tanggalBerangkat")
    @Expose
    private String tanggalBerangkat;
    @SerializedName("jamBerangkat")
    @Expose
    private String jamBerangkat;
    @SerializedName("tanggalTiba")
    @Expose
    private String tanggalTiba;
    @SerializedName("jamTiba")
    @Expose
    private String jamTiba;
    @SerializedName("kapasitas")
    @Expose
    private String kapasitas;
    @SerializedName("jenisBarang")
    @Expose
    private String jenisBarang;
    @SerializedName("hargaBagasi")
    @Expose
    private String hargaBagasi;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Content() {
    }

    /**
     * 
     * @param namaPenerima
     * @param jenisBarang
     * @param uangSejumlah
     * @param waktuPenerimaUang
     * @param createdAt
     * @param namaPenjual
     * @param tanggalTransfer
     * @param idSeller
     * @param jumlahTfPenerimaUang
     * @param namaPembeli
     * @param kapasitasBarang
     * @param noRekPenerimaUang
     * @param alamatPembeli
     * @param id
     * @param kapasitas
     * @param jamBerangkat
     * @param phonePenerimaBarang
     * @param updatedAt
     * @param alamatPenerima
     * @param tanggalBerangkat
     * @param phonePengirimBarang
     * @param jamTiba
     * @param bankPengirimUang
     * @param tujuan
     * @param asal
     * @param hargaBagasi
     * @param bankPenerimaUang
     * @param jenisBarangKirim
     * @param idBuyer
     * @param namaPengirimUang
     * @param tanggalTiba
     * @param namaPenerimUang
     */
    public Content(String createdAt, String updatedAt, long id, String namaPengirimUang, String bankPengirimUang, String tanggalTransfer, String uangSejumlah, String phonePenerimaBarang, String phonePengirimBarang, long idBuyer, long idSeller, String namaPenerimUang, String noRekPenerimaUang, String bankPenerimaUang, String jumlahTfPenerimaUang, String waktuPenerimaUang, String namaPembeli, String alamatPembeli, String alamatPenerima, String namaPenerima, String jenisBarangKirim, String kapasitasBarang, String namaPenjual, String asal, String tujuan, String tanggalBerangkat, String jamBerangkat, String tanggalTiba, String jamTiba, String kapasitas, String jenisBarang, String hargaBagasi) {
        super();
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.id = id;
        this.namaPengirimUang = namaPengirimUang;
        this.bankPengirimUang = bankPengirimUang;
        this.tanggalTransfer = tanggalTransfer;
        this.uangSejumlah = uangSejumlah;
        this.phonePenerimaBarang = phonePenerimaBarang;
        this.phonePengirimBarang = phonePengirimBarang;
        this.idBuyer = idBuyer;
        this.idSeller = idSeller;
        this.namaPenerimUang = namaPenerimUang;
        this.noRekPenerimaUang = noRekPenerimaUang;
        this.bankPenerimaUang = bankPenerimaUang;
        this.jumlahTfPenerimaUang = jumlahTfPenerimaUang;
        this.waktuPenerimaUang = waktuPenerimaUang;
        this.namaPembeli = namaPembeli;
        this.alamatPembeli = alamatPembeli;
        this.alamatPenerima = alamatPenerima;
        this.namaPenerima = namaPenerima;
        this.jenisBarangKirim = jenisBarangKirim;
        this.kapasitasBarang = kapasitasBarang;
        this.namaPenjual = namaPenjual;
        this.asal = asal;
        this.tujuan = tujuan;
        this.tanggalBerangkat = tanggalBerangkat;
        this.jamBerangkat = jamBerangkat;
        this.tanggalTiba = tanggalTiba;
        this.jamTiba = jamTiba;
        this.kapasitas = kapasitas;
        this.jenisBarang = jenisBarang;
        this.hargaBagasi = hargaBagasi;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNamaPengirimUang() {
        return namaPengirimUang;
    }

    public void setNamaPengirimUang(String namaPengirimUang) {
        this.namaPengirimUang = namaPengirimUang;
    }

    public String getBankPengirimUang() {
        return bankPengirimUang;
    }

    public void setBankPengirimUang(String bankPengirimUang) {
        this.bankPengirimUang = bankPengirimUang;
    }

    public String getTanggalTransfer() {
        return tanggalTransfer;
    }

    public void setTanggalTransfer(String tanggalTransfer) {
        this.tanggalTransfer = tanggalTransfer;
    }

    public String getUangSejumlah() {
        return uangSejumlah;
    }

    public void setUangSejumlah(String uangSejumlah) {
        this.uangSejumlah = uangSejumlah;
    }

    public String getPhonePenerimaBarang() {
        return phonePenerimaBarang;
    }

    public void setPhonePenerimaBarang(String phonePenerimaBarang) {
        this.phonePenerimaBarang = phonePenerimaBarang;
    }

    public String getPhonePengirimBarang() {
        return phonePengirimBarang;
    }

    public void setPhonePengirimBarang(String phonePengirimBarang) {
        this.phonePengirimBarang = phonePengirimBarang;
    }

    public long getIdBuyer() {
        return idBuyer;
    }

    public void setIdBuyer(long idBuyer) {
        this.idBuyer = idBuyer;
    }

    public long getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(long idSeller) {
        this.idSeller = idSeller;
    }

    public String getNamaPenerimUang() {
        return namaPenerimUang;
    }

    public void setNamaPenerimUang(String namaPenerimUang) {
        this.namaPenerimUang = namaPenerimUang;
    }

    public String getNoRekPenerimaUang() {
        return noRekPenerimaUang;
    }

    public void setNoRekPenerimaUang(String noRekPenerimaUang) {
        this.noRekPenerimaUang = noRekPenerimaUang;
    }

    public String getBankPenerimaUang() {
        return bankPenerimaUang;
    }

    public void setBankPenerimaUang(String bankPenerimaUang) {
        this.bankPenerimaUang = bankPenerimaUang;
    }

    public String getJumlahTfPenerimaUang() {
        return jumlahTfPenerimaUang;
    }

    public void setJumlahTfPenerimaUang(String jumlahTfPenerimaUang) {
        this.jumlahTfPenerimaUang = jumlahTfPenerimaUang;
    }

    public String getWaktuPenerimaUang() {
        return waktuPenerimaUang;
    }

    public void setWaktuPenerimaUang(String waktuPenerimaUang) {
        this.waktuPenerimaUang = waktuPenerimaUang;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getAlamatPembeli() {
        return alamatPembeli;
    }

    public void setAlamatPembeli(String alamatPembeli) {
        this.alamatPembeli = alamatPembeli;
    }

    public String getAlamatPenerima() {
        return alamatPenerima;
    }

    public void setAlamatPenerima(String alamatPenerima) {
        this.alamatPenerima = alamatPenerima;
    }

    public String getNamaPenerima() {
        return namaPenerima;
    }

    public void setNamaPenerima(String namaPenerima) {
        this.namaPenerima = namaPenerima;
    }

    public String getJenisBarangKirim() {
        return jenisBarangKirim;
    }

    public void setJenisBarangKirim(String jenisBarangKirim) {
        this.jenisBarangKirim = jenisBarangKirim;
    }

    public String getKapasitasBarang() {
        return kapasitasBarang;
    }

    public void setKapasitasBarang(String kapasitasBarang) {
        this.kapasitasBarang = kapasitasBarang;
    }

    public String getNamaPenjual() {
        return namaPenjual;
    }

    public void setNamaPenjual(String namaPenjual) {
        this.namaPenjual = namaPenjual;
    }

    public String getAsal() {
        return asal;
    }

    public void setAsal(String asal) {
        this.asal = asal;
    }

    public String getTujuan() {
        return tujuan;
    }

    public void setTujuan(String tujuan) {
        this.tujuan = tujuan;
    }

    public String getTanggalBerangkat() {
        return tanggalBerangkat;
    }

    public void setTanggalBerangkat(String tanggalBerangkat) {
        this.tanggalBerangkat = tanggalBerangkat;
    }

    public String getJamBerangkat() {
        return jamBerangkat;
    }

    public void setJamBerangkat(String jamBerangkat) {
        this.jamBerangkat = jamBerangkat;
    }

    public String getTanggalTiba() {
        return tanggalTiba;
    }

    public void setTanggalTiba(String tanggalTiba) {
        this.tanggalTiba = tanggalTiba;
    }

    public String getJamTiba() {
        return jamTiba;
    }

    public void setJamTiba(String jamTiba) {
        this.jamTiba = jamTiba;
    }

    public String getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public String getHargaBagasi() {
        return hargaBagasi;
    }

    public void setHargaBagasi(String hargaBagasi) {
        this.hargaBagasi = hargaBagasi;
    }

}
