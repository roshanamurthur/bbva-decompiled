package k5;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bbva.component.ui.landing.access.LandingAccessView;
import com.bbva.component.ui.modal.alert.AlertModalView;
import com.dasnano.vddocumentcapture.managers.CloseButtonManager;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import mx.openpay.library.ui.signature.DigitalSignatureComponentActivity;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f79189p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f79190q0;

    public /* synthetic */ a(Object obj, int i10) {
        this.f79189p0 = i10;
        this.f79190q0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f79189p0;
        Object obj = this.f79190q0;
        switch (i10) {
            case 0:
                LandingAccessView this$0 = (LandingAccessView) obj;
                int i11 = LandingAccessView.$stable;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f28395q0.buttonTap$component_ui_landing_access_release();
                break;
            case 1:
                AlertModalView this$1 = (AlertModalView) obj;
                AlertModalView.Companion companion = AlertModalView.Companion;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$1), null, null, new v5.a(this$1, null), 3, null);
                break;
            case 2:
                CloseButtonManager this$2 = (CloseButtonManager) obj;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.f39406a.closeButtonClicked();
                break;
            default:
                DigitalSignatureComponentActivity.d((DigitalSignatureComponentActivity) obj, view);
                break;
        }
    }
}
