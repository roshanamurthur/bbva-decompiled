package com.google.android.material.button;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.ToggleButton;
import androidx.annotation.BoolRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.AbsoluteCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes10.dex */
public class MaterialButtonToggleGroup extends LinearLayout {
    public static final int E0 = R.style.Widget_MaterialComponents_MaterialButtonToggleGroup;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final ArrayList f44139p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final d f44140q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final LinkedHashSet<OnButtonCheckedListener> f44141r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final a f44142s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public Integer[] f44143t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public boolean f44144u0;
    public boolean v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public boolean f44145w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @IdRes
    public final int f44146x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public HashSet f44147y0;

    public interface OnButtonCheckedListener {
        void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup, @IdRes int i10, boolean z10);
    }

    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        @Override // java.util.Comparator
        public final int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            MaterialButton materialButton3 = materialButton;
            MaterialButton materialButton4 = materialButton2;
            int iCompareTo = Boolean.valueOf(materialButton3.isChecked()).compareTo(Boolean.valueOf(materialButton4.isChecked()));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            int iCompareTo2 = Boolean.valueOf(materialButton3.isPressed()).compareTo(Boolean.valueOf(materialButton4.isPressed()));
            if (iCompareTo2 != 0) {
                return iCompareTo2;
            }
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            return Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton3)).compareTo(Integer.valueOf(materialButtonToggleGroup.indexOfChild(materialButton4)));
        }
    }

    public class b extends AccessibilityDelegateCompat {
        public b() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public final void onInitializeAccessibilityNodeInfo(View view, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int i10;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            int i11 = MaterialButtonToggleGroup.E0;
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            materialButtonToggleGroup.getClass();
            if (view instanceof MaterialButton) {
                int i12 = 0;
                for (int i13 = 0; i13 < materialButtonToggleGroup.getChildCount(); i13++) {
                    if (materialButtonToggleGroup.getChildAt(i13) == view) {
                        i10 = i12;
                    } else {
                        if ((materialButtonToggleGroup.getChildAt(i13) instanceof MaterialButton) && materialButtonToggleGroup.c(i13)) {
                            i12++;
                        }
                    }
                }
                i10 = -1;
            } else {
                i10 = -1;
            }
            accessibilityNodeInfoCompat.setCollectionItemInfo(AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(0, 1, i10, 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final AbsoluteCornerSize f44150e = new AbsoluteCornerSize(0.0f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CornerSize f44151a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CornerSize f44152b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final CornerSize f44153c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final CornerSize f44154d;

        public c(CornerSize cornerSize, CornerSize cornerSize2, CornerSize cornerSize3, CornerSize cornerSize4) {
            this.f44151a = cornerSize;
            this.f44152b = cornerSize3;
            this.f44153c = cornerSize4;
            this.f44154d = cornerSize2;
        }
    }

    public class d implements MaterialButton.a {
        public d() {
        }
    }

    public MaterialButtonToggleGroup(@NonNull Context context) {
        this(context, null);
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            if (c(i10)) {
                return i10;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (c(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i10 = 0;
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            if ((getChildAt(i11) instanceof MaterialButton) && c(i11)) {
                i10++;
            }
        }
        return i10;
    }

    private void setGeneratedIdIfNeeded(@NonNull MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(ViewCompat.generateViewId());
        }
    }

    private void setupButtonChild(@NonNull MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.setOnPressedChangeListenerInternal(this.f44140q0);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex == -1) {
            return;
        }
        for (int i10 = firstVisibleChildIndex + 1; i10 < getChildCount(); i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            int iMin = Math.min(materialButton.getStrokeWidth(), ((MaterialButton) getChildAt(i10 - 1)).getStrokeWidth());
            ViewGroup.LayoutParams layoutParams = materialButton.getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
            if (getOrientation() == 0) {
                MarginLayoutParamsCompat.setMarginEnd(layoutParams2, 0);
                MarginLayoutParamsCompat.setMarginStart(layoutParams2, -iMin);
                layoutParams2.topMargin = 0;
            } else {
                layoutParams2.bottomMargin = 0;
                layoutParams2.topMargin = -iMin;
                MarginLayoutParamsCompat.setMarginStart(layoutParams2, 0);
            }
            materialButton.setLayoutParams(layoutParams2);
        }
        if (getChildCount() == 0 || firstVisibleChildIndex == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams3.topMargin = 0;
            layoutParams3.bottomMargin = 0;
        } else {
            MarginLayoutParamsCompat.setMarginEnd(layoutParams3, 0);
            MarginLayoutParamsCompat.setMarginStart(layoutParams3, 0);
            layoutParams3.leftMargin = 0;
            layoutParams3.rightMargin = 0;
        }
    }

    public void addOnButtonCheckedListener(@NonNull OnButtonCheckedListener onButtonCheckedListener) {
        this.f44141r0.add(onButtonCheckedListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i10, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            setGeneratedIdIfNeeded(materialButton);
            setupButtonChild(materialButton);
            b(materialButton.getId(), materialButton.isChecked());
            ShapeAppearanceModel shapeAppearanceModel = materialButton.getShapeAppearanceModel();
            this.f44139p0.add(new c(shapeAppearanceModel.getTopLeftCornerSize(), shapeAppearanceModel.getBottomLeftCornerSize(), shapeAppearanceModel.getTopRightCornerSize(), shapeAppearanceModel.getBottomRightCornerSize()));
            materialButton.setEnabled(isEnabled());
            ViewCompat.setAccessibilityDelegate(materialButton, new b());
        }
    }

    public final void b(@IdRes int i10, boolean z10) {
        if (i10 == -1) {
            return;
        }
        HashSet hashSet = new HashSet(this.f44147y0);
        if (z10 && !hashSet.contains(Integer.valueOf(i10))) {
            if (this.v0 && !hashSet.isEmpty()) {
                hashSet.clear();
            }
            hashSet.add(Integer.valueOf(i10));
        } else {
            if (z10 || !hashSet.contains(Integer.valueOf(i10))) {
                return;
            }
            if (!this.f44145w0 || hashSet.size() > 1) {
                hashSet.remove(Integer.valueOf(i10));
            }
        }
        d(hashSet);
    }

    public final boolean c(int i10) {
        return getChildAt(i10).getVisibility() != 8;
    }

    public void check(@IdRes int i10) {
        b(i10, true);
    }

    public void clearChecked() {
        d(new HashSet());
    }

    public void clearOnButtonCheckedListeners() {
        this.f44141r0.clear();
    }

    public final void d(Set<Integer> set) {
        HashSet hashSet = this.f44147y0;
        this.f44147y0 = new HashSet(set);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = ((MaterialButton) getChildAt(i10)).getId();
            boolean zContains = set.contains(Integer.valueOf(id));
            View viewFindViewById = findViewById(id);
            if (viewFindViewById instanceof MaterialButton) {
                this.f44144u0 = true;
                ((MaterialButton) viewFindViewById).setChecked(zContains);
                this.f44144u0 = false;
            }
            if (hashSet.contains(Integer.valueOf(id)) != set.contains(Integer.valueOf(id))) {
                boolean zContains2 = set.contains(Integer.valueOf(id));
                Iterator<OnButtonCheckedListener> it = this.f44141r0.iterator();
                while (it.hasNext()) {
                    it.next().onButtonChecked(this, id, zContains2);
                }
            }
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(@NonNull Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.f44142s0);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            treeMap.put((MaterialButton) getChildAt(i10), Integer.valueOf(i10));
        }
        this.f44143t0 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    @VisibleForTesting
    public final void e() {
        c cVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i10 = 0; i10 < childCount; i10++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i10);
            if (materialButton.getVisibility() != 8) {
                ShapeAppearanceModel.Builder builder = materialButton.getShapeAppearanceModel().toBuilder();
                c cVar2 = (c) this.f44139p0.get(i10);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z10 = getOrientation() == 0;
                    if (i10 == firstVisibleChildIndex) {
                        if (z10) {
                            AbsoluteCornerSize absoluteCornerSize = c.f44150e;
                            if (ViewUtils.isLayoutRtl(this)) {
                                CornerSize cornerSize = cVar2.f44152b;
                                CornerSize cornerSize2 = cVar2.f44153c;
                                AbsoluteCornerSize absoluteCornerSize2 = c.f44150e;
                                cVar = new c(absoluteCornerSize2, absoluteCornerSize2, cornerSize, cornerSize2);
                            } else {
                                CornerSize cornerSize3 = cVar2.f44151a;
                                AbsoluteCornerSize absoluteCornerSize3 = c.f44150e;
                                cVar = new c(cornerSize3, cVar2.f44154d, absoluteCornerSize3, absoluteCornerSize3);
                            }
                        } else {
                            CornerSize cornerSize4 = cVar2.f44151a;
                            AbsoluteCornerSize absoluteCornerSize4 = c.f44150e;
                            cVar = new c(cornerSize4, absoluteCornerSize4, cVar2.f44152b, absoluteCornerSize4);
                        }
                    } else if (i10 != lastVisibleChildIndex) {
                        cVar2 = null;
                    } else if (z10) {
                        AbsoluteCornerSize absoluteCornerSize5 = c.f44150e;
                        if (ViewUtils.isLayoutRtl(this)) {
                            CornerSize cornerSize5 = cVar2.f44151a;
                            AbsoluteCornerSize absoluteCornerSize6 = c.f44150e;
                            cVar = new c(cornerSize5, cVar2.f44154d, absoluteCornerSize6, absoluteCornerSize6);
                        } else {
                            CornerSize cornerSize6 = cVar2.f44152b;
                            CornerSize cornerSize7 = cVar2.f44153c;
                            AbsoluteCornerSize absoluteCornerSize7 = c.f44150e;
                            cVar = new c(absoluteCornerSize7, absoluteCornerSize7, cornerSize6, cornerSize7);
                        }
                    } else {
                        AbsoluteCornerSize absoluteCornerSize8 = c.f44150e;
                        cVar = new c(absoluteCornerSize8, cVar2.f44154d, absoluteCornerSize8, cVar2.f44153c);
                    }
                    cVar2 = cVar;
                }
                if (cVar2 == null) {
                    builder.setAllCornerSizes(0.0f);
                } else {
                    builder.setTopLeftCornerSize(cVar2.f44151a).setBottomLeftCornerSize(cVar2.f44154d).setTopRightCornerSize(cVar2.f44152b).setBottomRightCornerSize(cVar2.f44153c);
                }
                materialButton.setShapeAppearanceModel(builder.build());
            }
        }
    }

    @IdRes
    public int getCheckedButtonId() {
        if (!this.v0 || this.f44147y0.isEmpty()) {
            return -1;
        }
        return ((Integer) this.f44147y0.iterator().next()).intValue();
    }

    @NonNull
    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            int id = ((MaterialButton) getChildAt(i10)).getId();
            if (this.f44147y0.contains(Integer.valueOf(id))) {
                arrayList.add(Integer.valueOf(id));
            }
        }
        return arrayList;
    }

    @Override // android.view.ViewGroup
    public int getChildDrawingOrder(int i10, int i11) {
        Integer[] numArr = this.f44143t0;
        if (numArr != null && i11 < numArr.length) {
            return numArr[i11].intValue();
        }
        Log.w("MButtonToggleGroup", "Child order wasn't updated");
        return i11;
    }

    public boolean isSelectionRequired() {
        return this.f44145w0;
    }

    public boolean isSingleSelection() {
        return this.v0;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        int i10 = this.f44146x0;
        if (i10 != -1) {
            d(Collections.singleton(Integer.valueOf(i10)));
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo).setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(1, getVisibleButtonCount(), false, isSingleSelection() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        e();
        a();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            ((MaterialButton) view).setOnPressedChangeListenerInternal(null);
        }
        int iIndexOfChild = indexOfChild(view);
        if (iIndexOfChild >= 0) {
            this.f44139p0.remove(iIndexOfChild);
        }
        e();
        a();
    }

    public void removeOnButtonCheckedListener(@NonNull OnButtonCheckedListener onButtonCheckedListener) {
        this.f44141r0.remove(onButtonCheckedListener);
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        super.setEnabled(z10);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setEnabled(z10);
        }
    }

    public void setSelectionRequired(boolean z10) {
        this.f44145w0 = z10;
    }

    public void setSingleSelection(boolean z10) {
        if (this.v0 != z10) {
            this.v0 = z10;
            clearChecked();
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            ((MaterialButton) getChildAt(i10)).setA11yClassName((this.v0 ? RadioButton.class : ToggleButton.class).getName());
        }
    }

    public void uncheck(@IdRes int i10) {
        b(i10, false);
    }

    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialButtonToggleGroupStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButtonToggleGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11 = E0;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i11), attributeSet, i10);
        this.f44139p0 = new ArrayList();
        this.f44140q0 = new d();
        this.f44141r0 = new LinkedHashSet<>();
        this.f44142s0 = new a();
        this.f44144u0 = false;
        this.f44147y0 = new HashSet();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(getContext(), attributeSet, R.styleable.MaterialButtonToggleGroup, i10, i11, new int[0]);
        setSingleSelection(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialButtonToggleGroup_singleSelection, false));
        this.f44146x0 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialButtonToggleGroup_checkedButton, -1);
        this.f44145w0 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialButtonToggleGroup_selectionRequired, false);
        setChildrenDrawingOrderEnabled(true);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(R.styleable.MaterialButtonToggleGroup_android_enabled, true));
        typedArrayObtainStyledAttributes.recycle();
        ViewCompat.setImportantForAccessibility(this, 1);
    }

    public void setSingleSelection(@BoolRes int i10) {
        setSingleSelection(getResources().getBoolean(i10));
    }
}
