package com.google.gson;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes10.dex */
public interface JsonSerializer<T> {
    JsonElement serialize(T t10, Type type, JsonSerializationContext jsonSerializationContext);
}
