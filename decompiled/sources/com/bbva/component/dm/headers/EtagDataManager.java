package com.bbva.component.dm.headers;

import com.bbva.cells.component.kit.datamanager.DataManager;
import com.bbva.cellscore.reactor.f;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.network.NetworkWorker;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EtagDataManager.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0014J\b\u0010\u0005\u001a\u00020\u0004H\u0016R.\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/bbva/component/dm/headers/EtagDataManager;", "Lcom/bbva/cells/component/kit/datamanager/DataManager;", "", "onPropertiesBound", "", "getId", "", "whiteList", "Ljava/util/Map;", "getWhiteList", "()Ljava/util/Map;", "setWhiteList", "(Ljava/util/Map;)V", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "Lcom/bbva/glomo/storage/MainStorage;", "store", "<init>", "(Lcom/bbva/network/NetworkWorker;Lcom/bbva/glomo/storage/MainStorage;)V", "Companion", "component-dm-cacheheaders_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nEtagDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EtagDataManager.kt\ncom/bbva/component/dm/headers/EtagDataManager\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,40:1\n125#2:41\n152#2,3:42\n*S KotlinDebug\n*F\n+ 1 EtagDataManager.kt\ncom/bbva/component/dm/headers/EtagDataManager\n*L\n27#1:41\n27#1:42,3\n*E\n"})
public final class EtagDataManager extends DataManager {

    @NotNull
    public static final String ID = "component-ic-cacheheaders";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final NetworkWorker f27651p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final MainStorage f27652q0;
    public Map<String, String> whiteList;

    public EtagDataManager(@NotNull NetworkWorker networkWorker, @NotNull MainStorage store) {
        Intrinsics.checkNotNullParameter(networkWorker, "networkWorker");
        Intrinsics.checkNotNullParameter(store, "store");
        this.f27651p0 = networkWorker;
        this.f27652q0 = store;
        newProperty("whitelist", new f(this, 1));
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF32219p0() {
        return ID;
    }

    @NotNull
    public final Map<String, String> getWhiteList() {
        Map<String, String> map = this.whiteList;
        if (map != null) {
            return map;
        }
        Intrinsics.throwUninitializedPropertyAccessException("whiteList");
        return null;
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent
    public void onPropertiesBound() {
        super.onPropertiesBound();
        Map<String, String> whiteList = getWhiteList();
        ArrayList arrayList = new ArrayList(whiteList.size());
        for (Map.Entry<String, String> entry : whiteList.entrySet()) {
            arrayList.add(new WhitelistedUrl(entry.getKey(), new Regex(entry.getValue())));
        }
        this.f27651p0.addInterceptor(new EtagInterceptor(arrayList, this.f27652q0));
    }

    public final void setWhiteList(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.whiteList = map;
    }
}
