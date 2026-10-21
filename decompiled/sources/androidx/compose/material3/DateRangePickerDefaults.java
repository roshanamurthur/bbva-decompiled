package androidx.compose.material3;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import com.vierge.bluetoothlibrary.BluetoothState;
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

/* JADX INFO: compiled from: DateRangePicker.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Landroidx/compose/material3/DateRangePickerDefaults;", "", "Landroidx/compose/material3/DateRangePickerState;", "state", "Landroidx/compose/ui/Modifier;", "modifier", "", "DateRangePickerTitle", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/material3/DatePickerFormatter;", "dateFormatter", "DateRangePickerHeadline", "(Landroidx/compose/material3/DateRangePickerState;Landroidx/compose/material3/DatePickerFormatter;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nDateRangePicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,809:1\n50#2:810\n49#2:811\n460#2,13:834\n473#2,3:848\n1114#3,6:812\n154#4:818\n79#5,2:819\n81#5:847\n85#5:852\n75#6:821\n76#6,11:823\n89#6:851\n76#7:822\n*S KotlinDebug\n*F\n+ 1 DateRangePicker.kt\nandroidx/compose/material3/DateRangePickerDefaults\n*L\n419#1:810\n419#1:811\n418#1:834,13\n418#1:848,3\n419#1:812,6\n424#1:818\n418#1:819,2\n418#1:847\n418#1:852\n418#1:821\n418#1:823,11\n418#1:851\n418#1:822\n*E\n"})
public final class DateRangePickerDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final DateRangePickerDefaults INSTANCE = new DateRangePickerDefaults();

    /* JADX INFO: compiled from: DateRangePicker.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f10099p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(2);
            this.f10099p0 = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1382084760, iIntValue, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline.<anonymous> (DateRangePicker.kt:341)");
                }
                TextKt.m1389Text4IGK_g(this.f10099p0, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateRangePicker.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f10100p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
            super(2);
            this.f10100p0 = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-199852025, iIntValue, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline.<anonymous> (DateRangePicker.kt:342)");
                }
                TextKt.m1389Text4IGK_g(this.f10100p0, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateRangePicker.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DateRangePickerState f10102q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ DatePickerFormatter f10103r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10104s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f10105t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f10106u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DateRangePickerState dateRangePickerState, DatePickerFormatter datePickerFormatter, Modifier modifier, int i10, int i11) {
            super(2);
            this.f10102q0 = dateRangePickerState;
            this.f10103r0 = datePickerFormatter;
            this.f10104s0 = modifier;
            this.f10105t0 = i10;
            this.f10106u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            DateRangePickerDefaults.this.DateRangePickerHeadline(this.f10102q0, this.f10103r0, this.f10104s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10105t0 | 1), this.f10106u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateRangePicker.kt */
    public static final class d extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f10107p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f10108q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2) {
            super(1);
            this.f10107p0 = str;
            this.f10108q0 = str2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver clearAndSetSemantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(clearAndSetSemantics, "$this$clearAndSetSemantics");
            SemanticsPropertiesKt.m3842setLiveRegionhR3wRGc(clearAndSetSemantics, LiveRegionMode.INSTANCE.m3824getPolite0phEisY());
            SemanticsPropertiesKt.setContentDescription(clearAndSetSemantics, this.f10107p0 + ", " + this.f10108q0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateRangePicker.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DateRangePickerState f10110q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ DatePickerFormatter f10111r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10112s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f10113t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ String f10114u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10115w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f10116x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f10117y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(DateRangePickerState dateRangePickerState, DatePickerFormatter datePickerFormatter, Modifier modifier, String str, String str2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, int i10) {
            super(2);
            this.f10110q0 = dateRangePickerState;
            this.f10111r0 = datePickerFormatter;
            this.f10112s0 = modifier;
            this.f10113t0 = str;
            this.f10114u0 = str2;
            this.v0 = function2;
            this.f10115w0 = function3;
            this.f10116x0 = function4;
            this.f10117y0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            DateRangePickerDefaults.this.a(this.f10110q0, this.f10111r0, this.f10112s0, this.f10113t0, this.f10114u0, this.v0, this.f10115w0, this.f10116x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10117y0 | 1));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DateRangePicker.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DateRangePickerState f10119q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f10120r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f10121s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f10122t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(DateRangePickerState dateRangePickerState, Modifier modifier, int i10, int i11) {
            super(2);
            this.f10119q0 = dateRangePickerState;
            this.f10120r0 = modifier;
            this.f10121s0 = i10;
            this.f10122t0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            DateRangePickerDefaults.this.DateRangePickerTitle(this.f10119q0, this.f10120r0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f10121s0 | 1), this.f10122t0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:63:0x0108  */
    /* JADX WARN: Code duplicated, block: B:65:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void DateRangePickerHeadline(@NotNull DateRangePickerState state, @NotNull DatePickerFormatter dateFormatter, @Nullable Modifier modifier, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        Modifier modifier3;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(dateFormatter, "dateFormatter");
        Composer composerStartRestartGroup = composer.startRestartGroup(-332090137);
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
        int i14 = i11 & 4;
        if (i14 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i13 = 2048;
                } else {
                    i13 = 1024;
                }
                i12 |= i13;
            }
            if ((i12 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i14 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-332090137, i12, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:328)");
                }
                Strings.Companion companion = Strings.INSTANCE;
                String strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(companion.m1293getDateRangePickerStartHeadlineadMyvUU(), composerStartRestartGroup, 6);
                String strM1320getStringNWtq29 = Strings_androidKt.m1320getStringNWtq28(companion.m1290getDateRangePickerEndHeadlineadMyvUU(), composerStartRestartGroup, 6);
                a(state, dateFormatter, modifier3, strM1320getStringNWtq28, strM1320getStringNWtq29, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1382084760, true, new a(strM1320getStringNWtq28)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -199852025, true, new b(strM1320getStringNWtq29)), ComposableSingletons$DateRangePickerKt.INSTANCE.m1036getLambda1$material3_release(), composerStartRestartGroup, 14352384 | (i12 & 14) | (i12 & 112) | (i12 & 896) | ((i12 << 15) & 234881024));
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
            scopeUpdateScopeEndRestartGroup.updateScope(new c(state, dateFormatter, modifier4, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (composerStartRestartGroup.changed(this)) {
                i13 = 2048;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        }
        if ((i12 & 5851) == 1170) {
            if (i14 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-332090137, i12, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:328)");
            }
            Strings.Companion companion2 = Strings.INSTANCE;
            String strM1320getStringNWtq210 = Strings_androidKt.m1320getStringNWtq28(companion2.m1293getDateRangePickerStartHeadlineadMyvUU(), composerStartRestartGroup, 6);
            String strM1320getStringNWtq211 = Strings_androidKt.m1320getStringNWtq28(companion2.m1290getDateRangePickerEndHeadlineadMyvUU(), composerStartRestartGroup, 6);
            a(state, dateFormatter, modifier3, strM1320getStringNWtq210, strM1320getStringNWtq211, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1382084760, true, new a(strM1320getStringNWtq210)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -199852025, true, new b(strM1320getStringNWtq211)), ComposableSingletons$DateRangePickerKt.INSTANCE.m1036getLambda1$material3_release(), composerStartRestartGroup, 14352384 | (i12 & 14) | (i12 & 112) | (i12 & 896) | ((i12 << 15) & 234881024));
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
                ComposerKt.traceEventStart(-332090137, i12, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:328)");
            }
            Strings.Companion companion3 = Strings.INSTANCE;
            String strM1320getStringNWtq212 = Strings_androidKt.m1320getStringNWtq28(companion3.m1293getDateRangePickerStartHeadlineadMyvUU(), composerStartRestartGroup, 6);
            String strM1320getStringNWtq213 = Strings_androidKt.m1320getStringNWtq28(companion3.m1290getDateRangePickerEndHeadlineadMyvUU(), composerStartRestartGroup, 6);
            a(state, dateFormatter, modifier3, strM1320getStringNWtq212, strM1320getStringNWtq213, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1382084760, true, new a(strM1320getStringNWtq212)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -199852025, true, new b(strM1320getStringNWtq213)), ComposableSingletons$DateRangePickerKt.INSTANCE.m1036getLambda1$material3_release(), composerStartRestartGroup, 14352384 | (i12 & 14) | (i12 & 112) | (i12 & 896) | ((i12 << 15) & 234881024));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(state, dateFormatter, modifier4, i10, i11));
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
    public final void DateRangePickerTitle(@NotNull DateRangePickerState state, @Nullable Modifier modifier, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        Modifier modifier3;
        int iM1071getDisplayModejFl4v0;
        DisplayMode.Companion companion;
        Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Composer composerStartRestartGroup = composer.startRestartGroup(499073135);
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
                    ComposerKt.traceEventStart(499073135, i13, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle (DateRangePicker.kt:302)");
                }
                iM1071getDisplayModejFl4v0 = state.m1071getDisplayModejFl4v0();
                companion = DisplayMode.INSTANCE;
                if (DisplayMode.m1076equalsimpl0(iM1071getDisplayModejFl4v0, companion.m1081getPickerjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(585814427);
                    TextKt.m1389Text4IGK_g(Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1294getDateRangePickerTitleadMyvUU(), composerStartRestartGroup, 6), modifier3, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i13 & 112, 0, 131068);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (DisplayMode.m1076equalsimpl0(iM1071getDisplayModejFl4v0, companion.m1080getInputjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(585814583);
                    TextKt.m1389Text4IGK_g(Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1288getDateRangeInputTitleadMyvUU(), composerStartRestartGroup, 6), modifier3, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i13 & 112, 0, 131068);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(585814713);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier4, i10, i11));
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
                ComposerKt.traceEventStart(499073135, i13, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle (DateRangePicker.kt:302)");
            }
            iM1071getDisplayModejFl4v0 = state.m1071getDisplayModejFl4v0();
            companion = DisplayMode.INSTANCE;
            if (DisplayMode.m1076equalsimpl0(iM1071getDisplayModejFl4v0, companion.m1081getPickerjFl4v0())) {
                composerStartRestartGroup.startReplaceableGroup(585814427);
                TextKt.m1389Text4IGK_g(Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1294getDateRangePickerTitleadMyvUU(), composerStartRestartGroup, 6), modifier3, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i13 & 112, 0, 131068);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (DisplayMode.m1076equalsimpl0(iM1071getDisplayModejFl4v0, companion.m1080getInputjFl4v0())) {
                composerStartRestartGroup.startReplaceableGroup(585814583);
                TextKt.m1389Text4IGK_g(Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1288getDateRangeInputTitleadMyvUU(), composerStartRestartGroup, 6), modifier3, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i13 & 112, 0, 131068);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(585814713);
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
                ComposerKt.traceEventStart(499073135, i13, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerTitle (DateRangePicker.kt:302)");
            }
            iM1071getDisplayModejFl4v0 = state.m1071getDisplayModejFl4v0();
            companion = DisplayMode.INSTANCE;
            if (DisplayMode.m1076equalsimpl0(iM1071getDisplayModejFl4v0, companion.m1081getPickerjFl4v0())) {
                composerStartRestartGroup.startReplaceableGroup(585814427);
                TextKt.m1389Text4IGK_g(Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1294getDateRangePickerTitleadMyvUU(), composerStartRestartGroup, 6), modifier3, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i13 & 112, 0, 131068);
                composerStartRestartGroup.endReplaceableGroup();
            } else if (DisplayMode.m1076equalsimpl0(iM1071getDisplayModejFl4v0, companion.m1080getInputjFl4v0())) {
                composerStartRestartGroup.startReplaceableGroup(585814583);
                TextKt.m1389Text4IGK_g(Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1288getDateRangeInputTitleadMyvUU(), composerStartRestartGroup, 6), modifier3, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composerStartRestartGroup, i13 & 112, 0, 131068);
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(585814713);
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
        scopeUpdateScopeEndRestartGroup.updateScope(new f(state, modifier4, i10, i11));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public final void a(DateRangePickerState dateRangePickerState, DatePickerFormatter datePickerFormatter, Modifier modifier, String str, String str2, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Composer composer, int i10) {
        int i11;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-861159957);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(dateRangePickerState) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(datePickerFormatter) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function4) ? 8388608 : 4194304;
        }
        int i12 = i11;
        if ((23967451 & i12) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-861159957, i12, -1, "androidx.compose.material3.DateRangePickerDefaults.DateRangePickerHeadline (DateRangePicker.kt:368)");
            }
            StateData stateData = dateRangePickerState.getStateData();
            Locale localeDefaultLocale = CalendarModel_androidKt.defaultLocale(composerStartRestartGroup, 0);
            String date$material3_release$default = DatePickerFormatter.formatDate$material3_release$default(datePickerFormatter, stateData.getSelectedStartDate().getValue(), stateData.getCalendarModel(), localeDefaultLocale, false, 8, null);
            String date$material3_release$default2 = DatePickerFormatter.formatDate$material3_release$default(datePickerFormatter, stateData.getSelectedEndDate().getValue(), stateData.getCalendarModel(), localeDefaultLocale, false, 8, null);
            String date$material3_release = datePickerFormatter.formatDate$material3_release(stateData.getSelectedStartDate().getValue(), stateData.getCalendarModel(), localeDefaultLocale, true);
            composerStartRestartGroup.startReplaceableGroup(-1212634278);
            String strM1320getStringNWtq28 = "";
            if (date$material3_release == null) {
                int f10188a = stateData.getDisplayMode().getValue().getF10188a();
                DisplayMode.Companion companion = DisplayMode.INSTANCE;
                if (DisplayMode.m1076equalsimpl0(f10188a, companion.m1081getPickerjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(1922096411);
                    date$material3_release = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1275getDatePickerNoSelectionDescriptionadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (DisplayMode.m1076equalsimpl0(f10188a, companion.m1080getInputjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(1922096500);
                    date$material3_release = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1270getDateInputNoInputDescriptionadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-544548443);
                    composerStartRestartGroup.endReplaceableGroup();
                    date$material3_release = "";
                }
            }
            composerStartRestartGroup.endReplaceableGroup();
            String date$material3_release2 = datePickerFormatter.formatDate$material3_release(stateData.getSelectedEndDate().getValue(), stateData.getCalendarModel(), localeDefaultLocale, true);
            composerStartRestartGroup.startReplaceableGroup(-1212633768);
            if (date$material3_release2 == null) {
                int f10188a2 = stateData.getDisplayMode().getValue().getF10188a();
                DisplayMode.Companion companion2 = DisplayMode.INSTANCE;
                if (DisplayMode.m1076equalsimpl0(f10188a2, companion2.m1081getPickerjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(1922096919);
                    strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1275getDatePickerNoSelectionDescriptionadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else if (DisplayMode.m1076equalsimpl0(f10188a2, companion2.m1080getInputjFl4v0())) {
                    composerStartRestartGroup.startReplaceableGroup(1922097008);
                    strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1270getDateInputNoInputDescriptionadMyvUU(), composerStartRestartGroup, 6);
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(-544532695);
                    composerStartRestartGroup.endReplaceableGroup();
                }
            } else {
                strM1320getStringNWtq28 = date$material3_release2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            String str3 = str + ": " + date$material3_release;
            String str4 = str2 + ": " + strM1320getStringNWtq28;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            boolean zChanged = composerStartRestartGroup.changed(str3) | composerStartRestartGroup.changed(str4);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new d(str3, str4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierClearAndSetSemantics = SemanticsModifierKt.clearAndSetSemantics(modifier, (Function1) objRememberedValue);
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            Arrangement.HorizontalOrVertical horizontalOrVerticalM246spacedBy0680j_4 = Arrangement.INSTANCE.m246spacedBy0680j_4(Dp.m4389constructorimpl(4));
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = RowKt.rowMeasurePolicy(horizontalOrVerticalM246spacedBy0680j_4, centerVertically, composerStartRestartGroup, 54);
            Density density = (Density) com.mypinpad.tsdk.isolation.y2.a(composerStartRestartGroup, -1323940314);
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(modifierClearAndSetSemantics);
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
            if (date$material3_release$default != null) {
                composerStartRestartGroup.startReplaceableGroup(990390609);
                composer2 = composerStartRestartGroup;
                TextKt.m1389Text4IGK_g(date$material3_release$default, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                composer2.endReplaceableGroup();
            } else {
                composer2 = composerStartRestartGroup;
                composer2.startReplaceableGroup(990390686);
                function2.invoke(composer2, Integer.valueOf((i12 >> 15) & 14));
                composer2.endReplaceableGroup();
            }
            function4.invoke(composer2, Integer.valueOf((i12 >> 21) & 14));
            if (date$material3_release$default2 != null) {
                composer2.startReplaceableGroup(990390828);
                TextKt.m1389Text4IGK_g(date$material3_release$default2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                composer2.endReplaceableGroup();
            } else {
                composer2.startReplaceableGroup(990390903);
                function3.invoke(composer2, Integer.valueOf((i12 >> 18) & 14));
                composer2.endReplaceableGroup();
            }
            if (com.mypinpad.tsdk.isolation.y2.d(composer2)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new e(dateRangePickerState, datePickerFormatter, modifier, str, str2, function2, function3, function4, i10));
    }
}
