package demo;

import org.springframework.stereotype.Component;


public class Doctor implements Staff {

    private String qualification;

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public void assist() {
        System.out.println("doctor assist");
    }
}
