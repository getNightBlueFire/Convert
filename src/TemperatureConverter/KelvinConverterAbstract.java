package TemperatureConverter;

public class KelvinConverterAbstract extends AbstractBaseConverter {
    @Override
    public <T extends AbstractBaseConverter> AbstractBaseConverter convert(T baseConverter) {
        double t = this.getTemperature();
        if (baseConverter instanceof FahrenheitConverterAbstract) {
            t = (t - 273.15) * 1.8 + 32;
        }
        if (baseConverter instanceof CelsiusConverterAbstract) {
            t = t - 273.15;
        }
        baseConverter.setTemperature(t);
        return baseConverter;
    }

    @Override
    public String name() {
        return " по Кельвину";
    }
}
