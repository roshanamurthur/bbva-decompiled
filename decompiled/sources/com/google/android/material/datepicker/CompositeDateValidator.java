package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class CompositeDateValidator implements CalendarConstraints.DateValidator {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final d f44471p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NonNull
    public final List<CalendarConstraints.DateValidator> f44472q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final a f44469r0 = new a();

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final b f44470s0 = new b();
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new c();

    public class a implements d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public final boolean a(@NonNull List<CalendarConstraints.DateValidator> list, long j10) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && dateValidator.isValid(j10)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public final int getId() {
            return 1;
        }
    }

    public class b implements d {
        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public final boolean a(@NonNull List<CalendarConstraints.DateValidator> list, long j10) {
            for (CalendarConstraints.DateValidator dateValidator : list) {
                if (dateValidator != null && !dateValidator.isValid(j10)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.material.datepicker.CompositeDateValidator.d
        public final int getId() {
            return 2;
        }
    }

    public class c implements Parcelable.Creator<CompositeDateValidator> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        public final CompositeDateValidator createFromParcel(@NonNull Parcel parcel) {
            ArrayList arrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int i10 = parcel.readInt();
            d dVar = CompositeDateValidator.f44470s0;
            if (i10 != 2 && i10 == 1) {
                dVar = CompositeDateValidator.f44469r0;
            }
            return new CompositeDateValidator((List) Preconditions.checkNotNull(arrayList), dVar);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        public final CompositeDateValidator[] newArray(int i10) {
            return new CompositeDateValidator[i10];
        }
    }

    public interface d {
        boolean a(@NonNull List<CalendarConstraints.DateValidator> list, long j10);

        int getId();
    }

    public CompositeDateValidator(@NonNull List<CalendarConstraints.DateValidator> list, d dVar) {
        this.f44472q0 = list;
        this.f44471p0 = dVar;
    }

    @NonNull
    public static CalendarConstraints.DateValidator allOf(@NonNull List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, f44470s0);
    }

    @NonNull
    public static CalendarConstraints.DateValidator anyOf(@NonNull List<CalendarConstraints.DateValidator> list) {
        return new CompositeDateValidator(list, f44469r0);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        return this.f44472q0.equals(compositeDateValidator.f44472q0) && this.f44471p0.getId() == compositeDateValidator.f44471p0.getId();
    }

    public int hashCode() {
        return this.f44472q0.hashCode();
    }

    @Override // com.google.android.material.datepicker.CalendarConstraints.DateValidator
    public boolean isValid(long j10) {
        return this.f44471p0.a(this.f44472q0, j10);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeList(this.f44472q0);
        parcel.writeInt(this.f44471p0.getId());
    }
}
