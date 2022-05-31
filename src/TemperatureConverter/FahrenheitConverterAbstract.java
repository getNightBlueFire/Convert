package TemperatureConverter;

public class FahrenheitConverterAbstract extends AbstractBaseConverter {
    @Override
    public <T extends AbstractBaseConverter> AbstractBaseConverter convert(T baseConverter) {
        double t = this.getTemperature();

        if (baseConverter instanceof KelvinConverterAbstract) {
            t = (t - 32) / 1.8 + 273.15;
        }
        if (baseConverter instanceof CelsiusConverterAbstract) {
            t = (t - 32) / 1.8;
        }
        baseConverter.setTemperature(t);
        return baseConverter;
    }

    @Override
    public String name() {
        return " по Фаренгейту";
    }
}
