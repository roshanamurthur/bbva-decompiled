package o4;

import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.ay.catalyst.Catalyst;
import com.bbva.component.dm.customer.CustomerDataManager;
import com.bbva.component.dm.customer.domain.model.IndicatorsLoginsEntity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements UseCase.UseCaseSuccessCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactiveComponent f85272b;

    public /* synthetic */ d(ReactiveComponent reactiveComponent, int i10) {
        this.f85271a = i10;
        this.f85272b = reactiveComponent;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
    public final void onUseCaseComplete(Object obj) {
        int i10 = this.f85271a;
        ReactiveComponent reactiveComponent = this.f85272b;
        switch (i10) {
            case 0:
                Catalyst this$0 = (Catalyst) reactiveComponent;
                Catalyst.Companion companion = Catalyst.Companion;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.fire(Catalyst.ACTION_EXPERIENCE_CLOUD_IDENTIFIER, (String) obj);
                break;
            default:
                CustomerDataManager this$1 = (CustomerDataManager) reactiveComponent;
                CustomerDataManager.Companion companion2 = CustomerDataManager.INSTANCE;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                this$1.fire(CustomerDataManager.ACTION_GET_CUSTOMER_INDICATORS_SUCCESS, (IndicatorsLoginsEntity) obj);
                break;
        }
    }
}
