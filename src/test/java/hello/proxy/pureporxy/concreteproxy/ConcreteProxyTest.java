package hello.proxy.pureporxy.concreteproxy;

import hello.proxy.pureporxy.concreteproxy.code.ConcreteClient;
import hello.proxy.pureporxy.concreteproxy.code.ConcreteLogic;
import org.junit.jupiter.api.Test;

public class ConcreteProxyTest {

    @Test
    void noProxy() {
        ConcreteLogic concreteLogic = new ConcreteLogic();
        ConcreteClient client = new ConcreteClient(concreteLogic);
        client.execute();
    }
}
