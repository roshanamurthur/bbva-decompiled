package androidx.compose.foundation;

import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import androidx.annotation.VisibleForTesting;
import androidx.compose.foundation.gestures.ForEachGestureKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidCanvas_androidKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerId;
import androidx.compose.ui.input.pointer.PointerInputScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.OnRemeasuredModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.InspectorInfo;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AndroidOverscroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010)\u001a\u00020(\u0012\u0006\u0010+\u001a\u00020*¢\u0006\u0004\b,\u0010-J9\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0006H\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJE\u0010\u0014\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\"\u0010\u0010\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\rH\u0096@ø\u0001\u0000ø\u0001\u0001ø\u0001\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\n\u0010\u0016\u001a\u00020\u0011*\u00020\u0015R(\u0010 \u001a\u00020\u00178\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010&\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006."}, d2 = {"Landroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect;", "Landroidx/compose/foundation/OverscrollEffect;", "Landroidx/compose/ui/geometry/Offset;", "delta", "Landroidx/compose/ui/input/nestedscroll/NestedScrollSource;", "source", "Lkotlin/Function1;", "performScroll", "applyToScroll-Rhakbz0", "(JILkotlin/jvm/functions/Function1;)J", "applyToScroll", "Landroidx/compose/ui/unit/Velocity;", "velocity", "Lkotlin/Function2;", "Lkotlin/coroutines/Continuation;", "", "performFling", "", "applyToFling-BMRW4eQ", "(JLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "applyToFling", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawOverscroll", "", "m", "Z", "getInvalidationEnabled$foundation_release", "()Z", "setInvalidationEnabled$foundation_release", "(Z)V", "getInvalidationEnabled$foundation_release$annotations", "()V", "invalidationEnabled", "Landroidx/compose/ui/Modifier;", "q", "Landroidx/compose/ui/Modifier;", "getEffectModifier", "()Landroidx/compose/ui/Modifier;", "effectModifier", "isInProgress", "Landroid/content/Context;", "context", "Landroidx/compose/foundation/OverscrollConfiguration;", "overscrollConfig", "<init>", "(Landroid/content/Context;Landroidx/compose/foundation/OverscrollConfiguration;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,589:1\n33#2,6:590\n101#2,2:597\n33#2,6:599\n103#2:605\n33#2,6:607\n135#3:596\n245#4:606\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect\n*L\n123#1:590,6\n266#1:597,2\n266#1:599,6\n266#1:605\n445#1:607,6\n341#1:596\n351#1:606\n*E\n"})
public final class AndroidEdgeEffectOverscrollEffect implements OverscrollEffect {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final OverscrollConfiguration f3251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public Offset f3252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final EdgeEffect f3253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final EdgeEffect f3254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final EdgeEffect f3255e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final EdgeEffect f3256f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final List<EdgeEffect> f3257g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final EdgeEffect f3258h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final EdgeEffect f3259i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final EdgeEffect f3260j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public final EdgeEffect f3261k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final MutableState<Unit> f3262l;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public boolean invalidationEnabled;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f3263n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f3264o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @Nullable
    public PointerId f3265p;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Modifier effectModifier;

