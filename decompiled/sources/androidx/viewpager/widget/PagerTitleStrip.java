package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.method.SingleLineTransformationMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
@ViewPager.DecorView
public class PagerTitleStrip extends ViewGroup {
    public static final int[] I0 = {R.attr.textAppearance, R.attr.textSize, R.attr.textColor, R.attr.gravity};
    public static final int[] J0 = {R.attr.textAllCaps};
    public final a E0;
    public WeakReference<PagerAdapter> F0;
    public int G0;
    public int H0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public ViewPager f23873p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TextView f23874q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final TextView f23875r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final TextView f23876s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f23877t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f23878u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f23879w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f23880x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f23881y0;

    public class a extends DataSetObserver implements ViewPager.OnPageChangeListener, ViewPager.OnAdapterChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23882a;

        public a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OnAdapterChangeListener
        public final void onAdapterChanged(ViewPager viewPager, PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
            PagerTitleStrip.this.a(pagerAdapter, pagerAdapter2);
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
            pagerTitleStrip.b(pagerTitleStrip.f23873p0.getCurrentItem(), pagerTitleStrip.f23873p0.getAdapter());
            float f6 = pagerTitleStrip.f23878u0;
            if (f6 < 0.0f) {
                f6 = 0.0f;
            }
            pagerTitleStrip.c(pagerTitleStrip.f23873p0.getCurrentItem(), f6, true);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrollStateChanged(int i10) {
            this.f23882a = i10;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageScrolled(int i10, float f6, int i11) {
            if (f6 > 0.5f) {
                i10++;
            }
            PagerTitleStrip.this.c(i10, f6, false);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public final void onPageSelected(int i10) {
            if (this.f23882a == 0) {
                PagerTitleStrip pagerTitleStrip = PagerTitleStrip.this;
                pagerTitleStrip.b(pagerTitleStrip.f23873p0.getCurrentItem(), pagerTitleStrip.f23873p0.getAdapter());
                float f6 = pagerTitleStrip.f23878u0;
                if (f6 < 0.0f) {
                    f6 = 0.0f;
                }
                pagerTitleStrip.c(pagerTitleStrip.f23873p0.getCurrentItem(), f6, true);
            }
        }
    }

    public static class b extends SingleLineTransformationMethod {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Locale f23884a;

        @Override // android.text.method.ReplacementTransformationMethod, android.text.method.TransformationMethod
        public final CharSequence getTransformation(CharSequence charSequence, View view) {
            CharSequence transformation = super.getTransformation(charSequence, view);
            if (transformation != null) {
                return transformation.toString().toUpperCase(this.f23884a);
            }
            return null;
        }
    }

    public PagerTitleStrip(@NonNull Context context) {
        this(context, null);
    }

    private static void setSingleLineAllCaps(TextView textView) {
        Context context = textView.getContext();
        b bVar = new b();
        bVar.f23884a = context.getResources().getConfiguration().locale;
        textView.setTransformationMethod(bVar);
    }

    public final void a(PagerAdapter pagerAdapter, PagerAdapter pagerAdapter2) {
        a aVar = this.E0;
        if (pagerAdapter != null) {
            pagerAdapter.unregisterDataSetObserver(aVar);
            this.F0 = null;
        }
        if (pagerAdapter2 != null) {
            pagerAdapter2.registerDataSetObserver(aVar);
            this.F0 = new WeakReference<>(pagerAdapter2);
        }
        ViewPager viewPager = this.f23873p0;
        if (viewPager != null) {
            this.f23877t0 = -1;
            this.f23878u0 = -1.0f;
            b(viewPager.getCurrentItem(), pagerAdapter2);
            requestLayout();
        }
    }

    public final void b(int i10, PagerAdapter pagerAdapter) {
        int count = pagerAdapter != null ? pagerAdapter.getCount() : 0;
        this.f23880x0 = true;
        CharSequence pageTitle = null;
        CharSequence pageTitle2 = (i10 < 1 || pagerAdapter == null) ? null : pagerAdapter.getPageTitle(i10 - 1);
        TextView textView = this.f23874q0;
        textView.setText(pageTitle2);
        TextView textView2 = this.f23875r0;
        textView2.setText((pagerAdapter == null || i10 >= count) ? null : pagerAdapter.getPageTitle(i10));
        int i11 = i10 + 1;
        if (i11 < count && pagerAdapter != null) {
            pageTitle = pagerAdapter.getPageTitle(i11);
        }
        TextView textView3 = this.f23876s0;
        textView3.setText(pageTitle);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(0, (int) (((getWidth() - getPaddingLeft()) - getPaddingRight()) * 0.8f)), Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(Math.max(0, (getHeight() - getPaddingTop()) - getPaddingBottom()), Integer.MIN_VALUE);
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView2.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        textView3.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.f23877t0 = i10;
        if (!this.f23881y0) {
            c(i10, this.f23878u0, false);
        }
        this.f23880x0 = false;
    }

    public void c(int i10, float f6, boolean z10) {
        int i11;
        int i12;
        int i13;
        int i14;
        if (i10 != this.f23877t0) {
            b(i10, this.f23873p0.getAdapter());
        } else if (!z10 && f6 == this.f23878u0) {
            return;
        }
        this.f23881y0 = true;
        TextView textView = this.f23874q0;
        int measuredWidth = textView.getMeasuredWidth();
        TextView textView2 = this.f23875r0;
        int measuredWidth2 = textView2.getMeasuredWidth();
        TextView textView3 = this.f23876s0;
        int measuredWidth3 = textView3.getMeasuredWidth();
        int i15 = measuredWidth2 / 2;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i16 = paddingRight + i15;
        int i17 = (width - (paddingLeft + i15)) - i16;
        float f10 = f6 + 0.5f;
        if (f10 > 1.0f) {
            f10 -= 1.0f;
        }
        int i18 = ((width - i16) - ((int) (i17 * f10))) - i15;
        int i19 = measuredWidth2 + i18;
        int baseline = textView.getBaseline();
        int baseline2 = textView2.getBaseline();
        int baseline3 = textView3.getBaseline();
        int iMax = Math.max(Math.max(baseline, baseline2), baseline3);
        int i20 = iMax - baseline;
        int i21 = iMax - baseline2;
        int i22 = iMax - baseline3;
        int iMax2 = Math.max(Math.max(textView.getMeasuredHeight() + i20, textView2.getMeasuredHeight() + i21), textView3.getMeasuredHeight() + i22);
        int i23 = this.f23879w0 & 112;
        if (i23 != 16) {
            if (i23 != 80) {
                i12 = i20 + paddingTop;
                i13 = i21 + paddingTop;
                i14 = paddingTop + i22;
            } else {
                i11 = (height - paddingBottom) - iMax2;
            }
            textView2.layout(i18, i13, i19, textView2.getMeasuredHeight() + i13);
            int iMin = Math.min(paddingLeft, (i18 - this.v0) - measuredWidth);
            textView.layout(iMin, i12, measuredWidth + iMin, textView.getMeasuredHeight() + i12);
            int iMax3 = Math.max((width - paddingRight) - measuredWidth3, i19 + this.v0);
            textView3.layout(iMax3, i14, iMax3 + measuredWidth3, textView3.getMeasuredHeight() + i14);
            this.f23878u0 = f6;
            this.f23881y0 = false;
        }
        i11 = (((height - paddingTop) - paddingBottom) - iMax2) / 2;
        i12 = i20 + i11;
        i13 = i21 + i11;
        i14 = i11 + i22;
        textView2.layout(i18, i13, i19, textView2.getMeasuredHeight() + i13);
        int iMin2 = Math.min(paddingLeft, (i18 - this.v0) - measuredWidth);
        textView.layout(iMin2, i12, measuredWidth + iMin2, textView.getMeasuredHeight() + i12);
        int iMax4 = Math.max((width - paddingRight) - measuredWidth3, i19 + this.v0);
        textView3.layout(iMax4, i14, iMax4 + measuredWidth3, textView3.getMeasuredHeight() + i14);
        this.f23878u0 = f6;
        this.f23881y0 = false;
    }

    public int getMinHeight() {
        Drawable background = getBackground();
        if (background != null) {
            return background.getIntrinsicHeight();
        }
        return 0;
    }

    public int getTextSpacing() {
        return this.v0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (!(parent instanceof ViewPager)) {
            throw new IllegalStateException("PagerTitleStrip must be a direct child of a ViewPager.");
        }
        ViewPager viewPager = (ViewPager) parent;
        PagerAdapter adapter = viewPager.getAdapter();
        a aVar = this.E0;
        viewPager.f23904p1 = aVar;
        viewPager.addOnAdapterChangeListener(aVar);
        this.f23873p0 = viewPager;
        WeakReference<PagerAdapter> weakReference = this.F0;
        a(weakReference != null ? weakReference.get() : null, adapter);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ViewPager viewPager = this.f23873p0;
        if (viewPager != null) {
            a(viewPager.getAdapter(), null);
            ViewPager viewPager2 = this.f23873p0;
            ViewPager.OnPageChangeListener onPageChangeListener = viewPager2.f23904p1;
            viewPager2.f23904p1 = null;
            viewPager2.removeOnAdapterChangeListener(this.E0);
            this.f23873p0 = null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f23873p0 != null) {
            float f6 = this.f23878u0;
            if (f6 < 0.0f) {
                f6 = 0.0f;
            }
            c(this.f23877t0, f6, true);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        int iMax;
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException("Must measure with an exact width");
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, paddingBottom, -2);
        int size = View.MeasureSpec.getSize(i10);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, (int) (size * 0.2f), -2);
        this.f23874q0.measure(childMeasureSpec2, childMeasureSpec);
        TextView textView = this.f23875r0;
        textView.measure(childMeasureSpec2, childMeasureSpec);
        this.f23876s0.measure(childMeasureSpec2, childMeasureSpec);
        if (View.MeasureSpec.getMode(i11) == 1073741824) {
            iMax = View.MeasureSpec.getSize(i11);
        } else {
            iMax = Math.max(getMinHeight(), textView.getMeasuredHeight() + paddingBottom);
        }
        setMeasuredDimension(size, View.resolveSizeAndState(iMax, i11, textView.getMeasuredState() << 16));
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f23880x0) {
            return;
        }
        super.requestLayout();
    }

