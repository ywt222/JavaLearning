package test;

import main.CustomerTypeGetter;
import main.model.CustomerType;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTypeGetterTest {
    String inputInfo = "Regular: blabla, blala";

    @Test
    public void shouldReturnCorrectCustomerType() throws Exception {
        assertEquals(CustomerType.Regular, CustomerTypeGetter.getCustomerType(inputInfo));
    }
}
