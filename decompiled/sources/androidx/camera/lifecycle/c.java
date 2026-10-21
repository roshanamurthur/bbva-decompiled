package androidx.camera.lifecycle;

import ad.e;
import android.content.Context;
import android.content.Intent;
import androidx.camera.core.CameraX;
import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FcmBroadcastProcessor;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements CallbackToFutureAdapter.Resolver, Continuation {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Object f2296p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2297q0;

    public /* synthetic */ c(Object obj, Object obj2) {
        this.f2296p0 = obj;
        this.f2297q0 = obj2;
    }

    @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
    public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
        return ((ProcessCameraProvider) this.f2296p0).lambda$getOrCreateCameraXInstance$2((CameraX) this.f2297q0, completer);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        Context context = (Context) this.f2296p0;
        Intent intent = (Intent) this.f2297q0;
        Object obj = FcmBroadcastProcessor.f48542c;
        return (PlatformVersion.isAtLeastO() && ((Integer) task.getResult()).intValue() == 402) ? FcmBroadcastProcessor.a(context, intent).continueWith(new n.b(2), new e()) : task;
    }
}
