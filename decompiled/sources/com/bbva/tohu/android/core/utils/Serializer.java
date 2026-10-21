package com.bbva.tohu.android.core.utils;

import com.google.gson.Gson;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes6.dex */
public class Serializer {
    private final Gson gson;

    public Serializer(Gson gson) {
        this.gson = gson;
    }

    public static Serializer getInstance() {
        return new Serializer(new Gson());
    }

    public <T> T deserialize(String str, Class<T> cls) {
        return (T) this.gson.fromJson(str, (Class) cls);
    }

    public String serialize(Object obj) {
        return this.gson.toJson(obj);
    }

    public <T> T deserialize(String str, Type type) {
        return (T) this.gson.fromJson(str, type);
    }
}
