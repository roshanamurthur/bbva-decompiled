package com.fido.uaf.ver0100.types;

import com.google.gson.annotations.Expose;

/* JADX INFO: loaded from: classes9.dex */
public class DeregisterAuthenticator {

    @Expose
    public String aaid;

    @Expose
    public String keyID;

    public DeregisterAuthenticator(String str, String str2) {
        this.aaid = str;
        this.keyID = str2;
    }
}
