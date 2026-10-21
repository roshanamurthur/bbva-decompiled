package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.LinearLayout;
import androidx.annotation.GravityInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.view.GravityCompat;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.ViewCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashSet;
import java.util.Set;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    public static final int HORIZONTAL = 0;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    public Drawable E0;
    public int F0;
    public int G0;
    public int H0;
    public int I0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public boolean f1308p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f1309q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f1310r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f1311s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f1312t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f1313u0;
    public float v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f1314w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public int[] f1315x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public int[] f1316y0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface DividerMode {
    }

    @RequiresApi(29)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1317a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f1318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f1319c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f1320d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f1321e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f1322f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f1323g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f1324h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f1325i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f1326j;

        /* JADX INFO: compiled from: LinearLayoutCompat$InspectionCompanion.java */
        public class a implements IntFunction<String> {
            @Override // java.util.function.IntFunction
            public final String apply(int i10) {
                if (i10 != 0) {
                    return i10 != 1 ? String.valueOf(i10) : "vertical";
                }
                return "horizontal";
            }
        }

        /* JADX INFO: compiled from: LinearLayoutCompat$InspectionCompanion.java */
        public class b implements IntFunction<Set<String>> {
            @Override // java.util.function.IntFunction
            public final Set<String> apply(int i10) {
                HashSet hashSet = new HashSet();
                if (i10 == 0) {
                    hashSet.add("none");
                }
                if (i10 == 1) {
                    hashSet.add("beginning");
                }
                if (i10 == 2) {
                    hashSet.add("middle");
                }
                if (i10 == 4) {
                    hashSet.add("end");
                }
                return hashSet;
            }
        }

        public void mapProperties(@NonNull PropertyMapper propertyMapper) {
            this.f1318b = propertyMapper.mapBoolean("baselineAligned", R.attr.baselineAligned);
            this.f1319c = propertyMapper.mapInt("baselineAlignedChildIndex", R.attr.baselineAlignedChildIndex);
            this.f1320d = propertyMapper.mapGravity("gravity", R.attr.gravity);
            this.f1321e = propertyMapper.mapIntEnum("orientation", R.attr.orientation, new a());
            this.f1322f = propertyMapper.mapFloat("weightSum", R.attr.weightSum);
            this.f1323g = propertyMapper.mapObject("divider", androidx.appcompat.R.attr.divider);
            this.f1324h = propertyMapper.mapInt("dividerPadding", androidx.appcompat.R.attr.dividerPadding);
            this.f1325i = propertyMapper.mapBoolean("measureWithLargestChild", androidx.appcompat.R.attr.measureWithLargestChild);
            this.f1326j = propertyMapper.mapIntFlag("showDividers", androidx.appcompat.R.attr.showDividers, new b());
            this.f1317a = true;
        }

        public void readProperties(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull PropertyReader propertyReader) {
            if (!this.f1317a) {
                throw j.c();
            }
            propertyReader.readBoolean(this.f1318b, linearLayoutCompat.isBaselineAligned());
            propertyReader.readInt(this.f1319c, linearLayoutCompat.getBaselineAlignedChildIndex());
            propertyReader.readGravity(this.f1320d, linearLayoutCompat.getGravity());
            propertyReader.readIntEnum(this.f1321e, linearLayoutCompat.getOrientation());
            propertyReader.readFloat(this.f1322f, linearLayoutCompat.getWeightSum());
            propertyReader.readObject(this.f1323g, linearLayoutCompat.getDividerDrawable());
            propertyReader.readInt(this.f1324h, linearLayoutCompat.getDividerPadding());
            propertyReader.readBoolean(this.f1325i, linearLayoutCompat.isMeasureWithLargestChildEnabled());
            propertyReader.readIntFlag(this.f1326j, linearLayoutCompat.getShowDividers());
        }
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i10, int i11) {
            super(i10, i11);
        }

        public LayoutParams(int i10, int i11, float f6) {
            super(i10, i11, f6);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public @interface OrientationMode {
    }

    public LinearLayoutCompat(@NonNull Context context) {
        this(context, null);
    }

    public final void a(Canvas canvas, int i10) {
        this.E0.setBounds(getPaddingLeft() + this.I0, i10, (getWidth() - getPaddingRight()) - this.I0, this.G0 + i10);
        this.E0.draw(canvas);
    }

    public final void b(Canvas canvas, int i10) {
        this.E0.setBounds(i10, getPaddingTop() + this.I0, this.F0 + i10, (getHeight() - getPaddingBottom()) - this.I0);
        this.E0.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f1309q0 < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f1309q0;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f1309q0 == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int iA = this.f1310r0;
        if (this.f1311s0 == 1 && (i10 = this.f1312t0 & 112) != 48) {
            if (i10 == 16) {
                iA = a.a(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.f1313u0, 2, iA);
            } else if (i10 == 80) {
                iA = ((getBottom() - getTop()) - getPaddingBottom()) - this.f1313u0;
            }
        }
        return iA + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f1309q0;
    }

    public Drawable getDividerDrawable() {
        return this.E0;
    }

    public int getDividerPadding() {
        return this.I0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int getDividerWidth() {
        return this.F0;
    }

    @GravityInt
    public int getGravity() {
        return this.f1312t0;
    }

    public int getOrientation() {
        return this.f1311s0;
    }

    public int getShowDividers() {
        return this.H0;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.v0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public boolean hasDividerBeforeChildAt(int i10) {
        if (i10 == 0) {
            return (this.H0 & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.H0 & 4) != 0;
        }
        if ((this.H0 & 2) == 0) {
            return false;
        }
        for (int i11 = i10 - 1; i11 >= 0; i11--) {
            if (getChildAt(i11).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.f1308p0;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.f1314w0;
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        int right;
        int left;
        int i10;
        int bottom;
        if (this.E0 == null) {
            return;
        }
        int i11 = 0;
        if (this.f1311s0 == 1) {
            int virtualChildCount = getVirtualChildCount();
            while (i11 < virtualChildCount) {
                View childAt = getChildAt(i11);
                if (childAt != null && childAt.getVisibility() != 8 && hasDividerBeforeChildAt(i11)) {
                    a(canvas, (childAt.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin) - this.G0);
                }
                i11++;
            }
            if (hasDividerBeforeChildAt(virtualChildCount)) {
                View childAt2 = getChildAt(virtualChildCount - 1);
                if (childAt2 == null) {
                    bottom = (getHeight() - getPaddingBottom()) - this.G0;
                } else {
                    bottom = childAt2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) childAt2.getLayoutParams())).bottomMargin;
                }
                a(canvas, bottom);
                return;
            }
            return;
        }
        int virtualChildCount2 = getVirtualChildCount();
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        while (i11 < virtualChildCount2) {
            View childAt3 = getChildAt(i11);
            if (childAt3 != null && childAt3.getVisibility() != 8 && hasDividerBeforeChildAt(i11)) {
                LayoutParams layoutParams = (LayoutParams) childAt3.getLayoutParams();
                b(canvas, zIsLayoutRtl ? childAt3.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (childAt3.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.F0);
            }
            i11++;
        }
        if (hasDividerBeforeChildAt(virtualChildCount2)) {
            View childAt4 = getChildAt(virtualChildCount2 - 1);
            if (childAt4 != null) {
                LayoutParams layoutParams2 = (LayoutParams) childAt4.getLayoutParams();
                if (zIsLayoutRtl) {
                    left = childAt4.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i10 = this.F0;
                    right = left - i10;
                } else {
                    right = childAt4.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (zIsLayoutRtl) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.F0;
                right = left - i10;
            }
            b(canvas, right);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    /* JADX WARN: Code duplicated, block: B:57:0x0158  */
    /* JADX WARN: Code duplicated, block: B:60:0x0162  */
    /* JADX WARN: Code duplicated, block: B:62:0x0166  */
    /* JADX WARN: Code duplicated, block: B:64:0x016a  */
    /* JADX WARN: Code duplicated, block: B:66:0x016f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0177  */
    /* JADX WARN: Code duplicated, block: B:69:0x0185  */
    /* JADX WARN: Code duplicated, block: B:71:0x018b  */
    /* JADX WARN: Code duplicated, block: B:72:0x0194  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a9  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int iA;
        int i14;
        int i15;
        int i16;
        int i17;
        int baseline;
        int i18;
        int i19;
        int iA2;
        int iA3;
        int iA4;
        int i20 = 8;
        if (this.f1311s0 == 1) {
            int paddingLeft = getPaddingLeft();
            int i21 = i12 - i10;
            int paddingRight = i21 - getPaddingRight();
            int paddingRight2 = (i21 - paddingLeft) - getPaddingRight();
            int virtualChildCount = getVirtualChildCount();
            int i22 = this.f1312t0;
            int i23 = i22 & 112;
            int i24 = 8388615 & i22;
            if (i23 != 16) {
                iA3 = i23 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.f1313u0;
            } else {
                iA3 = a.a(i13 - i11, this.f1313u0, 2, getPaddingTop());
            }
            int i25 = 0;
            while (i25 < virtualChildCount) {
                View childAt = getChildAt(i25);
                if (childAt != null && childAt.getVisibility() != i20) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                    int i26 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i26 < 0) {
                        i26 = i24;
                    }
                    int absoluteGravity = GravityCompat.getAbsoluteGravity(i26, getLayoutDirection()) & 7;
                    if (absoluteGravity != 1) {
                        iA4 = absoluteGravity != 5 ? ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft : (paddingRight - measuredWidth) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    } else {
                        iA4 = (a.a(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) layoutParams).leftMargin) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    }
                    if (hasDividerBeforeChildAt(i25)) {
                        iA3 += this.G0;
                    }
                    int i27 = iA3 + ((LinearLayout.LayoutParams) layoutParams).topMargin;
                    childAt.layout(iA4, i27, measuredWidth + iA4, i27 + measuredHeight);
                    iA3 = measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i27;
                }
                i25++;
                i20 = 8;
            }
            return;
        }
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        int paddingTop = getPaddingTop();
        int i28 = i13 - i11;
        int paddingBottom = i28 - getPaddingBottom();
        int paddingBottom2 = (i28 - paddingTop) - getPaddingBottom();
        int virtualChildCount2 = getVirtualChildCount();
        int i29 = this.f1312t0;
        int i30 = 8388615 & i29;
        int i31 = i29 & 112;
        boolean z11 = this.f1308p0;
        int[] iArr = this.f1315x0;
        int[] iArr2 = this.f1316y0;
        int absoluteGravity2 = GravityCompat.getAbsoluteGravity(i30, getLayoutDirection());
        if (absoluteGravity2 != 1) {
            iA = absoluteGravity2 != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f1313u0;
        } else {
            iA = a.a(i12 - i10, this.f1313u0, 2, getPaddingLeft());
        }
        if (zIsLayoutRtl) {
            i14 = virtualChildCount2 - 1;
            i15 = -1;
        } else {
            i14 = 0;
            i15 = 1;
        }
        int i32 = 0;
        while (i32 < virtualChildCount2) {
            int i33 = (i15 * i32) + i14;
            View childAt2 = getChildAt(i33);
            if (childAt2 == null) {
                i16 = i14;
            } else {
                i16 = i14;
                if (childAt2.getVisibility() != 8) {
                    int measuredWidth2 = childAt2.getMeasuredWidth();
                    int measuredHeight2 = childAt2.getMeasuredHeight();
                    LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
                    if (z11) {
                        i17 = i31;
                        baseline = ((LinearLayout.LayoutParams) layoutParams2).height != -1 ? childAt2.getBaseline() : -1;
                        i18 = ((LinearLayout.LayoutParams) layoutParams2).gravity;
                        if (i18 < 0) {
                            i18 = i17;
                        }
                        i19 = i18 & 112;
                        if (i19 != 16) {
                            iA2 = (a.a(paddingBottom2, measuredHeight2, 2, paddingTop) + ((LinearLayout.LayoutParams) layoutParams2).topMargin) - ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                        } else if (i19 != 48) {
                            iA2 = ((LinearLayout.LayoutParams) layoutParams2).topMargin + paddingTop;
                            if (baseline != -1) {
                                iA2 = (iArr[1] - baseline) + iA2;
                            }
                        } else if (i19 != 80) {
                            iA2 = paddingTop;
                        } else {
                            iA2 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                            if (baseline != -1) {
                                iA2 -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                            }
                        }
                        if (hasDividerBeforeChildAt(i33)) {
                            iA += this.F0;
                        }
                        int i34 = iA + ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                        childAt2.layout(i34, iA2, i34 + measuredWidth2, measuredHeight2 + iA2);
                        iA = measuredWidth2 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + i34;
                    } else {
                        i17 = i31;
                    }
                    i18 = ((LinearLayout.LayoutParams) layoutParams2).gravity;
                    if (i18 < 0) {
                        i18 = i17;
                    }
                    i19 = i18 & 112;
                    if (i19 != 16) {
                        iA2 = (a.a(paddingBottom2, measuredHeight2, 2, paddingTop) + ((LinearLayout.LayoutParams) layoutParams2).topMargin) - ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                    } else if (i19 != 48) {
                        iA2 = ((LinearLayout.LayoutParams) layoutParams2).topMargin + paddingTop;
                        if (baseline != -1) {
                            iA2 = (iArr[1] - baseline) + iA2;
                        }
                    } else if (i19 != 80) {
                        iA2 = paddingTop;
                    } else {
                        iA2 = (paddingBottom - measuredHeight2) - ((LinearLayout.LayoutParams) layoutParams2).bottomMargin;
                        if (baseline != -1) {
                            iA2 -= iArr2[2] - (childAt2.getMeasuredHeight() - baseline);
                        }
                    }
                    if (hasDividerBeforeChildAt(i33)) {
                        iA += this.F0;
                    }
                    int i35 = iA + ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    childAt2.layout(i35, iA2, i35 + measuredWidth2, measuredHeight2 + iA2);
                    iA = measuredWidth2 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + i35;
                }
                i32++;
                i14 = i16;
                i15 = i15;
                virtualChildCount2 = virtualChildCount2;
                i31 = i17;
                z11 = z11;
            }
            i17 = i31;
            i32++;
            i14 = i16;
            i15 = i15;
            virtualChildCount2 = virtualChildCount2;
            i31 = i17;
            z11 = z11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:153:0x02f4  */
    /* JADX WARN: Code duplicated, block: B:213:0x0486  */
    /* JADX WARN: Code duplicated, block: B:214:0x048b  */
    /* JADX WARN: Code duplicated, block: B:217:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:218:0x04b8  */
    /* JADX WARN: Code duplicated, block: B:221:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:222:0x04cc  */
    /* JADX WARN: Code duplicated, block: B:224:0x04de  */
    /* JADX WARN: Code duplicated, block: B:230:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:240:0x0537  */
    /* JADX WARN: Code duplicated, block: B:246:0x0548  */
    /* JADX WARN: Code duplicated, block: B:249:0x0550 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:250:0x0552  */
    /* JADX WARN: Code duplicated, block: B:252:0x055b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:253:0x055d  */
    /* JADX WARN: Code duplicated, block: B:280:0x05e4  */
    /* JADX WARN: Code duplicated, block: B:282:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:283:0x05ef  */
    /* JADX WARN: Code duplicated, block: B:286:0x05f8  */
    /* JADX WARN: Code duplicated, block: B:288:0x0600  */
    /* JADX WARN: Code duplicated, block: B:289:0x060c  */
    /* JADX WARN: Code duplicated, block: B:313:0x0691  */
    /* JADX WARN: Code duplicated, block: B:315:0x0698  */
    /* JADX WARN: Code duplicated, block: B:318:0x06b4  */
    /* JADX WARN: Code duplicated, block: B:320:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:322:0x06c2  */
    /* JADX WARN: Code duplicated, block: B:368:0x07cb  */
    /* JADX WARN: Code duplicated, block: B:373:0x07f5  */
    /* JADX WARN: Code duplicated, block: B:381:0x0806  */
    /* JADX WARN: Code duplicated, block: B:388:0x083d  */
    /* JADX WARN: Code duplicated, block: B:391:0x0860  */
    /* JADX WARN: Code duplicated, block: B:393:0x086e  */
    /* JADX WARN: Code duplicated, block: B:395:0x087a  */
    /* JADX WARN: Code duplicated, block: B:397:0x0886  */
    /* JADX WARN: Code duplicated, block: B:398:0x089b  */
    /* JADX WARN: Code duplicated, block: B:429:0x061c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:437:0x089c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:442:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        char c10;
        int iMax;
        int i12;
        float f6;
        int i13;
        int i14;
        int i15;
        char c11;
        int i16;
        View childAt;
        int i17;
        int i18;
        int i19;
        int baseline;
        int i20;
        int iMakeMeasureSpec;
        int i21;
        View childAt2;
        LayoutParams layoutParams;
        int i22;
        View childAt3;
        LayoutParams layoutParams2;
        float f10;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        boolean z10;
        boolean z11;
        LayoutParams layoutParams3;
        int measuredWidth;
        boolean z12;
        int i29;
        boolean z13;
        int i30;
        int measuredHeight;
        boolean z14;
        int baseline2;
        int i31;
        int i32;
        boolean z15;
        int i33;
        int i34;
        boolean z16;
        LayoutParams layoutParams4;
        boolean z17;
        int i35;
        boolean z18;
        int iMax2;
        int i36 = -2;
        int i37 = 1073741824;
        int i38 = 8;
        int i39 = Integer.MIN_VALUE;
        float f11 = 0.0f;
        boolean z19 = true;
        if (this.f1311s0 == 1) {
            this.f1313u0 = 0;
            int virtualChildCount = getVirtualChildCount();
            int mode = View.MeasureSpec.getMode(i10);
            int mode2 = View.MeasureSpec.getMode(i11);
            int i40 = this.f1309q0;
            boolean z20 = this.f1314w0;
            boolean z21 = true;
            int i41 = 0;
            int iMax3 = 0;
            int iMax4 = 0;
            boolean z22 = false;
            int iMax5 = 0;
            int i42 = 0;
            int i43 = 0;
            boolean z23 = false;
            float f12 = 0.0f;
            while (i41 < virtualChildCount) {
                View childAt4 = getChildAt(i41);
                if (childAt4 == null) {
                    this.f1313u0 = this.f1313u0;
                } else {
                    if (childAt4.getVisibility() != i38) {
                        if (hasDividerBeforeChildAt(i41)) {
                            this.f1313u0 += this.G0;
                        }
                        LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                        float f13 = ((LinearLayout.LayoutParams) layoutParams5).weight;
                        f12 += f13;
                        if (mode2 == i37 && ((LinearLayout.LayoutParams) layoutParams5).height == 0 && f13 > f11) {
                            int i44 = this.f1313u0;
                            this.f1313u0 = Math.max(i44, ((LinearLayout.LayoutParams) layoutParams5).topMargin + i44 + ((LinearLayout.LayoutParams) layoutParams5).bottomMargin);
                            i40 = i40;
                            layoutParams4 = layoutParams5;
                            z17 = true;
                            z16 = true;
                        } else {
                            if (((LinearLayout.LayoutParams) layoutParams5).height != 0 || f13 <= f11) {
                                i34 = i39;
                            } else {
                                ((LinearLayout.LayoutParams) layoutParams5).height = i36;
                                i34 = 0;
                            }
                            int i45 = f12 == f11 ? this.f1313u0 : 0;
                            z16 = true;
                            layoutParams4 = layoutParams5;
                            measureChildWithMargins(childAt4, i10, 0, i11, i45);
                            if (i34 != i39) {
                                ((LinearLayout.LayoutParams) layoutParams4).height = i34;
                            }
                            int measuredHeight2 = childAt4.getMeasuredHeight();
                            int i46 = this.f1313u0;
                            this.f1313u0 = Math.max(i46, i46 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams4).topMargin + ((LinearLayout.LayoutParams) layoutParams4).bottomMargin);
                            int i47 = iMax5;
                            if (z20) {
                                iMax5 = Math.max(measuredHeight2, i47);
                            }
                            z17 = z22;
                        }
                        if (i40 >= 0 && i40 == i41 + 1) {
                            this.f1310r0 = this.f1313u0;
                        }
                        if (i41 < i40 && ((LinearLayout.LayoutParams) layoutParams4).weight > 0.0f) {
                            throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                        }
                        i35 = mode;
                        if (i35 == 1073741824 || ((LinearLayout.LayoutParams) layoutParams4).width != -1) {
                            z18 = false;
                        } else {
                            z18 = z16;
                            z23 = z18;
                        }
                        int i48 = ((LinearLayout.LayoutParams) layoutParams4).leftMargin + ((LinearLayout.LayoutParams) layoutParams4).rightMargin;
                        int measuredWidth2 = childAt4.getMeasuredWidth() + i48;
                        iMax2 = Math.max(i42, measuredWidth2);
                        int iCombineMeasuredStates = View.combineMeasuredStates(i43, childAt4.getMeasuredState());
                        boolean z24 = (z21 && ((LinearLayout.LayoutParams) layoutParams4).width == -1) ? z16 : false;
                        if (((LinearLayout.LayoutParams) layoutParams4).weight > 0.0f) {
                            if (!z18) {
                                i48 = measuredWidth2;
                            }
                            iMax4 = Math.max(iMax4, i48);
                        } else {
                            int i49 = iMax4;
                            if (!z18) {
                                i48 = measuredWidth2;
                            }
                            iMax3 = Math.max(iMax3, i48);
                            iMax4 = i49;
                        }
                        z22 = z17;
                        i43 = iCombineMeasuredStates;
                        z21 = z24;
                    }
                    i41++;
                    mode = i35;
                    i42 = iMax2;
                    i40 = i40;
                    z19 = z16;
                    mode2 = mode2;
                    virtualChildCount = virtualChildCount;
                    i36 = -2;
                    i37 = 1073741824;
                    i38 = 8;
                    i39 = Integer.MIN_VALUE;
                    f11 = 0.0f;
                }
                i40 = i40;
                mode2 = mode2;
                i35 = mode;
                virtualChildCount = virtualChildCount;
                iMax2 = i42;
                z16 = true;
                i41++;
                mode = i35;
                i42 = iMax2;
                i40 = i40;
                z19 = z16;
                mode2 = mode2;
                virtualChildCount = virtualChildCount;
                i36 = -2;
                i37 = 1073741824;
                i38 = 8;
                i39 = Integer.MIN_VALUE;
                f11 = 0.0f;
            }
            int i50 = mode2;
            int i51 = mode;
            int i52 = virtualChildCount;
            boolean z25 = z19;
            int iMax6 = iMax3;
            int i53 = iMax4;
            int i54 = iMax5;
            int i55 = i42;
            int iCombineMeasuredStates2 = i43;
            if (this.f1313u0 > 0 && hasDividerBeforeChildAt(i52)) {
                this.f1313u0 += this.G0;
            }
            int i56 = i50;
            if (z20 && (i56 == Integer.MIN_VALUE || i56 == 0)) {
                this.f1313u0 = 0;
                for (int i57 = 0; i57 < i52; i57++) {
                    View childAt5 = getChildAt(i57);
                    if (childAt5 == null) {
                        this.f1313u0 = this.f1313u0;
                    } else if (childAt5.getVisibility() != 8) {
                        LayoutParams layoutParams6 = (LayoutParams) childAt5.getLayoutParams();
                        int i58 = this.f1313u0;
                        this.f1313u0 = Math.max(i58, i58 + i54 + ((LinearLayout.LayoutParams) layoutParams6).topMargin + ((LinearLayout.LayoutParams) layoutParams6).bottomMargin);
                    }
                }
            }
            int paddingBottom = getPaddingBottom() + getPaddingTop() + this.f1313u0;
            this.f1313u0 = paddingBottom;
            int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i11, 0);
            int i59 = (16777215 & iResolveSizeAndState) - this.f1313u0;
            if (z22 || (i59 != 0 && f12 > 0.0f)) {
                float f14 = this.v0;
                if (f14 > 0.0f) {
                    f12 = f14;
                }
                this.f1313u0 = 0;
                int i60 = 0;
                while (i60 < i52) {
                    View childAt6 = getChildAt(i60);
                    if (childAt6.getVisibility() == 8) {
                        i31 = i56;
                    } else {
                        LayoutParams layoutParams7 = (LayoutParams) childAt6.getLayoutParams();
                        float f15 = ((LinearLayout.LayoutParams) layoutParams7).weight;
                        if (f15 > 0.0f) {
                            int i61 = (int) ((i59 * f15) / f12);
                            f12 -= f15;
                            int i62 = i59 - i61;
                            int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams7).leftMargin + ((LinearLayout.LayoutParams) layoutParams7).rightMargin, ((LinearLayout.LayoutParams) layoutParams7).width);
                            if (((LinearLayout.LayoutParams) layoutParams7).height == 0) {
                                i33 = 1073741824;
                                if (i56 == 1073741824) {
                                    if (i61 <= 0) {
                                        i61 = 0;
                                    }
                                    childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i61, 1073741824));
                                }
                                iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt6.getMeasuredState() & InputDeviceCompat.SOURCE_ANY);
                                i59 = i62;
                            } else {
                                i33 = 1073741824;
                            }
                            int measuredHeight3 = childAt6.getMeasuredHeight() + i61;
                            if (measuredHeight3 < 0) {
                                measuredHeight3 = 0;
                            }
                            childAt6.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight3, i33));
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, childAt6.getMeasuredState() & InputDeviceCompat.SOURCE_ANY);
                            i59 = i62;
                        }
                        int i63 = ((LinearLayout.LayoutParams) layoutParams7).leftMargin + ((LinearLayout.LayoutParams) layoutParams7).rightMargin;
                        int measuredWidth3 = childAt6.getMeasuredWidth() + i63;
                        int iMax7 = Math.max(i55, measuredWidth3);
                        if (i51 != 1073741824) {
                            i31 = i56;
                            i32 = -1;
                            if (((LinearLayout.LayoutParams) layoutParams7).width != -1) {
                            }
                            iMax6 = Math.max(iMax6, i63);
                            if (z21 || ((LinearLayout.LayoutParams) layoutParams7).width != i32) {
                                z15 = false;
                            } else {
                                z15 = z25;
                            }
                            int i64 = this.f1313u0;
                            this.f1313u0 = Math.max(i64, childAt6.getMeasuredHeight() + i64 + ((LinearLayout.LayoutParams) layoutParams7).topMargin + ((LinearLayout.LayoutParams) layoutParams7).bottomMargin);
                            z21 = z15;
                            i55 = iMax7;
                        } else {
                            i31 = i56;
                            i32 = -1;
                        }
                        i63 = measuredWidth3;
                        iMax6 = Math.max(iMax6, i63);
                        if (z21) {
                            z15 = false;
                        } else {
                            z15 = false;
                        }
                        int i65 = this.f1313u0;
                        this.f1313u0 = Math.max(i65, childAt6.getMeasuredHeight() + i65 + ((LinearLayout.LayoutParams) layoutParams7).topMargin + ((LinearLayout.LayoutParams) layoutParams7).bottomMargin);
                        z21 = z15;
                        i55 = iMax7;
                    }
                    i60++;
                    i56 = i31;
                }
                this.f1313u0 = getPaddingBottom() + getPaddingTop() + this.f1313u0;
            } else {
                iMax6 = Math.max(iMax6, i53);
                if (z20 && i56 != 1073741824) {
                    for (int i66 = 0; i66 < i52; i66++) {
                        View childAt7 = getChildAt(i66);
                        if (childAt7 != null && childAt7.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) childAt7.getLayoutParams())).weight > 0.0f) {
                            childAt7.measure(View.MeasureSpec.makeMeasureSpec(childAt7.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i54, 1073741824));
                        }
                    }
                }
            }
            int i67 = i55;
            if (z21 || i51 == 1073741824) {
                iMax6 = i67;
            }
            setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + iMax6, getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), iResolveSizeAndState);
            if (z23) {
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                for (int i68 = 0; i68 < i52; i68++) {
                    View childAt8 = getChildAt(i68);
                    if (childAt8.getVisibility() != 8) {
                        LayoutParams layoutParams8 = (LayoutParams) childAt8.getLayoutParams();
                        if (((LinearLayout.LayoutParams) layoutParams8).width == -1) {
                            int i69 = ((LinearLayout.LayoutParams) layoutParams8).height;
                            ((LinearLayout.LayoutParams) layoutParams8).height = childAt8.getMeasuredHeight();
                            measureChildWithMargins(childAt8, iMakeMeasureSpec2, 0, i11, 0);
                            ((LinearLayout.LayoutParams) layoutParams8).height = i69;
                        }
                    }
                }
                return;
            }
            return;
        }
        this.f1313u0 = 0;
        int virtualChildCount2 = getVirtualChildCount();
        int mode3 = View.MeasureSpec.getMode(i10);
        int mode4 = View.MeasureSpec.getMode(i11);
        if (this.f1315x0 == null || this.f1316y0 == null) {
            this.f1315x0 = new int[4];
            this.f1316y0 = new int[4];
        }
        int[] iArr = this.f1315x0;
        int[] iArr2 = this.f1316y0;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z26 = this.f1308p0;
        boolean z27 = this.f1314w0;
        boolean z28 = mode3 == 1073741824;
        boolean z29 = true;
        int iMax8 = 0;
        float f16 = 0.0f;
        int i70 = 0;
        int i71 = 0;
        int i72 = 0;
        int iMax9 = 0;
        int iMax10 = 0;
        boolean z30 = false;
        boolean z31 = false;
        while (i71 < virtualChildCount2) {
            View childAt9 = getChildAt(i71);
            if (childAt9 == null) {
                this.f1313u0 = this.f1313u0;
                i28 = i71;
                z10 = z27;
                z11 = z26;
            } else {
                int i73 = iMax8;
                int i74 = i70;
                if (childAt9.getVisibility() == 8) {
                    z11 = z26;
                    iMax8 = i73;
                    i70 = i74;
                    i28 = i71;
                    z10 = z27;
                } else {
                    if (hasDividerBeforeChildAt(i71)) {
                        this.f1313u0 += this.F0;
                    }
                    LayoutParams layoutParams9 = (LayoutParams) childAt9.getLayoutParams();
                    float f17 = ((LinearLayout.LayoutParams) layoutParams9).weight;
                    float f18 = f16 + f17;
                    if (mode3 == 1073741824 && ((LinearLayout.LayoutParams) layoutParams9).width == 0 && f17 > 0.0f) {
                        if (z28) {
                            this.f1313u0 = ((LinearLayout.LayoutParams) layoutParams9).leftMargin + ((LinearLayout.LayoutParams) layoutParams9).rightMargin + this.f1313u0;
                        } else {
                            int i75 = this.f1313u0;
                            this.f1313u0 = Math.max(i75, ((LinearLayout.LayoutParams) layoutParams9).leftMargin + i75 + ((LinearLayout.LayoutParams) layoutParams9).rightMargin);
                        }
                        if (z26) {
                            int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(0, 0);
                            childAt9.measure(iMakeMeasureSpec3, iMakeMeasureSpec3);
                            layoutParams3 = layoutParams9;
                            i25 = i73;
                            i26 = i74;
                            i28 = i71;
                            z10 = z27;
                            z11 = z26;
                        } else {
                            layoutParams3 = layoutParams9;
                            i25 = i73;
                            i26 = i74;
                            i28 = i71;
                            i29 = 1073741824;
                            z10 = z27;
                            z11 = z26;
                            z12 = true;
                        }
                        if (mode4 == i29 && ((LinearLayout.LayoutParams) layoutParams3).height == -1) {
                            z13 = true;
                            z31 = true;
                        } else {
                            z13 = false;
                        }
                        i30 = ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin;
                        measuredHeight = childAt9.getMeasuredHeight() + i30;
                        int iCombineMeasuredStates3 = View.combineMeasuredStates(i72, childAt9.getMeasuredState());
                        if (!z11 && (baseline2 = childAt9.getBaseline()) != -1) {
                            int i76 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                            if (i76 < 0) {
                                i76 = this.f1312t0;
                            }
                            int i77 = (((i76 & 112) >> 4) & (-2)) >> 1;
                            iArr[i77] = Math.max(iArr[i77], baseline2);
                            iArr2[i77] = Math.max(iArr2[i77], measuredHeight - baseline2);
                        }
                        int iMax11 = Math.max(i26, measuredHeight);
                        if (z29 || ((LinearLayout.LayoutParams) layoutParams3).height != -1) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        if (((LinearLayout.LayoutParams) layoutParams3).weight > 0.0f) {
                            if (z13) {
                                measuredHeight = i30;
                            }
                            iMax10 = Math.max(iMax10, measuredHeight);
                            iMax8 = i25;
                        } else {
                            if (z13) {
                                measuredHeight = i30;
                            }
                            iMax8 = Math.max(i25, measuredHeight);
                        }
                        i70 = iMax11;
                        i72 = iCombineMeasuredStates3;
                        z30 = z12;
                        z29 = z14;
                        f16 = f18;
                    } else {
                        int i78 = i71;
                        if (((LinearLayout.LayoutParams) layoutParams9).width == 0) {
                            f10 = 0.0f;
                            if (f17 > 0.0f) {
                                ((LinearLayout.LayoutParams) layoutParams9).width = -2;
                                i23 = 0;
                            }
                            if (f18 == f10) {
                                i24 = this.f1313u0;
                            } else {
                                i24 = 0;
                            }
                            i25 = i73;
                            i26 = i74;
                            i27 = i23;
                            i28 = i78;
                            z10 = z27;
                            z11 = z26;
                            measureChildWithMargins(childAt9, i10, i24, i11, 0);
                            if (i27 != Integer.MIN_VALUE) {
                                layoutParams3 = layoutParams9;
                                ((LinearLayout.LayoutParams) layoutParams3).width = i27;
                            } else {
                                layoutParams3 = layoutParams9;
                            }
                            measuredWidth = childAt9.getMeasuredWidth();
                            if (z28) {
                                this.f1313u0 = ((LinearLayout.LayoutParams) layoutParams3).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + this.f1313u0;
                            } else {
                                int i79 = this.f1313u0;
                                this.f1313u0 = Math.max(i79, i79 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin);
                            }
                            if (z10) {
                                iMax9 = Math.max(measuredWidth, iMax9);
                            }
                        } else {
                            f10 = 0.0f;
                        }
                        i23 = Integer.MIN_VALUE;
                        if (f18 == f10) {
                            i24 = this.f1313u0;
                        } else {
                            i24 = 0;
                        }
                        i25 = i73;
                        i26 = i74;
                        i27 = i23;
                        i28 = i78;
                        z10 = z27;
                        z11 = z26;
                        measureChildWithMargins(childAt9, i10, i24, i11, 0);
                        if (i27 != Integer.MIN_VALUE) {
                            layoutParams3 = layoutParams9;
                            ((LinearLayout.LayoutParams) layoutParams3).width = i27;
                        } else {
                            layoutParams3 = layoutParams9;
                        }
                        measuredWidth = childAt9.getMeasuredWidth();
                        if (z28) {
                            this.f1313u0 = ((LinearLayout.LayoutParams) layoutParams3).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + this.f1313u0;
                        } else {
                            int i710 = this.f1313u0;
                            this.f1313u0 = Math.max(i710, i710 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin);
                        }
                        if (z10) {
                            iMax9 = Math.max(measuredWidth, iMax9);
                        }
                    }
                    z12 = z30;
                    i29 = 1073741824;
                    if (mode4 == i29) {
                        z13 = false;
                    } else {
                        z13 = false;
                    }
                    i30 = ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin;
                    measuredHeight = childAt9.getMeasuredHeight() + i30;
                    int iCombineMeasuredStates4 = View.combineMeasuredStates(i72, childAt9.getMeasuredState());
                    if (!z11) {
                    }
                    int iMax12 = Math.max(i26, measuredHeight);
                    if (z29) {
                        z14 = false;
                    } else {
                        z14 = false;
                    }
                    if (((LinearLayout.LayoutParams) layoutParams3).weight > 0.0f) {
                        if (z13) {
                            measuredHeight = i30;
                        }
                        iMax10 = Math.max(iMax10, measuredHeight);
                        iMax8 = i25;
                    } else {
                        if (z13) {
                            measuredHeight = i30;
                        }
                        iMax8 = Math.max(i25, measuredHeight);
                    }
                    i70 = iMax12;
                    i72 = iCombineMeasuredStates4;
                    z30 = z12;
                    z29 = z14;
                    f16 = f18;
                }
            }
            i71 = i28 + 1;
            z27 = z10;
            z26 = z11;
        }
        int i80 = i70;
        boolean z32 = z27;
        boolean z33 = z26;
        if (this.f1313u0 > 0 && hasDividerBeforeChildAt(virtualChildCount2)) {
            this.f1313u0 += this.F0;
        }
        int i81 = iArr[1];
        if (i81 == -1 && iArr[0] == -1 && iArr[2] == -1) {
            c10 = 3;
            if (iArr[3] == -1) {
                iMax = i80;
            }
            if (z32 && (mode3 == Integer.MIN_VALUE || mode3 == 0)) {
                this.f1313u0 = 0;
                for (i22 = 0; i22 < virtualChildCount2; i22++) {
                    childAt3 = getChildAt(i22);
                    if (childAt3 == null) {
                        this.f1313u0 = this.f1313u0;
                    } else if (childAt3.getVisibility() == 8) {
                        layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                        if (z28) {
                            this.f1313u0 = ((LinearLayout.LayoutParams) layoutParams2).leftMargin + iMax9 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + this.f1313u0;
                        } else {
                            int i82 = this.f1313u0;
                            this.f1313u0 = Math.max(i82, i82 + iMax9 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin);
                        }
                    }
                }
            }
            int paddingRight = getPaddingRight() + getPaddingLeft() + this.f1313u0;
            this.f1313u0 = paddingRight;
            int iResolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i10, 0);
            i12 = (16777215 & iResolveSizeAndState2) - this.f1313u0;
            if (!z30 || (i12 != 0 && f16 > 0.0f)) {
                f6 = this.v0;
                if (f6 > 0.0f) {
                    f16 = f6;
                }
                iArr[3] = -1;
                iArr[2] = -1;
                iArr[1] = -1;
                iArr[0] = -1;
                iArr2[3] = -1;
                iArr2[2] = -1;
                iArr2[1] = -1;
                iArr2[0] = -1;
                this.f1313u0 = 0;
                int iCombineMeasuredStates5 = i72;
                iMax = -1;
                i13 = 0;
                while (i13 < virtualChildCount2) {
                    childAt = getChildAt(i13);
                    if (childAt != null || childAt.getVisibility() == 8) {
                        i17 = i12;
                        virtualChildCount2 = virtualChildCount2;
                    } else {
                        LayoutParams layoutParams10 = (LayoutParams) childAt.getLayoutParams();
                        float f19 = ((LinearLayout.LayoutParams) layoutParams10).weight;
                        if (f19 > 0.0f) {
                            int i83 = (int) ((i12 * f19) / f16);
                            float f20 = f16 - f19;
                            int i84 = i12 - i83;
                            int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i11, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) layoutParams10).topMargin + ((LinearLayout.LayoutParams) layoutParams10).bottomMargin, ((LinearLayout.LayoutParams) layoutParams10).height);
                            if (((LinearLayout.LayoutParams) layoutParams10).width == 0) {
                                i20 = 1073741824;
                                if (mode3 == 1073741824) {
                                    if (i83 <= 0) {
                                        i83 = 0;
                                    }
                                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i83, 1073741824), childMeasureSpec2);
                                }
                                iCombineMeasuredStates5 = View.combineMeasuredStates(iCombineMeasuredStates5, childAt.getMeasuredState() & ViewCompat.MEASURED_STATE_MASK);
                                f16 = f20;
                                i18 = i84;
                            } else {
                                i20 = 1073741824;
                            }
                            int measuredWidth4 = childAt.getMeasuredWidth() + i83;
                            if (measuredWidth4 < 0) {
                                measuredWidth4 = 0;
                            }
                            childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth4, i20), childMeasureSpec2);
                            iCombineMeasuredStates5 = View.combineMeasuredStates(iCombineMeasuredStates5, childAt.getMeasuredState() & ViewCompat.MEASURED_STATE_MASK);
                            f16 = f20;
                            i18 = i84;
                        } else {
                            i18 = i12;
                        }
                        if (z28) {
                            this.f1313u0 = childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams10).leftMargin + ((LinearLayout.LayoutParams) layoutParams10).rightMargin + this.f1313u0;
                        } else {
                            int i85 = this.f1313u0;
                            this.f1313u0 = Math.max(i85, childAt.getMeasuredWidth() + i85 + ((LinearLayout.LayoutParams) layoutParams10).leftMargin + ((LinearLayout.LayoutParams) layoutParams10).rightMargin);
                        }
                        boolean z34 = mode4 != 1073741824 && ((LinearLayout.LayoutParams) layoutParams10).height == -1;
                        int i86 = ((LinearLayout.LayoutParams) layoutParams10).topMargin + ((LinearLayout.LayoutParams) layoutParams10).bottomMargin;
                        int measuredHeight4 = childAt.getMeasuredHeight() + i86;
                        iMax = Math.max(iMax, measuredHeight4);
                        if (!z34) {
                            i86 = measuredHeight4;
                        }
                        iMax8 = Math.max(iMax8, i86);
                        if (z29) {
                            i19 = -1;
                            boolean z35 = ((LinearLayout.LayoutParams) layoutParams10).height == -1;
                            if (!z33 && (baseline = childAt.getBaseline()) != i19) {
                                int i87 = ((LinearLayout.LayoutParams) layoutParams10).gravity;
                                if (i87 < 0) {
                                    i87 = this.f1312t0;
                                }
                                int i88 = (((i87 & 112) >> 4) & (-2)) >> 1;
                                iArr[i88] = Math.max(iArr[i88], baseline);
                                iArr2[i88] = Math.max(iArr2[i88], measuredHeight4 - baseline);
                            }
                            z29 = z35;
                            i17 = i18;
                            f16 = f16;
                        } else {
                            i19 = -1;
                        }
                        if (!z33) {
                        }
                        z29 = z35;
                        i17 = i18;
                        f16 = f16;
                    }
                    i13++;
                    i12 = i17;
                    virtualChildCount2 = virtualChildCount2;
                }
                i14 = virtualChildCount2;
                this.f1313u0 = getPaddingRight() + getPaddingLeft() + this.f1313u0;
                i15 = iArr[1];
                if (i15 != -1 && iArr[0] == -1 && iArr[2] == -1) {
                    c11 = 3;
                    if (iArr[3] == -1) {
                        i16 = 0;
                    }
                    i72 = iCombineMeasuredStates5;
                } else {
                    c11 = 3;
                }
                i16 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c11], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i15, iArr[2]))));
                i72 = iCombineMeasuredStates5;
            } else {
                iMax8 = Math.max(iMax8, iMax10);
                if (z32 && mode3 != 1073741824) {
                    for (int i89 = 0; i89 < virtualChildCount2; i89++) {
                        View childAt10 = getChildAt(i89);
                        if (childAt10 != null && childAt10.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) childAt10.getLayoutParams())).weight > 0.0f) {
                            childAt10.measure(View.MeasureSpec.makeMeasureSpec(iMax9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt10.getMeasuredHeight(), 1073741824));
                        }
                    }
                }
                i14 = virtualChildCount2;
                i16 = 0;
            }
            if (z29 || mode4 == 1073741824) {
                iMax8 = iMax;
            }
            setMeasuredDimension((i72 & ViewCompat.MEASURED_STATE_MASK) | iResolveSizeAndState2, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax8, getSuggestedMinimumHeight()), i11, i72 << 16));
            if (z31) {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
                i21 = i14;
                while (i16 < i21) {
                    childAt2 = getChildAt(i16);
                    if (childAt2.getVisibility() != 8) {
                        layoutParams = (LayoutParams) childAt2.getLayoutParams();
                        if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                            int i90 = ((LinearLayout.LayoutParams) layoutParams).width;
                            ((LinearLayout.LayoutParams) layoutParams).width = childAt2.getMeasuredWidth();
                            measureChildWithMargins(childAt2, i10, 0, iMakeMeasureSpec, 0);
                            ((LinearLayout.LayoutParams) layoutParams).width = i90;
                        }
                    }
                    i16++;
                }
            }
        }
        c10 = 3;
        iMax = Math.max(i80, Math.max(iArr2[3], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c10], Math.max(iArr[0], Math.max(i81, iArr[2]))));
        if (z32) {
            this.f1313u0 = 0;
            while (i22 < virtualChildCount2) {
                childAt3 = getChildAt(i22);
                if (childAt3 == null) {
                    this.f1313u0 = this.f1313u0;
                } else if (childAt3.getVisibility() == 8) {
                    layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                    if (z28) {
                        this.f1313u0 = ((LinearLayout.LayoutParams) layoutParams2).leftMargin + iMax9 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + this.f1313u0;
                    } else {
                        int i810 = this.f1313u0;
                        this.f1313u0 = Math.max(i810, i810 + iMax9 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin);
                    }
                }
            }
        }
        int paddingRight2 = getPaddingRight() + getPaddingLeft() + this.f1313u0;
        this.f1313u0 = paddingRight2;
        int iResolveSizeAndState3 = View.resolveSizeAndState(Math.max(paddingRight2, getSuggestedMinimumWidth()), i10, 0);
        i12 = (16777215 & iResolveSizeAndState3) - this.f1313u0;
        if (z30) {
            f6 = this.v0;
            if (f6 > 0.0f) {
                f16 = f6;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f1313u0 = 0;
            int iCombineMeasuredStates6 = i72;
            iMax = -1;
            i13 = 0;
            while (i13 < virtualChildCount2) {
                childAt = getChildAt(i13);
                if (childAt != null) {
                    i17 = i12;
                    virtualChildCount2 = virtualChildCount2;
                } else {
                    i17 = i12;
                    virtualChildCount2 = virtualChildCount2;
                }
                i13++;
                i12 = i17;
                virtualChildCount2 = virtualChildCount2;
            }
            i14 = virtualChildCount2;
            this.f1313u0 = getPaddingRight() + getPaddingLeft() + this.f1313u0;
            i15 = iArr[1];
            if (i15 != -1) {
                c11 = 3;
                i16 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c11], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i15, iArr[2]))));
            } else {
                c11 = 3;
                i16 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c11], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i15, iArr[2]))));
            }
            i72 = iCombineMeasuredStates6;
        } else {
            f6 = this.v0;
            if (f6 > 0.0f) {
                f16 = f6;
            }
            iArr[3] = -1;
            iArr[2] = -1;
            iArr[1] = -1;
            iArr[0] = -1;
            iArr2[3] = -1;
            iArr2[2] = -1;
            iArr2[1] = -1;
            iArr2[0] = -1;
            this.f1313u0 = 0;
            int iCombineMeasuredStates7 = i72;
            iMax = -1;
            i13 = 0;
            while (i13 < virtualChildCount2) {
                childAt = getChildAt(i13);
                if (childAt != null) {
                    i17 = i12;
                    virtualChildCount2 = virtualChildCount2;
                } else {
                    i17 = i12;
                    virtualChildCount2 = virtualChildCount2;
                }
                i13++;
                i12 = i17;
                virtualChildCount2 = virtualChildCount2;
            }
            i14 = virtualChildCount2;
            this.f1313u0 = getPaddingRight() + getPaddingLeft() + this.f1313u0;
            i15 = iArr[1];
            if (i15 != -1) {
                c11 = 3;
                i16 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c11], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i15, iArr[2]))));
            } else {
                c11 = 3;
                i16 = 0;
                iMax = Math.max(iMax, Math.max(iArr2[c11], Math.max(iArr2[0], Math.max(iArr2[1], iArr2[2]))) + Math.max(iArr[c11], Math.max(iArr[0], Math.max(i15, iArr[2]))));
            }
            i72 = iCombineMeasuredStates7;
        }
        if (z29) {
            iMax8 = iMax;
        } else {
            iMax8 = iMax;
        }
        setMeasuredDimension((i72 & ViewCompat.MEASURED_STATE_MASK) | iResolveSizeAndState3, View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + iMax8, getSuggestedMinimumHeight()), i11, i72 << 16));
        if (z31) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
            i21 = i14;
            while (i16 < i21) {
                childAt2 = getChildAt(i16);
                if (childAt2.getVisibility() != 8) {
                    layoutParams = (LayoutParams) childAt2.getLayoutParams();
                    if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                        int i91 = ((LinearLayout.LayoutParams) layoutParams).width;
                        ((LinearLayout.LayoutParams) layoutParams).width = childAt2.getMeasuredWidth();
                        measureChildWithMargins(childAt2, i10, 0, iMakeMeasureSpec, 0);
                        ((LinearLayout.LayoutParams) layoutParams).width = i91;
                    }
                }
                i16++;
            }
        }
    }

    public void setBaselineAligned(boolean z10) {
        this.f1308p0 = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f1309q0 = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.E0) {
            return;
        }
        this.E0 = drawable;
        if (drawable != null) {
            this.F0 = drawable.getIntrinsicWidth();
            this.G0 = drawable.getIntrinsicHeight();
        } else {
            this.F0 = 0;
            this.G0 = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.I0 = i10;
    }

    public void setGravity(@GravityInt int i10) {
        if (this.f1312t0 != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= GravityCompat.START;
            }
            if ((i10 & 112) == 0) {
                i10 |= 48;
            }
            this.f1312t0 = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & GravityCompat.RELATIVE_HORIZONTAL_GRAVITY_MASK;
        int i12 = this.f1312t0;
        if ((8388615 & i12) != i11) {
            this.f1312t0 = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f1314w0 = z10;
    }

    public void setOrientation(int i10) {
        if (this.f1311s0 != i10) {
            this.f1311s0 = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.H0) {
            requestLayout();
        }
        this.H0 = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & 112;
        int i12 = this.f1312t0;
        if ((i12 & 112) != i11) {
            this.f1312t0 = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f6) {
        this.v0 = Math.max(0.0f, f6);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        int i10 = this.f1311s0;
        if (i10 == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i10 == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    public LinearLayoutCompat(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1308p0 = true;
        this.f1309q0 = -1;
        this.f1310r0 = 0;
        this.f1312t0 = 8388659;
        int[] iArr = androidx.appcompat.R.styleable.LinearLayoutCompat;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i10, 0);
        ViewCompat.saveAttributeDataForStyleable(this, context, iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        int i11 = tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.LinearLayoutCompat_android_orientation, -1);
        if (i11 >= 0) {
            setOrientation(i11);
        }
        int i12 = tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.LinearLayoutCompat_android_gravity, -1);
        if (i12 >= 0) {
            setGravity(i12);
        }
        boolean z10 = tintTypedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.LinearLayoutCompat_android_baselineAligned, true);
        if (!z10) {
            setBaselineAligned(z10);
        }
        this.v0 = tintTypedArrayObtainStyledAttributes.getFloat(androidx.appcompat.R.styleable.LinearLayoutCompat_android_weightSum, -1.0f);
        this.f1309q0 = tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.f1314w0 = tintTypedArrayObtainStyledAttributes.getBoolean(androidx.appcompat.R.styleable.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(androidx.appcompat.R.styleable.LinearLayoutCompat_divider));
        this.H0 = tintTypedArrayObtainStyledAttributes.getInt(androidx.appcompat.R.styleable.LinearLayoutCompat_showDividers, 0);
        this.I0 = tintTypedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.appcompat.R.styleable.LinearLayoutCompat_dividerPadding, 0);
        tintTypedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new LayoutParams(layoutParams);
    }
}
