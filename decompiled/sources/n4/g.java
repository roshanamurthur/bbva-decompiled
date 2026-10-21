package n4;

import android.widget.LinearLayout;
import androidx.lifecycle.Observer;
import com.bbva.cellswidgets.CellsEditText;
import com.bbva.component.ui.welcome.footer.WelcomeFooter;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class g implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinearLayout f84441b;

    public /* synthetic */ g(LinearLayout linearLayout, int i10) {
        this.f84440a = i10;
        this.f84441b = linearLayout;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i10 = this.f84440a;
        LinearLayout linearLayout = this.f84441b;
        switch (i10) {
            case 0:
                CellsEditText.j((CellsEditText) linearLayout, (Boolean) obj);
                break;
            default:
                ((WelcomeFooter) linearLayout).setTermsAndConditions((Map) obj);
                break;
        }
    }
}
