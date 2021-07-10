import xyz.icexmoon.protect_proxy.PersonBean;
import xyz.icexmoon.protect_proxy.PersonBeanImpl;
import xyz.icexmoon.protect_proxy.PersonProxyFactory;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        PersonBeanImpl Lilei = new PersonBeanImpl();
        PersonBean LileiSelf = PersonProxyFactory.getOwnPersonProxy(Lilei);
        LileiSelf.setName("Li lei");
        LileiSelf.setGender("female");
        System.out.println(LileiSelf.getName());
        System.out.println(LileiSelf.getGender());
        // LileiSelf.setRating(10);
        PersonBean LileiOther = PersonProxyFactory.getOtherPersonProxy(Lilei);
        System.out.println(LileiOther.getName());
        System.out.println(LileiOther.getGender());
        LileiOther.setRating(10);
        System.out.println(LileiOther.getRating());
        System.out.println(LileiSelf.getRating());
        // LileiOther.setName("HanMeimei");
    }
}
