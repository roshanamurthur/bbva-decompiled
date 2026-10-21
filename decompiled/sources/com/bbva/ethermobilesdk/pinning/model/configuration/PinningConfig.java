package com.bbva.ethermobilesdk.pinning.model.configuration;

import androidx.camera.camera2.internal.n1;
import androidx.camera.core.impl.v;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PinningConfig.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/bbva/ethermobilesdk/pinning/model/configuration/PinningConfig;", "", "id", "", "fallbackFile", "", "resetCatalog", "", "mode", "Lcom/bbva/ethermobilesdk/pinning/model/configuration/PinningGlobalEnvironment;", "(ILjava/lang/String;ZLcom/bbva/ethermobilesdk/pinning/model/configuration/PinningGlobalEnvironment;)V", "getFallbackFile", "()Ljava/lang/String;", "getId", "()I", "getMode", "()Lcom/bbva/ethermobilesdk/pinning/model/configuration/PinningGlobalEnvironment;", "getResetCatalog", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "toString", "pinning_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PinningConfig {

    @NotNull
    private final String fallbackFile;
    private final int id;

    @NotNull
    private final PinningGlobalEnvironment mode;
    private final boolean resetCatalog;

    public PinningConfig(int i10, @NotNull String fallbackFile, boolean z10, @NotNull PinningGlobalEnvironment mode) {
        Intrinsics.checkNotNullParameter(fallbackFile, "fallbackFile");
        Intrinsics.checkNotNullParameter(mode, "mode");
        this.id = i10;
        this.fallbackFile = fallbackFile;
        this.resetCatalog = z10;
        this.mode = mode;
    }

    public static /* synthetic */ PinningConfig copy$default(PinningConfig pinningConfig, int i10, String str, boolean z10, PinningGlobalEnvironment pinningGlobalEnvironment, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = pinningConfig.id;
        }
        if ((i11 & 2) != 0) {
            str = pinningConfig.fallbackFile;
        }
        if ((i11 & 4) != 0) {
            z10 = pinningConfig.resetCatalog;
        }
        if ((i11 & 8) != 0) {
            pinningGlobalEnvironment = pinningConfig.mode;
        }
        return pinningConfig.copy(i10, str, z10, pinningGlobalEnvironment);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFallbackFile() {
        return this.fallbackFile;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getResetCatalog() {
        return this.resetCatalog;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PinningGlobalEnvironment getMode() {
        return this.mode;
    }

    @NotNull
    public final PinningConfig copy(int id, @NotNull String fallbackFile, boolean resetCatalog, @NotNull PinningGlobalEnvironment mode) {
        Intrinsics.checkNotNullParameter(fallbackFile, "fallbackFile");
        Intrinsics.checkNotNullParameter(mode, "mode");
        return new PinningConfig(id, fallbackFile, resetCatalog, mode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PinningConfig)) {
            return false;
        }
        PinningConfig pinningConfig = (PinningConfig) other;
        return this.id == pinningConfig.id && Intrinsics.areEqual(this.fallbackFile, pinningConfig.fallbackFile) && this.resetCatalog == pinningConfig.resetCatalog && this.mode == pinningConfig.mode;
    }

    @NotNull
    public final String getFallbackFile() {
        return this.fallbackFile;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final PinningGlobalEnvironment getMode() {
        return this.mode;
    }

    public final boolean getResetCatalog() {
        return this.resetCatalog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iC = n1.c(this.fallbackFile, this.id * 31, 31);
        boolean z10 = this.resetCatalog;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        return this.mode.hashCode() + ((iC + r3) * 31);
    }

    @NotNull
    public String toString() {
        int i10 = this.id;
        String str = this.fallbackFile;
        boolean z10 = this.resetCatalog;
        PinningGlobalEnvironment pinningGlobalEnvironment = this.mode;
        StringBuilder sbE = v.e("PinningConfig(id=", i10, ", fallbackFile=", str, ", resetCatalog=");
        sbE.append(z10);
        sbE.append(", mode=");
        sbE.append(pinningGlobalEnvironment);
        sbE.append(")");
        return sbE.toString();
    }

    public /* synthetic */ PinningConfig(int i10, String str, boolean z10, PinningGlobalEnvironment pinningGlobalEnvironment, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, str, (i11 & 4) != 0 ? false : z10, pinningGlobalEnvironment);
    }
}
