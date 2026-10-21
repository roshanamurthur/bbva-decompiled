package ta;

import android.content.Context;
import bk.q;
import com.bbva.network.constant.Method;
import com.bbva.network.model.multipart.MultiPartType;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.networkplugin.command.params.Multipart;
import com.bbva.networkplugin.command.params.RequestParams;
import com.bbva.networkplugin.command.request.RequestCreator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: RequestCreator.kt */
/* JADX INFO: loaded from: classes7.dex */
public final class b extends Lambda implements Function1<MutableNetworkRequest, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Method f93491p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ RequestParams f93492q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ RequestCreator f93493r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Context f93494s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Method method, RequestParams requestParams, RequestCreator requestCreator, Context context) {
        super(1);
        this.f93491p0 = method;
        this.f93492q0 = requestParams;
        this.f93493r0 = requestCreator;
        this.f93494s0 = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
        MutableNetworkRequest request = mutableNetworkRequest;
        Intrinsics.checkNotNullParameter(request, "$this$request");
        request.setMethod(this.f93491p0);
        RequestParams requestParams = this.f93492q0;
        request.setUrl(requestParams.getUrl());
        Map<String, String> headers = requestParams.getHeaders();
        if (headers == null) {
            headers = q.emptyMap();
        }
        request.setHeaders(headers);
        request.setTimeout(requestParams.getTimeout());
        MultiPartType.Companion companion = MultiPartType.INSTANCE;
        Multipart multipart = requestParams.getMultipart();
        Intrinsics.checkNotNull(multipart);
        request.body(companion.fromRawType(multipart.getType()), new a(requestParams, this.f93493r0, this.f93494s0));
        return Unit.INSTANCE;
    }
}
