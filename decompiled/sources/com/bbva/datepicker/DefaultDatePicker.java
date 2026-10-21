package com.bbva.datepicker;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import com.bbva.datepicker.extensions.ExtensionsKt;
import com.bbva.datepicker.model.DatePickerParams;
import com.bbva.datepicker.validator.DayValidator;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DefaultDatePicker.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ5\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0018\u0010\n\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0004\u0012\u00020\t0\u0006H\u0016ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/bbva/datepicker/DefaultDatePicker;", "Lcom/bbva/datepicker/DatePicker;", "Landroid/content/Context;", "context", "Lcom/bbva/datepicker/model/DatePickerParams;", "datePickerParams", "Lkotlin/Function1;", "Lkotlin/Result;", "Ljava/util/Date;", "", "onDatePicked", "show", "<init>", "()V", "datepicker_release"}, k = 1, mv = {1, 4, 2})
public final class DefaultDatePicker implements DatePicker {

    /* JADX INFO: compiled from: DefaultDatePicker.kt */
    public static final class a extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MaterialPickerOnPositiveButtonClickListener f28995p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function1 f28996q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, Function1 function1) {
            super(0);
            this.f28996q0 = function1;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Result.Companion companion = Result.INSTANCE;
            this.f28996q0.invoke(Result.m5534boximpl(Result.m5535constructorimpl(ResultKt.createFailure(new Exception("Cancelled")))));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DefaultDatePicker.kt */
    public static final class b<S> implements MaterialPickerOnPositiveButtonClickListener<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Function1 f28997a;

        public b(Function1 function1) {
            this.f28997a = function1;
        }

        @Override // com.google.android.material.datepicker.MaterialPickerOnPositiveButtonClickListener
        public final void onPositiveButtonClick(Long l6) {
            Long it = l6;
            Result.Companion companion = Result.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(it, "it");
            this.f28997a.invoke(Result.m5534boximpl(Result.m5535constructorimpl(new Date(it.longValue()))));
        }
    }

    @Override // com.bbva.datepicker.DatePicker
    public void show(@NotNull Context context, @NotNull DatePickerParams datePickerParams, @NotNull Function1<? super Result<? extends Date>, Unit> onDatePicked) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(datePickerParams, "datePickerParams");
        Intrinsics.checkNotNullParameter(onDatePicked, "onDatePicked");
        b bVar = new b(onDatePicked);
        MaterialDatePicker.Builder<Long> builderDatePicker = MaterialDatePicker.Builder.datePicker();
        builderDatePicker.setTitleText(context.getString(R.string.date_picker_title));
        builderDatePicker.setSelection(Long.valueOf(datePickerParams.getCurrentDate()));
        CalendarConstraints.Builder builder = new CalendarConstraints.Builder();
        long currentDate = datePickerParams.getCurrentDate();
        long j10 = datePickerParams.getCom.bbva.glomohybrid.landing.domain.aem.filters.LandingMinDateConditionFilter.ID java.lang.String();
        long j11 = datePickerParams.getCom.bbva.glomohybrid.landing.domain.aem.filters.LandingMaxDateConditionFilter.ID java.lang.String();
        builder.setValidator(new DayValidator(j10, j11, datePickerParams.getDisableWeekends()));
        if (ExtensionsKt.isNotEmpty(currentDate)) {
            builder.setOpenAt(currentDate);
        }
        if (ExtensionsKt.isNotEmpty(j10)) {
            builder.setStart(j10);
        }
        if (ExtensionsKt.isNotEmpty(j11)) {
            builder.setEnd(j11);
        }
        builderDatePicker.setCalendarConstraints(builder.build());
        MaterialDatePicker<Long> materialDatePickerBuild = builderDatePicker.build();
        Intrinsics.checkNotNullExpressionValue(materialDatePickerBuild, "with(MaterialDatePicker.…        build()\n        }");
        materialDatePickerBuild.addOnPositiveButtonClickListener(bVar);
        a aVar = new a(bVar, onDatePicked);
        materialDatePickerBuild.addOnNegativeButtonClickListener(new h6.a(aVar));
        materialDatePickerBuild.addOnCancelListener(new h6.b(aVar));
        materialDatePickerBuild.show(((AppCompatActivity) context).getSupportFragmentManager(), materialDatePickerBuild.toString());
    }
}
