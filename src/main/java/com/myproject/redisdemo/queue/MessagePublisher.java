package com.myproject.redisdemo.queue;

public interface MessagePublisher {
    void publish(final String message);
}
