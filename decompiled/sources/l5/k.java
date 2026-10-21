package l5;

import android.util.Pair;
import androidx.lifecycle.Observer;
import com.bbva.component.ui.loader.LoaderView;
import com.bbva.ui.component.menu.SlideMenuView;
import com.noknok.android.client.appsdk_plus.pending_auth.PendingAuthsFragment;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class k implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f83106b;

    public /* synthetic */ k(Object obj, int i10) {
        this.f83105a = i10;
        this.f83106b = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i10 = this.f83105a;
        Object obj2 = this.f83106b;
        switch (i10) {
            case 0:
                ((LoaderView) obj2).exitAnimation((String) obj);
                break;
            case 1:
                ((SlideMenuView) obj2).setInfoMenuItemConfig((Map) obj);
                break;
            default:
                ((PendingAuthsFragment) obj2).a((Pair) obj);
                break;
        }
    }
}
