package com.bbva.component.dm.naturalauth.data;

import ad.d;
import com.bbva.component.dm.naturalauth.data.helper.EndpointExtensionsKt;
import com.bbva.component.dm.naturalauth.data.helper.NetworkResponseExtensionsKt;
import com.bbva.component.dm.naturalauth.domain.model.AuthenticationResponse;
import com.bbva.component.dm.naturalauth.domain.model.Endpoint;
import com.bbva.component.dm.naturalauth.domain.model.NaturalAuthEndpoints;
import com.bbva.component.dm.naturalauth.domain.model.params.AuthenticationParams;
import com.bbva.glomoutils.Mapper;
import com.bbva.network.NetworkWorker;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.model.response.NetworkResponse;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
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

/* JADX INFO: compiled from: AuthDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00010\u000b0\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0011"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/AuthDataSource;", "", "Lcom/bbva/component/dm/naturalauth/domain/model/params/AuthenticationParams;", "params", "Lcom/bbva/component/dm/naturalauth/domain/model/AuthenticationResponse;", NaturalAuthenticationCommandFactory.ACTION_AUTHENTICATE, "Lcom/bbva/network/NetworkWorker;", "worker", "Lcom/bbva/component/dm/naturalauth/domain/model/NaturalAuthEndpoints;", "endpoints", "Lcom/bbva/glomoutils/Mapper;", "", "", "requestBodyMapper", "responseParser", "<init>", "(Lcom/bbva/network/NetworkWorker;Lcom/bbva/component/dm/naturalauth/domain/model/NaturalAuthEndpoints;Lcom/bbva/glomoutils/Mapper;Lcom/bbva/glomoutils/Mapper;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final class AuthDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f27789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NaturalAuthEndpoints f27790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Mapper<AuthenticationParams, Map<String, Object>> f27791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Mapper<String, AuthenticationResponse> f27792d;

    /* JADX INFO: compiled from: AuthDataSource.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<AuthenticationParams, Map<String, ? extends Object>> {
        public a(Mapper mapper) {
            super(1, mapper, Mapper.class, "map", "map(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Map<String, ? extends Object> invoke(AuthenticationParams authenticationParams) {
            AuthenticationParams p4 = authenticationParams;
            Intrinsics.checkNotNullParameter(p4, "p0");
            return (Map) ((Mapper) this.receiver).map(p4);
        }
    }

    /* JADX INFO: compiled from: AuthDataSource.kt */
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function1<String, AuthenticationResponse> {
        public b(Mapper mapper) {
            super(1, mapper, Mapper.class, "map", "map(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final AuthenticationResponse invoke(String str) {
            String p4 = str;
            Intrinsics.checkNotNullParameter(p4, "p0");
            return (AuthenticationResponse) ((Mapper) this.receiver).map(p4);
        }
    }

    /* JADX INFO: compiled from: AuthDataSource.kt */
    public static final class c extends Lambda implements Function1<NetworkResponse, Throwable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f27793p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f27793p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Throwable invoke(NetworkResponse networkResponse) {
            NetworkResponse response = networkResponse;
            Intrinsics.checkNotNullParameter(response, "response");
            return new ConnectionException(d.f(new StringBuilder(), this.f27793p0, " request error"), response, null, 4, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AuthDataSource(@NotNull NetworkWorker worker, @NotNull NaturalAuthEndpoints endpoints, @NotNull Mapper<? super AuthenticationParams, ? extends Map<String, ? extends Object>> requestBodyMapper, @NotNull Mapper<? super String, AuthenticationResponse> responseParser) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(endpoints, "endpoints");
        Intrinsics.checkNotNullParameter(requestBodyMapper, "requestBodyMapper");
        Intrinsics.checkNotNullParameter(responseParser, "responseParser");
        this.f27789a = worker;
        this.f27790b = endpoints;
        this.f27791c = requestBodyMapper;
        this.f27792d = responseParser;
    }

    @NotNull
    public final AuthenticationResponse authenticate(@NotNull AuthenticationParams params) {
        Pair pair;
        Intrinsics.checkNotNullParameter(params, "params");
        boolean z10 = params instanceof AuthenticationParams.Init;
        NaturalAuthEndpoints naturalAuthEndpoints = this.f27790b;
        if (z10) {
            pair = TuplesKt.to(naturalAuthEndpoints.getAuthenticationInit(), "InitAuth");
        } else {
            if (!(params instanceof AuthenticationParams.Finish)) {
                throw new NoWhenBranchMatchedException();
            }
            pair = TuplesKt.to(naturalAuthEndpoints.getAuthenticationFinish(), "FinishAuth");
        }
        return (AuthenticationResponse) NetworkResponseExtensionsKt.resultOrThrow(EndpointExtensionsKt.executeRequest$default((Endpoint) pair.component1(), this.f27789a, params, new a(this.f27791c), null, 8, null), new b(this.f27792d), new c((String) pair.component2()));
    }
}
