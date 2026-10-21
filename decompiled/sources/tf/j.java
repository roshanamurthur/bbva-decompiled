package tf;

import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: LazySet.java */
/* JADX INFO: loaded from: classes10.dex */
public final class j<T> implements Provider<Set<T>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set<Provider<T>> f93579a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Set<T> f93580b;

    public j() {
        throw null;
    }

    public final synchronized void a() {
        try {
            Iterator<Provider<T>> it = this.f93579a.iterator();
            while (it.hasNext()) {
                this.f93580b.add(it.next().get());
            }
            this.f93579a = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        if (this.f93580b == null) {
            synchronized (this) {
                try {
                    if (this.f93580b == null) {
                        this.f93580b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.f93580b);
    }
}
