package com.bbva.ui.compose;

import androidx.appcompat.widget.g0;
import androidx.camera.camera2.internal.compat.u;
import androidx.compose.animation.SingleValueAnimationKt;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.BorderStrokeKt;
import androidx.compose.foundation.CanvasKt;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteractionKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material.ButtonColors;
import androidx.compose.material.ButtonDefaults;
import androidx.compose.material.ColorsKt;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.material.ElevationOverlayKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.RectangleShapeKt;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.res.PainterResources_androidKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.IntSize;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.profileinstaller.ProfileVerifier;
import com.bbva.androidtoolkit.utils.PluginUtils;
import com.bbva.ui.R;
import com.bbva.ui.compose.theme.Theme;
import com.mypinpad.tsdk.isolation.y2;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt__JobKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Button.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0007\u001a9\u0010\t\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a9\u0010\u000b\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000b\u0010\n\u001a9\u0010\f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\n\u001aC\u0010\u000f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001au\u0010\u0017\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0013\u001a\u00020\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00112\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006#²\u0006\f\u0010\u0019\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u001b\u001a\u00020\u001a8\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u001d\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001e\u001a\u00020\u001c8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u001f\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010 \u001a\u00020\u00058\n@\nX\u008a\u008e\u0002²\u0006\f\u0010\u0019\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010!\u001a\u00020\u001a8\nX\u008a\u0084\u0002²\u0006\f\u0010\"\u001a\u00020\u001a8\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function0;", "", "onClick", "Landroidx/compose/ui/Modifier;", "modifier", "", "enabled", "", "text", "PositiveButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;ZLjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "PrimaryButton", "SecondaryButton", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "LinkButton", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/layout/PaddingValues;ZLjava/lang/String;Landroidx/compose/runtime/Composer;II)V", "", "animDurationMillis", "textInProgress", "contentDescription", PluginUtils.IDENTIFIER_DRAWABLE, "onProgressFinished", "PrimaryProgressButton", "(Landroidx/compose/ui/Modifier;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "isPressed", "Landroidx/compose/ui/graphics/Color;", "borderColorState", "", "buttonWidth", "buttonHeight", "buttonText", "isRunningAnimation", "backgroundColor", "contentColor", "ui_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\ncom/bbva/ui/compose/ButtonKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 10 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,365:1\n25#2:366\n25#2:380\n25#2:391\n25#2:398\n25#2:405\n25#2:412\n25#2:419\n25#2:433\n25#2:441\n1097#3,6:367\n1097#3,3:381\n1100#3,3:387\n1097#3,6:392\n1097#3,6:399\n1097#3,6:406\n1097#3,6:413\n1097#3,6:420\n1097#3,6:426\n1097#3,6:434\n1097#3,6:442\n154#4:373\n154#4:375\n154#4:432\n154#4:440\n1#5:374\n486#6,4:376\n490#6,2:384\n494#6:390\n486#7:386\n76#8:448\n81#9:449\n81#9:450\n81#9:457\n107#9,2:458\n81#9:460\n107#9,2:461\n81#9:463\n81#9:464\n81#9:465\n75#10:451\n108#10,2:452\n75#10:454\n108#10,2:455\n*S KotlinDebug\n*F\n+ 1 Button.kt\ncom/bbva/ui/compose/ButtonKt\n*L\n128#1:366\n192#1:380\n193#1:391\n194#1:398\n195#1:405\n196#1:412\n197#1:419\n279#1:433\n328#1:441\n128#1:367,6\n192#1:381,3\n192#1:387,3\n193#1:392,6\n194#1:399,6\n195#1:406,6\n196#1:413,6\n197#1:420,6\n235#1:426,6\n279#1:434,6\n328#1:442,6\n141#1:373\n159#1:375\n239#1:432\n285#1:440\n192#1:376,4\n192#1:384,2\n192#1:390\n192#1:386\n331#1:448\n129#1:449\n135#1:450\n195#1:457\n195#1:458,2\n196#1:460\n196#1:461,2\n288#1:463\n290#1:464\n292#1:465\n193#1:451\n193#1:452,2\n194#1:454\n194#1:455,2\n*E\n"})
public final class ButtonKt {

