package tf;

import com.google.firebase.components.Lazy;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.inject.Provider;
import java.util.Collections;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class f implements Provider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f93567a;

    @Override // com.google.firebase.inject.Provider
    public final Object get() {
        switch (this.f93567a) {
            case 0:
                return Collections.emptySet();
            default:
                Lazy<ScheduledExecutorService> lazy = ExecutorsRegistrar.f47682a;
                return Executors.newSingleThreadScheduledExecutor(new uf.a("Firebase Scheduler", 0, null));
        }
    }
}
