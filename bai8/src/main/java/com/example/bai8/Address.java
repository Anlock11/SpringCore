package com.example.bai8;

public class Address {
    private String coutry;
    private String provice;
    private String district;

    public Address(){

    }
    public Address(String coutry, String provice, String district) {
        this.coutry = coutry;
        this.provice = provice;
        this.district = district;
    }

    public String getCoutry() {
        return coutry;
    }

    public void setCoutry(String coutry) {
        this.coutry = coutry;
    }

    public String getProvice() {
        return provice;
    }

    public void setProvice(String provice) {
        this.provice = provice;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return
                "coutry: '" + coutry + '\'' +
                ", provice: '" + provice + '\'' +
                ", district: '" + district + '\''
               ;
    }
}
