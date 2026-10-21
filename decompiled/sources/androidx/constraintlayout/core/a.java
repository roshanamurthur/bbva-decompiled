package androidx.constraintlayout.core;

/* JADX INFO: compiled from: Pools.java */
/* JADX INFO: loaded from: classes.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f18571a = new Object[256];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18572b;

    public final T a() {
        int i10 = this.f18572b;
        if (i10 <= 0) {
            return null;
        }
        int i11 = i10 - 1;
        Object[] objArr = this.f18571a;
        T t10 = (T) objArr[i11];
        objArr[i11] = null;
        this.f18572b = i10 - 1;
        return t10;
    }

    public final void b(Object obj) {
        int i10 = this.f18572b;
        Object[] objArr = this.f18571a;
        if (i10 < objArr.length) {
            objArr[i10] = obj;
            this.f18572b = i10 + 1;
        }
    }
}
