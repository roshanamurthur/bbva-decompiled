package kotlin.reflect.jvm.internal.impl.storage;

/* JADX INFO: compiled from: SingleThreadValue.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T f81877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Thread f81878b = Thread.currentThread();

    public b(T t10) {
        this.f81877a = t10;
    }

    public T getValue() {
        if (hasValue()) {
            return this.f81877a;
        }
        throw new IllegalStateException("No value in this thread (hasValue should be checked before)");
    }

    public boolean hasValue() {
        return this.f81878b == Thread.currentThread();
    }
}
