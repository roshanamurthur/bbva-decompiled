package tf;

import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;

/* JADX INFO: compiled from: OptionalProvider.java */
/* JADX INFO: loaded from: classes10.dex */
public final class m<T> implements Provider<T>, Deferred<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final androidx.collection.k f93583c = new androidx.collection.k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f93584d = new k();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @GuardedBy("this")
    public Deferred.DeferredHandler<T> f93585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Provider<T> f93586b;

    public m(androidx.collection.k kVar, Provider provider) {
        this.f93585a = kVar;
        this.f93586b = provider;
    }

    @Override // com.google.firebase.inject.Provider
    public final T get() {
        return this.f93586b.get();
    }

    @Override // com.google.firebase.inject.Deferred
    public final void whenAvailable(@NonNull final Deferred.DeferredHandler<T> deferredHandler) {
        Provider<T> provider;
        Provider<T> provider2;
        Provider<T> provider3 = this.f93586b;
        k kVar = f93584d;
        if (provider3 != kVar) {
            deferredHandler.handle(provider3);
            return;
        }
        synchronized (this) {
            provider = this.f93586b;
            if (provider != kVar) {
                provider2 = provider;
            } else {
                final Deferred.DeferredHandler<T> deferredHandler2 = this.f93585a;
                this.f93585a = new Deferred.DeferredHandler() { // from class: tf.l
                    @Override // com.google.firebase.inject.Deferred.DeferredHandler
                    public final void handle(Provider provider4) {
                        deferredHandler2.handle(provider4);
                        deferredHandler.handle(provider4);
                    }
                };
                provider2 = null;
            }
        }
        if (provider2 != null) {
            deferredHandler.handle(provider);
        }
    }
}
