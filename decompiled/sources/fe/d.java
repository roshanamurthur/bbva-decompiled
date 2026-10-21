package fe;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;

/* JADX INFO: compiled from: CarouselOrientationHelper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d extends f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f68411b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(CarouselLayoutManager carouselLayoutManager) {
        super(1);
        this.f68411b = carouselLayoutManager;
    }

    @Override // fe.f
    public final void a(RectF rectF, RectF rectF2, RectF rectF3) {
        float f6 = rectF2.top;
        float f10 = rectF3.top;
        if (f6 < f10 && rectF2.bottom > f10) {
            float f11 = f10 - f6;
            rectF.top += f11;
            rectF3.top += f11;
        }
        float f12 = rectF2.bottom;
        float f13 = rectF3.bottom;
        if (f12 <= f13 || rectF2.top >= f13) {
            return;
        }
        float f14 = f12 - f13;
        rectF.bottom = Math.max(rectF.bottom - f14, rectF.top);
        rectF2.bottom = Math.max(rectF2.bottom - f14, rectF2.top);
    }

    @Override // fe.f
    public final float b(RecyclerView.LayoutParams layoutParams) {
        return ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
    }

    @Override // fe.f
    public final RectF c(float f6, float f10, float f11, float f12) {
        return new RectF(0.0f, f11, f10, f6 - f11);
    }

    @Override // fe.f
    public final int d() {
        return this.f68411b.getHeight();
    }

    @Override // fe.f
    public final int e() {
        return this.f68411b.getHeight();
    }

    @Override // fe.f
    public final int f() {
        return this.f68411b.getPaddingLeft();
    }

    @Override // fe.f
    public final int g() {
        CarouselLayoutManager carouselLayoutManager = this.f68411b;
        return carouselLayoutManager.getWidth() - carouselLayoutManager.getPaddingRight();
    }

    @Override // fe.f
    public final int h() {
        return 0;
    }

    @Override // fe.f
    public final int i() {
        return 0;
    }

    @Override // fe.f
    public final void j(View view, int i10, int i11) {
        CarouselLayoutManager carouselLayoutManager = this.f68411b;
        int paddingLeft = carouselLayoutManager.getPaddingLeft();
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        this.f68411b.layoutDecoratedWithMargins(view, paddingLeft, i10, carouselLayoutManager.getDecoratedMeasuredWidth(view) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin + paddingLeft, i11);
    }

    @Override // fe.f
    public final void k(RectF rectF, RectF rectF2, RectF rectF3) {
        if (rectF2.bottom <= rectF3.top) {
            float fFloor = ((float) Math.floor(rectF.bottom)) - 1.0f;
            rectF.bottom = fFloor;
            rectF.top = Math.min(rectF.top, fFloor);
        }
        if (rectF2.top >= rectF3.bottom) {
            float fCeil = ((float) Math.ceil(rectF.top)) + 1.0f;
            rectF.top = fCeil;
            rectF.bottom = Math.max(fCeil, rectF.bottom);
        }
    }

    @Override // fe.f
    public final void l(float f6, float f10, Rect rect, View view) {
        view.offsetTopAndBottom((int) (f10 - (rect.top + f6)));
    }
}
