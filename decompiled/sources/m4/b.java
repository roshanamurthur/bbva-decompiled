package m4;

import com.bbva.cellscore.web.plugin.WebPluginManager;
import com.google.firebase.inject.Provider;
import com.google.firebase.storage.StorageTask;
import com.google.firebase.storage.TaskState;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ChannelsKt;
import kotlinx.coroutines.channels.ProducerScope;
import tf.j;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f83350p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f83351q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f83352r0;

    public /* synthetic */ b(Object obj, Object obj2, int i10) {
        this.f83350p0 = i10;
        this.f83351q0 = obj;
        this.f83352r0 = obj2;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f83350p0) {
            case 0:
                WebPluginManager.a aVar = (WebPluginManager.a) this.f83351q0;
                aVar.f27211a.evaluateJavascript((String) this.f83352r0, null);
                return;
            case 1:
                j jVar = (j) this.f83351q0;
                Provider provider = (Provider) this.f83352r0;
                synchronized (jVar) {
                    try {
                        if (jVar.f93580b == 0) {
                            jVar.f93579a.add((Provider<T>) provider);
                        } else {
                            jVar.f93580b.add((T) provider.get());
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 2:
                ChannelsKt.trySendBlocking((ProducerScope) this.f83351q0, new TaskState.Paused((StorageTask.SnapshotBase) this.f83352r0));
                return;
            default:
                String tag = (String) this.f83352r0;
                String msg = (String) this.f83351q0;
                Intrinsics.checkNotNullParameter(tag, "$tag");
                Intrinsics.checkNotNullParameter(msg, "$msg");
                return;
        }
    }

    public /* synthetic */ b(String str, String str2) {
        this.f83350p0 = 3;
        this.f83352r0 = str;
        this.f83351q0 = str2;
    }
}
