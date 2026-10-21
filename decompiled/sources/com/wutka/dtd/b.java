package com.wutka.dtd;

/* JADX INFO: compiled from: TokenType.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f68078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f68079b;

    public b(int i10, String str) {
        this.f68078a = i10;
        this.f68079b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && ((b) obj).f68078a == this.f68078a;
    }

    public final int hashCode() {
        return this.f68079b.hashCode();
    }
}
