package com.bbva.ethermobile.elogger.p000default;

import com.bbva.cells.component.kit.ui.property.impl.view.EnableHandler;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.logs.LogKeysKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocalTracerConfig.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\u001d\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/bbva/ethermobile/elogger/default/LocalTracerConfig;", "", "", "component1", "", "component2", LogKeysKt.TAG, EnableHandler.ID, "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "b", "Z", "getEnable", "()Z", "<init>", "(Ljava/lang/String;Z)V", "elogger_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class LocalTracerConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean enable;

    public LocalTracerConfig(@NotNull String tag, boolean z10) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        this.tag = tag;
        this.enable = z10;
    }

    public static /* synthetic */ LocalTracerConfig copy$default(LocalTracerConfig localTracerConfig, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = localTracerConfig.tag;
        }
        if ((i10 & 2) != 0) {
            z10 = localTracerConfig.enable;
        }
        return localTracerConfig.copy(str, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final LocalTracerConfig copy(@NotNull String tag, boolean enable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        return new LocalTracerConfig(tag, enable);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LocalTracerConfig)) {
            return false;
        }
        LocalTracerConfig localTracerConfig = (LocalTracerConfig) other;
        return Intrinsics.areEqual(this.tag, localTracerConfig.tag) && this.enable == localTracerConfig.enable;
    }

    public final boolean getEnable() {
        return this.enable;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.tag.hashCode() * 31;
        boolean z10 = this.enable;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        return "LocalTracerConfig(tag=" + this.tag + ", enable=" + this.enable + ")";
    }
}
