package d4;

import com.bbva.cells.bridge.widget.CellsActivity;
import com.bbva.component.dm.login.datamanager.LoginDataManager;
import com.bbva.component.ic.security.SecurityDataManager;
import io.reactivex.functions.Consumer;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Consumer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f68123p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f68124q0;

    public /* synthetic */ a(Object obj, int i10) {
        this.f68123p0 = i10;
        this.f68124q0 = obj;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        int i10 = this.f68123p0;
        Object obj2 = this.f68124q0;
        switch (i10) {
            case 0:
                ((CellsActivity) obj2).onPostMessage(obj);
                break;
            case 1:
                ((LoginDataManager) obj2).config = (Map) obj;
                break;
            default:
                ((SecurityDataManager) obj2).type = (String) obj;
                break;
        }
    }
}
