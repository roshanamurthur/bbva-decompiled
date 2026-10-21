package androidx.compose.material3;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TransitionKt;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.foundation.gestures.TapGestureDetectorKt;
import androidx.compose.foundation.layout.AlignmentLineKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.tokens.PlainTooltipTokens;
import androidx.compose.material3.tokens.RichTooltipTokens;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEvent;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.plugin.showinfo.command.TooltipCommand;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.vierge.bluetoothlibrary.BluetoothState;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
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
import kotlinx.coroutines.Job;
import l0.n5;
import l0.o5;
import l0.r5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Tooltip.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001ax\u0010\u0013\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u000fH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0096\u0001\u0010\u001a\u001a\u00020\u00012\u0011\u0010\u0014\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00152\u0015\b\u0002\u0010\u0016\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\u0015\b\u0002\u0010\u0017\u001a\u000f\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000¢\u0006\u0002\b\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u00182\u001c\u0010\u0010\u001a\u0018\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r¢\u0006\u0002\b\u0002¢\u0006\u0002\b\u000fH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\"\u001d\u0010!\u001a\u00020\u001c8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u001d\u0010$\u001a\u00020\u001c8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b#\u0010 \"\u001d\u0010'\u001a\u00020\u001c8\u0000X\u0080\u0004ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b&\u0010 \"\u0014\u0010)\u001a\u00020(8\u0000X\u0080T¢\u0006\u0006\n\u0004\b)\u0010*\"\u0014\u0010,\u001a\u00020+8\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", TooltipCommand.ID, "Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/material3/PlainTooltipState;", "tooltipState", "Landroidx/compose/ui/graphics/Shape;", "shape", "Landroidx/compose/ui/graphics/Color;", "containerColor", "contentColor", "Lkotlin/Function1;", "Landroidx/compose/material3/TooltipBoxScope;", "Lkotlin/ExtensionFunctionType;", "content", "PlainTooltipBox-nBX6wN0", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/PlainTooltipState;Landroidx/compose/ui/graphics/Shape;JJLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "PlainTooltipBox", "text", "Landroidx/compose/material3/RichTooltipState;", "title", "action", "Landroidx/compose/material3/RichTooltipColors;", "colors", "RichTooltipBox", "(Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/RichTooltipState;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/graphics/Shape;Landroidx/compose/material3/RichTooltipColors;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "Landroidx/compose/ui/unit/Dp;", "b", "F", "getTooltipMinHeight", "()F", "TooltipMinHeight", "c", "getTooltipMinWidth", "TooltipMinWidth", "h", "getRichTooltipHorizontalPadding", "RichTooltipHorizontalPadding", "", "TooltipDuration", "J", "", "TooltipFadeInDuration", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "material3_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 7 Effects.kt\nandroidx/compose/runtime/EffectsKt\n+ 8 Effects.kt\nandroidx/compose/runtime/EffectsKt$rememberCoroutineScope$1\n+ 9 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 10 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 11 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 12 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n*L\n1#1,770:1\n25#2:771\n25#2:780\n25#2:788\n25#2:796\n50#2:803\n49#2:804\n25#2:815\n25#2:826\n460#2,13:853\n473#2,3:867\n460#2,13:891\n473#2,3:905\n460#2,13:929\n460#2,13:962\n473#2,3:976\n460#2,13:1000\n473#2,3:1014\n460#2,13:1038\n473#2,3:1052\n473#2,3:1057\n1114#3,6:772\n1114#3,6:781\n1114#3,6:789\n1114#3,6:797\n1114#3,6:805\n1114#3,3:816\n1117#3,3:822\n1114#3,6:827\n76#4:778\n76#4:795\n76#4:841\n76#4:879\n76#4:917\n76#4:950\n76#4:988\n76#4:1026\n1#5:779\n154#6:787\n154#6:1063\n154#6:1064\n154#6:1065\n154#6:1066\n154#6:1067\n154#6:1068\n154#6:1069\n154#6:1070\n154#6:1071\n154#6:1072\n154#6:1073\n154#6:1074\n154#6:1075\n474#7,4:811\n478#7,2:819\n482#7:825\n474#8:821\n66#9,7:833\n73#9:866\n77#9:871\n67#9,6:872\n73#9:904\n77#9:909\n67#9,6:943\n73#9:975\n77#9:980\n67#9,6:981\n73#9:1013\n77#9:1018\n67#9,6:1019\n73#9:1051\n77#9:1056\n75#10:840\n76#10,11:842\n89#10:870\n75#10:878\n76#10,11:880\n89#10:908\n75#10:916\n76#10,11:918\n75#10:949\n76#10,11:951\n89#10:979\n75#10:987\n76#10,11:989\n89#10:1017\n75#10:1025\n76#10,11:1027\n89#10:1055\n89#10:1060\n74#11,6:910\n80#11:942\n84#11:1061\n135#12:1062\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt\n*L\n98#1:771\n105#1:780\n152#1:788\n160#1:796\n162#1:803\n162#1:804\n200#1:815\n203#1:826\n246#1:853,13\n246#1:867,3\n285#1:891,13\n285#1:905,3\n309#1:929,13\n313#1:962,13\n313#1:976,3\n323#1:1000,13\n323#1:1014,3\n333#1:1038,13\n333#1:1052,3\n309#1:1057,3\n98#1:772,6\n105#1:781,6\n152#1:789,6\n160#1:797,6\n162#1:805,6\n200#1:816,3\n200#1:822,3\n203#1:827,6\n104#1:778\n159#1:795\n246#1:841\n285#1:879\n309#1:917\n313#1:950\n323#1:988\n333#1:1026\n119#1:787\n752#1:1063\n753#1:1064\n754#1:1065\n755#1:1066\n756#1:1067\n757#1:1068\n760#1:1069\n761#1:1070\n762#1:1071\n763#1:1072\n764#1:1073\n765#1:1074\n766#1:1075\n200#1:811,4\n200#1:819,2\n200#1:825\n200#1:821\n246#1:833,7\n246#1:866\n246#1:871\n285#1:872,6\n285#1:904\n285#1:909\n313#1:943,6\n313#1:975\n313#1:980\n323#1:981,6\n323#1:1013\n323#1:1018\n333#1:1019,6\n333#1:1051\n333#1:1056\n246#1:840\n246#1:842,11\n246#1:870\n285#1:878\n285#1:880,11\n285#1:908\n309#1:916\n309#1:918,11\n313#1:949\n313#1:951,11\n313#1:979\n323#1:987\n323#1:989,11\n323#1:1017\n333#1:1025\n333#1:1027,11\n333#1:1055\n309#1:1060\n309#1:910,6\n309#1:942\n309#1:1061\n696#1:1062\n*E\n"})
public final class TooltipKt {
    public static final long TooltipDuration = 1500;
    public static final int TooltipFadeInDuration = 150;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f12525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f12526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f12527c = Dp.m4389constructorimpl(40);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f12528d = Dp.m4389constructorimpl(200);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f12529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public static final PaddingValues f12530f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float f12531g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float f12532h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float f12533i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final float f12534j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final float f12535k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float f12536l;
    public static final float m;

