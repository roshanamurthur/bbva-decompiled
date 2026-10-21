package com.airbnb.lottie.model;

import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.a;
import androidx.core.util.Pair;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class MutablePair<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public T f25964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public T f25965b;

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        F f6 = pair.first;
        Object obj2 = this.f25964a;
        if (f6 != obj2 && (f6 == 0 || !f6.equals(obj2))) {
            return false;
        }
        S s4 = pair.second;
        Object obj3 = this.f25965b;
        return s4 == obj3 || (s4 != 0 && s4.equals(obj3));
    }

    public int hashCode() {
        T t10 = this.f25964a;
        int iHashCode = t10 == null ? 0 : t10.hashCode();
        T t11 = this.f25965b;
        return iHashCode ^ (t11 != null ? t11.hashCode() : 0);
    }

    public void set(T t10, T t11) {
        this.f25964a = t10;
        this.f25965b = t11;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Pair{");
        sb2.append(this.f25964a);
        sb2.append(" ");
        return a.e(sb2, this.f25965b, "}");
    }
}
