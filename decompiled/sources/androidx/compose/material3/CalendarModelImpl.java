package androidx.compose.material3;

import androidx.annotation.RequiresApi;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.noknok.android.client.utils.UIConfigTags;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.chrono.Chronology;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.DateTimeParseException;
import java.time.format.DecimalStyle;
import java.time.format.FormatStyle;
import java.time.format.TextStyle;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CalendarModelImpl.android.kt */
/* JADX INFO: loaded from: classes.dex */
@RequiresApi(26)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\rH\u0016J \u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016R\u001a\u0010 \u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR,\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Landroidx/compose/material3/CalendarModelImpl;", "Landroidx/compose/material3/CalendarModel;", "Ljava/util/Locale;", "locale", "Landroidx/compose/material3/DateInputFormat;", "getDateInputFormat", "", "timeInMillis", "Landroidx/compose/material3/CalendarDate;", "getCanonicalDate", "Landroidx/compose/material3/CalendarMonth;", "getMonth", "date", "", UIConfigTags.TAG_YEAR, UIConfigTags.TAG_MONTH, "getDayOfWeek", "from", "addedMonthsCount", "plusMonths", "subtractedMonthsCount", "minusMonths", "utcTimeMillis", "", "pattern", "formatWithPattern", "parse", "toString", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFirstDayOfWeek", "()I", "firstDayOfWeek", "", "Lkotlin/Pair;", "b", "Ljava/util/List;", "getWeekdayNames", "()Ljava/util/List;", "weekdayNames", "getToday", "()Landroidx/compose/material3/CalendarDate;", "today", "<init>", "()V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCalendarModelImpl.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/CalendarModelImpl\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,213:1\n11335#2:214\n11670#2,3:215\n*S KotlinDebug\n*F\n+ 1 CalendarModelImpl.android.kt\nandroidx/compose/material3/CalendarModelImpl\n*L\n61#1:214\n61#1:215,3\n*E\n"})
public final class CalendarModelImpl implements CalendarModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final ZoneId f9536c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int firstDayOfWeek = WeekFields.of(Locale.getDefault()).getFirstDayOfWeek().getValue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final ArrayList f9538b;

    /* JADX INFO: compiled from: CalendarModelImpl.android.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/CalendarModelImpl$Companion;", "", "()V", "utcTimeZoneId", "Ljava/time/ZoneId;", "getUtcTimeZoneId$material3_release", "()Ljava/time/ZoneId;", "formatWithPattern", "", "utcTimeMillis", "", "pattern", "locale", "Ljava/util/Locale;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String formatWithPattern(long utcTimeMillis, @NotNull String pattern, @NotNull Locale locale) {
            Intrinsics.checkNotNullParameter(pattern, "pattern");
            Intrinsics.checkNotNullParameter(locale, "locale");
            DateTimeFormatter dateTimeFormatterWithDecimalStyle = DateTimeFormatter.ofPattern(pattern, locale).withDecimalStyle(DecimalStyle.of(locale));
            Intrinsics.checkNotNullExpressionValue(dateTimeFormatterWithDecimalStyle, "ofPattern(pattern, local…(DecimalStyle.of(locale))");
            String str = Instant.ofEpochMilli(utcTimeMillis).atZone(getUtcTimeZoneId$material3_release()).toLocalDate().format(dateTimeFormatterWithDecimalStyle);
            Intrinsics.checkNotNullExpressionValue(str, "ofEpochMilli(utcTimeMill…       .format(formatter)");
            return str;
        }

        @NotNull
        public final ZoneId getUtcTimeZoneId$material3_release() {
            return CalendarModelImpl.f9536c;
        }
    }

    static {
        ZoneId zoneIdOf = ZoneId.of("UTC");
        Intrinsics.checkNotNullExpressionValue(zoneIdOf, "of(\"UTC\")");
        f9536c = zoneIdOf;
    }

    public CalendarModelImpl() {
        Locale locale = Locale.getDefault();
        DayOfWeek[] dayOfWeekArrValues = DayOfWeek.values();
        ArrayList arrayList = new ArrayList(dayOfWeekArrValues.length);
        for (DayOfWeek dayOfWeek : dayOfWeekArrValues) {
            arrayList.add(TuplesKt.to(dayOfWeek.getDisplayName(TextStyle.FULL, locale), dayOfWeek.getDisplayName(TextStyle.NARROW, locale)));
        }
        this.f9538b = arrayList;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.time.ZonedDateTime] */
    public final CalendarMonth a(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - getFirstDayOfWeek();
        if (value < 0) {
            value += 7;
        }
        return new CalendarMonth(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.atTime(LocalTime.MIDNIGHT).atZone(f9536c).toInstant().toEpochMilli());
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public String formatWithPattern(long utcTimeMillis, @NotNull String pattern, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return INSTANCE.formatWithPattern(utcTimeMillis, pattern, locale);
    }

    @Override // androidx.compose.material3.CalendarModel
    public final /* synthetic */ String formatWithSkeleton(CalendarDate calendarDate, String str, Locale locale) {
        return l0.z.a(this, calendarDate, str, locale);
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarDate getCanonicalDate(long timeInMillis) {
        LocalDate localDate = Instant.ofEpochMilli(timeInMillis).atZone(f9536c).toLocalDate();
        return new CalendarDate(localDate.getYear(), localDate.getMonthValue(), localDate.getDayOfMonth(), localDate.atStartOfDay().toEpochSecond(ZoneOffset.UTC) * ((long) 1000));
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public DateInputFormat getDateInputFormat(@NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String localizedDateTimePattern = DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale);
        Intrinsics.checkNotNullExpressionValue(localizedDateTimePattern, "getLocalizedDateTimePatt…= */ locale\n            )");
        return CalendarModelKt.datePatternAsInputFormat(localizedDateTimePattern);
    }

    @Override // androidx.compose.material3.CalendarModel
    public int getDayOfWeek(@NotNull CalendarDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDate localDateOf = LocalDate.of(date.getYear(), date.getMonth(), date.getDayOfMonth());
        Intrinsics.checkNotNullExpressionValue(localDateOf, "of(\n            this.yea…this.dayOfMonth\n        )");
        return localDateOf.getDayOfWeek().getValue();
    }

    @Override // androidx.compose.material3.CalendarModel
    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth getMonth(long timeInMillis) {
        LocalDate localDate = Instant.ofEpochMilli(timeInMillis).atZone(f9536c).withDayOfMonth(1).toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "ofEpochMilli(timeInMilli…           .toLocalDate()");
        return a(localDate);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.time.ZonedDateTime] */
    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarDate getToday() {
        LocalDate localDateNow = LocalDate.now();
        return new CalendarDate(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.atTime(LocalTime.MIDNIGHT).atZone(f9536c).toInstant().toEpochMilli());
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public List<Pair<String, String>> getWeekdayNames() {
        return this.f9538b;
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth minusMonths(@NotNull CalendarMonth from, int subtractedMonthsCount) {
        Intrinsics.checkNotNullParameter(from, "from");
        if (subtractedMonthsCount <= 0) {
            return from;
        }
        LocalDate localDate = Instant.ofEpochMilli(from.getStartUtcTimeMillis()).atZone(f9536c).toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "ofEpochMilli(startUtcTim…TimeZoneId).toLocalDate()");
        LocalDate earlierMonth = localDate.minusMonths(subtractedMonthsCount);
        Intrinsics.checkNotNullExpressionValue(earlierMonth, "earlierMonth");
        return a(earlierMonth);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.time.ZonedDateTime] */
    @Override // androidx.compose.material3.CalendarModel
    @Nullable
    public CalendarDate parse(@NotNull String date, @NotNull String pattern) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        try {
            LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern(pattern));
            return new CalendarDate(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.atTime(LocalTime.MIDNIGHT).atZone(f9536c).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth plusMonths(@NotNull CalendarMonth from, int addedMonthsCount) {
        Intrinsics.checkNotNullParameter(from, "from");
        if (addedMonthsCount <= 0) {
            return from;
        }
        LocalDate localDate = Instant.ofEpochMilli(from.getStartUtcTimeMillis()).atZone(f9536c).toLocalDate();
        Intrinsics.checkNotNullExpressionValue(localDate, "ofEpochMilli(startUtcTim…TimeZoneId).toLocalDate()");
        LocalDate laterMonth = localDate.plusMonths(addedMonthsCount);
        Intrinsics.checkNotNullExpressionValue(laterMonth, "laterMonth");
        return a(laterMonth);
    }

    @NotNull
    public String toString() {
        return "CalendarModel";
    }

    @Override // androidx.compose.material3.CalendarModel
    public final /* synthetic */ String formatWithSkeleton(CalendarMonth calendarMonth, String str, Locale locale) {
        return l0.z.b(this, calendarMonth, str, locale);
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth getMonth(@NotNull CalendarDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        LocalDate localDateOf = LocalDate.of(date.getYear(), date.getMonth(), 1);
        Intrinsics.checkNotNullExpressionValue(localDateOf, "of(date.year, date.month, 1)");
        return a(localDateOf);
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth getMonth(int year, int month) {
        LocalDate localDateOf = LocalDate.of(year, month, 1);
        Intrinsics.checkNotNullExpressionValue(localDateOf, "of(year, month, 1)");
        return a(localDateOf);
    }
}
