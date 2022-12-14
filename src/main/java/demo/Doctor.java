package demo;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {

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

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name aware");
    }
//    @PostConstruct
//    public void postConstruct(){
//        System.out.println("post construct method");
//    }
}
