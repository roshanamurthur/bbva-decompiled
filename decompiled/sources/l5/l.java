package l5;

import android.util.Pair;
import androidx.lifecycle.Observer;
import com.bbva.component.ui.loader.LoaderView;
import com.noknok.android.client.appsdk_plus.pending_auth.PendingAuthsFragment;
import java.util.List;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f83108b;

    public /* synthetic */ l(Object obj, int i10) {
        this.f83107a = i10;
        this.f83108b = obj;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i10 = this.f83107a;
        Object obj2 = this.f83108b;
        switch (i10) {
            case 0:
                ((LoaderView) obj2).messages((List) obj);
                break;
            default:
                ((PendingAuthsFragment) obj2).b((Pair) obj);
                break;
        }
    }
}
