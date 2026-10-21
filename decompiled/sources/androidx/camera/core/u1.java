package androidx.camera.core;

import android.animation.ObjectAnimator;
import android.view.Surface;
import androidx.camera.core.processing.SettableSurface;
import androidx.room.QueryInterceptorDatabase;
import com.dasnano.vddocumentcapture.fragments.DocumentFragment;
import com.mypinpad.tsdk.isolation.ve;
import com.visa.internal.LogoElement;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u1 implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f2265p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f2266q0;

    public /* synthetic */ u1(Object obj, int i10) {
        this.f2265p0 = i10;
        this.f2266q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f2265p0;
        Object obj = this.f2266q0;
        switch (i10) {
            case 0:
                ((Surface) obj).release();
                break;
            case 1:
                ((SettableSurface) obj).lambda$close$3();
                break;
            case 2:
                QueryInterceptorDatabase this$0 = (QueryInterceptorDatabase) obj;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f23255r0.onQuery("BEGIN DEFERRED TRANSACTION", CollectionsKt__CollectionsKt.emptyList());
                break;
            case 3:
                DocumentFragment.j jVar = (DocumentFragment.j) obj;
                jVar.getClass();
                String str = DocumentFragment.CAMERA_FAILURE;
                DocumentFragment documentFragment = DocumentFragment.this;
                documentFragment.getClass();
                documentFragment.runOnUiThread(new r1(documentFragment, 3));
                break;
            case 4:
                ve.a((Runnable) obj);
                break;
            default:
                LogoElement.a((ObjectAnimator) obj);
                break;
        }
    }
}