    /* JADX INFO: compiled from: AndroidOverscroll.kt */
    @DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect", f = "AndroidOverscroll.kt", i = {1, 1}, l = {219, 244}, m = "applyToFling-BMRW4eQ", n = {"this", "remainingVelocity"}, s = {"L$0", "J$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public AndroidEdgeEffectOverscrollEffect f3267p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public long f3268q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f3269r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f3271t0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3269r0 = obj;
            this.f3271t0 |= Integer.MIN_VALUE;
            return AndroidEdgeEffectOverscrollEffect.this.mo119applyToFlingBMRW4eQ(0L, null, this);
        }
    }

    /* JADX INFO: compiled from: AndroidOverscroll.kt */
    @DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1", f = "AndroidOverscroll.kt", i = {}, l = {TypedValues.AttributesType.TYPE_PATH_ROTATE}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<PointerInputScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f3272p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f3273q0;

        /* JADX INFO: compiled from: AndroidOverscroll.kt */
        @DebugMetadata(c = "androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$effectModifier$1$1", f = "AndroidOverscroll.kt", i = {0, 1}, l = {TypedValues.AttributesType.TYPE_EASING, 321}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture"}, s = {"L$0", "L$0"})
        @SourceDebugExtension({"SMAP\nAndroidOverscroll.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect$effectModifier$1$1\n+ 2 TempListUtils.kt\nandroidx/compose/foundation/TempListUtilsKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,589:1\n36#2,3:590\n39#2,2:597\n41#2:600\n33#3,4:593\n38#3:599\n116#3,2:601\n33#3,6:603\n118#3:609\n*S KotlinDebug\n*F\n+ 1 AndroidOverscroll.kt\nandroidx/compose/foundation/AndroidEdgeEffectOverscrollEffect$effectModifier$1$1\n*L\n321#1:590,3\n321#1:597,2\n321#1:600\n321#1:593,4\n321#1:599\n325#1:601,2\n325#1:603,6\n325#1:609\n*E\n"})
        public static final class a extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f3275p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public /* synthetic */ Object f3276q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ AndroidEdgeEffectOverscrollEffect f3277r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f3277r0 = androidEdgeEffectOverscrollEffect;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(this.f3277r0, continuation);
                aVar.f3276q0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:27:0x00a0  */
            /* JADX WARN: Code duplicated, block: B:30:0x00b6 A[LOOP:1: B:25:0x009c->B:30:0x00b6, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:46:0x00ba A[EDGE_INSN: B:46:0x00ba->B:32:0x00ba BREAK  A[LOOP:1: B:25:0x009c->B:30:0x00b6], SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0069 -> B:18:0x006e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r15) {
                /*
                    Method dump skipped, instruction units count: 239
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = AndroidEdgeEffectOverscrollEffect.this.new b(continuation);
            bVar.f3273q0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
            return ((b) create(pointerInputScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3272p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                PointerInputScope pointerInputScope = (PointerInputScope) this.f3273q0;
                a aVar = new a(AndroidEdgeEffectOverscrollEffect.this, null);
                this.f3272p0 = 1;
                if (ForEachGestureKt.awaitEachGesture(pointerInputScope, aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: AndroidOverscroll.kt */
    public static final class c extends Lambda implements Function1<IntSize, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(IntSize intSize) {
            long f18319a = intSize.getF18319a();
            long jM4559toSizeozmzZPI = IntSizeKt.m4559toSizeozmzZPI(f18319a);
            AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect = AndroidEdgeEffectOverscrollEffect.this;
            boolean z10 = !Size.m2340equalsimpl0(jM4559toSizeozmzZPI, androidEdgeEffectOverscrollEffect.f3264o);
            androidEdgeEffectOverscrollEffect.f3264o = IntSizeKt.m4559toSizeozmzZPI(f18319a);
            if (z10) {
                androidEdgeEffectOverscrollEffect.f3253c.setSize(IntSize.m4549getWidthimpl(f18319a), IntSize.m4548getHeightimpl(f18319a));
                androidEdgeEffectOverscrollEffect.f3254d.setSize(IntSize.m4549getWidthimpl(f18319a), IntSize.m4548getHeightimpl(f18319a));
                androidEdgeEffectOverscrollEffect.f3255e.setSize(IntSize.m4548getHeightimpl(f18319a), IntSize.m4549getWidthimpl(f18319a));
                androidEdgeEffectOverscrollEffect.f3256f.setSize(IntSize.m4548getHeightimpl(f18319a), IntSize.m4549getWidthimpl(f18319a));
                androidEdgeEffectOverscrollEffect.f3258h.setSize(IntSize.m4549getWidthimpl(f18319a), IntSize.m4548getHeightimpl(f18319a));
                androidEdgeEffectOverscrollEffect.f3259i.setSize(IntSize.m4549getWidthimpl(f18319a), IntSize.m4548getHeightimpl(f18319a));
                androidEdgeEffectOverscrollEffect.f3260j.setSize(IntSize.m4548getHeightimpl(f18319a), IntSize.m4549getWidthimpl(f18319a));
                androidEdgeEffectOverscrollEffect.f3261k.setSize(IntSize.m4548getHeightimpl(f18319a), IntSize.m4549getWidthimpl(f18319a));
            }
            if (z10) {
                androidEdgeEffectOverscrollEffect.e();
                androidEdgeEffectOverscrollEffect.a();
            }
            return Unit.INSTANCE;
        }
    }

    public AndroidEdgeEffectOverscrollEffect(@NotNull Context context, @NotNull OverscrollConfiguration overscrollConfig) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overscrollConfig, "overscrollConfig");
        this.f3251a = overscrollConfig;
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        EdgeEffect edgeEffectCreate = edgeEffectCompat.create(context, null);
        this.f3253c = edgeEffectCreate;
        EdgeEffect edgeEffectCreate2 = edgeEffectCompat.create(context, null);
        this.f3254d = edgeEffectCreate2;
        EdgeEffect edgeEffectCreate3 = edgeEffectCompat.create(context, null);
        this.f3255e = edgeEffectCreate3;
        EdgeEffect edgeEffectCreate4 = edgeEffectCompat.create(context, null);
        this.f3256f = edgeEffectCreate4;
        List<EdgeEffect> listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new EdgeEffect[]{edgeEffectCreate3, edgeEffectCreate, edgeEffectCreate4, edgeEffectCreate2});
        this.f3257g = listListOf;
        this.f3258h = edgeEffectCompat.create(context, null);
        this.f3259i = edgeEffectCompat.create(context, null);
        this.f3260j = edgeEffectCompat.create(context, null);
        this.f3261k = edgeEffectCompat.create(context, null);
        int size = listListOf.size();
        for (int i10 = 0; i10 < size; i10++) {
            listListOf.get(i10).setColor(ColorKt.m2561toArgb8_81llA(this.f3251a.getGlowColor()));
        }
        Unit unit = Unit.INSTANCE;
        this.f3262l = SnapshotStateKt.mutableStateOf(unit, SnapshotStateKt.neverEqualPolicy());
        this.invalidationEnabled = true;
        this.f3264o = Size.INSTANCE.m2353getZeroNHjbRc();
        this.effectModifier = OnRemeasuredModifierKt.onSizeChanged(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE.then(AndroidOverscrollKt.f3280a), unit, new b(null)), new c()).then(new t.p(this, InspectableValueKt.isDebugInspectorInfoEnabled() ? new Function1<InspectorInfo, Unit>() { // from class: androidx.compose.foundation.AndroidEdgeEffectOverscrollEffect$special$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(InspectorInfo inspectorInfo) {
                invoke2(inspectorInfo);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull InspectorInfo inspectorInfo) {
                Intrinsics.checkNotNullParameter(inspectorInfo, "$this$null");
                inspectorInfo.setName("overscroll");
                inspectorInfo.setValue(this.f3279p0);
            }
        } : InspectableValueKt.getNoInspectorInfo()));
    }

    public final void a() {
        List<EdgeEffect> list = this.f3257g;
        int size = list.size();
        boolean z10 = false;
        for (int i10 = 0; i10 < size; i10++) {
            EdgeEffect edgeEffect = list.get(i10);
            edgeEffect.onRelease();
            z10 = edgeEffect.isFinished() || z10;
        }
        if (z10) {
            e();
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0086  */
    /* JADX WARN: Code duplicated, block: B:34:0x0093  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:47:0x00df  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:58:0x012f  */
    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    /* JADX WARN: Code duplicated, block: B:61:0x0147  */
    /* JADX WARN: Code duplicated, block: B:64:0x015f  */
    /* JADX WARN: Code duplicated, block: B:65:0x016f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0177  */
    /* JADX WARN: Code duplicated, block: B:70:0x0193  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.compose.foundation.OverscrollEffect
    @Nullable
    /* JADX INFO: renamed from: applyToFling-BMRW4eQ, reason: not valid java name */
    public Object mo119applyToFlingBMRW4eQ(long j10, @NotNull Function2<? super Velocity, ? super Continuation<? super Velocity>, ? extends Object> function2, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        float fM4614getXimpl;
        EdgeEffectCompat edgeEffectCompat;
        EdgeEffect edgeEffect;
        float fM4615getYimpl;
        EdgeEffectCompat edgeEffectCompat2;
        EdgeEffect edgeEffect2;
        long jM4617minusAH228Gc;
        AndroidEdgeEffectOverscrollEffect androidEdgeEffectOverscrollEffect;
        long jM4617minusAH228Gc2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f3271t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f3271t0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objInvoke = aVar.f3269r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f3271t0;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(objInvoke);
                return Unit.INSTANCE;
            }
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jM4617minusAH228Gc = aVar.f3268q0;
            androidEdgeEffectOverscrollEffect = aVar.f3267p0;
            ResultKt.throwOnFailure(objInvoke);
            jM4617minusAH228Gc2 = Velocity.m4617minusAH228Gc(jM4617minusAH228Gc, ((Velocity) objInvoke).getF18328a());
            androidEdgeEffectOverscrollEffect.f3263n = false;
            if (Velocity.m4614getXimpl(jM4617minusAH228Gc2) > 0.0f) {
                EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.f3255e, mk.c.roundToInt(Velocity.m4614getXimpl(jM4617minusAH228Gc2)));
            } else if (Velocity.m4614getXimpl(jM4617minusAH228Gc2) < 0.0f) {
                EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.f3256f, -mk.c.roundToInt(Velocity.m4614getXimpl(jM4617minusAH228Gc2)));
            }
            if (Velocity.m4615getYimpl(jM4617minusAH228Gc2) > 0.0f) {
                EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.f3253c, mk.c.roundToInt(Velocity.m4615getYimpl(jM4617minusAH228Gc2)));
            } else if (Velocity.m4615getYimpl(jM4617minusAH228Gc2) < 0.0f) {
                EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.f3254d, -mk.c.roundToInt(Velocity.m4615getYimpl(jM4617minusAH228Gc2)));
            }
            if (!Velocity.m4613equalsimpl0(jM4617minusAH228Gc2, Velocity.INSTANCE.m4625getZero9UxMQ8M())) {
                androidEdgeEffectOverscrollEffect.e();
            }
            androidEdgeEffectOverscrollEffect.a();
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objInvoke);
        if (Size.m2346isEmptyimpl(this.f3264o)) {
            Velocity velocityM4605boximpl = Velocity.m4605boximpl(j10);
            aVar.f3271t0 = 1;
            if (function2.invoke(velocityM4605boximpl, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
        if (Velocity.m4614getXimpl(j10) > 0.0f) {
            EdgeEffectCompat edgeEffectCompat3 = EdgeEffectCompat.INSTANCE;
            EdgeEffect edgeEffect3 = this.f3255e;
            if (edgeEffectCompat3.getDistanceCompat(edgeEffect3) != 0.0f) {
                edgeEffectCompat3.onAbsorbCompat(edgeEffect3, mk.c.roundToInt(Velocity.m4614getXimpl(j10)));
                fM4614getXimpl = Velocity.m4614getXimpl(j10);
            } else if (Velocity.m4614getXimpl(j10) < 0.0f) {
                edgeEffectCompat = EdgeEffectCompat.INSTANCE;
                edgeEffect = this.f3256f;
                if (edgeEffectCompat.getDistanceCompat(edgeEffect) == 0.0f) {
                    fM4614getXimpl = 0.0f;
                } else {
                    edgeEffectCompat.onAbsorbCompat(edgeEffect, -mk.c.roundToInt(Velocity.m4614getXimpl(j10)));
                    fM4614getXimpl = Velocity.m4614getXimpl(j10);
                }
            } else {
                fM4614getXimpl = 0.0f;
            }
        } else if (Velocity.m4614getXimpl(j10) < 0.0f) {
            edgeEffectCompat = EdgeEffectCompat.INSTANCE;
            edgeEffect = this.f3256f;
            if (edgeEffectCompat.getDistanceCompat(edgeEffect) == 0.0f) {
                fM4614getXimpl = 0.0f;
            } else {
                edgeEffectCompat.onAbsorbCompat(edgeEffect, -mk.c.roundToInt(Velocity.m4614getXimpl(j10)));
                fM4614getXimpl = Velocity.m4614getXimpl(j10);
            }
        } else {
            fM4614getXimpl = 0.0f;
        }
        if (Velocity.m4615getYimpl(j10) > 0.0f) {
            EdgeEffectCompat edgeEffectCompat4 = EdgeEffectCompat.INSTANCE;
            EdgeEffect edgeEffect4 = this.f3253c;
            if (edgeEffectCompat4.getDistanceCompat(edgeEffect4) != 0.0f) {
                edgeEffectCompat4.onAbsorbCompat(edgeEffect4, mk.c.roundToInt(Velocity.m4615getYimpl(j10)));
                fM4615getYimpl = Velocity.m4615getYimpl(j10);
            } else if (Velocity.m4615getYimpl(j10) < 0.0f) {
                edgeEffectCompat2 = EdgeEffectCompat.INSTANCE;
                edgeEffect2 = this.f3254d;
                if (edgeEffectCompat2.getDistanceCompat(edgeEffect2) == 0.0f) {
                    fM4615getYimpl = 0.0f;
                } else {
                    edgeEffectCompat2.onAbsorbCompat(edgeEffect2, -mk.c.roundToInt(Velocity.m4615getYimpl(j10)));
                    fM4615getYimpl = Velocity.m4615getYimpl(j10);
                }
            } else {
                fM4615getYimpl = 0.0f;
            }
        } else if (Velocity.m4615getYimpl(j10) < 0.0f) {
            edgeEffectCompat2 = EdgeEffectCompat.INSTANCE;
            edgeEffect2 = this.f3254d;
            if (edgeEffectCompat2.getDistanceCompat(edgeEffect2) == 0.0f) {
                fM4615getYimpl = 0.0f;
            } else {
                edgeEffectCompat2.onAbsorbCompat(edgeEffect2, -mk.c.roundToInt(Velocity.m4615getYimpl(j10)));
                fM4615getYimpl = Velocity.m4615getYimpl(j10);
            }
        } else {
            fM4615getYimpl = 0.0f;
        }
        long jVelocity = VelocityKt.Velocity(fM4614getXimpl, fM4615getYimpl);
        if (!Velocity.m4613equalsimpl0(jVelocity, Velocity.INSTANCE.m4625getZero9UxMQ8M())) {
            e();
        }
        jM4617minusAH228Gc = Velocity.m4617minusAH228Gc(j10, jVelocity);
        Velocity velocityM4605boximpl2 = Velocity.m4605boximpl(jM4617minusAH228Gc);
        aVar.f3267p0 = this;
        aVar.f3268q0 = jM4617minusAH228Gc;
        aVar.f3271t0 = 2;
        objInvoke = function2.invoke(velocityM4605boximpl2, aVar);
        if (objInvoke == coroutine_suspended) {
            return coroutine_suspended;
        }
        androidEdgeEffectOverscrollEffect = this;
        jM4617minusAH228Gc2 = Velocity.m4617minusAH228Gc(jM4617minusAH228Gc, ((Velocity) objInvoke).getF18328a());
        androidEdgeEffectOverscrollEffect.f3263n = false;
        if (Velocity.m4614getXimpl(jM4617minusAH228Gc2) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.f3255e, mk.c.roundToInt(Velocity.m4614getXimpl(jM4617minusAH228Gc2)));
        } else if (Velocity.m4614getXimpl(jM4617minusAH228Gc2) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.f3256f, -mk.c.roundToInt(Velocity.m4614getXimpl(jM4617minusAH228Gc2)));
        }
        if (Velocity.m4615getYimpl(jM4617minusAH228Gc2) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.f3253c, mk.c.roundToInt(Velocity.m4615getYimpl(jM4617minusAH228Gc2)));
        } else if (Velocity.m4615getYimpl(jM4617minusAH228Gc2) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onAbsorbCompat(androidEdgeEffectOverscrollEffect.f3254d, -mk.c.roundToInt(Velocity.m4615getYimpl(jM4617minusAH228Gc2)));
        }
        if (!Velocity.m4613equalsimpl0(jM4617minusAH228Gc2, Velocity.INSTANCE.m4625getZero9UxMQ8M())) {
            androidEdgeEffectOverscrollEffect.e();
        }
        androidEdgeEffectOverscrollEffect.a();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:121:0x020a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x0167  */
    /* JADX WARN: Code duplicated, block: B:74:0x016c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0174  */
    /* JADX WARN: Code duplicated, block: B:77:0x0178  */
    /* JADX WARN: Code duplicated, block: B:79:0x017b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:81:0x017f  */
    @Override // androidx.compose.foundation.OverscrollEffect
    /* JADX INFO: renamed from: applyToScroll-Rhakbz0, reason: not valid java name */
    public long mo120applyToScrollRhakbz0(long delta, int source, @NotNull Function1<? super Offset, Offset> performScroll) {
        float fI;
        float fG;
        boolean z10;
        boolean zIsFinished;
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(performScroll, "performScroll");
        if (Size.m2346isEmptyimpl(this.f3264o)) {
            return performScroll.invoke(Offset.m2264boximpl(delta)).getF15533a();
        }
        boolean z13 = this.f3263n;
        EdgeEffect edgeEffect = this.f3254d;
        EdgeEffect edgeEffect2 = this.f3253c;
        EdgeEffect edgeEffect3 = this.f3256f;
        EdgeEffect edgeEffect4 = this.f3255e;
        if (!z13) {
            long jM2354getCenteruvyYCjk = SizeKt.m2354getCenteruvyYCjk(this.f3264o);
            EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
            if (edgeEffectCompat.getDistanceCompat(edgeEffect4) != 0.0f) {
                g(Offset.INSTANCE.m2291getZeroF1C5BW0(), jM2354getCenteruvyYCjk);
            }
            if (edgeEffectCompat.getDistanceCompat(edgeEffect3) != 0.0f) {
                h(Offset.INSTANCE.m2291getZeroF1C5BW0(), jM2354getCenteruvyYCjk);
            }
            if (edgeEffectCompat.getDistanceCompat(edgeEffect2) != 0.0f) {
                i(Offset.INSTANCE.m2291getZeroF1C5BW0(), jM2354getCenteruvyYCjk);
            }
            if (edgeEffectCompat.getDistanceCompat(edgeEffect) != 0.0f) {
                f(Offset.INSTANCE.m2291getZeroF1C5BW0(), jM2354getCenteruvyYCjk);
            }
            this.f3263n = true;
        }
        Offset offset = this.f3252b;
        long f15533a = offset != null ? offset.getF15533a() : SizeKt.m2354getCenteruvyYCjk(this.f3264o);
        if (Offset.m2276getYimpl(delta) == 0.0f) {
            fI = 0.0f;
        } else {
            EdgeEffectCompat edgeEffectCompat2 = EdgeEffectCompat.INSTANCE;
            if (edgeEffectCompat2.getDistanceCompat(edgeEffect2) != 0.0f) {
                fI = i(delta, f15533a);
                if (edgeEffectCompat2.getDistanceCompat(edgeEffect2) == 0.0f) {
                    edgeEffect2.onRelease();
                }
            } else if (edgeEffectCompat2.getDistanceCompat(edgeEffect) == 0.0f) {
                fI = 0.0f;
            } else {
                fI = f(delta, f15533a);
                if (edgeEffectCompat2.getDistanceCompat(edgeEffect) == 0.0f) {
                    edgeEffect.onRelease();
                }
            }
        }
        if (Offset.m2275getXimpl(delta) == 0.0f) {
            fG = 0.0f;
        } else {
            EdgeEffectCompat edgeEffectCompat3 = EdgeEffectCompat.INSTANCE;
            if (edgeEffectCompat3.getDistanceCompat(edgeEffect4) != 0.0f) {
                fG = g(delta, f15533a);
                if (edgeEffectCompat3.getDistanceCompat(edgeEffect4) == 0.0f) {
                    edgeEffect4.onRelease();
                }
            } else if (edgeEffectCompat3.getDistanceCompat(edgeEffect3) == 0.0f) {
                fG = 0.0f;
            } else {
                fG = h(delta, f15533a);
                if (edgeEffectCompat3.getDistanceCompat(edgeEffect3) == 0.0f) {
                    edgeEffect3.onRelease();
                }
            }
        }
        long jOffset = OffsetKt.Offset(fG, fI);
        if (!Offset.m2272equalsimpl0(jOffset, Offset.INSTANCE.m2291getZeroF1C5BW0())) {
            e();
        }
        long jM2279minusMKHz9U = Offset.m2279minusMKHz9U(delta, jOffset);
        long f15533a2 = performScroll.invoke(Offset.m2264boximpl(jM2279minusMKHz9U)).getF15533a();
        long jM2279minusMKHz9U2 = Offset.m2279minusMKHz9U(jM2279minusMKHz9U, f15533a2);
        if (NestedScrollSource.m3387equalsimpl0(source, NestedScrollSource.INSTANCE.m3392getDragWNlRxjI())) {
            if (Offset.m2275getXimpl(jM2279minusMKHz9U2) > 0.5f) {
                g(jM2279minusMKHz9U2, f15533a);
            } else {
                if (Offset.m2275getXimpl(jM2279minusMKHz9U2) < -0.5f) {
                    h(jM2279minusMKHz9U2, f15533a);
                } else {
                    z11 = false;
                }
                if (Offset.m2276getYimpl(jM2279minusMKHz9U2) > 0.5f) {
                    i(jM2279minusMKHz9U2, f15533a);
                } else {
                    if (Offset.m2276getYimpl(jM2279minusMKHz9U2) < -0.5f) {
                        f(jM2279minusMKHz9U2, f15533a);
                    } else {
                        z12 = false;
                    }
                    if (!z11 || z12) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
                z12 = true;
                if (z11) {
                }
                z10 = true;
            }
            z11 = true;
            if (Offset.m2276getYimpl(jM2279minusMKHz9U2) > 0.5f) {
                i(jM2279minusMKHz9U2, f15533a);
            } else {
                if (Offset.m2276getYimpl(jM2279minusMKHz9U2) < -0.5f) {
                    f(jM2279minusMKHz9U2, f15533a);
                } else {
                    z12 = false;
                }
                if (z11) {
                }
                z10 = true;
            }
            z12 = true;
            if (z11) {
            }
            z10 = true;
        } else {
            z10 = false;
        }
        if (edgeEffect4.isFinished() || Offset.m2275getXimpl(delta) >= 0.0f) {
            zIsFinished = false;
        } else {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(edgeEffect4, Offset.m2275getXimpl(delta));
            zIsFinished = edgeEffect4.isFinished();
        }
        if (!edgeEffect3.isFinished() && Offset.m2275getXimpl(delta) > 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(edgeEffect3, Offset.m2275getXimpl(delta));
            zIsFinished = zIsFinished || edgeEffect3.isFinished();
        }
        if (!edgeEffect2.isFinished() && Offset.m2276getYimpl(delta) < 0.0f) {
            EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(edgeEffect2, Offset.m2276getYimpl(delta));
            zIsFinished = zIsFinished || edgeEffect2.isFinished();
        }
        if (edgeEffect.isFinished() || Offset.m2276getYimpl(delta) <= 0.0f) {
            if (!zIsFinished) {
                if (z10) {
                }
            }
            return Offset.m2280plusMKHz9U(jOffset, f15533a2);
        }
        EdgeEffectCompat.INSTANCE.onReleaseWithOppositeDelta(edgeEffect, Offset.m2276getYimpl(delta));
        if (!zIsFinished && !edgeEffect.isFinished()) {
            if (z10) {
            }
        }
        return Offset.m2280plusMKHz9U(jOffset, f15533a2);
        e();
        return Offset.m2280plusMKHz9U(jOffset, f15533a2);
    }

    public final boolean b(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-Size.m2344getWidthimpl(this.f3264o), (-Size.m2341getHeightimpl(this.f3264o)) + drawScope.mo415toPx0680j_4(this.f3251a.getDrawPadding().getBottom()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final boolean c(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-Size.m2341getHeightimpl(this.f3264o), drawScope.mo415toPx0680j_4(this.f3251a.getDrawPadding().mo302calculateLeftPaddingu2uoSUM(drawScope.getLayoutDirection())));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final boolean d(DrawScope drawScope, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        int iRoundToInt = mk.c.roundToInt(Size.m2344getWidthimpl(this.f3264o));
        float fMo303calculateRightPaddingu2uoSUM = this.f3251a.getDrawPadding().mo303calculateRightPaddingu2uoSUM(drawScope.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, drawScope.mo415toPx0680j_4(fMo303calculateRightPaddingu2uoSUM) + (-iRoundToInt));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final void drawOverscroll(@NotNull DrawScope drawScope) {
        boolean zC;
        Intrinsics.checkNotNullParameter(drawScope, "<this>");
        if (Size.m2346isEmptyimpl(this.f3264o)) {
            return;
        }
        androidx.compose.ui.graphics.Canvas canvas = drawScope.getDrawContext().getCanvas();
        this.f3262l.getValue();
        Canvas nativeCanvas = AndroidCanvas_androidKt.getNativeCanvas(canvas);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        EdgeEffect edgeEffect = this.f3260j;
        if (edgeEffectCompat.getDistanceCompat(edgeEffect) != 0.0f) {
            d(drawScope, edgeEffect, nativeCanvas);
            edgeEffect.finish();
        }
        EdgeEffect edgeEffect2 = this.f3255e;
        if (edgeEffect2.isFinished()) {
            zC = false;
        } else {
            zC = c(drawScope, edgeEffect2, nativeCanvas);
            edgeEffectCompat.onPullDistanceCompat(edgeEffect, edgeEffectCompat.getDistanceCompat(edgeEffect2), 0.0f);
        }
        EdgeEffect edgeEffect3 = this.f3258h;
        if (edgeEffectCompat.getDistanceCompat(edgeEffect3) != 0.0f) {
            b(drawScope, edgeEffect3, nativeCanvas);
            edgeEffect3.finish();
        }
        EdgeEffect edgeEffect4 = this.f3253c;
        boolean zIsFinished = edgeEffect4.isFinished();
        OverscrollConfiguration overscrollConfiguration = this.f3251a;
        if (!zIsFinished) {
            int iSave = nativeCanvas.save();
            nativeCanvas.translate(0.0f, drawScope.mo415toPx0680j_4(overscrollConfiguration.getDrawPadding().getTop()));
            boolean zDraw = edgeEffect4.draw(nativeCanvas);
            nativeCanvas.restoreToCount(iSave);
            zC = zDraw || zC;
            edgeEffectCompat.onPullDistanceCompat(edgeEffect3, edgeEffectCompat.getDistanceCompat(edgeEffect4), 0.0f);
        }
        EdgeEffect edgeEffect5 = this.f3261k;
        if (edgeEffectCompat.getDistanceCompat(edgeEffect5) != 0.0f) {
            c(drawScope, edgeEffect5, nativeCanvas);
            edgeEffect5.finish();
        }
        EdgeEffect edgeEffect6 = this.f3256f;
        if (!edgeEffect6.isFinished()) {
            zC = d(drawScope, edgeEffect6, nativeCanvas) || zC;
            edgeEffectCompat.onPullDistanceCompat(edgeEffect5, edgeEffectCompat.getDistanceCompat(edgeEffect6), 0.0f);
        }
        EdgeEffect edgeEffect7 = this.f3259i;
        if (edgeEffectCompat.getDistanceCompat(edgeEffect7) != 0.0f) {
            int iSave2 = nativeCanvas.save();
            nativeCanvas.translate(0.0f, drawScope.mo415toPx0680j_4(overscrollConfiguration.getDrawPadding().getTop()));
            edgeEffect7.draw(nativeCanvas);
            nativeCanvas.restoreToCount(iSave2);
            edgeEffect7.finish();
        }
        EdgeEffect edgeEffect8 = this.f3254d;
        if (!edgeEffect8.isFinished()) {
            boolean z10 = b(drawScope, edgeEffect8, nativeCanvas) || zC;
            edgeEffectCompat.onPullDistanceCompat(edgeEffect7, edgeEffectCompat.getDistanceCompat(edgeEffect8), 0.0f);
            zC = z10;
        }
        if (zC) {
            e();
        }
    }

    public final void e() {
        if (this.invalidationEnabled) {
            this.f3262l.setValue(Unit.INSTANCE);
        }
    }

    public final float f(long j10, long j11) {
        float fM2275getXimpl = Offset.m2275getXimpl(j11) / Size.m2344getWidthimpl(this.f3264o);
        float fM2276getYimpl = Offset.m2276getYimpl(j10) / Size.m2341getHeightimpl(this.f3264o);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        float f6 = 1 - fM2275getXimpl;
        EdgeEffect edgeEffect = this.f3254d;
        return edgeEffectCompat.getDistanceCompat(edgeEffect) == 0.0f ? Size.m2341getHeightimpl(this.f3264o) * (-edgeEffectCompat.onPullDistanceCompat(edgeEffect, -fM2276getYimpl, f6)) : Offset.m2276getYimpl(j10);
    }

    public final float g(long j10, long j11) {
        float fM2276getYimpl = Offset.m2276getYimpl(j11) / Size.m2341getHeightimpl(this.f3264o);
        float fM2275getXimpl = Offset.m2275getXimpl(j10) / Size.m2344getWidthimpl(this.f3264o);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        float f6 = 1 - fM2276getYimpl;
        EdgeEffect edgeEffect = this.f3255e;
        return edgeEffectCompat.getDistanceCompat(edgeEffect) == 0.0f ? Size.m2344getWidthimpl(this.f3264o) * edgeEffectCompat.onPullDistanceCompat(edgeEffect, fM2275getXimpl, f6) : Offset.m2275getXimpl(j10);
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    @NotNull
    public Modifier getEffectModifier() {
        return this.effectModifier;
    }

    /* JADX INFO: renamed from: getInvalidationEnabled$foundation_release, reason: from getter */
    public final boolean getInvalidationEnabled() {
        return this.invalidationEnabled;
    }

    public final float h(long j10, long j11) {
        float fM2276getYimpl = Offset.m2276getYimpl(j11) / Size.m2341getHeightimpl(this.f3264o);
        float fM2275getXimpl = Offset.m2275getXimpl(j10) / Size.m2344getWidthimpl(this.f3264o);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        EdgeEffect edgeEffect = this.f3256f;
        return edgeEffectCompat.getDistanceCompat(edgeEffect) == 0.0f ? Size.m2344getWidthimpl(this.f3264o) * (-edgeEffectCompat.onPullDistanceCompat(edgeEffect, -fM2275getXimpl, fM2276getYimpl)) : Offset.m2275getXimpl(j10);
    }

    public final float i(long j10, long j11) {
        float fM2275getXimpl = Offset.m2275getXimpl(j11) / Size.m2344getWidthimpl(this.f3264o);
        float fM2276getYimpl = Offset.m2276getYimpl(j10) / Size.m2341getHeightimpl(this.f3264o);
        EdgeEffectCompat edgeEffectCompat = EdgeEffectCompat.INSTANCE;
        EdgeEffect edgeEffect = this.f3253c;
        return edgeEffectCompat.getDistanceCompat(edgeEffect) == 0.0f ? Size.m2341getHeightimpl(this.f3264o) * edgeEffectCompat.onPullDistanceCompat(edgeEffect, fM2276getYimpl, fM2275getXimpl) : Offset.m2276getYimpl(j10);
    }

    @Override // androidx.compose.foundation.OverscrollEffect
    public boolean isInProgress() {
        List<EdgeEffect> list = this.f3257g;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!(EdgeEffectCompat.INSTANCE.getDistanceCompat(list.get(i10)) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    public final void setInvalidationEnabled$foundation_release(boolean z10) {
        this.invalidationEnabled = z10;
    }

    @VisibleForTesting
    public static /* synthetic */ void getInvalidationEnabled$foundation_release$annotations() {
    }
}