    public void setGravity(int i10) {
        this.f23879w0 = i10;
        requestLayout();
    }

    public void setNonPrimaryAlpha(@FloatRange(from = 0.0d, to = 1.0d) float f6) {
        int i10 = ((int) (f6 * 255.0f)) & 255;
        this.G0 = i10;
        int i11 = (i10 << 24) | (this.H0 & ViewCompat.MEASURED_SIZE_MASK);
        this.f23874q0.setTextColor(i11);
        this.f23876s0.setTextColor(i11);
    }

    public void setTextColor(@ColorInt int i10) {
        this.H0 = i10;
        this.f23875r0.setTextColor(i10);
        int i11 = (this.G0 << 24) | (this.H0 & ViewCompat.MEASURED_SIZE_MASK);
        this.f23874q0.setTextColor(i11);
        this.f23876s0.setTextColor(i11);
    }

    public void setTextSize(int i10, float f6) {
        this.f23874q0.setTextSize(i10, f6);
        this.f23875r0.setTextSize(i10, f6);
        this.f23876s0.setTextSize(i10, f6);
    }

    public void setTextSpacing(int i10) {
        this.v0 = i10;
        requestLayout();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x00a6  */
    public PagerTitleStrip(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23877t0 = -1;
        this.f23878u0 = -1.0f;
        this.E0 = new a();
        TextView textView = new TextView(context);
        this.f23874q0 = textView;
        addView(textView);
        TextView textView2 = new TextView(context);
        this.f23875r0 = textView2;
        addView(textView2);
        TextView textView3 = new TextView(context);
        this.f23876s0 = textView3;
        addView(textView3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, I0);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            TextViewCompat.setTextAppearance(textView, resourceId);
            TextViewCompat.setTextAppearance(textView2, resourceId);
            TextViewCompat.setTextAppearance(textView3, resourceId);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        if (dimensionPixelSize != 0) {
            setTextSize(0, dimensionPixelSize);
        }
        if (typedArrayObtainStyledAttributes.hasValue(2)) {
            int color = typedArrayObtainStyledAttributes.getColor(2, 0);
            textView.setTextColor(color);
            textView2.setTextColor(color);
            textView3.setTextColor(color);
        }
        this.f23879w0 = typedArrayObtainStyledAttributes.getInteger(3, 80);
        typedArrayObtainStyledAttributes.recycle();
        this.H0 = textView2.getTextColors().getDefaultColor();
        setNonPrimaryAlpha(0.6f);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        textView2.setEllipsize(truncateAt);
        textView3.setEllipsize(truncateAt);
        if (resourceId != 0) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, J0);
            boolean z10 = typedArrayObtainStyledAttributes2.getBoolean(0, false);
            typedArrayObtainStyledAttributes2.recycle();
            if (z10) {
                setSingleLineAllCaps(textView);
                setSingleLineAllCaps(textView2);
                setSingleLineAllCaps(textView3);
            } else {
                textView.setSingleLine();
                textView2.setSingleLine();
                textView3.setSingleLine();
            }
        } else {
            textView.setSingleLine();
            textView2.setSingleLine();
            textView3.setSingleLine();
        }
        this.v0 = (int) (context.getResources().getDisplayMetrics().density * 16.0f);
    }
}
