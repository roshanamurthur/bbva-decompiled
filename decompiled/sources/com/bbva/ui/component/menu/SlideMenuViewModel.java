package com.bbva.ui.component.menu;

import android.app.Application;
import androidx.lifecycle.MutableLiveData;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cells.component.kit.ui.viewmodel.ViewModel;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.ui.component.menu.model.HeaderMenuItem;
import com.bbva.ui.component.menu.model.HeaderSubItem;
import com.bbva.ui.component.menu.model.MenuItem;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SlideMenuViewModel.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ?2\u00020\u0001:\u0001?B\u000f\u0012\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u001a\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002J\u0010\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\u000b\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0010\u0010\f\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0010\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\bJ\u000e\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0004J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004J\u0018\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0017J\u000e\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001aJ\u000e\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001dR>\u0010%\u001a&\u0012\f\u0012\n  *\u0004\u0018\u00010\u00040\u0004  *\u0012\u0012\f\u0012\n  *\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u001f0\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R>\u0010(\u001a&\u0012\f\u0012\n  *\u0004\u0018\u00010\u00040\u0004  *\u0012\u0012\f\u0012\n  *\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u001f0\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R>\u0010+\u001a&\u0012\f\u0012\n  *\u0004\u0018\u00010\b0\b  *\u0012\u0012\f\u0012\n  *\u0004\u0018\u00010\b0\b\u0018\u00010\u001f0\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R>\u0010.\u001a&\u0012\f\u0012\n  *\u0004\u0018\u00010\b0\b  *\u0012\u0012\f\u0012\n  *\u0004\u0018\u00010\b0\b\u0018\u00010\u001f0\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010$Rn\u00101\u001aV\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004  *\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002  **\u0012$\u0012\"\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004  *\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u001f0\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u0010\"\u001a\u0004\b0\u0010$R>\u00104\u001a&\u0012\f\u0012\n  *\u0004\u0018\u00010\b0\b  *\u0012\u0012\f\u0012\n  *\u0004\u0018\u00010\b0\b\u0018\u00010\u001f0\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u0010\"\u001a\u0004\b3\u0010$R>\u00107\u001a&\u0012\f\u0012\n  *\u0004\u0018\u00010\b0\b  *\u0012\u0012\f\u0012\n  *\u0004\u0018\u00010\b0\b\u0018\u00010\u001f0\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u0010\"\u001a\u0004\b6\u0010$R>\u0010:\u001a&\u0012\f\u0012\n  *\u0004\u0018\u00010\b0\b  *\u0012\u0012\f\u0012\n  *\u0004\u0018\u00010\b0\b\u0018\u00010\u001f0\u001f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u0010\"\u001a\u0004\b9\u0010$¨\u0006@"}, d2 = {"Lcom/bbva/ui/component/menu/SlideMenuViewModel;", "Lcom/bbva/cells/component/kit/ui/viewmodel/ViewModel;", "", "", "", "featuredItems", "", "setFeaturedItems", "", "text", "setHeaderText", "setSubHeaderText", "setThirdLineText", "setHeaderInitials", "state", "setState", "locked", "lock", "opened", "quickly", "toggle", "isOpened", "onDragEnd", "Lcom/bbva/ui/component/menu/model/HeaderMenuItem;", "headerItem", "onHeaderClick", "Lcom/bbva/ui/component/menu/model/MenuItem;", AnalyticsConstants.Key.ITEM, "onItemClick", "Lcom/bbva/ui/component/menu/model/HeaderSubItem;", "onThirdLineClick", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "r0", "Landroidx/lifecycle/MutableLiveData;", "getObservableToggle$component_ui_menu_release", "()Landroidx/lifecycle/MutableLiveData;", "observableToggle", "s0", "getObservableLock$component_ui_menu_release", "observableLock", "t0", "getObservableState$component_ui_menu_release", "observableState", "u0", "getObservableHeaderText$component_ui_menu_release", "observableHeaderText", "v0", "getObservableFeatured$component_ui_menu_release", "observableFeatured", "w0", "getObservableSubHeaderText$component_ui_menu_release", "observableSubHeaderText", "x0", "getObservableThirdLineText$component_ui_menu_release", "observableThirdLineText", "y0", "getObservableHeaderInitials$component_ui_menu_release", "observableHeaderInitials", "Landroid/app/Application;", "app", "<init>", "(Landroid/app/Application;)V", "Companion", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0})
public final class SlideMenuViewModel extends ViewModel {

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public final MutableLiveData<Boolean> observableToggle;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public final MutableLiveData<Boolean> observableLock;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    public final MutableLiveData<String> observableState;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    public final MutableLiveData<String> observableHeaderText;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    public final MutableLiveData<Map<Integer, Boolean>> observableFeatured;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    public final MutableLiveData<String> observableSubHeaderText;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    public final MutableLiveData<String> observableThirdLineText;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    public final MutableLiveData<String> observableHeaderInitials;

