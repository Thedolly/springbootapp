package demo;

public class Doctor implements Staff {

    private  Nurse nurse;

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

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
