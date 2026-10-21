package n4;

import androidx.lifecycle.Observer;
import com.bbva.cellswidgets.CellsEditText;
import com.noknok.android.client.appsdk_plus.registration.FidoRegisterFragment;
import com.noknok.android.client.appsdk_plus.registration.FidoRegistrationViewModel;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class q implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f84457b;

    public /* synthetic */ q(Object obj, int i10) {
        this.f84456a = i10;
        this.f84457b = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i10 = this.f84456a;
        Object obj2 = this.f84457b;
        switch (i10) {
            case 0:
                CellsEditText.h((CellsEditText) obj2, (Integer) obj);
                break;
            default:
                ((FidoRegisterFragment) obj2).a((FidoRegistrationViewModel.RegResultParam) obj);
                break;
        }
    }
}
