package uf;

import android.os.StrictMode;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.inject.Provider;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class p implements Provider {
    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        Lazy<ScheduledExecutorService> lazy = ExecutorsRegistrar.f47682a;
        return new i(Executors.newFixedThreadPool(Math.max(2, Runtime.getRuntime().availableProcessors()), new a("Firebase Lite", 0, new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build())), ExecutorsRegistrar.f47685d.get());
    }
}
