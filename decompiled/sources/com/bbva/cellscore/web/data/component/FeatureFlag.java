package com.bbva.cellscore.web.data.component;

import androidx.camera.camera2.internal.n1;
import com.bbva.cells.component.kit.featureflag.FlagState;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FeatureFlag.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/bbva/cellscore/web/data/component/FeatureFlag;", "", "", "component1", "component2", "Lcom/bbva/cells/component/kit/featureflag/FlagState;", "component3", "id", "appId", "default", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "b", "getAppId", "c", "Lcom/bbva/cells/component/kit/featureflag/FlagState;", "getDefault", "()Lcom/bbva/cells/component/kit/featureflag/FlagState;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/cells/component/kit/featureflag/FlagState;)V", "cells-core_release"}, k = 1, mv = {1, 5, 1})
public final /* data */ class FeatureFlag {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String appId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FlagState default;

    public FeatureFlag(@NotNull String id, @NotNull String appId, @NotNull FlagState flagState) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(flagState, "default");
        this.id = id;
        this.appId = appId;
        this.default = flagState;
    }

    public static /* synthetic */ FeatureFlag copy$default(FeatureFlag featureFlag, String str, String str2, FlagState flagState, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = featureFlag.id;
        }
        if ((i10 & 2) != 0) {
            str2 = featureFlag.appId;
        }
        if ((i10 & 4) != 0) {
            flagState = featureFlag.default;
        }
        return featureFlag.copy(str, str2, flagState);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FlagState getDefault() {
        return this.default;
    }

    @NotNull
    public final FeatureFlag copy(@NotNull String id, @NotNull String appId, @NotNull FlagState flagState) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(flagState, "default");
        return new FeatureFlag(id, appId, flagState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureFlag)) {
            return false;
        }
        FeatureFlag featureFlag = (FeatureFlag) other;
        return Intrinsics.areEqual(this.id, featureFlag.id) && Intrinsics.areEqual(this.appId, featureFlag.appId) && this.default == featureFlag.default;
    }

    @NotNull
    public final String getAppId() {
        return this.appId;
    }

    @NotNull
    public final FlagState getDefault() {
        return this.default;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.default.hashCode() + n1.c(this.appId, this.id.hashCode() * 31, 31);
    }

    @NotNull
    public String toString() {
        return "FeatureFlag(id=" + this.id + ", appId=" + this.appId + ", default=" + this.default + RootService.CLOSE_BRACKET;
    }
}
