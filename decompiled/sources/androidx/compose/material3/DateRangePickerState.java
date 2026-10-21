package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001$B:\b\u0016\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010!\u001a\u00020\u000eø\u0001\u0000¢\u0006\u0004\b\"\u0010#J!\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\r\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR4\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006%"}, d2 = {"Landroidx/compose/material3/DateRangePickerState;", "", "", "startDateMillis", "endDateMillis", "", "setSelection", "(Ljava/lang/Long;Ljava/lang/Long;)V", "Landroidx/compose/material3/StateData;", "a", "Landroidx/compose/material3/StateData;", "getStateData$material3_release", "()Landroidx/compose/material3/StateData;", "stateData", "Landroidx/compose/material3/DisplayMode;", "<set-?>", "b", "Landroidx/compose/runtime/MutableState;", "getDisplayMode-jFl-4v0", "()I", "setDisplayMode-vCnGnXg", "(I)V", "displayMode", "getSelectedStartDateMillis", "()Ljava/lang/Long;", "selectedStartDateMillis", "getSelectedEndDateMillis", "selectedEndDateMillis", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/IntRange;", "yearRange", "initialDisplayMode", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,809:1\n76#2:810\n102#2,2:811\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerState\n*L\n274#1:810\n274#1:811,2\n*E\n"})
public final class DateRangePickerState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final StateData stateData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState displayMode;

    /* JADX INFO: compiled from: DateRangePicker.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/DateRangePickerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DateRangePickerState;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: DateRangePicker.kt */
        @SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerState$Companion$Saver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,809:1\n1#2:810\n*E\n"})
        public static final class a extends Lambda implements Function2<SaverScope, DateRangePickerState, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f10172p0 = new a(2);

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SaverScope saverScope, DateRangePickerState dateRangePickerState) {
                SaverScope Saver = saverScope;
                DateRangePickerState it = dateRangePickerState;
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(it, "it");
                return StateData.INSTANCE.Saver().save(Saver, it.getStateData());
            }
        }

        /* JADX INFO: compiled from: DateRangePicker.kt */
        @SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerState$Companion$Saver$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,809:1\n1#2:810\n*E\n"})
        public static final class b extends Lambda implements Function1<Object, DateRangePickerState> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final b f10173p0 = new b(1);

            @Override // kotlin.jvm.functions.Function1
            public final DateRangePickerState invoke(Object value) {
                Intrinsics.checkNotNullParameter(value, "value");
                StateData stateDataRestore = StateData.INSTANCE.Saver().restore(value);
                Intrinsics.checkNotNull(stateDataRestore);
                return new DateRangePickerState(stateDataRestore, null);
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<DateRangePickerState, ?> Saver() {
            return SaverKt.Saver(a.f10172p0, b.f10173p0);
        }
    }

    public /* synthetic */ DateRangePickerState(StateData stateData, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getDisplayMode-jFl-4v0, reason: not valid java name */
    public final int m1071getDisplayModejFl4v0() {
        return ((DisplayMode) this.displayMode.getValue()).getF10188a();
    }

    @Nullable
    public final Long getSelectedEndDateMillis() {
        CalendarDate value = this.stateData.getSelectedEndDate().getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @Nullable
    public final Long getSelectedStartDateMillis() {
        CalendarDate value = this.stateData.getSelectedStartDate().getValue();
        if (value != null) {
            return Long.valueOf(value.getUtcTimeMillis());
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: getStateData$material3_release, reason: from getter */
    public final StateData getStateData() {
        return this.stateData;
    }

    /* JADX INFO: renamed from: setDisplayMode-vCnGnXg, reason: not valid java name */
    public final void m1072setDisplayModevCnGnXg(int i10) {
        this.displayMode.setValue(DisplayMode.m1073boximpl(i10));
    }

    public final void setSelection(@Nullable Long startDateMillis, @Nullable Long endDateMillis) {
        this.stateData.setSelection(startDateMillis, endDateMillis);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DateRangePickerState(Long l6, Long l7, Long l10, IntRange yearRange, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(new StateData(l6, l7, l10, yearRange, i10, null));
        Intrinsics.checkNotNullParameter(yearRange, "yearRange");
    }

    public DateRangePickerState(StateData stateData) {
        this.stateData = stateData;
        this.displayMode = stateData.getDisplayMode();
    }
}
