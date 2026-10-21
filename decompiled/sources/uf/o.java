package uf;

import android.os.Build;
import android.os.StrictMode;
import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.inject.Provider;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class o implements Provider {
    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        Lazy<ScheduledExecutorService> lazy = ExecutorsRegistrar.f47682a;
        StrictMode.ThreadPolicy.Builder builderDetectNetwork = new StrictMode.ThreadPolicy.Builder().detectNetwork();
        int i10 = Build.VERSION.SDK_INT;
        builderDetectNetwork.detectResourceMismatches();
        if (i10 >= 26) {
            builderDetectNetwork.detectUnbufferedIo();
        }
        return new i(Executors.newFixedThreadPool(4, new a("Firebase Background", 10, builderDetectNetwork.penaltyLog().build())), ExecutorsRegistrar.f47685d.get());
    }
}
