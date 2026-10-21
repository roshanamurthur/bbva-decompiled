package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.g0;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes10.dex */
public final class MaterialTimePicker extends DialogFragment implements TimePickerView.b {
    public static final int INPUT_MODE_CLOCK = 0;
    public static final int INPUT_MODE_KEYBOARD = 1;

    @DrawableRes
    public int E0;
    public CharSequence G0;
    public CharSequence I0;
    public CharSequence K0;
    public MaterialButton L0;
    public Button M0;
    public TimeModel O0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public TimePickerView f45736t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public ViewStub f45737u0;

    @Nullable
    public e v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public i f45738w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public f f45739x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    @DrawableRes
    public int f45740y0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final LinkedHashSet f45732p0 = new LinkedHashSet();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final LinkedHashSet f45733q0 = new LinkedHashSet();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final LinkedHashSet f45734r0 = new LinkedHashSet();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final LinkedHashSet f45735s0 = new LinkedHashSet();

    @StringRes
    public int F0 = 0;

    @StringRes
    public int H0 = 0;

    @StringRes
    public int J0 = 0;
    public int N0 = 0;
    public int P0 = 0;

    public static final class Builder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public Integer f45742b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public CharSequence f45744d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f45746f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f45748h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public TimeModel f45741a = new TimeModel();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @StringRes
        public int f45743c = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @StringRes
        public int f45745e = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @StringRes
        public int f45747g = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f45749i = 0;

