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

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000  2\u00020\u0001:\u0001 B0\b\u0016\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR4\u0010\u0015\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006!"}, d2 = {"Landroidx/compose/material3/DatePickerState;", "", "", "dateMillis", "", "setSelection", "(Ljava/lang/Long;)V", "Landroidx/compose/material3/StateData;", "a", "Landroidx/compose/material3/StateData;", "getStateData$material3_release", "()Landroidx/compose/material3/StateData;", "stateData", "Landroidx/compose/material3/DisplayMode;", "<set-?>", "b", "Landroidx/compose/runtime/MutableState;", "getDisplayMode-jFl-4v0", "()I", "setDisplayMode-vCnGnXg", "(I)V", "displayMode", "getSelectedDateMillis", "()Ljava/lang/Long;", "selectedDateMillis", "initialSelectedDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/IntRange;", "yearRange", "initialDisplayMode", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1920:1\n76#2:1921\n102#2,2:1922\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerState\n*L\n307#1:1921\n307#1:1922,2\n*E\n"})
public final class DatePickerState {
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

    /* JADX INFO: compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/DatePickerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/DatePickerState;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: DatePicker.kt */
        @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerState$Companion$Saver$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1920:1\n1#2:1921\n*E\n"})
        public static final class a extends Lambda implements Function2<SaverScope, DatePickerState, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f10084p0 = new a(2);

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SaverScope saverScope, DatePickerState datePickerState) {
                SaverScope Saver = saverScope;
                DatePickerState it = datePickerState;
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(it, "it");
                return StateData.INSTANCE.Saver().save(Saver, it.getStateData());
            }
        }

        /* JADX INFO: compiled from: DatePicker.kt */
        @SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerState$Companion$Saver$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1920:1\n1#2:1921\n*E\n"})
        public static final class b extends Lambda implements Function1<Object, DatePickerState> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final b f10085p0 = new b(1);

            @Override // kotlin.jvm.functions.Function1
            public final DatePickerState invoke(Object value) {
                Intrinsics.checkNotNullParameter(value, "value");
                StateData stateDataRestore = StateData.INSTANCE.Saver().restore(value);
                Intrinsics.checkNotNull(stateDataRestore);
                return new DatePickerState(stateDataRestore, null);
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<DatePickerState, ?> Saver() {
            return SaverKt.Saver(a.f10084p0, b.f10085p0);
        }
    }

    public /* synthetic */ DatePickerState(StateData stateData, DefaultConstructorMarker defaultConstructorMarker) {
        this(stateData);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getDisplayMode-jFl-4v0, reason: not valid java name */
    public final int m1067getDisplayModejFl4v0() {
        return ((DisplayMode) this.displayMode.getValue()).getF10188a();
    }

    @Nullable
    public final Long getSelectedDateMillis() {
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
    public final void m1068setDisplayModevCnGnXg(int i10) {
        this.displayMode.setValue(DisplayMode.m1073boximpl(i10));
    }

    public final void setSelection(@Nullable Long dateMillis) {
        this.stateData.setSelection(dateMillis, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DatePickerState(Long l6, Long l7, IntRange yearRange, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(new StateData(l6, null, l7, yearRange, i10, null));
        Intrinsics.checkNotNullParameter(yearRange, "yearRange");
    }

    public DatePickerState(StateData stateData) {
        this.stateData = stateData;
        this.displayMode = stateData.getDisplayMode();
    }
}
