package ic;

import android.view.View;
import com.bbva.ui.component.menu.SlideMenuView;
import com.bbva.ui.component.menu.model.MenuItem;
import com.bbva.ui.component.menu.view.recycler.item.MenuItemView;
import com.noknok.android.client.appsdk_plus.management.TokenDeregistrationFragment;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69579p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f69580q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f69581r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Object f69582s0;

    public /* synthetic */ a(Object obj, Object obj2, int i10, Object obj3) {
        this.f69579p0 = i10;
        this.f69580q0 = obj;
        this.f69581r0 = obj2;
        this.f69582s0 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f69579p0;
        Object obj = this.f69582s0;
        Object obj2 = this.f69581r0;
        Object obj3 = this.f69580q0;
        switch (i10) {
            case 0:
                MenuItemView this_run = (MenuItemView) obj3;
                SlideMenuView this$0 = (SlideMenuView) obj2;
                SlideMenuView.Companion companion = SlideMenuView.INSTANCE;
                Intrinsics.checkNotNullParameter(this_run, "$this_run");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this_run.setChecked(true);
                this$0.f36940p0.onItemClick((MenuItem) obj);
                if (this_run.getF37023s0()) {
                    this$0.cleanCheckedItems();
                }
                break;
            default:
                ((TokenDeregistrationFragment) obj3).b((String) obj2, (JSONObject) obj, view);
                break;
        }
    }
}
