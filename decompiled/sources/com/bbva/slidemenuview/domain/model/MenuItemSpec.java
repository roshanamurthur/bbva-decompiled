package com.bbva.slidemenuview.domain.model;

import androidx.annotation.Keep;
import androidx.appcompat.app.i;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MenuItems.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\tHÆ\u0003JM\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/bbva/slidemenuview/domain/model/MenuItemSpec;", "", "id", "", "isEnabled", "", "isFeatured", "isHidden", "isVisited", "", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V", "getId", "()Ljava/lang/String;", "()Ljava/util/List;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MenuItemSpec {

    @NotNull
    private final String id;

    @NotNull
    private final List<String> isEnabled;

    @NotNull
    private final List<String> isFeatured;

    @NotNull
    private final List<String> isHidden;
    private final boolean isVisited;

    public MenuItemSpec(@NotNull String id, @NotNull List<String> isEnabled, @NotNull List<String> isFeatured, @NotNull List<String> isHidden, boolean z10) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        Intrinsics.checkNotNullParameter(isFeatured, "isFeatured");
        Intrinsics.checkNotNullParameter(isHidden, "isHidden");
        this.id = id;
        this.isEnabled = isEnabled;
        this.isFeatured = isFeatured;
        this.isHidden = isHidden;
        this.isVisited = z10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MenuItemSpec copy$default(MenuItemSpec menuItemSpec, String str, List list, List list2, List list3, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = menuItemSpec.id;
        }
        if ((i10 & 2) != 0) {
            list = menuItemSpec.isEnabled;
        }
        List list4 = list;
        if ((i10 & 4) != 0) {
            list2 = menuItemSpec.isFeatured;
        }
        List list5 = list2;
        if ((i10 & 8) != 0) {
            list3 = menuItemSpec.isHidden;
        }
        List list6 = list3;
        if ((i10 & 16) != 0) {
            z10 = menuItemSpec.isVisited;
        }
        return menuItemSpec.copy(str, list4, list5, list6, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final List<String> component2() {
        return this.isEnabled;
    }

    @NotNull
    public final List<String> component3() {
        return this.isFeatured;
    }

    @NotNull
    public final List<String> component4() {
        return this.isHidden;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getIsVisited() {
        return this.isVisited;
    }

    @NotNull
    public final MenuItemSpec copy(@NotNull String id, @NotNull List<String> isEnabled, @NotNull List<String> isFeatured, @NotNull List<String> isHidden, boolean isVisited) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        Intrinsics.checkNotNullParameter(isFeatured, "isFeatured");
        Intrinsics.checkNotNullParameter(isHidden, "isHidden");
        return new MenuItemSpec(id, isEnabled, isFeatured, isHidden, isVisited);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuItemSpec)) {
            return false;
        }
        MenuItemSpec menuItemSpec = (MenuItemSpec) other;
        return Intrinsics.areEqual(this.id, menuItemSpec.id) && Intrinsics.areEqual(this.isEnabled, menuItemSpec.isEnabled) && Intrinsics.areEqual(this.isFeatured, menuItemSpec.isFeatured) && Intrinsics.areEqual(this.isHidden, menuItemSpec.isHidden) && this.isVisited == menuItemSpec.isVisited;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    public int hashCode() {
        int iA = a.a(this.isHidden, a.a(this.isFeatured, a.a(this.isEnabled, this.id.hashCode() * 31, 31), 31), 31);
        boolean z10 = this.isVisited;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        return iA + r1;
    }

    @NotNull
    public final List<String> isEnabled() {
        return this.isEnabled;
    }

    @NotNull
    public final List<String> isFeatured() {
        return this.isFeatured;
    }

    @NotNull
    public final List<String> isHidden() {
        return this.isHidden;
    }

    public final boolean isVisited() {
        return this.isVisited;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        List<String> list = this.isEnabled;
        List<String> list2 = this.isFeatured;
        List<String> list3 = this.isHidden;
        boolean z10 = this.isVisited;
        StringBuilder sb2 = new StringBuilder("MenuItemSpec(id=");
        sb2.append(str);
        sb2.append(", isEnabled=");
        sb2.append(list);
        sb2.append(", isFeatured=");
        sb2.append(list2);
        sb2.append(", isHidden=");
        sb2.append(list3);
        sb2.append(", isVisited=");
        return i.c(sb2, z10, ")");
    }

    public /* synthetic */ MenuItemSpec(String str, List list, List list2, List list3, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, list2, list3, (i10 & 16) != 0 ? false : z10);
    }
}
