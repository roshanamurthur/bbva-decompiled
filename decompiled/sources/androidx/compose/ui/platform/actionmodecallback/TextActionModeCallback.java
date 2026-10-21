package androidx.compose.ui.platform.actionmodecallback;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.geometry.Rect;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TextActionModeCallback.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0000\u0018\u00002\u00020\u0001Bk\u0012\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\b\b\u0002\u0010\"\u001a\u00020\u001b\u0012\u0010\b\u0002\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010+\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015\u0012\u0010\b\u0002\u00103\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0015¢\u0006\u0004\b4\u00105J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u000b\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tJ\u0006\u0010\r\u001a\u00020\fJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R*\u0010'\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u0019\"\u0004\b%\u0010&R*\u0010+\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010\u0017\u001a\u0004\b)\u0010\u0019\"\u0004\b*\u0010&R*\u0010/\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010\u0017\u001a\u0004\b-\u0010\u0019\"\u0004\b.\u0010&R*\u00103\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b0\u0010\u0017\u001a\u0004\b1\u0010\u0019\"\u0004\b2\u0010&¨\u00066"}, d2 = {"Landroidx/compose/ui/platform/actionmodecallback/TextActionModeCallback;", "", "Landroid/view/ActionMode;", "mode", "Landroid/view/Menu;", "menu", "", "onCreateActionMode", "onPrepareActionMode", "Landroid/view/MenuItem;", AnalyticsConstants.Key.ITEM, "onActionItemClicked", "", "onDestroyActionMode", "updateMenuItems$ui_release", "(Landroid/view/Menu;)V", "updateMenuItems", "Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;", "addMenuItem$ui_release", "(Landroid/view/Menu;Landroidx/compose/ui/platform/actionmodecallback/MenuItemOption;)V", "addMenuItem", "Lkotlin/Function0;", "a", "Lkotlin/jvm/functions/Function0;", "getOnActionModeDestroy", "()Lkotlin/jvm/functions/Function0;", "onActionModeDestroy", "Landroidx/compose/ui/geometry/Rect;", "b", "Landroidx/compose/ui/geometry/Rect;", "getRect", "()Landroidx/compose/ui/geometry/Rect;", "setRect", "(Landroidx/compose/ui/geometry/Rect;)V", "rect", "c", "getOnCopyRequested", "setOnCopyRequested", "(Lkotlin/jvm/functions/Function0;)V", "onCopyRequested", "d", "getOnPasteRequested", "setOnPasteRequested", "onPasteRequested", "e", "getOnCutRequested", "setOnCutRequested", "onCutRequested", "f", "getOnSelectAllRequested", "setOnSelectAllRequested", "onSelectAllRequested", "<init>", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/geometry/Rect;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
public final class TextActionModeCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Function0<Unit> onActionModeDestroy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public Rect rect;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> onCopyRequested;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> onPasteRequested;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> onCutRequested;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Function0<Unit> onSelectAllRequested;

    public TextActionModeCallback() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final void a(Menu menu, MenuItemOption menuItemOption, Function0<Unit> function0) {
        if (function0 != null && menu.findItem(menuItemOption.getId()) == null) {
            addMenuItem$ui_release(menu, menuItemOption);
        } else {
            if (function0 != null || menu.findItem(menuItemOption.getId()) == null) {
                return;
            }
            menu.removeItem(menuItemOption.getId());
        }
    }

    public final void addMenuItem$ui_release(@NotNull Menu menu, @NotNull MenuItemOption item) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(item, "item");
        menu.add(0, item.getId(), item.getOrder(), item.getTitleResource()).setShowAsAction(1);
    }

    @Nullable
    public final Function0<Unit> getOnActionModeDestroy() {
        return this.onActionModeDestroy;
    }

    @Nullable
    public final Function0<Unit> getOnCopyRequested() {
        return this.onCopyRequested;
    }

    @Nullable
    public final Function0<Unit> getOnCutRequested() {
        return this.onCutRequested;
    }

    @Nullable
    public final Function0<Unit> getOnPasteRequested() {
        return this.onPasteRequested;
    }

    @Nullable
    public final Function0<Unit> getOnSelectAllRequested() {
        return this.onSelectAllRequested;
    }

    @NotNull
    public final Rect getRect() {
        return this.rect;
    }

    public final boolean onActionItemClicked(@Nullable ActionMode mode, @Nullable MenuItem item) {
        Intrinsics.checkNotNull(item);
        int itemId = item.getItemId();
        if (itemId == MenuItemOption.Copy.getId()) {
            Function0<Unit> function0 = this.onCopyRequested;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (itemId == MenuItemOption.Paste.getId()) {
            Function0<Unit> function1 = this.onPasteRequested;
            if (function1 != null) {
                function1.invoke();
            }
        } else if (itemId == MenuItemOption.Cut.getId()) {
            Function0<Unit> function2 = this.onCutRequested;
            if (function2 != null) {
                function2.invoke();
            }
        } else {
            if (itemId != MenuItemOption.SelectAll.getId()) {
                return false;
            }
            Function0<Unit> function3 = this.onSelectAllRequested;
            if (function3 != null) {
                function3.invoke();
            }
        }
        if (mode == null) {
            return true;
        }
        mode.finish();
        return true;
    }

    public final boolean onCreateActionMode(@Nullable ActionMode mode, @Nullable Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (mode == null) {
            throw new IllegalArgumentException("Required value was null.".toString());
        }
        if (this.onCopyRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.Copy);
        }
        if (this.onPasteRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.Paste);
        }
        if (this.onCutRequested != null) {
            addMenuItem$ui_release(menu, MenuItemOption.Cut);
        }
        if (this.onSelectAllRequested == null) {
            return true;
        }
        addMenuItem$ui_release(menu, MenuItemOption.SelectAll);
        return true;
    }

    public final void onDestroyActionMode() {
        Function0<Unit> function0 = this.onActionModeDestroy;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final boolean onPrepareActionMode(@Nullable ActionMode mode, @Nullable Menu menu) {
        if (mode == null || menu == null) {
            return false;
        }
        updateMenuItems$ui_release(menu);
        return true;
    }

    public final void setOnCopyRequested(@Nullable Function0<Unit> function0) {
        this.onCopyRequested = function0;
    }

    public final void setOnCutRequested(@Nullable Function0<Unit> function0) {
        this.onCutRequested = function0;
    }

    public final void setOnPasteRequested(@Nullable Function0<Unit> function0) {
        this.onPasteRequested = function0;
    }

    public final void setOnSelectAllRequested(@Nullable Function0<Unit> function0) {
        this.onSelectAllRequested = function0;
    }

    public final void setRect(@NotNull Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<set-?>");
        this.rect = rect;
    }

    @VisibleForTesting
    public final void updateMenuItems$ui_release(@NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        a(menu, MenuItemOption.Copy, this.onCopyRequested);
        a(menu, MenuItemOption.Paste, this.onPasteRequested);
        a(menu, MenuItemOption.Cut, this.onCutRequested);
        a(menu, MenuItemOption.SelectAll, this.onSelectAllRequested);
    }

    public TextActionModeCallback(@Nullable Function0<Unit> function0, @NotNull Rect rect, @Nullable Function0<Unit> function1, @Nullable Function0<Unit> function2, @Nullable Function0<Unit> function3, @Nullable Function0<Unit> function4) {
        Intrinsics.checkNotNullParameter(rect, "rect");
        this.onActionModeDestroy = function0;
        this.rect = rect;
        this.onCopyRequested = function1;
        this.onPasteRequested = function2;
        this.onCutRequested = function3;
        this.onSelectAllRequested = function4;
    }

    public /* synthetic */ TextActionModeCallback(Function0 function0, Rect rect, Function0 function1, Function0 function2, Function0 function3, Function0 function4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : function0, (i10 & 2) != 0 ? Rect.INSTANCE.getZero() : rect, (i10 & 4) != 0 ? null : function1, (i10 & 8) != 0 ? null : function2, (i10 & 16) != 0 ? null : function3, (i10 & 32) != 0 ? null : function4);
    }
}
