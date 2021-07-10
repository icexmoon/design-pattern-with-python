package xyz.icexmoon.protect_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OwnInvocationHander implements InvocationHandler{
    private PersonBean personBean;
    

    public OwnInvocationHander(PersonBean personBean) {
        this.personBean = personBean;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("setRating")){
            throw new IllegalAccessError();
        }
        else{
            return method.invoke(personBean, args);
        }
    }
    
}
