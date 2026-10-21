package i5;

import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.component.ui.biometrics.BiometricsComponent;
import com.bbva.glomo.semaas.interceptor.SemaasInterceptorDataManager;
import com.bbva.glomohybrid.infoscreen.InfoScreenComponent;
import io.reactivex.functions.Consumer;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class e implements Consumer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69510p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ReactiveComponent f69511q0;

    public /* synthetic */ e(ReactiveComponent reactiveComponent, int i10) {
        this.f69510p0 = i10;
        this.f69511q0 = reactiveComponent;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        int i10 = this.f69510p0;
        ReactiveComponent reactiveComponent = this.f69511q0;
        switch (i10) {
            case 0:
                ((BiometricsComponent) reactiveComponent).setDeviceCredentialAllowed(((Boolean) obj).booleanValue());
                break;
            case 1:
                ((SemaasInterceptorDataManager) reactiveComponent).whiteList = (List) obj;
                break;
            default:
                ((InfoScreenComponent) reactiveComponent).setHeaderImage((Map) obj);
                break;
        }
    }
}
