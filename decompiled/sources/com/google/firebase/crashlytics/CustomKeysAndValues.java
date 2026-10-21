package com.google.firebase.crashlytics;

import androidx.annotation.NonNull;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class CustomKeysAndValues {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f47691a;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f47692a = new HashMap();

        @NonNull
        public CustomKeysAndValues build() {
            return new CustomKeysAndValues(this);
        }

        @NonNull
        public Builder putBoolean(@NonNull String str, boolean z10) {
            this.f47692a.put(str, Boolean.toString(z10));
            return this;
        }

        @NonNull
        public Builder putDouble(@NonNull String str, double d2) {
            this.f47692a.put(str, Double.toString(d2));
            return this;
        }

        @NonNull
        public Builder putFloat(@NonNull String str, float f6) {
            this.f47692a.put(str, Float.toString(f6));
            return this;
        }

        @NonNull
        public Builder putInt(@NonNull String str, int i10) {
            this.f47692a.put(str, Integer.toString(i10));
            return this;
        }

        @NonNull
        public Builder putLong(@NonNull String str, long j10) {
            this.f47692a.put(str, Long.toString(j10));
            return this;
        }

        @NonNull
        public Builder putString(@NonNull String str, @NonNull String str2) {
            this.f47692a.put(str, str2);
            return this;
        }
    }

    public CustomKeysAndValues(@NonNull Builder builder) {
        this.f47691a = builder.f47692a;
    }
}
