package com.bumptech.glide.util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes9.dex */
public class MultiClassKey {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Class<?> f38920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class<?> f38921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class<?> f38922c;

    public MultiClassKey() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MultiClassKey multiClassKey = (MultiClassKey) obj;
        return this.f38920a.equals(multiClassKey.f38920a) && this.f38921b.equals(multiClassKey.f38921b) && Util.bothNullOrEqual(this.f38922c, multiClassKey.f38922c);
    }

    public int hashCode() {
        int iHashCode = (this.f38921b.hashCode() + (this.f38920a.hashCode() * 31)) * 31;
        Class<?> cls = this.f38922c;
        return iHashCode + (cls != null ? cls.hashCode() : 0);
    }

    public void set(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
        set(cls, cls2, null);
    }

    public String toString() {
        return "MultiClassKey{first=" + this.f38920a + ", second=" + this.f38921b + AbstractJsonLexerKt.END_OBJ;
    }

    public MultiClassKey(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
        set(cls, cls2);
    }

    public void set(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        this.f38920a = cls;
        this.f38921b = cls2;
        this.f38922c = cls3;
    }

    public MultiClassKey(@NonNull Class<?> cls, @NonNull Class<?> cls2, @Nullable Class<?> cls3) {
        set(cls, cls2, cls3);
    }
}
