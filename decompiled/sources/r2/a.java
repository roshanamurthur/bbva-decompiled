package r2;

/* JADX INFO: compiled from: SingleProcessDataStore.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class a<T> extends g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f92903a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f92904b;

    public a(T t10, int i10) {
        this.f92903a = t10;
        this.f92904b = i10;
    }

    public final void a() {
        T t10 = this.f92903a;
        if (!((t10 != null ? t10.hashCode() : 0) == this.f92904b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }
}
