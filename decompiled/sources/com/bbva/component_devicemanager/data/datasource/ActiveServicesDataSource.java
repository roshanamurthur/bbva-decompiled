package com.bbva.component_devicemanager.data.datasource;

import com.bbva.component_devicemanager.domain.model.ActiveServices;
import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomoutils.mappable.MappableEngineKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ActiveServicesDataSource.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/bbva/component_devicemanager/data/datasource/ActiveServicesDataSource;", "", "Lcom/bbva/component_devicemanager/domain/model/ActiveServices;", "getActiveServices", "Lcom/bbva/glomo/storage/MainStorage;", "a", "Lcom/bbva/glomo/storage/MainStorage;", "getStorage", "()Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "Companion", "component-devicemanager_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class ActiveServicesDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MainStorage storage;

    public ActiveServicesDataSource(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.storage = storage;
    }

    @NotNull
    public final ActiveServices getActiveServices() {
        Map<String, Object> map = MappableEngineKt.toMap(MainStorage.getJson$default(this.storage, LocalStorageConstantsKt.KEY_VALUE_DISCREET_MODE, false, null, 6, null));
        Object obj = map.get("discreetModeFace");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        Object obj2 = map.get("discreetModeGesture");
        Boolean bool2 = obj2 instanceof Boolean ? (Boolean) obj2 : null;
        Object obj3 = map.get("discreetModeMonitoring");
        Boolean bool3 = obj3 instanceof Boolean ? (Boolean) obj3 : null;
        Boolean bool4 = Boolean.TRUE;
        return new ActiveServices(Intrinsics.areEqual(bool, bool4) || Intrinsics.areEqual(bool2, bool4) || Intrinsics.areEqual(bool3, bool4));
    }

    @NotNull
    public final MainStorage getStorage() {
        return this.storage;
    }
}
