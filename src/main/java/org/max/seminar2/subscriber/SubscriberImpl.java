package org.max.seminar2.subscriber;

public class SubscriberImpl implements Subscriber {
    private final String name;

    public SubscriberImpl(String name) {
        this.name = name;
    }

    @Override
    public void getMessage(String news) {
        System.out.println("Подписчик "+name+" получил новость: "+ news);
    }
}
