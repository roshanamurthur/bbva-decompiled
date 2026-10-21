package l5;

import android.view.ViewGroup;
import androidx.lifecycle.Observer;
import com.bbva.component.ui.loader.LoaderView;
import com.bbva.ui.component.menu.SlideMenuView;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f83102b;

    public /* synthetic */ i(int i10, ViewGroup viewGroup) {
        this.f83101a = i10;
        this.f83102b = viewGroup;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i10 = this.f83101a;
        ViewGroup viewGroup = this.f83102b;
        switch (i10) {
            case 0:
                ((LoaderView) viewGroup).loaderType((String) obj);
                break;
            default:
                ((SlideMenuView) viewGroup).setShadowedItemConfig(((Double) obj).doubleValue());
                break;
        }
    }
}
