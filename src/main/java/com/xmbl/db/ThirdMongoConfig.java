package com.xmbl.db;

import com.xmbl.config.AbstractMongoConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.MongoTemplate;

/**
 * Copyright © 2018 noseparte © BeiJing BoLuo Network Technology Co. Ltd.
 *
 * @Author Noseparte
 * @Compile 2018-08-12 -- 17:17
 * @Version 1.0
 * @Description         login
 */
@Configuration
@ConfigurationProperties(prefix = "spring.data.mongodb.third")
public class ThirdMongoConfig extends AbstractMongoConfig {

    @Bean(name="thirdMongoTemplate")
    public MongoTemplate getMongoTemplate() {
        return new MongoTemplate(mongoDbFactory());
    }

}




