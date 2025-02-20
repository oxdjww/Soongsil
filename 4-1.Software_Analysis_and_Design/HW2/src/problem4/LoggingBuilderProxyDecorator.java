package problem4;

import problem1.LogLevel;
import problem1.SimpleLogger;
import problem2.factory.CarPartsFactory;
import problem3.Builder;
import problem3.Car;


/**
 * ==============BEGIN==============
 * Complete the below code that requires your implementation
 * If necessary, you can make your own methods or classes so that the corresponding tests are passed
 */
public class LoggingBuilderProxyDecorator extends BaseBuilderProxyDecorator {

    SimpleLogger logger = SimpleLogger.getInstance();

    public LoggingBuilderProxyDecorator(Builder builder, SimpleLogger logger) {
        super(builder);
    }

    public LoggingBuilderProxyDecorator(CarPartsFactory factory, SimpleLogger logger) {
        super(factory);
    }

    @Override
    public Car getCar() {
        logger.log(LogLevel.INFO, "Building a car is completed!");
        return super.getCar();
    }
}
/**
 * ===============END===============
 */
