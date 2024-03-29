package org.max.seminar2.provider;

import org.max.seminar2.subscriber.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class Pravda implements Newspaper{
    List<Subscriber> subscriberList = new ArrayList<>();
    @Override
    public void registredSubscrible(Subscriber subscriber) {
        subscriberList.add(subscriber);

    }

    @Override
    public void removeSubscrible(Subscriber subscriber) {
        subscriberList.remove(subscriber);

    }

    @Override
    public void repostNews(String news) {
        for (Subscriber sub:subscriberList) {
            sub.getMessage(news);
        }

    }
}
