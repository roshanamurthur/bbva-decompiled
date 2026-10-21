package qb;

import com.bbva.push.salesforce.SalesforcePushHandler;
import com.salesforce.marketingcloud.sfmcsdk.InitializationStatus;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: SalesforcePushHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class a extends Lambda implements Function1<InitializationStatus, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SalesforcePushHandler f92802p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(SalesforcePushHandler salesforcePushHandler) {
        super(1);
        this.f92802p0 = salesforcePushHandler;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InitializationStatus initializationStatus) {
        InitializationStatus it = initializationStatus;
        Intrinsics.checkNotNullParameter(it, "it");
        it.getStatus();
        int status = it.getStatus();
        SalesforcePushHandler salesforcePushHandler = this.f92802p0;
        if (status != 1) {
            salesforcePushHandler.f36264d.invoke(null);
        } else {
            SalesforcePushHandler.access$registerFirebaseToken(salesforcePushHandler);
        }
        return Unit.INSTANCE;
    }
}
