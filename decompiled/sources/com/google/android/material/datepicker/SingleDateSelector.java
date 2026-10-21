package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.util.Pair;
import com.google.android.material.R;
import com.google.android.material.internal.ManufacturerUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes10.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new b();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @Nullable
    public CharSequence f44544p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @Nullable
    public Long f44545q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @Nullable
    public SimpleDateFormat f44546r0;

    public class a extends d {

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ OnSelectionChangedListener f44547x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ TextInputLayout f44548y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, SimpleDateFormat simpleDateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints, OnSelectionChangedListener onSelectionChangedListener, TextInputLayout textInputLayout2) {
            super(str, simpleDateFormat, textInputLayout, calendarConstraints);
            this.f44547x0 = onSelectionChangedListener;
            this.f44548y0 = textInputLayout2;
        }

        @Override // com.google.android.material.datepicker.d
        public final void b() {
            SingleDateSelector.this.f44544p0 = this.f44548y0.getError();
            this.f44547x0.onIncompleteSelectionChanged();
        }

        @Override // com.google.android.material.datepicker.d
        public final void c(@Nullable Long l6) {
            SingleDateSelector singleDateSelector = SingleDateSelector.this;
            if (l6 == null) {
                singleDateSelector.f44545q0 = null;
            } else {
                singleDateSelector.select(l6.longValue());
            }
            singleDateSelector.f44544p0 = null;
            this.f44547x0.onSelectionChanged(singleDateSelector.getSelection());
        }
    }

    public class b implements Parcelable.Creator<SingleDateSelector> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final SingleDateSelector createFromParcel(@NonNull Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            singleDateSelector.f44545q0 = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final SingleDateSelector[] newArray(int i10) {
            return new SingleDateSelector[i10];
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultThemeResId(Context context) {
        return MaterialAttributes.resolveOrThrow(context, R.attr.materialCalendarTheme, MaterialDatePicker.class.getCanonicalName());
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public int getDefaultTitleResId() {
        return R.string.mtrl_picker_date_header_title;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public String getError() {
        if (TextUtils.isEmpty(this.f44544p0)) {
            return null;
        }
        return this.f44544p0.toString();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Long> getSelectedDays() {
        ArrayList arrayList = new ArrayList();
        Long l6 = this.f44545q0;
        if (l6 != null) {
            arrayList.add(l6);
        }
        return arrayList;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public Collection<Pair<Long, Long>> getSelectedRanges() {
        return new ArrayList();
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionContentDescription(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l6 = this.f44545q0;
        return resources.getString(R.string.mtrl_picker_announce_current_selection, l6 == null ? resources.getString(R.string.mtrl_picker_announce_current_selection_none) : g.d(l6.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    @NonNull
    public String getSelectionDisplayString(@NonNull Context context) {
        Resources resources = context.getResources();
        Long l6 = this.f44545q0;
        if (l6 == null) {
            return resources.getString(R.string.mtrl_picker_date_header_unselected);
        }
        return resources.getString(R.string.mtrl_picker_date_header_selected, g.d(l6.longValue(), Locale.getDefault()));
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public boolean isSelectionComplete() {
        return this.f44545q0 != null;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public View onCreateTextInputView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle, CalendarConstraints calendarConstraints, @NonNull OnSelectionChangedListener<Long> onSelectionChangedListener) {
        View viewInflate = layoutInflater.inflate(R.layout.mtrl_picker_text_input_date, viewGroup, false);
        TextInputLayout textInputLayout = (TextInputLayout) viewInflate.findViewById(R.id.mtrl_picker_text_input_date);
        EditText editText = textInputLayout.getEditText();
        if (ManufacturerUtils.isDateInputKeyboardMissingSeparatorCharacters()) {
            editText.setInputType(17);
        }
        SimpleDateFormat simpleDateFormatE = this.f44546r0;
        boolean z10 = simpleDateFormatE != null;
        if (!z10) {
            simpleDateFormatE = w.e();
        }
        SimpleDateFormat simpleDateFormat = simpleDateFormatE;
        String pattern = z10 ? simpleDateFormat.toPattern() : w.f(viewInflate.getResources(), simpleDateFormat);
        textInputLayout.setPlaceholderText(pattern);
        Long l6 = this.f44545q0;
        if (l6 != null) {
            editText.setText(simpleDateFormat.format(l6));
        }
        editText.addTextChangedListener(new a(pattern, simpleDateFormat, textInputLayout, calendarConstraints, onSelectionChangedListener, textInputLayout));
        f.a(editText);
        return viewInflate;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void select(long j10) {
        this.f44545q0 = Long.valueOf(j10);
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setTextInputFormat(@Nullable SimpleDateFormat simpleDateFormat) {
        if (simpleDateFormat != null) {
            AtomicReference<v> atomicReference = w.f44608a;
            DateFormat dateFormat = (DateFormat) simpleDateFormat.clone();
            dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            simpleDateFormat = (SimpleDateFormat) dateFormat;
        }
        this.f44546r0 = simpleDateFormat;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeValue(this.f44545q0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.material.datepicker.DateSelector
    @Nullable
    public Long getSelection() {
        return this.f44545q0;
    }

    @Override // com.google.android.material.datepicker.DateSelector
    public void setSelection(@Nullable Long l6) {
        this.f44545q0 = l6 == null ? null : Long.valueOf(w.a(l6.longValue()));
    }
}
