package t8;

import com.bbva.glomohybrid.featureflags.repository.datasource.NetworkDataSource;
import com.bbva.network.constant.Method;
import com.bbva.network.model.request.MutableNetworkRequest;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: NetworkDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class a extends Lambda implements Function1<MutableNetworkRequest, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ NetworkDataSource f93476p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(NetworkDataSource networkDataSource) {
        super(1);
        this.f93476p0 = networkDataSource;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
        MutableNetworkRequest request = mutableNetworkRequest;
        Intrinsics.checkNotNullParameter(request, "$this$request");
        request.setMethod(Method.GET);
        request.setUrl(this.f93476p0.f32161a);
        return Unit.INSTANCE;
    }
}
