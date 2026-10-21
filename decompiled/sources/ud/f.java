package ud;

import com.google.android.datatransport.runtime.backends.BackendRegistryModule;
import com.google.android.datatransport.runtime.dagger.Component;
import com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule;
import com.google.android.datatransport.runtime.scheduling.SchedulingModule;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule;
import com.google.android.datatransport.runtime.time.TimeModule;
import java.io.Closeable;
import java.io.IOException;
import javax.inject.Singleton;

/* JADX INFO: compiled from: TransportRuntimeComponent.java */
/* JADX INFO: loaded from: classes9.dex */
@Singleton
@Component(modules = {BackendRegistryModule.class, EventStoreModule.class, b.class, SchedulingModule.class, SchedulingConfigModule.class, TimeModule.class})
public abstract class f implements Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        ((a) this).f93783u0.get().close();
    }
}
