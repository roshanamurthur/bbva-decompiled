package n4;

import android.widget.LinearLayout;
import androidx.lifecycle.Observer;
import com.bbva.cellswidgets.CellsEditText;
import com.bbva.cellswidgets.model.Accessibility;
import com.bbva.component.ui.welcome.footer.WelcomeFooter;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class e implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinearLayout f84437b;

    public /* synthetic */ e(LinearLayout linearLayout, int i10) {
        this.f84436a = i10;
        this.f84437b = linearLayout;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i10 = this.f84436a;
        LinearLayout linearLayout = this.f84437b;
        switch (i10) {
            case 0:
                CellsEditText.e((CellsEditText) linearLayout, (Accessibility) obj);
                break;
            default:
                ((WelcomeFooter) linearLayout).setTopButtonConfig((Map) obj);
                break;
        }
    }
}
