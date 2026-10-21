package w5;

import android.view.View;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bbva.component.ui.modal.halfmodal.views.GenderHalfModalView;
import com.bbva.glomohybrid.infoscreen.InfoScreenContract;
import com.bbva.glomohybrid.infoscreen.InfoScreenNoCellsActivity;
import com.bbva.glomohybrid.qrscanner.customenroll.widget.QrEnrollmentView;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94167p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f94168q0;

    public /* synthetic */ f(Object obj, int i10) {
        this.f94167p0 = i10;
        this.f94168q0 = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f94167p0;
        Object obj = this.f94168q0;
        switch (i10) {
            case 0:
                GenderHalfModalView this$0 = (GenderHalfModalView) obj;
                GenderHalfModalView.Companion companion = GenderHalfModalView.INSTANCE;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                BuildersKt__Builders_commonKt.launch$default(LifecycleOwnerKt.getLifecycleScope(this$0), null, null, new i(this$0, null), 3, null);
                break;
            case 1:
                InfoScreenNoCellsActivity this$1 = (InfoScreenNoCellsActivity) obj;
                int i11 = InfoScreenNoCellsActivity.f32226t0;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.handleEvent(InfoScreenContract.Event.NegativeButtonClick.INSTANCE);
                break;
            default:
                QrEnrollmentView.a((QrEnrollmentView) obj);
                break;
        }
    }
}
