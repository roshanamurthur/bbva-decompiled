package com.huawei.hms.feature.remote;

import android.os.IBinder;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes10.dex */
public class b<T> extends com.huawei.hms.feature.b.AbstractBinderC0221b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final T f50552e;

    private b(T t10) {
        this.f50552e = t10;
    }

    public static <T> com.huawei.hms.feature.b a(T t10) {
        return new b(t10);
    }

    public static <T> T b(com.huawei.hms.feature.b bVar) {
        if (bVar instanceof b) {
            return ((b) bVar).f50552e;
        }
        IBinder iBinderAsBinder = bVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        int i10 = 0;
        for (Field field : declaredFields) {
            if (!field.isSynthetic()) {
                i10++;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        if (declaredFields[0].isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        declaredFields[0].setAccessible(true);
        try {
            return (T) declaredFields[0].get(iBinderAsBinder);
        } catch (IllegalAccessException unused) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.");
        } catch (NullPointerException unused2) {
            throw new IllegalArgumentException("Binder object is null.");
        }
    }
}
