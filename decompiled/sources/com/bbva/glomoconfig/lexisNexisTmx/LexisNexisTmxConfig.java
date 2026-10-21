package com.bbva.glomoconfig.lexisNexisTmx;

import ad.d;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LexisNexisTmxConfig.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\b\u001a\u00020\u0002HÖ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/bbva/glomoconfig/lexisNexisTmx/LexisNexisTmxConfig;", "", "", "component1", "component2", "orgId", "fingerPrint", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getOrgId", "()Ljava/lang/String;", "b", "getFingerPrint", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class LexisNexisTmxConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String orgId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fingerPrint;

    public LexisNexisTmxConfig(@NotNull String orgId, @NotNull String fingerPrint) {
        Intrinsics.checkNotNullParameter(orgId, "orgId");
        Intrinsics.checkNotNullParameter(fingerPrint, "fingerPrint");
        this.orgId = orgId;
        this.fingerPrint = fingerPrint;
    }

    public static /* synthetic */ LexisNexisTmxConfig copy$default(LexisNexisTmxConfig lexisNexisTmxConfig, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = lexisNexisTmxConfig.orgId;
        }
        if ((i10 & 2) != 0) {
            str2 = lexisNexisTmxConfig.fingerPrint;
        }
        return lexisNexisTmxConfig.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOrgId() {
        return this.orgId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFingerPrint() {
        return this.fingerPrint;
    }

    @NotNull
    public final LexisNexisTmxConfig copy(@NotNull String orgId, @NotNull String fingerPrint) {
        Intrinsics.checkNotNullParameter(orgId, "orgId");
        Intrinsics.checkNotNullParameter(fingerPrint, "fingerPrint");
        return new LexisNexisTmxConfig(orgId, fingerPrint);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LexisNexisTmxConfig)) {
            return false;
        }
        LexisNexisTmxConfig lexisNexisTmxConfig = (LexisNexisTmxConfig) other;
        return Intrinsics.areEqual(this.orgId, lexisNexisTmxConfig.orgId) && Intrinsics.areEqual(this.fingerPrint, lexisNexisTmxConfig.fingerPrint);
    }

    @NotNull
    public final String getFingerPrint() {
        return this.fingerPrint;
    }

    @NotNull
    public final String getOrgId() {
        return this.orgId;
    }

    public int hashCode() {
        return this.fingerPrint.hashCode() + (this.orgId.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LexisNexisTmxConfig(orgId=");
        sb2.append(this.orgId);
        sb2.append(", fingerPrint=");
        return d.f(sb2, this.fingerPrint, ")");
    }
}
