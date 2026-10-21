package androidx.compose.material3;

import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.noknok.android.client.utils.UIConfigTags;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B.\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\tø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Landroidx/compose/material3/SelectedRangeInfo;", "", "Lkotlin/Pair;", "Landroidx/compose/ui/unit/IntOffset;", "a", "Lkotlin/Pair;", "getGridCoordinates", "()Lkotlin/Pair;", "gridCoordinates", "", "b", "Z", "getFirstIsSelectionStart", "()Z", "firstIsSelectionStart", "c", "getLastIsSelectionEnd", "lastIsSelectionEnd", "<init>", "(Lkotlin/Pair;ZZ)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
public final class SelectedRangeInfo {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Pair<IntOffset, IntOffset> gridCoordinates;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final boolean firstIsSelectionStart;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public final boolean lastIsSelectionEnd;

    /* JADX INFO: compiled from: DateRangePicker.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\b¨\u0006\n"}, d2 = {"Landroidx/compose/material3/SelectedRangeInfo$Companion;", "", "()V", "calculateRangeInfo", "Landroidx/compose/material3/SelectedRangeInfo;", UIConfigTags.TAG_MONTH, "Landroidx/compose/material3/CalendarMonth;", LogKeysKt.START_DATE, "Landroidx/compose/material3/CalendarDate;", LogKeysKt.END_DATE, "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final SelectedRangeInfo calculateRangeInfo(@NotNull CalendarMonth month, @Nullable CalendarDate startDate, @Nullable CalendarDate endDate) {
            Intrinsics.checkNotNullParameter(month, "month");
            if (startDate == null || endDate == null || startDate.getUtcTimeMillis() > month.getEndUtcTimeMillis() || endDate.getUtcTimeMillis() < month.getStartUtcTimeMillis()) {
                return null;
            }
            boolean z10 = startDate.getUtcTimeMillis() >= month.getStartUtcTimeMillis();
            boolean z11 = endDate.getUtcTimeMillis() <= month.getEndUtcTimeMillis();
            int dayOfMonth = z10 ? (startDate.getDayOfMonth() + month.getDaysFromStartOfWeekToFirstOfMonth()) - 1 : month.getDaysFromStartOfWeekToFirstOfMonth();
            int dayOfMonth2 = z11 ? (endDate.getDayOfMonth() + month.getDaysFromStartOfWeekToFirstOfMonth()) - 1 : (month.getNumberOfDays() + month.getDaysFromStartOfWeekToFirstOfMonth()) - 1;
            return new SelectedRangeInfo(new Pair(IntOffset.m4498boximpl(IntOffsetKt.IntOffset(dayOfMonth % 7, dayOfMonth / 7)), IntOffset.m4498boximpl(IntOffsetKt.IntOffset(dayOfMonth2 % 7, dayOfMonth2 / 7))), z10, z11);
        }
    }

    public SelectedRangeInfo(@NotNull Pair<IntOffset, IntOffset> gridCoordinates, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(gridCoordinates, "gridCoordinates");
        this.gridCoordinates = gridCoordinates;
        this.firstIsSelectionStart = z10;
        this.lastIsSelectionEnd = z11;
    }

    public final boolean getFirstIsSelectionStart() {
        return this.firstIsSelectionStart;
    }

    @NotNull
    public final Pair<IntOffset, IntOffset> getGridCoordinates() {
        return this.gridCoordinates;
    }

    public final boolean getLastIsSelectionEnd() {
        return this.lastIsSelectionEnd;
    }
}
