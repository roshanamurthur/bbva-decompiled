package com.bbva.component.dm.settings.domain.model;

import androidx.appcompat.widget.a;
import com.bbva.ethermobilesdk.devicechecker.emulator.EmulatorApi;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppVersionConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/SdkVersion;", "", "", "component1", "component2", EmulatorApi.SDK, "minVersion", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSdk", "()I", "b", "getMinVersion", "<init>", "(II)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class SdkVersion {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int sdk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int minVersion;

    public SdkVersion(int i10, int i11) {
        this.sdk = i10;
        this.minVersion = i11;
    }

    public static /* synthetic */ SdkVersion copy$default(SdkVersion sdkVersion, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = sdkVersion.sdk;
        }
        if ((i12 & 2) != 0) {
            i11 = sdkVersion.minVersion;
        }
        return sdkVersion.copy(i10, i11);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSdk() {
        return this.sdk;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMinVersion() {
        return this.minVersion;
    }

    @NotNull
    public final SdkVersion copy(int sdk, int minVersion) {
        return new SdkVersion(sdk, minVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkVersion)) {
            return false;
        }
        SdkVersion sdkVersion = (SdkVersion) other;
        return this.sdk == sdkVersion.sdk && this.minVersion == sdkVersion.minVersion;
    }

    public final int getMinVersion() {
        return this.minVersion;
    }

    public final int getSdk() {
        return this.sdk;
    }

    public int hashCode() {
        return (this.sdk * 31) + this.minVersion;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SdkVersion(sdk=");
        sb2.append(this.sdk);
        sb2.append(", minVersion=");
        return a.c(sb2, this.minVersion, ")");
    }
}
