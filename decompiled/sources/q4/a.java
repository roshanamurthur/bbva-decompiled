package q4;

import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.component.dm.akamai.interceptor.AkamaiInterceptorDataManager;
import com.bbva.glomohybrid.infoscreen.InfoScreenComponent;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Consumer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f92760p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ReactiveComponent f92761q0;

    public /* synthetic */ a(ReactiveComponent reactiveComponent, int i10) {
        this.f92760p0 = i10;
        this.f92761q0 = reactiveComponent;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        int i10 = this.f92760p0;
        ReactiveComponent reactiveComponent = this.f92761q0;
        switch (i10) {
            case 0:
                ((AkamaiInterceptorDataManager) reactiveComponent).endpointsSecurity = (List) obj;
                break;
            default:
                ((InfoScreenComponent) reactiveComponent).setDescriptionLabel((Map) obj);
                break;
        }
    }
}
