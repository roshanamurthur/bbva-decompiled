package oe;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.tabs.TabLayout;

/* JADX INFO: compiled from: ElasticTabIndicatorInterpolator.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a extends com.google.android.material.tabs.a {
    @Override // com.google.android.material.tabs.a
    public final void b(TabLayout tabLayout, View view, View view2, float f6, @NonNull Drawable drawable) {
        float fCos;
        float fCos2;
        RectF rectFA = com.google.android.material.tabs.a.a(tabLayout, view);
        RectF rectFA2 = com.google.android.material.tabs.a.a(tabLayout, view2);
        if (rectFA.left < rectFA2.left) {
            double d2 = (((double) f6) * 3.141592653589793d) / 2.0d;
            fCos2 = (float) (1.0d - Math.cos(d2));
            fCos = (float) Math.sin(d2);
        } else {
            double d3 = (((double) f6) * 3.141592653589793d) / 2.0d;
            float fSin = (float) Math.sin(d3);
            fCos = (float) (1.0d - Math.cos(d3));
            fCos2 = fSin;
        }
        drawable.setBounds(AnimationUtils.lerp((int) rectFA.left, (int) rectFA2.left, fCos2), drawable.getBounds().top, AnimationUtils.lerp((int) rectFA.right, (int) rectFA2.right, fCos), drawable.getBounds().bottom);
    }
}
