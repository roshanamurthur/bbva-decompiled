package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.DpKt;
import androidx.compose.ui.unit.DpOffset;
import androidx.compose.ui.unit.IntOffset;
import com.noknok.android.client.utils.UIConfigTags;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TimePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\n\b\u0007\u0018\u0000 b2\u00020\u0001:\u0001bB\u001f\u0012\u0006\u0010]\u001a\u00020\u0002\u0012\u0006\u0010^\u001a\u00020\u0002\u0012\u0006\u0010_\u001a\u00020\u0013¢\u0006\u0004\b`\u0010aJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\u0006J'\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u0013H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001d\u001a\u00020\u0004H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0013\u0010\u001e\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001cJ3\u0010\"\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u0013H\u0080@ø\u0001\u0000¢\u0006\u0004\b \u0010!R\u0017\u0010%\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R$\u0010,\u001a\u00020'8@X\u0080\u0084\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R4\u00104\u001a\u00020-2\u0006\u0010.\u001a\u00020-8@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u0010+\"\u0004\b2\u00103R4\u0010:\u001a\u0002052\u0006\u0010.\u001a\u0002058@@@X\u0080\u008e\u0002ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0012\n\u0004\b6\u00100\u001a\u0004\b7\u00108\"\u0004\b9\u0010\u0006R+\u0010?\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u00138@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b;\u00100\u001a\u0004\b<\u0010&\"\u0004\b=\u0010>R+\u0010C\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u00138@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\b@\u00100\u001a\u0004\bA\u0010&\"\u0004\bB\u0010>R+\u0010I\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bD\u00100\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR+\u0010M\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020\u000b8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bJ\u00100\u001a\u0004\bK\u0010F\"\u0004\bL\u0010HR&\u0010T\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020O0N8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010SR\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bU\u00108R\u0011\u0010\b\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bV\u00108R\u0014\u0010X\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bW\u00108R\u001a\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00020Y8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006c"}, d2 = {"Landroidx/compose/material3/TimePickerState;", "", "", UIConfigTags.TAG_MINUTE, "", "setMinute$material3_release", "(I)V", "setMinute", "hour", "setHour$material3_release", "setHour", "", "x", "y", "maxDist", "moveSelector$material3_release", "(FFF)V", "moveSelector", "value", "", "isSelected$material3_release", "(I)Z", "isSelected", "fromTap", "update$material3_release", "(FZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "animateToCurrent$material3_release", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "animateToCurrent", "settle", "autoSwitchToMinute", "onTap$material3_release", "(FFFZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onTap", "a", "Z", "is24hour", "()Z", "Landroidx/compose/ui/unit/DpOffset;", "b", "Landroidx/compose/runtime/State;", "getSelectorPos-RKDOV3M$material3_release", "()J", "selectorPos", "Landroidx/compose/ui/unit/IntOffset;", "<set-?>", "c", "Landroidx/compose/runtime/MutableState;", "getCenter-nOcc-ac$material3_release", "setCenter--gyyYBs$material3_release", "(J)V", "center", "Landroidx/compose/material3/Selection;", "d", "getSelection-JiIwxys$material3_release", "()I", "setSelection-iHAOin8$material3_release", "selection", "e", "isAfternoonToggle$material3_release", "setAfternoonToggle$material3_release", "(Z)V", "isAfternoonToggle", "f", "isInnerCircle$material3_release", "setInnerCircle$material3_release", "isInnerCircle", "g", "getHourAngle$material3_release", "()F", "setHourAngle$material3_release", "(F)V", "hourAngle", "h", "getMinuteAngle$material3_release", "setMinuteAngle$material3_release", "minuteAngle", "Landroidx/compose/animation/core/Animatable;", "Landroidx/compose/animation/core/AnimationVector1D;", "k", "Landroidx/compose/animation/core/Animatable;", "getCurrentAngle$material3_release", "()Landroidx/compose/animation/core/Animatable;", "currentAngle", "getMinute", "getHour", "getHourForDisplay$material3_release", "hourForDisplay", "", "getValues$material3_release", "()Ljava/util/List;", "values", "initialHour", "initialMinute", "is24Hour", "<init>", "(IIZ)V", "Companion", "material3_release"}, k = 1, mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1672:1\n1#2:1673\n76#3:1674\n76#3:1675\n102#3,2:1676\n76#3:1678\n102#3,2:1679\n76#3:1681\n102#3,2:1682\n76#3:1684\n102#3,2:1685\n76#3:1687\n102#3,2:1688\n76#3:1690\n102#3,2:1691\n76#3:1693\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState\n*L\n507#1:1674\n523#1:1675\n523#1:1676,2\n526#1:1678\n526#1:1679,2\n527#1:1681\n527#1:1682,2\n528#1:1684\n528#1:1685,2\n530#1:1687\n530#1:1688,2\n531#1:1690\n531#1:1691,2\n534#1:1693\n*E\n"})
public final class TimePickerState {
    public static final int $stable = 0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public final boolean is24hour;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final State selectorPos;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState center;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState selection;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState isAfternoonToggle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState isInnerCircle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState hourAngle;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableState minuteAngle;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final MutatorMutex f12457i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final State f12458j;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Animatable<Float, AnimationVector1D> currentAngle;

    /* JADX INFO: compiled from: TimePicker.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¨\u0006\u0006"}, d2 = {"Landroidx/compose/material3/TimePickerState$Companion;", "", "()V", "Saver", "Landroidx/compose/runtime/saveable/Saver;", "Landroidx/compose/material3/TimePickerState;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: TimePicker.kt */
        public static final class a extends Lambda implements Function2<SaverScope, TimePickerState, List<? extends Object>> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final a f12460p0 = new a(2);

            @Override // kotlin.jvm.functions.Function2
            public final List<? extends Object> invoke(SaverScope saverScope, TimePickerState timePickerState) {
                SaverScope Saver = saverScope;
                TimePickerState it = timePickerState;
                Intrinsics.checkNotNullParameter(Saver, "$this$Saver");
                Intrinsics.checkNotNullParameter(it, "it");
                return CollectionsKt__CollectionsKt.listOf(Integer.valueOf(it.getHour()), Integer.valueOf(it.getMinute()), Boolean.valueOf(it.getIs24hour()));
            }
        }

        /* JADX INFO: compiled from: TimePicker.kt */
        public static final class b extends Lambda implements Function1<List, TimePickerState> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public static final b f12461p0 = new b(1);

            @Override // kotlin.jvm.functions.Function1
            public final TimePickerState invoke(List list) {
                List value = list;
                Intrinsics.checkNotNullParameter(value, "value");
                Object obj = value.get(0);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj).intValue();
                Object obj2 = value.get(1);
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue2 = ((Integer) obj2).intValue();
                Object obj3 = value.get(2);
                Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                return new TimePickerState(iIntValue, iIntValue2, ((Boolean) obj3).booleanValue());
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Saver<TimePickerState, ?> Saver() {
            return SaverKt.Saver(a.f12460p0, b.f12461p0);
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    @DebugMetadata(c = "androidx.compose.material3.TimePickerState", f = "TimePicker.kt", i = {0, 0}, l = {585, 586}, m = "animateToCurrent$material3_release", n = {"this", "end"}, s = {"L$0", "F$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TimePickerState f12462p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public float f12463q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f12464r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f12466t0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12464r0 = obj;
            this.f12466t0 |= Integer.MIN_VALUE;
            return TimePickerState.this.animateToCurrent$material3_release(this);
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    public static final class b extends Lambda implements Function0<Boolean> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            TimePickerState timePickerState = TimePickerState.this;
            return Boolean.valueOf((timePickerState.getIs24hour() && timePickerState.isInnerCircle$material3_release()) || timePickerState.isAfternoonToggle$material3_release());
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    @DebugMetadata(c = "androidx.compose.material3.TimePickerState", f = "TimePicker.kt", i = {0, 0, 0, 0, 0, 1, 1}, l = {620, 628, 629, 632}, m = "onTap$material3_release", n = {"this", "x", "y", "maxDist", "autoSwitchToMinute", "this", "targetValue"}, s = {"L$0", "F$0", "F$1", "F$2", "Z$0", "L$0", "L$1"})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TimePickerState f12468p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Pair f12469q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public float f12470r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public float f12471s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public float f12472t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public boolean f12473u0;
        public /* synthetic */ Object v0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public int f12475x0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v0 = obj;
            this.f12475x0 |= Integer.MIN_VALUE;
            return TimePickerState.this.onTap$material3_release(0.0f, 0.0f, 0.0f, false, this);
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    @SourceDebugExtension({"SMAP\nTimePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState$selectorPos$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1672:1\n75#2:1673\n58#2:1674\n51#2:1675\n88#2:1676\n75#2:1677\n51#2:1678\n88#2:1679\n75#2:1680\n51#2:1681\n*S KotlinDebug\n*F\n+ 1 TimePicker.kt\nandroidx/compose/material3/TimePickerState$selectorPos$2\n*L\n509#1:1673\n514#1:1674\n516#1:1675\n517#1:1676\n517#1:1677\n517#1:1678\n518#1:1679\n518#1:1680\n518#1:1681\n*E\n"})
    public static final class d extends Lambda implements Function0<DpOffset> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ boolean f12477q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z10) {
            super(0);
            this.f12477q0 = z10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DpOffset invoke() {
            TimePickerState timePickerState = TimePickerState.this;
            boolean zIsInnerCircle$material3_release = timePickerState.isInnerCircle$material3_release();
            TimePickerTokens timePickerTokens = TimePickerTokens.INSTANCE;
            float f6 = 2;
            float fM4389constructorimpl = Dp.m4389constructorimpl(timePickerTokens.m1983getClockDialSelectorHandleContainerSizeD9Ej5fM() / f6);
            float fM4389constructorimpl2 = Dp.m4389constructorimpl(Dp.m4389constructorimpl(((this.f12477q0 && zIsInnerCircle$material3_release && Selection.m1237equalsimpl0(timePickerState.m1419getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m1241getHourJiIwxys())) ? TimePickerKt.f12344b : TimePickerKt.f12343a) - fM4389constructorimpl) + fM4389constructorimpl);
            return DpOffset.m4444boximpl(DpKt.m4410DpOffsetYgX7TsA(Dp.m4389constructorimpl(Dp.m4389constructorimpl(timePickerTokens.m1981getClockDialContainerSizeD9Ej5fM() / f6) + Dp.m4389constructorimpl(((float) Math.cos(timePickerState.getCurrentAngle$material3_release().getValue().floatValue())) * fM4389constructorimpl2)), Dp.m4389constructorimpl(Dp.m4389constructorimpl(timePickerTokens.m1981getClockDialContainerSizeD9Ej5fM() / f6) + Dp.m4389constructorimpl(fM4389constructorimpl2 * ((float) Math.sin(timePickerState.getCurrentAngle$material3_release().getValue().floatValue()))))));
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    @DebugMetadata(c = "androidx.compose.material3.TimePickerState", f = "TimePicker.kt", i = {0, 0}, l = {615, 616}, m = "settle", n = {"this", "targetValue"}, s = {"L$0", "L$1"})
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TimePickerState f12478p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Pair f12479q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f12480r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f12482t0;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12480r0 = obj;
            this.f12482t0 |= Integer.MIN_VALUE;
            return TimePickerState.this.settle(this);
        }
    }

    /* JADX INFO: compiled from: TimePicker.kt */
    @DebugMetadata(c = "androidx.compose.material3.TimePickerState$update$2", f = "TimePicker.kt", i = {}, l = {571, 573}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function1<Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f12483p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f12485r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f12486s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(float f6, boolean z10, Continuation<? super f> continuation) {
            super(1, continuation);
            this.f12485r0 = f6;
            this.f12486s0 = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
            return TimePickerState.this.new f(this.f12485r0, this.f12486s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Continuation<? super Unit> continuation) {
            return ((f) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f12483p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                TimePickerState timePickerState = TimePickerState.this;
                boolean zM1237equalsimpl0 = Selection.m1237equalsimpl0(timePickerState.m1419getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m1241getHourJiIwxys());
                boolean z10 = this.f12486s0;
                float f6 = this.f12485r0;
                if (zM1237equalsimpl0) {
                    timePickerState.setHourAngle$material3_release((TimePickerState.access$toHour(timePickerState, f6) % 12) * 0.5235988f);
                } else if (z10) {
                    timePickerState.setMinuteAngle$material3_release((TimePickerState.access$toMinute(timePickerState, f6) - (TimePickerState.access$toMinute(timePickerState, f6) % 5)) * 0.10471976f);
                } else {
                    timePickerState.setMinuteAngle$material3_release(TimePickerState.access$toMinute(timePickerState, f6) * 0.10471976f);
                }
                if (z10) {
                    Animatable<Float, AnimationVector1D> currentAngle$material3_release = timePickerState.getCurrentAngle$material3_release();
                    Float fBoxFloat = Boxing.boxFloat(timePickerState.getMinuteAngle$material3_release());
                    this.f12483p0 = 1;
                    if (currentAngle$material3_release.snapTo(fBoxFloat, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    Animatable<Float, AnimationVector1D> currentAngle$material3_release2 = timePickerState.getCurrentAngle$material3_release();
                    Float fBoxFloat2 = Boxing.boxFloat(TimePickerState.access$offsetHour(timePickerState, f6));
                    this.f12483p0 = 2;
                    if (currentAngle$material3_release2.snapTo(fBoxFloat2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i10 != 1 && i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public TimePickerState(int i10, int i11, boolean z10) {
        if (i10 < 0 || i10 >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range".toString());
        }
        if (i11 < 0 || i11 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range".toString());
        }
        this.is24hour = z10;
        this.selectorPos = SnapshotStateKt.derivedStateOf(SnapshotStateKt.structuralEqualityPolicy(), new d(z10));
        this.center = SnapshotStateKt.mutableStateOf$default(IntOffset.m4498boximpl(IntOffset.INSTANCE.m4517getZeronOccac()), null, 2, null);
        this.selection = SnapshotStateKt.mutableStateOf$default(Selection.m1235boximpl(Selection.INSTANCE.m1241getHourJiIwxys()), null, 2, null);
        this.isAfternoonToggle = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(i10 >= 12 && !z10), null, 2, null);
        this.isInnerCircle = SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(i10 >= 12), null, 2, null);
        this.hourAngle = SnapshotStateKt.mutableStateOf$default(Float.valueOf(((i10 % 12) * 0.5235988f) - 1.5707964f), null, 2, null);
        this.minuteAngle = SnapshotStateKt.mutableStateOf$default(Float.valueOf((i11 * 0.10471976f) - 1.5707964f), null, 2, null);
        this.f12457i = new MutatorMutex();
        this.f12458j = SnapshotStateKt.derivedStateOf(new b());
        this.currentAngle = AnimatableKt.Animatable$default(getHourAngle$material3_release(), 0.0f, 2, null);
    }

    public static final float access$offsetHour(TimePickerState timePickerState, float f6) {
        timePickerState.getClass();
        float f10 = f6 + 1.5707964f;
        return f10 < 0.0f ? f10 + 6.2831855f : f10;
    }

    public static final int access$toHour(TimePickerState timePickerState, float f6) {
        timePickerState.getClass();
        return ((int) ((((double) f6) + (((double) 0.2617994f) + 1.5707963267948966d)) / ((double) 0.5235988f))) % 12;
    }

    public static final int access$toMinute(TimePickerState timePickerState, float f6) {
        timePickerState.getClass();
        return ((int) ((((double) f6) + (((double) 0.05235988f) + 1.5707963267948966d)) / ((double) 0.10471976f))) % 60;
    }

    public static /* synthetic */ Object update$material3_release$default(TimePickerState timePickerState, float f6, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return timePickerState.update$material3_release(f6, z10, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object animateToCurrent$material3_release(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        TimePickerState timePickerState;
        float f6;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f12466t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f12466t0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f12464r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar2.f12466t0;
        if (i11 != 0) {
            if (i11 == 1) {
                f6 = aVar2.f12463q0;
                timePickerState = aVar2.f12462p0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        Pair pairAccess$valuesForAnimation = Selection.m1237equalsimpl0(m1419getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m1241getHourJiIwxys()) ? TimePickerKt.access$valuesForAnimation(getMinuteAngle$material3_release(), getHourAngle$material3_release()) : TimePickerKt.access$valuesForAnimation(getHourAngle$material3_release(), getMinuteAngle$material3_release());
        float fFloatValue = ((Number) pairAccess$valuesForAnimation.component1()).floatValue();
        float fFloatValue2 = ((Number) pairAccess$valuesForAnimation.component2()).floatValue();
        Float fBoxFloat = Boxing.boxFloat(fFloatValue);
        aVar2.f12462p0 = this;
        aVar2.f12463q0 = fFloatValue2;
        aVar2.f12466t0 = 1;
        if (this.currentAngle.snapTo(fBoxFloat, aVar2) == coroutine_suspended) {
            return coroutine_suspended;
        }
        timePickerState = this;
        f6 = fFloatValue2;
        Animatable<Float, AnimationVector1D> animatable = timePickerState.currentAngle;
        Float fBoxFloat2 = Boxing.boxFloat(f6);
        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
        aVar2.f12462p0 = null;
        aVar2.f12466t0 = 2;
        if (Animatable.animateTo$default(animatable, fBoxFloat2, tweenSpecTween$default, null, null, aVar2, 12, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getCenter-nOcc-ac$material3_release, reason: not valid java name */
    public final long m1418getCenternOccac$material3_release() {
        return ((IntOffset) this.center.getValue()).getF18312a();
    }

    @NotNull
    public final Animatable<Float, AnimationVector1D> getCurrentAngle$material3_release() {
        return this.currentAngle;
    }

    public final int getHour() {
        return (((int) ((((double) getHourAngle$material3_release()) + (((double) 0.2617994f) + 1.5707963267948966d)) / ((double) 0.5235988f))) % 12) + (((Boolean) this.f12458j.getValue()).booleanValue() ? 12 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getHourAngle$material3_release() {
        return ((Number) this.hourAngle.getValue()).floatValue();
    }

    public final int getHourForDisplay$material3_release() {
        int hour = getHour();
        if (this.is24hour) {
            return hour % 24;
        }
        if (hour % 12 == 0) {
            return 12;
        }
        return ((Boolean) this.f12458j.getValue()).booleanValue() ? hour - 12 : hour;
    }

    public final int getMinute() {
        return ((int) ((((double) getMinuteAngle$material3_release()) + (((double) 0.05235988f) + 1.5707963267948966d)) / ((double) 0.10471976f))) % 60;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final float getMinuteAngle$material3_release() {
        return ((Number) this.minuteAngle.getValue()).floatValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getSelection-JiIwxys$material3_release, reason: not valid java name */
    public final int m1419getSelectionJiIwxys$material3_release() {
        return ((Selection) this.selection.getValue()).m1240unboximpl();
    }

    /* JADX INFO: renamed from: getSelectorPos-RKDOV3M$material3_release, reason: not valid java name */
    public final long m1420getSelectorPosRKDOV3M$material3_release() {
        return ((DpOffset) this.selectorPos.getValue()).getF18303a();
    }

    @NotNull
    public final List<Integer> getValues$material3_release() {
        return Selection.m1237equalsimpl0(m1419getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m1242getMinuteJiIwxys()) ? TimePickerKt.f12352j : TimePickerKt.f12353k;
    }

    /* JADX INFO: renamed from: is24hour, reason: from getter */
    public final boolean getIs24hour() {
        return this.is24hour;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isAfternoonToggle$material3_release() {
        return ((Boolean) this.isAfternoonToggle.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean isInnerCircle$material3_release() {
        return ((Boolean) this.isInnerCircle.getValue()).booleanValue();
    }

    public final boolean isSelected$material3_release(int value) {
        if (!Selection.m1237equalsimpl0(m1419getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m1242getMinuteJiIwxys())) {
            if (getHour() == value + (((Boolean) this.f12458j.getValue()).booleanValue() ? 12 : 0)) {
                return true;
            }
        } else if (value == getMinute()) {
            return true;
        }
        return false;
    }

    public final void moveSelector$material3_release(float x4, float y7, float maxDist) {
        if (Selection.m1237equalsimpl0(m1419getSelectionJiIwxys$material3_release(), Selection.INSTANCE.m1241getHourJiIwxys()) && this.is24hour) {
            setInnerCircle$material3_release(TimePickerKt.access$dist(x4, y7, IntOffset.m4507getXimpl(m1418getCenternOccac$material3_release()), IntOffset.m4508getYimpl(m1418getCenternOccac$material3_release())) < maxDist);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00f8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object onTap$material3_release(float f6, float f10, float f11, boolean z10, @NotNull Continuation<? super Unit> continuation) {
        c cVar;
        boolean z11;
        float f12;
        float f13;
        TimePickerState timePickerState;
        Pair pair;
        Animatable<Float, AnimationVector1D> animatable;
        Object second;
        TweenSpec tweenSpecTween$default;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f12475x0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f12475x0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        c cVar2 = cVar;
        Object obj = cVar2.v0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar2.f12475x0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            float fAccess$atan = TimePickerKt.access$atan(f10 - IntOffset.m4508getYimpl(m1418getCenternOccac$material3_release()), f6 - IntOffset.m4507getXimpl(m1418getCenternOccac$material3_release()));
            cVar2.f12468p0 = this;
            cVar2.f12470r0 = f6;
            cVar2.f12471s0 = f10;
            cVar2.f12472t0 = f11;
            cVar2.f12473u0 = z10;
            cVar2.f12475x0 = 1;
            if (update$material3_release(fAccess$atan, true, cVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            z11 = z10;
            f12 = f11;
            f13 = f10;
            timePickerState = this;
        } else {
            if (i11 != 1) {
                if (i11 == 2) {
                    pair = cVar2.f12469q0;
                    timePickerState = cVar2.f12468p0;
                    ResultKt.throwOnFailure(obj);
                    animatable = timePickerState.currentAngle;
                    second = pair.getSecond();
                    tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
                    cVar2.f12468p0 = null;
                    cVar2.f12469q0 = null;
                    cVar2.f12475x0 = 3;
                    if (Animatable.animateTo$default(animatable, second, tweenSpecTween$default, null, null, cVar2, 12, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
            boolean z12 = cVar2.f12473u0;
            float f14 = cVar2.f12472t0;
            float f15 = cVar2.f12471s0;
            f6 = cVar2.f12470r0;
            TimePickerState timePickerState2 = cVar2.f12468p0;
            ResultKt.throwOnFailure(obj);
            z11 = z12;
            f12 = f14;
            f13 = f15;
            timePickerState = timePickerState2;
        }
        timePickerState.moveSelector$material3_release(f6, f13, f12);
        int iM1419getSelectionJiIwxys$material3_release = timePickerState.m1419getSelectionJiIwxys$material3_release();
        Selection.Companion companion = Selection.INSTANCE;
        if (!Selection.m1237equalsimpl0(iM1419getSelectionJiIwxys$material3_release, companion.m1241getHourJiIwxys())) {
            cVar2.f12468p0 = null;
            cVar2.f12475x0 = 4;
            if (timePickerState.settle(cVar2) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (z11) {
            timePickerState.m1422setSelectioniHAOin8$material3_release(companion.m1242getMinuteJiIwxys());
            return Unit.INSTANCE;
        }
        Animatable<Float, AnimationVector1D> animatable2 = timePickerState.currentAngle;
        Pair pairAccess$valuesForAnimation = TimePickerKt.access$valuesForAnimation(animatable2.getValue().floatValue(), timePickerState.getHourAngle$material3_release());
        Object first = pairAccess$valuesForAnimation.getFirst();
        cVar2.f12468p0 = timePickerState;
        cVar2.f12469q0 = pairAccess$valuesForAnimation;
        cVar2.f12475x0 = 2;
        if (animatable2.snapTo((Float) first, cVar2) == coroutine_suspended) {
            return coroutine_suspended;
        }
        pair = pairAccess$valuesForAnimation;
        animatable = timePickerState.currentAngle;
        second = pair.getSecond();
        tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
        cVar2.f12468p0 = null;
        cVar2.f12469q0 = null;
        cVar2.f12475x0 = 3;
        if (Animatable.animateTo$default(animatable, second, tweenSpecTween$default, null, null, cVar2, 12, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    public final void setAfternoonToggle$material3_release(boolean z10) {
        this.isAfternoonToggle.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: setCenter--gyyYBs$material3_release, reason: not valid java name */
    public final void m1421setCentergyyYBs$material3_release(long j10) {
        this.center.setValue(IntOffset.m4498boximpl(j10));
    }

    public final void setHour$material3_release(int hour) {
        setInnerCircle$material3_release(hour >= 12);
        setHourAngle$material3_release(((hour % 12) * 0.5235988f) - 1.5707964f);
    }

    public final void setHourAngle$material3_release(float f6) {
        this.hourAngle.setValue(Float.valueOf(f6));
    }

    public final void setInnerCircle$material3_release(boolean z10) {
        this.isInnerCircle.setValue(Boolean.valueOf(z10));
    }

    public final void setMinute$material3_release(int minute) {
        setMinuteAngle$material3_release((minute * 0.10471976f) - 1.5707964f);
    }

    public final void setMinuteAngle$material3_release(float f6) {
        this.minuteAngle.setValue(Float.valueOf(f6));
    }

    /* JADX INFO: renamed from: setSelection-iHAOin8$material3_release, reason: not valid java name */
    public final void m1422setSelectioniHAOin8$material3_release(int i10) {
        this.selection.setValue(Selection.m1235boximpl(i10));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Object settle(@NotNull Continuation<? super Unit> continuation) {
        e eVar;
        Pair pairAccess$valuesForAnimation;
        TimePickerState timePickerState;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i10 = eVar.f12482t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f12482t0 = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        e eVar2 = eVar;
        Object obj = eVar2.f12480r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar2.f12482t0;
        if (i11 != 0) {
            if (i11 == 1) {
                pairAccess$valuesForAnimation = eVar2.f12479q0;
                timePickerState = eVar2.f12478p0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        Animatable<Float, AnimationVector1D> animatable = this.currentAngle;
        pairAccess$valuesForAnimation = TimePickerKt.access$valuesForAnimation(animatable.getValue().floatValue(), getMinuteAngle$material3_release());
        Object first = pairAccess$valuesForAnimation.getFirst();
        eVar2.f12478p0 = this;
        eVar2.f12479q0 = pairAccess$valuesForAnimation;
        eVar2.f12482t0 = 1;
        if (animatable.snapTo((Float) first, eVar2) == coroutine_suspended) {
            return coroutine_suspended;
        }
        timePickerState = this;
        Animatable<Float, AnimationVector1D> animatable2 = timePickerState.currentAngle;
        Object second = pairAccess$valuesForAnimation.getSecond();
        TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(200, 0, null, 6, null);
        eVar2.f12478p0 = null;
        eVar2.f12479q0 = null;
        eVar2.f12482t0 = 2;
        if (Animatable.animateTo$default(animatable2, second, tweenSpecTween$default, null, null, eVar2, 12, null) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object update$material3_release(float f6, boolean z10, @NotNull Continuation<? super Unit> continuation) {
        Object objMutate = this.f12457i.mutate(MutatePriority.UserInput, new f(f6, z10, null), continuation);
        return objMutate == ek.a.getCOROUTINE_SUSPENDED() ? objMutate : Unit.INSTANCE;
    }
}
