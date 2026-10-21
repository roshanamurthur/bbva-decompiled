package n4;

import android.app.Activity;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bbva.cellswidgets.CellsEditText;
import com.bbva.component.ui.modal.halfmodal.views.GenderHalfModalView;
import com.bbva.glomohybrid.infoscreen.InfoScreenContract;
import com.bbva.glomohybrid.infoscreen.InfoScreenNoCellsActivity;
import com.bbva.glomohybrid.landing.presentation.view.LandingToolbar;
import com.google.android.material.search.SearchView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import mx.openpay.library.ui.signature.DigitalSignatureTopActivity;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class k implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f84448p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f84449q0;

    public /* synthetic */ k(Object obj, int i10) {
        this.f84448p0 = i10;
        this.f84449q0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f84448p0;
        Object obj = this.f84449q0;
        switch (i10) {
            case 0:
                CellsEditText.i((CellsEditText) obj);
                break;
            case 1:
                GenderHalfModalView this$0 = (GenderHalfModalView) obj;
                GenderHalfModalView.Companion companion = GenderHalfModalView.INSTANCE;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new w5.h(this$0, null), 3, null);
                break;
            case 2:
                InfoScreenNoCellsActivity this$1 = (InfoScreenNoCellsActivity) obj;
                int i11 = InfoScreenNoCellsActivity.f32226t0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.handleEvent(InfoScreenContract.Event.PositiveButtonClick.INSTANCE);
                break;
            case 3:
                Function0 listener = (Function0) obj;
                LandingToolbar.Companion companion2 = LandingToolbar.Companion;
                Intrinsics.checkNotNullParameter(listener, "$listener");
                listener.invoke();
                break;
            case 4:
                SearchView searchView = (SearchView) obj;
                int i12 = SearchView.X0;
                searchView.clearText();
                if (searchView.R0) {
                    searchView.requestFocusAndShowKeyboard();
                }
                break;
            case 5:
                com.google.android.material.textfield.e eVar = (com.google.android.material.textfield.e) obj;
                EditText editText = eVar.f45621i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (text != null) {
                        text.clear();
                    }
                    eVar.q();
                    break;
                }
                break;
            case 6:
                ((Activity) obj).finish();
                break;
            default:
                DigitalSignatureTopActivity.d((DigitalSignatureTopActivity) obj, view);
                break;
        }
    }
}
