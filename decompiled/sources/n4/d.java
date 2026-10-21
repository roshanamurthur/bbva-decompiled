package n4;

import androidx.lifecycle.Observer;
import com.bbva.cellswidgets.CellsEditText;
import com.bbva.cellswidgets.CellsVisibility;
import com.bbva.cellswidgets.CellsVisibilityKt;
import com.noknok.android.client.appsdk_plus.OperationResult;
import com.noknok.android.client.appsdk_plus.registration.FidoRegisterFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f84435b;

    public /* synthetic */ d(Object obj, int i10) {
        this.f84434a = i10;
        this.f84435b = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i10 = this.f84434a;
        Object obj2 = this.f84435b;
        switch (i10) {
            case 0:
                CellsEditText this$0 = (CellsEditText) obj2;
                int i11 = CellsEditText.N0;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.setVisibility(CellsVisibilityKt.toAndroidVisibility((CellsVisibility) obj));
                break;
            default:
                ((FidoRegisterFragment) obj2).a((OperationResult) obj);
                break;
        }
    }
}
