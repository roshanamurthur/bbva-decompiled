package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes2.dex */
public class RecyclerViewAccessibilityDelegate extends AccessibilityDelegateCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RecyclerView f22859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ItemDelegate f22860b;

    public static class ItemDelegate extends AccessibilityDelegateCompat {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final RecyclerViewAccessibilityDelegate f22861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final WeakHashMap f22862b = new WeakHashMap();

        public ItemDelegate(@NonNull RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate) {
            this.f22861a = recyclerViewAccessibilityDelegate;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean dispatchPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f22862b.get(view);
            return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.dispatchPopulateAccessibilityEvent(view, accessibilityEvent) : super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        @Nullable
        public AccessibilityNodeProviderCompat getAccessibilityNodeProvider(@NonNull View view) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f22862b.get(view);
            return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.getAccessibilityNodeProvider(view) : super.getAccessibilityNodeProvider(view);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f22862b.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.onInitializeAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onInitializeAccessibilityNodeInfo(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = this.f22861a;
            if (!recyclerViewAccessibilityDelegate.f22859a.hasPendingAdapterUpdates()) {
                RecyclerView recyclerView = recyclerViewAccessibilityDelegate.f22859a;
                if (recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().c(view, accessibilityNodeInfoCompat);
                    AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f22862b.get(view);
                    if (accessibilityDelegateCompat != null) {
                        accessibilityDelegateCompat.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                        return;
                    } else {
                        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
                        return;
                    }
                }
            }
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void onPopulateAccessibilityEvent(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f22862b.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.onPopulateAccessibilityEvent(view, accessibilityEvent);
            } else {
                super.onPopulateAccessibilityEvent(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean onRequestSendAccessibilityEvent(@NonNull ViewGroup viewGroup, @NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f22862b.get(viewGroup);
            return accessibilityDelegateCompat != null ? accessibilityDelegateCompat.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent) : super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean performAccessibilityAction(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, int i10, @Nullable @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
            RecyclerViewAccessibilityDelegate recyclerViewAccessibilityDelegate = this.f22861a;
            if (!recyclerViewAccessibilityDelegate.f22859a.hasPendingAdapterUpdates()) {
                RecyclerView recyclerView = recyclerViewAccessibilityDelegate.f22859a;
                if (recyclerView.getLayoutManager() != null) {
                    AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f22862b.get(view);
                    if (accessibilityDelegateCompat != null) {
                        if (accessibilityDelegateCompat.performAccessibilityAction(view, i10, bundle)) {
                            return true;
                        }
                    } else if (super.performAccessibilityAction(view, i10, bundle)) {
                        return true;
                    }
                    RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
                    RecyclerView recyclerView2 = layoutManager.f22780b;
                    return layoutManager.performAccessibilityActionForItem(recyclerView2.f22758r0, recyclerView2.f22772z1, view, i10, bundle);
                }
            }
            return super.performAccessibilityAction(view, i10, bundle);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void sendAccessibilityEvent(@NonNull View view, int i10) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f22862b.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.sendAccessibilityEvent(view, i10);
            } else {
                super.sendAccessibilityEvent(view, i10);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void sendAccessibilityEventUnchecked(@NonNull View view, @NonNull AccessibilityEvent accessibilityEvent) {
            AccessibilityDelegateCompat accessibilityDelegateCompat = (AccessibilityDelegateCompat) this.f22862b.get(view);
            if (accessibilityDelegateCompat != null) {
                accessibilityDelegateCompat.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            } else {
                super.sendAccessibilityEventUnchecked(view, accessibilityEvent);
            }
        }
    }

    public RecyclerViewAccessibilityDelegate(@NonNull RecyclerView recyclerView) {
        this.f22859a = recyclerView;
        AccessibilityDelegateCompat itemDelegate = getItemDelegate();
        if (itemDelegate == null || !(itemDelegate instanceof ItemDelegate)) {
            this.f22860b = new ItemDelegate(this);
        } else {
            this.f22860b = (ItemDelegate) itemDelegate;
        }
    }

    @NonNull
    public AccessibilityDelegateCompat getItemDelegate() {
        return this.f22860b;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityEvent(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.f22859a.hasPendingAdapterUpdates()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().onInitializeAccessibilityEvent(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, @NonNull @SuppressLint({"InvalidNullabilityOverride"}) AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        RecyclerView recyclerView = this.f22859a;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f22780b;
        layoutManager.onInitializeAccessibilityNodeInfo(recyclerView2.f22758r0, recyclerView2.f22772z1, accessibilityNodeInfoCompat);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public boolean performAccessibilityAction(@NonNull @SuppressLint({"InvalidNullabilityOverride"}) View view, int i10, @Nullable @SuppressLint({"InvalidNullabilityOverride"}) Bundle bundle) {
        if (super.performAccessibilityAction(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f22859a;
        if (recyclerView.hasPendingAdapterUpdates() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.f22780b;
        return layoutManager.performAccessibilityAction(recyclerView2.f22758r0, recyclerView2.f22772z1, i10, bundle);
    }
}
