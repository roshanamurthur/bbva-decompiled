package com.bbva.glomohybrid.shortcuts.model;

import androidx.camera.camera2.internal.n1;
import bk.q;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppShortcutModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b0\b\u0086\b\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\n\u0012\u0006\u0010\u0018\u001a\u00020\n\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b>\u0010?J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0004HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003J\t\u0010\f\u001a\u00020\nHÆ\u0003J\t\u0010\u000e\u001a\u00020\rHÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003Jo\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\n2\b\b\u0002\u0010\u0018\u001a\u00020\n2\b\b\u0002\u0010\u0019\u001a\u00020\r2\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001J\t\u0010\u001c\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001d\u001a\u00020\nHÖ\u0001J\u0013\u0010\u001f\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010%\u001a\u0004\b+\u0010'R\u0017\u0010\u0016\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\u0017\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0018\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0017\u0010\u0019\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00100\u000f8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006@"}, d2 = {"Lcom/bbva/glomohybrid/shortcuts/model/AppShortcut;", "", "Lcom/bbva/glomohybrid/shortcuts/model/AppShortcutsIds;", "component1", "", "component2", "component3", "component4", "", "component5", "", "component6", "component7", "Lcom/bbva/glomohybrid/shortcuts/model/Action;", "component8", "", "Ljava/io/Serializable;", "component9", "id", "shortLabel", "longLabel", "disableMessage", "enabled", "iconId", "rank", "action", "extras", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Lcom/bbva/glomohybrid/shortcuts/model/AppShortcutsIds;", "getId", "()Lcom/bbva/glomohybrid/shortcuts/model/AppShortcutsIds;", "b", "Ljava/lang/String;", "getShortLabel", "()Ljava/lang/String;", "c", "getLongLabel", "d", "getDisableMessage", "e", "Z", "getEnabled", "()Z", "f", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getIconId", "()I", "g", "getRank", "h", "Lcom/bbva/glomohybrid/shortcuts/model/Action;", "getAction", "()Lcom/bbva/glomohybrid/shortcuts/model/Action;", "i", "Ljava/util/Map;", "getExtras", "()Ljava/util/Map;", "<init>", "(Lcom/bbva/glomohybrid/shortcuts/model/AppShortcutsIds;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIILcom/bbva/glomohybrid/shortcuts/model/Action;Ljava/util/Map;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class AppShortcut {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final AppShortcutsIds id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String shortLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String longLabel;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String disableMessage;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean enabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int iconId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public final int rank;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Action action;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, Serializable> extras;

    /* JADX WARN: Multi-variable type inference failed */
    public AppShortcut(@NotNull AppShortcutsIds id, @NotNull String shortLabel, @NotNull String longLabel, @NotNull String disableMessage, boolean z10, int i10, int i11, @NotNull Action action, @NotNull Map<String, ? extends Serializable> extras) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(shortLabel, "shortLabel");
        Intrinsics.checkNotNullParameter(longLabel, "longLabel");
        Intrinsics.checkNotNullParameter(disableMessage, "disableMessage");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(extras, "extras");
        this.id = id;
        this.shortLabel = shortLabel;
        this.longLabel = longLabel;
        this.disableMessage = disableMessage;
        this.enabled = z10;
        this.iconId = i10;
        this.rank = i11;
        this.action = action;
        this.extras = extras;
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final AppShortcutsIds getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShortLabel() {
        return this.shortLabel;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLongLabel() {
        return this.longLabel;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getDisableMessage() {
        return this.disableMessage;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getIconId() {
        return this.iconId;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Action getAction() {
        return this.action;
    }

    @NotNull
    public final Map<String, Serializable> component9() {
        return this.extras;
    }

    @NotNull
    public final AppShortcut copy(@NotNull AppShortcutsIds id, @NotNull String shortLabel, @NotNull String longLabel, @NotNull String disableMessage, boolean enabled, int iconId, int rank, @NotNull Action action, @NotNull Map<String, ? extends Serializable> extras) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(shortLabel, "shortLabel");
        Intrinsics.checkNotNullParameter(longLabel, "longLabel");
        Intrinsics.checkNotNullParameter(disableMessage, "disableMessage");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return new AppShortcut(id, shortLabel, longLabel, disableMessage, enabled, iconId, rank, action, extras);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AppShortcut)) {
            return false;
        }
        AppShortcut appShortcut = (AppShortcut) other;
        return this.id == appShortcut.id && Intrinsics.areEqual(this.shortLabel, appShortcut.shortLabel) && Intrinsics.areEqual(this.longLabel, appShortcut.longLabel) && Intrinsics.areEqual(this.disableMessage, appShortcut.disableMessage) && this.enabled == appShortcut.enabled && this.iconId == appShortcut.iconId && this.rank == appShortcut.rank && Intrinsics.areEqual(this.action, appShortcut.action) && Intrinsics.areEqual(this.extras, appShortcut.extras);
    }

    @NotNull
    public final Action getAction() {
        return this.action;
    }

    @NotNull
    public final String getDisableMessage() {
        return this.disableMessage;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final Map<String, Serializable> getExtras() {
        return this.extras;
    }

    public final int getIconId() {
        return this.iconId;
    }

    @NotNull
    public final AppShortcutsIds getId() {
        return this.id;
    }

    @NotNull
    public final String getLongLabel() {
        return this.longLabel;
    }

    public final int getRank() {
        return this.rank;
    }

    @NotNull
    public final String getShortLabel() {
        return this.shortLabel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    public int hashCode() {
        int iC = n1.c(this.disableMessage, n1.c(this.longLabel, n1.c(this.shortLabel, this.id.hashCode() * 31, 31), 31), 31);
        boolean z10 = this.enabled;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        return this.extras.hashCode() + ((this.action.hashCode() + ((((((iC + r3) * 31) + this.iconId) * 31) + this.rank) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        return "AppShortcut(id=" + this.id + ", shortLabel=" + this.shortLabel + ", longLabel=" + this.longLabel + ", disableMessage=" + this.disableMessage + ", enabled=" + this.enabled + ", iconId=" + this.iconId + ", rank=" + this.rank + ", action=" + this.action + ", extras=" + this.extras + ")";
    }

    public /* synthetic */ AppShortcut(AppShortcutsIds appShortcutsIds, String str, String str2, String str3, boolean z10, int i10, int i11, Action action, Map map, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(appShortcutsIds, str, str2, str3, z10, i10, i11, (i12 & 128) != 0 ? new Action(null, null, null, 7, null) : action, (i12 & 256) != 0 ? q.emptyMap() : map);
    }
}
