package x8;

import android.view.KeyEvent;
import android.view.View;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.infoscreen.biometric.RetryBiometricAuthActivity;
import com.bbva.glomohybrid.qrscanner.view.CustomQRToolbarView;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrContract;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrToolbarViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94488p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f94489q0;

    public /* synthetic */ a(KeyEvent.Callback callback, int i10) {
        this.f94488p0 = i10;
        this.f94489q0 = callback;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f94488p0;
        KeyEvent.Callback callback = this.f94489q0;
        switch (i10) {
            case 0:
                RetryBiometricAuthActivity this$0 = (RetryBiometricAuthActivity) callback;
                RetryBiometricAuthActivity.Companion companion = RetryBiometricAuthActivity.Companion;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                CellsReactor.fire(this$0.getId(), RetryBiometricAuthActivity.ACTION_RETRY_AUTH, Boolean.TRUE);
                break;
            default:
                CustomQRToolbarView this$1 = (CustomQRToolbarView) callback;
                int i11 = CustomQRToolbarView.f34432u0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                QrToolbarViewModel viewModel = this$1.getViewModel();
                if (viewModel != null) {
                    viewModel.setIntent(QrContract.Intent.CloseButtonClick.INSTANCE);
                }
                break;
        }
    }
}
