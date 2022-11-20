package com.henrysoares.core.job;

import com.henrysoares.core.job.infrastructure.YamlPropertySourceFactory;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@ComponentScan
@EntityScan
@PropertySources({
        @PropertySource(
                value = "classpath:application-properties.yml",
                factory = YamlPropertySourceFactory.class
        )
})
public class ModuleLoader {
}
