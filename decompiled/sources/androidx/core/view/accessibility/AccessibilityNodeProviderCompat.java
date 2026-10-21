package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class AccessibilityNodeProviderCompat {
    public static final int HOST_VIEW_ID = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private final Object f20383a;

    @RequiresApi(16)
    public static class a extends AccessibilityNodeProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AccessibilityNodeProviderCompat f20384a;

        public a(AccessibilityNodeProviderCompat accessibilityNodeProviderCompat) {
            this.f20384a = accessibilityNodeProviderCompat;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo createAccessibilityNodeInfo(int i10) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatCreateAccessibilityNodeInfo = this.f20384a.createAccessibilityNodeInfo(i10);
            if (accessibilityNodeInfoCompatCreateAccessibilityNodeInfo == null) {
                return null;
            }
            return accessibilityNodeInfoCompatCreateAccessibilityNodeInfo.unwrap();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i10) {
            List<AccessibilityNodeInfoCompat> listFindAccessibilityNodeInfosByText = this.f20384a.findAccessibilityNodeInfosByText(str, i10);
            if (listFindAccessibilityNodeInfosByText == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = listFindAccessibilityNodeInfosByText.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(listFindAccessibilityNodeInfosByText.get(i11).unwrap());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final boolean performAction(int i10, int i11, Bundle bundle) {
            return this.f20384a.performAction(i10, i11, bundle);
        }
    }

    @RequiresApi(19)
    public static class b extends a {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final AccessibilityNodeInfo findFocus(int i10) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompatFindFocus = this.f20384a.findFocus(i10);
            if (accessibilityNodeInfoCompatFindFocus == null) {
                return null;
            }
            return accessibilityNodeInfoCompatFindFocus.unwrap();
        }
    }

    @RequiresApi(26)
    public static class c extends b {
        @Override // android.view.accessibility.AccessibilityNodeProvider
        public final void addExtraDataToAccessibilityNodeInfo(int i10, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f20384a.addExtraDataToAccessibilityNodeInfo(i10, AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo), str, bundle);
        }
    }

    public AccessibilityNodeProviderCompat() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f20383a = new c(this);
        } else {
            this.f20383a = new b(this);
        }
    }

    @Nullable
    public AccessibilityNodeInfoCompat createAccessibilityNodeInfo(int i10) {
        return null;
    }

    @Nullable
    public List<AccessibilityNodeInfoCompat> findAccessibilityNodeInfosByText(@NonNull String str, int i10) {
        return null;
    }

    @Nullable
    public AccessibilityNodeInfoCompat findFocus(int i10) {
        return null;
    }

    @Nullable
    public Object getProvider() {
        return this.f20383a;
    }

    public boolean performAction(int i10, int i11, @Nullable Bundle bundle) {
        return false;
    }

    public AccessibilityNodeProviderCompat(@Nullable Object obj) {
        this.f20383a = obj;
    }

    public void addExtraDataToAccessibilityNodeInfo(int i10, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, @NonNull String str, @Nullable Bundle bundle) {
    }
}
