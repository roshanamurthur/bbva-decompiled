package com.bbva.sl.ar.android.secsdk.fido.model;

import ad.d;
import android.util.Base64;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class FidoAuthenticator {
    private static final int AAID_PROPERTIES_POS = 1;
    private String handle;
    private String name;
    private long timeStamp;

    public FidoAuthenticator(long j10, String str, String str2) {
        this.timeStamp = j10;
        this.name = str;
        this.handle = str2;
    }

    public String getAaid() {
        return (String) ((List) new Gson().fromJson(new String(Base64.decode(this.handle, 0)), new TypeToken<List<String>>() { // from class: com.bbva.sl.ar.android.secsdk.fido.model.FidoAuthenticator.1
        }.getType())).get(1);
    }

    public String getHandle() {
        return this.handle;
    }

    public String getName() {
        return this.name;
    }

    public long getTimeStamp() {
        return this.timeStamp;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FidoAuthenticator{timeStamp=");
        sb2.append(this.timeStamp);
        sb2.append(", name='");
        sb2.append(this.name);
        sb2.append("', handle='");
        return d.f(sb2, this.handle, "'}");
    }
}
