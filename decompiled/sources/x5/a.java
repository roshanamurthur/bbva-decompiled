package x5;

import android.app.Dialog;
import android.view.View;
import com.bbva.component.ui.modal.list.ListModalView;
import com.bbva.ui.component.menu.view.recycler.item.HeaderMenuItemView;
import com.google.android.material.textfield.l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.ui.taponphone.refund.TapOnPhoneCreateRefundChargeActivity;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94483p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f94484q0;

    public /* synthetic */ a(Object obj, int i10) {
        this.f94483p0 = i10;
        this.f94484q0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f94483p0;
        Object obj = this.f94484q0;
        switch (i10) {
            case 0:
                ListModalView this$0 = (ListModalView) obj;
                ListModalView.Companion companion = ListModalView.Companion;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.f28715q0.onClose$component_ui_modal_release();
                Dialog dialog = this$0.getDialog();
                if (dialog != null) {
                    dialog.dismiss();
                }
                break;
            case 1:
                Function1 tmp0 = (Function1) obj;
                HeaderMenuItemView.Companion companion2 = HeaderMenuItemView.Companion;
                Intrinsics.checkNotNullParameter(tmp0, "$tmp0");
                tmp0.invoke(view);
                break;
            case 2:
                ((l) obj).u();
                break;
            default:
                TapOnPhoneCreateRefundChargeActivity.a((TapOnPhoneCreateRefundChargeActivity) obj, view);
                break;
        }
    }
}
