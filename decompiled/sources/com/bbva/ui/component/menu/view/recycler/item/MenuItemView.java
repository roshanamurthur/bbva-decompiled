package com.bbva.ui.component.menu.view.recycler.item;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import androidx.camera.core.impl.utils.c;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bbva.cells.componentkit.dsl.ImageViewKt;
import com.bbva.cellswidgets.CellsImageView;
import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.ui.component.menu.databinding.ViewSlideMenuItemBinding;
import com.bbva.ui.component.menu.extensions.ViewExtensionKt;
import com.bbva.ui.component.menu.model.BaseMenuItem;
import com.bbva.ui.component.menu.model.MenuItem;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MenuItemView.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 )2\u00020\u00012\u00020\u0002:\u0001)B1\b\u0007\u0012\u0006\u0010\"\u001a\u00020!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010%\u001a\u00020\t\u0012\b\b\u0002\u0010&\u001a\u00020\t¢\u0006\u0004\b'\u0010(J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0014J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\rR\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R+\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00038B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006*"}, d2 = {"Lcom/bbva/ui/component/menu/view/recycler/item/MenuItemView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/widget/Checkable;", "", "isChecked", "checked", "", "setChecked", "toggle", "", "extraSpace", "", "onCreateDrawableState", "", "getAccessibilityClassName", "Lcom/bbva/ui/component/menu/model/MenuItem;", "getItem", AnalyticsConstants.Key.ITEM, "state", "setItem", "Lcom/bbva/ui/component/menu/databinding/ViewSlideMenuItemBinding;", "p0", "Lkotlin/Lazy;", "getBinding", "()Lcom/bbva/ui/component/menu/databinding/ViewSlideMenuItemBinding;", "binding", "<set-?>", "q0", "Lkotlin/properties/ReadWriteProperty;", "isFeatured", "()Z", "setFeatured", "(Z)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Companion", "component-ui-menu_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nMenuItemView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MenuItemView.kt\ncom/bbva/ui/component/menu/view/recycler/item/MenuItemView\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,100:1\n33#2,3:101\n*S KotlinDebug\n*F\n+ 1 MenuItemView.kt\ncom/bbva/ui/component/menu/view/recycler/item/MenuItemView\n*L\n33#1:101,3\n*E\n"})
public final class MenuItemView extends ConstraintLayout implements Checkable {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy binding;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final MenuItemView$special$$inlined$observable$1 f37021q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public MenuItem f37022r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public boolean f37023s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final /* synthetic */ KProperty<Object>[] f37018t0 = {c.e(MenuItemView.class, "isFeatured", "isFeatured()Z", 0)};

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public static final int[] f37019u0 = {R.attr.state_checked};

    /* JADX INFO: compiled from: MenuItemView.kt */
    public static final class a extends Lambda implements Function0<ViewSlideMenuItemBinding> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f37024p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MenuItemView f37025q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, MenuItemView menuItemView) {
            super(0);
            this.f37024p0 = context;
            this.f37025q0 = menuItemView;
        }

        @Override // kotlin.jvm.functions.Function0
        public final ViewSlideMenuItemBinding invoke() {
            return ViewSlideMenuItemBinding.inflate(LayoutInflater.from(this.f37024p0), this.f37025q0);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MenuItemView(@NotNull Context context) {
        this(context, null, 0, 0, 14, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ViewSlideMenuItemBinding getBinding() {
        return (ViewSlideMenuItemBinding) this.binding.getValue();
    }

    private final void setFeatured(boolean z10) {
        setValue(this, f37018t0[0], Boolean.valueOf(z10));
    }

    public static /* synthetic */ void setItem$default(MenuItemView menuItemView, MenuItem menuItem, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        menuItemView.setItem(menuItem, str);
    }

    @Nullable
    /* JADX INFO: renamed from: getItem, reason: from getter */
    public final MenuItem getF37022r0() {
        return this.f37022r0;
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f37023s0;
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public int[] onCreateDrawableState(int extraSpace) {
        int[] iArr = f37019u0;
        int[] drawableState = super.onCreateDrawableState(extraSpace + iArr.length);
        if (isChecked()) {
            View.mergeDrawableStates(drawableState, iArr);
        }
        Intrinsics.checkNotNullExpressionValue(drawableState, "drawableState");
        return drawableState;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean checked) {
        MenuItem menuItem = this.f37022r0;
        boolean z10 = menuItem != null && menuItem.getIsCheckable() && checked;
        this.f37023s0 = z10;
        setSelected(z10);
        refreshDrawableState();
    }

    public final void setItem(@NotNull MenuItem item, @Nullable String state) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.f37022r0 = item;
        ViewExtensionKt.setAccessibilityDelegate(this, TuplesKt.to(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK, item.getClickAccessibilityLabel()));
        setChecked(item.getIsChecked());
        CellsImageView cellsImageView = getBinding().iconImageView;
        Intrinsics.checkNotNullExpressionValue(cellsImageView, "binding.iconImageView");
        ImageViewKt.settings(cellsImageView, item.getIcon());
        getBinding().textLabel.setText(item.getText());
        getBinding().textLabel.setContentDescription(item.getClickAccessibilityLabel());
        setFeatured(item.getIsFeatured());
        Map<String, String> states = item.getStates();
        String str = states != null ? states.get(state) : null;
        if (Intrinsics.areEqual(str, BaseMenuItem.STATE_DISABLED)) {
            getBinding().textLabel.setEnabled(false);
            setEnabled(false);
            setVisibility(0);
        } else if (Intrinsics.areEqual(str, BaseMenuItem.STATE_HIDDEN)) {
            getBinding().textLabel.setEnabled(false);
            setEnabled(false);
            setVisibility(8);
        } else {
            getBinding().textLabel.setEnabled(true);
            setEnabled(true);
            setVisibility(0);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MenuItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // android.view.ViewGroup, android.view.View
    @NotNull
    public String getAccessibilityClassName() {
        return Button.class.getName();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MenuItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0, 8, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ MenuItemView(Context context, AttributeSet attributeSet, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.bbva.ui.component.menu.view.recycler.item.MenuItemView$special$$inlined$observable$1] */
    @JvmOverloads
    public MenuItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.binding = LazyKt__LazyJVMKt.lazy(new a(context, this));
        Delegates delegates = Delegates.INSTANCE;
        final Boolean bool = Boolean.FALSE;
        this.f37021q0 = new ObservableProperty<Boolean>(bool) { // from class: com.bbva.ui.component.menu.view.recycler.item.MenuItemView$special$$inlined$observable$1
            @Override // kotlin.properties.ObservableProperty
            public void afterChange(@NotNull KProperty<?> property, Boolean oldValue, Boolean newValue) {
                Intrinsics.checkNotNullParameter(property, "property");
                boolean zBooleanValue = newValue.booleanValue();
                oldValue.booleanValue();
                this.getBinding().iconFeaturedView.setVisibility(zBooleanValue ? 0 : 8);
            }
        };
    }
}