        @NonNull
        public MaterialTimePicker build() {
            MaterialTimePicker materialTimePicker = new MaterialTimePicker();
            Bundle bundle = new Bundle();
            bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.f45741a);
            Integer num = this.f45742b;
            if (num != null) {
                bundle.putInt("TIME_PICKER_INPUT_MODE", num.intValue());
            }
            bundle.putInt("TIME_PICKER_TITLE_RES", this.f45743c);
            CharSequence charSequence = this.f45744d;
            if (charSequence != null) {
                bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", charSequence);
            }
            bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.f45745e);
            CharSequence charSequence2 = this.f45746f;
            if (charSequence2 != null) {
                bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", charSequence2);
            }
            bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.f45747g);
            CharSequence charSequence3 = this.f45748h;
            if (charSequence3 != null) {
                bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", charSequence3);
            }
            bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.f45749i);
            materialTimePicker.setArguments(bundle);
            return materialTimePicker;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setHour(@IntRange(from = 0, to = 23) int i10) {
            TimeModel timeModel = this.f45741a;
            timeModel.getClass();
            timeModel.v0 = i10 >= 12 ? 1 : 0;
            timeModel.f45756s0 = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setInputMode(int i10) {
            this.f45742b = Integer.valueOf(i10);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setMinute(@IntRange(from = 0, to = 59) int i10) {
            this.f45741a.d(i10);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setNegativeButtonText(@StringRes int i10) {
            this.f45747g = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setPositiveButtonText(@StringRes int i10) {
            this.f45745e = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTheme(@StyleRes int i10) {
            this.f45749i = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTimeFormat(int i10) {
            TimeModel timeModel = this.f45741a;
            int i11 = timeModel.f45756s0;
            int i12 = timeModel.f45757t0;
            TimeModel timeModel2 = new TimeModel(i10);
            this.f45741a = timeModel2;
            timeModel2.d(i12);
            TimeModel timeModel3 = this.f45741a;
            timeModel3.getClass();
            timeModel3.v0 = i11 >= 12 ? 1 : 0;
            timeModel3.f45756s0 = i11;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTitleText(@StringRes int i10) {
            this.f45743c = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setNegativeButtonText(@Nullable CharSequence charSequence) {
            this.f45748h = charSequence;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setPositiveButtonText(@Nullable CharSequence charSequence) {
            this.f45746f = charSequence;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder setTitleText(@Nullable CharSequence charSequence) {
            this.f45744d = charSequence;
            return this;
        }
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
            Iterator it = materialTimePicker.f45732p0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            materialTimePicker.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
            Iterator it = materialTimePicker.f45733q0.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            materialTimePicker.dismiss();
        }
    }

    public class c implements View.OnClickListener {
        public c() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MaterialTimePicker materialTimePicker = MaterialTimePicker.this;
            materialTimePicker.N0 = materialTimePicker.N0 == 0 ? 1 : 0;
            materialTimePicker.a(materialTimePicker.L0);
        }
    }

    public final void a(MaterialButton materialButton) {
        f fVar;
        Pair pair;
        e eVar;
        if (materialButton == null || this.f45736t0 == null || this.f45737u0 == null) {
            return;
        }
        f fVar2 = this.f45739x0;
        if (fVar2 != null) {
            fVar2.hide();
        }
        int i10 = this.N0;
        TimePickerView timePickerView = this.f45736t0;
        ViewStub viewStub = this.f45737u0;
        if (i10 == 0) {
            e eVar2 = this.v0;
            if (eVar2 == null) {
                eVar = eVar2;
                eVar = new e(timePickerView, this.O0);
            }
            eVar = eVar2;
            this.v0 = eVar;
            fVar = eVar;
        } else {
            if (this.f45738w0 == null) {
                this.f45738w0 = new i((LinearLayout) viewStub.inflate(), this.O0);
            }
            i iVar = this.f45738w0;
            iVar.f45792t0.setChecked(false);
            iVar.f45793u0.setChecked(false);
            fVar = this.f45738w0;
        }
        this.f45739x0 = fVar;
        fVar.show();
        this.f45739x0.invalidate();
        int i11 = this.N0;
        if (i11 == 0) {
            pair = new Pair(Integer.valueOf(this.f45740y0), Integer.valueOf(R.string.material_timepicker_text_input_mode_description));
        } else {
            if (i11 != 1) {
                throw new IllegalArgumentException(g0.c("no icon for mode: ", i11));
            }
            pair = new Pair(Integer.valueOf(this.E0), Integer.valueOf(R.string.material_timepicker_clock_mode_description));
        }
        materialButton.setIconResource(((Integer) pair.first).intValue());
        materialButton.setContentDescription(getResources().getString(((Integer) pair.second).intValue()));
        materialButton.sendAccessibilityEvent(4);
    }

    public boolean addOnCancelListener(@NonNull DialogInterface.OnCancelListener onCancelListener) {
        return this.f45734r0.add(onCancelListener);
    }

    public boolean addOnDismissListener(@NonNull DialogInterface.OnDismissListener onDismissListener) {
        return this.f45735s0.add(onDismissListener);
    }

    public boolean addOnNegativeButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.f45733q0.add(onClickListener);
    }

    public boolean addOnPositiveButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.f45732p0.add(onClickListener);
    }

    public void clearOnCancelListeners() {
        this.f45734r0.clear();
    }

    public void clearOnDismissListeners() {
        this.f45735s0.clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        this.f45733q0.clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        this.f45732p0.clear();
    }

    @IntRange(from = 0, to = 23)
    public int getHour() {
        return this.O0.f45756s0 % 24;
    }

    public int getInputMode() {
        return this.N0;
    }

    @IntRange(from = 0, to = 59)
    public int getMinute() {
        return this.O0.f45757t0;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator it = this.f45734r0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        if (bundle == null) {
            return;
        }
        TimeModel timeModel = (TimeModel) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
        this.O0 = timeModel;
        if (timeModel == null) {
            this.O0 = new TimeModel();
        }
        this.N0 = bundle.getInt("TIME_PICKER_INPUT_MODE", this.O0.f45755r0 != 1 ? 0 : 1);
        this.F0 = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
        this.G0 = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
        this.H0 = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        this.I0 = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
        this.J0 = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        this.K0 = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
        this.P0 = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Context contextRequireContext = requireContext();
        int i10 = this.P0;
        if (i10 == 0) {
            TypedValue typedValueResolve = MaterialAttributes.resolve(requireContext(), R.attr.materialTimePickerTheme);
            i10 = typedValueResolve == null ? 0 : typedValueResolve.data;
        }
        Dialog dialog = new Dialog(contextRequireContext, i10);
        Context context = dialog.getContext();
        int i11 = R.attr.materialTimePickerStyle;
        int i12 = R.style.Widget_MaterialComponents_TimePicker;
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(context, null, i11, i12);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.MaterialTimePicker, i11, i12);
        this.E0 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialTimePicker_clockIcon, 0);
        this.f45740y0 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.MaterialTimePicker_keyboardIcon, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.MaterialTimePicker_backgroundTint, 0);
        typedArrayObtainStyledAttributes.recycle();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setFillColor(ColorStateList.valueOf(color));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(materialShapeDrawable);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        materialShapeDrawable.setElevation(ViewCompat.getElevation(window.getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(R.id.material_timepicker_view);
        this.f45736t0 = timePickerView;
        timePickerView.f45766w0 = this;
        this.f45737u0 = (ViewStub) viewGroup2.findViewById(R.id.material_textinput_timepicker);
        this.L0 = (MaterialButton) viewGroup2.findViewById(R.id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.header_title);
        int i10 = this.F0;
        if (i10 != 0) {
            textView.setText(i10);
        } else if (!TextUtils.isEmpty(this.G0)) {
            textView.setText(this.G0);
        }
        a(this.L0);
        Button button = (Button) viewGroup2.findViewById(R.id.material_timepicker_ok_button);
        button.setOnClickListener(new a());
        int i11 = this.H0;
        if (i11 != 0) {
            button.setText(i11);
        } else if (!TextUtils.isEmpty(this.I0)) {
            button.setText(this.I0);
        }
        Button button2 = (Button) viewGroup2.findViewById(R.id.material_timepicker_cancel_button);
        this.M0 = button2;
        button2.setOnClickListener(new b());
        int i12 = this.J0;
        if (i12 != 0) {
            this.M0.setText(i12);
        } else if (!TextUtils.isEmpty(this.K0)) {
            this.M0.setText(this.K0);
        }
        Button button3 = this.M0;
        if (button3 != null) {
            button3.setVisibility(isCancelable() ? 0 : 8);
        }
        this.L0.setOnClickListener(new c());
        return viewGroup2;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f45739x0 = null;
        this.v0 = null;
        this.f45738w0 = null;
        TimePickerView timePickerView = this.f45736t0;
        if (timePickerView != null) {
            timePickerView.f45766w0 = null;
            this.f45736t0 = null;
        }
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator it = this.f45735s0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.google.android.material.timepicker.TimePickerView.b
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void onDoubleTap() {
        this.N0 = 1;
        a(this.L0);
        this.f45738w0.b();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.O0);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.N0);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.F0);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.G0);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.H0);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.I0);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.J0);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.K0);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.P0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (this.f45739x0 instanceof i) {
            view.postDelayed(new androidx.room.h(this, 4), 100L);
        }
    }

    public boolean removeOnCancelListener(@NonNull DialogInterface.OnCancelListener onCancelListener) {
        return this.f45734r0.remove(onCancelListener);
    }

    public boolean removeOnDismissListener(@NonNull DialogInterface.OnDismissListener onDismissListener) {
        return this.f45735s0.remove(onDismissListener);
    }

    public boolean removeOnNegativeButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.f45733q0.remove(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(@NonNull View.OnClickListener onClickListener) {
        return this.f45732p0.remove(onClickListener);
    }

    @Override // androidx.fragment.app.DialogFragment
    public void setCancelable(boolean z10) {
        super.setCancelable(z10);
        Button button = this.M0;
        if (button != null) {
            button.setVisibility(isCancelable() ? 0 : 8);
        }
    }

    public void setHour(@IntRange(from = 0, to = 23) int i10) {
        this.O0.c(i10);
        f fVar = this.f45739x0;
        if (fVar != null) {
            fVar.invalidate();
        }
    }

    public void setMinute(@IntRange(from = 0, to = 59) int i10) {
        this.O0.d(i10);
        f fVar = this.f45739x0;
        if (fVar != null) {
            fVar.invalidate();
        }
    }
}
