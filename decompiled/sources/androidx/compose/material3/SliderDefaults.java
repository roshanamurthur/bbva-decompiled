package androidx.compose.material3;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.DragInteraction;
import androidx.compose.foundation.interaction.Interaction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.material.ripple.RippleKt;
import androidx.compose.material3.tokens.SliderTokens;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.PointMode;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Slider.kt */
/* JADX INFO: loaded from: classes.dex */
@Stable
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JE\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\u0014Jy\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00162\b\b\u0002\u0010\u0017\u001a\u00020\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00162\b\b\u0002\u0010\u0019\u001a\u00020\u00162\b\b\u0002\u0010\u001a\u001a\u00020\u00162\b\b\u0002\u0010\u001b\u001a\u00020\u00162\b\b\u0002\u0010\u001c\u001a\u00020\u00162\b\b\u0002\u0010\u001d\u001a\u00020\u00162\b\b\u0002\u0010\u001e\u001a\u00020\u00162\b\b\u0002\u0010\u001f\u001a\u00020\u0016H\u0007ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b \u0010!\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006\""}, d2 = {"Landroidx/compose/material3/SliderDefaults;", "", "()V", "Thumb", "", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "modifier", "Landroidx/compose/ui/Modifier;", "colors", "Landroidx/compose/material3/SliderColors;", "enabled", "", "thumbSize", "Landroidx/compose/ui/unit/DpSize;", "Thumb-9LiSoMs", "(Landroidx/compose/foundation/interaction/MutableInteractionSource;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZJLandroidx/compose/runtime/Composer;II)V", "Track", "sliderPositions", "Landroidx/compose/material3/SliderPositions;", "(Landroidx/compose/material3/SliderPositions;Landroidx/compose/ui/Modifier;Landroidx/compose/material3/SliderColors;ZLandroidx/compose/runtime/Composer;II)V", "thumbColor", "Landroidx/compose/ui/graphics/Color;", "activeTrackColor", "activeTickColor", "inactiveTrackColor", "inactiveTickColor", "disabledThumbColor", "disabledActiveTrackColor", "disabledActiveTickColor", "disabledInactiveTrackColor", "disabledInactiveTickColor", "colors-q0g_0yA", "(JJJJJJJJJJLandroidx/compose/runtime/Composer;III)Landroidx/compose/material3/SliderColors;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1508:1\n25#2:1509\n50#2:1516\n49#2:1517\n83#2,3:1526\n1114#3,6:1510\n1114#3,6:1518\n1114#3,6:1529\n75#4:1524\n154#5:1525\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults\n*L\n958#1:1509\n959#1:1516\n959#1:1517\n1021#1:1526,3\n958#1:1510,6\n959#1:1518,6\n1021#1:1529,6\n986#1:1524\n990#1:1525\n*E\n"})
public final class SliderDefaults {
    public static final int $stable = 0;

    @NotNull
    public static final SliderDefaults INSTANCE = new SliderDefaults();

