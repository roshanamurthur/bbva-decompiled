package r5;

import android.view.View;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.app.Reactor;
import com.bbva.component.ui.login.remembereduser.ButtonType;
import com.bbva.component.ui.login.remembereduser.RememberedUserView;
import com.bbva.document.scanner.presentation.capture.ScanDocumentActivity;
import com.bbva.glomohybrid.ui.modals.FullScreenModal;
import com.bbva.signaturepad.ui.SignaturePadActivity;
import com.bbva.signaturepad.ui.widget.SignaturePadView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.ui.modal.plans.PayWithPlansModal;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f92928p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f92929q0;

    public /* synthetic */ d(Object obj, int i10) {
        this.f92928p0 = i10;
        this.f92929q0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f92928p0;
        SignaturePadView signaturePadView = null;
        Object obj = this.f92929q0;
        switch (i10) {
            case 0:
                RememberedUserView this$0 = (RememberedUserView) obj;
                RememberedUserView.Companion companion = RememberedUserView.Companion;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f28594q0.onButtonTaped(ButtonType.PASSWORD);
                break;
            case 1:
                ScanDocumentActivity this$1 = (ScanDocumentActivity) obj;
                ScanDocumentActivity.Companion companion2 = ScanDocumentActivity.Companion;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.finish();
                break;
            case 2:
                FullScreenModal this$2 = (FullScreenModal) obj;
                FullScreenModal.Companion companion3 = FullScreenModal.INSTANCE;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                ActionSpec<Void> actionSpec = FullScreenModal.v0;
                FullScreenModal.FullScreenModalConfig fullScreenModalConfig = this$2.f34621q0;
                if (fullScreenModalConfig == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("config");
                    fullScreenModalConfig = null;
                }
                Reactor.inside(fullScreenModalConfig.getId()).doAction(actionSpec).with(null).fire();
                Function0<Unit> function0 = this$2.cancelListener;
                if (function0 != null) {
                    function0.invoke();
                }
                this$2.dismiss();
                break;
            case 3:
                SignaturePadActivity this$3 = (SignaturePadActivity) obj;
                SignaturePadActivity.Companion companion4 = SignaturePadActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                SignaturePadView signaturePadView2 = this$3.f36572t0;
                if (signaturePadView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("digitalSignView");
                } else {
                    signaturePadView = signaturePadView2;
                }
                signaturePadView.clear();
                break;
            default:
                PayWithPlansModal.a((PayWithPlansModal) obj, view);
                break;
        }
    }
}
