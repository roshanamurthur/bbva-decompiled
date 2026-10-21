package androidx.compose.material3;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.DatePickerModalTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.window.DialogProperties;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DatePickerDialog.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u009d\u0001\u0010\u0016\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0011\u0010\u0004\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0015\b\u0002\u0010\u0007\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00032\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u001c\u0010\u0013\u001a\u0018\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u0010¢\u0006\u0002\b\u0003¢\u0006\u0002\b\u0012H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/runtime/Composable;", "confirmButton", "Landroidx/compose/ui/Modifier;", "modifier", "dismissButton", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/unit/Dp;", "tonalElevation", "Landroidx/compose/material3/DatePickerColors;", "colors", "Landroidx/compose/ui/window/DialogProperties;", LogKeysKt.PROPERTIES, "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "content", "DatePickerDialog-GmEhDVc", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;FLandroidx/compose/material3/DatePickerColors;Landroidx/compose/ui/window/DialogProperties;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "DatePickerDialog", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDatePickerDialog.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DatePickerDialog.android.kt\nandroidx/compose/material3/DatePickerDialog_androidKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,121:1\n154#2:122\n154#2:123\n154#2:124\n*S KotlinDebug\n*F\n+ 1 DatePickerDialog.android.kt\nandroidx/compose/material3/DatePickerDialog_androidKt\n*L\n118#1:122\n119#1:123\n120#1:124\n*E\n"})
public final class DatePickerDialog_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final PaddingValues f9934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f9935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f9936c = Dp.m4389constructorimpl(12);

    /* JADX INFO: compiled from: DatePickerDialog.android.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Shape f9937p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ DatePickerColors f9938q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f9939r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ int f9940s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f9941t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9942u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Shape shape, DatePickerColors datePickerColors, float f6, int i10, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function4) {
            super(2);
            this.f9937p0 = shape;
            this.f9938q0 = datePickerColors;
            this.f9939r0 = f6;
            this.f9940s0 = i10;
            this.f9941t0 = function3;
            this.f9942u0 = function2;
            this.v0 = function4;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-476003174, iIntValue, -1, "androidx.compose.material3.DatePickerDialog.<anonymous> (DatePickerDialog.android.kt:79)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                DatePickerModalTokens datePickerModalTokens = DatePickerModalTokens.INSTANCE;
                Modifier modifierM323heightInVpY3zN4$default = SizeKt.m323heightInVpY3zN4$default(SizeKt.m332requiredWidth3ABfNKs(companion, datePickerModalTokens.m1604getContainerWidthD9Ej5fM()), 0.0f, datePickerModalTokens.m1603getContainerHeightD9Ej5fM(), 1, null);
                Shape shape = this.f9937p0;
                long containerColor = this.f9938q0.getContainerColor();
                float f6 = this.f9939r0;
                Function3<ColumnScope, Composer, Integer, Unit> function3 = this.f9941t0;
                int i10 = this.f9940s0;
                SurfaceKt.m1329SurfaceT9BRK9s(modifierM323heightInVpY3zN4$default, shape, containerColor, 0L, f6, 0.0f, null, ComposableLambdaKt.composableLambda(composer2, 1763752415, true, new z(i10, this.f9942u0, this.v0, function3)), composer2, ((i10 >> 9) & 112) | 12582918 | ((i10 >> 3) & 57344), 104);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: DatePickerDialog.android.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f9943p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9944q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9945r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f9946s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Shape f9947t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ float f9948u0;
        public final /* synthetic */ DatePickerColors v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ DialogProperties f9949w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function3<ColumnScope, Composer, Integer, Unit> f9950x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f9951y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function3, Shape shape, float f6, DatePickerColors datePickerColors, DialogProperties dialogProperties, Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> function4, int i10, int i11) {
            super(2);
            this.f9943p0 = function0;
            this.f9944q0 = function2;
            this.f9945r0 = modifier;
            this.f9946s0 = function3;
            this.f9947t0 = shape;
            this.f9948u0 = f6;
            this.v0 = datePickerColors;
            this.f9949w0 = dialogProperties;
            this.f9950x0 = function4;
            this.f9951y0 = i10;
            this.E0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            DatePickerDialog_androidKt.m1062DatePickerDialogGmEhDVc(this.f9943p0, this.f9944q0, this.f9945r0, this.f9946s0, this.f9947t0, this.f9948u0, this.v0, this.f9949w0, this.f9950x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f9951y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 8;
        f9934a = PaddingKt.m293PaddingValuesa9UjIt4$default(0.0f, 0.0f, Dp.m4389constructorimpl(6), Dp.m4389constructorimpl(f6), 3, null);
        f9935b = Dp.m4389constructorimpl(f6);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:106:0x0141  */
    /* JADX WARN: Code duplicated, block: B:116:0x0163 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0165  */
    /* JADX WARN: Code duplicated, block: B:118:0x0168  */
    /* JADX WARN: Code duplicated, block: B:120:0x016b  */
    /* JADX WARN: Code duplicated, block: B:121:0x016e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0174  */
    /* JADX WARN: Code duplicated, block: B:125:0x0181  */
    /* JADX WARN: Code duplicated, block: B:127:0x0186  */
    /* JADX WARN: Code duplicated, block: B:128:0x018f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0195  */
    /* JADX WARN: Code duplicated, block: B:132:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:139:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:142:0x0244  */
    /* JADX WARN: Code duplicated, block: B:147:0x0257  */
    /* JADX WARN: Code duplicated, block: B:149:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0078  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:43:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x008c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0090  */
    /* JADX WARN: Code duplicated, block: B:51:0x0098  */
    /* JADX WARN: Code duplicated, block: B:52:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x0101  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105  */
    /* JADX WARN: Code duplicated, block: B:94:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x0113  */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: DatePickerDialog-GmEhDVc, reason: not valid java name */
    public static final void m1062DatePickerDialogGmEhDVc(@NotNull Function0<Unit> onDismissRequest, @NotNull Function2<? super Composer, ? super Integer, Unit> confirmButton, @Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Shape shape, float f6, @Nullable DatePickerColors datePickerColors, @Nullable DialogProperties dialogProperties, @NotNull Function3<? super ColumnScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        Function2<? super Composer, ? super Integer, Unit> function3;
        int i14;
        Shape shape2;
        int i15;
        float f10;
        int i16;
        int i17;
        DialogProperties dialogProperties2;
        int i18;
        int i19;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function4;
        int i20;
        Shape shape3;
        float fM1061getTonalElevationD9Ej5fM;
        DatePickerColors datePickerColorsM1060colors1m2CgY;
        DialogProperties dialogProperties3;
        Shape shape4;
        Modifier modifier4;
        DatePickerColors datePickerColors2;
        Composer composer2;
        Modifier modifier5;
        Shape shape5;
        DialogProperties dialogProperties4;
        Function2<? super Composer, ? super Integer, Unit> function5;
        float f11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(confirmButton, "confirmButton");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-36517340);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(confirmButton) ? 32 : 16;
        }
        int i21 = i11 & 4;
        if (i21 == 0) {
            if ((i10 & 896) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    function3 = function2;
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        shape2 = shape;
                        int i22 = composerStartRestartGroup.changed(shape2) ? 16384 : 8192;
                        i12 |= i22;
                    } else {
                        shape2 = shape;
                    }
                    i12 |= i22;
                } else {
                    shape2 = shape;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((458752 & i10) == 0) {
                        f10 = f6;
                        if (composerStartRestartGroup.changed(f10)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((3670016 & i10) != 0) {
                        i12 |= ((i11 & 64) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 524288 : 1048576;
                    }
                    i17 = i11 & 128;
                    if (i17 != 0) {
                        i12 |= 12582912;
                        dialogProperties2 = dialogProperties;
                    } else {
                        dialogProperties2 = dialogProperties;
                        if ((i10 & 29360128) == 0) {
                            if (composerStartRestartGroup.changed(dialogProperties2)) {
                                i18 = 8388608;
                            } else {
                                i18 = 4194304;
                            }
                            i12 |= i18;
                        }
                    }
                    if ((i11 & 256) != 0) {
                        if ((234881024 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i19 = 33554432;
                            }
                        }
                        if ((191739611 & i12) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i21 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i13 != 0) {
                                    function4 = null;
                                } else {
                                    function4 = function3;
                                }
                                if ((i11 & 16) != 0) {
                                    i20 = i12 & (-57345);
                                    shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                                } else {
                                    i20 = i12;
                                    shape3 = shape2;
                                }
                                if (i15 != 0) {
                                    fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                                } else {
                                    fM1061getTonalElevationD9Ej5fM = f10;
                                }
                                if ((i11 & 64) != 0) {
                                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                    i20 &= -3670017;
                                } else {
                                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                                }
                                if (i17 != 0) {
                                    dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                                } else {
                                    dialogProperties3 = dialogProperties;
                                }
                                shape4 = shape3;
                                modifier4 = modifier3;
                                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                                i12 = i20;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                }
                                datePickerColors2 = datePickerColors;
                                dialogProperties3 = dialogProperties;
                                modifier4 = modifier2;
                                function4 = function3;
                                shape4 = shape2;
                                fM1061getTonalElevationD9Ej5fM = f10;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                            }
                            composer2 = composerStartRestartGroup;
                            Modifier modifier6 = modifier4;
                            AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier5 = modifier6;
                            shape5 = shape4;
                            dialogProperties4 = dialogProperties3;
                            function5 = function4;
                            f11 = fM1061getTonalElevationD9Ej5fM;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            datePickerColors2 = datePickerColors;
                            modifier5 = modifier2;
                            function5 = function3;
                            shape5 = shape2;
                            f11 = f10;
                            dialogProperties4 = dialogProperties2;
                            composer2 = composerStartRestartGroup;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier5, function5, shape5, f11, datePickerColors2, dialogProperties4, content, i10, i11));
                    }
                    i19 = 100663296;
                    i12 |= i19;
                    if ((191739611 & i12) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if ((i11 & 16) != 0) {
                                i20 = i12 & (-57345);
                                shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                i20 = i12;
                                shape3 = shape2;
                            }
                            if (i15 != 0) {
                                fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                            } else {
                                fM1061getTonalElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                i20 &= -3670017;
                            } else {
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                            if (i17 != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                            } else {
                                dialogProperties3 = dialogProperties;
                            }
                            shape4 = shape3;
                            modifier4 = modifier3;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            i12 = i20;
                        } else {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if ((i11 & 16) != 0) {
                                i20 = i12 & (-57345);
                                shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                i20 = i12;
                                shape3 = shape2;
                            }
                            if (i15 != 0) {
                                fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                            } else {
                                fM1061getTonalElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                i20 &= -3670017;
                            } else {
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                            if (i17 != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                            } else {
                                dialogProperties3 = dialogProperties;
                            }
                            shape4 = shape3;
                            modifier4 = modifier3;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            i12 = i20;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                        }
                        composer2 = composerStartRestartGroup;
                        Modifier modifier7 = modifier4;
                        AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier7;
                        shape5 = shape4;
                        dialogProperties4 = dialogProperties3;
                        function5 = function4;
                        f11 = fM1061getTonalElevationD9Ej5fM;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if ((i11 & 16) != 0) {
                                i20 = i12 & (-57345);
                                shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                i20 = i12;
                                shape3 = shape2;
                            }
                            if (i15 != 0) {
                                fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                            } else {
                                fM1061getTonalElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                i20 &= -3670017;
                            } else {
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                            if (i17 != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                            } else {
                                dialogProperties3 = dialogProperties;
                            }
                            shape4 = shape3;
                            modifier4 = modifier3;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            i12 = i20;
                        } else {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if ((i11 & 16) != 0) {
                                i20 = i12 & (-57345);
                                shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                i20 = i12;
                                shape3 = shape2;
                            }
                            if (i15 != 0) {
                                fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                            } else {
                                fM1061getTonalElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                i20 &= -3670017;
                            } else {
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                            if (i17 != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                            } else {
                                dialogProperties3 = dialogProperties;
                            }
                            shape4 = shape3;
                            modifier4 = modifier3;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            i12 = i20;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                        }
                        composer2 = composerStartRestartGroup;
                        Modifier modifier8 = modifier4;
                        AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier8;
                        shape5 = shape4;
                        dialogProperties4 = dialogProperties3;
                        function5 = function4;
                        f11 = fM1061getTonalElevationD9Ej5fM;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier5, function5, shape5, f11, datePickerColors2, dialogProperties4, content, i10, i11));
                }
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                f10 = f6;
                if ((3670016 & i10) != 0) {
                    i12 |= ((i11 & 64) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 524288 : 1048576;
                }
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                    dialogProperties2 = dialogProperties;
                } else {
                    dialogProperties2 = dialogProperties;
                    if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(dialogProperties2)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 256) != 0) {
                    if ((234881024 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i19 = 33554432;
                        }
                    }
                    if ((191739611 & i12) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if ((i11 & 16) != 0) {
                                i20 = i12 & (-57345);
                                shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                i20 = i12;
                                shape3 = shape2;
                            }
                            if (i15 != 0) {
                                fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                            } else {
                                fM1061getTonalElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                i20 &= -3670017;
                            } else {
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                            if (i17 != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                            } else {
                                dialogProperties3 = dialogProperties;
                            }
                            shape4 = shape3;
                            modifier4 = modifier3;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            i12 = i20;
                        } else {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if ((i11 & 16) != 0) {
                                i20 = i12 & (-57345);
                                shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                i20 = i12;
                                shape3 = shape2;
                            }
                            if (i15 != 0) {
                                fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                            } else {
                                fM1061getTonalElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                i20 &= -3670017;
                            } else {
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                            if (i17 != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                            } else {
                                dialogProperties3 = dialogProperties;
                            }
                            shape4 = shape3;
                            modifier4 = modifier3;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            i12 = i20;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                        }
                        composer2 = composerStartRestartGroup;
                        Modifier modifier9 = modifier4;
                        AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier9;
                        shape5 = shape4;
                        dialogProperties4 = dialogProperties3;
                        function5 = function4;
                        f11 = fM1061getTonalElevationD9Ej5fM;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if ((i11 & 16) != 0) {
                                i20 = i12 & (-57345);
                                shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                i20 = i12;
                                shape3 = shape2;
                            }
                            if (i15 != 0) {
                                fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                            } else {
                                fM1061getTonalElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                i20 &= -3670017;
                            } else {
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                            if (i17 != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                            } else {
                                dialogProperties3 = dialogProperties;
                            }
                            shape4 = shape3;
                            modifier4 = modifier3;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            i12 = i20;
                        } else {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if ((i11 & 16) != 0) {
                                i20 = i12 & (-57345);
                                shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                i20 = i12;
                                shape3 = shape2;
                            }
                            if (i15 != 0) {
                                fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                            } else {
                                fM1061getTonalElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                i20 &= -3670017;
                            } else {
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                            if (i17 != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                            } else {
                                dialogProperties3 = dialogProperties;
                            }
                            shape4 = shape3;
                            modifier4 = modifier3;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            i12 = i20;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                        }
                        composer2 = composerStartRestartGroup;
                        Modifier modifier10 = modifier4;
                        AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier10;
                        shape5 = shape4;
                        dialogProperties4 = dialogProperties3;
                        function5 = function4;
                        f11 = fM1061getTonalElevationD9Ej5fM;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier5, function5, shape5, f11, datePickerColors2, dialogProperties4, content, i10, i11));
                }
                i19 = 100663296;
                i12 |= i19;
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                    }
                    composer2 = composerStartRestartGroup;
                    Modifier modifier11 = modifier4;
                    AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier11;
                    shape5 = shape4;
                    dialogProperties4 = dialogProperties3;
                    function5 = function4;
                    f11 = fM1061getTonalElevationD9Ej5fM;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                    }
                    composer2 = composerStartRestartGroup;
                    Modifier modifier12 = modifier4;
                    AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier12;
                    shape5 = shape4;
                    dialogProperties4 = dialogProperties3;
                    function5 = function4;
                    f11 = fM1061getTonalElevationD9Ej5fM;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier5, function5, shape5, f11, datePickerColors2, dialogProperties4, content, i10, i11));
            }
            i12 |= 3072;
            function3 = function2;
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i22;
                } else {
                    shape2 = shape;
                }
                i12 |= i22;
            } else {
                shape2 = shape;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((458752 & i10) == 0) {
                    f10 = f6;
                    if (composerStartRestartGroup.changed(f10)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((3670016 & i10) != 0) {
                    i12 |= ((i11 & 64) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 524288 : 1048576;
                }
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                    dialogProperties2 = dialogProperties;
                } else {
                    dialogProperties2 = dialogProperties;
                    if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(dialogProperties2)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 256) != 0) {
                    if ((234881024 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i19 = 33554432;
                        }
                    }
                    if ((191739611 & i12) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if ((i11 & 16) != 0) {
                                i20 = i12 & (-57345);
                                shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                i20 = i12;
                                shape3 = shape2;
                            }
                            if (i15 != 0) {
                                fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                            } else {
                                fM1061getTonalElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                i20 &= -3670017;
                            } else {
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                            if (i17 != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                            } else {
                                dialogProperties3 = dialogProperties;
                            }
                            shape4 = shape3;
                            modifier4 = modifier3;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            i12 = i20;
                        } else {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if ((i11 & 16) != 0) {
                                i20 = i12 & (-57345);
                                shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                i20 = i12;
                                shape3 = shape2;
                            }
                            if (i15 != 0) {
                                fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                            } else {
                                fM1061getTonalElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                i20 &= -3670017;
                            } else {
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                            if (i17 != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                            } else {
                                dialogProperties3 = dialogProperties;
                            }
                            shape4 = shape3;
                            modifier4 = modifier3;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            i12 = i20;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                        }
                        composer2 = composerStartRestartGroup;
                        Modifier modifier13 = modifier4;
                        AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier13;
                        shape5 = shape4;
                        dialogProperties4 = dialogProperties3;
                        function5 = function4;
                        f11 = fM1061getTonalElevationD9Ej5fM;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if ((i11 & 16) != 0) {
                                i20 = i12 & (-57345);
                                shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                i20 = i12;
                                shape3 = shape2;
                            }
                            if (i15 != 0) {
                                fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                            } else {
                                fM1061getTonalElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                i20 &= -3670017;
                            } else {
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                            if (i17 != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                            } else {
                                dialogProperties3 = dialogProperties;
                            }
                            shape4 = shape3;
                            modifier4 = modifier3;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            i12 = i20;
                        } else {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if ((i11 & 16) != 0) {
                                i20 = i12 & (-57345);
                                shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                i20 = i12;
                                shape3 = shape2;
                            }
                            if (i15 != 0) {
                                fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                            } else {
                                fM1061getTonalElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                i20 &= -3670017;
                            } else {
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                            if (i17 != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                            } else {
                                dialogProperties3 = dialogProperties;
                            }
                            shape4 = shape3;
                            modifier4 = modifier3;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            i12 = i20;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                        }
                        composer2 = composerStartRestartGroup;
                        Modifier modifier14 = modifier4;
                        AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier14;
                        shape5 = shape4;
                        dialogProperties4 = dialogProperties3;
                        function5 = function4;
                        f11 = fM1061getTonalElevationD9Ej5fM;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier5, function5, shape5, f11, datePickerColors2, dialogProperties4, content, i10, i11));
                }
                i19 = 100663296;
                i12 |= i19;
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                    }
                    composer2 = composerStartRestartGroup;
                    Modifier modifier15 = modifier4;
                    AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier15;
                    shape5 = shape4;
                    dialogProperties4 = dialogProperties3;
                    function5 = function4;
                    f11 = fM1061getTonalElevationD9Ej5fM;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                    }
                    composer2 = composerStartRestartGroup;
                    Modifier modifier16 = modifier4;
                    AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier16;
                    shape5 = shape4;
                    dialogProperties4 = dialogProperties3;
                    function5 = function4;
                    f11 = fM1061getTonalElevationD9Ej5fM;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier5, function5, shape5, f11, datePickerColors2, dialogProperties4, content, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            f10 = f6;
            if ((3670016 & i10) != 0) {
                i12 |= ((i11 & 64) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 524288 : 1048576;
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
                dialogProperties2 = dialogProperties;
            } else {
                dialogProperties2 = dialogProperties;
                if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(dialogProperties2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 256) != 0) {
                if ((234881024 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i19 = 33554432;
                    }
                }
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                    }
                    composer2 = composerStartRestartGroup;
                    Modifier modifier17 = modifier4;
                    AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier17;
                    shape5 = shape4;
                    dialogProperties4 = dialogProperties3;
                    function5 = function4;
                    f11 = fM1061getTonalElevationD9Ej5fM;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                    }
                    composer2 = composerStartRestartGroup;
                    Modifier modifier18 = modifier4;
                    AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier18;
                    shape5 = shape4;
                    dialogProperties4 = dialogProperties3;
                    function5 = function4;
                    f11 = fM1061getTonalElevationD9Ej5fM;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier5, function5, shape5, f11, datePickerColors2, dialogProperties4, content, i10, i11));
            }
            i19 = 100663296;
            i12 |= i19;
            if ((191739611 & i12) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if ((i11 & 16) != 0) {
                        i20 = i12 & (-57345);
                        shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    } else {
                        i20 = i12;
                        shape3 = shape2;
                    }
                    if (i15 != 0) {
                        fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                    } else {
                        fM1061getTonalElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        i20 &= -3670017;
                    } else {
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                    if (i17 != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                    } else {
                        dialogProperties3 = dialogProperties;
                    }
                    shape4 = shape3;
                    modifier4 = modifier3;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    i12 = i20;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if ((i11 & 16) != 0) {
                        i20 = i12 & (-57345);
                        shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    } else {
                        i20 = i12;
                        shape3 = shape2;
                    }
                    if (i15 != 0) {
                        fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                    } else {
                        fM1061getTonalElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        i20 &= -3670017;
                    } else {
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                    if (i17 != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                    } else {
                        dialogProperties3 = dialogProperties;
                    }
                    shape4 = shape3;
                    modifier4 = modifier3;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    i12 = i20;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                }
                composer2 = composerStartRestartGroup;
                Modifier modifier19 = modifier4;
                AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier19;
                shape5 = shape4;
                dialogProperties4 = dialogProperties3;
                function5 = function4;
                f11 = fM1061getTonalElevationD9Ej5fM;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if ((i11 & 16) != 0) {
                        i20 = i12 & (-57345);
                        shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    } else {
                        i20 = i12;
                        shape3 = shape2;
                    }
                    if (i15 != 0) {
                        fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                    } else {
                        fM1061getTonalElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        i20 &= -3670017;
                    } else {
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                    if (i17 != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                    } else {
                        dialogProperties3 = dialogProperties;
                    }
                    shape4 = shape3;
                    modifier4 = modifier3;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    i12 = i20;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if ((i11 & 16) != 0) {
                        i20 = i12 & (-57345);
                        shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    } else {
                        i20 = i12;
                        shape3 = shape2;
                    }
                    if (i15 != 0) {
                        fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                    } else {
                        fM1061getTonalElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        i20 &= -3670017;
                    } else {
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                    if (i17 != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                    } else {
                        dialogProperties3 = dialogProperties;
                    }
                    shape4 = shape3;
                    modifier4 = modifier3;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    i12 = i20;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                }
                composer2 = composerStartRestartGroup;
                Modifier modifier110 = modifier4;
                AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier110;
                shape5 = shape4;
                dialogProperties4 = dialogProperties3;
                function5 = function4;
                f11 = fM1061getTonalElevationD9Ej5fM;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier5, function5, shape5, f11, datePickerColors2, dialogProperties4, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        modifier2 = modifier;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                function3 = function2;
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                    }
                    i12 |= i22;
                } else {
                    shape2 = shape;
                }
                i12 |= i22;
            } else {
                shape2 = shape;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((458752 & i10) == 0) {
                    f10 = f6;
                    if (composerStartRestartGroup.changed(f10)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((3670016 & i10) != 0) {
                    i12 |= ((i11 & 64) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 524288 : 1048576;
                }
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                    dialogProperties2 = dialogProperties;
                } else {
                    dialogProperties2 = dialogProperties;
                    if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(dialogProperties2)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 256) != 0) {
                    if ((234881024 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i19 = 33554432;
                        }
                    }
                    if ((191739611 & i12) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if ((i11 & 16) != 0) {
                                i20 = i12 & (-57345);
                                shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                i20 = i12;
                                shape3 = shape2;
                            }
                            if (i15 != 0) {
                                fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                            } else {
                                fM1061getTonalElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                i20 &= -3670017;
                            } else {
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                            if (i17 != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                            } else {
                                dialogProperties3 = dialogProperties;
                            }
                            shape4 = shape3;
                            modifier4 = modifier3;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            i12 = i20;
                        } else {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if ((i11 & 16) != 0) {
                                i20 = i12 & (-57345);
                                shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                i20 = i12;
                                shape3 = shape2;
                            }
                            if (i15 != 0) {
                                fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                            } else {
                                fM1061getTonalElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                i20 &= -3670017;
                            } else {
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                            if (i17 != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                            } else {
                                dialogProperties3 = dialogProperties;
                            }
                            shape4 = shape3;
                            modifier4 = modifier3;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            i12 = i20;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                        }
                        composer2 = composerStartRestartGroup;
                        Modifier modifier111 = modifier4;
                        AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier111;
                        shape5 = shape4;
                        dialogProperties4 = dialogProperties3;
                        function5 = function4;
                        f11 = fM1061getTonalElevationD9Ej5fM;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if ((i11 & 16) != 0) {
                                i20 = i12 & (-57345);
                                shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                i20 = i12;
                                shape3 = shape2;
                            }
                            if (i15 != 0) {
                                fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                            } else {
                                fM1061getTonalElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                i20 &= -3670017;
                            } else {
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                            if (i17 != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                            } else {
                                dialogProperties3 = dialogProperties;
                            }
                            shape4 = shape3;
                            modifier4 = modifier3;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            i12 = i20;
                        } else {
                            if (i21 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            } else {
                                function4 = function3;
                            }
                            if ((i11 & 16) != 0) {
                                i20 = i12 & (-57345);
                                shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                            } else {
                                i20 = i12;
                                shape3 = shape2;
                            }
                            if (i15 != 0) {
                                fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                            } else {
                                fM1061getTonalElevationD9Ej5fM = f10;
                            }
                            if ((i11 & 64) != 0) {
                                datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                                i20 &= -3670017;
                            } else {
                                datePickerColorsM1060colors1m2CgY = datePickerColors;
                            }
                            if (i17 != 0) {
                                dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                            } else {
                                dialogProperties3 = dialogProperties;
                            }
                            shape4 = shape3;
                            modifier4 = modifier3;
                            datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                            i12 = i20;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                        }
                        composer2 = composerStartRestartGroup;
                        Modifier modifier112 = modifier4;
                        AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier5 = modifier112;
                        shape5 = shape4;
                        dialogProperties4 = dialogProperties3;
                        function5 = function4;
                        f11 = fM1061getTonalElevationD9Ej5fM;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier5, function5, shape5, f11, datePickerColors2, dialogProperties4, content, i10, i11));
                }
                i19 = 100663296;
                i12 |= i19;
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                    }
                    composer2 = composerStartRestartGroup;
                    Modifier modifier113 = modifier4;
                    AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier113;
                    shape5 = shape4;
                    dialogProperties4 = dialogProperties3;
                    function5 = function4;
                    f11 = fM1061getTonalElevationD9Ej5fM;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                    }
                    composer2 = composerStartRestartGroup;
                    Modifier modifier114 = modifier4;
                    AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier114;
                    shape5 = shape4;
                    dialogProperties4 = dialogProperties3;
                    function5 = function4;
                    f11 = fM1061getTonalElevationD9Ej5fM;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier5, function5, shape5, f11, datePickerColors2, dialogProperties4, content, i10, i11));
            }
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            f10 = f6;
            if ((3670016 & i10) != 0) {
                i12 |= ((i11 & 64) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 524288 : 1048576;
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
                dialogProperties2 = dialogProperties;
            } else {
                dialogProperties2 = dialogProperties;
                if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(dialogProperties2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 256) != 0) {
                if ((234881024 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i19 = 33554432;
                    }
                }
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                    }
                    composer2 = composerStartRestartGroup;
                    Modifier modifier115 = modifier4;
                    AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier115;
                    shape5 = shape4;
                    dialogProperties4 = dialogProperties3;
                    function5 = function4;
                    f11 = fM1061getTonalElevationD9Ej5fM;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                    }
                    composer2 = composerStartRestartGroup;
                    Modifier modifier116 = modifier4;
                    AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier116;
                    shape5 = shape4;
                    dialogProperties4 = dialogProperties3;
                    function5 = function4;
                    f11 = fM1061getTonalElevationD9Ej5fM;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier5, function5, shape5, f11, datePickerColors2, dialogProperties4, content, i10, i11));
            }
            i19 = 100663296;
            i12 |= i19;
            if ((191739611 & i12) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if ((i11 & 16) != 0) {
                        i20 = i12 & (-57345);
                        shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    } else {
                        i20 = i12;
                        shape3 = shape2;
                    }
                    if (i15 != 0) {
                        fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                    } else {
                        fM1061getTonalElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        i20 &= -3670017;
                    } else {
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                    if (i17 != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                    } else {
                        dialogProperties3 = dialogProperties;
                    }
                    shape4 = shape3;
                    modifier4 = modifier3;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    i12 = i20;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if ((i11 & 16) != 0) {
                        i20 = i12 & (-57345);
                        shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    } else {
                        i20 = i12;
                        shape3 = shape2;
                    }
                    if (i15 != 0) {
                        fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                    } else {
                        fM1061getTonalElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        i20 &= -3670017;
                    } else {
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                    if (i17 != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                    } else {
                        dialogProperties3 = dialogProperties;
                    }
                    shape4 = shape3;
                    modifier4 = modifier3;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    i12 = i20;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                }
                composer2 = composerStartRestartGroup;
                Modifier modifier117 = modifier4;
                AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier117;
                shape5 = shape4;
                dialogProperties4 = dialogProperties3;
                function5 = function4;
                f11 = fM1061getTonalElevationD9Ej5fM;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if ((i11 & 16) != 0) {
                        i20 = i12 & (-57345);
                        shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    } else {
                        i20 = i12;
                        shape3 = shape2;
                    }
                    if (i15 != 0) {
                        fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                    } else {
                        fM1061getTonalElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        i20 &= -3670017;
                    } else {
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                    if (i17 != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                    } else {
                        dialogProperties3 = dialogProperties;
                    }
                    shape4 = shape3;
                    modifier4 = modifier3;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    i12 = i20;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if ((i11 & 16) != 0) {
                        i20 = i12 & (-57345);
                        shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    } else {
                        i20 = i12;
                        shape3 = shape2;
                    }
                    if (i15 != 0) {
                        fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                    } else {
                        fM1061getTonalElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        i20 &= -3670017;
                    } else {
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                    if (i17 != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                    } else {
                        dialogProperties3 = dialogProperties;
                    }
                    shape4 = shape3;
                    modifier4 = modifier3;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    i12 = i20;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                }
                composer2 = composerStartRestartGroup;
                Modifier modifier118 = modifier4;
                AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier118;
                shape5 = shape4;
                dialogProperties4 = dialogProperties3;
                function5 = function4;
                f11 = fM1061getTonalElevationD9Ej5fM;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier5, function5, shape5, f11, datePickerColors2, dialogProperties4, content, i10, i11));
        }
        i12 |= 3072;
        function3 = function2;
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                }
                i12 |= i22;
            } else {
                shape2 = shape;
            }
            i12 |= i22;
        } else {
            shape2 = shape;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((458752 & i10) == 0) {
                f10 = f6;
                if (composerStartRestartGroup.changed(f10)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((3670016 & i10) != 0) {
                i12 |= ((i11 & 64) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 524288 : 1048576;
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
                dialogProperties2 = dialogProperties;
            } else {
                dialogProperties2 = dialogProperties;
                if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(dialogProperties2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 256) != 0) {
                if ((234881024 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i19 = 33554432;
                    }
                }
                if ((191739611 & i12) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                    }
                    composer2 = composerStartRestartGroup;
                    Modifier modifier119 = modifier4;
                    AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier119;
                    shape5 = shape4;
                    dialogProperties4 = dialogProperties3;
                    function5 = function4;
                    f11 = fM1061getTonalElevationD9Ej5fM;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    } else {
                        if (i21 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        } else {
                            function4 = function3;
                        }
                        if ((i11 & 16) != 0) {
                            i20 = i12 & (-57345);
                            shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                        } else {
                            i20 = i12;
                            shape3 = shape2;
                        }
                        if (i15 != 0) {
                            fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                        } else {
                            fM1061getTonalElevationD9Ej5fM = f10;
                        }
                        if ((i11 & 64) != 0) {
                            datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                            i20 &= -3670017;
                        } else {
                            datePickerColorsM1060colors1m2CgY = datePickerColors;
                        }
                        if (i17 != 0) {
                            dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                        } else {
                            dialogProperties3 = dialogProperties;
                        }
                        shape4 = shape3;
                        modifier4 = modifier3;
                        datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                        i12 = i20;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                    }
                    composer2 = composerStartRestartGroup;
                    Modifier modifier1110 = modifier4;
                    AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier1110;
                    shape5 = shape4;
                    dialogProperties4 = dialogProperties3;
                    function5 = function4;
                    f11 = fM1061getTonalElevationD9Ej5fM;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier5, function5, shape5, f11, datePickerColors2, dialogProperties4, content, i10, i11));
            }
            i19 = 100663296;
            i12 |= i19;
            if ((191739611 & i12) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if ((i11 & 16) != 0) {
                        i20 = i12 & (-57345);
                        shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    } else {
                        i20 = i12;
                        shape3 = shape2;
                    }
                    if (i15 != 0) {
                        fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                    } else {
                        fM1061getTonalElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        i20 &= -3670017;
                    } else {
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                    if (i17 != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                    } else {
                        dialogProperties3 = dialogProperties;
                    }
                    shape4 = shape3;
                    modifier4 = modifier3;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    i12 = i20;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if ((i11 & 16) != 0) {
                        i20 = i12 & (-57345);
                        shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    } else {
                        i20 = i12;
                        shape3 = shape2;
                    }
                    if (i15 != 0) {
                        fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                    } else {
                        fM1061getTonalElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        i20 &= -3670017;
                    } else {
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                    if (i17 != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                    } else {
                        dialogProperties3 = dialogProperties;
                    }
                    shape4 = shape3;
                    modifier4 = modifier3;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    i12 = i20;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                }
                composer2 = composerStartRestartGroup;
                Modifier modifier1111 = modifier4;
                AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier1111;
                shape5 = shape4;
                dialogProperties4 = dialogProperties3;
                function5 = function4;
                f11 = fM1061getTonalElevationD9Ej5fM;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if ((i11 & 16) != 0) {
                        i20 = i12 & (-57345);
                        shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    } else {
                        i20 = i12;
                        shape3 = shape2;
                    }
                    if (i15 != 0) {
                        fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                    } else {
                        fM1061getTonalElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        i20 &= -3670017;
                    } else {
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                    if (i17 != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                    } else {
                        dialogProperties3 = dialogProperties;
                    }
                    shape4 = shape3;
                    modifier4 = modifier3;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    i12 = i20;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if ((i11 & 16) != 0) {
                        i20 = i12 & (-57345);
                        shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    } else {
                        i20 = i12;
                        shape3 = shape2;
                    }
                    if (i15 != 0) {
                        fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                    } else {
                        fM1061getTonalElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        i20 &= -3670017;
                    } else {
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                    if (i17 != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                    } else {
                        dialogProperties3 = dialogProperties;
                    }
                    shape4 = shape3;
                    modifier4 = modifier3;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    i12 = i20;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                }
                composer2 = composerStartRestartGroup;
                Modifier modifier1112 = modifier4;
                AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier1112;
                shape5 = shape4;
                dialogProperties4 = dialogProperties3;
                function5 = function4;
                f11 = fM1061getTonalElevationD9Ej5fM;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier5, function5, shape5, f11, datePickerColors2, dialogProperties4, content, i10, i11));
        }
        i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        f10 = f6;
        if ((3670016 & i10) != 0) {
            i12 |= ((i11 & 64) == 0 || !composerStartRestartGroup.changed(datePickerColors)) ? 524288 : 1048576;
        }
        i17 = i11 & 128;
        if (i17 != 0) {
            i12 |= 12582912;
            dialogProperties2 = dialogProperties;
        } else {
            dialogProperties2 = dialogProperties;
            if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(dialogProperties2)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
        }
        if ((i11 & 256) != 0) {
            if ((234881024 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i19 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i19 = 33554432;
                }
            }
            if ((191739611 & i12) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if ((i11 & 16) != 0) {
                        i20 = i12 & (-57345);
                        shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    } else {
                        i20 = i12;
                        shape3 = shape2;
                    }
                    if (i15 != 0) {
                        fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                    } else {
                        fM1061getTonalElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        i20 &= -3670017;
                    } else {
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                    if (i17 != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                    } else {
                        dialogProperties3 = dialogProperties;
                    }
                    shape4 = shape3;
                    modifier4 = modifier3;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    i12 = i20;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if ((i11 & 16) != 0) {
                        i20 = i12 & (-57345);
                        shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    } else {
                        i20 = i12;
                        shape3 = shape2;
                    }
                    if (i15 != 0) {
                        fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                    } else {
                        fM1061getTonalElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        i20 &= -3670017;
                    } else {
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                    if (i17 != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                    } else {
                        dialogProperties3 = dialogProperties;
                    }
                    shape4 = shape3;
                    modifier4 = modifier3;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    i12 = i20;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                }
                composer2 = composerStartRestartGroup;
                Modifier modifier1113 = modifier4;
                AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier1113;
                shape5 = shape4;
                dialogProperties4 = dialogProperties3;
                function5 = function4;
                f11 = fM1061getTonalElevationD9Ej5fM;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if ((i11 & 16) != 0) {
                        i20 = i12 & (-57345);
                        shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    } else {
                        i20 = i12;
                        shape3 = shape2;
                    }
                    if (i15 != 0) {
                        fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                    } else {
                        fM1061getTonalElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        i20 &= -3670017;
                    } else {
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                    if (i17 != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                    } else {
                        dialogProperties3 = dialogProperties;
                    }
                    shape4 = shape3;
                    modifier4 = modifier3;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    i12 = i20;
                } else {
                    if (i21 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    } else {
                        function4 = function3;
                    }
                    if ((i11 & 16) != 0) {
                        i20 = i12 & (-57345);
                        shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                    } else {
                        i20 = i12;
                        shape3 = shape2;
                    }
                    if (i15 != 0) {
                        fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                    } else {
                        fM1061getTonalElevationD9Ej5fM = f10;
                    }
                    if ((i11 & 64) != 0) {
                        datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                        i20 &= -3670017;
                    } else {
                        datePickerColorsM1060colors1m2CgY = datePickerColors;
                    }
                    if (i17 != 0) {
                        dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                    } else {
                        dialogProperties3 = dialogProperties;
                    }
                    shape4 = shape3;
                    modifier4 = modifier3;
                    datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                    i12 = i20;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
                }
                composer2 = composerStartRestartGroup;
                Modifier modifier1114 = modifier4;
                AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier1114;
                shape5 = shape4;
                dialogProperties4 = dialogProperties3;
                function5 = function4;
                f11 = fM1061getTonalElevationD9Ej5fM;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier5, function5, shape5, f11, datePickerColors2, dialogProperties4, content, i10, i11));
        }
        i19 = 100663296;
        i12 |= i19;
        if ((191739611 & i12) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if ((i11 & 16) != 0) {
                    i20 = i12 & (-57345);
                    shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                } else {
                    i20 = i12;
                    shape3 = shape2;
                }
                if (i15 != 0) {
                    fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                } else {
                    fM1061getTonalElevationD9Ej5fM = f10;
                }
                if ((i11 & 64) != 0) {
                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    i20 &= -3670017;
                } else {
                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                }
                if (i17 != 0) {
                    dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                } else {
                    dialogProperties3 = dialogProperties;
                }
                shape4 = shape3;
                modifier4 = modifier3;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                i12 = i20;
            } else {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if ((i11 & 16) != 0) {
                    i20 = i12 & (-57345);
                    shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                } else {
                    i20 = i12;
                    shape3 = shape2;
                }
                if (i15 != 0) {
                    fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                } else {
                    fM1061getTonalElevationD9Ej5fM = f10;
                }
                if ((i11 & 64) != 0) {
                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    i20 &= -3670017;
                } else {
                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                }
                if (i17 != 0) {
                    dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                } else {
                    dialogProperties3 = dialogProperties;
                }
                shape4 = shape3;
                modifier4 = modifier3;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                i12 = i20;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
            }
            composer2 = composerStartRestartGroup;
            Modifier modifier1115 = modifier4;
            AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier1115;
            shape5 = shape4;
            dialogProperties4 = dialogProperties3;
            function5 = function4;
            f11 = fM1061getTonalElevationD9Ej5fM;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if ((i11 & 16) != 0) {
                    i20 = i12 & (-57345);
                    shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                } else {
                    i20 = i12;
                    shape3 = shape2;
                }
                if (i15 != 0) {
                    fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                } else {
                    fM1061getTonalElevationD9Ej5fM = f10;
                }
                if ((i11 & 64) != 0) {
                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    i20 &= -3670017;
                } else {
                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                }
                if (i17 != 0) {
                    dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                } else {
                    dialogProperties3 = dialogProperties;
                }
                shape4 = shape3;
                modifier4 = modifier3;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                i12 = i20;
            } else {
                if (i21 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    function4 = null;
                } else {
                    function4 = function3;
                }
                if ((i11 & 16) != 0) {
                    i20 = i12 & (-57345);
                    shape3 = DatePickerDefaults.INSTANCE.getShape(composerStartRestartGroup, 6);
                } else {
                    i20 = i12;
                    shape3 = shape2;
                }
                if (i15 != 0) {
                    fM1061getTonalElevationD9Ej5fM = DatePickerDefaults.INSTANCE.m1061getTonalElevationD9Ej5fM();
                } else {
                    fM1061getTonalElevationD9Ej5fM = f10;
                }
                if ((i11 & 64) != 0) {
                    datePickerColorsM1060colors1m2CgY = DatePickerDefaults.INSTANCE.m1060colors1m2CgY(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, 805306368, 524287);
                    i20 &= -3670017;
                } else {
                    datePickerColorsM1060colors1m2CgY = datePickerColors;
                }
                if (i17 != 0) {
                    dialogProperties3 = new DialogProperties(false, false, null, false, false, 23, null);
                } else {
                    dialogProperties3 = dialogProperties;
                }
                shape4 = shape3;
                modifier4 = modifier3;
                datePickerColors2 = datePickerColorsM1060colors1m2CgY;
                i12 = i20;
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-36517340, i12, -1, "androidx.compose.material3.DatePickerDialog (DatePickerDialog.android.kt:64)");
            }
            composer2 = composerStartRestartGroup;
            Modifier modifier1116 = modifier4;
            AndroidAlertDialog_androidKt.AlertDialog(onDismissRequest, SizeKt.wrapContentHeight$default(modifier4, null, false, 3, null), dialogProperties3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -476003174, true, new a(shape4, datePickerColors2, fM1061getTonalElevationD9Ej5fM, i12, content, function4, confirmButton)), composer2, (i12 & 14) | 3072 | ((i12 >> 15) & 896), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier5 = modifier1116;
            shape5 = shape4;
            dialogProperties4 = dialogProperties3;
            function5 = function4;
            f11 = fM1061getTonalElevationD9Ej5fM;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(onDismissRequest, confirmButton, modifier5, function5, shape5, f11, datePickerColors2, dialogProperties4, content, i10, i11));
    }
}
