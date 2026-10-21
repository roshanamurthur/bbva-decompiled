package com.bbva.slidemenuview.data;

import bk.q;
import com.bbva.cells.componentkit.model.dsl.ImageSettings;
import com.bbva.cells.componentkit.model.dsl.ResourceId;
import com.bbva.cells.componentkit.model.dsl.Scale;
import com.bbva.cells.componentkit.model.dsl.ViewSettings;
import com.bbva.slidemenuview.domain.model.MenuItemAction;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.ui.component.menu.model.MenuItem;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huawei.hms.feature.model.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MenuBuilder.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\bE\u0010FJ\u0006\u0010\u0003\u001a\u00020\u0002J\u001f\u0010\t\u001a\u00020\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001d\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\f\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001c\u0010\u0010R\"\u0010!\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0014\u001a\u0004\b\u001f\u0010\u0016\"\u0004\b \u0010\u0018R\"\u0010%\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u0014\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R\"\u0010)\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u0010.\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010(\u001a\u0004\b.\u0010*\"\u0004\b/\u0010,R\"\u00101\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010(\u001a\u0004\b1\u0010*\"\u0004\b2\u0010,R\"\u00104\u001a\u00020&8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010(\u001a\u0004\b4\u0010*\"\u0004\b5\u0010,R.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0012068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006G"}, d2 = {"Lcom/bbva/slidemenuview/data/MenuItemBuilder;", "", "Lcom/bbva/ui/component/menu/model/MenuItem;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lkotlin/Function1;", "Lcom/bbva/slidemenuview/data/MenuItemStatesBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", b.f50432b, "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getId", "()I", "setId", "(I)V", "id", "", "b", "Ljava/lang/String;", "getRoute", "()Ljava/lang/String;", "setRoute", "(Ljava/lang/String;)V", "route", "c", "getIconId", "setIconId", "iconId", "d", "getText", "setText", "text", "e", "getLoggedText", "setLoggedText", "loggedText", "", "f", "Z", "isChecked", "()Z", "setChecked", "(Z)V", "g", "isCheckable", "setCheckable", "h", "isFeatured", "setFeatured", "i", "isLogged", "setLogged", "", "j", "Ljava/util/Map;", "getStates", "()Ljava/util/Map;", "setStates", "(Ljava/util/Map;)V", "Lcom/bbva/slidemenuview/domain/model/MenuItemAction;", "k", "Lcom/bbva/slidemenuview/domain/model/MenuItemAction;", "getClickAction", "()Lcom/bbva/slidemenuview/domain/model/MenuItemAction;", "setClickAction", "(Lcom/bbva/slidemenuview/domain/model/MenuItemAction;)V", "clickAction", "<init>", "()V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nMenuBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuBuilder.kt\ncom/bbva/slidemenuview/data/MenuItemBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,145:1\n1#2:146\n*E\n"})
public final class MenuItemBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int iconId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public boolean isChecked;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean isCheckable;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public boolean isFeatured;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean isLogged;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Map<String, String> states;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public MenuItemAction clickAction;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String route = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String text = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String loggedText = "";

    public MenuItemBuilder() {
        MenuState menuState = MenuState.DISABLED;
        this.states = q.mutableMapOf(TuplesKt.to(MenuItemStatesBuilder.USER_NO, menuState.getState()), TuplesKt.to(MenuItemStatesBuilder.USER_CACHED, menuState.getState()), TuplesKt.to(MenuItemStatesBuilder.USER_LOGGED, menuState.getState()));
        this.clickAction = MenuItemAction.PAGE;
    }

    @NotNull
    public final MenuItem build() {
        String str = this.loggedText;
        if (!this.isLogged) {
            str = null;
        }
        if (str == null) {
            str = this.text;
        }
        String str2 = str;
        return new MenuItem(this.id, this.route, new ImageSettings((ViewSettings) null, (Scale) null, new ResourceId((String) null, Integer.valueOf(this.iconId), 1, (DefaultConstructorMarker) null), (String) null, 11, (DefaultConstructorMarker) null), str2, str2, this.isChecked, this.isCheckable, this.states, this.isFeatured, this.clickAction.name());
    }

    @NotNull
    public final MenuItemAction getClickAction() {
        return this.clickAction;
    }

    public final int getIconId() {
        return this.iconId;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final String getLoggedText() {
        return this.loggedText;
    }

    @NotNull
    public final String getRoute() {
        return this.route;
    }

    @NotNull
    public final Map<String, String> getStates() {
        return this.states;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: isCheckable, reason: from getter */
    public final boolean getIsCheckable() {
        return this.isCheckable;
    }

    /* JADX INFO: renamed from: isChecked, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    /* JADX INFO: renamed from: isFeatured, reason: from getter */
    public final boolean getIsFeatured() {
        return this.isFeatured;
    }

    /* JADX INFO: renamed from: isLogged, reason: from getter */
    public final boolean getIsLogged() {
        return this.isLogged;
    }

    public final void setCheckable(boolean z10) {
        this.isCheckable = z10;
    }

    public final void setChecked(boolean z10) {
        this.isChecked = z10;
    }

    public final void setClickAction(@NotNull MenuItemAction menuItemAction) {
        Intrinsics.checkNotNullParameter(menuItemAction, "<set-?>");
        this.clickAction = menuItemAction;
    }

    public final void setFeatured(boolean z10) {
        this.isFeatured = z10;
    }

    public final void setIconId(int i10) {
        this.iconId = i10;
    }

    public final void setId(int i10) {
        this.id = i10;
    }

    public final void setLogged(boolean z10) {
        this.isLogged = z10;
    }

    public final void setLoggedText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.loggedText = str;
    }

    public final void setRoute(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.route = str;
    }

    public final void setStates(@NotNull Map<String, String> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.states = map;
    }

    public final void setText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.text = str;
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
