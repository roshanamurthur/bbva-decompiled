package zb;

import android.view.View;
import com.bbva.showinfo.nativemodal.view.NativeListModalView;
import com.bbva.ui.widget.BbvaTextInputLayout;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.ui.modal.PayWithPointsModal;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f95016p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f95017q0;

    public /* synthetic */ a(Object obj, int i10) {
        this.f95016p0 = i10;
        this.f95017q0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f95016p0;
        Object obj = this.f95017q0;
        switch (i10) {
            case 0:
                NativeListModalView this$0 = (NativeListModalView) obj;
                NativeListModalView.Companion companion = NativeListModalView.Companion;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f36554q0.dismissView();
                break;
            case 1:
                BbvaTextInputLayout.a((BbvaTextInputLayout) obj);
                break;
            default:
                PayWithPointsModal.a((PayWithPointsModal) obj, view);
                break;
        }
    }
}
