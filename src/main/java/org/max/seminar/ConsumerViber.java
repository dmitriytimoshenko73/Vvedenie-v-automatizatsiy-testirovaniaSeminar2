package org.max.seminar;

public class ConsumerViber implements IConsumer{

    private boolean free = true;

    @Override
    public Status sendMessage(String str) {
        if(free){
            free = false;
            return Status.OK;
        }
        return Status.ERROR;
    }

    @Override
    public boolean isLineFree() {
        return free;
    }
}
