package com.bbva.ethermobilesdk.tokencompat.storage.provider;

import com.bbva.ethermobilesdk.token.storage.Storage;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.LegacyToken;
import com.bbva.ethermobilesdk.tokencompat.storage.LegacyStorage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: StorageProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0005R\u0012\u0010\u0010\u001a\u00020\u0011X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/storage/provider/StorageProvider;", "", "deviceId", "", "getDeviceId", "()Ljava/lang/String;", "storage", "Lcom/bbva/ethermobilesdk/tokencompat/storage/LegacyStorage;", "getStorage", "()Lcom/bbva/ethermobilesdk/tokencompat/storage/LegacyStorage;", "tempStorage", "Lcom/bbva/ethermobilesdk/token/storage/Storage;", "getTempStorage", "()Lcom/bbva/ethermobilesdk/token/storage/Storage;", "tokenSerializationKey", "getTokenSerializationKey", "uuidType", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$UUIDType;", "getUuidType", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$UUIDType;", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface StorageProvider {
    @NotNull
    String getDeviceId();

    @NotNull
    LegacyStorage getStorage();

    @NotNull
    Storage getTempStorage();

    @NotNull
    String getTokenSerializationKey();

    @NotNull
    LegacyToken.UUIDType getUuidType();
}
