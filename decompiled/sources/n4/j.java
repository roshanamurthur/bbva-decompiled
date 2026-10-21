package n4;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bbva.cellswidgets.CellsEditText;
import com.bbva.component.ui.modal.halfmodal.views.DefaultHalfModalView;
import com.bbva.notifications.activity.NotificationNoCommercialActivity;
import com.google.android.material.datepicker.MaterialDatePicker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import mx.openpay.library.ui.signature.DigitalSignatureTopActivity;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f84446p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f84447q0;

    public /* synthetic */ j(Object obj, int i10) {
        this.f84446p0 = i10;
        this.f84447q0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f84446p0;
        Object obj = this.f84447q0;
        switch (i10) {
            case 0:
                CellsEditText.f((CellsEditText) obj);
                break;
            case 1:
                DefaultHalfModalView this$0 = (DefaultHalfModalView) obj;
                DefaultHalfModalView.Companion companion = DefaultHalfModalView.INSTANCE;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new w5.d(this$0, null), 3, null);
                break;
            case 2:
                NotificationNoCommercialActivity this$1 = (NotificationNoCommercialActivity) obj;
                NotificationNoCommercialActivity.Companion companion2 = NotificationNoCommercialActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.i();
                break;
            case 3:
                MaterialDatePicker materialDatePicker = (MaterialDatePicker) obj;
                materialDatePicker.U0.setEnabled(materialDatePicker.c().isSelectionComplete());
                materialDatePicker.S0.toggle();
                materialDatePicker.H0 = materialDatePicker.H0 == 1 ? 0 : 1;
                materialDatePicker.g(materialDatePicker.S0);
                materialDatePicker.f();
                break;
            default:
                DigitalSignatureTopActivity.c((DigitalSignatureTopActivity) obj, view);
                break;
        }
    }
}
