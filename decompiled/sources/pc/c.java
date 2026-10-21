package pc;

import androidx.annotation.NonNull;

/* JADX INFO: compiled from: Point.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f92618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92619b;

    public c(int i10, int i11) {
        this.f92618a = i10;
        this.f92619b = i11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f92618a == cVar.f92618a && this.f92619b == cVar.f92619b;
    }

    public final int hashCode() {
        int i10 = this.f92619b;
        return ((i10 >>> 16) | (i10 << 16)) ^ this.f92618a;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.f92618a);
        sb2.append("; ");
        return androidx.appcompat.widget.a.c(sb2, this.f92619b, ")");
    }
}
