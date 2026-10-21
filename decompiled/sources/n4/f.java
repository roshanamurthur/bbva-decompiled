package n4;

import android.view.KeyEvent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import com.bbva.cellswidgets.CellsEditText;
import com.bbva.cellswidgets.model.ValidationRule;
import com.bbva.component.ui.welcome.footer.WelcomeFooter;
import com.noknok.android.client.utils.ActivityProxy;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class f implements Observer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f84438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ KeyEvent.Callback f84439b;

    public /* synthetic */ f(KeyEvent.Callback callback, int i10) {
        this.f84438a = i10;
        this.f84439b = callback;
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(Object obj) {
        int i10 = this.f84438a;
        KeyEvent.Callback callback = this.f84439b;
        switch (i10) {
            case 0:
                CellsEditText.g((CellsEditText) callback, (ValidationRule) obj);
                break;
            case 1:
                ((WelcomeFooter) callback).setBottomButtonConfig((Map) obj);
                break;
            default:
                ActivityProxy.a((AppCompatActivity) callback, (ActivityProxy.IActivityCommand) obj);
                break;
        }
    }
}
