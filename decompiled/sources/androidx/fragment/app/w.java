package androidx.fragment.app;

import android.view.View;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

/* JADX INFO: compiled from: FragmentTransition.java */
/* JADX INFO: loaded from: classes2.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f21780a = new x();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FragmentTransitionImpl f21781b;

    static {
        FragmentTransitionImpl fragmentTransitionImpl;
        try {
            fragmentTransitionImpl = (FragmentTransitionImpl) FragmentTransitionSupport.class.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            fragmentTransitionImpl = null;
        }
        f21781b = fragmentTransitionImpl;
    }

    public static void a(Fragment fragment, Fragment fragment2, boolean z10, ArrayMap<String, View> arrayMap, boolean z11) {
        SharedElementCallback enterTransitionCallback = z10 ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback();
        if (enterTransitionCallback != null) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            int size = arrayMap == null ? 0 : arrayMap.getSize();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList2.add(arrayMap.keyAt(i10));
                arrayList.add(arrayMap.valueAt(i10));
            }
            if (z11) {
                enterTransitionCallback.onSharedElementStart(arrayList2, arrayList, null);
            } else {
                enterTransitionCallback.onSharedElementEnd(arrayList2, arrayList, null);
            }
        }
    }

    public static void b(ArrayList<View> arrayList, int i10) {
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            arrayList.get(size).setVisibility(i10);
        }
    }
}