    /* JADX INFO: compiled from: Tooltip.kt */
    public static final class a extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ long f12555p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f12556q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ int f12557r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(long j10, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f12555p0 = j10;
            this.f12556q0 = function2;
            this.f12557r0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-785135750, iIntValue, -1, "androidx.compose.material3.PlainTooltipBox.<anonymous> (Tooltip.kt:107)");
                }
                int i10 = this.f12557r0;
                TooltipKt.m1490access$PlainTooltipImplIv8Zu3U(this.f12555p0, this.f12556q0, composer2, ((i10 << 3) & 112) | ((i10 >> 15) & 14));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Tooltip.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f12559p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f12560q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PlainTooltipState f12561r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Shape f12562s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ long f12563t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f12564u0;
        public final /* synthetic */ Function3<TooltipBoxScope, Composer, Integer, Unit> v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f12565w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f12566x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, PlainTooltipState plainTooltipState, Shape shape, long j10, long j11, Function3<? super TooltipBoxScope, ? super Composer, ? super Integer, Unit> function3, int i10, int i11) {
            super(2);
            this.f12559p0 = function2;
            this.f12560q0 = modifier;
            this.f12561r0 = plainTooltipState;
            this.f12562s0 = shape;
            this.f12563t0 = j10;
            this.f12564u0 = j11;
            this.v0 = function3;
            this.f12565w0 = i10;
            this.f12566x0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TooltipKt.m1489PlainTooltipBoxnBX6wN0(this.f12559p0, this.f12560q0, this.f12561r0, this.f12562s0, this.f12563t0, this.f12564u0, this.v0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f12565w0 | 1), this.f12566x0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Tooltip.kt */
    public static final class c extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ RichTooltipState f12567p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f12568q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(RichTooltipState richTooltipState, Function2<? super Composer, ? super Integer, Unit> function2) {
            super(0);
            this.f12567p0 = richTooltipState;
            this.f12568q0 = function2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            this.f12567p0.setPersistent$material3_release(this.f12568q0 != null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Tooltip.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ RichTooltipColors f12569p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f12570q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f12571r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f12572s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ int f12573t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(RichTooltipColors richTooltipColors, Function2<? super Composer, ? super Integer, Unit> function2, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, int i10) {
            super(2);
            this.f12569p0 = richTooltipColors;
            this.f12570q0 = function2;
            this.f12571r0 = function3;
            this.f12572s0 = function4;
            this.f12573t0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1423372873, iIntValue, -1, "androidx.compose.material3.RichTooltipBox.<anonymous> (Tooltip.kt:167)");
                }
                RichTooltipColors richTooltipColors = this.f12569p0;
                Function2<Composer, Integer, Unit> function2 = this.f12570q0;
                Function2<Composer, Integer, Unit> function3 = this.f12571r0;
                Function2<Composer, Integer, Unit> function4 = this.f12572s0;
                int i10 = this.f12573t0;
                int i11 = ((i10 >> 18) & 14) | ((i10 << 3) & 112);
                int i12 = i10 >> 3;
                TooltipKt.access$RichTooltipImpl(richTooltipColors, function2, function3, function4, composer2, i11 | (i12 & 896) | (i12 & 7168));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Tooltip.kt */
    public static final class e extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f12574p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Modifier f12575q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ RichTooltipState f12576r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f12577s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f12578t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Shape f12579u0;
        public final /* synthetic */ RichTooltipColors v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function3<TooltipBoxScope, Composer, Integer, Unit> f12580w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f12581x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f12582y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, RichTooltipState richTooltipState, Function2<? super Composer, ? super Integer, Unit> function3, Function2<? super Composer, ? super Integer, Unit> function4, Shape shape, RichTooltipColors richTooltipColors, Function3<? super TooltipBoxScope, ? super Composer, ? super Integer, Unit> function5, int i10, int i11) {
            super(2);
            this.f12574p0 = function2;
            this.f12575q0 = modifier;
            this.f12576r0 = richTooltipState;
            this.f12577s0 = function3;
            this.f12578t0 = function4;
            this.f12579u0 = shape;
            this.v0 = richTooltipColors;
            this.f12580w0 = function5;
            this.f12581x0 = i10;
            this.f12582y0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TooltipKt.RichTooltipBox(this.f12574p0, this.f12575q0, this.f12576r0, this.f12577s0, this.f12578t0, this.f12579u0, this.v0, this.f12580w0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f12581x0 | 1), this.f12582y0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Tooltip.kt */
    public static final class f extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ TooltipState f12583p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CoroutineScope f12584q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(TooltipState tooltipState, CoroutineScope coroutineScope) {
            super(0);
            this.f12583p0 = tooltipState;
            this.f12584q0 = coroutineScope;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            TooltipState tooltipState = this.f12583p0;
            if (tooltipState.isVisible()) {
                BuildersKt__Builders_commonKt.launch$default(this.f12584q0, null, null, new f5(tooltipState, null), 3, null);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Tooltip.kt */
    @SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$TooltipBox$1$2\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,770:1\n36#2:771\n1114#3,6:772\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$TooltipBox$1$2\n*L\n266#1:771\n266#1:772,6\n*E\n"})
    public static final class g extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Modifier f12585p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ float f12586q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Transition<Boolean> f12587r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f12588s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Shape f12589t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f12590u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f12591w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ int f12592x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(Modifier modifier, float f6, Transition<Boolean> transition, String str, Shape shape, long j10, float f10, Function2<? super Composer, ? super Integer, Unit> function2, int i10) {
            super(2);
            this.f12585p0 = modifier;
            this.f12586q0 = f6;
            this.f12587r0 = transition;
            this.f12588s0 = str;
            this.f12589t0 = shape;
            this.f12590u0 = j10;
            this.v0 = f10;
            this.f12591w0 = function2;
            this.f12592x0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            Composer composer2 = composer;
            int iIntValue = num.intValue();
            if ((iIntValue & 11) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-442150991, iIntValue, -1, "androidx.compose.material3.TooltipBox.<anonymous>.<anonymous> (Tooltip.kt:256)");
                }
                Modifier modifierAccess$animateTooltip = TooltipKt.access$animateTooltip(SizeKt.m339sizeInqDBjuR0$default(this.f12585p0, TooltipKt.getTooltipMinWidth(), TooltipKt.getTooltipMinHeight(), this.f12586q0, 0.0f, 8, null), this.f12587r0);
                composer2.startReplaceableGroup(1157296644);
                String str = this.f12588s0;
                boolean zChanged = composer2.changed(str);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new g5(str);
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceableGroup();
                Modifier modifierSemantics$default = SemanticsModifierKt.semantics$default(modifierAccess$animateTooltip, false, (Function1) objRememberedValue, 1, null);
                Shape shape = this.f12589t0;
                long j10 = this.f12590u0;
                float f6 = this.v0;
                Function2<Composer, Integer, Unit> function2 = this.f12591w0;
                int i10 = this.f12592x0;
                int i11 = i10 >> 6;
                SurfaceKt.m1329SurfaceT9BRK9s(modifierSemantics$default, shape, j10, 0L, f6, f6, null, function2, composer2, (i11 & 57344) | (i11 & 112) | ((i10 >> 9) & 896) | ((i10 >> 3) & 458752) | ((i10 << 21) & 29360128), 72);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Tooltip.kt */
    public static final class h extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function2<Composer, Integer, Unit> f12593p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ PopupPositionProvider f12594q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f12595r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Shape f12596s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ TooltipState f12597t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f12598u0;
        public final /* synthetic */ float v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ float f12599w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ Function3<TooltipBoxScope, Composer, Integer, Unit> f12600x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ int f12601y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(Function2<? super Composer, ? super Integer, Unit> function2, PopupPositionProvider popupPositionProvider, Modifier modifier, Shape shape, TooltipState tooltipState, long j10, float f6, float f10, Function3<? super TooltipBoxScope, ? super Composer, ? super Integer, Unit> function3, int i10) {
            super(2);
            this.f12593p0 = function2;
            this.f12594q0 = popupPositionProvider;
            this.f12595r0 = modifier;
            this.f12596s0 = shape;
            this.f12597t0 = tooltipState;
            this.f12598u0 = j10;
            this.v0 = f6;
            this.f12599w0 = f10;
            this.f12600x0 = function3;
            this.f12601y0 = i10;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            TooltipKt.a(this.f12593p0, this.f12594q0, this.f12595r0, this.f12596s0, this.f12597t0, this.f12598u0, this.v0, this.f12599w0, this.f12600x0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f12601y0 | 1));
            return Unit.INSTANCE;
        }
    }

    static {
        float f6 = 4;
        f12525a = Dp.m4389constructorimpl(f6);
        float f10 = 24;
        f12526b = Dp.m4389constructorimpl(f10);
        float fM4389constructorimpl = Dp.m4389constructorimpl(f6);
        f12529e = fM4389constructorimpl;
        float f11 = 8;
        f12530f = PaddingKt.m290PaddingValuesYgX7TsA(Dp.m4389constructorimpl(f11), fM4389constructorimpl);
        f12531g = Dp.m4389constructorimpl(320);
        float f12 = 16;
        f12532h = Dp.m4389constructorimpl(f12);
        f12533i = Dp.m4389constructorimpl(28);
        f12534j = Dp.m4389constructorimpl(f10);
        f12535k = Dp.m4389constructorimpl(f12);
        f12536l = Dp.m4389constructorimpl(36);
        m = Dp.m4389constructorimpl(f11);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012a  */
    /* JADX WARN: Code duplicated, block: B:102:0x012f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0141  */
    /* JADX WARN: Code duplicated, block: B:108:0x0153  */
    /* JADX WARN: Code duplicated, block: B:111:0x0160  */
    /* JADX WARN: Code duplicated, block: B:114:0x016d  */
    /* JADX WARN: Code duplicated, block: B:117:0x017d  */
    /* JADX WARN: Code duplicated, block: B:120:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:123:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:128:0x0212  */
    /* JADX WARN: Code duplicated, block: B:130:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX WARN: Code duplicated, block: B:32:0x0061  */
    /* JADX WARN: Code duplicated, block: B:33:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:42:0x007a  */
    /* JADX WARN: Code duplicated, block: B:45:0x0080  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008d  */
    /* JADX WARN: Code duplicated, block: B:52:0x0095  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:86:0x0104  */
    /* JADX WARN: Code duplicated, block: B:99:0x0128 A[DONT_INVERT] */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: PlainTooltipBox-nBX6wN0, reason: not valid java name */
    public static final void m1489PlainTooltipBoxnBX6wN0(@NotNull Function2<? super Composer, ? super Integer, Unit> tooltip, @Nullable Modifier modifier, @Nullable PlainTooltipState plainTooltipState, @Nullable Shape shape, long j10, long j11, @NotNull Function3<? super TooltipBoxScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        PlainTooltipState plainTooltipState2;
        int i14;
        Shape plainTooltipContainerShape;
        long plainTooltipContainerColor;
        long plainTooltipContentColor;
        int i15;
        Object objRememberedValue;
        int iMo413roundToPx0680j_4;
        Object objRememberedValue2;
        Modifier modifier3;
        PlainTooltipState plainTooltipState3;
        Shape shape2;
        long j12;
        long j13;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(tooltip, "tooltip");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-531325137);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(tooltip) ? 4 : 2) | i10;
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
                    plainTooltipState2 = plainTooltipState;
                    if (composerStartRestartGroup.changed(plainTooltipState2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 7168) == 0) {
                    if ((i11 & 8) == 0) {
                        plainTooltipContainerShape = shape;
                        int i17 = composerStartRestartGroup.changed(plainTooltipContainerShape) ? 2048 : 1024;
                        i12 |= i17;
                    } else {
                        plainTooltipContainerShape = shape;
                    }
                    i12 |= i17;
                } else {
                    plainTooltipContainerShape = shape;
                }
                if ((i10 & 57344) == 0) {
                    if ((i11 & 16) == 0) {
                        plainTooltipContainerColor = j10;
                        int i18 = composerStartRestartGroup.changed(plainTooltipContainerColor) ? 16384 : 8192;
                        i12 |= i18;
                    } else {
                        plainTooltipContainerColor = j10;
                    }
                    i12 |= i18;
                } else {
                    plainTooltipContainerColor = j10;
                }
                if ((i10 & 458752) == 0) {
                    if ((i11 & 32) == 0) {
                        plainTooltipContentColor = j11;
                        int i19 = composerStartRestartGroup.changed(plainTooltipContentColor) ? 131072 : 65536;
                        i12 |= i19;
                    } else {
                        plainTooltipContentColor = j11;
                    }
                    i12 |= i19;
                } else {
                    plainTooltipContentColor = j11;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                    }
                    if ((i12 & 2995931) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            if (i16 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new PlainTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 16) != 0) {
                                plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                                i12 &= -458753;
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                        }
                        Modifier modifier4 = modifier2;
                        PlainTooltipState plainTooltipState4 = plainTooltipState2;
                        Shape shape3 = plainTooltipContainerShape;
                        long j14 = plainTooltipContainerColor;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-531325137, i12, -1, "androidx.compose.material3.PlainTooltipBox (Tooltip.kt:94)");
                        }
                        iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new l0.t2(iMo413roundToPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        l0.t2 t2Var = (l0.t2) objRememberedValue2;
                        float fM4389constructorimpl = Dp.m4389constructorimpl(0);
                        float f6 = f12528d;
                        ComposableLambda composableLambda = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -785135750, true, new a(plainTooltipContentColor, tooltip, i12));
                        int i20 = i12 << 3;
                        int i21 = (i20 & 896) | 14155830 | (i12 & 7168);
                        int i22 = i12 << 6;
                        long j15 = plainTooltipContentColor;
                        a(composableLambda, t2Var, modifier4, shape3, plainTooltipState4, j14, fM4389constructorimpl, f6, content, composerStartRestartGroup, (i20 & 458752) | i21 | (57344 & i22) | (i22 & 234881024));
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier4;
                        plainTooltipState3 = plainTooltipState4;
                        shape2 = shape3;
                        j12 = j14;
                        j13 = j15;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        plainTooltipState3 = plainTooltipState2;
                        shape2 = plainTooltipContainerShape;
                        j12 = plainTooltipContainerColor;
                        j13 = plainTooltipContentColor;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new b(tooltip, modifier3, plainTooltipState3, shape2, j12, j13, content, i10, i11));
                }
                i15 = 1572864;
                i12 |= i15;
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new PlainTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 16) != 0) {
                            plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        }
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new PlainTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 16) != 0) {
                            plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        }
                    }
                    Modifier modifier5 = modifier2;
                    PlainTooltipState plainTooltipState5 = plainTooltipState2;
                    Shape shape4 = plainTooltipContainerShape;
                    long j16 = plainTooltipContainerColor;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-531325137, i12, -1, "androidx.compose.material3.PlainTooltipBox (Tooltip.kt:94)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new l0.t2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.t2 t2Var2 = (l0.t2) objRememberedValue2;
                    float fM4389constructorimpl2 = Dp.m4389constructorimpl(0);
                    float f10 = f12528d;
                    ComposableLambda composableLambda2 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -785135750, true, new a(plainTooltipContentColor, tooltip, i12));
                    int i23 = i12 << 3;
                    int i24 = (i23 & 896) | 14155830 | (i12 & 7168);
                    int i25 = i12 << 6;
                    long j17 = plainTooltipContentColor;
                    a(composableLambda2, t2Var2, modifier5, shape4, plainTooltipState5, j16, fM4389constructorimpl2, f10, content, composerStartRestartGroup, (i23 & 458752) | i24 | (57344 & i25) | (i25 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    plainTooltipState3 = plainTooltipState5;
                    shape2 = shape4;
                    j12 = j16;
                    j13 = j17;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new PlainTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 16) != 0) {
                            plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        }
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new PlainTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 16) != 0) {
                            plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        }
                    }
                    Modifier modifier6 = modifier2;
                    PlainTooltipState plainTooltipState6 = plainTooltipState2;
                    Shape shape5 = plainTooltipContainerShape;
                    long j18 = plainTooltipContainerColor;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-531325137, i12, -1, "androidx.compose.material3.PlainTooltipBox (Tooltip.kt:94)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new l0.t2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.t2 t2Var3 = (l0.t2) objRememberedValue2;
                    float fM4389constructorimpl3 = Dp.m4389constructorimpl(0);
                    float f11 = f12528d;
                    ComposableLambda composableLambda3 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -785135750, true, new a(plainTooltipContentColor, tooltip, i12));
                    int i26 = i12 << 3;
                    int i27 = (i26 & 896) | 14155830 | (i12 & 7168);
                    int i28 = i12 << 6;
                    long j19 = plainTooltipContentColor;
                    a(composableLambda3, t2Var3, modifier6, shape5, plainTooltipState6, j18, fM4389constructorimpl3, f11, content, composerStartRestartGroup, (i26 & 458752) | i27 | (57344 & i28) | (i28 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier6;
                    plainTooltipState3 = plainTooltipState6;
                    shape2 = shape5;
                    j12 = j18;
                    j13 = j19;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(tooltip, modifier3, plainTooltipState3, shape2, j12, j13, content, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            plainTooltipState2 = plainTooltipState;
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    plainTooltipContainerShape = shape;
                    if (composerStartRestartGroup.changed(plainTooltipContainerShape)) {
                    }
                    i12 |= i17;
                } else {
                    plainTooltipContainerShape = shape;
                }
                i12 |= i17;
            } else {
                plainTooltipContainerShape = shape;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    plainTooltipContainerColor = j10;
                    if (composerStartRestartGroup.changed(plainTooltipContainerColor)) {
                    }
                    i12 |= i18;
                } else {
                    plainTooltipContainerColor = j10;
                }
                i12 |= i18;
            } else {
                plainTooltipContainerColor = j10;
            }
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
                    plainTooltipContentColor = j11;
                    if (composerStartRestartGroup.changed(plainTooltipContentColor)) {
                    }
                    i12 |= i19;
                } else {
                    plainTooltipContentColor = j11;
                }
                i12 |= i19;
            } else {
                plainTooltipContentColor = j11;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                }
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new PlainTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 16) != 0) {
                            plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        }
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new PlainTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 16) != 0) {
                            plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        }
                    }
                    Modifier modifier7 = modifier2;
                    PlainTooltipState plainTooltipState7 = plainTooltipState2;
                    Shape shape6 = plainTooltipContainerShape;
                    long j110 = plainTooltipContainerColor;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-531325137, i12, -1, "androidx.compose.material3.PlainTooltipBox (Tooltip.kt:94)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new l0.t2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.t2 t2Var4 = (l0.t2) objRememberedValue2;
                    float fM4389constructorimpl4 = Dp.m4389constructorimpl(0);
                    float f12 = f12528d;
                    ComposableLambda composableLambda4 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -785135750, true, new a(plainTooltipContentColor, tooltip, i12));
                    int i29 = i12 << 3;
                    int i210 = (i29 & 896) | 14155830 | (i12 & 7168);
                    int i211 = i12 << 6;
                    long j111 = plainTooltipContentColor;
                    a(composableLambda4, t2Var4, modifier7, shape6, plainTooltipState7, j110, fM4389constructorimpl4, f12, content, composerStartRestartGroup, (i29 & 458752) | i210 | (57344 & i211) | (i211 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier7;
                    plainTooltipState3 = plainTooltipState7;
                    shape2 = shape6;
                    j12 = j110;
                    j13 = j111;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new PlainTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 16) != 0) {
                            plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        }
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new PlainTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 16) != 0) {
                            plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        }
                    }
                    Modifier modifier8 = modifier2;
                    PlainTooltipState plainTooltipState8 = plainTooltipState2;
                    Shape shape7 = plainTooltipContainerShape;
                    long j112 = plainTooltipContainerColor;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-531325137, i12, -1, "androidx.compose.material3.PlainTooltipBox (Tooltip.kt:94)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new l0.t2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.t2 t2Var5 = (l0.t2) objRememberedValue2;
                    float fM4389constructorimpl5 = Dp.m4389constructorimpl(0);
                    float f13 = f12528d;
                    ComposableLambda composableLambda5 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -785135750, true, new a(plainTooltipContentColor, tooltip, i12));
                    int i212 = i12 << 3;
                    int i213 = (i212 & 896) | 14155830 | (i12 & 7168);
                    int i214 = i12 << 6;
                    long j113 = plainTooltipContentColor;
                    a(composableLambda5, t2Var5, modifier8, shape7, plainTooltipState8, j112, fM4389constructorimpl5, f13, content, composerStartRestartGroup, (i212 & 458752) | i213 | (57344 & i214) | (i214 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier8;
                    plainTooltipState3 = plainTooltipState8;
                    shape2 = shape7;
                    j12 = j112;
                    j13 = j113;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(tooltip, modifier3, plainTooltipState3, shape2, j12, j13, content, i10, i11));
            }
            i15 = 1572864;
            i12 |= i15;
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new PlainTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    }
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new PlainTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    }
                }
                Modifier modifier9 = modifier2;
                PlainTooltipState plainTooltipState9 = plainTooltipState2;
                Shape shape8 = plainTooltipContainerShape;
                long j114 = plainTooltipContainerColor;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-531325137, i12, -1, "androidx.compose.material3.PlainTooltipBox (Tooltip.kt:94)");
                }
                iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new l0.t2(iMo413roundToPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                l0.t2 t2Var6 = (l0.t2) objRememberedValue2;
                float fM4389constructorimpl6 = Dp.m4389constructorimpl(0);
                float f14 = f12528d;
                ComposableLambda composableLambda6 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -785135750, true, new a(plainTooltipContentColor, tooltip, i12));
                int i215 = i12 << 3;
                int i216 = (i215 & 896) | 14155830 | (i12 & 7168);
                int i217 = i12 << 6;
                long j115 = plainTooltipContentColor;
                a(composableLambda6, t2Var6, modifier9, shape8, plainTooltipState9, j114, fM4389constructorimpl6, f14, content, composerStartRestartGroup, (i215 & 458752) | i216 | (57344 & i217) | (i217 & 234881024));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier9;
                plainTooltipState3 = plainTooltipState9;
                shape2 = shape8;
                j12 = j114;
                j13 = j115;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new PlainTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    }
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new PlainTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    }
                }
                Modifier modifier10 = modifier2;
                PlainTooltipState plainTooltipState10 = plainTooltipState2;
                Shape shape9 = plainTooltipContainerShape;
                long j116 = plainTooltipContainerColor;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-531325137, i12, -1, "androidx.compose.material3.PlainTooltipBox (Tooltip.kt:94)");
                }
                iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new l0.t2(iMo413roundToPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                l0.t2 t2Var7 = (l0.t2) objRememberedValue2;
                float fM4389constructorimpl7 = Dp.m4389constructorimpl(0);
                float f15 = f12528d;
                ComposableLambda composableLambda7 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -785135750, true, new a(plainTooltipContentColor, tooltip, i12));
                int i218 = i12 << 3;
                int i219 = (i218 & 896) | 14155830 | (i12 & 7168);
                int i2110 = i12 << 6;
                long j117 = plainTooltipContentColor;
                a(composableLambda7, t2Var7, modifier10, shape9, plainTooltipState10, j116, fM4389constructorimpl7, f15, content, composerStartRestartGroup, (i218 & 458752) | i219 | (57344 & i2110) | (i2110 & 234881024));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier10;
                plainTooltipState3 = plainTooltipState10;
                shape2 = shape9;
                j12 = j116;
                j13 = j117;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(tooltip, modifier3, plainTooltipState3, shape2, j12, j13, content, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                plainTooltipState2 = plainTooltipState;
                if (composerStartRestartGroup.changed(plainTooltipState2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 7168) == 0) {
                if ((i11 & 8) == 0) {
                    plainTooltipContainerShape = shape;
                    if (composerStartRestartGroup.changed(plainTooltipContainerShape)) {
                    }
                    i12 |= i17;
                } else {
                    plainTooltipContainerShape = shape;
                }
                i12 |= i17;
            } else {
                plainTooltipContainerShape = shape;
            }
            if ((i10 & 57344) == 0) {
                if ((i11 & 16) == 0) {
                    plainTooltipContainerColor = j10;
                    if (composerStartRestartGroup.changed(plainTooltipContainerColor)) {
                    }
                    i12 |= i18;
                } else {
                    plainTooltipContainerColor = j10;
                }
                i12 |= i18;
            } else {
                plainTooltipContainerColor = j10;
            }
            if ((i10 & 458752) == 0) {
                if ((i11 & 32) == 0) {
                    plainTooltipContentColor = j11;
                    if (composerStartRestartGroup.changed(plainTooltipContentColor)) {
                    }
                    i12 |= i19;
                } else {
                    plainTooltipContentColor = j11;
                }
                i12 |= i19;
            } else {
                plainTooltipContentColor = j11;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                }
                if ((i12 & 2995931) == 599186) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new PlainTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 16) != 0) {
                            plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        }
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new PlainTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 16) != 0) {
                            plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        }
                    }
                    Modifier modifier11 = modifier2;
                    PlainTooltipState plainTooltipState11 = plainTooltipState2;
                    Shape shape10 = plainTooltipContainerShape;
                    long j118 = plainTooltipContainerColor;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-531325137, i12, -1, "androidx.compose.material3.PlainTooltipBox (Tooltip.kt:94)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new l0.t2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.t2 t2Var8 = (l0.t2) objRememberedValue2;
                    float fM4389constructorimpl8 = Dp.m4389constructorimpl(0);
                    float f16 = f12528d;
                    ComposableLambda composableLambda8 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -785135750, true, new a(plainTooltipContentColor, tooltip, i12));
                    int i2111 = i12 << 3;
                    int i2112 = (i2111 & 896) | 14155830 | (i12 & 7168);
                    int i2113 = i12 << 6;
                    long j119 = plainTooltipContentColor;
                    a(composableLambda8, t2Var8, modifier11, shape10, plainTooltipState11, j118, fM4389constructorimpl8, f16, content, composerStartRestartGroup, (i2111 & 458752) | i2112 | (57344 & i2113) | (i2113 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier11;
                    plainTooltipState3 = plainTooltipState11;
                    shape2 = shape10;
                    j12 = j118;
                    j13 = j119;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new PlainTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 16) != 0) {
                            plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        }
                    } else {
                        if (i16 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new PlainTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 16) != 0) {
                            plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                            i12 &= -57345;
                        }
                        if ((i11 & 32) != 0) {
                            plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                            i12 &= -458753;
                        }
                    }
                    Modifier modifier12 = modifier2;
                    PlainTooltipState plainTooltipState12 = plainTooltipState2;
                    Shape shape11 = plainTooltipContainerShape;
                    long j1110 = plainTooltipContainerColor;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-531325137, i12, -1, "androidx.compose.material3.PlainTooltipBox (Tooltip.kt:94)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new l0.t2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.t2 t2Var9 = (l0.t2) objRememberedValue2;
                    float fM4389constructorimpl9 = Dp.m4389constructorimpl(0);
                    float f17 = f12528d;
                    ComposableLambda composableLambda9 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -785135750, true, new a(plainTooltipContentColor, tooltip, i12));
                    int i2114 = i12 << 3;
                    int i2115 = (i2114 & 896) | 14155830 | (i12 & 7168);
                    int i2116 = i12 << 6;
                    long j1111 = plainTooltipContentColor;
                    a(composableLambda9, t2Var9, modifier12, shape11, plainTooltipState12, j1110, fM4389constructorimpl9, f17, content, composerStartRestartGroup, (i2114 & 458752) | i2115 | (57344 & i2116) | (i2116 & 234881024));
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier12;
                    plainTooltipState3 = plainTooltipState12;
                    shape2 = shape11;
                    j12 = j1110;
                    j13 = j1111;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(tooltip, modifier3, plainTooltipState3, shape2, j12, j13, content, i10, i11));
            }
            i15 = 1572864;
            i12 |= i15;
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new PlainTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    }
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new PlainTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    }
                }
                Modifier modifier13 = modifier2;
                PlainTooltipState plainTooltipState13 = plainTooltipState2;
                Shape shape12 = plainTooltipContainerShape;
                long j1112 = plainTooltipContainerColor;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-531325137, i12, -1, "androidx.compose.material3.PlainTooltipBox (Tooltip.kt:94)");
                }
                iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new l0.t2(iMo413roundToPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                l0.t2 t2Var10 = (l0.t2) objRememberedValue2;
                float fM4389constructorimpl10 = Dp.m4389constructorimpl(0);
                float f18 = f12528d;
                ComposableLambda composableLambda10 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -785135750, true, new a(plainTooltipContentColor, tooltip, i12));
                int i2117 = i12 << 3;
                int i2118 = (i2117 & 896) | 14155830 | (i12 & 7168);
                int i2119 = i12 << 6;
                long j1113 = plainTooltipContentColor;
                a(composableLambda10, t2Var10, modifier13, shape12, plainTooltipState13, j1112, fM4389constructorimpl10, f18, content, composerStartRestartGroup, (i2117 & 458752) | i2118 | (57344 & i2119) | (i2119 & 234881024));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier13;
                plainTooltipState3 = plainTooltipState13;
                shape2 = shape12;
                j12 = j1112;
                j13 = j1113;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new PlainTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    }
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new PlainTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    }
                }
                Modifier modifier14 = modifier2;
                PlainTooltipState plainTooltipState14 = plainTooltipState2;
                Shape shape13 = plainTooltipContainerShape;
                long j1114 = plainTooltipContainerColor;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-531325137, i12, -1, "androidx.compose.material3.PlainTooltipBox (Tooltip.kt:94)");
                }
                iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new l0.t2(iMo413roundToPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                l0.t2 t2Var11 = (l0.t2) objRememberedValue2;
                float fM4389constructorimpl11 = Dp.m4389constructorimpl(0);
                float f19 = f12528d;
                ComposableLambda composableLambda11 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -785135750, true, new a(plainTooltipContentColor, tooltip, i12));
                int i21110 = i12 << 3;
                int i21111 = (i21110 & 896) | 14155830 | (i12 & 7168);
                int i21112 = i12 << 6;
                long j1115 = plainTooltipContentColor;
                a(composableLambda11, t2Var11, modifier14, shape13, plainTooltipState14, j1114, fM4389constructorimpl11, f19, content, composerStartRestartGroup, (i21110 & 458752) | i21111 | (57344 & i21112) | (i21112 & 234881024));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier14;
                plainTooltipState3 = plainTooltipState14;
                shape2 = shape13;
                j12 = j1114;
                j13 = j1115;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(tooltip, modifier3, plainTooltipState3, shape2, j12, j13, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        plainTooltipState2 = plainTooltipState;
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                plainTooltipContainerShape = shape;
                if (composerStartRestartGroup.changed(plainTooltipContainerShape)) {
                }
                i12 |= i17;
            } else {
                plainTooltipContainerShape = shape;
            }
            i12 |= i17;
        } else {
            plainTooltipContainerShape = shape;
        }
        if ((i10 & 57344) == 0) {
            if ((i11 & 16) == 0) {
                plainTooltipContainerColor = j10;
                if (composerStartRestartGroup.changed(plainTooltipContainerColor)) {
                }
                i12 |= i18;
            } else {
                plainTooltipContainerColor = j10;
            }
            i12 |= i18;
        } else {
            plainTooltipContainerColor = j10;
        }
        if ((i10 & 458752) == 0) {
            if ((i11 & 32) == 0) {
                plainTooltipContentColor = j11;
                if (composerStartRestartGroup.changed(plainTooltipContentColor)) {
                }
                i12 |= i19;
            } else {
                plainTooltipContentColor = j11;
            }
            i12 |= i19;
        } else {
            plainTooltipContentColor = j11;
        }
        if ((i11 & 64) != 0) {
            if ((i10 & 3670016) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
            }
            if ((i12 & 2995931) == 599186) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new PlainTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    }
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new PlainTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    }
                }
                Modifier modifier15 = modifier2;
                PlainTooltipState plainTooltipState15 = plainTooltipState2;
                Shape shape14 = plainTooltipContainerShape;
                long j1116 = plainTooltipContainerColor;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-531325137, i12, -1, "androidx.compose.material3.PlainTooltipBox (Tooltip.kt:94)");
                }
                iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new l0.t2(iMo413roundToPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                l0.t2 t2Var12 = (l0.t2) objRememberedValue2;
                float fM4389constructorimpl12 = Dp.m4389constructorimpl(0);
                float f110 = f12528d;
                ComposableLambda composableLambda12 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -785135750, true, new a(plainTooltipContentColor, tooltip, i12));
                int i21113 = i12 << 3;
                int i21114 = (i21113 & 896) | 14155830 | (i12 & 7168);
                int i21115 = i12 << 6;
                long j1117 = plainTooltipContentColor;
                a(composableLambda12, t2Var12, modifier15, shape14, plainTooltipState15, j1116, fM4389constructorimpl12, f110, content, composerStartRestartGroup, (i21113 & 458752) | i21114 | (57344 & i21115) | (i21115 & 234881024));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier15;
                plainTooltipState3 = plainTooltipState15;
                shape2 = shape14;
                j12 = j1116;
                j13 = j1117;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new PlainTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    }
                } else {
                    if (i16 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new PlainTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 16) != 0) {
                        plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                        i12 &= -57345;
                    }
                    if ((i11 & 32) != 0) {
                        plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                        i12 &= -458753;
                    }
                }
                Modifier modifier16 = modifier2;
                PlainTooltipState plainTooltipState16 = plainTooltipState2;
                Shape shape15 = plainTooltipContainerShape;
                long j1118 = plainTooltipContainerColor;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-531325137, i12, -1, "androidx.compose.material3.PlainTooltipBox (Tooltip.kt:94)");
                }
                iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new l0.t2(iMo413roundToPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                l0.t2 t2Var13 = (l0.t2) objRememberedValue2;
                float fM4389constructorimpl13 = Dp.m4389constructorimpl(0);
                float f111 = f12528d;
                ComposableLambda composableLambda13 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -785135750, true, new a(plainTooltipContentColor, tooltip, i12));
                int i21116 = i12 << 3;
                int i21117 = (i21116 & 896) | 14155830 | (i12 & 7168);
                int i21118 = i12 << 6;
                long j1119 = plainTooltipContentColor;
                a(composableLambda13, t2Var13, modifier16, shape15, plainTooltipState16, j1118, fM4389constructorimpl13, f111, content, composerStartRestartGroup, (i21116 & 458752) | i21117 | (57344 & i21118) | (i21118 & 234881024));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier16;
                plainTooltipState3 = plainTooltipState16;
                shape2 = shape15;
                j12 = j1118;
                j13 = j1119;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(tooltip, modifier3, plainTooltipState3, shape2, j12, j13, content, i10, i11));
        }
        i15 = 1572864;
        i12 |= i15;
        if ((i12 & 2995931) == 599186) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new PlainTooltipState();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                }
                if ((i11 & 16) != 0) {
                    plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                    i12 &= -458753;
                }
            } else {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new PlainTooltipState();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                }
                if ((i11 & 16) != 0) {
                    plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                    i12 &= -458753;
                }
            }
            Modifier modifier17 = modifier2;
            PlainTooltipState plainTooltipState17 = plainTooltipState2;
            Shape shape16 = plainTooltipContainerShape;
            long j11110 = plainTooltipContainerColor;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-531325137, i12, -1, "androidx.compose.material3.PlainTooltipBox (Tooltip.kt:94)");
            }
            iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new l0.t2(iMo413roundToPx0680j_4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            l0.t2 t2Var14 = (l0.t2) objRememberedValue2;
            float fM4389constructorimpl14 = Dp.m4389constructorimpl(0);
            float f112 = f12528d;
            ComposableLambda composableLambda14 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -785135750, true, new a(plainTooltipContentColor, tooltip, i12));
            int i21119 = i12 << 3;
            int i211110 = (i21119 & 896) | 14155830 | (i12 & 7168);
            int i211111 = i12 << 6;
            long j11111 = plainTooltipContentColor;
            a(composableLambda14, t2Var14, modifier17, shape16, plainTooltipState17, j11110, fM4389constructorimpl14, f112, content, composerStartRestartGroup, (i21119 & 458752) | i211110 | (57344 & i211111) | (i211111 & 234881024));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier17;
            plainTooltipState3 = plainTooltipState17;
            shape2 = shape16;
            j12 = j11110;
            j13 = j11111;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new PlainTooltipState();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                }
                if ((i11 & 16) != 0) {
                    plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                    i12 &= -458753;
                }
            } else {
                if (i16 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new PlainTooltipState();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    plainTooltipState2 = (PlainTooltipState) objRememberedValue;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    plainTooltipContainerShape = TooltipDefaults.INSTANCE.getPlainTooltipContainerShape(composerStartRestartGroup, 6);
                }
                if ((i11 & 16) != 0) {
                    plainTooltipContainerColor = TooltipDefaults.INSTANCE.getPlainTooltipContainerColor(composerStartRestartGroup, 6);
                    i12 &= -57345;
                }
                if ((i11 & 32) != 0) {
                    plainTooltipContentColor = TooltipDefaults.INSTANCE.getPlainTooltipContentColor(composerStartRestartGroup, 6);
                    i12 &= -458753;
                }
            }
            Modifier modifier18 = modifier2;
            PlainTooltipState plainTooltipState18 = plainTooltipState2;
            Shape shape17 = plainTooltipContainerShape;
            long j11112 = plainTooltipContainerColor;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-531325137, i12, -1, "androidx.compose.material3.PlainTooltipBox (Tooltip.kt:94)");
            }
            iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new l0.t2(iMo413roundToPx0680j_4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            l0.t2 t2Var15 = (l0.t2) objRememberedValue2;
            float fM4389constructorimpl15 = Dp.m4389constructorimpl(0);
            float f113 = f12528d;
            ComposableLambda composableLambda15 = ComposableLambdaKt.composableLambda(composerStartRestartGroup, -785135750, true, new a(plainTooltipContentColor, tooltip, i12));
            int i211112 = i12 << 3;
            int i211113 = (i211112 & 896) | 14155830 | (i12 & 7168);
            int i211114 = i12 << 6;
            long j11113 = plainTooltipContentColor;
            a(composableLambda15, t2Var15, modifier18, shape17, plainTooltipState18, j11112, fM4389constructorimpl15, f113, content, composerStartRestartGroup, (i211112 & 458752) | i211113 | (57344 & i211114) | (i211114 & 234881024));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier18;
            plainTooltipState3 = plainTooltipState18;
            shape2 = shape17;
            j12 = j11112;
            j13 = j11113;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(tooltip, modifier3, plainTooltipState3, shape2, j12, j13, content, i10, i11));
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0136 A[PHI: r3 r5 r7 r9 r11 r12
      0x0136: PHI (r3v30 int) = (r3v21 int), (r3v31 int), (r3v32 int) binds: [B:122:0x017d, B:102:0x0132, B:103:0x0134] A[DONT_GENERATE, DONT_INLINE]
      0x0136: PHI (r5v18 androidx.compose.ui.Modifier) = (r5v3 androidx.compose.ui.Modifier), (r5v2 androidx.compose.ui.Modifier), (r5v2 androidx.compose.ui.Modifier) binds: [B:122:0x017d, B:102:0x0132, B:103:0x0134] A[DONT_GENERATE, DONT_INLINE]
      0x0136: PHI (r7v12 androidx.compose.material3.RichTooltipState) = 
      (r7v3 androidx.compose.material3.RichTooltipState)
      (r7v2 androidx.compose.material3.RichTooltipState)
      (r7v2 androidx.compose.material3.RichTooltipState)
     binds: [B:122:0x017d, B:102:0x0132, B:103:0x0134] A[DONT_GENERATE, DONT_INLINE]
      0x0136: PHI (r9v7 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) = 
      (r9v3 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
      (r9v2 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
      (r9v2 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
     binds: [B:122:0x017d, B:102:0x0132, B:103:0x0134] A[DONT_GENERATE, DONT_INLINE]
      0x0136: PHI (r11v8 androidx.compose.ui.graphics.Shape) = 
      (r11v3 androidx.compose.ui.graphics.Shape)
      (r11v2 androidx.compose.ui.graphics.Shape)
      (r11v2 androidx.compose.ui.graphics.Shape)
     binds: [B:122:0x017d, B:102:0x0132, B:103:0x0134] A[DONT_GENERATE, DONT_INLINE]
      0x0136: PHI (r12v8 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>) = 
      (r12v3 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
      (r12v2 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
      (r12v2 kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit>)
     binds: [B:122:0x017d, B:102:0x0132, B:103:0x0134] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:106:0x0140 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x0142  */
    /* JADX WARN: Code duplicated, block: B:109:0x0147  */
    /* JADX WARN: Code duplicated, block: B:111:0x0159  */
    /* JADX WARN: Code duplicated, block: B:115:0x016a  */
    /* JADX WARN: Code duplicated, block: B:117:0x016d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0172  */
    /* JADX WARN: Code duplicated, block: B:123:0x017f  */
    /* JADX WARN: Code duplicated, block: B:126:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:129:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:132:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:134:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:137:0x025c  */
    /* JADX WARN: Code duplicated, block: B:142:0x0271  */
    /* JADX WARN: Code duplicated, block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0094  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:79:0x00df  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x0112  */
    /* JADX WARN: Code duplicated, block: B:95:0x0120  */
    @Composable
    @ExperimentalMaterial3Api
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void RichTooltipBox(@NotNull Function2<? super Composer, ? super Integer, Unit> text, @Nullable Modifier modifier, @Nullable RichTooltipState richTooltipState, @Nullable Function2<? super Composer, ? super Integer, Unit> function2, @Nullable Function2<? super Composer, ? super Integer, Unit> function3, @Nullable Shape shape, @Nullable RichTooltipColors richTooltipColors, @NotNull Function3<? super TooltipBoxScope, ? super Composer, ? super Integer, Unit> content, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        int i13;
        RichTooltipState richTooltipState2;
        int i14;
        int i15;
        Function2<? super Composer, ? super Integer, Unit> function4;
        int i16;
        int i17;
        Function2<? super Composer, ? super Integer, Unit> function5;
        int i18;
        Shape richTooltipContainerShape;
        int i19;
        RichTooltipColors richTooltipColorsM1488richTooltipColorsro_MJ88;
        Object objRememberedValue;
        Function2<? super Composer, ? super Integer, Unit> function6;
        RichTooltipState richTooltipState3;
        int iMo413roundToPx0680j_4;
        Object objRememberedValue2;
        Composer.Companion companion;
        boolean zChanged;
        Object objRememberedValue3;
        Modifier modifier3;
        Function2<? super Composer, ? super Integer, Unit> function7;
        Shape shape2;
        RichTooltipColors richTooltipColors2;
        Function2<? super Composer, ? super Integer, Unit> function8;
        RichTooltipState richTooltipState4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i20;
        int i21;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(180959998);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changedInstance(text) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i22 = i11 & 2;
        if (i22 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & 896) == 0) {
                    richTooltipState2 = richTooltipState;
                    if (composerStartRestartGroup.changed(richTooltipState2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 7168) == 0) {
                        function4 = function2;
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
                            function5 = function3;
                            if (composerStartRestartGroup.changedInstance(function5)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((i10 & 458752) == 0) {
                            richTooltipContainerShape = shape;
                            if ((i11 & 32) == 0 || !composerStartRestartGroup.changed(richTooltipContainerShape)) {
                                i21 = 65536;
                            } else {
                                i21 = 131072;
                            }
                            i12 |= i21;
                        } else {
                            richTooltipContainerShape = shape;
                        }
                        if ((i10 & 3670016) != 0) {
                            if ((i11 & 64) == 0 || !composerStartRestartGroup.changed(richTooltipColors)) {
                                i20 = 524288;
                            } else {
                                i20 = 1048576;
                            }
                            i12 |= i20;
                        }
                        if ((i11 & 128) != 0) {
                            if ((29360128 & i10) == 0) {
                                if (composerStartRestartGroup.changedInstance(content)) {
                                    i19 = 8388608;
                                } else {
                                    i19 = 4194304;
                                }
                            }
                            if ((23967451 & i12) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    if (i22 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if (i13 != 0) {
                                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new RichTooltipState();
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                        }
                                        composerStartRestartGroup.endReplaceableGroup();
                                        richTooltipState2 = (RichTooltipState) objRememberedValue;
                                    }
                                    if (i15 != 0) {
                                        function4 = null;
                                    }
                                    if (i17 != 0) {
                                        function5 = null;
                                    }
                                    if ((i11 & 32) != 0) {
                                        i12 &= -458753;
                                        richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                                    }
                                    if ((i11 & 64) != 0) {
                                        i12 &= -3670017;
                                        richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                    }
                                    Modifier modifier4 = modifier2;
                                    Function2<? super Composer, ? super Integer, Unit> function9 = function4;
                                    Shape shape3 = richTooltipContainerShape;
                                    function6 = function5;
                                    richTooltipState3 = richTooltipState2;
                                    composerStartRestartGroup.endDefaults();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                                    }
                                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                    companion = Composer.INSTANCE;
                                    if (objRememberedValue2 == companion.getEmpty()) {
                                        objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    l0.x2 x2Var = (l0.x2) objRememberedValue2;
                                    int i23 = i12 >> 6;
                                    composerStartRestartGroup.startReplaceableGroup(511388516);
                                    zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                    if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                                        objRememberedValue3 = new c(richTooltipState3, function6);
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                                    int i24 = i12 << 3;
                                    a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function9, function6, i12)), x2Var, modifier4, shape3, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i24 & 234881024) | ((i12 << 6) & 57344) | (i23 & 7168) | (i24 & 896) | 14155830);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    modifier3 = modifier4;
                                    function7 = function9;
                                    shape2 = shape3;
                                    richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                                    function8 = function6;
                                    richTooltipState4 = richTooltipState3;
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i11 & 32) != 0) {
                                        i12 &= -458753;
                                    }
                                    if ((i11 & 64) != 0) {
                                        i12 &= -3670017;
                                    }
                                }
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                                Modifier modifier5 = modifier2;
                                Function2<? super Composer, ? super Integer, Unit> function10 = function4;
                                Shape shape4 = richTooltipContainerShape;
                                function6 = function5;
                                richTooltipState3 = richTooltipState2;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                                }
                                iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                l0.x2 x2Var2 = (l0.x2) objRememberedValue2;
                                int i25 = i12 >> 6;
                                composerStartRestartGroup.startReplaceableGroup(511388516);
                                zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    objRememberedValue3 = new c(richTooltipState3, function6);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                } else {
                                    objRememberedValue3 = new c(richTooltipState3, function6);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                                int i26 = i12 << 3;
                                a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function10, function6, i12)), x2Var2, modifier5, shape4, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i26 & 234881024) | ((i12 << 6) & 57344) | (i25 & 7168) | (i26 & 896) | 14155830);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier3 = modifier5;
                                function7 = function10;
                                shape2 = shape4;
                                richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                                function8 = function6;
                                richTooltipState4 = richTooltipState3;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier3 = modifier2;
                                richTooltipState4 = richTooltipState2;
                                function7 = function4;
                                shape2 = richTooltipContainerShape;
                                function8 = function5;
                                richTooltipColors2 = richTooltipColors;
                            }
                            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                return;
                            }
                            scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
                        }
                        i19 = 12582912;
                        i12 |= i19;
                        if ((23967451 & i12) == 4793490) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RichTooltipState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                                }
                            } else {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RichTooltipState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                                }
                            }
                            Modifier modifier6 = modifier2;
                            Function2<? super Composer, ? super Integer, Unit> function11 = function4;
                            Shape shape5 = richTooltipContainerShape;
                            function6 = function5;
                            richTooltipState3 = richTooltipState2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                            }
                            iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            l0.x2 x2Var3 = (l0.x2) objRememberedValue2;
                            int i27 = i12 >> 6;
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue3 = new c(richTooltipState3, function6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new c(richTooltipState3, function6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                            int i28 = i12 << 3;
                            a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function11, function6, i12)), x2Var3, modifier6, shape5, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i28 & 234881024) | ((i12 << 6) & 57344) | (i27 & 7168) | (i28 & 896) | 14155830);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier6;
                            function7 = function11;
                            shape2 = shape5;
                            richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                            function8 = function6;
                            richTooltipState4 = richTooltipState3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RichTooltipState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                                }
                            } else {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RichTooltipState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                                }
                            }
                            Modifier modifier7 = modifier2;
                            Function2<? super Composer, ? super Integer, Unit> function12 = function4;
                            Shape shape6 = richTooltipContainerShape;
                            function6 = function5;
                            richTooltipState3 = richTooltipState2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                            }
                            iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            l0.x2 x2Var4 = (l0.x2) objRememberedValue2;
                            int i29 = i12 >> 6;
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue3 = new c(richTooltipState3, function6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new c(richTooltipState3, function6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                            int i210 = i12 << 3;
                            a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function12, function6, i12)), x2Var4, modifier7, shape6, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i210 & 234881024) | ((i12 << 6) & 57344) | (i29 & 7168) | (i210 & 896) | 14155830);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier7;
                            function7 = function12;
                            shape2 = shape6;
                            richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                            function8 = function6;
                            richTooltipState4 = richTooltipState3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
                    }
                    i12 |= 24576;
                    function5 = function3;
                    if ((i10 & 458752) == 0) {
                        richTooltipContainerShape = shape;
                        if ((i11 & 32) == 0) {
                            i21 = 65536;
                        } else {
                            i21 = 65536;
                        }
                        i12 |= i21;
                    } else {
                        richTooltipContainerShape = shape;
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i20 = 524288;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 128) != 0) {
                        if ((29360128 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                        }
                        if ((23967451 & i12) == 4793490) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RichTooltipState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                                }
                            } else {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RichTooltipState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                                }
                            }
                            Modifier modifier8 = modifier2;
                            Function2<? super Composer, ? super Integer, Unit> function13 = function4;
                            Shape shape7 = richTooltipContainerShape;
                            function6 = function5;
                            richTooltipState3 = richTooltipState2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                            }
                            iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            l0.x2 x2Var5 = (l0.x2) objRememberedValue2;
                            int i211 = i12 >> 6;
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue3 = new c(richTooltipState3, function6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new c(richTooltipState3, function6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                            int i212 = i12 << 3;
                            a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function13, function6, i12)), x2Var5, modifier8, shape7, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i212 & 234881024) | ((i12 << 6) & 57344) | (i211 & 7168) | (i212 & 896) | 14155830);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier8;
                            function7 = function13;
                            shape2 = shape7;
                            richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                            function8 = function6;
                            richTooltipState4 = richTooltipState3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RichTooltipState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                                }
                            } else {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RichTooltipState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                                }
                            }
                            Modifier modifier9 = modifier2;
                            Function2<? super Composer, ? super Integer, Unit> function14 = function4;
                            Shape shape8 = richTooltipContainerShape;
                            function6 = function5;
                            richTooltipState3 = richTooltipState2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                            }
                            iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            l0.x2 x2Var6 = (l0.x2) objRememberedValue2;
                            int i213 = i12 >> 6;
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue3 = new c(richTooltipState3, function6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new c(richTooltipState3, function6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                            int i214 = i12 << 3;
                            a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function14, function6, i12)), x2Var6, modifier9, shape8, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i214 & 234881024) | ((i12 << 6) & 57344) | (i213 & 7168) | (i214 & 896) | 14155830);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier9;
                            function7 = function14;
                            shape2 = shape8;
                            richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                            function8 = function6;
                            richTooltipState4 = richTooltipState3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
                    }
                    i19 = 12582912;
                    i12 |= i19;
                    if ((23967451 & i12) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        }
                        Modifier modifier10 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function15 = function4;
                        Shape shape9 = richTooltipContainerShape;
                        function6 = function5;
                        richTooltipState3 = richTooltipState2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                        }
                        iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        l0.x2 x2Var7 = (l0.x2) objRememberedValue2;
                        int i215 = i12 >> 6;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        int i216 = i12 << 3;
                        a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function15, function6, i12)), x2Var7, modifier10, shape9, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i216 & 234881024) | ((i12 << 6) & 57344) | (i215 & 7168) | (i216 & 896) | 14155830);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier10;
                        function7 = function15;
                        shape2 = shape9;
                        richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                        function8 = function6;
                        richTooltipState4 = richTooltipState3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        }
                        Modifier modifier11 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function16 = function4;
                        Shape shape10 = richTooltipContainerShape;
                        function6 = function5;
                        richTooltipState3 = richTooltipState2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                        }
                        iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        l0.x2 x2Var8 = (l0.x2) objRememberedValue2;
                        int i217 = i12 >> 6;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        int i218 = i12 << 3;
                        a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function16, function6, i12)), x2Var8, modifier11, shape10, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i218 & 234881024) | ((i12 << 6) & 57344) | (i217 & 7168) | (i218 & 896) | 14155830);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11;
                        function7 = function16;
                        shape2 = shape10;
                        richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                        function8 = function6;
                        richTooltipState4 = richTooltipState3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
                }
                i12 |= 3072;
                function4 = function2;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        function5 = function3;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 458752) == 0) {
                        richTooltipContainerShape = shape;
                        if ((i11 & 32) == 0) {
                            i21 = 65536;
                        } else {
                            i21 = 65536;
                        }
                        i12 |= i21;
                    } else {
                        richTooltipContainerShape = shape;
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i20 = 524288;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 128) != 0) {
                        if ((29360128 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                        }
                        if ((23967451 & i12) == 4793490) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RichTooltipState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                                }
                            } else {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RichTooltipState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                                }
                            }
                            Modifier modifier12 = modifier2;
                            Function2<? super Composer, ? super Integer, Unit> function17 = function4;
                            Shape shape11 = richTooltipContainerShape;
                            function6 = function5;
                            richTooltipState3 = richTooltipState2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                            }
                            iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            l0.x2 x2Var9 = (l0.x2) objRememberedValue2;
                            int i219 = i12 >> 6;
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue3 = new c(richTooltipState3, function6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new c(richTooltipState3, function6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                            int i2110 = i12 << 3;
                            a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function17, function6, i12)), x2Var9, modifier12, shape11, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i2110 & 234881024) | ((i12 << 6) & 57344) | (i219 & 7168) | (i2110 & 896) | 14155830);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier12;
                            function7 = function17;
                            shape2 = shape11;
                            richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                            function8 = function6;
                            richTooltipState4 = richTooltipState3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RichTooltipState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                                }
                            } else {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RichTooltipState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                                }
                            }
                            Modifier modifier13 = modifier2;
                            Function2<? super Composer, ? super Integer, Unit> function18 = function4;
                            Shape shape12 = richTooltipContainerShape;
                            function6 = function5;
                            richTooltipState3 = richTooltipState2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                            }
                            iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            l0.x2 x2Var10 = (l0.x2) objRememberedValue2;
                            int i2111 = i12 >> 6;
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue3 = new c(richTooltipState3, function6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new c(richTooltipState3, function6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                            int i2112 = i12 << 3;
                            a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function18, function6, i12)), x2Var10, modifier13, shape12, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i2112 & 234881024) | ((i12 << 6) & 57344) | (i2111 & 7168) | (i2112 & 896) | 14155830);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier13;
                            function7 = function18;
                            shape2 = shape12;
                            richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                            function8 = function6;
                            richTooltipState4 = richTooltipState3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
                    }
                    i19 = 12582912;
                    i12 |= i19;
                    if ((23967451 & i12) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        }
                        Modifier modifier14 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function19 = function4;
                        Shape shape13 = richTooltipContainerShape;
                        function6 = function5;
                        richTooltipState3 = richTooltipState2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                        }
                        iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        l0.x2 x2Var11 = (l0.x2) objRememberedValue2;
                        int i2113 = i12 >> 6;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        int i2114 = i12 << 3;
                        a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function19, function6, i12)), x2Var11, modifier14, shape13, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i2114 & 234881024) | ((i12 << 6) & 57344) | (i2113 & 7168) | (i2114 & 896) | 14155830);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier14;
                        function7 = function19;
                        shape2 = shape13;
                        richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                        function8 = function6;
                        richTooltipState4 = richTooltipState3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        }
                        Modifier modifier15 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function110 = function4;
                        Shape shape14 = richTooltipContainerShape;
                        function6 = function5;
                        richTooltipState3 = richTooltipState2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                        }
                        iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        l0.x2 x2Var12 = (l0.x2) objRememberedValue2;
                        int i2115 = i12 >> 6;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        int i2116 = i12 << 3;
                        a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function110, function6, i12)), x2Var12, modifier15, shape14, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i2116 & 234881024) | ((i12 << 6) & 57344) | (i2115 & 7168) | (i2116 & 896) | 14155830);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier15;
                        function7 = function110;
                        shape2 = shape14;
                        richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                        function8 = function6;
                        richTooltipState4 = richTooltipState3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
                }
                i12 |= 24576;
                function5 = function3;
                if ((i10 & 458752) == 0) {
                    richTooltipContainerShape = shape;
                    if ((i11 & 32) == 0) {
                        i21 = 65536;
                    } else {
                        i21 = 65536;
                    }
                    i12 |= i21;
                } else {
                    richTooltipContainerShape = shape;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i11 & 128) != 0) {
                    if ((29360128 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                    }
                    if ((23967451 & i12) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        }
                        Modifier modifier16 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function111 = function4;
                        Shape shape15 = richTooltipContainerShape;
                        function6 = function5;
                        richTooltipState3 = richTooltipState2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                        }
                        iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        l0.x2 x2Var13 = (l0.x2) objRememberedValue2;
                        int i2117 = i12 >> 6;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        int i2118 = i12 << 3;
                        a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function111, function6, i12)), x2Var13, modifier16, shape15, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i2118 & 234881024) | ((i12 << 6) & 57344) | (i2117 & 7168) | (i2118 & 896) | 14155830);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier16;
                        function7 = function111;
                        shape2 = shape15;
                        richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                        function8 = function6;
                        richTooltipState4 = richTooltipState3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        }
                        Modifier modifier17 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function112 = function4;
                        Shape shape16 = richTooltipContainerShape;
                        function6 = function5;
                        richTooltipState3 = richTooltipState2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                        }
                        iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        l0.x2 x2Var14 = (l0.x2) objRememberedValue2;
                        int i2119 = i12 >> 6;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        int i21110 = i12 << 3;
                        a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function112, function6, i12)), x2Var14, modifier17, shape16, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i21110 & 234881024) | ((i12 << 6) & 57344) | (i2119 & 7168) | (i21110 & 896) | 14155830);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier17;
                        function7 = function112;
                        shape2 = shape16;
                        richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                        function8 = function6;
                        richTooltipState4 = richTooltipState3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
                }
                i19 = 12582912;
                i12 |= i19;
                if ((23967451 & i12) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    }
                    Modifier modifier18 = modifier2;
                    Function2<? super Composer, ? super Integer, Unit> function113 = function4;
                    Shape shape17 = richTooltipContainerShape;
                    function6 = function5;
                    richTooltipState3 = richTooltipState2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.x2 x2Var15 = (l0.x2) objRememberedValue2;
                    int i21111 = i12 >> 6;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    int i21112 = i12 << 3;
                    a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function113, function6, i12)), x2Var15, modifier18, shape17, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i21112 & 234881024) | ((i12 << 6) & 57344) | (i21111 & 7168) | (i21112 & 896) | 14155830);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier18;
                    function7 = function113;
                    shape2 = shape17;
                    richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                    function8 = function6;
                    richTooltipState4 = richTooltipState3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    }
                    Modifier modifier19 = modifier2;
                    Function2<? super Composer, ? super Integer, Unit> function114 = function4;
                    Shape shape18 = richTooltipContainerShape;
                    function6 = function5;
                    richTooltipState3 = richTooltipState2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.x2 x2Var16 = (l0.x2) objRememberedValue2;
                    int i21113 = i12 >> 6;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    int i21114 = i12 << 3;
                    a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function114, function6, i12)), x2Var16, modifier19, shape18, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i21114 & 234881024) | ((i12 << 6) & 57344) | (i21113 & 7168) | (i21114 & 896) | 14155830);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier19;
                    function7 = function114;
                    shape2 = shape18;
                    richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                    function8 = function6;
                    richTooltipState4 = richTooltipState3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
            }
            i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
            richTooltipState2 = richTooltipState;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    function4 = function2;
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
                        function5 = function3;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 458752) == 0) {
                        richTooltipContainerShape = shape;
                        if ((i11 & 32) == 0) {
                            i21 = 65536;
                        } else {
                            i21 = 65536;
                        }
                        i12 |= i21;
                    } else {
                        richTooltipContainerShape = shape;
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i20 = 524288;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 128) != 0) {
                        if ((29360128 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                        }
                        if ((23967451 & i12) == 4793490) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RichTooltipState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                                }
                            } else {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RichTooltipState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                                }
                            }
                            Modifier modifier110 = modifier2;
                            Function2<? super Composer, ? super Integer, Unit> function115 = function4;
                            Shape shape19 = richTooltipContainerShape;
                            function6 = function5;
                            richTooltipState3 = richTooltipState2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                            }
                            iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            l0.x2 x2Var17 = (l0.x2) objRememberedValue2;
                            int i21115 = i12 >> 6;
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue3 = new c(richTooltipState3, function6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new c(richTooltipState3, function6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                            int i21116 = i12 << 3;
                            a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function115, function6, i12)), x2Var17, modifier110, shape19, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i21116 & 234881024) | ((i12 << 6) & 57344) | (i21115 & 7168) | (i21116 & 896) | 14155830);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier110;
                            function7 = function115;
                            shape2 = shape19;
                            richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                            function8 = function6;
                            richTooltipState4 = richTooltipState3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RichTooltipState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                                }
                            } else {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RichTooltipState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                                }
                            }
                            Modifier modifier111 = modifier2;
                            Function2<? super Composer, ? super Integer, Unit> function116 = function4;
                            Shape shape110 = richTooltipContainerShape;
                            function6 = function5;
                            richTooltipState3 = richTooltipState2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                            }
                            iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            l0.x2 x2Var18 = (l0.x2) objRememberedValue2;
                            int i21117 = i12 >> 6;
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue3 = new c(richTooltipState3, function6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new c(richTooltipState3, function6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                            int i21118 = i12 << 3;
                            a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function116, function6, i12)), x2Var18, modifier111, shape110, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i21118 & 234881024) | ((i12 << 6) & 57344) | (i21117 & 7168) | (i21118 & 896) | 14155830);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier111;
                            function7 = function116;
                            shape2 = shape110;
                            richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                            function8 = function6;
                            richTooltipState4 = richTooltipState3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
                    }
                    i19 = 12582912;
                    i12 |= i19;
                    if ((23967451 & i12) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        }
                        Modifier modifier112 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function117 = function4;
                        Shape shape111 = richTooltipContainerShape;
                        function6 = function5;
                        richTooltipState3 = richTooltipState2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                        }
                        iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        l0.x2 x2Var19 = (l0.x2) objRememberedValue2;
                        int i21119 = i12 >> 6;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        int i211110 = i12 << 3;
                        a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function117, function6, i12)), x2Var19, modifier112, shape111, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i211110 & 234881024) | ((i12 << 6) & 57344) | (i21119 & 7168) | (i211110 & 896) | 14155830);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier112;
                        function7 = function117;
                        shape2 = shape111;
                        richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                        function8 = function6;
                        richTooltipState4 = richTooltipState3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        }
                        Modifier modifier113 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function118 = function4;
                        Shape shape112 = richTooltipContainerShape;
                        function6 = function5;
                        richTooltipState3 = richTooltipState2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                        }
                        iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        l0.x2 x2Var110 = (l0.x2) objRememberedValue2;
                        int i211111 = i12 >> 6;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        int i211112 = i12 << 3;
                        a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function118, function6, i12)), x2Var110, modifier113, shape112, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i211112 & 234881024) | ((i12 << 6) & 57344) | (i211111 & 7168) | (i211112 & 896) | 14155830);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier113;
                        function7 = function118;
                        shape2 = shape112;
                        richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                        function8 = function6;
                        richTooltipState4 = richTooltipState3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
                }
                i12 |= 24576;
                function5 = function3;
                if ((i10 & 458752) == 0) {
                    richTooltipContainerShape = shape;
                    if ((i11 & 32) == 0) {
                        i21 = 65536;
                    } else {
                        i21 = 65536;
                    }
                    i12 |= i21;
                } else {
                    richTooltipContainerShape = shape;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i11 & 128) != 0) {
                    if ((29360128 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                    }
                    if ((23967451 & i12) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        }
                        Modifier modifier114 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function119 = function4;
                        Shape shape113 = richTooltipContainerShape;
                        function6 = function5;
                        richTooltipState3 = richTooltipState2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                        }
                        iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        l0.x2 x2Var111 = (l0.x2) objRememberedValue2;
                        int i211113 = i12 >> 6;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        int i211114 = i12 << 3;
                        a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function119, function6, i12)), x2Var111, modifier114, shape113, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i211114 & 234881024) | ((i12 << 6) & 57344) | (i211113 & 7168) | (i211114 & 896) | 14155830);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier114;
                        function7 = function119;
                        shape2 = shape113;
                        richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                        function8 = function6;
                        richTooltipState4 = richTooltipState3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        }
                        Modifier modifier115 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function1110 = function4;
                        Shape shape114 = richTooltipContainerShape;
                        function6 = function5;
                        richTooltipState3 = richTooltipState2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                        }
                        iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        l0.x2 x2Var112 = (l0.x2) objRememberedValue2;
                        int i211115 = i12 >> 6;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        int i211116 = i12 << 3;
                        a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function1110, function6, i12)), x2Var112, modifier115, shape114, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i211116 & 234881024) | ((i12 << 6) & 57344) | (i211115 & 7168) | (i211116 & 896) | 14155830);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier115;
                        function7 = function1110;
                        shape2 = shape114;
                        richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                        function8 = function6;
                        richTooltipState4 = richTooltipState3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
                }
                i19 = 12582912;
                i12 |= i19;
                if ((23967451 & i12) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    }
                    Modifier modifier116 = modifier2;
                    Function2<? super Composer, ? super Integer, Unit> function1111 = function4;
                    Shape shape115 = richTooltipContainerShape;
                    function6 = function5;
                    richTooltipState3 = richTooltipState2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.x2 x2Var113 = (l0.x2) objRememberedValue2;
                    int i211117 = i12 >> 6;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    int i211118 = i12 << 3;
                    a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function1111, function6, i12)), x2Var113, modifier116, shape115, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i211118 & 234881024) | ((i12 << 6) & 57344) | (i211117 & 7168) | (i211118 & 896) | 14155830);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier116;
                    function7 = function1111;
                    shape2 = shape115;
                    richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                    function8 = function6;
                    richTooltipState4 = richTooltipState3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    }
                    Modifier modifier117 = modifier2;
                    Function2<? super Composer, ? super Integer, Unit> function1112 = function4;
                    Shape shape116 = richTooltipContainerShape;
                    function6 = function5;
                    richTooltipState3 = richTooltipState2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.x2 x2Var114 = (l0.x2) objRememberedValue2;
                    int i211119 = i12 >> 6;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    int i2111110 = i12 << 3;
                    a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function1112, function6, i12)), x2Var114, modifier117, shape116, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i2111110 & 234881024) | ((i12 << 6) & 57344) | (i211119 & 7168) | (i2111110 & 896) | 14155830);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier117;
                    function7 = function1112;
                    shape2 = shape116;
                    richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                    function8 = function6;
                    richTooltipState4 = richTooltipState3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
            }
            i12 |= 3072;
            function4 = function2;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i10 & 458752) == 0) {
                    richTooltipContainerShape = shape;
                    if ((i11 & 32) == 0) {
                        i21 = 65536;
                    } else {
                        i21 = 65536;
                    }
                    i12 |= i21;
                } else {
                    richTooltipContainerShape = shape;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i11 & 128) != 0) {
                    if ((29360128 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                    }
                    if ((23967451 & i12) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        }
                        Modifier modifier118 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function1113 = function4;
                        Shape shape117 = richTooltipContainerShape;
                        function6 = function5;
                        richTooltipState3 = richTooltipState2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                        }
                        iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        l0.x2 x2Var115 = (l0.x2) objRememberedValue2;
                        int i2111111 = i12 >> 6;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        int i2111112 = i12 << 3;
                        a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function1113, function6, i12)), x2Var115, modifier118, shape117, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i2111112 & 234881024) | ((i12 << 6) & 57344) | (i2111111 & 7168) | (i2111112 & 896) | 14155830);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier118;
                        function7 = function1113;
                        shape2 = shape117;
                        richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                        function8 = function6;
                        richTooltipState4 = richTooltipState3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        }
                        Modifier modifier119 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function1114 = function4;
                        Shape shape118 = richTooltipContainerShape;
                        function6 = function5;
                        richTooltipState3 = richTooltipState2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                        }
                        iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        l0.x2 x2Var116 = (l0.x2) objRememberedValue2;
                        int i2111113 = i12 >> 6;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        int i2111114 = i12 << 3;
                        a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function1114, function6, i12)), x2Var116, modifier119, shape118, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i2111114 & 234881024) | ((i12 << 6) & 57344) | (i2111113 & 7168) | (i2111114 & 896) | 14155830);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier119;
                        function7 = function1114;
                        shape2 = shape118;
                        richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                        function8 = function6;
                        richTooltipState4 = richTooltipState3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
                }
                i19 = 12582912;
                i12 |= i19;
                if ((23967451 & i12) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    }
                    Modifier modifier1110 = modifier2;
                    Function2<? super Composer, ? super Integer, Unit> function1115 = function4;
                    Shape shape119 = richTooltipContainerShape;
                    function6 = function5;
                    richTooltipState3 = richTooltipState2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.x2 x2Var117 = (l0.x2) objRememberedValue2;
                    int i2111115 = i12 >> 6;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    int i2111116 = i12 << 3;
                    a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function1115, function6, i12)), x2Var117, modifier1110, shape119, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i2111116 & 234881024) | ((i12 << 6) & 57344) | (i2111115 & 7168) | (i2111116 & 896) | 14155830);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1110;
                    function7 = function1115;
                    shape2 = shape119;
                    richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                    function8 = function6;
                    richTooltipState4 = richTooltipState3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    }
                    Modifier modifier1111 = modifier2;
                    Function2<? super Composer, ? super Integer, Unit> function1116 = function4;
                    Shape shape1110 = richTooltipContainerShape;
                    function6 = function5;
                    richTooltipState3 = richTooltipState2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.x2 x2Var118 = (l0.x2) objRememberedValue2;
                    int i2111117 = i12 >> 6;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    int i2111118 = i12 << 3;
                    a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function1116, function6, i12)), x2Var118, modifier1111, shape1110, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i2111118 & 234881024) | ((i12 << 6) & 57344) | (i2111117 & 7168) | (i2111118 & 896) | 14155830);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1111;
                    function7 = function1116;
                    shape2 = shape1110;
                    richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                    function8 = function6;
                    richTooltipState4 = richTooltipState3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
            }
            i12 |= 24576;
            function5 = function3;
            if ((i10 & 458752) == 0) {
                richTooltipContainerShape = shape;
                if ((i11 & 32) == 0) {
                    i21 = 65536;
                } else {
                    i21 = 65536;
                }
                i12 |= i21;
            } else {
                richTooltipContainerShape = shape;
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((i11 & 128) != 0) {
                if ((29360128 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                }
                if ((23967451 & i12) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    }
                    Modifier modifier1112 = modifier2;
                    Function2<? super Composer, ? super Integer, Unit> function1117 = function4;
                    Shape shape1111 = richTooltipContainerShape;
                    function6 = function5;
                    richTooltipState3 = richTooltipState2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.x2 x2Var119 = (l0.x2) objRememberedValue2;
                    int i2111119 = i12 >> 6;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    int i21111110 = i12 << 3;
                    a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function1117, function6, i12)), x2Var119, modifier1112, shape1111, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i21111110 & 234881024) | ((i12 << 6) & 57344) | (i2111119 & 7168) | (i21111110 & 896) | 14155830);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1112;
                    function7 = function1117;
                    shape2 = shape1111;
                    richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                    function8 = function6;
                    richTooltipState4 = richTooltipState3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    }
                    Modifier modifier1113 = modifier2;
                    Function2<? super Composer, ? super Integer, Unit> function1118 = function4;
                    Shape shape1112 = richTooltipContainerShape;
                    function6 = function5;
                    richTooltipState3 = richTooltipState2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.x2 x2Var1110 = (l0.x2) objRememberedValue2;
                    int i21111111 = i12 >> 6;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    int i21111112 = i12 << 3;
                    a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function1118, function6, i12)), x2Var1110, modifier1113, shape1112, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i21111112 & 234881024) | ((i12 << 6) & 57344) | (i21111111 & 7168) | (i21111112 & 896) | 14155830);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1113;
                    function7 = function1118;
                    shape2 = shape1112;
                    richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                    function8 = function6;
                    richTooltipState4 = richTooltipState3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
            }
            i19 = 12582912;
            i12 |= i19;
            if ((23967451 & i12) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RichTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        richTooltipState2 = (RichTooltipState) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RichTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        richTooltipState2 = (RichTooltipState) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                    }
                }
                Modifier modifier1114 = modifier2;
                Function2<? super Composer, ? super Integer, Unit> function1119 = function4;
                Shape shape1113 = richTooltipContainerShape;
                function6 = function5;
                richTooltipState3 = richTooltipState2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                }
                iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                l0.x2 x2Var1111 = (l0.x2) objRememberedValue2;
                int i21111113 = i12 >> 6;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new c(richTooltipState3, function6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new c(richTooltipState3, function6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                int i21111114 = i12 << 3;
                a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function1119, function6, i12)), x2Var1111, modifier1114, shape1113, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i21111114 & 234881024) | ((i12 << 6) & 57344) | (i21111113 & 7168) | (i21111114 & 896) | 14155830);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1114;
                function7 = function1119;
                shape2 = shape1113;
                richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                function8 = function6;
                richTooltipState4 = richTooltipState3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RichTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        richTooltipState2 = (RichTooltipState) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RichTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        richTooltipState2 = (RichTooltipState) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                    }
                }
                Modifier modifier1115 = modifier2;
                Function2<? super Composer, ? super Integer, Unit> function11110 = function4;
                Shape shape1114 = richTooltipContainerShape;
                function6 = function5;
                richTooltipState3 = richTooltipState2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                }
                iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                l0.x2 x2Var1112 = (l0.x2) objRememberedValue2;
                int i21111115 = i12 >> 6;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new c(richTooltipState3, function6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new c(richTooltipState3, function6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                int i21111116 = i12 << 3;
                a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function11110, function6, i12)), x2Var1112, modifier1115, shape1114, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i21111116 & 234881024) | ((i12 << 6) & 57344) | (i21111115 & 7168) | (i21111116 & 896) | 14155830);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1115;
                function7 = function11110;
                shape2 = shape1114;
                richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                function8 = function6;
                richTooltipState4 = richTooltipState3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & 896) == 0) {
                richTooltipState2 = richTooltipState;
                if (composerStartRestartGroup.changed(richTooltipState2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 7168) == 0) {
                    function4 = function2;
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
                        function5 = function3;
                        if (composerStartRestartGroup.changedInstance(function5)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 458752) == 0) {
                        richTooltipContainerShape = shape;
                        if ((i11 & 32) == 0) {
                            i21 = 65536;
                        } else {
                            i21 = 65536;
                        }
                        i12 |= i21;
                    } else {
                        richTooltipContainerShape = shape;
                    }
                    if ((i10 & 3670016) != 0) {
                        if ((i11 & 64) == 0) {
                            i20 = 524288;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 128) != 0) {
                        if ((29360128 & i10) == 0) {
                            if (composerStartRestartGroup.changedInstance(content)) {
                                i19 = 8388608;
                            } else {
                                i19 = 4194304;
                            }
                        }
                        if ((23967451 & i12) == 4793490) {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RichTooltipState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                                }
                            } else {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RichTooltipState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                                }
                            }
                            Modifier modifier1116 = modifier2;
                            Function2<? super Composer, ? super Integer, Unit> function11111 = function4;
                            Shape shape1115 = richTooltipContainerShape;
                            function6 = function5;
                            richTooltipState3 = richTooltipState2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                            }
                            iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            l0.x2 x2Var1113 = (l0.x2) objRememberedValue2;
                            int i21111117 = i12 >> 6;
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue3 = new c(richTooltipState3, function6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new c(richTooltipState3, function6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                            int i21111118 = i12 << 3;
                            a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function11111, function6, i12)), x2Var1113, modifier1116, shape1115, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i21111118 & 234881024) | ((i12 << 6) & 57344) | (i21111117 & 7168) | (i21111118 & 896) | 14155830);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier1116;
                            function7 = function11111;
                            shape2 = shape1115;
                            richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                            function8 = function6;
                            richTooltipState4 = richTooltipState3;
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i10 & 1) != 0) {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RichTooltipState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                                }
                            } else {
                                if (i22 != 0) {
                                    modifier2 = Modifier.INSTANCE;
                                }
                                if (i13 != 0) {
                                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new RichTooltipState();
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceableGroup();
                                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                                }
                                if (i15 != 0) {
                                    function4 = null;
                                }
                                if (i17 != 0) {
                                    function5 = null;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    i12 &= -3670017;
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                                } else {
                                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                                }
                            }
                            Modifier modifier1117 = modifier2;
                            Function2<? super Composer, ? super Integer, Unit> function11112 = function4;
                            Shape shape1116 = richTooltipContainerShape;
                            function6 = function5;
                            richTooltipState3 = richTooltipState2;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                            }
                            iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            l0.x2 x2Var1114 = (l0.x2) objRememberedValue2;
                            int i21111119 = i12 >> 6;
                            composerStartRestartGroup.startReplaceableGroup(511388516);
                            zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged) {
                                objRememberedValue3 = new c(richTooltipState3, function6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            } else {
                                objRememberedValue3 = new c(richTooltipState3, function6);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                            int i211111110 = i12 << 3;
                            a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function11112, function6, i12)), x2Var1114, modifier1117, shape1116, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i211111110 & 234881024) | ((i12 << 6) & 57344) | (i21111119 & 7168) | (i211111110 & 896) | 14155830);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier1117;
                            function7 = function11112;
                            shape2 = shape1116;
                            richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                            function8 = function6;
                            richTooltipState4 = richTooltipState3;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            return;
                        }
                        scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
                    }
                    i19 = 12582912;
                    i12 |= i19;
                    if ((23967451 & i12) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        }
                        Modifier modifier1118 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function11113 = function4;
                        Shape shape1117 = richTooltipContainerShape;
                        function6 = function5;
                        richTooltipState3 = richTooltipState2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                        }
                        iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        l0.x2 x2Var1115 = (l0.x2) objRememberedValue2;
                        int i211111111 = i12 >> 6;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        int i211111112 = i12 << 3;
                        a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function11113, function6, i12)), x2Var1115, modifier1118, shape1117, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i211111112 & 234881024) | ((i12 << 6) & 57344) | (i211111111 & 7168) | (i211111112 & 896) | 14155830);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier1118;
                        function7 = function11113;
                        shape2 = shape1117;
                        richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                        function8 = function6;
                        richTooltipState4 = richTooltipState3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        }
                        Modifier modifier1119 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function11114 = function4;
                        Shape shape1118 = richTooltipContainerShape;
                        function6 = function5;
                        richTooltipState3 = richTooltipState2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                        }
                        iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        l0.x2 x2Var1116 = (l0.x2) objRememberedValue2;
                        int i211111113 = i12 >> 6;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        int i211111114 = i12 << 3;
                        a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function11114, function6, i12)), x2Var1116, modifier1119, shape1118, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i211111114 & 234881024) | ((i12 << 6) & 57344) | (i211111113 & 7168) | (i211111114 & 896) | 14155830);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier1119;
                        function7 = function11114;
                        shape2 = shape1118;
                        richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                        function8 = function6;
                        richTooltipState4 = richTooltipState3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
                }
                i12 |= 24576;
                function5 = function3;
                if ((i10 & 458752) == 0) {
                    richTooltipContainerShape = shape;
                    if ((i11 & 32) == 0) {
                        i21 = 65536;
                    } else {
                        i21 = 65536;
                    }
                    i12 |= i21;
                } else {
                    richTooltipContainerShape = shape;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i11 & 128) != 0) {
                    if ((29360128 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                    }
                    if ((23967451 & i12) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        }
                        Modifier modifier11110 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function11115 = function4;
                        Shape shape1119 = richTooltipContainerShape;
                        function6 = function5;
                        richTooltipState3 = richTooltipState2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                        }
                        iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        l0.x2 x2Var1117 = (l0.x2) objRememberedValue2;
                        int i211111115 = i12 >> 6;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        int i211111116 = i12 << 3;
                        a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function11115, function6, i12)), x2Var1117, modifier11110, shape1119, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i211111116 & 234881024) | ((i12 << 6) & 57344) | (i211111115 & 7168) | (i211111116 & 896) | 14155830);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11110;
                        function7 = function11115;
                        shape2 = shape1119;
                        richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                        function8 = function6;
                        richTooltipState4 = richTooltipState3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        }
                        Modifier modifier11111 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function11116 = function4;
                        Shape shape11110 = richTooltipContainerShape;
                        function6 = function5;
                        richTooltipState3 = richTooltipState2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                        }
                        iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        l0.x2 x2Var1118 = (l0.x2) objRememberedValue2;
                        int i211111117 = i12 >> 6;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        int i211111118 = i12 << 3;
                        a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function11116, function6, i12)), x2Var1118, modifier11111, shape11110, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i211111118 & 234881024) | ((i12 << 6) & 57344) | (i211111117 & 7168) | (i211111118 & 896) | 14155830);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11111;
                        function7 = function11116;
                        shape2 = shape11110;
                        richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                        function8 = function6;
                        richTooltipState4 = richTooltipState3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
                }
                i19 = 12582912;
                i12 |= i19;
                if ((23967451 & i12) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    }
                    Modifier modifier11112 = modifier2;
                    Function2<? super Composer, ? super Integer, Unit> function11117 = function4;
                    Shape shape11111 = richTooltipContainerShape;
                    function6 = function5;
                    richTooltipState3 = richTooltipState2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.x2 x2Var1119 = (l0.x2) objRememberedValue2;
                    int i211111119 = i12 >> 6;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    int i2111111110 = i12 << 3;
                    a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function11117, function6, i12)), x2Var1119, modifier11112, shape11111, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i2111111110 & 234881024) | ((i12 << 6) & 57344) | (i211111119 & 7168) | (i2111111110 & 896) | 14155830);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier11112;
                    function7 = function11117;
                    shape2 = shape11111;
                    richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                    function8 = function6;
                    richTooltipState4 = richTooltipState3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    }
                    Modifier modifier11113 = modifier2;
                    Function2<? super Composer, ? super Integer, Unit> function11118 = function4;
                    Shape shape11112 = richTooltipContainerShape;
                    function6 = function5;
                    richTooltipState3 = richTooltipState2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.x2 x2Var11110 = (l0.x2) objRememberedValue2;
                    int i2111111111 = i12 >> 6;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    int i2111111112 = i12 << 3;
                    a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function11118, function6, i12)), x2Var11110, modifier11113, shape11112, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i2111111112 & 234881024) | ((i12 << 6) & 57344) | (i2111111111 & 7168) | (i2111111112 & 896) | 14155830);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier11113;
                    function7 = function11118;
                    shape2 = shape11112;
                    richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                    function8 = function6;
                    richTooltipState4 = richTooltipState3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
            }
            i12 |= 3072;
            function4 = function2;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    function5 = function3;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i10 & 458752) == 0) {
                    richTooltipContainerShape = shape;
                    if ((i11 & 32) == 0) {
                        i21 = 65536;
                    } else {
                        i21 = 65536;
                    }
                    i12 |= i21;
                } else {
                    richTooltipContainerShape = shape;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i11 & 128) != 0) {
                    if ((29360128 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                    }
                    if ((23967451 & i12) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        }
                        Modifier modifier11114 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function11119 = function4;
                        Shape shape11113 = richTooltipContainerShape;
                        function6 = function5;
                        richTooltipState3 = richTooltipState2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                        }
                        iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        l0.x2 x2Var11111 = (l0.x2) objRememberedValue2;
                        int i2111111113 = i12 >> 6;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        int i2111111114 = i12 << 3;
                        a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function11119, function6, i12)), x2Var11111, modifier11114, shape11113, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i2111111114 & 234881024) | ((i12 << 6) & 57344) | (i2111111113 & 7168) | (i2111111114 & 896) | 14155830);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11114;
                        function7 = function11119;
                        shape2 = shape11113;
                        richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                        function8 = function6;
                        richTooltipState4 = richTooltipState3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        }
                        Modifier modifier11115 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function111110 = function4;
                        Shape shape11114 = richTooltipContainerShape;
                        function6 = function5;
                        richTooltipState3 = richTooltipState2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                        }
                        iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        l0.x2 x2Var11112 = (l0.x2) objRememberedValue2;
                        int i2111111115 = i12 >> 6;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        int i2111111116 = i12 << 3;
                        a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function111110, function6, i12)), x2Var11112, modifier11115, shape11114, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i2111111116 & 234881024) | ((i12 << 6) & 57344) | (i2111111115 & 7168) | (i2111111116 & 896) | 14155830);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier11115;
                        function7 = function111110;
                        shape2 = shape11114;
                        richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                        function8 = function6;
                        richTooltipState4 = richTooltipState3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
                }
                i19 = 12582912;
                i12 |= i19;
                if ((23967451 & i12) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    }
                    Modifier modifier11116 = modifier2;
                    Function2<? super Composer, ? super Integer, Unit> function111111 = function4;
                    Shape shape11115 = richTooltipContainerShape;
                    function6 = function5;
                    richTooltipState3 = richTooltipState2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.x2 x2Var11113 = (l0.x2) objRememberedValue2;
                    int i2111111117 = i12 >> 6;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    int i2111111118 = i12 << 3;
                    a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function111111, function6, i12)), x2Var11113, modifier11116, shape11115, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i2111111118 & 234881024) | ((i12 << 6) & 57344) | (i2111111117 & 7168) | (i2111111118 & 896) | 14155830);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier11116;
                    function7 = function111111;
                    shape2 = shape11115;
                    richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                    function8 = function6;
                    richTooltipState4 = richTooltipState3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    }
                    Modifier modifier11117 = modifier2;
                    Function2<? super Composer, ? super Integer, Unit> function111112 = function4;
                    Shape shape11116 = richTooltipContainerShape;
                    function6 = function5;
                    richTooltipState3 = richTooltipState2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.x2 x2Var11114 = (l0.x2) objRememberedValue2;
                    int i2111111119 = i12 >> 6;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    int i21111111110 = i12 << 3;
                    a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function111112, function6, i12)), x2Var11114, modifier11117, shape11116, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i21111111110 & 234881024) | ((i12 << 6) & 57344) | (i2111111119 & 7168) | (i21111111110 & 896) | 14155830);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier11117;
                    function7 = function111112;
                    shape2 = shape11116;
                    richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                    function8 = function6;
                    richTooltipState4 = richTooltipState3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
            }
            i12 |= 24576;
            function5 = function3;
            if ((i10 & 458752) == 0) {
                richTooltipContainerShape = shape;
                if ((i11 & 32) == 0) {
                    i21 = 65536;
                } else {
                    i21 = 65536;
                }
                i12 |= i21;
            } else {
                richTooltipContainerShape = shape;
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((i11 & 128) != 0) {
                if ((29360128 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                }
                if ((23967451 & i12) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    }
                    Modifier modifier11118 = modifier2;
                    Function2<? super Composer, ? super Integer, Unit> function111113 = function4;
                    Shape shape11117 = richTooltipContainerShape;
                    function6 = function5;
                    richTooltipState3 = richTooltipState2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.x2 x2Var11115 = (l0.x2) objRememberedValue2;
                    int i21111111111 = i12 >> 6;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    int i21111111112 = i12 << 3;
                    a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function111113, function6, i12)), x2Var11115, modifier11118, shape11117, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i21111111112 & 234881024) | ((i12 << 6) & 57344) | (i21111111111 & 7168) | (i21111111112 & 896) | 14155830);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier11118;
                    function7 = function111113;
                    shape2 = shape11117;
                    richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                    function8 = function6;
                    richTooltipState4 = richTooltipState3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    }
                    Modifier modifier11119 = modifier2;
                    Function2<? super Composer, ? super Integer, Unit> function111114 = function4;
                    Shape shape11118 = richTooltipContainerShape;
                    function6 = function5;
                    richTooltipState3 = richTooltipState2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.x2 x2Var11116 = (l0.x2) objRememberedValue2;
                    int i21111111113 = i12 >> 6;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    int i21111111114 = i12 << 3;
                    a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function111114, function6, i12)), x2Var11116, modifier11119, shape11118, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i21111111114 & 234881024) | ((i12 << 6) & 57344) | (i21111111113 & 7168) | (i21111111114 & 896) | 14155830);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier11119;
                    function7 = function111114;
                    shape2 = shape11118;
                    richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                    function8 = function6;
                    richTooltipState4 = richTooltipState3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
            }
            i19 = 12582912;
            i12 |= i19;
            if ((23967451 & i12) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RichTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        richTooltipState2 = (RichTooltipState) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RichTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        richTooltipState2 = (RichTooltipState) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                    }
                }
                Modifier modifier111110 = modifier2;
                Function2<? super Composer, ? super Integer, Unit> function111115 = function4;
                Shape shape11119 = richTooltipContainerShape;
                function6 = function5;
                richTooltipState3 = richTooltipState2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                }
                iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                l0.x2 x2Var11117 = (l0.x2) objRememberedValue2;
                int i21111111115 = i12 >> 6;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new c(richTooltipState3, function6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new c(richTooltipState3, function6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                int i21111111116 = i12 << 3;
                a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function111115, function6, i12)), x2Var11117, modifier111110, shape11119, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i21111111116 & 234881024) | ((i12 << 6) & 57344) | (i21111111115 & 7168) | (i21111111116 & 896) | 14155830);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier111110;
                function7 = function111115;
                shape2 = shape11119;
                richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                function8 = function6;
                richTooltipState4 = richTooltipState3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RichTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        richTooltipState2 = (RichTooltipState) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RichTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        richTooltipState2 = (RichTooltipState) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                    }
                }
                Modifier modifier111111 = modifier2;
                Function2<? super Composer, ? super Integer, Unit> function111116 = function4;
                Shape shape111110 = richTooltipContainerShape;
                function6 = function5;
                richTooltipState3 = richTooltipState2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                }
                iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                l0.x2 x2Var11118 = (l0.x2) objRememberedValue2;
                int i21111111117 = i12 >> 6;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new c(richTooltipState3, function6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new c(richTooltipState3, function6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                int i21111111118 = i12 << 3;
                a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function111116, function6, i12)), x2Var11118, modifier111111, shape111110, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i21111111118 & 234881024) | ((i12 << 6) & 57344) | (i21111111117 & 7168) | (i21111111118 & 896) | 14155830);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier111111;
                function7 = function111116;
                shape2 = shape111110;
                richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                function8 = function6;
                richTooltipState4 = richTooltipState3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
        }
        i12 |= BluetoothState.REQUEST_CONNECT_DEVICE;
        richTooltipState2 = richTooltipState;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 7168) == 0) {
                function4 = function2;
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
                    function5 = function3;
                    if (composerStartRestartGroup.changedInstance(function5)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i10 & 458752) == 0) {
                    richTooltipContainerShape = shape;
                    if ((i11 & 32) == 0) {
                        i21 = 65536;
                    } else {
                        i21 = 65536;
                    }
                    i12 |= i21;
                } else {
                    richTooltipContainerShape = shape;
                }
                if ((i10 & 3670016) != 0) {
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i11 & 128) != 0) {
                    if ((29360128 & i10) == 0) {
                        if (composerStartRestartGroup.changedInstance(content)) {
                            i19 = 8388608;
                        } else {
                            i19 = 4194304;
                        }
                    }
                    if ((23967451 & i12) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        }
                        Modifier modifier111112 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function111117 = function4;
                        Shape shape111111 = richTooltipContainerShape;
                        function6 = function5;
                        richTooltipState3 = richTooltipState2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                        }
                        iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        l0.x2 x2Var11119 = (l0.x2) objRememberedValue2;
                        int i21111111119 = i12 >> 6;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        int i211111111110 = i12 << 3;
                        a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function111117, function6, i12)), x2Var11119, modifier111112, shape111111, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i211111111110 & 234881024) | ((i12 << 6) & 57344) | (i21111111119 & 7168) | (i211111111110 & 896) | 14155830);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier111112;
                        function7 = function111117;
                        shape2 = shape111111;
                        richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                        function8 = function6;
                        richTooltipState4 = richTooltipState3;
                    } else {
                        composerStartRestartGroup.startDefaults();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        } else {
                            if (i22 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (i13 != 0) {
                                composerStartRestartGroup.startReplaceableGroup(-492369756);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new RichTooltipState();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceableGroup();
                                richTooltipState2 = (RichTooltipState) objRememberedValue;
                            }
                            if (i15 != 0) {
                                function4 = null;
                            }
                            if (i17 != 0) {
                                function5 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                            } else {
                                richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                            }
                        }
                        Modifier modifier111113 = modifier2;
                        Function2<? super Composer, ? super Integer, Unit> function111118 = function4;
                        Shape shape111112 = richTooltipContainerShape;
                        function6 = function5;
                        richTooltipState3 = richTooltipState2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                        }
                        iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        l0.x2 x2Var111110 = (l0.x2) objRememberedValue2;
                        int i211111111111 = i12 >> 6;
                        composerStartRestartGroup.startReplaceableGroup(511388516);
                        zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (zChanged) {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            objRememberedValue3 = new c(richTooltipState3, function6);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                        int i211111111112 = i12 << 3;
                        a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function111118, function6, i12)), x2Var111110, modifier111113, shape111112, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i211111111112 & 234881024) | ((i12 << 6) & 57344) | (i211111111111 & 7168) | (i211111111112 & 896) | 14155830);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier111113;
                        function7 = function111118;
                        shape2 = shape111112;
                        richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                        function8 = function6;
                        richTooltipState4 = richTooltipState3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        return;
                    }
                    scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
                }
                i19 = 12582912;
                i12 |= i19;
                if ((23967451 & i12) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    }
                    Modifier modifier111114 = modifier2;
                    Function2<? super Composer, ? super Integer, Unit> function111119 = function4;
                    Shape shape111113 = richTooltipContainerShape;
                    function6 = function5;
                    richTooltipState3 = richTooltipState2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.x2 x2Var111111 = (l0.x2) objRememberedValue2;
                    int i211111111113 = i12 >> 6;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    int i211111111114 = i12 << 3;
                    a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function111119, function6, i12)), x2Var111111, modifier111114, shape111113, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i211111111114 & 234881024) | ((i12 << 6) & 57344) | (i211111111113 & 7168) | (i211111111114 & 896) | 14155830);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111114;
                    function7 = function111119;
                    shape2 = shape111113;
                    richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                    function8 = function6;
                    richTooltipState4 = richTooltipState3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    }
                    Modifier modifier111115 = modifier2;
                    Function2<? super Composer, ? super Integer, Unit> function1111110 = function4;
                    Shape shape111114 = richTooltipContainerShape;
                    function6 = function5;
                    richTooltipState3 = richTooltipState2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.x2 x2Var111112 = (l0.x2) objRememberedValue2;
                    int i211111111115 = i12 >> 6;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    int i211111111116 = i12 << 3;
                    a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function1111110, function6, i12)), x2Var111112, modifier111115, shape111114, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i211111111116 & 234881024) | ((i12 << 6) & 57344) | (i211111111115 & 7168) | (i211111111116 & 896) | 14155830);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111115;
                    function7 = function1111110;
                    shape2 = shape111114;
                    richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                    function8 = function6;
                    richTooltipState4 = richTooltipState3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
            }
            i12 |= 24576;
            function5 = function3;
            if ((i10 & 458752) == 0) {
                richTooltipContainerShape = shape;
                if ((i11 & 32) == 0) {
                    i21 = 65536;
                } else {
                    i21 = 65536;
                }
                i12 |= i21;
            } else {
                richTooltipContainerShape = shape;
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((i11 & 128) != 0) {
                if ((29360128 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                }
                if ((23967451 & i12) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    }
                    Modifier modifier111116 = modifier2;
                    Function2<? super Composer, ? super Integer, Unit> function1111111 = function4;
                    Shape shape111115 = richTooltipContainerShape;
                    function6 = function5;
                    richTooltipState3 = richTooltipState2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.x2 x2Var111113 = (l0.x2) objRememberedValue2;
                    int i211111111117 = i12 >> 6;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    int i211111111118 = i12 << 3;
                    a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function1111111, function6, i12)), x2Var111113, modifier111116, shape111115, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i211111111118 & 234881024) | ((i12 << 6) & 57344) | (i211111111117 & 7168) | (i211111111118 & 896) | 14155830);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111116;
                    function7 = function1111111;
                    shape2 = shape111115;
                    richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                    function8 = function6;
                    richTooltipState4 = richTooltipState3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    }
                    Modifier modifier111117 = modifier2;
                    Function2<? super Composer, ? super Integer, Unit> function1111112 = function4;
                    Shape shape111116 = richTooltipContainerShape;
                    function6 = function5;
                    richTooltipState3 = richTooltipState2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.x2 x2Var111114 = (l0.x2) objRememberedValue2;
                    int i211111111119 = i12 >> 6;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    int i2111111111110 = i12 << 3;
                    a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function1111112, function6, i12)), x2Var111114, modifier111117, shape111116, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i2111111111110 & 234881024) | ((i12 << 6) & 57344) | (i211111111119 & 7168) | (i2111111111110 & 896) | 14155830);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier111117;
                    function7 = function1111112;
                    shape2 = shape111116;
                    richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                    function8 = function6;
                    richTooltipState4 = richTooltipState3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
            }
            i19 = 12582912;
            i12 |= i19;
            if ((23967451 & i12) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RichTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        richTooltipState2 = (RichTooltipState) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RichTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        richTooltipState2 = (RichTooltipState) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                    }
                }
                Modifier modifier111118 = modifier2;
                Function2<? super Composer, ? super Integer, Unit> function1111113 = function4;
                Shape shape111117 = richTooltipContainerShape;
                function6 = function5;
                richTooltipState3 = richTooltipState2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                }
                iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                l0.x2 x2Var111115 = (l0.x2) objRememberedValue2;
                int i2111111111111 = i12 >> 6;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new c(richTooltipState3, function6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new c(richTooltipState3, function6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                int i2111111111112 = i12 << 3;
                a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function1111113, function6, i12)), x2Var111115, modifier111118, shape111117, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i2111111111112 & 234881024) | ((i12 << 6) & 57344) | (i2111111111111 & 7168) | (i2111111111112 & 896) | 14155830);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier111118;
                function7 = function1111113;
                shape2 = shape111117;
                richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                function8 = function6;
                richTooltipState4 = richTooltipState3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RichTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        richTooltipState2 = (RichTooltipState) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RichTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        richTooltipState2 = (RichTooltipState) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                    }
                }
                Modifier modifier111119 = modifier2;
                Function2<? super Composer, ? super Integer, Unit> function1111114 = function4;
                Shape shape111118 = richTooltipContainerShape;
                function6 = function5;
                richTooltipState3 = richTooltipState2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                }
                iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                l0.x2 x2Var111116 = (l0.x2) objRememberedValue2;
                int i2111111111113 = i12 >> 6;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new c(richTooltipState3, function6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new c(richTooltipState3, function6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                int i2111111111114 = i12 << 3;
                a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function1111114, function6, i12)), x2Var111116, modifier111119, shape111118, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i2111111111114 & 234881024) | ((i12 << 6) & 57344) | (i2111111111113 & 7168) | (i2111111111114 & 896) | 14155830);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier111119;
                function7 = function1111114;
                shape2 = shape111118;
                richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                function8 = function6;
                richTooltipState4 = richTooltipState3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
        }
        i12 |= 3072;
        function4 = function2;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 57344) == 0) {
                function5 = function3;
                if (composerStartRestartGroup.changedInstance(function5)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i10 & 458752) == 0) {
                richTooltipContainerShape = shape;
                if ((i11 & 32) == 0) {
                    i21 = 65536;
                } else {
                    i21 = 65536;
                }
                i12 |= i21;
            } else {
                richTooltipContainerShape = shape;
            }
            if ((i10 & 3670016) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((i11 & 128) != 0) {
                if ((29360128 & i10) == 0) {
                    if (composerStartRestartGroup.changedInstance(content)) {
                        i19 = 8388608;
                    } else {
                        i19 = 4194304;
                    }
                }
                if ((23967451 & i12) == 4793490) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    }
                    Modifier modifier1111110 = modifier2;
                    Function2<? super Composer, ? super Integer, Unit> function1111115 = function4;
                    Shape shape111119 = richTooltipContainerShape;
                    function6 = function5;
                    richTooltipState3 = richTooltipState2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.x2 x2Var111117 = (l0.x2) objRememberedValue2;
                    int i2111111111115 = i12 >> 6;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    int i2111111111116 = i12 << 3;
                    a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function1111115, function6, i12)), x2Var111117, modifier1111110, shape111119, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i2111111111116 & 234881024) | ((i12 << 6) & 57344) | (i2111111111115 & 7168) | (i2111111111116 & 896) | 14155830);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1111110;
                    function7 = function1111115;
                    shape2 = shape111119;
                    richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                    function8 = function6;
                    richTooltipState4 = richTooltipState3;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    } else {
                        if (i22 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if (i13 != 0) {
                            composerStartRestartGroup.startReplaceableGroup(-492369756);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new RichTooltipState();
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceableGroup();
                            richTooltipState2 = (RichTooltipState) objRememberedValue;
                        }
                        if (i15 != 0) {
                            function4 = null;
                        }
                        if (i17 != 0) {
                            function5 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                        } else {
                            richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                        }
                    }
                    Modifier modifier1111111 = modifier2;
                    Function2<? super Composer, ? super Integer, Unit> function1111116 = function4;
                    Shape shape1111110 = richTooltipContainerShape;
                    function6 = function5;
                    richTooltipState3 = richTooltipState2;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                    }
                    iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    l0.x2 x2Var111118 = (l0.x2) objRememberedValue2;
                    int i2111111111117 = i12 >> 6;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (zChanged) {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    } else {
                        objRememberedValue3 = new c(richTooltipState3, function6);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                    int i2111111111118 = i12 << 3;
                    a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function1111116, function6, i12)), x2Var111118, modifier1111111, shape1111110, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i2111111111118 & 234881024) | ((i12 << 6) & 57344) | (i2111111111117 & 7168) | (i2111111111118 & 896) | 14155830);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier1111111;
                    function7 = function1111116;
                    shape2 = shape1111110;
                    richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                    function8 = function6;
                    richTooltipState4 = richTooltipState3;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
            }
            i19 = 12582912;
            i12 |= i19;
            if ((23967451 & i12) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RichTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        richTooltipState2 = (RichTooltipState) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RichTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        richTooltipState2 = (RichTooltipState) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                    }
                }
                Modifier modifier1111112 = modifier2;
                Function2<? super Composer, ? super Integer, Unit> function1111117 = function4;
                Shape shape1111111 = richTooltipContainerShape;
                function6 = function5;
                richTooltipState3 = richTooltipState2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                }
                iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                l0.x2 x2Var111119 = (l0.x2) objRememberedValue2;
                int i2111111111119 = i12 >> 6;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new c(richTooltipState3, function6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new c(richTooltipState3, function6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                int i21111111111110 = i12 << 3;
                a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function1111117, function6, i12)), x2Var111119, modifier1111112, shape1111111, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i21111111111110 & 234881024) | ((i12 << 6) & 57344) | (i2111111111119 & 7168) | (i21111111111110 & 896) | 14155830);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1111112;
                function7 = function1111117;
                shape2 = shape1111111;
                richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                function8 = function6;
                richTooltipState4 = richTooltipState3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RichTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        richTooltipState2 = (RichTooltipState) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RichTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        richTooltipState2 = (RichTooltipState) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                    }
                }
                Modifier modifier1111113 = modifier2;
                Function2<? super Composer, ? super Integer, Unit> function1111118 = function4;
                Shape shape1111112 = richTooltipContainerShape;
                function6 = function5;
                richTooltipState3 = richTooltipState2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                }
                iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                l0.x2 x2Var1111110 = (l0.x2) objRememberedValue2;
                int i21111111111111 = i12 >> 6;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new c(richTooltipState3, function6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new c(richTooltipState3, function6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                int i21111111111112 = i12 << 3;
                a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function1111118, function6, i12)), x2Var1111110, modifier1111113, shape1111112, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i21111111111112 & 234881024) | ((i12 << 6) & 57344) | (i21111111111111 & 7168) | (i21111111111112 & 896) | 14155830);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1111113;
                function7 = function1111118;
                shape2 = shape1111112;
                richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                function8 = function6;
                richTooltipState4 = richTooltipState3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
        }
        i12 |= 24576;
        function5 = function3;
        if ((i10 & 458752) == 0) {
            richTooltipContainerShape = shape;
            if ((i11 & 32) == 0) {
                i21 = 65536;
            } else {
                i21 = 65536;
            }
            i12 |= i21;
        } else {
            richTooltipContainerShape = shape;
        }
        if ((i10 & 3670016) != 0) {
            if ((i11 & 64) == 0) {
                i20 = 524288;
            } else {
                i20 = 524288;
            }
            i12 |= i20;
        }
        if ((i11 & 128) != 0) {
            if ((29360128 & i10) == 0) {
                if (composerStartRestartGroup.changedInstance(content)) {
                    i19 = 8388608;
                } else {
                    i19 = 4194304;
                }
            }
            if ((23967451 & i12) == 4793490) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RichTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        richTooltipState2 = (RichTooltipState) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RichTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        richTooltipState2 = (RichTooltipState) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                    }
                }
                Modifier modifier1111114 = modifier2;
                Function2<? super Composer, ? super Integer, Unit> function1111119 = function4;
                Shape shape1111113 = richTooltipContainerShape;
                function6 = function5;
                richTooltipState3 = richTooltipState2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                }
                iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                l0.x2 x2Var1111111 = (l0.x2) objRememberedValue2;
                int i21111111111113 = i12 >> 6;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new c(richTooltipState3, function6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new c(richTooltipState3, function6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                int i21111111111114 = i12 << 3;
                a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function1111119, function6, i12)), x2Var1111111, modifier1111114, shape1111113, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i21111111111114 & 234881024) | ((i12 << 6) & 57344) | (i21111111111113 & 7168) | (i21111111111114 & 896) | 14155830);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1111114;
                function7 = function1111119;
                shape2 = shape1111113;
                richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                function8 = function6;
                richTooltipState4 = richTooltipState3;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RichTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        richTooltipState2 = (RichTooltipState) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                    }
                } else {
                    if (i22 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if (i13 != 0) {
                        composerStartRestartGroup.startReplaceableGroup(-492369756);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new RichTooltipState();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceableGroup();
                        richTooltipState2 = (RichTooltipState) objRememberedValue;
                    }
                    if (i15 != 0) {
                        function4 = null;
                    }
                    if (i17 != 0) {
                        function5 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                    } else {
                        richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                    }
                }
                Modifier modifier1111115 = modifier2;
                Function2<? super Composer, ? super Integer, Unit> function11111110 = function4;
                Shape shape1111114 = richTooltipContainerShape;
                function6 = function5;
                richTooltipState3 = richTooltipState2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
                }
                iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                l0.x2 x2Var1111112 = (l0.x2) objRememberedValue2;
                int i21111111111115 = i12 >> 6;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue3 = new c(richTooltipState3, function6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                } else {
                    objRememberedValue3 = new c(richTooltipState3, function6);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
                int i21111111111116 = i12 << 3;
                a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function11111110, function6, i12)), x2Var1111112, modifier1111115, shape1111114, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i21111111111116 & 234881024) | ((i12 << 6) & 57344) | (i21111111111115 & 7168) | (i21111111111116 & 896) | 14155830);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier1111115;
                function7 = function11111110;
                shape2 = shape1111114;
                richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
                function8 = function6;
                richTooltipState4 = richTooltipState3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
        }
        i19 = 12582912;
        i12 |= i19;
        if ((23967451 & i12) == 4793490) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new RichTooltipState();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                }
                if (i15 != 0) {
                    function4 = null;
                }
                if (i17 != 0) {
                    function5 = null;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                } else {
                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                }
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new RichTooltipState();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                }
                if (i15 != 0) {
                    function4 = null;
                }
                if (i17 != 0) {
                    function5 = null;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                } else {
                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                }
            }
            Modifier modifier1111116 = modifier2;
            Function2<? super Composer, ? super Integer, Unit> function11111111 = function4;
            Shape shape1111115 = richTooltipContainerShape;
            function6 = function5;
            richTooltipState3 = richTooltipState2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
            }
            iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            l0.x2 x2Var1111113 = (l0.x2) objRememberedValue2;
            int i21111111111117 = i12 >> 6;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = new c(richTooltipState3, function6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new c(richTooltipState3, function6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
            int i21111111111118 = i12 << 3;
            a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function11111111, function6, i12)), x2Var1111113, modifier1111116, shape1111115, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i21111111111118 & 234881024) | ((i12 << 6) & 57344) | (i21111111111117 & 7168) | (i21111111111118 & 896) | 14155830);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier1111116;
            function7 = function11111111;
            shape2 = shape1111115;
            richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
            function8 = function6;
            richTooltipState4 = richTooltipState3;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new RichTooltipState();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                }
                if (i15 != 0) {
                    function4 = null;
                }
                if (i17 != 0) {
                    function5 = null;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                } else {
                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                }
            } else {
                if (i22 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (i13 != 0) {
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new RichTooltipState();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    richTooltipState2 = (RichTooltipState) objRememberedValue;
                }
                if (i15 != 0) {
                    function4 = null;
                }
                if (i17 != 0) {
                    function5 = null;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    richTooltipContainerShape = TooltipDefaults.INSTANCE.getRichTooltipContainerShape(composerStartRestartGroup, 6);
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    richTooltipColorsM1488richTooltipColorsro_MJ88 = TooltipDefaults.INSTANCE.m1488richTooltipColorsro_MJ88(0L, 0L, 0L, 0L, composerStartRestartGroup, 24576, 15);
                } else {
                    richTooltipColorsM1488richTooltipColorsro_MJ88 = richTooltipColors;
                }
            }
            Modifier modifier1111117 = modifier2;
            Function2<? super Composer, ? super Integer, Unit> function11111112 = function4;
            Shape shape1111116 = richTooltipContainerShape;
            function6 = function5;
            richTooltipState3 = richTooltipState2;
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(180959998, i12, -1, "androidx.compose.material3.RichTooltipBox (Tooltip.kt:148)");
            }
            iMo413roundToPx0680j_4 = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo413roundToPx0680j_4(f12525a);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new l0.x2(iMo413roundToPx0680j_4);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            l0.x2 x2Var1111114 = (l0.x2) objRememberedValue2;
            int i21111111111119 = i12 >> 6;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(richTooltipState3) | composerStartRestartGroup.changed(function6);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue3 = new c(richTooltipState3, function6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            } else {
                objRememberedValue3 = new c(richTooltipState3, function6);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.SideEffect((Function0) objRememberedValue3, composerStartRestartGroup, 0);
            int i211111111111110 = i12 << 3;
            a(ComposableLambdaKt.composableLambda(composerStartRestartGroup, 1423372873, true, new d(richTooltipColorsM1488richTooltipColorsro_MJ88, text, function11111112, function6, i12)), x2Var1111114, modifier1111117, shape1111116, richTooltipState3, richTooltipColorsM1488richTooltipColorsro_MJ88.getContainerColor(), RichTooltipTokens.INSTANCE.m1921getContainerElevationD9Ej5fM(), f12531g, content, composerStartRestartGroup, (i211111111111110 & 234881024) | ((i12 << 6) & 57344) | (i21111111111119 & 7168) | (i211111111111110 & 896) | 14155830);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier1111117;
            function7 = function11111112;
            shape2 = shape1111116;
            richTooltipColors2 = richTooltipColorsM1488richTooltipColorsro_MJ88;
            function8 = function6;
            richTooltipState4 = richTooltipState3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new e(text, modifier3, richTooltipState4, function7, function8, shape2, richTooltipColors2, content, i10, i11));
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void a(Function2<? super Composer, ? super Integer, Unit> function2, PopupPositionProvider popupPositionProvider, Modifier modifier, Shape shape, final TooltipState tooltipState, long j10, float f6, float f10, Function3<? super TooltipBoxScope, ? super Composer, ? super Integer, Unit> function3, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1415647894);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changed(popupPositionProvider) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changed(shape) ? 2048 : 1024;
        }
        if ((57344 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(tooltipState) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(j10) ? 131072 : 65536;
        }
        if ((3670016 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(f6) ? 1048576 : 524288;
        }
        if ((29360128 & i10) == 0) {
            i11 |= composerStartRestartGroup.changed(f10) ? 8388608 : 4194304;
        }
        if ((234881024 & i10) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((191739611 & i11) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1415647894, i11, -1, "androidx.compose.material3.TooltipBox (Tooltip.kt:188)");
            }
            Object objB = androidx.databinding.c.b(composerStartRestartGroup, 773894976, -492369756);
            Composer.Companion companion = Composer.INSTANCE;
            if (objB == companion.getEmpty()) {
                objB = androidx.camera.camera2.internal.compat.u.d(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, composerStartRestartGroup), composerStartRestartGroup);
            }
            composerStartRestartGroup.endReplaceableGroup();
            final CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) objB).getCoroutineScope();
            composerStartRestartGroup.endReplaceableGroup();
            Strings.Companion companion2 = Strings.INSTANCE;
            final String strM1320getStringNWtq28 = Strings_androidKt.m1320getStringNWtq28(companion2.m1318getTooltipLongPressLabeladMyvUU(), composerStartRestartGroup, 6);
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new TooltipBoxScope() { // from class: androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1

                    /* JADX INFO: compiled from: Tooltip.kt */
                    @DebugMetadata(c = "androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1", f = "Tooltip.kt", i = {}, l = {ErrorCodes.ERR_CRY_BAD_BLOCK_SIZE}, m = "invokeSuspend", n = {}, s = {})
                    public static final class a extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

                        /* JADX INFO: renamed from: p0, reason: collision with root package name */
                        public int f12540p0;

                        /* JADX INFO: renamed from: q0, reason: collision with root package name */
                        public /* synthetic */ Object f12541q0;

                        /* JADX INFO: renamed from: r0, reason: collision with root package name */
                        public final /* synthetic */ Function0<Job> f12542r0;

                        /* JADX INFO: renamed from: androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$a$a, reason: collision with other inner class name */
                        /* JADX INFO: compiled from: Tooltip.kt */
                        @DebugMetadata(c = "androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1$1", f = "Tooltip.kt", i = {0, 0, 0, 1, 1}, l = {217, 221, 229}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "pass", "longPressTimeout", "$this$awaitEachGesture", "pass"}, s = {"L$0", "L$1", "J$0", "L$0", "L$1"})
                        @SourceDebugExtension({"SMAP\nTooltip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,770:1\n1855#2,2:771\n*S KotlinDebug\n*F\n+ 1 Tooltip.kt\nandroidx/compose/material3/TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1$1\n*L\n230#1:771,2\n*E\n"})
                        public static final class C0054a extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

                            /* JADX INFO: renamed from: p0, reason: collision with root package name */
                            public PointerEventPass f12543p0;

                            /* JADX INFO: renamed from: q0, reason: collision with root package name */
                            public long f12544q0;

                            /* JADX INFO: renamed from: r0, reason: collision with root package name */
                            public int f12545r0;

                            /* JADX INFO: renamed from: s0, reason: collision with root package name */
                            public /* synthetic */ Object f12546s0;

                            /* JADX INFO: renamed from: t0, reason: collision with root package name */
                            public final /* synthetic */ Function0<Job> f12547t0;

                            /* JADX INFO: renamed from: androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$a$a$a, reason: collision with other inner class name */
                            /* JADX INFO: compiled from: Tooltip.kt */
                            @DebugMetadata(c = "androidx.compose.material3.TooltipKt$TooltipBox$scope$1$1$tooltipAnchor$1$1$1", f = "Tooltip.kt", i = {}, l = {222}, m = "invokeSuspend", n = {}, s = {})
                            public static final class C0055a extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super PointerInputChange>, Object> {

                                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                                public int f12548p0;

                                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                                public /* synthetic */ Object f12549q0;

                                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                                public final /* synthetic */ PointerEventPass f12550r0;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public C0055a(PointerEventPass pointerEventPass, Continuation<? super C0055a> continuation) {
                                    super(2, continuation);
                                    this.f12550r0 = pointerEventPass;
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                    C0055a c0055a = new C0055a(this.f12550r0, continuation);
                                    c0055a.f12549q0 = obj;
                                    return c0055a;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super PointerInputChange> continuation) {
                                    return ((C0055a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object obj) {
                                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                                    int i10 = this.f12548p0;
                                    if (i10 == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.f12549q0;
                                        this.f12548p0 = 1;
                                        obj = TapGestureDetectorKt.waitForUpOrCancellation(awaitPointerEventScope, this.f12550r0, this);
                                        if (obj == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i10 != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return obj;
                                }
                            }

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            public C0054a(Function0<? extends Job> function0, Continuation<? super C0054a> continuation) {
                                super(2, continuation);
                                this.f12547t0 = function0;
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @NotNull
                            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                                C0054a c0054a = new C0054a(this.f12547t0, continuation);
                                c0054a.f12546s0 = obj;
                                return c0054a;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                                return ((C0054a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                            }

                            /* JADX WARN: Code duplicated, block: B:24:0x0082 A[RETURN] */
                            /* JADX WARN: Code duplicated, block: B:28:0x0095 A[LOOP:0: B:26:0x008f->B:28:0x0095, LOOP_END] */
                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @Nullable
                            public final Object invokeSuspend(@NotNull Object obj) {
                                AwaitPointerEventScope awaitPointerEventScope;
                                PointerEventPass pointerEventPass;
                                long j10;
                                AwaitPointerEventScope awaitPointerEventScope2;
                                Iterator<T> it;
                                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                                int i10 = this.f12545r0;
                                try {
                                    if (i10 != 0) {
                                        if (i10 == 1) {
                                            j10 = this.f12544q0;
                                            pointerEventPass = this.f12543p0;
                                            AwaitPointerEventScope awaitPointerEventScope3 = (AwaitPointerEventScope) this.f12546s0;
                                            ResultKt.throwOnFailure(obj);
                                            awaitPointerEventScope = awaitPointerEventScope3;
                                        } else if (i10 == 2) {
                                            pointerEventPass = this.f12543p0;
                                            awaitPointerEventScope2 = (AwaitPointerEventScope) this.f12546s0;
                                            try {
                                                ResultKt.throwOnFailure(obj);
                                            } catch (PointerEventTimeoutCancellationException unused) {
                                                this.f12547t0.invoke();
                                                this.f12546s0 = null;
                                                this.f12543p0 = null;
                                                this.f12545r0 = 3;
                                                obj = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, this);
                                                if (obj == coroutine_suspended) {
                                                    return coroutine_suspended;
                                                }
                                                it = ((PointerEvent) obj).getChanges().iterator();
                                                while (it.hasNext()) {
                                                    ((PointerInputChange) it.next()).consume();
                                                }
                                            }
                                        } else {
                                            if (i10 != 3) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            ResultKt.throwOnFailure(obj);
                                            it = ((PointerEvent) obj).getChanges().iterator();
                                            while (it.hasNext()) {
                                                ((PointerInputChange) it.next()).consume();
                                            }
                                        }
                                        return Unit.INSTANCE;
                                    }
                                    ResultKt.throwOnFailure(obj);
                                    awaitPointerEventScope = (AwaitPointerEventScope) this.f12546s0;
                                    long longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                                    pointerEventPass = PointerEventPass.Initial;
                                    this.f12546s0 = awaitPointerEventScope;
                                    this.f12543p0 = pointerEventPass;
                                    this.f12544q0 = longPressTimeoutMillis;
                                    this.f12545r0 = 1;
                                    if (TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, pointerEventPass, this, 1, null) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    j10 = longPressTimeoutMillis;
                                    C0055a c0055a = new C0055a(pointerEventPass, null);
                                    this.f12546s0 = awaitPointerEventScope;
                                    this.f12543p0 = pointerEventPass;
                                    this.f12545r0 = 2;
                                    if (awaitPointerEventScope.withTimeout(j10, c0055a, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } catch (PointerEventTimeoutCancellationException unused2) {
                                    awaitPointerEventScope2 = awaitPointerEventScope;
                                    this.f12547t0.invoke();
                                    this.f12546s0 = null;
                                    this.f12543p0 = null;
                                    this.f12545r0 = 3;
                                    obj = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass, this);
                                    if (obj == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    it = ((PointerEvent) obj).getChanges().iterator();
                                    while (it.hasNext()) {
                                        ((PointerInputChange) it.next()).consume();
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        public a(Function0<? extends Job> function0, Continuation<? super a> continuation) {
                            super(2, continuation);
                            this.f12542r0 = function0;
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @NotNull
                        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                            a aVar = new a(this.f12542r0, continuation);
                            aVar.f12541q0 = obj;
                            return aVar;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                            return ((a) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
                        }

                        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                        @Nullable
                        public final Object invokeSuspend(@NotNull Object obj) {
                            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                            int i10 = this.f12540p0;
                            if (i10 == 0) {
                                ResultKt.throwOnFailure(obj);
                                PointerInputScope pointerInputScope = (PointerInputScope) this.f12541q0;
                                C0054a c0054a = new C0054a(this.f12542r0, null);
                                this.f12540p0 = 1;
                                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, c0054a, this) == coroutine_suspended) {
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

                    /* JADX INFO: compiled from: Tooltip.kt */
                    public static final class b extends Lambda implements Function1<SemanticsPropertyReceiver, Unit> {

                        /* JADX INFO: renamed from: p0, reason: collision with root package name */
                        public final /* synthetic */ String f12551p0;

                        /* JADX INFO: renamed from: q0, reason: collision with root package name */
                        public final /* synthetic */ Function0<Job> f12552q0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public b(String str, c cVar) {
                            super(1);
                            this.f12551p0 = str;
                            this.f12552q0 = cVar;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Unit invoke(SemanticsPropertyReceiver semanticsPropertyReceiver) {
                            SemanticsPropertyReceiver semantics = semanticsPropertyReceiver;
                            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
                            SemanticsPropertiesKt.onLongClick(semantics, this.f12551p0, new h5(this.f12552q0));
                            return Unit.INSTANCE;
                        }
                    }

                    /* JADX INFO: compiled from: Tooltip.kt */
                    public static final class c extends Lambda implements Function0<Job> {

                        /* JADX INFO: renamed from: p0, reason: collision with root package name */
                        public final /* synthetic */ CoroutineScope f12553p0;

                        /* JADX INFO: renamed from: q0, reason: collision with root package name */
                        public final /* synthetic */ TooltipState f12554q0;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        public c(TooltipState tooltipState, CoroutineScope coroutineScope) {
                            super(0);
                            this.f12553p0 = coroutineScope;
                            this.f12554q0 = tooltipState;
                        }

                        @Override // kotlin.jvm.functions.Function0
                        public final Job invoke() {
                            return BuildersKt__Builders_commonKt.launch$default(this.f12553p0, null, null, new i5(this.f12554q0, null), 3, null);
                        }
                    }

                    @Override // androidx.compose.material3.TooltipBoxScope
                    @NotNull
                    public Modifier tooltipAnchor(@NotNull Modifier modifier2) {
                        Intrinsics.checkNotNullParameter(modifier2, "<this>");
                        CoroutineScope coroutineScope2 = coroutineScope;
                        TooltipState tooltipState2 = tooltipState;
                        c cVar = new c(tooltipState2, coroutineScope2);
                        return SemanticsModifierKt.semantics(SuspendingPointerInputFilterKt.pointerInput(modifier2, tooltipState2, new a(cVar, null)), true, new b(strM1320getStringNWtq28, cVar));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            TooltipKt$TooltipBox$scope$1$1 tooltipKt$TooltipBox$scope$1$1 = (TooltipKt$TooltipBox$scope$1$1) objRememberedValue;
            composerStartRestartGroup.startReplaceableGroup(733328855);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf = LayoutKt.materializerOf(companion3);
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
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion4, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, density));
            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion4, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            Transition transitionUpdateTransition = TransitionKt.updateTransition(Boolean.valueOf(tooltipState.isVisible()), "Tooltip transition", composerStartRestartGroup, 48, 0);
            composerStartRestartGroup.startReplaceableGroup(-1995827526);
            if (((Boolean) transitionUpdateTransition.getCurrentState()).booleanValue() || ((Boolean) transitionUpdateTransition.getTargetState()).booleanValue()) {
                TooltipPopup_androidKt.TooltipPopup(popupPositionProvider, new f(tooltipState, coroutineScope), ComposableLambdaKt.composableLambda(composerStartRestartGroup, -442150991, true, new g(modifier, f10, transitionUpdateTransition, Strings_androidKt.m1320getStringNWtq28(companion2.m1319getTooltipPaneDescriptionadMyvUU(), composerStartRestartGroup, 6), shape, j10, f6, function2, i11)), composerStartRestartGroup, ((i11 >> 3) & 14) | BluetoothState.REQUEST_CONNECT_DEVICE);
            }
            composerStartRestartGroup.endReplaceableGroup();
            function3.invoke(tooltipKt$TooltipBox$scope$1$1, composerStartRestartGroup, Integer.valueOf(((i11 >> 21) & 112) | 6));
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new h(function2, popupPositionProvider, modifier, shape, tooltipState, j10, f6, f10, function3, i10));
    }

    /* JADX INFO: renamed from: access$PlainTooltipImpl-Iv8Zu3U, reason: not valid java name */
    public static final void m1490access$PlainTooltipImplIv8Zu3U(long j10, Function2 function2, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(893340370);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(j10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i11 & 91) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(893340370, i11, -1, "androidx.compose.material3.PlainTooltipImpl (Tooltip.kt:280)");
            }
            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, f12530f);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC = androidx.databinding.f.c(Alignment.INSTANCE, false, composerStartRestartGroup, 0, -1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion, composerM2074constructorimpl, measurePolicyC, composerM2074constructorimpl, density));
            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(j10)), TextKt.getLocalTextStyle().provides(TypographyKt.fromToken(MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, 6), PlainTooltipTokens.INSTANCE.getSupportingTextFont()))}, (Function2<? super Composer, ? super Integer, Unit>) function2, composerStartRestartGroup, (i11 & 112) | 8);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new n5(j10, function2, i10));
    }

    public static final void access$RichTooltipImpl(RichTooltipColors richTooltipColors, Function2 function2, Function2 function3, Function2 function4, Composer composer, int i10) {
        int i11;
        Composer composerStartRestartGroup = composer.startRestartGroup(-878950288);
        if ((i10 & 14) == 0) {
            i11 = (composerStartRestartGroup.changed(richTooltipColors) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function2) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function3) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i11 |= composerStartRestartGroup.changedInstance(function4) ? 2048 : 1024;
        }
        if ((i11 & 5851) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-878950288, i11, -1, "androidx.compose.material3.RichTooltipImpl (Tooltip.kt:296)");
            }
            MaterialTheme materialTheme = MaterialTheme.INSTANCE;
            Typography typography = materialTheme.getTypography(composerStartRestartGroup, 6);
            RichTooltipTokens richTooltipTokens = RichTooltipTokens.INSTANCE;
            TextStyle textStyleFromToken = TypographyKt.fromToken(typography, richTooltipTokens.getActionLabelTextFont());
            TextStyle textStyleFromToken2 = TypographyKt.fromToken(materialTheme.getTypography(composerStartRestartGroup, 6), richTooltipTokens.getSubheadFont());
            TextStyle textStyleFromToken3 = TypographyKt.fromToken(materialTheme.getTypography(composerStartRestartGroup, 6), richTooltipTokens.getSupportingTextFont());
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierM298paddingVpY3zN4$default = PaddingKt.m298paddingVpY3zN4$default(companion, f12532h, 0.0f, 2, null);
            composerStartRestartGroup.startReplaceableGroup(-483455358);
            Arrangement.Vertical top = Arrangement.INSTANCE.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyA = androidx.camera.core.impl.v.a(companion2, top, composerStartRestartGroup, 0, -1323940314);
            Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
            Updater.m2081setimpl(composerM2074constructorimpl, layoutDirection, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl, measurePolicyA, composerM2074constructorimpl, density));
            ai.a.j(0, function3MaterializerOf, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl, viewConfiguration, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceableGroup(51873568);
            if (function3 != null) {
                Modifier modifierM234paddingFromBaselineVpY3zN4$default = AlignmentLineKt.m234paddingFromBaselineVpY3zN4$default(companion, f12533i, 0.0f, 2, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC = androidx.databinding.f.c(companion2, false, composerStartRestartGroup, 0, -1323940314);
                Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection2 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration2 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf2 = LayoutKt.materializerOf(modifierM234paddingFromBaselineVpY3zN4$default);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor2);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl2 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl2, layoutDirection2, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl2, measurePolicyC, composerM2074constructorimpl2, density2));
                ai.a.j(0, function3MaterializerOf2, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl2, viewConfiguration2, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(richTooltipColors.getTitleContentColor())), TextKt.getLocalTextStyle().provides(textStyleFromToken2)}, (Function2<? super Composer, ? super Integer, Unit>) function3, composerStartRestartGroup, 8);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceableGroup();
            Modifier modifierM300paddingqDBjuR0$default = ((function3 != null) || (function4 != null)) ? PaddingKt.m300paddingqDBjuR0$default(AlignmentLineKt.m234paddingFromBaselineVpY3zN4$default(companion, f12534j, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, f12535k, 7, null) : PaddingKt.m298paddingVpY3zN4$default(companion, 0.0f, f12529e, 1, null);
            composerStartRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy measurePolicyC2 = androidx.databinding.f.c(companion2, false, composerStartRestartGroup, 0, -1323940314);
            Density density3 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf3 = LayoutKt.materializerOf(modifierM300paddingqDBjuR0$default);
            if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            composerStartRestartGroup.disableReusing();
            Composer composerM2074constructorimpl3 = Updater.m2074constructorimpl(composerStartRestartGroup);
            Updater.m2081setimpl(composerM2074constructorimpl3, layoutDirection3, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl3, measurePolicyC2, composerM2074constructorimpl3, density3));
            ai.a.j(0, function3MaterializerOf3, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl3, viewConfiguration3, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
            BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(richTooltipColors.getContentColor())), TextKt.getLocalTextStyle().provides(textStyleFromToken3)}, (Function2<? super Composer, ? super Integer, Unit>) function2, composerStartRestartGroup, (i11 & 112) | 8);
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.endReplaceableGroup();
            composerStartRestartGroup.startReplaceableGroup(75391440);
            if (function4 != null) {
                Modifier modifierM300paddingqDBjuR0$default2 = PaddingKt.m300paddingqDBjuR0$default(SizeKt.m326requiredHeightInVpY3zN4$default(companion, f12536l, 0.0f, 2, null), 0.0f, 0.0f, 0.0f, m, 7, null);
                composerStartRestartGroup.startReplaceableGroup(733328855);
                MeasurePolicy measurePolicyC3 = androidx.databinding.f.c(companion2, false, composerStartRestartGroup, 0, -1323940314);
                Density density4 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                LayoutDirection layoutDirection4 = (LayoutDirection) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
                ViewConfiguration viewConfiguration4 = (ViewConfiguration) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3MaterializerOf4 = LayoutKt.materializerOf(modifierM300paddingqDBjuR0$default2);
                if (!(composerStartRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor4);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerStartRestartGroup.disableReusing();
                Composer composerM2074constructorimpl4 = Updater.m2074constructorimpl(composerStartRestartGroup);
                Updater.m2081setimpl(composerM2074constructorimpl4, layoutDirection4, (Function2<? super T, ? super LayoutDirection, Unit>) l0.a.a(companion3, composerM2074constructorimpl4, measurePolicyC3, composerM2074constructorimpl4, density4));
                ai.a.j(0, function3MaterializerOf4, androidx.appcompat.widget.g0.b(companion3, composerM2074constructorimpl4, viewConfiguration4, composerStartRestartGroup, composerStartRestartGroup), composerStartRestartGroup, 2058660585);
                CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2498boximpl(richTooltipColors.getActionContentColor())), TextKt.getLocalTextStyle().provides(textStyleFromToken)}, (Function2<? super Composer, ? super Integer, Unit>) function4, composerStartRestartGroup, 8);
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.endReplaceableGroup();
                composerStartRestartGroup.endReplaceableGroup();
                Unit unit2 = Unit.INSTANCE;
            }
            if (androidx.databinding.e.e(composerStartRestartGroup)) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new o5(richTooltipColors, function2, function3, function4, i10));
    }

    public static final Modifier access$animateTooltip(Modifier modifier, final Transition transition) {
        return ComposedModifierKt.composed(modifier, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.material3.TooltipKt$animateTooltip$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                androidx.activity.a.c(inspectorInfo, "$this$null", "animateTooltip").set(ConstantsKt.TRANSITION_EXTRA_ID, transition);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }
        } : InspectableValueKt.getNoInspectorInfo(), new r5(transition));
    }

    public static final float getRichTooltipHorizontalPadding() {
        return f12532h;
    }

    public static final float getTooltipMinHeight() {
        return f12526b;
    }

    public static final float getTooltipMinWidth() {
        return f12527c;
    }
}
