package androidx.core.view.accessibility;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.LocaleList;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityWindowInfo;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.os.LocaleListCompat;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public class AccessibilityWindowInfoCompat {
    public static final int TYPE_ACCESSIBILITY_OVERLAY = 4;
    public static final int TYPE_APPLICATION = 1;
    public static final int TYPE_INPUT_METHOD = 2;
    public static final int TYPE_MAGNIFICATION_OVERLAY = 6;
    public static final int TYPE_SPLIT_SCREEN_DIVIDER = 5;
    public static final int TYPE_SYSTEM = 3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20387a;

    @RequiresApi(21)
    public static class a {
        @DoNotInline
        public static void a(AccessibilityWindowInfo accessibilityWindowInfo, Rect rect) {
            accessibilityWindowInfo.getBoundsInScreen(rect);
        }

        @DoNotInline
        public static AccessibilityWindowInfo b(AccessibilityWindowInfo accessibilityWindowInfo, int i10) {
            return accessibilityWindowInfo.getChild(i10);
        }

        @DoNotInline
        public static int c(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getChildCount();
        }

        @DoNotInline
        public static int d(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getId();
        }

        @DoNotInline
        public static int e(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLayer();
        }

        @DoNotInline
        public static AccessibilityWindowInfo f(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getParent();
        }

        @DoNotInline
        public static AccessibilityNodeInfo g(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getRoot();
        }

        @DoNotInline
        public static int h(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getType();
        }

        @DoNotInline
        public static boolean i(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isAccessibilityFocused();
        }

        @DoNotInline
        public static boolean j(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isActive();
        }

        @DoNotInline
        public static boolean k(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isFocused();
        }

        @DoNotInline
        public static AccessibilityWindowInfo l() {
            return AccessibilityWindowInfo.obtain();
        }

        @DoNotInline
        public static AccessibilityWindowInfo m(AccessibilityWindowInfo accessibilityWindowInfo) {
            return AccessibilityWindowInfo.obtain(accessibilityWindowInfo);
        }
    }

    @RequiresApi(24)
    public static class b {
        @DoNotInline
        public static AccessibilityNodeInfo a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getAnchor();
        }

        @DoNotInline
        public static CharSequence b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTitle();
        }
    }

    @RequiresApi(26)
    public static class c {
        @DoNotInline
        public static boolean a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.isInPictureInPictureMode();
        }
    }

    @RequiresApi(30)
    public static class d {
        @DoNotInline
        public static AccessibilityWindowInfo a() {
            return new AccessibilityWindowInfo();
        }
    }

    @RequiresApi(33)
    public static class e {
        @DoNotInline
        public static int a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getDisplayId();
        }

        @DoNotInline
        public static void b(AccessibilityWindowInfo accessibilityWindowInfo, Region region) {
            accessibilityWindowInfo.getRegionInScreen(region);
        }

        @DoNotInline
        public static AccessibilityNodeInfoCompat c(Object obj, int i10) {
            return AccessibilityNodeInfoCompat.l(((AccessibilityWindowInfo) obj).getRoot(i10));
        }
    }

    @RequiresApi(34)
    public static class f {
        @DoNotInline
        public static LocaleList a(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getLocales();
        }

        @DoNotInline
        public static long b(AccessibilityWindowInfo accessibilityWindowInfo) {
            return accessibilityWindowInfo.getTransitionTimeMillis();
        }
    }

    public AccessibilityWindowInfoCompat() {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f20387a = d.a();
        } else {
            this.f20387a = null;
        }
    }

    @Nullable
    public static AccessibilityWindowInfoCompat obtain() {
        AccessibilityWindowInfo accessibilityWindowInfoL = a.l();
        if (accessibilityWindowInfoL != null) {
            return new AccessibilityWindowInfoCompat(accessibilityWindowInfoL);
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AccessibilityWindowInfoCompat)) {
            return false;
        }
        Object obj2 = ((AccessibilityWindowInfoCompat) obj).f20387a;
        Object obj3 = this.f20387a;
        if (obj3 == null) {
            return obj2 == null;
        }
        return obj3.equals(obj2);
    }

    @Nullable
    public AccessibilityNodeInfoCompat getAnchor() {
        if (Build.VERSION.SDK_INT >= 24) {
            return AccessibilityNodeInfoCompat.l(b.a((AccessibilityWindowInfo) this.f20387a));
        }
        return null;
    }

    public void getBoundsInScreen(@NonNull Rect rect) {
        a.a((AccessibilityWindowInfo) this.f20387a, rect);
    }

    @Nullable
    public AccessibilityWindowInfoCompat getChild(int i10) {
        AccessibilityWindowInfo accessibilityWindowInfoB = a.b((AccessibilityWindowInfo) this.f20387a, i10);
        if (accessibilityWindowInfoB != null) {
            return new AccessibilityWindowInfoCompat(accessibilityWindowInfoB);
        }
        return null;
    }

    public int getChildCount() {
        return a.c((AccessibilityWindowInfo) this.f20387a);
    }

    public int getDisplayId() {
        if (Build.VERSION.SDK_INT >= 33) {
            return e.a((AccessibilityWindowInfo) this.f20387a);
        }
        return 0;
    }

    public int getId() {
        return a.d((AccessibilityWindowInfo) this.f20387a);
    }

    public int getLayer() {
        return a.e((AccessibilityWindowInfo) this.f20387a);
    }

    @NonNull
    public LocaleListCompat getLocales() {
        return Build.VERSION.SDK_INT >= 34 ? LocaleListCompat.wrap(f.a((AccessibilityWindowInfo) this.f20387a)) : LocaleListCompat.getEmptyLocaleList();
    }

    @Nullable
    public AccessibilityWindowInfoCompat getParent() {
        AccessibilityWindowInfo accessibilityWindowInfoF = a.f((AccessibilityWindowInfo) this.f20387a);
        if (accessibilityWindowInfoF != null) {
            return new AccessibilityWindowInfoCompat(accessibilityWindowInfoF);
        }
        return null;
    }

    public void getRegionInScreen(@NonNull Region region) {
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f20387a;
        if (i10 >= 33) {
            e.b((AccessibilityWindowInfo) obj, region);
            return;
        }
        Rect rect = new Rect();
        a.a((AccessibilityWindowInfo) obj, rect);
        region.set(rect);
    }

    @Nullable
    public AccessibilityNodeInfoCompat getRoot() {
        return AccessibilityNodeInfoCompat.l(a.g((AccessibilityWindowInfo) this.f20387a));
    }

    @Nullable
    public CharSequence getTitle() {
        if (Build.VERSION.SDK_INT >= 24) {
            return b.b((AccessibilityWindowInfo) this.f20387a);
        }
        return null;
    }

    public long getTransitionTimeMillis() {
        if (Build.VERSION.SDK_INT >= 34) {
            return f.b((AccessibilityWindowInfo) this.f20387a);
        }
        return 0L;
    }

    public int getType() {
        return a.h((AccessibilityWindowInfo) this.f20387a);
    }

    public int hashCode() {
        Object obj = this.f20387a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public boolean isAccessibilityFocused() {
        return a.i((AccessibilityWindowInfo) this.f20387a);
    }

    public boolean isActive() {
        return a.j((AccessibilityWindowInfo) this.f20387a);
    }

    public boolean isFocused() {
        return a.k((AccessibilityWindowInfo) this.f20387a);
    }

    public boolean isInPictureInPictureMode() {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.a((AccessibilityWindowInfo) this.f20387a);
        }
        return false;
    }

    @NonNull
    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("AccessibilityWindowInfo[id=");
        Rect rect = new Rect();
        getBoundsInScreen(rect);
        sb2.append(getId());
        sb2.append(", type=");
        int type = getType();
        if (type == 1) {
            str = "TYPE_APPLICATION";
        } else if (type == 2) {
            str = "TYPE_INPUT_METHOD";
        } else if (type != 3) {
            str = type != 4 ? "<UNKNOWN>" : "TYPE_ACCESSIBILITY_OVERLAY";
        } else {
            str = "TYPE_SYSTEM";
        }
        sb2.append(str);
        sb2.append(", layer=");
        sb2.append(getLayer());
        sb2.append(", bounds=");
        sb2.append(rect);
        sb2.append(", focused=");
        sb2.append(isFocused());
        sb2.append(", active=");
        sb2.append(isActive());
        sb2.append(", hasParent=");
        sb2.append(getParent() != null);
        sb2.append(", hasChildren=");
        sb2.append(getChildCount() > 0);
        sb2.append(", transitionTime=");
        sb2.append(getTransitionTimeMillis());
        sb2.append(", locales=");
        sb2.append(getLocales());
        sb2.append(AbstractJsonLexerKt.END_LIST);
        return sb2.toString();
    }

    @Nullable
    public AccessibilityWindowInfo unwrap() {
        return (AccessibilityWindowInfo) this.f20387a;
    }

    @Nullable
    public static AccessibilityWindowInfoCompat obtain(@Nullable AccessibilityWindowInfoCompat accessibilityWindowInfoCompat) {
        AccessibilityWindowInfo accessibilityWindowInfoM;
        if (accessibilityWindowInfoCompat == null || (accessibilityWindowInfoM = a.m((AccessibilityWindowInfo) accessibilityWindowInfoCompat.f20387a)) == null) {
            return null;
        }
        return new AccessibilityWindowInfoCompat(accessibilityWindowInfoM);
    }

    @Nullable
    public AccessibilityNodeInfoCompat getRoot(int i10) {
        if (Build.VERSION.SDK_INT >= 33) {
            return e.c(this.f20387a, i10);
        }
        return getRoot();
    }

    public AccessibilityWindowInfoCompat(AccessibilityWindowInfo accessibilityWindowInfo) {
        this.f20387a = accessibilityWindowInfo;
    }

    @Deprecated
    public void recycle() {
    }
}
