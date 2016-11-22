package com.nanchen.ischool.eventbusdemo;

/**
 * @author nanchen
 * @fileName EventBusDemo
 * @packageName com.nanchen.ischool.eventbusdemo
 * @date 2016/11/22  15:42
 */

public class MessageEvent {
    private User mUser;

    public MessageEvent(User user) {
        mUser = user;
    }

    public User getUser() {
        return mUser;
    }

    public void setUser(User user) {
        mUser = user;
    }
}
