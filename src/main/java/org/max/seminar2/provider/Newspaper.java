package org.max.seminar2.provider;

import org.max.seminar2.subscriber.Subscriber;

public interface Newspaper {
    void registredSubscrible(Subscriber subscriber);
    void removeSubscrible(Subscriber subscriber);
    void repostNews(String news);
}
