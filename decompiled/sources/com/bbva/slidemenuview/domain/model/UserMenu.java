package com.bbva.slidemenuview.domain.model;

import androidx.camera.camera2.internal.n1;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.slidemenuview.data.MenuType;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UserMenu.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\"\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b*\u0010+J\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0006HÆ\u0003J\t\u0010\b\u001a\u00020\u0002HÆ\u0003J\t\u0010\t\u001a\u00020\u0006HÆ\u0003J\t\u0010\u000b\u001a\u00020\nHÆ\u0003JG\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\nHÆ\u0001J\t\u0010\u0013\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0014\u001a\u00020\nHÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u000e\u0010!R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010\u001aR\u0017\u0010\u0010\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010!R\u0017\u0010\u0011\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lcom/bbva/slidemenuview/domain/model/UserMenu;", "", "", "component1", "Lcom/bbva/slidemenuview/data/MenuType;", "component2", "", "component3", "component4", "component5", "", "component6", "userName", "menuType", "isProfileSelectorActive", "userType", "hasToken", "lifePoints", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Ljava/lang/String;", "getUserName", "()Ljava/lang/String;", "b", "Lcom/bbva/slidemenuview/data/MenuType;", "getMenuType", "()Lcom/bbva/slidemenuview/data/MenuType;", "c", "Z", "()Z", "d", "getUserType", "e", "getHasToken", "f", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getLifePoints", "()I", "<init>", "(Ljava/lang/String;Lcom/bbva/slidemenuview/data/MenuType;ZLjava/lang/String;ZI)V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class UserMenu {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String userName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MenuType menuType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean isProfileSelectorActive;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String userType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final boolean hasToken;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final int lifePoints;

    public UserMenu(@Nullable String str, @NotNull MenuType menuType, boolean z10, @NotNull String userType, boolean z11, int i10) {
        Intrinsics.checkNotNullParameter(menuType, "menuType");
        Intrinsics.checkNotNullParameter(userType, "userType");
        this.userName = str;
        this.menuType = menuType;
        this.isProfileSelectorActive = z10;
        this.userType = userType;
        this.hasToken = z11;
        this.lifePoints = i10;
    }

    public static /* synthetic */ UserMenu copy$default(UserMenu userMenu, String str, MenuType menuType, boolean z10, String str2, boolean z11, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = userMenu.userName;
        }
        if ((i11 & 2) != 0) {
            menuType = userMenu.menuType;
        }
        MenuType menuType2 = menuType;
        if ((i11 & 4) != 0) {
            z10 = userMenu.isProfileSelectorActive;
        }
        boolean z12 = z10;
        if ((i11 & 8) != 0) {
            str2 = userMenu.userType;
        }
        String str3 = str2;
        if ((i11 & 16) != 0) {
            z11 = userMenu.hasToken;
        }
        boolean z13 = z11;
        if ((i11 & 32) != 0) {
            i10 = userMenu.lifePoints;
        }
        return userMenu.copy(str, menuType2, z12, str3, z13, i10);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MenuType getMenuType() {
        return this.menuType;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsProfileSelectorActive() {
        return this.isProfileSelectorActive;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUserType() {
        return this.userType;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getHasToken() {
        return this.hasToken;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getLifePoints() {
        return this.lifePoints;
    }

    @NotNull
    public final UserMenu copy(@Nullable String userName, @NotNull MenuType menuType, boolean isProfileSelectorActive, @NotNull String userType, boolean hasToken, int lifePoints) {
        Intrinsics.checkNotNullParameter(menuType, "menuType");
        Intrinsics.checkNotNullParameter(userType, "userType");
        return new UserMenu(userName, menuType, isProfileSelectorActive, userType, hasToken, lifePoints);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserMenu)) {
            return false;
        }
        UserMenu userMenu = (UserMenu) other;
        return Intrinsics.areEqual(this.userName, userMenu.userName) && this.menuType == userMenu.menuType && this.isProfileSelectorActive == userMenu.isProfileSelectorActive && Intrinsics.areEqual(this.userType, userMenu.userType) && this.hasToken == userMenu.hasToken && this.lifePoints == userMenu.lifePoints;
    }

    public final boolean getHasToken() {
        return this.hasToken;
    }

    public final int getLifePoints() {
        return this.lifePoints;
    }

    @NotNull
    public final MenuType getMenuType() {
        return this.menuType;
    }

    @Nullable
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    public final String getUserType() {
        return this.userType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r2v4, types: [int] */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    public int hashCode() {
        String str = this.userName;
        int iHashCode = (this.menuType.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        boolean z10 = this.isProfileSelectorActive;
        ?? r3 = z10;
        if (z10) {
            r3 = 1;
        }
        int iC = n1.c(this.userType, (iHashCode + r3) * 31, 31);
        boolean z11 = this.hasToken;
        return ((iC + (z11 ? 1 : z11)) * 31) + this.lifePoints;
    }

    public final boolean isProfileSelectorActive() {
        return this.isProfileSelectorActive;
    }

    @NotNull
    public String toString() {
        return "UserMenu(userName=" + this.userName + ", menuType=" + this.menuType + ", isProfileSelectorActive=" + this.isProfileSelectorActive + ", userType=" + this.userType + ", hasToken=" + this.hasToken + ", lifePoints=" + this.lifePoints + ")";
    }

    public /* synthetic */ UserMenu(String str, MenuType menuType, boolean z10, String str2, boolean z11, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, menuType, z10, str2, z11, (i11 & 32) != 0 ? 0 : i10);
    }
}
