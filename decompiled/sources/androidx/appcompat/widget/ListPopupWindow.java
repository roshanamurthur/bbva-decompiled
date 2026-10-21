package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.AttrRes;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.ShowableListMenu;
import androidx.core.widget.PopupWindowCompat;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class ListPopupWindow implements ShowableListMenu {
    public static final int INPUT_METHOD_FROM_FOCUSABLE = 0;
    public static final int INPUT_METHOD_NEEDED = 1;
    public static final int INPUT_METHOD_NOT_NEEDED = 2;
    public static final int MATCH_PARENT = -1;
    public static final int POSITION_PROMPT_ABOVE = 0;
    public static final int POSITION_PROMPT_BELOW = 1;
    public static final int WRAP_CONTENT = -2;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final Method f1327a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final Method f1328b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final Method f1329c1;
    public boolean E0;
    public int F0;
    public boolean G0;
    public boolean H0;
    public final int I0;
    public View J0;
    public int K0;
    public e L0;
    public View M0;
    public Drawable N0;
    public AdapterView.OnItemClickListener O0;
    public AdapterView.OnItemSelectedListener P0;
    public final h Q0;
    public final g R0;
    public final f S0;
    public final d T0;
    public g1 U0;
    public final Handler V0;
    public final Rect W0;
    public Rect X0;
    public boolean Y0;
    public final b0 Z0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Context f1330p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ListAdapter f1331q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public r0 f1332r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f1333s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public int f1334t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f1335u0;
    public int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f1336w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public boolean f1337x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public boolean f1338y0;

    public class a extends ForwardingListener {
        public a(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.ForwardingListener
        public final ShowableListMenu getPopup() {
            return ListPopupWindow.this;
        }
    }

    @RequiresApi(24)
    public static class b {
        @DoNotInline
        public static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    @RequiresApi(29)
    public static class c {
        @DoNotInline
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @DoNotInline
        public static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ListPopupWindow.this.clearListSelection();
        }
    }

    public class e extends DataSetObserver {
        public e() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (listPopupWindow.isShowing()) {
                listPopupWindow.show();
            }
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            ListPopupWindow.this.dismiss();
        }
    }

    public class g implements View.OnTouchListener {
        public g() {
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            b0 b0Var;
            int action = motionEvent.getAction();
            int x4 = (int) motionEvent.getX();
            int y7 = (int) motionEvent.getY();
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            if (action == 0 && (b0Var = listPopupWindow.Z0) != null && b0Var.isShowing() && x4 >= 0 && x4 < listPopupWindow.Z0.getWidth() && y7 >= 0 && y7 < listPopupWindow.Z0.getHeight()) {
                listPopupWindow.V0.postDelayed(listPopupWindow.Q0, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            listPopupWindow.V0.removeCallbacks(listPopupWindow.Q0);
            return false;
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            ListPopupWindow listPopupWindow = ListPopupWindow.this;
            r0 r0Var = listPopupWindow.f1332r0;
            if (r0Var == null || !r0Var.isAttachedToWindow() || listPopupWindow.f1332r0.getCount() <= listPopupWindow.f1332r0.getChildCount() || listPopupWindow.f1332r0.getChildCount() > listPopupWindow.I0) {
                return;
            }
            listPopupWindow.Z0.setInputMethodMode(2);
            listPopupWindow.show();
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f1327a1 = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
            }
            try {
                f1329c1 = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            try {
                f1328b1 = PopupWindow.class.getDeclaredMethod("getMaxAvailableHeight", View.class, Integer.TYPE, Boolean.TYPE);
            } catch (NoSuchMethodException unused3) {
            }
        }
    }

    public ListPopupWindow(@NonNull Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    public void clearListSelection() {
        r0 r0Var = this.f1332r0;
        if (r0Var != null) {
            r0Var.setListSelectionHidden(true);
            r0Var.requestLayout();
        }
    }

    public View.OnTouchListener createDragToOpenListener(View view) {
        return new a(view);
    }

    @NonNull
    public r0 d(Context context, boolean z10) {
        return new r0(context, z10);
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void dismiss() {
        b0 b0Var = this.Z0;
        b0Var.dismiss();
        View view = this.J0;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.J0);
            }
        }
        b0Var.setContentView(null);
        this.f1332r0 = null;
        this.V0.removeCallbacks(this.Q0);
    }

    @Nullable
    public View getAnchorView() {
        return this.M0;
    }

    @StyleRes
    public int getAnimationStyle() {
        return this.Z0.getAnimationStyle();
    }

    @Nullable
    public Drawable getBackground() {
        return this.Z0.getBackground();
    }

    @Nullable
    public Rect getEpicenterBounds() {
        if (this.X0 != null) {
            return new Rect(this.X0);
        }
        return null;
    }

    public int getHeight() {
        return this.f1333s0;
    }

    public int getHorizontalOffset() {
        return this.f1335u0;
    }

    public int getInputMethodMode() {
        return this.Z0.getInputMethodMode();
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    @Nullable
    public ListView getListView() {
        return this.f1332r0;
    }

    public int getPromptPosition() {
        return this.K0;
    }

    @Nullable
    public Object getSelectedItem() {
        if (isShowing()) {
            return this.f1332r0.getSelectedItem();
        }
        return null;
    }

    public long getSelectedItemId() {
        if (isShowing()) {
            return this.f1332r0.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int getSelectedItemPosition() {
        if (isShowing()) {
            return this.f1332r0.getSelectedItemPosition();
        }
        return -1;
    }

    @Nullable
    public View getSelectedView() {
        if (isShowing()) {
            return this.f1332r0.getSelectedView();
        }
        return null;
    }

    public int getSoftInputMode() {
        return this.Z0.getSoftInputMode();
    }

    public int getVerticalOffset() {
        if (this.f1337x0) {
            return this.v0;
        }
        return 0;
    }

    public int getWidth() {
        return this.f1334t0;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean isDropDownAlwaysVisible() {
        return this.G0;
    }

    public boolean isInputMethodNotNeeded() {
        return this.Z0.getInputMethodMode() == 2;
    }

    public boolean isModal() {
        return this.Y0;
    }

    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public boolean isShowing() {
        return this.Z0.isShowing();
    }

    public boolean onKeyDown(int i10, @NonNull KeyEvent keyEvent) {
        int iLookForSelectablePosition;
        int count;
        if (isShowing() && i10 != 62 && (this.f1332r0.getSelectedItemPosition() >= 0 || (i10 != 66 && i10 != 23))) {
            int selectedItemPosition = this.f1332r0.getSelectedItemPosition();
            b0 b0Var = this.Z0;
            boolean z10 = !b0Var.isAboveAnchor();
            ListAdapter listAdapter = this.f1331q0;
            if (listAdapter != null) {
                boolean zAreAllItemsEnabled = listAdapter.areAllItemsEnabled();
                iLookForSelectablePosition = zAreAllItemsEnabled ? 0 : this.f1332r0.lookForSelectablePosition(0, true);
                count = zAreAllItemsEnabled ? listAdapter.getCount() - 1 : this.f1332r0.lookForSelectablePosition(listAdapter.getCount() - 1, false);
            } else {
                iLookForSelectablePosition = Integer.MAX_VALUE;
                count = Integer.MIN_VALUE;
            }
            if ((z10 && i10 == 19 && selectedItemPosition <= iLookForSelectablePosition) || (!z10 && i10 == 20 && selectedItemPosition >= count)) {
                clearListSelection();
                b0Var.setInputMethodMode(1);
                show();
                return true;
            }
            this.f1332r0.setListSelectionHidden(false);
            if (this.f1332r0.onKeyDown(i10, keyEvent)) {
                b0Var.setInputMethodMode(2);
                this.f1332r0.requestFocusFromTouch();
                show();
                if (i10 == 19 || i10 == 20 || i10 == 23 || i10 == 66) {
                    return true;
                }
            } else if (z10 && i10 == 20) {
                if (selectedItemPosition == count) {
                    return true;
                }
            } else if (!z10 && i10 == 19 && selectedItemPosition == iLookForSelectablePosition) {
                return true;
            }
        }
        return false;
    }

    public boolean onKeyPreIme(int i10, @NonNull KeyEvent keyEvent) {
        if (i10 != 4 || !isShowing()) {
            return false;
        }
        View view = this.M0;
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
        if (keyDispatcherState2 != null) {
            keyDispatcherState2.handleUpEvent(keyEvent);
        }
        if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        dismiss();
        return true;
    }

    public boolean onKeyUp(int i10, @NonNull KeyEvent keyEvent) {
        if (!isShowing() || this.f1332r0.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean zOnKeyUp = this.f1332r0.onKeyUp(i10, keyEvent);
        if (zOnKeyUp && (i10 == 66 || i10 == 23)) {
            dismiss();
        }
        return zOnKeyUp;
    }

    public boolean performItemClick(int i10) {
        if (!isShowing()) {
            return false;
        }
        if (this.O0 == null) {
            return true;
        }
        r0 r0Var = this.f1332r0;
        this.O0.onItemClick(r0Var, r0Var.getChildAt(i10 - r0Var.getFirstVisiblePosition()), i10, r0Var.getAdapter().getItemId(i10));
        return true;
    }

    public void postShow() {
        this.V0.post(this.U0);
    }

    public void setAdapter(@Nullable ListAdapter listAdapter) {
        e eVar = this.L0;
        if (eVar == null) {
            this.L0 = new e();
        } else {
            ListAdapter listAdapter2 = this.f1331q0;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(eVar);
            }
        }
        this.f1331q0 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.L0);
        }
        r0 r0Var = this.f1332r0;
        if (r0Var != null) {
            r0Var.setAdapter(this.f1331q0);
        }
    }

    public void setAnchorView(@Nullable View view) {
        this.M0 = view;
    }

    public void setAnimationStyle(@StyleRes int i10) {
        this.Z0.setAnimationStyle(i10);
    }

    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        this.Z0.setBackgroundDrawable(drawable);
    }

    public void setContentWidth(int i10) {
        Drawable background = this.Z0.getBackground();
        if (background == null) {
            setWidth(i10);
            return;
        }
        Rect rect = this.W0;
        background.getPadding(rect);
        this.f1334t0 = rect.left + rect.right + i10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setDropDownAlwaysVisible(boolean z10) {
        this.G0 = z10;
    }

    public void setDropDownGravity(int i10) {
        this.F0 = i10;
    }

    public void setEpicenterBounds(@Nullable Rect rect) {
        this.X0 = rect != null ? new Rect(rect) : null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setForceIgnoreOutsideTouch(boolean z10) {
        this.H0 = z10;
    }

    public void setHeight(int i10) {
        if (i10 < 0 && -2 != i10 && -1 != i10) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.f1333s0 = i10;
    }

    public void setHorizontalOffset(int i10) {
        this.f1335u0 = i10;
    }

    public void setInputMethodMode(int i10) {
        this.Z0.setInputMethodMode(i10);
    }

    public void setListSelector(Drawable drawable) {
        this.N0 = drawable;
    }

    public void setModal(boolean z10) {
        this.Y0 = z10;
        this.Z0.setFocusable(z10);
    }

    public void setOnDismissListener(@Nullable PopupWindow.OnDismissListener onDismissListener) {
        this.Z0.setOnDismissListener(onDismissListener);
    }

    public void setOnItemClickListener(@Nullable AdapterView.OnItemClickListener onItemClickListener) {
        this.O0 = onItemClickListener;
    }

    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.P0 = onItemSelectedListener;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void setOverlapAnchor(boolean z10) {
        this.E0 = true;
        this.f1338y0 = z10;
    }

    public void setPromptPosition(int i10) {
        this.K0 = i10;
    }

    public void setPromptView(@Nullable View view) {
        View view2;
        boolean zIsShowing = isShowing();
        if (zIsShowing && (view2 = this.J0) != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.J0);
            }
        }
        this.J0 = view;
        if (zIsShowing) {
            show();
        }
    }

    public void setSelection(int i10) {
        r0 r0Var = this.f1332r0;
        if (!isShowing() || r0Var == null) {
            return;
        }
        r0Var.setListSelectionHidden(false);
        r0Var.setSelection(i10);
        if (r0Var.getChoiceMode() != 0) {
            r0Var.setItemChecked(i10, true);
        }
    }

    public void setSoftInputMode(int i10) {
        this.Z0.setSoftInputMode(i10);
    }

    public void setVerticalOffset(int i10) {
        this.v0 = i10;
        this.f1337x0 = true;
    }

    public void setWidth(int i10) {
        this.f1334t0 = i10;
    }

    public void setWindowLayoutType(int i10) {
        this.f1336w0 = i10;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // androidx.appcompat.view.menu.ShowableListMenu
    public void show() {
        int measuredHeight;
        int i10;
        int iA;
        int i11;
        int iMakeMeasureSpec;
        View view;
        int i12;
        r0 r0Var = this.f1332r0;
        b0 b0Var = this.Z0;
        Context context = this.f1330p0;
        if (r0Var == null) {
            this.U0 = new g1(this);
            r0 r0VarD = d(context, !this.Y0);
            this.f1332r0 = r0VarD;
            Drawable drawable = this.N0;
            if (drawable != null) {
                r0VarD.setSelector(drawable);
            }
            this.f1332r0.setAdapter(this.f1331q0);
            this.f1332r0.setOnItemClickListener(this.O0);
            this.f1332r0.setFocusable(true);
            this.f1332r0.setFocusableInTouchMode(true);
            this.f1332r0.setOnItemSelectedListener(new h1(this));
            this.f1332r0.setOnScrollListener(this.S0);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.P0;
            if (onItemSelectedListener != null) {
                this.f1332r0.setOnItemSelectedListener(onItemSelectedListener);
            }
            r0 r0Var2 = this.f1332r0;
            View view2 = this.J0;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i13 = this.K0;
                if (i13 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(r0Var2, layoutParams);
                } else if (i13 == 1) {
                    linearLayout.addView(r0Var2, layoutParams);
                    linearLayout.addView(view2);
                }
                int i14 = this.f1334t0;
                if (i14 >= 0) {
                    i12 = Integer.MIN_VALUE;
                } else {
                    i14 = 0;
                    i12 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i14, i12), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = r0Var2;
            }
            b0Var.setContentView(view);
        } else {
            View view3 = this.J0;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = layoutParams3.bottomMargin + view3.getMeasuredHeight() + layoutParams3.topMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = b0Var.getBackground();
        Rect rect = this.W0;
        if (background != null) {
            background.getPadding(rect);
            int i15 = rect.top;
            i10 = rect.bottom + i15;
            if (!this.f1337x0) {
                this.v0 = -i15;
            }
        } else {
            rect.setEmpty();
            i10 = 0;
        }
        boolean z10 = b0Var.getInputMethodMode() == 2;
        View anchorView = getAnchorView();
        int i16 = this.v0;
        if (Build.VERSION.SDK_INT <= 23) {
            Method method = f1328b1;
            if (method != null) {
                try {
                    iA = ((Integer) method.invoke(b0Var, anchorView, Integer.valueOf(i16), Boolean.valueOf(z10))).intValue();
                } catch (Exception unused) {
                    iA = b0Var.getMaxAvailableHeight(anchorView, i16);
                }
            } else {
                iA = b0Var.getMaxAvailableHeight(anchorView, i16);
            }
        } else {
            iA = b.a(b0Var, anchorView, i16, z10);
        }
        if (this.G0 || this.f1333s0 == -1) {
            i11 = iA + i10;
        } else {
            int i17 = this.f1334t0;
            if (i17 != -2) {
                iMakeMeasureSpec = i17 != -1 ? View.MeasureSpec.makeMeasureSpec(i17, 1073741824) : View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), 1073741824);
            } else {
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(context.getResources().getDisplayMetrics().widthPixels - (rect.left + rect.right), Integer.MIN_VALUE);
            }
            int iMeasureHeightOfChildrenCompat = this.f1332r0.measureHeightOfChildrenCompat(iMakeMeasureSpec, 0, -1, iA - measuredHeight, -1);
            if (iMeasureHeightOfChildrenCompat > 0) {
                measuredHeight += this.f1332r0.getPaddingBottom() + this.f1332r0.getPaddingTop() + i10;
            }
            i11 = iMeasureHeightOfChildrenCompat + measuredHeight;
        }
        boolean zIsInputMethodNotNeeded = isInputMethodNotNeeded();
        PopupWindowCompat.setWindowLayoutType(b0Var, this.f1336w0);
        if (b0Var.isShowing()) {
            if (getAnchorView().isAttachedToWindow()) {
                int width = this.f1334t0;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = getAnchorView().getWidth();
                }
                int i18 = this.f1333s0;
                if (i18 == -1) {
                    if (!zIsInputMethodNotNeeded) {
                        i11 = -1;
                    }
                    if (zIsInputMethodNotNeeded) {
                        b0Var.setWidth(this.f1334t0 == -1 ? -1 : 0);
                        b0Var.setHeight(0);
                    } else {
                        b0Var.setWidth(this.f1334t0 == -1 ? -1 : 0);
                        b0Var.setHeight(-1);
                    }
                } else if (i18 != -2) {
                    i11 = i18;
                }
                b0Var.setOutsideTouchable((this.H0 || this.G0) ? false : true);
                View anchorView2 = getAnchorView();
                int i19 = this.f1335u0;
                int i20 = this.v0;
                if (width < 0) {
                    width = -1;
                }
                if (i11 < 0) {
                    i11 = -1;
                }
                b0Var.update(anchorView2, i19, i20, width, i11);
                return;
            }
            return;
        }
        int width2 = this.f1334t0;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = getAnchorView().getWidth();
        }
        int i21 = this.f1333s0;
        if (i21 == -1) {
            i11 = -1;
        } else if (i21 != -2) {
            i11 = i21;
        }
        b0Var.setWidth(width2);
        b0Var.setHeight(i11);
        if (Build.VERSION.SDK_INT <= 28) {
            Method method2 = f1327a1;
            if (method2 != null) {
                try {
                    method2.invoke(b0Var, Boolean.TRUE);
                } catch (Exception unused2) {
                }
            }
        } else {
            c.b(b0Var, true);
        }
        b0Var.setOutsideTouchable((this.H0 || this.G0) ? false : true);
        b0Var.setTouchInterceptor(this.R0);
        if (this.E0) {
            PopupWindowCompat.setOverlapAnchor(b0Var, this.f1338y0);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method3 = f1329c1;
            if (method3 != null) {
                try {
                    method3.invoke(b0Var, this.X0);
                } catch (Exception unused3) {
                }
            }
        } else {
            c.a(b0Var, this.X0);
        }
        PopupWindowCompat.showAsDropDown(b0Var, getAnchorView(), this.f1335u0, this.v0, this.F0);
        this.f1332r0.setSelection(-1);
        if (!this.Y0 || this.f1332r0.isInTouchMode()) {
            clearListSelection();
        }
        if (this.Y0) {
            return;
        }
        this.V0.post(this.T0);
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle);
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10) {
        this(context, attributeSet, i10, 0);
    }

    public ListPopupWindow(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i10, @StyleRes int i11) {
        this.f1333s0 = -2;
        this.f1334t0 = -2;
        this.f1336w0 = 1002;
        this.F0 = 0;
        this.G0 = false;
        this.H0 = false;
        this.I0 = Integer.MAX_VALUE;
        this.K0 = 0;
        this.Q0 = new h();
        this.R0 = new g();
        this.S0 = new f();
        this.T0 = new d();
        this.W0 = new Rect();
        this.f1330p0 = context;
        this.V0 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.ListPopupWindow, i10, i11);
        this.f1335u0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownHorizontalOffset, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R.styleable.ListPopupWindow_android_dropDownVerticalOffset, 0);
        this.v0 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1337x0 = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        b0 b0Var = new b0(context, attributeSet, i10, i11);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, R.styleable.PopupWindow, i10, i11);
        int i12 = R.styleable.PopupWindow_overlapAnchor;
        if (tintTypedArrayObtainStyledAttributes.hasValue(i12)) {
            PopupWindowCompat.setOverlapAnchor(b0Var, tintTypedArrayObtainStyledAttributes.getBoolean(i12, false));
        }
        b0Var.setBackgroundDrawable(tintTypedArrayObtainStyledAttributes.getDrawable(R.styleable.PopupWindow_android_popupBackground));
        tintTypedArrayObtainStyledAttributes.recycle();
        this.Z0 = b0Var;
        b0Var.setInputMethodMode(1);
    }

    public class f implements AbsListView.OnScrollListener {
        public f() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 == 1) {
                ListPopupWindow listPopupWindow = ListPopupWindow.this;
                if (listPopupWindow.isInputMethodNotNeeded() || listPopupWindow.Z0.getContentView() == null) {
                    return;
                }
                Handler handler = listPopupWindow.V0;
                h hVar = listPopupWindow.Q0;
                handler.removeCallbacks(hVar);
                hVar.run();
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public final void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }
    }
}
