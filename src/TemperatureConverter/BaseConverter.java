package TemperatureConverter;

public interface BaseConverter {
    <T extends AbstractBaseConverter> AbstractBaseConverter convert(T baseConverter);
    AbstractBaseConverter warmUp(double temp);

}
