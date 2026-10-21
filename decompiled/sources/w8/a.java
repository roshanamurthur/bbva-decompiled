package w8;

import android.view.View;
import com.bbva.glomohybrid.infoscreen.InfoScreenActivity;
import com.bbva.glomohybrid.ui.modals.changeuser.ui.InfoDetailBoxView;
import com.bbva.signaturepad.ui.SignaturePadActivity;
import com.bbva.signaturepad.ui.widget.SignaturePadView;
import com.noknok.android.client.appsdk_plus.management.TokenDeregistrationFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.ui.modal.plans.PayWithPlansModal;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94178p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f94179q0;

    public /* synthetic */ a(Object obj, int i10) {
        this.f94178p0 = i10;
        this.f94179q0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f94178p0;
        Object obj = this.f94179q0;
        switch (i10) {
            case 0:
                InfoScreenActivity this$0 = (InfoScreenActivity) obj;
                InfoScreenActivity.Companion companion = InfoScreenActivity.Companion;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.onPositiveButtonClicked();
                break;
            case 1:
                Function0 infoActionLink = (Function0) obj;
                int i11 = InfoDetailBoxView.f34647q0;
                Intrinsics.checkNotNullParameter(infoActionLink, "$infoActionLink");
                infoActionLink.invoke();
                break;
            case 2:
                final SignaturePadActivity this$1 = (SignaturePadActivity) obj;
                SignaturePadActivity.Companion companion2 = SignaturePadActivity.Companion;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                SignaturePadView signaturePadView = this$1.f36572t0;
                if (signaturePadView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("digitalSignView");
                    signaturePadView = null;
                }
                signaturePadView.save(new SignaturePadView.OnSignatureSaveListener() { // from class: com.bbva.signaturepad.ui.SignaturePadActivity$setListeners$3$1
                    @Override // com.bbva.signaturepad.ui.widget.SignaturePadView.OnSignatureSaveListener
                    public void onSignatureSaveFailed() {
                        SignaturePadActivity signaturePadActivity = this$1;
                        signaturePadActivity.setResult(-2);
                        signaturePadActivity.finish();
                    }

                    @Override // com.bbva.signaturepad.ui.widget.SignaturePadView.OnSignatureSaveListener
                    public void onSignatureSaved() {
                        SignaturePadActivity signaturePadActivity = this$1;
                        signaturePadActivity.setResult(-1);
                        signaturePadActivity.finish();
                    }
                });
                break;
            case 3:
                ((TokenDeregistrationFragment) obj).a(view);
                break;
            default:
                PayWithPlansModal.b((PayWithPlansModal) obj, view);
                break;
        }
    }
}
