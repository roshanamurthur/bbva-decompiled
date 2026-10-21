package n4;

import android.util.Pair;
import androidx.lifecycle.Observer;
import com.bbva.cellswidgets.CellsEditText;
import com.noknok.android.client.appsdk_plus.registration.FidoRegisterFragment;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class r implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f84459b;

    public /* synthetic */ r(Object obj, int i10) {
        this.f84458a = i10;
        this.f84459b = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i10 = this.f84458a;
        Object obj2 = this.f84459b;
        switch (i10) {
            case 0:
                CellsEditText.n((CellsEditText) obj2, (String) obj);
                break;
            default:
                ((FidoRegisterFragment) obj2).a((Pair) obj);
                break;
        }
    }
}
