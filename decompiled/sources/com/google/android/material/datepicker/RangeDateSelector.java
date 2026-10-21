package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import androidx.core.util.Preconditions;
import com.google.android.material.R;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class RangeDateSelector implements DateSelector<Pair<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new c();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public CharSequence f44534p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f44535q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public Long f44536r0 = null;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @Nullable
    public Long f44537s0 = null;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @Nullable
    public Long f44538t0 = null;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @Nullable
    public Long f44539u0 = null;

    @Nullable
    public SimpleDateFormat v0;

    public class a extends d {
        public final /* synthetic */ OnSelectionChangedListener E0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f44540x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f44541y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, OnSelectionChangedListener onSelectionChangedListener) {
            super(str, simpleDateFormat, textInputLayout, calendarConstraints);
            this.f44540x0 = textInputLayout2;
            this.f44541y0 = textInputLayout3;
            this.E0 = onSelectionChangedListener;
        }

        @Override // com.google.android.material.datepicker.d
        public final void b() {
            RangeDateSelector rangeDateSelector = RangeDateSelector.this;
            rangeDateSelector.f44538t0 = null;
            RangeDateSelector.a(rangeDateSelector, this.f44540x0, this.f44541y0, this.E0);
        }

        @Override // com.google.android.material.datepicker.d
        public final void c(@Nullable Long l6) {
            RangeDateSelector rangeDateSelector = RangeDateSelector.this;
            rangeDateSelector.f44538t0 = l6;
            RangeDateSelector.a(rangeDateSelector, this.f44540x0, this.f44541y0, this.E0);
        }
    }

    public class b extends d {
        public final /* synthetic */ OnSelectionChangedListener E0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f44542x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f44543y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, TextInputLayout textInputLayout2, TextInputLayout textInputLayout3, OnSelectionChangedListener onSelectionChangedListener) {
            super(str, simpleDateFormat, textInputLayout, calendarConstraints);
            this.f44542x0 = textInputLayout2;
            this.f44543y0 = textInputLayout3;
            this.E0 = onSelectionChangedListener;
        }

        @Override // com.google.android.material.datepicker.d
        public final void b() {
            RangeDateSelector rangeDateSelector = RangeDateSelector.this;
            rangeDateSelector.f44539u0 = null;
            RangeDateSelector.a(rangeDateSelector, this.f44542x0, this.f44543y0, this.E0);
        }

        @Override // com.google.android.material.datepicker.d
        public final void c(@Nullable Long l6) {
            RangeDateSelector rangeDateSelector = RangeDateSelector.this;
            rangeDateSelector.f44539u0 = l6;
            RangeDateSelector.a(rangeDateSelector, this.f44542x0, this.f44543y0, this.E0);
        }
    }

    public class c implements Parcelable.Creator<RangeDateSelector> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final RangeDateSelector createFromParcel(@NonNull Parcel parcel) {
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            rangeDateSelector.f44536r0 = (Long) parcel.readValue(Long.class.getClassLoader());
            rangeDateSelector.f44537s0 = (Long) parcel.readValue(Long.class.getClassLoader());
            return rangeDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final RangeDateSelector[] newArray(int i10) {
            return new RangeDateSelector[i10];
        }
    }

    public static void a(RangeDateSelector rangeDateSelector, TextInputLayout textInputLayout, TextInputLayout textInputLayout2, OnSelectionChangedListener onSelectionChangedListener) {
        Long l6 = rangeDateSelector.f44538t0;
        if (l6 == null || rangeDateSelector.f44539u0 == null) {
            if (textInputLayout.getError() != null && rangeDateSelector.f44535q0.contentEquals(textInputLayout.getError())) {
                textInputLayout.setError(null);
            }
            if (textInputLayout2.getError() != null && " ".contentEquals(textInputLayout2.getError())) {
                textInputLayout2.setError(null);
            }
            onSelectionChangedListener.onIncompleteSelectionChanged();
        } else if (l6.longValue() <= rangeDateSelector.f44539u0.longValue()) {
            rangeDateSelector.f44536r0 = rangeDateSelector.f44538t0;
            rangeDateSelector.f44537s0 = rangeDateSelector.f44539u0;
            onSelectionChangedListener.onSelectionChanged(rangeDateSelector.getSelection());
        } else {
            textInputLayout.setError(rangeDateSelector.f44535q0);
            textInputLayout2.setError(" ");
            onSelectionChangedListener.onIncompleteSelectionChanged();
        }
        if (!TextUtils.isEmpty(textInputLayout.getError())) {
            rangeDateSelector.f44534p0 = textInputLayout.getError();
        } else if (TextUtils.isEmpty(textInputLayout2.getError())) {
            rangeDateSelector.f44534p0 = null;
        } else {
            rangeDateSelector.f44534p0 = textInputLayout2.getError();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(@NonNull Context context) {
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        return MaterialAttributes.resolveOrThrow(context, Math.min(displayMetrics.widthPixels, displayMetrics.heightPixels) > resources.getDimensionPixelSize(R.dimen.mtrl_calendar_maximum_default_fullscreen_minor_axis) ? R.attr.materialCalendarTheme : R.attr.materialCalendarFullscreenTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return R.string.mtrl_picker_range_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public String getError() {
        if (TextUtils.isEmpty(this.f44534p0)) {
            return null;
        }
        return this.f44534p0.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l6 = this.f44536r0;
        if (l6 != null) {
            arrayList.add(l6);
        }
        Long l7 = this.f44537s0;
        if (l7 != null) {
            arrayList.add(l7);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Pair<Long, Long>> getSelectedRanges() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Pair(this.f44536r0, this.f44537s0));
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionContentDescription(@NonNull Context context) {
        Resources resources = context.getResources();
        Pair<String, String> pairA = g.a(this.f44536r0, this.f44537s0);
        String str = pairA.first;
        String string = str == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : str;
        String str2 = pairA.second;
        return resources.getString(R.string.mtrl_picker_announce_current_range_selection, string, str2 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : str2);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionDisplayString(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l6 = this.f44536r0;
        if (l6 == null && this.f44537s0 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_unselected);
        }
        Long l7 = this.f44537s0;
        if (l7 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_start_selected, g.b(l6.longValue()));
        }
        if (l6 == null) {
            return resources.getString(R.string.mtrl_picker_range_header_only_end_selected, g.b(l7.longValue()));
        }
        Pair<String, String> pairA = g.a(l6, l7);
        return resources.getString(R.string.mtrl_picker_range_header_selected, pairA.first, pairA.second);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        Long l6 = this.f44536r0;
        return (l6 == null || this.f44537s0 == null || l6.longValue() > this.f44537s0.longValue()) ? false : true;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, CalendarConstraints calendarConstraints, @NonNull OnSelectionChangedListener<Pair<Long, Long>> onSelectionChangedListener) {
        View viewInflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date_range, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_range_start);
        TextInputLayout textInputLayout2 = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_range_end);
        EditText editText = textInputLayout.getEditText();
        EditText editText2 = textInputLayout2.getEditText();
        if (ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            editText.setInputType(17);
            editText2.setInputType(17);
        }
        this.f44535q0 = viewInflate.getResources().getString(R.string.mtrl_picker_invalid_range);
        SimpleDateFormat simpleDateFormatE = this.v0;
        boolean z10 = simpleDateFormatE != null;
        if (!z10) {
            simpleDateFormatE = w.e();
        }
        SimpleDateFormat simpleDateFormat = simpleDateFormatE;
        Long l6 = this.f44536r0;
        if (l6 != null) {
            editText.setText(simpleDateFormat.format(l6));
            this.f44538t0 = this.f44536r0;
        }
        Long l7 = this.f44537s0;
        if (l7 != null) {
            editText2.setText(simpleDateFormat.format(l7));
            this.f44539u0 = this.f44537s0;
        }
        String pattern = z10 ? simpleDateFormat.toPattern() : w.f(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        textInputLayout2.setPlaceholderText(pattern);
        editText.addTextChangedListener(new a(pattern, simpleDateFormat, textInputLayout, calendarConstraints, textInputLayout, textInputLayout2, onSelectionChangedListener));
        editText2.addTextChangedListener(new b(pattern, simpleDateFormat, textInputLayout2, calendarConstraints, textInputLayout, textInputLayout2, onSelectionChangedListener));
        f.a(editText, editText2);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j10) {
        Long l6 = this.f44536r0;
        if (l6 == null) {
            this.f44536r0 = Long.valueOf(j10);
        } else if (this.f44537s0 == null && l6.longValue() <= j10) {
            this.f44537s0 = Long.valueOf(j10);
        } else {
            this.f44537s0 = null;
            this.f44536r0 = Long.valueOf(j10);
        }
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(@Nullable SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            AtomicReference<v> atomicReference = w.f44608a;
            DateFormat dateFormat = (DateFormat) simpleDateFormat.clone();
            dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            simpleDateFormat = (SimpleDateFormat) dateFormat;
        }
        this.v0 = simpleDateFormat;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeValue(this.f44536r0);
        parcel.writeValue(this.f44537s0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Pair<Long, Long> getSelection() {
        return new Pair<>(this.f44536r0, this.f44537s0);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setSelection(@NonNull Pair<Long, Long> pair) {
        Long l6 = pair.first;
        if (l6 != null && pair.second != null) {
            Preconditions.checkArgument(l6.longValue() <= pair.second.longValue());
        }
        Long l7 = pair.first;
        this.f44536r0 = l7 == null ? null : Long.valueOf(w.a(l7.longValue()));
        Long l10 = pair.second;
        this.f44537s0 = l10 != null ? Long.valueOf(w.a(l10.longValue())) : null;
    }
}
