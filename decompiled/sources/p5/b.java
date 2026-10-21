package p5;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AlertDialog;
import com.bbva.component.ui.login.credentials.LoginCredentialsView;
import com.bbva.glomohybrid.qrscanner.view.CustomQrNavigationView;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrContract;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrNavigationViewModel;
import com.google.android.material.textfield.s;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f92559p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f92560q0;

    public /* synthetic */ b(Object obj, int i10) {
        this.f92559p0 = i10;
        this.f92560q0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f92559p0;
        Object obj = this.f92560q0;
        switch (i10) {
            case 0:
                LoginCredentialsView this$0 = (LoginCredentialsView) obj;
                LoginCredentialsView.Companion companion = LoginCredentialsView.Companion;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                BuildersKt__Builders_commonKt.launch$default(this$0, null, null, new j(this$0, null), 3, null);
                break;
            case 1:
                CustomQrNavigationView this$1 = (CustomQrNavigationView) obj;
                int i11 = CustomQrNavigationView.f34440u0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                QrNavigationViewModel viewModel = this$1.getViewModel();
                if (viewModel != null) {
                    viewModel.setIntent(QrContract.Intent.MiddleButtonClick.INSTANCE);
                }
                break;
            case 2:
                s sVar = (s) obj;
                EditText editText = sVar.f45695f;
                if (editText != null) {
                    int selectionEnd = editText.getSelectionEnd();
                    EditText editText2 = sVar.f45695f;
                    if (editText2 == null || !(editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                        sVar.f45695f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                    } else {
                        sVar.f45695f.setTransformationMethod(null);
                    }
                    if (selectionEnd >= 0) {
                        sVar.f45695f.setSelection(selectionEnd);
                    }
                    sVar.q();
                    break;
                }
                break;
            default:
                ((AlertDialog) obj).dismiss();
                break;
        }
    }
}
