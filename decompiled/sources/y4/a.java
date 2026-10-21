package y4;

import com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase;
import com.bbva.component.dm.customer.CustomerDataManager;
import com.bbva.component.dm.customer.domain.model.Customer;
import com.bbva.component.dm.naturalauth.NaturalAuthDataManager;
import com.bbva.sl.ar.android.secsdk.fido.FidoNetworkManager;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements UseCase.UseCaseSuccessCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f94743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f94744b;

    public /* synthetic */ a(Object obj, int i10) {
        this.f94743a = i10;
        this.f94744b = obj;
    }

    @Override // com.bbva.cells.component.kit.datamanager.domain.usecase.UseCase.UseCaseSuccessCallback
    public final void onUseCaseComplete(Object obj) {
        int i10 = this.f94743a;
        Object obj2 = this.f94744b;
        switch (i10) {
            case 0:
                CustomerDataManager this$0 = (CustomerDataManager) obj2;
                CustomerDataManager.Companion companion = CustomerDataManager.INSTANCE;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                this$0.fire(CustomerDataManager.ACTION_GET_CUSTOMER_SUCCESS, (Customer) obj);
                break;
            default:
                FidoNetworkManager.FidoNetworkListRegisteredAuthenticatorsCallback callback = (FidoNetworkManager.FidoNetworkListRegisteredAuthenticatorsCallback) obj2;
                NaturalAuthDataManager.Companion companion2 = NaturalAuthDataManager.Companion;
                Intrinsics.checkNotNullParameter(callback, "$callback");
                callback.didListRegisteredAuthenticators((List) obj);
                break;
        }
    }
}
