package w8;

import android.view.View;
import android.widget.LinearLayout;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.infoscreen.InfoScreenActivity;
import com.bbva.glomohybrid.infoscreen.scratchCard.models.ScratchcardEvents;
import com.bbva.glomohybrid.infoscreen.scratchCard.view.ScratchcardView;
import com.bbva.glomohybrid.infoscreen.scratchCard.view.ScratchcardViewModel;
import com.bbva.signaturepad.ui.SignaturePadActivity;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.ui.modal.plans.PayWithPlansModal;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94180p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f94181q0;

    public /* synthetic */ b(Object obj, int i10) {
        this.f94180p0 = i10;
        this.f94181q0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f94180p0;
        ScratchcardViewModel scratchcardViewModel = null;
        LinearLayout linearLayout = null;
        Object obj = this.f94181q0;
        switch (i10) {
            case 0:
                InfoScreenActivity this$0 = (InfoScreenActivity) obj;
                InfoScreenActivity.Companion companion = InfoScreenActivity.Companion;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                CellsReactor.fire$default(this$0.getId(), InfoScreenActivity.f32206x0, null, 4, null);
                break;
            case 1:
                ScratchcardView this$1 = (ScratchcardView) obj;
                int i11 = ScratchcardView.E0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                ScratchcardViewModel scratchcardViewModel2 = this$1.f32477q0;
                if (scratchcardViewModel2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                } else {
                    scratchcardViewModel = scratchcardViewModel2;
                }
                scratchcardViewModel.onTapped(ScratchcardEvents.OnCloseTapped.INSTANCE);
                break;
            case 2:
                SignaturePadActivity this$2 = (SignaturePadActivity) obj;
                SignaturePadActivity.Companion companion2 = SignaturePadActivity.INSTANCE;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                LinearLayout linearLayout2 = this$2.f36569q0;
                if (linearLayout2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("directionsLayout");
                } else {
                    linearLayout = linearLayout2;
                }
                linearLayout.setVisibility(8);
                break;
            default:
                PayWithPlansModal.c((PayWithPlansModal) obj, view);
                break;
        }
    }
}
