package com.google.firebase.encoders;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class FieldDescriptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f48360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map<Class<?>, Object> f48361b;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f48362a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public HashMap f48363b = null;

        public Builder(String str) {
            this.f48362a = str;
        }

        @NonNull
        public FieldDescriptor build() {
            return new FieldDescriptor(this.f48362a, this.f48363b == null ? Collections.emptyMap() : Collections.unmodifiableMap(new HashMap(this.f48363b)));
        }

        @NonNull
        public <T extends Annotation> Builder withProperty(@NonNull T t10) {
            if (this.f48363b == null) {
                this.f48363b = new HashMap();
            }
            this.f48363b.put(t10.annotationType(), t10);
            return this;
        }
    }

    public FieldDescriptor(String str, Map<Class<?>, Object> map) {
        this.f48360a = str;
        this.f48361b = map;
    }

    @NonNull
    public static Builder builder(@NonNull String str) {
        return new Builder(str);
    }

    @NonNull
    public static FieldDescriptor of(@NonNull String str) {
        return new FieldDescriptor(str, Collections.emptyMap());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FieldDescriptor)) {
            return false;
        }
        FieldDescriptor fieldDescriptor = (FieldDescriptor) obj;
        return this.f48360a.equals(fieldDescriptor.f48360a) && this.f48361b.equals(fieldDescriptor.f48361b);
    }

    @NonNull
    public String getName() {
        return this.f48360a;
    }

    @Nullable
    public <T extends Annotation> T getProperty(@NonNull Class<T> cls) {
        return (T) this.f48361b.get(cls);
    }

    public int hashCode() {
        return this.f48361b.hashCode() + (this.f48360a.hashCode() * 31);
    }

    @NonNull
    public String toString() {
        return "FieldDescriptor{name=" + this.f48360a + ", properties=" + this.f48361b.values() + "}";
    }
}
