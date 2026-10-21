package com.bbva.component.dm.headers.interceptor;

import com.bbva.cells.component.kit.datamanager.DataManager;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.network.NetworkWorker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HeadersInterceptorDataManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0014J\u0016\u0010\b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002R4\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\n0\t8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lcom/bbva/component/dm/headers/interceptor/HeadersInterceptorDataManager;", "Lcom/bbva/cells/component/kit/datamanager/DataManager;", "", "getId", "", "onPropertiesBound", "token", "idToken", "setToken", "", "", "", "endpointsSecurityMaps", "Ljava/util/List;", "getEndpointsSecurityMaps$component_ic_token_release", "()Ljava/util/List;", "setEndpointsSecurityMaps$component_ic_token_release", "(Ljava/util/List;)V", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "<init>", "(Lcom/bbva/network/NetworkWorker;)V", "Companion", "component-ic-token_release"}, k = 1, mv = {1, 8, 0})
public final class HeadersInterceptorDataManager extends DataManager {

    @NotNull
    public static final String ID = "component-dm-headers-interceptor";
    public List<? extends Map<String, ? extends Object>> endpointsSecurityMaps;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f27661p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final LinkedHashMap f27662q0;

    @JvmField
    @NotNull
    public static final ActionSpec<AccessToken> ACCESS_TOKEN_CHANGE = new ActionSpec<>("access-token-change");

    public HeadersInterceptorDataManager(@NotNull NetworkWorker networkWorker) {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        this.f27661p0 = networkWorker;
        this.f27662q0 = new LinkedHashMap();
        newProperty("endpointsSecurity", new i4.a(this, 1));
    }

    @NotNull
    public final List<Map<String, Object>> getEndpointsSecurityMaps$component_ic_token_release() {
        List list = this.endpointsSecurityMaps;
        if (list != null) {
            return list;
        }
        Intrinsics.throwUninitializedPropertyAccessException("endpointsSecurityMaps");
        return null;
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getK0() {
        return ID;
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent
    public void onPropertiesBound() {
        LinkedHashMap linkedHashMap;
        super.onPropertiesBound();
        Iterator<Map<String, Object>> it = getEndpointsSecurityMaps$component_ic_token_release().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            linkedHashMap = this.f27662q0;
            if (!zHasNext) {
                break;
            }
            EndpointsSecurity endpointsSecurity = new EndpointsSecurity(it.next());
            String id$component_ic_token_release = endpointsSecurity.getId$component_ic_token_release();
            if (id$component_ic_token_release != null) {
                linkedHashMap.put(id$component_ic_token_release, Intrinsics.areEqual(endpointsSecurity.getType$component_ic_token_release(), AccessToken.TYPE_JWT) ? new JwtInterceptor(new a(this), endpointsSecurity) : new TsecInterceptor(new b(this), endpointsSecurity));
            }
        }
        Iterator it2 = linkedHashMap.values().iterator();
        while (it2.hasNext()) {
            this.f27661p0.addInterceptor((TokenInterceptor) it2.next());
        }
    }

    public final void setEndpointsSecurityMaps$component_ic_token_release(@NotNull List<? extends Map<String, ? extends Object>> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.endpointsSecurityMaps = list;
    }

    public final void setToken(@NotNull String token, @NotNull String idToken) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(idToken, "idToken");
        TokenInterceptor tokenInterceptor = (TokenInterceptor) this.f27662q0.get(idToken);
        if (tokenInterceptor != null) {
            tokenInterceptor.setToken(token, idToken);
        }
    }
}
