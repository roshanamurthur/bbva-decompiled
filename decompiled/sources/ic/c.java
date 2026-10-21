package ic;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bbva.ui.component.menu.SlideMenuView;
import com.bbva.ui.component.menu.model.HeaderMenuItem;
import com.bbva.ui.component.menu.view.recycler.item.HeaderMenuItemView;
import com.dasnano.vddocumentcapture.fragments.CheckDocumentFragment;
import com.noknok.android.client.appsdk_plus.management.TokenDeregistrationFragment;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69584p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f69585q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Object f69586r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Object f69587s0;

    public /* synthetic */ c(Object obj, Object obj2, int i10, Object obj3) {
        this.f69584p0 = i10;
        this.f69585q0 = obj;
        this.f69586r0 = obj2;
        this.f69587s0 = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i10 = this.f69584p0;
        Object obj = this.f69587s0;
        Object obj2 = this.f69586r0;
        Object obj3 = this.f69585q0;
        switch (i10) {
            case 0:
                HeaderMenuItemView this_run = (HeaderMenuItemView) obj3;
                SlideMenuView this$0 = (SlideMenuView) obj2;
                SlideMenuView.Companion companion = SlideMenuView.INSTANCE;
                Intrinsics.checkNotNullParameter(this_run, "$this_run");
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this_run.setChecked(true);
                this$0.f36940p0.onHeaderClick((HeaderMenuItem) obj);
                if (this_run.getF37010q0()) {
                    this$0.cleanCheckedItems();
                }
                break;
            case 1:
                CheckDocumentFragment.a((CheckDocumentFragment) obj3, (LayoutInflater) obj2, (ViewGroup) obj);
                break;
            default:
                ((TokenDeregistrationFragment) obj3).a((String) obj2, (JSONObject) obj, view);
                break;
        }
    }
}
