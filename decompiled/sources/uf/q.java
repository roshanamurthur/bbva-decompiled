package uf;

import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.inject.Provider;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class q implements Provider {
    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        Lazy<ScheduledExecutorService> lazy = ExecutorsRegistrar.f47682a;
        return new i(Executors.newCachedThreadPool(new a("Firebase Blocking", 11, null)), ExecutorsRegistrar.f47685d.get());
    }
}
