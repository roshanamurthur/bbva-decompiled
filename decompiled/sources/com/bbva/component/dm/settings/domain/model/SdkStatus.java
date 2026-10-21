package com.bbva.component.dm.settings.domain.model;

import com.bbva.ethermobilesdk.devicechecker.emulator.EmulatorApi;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppStatusConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u001d\u0010\u001eJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/SdkStatus;", "", "", "component1", "", "component2", "Lcom/bbva/component/dm/settings/domain/model/VisualMessageConfiguration;", "component3", EmulatorApi.SDK, "available", "message", "copy", "", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSdk", "()I", "b", "Z", "getAvailable", "()Z", "c", "Lcom/bbva/component/dm/settings/domain/model/VisualMessageConfiguration;", "getMessage", "()Lcom/bbva/component/dm/settings/domain/model/VisualMessageConfiguration;", "<init>", "(IZLcom/bbva/component/dm/settings/domain/model/VisualMessageConfiguration;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
public final /* data */ class SdkStatus {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int sdk;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean available;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final VisualMessageConfiguration message;

    public SdkStatus(int i10, boolean z10, @Nullable VisualMessageConfiguration visualMessageConfiguration) {
        this.sdk = i10;
        this.available = z10;
        this.message = visualMessageConfiguration;
    }

    public static /* synthetic */ SdkStatus copy$default(SdkStatus sdkStatus, int i10, boolean z10, VisualMessageConfiguration visualMessageConfiguration, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = sdkStatus.sdk;
        }
        if ((i11 & 2) != 0) {
            z10 = sdkStatus.available;
        }
        if ((i11 & 4) != 0) {
            visualMessageConfiguration = sdkStatus.message;
        }
        return sdkStatus.copy(i10, z10, visualMessageConfiguration);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSdk() {
        return this.sdk;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getAvailable() {
        return this.available;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VisualMessageConfiguration getMessage() {
        return this.message;
    }

    @NotNull
    public final SdkStatus copy(int sdk, boolean available, @Nullable VisualMessageConfiguration message) {
        return new SdkStatus(sdk, available, message);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SdkStatus)) {
            return false;
        }
        SdkStatus sdkStatus = (SdkStatus) other;
        return this.sdk == sdkStatus.sdk && this.available == sdkStatus.available && Intrinsics.areEqual(this.message, sdkStatus.message);
    }

    public final boolean getAvailable() {
        return this.available;
    }

    @Nullable
    public final VisualMessageConfiguration getMessage() {
        return this.message;
    }

    public final int getSdk() {
        return this.sdk;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int i10 = this.sdk * 31;
        boolean z10 = this.available;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i11 = (i10 + r1) * 31;
        VisualMessageConfiguration visualMessageConfiguration = this.message;
        return i11 + (visualMessageConfiguration == null ? 0 : visualMessageConfiguration.hashCode());
    }

    @NotNull
    public String toString() {
        return "SdkStatus(sdk=" + this.sdk + ", available=" + this.available + ", message=" + this.message + ")";
    }
}
