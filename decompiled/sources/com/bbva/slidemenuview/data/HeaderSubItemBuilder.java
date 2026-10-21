package com.bbva.slidemenuview.data;

import bk.q;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.ui.component.menu.model.HeaderSubItem;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import com.huawei.hms.feature.model.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: MenuBuilder.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b!\u0010\"J\u0006\u0010\u0003\u001a\u00020\u0002J\u001f\u0010\t\u001a\u00020\u00062\u0017\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\b\u0007R\"\u0010\u0011\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/bbva/slidemenuview/data/HeaderSubItemBuilder;", "", "Lcom/bbva/ui/component/menu/model/HeaderSubItem;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lkotlin/Function1;", "Lcom/bbva/slidemenuview/data/MenuItemStatesBuilder;", "", "Lkotlin/ExtensionFunctionType;", "block", b.f50432b, "", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getId", "()I", "setId", "(I)V", "id", "", "b", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "setText", "(Ljava/lang/String;)V", "text", "", "c", "Ljava/util/Map;", "getStates", "()Ljava/util/Map;", "setStates", "(Ljava/util/Map;)V", "<init>", "()V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class HeaderSubItemBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public int id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public String text = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Map<String, String> states;

    public HeaderSubItemBuilder() {
        MenuState menuState = MenuState.DISABLED;
        this.states = q.mutableMapOf(TuplesKt.to(MenuItemStatesBuilder.USER_NO, menuState.getState()), TuplesKt.to(MenuItemStatesBuilder.USER_CACHED, menuState.getState()), TuplesKt.to(MenuItemStatesBuilder.USER_LOGGED, menuState.getState()));
    }

    @NotNull
    public final HeaderSubItem build() {
        return new HeaderSubItem(this.id, this.text, this.states);
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final Map<String, String> getStates() {
        return this.states;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public final void setId(int i10) {
        this.id = i10;
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
