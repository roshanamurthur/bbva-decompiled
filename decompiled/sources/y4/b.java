package y4;

import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.component.dm.customer.CustomerDataManager;
import com.bbva.component.dm.naturalauth.NaturalAuthDataManager;
import com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager;
import com.bbva.sl.ar.android.secsdk.fido.error.FidoError;
import com.bbva.sl.ar.android.secsdk.fido.exception.FidoException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements UseCase.UseCaseErrorCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94745a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f94746b;

    public /* synthetic */ b(Object obj, int i10) {
        this.f94745a = i10;
        this.f94746b = obj;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseErrorCallback
    public final void onUseCaseError(Throwable th2) {
        int i10 = this.f94745a;
        Object obj = this.f94746b;
        switch (i10) {
            case 0:
                CustomerDataManager this$0 = (CustomerDataManager) obj;
                CustomerDataManager.Companion companion = CustomerDataManager.INSTANCE;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                ActionSpec<Exception> actionSpec = CustomerDataManager.ACTION_GET_CUSTOMER_ERROR;
                Exception exc = th2 instanceof Exception ? (Exception) th2 : null;
                if (exc == null) {
                    exc = new Exception(th2);
                }
                this$0.fire(actionSpec, exc);
                break;
            default:
                FidoNetworkManager.FidoNetworkListRegisteredAuthenticatorsCallback callback = (FidoNetworkManager.FidoNetworkListRegisteredAuthenticatorsCallback) obj;
                NaturalAuthDataManager.Companion companion2 = NaturalAuthDataManager.Companion;
                Intrinsics.checkNotNullParameter(callback, "$callback");
                callback.listRegisteredAuthenticatorsFailed(new FidoException.Builder(FidoError.SDK_LIST_OPERATION).build());
                break;
        }
    }
}
