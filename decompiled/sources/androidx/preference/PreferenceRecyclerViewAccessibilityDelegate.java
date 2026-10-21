package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate;

/* JADX INFO: loaded from: classes2.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@Deprecated
public class PreferenceRecyclerViewAccessibilityDelegate extends RecyclerViewAccessibilityDelegate {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RecyclerView f22407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AccessibilityDelegateCompat f22408d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f22409e;

    public class a extends AccessibilityDelegateCompat {
        public a() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            Preference item;
            PreferenceRecyclerViewAccessibilityDelegate preferenceRecyclerViewAccessibilityDelegate = PreferenceRecyclerViewAccessibilityDelegate.this;
            preferenceRecyclerViewAccessibilityDelegate.f22408d.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            int childAdapterPosition = preferenceRecyclerViewAccessibilityDelegate.f22407c.getChildAdapterPosition(view);
            RecyclerView.Adapter adapter = preferenceRecyclerViewAccessibilityDelegate.f22407c.getAdapter();
            if ((adapter instanceof PreferenceGroupAdapter) && (item = ((PreferenceGroupAdapter) adapter).getItem(childAdapterPosition)) != null) {
                item.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoCompat);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return PreferenceRecyclerViewAccessibilityDelegate.this.f22408d.performAccessibilityAction(view, i10, bundle);
        }
    }

    public PreferenceRecyclerViewAccessibilityDelegate(@NonNull RecyclerView recyclerView) {
        super(recyclerView);
        this.f22408d = super.getItemDelegate();
        this.f22409e = new a();
        this.f22407c = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerViewAccessibilityDelegate
    @NonNull
    public AccessibilityDelegateCompat getItemDelegate() {
        return this.f22409e;
    }
}
