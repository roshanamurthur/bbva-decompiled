package y4;

import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.component.dm.customer.CustomerDataManager;
import com.bbva.glomohybrid.infoscreen.InfoScreenComponent;
import io.reactivex.functions.Consumer;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Consumer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f94751p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ReactiveComponent f94752q0;

    public /* synthetic */ g(ReactiveComponent reactiveComponent, int i10) {
        this.f94751p0 = i10;
        this.f94752q0 = reactiveComponent;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        int i10 = this.f94751p0;
        ReactiveComponent reactiveComponent = this.f94752q0;
        switch (i10) {
            case 0:
                ((CustomerDataManager) reactiveComponent).config = (Map) obj;
                break;
            default:
                ((InfoScreenComponent) reactiveComponent).setNegativeButton((Map) obj);
                break;
        }
    }
}
