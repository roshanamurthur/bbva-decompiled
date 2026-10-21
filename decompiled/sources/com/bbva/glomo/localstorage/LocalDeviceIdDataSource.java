package com.bbva.glomo.localstorage;

import com.bbva.glomo.storage.MainStorage;
import com.bbva.glomo.storage.TargetStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocalDeviceIdDataSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Lcom/bbva/glomo/localstorage/LocalDeviceIdDataSource;", "Lcom/bbva/glomo/localstorage/DeviceIdDataSource;", "", "getDeviceId", "deviceId", "", "persistDeviceId", "Lcom/bbva/glomo/storage/MainStorage;", "storage", "<init>", "(Lcom/bbva/glomo/storage/MainStorage;)V", "Companion", "gl-local-storage_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLocalDeviceIdDataSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalDeviceIdDataSource.kt\ncom/bbva/glomo/localstorage/LocalDeviceIdDataSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class LocalDeviceIdDataSource implements DeviceIdDataSource {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final MainStorage f30674a;

    public LocalDeviceIdDataSource(@NotNull MainStorage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f30674a = storage;
    }

    @Override // com.bbva.glomo.localstorage.DeviceIdDataSource
    @Nullable
    public String getDeviceId() {
        String string$default = MainStorage.getString$default(this.f30674a, "deviceId", null, false, TargetStorage.Local, 6, null);
        if (!(true ^ (string$default == null || string$default.length() == 0))) {
            string$default = null;
        }
        if (string$default == null) {
            string$default = MainStorage.getString$default(this.f30674a, "external-device-id", null, false, TargetStorage.Shared, 6, null);
            if (string$default == null) {
                return null;
            }
            persistDeviceId(string$default);
        }
        return string$default;
    }

    @Override // com.bbva.glomo.localstorage.DeviceIdDataSource
    public void persistDeviceId(@NotNull String deviceId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        MainStorage.put$default(this.f30674a, "deviceId", deviceId, false, TargetStorage.Local, 4, null);
    }
}
