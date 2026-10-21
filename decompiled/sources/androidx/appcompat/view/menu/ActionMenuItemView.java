package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.ForwardingListener;
import androidx.appcompat.widget.TooltipCompat;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ActionMenuItemView extends AppCompatTextView implements MenuView.ItemView, View.OnClickListener, ActionMenuView.ActionMenuChildView {
    public final int E0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public MenuItemImpl f886p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CharSequence f887q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Drawable f888r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public MenuBuilder.ItemInvoker f889s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public a f890t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public PopupCallback f891u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f892w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final int f893x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f894y0;

    public static abstract class PopupCallback {
        public abstract ShowableListMenu getPopup();
    }

    public class a extends ForwardingListener {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final ShowableListMenu getPopup() {
            PopupCallback popupCallback = ActionMenuItemView.this.f891u0;
            if (popupCallback != null) {
                return popupCallback.getPopup();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final boolean onForwardingStarted() {
            ShowableListMenu popup;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            MenuBuilder.ItemInvoker itemInvoker = actionMenuItemView.f889s0;
            return itemInvoker != null && itemInvoker.invokeItem(actionMenuItemView.f886p0) && (popup = getPopup()) != null && popup.isShowing();
        }
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    public final boolean b() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void c() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.f887q0);
        if (this.f888r0 != null && (!this.f886p0.showsTextAsAction() || (!this.v0 && !this.f892w0))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        setText(z12 ? this.f887q0 : null);
        CharSequence contentDescription = this.f886p0.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z12 ? null : this.f886p0.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f886p0.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            TooltipCompat.setTooltipText(this, z12 ? null : this.f886p0.getTitle());
        } else {
            TooltipCompat.setTooltipText(this, tooltipText);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.f886p0;
    }

    public boolean hasText() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(MenuItemImpl menuItemImpl, int i10) {
        this.f886p0 = menuItemImpl;
        setIcon(menuItemImpl.getIcon());
        setTitle(prefersCondensedTitle() ? menuItemImpl.getTitleCondensed() : menuItemImpl.getTitle());
        setId(menuItemImpl.getItemId());
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setEnabled(menuItemImpl.isEnabled());
        if (menuItemImpl.hasSubMenu() && this.f890t0 == null) {
            this.f890t0 = new a();
        }
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerAfter() {
        return hasText();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
    public boolean needsDividerBefore() {
        return hasText() && this.f886p0.getIcon() == null;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        MenuBuilder.ItemInvoker itemInvoker = this.f889s0;
        if (itemInvoker != null) {
            itemInvoker.invokeItem(this.f886p0);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.v0 = b();
        c();
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean zHasText = hasText();
        if (zHasText && (i12 = this.f894y0) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int i13 = this.f893x0;
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, i13) : i13;
        if (mode != 1073741824 && i13 > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i11);
        }
        if (zHasText || this.f888r0 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f888r0.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        a aVar;
        if (this.f886p0.hasSubMenu() && (aVar = this.f890t0) != null && aVar.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return true;
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f892w0 != z10) {
            this.f892w0 = z10;
            MenuItemImpl menuItemImpl = this.f886p0;
            if (menuItemImpl != null) {
                menuItemImpl.actionFormatChanged();
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(Drawable drawable) {
        this.f888r0 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.E0;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        c();
    }

    public void setItemInvoker(MenuBuilder.ItemInvoker itemInvoker) {
        this.f889s0 = itemInvoker;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f894y0 = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(PopupCallback popupCallback) {
        this.f891u0 = popupCallback;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(CharSequence charSequence) {
        this.f887q0 = charSequence;
        c();
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return true;
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.v0 = b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ActionMenuItemView, i10, 0);
        this.f893x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.ActionMenuItemView_android_minWidth, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.E0 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f894y0 = -1;
        setSaveEnabled(false);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z10) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z10) {
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z10, char c10) {
    }
}
