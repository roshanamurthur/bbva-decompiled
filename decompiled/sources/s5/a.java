package s5;

import android.view.View;
import com.bbva.component.ui.login.view.DocumentSelectorView;
import com.bbva.document.scanner.presentation.preview.PreviewDocumentActivity;
import com.bbva.glomohybrid.infoscreen.InfoScreenActivity;
import com.bbva.glomohybrid.infoscreen.scratchCard.view.ScratchcardView;
import com.bbva.glomohybrid.ui.options.profileselector.view.ProfilesOptionSelectorDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import mx.openpay.library.ui.modal.plans.PayWithPlansModal;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f93145p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f93146q0;

    public /* synthetic */ a(Object obj, int i10) {
        this.f93145p0 = i10;
        this.f93146q0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f93145p0;
        Object obj = this.f93146q0;
        switch (i10) {
            case 0:
                Function0 onClick = (Function0) obj;
                int i11 = DocumentSelectorView.f28607q0;
                Intrinsics.checkNotNullParameter(onClick, "$onClick");
                onClick.invoke();
                break;
            case 1:
                PreviewDocumentActivity this$0 = (PreviewDocumentActivity) obj;
                int i12 = PreviewDocumentActivity.f29190r0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.finish();
                break;
            case 2:
                InfoScreenActivity this$1 = (InfoScreenActivity) obj;
                InfoScreenActivity.Companion companion = InfoScreenActivity.Companion;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.onCloseScreenButtonClicked();
                break;
            case 3:
                ScratchcardView this$2 = (ScratchcardView) obj;
                int i13 = ScratchcardView.E0;
                Intrinsics.checkNotNullParameter(this$2, "this$0");
                this$2.a();
                break;
            case 4:
                ProfilesOptionSelectorDialog this$3 = (ProfilesOptionSelectorDialog) obj;
                int i14 = ProfilesOptionSelectorDialog.f34696w0;
                Intrinsics.checkNotNullParameter(this$3, "this$0");
                Function1<? super View, Unit> function1 = this$3.v0;
                if (function1 != null) {
                    Intrinsics.checkNotNull(view);
                    function1.invoke(view);
                }
                this$3.dismiss();
                break;
            default:
                PayWithPlansModal.d((PayWithPlansModal) obj, view);
                break;
        }
    }
}
