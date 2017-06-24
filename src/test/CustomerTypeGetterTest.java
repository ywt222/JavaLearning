package test;

import main.CustomerTypeGetter;
import main.model.CustomerType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTypeGetterTest {
    String inputInfo;
    CustomerTypeGetter customerTypeGetter;

    @Before
    public void setUp() throws Exception {
        inputInfo = "Regular: blabla, blala";
        customerTypeGetter = new CustomerTypeGetter(inputInfo);
    }

    @Test
    public void shouldReturnCorrectCustomerType() throws Exception {
        assertEquals(CustomerType.Regular, customerTypeGetter.getCustomerType());
    }
}
