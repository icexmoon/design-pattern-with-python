package xyz.icexmoon.protect_proxy;

import java.lang.reflect.Proxy;

public class PersonProxyFactory {
    public static PersonBean getOwnPersonProxy(PersonBean personBean) {
        ClassLoader loader = personBean.getClass().getClassLoader();
        Class<?>[] interfaces = personBean.getClass().getInterfaces();
        return (PersonBean) Proxy.newProxyInstance(loader, interfaces, new OwnInvocationHander(personBean));
    }

    public static PersonBean getOtherPersonProxy(PersonBean personBean){
        ClassLoader loader = personBean.getClass().getClassLoader();
        Class<?>[] interfaces = personBean.getClass().getInterfaces();
        return (PersonBean) Proxy.newProxyInstance(loader, interfaces, new OtherInvocationHander(personBean));
    }
}
