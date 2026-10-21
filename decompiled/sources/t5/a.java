package t5;

import android.view.View;
import com.bbva.component.ui.message.card.ButtonItemView;
import com.bbva.glomohybrid.infoscreen.scratchCard.models.ScratchcardEvents;
import com.bbva.glomohybrid.infoscreen.scratchCard.view.ScratchcardView;
import com.bbva.glomohybrid.infoscreen.scratchCard.view.ScratchcardViewModel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.ui.signature.DigitalSignatureComponentActivity;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f93451p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f93452q0;

    public /* synthetic */ a(Object obj, int i10) {
        this.f93451p0 = i10;
        this.f93452q0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f93451p0;
        Object obj = this.f93452q0;
        switch (i10) {
            case 0:
                Function0 onClick = (Function0) obj;
                int i11 = ButtonItemView.f28613r0;
                Intrinsics.checkNotNullParameter(onClick, "$onClick");
                onClick.invoke();
                break;
            case 1:
                ScratchcardView this$0 = (ScratchcardView) obj;
                int i12 = ScratchcardView.E0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ScratchcardViewModel scratchcardViewModel = this$0.f32477q0;
                if (scratchcardViewModel == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("viewModel");
                    scratchcardViewModel = null;
                }
                scratchcardViewModel.onTapped(ScratchcardEvents.OnContinueTapped.INSTANCE);
                break;
            default:
                DigitalSignatureComponentActivity.a((DigitalSignatureComponentActivity) obj, view);
                break;
        }
    }
}
