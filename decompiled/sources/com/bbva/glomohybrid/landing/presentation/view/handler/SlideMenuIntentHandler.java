package com.bbva.glomohybrid.landing.presentation.view.handler;

import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.app.ComponentManager;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.ui.component.menu.SlideMenuViewModel;
import com.bbva.ui.component.menu.model.MenuItem;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.ChannelKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SlideMenuIntentHandler.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\f\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/view/handler/SlideMenuIntentHandler;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/bbva/glomohybrid/landing/presentation/view/handler/SlideMenuIntentHandler$Intent;", "r0", "Lkotlinx/coroutines/flow/Flow;", "getIntent", "()Lkotlinx/coroutines/flow/Flow;", "intent", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "pageId", "", "componentId", "<init>", "(ILjava/lang/String;)V", "Intent", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class SlideMenuIntentHandler implements CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f33117p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Channel<Intent> f33118q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Flow<Intent> intent;

    /* JADX INFO: compiled from: SlideMenuIntentHandler.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/view/handler/SlideMenuIntentHandler$Intent;", "", "()V", "ItemTap", "MenuClosed", "Lcom/bbva/glomohybrid/landing/presentation/view/handler/SlideMenuIntentHandler$Intent$ItemTap;", "Lcom/bbva/glomohybrid/landing/presentation/view/handler/SlideMenuIntentHandler$Intent$MenuClosed;", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class Intent {

        /* JADX INFO: compiled from: SlideMenuIntentHandler.kt */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u0013\u0010\u0005\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/view/handler/SlideMenuIntentHandler$Intent$ItemTap;", "Lcom/bbva/glomohybrid/landing/presentation/view/handler/SlideMenuIntentHandler$Intent;", "Lcom/bbva/ui/component/menu/model/MenuItem;", "component1", AnalyticsConstants.Key.ITEM, "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "", "other", "", "equals", "a", "Lcom/bbva/ui/component/menu/model/MenuItem;", "getItem", "()Lcom/bbva/ui/component/menu/model/MenuItem;", "<init>", "(Lcom/bbva/ui/component/menu/model/MenuItem;)V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0})
        public static final /* data */ class ItemTap extends Intent {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @NotNull
            public final MenuItem item;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ItemTap(@NotNull MenuItem item) {
                super(null);
                Intrinsics.checkNotNullParameter(item, "item");
                this.item = item;
            }

            public static /* synthetic */ ItemTap copy$default(ItemTap itemTap, MenuItem menuItem, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    menuItem = itemTap.item;
                }
                return itemTap.copy(menuItem);
            }

            @NotNull
            /* JADX INFO: renamed from: component1, reason: from getter */
            public final MenuItem getItem() {
                return this.item;
            }

            @NotNull
            public final ItemTap copy(@NotNull MenuItem item) {
                Intrinsics.checkNotNullParameter(item, "item");
                return new ItemTap(item);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ItemTap) && Intrinsics.areEqual(this.item, ((ItemTap) other).item);
            }

            @NotNull
            public final MenuItem getItem() {
                return this.item;
            }

            public int hashCode() {
                return this.item.hashCode();
            }

            @NotNull
            public String toString() {
                return "ItemTap(item=" + this.item + ")";
            }
        }

        /* JADX INFO: compiled from: SlideMenuIntentHandler.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/glomohybrid/landing/presentation/view/handler/SlideMenuIntentHandler$Intent$MenuClosed;", "Lcom/bbva/glomohybrid/landing/presentation/view/handler/SlideMenuIntentHandler$Intent;", "()V", "Landing_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class MenuClosed extends Intent {

            @NotNull
            public static final MenuClosed INSTANCE = new MenuClosed();

            public MenuClosed() {
                super(null);
            }
        }

        public Intent() {
        }

        public /* synthetic */ Intent(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SlideMenuIntentHandler(int i10, @NotNull String componentId) {
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        this.f33117p0 = CoroutineScopeKt.MainScope();
        Object obj = ComponentManager.get(i10, componentId);
        Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
        Channel<Intent> channelChannel$default = ChannelKt.Channel$default(0, null, null, 7, null);
        this.f33118q0 = channelChannel$default;
        this.intent = FlowKt.consumeAsFlow(channelChannel$default);
        ((SlideMenuViewModel) obj).addOnEventListener(new ReactiveComponent.ActionSpecListener() { // from class: com.bbva.glomohybrid.landing.presentation.view.handler.SlideMenuIntentHandler.1
            @Override // com.bbva.cells.component.kit.common.ReactiveComponent.ActionSpecListener
            public <T> void onEvent(@NotNull String id, @NotNull ActionSpec<T> action, T payload) {
                Intrinsics.checkNotNullParameter(id, "id");
                Intrinsics.checkNotNullParameter(action, "action");
                String id2 = action.getId();
                boolean zAreEqual = Intrinsics.areEqual(id2, SlideMenuViewModel.ACTION_ITEM_CLICK.getId());
                SlideMenuIntentHandler slideMenuIntentHandler = SlideMenuIntentHandler.this;
                if (zAreEqual) {
                    SlideMenuIntentHandler.access$handleOnClickItem(slideMenuIntentHandler, payload);
                } else if (Intrinsics.areEqual(id2, SlideMenuViewModel.ACTION_CLOSED_MENU.getId())) {
                    SlideMenuIntentHandler.access$handleMenuClosed(slideMenuIntentHandler);
                }
            }
        });
    }

    public static final void access$handleMenuClosed(SlideMenuIntentHandler slideMenuIntentHandler) {
        slideMenuIntentHandler.getClass();
        BuildersKt__Builders_commonKt.launch$default(slideMenuIntentHandler, null, null, new a(slideMenuIntentHandler, null), 3, null);
    }

    public static final void access$handleOnClickItem(SlideMenuIntentHandler slideMenuIntentHandler, Object obj) {
        slideMenuIntentHandler.getClass();
        MenuItem menuItem = obj instanceof MenuItem ? (MenuItem) obj : null;
        if (menuItem == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(slideMenuIntentHandler, null, null, new b(slideMenuIntentHandler, menuItem, null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f33117p0.getCoroutineContext();
    }

    @NotNull
    public final Flow<Intent> getIntent() {
        return this.intent;
    }
}
