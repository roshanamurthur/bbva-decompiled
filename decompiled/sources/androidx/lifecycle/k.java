package androidx.lifecycle;

import com.appsflyer.internal.AFa1dSDK;
import com.dasnano.vddocumentcapture.fragments.DocumentFragment;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.firebase.appcheck.internal.DefaultFirebaseAppCheck;
import com.google.firebase.appcheck.internal.DefaultTokenRefresher;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f22180p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f22181q0;

    public /* synthetic */ k(Object obj, int i10) {
        this.f22180p0 = i10;
        this.f22181q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f22180p0;
        Object obj = this.f22181q0;
        switch (i10) {
            case 0:
                ProcessLifecycleOwner this$0 = (ProcessLifecycleOwner) obj;
                ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.INSTANCE;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.dispatchPauseIfNeeded$lifecycle_process_release();
                this$0.dispatchStopIfNeeded$lifecycle_process_release();
                break;
            case 1:
                ((AFa1dSDK) obj).AFVersionDeclaration();
                break;
            case 2:
                DocumentFragment.g((DocumentFragment) obj);
                break;
            case 3:
                SelfieFragment.c((SelfieFragment) obj);
                break;
            case 4:
                ((CarouselLayoutManager) obj).F();
                break;
            default:
                DefaultTokenRefresher defaultTokenRefresher = (DefaultTokenRefresher) obj;
                DefaultFirebaseAppCheck defaultFirebaseAppCheck = defaultTokenRefresher.f47613a;
                defaultFirebaseAppCheck.m.getToken().onSuccessTask(defaultFirebaseAppCheck.f47606g, new androidx.camera.core.impl.k(defaultFirebaseAppCheck)).addOnFailureListener(defaultTokenRefresher.f47614b, new com.dasnano.vdphotoselfiecapture.other.e(defaultTokenRefresher, 1));
                break;
        }
    }
}
