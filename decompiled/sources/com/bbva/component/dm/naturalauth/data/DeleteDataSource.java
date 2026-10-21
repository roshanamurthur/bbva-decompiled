package com.bbva.component.dm.naturalauth.data;

import com.bbva.component.dm.naturalauth.data.helper.EndpointExtensionsKt;
import com.bbva.component.dm.naturalauth.data.helper.NetworkResponseExtensionsKt;
import com.bbva.component.dm.naturalauth.domain.model.NaturalAuthEndpoints;
import com.bbva.component.dm.naturalauth.domain.model.params.DeleteParams;
import com.bbva.glomoutils.Mapper;
import com.bbva.network.NetworkWorker;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.model.response.NetworkResponse;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DeleteDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000b0\n\u0012\u001e\u0010\r\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u000b0\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0011"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/DeleteDataSource;", "", "Lcom/bbva/component/dm/naturalauth/domain/model/params/DeleteParams;", "params", "", "delete", "Lcom/bbva/network/NetworkWorker;", "worker", "Lcom/bbva/component/dm/naturalauth/domain/model/NaturalAuthEndpoints;", "endpoints", "Lcom/bbva/glomoutils/Mapper;", "", "queryParamsMapper", "requestBodyMapper", "responseBodyMapper", "<init>", "(Lcom/bbva/network/NetworkWorker;Lcom/bbva/component/dm/naturalauth/domain/model/NaturalAuthEndpoints;Lcom/bbva/glomoutils/Mapper;Lcom/bbva/glomoutils/Mapper;Lcom/bbva/glomoutils/Mapper;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final class DeleteDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f27797a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NaturalAuthEndpoints f27798b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Mapper<DeleteParams, Map<String, String>> f27799c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Mapper<DeleteParams, Map<String, Object>> f27800d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Mapper<String, String> f27801e;

    /* JADX INFO: compiled from: DeleteDataSource.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<DeleteParams, Map<String, ? extends Object>> {
        public a(Mapper mapper) {
            super(1, mapper, Mapper.class, "map", "map(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Map<String, ? extends Object> invoke(DeleteParams deleteParams) {
            DeleteParams p4 = deleteParams;
            Intrinsics.checkNotNullParameter(p4, "p0");
            return (Map) ((Mapper) this.receiver).map(p4);
        }
    }

    /* JADX INFO: compiled from: DeleteDataSource.kt */
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

    /* JADX INFO: compiled from: DeleteDataSource.kt */
    public static final class c extends Lambda implements Function1<NetworkResponse, Throwable> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DeleteParams f27803q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DeleteParams deleteParams) {
            super(1);
            this.f27803q0 = deleteParams;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Throwable invoke(NetworkResponse networkResponse) {
            NetworkResponse response = networkResponse;
            Intrinsics.checkNotNullParameter(response, "response");
            return new ConnectionException(DeleteDataSource.access$getErrorMessage(DeleteDataSource.this, this.f27803q0), response, null, 4, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DeleteDataSource(@NotNull NetworkWorker worker, @NotNull NaturalAuthEndpoints endpoints, @NotNull Mapper<? super DeleteParams, ? extends Map<String, String>> queryParamsMapper, @NotNull Mapper<? super DeleteParams, ? extends Map<String, ? extends Object>> requestBodyMapper, @NotNull Mapper<? super String, String> responseBodyMapper) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(endpoints, "endpoints");
        Intrinsics.checkNotNullParameter(queryParamsMapper, "queryParamsMapper");
        Intrinsics.checkNotNullParameter(requestBodyMapper, "requestBodyMapper");
        Intrinsics.checkNotNullParameter(responseBodyMapper, "responseBodyMapper");
        this.f27797a = worker;
        this.f27798b = endpoints;
        this.f27799c = queryParamsMapper;
        this.f27800d = requestBodyMapper;
        this.f27801e = responseBodyMapper;
    }

    public static final String access$getErrorMessage(DeleteDataSource deleteDataSource, DeleteParams deleteParams) {
        deleteDataSource.getClass();
        String str = "deleteAllAuthenticators";
        if (!(deleteParams instanceof DeleteParams.DeleteOneAuthenticatorParams) && !(deleteParams instanceof DeleteParams.DeleteAllAuthenticators)) {
            if (!(deleteParams instanceof DeleteParams.DeleteAllAuthenticatorsFromDevice)) {
                throw new NoWhenBranchMatchedException();
            }
            str = "deleteAllAuthenticatorsFromDevice";
        }
        return str.concat(" request error");
    }

    @NotNull
    public final String delete(@NotNull DeleteParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return (String) NetworkResponseExtensionsKt.resultOrThrow(EndpointExtensionsKt.executeRequest(this.f27798b.getDelete(), this.f27797a, params, new a(this.f27800d), this.f27799c.map(params)), new b(this.f27801e), new c(params));
    }
}
