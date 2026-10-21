package com.bbva.slidemenuview.domain.model;

import androidx.appcompat.app.i;
import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MenuClickAction.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\t\u001a\u00020\bHÆ\u0003J1\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\bHÆ\u0001J\t\u0010\u000f\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\u0012\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/bbva/slidemenuview/domain/model/MenuClickAction;", "", "", "component1", "", "component2", "Lcom/bbva/slidemenuview/domain/model/MenuItemAction;", "component3", "", "component4", "id", "route", "type", "fromWeb", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getId", "()I", "b", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "c", "Lcom/bbva/slidemenuview/domain/model/MenuItemAction;", "getType", "()Lcom/bbva/slidemenuview/domain/model/MenuItemAction;", "d", "Z", "getFromWeb", "()Z", "<init>", "(ILjava/lang/String;Lcom/bbva/slidemenuview/domain/model/MenuItemAction;Z)V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class MenuClickAction {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String route;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MenuItemAction type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final boolean fromWeb;

    public MenuClickAction(int i10, @NotNull String route, @NotNull MenuItemAction type, boolean z10) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = i10;
        this.route = route;
        this.type = type;
        this.fromWeb = z10;
    }

    public static /* synthetic */ MenuClickAction copy$default(MenuClickAction menuClickAction, int i10, String str, MenuItemAction menuItemAction, boolean z10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = menuClickAction.id;
        }
        if ((i11 & 2) != 0) {
            str = menuClickAction.route;
        }
        if ((i11 & 4) != 0) {
            menuItemAction = menuClickAction.type;
        }
        if ((i11 & 8) != 0) {
            z10 = menuClickAction.fromWeb;
        }
        return menuClickAction.copy(i10, str, menuItemAction, z10);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final MenuItemAction getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getFromWeb() {
        return this.fromWeb;
    }

    @NotNull
    public final MenuClickAction copy(int id, @NotNull String route, @NotNull MenuItemAction type, boolean fromWeb) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(type, "type");
        return new MenuClickAction(id, route, type, fromWeb);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuClickAction)) {
            return false;
        }
        MenuClickAction menuClickAction = (MenuClickAction) other;
        return this.id == menuClickAction.id && Intrinsics.areEqual(this.route, menuClickAction.route) && this.type == menuClickAction.type && this.fromWeb == menuClickAction.fromWeb;
    }

    public final boolean getFromWeb() {
        return this.fromWeb;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getRoute() {
        return this.route;
    }

    @NotNull
    public final MenuItemAction getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r2v5, types: [int] */
    public int hashCode() {
        int iHashCode = (this.type.hashCode() + n1.c(this.route, this.id * 31, 31)) * 31;
        boolean z10 = this.fromWeb;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iHashCode + r1;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("MenuClickAction(id=");
        sb2.append(this.id);
        sb2.append(", route=");
        sb2.append(this.route);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", fromWeb=");
        return i.c(sb2, this.fromWeb, ")");
    }
}
