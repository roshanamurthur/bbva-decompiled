package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.widget.TintTypedArray;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ListMenuItemView extends LinearLayout implements MenuView.ItemView, AbsListView.SelectionBoundsAdjuster {
    public final int E0;
    public final Context F0;
    public boolean G0;
    public final Drawable H0;
    public final boolean I0;
    public LayoutInflater J0;
    public boolean K0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public MenuItemImpl f920p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public ImageView f921q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public RadioButton f922r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public TextView f923s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public CheckBox f924t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public TextView f925u0;
    public ImageView v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public ImageView f926w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public LinearLayout f927x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final Drawable f928y0;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listMenuViewStyle);
    }

    private LayoutInflater getInflater() {
        if (this.J0 == null) {
            this.J0 = LayoutInflater.from(getContext());
        }
        return this.J0;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.v0;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f926w0;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f926w0.getLayoutParams();
        rect.top = this.f926w0.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.f920p0;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void initialize(MenuItemImpl menuItemImpl, int i10) {
        this.f920p0 = menuItemImpl;
        boolean z10 = false;
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        setTitle(prefersCondensedTitle() ? menuItemImpl.getTitleCondensed() : menuItemImpl.getTitle());
        setCheckable(menuItemImpl.isCheckable());
        if (menuItemImpl.f983n.isShortcutsVisible()) {
            if ((menuItemImpl.f983n.isQwertyMode() ? menuItemImpl.f980j : menuItemImpl.f978h) != 0) {
                z10 = true;
            }
        }
        setShortcut(z10, menuItemImpl.f983n.isQwertyMode() ? menuItemImpl.f980j : menuItemImpl.f978h);
        setIcon(menuItemImpl.getIcon());
        setEnabled(menuItemImpl.isEnabled());
        setSubMenuArrowVisible(menuItemImpl.hasSubMenu());
        setContentDescription(menuItemImpl.getContentDescription());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f928y0);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f923s0 = textView;
        int i10 = this.E0;
        if (i10 != -1) {
            textView.setTextAppearance(this.F0, i10);
        }
        this.f925u0 = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.v0 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.H0);
        }
        this.f926w0 = (ImageView) findViewById(R.id.group_divider);
        this.f927x0 = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f921q0 != null && this.G0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f921q0.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean prefersCondensedTitle() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        View view;
        if (!z10 && this.f922r0 == null && this.f924t0 == null) {
            return;
        }
        if (this.f920p0.isExclusiveCheckable()) {
            if (this.f922r0 == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f922r0 = radioButton;
                LinearLayout linearLayout = this.f927x0;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f922r0;
            view = this.f924t0;
        } else {
            if (this.f924t0 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f924t0 = checkBox;
                LinearLayout linearLayout2 = this.f927x0;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f924t0;
            view = this.f922r0;
        }
        if (z10) {
            compoundButton.setChecked(this.f920p0.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f924t0;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f922r0;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f920p0.isExclusiveCheckable()) {
            if (this.f922r0 == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f922r0 = radioButton;
                LinearLayout linearLayout = this.f927x0;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f922r0;
        } else {
            if (this.f924t0 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f924t0 = checkBox;
                LinearLayout linearLayout2 = this.f927x0;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f924t0;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.K0 = z10;
        this.G0 = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.f926w0;
        if (imageView != null) {
            imageView.setVisibility((this.I0 || !z10) ? 8 : 0);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setIcon(Drawable drawable) {
        boolean z10 = this.f920p0.shouldShowIcon() || this.K0;
        if (z10 || this.G0) {
            ImageView imageView = this.f921q0;
            if (imageView == null && drawable == null && !this.G0) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f921q0 = imageView2;
                LinearLayout linearLayout = this.f927x0;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.G0) {
                this.f921q0.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f921q0;
            if (!z10) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f921q0.getVisibility() != 0) {
                this.f921q0.setVisibility(0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001f  */
    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setShortcut(boolean z10, char c10) {
        int i10;
        String string;
        if (z10) {
            MenuItemImpl menuItemImpl = this.f920p0;
            if (menuItemImpl.f983n.isShortcutsVisible()) {
                if ((menuItemImpl.f983n.isQwertyMode() ? menuItemImpl.f980j : menuItemImpl.f978h) != 0) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
            } else {
                i10 = 8;
            }
        } else {
            i10 = 8;
        }
        if (i10 == 0) {
            TextView textView = this.f925u0;
            MenuItemImpl menuItemImpl2 = this.f920p0;
            char c11 = menuItemImpl2.f983n.isQwertyMode() ? menuItemImpl2.f980j : menuItemImpl2.f978h;
            if (c11 == 0) {
                string = "";
            } else {
                MenuBuilder menuBuilder = menuItemImpl2.f983n;
                Resources resources = menuBuilder.getContext().getResources();
                StringBuilder sb2 = new StringBuilder();
                if (ViewConfiguration.get(menuBuilder.getContext()).hasPermanentMenuKey()) {
                    sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                }
                int i11 = menuBuilder.isQwertyMode() ? menuItemImpl2.f981k : menuItemImpl2.f979i;
                MenuItemImpl.a(sb2, i11, 65536, resources.getString(R.string.abc_menu_meta_shortcut_label));
                MenuItemImpl.a(sb2, i11, 4096, resources.getString(R.string.abc_menu_ctrl_shortcut_label));
                MenuItemImpl.a(sb2, i11, 2, resources.getString(R.string.abc_menu_alt_shortcut_label));
                MenuItemImpl.a(sb2, i11, 1, resources.getString(R.string.abc_menu_shift_shortcut_label));
                MenuItemImpl.a(sb2, i11, 4, resources.getString(R.string.abc_menu_sym_shortcut_label));
                MenuItemImpl.a(sb2, i11, 8, resources.getString(R.string.abc_menu_function_shortcut_label));
                if (c11 == '\b') {
                    sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                } else if (c11 == '\n') {
                    sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                } else if (c11 != ' ') {
                    sb2.append(c11);
                } else {
                    sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                }
                string = sb2.toString();
            }
            textView.setText(string);
        }
        if (this.f925u0.getVisibility() != i10) {
            this.f925u0.setVisibility(i10);
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f923s0.getVisibility() != 8) {
                this.f923s0.setVisibility(8);
            }
        } else {
            this.f923s0.setText(charSequence);
            if (this.f923s0.getVisibility() != 0) {
                this.f923s0.setVisibility(0);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean showsIcon() {
        return this.K0;
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(getContext(), attributeSet, R.styleable.MenuView, i10, 0);
        this.f928y0 = tintTypedArrayObtainStyledAttributes.getDrawable(R.styleable.MenuView_android_itemBackground);
        this.E0 = tintTypedArrayObtainStyledAttributes.getResourceId(R.styleable.MenuView_android_itemTextAppearance, -1);
        this.G0 = tintTypedArrayObtainStyledAttributes.getBoolean(R.styleable.MenuView_preserveIconSpacing, false);
        this.F0 = context;
        this.H0 = tintTypedArrayObtainStyledAttributes.getDrawable(R.styleable.MenuView_subMenuArrow);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.I0 = typedArrayObtainStyledAttributes.hasValue(0);
        tintTypedArrayObtainStyledAttributes.recycle();
        typedArrayObtainStyledAttributes.recycle();
    }
}
