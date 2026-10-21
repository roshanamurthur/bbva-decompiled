package r5;

import android.view.View;
import com.bbva.component.ui.login.remembereduser.ButtonType;
import com.bbva.component.ui.login.remembereduser.RememberedUserView;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.ui.modal.PayWithPointsModal;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f92924p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f92925q0;

    public /* synthetic */ b(Object obj, int i10) {
        this.f92924p0 = i10;
        this.f92925q0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f92924p0;
        Object obj = this.f92925q0;
        switch (i10) {
            case 0:
                RememberedUserView this$0 = (RememberedUserView) obj;
                RememberedUserView.Companion companion = RememberedUserView.Companion;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f28594q0.onButtonTaped(ButtonType.LOGIN);
                break;
            default:
                PayWithPointsModal.b((PayWithPointsModal) obj, view);
                break;
        }
    }
}
