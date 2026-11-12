import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PriceCalculatorTest {

    private final PriceCalculator priceCalculator = new PriceCalculator();

    @Test
    public void shouldBeNegativeWhenBikeAndDistanceIs0Km() {
        // Исполнение
        Integer price = priceCalculator.calculatePrice(TransportType.BIKE, 0);

        // Проверка
        Assertions.assertTrue(price < 0);
    }

    @Test
    public void shouldReturn100ForBikeAndDistanceIs10Km() {
        // Исполнение
        Integer price = priceCalculator.calculatePrice(TransportType.BIKE, 10);

        // Проверка
        Assertions.assertEquals(Integer.valueOf(100), price);
    }

    @Test
    public void shouldBeNegativeWhenBikeAndDistanceIs21Km() {
        // Исполнение
        Integer price = priceCalculator.calculatePrice(TransportType.BIKE, 21);

        // Проверка
        Assertions.assertTrue(price < 0);
    }

    @Test
    public void shouldBeNegativeWhenCarAndDistanceIs0Km() {
        // Исполнение
        Integer price = priceCalculator.calculatePrice(TransportType.CAR, 0);

        // Проверка
        Assertions.assertTrue(price < 0);
    }

    @Test
    public void shouldBeNegativeWhenCarAndDistanceIs1001Km() {
        // Исполнение
        Integer price = priceCalculator.calculatePrice(TransportType.CAR, 1001);

        // Проверка
        Assertions.assertTrue(price < 0);
    }

    @Test
    public void shouldReturn100ForCarAndDistanceIs1000Km() {
        // Исполнение
        Integer price = priceCalculator.calculatePrice(TransportType.CAR, 1000);

        // Проверка
        Assertions.assertEquals(Integer.valueOf(7000), price);
    }

    @Test
    public void shouldBeNegativeWhenTruckAndDistanceIs0Km() {
        // Исполнение
        Integer price = priceCalculator.calculatePrice(TransportType.TRUCK, 0);

        // Проверка
        Assertions.assertTrue(price < 0);
    }

    @Test
    public void shouldReturn5000ForTruckAndDistanceIs1000Km() {
        // Исполнение
        Integer price = priceCalculator.calculatePrice(TransportType.TRUCK, 1000);

        // Проверка
        Assertions.assertEquals(Integer.valueOf(5000), price);
    }

    @Test
    public void shouldBeNullWhenDroneAndDistanceIs0Km() {
        // Исполнение
        Integer price = priceCalculator.calculatePrice(TransportType.DRONE, 0);

        // Проверка
        Assertions.assertNull(price);
    }
}
