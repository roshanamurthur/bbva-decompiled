package flexjson;

/* JADX INFO: loaded from: classes7.dex */
public class DeferredInstantiation<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class<? extends T> f68468a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public T f68469b;

    public DeferredInstantiation(Class<? extends T> cls) {
        this.f68468a = cls;
    }

    public synchronized T get() throws IllegalAccessException, InstantiationException {
        try {
            if (this.f68469b == null) {
                this.f68469b = this.f68468a.newInstance();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f68469b;
    }
}
