package com.google.android.material.shape;

import android.graphics.Outline;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: compiled from: ShapeableDelegateV22.java */
/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(22)
public final class c extends ShapeableDelegate {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f45339f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f45340g = 0.0f;

    /* JADX INFO: compiled from: ShapeableDelegateV22.java */
    public class a extends ViewOutlineProvider {
        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            c cVar = c.this;
            if (cVar.f45331c == null || cVar.f45332d.isEmpty()) {
                return;
            }
            RectF rectF = cVar.f45332d;
            outline.setRoundRect((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom, cVar.f45340g);
        }
    }

    public c(@NonNull View view) {
        d(view);
    }

    @DoNotInline
    private void d(View view) {
        view.setOutlineProvider(new a());
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public final void a(@NonNull View view) {
        boolean z10;
        ShapeAppearanceModel shapeAppearanceModel;
        ShapeAppearanceModel shapeAppearanceModel2;
        RectF rectF;
        ShapeAppearanceModel shapeAppearanceModel3 = this.f45331c;
        this.f45340g = (shapeAppearanceModel3 == null || (rectF = this.f45332d) == null) ? 0.0f : shapeAppearanceModel3.f45275f.getCornerSize(rectF);
        if (this.f45332d.isEmpty() || (shapeAppearanceModel2 = this.f45331c) == null || !shapeAppearanceModel2.isRoundRect(this.f45332d)) {
            if (!this.f45332d.isEmpty() && (shapeAppearanceModel = this.f45331c) != null && this.f45330b && !shapeAppearanceModel.isRoundRect(this.f45332d)) {
                ShapeAppearanceModel shapeAppearanceModel4 = this.f45331c;
                if ((shapeAppearanceModel4.getTopLeftCorner() instanceof RoundedCornerTreatment) && (shapeAppearanceModel4.getTopRightCorner() instanceof RoundedCornerTreatment) && (shapeAppearanceModel4.getBottomLeftCorner() instanceof RoundedCornerTreatment) && (shapeAppearanceModel4.getBottomRightCorner() instanceof RoundedCornerTreatment)) {
                    float cornerSize = this.f45331c.getTopLeftCornerSize().getCornerSize(this.f45332d);
                    float cornerSize2 = this.f45331c.getTopRightCornerSize().getCornerSize(this.f45332d);
                    float cornerSize3 = this.f45331c.getBottomLeftCornerSize().getCornerSize(this.f45332d);
                    float cornerSize4 = this.f45331c.getBottomRightCornerSize().getCornerSize(this.f45332d);
                    if (cornerSize == 0.0f && cornerSize3 == 0.0f && cornerSize2 == cornerSize4) {
                        RectF rectF2 = this.f45332d;
                        rectF2.set(rectF2.left - cornerSize2, rectF2.top, rectF2.right, rectF2.bottom);
                        this.f45340g = cornerSize2;
                    } else if (cornerSize == 0.0f && cornerSize2 == 0.0f && cornerSize3 == cornerSize4) {
                        RectF rectF3 = this.f45332d;
                        rectF3.set(rectF3.left, rectF3.top - cornerSize3, rectF3.right, rectF3.bottom);
                        this.f45340g = cornerSize3;
                    } else if (cornerSize2 == 0.0f && cornerSize4 == 0.0f && cornerSize == cornerSize3) {
                        RectF rectF4 = this.f45332d;
                        rectF4.set(rectF4.left, rectF4.top, rectF4.right + cornerSize, rectF4.bottom);
                        this.f45340g = cornerSize;
                    } else if (cornerSize3 == 0.0f && cornerSize4 == 0.0f && cornerSize == cornerSize2) {
                        RectF rectF5 = this.f45332d;
                        rectF5.set(rectF5.left, rectF5.top, rectF5.right, rectF5.bottom + cornerSize);
                        this.f45340g = cornerSize;
                    }
                    z10 = true;
                }
            }
            z10 = false;
        } else {
            z10 = true;
        }
        this.f45339f = z10;
        view.setClipToOutline(!b());
        if (b()) {
            view.invalidate();
        } else {
            view.invalidateOutline();
        }
    }

    @Override // com.google.android.material.shape.ShapeableDelegate
    public final boolean b() {
        return !this.f45339f || this.f45329a;
    }
}
