

public class Interns  {

    private String ad;
    private String soyAd;
    private int kalanGun;
    public Interns(){
        this.ad="";
        this.soyAd="";
        this.kalanGun=0;
    }
    public Interns(String ad,String soyAd,int kalanGun){
        this.ad=ad;
        this.soyAd=soyAd;
        this.kalanGun=kalanGun;
    }

    public int getKalanGun() {
        return kalanGun;
    }

    public void setKalanGun(int kalanGun) {
        this.kalanGun = kalanGun;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyAd() {
        return soyAd;
    }

    public void setSoyAd(String soyAd) {
        this.soyAd = soyAd;
    }
}
