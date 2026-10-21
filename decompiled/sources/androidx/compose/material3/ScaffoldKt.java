package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.SubcomposeLayoutKt;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Scaffold.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a´\u0001\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0013\b\u0002\u0010\u0005\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\u0007\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\u0013\b\u0002\u0010\b\u001a\r\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0002\b\u00042\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\u0012\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00030\u0010¢\u0006\u0002\b\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0013\u0010\u0014\"\"\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", "topBar", "bottomBar", "snackbarHost", "floatingActionButton", "Landroidx/compose/material3/FabPosition;", "floatingActionButtonPosition", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Landroidx/compose/foundation/layout/WindowInsets;", "contentWindowInsets", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/PaddingValues;", "content", "Scaffold-TvnljyQ", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;IJJLandroidx/compose/foundation/layout/WindowInsets;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Scaffold", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Landroidx/compose/material3/FabPlacement;", "a", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "getLocalFabPlacement", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LocalFabPlacement", "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nScaffold.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,334:1\n83#2,3:335\n1114#3,6:338\n154#4:344\n*S KotlinDebug\n*F\n+ 1 Scaffold.kt\nandroidx/compose/material3/ScaffoldKt\n*L\n122#1:335,3\n122#1:338,6\n331#1:344\n*E\n"})
public final class ScaffoldKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ProvidableCompositionLocal<FabPlacement> f11140a = CompositionLocalKt.staticCompositionLocalOf(a.f11142p0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f11141b = Dp.m4389constructorimpl(16);

    /* JADX INFO: compiled from: Scaffold.kt */
    public static final class a extends Lambda implements Function0<FabPlacement> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f11142p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ FabPlacement invoke() {
            return null;
        }
    }

    /* JADX INFO: compiled from: Scaffold.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ int f11143p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11144q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> f11145r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11146s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11147t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ WindowInsets f11148u0;
        public final /* synthetic */ Function2<Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f11149w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, int i11, WindowInsets windowInsets, Function2 function2, Function2 function3, Function2 function4, Function2 function5, Function3 function6) {
            super(2);
            this.f11143p0 = i10;
            this.f11144q0 = function2;
            this.f11145r0 = function6;
            this.f11146s0 = function3;
            this.f11147t0 = function4;
            this.f11148u0 = windowInsets;
            this.v0 = function5;
            this.f11149w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1979205334, iIntValue, -1, "androidx.compose.material3.Scaffold.<anonymous> (Scaffold.kt:85)");
                }
                int i10 = this.f11143p0;
                Function2<Composer, Integer, Unit> function2 = this.f11144q0;
                Function3<PaddingValues, Composer, Integer, Unit> function3 = this.f11145r0;
                Function2<Composer, Integer, Unit> function4 = this.f11146s0;
                Function2<Composer, Integer, Unit> function5 = this.f11147t0;
                WindowInsets windowInsets = this.f11148u0;
                Function2<Composer, Integer, Unit> function6 = this.v0;
                int i11 = this.f11149w0;
                ScaffoldKt.m1225access$ScaffoldLayoutFMILGgc(i10, function2, function3, function4, function5, windowInsets, function6, composer2, ((i11 >> 15) & 14) | (i11 & 112) | ((i11 >> 21) & 896) | (i11 & 7168) | (57344 & i11) | ((i11 >> 9) & 458752) | ((i11 << 12) & 3670016));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Scaffold.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;
        public final /* synthetic */ int F0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11150p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11151q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11152r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11153s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f11154t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f11155u0;
        public final /* synthetic */ long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ long f11156w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ WindowInsets f11157x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ Function3<PaddingValues, Composer, Integer, Unit> f11158y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Modifier modifier, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Function2<? super Composer, ? super Integer, Unit> function5, int i10, long j10, long j11, WindowInsets windowInsets, Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> function6, int i11, int i12) {
            super(2);
            this.f11150p0 = modifier;
            this.f11151q0 = function2;
            this.f11152r0 = function3;
            this.f11153s0 = function4;
            this.f11154t0 = function5;
            this.f11155u0 = i10;
            this.v0 = j10;
            this.f11156w0 = j11;
            this.f11157x0 = windowInsets;
            this.f11158y0 = function6;
            this.E0 = i11;
            this.F0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ScaffoldKt.m1224ScaffoldTvnljyQ(this.f11150p0, this.f11151q0, this.f11152r0, this.f11153s0, this.f11154t0, this.f11155u0, this.v0, this.f11156w0, this.f11157x0, this.f11158y0, composer, RecomposeScopeImplKt.updateChangedFlags(this.E0 | 1), this.F0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0121  */
    /* JADX WARN: Code duplicated, block: B:104:0x0126  */
    /* JADX WARN: Code duplicated, block: B:106:0x012c  */
    /* JADX WARN: Code duplicated, block: B:107:0x012f  */
    /* JADX WARN: Code duplicated, block: B:110:0x013b  */
    /* JADX WARN: Code duplicated, block: B:114:0x0154  */
    /* JADX WARN: Code duplicated, block: B:116:0x0164  */
    /* JADX WARN: Code duplicated, block: B:129:0x018f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x0191  */
    /* JADX WARN: Code duplicated, block: B:131:0x0194  */
    /* JADX WARN: Code duplicated, block: B:133:0x0198  */
    /* JADX WARN: Code duplicated, block: B:134:0x019f  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:140:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:142:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:143:0x01be  */
    /* JADX WARN: Code duplicated, block: B:145:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:146:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:149:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:150:0x01df  */
    /* JADX WARN: Code duplicated, block: B:153:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:156:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:157:0x0206  */
    /* JADX WARN: Code duplicated, block: B:160:0x0214  */
    /* JADX WARN: Code duplicated, block: B:163:0x0264  */
    /* JADX WARN: Code duplicated, block: B:168:0x0276  */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x007d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:89:0x0101  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    /* JADX WARN: Code duplicated, block: B:94:0x0110 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:97:0x0117  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[_][_][_][_][_]]")
    /* JADX INFO: renamed from: Scaffold-TvnljyQ, reason: not valid java name */
    public static final void m1224ScaffoldTvnljyQ(@Nullable Modifier modifier, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Function2<? super Composer, ? super Integer, Unit> function4, @Nullable Function2<? super Composer, ? super Integer, Unit> function5, int i10, long j10, long j11, @Nullable WindowInsets windowInsets, @NotNull Function3<? super PaddingValues, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i11, int i12) {
        int i13;
        Function2<? super Composer, ? super Integer, Unit> function6;
        int i14;
        Function2<? super Composer, ? super Integer, Unit> function7;
        int i15;
        int i16;
        int i17;
        int i18;
        Function2<? super Composer, ? super Integer, Unit> function8;
        int i19;
        int i20;
        int i21;
        long jM1014contentColorForek8zF_U;
        int i22;
        Modifier modifier2;
        Function2<? super Composer, ? super Integer, Unit> function2M1040getLambda1$material3_release;
        Function2<? super Composer, ? super Integer, Unit> function2M1041getLambda2$material3_release;
        Function2<? super Composer, ? super Integer, Unit> function2M1042getLambda3$material3_release;
        Function2<? super Composer, ? super Integer, Unit> function2M1043getLambda4$material3_release;
        int iM1110getEndERTFSPs;
        int i23;
        long jM954getBackground0d7_KjU;
        int i24;
        WindowInsets contentWindowInsets;
        WindowInsets windowInsets2;
        long j12;
        long j13;
        Function2<? super Composer, ? super Integer, Unit> function9;
        Function2<? super Composer, ? super Integer, Unit> function10;
        Function2<? super Composer, ? super Integer, Unit> function11;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i25;
        int i26;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1219521777);
        int i27 = i12 & 1;
        if (i27 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i28 = i12 & 2;
        if (i28 == 0) {
            if ((i11 & 112) == 0) {
                function6 = function2;
                i13 |= composerStartRestartGroup.changedInstance(function6) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i11 & 896) == 0) {
                    function7 = function3;
                    if (composerStartRestartGroup.changedInstance(function7)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i11 & 7168) == 0) {
                        if (composerStartRestartGroup.changedInstance(function4)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    i18 = i12 & 16;
                    if (i18 != 0) {
                        if ((57344 & i11) == 0) {
                            function8 = function5;
                            if (composerStartRestartGroup.changedInstance(function8)) {
                                i19 = 16384;
                            } else {
                                i19 = 8192;
                            }
                            i13 |= i19;
                        }
                        i20 = i12 & 32;
                        if (i20 != 0) {
                            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i11 & 458752) == 0) {
                            if (composerStartRestartGroup.changed(i10)) {
                                i21 = 131072;
                            } else {
                                i21 = 65536;
                            }
                            i13 |= i21;
                        }
                        if ((i11 & 3670016) != 0) {
                            if ((i12 & 64) == 0 || !composerStartRestartGroup.changed(j10)) {
                                i26 = 524288;
                            } else {
                                i26 = 1048576;
                            }
                            i13 |= i26;
                        }
                        if ((i11 & 29360128) == 0) {
                            jM1014contentColorForek8zF_U = j11;
                            if ((i12 & 128) == 0 || !composerStartRestartGroup.changed(jM1014contentColorForek8zF_U)) {
                                i25 = 4194304;
                            } else {
                                i25 = 8388608;
                            }
                            i13 |= i25;
                        } else {
                            jM1014contentColorForek8zF_U = j11;
                        }
                        if ((234881024 & i11) != 0) {
                            i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(windowInsets)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        }
                        if ((i12 & 512) != 0) {
                            if ((1879048192 & i11) == 0) {
                                if (composerStartRestartGroup.changedInstance(content)) {
                                    i22 = PKIFailureInfo.duplicateCertReq;
                                } else {
                                    i22 = 268435456;
                                }
                            }
                            if ((1533916891 & i13) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i11 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i27 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    } else {
                                        modifier2 = modifier;
                                    }
                                    if (i28 != 0) {
                                        function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                                    } else {
                                        function2M1040getLambda1$material3_release = function6;
                                    }
                                    if (i14 != 0) {
                                        function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                                    } else {
                                        function2M1041getLambda2$material3_release = function7;
                                    }
                                    if (i16 != 0) {
                                        function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                                    } else {
                                        function2M1042getLambda3$material3_release = function4;
                                    }
                                    if (i18 != 0) {
                                        function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                                    } else {
                                        function2M1043getLambda4$material3_release = function8;
                                    }
                                    if (i20 != 0) {
                                        iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                                    } else {
                                        iM1110getEndERTFSPs = i10;
                                    }
                                    if ((i12 & 64) != 0) {
                                        i23 = i13 & (-3670017);
                                        jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                                    } else {
                                        i23 = i13;
                                        jM954getBackground0d7_KjU = j10;
                                    }
                                    if ((i12 & 128) != 0) {
                                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                        i23 &= -29360129;
                                    }
                                    if ((i12 & 256) != 0) {
                                        i24 = i23 & (-234881025);
                                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                        modifier2 = modifier2;
                                    } else {
                                        i24 = i23;
                                        contentWindowInsets = windowInsets;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i12 & 64) != 0) {
                                        i13 &= -3670017;
                                    }
                                    if ((i12 & 128) != 0) {
                                        i13 &= -29360129;
                                    }
                                    if ((i12 & 256) != 0) {
                                        i13 &= -234881025;
                                    }
                                    modifier2 = modifier;
                                    contentWindowInsets = windowInsets;
                                    function2M1040getLambda1$material3_release = function6;
                                    function2M1041getLambda2$material3_release = function7;
                                    function2M1043getLambda4$material3_release = function8;
                                    function2M1042getLambda3$material3_release = function4;
                                    iM1110getEndERTFSPs = i10;
                                    i24 = i13;
                                    jM954getBackground0d7_KjU = j10;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                                }
                                int i29 = i24 >> 12;
                                SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i29 & 896) | (i29 & 7168), 114);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                windowInsets2 = contentWindowInsets;
                                j12 = jM1014contentColorForek8zF_U;
                                j13 = jM954getBackground0d7_KjU;
                                function9 = function2M1041getLambda2$material3_release;
                                function10 = function2M1042getLambda3$material3_release;
                                function11 = function2M1043getLambda4$material3_release;
                                function6 = function2M1040getLambda1$material3_release;
                                modifier3 = modifier2;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier;
                                function10 = function4;
                                windowInsets2 = windowInsets;
                                function9 = function7;
                                j12 = jM1014contentColorForek8zF_U;
                                function11 = function8;
                                iM1110getEndERTFSPs = i10;
                                j13 = j10;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
                        }
                        i22 = 805306368;
                        i13 |= i22;
                        if ((1533916891 & i13) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i28 != 0) {
                                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                                } else {
                                    function2M1040getLambda1$material3_release = function6;
                                }
                                if (i14 != 0) {
                                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                                } else {
                                    function2M1041getLambda2$material3_release = function7;
                                }
                                if (i16 != 0) {
                                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                                } else {
                                    function2M1042getLambda3$material3_release = function4;
                                }
                                if (i18 != 0) {
                                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                                } else {
                                    function2M1043getLambda4$material3_release = function8;
                                }
                                if (i20 != 0) {
                                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                                } else {
                                    iM1110getEndERTFSPs = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                                } else {
                                    i23 = i13;
                                    jM954getBackground0d7_KjU = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                    modifier2 = modifier2;
                                } else {
                                    i24 = i23;
                                    contentWindowInsets = windowInsets;
                                }
                            } else {
                                if (i27 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i28 != 0) {
                                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                                } else {
                                    function2M1040getLambda1$material3_release = function6;
                                }
                                if (i14 != 0) {
                                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                                } else {
                                    function2M1041getLambda2$material3_release = function7;
                                }
                                if (i16 != 0) {
                                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                                } else {
                                    function2M1042getLambda3$material3_release = function4;
                                }
                                if (i18 != 0) {
                                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                                } else {
                                    function2M1043getLambda4$material3_release = function8;
                                }
                                if (i20 != 0) {
                                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                                } else {
                                    iM1110getEndERTFSPs = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                                } else {
                                    i23 = i13;
                                    jM954getBackground0d7_KjU = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                    modifier2 = modifier2;
                                } else {
                                    i24 = i23;
                                    contentWindowInsets = windowInsets;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                            }
                            int i210 = i24 >> 12;
                            SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i210 & 896) | (i210 & 7168), 114);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            windowInsets2 = contentWindowInsets;
                            j12 = jM1014contentColorForek8zF_U;
                            j13 = jM954getBackground0d7_KjU;
                            function9 = function2M1041getLambda2$material3_release;
                            function10 = function2M1042getLambda3$material3_release;
                            function11 = function2M1043getLambda4$material3_release;
                            function6 = function2M1040getLambda1$material3_release;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i28 != 0) {
                                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                                } else {
                                    function2M1040getLambda1$material3_release = function6;
                                }
                                if (i14 != 0) {
                                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                                } else {
                                    function2M1041getLambda2$material3_release = function7;
                                }
                                if (i16 != 0) {
                                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                                } else {
                                    function2M1042getLambda3$material3_release = function4;
                                }
                                if (i18 != 0) {
                                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                                } else {
                                    function2M1043getLambda4$material3_release = function8;
                                }
                                if (i20 != 0) {
                                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                                } else {
                                    iM1110getEndERTFSPs = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                                } else {
                                    i23 = i13;
                                    jM954getBackground0d7_KjU = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                    modifier2 = modifier2;
                                } else {
                                    i24 = i23;
                                    contentWindowInsets = windowInsets;
                                }
                            } else {
                                if (i27 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i28 != 0) {
                                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                                } else {
                                    function2M1040getLambda1$material3_release = function6;
                                }
                                if (i14 != 0) {
                                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                                } else {
                                    function2M1041getLambda2$material3_release = function7;
                                }
                                if (i16 != 0) {
                                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                                } else {
                                    function2M1042getLambda3$material3_release = function4;
                                }
                                if (i18 != 0) {
                                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                                } else {
                                    function2M1043getLambda4$material3_release = function8;
                                }
                                if (i20 != 0) {
                                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                                } else {
                                    iM1110getEndERTFSPs = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                                } else {
                                    i23 = i13;
                                    jM954getBackground0d7_KjU = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                    modifier2 = modifier2;
                                } else {
                                    i24 = i23;
                                    contentWindowInsets = windowInsets;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                            }
                            int i211 = i24 >> 12;
                            SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i211 & 896) | (i211 & 7168), 114);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            windowInsets2 = contentWindowInsets;
                            j12 = jM1014contentColorForek8zF_U;
                            j13 = jM954getBackground0d7_KjU;
                            function9 = function2M1041getLambda2$material3_release;
                            function10 = function2M1042getLambda3$material3_release;
                            function11 = function2M1043getLambda4$material3_release;
                            function6 = function2M1040getLambda1$material3_release;
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
                    }
                    i13 |= 24576;
                    function8 = function5;
                    i20 = i12 & 32;
                    if (i20 != 0) {
                        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i11 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(i10)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    if ((i11 & 3670016) != 0) {
                        if ((i12 & 64) == 0) {
                            i26 = 524288;
                        } else {
                            i26 = 524288;
                        }
                        i13 |= i26;
                    }
                    if ((i11 & 29360128) == 0) {
                        jM1014contentColorForek8zF_U = j11;
                        if ((i12 & 128) == 0) {
                            i25 = 4194304;
                        } else {
                            i25 = 4194304;
                        }
                        i13 |= i25;
                    } else {
                        jM1014contentColorForek8zF_U = j11;
                    }
                    if ((234881024 & i11) != 0) {
                        i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(windowInsets)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    if ((i12 & 512) != 0) {
                        if ((1879048192 & i11) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i22 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i22 = 268435456;
                            }
                        }
                        if ((1533916891 & i13) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i28 != 0) {
                                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                                } else {
                                    function2M1040getLambda1$material3_release = function6;
                                }
                                if (i14 != 0) {
                                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                                } else {
                                    function2M1041getLambda2$material3_release = function7;
                                }
                                if (i16 != 0) {
                                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                                } else {
                                    function2M1042getLambda3$material3_release = function4;
                                }
                                if (i18 != 0) {
                                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                                } else {
                                    function2M1043getLambda4$material3_release = function8;
                                }
                                if (i20 != 0) {
                                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                                } else {
                                    iM1110getEndERTFSPs = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                                } else {
                                    i23 = i13;
                                    jM954getBackground0d7_KjU = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                    modifier2 = modifier2;
                                } else {
                                    i24 = i23;
                                    contentWindowInsets = windowInsets;
                                }
                            } else {
                                if (i27 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i28 != 0) {
                                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                                } else {
                                    function2M1040getLambda1$material3_release = function6;
                                }
                                if (i14 != 0) {
                                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                                } else {
                                    function2M1041getLambda2$material3_release = function7;
                                }
                                if (i16 != 0) {
                                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                                } else {
                                    function2M1042getLambda3$material3_release = function4;
                                }
                                if (i18 != 0) {
                                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                                } else {
                                    function2M1043getLambda4$material3_release = function8;
                                }
                                if (i20 != 0) {
                                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                                } else {
                                    iM1110getEndERTFSPs = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                                } else {
                                    i23 = i13;
                                    jM954getBackground0d7_KjU = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                    modifier2 = modifier2;
                                } else {
                                    i24 = i23;
                                    contentWindowInsets = windowInsets;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                            }
                            int i212 = i24 >> 12;
                            SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i212 & 896) | (i212 & 7168), 114);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            windowInsets2 = contentWindowInsets;
                            j12 = jM1014contentColorForek8zF_U;
                            j13 = jM954getBackground0d7_KjU;
                            function9 = function2M1041getLambda2$material3_release;
                            function10 = function2M1042getLambda3$material3_release;
                            function11 = function2M1043getLambda4$material3_release;
                            function6 = function2M1040getLambda1$material3_release;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i28 != 0) {
                                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                                } else {
                                    function2M1040getLambda1$material3_release = function6;
                                }
                                if (i14 != 0) {
                                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                                } else {
                                    function2M1041getLambda2$material3_release = function7;
                                }
                                if (i16 != 0) {
                                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                                } else {
                                    function2M1042getLambda3$material3_release = function4;
                                }
                                if (i18 != 0) {
                                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                                } else {
                                    function2M1043getLambda4$material3_release = function8;
                                }
                                if (i20 != 0) {
                                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                                } else {
                                    iM1110getEndERTFSPs = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                                } else {
                                    i23 = i13;
                                    jM954getBackground0d7_KjU = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                    modifier2 = modifier2;
                                } else {
                                    i24 = i23;
                                    contentWindowInsets = windowInsets;
                                }
                            } else {
                                if (i27 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i28 != 0) {
                                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                                } else {
                                    function2M1040getLambda1$material3_release = function6;
                                }
                                if (i14 != 0) {
                                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                                } else {
                                    function2M1041getLambda2$material3_release = function7;
                                }
                                if (i16 != 0) {
                                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                                } else {
                                    function2M1042getLambda3$material3_release = function4;
                                }
                                if (i18 != 0) {
                                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                                } else {
                                    function2M1043getLambda4$material3_release = function8;
                                }
                                if (i20 != 0) {
                                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                                } else {
                                    iM1110getEndERTFSPs = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                                } else {
                                    i23 = i13;
                                    jM954getBackground0d7_KjU = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                    modifier2 = modifier2;
                                } else {
                                    i24 = i23;
                                    contentWindowInsets = windowInsets;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                            }
                            int i213 = i24 >> 12;
                            SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i213 & 896) | (i213 & 7168), 114);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            windowInsets2 = contentWindowInsets;
                            j12 = jM1014contentColorForek8zF_U;
                            j13 = jM954getBackground0d7_KjU;
                            function9 = function2M1041getLambda2$material3_release;
                            function10 = function2M1042getLambda3$material3_release;
                            function11 = function2M1043getLambda4$material3_release;
                            function6 = function2M1040getLambda1$material3_release;
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
                    }
                    i22 = 805306368;
                    i13 |= i22;
                    if ((1533916891 & i13) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        } else {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                        }
                        int i214 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i214 & 896) | (i214 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets2 = contentWindowInsets;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = jM954getBackground0d7_KjU;
                        function9 = function2M1041getLambda2$material3_release;
                        function10 = function2M1042getLambda3$material3_release;
                        function11 = function2M1043getLambda4$material3_release;
                        function6 = function2M1040getLambda1$material3_release;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        } else {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                        }
                        int i215 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i215 & 896) | (i215 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets2 = contentWindowInsets;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = jM954getBackground0d7_KjU;
                        function9 = function2M1041getLambda2$material3_release;
                        function10 = function2M1042getLambda3$material3_release;
                        function11 = function2M1043getLambda4$material3_release;
                        function6 = function2M1040getLambda1$material3_release;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
                }
                i13 |= 3072;
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((57344 & i11) == 0) {
                        function8 = function5;
                        if (composerStartRestartGroup.changedInstance(function8)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 32;
                    if (i20 != 0) {
                        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i11 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(i10)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    if ((i11 & 3670016) != 0) {
                        if ((i12 & 64) == 0) {
                            i26 = 524288;
                        } else {
                            i26 = 524288;
                        }
                        i13 |= i26;
                    }
                    if ((i11 & 29360128) == 0) {
                        jM1014contentColorForek8zF_U = j11;
                        if ((i12 & 128) == 0) {
                            i25 = 4194304;
                        } else {
                            i25 = 4194304;
                        }
                        i13 |= i25;
                    } else {
                        jM1014contentColorForek8zF_U = j11;
                    }
                    if ((234881024 & i11) != 0) {
                        i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(windowInsets)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    if ((i12 & 512) != 0) {
                        if ((1879048192 & i11) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i22 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i22 = 268435456;
                            }
                        }
                        if ((1533916891 & i13) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i28 != 0) {
                                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                                } else {
                                    function2M1040getLambda1$material3_release = function6;
                                }
                                if (i14 != 0) {
                                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                                } else {
                                    function2M1041getLambda2$material3_release = function7;
                                }
                                if (i16 != 0) {
                                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                                } else {
                                    function2M1042getLambda3$material3_release = function4;
                                }
                                if (i18 != 0) {
                                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                                } else {
                                    function2M1043getLambda4$material3_release = function8;
                                }
                                if (i20 != 0) {
                                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                                } else {
                                    iM1110getEndERTFSPs = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                                } else {
                                    i23 = i13;
                                    jM954getBackground0d7_KjU = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                    modifier2 = modifier2;
                                } else {
                                    i24 = i23;
                                    contentWindowInsets = windowInsets;
                                }
                            } else {
                                if (i27 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i28 != 0) {
                                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                                } else {
                                    function2M1040getLambda1$material3_release = function6;
                                }
                                if (i14 != 0) {
                                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                                } else {
                                    function2M1041getLambda2$material3_release = function7;
                                }
                                if (i16 != 0) {
                                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                                } else {
                                    function2M1042getLambda3$material3_release = function4;
                                }
                                if (i18 != 0) {
                                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                                } else {
                                    function2M1043getLambda4$material3_release = function8;
                                }
                                if (i20 != 0) {
                                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                                } else {
                                    iM1110getEndERTFSPs = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                                } else {
                                    i23 = i13;
                                    jM954getBackground0d7_KjU = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                    modifier2 = modifier2;
                                } else {
                                    i24 = i23;
                                    contentWindowInsets = windowInsets;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                            }
                            int i216 = i24 >> 12;
                            SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i216 & 896) | (i216 & 7168), 114);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            windowInsets2 = contentWindowInsets;
                            j12 = jM1014contentColorForek8zF_U;
                            j13 = jM954getBackground0d7_KjU;
                            function9 = function2M1041getLambda2$material3_release;
                            function10 = function2M1042getLambda3$material3_release;
                            function11 = function2M1043getLambda4$material3_release;
                            function6 = function2M1040getLambda1$material3_release;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i28 != 0) {
                                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                                } else {
                                    function2M1040getLambda1$material3_release = function6;
                                }
                                if (i14 != 0) {
                                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                                } else {
                                    function2M1041getLambda2$material3_release = function7;
                                }
                                if (i16 != 0) {
                                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                                } else {
                                    function2M1042getLambda3$material3_release = function4;
                                }
                                if (i18 != 0) {
                                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                                } else {
                                    function2M1043getLambda4$material3_release = function8;
                                }
                                if (i20 != 0) {
                                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                                } else {
                                    iM1110getEndERTFSPs = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                                } else {
                                    i23 = i13;
                                    jM954getBackground0d7_KjU = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                    modifier2 = modifier2;
                                } else {
                                    i24 = i23;
                                    contentWindowInsets = windowInsets;
                                }
                            } else {
                                if (i27 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i28 != 0) {
                                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                                } else {
                                    function2M1040getLambda1$material3_release = function6;
                                }
                                if (i14 != 0) {
                                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                                } else {
                                    function2M1041getLambda2$material3_release = function7;
                                }
                                if (i16 != 0) {
                                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                                } else {
                                    function2M1042getLambda3$material3_release = function4;
                                }
                                if (i18 != 0) {
                                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                                } else {
                                    function2M1043getLambda4$material3_release = function8;
                                }
                                if (i20 != 0) {
                                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                                } else {
                                    iM1110getEndERTFSPs = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                                } else {
                                    i23 = i13;
                                    jM954getBackground0d7_KjU = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                    modifier2 = modifier2;
                                } else {
                                    i24 = i23;
                                    contentWindowInsets = windowInsets;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                            }
                            int i217 = i24 >> 12;
                            SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i217 & 896) | (i217 & 7168), 114);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            windowInsets2 = contentWindowInsets;
                            j12 = jM1014contentColorForek8zF_U;
                            j13 = jM954getBackground0d7_KjU;
                            function9 = function2M1041getLambda2$material3_release;
                            function10 = function2M1042getLambda3$material3_release;
                            function11 = function2M1043getLambda4$material3_release;
                            function6 = function2M1040getLambda1$material3_release;
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
                    }
                    i22 = 805306368;
                    i13 |= i22;
                    if ((1533916891 & i13) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        } else {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                        }
                        int i218 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i218 & 896) | (i218 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets2 = contentWindowInsets;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = jM954getBackground0d7_KjU;
                        function9 = function2M1041getLambda2$material3_release;
                        function10 = function2M1042getLambda3$material3_release;
                        function11 = function2M1043getLambda4$material3_release;
                        function6 = function2M1040getLambda1$material3_release;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        } else {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                        }
                        int i219 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i219 & 896) | (i219 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets2 = contentWindowInsets;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = jM954getBackground0d7_KjU;
                        function9 = function2M1041getLambda2$material3_release;
                        function10 = function2M1042getLambda3$material3_release;
                        function11 = function2M1043getLambda4$material3_release;
                        function6 = function2M1040getLambda1$material3_release;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
                }
                i13 |= 24576;
                function8 = function5;
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i11 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 3670016) != 0) {
                    if ((i12 & 64) == 0) {
                        i26 = 524288;
                    } else {
                        i26 = 524288;
                    }
                    i13 |= i26;
                }
                if ((i11 & 29360128) == 0) {
                    jM1014contentColorForek8zF_U = j11;
                    if ((i12 & 128) == 0) {
                        i25 = 4194304;
                    } else {
                        i25 = 4194304;
                    }
                    i13 |= i25;
                } else {
                    jM1014contentColorForek8zF_U = j11;
                }
                if ((234881024 & i11) != 0) {
                    i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(windowInsets)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                }
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i11) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i22 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i22 = 268435456;
                        }
                    }
                    if ((1533916891 & i13) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        } else {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                        }
                        int i2110 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i2110 & 896) | (i2110 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets2 = contentWindowInsets;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = jM954getBackground0d7_KjU;
                        function9 = function2M1041getLambda2$material3_release;
                        function10 = function2M1042getLambda3$material3_release;
                        function11 = function2M1043getLambda4$material3_release;
                        function6 = function2M1040getLambda1$material3_release;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        } else {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                        }
                        int i2111 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i2111 & 896) | (i2111 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets2 = contentWindowInsets;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = jM954getBackground0d7_KjU;
                        function9 = function2M1041getLambda2$material3_release;
                        function10 = function2M1042getLambda3$material3_release;
                        function11 = function2M1043getLambda4$material3_release;
                        function6 = function2M1040getLambda1$material3_release;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
                }
                i22 = 805306368;
                i13 |= i22;
                if ((1533916891 & i13) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                    }
                    int i2112 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i2112 & 896) | (i2112 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = contentWindowInsets;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = jM954getBackground0d7_KjU;
                    function9 = function2M1041getLambda2$material3_release;
                    function10 = function2M1042getLambda3$material3_release;
                    function11 = function2M1043getLambda4$material3_release;
                    function6 = function2M1040getLambda1$material3_release;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                    }
                    int i2113 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i2113 & 896) | (i2113 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = contentWindowInsets;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = jM954getBackground0d7_KjU;
                    function9 = function2M1041getLambda2$material3_release;
                    function10 = function2M1042getLambda3$material3_release;
                    function11 = function2M1043getLambda4$material3_release;
                    function6 = function2M1040getLambda1$material3_release;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
            }
            i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            function7 = function3;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((57344 & i11) == 0) {
                        function8 = function5;
                        if (composerStartRestartGroup.changedInstance(function8)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 32;
                    if (i20 != 0) {
                        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i11 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(i10)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    if ((i11 & 3670016) != 0) {
                        if ((i12 & 64) == 0) {
                            i26 = 524288;
                        } else {
                            i26 = 524288;
                        }
                        i13 |= i26;
                    }
                    if ((i11 & 29360128) == 0) {
                        jM1014contentColorForek8zF_U = j11;
                        if ((i12 & 128) == 0) {
                            i25 = 4194304;
                        } else {
                            i25 = 4194304;
                        }
                        i13 |= i25;
                    } else {
                        jM1014contentColorForek8zF_U = j11;
                    }
                    if ((234881024 & i11) != 0) {
                        i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(windowInsets)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    if ((i12 & 512) != 0) {
                        if ((1879048192 & i11) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i22 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i22 = 268435456;
                            }
                        }
                        if ((1533916891 & i13) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i28 != 0) {
                                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                                } else {
                                    function2M1040getLambda1$material3_release = function6;
                                }
                                if (i14 != 0) {
                                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                                } else {
                                    function2M1041getLambda2$material3_release = function7;
                                }
                                if (i16 != 0) {
                                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                                } else {
                                    function2M1042getLambda3$material3_release = function4;
                                }
                                if (i18 != 0) {
                                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                                } else {
                                    function2M1043getLambda4$material3_release = function8;
                                }
                                if (i20 != 0) {
                                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                                } else {
                                    iM1110getEndERTFSPs = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                                } else {
                                    i23 = i13;
                                    jM954getBackground0d7_KjU = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                    modifier2 = modifier2;
                                } else {
                                    i24 = i23;
                                    contentWindowInsets = windowInsets;
                                }
                            } else {
                                if (i27 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i28 != 0) {
                                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                                } else {
                                    function2M1040getLambda1$material3_release = function6;
                                }
                                if (i14 != 0) {
                                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                                } else {
                                    function2M1041getLambda2$material3_release = function7;
                                }
                                if (i16 != 0) {
                                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                                } else {
                                    function2M1042getLambda3$material3_release = function4;
                                }
                                if (i18 != 0) {
                                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                                } else {
                                    function2M1043getLambda4$material3_release = function8;
                                }
                                if (i20 != 0) {
                                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                                } else {
                                    iM1110getEndERTFSPs = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                                } else {
                                    i23 = i13;
                                    jM954getBackground0d7_KjU = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                    modifier2 = modifier2;
                                } else {
                                    i24 = i23;
                                    contentWindowInsets = windowInsets;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                            }
                            int i2114 = i24 >> 12;
                            SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i2114 & 896) | (i2114 & 7168), 114);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            windowInsets2 = contentWindowInsets;
                            j12 = jM1014contentColorForek8zF_U;
                            j13 = jM954getBackground0d7_KjU;
                            function9 = function2M1041getLambda2$material3_release;
                            function10 = function2M1042getLambda3$material3_release;
                            function11 = function2M1043getLambda4$material3_release;
                            function6 = function2M1040getLambda1$material3_release;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i28 != 0) {
                                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                                } else {
                                    function2M1040getLambda1$material3_release = function6;
                                }
                                if (i14 != 0) {
                                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                                } else {
                                    function2M1041getLambda2$material3_release = function7;
                                }
                                if (i16 != 0) {
                                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                                } else {
                                    function2M1042getLambda3$material3_release = function4;
                                }
                                if (i18 != 0) {
                                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                                } else {
                                    function2M1043getLambda4$material3_release = function8;
                                }
                                if (i20 != 0) {
                                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                                } else {
                                    iM1110getEndERTFSPs = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                                } else {
                                    i23 = i13;
                                    jM954getBackground0d7_KjU = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                    modifier2 = modifier2;
                                } else {
                                    i24 = i23;
                                    contentWindowInsets = windowInsets;
                                }
                            } else {
                                if (i27 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i28 != 0) {
                                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                                } else {
                                    function2M1040getLambda1$material3_release = function6;
                                }
                                if (i14 != 0) {
                                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                                } else {
                                    function2M1041getLambda2$material3_release = function7;
                                }
                                if (i16 != 0) {
                                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                                } else {
                                    function2M1042getLambda3$material3_release = function4;
                                }
                                if (i18 != 0) {
                                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                                } else {
                                    function2M1043getLambda4$material3_release = function8;
                                }
                                if (i20 != 0) {
                                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                                } else {
                                    iM1110getEndERTFSPs = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                                } else {
                                    i23 = i13;
                                    jM954getBackground0d7_KjU = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                    modifier2 = modifier2;
                                } else {
                                    i24 = i23;
                                    contentWindowInsets = windowInsets;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                            }
                            int i2115 = i24 >> 12;
                            SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i2115 & 896) | (i2115 & 7168), 114);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            windowInsets2 = contentWindowInsets;
                            j12 = jM1014contentColorForek8zF_U;
                            j13 = jM954getBackground0d7_KjU;
                            function9 = function2M1041getLambda2$material3_release;
                            function10 = function2M1042getLambda3$material3_release;
                            function11 = function2M1043getLambda4$material3_release;
                            function6 = function2M1040getLambda1$material3_release;
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
                    }
                    i22 = 805306368;
                    i13 |= i22;
                    if ((1533916891 & i13) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        } else {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                        }
                        int i2116 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i2116 & 896) | (i2116 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets2 = contentWindowInsets;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = jM954getBackground0d7_KjU;
                        function9 = function2M1041getLambda2$material3_release;
                        function10 = function2M1042getLambda3$material3_release;
                        function11 = function2M1043getLambda4$material3_release;
                        function6 = function2M1040getLambda1$material3_release;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        } else {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                        }
                        int i2117 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i2117 & 896) | (i2117 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets2 = contentWindowInsets;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = jM954getBackground0d7_KjU;
                        function9 = function2M1041getLambda2$material3_release;
                        function10 = function2M1042getLambda3$material3_release;
                        function11 = function2M1043getLambda4$material3_release;
                        function6 = function2M1040getLambda1$material3_release;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
                }
                i13 |= 24576;
                function8 = function5;
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i11 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 3670016) != 0) {
                    if ((i12 & 64) == 0) {
                        i26 = 524288;
                    } else {
                        i26 = 524288;
                    }
                    i13 |= i26;
                }
                if ((i11 & 29360128) == 0) {
                    jM1014contentColorForek8zF_U = j11;
                    if ((i12 & 128) == 0) {
                        i25 = 4194304;
                    } else {
                        i25 = 4194304;
                    }
                    i13 |= i25;
                } else {
                    jM1014contentColorForek8zF_U = j11;
                }
                if ((234881024 & i11) != 0) {
                    i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(windowInsets)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                }
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i11) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i22 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i22 = 268435456;
                        }
                    }
                    if ((1533916891 & i13) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        } else {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                        }
                        int i2118 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i2118 & 896) | (i2118 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets2 = contentWindowInsets;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = jM954getBackground0d7_KjU;
                        function9 = function2M1041getLambda2$material3_release;
                        function10 = function2M1042getLambda3$material3_release;
                        function11 = function2M1043getLambda4$material3_release;
                        function6 = function2M1040getLambda1$material3_release;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        } else {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                        }
                        int i2119 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i2119 & 896) | (i2119 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets2 = contentWindowInsets;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = jM954getBackground0d7_KjU;
                        function9 = function2M1041getLambda2$material3_release;
                        function10 = function2M1042getLambda3$material3_release;
                        function11 = function2M1043getLambda4$material3_release;
                        function6 = function2M1040getLambda1$material3_release;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
                }
                i22 = 805306368;
                i13 |= i22;
                if ((1533916891 & i13) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                    }
                    int i21110 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i21110 & 896) | (i21110 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = contentWindowInsets;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = jM954getBackground0d7_KjU;
                    function9 = function2M1041getLambda2$material3_release;
                    function10 = function2M1042getLambda3$material3_release;
                    function11 = function2M1043getLambda4$material3_release;
                    function6 = function2M1040getLambda1$material3_release;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                    }
                    int i21111 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i21111 & 896) | (i21111 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = contentWindowInsets;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = jM954getBackground0d7_KjU;
                    function9 = function2M1041getLambda2$material3_release;
                    function10 = function2M1042getLambda3$material3_release;
                    function11 = function2M1043getLambda4$material3_release;
                    function6 = function2M1040getLambda1$material3_release;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
            }
            i13 |= 3072;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((57344 & i11) == 0) {
                    function8 = function5;
                    if (composerStartRestartGroup.changedInstance(function8)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i11 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 3670016) != 0) {
                    if ((i12 & 64) == 0) {
                        i26 = 524288;
                    } else {
                        i26 = 524288;
                    }
                    i13 |= i26;
                }
                if ((i11 & 29360128) == 0) {
                    jM1014contentColorForek8zF_U = j11;
                    if ((i12 & 128) == 0) {
                        i25 = 4194304;
                    } else {
                        i25 = 4194304;
                    }
                    i13 |= i25;
                } else {
                    jM1014contentColorForek8zF_U = j11;
                }
                if ((234881024 & i11) != 0) {
                    i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(windowInsets)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                }
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i11) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i22 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i22 = 268435456;
                        }
                    }
                    if ((1533916891 & i13) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        } else {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                        }
                        int i21112 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i21112 & 896) | (i21112 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets2 = contentWindowInsets;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = jM954getBackground0d7_KjU;
                        function9 = function2M1041getLambda2$material3_release;
                        function10 = function2M1042getLambda3$material3_release;
                        function11 = function2M1043getLambda4$material3_release;
                        function6 = function2M1040getLambda1$material3_release;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        } else {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                        }
                        int i21113 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i21113 & 896) | (i21113 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets2 = contentWindowInsets;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = jM954getBackground0d7_KjU;
                        function9 = function2M1041getLambda2$material3_release;
                        function10 = function2M1042getLambda3$material3_release;
                        function11 = function2M1043getLambda4$material3_release;
                        function6 = function2M1040getLambda1$material3_release;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
                }
                i22 = 805306368;
                i13 |= i22;
                if ((1533916891 & i13) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                    }
                    int i21114 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i21114 & 896) | (i21114 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = contentWindowInsets;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = jM954getBackground0d7_KjU;
                    function9 = function2M1041getLambda2$material3_release;
                    function10 = function2M1042getLambda3$material3_release;
                    function11 = function2M1043getLambda4$material3_release;
                    function6 = function2M1040getLambda1$material3_release;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                    }
                    int i21115 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i21115 & 896) | (i21115 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = contentWindowInsets;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = jM954getBackground0d7_KjU;
                    function9 = function2M1041getLambda2$material3_release;
                    function10 = function2M1042getLambda3$material3_release;
                    function11 = function2M1043getLambda4$material3_release;
                    function6 = function2M1040getLambda1$material3_release;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
            }
            i13 |= 24576;
            function8 = function5;
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i11 & 458752) == 0) {
                if (composerStartRestartGroup.changed(i10)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((i11 & 3670016) != 0) {
                if ((i12 & 64) == 0) {
                    i26 = 524288;
                } else {
                    i26 = 524288;
                }
                i13 |= i26;
            }
            if ((i11 & 29360128) == 0) {
                jM1014contentColorForek8zF_U = j11;
                if ((i12 & 128) == 0) {
                    i25 = 4194304;
                } else {
                    i25 = 4194304;
                }
                i13 |= i25;
            } else {
                jM1014contentColorForek8zF_U = j11;
            }
            if ((234881024 & i11) != 0) {
                i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(windowInsets)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            }
            if ((i12 & 512) != 0) {
                if ((1879048192 & i11) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i22 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i22 = 268435456;
                    }
                }
                if ((1533916891 & i13) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                    }
                    int i21116 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i21116 & 896) | (i21116 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = contentWindowInsets;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = jM954getBackground0d7_KjU;
                    function9 = function2M1041getLambda2$material3_release;
                    function10 = function2M1042getLambda3$material3_release;
                    function11 = function2M1043getLambda4$material3_release;
                    function6 = function2M1040getLambda1$material3_release;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                    }
                    int i21117 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i21117 & 896) | (i21117 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = contentWindowInsets;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = jM954getBackground0d7_KjU;
                    function9 = function2M1041getLambda2$material3_release;
                    function10 = function2M1042getLambda3$material3_release;
                    function11 = function2M1043getLambda4$material3_release;
                    function6 = function2M1040getLambda1$material3_release;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
            }
            i22 = 805306368;
            i13 |= i22;
            if ((1533916891 & i13) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i28 != 0) {
                        function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                    } else {
                        function2M1040getLambda1$material3_release = function6;
                    }
                    if (i14 != 0) {
                        function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                    } else {
                        function2M1041getLambda2$material3_release = function7;
                    }
                    if (i16 != 0) {
                        function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                    } else {
                        function2M1042getLambda3$material3_release = function4;
                    }
                    if (i18 != 0) {
                        function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                    } else {
                        function2M1043getLambda4$material3_release = function8;
                    }
                    if (i20 != 0) {
                        iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                    } else {
                        iM1110getEndERTFSPs = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                    } else {
                        i23 = i13;
                        jM954getBackground0d7_KjU = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                        modifier2 = modifier2;
                    } else {
                        i24 = i23;
                        contentWindowInsets = windowInsets;
                    }
                } else {
                    if (i27 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i28 != 0) {
                        function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                    } else {
                        function2M1040getLambda1$material3_release = function6;
                    }
                    if (i14 != 0) {
                        function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                    } else {
                        function2M1041getLambda2$material3_release = function7;
                    }
                    if (i16 != 0) {
                        function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                    } else {
                        function2M1042getLambda3$material3_release = function4;
                    }
                    if (i18 != 0) {
                        function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                    } else {
                        function2M1043getLambda4$material3_release = function8;
                    }
                    if (i20 != 0) {
                        iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                    } else {
                        iM1110getEndERTFSPs = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                    } else {
                        i23 = i13;
                        jM954getBackground0d7_KjU = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                        modifier2 = modifier2;
                    } else {
                        i24 = i23;
                        contentWindowInsets = windowInsets;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                }
                int i21118 = i24 >> 12;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i21118 & 896) | (i21118 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                windowInsets2 = contentWindowInsets;
                j12 = jM1014contentColorForek8zF_U;
                j13 = jM954getBackground0d7_KjU;
                function9 = function2M1041getLambda2$material3_release;
                function10 = function2M1042getLambda3$material3_release;
                function11 = function2M1043getLambda4$material3_release;
                function6 = function2M1040getLambda1$material3_release;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i28 != 0) {
                        function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                    } else {
                        function2M1040getLambda1$material3_release = function6;
                    }
                    if (i14 != 0) {
                        function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                    } else {
                        function2M1041getLambda2$material3_release = function7;
                    }
                    if (i16 != 0) {
                        function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                    } else {
                        function2M1042getLambda3$material3_release = function4;
                    }
                    if (i18 != 0) {
                        function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                    } else {
                        function2M1043getLambda4$material3_release = function8;
                    }
                    if (i20 != 0) {
                        iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                    } else {
                        iM1110getEndERTFSPs = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                    } else {
                        i23 = i13;
                        jM954getBackground0d7_KjU = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                        modifier2 = modifier2;
                    } else {
                        i24 = i23;
                        contentWindowInsets = windowInsets;
                    }
                } else {
                    if (i27 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i28 != 0) {
                        function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                    } else {
                        function2M1040getLambda1$material3_release = function6;
                    }
                    if (i14 != 0) {
                        function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                    } else {
                        function2M1041getLambda2$material3_release = function7;
                    }
                    if (i16 != 0) {
                        function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                    } else {
                        function2M1042getLambda3$material3_release = function4;
                    }
                    if (i18 != 0) {
                        function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                    } else {
                        function2M1043getLambda4$material3_release = function8;
                    }
                    if (i20 != 0) {
                        iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                    } else {
                        iM1110getEndERTFSPs = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                    } else {
                        i23 = i13;
                        jM954getBackground0d7_KjU = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                        modifier2 = modifier2;
                    } else {
                        i24 = i23;
                        contentWindowInsets = windowInsets;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                }
                int i21119 = i24 >> 12;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i21119 & 896) | (i21119 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                windowInsets2 = contentWindowInsets;
                j12 = jM1014contentColorForek8zF_U;
                j13 = jM954getBackground0d7_KjU;
                function9 = function2M1041getLambda2$material3_release;
                function10 = function2M1042getLambda3$material3_release;
                function11 = function2M1043getLambda4$material3_release;
                function6 = function2M1040getLambda1$material3_release;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
        }
        i13 |= 48;
        function6 = function2;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i11 & 896) == 0) {
                function7 = function3;
                if (composerStartRestartGroup.changedInstance(function7)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i11 & 7168) == 0) {
                    if (composerStartRestartGroup.changedInstance(function4)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                i18 = i12 & 16;
                if (i18 != 0) {
                    if ((57344 & i11) == 0) {
                        function8 = function5;
                        if (composerStartRestartGroup.changedInstance(function8)) {
                            i19 = 16384;
                        } else {
                            i19 = 8192;
                        }
                        i13 |= i19;
                    }
                    i20 = i12 & 32;
                    if (i20 != 0) {
                        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i11 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(i10)) {
                            i21 = 131072;
                        } else {
                            i21 = 65536;
                        }
                        i13 |= i21;
                    }
                    if ((i11 & 3670016) != 0) {
                        if ((i12 & 64) == 0) {
                            i26 = 524288;
                        } else {
                            i26 = 524288;
                        }
                        i13 |= i26;
                    }
                    if ((i11 & 29360128) == 0) {
                        jM1014contentColorForek8zF_U = j11;
                        if ((i12 & 128) == 0) {
                            i25 = 4194304;
                        } else {
                            i25 = 4194304;
                        }
                        i13 |= i25;
                    } else {
                        jM1014contentColorForek8zF_U = j11;
                    }
                    if ((234881024 & i11) != 0) {
                        i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(windowInsets)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    }
                    if ((i12 & 512) != 0) {
                        if ((1879048192 & i11) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i22 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i22 = 268435456;
                            }
                        }
                        if ((1533916891 & i13) == 306783378) {
                            composerStartRestartGroup.startDefaults();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i28 != 0) {
                                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                                } else {
                                    function2M1040getLambda1$material3_release = function6;
                                }
                                if (i14 != 0) {
                                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                                } else {
                                    function2M1041getLambda2$material3_release = function7;
                                }
                                if (i16 != 0) {
                                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                                } else {
                                    function2M1042getLambda3$material3_release = function4;
                                }
                                if (i18 != 0) {
                                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                                } else {
                                    function2M1043getLambda4$material3_release = function8;
                                }
                                if (i20 != 0) {
                                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                                } else {
                                    iM1110getEndERTFSPs = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                                } else {
                                    i23 = i13;
                                    jM954getBackground0d7_KjU = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                    modifier2 = modifier2;
                                } else {
                                    i24 = i23;
                                    contentWindowInsets = windowInsets;
                                }
                            } else {
                                if (i27 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i28 != 0) {
                                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                                } else {
                                    function2M1040getLambda1$material3_release = function6;
                                }
                                if (i14 != 0) {
                                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                                } else {
                                    function2M1041getLambda2$material3_release = function7;
                                }
                                if (i16 != 0) {
                                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                                } else {
                                    function2M1042getLambda3$material3_release = function4;
                                }
                                if (i18 != 0) {
                                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                                } else {
                                    function2M1043getLambda4$material3_release = function8;
                                }
                                if (i20 != 0) {
                                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                                } else {
                                    iM1110getEndERTFSPs = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                                } else {
                                    i23 = i13;
                                    jM954getBackground0d7_KjU = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                    modifier2 = modifier2;
                                } else {
                                    i24 = i23;
                                    contentWindowInsets = windowInsets;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                            }
                            int i211110 = i24 >> 12;
                            SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i211110 & 896) | (i211110 & 7168), 114);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            windowInsets2 = contentWindowInsets;
                            j12 = jM1014contentColorForek8zF_U;
                            j13 = jM954getBackground0d7_KjU;
                            function9 = function2M1041getLambda2$material3_release;
                            function10 = function2M1042getLambda3$material3_release;
                            function11 = function2M1043getLambda4$material3_release;
                            function6 = function2M1040getLambda1$material3_release;
                            modifier3 = modifier2;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i11 & 1) != 0) {
                                if (i27 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i28 != 0) {
                                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                                } else {
                                    function2M1040getLambda1$material3_release = function6;
                                }
                                if (i14 != 0) {
                                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                                } else {
                                    function2M1041getLambda2$material3_release = function7;
                                }
                                if (i16 != 0) {
                                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                                } else {
                                    function2M1042getLambda3$material3_release = function4;
                                }
                                if (i18 != 0) {
                                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                                } else {
                                    function2M1043getLambda4$material3_release = function8;
                                }
                                if (i20 != 0) {
                                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                                } else {
                                    iM1110getEndERTFSPs = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                                } else {
                                    i23 = i13;
                                    jM954getBackground0d7_KjU = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                    modifier2 = modifier2;
                                } else {
                                    i24 = i23;
                                    contentWindowInsets = windowInsets;
                                }
                            } else {
                                if (i27 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                } else {
                                    modifier2 = modifier;
                                }
                                if (i28 != 0) {
                                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                                } else {
                                    function2M1040getLambda1$material3_release = function6;
                                }
                                if (i14 != 0) {
                                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                                } else {
                                    function2M1041getLambda2$material3_release = function7;
                                }
                                if (i16 != 0) {
                                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                                } else {
                                    function2M1042getLambda3$material3_release = function4;
                                }
                                if (i18 != 0) {
                                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                                } else {
                                    function2M1043getLambda4$material3_release = function8;
                                }
                                if (i20 != 0) {
                                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                                } else {
                                    iM1110getEndERTFSPs = i10;
                                }
                                if ((i12 & 64) != 0) {
                                    i23 = i13 & (-3670017);
                                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                                } else {
                                    i23 = i13;
                                    jM954getBackground0d7_KjU = j10;
                                }
                                if ((i12 & 128) != 0) {
                                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                    i23 &= -29360129;
                                }
                                if ((i12 & 256) != 0) {
                                    i24 = i23 & (-234881025);
                                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                    modifier2 = modifier2;
                                } else {
                                    i24 = i23;
                                    contentWindowInsets = windowInsets;
                                }
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                            }
                            int i211111 = i24 >> 12;
                            SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i211111 & 896) | (i211111 & 7168), 114);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            windowInsets2 = contentWindowInsets;
                            j12 = jM1014contentColorForek8zF_U;
                            j13 = jM954getBackground0d7_KjU;
                            function9 = function2M1041getLambda2$material3_release;
                            function10 = function2M1042getLambda3$material3_release;
                            function11 = function2M1043getLambda4$material3_release;
                            function6 = function2M1040getLambda1$material3_release;
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
                    }
                    i22 = 805306368;
                    i13 |= i22;
                    if ((1533916891 & i13) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        } else {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                        }
                        int i211112 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i211112 & 896) | (i211112 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets2 = contentWindowInsets;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = jM954getBackground0d7_KjU;
                        function9 = function2M1041getLambda2$material3_release;
                        function10 = function2M1042getLambda3$material3_release;
                        function11 = function2M1043getLambda4$material3_release;
                        function6 = function2M1040getLambda1$material3_release;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        } else {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                        }
                        int i211113 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i211113 & 896) | (i211113 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets2 = contentWindowInsets;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = jM954getBackground0d7_KjU;
                        function9 = function2M1041getLambda2$material3_release;
                        function10 = function2M1042getLambda3$material3_release;
                        function11 = function2M1043getLambda4$material3_release;
                        function6 = function2M1040getLambda1$material3_release;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
                }
                i13 |= 24576;
                function8 = function5;
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i11 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 3670016) != 0) {
                    if ((i12 & 64) == 0) {
                        i26 = 524288;
                    } else {
                        i26 = 524288;
                    }
                    i13 |= i26;
                }
                if ((i11 & 29360128) == 0) {
                    jM1014contentColorForek8zF_U = j11;
                    if ((i12 & 128) == 0) {
                        i25 = 4194304;
                    } else {
                        i25 = 4194304;
                    }
                    i13 |= i25;
                } else {
                    jM1014contentColorForek8zF_U = j11;
                }
                if ((234881024 & i11) != 0) {
                    i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(windowInsets)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                }
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i11) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i22 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i22 = 268435456;
                        }
                    }
                    if ((1533916891 & i13) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        } else {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                        }
                        int i211114 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i211114 & 896) | (i211114 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets2 = contentWindowInsets;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = jM954getBackground0d7_KjU;
                        function9 = function2M1041getLambda2$material3_release;
                        function10 = function2M1042getLambda3$material3_release;
                        function11 = function2M1043getLambda4$material3_release;
                        function6 = function2M1040getLambda1$material3_release;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        } else {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                        }
                        int i211115 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i211115 & 896) | (i211115 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets2 = contentWindowInsets;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = jM954getBackground0d7_KjU;
                        function9 = function2M1041getLambda2$material3_release;
                        function10 = function2M1042getLambda3$material3_release;
                        function11 = function2M1043getLambda4$material3_release;
                        function6 = function2M1040getLambda1$material3_release;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
                }
                i22 = 805306368;
                i13 |= i22;
                if ((1533916891 & i13) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                    }
                    int i211116 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i211116 & 896) | (i211116 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = contentWindowInsets;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = jM954getBackground0d7_KjU;
                    function9 = function2M1041getLambda2$material3_release;
                    function10 = function2M1042getLambda3$material3_release;
                    function11 = function2M1043getLambda4$material3_release;
                    function6 = function2M1040getLambda1$material3_release;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                    }
                    int i211117 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i211117 & 896) | (i211117 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = contentWindowInsets;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = jM954getBackground0d7_KjU;
                    function9 = function2M1041getLambda2$material3_release;
                    function10 = function2M1042getLambda3$material3_release;
                    function11 = function2M1043getLambda4$material3_release;
                    function6 = function2M1040getLambda1$material3_release;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
            }
            i13 |= 3072;
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((57344 & i11) == 0) {
                    function8 = function5;
                    if (composerStartRestartGroup.changedInstance(function8)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i11 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 3670016) != 0) {
                    if ((i12 & 64) == 0) {
                        i26 = 524288;
                    } else {
                        i26 = 524288;
                    }
                    i13 |= i26;
                }
                if ((i11 & 29360128) == 0) {
                    jM1014contentColorForek8zF_U = j11;
                    if ((i12 & 128) == 0) {
                        i25 = 4194304;
                    } else {
                        i25 = 4194304;
                    }
                    i13 |= i25;
                } else {
                    jM1014contentColorForek8zF_U = j11;
                }
                if ((234881024 & i11) != 0) {
                    i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(windowInsets)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                }
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i11) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i22 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i22 = 268435456;
                        }
                    }
                    if ((1533916891 & i13) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        } else {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                        }
                        int i211118 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i211118 & 896) | (i211118 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets2 = contentWindowInsets;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = jM954getBackground0d7_KjU;
                        function9 = function2M1041getLambda2$material3_release;
                        function10 = function2M1042getLambda3$material3_release;
                        function11 = function2M1043getLambda4$material3_release;
                        function6 = function2M1040getLambda1$material3_release;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        } else {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                        }
                        int i211119 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i211119 & 896) | (i211119 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets2 = contentWindowInsets;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = jM954getBackground0d7_KjU;
                        function9 = function2M1041getLambda2$material3_release;
                        function10 = function2M1042getLambda3$material3_release;
                        function11 = function2M1043getLambda4$material3_release;
                        function6 = function2M1040getLambda1$material3_release;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
                }
                i22 = 805306368;
                i13 |= i22;
                if ((1533916891 & i13) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                    }
                    int i2111110 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i2111110 & 896) | (i2111110 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = contentWindowInsets;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = jM954getBackground0d7_KjU;
                    function9 = function2M1041getLambda2$material3_release;
                    function10 = function2M1042getLambda3$material3_release;
                    function11 = function2M1043getLambda4$material3_release;
                    function6 = function2M1040getLambda1$material3_release;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                    }
                    int i2111111 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i2111111 & 896) | (i2111111 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = contentWindowInsets;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = jM954getBackground0d7_KjU;
                    function9 = function2M1041getLambda2$material3_release;
                    function10 = function2M1042getLambda3$material3_release;
                    function11 = function2M1043getLambda4$material3_release;
                    function6 = function2M1040getLambda1$material3_release;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
            }
            i13 |= 24576;
            function8 = function5;
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i11 & 458752) == 0) {
                if (composerStartRestartGroup.changed(i10)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((i11 & 3670016) != 0) {
                if ((i12 & 64) == 0) {
                    i26 = 524288;
                } else {
                    i26 = 524288;
                }
                i13 |= i26;
            }
            if ((i11 & 29360128) == 0) {
                jM1014contentColorForek8zF_U = j11;
                if ((i12 & 128) == 0) {
                    i25 = 4194304;
                } else {
                    i25 = 4194304;
                }
                i13 |= i25;
            } else {
                jM1014contentColorForek8zF_U = j11;
            }
            if ((234881024 & i11) != 0) {
                i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(windowInsets)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            }
            if ((i12 & 512) != 0) {
                if ((1879048192 & i11) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i22 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i22 = 268435456;
                    }
                }
                if ((1533916891 & i13) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                    }
                    int i2111112 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i2111112 & 896) | (i2111112 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = contentWindowInsets;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = jM954getBackground0d7_KjU;
                    function9 = function2M1041getLambda2$material3_release;
                    function10 = function2M1042getLambda3$material3_release;
                    function11 = function2M1043getLambda4$material3_release;
                    function6 = function2M1040getLambda1$material3_release;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                    }
                    int i2111113 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i2111113 & 896) | (i2111113 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = contentWindowInsets;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = jM954getBackground0d7_KjU;
                    function9 = function2M1041getLambda2$material3_release;
                    function10 = function2M1042getLambda3$material3_release;
                    function11 = function2M1043getLambda4$material3_release;
                    function6 = function2M1040getLambda1$material3_release;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
            }
            i22 = 805306368;
            i13 |= i22;
            if ((1533916891 & i13) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i28 != 0) {
                        function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                    } else {
                        function2M1040getLambda1$material3_release = function6;
                    }
                    if (i14 != 0) {
                        function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                    } else {
                        function2M1041getLambda2$material3_release = function7;
                    }
                    if (i16 != 0) {
                        function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                    } else {
                        function2M1042getLambda3$material3_release = function4;
                    }
                    if (i18 != 0) {
                        function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                    } else {
                        function2M1043getLambda4$material3_release = function8;
                    }
                    if (i20 != 0) {
                        iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                    } else {
                        iM1110getEndERTFSPs = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                    } else {
                        i23 = i13;
                        jM954getBackground0d7_KjU = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                        modifier2 = modifier2;
                    } else {
                        i24 = i23;
                        contentWindowInsets = windowInsets;
                    }
                } else {
                    if (i27 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i28 != 0) {
                        function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                    } else {
                        function2M1040getLambda1$material3_release = function6;
                    }
                    if (i14 != 0) {
                        function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                    } else {
                        function2M1041getLambda2$material3_release = function7;
                    }
                    if (i16 != 0) {
                        function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                    } else {
                        function2M1042getLambda3$material3_release = function4;
                    }
                    if (i18 != 0) {
                        function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                    } else {
                        function2M1043getLambda4$material3_release = function8;
                    }
                    if (i20 != 0) {
                        iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                    } else {
                        iM1110getEndERTFSPs = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                    } else {
                        i23 = i13;
                        jM954getBackground0d7_KjU = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                        modifier2 = modifier2;
                    } else {
                        i24 = i23;
                        contentWindowInsets = windowInsets;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                }
                int i2111114 = i24 >> 12;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i2111114 & 896) | (i2111114 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                windowInsets2 = contentWindowInsets;
                j12 = jM1014contentColorForek8zF_U;
                j13 = jM954getBackground0d7_KjU;
                function9 = function2M1041getLambda2$material3_release;
                function10 = function2M1042getLambda3$material3_release;
                function11 = function2M1043getLambda4$material3_release;
                function6 = function2M1040getLambda1$material3_release;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i28 != 0) {
                        function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                    } else {
                        function2M1040getLambda1$material3_release = function6;
                    }
                    if (i14 != 0) {
                        function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                    } else {
                        function2M1041getLambda2$material3_release = function7;
                    }
                    if (i16 != 0) {
                        function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                    } else {
                        function2M1042getLambda3$material3_release = function4;
                    }
                    if (i18 != 0) {
                        function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                    } else {
                        function2M1043getLambda4$material3_release = function8;
                    }
                    if (i20 != 0) {
                        iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                    } else {
                        iM1110getEndERTFSPs = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                    } else {
                        i23 = i13;
                        jM954getBackground0d7_KjU = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                        modifier2 = modifier2;
                    } else {
                        i24 = i23;
                        contentWindowInsets = windowInsets;
                    }
                } else {
                    if (i27 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i28 != 0) {
                        function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                    } else {
                        function2M1040getLambda1$material3_release = function6;
                    }
                    if (i14 != 0) {
                        function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                    } else {
                        function2M1041getLambda2$material3_release = function7;
                    }
                    if (i16 != 0) {
                        function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                    } else {
                        function2M1042getLambda3$material3_release = function4;
                    }
                    if (i18 != 0) {
                        function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                    } else {
                        function2M1043getLambda4$material3_release = function8;
                    }
                    if (i20 != 0) {
                        iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                    } else {
                        iM1110getEndERTFSPs = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                    } else {
                        i23 = i13;
                        jM954getBackground0d7_KjU = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                        modifier2 = modifier2;
                    } else {
                        i24 = i23;
                        contentWindowInsets = windowInsets;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                }
                int i2111115 = i24 >> 12;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i2111115 & 896) | (i2111115 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                windowInsets2 = contentWindowInsets;
                j12 = jM1014contentColorForek8zF_U;
                j13 = jM954getBackground0d7_KjU;
                function9 = function2M1041getLambda2$material3_release;
                function10 = function2M1042getLambda3$material3_release;
                function11 = function2M1043getLambda4$material3_release;
                function6 = function2M1040getLambda1$material3_release;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
        }
        i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        function7 = function3;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i11 & 7168) == 0) {
                if (composerStartRestartGroup.changedInstance(function4)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            i18 = i12 & 16;
            if (i18 != 0) {
                if ((57344 & i11) == 0) {
                    function8 = function5;
                    if (composerStartRestartGroup.changedInstance(function8)) {
                        i19 = 16384;
                    } else {
                        i19 = 8192;
                    }
                    i13 |= i19;
                }
                i20 = i12 & 32;
                if (i20 != 0) {
                    i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i11 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(i10)) {
                        i21 = 131072;
                    } else {
                        i21 = 65536;
                    }
                    i13 |= i21;
                }
                if ((i11 & 3670016) != 0) {
                    if ((i12 & 64) == 0) {
                        i26 = 524288;
                    } else {
                        i26 = 524288;
                    }
                    i13 |= i26;
                }
                if ((i11 & 29360128) == 0) {
                    jM1014contentColorForek8zF_U = j11;
                    if ((i12 & 128) == 0) {
                        i25 = 4194304;
                    } else {
                        i25 = 4194304;
                    }
                    i13 |= i25;
                } else {
                    jM1014contentColorForek8zF_U = j11;
                }
                if ((234881024 & i11) != 0) {
                    i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(windowInsets)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                }
                if ((i12 & 512) != 0) {
                    if ((1879048192 & i11) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i22 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i22 = 268435456;
                        }
                    }
                    if ((1533916891 & i13) == 306783378) {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        } else {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                        }
                        int i2111116 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i2111116 & 896) | (i2111116 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets2 = contentWindowInsets;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = jM954getBackground0d7_KjU;
                        function9 = function2M1041getLambda2$material3_release;
                        function10 = function2M1042getLambda3$material3_release;
                        function11 = function2M1043getLambda4$material3_release;
                        function6 = function2M1040getLambda1$material3_release;
                        modifier3 = modifier2;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i11 & 1) != 0) {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        } else {
                            if (i27 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i28 != 0) {
                                function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                            } else {
                                function2M1040getLambda1$material3_release = function6;
                            }
                            if (i14 != 0) {
                                function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                            } else {
                                function2M1041getLambda2$material3_release = function7;
                            }
                            if (i16 != 0) {
                                function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                            } else {
                                function2M1042getLambda3$material3_release = function4;
                            }
                            if (i18 != 0) {
                                function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                            } else {
                                function2M1043getLambda4$material3_release = function8;
                            }
                            if (i20 != 0) {
                                iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                            } else {
                                iM1110getEndERTFSPs = i10;
                            }
                            if ((i12 & 64) != 0) {
                                i23 = i13 & (-3670017);
                                jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                            } else {
                                i23 = i13;
                                jM954getBackground0d7_KjU = j10;
                            }
                            if ((i12 & 128) != 0) {
                                jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                                i23 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i24 = i23 & (-234881025);
                                contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                                modifier2 = modifier2;
                            } else {
                                i24 = i23;
                                contentWindowInsets = windowInsets;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                        }
                        int i2111117 = i24 >> 12;
                        SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i2111117 & 896) | (i2111117 & 7168), 114);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        windowInsets2 = contentWindowInsets;
                        j12 = jM1014contentColorForek8zF_U;
                        j13 = jM954getBackground0d7_KjU;
                        function9 = function2M1041getLambda2$material3_release;
                        function10 = function2M1042getLambda3$material3_release;
                        function11 = function2M1043getLambda4$material3_release;
                        function6 = function2M1040getLambda1$material3_release;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
                }
                i22 = 805306368;
                i13 |= i22;
                if ((1533916891 & i13) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                    }
                    int i2111118 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i2111118 & 896) | (i2111118 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = contentWindowInsets;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = jM954getBackground0d7_KjU;
                    function9 = function2M1041getLambda2$material3_release;
                    function10 = function2M1042getLambda3$material3_release;
                    function11 = function2M1043getLambda4$material3_release;
                    function6 = function2M1040getLambda1$material3_release;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                    }
                    int i2111119 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i2111119 & 896) | (i2111119 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = contentWindowInsets;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = jM954getBackground0d7_KjU;
                    function9 = function2M1041getLambda2$material3_release;
                    function10 = function2M1042getLambda3$material3_release;
                    function11 = function2M1043getLambda4$material3_release;
                    function6 = function2M1040getLambda1$material3_release;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
            }
            i13 |= 24576;
            function8 = function5;
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i11 & 458752) == 0) {
                if (composerStartRestartGroup.changed(i10)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((i11 & 3670016) != 0) {
                if ((i12 & 64) == 0) {
                    i26 = 524288;
                } else {
                    i26 = 524288;
                }
                i13 |= i26;
            }
            if ((i11 & 29360128) == 0) {
                jM1014contentColorForek8zF_U = j11;
                if ((i12 & 128) == 0) {
                    i25 = 4194304;
                } else {
                    i25 = 4194304;
                }
                i13 |= i25;
            } else {
                jM1014contentColorForek8zF_U = j11;
            }
            if ((234881024 & i11) != 0) {
                i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(windowInsets)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            }
            if ((i12 & 512) != 0) {
                if ((1879048192 & i11) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i22 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i22 = 268435456;
                    }
                }
                if ((1533916891 & i13) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                    }
                    int i21111110 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i21111110 & 896) | (i21111110 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = contentWindowInsets;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = jM954getBackground0d7_KjU;
                    function9 = function2M1041getLambda2$material3_release;
                    function10 = function2M1042getLambda3$material3_release;
                    function11 = function2M1043getLambda4$material3_release;
                    function6 = function2M1040getLambda1$material3_release;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                    }
                    int i21111111 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i21111111 & 896) | (i21111111 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = contentWindowInsets;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = jM954getBackground0d7_KjU;
                    function9 = function2M1041getLambda2$material3_release;
                    function10 = function2M1042getLambda3$material3_release;
                    function11 = function2M1043getLambda4$material3_release;
                    function6 = function2M1040getLambda1$material3_release;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
            }
            i22 = 805306368;
            i13 |= i22;
            if ((1533916891 & i13) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i28 != 0) {
                        function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                    } else {
                        function2M1040getLambda1$material3_release = function6;
                    }
                    if (i14 != 0) {
                        function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                    } else {
                        function2M1041getLambda2$material3_release = function7;
                    }
                    if (i16 != 0) {
                        function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                    } else {
                        function2M1042getLambda3$material3_release = function4;
                    }
                    if (i18 != 0) {
                        function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                    } else {
                        function2M1043getLambda4$material3_release = function8;
                    }
                    if (i20 != 0) {
                        iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                    } else {
                        iM1110getEndERTFSPs = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                    } else {
                        i23 = i13;
                        jM954getBackground0d7_KjU = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                        modifier2 = modifier2;
                    } else {
                        i24 = i23;
                        contentWindowInsets = windowInsets;
                    }
                } else {
                    if (i27 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i28 != 0) {
                        function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                    } else {
                        function2M1040getLambda1$material3_release = function6;
                    }
                    if (i14 != 0) {
                        function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                    } else {
                        function2M1041getLambda2$material3_release = function7;
                    }
                    if (i16 != 0) {
                        function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                    } else {
                        function2M1042getLambda3$material3_release = function4;
                    }
                    if (i18 != 0) {
                        function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                    } else {
                        function2M1043getLambda4$material3_release = function8;
                    }
                    if (i20 != 0) {
                        iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                    } else {
                        iM1110getEndERTFSPs = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                    } else {
                        i23 = i13;
                        jM954getBackground0d7_KjU = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                        modifier2 = modifier2;
                    } else {
                        i24 = i23;
                        contentWindowInsets = windowInsets;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                }
                int i21111112 = i24 >> 12;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i21111112 & 896) | (i21111112 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                windowInsets2 = contentWindowInsets;
                j12 = jM1014contentColorForek8zF_U;
                j13 = jM954getBackground0d7_KjU;
                function9 = function2M1041getLambda2$material3_release;
                function10 = function2M1042getLambda3$material3_release;
                function11 = function2M1043getLambda4$material3_release;
                function6 = function2M1040getLambda1$material3_release;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i28 != 0) {
                        function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                    } else {
                        function2M1040getLambda1$material3_release = function6;
                    }
                    if (i14 != 0) {
                        function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                    } else {
                        function2M1041getLambda2$material3_release = function7;
                    }
                    if (i16 != 0) {
                        function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                    } else {
                        function2M1042getLambda3$material3_release = function4;
                    }
                    if (i18 != 0) {
                        function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                    } else {
                        function2M1043getLambda4$material3_release = function8;
                    }
                    if (i20 != 0) {
                        iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                    } else {
                        iM1110getEndERTFSPs = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                    } else {
                        i23 = i13;
                        jM954getBackground0d7_KjU = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                        modifier2 = modifier2;
                    } else {
                        i24 = i23;
                        contentWindowInsets = windowInsets;
                    }
                } else {
                    if (i27 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i28 != 0) {
                        function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                    } else {
                        function2M1040getLambda1$material3_release = function6;
                    }
                    if (i14 != 0) {
                        function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                    } else {
                        function2M1041getLambda2$material3_release = function7;
                    }
                    if (i16 != 0) {
                        function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                    } else {
                        function2M1042getLambda3$material3_release = function4;
                    }
                    if (i18 != 0) {
                        function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                    } else {
                        function2M1043getLambda4$material3_release = function8;
                    }
                    if (i20 != 0) {
                        iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                    } else {
                        iM1110getEndERTFSPs = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                    } else {
                        i23 = i13;
                        jM954getBackground0d7_KjU = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                        modifier2 = modifier2;
                    } else {
                        i24 = i23;
                        contentWindowInsets = windowInsets;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                }
                int i21111113 = i24 >> 12;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i21111113 & 896) | (i21111113 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                windowInsets2 = contentWindowInsets;
                j12 = jM1014contentColorForek8zF_U;
                j13 = jM954getBackground0d7_KjU;
                function9 = function2M1041getLambda2$material3_release;
                function10 = function2M1042getLambda3$material3_release;
                function11 = function2M1043getLambda4$material3_release;
                function6 = function2M1040getLambda1$material3_release;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
        }
        i13 |= 3072;
        i18 = i12 & 16;
        if (i18 != 0) {
            if ((57344 & i11) == 0) {
                function8 = function5;
                if (composerStartRestartGroup.changedInstance(function8)) {
                    i19 = 16384;
                } else {
                    i19 = 8192;
                }
                i13 |= i19;
            }
            i20 = i12 & 32;
            if (i20 != 0) {
                i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i11 & 458752) == 0) {
                if (composerStartRestartGroup.changed(i10)) {
                    i21 = 131072;
                } else {
                    i21 = 65536;
                }
                i13 |= i21;
            }
            if ((i11 & 3670016) != 0) {
                if ((i12 & 64) == 0) {
                    i26 = 524288;
                } else {
                    i26 = 524288;
                }
                i13 |= i26;
            }
            if ((i11 & 29360128) == 0) {
                jM1014contentColorForek8zF_U = j11;
                if ((i12 & 128) == 0) {
                    i25 = 4194304;
                } else {
                    i25 = 4194304;
                }
                i13 |= i25;
            } else {
                jM1014contentColorForek8zF_U = j11;
            }
            if ((234881024 & i11) != 0) {
                i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(windowInsets)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            }
            if ((i12 & 512) != 0) {
                if ((1879048192 & i11) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i22 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i22 = 268435456;
                    }
                }
                if ((1533916891 & i13) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                    }
                    int i21111114 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i21111114 & 896) | (i21111114 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = contentWindowInsets;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = jM954getBackground0d7_KjU;
                    function9 = function2M1041getLambda2$material3_release;
                    function10 = function2M1042getLambda3$material3_release;
                    function11 = function2M1043getLambda4$material3_release;
                    function6 = function2M1040getLambda1$material3_release;
                    modifier3 = modifier2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i11 & 1) != 0) {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    } else {
                        if (i27 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i28 != 0) {
                            function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                        } else {
                            function2M1040getLambda1$material3_release = function6;
                        }
                        if (i14 != 0) {
                            function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                        } else {
                            function2M1041getLambda2$material3_release = function7;
                        }
                        if (i16 != 0) {
                            function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                        } else {
                            function2M1042getLambda3$material3_release = function4;
                        }
                        if (i18 != 0) {
                            function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                        } else {
                            function2M1043getLambda4$material3_release = function8;
                        }
                        if (i20 != 0) {
                            iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                        } else {
                            iM1110getEndERTFSPs = i10;
                        }
                        if ((i12 & 64) != 0) {
                            i23 = i13 & (-3670017);
                            jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                        } else {
                            i23 = i13;
                            jM954getBackground0d7_KjU = j10;
                        }
                        if ((i12 & 128) != 0) {
                            jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                            i23 &= -29360129;
                        }
                        if ((i12 & 256) != 0) {
                            i24 = i23 & (-234881025);
                            contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                            modifier2 = modifier2;
                        } else {
                            i24 = i23;
                            contentWindowInsets = windowInsets;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                    }
                    int i21111115 = i24 >> 12;
                    SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i21111115 & 896) | (i21111115 & 7168), 114);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    windowInsets2 = contentWindowInsets;
                    j12 = jM1014contentColorForek8zF_U;
                    j13 = jM954getBackground0d7_KjU;
                    function9 = function2M1041getLambda2$material3_release;
                    function10 = function2M1042getLambda3$material3_release;
                    function11 = function2M1043getLambda4$material3_release;
                    function6 = function2M1040getLambda1$material3_release;
                    modifier3 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
            }
            i22 = 805306368;
            i13 |= i22;
            if ((1533916891 & i13) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i28 != 0) {
                        function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                    } else {
                        function2M1040getLambda1$material3_release = function6;
                    }
                    if (i14 != 0) {
                        function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                    } else {
                        function2M1041getLambda2$material3_release = function7;
                    }
                    if (i16 != 0) {
                        function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                    } else {
                        function2M1042getLambda3$material3_release = function4;
                    }
                    if (i18 != 0) {
                        function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                    } else {
                        function2M1043getLambda4$material3_release = function8;
                    }
                    if (i20 != 0) {
                        iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                    } else {
                        iM1110getEndERTFSPs = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                    } else {
                        i23 = i13;
                        jM954getBackground0d7_KjU = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                        modifier2 = modifier2;
                    } else {
                        i24 = i23;
                        contentWindowInsets = windowInsets;
                    }
                } else {
                    if (i27 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i28 != 0) {
                        function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                    } else {
                        function2M1040getLambda1$material3_release = function6;
                    }
                    if (i14 != 0) {
                        function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                    } else {
                        function2M1041getLambda2$material3_release = function7;
                    }
                    if (i16 != 0) {
                        function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                    } else {
                        function2M1042getLambda3$material3_release = function4;
                    }
                    if (i18 != 0) {
                        function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                    } else {
                        function2M1043getLambda4$material3_release = function8;
                    }
                    if (i20 != 0) {
                        iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                    } else {
                        iM1110getEndERTFSPs = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                    } else {
                        i23 = i13;
                        jM954getBackground0d7_KjU = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                        modifier2 = modifier2;
                    } else {
                        i24 = i23;
                        contentWindowInsets = windowInsets;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                }
                int i21111116 = i24 >> 12;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i21111116 & 896) | (i21111116 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                windowInsets2 = contentWindowInsets;
                j12 = jM1014contentColorForek8zF_U;
                j13 = jM954getBackground0d7_KjU;
                function9 = function2M1041getLambda2$material3_release;
                function10 = function2M1042getLambda3$material3_release;
                function11 = function2M1043getLambda4$material3_release;
                function6 = function2M1040getLambda1$material3_release;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i28 != 0) {
                        function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                    } else {
                        function2M1040getLambda1$material3_release = function6;
                    }
                    if (i14 != 0) {
                        function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                    } else {
                        function2M1041getLambda2$material3_release = function7;
                    }
                    if (i16 != 0) {
                        function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                    } else {
                        function2M1042getLambda3$material3_release = function4;
                    }
                    if (i18 != 0) {
                        function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                    } else {
                        function2M1043getLambda4$material3_release = function8;
                    }
                    if (i20 != 0) {
                        iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                    } else {
                        iM1110getEndERTFSPs = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                    } else {
                        i23 = i13;
                        jM954getBackground0d7_KjU = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                        modifier2 = modifier2;
                    } else {
                        i24 = i23;
                        contentWindowInsets = windowInsets;
                    }
                } else {
                    if (i27 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i28 != 0) {
                        function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                    } else {
                        function2M1040getLambda1$material3_release = function6;
                    }
                    if (i14 != 0) {
                        function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                    } else {
                        function2M1041getLambda2$material3_release = function7;
                    }
                    if (i16 != 0) {
                        function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                    } else {
                        function2M1042getLambda3$material3_release = function4;
                    }
                    if (i18 != 0) {
                        function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                    } else {
                        function2M1043getLambda4$material3_release = function8;
                    }
                    if (i20 != 0) {
                        iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                    } else {
                        iM1110getEndERTFSPs = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                    } else {
                        i23 = i13;
                        jM954getBackground0d7_KjU = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                        modifier2 = modifier2;
                    } else {
                        i24 = i23;
                        contentWindowInsets = windowInsets;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                }
                int i21111117 = i24 >> 12;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i21111117 & 896) | (i21111117 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                windowInsets2 = contentWindowInsets;
                j12 = jM1014contentColorForek8zF_U;
                j13 = jM954getBackground0d7_KjU;
                function9 = function2M1041getLambda2$material3_release;
                function10 = function2M1042getLambda3$material3_release;
                function11 = function2M1043getLambda4$material3_release;
                function6 = function2M1040getLambda1$material3_release;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
        }
        i13 |= 24576;
        function8 = function5;
        i20 = i12 & 32;
        if (i20 != 0) {
            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i11 & 458752) == 0) {
            if (composerStartRestartGroup.changed(i10)) {
                i21 = 131072;
            } else {
                i21 = 65536;
            }
            i13 |= i21;
        }
        if ((i11 & 3670016) != 0) {
            if ((i12 & 64) == 0) {
                i26 = 524288;
            } else {
                i26 = 524288;
            }
            i13 |= i26;
        }
        if ((i11 & 29360128) == 0) {
            jM1014contentColorForek8zF_U = j11;
            if ((i12 & 128) == 0) {
                i25 = 4194304;
            } else {
                i25 = 4194304;
            }
            i13 |= i25;
        } else {
            jM1014contentColorForek8zF_U = j11;
        }
        if ((234881024 & i11) != 0) {
            i13 |= ((i12 & 256) == 0 || !composerStartRestartGroup.changed(windowInsets)) ? 33554432 : AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        }
        if ((i12 & 512) != 0) {
            if ((1879048192 & i11) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i22 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i22 = 268435456;
                }
            }
            if ((1533916891 & i13) == 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i28 != 0) {
                        function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                    } else {
                        function2M1040getLambda1$material3_release = function6;
                    }
                    if (i14 != 0) {
                        function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                    } else {
                        function2M1041getLambda2$material3_release = function7;
                    }
                    if (i16 != 0) {
                        function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                    } else {
                        function2M1042getLambda3$material3_release = function4;
                    }
                    if (i18 != 0) {
                        function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                    } else {
                        function2M1043getLambda4$material3_release = function8;
                    }
                    if (i20 != 0) {
                        iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                    } else {
                        iM1110getEndERTFSPs = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                    } else {
                        i23 = i13;
                        jM954getBackground0d7_KjU = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                        modifier2 = modifier2;
                    } else {
                        i24 = i23;
                        contentWindowInsets = windowInsets;
                    }
                } else {
                    if (i27 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i28 != 0) {
                        function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                    } else {
                        function2M1040getLambda1$material3_release = function6;
                    }
                    if (i14 != 0) {
                        function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                    } else {
                        function2M1041getLambda2$material3_release = function7;
                    }
                    if (i16 != 0) {
                        function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                    } else {
                        function2M1042getLambda3$material3_release = function4;
                    }
                    if (i18 != 0) {
                        function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                    } else {
                        function2M1043getLambda4$material3_release = function8;
                    }
                    if (i20 != 0) {
                        iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                    } else {
                        iM1110getEndERTFSPs = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                    } else {
                        i23 = i13;
                        jM954getBackground0d7_KjU = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                        modifier2 = modifier2;
                    } else {
                        i24 = i23;
                        contentWindowInsets = windowInsets;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                }
                int i21111118 = i24 >> 12;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i21111118 & 896) | (i21111118 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                windowInsets2 = contentWindowInsets;
                j12 = jM1014contentColorForek8zF_U;
                j13 = jM954getBackground0d7_KjU;
                function9 = function2M1041getLambda2$material3_release;
                function10 = function2M1042getLambda3$material3_release;
                function11 = function2M1043getLambda4$material3_release;
                function6 = function2M1040getLambda1$material3_release;
                modifier3 = modifier2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i11 & 1) != 0) {
                    if (i27 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i28 != 0) {
                        function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                    } else {
                        function2M1040getLambda1$material3_release = function6;
                    }
                    if (i14 != 0) {
                        function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                    } else {
                        function2M1041getLambda2$material3_release = function7;
                    }
                    if (i16 != 0) {
                        function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                    } else {
                        function2M1042getLambda3$material3_release = function4;
                    }
                    if (i18 != 0) {
                        function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                    } else {
                        function2M1043getLambda4$material3_release = function8;
                    }
                    if (i20 != 0) {
                        iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                    } else {
                        iM1110getEndERTFSPs = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                    } else {
                        i23 = i13;
                        jM954getBackground0d7_KjU = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                        modifier2 = modifier2;
                    } else {
                        i24 = i23;
                        contentWindowInsets = windowInsets;
                    }
                } else {
                    if (i27 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i28 != 0) {
                        function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                    } else {
                        function2M1040getLambda1$material3_release = function6;
                    }
                    if (i14 != 0) {
                        function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                    } else {
                        function2M1041getLambda2$material3_release = function7;
                    }
                    if (i16 != 0) {
                        function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                    } else {
                        function2M1042getLambda3$material3_release = function4;
                    }
                    if (i18 != 0) {
                        function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                    } else {
                        function2M1043getLambda4$material3_release = function8;
                    }
                    if (i20 != 0) {
                        iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                    } else {
                        iM1110getEndERTFSPs = i10;
                    }
                    if ((i12 & 64) != 0) {
                        i23 = i13 & (-3670017);
                        jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                    } else {
                        i23 = i13;
                        jM954getBackground0d7_KjU = j10;
                    }
                    if ((i12 & 128) != 0) {
                        jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                        i23 &= -29360129;
                    }
                    if ((i12 & 256) != 0) {
                        i24 = i23 & (-234881025);
                        contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                        modifier2 = modifier2;
                    } else {
                        i24 = i23;
                        contentWindowInsets = windowInsets;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
                }
                int i21111119 = i24 >> 12;
                SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i21111119 & 896) | (i21111119 & 7168), 114);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                windowInsets2 = contentWindowInsets;
                j12 = jM1014contentColorForek8zF_U;
                j13 = jM954getBackground0d7_KjU;
                function9 = function2M1041getLambda2$material3_release;
                function10 = function2M1042getLambda3$material3_release;
                function11 = function2M1043getLambda4$material3_release;
                function6 = function2M1040getLambda1$material3_release;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
        }
        i22 = 805306368;
        i13 |= i22;
        if ((1533916891 & i13) == 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i27 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i28 != 0) {
                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                } else {
                    function2M1040getLambda1$material3_release = function6;
                }
                if (i14 != 0) {
                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                } else {
                    function2M1041getLambda2$material3_release = function7;
                }
                if (i16 != 0) {
                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                } else {
                    function2M1042getLambda3$material3_release = function4;
                }
                if (i18 != 0) {
                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                } else {
                    function2M1043getLambda4$material3_release = function8;
                }
                if (i20 != 0) {
                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                } else {
                    iM1110getEndERTFSPs = i10;
                }
                if ((i12 & 64) != 0) {
                    i23 = i13 & (-3670017);
                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                } else {
                    i23 = i13;
                    jM954getBackground0d7_KjU = j10;
                }
                if ((i12 & 128) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                    i23 &= -29360129;
                }
                if ((i12 & 256) != 0) {
                    i24 = i23 & (-234881025);
                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                    modifier2 = modifier2;
                } else {
                    i24 = i23;
                    contentWindowInsets = windowInsets;
                }
            } else {
                if (i27 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i28 != 0) {
                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                } else {
                    function2M1040getLambda1$material3_release = function6;
                }
                if (i14 != 0) {
                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                } else {
                    function2M1041getLambda2$material3_release = function7;
                }
                if (i16 != 0) {
                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                } else {
                    function2M1042getLambda3$material3_release = function4;
                }
                if (i18 != 0) {
                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                } else {
                    function2M1043getLambda4$material3_release = function8;
                }
                if (i20 != 0) {
                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                } else {
                    iM1110getEndERTFSPs = i10;
                }
                if ((i12 & 64) != 0) {
                    i23 = i13 & (-3670017);
                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                } else {
                    i23 = i13;
                    jM954getBackground0d7_KjU = j10;
                }
                if ((i12 & 128) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                    i23 &= -29360129;
                }
                if ((i12 & 256) != 0) {
                    i24 = i23 & (-234881025);
                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                    modifier2 = modifier2;
                } else {
                    i24 = i23;
                    contentWindowInsets = windowInsets;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
            }
            int i211111110 = i24 >> 12;
            SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i211111110 & 896) | (i211111110 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            windowInsets2 = contentWindowInsets;
            j12 = jM1014contentColorForek8zF_U;
            j13 = jM954getBackground0d7_KjU;
            function9 = function2M1041getLambda2$material3_release;
            function10 = function2M1042getLambda3$material3_release;
            function11 = function2M1043getLambda4$material3_release;
            function6 = function2M1040getLambda1$material3_release;
            modifier3 = modifier2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i11 & 1) != 0) {
                if (i27 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i28 != 0) {
                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                } else {
                    function2M1040getLambda1$material3_release = function6;
                }
                if (i14 != 0) {
                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                } else {
                    function2M1041getLambda2$material3_release = function7;
                }
                if (i16 != 0) {
                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                } else {
                    function2M1042getLambda3$material3_release = function4;
                }
                if (i18 != 0) {
                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                } else {
                    function2M1043getLambda4$material3_release = function8;
                }
                if (i20 != 0) {
                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                } else {
                    iM1110getEndERTFSPs = i10;
                }
                if ((i12 & 64) != 0) {
                    i23 = i13 & (-3670017);
                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                } else {
                    i23 = i13;
                    jM954getBackground0d7_KjU = j10;
                }
                if ((i12 & 128) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                    i23 &= -29360129;
                }
                if ((i12 & 256) != 0) {
                    i24 = i23 & (-234881025);
                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                    modifier2 = modifier2;
                } else {
                    i24 = i23;
                    contentWindowInsets = windowInsets;
                }
            } else {
                if (i27 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i28 != 0) {
                    function2M1040getLambda1$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1040getLambda1$material3_release();
                } else {
                    function2M1040getLambda1$material3_release = function6;
                }
                if (i14 != 0) {
                    function2M1041getLambda2$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1041getLambda2$material3_release();
                } else {
                    function2M1041getLambda2$material3_release = function7;
                }
                if (i16 != 0) {
                    function2M1042getLambda3$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1042getLambda3$material3_release();
                } else {
                    function2M1042getLambda3$material3_release = function4;
                }
                if (i18 != 0) {
                    function2M1043getLambda4$material3_release = ComposableSingletons$ScaffoldKt.INSTANCE.m1043getLambda4$material3_release();
                } else {
                    function2M1043getLambda4$material3_release = function8;
                }
                if (i20 != 0) {
                    iM1110getEndERTFSPs = FabPosition.INSTANCE.m1110getEndERTFSPs();
                } else {
                    iM1110getEndERTFSPs = i10;
                }
                if ((i12 & 64) != 0) {
                    i23 = i13 & (-3670017);
                    jM954getBackground0d7_KjU = MaterialTheme.INSTANCE.getColorScheme(composerStartRestartGroup, 6).m954getBackground0d7_KjU();
                } else {
                    i23 = i13;
                    jM954getBackground0d7_KjU = j10;
                }
                if ((i12 & 128) != 0) {
                    jM1014contentColorForek8zF_U = ColorSchemeKt.m1014contentColorForek8zF_U(jM954getBackground0d7_KjU, composerStartRestartGroup, (i23 >> 18) & 14);
                    i23 &= -29360129;
                }
                if ((i12 & 256) != 0) {
                    i24 = i23 & (-234881025);
                    contentWindowInsets = ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, 6);
                    modifier2 = modifier2;
                } else {
                    i24 = i23;
                    contentWindowInsets = windowInsets;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1219521777, i24, -1, "androidx.compose.material3.Scaffold (Scaffold.kt:73)");
            }
            int i211111111 = i24 >> 12;
            SurfaceKt.m1329SurfaceT9BRK9s(modifier2, null, jM954getBackground0d7_KjU, jM1014contentColorForek8zF_U, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1979205334, true, new b(iM1110getEndERTFSPs, i24, contentWindowInsets, function2M1040getLambda1$material3_release, function2M1042getLambda3$material3_release, function2M1043getLambda4$material3_release, function2M1041getLambda2$material3_release, content)), composerStartRestartGroup, (i24 & 14) | 12582912 | (i211111111 & 896) | (i211111111 & 7168), 114);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            windowInsets2 = contentWindowInsets;
            j12 = jM1014contentColorForek8zF_U;
            j13 = jM954getBackground0d7_KjU;
            function9 = function2M1041getLambda2$material3_release;
            function10 = function2M1042getLambda3$material3_release;
            function11 = function2M1043getLambda4$material3_release;
            function6 = function2M1040getLambda1$material3_release;
            modifier3 = modifier2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, function6, function9, function10, function11, iM1110getEndERTFSPs, j13, j12, windowInsets2, content, i11, i12));
    }

    /* JADX INFO: renamed from: access$ScaffoldLayout-FMILGgc, reason: not valid java name */
    public static final void m1225access$ScaffoldLayoutFMILGgc(int i10, Function2 function2, Function3 function3, Function2 function4, Function2 function5, WindowInsets windowInsets, Function2 function6, Composer composer, int i11) {
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-975511942);
        int i12 = (i11 & 14) == 0 ? (composerStartRestartGroup.changed(i10) ? 4 : 2) | i11 : i11;
        if ((i11 & 112) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function5) ? 16384 : 8192;
        }
        if ((458752 & i11) == 0) {
            i12 |= composerStartRestartGroup.changed(windowInsets) ? 131072 : 65536;
        }
        if ((3670016 & i11) == 0) {
            i12 |= composerStartRestartGroup.changedInstance(function6) ? 1048576 : 524288;
        }
        int i13 = i12;
        if ((2995931 & i13) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-975511942, i13, -1, "androidx.compose.material3.ScaffoldLayout (Scaffold.kt:111)");
            }
            Object[] objArr = {function2, function4, windowInsets, function5, FabPosition.m1102boximpl(i10), function6, function3};
            composerStartRestartGroup.startReplaceableGroup(-568225417);
            int i14 = 0;
            boolean zChanged = false;
            for (int i15 = 7; i14 < i15; i15 = 7) {
                zChanged |= composerStartRestartGroup.changed(objArr[i14]);
                i14++;
            }
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                composer2 = composerStartRestartGroup;
                l0.a3 a3Var = new l0.a3(i10, i13, windowInsets, function2, function4, function5, function6, function3);
                composer2.updateRememberedValue(a3Var);
                objRememberedValue = a3Var;
            } else {
                composer2 = composerStartRestartGroup;
            }
            composer2.endReplaceableGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue, composer2, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new l0.b3(i10, i11, windowInsets, function2, function4, function5, function6, function3));
    }

    @NotNull
    public static final ProvidableCompositionLocal<FabPlacement> getLocalFabPlacement() {
        return f11140a;
    }
}
