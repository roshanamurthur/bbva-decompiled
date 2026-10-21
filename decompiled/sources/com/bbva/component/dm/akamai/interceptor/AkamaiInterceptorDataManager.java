package com.bbva.component.dm.akamai.interceptor;

import android.app.Application;
import com.akamai.botman.CYFMonitor;
import com.bbva.cells.component.kit.datamanager.DataManager;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.component.dm.akamai.interceptor.interceptors.AkamaiBotInterceptor;
import com.bbva.component.dm.akamai.interceptor.models.AkamaiErrorType;
import com.bbva.nativesettings.common.Constants;
import com.bbva.network.NetworkWorker;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: AkamaiInterceptorDataManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0014R6\u0010\t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u00068\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/bbva/component/dm/akamai/interceptor/AkamaiInterceptorDataManager;", "Lcom/bbva/cells/component/kit/datamanager/DataManager;", "", "getId", "", "onPropertiesBound", "", "", "", "endpointsSecurity", "Ljava/util/List;", "getEndpointsSecurity$component_ic_akamai_release", "()Ljava/util/List;", "setEndpointsSecurity$component_ic_akamai_release", "(Ljava/util/List;)V", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "Landroid/app/Application;", Constants.APPLICATION, "<init>", "(Lcom/bbva/network/NetworkWorker;Landroid/app/Application;)V", "Companion", "component-ic-akamai_release"}, k = 1, mv = {1, 8, 0})
public final class AkamaiInterceptorDataManager extends DataManager {

    @NotNull
    public static final String ID = "component-dm-akamai-interceptor";
    public List<? extends Map<String, ? extends Object>> endpointsSecurity;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f27394p0;

    @JvmField
    @NotNull
    public static final ActionSpec<Object> AKAMAI_BOT_ERROR = new ActionSpec<>("akamai-bot-error");

    /* JADX INFO: compiled from: AkamaiInterceptorDataManager.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function1<AkamaiErrorType, Unit> {
        public a(Object obj) {
            super(1, obj, AkamaiInterceptorDataManager.class, "onAkamaiInterceptorListener", "onAkamaiInterceptorListener(Lcom/bbva/component/dm/akamai/interceptor/models/AkamaiErrorType;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(AkamaiErrorType akamaiErrorType) {
            AkamaiErrorType p4 = akamaiErrorType;
            Intrinsics.checkNotNullParameter(p4, "p0");
            AkamaiInterceptorDataManager.access$onAkamaiInterceptorListener((AkamaiInterceptorDataManager) this.receiver, p4);
            return Unit.INSTANCE;
        }
    }

    public AkamaiInterceptorDataManager(@NotNull NetworkWorker networkWorker, @NotNull Application application) {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        Intrinsics.checkNotNullParameter(application, "application");
        this.f27394p0 = networkWorker;
        newProperty("endpointsAkamai", new q4.a(this, 0));
        CYFMonitor.initialize(application);
    }

    public static final void access$onAkamaiInterceptorListener(AkamaiInterceptorDataManager akamaiInterceptorDataManager, AkamaiErrorType akamaiErrorType) {
        akamaiInterceptorDataManager.getClass();
        if (akamaiErrorType == AkamaiErrorType.BOT_ERROR) {
            akamaiInterceptorDataManager.fire(AKAMAI_BOT_ERROR);
        }
    }

    @NotNull
    public final List<Map<String, Object>> getEndpointsSecurity$component_ic_akamai_release() {
        List list = this.endpointsSecurity;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("endpointsSecurity");
        return null;
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF32219p0() {
        return ID;
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent
    public void onPropertiesBound() {
        super.onPropertiesBound();
        this.f27394p0.addInterceptor(new AkamaiBotInterceptor(new a(this), new EndPointChecker(getEndpointsSecurity$component_ic_akamai_release()), new AkamaiSensorInfo(), null, 8, null));
    }

    public final void setEndpointsSecurity$component_ic_akamai_release(@NotNull List<? extends Map<String, ? extends Object>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.endpointsSecurity = list;
    }
}
