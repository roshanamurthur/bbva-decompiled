package com.google.crypto.tink.monitoring;

import com.google.crypto.tink.annotations.Alpha;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
@Alpha
public final class MonitoringAnnotations {
    public static final MonitoringAnnotations EMPTY = newBuilder().build();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f46815a;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HashMap<String, String> f46816a = new HashMap<>();

        @CanIgnoreReturnValue
        public Builder add(String str, String str2) {
            HashMap<String, String> map = this.f46816a;
            if (map == null) {
                throw new IllegalStateException("add cannot be called after build()");
            }
            map.put(str, str2);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder addAll(Map<String, String> map) {
            HashMap<String, String> map2 = this.f46816a;
            if (map2 == null) {
                throw new IllegalStateException("addAll cannot be called after build()");
            }
            map2.putAll(map);
            return this;
        }

        public MonitoringAnnotations build() {
            if (this.f46816a == null) {
                throw new IllegalStateException("cannot call build() twice");
            }
            MonitoringAnnotations monitoringAnnotations = new MonitoringAnnotations(Collections.unmodifiableMap(this.f46816a));
            this.f46816a = null;
            return monitoringAnnotations;
        }
    }

    public MonitoringAnnotations() {
        throw null;
    }

    public MonitoringAnnotations(Map map) {
        this.f46815a = map;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean equals(Object obj) {
        if (obj instanceof MonitoringAnnotations) {
            return this.f46815a.equals(((MonitoringAnnotations) obj).f46815a);
        }
        return false;
    }

    public int hashCode() {
        return this.f46815a.hashCode();
    }

    public Map<String, String> toMap() {
        return this.f46815a;
    }

    public String toString() {
        return this.f46815a.toString();
    }
}
