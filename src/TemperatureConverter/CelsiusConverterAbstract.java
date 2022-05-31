package TemperatureConverter;

public final class CelsiusConverterAbstract extends AbstractBaseConverter {

    @Override
    public <T extends AbstractBaseConverter> AbstractBaseConverter convert(T baseConverter) {
        double t = this.getTemperature();
        if (baseConverter instanceof KelvinConverterAbstract) {
            t =  t + 273.15;
        }
        if (baseConverter instanceof FahrenheitConverterAbstract) {
            t = t * 1.8 + 32;
        }
        baseConverter.setTemperature(t);
        return baseConverter;
    }

    @Override
    public String name() {
        return " по Цельсию";
    }
}
