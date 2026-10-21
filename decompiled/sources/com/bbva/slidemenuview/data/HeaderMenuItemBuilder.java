package com.bbva.slidemenuview.data;

import bk.q;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.ui.component.menu.model.HeaderMenuItem;
import com.bbva.ui.component.menu.model.HeaderSubItem;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huawei.hms.feature.model.b;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MenuBuilder.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bC\u0010DJ\u0006\u0010\u0003\u001a\u00020\u0002J\u001f\u0010\t\u001a\u00020\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001b\u0010\u0016\"\u0004\b\u001c\u0010\u0018R$\u0010%\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R$\u0010)\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R$\u0010-\u001a\u0004\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"\"\u0004\b,\u0010$R\"\u00101\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b.\u0010\u0014\u001a\u0004\b/\u0010\u0016\"\u0004\b0\u0010\u0018R\"\u00105\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010:\u001a\u0002028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u00104\u001a\u0004\b:\u00106\"\u0004\b;\u00108R.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lcom/bbva/slidemenuview/data/HeaderMenuItemBuilder;", "", "Lcom/bbva/ui/component/menu/model/HeaderMenuItem;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lkotlin/Function1;", "Lcom/bbva/slidemenuview/data/MenuItemStatesBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", b.f50432b, "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getId", "()I", "setId", "(I)V", "id", "", "b", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "setRoute", "(Ljava/lang/String;)V", "route", "c", "getTitle", "setTitle", "title", "Lcom/bbva/ui/component/menu/model/HeaderSubItem;", "d", "Lcom/bbva/ui/component/menu/model/HeaderSubItem;", "getSubtitle", "()Lcom/bbva/ui/component/menu/model/HeaderSubItem;", "setSubtitle", "(Lcom/bbva/ui/component/menu/model/HeaderSubItem;)V", NotificationMessage.NOTIF_KEY_SUB_TITLE, "e", "getSubHeader", "setSubHeader", "subHeader", "f", "getThirdLine", "setThirdLine", "thirdLine", "g", "getClickAccessibilityLabel", "setClickAccessibilityLabel", "clickAccessibilityLabel", "", "h", "Z", "isChecked", "()Z", "setChecked", "(Z)V", "i", "isCheckable", "setCheckable", "", "j", "Ljava/util/Map;", "getStates", "()Ljava/util/Map;", "setStates", "(Ljava/util/Map;)V", "<init>", "()V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class HeaderMenuItemBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int id;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public HeaderSubItem subtitle;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public HeaderSubItem subHeader;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public HeaderSubItem thirdLine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isChecked;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean isCheckable;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Map<String, String> states;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String route = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String title = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String clickAccessibilityLabel = "";

    public HeaderMenuItemBuilder() {
        MenuState menuState = MenuState.DISABLED;
        this.states = q.mutableMapOf(TuplesKt.to(MenuItemStatesBuilder.USER_NO, menuState.getState()), TuplesKt.to(MenuItemStatesBuilder.USER_CACHED, menuState.getState()), TuplesKt.to(MenuItemStatesBuilder.USER_LOGGED, menuState.getState()));
    }

    @NotNull
    public final HeaderMenuItem build() {
        int i10 = this.id;
        String str = this.route;
        String str2 = this.title;
        HeaderSubItem headerSubItem = this.subtitle;
        HeaderSubItem headerSubItem2 = this.thirdLine;
        return new HeaderMenuItem(i10, str, str2, headerSubItem, this.clickAccessibilityLabel, this.isChecked, this.isCheckable, this.states, this.subHeader, headerSubItem2, null, 1024, null);
    }

    @NotNull
    public final String getClickAccessibilityLabel() {
        return this.clickAccessibilityLabel;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getRoute() {
        return this.route;
    }

    @NotNull
    public final Map<String, String> getStates() {
        return this.states;
    }

    @Nullable
    public final HeaderSubItem getSubHeader() {
        return this.subHeader;
    }

    @Nullable
    public final HeaderSubItem getSubtitle() {
        return this.subtitle;
    }

    @Nullable
    public final HeaderSubItem getThirdLine() {
        return this.thirdLine;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: isCheckable, reason: from getter */
    public final boolean getIsCheckable() {
        return this.isCheckable;
    }

    /* JADX INFO: renamed from: isChecked, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    public final void setCheckable(boolean z10) {
        this.isCheckable = z10;
    }

    public final void setChecked(boolean z10) {
        this.isChecked = z10;
    }

    public final void setClickAccessibilityLabel(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.clickAccessibilityLabel = str;
    }

    public final void setId(int i10) {
        this.id = i10;
    }

    public final void setRoute(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.route = str;
    }

    public final void setStates(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.states = map;
    }

    public final void setSubHeader(@Nullable HeaderSubItem headerSubItem) {
        this.subHeader = headerSubItem;
    }

    public final void setSubtitle(@Nullable HeaderSubItem headerSubItem) {
        this.subtitle = headerSubItem;
    }

    public final void setThirdLine(@Nullable HeaderSubItem headerSubItem) {
        this.thirdLine = headerSubItem;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void states(@NotNull Function1<? super MenuItemStatesBuilder, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.states.clear();
        Map<String, String> map = this.states;
        MenuItemStatesBuilder menuItemStatesBuilder = new MenuItemStatesBuilder();
        block.invoke(menuItemStatesBuilder);
        map.putAll(menuItemStatesBuilder.build());
    }
}
