package oe;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: FadeTabIndicatorInterpolator.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends com.google.android.material.tabs.a {
    @Override // com.google.android.material.tabs.a
    public final void b(TabLayout tabLayout, View view, View view2, float f6, @NonNull Drawable drawable) {
        if (f6 >= 0.5f) {
            view = view2;
        }
        RectF rectFA = com.google.android.material.tabs.a.a(tabLayout, view);
        float fLerp = f6 < 0.5f ? AnimationUtils.lerp(1.0f, 0.0f, 0.0f, 0.5f, f6) : AnimationUtils.lerp(0.0f, 1.0f, 0.5f, 1.0f, f6);
        drawable.setBounds((int) rectFA.left, drawable.getBounds().top, (int) rectFA.right, drawable.getBounds().bottom);
        drawable.setAlpha((int) (fLerp * 255.0f));
    }
}
