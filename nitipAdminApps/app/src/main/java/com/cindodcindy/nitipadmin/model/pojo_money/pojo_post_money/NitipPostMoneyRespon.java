
package com.cindodcindy.nitipadmin.model.pojo_money.pojo_post_money;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("jsonschema2pojo")
public class NitipPostMoneyRespon {

    @SerializedName("createdAt")
    @Expose
    private String createdAt;
    @SerializedName("updatedAt")
    @Expose
    private String updatedAt;
    @SerializedName("id")
    @Expose
    private long id;
    @SerializedName("anBrgArr")
    @Expose
    private String anBrgArr;
    @SerializedName("tglBrgArr")
    @Expose
    private String tglBrgArr;
    @SerializedName("locBrgArr")
    @Expose
    private String locBrgArr;
    @SerializedName("tanggalTransfer")
    @Expose
    private String tanggalTransfer;
    @SerializedName("dariBank")
    @Expose
    private String dariBank;
    @SerializedName("keBank")
    @Expose
    private String keBank;
    @SerializedName("anPenerima")
    @Expose
    private String anPenerima;
    @SerializedName("anPengirim")
    @Expose
    private String anPengirim;
    @SerializedName("jumlahUang")
    @Expose
    private String jumlahUang;
    @SerializedName("idSeller")
    @Expose
    private long idSeller;
    @SerializedName("idBuyer")
    @Expose
    private String idBuyer;
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
    public NitipPostMoneyRespon() {
    }

    /**
     * 
     * @param anBrgArr
     * @param namaPenerima
     * @param jenisBarang
     * @param anPengirim
     * @param locBrgArr
     * @param createdAt
     * @param tglBrgArr
     * @param namaPenjual
     * @param tanggalTransfer
     * @param idSeller
     * @param namaPembeli
     * @param kapasitasBarang
     * @param alamatPembeli
     * @param id
     * @param kapasitas
     * @param jamBerangkat
     * @param updatedAt
     * @param alamatPenerima
     * @param tanggalBerangkat
     * @param jamTiba
     * @param anPenerima
     * @param tujuan
     * @param jumlahUang
     * @param asal
     * @param hargaBagasi
     * @param dariBank
     * @param jenisBarangKirim
     * @param keBank
     * @param idBuyer
     * @param tanggalTiba
     */
    public NitipPostMoneyRespon(String createdAt, String updatedAt, long id, String anBrgArr, String tglBrgArr, String locBrgArr, String tanggalTransfer, String dariBank, String keBank, String anPenerima, String anPengirim, String jumlahUang, long idSeller, String idBuyer, String namaPembeli, String alamatPembeli, String alamatPenerima, String namaPenerima, String jenisBarangKirim, String kapasitasBarang, String namaPenjual, String asal, String tujuan, String tanggalBerangkat, String jamBerangkat, String tanggalTiba, String jamTiba, String kapasitas, String jenisBarang, String hargaBagasi) {
        super();
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.id = id;
        this.anBrgArr = anBrgArr;
        this.tglBrgArr = tglBrgArr;
        this.locBrgArr = locBrgArr;
        this.tanggalTransfer = tanggalTransfer;
        this.dariBank = dariBank;
        this.keBank = keBank;
        this.anPenerima = anPenerima;
        this.anPengirim = anPengirim;
        this.jumlahUang = jumlahUang;
        this.idSeller = idSeller;
        this.idBuyer = idBuyer;
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

    public String getAnBrgArr() {
        return anBrgArr;
    }

    public void setAnBrgArr(String anBrgArr) {
        this.anBrgArr = anBrgArr;
    }

    public String getTglBrgArr() {
        return tglBrgArr;
    }

    public void setTglBrgArr(String tglBrgArr) {
        this.tglBrgArr = tglBrgArr;
    }

    public String getLocBrgArr() {
        return locBrgArr;
    }

    public void setLocBrgArr(String locBrgArr) {
        this.locBrgArr = locBrgArr;
    }

    public String getTanggalTransfer() {
        return tanggalTransfer;
    }

    public void setTanggalTransfer(String tanggalTransfer) {
        this.tanggalTransfer = tanggalTransfer;
    }

    public String getDariBank() {
        return dariBank;
    }

    public void setDariBank(String dariBank) {
        this.dariBank = dariBank;
    }

    public String getKeBank() {
        return keBank;
    }

    public void setKeBank(String keBank) {
        this.keBank = keBank;
    }

    public String getAnPenerima() {
        return anPenerima;
    }

    public void setAnPenerima(String anPenerima) {
        this.anPenerima = anPenerima;
    }

    public String getAnPengirim() {
        return anPengirim;
    }

    public void setAnPengirim(String anPengirim) {
        this.anPengirim = anPengirim;
    }

    public String getJumlahUang() {
        return jumlahUang;
    }

    public void setJumlahUang(String jumlahUang) {
        this.jumlahUang = jumlahUang;
    }

    public long getIdSeller() {
        return idSeller;
    }

    public void setIdSeller(long idSeller) {
        this.idSeller = idSeller;
    }

    public String getIdBuyer() {
        return idBuyer;
    }

    public void setIdBuyer(String idBuyer) {
        this.idBuyer = idBuyer;
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
