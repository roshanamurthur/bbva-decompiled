package y9;

import com.bbva.glomohybrid.profiling.repository.datasource.NetworkProfilingDataSource;
import com.bbva.network.constant.Method;
import com.bbva.network.model.request.MutableNetworkRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NetworkProfilingDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends Lambda implements Function1<MutableNetworkRequest, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ NetworkProfilingDataSource f94760p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NetworkProfilingDataSource networkProfilingDataSource) {
        super(1);
        this.f94760p0 = networkProfilingDataSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
        MutableNetworkRequest request = mutableNetworkRequest;
        Intrinsics.checkNotNullParameter(request, "$this$request");
        request.setMethod(Method.GET);
        request.setUrl(this.f94760p0.f33842a);
        return Unit.INSTANCE;
    }
}
