package w8;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.bbva.glomohybrid.infoscreen.InfoScreenContract;
import com.bbva.glomohybrid.infoscreen.InfoScreenNoCellsActivity;
import com.bbva.glomohybrid.qrscanner.view.CustomQRPaymentView;
import com.noknok.android.uaf.framework.service.SelectAuthenticatorActivity;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.ui.taponphone.charge.TapOnPhoneCreateChargeActivity;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94185p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Context f94186q0;

    public /* synthetic */ f(Context context, int i10) {
        this.f94185p0 = i10;
        this.f94186q0 = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f94185p0;
        Context context = this.f94186q0;
        switch (i10) {
            case 0:
                InfoScreenNoCellsActivity this$0 = (InfoScreenNoCellsActivity) context;
                int i11 = InfoScreenNoCellsActivity.f32226t0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.handleEvent(InfoScreenContract.Event.CloseButtonClick.INSTANCE);
                break;
            case 1:
                CustomQRPaymentView.Companion companion = CustomQRPaymentView.Companion;
                Intrinsics.checkNotNullParameter(context, "$context");
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    activity.finish();
                }
                break;
            case 2:
                ((SelectAuthenticatorActivity) context).a(view);
                break;
            default:
                TapOnPhoneCreateChargeActivity.a((TapOnPhoneCreateChargeActivity) context, view);
                break;
        }
    }
}
