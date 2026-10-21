package com.fido.uaf.ver0100.message;

import com.google.gson.GsonBuilder;

/* JADX INFO: loaded from: classes9.dex */
public class UafJson {
    public Object fromJson(String str) {
        return new GsonBuilder().create().fromJson(str, (Class) getClass());
    }

    public String stringify() {
        return new GsonBuilder().create().toJson(this);
    }
}
