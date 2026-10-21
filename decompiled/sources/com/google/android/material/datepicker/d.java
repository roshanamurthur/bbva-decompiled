package com.google.android.material.datepicker;

import android.text.Editable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R;
import com.google.android.material.internal.TextWatcherAdapter;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.text.Typography;

/* JADX INFO: compiled from: DateFormatTextWatcher.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class d extends TextWatcherAdapter {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NonNull
    public final TextInputLayout f44567p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final String f44568q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final DateFormat f44569r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final CalendarConstraints f44570s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final String f44571t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final h2.q f44572u0;
    public c v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public int f44573w0 = 0;

    public d(String str, SimpleDateFormat simpleDateFormat, @NonNull TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f44568q0 = str;
        this.f44569r0 = simpleDateFormat;
        this.f44567p0 = textInputLayout;
        this.f44570s0 = calendarConstraints;
        this.f44571t0 = textInputLayout.getContext().getString(R.string.mtrl_picker_out_of_range);
        this.f44572u0 = new h2.q(this, str, 3);
    }

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public final void afterTextChanged(@NonNull Editable editable) {
        if (Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) || editable.length() == 0) {
            return;
        }
        int length = editable.length();
        String str = this.f44568q0;
        if (length >= str.length() || editable.length() < this.f44573w0) {
            return;
        }
        char cCharAt = str.charAt(editable.length());
        if (Character.isLetterOrDigit(cCharAt)) {
            return;
        }
        editable.append(cCharAt);
    }

    public abstract void b();

    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public final void beforeTextChanged(@NonNull CharSequence charSequence, int i10, int i11, int i12) {
        this.f44573w0 = charSequence.length();
    }

    public abstract void c(@Nullable Long l6);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v3, types: [com.google.android.material.datepicker.c, java.lang.Runnable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.material.internal.TextWatcherAdapter, android.text.TextWatcher
    public final void onTextChanged(@NonNull CharSequence charSequence, int i10, int i11, int i12) {
        CalendarConstraints calendarConstraints = this.f44570s0;
        TextInputLayout textInputLayout = this.f44567p0;
        h2.q qVar = this.f44572u0;
        textInputLayout.removeCallbacks(qVar);
        textInputLayout.removeCallbacks(this.v0);
        textInputLayout.setError(null);
        c(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f44568q0.length()) {
            return;
        }
        try {
            Date date = this.f44569r0.parse(charSequence.toString());
            textInputLayout.setError(null);
            final long time = date.getTime();
            if (calendarConstraints.getDateValidator().isValid(time)) {
                Calendar calendarD = w.d(calendarConstraints.f44456p0.f44521p0);
                calendarD.set(5, 1);
                if (calendarD.getTimeInMillis() <= time) {
                    Month month = calendarConstraints.f44457q0;
                    int i13 = month.f44525t0;
                    Calendar calendarD2 = w.d(month.f44521p0);
                    calendarD2.set(5, i13);
                    if (time <= calendarD2.getTimeInMillis()) {
                        c(Long.valueOf(date.getTime()));
                        return;
                    }
                }
            }
            ?? r10 = new Runnable() { // from class: com.google.android.material.datepicker.c
                @Override // java.lang.Runnable
                public final void run() {
                    d dVar = this.f44565p0;
                    dVar.getClass();
                    dVar.f44567p0.setError(String.format(dVar.f44571t0, g.b(time).replace(' ', Typography.nbsp)));
                    dVar.b();
                }
            };
            this.v0 = r10;
            textInputLayout.post(r10);
        } catch (ParseException unused) {
            textInputLayout.post(qVar);
        }
    }
}
