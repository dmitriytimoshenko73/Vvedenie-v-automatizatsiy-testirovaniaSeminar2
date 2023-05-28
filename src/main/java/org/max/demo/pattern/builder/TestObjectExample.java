package org.max.demo.pattern.builder;

import java.time.LocalDateTime;
import java.util.Random;

/**
 * Класс для демонстрации паттерна Строитель
 */
public class TestObjectExample {

    private String stringAttr;
    private Integer integerAttr;
    private Double doubleAttr;
    private Short shortAttr;
    private Boolean booleanAttr;
    private LocalDateTime localDateTimeAttr;
    private Random randomAttr;

    public TestObjectExample(String stringAttr, Integer integerAttr, Double doubleAttr, Short shortAttr, Boolean booleanAttr, LocalDateTime localDateTimeAttr, Random randomAttr) {
        this.stringAttr = stringAttr;
        this.integerAttr = integerAttr;
        this.doubleAttr = doubleAttr;
        this.shortAttr = shortAttr;
        this.booleanAttr = booleanAttr;
        this.localDateTimeAttr = localDateTimeAttr;
        this.randomAttr = randomAttr;
    }

    public String getStringAttr() {
        return stringAttr;
    }

    public void setStringAttr(String stringAttr) {
        this.stringAttr = stringAttr;
    }

    public Integer getIntegerAttr() {
        return integerAttr;
    }

    public void setIntegerAttr(Integer integerAttr) {
        this.integerAttr = integerAttr;
    }

    public Double getDoubleAttr() {
        return doubleAttr;
    }

    public void setDoubleAttr(Double doubleAttr) {
        this.doubleAttr = doubleAttr;
    }

    public Short getShortAttr() {
        return shortAttr;
    }

    public void setShortAttr(Short shortAttr) {
        this.shortAttr = shortAttr;
    }

    public Boolean getBooleanAttr() {
        return booleanAttr;
    }

    public void setBooleanAttr(Boolean booleanAttr) {
        this.booleanAttr = booleanAttr;
    }

    public LocalDateTime getLocalDateTimeAttr() {
        return localDateTimeAttr;
    }

    public void setLocalDateTimeAttr(LocalDateTime localDateTimeAttr) {
        this.localDateTimeAttr = localDateTimeAttr;
    }

    public Random getRandomAttr() {
        return randomAttr;
    }

    public void setRandomAttr(Random randomAttr) {
        this.randomAttr = randomAttr;
    }
}
