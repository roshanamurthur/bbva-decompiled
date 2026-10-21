package com.bbva.component.dm.aem.data;

import com.bbva.cells.componentkit.model.FetchResult;
import com.bbva.component.dm.aem.data.model.AEMContent;
import com.bbva.component.dm.aem.data.model.AEMRequest;
import com.bbva.network.NetworkWorker;
import com.bbva.network.constant.Method;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.request.MutableNetworkRequestKt;
import com.bbva.plugin.filefetcher.command.FetchCommand;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AEMDataSource.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\r"}, d2 = {"Lcom/bbva/component/dm/aem/data/AEMDataSource;", "", "Lcom/bbva/component/dm/aem/data/model/AEMRequest;", "AEMRequest", "Lcom/bbva/cells/componentkit/model/FetchResult;", "Lcom/bbva/component/dm/aem/data/model/AEMContent;", FetchCommand.ID, "Lcom/bbva/network/NetworkWorker;", "worker", "Lcom/bbva/component/dm/aem/data/AEMResponseMapper;", "mapper", "<init>", "(Lcom/bbva/network/NetworkWorker;Lcom/bbva/component/dm/aem/data/AEMResponseMapper;)V", "component-dm-aem_release"}, k = 1, mv = {1, 5, 1})
public final class AEMDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f27378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AEMResponseMapper f27379b;

    /* JADX INFO: compiled from: AEMDataSource.kt */
    public static final class a extends Lambda implements Function1<MutableNetworkRequest, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ AEMRequest f27380p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AEMRequest aEMRequest) {
            super(1);
            this.f27380p0 = aEMRequest;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(MutableNetworkRequest mutableNetworkRequest) {
            MutableNetworkRequest request = mutableNetworkRequest;
            Intrinsics.checkNotNullParameter(request, "$this$request");
            request.setMethod(Method.GET);
            AEMRequest aEMRequest = this.f27380p0;
            request.setUrl(Intrinsics.stringPlus(aEMRequest.getHost(), aEMRequest.getPath()));
            return Unit.INSTANCE;
        }
    }

    public AEMDataSource(@NotNull NetworkWorker worker, @NotNull AEMResponseMapper mapper) {
        Intrinsics.checkNotNullParameter(worker, "worker");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f27378a = worker;
        this.f27379b = mapper;
    }

    @NotNull
    public final FetchResult<AEMContent> fetch(@NotNull AEMRequest AEMRequest) throws IOException {
        Intrinsics.checkNotNullParameter(AEMRequest, "AEMRequest");
        return this.f27379b.map(this.f27378a.execute(MutableNetworkRequestKt.request(new a(AEMRequest))).getBody().string());
    }
}
