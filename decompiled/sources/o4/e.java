package o4;

import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.component.ay.catalyst.Catalyst;
import com.bbva.component.dm.customer.CustomerDataManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements UseCase.UseCaseErrorCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ReactiveComponent f85274b;

    public /* synthetic */ e(ReactiveComponent reactiveComponent, int i10) {
        this.f85273a = i10;
        this.f85274b = reactiveComponent;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
    public final void onUseCaseError(Throwable th2) {
        int i10 = this.f85273a;
        ReactiveComponent reactiveComponent = this.f85274b;
        switch (i10) {
            case 0:
                Catalyst this$0 = (Catalyst) reactiveComponent;
                Catalyst.Companion companion = Catalyst.Companion;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.fire(Catalyst.ACTION_ERROR, th2);
                break;
            default:
                CustomerDataManager this$1 = (CustomerDataManager) reactiveComponent;
                CustomerDataManager.Companion companion2 = CustomerDataManager.INSTANCE;
                Intrinsics.checkNotNullParameter(this$1, "this$0");
                ActionSpec<Exception> actionSpec = CustomerDataManager.ACTION_GET_INDICATORS_ERROR;
                Exception exc = th2 instanceof Exception ? (Exception) th2 : null;
                if (exc == null) {
                    exc = new Exception(th2);
                }
                this$1.fire(actionSpec, exc);
                break;
        }
    }
}
