package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: classes2.dex */
public class PagerTabStrip extends PagerTitleStrip {
    public int K0;
    public final int L0;
    public final int M0;
    public final int N0;
    public final int O0;
    public final int P0;
    public final Paint Q0;
    public final Rect R0;
    public int S0;
    public boolean T0;
    public boolean U0;
    public final int V0;
    public boolean W0;
    public float X0;
    public float Y0;
    public final int Z0;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f23873p0;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f23873p0;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(@NonNull Context context) {
        this(context, null);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public final void c(int i10, float f6, boolean z10) {
        int height = getHeight();
        TextView textView = this.f23875r0;
        int left = textView.getLeft();
        int i11 = this.P0;
        int right = textView.getRight() + i11;
        int i12 = height - this.L0;
        Rect rect = this.R0;
        rect.set(left - i11, i12, right, height);
        super.c(i10, f6, z10);
        this.S0 = (int) (Math.abs(f6 - 0.5f) * 2.0f * 255.0f);
        rect.union(textView.getLeft() - i11, i12, textView.getRight() + i11, height);
        invalidate(rect);
    }

    public boolean getDrawFullUnderline() {
        return this.T0;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public int getMinHeight() {
        return Math.max(super.getMinHeight(), this.O0);
    }

    @ColorInt
    public int getTabIndicatorColor() {
        return this.K0;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        TextView textView = this.f23875r0;
        int left = textView.getLeft();
        int i10 = this.P0;
        int i11 = left - i10;
        int right = textView.getRight() + i10;
        int i12 = height - this.L0;
        Paint paint = this.Q0;
        paint.setColor((this.S0 << 24) | (this.K0 & ViewCompat.MEASURED_SIZE_MASK));
        float f6 = right;
        float f10 = height;
        canvas.drawRect(i11, i12, f6, f10, paint);
        if (this.T0) {
            paint.setColor((this.K0 & ViewCompat.MEASURED_SIZE_MASK) | ViewCompat.MEASURED_STATE_MASK);
            canvas.drawRect(getPaddingLeft(), height - this.V0, getWidth() - getPaddingRight(), f10, paint);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.W0) {
            return false;
        }
        float x4 = motionEvent.getX();
        float y7 = motionEvent.getY();
        if (action == 0) {
            this.X0 = x4;
            this.Y0 = y7;
            this.W0 = false;
        } else if (action == 1) {
            TextView textView = this.f23875r0;
            int left = textView.getLeft();
            int i10 = this.P0;
            if (x4 < left - i10) {
                ViewPager viewPager = this.f23873p0;
                viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
            } else if (x4 > textView.getRight() + i10) {
                ViewPager viewPager2 = this.f23873p0;
                viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
            }
        } else if (action == 2) {
            float fAbs = Math.abs(x4 - this.X0);
            int i11 = this.Z0;
            if (fAbs > i11 || Math.abs(y7 - this.Y0) > i11) {
                this.W0 = true;
            }
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i10) {
        super.setBackgroundColor(i10);
        if (this.U0) {
            return;
        }
        this.T0 = (i10 & ViewCompat.MEASURED_STATE_MASK) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.U0) {
            return;
        }
        this.T0 = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i10) {
        super.setBackgroundResource(i10);
        if (this.U0) {
            return;
        }
        this.T0 = i10 == 0;
    }

    public void setDrawFullUnderline(boolean z10) {
        this.T0 = z10;
        this.U0 = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        int i14 = this.M0;
        if (i13 < i14) {
            i13 = i14;
        }
        super.setPadding(i10, i11, i12, i13);
    }

    public void setTabIndicatorColor(@ColorInt int i10) {
        this.K0 = i10;
        this.Q0.setColor(i10);
        invalidate();
    }

    public void setTabIndicatorColorResource(@ColorRes int i10) {
        setTabIndicatorColor(ContextCompat.getColor(getContext(), i10));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i10) {
        int i11 = this.N0;
        if (i10 < i11) {
            i10 = i11;
        }
        super.setTextSpacing(i10);
    }

    public PagerTabStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.Q0 = paint;
        this.R0 = new Rect();
        this.S0 = 255;
        this.T0 = false;
        this.U0 = false;
        int i10 = this.H0;
        this.K0 = i10;
        paint.setColor(i10);
        float f6 = context.getResources().getDisplayMetrics().density;
        this.L0 = (int) ((3.0f * f6) + 0.5f);
        this.M0 = (int) ((6.0f * f6) + 0.5f);
        this.N0 = (int) (64.0f * f6);
        this.P0 = (int) ((16.0f * f6) + 0.5f);
        this.V0 = (int) ((1.0f * f6) + 0.5f);
        this.O0 = (int) ((f6 * 32.0f) + 0.5f);
        this.Z0 = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f23874q0.setFocusable(true);
        this.f23874q0.setOnClickListener(new a());
        this.f23876s0.setFocusable(true);
        this.f23876s0.setOnClickListener(new b());
        if (getBackground() == null) {
            this.T0 = true;
        }
    }
}
