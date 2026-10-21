package com.noknok.android.client.appsdk.jsonapi;

import com.google.gson.annotations.Expose;

/* JADX INFO: loaded from: classes11.dex */
public class QuickAuthData {

    @Expose
    public final Algorithm algorithm = new Algorithm().setName("pbkdf2");

    @Expose
    public String challenge;

    @Expose
    public String clientTime;

    @Expose
    public Integer keyLength;

    @Expose
    public String saltSuffix;

    public static class Algorithm {

        @Expose
        public String iterations;

        @Expose
        public Integer minIterations;

        @Expose
        public String name;

        public Algorithm setName(String str) {
            this.name = str;
            return this;
        }
    }

    public boolean isNotEmpty() {
        return (this.saltSuffix == null && this.challenge == null) ? false : true;
    }
}
