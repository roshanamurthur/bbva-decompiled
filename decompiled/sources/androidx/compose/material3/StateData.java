package androidx.compose.material3;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.saveable.ListSaverKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\r\b\u0001\u0018\u0000 ?2\u00020\u0001:\u0001?B8\u0012\b\u00109\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010:\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010;\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0012\u001a\u00020\r\u0012\u0006\u0010<\u001a\u00020\bø\u0001\u0001¢\u0006\u0004\b=\u0010>J!\u0010\u0006\u001a\u00020\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R*\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001e\"\u0004\b$\u0010 R+\u0010-\u001a\u00020&2\u0006\u0010'\u001a\u00020&8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b(\u0010\u001c\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00198\u0006@\u0006X\u0086\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b.\u0010\u001c\u001a\u0004\b/\u0010\u001e\"\u0004\b0\u0010 R\u0011\u00102\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b1\u0010*R\u0011\u00106\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u00108\u001a\u0002038F¢\u0006\u0006\u001a\u0004\b7\u00105\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006@"}, d2 = {"Landroidx/compose/material3/StateData;", "", "", "startDateMillis", "endDateMillis", "", "setSelection", "(Ljava/lang/Long;Ljava/lang/Long;)V", "Landroidx/compose/material3/DisplayMode;", "displayMode", "switchDisplayMode-vCnGnXg", "(I)V", "switchDisplayMode", "Lkotlin/ranges/IntRange;", "a", "Lkotlin/ranges/IntRange;", "getYearRange", "()Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/CalendarModel;", "b", "Landroidx/compose/material3/CalendarModel;", "getCalendarModel", "()Landroidx/compose/material3/CalendarModel;", "calendarModel", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/material3/CalendarDate;", "c", "Landroidx/compose/runtime/MutableState;", "getSelectedStartDate", "()Landroidx/compose/runtime/MutableState;", "setSelectedStartDate", "(Landroidx/compose/runtime/MutableState;)V", "selectedStartDate", "d", "getSelectedEndDate", "setSelectedEndDate", "selectedEndDate", "Landroidx/compose/material3/CalendarMonth;", "<set-?>", "e", "getDisplayedMonth", "()Landroidx/compose/material3/CalendarMonth;", "setDisplayedMonth", "(Landroidx/compose/material3/CalendarMonth;)V", "displayedMonth", "f", "getDisplayMode", "setDisplayMode", "getCurrentMonth", "currentMonth", "", "getDisplayedMonthIndex", "()I", "displayedMonthIndex", "getTotalMonthsInRange", "totalMonthsInRange", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "initialDisplayMode", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/StateData\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1920:1\n76#2:1921\n102#2,2:1922\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/StateData\n*L\n871#1:1921\n871#1:1922,2\n*E\n"})
public final class StateData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final IntRange yearRange;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final CalendarModel calendarModel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public MutableState<CalendarDate> selectedStartDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public MutableState<CalendarDate> selectedEndDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState displayedMonth;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public MutableState<DisplayMode> displayMode;

    /* JADX INFO: compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/StateData$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/StateData;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: DatePicker.kt */
        public static final class a extends Lambda implements Function2<SaverScope, StateData, List<? extends Object>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f11620p0 = new a(2);

            @Override // kotlin.jvm.functions.Function2
            public final List<? extends Object> invoke(SaverScope saverScope, StateData stateData) {
                SaverScope listSaver = saverScope;
                StateData it = stateData;
                Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
                Intrinsics.checkNotNullParameter(it, "it");
                Object[] objArr = new Object[6];
                CalendarDate value = it.getSelectedStartDate().getValue();
                objArr[0] = value != null ? Long.valueOf(value.getUtcTimeMillis()) : null;
                CalendarDate value2 = it.getSelectedEndDate().getValue();
                objArr[1] = value2 != null ? Long.valueOf(value2.getUtcTimeMillis()) : null;
                objArr[2] = Long.valueOf(it.getDisplayedMonth().getStartUtcTimeMillis());
                objArr[3] = Integer.valueOf(it.getYearRange().getFirst());
                objArr[4] = Integer.valueOf(it.getYearRange().getLast());
                objArr[5] = Integer.valueOf(it.getDisplayMode().getValue().getF10188a());
                return CollectionsKt__CollectionsKt.listOf(objArr);
            }
        }

        /* JADX INFO: compiled from: DatePicker.kt */
        public static final class b extends Lambda implements Function1<List, StateData> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final b f11621p0 = new b(1);

            @Override // kotlin.jvm.functions.Function1
            public final StateData invoke(List list) {
                List value = list;
                Intrinsics.checkNotNullParameter(value, "value");
                Long l6 = (Long) value.get(0);
                Long l7 = (Long) value.get(1);
                Long l10 = (Long) value.get(2);
                Object obj = value.get(3);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj).intValue();
                Object obj2 = value.get(4);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                IntRange intRange = new IntRange(iIntValue, ((Integer) obj2).intValue());
                Object obj3 = value.get(5);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
                return new StateData(l6, l7, l10, intRange, DisplayMode.m1074constructorimpl(((Integer) obj3).intValue()), null);
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<StateData, Object> Saver() {
            return ListSaverKt.listSaver(a.f11620p0, b.f11621p0);
        }
    }

    public StateData(Long l6, Long l7, Long l10, IntRange yearRange, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        CalendarMonth currentMonth;
        Intrinsics.checkNotNullParameter(yearRange, "yearRange");
        this.yearRange = yearRange;
        CalendarModel CalendarModel = CalendarModel_androidKt.CalendarModel();
        this.calendarModel = CalendarModel;
        this.selectedStartDate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.selectedEndDate = SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        setSelection(l6, l7);
        if (l10 != null) {
            currentMonth = CalendarModel.getMonth(l10.longValue());
            if (!yearRange.contains(currentMonth.getYear())) {
                throw new IllegalArgumentException(("The initial display month's year (" + currentMonth.getYear() + ") is out of the years range of " + yearRange + '.').toString());
            }
        } else {
            currentMonth = getCurrentMonth();
        }
        this.displayedMonth = SnapshotStateKt.mutableStateOf$default(currentMonth, null, 2, null);
        this.displayMode = SnapshotStateKt.mutableStateOf$default(DisplayMode.m1073boximpl(i10), null, 2, null);
    }

    @NotNull
    public final CalendarModel getCalendarModel() {
        return this.calendarModel;
    }

    @NotNull
    public final CalendarMonth getCurrentMonth() {
        CalendarModel calendarModel = this.calendarModel;
        return calendarModel.getMonth(calendarModel.getToday());
    }

    @NotNull
    public final MutableState<DisplayMode> getDisplayMode() {
        return this.displayMode;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final CalendarMonth getDisplayedMonth() {
        return (CalendarMonth) this.displayedMonth.getValue();
    }

    public final int getDisplayedMonthIndex() {
        return getDisplayedMonth().indexIn(this.yearRange);
    }

    @NotNull
    public final MutableState<CalendarDate> getSelectedEndDate() {
        return this.selectedEndDate;
    }

    @NotNull
    public final MutableState<CalendarDate> getSelectedStartDate() {
        return this.selectedStartDate;
    }

    public final int getTotalMonthsInRange() {
        IntRange intRange = this.yearRange;
        return ((intRange.getLast() - intRange.getFirst()) + 1) * 12;
    }

    @NotNull
    public final IntRange getYearRange() {
        return this.yearRange;
    }

    public final void setDisplayMode(@NotNull MutableState<DisplayMode> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.displayMode = mutableState;
    }

    public final void setDisplayedMonth(@NotNull CalendarMonth calendarMonth) {
        Intrinsics.checkNotNullParameter(calendarMonth, "<set-?>");
        this.displayedMonth.setValue(calendarMonth);
    }

    public final void setSelectedEndDate(@NotNull MutableState<CalendarDate> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.selectedEndDate = mutableState;
    }

    public final void setSelectedStartDate(@NotNull MutableState<CalendarDate> mutableState) {
        Intrinsics.checkNotNullParameter(mutableState, "<set-?>");
        this.selectedStartDate = mutableState;
    }

    public final void setSelection(@Nullable Long startDateMillis, @Nullable Long endDateMillis) {
        CalendarModel calendarModel = this.calendarModel;
        CalendarDate canonicalDate = startDateMillis != null ? calendarModel.getCanonicalDate(startDateMillis.longValue()) : null;
        CalendarDate canonicalDate2 = endDateMillis != null ? calendarModel.getCanonicalDate(endDateMillis.longValue()) : null;
        IntRange intRange = this.yearRange;
        if (canonicalDate != null && !intRange.contains(canonicalDate.getYear())) {
            throw new IllegalArgumentException(("The provided start date year (" + canonicalDate.getYear() + ") is out of the years range of " + intRange + '.').toString());
        }
        if (canonicalDate2 != null && !intRange.contains(canonicalDate2.getYear())) {
            throw new IllegalArgumentException(("The provided end date year (" + canonicalDate2.getYear() + ") is out of the years range of " + intRange + '.').toString());
        }
        if (canonicalDate2 != null) {
            if (canonicalDate == null) {
                throw new IllegalArgumentException("An end date was provided without a start date.".toString());
            }
            if (canonicalDate.getUtcTimeMillis() > canonicalDate2.getUtcTimeMillis()) {
                throw new IllegalArgumentException("The provided end date appears before the start date.".toString());
            }
        }
        this.selectedStartDate.setValue(canonicalDate);
        this.selectedEndDate.setValue(canonicalDate2);
    }

    /* JADX INFO: renamed from: switchDisplayMode-vCnGnXg, reason: not valid java name */
    public final void m1250switchDisplayModevCnGnXg(int displayMode) {
        CalendarDate value = this.selectedStartDate.getValue();
        if (value != null) {
            setDisplayedMonth(this.calendarModel.getMonth(value));
        }
        if (this.selectedStartDate.getValue() == null && this.selectedEndDate.getValue() != null) {
            this.selectedEndDate.setValue(null);
        }
        this.displayMode.setValue(DisplayMode.m1073boximpl(displayMode));
    }
}
