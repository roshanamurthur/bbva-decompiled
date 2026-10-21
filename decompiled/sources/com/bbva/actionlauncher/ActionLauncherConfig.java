package com.bbva.actionlauncher;

import androidx.appcompat.widget.a;
import androidx.camera.camera2.internal.n1;
import com.bbva.actonlauncher.R;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ActionLauncherConfig.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u001e\u0010\u001fJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0005HÆ\u0003J1\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001J\t\u0010\r\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000e\u001a\u00020\u0005HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001b¨\u0006 "}, d2 = {"Lcom/bbva/actionlauncher/ActionLauncherConfig;", "", "", "component1", "component2", "", "component3", "component4", "authorities", "tempFolderPath", "shareWithStringId", "openWithStringId", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getAuthorities", "()Ljava/lang/String;", "b", "getTempFolderPath", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getShareWithStringId", "()I", "d", "getOpenWithStringId", "<init>", "(Ljava/lang/String;Ljava/lang/String;II)V", "actionlauncher_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ActionLauncherConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String authorities;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tempFolderPath;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int shareWithStringId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int openWithStringId;

    public ActionLauncherConfig(@NotNull String authorities, @NotNull String tempFolderPath, int i10, int i11) {
        Intrinsics.checkNotNullParameter(authorities, "authorities");
        Intrinsics.checkNotNullParameter(tempFolderPath, "tempFolderPath");
        this.authorities = authorities;
        this.tempFolderPath = tempFolderPath;
        this.shareWithStringId = i10;
        this.openWithStringId = i11;
    }

    public static /* synthetic */ ActionLauncherConfig copy$default(ActionLauncherConfig actionLauncherConfig, String str, String str2, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = actionLauncherConfig.authorities;
        }
        if ((i12 & 2) != 0) {
            str2 = actionLauncherConfig.tempFolderPath;
        }
        if ((i12 & 4) != 0) {
            i10 = actionLauncherConfig.shareWithStringId;
        }
        if ((i12 & 8) != 0) {
            i11 = actionLauncherConfig.openWithStringId;
        }
        return actionLauncherConfig.copy(str, str2, i10, i11);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAuthorities() {
        return this.authorities;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTempFolderPath() {
        return this.tempFolderPath;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getShareWithStringId() {
        return this.shareWithStringId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getOpenWithStringId() {
        return this.openWithStringId;
    }

    @NotNull
    public final ActionLauncherConfig copy(@NotNull String authorities, @NotNull String tempFolderPath, int shareWithStringId, int openWithStringId) {
        Intrinsics.checkNotNullParameter(authorities, "authorities");
        Intrinsics.checkNotNullParameter(tempFolderPath, "tempFolderPath");
        return new ActionLauncherConfig(authorities, tempFolderPath, shareWithStringId, openWithStringId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionLauncherConfig)) {
            return false;
        }
        ActionLauncherConfig actionLauncherConfig = (ActionLauncherConfig) other;
        return Intrinsics.areEqual(this.authorities, actionLauncherConfig.authorities) && Intrinsics.areEqual(this.tempFolderPath, actionLauncherConfig.tempFolderPath) && this.shareWithStringId == actionLauncherConfig.shareWithStringId && this.openWithStringId == actionLauncherConfig.openWithStringId;
    }

    @NotNull
    public final String getAuthorities() {
        return this.authorities;
    }

    public final int getOpenWithStringId() {
        return this.openWithStringId;
    }

    public final int getShareWithStringId() {
        return this.shareWithStringId;
    }

    @NotNull
    public final String getTempFolderPath() {
        return this.tempFolderPath;
    }

    public int hashCode() {
        return ((n1.c(this.tempFolderPath, this.authorities.hashCode() * 31, 31) + this.shareWithStringId) * 31) + this.openWithStringId;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ActionLauncherConfig(authorities=");
        sb2.append(this.authorities);
        sb2.append(", tempFolderPath=");
        sb2.append(this.tempFolderPath);
        sb2.append(", shareWithStringId=");
        sb2.append(this.shareWithStringId);
        sb2.append(", openWithStringId=");
        return a.c(sb2, this.openWithStringId, ")");
    }

    public /* synthetic */ ActionLauncherConfig(String str, String str2, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i12 & 4) != 0 ? R.string.share_with : i10, (i12 & 8) != 0 ? R.string.open_with : i11);
    }
}
