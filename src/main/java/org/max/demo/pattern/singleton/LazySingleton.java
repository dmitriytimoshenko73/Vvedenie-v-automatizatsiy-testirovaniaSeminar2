package org.max.demo.pattern.singleton;

/**
 * Ленивый метод инициализации
 * класс загружается во время работы приложения именно тогда, когда он нужен
 */
public class LazySingleton {

    private String url;
    private Integer port;
    private Boolean connect;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    private static LazySingleton INSTANCE = null;
    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (INSTANCE == null) {
            synchronized (LazySingleton.class) {
                INSTANCE = new LazySingleton();
            }
        }
        return INSTANCE;
    }

}
