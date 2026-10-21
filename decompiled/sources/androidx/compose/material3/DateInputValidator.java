package androidx.compose.material3;

import androidx.compose.runtime.Stable;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DateInput.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\u000b\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Landroidx/compose/material3/DateInputValidator;", "", "Landroidx/compose/material3/CalendarDate;", "calendarDate", "Landroidx/compose/material3/InputIdentifier;", "inputIdentifier", "Ljava/util/Locale;", "locale", "", "validate-XivgLIo", "(Landroidx/compose/material3/CalendarDate;ILjava/util/Locale;)Ljava/lang/String;", "validate", "Landroidx/compose/material3/StateData;", "stateData", "Landroidx/compose/material3/DateInputFormat;", "dateInputFormat", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function1;", "", "", "dateValidator", "errorDatePattern", "errorDateOutOfYearRange", "errorInvalidNotAllowed", "errorInvalidRangeInput", "<init>", "(Landroidx/compose/material3/StateData;Landroidx/compose/material3/DateInputFormat;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class DateInputValidator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final StateData f9894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final DateInputFormat f9895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DatePickerFormatter f9896c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function1<Long, Boolean> f9897d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f9898e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f9899f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f9900g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f9901h;

    /* JADX WARN: Multi-variable type inference failed */
    public DateInputValidator(@NotNull StateData stateData, @NotNull DateInputFormat dateInputFormat, @NotNull DatePickerFormatter dateFormatter, @NotNull Function1<? super Long, Boolean> dateValidator, @NotNull String errorDatePattern, @NotNull String errorDateOutOfYearRange, @NotNull String errorInvalidNotAllowed, @NotNull String errorInvalidRangeInput) {
        Intrinsics.checkNotNullParameter(stateData, "stateData");
        Intrinsics.checkNotNullParameter(dateInputFormat, "dateInputFormat");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(dateValidator, "dateValidator");
        Intrinsics.checkNotNullParameter(errorDatePattern, "errorDatePattern");
        Intrinsics.checkNotNullParameter(errorDateOutOfYearRange, "errorDateOutOfYearRange");
        Intrinsics.checkNotNullParameter(errorInvalidNotAllowed, "errorInvalidNotAllowed");
        Intrinsics.checkNotNullParameter(errorInvalidRangeInput, "errorInvalidRangeInput");
        this.f9894a = stateData;
        this.f9895b = dateInputFormat;
        this.f9896c = dateFormatter;
        this.f9897d = dateValidator;
        this.f9898e = errorDatePattern;
        this.f9899f = errorDateOutOfYearRange;
        this.f9900g = errorInvalidNotAllowed;
        this.f9901h = errorInvalidRangeInput;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:24:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:26:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:27:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:32:0x00f6 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:? A[RETURN, SYNTHETIC] */
    @NotNull
    /* JADX INFO: renamed from: validate-XivgLIo, reason: not valid java name */
    public final String m1052validateXivgLIo(@Nullable CalendarDate calendarDate, int inputIdentifier, @NotNull Locale locale) {
        long utcTimeMillis;
        CalendarDate value;
        long utcTimeMillis2;
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (calendarDate == null) {
            String upperCase = this.f9895b.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String str = String.format(this.f9898e, Arrays.copyOf(new Object[]{upperCase}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(this, *args)");
            return str;
        }
        StateData stateData = this.f9894a;
        if (!stateData.getYearRange().contains(calendarDate.getYear())) {
            String str2 = String.format(this.f9899f, Arrays.copyOf(new Object[]{DatePickerKt.toLocalString(stateData.getYearRange().getFirst()), DatePickerKt.toLocalString(stateData.getYearRange().getLast())}, 2));
            Intrinsics.checkNotNullExpressionValue(str2, "format(this, *args)");
            return str2;
        }
        if (!this.f9897d.invoke(Long.valueOf(calendarDate.getUtcTimeMillis())).booleanValue()) {
            String str3 = String.format(this.f9900g, Arrays.copyOf(new Object[]{DatePickerFormatter.formatDate$material3_release$default(this.f9896c, calendarDate, stateData.getCalendarModel(), locale, false, 8, null)}, 1));
            Intrinsics.checkNotNullExpressionValue(str3, "format(this, *args)");
            return str3;
        }
        InputIdentifier.Companion companion = InputIdentifier.INSTANCE;
        if (InputIdentifier.m1150equalsimpl0(inputIdentifier, companion.m1156getStartDateInputJ2x2o4M())) {
            long utcTimeMillis3 = calendarDate.getUtcTimeMillis();
            CalendarDate value2 = stateData.getSelectedEndDate().getValue();
            if (utcTimeMillis3 < (value2 != null ? value2.getUtcTimeMillis() : Long.MAX_VALUE)) {
                if (InputIdentifier.m1150equalsimpl0(inputIdentifier, companion.m1154getEndDateInputJ2x2o4M())) {
                    return "";
                }
                utcTimeMillis = calendarDate.getUtcTimeMillis();
                value = stateData.getSelectedStartDate().getValue();
                if (value != null) {
                    utcTimeMillis2 = value.getUtcTimeMillis();
                } else {
                    utcTimeMillis2 = Long.MIN_VALUE;
                }
                if (utcTimeMillis > utcTimeMillis2) {
                    return "";
                }
            }
        } else {
            if (InputIdentifier.m1150equalsimpl0(inputIdentifier, companion.m1154getEndDateInputJ2x2o4M())) {
                return "";
            }
            utcTimeMillis = calendarDate.getUtcTimeMillis();
            value = stateData.getSelectedStartDate().getValue();
            if (value != null) {
                utcTimeMillis2 = value.getUtcTimeMillis();
            } else {
                utcTimeMillis2 = Long.MIN_VALUE;
            }
            if (utcTimeMillis > utcTimeMillis2) {
                return "";
            }
        }
        return this.f9901h;
    }
}
