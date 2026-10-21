package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.util.Pair;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.google.android.material.R;
import com.google.android.material.dialog.InsetDialogOnTouchListener;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.EdgeToEdgeUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes10.dex */
public final class MaterialDatePicker<S> extends DialogFragment {
    public static final int INPUT_MODE_CALENDAR = 0;
    public static final int INPUT_MODE_TEXT = 1;

    @StringRes
    public int E0;
    public CharSequence F0;
    public boolean G0;
    public int H0;

    @StringRes
    public int I0;
    public CharSequence J0;

    @StringRes
    public int K0;
    public CharSequence L0;

    @StringRes
    public int M0;
    public CharSequence N0;

    @StringRes
    public int O0;
    public CharSequence P0;
    public TextView Q0;
    public TextView R0;
    public CheckableImageButton S0;

    @Nullable
    public MaterialShapeDrawable T0;
    public Button U0;
    public boolean V0;

    @Nullable
    public CharSequence W0;

    @Nullable
    public CharSequence X0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final LinkedHashSet<MaterialPickerOnPositiveButtonClickListener<? super S>> f44487p0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final LinkedHashSet<View.OnClickListener> f44488q0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnCancelListener> f44489r0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final LinkedHashSet<DialogInterface.OnDismissListener> f44490s0 = new LinkedHashSet<>();

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @StyleRes
    public int f44491t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public DateSelector<S> f44492u0;
    public t<S> v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @Nullable
    public CalendarConstraints f44493w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    @Nullable
    public DayViewDecorator f44494x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public MaterialCalendar<S> f44495y0;

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface InputMode {
    }

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            Iterator<MaterialPickerOnPositiveButtonClickListener<? super S>> it = materialDatePicker.f44487p0.iterator();
            while (it.hasNext()) {
                it.next().onPositiveButtonClick((Object) materialDatePicker.getSelection());
            }
            materialDatePicker.dismiss();
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            Iterator<View.OnClickListener> it = materialDatePicker.f44488q0.iterator();
            while (it.hasNext()) {
                it.next().onClick(view);
            }
            materialDatePicker.dismiss();
        }
    }

    public class c extends OnSelectionChangedListener<S> {
        public c() {
        }

        @Override // com.google.android.material.datepicker.OnSelectionChangedListener
        public final void onIncompleteSelectionChanged() {
            MaterialDatePicker.this.U0.setEnabled(false);
        }

        @Override // com.google.android.material.datepicker.OnSelectionChangedListener
        public final void onSelectionChanged(S s4) {
            MaterialDatePicker materialDatePicker = MaterialDatePicker.this;
            String headerText = materialDatePicker.getHeaderText();
            materialDatePicker.R0.setContentDescription(materialDatePicker.c().getSelectionContentDescription(materialDatePicker.requireContext()));
            materialDatePicker.R0.setText(headerText);
            materialDatePicker.U0.setEnabled(materialDatePicker.c().isSelectionComplete());
        }
    }

    public static int d(@NonNull Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Month month = new Month(w.h());
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width);
        int dimensionPixelOffset2 = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding);
        int i10 = month.f44524s0;
        return ((i10 - 1) * dimensionPixelOffset2) + (dimensionPixelSize * i10) + (dimensionPixelOffset * 2);
    }

    public static boolean e(@NonNull Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(MaterialAttributes.resolveOrThrow(context, R.attr.materialCalendarStyle, MaterialCalendar.class.getCanonicalName()), new int[]{i10});
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(0, false);
        typedArrayObtainStyledAttributes.recycle();
        return z10;
    }

    public static long thisMonthInUtcMilliseconds() {
        return new Month(w.h()).f44526u0;
    }

    public static long todayInUtcMilliseconds() {
        return w.h().getTimeInMillis();
    }

    public boolean addOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.f44489r0.add(onCancelListener);
    }

    public boolean addOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.f44490s0.add(onDismissListener);
    }

    public boolean addOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.f44488q0.add(onClickListener);
    }

    public boolean addOnPositiveButtonClickListener(MaterialPickerOnPositiveButtonClickListener<? super S> materialPickerOnPositiveButtonClickListener) {
        return this.f44487p0.add(materialPickerOnPositiveButtonClickListener);
    }

    public final DateSelector<S> c() {
        if (this.f44492u0 == null) {
            this.f44492u0 = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f44492u0;
    }

    public void clearOnCancelListeners() {
        this.f44489r0.clear();
    }

    public void clearOnDismissListeners() {
        this.f44490s0.clear();
    }

    public void clearOnNegativeButtonClickListeners() {
        this.f44488q0.clear();
    }

    public void clearOnPositiveButtonClickListeners() {
        this.f44487p0.clear();
    }

    public final void f() {
        Context contextRequireContext = requireContext();
        int defaultThemeResId = this.f44491t0;
        if (defaultThemeResId == 0) {
            defaultThemeResId = c().getDefaultThemeResId(contextRequireContext);
        }
        MaterialTextInputPicker materialTextInputPickerNewInstance = MaterialCalendar.newInstance(c(), defaultThemeResId, this.f44493w0, this.f44494x0);
        this.f44495y0 = materialTextInputPickerNewInstance;
        if (this.H0 == 1) {
            DateSelector<S> dateSelectorC = c();
            CalendarConstraints calendarConstraints = this.f44493w0;
            MaterialTextInputPicker materialTextInputPicker = new MaterialTextInputPicker();
            Bundle bundle = new Bundle();
            bundle.putInt("THEME_RES_ID_KEY", defaultThemeResId);
            bundle.putParcelable("DATE_SELECTOR_KEY", dateSelectorC);
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
            materialTextInputPicker.setArguments(bundle);
            materialTextInputPickerNewInstance = materialTextInputPicker;
        }
        this.v0 = materialTextInputPickerNewInstance;
        this.Q0.setText((this.H0 == 1 && getResources().getConfiguration().orientation == 2) ? this.X0 : this.W0);
        String headerText = getHeaderText();
        this.R0.setContentDescription(c().getSelectionContentDescription(requireContext()));
        this.R0.setText(headerText);
        FragmentTransaction fragmentTransactionBeginTransaction = getChildFragmentManager().beginTransaction();
        fragmentTransactionBeginTransaction.replace(R.id.mtrl_calendar_frame, this.v0);
        fragmentTransactionBeginTransaction.commitNow();
        this.v0.addOnSelectionChangedListener(new c());
    }

    public final void g(@NonNull CheckableImageButton checkableImageButton) {
        this.S0.setContentDescription(this.H0 == 1 ? checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode) : checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode));
    }

    public String getHeaderText() {
        return c().getSelectionDisplayString(getContext());
    }

    public int getInputMode() {
        return this.H0;
    }

    @Nullable
    public final S getSelection() {
        return c().getSelection();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f44489r0.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f44491t0 = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f44492u0 = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f44493w0 = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f44494x0 = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.E0 = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.F0 = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.H0 = bundle.getInt("INPUT_MODE_KEY");
        this.I0 = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.J0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.K0 = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.L0 = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.M0 = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.N0 = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.O0 = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.P0 = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence text = this.F0;
        if (text == null) {
            text = requireContext().getResources().getText(this.E0);
        }
        this.W0 = text;
        if (text != null) {
            CharSequence[] charSequenceArrSplit = TextUtils.split(String.valueOf(text), RootService.LINE_BREAK);
            if (charSequenceArrSplit.length > 1) {
                text = charSequenceArrSplit[0];
            }
        } else {
            text = null;
        }
        this.X0 = text;
    }

    @Override // androidx.fragment.app.DialogFragment
    @NonNull
    public final Dialog onCreateDialog(@Nullable Bundle bundle) {
        Context contextRequireContext = requireContext();
        Context contextRequireContext2 = requireContext();
        int defaultThemeResId = this.f44491t0;
        if (defaultThemeResId == 0) {
            defaultThemeResId = c().getDefaultThemeResId(contextRequireContext2);
        }
        Dialog dialog = new Dialog(contextRequireContext, defaultThemeResId);
        Context context = dialog.getContext();
        this.G0 = e(context, android.R.attr.windowFullscreen);
        int i10 = R.attr.materialCalendarStyle;
        int i11 = R.style.Widget_MaterialComponents_MaterialCalendar;
        this.T0 = new MaterialShapeDrawable(context, null, i10, i11);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R.styleable.MaterialCalendar, i10, i11);
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.MaterialCalendar_backgroundTint, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.T0.initializeElevationOverlay(context);
        this.T0.setFillColor(ColorStateList.valueOf(color));
        this.T0.setElevation(ViewCompat.getElevation(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    @NonNull
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View viewInflate = layoutInflater.inflate(this.G0 ? R.layout.mtrl_picker_fullscreen : R.layout.mtrl_picker_dialog, viewGroup);
        Context context = viewInflate.getContext();
        DayViewDecorator dayViewDecorator = this.f44494x0;
        if (dayViewDecorator != null) {
            dayViewDecorator.initialize(context);
        }
        if (this.G0) {
            viewInflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(d(context), -2));
        } else {
            viewInflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(d(context), -1));
        }
        TextView textView = (TextView) viewInflate.findViewById(R.id.mtrl_picker_header_selection_text);
        this.R0 = textView;
        ViewCompat.setAccessibilityLiveRegion(textView, 1);
        this.S0 = (CheckableImageButton) viewInflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.Q0 = (TextView) viewInflate.findViewById(R.id.mtrl_picker_title_text);
        this.S0.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.S0;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{android.R.attr.state_checked}, AppCompatResources.getDrawable(context, R.drawable.material_ic_calendar_black_24dp));
        stateListDrawable.addState(new int[0], AppCompatResources.getDrawable(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        this.S0.setChecked(this.H0 != 0);
        ViewCompat.setAccessibilityDelegate(this.S0, null);
        g(this.S0);
        this.S0.setOnClickListener(new n4.j(this, 3));
        this.U0 = (Button) viewInflate.findViewById(R.id.confirm_button);
        if (c().isSelectionComplete()) {
            this.U0.setEnabled(true);
        } else {
            this.U0.setEnabled(false);
        }
        this.U0.setTag("CONFIRM_BUTTON_TAG");
        CharSequence charSequence = this.J0;
        if (charSequence != null) {
            this.U0.setText(charSequence);
        } else {
            int i10 = this.I0;
            if (i10 != 0) {
                this.U0.setText(i10);
            }
        }
        CharSequence charSequence2 = this.L0;
        if (charSequence2 != null) {
            this.U0.setContentDescription(charSequence2);
        } else if (this.K0 != 0) {
            this.U0.setContentDescription(getContext().getResources().getText(this.K0));
        }
        this.U0.setOnClickListener(new a());
        Button button = (Button) viewInflate.findViewById(R.id.cancel_button);
        button.setTag("CANCEL_BUTTON_TAG");
        CharSequence charSequence3 = this.N0;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i11 = this.M0;
            if (i11 != 0) {
                button.setText(i11);
            }
        }
        CharSequence charSequence4 = this.P0;
        if (charSequence4 != null) {
            button.setContentDescription(charSequence4);
        } else if (this.O0 != 0) {
            button.setContentDescription(getContext().getResources().getText(this.O0));
        }
        button.setOnClickListener(new b());
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@NonNull DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f44490s0.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f44491t0);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f44492u0);
        CalendarConstraints calendarConstraints = this.f44493w0;
        CalendarConstraints.Builder builder = new CalendarConstraints.Builder();
        builder.f44464a = CalendarConstraints.Builder.f44462f;
        builder.f44465b = CalendarConstraints.Builder.f44463g;
        builder.f44468e = DateValidatorPointForward.from(Long.MIN_VALUE);
        builder.f44464a = calendarConstraints.f44456p0.f44526u0;
        builder.f44465b = calendarConstraints.f44457q0.f44526u0;
        builder.f44466c = Long.valueOf(calendarConstraints.f44459s0.f44526u0);
        builder.f44467d = calendarConstraints.f44460t0;
        builder.f44468e = calendarConstraints.f44458r0;
        MaterialCalendar<S> materialCalendar = this.f44495y0;
        Month month = materialCalendar == null ? null : materialCalendar.f44479t0;
        if (month != null) {
            builder.setOpenAt(month.f44526u0);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", builder.build());
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f44494x0);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.E0);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.F0);
        bundle.putInt("INPUT_MODE_KEY", this.H0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.I0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.J0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.K0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.L0);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.M0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.N0);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.O0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.P0);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.G0) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.T0);
            if (!this.V0) {
                View viewFindViewById = requireView().findViewById(R.id.fullscreen_header);
                EdgeToEdgeUtils.applyEdgeToEdge(window, true, ViewUtils.getBackgroundColor(viewFindViewById), null);
                ViewCompat.setOnApplyWindowInsetsListener(viewFindViewById, new q(viewFindViewById.getLayoutParams().height, viewFindViewById, viewFindViewById.getPaddingTop()));
                this.V0 = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.T0, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new InsetDialogOnTouchListener(requireDialog(), rect));
        }
        f();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        this.v0.onSelectionChangedListeners.clear();
        super.onStop();
    }

    public boolean removeOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        return this.f44489r0.remove(onCancelListener);
    }

    public boolean removeOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        return this.f44490s0.remove(onDismissListener);
    }

    public boolean removeOnNegativeButtonClickListener(View.OnClickListener onClickListener) {
        return this.f44488q0.remove(onClickListener);
    }

    public boolean removeOnPositiveButtonClickListener(MaterialPickerOnPositiveButtonClickListener<? super S> materialPickerOnPositiveButtonClickListener) {
        return this.f44487p0.remove(materialPickerOnPositiveButtonClickListener);
    }

    public static final class Builder<S> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final DateSelector<S> f44496a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CalendarConstraints f44498c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public DayViewDecorator f44499d;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f44497b = 0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f44500e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public CharSequence f44501f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f44502g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence f44503h = null;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f44504i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public CharSequence f44505j = null;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f44506k = 0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public CharSequence f44507l = null;
        public int m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public CharSequence f44508n = null;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @Nullable
        public S f44509o = null;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f44510p = 0;

        public Builder(DateSelector<S> dateSelector) {
            this.f44496a = dateSelector;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static <S> Builder<S> customDatePicker(@NonNull DateSelector<S> dateSelector) {
            return new Builder<>(dateSelector);
        }

        @NonNull
        public static Builder<Long> datePicker() {
            return new Builder<>(new SingleDateSelector());
        }

        @NonNull
        public static Builder<Pair<Long, Long>> dateRangePicker() {
            return new Builder<>(new RangeDateSelector());
        }

        /* JADX WARN: Code duplicated, block: B:20:0x005b  */
        /* JADX WARN: Code duplicated, block: B:25:0x0077  */
        @NonNull
        public MaterialDatePicker<S> build() {
            Month month;
            CalendarConstraints calendarConstraints;
            if (this.f44498c == null) {
                this.f44498c = new CalendarConstraints.Builder().build();
            }
            int i10 = this.f44500e;
            DateSelector<S> dateSelector = this.f44496a;
            if (i10 == 0) {
                this.f44500e = dateSelector.getDefaultTitleResId();
            }
            S s4 = this.f44509o;
            if (s4 != null) {
                dateSelector.setSelection(s4);
            }
            CalendarConstraints calendarConstraints2 = this.f44498c;
            if (calendarConstraints2.f44459s0 == null) {
                if (dateSelector.getSelectedDays().isEmpty()) {
                    month = new Month(w.h());
                    calendarConstraints = this.f44498c;
                    if (month.compareTo(calendarConstraints.f44456p0) >= 0) {
                        month = this.f44498c.f44456p0;
                    } else {
                        month = this.f44498c.f44456p0;
                    }
                } else {
                    month = Month.c(dateSelector.getSelectedDays().iterator().next().longValue());
                    CalendarConstraints calendarConstraints3 = this.f44498c;
                    if (month.compareTo(calendarConstraints3.f44456p0) < 0 || month.compareTo(calendarConstraints3.f44457q0) > 0) {
                        month = new Month(w.h());
                        calendarConstraints = this.f44498c;
                        if (month.compareTo(calendarConstraints.f44456p0) >= 0 || month.compareTo(calendarConstraints.f44457q0) > 0) {
                            month = this.f44498c.f44456p0;
                        }
                    }
                }
                calendarConstraints2.f44459s0 = month;
            }
            MaterialDatePicker<S> materialDatePicker = new MaterialDatePicker<>();
            Bundle bundle = new Bundle();
            bundle.putInt("OVERRIDE_THEME_RES_ID", this.f44497b);
            bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
            bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f44498c);
            bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f44499d);
            bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f44500e);
            bundle.putCharSequence("TITLE_TEXT_KEY", this.f44501f);
            bundle.putInt("INPUT_MODE_KEY", this.f44510p);
            bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f44502g);
            bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f44503h);
            bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.f44504i);
            bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f44505j);
            bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f44506k);
            bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f44507l);
            bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.m);
            bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.f44508n);
            materialDatePicker.setArguments(bundle);
            return materialDatePicker;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setCalendarConstraints(CalendarConstraints calendarConstraints) {
            this.f44498c = calendarConstraints;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setDayViewDecorator(@Nullable DayViewDecorator dayViewDecorator) {
            this.f44499d = dayViewDecorator;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setInputMode(int i10) {
            this.f44510p = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setNegativeButtonContentDescription(@StringRes int i10) {
            this.m = i10;
            this.f44508n = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setNegativeButtonText(@StringRes int i10) {
            this.f44506k = i10;
            this.f44507l = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setPositiveButtonContentDescription(@StringRes int i10) {
            this.f44504i = i10;
            this.f44505j = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setPositiveButtonText(@StringRes int i10) {
            this.f44502g = i10;
            this.f44503h = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setSelection(S s4) {
            this.f44509o = s4;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setTextInputFormat(@Nullable SimpleDateFormat simpleDateFormat) {
            this.f44496a.setTextInputFormat(simpleDateFormat);
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setTheme(@StyleRes int i10) {
            this.f44497b = i10;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setTitleText(@StringRes int i10) {
            this.f44500e = i10;
            this.f44501f = null;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setNegativeButtonContentDescription(@Nullable CharSequence charSequence) {
            this.f44508n = charSequence;
            this.m = 0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setNegativeButtonText(@Nullable CharSequence charSequence) {
            this.f44507l = charSequence;
            this.f44506k = 0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setPositiveButtonContentDescription(@Nullable CharSequence charSequence) {
            this.f44505j = charSequence;
            this.f44504i = 0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setPositiveButtonText(@Nullable CharSequence charSequence) {
            this.f44503h = charSequence;
            this.f44502g = 0;
            return this;
        }

        @NonNull
        @CanIgnoreReturnValue
        public Builder<S> setTitleText(@Nullable CharSequence charSequence) {
            this.f44501f = charSequence;
            this.f44500e = 0;
            return this;
        }
    }
}
