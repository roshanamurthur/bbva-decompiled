package androidx.compose.material3;

import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.noknok.android.client.utils.UIConfigTags;
import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LegacyCalendarModelImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 -2\u00020\u0001:\u0001-B\u0007¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0016J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\rH\u0016J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\rH\u0016J \u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001a\u0010\u001a\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001b\u001a\u00020\u0017H\u0016R\u001a\u0010 \u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR,\u0010'\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00170\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006."}, d2 = {"Landroidx/compose/material3/LegacyCalendarModelImpl;", "Landroidx/compose/material3/CalendarModel;", "Ljava/util/Locale;", "locale", "Landroidx/compose/material3/DateInputFormat;", "getDateInputFormat", "", "timeInMillis", "Landroidx/compose/material3/CalendarDate;", "getCanonicalDate", "Landroidx/compose/material3/CalendarMonth;", "getMonth", "date", "", UIConfigTags.TAG_YEAR, UIConfigTags.TAG_MONTH, "getDayOfWeek", "from", "addedMonthsCount", "plusMonths", "subtractedMonthsCount", "minusMonths", "utcTimeMillis", "", "pattern", "formatWithPattern", "parse", "toString", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getFirstDayOfWeek", "()I", "firstDayOfWeek", "", "Lkotlin/Pair;", "b", "Ljava/util/List;", "getWeekdayNames", "()Ljava/util/List;", "weekdayNames", "getToday", "()Landroidx/compose/material3/CalendarDate;", "today", "<init>", "()V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLegacyCalendarModelImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LegacyCalendarModelImpl.kt\nandroidx/compose/material3/LegacyCalendarModelImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,221:1\n1864#2,3:222\n*S KotlinDebug\n*F\n+ 1 LegacyCalendarModelImpl.kt\nandroidx/compose/material3/LegacyCalendarModelImpl\n*L\n57#1:222,3\n*E\n"})
public final class LegacyCalendarModelImpl implements CalendarModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final TimeZone f10508c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int firstDayOfWeek;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final List<Pair<String, String>> weekdayNames;

    /* JADX INFO: compiled from: LegacyCalendarModelImpl.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rR\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000e"}, d2 = {"Landroidx/compose/material3/LegacyCalendarModelImpl$Companion;", "", "()V", "utcTimeZone", "Ljava/util/TimeZone;", "getUtcTimeZone$material3_release", "()Ljava/util/TimeZone;", "formatWithPattern", "", "utcTimeMillis", "", "pattern", "locale", "Ljava/util/Locale;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
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
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern, locale);
            simpleDateFormat.setTimeZone(getUtcTimeZone$material3_release());
            Calendar calendar = Calendar.getInstance(getUtcTimeZone$material3_release());
            calendar.setTimeInMillis(utcTimeMillis);
            String str = simpleDateFormat.format(Long.valueOf(calendar.getTimeInMillis()));
            Intrinsics.checkNotNullExpressionValue(str, "dateFormat.format(calendar.timeInMillis)");
            return str;
        }

        @NotNull
        public final TimeZone getUtcTimeZone$material3_release() {
            return LegacyCalendarModelImpl.f10508c;
        }
    }

    static {
        TimeZone timeZone = TimeZone.getTimeZone("UTC");
        Intrinsics.checkNotNullExpressionValue(timeZone, "getTimeZone(\"UTC\")");
        f10508c = timeZone;
    }

    public LegacyCalendarModelImpl() {
        int firstDayOfWeek = (Calendar.getInstance().getFirstDayOfWeek() + 6) % 7;
        this.firstDayOfWeek = firstDayOfWeek != 0 ? firstDayOfWeek : 7;
        List listCreateListBuilder = bk.d.createListBuilder();
        String[] weekdays = new DateFormatSymbols(Locale.getDefault()).getWeekdays();
        String[] shortWeekdays = new DateFormatSymbols(Locale.getDefault()).getShortWeekdays();
        Intrinsics.checkNotNullExpressionValue(weekdays, "weekdays");
        int i10 = 0;
        for (Object obj : ArraysKt___ArraysKt.drop(weekdays, 2)) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.throwIndexOverflow();
            }
            listCreateListBuilder.add(new Pair((String) obj, shortWeekdays[i10 + 2]));
            i10 = i11;
        }
        listCreateListBuilder.add(new Pair(weekdays[1], shortWeekdays[1]));
        this.weekdayNames = bk.d.build(listCreateListBuilder);
    }

    public final CalendarMonth a(Calendar calendar) {
        int i10 = (calendar.get(7) + 6) % 7;
        int firstDayOfWeek = (i10 != 0 ? i10 : 7) - getFirstDayOfWeek();
        if (firstDayOfWeek < 0) {
            firstDayOfWeek += 7;
        }
        return new CalendarMonth(calendar.get(1), calendar.get(2) + 1, calendar.getActualMaximum(5), firstDayOfWeek, calendar.getTimeInMillis());
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
        Calendar calendar = Calendar.getInstance(f10508c);
        calendar.setTimeInMillis(timeInMillis);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public DateInputFormat getDateInputFormat(@NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        DateFormat dateInstance = DateFormat.getDateInstance(3, locale);
        Intrinsics.checkNotNull(dateInstance, "null cannot be cast to non-null type java.text.SimpleDateFormat");
        String pattern = ((SimpleDateFormat) dateInstance).toPattern();
        Intrinsics.checkNotNullExpressionValue(pattern, "DateFormat.getDateInstan…leDateFormat).toPattern()");
        return CalendarModelKt.datePatternAsInputFormat(pattern);
    }

    @Override // androidx.compose.material3.CalendarModel
    public int getDayOfWeek(@NotNull CalendarDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        TimeZone timeZone = TimeZone.getDefault();
        Intrinsics.checkNotNullExpressionValue(timeZone, "getDefault()");
        Calendar calendar = Calendar.getInstance(timeZone);
        calendar.clear();
        calendar.set(1, date.getYear());
        calendar.set(2, date.getMonth() - 1);
        calendar.set(5, date.getDayOfMonth());
        Intrinsics.checkNotNullExpressionValue(calendar, "calendar");
        int i10 = (calendar.get(7) + 6) % 7;
        if (i10 == 0) {
            return 7;
        }
        return i10;
    }

    @Override // androidx.compose.material3.CalendarModel
    public int getFirstDayOfWeek() {
        return this.firstDayOfWeek;
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth getMonth(long timeInMillis) {
        Calendar firstDayCalendar = Calendar.getInstance(f10508c);
        firstDayCalendar.setTimeInMillis(timeInMillis);
        firstDayCalendar.set(5, 1);
        firstDayCalendar.set(11, 0);
        firstDayCalendar.set(12, 0);
        firstDayCalendar.set(13, 0);
        firstDayCalendar.set(14, 0);
        Intrinsics.checkNotNullExpressionValue(firstDayCalendar, "firstDayCalendar");
        return a(firstDayCalendar);
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarDate getToday() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis() + ((long) (calendar.get(16) + calendar.get(15))));
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public List<Pair<String, String>> getWeekdayNames() {
        return this.weekdayNames;
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth minusMonths(@NotNull CalendarMonth from, int subtractedMonthsCount) {
        Intrinsics.checkNotNullParameter(from, "from");
        if (subtractedMonthsCount <= 0) {
            return from;
        }
        Calendar calendar = Calendar.getInstance(f10508c);
        calendar.setTimeInMillis(from.getStartUtcTimeMillis());
        Intrinsics.checkNotNullExpressionValue(calendar, "calendar");
        calendar.add(2, -subtractedMonthsCount);
        return a(calendar);
    }

    @Override // androidx.compose.material3.CalendarModel
    @Nullable
    public CalendarDate parse(@NotNull String date, @NotNull String pattern) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        TimeZone timeZone = f10508c;
        simpleDateFormat.setTimeZone(timeZone);
        simpleDateFormat.setLenient(false);
        try {
            Date date2 = simpleDateFormat.parse(date);
            if (date2 == null) {
                return null;
            }
            Calendar calendar = Calendar.getInstance(timeZone);
            calendar.setTime(date2);
            return new CalendarDate(calendar.get(1), calendar.get(2) + 1, calendar.get(5), calendar.getTimeInMillis());
        } catch (ParseException unused) {
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
        Calendar calendar = Calendar.getInstance(f10508c);
        calendar.setTimeInMillis(from.getStartUtcTimeMillis());
        Intrinsics.checkNotNullExpressionValue(calendar, "calendar");
        calendar.add(2, addedMonthsCount);
        return a(calendar);
    }

    @NotNull
    public String toString() {
        return "LegacyCalendarModel";
    }

    @Override // androidx.compose.material3.CalendarModel
    public final /* synthetic */ String formatWithSkeleton(CalendarMonth calendarMonth, String str, Locale locale) {
        return l0.z.b(this, calendarMonth, str, locale);
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth getMonth(@NotNull CalendarDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        return getMonth(date.getYear(), date.getMonth());
    }

    @Override // androidx.compose.material3.CalendarModel
    @NotNull
    public CalendarMonth getMonth(int year, int month) {
        Calendar firstDayCalendar = Calendar.getInstance(f10508c);
        firstDayCalendar.clear();
        firstDayCalendar.set(1, year);
        firstDayCalendar.set(2, month - 1);
        firstDayCalendar.set(5, 1);
        Intrinsics.checkNotNullExpressionValue(firstDayCalendar, "firstDayCalendar");
        return a(firstDayCalendar);
    }
}
