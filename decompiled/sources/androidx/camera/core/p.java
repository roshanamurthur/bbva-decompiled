package androidx.camera.core;

import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import com.visa.internal.CheckmarkElement;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2188p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2189q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f2190r0;

    public /* synthetic */ p(Object obj, Object obj2, int i10) {
        this.f2188p0 = i10;
        this.f2189q0 = obj;
        this.f2190r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2188p0;
        Object obj = this.f2190r0;
        Object obj2 = this.f2189q0;
        switch (i10) {
            case 0:
                ImageAnalysis.lambda$createPipeline$0((SafeCloseImageReaderProxy) obj2, (SafeCloseImageReaderProxy) obj);
                break;
            case 1:
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) obj2;
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj;
                String str = FirebaseMessaging.INSTANCE_ID_SCOPE;
                firebaseMessaging.getClass();
                try {
                    taskCompletionSource.setResult(firebaseMessaging.a());
                } catch (Exception e5) {
                    taskCompletionSource.setException(e5);
                    return;
                }
                break;
            case 2:
                String tag = (String) obj2;
                Throwable tr = (Throwable) obj;
                Intrinsics.checkNotNullParameter(tag, "$tag");
                Intrinsics.checkNotNullParameter(tr, "$tr");
                Log.w(tag, tr);
                break;
            default:
                CheckmarkElement.a((CheckmarkElement) obj2, (Function0) obj);
                break;
        }
    }
}
