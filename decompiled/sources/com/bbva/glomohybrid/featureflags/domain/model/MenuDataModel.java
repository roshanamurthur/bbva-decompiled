package com.bbva.glomohybrid.featureflags.domain.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FeatureFlags.kt */
/* JADX INFO: loaded from: classes6.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/featureflags/domain/model/MenuDataModel;", "", "android", "", "", FirebaseAnalytics.Param.ITEMS, "Lcom/bbva/glomohybrid/featureflags/domain/model/MenuItemDataModel;", "(Ljava/util/List;Ljava/util/List;)V", "getAndroid", "()Ljava/util/List;", "getItems", "component1", "component2", "copy", "equals", "", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "gl-feature-flags_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final /* data */ class MenuDataModel {

    @NotNull
    private final List<String> android;

    @NotNull
    private final List<MenuItemDataModel> items;

    /* JADX WARN: Multi-variable type inference failed */
    public MenuDataModel() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MenuDataModel copy$default(MenuDataModel menuDataModel, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = menuDataModel.android;
        }
        if ((i10 & 2) != 0) {
            list2 = menuDataModel.items;
        }
        return menuDataModel.copy(list, list2);
    }

    @NotNull
    public final List<String> component1() {
        return this.android;
    }

    @NotNull
    public final List<MenuItemDataModel> component2() {
        return this.items;
    }

    @NotNull
    public final MenuDataModel copy(@NotNull List<String> android2, @NotNull List<MenuItemDataModel> items) {
        Intrinsics.checkNotNullParameter(android2, "android");
        Intrinsics.checkNotNullParameter(items, "items");
        return new MenuDataModel(android2, items);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuDataModel)) {
            return false;
        }
        MenuDataModel menuDataModel = (MenuDataModel) other;
        return Intrinsics.areEqual(this.android, menuDataModel.android) && Intrinsics.areEqual(this.items, menuDataModel.items);
    }

    @NotNull
    public final List<String> getAndroid() {
        return this.android;
    }

    @NotNull
    public final List<MenuItemDataModel> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode() + (this.android.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "MenuDataModel(android=" + this.android + ", items=" + this.items + ")";
    }

    public MenuDataModel(@NotNull List<String> android2, @NotNull List<MenuItemDataModel> items) {
        Intrinsics.checkNotNullParameter(android2, "android");
        Intrinsics.checkNotNullParameter(items, "items");
        this.android = android2;
        this.items = items;
    }

    public /* synthetic */ MenuDataModel(List list, List list2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i10 & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list2);
    }
}
