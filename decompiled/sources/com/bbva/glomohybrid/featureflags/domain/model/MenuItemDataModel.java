package com.bbva.glomohybrid.featureflags.domain.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.android.gms.measurement.internal.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FeatureFlags.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003JC\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000bR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/bbva/glomohybrid/featureflags/domain/model/MenuItemDataModel;", "", "id", "", "isEnabled", "", "isFeatured", "isHidden", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MenuItemDataModel {

    @NotNull
    private final String id;

    @NotNull
    private final List<String> isEnabled;

    @NotNull
    private final List<String> isFeatured;

    @NotNull
    private final List<String> isHidden;

    public MenuItemDataModel(@NotNull String id, @NotNull List<String> isEnabled, @NotNull List<String> isFeatured, @NotNull List<String> isHidden) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        Intrinsics.checkNotNullParameter(isFeatured, "isFeatured");
        Intrinsics.checkNotNullParameter(isHidden, "isHidden");
        this.id = id;
        this.isEnabled = isEnabled;
        this.isFeatured = isFeatured;
        this.isHidden = isHidden;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MenuItemDataModel copy$default(MenuItemDataModel menuItemDataModel, String str, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = menuItemDataModel.id;
        }
        if ((i10 & 2) != 0) {
            list = menuItemDataModel.isEnabled;
        }
        if ((i10 & 4) != 0) {
            list2 = menuItemDataModel.isFeatured;
        }
        if ((i10 & 8) != 0) {
            list3 = menuItemDataModel.isHidden;
        }
        return menuItemDataModel.copy(str, list, list2, list3);
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

    @NotNull
    public final MenuItemDataModel copy(@NotNull String id, @NotNull List<String> isEnabled, @NotNull List<String> isFeatured, @NotNull List<String> isHidden) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(isEnabled, "isEnabled");
        Intrinsics.checkNotNullParameter(isFeatured, "isFeatured");
        Intrinsics.checkNotNullParameter(isHidden, "isHidden");
        return new MenuItemDataModel(id, isEnabled, isFeatured, isHidden);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuItemDataModel)) {
            return false;
        }
        MenuItemDataModel menuItemDataModel = (MenuItemDataModel) other;
        return Intrinsics.areEqual(this.id, menuItemDataModel.id) && Intrinsics.areEqual(this.isEnabled, menuItemDataModel.isEnabled) && Intrinsics.areEqual(this.isFeatured, menuItemDataModel.isFeatured) && Intrinsics.areEqual(this.isHidden, menuItemDataModel.isHidden);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public int hashCode() {
        return this.isHidden.hashCode() + a.a(this.isFeatured, a.a(this.isEnabled, this.id.hashCode() * 31, 31), 31);
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

    @NotNull
    public String toString() {
        return "MenuItemDataModel(id=" + this.id + ", isEnabled=" + this.isEnabled + ", isFeatured=" + this.isFeatured + ", isHidden=" + this.isHidden + ")";
    }
}
