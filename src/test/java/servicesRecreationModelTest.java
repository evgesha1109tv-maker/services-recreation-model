import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class servicesRecreationModelTest {
    @Test
    void Test1(){
        servicesRecreationModel service = new servicesRecreationModel();
        // подготавливаем данные:
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);


    }
    @Test
    void Test2(){
        servicesRecreationModel service = new servicesRecreationModel();
        // подготавливаем данные:
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);


    }
}
