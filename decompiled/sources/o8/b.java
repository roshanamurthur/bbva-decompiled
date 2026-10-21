package o8;

import bk.q;
import com.bbva.glomohybrid.documents.common.repository.dataSource.RemoteFileDataSource;
import com.bbva.network.constant.Method;
import com.bbva.network.model.request.MutableNetworkRequest;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: RemoteFileDataSource.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class b extends Lambda implements Function1<MutableNetworkRequest, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ RemoteFileDataSource f85291p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ String f85292q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f85293r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Map<String, String> f85294s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ Method f85295t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Map<String, Object> f85296u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(RemoteFileDataSource remoteFileDataSource, String str, Map<String, String> map, Map<String, String> map2, Method method, Map<String, ? extends Object> map3) {
        super(1);
        this.f85291p0 = remoteFileDataSource;
        this.f85292q0 = str;
        this.f85293r0 = map;
        this.f85294s0 = map2;
        this.f85295t0 = method;
        this.f85296u0 = map3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
        MutableNetworkRequest execute = mutableNetworkRequest;
        Intrinsics.checkNotNullParameter(execute, "$this$execute");
        RemoteFileDataSource remoteFileDataSource = this.f85291p0;
        execute.setUrl(RemoteFileDataSource.access$formatUrlWithQueryParams(remoteFileDataSource, this.f85292q0, this.f85293r0));
        execute.setHeaders(q.plus(this.f85294s0, remoteFileDataSource.f32087b));
        execute.setMethod(this.f85295t0);
        Map<String, Object> map = this.f85296u0;
        if (map != null) {
            execute.setBody(RemoteFileDataSource.access$getNetworkRequestBody(remoteFileDataSource, map));
        }
        return Unit.INSTANCE;
    }
}
