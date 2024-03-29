package ru.animals.configuration;


import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static ru.animals.model.RabbitQueue.*;

@Configuration
public class RabbitConfiguration {
    @Bean
    public MessageConverter jsonMessageConverter() {
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    public Queue textMessageUpdate   () {
        return new Queue(TEXT_MESSAGE_UPDATE);
    }

    @Bean
    public Queue docMessageUpdate() {
        return new Queue((DOC_MESSAGE_UPDATE));
    }

    @Bean
    public Queue photoMessageUpdate() {
        return new Queue(PHOTO_MESSAGE_UPDATE);
    }

    @Bean
    public Queue answerMessageQueue() {
        return new Queue(ANSWER_MESSAGE);
    }
}
