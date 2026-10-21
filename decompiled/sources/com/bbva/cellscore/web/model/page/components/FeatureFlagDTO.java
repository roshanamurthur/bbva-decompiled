package com.bbva.cellscore.web.model.page.components;

import androidx.annotation.Keep;
import androidx.camera.camera2.internal.n1;
import com.bbva.cells.component.kit.featureflag.FlagState;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FeatureFlagDTO.kt */
/* JADX INFO: loaded from: classes2.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/bbva/cellscore/web/model/page/components/FeatureFlagDTO;", "", "id", "", "appId", "default", "Lcom/bbva/cells/component/kit/featureflag/FlagState;", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/cells/component/kit/featureflag/FlagState;)V", "getAppId", "()Ljava/lang/String;", "getDefault", "()Lcom/bbva/cells/component/kit/featureflag/FlagState;", "getId", "component1", "component2", "component3", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "cells-core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class FeatureFlagDTO {

    @NotNull
    private final String appId;

    @NotNull
    private final FlagState default;

    @NotNull
    private final String id;

    public FeatureFlagDTO(@NotNull String id, @NotNull String appId, @NotNull FlagState flagState) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(flagState, "default");
        this.id = id;
        this.appId = appId;
        this.default = flagState;
    }

    public static /* synthetic */ FeatureFlagDTO copy$default(FeatureFlagDTO featureFlagDTO, String str, String str2, FlagState flagState, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = featureFlagDTO.id;
        }
        if ((i10 & 2) != 0) {
            str2 = featureFlagDTO.appId;
        }
        if ((i10 & 4) != 0) {
            flagState = featureFlagDTO.default;
        }
        return featureFlagDTO.copy(str, str2, flagState);
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
    public final FeatureFlagDTO copy(@NotNull String id, @NotNull String appId, @NotNull FlagState flagState) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(flagState, "default");
        return new FeatureFlagDTO(id, appId, flagState);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeatureFlagDTO)) {
            return false;
        }
        FeatureFlagDTO featureFlagDTO = (FeatureFlagDTO) other;
        return Intrinsics.areEqual(this.id, featureFlagDTO.id) && Intrinsics.areEqual(this.appId, featureFlagDTO.appId) && this.default == featureFlagDTO.default;
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
        return "FeatureFlagDTO(id=" + this.id + ", appId=" + this.appId + ", default=" + this.default + RootService.CLOSE_BRACKET;
    }
}
