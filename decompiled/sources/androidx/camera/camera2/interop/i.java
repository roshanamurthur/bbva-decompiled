package androidx.camera.camera2.interop;

import androidx.camera.core.impl.Config;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.n;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Config.OptionMatcher, Continuation {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f2042p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2043q0;

    public /* synthetic */ i(Object obj, Object obj2) {
        this.f2042p0 = obj;
        this.f2043q0 = obj2;
    }

    @Override // androidx.camera.core.impl.Config.OptionMatcher
    public final boolean onOptionMatched(Config.Option option) {
        return CaptureRequestOptions.Builder.lambda$from$0((CaptureRequestOptions.Builder) this.f2042p0, (Config) this.f2043q0, option);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        n nVar = (n) this.f2042p0;
        String str = (String) this.f2043q0;
        synchronized (nVar) {
            nVar.f48651b.remove(str);
        }
        return task;
    }
}
