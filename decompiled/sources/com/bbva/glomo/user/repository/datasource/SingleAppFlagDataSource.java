package com.bbva.glomo.user.repository.datasource;

import com.bbva.glomo.localstorage.LocalStorageConstantsKt;
import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import com.bbva.glomoutils.mappable.MappableEngineKt;
import com.google.gson.JsonElement;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SingleAppFlagDataSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/bbva/glomo/user/repository/datasource/SingleAppFlagDataSource;", "", "", "getSingleAppFlag", "()Ljava/lang/Boolean;", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "gl-user-domain_release"}, k = 1, mv = {1, 9, 0})
public final class SingleAppFlagDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f30888a;

    public SingleAppFlagDataSource(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f30888a = storage;
    }

    @Nullable
    public final Boolean getSingleAppFlag() {
        JsonElement jsonElement = this.f30888a.getJson(LocalStorageConstantsKt.KEY_FEATURE_FLAGS, true, TargetStorage.Local).get("featureFlagCollection");
        Map<String, Object> map = jsonElement != null ? MappableEngineKt.toMap(jsonElement) : null;
        Object obj = map != null ? map.get("glomo.profile.singleApp") : null;
        Map map2 = obj instanceof Map ? (Map) obj : null;
        Object obj2 = map2 != null ? map2.get("value") : null;
        if (obj2 instanceof Boolean) {
            return (Boolean) obj2;
        }
        return null;
    }
}
