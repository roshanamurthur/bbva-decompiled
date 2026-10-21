package n4;

import android.util.Pair;
import androidx.lifecycle.Observer;
import com.bbva.cellswidgets.CellsEditText;
import com.bbva.cellswidgets.edittext.CellsInputType;
import com.noknok.android.client.appsdk_plus.registration.FidoRegisterFragment;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84432a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f84433b;

    public /* synthetic */ c(Object obj, int i10) {
        this.f84432a = i10;
        this.f84433b = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i10 = this.f84432a;
        Object obj2 = this.f84433b;
        switch (i10) {
            case 0:
                CellsEditText.m((CellsEditText) obj2, (CellsInputType) obj);
                break;
            default:
                ((FidoRegisterFragment) obj2).b((Pair) obj);
                break;
        }
    }
}
