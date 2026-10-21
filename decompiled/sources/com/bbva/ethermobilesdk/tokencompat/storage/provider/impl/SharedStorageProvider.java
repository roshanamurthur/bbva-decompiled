package com.bbva.ethermobilesdk.tokencompat.storage.provider.impl;

import android.content.Context;
import com.bbva.ethermobilesdk.tokencompat.extension.ContextKt;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.LegacyToken;
import com.bbva.ethermobilesdk.tokencompat.storage.shared.LegacySharedStorage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SharedStorageProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8\u0016X\u0096D¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001c"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/storage/provider/impl/SharedStorageProvider;", "Lcom/bbva/ethermobilesdk/tokencompat/storage/provider/impl/BaseStorageProvider;", "Lcom/bbva/ethermobilesdk/tokencompat/storage/shared/LegacySharedStorage;", "b", "Lcom/bbva/ethermobilesdk/tokencompat/storage/shared/LegacySharedStorage;", "getStorage", "()Lcom/bbva/ethermobilesdk/tokencompat/storage/shared/LegacySharedStorage;", "storage", "", "c", "Ljava/lang/String;", "getTokenSerializationKey", "()Ljava/lang/String;", "tokenSerializationKey", "d", "getDeviceId", "deviceId", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$UUIDType;", "e", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$UUIDType;", "getUuidType", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$UUIDType;", "uuidType", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public final class SharedStorageProvider extends BaseStorageProvider {

    @NotNull
    public static final String TOKEN_REPOSITORY_KEY = "tserialization";

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LegacySharedStorage storage;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tokenSerializationKey;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String deviceId;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LegacyToken.UUIDType uuidType;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedStorageProvider(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.storage = new LegacySharedStorage(context);
        this.tokenSerializationKey = TOKEN_REPOSITORY_KEY;
        this.deviceId = ContextKt.androidFirstInstallTimeDeviceInfoOrThrow(context);
        this.uuidType = LegacyToken.UUIDType.ANDROID_OS_INSTALLATION;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.storage.provider.StorageProvider
    @NotNull
    public String getDeviceId() {
        return this.deviceId;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.storage.provider.StorageProvider
    @NotNull
    public String getTokenSerializationKey() {
        return this.tokenSerializationKey;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.storage.provider.StorageProvider
    @NotNull
    public LegacyToken.UUIDType getUuidType() {
        return this.uuidType;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.storage.provider.StorageProvider
    @NotNull
    public LegacySharedStorage getStorage() {
        return this.storage;
    }
}
