package test;

import main.CustomerType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTypeTest {
    String inputInfo = "type: blabla, blala";

    @Test
    public void shouldReturnCorrectCustomerType() throws Exception {
        assertEquals("type", CustomerType.getCustomerType(inputInfo));
    }
}
