package n4;

import android.widget.LinearLayout;
import androidx.lifecycle.Observer;
import com.bbva.cellswidgets.CellsEditText;
import com.bbva.component.ui.welcome.header.WelcomeHeader;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class h implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LinearLayout f84443b;

    public /* synthetic */ h(LinearLayout linearLayout, int i10) {
        this.f84442a = i10;
        this.f84443b = linearLayout;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i10 = this.f84442a;
        LinearLayout linearLayout = this.f84443b;
        switch (i10) {
            case 0:
                CellsEditText.b((CellsEditText) linearLayout, (Boolean) obj);
                break;
            default:
                ((WelcomeHeader) linearLayout).setWelcomeHeaderTitle((Map) obj);
                break;
        }
    }
}
