package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DateRangeInput.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/material3/StateData;", "stateData", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "Lkotlin/Function1;", "", "", "dateValidator", "", "DateRangeInputContent", "(Landroidx/compose/material3/StateData;Landroidx/compose/material3/DatePickerFormatter;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDateRangeInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 5 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,103:1\n36#2:104\n50#2:111\n49#2:112\n460#2,13:137\n36#2:151\n36#2:158\n473#2,3:165\n1114#3,6:105\n1114#3,6:113\n1114#3,6:152\n1114#3,6:159\n76#4,5:119\n81#4:150\n85#4:169\n75#5:124\n76#5,11:126\n89#5:168\n76#6:125\n154#7:170\n*S KotlinDebug\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt\n*L\n39#1:104\n46#1:111\n46#1:112\n58#1:137,13\n75#1:151\n93#1:158\n58#1:165,3\n39#1:105,6\n46#1:113,6\n75#1:152,6\n93#1:159,6\n58#1:119,5\n58#1:150\n58#1:169\n58#1:124\n58#1:126,11\n58#1:168\n58#1:125\n102#1:170\n*E\n"})
public final class DateRangeInputKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f10086a = Dp.m4389constructorimpl(8);

    /* JADX INFO: compiled from: DateRangeInput.kt */
    @SourceDebugExtension({"SMAP\nDateRangeInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$1$1\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,103:1\n50#2:104\n49#2:105\n1114#3,6:106\n*S KotlinDebug\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$1$1\n*L\n68#1:104\n68#1:105\n68#1:106,6\n*E\n"})
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f10087p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f10088q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2) {
            super(2);
            this.f10087p0 = str;
            this.f10088q0 = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(576559191, iIntValue, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:65)");
                }
                String str = this.f10087p0;
                Modifier.Companion companion = Modifier.INSTANCE;
                composer2.startReplaceableGroup(511388516);
                boolean zChanged = composer2.changed(str);
                String str2 = this.f10088q0;
                boolean zChanged2 = zChanged | composer2.changed(str2);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new r0(str, str2);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                TextKt.m1389Text4IGK_g(str, SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131068);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateRangeInput.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f10089p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(2);
            this.f10089p0 = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1726391478, iIntValue, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:71)");
                }
                TextKt.m1389Text4IGK_g(this.f10089p0, SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, s0.f13098p0), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131068);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateRangeInput.kt */
    public static final class c extends Lambda implements Function1<CalendarDate, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ StateData f10090p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(StateData stateData) {
            super(1);
            this.f10090p0 = stateData;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(CalendarDate calendarDate) {
            this.f10090p0.getSelectedStartDate().setValue(calendarDate);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateRangeInput.kt */
    @SourceDebugExtension({"SMAP\nDateRangeInput.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$1$4\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,103:1\n50#2:104\n49#2:105\n1114#3,6:106\n*S KotlinDebug\n*F\n+ 1 DateRangeInput.kt\nandroidx/compose/material3/DateRangeInputKt$DateRangeInputContent$1$4\n*L\n86#1:104\n86#1:105\n86#1:106,6\n*E\n"})
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f10091p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f10092q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super(2);
            this.f10091p0 = str;
            this.f10092q0 = str2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-663502784, iIntValue, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:83)");
                }
                String str = this.f10091p0;
                Modifier.Companion companion = Modifier.INSTANCE;
                composer2.startReplaceableGroup(511388516);
                boolean zChanged = composer2.changed(str);
                String str2 = this.f10092q0;
                boolean zChanged2 = zChanged | composer2.changed(str2);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new t0(str, str2);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                TextKt.m1389Text4IGK_g(str, SemanticsModifierKt.semantics$default(companion, false, (Function1) objRememberedValue, 1, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131068);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateRangeInput.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f10093p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(2);
            this.f10093p0 = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(518729951, iIntValue, -1, "androidx.compose.material3.DateRangeInputContent.<anonymous>.<anonymous> (DateRangeInput.kt:89)");
                }
                TextKt.m1389Text4IGK_g(this.f10093p0, SemanticsModifierKt.clearAndSetSemantics(Modifier.INSTANCE, u0.f14332p0), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131068);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateRangeInput.kt */
    public static final class f extends Lambda implements Function1<CalendarDate, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ StateData f10094p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(StateData stateData) {
            super(1);
            this.f10094p0 = stateData;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(CalendarDate calendarDate) {
            this.f10094p0.getSelectedEndDate().setValue(calendarDate);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateRangeInput.kt */
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ StateData f10095p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DatePickerFormatter f10096q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<Long, Boolean> f10097r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f10098s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(StateData stateData, DatePickerFormatter datePickerFormatter, Function1<? super Long, Boolean> function1, int i10) {
            super(2);
            this.f10095p0 = stateData;
            this.f10096q0 = datePickerFormatter;
            this.f10097r0 = function1;
            this.f10098s0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            int iUpdateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.f10098s0 | 1);
            DatePickerFormatter datePickerFormatter = this.f10096q0;
            Function1<Long, Boolean> function1 = this.f10097r0;
            DateRangeInputKt.DateRangeInputContent(this.f10095p0, datePickerFormatter, function1, composer, iUpdateChangedFlags);
            return Unit.INSTANCE;
        }
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void DateRangeInputContent(@NotNull StateData stateData, @NotNull DatePickerFormatter dateFormatter, @NotNull Function1<? super Long, Boolean> dateValidator, @Nullable Composer composer, int i10) {
        int i11;
        Composer composer2;
        Intrinsics.checkNotNullParameter(stateData, "stateData");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Intrinsics.checkNotNullParameter(dateValidator, "dateValidator");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1163802470);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(stateData) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(dateFormatter) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(dateValidator) ? 256 : 128;
        }
        int i12 = i11;
        if ((i12 & 731) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1163802470, i12, -1, "androidx.compose.material3.DateRangeInputContent (DateRangeInput.kt:31)");
            }
            Locale localeDefaultLocale = CalendarModel_androidKt.defaultLocale(composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged = composerStartRestartGroup.changed(localeDefaultLocale);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = stateData.getCalendarModel().getDateInputFormat(localeDefaultLocale);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            DateInputFormat dateInputFormat = (DateInputFormat) objRememberedValue;
            Strings.Companion companion = Strings.INSTANCE;
            String strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(companion.m1266getDateInputInvalidForPatternadMyvUU(), composerStartRestartGroup, 6);
            String strM1320getStringNWtq29 = Strings_androidKt.m1320getStringNWtq28(companion.m1268getDateInputInvalidYearRangeadMyvUU(), composerStartRestartGroup, 6);
            String strM1320getStringNWtq210 = Strings_androidKt.m1320getStringNWtq28(companion.m1267getDateInputInvalidNotAllowedadMyvUU(), composerStartRestartGroup, 6);
            String strM1320getStringNWtq211 = Strings_androidKt.m1320getStringNWtq28(companion.m1287getDateRangeInputInvalidRangeInputadMyvUU(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged2 = composerStartRestartGroup.changed(dateInputFormat) | composerStartRestartGroup.changed(dateFormatter);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                DateInputValidator dateInputValidator = new DateInputValidator(stateData, dateInputFormat, dateFormatter, dateValidator, strM1320getStringNWtq28, strM1320getStringNWtq29, strM1320getStringNWtq210, strM1320getStringNWtq211);
                composerStartRestartGroup.updateRememberedValue(dateInputValidator);
                objRememberedValue2 = dateInputValidator;
            }
            composerStartRestartGroup.endReplaceableGroup();
            DateInputValidator dateInputValidator2 = (DateInputValidator) objRememberedValue2;
            Modifier.Companion companion2 = Modifier.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(companion2, DateInputKt.getInputTextFieldPadding());
            Arrangement.HorizontalOrVertical horizontalOrVerticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(f10086a);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM246spacedBy0680j_4, Alignment.INSTANCE.getTop(), composerStartRestartGroup, r5);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierPadding);
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
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl, measurePolicyRowMeasurePolicy, composerM2074constructorimpl, density));
            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            String upperCase = dateInputFormat.getPatternWithDelimiters().toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
            String strM1320getStringNWtq212 = Strings_androidKt.m1320getStringNWtq28(companion.m1293getDateRangePickerStartHeadlineadMyvUU(), composerStartRestartGroup, r5);
            Modifier modifierA = x.n1.a(rowScopeInstance, companion2, 0.5f, false, 2, null);
            ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 576559191, true, new a(strM1320getStringNWtq212, upperCase));
            ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1726391478, true, new b(upperCase));
            CalendarDate value = stateData.getSelectedStartDate().getValue();
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            boolean zChanged3 = composerStartRestartGroup.changed(stateData);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new c(stateData);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            InputIdentifier.Companion companion4 = InputIdentifier.INSTANCE;
            int i13 = ((i12 << 9) & 7168) | 1075315120;
            composer2 = composerStartRestartGroup;
            DateInputKt.m1051DateInputTextFieldzm97o8M(modifierA, composableLambda, composableLambda2, stateData, value, (Function1) objRememberedValue3, companion4.m1156getStartDateInputJ2x2o4M(), dateInputValidator2, dateInputFormat, localeDefaultLocale, composerStartRestartGroup, i13);
            String strM1320getStringNWtq213 = Strings_androidKt.m1320getStringNWtq28(companion.m1290getDateRangePickerEndHeadlineadMyvUU(), composer2, 6);
            Modifier modifierA2 = x.n1.a(rowScopeInstance, companion2, 0.5f, false, 2, null);
            ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composer2, -663502784, true, new d(strM1320getStringNWtq213, upperCase));
            ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composer2, 518729951, true, new e(upperCase));
            CalendarDate value2 = stateData.getSelectedEndDate().getValue();
            composer2.startReplaceableGroup(1157296644);
            boolean zChanged4 = composer2.changed(stateData);
            Object objRememberedValue4 = composer2.rememberedValue();
            if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new f(stateData);
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceableGroup();
            DateInputKt.m1051DateInputTextFieldzm97o8M(modifierA2, composableLambda3, composableLambda4, stateData, value2, (Function1) objRememberedValue4, companion4.m1154getEndDateInputJ2x2o4M(), dateInputValidator2, dateInputFormat, localeDefaultLocale, composer2, i13);
            if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new g(stateData, dateFormatter, dateValidator, i10));
    }
}
