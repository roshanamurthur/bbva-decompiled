package com.bbva.component.dm.akamai.interceptor.interceptors;

import bk.q;
import com.bbva.component.dm.akamai.interceptor.AkamaiResponseVerifier;
import com.bbva.component.dm.akamai.interceptor.EndPointChecker;
import com.bbva.component.dm.akamai.interceptor.SensorInfo;
import com.bbva.component.dm.akamai.interceptor.models.AkamaiErrorType;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.MutableNetworkResponse;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AkamaiBotInterceptor.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB9\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tj\u0002`\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R*\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\tj\u0002`\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/bbva/component/dm/akamai/interceptor/interceptors/AkamaiBotInterceptor;", "Lcom/bbva/component/dm/akamai/interceptor/interceptors/AkamaiInterceptor;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "request", "", "onRequest", "Lcom/bbva/network/model/response/MutableNetworkResponse;", DigipassManagerConstants.KEY_RESPONSE, "onResponse", "Lkotlin/Function1;", "Lcom/bbva/component/dm/akamai/interceptor/models/AkamaiErrorType;", "Lcom/bbva/component/dm/akamai/interceptor/AkamaiInterceptorListener;", "d", "Lkotlin/jvm/functions/Function1;", "getAkamaiListener", "()Lkotlin/jvm/functions/Function1;", "akamaiListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/bbva/component/dm/akamai/interceptor/EndPointChecker;", "endpointChecker", "Lcom/bbva/component/dm/akamai/interceptor/SensorInfo;", "akamaiSensorInfo", "Lcom/bbva/component/dm/akamai/interceptor/AkamaiResponseVerifier;", "responseVerifier", "<init>", "(Lkotlin/jvm/functions/Function1;Lcom/bbva/component/dm/akamai/interceptor/EndPointChecker;Lcom/bbva/component/dm/akamai/interceptor/SensorInfo;Lcom/bbva/component/dm/akamai/interceptor/AkamaiResponseVerifier;)V", "Companion", "component-ic-akamai_release"}, k = 1, mv = {1, 8, 0})
public final class AkamaiBotInterceptor implements AkamaiInterceptor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final EndPointChecker f27396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SensorInfo f27397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AkamaiResponseVerifier f27398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<AkamaiErrorType, Unit> akamaiListener;

    /* JADX INFO: compiled from: AkamaiBotInterceptor.kt */
    public static final class a extends Lambda implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AkamaiBotInterceptor.this.notify(AkamaiErrorType.BOT_ERROR);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AkamaiBotInterceptor(@NotNull Function1<? super AkamaiErrorType, Unit> listener, @NotNull EndPointChecker endpointChecker, @NotNull SensorInfo akamaiSensorInfo, @NotNull AkamaiResponseVerifier responseVerifier) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(endpointChecker, "endpointChecker");
        Intrinsics.checkNotNullParameter(akamaiSensorInfo, "akamaiSensorInfo");
        Intrinsics.checkNotNullParameter(responseVerifier, "responseVerifier");
        this.f27396a = endpointChecker;
        this.f27397b = akamaiSensorInfo;
        this.f27398c = responseVerifier;
        this.akamaiListener = listener;
    }

    @Override // com.bbva.component.dm.akamai.interceptor.interceptors.AkamaiInterceptor
    @NotNull
    public Function1<AkamaiErrorType, Unit> getAkamaiListener() {
        return this.akamaiListener;
    }

    @Override // com.bbva.component.dm.akamai.interceptor.interceptors.AkamaiInterceptor
    public void notify(@NotNull AkamaiErrorType akamaiErrorType) {
        AkamaiInterceptor.DefaultImpls.notify(this, akamaiErrorType);
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onRequest(@NotNull MutableNetworkRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        if (this.f27396a.check(request.getUrl(), request.getMethod())) {
            request.setHeaders(q.plus(request.getHeaders(), TuplesKt.to("X-acf-sensor-data", this.f27397b.getData())));
        }
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onResponse(@NotNull MutableNetworkResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
        if (this.f27396a.check(response.getRequest().getUrl(), response.getRequest().getMethod())) {
            this.f27398c.isABotError(response, new a());
        }
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public boolean verifyConnection(@NotNull String str, @NotNull SSLSession sSLSession) {
        return AkamaiInterceptor.DefaultImpls.verifyConnection(this, str, sSLSession);
    }

    public /* synthetic */ AkamaiBotInterceptor(Function1 function1, EndPointChecker endPointChecker, SensorInfo sensorInfo, AkamaiResponseVerifier akamaiResponseVerifier, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, endPointChecker, sensorInfo, (i10 & 8) != 0 ? new AkamaiResponseVerifier() : akamaiResponseVerifier);
    }
}
