package com.fido.uaf.ver0100.types;

import com.google.gson.annotations.Expose;

/* JADX INFO: loaded from: classes9.dex */
public class ChannelBinding {

    @Expose
    public String cid_pubkey;

    @Expose
    public String serverEndPoint;

    @Expose
    public String tlsServerCertificate;

    @Expose
    public String tlsUnique;

    public ChannelBinding() {
        this.serverEndPoint = null;
        this.tlsUnique = null;
        this.tlsServerCertificate = null;
        this.cid_pubkey = null;
    }

    public ChannelBinding(String str, String str2) {
        this.serverEndPoint = str;
        this.tlsUnique = str2;
    }
}
