package org.max.demo.solid;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SingleResponsibilityTest {

    @Test
    void testSuperSensor() {
        //given
        SuperSensor sensor = new SuperSensor(10, 100);
        //when
        sensor.getSmokeSignal(150);
        sensor.getTemperatureSignal(15);
        //then
        Assertions.assertTrue(sensor.isAlarm());

    }

    @Test
    void testSensors() {
        //given
        ISensor sensorTemperature = new TemperatureSensor(100);
        ISensor sensorSmoke = new SmokeSensor(100, false);
        //when
        sensorTemperature.getSignal(3);
        sensorSmoke.getSignal(10);
        //then
        Assertions.assertFalse(sensorTemperature.isAlarm());
        Assertions.assertFalse(sensorSmoke.isAlarm());

    }
}
