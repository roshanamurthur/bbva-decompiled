package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class NestedScrollView extends FrameLayout implements NestedScrollingParent3, NestedScrollingChild3, ScrollingView {
    public static final float T0 = (float) (Math.log(0.78d) / Math.log(0.9d));
    public static final a U0 = new a();
    public static final int[] V0 = {R.attr.fillViewport};
    public boolean E0;
    public boolean F0;
    public final int G0;
    public final int H0;
    public final int I0;
    public int J0;
    public final int[] K0;
    public final int[] L0;
    public int M0;
    public int N0;
    public SavedState O0;
    public final NestedScrollingParentHelper P0;
    public final NestedScrollingChildHelper Q0;
    public float R0;
    public OnScrollChangeListener S0;

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public EdgeEffect mEdgeGlowBottom;

    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    public EdgeEffect mEdgeGlowTop;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final float f20440p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public long f20441q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final Rect f20442r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final OverScroller f20443s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f20444t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f20445u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public View f20446w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f20447x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public VelocityTracker f20448y0;

    public interface OnScrollChangeListener {
        void onScrollChange(@NonNull NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f20449p0;

        public class a implements Parcelable.Creator<SavedState> {
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                SavedState savedState = new SavedState(parcel);
                savedState.f20449p0 = parcel.readInt();
                return savedState;
            }

            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        @NonNull
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("HorizontalScrollView.SavedState{");
            sb2.append(Integer.toHexString(System.identityHashCode(this)));
            sb2.append(" scrollPosition=");
            return androidx.appcompat.widget.a.c(sb2, this.f20449p0, "}");
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f20449p0);
        }
    }

    public static class a extends AccessibilityDelegateCompat {
        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            AccessibilityRecordCompat.setMaxScrollX(accessibilityEvent, nestedScrollView.getScrollX());
            AccessibilityRecordCompat.setMaxScrollY(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityNodeInfoCompat.setClassName(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            accessibilityNodeInfoCompat.setScrollable(true);
            if (nestedScrollView.getScrollY() > 0) {
                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_UP);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfoCompat.addAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_DOWN);
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.i(0 - nestedScrollView.getScrollX(), iMax - nestedScrollView.getScrollY(), 250, true);
                    return true;
                }
                if (i10 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.i(0 - nestedScrollView.getScrollX(), iMin - nestedScrollView.getScrollY(), 250, true);
            return true;
        }
    }

    @RequiresApi(21)
    public static class b {
        @DoNotInline
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public NestedScrollView(@NonNull Context context) {
        this(context, null);
    }

    public static boolean a(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && a((View) parent, view2);
    }

    private float getVerticalScrollFactorCompat() {
        if (this.R0 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.R0 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.R0;
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    public boolean arrowScroll(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !b(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getHeight() + getScrollY()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            g(maxScrollAmount, 0, 1, true);
        } else {
            Rect rect = this.f20442r0;
            viewFindNextFocus.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(viewFindNextFocus, rect);
            g(computeScrollDeltaToGetChildRectOnScreen(rect), 0, 1, true);
            viewFindNextFocus.requestFocus(i10);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && (!b(viewFindFocus, 0, getHeight()))) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    public final boolean b(View view, int i10, int i11) {
        Rect rect = this.f20442r0;
        view.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(view, rect);
        return rect.bottom + i10 >= getScrollY() && rect.top - i10 <= getScrollY() + i11;
    }

    public final void c(int i10, int i11, @Nullable int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.Q0.dispatchNestedScroll(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0087  */
    /* JADX WARN: Code duplicated, block: B:23:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:27:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:31:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f4  */
    @Override // android.view.View
    public void computeScroll() {
        int iRound;
        int[] iArr;
        int i10;
        int scrollRange;
        int overScrollMode;
        if (this.f20443s0.isFinished()) {
            return;
        }
        this.f20443s0.computeScrollOffset();
        int currY = this.f20443s0.getCurrY();
        int i11 = currY - this.N0;
        int height = getHeight();
        if (i11 <= 0 || EdgeEffectCompat.getDistance(this.mEdgeGlowTop) == 0.0f) {
            if (i11 < 0 && EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) != 0.0f) {
                float f6 = height;
                iRound = Math.round(EdgeEffectCompat.onPullDistance(this.mEdgeGlowBottom, (i11 * 4.0f) / f6, 0.5f) * (f6 / 4.0f));
                if (iRound != i11) {
                    this.mEdgeGlowBottom.finish();
                }
            }
            this.N0 = currY;
            iArr = this.L0;
            iArr[1] = 0;
            dispatchNestedPreScroll(0, i11, iArr, null, 1);
            i10 = i11 - iArr[1];
            scrollRange = getScrollRange();
            if (i10 != 0) {
                int scrollY = getScrollY();
                e(i10, getScrollX(), scrollY, scrollRange);
                int scrollY2 = getScrollY() - scrollY;
                int i12 = i10 - scrollY2;
                iArr[1] = 0;
                dispatchNestedScroll(0, scrollY2, 0, i12, this.K0, 1, iArr);
                i10 = i12 - iArr[1];
            }
            if (i10 != 0) {
                overScrollMode = getOverScrollMode();
                if (overScrollMode != 0 || (overScrollMode == 1 && scrollRange > 0)) {
                    if (i10 < 0) {
                        if (this.mEdgeGlowTop.isFinished()) {
                            this.mEdgeGlowTop.onAbsorb((int) this.f20443s0.getCurrVelocity());
                        }
                    } else if (this.mEdgeGlowBottom.isFinished()) {
                        this.mEdgeGlowBottom.onAbsorb((int) this.f20443s0.getCurrVelocity());
                    }
                }
                this.f20443s0.abortAnimation();
                stopNestedScroll(1);
            }
            if (this.f20443s0.isFinished()) {
                stopNestedScroll(1);
            } else {
                ViewCompat.postInvalidateOnAnimation(this);
            }
        }
        iRound = Math.round(EdgeEffectCompat.onPullDistance(this.mEdgeGlowTop, ((-i11) * 4.0f) / height, 0.5f) * ((-height) / 4.0f));
        if (iRound != i11) {
            this.mEdgeGlowTop.finish();
        }
        i11 -= iRound;
        this.N0 = currY;
        iArr = this.L0;
        iArr[1] = 0;
        dispatchNestedPreScroll(0, i11, iArr, null, 1);
        i10 = i11 - iArr[1];
        scrollRange = getScrollRange();
        if (i10 != 0) {
            int scrollY3 = getScrollY();
            e(i10, getScrollX(), scrollY3, scrollRange);
            int scrollY4 = getScrollY() - scrollY3;
            int i13 = i10 - scrollY4;
            iArr[1] = 0;
            dispatchNestedScroll(0, scrollY4, 0, i13, this.K0, 1, iArr);
            i10 = i13 - iArr[1];
        }
        if (i10 != 0) {
            overScrollMode = getOverScrollMode();
            if (overScrollMode != 0) {
                if (i10 < 0) {
                    if (this.mEdgeGlowTop.isFinished()) {
                        this.mEdgeGlowTop.onAbsorb((int) this.f20443s0.getCurrVelocity());
                    }
                } else if (this.mEdgeGlowBottom.isFinished()) {
                    this.mEdgeGlowBottom.onAbsorb((int) this.f20443s0.getCurrVelocity());
                }
            } else if (i10 < 0) {
                if (this.mEdgeGlowTop.isFinished()) {
                    this.mEdgeGlowTop.onAbsorb((int) this.f20443s0.getCurrVelocity());
                }
            } else if (this.mEdgeGlowBottom.isFinished()) {
                this.mEdgeGlowBottom.onAbsorb((int) this.f20443s0.getCurrVelocity());
            }
            this.f20443s0.abortAnimation();
            stopNestedScroll(1);
        }
        if (this.f20443s0.isFinished()) {
            ViewCompat.postInvalidateOnAnimation(this);
        } else {
            stopNestedScroll(1);
        }
    }

    public int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    public final void d(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.J0) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f20444t0 = (int) motionEvent.getY(i10);
            this.J0 = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f20448y0;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || executeKeyEvent(keyEvent);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedFling(float f6, float f10, boolean z10) {
        return this.Q0.dispatchNestedFling(f6, f10, z10);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreFling(float f6, float f10) {
        return this.Q0.dispatchNestedPreFling(f6, f10);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedPreScroll(int i10, int i11, @Nullable int[] iArr, @Nullable int[] iArr2, int i12) {
        return this.Q0.dispatchNestedPreScroll(i10, i11, iArr, iArr2, i12);
    }

    @Override // androidx.core.view.NestedScrollingChild3
    public void dispatchNestedScroll(int i10, int i11, int i12, int i13, @Nullable int[] iArr, int i14, @NonNull int[] iArr2) {
        this.Q0.dispatchNestedScroll(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.mEdgeGlowTop.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingRight() + getPaddingLeft();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingBottom() + getPaddingTop();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.mEdgeGlowTop.setSize(width, height);
            if (this.mEdgeGlowTop.draw(canvas)) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
            canvas.restoreToCount(iSave);
        }
        if (this.mEdgeGlowBottom.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingRight() + getPaddingLeft();
            paddingLeft2 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingBottom() + getPaddingTop();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.mEdgeGlowBottom.setSize(width2, height2);
        if (this.mEdgeGlowBottom.draw(canvas)) {
            ViewCompat.postInvalidateOnAnimation(this);
        }
        canvas.restoreToCount(iSave2);
    }

    public final boolean e(int i10, int i11, int i12, int i13) {
        boolean z10;
        boolean z11;
        getOverScrollMode();
        computeHorizontalScrollRange();
        computeHorizontalScrollExtent();
        computeVerticalScrollRange();
        computeVerticalScrollExtent();
        int i14 = i12 + i10;
        if (i11 <= 0 && i11 >= 0) {
            z10 = false;
        } else {
            i11 = 0;
            z10 = true;
        }
        if (i14 > i13) {
            z11 = true;
        } else if (i14 < 0) {
            i13 = 0;
            z11 = true;
        } else {
            i13 = i14;
            z11 = false;
        }
        if (z11 && !hasNestedScrollingParent(1)) {
            this.f20443s0.springBack(i11, i13, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i11, i13, z10, z11);
        return z10 || z11;
    }

    public boolean executeKeyEvent(@NonNull KeyEvent keyEvent) {
        this.f20442r0.setEmpty();
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                if (keyEvent.getAction() != 0) {
                    return false;
                }
                int keyCode = keyEvent.getKeyCode();
                if (keyCode == 19) {
                    return keyEvent.isAltPressed() ? fullScroll(33) : arrowScroll(33);
                }
                if (keyCode == 20) {
                    return keyEvent.isAltPressed() ? fullScroll(130) : arrowScroll(130);
                }
                if (keyCode == 62) {
                    pageScroll(keyEvent.isShiftPressed() ? 33 : 130);
                    return false;
                }
                if (keyCode == 92) {
                    return fullScroll(33);
                }
                if (keyCode == 93) {
                    return fullScroll(130);
                }
                if (keyCode == 122) {
                    pageScroll(33);
                    return false;
                }
                if (keyCode != 123) {
                    return false;
                }
                pageScroll(130);
                return false;
            }
        }
        if (!isFocused() || keyEvent.getKeyCode() == 4) {
            return false;
        }
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
        return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    public final boolean f(int i10, int i11, int i12) {
        boolean z10;
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z11 = i10 == 33;
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z12 = false;
        for (int i14 = 0; i14 < size; i14++) {
            View view2 = focusables.get(i14);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i11 < bottom && top < i12) {
                boolean z13 = i11 < top && bottom < i12;
                if (view == null) {
                    view = view2;
                    z12 = z13;
                } else {
                    boolean z14 = (z11 && top < view.getTop()) || (!z11 && bottom > view.getBottom());
                    if (z12) {
                        if (z13 && z14) {
                            view = view2;
                        }
                    } else if (z13) {
                        view = view2;
                        z12 = true;
                    } else if (z14) {
                        view = view2;
                    }
                }
            }
        }
        if (view == null) {
            view = this;
        }
        if (i11 < scrollY || i12 > i13) {
            g(z11 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z10 = true;
        } else {
            z10 = false;
        }
        if (view != findFocus()) {
            view.requestFocus(i10);
        }
        return z10;
    }

    public void fling(int i10) {
        if (getChildCount() > 0) {
            this.f20443s0.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            startNestedScroll(2, 1);
            this.N0 = getScrollY();
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public boolean fullScroll(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f20442r0;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            rect.bottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
            rect.top = rect.bottom - height;
        }
        return f(i10, rect.top, rect.bottom);
    }

    public final int g(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        if (i12 == 1) {
            startNestedScroll(2, i12);
        }
        boolean zDispatchNestedPreScroll = dispatchNestedPreScroll(0, i10, this.L0, this.K0, i12);
        int[] iArr = this.L0;
        int[] iArr2 = this.K0;
        if (zDispatchNestedPreScroll) {
            i13 = i10 - iArr[1];
            i14 = iArr2[1];
        } else {
            i13 = i10;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        int overScrollMode = getOverScrollMode();
        boolean z11 = (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) && !z10;
        boolean z12 = e(i13, 0, scrollY, scrollRange) && !hasNestedScrollingParent(i12);
        int scrollY2 = getScrollY() - scrollY;
        iArr[1] = 0;
        dispatchNestedScroll(0, scrollY2, 0, i13 - scrollY2, this.K0, i12, iArr);
        int i15 = i14 + iArr2[1];
        int i16 = i13 - iArr[1];
        int i17 = scrollY + i16;
        if (i17 < 0) {
            if (z11) {
                EdgeEffectCompat.onPullDistance(this.mEdgeGlowTop, (-i16) / getHeight(), i11 / getWidth());
                if (!this.mEdgeGlowBottom.isFinished()) {
                    this.mEdgeGlowBottom.onRelease();
                }
            }
        } else if (i17 > scrollRange && z11) {
            EdgeEffectCompat.onPullDistance(this.mEdgeGlowBottom, i16 / getHeight(), 1.0f - (i11 / getWidth()));
            if (!this.mEdgeGlowTop.isFinished()) {
                this.mEdgeGlowTop.onRelease();
            }
        }
        if (!this.mEdgeGlowTop.isFinished() || !this.mEdgeGlowBottom.isFinished()) {
            ViewCompat.postInvalidateOnAnimation(this);
        } else if (z12 && i12 == 0) {
            this.f20448y0.clear();
        }
        if (i12 == 1) {
            stopNestedScroll(i12);
            this.mEdgeGlowTop.onRelease();
            this.mEdgeGlowBottom.onRelease();
        }
        return i15;
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.P0.getNestedScrollAxes();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public final boolean h(@NonNull EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        float distance = EdgeEffectCompat.getDistance(edgeEffect) * getHeight();
        float fAbs = Math.abs(-i10) * 0.35f;
        float f6 = this.f20440p0 * 0.015f;
        double dLog = Math.log(fAbs / f6);
        double d2 = T0;
        return ((float) (Math.exp((d2 / (d2 - 1.0d)) * dLog) * ((double) f6))) < distance;
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean hasNestedScrollingParent(int i10) {
        return this.Q0.hasNestedScrollingParent(i10);
    }

    public final void i(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f20441q0 > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f20443s0.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, i12);
            if (z10) {
                startNestedScroll(2, 1);
            } else {
                stopNestedScroll(1);
            }
            this.N0 = getScrollY();
            ViewCompat.postInvalidateOnAnimation(this);
        } else {
            if (!this.f20443s0.isFinished()) {
                this.f20443s0.abortAnimation();
                stopNestedScroll(1);
            }
            scrollBy(i10, i11);
        }
        this.f20441q0 = AnimationUtils.currentAnimationTimeMillis();
    }

    public boolean isFillViewport() {
        return this.E0;
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean isNestedScrollingEnabled() {
        return this.Q0.isNestedScrollingEnabled();
    }

    public boolean isSmoothScrollingEnabled() {
        return this.F0;
    }

    public final boolean j(MotionEvent motionEvent) {
        boolean z10;
        if (EdgeEffectCompat.getDistance(this.mEdgeGlowTop) != 0.0f) {
            EdgeEffectCompat.onPullDistance(this.mEdgeGlowTop, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        if (EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) == 0.0f) {
            return z10;
        }
        EdgeEffectCompat.onPullDistance(this.mEdgeGlowBottom, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    @Override // android.view.ViewGroup
    public void measureChild(@NonNull View view, int i10, int i11) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft(), layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.v0 = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(@NonNull MotionEvent motionEvent) {
        int width;
        float axisValue;
        if (motionEvent.getAction() != 8 || this.f20447x0) {
            return false;
        }
        if (MotionEventCompat.isFromSource(motionEvent, 2)) {
            axisValue = motionEvent.getAxisValue(9);
            width = (int) motionEvent.getX();
        } else if (MotionEventCompat.isFromSource(motionEvent, 4194304)) {
            float axisValue2 = motionEvent.getAxisValue(26);
            width = getWidth() / 2;
            axisValue = axisValue2;
        } else {
            width = 0;
            axisValue = 0.0f;
        }
        if (axisValue == 0.0f) {
            return false;
        }
        g(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, MotionEventCompat.isFromSource(motionEvent, 8194));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:70:0x0115  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int iFindPointerIndex;
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f20447x0) {
            return true;
        }
        int i10 = action & 255;
        if (i10 == 0) {
            int y7 = (int) motionEvent.getY();
            int x4 = (int) motionEvent.getX();
            if (getChildCount() > 0) {
                int scrollY = getScrollY();
                View childAt = getChildAt(0);
                if (y7 < childAt.getTop() - scrollY || y7 >= childAt.getBottom() - scrollY || x4 < childAt.getLeft() || x4 >= childAt.getRight()) {
                    if (!j(motionEvent) && this.f20443s0.isFinished()) {
                        z10 = false;
                    }
                    this.f20447x0 = z10;
                    velocityTracker = this.f20448y0;
                    if (velocityTracker != null) {
                        velocityTracker.recycle();
                        this.f20448y0 = null;
                    }
                } else {
                    this.f20444t0 = y7;
                    this.J0 = motionEvent.getPointerId(0);
                    VelocityTracker velocityTracker3 = this.f20448y0;
                    if (velocityTracker3 == null) {
                        this.f20448y0 = VelocityTracker.obtain();
                    } else {
                        velocityTracker3.clear();
                    }
                    this.f20448y0.addMovement(motionEvent);
                    this.f20443s0.computeScrollOffset();
                    if (!j(motionEvent) && this.f20443s0.isFinished()) {
                        z10 = false;
                    }
                    this.f20447x0 = z10;
                    startNestedScroll(2, 0);
                }
            } else {
                if (!j(motionEvent)) {
                    z10 = false;
                }
                this.f20447x0 = z10;
                velocityTracker = this.f20448y0;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                    this.f20448y0 = null;
                }
            }
        } else if (i10 == 1) {
            this.f20447x0 = false;
            this.J0 = -1;
            velocityTracker2 = this.f20448y0;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f20448y0 = null;
            }
            if (this.f20443s0.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
            stopNestedScroll(0);
        } else if (i10 == 2) {
            int i11 = this.J0;
            if (i11 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i11)) != -1) {
                int y10 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y10 - this.f20444t0) > this.G0 && (2 & getNestedScrollAxes()) == 0) {
                    this.f20447x0 = true;
                    this.f20444t0 = y10;
                    if (this.f20448y0 == null) {
                        this.f20448y0 = VelocityTracker.obtain();
                    }
                    this.f20448y0.addMovement(motionEvent);
                    this.M0 = 0;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        } else if (i10 == 3) {
            this.f20447x0 = false;
            this.J0 = -1;
            velocityTracker2 = this.f20448y0;
            if (velocityTracker2 != null) {
                velocityTracker2.recycle();
                this.f20448y0 = null;
            }
            if (this.f20443s0.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                ViewCompat.postInvalidateOnAnimation(this);
            }
            stopNestedScroll(0);
        } else if (i10 == 6) {
            d(motionEvent);
        }
        return this.f20447x0;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredHeight;
        super.onLayout(z10, i10, i11, i12, i13);
        int i14 = 0;
        this.f20445u0 = false;
        View view = this.f20446w0;
        if (view != null && a(view, this)) {
            View view2 = this.f20446w0;
            Rect rect = this.f20442r0;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
            if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
                scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
            }
        }
        this.f20446w0 = null;
        if (!this.v0) {
            if (this.O0 != null) {
                scrollTo(getScrollX(), this.O0.f20449p0);
                this.O0 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            } else {
                measuredHeight = 0;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            if (paddingTop < measuredHeight && scrollY >= 0) {
                i14 = paddingTop + scrollY > measuredHeight ? measuredHeight - paddingTop : scrollY;
            }
            if (i14 != scrollY) {
                scrollTo(getScrollX(), i14);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.v0 = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.E0 && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingRight() + getPaddingLeft() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(@NonNull View view, float f6, float f10, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f10, true);
        fling((int) f10);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(@NonNull View view, float f6, float f10) {
        return dispatchNestedPreFling(f6, f10);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(@NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
        dispatchNestedPreScroll(i10, i11, iArr, null, i12);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(@NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
        c(i13, i14, iArr);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i10, int i11) {
        this.P0.onNestedScrollAccepted(view, view2, i10, i11);
        startNestedScroll(2, i11);
    }

    @Override // android.view.View
    public void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus == null || (true ^ b(viewFindNextFocus, 0, getHeight()))) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i10, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.O0 = savedState;
        requestLayout();
    }

    @Override // android.view.View
    @NonNull
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f20449p0 = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        OnScrollChangeListener onScrollChangeListener = this.S0;
        if (onScrollChangeListener != null) {
            onScrollChangeListener.onScrollChange(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !b(viewFindFocus, 0, i13)) {
            return;
        }
        Rect rect = this.f20442r0;
        viewFindFocus.getDrawingRect(rect);
        offsetDescendantRectToMyCoords(viewFindFocus, rect);
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
            if (this.F0) {
                smoothScrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
            } else {
                scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
            }
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(@NonNull View view, int i10) {
        this.P0.onStopNestedScroll(view, i10);
        stopNestedScroll(i10);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0111  */
    /* JADX WARN: Code duplicated, block: B:56:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x012e  */
    /* JADX WARN: Code duplicated, block: B:60:0x0132  */
    /* JADX WARN: Code duplicated, block: B:63:0x0139  */
    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        ViewParent parent;
        float fOnPullDistance;
        int iRound;
        int i10;
        ViewParent parent2;
        if (this.f20448y0 == null) {
            this.f20448y0 = VelocityTracker.obtain();
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.M0 = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        float f6 = 0.0f;
        motionEventObtain.offsetLocation(0.0f, this.M0);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f20448y0;
                velocityTracker.computeCurrentVelocity(1000, this.I0);
                int yVelocity = (int) velocityTracker.getYVelocity(this.J0);
                if (Math.abs(yVelocity) >= this.H0) {
                    if (EdgeEffectCompat.getDistance(this.mEdgeGlowTop) != 0.0f) {
                        if (h(this.mEdgeGlowTop, yVelocity)) {
                            this.mEdgeGlowTop.onAbsorb(yVelocity);
                        } else {
                            fling(-yVelocity);
                        }
                    } else if (EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) != 0.0f) {
                        int i11 = -yVelocity;
                        if (h(this.mEdgeGlowBottom, i11)) {
                            this.mEdgeGlowBottom.onAbsorb(i11);
                        } else {
                            fling(i11);
                        }
                    } else {
                        int i12 = -yVelocity;
                        float f10 = i12;
                        if (!dispatchNestedPreFling(0.0f, f10)) {
                            dispatchNestedFling(0.0f, f10, true);
                            fling(i12);
                        }
                    }
                } else if (this.f20443s0.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
                this.J0 = -1;
                this.f20447x0 = false;
                VelocityTracker velocityTracker2 = this.f20448y0;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f20448y0 = null;
                }
                stopNestedScroll(0);
                this.mEdgeGlowTop.onRelease();
                this.mEdgeGlowBottom.onRelease();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.J0);
                if (iFindPointerIndex != -1) {
                    int y7 = (int) motionEvent.getY(iFindPointerIndex);
                    int i13 = this.f20444t0 - y7;
                    float x4 = motionEvent.getX(iFindPointerIndex) / getWidth();
                    float height = i13 / getHeight();
                    if (EdgeEffectCompat.getDistance(this.mEdgeGlowTop) != 0.0f) {
                        fOnPullDistance = -EdgeEffectCompat.onPullDistance(this.mEdgeGlowTop, -height, x4);
                        if (EdgeEffectCompat.getDistance(this.mEdgeGlowTop) == 0.0f) {
                            this.mEdgeGlowTop.onRelease();
                        }
                    } else if (EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) != 0.0f) {
                        fOnPullDistance = EdgeEffectCompat.onPullDistance(this.mEdgeGlowBottom, height, 1.0f - x4);
                        if (EdgeEffectCompat.getDistance(this.mEdgeGlowBottom) == 0.0f) {
                            this.mEdgeGlowBottom.onRelease();
                        }
                    } else {
                        iRound = Math.round(f6 * getHeight());
                        if (iRound != 0) {
                            invalidate();
                        }
                        i10 = i13 - iRound;
                        if (!this.f20447x0 && Math.abs(i10) > this.G0) {
                            parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f20447x0 = true;
                            if (i10 > 0) {
                                i10 -= this.G0;
                            } else {
                                i10 += this.G0;
                            }
                        }
                        if (this.f20447x0) {
                            int iG = g(i10, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            this.f20444t0 = y7 - iG;
                            this.M0 += iG;
                        }
                    }
                    f6 = fOnPullDistance;
                    iRound = Math.round(f6 * getHeight());
                    if (iRound != 0) {
                        invalidate();
                    }
                    i10 = i13 - iRound;
                    if (!this.f20447x0) {
                        parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f20447x0 = true;
                        if (i10 > 0) {
                            i10 -= this.G0;
                        } else {
                            i10 += this.G0;
                        }
                    }
                    if (this.f20447x0) {
                        int iG2 = g(i10, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f20444t0 = y7 - iG2;
                        this.M0 += iG2;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f20447x0 && getChildCount() > 0 && this.f20443s0.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
                this.J0 = -1;
                this.f20447x0 = false;
                VelocityTracker velocityTracker3 = this.f20448y0;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f20448y0 = null;
                }
                stopNestedScroll(0);
                this.mEdgeGlowTop.onRelease();
                this.mEdgeGlowBottom.onRelease();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f20444t0 = (int) motionEvent.getY(actionIndex);
                this.J0 = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                d(motionEvent);
                this.f20444t0 = (int) motionEvent.getY(motionEvent.findPointerIndex(this.J0));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f20447x0 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f20443s0.isFinished()) {
                this.f20443s0.abortAnimation();
                stopNestedScroll(1);
            }
            int y10 = (int) motionEvent.getY();
            int pointerId = motionEvent.getPointerId(0);
            this.f20444t0 = y10;
            this.J0 = pointerId;
            startNestedScroll(2, 0);
        }
        VelocityTracker velocityTracker4 = this.f20448y0;
        if (velocityTracker4 != null) {
            velocityTracker4.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public boolean pageScroll(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f20442r0;
        if (z10) {
            rect.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int paddingBottom = getPaddingBottom() + childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
                if (rect.top + height > paddingBottom) {
                    rect.top = paddingBottom - height;
                }
            }
        } else {
            rect.top = getScrollY() - height;
            if (rect.top < 0) {
                rect.top = 0;
            }
        }
        int i11 = rect.top;
        int i12 = height + i11;
        rect.bottom = i12;
        return f(i10, i11, i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f20445u0) {
            this.f20446w0 = view2;
        } else {
            Rect rect = this.f20442r0;
            view2.getDrawingRect(rect);
            offsetDescendantRectToMyCoords(view2, rect);
            int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
            if (iComputeScrollDeltaToGetChildRectOnScreen != 0) {
                scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
            }
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(@NonNull View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        int iComputeScrollDeltaToGetChildRectOnScreen = computeScrollDeltaToGetChildRectOnScreen(rect);
        boolean z11 = iComputeScrollDeltaToGetChildRectOnScreen != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
            } else {
                smoothScrollBy(0, iComputeScrollDeltaToGetChildRectOnScreen);
            }
        }
        return z11;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        VelocityTracker velocityTracker;
        if (z10 && (velocityTracker = this.f20448y0) != null) {
            velocityTracker.recycle();
            this.f20448y0 = null;
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f20445u0 = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (width >= width2 || i10 < 0) {
                i10 = 0;
            } else if (width + i10 > width2) {
                i10 = width2 - width;
            }
            if (height >= height2 || i11 < 0) {
                i11 = 0;
            } else if (height + i11 > height2) {
                i11 = height2 - height;
            }
            if (i10 == getScrollX() && i11 == getScrollY()) {
                return;
            }
            super.scrollTo(i10, i11);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.E0) {
            this.E0 = z10;
            requestLayout();
        }
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void setNestedScrollingEnabled(boolean z10) {
        this.Q0.setNestedScrollingEnabled(z10);
    }

    public void setOnScrollChangeListener(@Nullable OnScrollChangeListener onScrollChangeListener) {
        this.S0 = onScrollChangeListener;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.F0 = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public final void smoothScrollBy(int i10, int i11) {
        i(i10, i11, 250, false);
    }

    public final void smoothScrollTo(int i10, int i11) {
        i(i10 - getScrollX(), i11 - getScrollY(), 250, false);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean startNestedScroll(int i10, int i11) {
        return this.Q0.startNestedScroll(i10, i11);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public void stopNestedScroll(int i10) {
        this.Q0.stopNestedScroll(i10);
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.R.attr.nestedScrollViewStyle);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedPreScroll(int i10, int i11, @Nullable int[] iArr, @Nullable int[] iArr2) {
        return dispatchNestedPreScroll(i10, i11, iArr, iArr2, 0);
    }

    @Override // androidx.core.view.NestedScrollingChild2
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, @Nullable int[] iArr, int i14) {
        return this.Q0.dispatchNestedScroll(i10, i11, i12, i13, iArr, i14);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedPreScroll(@NonNull View view, int i10, int i11, @NonNull int[] iArr) {
        onNestedPreScroll(view, i10, i11, iArr, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(@NonNull View view, int i10, int i11, int i12, int i13, int i14) {
        c(i13, i14, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i10) {
        return onStartNestedScroll(view, view2, i10, 0);
    }

    public final void smoothScrollBy(int i10, int i11, int i12) {
        i(i10, i11, i12, false);
    }

    public final void smoothScrollTo(int i10, int i11, int i12) {
        i(i10 - getScrollX(), i11 - getScrollY(), i12, false);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean startNestedScroll(int i10) {
        return startNestedScroll(i10, 0);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public NestedScrollView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f20442r0 = new Rect();
        this.f20445u0 = true;
        this.v0 = false;
        this.f20446w0 = null;
        this.f20447x0 = false;
        this.F0 = true;
        this.J0 = -1;
        this.K0 = new int[2];
        this.L0 = new int[2];
        this.mEdgeGlowTop = EdgeEffectCompat.create(context, attributeSet);
        this.mEdgeGlowBottom = EdgeEffectCompat.create(context, attributeSet);
        this.f20440p0 = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        this.f20443s0 = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.G0 = viewConfiguration.getScaledTouchSlop();
        this.H0 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.I0 = viewConfiguration.getScaledMaximumFlingVelocity();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, V0, i10, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.P0 = new NestedScrollingParentHelper(this);
        this.Q0 = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        ViewCompat.setAccessibilityDelegate(this, U0);
    }

    @Override // android.view.View, androidx.core.view.NestedScrollingChild
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, @Nullable int[] iArr) {
        return this.Q0.dispatchNestedScroll(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScroll(@NonNull View view, int i10, int i11, int i12, int i13) {
        c(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i10) {
        onNestedScrollAccepted(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public void onStopNestedScroll(@NonNull View view) {
        onStopNestedScroll(view, 0);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
