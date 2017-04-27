package kg.obval.ov2;

/**
 * Created by kloop on 4/27/17.
 */

class Course {
    private double USDpok;
    private double USDprod;
    private double EURpok;
    private double EURprod;
    private double RUBpok;
    private double RUBprod;
    private double KZTpok;
    private double KZTprod;

    public Course() {
    }

    public Course(Double USDpok, Double USDprod, Double EURpok, Double EURprod, Double RUBpok, Double RUBprod, Double KZTpok, Double KZTprod) {
        this.USDpok = USDpok;
        this.USDprod = USDprod;
        this.EURpok = EURpok;
        this.EURprod = EURprod;
        this.RUBpok = RUBpok;
        this.RUBprod = RUBprod;
        this.KZTpok = KZTpok;
        this.KZTprod = KZTprod;
    }

    public Double getUSDpok() {
        return USDpok;
    }

    public Double getUSDprod() {
        return USDprod;
    }

    public Double getEURpok() {
        return EURpok;
    }

    public Double getEURprod() {
        return EURprod;
    }

    public Double getRUBpok() {
        return RUBpok;
    }

    public Double getRUBprod() {
        return RUBprod;
    }

    public Double getKZTpok() {
        return KZTpok;
    }

    public Double getKZTprod() {
        return KZTprod;
    }

    public void setUSDpok(Double USDpok) {
        this.USDpok = USDpok;
    }

    public void setUSDprod(Double USDprod) {
        this.USDprod = USDprod;
    }

    public void setEURpok(Double EURpok) {
        this.EURpok = EURpok;
    }

    public void setEURprod(Double EURprod) {
        this.EURprod = EURprod;
    }

    public void setRUBpok(Double RUBpok) {
        this.RUBpok = RUBpok;
    }

    public void setRUBprod(Double RUBprod) {
        this.RUBprod = RUBprod;
    }

    public void setKZTpok(Double KZTpok) {
        this.KZTpok = KZTpok;
    }

    public void setKZTprod(Double KZTprod) {
        this.KZTprod = KZTprod;
    }
}
