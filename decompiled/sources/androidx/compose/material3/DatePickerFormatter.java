package androidx.compose.material3;

import androidx.compose.runtime.Immutable;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.noknok.android.client.utils.UIConfigTags;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Immutable
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u001b\u001a\u00020\b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\b\u0012\b\b\u0002\u0010!\u001a\u00020\b¢\u0006\u0004\b\"\u0010#J+\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0012\u001a\u0004\u0018\u00010\b2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0015H\u0016R\u001a\u0010\u001b\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001aR\u001a\u0010!\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0018\u001a\u0004\b \u0010\u001a¨\u0006$"}, d2 = {"Landroidx/compose/material3/DatePickerFormatter;", "", "Landroidx/compose/material3/CalendarMonth;", UIConfigTags.TAG_MONTH, "Landroidx/compose/material3/CalendarModel;", "calendarModel", "Ljava/util/Locale;", "locale", "", "formatMonthYear$material3_release", "(Landroidx/compose/material3/CalendarMonth;Landroidx/compose/material3/CalendarModel;Ljava/util/Locale;)Ljava/lang/String;", "formatMonthYear", "Landroidx/compose/material3/CalendarDate;", "date", "", "forContentDescription", "formatDate$material3_release", "(Landroidx/compose/material3/CalendarDate;Landroidx/compose/material3/CalendarModel;Ljava/util/Locale;Z)Ljava/lang/String;", "formatDate", "other", "equals", "", GenerateActivationFormCommand.HASH_CODE, "a", "Ljava/lang/String;", "getYearSelectionSkeleton$material3_release", "()Ljava/lang/String;", "yearSelectionSkeleton", "b", "getSelectedDateSkeleton$material3_release", "selectedDateSkeleton", "c", "getSelectedDateDescriptionSkeleton$material3_release", "selectedDateDescriptionSkeleton", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class DatePickerFormatter {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String yearSelectionSkeleton;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String selectedDateSkeleton;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String selectedDateDescriptionSkeleton;

    public DatePickerFormatter() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ String formatDate$material3_release$default(DatePickerFormatter datePickerFormatter, CalendarDate calendarDate, CalendarModel calendarModel, Locale locale, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return datePickerFormatter.formatDate$material3_release(calendarDate, calendarModel, locale, z10);
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof DatePickerFormatter)) {
            return false;
        }
        DatePickerFormatter datePickerFormatter = (DatePickerFormatter) other;
        return Intrinsics.areEqual(this.yearSelectionSkeleton, datePickerFormatter.yearSelectionSkeleton) && Intrinsics.areEqual(this.selectedDateSkeleton, datePickerFormatter.selectedDateSkeleton) && Intrinsics.areEqual(this.selectedDateDescriptionSkeleton, datePickerFormatter.selectedDateDescriptionSkeleton);
    }

    @Nullable
    public final String formatDate$material3_release(@Nullable CalendarDate date, @NotNull CalendarModel calendarModel, @NotNull Locale locale, boolean forContentDescription) {
        Intrinsics.checkNotNullParameter(calendarModel, "calendarModel");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (date == null) {
            return null;
        }
        return calendarModel.formatWithSkeleton(date, forContentDescription ? this.selectedDateDescriptionSkeleton : this.selectedDateSkeleton, locale);
    }

    @Nullable
    public final String formatMonthYear$material3_release(@Nullable CalendarMonth month, @NotNull CalendarModel calendarModel, @NotNull Locale locale) {
        Intrinsics.checkNotNullParameter(calendarModel, "calendarModel");
        Intrinsics.checkNotNullParameter(locale, "locale");
        if (month == null) {
            return null;
        }
        return calendarModel.formatWithSkeleton(month, this.yearSelectionSkeleton, locale);
    }

    @NotNull
    /* JADX INFO: renamed from: getSelectedDateDescriptionSkeleton$material3_release, reason: from getter */
    public final String getSelectedDateDescriptionSkeleton() {
        return this.selectedDateDescriptionSkeleton;
    }

    @NotNull
    /* JADX INFO: renamed from: getSelectedDateSkeleton$material3_release, reason: from getter */
    public final String getSelectedDateSkeleton() {
        return this.selectedDateSkeleton;
    }

    @NotNull
    /* JADX INFO: renamed from: getYearSelectionSkeleton$material3_release, reason: from getter */
    public final String getYearSelectionSkeleton() {
        return this.yearSelectionSkeleton;
    }

    public int hashCode() {
        return this.selectedDateDescriptionSkeleton.hashCode() + androidx.camera.camera2.internal.n1.c(this.selectedDateSkeleton, this.yearSelectionSkeleton.hashCode() * 31, 31);
    }

    public DatePickerFormatter(@NotNull String yearSelectionSkeleton, @NotNull String selectedDateSkeleton, @NotNull String selectedDateDescriptionSkeleton) {
        Intrinsics.checkNotNullParameter(yearSelectionSkeleton, "yearSelectionSkeleton");
        Intrinsics.checkNotNullParameter(selectedDateSkeleton, "selectedDateSkeleton");
        Intrinsics.checkNotNullParameter(selectedDateDescriptionSkeleton, "selectedDateDescriptionSkeleton");
        this.yearSelectionSkeleton = yearSelectionSkeleton;
        this.selectedDateSkeleton = selectedDateSkeleton;
        this.selectedDateDescriptionSkeleton = selectedDateDescriptionSkeleton;
    }

    public /* synthetic */ DatePickerFormatter(String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? DatePickerDefaults.YearMonthSkeleton : str, (i10 & 2) != 0 ? DatePickerDefaults.YearAbbrMonthDaySkeleton : str2, (i10 & 4) != 0 ? DatePickerDefaults.YearMonthWeekdayDaySkeleton : str3);
    }
}
