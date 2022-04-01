import Tests.CreateOrderTest;
import Tests.GetOrderTest;

public class OrderTestRunner {
    public static void main(String[] args) {
        GetOrderTest got = new GetOrderTest();
        got.testGetEmptyOrder();
        got.testGetInvalidOrder();
        got.testGetValidOrder();

        CreateOrderTest cot = new CreateOrderTest();
        cot.testCreateOrder();
    }
}
