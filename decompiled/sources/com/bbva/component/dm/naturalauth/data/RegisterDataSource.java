package com.bbva.component.dm.naturalauth.data;

import ad.d;
import com.bbva.component.dm.naturalauth.data.helper.EndpointExtensionsKt;
import com.bbva.component.dm.naturalauth.data.helper.NetworkResponseExtensionsKt;
import com.bbva.component.dm.naturalauth.domain.model.Endpoint;
import com.bbva.component.dm.naturalauth.domain.model.NaturalAuthEndpoints;
import com.bbva.component.dm.naturalauth.domain.model.params.RegisterParams;
import com.bbva.glomoutils.Mapper;
import com.bbva.network.NetworkWorker;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.model.response.NetworkResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: RegisterDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b0\n\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0010"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/RegisterDataSource;", "", "Lcom/bbva/component/dm/naturalauth/domain/model/params/RegisterParams;", "params", "", "register", "Lcom/bbva/network/NetworkWorker;", "worker", "Lcom/bbva/component/dm/naturalauth/domain/model/NaturalAuthEndpoints;", "endpoints", "Lcom/bbva/glomoutils/Mapper;", "", "requestBodyParser", "responseParser", "<init>", "(Lcom/bbva/network/NetworkWorker;Lcom/bbva/component/dm/naturalauth/domain/model/NaturalAuthEndpoints;Lcom/bbva/glomoutils/Mapper;Lcom/bbva/glomoutils/Mapper;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final class RegisterDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f27809a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NaturalAuthEndpoints f27810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Mapper<RegisterParams, Map<String, Object>> f27811c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Mapper<String, String> f27812d;

    /* JADX INFO: compiled from: RegisterDataSource.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<RegisterParams, Map<String, ? extends Object>> {
        public a(Mapper mapper) {
            super(1, mapper, Mapper.class, "map", "map(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Map<String, ? extends Object> invoke(RegisterParams registerParams) {
            RegisterParams p4 = registerParams;
            Intrinsics.checkNotNullParameter(p4, "p0");
            return (Map) ((Mapper) this.receiver).map(p4);
        }
    }

    /* JADX INFO: compiled from: RegisterDataSource.kt */
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<String, String> {
        public b(Mapper mapper) {
            super(1, mapper, Mapper.class, "map", "map(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final String invoke(String str) {
            String p4 = str;
            Intrinsics.checkNotNullParameter(p4, "p0");
            return (String) ((Mapper) this.receiver).map(p4);
        }
    }

    /* JADX INFO: compiled from: RegisterDataSource.kt */
    public static final class c extends Lambda implements Function1<NetworkResponse, Throwable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f27813p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f27813p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Throwable invoke(NetworkResponse networkResponse) {
            NetworkResponse response = networkResponse;
            Intrinsics.checkNotNullParameter(response, "response");
            return new ConnectionException(d.f(new StringBuilder(), this.f27813p0, " request error"), response, null, 4, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RegisterDataSource(@NotNull NetworkWorker worker, @NotNull NaturalAuthEndpoints endpoints, @NotNull Mapper<? super RegisterParams, ? extends Map<String, ? extends Object>> requestBodyParser, @NotNull Mapper<? super String, String> responseParser) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(endpoints, "endpoints");
        Intrinsics.checkNotNullParameter(requestBodyParser, "requestBodyParser");
        Intrinsics.checkNotNullParameter(responseParser, "responseParser");
        this.f27809a = worker;
        this.f27810b = endpoints;
        this.f27811c = requestBodyParser;
        this.f27812d = responseParser;
    }

    @NotNull
    public final String register(@NotNull RegisterParams params) {
        Pair pair;
        Intrinsics.checkNotNullParameter(params, "params");
        boolean z10 = params instanceof RegisterParams.Init;
        NaturalAuthEndpoints naturalAuthEndpoints = this.f27810b;
        if (z10) {
            pair = TuplesKt.to(naturalAuthEndpoints.getRegisterInit(), "RegisterInit");
        } else {
            if (!(params instanceof RegisterParams.Finish)) {
                throw new NoWhenBranchMatchedException();
            }
            pair = TuplesKt.to(naturalAuthEndpoints.getRegisterFinish(), "RegisterFinish");
        }
        return (String) NetworkResponseExtensionsKt.resultOrThrow(EndpointExtensionsKt.executeRequest$default((Endpoint) pair.component1(), this.f27809a, params, new a(this.f27811c), null, 8, null), new b(this.f27812d), new c((String) pair.component2()));
    }
}
