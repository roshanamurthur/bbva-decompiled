package androidx.core.view.accessibility;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.os.Build;
import android.view.accessibility.AccessibilityManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AccessibilityManagerCompat {

    @Deprecated
    public interface AccessibilityStateChangeListener {
        @Deprecated
        void onAccessibilityStateChanged(boolean z10);
    }

    @Deprecated
    public static abstract class AccessibilityStateChangeListenerCompat implements AccessibilityStateChangeListener {
    }

    public interface TouchExplorationStateChangeListener {
        void onTouchExplorationStateChanged(boolean z10);
    }

    public static class a implements AccessibilityManager.AccessibilityStateChangeListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final AccessibilityStateChangeListener f20363p0;

        public a(@NonNull AccessibilityStateChangeListener accessibilityStateChangeListener) {
            this.f20363p0 = accessibilityStateChangeListener;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                return this.f20363p0.equals(((a) obj).f20363p0);
            }
            return false;
        }

        public final int hashCode() {
            return this.f20363p0.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
        public final void onAccessibilityStateChanged(boolean z10) {
            this.f20363p0.onAccessibilityStateChanged(z10);
        }
    }

    @RequiresApi(19)
    public static class b {
        @DoNotInline
        public static boolean a(AccessibilityManager accessibilityManager, TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
            return accessibilityManager.addTouchExplorationStateChangeListener(new d(touchExplorationStateChangeListener));
        }

        @DoNotInline
        public static boolean b(AccessibilityManager accessibilityManager, TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
            return accessibilityManager.removeTouchExplorationStateChangeListener(new d(touchExplorationStateChangeListener));
        }
    }

    @RequiresApi(34)
    public static class c {
        @DoNotInline
        public static boolean a(AccessibilityManager accessibilityManager) {
            return accessibilityManager.isRequestFromAccessibilityTool();
        }
    }

    @RequiresApi(19)
    public static final class d implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final TouchExplorationStateChangeListener f20364p0;

        public d(@NonNull TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
            this.f20364p0 = touchExplorationStateChangeListener;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                return this.f20364p0.equals(((d) obj).f20364p0);
            }
            return false;
        }

        public final int hashCode() {
            return this.f20364p0.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public final void onTouchExplorationStateChanged(boolean z10) {
            this.f20364p0.onTouchExplorationStateChanged(z10);
        }
    }

    @Deprecated
    public static boolean addAccessibilityStateChangeListener(AccessibilityManager accessibilityManager, AccessibilityStateChangeListener accessibilityStateChangeListener) {
        if (accessibilityStateChangeListener == null) {
            return false;
        }
        return accessibilityManager.addAccessibilityStateChangeListener(new a(accessibilityStateChangeListener));
    }

    public static boolean addTouchExplorationStateChangeListener(@NonNull AccessibilityManager accessibilityManager, @NonNull TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        return b.a(accessibilityManager, touchExplorationStateChangeListener);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> getEnabledAccessibilityServiceList(AccessibilityManager accessibilityManager, int i10) {
        return accessibilityManager.getEnabledAccessibilityServiceList(i10);
    }

    @Deprecated
    public static List<AccessibilityServiceInfo> getInstalledAccessibilityServiceList(AccessibilityManager accessibilityManager) {
        return accessibilityManager.getInstalledAccessibilityServiceList();
    }

    public static boolean isRequestFromAccessibilityTool(@NonNull AccessibilityManager accessibilityManager) {
        if (Build.VERSION.SDK_INT >= 34) {
            return c.a(accessibilityManager);
        }
        return true;
    }

    @Deprecated
    public static boolean isTouchExplorationEnabled(AccessibilityManager accessibilityManager) {
        return accessibilityManager.isTouchExplorationEnabled();
    }

    @Deprecated
    public static boolean removeAccessibilityStateChangeListener(AccessibilityManager accessibilityManager, AccessibilityStateChangeListener accessibilityStateChangeListener) {
        if (accessibilityStateChangeListener == null) {
            return false;
        }
        return accessibilityManager.removeAccessibilityStateChangeListener(new a(accessibilityStateChangeListener));
    }

    public static boolean removeTouchExplorationStateChangeListener(@NonNull AccessibilityManager accessibilityManager, @NonNull TouchExplorationStateChangeListener touchExplorationStateChangeListener) {
        return b.b(accessibilityManager, touchExplorationStateChangeListener);
    }
}
