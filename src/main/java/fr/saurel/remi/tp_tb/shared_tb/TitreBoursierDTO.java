package fr.saurel.remi.tp_tb.shared_tb;

public class TitreBoursierDTO {

    private String mnemo;
    private String company;
    private float value;

    public TitreBoursierDTO(String mnemo, String company, float value) {
        this.mnemo = mnemo;
        this.company = company;
        this.value = value;
    }
    public String getMnemo() {
        return mnemo;
    }
    public void setMnemo(String mnemo) {
        this.mnemo = mnemo;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public float getValue() {
        return value;
    }
    public void setValue(float value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "TitreBoursier{" +
                "company='" + company + '\'' +
                ", valeur=" + value +
                '}';
    }
}
