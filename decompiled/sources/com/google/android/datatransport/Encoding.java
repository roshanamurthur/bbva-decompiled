package com.google.android.datatransport;

import ad.d;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public final class Encoding {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43569a;

    public Encoding(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("name is null");
        }
        this.f43569a = str;
    }

    public static Encoding of(@NonNull String str) {
        return new Encoding(str);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Encoding)) {
            return false;
        }
        return this.f43569a.equals(((Encoding) obj).f43569a);
    }

    public String getName() {
        return this.f43569a;
    }

    public int hashCode() {
        return this.f43569a.hashCode() ^ 1000003;
    }

    @NonNull
    public String toString() {
        return d.f(new StringBuilder("Encoding{name=\""), this.f43569a, "\"}");
    }
}
