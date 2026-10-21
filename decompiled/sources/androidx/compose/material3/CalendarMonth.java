package androidx.compose.material3;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.noknok.android.client.utils.UIConfigTags;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CalendarModel.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\u0006\u0010\u0015\u001a\u00020\u0004\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\u0006\u0010\u0017\u001a\u00020\u0011¢\u0006\u0004\b/\u00100J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J \u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nJ\t\u0010\r\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0004HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0011HÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u00042\b\b\u0002\u0010\u0014\u001a\u00020\u00042\b\b\u0002\u0010\u0015\u001a\u00020\u00042\b\b\u0002\u0010\u0016\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u0011HÆ\u0001J\t\u0010\u0019\u001a\u00020\bHÖ\u0001J\t\u0010\u001a\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0014\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0015\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010!R\u0017\u0010\u0016\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\u0017\u0010\u0017\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010.\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b,\u0010)\u001a\u0004\b-\u0010+¨\u00061"}, d2 = {"Landroidx/compose/material3/CalendarMonth;", "", "Lkotlin/ranges/IntRange;", UIConfigTags.TAG_YEARS, "", "indexIn", "Landroidx/compose/material3/CalendarModel;", "calendarModel", "", "skeleton", "Ljava/util/Locale;", "locale", "format", "component1", "component2", "component3", "component4", "", "component5", UIConfigTags.TAG_YEAR, UIConfigTags.TAG_MONTH, "numberOfDays", "daysFromStartOfWeekToFirstOfMonth", "startUtcTimeMillis", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getYear", "()I", "b", "getMonth", "c", "getNumberOfDays", "d", "getDaysFromStartOfWeekToFirstOfMonth", "e", "J", "getStartUtcTimeMillis", "()J", "f", "getEndUtcTimeMillis", "endUtcTimeMillis", "<init>", "(IIIIJ)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CalendarMonth {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final int year;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final int month;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final int numberOfDays;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final int daysFromStartOfWeekToFirstOfMonth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final long startUtcTimeMillis;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final long endUtcTimeMillis;

    public CalendarMonth(int i10, int i11, int i12, int i13, long j10) {
        this.year = i10;
        this.month = i11;
        this.numberOfDays = i12;
        this.daysFromStartOfWeekToFirstOfMonth = i13;
        this.startUtcTimeMillis = j10;
        this.endUtcTimeMillis = ((((long) i12) * 86400000) + j10) - 1;
    }

    public static /* synthetic */ CalendarMonth copy$default(CalendarMonth calendarMonth, int i10, int i11, int i12, int i13, long j10, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = calendarMonth.year;
        }
        if ((i14 & 2) != 0) {
            i11 = calendarMonth.month;
        }
        int i15 = i11;
        if ((i14 & 4) != 0) {
            i12 = calendarMonth.numberOfDays;
        }
        int i16 = i12;
        if ((i14 & 8) != 0) {
            i13 = calendarMonth.daysFromStartOfWeekToFirstOfMonth;
        }
        int i17 = i13;
        if ((i14 & 16) != 0) {
            j10 = calendarMonth.startUtcTimeMillis;
        }
        return calendarMonth.copy(i10, i15, i16, i17, j10);
    }

    public static /* synthetic */ String format$default(CalendarMonth calendarMonth, CalendarModel calendarModel, String str, Locale locale, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        }
        return calendarMonth.format(calendarModel, str, locale);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMonth() {
        return this.month;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNumberOfDays() {
        return this.numberOfDays;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getDaysFromStartOfWeekToFirstOfMonth() {
        return this.daysFromStartOfWeekToFirstOfMonth;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getStartUtcTimeMillis() {
        return this.startUtcTimeMillis;
    }

    @NotNull
    public final CalendarMonth copy(int year, int month, int numberOfDays, int daysFromStartOfWeekToFirstOfMonth, long startUtcTimeMillis) {
        return new CalendarMonth(year, month, numberOfDays, daysFromStartOfWeekToFirstOfMonth, startUtcTimeMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarMonth)) {
            return false;
        }
        CalendarMonth calendarMonth = (CalendarMonth) other;
        return this.year == calendarMonth.year && this.month == calendarMonth.month && this.numberOfDays == calendarMonth.numberOfDays && this.daysFromStartOfWeekToFirstOfMonth == calendarMonth.daysFromStartOfWeekToFirstOfMonth && this.startUtcTimeMillis == calendarMonth.startUtcTimeMillis;
    }

    @NotNull
    public final String format(@NotNull CalendarModel calendarModel, @NotNull String skeleton, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(calendarModel, "calendarModel");
        Intrinsics.checkNotNullParameter(skeleton, "skeleton");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return calendarModel.formatWithSkeleton(this, skeleton, locale);
    }

    public final int getDaysFromStartOfWeekToFirstOfMonth() {
        return this.daysFromStartOfWeekToFirstOfMonth;
    }

    public final long getEndUtcTimeMillis() {
        return this.endUtcTimeMillis;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getNumberOfDays() {
        return this.numberOfDays;
    }

    public final long getStartUtcTimeMillis() {
        return this.startUtcTimeMillis;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        int i10 = ((((((this.year * 31) + this.month) * 31) + this.numberOfDays) * 31) + this.daysFromStartOfWeekToFirstOfMonth) * 31;
        long j10 = this.startUtcTimeMillis;
        return i10 + ((int) (j10 ^ (j10 >>> 32)));
    }

    public final int indexIn(@NotNull IntRange years) {
        Intrinsics.checkNotNullParameter(years, "years");
        return (((this.year - years.getFirst()) * 12) + this.month) - 1;
    }

    @NotNull
    public String toString() {
        return "CalendarMonth(year=" + this.year + ", month=" + this.month + ", numberOfDays=" + this.numberOfDays + ", daysFromStartOfWeekToFirstOfMonth=" + this.daysFromStartOfWeekToFirstOfMonth + ", startUtcTimeMillis=" + this.startUtcTimeMillis + RootService.CLOSE_BRACKET;
    }
}
