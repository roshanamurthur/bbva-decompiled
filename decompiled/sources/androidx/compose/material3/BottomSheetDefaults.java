package androidx.compose.material3;

import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.material3.tokens.ScrimTokens;
import androidx.compose.material3.tokens.SheetBottomTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Dp;
import com.vierge.bluetoothlibrary.BluetoothState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SheetDefaults.kt */
/* JADX INFO: loaded from: classes.dex */
@ExperimentalMaterial3Api
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b%\u0010&JG\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\tH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\f\u0010\rR \u0010\u0013\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R \u0010\u0016\u001a\u00020\u00048\u0006ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0019\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00078G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001e\u001a\u00020\t8Gø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\u00020\t8Gø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010$\u001a\u00020!8G¢\u0006\u0006\u001a\u0004\b\"\u0010#\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006'"}, d2 = {"Landroidx/compose/material3/BottomSheetDefaults;", "", "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/ui/unit/Dp;", "width", "height", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "color", "", "DragHandle-lgZ2HuY", "(Landroidx/compose/ui/Modifier;FFLandroidx/compose/ui/graphics/Shape;JLandroidx/compose/runtime/Composer;II)V", "DragHandle", "a", "F", "getElevation-D9Ej5fM", "()F", "Elevation", "b", "getSheetPeekHeight-D9Ej5fM", "SheetPeekHeight", "getHiddenShape", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/Shape;", "HiddenShape", "getExpandedShape", "ExpandedShape", "getContainerColor", "(Landroidx/compose/runtime/Composer;I)J", "ContainerColor", "getScrimColor", "ScrimColor", "Landroidx/compose/foundation/layout/WindowInsets;", "getWindowInsets", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/foundation/layout/WindowInsets;", "windowInsets", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0})
@Stable
@SourceDebugExtension({"SMAP\nSheetDefaults.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/BottomSheetDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,429:1\n36#2:430\n1114#3,6:431\n154#4:437\n*S KotlinDebug\n*F\n+ 1 SheetDefaults.kt\nandroidx/compose/material3/BottomSheetDefaults\n*L\n338#1:430\n338#1:431,6\n313#1:437\n*E\n"})
public final class BottomSheetDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final BottomSheetDefaults INSTANCE = new BottomSheetDefaults();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final float Elevation = SheetBottomTokens.INSTANCE.m1930getDockedModalContainerElevationD9Ej5fM();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final float SheetPeekHeight = Dp.m4389constructorimpl(56);

    /* JADX INFO: compiled from: SheetDefaults.kt */
    public static final class a extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f9394p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(1);
            this.f9394p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setContentDescription(semantics, this.f9394p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SheetDefaults.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ float f9395p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f9396q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f6, float f10) {
            super(2);
            this.f9395p0 = f6;
            this.f9396q0 = f10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1039573072, iIntValue, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle.<anonymous> (SheetDefaults.kt:340)");
                }
                BoxKt.Box(SizeKt.m337sizeVpY3zN4(Modifier.INSTANCE, this.f9395p0, this.f9396q0), composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SheetDefaults.kt */
    public static final class c extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f9398q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ float f9399r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ float f9400s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Shape f9401t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f9402u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f9403w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Modifier modifier, float f6, float f10, Shape shape, long j10, int i10, int i11) {
            super(2);
            this.f9398q0 = modifier;
            this.f9399r0 = f6;
            this.f9400s0 = f10;
            this.f9401t0 = shape;
            this.f9402u0 = j10;
            this.v0 = i10;
            this.f9403w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            BottomSheetDefaults.this.m922DragHandlelgZ2HuY(this.f9398q0, this.f9399r0, this.f9400s0, this.f9401t0, this.f9402u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f9403w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:80:0x00df  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:91:0x012a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0155  */
    /* JADX WARN: Code duplicated, block: B:96:0x015d  */
    /* JADX WARN: Code duplicated, block: B:99:0x019d  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: DragHandle-lgZ2HuY, reason: not valid java name */
    public final void m922DragHandlelgZ2HuY(@Nullable Modifier modifier, float f6, float f10, @Nullable Shape shape, long j10, @Nullable Composer composer, int i10, int i11) {
        Modifier modifier2;
        int i12;
        float fM1929getDockedDragHandleWidthD9Ej5fM;
        int i13;
        float fM1928getDockedDragHandleHeightD9Ej5fM;
        int i14;
        Shape extraLarge;
        long jM2507copywmQWz5c$default;
        Modifier modifier3;
        int i15;
        String strM1320getStringNWtq28;
        boolean zChanged;
        Object objRememberedValue;
        Shape shape2;
        float f11;
        float f12;
        long j11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1364277227);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            modifier2 = modifier;
        } else if ((i10 & 14) == 0) {
            modifier2 = modifier;
            i12 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i10;
        } else {
            modifier2 = modifier;
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 112) == 0) {
                fM1929getDockedDragHandleWidthD9Ej5fM = f6;
                i12 |= composerStartRestartGroup.changed(fM1929getDockedDragHandleWidthD9Ej5fM) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    fM1928getDockedDragHandleHeightD9Ej5fM = f10;
                    if (composerStartRestartGroup.changed(fM1928getDockedDragHandleHeightD9Ej5fM)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 7168) == 0) {
                    if ((i11 & 8) == 0) {
                        extraLarge = shape;
                        int i18 = composerStartRestartGroup.changed(extraLarge) ? 2048 : 1024;
                        i12 |= i18;
                    } else {
                        extraLarge = shape;
                    }
                    i12 |= i18;
                } else {
                    extraLarge = shape;
                }
                if ((57344 & i10) == 0) {
                    if ((i11 & 16) == 0) {
                        jM2507copywmQWz5c$default = j10;
                        int i19 = composerStartRestartGroup.changed(jM2507copywmQWz5c$default) ? 16384 : 8192;
                        i12 |= i19;
                    } else {
                        jM2507copywmQWz5c$default = j10;
                    }
                    i12 |= i19;
                } else {
                    jM2507copywmQWz5c$default = j10;
                }
                if ((46811 & i12) == 9362 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i16 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i17 != 0) {
                            fM1929getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m1929getDockedDragHandleWidthD9Ej5fM();
                        }
                        if (i13 != 0) {
                            fM1928getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m1928getDockedDragHandleHeightD9Ej5fM();
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                        }
                        if ((i11 & 16) != 0) {
                            jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                            i12 &= -57345;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                        modifier3 = modifier2;
                    }
                    i15 = i12;
                    float f13 = fM1928getDockedDragHandleHeightD9Ej5fM;
                    Shape shape3 = extraLarge;
                    long j12 = jM2507copywmQWz5c$default;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1364277227, i15, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:325)");
                    }
                    strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1258getBottomSheetDragHandleDescriptionadMyvUU(), composerStartRestartGroup, 6);
                    Modifier modifierM298paddingVpY3zN4$default = PaddingKt.m298paddingVpY3zN4$default(modifier3, 0.0f, SheetDefaultsKt.f11280a, 1, null);
                    composerStartRestartGroup.startReplaceableGroup(1157296644);
                    zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new a(strM1320getStringNWtq28);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    int i20 = i15 >> 6;
                    SurfaceKt.m1329SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(modifierM298paddingVpY3zN4$default, false, (Function1) objRememberedValue, 1, null), shape3, j12, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1039573072, true, new b(fM1929getDockedDragHandleWidthD9Ej5fM, f13)), composerStartRestartGroup, (i20 & 112) | 12582912 | (i20 & 896), 120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    shape2 = shape3;
                    f11 = f13;
                    f12 = fM1929getDockedDragHandleWidthD9Ej5fM;
                    j11 = j12;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    f12 = fM1929getDockedDragHandleWidthD9Ej5fM;
                    f11 = fM1928getDockedDragHandleHeightD9Ej5fM;
                    shape2 = extraLarge;
                    j11 = jM2507copywmQWz5c$default;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, f12, f11, shape2, j11, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            fM1928getDockedDragHandleHeightD9Ej5fM = f10;
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    extraLarge = shape;
                    if (composerStartRestartGroup.changed(extraLarge)) {
                    }
                    i12 |= i18;
                } else {
                    extraLarge = shape;
                }
                i12 |= i18;
            } else {
                extraLarge = shape;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    jM2507copywmQWz5c$default = j10;
                    if (composerStartRestartGroup.changed(jM2507copywmQWz5c$default)) {
                    }
                    i12 |= i19;
                } else {
                    jM2507copywmQWz5c$default = j10;
                }
                i12 |= i19;
            } else {
                jM2507copywmQWz5c$default = j10;
            }
            if ((46811 & i12) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i17 != 0) {
                        fM1929getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m1929getDockedDragHandleWidthD9Ej5fM();
                    }
                    if (i13 != 0) {
                        fM1928getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m1928getDockedDragHandleHeightD9Ej5fM();
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                    }
                    if ((i11 & 16) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -57345;
                    }
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i17 != 0) {
                        fM1929getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m1929getDockedDragHandleWidthD9Ej5fM();
                    }
                    if (i13 != 0) {
                        fM1928getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m1928getDockedDragHandleHeightD9Ej5fM();
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                    }
                    if ((i11 & 16) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -57345;
                    }
                }
                i15 = i12;
                float f14 = fM1928getDockedDragHandleHeightD9Ej5fM;
                Shape shape4 = extraLarge;
                long j13 = jM2507copywmQWz5c$default;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1364277227, i15, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:325)");
                }
                strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1258getBottomSheetDragHandleDescriptionadMyvUU(), composerStartRestartGroup, 6);
                Modifier modifierM298paddingVpY3zN4$default2 = PaddingKt.m298paddingVpY3zN4$default(modifier3, 0.0f, SheetDefaultsKt.f11280a, 1, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new a(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new a(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i21 = i15 >> 6;
                SurfaceKt.m1329SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(modifierM298paddingVpY3zN4$default2, false, (Function1) objRememberedValue, 1, null), shape4, j13, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1039573072, true, new b(fM1929getDockedDragHandleWidthD9Ej5fM, f14)), composerStartRestartGroup, (i21 & 112) | 12582912 | (i21 & 896), 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape2 = shape4;
                f11 = f14;
                f12 = fM1929getDockedDragHandleWidthD9Ej5fM;
                j11 = j13;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i17 != 0) {
                        fM1929getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m1929getDockedDragHandleWidthD9Ej5fM();
                    }
                    if (i13 != 0) {
                        fM1928getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m1928getDockedDragHandleHeightD9Ej5fM();
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                    }
                    if ((i11 & 16) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -57345;
                    }
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i17 != 0) {
                        fM1929getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m1929getDockedDragHandleWidthD9Ej5fM();
                    }
                    if (i13 != 0) {
                        fM1928getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m1928getDockedDragHandleHeightD9Ej5fM();
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                    }
                    if ((i11 & 16) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -57345;
                    }
                }
                i15 = i12;
                float f15 = fM1928getDockedDragHandleHeightD9Ej5fM;
                Shape shape5 = extraLarge;
                long j14 = jM2507copywmQWz5c$default;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1364277227, i15, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:325)");
                }
                strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1258getBottomSheetDragHandleDescriptionadMyvUU(), composerStartRestartGroup, 6);
                Modifier modifierM298paddingVpY3zN4$default3 = PaddingKt.m298paddingVpY3zN4$default(modifier3, 0.0f, SheetDefaultsKt.f11280a, 1, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new a(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new a(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i22 = i15 >> 6;
                SurfaceKt.m1329SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(modifierM298paddingVpY3zN4$default3, false, (Function1) objRememberedValue, 1, null), shape5, j14, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1039573072, true, new b(fM1929getDockedDragHandleWidthD9Ej5fM, f15)), composerStartRestartGroup, (i22 & 112) | 12582912 | (i22 & 896), 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape2 = shape5;
                f11 = f15;
                f12 = fM1929getDockedDragHandleWidthD9Ej5fM;
                j11 = j14;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, f12, f11, shape2, j11, i10, i11));
        }
        i12 |= 48;
        fM1929getDockedDragHandleWidthD9Ej5fM = f6;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                fM1928getDockedDragHandleHeightD9Ej5fM = f10;
                if (composerStartRestartGroup.changed(fM1928getDockedDragHandleHeightD9Ej5fM)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    extraLarge = shape;
                    if (composerStartRestartGroup.changed(extraLarge)) {
                    }
                    i12 |= i18;
                } else {
                    extraLarge = shape;
                }
                i12 |= i18;
            } else {
                extraLarge = shape;
            }
            if ((57344 & i10) == 0) {
                if ((i11 & 16) == 0) {
                    jM2507copywmQWz5c$default = j10;
                    if (composerStartRestartGroup.changed(jM2507copywmQWz5c$default)) {
                    }
                    i12 |= i19;
                } else {
                    jM2507copywmQWz5c$default = j10;
                }
                i12 |= i19;
            } else {
                jM2507copywmQWz5c$default = j10;
            }
            if ((46811 & i12) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i17 != 0) {
                        fM1929getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m1929getDockedDragHandleWidthD9Ej5fM();
                    }
                    if (i13 != 0) {
                        fM1928getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m1928getDockedDragHandleHeightD9Ej5fM();
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                    }
                    if ((i11 & 16) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -57345;
                    }
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i17 != 0) {
                        fM1929getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m1929getDockedDragHandleWidthD9Ej5fM();
                    }
                    if (i13 != 0) {
                        fM1928getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m1928getDockedDragHandleHeightD9Ej5fM();
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                    }
                    if ((i11 & 16) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -57345;
                    }
                }
                i15 = i12;
                float f16 = fM1928getDockedDragHandleHeightD9Ej5fM;
                Shape shape6 = extraLarge;
                long j15 = jM2507copywmQWz5c$default;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1364277227, i15, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:325)");
                }
                strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1258getBottomSheetDragHandleDescriptionadMyvUU(), composerStartRestartGroup, 6);
                Modifier modifierM298paddingVpY3zN4$default4 = PaddingKt.m298paddingVpY3zN4$default(modifier3, 0.0f, SheetDefaultsKt.f11280a, 1, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new a(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new a(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i23 = i15 >> 6;
                SurfaceKt.m1329SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(modifierM298paddingVpY3zN4$default4, false, (Function1) objRememberedValue, 1, null), shape6, j15, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1039573072, true, new b(fM1929getDockedDragHandleWidthD9Ej5fM, f16)), composerStartRestartGroup, (i23 & 112) | 12582912 | (i23 & 896), 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape2 = shape6;
                f11 = f16;
                f12 = fM1929getDockedDragHandleWidthD9Ej5fM;
                j11 = j15;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i17 != 0) {
                        fM1929getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m1929getDockedDragHandleWidthD9Ej5fM();
                    }
                    if (i13 != 0) {
                        fM1928getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m1928getDockedDragHandleHeightD9Ej5fM();
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                    }
                    if ((i11 & 16) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -57345;
                    }
                } else {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i17 != 0) {
                        fM1929getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m1929getDockedDragHandleWidthD9Ej5fM();
                    }
                    if (i13 != 0) {
                        fM1928getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m1928getDockedDragHandleHeightD9Ej5fM();
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                    }
                    if ((i11 & 16) != 0) {
                        jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -57345;
                    }
                }
                i15 = i12;
                float f17 = fM1928getDockedDragHandleHeightD9Ej5fM;
                Shape shape7 = extraLarge;
                long j16 = jM2507copywmQWz5c$default;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1364277227, i15, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:325)");
                }
                strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1258getBottomSheetDragHandleDescriptionadMyvUU(), composerStartRestartGroup, 6);
                Modifier modifierM298paddingVpY3zN4$default5 = PaddingKt.m298paddingVpY3zN4$default(modifier3, 0.0f, SheetDefaultsKt.f11280a, 1, null);
                composerStartRestartGroup.startReplaceableGroup(1157296644);
                zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue = new a(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    objRememberedValue = new a(strM1320getStringNWtq28);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                int i24 = i15 >> 6;
                SurfaceKt.m1329SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(modifierM298paddingVpY3zN4$default5, false, (Function1) objRememberedValue, 1, null), shape7, j16, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1039573072, true, new b(fM1929getDockedDragHandleWidthD9Ej5fM, f17)), composerStartRestartGroup, (i24 & 112) | 12582912 | (i24 & 896), 120);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                shape2 = shape7;
                f11 = f17;
                f12 = fM1929getDockedDragHandleWidthD9Ej5fM;
                j11 = j16;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, f12, f11, shape2, j11, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        fM1928getDockedDragHandleHeightD9Ej5fM = f10;
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                extraLarge = shape;
                if (composerStartRestartGroup.changed(extraLarge)) {
                }
                i12 |= i18;
            } else {
                extraLarge = shape;
            }
            i12 |= i18;
        } else {
            extraLarge = shape;
        }
        if ((57344 & i10) == 0) {
            if ((i11 & 16) == 0) {
                jM2507copywmQWz5c$default = j10;
                if (composerStartRestartGroup.changed(jM2507copywmQWz5c$default)) {
                }
                i12 |= i19;
            } else {
                jM2507copywmQWz5c$default = j10;
            }
            i12 |= i19;
        } else {
            jM2507copywmQWz5c$default = j10;
        }
        if ((46811 & i12) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i17 != 0) {
                    fM1929getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m1929getDockedDragHandleWidthD9Ej5fM();
                }
                if (i13 != 0) {
                    fM1928getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m1928getDockedDragHandleHeightD9Ej5fM();
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                }
                if ((i11 & 16) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -57345;
                }
            } else {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i17 != 0) {
                    fM1929getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m1929getDockedDragHandleWidthD9Ej5fM();
                }
                if (i13 != 0) {
                    fM1928getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m1928getDockedDragHandleHeightD9Ej5fM();
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                }
                if ((i11 & 16) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -57345;
                }
            }
            i15 = i12;
            float f18 = fM1928getDockedDragHandleHeightD9Ej5fM;
            Shape shape8 = extraLarge;
            long j17 = jM2507copywmQWz5c$default;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1364277227, i15, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:325)");
            }
            strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1258getBottomSheetDragHandleDescriptionadMyvUU(), composerStartRestartGroup, 6);
            Modifier modifierM298paddingVpY3zN4$default6 = PaddingKt.m298paddingVpY3zN4$default(modifier3, 0.0f, SheetDefaultsKt.f11280a, 1, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new a(strM1320getStringNWtq28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new a(strM1320getStringNWtq28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i25 = i15 >> 6;
            SurfaceKt.m1329SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(modifierM298paddingVpY3zN4$default6, false, (Function1) objRememberedValue, 1, null), shape8, j17, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1039573072, true, new b(fM1929getDockedDragHandleWidthD9Ej5fM, f18)), composerStartRestartGroup, (i25 & 112) | 12582912 | (i25 & 896), 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape2 = shape8;
            f11 = f18;
            f12 = fM1929getDockedDragHandleWidthD9Ej5fM;
            j11 = j17;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i17 != 0) {
                    fM1929getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m1929getDockedDragHandleWidthD9Ej5fM();
                }
                if (i13 != 0) {
                    fM1928getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m1928getDockedDragHandleHeightD9Ej5fM();
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                }
                if ((i11 & 16) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -57345;
                }
            } else {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i17 != 0) {
                    fM1929getDockedDragHandleWidthD9Ej5fM = SheetBottomTokens.INSTANCE.m1929getDockedDragHandleWidthD9Ej5fM();
                }
                if (i13 != 0) {
                    fM1928getDockedDragHandleHeightD9Ej5fM = SheetBottomTokens.INSTANCE.m1928getDockedDragHandleHeightD9Ej5fM();
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    extraLarge = MaterialTheme.INSTANCE.getShapes(composerStartRestartGroup, 6).getExtraLarge();
                }
                if ((i11 & 16) != 0) {
                    jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SheetBottomTokens.INSTANCE.getDockedDragHandleColor(), composerStartRestartGroup, 6), 0.4f, 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -57345;
                }
            }
            i15 = i12;
            float f19 = fM1928getDockedDragHandleHeightD9Ej5fM;
            Shape shape9 = extraLarge;
            long j18 = jM2507copywmQWz5c$default;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1364277227, i15, -1, "androidx.compose.material3.BottomSheetDefaults.DragHandle (SheetDefaults.kt:325)");
            }
            strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(Strings.INSTANCE.m1258getBottomSheetDragHandleDescriptionadMyvUU(), composerStartRestartGroup, 6);
            Modifier modifierM298paddingVpY3zN4$default7 = PaddingKt.m298paddingVpY3zN4$default(modifier3, 0.0f, SheetDefaultsKt.f11280a, 1, null);
            composerStartRestartGroup.startReplaceableGroup(1157296644);
            zChanged = composerStartRestartGroup.changed(strM1320getStringNWtq28);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue = new a(strM1320getStringNWtq28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                objRememberedValue = new a(strM1320getStringNWtq28);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            int i26 = i15 >> 6;
            SurfaceKt.m1329SurfaceT9BRK9s(SemanticsModifierKt.semantics$default(modifierM298paddingVpY3zN4$default7, false, (Function1) objRememberedValue, 1, null), shape9, j18, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, -1039573072, true, new b(fM1929getDockedDragHandleWidthD9Ej5fM, f19)), composerStartRestartGroup, (i26 & 112) | 12582912 | (i26 & 896), 120);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            shape2 = shape9;
            f11 = f19;
            f12 = fM1929getDockedDragHandleWidthD9Ej5fM;
            j11 = j18;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new c(modifier3, f12, f11, shape2, j11, i10, i11));
    }

    @Composable
    @JvmName(name = "getContainerColor")
    public final long getContainerColor(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(433375448);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(433375448, i10, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ContainerColor> (SheetDefaults.kt:298)");
        }
        long color = ColorSchemeKt.toColor(SheetBottomTokens.INSTANCE.getDockedContainerColor(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return color;
    }

    /* JADX INFO: renamed from: getElevation-D9Ej5fM, reason: not valid java name */
    public final float m923getElevationD9Ej5fM() {
        return Elevation;
    }

    @Composable
    @JvmName(name = "getExpandedShape")
    @NotNull
    public final Shape getExpandedShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(1683783414);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1683783414, i10, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ExpandedShape> (SheetDefaults.kt:293)");
        }
        Shape shape = ShapesKt.toShape(SheetBottomTokens.INSTANCE.getDockedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @JvmName(name = "getHiddenShape")
    @NotNull
    public final Shape getHiddenShape(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-1971658024);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1971658024, i10, -1, "androidx.compose.material3.BottomSheetDefaults.<get-HiddenShape> (SheetDefaults.kt:288)");
        }
        Shape shape = ShapesKt.toShape(SheetBottomTokens.INSTANCE.getDockedMinimizedContainerShape(), composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return shape;
    }

    @Composable
    @JvmName(name = "getScrimColor")
    public final long getScrimColor(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-2040719176);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2040719176, i10, -1, "androidx.compose.material3.BottomSheetDefaults.<get-ScrimColor> (SheetDefaults.kt:306)");
        }
        long jM2507copywmQWz5c$default = Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(ScrimTokens.INSTANCE.getContainerColor(), composer, 6), 0.32f, 0.0f, 0.0f, 0.0f, 14, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return jM2507copywmQWz5c$default;
    }

    /* JADX INFO: renamed from: getSheetPeekHeight-D9Ej5fM, reason: not valid java name */
    public final float m924getSheetPeekHeightD9Ej5fM() {
        return SheetPeekHeight;
    }

    @Composable
    @JvmName(name = "getWindowInsets")
    @NotNull
    public final WindowInsets getWindowInsets(@Nullable Composer composer, int i10) {
        composer.startReplaceableGroup(-511309409);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-511309409, i10, -1, "androidx.compose.material3.BottomSheetDefaults.<get-windowInsets> (SheetDefaults.kt:319)");
        }
        WindowInsets windowInsetsM346onlybOOhFvg = WindowInsetsKt.m346onlybOOhFvg(SystemBarsDefaultInsets_androidKt.getSystemBarsForVisualComponents(WindowInsets.INSTANCE, composer, 8), WindowInsetsSides.INSTANCE.m366getVerticalJoeWqyM());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return windowInsetsM346onlybOOhFvg;
    }
}
