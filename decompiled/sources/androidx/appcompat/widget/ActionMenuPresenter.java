package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.R;
import androidx.appcompat.view.ActionBarPolicy;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.BaseMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPopupHelper;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.appcompat.view.menu.SubMenuBuilder;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ActionProvider;
import androidx.core.view.GravityCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class ActionMenuPresenter extends BaseMenuPresenter implements ActionProvider.SubUiVisibilityListener {
    public int E0;
    public int F0;
    public boolean G0;
    public final SparseBooleanArray H0;
    public e I0;
    public a J0;
    public c K0;
    public b L0;
    public final f M0;
    public int N0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public d f1074t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public Drawable f1075u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f1076w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f1077x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int f1078y0;

    @SuppressLint({"BanParcelableUsage"})
    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f1079p0;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.f1079p0 = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f1079p0);
        }
    }

    public class a extends MenuPopupHelper {
        public a(Context context, SubMenuBuilder subMenuBuilder, View view) {
            super(context, subMenuBuilder, view, false, R.attr.actionOverflowMenuStyle);
            if (!((MenuItemImpl) subMenuBuilder.getItem()).isActionButton()) {
                View view2 = ActionMenuPresenter.this.f1074t0;
                setAnchorView(view2 == null ? (View) ((BaseMenuPresenter) ActionMenuPresenter.this).mMenuView : view2);
            }
            setPresenterCallback(ActionMenuPresenter.this.M0);
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        public final void onDismiss() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            actionMenuPresenter.J0 = null;
            actionMenuPresenter.N0 = 0;
            super.onDismiss();
        }
    }

    public class b extends ActionMenuItemView.PopupCallback {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.PopupCallback
        public final ShowableListMenu getPopup() {
            a aVar = ActionMenuPresenter.this.J0;
            if (aVar != null) {
                return aVar.getPopup();
            }
            return null;
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final e f1081p0;

        public c(e eVar) {
            this.f1081p0 = eVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (((BaseMenuPresenter) actionMenuPresenter).mMenu != null) {
                ((BaseMenuPresenter) actionMenuPresenter).mMenu.changeMenuMode();
            }
            View view = (View) ((BaseMenuPresenter) actionMenuPresenter).mMenuView;
            if (view != null && view.getWindowToken() != null) {
                e eVar = this.f1081p0;
                if (eVar.tryShow()) {
                    actionMenuPresenter.I0 = eVar;
                }
            }
            actionMenuPresenter.K0 = null;
        }
    }

    public class d extends AppCompatImageView implements ActionMenuView.ActionMenuChildView {

        public class a extends ForwardingListener {
            public a(View view) {
                super(view);
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public final ShowableListMenu getPopup() {
                e eVar = ActionMenuPresenter.this.I0;
                if (eVar == null) {
                    return null;
                }
                return eVar.getPopup();
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public final boolean onForwardingStarted() {
                ActionMenuPresenter.this.l();
                return true;
            }

            @Override // androidx.appcompat.widget.ForwardingListener
            public final boolean onForwardingStopped() {
                ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
                if (actionMenuPresenter.K0 != null) {
                    return false;
                }
                actionMenuPresenter.h();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            TooltipCompat.setTooltipText(this, getContentDescription());
            setOnTouchListener(new a(this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public final boolean needsDividerAfter() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.ActionMenuChildView
        public final boolean needsDividerBefore() {
            return false;
        }

        @Override // android.view.View
        public final boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            ActionMenuPresenter.this.l();
            return true;
        }

        @Override // android.widget.ImageView
        public final boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                DrawableCompat.setHotspotBounds(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    public class e extends MenuPopupHelper {
        public e(Context context, MenuBuilder menuBuilder, d dVar) {
            super(context, menuBuilder, dVar, true, R.attr.actionOverflowMenuStyle);
            setGravity(GravityCompat.END);
            setPresenterCallback(ActionMenuPresenter.this.M0);
        }

        @Override // androidx.appcompat.view.menu.MenuPopupHelper
        public final void onDismiss() {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (((BaseMenuPresenter) actionMenuPresenter).mMenu != null) {
                ((BaseMenuPresenter) actionMenuPresenter).mMenu.close();
            }
            actionMenuPresenter.I0 = null;
            super.onDismiss();
        }
    }

    public class f implements MenuPresenter.Callback {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final void onCloseMenu(@NonNull MenuBuilder menuBuilder, boolean z10) {
            if (menuBuilder instanceof SubMenuBuilder) {
                menuBuilder.getRootMenu().close(false);
            }
            MenuPresenter.Callback callback = ActionMenuPresenter.this.getCallback();
            if (callback != null) {
                callback.onCloseMenu(menuBuilder, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public final boolean onOpenSubMenu(@NonNull MenuBuilder menuBuilder) {
            ActionMenuPresenter actionMenuPresenter = ActionMenuPresenter.this;
            if (menuBuilder == ((BaseMenuPresenter) actionMenuPresenter).mMenu) {
                return false;
            }
            actionMenuPresenter.N0 = ((SubMenuBuilder) menuBuilder).getItem().getItemId();
            MenuPresenter.Callback callback = actionMenuPresenter.getCallback();
            if (callback != null) {
                return callback.onOpenSubMenu(menuBuilder);
            }
            return false;
        }
    }

    public ActionMenuPresenter(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
        this.H0 = new SparseBooleanArray();
        this.M0 = new f();
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public final void bindItemView(MenuItemImpl menuItemImpl, MenuView.ItemView itemView) {
        itemView.initialize(menuItemImpl, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) itemView;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.mMenuView);
        if (this.L0 == null) {
            this.L0 = new b();
        }
        actionMenuItemView.setPopupCallback(this.L0);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public final boolean filterLeftoverView(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.f1074t0) {
            return false;
        }
        return super.filterLeftoverView(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final boolean flagActionItems() {
        ArrayList<MenuItemImpl> visibleItems;
        int size;
        boolean z10;
        boolean z11;
        MenuBuilder menuBuilder = this.mMenu;
        View view = null;
        boolean z12 = false;
        if (menuBuilder != null) {
            visibleItems = menuBuilder.getVisibleItems();
            size = visibleItems.size();
        } else {
            visibleItems = null;
            size = 0;
        }
        int i10 = this.F0;
        int i11 = this.E0;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.mMenuView;
        int i12 = 0;
        boolean z13 = false;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            z10 = true;
            if (i12 >= size) {
                break;
            }
            MenuItemImpl menuItemImpl = visibleItems.get(i12);
            if (menuItemImpl.requiresActionButton()) {
                i13++;
            } else if (menuItemImpl.requestsActionButton()) {
                i14++;
            } else {
                z13 = true;
            }
            if (this.G0 && menuItemImpl.isActionViewExpanded()) {
                i10 = 0;
            }
            i12++;
        }
        if (this.f1076w0 && (z13 || i14 + i13 > i10)) {
            i10--;
        }
        int i15 = i10 - i13;
        SparseBooleanArray sparseBooleanArray = this.H0;
        sparseBooleanArray.clear();
        int i16 = 0;
        int i17 = 0;
        while (i16 < size) {
            MenuItemImpl menuItemImpl2 = visibleItems.get(i16);
            if (menuItemImpl2.requiresActionButton()) {
                View itemView = getItemView(menuItemImpl2, view, viewGroup);
                itemView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = itemView.getMeasuredWidth();
                i11 -= measuredWidth;
                if (i17 == 0) {
                    i17 = measuredWidth;
                }
                int groupId = menuItemImpl2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, z10);
                }
                menuItemImpl2.setIsActionButton(z10);
                z11 = z12;
            } else if (menuItemImpl2.requestsActionButton()) {
                int groupId2 = menuItemImpl2.getGroupId();
                boolean z14 = sparseBooleanArray.get(groupId2);
                boolean z15 = ((i15 > 0 || z14) && i11 > 0) ? z10 : z12;
                if (z15) {
                    View itemView2 = getItemView(menuItemImpl2, view, viewGroup);
                    itemView2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = itemView2.getMeasuredWidth();
                    i11 -= measuredWidth2;
                    if (i17 == 0) {
                        i17 = measuredWidth2;
                    }
                    z15 &= i11 + i17 > 0 ? z10 : false;
                }
                boolean z16 = z15;
                if (z16 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, z10);
                } else if (z14) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i18 = 0; i18 < i16; i18++) {
                        MenuItemImpl menuItemImpl3 = visibleItems.get(i18);
                        if (menuItemImpl3.getGroupId() == groupId2) {
                            if (menuItemImpl3.isActionButton()) {
                                i15++;
                            }
                            menuItemImpl3.setIsActionButton(false);
                        }
                    }
                }
                if (z16) {
                    i15--;
                }
                menuItemImpl2.setIsActionButton(z16);
                z11 = false;
            } else {
                z11 = z12;
                menuItemImpl2.setIsActionButton(z11);
            }
            i16++;
            z12 = z11;
            view = null;
            z10 = true;
        }
        return z10;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public final View getItemView(MenuItemImpl menuItemImpl, View view, ViewGroup viewGroup) {
        View actionView = menuItemImpl.getActionView();
        if (actionView == null || menuItemImpl.hasCollapsibleActionView()) {
            actionView = super.getItemView(menuItemImpl, view, viewGroup);
        }
        actionView.setVisibility(menuItemImpl.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final MenuView getMenuView(ViewGroup viewGroup) {
        MenuView menuView = this.mMenuView;
        MenuView menuView2 = super.getMenuView(viewGroup);
        if (menuView != menuView2) {
            ((ActionMenuView) menuView2).setPresenter(this);
        }
        return menuView2;
    }

    public final boolean h() {
        Object obj;
        c cVar = this.K0;
        if (cVar != null && (obj = this.mMenuView) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.K0 = null;
            return true;
        }
        e eVar = this.I0;
        if (eVar == null) {
            return false;
        }
        eVar.dismiss();
        return true;
    }

    public final boolean i() {
        e eVar = this.I0;
        return eVar != null && eVar.isShowing();
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final void initForMenu(@NonNull Context context, @Nullable MenuBuilder menuBuilder) {
        super.initForMenu(context, menuBuilder);
        Resources resources = context.getResources();
        ActionBarPolicy actionBarPolicy = ActionBarPolicy.get(context);
        if (!this.f1077x0) {
            this.f1076w0 = actionBarPolicy.showsOverflowMenuButton();
        }
        this.f1078y0 = actionBarPolicy.getEmbeddedMenuWidthLimit();
        this.F0 = actionBarPolicy.getMaxActionButtons();
        int measuredWidth = this.f1078y0;
        if (this.f1076w0) {
            if (this.f1074t0 == null) {
                d dVar = new d(this.mSystemContext);
                this.f1074t0 = dVar;
                if (this.v0) {
                    dVar.setImageDrawable(this.f1075u0);
                    this.f1075u0 = null;
                    this.v0 = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f1074t0.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f1074t0.getMeasuredWidth();
        } else {
            this.f1074t0 = null;
        }
        this.E0 = measuredWidth;
        float f6 = resources.getDisplayMetrics().density;
    }

    public final void j() {
        this.F0 = ActionBarPolicy.get(this.mContext).getMaxActionButtons();
        MenuBuilder menuBuilder = this.mMenu;
        if (menuBuilder != null) {
            menuBuilder.onItemsChanged(true);
        }
    }

    public final void k(ActionMenuView actionMenuView) {
        this.mMenuView = actionMenuView;
        actionMenuView.initialize(this.mMenu);
    }

    public final boolean l() {
        MenuBuilder menuBuilder;
        if (!this.f1076w0 || i() || (menuBuilder = this.mMenu) == null || this.mMenuView == null || this.K0 != null || menuBuilder.getNonActionItems().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.mContext, this.mMenu, this.f1074t0));
        this.K0 = cVar;
        ((View) this.mMenuView).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final void onCloseMenu(MenuBuilder menuBuilder, boolean z10) {
        h();
        a aVar = this.J0;
        if (aVar != null) {
            aVar.dismiss();
        }
        super.onCloseMenu(menuBuilder, z10);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final void onRestoreInstanceState(Parcelable parcelable) {
        int i10;
        MenuItem menuItemFindItem;
        if ((parcelable instanceof SavedState) && (i10 = ((SavedState) parcelable).f1079p0) > 0 && (menuItemFindItem = this.mMenu.findItem(i10)) != null) {
            onSubMenuSelected((SubMenuBuilder) menuItemFindItem.getSubMenu());
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.f1079p0 = this.N0;
        return savedState;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final boolean onSubMenuSelected(SubMenuBuilder subMenuBuilder) {
        boolean z10 = false;
        if (!subMenuBuilder.hasVisibleItems()) {
            return false;
        }
        SubMenuBuilder subMenuBuilder2 = subMenuBuilder;
        while (subMenuBuilder2.getParentMenu() != this.mMenu) {
            subMenuBuilder2 = (SubMenuBuilder) subMenuBuilder2.getParentMenu();
        }
        MenuItem item = subMenuBuilder2.getItem();
        ViewGroup viewGroup = (ViewGroup) this.mMenuView;
        View view = null;
        view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if ((childAt instanceof MenuView.ItemView) && ((MenuView.ItemView) childAt).getItemData() == item) {
                    view = childAt;
                    break;
                }
            }
        }
        if (view == null) {
            return false;
        }
        this.N0 = subMenuBuilder.getItem().getItemId();
        int size = subMenuBuilder.size();
        for (int i11 = 0; i11 < size; i11++) {
            MenuItem item2 = subMenuBuilder.getItem(i11);
            if (item2.isVisible() && item2.getIcon() != null) {
                z10 = true;
                break;
            }
        }
        a aVar = new a(this.mContext, subMenuBuilder, view);
        this.J0 = aVar;
        aVar.setForceShowIcon(z10);
        this.J0.show();
        super.onSubMenuSelected(subMenuBuilder);
        return true;
    }

    @Override // androidx.core.view.ActionProvider.SubUiVisibilityListener
    public final void onSubUiVisibilityChanged(boolean z10) {
        if (z10) {
            super.onSubMenuSelected(null);
            return;
        }
        MenuBuilder menuBuilder = this.mMenu;
        if (menuBuilder != null) {
            menuBuilder.close(false);
        }
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter
    public final boolean shouldIncludeItem(int i10, MenuItemImpl menuItemImpl) {
        return menuItemImpl.isActionButton();
    }

    @Override // androidx.appcompat.view.menu.BaseMenuPresenter, androidx.appcompat.view.menu.MenuPresenter
    public final void updateMenuView(boolean z10) {
        int size;
        super.updateMenuView(z10);
        ((View) this.mMenuView).requestLayout();
        MenuBuilder menuBuilder = this.mMenu;
        if (menuBuilder != null) {
            ArrayList<MenuItemImpl> actionItems = menuBuilder.getActionItems();
            int size2 = actionItems.size();
            for (int i10 = 0; i10 < size2; i10++) {
                ActionProvider supportActionProvider = actionItems.get(i10).getSupportActionProvider();
                if (supportActionProvider != null) {
                    supportActionProvider.setSubUiVisibilityListener(this);
                }
            }
        }
        MenuBuilder menuBuilder2 = this.mMenu;
        ArrayList<MenuItemImpl> nonActionItems = menuBuilder2 != null ? menuBuilder2.getNonActionItems() : null;
        if (!this.f1076w0 || nonActionItems == null || ((size = nonActionItems.size()) != 1 ? size <= 0 : !(!nonActionItems.get(0).isActionViewExpanded()))) {
            d dVar = this.f1074t0;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.mMenuView;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f1074t0);
                }
            }
        } else {
            if (this.f1074t0 == null) {
                this.f1074t0 = new d(this.mSystemContext);
            }
            ViewGroup viewGroup = (ViewGroup) this.f1074t0.getParent();
            if (viewGroup != this.mMenuView) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f1074t0);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.mMenuView;
                actionMenuView.addView(this.f1074t0, actionMenuView.generateOverflowButtonLayoutParams());
            }
        }
        ((ActionMenuView) this.mMenuView).setOverflowReserved(this.f1076w0);
    }
}
