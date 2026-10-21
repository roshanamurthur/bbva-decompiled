package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import androidx.appcompat.graphics.drawable.DrawableWrapperCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.ListViewAutoScrollHelper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: DropDownListView.java */
/* JADX INFO: loaded from: classes.dex */
public class r0 extends ListView {
    public static final int INVALID_POSITION = -1;
    public static final int NO_POSITION = -1;
    public ListViewAutoScrollHelper E0;
    public f F0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Rect f1660p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public int f1661q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f1662r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f1663s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f1664t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f1665u0;
    public d v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f1666w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final boolean f1667x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f1668y0;

    /* JADX INFO: compiled from: DropDownListView.java */
    @RequiresApi(21)
    public static class a {
        @DoNotInline
        public static void a(View view, float f6, float f10) {
            view.drawableHotspotChanged(f6, f10);
        }
    }

    /* JADX INFO: compiled from: DropDownListView.java */
    @RequiresApi(30)
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Method f1669a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f1670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f1671c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final boolean f1672d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, Boolean.TYPE, cls2, cls2);
                f1669a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f1670b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f1671c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f1672d = true;
            } catch (NoSuchMethodException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: DropDownListView.java */
    @RequiresApi(33)
    public static class c {
        @DoNotInline
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        @DoNotInline
        public static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    /* JADX INFO: compiled from: DropDownListView.java */
    public static class d extends DrawableWrapperCompat {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f1673q0;

        public d(Drawable drawable) {
            super(drawable);
            this.f1673q0 = true;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public final void draw(@NonNull Canvas canvas) {
            if (this.f1673q0) {
                super.draw(canvas);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public final void setHotspot(float f6, float f10) {
            if (this.f1673q0) {
                super.setHotspot(f6, f10);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public final void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f1673q0) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public final boolean setState(int[] iArr) {
            if (this.f1673q0) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableWrapperCompat, android.graphics.drawable.Drawable
        public final boolean setVisible(boolean z10, boolean z11) {
            if (this.f1673q0) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: DropDownListView.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Field f1674a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e5) {
                e5.printStackTrace();
            }
            f1674a = declaredField;
        }
    }

    /* JADX INFO: compiled from: DropDownListView.java */
    public class f implements Runnable {
        public f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            r0 r0Var = r0.this;
            r0Var.F0 = null;
            r0Var.drawableStateChanged();
        }
    }

    public r0(@NonNull Context context, boolean z10) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.f1660p0 = new Rect();
        this.f1661q0 = 0;
        this.f1662r0 = 0;
        this.f1663s0 = 0;
        this.f1664t0 = 0;
        this.f1667x0 = z10;
        setCacheColorHint(0);
    }

    private void setSelectorEnabled(boolean z10) {
        d dVar = this.v0;
        if (dVar != null) {
            dVar.f1673q0 = z10;
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        Rect rect = this.f1660p0;
        if (!rect.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(rect);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.F0 != null) {
            return;
        }
        super.drawableStateChanged();
        setSelectorEnabled(true);
        Drawable selector = getSelector();
        if (selector != null && this.f1668y0 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f1667x0 || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f1667x0 || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f1667x0 || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f1667x0 && this.f1666w0) || super.isInTouchMode();
    }

    public int lookForSelectablePosition(int i10, boolean z10) {
        int iMin;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z10) {
                    iMin = Math.max(0, i10);
                    while (iMin < count && !adapter.isEnabled(iMin)) {
                        iMin++;
                    }
                } else {
                    iMin = Math.min(i10, count - 1);
                    while (iMin >= 0 && !adapter.isEnabled(iMin)) {
                        iMin--;
                    }
                }
                if (iMin < 0 || iMin >= count) {
                    return -1;
                }
                return iMin;
            }
            if (i10 >= 0 && i10 < count) {
                return i10;
            }
        }
        return -1;
    }

    public int measureHeightOfChildrenCompat(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        View view = null;
        while (i15 < count) {
            int itemViewType = adapter.getItemViewType(i15);
            if (itemViewType != i16) {
                view = null;
                i16 = itemViewType;
            }
            view = adapter.getView(i15, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i18 = layoutParams.height;
            view.measure(i10, i18 > 0 ? View.MeasureSpec.makeMeasureSpec(i18, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i15 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i13) {
                return (i14 < 0 || i15 <= i14 || i17 <= 0 || measuredHeight == i13) ? i13 : i17;
            }
            if (i14 >= 0 && i15 >= i14) {
                i17 = measuredHeight;
            }
            i15++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.F0 = null;
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Code duplicated, block: B:82:0x0148  */
    /* JADX WARN: Code duplicated, block: B:84:0x015e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0163  */
    /* JADX WARN: Code duplicated, block: B:88:0x0167  */
    /* JADX WARN: Code duplicated, block: B:90:0x0179  */
    /* JADX WARN: Code duplicated, block: B:92:0x017d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0015  */
    public boolean onForwardedEvent(MotionEvent motionEvent, int i10) {
        boolean z10;
        boolean zA;
        boolean z11;
        View childAt;
        View childAt2;
        ListViewAutoScrollHelper listViewAutoScrollHelper;
        int actionMasked = motionEvent.getActionMasked();
        boolean z12 = false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                z10 = true;
            } else if (actionMasked != 3) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10 || z12) {
                this.f1668y0 = false;
                setPressed(false);
                drawableStateChanged();
                childAt2 = getChildAt(this.f1665u0 - getFirstVisiblePosition());
                if (childAt2 != null) {
                    childAt2.setPressed(false);
                }
            }
            if (z10) {
                if (this.E0 == null) {
                    this.E0 = new ListViewAutoScrollHelper(this);
                }
                this.E0.setEnabled(true);
                this.E0.onTouch(this, motionEvent);
            } else {
                listViewAutoScrollHelper = this.E0;
                if (listViewAutoScrollHelper != null) {
                    listViewAutoScrollHelper.setEnabled(false);
                }
            }
            return z10;
        }
        z10 = false;
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex < 0) {
            z10 = false;
        } else {
            int x4 = (int) motionEvent.getX(iFindPointerIndex);
            int y7 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x4, y7);
            if (iPointToPosition == -1) {
                z12 = true;
            } else {
                View childAt3 = getChildAt(iPointToPosition - getFirstVisiblePosition());
                float f6 = x4;
                float f10 = y7;
                this.f1668y0 = true;
                int i11 = Build.VERSION.SDK_INT;
                a.a(this, f6, f10);
                if (!isPressed()) {
                    setPressed(true);
                }
                layoutChildren();
                int i12 = this.f1665u0;
                if (i12 != -1 && (childAt = getChildAt(i12 - getFirstVisiblePosition())) != null && childAt != childAt3 && childAt.isPressed()) {
                    childAt.setPressed(false);
                }
                this.f1665u0 = iPointToPosition;
                a.a(childAt3, f6 - childAt3.getLeft(), f10 - childAt3.getTop());
                if (!childAt3.isPressed()) {
                    childAt3.setPressed(true);
                }
                Drawable selector = getSelector();
                boolean z13 = (selector == null || iPointToPosition == -1) ? false : true;
                if (z13) {
                    selector.setVisible(false, false);
                }
                int left = childAt3.getLeft();
                int top = childAt3.getTop();
                int right = childAt3.getRight();
                int bottom = childAt3.getBottom();
                Rect rect = this.f1660p0;
                rect.set(left, top, right, bottom);
                rect.left -= this.f1661q0;
                rect.top -= this.f1662r0;
                rect.right += this.f1663s0;
                rect.bottom += this.f1664t0;
                if (i11 >= 33) {
                    zA = c.a(this);
                } else {
                    Field field = e.f1674a;
                    if (field != null) {
                        try {
                            zA = field.getBoolean(this);
                        } catch (IllegalAccessException e5) {
                            e5.printStackTrace();
                            zA = false;
                        }
                    } else {
                        zA = false;
                    }
                }
                if (childAt3.isEnabled() != zA) {
                    boolean z14 = !zA;
                    if (Build.VERSION.SDK_INT >= 33) {
                        c.b(this, z14);
                    } else {
                        Field field2 = e.f1674a;
                        if (field2 != null) {
                            try {
                                field2.set(this, Boolean.valueOf(z14));
                            } catch (IllegalAccessException e7) {
                                e7.printStackTrace();
                            }
                        }
                    }
                    if (iPointToPosition != -1) {
                        refreshDrawableState();
                    }
                }
                if (z13) {
                    float fExactCenterX = rect.exactCenterX();
                    float fExactCenterY = rect.exactCenterY();
                    z11 = false;
                    selector.setVisible(getVisibility() == 0, false);
                    DrawableCompat.setHotspot(selector, fExactCenterX, fExactCenterY);
                } else {
                    z11 = false;
                }
                Drawable selector2 = getSelector();
                if (selector2 != null && iPointToPosition != -1) {
                    DrawableCompat.setHotspot(selector2, f6, f10);
                }
                setSelectorEnabled(z11);
                refreshDrawableState();
                if (actionMasked == 1) {
                    performItemClick(childAt3, iPointToPosition, getItemIdAtPosition(iPointToPosition));
                }
                z10 = true;
                z12 = false;
            }
        }
        if (z10) {
            this.f1668y0 = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f1665u0 - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        } else {
            this.f1668y0 = false;
            setPressed(false);
            drawableStateChanged();
            childAt2 = getChildAt(this.f1665u0 - getFirstVisiblePosition());
            if (childAt2 != null) {
                childAt2.setPressed(false);
            }
        }
        if (z10) {
            if (this.E0 == null) {
                this.E0 = new ListViewAutoScrollHelper(this);
            }
            this.E0.setEnabled(true);
            this.E0.onTouch(this, motionEvent);
        } else {
            listViewAutoScrollHelper = this.E0;
            if (listViewAutoScrollHelper != null) {
                listViewAutoScrollHelper.setEnabled(false);
            }
        }
        return z10;
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.F0 == null) {
            f fVar = new f();
            this.F0 = fVar;
            post(fVar);
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    requestFocus();
                    if (i10 < 30 || !b.f1672d) {
                        setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                    } else {
                        try {
                            b.f1669a.invoke(this, Integer.valueOf(iPointToPosition), childAt, Boolean.FALSE, -1, -1);
                            b.f1670b.invoke(this, Integer.valueOf(iPointToPosition));
                            b.f1671c.invoke(this, Integer.valueOf(iPointToPosition));
                        } catch (IllegalAccessException e5) {
                            e5.printStackTrace();
                        } catch (InvocationTargetException e7) {
                            e7.printStackTrace();
                        }
                    }
                }
                Drawable selector = getSelector();
                if (selector != null && this.f1668y0 && isPressed()) {
                    selector.setState(getDrawableState());
                }
            }
        } else {
            setSelection(-1);
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f1665u0 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.F0;
        if (fVar != null) {
            r0 r0Var = r0.this;
            r0Var.F0 = null;
            r0Var.removeCallbacks(fVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z10) {
        this.f1666w0 = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.v0 = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f1661q0 = rect.left;
        this.f1662r0 = rect.top;
        this.f1663s0 = rect.right;
        this.f1664t0 = rect.bottom;
    }
}
