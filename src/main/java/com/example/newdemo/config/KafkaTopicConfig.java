package com.example.newdemo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
class KafkaTopicConfig {

    @Bean
    public NewTopic topic1() {
        return TopicBuilder.name("reflectoring-1").build();
    }

    @Bean
    public NewTopic topic2() {
        return TopicBuilder.name("reflectoring-2").build();
    }

    @Bean
    public NewTopic topic3() {
        return TopicBuilder.name("reflectoring-3").build();
    }

    @Bean
    public NewTopic topic4() {
        return TopicBuilder.name("reflectoring-4").build();
    }

    @Bean
    public NewTopic topic5() {
        return TopicBuilder.name("reflectoring-5").build();
    }
}