    /* JADX INFO: compiled from: Button.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f37046p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f37047q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> f37048r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(State<Color> state, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3) {
            super(2);
            this.f37046p0 = state;
            this.f37047q0 = paddingValues;
            this.f37048r0 = function3;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1271502359, iIntValue, -1, "com.bbva.ui.compose.Button.<anonymous> (Button.kt:303)");
                }
                ProvidableCompositionLocal<Float> localContentAlpha = ContentAlphaKt.getLocalContentAlpha();
                State<Color> state = this.f37046p0;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{localContentAlpha.provides(Float.valueOf(Color.m2510getAlphaimpl(ButtonKt.access$Button_uPCbpMU$lambda$21(state))))}, ComposableLambdaKt.composableLambda(composer2, -555238697, true, new com.bbva.ui.compose.b(state, this.f37047q0, this.f37048r0)), composer2, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Button.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ Function3<RowScope, Composer, Integer, Unit> E0;
        public final /* synthetic */ int F0;
        public final /* synthetic */ int G0;
        public final /* synthetic */ int H0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37049p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f37050q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f37051r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f37052s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Shape f37053t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ BorderStroke f37054u0;
        public final /* synthetic */ ButtonColors v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ long f37055w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ long f37056x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f37057y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function0<Unit> function0, Modifier modifier, boolean z10, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, long j10, long j11, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11, int i12) {
            super(2);
            this.f37049p0 = function0;
            this.f37050q0 = modifier;
            this.f37051r0 = z10;
            this.f37052s0 = mutableInteractionSource;
            this.f37053t0 = shape;
            this.f37054u0 = borderStroke;
            this.v0 = buttonColors;
            this.f37055w0 = j10;
            this.f37056x0 = j11;
            this.f37057y0 = paddingValues;
            this.E0 = function3;
            this.F0 = i10;
            this.G0 = i11;
            this.H0 = i12;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ButtonKt.a(this.f37049p0, this.f37050q0, this.f37051r0, this.f37052s0, this.f37053t0, this.f37054u0, this.v0, this.f37055w0, this.f37056x0, this.f37057y0, this.E0, composer, RecomposeScopeImplKt.updateChangedFlags(this.F0 | 1), RecomposeScopeImplKt.updateChangedFlags(this.G0), this.H0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Button.kt */
    public static final class c extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f37058p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(3);
            this.f37058p0 = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope Button = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(345953547, iIntValue, -1, "com.bbva.ui.compose.LinkButton.<anonymous> (Button.kt:175)");
                }
                TextKt.m879Text4IGK_g(this.f37058p0, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Button.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37059p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f37060q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PaddingValues f37061r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ boolean f37062s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f37063t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f37064u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0<Unit> function0, Modifier modifier, PaddingValues paddingValues, boolean z10, String str, int i10, int i11) {
            super(2);
            this.f37059p0 = function0;
            this.f37060q0 = modifier;
            this.f37061r0 = paddingValues;
            this.f37062s0 = z10;
            this.f37063t0 = str;
            this.f37064u0 = i10;
            this.v0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ButtonKt.LinkButton(this.f37059p0, this.f37060q0, this.f37061r0, this.f37062s0, this.f37063t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37064u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Button.kt */
    public static final class e extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f37065p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str) {
            super(3);
            this.f37065p0 = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope Button = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(550729073, iIntValue, -1, "com.bbva.ui.compose.PositiveButton.<anonymous> (Button.kt:92)");
                }
                TextKt.m879Text4IGK_g(this.f37065p0, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Button.kt */
    public static final class f extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37066p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f37067q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f37068r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f37069s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f37070t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f37071u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Function0<Unit> function0, Modifier modifier, boolean z10, String str, int i10, int i11) {
            super(2);
            this.f37066p0 = function0;
            this.f37067q0 = modifier;
            this.f37068r0 = z10;
            this.f37069s0 = str;
            this.f37070t0 = i10;
            this.f37071u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ButtonKt.PositiveButton(this.f37066p0, this.f37067q0, this.f37068r0, this.f37069s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37070t0 | 1), this.f37071u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Button.kt */
    public static final class g extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f37072p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(3);
            this.f37072p0 = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope Button = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1518560762, iIntValue, -1, "com.bbva.ui.compose.PrimaryButton.<anonymous> (Button.kt:116)");
                }
                TextKt.m879Text4IGK_g(this.f37072p0, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Button.kt */
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37073p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f37074q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f37075r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f37076s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f37077t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f37078u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Function0<Unit> function0, Modifier modifier, boolean z10, String str, int i10, int i11) {
            super(2);
            this.f37073p0 = function0;
            this.f37074q0 = modifier;
            this.f37075r0 = z10;
            this.f37076s0 = str;
            this.f37077t0 = i10;
            this.f37078u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ButtonKt.PrimaryButton(this.f37073p0, this.f37074q0, this.f37075r0, this.f37076s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37077t0 | 1), this.f37078u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Button.kt */
    public static final class i extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final i f37079p0 = new i(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Button.kt */
    public static final class j extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final j f37080p0 = new j(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Button.kt */
    @DebugMetadata(c = "com.bbva.ui.compose.ButtonKt$PrimaryProgressButton$3", f = "Button.kt", i = {}, l = {204}, m = "invokeSuspend", n = {}, s = {})
    public static final class k extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f37081p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f37082q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f37083r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f37084s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f37085t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f37086u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Animatable<Float, AnimationVector1D> animatable, CoroutineScope coroutineScope, String str, MutableState<Boolean> mutableState, MutableState<String> mutableState2, Continuation<? super k> continuation) {
            super(2, continuation);
            this.f37082q0 = animatable;
            this.f37083r0 = coroutineScope;
            this.f37084s0 = str;
            this.f37085t0 = mutableState;
            this.f37086u0 = mutableState2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new k(this.f37082q0, this.f37083r0, this.f37084s0, this.f37085t0, this.f37086u0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((k) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f37081p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Float fBoxFloat = Boxing.boxFloat(0.0f);
                this.f37081p0 = 1;
                if (this.f37082q0.snapTo(fBoxFloat, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            JobKt__JobKt.cancelChildren$default(this.f37083r0.getCoroutineContext(), (CancellationException) null, 1, (Object) null);
            ButtonKt.access$PrimaryProgressButton$lambda$15(this.f37085t0, false);
            this.f37086u0.setValue(this.f37084s0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Button.kt */
    public static final class l extends Lambda implements Function1<IntSize, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f37087p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f37088q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(MutableFloatState mutableFloatState, MutableFloatState mutableFloatState2) {
            super(1);
            this.f37087p0 = mutableFloatState;
            this.f37088q0 = mutableFloatState2;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(IntSize intSize) {
            long f18319a = intSize.getF18319a();
            this.f37087p0.setFloatValue(IntSize.m4549getWidthimpl(f18319a));
            this.f37088q0.setFloatValue(IntSize.m4548getHeightimpl(f18319a));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Button.kt */
    public static final class m extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37089p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f37090q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f37091r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ MutableState<Boolean> f37092s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f37093t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f37094u0;
        public final /* synthetic */ Function0<Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f37095w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ MutableState<String> f37096x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Function0 function0, CoroutineScope coroutineScope, String str, MutableState mutableState, Animatable animatable, int i10, Function0 function1, MutableFloatState mutableFloatState, MutableState mutableState2) {
            super(0);
            this.f37089p0 = function0;
            this.f37090q0 = coroutineScope;
            this.f37091r0 = str;
            this.f37092s0 = mutableState;
            this.f37093t0 = animatable;
            this.f37094u0 = i10;
            this.v0 = function1;
            this.f37095w0 = mutableFloatState;
            this.f37096x0 = mutableState2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            MutableState<Boolean> mutableState = this.f37092s0;
            if (!ButtonKt.access$PrimaryProgressButton$lambda$14(mutableState)) {
                ButtonKt.access$PrimaryProgressButton$lambda$15(mutableState, true);
                this.f37089p0.invoke();
                BuildersKt__Builders_commonKt.launch$default(this.f37090q0, null, null, new com.bbva.ui.compose.c(this.f37093t0, 60.0f, this.f37094u0, this.v0, this.f37095w0, null), 3, null);
                String str = this.f37091r0;
                if (str.length() > 0) {
                    this.f37096x0.setValue(str);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Button.kt */
    @SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\ncom/bbva/ui/compose/ButtonKt$PrimaryProgressButton$6\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,365:1\n154#2:366\n67#3,5:367\n72#3:400\n76#3:405\n78#4,11:372\n91#4:404\n456#5,8:383\n464#5,3:397\n467#5,3:401\n4144#6,6:391\n*S KotlinDebug\n*F\n+ 1 Button.kt\ncom/bbva/ui/compose/ButtonKt$PrimaryProgressButton$6\n*L\n248#1:366\n247#1:367,5\n247#1:400\n247#1:405\n247#1:372,11\n247#1:404\n247#1:383,8\n247#1:397,3\n247#1:401,3\n247#1:391,6\n*E\n"})
    public static final class n extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f37097p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f37098q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f37099r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Animatable<Float, AnimationVector1D> f37100s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f37101t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ MutableFloatState f37102u0;
        public final /* synthetic */ MutableState<String> v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(String str, int i10, String str2, Animatable animatable, long j10, MutableFloatState mutableFloatState, MutableState mutableState) {
            super(3);
            this.f37097p0 = str;
            this.f37098q0 = i10;
            this.f37099r0 = str2;
            this.f37100s0 = animatable;
            this.f37101t0 = j10;
            this.f37102u0 = mutableFloatState;
            this.v0 = mutableState;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            Composer composer2;
            RowScope Button = rowScope;
            Composer composer3 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((iIntValue & 81) == 16 && composer3.getSkipping()) {
                composer3.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1515919891, iIntValue, -1, "com.bbva.ui.compose.PrimaryProgressButton.<anonymous> (Button.kt:246)");
                }
                Modifier.Companion companion = Modifier.INSTANCE;
                Modifier modifierM321height3ABfNKs = SizeKt.m321height3ABfNKs(companion, Dp.m4389constructorimpl(50));
                Alignment center = Alignment.INSTANCE.getCenter();
                String str = this.f37099r0;
                Animatable<Float, AnimationVector1D> animatable = this.f37100s0;
                long j10 = this.f37101t0;
                MutableFloatState mutableFloatState = this.f37102u0;
                composer3.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyRememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(center, false, composer3, 6);
                composer3.startReplaceableGroup(-1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM321height3ABfNKs);
                if (!(composer3.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer3.startReusableNode();
                if (composer3.getInserting()) {
                    composer3.createNode(constructor);
                } else {
                    composer3.useNode();
                }
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer3);
                Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion2, composerM2074constructorimpl, measurePolicyRememberBoxMeasurePolicy, composerM2074constructorimpl, currentCompositionLocalMap);
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer3)), composer3, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                CanvasKt.Canvas(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), new com.bbva.ui.compose.d(animatable, 60.0f, j10, mutableFloatState), composer3, 6);
                if (this.f37097p0.length() > 0) {
                    composer3.startReplaceableGroup(-1669765292);
                    composer2 = composer3;
                    TextKt.m879Text4IGK_g(ButtonKt.access$PrimaryProgressButton$lambda$11(this.v0), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                    composer2.endReplaceableGroup();
                } else {
                    composer2 = composer3;
                    composer2.startReplaceableGroup(-1669765231);
                    ImageKt.Image(PainterResources_androidKt.painterResource(this.f37098q0, composer2, 0), str, (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, (ColorFilter) null, composer2, 8, 124);
                    composer2.endReplaceableGroup();
                }
                if (y2.d(composer2)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Button.kt */
    public static final class o extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f37103p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ int f37104q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f37105r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f37106s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f37107t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ String f37108u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37109w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37110x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f37111y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(Modifier modifier, int i10, boolean z10, String str, String str2, String str3, int i11, Function0<Unit> function0, Function0<Unit> function1, int i12, int i13) {
            super(2);
            this.f37103p0 = modifier;
            this.f37104q0 = i10;
            this.f37105r0 = z10;
            this.f37106s0 = str;
            this.f37107t0 = str2;
            this.f37108u0 = str3;
            this.v0 = i11;
            this.f37109w0 = function0;
            this.f37110x0 = function1;
            this.f37111y0 = i12;
            this.E0 = i13;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ButtonKt.PrimaryProgressButton(this.f37103p0, this.f37104q0, this.f37105r0, this.f37106s0, this.f37107t0, this.f37108u0, this.v0, this.f37109w0, this.f37110x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37111y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Button.kt */
    public static final class p extends Lambda implements Function3<RowScope, Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f37112p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(String str) {
            super(3);
            this.f37112p0 = str;
        }

        @Override // kotlin.jvm.functions.Function3
        public final Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            RowScope Button = rowScope;
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((iIntValue & 81) == 16 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1840753772, iIntValue, -1, "com.bbva.ui.compose.SecondaryButton.<anonymous> (Button.kt:150)");
                }
                TextKt.m879Text4IGK_g(this.f37112p0, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Button.kt */
    public static final class q extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37113p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f37114q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f37115r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f37116s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f37117t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f37118u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(Function0<Unit> function0, Modifier modifier, boolean z10, String str, int i10, int i11) {
            super(2);
            this.f37113p0 = function0;
            this.f37114q0 = modifier;
            this.f37115r0 = z10;
            this.f37116s0 = str;
            this.f37117t0 = i10;
            this.f37118u0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ButtonKt.SecondaryButton(this.f37113p0, this.f37114q0, this.f37115r0, this.f37116s0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37117t0 | 1), this.f37118u0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Button.kt */
    @SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\ncom/bbva/ui/compose/ButtonKt$Surface$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,365:1\n66#2,6:366\n72#2:400\n76#2:405\n78#3,11:372\n91#3:404\n456#4,8:383\n464#4,3:397\n467#4,3:401\n4144#5,6:391\n*S KotlinDebug\n*F\n+ 1 Button.kt\ncom/bbva/ui/compose/ButtonKt$Surface$2\n*L\n336#1:366,6\n336#1:400\n336#1:405\n336#1:372,11\n336#1:404\n336#1:383,8\n336#1:397,3\n336#1:401,3\n336#1:391,6\n*E\n"})
    public static final class r extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f37119p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Shape f37120q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ long f37121r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ BorderStroke f37122s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f37123t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ boolean f37124u0;
        public final /* synthetic */ Function0<Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f37125w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public r(Modifier modifier, Shape shape, long j10, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, boolean z10, Function0<Unit> function0, Function2<? super Composer, ? super Integer, Unit> function2) {
            super(2);
            this.f37119p0 = modifier;
            this.f37120q0 = shape;
            this.f37121r0 = j10;
            this.f37122s0 = borderStroke;
            this.f37123t0 = mutableInteractionSource;
            this.f37124u0 = z10;
            this.v0 = function0;
            this.f37125w0 = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1322919546, iIntValue, -1, "com.bbva.ui.compose.Surface.<anonymous> (Button.kt:335)");
                }
                Modifier modifierM146clickableO2vRcR0$default = ClickableKt.m146clickableO2vRcR0$default(ButtonKt.m4976access$surface9LQNqLg(this.f37119p0, this.f37120q0, this.f37121r0, this.f37122s0), this.f37123t0, null, this.f37124u0, null, Role.m3825boximpl(Role.INSTANCE.m3831getButtono7Vup1c()), this.v0, 8, null);
                composer2.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, true, composer2, 48, -1323940314);
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM146clickableO2vRcR0$default);
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer composerM2074constructorimpl = Updater.m2074constructorimpl(composer2);
                Function2 function2C = com.google.android.gms.measurement.internal.a.c(companion, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, currentCompositionLocalMap);
                if (composerM2074constructorimpl.getInserting() || !Intrinsics.areEqual(composerM2074constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    bc.org.bouncycastle.math.ec.a.f(currentCompositeKeyHash, composerM2074constructorimpl, currentCompositeKeyHash, function2C);
                }
                ai.a.j(0, function3ModifierMaterializerOf, SkippableUpdater.m2065boximpl(SkippableUpdater.m2066constructorimpl(composer2)), composer2, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                if (g0.d(this.f37125w0, composer2, 0)) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Button.kt */
    public static final class s extends Lambda implements Function2<Composer, Integer, Unit> {
        public final /* synthetic */ int E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function0<Unit> f37126p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f37127q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ boolean f37128r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Shape f37129s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f37130t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f37131u0;
        public final /* synthetic */ BorderStroke v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f37132w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f37133x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f37134y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public s(Function0<Unit> function0, Modifier modifier, boolean z10, Shape shape, long j10, long j11, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, int i10, int i11) {
            super(2);
            this.f37126p0 = function0;
            this.f37127q0 = modifier;
            this.f37128r0 = z10;
            this.f37129s0 = shape;
            this.f37130t0 = j10;
            this.f37131u0 = j11;
            this.v0 = borderStroke;
            this.f37132w0 = mutableInteractionSource;
            this.f37133x0 = function2;
            this.f37134y0 = i10;
            this.E0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            ButtonKt.b(this.f37126p0, this.f37127q0, this.f37128r0, this.f37129s0, this.f37130t0, this.f37131u0, this.v0, this.f37132w0, this.f37133x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f37134y0 | 1), this.E0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00da  */
    /* JADX WARN: Code duplicated, block: B:72:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:78:0x0188  */
    /* JADX WARN: Code duplicated, block: B:82:0x0197  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void LinkButton(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, @Nullable PaddingValues paddingValues, boolean z10, @NotNull String text, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        PaddingValues paddingValues2;
        int i14;
        int i15;
        boolean z11;
        int i16;
        int i17;
        int i18;
        Modifier modifier3;
        PaddingValues paddingValuesM290PaddingValuesYgX7TsA;
        boolean z12;
        Composer composer2;
        Modifier modifier4;
        PaddingValues paddingValues3;
        boolean z13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1611795783);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    paddingValues2 = paddingValues;
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        z11 = z10;
                        if (composerStartRestartGroup.changed(z11)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 16) != 0) {
                        i12 |= 24576;
                    } else if ((57344 & i10) == 0) {
                        if (composerStartRestartGroup.changed(text)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    i18 = i12;
                    if ((46811 & i18) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        if (i19 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                        } else {
                            paddingValuesM290PaddingValuesYgX7TsA = paddingValues2;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1611795783, i18, -1, "com.bbva.ui.compose.LinkButton (Button.kt:161)");
                        }
                        Theme theme = Theme.INSTANCE;
                        long pressed = theme.getColors(composerStartRestartGroup, 6).getLink().getMain().getPressed();
                        ButtonDefaults buttonDefaults = ButtonDefaults.INSTANCE;
                        com.bbva.ui.compose.theme.Color color = com.bbva.ui.compose.theme.Color.INSTANCE;
                        composer2 = composerStartRestartGroup;
                        a(onClick, modifier3, z12, null, null, null, buttonDefaults.m680buttonColorsro_MJ88(color.m5054getTransparent0d7_KjU(), theme.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), color.m5054getTransparent0d7_KjU(), Color.m2507copywmQWz5c$default(theme.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 0), 0L, pressed, paddingValuesM290PaddingValuesYgX7TsA, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 345953547, true, new c(text)), composer2, ((i18 << 21) & 1879048192) | (i18 & 14) | (i18 & 112) | ((i18 >> 3) & 896), 6, 184);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier4 = modifier3;
                        paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                        z13 = z12;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier4 = modifier2;
                        paddingValues3 = paddingValues2;
                        z13 = z11;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new d(onClick, modifier4, paddingValues3, z13, text, i10, i11));
                    }
                }
                i12 |= 3072;
                z11 = z10;
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (composerStartRestartGroup.changed(text)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i12;
                if ((46811 & i18) == 9362) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                    } else {
                        paddingValuesM290PaddingValuesYgX7TsA = paddingValues2;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1611795783, i18, -1, "com.bbva.ui.compose.LinkButton (Button.kt:161)");
                    }
                    Theme theme2 = Theme.INSTANCE;
                    long pressed2 = theme2.getColors(composerStartRestartGroup, 6).getLink().getMain().getPressed();
                    ButtonDefaults buttonDefaults2 = ButtonDefaults.INSTANCE;
                    com.bbva.ui.compose.theme.Color color2 = com.bbva.ui.compose.theme.Color.INSTANCE;
                    composer2 = composerStartRestartGroup;
                    a(onClick, modifier3, z12, null, null, null, buttonDefaults2.m680buttonColorsro_MJ88(color2.m5054getTransparent0d7_KjU(), theme2.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), color2.m5054getTransparent0d7_KjU(), Color.m2507copywmQWz5c$default(theme2.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 0), 0L, pressed2, paddingValuesM290PaddingValuesYgX7TsA, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 345953547, true, new c(text)), composer2, ((i18 << 21) & 1879048192) | (i18 & 14) | (i18 & 112) | ((i18 >> 3) & 896), 6, 184);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                    z13 = z12;
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                    } else {
                        paddingValuesM290PaddingValuesYgX7TsA = paddingValues2;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1611795783, i18, -1, "com.bbva.ui.compose.LinkButton (Button.kt:161)");
                    }
                    Theme theme3 = Theme.INSTANCE;
                    long pressed3 = theme3.getColors(composerStartRestartGroup, 6).getLink().getMain().getPressed();
                    ButtonDefaults buttonDefaults3 = ButtonDefaults.INSTANCE;
                    com.bbva.ui.compose.theme.Color color3 = com.bbva.ui.compose.theme.Color.INSTANCE;
                    composer2 = composerStartRestartGroup;
                    a(onClick, modifier3, z12, null, null, null, buttonDefaults3.m680buttonColorsro_MJ88(color3.m5054getTransparent0d7_KjU(), theme3.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), color3.m5054getTransparent0d7_KjU(), Color.m2507copywmQWz5c$default(theme3.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 0), 0L, pressed3, paddingValuesM290PaddingValuesYgX7TsA, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 345953547, true, new c(text)), composer2, ((i18 << 21) & 1879048192) | (i18 & 14) | (i18 & 112) | ((i18 >> 3) & 896), 6, 184);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                    z13 = z12;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(onClick, modifier4, paddingValues3, z13, text, i10, i11));
                }
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            paddingValues2 = paddingValues;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (composerStartRestartGroup.changed(text)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i12;
                if ((46811 & i18) == 9362) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                    } else {
                        paddingValuesM290PaddingValuesYgX7TsA = paddingValues2;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1611795783, i18, -1, "com.bbva.ui.compose.LinkButton (Button.kt:161)");
                    }
                    Theme theme4 = Theme.INSTANCE;
                    long pressed4 = theme4.getColors(composerStartRestartGroup, 6).getLink().getMain().getPressed();
                    ButtonDefaults buttonDefaults4 = ButtonDefaults.INSTANCE;
                    com.bbva.ui.compose.theme.Color color4 = com.bbva.ui.compose.theme.Color.INSTANCE;
                    composer2 = composerStartRestartGroup;
                    a(onClick, modifier3, z12, null, null, null, buttonDefaults4.m680buttonColorsro_MJ88(color4.m5054getTransparent0d7_KjU(), theme4.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), color4.m5054getTransparent0d7_KjU(), Color.m2507copywmQWz5c$default(theme4.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 0), 0L, pressed4, paddingValuesM290PaddingValuesYgX7TsA, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 345953547, true, new c(text)), composer2, ((i18 << 21) & 1879048192) | (i18 & 14) | (i18 & 112) | ((i18 >> 3) & 896), 6, 184);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                    z13 = z12;
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                    } else {
                        paddingValuesM290PaddingValuesYgX7TsA = paddingValues2;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1611795783, i18, -1, "com.bbva.ui.compose.LinkButton (Button.kt:161)");
                    }
                    Theme theme5 = Theme.INSTANCE;
                    long pressed5 = theme5.getColors(composerStartRestartGroup, 6).getLink().getMain().getPressed();
                    ButtonDefaults buttonDefaults5 = ButtonDefaults.INSTANCE;
                    com.bbva.ui.compose.theme.Color color5 = com.bbva.ui.compose.theme.Color.INSTANCE;
                    composer2 = composerStartRestartGroup;
                    a(onClick, modifier3, z12, null, null, null, buttonDefaults5.m680buttonColorsro_MJ88(color5.m5054getTransparent0d7_KjU(), theme5.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), color5.m5054getTransparent0d7_KjU(), Color.m2507copywmQWz5c$default(theme5.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 0), 0L, pressed5, paddingValuesM290PaddingValuesYgX7TsA, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 345953547, true, new c(text)), composer2, ((i18 << 21) & 1879048192) | (i18 & 14) | (i18 & 112) | ((i18 >> 3) & 896), 6, 184);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                    z13 = z12;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(onClick, modifier4, paddingValues3, z13, text, i10, i11));
                }
            }
            i12 |= 3072;
            z11 = z10;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changed(text)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            i18 = i12;
            if ((46811 & i18) == 9362) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                } else {
                    paddingValuesM290PaddingValuesYgX7TsA = paddingValues2;
                }
                if (i15 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1611795783, i18, -1, "com.bbva.ui.compose.LinkButton (Button.kt:161)");
                }
                Theme theme6 = Theme.INSTANCE;
                long pressed6 = theme6.getColors(composerStartRestartGroup, 6).getLink().getMain().getPressed();
                ButtonDefaults buttonDefaults6 = ButtonDefaults.INSTANCE;
                com.bbva.ui.compose.theme.Color color6 = com.bbva.ui.compose.theme.Color.INSTANCE;
                composer2 = composerStartRestartGroup;
                a(onClick, modifier3, z12, null, null, null, buttonDefaults6.m680buttonColorsro_MJ88(color6.m5054getTransparent0d7_KjU(), theme6.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), color6.m5054getTransparent0d7_KjU(), Color.m2507copywmQWz5c$default(theme6.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 0), 0L, pressed6, paddingValuesM290PaddingValuesYgX7TsA, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 345953547, true, new c(text)), composer2, ((i18 << 21) & 1879048192) | (i18 & 14) | (i18 & 112) | ((i18 >> 3) & 896), 6, 184);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                z13 = z12;
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                } else {
                    paddingValuesM290PaddingValuesYgX7TsA = paddingValues2;
                }
                if (i15 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1611795783, i18, -1, "com.bbva.ui.compose.LinkButton (Button.kt:161)");
                }
                Theme theme7 = Theme.INSTANCE;
                long pressed7 = theme7.getColors(composerStartRestartGroup, 6).getLink().getMain().getPressed();
                ButtonDefaults buttonDefaults7 = ButtonDefaults.INSTANCE;
                com.bbva.ui.compose.theme.Color color7 = com.bbva.ui.compose.theme.Color.INSTANCE;
                composer2 = composerStartRestartGroup;
                a(onClick, modifier3, z12, null, null, null, buttonDefaults7.m680buttonColorsro_MJ88(color7.m5054getTransparent0d7_KjU(), theme7.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), color7.m5054getTransparent0d7_KjU(), Color.m2507copywmQWz5c$default(theme7.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 0), 0L, pressed7, paddingValuesM290PaddingValuesYgX7TsA, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 345953547, true, new c(text)), composer2, ((i18 << 21) & 1879048192) | (i18 & 14) | (i18 & 112) | ((i18 >> 3) & 896), 6, 184);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                z13 = z12;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new d(onClick, modifier4, paddingValues3, z13, text, i10, i11));
            }
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                paddingValues2 = paddingValues;
                if (composerStartRestartGroup.changed(paddingValues2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (composerStartRestartGroup.changed(text)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i12;
                if ((46811 & i18) == 9362) {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                    } else {
                        paddingValuesM290PaddingValuesYgX7TsA = paddingValues2;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1611795783, i18, -1, "com.bbva.ui.compose.LinkButton (Button.kt:161)");
                    }
                    Theme theme8 = Theme.INSTANCE;
                    long pressed8 = theme8.getColors(composerStartRestartGroup, 6).getLink().getMain().getPressed();
                    ButtonDefaults buttonDefaults8 = ButtonDefaults.INSTANCE;
                    com.bbva.ui.compose.theme.Color color8 = com.bbva.ui.compose.theme.Color.INSTANCE;
                    composer2 = composerStartRestartGroup;
                    a(onClick, modifier3, z12, null, null, null, buttonDefaults8.m680buttonColorsro_MJ88(color8.m5054getTransparent0d7_KjU(), theme8.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), color8.m5054getTransparent0d7_KjU(), Color.m2507copywmQWz5c$default(theme8.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 0), 0L, pressed8, paddingValuesM290PaddingValuesYgX7TsA, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 345953547, true, new c(text)), composer2, ((i18 << 21) & 1879048192) | (i18 & 14) | (i18 & 112) | ((i18 >> 3) & 896), 6, 184);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                    z13 = z12;
                } else {
                    if (i19 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                    } else {
                        paddingValuesM290PaddingValuesYgX7TsA = paddingValues2;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1611795783, i18, -1, "com.bbva.ui.compose.LinkButton (Button.kt:161)");
                    }
                    Theme theme9 = Theme.INSTANCE;
                    long pressed9 = theme9.getColors(composerStartRestartGroup, 6).getLink().getMain().getPressed();
                    ButtonDefaults buttonDefaults9 = ButtonDefaults.INSTANCE;
                    com.bbva.ui.compose.theme.Color color9 = com.bbva.ui.compose.theme.Color.INSTANCE;
                    composer2 = composerStartRestartGroup;
                    a(onClick, modifier3, z12, null, null, null, buttonDefaults9.m680buttonColorsro_MJ88(color9.m5054getTransparent0d7_KjU(), theme9.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), color9.m5054getTransparent0d7_KjU(), Color.m2507copywmQWz5c$default(theme9.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 0), 0L, pressed9, paddingValuesM290PaddingValuesYgX7TsA, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 345953547, true, new c(text)), composer2, ((i18 << 21) & 1879048192) | (i18 & 14) | (i18 & 112) | ((i18 >> 3) & 896), 6, 184);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier3;
                    paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                    z13 = z12;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new d(onClick, modifier4, paddingValues3, z13, text, i10, i11));
                }
            }
            i12 |= 3072;
            z11 = z10;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changed(text)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            i18 = i12;
            if ((46811 & i18) == 9362) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                } else {
                    paddingValuesM290PaddingValuesYgX7TsA = paddingValues2;
                }
                if (i15 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1611795783, i18, -1, "com.bbva.ui.compose.LinkButton (Button.kt:161)");
                }
                Theme theme10 = Theme.INSTANCE;
                long pressed10 = theme10.getColors(composerStartRestartGroup, 6).getLink().getMain().getPressed();
                ButtonDefaults buttonDefaults10 = ButtonDefaults.INSTANCE;
                com.bbva.ui.compose.theme.Color color10 = com.bbva.ui.compose.theme.Color.INSTANCE;
                composer2 = composerStartRestartGroup;
                a(onClick, modifier3, z12, null, null, null, buttonDefaults10.m680buttonColorsro_MJ88(color10.m5054getTransparent0d7_KjU(), theme10.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), color10.m5054getTransparent0d7_KjU(), Color.m2507copywmQWz5c$default(theme10.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 0), 0L, pressed10, paddingValuesM290PaddingValuesYgX7TsA, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 345953547, true, new c(text)), composer2, ((i18 << 21) & 1879048192) | (i18 & 14) | (i18 & 112) | ((i18 >> 3) & 896), 6, 184);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                z13 = z12;
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                } else {
                    paddingValuesM290PaddingValuesYgX7TsA = paddingValues2;
                }
                if (i15 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1611795783, i18, -1, "com.bbva.ui.compose.LinkButton (Button.kt:161)");
                }
                Theme theme11 = Theme.INSTANCE;
                long pressed11 = theme11.getColors(composerStartRestartGroup, 6).getLink().getMain().getPressed();
                ButtonDefaults buttonDefaults11 = ButtonDefaults.INSTANCE;
                com.bbva.ui.compose.theme.Color color11 = com.bbva.ui.compose.theme.Color.INSTANCE;
                composer2 = composerStartRestartGroup;
                a(onClick, modifier3, z12, null, null, null, buttonDefaults11.m680buttonColorsro_MJ88(color11.m5054getTransparent0d7_KjU(), theme11.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), color11.m5054getTransparent0d7_KjU(), Color.m2507copywmQWz5c$default(theme11.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 0), 0L, pressed11, paddingValuesM290PaddingValuesYgX7TsA, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 345953547, true, new c(text)), composer2, ((i18 << 21) & 1879048192) | (i18 & 14) | (i18 & 112) | ((i18 >> 3) & 896), 6, 184);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                z13 = z12;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new d(onClick, modifier4, paddingValues3, z13, text, i10, i11));
            }
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        paddingValues2 = paddingValues;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changed(text)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            i18 = i12;
            if ((46811 & i18) == 9362) {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                } else {
                    paddingValuesM290PaddingValuesYgX7TsA = paddingValues2;
                }
                if (i15 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1611795783, i18, -1, "com.bbva.ui.compose.LinkButton (Button.kt:161)");
                }
                Theme theme12 = Theme.INSTANCE;
                long pressed12 = theme12.getColors(composerStartRestartGroup, 6).getLink().getMain().getPressed();
                ButtonDefaults buttonDefaults12 = ButtonDefaults.INSTANCE;
                com.bbva.ui.compose.theme.Color color12 = com.bbva.ui.compose.theme.Color.INSTANCE;
                composer2 = composerStartRestartGroup;
                a(onClick, modifier3, z12, null, null, null, buttonDefaults12.m680buttonColorsro_MJ88(color12.m5054getTransparent0d7_KjU(), theme12.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), color12.m5054getTransparent0d7_KjU(), Color.m2507copywmQWz5c$default(theme12.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 0), 0L, pressed12, paddingValuesM290PaddingValuesYgX7TsA, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 345953547, true, new c(text)), composer2, ((i18 << 21) & 1879048192) | (i18 & 14) | (i18 & 112) | ((i18 >> 3) & 896), 6, 184);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                z13 = z12;
            } else {
                if (i19 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                } else {
                    paddingValuesM290PaddingValuesYgX7TsA = paddingValues2;
                }
                if (i15 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1611795783, i18, -1, "com.bbva.ui.compose.LinkButton (Button.kt:161)");
                }
                Theme theme13 = Theme.INSTANCE;
                long pressed13 = theme13.getColors(composerStartRestartGroup, 6).getLink().getMain().getPressed();
                ButtonDefaults buttonDefaults13 = ButtonDefaults.INSTANCE;
                com.bbva.ui.compose.theme.Color color13 = com.bbva.ui.compose.theme.Color.INSTANCE;
                composer2 = composerStartRestartGroup;
                a(onClick, modifier3, z12, null, null, null, buttonDefaults13.m680buttonColorsro_MJ88(color13.m5054getTransparent0d7_KjU(), theme13.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), color13.m5054getTransparent0d7_KjU(), Color.m2507copywmQWz5c$default(theme13.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 0), 0L, pressed13, paddingValuesM290PaddingValuesYgX7TsA, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 345953547, true, new c(text)), composer2, ((i18 << 21) & 1879048192) | (i18 & 14) | (i18 & 112) | ((i18 >> 3) & 896), 6, 184);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
                paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                z13 = z12;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new d(onClick, modifier4, paddingValues3, z13, text, i10, i11));
            }
        }
        i12 |= 3072;
        z11 = z10;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (composerStartRestartGroup.changed(text)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i12 |= i17;
        }
        i18 = i12;
        if ((46811 & i18) == 9362) {
            if (i19 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
            } else {
                paddingValuesM290PaddingValuesYgX7TsA = paddingValues2;
            }
            if (i15 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1611795783, i18, -1, "com.bbva.ui.compose.LinkButton (Button.kt:161)");
            }
            Theme theme14 = Theme.INSTANCE;
            long pressed14 = theme14.getColors(composerStartRestartGroup, 6).getLink().getMain().getPressed();
            ButtonDefaults buttonDefaults14 = ButtonDefaults.INSTANCE;
            com.bbva.ui.compose.theme.Color color14 = com.bbva.ui.compose.theme.Color.INSTANCE;
            composer2 = composerStartRestartGroup;
            a(onClick, modifier3, z12, null, null, null, buttonDefaults14.m680buttonColorsro_MJ88(color14.m5054getTransparent0d7_KjU(), theme14.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), color14.m5054getTransparent0d7_KjU(), Color.m2507copywmQWz5c$default(theme14.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 0), 0L, pressed14, paddingValuesM290PaddingValuesYgX7TsA, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 345953547, true, new c(text)), composer2, ((i18 << 21) & 1879048192) | (i18 & 14) | (i18 & 112) | ((i18 >> 3) & 896), 6, 184);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
            z13 = z12;
        } else {
            if (i19 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
            } else {
                paddingValuesM290PaddingValuesYgX7TsA = paddingValues2;
            }
            if (i15 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1611795783, i18, -1, "com.bbva.ui.compose.LinkButton (Button.kt:161)");
            }
            Theme theme15 = Theme.INSTANCE;
            long pressed15 = theme15.getColors(composerStartRestartGroup, 6).getLink().getMain().getPressed();
            ButtonDefaults buttonDefaults15 = ButtonDefaults.INSTANCE;
            com.bbva.ui.compose.theme.Color color15 = com.bbva.ui.compose.theme.Color.INSTANCE;
            composer2 = composerStartRestartGroup;
            a(onClick, modifier3, z12, null, null, null, buttonDefaults15.m680buttonColorsro_MJ88(color15.m5054getTransparent0d7_KjU(), theme15.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), color15.m5054getTransparent0d7_KjU(), Color.m2507copywmQWz5c$default(theme15.getColors(composerStartRestartGroup, 6).getLink().getMain().getDefault(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), composerStartRestartGroup, (ButtonDefaults.$stable << 12) | 390, 0), 0L, pressed15, paddingValuesM290PaddingValuesYgX7TsA, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 345953547, true, new c(text)), composer2, ((i18 << 21) & 1879048192) | (i18 & 14) | (i18 & 112) | ((i18 >> 3) & 896), 6, 184);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier3;
            paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
            z13 = z12;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new d(onClick, modifier4, paddingValues3, z13, text, i10, i11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x0167  */
    /* JADX WARN: Code duplicated, block: B:67:0x0174  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void PositiveButton(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z10, @NotNull String text, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        int i16;
        boolean z12;
        Composer composer2;
        Modifier modifier3;
        boolean z13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(-722652001);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(text)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                i16 = i12;
                if ((i16 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-722652001, i16, -1, "com.bbva.ui.compose.PositiveButton (Button.kt:78)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                    Theme theme = Theme.INSTANCE;
                    Modifier modifier4 = modifier2;
                    composer2 = composerStartRestartGroup;
                    a(onClick, modifierFillMaxWidth$default, z12, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme.getColors(composerStartRestartGroup, 6).getCta().getPositive().getBackground().getDefault(), theme.getColors(composerStartRestartGroup, 6).getCta().getPositive().getText().getDefault(), theme.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), theme.getColors(composerStartRestartGroup, 6).getCta().getPositive().getBackground().getPressed(), theme.getColors(composerStartRestartGroup, 6).getCta().getPositive().getText().getPressed(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 550729073, true, new e(text)), composer2, (i16 & 14) | (i16 & 896), 6, 568);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z13 = z12;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z13 = z11;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new f(onClick, modifier3, z13, text, i10, i11));
                }
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            z11 = z10;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(text)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i12;
            if ((i16 & 5851) == 1170) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-722652001, i16, -1, "com.bbva.ui.compose.PositiveButton (Button.kt:78)");
                }
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                Theme theme2 = Theme.INSTANCE;
                Modifier modifier5 = modifier2;
                composer2 = composerStartRestartGroup;
                a(onClick, modifierFillMaxWidth$default2, z12, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme2.getColors(composerStartRestartGroup, 6).getCta().getPositive().getBackground().getDefault(), theme2.getColors(composerStartRestartGroup, 6).getCta().getPositive().getText().getDefault(), theme2.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme2.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), theme2.getColors(composerStartRestartGroup, 6).getCta().getPositive().getBackground().getPressed(), theme2.getColors(composerStartRestartGroup, 6).getCta().getPositive().getText().getPressed(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 550729073, true, new e(text)), composer2, (i16 & 14) | (i16 & 896), 6, 568);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
                z13 = z12;
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-722652001, i16, -1, "com.bbva.ui.compose.PositiveButton (Button.kt:78)");
                }
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                Theme theme3 = Theme.INSTANCE;
                Modifier modifier6 = modifier2;
                composer2 = composerStartRestartGroup;
                a(onClick, modifierFillMaxWidth$default3, z12, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme3.getColors(composerStartRestartGroup, 6).getCta().getPositive().getBackground().getDefault(), theme3.getColors(composerStartRestartGroup, 6).getCta().getPositive().getText().getDefault(), theme3.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme3.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), theme3.getColors(composerStartRestartGroup, 6).getCta().getPositive().getBackground().getPressed(), theme3.getColors(composerStartRestartGroup, 6).getCta().getPositive().getText().getPressed(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 550729073, true, new e(text)), composer2, (i16 & 14) | (i16 & 896), 6, 568);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier6;
                z13 = z12;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new f(onClick, modifier3, z13, text, i10, i11));
            }
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(text)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i12;
            if ((i16 & 5851) == 1170) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-722652001, i16, -1, "com.bbva.ui.compose.PositiveButton (Button.kt:78)");
                }
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                Theme theme4 = Theme.INSTANCE;
                Modifier modifier7 = modifier2;
                composer2 = composerStartRestartGroup;
                a(onClick, modifierFillMaxWidth$default4, z12, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme4.getColors(composerStartRestartGroup, 6).getCta().getPositive().getBackground().getDefault(), theme4.getColors(composerStartRestartGroup, 6).getCta().getPositive().getText().getDefault(), theme4.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme4.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), theme4.getColors(composerStartRestartGroup, 6).getCta().getPositive().getBackground().getPressed(), theme4.getColors(composerStartRestartGroup, 6).getCta().getPositive().getText().getPressed(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 550729073, true, new e(text)), composer2, (i16 & 14) | (i16 & 896), 6, 568);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier7;
                z13 = z12;
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-722652001, i16, -1, "com.bbva.ui.compose.PositiveButton (Button.kt:78)");
                }
                Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                Theme theme5 = Theme.INSTANCE;
                Modifier modifier8 = modifier2;
                composer2 = composerStartRestartGroup;
                a(onClick, modifierFillMaxWidth$default5, z12, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme5.getColors(composerStartRestartGroup, 6).getCta().getPositive().getBackground().getDefault(), theme5.getColors(composerStartRestartGroup, 6).getCta().getPositive().getText().getDefault(), theme5.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme5.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), theme5.getColors(composerStartRestartGroup, 6).getCta().getPositive().getBackground().getPressed(), theme5.getColors(composerStartRestartGroup, 6).getCta().getPositive().getText().getPressed(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 550729073, true, new e(text)), composer2, (i16 & 14) | (i16 & 896), 6, 568);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier8;
                z13 = z12;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new f(onClick, modifier3, z13, text, i10, i11));
            }
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        z11 = z10;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (composerStartRestartGroup.changed(text)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        i16 = i12;
        if ((i16 & 5851) == 1170) {
            if (i17 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (i13 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-722652001, i16, -1, "com.bbva.ui.compose.PositiveButton (Button.kt:78)");
            }
            Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            Theme theme6 = Theme.INSTANCE;
            Modifier modifier9 = modifier2;
            composer2 = composerStartRestartGroup;
            a(onClick, modifierFillMaxWidth$default6, z12, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme6.getColors(composerStartRestartGroup, 6).getCta().getPositive().getBackground().getDefault(), theme6.getColors(composerStartRestartGroup, 6).getCta().getPositive().getText().getDefault(), theme6.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme6.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), theme6.getColors(composerStartRestartGroup, 6).getCta().getPositive().getBackground().getPressed(), theme6.getColors(composerStartRestartGroup, 6).getCta().getPositive().getText().getPressed(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 550729073, true, new e(text)), composer2, (i16 & 14) | (i16 & 896), 6, 568);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier9;
            z13 = z12;
        } else {
            if (i17 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (i13 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-722652001, i16, -1, "com.bbva.ui.compose.PositiveButton (Button.kt:78)");
            }
            Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            Theme theme7 = Theme.INSTANCE;
            Modifier modifier10 = modifier2;
            composer2 = composerStartRestartGroup;
            a(onClick, modifierFillMaxWidth$default7, z12, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme7.getColors(composerStartRestartGroup, 6).getCta().getPositive().getBackground().getDefault(), theme7.getColors(composerStartRestartGroup, 6).getCta().getPositive().getText().getDefault(), theme7.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme7.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), theme7.getColors(composerStartRestartGroup, 6).getCta().getPositive().getBackground().getPressed(), theme7.getColors(composerStartRestartGroup, 6).getCta().getPositive().getText().getPressed(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 550729073, true, new e(text)), composer2, (i16 & 14) | (i16 & 896), 6, 568);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier10;
            z13 = z12;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new f(onClick, modifier3, z13, text, i10, i11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x0167  */
    /* JADX WARN: Code duplicated, block: B:67:0x0174  */
    /* JADX WARN: Code duplicated, block: B:69:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void PrimaryButton(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z10, @NotNull String text, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        int i16;
        boolean z12;
        Composer composer2;
        Modifier modifier3;
        boolean z13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(230557964);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(text)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                i16 = i12;
                if ((i16 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i17 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(230557964, i16, -1, "com.bbva.ui.compose.PrimaryButton (Button.kt:102)");
                    }
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                    Theme theme = Theme.INSTANCE;
                    Modifier modifier4 = modifier2;
                    composer2 = composerStartRestartGroup;
                    a(onClick, modifierFillMaxWidth$default, z12, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), theme.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed(), theme.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getPressed(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1518560762, true, new g(text)), composer2, (i16 & 14) | (i16 & 896), 6, 568);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z13 = z12;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z13 = z11;
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new h(onClick, modifier3, z13, text, i10, i11));
                }
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            z11 = z10;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(text)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i12;
            if ((i16 & 5851) == 1170) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(230557964, i16, -1, "com.bbva.ui.compose.PrimaryButton (Button.kt:102)");
                }
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                Theme theme2 = Theme.INSTANCE;
                Modifier modifier5 = modifier2;
                composer2 = composerStartRestartGroup;
                a(onClick, modifierFillMaxWidth$default2, z12, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme2.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme2.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme2.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme2.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), theme2.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed(), theme2.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getPressed(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1518560762, true, new g(text)), composer2, (i16 & 14) | (i16 & 896), 6, 568);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
                z13 = z12;
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(230557964, i16, -1, "com.bbva.ui.compose.PrimaryButton (Button.kt:102)");
                }
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                Theme theme3 = Theme.INSTANCE;
                Modifier modifier6 = modifier2;
                composer2 = composerStartRestartGroup;
                a(onClick, modifierFillMaxWidth$default3, z12, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme3.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme3.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme3.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme3.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), theme3.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed(), theme3.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getPressed(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1518560762, true, new g(text)), composer2, (i16 & 14) | (i16 & 896), 6, 568);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier6;
                z13 = z12;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new h(onClick, modifier3, z13, text, i10, i11));
            }
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(text)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i12;
            if ((i16 & 5851) == 1170) {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(230557964, i16, -1, "com.bbva.ui.compose.PrimaryButton (Button.kt:102)");
                }
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                Theme theme4 = Theme.INSTANCE;
                Modifier modifier7 = modifier2;
                composer2 = composerStartRestartGroup;
                a(onClick, modifierFillMaxWidth$default4, z12, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme4.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme4.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme4.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme4.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), theme4.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed(), theme4.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getPressed(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1518560762, true, new g(text)), composer2, (i16 & 14) | (i16 & 896), 6, 568);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier7;
                z13 = z12;
            } else {
                if (i17 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(230557964, i16, -1, "com.bbva.ui.compose.PrimaryButton (Button.kt:102)");
                }
                Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
                Theme theme5 = Theme.INSTANCE;
                Modifier modifier8 = modifier2;
                composer2 = composerStartRestartGroup;
                a(onClick, modifierFillMaxWidth$default5, z12, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme5.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme5.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme5.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme5.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), theme5.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed(), theme5.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getPressed(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1518560762, true, new g(text)), composer2, (i16 & 14) | (i16 & 896), 6, 568);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier8;
                z13 = z12;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new h(onClick, modifier3, z13, text, i10, i11));
            }
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        z11 = z10;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (composerStartRestartGroup.changed(text)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        i16 = i12;
        if ((i16 & 5851) == 1170) {
            if (i17 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (i13 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(230557964, i16, -1, "com.bbva.ui.compose.PrimaryButton (Button.kt:102)");
            }
            Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            Theme theme6 = Theme.INSTANCE;
            Modifier modifier9 = modifier2;
            composer2 = composerStartRestartGroup;
            a(onClick, modifierFillMaxWidth$default6, z12, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme6.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme6.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme6.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme6.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), theme6.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed(), theme6.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getPressed(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1518560762, true, new g(text)), composer2, (i16 & 14) | (i16 & 896), 6, 568);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier9;
            z13 = z12;
        } else {
            if (i17 != 0) {
                modifier2 = Modifier.INSTANCE;
            }
            if (i13 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(230557964, i16, -1, "com.bbva.ui.compose.PrimaryButton (Button.kt:102)");
            }
            Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(modifier2, 0.0f, 1, null);
            Theme theme7 = Theme.INSTANCE;
            Modifier modifier10 = modifier2;
            composer2 = composerStartRestartGroup;
            a(onClick, modifierFillMaxWidth$default7, z12, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme7.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme7.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme7.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme7.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), theme7.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed(), theme7.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getPressed(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1518560762, true, new g(text)), composer2, (i16 & 14) | (i16 & 896), 6, 568);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier10;
            z13 = z12;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new h(onClick, modifier3, z13, text, i10, i11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0141  */
    /* JADX WARN: Code duplicated, block: B:105:0x0144  */
    /* JADX WARN: Code duplicated, block: B:107:0x0148  */
    /* JADX WARN: Code duplicated, block: B:108:0x014b  */
    /* JADX WARN: Code duplicated, block: B:110:0x014f  */
    /* JADX WARN: Code duplicated, block: B:113:0x0154  */
    /* JADX WARN: Code duplicated, block: B:114:0x0156  */
    /* JADX WARN: Code duplicated, block: B:116:0x0159  */
    /* JADX WARN: Code duplicated, block: B:117:0x015c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0161  */
    /* JADX WARN: Code duplicated, block: B:122:0x0165  */
    /* JADX WARN: Code duplicated, block: B:123:0x0168  */
    /* JADX WARN: Code duplicated, block: B:125:0x016c  */
    /* JADX WARN: Code duplicated, block: B:126:0x016f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0173  */
    /* JADX WARN: Code duplicated, block: B:129:0x0176  */
    /* JADX WARN: Code duplicated, block: B:132:0x017e  */
    /* JADX WARN: Code duplicated, block: B:135:0x0199  */
    /* JADX WARN: Code duplicated, block: B:138:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:141:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:144:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:145:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:148:0x0214  */
    /* JADX WARN: Code duplicated, block: B:149:0x0224  */
    /* JADX WARN: Code duplicated, block: B:152:0x023c  */
    /* JADX WARN: Code duplicated, block: B:155:0x0269  */
    /* JADX WARN: Code duplicated, block: B:156:0x0288  */
    /* JADX WARN: Code duplicated, block: B:159:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:161:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:164:0x0375  */
    /* JADX WARN: Code duplicated, block: B:168:0x0387  */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:79:0x00de  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:92:0x010d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0113  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116  */
    /* JADX WARN: Code duplicated, block: B:99:0x0124  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void PrimaryProgressButton(@Nullable Modifier modifier, int i10, boolean z10, @Nullable String str, @Nullable String str2, @Nullable String str3, int i11, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable Composer composer, int i12, int i13) {
        int i14;
        int i15;
        boolean z11;
        int i16;
        int i17;
        String str4;
        int i18;
        int i19;
        String str5;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        Modifier modifier2;
        int i29;
        String str6;
        String str7;
        int i30;
        Function0<Unit> function2;
        Function0<Unit> function3;
        Object objB;
        Composer.Companion companion;
        CoroutineScope coroutineScope;
        Object objRememberedValue;
        MutableFloatState mutableFloatState;
        Object objRememberedValue2;
        MutableFloatState mutableFloatState2;
        Object objRememberedValue3;
        int i31;
        MutableState mutableState;
        Object objRememberedValue4;
        Object obj;
        MutableState mutableState2;
        Object objRememberedValue5;
        Animatable animatable;
        boolean zChanged;
        Object objRememberedValue6;
        Function0<Unit> function4;
        Function0<Unit> function5;
        String str8;
        String str9;
        int i32;
        boolean z12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1439055067);
        int i33 = i13 & 1;
        if (i33 != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 14) == 0) {
            i14 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i34 = i13 & 2;
        if (i34 == 0) {
            if ((i12 & 112) == 0) {
                i14 |= composerStartRestartGroup.changed(i10) ? 32 : 16;
            }
            i15 = i13 & 4;
            if (i15 != 0) {
                if ((i12 & 896) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 8;
                if (i17 != 0) {
                    if ((i12 & 7168) == 0) {
                        str4 = str;
                        if (composerStartRestartGroup.changed(str4)) {
                            i18 = 2048;
                        } else {
                            i18 = 1024;
                        }
                        i14 |= i18;
                    }
                    i19 = i13 & 16;
                    if (i19 != 0) {
                        if ((57344 & i12) == 0) {
                            str5 = str2;
                            if (composerStartRestartGroup.changed(str5)) {
                                i20 = 16384;
                            } else {
                                i20 = 8192;
                            }
                            i14 |= i20;
                        }
                        i21 = i13 & 32;
                        if (i21 != 0) {
                            i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                        } else if ((i12 & 458752) == 0) {
                            if (composerStartRestartGroup.changed(str3)) {
                                i22 = 131072;
                            } else {
                                i22 = 65536;
                            }
                            i14 |= i22;
                        }
                        i23 = i13 & 64;
                        if (i23 != 0) {
                            i14 |= 1572864;
                        } else if ((i12 & 3670016) == 0) {
                            if (composerStartRestartGroup.changed(i11)) {
                                i24 = 1048576;
                            } else {
                                i24 = 524288;
                            }
                            i14 |= i24;
                        }
                        i25 = i13 & 128;
                        if (i25 != 0) {
                            i14 |= 12582912;
                        } else if ((i12 & 29360128) == 0) {
                            if (composerStartRestartGroup.changedInstance(function0)) {
                                i26 = 8388608;
                            } else {
                                i26 = 4194304;
                            }
                            i14 |= i26;
                        }
                        i27 = i13 & 256;
                        if (i27 != 0) {
                            i14 |= 100663296;
                        } else if ((i12 & 234881024) == 0) {
                            if (composerStartRestartGroup.changedInstance(function1)) {
                                i28 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i28 = 33554432;
                            }
                            i14 |= i28;
                        }
                        if ((i14 & 191739611) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                            if (i33 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier;
                            }
                            if (i34 != 0) {
                                i29 = 5000;
                            } else {
                                i29 = i10;
                            }
                            if (i15 != 0) {
                                z11 = true;
                            }
                            if (i17 != 0) {
                                str6 = "";
                            } else {
                                str6 = str4;
                            }
                            if (i19 != 0) {
                                str7 = "";
                            } else {
                                str7 = str5;
                            }
                            String str10 = i21 == 0 ? str3 : "";
                            if (i23 != 0) {
                                i30 = 0;
                            } else {
                                i30 = i11;
                            }
                            if (i25 != 0) {
                                function2 = i.f37079p0;
                            } else {
                                function2 = function0;
                            }
                            if (i27 != 0) {
                                function3 = j.f37080p0;
                            } else {
                                function3 = function1;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                            }
                            objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                            companion = Composer.INSTANCE;
                            if (objB == companion.getEmpty()) {
                                objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableFloatState = (MutableFloatState) objRememberedValue;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                i31 = 2;
                                objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                i31 = 2;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState = (MutableState) objRememberedValue3;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                                MutableState mutableStateMutableStateOf$default = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default);
                                objRememberedValue4 = mutableStateMutableStateOf$default;
                                obj = null;
                            } else {
                                obj = null;
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableState2 = (MutableState) objRememberedValue4;
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            animatable = (Animatable) objRememberedValue5;
                            Theme theme = Theme.INSTANCE;
                            long pressed = theme.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                            composerStartRestartGroup.startReplaceableGroup(109719788);
                            if (!z11) {
                                EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            composerStartRestartGroup.startReplaceableGroup(-1831077280);
                            zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue6 == companion.getEmpty()) {
                                objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function4 = function2;
                            function5 = function3;
                            str8 = str10;
                            str9 = str7;
                            i32 = i30;
                            z12 = z11;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier2 = modifier;
                            i29 = i10;
                            str8 = str3;
                            i32 = i11;
                            function5 = function1;
                            z12 = z11;
                            str6 = str4;
                            str9 = str5;
                            function4 = function0;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new o(modifier2, i29, z12, str6, str9, str8, i32, function4, function5, i12, i13));
                        }
                    }
                    i14 |= 24576;
                    str5 = str2;
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i12 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(str3)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(i11)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                    i25 = i13 & 128;
                    if (i25 != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function0)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    i27 = i13 & 256;
                    if (i27 != 0) {
                        i14 |= 100663296;
                    } else if ((i12 & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i28 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i28 = 33554432;
                        }
                        i14 |= i28;
                    }
                    if ((i14 & 191739611) == 38347922) {
                        if (i33 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i34 != 0) {
                            i29 = 5000;
                        } else {
                            i29 = i10;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if (i17 != 0) {
                            str6 = "";
                        } else {
                            str6 = str4;
                        }
                        if (i19 != 0) {
                            str7 = "";
                        } else {
                            str7 = str5;
                        }
                        if (i21 == 0) {
                        }
                        if (i23 != 0) {
                            i30 = 0;
                        } else {
                            i30 = i11;
                        }
                        if (i25 != 0) {
                            function2 = i.f37079p0;
                        } else {
                            function2 = function0;
                        }
                        if (i27 != 0) {
                            function3 = j.f37080p0;
                        } else {
                            function3 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                        }
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        companion = Composer.INSTANCE;
                        if (objB == companion.getEmpty()) {
                            objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableFloatState = (MutableFloatState) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            i31 = 2;
                            objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            i31 = 2;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue3;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            MutableState mutableStateMutableStateOf$default2 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default2);
                            objRememberedValue4 = mutableStateMutableStateOf$default2;
                            obj = null;
                        } else {
                            obj = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        animatable = (Animatable) objRememberedValue5;
                        Theme theme2 = Theme.INSTANCE;
                        long pressed2 = theme2.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                        composerStartRestartGroup.startReplaceableGroup(109719788);
                        if (!z11) {
                            EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1831077280);
                        zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme2.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme2.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme2.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme2.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed2, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function4 = function2;
                        function5 = function3;
                        str8 = str10;
                        str9 = str7;
                        i32 = i30;
                        z12 = z11;
                    } else {
                        if (i33 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i34 != 0) {
                            i29 = 5000;
                        } else {
                            i29 = i10;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if (i17 != 0) {
                            str6 = "";
                        } else {
                            str6 = str4;
                        }
                        if (i19 != 0) {
                            str7 = "";
                        } else {
                            str7 = str5;
                        }
                        if (i21 == 0) {
                        }
                        if (i23 != 0) {
                            i30 = 0;
                        } else {
                            i30 = i11;
                        }
                        if (i25 != 0) {
                            function2 = i.f37079p0;
                        } else {
                            function2 = function0;
                        }
                        if (i27 != 0) {
                            function3 = j.f37080p0;
                        } else {
                            function3 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                        }
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        companion = Composer.INSTANCE;
                        if (objB == companion.getEmpty()) {
                            objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableFloatState = (MutableFloatState) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            i31 = 2;
                            objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            i31 = 2;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue3;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            MutableState mutableStateMutableStateOf$default3 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default3);
                            objRememberedValue4 = mutableStateMutableStateOf$default3;
                            obj = null;
                        } else {
                            obj = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        animatable = (Animatable) objRememberedValue5;
                        Theme theme3 = Theme.INSTANCE;
                        long pressed3 = theme3.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                        composerStartRestartGroup.startReplaceableGroup(109719788);
                        if (!z11) {
                            EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1831077280);
                        zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme3.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme3.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme3.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme3.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed3, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function4 = function2;
                        function5 = function3;
                        str8 = str10;
                        str9 = str7;
                        i32 = i30;
                        z12 = z11;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new o(modifier2, i29, z12, str6, str9, str8, i32, function4, function5, i12, i13));
                    }
                }
                i14 |= 3072;
                str4 = str;
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((57344 & i12) == 0) {
                        str5 = str2;
                        if (composerStartRestartGroup.changed(str5)) {
                            i20 = 16384;
                        } else {
                            i20 = 8192;
                        }
                        i14 |= i20;
                    }
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i12 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(str3)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(i11)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                    i25 = i13 & 128;
                    if (i25 != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function0)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    i27 = i13 & 256;
                    if (i27 != 0) {
                        i14 |= 100663296;
                    } else if ((i12 & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i28 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i28 = 33554432;
                        }
                        i14 |= i28;
                    }
                    if ((i14 & 191739611) == 38347922) {
                        if (i33 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i34 != 0) {
                            i29 = 5000;
                        } else {
                            i29 = i10;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if (i17 != 0) {
                            str6 = "";
                        } else {
                            str6 = str4;
                        }
                        if (i19 != 0) {
                            str7 = "";
                        } else {
                            str7 = str5;
                        }
                        if (i21 == 0) {
                        }
                        if (i23 != 0) {
                            i30 = 0;
                        } else {
                            i30 = i11;
                        }
                        if (i25 != 0) {
                            function2 = i.f37079p0;
                        } else {
                            function2 = function0;
                        }
                        if (i27 != 0) {
                            function3 = j.f37080p0;
                        } else {
                            function3 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                        }
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        companion = Composer.INSTANCE;
                        if (objB == companion.getEmpty()) {
                            objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableFloatState = (MutableFloatState) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            i31 = 2;
                            objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            i31 = 2;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue3;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            MutableState mutableStateMutableStateOf$default4 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default4);
                            objRememberedValue4 = mutableStateMutableStateOf$default4;
                            obj = null;
                        } else {
                            obj = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        animatable = (Animatable) objRememberedValue5;
                        Theme theme4 = Theme.INSTANCE;
                        long pressed4 = theme4.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                        composerStartRestartGroup.startReplaceableGroup(109719788);
                        if (!z11) {
                            EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1831077280);
                        zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme4.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme4.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme4.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme4.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed4, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function4 = function2;
                        function5 = function3;
                        str8 = str10;
                        str9 = str7;
                        i32 = i30;
                        z12 = z11;
                    } else {
                        if (i33 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i34 != 0) {
                            i29 = 5000;
                        } else {
                            i29 = i10;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if (i17 != 0) {
                            str6 = "";
                        } else {
                            str6 = str4;
                        }
                        if (i19 != 0) {
                            str7 = "";
                        } else {
                            str7 = str5;
                        }
                        if (i21 == 0) {
                        }
                        if (i23 != 0) {
                            i30 = 0;
                        } else {
                            i30 = i11;
                        }
                        if (i25 != 0) {
                            function2 = i.f37079p0;
                        } else {
                            function2 = function0;
                        }
                        if (i27 != 0) {
                            function3 = j.f37080p0;
                        } else {
                            function3 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                        }
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        companion = Composer.INSTANCE;
                        if (objB == companion.getEmpty()) {
                            objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableFloatState = (MutableFloatState) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            i31 = 2;
                            objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            i31 = 2;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue3;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            MutableState mutableStateMutableStateOf$default5 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default5);
                            objRememberedValue4 = mutableStateMutableStateOf$default5;
                            obj = null;
                        } else {
                            obj = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        animatable = (Animatable) objRememberedValue5;
                        Theme theme5 = Theme.INSTANCE;
                        long pressed5 = theme5.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                        composerStartRestartGroup.startReplaceableGroup(109719788);
                        if (!z11) {
                            EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1831077280);
                        zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme5.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme5.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme5.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme5.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed5, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function4 = function2;
                        function5 = function3;
                        str8 = str10;
                        str9 = str7;
                        i32 = i30;
                        z12 = z11;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new o(modifier2, i29, z12, str6, str9, str8, i32, function4, function5, i12, i13));
                    }
                }
                i14 |= 24576;
                str5 = str2;
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i12 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(str3)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(i11)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 128;
                if (i25 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                i27 = i13 & 256;
                if (i27 != 0) {
                    i14 |= 100663296;
                } else if ((i12 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i28 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i28 = 33554432;
                    }
                    i14 |= i28;
                }
                if ((i14 & 191739611) == 38347922) {
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i34 != 0) {
                        i29 = 5000;
                    } else {
                        i29 = i10;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i21 == 0) {
                    }
                    if (i23 != 0) {
                        i30 = 0;
                    } else {
                        i30 = i11;
                    }
                    if (i25 != 0) {
                        function2 = i.f37079p0;
                    } else {
                        function2 = function0;
                    }
                    if (i27 != 0) {
                        function3 = j.f37080p0;
                    } else {
                        function3 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    companion = Composer.INSTANCE;
                    if (objB == companion.getEmpty()) {
                        objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState = (MutableFloatState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        i31 = 2;
                        objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        i31 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default6 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default6);
                        objRememberedValue4 = mutableStateMutableStateOf$default6;
                        obj = null;
                    } else {
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    animatable = (Animatable) objRememberedValue5;
                    Theme theme6 = Theme.INSTANCE;
                    long pressed6 = theme6.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                    composerStartRestartGroup.startReplaceableGroup(109719788);
                    if (!z11) {
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1831077280);
                    zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme6.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme6.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme6.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme6.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed6, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function2;
                    function5 = function3;
                    str8 = str10;
                    str9 = str7;
                    i32 = i30;
                    z12 = z11;
                } else {
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i34 != 0) {
                        i29 = 5000;
                    } else {
                        i29 = i10;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i21 == 0) {
                    }
                    if (i23 != 0) {
                        i30 = 0;
                    } else {
                        i30 = i11;
                    }
                    if (i25 != 0) {
                        function2 = i.f37079p0;
                    } else {
                        function2 = function0;
                    }
                    if (i27 != 0) {
                        function3 = j.f37080p0;
                    } else {
                        function3 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    companion = Composer.INSTANCE;
                    if (objB == companion.getEmpty()) {
                        objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState = (MutableFloatState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        i31 = 2;
                        objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        i31 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default7 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default7);
                        objRememberedValue4 = mutableStateMutableStateOf$default7;
                        obj = null;
                    } else {
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    animatable = (Animatable) objRememberedValue5;
                    Theme theme7 = Theme.INSTANCE;
                    long pressed7 = theme7.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                    composerStartRestartGroup.startReplaceableGroup(109719788);
                    if (!z11) {
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1831077280);
                    zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme7.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme7.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme7.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme7.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed7, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function2;
                    function5 = function3;
                    str8 = str10;
                    str9 = str7;
                    i32 = i30;
                    z12 = z11;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new o(modifier2, i29, z12, str6, str9, str8, i32, function4, function5, i12, i13));
                }
            }
            i14 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            z11 = z10;
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 7168) == 0) {
                    str4 = str;
                    if (composerStartRestartGroup.changed(str4)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((57344 & i12) == 0) {
                        str5 = str2;
                        if (composerStartRestartGroup.changed(str5)) {
                            i20 = 16384;
                        } else {
                            i20 = 8192;
                        }
                        i14 |= i20;
                    }
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i12 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(str3)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(i11)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                    i25 = i13 & 128;
                    if (i25 != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function0)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    i27 = i13 & 256;
                    if (i27 != 0) {
                        i14 |= 100663296;
                    } else if ((i12 & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i28 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i28 = 33554432;
                        }
                        i14 |= i28;
                    }
                    if ((i14 & 191739611) == 38347922) {
                        if (i33 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i34 != 0) {
                            i29 = 5000;
                        } else {
                            i29 = i10;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if (i17 != 0) {
                            str6 = "";
                        } else {
                            str6 = str4;
                        }
                        if (i19 != 0) {
                            str7 = "";
                        } else {
                            str7 = str5;
                        }
                        if (i21 == 0) {
                        }
                        if (i23 != 0) {
                            i30 = 0;
                        } else {
                            i30 = i11;
                        }
                        if (i25 != 0) {
                            function2 = i.f37079p0;
                        } else {
                            function2 = function0;
                        }
                        if (i27 != 0) {
                            function3 = j.f37080p0;
                        } else {
                            function3 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                        }
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        companion = Composer.INSTANCE;
                        if (objB == companion.getEmpty()) {
                            objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableFloatState = (MutableFloatState) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            i31 = 2;
                            objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            i31 = 2;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue3;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            MutableState mutableStateMutableStateOf$default8 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default8);
                            objRememberedValue4 = mutableStateMutableStateOf$default8;
                            obj = null;
                        } else {
                            obj = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        animatable = (Animatable) objRememberedValue5;
                        Theme theme8 = Theme.INSTANCE;
                        long pressed8 = theme8.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                        composerStartRestartGroup.startReplaceableGroup(109719788);
                        if (!z11) {
                            EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1831077280);
                        zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme8.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme8.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme8.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme8.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed8, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function4 = function2;
                        function5 = function3;
                        str8 = str10;
                        str9 = str7;
                        i32 = i30;
                        z12 = z11;
                    } else {
                        if (i33 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i34 != 0) {
                            i29 = 5000;
                        } else {
                            i29 = i10;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if (i17 != 0) {
                            str6 = "";
                        } else {
                            str6 = str4;
                        }
                        if (i19 != 0) {
                            str7 = "";
                        } else {
                            str7 = str5;
                        }
                        if (i21 == 0) {
                        }
                        if (i23 != 0) {
                            i30 = 0;
                        } else {
                            i30 = i11;
                        }
                        if (i25 != 0) {
                            function2 = i.f37079p0;
                        } else {
                            function2 = function0;
                        }
                        if (i27 != 0) {
                            function3 = j.f37080p0;
                        } else {
                            function3 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                        }
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        companion = Composer.INSTANCE;
                        if (objB == companion.getEmpty()) {
                            objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableFloatState = (MutableFloatState) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            i31 = 2;
                            objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            i31 = 2;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue3;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            MutableState mutableStateMutableStateOf$default9 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default9);
                            objRememberedValue4 = mutableStateMutableStateOf$default9;
                            obj = null;
                        } else {
                            obj = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        animatable = (Animatable) objRememberedValue5;
                        Theme theme9 = Theme.INSTANCE;
                        long pressed9 = theme9.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                        composerStartRestartGroup.startReplaceableGroup(109719788);
                        if (!z11) {
                            EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1831077280);
                        zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme9.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme9.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme9.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme9.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed9, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function4 = function2;
                        function5 = function3;
                        str8 = str10;
                        str9 = str7;
                        i32 = i30;
                        z12 = z11;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new o(modifier2, i29, z12, str6, str9, str8, i32, function4, function5, i12, i13));
                    }
                }
                i14 |= 24576;
                str5 = str2;
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i12 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(str3)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(i11)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 128;
                if (i25 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                i27 = i13 & 256;
                if (i27 != 0) {
                    i14 |= 100663296;
                } else if ((i12 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i28 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i28 = 33554432;
                    }
                    i14 |= i28;
                }
                if ((i14 & 191739611) == 38347922) {
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i34 != 0) {
                        i29 = 5000;
                    } else {
                        i29 = i10;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i21 == 0) {
                    }
                    if (i23 != 0) {
                        i30 = 0;
                    } else {
                        i30 = i11;
                    }
                    if (i25 != 0) {
                        function2 = i.f37079p0;
                    } else {
                        function2 = function0;
                    }
                    if (i27 != 0) {
                        function3 = j.f37080p0;
                    } else {
                        function3 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    companion = Composer.INSTANCE;
                    if (objB == companion.getEmpty()) {
                        objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState = (MutableFloatState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        i31 = 2;
                        objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        i31 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default10 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default10);
                        objRememberedValue4 = mutableStateMutableStateOf$default10;
                        obj = null;
                    } else {
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    animatable = (Animatable) objRememberedValue5;
                    Theme theme10 = Theme.INSTANCE;
                    long pressed10 = theme10.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                    composerStartRestartGroup.startReplaceableGroup(109719788);
                    if (!z11) {
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1831077280);
                    zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme10.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme10.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme10.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme10.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed10, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function2;
                    function5 = function3;
                    str8 = str10;
                    str9 = str7;
                    i32 = i30;
                    z12 = z11;
                } else {
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i34 != 0) {
                        i29 = 5000;
                    } else {
                        i29 = i10;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i21 == 0) {
                    }
                    if (i23 != 0) {
                        i30 = 0;
                    } else {
                        i30 = i11;
                    }
                    if (i25 != 0) {
                        function2 = i.f37079p0;
                    } else {
                        function2 = function0;
                    }
                    if (i27 != 0) {
                        function3 = j.f37080p0;
                    } else {
                        function3 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    companion = Composer.INSTANCE;
                    if (objB == companion.getEmpty()) {
                        objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState = (MutableFloatState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        i31 = 2;
                        objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        i31 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default11 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default11);
                        objRememberedValue4 = mutableStateMutableStateOf$default11;
                        obj = null;
                    } else {
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    animatable = (Animatable) objRememberedValue5;
                    Theme theme11 = Theme.INSTANCE;
                    long pressed11 = theme11.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                    composerStartRestartGroup.startReplaceableGroup(109719788);
                    if (!z11) {
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1831077280);
                    zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme11.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme11.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme11.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme11.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed11, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function2;
                    function5 = function3;
                    str8 = str10;
                    str9 = str7;
                    i32 = i30;
                    z12 = z11;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new o(modifier2, i29, z12, str6, str9, str8, i32, function4, function5, i12, i13));
                }
            }
            i14 |= 3072;
            str4 = str;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((57344 & i12) == 0) {
                    str5 = str2;
                    if (composerStartRestartGroup.changed(str5)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i12 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(str3)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(i11)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 128;
                if (i25 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                i27 = i13 & 256;
                if (i27 != 0) {
                    i14 |= 100663296;
                } else if ((i12 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i28 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i28 = 33554432;
                    }
                    i14 |= i28;
                }
                if ((i14 & 191739611) == 38347922) {
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i34 != 0) {
                        i29 = 5000;
                    } else {
                        i29 = i10;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i21 == 0) {
                    }
                    if (i23 != 0) {
                        i30 = 0;
                    } else {
                        i30 = i11;
                    }
                    if (i25 != 0) {
                        function2 = i.f37079p0;
                    } else {
                        function2 = function0;
                    }
                    if (i27 != 0) {
                        function3 = j.f37080p0;
                    } else {
                        function3 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    companion = Composer.INSTANCE;
                    if (objB == companion.getEmpty()) {
                        objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState = (MutableFloatState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        i31 = 2;
                        objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        i31 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default12 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default12);
                        objRememberedValue4 = mutableStateMutableStateOf$default12;
                        obj = null;
                    } else {
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    animatable = (Animatable) objRememberedValue5;
                    Theme theme12 = Theme.INSTANCE;
                    long pressed12 = theme12.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                    composerStartRestartGroup.startReplaceableGroup(109719788);
                    if (!z11) {
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1831077280);
                    zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme12.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme12.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme12.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme12.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed12, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function2;
                    function5 = function3;
                    str8 = str10;
                    str9 = str7;
                    i32 = i30;
                    z12 = z11;
                } else {
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i34 != 0) {
                        i29 = 5000;
                    } else {
                        i29 = i10;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i21 == 0) {
                    }
                    if (i23 != 0) {
                        i30 = 0;
                    } else {
                        i30 = i11;
                    }
                    if (i25 != 0) {
                        function2 = i.f37079p0;
                    } else {
                        function2 = function0;
                    }
                    if (i27 != 0) {
                        function3 = j.f37080p0;
                    } else {
                        function3 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    companion = Composer.INSTANCE;
                    if (objB == companion.getEmpty()) {
                        objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState = (MutableFloatState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        i31 = 2;
                        objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        i31 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default13 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default13);
                        objRememberedValue4 = mutableStateMutableStateOf$default13;
                        obj = null;
                    } else {
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    animatable = (Animatable) objRememberedValue5;
                    Theme theme13 = Theme.INSTANCE;
                    long pressed13 = theme13.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                    composerStartRestartGroup.startReplaceableGroup(109719788);
                    if (!z11) {
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1831077280);
                    zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme13.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme13.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme13.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme13.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed13, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function2;
                    function5 = function3;
                    str8 = str10;
                    str9 = str7;
                    i32 = i30;
                    z12 = z11;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new o(modifier2, i29, z12, str6, str9, str8, i32, function4, function5, i12, i13));
                }
            }
            i14 |= 24576;
            str5 = str2;
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i12 & 458752) == 0) {
                if (composerStartRestartGroup.changed(str3)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(i11)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i14 |= i24;
            }
            i25 = i13 & 128;
            if (i25 != 0) {
                i14 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            i27 = i13 & 256;
            if (i27 != 0) {
                i14 |= 100663296;
            } else if ((i12 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i28 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i28 = 33554432;
                }
                i14 |= i28;
            }
            if ((i14 & 191739611) == 38347922) {
                if (i33 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i34 != 0) {
                    i29 = 5000;
                } else {
                    i29 = i10;
                }
                if (i15 != 0) {
                    z11 = true;
                }
                if (i17 != 0) {
                    str6 = "";
                } else {
                    str6 = str4;
                }
                if (i19 != 0) {
                    str7 = "";
                } else {
                    str7 = str5;
                }
                if (i21 == 0) {
                }
                if (i23 != 0) {
                    i30 = 0;
                } else {
                    i30 = i11;
                }
                if (i25 != 0) {
                    function2 = i.f37079p0;
                } else {
                    function2 = function0;
                }
                if (i27 != 0) {
                    function3 = j.f37080p0;
                } else {
                    function3 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                companion = Composer.INSTANCE;
                if (objB == companion.getEmpty()) {
                    objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableFloatState = (MutableFloatState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    i31 = 2;
                    objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    i31 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue3;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default14 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default14);
                    objRememberedValue4 = mutableStateMutableStateOf$default14;
                    obj = null;
                } else {
                    obj = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue4;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                animatable = (Animatable) objRememberedValue5;
                Theme theme14 = Theme.INSTANCE;
                long pressed14 = theme14.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                composerStartRestartGroup.startReplaceableGroup(109719788);
                if (!z11) {
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1831077280);
                zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme14.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme14.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme14.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme14.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed14, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function2;
                function5 = function3;
                str8 = str10;
                str9 = str7;
                i32 = i30;
                z12 = z11;
            } else {
                if (i33 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i34 != 0) {
                    i29 = 5000;
                } else {
                    i29 = i10;
                }
                if (i15 != 0) {
                    z11 = true;
                }
                if (i17 != 0) {
                    str6 = "";
                } else {
                    str6 = str4;
                }
                if (i19 != 0) {
                    str7 = "";
                } else {
                    str7 = str5;
                }
                if (i21 == 0) {
                }
                if (i23 != 0) {
                    i30 = 0;
                } else {
                    i30 = i11;
                }
                if (i25 != 0) {
                    function2 = i.f37079p0;
                } else {
                    function2 = function0;
                }
                if (i27 != 0) {
                    function3 = j.f37080p0;
                } else {
                    function3 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                companion = Composer.INSTANCE;
                if (objB == companion.getEmpty()) {
                    objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableFloatState = (MutableFloatState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    i31 = 2;
                    objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    i31 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue3;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default15 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default15);
                    objRememberedValue4 = mutableStateMutableStateOf$default15;
                    obj = null;
                } else {
                    obj = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue4;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                animatable = (Animatable) objRememberedValue5;
                Theme theme15 = Theme.INSTANCE;
                long pressed15 = theme15.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                composerStartRestartGroup.startReplaceableGroup(109719788);
                if (!z11) {
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1831077280);
                zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme15.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme15.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme15.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme15.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed15, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function2;
                function5 = function3;
                str8 = str10;
                str9 = str7;
                i32 = i30;
                z12 = z11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new o(modifier2, i29, z12, str6, str9, str8, i32, function4, function5, i12, i13));
            }
        }
        i14 |= 48;
        i15 = i13 & 4;
        if (i15 != 0) {
            if ((i12 & 896) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i14 |= i16;
            }
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 7168) == 0) {
                    str4 = str;
                    if (composerStartRestartGroup.changed(str4)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((57344 & i12) == 0) {
                        str5 = str2;
                        if (composerStartRestartGroup.changed(str5)) {
                            i20 = 16384;
                        } else {
                            i20 = 8192;
                        }
                        i14 |= i20;
                    }
                    i21 = i13 & 32;
                    if (i21 != 0) {
                        i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i12 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(str3)) {
                            i22 = 131072;
                        } else {
                            i22 = 65536;
                        }
                        i14 |= i22;
                    }
                    i23 = i13 & 64;
                    if (i23 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(i11)) {
                            i24 = 1048576;
                        } else {
                            i24 = 524288;
                        }
                        i14 |= i24;
                    }
                    i25 = i13 & 128;
                    if (i25 != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 29360128) == 0) {
                        if (composerStartRestartGroup.changedInstance(function0)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    i27 = i13 & 256;
                    if (i27 != 0) {
                        i14 |= 100663296;
                    } else if ((i12 & 234881024) == 0) {
                        if (composerStartRestartGroup.changedInstance(function1)) {
                            i28 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i28 = 33554432;
                        }
                        i14 |= i28;
                    }
                    if ((i14 & 191739611) == 38347922) {
                        if (i33 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i34 != 0) {
                            i29 = 5000;
                        } else {
                            i29 = i10;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if (i17 != 0) {
                            str6 = "";
                        } else {
                            str6 = str4;
                        }
                        if (i19 != 0) {
                            str7 = "";
                        } else {
                            str7 = str5;
                        }
                        if (i21 == 0) {
                        }
                        if (i23 != 0) {
                            i30 = 0;
                        } else {
                            i30 = i11;
                        }
                        if (i25 != 0) {
                            function2 = i.f37079p0;
                        } else {
                            function2 = function0;
                        }
                        if (i27 != 0) {
                            function3 = j.f37080p0;
                        } else {
                            function3 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                        }
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        companion = Composer.INSTANCE;
                        if (objB == companion.getEmpty()) {
                            objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableFloatState = (MutableFloatState) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            i31 = 2;
                            objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            i31 = 2;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue3;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            MutableState mutableStateMutableStateOf$default16 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default16);
                            objRememberedValue4 = mutableStateMutableStateOf$default16;
                            obj = null;
                        } else {
                            obj = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        animatable = (Animatable) objRememberedValue5;
                        Theme theme16 = Theme.INSTANCE;
                        long pressed16 = theme16.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                        composerStartRestartGroup.startReplaceableGroup(109719788);
                        if (!z11) {
                            EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1831077280);
                        zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme16.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme16.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme16.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme16.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed16, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function4 = function2;
                        function5 = function3;
                        str8 = str10;
                        str9 = str7;
                        i32 = i30;
                        z12 = z11;
                    } else {
                        if (i33 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier;
                        }
                        if (i34 != 0) {
                            i29 = 5000;
                        } else {
                            i29 = i10;
                        }
                        if (i15 != 0) {
                            z11 = true;
                        }
                        if (i17 != 0) {
                            str6 = "";
                        } else {
                            str6 = str4;
                        }
                        if (i19 != 0) {
                            str7 = "";
                        } else {
                            str7 = str5;
                        }
                        if (i21 == 0) {
                        }
                        if (i23 != 0) {
                            i30 = 0;
                        } else {
                            i30 = i11;
                        }
                        if (i25 != 0) {
                            function2 = i.f37079p0;
                        } else {
                            function2 = function0;
                        }
                        if (i27 != 0) {
                            function3 = j.f37080p0;
                        } else {
                            function3 = function1;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                        }
                        objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                        companion = Composer.INSTANCE;
                        if (objB == companion.getEmpty()) {
                            objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableFloatState = (MutableFloatState) objRememberedValue;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            i31 = 2;
                            objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            i31 = 2;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState = (MutableState) objRememberedValue3;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            MutableState mutableStateMutableStateOf$default17 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                            composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default17);
                            objRememberedValue4 = mutableStateMutableStateOf$default17;
                            obj = null;
                        } else {
                            obj = null;
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableState2 = (MutableState) objRememberedValue4;
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        animatable = (Animatable) objRememberedValue5;
                        Theme theme17 = Theme.INSTANCE;
                        long pressed17 = theme17.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                        composerStartRestartGroup.startReplaceableGroup(109719788);
                        if (!z11) {
                            EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        composerStartRestartGroup.startReplaceableGroup(-1831077280);
                        zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        } else {
                            objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme17.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme17.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme17.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme17.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed17, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function4 = function2;
                        function5 = function3;
                        str8 = str10;
                        str9 = str7;
                        i32 = i30;
                        z12 = z11;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new o(modifier2, i29, z12, str6, str9, str8, i32, function4, function5, i12, i13));
                    }
                }
                i14 |= 24576;
                str5 = str2;
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i12 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(str3)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(i11)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 128;
                if (i25 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                i27 = i13 & 256;
                if (i27 != 0) {
                    i14 |= 100663296;
                } else if ((i12 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i28 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i28 = 33554432;
                    }
                    i14 |= i28;
                }
                if ((i14 & 191739611) == 38347922) {
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i34 != 0) {
                        i29 = 5000;
                    } else {
                        i29 = i10;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i21 == 0) {
                    }
                    if (i23 != 0) {
                        i30 = 0;
                    } else {
                        i30 = i11;
                    }
                    if (i25 != 0) {
                        function2 = i.f37079p0;
                    } else {
                        function2 = function0;
                    }
                    if (i27 != 0) {
                        function3 = j.f37080p0;
                    } else {
                        function3 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    companion = Composer.INSTANCE;
                    if (objB == companion.getEmpty()) {
                        objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState = (MutableFloatState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        i31 = 2;
                        objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        i31 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default18 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default18);
                        objRememberedValue4 = mutableStateMutableStateOf$default18;
                        obj = null;
                    } else {
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    animatable = (Animatable) objRememberedValue5;
                    Theme theme18 = Theme.INSTANCE;
                    long pressed18 = theme18.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                    composerStartRestartGroup.startReplaceableGroup(109719788);
                    if (!z11) {
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1831077280);
                    zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme18.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme18.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme18.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme18.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed18, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function2;
                    function5 = function3;
                    str8 = str10;
                    str9 = str7;
                    i32 = i30;
                    z12 = z11;
                } else {
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i34 != 0) {
                        i29 = 5000;
                    } else {
                        i29 = i10;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i21 == 0) {
                    }
                    if (i23 != 0) {
                        i30 = 0;
                    } else {
                        i30 = i11;
                    }
                    if (i25 != 0) {
                        function2 = i.f37079p0;
                    } else {
                        function2 = function0;
                    }
                    if (i27 != 0) {
                        function3 = j.f37080p0;
                    } else {
                        function3 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    companion = Composer.INSTANCE;
                    if (objB == companion.getEmpty()) {
                        objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState = (MutableFloatState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        i31 = 2;
                        objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        i31 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default19 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default19);
                        objRememberedValue4 = mutableStateMutableStateOf$default19;
                        obj = null;
                    } else {
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    animatable = (Animatable) objRememberedValue5;
                    Theme theme19 = Theme.INSTANCE;
                    long pressed19 = theme19.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                    composerStartRestartGroup.startReplaceableGroup(109719788);
                    if (!z11) {
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1831077280);
                    zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme19.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme19.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme19.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme19.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed19, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function2;
                    function5 = function3;
                    str8 = str10;
                    str9 = str7;
                    i32 = i30;
                    z12 = z11;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new o(modifier2, i29, z12, str6, str9, str8, i32, function4, function5, i12, i13));
                }
            }
            i14 |= 3072;
            str4 = str;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((57344 & i12) == 0) {
                    str5 = str2;
                    if (composerStartRestartGroup.changed(str5)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i12 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(str3)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(i11)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 128;
                if (i25 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                i27 = i13 & 256;
                if (i27 != 0) {
                    i14 |= 100663296;
                } else if ((i12 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i28 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i28 = 33554432;
                    }
                    i14 |= i28;
                }
                if ((i14 & 191739611) == 38347922) {
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i34 != 0) {
                        i29 = 5000;
                    } else {
                        i29 = i10;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i21 == 0) {
                    }
                    if (i23 != 0) {
                        i30 = 0;
                    } else {
                        i30 = i11;
                    }
                    if (i25 != 0) {
                        function2 = i.f37079p0;
                    } else {
                        function2 = function0;
                    }
                    if (i27 != 0) {
                        function3 = j.f37080p0;
                    } else {
                        function3 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    companion = Composer.INSTANCE;
                    if (objB == companion.getEmpty()) {
                        objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState = (MutableFloatState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        i31 = 2;
                        objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        i31 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default110 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default110);
                        objRememberedValue4 = mutableStateMutableStateOf$default110;
                        obj = null;
                    } else {
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    animatable = (Animatable) objRememberedValue5;
                    Theme theme110 = Theme.INSTANCE;
                    long pressed110 = theme110.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                    composerStartRestartGroup.startReplaceableGroup(109719788);
                    if (!z11) {
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1831077280);
                    zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme110.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme110.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme110.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme110.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed110, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function2;
                    function5 = function3;
                    str8 = str10;
                    str9 = str7;
                    i32 = i30;
                    z12 = z11;
                } else {
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i34 != 0) {
                        i29 = 5000;
                    } else {
                        i29 = i10;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i21 == 0) {
                    }
                    if (i23 != 0) {
                        i30 = 0;
                    } else {
                        i30 = i11;
                    }
                    if (i25 != 0) {
                        function2 = i.f37079p0;
                    } else {
                        function2 = function0;
                    }
                    if (i27 != 0) {
                        function3 = j.f37080p0;
                    } else {
                        function3 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    companion = Composer.INSTANCE;
                    if (objB == companion.getEmpty()) {
                        objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState = (MutableFloatState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        i31 = 2;
                        objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        i31 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default111 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default111);
                        objRememberedValue4 = mutableStateMutableStateOf$default111;
                        obj = null;
                    } else {
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    animatable = (Animatable) objRememberedValue5;
                    Theme theme111 = Theme.INSTANCE;
                    long pressed111 = theme111.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                    composerStartRestartGroup.startReplaceableGroup(109719788);
                    if (!z11) {
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1831077280);
                    zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme111.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme111.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme111.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme111.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed111, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function2;
                    function5 = function3;
                    str8 = str10;
                    str9 = str7;
                    i32 = i30;
                    z12 = z11;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new o(modifier2, i29, z12, str6, str9, str8, i32, function4, function5, i12, i13));
                }
            }
            i14 |= 24576;
            str5 = str2;
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i12 & 458752) == 0) {
                if (composerStartRestartGroup.changed(str3)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(i11)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i14 |= i24;
            }
            i25 = i13 & 128;
            if (i25 != 0) {
                i14 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            i27 = i13 & 256;
            if (i27 != 0) {
                i14 |= 100663296;
            } else if ((i12 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i28 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i28 = 33554432;
                }
                i14 |= i28;
            }
            if ((i14 & 191739611) == 38347922) {
                if (i33 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i34 != 0) {
                    i29 = 5000;
                } else {
                    i29 = i10;
                }
                if (i15 != 0) {
                    z11 = true;
                }
                if (i17 != 0) {
                    str6 = "";
                } else {
                    str6 = str4;
                }
                if (i19 != 0) {
                    str7 = "";
                } else {
                    str7 = str5;
                }
                if (i21 == 0) {
                }
                if (i23 != 0) {
                    i30 = 0;
                } else {
                    i30 = i11;
                }
                if (i25 != 0) {
                    function2 = i.f37079p0;
                } else {
                    function2 = function0;
                }
                if (i27 != 0) {
                    function3 = j.f37080p0;
                } else {
                    function3 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                companion = Composer.INSTANCE;
                if (objB == companion.getEmpty()) {
                    objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableFloatState = (MutableFloatState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    i31 = 2;
                    objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    i31 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue3;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default112 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default112);
                    objRememberedValue4 = mutableStateMutableStateOf$default112;
                    obj = null;
                } else {
                    obj = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue4;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                animatable = (Animatable) objRememberedValue5;
                Theme theme112 = Theme.INSTANCE;
                long pressed112 = theme112.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                composerStartRestartGroup.startReplaceableGroup(109719788);
                if (!z11) {
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1831077280);
                zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme112.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme112.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme112.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme112.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed112, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function2;
                function5 = function3;
                str8 = str10;
                str9 = str7;
                i32 = i30;
                z12 = z11;
            } else {
                if (i33 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i34 != 0) {
                    i29 = 5000;
                } else {
                    i29 = i10;
                }
                if (i15 != 0) {
                    z11 = true;
                }
                if (i17 != 0) {
                    str6 = "";
                } else {
                    str6 = str4;
                }
                if (i19 != 0) {
                    str7 = "";
                } else {
                    str7 = str5;
                }
                if (i21 == 0) {
                }
                if (i23 != 0) {
                    i30 = 0;
                } else {
                    i30 = i11;
                }
                if (i25 != 0) {
                    function2 = i.f37079p0;
                } else {
                    function2 = function0;
                }
                if (i27 != 0) {
                    function3 = j.f37080p0;
                } else {
                    function3 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                companion = Composer.INSTANCE;
                if (objB == companion.getEmpty()) {
                    objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableFloatState = (MutableFloatState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    i31 = 2;
                    objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    i31 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue3;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default113 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default113);
                    objRememberedValue4 = mutableStateMutableStateOf$default113;
                    obj = null;
                } else {
                    obj = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue4;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                animatable = (Animatable) objRememberedValue5;
                Theme theme113 = Theme.INSTANCE;
                long pressed113 = theme113.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                composerStartRestartGroup.startReplaceableGroup(109719788);
                if (!z11) {
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1831077280);
                zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme113.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme113.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme113.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme113.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed113, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function2;
                function5 = function3;
                str8 = str10;
                str9 = str7;
                i32 = i30;
                z12 = z11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new o(modifier2, i29, z12, str6, str9, str8, i32, function4, function5, i12, i13));
            }
        }
        i14 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        z11 = z10;
        i17 = i13 & 8;
        if (i17 != 0) {
            if ((i12 & 7168) == 0) {
                str4 = str;
                if (composerStartRestartGroup.changed(str4)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i14 |= i18;
            }
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((57344 & i12) == 0) {
                    str5 = str2;
                    if (composerStartRestartGroup.changed(str5)) {
                        i20 = 16384;
                    } else {
                        i20 = 8192;
                    }
                    i14 |= i20;
                }
                i21 = i13 & 32;
                if (i21 != 0) {
                    i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i12 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(str3)) {
                        i22 = 131072;
                    } else {
                        i22 = 65536;
                    }
                    i14 |= i22;
                }
                i23 = i13 & 64;
                if (i23 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(i11)) {
                        i24 = 1048576;
                    } else {
                        i24 = 524288;
                    }
                    i14 |= i24;
                }
                i25 = i13 & 128;
                if (i25 != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 29360128) == 0) {
                    if (composerStartRestartGroup.changedInstance(function0)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                i27 = i13 & 256;
                if (i27 != 0) {
                    i14 |= 100663296;
                } else if ((i12 & 234881024) == 0) {
                    if (composerStartRestartGroup.changedInstance(function1)) {
                        i28 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i28 = 33554432;
                    }
                    i14 |= i28;
                }
                if ((i14 & 191739611) == 38347922) {
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i34 != 0) {
                        i29 = 5000;
                    } else {
                        i29 = i10;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i21 == 0) {
                    }
                    if (i23 != 0) {
                        i30 = 0;
                    } else {
                        i30 = i11;
                    }
                    if (i25 != 0) {
                        function2 = i.f37079p0;
                    } else {
                        function2 = function0;
                    }
                    if (i27 != 0) {
                        function3 = j.f37080p0;
                    } else {
                        function3 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    companion = Composer.INSTANCE;
                    if (objB == companion.getEmpty()) {
                        objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState = (MutableFloatState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        i31 = 2;
                        objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        i31 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default114 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default114);
                        objRememberedValue4 = mutableStateMutableStateOf$default114;
                        obj = null;
                    } else {
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    animatable = (Animatable) objRememberedValue5;
                    Theme theme114 = Theme.INSTANCE;
                    long pressed114 = theme114.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                    composerStartRestartGroup.startReplaceableGroup(109719788);
                    if (!z11) {
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1831077280);
                    zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme114.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme114.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme114.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme114.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed114, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function2;
                    function5 = function3;
                    str8 = str10;
                    str9 = str7;
                    i32 = i30;
                    z12 = z11;
                } else {
                    if (i33 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier;
                    }
                    if (i34 != 0) {
                        i29 = 5000;
                    } else {
                        i29 = i10;
                    }
                    if (i15 != 0) {
                        z11 = true;
                    }
                    if (i17 != 0) {
                        str6 = "";
                    } else {
                        str6 = str4;
                    }
                    if (i19 != 0) {
                        str7 = "";
                    } else {
                        str7 = str5;
                    }
                    if (i21 == 0) {
                    }
                    if (i23 != 0) {
                        i30 = 0;
                    } else {
                        i30 = i11;
                    }
                    if (i25 != 0) {
                        function2 = i.f37079p0;
                    } else {
                        function2 = function0;
                    }
                    if (i27 != 0) {
                        function3 = j.f37080p0;
                    } else {
                        function3 = function1;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                    }
                    objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                    companion = Composer.INSTANCE;
                    if (objB == companion.getEmpty()) {
                        objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState = (MutableFloatState) objRememberedValue;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        i31 = 2;
                        objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        i31 = 2;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState = (MutableState) objRememberedValue3;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        MutableState mutableStateMutableStateOf$default115 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                        composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default115);
                        objRememberedValue4 = mutableStateMutableStateOf$default115;
                        obj = null;
                    } else {
                        obj = null;
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableState2 = (MutableState) objRememberedValue4;
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    animatable = (Animatable) objRememberedValue5;
                    Theme theme115 = Theme.INSTANCE;
                    long pressed115 = theme115.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                    composerStartRestartGroup.startReplaceableGroup(109719788);
                    if (!z11) {
                        EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    composerStartRestartGroup.startReplaceableGroup(-1831077280);
                    zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme115.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme115.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme115.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme115.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed115, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function4 = function2;
                    function5 = function3;
                    str8 = str10;
                    str9 = str7;
                    i32 = i30;
                    z12 = z11;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new o(modifier2, i29, z12, str6, str9, str8, i32, function4, function5, i12, i13));
                }
            }
            i14 |= 24576;
            str5 = str2;
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i12 & 458752) == 0) {
                if (composerStartRestartGroup.changed(str3)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(i11)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i14 |= i24;
            }
            i25 = i13 & 128;
            if (i25 != 0) {
                i14 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            i27 = i13 & 256;
            if (i27 != 0) {
                i14 |= 100663296;
            } else if ((i12 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i28 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i28 = 33554432;
                }
                i14 |= i28;
            }
            if ((i14 & 191739611) == 38347922) {
                if (i33 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i34 != 0) {
                    i29 = 5000;
                } else {
                    i29 = i10;
                }
                if (i15 != 0) {
                    z11 = true;
                }
                if (i17 != 0) {
                    str6 = "";
                } else {
                    str6 = str4;
                }
                if (i19 != 0) {
                    str7 = "";
                } else {
                    str7 = str5;
                }
                if (i21 == 0) {
                }
                if (i23 != 0) {
                    i30 = 0;
                } else {
                    i30 = i11;
                }
                if (i25 != 0) {
                    function2 = i.f37079p0;
                } else {
                    function2 = function0;
                }
                if (i27 != 0) {
                    function3 = j.f37080p0;
                } else {
                    function3 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                companion = Composer.INSTANCE;
                if (objB == companion.getEmpty()) {
                    objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableFloatState = (MutableFloatState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    i31 = 2;
                    objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    i31 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue3;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default116 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default116);
                    objRememberedValue4 = mutableStateMutableStateOf$default116;
                    obj = null;
                } else {
                    obj = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue4;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                animatable = (Animatable) objRememberedValue5;
                Theme theme116 = Theme.INSTANCE;
                long pressed116 = theme116.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                composerStartRestartGroup.startReplaceableGroup(109719788);
                if (!z11) {
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1831077280);
                zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme116.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme116.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme116.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme116.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed116, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function2;
                function5 = function3;
                str8 = str10;
                str9 = str7;
                i32 = i30;
                z12 = z11;
            } else {
                if (i33 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i34 != 0) {
                    i29 = 5000;
                } else {
                    i29 = i10;
                }
                if (i15 != 0) {
                    z11 = true;
                }
                if (i17 != 0) {
                    str6 = "";
                } else {
                    str6 = str4;
                }
                if (i19 != 0) {
                    str7 = "";
                } else {
                    str7 = str5;
                }
                if (i21 == 0) {
                }
                if (i23 != 0) {
                    i30 = 0;
                } else {
                    i30 = i11;
                }
                if (i25 != 0) {
                    function2 = i.f37079p0;
                } else {
                    function2 = function0;
                }
                if (i27 != 0) {
                    function3 = j.f37080p0;
                } else {
                    function3 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                companion = Composer.INSTANCE;
                if (objB == companion.getEmpty()) {
                    objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableFloatState = (MutableFloatState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    i31 = 2;
                    objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    i31 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue3;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default117 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default117);
                    objRememberedValue4 = mutableStateMutableStateOf$default117;
                    obj = null;
                } else {
                    obj = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue4;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                animatable = (Animatable) objRememberedValue5;
                Theme theme117 = Theme.INSTANCE;
                long pressed117 = theme117.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                composerStartRestartGroup.startReplaceableGroup(109719788);
                if (!z11) {
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1831077280);
                zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme117.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme117.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme117.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme117.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed117, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function2;
                function5 = function3;
                str8 = str10;
                str9 = str7;
                i32 = i30;
                z12 = z11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new o(modifier2, i29, z12, str6, str9, str8, i32, function4, function5, i12, i13));
            }
        }
        i14 |= 3072;
        str4 = str;
        i19 = i13 & 16;
        if (i19 != 0) {
            if ((57344 & i12) == 0) {
                str5 = str2;
                if (composerStartRestartGroup.changed(str5)) {
                    i20 = 16384;
                } else {
                    i20 = 8192;
                }
                i14 |= i20;
            }
            i21 = i13 & 32;
            if (i21 != 0) {
                i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i12 & 458752) == 0) {
                if (composerStartRestartGroup.changed(str3)) {
                    i22 = 131072;
                } else {
                    i22 = 65536;
                }
                i14 |= i22;
            }
            i23 = i13 & 64;
            if (i23 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(i11)) {
                    i24 = 1048576;
                } else {
                    i24 = 524288;
                }
                i14 |= i24;
            }
            i25 = i13 & 128;
            if (i25 != 0) {
                i14 |= 12582912;
            } else if ((i12 & 29360128) == 0) {
                if (composerStartRestartGroup.changedInstance(function0)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            i27 = i13 & 256;
            if (i27 != 0) {
                i14 |= 100663296;
            } else if ((i12 & 234881024) == 0) {
                if (composerStartRestartGroup.changedInstance(function1)) {
                    i28 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i28 = 33554432;
                }
                i14 |= i28;
            }
            if ((i14 & 191739611) == 38347922) {
                if (i33 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i34 != 0) {
                    i29 = 5000;
                } else {
                    i29 = i10;
                }
                if (i15 != 0) {
                    z11 = true;
                }
                if (i17 != 0) {
                    str6 = "";
                } else {
                    str6 = str4;
                }
                if (i19 != 0) {
                    str7 = "";
                } else {
                    str7 = str5;
                }
                if (i21 == 0) {
                }
                if (i23 != 0) {
                    i30 = 0;
                } else {
                    i30 = i11;
                }
                if (i25 != 0) {
                    function2 = i.f37079p0;
                } else {
                    function2 = function0;
                }
                if (i27 != 0) {
                    function3 = j.f37080p0;
                } else {
                    function3 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                companion = Composer.INSTANCE;
                if (objB == companion.getEmpty()) {
                    objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableFloatState = (MutableFloatState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    i31 = 2;
                    objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    i31 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue3;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default118 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default118);
                    objRememberedValue4 = mutableStateMutableStateOf$default118;
                    obj = null;
                } else {
                    obj = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue4;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                animatable = (Animatable) objRememberedValue5;
                Theme theme118 = Theme.INSTANCE;
                long pressed118 = theme118.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                composerStartRestartGroup.startReplaceableGroup(109719788);
                if (!z11) {
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1831077280);
                zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme118.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme118.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme118.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme118.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed118, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function2;
                function5 = function3;
                str8 = str10;
                str9 = str7;
                i32 = i30;
                z12 = z11;
            } else {
                if (i33 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier;
                }
                if (i34 != 0) {
                    i29 = 5000;
                } else {
                    i29 = i10;
                }
                if (i15 != 0) {
                    z11 = true;
                }
                if (i17 != 0) {
                    str6 = "";
                } else {
                    str6 = str4;
                }
                if (i19 != 0) {
                    str7 = "";
                } else {
                    str7 = str5;
                }
                if (i21 == 0) {
                }
                if (i23 != 0) {
                    i30 = 0;
                } else {
                    i30 = i11;
                }
                if (i25 != 0) {
                    function2 = i.f37079p0;
                } else {
                    function2 = function0;
                }
                if (i27 != 0) {
                    function3 = j.f37080p0;
                } else {
                    function3 = function1;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
                }
                objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
                companion = Composer.INSTANCE;
                if (objB == companion.getEmpty()) {
                    objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
                }
                composerStartRestartGroup.endReplaceableGroup();
                coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableFloatState = (MutableFloatState) objRememberedValue;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableFloatState2 = (MutableFloatState) objRememberedValue2;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    i31 = 2;
                    objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    i31 = 2;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState = (MutableState) objRememberedValue3;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    MutableState mutableStateMutableStateOf$default119 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                    composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default119);
                    objRememberedValue4 = mutableStateMutableStateOf$default119;
                    obj = null;
                } else {
                    obj = null;
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableState2 = (MutableState) objRememberedValue4;
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceableGroup();
                animatable = (Animatable) objRememberedValue5;
                Theme theme119 = Theme.INSTANCE;
                long pressed119 = theme119.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
                composerStartRestartGroup.startReplaceableGroup(109719788);
                if (!z11) {
                    EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
                }
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.startReplaceableGroup(-1831077280);
                zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceableGroup();
                a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme119.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme119.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme119.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme119.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed119, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                function4 = function2;
                function5 = function3;
                str8 = str10;
                str9 = str7;
                i32 = i30;
                z12 = z11;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new o(modifier2, i29, z12, str6, str9, str8, i32, function4, function5, i12, i13));
            }
        }
        i14 |= 24576;
        str5 = str2;
        i21 = i13 & 32;
        if (i21 != 0) {
            i14 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i12 & 458752) == 0) {
            if (composerStartRestartGroup.changed(str3)) {
                i22 = 131072;
            } else {
                i22 = 65536;
            }
            i14 |= i22;
        }
        i23 = i13 & 64;
        if (i23 != 0) {
            i14 |= 1572864;
        } else if ((i12 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(i11)) {
                i24 = 1048576;
            } else {
                i24 = 524288;
            }
            i14 |= i24;
        }
        i25 = i13 & 128;
        if (i25 != 0) {
            i14 |= 12582912;
        } else if ((i12 & 29360128) == 0) {
            if (composerStartRestartGroup.changedInstance(function0)) {
                i26 = 8388608;
            } else {
                i26 = 4194304;
            }
            i14 |= i26;
        }
        i27 = i13 & 256;
        if (i27 != 0) {
            i14 |= 100663296;
        } else if ((i12 & 234881024) == 0) {
            if (composerStartRestartGroup.changedInstance(function1)) {
                i28 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            } else {
                i28 = 33554432;
            }
            i14 |= i28;
        }
        if ((i14 & 191739611) == 38347922) {
            if (i33 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i34 != 0) {
                i29 = 5000;
            } else {
                i29 = i10;
            }
            if (i15 != 0) {
                z11 = true;
            }
            if (i17 != 0) {
                str6 = "";
            } else {
                str6 = str4;
            }
            if (i19 != 0) {
                str7 = "";
            } else {
                str7 = str5;
            }
            if (i21 == 0) {
            }
            if (i23 != 0) {
                i30 = 0;
            } else {
                i30 = i11;
            }
            if (i25 != 0) {
                function2 = i.f37079p0;
            } else {
                function2 = function0;
            }
            if (i27 != 0) {
                function3 = j.f37080p0;
            } else {
                function3 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
            }
            objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
            companion = Composer.INSTANCE;
            if (objB == companion.getEmpty()) {
                objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableFloatState = (MutableFloatState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableFloatState2 = (MutableFloatState) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                i31 = 2;
                objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                i31 = 2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue3;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default1110 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default1110);
                objRememberedValue4 = mutableStateMutableStateOf$default1110;
                obj = null;
            } else {
                obj = null;
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState2 = (MutableState) objRememberedValue4;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            animatable = (Animatable) objRememberedValue5;
            Theme theme1110 = Theme.INSTANCE;
            long pressed1110 = theme1110.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
            composerStartRestartGroup.startReplaceableGroup(109719788);
            if (!z11) {
                EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1831077280);
            zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme1110.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme1110.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme1110.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme1110.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed1110, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function4 = function2;
            function5 = function3;
            str8 = str10;
            str9 = str7;
            i32 = i30;
            z12 = z11;
        } else {
            if (i33 != 0) {
                modifier2 = Modifier.INSTANCE;
            } else {
                modifier2 = modifier;
            }
            if (i34 != 0) {
                i29 = 5000;
            } else {
                i29 = i10;
            }
            if (i15 != 0) {
                z11 = true;
            }
            if (i17 != 0) {
                str6 = "";
            } else {
                str6 = str4;
            }
            if (i19 != 0) {
                str7 = "";
            } else {
                str7 = str5;
            }
            if (i21 == 0) {
            }
            if (i23 != 0) {
                i30 = 0;
            } else {
                i30 = i11;
            }
            if (i25 != 0) {
                function2 = i.f37079p0;
            } else {
                function2 = function0;
            }
            if (i27 != 0) {
                function3 = j.f37080p0;
            } else {
                function3 = function1;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1439055067, i14, -1, "com.bbva.ui.compose.PrimaryProgressButton (Button.kt:190)");
            }
            objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
            companion = Composer.INSTANCE;
            if (objB == companion.getEmpty()) {
                objB = u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableFloatState = (MutableFloatState) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = PrimitiveSnapshotStateKt.mutableFloatStateOf(0.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableFloatState2 = (MutableFloatState) objRememberedValue2;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                i31 = 2;
                objRememberedValue3 = SnapshotStateKt.mutableStateOf$default(str6, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                i31 = 2;
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState = (MutableState) objRememberedValue3;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                MutableState mutableStateMutableStateOf$default1111 = SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, i31, null);
                composerStartRestartGroup.updateRememberedValue(mutableStateMutableStateOf$default1111);
                objRememberedValue4 = mutableStateMutableStateOf$default1111;
                obj = null;
            } else {
                obj = null;
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableState2 = (MutableState) objRememberedValue4;
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = AnimatableKt.Animatable$default(0.0f, 0.0f, i31, obj);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            }
            composerStartRestartGroup.endReplaceableGroup();
            animatable = (Animatable) objRememberedValue5;
            Theme theme1111 = Theme.INSTANCE;
            long pressed1111 = theme1111.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getPressed();
            composerStartRestartGroup.startReplaceableGroup(109719788);
            if (!z11) {
                EffectsKt.LaunchedEffect(Unit.INSTANCE, new k(animatable, coroutineScope, str6, mutableState2, mutableState, null), composerStartRestartGroup, 70);
            }
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(-1831077280);
            zChanged = composerStartRestartGroup.changed(mutableFloatState) | composerStartRestartGroup.changed(mutableFloatState2);
            objRememberedValue6 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            } else {
                objRememberedValue6 = new l(mutableFloatState, mutableFloatState2);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
            }
            composerStartRestartGroup.endReplaceableGroup();
            a(new m(function2, coroutineScope, str7, mutableState2, animatable, i29, function3, mutableFloatState, mutableState), OnRemeasuredModifierKt.onSizeChanged(modifier2, (Function1) objRememberedValue6), z11, null, null, null, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme1111.getColors(composerStartRestartGroup, 6).getCta().getMain().getBackground().getDefault(), theme1111.getColors(composerStartRestartGroup, 6).getCta().getMain().getText().getDefault(), theme1111.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme1111.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), 0L, 0L, PaddingKt.m289PaddingValues0680j_4(Dp.m4389constructorimpl(0)), ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1515919891, true, new n(str6, i30, str10, animatable, pressed1111, mutableFloatState2, mutableState)), composerStartRestartGroup, (i14 & 896) | 805306368, 6, 440);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            function4 = function2;
            function5 = function3;
            str8 = str10;
            str9 = str7;
            i32 = i30;
            z12 = z11;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new o(modifier2, i29, z12, str6, str9, str8, i32, function4, function5, i12, i13));
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00de  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:71:0x014a  */
    /* JADX WARN: Code duplicated, block: B:72:0x014d  */
    /* JADX WARN: Code duplicated, block: B:75:0x0201  */
    /* JADX WARN: Code duplicated, block: B:79:0x020e  */
    /* JADX WARN: Code duplicated, block: B:81:? A[RETURN, SYNTHETIC] */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final void SecondaryButton(@NotNull Function0<Unit> onClick, @Nullable Modifier modifier, boolean z10, @NotNull String text, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        Modifier modifier3;
        boolean z12;
        Object objRememberedValue;
        MutableInteractionSource mutableInteractionSource;
        long pressed;
        BorderStroke borderStrokeM142BorderStrokecXLIe8U;
        BorderStroke borderStroke;
        Composer composer2;
        Modifier modifier4;
        boolean z13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(text, "text");
        Composer composerStartRestartGroup = composer.startRestartGroup(1020646142);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(onClick) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(text)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i12 & 5851) == 1170 || !composerStartRestartGroup.getSkipping()) {
                    if (i16 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1020646142, i12, -1, "com.bbva.ui.compose.SecondaryButton (Button.kt:126)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                    if (PressInteractionKt.collectIsPressedAsState(mutableInteractionSource, composerStartRestartGroup, 6).getValue().booleanValue()) {
                        composerStartRestartGroup.startReplaceableGroup(2144005167);
                        pressed = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getBackground().getPressed();
                        composerStartRestartGroup.endReplaceableGroup();
                    } else {
                        composerStartRestartGroup.startReplaceableGroup(2144005238);
                        pressed = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getAndroidx.compose.material.OutlinedTextFieldKt.BorderId java.lang.String().getDefault();
                        composerStartRestartGroup.endReplaceableGroup();
                    }
                    State<Color> stateM58animateColorAsStateeuL9pac = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(pressed, null, null, null, composerStartRestartGroup, 0, 14);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                    borderStrokeM142BorderStrokecXLIe8U = BorderStrokeKt.m142BorderStrokecXLIe8U(Dp.m4389constructorimpl(2), stateM58animateColorAsStateeuL9pac.getValue().m2518unboximpl());
                    if (z12) {
                        borderStroke = borderStrokeM142BorderStrokecXLIe8U;
                    } else {
                        borderStroke = null;
                    }
                    Theme theme = Theme.INSTANCE;
                    Modifier modifier5 = modifier3;
                    composer2 = composerStartRestartGroup;
                    a(onClick, modifierFillMaxWidth$default, z12, mutableInteractionSource, null, borderStroke, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme.getColors(composerStartRestartGroup, 6).getSurface().getAmbient().getDefault(), theme.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getText().getDefault(), theme.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), theme.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getBackground().getPressed(), theme.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getText().getPressed(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1840753772, true, new p(text)), composer2, (i12 & 14) | 3072 | (i12 & 896), 6, 528);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier4 = modifier5;
                    z13 = z12;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier4 = modifier2;
                    z13 = z11;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new q(onClick, modifier4, z13, text, i10, i11));
                }
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            z11 = z10;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(text)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 5851) == 1170) {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020646142, i12, -1, "com.bbva.ui.compose.SecondaryButton (Button.kt:126)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                if (PressInteractionKt.collectIsPressedAsState(mutableInteractionSource, composerStartRestartGroup, 6).getValue().booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(2144005167);
                    pressed = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getBackground().getPressed();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(2144005238);
                    pressed = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getAndroidx.compose.material.OutlinedTextFieldKt.BorderId java.lang.String().getDefault();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                State<Color> stateM58animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(pressed, null, null, null, composerStartRestartGroup, 0, 14);
                Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                borderStrokeM142BorderStrokecXLIe8U = BorderStrokeKt.m142BorderStrokecXLIe8U(Dp.m4389constructorimpl(2), stateM58animateColorAsStateeuL9pac2.getValue().m2518unboximpl());
                if (z12) {
                    borderStroke = borderStrokeM142BorderStrokecXLIe8U;
                } else {
                    borderStroke = null;
                }
                Theme theme2 = Theme.INSTANCE;
                Modifier modifier6 = modifier3;
                composer2 = composerStartRestartGroup;
                a(onClick, modifierFillMaxWidth$default2, z12, mutableInteractionSource, null, borderStroke, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme2.getColors(composerStartRestartGroup, 6).getSurface().getAmbient().getDefault(), theme2.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getText().getDefault(), theme2.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme2.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), theme2.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getBackground().getPressed(), theme2.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getText().getPressed(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1840753772, true, new p(text)), composer2, (i12 & 14) | 3072 | (i12 & 896), 6, 528);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
                z13 = z12;
            } else {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020646142, i12, -1, "com.bbva.ui.compose.SecondaryButton (Button.kt:126)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                if (PressInteractionKt.collectIsPressedAsState(mutableInteractionSource, composerStartRestartGroup, 6).getValue().booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(2144005167);
                    pressed = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getBackground().getPressed();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(2144005238);
                    pressed = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getAndroidx.compose.material.OutlinedTextFieldKt.BorderId java.lang.String().getDefault();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                State<Color> stateM58animateColorAsStateeuL9pac3 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(pressed, null, null, null, composerStartRestartGroup, 0, 14);
                Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                borderStrokeM142BorderStrokecXLIe8U = BorderStrokeKt.m142BorderStrokecXLIe8U(Dp.m4389constructorimpl(2), stateM58animateColorAsStateeuL9pac3.getValue().m2518unboximpl());
                if (z12) {
                    borderStroke = borderStrokeM142BorderStrokecXLIe8U;
                } else {
                    borderStroke = null;
                }
                Theme theme3 = Theme.INSTANCE;
                Modifier modifier7 = modifier3;
                composer2 = composerStartRestartGroup;
                a(onClick, modifierFillMaxWidth$default3, z12, mutableInteractionSource, null, borderStroke, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme3.getColors(composerStartRestartGroup, 6).getSurface().getAmbient().getDefault(), theme3.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getText().getDefault(), theme3.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme3.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), theme3.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getBackground().getPressed(), theme3.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getText().getPressed(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1840753772, true, new p(text)), composer2, (i12 & 14) | 3072 | (i12 & 896), 6, 528);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier7;
                z13 = z12;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new q(onClick, modifier4, z13, text, i10, i11));
            }
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(text)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 5851) == 1170) {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020646142, i12, -1, "com.bbva.ui.compose.SecondaryButton (Button.kt:126)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                if (PressInteractionKt.collectIsPressedAsState(mutableInteractionSource, composerStartRestartGroup, 6).getValue().booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(2144005167);
                    pressed = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getBackground().getPressed();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(2144005238);
                    pressed = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getAndroidx.compose.material.OutlinedTextFieldKt.BorderId java.lang.String().getDefault();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                State<Color> stateM58animateColorAsStateeuL9pac4 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(pressed, null, null, null, composerStartRestartGroup, 0, 14);
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                borderStrokeM142BorderStrokecXLIe8U = BorderStrokeKt.m142BorderStrokecXLIe8U(Dp.m4389constructorimpl(2), stateM58animateColorAsStateeuL9pac4.getValue().m2518unboximpl());
                if (z12) {
                    borderStroke = borderStrokeM142BorderStrokecXLIe8U;
                } else {
                    borderStroke = null;
                }
                Theme theme4 = Theme.INSTANCE;
                Modifier modifier8 = modifier3;
                composer2 = composerStartRestartGroup;
                a(onClick, modifierFillMaxWidth$default4, z12, mutableInteractionSource, null, borderStroke, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme4.getColors(composerStartRestartGroup, 6).getSurface().getAmbient().getDefault(), theme4.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getText().getDefault(), theme4.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme4.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), theme4.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getBackground().getPressed(), theme4.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getText().getPressed(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1840753772, true, new p(text)), composer2, (i12 & 14) | 3072 | (i12 & 896), 6, 528);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier8;
                z13 = z12;
            } else {
                if (i16 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1020646142, i12, -1, "com.bbva.ui.compose.SecondaryButton (Button.kt:126)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
                if (PressInteractionKt.collectIsPressedAsState(mutableInteractionSource, composerStartRestartGroup, 6).getValue().booleanValue()) {
                    composerStartRestartGroup.startReplaceableGroup(2144005167);
                    pressed = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getBackground().getPressed();
                    composerStartRestartGroup.endReplaceableGroup();
                } else {
                    composerStartRestartGroup.startReplaceableGroup(2144005238);
                    pressed = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getAndroidx.compose.material.OutlinedTextFieldKt.BorderId java.lang.String().getDefault();
                    composerStartRestartGroup.endReplaceableGroup();
                }
                State<Color> stateM58animateColorAsStateeuL9pac5 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(pressed, null, null, null, composerStartRestartGroup, 0, 14);
                Modifier modifierFillMaxWidth$default5 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
                borderStrokeM142BorderStrokecXLIe8U = BorderStrokeKt.m142BorderStrokecXLIe8U(Dp.m4389constructorimpl(2), stateM58animateColorAsStateeuL9pac5.getValue().m2518unboximpl());
                if (z12) {
                    borderStroke = borderStrokeM142BorderStrokecXLIe8U;
                } else {
                    borderStroke = null;
                }
                Theme theme5 = Theme.INSTANCE;
                Modifier modifier9 = modifier3;
                composer2 = composerStartRestartGroup;
                a(onClick, modifierFillMaxWidth$default5, z12, mutableInteractionSource, null, borderStroke, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme5.getColors(composerStartRestartGroup, 6).getSurface().getAmbient().getDefault(), theme5.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getText().getDefault(), theme5.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme5.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), theme5.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getBackground().getPressed(), theme5.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getText().getPressed(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1840753772, true, new p(text)), composer2, (i12 & 14) | 3072 | (i12 & 896), 6, 528);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier9;
                z13 = z12;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new q(onClick, modifier4, z13, text, i10, i11));
            }
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        z11 = z10;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (composerStartRestartGroup.changed(text)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        if ((i12 & 5851) == 1170) {
            if (i16 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1020646142, i12, -1, "com.bbva.ui.compose.SecondaryButton (Button.kt:126)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            if (PressInteractionKt.collectIsPressedAsState(mutableInteractionSource, composerStartRestartGroup, 6).getValue().booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(2144005167);
                pressed = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getBackground().getPressed();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(2144005238);
                pressed = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getAndroidx.compose.material.OutlinedTextFieldKt.BorderId java.lang.String().getDefault();
                composerStartRestartGroup.endReplaceableGroup();
            }
            State<Color> stateM58animateColorAsStateeuL9pac6 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(pressed, null, null, null, composerStartRestartGroup, 0, 14);
            Modifier modifierFillMaxWidth$default6 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            borderStrokeM142BorderStrokecXLIe8U = BorderStrokeKt.m142BorderStrokecXLIe8U(Dp.m4389constructorimpl(2), stateM58animateColorAsStateeuL9pac6.getValue().m2518unboximpl());
            if (z12) {
                borderStroke = borderStrokeM142BorderStrokecXLIe8U;
            } else {
                borderStroke = null;
            }
            Theme theme6 = Theme.INSTANCE;
            Modifier modifier10 = modifier3;
            composer2 = composerStartRestartGroup;
            a(onClick, modifierFillMaxWidth$default6, z12, mutableInteractionSource, null, borderStroke, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme6.getColors(composerStartRestartGroup, 6).getSurface().getAmbient().getDefault(), theme6.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getText().getDefault(), theme6.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme6.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), theme6.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getBackground().getPressed(), theme6.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getText().getPressed(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1840753772, true, new p(text)), composer2, (i12 & 14) | 3072 | (i12 & 896), 6, 528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier10;
            z13 = z12;
        } else {
            if (i16 != 0) {
                modifier3 = Modifier.INSTANCE;
            } else {
                modifier3 = modifier2;
            }
            if (i13 != 0) {
                z12 = true;
            } else {
                z12 = z11;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1020646142, i12, -1, "com.bbva.ui.compose.SecondaryButton (Button.kt:126)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            mutableInteractionSource = (MutableInteractionSource) objRememberedValue;
            if (PressInteractionKt.collectIsPressedAsState(mutableInteractionSource, composerStartRestartGroup, 6).getValue().booleanValue()) {
                composerStartRestartGroup.startReplaceableGroup(2144005167);
                pressed = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getBackground().getPressed();
                composerStartRestartGroup.endReplaceableGroup();
            } else {
                composerStartRestartGroup.startReplaceableGroup(2144005238);
                pressed = Theme.INSTANCE.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getAndroidx.compose.material.OutlinedTextFieldKt.BorderId java.lang.String().getDefault();
                composerStartRestartGroup.endReplaceableGroup();
            }
            State<Color> stateM58animateColorAsStateeuL9pac7 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(pressed, null, null, null, composerStartRestartGroup, 0, 14);
            Modifier modifierFillMaxWidth$default7 = SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null);
            borderStrokeM142BorderStrokecXLIe8U = BorderStrokeKt.m142BorderStrokecXLIe8U(Dp.m4389constructorimpl(2), stateM58animateColorAsStateeuL9pac7.getValue().m2518unboximpl());
            if (z12) {
                borderStroke = borderStrokeM142BorderStrokecXLIe8U;
            } else {
                borderStroke = null;
            }
            Theme theme7 = Theme.INSTANCE;
            Modifier modifier11 = modifier3;
            composer2 = composerStartRestartGroup;
            a(onClick, modifierFillMaxWidth$default7, z12, mutableInteractionSource, null, borderStroke, ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(theme7.getColors(composerStartRestartGroup, 6).getSurface().getAmbient().getDefault(), theme7.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getText().getDefault(), theme7.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getBackground(), theme7.getColors(composerStartRestartGroup, 6).getCta().getCom.bbva.ui.component.menu.model.BaseMenuItem.STATE_DISABLED java.lang.String().getText(), composerStartRestartGroup, ButtonDefaults.$stable << 12, 0), theme7.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getBackground().getPressed(), theme7.getColors(composerStartRestartGroup, 6).getCta().getComplementary().getText().getPressed(), null, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1840753772, true, new p(text)), composer2, (i12 & 14) | 3072 | (i12 & 896), 6, 528);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier4 = modifier11;
            z13 = z12;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new q(onClick, modifier4, z13, text, i10, i11));
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0115  */
    /* JADX WARN: Code duplicated, block: B:102:0x011d  */
    /* JADX WARN: Code duplicated, block: B:104:0x0123  */
    /* JADX WARN: Code duplicated, block: B:105:0x0126  */
    /* JADX WARN: Code duplicated, block: B:109:0x012d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0130  */
    /* JADX WARN: Code duplicated, block: B:112:0x0134  */
    /* JADX WARN: Code duplicated, block: B:114:0x013a  */
    /* JADX WARN: Code duplicated, block: B:115:0x013c  */
    /* JADX WARN: Code duplicated, block: B:117:0x0140  */
    /* JADX WARN: Code duplicated, block: B:120:0x014c  */
    /* JADX WARN: Code duplicated, block: B:126:0x016d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0181  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:145:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:146:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:148:0x01be  */
    /* JADX WARN: Code duplicated, block: B:149:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:151:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:153:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:155:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:158:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:159:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:161:0x0202  */
    /* JADX WARN: Code duplicated, block: B:162:0x0206  */
    /* JADX WARN: Code duplicated, block: B:165:0x020c  */
    /* JADX WARN: Code duplicated, block: B:166:0x0238  */
    /* JADX WARN: Code duplicated, block: B:169:0x0247  */
    /* JADX WARN: Code duplicated, block: B:170:0x0263  */
    /* JADX WARN: Code duplicated, block: B:173:0x026b  */
    /* JADX WARN: Code duplicated, block: B:174:0x0285  */
    /* JADX WARN: Code duplicated, block: B:176:0x028b  */
    /* JADX WARN: Code duplicated, block: B:178:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:181:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:182:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:185:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:186:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:189:0x0336  */
    /* JADX WARN: Code duplicated, block: B:190:0x0339  */
    /* JADX WARN: Code duplicated, block: B:193:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:197:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:56:0x0097  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:94:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x0108  */
    /* JADX WARN: Code duplicated, block: B:99:0x010e  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void a(Function0<Unit> function0, Modifier modifier, boolean z10, MutableInteractionSource mutableInteractionSource, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, long j10, long j11, PaddingValues paddingValues, Function3<? super RowScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i10, int i11, int i12) {
        int i13;
        Modifier modifier2;
        int i14;
        boolean z11;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        PaddingValues paddingValues2;
        int i21;
        int i22;
        int i23;
        boolean z12;
        MutableInteractionSource mutableInteractionSource2;
        Shape shapeM482RoundedCornerShape0680j_4;
        int i24;
        BorderStroke borderStroke2;
        boolean z13;
        ButtonColors buttonColorsM680buttonColorsro_MJ88;
        long jM2518unboximpl;
        long jM2518unboximpl2;
        int i25;
        PaddingValues paddingValuesM290PaddingValuesYgX7TsA;
        MutableInteractionSource mutableInteractionSource3;
        Object objRememberedValue;
        long j12;
        State<Boolean> stateCollectIsPressedAsState;
        long jM2518unboximpl3;
        long jM2518unboximpl4;
        long j13;
        PaddingValues paddingValues3;
        long j14;
        BorderStroke borderStroke3;
        boolean z14;
        ButtonColors buttonColors2;
        MutableInteractionSource mutableInteractionSource4;
        Shape shape2;
        Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i26;
        int i27;
        int i28;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1316804655);
        if ((i12 & 1) != 0) {
            i13 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i13 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i10;
        } else {
            i13 = i10;
        }
        int i29 = i12 & 2;
        if (i29 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i13 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i14 = i12 & 4;
            if (i14 != 0) {
                if ((i10 & 896) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i15 = 256;
                    } else {
                        i15 = 128;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 8;
                if (i16 != 0) {
                    if ((i10 & 7168) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i17 = 2048;
                        } else {
                            i17 = 1024;
                        }
                        i13 |= i17;
                    }
                    if ((57344 & i10) != 0) {
                        i13 |= ((i12 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
                    }
                    i18 = i12 & 32;
                    if (i18 != 0) {
                        i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                    } else if ((i10 & 458752) == 0) {
                        if (composerStartRestartGroup.changed(borderStroke)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i13 |= i19;
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i12 & 64) == 0 || !composerStartRestartGroup.changed(buttonColors)) {
                            i28 = 524288;
                        } else {
                            i28 = 1048576;
                        }
                        i13 |= i28;
                    }
                    if ((i10 & 29360128) != 0) {
                        if ((i12 & 128) == 0 || !composerStartRestartGroup.changed(j10)) {
                            i27 = 4194304;
                        } else {
                            i27 = 8388608;
                        }
                        i13 |= i27;
                    }
                    if ((234881024 & i10) != 0) {
                        if ((i12 & 256) == 0 || !composerStartRestartGroup.changed(j11)) {
                            i26 = 33554432;
                        } else {
                            i26 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        }
                        i13 |= i26;
                    }
                    i20 = i12 & 512;
                    if (i20 != 0) {
                        i13 |= 805306368;
                        paddingValues2 = paddingValues;
                    } else {
                        paddingValues2 = paddingValues;
                        if ((i10 & 1879048192) == 0) {
                            if (composerStartRestartGroup.changed(paddingValues2)) {
                                i21 = PKIFailureInfo.duplicateCertReq;
                            } else {
                                i21 = 268435456;
                            }
                            i13 |= i21;
                        }
                    }
                    if ((i12 & 1024) != 0) {
                        i22 = i11 | 6;
                    } else if ((i11 & 14) == 0) {
                        if (composerStartRestartGroup.changedInstance(function3)) {
                            i23 = 4;
                        } else {
                            i23 = 2;
                        }
                        i22 = i11 | i23;
                    } else {
                        i22 = i11;
                    }
                    if ((i13 & 1533916891) != 306783378 && (i22 & 11) == 2 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        mutableInteractionSource4 = mutableInteractionSource;
                        borderStroke3 = borderStroke;
                        j14 = j11;
                        modifier3 = modifier2;
                        z14 = z11;
                        composerStartRestartGroup = composerStartRestartGroup;
                        shape2 = shape;
                        buttonColors2 = buttonColors;
                        paddingValues3 = paddingValues2;
                        j13 = j10;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i29 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            } else {
                                modifier2 = modifier2;
                            }
                            if (i14 != 0) {
                                z12 = true;
                            } else {
                                z12 = z11;
                            }
                            if (i16 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                            if ((i12 & 16) != 0) {
                                i24 = i13 & (-57345);
                                shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                            } else {
                                shapeM482RoundedCornerShape0680j_4 = shape;
                                i24 = i13;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if ((i12 & 64) != 0) {
                                z13 = z12;
                                buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                                i24 &= -3670017;
                            } else {
                                z13 = z12;
                                buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            }
                            if ((i12 & 128) != 0) {
                                z11 = z13;
                                jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                                i24 &= -29360129;
                            } else {
                                z11 = z13;
                                jM2518unboximpl = j10;
                            }
                            if ((i12 & 256) != 0) {
                                jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                                i25 = i24 & (-234881025);
                            } else {
                                jM2518unboximpl2 = j11;
                                i25 = i24;
                            }
                            if (i20 != 0) {
                                paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                            } else {
                                paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                            }
                            mutableInteractionSource3 = mutableInteractionSource2;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                            }
                            if ((i12 & 64) != 0) {
                                i13 &= -3670017;
                            }
                            if ((i12 & 128) != 0) {
                                i13 &= -29360129;
                            }
                            if ((i12 & 256) != 0) {
                                i13 &= -234881025;
                            }
                            shapeM482RoundedCornerShape0680j_4 = shape;
                            borderStroke2 = borderStroke;
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                            paddingValuesM290PaddingValuesYgX7TsA = paddingValues2;
                            i22 = i22;
                            composerStartRestartGroup = composerStartRestartGroup;
                            jM2518unboximpl = j10;
                            jM2518unboximpl2 = j11;
                            i25 = i13;
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        composerStartRestartGroup.endDefaults();
                        j12 = jM2518unboximpl;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1316804655, i25, i22, "com.bbva.ui.compose.Button (Button.kt:286)");
                        }
                        stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i25 >> 9) & 14);
                        composerStartRestartGroup.startReplaceableGroup(-329670602);
                        if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                            jM2518unboximpl3 = j12;
                        } else {
                            jM2518unboximpl3 = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        State<Color> stateM58animateColorAsStateeuL9pac = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl3, null, null, null, composerStartRestartGroup, 0, 14);
                        composerStartRestartGroup.startReplaceableGroup(-329670422);
                        if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                            jM2518unboximpl4 = jM2518unboximpl2;
                        } else {
                            jM2518unboximpl4 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        State<Color> stateM58animateColorAsStateeuL9pac2 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl4, null, null, null, composerStartRestartGroup, 0, 14);
                        b(function0, modifier2, z11, shapeM482RoundedCornerShape0680j_4, stateM58animateColorAsStateeuL9pac.getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateM58animateColorAsStateeuL9pac2.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1271502359, true, new a(stateM58animateColorAsStateeuL9pac2, paddingValuesM290PaddingValuesYgX7TsA, function3)), composerStartRestartGroup, (i25 & 14) | 100663296 | (i25 & 112) | (i25 & 896) | ((i25 >> 3) & 7168) | ((i25 << 3) & 3670016) | ((i25 << 12) & 29360128), 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j13 = j12;
                        paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                        j14 = jM2518unboximpl2;
                        borderStroke3 = borderStroke2;
                        z14 = z11;
                        buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                        mutableInteractionSource4 = mutableInteractionSource3;
                        Modifier modifier4 = modifier2;
                        shape2 = shapeM482RoundedCornerShape0680j_4;
                        modifier3 = modifier4;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new b(function0, modifier3, z14, mutableInteractionSource4, shape2, borderStroke3, buttonColors2, j13, j14, paddingValues3, function3, i10, i11, i12));
                    }
                }
                i13 |= 3072;
                if ((57344 & i10) != 0) {
                    i13 |= ((i12 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
                }
                i18 = i12 & 32;
                if (i18 != 0) {
                    i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(borderStroke)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i12 & 64) == 0) {
                        i28 = 524288;
                    } else {
                        i28 = 524288;
                    }
                    i13 |= i28;
                }
                if ((i10 & 29360128) != 0) {
                    if ((i12 & 128) == 0) {
                        i27 = 4194304;
                    } else {
                        i27 = 4194304;
                    }
                    i13 |= i27;
                }
                if ((234881024 & i10) != 0) {
                    if ((i12 & 256) == 0) {
                        i26 = 33554432;
                    } else {
                        i26 = 33554432;
                    }
                    i13 |= i26;
                }
                i20 = i12 & 512;
                if (i20 != 0) {
                    i13 |= 805306368;
                    paddingValues2 = paddingValues;
                } else {
                    paddingValues2 = paddingValues;
                    if ((i10 & 1879048192) == 0) {
                        if (composerStartRestartGroup.changed(paddingValues2)) {
                            i21 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i21 = 268435456;
                        }
                        i13 |= i21;
                    }
                }
                if ((i12 & 1024) != 0) {
                    i22 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i11 | i23;
                } else {
                    i22 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i29 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier2;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i12 & 16) != 0) {
                            i24 = i13 & (-57345);
                            shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                        } else {
                            shapeM482RoundedCornerShape0680j_4 = shape;
                            i24 = i13;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 64) != 0) {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                            i24 &= -3670017;
                        } else {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if ((i12 & 128) != 0) {
                            z11 = z13;
                            jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i24 &= -29360129;
                        } else {
                            z11 = z13;
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i25 = i24 & (-234881025);
                        } else {
                            jM2518unboximpl2 = j11;
                            i25 = i24;
                        }
                        if (i20 != 0) {
                            paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                        } else {
                            paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        if (i29 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier2;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i12 & 16) != 0) {
                            i24 = i13 & (-57345);
                            shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                        } else {
                            shapeM482RoundedCornerShape0680j_4 = shape;
                            i24 = i13;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 64) != 0) {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                            i24 &= -3670017;
                        } else {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if ((i12 & 128) != 0) {
                            z11 = z13;
                            jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i24 &= -29360129;
                        } else {
                            z11 = z13;
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i25 = i24 & (-234881025);
                        } else {
                            jM2518unboximpl2 = j11;
                            i25 = i24;
                        }
                        if (i20 != 0) {
                            paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                        } else {
                            paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j12 = jM2518unboximpl;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1316804655, i25, i22, "com.bbva.ui.compose.Button (Button.kt:286)");
                    }
                    stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i25 >> 9) & 14);
                    composerStartRestartGroup.startReplaceableGroup(-329670602);
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        jM2518unboximpl3 = j12;
                    } else {
                        jM2518unboximpl3 = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State<Color> stateM58animateColorAsStateeuL9pac3 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl3, null, null, null, composerStartRestartGroup, 0, 14);
                    composerStartRestartGroup.startReplaceableGroup(-329670422);
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        jM2518unboximpl4 = jM2518unboximpl2;
                    } else {
                        jM2518unboximpl4 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State<Color> stateM58animateColorAsStateeuL9pac4 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl4, null, null, null, composerStartRestartGroup, 0, 14);
                    b(function0, modifier2, z11, shapeM482RoundedCornerShape0680j_4, stateM58animateColorAsStateeuL9pac3.getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateM58animateColorAsStateeuL9pac4.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1271502359, true, new a(stateM58animateColorAsStateeuL9pac4, paddingValuesM290PaddingValuesYgX7TsA, function3)), composerStartRestartGroup, (i25 & 14) | 100663296 | (i25 & 112) | (i25 & 896) | ((i25 >> 3) & 7168) | ((i25 << 3) & 3670016) | ((i25 << 12) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j13 = j12;
                    paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                    j14 = jM2518unboximpl2;
                    borderStroke3 = borderStroke2;
                    z14 = z11;
                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    Modifier modifier5 = modifier2;
                    shape2 = shapeM482RoundedCornerShape0680j_4;
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i29 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier2;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i12 & 16) != 0) {
                            i24 = i13 & (-57345);
                            shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                        } else {
                            shapeM482RoundedCornerShape0680j_4 = shape;
                            i24 = i13;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 64) != 0) {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                            i24 &= -3670017;
                        } else {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if ((i12 & 128) != 0) {
                            z11 = z13;
                            jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i24 &= -29360129;
                        } else {
                            z11 = z13;
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i25 = i24 & (-234881025);
                        } else {
                            jM2518unboximpl2 = j11;
                            i25 = i24;
                        }
                        if (i20 != 0) {
                            paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                        } else {
                            paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        if (i29 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier2;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i12 & 16) != 0) {
                            i24 = i13 & (-57345);
                            shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                        } else {
                            shapeM482RoundedCornerShape0680j_4 = shape;
                            i24 = i13;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 64) != 0) {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                            i24 &= -3670017;
                        } else {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if ((i12 & 128) != 0) {
                            z11 = z13;
                            jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i24 &= -29360129;
                        } else {
                            z11 = z13;
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i25 = i24 & (-234881025);
                        } else {
                            jM2518unboximpl2 = j11;
                            i25 = i24;
                        }
                        if (i20 != 0) {
                            paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                        } else {
                            paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j12 = jM2518unboximpl;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1316804655, i25, i22, "com.bbva.ui.compose.Button (Button.kt:286)");
                    }
                    stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i25 >> 9) & 14);
                    composerStartRestartGroup.startReplaceableGroup(-329670602);
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        jM2518unboximpl3 = j12;
                    } else {
                        jM2518unboximpl3 = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State<Color> stateM58animateColorAsStateeuL9pac5 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl3, null, null, null, composerStartRestartGroup, 0, 14);
                    composerStartRestartGroup.startReplaceableGroup(-329670422);
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        jM2518unboximpl4 = jM2518unboximpl2;
                    } else {
                        jM2518unboximpl4 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State<Color> stateM58animateColorAsStateeuL9pac6 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl4, null, null, null, composerStartRestartGroup, 0, 14);
                    b(function0, modifier2, z11, shapeM482RoundedCornerShape0680j_4, stateM58animateColorAsStateeuL9pac5.getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateM58animateColorAsStateeuL9pac6.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1271502359, true, new a(stateM58animateColorAsStateeuL9pac6, paddingValuesM290PaddingValuesYgX7TsA, function3)), composerStartRestartGroup, (i25 & 14) | 100663296 | (i25 & 112) | (i25 & 896) | ((i25 >> 3) & 7168) | ((i25 << 3) & 3670016) | ((i25 << 12) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j13 = j12;
                    paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                    j14 = jM2518unboximpl2;
                    borderStroke3 = borderStroke2;
                    z14 = z11;
                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    Modifier modifier6 = modifier2;
                    shape2 = shapeM482RoundedCornerShape0680j_4;
                    modifier3 = modifier6;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(function0, modifier3, z14, mutableInteractionSource4, shape2, borderStroke3, buttonColors2, j13, j14, paddingValues3, function3, i10, i11, i12));
                }
            }
            i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            z11 = z10;
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i10 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((57344 & i10) != 0) {
                    i13 |= ((i12 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
                }
                i18 = i12 & 32;
                if (i18 != 0) {
                    i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(borderStroke)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i12 & 64) == 0) {
                        i28 = 524288;
                    } else {
                        i28 = 524288;
                    }
                    i13 |= i28;
                }
                if ((i10 & 29360128) != 0) {
                    if ((i12 & 128) == 0) {
                        i27 = 4194304;
                    } else {
                        i27 = 4194304;
                    }
                    i13 |= i27;
                }
                if ((234881024 & i10) != 0) {
                    if ((i12 & 256) == 0) {
                        i26 = 33554432;
                    } else {
                        i26 = 33554432;
                    }
                    i13 |= i26;
                }
                i20 = i12 & 512;
                if (i20 != 0) {
                    i13 |= 805306368;
                    paddingValues2 = paddingValues;
                } else {
                    paddingValues2 = paddingValues;
                    if ((i10 & 1879048192) == 0) {
                        if (composerStartRestartGroup.changed(paddingValues2)) {
                            i21 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i21 = 268435456;
                        }
                        i13 |= i21;
                    }
                }
                if ((i12 & 1024) != 0) {
                    i22 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i11 | i23;
                } else {
                    i22 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i29 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier2;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i12 & 16) != 0) {
                            i24 = i13 & (-57345);
                            shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                        } else {
                            shapeM482RoundedCornerShape0680j_4 = shape;
                            i24 = i13;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 64) != 0) {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                            i24 &= -3670017;
                        } else {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if ((i12 & 128) != 0) {
                            z11 = z13;
                            jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i24 &= -29360129;
                        } else {
                            z11 = z13;
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i25 = i24 & (-234881025);
                        } else {
                            jM2518unboximpl2 = j11;
                            i25 = i24;
                        }
                        if (i20 != 0) {
                            paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                        } else {
                            paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        if (i29 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier2;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i12 & 16) != 0) {
                            i24 = i13 & (-57345);
                            shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                        } else {
                            shapeM482RoundedCornerShape0680j_4 = shape;
                            i24 = i13;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 64) != 0) {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                            i24 &= -3670017;
                        } else {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if ((i12 & 128) != 0) {
                            z11 = z13;
                            jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i24 &= -29360129;
                        } else {
                            z11 = z13;
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i25 = i24 & (-234881025);
                        } else {
                            jM2518unboximpl2 = j11;
                            i25 = i24;
                        }
                        if (i20 != 0) {
                            paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                        } else {
                            paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j12 = jM2518unboximpl;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1316804655, i25, i22, "com.bbva.ui.compose.Button (Button.kt:286)");
                    }
                    stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i25 >> 9) & 14);
                    composerStartRestartGroup.startReplaceableGroup(-329670602);
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        jM2518unboximpl3 = j12;
                    } else {
                        jM2518unboximpl3 = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State<Color> stateM58animateColorAsStateeuL9pac7 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl3, null, null, null, composerStartRestartGroup, 0, 14);
                    composerStartRestartGroup.startReplaceableGroup(-329670422);
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        jM2518unboximpl4 = jM2518unboximpl2;
                    } else {
                        jM2518unboximpl4 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State<Color> stateM58animateColorAsStateeuL9pac8 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl4, null, null, null, composerStartRestartGroup, 0, 14);
                    b(function0, modifier2, z11, shapeM482RoundedCornerShape0680j_4, stateM58animateColorAsStateeuL9pac7.getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateM58animateColorAsStateeuL9pac8.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1271502359, true, new a(stateM58animateColorAsStateeuL9pac8, paddingValuesM290PaddingValuesYgX7TsA, function3)), composerStartRestartGroup, (i25 & 14) | 100663296 | (i25 & 112) | (i25 & 896) | ((i25 >> 3) & 7168) | ((i25 << 3) & 3670016) | ((i25 << 12) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j13 = j12;
                    paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                    j14 = jM2518unboximpl2;
                    borderStroke3 = borderStroke2;
                    z14 = z11;
                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    Modifier modifier7 = modifier2;
                    shape2 = shapeM482RoundedCornerShape0680j_4;
                    modifier3 = modifier7;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i29 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier2;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i12 & 16) != 0) {
                            i24 = i13 & (-57345);
                            shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                        } else {
                            shapeM482RoundedCornerShape0680j_4 = shape;
                            i24 = i13;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 64) != 0) {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                            i24 &= -3670017;
                        } else {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if ((i12 & 128) != 0) {
                            z11 = z13;
                            jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i24 &= -29360129;
                        } else {
                            z11 = z13;
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i25 = i24 & (-234881025);
                        } else {
                            jM2518unboximpl2 = j11;
                            i25 = i24;
                        }
                        if (i20 != 0) {
                            paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                        } else {
                            paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        if (i29 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier2;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i12 & 16) != 0) {
                            i24 = i13 & (-57345);
                            shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                        } else {
                            shapeM482RoundedCornerShape0680j_4 = shape;
                            i24 = i13;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 64) != 0) {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                            i24 &= -3670017;
                        } else {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if ((i12 & 128) != 0) {
                            z11 = z13;
                            jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i24 &= -29360129;
                        } else {
                            z11 = z13;
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i25 = i24 & (-234881025);
                        } else {
                            jM2518unboximpl2 = j11;
                            i25 = i24;
                        }
                        if (i20 != 0) {
                            paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                        } else {
                            paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j12 = jM2518unboximpl;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1316804655, i25, i22, "com.bbva.ui.compose.Button (Button.kt:286)");
                    }
                    stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i25 >> 9) & 14);
                    composerStartRestartGroup.startReplaceableGroup(-329670602);
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        jM2518unboximpl3 = j12;
                    } else {
                        jM2518unboximpl3 = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State<Color> stateM58animateColorAsStateeuL9pac9 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl3, null, null, null, composerStartRestartGroup, 0, 14);
                    composerStartRestartGroup.startReplaceableGroup(-329670422);
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        jM2518unboximpl4 = jM2518unboximpl2;
                    } else {
                        jM2518unboximpl4 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State<Color> stateM58animateColorAsStateeuL9pac10 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl4, null, null, null, composerStartRestartGroup, 0, 14);
                    b(function0, modifier2, z11, shapeM482RoundedCornerShape0680j_4, stateM58animateColorAsStateeuL9pac9.getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateM58animateColorAsStateeuL9pac10.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1271502359, true, new a(stateM58animateColorAsStateeuL9pac10, paddingValuesM290PaddingValuesYgX7TsA, function3)), composerStartRestartGroup, (i25 & 14) | 100663296 | (i25 & 112) | (i25 & 896) | ((i25 >> 3) & 7168) | ((i25 << 3) & 3670016) | ((i25 << 12) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j13 = j12;
                    paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                    j14 = jM2518unboximpl2;
                    borderStroke3 = borderStroke2;
                    z14 = z11;
                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    Modifier modifier8 = modifier2;
                    shape2 = shapeM482RoundedCornerShape0680j_4;
                    modifier3 = modifier8;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(function0, modifier3, z14, mutableInteractionSource4, shape2, borderStroke3, buttonColors2, j13, j14, paddingValues3, function3, i10, i11, i12));
                }
            }
            i13 |= 3072;
            if ((57344 & i10) != 0) {
                i13 |= ((i12 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
            }
            i18 = i12 & 32;
            if (i18 != 0) {
                i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(borderStroke)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
            if ((i10 & 3670016) != 0) {
                if ((i12 & 64) == 0) {
                    i28 = 524288;
                } else {
                    i28 = 524288;
                }
                i13 |= i28;
            }
            if ((i10 & 29360128) != 0) {
                if ((i12 & 128) == 0) {
                    i27 = 4194304;
                } else {
                    i27 = 4194304;
                }
                i13 |= i27;
            }
            if ((234881024 & i10) != 0) {
                if ((i12 & 256) == 0) {
                    i26 = 33554432;
                } else {
                    i26 = 33554432;
                }
                i13 |= i26;
            }
            i20 = i12 & 512;
            if (i20 != 0) {
                i13 |= 805306368;
                paddingValues2 = paddingValues;
            } else {
                paddingValues2 = paddingValues;
                if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i21 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
            }
            if ((i12 & 1024) != 0) {
                i22 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i11 | i23;
            } else {
                i22 = i11;
            }
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i29 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier2;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i12 & 16) != 0) {
                        i24 = i13 & (-57345);
                        shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                    } else {
                        shapeM482RoundedCornerShape0680j_4 = shape;
                        i24 = i13;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 64) != 0) {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                        i24 &= -3670017;
                    } else {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if ((i12 & 128) != 0) {
                        z11 = z13;
                        jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i24 &= -29360129;
                    } else {
                        z11 = z13;
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i25 = i24 & (-234881025);
                    } else {
                        jM2518unboximpl2 = j11;
                        i25 = i24;
                    }
                    if (i20 != 0) {
                        paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                    } else {
                        paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    if (i29 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier2;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i12 & 16) != 0) {
                        i24 = i13 & (-57345);
                        shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                    } else {
                        shapeM482RoundedCornerShape0680j_4 = shape;
                        i24 = i13;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 64) != 0) {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                        i24 &= -3670017;
                    } else {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if ((i12 & 128) != 0) {
                        z11 = z13;
                        jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i24 &= -29360129;
                    } else {
                        z11 = z13;
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i25 = i24 & (-234881025);
                    } else {
                        jM2518unboximpl2 = j11;
                        i25 = i24;
                    }
                    if (i20 != 0) {
                        paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                    } else {
                        paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                composerStartRestartGroup.endDefaults();
                j12 = jM2518unboximpl;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1316804655, i25, i22, "com.bbva.ui.compose.Button (Button.kt:286)");
                }
                stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i25 >> 9) & 14);
                composerStartRestartGroup.startReplaceableGroup(-329670602);
                if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                    jM2518unboximpl3 = j12;
                } else {
                    jM2518unboximpl3 = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State<Color> stateM58animateColorAsStateeuL9pac11 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl3, null, null, null, composerStartRestartGroup, 0, 14);
                composerStartRestartGroup.startReplaceableGroup(-329670422);
                if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                    jM2518unboximpl4 = jM2518unboximpl2;
                } else {
                    jM2518unboximpl4 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State<Color> stateM58animateColorAsStateeuL9pac12 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl4, null, null, null, composerStartRestartGroup, 0, 14);
                b(function0, modifier2, z11, shapeM482RoundedCornerShape0680j_4, stateM58animateColorAsStateeuL9pac11.getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateM58animateColorAsStateeuL9pac12.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1271502359, true, new a(stateM58animateColorAsStateeuL9pac12, paddingValuesM290PaddingValuesYgX7TsA, function3)), composerStartRestartGroup, (i25 & 14) | 100663296 | (i25 & 112) | (i25 & 896) | ((i25 >> 3) & 7168) | ((i25 << 3) & 3670016) | ((i25 << 12) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j13 = j12;
                paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                j14 = jM2518unboximpl2;
                borderStroke3 = borderStroke2;
                z14 = z11;
                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                mutableInteractionSource4 = mutableInteractionSource3;
                Modifier modifier9 = modifier2;
                shape2 = shapeM482RoundedCornerShape0680j_4;
                modifier3 = modifier9;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i29 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier2;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i12 & 16) != 0) {
                        i24 = i13 & (-57345);
                        shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                    } else {
                        shapeM482RoundedCornerShape0680j_4 = shape;
                        i24 = i13;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 64) != 0) {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                        i24 &= -3670017;
                    } else {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if ((i12 & 128) != 0) {
                        z11 = z13;
                        jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i24 &= -29360129;
                    } else {
                        z11 = z13;
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i25 = i24 & (-234881025);
                    } else {
                        jM2518unboximpl2 = j11;
                        i25 = i24;
                    }
                    if (i20 != 0) {
                        paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                    } else {
                        paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    if (i29 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier2;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i12 & 16) != 0) {
                        i24 = i13 & (-57345);
                        shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                    } else {
                        shapeM482RoundedCornerShape0680j_4 = shape;
                        i24 = i13;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 64) != 0) {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                        i24 &= -3670017;
                    } else {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if ((i12 & 128) != 0) {
                        z11 = z13;
                        jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i24 &= -29360129;
                    } else {
                        z11 = z13;
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i25 = i24 & (-234881025);
                    } else {
                        jM2518unboximpl2 = j11;
                        i25 = i24;
                    }
                    if (i20 != 0) {
                        paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                    } else {
                        paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                composerStartRestartGroup.endDefaults();
                j12 = jM2518unboximpl;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1316804655, i25, i22, "com.bbva.ui.compose.Button (Button.kt:286)");
                }
                stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i25 >> 9) & 14);
                composerStartRestartGroup.startReplaceableGroup(-329670602);
                if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                    jM2518unboximpl3 = j12;
                } else {
                    jM2518unboximpl3 = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State<Color> stateM58animateColorAsStateeuL9pac13 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl3, null, null, null, composerStartRestartGroup, 0, 14);
                composerStartRestartGroup.startReplaceableGroup(-329670422);
                if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                    jM2518unboximpl4 = jM2518unboximpl2;
                } else {
                    jM2518unboximpl4 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State<Color> stateM58animateColorAsStateeuL9pac14 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl4, null, null, null, composerStartRestartGroup, 0, 14);
                b(function0, modifier2, z11, shapeM482RoundedCornerShape0680j_4, stateM58animateColorAsStateeuL9pac13.getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateM58animateColorAsStateeuL9pac14.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1271502359, true, new a(stateM58animateColorAsStateeuL9pac14, paddingValuesM290PaddingValuesYgX7TsA, function3)), composerStartRestartGroup, (i25 & 14) | 100663296 | (i25 & 112) | (i25 & 896) | ((i25 >> 3) & 7168) | ((i25 << 3) & 3670016) | ((i25 << 12) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j13 = j12;
                paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                j14 = jM2518unboximpl2;
                borderStroke3 = borderStroke2;
                z14 = z11;
                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                mutableInteractionSource4 = mutableInteractionSource3;
                Modifier modifier10 = modifier2;
                shape2 = shapeM482RoundedCornerShape0680j_4;
                modifier3 = modifier10;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new b(function0, modifier3, z14, mutableInteractionSource4, shape2, borderStroke3, buttonColors2, j13, j14, paddingValues3, function3, i10, i11, i12));
            }
        }
        i13 |= 48;
        modifier2 = modifier;
        i14 = i12 & 4;
        if (i14 != 0) {
            if ((i10 & 896) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i15 = 256;
                } else {
                    i15 = 128;
                }
                i13 |= i15;
            }
            i16 = i12 & 8;
            if (i16 != 0) {
                if ((i10 & 7168) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i17 = 2048;
                    } else {
                        i17 = 1024;
                    }
                    i13 |= i17;
                }
                if ((57344 & i10) != 0) {
                    i13 |= ((i12 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
                }
                i18 = i12 & 32;
                if (i18 != 0) {
                    i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((i10 & 458752) == 0) {
                    if (composerStartRestartGroup.changed(borderStroke)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i12 & 64) == 0) {
                        i28 = 524288;
                    } else {
                        i28 = 524288;
                    }
                    i13 |= i28;
                }
                if ((i10 & 29360128) != 0) {
                    if ((i12 & 128) == 0) {
                        i27 = 4194304;
                    } else {
                        i27 = 4194304;
                    }
                    i13 |= i27;
                }
                if ((234881024 & i10) != 0) {
                    if ((i12 & 256) == 0) {
                        i26 = 33554432;
                    } else {
                        i26 = 33554432;
                    }
                    i13 |= i26;
                }
                i20 = i12 & 512;
                if (i20 != 0) {
                    i13 |= 805306368;
                    paddingValues2 = paddingValues;
                } else {
                    paddingValues2 = paddingValues;
                    if ((i10 & 1879048192) == 0) {
                        if (composerStartRestartGroup.changed(paddingValues2)) {
                            i21 = PKIFailureInfo.duplicateCertReq;
                        } else {
                            i21 = 268435456;
                        }
                        i13 |= i21;
                    }
                }
                if ((i12 & 1024) != 0) {
                    i22 = i11 | 6;
                } else if ((i11 & 14) == 0) {
                    if (composerStartRestartGroup.changedInstance(function3)) {
                        i23 = 4;
                    } else {
                        i23 = 2;
                    }
                    i22 = i11 | i23;
                } else {
                    i22 = i11;
                }
                if ((i13 & 1533916891) != 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i29 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier2;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i12 & 16) != 0) {
                            i24 = i13 & (-57345);
                            shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                        } else {
                            shapeM482RoundedCornerShape0680j_4 = shape;
                            i24 = i13;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 64) != 0) {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                            i24 &= -3670017;
                        } else {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if ((i12 & 128) != 0) {
                            z11 = z13;
                            jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i24 &= -29360129;
                        } else {
                            z11 = z13;
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i25 = i24 & (-234881025);
                        } else {
                            jM2518unboximpl2 = j11;
                            i25 = i24;
                        }
                        if (i20 != 0) {
                            paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                        } else {
                            paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        if (i29 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier2;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i12 & 16) != 0) {
                            i24 = i13 & (-57345);
                            shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                        } else {
                            shapeM482RoundedCornerShape0680j_4 = shape;
                            i24 = i13;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 64) != 0) {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                            i24 &= -3670017;
                        } else {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if ((i12 & 128) != 0) {
                            z11 = z13;
                            jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i24 &= -29360129;
                        } else {
                            z11 = z13;
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i25 = i24 & (-234881025);
                        } else {
                            jM2518unboximpl2 = j11;
                            i25 = i24;
                        }
                        if (i20 != 0) {
                            paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                        } else {
                            paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j12 = jM2518unboximpl;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1316804655, i25, i22, "com.bbva.ui.compose.Button (Button.kt:286)");
                    }
                    stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i25 >> 9) & 14);
                    composerStartRestartGroup.startReplaceableGroup(-329670602);
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        jM2518unboximpl3 = j12;
                    } else {
                        jM2518unboximpl3 = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State<Color> stateM58animateColorAsStateeuL9pac15 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl3, null, null, null, composerStartRestartGroup, 0, 14);
                    composerStartRestartGroup.startReplaceableGroup(-329670422);
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        jM2518unboximpl4 = jM2518unboximpl2;
                    } else {
                        jM2518unboximpl4 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State<Color> stateM58animateColorAsStateeuL9pac16 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl4, null, null, null, composerStartRestartGroup, 0, 14);
                    b(function0, modifier2, z11, shapeM482RoundedCornerShape0680j_4, stateM58animateColorAsStateeuL9pac15.getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateM58animateColorAsStateeuL9pac16.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1271502359, true, new a(stateM58animateColorAsStateeuL9pac16, paddingValuesM290PaddingValuesYgX7TsA, function3)), composerStartRestartGroup, (i25 & 14) | 100663296 | (i25 & 112) | (i25 & 896) | ((i25 >> 3) & 7168) | ((i25 << 3) & 3670016) | ((i25 << 12) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j13 = j12;
                    paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                    j14 = jM2518unboximpl2;
                    borderStroke3 = borderStroke2;
                    z14 = z11;
                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    Modifier modifier11 = modifier2;
                    shape2 = shapeM482RoundedCornerShape0680j_4;
                    modifier3 = modifier11;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i29 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier2;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i12 & 16) != 0) {
                            i24 = i13 & (-57345);
                            shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                        } else {
                            shapeM482RoundedCornerShape0680j_4 = shape;
                            i24 = i13;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 64) != 0) {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                            i24 &= -3670017;
                        } else {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if ((i12 & 128) != 0) {
                            z11 = z13;
                            jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i24 &= -29360129;
                        } else {
                            z11 = z13;
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i25 = i24 & (-234881025);
                        } else {
                            jM2518unboximpl2 = j11;
                            i25 = i24;
                        }
                        if (i20 != 0) {
                            paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                        } else {
                            paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    } else {
                        if (i29 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        } else {
                            modifier2 = modifier2;
                        }
                        if (i14 != 0) {
                            z12 = true;
                        } else {
                            z12 = z11;
                        }
                        if (i16 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                        if ((i12 & 16) != 0) {
                            i24 = i13 & (-57345);
                            shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                        } else {
                            shapeM482RoundedCornerShape0680j_4 = shape;
                            i24 = i13;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if ((i12 & 64) != 0) {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                            i24 &= -3670017;
                        } else {
                            z13 = z12;
                            buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                        }
                        if ((i12 & 128) != 0) {
                            z11 = z13;
                            jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i24 &= -29360129;
                        } else {
                            z11 = z13;
                            jM2518unboximpl = j10;
                        }
                        if ((i12 & 256) != 0) {
                            jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                            i25 = i24 & (-234881025);
                        } else {
                            jM2518unboximpl2 = j11;
                            i25 = i24;
                        }
                        if (i20 != 0) {
                            paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                        } else {
                            paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                        }
                        mutableInteractionSource3 = mutableInteractionSource2;
                    }
                    composerStartRestartGroup.endDefaults();
                    j12 = jM2518unboximpl;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1316804655, i25, i22, "com.bbva.ui.compose.Button (Button.kt:286)");
                    }
                    stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i25 >> 9) & 14);
                    composerStartRestartGroup.startReplaceableGroup(-329670602);
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        jM2518unboximpl3 = j12;
                    } else {
                        jM2518unboximpl3 = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State<Color> stateM58animateColorAsStateeuL9pac17 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl3, null, null, null, composerStartRestartGroup, 0, 14);
                    composerStartRestartGroup.startReplaceableGroup(-329670422);
                    if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                        jM2518unboximpl4 = jM2518unboximpl2;
                    } else {
                        jM2518unboximpl4 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    State<Color> stateM58animateColorAsStateeuL9pac18 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl4, null, null, null, composerStartRestartGroup, 0, 14);
                    b(function0, modifier2, z11, shapeM482RoundedCornerShape0680j_4, stateM58animateColorAsStateeuL9pac17.getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateM58animateColorAsStateeuL9pac18.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1271502359, true, new a(stateM58animateColorAsStateeuL9pac18, paddingValuesM290PaddingValuesYgX7TsA, function3)), composerStartRestartGroup, (i25 & 14) | 100663296 | (i25 & 112) | (i25 & 896) | ((i25 >> 3) & 7168) | ((i25 << 3) & 3670016) | ((i25 << 12) & 29360128), 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    j13 = j12;
                    paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                    j14 = jM2518unboximpl2;
                    borderStroke3 = borderStroke2;
                    z14 = z11;
                    buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                    mutableInteractionSource4 = mutableInteractionSource3;
                    Modifier modifier12 = modifier2;
                    shape2 = shapeM482RoundedCornerShape0680j_4;
                    modifier3 = modifier12;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(function0, modifier3, z14, mutableInteractionSource4, shape2, borderStroke3, buttonColors2, j13, j14, paddingValues3, function3, i10, i11, i12));
                }
            }
            i13 |= 3072;
            if ((57344 & i10) != 0) {
                i13 |= ((i12 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
            }
            i18 = i12 & 32;
            if (i18 != 0) {
                i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(borderStroke)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
            if ((i10 & 3670016) != 0) {
                if ((i12 & 64) == 0) {
                    i28 = 524288;
                } else {
                    i28 = 524288;
                }
                i13 |= i28;
            }
            if ((i10 & 29360128) != 0) {
                if ((i12 & 128) == 0) {
                    i27 = 4194304;
                } else {
                    i27 = 4194304;
                }
                i13 |= i27;
            }
            if ((234881024 & i10) != 0) {
                if ((i12 & 256) == 0) {
                    i26 = 33554432;
                } else {
                    i26 = 33554432;
                }
                i13 |= i26;
            }
            i20 = i12 & 512;
            if (i20 != 0) {
                i13 |= 805306368;
                paddingValues2 = paddingValues;
            } else {
                paddingValues2 = paddingValues;
                if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i21 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
            }
            if ((i12 & 1024) != 0) {
                i22 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i11 | i23;
            } else {
                i22 = i11;
            }
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i29 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier2;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i12 & 16) != 0) {
                        i24 = i13 & (-57345);
                        shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                    } else {
                        shapeM482RoundedCornerShape0680j_4 = shape;
                        i24 = i13;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 64) != 0) {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                        i24 &= -3670017;
                    } else {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if ((i12 & 128) != 0) {
                        z11 = z13;
                        jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i24 &= -29360129;
                    } else {
                        z11 = z13;
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i25 = i24 & (-234881025);
                    } else {
                        jM2518unboximpl2 = j11;
                        i25 = i24;
                    }
                    if (i20 != 0) {
                        paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                    } else {
                        paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    if (i29 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier2;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i12 & 16) != 0) {
                        i24 = i13 & (-57345);
                        shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                    } else {
                        shapeM482RoundedCornerShape0680j_4 = shape;
                        i24 = i13;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 64) != 0) {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                        i24 &= -3670017;
                    } else {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if ((i12 & 128) != 0) {
                        z11 = z13;
                        jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i24 &= -29360129;
                    } else {
                        z11 = z13;
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i25 = i24 & (-234881025);
                    } else {
                        jM2518unboximpl2 = j11;
                        i25 = i24;
                    }
                    if (i20 != 0) {
                        paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                    } else {
                        paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                composerStartRestartGroup.endDefaults();
                j12 = jM2518unboximpl;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1316804655, i25, i22, "com.bbva.ui.compose.Button (Button.kt:286)");
                }
                stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i25 >> 9) & 14);
                composerStartRestartGroup.startReplaceableGroup(-329670602);
                if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                    jM2518unboximpl3 = j12;
                } else {
                    jM2518unboximpl3 = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State<Color> stateM58animateColorAsStateeuL9pac19 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl3, null, null, null, composerStartRestartGroup, 0, 14);
                composerStartRestartGroup.startReplaceableGroup(-329670422);
                if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                    jM2518unboximpl4 = jM2518unboximpl2;
                } else {
                    jM2518unboximpl4 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State<Color> stateM58animateColorAsStateeuL9pac110 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl4, null, null, null, composerStartRestartGroup, 0, 14);
                b(function0, modifier2, z11, shapeM482RoundedCornerShape0680j_4, stateM58animateColorAsStateeuL9pac19.getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateM58animateColorAsStateeuL9pac110.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1271502359, true, new a(stateM58animateColorAsStateeuL9pac110, paddingValuesM290PaddingValuesYgX7TsA, function3)), composerStartRestartGroup, (i25 & 14) | 100663296 | (i25 & 112) | (i25 & 896) | ((i25 >> 3) & 7168) | ((i25 << 3) & 3670016) | ((i25 << 12) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j13 = j12;
                paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                j14 = jM2518unboximpl2;
                borderStroke3 = borderStroke2;
                z14 = z11;
                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                mutableInteractionSource4 = mutableInteractionSource3;
                Modifier modifier13 = modifier2;
                shape2 = shapeM482RoundedCornerShape0680j_4;
                modifier3 = modifier13;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i29 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier2;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i12 & 16) != 0) {
                        i24 = i13 & (-57345);
                        shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                    } else {
                        shapeM482RoundedCornerShape0680j_4 = shape;
                        i24 = i13;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 64) != 0) {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                        i24 &= -3670017;
                    } else {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if ((i12 & 128) != 0) {
                        z11 = z13;
                        jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i24 &= -29360129;
                    } else {
                        z11 = z13;
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i25 = i24 & (-234881025);
                    } else {
                        jM2518unboximpl2 = j11;
                        i25 = i24;
                    }
                    if (i20 != 0) {
                        paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                    } else {
                        paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    if (i29 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier2;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i12 & 16) != 0) {
                        i24 = i13 & (-57345);
                        shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                    } else {
                        shapeM482RoundedCornerShape0680j_4 = shape;
                        i24 = i13;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 64) != 0) {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                        i24 &= -3670017;
                    } else {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if ((i12 & 128) != 0) {
                        z11 = z13;
                        jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i24 &= -29360129;
                    } else {
                        z11 = z13;
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i25 = i24 & (-234881025);
                    } else {
                        jM2518unboximpl2 = j11;
                        i25 = i24;
                    }
                    if (i20 != 0) {
                        paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                    } else {
                        paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                composerStartRestartGroup.endDefaults();
                j12 = jM2518unboximpl;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1316804655, i25, i22, "com.bbva.ui.compose.Button (Button.kt:286)");
                }
                stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i25 >> 9) & 14);
                composerStartRestartGroup.startReplaceableGroup(-329670602);
                if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                    jM2518unboximpl3 = j12;
                } else {
                    jM2518unboximpl3 = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State<Color> stateM58animateColorAsStateeuL9pac111 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl3, null, null, null, composerStartRestartGroup, 0, 14);
                composerStartRestartGroup.startReplaceableGroup(-329670422);
                if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                    jM2518unboximpl4 = jM2518unboximpl2;
                } else {
                    jM2518unboximpl4 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State<Color> stateM58animateColorAsStateeuL9pac112 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl4, null, null, null, composerStartRestartGroup, 0, 14);
                b(function0, modifier2, z11, shapeM482RoundedCornerShape0680j_4, stateM58animateColorAsStateeuL9pac111.getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateM58animateColorAsStateeuL9pac112.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1271502359, true, new a(stateM58animateColorAsStateeuL9pac112, paddingValuesM290PaddingValuesYgX7TsA, function3)), composerStartRestartGroup, (i25 & 14) | 100663296 | (i25 & 112) | (i25 & 896) | ((i25 >> 3) & 7168) | ((i25 << 3) & 3670016) | ((i25 << 12) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j13 = j12;
                paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                j14 = jM2518unboximpl2;
                borderStroke3 = borderStroke2;
                z14 = z11;
                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                mutableInteractionSource4 = mutableInteractionSource3;
                Modifier modifier14 = modifier2;
                shape2 = shapeM482RoundedCornerShape0680j_4;
                modifier3 = modifier14;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new b(function0, modifier3, z14, mutableInteractionSource4, shape2, borderStroke3, buttonColors2, j13, j14, paddingValues3, function3, i10, i11, i12));
            }
        }
        i13 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        z11 = z10;
        i16 = i12 & 8;
        if (i16 != 0) {
            if ((i10 & 7168) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i17 = 2048;
                } else {
                    i17 = 1024;
                }
                i13 |= i17;
            }
            if ((57344 & i10) != 0) {
                i13 |= ((i12 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
            }
            i18 = i12 & 32;
            if (i18 != 0) {
                i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((i10 & 458752) == 0) {
                if (composerStartRestartGroup.changed(borderStroke)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            }
            if ((i10 & 3670016) != 0) {
                if ((i12 & 64) == 0) {
                    i28 = 524288;
                } else {
                    i28 = 524288;
                }
                i13 |= i28;
            }
            if ((i10 & 29360128) != 0) {
                if ((i12 & 128) == 0) {
                    i27 = 4194304;
                } else {
                    i27 = 4194304;
                }
                i13 |= i27;
            }
            if ((234881024 & i10) != 0) {
                if ((i12 & 256) == 0) {
                    i26 = 33554432;
                } else {
                    i26 = 33554432;
                }
                i13 |= i26;
            }
            i20 = i12 & 512;
            if (i20 != 0) {
                i13 |= 805306368;
                paddingValues2 = paddingValues;
            } else {
                paddingValues2 = paddingValues;
                if ((i10 & 1879048192) == 0) {
                    if (composerStartRestartGroup.changed(paddingValues2)) {
                        i21 = PKIFailureInfo.duplicateCertReq;
                    } else {
                        i21 = 268435456;
                    }
                    i13 |= i21;
                }
            }
            if ((i12 & 1024) != 0) {
                i22 = i11 | 6;
            } else if ((i11 & 14) == 0) {
                if (composerStartRestartGroup.changedInstance(function3)) {
                    i23 = 4;
                } else {
                    i23 = 2;
                }
                i22 = i11 | i23;
            } else {
                i22 = i11;
            }
            if ((i13 & 1533916891) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i29 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier2;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i12 & 16) != 0) {
                        i24 = i13 & (-57345);
                        shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                    } else {
                        shapeM482RoundedCornerShape0680j_4 = shape;
                        i24 = i13;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 64) != 0) {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                        i24 &= -3670017;
                    } else {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if ((i12 & 128) != 0) {
                        z11 = z13;
                        jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i24 &= -29360129;
                    } else {
                        z11 = z13;
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i25 = i24 & (-234881025);
                    } else {
                        jM2518unboximpl2 = j11;
                        i25 = i24;
                    }
                    if (i20 != 0) {
                        paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                    } else {
                        paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    if (i29 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier2;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i12 & 16) != 0) {
                        i24 = i13 & (-57345);
                        shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                    } else {
                        shapeM482RoundedCornerShape0680j_4 = shape;
                        i24 = i13;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 64) != 0) {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                        i24 &= -3670017;
                    } else {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if ((i12 & 128) != 0) {
                        z11 = z13;
                        jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i24 &= -29360129;
                    } else {
                        z11 = z13;
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i25 = i24 & (-234881025);
                    } else {
                        jM2518unboximpl2 = j11;
                        i25 = i24;
                    }
                    if (i20 != 0) {
                        paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                    } else {
                        paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                composerStartRestartGroup.endDefaults();
                j12 = jM2518unboximpl;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1316804655, i25, i22, "com.bbva.ui.compose.Button (Button.kt:286)");
                }
                stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i25 >> 9) & 14);
                composerStartRestartGroup.startReplaceableGroup(-329670602);
                if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                    jM2518unboximpl3 = j12;
                } else {
                    jM2518unboximpl3 = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State<Color> stateM58animateColorAsStateeuL9pac113 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl3, null, null, null, composerStartRestartGroup, 0, 14);
                composerStartRestartGroup.startReplaceableGroup(-329670422);
                if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                    jM2518unboximpl4 = jM2518unboximpl2;
                } else {
                    jM2518unboximpl4 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State<Color> stateM58animateColorAsStateeuL9pac114 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl4, null, null, null, composerStartRestartGroup, 0, 14);
                b(function0, modifier2, z11, shapeM482RoundedCornerShape0680j_4, stateM58animateColorAsStateeuL9pac113.getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateM58animateColorAsStateeuL9pac114.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1271502359, true, new a(stateM58animateColorAsStateeuL9pac114, paddingValuesM290PaddingValuesYgX7TsA, function3)), composerStartRestartGroup, (i25 & 14) | 100663296 | (i25 & 112) | (i25 & 896) | ((i25 >> 3) & 7168) | ((i25 << 3) & 3670016) | ((i25 << 12) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j13 = j12;
                paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                j14 = jM2518unboximpl2;
                borderStroke3 = borderStroke2;
                z14 = z11;
                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                mutableInteractionSource4 = mutableInteractionSource3;
                Modifier modifier15 = modifier2;
                shape2 = shapeM482RoundedCornerShape0680j_4;
                modifier3 = modifier15;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i29 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier2;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i12 & 16) != 0) {
                        i24 = i13 & (-57345);
                        shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                    } else {
                        shapeM482RoundedCornerShape0680j_4 = shape;
                        i24 = i13;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 64) != 0) {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                        i24 &= -3670017;
                    } else {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if ((i12 & 128) != 0) {
                        z11 = z13;
                        jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i24 &= -29360129;
                    } else {
                        z11 = z13;
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i25 = i24 & (-234881025);
                    } else {
                        jM2518unboximpl2 = j11;
                        i25 = i24;
                    }
                    if (i20 != 0) {
                        paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                    } else {
                        paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                } else {
                    if (i29 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    } else {
                        modifier2 = modifier2;
                    }
                    if (i14 != 0) {
                        z12 = true;
                    } else {
                        z12 = z11;
                    }
                    if (i16 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                    if ((i12 & 16) != 0) {
                        i24 = i13 & (-57345);
                        shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                    } else {
                        shapeM482RoundedCornerShape0680j_4 = shape;
                        i24 = i13;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if ((i12 & 64) != 0) {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                        i24 &= -3670017;
                    } else {
                        z13 = z12;
                        buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                    }
                    if ((i12 & 128) != 0) {
                        z11 = z13;
                        jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i24 &= -29360129;
                    } else {
                        z11 = z13;
                        jM2518unboximpl = j10;
                    }
                    if ((i12 & 256) != 0) {
                        jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                        i25 = i24 & (-234881025);
                    } else {
                        jM2518unboximpl2 = j11;
                        i25 = i24;
                    }
                    if (i20 != 0) {
                        paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                    } else {
                        paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                    }
                    mutableInteractionSource3 = mutableInteractionSource2;
                }
                composerStartRestartGroup.endDefaults();
                j12 = jM2518unboximpl;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1316804655, i25, i22, "com.bbva.ui.compose.Button (Button.kt:286)");
                }
                stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i25 >> 9) & 14);
                composerStartRestartGroup.startReplaceableGroup(-329670602);
                if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                    jM2518unboximpl3 = j12;
                } else {
                    jM2518unboximpl3 = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State<Color> stateM58animateColorAsStateeuL9pac115 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl3, null, null, null, composerStartRestartGroup, 0, 14);
                composerStartRestartGroup.startReplaceableGroup(-329670422);
                if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                    jM2518unboximpl4 = jM2518unboximpl2;
                } else {
                    jM2518unboximpl4 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
                }
                composerStartRestartGroup.endReplaceableGroup();
                State<Color> stateM58animateColorAsStateeuL9pac116 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl4, null, null, null, composerStartRestartGroup, 0, 14);
                b(function0, modifier2, z11, shapeM482RoundedCornerShape0680j_4, stateM58animateColorAsStateeuL9pac115.getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateM58animateColorAsStateeuL9pac116.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1271502359, true, new a(stateM58animateColorAsStateeuL9pac116, paddingValuesM290PaddingValuesYgX7TsA, function3)), composerStartRestartGroup, (i25 & 14) | 100663296 | (i25 & 112) | (i25 & 896) | ((i25 >> 3) & 7168) | ((i25 << 3) & 3670016) | ((i25 << 12) & 29360128), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                j13 = j12;
                paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
                j14 = jM2518unboximpl2;
                borderStroke3 = borderStroke2;
                z14 = z11;
                buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
                mutableInteractionSource4 = mutableInteractionSource3;
                Modifier modifier16 = modifier2;
                shape2 = shapeM482RoundedCornerShape0680j_4;
                modifier3 = modifier16;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new b(function0, modifier3, z14, mutableInteractionSource4, shape2, borderStroke3, buttonColors2, j13, j14, paddingValues3, function3, i10, i11, i12));
            }
        }
        i13 |= 3072;
        if ((57344 & i10) != 0) {
            i13 |= ((i12 & 16) == 0 || !composerStartRestartGroup.changed(shape)) ? 8192 : 16384;
        }
        i18 = i12 & 32;
        if (i18 != 0) {
            i13 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i10 & 458752) == 0) {
            if (composerStartRestartGroup.changed(borderStroke)) {
                i19 = 131072;
            } else {
                i19 = 65536;
            }
            i13 |= i19;
        }
        if ((i10 & 3670016) != 0) {
            if ((i12 & 64) == 0) {
                i28 = 524288;
            } else {
                i28 = 524288;
            }
            i13 |= i28;
        }
        if ((i10 & 29360128) != 0) {
            if ((i12 & 128) == 0) {
                i27 = 4194304;
            } else {
                i27 = 4194304;
            }
            i13 |= i27;
        }
        if ((234881024 & i10) != 0) {
            if ((i12 & 256) == 0) {
                i26 = 33554432;
            } else {
                i26 = 33554432;
            }
            i13 |= i26;
        }
        i20 = i12 & 512;
        if (i20 != 0) {
            i13 |= 805306368;
            paddingValues2 = paddingValues;
        } else {
            paddingValues2 = paddingValues;
            if ((i10 & 1879048192) == 0) {
                if (composerStartRestartGroup.changed(paddingValues2)) {
                    i21 = PKIFailureInfo.duplicateCertReq;
                } else {
                    i21 = 268435456;
                }
                i13 |= i21;
            }
        }
        if ((i12 & 1024) != 0) {
            i22 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            if (composerStartRestartGroup.changedInstance(function3)) {
                i23 = 4;
            } else {
                i23 = 2;
            }
            i22 = i11 | i23;
        } else {
            i22 = i11;
        }
        if ((i13 & 1533916891) != 306783378) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i29 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier2;
                }
                if (i14 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i16 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i12 & 16) != 0) {
                    i24 = i13 & (-57345);
                    shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                } else {
                    shapeM482RoundedCornerShape0680j_4 = shape;
                    i24 = i13;
                }
                if (i18 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                if ((i12 & 64) != 0) {
                    z13 = z12;
                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                    i24 &= -3670017;
                } else {
                    z13 = z12;
                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                }
                if ((i12 & 128) != 0) {
                    z11 = z13;
                    jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                    i24 &= -29360129;
                } else {
                    z11 = z13;
                    jM2518unboximpl = j10;
                }
                if ((i12 & 256) != 0) {
                    jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                    i25 = i24 & (-234881025);
                } else {
                    jM2518unboximpl2 = j11;
                    i25 = i24;
                }
                if (i20 != 0) {
                    paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                } else {
                    paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                }
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                if (i29 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier2;
                }
                if (i14 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i16 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i12 & 16) != 0) {
                    i24 = i13 & (-57345);
                    shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                } else {
                    shapeM482RoundedCornerShape0680j_4 = shape;
                    i24 = i13;
                }
                if (i18 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                if ((i12 & 64) != 0) {
                    z13 = z12;
                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                    i24 &= -3670017;
                } else {
                    z13 = z12;
                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                }
                if ((i12 & 128) != 0) {
                    z11 = z13;
                    jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                    i24 &= -29360129;
                } else {
                    z11 = z13;
                    jM2518unboximpl = j10;
                }
                if ((i12 & 256) != 0) {
                    jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                    i25 = i24 & (-234881025);
                } else {
                    jM2518unboximpl2 = j11;
                    i25 = i24;
                }
                if (i20 != 0) {
                    paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                } else {
                    paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                }
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            composerStartRestartGroup.endDefaults();
            j12 = jM2518unboximpl;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1316804655, i25, i22, "com.bbva.ui.compose.Button (Button.kt:286)");
            }
            stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i25 >> 9) & 14);
            composerStartRestartGroup.startReplaceableGroup(-329670602);
            if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                jM2518unboximpl3 = j12;
            } else {
                jM2518unboximpl3 = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
            }
            composerStartRestartGroup.endReplaceableGroup();
            State<Color> stateM58animateColorAsStateeuL9pac117 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl3, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup.startReplaceableGroup(-329670422);
            if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                jM2518unboximpl4 = jM2518unboximpl2;
            } else {
                jM2518unboximpl4 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
            }
            composerStartRestartGroup.endReplaceableGroup();
            State<Color> stateM58animateColorAsStateeuL9pac118 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl4, null, null, null, composerStartRestartGroup, 0, 14);
            b(function0, modifier2, z11, shapeM482RoundedCornerShape0680j_4, stateM58animateColorAsStateeuL9pac117.getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateM58animateColorAsStateeuL9pac118.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1271502359, true, new a(stateM58animateColorAsStateeuL9pac118, paddingValuesM290PaddingValuesYgX7TsA, function3)), composerStartRestartGroup, (i25 & 14) | 100663296 | (i25 & 112) | (i25 & 896) | ((i25 >> 3) & 7168) | ((i25 << 3) & 3670016) | ((i25 << 12) & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j13 = j12;
            paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
            j14 = jM2518unboximpl2;
            borderStroke3 = borderStroke2;
            z14 = z11;
            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
            mutableInteractionSource4 = mutableInteractionSource3;
            Modifier modifier17 = modifier2;
            shape2 = shapeM482RoundedCornerShape0680j_4;
            modifier3 = modifier17;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i29 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier2;
                }
                if (i14 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i16 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i12 & 16) != 0) {
                    i24 = i13 & (-57345);
                    shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                } else {
                    shapeM482RoundedCornerShape0680j_4 = shape;
                    i24 = i13;
                }
                if (i18 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                if ((i12 & 64) != 0) {
                    z13 = z12;
                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                    i24 &= -3670017;
                } else {
                    z13 = z12;
                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                }
                if ((i12 & 128) != 0) {
                    z11 = z13;
                    jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                    i24 &= -29360129;
                } else {
                    z11 = z13;
                    jM2518unboximpl = j10;
                }
                if ((i12 & 256) != 0) {
                    jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                    i25 = i24 & (-234881025);
                } else {
                    jM2518unboximpl2 = j11;
                    i25 = i24;
                }
                if (i20 != 0) {
                    paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                } else {
                    paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                }
                mutableInteractionSource3 = mutableInteractionSource2;
            } else {
                if (i29 != 0) {
                    modifier2 = Modifier.INSTANCE;
                } else {
                    modifier2 = modifier2;
                }
                if (i14 != 0) {
                    z12 = true;
                } else {
                    z12 = z11;
                }
                if (i16 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
                if ((i12 & 16) != 0) {
                    i24 = i13 & (-57345);
                    shapeM482RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m482RoundedCornerShape0680j_4(PrimitiveResources_androidKt.dimensionResource(R.dimen.button_corners, composerStartRestartGroup, 0));
                } else {
                    shapeM482RoundedCornerShape0680j_4 = shape;
                    i24 = i13;
                }
                if (i18 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                if ((i12 & 64) != 0) {
                    z13 = z12;
                    buttonColorsM680buttonColorsro_MJ88 = ButtonDefaults.INSTANCE.m680buttonColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, ButtonDefaults.$stable << 12, 15);
                    i24 &= -3670017;
                } else {
                    z13 = z12;
                    buttonColorsM680buttonColorsro_MJ88 = buttonColors;
                }
                if ((i12 & 128) != 0) {
                    z11 = z13;
                    jM2518unboximpl = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                    i24 &= -29360129;
                } else {
                    z11 = z13;
                    jM2518unboximpl = j10;
                }
                if ((i12 & 256) != 0) {
                    jM2518unboximpl2 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i24 >> 6) & 14) | ((i24 >> 15) & 112)).getValue().m2518unboximpl();
                    i25 = i24 & (-234881025);
                } else {
                    jM2518unboximpl2 = j11;
                    i25 = i24;
                }
                if (i20 != 0) {
                    paddingValuesM290PaddingValuesYgX7TsA = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(24), Dp.m4389constructorimpl(8));
                } else {
                    paddingValuesM290PaddingValuesYgX7TsA = paddingValues;
                }
                mutableInteractionSource3 = mutableInteractionSource2;
            }
            composerStartRestartGroup.endDefaults();
            j12 = jM2518unboximpl;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1316804655, i25, i22, "com.bbva.ui.compose.Button (Button.kt:286)");
            }
            stateCollectIsPressedAsState = PressInteractionKt.collectIsPressedAsState(mutableInteractionSource3, composerStartRestartGroup, (i25 >> 9) & 14);
            composerStartRestartGroup.startReplaceableGroup(-329670602);
            if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                jM2518unboximpl3 = j12;
            } else {
                jM2518unboximpl3 = buttonColorsM680buttonColorsro_MJ88.backgroundColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
            }
            composerStartRestartGroup.endReplaceableGroup();
            State<Color> stateM58animateColorAsStateeuL9pac119 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl3, null, null, null, composerStartRestartGroup, 0, 14);
            composerStartRestartGroup.startReplaceableGroup(-329670422);
            if (stateCollectIsPressedAsState.getValue().booleanValue()) {
                jM2518unboximpl4 = jM2518unboximpl2;
            } else {
                jM2518unboximpl4 = buttonColorsM680buttonColorsro_MJ88.contentColor(z11, composerStartRestartGroup, ((i25 >> 6) & 14) | ((i25 >> 15) & 112)).getValue().m2518unboximpl();
            }
            composerStartRestartGroup.endReplaceableGroup();
            State<Color> stateM58animateColorAsStateeuL9pac1110 = SingleValueAnimationKt.m58animateColorAsStateeuL9pac(jM2518unboximpl4, null, null, null, composerStartRestartGroup, 0, 14);
            b(function0, modifier2, z11, shapeM482RoundedCornerShape0680j_4, stateM58animateColorAsStateeuL9pac119.getValue().m2518unboximpl(), Color.m2507copywmQWz5c$default(stateM58animateColorAsStateeuL9pac1110.getValue().m2518unboximpl(), 1.0f, 0.0f, 0.0f, 0.0f, 14, null), borderStroke2, mutableInteractionSource3, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1271502359, true, new a(stateM58animateColorAsStateeuL9pac1110, paddingValuesM290PaddingValuesYgX7TsA, function3)), composerStartRestartGroup, (i25 & 14) | 100663296 | (i25 & 112) | (i25 & 896) | ((i25 >> 3) & 7168) | ((i25 << 3) & 3670016) | ((i25 << 12) & 29360128), 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            j13 = j12;
            paddingValues3 = paddingValuesM290PaddingValuesYgX7TsA;
            j14 = jM2518unboximpl2;
            borderStroke3 = borderStroke2;
            z14 = z11;
            buttonColors2 = buttonColorsM680buttonColorsro_MJ88;
            mutableInteractionSource4 = mutableInteractionSource3;
            Modifier modifier18 = modifier2;
            shape2 = shapeM482RoundedCornerShape0680j_4;
            modifier3 = modifier18;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new b(function0, modifier3, z14, mutableInteractionSource4, shape2, borderStroke3, buttonColors2, j13, j14, paddingValues3, function3, i10, i11, i12));
        }
    }

    public static final long access$Button_uPCbpMU$lambda$21(State state) {
        return ((Color) state.getValue()).m2518unboximpl();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final String access$PrimaryProgressButton$lambda$11(MutableState mutableState) {
        return (String) mutableState.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean access$PrimaryProgressButton$lambda$14(MutableState mutableState) {
        return ((Boolean) mutableState.getValue()).booleanValue();
    }

    public static final void access$PrimaryProgressButton$lambda$15(MutableState mutableState, boolean z10) {
        mutableState.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: renamed from: access$surface-9LQNqLg, reason: not valid java name */
    public static final Modifier m4976access$surface9LQNqLg(Modifier modifier, Shape shape, long j10, BorderStroke borderStroke) {
        return ClipKt.clip(BackgroundKt.m121backgroundbw27NRU(modifier.then(borderStroke != null ? BorderKt.border(Modifier.INSTANCE, borderStroke, shape) : Modifier.INSTANCE), j10, shape), shape);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x011f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0135  */
    /* JADX WARN: Code duplicated, block: B:106:0x013f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0161 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:117:0x0163  */
    /* JADX WARN: Code duplicated, block: B:118:0x0166  */
    /* JADX WARN: Code duplicated, block: B:120:0x0169  */
    /* JADX WARN: Code duplicated, block: B:122:0x016c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0171  */
    /* JADX WARN: Code duplicated, block: B:126:0x0176  */
    /* JADX WARN: Code duplicated, block: B:127:0x0184  */
    /* JADX WARN: Code duplicated, block: B:130:0x0189  */
    /* JADX WARN: Code duplicated, block: B:131:0x0197  */
    /* JADX WARN: Code duplicated, block: B:133:0x019b  */
    /* JADX WARN: Code duplicated, block: B:134:0x019d  */
    /* JADX WARN: Code duplicated, block: B:136:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:143:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:146:0x022b  */
    /* JADX WARN: Code duplicated, block: B:150:0x023d  */
    /* JADX WARN: Code duplicated, block: B:152:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00db  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    /* JADX WARN: Code duplicated, block: B:93:0x0106  */
    /* JADX WARN: Code duplicated, block: B:95:0x010e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0111  */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void b(Function0<Unit> function0, Modifier modifier, boolean z10, Shape shape, long j10, long j11, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        Shape shape2;
        int i16;
        long j12;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        Modifier modifier3;
        Shape rectangleShape;
        long jM717getSurface0d7_KjU;
        long jM731contentColorForek8zF_U;
        BorderStroke borderStroke2;
        MutableInteractionSource mutableInteractionSource2;
        Object objRememberedValue;
        boolean z12;
        MutableInteractionSource mutableInteractionSource3;
        BorderStroke borderStroke3;
        Shape shape3;
        long j13;
        long j14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i23;
        int i24;
        Composer composerStartRestartGroup = composer.startRestartGroup(1379799866);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i25 = i11 & 2;
        if (i25 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        shape2 = shape;
                        if (composerStartRestartGroup.changed(shape2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((57344 & i10) == 0) {
                        j12 = j10;
                        if ((i11 & 16) == 0 || !composerStartRestartGroup.changed(j12)) {
                            i24 = 8192;
                        } else {
                            i24 = 16384;
                        }
                        i12 |= i24;
                    } else {
                        j12 = j10;
                    }
                    if ((458752 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            i23 = i12;
                            int i26 = composerStartRestartGroup.changed(j11) ? 131072 : 65536;
                            i17 = i23 | i26;
                        } else {
                            i23 = i12;
                        }
                        i17 = i23 | i26;
                    } else {
                        i17 = i12;
                    }
                    i18 = i11 & 64;
                    if (i18 != 0) {
                        i17 |= 1572864;
                    } else if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changed(borderStroke)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i17 |= i19;
                    }
                    i20 = i11 & 128;
                    if (i20 != 0) {
                        i17 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i17 |= i21;
                    }
                    if ((i11 & 256) != 0) {
                        if ((234881024 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(function2)) {
                                i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            } else {
                                i22 = 33554432;
                            }
                            i17 |= i22;
                        }
                        if ((i17 & 191739611) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if (i25 != 0) {
                                    modifier3 = Modifier.INSTANCE;
                                } else {
                                    modifier3 = modifier2;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                }
                                if (i15 != 0) {
                                    rectangleShape = RectangleShapeKt.getRectangleShape();
                                } else {
                                    rectangleShape = shape2;
                                }
                                if ((i11 & 16) != 0) {
                                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                                    i17 &= -57345;
                                } else {
                                    jM717getSurface0d7_KjU = j12;
                                }
                                if ((i11 & 32) != 0) {
                                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                                    i17 = (-458753) & i17;
                                } else {
                                    jM731contentColorForek8zF_U = j11;
                                }
                                if (i18 != 0) {
                                    borderStroke2 = null;
                                } else {
                                    borderStroke2 = borderStroke;
                                }
                                if (i20 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                                } else {
                                    mutableInteractionSource2 = mutableInteractionSource;
                                }
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i11 & 16) != 0) {
                                    i17 &= -57345;
                                }
                                if ((i11 & 32) != 0) {
                                    i17 &= -458753;
                                }
                                borderStroke2 = borderStroke;
                                mutableInteractionSource2 = mutableInteractionSource;
                                modifier3 = modifier2;
                                rectangleShape = shape2;
                                jM717getSurface0d7_KjU = j12;
                                jM731contentColorForek8zF_U = j11;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                            }
                            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z12 = z11;
                            long j15 = jM731contentColorForek8zF_U;
                            mutableInteractionSource3 = mutableInteractionSource2;
                            borderStroke3 = borderStroke2;
                            shape3 = rectangleShape;
                            j13 = jM717getSurface0d7_KjU;
                            j14 = j15;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            borderStroke3 = borderStroke;
                            modifier3 = modifier2;
                            z12 = z11;
                            shape3 = shape2;
                            j13 = j12;
                            j14 = j11;
                            mutableInteractionSource3 = mutableInteractionSource;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new s(function0, modifier3, z12, shape3, j13, j14, borderStroke3, mutableInteractionSource3, function2, i10, i11));
                        }
                    }
                    i17 |= 100663296;
                    if ((i17 & 191739611) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i25 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            } else {
                                rectangleShape = shape2;
                            }
                            if ((i11 & 16) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                                i17 &= -57345;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 32) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                                i17 = (-458753) & i17;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i20 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                        } else {
                            if (i25 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            } else {
                                rectangleShape = shape2;
                            }
                            if ((i11 & 16) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                                i17 &= -57345;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 32) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                                i17 = (-458753) & i17;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i20 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                        }
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z11;
                        long j16 = jM731contentColorForek8zF_U;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        borderStroke3 = borderStroke2;
                        shape3 = rectangleShape;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = j16;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i25 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            } else {
                                rectangleShape = shape2;
                            }
                            if ((i11 & 16) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                                i17 &= -57345;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 32) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                                i17 = (-458753) & i17;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i20 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                        } else {
                            if (i25 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            } else {
                                rectangleShape = shape2;
                            }
                            if ((i11 & 16) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                                i17 &= -57345;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 32) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                                i17 = (-458753) & i17;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i20 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                        }
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z11;
                        long j17 = jM731contentColorForek8zF_U;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        borderStroke3 = borderStroke2;
                        shape3 = rectangleShape;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = j17;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new s(function0, modifier3, z12, shape3, j13, j14, borderStroke3, mutableInteractionSource3, function2, i10, i11));
                    }
                }
                i12 |= 3072;
                shape2 = shape;
                if ((57344 & i10) == 0) {
                    j12 = j10;
                    if ((i11 & 16) == 0) {
                        i24 = 8192;
                    } else {
                        i24 = 8192;
                    }
                    i12 |= i24;
                } else {
                    j12 = j10;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        i23 = i12;
                        if (composerStartRestartGroup.changed(j11)) {
                        }
                        i17 = i23 | i26;
                    } else {
                        i23 = i12;
                    }
                    i17 = i23 | i26;
                } else {
                    i17 = i12;
                }
                i18 = i11 & 64;
                if (i18 != 0) {
                    i17 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(borderStroke)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i17 |= i19;
                }
                i20 = i11 & 128;
                if (i20 != 0) {
                    i17 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i17 |= i21;
                }
                if ((i11 & 256) != 0) {
                    if ((234881024 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i22 = 33554432;
                        }
                        i17 |= i22;
                    }
                    if ((i17 & 191739611) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i25 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            } else {
                                rectangleShape = shape2;
                            }
                            if ((i11 & 16) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                                i17 &= -57345;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 32) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                                i17 = (-458753) & i17;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i20 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                        } else {
                            if (i25 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            } else {
                                rectangleShape = shape2;
                            }
                            if ((i11 & 16) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                                i17 &= -57345;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 32) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                                i17 = (-458753) & i17;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i20 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                        }
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z11;
                        long j18 = jM731contentColorForek8zF_U;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        borderStroke3 = borderStroke2;
                        shape3 = rectangleShape;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = j18;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i25 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            } else {
                                rectangleShape = shape2;
                            }
                            if ((i11 & 16) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                                i17 &= -57345;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 32) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                                i17 = (-458753) & i17;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i20 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                        } else {
                            if (i25 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            } else {
                                rectangleShape = shape2;
                            }
                            if ((i11 & 16) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                                i17 &= -57345;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 32) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                                i17 = (-458753) & i17;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i20 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                        }
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z11;
                        long j19 = jM731contentColorForek8zF_U;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        borderStroke3 = borderStroke2;
                        shape3 = rectangleShape;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = j19;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new s(function0, modifier3, z12, shape3, j13, j14, borderStroke3, mutableInteractionSource3, function2, i10, i11));
                    }
                }
                i17 |= 100663296;
                if ((i17 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    } else {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                    }
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    long j110 = jM731contentColorForek8zF_U;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    borderStroke3 = borderStroke2;
                    shape3 = rectangleShape;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = j110;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    } else {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                    }
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    long j111 = jM731contentColorForek8zF_U;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    borderStroke3 = borderStroke2;
                    shape3 = rectangleShape;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = j111;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new s(function0, modifier3, z12, shape3, j13, j14, borderStroke3, mutableInteractionSource3, function2, i10, i11));
                }
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            z11 = z10;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((57344 & i10) == 0) {
                    j12 = j10;
                    if ((i11 & 16) == 0) {
                        i24 = 8192;
                    } else {
                        i24 = 8192;
                    }
                    i12 |= i24;
                } else {
                    j12 = j10;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        i23 = i12;
                        if (composerStartRestartGroup.changed(j11)) {
                        }
                        i17 = i23 | i26;
                    } else {
                        i23 = i12;
                    }
                    i17 = i23 | i26;
                } else {
                    i17 = i12;
                }
                i18 = i11 & 64;
                if (i18 != 0) {
                    i17 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(borderStroke)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i17 |= i19;
                }
                i20 = i11 & 128;
                if (i20 != 0) {
                    i17 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i17 |= i21;
                }
                if ((i11 & 256) != 0) {
                    if ((234881024 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i22 = 33554432;
                        }
                        i17 |= i22;
                    }
                    if ((i17 & 191739611) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i25 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            } else {
                                rectangleShape = shape2;
                            }
                            if ((i11 & 16) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                                i17 &= -57345;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 32) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                                i17 = (-458753) & i17;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i20 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                        } else {
                            if (i25 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            } else {
                                rectangleShape = shape2;
                            }
                            if ((i11 & 16) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                                i17 &= -57345;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 32) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                                i17 = (-458753) & i17;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i20 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                        }
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z11;
                        long j112 = jM731contentColorForek8zF_U;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        borderStroke3 = borderStroke2;
                        shape3 = rectangleShape;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = j112;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i25 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            } else {
                                rectangleShape = shape2;
                            }
                            if ((i11 & 16) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                                i17 &= -57345;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 32) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                                i17 = (-458753) & i17;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i20 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                        } else {
                            if (i25 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            } else {
                                rectangleShape = shape2;
                            }
                            if ((i11 & 16) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                                i17 &= -57345;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 32) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                                i17 = (-458753) & i17;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i20 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                        }
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z11;
                        long j113 = jM731contentColorForek8zF_U;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        borderStroke3 = borderStroke2;
                        shape3 = rectangleShape;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = j113;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new s(function0, modifier3, z12, shape3, j13, j14, borderStroke3, mutableInteractionSource3, function2, i10, i11));
                    }
                }
                i17 |= 100663296;
                if ((i17 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    } else {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                    }
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    long j114 = jM731contentColorForek8zF_U;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    borderStroke3 = borderStroke2;
                    shape3 = rectangleShape;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = j114;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    } else {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                    }
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    long j115 = jM731contentColorForek8zF_U;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    borderStroke3 = borderStroke2;
                    shape3 = rectangleShape;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = j115;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new s(function0, modifier3, z12, shape3, j13, j14, borderStroke3, mutableInteractionSource3, function2, i10, i11));
                }
            }
            i12 |= 3072;
            shape2 = shape;
            if ((57344 & i10) == 0) {
                j12 = j10;
                if ((i11 & 16) == 0) {
                    i24 = 8192;
                } else {
                    i24 = 8192;
                }
                i12 |= i24;
            } else {
                j12 = j10;
            }
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    i23 = i12;
                    if (composerStartRestartGroup.changed(j11)) {
                    }
                    i17 = i23 | i26;
                } else {
                    i23 = i12;
                }
                i17 = i23 | i26;
            } else {
                i17 = i12;
            }
            i18 = i11 & 64;
            if (i18 != 0) {
                i17 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(borderStroke)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i17 |= i19;
            }
            i20 = i11 & 128;
            if (i20 != 0) {
                i17 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i17 |= i21;
            }
            if ((i11 & 256) != 0) {
                if ((234881024 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i22 = 33554432;
                    }
                    i17 |= i22;
                }
                if ((i17 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    } else {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                    }
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    long j116 = jM731contentColorForek8zF_U;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    borderStroke3 = borderStroke2;
                    shape3 = rectangleShape;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = j116;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    } else {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                    }
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    long j117 = jM731contentColorForek8zF_U;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    borderStroke3 = borderStroke2;
                    shape3 = rectangleShape;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = j117;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new s(function0, modifier3, z12, shape3, j13, j14, borderStroke3, mutableInteractionSource3, function2, i10, i11));
                }
            }
            i17 |= 100663296;
            if ((i17 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                        i17 &= -57345;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                        i17 = (-458753) & i17;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i20 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                } else {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                        i17 &= -57345;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                        i17 = (-458753) & i17;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i20 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z11;
                long j118 = jM731contentColorForek8zF_U;
                mutableInteractionSource3 = mutableInteractionSource2;
                borderStroke3 = borderStroke2;
                shape3 = rectangleShape;
                j13 = jM717getSurface0d7_KjU;
                j14 = j118;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                        i17 &= -57345;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                        i17 = (-458753) & i17;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i20 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                } else {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                        i17 &= -57345;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                        i17 = (-458753) & i17;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i20 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z11;
                long j119 = jM731contentColorForek8zF_U;
                mutableInteractionSource3 = mutableInteractionSource2;
                borderStroke3 = borderStroke2;
                shape3 = rectangleShape;
                j13 = jM717getSurface0d7_KjU;
                j14 = j119;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new s(function0, modifier3, z12, shape3, j13, j14, borderStroke3, mutableInteractionSource3, function2, i10, i11));
            }
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    shape2 = shape;
                    if (composerStartRestartGroup.changed(shape2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((57344 & i10) == 0) {
                    j12 = j10;
                    if ((i11 & 16) == 0) {
                        i24 = 8192;
                    } else {
                        i24 = 8192;
                    }
                    i12 |= i24;
                } else {
                    j12 = j10;
                }
                if ((458752 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        i23 = i12;
                        if (composerStartRestartGroup.changed(j11)) {
                        }
                        i17 = i23 | i26;
                    } else {
                        i23 = i12;
                    }
                    i17 = i23 | i26;
                } else {
                    i17 = i12;
                }
                i18 = i11 & 64;
                if (i18 != 0) {
                    i17 |= 1572864;
                } else if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changed(borderStroke)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i17 |= i19;
                }
                i20 = i11 & 128;
                if (i20 != 0) {
                    i17 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                        i21 = 8388608;
                    } else {
                        i21 = 4194304;
                    }
                    i17 |= i21;
                }
                if ((i11 & 256) != 0) {
                    if ((234881024 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(function2)) {
                            i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        } else {
                            i22 = 33554432;
                        }
                        i17 |= i22;
                    }
                    if ((i17 & 191739611) == 38347922) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i25 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            } else {
                                rectangleShape = shape2;
                            }
                            if ((i11 & 16) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                                i17 &= -57345;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 32) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                                i17 = (-458753) & i17;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i20 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                        } else {
                            if (i25 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            } else {
                                rectangleShape = shape2;
                            }
                            if ((i11 & 16) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                                i17 &= -57345;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 32) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                                i17 = (-458753) & i17;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i20 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                        }
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z11;
                        long j1110 = jM731contentColorForek8zF_U;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        borderStroke3 = borderStroke2;
                        shape3 = rectangleShape;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = j1110;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i25 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            } else {
                                rectangleShape = shape2;
                            }
                            if ((i11 & 16) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                                i17 &= -57345;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 32) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                                i17 = (-458753) & i17;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i20 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                        } else {
                            if (i25 != 0) {
                                modifier3 = Modifier.INSTANCE;
                            } else {
                                modifier3 = modifier2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if (i15 != 0) {
                                rectangleShape = RectangleShapeKt.getRectangleShape();
                            } else {
                                rectangleShape = shape2;
                            }
                            if ((i11 & 16) != 0) {
                                jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                                i17 &= -57345;
                            } else {
                                jM717getSurface0d7_KjU = j12;
                            }
                            if ((i11 & 32) != 0) {
                                jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                                i17 = (-458753) & i17;
                            } else {
                                jM731contentColorForek8zF_U = j11;
                            }
                            if (i18 != 0) {
                                borderStroke2 = null;
                            } else {
                                borderStroke2 = borderStroke;
                            }
                            if (i20 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                            } else {
                                mutableInteractionSource2 = mutableInteractionSource;
                            }
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                        }
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z12 = z11;
                        long j1111 = jM731contentColorForek8zF_U;
                        mutableInteractionSource3 = mutableInteractionSource2;
                        borderStroke3 = borderStroke2;
                        shape3 = rectangleShape;
                        j13 = jM717getSurface0d7_KjU;
                        j14 = j1111;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new s(function0, modifier3, z12, shape3, j13, j14, borderStroke3, mutableInteractionSource3, function2, i10, i11));
                    }
                }
                i17 |= 100663296;
                if ((i17 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    } else {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                    }
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    long j1112 = jM731contentColorForek8zF_U;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    borderStroke3 = borderStroke2;
                    shape3 = rectangleShape;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = j1112;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    } else {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                    }
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    long j1113 = jM731contentColorForek8zF_U;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    borderStroke3 = borderStroke2;
                    shape3 = rectangleShape;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = j1113;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new s(function0, modifier3, z12, shape3, j13, j14, borderStroke3, mutableInteractionSource3, function2, i10, i11));
                }
            }
            i12 |= 3072;
            shape2 = shape;
            if ((57344 & i10) == 0) {
                j12 = j10;
                if ((i11 & 16) == 0) {
                    i24 = 8192;
                } else {
                    i24 = 8192;
                }
                i12 |= i24;
            } else {
                j12 = j10;
            }
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    i23 = i12;
                    if (composerStartRestartGroup.changed(j11)) {
                    }
                    i17 = i23 | i26;
                } else {
                    i23 = i12;
                }
                i17 = i23 | i26;
            } else {
                i17 = i12;
            }
            i18 = i11 & 64;
            if (i18 != 0) {
                i17 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(borderStroke)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i17 |= i19;
            }
            i20 = i11 & 128;
            if (i20 != 0) {
                i17 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i17 |= i21;
            }
            if ((i11 & 256) != 0) {
                if ((234881024 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i22 = 33554432;
                    }
                    i17 |= i22;
                }
                if ((i17 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    } else {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                    }
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    long j1114 = jM731contentColorForek8zF_U;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    borderStroke3 = borderStroke2;
                    shape3 = rectangleShape;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = j1114;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    } else {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                    }
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    long j1115 = jM731contentColorForek8zF_U;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    borderStroke3 = borderStroke2;
                    shape3 = rectangleShape;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = j1115;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new s(function0, modifier3, z12, shape3, j13, j14, borderStroke3, mutableInteractionSource3, function2, i10, i11));
                }
            }
            i17 |= 100663296;
            if ((i17 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                        i17 &= -57345;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                        i17 = (-458753) & i17;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i20 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                } else {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                        i17 &= -57345;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                        i17 = (-458753) & i17;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i20 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z11;
                long j1116 = jM731contentColorForek8zF_U;
                mutableInteractionSource3 = mutableInteractionSource2;
                borderStroke3 = borderStroke2;
                shape3 = rectangleShape;
                j13 = jM717getSurface0d7_KjU;
                j14 = j1116;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                        i17 &= -57345;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                        i17 = (-458753) & i17;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i20 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                } else {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                        i17 &= -57345;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                        i17 = (-458753) & i17;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i20 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z11;
                long j1117 = jM731contentColorForek8zF_U;
                mutableInteractionSource3 = mutableInteractionSource2;
                borderStroke3 = borderStroke2;
                shape3 = rectangleShape;
                j13 = jM717getSurface0d7_KjU;
                j14 = j1117;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new s(function0, modifier3, z12, shape3, j13, j14, borderStroke3, mutableInteractionSource3, function2, i10, i11));
            }
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        z11 = z10;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                shape2 = shape;
                if (composerStartRestartGroup.changed(shape2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((57344 & i10) == 0) {
                j12 = j10;
                if ((i11 & 16) == 0) {
                    i24 = 8192;
                } else {
                    i24 = 8192;
                }
                i12 |= i24;
            } else {
                j12 = j10;
            }
            if ((458752 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    i23 = i12;
                    if (composerStartRestartGroup.changed(j11)) {
                    }
                    i17 = i23 | i26;
                } else {
                    i23 = i12;
                }
                i17 = i23 | i26;
            } else {
                i17 = i12;
            }
            i18 = i11 & 64;
            if (i18 != 0) {
                i17 |= 1572864;
            } else if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changed(borderStroke)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i17 |= i19;
            }
            i20 = i11 & 128;
            if (i20 != 0) {
                i17 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                    i21 = 8388608;
                } else {
                    i21 = 4194304;
                }
                i17 |= i21;
            }
            if ((i11 & 256) != 0) {
                if ((234881024 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(function2)) {
                        i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    } else {
                        i22 = 33554432;
                    }
                    i17 |= i22;
                }
                if ((i17 & 191739611) == 38347922) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    } else {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                    }
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    long j1118 = jM731contentColorForek8zF_U;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    borderStroke3 = borderStroke2;
                    shape3 = rectangleShape;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = j1118;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    } else {
                        if (i25 != 0) {
                            modifier3 = Modifier.INSTANCE;
                        } else {
                            modifier3 = modifier2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if (i15 != 0) {
                            rectangleShape = RectangleShapeKt.getRectangleShape();
                        } else {
                            rectangleShape = shape2;
                        }
                        if ((i11 & 16) != 0) {
                            jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                            i17 &= -57345;
                        } else {
                            jM717getSurface0d7_KjU = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                            i17 = (-458753) & i17;
                        } else {
                            jM731contentColorForek8zF_U = j11;
                        }
                        if (i18 != 0) {
                            borderStroke2 = null;
                        } else {
                            borderStroke2 = borderStroke;
                        }
                        if (i20 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                        } else {
                            mutableInteractionSource2 = mutableInteractionSource;
                        }
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                    }
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z12 = z11;
                    long j1119 = jM731contentColorForek8zF_U;
                    mutableInteractionSource3 = mutableInteractionSource2;
                    borderStroke3 = borderStroke2;
                    shape3 = rectangleShape;
                    j13 = jM717getSurface0d7_KjU;
                    j14 = j1119;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new s(function0, modifier3, z12, shape3, j13, j14, borderStroke3, mutableInteractionSource3, function2, i10, i11));
                }
            }
            i17 |= 100663296;
            if ((i17 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                        i17 &= -57345;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                        i17 = (-458753) & i17;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i20 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                } else {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                        i17 &= -57345;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                        i17 = (-458753) & i17;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i20 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z11;
                long j11110 = jM731contentColorForek8zF_U;
                mutableInteractionSource3 = mutableInteractionSource2;
                borderStroke3 = borderStroke2;
                shape3 = rectangleShape;
                j13 = jM717getSurface0d7_KjU;
                j14 = j11110;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                        i17 &= -57345;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                        i17 = (-458753) & i17;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i20 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                } else {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                        i17 &= -57345;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                        i17 = (-458753) & i17;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i20 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z11;
                long j11111 = jM731contentColorForek8zF_U;
                mutableInteractionSource3 = mutableInteractionSource2;
                borderStroke3 = borderStroke2;
                shape3 = rectangleShape;
                j13 = jM717getSurface0d7_KjU;
                j14 = j11111;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new s(function0, modifier3, z12, shape3, j13, j14, borderStroke3, mutableInteractionSource3, function2, i10, i11));
            }
        }
        i12 |= 3072;
        shape2 = shape;
        if ((57344 & i10) == 0) {
            j12 = j10;
            if ((i11 & 16) == 0) {
                i24 = 8192;
            } else {
                i24 = 8192;
            }
            i12 |= i24;
        } else {
            j12 = j10;
        }
        if ((458752 & i10) == 0) {
            if ((i11 & 32) == 0) {
                i23 = i12;
                if (composerStartRestartGroup.changed(j11)) {
                }
                i17 = i23 | i26;
            } else {
                i23 = i12;
            }
            i17 = i23 | i26;
        } else {
            i17 = i12;
        }
        i18 = i11 & 64;
        if (i18 != 0) {
            i17 |= 1572864;
        } else if ((i10 & 3670016) == 0) {
            if (composerStartRestartGroup.changed(borderStroke)) {
                i19 = 1048576;
            } else {
                i19 = 524288;
            }
            i17 |= i19;
        }
        i20 = i11 & 128;
        if (i20 != 0) {
            i17 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (composerStartRestartGroup.changed(mutableInteractionSource)) {
                i21 = 8388608;
            } else {
                i21 = 4194304;
            }
            i17 |= i21;
        }
        if ((i11 & 256) != 0) {
            if ((234881024 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(function2)) {
                    i22 = AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                } else {
                    i22 = 33554432;
                }
                i17 |= i22;
            }
            if ((i17 & 191739611) == 38347922) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                        i17 &= -57345;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                        i17 = (-458753) & i17;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i20 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                } else {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                        i17 &= -57345;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                        i17 = (-458753) & i17;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i20 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z11;
                long j11112 = jM731contentColorForek8zF_U;
                mutableInteractionSource3 = mutableInteractionSource2;
                borderStroke3 = borderStroke2;
                shape3 = rectangleShape;
                j13 = jM717getSurface0d7_KjU;
                j14 = j11112;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                        i17 &= -57345;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                        i17 = (-458753) & i17;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i20 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                } else {
                    if (i25 != 0) {
                        modifier3 = Modifier.INSTANCE;
                    } else {
                        modifier3 = modifier2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if (i15 != 0) {
                        rectangleShape = RectangleShapeKt.getRectangleShape();
                    } else {
                        rectangleShape = shape2;
                    }
                    if ((i11 & 16) != 0) {
                        jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                        i17 &= -57345;
                    } else {
                        jM717getSurface0d7_KjU = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                        i17 = (-458753) & i17;
                    } else {
                        jM731contentColorForek8zF_U = j11;
                    }
                    if (i18 != 0) {
                        borderStroke2 = null;
                    } else {
                        borderStroke2 = borderStroke;
                    }
                    if (i20 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                    } else {
                        mutableInteractionSource2 = mutableInteractionSource;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
                }
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z12 = z11;
                long j11113 = jM731contentColorForek8zF_U;
                mutableInteractionSource3 = mutableInteractionSource2;
                borderStroke3 = borderStroke2;
                shape3 = rectangleShape;
                j13 = jM717getSurface0d7_KjU;
                j14 = j11113;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new s(function0, modifier3, z12, shape3, j13, j14, borderStroke3, mutableInteractionSource3, function2, i10, i11));
            }
        }
        i17 |= 100663296;
        if ((i17 & 191739611) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i25 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if (i15 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = shape2;
                }
                if ((i11 & 16) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                    i17 &= -57345;
                } else {
                    jM717getSurface0d7_KjU = j12;
                }
                if ((i11 & 32) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                    i17 = (-458753) & i17;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if (i18 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                if (i20 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
            } else {
                if (i25 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if (i15 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = shape2;
                }
                if ((i11 & 16) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                    i17 &= -57345;
                } else {
                    jM717getSurface0d7_KjU = j12;
                }
                if ((i11 & 32) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                    i17 = (-458753) & i17;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if (i18 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                if (i20 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z12 = z11;
            long j11114 = jM731contentColorForek8zF_U;
            mutableInteractionSource3 = mutableInteractionSource2;
            borderStroke3 = borderStroke2;
            shape3 = rectangleShape;
            j13 = jM717getSurface0d7_KjU;
            j14 = j11114;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i25 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if (i15 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = shape2;
                }
                if ((i11 & 16) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                    i17 &= -57345;
                } else {
                    jM717getSurface0d7_KjU = j12;
                }
                if ((i11 & 32) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                    i17 = (-458753) & i17;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if (i18 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                if (i20 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
            } else {
                if (i25 != 0) {
                    modifier3 = Modifier.INSTANCE;
                } else {
                    modifier3 = modifier2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if (i15 != 0) {
                    rectangleShape = RectangleShapeKt.getRectangleShape();
                } else {
                    rectangleShape = shape2;
                }
                if ((i11 & 16) != 0) {
                    jM717getSurface0d7_KjU = MaterialTheme.INSTANCE.getColors(composerStartRestartGroup, MaterialTheme.$stable).m717getSurface0d7_KjU();
                    i17 &= -57345;
                } else {
                    jM717getSurface0d7_KjU = j12;
                }
                if ((i11 & 32) != 0) {
                    jM731contentColorForek8zF_U = ColorsKt.m731contentColorForek8zF_U(jM717getSurface0d7_KjU, composerStartRestartGroup, (i17 >> 12) & 14);
                    i17 = (-458753) & i17;
                } else {
                    jM731contentColorForek8zF_U = j11;
                }
                if (i18 != 0) {
                    borderStroke2 = null;
                } else {
                    borderStroke2 = borderStroke;
                }
                if (i20 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSourceKt.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    mutableInteractionSource2 = (MutableInteractionSource) objRememberedValue;
                } else {
                    mutableInteractionSource2 = mutableInteractionSource;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1379799866, i17, -1, "com.bbva.ui.compose.Surface (Button.kt:329)");
            }
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(jM731contentColorForek8zF_U)), ElevationOverlayKt.getLocalAbsoluteElevation().provides(Dp.m4387boximpl(((Dp) composerStartRestartGroup.consume(ElevationOverlayKt.getLocalAbsoluteElevation())).m4403unboximpl()))}, ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1322919546, true, new r(modifier3, rectangleShape, jM717getSurface0d7_KjU, borderStroke2, mutableInteractionSource2, z11, function0, function2)), composerStartRestartGroup, 56);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z12 = z11;
            long j11115 = jM731contentColorForek8zF_U;
            mutableInteractionSource3 = mutableInteractionSource2;
            borderStroke3 = borderStroke2;
            shape3 = rectangleShape;
            j13 = jM717getSurface0d7_KjU;
            j14 = j11115;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new s(function0, modifier3, z12, shape3, j13, j14, borderStroke3, mutableInteractionSource3, function2, i10, i11));
        }
    }
}
