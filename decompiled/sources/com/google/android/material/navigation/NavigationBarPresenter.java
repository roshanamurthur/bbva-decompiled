package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.view.menu.SubMenuBuilder;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.badge.BadgeUtils;
import com.google.android.material.internal.ParcelableSparseArray;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class NavigationBarPresenter implements MenuPresenter {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public NavigationBarMenuView f44993p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public boolean f44994q0 = false;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f44995r0;

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f44996p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @Nullable
        public ParcelableSparseArray f44997q0;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            public final SavedState createFromParcel(@NonNull Parcel parcel) {
                SavedState savedState = new SavedState();
                savedState.f44996p0 = parcel.readInt();
                savedState.f44997q0 = (ParcelableSparseArray) parcel.readParcelable(SavedState.class.getClassLoader());
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i10) {
            parcel.writeInt(this.f44996p0);
            parcel.writeParcelable(this.f44997q0, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean collapseItemActionView(@Nullable MenuBuilder menuBuilder, @Nullable MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean expandItemActionView(@Nullable MenuBuilder menuBuilder, @Nullable MenuItemImpl menuItemImpl) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public int getId() {
        return this.f44995r0;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    @Nullable
    public MenuView getMenuView(@Nullable ViewGroup viewGroup) {
        return this.f44993p0;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void initForMenu(@NonNull Context context, @NonNull MenuBuilder menuBuilder) {
        this.f44993p0.initialize(menuBuilder);
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onRestoreInstanceState(@NonNull Parcelable parcelable) {
        SparseArray<BadgeDrawable> sparseArray;
        if (parcelable instanceof SavedState) {
            NavigationBarMenuView navigationBarMenuView = this.f44993p0;
            SavedState savedState = (SavedState) parcelable;
            int i10 = savedState.f44996p0;
            int size = navigationBarMenuView.Y0.size();
            for (int i11 = 0; i11 < size; i11++) {
                MenuItem item = navigationBarMenuView.Y0.getItem(i11);
                if (i10 == item.getItemId()) {
                    navigationBarMenuView.v0 = i10;
                    navigationBarMenuView.f44989w0 = i11;
                    item.setChecked(true);
                    break;
                }
            }
            SparseArray<BadgeDrawable> sparseArrayCreateBadgeDrawablesFromSavedStates = BadgeUtils.createBadgeDrawablesFromSavedStates(this.f44993p0.getContext(), savedState.f44997q0);
            NavigationBarMenuView navigationBarMenuView2 = this.f44993p0;
            navigationBarMenuView2.getClass();
            int i12 = 0;
            while (true) {
                int size2 = sparseArrayCreateBadgeDrawablesFromSavedStates.size();
                sparseArray = navigationBarMenuView2.M0;
                if (i12 >= size2) {
                    break;
                }
                int iKeyAt = sparseArrayCreateBadgeDrawablesFromSavedStates.keyAt(i12);
                if (sparseArray.indexOfKey(iKeyAt) < 0) {
                    sparseArray.append(iKeyAt, sparseArrayCreateBadgeDrawablesFromSavedStates.get(iKeyAt));
                }
                i12++;
            }
            NavigationBarItemView[] navigationBarItemViewArr = navigationBarMenuView2.f44988u0;
            if (navigationBarItemViewArr != null) {
                for (NavigationBarItemView navigationBarItemView : navigationBarItemViewArr) {
                    BadgeDrawable badgeDrawable = sparseArray.get(navigationBarItemView.getId());
                    if (badgeDrawable != null) {
                        navigationBarItemView.setBadge(badgeDrawable);
                    }
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState();
        savedState.f44996p0 = this.f44993p0.getSelectedItemId();
        savedState.f44997q0 = BadgeUtils.createParcelableBadgeStates(this.f44993p0.getBadgeDrawables());
        return savedState;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public boolean onSubMenuSelected(@Nullable SubMenuBuilder subMenuBuilder) {
        return false;
    }

    public void setId(int i10) {
        this.f44995r0 = i10;
    }

    public void setMenuView(@NonNull NavigationBarMenuView navigationBarMenuView) {
        this.f44993p0 = navigationBarMenuView;
    }

    public void setUpdateSuspended(boolean z10) {
        this.f44994q0 = z10;
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void updateMenuView(boolean z10) {
        if (this.f44994q0) {
            return;
        }
        if (z10) {
            this.f44993p0.buildMenuView();
        } else {
            this.f44993p0.updateMenuView();
        }
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void setCallback(@Nullable MenuPresenter.Callback callback) {
    }

    @Override // androidx.appcompat.view.menu.MenuPresenter
    public void onCloseMenu(@Nullable MenuBuilder menuBuilder, boolean z10) {
    }
}
