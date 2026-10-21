package com.bbva.component.dm.naturalauth.data;

import com.bbva.component.dm.naturalauth.data.helper.EndpointExtensionsKt;
import com.bbva.component.dm.naturalauth.data.helper.NetworkResponseExtensionsKt;
import com.bbva.component.dm.naturalauth.domain.model.NaturalAuthEndpoints;
import com.bbva.component.dm.naturalauth.domain.model.params.ListAuthenticatorsParams;
import com.bbva.glomoutils.Mapper;
import com.bbva.network.NetworkWorker;
import com.bbva.network.exceptions.ConnectionException;
import com.bbva.network.model.response.NetworkResponse;
import com.bbva.sl.ar.android.secsdk.fido.model.FidoDevice;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ListAuthenticatorsDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001e\u0010\u000e\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f0\u000b\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\u0012"}, d2 = {"Lcom/bbva/component/dm/naturalauth/data/ListAuthenticatorsDataSource;", "", "Lcom/bbva/component/dm/naturalauth/domain/model/params/ListAuthenticatorsParams;", "params", "", "Lcom/bbva/sl/ar/android/secsdk/fido/model/FidoDevice;", "listAuthenticators", "Lcom/bbva/network/NetworkWorker;", "worker", "Lcom/bbva/component/dm/naturalauth/domain/model/NaturalAuthEndpoints;", "endpoints", "Lcom/bbva/glomoutils/Mapper;", "", "", "queryParamsParser", "responseParser", "<init>", "(Lcom/bbva/network/NetworkWorker;Lcom/bbva/component/dm/naturalauth/domain/model/NaturalAuthEndpoints;Lcom/bbva/glomoutils/Mapper;Lcom/bbva/glomoutils/Mapper;)V", "component-dm-naturalauth_release"}, k = 1, mv = {1, 9, 0})
public final class ListAuthenticatorsDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f27804a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final NaturalAuthEndpoints f27805b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final Mapper<ListAuthenticatorsParams, Map<String, String>> f27806c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Mapper<String, List<FidoDevice>> f27807d;

    /* JADX INFO: compiled from: ListAuthenticatorsDataSource.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<String, List<? extends FidoDevice>> {
        public a(Mapper mapper) {
            super(1, mapper, Mapper.class, "map", "map(Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final List<? extends FidoDevice> invoke(String str) {
            String p4 = str;
            Intrinsics.checkNotNullParameter(p4, "p0");
            return (List) ((Mapper) this.receiver).map(p4);
        }
    }

    /* JADX INFO: compiled from: ListAuthenticatorsDataSource.kt */
    public static final class b extends Lambda implements Function1<NetworkResponse, Throwable> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f27808p0 = new b(1);

        @Override // kotlin.jvm.functions.Function1
        public final Throwable invoke(NetworkResponse networkResponse) {
            NetworkResponse response = networkResponse;
            Intrinsics.checkNotNullParameter(response, "response");
            return new ConnectionException("list authenticators request error", response, null, 4, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ListAuthenticatorsDataSource(@NotNull NetworkWorker worker, @NotNull NaturalAuthEndpoints endpoints, @NotNull Mapper<? super ListAuthenticatorsParams, ? extends Map<String, String>> queryParamsParser, @NotNull Mapper<? super String, ? extends List<? extends FidoDevice>> responseParser) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(endpoints, "endpoints");
        Intrinsics.checkNotNullParameter(queryParamsParser, "queryParamsParser");
        Intrinsics.checkNotNullParameter(responseParser, "responseParser");
        this.f27804a = worker;
        this.f27805b = endpoints;
        this.f27806c = queryParamsParser;
        this.f27807d = responseParser;
    }

    @NotNull
    public final List<FidoDevice> listAuthenticators(@NotNull ListAuthenticatorsParams params) {
        Intrinsics.checkNotNullParameter(params, "params");
        return (List) NetworkResponseExtensionsKt.resultOrThrow(EndpointExtensionsKt.executeRequest$default(this.f27805b.getListAuthenticators(), this.f27804a, null, null, this.f27806c.map(params), 6, null), new a(this.f27807d), b.f27808p0);
    }
}
