package androidx.compose.material3;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.DecayAnimationSpecKt;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.LiveRegionMode;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DatePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bC\u0010DJÓ\u0001\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u0002H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b\u001f\u0010 J)\u0010#\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b#\u0010$J'\u0010-\u001a\u00020*2\u0006\u0010&\u001a\u00020%2\u000e\b\u0002\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H\u0001¢\u0006\u0004\b+\u0010,R\u0017\u00103\u001a\u00020.8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00109\u001a\u0002048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020:8\u0006X\u0086T¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010=\u001a\u00020:8\u0006X\u0086T¢\u0006\u0006\n\u0004\b=\u0010<R\u0014\u0010>\u001a\u00020:8\u0006X\u0086T¢\u0006\u0006\n\u0004\b>\u0010<R\u0011\u0010B\u001a\u00020?8G¢\u0006\u0006\u001a\u0004\b@\u0010A\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006E"}, d2 = {"Landroidx/compose/material3/DatePickerDefaults;", "", "Landroidx/compose/ui/graphics/Color;", "containerColor", "titleContentColor", "headlineContentColor", "weekdayContentColor", "subheadContentColor", "yearContentColor", "currentYearContentColor", "selectedYearContentColor", "selectedYearContainerColor", "dayContentColor", "disabledDayContentColor", "selectedDayContentColor", "disabledSelectedDayContentColor", "selectedDayContainerColor", "disabledSelectedDayContainerColor", "todayContentColor", "todayDateBorderColor", "dayInSelectionRangeContentColor", "dayInSelectionRangeContainerColor", "Landroidx/compose/material3/DatePickerColors;", "colors-1m2Cg-Y", "(JJJJJJJJJJJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/DatePickerColors;", "colors", "Landroidx/compose/material3/DatePickerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "DatePickerTitle", "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "DatePickerHeadline", "(Landroidx/compose/material3/DatePickerState;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/foundation/lazy/LazyListState;", "lazyListState", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "decayAnimationSpec", "Landroidx/compose/foundation/gestures/FlingBehavior;", "rememberSnapFlingBehavior$material3_release", "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/runtime/Composer;II)Landroidx/compose/foundation/gestures/FlingBehavior;", "rememberSnapFlingBehavior", "Lkotlin/ranges/IntRange;", "a", "Lkotlin/ranges/IntRange;", "getYearRange", "()Lkotlin/ranges/IntRange;", "YearRange", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getTonalElevation-D9Ej5fM", "()F", "TonalElevation", "", "YearMonthSkeleton", "Ljava/lang/String;", "YearAbbrMonthDaySkeleton", "YearMonthWeekdayDaySkeleton", "Landroidx/compose/ui/graphics/Shape;", "getShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "shape", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nDatePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,1920:1\n36#2:1921\n36#2:1929\n1114#3,6:1922\n1114#3,6:1930\n76#4:1928\n*S KotlinDebug\n*F\n+ 1 DatePicker.kt\nandroidx/compose/material3/DatePickerDefaults\n*L\n480#1:1921\n502#1:1929\n480#1:1922,6\n502#1:1930,6\n501#1:1928\n*E\n"})
public final class DatePickerDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final String YearAbbrMonthDaySkeleton = "yMMMd";

    @NotNull
    public static final String YearMonthSkeleton = "yMMMM";

    @NotNull
    public static final String YearMonthWeekdayDaySkeleton = "yMMMMEEEEd";

    @NotNull
    public static final DatePickerDefaults INSTANCE = new DatePickerDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final IntRange YearRange = new IntRange(ReturnCode.ERR_REPOSITORY, 2100);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float TonalElevation = DatePickerModalTokens.INSTANCE.m1602getContainerElevationD9Ej5fM();

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class a extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f9922p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f9922p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.m3842setLiveRegionhR3wRGc(semantics, LiveRegionMode.INSTANCE.m3824getPolite0phEisY());
            SemanticsPropertiesKt.setContentDescription(semantics, this.f9922p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DatePickerState f9924q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ DatePickerFormatter f9925r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9926s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f9927t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f9928u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DatePickerState datePickerState, DatePickerFormatter datePickerFormatter, Modifier modifier, int i10, int i11) {
            super(2);
            this.f9924q0 = datePickerState;
            this.f9925r0 = datePickerFormatter;
            this.f9926s0 = modifier;
            this.f9927t0 = i10;
            this.f9928u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            DatePickerDefaults.this.DatePickerHeadline(this.f9924q0, this.f9925r0, this.f9926s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9927t0 | 1), this.f9928u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePicker.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DatePickerState f9930q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9931r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f9932s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f9933t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DatePickerState datePickerState, Modifier modifier, int i10, int i11) {
            super(2);
            this.f9930q0 = datePickerState;
            this.f9931r0 = modifier;
            this.f9932s0 = i10;
            this.f9933t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            DatePickerDefaults.this.DatePickerTitle(this.f9930q0, this.f9931r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9932s0 | 1), this.f9933t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0076 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:52:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:54:0x0102  */
    /* JADX WARN: Code duplicated, block: B:55:0x0116  */
    /* JADX WARN: Code duplicated, block: B:58:0x012b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0145  */
    /* JADX WARN: Code duplicated, block: B:61:0x0159  */
    /* JADX WARN: Code duplicated, block: B:63:0x0163  */
    /* JADX WARN: Code duplicated, block: B:64:0x0177  */
    /* JADX WARN: Code duplicated, block: B:67:0x019e  */
    /* JADX WARN: Code duplicated, block: B:68:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:71:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:76:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:79:0x023f  */
    /* JADX WARN: Code duplicated, block: B:83:0x024b  */
    /* JADX WARN: Code duplicated, block: B:85:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void DatePickerHeadline(@NotNull DatePickerState state, @NotNull DatePickerFormatter dateFormatter, @Nullable Modifier modifier, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        Modifier modifier3;
        StateData stateData;
        String date$material3_release$default;
        String date$material3_release;
        String strM1320getStringNWtq28;
        int f10188a;
        DisplayMode.Companion companion;
        String strI;
        boolean zChanged;
        Object objRememberedValue;
        int f10188a2;
        DisplayMode.Companion companion2;
        int f10188a3;
        DisplayMode.Companion companion3;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1893194407);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changed(dateFormatter) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i12 & 731) == 146 || !composerStartRestartGroup.getSkipping()) {
                if (i13 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1893194407, i10, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:442)");
                }
                stateData = state.getStateData();
                Locale localeDefaultLocale = CalendarModel_androidKt.defaultLocale(composerStartRestartGroup, 0);
                date$material3_release$default = DatePickerFormatter.formatDate$material3_release$default(dateFormatter, stateData.getSelectedStartDate().getValue(), stateData.getCalendarModel(), localeDefaultLocale, false, 8, null);
                date$material3_release = dateFormatter.formatDate$material3_release(stateData.getSelectedStartDate().getValue(), stateData.getCalendarModel(), localeDefaultLocale, true);
                composerStartRestartGroup.startReplaceableGroup(729783869);
                strM1320getStringNWtq28 = "";
                if (date$material3_release == null) {
                    f10188a3 = stateData.getDisplayMode().getValue().getF10188a();
                    companion3 = DisplayMode.INSTANCE;
                    if (DisplayMode.m1076equalsimpl0(f10188a3, companion3.m1081getPickerjFl4v0())) {
                        composerStartRestartGroup.startReplaceableGroup(933108990);
                        date$material3_release = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1275getDatePickerNoSelectionDescriptionadMyvUU(), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (DisplayMode.m1076equalsimpl0(f10188a3, companion3.m1080getInputjFl4v0())) {
                        composerStartRestartGroup.startReplaceableGroup(933109079);
                        date$material3_release = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1270getDateInputNoInputDescriptionadMyvUU(), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1138387422);
                        composerStartRestartGroup.endReplaceableGroup();
                        date$material3_release = "";
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(729784366);
                if (date$material3_release$default == null) {
                    f10188a2 = stateData.getDisplayMode().getValue().getF10188a();
                    companion2 = DisplayMode.INSTANCE;
                    if (DisplayMode.m1076equalsimpl0(f10188a2, companion2.m1081getPickerjFl4v0())) {
                        composerStartRestartGroup.startReplaceableGroup(933109281);
                        date$material3_release$default = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1272getDatePickerHeadlineadMyvUU(), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else if (DisplayMode.m1076equalsimpl0(f10188a2, companion2.m1080getInputjFl4v0())) {
                        composerStartRestartGroup.startReplaceableGroup(933109356);
                        date$material3_release$default = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1264getDateInputHeadlineadMyvUU(), composerStartRestartGroup, 6);
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(-1138379145);
                        composerStartRestartGroup.endReplaceableGroup();
                        date$material3_release$default = "";
                    }
                }
                composerStartRestartGroup.endReplaceableGroup();
                f10188a = stateData.getDisplayMode().getValue().getF10188a();
                companion = DisplayMode.INSTANCE;
                if (DisplayMode.m1076equalsimpl0(f10188a, companion.m1081getPickerjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(933109538);
                    strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1273getDatePickerHeadlineDescriptionadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (DisplayMode.m1076equalsimpl0(f10188a, companion.m1080getInputjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(933109624);
                    strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1265getDateInputHeadlineDescriptionadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1138370496);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                strI = ai.a.i(new Object[]{date$material3_release}, 1, strM1320getStringNWtq28, "format(this, *args)");
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(strI);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new a(strI);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null);
                modifier2 = modifier3;
                TextKt.m1389Text4IGK_g(date$material3_release$default, modifierSemantics$default, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 3072, 122876);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(state, dateFormatter, modifier4, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        if ((i12 & 731) == 146) {
            if (i13 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1893194407, i10, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:442)");
            }
            stateData = state.getStateData();
            Locale localeDefaultLocale2 = CalendarModel_androidKt.defaultLocale(composerStartRestartGroup, 0);
            date$material3_release$default = DatePickerFormatter.formatDate$material3_release$default(dateFormatter, stateData.getSelectedStartDate().getValue(), stateData.getCalendarModel(), localeDefaultLocale2, false, 8, null);
            date$material3_release = dateFormatter.formatDate$material3_release(stateData.getSelectedStartDate().getValue(), stateData.getCalendarModel(), localeDefaultLocale2, true);
            composerStartRestartGroup.startReplaceableGroup(729783869);
            strM1320getStringNWtq28 = "";
            if (date$material3_release == null) {
                f10188a3 = stateData.getDisplayMode().getValue().getF10188a();
                companion3 = DisplayMode.INSTANCE;
                if (DisplayMode.m1076equalsimpl0(f10188a3, companion3.m1081getPickerjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(933108990);
                    date$material3_release = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1275getDatePickerNoSelectionDescriptionadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (DisplayMode.m1076equalsimpl0(f10188a3, companion3.m1080getInputjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(933109079);
                    date$material3_release = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1270getDateInputNoInputDescriptionadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1138387422);
                    composerStartRestartGroup.endReplaceableGroup();
                    date$material3_release = "";
                }
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(729784366);
            if (date$material3_release$default == null) {
                f10188a2 = stateData.getDisplayMode().getValue().getF10188a();
                companion2 = DisplayMode.INSTANCE;
                if (DisplayMode.m1076equalsimpl0(f10188a2, companion2.m1081getPickerjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(933109281);
                    date$material3_release$default = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1272getDatePickerHeadlineadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (DisplayMode.m1076equalsimpl0(f10188a2, companion2.m1080getInputjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(933109356);
                    date$material3_release$default = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1264getDateInputHeadlineadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1138379145);
                    composerStartRestartGroup.endReplaceableGroup();
                    date$material3_release$default = "";
                }
            }
            composerStartRestartGroup.endReplaceableGroup();
            f10188a = stateData.getDisplayMode().getValue().getF10188a();
            companion = DisplayMode.INSTANCE;
            if (DisplayMode.m1076equalsimpl0(f10188a, companion.m1081getPickerjFl4v0())) {
                composerStartRestartGroup.startReplaceableGroup(933109538);
                strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1273getDatePickerHeadlineDescriptionadMyvUU(), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (DisplayMode.m1076equalsimpl0(f10188a, companion.m1080getInputjFl4v0())) {
                composerStartRestartGroup.startReplaceableGroup(933109624);
                strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1265getDateInputHeadlineDescriptionadMyvUU(), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1138370496);
                composerStartRestartGroup.endReplaceableGroup();
            }
            strI = ai.a.i(new Object[]{date$material3_release}, 1, strM1320getStringNWtq28, "format(this, *args)");
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(strI);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new a(strI);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new a(strI);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics$default2 = SemanticsModifierKt.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null);
            modifier2 = modifier3;
            TextKt.m1389Text4IGK_g(date$material3_release$default, modifierSemantics$default2, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 3072, 122876);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            if (i13 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1893194407, i10, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerHeadline (DatePicker.kt:442)");
            }
            stateData = state.getStateData();
            Locale localeDefaultLocale3 = CalendarModel_androidKt.defaultLocale(composerStartRestartGroup, 0);
            date$material3_release$default = DatePickerFormatter.formatDate$material3_release$default(dateFormatter, stateData.getSelectedStartDate().getValue(), stateData.getCalendarModel(), localeDefaultLocale3, false, 8, null);
            date$material3_release = dateFormatter.formatDate$material3_release(stateData.getSelectedStartDate().getValue(), stateData.getCalendarModel(), localeDefaultLocale3, true);
            composerStartRestartGroup.startReplaceableGroup(729783869);
            strM1320getStringNWtq28 = "";
            if (date$material3_release == null) {
                f10188a3 = stateData.getDisplayMode().getValue().getF10188a();
                companion3 = DisplayMode.INSTANCE;
                if (DisplayMode.m1076equalsimpl0(f10188a3, companion3.m1081getPickerjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(933108990);
                    date$material3_release = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1275getDatePickerNoSelectionDescriptionadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (DisplayMode.m1076equalsimpl0(f10188a3, companion3.m1080getInputjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(933109079);
                    date$material3_release = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1270getDateInputNoInputDescriptionadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1138387422);
                    composerStartRestartGroup.endReplaceableGroup();
                    date$material3_release = "";
                }
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(729784366);
            if (date$material3_release$default == null) {
                f10188a2 = stateData.getDisplayMode().getValue().getF10188a();
                companion2 = DisplayMode.INSTANCE;
                if (DisplayMode.m1076equalsimpl0(f10188a2, companion2.m1081getPickerjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(933109281);
                    date$material3_release$default = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1272getDatePickerHeadlineadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (DisplayMode.m1076equalsimpl0(f10188a2, companion2.m1080getInputjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(933109356);
                    date$material3_release$default = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1264getDateInputHeadlineadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-1138379145);
                    composerStartRestartGroup.endReplaceableGroup();
                    date$material3_release$default = "";
                }
            }
            composerStartRestartGroup.endReplaceableGroup();
            f10188a = stateData.getDisplayMode().getValue().getF10188a();
            companion = DisplayMode.INSTANCE;
            if (DisplayMode.m1076equalsimpl0(f10188a, companion.m1081getPickerjFl4v0())) {
                composerStartRestartGroup.startReplaceableGroup(933109538);
                strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1273getDatePickerHeadlineDescriptionadMyvUU(), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (DisplayMode.m1076equalsimpl0(f10188a, companion.m1080getInputjFl4v0())) {
                composerStartRestartGroup.startReplaceableGroup(933109624);
                strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1265getDateInputHeadlineDescriptionadMyvUU(), composerStartRestartGroup, 6);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-1138370496);
                composerStartRestartGroup.endReplaceableGroup();
            }
            strI = ai.a.i(new Object[]{date$material3_release}, 1, strM1320getStringNWtq28, "format(this, *args)");
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(strI);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new a(strI);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new a(strI);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierSemantics$default3 = SemanticsModifierKt.semantics$default(modifier3, false, (Function1) objRememberedValue, 1, null);
            modifier2 = modifier3;
            TextKt.m1389Text4IGK_g(date$material3_release$default, modifierSemantics$default3, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, 0, 3072, 122876);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        modifier4 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(state, dateFormatter, modifier4, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x0080  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:42:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:43:0x0103  */
    /* JADX WARN: Code duplicated, block: B:46:0x0112  */
    /* JADX WARN: Code duplicated, block: B:51:0x011e  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void DatePickerTitle(@NotNull DatePickerState state, @Nullable Modifier modifier, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        Modifier modifier3;
        int iM1067getDisplayModejFl4v0;
        DisplayMode.Companion companion;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1157401173);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = i10 | (composerStartRestartGroup.changed(state) ? 4 : 2);
        } else {
            i12 = i10;
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i12;
            if ((i13 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1157401173, i13, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:419)");
                }
                iM1067getDisplayModejFl4v0 = state.m1067getDisplayModejFl4v0();
                companion = DisplayMode.INSTANCE;
                if (DisplayMode.m1076equalsimpl0(iM1067getDisplayModejFl4v0, companion.m1081getPickerjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(-2065111000);
                    TextKt.m1389Text4IGK_g(Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1284getDatePickerTitleadMyvUU(), composerStartRestartGroup, 6), modifier3, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i13 & 112, 0, 131068);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (DisplayMode.m1076equalsimpl0(iM1067getDisplayModejFl4v0, companion.m1080getInputjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(-2065110842);
                    TextKt.m1389Text4IGK_g(Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1271getDateInputTitleadMyvUU(), composerStartRestartGroup, 6), modifier3, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i13 & 112, 0, 131068);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-2065110710);
                    composerStartRestartGroup.endReplaceableGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(state, modifier4, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i12;
        if ((i13 & 91) == 18) {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1157401173, i13, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:419)");
            }
            iM1067getDisplayModejFl4v0 = state.m1067getDisplayModejFl4v0();
            companion = DisplayMode.INSTANCE;
            if (DisplayMode.m1076equalsimpl0(iM1067getDisplayModejFl4v0, companion.m1081getPickerjFl4v0())) {
                composerStartRestartGroup.startReplaceableGroup(-2065111000);
                TextKt.m1389Text4IGK_g(Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1284getDatePickerTitleadMyvUU(), composerStartRestartGroup, 6), modifier3, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i13 & 112, 0, 131068);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (DisplayMode.m1076equalsimpl0(iM1067getDisplayModejFl4v0, companion.m1080getInputjFl4v0())) {
                composerStartRestartGroup.startReplaceableGroup(-2065110842);
                TextKt.m1389Text4IGK_g(Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1271getDateInputTitleadMyvUU(), composerStartRestartGroup, 6), modifier3, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i13 & 112, 0, 131068);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-2065110710);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        } else {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1157401173, i13, -1, "androidx.compose.material3.DatePickerDefaults.DatePickerTitle (DatePicker.kt:419)");
            }
            iM1067getDisplayModejFl4v0 = state.m1067getDisplayModejFl4v0();
            companion = DisplayMode.INSTANCE;
            if (DisplayMode.m1076equalsimpl0(iM1067getDisplayModejFl4v0, companion.m1081getPickerjFl4v0())) {
                composerStartRestartGroup.startReplaceableGroup(-2065111000);
                TextKt.m1389Text4IGK_g(Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1284getDatePickerTitleadMyvUU(), composerStartRestartGroup, 6), modifier3, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i13 & 112, 0, 131068);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (DisplayMode.m1076equalsimpl0(iM1067getDisplayModejFl4v0, companion.m1080getInputjFl4v0())) {
                composerStartRestartGroup.startReplaceableGroup(-2065110842);
                TextKt.m1389Text4IGK_g(Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1271getDateInputTitleadMyvUU(), composerStartRestartGroup, 6), modifier3, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i13 & 112, 0, 131068);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(-2065110710);
                composerStartRestartGroup.endReplaceableGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(state, modifier4, i10, i11));
    }

    @Composable
    @NotNull
    /* JADX INFO: renamed from: colors-1m2Cg-Y, reason: not valid java name */
    public final DatePickerColors m1060colors1m2CgY(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, @Nullable Composer composer, int i10, int i11, int i12) {
        composer.startReplaceableGroup(543433842);
        long color = (i12 & 1) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getContainerColor(), composer, 6) : j10;
        long color2 = (i12 & 2) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getHeaderSupportingTextColor(), composer, 6) : j11;
        long color3 = (i12 & 4) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getHeaderHeadlineColor(), composer, 6) : j12;
        long color4 = (i12 & 8) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getWeekdaysLabelTextColor(), composer, 6) : j13;
        long color5 = (i12 & 16) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getRangeSelectionMonthSubheadColor(), composer, 6) : j14;
        long color6 = (i12 & 32) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getSelectionYearUnselectedLabelTextColor(), composer, 6) : j15;
        long color7 = (i12 & 64) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getDateTodayLabelTextColor(), composer, 6) : j16;
        long color8 = (i12 & 128) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getSelectionYearSelectedLabelTextColor(), composer, 6) : j17;
        long color9 = (i12 & 256) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getSelectionYearSelectedContainerColor(), composer, 6) : j18;
        long color10 = (i12 & 512) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getDateUnselectedLabelTextColor(), composer, 6) : j19;
        long jM2507copywmQWz5c$default = (i12 & 1024) != 0 ? Color.m2507copywmQWz5c$default(color10, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long color11 = (i12 & 2048) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getDateSelectedLabelTextColor(), composer, 6) : j21;
        long jM2507copywmQWz5c$default2 = (i12 & 4096) != 0 ? Color.m2507copywmQWz5c$default(color11, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long color12 = (i12 & 8192) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getDateSelectedContainerColor(), composer, 6) : j23;
        long jM2507copywmQWz5c$default3 = (i12 & 16384) != 0 ? Color.m2507copywmQWz5c$default(color12, 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j24;
        long color13 = (32768 & i12) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getDateTodayLabelTextColor(), composer, 6) : j25;
        long color14 = (65536 & i12) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getDateTodayContainerOutlineColor(), composer, 6) : j26;
        long color15 = (131072 & i12) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getSelectionDateInRangeLabelTextColor(), composer, 6) : j27;
        long color16 = (i12 & 262144) != 0 ? ColorSchemeKt.toColor(DatePickerModalTokens.INSTANCE.getRangeSelectionActiveIndicatorContainerColor(), composer, 6) : j28;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(543433842, i10, i11, "androidx.compose.material3.DatePickerDefaults.colors (DatePicker.kt:358)");
        }
        DatePickerColors datePickerColors = new DatePickerColors(color, color2, color3, color4, color5, color6, color7, color8, color9, color10, jM2507copywmQWz5c$default, color11, jM2507copywmQWz5c$default2, color12, jM2507copywmQWz5c$default3, color13, color14, color16, color15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return datePickerColors;
    }

    @Composable
    @JvmName(name = "getShape")
    @NotNull
    public final Shape getShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(700927667);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(700927667, i10, -1, "androidx.compose.material3.DatePickerDefaults.<get-shape> (DatePicker.kt:518)");
        }
        Shape shape = ShapesKt.toShape(DatePickerModalTokens.INSTANCE.getContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    /* JADX INFO: renamed from: getTonalElevation-D9Ej5fM, reason: not valid java name */
    public final float m1061getTonalElevationD9Ej5fM() {
        return TonalElevation;
    }

    @NotNull
    public final IntRange getYearRange() {
        return YearRange;
    }

    @Composable
    @NotNull
    public final FlingBehavior rememberSnapFlingBehavior$material3_release(@NotNull LazyListState lazyListState, @Nullable DecayAnimationSpec<Float> decayAnimationSpec, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        composer.startReplaceableGroup(-2036003494);
        if ((i11 & 2) != 0) {
            decayAnimationSpec = DecayAnimationSpecKt.exponentialDecay$default(0.0f, 0.0f, 3, null);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2036003494, i10, -1, "androidx.compose.material3.DatePickerDefaults.rememberSnapFlingBehavior (DatePicker.kt:496)");
        }
        Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
        composer.startReplaceableGroup(1157296644);
        boolean zChanged = composer.changed(density);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new SnapFlingBehavior(lazyListState, decayAnimationSpec, AnimationSpecKt.spring$default(0.0f, 400.0f, null, 5, null), density);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        SnapFlingBehavior snapFlingBehavior = (SnapFlingBehavior) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return snapFlingBehavior;
    }
}
