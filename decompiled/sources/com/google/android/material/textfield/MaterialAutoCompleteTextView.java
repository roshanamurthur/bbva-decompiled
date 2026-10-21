package com.google.android.material.textfield;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.ArrayRes;
import androidx.annotation.ColorInt;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.ListPopupWindow;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.bbva.nativesettings.common.Constants;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class MaterialAutoCompleteTextView extends AppCompatAutoCompleteTextView {
    public int E0;

    @Nullable
    public ColorStateList F0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NonNull
    public final ListPopupWindow f45561t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public final AccessibilityManager f45562u0;

    @NonNull
    public final Rect v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @LayoutRes
    public final int f45563w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final float f45564x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @Nullable
    public ColorStateList f45565y0;

    public class a implements AdapterView.OnItemClickListener {
        public a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            MaterialAutoCompleteTextView.a(materialAutoCompleteTextView, i10 < 0 ? materialAutoCompleteTextView.f45561t0.getSelectedItem() : materialAutoCompleteTextView.getAdapter().getItem(i10));
            AdapterView.OnItemClickListener onItemClickListener = materialAutoCompleteTextView.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = materialAutoCompleteTextView.f45561t0.getSelectedView();
                    i10 = materialAutoCompleteTextView.f45561t0.getSelectedItemPosition();
                    j10 = materialAutoCompleteTextView.f45561t0.getSelectedItemId();
                }
                onItemClickListener.onItemClick(materialAutoCompleteTextView.f45561t0.getListView(), view, i10, j10);
            }
            materialAutoCompleteTextView.f45561t0.dismiss();
        }
    }

    public class b<T> extends ArrayAdapter<String> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @Nullable
        public ColorStateList f45567p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        @Nullable
        public ColorStateList f45568q0;

        public b(Context context, @NonNull int i10, String[] strArr) {
            super(context, i10, strArr);
            a();
        }

        public final void a() {
            ColorStateList colorStateList;
            MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
            ColorStateList colorStateList2 = materialAutoCompleteTextView.F0;
            ColorStateList colorStateList3 = null;
            if (colorStateList2 != null) {
                int[] iArr = {R.attr.state_pressed};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            } else {
                colorStateList = null;
            }
            this.f45568q0 = colorStateList;
            if (materialAutoCompleteTextView.E0 != 0 && materialAutoCompleteTextView.F0 != null) {
                int[] iArr2 = {R.attr.state_hovered, -16842919};
                int[] iArr3 = {R.attr.state_selected, -16842919};
                colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{MaterialColors.layer(materialAutoCompleteTextView.E0, materialAutoCompleteTextView.F0.getColorForState(iArr3, 0)), MaterialColors.layer(materialAutoCompleteTextView.E0, materialAutoCompleteTextView.F0.getColorForState(iArr2, 0)), materialAutoCompleteTextView.E0});
            }
            this.f45567p0 = colorStateList3;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i10, @Nullable View view, ViewGroup viewGroup) {
            View view2 = super.getView(i10, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                MaterialAutoCompleteTextView materialAutoCompleteTextView = MaterialAutoCompleteTextView.this;
                Drawable rippleDrawable = null;
                if (materialAutoCompleteTextView.getText().toString().contentEquals(textView.getText()) && materialAutoCompleteTextView.E0 != 0) {
                    ColorDrawable colorDrawable = new ColorDrawable(materialAutoCompleteTextView.E0);
                    if (this.f45568q0 != null) {
                        DrawableCompat.setTintList(colorDrawable, this.f45567p0);
                        rippleDrawable = new RippleDrawable(this.f45568q0, colorDrawable, null);
                    } else {
                        rippleDrawable = colorDrawable;
                    }
                }
                ViewCompat.setBackground(textView, rippleDrawable);
            }
            return view2;
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context) {
        this(context, null);
    }

    public static void a(MaterialAutoCompleteTextView materialAutoCompleteTextView, Object obj) {
        materialAutoCompleteTextView.setText(materialAutoCompleteTextView.convertSelectionToString(obj), false);
    }

    @Nullable
    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public final boolean c() {
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        AccessibilityManager accessibilityManager = this.f45562u0;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            if (accessibilityManager != null && accessibilityManager.isEnabled() && (enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(16)) != null) {
                for (AccessibilityServiceInfo accessibilityServiceInfo : enabledAccessibilityServiceList) {
                    if (accessibilityServiceInfo.getSettingsActivityName() == null || !accessibilityServiceInfo.getSettingsActivityName().contains("SwitchAccess")) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // android.widget.AutoCompleteTextView
    public void dismissDropDown() {
        if (c()) {
            this.f45561t0.dismiss();
        } else {
            super.dismissDropDown();
        }
    }

    @Nullable
    public ColorStateList getDropDownBackgroundTintList() {
        return this.f45565y0;
    }

    @Override // android.widget.TextView
    @Nullable
    public CharSequence getHint() {
        TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.isProvidingHint()) ? super.getHint() : textInputLayoutB.getHint();
    }

    public float getPopupElevation() {
        return this.f45564x0;
    }

    public int getSimpleItemSelectedColor() {
        return this.E0;
    }

    @Nullable
    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.F0;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.isProvidingHint() && super.getHint() == null && ManufacturerUtils.isMeizuDevice()) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f45561t0.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                ListPopupWindow listPopupWindow = this.f45561t0;
                int iMin = Math.min(adapter.getCount(), Math.max(0, listPopupWindow.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = listPopupWindow.getBackground();
                if (background != null) {
                    Rect rect = this.v0;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutB.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public void onWindowFocusChanged(boolean z10) {
        if (c()) {
            return;
        }
        super.onWindowFocusChanged(z10);
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(@Nullable T t10) {
        super.setAdapter(t10);
        this.f45561t0.setAdapter(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        ListPopupWindow listPopupWindow = this.f45561t0;
        if (listPopupWindow != null) {
            listPopupWindow.setBackgroundDrawable(drawable);
        }
    }

    public void setDropDownBackgroundTint(@ColorInt int i10) {
        setDropDownBackgroundTintList(ColorStateList.valueOf(i10));
    }

    public void setDropDownBackgroundTintList(@Nullable ColorStateList colorStateList) {
        this.f45565y0 = colorStateList;
        Drawable dropDownBackground = getDropDownBackground();
        if (dropDownBackground instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) dropDownBackground).setFillColor(this.f45565y0);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(@Nullable AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.f45561t0.setOnItemSelectedListener(getOnItemSelectedListener());
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i10) {
        super.setRawInputType(i10);
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.s();
        }
    }

    public void setSimpleItemSelectedColor(int i10) {
        this.E0 = i10;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).a();
        }
    }

    public void setSimpleItemSelectedRippleColor(@Nullable ColorStateList colorStateList) {
        this.F0 = colorStateList;
        if (getAdapter() instanceof b) {
            ((b) getAdapter()).a();
        }
    }

    public void setSimpleItems(@ArrayRes int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        if (c()) {
            this.f45561t0.show();
        } else {
            super.showDropDown();
        }
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, com.google.android.material.R.attr.autoCompleteTextViewStyle);
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new b(getContext(), this.f45563w0, strArr));
    }

    public MaterialAutoCompleteTextView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, 0), attributeSet, i10);
        this.v0 = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayObtainStyledAttributes = ThemeEnforcement.obtainStyledAttributes(context2, attributeSet, com.google.android.material.R.styleable.MaterialAutoCompleteTextView, i10, com.google.android.material.R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        int i11 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_inputType;
        if (typedArrayObtainStyledAttributes.hasValue(i11) && typedArrayObtainStyledAttributes.getInt(i11, 0) == 0) {
            setKeyListener(null);
        }
        this.f45563w0 = typedArrayObtainStyledAttributes.getResourceId(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemLayout, com.google.android.material.R.layout.mtrl_auto_complete_simple_item);
        this.f45564x0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_android_popupElevation, com.google.android.material.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        int i12 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_dropDownBackgroundTint;
        if (typedArrayObtainStyledAttributes.hasValue(i12)) {
            this.f45565y0 = ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(i12, 0));
        }
        this.E0 = typedArrayObtainStyledAttributes.getColor(com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedColor, 0);
        this.F0 = MaterialResources.getColorStateList(context2, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItemSelectedRippleColor);
        this.f45562u0 = (AccessibilityManager) context2.getSystemService(Constants.ACCESSIBILITY);
        ListPopupWindow listPopupWindow = new ListPopupWindow(context2);
        this.f45561t0 = listPopupWindow;
        listPopupWindow.setModal(true);
        listPopupWindow.setAnchorView(this);
        listPopupWindow.setInputMethodMode(2);
        listPopupWindow.setAdapter(getAdapter());
        listPopupWindow.setOnItemClickListener(new a());
        int i13 = com.google.android.material.R.styleable.MaterialAutoCompleteTextView_simpleItems;
        if (typedArrayObtainStyledAttributes.hasValue(i13)) {
            setSimpleItems(typedArrayObtainStyledAttributes.getResourceId(i13, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
    }
}
