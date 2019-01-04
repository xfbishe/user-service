package org.sd.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author 董文强
 * @version 1.0
 * @date 2018年12月18日
 */

@Component
@RabbitListener(queues = {"sss"})
public class IndexController {
    private static final Logger LOGGER = LoggerFactory.getLogger(IndexController.class);

    @Autowired
    AmqpTemplate amqpTemplate;

    @RabbitHandler
    public void mq(String hello){
      LOGGER.info("消息消费: {}",hello);
    }

}
