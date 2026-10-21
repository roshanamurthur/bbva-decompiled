package l5;

import android.widget.FrameLayout;
import androidx.lifecycle.Observer;
import com.bbva.component.ui.loader.LoaderSpinnerComponent;
import com.bbva.ui.component.menu.SlideMenuView;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83093a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FrameLayout f83094b;

    public /* synthetic */ b(FrameLayout frameLayout, int i10) {
        this.f83093a = i10;
        this.f83094b = frameLayout;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i10 = this.f83093a;
        FrameLayout frameLayout = this.f83094b;
        switch (i10) {
            case 0:
                ((LoaderSpinnerComponent) frameLayout).setConfig((String) obj);
                break;
            default:
                ((SlideMenuView) frameLayout).setHeaderItemConfig((Map) obj);
                break;
        }
    }
}
