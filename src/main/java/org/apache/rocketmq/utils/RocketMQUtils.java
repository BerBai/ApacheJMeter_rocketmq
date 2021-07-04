package org.apache.rocketmq.utils;

import org.apache.rocketmq.client.producer.DefaultMQProducer;


public class RocketMQUtils {

    private String topic;
    private String tag;
    private DefaultMQProducer producer;

    public String getProducerGroup() {
        return producerGroup;
    }

    public void setProducerGroup(String producerGroup) {
        this.producerGroup = producerGroup;
    }

    private String producerGroup;

    public String getNameAddr() {
        return nameAddr;
    }

    public void setNameAddr(String nameAddr) {
        this.nameAddr = nameAddr;
    }

    private String nameAddr;


    public RocketMQUtils(String topic, String tag, DefaultMQProducer producer, String nameAddr, String producerGroup) {
        this.topic = topic;
        this.tag = tag;
        this.producer = producer;
        this.nameAddr = nameAddr;
        this.producerGroup = producerGroup;
    }

    public String getTopic() {
        return topic;
    }

    public String getTag() {
        return tag;
    }

    public DefaultMQProducer getProducer() {
        return producer;
    }
}