    @JvmField
    @NotNull
    public static final ActionSpec<MenuItem> ACTION_ITEM_CLICK = new ActionSpec<>("menu-item-click");

    @JvmField
    @NotNull
    public static final ActionSpec<HeaderMenuItem> ACTION_HEADER_CLICK = new ActionSpec<>("menu-header-click");

    @JvmField
    @NotNull
    public static final ActionSpec<Void> ACTION_OPENING_MENU = new ActionSpec<>("menu-opening");

    @JvmField
    @NotNull
    public static final ActionSpec<Void> ACTION_CLOSING_MENU = new ActionSpec<>("menu-closing");

    @JvmField
    @NotNull
    public static final ActionSpec<Void> ACTION_OPENED_MENU = new ActionSpec<>("menu-opened");

    @JvmField
    @NotNull
    public static final ActionSpec<Void> ACTION_CLOSED_MENU = new ActionSpec<>("menu-closed");

    @JvmField
    @NotNull
    public static final ActionSpec<HeaderSubItem> ACTION_THIRD_LINE_CLICK = new ActionSpec<>("menu-third-line-click");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlideMenuViewModel(@NotNull Application app) {
        super(app);
        Intrinsics.checkNotNullParameter(app, "app");
        this.observableToggle = newProperty("toggle");
        this.observableLock = newProperty("lock");
        this.observableState = newProperty("state");
        this.observableHeaderText = newProperty("header-text");
        this.observableFeatured = newProperty("featured");
        this.observableSubHeaderText = newProperty("subheader-text");
        this.observableThirdLineText = newProperty("third-line-text");
        this.observableHeaderInitials = newProperty("header-initials");
    }

    public static /* synthetic */ void onDragEnd$default(SlideMenuViewModel slideMenuViewModel, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        slideMenuViewModel.onDragEnd(z10, z11);
    }

    public static /* synthetic */ void toggle$default(SlideMenuViewModel slideMenuViewModel, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        slideMenuViewModel.toggle(z10, z11);
    }

    public final MutableLiveData<Map<Integer, Boolean>> getObservableFeatured$component_ui_menu_release() {
        return this.observableFeatured;
    }

    public final MutableLiveData<String> getObservableHeaderInitials$component_ui_menu_release() {
        return this.observableHeaderInitials;
    }

    public final MutableLiveData<String> getObservableHeaderText$component_ui_menu_release() {
        return this.observableHeaderText;
    }

    public final MutableLiveData<Boolean> getObservableLock$component_ui_menu_release() {
        return this.observableLock;
    }

    public final MutableLiveData<String> getObservableState$component_ui_menu_release() {
        return this.observableState;
    }

    public final MutableLiveData<String> getObservableSubHeaderText$component_ui_menu_release() {
        return this.observableSubHeaderText;
    }

    public final MutableLiveData<String> getObservableThirdLineText$component_ui_menu_release() {
        return this.observableThirdLineText;
    }

    public final MutableLiveData<Boolean> getObservableToggle$component_ui_menu_release() {
        return this.observableToggle;
    }

    public final void lock(boolean locked) {
        setProperty("lock", Boolean.valueOf(locked));
    }

    public final void onDragEnd(boolean isOpened, boolean quickly) {
        setProperty("toggle", Boolean.valueOf(isOpened));
        if (quickly) {
            return;
        }
        if (isOpened) {
            fire(ACTION_OPENED_MENU);
        } else {
            fire(ACTION_CLOSED_MENU);
        }
    }

    public final void onHeaderClick(@NotNull HeaderMenuItem headerItem) {
        Intrinsics.checkNotNullParameter(headerItem, "headerItem");
        fire(ACTION_HEADER_CLICK, headerItem);
    }

    public final void onItemClick(@NotNull MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        fire(ACTION_ITEM_CLICK, item);
    }

    public final void onThirdLineClick(@NotNull HeaderSubItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        fire(ACTION_THIRD_LINE_CLICK, item);
    }

    public final void setFeaturedItems(@NotNull Map<Integer, Boolean> featuredItems) {
        Intrinsics.checkNotNullParameter(featuredItems, "featuredItems");
        setProperty("featured", featuredItems);
    }

    public final void setHeaderInitials(@NotNull String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        setProperty("header-initials", text);
    }

    public final void setHeaderText(@Nullable String text) {
        setProperty("header-text", text);
    }

    public final void setState(@Nullable String state) {
        setProperty("state", state);
    }

    public final void setSubHeaderText(@Nullable String text) {
        setProperty("subheader-text", text);
    }

    public final void setThirdLineText(@Nullable String text) {
        setProperty("third-line-text", text);
    }

    public final void toggle(boolean opened, boolean quickly) {
        setProperty("toggle", Boolean.valueOf(opened));
        if (quickly) {
            return;
        }
        if (opened) {
            fire(ACTION_OPENING_MENU);
        } else {
            fire(ACTION_CLOSING_MENU);
        }
    }
}
