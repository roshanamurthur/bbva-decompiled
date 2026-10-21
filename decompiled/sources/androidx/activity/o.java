package androidx.activity;

import androidx.customview.widget.ViewDragHelper;
import com.dasnano.vdphotoselfiecapture.fragments.SelfieFragment;
import com.google.android.material.sidesheet.SideSheetBehavior;
import io.reactivex.rxjava3.disposables.Disposable;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements Runnable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f452p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f453q0;

    public /* synthetic */ o(Object obj, int i10) {
        this.f452p0 = i10;
        this.f453q0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f452p0) {
            case 0:
                FullyDrawnReporter this$0 = (FullyDrawnReporter) this.f453q0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                synchronized (this$0.f319c) {
                    try {
                        this$0.f321e = false;
                        if (this$0.f320d == 0 && !this$0.f322f) {
                            this$0.f318b.invoke();
                            this$0.fullyDrawnReported();
                        }
                        Unit unit = Unit.INSTANCE;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            case 1:
                SelfieFragment selfieFragment = (SelfieFragment) this.f453q0;
                String str = SelfieFragment.CHALLENGE_TO_BE_REPEATED;
                selfieFragment.E();
                return;
            case 2:
                SideSheetBehavior.c cVar = (SideSheetBehavior.c) this.f453q0;
                cVar.f45356b = false;
                SideSheetBehavior sideSheetBehavior = cVar.f45358d;
                ViewDragHelper viewDragHelper = sideSheetBehavior.f45351y0;
                if (viewDragHelper != null && viewDragHelper.continueSettling(true)) {
                    cVar.a(cVar.f45355a);
                    return;
                } else {
                    if (sideSheetBehavior.f45349w0 == 2) {
                        sideSheetBehavior.a(cVar.f45355a);
                        return;
                    }
                    return;
                }
            case 3:
                Function0 completionAnim = (Function0) this.f453q0;
                Intrinsics.checkNotNullParameter(completionAnim, "$completionAnim");
                completionAnim.invoke();
                return;
            default:
                ((Disposable) this.f453q0).dispose();
                return;
        }
    }
}
