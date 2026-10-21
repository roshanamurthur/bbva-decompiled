package com.google.android.material.badge;

import ae.e;
import ae.f;
import ae.g;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ParcelableSparseArray;
import com.google.android.material.internal.ToolbarUtils;

/* JADX INFO: loaded from: classes10.dex */
@ExperimentalBadgeUtils
public class BadgeUtils {
    public static final boolean USE_COMPAT_PARENT = false;

    public class a implements Runnable {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Toolbar f43985p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f43986q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ BadgeDrawable f43987r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ FrameLayout f43988s0;

        public a(BadgeDrawable badgeDrawable, Toolbar toolbar, int i10, FrameLayout frameLayout) {
            this.f43985p0 = toolbar;
            this.f43986q0 = i10;
            this.f43987r0 = badgeDrawable;
            this.f43988s0 = frameLayout;
        }

        @Override // java.lang.Runnable
        public final void run() {
            Toolbar toolbar = this.f43985p0;
            ActionMenuItemView actionMenuItemView = ToolbarUtils.getActionMenuItemView(toolbar, this.f43986q0);
            if (actionMenuItemView != null) {
                Resources resources = toolbar.getResources();
                int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_horizontal_offset);
                Integer numValueOf = Integer.valueOf(dimensionPixelOffset);
                BadgeDrawable badgeDrawable = this.f43987r0;
                BadgeState badgeState = badgeDrawable.f43960t0;
                badgeState.f43965a.U0 = numValueOf;
                badgeState.f43966b.U0 = Integer.valueOf(dimensionPixelOffset);
                badgeDrawable.k();
                int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_badge_toolbar_action_menu_item_vertical_offset);
                Integer numValueOf2 = Integer.valueOf(dimensionPixelOffset2);
                BadgeState badgeState2 = badgeDrawable.f43960t0;
                badgeState2.f43965a.V0 = numValueOf2;
                badgeState2.f43966b.V0 = Integer.valueOf(dimensionPixelOffset2);
                badgeDrawable.k();
                BadgeUtils.attachBadgeDrawable(badgeDrawable, actionMenuItemView, this.f43988s0);
                if (Build.VERSION.SDK_INT < 29 || !ViewCompat.hasAccessibilityDelegate(actionMenuItemView)) {
                    ViewCompat.setAccessibilityDelegate(actionMenuItemView, new f(badgeDrawable));
                } else {
                    ViewCompat.setAccessibilityDelegate(actionMenuItemView, new e(actionMenuItemView.getAccessibilityDelegate(), badgeDrawable));
                }
            }
        }
    }

    public static void attachBadgeDrawable(@NonNull BadgeDrawable badgeDrawable, @NonNull View view) {
        attachBadgeDrawable(badgeDrawable, view, (FrameLayout) null);
    }

    @NonNull
    public static SparseArray<BadgeDrawable> createBadgeDrawablesFromSavedStates(Context context, @NonNull ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        for (int i10 = 0; i10 < parcelableSparseArray.size(); i10++) {
            int iKeyAt = parcelableSparseArray.keyAt(i10);
            BadgeState.State state = (BadgeState.State) parcelableSparseArray.valueAt(i10);
            sparseArray.put(iKeyAt, state != null ? new BadgeDrawable(context, 0, state) : null);
        }
        return sparseArray;
    }

    @NonNull
    public static ParcelableSparseArray createParcelableBadgeStates(@NonNull SparseArray<BadgeDrawable> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        for (int i10 = 0; i10 < sparseArray.size(); i10++) {
            int iKeyAt = sparseArray.keyAt(i10);
            BadgeDrawable badgeDrawableValueAt = sparseArray.valueAt(i10);
            parcelableSparseArray.put(iKeyAt, badgeDrawableValueAt != null ? badgeDrawableValueAt.f43960t0.f43965a : null);
        }
        return parcelableSparseArray;
    }

    public static void detachBadgeDrawable(@Nullable BadgeDrawable badgeDrawable, @NonNull View view) {
        if (badgeDrawable == null) {
            return;
        }
        if (USE_COMPAT_PARENT || badgeDrawable.getCustomBadgeParent() != null) {
            badgeDrawable.getCustomBadgeParent().setForeground(null);
        } else {
            view.getOverlay().remove(badgeDrawable);
        }
    }

    public static void setBadgeDrawableBounds(@NonNull BadgeDrawable badgeDrawable, @NonNull View view, @Nullable FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.updateBadgeCoordinates(view, frameLayout);
    }

    public static void updateBadgeBounds(@NonNull Rect rect, float f6, float f10, float f11, float f12) {
        rect.set((int) (f6 - f11), (int) (f10 - f12), (int) (f6 + f11), (int) (f10 + f12));
    }

    public static void attachBadgeDrawable(@NonNull BadgeDrawable badgeDrawable, @NonNull View view, @Nullable FrameLayout frameLayout) {
        setBadgeDrawableBounds(badgeDrawable, view, frameLayout);
        if (badgeDrawable.getCustomBadgeParent() != null) {
            badgeDrawable.getCustomBadgeParent().setForeground(badgeDrawable);
        } else {
            if (USE_COMPAT_PARENT) {
                throw new IllegalArgumentException("Trying to reference null customBadgeParent");
            }
            view.getOverlay().add(badgeDrawable);
        }
    }

    public static void detachBadgeDrawable(@Nullable BadgeDrawable badgeDrawable, @NonNull Toolbar toolbar, @IdRes int i10) {
        if (badgeDrawable == null) {
            return;
        }
        ActionMenuItemView actionMenuItemView = ToolbarUtils.getActionMenuItemView(toolbar, i10);
        if (actionMenuItemView != null) {
            BadgeState badgeState = badgeDrawable.f43960t0;
            badgeState.f43965a.U0 = 0;
            badgeState.f43966b.U0 = 0;
            badgeDrawable.k();
            badgeState.f43965a.V0 = 0;
            badgeState.f43966b.V0 = 0;
            badgeDrawable.k();
            detachBadgeDrawable(badgeDrawable, actionMenuItemView);
            if (Build.VERSION.SDK_INT >= 29 && ViewCompat.hasAccessibilityDelegate(actionMenuItemView)) {
                ViewCompat.setAccessibilityDelegate(actionMenuItemView, new g(actionMenuItemView.getAccessibilityDelegate()));
                return;
            } else {
                ViewCompat.setAccessibilityDelegate(actionMenuItemView, null);
                return;
            }
        }
        Log.w("BadgeUtils", "Trying to remove badge from a null menuItemView: " + i10);
    }

    public static void attachBadgeDrawable(@NonNull BadgeDrawable badgeDrawable, @NonNull Toolbar toolbar, @IdRes int i10) {
        attachBadgeDrawable(badgeDrawable, toolbar, i10, null);
    }

    public static void attachBadgeDrawable(@NonNull BadgeDrawable badgeDrawable, @NonNull Toolbar toolbar, @IdRes int i10, @Nullable FrameLayout frameLayout) {
        toolbar.post(new a(badgeDrawable, toolbar, i10, frameLayout));
    }
}
