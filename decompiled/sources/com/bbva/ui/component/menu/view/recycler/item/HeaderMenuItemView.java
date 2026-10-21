package com.bbva.ui.component.menu.view.recycler.item;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bbva.cellswidgets.CellsTextView;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.bbva.ui.component.menu.databinding.ViewSlideMenuItemHeaderBinding;
import com.bbva.ui.component.menu.extensions.ViewExtensionKt;
import com.bbva.ui.component.menu.model.BaseMenuItem;
import com.bbva.ui.component.menu.model.HeaderMenuItem;
import com.bbva.ui.component.menu.model.HeaderSubItem;
import com.bbva.ui.component.menu.view.recycler.MenuRecyclerView;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: HeaderMenuItemView.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0002/.B1\b\u0007\u0012\u0006\u0010'\u001a\u00020&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\b\b\u0002\u0010*\u001a\u00020\t\u0012\b\b\u0002\u0010+\u001a\u00020\t¢\u0006\u0004\b,\u0010-J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0014J\u001a\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0013\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0016\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fJ\u0010\u0010\u0017\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u000fJ\u0006\u0010\u0018\u001a\u00020\u0006J\u001c\u0010\u001c\u001a\u00020\u00062\u0014\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00060\u0019R\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0011\u0010%\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u00060"}, d2 = {"Lcom/bbva/ui/component/menu/view/recycler/item/HeaderMenuItemView;", "Landroid/widget/FrameLayout;", "Landroid/widget/Checkable;", "", "isChecked", "checked", "", "setChecked", "toggle", "", "extraSpace", "", "onCreateDrawableState", "Lcom/bbva/ui/component/menu/model/HeaderMenuItem;", AnalyticsConstants.Key.ITEM, "", "state", "setItem", "initials", "setInitials", "text", "setHeaderTitleText", "setSubheaderItemText", "setThirdLineItemText", "reset", "Lkotlin/Function1;", "Landroid/view/View;", "block", "setThirdLineOnClickListener", "Lcom/bbva/ui/component/menu/databinding/ViewSlideMenuItemHeaderBinding;", "p0", "Lkotlin/Lazy;", "getBinding", "()Lcom/bbva/ui/component/menu/databinding/ViewSlideMenuItemHeaderBinding;", "binding", "getSpace", "()I", "space", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Companion", "Behavior", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0})
public final class HeaderMenuItemView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public static final int[] f37008s0 = {R.attr.state_checked};

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy binding;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f37010q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public boolean f37011r0;

    /* JADX INFO: compiled from: HeaderMenuItemView.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010#\u001a\u00020\"\u0012\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J \u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J8\u0010\u0010\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016JH\u0010\u0016\u001a\u00020\u00152\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016R\"\u0010\u001d\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010!\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u001f\u0010\u001a\"\u0004\b \u0010\u001c¨\u0006("}, d2 = {"Lcom/bbva/ui/component/menu/view/recycler/item/HeaderMenuItemView$Behavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$Behavior;", "Lcom/bbva/ui/component/menu/view/recycler/item/HeaderMenuItemView;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout;", "parent", "child", "Landroid/view/View;", "dependency", "", "layoutDependsOn", "coordinatorLayout", "directTargetChild", "target", "", "axes", "type", "onStartNestedScroll", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "", "onNestedScroll", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getSpace$component_ui_menu_release", "()I", "setSpace$component_ui_menu_release", "(I)V", "space", "q0", "getScrollY$component_ui_menu_release", "setScrollY$component_ui_menu_release", "scrollY", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0})
    public static final class Behavior extends CoordinatorLayout.Behavior<HeaderMenuItemView> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
        public int space;

        /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
        public int scrollY;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public float f37014r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public float f37015s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Behavior(@NotNull Context context, @NotNull AttributeSet attrs) {
            super(context, attrs);
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, com.bbva.ui.component.menu.R.styleable.HeaderMenuItemView_Behavior);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…derMenuItemView_Behavior)");
            this.space = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.bbva.ui.component.menu.R.styleable.HeaderMenuItemView_Behavior_behavior_space, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: getScrollY$component_ui_menu_release, reason: from getter */
        public final int getScrollY() {
            return this.scrollY;
        }

        /* JADX INFO: renamed from: getSpace$component_ui_menu_release, reason: from getter */
        public final int getSpace() {
            return this.space;
        }

        public final void setScrollY$component_ui_menu_release(int i10) {
            this.scrollY = i10;
        }

        public final void setSpace$component_ui_menu_release(int i10) {
            this.space = i10;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean layoutDependsOn(@NotNull CoordinatorLayout parent, @NotNull HeaderMenuItemView child, @NotNull View dependency) {
            Intrinsics.checkNotNullParameter(parent, "parent");
            Intrinsics.checkNotNullParameter(child, "child");
            Intrinsics.checkNotNullParameter(dependency, "dependency");
            if (!super.layoutDependsOn(parent, child, dependency)) {
                if (!(dependency instanceof MenuRecyclerView)) {
                    return false;
                }
                this.f37014r0 = (float) (((double) child.getHeight()) * 0.2d);
                this.f37015s0 = (float) (((double) child.getHeight()) * 0.35d);
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public void onNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull HeaderMenuItemView child, @NotNull View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
            Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
            Intrinsics.checkNotNullParameter(child, "child");
            Intrinsics.checkNotNullParameter(target, "target");
            MenuRecyclerView menuRecyclerView = (MenuRecyclerView) target;
            super.onNestedScroll(coordinatorLayout, child, (View) menuRecyclerView, dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, type);
            int i10 = this.scrollY + dyConsumed;
            this.scrollY = i10;
            if ((dyConsumed <= 0 || i10 <= this.space) && (dyConsumed >= 0 || i10 >= menuRecyclerView.getTopSpace())) {
                return;
            }
            float fCoerceIn = c.coerceIn(this.scrollY - this.space, 0, child.getHeight());
            float fCoerceAtLeast = c.coerceAtLeast(fCoerceIn - this.f37014r0, 0.0f);
            child.setTranslationY(-fCoerceIn);
            child.setAlpha(c.coerceIn(1 - (fCoerceAtLeast / this.f37015s0), 0.0f, 1.0f));
            child.requestLayout();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean onStartNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull HeaderMenuItemView child, @NotNull View directTargetChild, @NotNull View target, int axes, int type) {
            Intrinsics.checkNotNullParameter(coordinatorLayout, "coordinatorLayout");
            Intrinsics.checkNotNullParameter(child, "child");
            Intrinsics.checkNotNullParameter(directTargetChild, "directTargetChild");
            Intrinsics.checkNotNullParameter(target, "target");
            return axes == 2 || super.onStartNestedScroll(coordinatorLayout, child, directTargetChild, target, axes, type);
        }
    }

    /* JADX INFO: compiled from: HeaderMenuItemView.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/bbva/ui/component/menu/view/recycler/item/HeaderMenuItemView$Companion;", "", "()V", "DRAWABLE_STATE_CHECKED", "", "VISIBILITY_MAX", "", "VISIBILITY_MIN", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: HeaderMenuItemView.kt */
    public static final class a extends Lambda implements Function0<ViewSlideMenuItemHeaderBinding> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f37016p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ HeaderMenuItemView f37017q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, HeaderMenuItemView headerMenuItemView) {
            super(0);
            this.f37016p0 = context;
            this.f37017q0 = headerMenuItemView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewSlideMenuItemHeaderBinding invoke() {
            return ViewSlideMenuItemHeaderBinding.inflate(LayoutInflater.from(this.f37016p0), this.f37017q0, true);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HeaderMenuItemView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public static void a(CellsTextView cellsTextView, String str) {
        if (Intrinsics.areEqual(str, BaseMenuItem.STATE_DISABLED)) {
            if (cellsTextView != null) {
                cellsTextView.setEnabled(false);
            }
            if (cellsTextView == null) {
                return;
            }
            cellsTextView.setVisibility(0);
            return;
        }
        if (Intrinsics.areEqual(str, BaseMenuItem.STATE_HIDDEN)) {
            if (cellsTextView != null) {
                cellsTextView.setEnabled(false);
            }
            if (cellsTextView == null) {
                return;
            }
            cellsTextView.setVisibility(8);
            return;
        }
        if (cellsTextView != null) {
            cellsTextView.setEnabled(true);
        }
        if (cellsTextView == null) {
            return;
        }
        cellsTextView.setVisibility(0);
    }

    private final ViewSlideMenuItemHeaderBinding getBinding() {
        return (ViewSlideMenuItemHeaderBinding) this.binding.getValue();
    }

    public static /* synthetic */ void setItem$default(HeaderMenuItemView headerMenuItemView, HeaderMenuItem headerMenuItem, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        headerMenuItemView.setItem(headerMenuItem, str);
    }

    public final void b(CellsTextView cellsTextView, HeaderSubItem headerSubItem, String str, Map<String, String> map) {
        if (headerSubItem == null) {
            if (cellsTextView == null) {
                return;
            }
            cellsTextView.setVisibility(8);
            return;
        }
        if (cellsTextView != null) {
            cellsTextView.setText(headerSubItem.getText());
        }
        if (cellsTextView != null) {
            Map<String, String> states = headerSubItem.getStates();
            String str2 = map != null ? map.get(str) : null;
            String str3 = states != null ? states.get(str) : null;
            if (Intrinsics.areEqual(str2, BaseMenuItem.STATE_DISABLED)) {
                setEnabled(false);
                setVisibility(0);
                a(cellsTextView, str3);
            } else if (Intrinsics.areEqual(str2, BaseMenuItem.STATE_HIDDEN)) {
                setEnabled(false);
                setVisibility(8);
            } else {
                setEnabled(true);
                setVisibility(0);
                a(cellsTextView, str3);
            }
        }
    }

    public final int getSpace() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        Intrinsics.checkNotNull(behavior, "null cannot be cast to non-null type com.bbva.ui.component.menu.view.recycler.item.HeaderMenuItemView.Behavior");
        return ((Behavior) behavior).getSpace();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f37010q0;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public int[] onCreateDrawableState(int extraSpace) {
        int[] iArr = f37008s0;
        int[] drawableState = super.onCreateDrawableState(extraSpace + iArr.length);
        if (isChecked()) {
            View.mergeDrawableStates(drawableState, iArr);
        }
        Intrinsics.checkNotNullExpressionValue(drawableState, "drawableState");
        return drawableState;
    }

    public final void reset() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        Behavior behavior = (Behavior) ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
        if (behavior != null) {
            behavior.setScrollY$component_ui_menu_release(0);
        }
        setChecked(false);
        setTranslationY(0.0f);
        setAlpha(1.0f);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        boolean z10 = this.f37011r0 && checked;
        this.f37010q0 = z10;
        setSelected(z10);
        refreshDrawableState();
    }

    public final void setHeaderTitleText(@Nullable String text) {
        CellsTextView cellsTextView = getBinding().headerTitleTextView;
        if (text == null) {
            text = "";
        }
        cellsTextView.setText(text);
    }

    public final void setInitials(@Nullable String initials) {
        if (initials == null || initials.length() == 0) {
            getBinding().initialsView.setVisibility(8);
        } else {
            getBinding().initialsView.setVisibility(0);
            getBinding().initialsView.setInitials(initials);
        }
    }

    public final void setItem(@NotNull HeaderMenuItem item, @Nullable String state) {
        Intrinsics.checkNotNullParameter(item, "item");
        setChecked(item.getIsChecked());
        this.f37011r0 = item.getIsCheckable();
        getBinding().headerTitleTextView.setText(item.getText());
        a(getBinding().headerTitleTextView, state);
        b(getBinding().headerSubtitleTextView, item.getCom.salesforce.marketingcloud.notifications.NotificationMessage.NOTIF_KEY_SUB_TITLE java.lang.String(), state, item.getStates());
        b(getBinding().subHeaderTextView, item.getSubHeader(), state, item.getStates());
        b(getBinding().headerThirdLine, item.getThirdLine(), state, item.getStates());
        ViewExtensionKt.setAccessibilityDelegate(this, TuplesKt.to(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK, item.getClickAccessibilityLabel()));
        setInitials(item.getInitials());
    }

    public final void setSubheaderItemText(@Nullable String text) {
        CellsTextView cellsTextView = getBinding().subHeaderTextView;
        if (text == null) {
            text = "";
        }
        cellsTextView.setText(text);
    }

    public final void setThirdLineItemText(@Nullable String text) {
        CellsTextView cellsTextView = getBinding().headerThirdLine;
        if (text == null) {
            text = "";
        }
        cellsTextView.setText(text);
    }

    public final void setThirdLineOnClickListener(@NotNull Function1<? super View, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        getBinding().headerThirdLine.setOnClickListener(new x5.a(block, 1));
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HeaderMenuItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HeaderMenuItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ HeaderMenuItemView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public HeaderMenuItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = LazyKt__LazyJVMKt.lazy(new a(context, this));
        this.f37011r0 = true;
    }
}
