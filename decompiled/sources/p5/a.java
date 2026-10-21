package p5;

import android.view.View;
import com.bbva.component.ui.login.credentials.LoginCredentialsView;
import com.bbva.glomohybrid.infoscreen.fragment.InfoScreenDialogFragment;
import com.bbva.glomohybrid.qrscanner.view.CustomQrNavigationView;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrContract;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrNavigationViewModel;
import com.noknok.android.client.appsdk_plus.registration.FidoRegisterFragment;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f92557p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f92558q0;

    public /* synthetic */ a(Object obj, int i10) {
        this.f92557p0 = i10;
        this.f92558q0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f92557p0;
        Object obj = this.f92558q0;
        switch (i10) {
            case 0:
                LoginCredentialsView this$0 = (LoginCredentialsView) obj;
                LoginCredentialsView.Companion companion = LoginCredentialsView.INSTANCE;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                BuildersKt__Builders_commonKt.launch$default(this$0, null, null, new i(this$0, null), 3, null);
                break;
            case 1:
                InfoScreenDialogFragment this$1 = (InfoScreenDialogFragment) obj;
                int i11 = InfoScreenDialogFragment.I0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.onCancelButtonClick();
                break;
            case 2:
                CustomQrNavigationView this$2 = (CustomQrNavigationView) obj;
                int i12 = CustomQrNavigationView.f34440u0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                QrNavigationViewModel viewModel = this$2.getViewModel();
                if (viewModel != null) {
                    viewModel.setIntent(QrContract.Intent.LeftButtonClick.INSTANCE);
                }
                break;
            default:
                ((FidoRegisterFragment) obj).a(view);
                break;
        }
    }
}
