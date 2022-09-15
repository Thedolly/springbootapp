package demo;

public class Doctor implements Staff {

    public String getQualificaion() {
        return qualificaion;
    }

    public void setQualificaion(String qualificaion) {
        this.qualificaion = qualificaion;
    }

    private String qualificaion;
    @Override
    public void assist() {
        System.out.println("doctor assist");
    }
}
