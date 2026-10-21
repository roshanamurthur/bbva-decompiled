package com.bbva.slidemenuview;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.glomohybrid.featureflags.domain.model.FeatureFlags;
import com.bbva.ui.component.menu.model.MenuItem;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MenuItemOpenWebFlagsConfig.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0017\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005\u0012\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005HÆ\u0003J\u001a\u0010\b\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b\u0005HÆ\u0003J?\u0010\u000b\u001a\u00020\u00002\u0019\b\u0002\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00052\u0019\b\u0002\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b\u0005HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\t\u0010\u000f\u001a\u00020\u000eHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003R(\u0010\t\u001a\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\t\u0010\u0014R(\u0010\n\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/bbva/slidemenuview/MenuItemOpenWebFlagsConfig;", "", "Lkotlin/Function1;", "Lcom/bbva/glomohybrid/featureflags/domain/model/FeatureFlags;", "", "Lkotlin/ExtensionFunctionType;", "component1", "Lcom/bbva/ui/component/menu/model/MenuItem;", "component2", "isFeatureEnabled", "modify", "copy", "", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "equals", "a", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "b", "getModify", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "slidemenuview_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final /* data */ class MenuItemOpenWebFlagsConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<FeatureFlags, Boolean> isFeatureEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Function1<MenuItem, MenuItem> modify;

    /* JADX INFO: compiled from: MenuItemOpenWebFlagsConfig.kt */
    public static final class a extends Lambda implements Function1<MenuItem, MenuItem> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f36648p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final MenuItem invoke(MenuItem menuItem) {
            MenuItem menuItem2 = menuItem;
            Intrinsics.checkNotNullParameter(menuItem2, "$this$null");
            return MenuItemOpenWebFlagsConfigKt.hideOnlyEnabledStates(menuItem2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MenuItemOpenWebFlagsConfig(@NotNull Function1<? super FeatureFlags, Boolean> isFeatureEnabled, @NotNull Function1<? super MenuItem, ? extends MenuItem> modify) {
        Intrinsics.checkNotNullParameter(isFeatureEnabled, "isFeatureEnabled");
        Intrinsics.checkNotNullParameter(modify, "modify");
        this.isFeatureEnabled = isFeatureEnabled;
        this.modify = modify;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MenuItemOpenWebFlagsConfig copy$default(MenuItemOpenWebFlagsConfig menuItemOpenWebFlagsConfig, Function1 function1, Function1 function2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function1 = menuItemOpenWebFlagsConfig.isFeatureEnabled;
        }
        if ((i10 & 2) != 0) {
            function2 = menuItemOpenWebFlagsConfig.modify;
        }
        return menuItemOpenWebFlagsConfig.copy(function1, function2);
    }

    @NotNull
    public final Function1<FeatureFlags, Boolean> component1() {
        return this.isFeatureEnabled;
    }

    @NotNull
    public final Function1<MenuItem, MenuItem> component2() {
        return this.modify;
    }

    @NotNull
    public final MenuItemOpenWebFlagsConfig copy(@NotNull Function1<? super FeatureFlags, Boolean> isFeatureEnabled, @NotNull Function1<? super MenuItem, ? extends MenuItem> modify) {
        Intrinsics.checkNotNullParameter(isFeatureEnabled, "isFeatureEnabled");
        Intrinsics.checkNotNullParameter(modify, "modify");
        return new MenuItemOpenWebFlagsConfig(isFeatureEnabled, modify);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuItemOpenWebFlagsConfig)) {
            return false;
        }
        MenuItemOpenWebFlagsConfig menuItemOpenWebFlagsConfig = (MenuItemOpenWebFlagsConfig) other;
        return Intrinsics.areEqual(this.isFeatureEnabled, menuItemOpenWebFlagsConfig.isFeatureEnabled) && Intrinsics.areEqual(this.modify, menuItemOpenWebFlagsConfig.modify);
    }

    @NotNull
    public final Function1<MenuItem, MenuItem> getModify() {
        return this.modify;
    }

    public int hashCode() {
        return this.modify.hashCode() + (this.isFeatureEnabled.hashCode() * 31);
    }

    @NotNull
    public final Function1<FeatureFlags, Boolean> isFeatureEnabled() {
        return this.isFeatureEnabled;
    }

    @NotNull
    public String toString() {
        return "MenuItemOpenWebFlagsConfig(isFeatureEnabled=" + this.isFeatureEnabled + ", modify=" + this.modify + ")";
    }

    public /* synthetic */ MenuItemOpenWebFlagsConfig(Function1 function1, Function1 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, (i10 & 2) != 0 ? a.f36648p0 : function2);
    }
}