    /* JADX INFO: compiled from: Slider.kt */
    @DebugMetadata(c = "androidx.compose.material3.SliderDefaults$Thumb$1$1", f = "Slider.kt", i = {}, l = {960}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f11307p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f11308q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ SnapshotStateList<Interaction> f11309r0;

        /* JADX INFO: renamed from: androidx.compose.material3.SliderDefaults$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Slider.kt */
        public static final class C0053a implements FlowCollector<Interaction> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ SnapshotStateList<Interaction> f11310p0;

            public C0053a(SnapshotStateList<Interaction> snapshotStateList) {
                this.f11310p0 = snapshotStateList;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Interaction interaction, Continuation continuation) {
                Interaction interaction2 = interaction;
                boolean z10 = interaction2 instanceof PressInteraction.Press;
                SnapshotStateList<Interaction> snapshotStateList = this.f11310p0;
                if (z10) {
                    snapshotStateList.add(interaction2);
                } else if (interaction2 instanceof PressInteraction.Release) {
                    snapshotStateList.remove(((PressInteraction.Release) interaction2).getPress());
                } else if (interaction2 instanceof PressInteraction.Cancel) {
                    snapshotStateList.remove(((PressInteraction.Cancel) interaction2).getPress());
                } else if (interaction2 instanceof DragInteraction.Start) {
                    snapshotStateList.add(interaction2);
                } else if (interaction2 instanceof DragInteraction.Stop) {
                    snapshotStateList.remove(((DragInteraction.Stop) interaction2).getCom.adobe.marketing.mobile.EventDataKeys.Lifecycle.LIFECYCLE_START java.lang.String());
                } else if (interaction2 instanceof DragInteraction.Cancel) {
                    snapshotStateList.remove(((DragInteraction.Cancel) interaction2).getCom.adobe.marketing.mobile.EventDataKeys.Lifecycle.LIFECYCLE_START java.lang.String());
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(MutableInteractionSource mutableInteractionSource, SnapshotStateList<Interaction> snapshotStateList, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f11308q0 = mutableInteractionSource;
            this.f11309r0 = snapshotStateList;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f11308q0, this.f11309r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f11307p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                Flow<Interaction> interactions = this.f11308q0.getInteractions();
                C0053a c0053a = new C0053a(this.f11309r0);
                this.f11307p0 = 1;
                if (interactions.collect(c0053a, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: Slider.kt */
    public static final class b extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ MutableInteractionSource f11312q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11313r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ SliderColors f11314s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f11315t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ long f11316u0;
        public final /* synthetic */ int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ int f11317w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(MutableInteractionSource mutableInteractionSource, Modifier modifier, SliderColors sliderColors, boolean z10, long j10, int i10, int i11) {
            super(2);
            this.f11312q0 = mutableInteractionSource;
            this.f11313r0 = modifier;
            this.f11314s0 = sliderColors;
            this.f11315t0 = z10;
            this.f11316u0 = j10;
            this.v0 = i10;
            this.f11317w0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SliderDefaults.this.m1243Thumb9LiSoMs(this.f11312q0, this.f11313r0, this.f11314s0, this.f11315t0, this.f11316u0, composer, RecomposeScopeImplKt.updateChangedFlags(this.v0 | 1), this.f11317w0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Slider.kt */
    @SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults$Track$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1508:1\n10843#2:1509\n11093#2,3:1510\n11096#2,3:1520\n361#3,7:1513\n215#4:1523\n216#4:1528\n1549#5:1524\n1620#5,3:1525\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderDefaults$Track$1$1\n*L\n1055#1:1509\n1055#1:1510,3\n1055#1:1520,3\n1055#1:1513,7\n1058#1:1523\n1058#1:1528\n1060#1:1524\n1060#1:1525,3\n*E\n"})
    public static final class c extends Lambda implements Function1<DrawScope, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f11318p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SliderPositions f11319q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f11320r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f11321s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ State<Color> f11322t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(State<Color> state, SliderPositions sliderPositions, State<Color> state2, State<Color> state3, State<Color> state4) {
            super(1);
            this.f11318p0 = state;
            this.f11319q0 = sliderPositions;
            this.f11320r0 = state2;
            this.f11321s0 = state3;
            this.f11322t0 = state4;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(DrawScope drawScope) {
            DrawScope Canvas = drawScope;
            Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
            boolean z10 = Canvas.getLayoutDirection() == LayoutDirection.Rtl;
            long jOffset = OffsetKt.Offset(0.0f, Offset.m2276getYimpl(Canvas.mo2908getCenterF1C5BW0()));
            long jOffset2 = OffsetKt.Offset(Size.m2344getWidthimpl(Canvas.mo2909getSizeNHjbRc()), Offset.m2276getYimpl(Canvas.mo2908getCenterF1C5BW0()));
            long j10 = z10 ? jOffset2 : jOffset;
            long j11 = z10 ? jOffset : jOffset2;
            float fMo415toPx0680j_4 = Canvas.mo415toPx0680j_4(SliderKt.f11334e);
            float fMo415toPx0680j_5 = Canvas.mo415toPx0680j_4(SliderKt.getTrackHeight());
            long jM2518unboximpl = this.f11318p0.getValue().m2518unboximpl();
            StrokeCap.Companion companion = StrokeCap.INSTANCE;
            long j12 = j11;
            long j13 = j10;
            a1.b.C(Canvas, jM2518unboximpl, j10, j11, fMo415toPx0680j_5, companion.m2809getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            float fM2275getXimpl = Offset.m2275getXimpl(j13);
            float fM2275getXimpl2 = Offset.m2275getXimpl(j12) - Offset.m2275getXimpl(j13);
            SliderPositions sliderPositions = this.f11319q0;
            a1.b.C(Canvas, this.f11320r0.getValue().m2518unboximpl(), OffsetKt.Offset((sliderPositions.getActiveRange().getStart().floatValue() * (Offset.m2275getXimpl(j12) - Offset.m2275getXimpl(j13))) + Offset.m2275getXimpl(j13), Offset.m2276getYimpl(Canvas.mo2908getCenterF1C5BW0())), OffsetKt.Offset((sliderPositions.getActiveRange().getEndInclusive().floatValue() * fM2275getXimpl2) + fM2275getXimpl, Offset.m2276getYimpl(Canvas.mo2908getCenterF1C5BW0())), fMo415toPx0680j_5, companion.m2809getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
            float[] tickFractions = sliderPositions.getTickFractions();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int length = tickFractions.length;
            for (int i10 = 0; i10 < length; i10++) {
                float f6 = tickFractions[i10];
                Boolean boolValueOf = Boolean.valueOf(f6 > sliderPositions.getActiveRange().getEndInclusive().floatValue() || f6 < sliderPositions.getActiveRange().getStart().floatValue());
                Object arrayList = linkedHashMap.get(boolValueOf);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(boolValueOf, arrayList);
                }
                ((List) arrayList).add(Float.valueOf(f6));
            }
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry.getKey()).booleanValue();
                List list = (List) entry.getValue();
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Offset.m2264boximpl(OffsetKt.Offset(Offset.m2275getXimpl(OffsetKt.m2298lerpWko1d7g(j13, j12, ((Number) it.next()).floatValue())), Offset.m2276getYimpl(Canvas.mo2908getCenterF1C5BW0()))));
                }
                long j14 = j13;
                long j15 = j12;
                a1.b.H(Canvas, arrayList2, PointMode.INSTANCE.m2771getPointsr_lszbg(), (zBooleanValue ? this.f11321s0 : this.f11322t0).getValue().m2518unboximpl(), fMo415toPx0680j_4, StrokeCap.INSTANCE.m2809getRoundKaPHkGw(), null, 0.0f, null, 0, 480, null);
                j12 = j15;
                j13 = j14;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: Slider.kt */
    public static final class d extends Lambda implements Function2<Composer, Integer, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SliderPositions f11324q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Modifier f11325r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ SliderColors f11326s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ boolean f11327t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ int f11328u0;
        public final /* synthetic */ int v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(SliderPositions sliderPositions, Modifier modifier, SliderColors sliderColors, boolean z10, int i10, int i11) {
            super(2);
            this.f11324q0 = sliderPositions;
            this.f11325r0 = modifier;
            this.f11326s0 = sliderColors;
            this.f11327t0 = z10;
            this.f11328u0 = i10;
            this.v0 = i11;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Composer composer, Integer num) {
            num.intValue();
            SliderDefaults.this.Track(this.f11324q0, this.f11325r0, this.f11326s0, this.f11327t0, composer, RecomposeScopeImplKt.updateChangedFlags(this.f11328u0 | 1), this.v0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x016f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0175  */
    /* JADX WARN: Code duplicated, block: B:105:0x018f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0194  */
    /* JADX WARN: Code duplicated, block: B:110:0x01db  */
    /* JADX WARN: Code duplicated, block: B:113:0x0217  */
    /* JADX WARN: Code duplicated, block: B:118:0x0225  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0078  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:87:0x011b  */
    /* JADX WARN: Code duplicated, block: B:88:0x011e  */
    /* JADX WARN: Code duplicated, block: B:90:0x0122  */
    /* JADX WARN: Code duplicated, block: B:91:0x0128  */
    /* JADX WARN: Code duplicated, block: B:94:0x0133  */
    /* JADX WARN: Code duplicated, block: B:97:0x014b  */
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* JADX INFO: renamed from: Thumb-9LiSoMs, reason: not valid java name */
    public final void m1243Thumb9LiSoMs(@NotNull MutableInteractionSource interactionSource, @Nullable Modifier modifier, @Nullable SliderColors sliderColors, boolean z10, long j10, @Nullable Composer composer, int i10, int i11) {
        int i12;
        Modifier modifier2;
        SliderColors sliderColors2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        long j11;
        int i16;
        int i17;
        boolean z12;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotStateList snapshotStateList;
        boolean zChanged;
        Object objRememberedValue2;
        float fM4389constructorimpl;
        Modifier modifier3;
        SliderColors sliderColors3;
        long j12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer composerStartRestartGroup = composer.startRestartGroup(-290277409);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (composerStartRestartGroup.changed(interactionSource) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 112) == 0) {
                modifier2 = modifier;
                i12 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i10 & 896) == 0) {
                if ((i11 & 4) == 0) {
                    sliderColors2 = sliderColors;
                    int i19 = composerStartRestartGroup.changed(sliderColors2) ? 256 : 128;
                    i12 |= i19;
                } else {
                    sliderColors2 = sliderColors;
                }
                i12 |= i19;
            } else {
                sliderColors2 = sliderColors;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    z11 = z10;
                    if (composerStartRestartGroup.changed(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    i12 |= 24576;
                    j11 = j10;
                } else {
                    j11 = j10;
                    if ((57344 & i10) == 0) {
                        if (composerStartRestartGroup.changed(j11)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                }
                if ((i11 & 32) != 0) {
                    i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                } else if ((458752 & i10) == 0) {
                    if (composerStartRestartGroup.changed(this)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((374491 & i12) == 74898 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i10 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i18 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        if ((i11 & 4) != 0) {
                            SliderColors sliderColorsM1244colorsq0g_0yA = m1244colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, (i12 >> 15) & 14, 1023);
                            i12 &= -897;
                            sliderColors2 = sliderColorsM1244colorsq0g_0yA;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        } else {
                            z12 = z10;
                        }
                        if (i15 != 0) {
                            j11 = SliderKt.f11331b;
                        } else {
                            j11 = j10;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        z12 = z11;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:950)");
                    }
                    composerStartRestartGroup.startReplaceableGroup(-492369756);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotStateKt.mutableStateListOf();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    snapshotStateList = (SnapshotStateList) objRememberedValue;
                    int i20 = i12 & 14;
                    composerStartRestartGroup.startReplaceableGroup(511388516);
                    zChanged = composerStartRestartGroup.changed(interactionSource) | composerStartRestartGroup.changed(snapshotStateList);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new a(interactionSource, snapshotStateList, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceableGroup();
                    EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i20 | 64);
                    if (!snapshotStateList.isEmpty()) {
                        fM4389constructorimpl = SliderKt.f11333d;
                    } else {
                        fM4389constructorimpl = SliderKt.f11332c;
                    }
                    SliderTokens sliderTokens = SliderTokens.INSTANCE;
                    Shape shape = ShapesKt.toShape(sliderTokens.getHandleShape(), composerStartRestartGroup, 6);
                    long j13 = j11;
                    Modifier modifierHoverable$default = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m336size6HolHcs(modifier2, j11), interactionSource, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(sliderTokens.m1941getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4)), interactionSource, false, 2, null);
                    if (!z12) {
                        fM4389constructorimpl = Dp.m4389constructorimpl(0);
                    }
                    SpacerKt.Spacer(BackgroundKt.m121backgroundbw27NRU(ShadowKt.m2202shadows4CzXII$default(modifierHoverable$default, fM4389constructorimpl, shape, false, 0L, 0L, 24, null), sliderColors2.thumbColor$material3_release(z12, composerStartRestartGroup, ((i12 >> 3) & 112) | ((i12 >> 9) & 14)).getValue().m2518unboximpl(), shape), composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier2;
                    sliderColors3 = sliderColors2;
                    j12 = j13;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    sliderColors3 = sliderColors2;
                    z12 = z11;
                    j12 = j11;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                    return;
                }
                scopeUpdateScopeEndRestartGroup.updateScope(new b(interactionSource, modifier3, sliderColors3, z12, j12, i10, i11));
            }
            i12 |= 3072;
            z11 = z10;
            i15 = i11 & 16;
            if (i15 != 0) {
                i12 |= 24576;
                j11 = j10;
            } else {
                j11 = j10;
                if ((57344 & i10) == 0) {
                    if (composerStartRestartGroup.changed(j11)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
            }
            if ((i11 & 32) != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((458752 & i10) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        SliderColors sliderColorsM1244colorsq0g_0yA2 = m1244colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, (i12 >> 15) & 14, 1023);
                        i12 &= -897;
                        sliderColors2 = sliderColorsM1244colorsq0g_0yA2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if (i15 != 0) {
                        j11 = SliderKt.f11331b;
                    } else {
                        j11 = j10;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        SliderColors sliderColorsM1244colorsq0g_0yA3 = m1244colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, (i12 >> 15) & 14, 1023);
                        i12 &= -897;
                        sliderColors2 = sliderColorsM1244colorsq0g_0yA3;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if (i15 != 0) {
                        j11 = SliderKt.f11331b;
                    } else {
                        j11 = j10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:950)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                int i21 = i12 & 14;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(interactionSource) | composerStartRestartGroup.changed(snapshotStateList);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new a(interactionSource, snapshotStateList, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new a(interactionSource, snapshotStateList, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i21 | 64);
                if (!snapshotStateList.isEmpty()) {
                    fM4389constructorimpl = SliderKt.f11333d;
                } else {
                    fM4389constructorimpl = SliderKt.f11332c;
                }
                SliderTokens sliderTokens2 = SliderTokens.INSTANCE;
                Shape shape2 = ShapesKt.toShape(sliderTokens2.getHandleShape(), composerStartRestartGroup, 6);
                long j14 = j11;
                Modifier modifierHoverable$default2 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m336size6HolHcs(modifier2, j11), interactionSource, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(sliderTokens2.m1941getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4)), interactionSource, false, 2, null);
                if (!z12) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                SpacerKt.Spacer(BackgroundKt.m121backgroundbw27NRU(ShadowKt.m2202shadows4CzXII$default(modifierHoverable$default2, fM4389constructorimpl, shape2, false, 0L, 0L, 24, null), sliderColors2.thumbColor$material3_release(z12, composerStartRestartGroup, ((i12 >> 3) & 112) | ((i12 >> 9) & 14)).getValue().m2518unboximpl(), shape2), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                sliderColors3 = sliderColors2;
                j12 = j14;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        SliderColors sliderColorsM1244colorsq0g_0yA4 = m1244colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, (i12 >> 15) & 14, 1023);
                        i12 &= -897;
                        sliderColors2 = sliderColorsM1244colorsq0g_0yA4;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if (i15 != 0) {
                        j11 = SliderKt.f11331b;
                    } else {
                        j11 = j10;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        SliderColors sliderColorsM1244colorsq0g_0yA5 = m1244colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, (i12 >> 15) & 14, 1023);
                        i12 &= -897;
                        sliderColors2 = sliderColorsM1244colorsq0g_0yA5;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if (i15 != 0) {
                        j11 = SliderKt.f11331b;
                    } else {
                        j11 = j10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:950)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                int i22 = i12 & 14;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(interactionSource) | composerStartRestartGroup.changed(snapshotStateList);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new a(interactionSource, snapshotStateList, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new a(interactionSource, snapshotStateList, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i22 | 64);
                if (!snapshotStateList.isEmpty()) {
                    fM4389constructorimpl = SliderKt.f11333d;
                } else {
                    fM4389constructorimpl = SliderKt.f11332c;
                }
                SliderTokens sliderTokens3 = SliderTokens.INSTANCE;
                Shape shape3 = ShapesKt.toShape(sliderTokens3.getHandleShape(), composerStartRestartGroup, 6);
                long j15 = j11;
                Modifier modifierHoverable$default3 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m336size6HolHcs(modifier2, j11), interactionSource, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(sliderTokens3.m1941getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4)), interactionSource, false, 2, null);
                if (!z12) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                SpacerKt.Spacer(BackgroundKt.m121backgroundbw27NRU(ShadowKt.m2202shadows4CzXII$default(modifierHoverable$default3, fM4389constructorimpl, shape3, false, 0L, 0L, 24, null), sliderColors2.thumbColor$material3_release(z12, composerStartRestartGroup, ((i12 >> 3) & 112) | ((i12 >> 9) & 14)).getValue().m2518unboximpl(), shape3), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                sliderColors3 = sliderColors2;
                j12 = j15;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(interactionSource, modifier3, sliderColors3, z12, j12, i10, i11));
        }
        i12 |= 48;
        modifier2 = modifier;
        if ((i10 & 896) == 0) {
            if ((i11 & 4) == 0) {
                sliderColors2 = sliderColors;
                if (composerStartRestartGroup.changed(sliderColors2)) {
                }
                i12 |= i19;
            } else {
                sliderColors2 = sliderColors;
            }
            i12 |= i19;
        } else {
            sliderColors2 = sliderColors;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                z11 = z10;
                if (composerStartRestartGroup.changed(z11)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                i12 |= 24576;
                j11 = j10;
            } else {
                j11 = j10;
                if ((57344 & i10) == 0) {
                    if (composerStartRestartGroup.changed(j11)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
            }
            if ((i11 & 32) != 0) {
                i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
            } else if ((458752 & i10) == 0) {
                if (composerStartRestartGroup.changed(this)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((374491 & i12) == 74898) {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        SliderColors sliderColorsM1244colorsq0g_0yA6 = m1244colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, (i12 >> 15) & 14, 1023);
                        i12 &= -897;
                        sliderColors2 = sliderColorsM1244colorsq0g_0yA6;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if (i15 != 0) {
                        j11 = SliderKt.f11331b;
                    } else {
                        j11 = j10;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        SliderColors sliderColorsM1244colorsq0g_0yA7 = m1244colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, (i12 >> 15) & 14, 1023);
                        i12 &= -897;
                        sliderColors2 = sliderColorsM1244colorsq0g_0yA7;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if (i15 != 0) {
                        j11 = SliderKt.f11331b;
                    } else {
                        j11 = j10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:950)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                int i23 = i12 & 14;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(interactionSource) | composerStartRestartGroup.changed(snapshotStateList);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new a(interactionSource, snapshotStateList, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new a(interactionSource, snapshotStateList, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i23 | 64);
                if (!snapshotStateList.isEmpty()) {
                    fM4389constructorimpl = SliderKt.f11333d;
                } else {
                    fM4389constructorimpl = SliderKt.f11332c;
                }
                SliderTokens sliderTokens4 = SliderTokens.INSTANCE;
                Shape shape4 = ShapesKt.toShape(sliderTokens4.getHandleShape(), composerStartRestartGroup, 6);
                long j16 = j11;
                Modifier modifierHoverable$default4 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m336size6HolHcs(modifier2, j11), interactionSource, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(sliderTokens4.m1941getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4)), interactionSource, false, 2, null);
                if (!z12) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                SpacerKt.Spacer(BackgroundKt.m121backgroundbw27NRU(ShadowKt.m2202shadows4CzXII$default(modifierHoverable$default4, fM4389constructorimpl, shape4, false, 0L, 0L, 24, null), sliderColors2.thumbColor$material3_release(z12, composerStartRestartGroup, ((i12 >> 3) & 112) | ((i12 >> 9) & 14)).getValue().m2518unboximpl(), shape4), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                sliderColors3 = sliderColors2;
                j12 = j16;
            } else {
                composerStartRestartGroup.startDefaults();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        SliderColors sliderColorsM1244colorsq0g_0yA8 = m1244colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, (i12 >> 15) & 14, 1023);
                        i12 &= -897;
                        sliderColors2 = sliderColorsM1244colorsq0g_0yA8;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if (i15 != 0) {
                        j11 = SliderKt.f11331b;
                    } else {
                        j11 = j10;
                    }
                } else {
                    if (i18 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    if ((i11 & 4) != 0) {
                        SliderColors sliderColorsM1244colorsq0g_0yA9 = m1244colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, (i12 >> 15) & 14, 1023);
                        i12 &= -897;
                        sliderColors2 = sliderColorsM1244colorsq0g_0yA9;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    } else {
                        z12 = z10;
                    }
                    if (i15 != 0) {
                        j11 = SliderKt.f11331b;
                    } else {
                        j11 = j10;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:950)");
                }
                composerStartRestartGroup.startReplaceableGroup(-492369756);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotStateKt.mutableStateListOf();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceableGroup();
                snapshotStateList = (SnapshotStateList) objRememberedValue;
                int i24 = i12 & 14;
                composerStartRestartGroup.startReplaceableGroup(511388516);
                zChanged = composerStartRestartGroup.changed(interactionSource) | composerStartRestartGroup.changed(snapshotStateList);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    objRememberedValue2 = new a(interactionSource, snapshotStateList, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                } else {
                    objRememberedValue2 = new a(interactionSource, snapshotStateList, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceableGroup();
                EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i24 | 64);
                if (!snapshotStateList.isEmpty()) {
                    fM4389constructorimpl = SliderKt.f11333d;
                } else {
                    fM4389constructorimpl = SliderKt.f11332c;
                }
                SliderTokens sliderTokens5 = SliderTokens.INSTANCE;
                Shape shape5 = ShapesKt.toShape(sliderTokens5.getHandleShape(), composerStartRestartGroup, 6);
                long j17 = j11;
                Modifier modifierHoverable$default5 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m336size6HolHcs(modifier2, j11), interactionSource, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(sliderTokens5.m1941getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4)), interactionSource, false, 2, null);
                if (!z12) {
                    fM4389constructorimpl = Dp.m4389constructorimpl(0);
                }
                SpacerKt.Spacer(BackgroundKt.m121backgroundbw27NRU(ShadowKt.m2202shadows4CzXII$default(modifierHoverable$default5, fM4389constructorimpl, shape5, false, 0L, 0L, 24, null), sliderColors2.thumbColor$material3_release(z12, composerStartRestartGroup, ((i12 >> 3) & 112) | ((i12 >> 9) & 14)).getValue().m2518unboximpl(), shape5), composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier2;
                sliderColors3 = sliderColors2;
                j12 = j17;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                return;
            }
            scopeUpdateScopeEndRestartGroup.updateScope(new b(interactionSource, modifier3, sliderColors3, z12, j12, i10, i11));
        }
        i12 |= 3072;
        z11 = z10;
        i15 = i11 & 16;
        if (i15 != 0) {
            i12 |= 24576;
            j11 = j10;
        } else {
            j11 = j10;
            if ((57344 & i10) == 0) {
                if (composerStartRestartGroup.changed(j11)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
        }
        if ((i11 & 32) != 0) {
            i12 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((458752 & i10) == 0) {
            if (composerStartRestartGroup.changed(this)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i12 |= i17;
        }
        if ((374491 & i12) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i11 & 4) != 0) {
                    SliderColors sliderColorsM1244colorsq0g_0yA10 = m1244colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, (i12 >> 15) & 14, 1023);
                    i12 &= -897;
                    sliderColors2 = sliderColorsM1244colorsq0g_0yA10;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z10;
                }
                if (i15 != 0) {
                    j11 = SliderKt.f11331b;
                } else {
                    j11 = j10;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i11 & 4) != 0) {
                    SliderColors sliderColorsM1244colorsq0g_0yA11 = m1244colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, (i12 >> 15) & 14, 1023);
                    i12 &= -897;
                    sliderColors2 = sliderColorsM1244colorsq0g_0yA11;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z10;
                }
                if (i15 != 0) {
                    j11 = SliderKt.f11331b;
                } else {
                    j11 = j10;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:950)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            snapshotStateList = (SnapshotStateList) objRememberedValue;
            int i25 = i12 & 14;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(interactionSource) | composerStartRestartGroup.changed(snapshotStateList);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new a(interactionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new a(interactionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i25 | 64);
            if (!snapshotStateList.isEmpty()) {
                fM4389constructorimpl = SliderKt.f11333d;
            } else {
                fM4389constructorimpl = SliderKt.f11332c;
            }
            SliderTokens sliderTokens6 = SliderTokens.INSTANCE;
            Shape shape6 = ShapesKt.toShape(sliderTokens6.getHandleShape(), composerStartRestartGroup, 6);
            long j18 = j11;
            Modifier modifierHoverable$default6 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m336size6HolHcs(modifier2, j11), interactionSource, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(sliderTokens6.m1941getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4)), interactionSource, false, 2, null);
            if (!z12) {
                fM4389constructorimpl = Dp.m4389constructorimpl(0);
            }
            SpacerKt.Spacer(BackgroundKt.m121backgroundbw27NRU(ShadowKt.m2202shadows4CzXII$default(modifierHoverable$default6, fM4389constructorimpl, shape6, false, 0L, 0L, 24, null), sliderColors2.thumbColor$material3_release(z12, composerStartRestartGroup, ((i12 >> 3) & 112) | ((i12 >> 9) & 14)).getValue().m2518unboximpl(), shape6), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            sliderColors3 = sliderColors2;
            j12 = j18;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i11 & 4) != 0) {
                    SliderColors sliderColorsM1244colorsq0g_0yA12 = m1244colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, (i12 >> 15) & 14, 1023);
                    i12 &= -897;
                    sliderColors2 = sliderColorsM1244colorsq0g_0yA12;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z10;
                }
                if (i15 != 0) {
                    j11 = SliderKt.f11331b;
                } else {
                    j11 = j10;
                }
            } else {
                if (i18 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if ((i11 & 4) != 0) {
                    SliderColors sliderColorsM1244colorsq0g_0yA13 = m1244colorsq0g_0yA(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composerStartRestartGroup, 0, (i12 >> 15) & 14, 1023);
                    i12 &= -897;
                    sliderColors2 = sliderColorsM1244colorsq0g_0yA13;
                }
                if (i13 != 0) {
                    z12 = true;
                } else {
                    z12 = z10;
                }
                if (i15 != 0) {
                    j11 = SliderKt.f11331b;
                } else {
                    j11 = j10;
                }
            }
            composerStartRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-290277409, i12, -1, "androidx.compose.material3.SliderDefaults.Thumb (Slider.kt:950)");
            }
            composerStartRestartGroup.startReplaceableGroup(-492369756);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotStateKt.mutableStateListOf();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceableGroup();
            snapshotStateList = (SnapshotStateList) objRememberedValue;
            int i26 = i12 & 14;
            composerStartRestartGroup.startReplaceableGroup(511388516);
            zChanged = composerStartRestartGroup.changed(interactionSource) | composerStartRestartGroup.changed(snapshotStateList);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged) {
                objRememberedValue2 = new a(interactionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            } else {
                objRememberedValue2 = new a(interactionSource, snapshotStateList, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceableGroup();
            EffectsKt.LaunchedEffect(interactionSource, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, i26 | 64);
            if (!snapshotStateList.isEmpty()) {
                fM4389constructorimpl = SliderKt.f11333d;
            } else {
                fM4389constructorimpl = SliderKt.f11332c;
            }
            SliderTokens sliderTokens7 = SliderTokens.INSTANCE;
            Shape shape7 = ShapesKt.toShape(sliderTokens7.getHandleShape(), composerStartRestartGroup, 6);
            long j19 = j11;
            Modifier modifierHoverable$default7 = HoverableKt.hoverable$default(IndicationKt.indication(SizeKt.m336size6HolHcs(modifier2, j11), interactionSource, RippleKt.m900rememberRipple9IZ8Weo(false, Dp.m4389constructorimpl(sliderTokens7.m1941getStateLayerSizeD9Ej5fM() / 2), 0L, composerStartRestartGroup, 54, 4)), interactionSource, false, 2, null);
            if (!z12) {
                fM4389constructorimpl = Dp.m4389constructorimpl(0);
            }
            SpacerKt.Spacer(BackgroundKt.m121backgroundbw27NRU(ShadowKt.m2202shadows4CzXII$default(modifierHoverable$default7, fM4389constructorimpl, shape7, false, 0L, 0L, 24, null), sliderColors2.thumbColor$material3_release(z12, composerStartRestartGroup, ((i12 >> 3) & 112) | ((i12 >> 9) & 14)).getValue().m2518unboximpl(), shape7), composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier3 = modifier2;
            sliderColors3 = sliderColors2;
            j12 = j19;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
            return;
        }
        scopeUpdateScopeEndRestartGroup.updateScope(new b(interactionSource, modifier3, sliderColors3, z12, j12, i10, i11));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v2 ??, still in use, count: 1, list:
          (r14v2 ?? I:java.lang.Object) from 0x0183: INVOKE (r11v3 ?? I:androidx.compose.runtime.Composer), (r14v2 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:388)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    public final void Track(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r14v2 ??, still in use, count: 1, list:
          (r14v2 ?? I:java.lang.Object) from 0x0183: INVOKE (r11v3 ?? I:androidx.compose.runtime.Composer), (r14v2 ?? I:java.lang.Object) INTERFACE call: androidx.compose.runtime.Composer.updateRememberedValue(java.lang.Object):void A[MD:(java.lang.Object):void (m)] (LINE:388)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:59)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r35v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */

    @Composable
    @NotNull
    /* JADX INFO: renamed from: colors-q0g_0yA, reason: not valid java name */
    public final SliderColors m1244colorsq0g_0yA(long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, @Nullable Composer composer, int i10, int i11, int i12) {
        composer.startReplaceableGroup(885588574);
        long color = (i12 & 1) != 0 ? ColorSchemeKt.toColor(SliderTokens.INSTANCE.getHandleColor(), composer, 6) : j10;
        long color2 = (i12 & 2) != 0 ? ColorSchemeKt.toColor(SliderTokens.INSTANCE.getActiveTrackColor(), composer, 6) : j11;
        long jM2507copywmQWz5c$default = (i12 & 4) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksActiveContainerColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j12;
        long color3 = (i12 & 8) != 0 ? ColorSchemeKt.toColor(SliderTokens.INSTANCE.getInactiveTrackColor(), composer, 6) : j13;
        long jM2507copywmQWz5c$default2 = (i12 & 16) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksInactiveContainerColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long jM2553compositeOverOWjLjI = (i12 & 32) != 0 ? ColorKt.m2553compositeOverOWjLjI(Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getDisabledHandleColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null), MaterialTheme.INSTANCE.getColorScheme(composer, 6).m978getSurface0d7_KjU()) : j15;
        long jM2507copywmQWz5c$default3 = (i12 & 64) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getDisabledActiveTrackColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j16;
        long jM2507copywmQWz5c$default4 = (i12 & 128) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksDisabledContainerColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long jM2507copywmQWz5c$default5 = (i12 & 256) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getDisabledInactiveTrackColor(), composer, 6), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long jM2507copywmQWz5c$default6 = (i12 & 512) != 0 ? Color.m2507copywmQWz5c$default(ColorSchemeKt.toColor(SliderTokens.INSTANCE.getTickMarksDisabledContainerColor(), composer, 6), 0.38f, 0.0f, 0.0f, 0.0f, 14, null) : j19;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(885588574, i10, i11, "androidx.compose.material3.SliderDefaults.colors (Slider.kt:896)");
        }
        SliderColors sliderColors = new SliderColors(color, color2, jM2507copywmQWz5c$default, color3, jM2507copywmQWz5c$default2, jM2553compositeOverOWjLjI, jM2507copywmQWz5c$default3, jM2507copywmQWz5c$default4, jM2507copywmQWz5c$default5, jM2507copywmQWz5c$default6, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return sliderColors;
    }
}
