package androidx.camera.core.processing;

import android.util.Size;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements CallbackToFutureAdapter.Resolver, SynchronizationGuard.CriticalSection {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f2207p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2208q0;

    public /* synthetic */ g(Object obj, Object obj2) {
        this.f2207p0 = obj;
        this.f2208q0 = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((SettableSurface) this.f2207p0).lambda$new$0((Size) this.f2208q0, completer);
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public final Object execute() {
        Uploader uploader = (Uploader) this.f2207p0;
        Map map = (Map) this.f2208q0;
        uploader.getClass();
        for (Map.Entry entry : map.entrySet()) {
            uploader.f43837i.recordLogEventDropped(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
        }
        return null;
    }
}
