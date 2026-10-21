package com.bbva.component.dm.singlesignon.data;

import com.bbva.cells.componentkit.model.FetchResult;
import com.bbva.component.dm.singlesignon.data.model.SingleSignOnBody;
import com.bbva.component.dm.singlesignon.data.model.SingleSignOnRequest;
import com.bbva.component.dm.singlesignon.data.model.SingleSignOnResponse;
import com.bbva.network.NetworkWorker;
import com.bbva.network.constant.Method;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequestKt;
import com.bbva.network.model.request.NetworkRequestBody;
import com.bbva.plugin.filefetcher.command.FetchCommand;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SingleSignOnDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/bbva/component/dm/singlesignon/data/SingleSignOnDataSource;", "", "Lcom/bbva/component/dm/singlesignon/data/model/SingleSignOnRequest;", "params", "Lcom/bbva/cells/componentkit/model/FetchResult;", "Lcom/bbva/component/dm/singlesignon/data/model/SingleSignOnResponse;", FetchCommand.ID, "Lcom/bbva/network/NetworkWorker;", "worker", "Lcom/bbva/component/dm/singlesignon/data/SSOResponseMapper;", "mapper", "<init>", "(Lcom/bbva/network/NetworkWorker;Lcom/bbva/component/dm/singlesignon/data/SSOResponseMapper;)V", "component-dm-singlesignon_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSingleSignOnDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleSignOnDataSource.kt\ncom/bbva/component/dm/singlesignon/data/SingleSignOnDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
public final class SingleSignOnDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f28061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SSOResponseMapper f28062b;

    /* JADX INFO: compiled from: SingleSignOnDataSource.kt */
    @SourceDebugExtension({"SMAP\nSingleSignOnDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SingleSignOnDataSource.kt\ncom/bbva/component/dm/singlesignon/data/SingleSignOnDataSource$fetch$request$1\n+ 2 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n+ 3 Serializers.kt\nkotlinx/serialization/SerializersKt__SerializersKt\n+ 4 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n*L\n1#1,29:1\n113#2:30\n32#3:31\n80#4:32\n*S KotlinDebug\n*F\n+ 1 SingleSignOnDataSource.kt\ncom/bbva/component/dm/singlesignon/data/SingleSignOnDataSource$fetch$request$1\n*L\n23#1:30\n23#1:31\n23#1:32\n*E\n"})
    public static final class a extends Lambda implements Function1<MutableNetworkRequest, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ SingleSignOnRequest f28063p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SingleSignOnRequest singleSignOnRequest) {
            super(1);
            this.f28063p0 = singleSignOnRequest;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
            MutableNetworkRequest request = mutableNetworkRequest;
            Intrinsics.checkNotNullParameter(request, "$this$request");
            SingleSignOnRequest singleSignOnRequest = this.f28063p0;
            request.setUrl(singleSignOnRequest.getHost() + singleSignOnRequest.getPath());
            request.setMethod(Method.POST);
            Json.Companion companion = Json.INSTANCE;
            SingleSignOnBody body = singleSignOnRequest.getBody();
            KSerializer<Object> kSerializerSerializer = SerializersKt.serializer(companion.getSerializersModule(), Reflection.typeOf(SingleSignOnBody.class));
            Intrinsics.checkNotNull(kSerializerSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            byte[] bytes = companion.encodeToString(kSerializerSerializer, body).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            request.setBody(new NetworkRequestBody.RequestBody(bytes, "application/json"));
            return Unit.INSTANCE;
        }
    }

    public SingleSignOnDataSource(@NotNull NetworkWorker worker, @NotNull SSOResponseMapper mapper) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f28061a = worker;
        this.f28062b = mapper;
    }

    @NotNull
    public final FetchResult<SingleSignOnResponse> fetch(@NotNull SingleSignOnRequest params) throws IOException {
        Intrinsics.checkNotNullParameter(params, "params");
        return this.f28062b.map(this.f28061a.execute(MutableNetworkRequestKt.request(new a(params))).getBody().string());
    }
}
