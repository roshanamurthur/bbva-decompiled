package com.bbva.glomo.semaas.interceptor;

import com.bbva.cells.component.kit.datamanager.DataManager;
import com.bbva.glomo.semaas.data.SemaasInterceptorDataProvider;
import com.bbva.glomo.semaas.interceptor.model.LoggableRequest;
import com.bbva.network.NetworkWorker;
import i5.e;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SemaasInterceptorDataManager.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0014R(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\r8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, d2 = {"Lcom/bbva/glomo/semaas/interceptor/SemaasInterceptorDataManager;", "Lcom/bbva/cells/component/kit/datamanager/DataManager;", "", "getId", "", "onPropertiesBound", "", "whiteList", "Ljava/util/List;", "getWhiteList$glomo_semaas_release", "()Ljava/util/List;", "setWhiteList$glomo_semaas_release", "(Ljava/util/List;)V", "", "headers", "Ljava/util/Map;", "getHeaders$glomo_semaas_release", "()Ljava/util/Map;", "setHeaders$glomo_semaas_release", "(Ljava/util/Map;)V", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "Lcom/bbva/glomo/semaas/interceptor/RequestsTracer;", "requestTracer", "Lcom/bbva/glomo/semaas/data/SemaasInterceptorDataProvider;", "dataProvider", "<init>", "(Lcom/bbva/network/NetworkWorker;Lcom/bbva/glomo/semaas/interceptor/RequestsTracer;Lcom/bbva/glomo/semaas/data/SemaasInterceptorDataProvider;)V", "Companion", "glomo-semaas_release"}, k = 1, mv = {1, 9, 0})
public final class SemaasInterceptorDataManager extends DataManager {

    @NotNull
    public static final String ID = "component-ic-semaas";
    public Map<String, String> headers;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f30759p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final RequestsTracer f30760q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final SemaasInterceptorDataProvider f30761r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final SemaasInterceptorHeaderConverter f30762s0;
    public List<String> whiteList;

    /* JADX INFO: compiled from: SemaasInterceptorDataManager.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<LoggableRequest, Unit> {
        public a(Object obj) {
            super(1, obj, SemaasInterceptorDataManager.class, "onFinishedRequest", "onFinishedRequest(Lcom/bbva/glomo/semaas/interceptor/model/LoggableRequest;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LoggableRequest loggableRequest) {
            LoggableRequest p4 = loggableRequest;
            Intrinsics.checkNotNullParameter(p4, "p0");
            SemaasInterceptorDataManager.access$onFinishedRequest((SemaasInterceptorDataManager) this.receiver, p4);
            return Unit.INSTANCE;
        }
    }

    public SemaasInterceptorDataManager(@NotNull NetworkWorker networkWorker, @NotNull RequestsTracer requestTracer, @NotNull SemaasInterceptorDataProvider dataProvider) {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        Intrinsics.checkNotNullParameter(requestTracer, "requestTracer");
        Intrinsics.checkNotNullParameter(dataProvider, "dataProvider");
        this.f30759p0 = networkWorker;
        this.f30760q0 = requestTracer;
        this.f30761r0 = dataProvider;
        this.f30762s0 = new SemaasInterceptorHeaderConverter();
        newProperty("whiteList", new e(this, 1));
        newProperty("headers", new m4.a(this, 2));
    }

    public static final void access$onFinishedRequest(SemaasInterceptorDataManager semaasInterceptorDataManager, LoggableRequest loggableRequest) {
        semaasInterceptorDataManager.f30760q0.trace(loggableRequest.getStart(), loggableRequest.getEnd(), semaasInterceptorDataManager.f30762s0.convert(semaasInterceptorDataManager.getHeaders$glomo_semaas_release(), loggableRequest.allHeaders()));
    }

    @NotNull
    public final Map<String, String> getHeaders$glomo_semaas_release() {
        Map<String, String> map = this.headers;
        if (map != null) {
            return map;
        }
        Intrinsics.throwUninitializedPropertyAccessException("headers");
        return null;
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF32219p0() {
        return ID;
    }

    @NotNull
    public final List<String> getWhiteList$glomo_semaas_release() {
        List<String> list = this.whiteList;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("whiteList");
        return null;
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent
    public void onPropertiesBound() {
        super.onPropertiesBound();
        this.f30759p0.addInterceptor(new SemaasInterceptor(getWhiteList$glomo_semaas_release(), new a(this), this.f30761r0));
    }

    public final void setHeaders$glomo_semaas_release(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.headers = map;
    }

    public final void setWhiteList$glomo_semaas_release(@NotNull List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.whiteList = list;
    }
}
