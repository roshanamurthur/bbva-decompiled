package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.R;

/* JADX INFO: compiled from: ItemTouchUIUtilImpl.java */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements ItemTouchUIUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f23045a = new m();

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public final void clearView(@NonNull View view) {
        int i10 = R.id.item_touch_helper_previous_elevation;
        Object tag = view.getTag(i10);
        if (tag instanceof Float) {
            ViewCompat.setElevation(view, ((Float) tag).floatValue());
        }
        view.setTag(i10, null);
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public final void onDraw(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull View view, float f6, float f10, int i10, boolean z10) {
        if (z10 && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
            Float fValueOf = Float.valueOf(ViewCompat.getElevation(view));
            int childCount = recyclerView.getChildCount();
            float f11 = 0.0f;
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = recyclerView.getChildAt(i11);
                if (childAt != view) {
                    float elevation = ViewCompat.getElevation(childAt);
                    if (elevation > f11) {
                        f11 = elevation;
                    }
                }
            }
            ViewCompat.setElevation(view, f11 + 1.0f);
            view.setTag(R.id.item_touch_helper_previous_elevation, fValueOf);
        }
        view.setTranslationX(f6);
        view.setTranslationY(f10);
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public final void onSelected(@NonNull View view) {
    }

    @Override // androidx.recyclerview.widget.ItemTouchUIUtil
    public final void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull View view, float f6, float f10, int i10, boolean z10) {
    }
}
