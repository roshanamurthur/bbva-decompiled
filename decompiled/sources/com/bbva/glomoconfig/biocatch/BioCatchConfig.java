package com.bbva.glomoconfig.biocatch;

import androidx.appcompat.app.i;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BioCatchConfig.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/bbva/glomoconfig/biocatch/BioCatchConfig;", "", "", "component1", "component2", "", "component3", "wuptUrl", "cid", "enableHybridSolution", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getWuptUrl", "()Ljava/lang/String;", "b", "getCid", "c", "Z", "getEnableHybridSolution", "()Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class BioCatchConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String wuptUrl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String cid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean enableHybridSolution;

    public BioCatchConfig(@NotNull String wuptUrl, @NotNull String cid, boolean z10) {
        Intrinsics.checkNotNullParameter(wuptUrl, "wuptUrl");
        Intrinsics.checkNotNullParameter(cid, "cid");
        this.wuptUrl = wuptUrl;
        this.cid = cid;
        this.enableHybridSolution = z10;
    }

    public static /* synthetic */ BioCatchConfig copy$default(BioCatchConfig bioCatchConfig, String str, String str2, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = bioCatchConfig.wuptUrl;
        }
        if ((i10 & 2) != 0) {
            str2 = bioCatchConfig.cid;
        }
        if ((i10 & 4) != 0) {
            z10 = bioCatchConfig.enableHybridSolution;
        }
        return bioCatchConfig.copy(str, str2, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWuptUrl() {
        return this.wuptUrl;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCid() {
        return this.cid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getEnableHybridSolution() {
        return this.enableHybridSolution;
    }

    @NotNull
    public final BioCatchConfig copy(@NotNull String wuptUrl, @NotNull String cid, boolean enableHybridSolution) {
        Intrinsics.checkNotNullParameter(wuptUrl, "wuptUrl");
        Intrinsics.checkNotNullParameter(cid, "cid");
        return new BioCatchConfig(wuptUrl, cid, enableHybridSolution);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BioCatchConfig)) {
            return false;
        }
        BioCatchConfig bioCatchConfig = (BioCatchConfig) other;
        return Intrinsics.areEqual(this.wuptUrl, bioCatchConfig.wuptUrl) && Intrinsics.areEqual(this.cid, bioCatchConfig.cid) && this.enableHybridSolution == bioCatchConfig.enableHybridSolution;
    }

    @NotNull
    public final String getCid() {
        return this.cid;
    }

    public final boolean getEnableHybridSolution() {
        return this.enableHybridSolution;
    }

    @NotNull
    public final String getWuptUrl() {
        return this.wuptUrl;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iC = n1.c(this.cid, this.wuptUrl.hashCode() * 31, 31);
        boolean z10 = this.enableHybridSolution;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iC + r1;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BioCatchConfig(wuptUrl=");
        sb2.append(this.wuptUrl);
        sb2.append(", cid=");
        sb2.append(this.cid);
        sb2.append(", enableHybridSolution=");
        return i.c(sb2, this.enableHybridSolution, ")");
    }
}
