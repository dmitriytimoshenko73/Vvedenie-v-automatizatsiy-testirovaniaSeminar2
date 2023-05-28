package org.max.demo.pattern.proxy;

public interface IClass {

    public String sendGetRequest(Integer id);

    public Boolean sendPostRequest(String request);

    public Boolean sendPutRequest(String request, Integer id);

    public Boolean sendDeleteRequest(Integer id);


}
