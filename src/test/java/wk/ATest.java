package wk;

import java.io.IOException;

import org.apache.http.client.ClientProtocolException;
import org.junit.Test;

public class ATest {

    @Test
    public void getTest() throws ClientProtocolException, IOException {
        A a = new A();
        a.go();
    }
}