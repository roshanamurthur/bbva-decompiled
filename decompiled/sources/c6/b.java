package c6;

import androidx.lifecycle.Observer;
import com.bbva.component.ui.welcome.pager.WelcomePager;
import com.noknok.android.client.appsdk_plus.management.ManageRegistrationViewModel;
import com.noknok.android.client.appsdk_plus.management.TokenDeregistrationFragment;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f25373b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f25372a = i10;
        this.f25373b = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i10 = this.f25372a;
        Object obj2 = this.f25373b;
        switch (i10) {
            case 0:
                ((WelcomePager) obj2).setupModes((List) obj);
                break;
            default:
                ((TokenDeregistrationFragment) obj2).a((ManageRegistrationViewModel.ManageRegResultParam) obj);
                break;
        }
    }
}
