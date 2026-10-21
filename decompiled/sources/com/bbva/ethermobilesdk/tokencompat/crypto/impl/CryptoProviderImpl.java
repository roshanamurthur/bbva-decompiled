package com.bbva.ethermobilesdk.tokencompat.crypto.impl;

import androidx.constraintlayout.core.parser.a;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ethermobilesdk.tokencompat.crypto.CryptoProvider;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.LegacyToken;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CryptoProviderImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0080\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\b\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/crypto/impl/CryptoProviderImpl;", "Lcom/bbva/ethermobilesdk/tokencompat/crypto/CryptoProvider;", "", "component1", "component2", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$UUIDType;", "component3", "deviceInfo", "pin", "uuidType", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Ljava/lang/String;", "getDeviceInfo", "()Ljava/lang/String;", "b", "getPin", "c", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$UUIDType;", "getUuidType", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$UUIDType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$UUIDType;)V", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CryptoProviderImpl implements CryptoProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String deviceInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String pin;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LegacyToken.UUIDType uuidType;

    public CryptoProviderImpl(@NotNull String deviceInfo, @NotNull String pin, @NotNull LegacyToken.UUIDType uuidType) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(uuidType, "uuidType");
        this.deviceInfo = deviceInfo;
        this.pin = pin;
        this.uuidType = uuidType;
    }

    public static /* synthetic */ CryptoProviderImpl copy$default(CryptoProviderImpl cryptoProviderImpl, String str, String str2, LegacyToken.UUIDType uUIDType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = cryptoProviderImpl.getDeviceInfo();
        }
        if ((i10 & 2) != 0) {
            str2 = cryptoProviderImpl.getPin();
        }
        if ((i10 & 4) != 0) {
            uUIDType = cryptoProviderImpl.getUuidType();
        }
        return cryptoProviderImpl.copy(str, str2, uUIDType);
    }

    @NotNull
    public final String component1() {
        return getDeviceInfo();
    }

    @NotNull
    public final String component2() {
        return getPin();
    }

    @NotNull
    public final LegacyToken.UUIDType component3() {
        return getUuidType();
    }

    @NotNull
    public final CryptoProviderImpl copy(@NotNull String deviceInfo, @NotNull String pin, @NotNull LegacyToken.UUIDType uuidType) {
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(uuidType, "uuidType");
        return new CryptoProviderImpl(deviceInfo, pin, uuidType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoProviderImpl)) {
            return false;
        }
        CryptoProviderImpl cryptoProviderImpl = (CryptoProviderImpl) other;
        return Intrinsics.areEqual(getDeviceInfo(), cryptoProviderImpl.getDeviceInfo()) && Intrinsics.areEqual(getPin(), cryptoProviderImpl.getPin()) && getUuidType() == cryptoProviderImpl.getUuidType();
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.crypto.CryptoProvider
    @NotNull
    public String getDeviceInfo() {
        return this.deviceInfo;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.crypto.CryptoProvider
    @NotNull
    public String getPin() {
        return this.pin;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.crypto.CryptoProvider
    @NotNull
    public LegacyToken.UUIDType getUuidType() {
        return this.uuidType;
    }

    public int hashCode() {
        return getUuidType().hashCode() + ((getPin().hashCode() + (getDeviceInfo().hashCode() * 31)) * 31);
    }

    @NotNull
    public String toString() {
        String deviceInfo = getDeviceInfo();
        String pin = getPin();
        LegacyToken.UUIDType uuidType = getUuidType();
        StringBuilder sbC = a.c("CryptoProviderImpl(deviceInfo=", deviceInfo, ", pin=", pin, ", uuidType=");
        sbC.append(uuidType);
        sbC.append(")");
        return sbC.toString();
    }
}
