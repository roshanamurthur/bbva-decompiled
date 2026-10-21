package fe;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: CarouselOrientationHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f68412b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(CarouselLayoutManager carouselLayoutManager) {
        super(0);
        this.f68412b = carouselLayoutManager;
    }

    @Override // fe.f
    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f6 = rectF2.left;
        float f10 = rectF3.left;
        if (f6 < f10 && rectF2.right > f10) {
            float f11 = f10 - f6;
            rectF.left += f11;
            rectF2.left += f11;
        }
        float f12 = rectF2.right;
        float f13 = rectF3.right;
        if (f12 <= f13 || rectF2.left >= f13) {
            return;
        }
        float f14 = f12 - f13;
        rectF.right = Math.max(rectF.right - f14, rectF.left);
        rectF2.right = Math.max(rectF2.right - f14, rectF2.left);
    }

    @Override // fe.f
    public final float b(RecyclerView.LayoutParams layoutParams) {
        return ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
    }

    @Override // fe.f
    public final RectF c(float f6, float f10, float f11, float f12) {
        return new RectF(f12, 0.0f, f10 - f12, f6);
    }

    @Override // fe.f
    public final int d() {
        CarouselLayoutManager carouselLayoutManager = this.f68412b;
        return carouselLayoutManager.getHeight() - carouselLayoutManager.getPaddingBottom();
    }

    @Override // fe.f
    public final int e() {
        CarouselLayoutManager carouselLayoutManager = this.f68412b;
        if (carouselLayoutManager.A()) {
            return 0;
        }
        return carouselLayoutManager.getWidth();
    }

    @Override // fe.f
    public final int f() {
        return 0;
    }

    @Override // fe.f
    public final int g() {
        return this.f68412b.getWidth();
    }

    @Override // fe.f
    public final int h() {
        CarouselLayoutManager carouselLayoutManager = this.f68412b;
        if (carouselLayoutManager.A()) {
            return carouselLayoutManager.getWidth();
        }
        return 0;
    }

    @Override // fe.f
    public final int i() {
        return this.f68412b.getPaddingTop();
    }

    @Override // fe.f
    public final void j(View view, int i10, int i11) {
        CarouselLayoutManager carouselLayoutManager = this.f68412b;
        int paddingTop = carouselLayoutManager.getPaddingTop();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f68412b.layoutDecoratedWithMargins(view, i10, paddingTop, i11, carouselLayoutManager.getDecoratedMeasuredHeight(view) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin + paddingTop);
    }

    @Override // fe.f
    public final void k(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.right <= rectF3.left) {
            float fFloor = ((float) Math.floor(rectF.right)) - 1.0f;
            rectF.right = fFloor;
            rectF.left = Math.min(rectF.left, fFloor);
        }
        if (rectF2.left >= rectF3.right) {
            float fCeil = ((float) Math.ceil(rectF.left)) + 1.0f;
            rectF.left = fCeil;
            rectF.right = Math.max(fCeil, rectF.right);
        }
    }

    @Override // fe.f
    public final void l(float f6, float f10, Rect rect, View view) {
        view.offsetLeftAndRight((int) (f10 - (rect.left + f6)));
    }
}
