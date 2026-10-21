package androidx.compose.material3;

import androidx.compose.animation.CrossfadeKt;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0083\u0001\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0015\b\u0002\u0010\r\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\u0015\b\u0002\u0010\u000e\u001a\u000f\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0002\b\f2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001aM\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u0019H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001c\u001a)\u0010%\u001a\u00020\u000b*\u00020\u001e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0000ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b#\u0010$\"\u001a\u0010+\u001a\u00020&8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006,"}, d2 = {"Landroidx/compose/material3/DateRangePickerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function1;", "", "", "dateValidator", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "title", "headline", "showModeToggle", "Landroidx/compose/material3/DatePickerColors;", "colors", "DateRangePicker", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;ZLandroidx/compose/material3/DatePickerColors;Landroidx/compose/runtime/Composer;II)V", "initialSelectedStartDateMillis", "initialSelectedEndDateMillis", "initialDisplayedMonthMillis", "Lkotlin/ranges/IntRange;", "yearRange", "Landroidx/compose/material3/DisplayMode;", "initialDisplayMode", "rememberDateRangePickerState-pMw4iz8", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Lkotlin/ranges/IntRange;ILandroidx/compose/runtime/Composer;II)Landroidx/compose/material3/DateRangePickerState;", "rememberDateRangePickerState", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "Landroidx/compose/material3/SelectedRangeInfo;", "selectedRangeInfo", "Landroidx/compose/ui/graphics/Color;", "color", "drawRangeBackground-mxwnekA", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;Landroidx/compose/material3/SelectedRangeInfo;J)V", "drawRangeBackground", "Landroidx/compose/foundation/layout/PaddingValues;", "a", "Landroidx/compose/foundation/layout/PaddingValues;", "getCalendarMonthSubheadPadding", "()Landroidx/compose/foundation/layout/PaddingValues;", "CalendarMonthSubheadPadding", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,809:1\n25#2:810\n36#2:818\n460#2,13:844\n473#2,3:858\n36#2:863\n50#2:870\n49#2:871\n1114#3,6:811\n1114#3,6:819\n1114#3,6:864\n1114#3,6:872\n58#4:817\n74#5,6:825\n80#5:857\n84#5:862\n75#6:831\n76#6,11:833\n89#6:861\n76#7:832\n154#8:878\n154#8:879\n154#8:880\n154#8:881\n154#8:882\n154#8:883\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt\n*L\n88#1:810\n490#1:818\n493#1:844,13\n493#1:858,3\n521#1:863\n585#1:870\n585#1:871\n88#1:811,6\n490#1:819,6\n521#1:864,6\n585#1:872,6\n128#1:817\n493#1:825,6\n493#1:857\n493#1:862\n493#1:831\n493#1:833,11\n493#1:861\n493#1:832\n613#1:878\n614#1:879\n615#1:880\n801#1:881\n803#1:882\n808#1:883\n*E\n"})
public final class DateRangePickerKt {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final PaddingValues f10124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final PaddingValues f10125c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final PaddingValues f10123a = PaddingKt.m293PaddingValuesa9UjIt4$default(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(20), 0.0f, Dp.m4389constructorimpl(8), 4, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f10126d = Dp.m4389constructorimpl(60);

    /* JADX INFO: compiled from: DateRangePicker.kt */
    public static final class a extends Lambda implements Function1<Long, Boolean> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f10127p0 = new a(1);

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(Long l6) {
            l6.longValue();
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: DateRangePicker.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DateRangePickerState f10128p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f10129q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DateRangePickerState dateRangePickerState, int i10) {
            super(2);
            this.f10128p0 = dateRangePickerState;
            this.f10129q0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(492752701, iIntValue, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:89)");
                }
                DateRangePickerDefaults.INSTANCE.DateRangePickerTitle(this.f10128p0, PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.f10124b), composer2, (this.f10129q0 & 14) | 432, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateRangePicker.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DateRangePickerState f10130p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DatePickerFormatter f10131q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f10132r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DateRangePickerState dateRangePickerState, DatePickerFormatter datePickerFormatter, int i10) {
            super(2);
            this.f10130p0 = dateRangePickerState;
            this.f10131q0 = datePickerFormatter;
            this.f10132r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-204181785, iIntValue, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:95)");
                }
                DateRangePickerDefaults dateRangePickerDefaults = DateRangePickerDefaults.INSTANCE;
                DateRangePickerState dateRangePickerState = this.f10130p0;
                DatePickerFormatter datePickerFormatter = this.f10131q0;
                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DateRangePickerKt.f10125c);
                int i10 = this.f10132r0;
                dateRangePickerDefaults.DateRangePickerHeadline(dateRangePickerState, datePickerFormatter, modifierPadding, composer2, (i10 & 14) | 3456 | ((i10 >> 3) & 112), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateRangePicker.kt */
    @SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$DateRangePicker$5\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,809:1\n36#2:810\n1114#3,6:811\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$DateRangePicker$5\n*L\n115#1:810\n115#1:811,6\n*E\n"})
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DateRangePickerState f10133p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(DateRangePickerState dateRangePickerState, int i10) {
            super(2);
            this.f10133p0 = dateRangePickerState;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1062265737, iIntValue, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:110)");
                }
                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, DatePickerKt.getDatePickerModeTogglePadding());
                DateRangePickerState dateRangePickerState = this.f10133p0;
                int iM1071getDisplayModejFl4v0 = dateRangePickerState.m1071getDisplayModejFl4v0();
                composer2.startReplaceableGroup(1157296644);
                boolean zChanged = composer2.changed(dateRangePickerState);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new v0(dateRangePickerState);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                DatePickerKt.m1065DisplayModeToggleButtontER2X8s(modifierPadding, iM1071getDisplayModejFl4v0, (Function1) objRememberedValue, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateRangePicker.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DateRangePickerState f10134p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DatePickerFormatter f10135q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Boolean> f10136r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ DatePickerColors f10137s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f10138t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(DateRangePickerState dateRangePickerState, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function1, DatePickerColors datePickerColors, int i10) {
            super(2);
            this.f10134p0 = dateRangePickerState;
            this.f10135q0 = datePickerFormatter;
            this.f10136r0 = function1;
            this.f10137s0 = datePickerColors;
            this.f10138t0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-186850856, iIntValue, -1, "androidx.compose.material3.DateRangePicker.<anonymous> (DateRangePicker.kt:130)");
                }
                DateRangePickerState dateRangePickerState = this.f10134p0;
                DatePickerFormatter datePickerFormatter = this.f10135q0;
                Function1<Long, Boolean> function1 = this.f10136r0;
                DatePickerColors datePickerColors = this.f10137s0;
                int i10 = this.f10138t0;
                int i11 = i10 >> 3;
                DateRangePickerKt.access$SwitchableDateEntryContent(dateRangePickerState, datePickerFormatter, function1, datePickerColors, composer2, (i10 & 14) | (i11 & 112) | (i11 & 896) | ((i10 >> 12) & 7168));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateRangePicker.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ DateRangePickerState f10139p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10140q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ DatePickerFormatter f10141r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Boolean> f10142s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10143t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10144u0;
        public final /* synthetic */ boolean v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ DatePickerColors f10145w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f10146x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f10147y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(DateRangePickerState dateRangePickerState, Modifier modifier, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function1, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, boolean z10, DatePickerColors datePickerColors, int i10, int i11) {
            super(2);
            this.f10139p0 = dateRangePickerState;
            this.f10140q0 = modifier;
            this.f10141r0 = datePickerFormatter;
            this.f10142s0 = function1;
            this.f10143t0 = function2;
            this.f10144u0 = function3;
            this.v0 = z10;
            this.f10145w0 = datePickerColors;
            this.f10146x0 = i10;
            this.f10147y0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            DateRangePickerKt.DateRangePicker(this.f10139p0, this.f10140q0, this.f10141r0, this.f10142s0, this.f10143t0, this.f10144u0, this.v0, this.f10145w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10146x0 | 1), this.f10147y0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateRangePicker.kt */
    @SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1\n+ 2 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 3 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n*L\n1#1,809:1\n474#2,4:810\n478#2,2:818\n482#2:824\n25#3:814\n1114#4,3:815\n1117#4,3:821\n474#5:820\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerKt$VerticalMonthsList$1\n*L\n532#1:810,4\n532#1:818,2\n532#1:824\n532#1:814\n532#1:815,3\n532#1:821,3\n532#1:820\n*E\n"})
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ LazyListState f10148p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f10149q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ StateData f10150r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ CalendarMonth f10151s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ DatePickerFormatter f10152t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ DatePickerColors f10153u0;
        public final /* synthetic */ Function1<Long, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ CalendarDate f10154w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Boolean> f10155x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(LazyListState lazyListState, int i10, StateData stateData, CalendarMonth calendarMonth, DatePickerFormatter datePickerFormatter, DatePickerColors datePickerColors, Function1<? super Long, Unit> function1, CalendarDate calendarDate, Function1<? super Long, Boolean> function2) {
            super(2);
            this.f10148p0 = lazyListState;
            this.f10149q0 = i10;
            this.f10150r0 = stateData;
            this.f10151s0 = calendarMonth;
            this.f10152t0 = datePickerFormatter;
            this.f10153u0 = datePickerColors;
            this.v0 = function1;
            this.f10154w0 = calendarDate;
            this.f10155x0 = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(56792252, iIntValue, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous> (DateRangePicker.kt:530)");
                }
                Object objB = androidx.databinding.c.b(composer2, 773894976, -492369756);
                if (objB == Composer.INSTANCE.getEmpty()) {
                    objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composer2), composer2);
                }
                composer2.endReplaceableGroup();
                CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composer2.endReplaceableGroup();
                Strings.Companion companion = Strings.INSTANCE;
                String strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(companion.m1292getDateRangePickerScrollToShowPreviousMonthadMyvUU(), composer2, 6);
                String strM1320getStringNWtq29 = Strings_androidKt.m1320getStringNWtq28(companion.m1291getDateRangePickerScrollToShowNextMonthadMyvUU(), composer2, 6);
                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, z0.f14408p0, 1, null);
                LazyListState lazyListState = this.f10148p0;
                LazyDslKt.LazyColumn(modifierSemantics$default, lazyListState, null, false, null, null, null, false, new d1(this.f10150r0, this.f10151s0, this.f10152t0, this.f10153u0, this.v0, this.f10154w0, this.f10155x0, this.f10149q0, lazyListState, coroutineScope, strM1320getStringNWtq28, strM1320getStringNWtq29), composer2, (this.f10149q0 >> 3) & 112, 252);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateRangePicker.kt */
    @DebugMetadata(c = "androidx.compose.material3.DateRangePickerKt$VerticalMonthsList$2$1", f = "DateRangePicker.kt", i = {}, l = {586}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f10156p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ LazyListState f10157q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ StateData f10158r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(LazyListState lazyListState, StateData stateData, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f10157q0 = lazyListState;
            this.f10158r0 = stateData;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new h(this.f10157q0, this.f10158r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f10156p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                this.f10156p0 = 1;
                if (DatePickerKt.updateDisplayedMonth(this.f10157q0, this.f10158r0, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateRangePicker.kt */
    public static final class i extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Unit> f10159p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ StateData f10160q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ LazyListState f10161r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ DatePickerFormatter f10162s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Boolean> f10163t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ DatePickerColors f10164u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public i(Function1<? super Long, Unit> function1, StateData stateData, LazyListState lazyListState, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function2, DatePickerColors datePickerColors, int i10) {
            super(2);
            this.f10159p0 = function1;
            this.f10160q0 = stateData;
            this.f10161r0 = lazyListState;
            this.f10162s0 = datePickerFormatter;
            this.f10163t0 = function2;
            this.f10164u0 = datePickerColors;
            this.v0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            DateRangePickerKt.a(this.f10159p0, this.f10160q0, this.f10161r0, this.f10162s0, this.f10163t0, this.f10164u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateRangePicker.kt */
    public static final class j extends Lambda implements Function0<DateRangePickerState> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Long f10165p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Long f10166q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Long f10167r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ IntRange f10168s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f10169t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Long l6, Long l7, Long l10, IntRange intRange, int i10) {
            super(0);
            this.f10165p0 = l6;
            this.f10166q0 = l7;
            this.f10167r0 = l10;
            this.f10168s0 = intRange;
            this.f10169t0 = i10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final DateRangePickerState invoke() {
            return new DateRangePickerState(this.f10165p0, this.f10166q0, this.f10167r0, this.f10168s0, this.f10169t0, null);
        }
    }

    static {
        float f6 = 64;
        float f10 = 12;
        f10124b = PaddingKt.m293PaddingValuesa9UjIt4$default(Dp.m4389constructorimpl(f6), 0.0f, Dp.m4389constructorimpl(f10), 0.0f, 10, null);
        f10125c = PaddingKt.m293PaddingValuesa9UjIt4$default(Dp.m4389constructorimpl(f6), 0.0f, Dp.m4389constructorimpl(f10), Dp.m4389constructorimpl(f10), 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:105:0x013d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:106:0x013f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0142  */
    /* JADX WARN: Code duplicated, block: B:109:0x0146  */
    /* JADX WARN: Code duplicated, block: B:111:0x0158  */
    /* JADX WARN: Code duplicated, block: B:114:0x0174  */
    /* JADX WARN: Code duplicated, block: B:115:0x0177  */
    /* JADX WARN: Code duplicated, block: B:117:0x017a  */
    /* JADX WARN: Code duplicated, block: B:118:0x0187  */
    /* JADX WARN: Code duplicated, block: B:120:0x018a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0197  */
    /* JADX WARN: Code duplicated, block: B:123:0x019b  */
    /* JADX WARN: Code duplicated, block: B:124:0x019e  */
    /* JADX WARN: Code duplicated, block: B:127:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:128:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:131:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:133:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:135:0x0203  */
    /* JADX WARN: Code duplicated, block: B:138:0x025c  */
    /* JADX WARN: Code duplicated, block: B:143:0x026a  */
    /* JADX WARN: Code duplicated, block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116  */
    /* JADX WARN: Code duplicated, block: B:97:0x0121  */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void DateRangePicker(@NotNull DateRangePickerState state, @Nullable Modifier modifier, @Nullable DatePickerFormatter datePickerFormatter, @Nullable Function1<? super Long, Boolean> function1, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, boolean z10, @Nullable DatePickerColors datePickerColors, @Nullable Composer composer, int i10, int i11) {
        int i12;
        int i13;
        DatePickerFormatter datePickerFormatter2;
        int i14;
        int i15;
        Function1<? super Long, Boolean> function4;
        int i16;
        int i17;
        Function2<? super Composer, ? super Integer, Unit> function5;
        int i18;
        int i19;
        Function2<? super Composer, ? super Integer, Unit> function6;
        int i20;
        int i21;
        int i22;
        Modifier modifier2;
        Function1<? super Long, Boolean> function7;
        Function2<? super Composer, ? super Integer, Unit> function2ComposableLambda;
        Function2<? super Composer, ? super Integer, Unit> function2ComposableLambda2;
        boolean z11;
        int i23;
        DatePickerColors datePickerColorsM1060colors1m2CgY;
        Object objRememberedValue;
        boolean z12;
        ComposableLambda composableLambda;
        Function2<? super Composer, ? super Integer, Unit> function8;
        Function2<? super Composer, ? super Integer, Unit> function9;
        DatePickerColors datePickerColors2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1835392055);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i24 = i11 & 2;
        if (i24 == 0) {
            if ((i10 & 112) == 0) {
                i12 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    datePickerFormatter2 = datePickerFormatter;
                    if (composerStartRestartGroup.changed(datePickerFormatter2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        function4 = function1;
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 57344) == 0) {
                            function5 = function2;
                            if (composerStartRestartGroup.changedInstance(function5)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        i19 = i11 & 32;
                        if (i19 != 0) {
                            if ((458752 & i10) == 0) {
                                function6 = function3;
                                if (composerStartRestartGroup.changedInstance(function6)) {
                                    i20 = 131072;
                                } else {
                                    i20 = 65536;
                                }
                                i12 |= i20;
                            }
                            i21 = i11 & 64;
                            if (i21 != 0) {
                                i12 |= 1572864;
                            } else if ((i10 & 3670016) == 0) {
                                if (composerStartRestartGroup.changed(z10)) {
                                    i22 = 1048576;
                                } else {
                                    i22 = 524288;
                                }
                                i12 |= i22;
                            }
                            if ((i10 & 29360128) != 0) {
                                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                            }
                            if ((i12 & 23967451) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i24 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    } else {
                                        modifier2 = modifier;
                                    }
                                    if (i13 != 0) {
                                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                    }
                                    if (i15 != 0) {
                                        function7 = a.f10127p0;
                                    } else {
                                        function7 = function4;
                                    }
                                    if (i17 != 0) {
                                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                                    } else {
                                        function2ComposableLambda = function5;
                                    }
                                    if (i19 != 0) {
                                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                                    } else {
                                        function2ComposableLambda2 = function3;
                                    }
                                    if (i21 != 0) {
                                        z11 = true;
                                    } else {
                                        z11 = z10;
                                    }
                                    if ((i11 & 128) != 0) {
                                        i23 = i12 & (-29360129);
                                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                    } else {
                                        i23 = i12;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                                    }
                                    if (z11) {
                                        z12 = true;
                                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                                    } else {
                                        z12 = true;
                                        composableLambda = null;
                                    }
                                    ComposableLambda composableLambda2 = composableLambda;
                                    Typography typography = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                                    DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
                                    TextStyle textStyleFromToken = TypographyKt.fromToken(typography, datePickerModalTokens.getRangeSelectionHeaderHeadlineFont());
                                    float fM4389constructorimpl = Dp.m4389constructorimpl(datePickerModalTokens.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                                    int i25 = ((i23 >> 3) & 14) | 14155776;
                                    int i26 = i23 >> 9;
                                    DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda2, datePickerColorsM1060colors1m2CgY, textStyleFromToken, fM4389constructorimpl, composableLambda3, composerStartRestartGroup, i25 | (i26 & 112) | (i26 & 896) | (i26 & 57344));
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    function8 = function2ComposableLambda;
                                    function9 = function2ComposableLambda2;
                                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                                    modifier3 = modifier2;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i11 & 128) != 0) {
                                        i12 &= -29360129;
                                    }
                                    modifier2 = modifier;
                                    function2ComposableLambda2 = function3;
                                    z11 = z10;
                                    i23 = i12;
                                    function7 = function4;
                                    function2ComposableLambda = function5;
                                }
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                                }
                                if (z11) {
                                    z12 = true;
                                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                                } else {
                                    z12 = true;
                                    composableLambda = null;
                                }
                                ComposableLambda composableLambda4 = composableLambda;
                                Typography typography2 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                                DatePickerModalTokens datePickerModalTokens2 = DatePickerModalTokens.INSTANCE;
                                TextStyle textStyleFromToken2 = TypographyKt.fromToken(typography2, datePickerModalTokens2.getRangeSelectionHeaderHeadlineFont());
                                float fM4389constructorimpl2 = Dp.m4389constructorimpl(datePickerModalTokens2.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                                ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                                int i27 = ((i23 >> 3) & 14) | 14155776;
                                int i28 = i23 >> 9;
                                DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda4, datePickerColorsM1060colors1m2CgY, textStyleFromToken2, fM4389constructorimpl2, composableLambda5, composerStartRestartGroup, i27 | (i28 & 112) | (i28 & 896) | (i28 & 57344));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function8 = function2ComposableLambda;
                                function9 = function2ComposableLambda2;
                                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                                modifier3 = modifier2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                z11 = z10;
                                datePickerColors2 = datePickerColors;
                                function7 = function4;
                                function8 = function5;
                                function9 = function6;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                        }
                        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        function6 = function3;
                        i21 = i11 & 64;
                        if (i21 != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(z10)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i12 |= i22;
                        }
                        if ((i10 & 29360128) != 0) {
                            i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                        }
                        if ((i12 & 23967451) == 4793490) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = a.f10127p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = a.f10127p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                            }
                            if (z11) {
                                z12 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                            } else {
                                z12 = true;
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda6 = composableLambda;
                            Typography typography3 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            DatePickerModalTokens datePickerModalTokens3 = DatePickerModalTokens.INSTANCE;
                            TextStyle textStyleFromToken3 = TypographyKt.fromToken(typography3, datePickerModalTokens3.getRangeSelectionHeaderHeadlineFont());
                            float fM4389constructorimpl3 = Dp.m4389constructorimpl(datePickerModalTokens3.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                            ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                            int i29 = ((i23 >> 3) & 14) | 14155776;
                            int i210 = i23 >> 9;
                            DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda6, datePickerColorsM1060colors1m2CgY, textStyleFromToken3, fM4389constructorimpl3, composableLambda7, composerStartRestartGroup, i29 | (i210 & 112) | (i210 & 896) | (i210 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function2ComposableLambda;
                            function9 = function2ComposableLambda2;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = a.f10127p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = a.f10127p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                            }
                            if (z11) {
                                z12 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                            } else {
                                z12 = true;
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda8 = composableLambda;
                            Typography typography4 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            DatePickerModalTokens datePickerModalTokens4 = DatePickerModalTokens.INSTANCE;
                            TextStyle textStyleFromToken4 = TypographyKt.fromToken(typography4, datePickerModalTokens4.getRangeSelectionHeaderHeadlineFont());
                            float fM4389constructorimpl4 = Dp.m4389constructorimpl(datePickerModalTokens4.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                            ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                            int i211 = ((i23 >> 3) & 14) | 14155776;
                            int i212 = i23 >> 9;
                            DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda8, datePickerColorsM1060colors1m2CgY, textStyleFromToken4, fM4389constructorimpl4, composableLambda9, composerStartRestartGroup, i211 | (i212 & 112) | (i212 & 896) | (i212 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function2ComposableLambda;
                            function9 = function2ComposableLambda2;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                    }
                    i12 |= 24576;
                    function5 = function2;
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        if ((458752 & i10) == 0) {
                            function6 = function3;
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i12 |= i20;
                        }
                        i21 = i11 & 64;
                        if (i21 != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(z10)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i12 |= i22;
                        }
                        if ((i10 & 29360128) != 0) {
                            i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                        }
                        if ((i12 & 23967451) == 4793490) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = a.f10127p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = a.f10127p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                            }
                            if (z11) {
                                z12 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                            } else {
                                z12 = true;
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda10 = composableLambda;
                            Typography typography5 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            DatePickerModalTokens datePickerModalTokens5 = DatePickerModalTokens.INSTANCE;
                            TextStyle textStyleFromToken5 = TypographyKt.fromToken(typography5, datePickerModalTokens5.getRangeSelectionHeaderHeadlineFont());
                            float fM4389constructorimpl5 = Dp.m4389constructorimpl(datePickerModalTokens5.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                            ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                            int i213 = ((i23 >> 3) & 14) | 14155776;
                            int i214 = i23 >> 9;
                            DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda10, datePickerColorsM1060colors1m2CgY, textStyleFromToken5, fM4389constructorimpl5, composableLambda11, composerStartRestartGroup, i213 | (i214 & 112) | (i214 & 896) | (i214 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function2ComposableLambda;
                            function9 = function2ComposableLambda2;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = a.f10127p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = a.f10127p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                            }
                            if (z11) {
                                z12 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                            } else {
                                z12 = true;
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda12 = composableLambda;
                            Typography typography6 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            DatePickerModalTokens datePickerModalTokens6 = DatePickerModalTokens.INSTANCE;
                            TextStyle textStyleFromToken6 = TypographyKt.fromToken(typography6, datePickerModalTokens6.getRangeSelectionHeaderHeadlineFont());
                            float fM4389constructorimpl6 = Dp.m4389constructorimpl(datePickerModalTokens6.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                            ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                            int i215 = ((i23 >> 3) & 14) | 14155776;
                            int i216 = i23 >> 9;
                            DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda12, datePickerColorsM1060colors1m2CgY, textStyleFromToken6, fM4389constructorimpl6, composableLambda13, composerStartRestartGroup, i215 | (i216 & 112) | (i216 & 896) | (i216 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function2ComposableLambda;
                            function9 = function2ComposableLambda2;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                    }
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function6 = function3;
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z10)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda14 = composableLambda;
                        Typography typography7 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens7 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken7 = TypographyKt.fromToken(typography7, datePickerModalTokens7.getRangeSelectionHeaderHeadlineFont());
                        float fM4389constructorimpl7 = Dp.m4389constructorimpl(datePickerModalTokens7.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                        ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i217 = ((i23 >> 3) & 14) | 14155776;
                        int i218 = i23 >> 9;
                        DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda14, datePickerColorsM1060colors1m2CgY, textStyleFromToken7, fM4389constructorimpl7, composableLambda15, composerStartRestartGroup, i217 | (i218 & 112) | (i218 & 896) | (i218 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda16 = composableLambda;
                        Typography typography8 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens8 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken8 = TypographyKt.fromToken(typography8, datePickerModalTokens8.getRangeSelectionHeaderHeadlineFont());
                        float fM4389constructorimpl8 = Dp.m4389constructorimpl(datePickerModalTokens8.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                        ComposableLambda composableLambda17 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i219 = ((i23 >> 3) & 14) | 14155776;
                        int i2110 = i23 >> 9;
                        DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda16, datePickerColorsM1060colors1m2CgY, textStyleFromToken8, fM4389constructorimpl8, composableLambda17, composerStartRestartGroup, i219 | (i2110 & 112) | (i2110 & 896) | (i2110 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                }
                i12 |= 3072;
                function4 = function1;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        function5 = function2;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        if ((458752 & i10) == 0) {
                            function6 = function3;
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i12 |= i20;
                        }
                        i21 = i11 & 64;
                        if (i21 != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(z10)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i12 |= i22;
                        }
                        if ((i10 & 29360128) != 0) {
                            i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                        }
                        if ((i12 & 23967451) == 4793490) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = a.f10127p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = a.f10127p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                            }
                            if (z11) {
                                z12 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                            } else {
                                z12 = true;
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda18 = composableLambda;
                            Typography typography9 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            DatePickerModalTokens datePickerModalTokens9 = DatePickerModalTokens.INSTANCE;
                            TextStyle textStyleFromToken9 = TypographyKt.fromToken(typography9, datePickerModalTokens9.getRangeSelectionHeaderHeadlineFont());
                            float fM4389constructorimpl9 = Dp.m4389constructorimpl(datePickerModalTokens9.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                            ComposableLambda composableLambda19 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                            int i2111 = ((i23 >> 3) & 14) | 14155776;
                            int i2112 = i23 >> 9;
                            DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda18, datePickerColorsM1060colors1m2CgY, textStyleFromToken9, fM4389constructorimpl9, composableLambda19, composerStartRestartGroup, i2111 | (i2112 & 112) | (i2112 & 896) | (i2112 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function2ComposableLambda;
                            function9 = function2ComposableLambda2;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = a.f10127p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = a.f10127p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                            }
                            if (z11) {
                                z12 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                            } else {
                                z12 = true;
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda110 = composableLambda;
                            Typography typography10 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            DatePickerModalTokens datePickerModalTokens10 = DatePickerModalTokens.INSTANCE;
                            TextStyle textStyleFromToken10 = TypographyKt.fromToken(typography10, datePickerModalTokens10.getRangeSelectionHeaderHeadlineFont());
                            float fM4389constructorimpl10 = Dp.m4389constructorimpl(datePickerModalTokens10.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                            ComposableLambda composableLambda111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                            int i2113 = ((i23 >> 3) & 14) | 14155776;
                            int i2114 = i23 >> 9;
                            DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda110, datePickerColorsM1060colors1m2CgY, textStyleFromToken10, fM4389constructorimpl10, composableLambda111, composerStartRestartGroup, i2113 | (i2114 & 112) | (i2114 & 896) | (i2114 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function2ComposableLambda;
                            function9 = function2ComposableLambda2;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                    }
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function6 = function3;
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z10)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda112 = composableLambda;
                        Typography typography11 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens11 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken11 = TypographyKt.fromToken(typography11, datePickerModalTokens11.getRangeSelectionHeaderHeadlineFont());
                        float fM4389constructorimpl11 = Dp.m4389constructorimpl(datePickerModalTokens11.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                        ComposableLambda composableLambda113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i2115 = ((i23 >> 3) & 14) | 14155776;
                        int i2116 = i23 >> 9;
                        DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda112, datePickerColorsM1060colors1m2CgY, textStyleFromToken11, fM4389constructorimpl11, composableLambda113, composerStartRestartGroup, i2115 | (i2116 & 112) | (i2116 & 896) | (i2116 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda114 = composableLambda;
                        Typography typography12 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens12 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken12 = TypographyKt.fromToken(typography12, datePickerModalTokens12.getRangeSelectionHeaderHeadlineFont());
                        float fM4389constructorimpl12 = Dp.m4389constructorimpl(datePickerModalTokens12.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                        ComposableLambda composableLambda115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i2117 = ((i23 >> 3) & 14) | 14155776;
                        int i2118 = i23 >> 9;
                        DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda114, datePickerColorsM1060colors1m2CgY, textStyleFromToken12, fM4389constructorimpl12, composableLambda115, composerStartRestartGroup, i2117 | (i2118 & 112) | (i2118 & 896) | (i2118 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                }
                i12 |= 24576;
                function5 = function2;
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((458752 & i10) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z10)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda116 = composableLambda;
                        Typography typography13 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens13 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken13 = TypographyKt.fromToken(typography13, datePickerModalTokens13.getRangeSelectionHeaderHeadlineFont());
                        float fM4389constructorimpl13 = Dp.m4389constructorimpl(datePickerModalTokens13.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                        ComposableLambda composableLambda117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i2119 = ((i23 >> 3) & 14) | 14155776;
                        int i21110 = i23 >> 9;
                        DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda116, datePickerColorsM1060colors1m2CgY, textStyleFromToken13, fM4389constructorimpl13, composableLambda117, composerStartRestartGroup, i2119 | (i21110 & 112) | (i21110 & 896) | (i21110 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda118 = composableLambda;
                        Typography typography14 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens14 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken14 = TypographyKt.fromToken(typography14, datePickerModalTokens14.getRangeSelectionHeaderHeadlineFont());
                        float fM4389constructorimpl14 = Dp.m4389constructorimpl(datePickerModalTokens14.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                        ComposableLambda composableLambda119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i21111 = ((i23 >> 3) & 14) | 14155776;
                        int i21112 = i23 >> 9;
                        DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda118, datePickerColorsM1060colors1m2CgY, textStyleFromToken14, fM4389constructorimpl14, composableLambda119, composerStartRestartGroup, i21111 | (i21112 & 112) | (i21112 & 896) | (i21112 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function6 = function3;
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda1110 = composableLambda;
                    Typography typography15 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens15 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken15 = TypographyKt.fromToken(typography15, datePickerModalTokens15.getRangeSelectionHeaderHeadlineFont());
                    float fM4389constructorimpl15 = Dp.m4389constructorimpl(datePickerModalTokens15.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                    ComposableLambda composableLambda1111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i21113 = ((i23 >> 3) & 14) | 14155776;
                    int i21114 = i23 >> 9;
                    DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1110, datePickerColorsM1060colors1m2CgY, textStyleFromToken15, fM4389constructorimpl15, composableLambda1111, composerStartRestartGroup, i21113 | (i21114 & 112) | (i21114 & 896) | (i21114 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda1112 = composableLambda;
                    Typography typography16 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens16 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken16 = TypographyKt.fromToken(typography16, datePickerModalTokens16.getRangeSelectionHeaderHeadlineFont());
                    float fM4389constructorimpl16 = Dp.m4389constructorimpl(datePickerModalTokens16.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                    ComposableLambda composableLambda1113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i21115 = ((i23 >> 3) & 14) | 14155776;
                    int i21116 = i23 >> 9;
                    DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1112, datePickerColorsM1060colors1m2CgY, textStyleFromToken16, fM4389constructorimpl16, composableLambda1113, composerStartRestartGroup, i21115 | (i21116 & 112) | (i21116 & 896) | (i21116 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            datePickerFormatter2 = datePickerFormatter;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    function4 = function1;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        function5 = function2;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        if ((458752 & i10) == 0) {
                            function6 = function3;
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i12 |= i20;
                        }
                        i21 = i11 & 64;
                        if (i21 != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(z10)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i12 |= i22;
                        }
                        if ((i10 & 29360128) != 0) {
                            i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                        }
                        if ((i12 & 23967451) == 4793490) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = a.f10127p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = a.f10127p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                            }
                            if (z11) {
                                z12 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                            } else {
                                z12 = true;
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda1114 = composableLambda;
                            Typography typography17 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            DatePickerModalTokens datePickerModalTokens17 = DatePickerModalTokens.INSTANCE;
                            TextStyle textStyleFromToken17 = TypographyKt.fromToken(typography17, datePickerModalTokens17.getRangeSelectionHeaderHeadlineFont());
                            float fM4389constructorimpl17 = Dp.m4389constructorimpl(datePickerModalTokens17.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                            ComposableLambda composableLambda1115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                            int i21117 = ((i23 >> 3) & 14) | 14155776;
                            int i21118 = i23 >> 9;
                            DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1114, datePickerColorsM1060colors1m2CgY, textStyleFromToken17, fM4389constructorimpl17, composableLambda1115, composerStartRestartGroup, i21117 | (i21118 & 112) | (i21118 & 896) | (i21118 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function2ComposableLambda;
                            function9 = function2ComposableLambda2;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = a.f10127p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = a.f10127p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                            }
                            if (z11) {
                                z12 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                            } else {
                                z12 = true;
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda1116 = composableLambda;
                            Typography typography18 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            DatePickerModalTokens datePickerModalTokens18 = DatePickerModalTokens.INSTANCE;
                            TextStyle textStyleFromToken18 = TypographyKt.fromToken(typography18, datePickerModalTokens18.getRangeSelectionHeaderHeadlineFont());
                            float fM4389constructorimpl18 = Dp.m4389constructorimpl(datePickerModalTokens18.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                            ComposableLambda composableLambda1117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                            int i21119 = ((i23 >> 3) & 14) | 14155776;
                            int i211110 = i23 >> 9;
                            DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1116, datePickerColorsM1060colors1m2CgY, textStyleFromToken18, fM4389constructorimpl18, composableLambda1117, composerStartRestartGroup, i21119 | (i211110 & 112) | (i211110 & 896) | (i211110 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function2ComposableLambda;
                            function9 = function2ComposableLambda2;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                    }
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function6 = function3;
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z10)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda1118 = composableLambda;
                        Typography typography19 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens19 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken19 = TypographyKt.fromToken(typography19, datePickerModalTokens19.getRangeSelectionHeaderHeadlineFont());
                        float fM4389constructorimpl19 = Dp.m4389constructorimpl(datePickerModalTokens19.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                        ComposableLambda composableLambda1119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i211111 = ((i23 >> 3) & 14) | 14155776;
                        int i211112 = i23 >> 9;
                        DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1118, datePickerColorsM1060colors1m2CgY, textStyleFromToken19, fM4389constructorimpl19, composableLambda1119, composerStartRestartGroup, i211111 | (i211112 & 112) | (i211112 & 896) | (i211112 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda11110 = composableLambda;
                        Typography typography110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens110 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken110 = TypographyKt.fromToken(typography110, datePickerModalTokens110.getRangeSelectionHeaderHeadlineFont());
                        float fM4389constructorimpl110 = Dp.m4389constructorimpl(datePickerModalTokens110.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                        ComposableLambda composableLambda11111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i211113 = ((i23 >> 3) & 14) | 14155776;
                        int i211114 = i23 >> 9;
                        DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11110, datePickerColorsM1060colors1m2CgY, textStyleFromToken110, fM4389constructorimpl110, composableLambda11111, composerStartRestartGroup, i211113 | (i211114 & 112) | (i211114 & 896) | (i211114 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                }
                i12 |= 24576;
                function5 = function2;
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((458752 & i10) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z10)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda11112 = composableLambda;
                        Typography typography111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens111 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken111 = TypographyKt.fromToken(typography111, datePickerModalTokens111.getRangeSelectionHeaderHeadlineFont());
                        float fM4389constructorimpl111 = Dp.m4389constructorimpl(datePickerModalTokens111.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                        ComposableLambda composableLambda11113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i211115 = ((i23 >> 3) & 14) | 14155776;
                        int i211116 = i23 >> 9;
                        DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11112, datePickerColorsM1060colors1m2CgY, textStyleFromToken111, fM4389constructorimpl111, composableLambda11113, composerStartRestartGroup, i211115 | (i211116 & 112) | (i211116 & 896) | (i211116 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda11114 = composableLambda;
                        Typography typography112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens112 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken112 = TypographyKt.fromToken(typography112, datePickerModalTokens112.getRangeSelectionHeaderHeadlineFont());
                        float fM4389constructorimpl112 = Dp.m4389constructorimpl(datePickerModalTokens112.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                        ComposableLambda composableLambda11115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i211117 = ((i23 >> 3) & 14) | 14155776;
                        int i211118 = i23 >> 9;
                        DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11114, datePickerColorsM1060colors1m2CgY, textStyleFromToken112, fM4389constructorimpl112, composableLambda11115, composerStartRestartGroup, i211117 | (i211118 & 112) | (i211118 & 896) | (i211118 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function6 = function3;
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda11116 = composableLambda;
                    Typography typography113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens113 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken113 = TypographyKt.fromToken(typography113, datePickerModalTokens113.getRangeSelectionHeaderHeadlineFont());
                    float fM4389constructorimpl113 = Dp.m4389constructorimpl(datePickerModalTokens113.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                    ComposableLambda composableLambda11117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i211119 = ((i23 >> 3) & 14) | 14155776;
                    int i2111110 = i23 >> 9;
                    DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11116, datePickerColorsM1060colors1m2CgY, textStyleFromToken113, fM4389constructorimpl113, composableLambda11117, composerStartRestartGroup, i211119 | (i2111110 & 112) | (i2111110 & 896) | (i2111110 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda11118 = composableLambda;
                    Typography typography114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens114 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken114 = TypographyKt.fromToken(typography114, datePickerModalTokens114.getRangeSelectionHeaderHeadlineFont());
                    float fM4389constructorimpl114 = Dp.m4389constructorimpl(datePickerModalTokens114.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                    ComposableLambda composableLambda11119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i2111111 = ((i23 >> 3) & 14) | 14155776;
                    int i2111112 = i23 >> 9;
                    DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11118, datePickerColorsM1060colors1m2CgY, textStyleFromToken114, fM4389constructorimpl114, composableLambda11119, composerStartRestartGroup, i2111111 | (i2111112 & 112) | (i2111112 & 896) | (i2111112 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
            }
            i12 |= 3072;
            function4 = function1;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    function5 = function2;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((458752 & i10) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z10)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda111110 = composableLambda;
                        Typography typography115 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens115 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken115 = TypographyKt.fromToken(typography115, datePickerModalTokens115.getRangeSelectionHeaderHeadlineFont());
                        float fM4389constructorimpl115 = Dp.m4389constructorimpl(datePickerModalTokens115.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                        ComposableLambda composableLambda111111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i2111113 = ((i23 >> 3) & 14) | 14155776;
                        int i2111114 = i23 >> 9;
                        DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111110, datePickerColorsM1060colors1m2CgY, textStyleFromToken115, fM4389constructorimpl115, composableLambda111111, composerStartRestartGroup, i2111113 | (i2111114 & 112) | (i2111114 & 896) | (i2111114 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda111112 = composableLambda;
                        Typography typography116 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens116 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken116 = TypographyKt.fromToken(typography116, datePickerModalTokens116.getRangeSelectionHeaderHeadlineFont());
                        float fM4389constructorimpl116 = Dp.m4389constructorimpl(datePickerModalTokens116.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                        ComposableLambda composableLambda111113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i2111115 = ((i23 >> 3) & 14) | 14155776;
                        int i2111116 = i23 >> 9;
                        DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111112, datePickerColorsM1060colors1m2CgY, textStyleFromToken116, fM4389constructorimpl116, composableLambda111113, composerStartRestartGroup, i2111115 | (i2111116 & 112) | (i2111116 & 896) | (i2111116 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function6 = function3;
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda111114 = composableLambda;
                    Typography typography117 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens117 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken117 = TypographyKt.fromToken(typography117, datePickerModalTokens117.getRangeSelectionHeaderHeadlineFont());
                    float fM4389constructorimpl117 = Dp.m4389constructorimpl(datePickerModalTokens117.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                    ComposableLambda composableLambda111115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i2111117 = ((i23 >> 3) & 14) | 14155776;
                    int i2111118 = i23 >> 9;
                    DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111114, datePickerColorsM1060colors1m2CgY, textStyleFromToken117, fM4389constructorimpl117, composableLambda111115, composerStartRestartGroup, i2111117 | (i2111118 & 112) | (i2111118 & 896) | (i2111118 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda111116 = composableLambda;
                    Typography typography118 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens118 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken118 = TypographyKt.fromToken(typography118, datePickerModalTokens118.getRangeSelectionHeaderHeadlineFont());
                    float fM4389constructorimpl118 = Dp.m4389constructorimpl(datePickerModalTokens118.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                    ComposableLambda composableLambda111117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i2111119 = ((i23 >> 3) & 14) | 14155776;
                    int i21111110 = i23 >> 9;
                    DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111116, datePickerColorsM1060colors1m2CgY, textStyleFromToken118, fM4389constructorimpl118, composableLambda111117, composerStartRestartGroup, i2111119 | (i21111110 & 112) | (i21111110 & 896) | (i21111110 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
            }
            i12 |= 24576;
            function5 = function2;
            i19 = i11 & 32;
            if (i19 != 0) {
                if ((458752 & i10) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda111118 = composableLambda;
                    Typography typography119 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens119 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken119 = TypographyKt.fromToken(typography119, datePickerModalTokens119.getRangeSelectionHeaderHeadlineFont());
                    float fM4389constructorimpl119 = Dp.m4389constructorimpl(datePickerModalTokens119.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                    ComposableLambda composableLambda111119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i21111111 = ((i23 >> 3) & 14) | 14155776;
                    int i21111112 = i23 >> 9;
                    DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111118, datePickerColorsM1060colors1m2CgY, textStyleFromToken119, fM4389constructorimpl119, composableLambda111119, composerStartRestartGroup, i21111111 | (i21111112 & 112) | (i21111112 & 896) | (i21111112 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda1111110 = composableLambda;
                    Typography typography1110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens1110 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken1110 = TypographyKt.fromToken(typography1110, datePickerModalTokens1110.getRangeSelectionHeaderHeadlineFont());
                    float fM4389constructorimpl1110 = Dp.m4389constructorimpl(datePickerModalTokens1110.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                    ComposableLambda composableLambda1111111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i21111113 = ((i23 >> 3) & 14) | 14155776;
                    int i21111114 = i23 >> 9;
                    DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111110, datePickerColorsM1060colors1m2CgY, textStyleFromToken1110, fM4389constructorimpl1110, composableLambda1111111, composerStartRestartGroup, i21111113 | (i21111114 & 112) | (i21111114 & 896) | (i21111114 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function6 = function3;
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
            }
            if ((i12 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = a.f10127p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = a.f10127p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                }
                if (z11) {
                    z12 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                } else {
                    z12 = true;
                    composableLambda = null;
                }
                ComposableLambda composableLambda1111112 = composableLambda;
                Typography typography1111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                DatePickerModalTokens datePickerModalTokens1111 = DatePickerModalTokens.INSTANCE;
                TextStyle textStyleFromToken1111 = TypographyKt.fromToken(typography1111, datePickerModalTokens1111.getRangeSelectionHeaderHeadlineFont());
                float fM4389constructorimpl1111 = Dp.m4389constructorimpl(datePickerModalTokens1111.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                ComposableLambda composableLambda1111113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                int i21111115 = ((i23 >> 3) & 14) | 14155776;
                int i21111116 = i23 >> 9;
                DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111112, datePickerColorsM1060colors1m2CgY, textStyleFromToken1111, fM4389constructorimpl1111, composableLambda1111113, composerStartRestartGroup, i21111115 | (i21111116 & 112) | (i21111116 & 896) | (i21111116 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function2ComposableLambda;
                function9 = function2ComposableLambda2;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = a.f10127p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = a.f10127p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                }
                if (z11) {
                    z12 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                } else {
                    z12 = true;
                    composableLambda = null;
                }
                ComposableLambda composableLambda1111114 = composableLambda;
                Typography typography1112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                DatePickerModalTokens datePickerModalTokens1112 = DatePickerModalTokens.INSTANCE;
                TextStyle textStyleFromToken1112 = TypographyKt.fromToken(typography1112, datePickerModalTokens1112.getRangeSelectionHeaderHeadlineFont());
                float fM4389constructorimpl1112 = Dp.m4389constructorimpl(datePickerModalTokens1112.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                ComposableLambda composableLambda1111115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                int i21111117 = ((i23 >> 3) & 14) | 14155776;
                int i21111118 = i23 >> 9;
                DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111114, datePickerColorsM1060colors1m2CgY, textStyleFromToken1112, fM4389constructorimpl1112, composableLambda1111115, composerStartRestartGroup, i21111117 | (i21111118 & 112) | (i21111118 & 896) | (i21111118 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function2ComposableLambda;
                function9 = function2ComposableLambda2;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                datePickerFormatter2 = datePickerFormatter;
                if (composerStartRestartGroup.changed(datePickerFormatter2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    function4 = function1;
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        function5 = function2;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 32;
                    if (i19 != 0) {
                        if ((458752 & i10) == 0) {
                            function6 = function3;
                            if (composerStartRestartGroup.changedInstance(function6)) {
                                i20 = 131072;
                            } else {
                                i20 = 65536;
                            }
                            i12 |= i20;
                        }
                        i21 = i11 & 64;
                        if (i21 != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(z10)) {
                                i22 = 1048576;
                            } else {
                                i22 = 524288;
                            }
                            i12 |= i22;
                        }
                        if ((i10 & 29360128) != 0) {
                            i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                        }
                        if ((i12 & 23967451) == 4793490) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = a.f10127p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = a.f10127p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                            }
                            if (z11) {
                                z12 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                            } else {
                                z12 = true;
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda1111116 = composableLambda;
                            Typography typography1113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            DatePickerModalTokens datePickerModalTokens1113 = DatePickerModalTokens.INSTANCE;
                            TextStyle textStyleFromToken1113 = TypographyKt.fromToken(typography1113, datePickerModalTokens1113.getRangeSelectionHeaderHeadlineFont());
                            float fM4389constructorimpl1113 = Dp.m4389constructorimpl(datePickerModalTokens1113.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                            ComposableLambda composableLambda1111117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                            int i21111119 = ((i23 >> 3) & 14) | 14155776;
                            int i211111110 = i23 >> 9;
                            DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111116, datePickerColorsM1060colors1m2CgY, textStyleFromToken1113, fM4389constructorimpl1113, composableLambda1111117, composerStartRestartGroup, i21111119 | (i211111110 & 112) | (i211111110 & 896) | (i211111110 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function2ComposableLambda;
                            function9 = function2ComposableLambda2;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = a.f10127p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            } else {
                                if (i24 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function7 = a.f10127p0;
                                } else {
                                    function7 = function4;
                                }
                                if (i17 != 0) {
                                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                                } else {
                                    function2ComposableLambda = function5;
                                }
                                if (i19 != 0) {
                                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                                } else {
                                    function2ComposableLambda2 = function3;
                                }
                                if (i21 != 0) {
                                    z11 = true;
                                } else {
                                    z11 = z10;
                                }
                                if ((i11 & 128) != 0) {
                                    i23 = i12 & (-29360129);
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                } else {
                                    i23 = i12;
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                            }
                            if (z11) {
                                z12 = true;
                                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                            } else {
                                z12 = true;
                                composableLambda = null;
                            }
                            ComposableLambda composableLambda1111118 = composableLambda;
                            Typography typography1114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                            DatePickerModalTokens datePickerModalTokens1114 = DatePickerModalTokens.INSTANCE;
                            TextStyle textStyleFromToken1114 = TypographyKt.fromToken(typography1114, datePickerModalTokens1114.getRangeSelectionHeaderHeadlineFont());
                            float fM4389constructorimpl1114 = Dp.m4389constructorimpl(datePickerModalTokens1114.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                            ComposableLambda composableLambda1111119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                            int i211111111 = ((i23 >> 3) & 14) | 14155776;
                            int i211111112 = i23 >> 9;
                            DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111118, datePickerColorsM1060colors1m2CgY, textStyleFromToken1114, fM4389constructorimpl1114, composableLambda1111119, composerStartRestartGroup, i211111111 | (i211111112 & 112) | (i211111112 & 896) | (i211111112 & 57344));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function8 = function2ComposableLambda;
                            function9 = function2ComposableLambda2;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                    }
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    function6 = function3;
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z10)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda11111110 = composableLambda;
                        Typography typography1115 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens1115 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken1115 = TypographyKt.fromToken(typography1115, datePickerModalTokens1115.getRangeSelectionHeaderHeadlineFont());
                        float fM4389constructorimpl1115 = Dp.m4389constructorimpl(datePickerModalTokens1115.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                        ComposableLambda composableLambda11111111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i211111113 = ((i23 >> 3) & 14) | 14155776;
                        int i211111114 = i23 >> 9;
                        DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11111110, datePickerColorsM1060colors1m2CgY, textStyleFromToken1115, fM4389constructorimpl1115, composableLambda11111111, composerStartRestartGroup, i211111113 | (i211111114 & 112) | (i211111114 & 896) | (i211111114 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda11111112 = composableLambda;
                        Typography typography1116 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens1116 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken1116 = TypographyKt.fromToken(typography1116, datePickerModalTokens1116.getRangeSelectionHeaderHeadlineFont());
                        float fM4389constructorimpl1116 = Dp.m4389constructorimpl(datePickerModalTokens1116.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                        ComposableLambda composableLambda11111113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i211111115 = ((i23 >> 3) & 14) | 14155776;
                        int i211111116 = i23 >> 9;
                        DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11111112, datePickerColorsM1060colors1m2CgY, textStyleFromToken1116, fM4389constructorimpl1116, composableLambda11111113, composerStartRestartGroup, i211111115 | (i211111116 & 112) | (i211111116 & 896) | (i211111116 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                }
                i12 |= 24576;
                function5 = function2;
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((458752 & i10) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z10)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda11111114 = composableLambda;
                        Typography typography1117 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens1117 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken1117 = TypographyKt.fromToken(typography1117, datePickerModalTokens1117.getRangeSelectionHeaderHeadlineFont());
                        float fM4389constructorimpl1117 = Dp.m4389constructorimpl(datePickerModalTokens1117.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                        ComposableLambda composableLambda11111115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i211111117 = ((i23 >> 3) & 14) | 14155776;
                        int i211111118 = i23 >> 9;
                        DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11111114, datePickerColorsM1060colors1m2CgY, textStyleFromToken1117, fM4389constructorimpl1117, composableLambda11111115, composerStartRestartGroup, i211111117 | (i211111118 & 112) | (i211111118 & 896) | (i211111118 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda11111116 = composableLambda;
                        Typography typography1118 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens1118 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken1118 = TypographyKt.fromToken(typography1118, datePickerModalTokens1118.getRangeSelectionHeaderHeadlineFont());
                        float fM4389constructorimpl1118 = Dp.m4389constructorimpl(datePickerModalTokens1118.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                        ComposableLambda composableLambda11111117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i211111119 = ((i23 >> 3) & 14) | 14155776;
                        int i2111111110 = i23 >> 9;
                        DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11111116, datePickerColorsM1060colors1m2CgY, textStyleFromToken1118, fM4389constructorimpl1118, composableLambda11111117, composerStartRestartGroup, i211111119 | (i2111111110 & 112) | (i2111111110 & 896) | (i2111111110 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function6 = function3;
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda11111118 = composableLambda;
                    Typography typography1119 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens1119 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken1119 = TypographyKt.fromToken(typography1119, datePickerModalTokens1119.getRangeSelectionHeaderHeadlineFont());
                    float fM4389constructorimpl1119 = Dp.m4389constructorimpl(datePickerModalTokens1119.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                    ComposableLambda composableLambda11111119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i2111111111 = ((i23 >> 3) & 14) | 14155776;
                    int i2111111112 = i23 >> 9;
                    DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11111118, datePickerColorsM1060colors1m2CgY, textStyleFromToken1119, fM4389constructorimpl1119, composableLambda11111119, composerStartRestartGroup, i2111111111 | (i2111111112 & 112) | (i2111111112 & 896) | (i2111111112 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda111111110 = composableLambda;
                    Typography typography11110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens11110 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken11110 = TypographyKt.fromToken(typography11110, datePickerModalTokens11110.getRangeSelectionHeaderHeadlineFont());
                    float fM4389constructorimpl11110 = Dp.m4389constructorimpl(datePickerModalTokens11110.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                    ComposableLambda composableLambda111111111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i2111111113 = ((i23 >> 3) & 14) | 14155776;
                    int i2111111114 = i23 >> 9;
                    DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111111110, datePickerColorsM1060colors1m2CgY, textStyleFromToken11110, fM4389constructorimpl11110, composableLambda111111111, composerStartRestartGroup, i2111111113 | (i2111111114 & 112) | (i2111111114 & 896) | (i2111111114 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
            }
            i12 |= 3072;
            function4 = function1;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    function5 = function2;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((458752 & i10) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z10)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda111111112 = composableLambda;
                        Typography typography11111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens11111 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken11111 = TypographyKt.fromToken(typography11111, datePickerModalTokens11111.getRangeSelectionHeaderHeadlineFont());
                        float fM4389constructorimpl11111 = Dp.m4389constructorimpl(datePickerModalTokens11111.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                        ComposableLambda composableLambda111111113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i2111111115 = ((i23 >> 3) & 14) | 14155776;
                        int i2111111116 = i23 >> 9;
                        DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111111112, datePickerColorsM1060colors1m2CgY, textStyleFromToken11111, fM4389constructorimpl11111, composableLambda111111113, composerStartRestartGroup, i2111111115 | (i2111111116 & 112) | (i2111111116 & 896) | (i2111111116 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda111111114 = composableLambda;
                        Typography typography11112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens11112 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken11112 = TypographyKt.fromToken(typography11112, datePickerModalTokens11112.getRangeSelectionHeaderHeadlineFont());
                        float fM4389constructorimpl11112 = Dp.m4389constructorimpl(datePickerModalTokens11112.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                        ComposableLambda composableLambda111111115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i2111111117 = ((i23 >> 3) & 14) | 14155776;
                        int i2111111118 = i23 >> 9;
                        DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111111114, datePickerColorsM1060colors1m2CgY, textStyleFromToken11112, fM4389constructorimpl11112, composableLambda111111115, composerStartRestartGroup, i2111111117 | (i2111111118 & 112) | (i2111111118 & 896) | (i2111111118 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function6 = function3;
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda111111116 = composableLambda;
                    Typography typography11113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens11113 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken11113 = TypographyKt.fromToken(typography11113, datePickerModalTokens11113.getRangeSelectionHeaderHeadlineFont());
                    float fM4389constructorimpl11113 = Dp.m4389constructorimpl(datePickerModalTokens11113.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                    ComposableLambda composableLambda111111117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i2111111119 = ((i23 >> 3) & 14) | 14155776;
                    int i21111111110 = i23 >> 9;
                    DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111111116, datePickerColorsM1060colors1m2CgY, textStyleFromToken11113, fM4389constructorimpl11113, composableLambda111111117, composerStartRestartGroup, i2111111119 | (i21111111110 & 112) | (i21111111110 & 896) | (i21111111110 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda111111118 = composableLambda;
                    Typography typography11114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens11114 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken11114 = TypographyKt.fromToken(typography11114, datePickerModalTokens11114.getRangeSelectionHeaderHeadlineFont());
                    float fM4389constructorimpl11114 = Dp.m4389constructorimpl(datePickerModalTokens11114.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                    ComposableLambda composableLambda111111119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i21111111111 = ((i23 >> 3) & 14) | 14155776;
                    int i21111111112 = i23 >> 9;
                    DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111111118, datePickerColorsM1060colors1m2CgY, textStyleFromToken11114, fM4389constructorimpl11114, composableLambda111111119, composerStartRestartGroup, i21111111111 | (i21111111112 & 112) | (i21111111112 & 896) | (i21111111112 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
            }
            i12 |= 24576;
            function5 = function2;
            i19 = i11 & 32;
            if (i19 != 0) {
                if ((458752 & i10) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda1111111110 = composableLambda;
                    Typography typography11115 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens11115 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken11115 = TypographyKt.fromToken(typography11115, datePickerModalTokens11115.getRangeSelectionHeaderHeadlineFont());
                    float fM4389constructorimpl11115 = Dp.m4389constructorimpl(datePickerModalTokens11115.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                    ComposableLambda composableLambda1111111111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i21111111113 = ((i23 >> 3) & 14) | 14155776;
                    int i21111111114 = i23 >> 9;
                    DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111111110, datePickerColorsM1060colors1m2CgY, textStyleFromToken11115, fM4389constructorimpl11115, composableLambda1111111111, composerStartRestartGroup, i21111111113 | (i21111111114 & 112) | (i21111111114 & 896) | (i21111111114 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda1111111112 = composableLambda;
                    Typography typography11116 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens11116 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken11116 = TypographyKt.fromToken(typography11116, datePickerModalTokens11116.getRangeSelectionHeaderHeadlineFont());
                    float fM4389constructorimpl11116 = Dp.m4389constructorimpl(datePickerModalTokens11116.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                    ComposableLambda composableLambda1111111113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i21111111115 = ((i23 >> 3) & 14) | 14155776;
                    int i21111111116 = i23 >> 9;
                    DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111111112, datePickerColorsM1060colors1m2CgY, textStyleFromToken11116, fM4389constructorimpl11116, composableLambda1111111113, composerStartRestartGroup, i21111111115 | (i21111111116 & 112) | (i21111111116 & 896) | (i21111111116 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function6 = function3;
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
            }
            if ((i12 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = a.f10127p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = a.f10127p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                }
                if (z11) {
                    z12 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                } else {
                    z12 = true;
                    composableLambda = null;
                }
                ComposableLambda composableLambda1111111114 = composableLambda;
                Typography typography11117 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                DatePickerModalTokens datePickerModalTokens11117 = DatePickerModalTokens.INSTANCE;
                TextStyle textStyleFromToken11117 = TypographyKt.fromToken(typography11117, datePickerModalTokens11117.getRangeSelectionHeaderHeadlineFont());
                float fM4389constructorimpl11117 = Dp.m4389constructorimpl(datePickerModalTokens11117.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                ComposableLambda composableLambda1111111115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                int i21111111117 = ((i23 >> 3) & 14) | 14155776;
                int i21111111118 = i23 >> 9;
                DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111111114, datePickerColorsM1060colors1m2CgY, textStyleFromToken11117, fM4389constructorimpl11117, composableLambda1111111115, composerStartRestartGroup, i21111111117 | (i21111111118 & 112) | (i21111111118 & 896) | (i21111111118 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function2ComposableLambda;
                function9 = function2ComposableLambda2;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = a.f10127p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = a.f10127p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                }
                if (z11) {
                    z12 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                } else {
                    z12 = true;
                    composableLambda = null;
                }
                ComposableLambda composableLambda1111111116 = composableLambda;
                Typography typography11118 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                DatePickerModalTokens datePickerModalTokens11118 = DatePickerModalTokens.INSTANCE;
                TextStyle textStyleFromToken11118 = TypographyKt.fromToken(typography11118, datePickerModalTokens11118.getRangeSelectionHeaderHeadlineFont());
                float fM4389constructorimpl11118 = Dp.m4389constructorimpl(datePickerModalTokens11118.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                ComposableLambda composableLambda1111111117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                int i21111111119 = ((i23 >> 3) & 14) | 14155776;
                int i211111111110 = i23 >> 9;
                DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111111116, datePickerColorsM1060colors1m2CgY, textStyleFromToken11118, fM4389constructorimpl11118, composableLambda1111111117, composerStartRestartGroup, i21111111119 | (i211111111110 & 112) | (i211111111110 & 896) | (i211111111110 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function2ComposableLambda;
                function9 = function2ComposableLambda2;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        datePickerFormatter2 = datePickerFormatter;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                function4 = function1;
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    function5 = function2;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 32;
                if (i19 != 0) {
                    if ((458752 & i10) == 0) {
                        function6 = function3;
                        if (composerStartRestartGroup.changedInstance(function6)) {
                            i20 = 131072;
                        } else {
                            i20 = 65536;
                        }
                        i12 |= i20;
                    }
                    i21 = i11 & 64;
                    if (i21 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(z10)) {
                            i22 = 1048576;
                        } else {
                            i22 = 524288;
                        }
                        i12 |= i22;
                    }
                    if ((i10 & 29360128) != 0) {
                        i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                    }
                    if ((i12 & 23967451) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda1111111118 = composableLambda;
                        Typography typography11119 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens11119 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken11119 = TypographyKt.fromToken(typography11119, datePickerModalTokens11119.getRangeSelectionHeaderHeadlineFont());
                        float fM4389constructorimpl11119 = Dp.m4389constructorimpl(datePickerModalTokens11119.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                        ComposableLambda composableLambda1111111119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i211111111111 = ((i23 >> 3) & 14) | 14155776;
                        int i211111111112 = i23 >> 9;
                        DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111111118, datePickerColorsM1060colors1m2CgY, textStyleFromToken11119, fM4389constructorimpl11119, composableLambda1111111119, composerStartRestartGroup, i211111111111 | (i211111111112 & 112) | (i211111111112 & 896) | (i211111111112 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        } else {
                            if (i24 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function7 = a.f10127p0;
                            } else {
                                function7 = function4;
                            }
                            if (i17 != 0) {
                                function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                            } else {
                                function2ComposableLambda = function5;
                            }
                            if (i19 != 0) {
                                function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                            } else {
                                function2ComposableLambda2 = function3;
                            }
                            if (i21 != 0) {
                                z11 = true;
                            } else {
                                z11 = z10;
                            }
                            if ((i11 & 128) != 0) {
                                i23 = i12 & (-29360129);
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            } else {
                                i23 = i12;
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                        }
                        if (z11) {
                            z12 = true;
                            composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                        } else {
                            z12 = true;
                            composableLambda = null;
                        }
                        ComposableLambda composableLambda11111111110 = composableLambda;
                        Typography typography111110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                        DatePickerModalTokens datePickerModalTokens111110 = DatePickerModalTokens.INSTANCE;
                        TextStyle textStyleFromToken111110 = TypographyKt.fromToken(typography111110, datePickerModalTokens111110.getRangeSelectionHeaderHeadlineFont());
                        float fM4389constructorimpl111110 = Dp.m4389constructorimpl(datePickerModalTokens111110.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                        ComposableLambda composableLambda11111111111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                        int i211111111113 = ((i23 >> 3) & 14) | 14155776;
                        int i211111111114 = i23 >> 9;
                        DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11111111110, datePickerColorsM1060colors1m2CgY, textStyleFromToken111110, fM4389constructorimpl111110, composableLambda11111111111, composerStartRestartGroup, i211111111113 | (i211111111114 & 112) | (i211111111114 & 896) | (i211111111114 & 57344));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function8 = function2ComposableLambda;
                        function9 = function2ComposableLambda2;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                function6 = function3;
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda11111111112 = composableLambda;
                    Typography typography111111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens111111 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken111111 = TypographyKt.fromToken(typography111111, datePickerModalTokens111111.getRangeSelectionHeaderHeadlineFont());
                    float fM4389constructorimpl111111 = Dp.m4389constructorimpl(datePickerModalTokens111111.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                    ComposableLambda composableLambda11111111113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i211111111115 = ((i23 >> 3) & 14) | 14155776;
                    int i211111111116 = i23 >> 9;
                    DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11111111112, datePickerColorsM1060colors1m2CgY, textStyleFromToken111111, fM4389constructorimpl111111, composableLambda11111111113, composerStartRestartGroup, i211111111115 | (i211111111116 & 112) | (i211111111116 & 896) | (i211111111116 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda11111111114 = composableLambda;
                    Typography typography111112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens111112 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken111112 = TypographyKt.fromToken(typography111112, datePickerModalTokens111112.getRangeSelectionHeaderHeadlineFont());
                    float fM4389constructorimpl111112 = Dp.m4389constructorimpl(datePickerModalTokens111112.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                    ComposableLambda composableLambda11111111115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i211111111117 = ((i23 >> 3) & 14) | 14155776;
                    int i211111111118 = i23 >> 9;
                    DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11111111114, datePickerColorsM1060colors1m2CgY, textStyleFromToken111112, fM4389constructorimpl111112, composableLambda11111111115, composerStartRestartGroup, i211111111117 | (i211111111118 & 112) | (i211111111118 & 896) | (i211111111118 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
            }
            i12 |= 24576;
            function5 = function2;
            i19 = i11 & 32;
            if (i19 != 0) {
                if ((458752 & i10) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda11111111116 = composableLambda;
                    Typography typography111113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens111113 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken111113 = TypographyKt.fromToken(typography111113, datePickerModalTokens111113.getRangeSelectionHeaderHeadlineFont());
                    float fM4389constructorimpl111113 = Dp.m4389constructorimpl(datePickerModalTokens111113.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                    ComposableLambda composableLambda11111111117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i211111111119 = ((i23 >> 3) & 14) | 14155776;
                    int i2111111111110 = i23 >> 9;
                    DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11111111116, datePickerColorsM1060colors1m2CgY, textStyleFromToken111113, fM4389constructorimpl111113, composableLambda11111111117, composerStartRestartGroup, i211111111119 | (i2111111111110 & 112) | (i2111111111110 & 896) | (i2111111111110 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda11111111118 = composableLambda;
                    Typography typography111114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens111114 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken111114 = TypographyKt.fromToken(typography111114, datePickerModalTokens111114.getRangeSelectionHeaderHeadlineFont());
                    float fM4389constructorimpl111114 = Dp.m4389constructorimpl(datePickerModalTokens111114.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                    ComposableLambda composableLambda11111111119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i2111111111111 = ((i23 >> 3) & 14) | 14155776;
                    int i2111111111112 = i23 >> 9;
                    DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda11111111118, datePickerColorsM1060colors1m2CgY, textStyleFromToken111114, fM4389constructorimpl111114, composableLambda11111111119, composerStartRestartGroup, i2111111111111 | (i2111111111112 & 112) | (i2111111111112 & 896) | (i2111111111112 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function6 = function3;
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
            }
            if ((i12 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = a.f10127p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = a.f10127p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                }
                if (z11) {
                    z12 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                } else {
                    z12 = true;
                    composableLambda = null;
                }
                ComposableLambda composableLambda111111111110 = composableLambda;
                Typography typography111115 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                DatePickerModalTokens datePickerModalTokens111115 = DatePickerModalTokens.INSTANCE;
                TextStyle textStyleFromToken111115 = TypographyKt.fromToken(typography111115, datePickerModalTokens111115.getRangeSelectionHeaderHeadlineFont());
                float fM4389constructorimpl111115 = Dp.m4389constructorimpl(datePickerModalTokens111115.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                ComposableLambda composableLambda111111111111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                int i2111111111113 = ((i23 >> 3) & 14) | 14155776;
                int i2111111111114 = i23 >> 9;
                DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111111111110, datePickerColorsM1060colors1m2CgY, textStyleFromToken111115, fM4389constructorimpl111115, composableLambda111111111111, composerStartRestartGroup, i2111111111113 | (i2111111111114 & 112) | (i2111111111114 & 896) | (i2111111111114 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function2ComposableLambda;
                function9 = function2ComposableLambda2;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = a.f10127p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = a.f10127p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                }
                if (z11) {
                    z12 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                } else {
                    z12 = true;
                    composableLambda = null;
                }
                ComposableLambda composableLambda111111111112 = composableLambda;
                Typography typography111116 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                DatePickerModalTokens datePickerModalTokens111116 = DatePickerModalTokens.INSTANCE;
                TextStyle textStyleFromToken111116 = TypographyKt.fromToken(typography111116, datePickerModalTokens111116.getRangeSelectionHeaderHeadlineFont());
                float fM4389constructorimpl111116 = Dp.m4389constructorimpl(datePickerModalTokens111116.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                ComposableLambda composableLambda111111111113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                int i2111111111115 = ((i23 >> 3) & 14) | 14155776;
                int i2111111111116 = i23 >> 9;
                DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111111111112, datePickerColorsM1060colors1m2CgY, textStyleFromToken111116, fM4389constructorimpl111116, composableLambda111111111113, composerStartRestartGroup, i2111111111115 | (i2111111111116 & 112) | (i2111111111116 & 896) | (i2111111111116 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function2ComposableLambda;
                function9 = function2ComposableLambda2;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
        }
        i12 |= 3072;
        function4 = function1;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 57344) == 0) {
                function5 = function2;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            i19 = i11 & 32;
            if (i19 != 0) {
                if ((458752 & i10) == 0) {
                    function6 = function3;
                    if (composerStartRestartGroup.changedInstance(function6)) {
                        i20 = 131072;
                    } else {
                        i20 = 65536;
                    }
                    i12 |= i20;
                }
                i21 = i11 & 64;
                if (i21 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(z10)) {
                        i22 = 1048576;
                    } else {
                        i22 = 524288;
                    }
                    i12 |= i22;
                }
                if ((i10 & 29360128) != 0) {
                    i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
                }
                if ((i12 & 23967451) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda111111111114 = composableLambda;
                    Typography typography111117 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens111117 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken111117 = TypographyKt.fromToken(typography111117, datePickerModalTokens111117.getRangeSelectionHeaderHeadlineFont());
                    float fM4389constructorimpl111117 = Dp.m4389constructorimpl(datePickerModalTokens111117.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                    ComposableLambda composableLambda111111111115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i2111111111117 = ((i23 >> 3) & 14) | 14155776;
                    int i2111111111118 = i23 >> 9;
                    DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111111111114, datePickerColorsM1060colors1m2CgY, textStyleFromToken111117, fM4389constructorimpl111117, composableLambda111111111115, composerStartRestartGroup, i2111111111117 | (i2111111111118 & 112) | (i2111111111118 & 896) | (i2111111111118 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    } else {
                        if (i24 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function7 = a.f10127p0;
                        } else {
                            function7 = function4;
                        }
                        if (i17 != 0) {
                            function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                        } else {
                            function2ComposableLambda = function5;
                        }
                        if (i19 != 0) {
                            function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                        } else {
                            function2ComposableLambda2 = function3;
                        }
                        if (i21 != 0) {
                            z11 = true;
                        } else {
                            z11 = z10;
                        }
                        if ((i11 & 128) != 0) {
                            i23 = i12 & (-29360129);
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        } else {
                            i23 = i12;
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                    }
                    if (z11) {
                        z12 = true;
                        composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                    } else {
                        z12 = true;
                        composableLambda = null;
                    }
                    ComposableLambda composableLambda111111111116 = composableLambda;
                    Typography typography111118 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                    DatePickerModalTokens datePickerModalTokens111118 = DatePickerModalTokens.INSTANCE;
                    TextStyle textStyleFromToken111118 = TypographyKt.fromToken(typography111118, datePickerModalTokens111118.getRangeSelectionHeaderHeadlineFont());
                    float fM4389constructorimpl111118 = Dp.m4389constructorimpl(datePickerModalTokens111118.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                    ComposableLambda composableLambda111111111117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                    int i2111111111119 = ((i23 >> 3) & 14) | 14155776;
                    int i21111111111110 = i23 >> 9;
                    DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111111111116, datePickerColorsM1060colors1m2CgY, textStyleFromToken111118, fM4389constructorimpl111118, composableLambda111111111117, composerStartRestartGroup, i2111111111119 | (i21111111111110 & 112) | (i21111111111110 & 896) | (i21111111111110 & 57344));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function8 = function2ComposableLambda;
                    function9 = function2ComposableLambda2;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            function6 = function3;
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
            }
            if ((i12 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = a.f10127p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = a.f10127p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                }
                if (z11) {
                    z12 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                } else {
                    z12 = true;
                    composableLambda = null;
                }
                ComposableLambda composableLambda111111111118 = composableLambda;
                Typography typography111119 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                DatePickerModalTokens datePickerModalTokens111119 = DatePickerModalTokens.INSTANCE;
                TextStyle textStyleFromToken111119 = TypographyKt.fromToken(typography111119, datePickerModalTokens111119.getRangeSelectionHeaderHeadlineFont());
                float fM4389constructorimpl111119 = Dp.m4389constructorimpl(datePickerModalTokens111119.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                ComposableLambda composableLambda111111111119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                int i21111111111111 = ((i23 >> 3) & 14) | 14155776;
                int i21111111111112 = i23 >> 9;
                DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda111111111118, datePickerColorsM1060colors1m2CgY, textStyleFromToken111119, fM4389constructorimpl111119, composableLambda111111111119, composerStartRestartGroup, i21111111111111 | (i21111111111112 & 112) | (i21111111111112 & 896) | (i21111111111112 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function2ComposableLambda;
                function9 = function2ComposableLambda2;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = a.f10127p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = a.f10127p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                }
                if (z11) {
                    z12 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                } else {
                    z12 = true;
                    composableLambda = null;
                }
                ComposableLambda composableLambda1111111111110 = composableLambda;
                Typography typography1111110 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                DatePickerModalTokens datePickerModalTokens1111110 = DatePickerModalTokens.INSTANCE;
                TextStyle textStyleFromToken1111110 = TypographyKt.fromToken(typography1111110, datePickerModalTokens1111110.getRangeSelectionHeaderHeadlineFont());
                float fM4389constructorimpl1111110 = Dp.m4389constructorimpl(datePickerModalTokens1111110.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                ComposableLambda composableLambda1111111111111 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                int i21111111111113 = ((i23 >> 3) & 14) | 14155776;
                int i21111111111114 = i23 >> 9;
                DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111111111110, datePickerColorsM1060colors1m2CgY, textStyleFromToken1111110, fM4389constructorimpl1111110, composableLambda1111111111111, composerStartRestartGroup, i21111111111113 | (i21111111111114 & 112) | (i21111111111114 & 896) | (i21111111111114 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function2ComposableLambda;
                function9 = function2ComposableLambda2;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
        }
        i12 |= 24576;
        function5 = function2;
        i19 = i11 & 32;
        if (i19 != 0) {
            if ((458752 & i10) == 0) {
                function6 = function3;
                if (composerStartRestartGroup.changedInstance(function6)) {
                    i20 = 131072;
                } else {
                    i20 = 65536;
                }
                i12 |= i20;
            }
            i21 = i11 & 64;
            if (i21 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(z10)) {
                    i22 = 1048576;
                } else {
                    i22 = 524288;
                }
                i12 |= i22;
            }
            if ((i10 & 29360128) != 0) {
                i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
            }
            if ((i12 & 23967451) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = a.f10127p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = a.f10127p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                }
                if (z11) {
                    z12 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                } else {
                    z12 = true;
                    composableLambda = null;
                }
                ComposableLambda composableLambda1111111111112 = composableLambda;
                Typography typography1111111 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                DatePickerModalTokens datePickerModalTokens1111111 = DatePickerModalTokens.INSTANCE;
                TextStyle textStyleFromToken1111111 = TypographyKt.fromToken(typography1111111, datePickerModalTokens1111111.getRangeSelectionHeaderHeadlineFont());
                float fM4389constructorimpl1111111 = Dp.m4389constructorimpl(datePickerModalTokens1111111.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                ComposableLambda composableLambda1111111111113 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                int i21111111111115 = ((i23 >> 3) & 14) | 14155776;
                int i21111111111116 = i23 >> 9;
                DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111111111112, datePickerColorsM1060colors1m2CgY, textStyleFromToken1111111, fM4389constructorimpl1111111, composableLambda1111111111113, composerStartRestartGroup, i21111111111115 | (i21111111111116 & 112) | (i21111111111116 & 896) | (i21111111111116 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function2ComposableLambda;
                function9 = function2ComposableLambda2;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = a.f10127p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                } else {
                    if (i24 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function7 = a.f10127p0;
                    } else {
                        function7 = function4;
                    }
                    if (i17 != 0) {
                        function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                    } else {
                        function2ComposableLambda = function5;
                    }
                    if (i19 != 0) {
                        function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                    } else {
                        function2ComposableLambda2 = function3;
                    }
                    if (i21 != 0) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if ((i11 & 128) != 0) {
                        i23 = i12 & (-29360129);
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    } else {
                        i23 = i12;
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
                }
                if (z11) {
                    z12 = true;
                    composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
                } else {
                    z12 = true;
                    composableLambda = null;
                }
                ComposableLambda composableLambda1111111111114 = composableLambda;
                Typography typography1111112 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
                DatePickerModalTokens datePickerModalTokens1111112 = DatePickerModalTokens.INSTANCE;
                TextStyle textStyleFromToken1111112 = TypographyKt.fromToken(typography1111112, datePickerModalTokens1111112.getRangeSelectionHeaderHeadlineFont());
                float fM4389constructorimpl1111112 = Dp.m4389constructorimpl(datePickerModalTokens1111112.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
                ComposableLambda composableLambda1111111111115 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
                int i21111111111117 = ((i23 >> 3) & 14) | 14155776;
                int i21111111111118 = i23 >> 9;
                DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111111111114, datePickerColorsM1060colors1m2CgY, textStyleFromToken1111112, fM4389constructorimpl1111112, composableLambda1111111111115, composerStartRestartGroup, i21111111111117 | (i21111111111118 & 112) | (i21111111111118 & 896) | (i21111111111118 & 57344));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function8 = function2ComposableLambda;
                function9 = function2ComposableLambda2;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
        }
        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        function6 = function3;
        i21 = i11 & 64;
        if (i21 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(z10)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i12 |= i22;
        }
        if ((i10 & 29360128) != 0) {
            i12 |= ((i11 & 128) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 4194304 : 8388608;
        }
        if ((i12 & 23967451) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                }
                if (i15 != 0) {
                    function7 = a.f10127p0;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                } else {
                    function2ComposableLambda = function5;
                }
                if (i19 != 0) {
                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                } else {
                    function2ComposableLambda2 = function3;
                }
                if (i21 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 128) != 0) {
                    i23 = i12 & (-29360129);
                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                } else {
                    i23 = i12;
                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                }
            } else {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                }
                if (i15 != 0) {
                    function7 = a.f10127p0;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                } else {
                    function2ComposableLambda = function5;
                }
                if (i19 != 0) {
                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                } else {
                    function2ComposableLambda2 = function3;
                }
                if (i21 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 128) != 0) {
                    i23 = i12 & (-29360129);
                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                } else {
                    i23 = i12;
                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
            }
            if (z11) {
                z12 = true;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
            } else {
                z12 = true;
                composableLambda = null;
            }
            ComposableLambda composableLambda1111111111116 = composableLambda;
            Typography typography1111113 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
            DatePickerModalTokens datePickerModalTokens1111113 = DatePickerModalTokens.INSTANCE;
            TextStyle textStyleFromToken1111113 = TypographyKt.fromToken(typography1111113, datePickerModalTokens1111113.getRangeSelectionHeaderHeadlineFont());
            float fM4389constructorimpl1111113 = Dp.m4389constructorimpl(datePickerModalTokens1111113.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
            ComposableLambda composableLambda1111111111117 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
            int i21111111111119 = ((i23 >> 3) & 14) | 14155776;
            int i211111111111110 = i23 >> 9;
            DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111111111116, datePickerColorsM1060colors1m2CgY, textStyleFromToken1111113, fM4389constructorimpl1111113, composableLambda1111111111117, composerStartRestartGroup, i21111111111119 | (i211111111111110 & 112) | (i211111111111110 & 896) | (i211111111111110 & 57344));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function8 = function2ComposableLambda;
            function9 = function2ComposableLambda2;
            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
            modifier3 = modifier2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                }
                if (i15 != 0) {
                    function7 = a.f10127p0;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                } else {
                    function2ComposableLambda = function5;
                }
                if (i19 != 0) {
                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                } else {
                    function2ComposableLambda2 = function3;
                }
                if (i21 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 128) != 0) {
                    i23 = i12 & (-29360129);
                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                } else {
                    i23 = i12;
                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                }
            } else {
                if (i24 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new DatePickerFormatter(null, null, null, 7, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    datePickerFormatter2 = (DatePickerFormatter) objRememberedValue;
                }
                if (i15 != 0) {
                    function7 = a.f10127p0;
                } else {
                    function7 = function4;
                }
                if (i17 != 0) {
                    function2ComposableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 492752701, true, new b(state, i12));
                } else {
                    function2ComposableLambda = function5;
                }
                if (i19 != 0) {
                    function2ComposableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -204181785, true, new c(state, datePickerFormatter2, i12));
                } else {
                    function2ComposableLambda2 = function3;
                }
                if (i21 != 0) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if ((i11 & 128) != 0) {
                    i23 = i12 & (-29360129);
                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                } else {
                    i23 = i12;
                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1835392055, i23, -1, "androidx.compose.material3.DateRangePicker (DateRangePicker.kt:84)");
            }
            if (z11) {
                z12 = true;
                composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1062265737, true, new d(state, i23));
            } else {
                z12 = true;
                composableLambda = null;
            }
            ComposableLambda composableLambda1111111111118 = composableLambda;
            Typography typography1111114 = MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6);
            DatePickerModalTokens datePickerModalTokens1111114 = DatePickerModalTokens.INSTANCE;
            TextStyle textStyleFromToken1111114 = TypographyKt.fromToken(typography1111114, datePickerModalTokens1111114.getRangeSelectionHeaderHeadlineFont());
            float fM4389constructorimpl1111114 = Dp.m4389constructorimpl(datePickerModalTokens1111114.m1614getRangeSelectionHeaderContainerHeightD9Ej5fM() - f10126d);
            ComposableLambda composableLambda1111111111119 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -186850856, z12, new e(state, datePickerFormatter2, function7, datePickerColorsM1060colors1m2CgY, i23));
            int i211111111111111 = ((i23 >> 3) & 14) | 14155776;
            int i211111111111112 = i23 >> 9;
            DatePickerKt.m1063DateEntryContainerau3_HiA(modifier2, function2ComposableLambda, function2ComposableLambda2, composableLambda1111111111118, datePickerColorsM1060colors1m2CgY, textStyleFromToken1111114, fM4389constructorimpl1111114, composableLambda1111111111119, composerStartRestartGroup, i211111111111111 | (i211111111111112 & 112) | (i211111111111112 & 896) | (i211111111111112 & 57344));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function8 = function2ComposableLambda;
            function9 = function2ComposableLambda2;
            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier3, datePickerFormatter2, function7, function8, function9, z11, datePickerColors2, i10, i11));
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void a(Function1<? super Long, Unit> function1, StateData stateData, LazyListState lazyListState, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function2, DatePickerColors datePickerColors, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-837198453);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(stateData) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(lazyListState) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerFormatter) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerColors) ? 131072 : 65536;
        }
        int i12 = i11;
        if ((374491 & i12) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-837198453, i12, -1, "androidx.compose.material3.VerticalMonthsList (DateRangePicker.kt:511)");
            }
            CalendarDate today = stateData.getCalendarModel().getToday();
            IntRange yearRange = stateData.getYearRange();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(yearRange);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = stateData.getCalendarModel().getMonth(stateData.getYearRange().getFirst(), 1);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TextKt.ProvideTextStyle(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), DatePickerModalTokens.INSTANCE.getRangeSelectionMonthSubheadFont()), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 56792252, true, new g(lazyListState, i12, stateData, (CalendarMonth) objRememberedValue, datePickerFormatter, datePickerColors, function1, today, function2)), composerStartRestartGroup, 48);
            int i13 = (i12 >> 6) & 14;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged2 = composerStartRestartGroup.changed(lazyListState) | composerStartRestartGroup.changed(stateData);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new h(lazyListState, stateData, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(lazyListState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i13 | 64);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new i(function1, stateData, lazyListState, datePickerFormatter, function2, datePickerColors, i10));
    }

    public static final void access$DateRangePickerContent(StateData stateData, DatePickerFormatter datePickerFormatter, Function1 function1, DatePickerColors datePickerColors, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1003501610);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(stateData) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerFormatter) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerColors) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1003501610, i11, -1, "androidx.compose.material3.DateRangePickerContent (DateRangePicker.kt:478)");
            }
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(stateData.getDisplayedMonthIndex(), 0, composerStartRestartGroup, 0, 2);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(stateData);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new l0.l1(stateData);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Function1 function2 = (Function1) objRememberedValue;
            Modifier modifierM298paddingVpY3zN4$default = PaddingKt.m298paddingVpY3zN4$default(Modifier.INSTANCE, DatePickerKt.getDatePickerHorizontalPadding(), 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            MeasurePolicy measurePolicyA = androidx.camera.core.impl.v.a(Alignment.INSTANCE, Arrangement.INSTANCE.getTop(), composerStartRestartGroup, 0, -1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierM298paddingVpY3zN4$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyA, composerM2074constructorimpl, density));
            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            DatePickerKt.WeekDays(datePickerColors, stateData.getCalendarModel(), composerStartRestartGroup, (i11 >> 9) & 14);
            int i12 = (i11 << 3) & 112;
            int i13 = i11 << 6;
            a(function2, stateData, lazyListStateRememberLazyListState, datePickerFormatter, function1, datePickerColors, composerStartRestartGroup, i12 | (i13 & 7168) | (57344 & i13) | (i13 & 458752));
            if (com.mypinpad.tsdk.isolation.y2.d(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l0.k1(stateData, datePickerFormatter, function1, datePickerColors, i10));
    }

    public static final void access$SwitchableDateEntryContent(DateRangePickerState dateRangePickerState, DatePickerFormatter datePickerFormatter, Function1 function1, DatePickerColors datePickerColors, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(984055784);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(dateRangePickerState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerFormatter) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerColors) ? 2048 : 1024;
        }
        int i12 = i11;
        if ((i12 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(984055784, i12, -1, "androidx.compose.material3.SwitchableDateEntryContent (DateRangePicker.kt:447)");
            }
            int iM1071getDisplayModejFl4v0 = dateRangePickerState.m1071getDisplayModejFl4v0();
            CrossfadeKt.Crossfade(DisplayMode.m1073boximpl(iM1071getDisplayModejFl4v0), SemanticsModifierKt.semantics$default(Modifier.INSTANCE, false, l0.m1.f82699p0, 1, null), AnimationSpecKt.spring$default(0.0f, 0.0f, null, 7, null), (String) null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1354418636, true, new w0(dateRangePickerState, datePickerFormatter, function1, datePickerColors, i12)), composerStartRestartGroup, 24960, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l0.n1(dateRangePickerState, datePickerFormatter, function1, datePickerColors, i10));
    }

    public static final void access$updateDateSelection(StateData stateData, long j10) {
        CalendarDate canonicalDate = stateData.getCalendarModel().getCanonicalDate(j10);
        CalendarDate value = stateData.getSelectedStartDate().getValue();
        CalendarDate value2 = stateData.getSelectedEndDate().getValue();
        if ((value == null && value2 == null) || ((value != null && value2 != null) || (value != null && canonicalDate.compareTo(value) < 0))) {
            stateData.getSelectedStartDate().setValue(canonicalDate);
            stateData.getSelectedEndDate().setValue(null);
        } else {
            if (value == null || canonicalDate.compareTo(value) < 0) {
                return;
            }
            stateData.getSelectedEndDate().setValue(canonicalDate);
        }
    }

    /* JADX INFO: renamed from: drawRangeBackground-mxwnekA, reason: not valid java name */
    public static final void m1069drawRangeBackgroundmxwnekA(@NotNull ContentDrawScope drawRangeBackground, @NotNull SelectedRangeInfo selectedRangeInfo, long j10) {
        Intrinsics.checkNotNullParameter(drawRangeBackground, "$this$drawRangeBackground");
        Intrinsics.checkNotNullParameter(selectedRangeInfo, "selectedRangeInfo");
        float fMo415toPx0680j_4 = drawRangeBackground.mo415toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float fMo415toPx0680j_5 = drawRangeBackground.mo415toPx0680j_4(DatePickerKt.getRecommendedSizeForAccessibility());
        float fMo415toPx0680j_6 = drawRangeBackground.mo415toPx0680j_4(DatePickerModalTokens.INSTANCE.m1607getDateStateLayerHeightD9Ej5fM());
        float f6 = 2;
        float f10 = (fMo415toPx0680j_5 - fMo415toPx0680j_6) / f6;
        float f11 = 7;
        float fA = androidx.camera.camera2.internal.h0.a(f11, fMo415toPx0680j_4, Size.m2344getWidthimpl(drawRangeBackground.mo2909getSizeNHjbRc()), f11);
        long f18312a = selectedRangeInfo.getGridCoordinates().getFirst().getF18312a();
        int iM4499component1impl = IntOffset.m4499component1impl(f18312a);
        int iM4500component2impl = IntOffset.m4500component2impl(f18312a);
        long f18312a2 = selectedRangeInfo.getGridCoordinates().getSecond().getF18312a();
        int iM4499component1impl2 = IntOffset.m4499component1impl(f18312a2);
        int iM4500component2impl2 = IntOffset.m4500component2impl(f18312a2);
        float f12 = fMo415toPx0680j_4 + fA;
        float f13 = fA / f6;
        float fM2344getWidthimpl = (iM4499component1impl * f12) + (selectedRangeInfo.getFirstIsSelectionStart() ? fMo415toPx0680j_4 / f6 : 0.0f) + f13;
        float f14 = (iM4500component2impl * fMo415toPx0680j_5) + f10;
        float f15 = iM4499component1impl2 * f12;
        if (selectedRangeInfo.getLastIsSelectionEnd()) {
            fMo415toPx0680j_4 /= f6;
        }
        float fM2344getWidthimpl2 = f15 + fMo415toPx0680j_4 + f13;
        float f16 = (iM4500component2impl2 * fMo415toPx0680j_5) + f10;
        boolean z10 = drawRangeBackground.getLayoutDirection() == LayoutDirection.Rtl;
        if (z10) {
            fM2344getWidthimpl = Size.m2344getWidthimpl(drawRangeBackground.mo2909getSizeNHjbRc()) - fM2344getWidthimpl;
            fM2344getWidthimpl2 = Size.m2344getWidthimpl(drawRangeBackground.mo2909getSizeNHjbRc()) - fM2344getWidthimpl2;
        }
        float fM2344getWidthimpl3 = fM2344getWidthimpl2;
        a1.b.K(drawRangeBackground, j10, OffsetKt.Offset(fM2344getWidthimpl, f14), SizeKt.Size(iM4500component2impl == iM4500component2impl2 ? fM2344getWidthimpl3 - fM2344getWidthimpl : z10 ? -fM2344getWidthimpl : Size.m2344getWidthimpl(drawRangeBackground.mo2909getSizeNHjbRc()) - fM2344getWidthimpl, fMo415toPx0680j_6), 0.0f, null, null, 0, 120, null);
        if (iM4500component2impl != iM4500component2impl2) {
            for (int i10 = (iM4500component2impl2 - iM4500component2impl) - 1; i10 > 0; i10--) {
                a1.b.K(drawRangeBackground, j10, OffsetKt.Offset(0.0f, (i10 * fMo415toPx0680j_5) + f14), SizeKt.Size(Size.m2344getWidthimpl(drawRangeBackground.mo2909getSizeNHjbRc()), fMo415toPx0680j_6), 0.0f, null, null, 0, 120, null);
            }
            long jOffset = OffsetKt.Offset(drawRangeBackground.getLayoutDirection() == LayoutDirection.Ltr ? 0.0f : Size.m2344getWidthimpl(drawRangeBackground.mo2909getSizeNHjbRc()), f16);
            if (z10) {
                fM2344getWidthimpl3 -= Size.m2344getWidthimpl(drawRangeBackground.mo2909getSizeNHjbRc());
            }
            a1.b.K(drawRangeBackground, j10, jOffset, SizeKt.Size(fM2344getWidthimpl3, fMo415toPx0680j_6), 0.0f, null, null, 0, 120, null);
        }
    }

    @NotNull
    public static final PaddingValues getCalendarMonthSubheadPadding() {
        return f10123a;
    }

    @Composable
    @ExperimentalMaterial3Api
    @NotNull
    /* JADX INFO: renamed from: rememberDateRangePickerState-pMw4iz8, reason: not valid java name */
    public static final DateRangePickerState m1070rememberDateRangePickerStatepMw4iz8(@Nullable Long l6, @Nullable Long l7, @Nullable Long l10, @Nullable IntRange intRange, int i10, @Nullable Composer composer, int i11, int i12) {
        composer.startReplaceableGroup(501019096);
        Long l11 = (i12 & 1) != 0 ? null : l6;
        Long l12 = (i12 & 2) != 0 ? null : l7;
        Long l13 = (i12 & 4) != 0 ? l11 : l10;
        IntRange yearRange = (i12 & 8) != 0 ? DatePickerDefaults.INSTANCE.getYearRange() : intRange;
        int iM1081getPickerjFl4v0 = (i12 & 16) != 0 ? DisplayMode.INSTANCE.m1081getPickerjFl4v0() : i10;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(501019096, i11, -1, "androidx.compose.material3.rememberDateRangePickerState (DateRangePicker.kt:157)");
        }
        DateRangePickerState dateRangePickerState = (DateRangePickerState) RememberSaveableKt.m2165rememberSaveable(new Object[0], (Saver) DateRangePickerState.INSTANCE.Saver(), (String) null, (Function0) new j(l11, l12, l13, yearRange, iM1081getPickerjFl4v0), composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return dateRangePickerState;
    }
}
