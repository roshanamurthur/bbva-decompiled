package l5;

import androidx.lifecycle.Observer;
import com.bbva.component.ui.loader.LoaderView;
import com.bbva.ui.component.menu.SlideMenuView;
import com.noknok.android.client.appsdk_plus.pending_auth.PendingAuthsFragment;
import com.noknok.android.client.appsdk_plus.pending_auth.PendingAuthsViewModel;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83103a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f83104b;

    public /* synthetic */ j(Object obj, int i10) {
        this.f83103a = i10;
        this.f83104b = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i10 = this.f83103a;
        Object obj2 = this.f83104b;
        switch (i10) {
            case 0:
                ((LoaderView) obj2).enterAnimation((String) obj);
                break;
            case 1:
                ((SlideMenuView) obj2).setFooterItemConfig((Map) obj);
                break;
            default:
                ((PendingAuthsFragment) obj2).a((PendingAuthsViewModel.PendingAuthResult) obj);
                break;
        }
    }
}
