package com.bbva.ethermobilesdk.tokencompat.crypto;

import com.bbva.ethermobilesdk.tokencompat.model.legacy.LegacyToken;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: CryptoProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0005R\u0012\u0010\b\u001a\u00020\tX¦\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/crypto/CryptoProvider;", "", "deviceInfo", "", "getDeviceInfo", "()Ljava/lang/String;", "pin", "getPin", "uuidType", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$UUIDType;", "getUuidType", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$UUIDType;", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface CryptoProvider {
    @NotNull
    String getDeviceInfo();

    @NotNull
    String getPin();

    @NotNull
    LegacyToken.UUIDType getUuidType();
}
