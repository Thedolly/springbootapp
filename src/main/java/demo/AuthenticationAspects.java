package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspects {

    @Pointcut("within(demo..*)")
    public void authenticatingPointCut(){
        System.out.println("authenticating");
    }
    @Pointcut("within(demo..*)")
    public void authorizationPointCut(){
        System.out.println("authorization");
    }
    @Before("authenticatingPointCut() && authorizationPointCut()")
    public void authenticate(){
        System.out.println("authentication the request");
    }

}
