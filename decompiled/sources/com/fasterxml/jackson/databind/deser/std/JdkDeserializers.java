package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.databind.JsonDeserializer;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes9.dex */
public class JdkDeserializers {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet<String> f43255a = new HashSet<>();

    static {
        Class[] clsArr = {UUID.class, AtomicBoolean.class, StackTraceElement.class, ByteBuffer.class, Void.class};
        for (int i10 = 0; i10 < 5; i10++) {
            f43255a.add(clsArr[i10].getName());
        }
        for (Class<?> cls : FromStringDeserializer.types()) {
            f43255a.add(cls.getName());
        }
    }

    public static JsonDeserializer<?> find(Class<?> cls, String str) {
        if (!f43255a.contains(str)) {
            return null;
        }
        FromStringDeserializer.Std stdFindDeserializer = FromStringDeserializer.findDeserializer(cls);
        if (stdFindDeserializer != null) {
            return stdFindDeserializer;
        }
        if (cls == UUID.class) {
            return new UUIDDeserializer();
        }
        if (cls == StackTraceElement.class) {
            return new StackTraceElementDeserializer();
        }
        if (cls == AtomicBoolean.class) {
            return new AtomicBooleanDeserializer();
        }
        if (cls == ByteBuffer.class) {
            return new ByteBufferDeserializer();
        }
        if (cls == Void.class) {
            return NullifyingDeserializer.instance;
        }
        return null;
    }
}
