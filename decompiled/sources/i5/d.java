package i5;

import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.component.ui.biometrics.BiometricsComponent;
import com.bbva.glomohybrid.infoscreen.InfoScreenComponent;
import io.reactivex.functions.Consumer;
import java.util.Map;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class d implements Consumer {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f69508p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ ReactiveComponent f69509q0;

    public /* synthetic */ d(ReactiveComponent reactiveComponent, int i10) {
        this.f69508p0 = i10;
        this.f69509q0 = reactiveComponent;
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(Object obj) {
        int i10 = this.f69508p0;
        ReactiveComponent reactiveComponent = this.f69509q0;
        switch (i10) {
            case 0:
                ((BiometricsComponent) reactiveComponent).negativeButtonText((Map) obj);
                break;
            default:
                ((InfoScreenComponent) reactiveComponent).setToolbarTitleLabel((Map) obj);
                break;
        }
    }
}
