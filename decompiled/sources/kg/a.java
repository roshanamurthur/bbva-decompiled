package kg;

import javax.annotation.Nonnull;

/* JADX INFO: compiled from: AutoValue_LibraryVersion.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f79319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79320b;

    public a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Null libraryName");
        }
        this.f79319a = str;
        if (str2 == null) {
            throw new NullPointerException("Null version");
        }
        this.f79320b = str2;
    }

    @Override // kg.c
    @Nonnull
    public final String a() {
        return this.f79319a;
    }

    @Override // kg.c
    @Nonnull
    public final String b() {
        return this.f79320b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f79319a.equals(cVar.a()) && this.f79320b.equals(cVar.b());
    }

    public final int hashCode() {
        return ((this.f79319a.hashCode() ^ 1000003) * 1000003) ^ this.f79320b.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LibraryVersion{libraryName=");
        sb2.append(this.f79319a);
        sb2.append(", version=");
        return ad.d.f(sb2, this.f79320b, "}");
    }
}
