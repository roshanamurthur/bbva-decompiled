package androidx.core.util;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes2.dex */
public class Pair<F, S> {
    public final F first;
    public final S second;

    public Pair(F f6, S s4) {
        this.first = f6;
        this.second = s4;
    }

    @NonNull
    public static <A, B> Pair<A, B> create(A a10, B b10) {
        return new Pair<>(a10, b10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return ObjectsCompat.equals(pair.first, this.first) && ObjectsCompat.equals(pair.second, this.second);
    }

    public int hashCode() {
        F f6 = this.first;
        int iHashCode = f6 == null ? 0 : f6.hashCode();
        S s4 = this.second;
        return iHashCode ^ (s4 != null ? s4.hashCode() : 0);
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Pair{");
        sb2.append(this.first);
        sb2.append(" ");
        return androidx.camera.core.impl.a.e(sb2, this.second, "}");
    }
}
