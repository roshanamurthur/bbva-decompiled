package androidx.camera.camera2.interop;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.mastercard.sonic.controller.SonicSoundController;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2039p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2040q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f2041r0;

    public /* synthetic */ h(Object obj, Object obj2, int i10) {
        this.f2039p0 = i10;
        this.f2040q0 = obj;
        this.f2041r0 = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2039p0;
        Object obj = this.f2041r0;
        Object obj2 = this.f2040q0;
        switch (i10) {
            case 0:
                ((Camera2CameraControl) obj2).lambda$setCaptureRequestOptions$1((CallbackToFutureAdapter.Completer) obj);
                break;
            default:
                Function0 completion = (Function0) obj2;
                SonicSoundController this$0 = (SonicSoundController) obj;
                Intrinsics.checkNotNullParameter(completion, "$completion");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                completion.invoke();
                this$0.f51474e = false;
                break;
        }
    }
}
