package org.max.seminar2;

import org.max.seminar2.provider.Newspaper;
import org.max.seminar2.provider.Pravda;
import org.max.seminar2.provider.Times;
import org.max.seminar2.subscriber.Subscriber;
import org.max.seminar2.subscriber.SubscriberImpl;

public class Main {
    public static void main(String[] args) {
        Newspaper pravda = new Pravda();
        Newspaper times = new Times();

        Subscriber ivan = new SubscriberImpl("ivan");
        Subscriber maria = new SubscriberImpl("maria");
        pravda.registredSubscrible(ivan);
        pravda.registredSubscrible(maria);
        times.registredSubscrible(ivan);
        pravda.repostNews("Идет снег");
        times.repostNews("Доллар растет");
        pravda.removeSubscrible(ivan);
        pravda.repostNews("Наступила весна");
        times.repostNews("Стейки дорожают");


    }
}
