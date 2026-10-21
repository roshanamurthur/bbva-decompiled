package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class WorkManagerInitializer implements Initializer<WorkManager> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f24321a = Logger.tagWithPrefix("WrkMgrInitializer");

    @Override // androidx.startup.Initializer
    @NonNull
    public List<Class<? extends Initializer<?>>> dependencies() {
        return Collections.emptyList();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // androidx.startup.Initializer
    @NonNull
    public WorkManager create(@NonNull Context context) {
        Logger.get().debug(f24321a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        WorkManager.initialize(context, new Configuration.Builder().build());
        return WorkManager.getInstance(context);
    }
}
