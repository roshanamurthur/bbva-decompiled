package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Divider.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a=\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/graphics/Color;", "color", "Landroidx/compose/ui/unit/Dp;", "thickness", "startIndent", "", "Divider-oMI9zvI", "(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V", "Divider", "material_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nDivider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Divider.kt\nandroidx/compose/material/DividerKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,69:1\n154#2:70\n154#2:71\n174#2:73\n76#3:72\n*S KotlinDebug\n*F\n+ 1 Divider.kt\nandroidx/compose/material/DividerKt\n*L\n47#1:70\n48#1:71\n56#1:73\n56#1:72\n*E\n"})
public final class DividerKt {

    /* JADX INFO: compiled from: Divider.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f7046p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ long f7047q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f7048r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f7049s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f7050t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f7051u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f6, float f10, int i10, int i11, long j10, Modifier modifier) {
            super(2);
            this.f7046p0 = modifier;
            this.f7047q0 = j10;
            this.f7048r0 = f6;
            this.f7049s0 = f10;
            this.f7050t0 = i10;
            this.f7051u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            DividerKt.m746DivideroMI9zvI(this.f7046p0, this.f7047q0, this.f7048r0, this.f7049s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f7050t0 | 1), this.f7051u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:71:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:78:0x0117  */
    /* JADX WARN: Code duplicated, block: B:79:0x012d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0157  */
    /* JADX WARN: Code duplicated, block: B:87:0x0164  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Divider-oMI9zvI, reason: not valid java name */
    public static final void m746DivideroMI9zvI(@Nullable Modifier modifier, long j10, float f6, float f10, @Nullable Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        long j11;
        float fM4389constructorimpl;
        int i13;
        float fM4389constructorimpl2;
        int i14;
        Modifier modifier3;
        long jM2507copywmQWz5c$default;
        Modifier modifierM300paddingqDBjuR0$default;
        float fM4389constructorimpl3;
        Modifier modifier4;
        long j12;
        float f11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1249392198);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            if ((i11 & 2) == 0) {
                j11 = j10;
                int i16 = composerStartRestartGroup.changed(j11) ? 32 : 16;
                i12 |= i16;
            } else {
                j11 = j10;
            }
            i12 |= i16;
        } else {
            j11 = j10;
        }
        int i17 = i11 & 4;
        if (i17 == 0) {
            if ((i10 & 896) == 0) {
                fM4389constructorimpl = f6;
                i12 |= composerStartRestartGroup.changed(fM4389constructorimpl) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    fM4389constructorimpl2 = f10;
                    if (composerStartRestartGroup.changed(fM4389constructorimpl2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i12 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i15 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if ((i11 & 2) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m712getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                        } else {
                            jM2507copywmQWz5c$default = j11;
                        }
                        if (i17 != 0) {
                            fM4389constructorimpl = Dp.m4389constructorimpl(1);
                        }
                        if (i13 != 0) {
                            fM4389constructorimpl2 = Dp.m4389constructorimpl(0);
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        jM2507copywmQWz5c$default = j11;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1249392198, i10, -1, "androidx.compose.material.Divider (Divider.kt:43)");
                    }
                    if (fM4389constructorimpl2 == 0.0f) {
                        modifierM300paddingqDBjuR0$default = Modifier.INSTANCE;
                    } else {
                        modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(Modifier.INSTANCE, fM4389constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null);
                    }
                    composerStartRestartGroup.startReplaceableGroup(1228914189);
                    if (Dp.m4394equalsimpl0(fM4389constructorimpl, Dp.INSTANCE.m4407getHairlineD9Ej5fM())) {
                        fM4389constructorimpl3 = Dp.m4389constructorimpl(1.0f / ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
                    } else {
                        fM4389constructorimpl3 = fM4389constructorimpl;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    BoxKt.Box(BackgroundKt.m122backgroundbw27NRU$default(SizeKt.m321height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(modifierM300paddingqDBjuR0$default), 0.0f, 1, null), fM4389constructorimpl3), jM2507copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    j12 = jM2507copywmQWz5c$default;
                    f11 = fM4389constructorimpl2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    j12 = j11;
                    f11 = fM4389constructorimpl2;
                    modifier4 = modifier2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new a(fM4389constructorimpl, f11, i10, i11, j12, modifier4));
            }
            i12 |= 3072;
            fM4389constructorimpl2 = f10;
            if ((i12 & 5851) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m712getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                    if (i17 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(1);
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl2 = Dp.m4389constructorimpl(0);
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m712getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                    if (i17 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(1);
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl2 = Dp.m4389constructorimpl(0);
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249392198, i10, -1, "androidx.compose.material.Divider (Divider.kt:43)");
                }
                if (fM4389constructorimpl2 == 0.0f) {
                    modifierM300paddingqDBjuR0$default = Modifier.INSTANCE;
                } else {
                    modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(Modifier.INSTANCE, fM4389constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null);
                }
                composerStartRestartGroup.startReplaceableGroup(1228914189);
                if (Dp.m4394equalsimpl0(fM4389constructorimpl, Dp.INSTANCE.m4407getHairlineD9Ej5fM())) {
                    fM4389constructorimpl3 = Dp.m4389constructorimpl(1.0f / ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
                } else {
                    fM4389constructorimpl3 = fM4389constructorimpl;
                }
                composerStartRestartGroup.endReplaceableGroup();
                BoxKt.Box(BackgroundKt.m122backgroundbw27NRU$default(SizeKt.m321height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(modifierM300paddingqDBjuR0$default), 0.0f, 1, null), fM4389constructorimpl3), jM2507copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j12 = jM2507copywmQWz5c$default;
                f11 = fM4389constructorimpl2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m712getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                    if (i17 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(1);
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl2 = Dp.m4389constructorimpl(0);
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m712getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                    if (i17 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(1);
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl2 = Dp.m4389constructorimpl(0);
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249392198, i10, -1, "androidx.compose.material.Divider (Divider.kt:43)");
                }
                if (fM4389constructorimpl2 == 0.0f) {
                    modifierM300paddingqDBjuR0$default = Modifier.INSTANCE;
                } else {
                    modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(Modifier.INSTANCE, fM4389constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null);
                }
                composerStartRestartGroup.startReplaceableGroup(1228914189);
                if (Dp.m4394equalsimpl0(fM4389constructorimpl, Dp.INSTANCE.m4407getHairlineD9Ej5fM())) {
                    fM4389constructorimpl3 = Dp.m4389constructorimpl(1.0f / ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
                } else {
                    fM4389constructorimpl3 = fM4389constructorimpl;
                }
                composerStartRestartGroup.endReplaceableGroup();
                BoxKt.Box(BackgroundKt.m122backgroundbw27NRU$default(SizeKt.m321height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(modifierM300paddingqDBjuR0$default), 0.0f, 1, null), fM4389constructorimpl3), jM2507copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j12 = jM2507copywmQWz5c$default;
                f11 = fM4389constructorimpl2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(fM4389constructorimpl, f11, i10, i11, j12, modifier4));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        fM4389constructorimpl = f6;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                fM4389constructorimpl2 = f10;
                if (composerStartRestartGroup.changed(fM4389constructorimpl2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i12 & 5851) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m712getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                    if (i17 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(1);
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl2 = Dp.m4389constructorimpl(0);
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m712getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                    if (i17 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(1);
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl2 = Dp.m4389constructorimpl(0);
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249392198, i10, -1, "androidx.compose.material.Divider (Divider.kt:43)");
                }
                if (fM4389constructorimpl2 == 0.0f) {
                    modifierM300paddingqDBjuR0$default = Modifier.INSTANCE;
                } else {
                    modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(Modifier.INSTANCE, fM4389constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null);
                }
                composerStartRestartGroup.startReplaceableGroup(1228914189);
                if (Dp.m4394equalsimpl0(fM4389constructorimpl, Dp.INSTANCE.m4407getHairlineD9Ej5fM())) {
                    fM4389constructorimpl3 = Dp.m4389constructorimpl(1.0f / ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
                } else {
                    fM4389constructorimpl3 = fM4389constructorimpl;
                }
                composerStartRestartGroup.endReplaceableGroup();
                BoxKt.Box(BackgroundKt.m122backgroundbw27NRU$default(SizeKt.m321height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(modifierM300paddingqDBjuR0$default), 0.0f, 1, null), fM4389constructorimpl3), jM2507copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j12 = jM2507copywmQWz5c$default;
                f11 = fM4389constructorimpl2;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m712getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                    if (i17 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(1);
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl2 = Dp.m4389constructorimpl(0);
                    }
                } else {
                    if (i15 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if ((i11 & 2) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m712getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    } else {
                        jM2507copywmQWz5c$default = j11;
                    }
                    if (i17 != 0) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(1);
                    }
                    if (i13 != 0) {
                        fM4389constructorimpl2 = Dp.m4389constructorimpl(0);
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1249392198, i10, -1, "androidx.compose.material.Divider (Divider.kt:43)");
                }
                if (fM4389constructorimpl2 == 0.0f) {
                    modifierM300paddingqDBjuR0$default = Modifier.INSTANCE;
                } else {
                    modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(Modifier.INSTANCE, fM4389constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null);
                }
                composerStartRestartGroup.startReplaceableGroup(1228914189);
                if (Dp.m4394equalsimpl0(fM4389constructorimpl, Dp.INSTANCE.m4407getHairlineD9Ej5fM())) {
                    fM4389constructorimpl3 = Dp.m4389constructorimpl(1.0f / ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
                } else {
                    fM4389constructorimpl3 = fM4389constructorimpl;
                }
                composerStartRestartGroup.endReplaceableGroup();
                BoxKt.Box(BackgroundKt.m122backgroundbw27NRU$default(SizeKt.m321height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(modifierM300paddingqDBjuR0$default), 0.0f, 1, null), fM4389constructorimpl3), jM2507copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                j12 = jM2507copywmQWz5c$default;
                f11 = fM4389constructorimpl2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new a(fM4389constructorimpl, f11, i10, i11, j12, modifier4));
        }
        i12 |= 3072;
        fM4389constructorimpl2 = f10;
        if ((i12 & 5851) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m712getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM2507copywmQWz5c$default = j11;
                }
                if (i17 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(1);
                }
                if (i13 != 0) {
                    fM4389constructorimpl2 = Dp.m4389constructorimpl(0);
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m712getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM2507copywmQWz5c$default = j11;
                }
                if (i17 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(1);
                }
                if (i13 != 0) {
                    fM4389constructorimpl2 = Dp.m4389constructorimpl(0);
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1249392198, i10, -1, "androidx.compose.material.Divider (Divider.kt:43)");
            }
            if (fM4389constructorimpl2 == 0.0f) {
                modifierM300paddingqDBjuR0$default = Modifier.INSTANCE;
            } else {
                modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(Modifier.INSTANCE, fM4389constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null);
            }
            composerStartRestartGroup.startReplaceableGroup(1228914189);
            if (Dp.m4394equalsimpl0(fM4389constructorimpl, Dp.INSTANCE.m4407getHairlineD9Ej5fM())) {
                fM4389constructorimpl3 = Dp.m4389constructorimpl(1.0f / ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
            } else {
                fM4389constructorimpl3 = fM4389constructorimpl;
            }
            composerStartRestartGroup.endReplaceableGroup();
            BoxKt.Box(BackgroundKt.m122backgroundbw27NRU$default(SizeKt.m321height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(modifierM300paddingqDBjuR0$default), 0.0f, 1, null), fM4389constructorimpl3), jM2507copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            j12 = jM2507copywmQWz5c$default;
            f11 = fM4389constructorimpl2;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m712getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM2507copywmQWz5c$default = j11;
                }
                if (i17 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(1);
                }
                if (i13 != 0) {
                    fM4389constructorimpl2 = Dp.m4389constructorimpl(0);
                }
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if ((i11 & 2) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, 6).m712getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                } else {
                    jM2507copywmQWz5c$default = j11;
                }
                if (i17 != 0) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(1);
                }
                if (i13 != 0) {
                    fM4389constructorimpl2 = Dp.m4389constructorimpl(0);
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1249392198, i10, -1, "androidx.compose.material.Divider (Divider.kt:43)");
            }
            if (fM4389constructorimpl2 == 0.0f) {
                modifierM300paddingqDBjuR0$default = Modifier.INSTANCE;
            } else {
                modifierM300paddingqDBjuR0$default = PaddingKt.m300paddingqDBjuR0$default(Modifier.INSTANCE, fM4389constructorimpl2, 0.0f, 0.0f, 0.0f, 14, null);
            }
            composerStartRestartGroup.startReplaceableGroup(1228914189);
            if (Dp.m4394equalsimpl0(fM4389constructorimpl, Dp.INSTANCE.m4407getHairlineD9Ej5fM())) {
                fM4389constructorimpl3 = Dp.m4389constructorimpl(1.0f / ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).getDensity());
            } else {
                fM4389constructorimpl3 = fM4389constructorimpl;
            }
            composerStartRestartGroup.endReplaceableGroup();
            BoxKt.Box(BackgroundKt.m122backgroundbw27NRU$default(SizeKt.m321height3ABfNKs(SizeKt.fillMaxWidth$default(modifier3.then(modifierM300paddingqDBjuR0$default), 0.0f, 1, null), fM4389constructorimpl3), jM2507copywmQWz5c$default, null, 2, null), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            j12 = jM2507copywmQWz5c$default;
            f11 = fM4389constructorimpl2;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new a(fM4389constructorimpl, f11, i10, i11, j12, modifier4));
    }
}
