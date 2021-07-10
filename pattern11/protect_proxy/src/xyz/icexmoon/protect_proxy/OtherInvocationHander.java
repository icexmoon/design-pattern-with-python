package xyz.icexmoon.protect_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class OtherInvocationHander implements InvocationHandler {
    private PersonBean personBean;

    public OtherInvocationHander(PersonBean personBean) {
        this.personBean = personBean;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if(method.getName().equals("setRating")){
            return method.invoke(personBean, args);
        }
        else if(method.getName().startsWith("get")){
            return method.invoke(personBean, args);
        }
        else{
            throw new IllegalAccessError();
        }
    }

}
