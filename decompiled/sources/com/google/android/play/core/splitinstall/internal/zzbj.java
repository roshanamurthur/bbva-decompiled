package com.google.android.play.core.splitinstall.internal;

import java.lang.reflect.Field;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes10.dex */
public class zzbj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f46307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Field f46308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f46309c;

    public zzbj(Object obj, Field field, Class cls) {
        this.f46307a = obj;
        this.f46308b = field;
        this.f46309c = cls;
    }

    public final Object zzc() {
        Object obj = this.f46307a;
        Field field = this.f46308b;
        Class cls = this.f46309c;
        try {
            return cls.cast(field.get(obj));
        } catch (Exception e5) {
            throw new zzbl(String.format("Failed to get value of field %s of type %s on object of type %s", field.getName(), obj.getClass().getName(), cls.getName()), e5);
        }
    }

    public final Field zzd() {
        return this.f46308b;
    }

    public final void zze(Object obj) {
        Object obj2 = this.f46307a;
        Field field = this.f46308b;
        try {
            field.set(obj2, obj);
        } catch (Exception e5) {
            throw new zzbl(String.format("Failed to set value of field %s of type %s on object of type %s", field.getName(), obj2.getClass().getName(), this.f46309c.getName()), e5);
        }
    }
}
