package da;

import android.view.View;
import com.bbva.glomohybrid.qrscanner.view.CustomQrNavigationView;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrContract;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrNavigationViewModel;
import com.bbva.showinfo.generator.InfoSnackBarGenerator;
import com.bbva.ui.widget.BbvaAutoCompleteTextInputLayout;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f68148p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f68149q0;

    public /* synthetic */ e(Object obj, int i10) {
        this.f68148p0 = i10;
        this.f68149q0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f68148p0;
        Object obj = this.f68149q0;
        switch (i10) {
            case 0:
                CustomQrNavigationView this$0 = (CustomQrNavigationView) obj;
                int i11 = CustomQrNavigationView.f34440u0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                QrNavigationViewModel viewModel = this$0.getViewModel();
                if (viewModel != null) {
                    viewModel.setIntent(QrContract.Intent.ToolbarButtonClick.INSTANCE);
                }
                break;
            case 1:
                Function0 listener = (Function0) obj;
                InfoSnackBarGenerator infoSnackBarGenerator = InfoSnackBarGenerator.INSTANCE;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                listener.invoke();
                break;
            default:
                BbvaAutoCompleteTextInputLayout this$1 = (BbvaAutoCompleteTextInputLayout) obj;
                int i12 = BbvaAutoCompleteTextInputLayout.$stable;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.clearText();
                this$1.f37652r0.sendAccessibilityEvent(8);
                break;
        }
    }
}
