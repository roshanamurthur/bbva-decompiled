package b9;

import android.view.View;
import com.bbva.glomohybrid.infoscreen.notification.NotificationTimerExpiredRunningErrorFragment;
import com.bbva.glomohybrid.qrscanner.view.CustomQrNavigationView;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrContract;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrNavigationViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f24890p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f24891q0;

    public /* synthetic */ a(Object obj, int i10) {
        this.f24890p0 = i10;
        this.f24891q0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f24890p0;
        Object obj = this.f24891q0;
        switch (i10) {
            case 0:
                NotificationTimerExpiredRunningErrorFragment this$0 = (NotificationTimerExpiredRunningErrorFragment) obj;
                int i11 = NotificationTimerExpiredRunningErrorFragment.K0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.dismiss();
                break;
            default:
                CustomQrNavigationView this$1 = (CustomQrNavigationView) obj;
                int i12 = CustomQrNavigationView.f34440u0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                QrNavigationViewModel viewModel = this$1.getViewModel();
                if (viewModel != null) {
                    viewModel.setIntent(QrContract.Intent.RightButtonClick.INSTANCE);
                }
                break;
        }
    }
}
