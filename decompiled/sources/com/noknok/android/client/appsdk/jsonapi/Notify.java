package com.noknok.android.client.appsdk.jsonapi;

import com.google.gson.annotations.Expose;

/* JADX INFO: loaded from: classes11.dex */
public class Notify {

    @Expose
    public NotificationID apns;

    @Expose
    public NotificationID gcm;

    @Expose
    public NotificationID hms;

    @Expose
    public int status;

    public static class NotificationID {

        @Expose
        public String id;

        @Expose
        public String senderID;
    }
}
