package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes10.dex */
class ChipTextInputComboView extends FrameLayout implements Checkable {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final /* synthetic */ int f45708u0 = 0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final Chip f45709p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final TextInputLayout f45710q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final EditText f45711r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final a f45712s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final TextView f45713t0;

    public class a extends TextWatcherAdapter {
        public a() {
        }

        @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean zIsEmpty = TextUtils.isEmpty(editable);
            ChipTextInputComboView chipTextInputComboView = ChipTextInputComboView.this;
            if (zIsEmpty) {
                chipTextInputComboView.f45709p0.setText(TimeModel.a(chipTextInputComboView.getResources(), "00", "%02d"));
                return;
            }
            int i10 = ChipTextInputComboView.f45708u0;
            String strA = TimeModel.a(chipTextInputComboView.getResources(), editable, "%02d");
            if (TextUtils.isEmpty(strA)) {
                strA = TimeModel.a(chipTextInputComboView.getResources(), "00", "%02d");
            }
            chipTextInputComboView.f45709p0.setText(strA);
        }
    }

    public ChipTextInputComboView(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f45709p0.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            this.f45711r0.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        Chip chip = this.f45709p0;
        chip.setChecked(z10);
        int i10 = z10 ? 0 : 4;
        EditText editText = this.f45711r0;
        editText.setVisibility(i10);
        chip.setVisibility(z10 ? 8 : 0);
        if (isChecked()) {
            ViewUtils.requestFocusAndShowKeyboard(editText, false);
        }
    }

    public void setChipDelegate(AccessibilityDelegateCompat accessibilityDelegateCompat) {
        ViewCompat.setAccessibilityDelegate(this.f45709p0, accessibilityDelegateCompat);
    }

    public void setCursorVisible(boolean z10) {
        this.f45711r0.setCursorVisible(z10);
    }

    public void setHelperText(CharSequence charSequence) {
        this.f45713t0.setText(charSequence);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.f45709p0.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        this.f45709p0.setTag(i10, obj);
    }

    public void setText(CharSequence charSequence) {
        String strA = TimeModel.a(getResources(), charSequence, "%02d");
        this.f45709p0.setText(strA);
        if (TextUtils.isEmpty(strA)) {
            return;
        }
        a aVar = this.f45712s0;
        EditText editText = this.f45711r0;
        editText.removeTextChangedListener(aVar);
        editText.setText(strA);
        editText.addTextChangedListener(aVar);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.f45709p0.toggle();
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context);
        Chip chip = (Chip) layoutInflaterFrom.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.f45709p0 = chip;
        chip.setAccessibilityClassName(AndroidComposeViewAccessibilityDelegateCompat.ClassName);
        TextInputLayout textInputLayout = (TextInputLayout) layoutInflaterFrom.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        this.f45710q0 = textInputLayout;
        EditText editText = textInputLayout.getEditText();
        this.f45711r0 = editText;
        editText.setVisibility(4);
        a aVar = new a();
        this.f45712s0 = aVar;
        editText.addTextChangedListener(aVar);
        if (Build.VERSION.SDK_INT >= 24) {
            editText.setImeHintLocales(getContext().getResources().getConfiguration().getLocales());
        }
        addView(chip);
        addView(textInputLayout);
        TextView textView = (TextView) findViewById(R.id.material_label);
        this.f45713t0 = textView;
        editText.setId(ViewCompat.generateViewId());
        ViewCompat.setLabelFor(textView, editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }
}
