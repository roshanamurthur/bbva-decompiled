package androidx.compose.material3;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.noknok.android.client.utils.UIConfigTags;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: CalendarModel.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B'\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b'\u0010(J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0000H\u0096\u0002J \u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u000fHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u000fHÆ\u0001J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u001a\u001a\u00020\u00192\b\u0010\u0002\u001a\u0004\u0018\u00010\u0018HÖ\u0003R\u0017\u0010\u0011\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0012\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0013\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Landroidx/compose/material3/CalendarDate;", "", "other", "", "compareTo", "Landroidx/compose/material3/CalendarModel;", "calendarModel", "", "skeleton", "Ljava/util/Locale;", "locale", "format", "component1", "component2", "component3", "", "component4", UIConfigTags.TAG_YEAR, UIConfigTags.TAG_MONTH, "dayOfMonth", "utcTimeMillis", "copy", "toString", GenerateActivationFormCommand.HASH_CODE, "", "", "equals", "p0", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getYear", "()I", "q0", "getMonth", "r0", "getDayOfMonth", "s0", "J", "getUtcTimeMillis", "()J", "<init>", "(IIIJ)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class CalendarDate implements Comparable<CalendarDate> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    public final int year;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    public final int month;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public final int dayOfMonth;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public final long utcTimeMillis;

    public CalendarDate(int i10, int i11, int i12, long j10) {
        this.year = i10;
        this.month = i11;
        this.dayOfMonth = i12;
        this.utcTimeMillis = j10;
    }

    public static /* synthetic */ CalendarDate copy$default(CalendarDate calendarDate, int i10, int i11, int i12, long j10, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i10 = calendarDate.year;
        }
        if ((i13 & 2) != 0) {
            i11 = calendarDate.month;
        }
        int i14 = i11;
        if ((i13 & 4) != 0) {
            i12 = calendarDate.dayOfMonth;
        }
        int i15 = i12;
        if ((i13 & 8) != 0) {
            j10 = calendarDate.utcTimeMillis;
        }
        return calendarDate.copy(i10, i14, i15, j10);
    }

    public static /* synthetic */ String format$default(CalendarDate calendarDate, CalendarModel calendarModel, String str, Locale locale, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            locale = Locale.getDefault();
            Intrinsics.checkNotNullExpressionValue(locale, "getDefault()");
        }
        return calendarDate.format(calendarModel, str, locale);
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
    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getUtcTimeMillis() {
        return this.utcTimeMillis;
    }

    @NotNull
    public final CalendarDate copy(int year, int month, int dayOfMonth, long utcTimeMillis) {
        return new CalendarDate(year, month, dayOfMonth, utcTimeMillis);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CalendarDate)) {
            return false;
        }
        CalendarDate calendarDate = (CalendarDate) other;
        return this.year == calendarDate.year && this.month == calendarDate.month && this.dayOfMonth == calendarDate.dayOfMonth && this.utcTimeMillis == calendarDate.utcTimeMillis;
    }

    @NotNull
    public final String format(@NotNull CalendarModel calendarModel, @NotNull String skeleton, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(calendarModel, "calendarModel");
        Intrinsics.checkNotNullParameter(skeleton, "skeleton");
        Intrinsics.checkNotNullParameter(locale, "locale");
        return calendarModel.formatWithSkeleton(this, skeleton, locale);
    }

    public final int getDayOfMonth() {
        return this.dayOfMonth;
    }

    public final int getMonth() {
        return this.month;
    }

    public final long getUtcTimeMillis() {
        return this.utcTimeMillis;
    }

    public final int getYear() {
        return this.year;
    }

    public int hashCode() {
        int i10 = ((((this.year * 31) + this.month) * 31) + this.dayOfMonth) * 31;
        long j10 = this.utcTimeMillis;
        return i10 + ((int) (j10 ^ (j10 >>> 32)));
    }

    @NotNull
    public String toString() {
        return "CalendarDate(year=" + this.year + ", month=" + this.month + ", dayOfMonth=" + this.dayOfMonth + ", utcTimeMillis=" + this.utcTimeMillis + RootService.CLOSE_BRACKET;
    }

    @Override // java.lang.Comparable
    public int compareTo(@NotNull CalendarDate other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return Intrinsics.compare(this.utcTimeMillis, other.utcTimeMillis);
    }
}
