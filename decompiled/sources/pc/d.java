package pc;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: Rect.java */
/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f92620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f92622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f92623d;

    public d(int i10, int i11, int i12, int i13) {
        this.f92620a = i10;
        this.f92621b = i11;
        this.f92622c = i12;
        this.f92623d = i13;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f92620a == dVar.f92620a && this.f92621b == dVar.f92621b && this.f92622c == dVar.f92622c && this.f92623d == dVar.f92623d;
    }

    public final int hashCode() {
        return (((((this.f92620a * 31) + this.f92621b) * 31) + this.f92622c) * 31) + this.f92623d;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("[(");
        sb2.append(this.f92620a);
        sb2.append("; ");
        sb2.append(this.f92621b);
        sb2.append(") - (");
        sb2.append(this.f92622c);
        sb2.append("; ");
        return androidx.appcompat.widget.a.c(sb2, this.f92623d, ")]");
    }
}
