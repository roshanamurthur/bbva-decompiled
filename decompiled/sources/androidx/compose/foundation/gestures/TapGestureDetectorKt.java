package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.DurationKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u.i;
import u.p;

/* JADX INFO: compiled from: TapGestureDetector.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0093\u0001\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00012/\b\u0002\u0010\u000b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0086@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001ac\u0010\u000f\u001a\u00020\u0003*\u00020\u00002/\b\u0002\u0010\u000b\u001a)\b\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006¢\u0006\u0002\b\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0001H\u0080@ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016\u001a+\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0019\u001a\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u0014*\u00020\u0011H\u0087@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u001a\u001a\u0004\u0018\u00010\u0014*\u00020\u00112\b\b\u0002\u0010\u0018\u001a\u00020\u0017H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001d"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerInputScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/geometry/Offset;", "", "onDoubleTap", "onLongPress", "Lkotlin/Function3;", "Landroidx/compose/foundation/gestures/PressGestureScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "onPress", "onTap", "detectTapGestures", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "detectTapAndPress", "(Landroidx/compose/ui/input/pointer/PointerInputScope;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "", "requireUnconsumed", "Landroidx/compose/ui/input/pointer/PointerInputChange;", "awaitFirstDown", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;ZLandroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "waitForUpOrCancellation", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;Landroidx/compose/ui/input/pointer/PointerEventPass;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,376:1\n33#2,6:377\n101#2,2:383\n33#2,6:385\n103#2:391\n86#2,2:392\n33#2,6:394\n88#2:400\n86#2,2:401\n33#2,6:403\n88#2:409\n101#2,2:410\n33#2,6:412\n103#2:418\n101#2,2:419\n33#2,6:421\n103#2:427\n*S KotlinDebug\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt\n*L\n196#1:377,6\n197#1:383,2\n197#1:385,6\n197#1:391\n281#1:392,2\n281#1:394,6\n281#1:400\n306#1:401,2\n306#1:403,6\n306#1:409\n311#1:410,2\n311#1:412,6\n311#1:418\n321#1:419,2\n321#1:421,6\n321#1:427\n*E\n"})
public final class TapGestureDetectorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final a f3873a = new a(3, null);

    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$NoPressGesture$1", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> {
        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(PressGestureScope pressGestureScope, Offset offset, Continuation<? super Unit> continuation) {
            offset.getF15533a();
            return new a(3, continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 0}, l = {279}, m = "awaitFirstDown", n = {"$this$awaitFirstDown", "pass", "requireUnconsumed"}, s = {"L$0", "L$1", "Z$0"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public AwaitPointerEventScope f3874p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public PointerEventPass f3875q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f3876r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f3877s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f3878t0;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3877s0 = obj;
            this.f3878t0 |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.awaitFirstDown(null, false, null, this);
        }
    }

    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2", f = "TapGestureDetector.kt", i = {}, l = {232}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f3879p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f3880q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f3881r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> f3882s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function1<Offset, Unit> f3883t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ i f3884u0;

        /* JADX INFO: compiled from: TapGestureDetector.kt */
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1", f = "TapGestureDetector.kt", i = {0}, l = {237, 245}, m = "invokeSuspend", n = {"$this$awaitEachGesture"}, s = {"L$0"})
        @SourceDebugExtension({"SMAP\nTapGestureDetector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TapGestureDetector.kt\nandroidx/compose/foundation/gestures/TapGestureDetectorKt$detectTapAndPress$2$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,376:1\n1#2:377\n*E\n"})
        public static final class a extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f3885p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public /* synthetic */ Object f3886q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ CoroutineScope f3887r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> f3888s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public final /* synthetic */ Function1<Offset, Unit> f3889t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public final /* synthetic */ i f3890u0;

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$c$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$1", f = "TapGestureDetector.kt", i = {}, l = {234}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0019a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public int f3891p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ i f3892q0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0019a(i iVar, Continuation<? super C0019a> continuation) {
                    super(2, continuation);
                    this.f3892q0 = iVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0019a(this.f3892q0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0019a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i10 = this.f3891p0;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.f3891p0 = 1;
                        if (this.f3892q0.a(this) == coroutine_suspended) {
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

            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$2", f = "TapGestureDetector.kt", i = {}, l = {241}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public int f3893p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> f3894q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ i f3895r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public final /* synthetic */ PointerInputChange f3896s0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public b(Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, i iVar, PointerInputChange pointerInputChange, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f3894q0 = function3;
                    this.f3895r0 = iVar;
                    this.f3896s0 = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new b(this.f3894q0, this.f3895r0, this.f3896s0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i10 = this.f3893p0;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Offset offsetM2264boximpl = Offset.m2264boximpl(this.f3896s0.getPosition());
                        this.f3893p0 = 1;
                        if (this.f3894q0.invoke(this.f3895r0, offsetM2264boximpl, this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$c$a$c, reason: collision with other inner class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$3", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0020c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ i f3897p0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0020c(i iVar, Continuation<? super C0020c> continuation) {
                    super(2, continuation);
                    this.f3897p0 = iVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0020c(this.f3897p0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0020c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    ek.a.getCOROUTINE_SUSPENDED();
                    ResultKt.throwOnFailure(obj);
                    i iVar = this.f3897p0;
                    iVar.f93658r0 = true;
                    Mutex.DefaultImpls.unlock$default(iVar.f93659s0, null, 1, null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapAndPress$2$1$4", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ i f3898p0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public d(i iVar, Continuation<? super d> continuation) {
                    super(2, continuation);
                    this.f3898p0 = iVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new d(this.f3898p0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    ek.a.getCOROUTINE_SUSPENDED();
                    ResultKt.throwOnFailure(obj);
                    i iVar = this.f3898p0;
                    iVar.f93657q0 = true;
                    Mutex.DefaultImpls.unlock$default(iVar.f93659s0, null, 1, null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(CoroutineScope coroutineScope, Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super Offset, Unit> function1, i iVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f3887r0 = coroutineScope;
                this.f3888s0 = function3;
                this.f3889t0 = function1;
                this.f3890u0 = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(this.f3887r0, this.f3888s0, this.f3889t0, this.f3890u0, continuation);
                aVar.f3886q0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:21:0x0073  */
            /* JADX WARN: Code duplicated, block: B:22:0x0082  */
            /* JADX WARN: Code duplicated, block: B:24:0x0097  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                AwaitPointerEventScope awaitPointerEventScope;
                PointerInputChange pointerInputChange;
                Function1<Offset, Unit> function1;
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f3885p0;
                i iVar = this.f3890u0;
                if (i10 != 0) {
                    if (i10 == 1) {
                        awaitPointerEventScope = (AwaitPointerEventScope) this.f3886q0;
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    pointerInputChange = (PointerInputChange) obj;
                    if (pointerInputChange == null) {
                        BuildersKt__Builders_commonKt.launch$default(this.f3887r0, null, null, new C0020c(iVar, null), 3, null);
                    } else {
                        pointerInputChange.consume();
                        BuildersKt__Builders_commonKt.launch$default(this.f3887r0, null, null, new d(iVar, null), 3, null);
                        function1 = this.f3889t0;
                        if (function1 != null) {
                            function1.invoke(Offset.m2264boximpl(pointerInputChange.getPosition()));
                        }
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                awaitPointerEventScope = (AwaitPointerEventScope) this.f3886q0;
                BuildersKt__Builders_commonKt.launch$default(this.f3887r0, null, null, new C0019a(iVar, null), 3, null);
                this.f3886q0 = awaitPointerEventScope;
                this.f3885p0 = 1;
                obj = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope, false, null, this, 3, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                PointerInputChange pointerInputChange2 = (PointerInputChange) obj;
                pointerInputChange2.consume();
                Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> function3 = TapGestureDetectorKt.f3873a;
                Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> function4 = this.f3888s0;
                if (function4 != function3) {
                    BuildersKt__Builders_commonKt.launch$default(this.f3887r0, null, null, new b(function4, iVar, pointerInputChange2, null), 3, null);
                }
                this.f3886q0 = null;
                this.f3885p0 = 2;
                obj = TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pointerInputChange = (PointerInputChange) obj;
                if (pointerInputChange == null) {
                    BuildersKt__Builders_commonKt.launch$default(this.f3887r0, null, null, new C0020c(iVar, null), 3, null);
                } else {
                    pointerInputChange.consume();
                    BuildersKt__Builders_commonKt.launch$default(this.f3887r0, null, null, new d(iVar, null), 3, null);
                    function1 = this.f3889t0;
                    if (function1 != null) {
                        function1.invoke(Offset.m2264boximpl(pointerInputChange.getPosition()));
                    }
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(PointerInputScope pointerInputScope, Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super Offset, Unit> function1, i iVar, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f3881r0 = pointerInputScope;
            this.f3882s0 = function3;
            this.f3883t0 = function1;
            this.f3884u0 = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = new c(this.f3881r0, this.f3882s0, this.f3883t0, this.f3884u0, continuation);
            cVar.f3880q0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3879p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                a aVar = new a((CoroutineScope) this.f3880q0, this.f3882s0, this.f3883t0, this.f3884u0, null);
                this.f3879p0 = 1;
                if (ForEachGestureKt.awaitEachGesture(this.f3881r0, aVar, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2", f = "TapGestureDetector.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f3899p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f3900q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ PointerInputScope f3901r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> f3902s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ Function1<Offset, Unit> f3903t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ Function1<Offset, Unit> f3904u0;
        public final /* synthetic */ Function1<Offset, Unit> v0;

        /* JADX INFO: compiled from: TapGestureDetector.kt */
        @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1", f = "TapGestureDetector.kt", i = {0, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {100, 114, 129, 141, 156, 178}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "longPressTimeout", "$this$awaitEachGesture", "upOrCancel", "secondDown"}, s = {"L$0", "L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$2"})
        public static final class a extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
            public final /* synthetic */ Function1<Offset, Unit> E0;
            public final /* synthetic */ u.i F0;

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public Object f3905p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public Object f3906q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public Ref.ObjectRef f3907r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public long f3908s0;

            /* JADX INFO: renamed from: t0, reason: collision with root package name */
            public int f3909t0;

            /* JADX INFO: renamed from: u0, reason: collision with root package name */
            public /* synthetic */ Object f3910u0;
            public final /* synthetic */ CoroutineScope v0;

            /* JADX INFO: renamed from: w0, reason: collision with root package name */
            public final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> f3911w0;

            /* JADX INFO: renamed from: x0, reason: collision with root package name */
            public final /* synthetic */ Function1<Offset, Unit> f3912x0;

            /* JADX INFO: renamed from: y0, reason: collision with root package name */
            public final /* synthetic */ Function1<Offset, Unit> f3913y0;

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$10", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0021a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ u.i f3914p0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0021a(u.i iVar, Continuation<? super C0021a> continuation) {
                    super(2, continuation);
                    this.f3914p0 = iVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new C0021a(this.f3914p0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((C0021a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    ek.a.getCOROUTINE_SUSPENDED();
                    ResultKt.throwOnFailure(obj);
                    u.i iVar = this.f3914p0;
                    iVar.f93657q0 = true;
                    Mutex.DefaultImpls.unlock$default(iVar.f93659s0, null, 1, null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$1", f = "TapGestureDetector.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public int f3915p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ u.i f3916q0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(u.i iVar, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f3916q0 = iVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new b(this.f3916q0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i10 = this.f3915p0;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.f3915p0 = 1;
                        if (this.f3916q0.a(this) == coroutine_suspended) {
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

            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$2", f = "TapGestureDetector.kt", i = {}, l = {106}, m = "invokeSuspend", n = {}, s = {})
            public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public int f3917p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> f3918q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ u.i f3919r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public final /* synthetic */ PointerInputChange f3920s0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public c(Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, u.i iVar, PointerInputChange pointerInputChange, Continuation<? super c> continuation) {
                    super(2, continuation);
                    this.f3918q0 = function3;
                    this.f3919r0 = iVar;
                    this.f3920s0 = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new c(this.f3918q0, this.f3919r0, this.f3920s0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i10 = this.f3917p0;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Offset offsetM2264boximpl = Offset.m2264boximpl(this.f3920s0.getPosition());
                        this.f3917p0 = 1;
                        if (this.f3918q0.invoke(this.f3919r0, offsetM2264boximpl, this) == coroutine_suspended) {
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

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$d$a$d, reason: collision with other inner class name */
            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$3", f = "TapGestureDetector.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
            public static final class C0022d extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super PointerInputChange>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public int f3921p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public /* synthetic */ Object f3922q0;

                public C0022d() {
                    throw null;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    C0022d c0022d = new C0022d(2, continuation);
                    c0022d.f3922q0 = obj;
                    return c0022d;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super PointerInputChange> continuation) {
                    return ((C0022d) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i10 = this.f3921p0;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.f3922q0;
                        this.f3921p0 = 1;
                        obj = TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null);
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

            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$4", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ u.i f3923p0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public e(u.i iVar, Continuation<? super e> continuation) {
                    super(2, continuation);
                    this.f3923p0 = iVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new e(this.f3923p0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    ek.a.getCOROUTINE_SUSPENDED();
                    ResultKt.throwOnFailure(obj);
                    u.i iVar = this.f3923p0;
                    iVar.f93658r0 = true;
                    Mutex.DefaultImpls.unlock$default(iVar.f93659s0, null, 1, null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$5", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ u.i f3924p0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public f(u.i iVar, Continuation<? super f> continuation) {
                    super(2, continuation);
                    this.f3924p0 = iVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new f(this.f3924p0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    ek.a.getCOROUTINE_SUSPENDED();
                    ResultKt.throwOnFailure(obj);
                    u.i iVar = this.f3924p0;
                    iVar.f93657q0 = true;
                    Mutex.DefaultImpls.unlock$default(iVar.f93659s0, null, 1, null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$6", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ u.i f3925p0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public g(u.i iVar, Continuation<? super g> continuation) {
                    super(2, continuation);
                    this.f3925p0 = iVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new g(this.f3925p0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    ek.a.getCOROUTINE_SUSPENDED();
                    ResultKt.throwOnFailure(obj);
                    u.i iVar = this.f3925p0;
                    iVar.f93657q0 = true;
                    Mutex.DefaultImpls.unlock$default(iVar.f93659s0, null, 1, null);
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$7", f = "TapGestureDetector.kt", i = {}, l = {148}, m = "invokeSuspend", n = {}, s = {})
            public static final class h extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public int f3926p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ u.i f3927q0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public h(u.i iVar, Continuation<? super h> continuation) {
                    super(2, continuation);
                    this.f3927q0 = iVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new h(this.f3927q0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i10 = this.f3926p0;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        this.f3926p0 = 1;
                        if (this.f3927q0.a(this) == coroutine_suspended) {
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

            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$8", f = "TapGestureDetector.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
            public static final class i extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public int f3928p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> f3929q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ u.i f3930r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public final /* synthetic */ PointerInputChange f3931s0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public i(Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, u.i iVar, PointerInputChange pointerInputChange, Continuation<? super i> continuation) {
                    super(2, continuation);
                    this.f3929q0 = function3;
                    this.f3930r0 = iVar;
                    this.f3931s0 = pointerInputChange;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    return new i(this.f3929q0, this.f3930r0, this.f3931s0, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((i) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i10 = this.f3928p0;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Offset offsetM2264boximpl = Offset.m2264boximpl(this.f3931s0.getPosition());
                        this.f3928p0 = 1;
                        if (this.f3929q0.invoke(this.f3930r0, offsetM2264boximpl, this) == coroutine_suspended) {
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

            /* JADX INFO: compiled from: TapGestureDetector.kt */
            @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9", f = "TapGestureDetector.kt", i = {}, l = {157}, m = "invokeSuspend", n = {}, s = {})
            public static final class j extends RestrictedSuspendLambda implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public int f3932p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public /* synthetic */ Object f3933q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ CoroutineScope f3934r0;

                /* JADX INFO: renamed from: s0, reason: collision with root package name */
                public final /* synthetic */ Function1<Offset, Unit> f3935s0;

                /* JADX INFO: renamed from: t0, reason: collision with root package name */
                public final /* synthetic */ Function1<Offset, Unit> f3936t0;

                /* JADX INFO: renamed from: u0, reason: collision with root package name */
                public final /* synthetic */ Ref.ObjectRef<PointerInputChange> f3937u0;
                public final /* synthetic */ u.i v0;

                /* JADX INFO: renamed from: androidx.compose.foundation.gestures.TapGestureDetectorKt$d$a$j$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: TapGestureDetector.kt */
                @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$1", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                public static final class C0023a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: p0, reason: collision with root package name */
                    public final /* synthetic */ u.i f3938p0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0023a(u.i iVar, Continuation<? super C0023a> continuation) {
                        super(2, continuation);
                        this.f3938p0 = iVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new C0023a(this.f3938p0, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((C0023a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        ek.a.getCOROUTINE_SUSPENDED();
                        ResultKt.throwOnFailure(obj);
                        u.i iVar = this.f3938p0;
                        iVar.f93657q0 = true;
                        Mutex.DefaultImpls.unlock$default(iVar.f93659s0, null, 1, null);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX INFO: compiled from: TapGestureDetector.kt */
                @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt$detectTapGestures$2$1$9$2", f = "TapGestureDetector.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

                    /* JADX INFO: renamed from: p0, reason: collision with root package name */
                    public final /* synthetic */ u.i f3939p0;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(u.i iVar, Continuation<? super b> continuation) {
                        super(2, continuation);
                        this.f3939p0 = iVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @NotNull
                    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                        return new b(this.f3939p0, continuation);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        ek.a.getCOROUTINE_SUSPENDED();
                        ResultKt.throwOnFailure(obj);
                        u.i iVar = this.f3939p0;
                        iVar.f93658r0 = true;
                        Mutex.DefaultImpls.unlock$default(iVar.f93659s0, null, 1, null);
                        return Unit.INSTANCE;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public j(CoroutineScope coroutineScope, Function1<? super Offset, Unit> function1, Function1<? super Offset, Unit> function2, Ref.ObjectRef<PointerInputChange> objectRef, u.i iVar, Continuation<? super j> continuation) {
                    super(2, continuation);
                    this.f3934r0 = coroutineScope;
                    this.f3935s0 = function1;
                    this.f3936t0 = function2;
                    this.f3937u0 = objectRef;
                    this.v0 = iVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                    j jVar = new j(this.f3934r0, this.f3935s0, this.f3936t0, this.f3937u0, this.v0, continuation);
                    jVar.f3933q0 = obj;
                    return jVar;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                    return ((j) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i10 = this.f3932p0;
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        AwaitPointerEventScope awaitPointerEventScope = (AwaitPointerEventScope) this.f3933q0;
                        this.f3932p0 = 1;
                        obj = TapGestureDetectorKt.waitForUpOrCancellation$default(awaitPointerEventScope, null, this, 1, null);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    PointerInputChange pointerInputChange = (PointerInputChange) obj;
                    u.i iVar = this.v0;
                    if (pointerInputChange != null) {
                        pointerInputChange.consume();
                        BuildersKt__Builders_commonKt.launch$default(this.f3934r0, null, null, new C0023a(iVar, null), 3, null);
                        this.f3935s0.invoke(Offset.m2264boximpl(pointerInputChange.getPosition()));
                        return Unit.INSTANCE;
                    }
                    BuildersKt__Builders_commonKt.launch$default(this.f3934r0, null, null, new b(iVar, null), 3, null);
                    Function1<Offset, Unit> function1 = this.f3936t0;
                    if (function1 == null) {
                        return null;
                    }
                    function1.invoke(Offset.m2264boximpl(this.f3937u0.element.getPosition()));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(CoroutineScope coroutineScope, Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, Function1<? super Offset, Unit> function1, Function1<? super Offset, Unit> function2, Function1<? super Offset, Unit> function4, u.i iVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.v0 = coroutineScope;
                this.f3911w0 = function3;
                this.f3912x0 = function1;
                this.f3913y0 = function2;
                this.E0 = function4;
                this.F0 = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(this.v0, this.f3911w0, this.f3912x0, this.f3913y0, this.E0, this.F0, continuation);
                aVar.f3910u0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                return ((a) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:24:0x00b6  */
            /* JADX WARN: Code duplicated, block: B:26:0x00ca  */
            /* JADX WARN: Code duplicated, block: B:27:0x00d3  */
            /* JADX WARN: Code duplicated, block: B:31:0x00f5 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:32:0x00f6  */
            /* JADX WARN: Code duplicated, block: B:35:0x00ff A[Catch: PointerEventTimeoutCancellationException -> 0x0113, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x0113, blocks: (B:33:0x00f9, B:35:0x00ff, B:37:0x0117), top: B:79:0x00f9 }] */
            /* JADX WARN: Code duplicated, block: B:37:0x0117 A[Catch: PointerEventTimeoutCancellationException -> 0x0113, TRY_LEAVE, TryCatch #0 {PointerEventTimeoutCancellationException -> 0x0113, blocks: (B:33:0x00f9, B:35:0x00ff, B:37:0x0117), top: B:79:0x00f9 }] */
            /* JADX WARN: Code duplicated, block: B:40:0x0132  */
            /* JADX WARN: Code duplicated, block: B:43:0x0150 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:47:0x0169  */
            /* JADX WARN: Code duplicated, block: B:49:0x016d A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:50:0x016f  */
            /* JADX WARN: Code duplicated, block: B:51:0x017e  */
            /* JADX WARN: Code duplicated, block: B:53:0x0193 A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:54:0x0194  */
            /* JADX WARN: Code duplicated, block: B:57:0x0199 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:58:0x019b  */
            /* JADX WARN: Code duplicated, block: B:59:0x01ac  */
            /* JADX WARN: Code duplicated, block: B:61:0x01c4  */
            /* JADX WARN: Code duplicated, block: B:64:0x01fb A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:67:0x0201  */
            /* JADX WARN: Code duplicated, block: B:69:0x0212  */
            /* JADX WARN: Code duplicated, block: B:72:0x022c A[RETURN] */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objAwaitFirstDown$default;
                AwaitPointerEventScope awaitPointerEventScope;
                PointerInputChange pointerInputChange;
                long longPressTimeoutMillis;
                Ref.ObjectRef objectRef;
                Object objWithTimeout;
                AwaitPointerEventScope awaitPointerEventScope2;
                PointerInputChange pointerInputChange2;
                Ref.ObjectRef objectRef2;
                AwaitPointerEventScope awaitPointerEventScope3;
                T t10;
                T t11;
                T t12;
                Object objAccess$awaitSecondDown;
                AwaitPointerEventScope awaitPointerEventScope4;
                PointerInputChange pointerInputChange3;
                PointerInputChange pointerInputChange4;
                AwaitPointerEventScope awaitPointerEventScope5;
                Ref.ObjectRef objectRef3;
                j jVar;
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f3909t0;
                Function1<Offset, Unit> function1 = this.E0;
                Function1<Offset, Unit> function2 = this.f3912x0;
                Function3<PressGestureScope, Offset, Continuation<? super Unit>, Object> function3 = this.f3911w0;
                u.i iVar = this.F0;
                switch (i10) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        AwaitPointerEventScope awaitPointerEventScope6 = (AwaitPointerEventScope) this.f3910u0;
                        this.f3910u0 = awaitPointerEventScope6;
                        this.f3909t0 = 1;
                        objAwaitFirstDown$default = TapGestureDetectorKt.awaitFirstDown$default(awaitPointerEventScope6, false, null, this, 3, null);
                        if (objAwaitFirstDown$default == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        awaitPointerEventScope = awaitPointerEventScope6;
                        pointerInputChange = (PointerInputChange) objAwaitFirstDown$default;
                        pointerInputChange.consume();
                        BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new b(iVar, null), 3, null);
                        if (function3 != TapGestureDetectorKt.f3873a) {
                            BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new c(function3, iVar, pointerInputChange, null), 3, null);
                        }
                        if (function2 != null) {
                            longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                        } else {
                            longPressTimeoutMillis = DurationKt.MAX_MILLIS;
                        }
                        objectRef = new Ref.ObjectRef();
                        try {
                            C0022d c0022d = new C0022d(2, null);
                            this.f3910u0 = awaitPointerEventScope;
                            this.f3905p0 = pointerInputChange;
                            this.f3906q0 = objectRef;
                            this.f3907r0 = objectRef;
                            this.f3908s0 = longPressTimeoutMillis;
                            this.f3909t0 = 2;
                            objWithTimeout = awaitPointerEventScope.withTimeout(longPressTimeoutMillis, c0022d, this);
                            if (objWithTimeout == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            awaitPointerEventScope2 = awaitPointerEventScope;
                            pointerInputChange2 = pointerInputChange;
                            objectRef2 = objectRef;
                            t10 = objWithTimeout;
                            try {
                                objectRef.element = t10;
                                t11 = objectRef2.element;
                                if (t11 == 0) {
                                    BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new e(iVar, null), 3, null);
                                } else {
                                    ((PointerInputChange) t11).consume();
                                    BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new f(iVar, null), 3, null);
                                }
                                break;
                            } catch (PointerEventTimeoutCancellationException unused) {
                                objectRef = objectRef2;
                                pointerInputChange = pointerInputChange2;
                                awaitPointerEventScope3 = awaitPointerEventScope2;
                                if (function2 != null) {
                                    function2.invoke(Offset.m2264boximpl(pointerInputChange.getPosition()));
                                }
                                this.f3910u0 = awaitPointerEventScope3;
                                this.f3905p0 = objectRef;
                                this.f3906q0 = null;
                                this.f3907r0 = null;
                                this.f3908s0 = longPressTimeoutMillis;
                                this.f3909t0 = 3;
                                if (TapGestureDetectorKt.access$consumeUntilUp(awaitPointerEventScope3, this) == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new g(iVar, null), 3, null);
                                objectRef2 = objectRef;
                                awaitPointerEventScope2 = awaitPointerEventScope3;
                            }
                            t12 = objectRef2.element;
                            if (t12 != 0) {
                                if (this.f3913y0 == null) {
                                    this.f3910u0 = awaitPointerEventScope2;
                                    this.f3905p0 = objectRef2;
                                    this.f3906q0 = null;
                                    this.f3907r0 = null;
                                    this.f3908s0 = longPressTimeoutMillis;
                                    this.f3909t0 = 4;
                                    objAccess$awaitSecondDown = TapGestureDetectorKt.access$awaitSecondDown(awaitPointerEventScope2, (PointerInputChange) t12, this);
                                    if (objAccess$awaitSecondDown == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    awaitPointerEventScope4 = awaitPointerEventScope2;
                                    pointerInputChange3 = (PointerInputChange) objAccess$awaitSecondDown;
                                    if (pointerInputChange3 != null) {
                                        BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new h(iVar, null), 3, null);
                                        if (function3 != TapGestureDetectorKt.f3873a) {
                                            BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new i(function3, iVar, pointerInputChange3, null), 3, null);
                                        }
                                        try {
                                            jVar = new j(this.v0, this.f3913y0, this.E0, objectRef2, this.F0, null);
                                            this.f3910u0 = awaitPointerEventScope4;
                                            this.f3905p0 = objectRef2;
                                            this.f3906q0 = pointerInputChange3;
                                            this.f3909t0 = 5;
                                            if (awaitPointerEventScope4.withTimeout(longPressTimeoutMillis, jVar, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                        } catch (PointerEventTimeoutCancellationException unused2) {
                                            pointerInputChange4 = pointerInputChange3;
                                            awaitPointerEventScope5 = awaitPointerEventScope4;
                                            objectRef3 = objectRef2;
                                            if (function1 != null) {
                                                function1.invoke(Offset.m2264boximpl(((PointerInputChange) objectRef3.element).getPosition()));
                                            }
                                            if (function2 != null) {
                                                function2.invoke(Offset.m2264boximpl(pointerInputChange4.getPosition()));
                                            }
                                            this.f3910u0 = null;
                                            this.f3905p0 = null;
                                            this.f3906q0 = null;
                                            this.f3909t0 = 6;
                                            if (TapGestureDetectorKt.access$consumeUntilUp(awaitPointerEventScope5, this) == coroutine_suspended) {
                                                return coroutine_suspended;
                                            }
                                            BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new C0021a(iVar, null), 3, null);
                                        }
                                    } else if (function1 != null) {
                                        function1.invoke(Offset.m2264boximpl(((PointerInputChange) objectRef2.element).getPosition()));
                                    }
                                } else if (function1 != null) {
                                    function1.invoke(Offset.m2264boximpl(((PointerInputChange) t12).getPosition()));
                                }
                            }
                            return Unit.INSTANCE;
                        } catch (PointerEventTimeoutCancellationException unused3) {
                            awaitPointerEventScope3 = awaitPointerEventScope;
                            if (function2 != null) {
                                function2.invoke(Offset.m2264boximpl(pointerInputChange.getPosition()));
                            }
                            this.f3910u0 = awaitPointerEventScope3;
                            this.f3905p0 = objectRef;
                            this.f3906q0 = null;
                            this.f3907r0 = null;
                            this.f3908s0 = longPressTimeoutMillis;
                            this.f3909t0 = 3;
                            if (TapGestureDetectorKt.access$consumeUntilUp(awaitPointerEventScope3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new g(iVar, null), 3, null);
                            objectRef2 = objectRef;
                            awaitPointerEventScope2 = awaitPointerEventScope3;
                            t12 = objectRef2.element;
                            if (t12 != 0) {
                                if (this.f3913y0 == null) {
                                    this.f3910u0 = awaitPointerEventScope2;
                                    this.f3905p0 = objectRef2;
                                    this.f3906q0 = null;
                                    this.f3907r0 = null;
                                    this.f3908s0 = longPressTimeoutMillis;
                                    this.f3909t0 = 4;
                                    objAccess$awaitSecondDown = TapGestureDetectorKt.access$awaitSecondDown(awaitPointerEventScope2, (PointerInputChange) t12, this);
                                    if (objAccess$awaitSecondDown == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    awaitPointerEventScope4 = awaitPointerEventScope2;
                                    pointerInputChange3 = (PointerInputChange) objAccess$awaitSecondDown;
                                    if (pointerInputChange3 != null) {
                                        BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new h(iVar, null), 3, null);
                                        if (function3 != TapGestureDetectorKt.f3873a) {
                                            BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new i(function3, iVar, pointerInputChange3, null), 3, null);
                                        }
                                        jVar = new j(this.v0, this.f3913y0, this.E0, objectRef2, this.F0, null);
                                        this.f3910u0 = awaitPointerEventScope4;
                                        this.f3905p0 = objectRef2;
                                        this.f3906q0 = pointerInputChange3;
                                        this.f3909t0 = 5;
                                        if (awaitPointerEventScope4.withTimeout(longPressTimeoutMillis, jVar, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else if (function1 != null) {
                                        function1.invoke(Offset.m2264boximpl(((PointerInputChange) objectRef2.element).getPosition()));
                                    }
                                } else if (function1 != null) {
                                    function1.invoke(Offset.m2264boximpl(((PointerInputChange) t12).getPosition()));
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    case 1:
                        AwaitPointerEventScope awaitPointerEventScope7 = (AwaitPointerEventScope) this.f3910u0;
                        ResultKt.throwOnFailure(obj);
                        awaitPointerEventScope = awaitPointerEventScope7;
                        objAwaitFirstDown$default = obj;
                        pointerInputChange = (PointerInputChange) objAwaitFirstDown$default;
                        pointerInputChange.consume();
                        BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new b(iVar, null), 3, null);
                        if (function3 != TapGestureDetectorKt.f3873a) {
                            BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new c(function3, iVar, pointerInputChange, null), 3, null);
                        }
                        if (function2 != null) {
                            longPressTimeoutMillis = awaitPointerEventScope.getViewConfiguration().getLongPressTimeoutMillis();
                        } else {
                            longPressTimeoutMillis = DurationKt.MAX_MILLIS;
                        }
                        objectRef = new Ref.ObjectRef();
                        C0022d c0022d2 = new C0022d(2, null);
                        this.f3910u0 = awaitPointerEventScope;
                        this.f3905p0 = pointerInputChange;
                        this.f3906q0 = objectRef;
                        this.f3907r0 = objectRef;
                        this.f3908s0 = longPressTimeoutMillis;
                        this.f3909t0 = 2;
                        objWithTimeout = awaitPointerEventScope.withTimeout(longPressTimeoutMillis, c0022d2, this);
                        if (objWithTimeout == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        pointerInputChange2 = pointerInputChange;
                        objectRef2 = objectRef;
                        t10 = objWithTimeout;
                        objectRef.element = t10;
                        t11 = objectRef2.element;
                        if (t11 == 0) {
                            BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new e(iVar, null), 3, null);
                        } else {
                            ((PointerInputChange) t11).consume();
                            BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new f(iVar, null), 3, null);
                        }
                        t12 = objectRef2.element;
                        if (t12 != 0) {
                            if (this.f3913y0 == null) {
                                this.f3910u0 = awaitPointerEventScope2;
                                this.f3905p0 = objectRef2;
                                this.f3906q0 = null;
                                this.f3907r0 = null;
                                this.f3908s0 = longPressTimeoutMillis;
                                this.f3909t0 = 4;
                                objAccess$awaitSecondDown = TapGestureDetectorKt.access$awaitSecondDown(awaitPointerEventScope2, (PointerInputChange) t12, this);
                                if (objAccess$awaitSecondDown == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                awaitPointerEventScope4 = awaitPointerEventScope2;
                                pointerInputChange3 = (PointerInputChange) objAccess$awaitSecondDown;
                                if (pointerInputChange3 != null) {
                                    BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new h(iVar, null), 3, null);
                                    if (function3 != TapGestureDetectorKt.f3873a) {
                                        BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new i(function3, iVar, pointerInputChange3, null), 3, null);
                                    }
                                    jVar = new j(this.v0, this.f3913y0, this.E0, objectRef2, this.F0, null);
                                    this.f3910u0 = awaitPointerEventScope4;
                                    this.f3905p0 = objectRef2;
                                    this.f3906q0 = pointerInputChange3;
                                    this.f3909t0 = 5;
                                    if (awaitPointerEventScope4.withTimeout(longPressTimeoutMillis, jVar, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else if (function1 != null) {
                                    function1.invoke(Offset.m2264boximpl(((PointerInputChange) objectRef2.element).getPosition()));
                                }
                            } else if (function1 != null) {
                                function1.invoke(Offset.m2264boximpl(((PointerInputChange) t12).getPosition()));
                            }
                        }
                        return Unit.INSTANCE;
                    case 2:
                        longPressTimeoutMillis = this.f3908s0;
                        objectRef = this.f3907r0;
                        Ref.ObjectRef objectRef4 = (Ref.ObjectRef) this.f3906q0;
                        pointerInputChange = (PointerInputChange) this.f3905p0;
                        awaitPointerEventScope = (AwaitPointerEventScope) this.f3910u0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            awaitPointerEventScope2 = awaitPointerEventScope;
                            pointerInputChange2 = pointerInputChange;
                            objectRef2 = objectRef4;
                            t10 = obj;
                            objectRef.element = t10;
                            t11 = objectRef2.element;
                            if (t11 == 0) {
                                BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new e(iVar, null), 3, null);
                            } else {
                                ((PointerInputChange) t11).consume();
                                BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new f(iVar, null), 3, null);
                            }
                            break;
                        } catch (PointerEventTimeoutCancellationException unused4) {
                            objectRef = objectRef4;
                            awaitPointerEventScope3 = awaitPointerEventScope;
                            if (function2 != null) {
                                function2.invoke(Offset.m2264boximpl(pointerInputChange.getPosition()));
                            }
                            this.f3910u0 = awaitPointerEventScope3;
                            this.f3905p0 = objectRef;
                            this.f3906q0 = null;
                            this.f3907r0 = null;
                            this.f3908s0 = longPressTimeoutMillis;
                            this.f3909t0 = 3;
                            if (TapGestureDetectorKt.access$consumeUntilUp(awaitPointerEventScope3, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new g(iVar, null), 3, null);
                            objectRef2 = objectRef;
                            awaitPointerEventScope2 = awaitPointerEventScope3;
                            t12 = objectRef2.element;
                            if (t12 != 0) {
                                if (this.f3913y0 == null) {
                                    this.f3910u0 = awaitPointerEventScope2;
                                    this.f3905p0 = objectRef2;
                                    this.f3906q0 = null;
                                    this.f3907r0 = null;
                                    this.f3908s0 = longPressTimeoutMillis;
                                    this.f3909t0 = 4;
                                    objAccess$awaitSecondDown = TapGestureDetectorKt.access$awaitSecondDown(awaitPointerEventScope2, (PointerInputChange) t12, this);
                                    if (objAccess$awaitSecondDown == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                    awaitPointerEventScope4 = awaitPointerEventScope2;
                                    pointerInputChange3 = (PointerInputChange) objAccess$awaitSecondDown;
                                    if (pointerInputChange3 != null) {
                                        BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new h(iVar, null), 3, null);
                                        if (function3 != TapGestureDetectorKt.f3873a) {
                                            BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new i(function3, iVar, pointerInputChange3, null), 3, null);
                                        }
                                        jVar = new j(this.v0, this.f3913y0, this.E0, objectRef2, this.F0, null);
                                        this.f3910u0 = awaitPointerEventScope4;
                                        this.f3905p0 = objectRef2;
                                        this.f3906q0 = pointerInputChange3;
                                        this.f3909t0 = 5;
                                        if (awaitPointerEventScope4.withTimeout(longPressTimeoutMillis, jVar, this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else if (function1 != null) {
                                        function1.invoke(Offset.m2264boximpl(((PointerInputChange) objectRef2.element).getPosition()));
                                    }
                                } else if (function1 != null) {
                                    function1.invoke(Offset.m2264boximpl(((PointerInputChange) t12).getPosition()));
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        t12 = objectRef2.element;
                        if (t12 != 0) {
                            if (this.f3913y0 == null) {
                                this.f3910u0 = awaitPointerEventScope2;
                                this.f3905p0 = objectRef2;
                                this.f3906q0 = null;
                                this.f3907r0 = null;
                                this.f3908s0 = longPressTimeoutMillis;
                                this.f3909t0 = 4;
                                objAccess$awaitSecondDown = TapGestureDetectorKt.access$awaitSecondDown(awaitPointerEventScope2, (PointerInputChange) t12, this);
                                if (objAccess$awaitSecondDown == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                awaitPointerEventScope4 = awaitPointerEventScope2;
                                pointerInputChange3 = (PointerInputChange) objAccess$awaitSecondDown;
                                if (pointerInputChange3 != null) {
                                    BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new h(iVar, null), 3, null);
                                    if (function3 != TapGestureDetectorKt.f3873a) {
                                        BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new i(function3, iVar, pointerInputChange3, null), 3, null);
                                    }
                                    jVar = new j(this.v0, this.f3913y0, this.E0, objectRef2, this.F0, null);
                                    this.f3910u0 = awaitPointerEventScope4;
                                    this.f3905p0 = objectRef2;
                                    this.f3906q0 = pointerInputChange3;
                                    this.f3909t0 = 5;
                                    if (awaitPointerEventScope4.withTimeout(longPressTimeoutMillis, jVar, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else if (function1 != null) {
                                    function1.invoke(Offset.m2264boximpl(((PointerInputChange) objectRef2.element).getPosition()));
                                }
                            } else if (function1 != null) {
                                function1.invoke(Offset.m2264boximpl(((PointerInputChange) t12).getPosition()));
                            }
                        }
                        return Unit.INSTANCE;
                    case 3:
                        longPressTimeoutMillis = this.f3908s0;
                        objectRef = (Ref.ObjectRef) this.f3905p0;
                        awaitPointerEventScope3 = (AwaitPointerEventScope) this.f3910u0;
                        ResultKt.throwOnFailure(obj);
                        BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new g(iVar, null), 3, null);
                        objectRef2 = objectRef;
                        awaitPointerEventScope2 = awaitPointerEventScope3;
                        t12 = objectRef2.element;
                        if (t12 != 0) {
                            if (this.f3913y0 == null) {
                                this.f3910u0 = awaitPointerEventScope2;
                                this.f3905p0 = objectRef2;
                                this.f3906q0 = null;
                                this.f3907r0 = null;
                                this.f3908s0 = longPressTimeoutMillis;
                                this.f3909t0 = 4;
                                objAccess$awaitSecondDown = TapGestureDetectorKt.access$awaitSecondDown(awaitPointerEventScope2, (PointerInputChange) t12, this);
                                if (objAccess$awaitSecondDown == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                awaitPointerEventScope4 = awaitPointerEventScope2;
                                pointerInputChange3 = (PointerInputChange) objAccess$awaitSecondDown;
                                if (pointerInputChange3 != null) {
                                    BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new h(iVar, null), 3, null);
                                    if (function3 != TapGestureDetectorKt.f3873a) {
                                        BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new i(function3, iVar, pointerInputChange3, null), 3, null);
                                    }
                                    jVar = new j(this.v0, this.f3913y0, this.E0, objectRef2, this.F0, null);
                                    this.f3910u0 = awaitPointerEventScope4;
                                    this.f3905p0 = objectRef2;
                                    this.f3906q0 = pointerInputChange3;
                                    this.f3909t0 = 5;
                                    if (awaitPointerEventScope4.withTimeout(longPressTimeoutMillis, jVar, this) == coroutine_suspended) {
                                        return coroutine_suspended;
                                    }
                                } else if (function1 != null) {
                                    function1.invoke(Offset.m2264boximpl(((PointerInputChange) objectRef2.element).getPosition()));
                                }
                            } else if (function1 != null) {
                                function1.invoke(Offset.m2264boximpl(((PointerInputChange) t12).getPosition()));
                            }
                        }
                        return Unit.INSTANCE;
                    case 4:
                        longPressTimeoutMillis = this.f3908s0;
                        Ref.ObjectRef objectRef5 = (Ref.ObjectRef) this.f3905p0;
                        awaitPointerEventScope4 = (AwaitPointerEventScope) this.f3910u0;
                        ResultKt.throwOnFailure(obj);
                        objectRef2 = objectRef5;
                        objAccess$awaitSecondDown = obj;
                        pointerInputChange3 = (PointerInputChange) objAccess$awaitSecondDown;
                        if (pointerInputChange3 != null) {
                            BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new h(iVar, null), 3, null);
                            if (function3 != TapGestureDetectorKt.f3873a) {
                                BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new i(function3, iVar, pointerInputChange3, null), 3, null);
                            }
                            jVar = new j(this.v0, this.f3913y0, this.E0, objectRef2, this.F0, null);
                            this.f3910u0 = awaitPointerEventScope4;
                            this.f3905p0 = objectRef2;
                            this.f3906q0 = pointerInputChange3;
                            this.f3909t0 = 5;
                            if (awaitPointerEventScope4.withTimeout(longPressTimeoutMillis, jVar, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else if (function1 != null) {
                            function1.invoke(Offset.m2264boximpl(((PointerInputChange) objectRef2.element).getPosition()));
                        }
                        return Unit.INSTANCE;
                    case 5:
                        pointerInputChange4 = (PointerInputChange) this.f3906q0;
                        objectRef3 = (Ref.ObjectRef) this.f3905p0;
                        awaitPointerEventScope5 = (AwaitPointerEventScope) this.f3910u0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            break;
                        } catch (PointerEventTimeoutCancellationException unused5) {
                            if (function1 != null) {
                                function1.invoke(Offset.m2264boximpl(((PointerInputChange) objectRef3.element).getPosition()));
                            }
                            if (function2 != null) {
                                function2.invoke(Offset.m2264boximpl(pointerInputChange4.getPosition()));
                            }
                            this.f3910u0 = null;
                            this.f3905p0 = null;
                            this.f3906q0 = null;
                            this.f3909t0 = 6;
                            if (TapGestureDetectorKt.access$consumeUntilUp(awaitPointerEventScope5, this) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new C0021a(iVar, null), 3, null);
                        }
                        return Unit.INSTANCE;
                    case 6:
                        ResultKt.throwOnFailure(obj);
                        BuildersKt__Builders_commonKt.launch$default(this.v0, null, null, new C0021a(iVar, null), 3, null);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(PointerInputScope pointerInputScope, Function1 function1, Function1 function2, Function3 function3, Function1 function4, Continuation continuation) {
            super(2, continuation);
            this.f3901r0 = pointerInputScope;
            this.f3902s0 = function3;
            this.f3903t0 = function1;
            this.f3904u0 = function2;
            this.v0 = function4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = new d(this.f3901r0, this.f3903t0, this.f3904u0, this.f3902s0, this.v0, continuation);
            dVar.f3900q0 = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3899p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.f3900q0;
                PointerInputScope pointerInputScope = this.f3901r0;
                a aVar = new a(coroutineScope, this.f3902s0, this.f3903t0, this.f3904u0, this.v0, new i(pointerInputScope), null);
                this.f3899p0 = 1;
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

    /* JADX INFO: compiled from: TapGestureDetector.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.TapGestureDetectorKt", f = "TapGestureDetector.kt", i = {0, 0, 1, 1}, l = {305, 320}, m = "waitForUpOrCancellation", n = {"$this$waitForUpOrCancellation", "pass", "$this$waitForUpOrCancellation", "pass"}, s = {"L$0", "L$1", "L$0", "L$1"})
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public AwaitPointerEventScope f3940p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public PointerEventPass f3941q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f3942r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f3943s0;

        public e() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f3942r0 = obj;
            this.f3943s0 |= Integer.MIN_VALUE;
            return TapGestureDetectorKt.waitForUpOrCancellation(null, null, this);
        }
    }

    public static final Object access$awaitSecondDown(AwaitPointerEventScope awaitPointerEventScope, PointerInputChange pointerInputChange, Continuation continuation) {
        return awaitPointerEventScope.withTimeoutOrNull(awaitPointerEventScope.getViewConfiguration().getDoubleTapTimeoutMillis(), new p(pointerInputChange, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0050 A[LOOP:0: B:19:0x004e->B:20:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x0073 A[LOOP:1: B:22:0x0064->B:26:0x0073, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x0036 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003f -> B:18:0x0042). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:23:0x0066
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object access$consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope r8, kotlin.coroutines.Continuation r9) {
        /*
            boolean r0 = r9 instanceof u.q
            if (r0 == 0) goto L13
            r0 = r9
            u.q r0 = (u.q) r0
            int r1 = r0.f93694r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f93694r0 = r1
            goto L18
        L13:
            u.q r0 = new u.q
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.f93693q0
            java.lang.Object r1 = ek.a.getCOROUTINE_SUSPENDED()
            int r2 = r0.f93694r0
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r8 = r0.f93692p0
            kotlin.ResultKt.throwOnFailure(r9)
            goto L42
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L33:
            kotlin.ResultKt.throwOnFailure(r9)
        L36:
            r0.f93692p0 = r8
            r0.f93694r0 = r3
            r9 = 0
            java.lang.Object r9 = e1.a.t(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L42
            goto L78
        L42:
            androidx.compose.ui.input.pointer.PointerEvent r9 = (androidx.compose.ui.input.pointer.PointerEvent) r9
            java.util.List r2 = r9.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L4e:
            if (r6 >= r4) goto L5c
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            r7.consume()
            int r6 = r6 + 1
            goto L4e
        L5c:
            java.util.List r9 = r9.getChanges()
            int r2 = r9.size()
        L64:
            if (r5 >= r2) goto L76
            java.lang.Object r4 = r9.get(r5)
            androidx.compose.ui.input.pointer.PointerInputChange r4 = (androidx.compose.ui.input.pointer.PointerInputChange) r4
            boolean r4 = r4.getPressed()
            if (r4 == 0) goto L73
            goto L36
        L73:
            int r5 = r5 + 1
            goto L64
        L76:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
        L78:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.access$consumeUntilUp(androidx.compose.ui.input.pointer.AwaitPointerEventScope, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x005b  */
    /* JADX WARN: Code duplicated, block: B:22:0x0063  */
    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:26:0x006f A[LOOP:0: B:19:0x0059->B:26:0x006f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x003e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004a -> B:18:0x004d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:20:0x005b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object awaitFirstDown(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r9, boolean r10, @org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.PointerEventPass r11, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r12) {
        /*
            boolean r0 = r12 instanceof androidx.compose.foundation.gestures.TapGestureDetectorKt.b
            if (r0 == 0) goto L13
            r0 = r12
            androidx.compose.foundation.gestures.TapGestureDetectorKt$b r0 = (androidx.compose.foundation.gestures.TapGestureDetectorKt.b) r0
            int r1 = r0.f3878t0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f3878t0 = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.TapGestureDetectorKt$b r0 = new androidx.compose.foundation.gestures.TapGestureDetectorKt$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f3877s0
            java.lang.Object r1 = ek.a.getCOROUTINE_SUSPENDED()
            int r2 = r0.f3878t0
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            boolean r9 = r0.f3876r0
            androidx.compose.ui.input.pointer.PointerEventPass r10 = r0.f3875q0
            androidx.compose.ui.input.pointer.AwaitPointerEventScope r11 = r0.f3874p0
            kotlin.ResultKt.throwOnFailure(r12)
            r8 = r10
            r10 = r9
            r9 = r11
            r11 = r8
            goto L4d
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            kotlin.ResultKt.throwOnFailure(r12)
        L3e:
            r0.f3874p0 = r9
            r0.f3875q0 = r11
            r0.f3876r0 = r10
            r0.f3878t0 = r3
            java.lang.Object r12 = r9.awaitPointerEvent(r11, r0)
            if (r12 != r1) goto L4d
            return r1
        L4d:
            androidx.compose.ui.input.pointer.PointerEvent r12 = (androidx.compose.ui.input.pointer.PointerEvent) r12
            java.util.List r2 = r12.getChanges()
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L59:
            if (r6 >= r4) goto L72
            java.lang.Object r7 = r2.get(r6)
            androidx.compose.ui.input.pointer.PointerInputChange r7 = (androidx.compose.ui.input.pointer.PointerInputChange) r7
            if (r10 == 0) goto L68
            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDown(r7)
            goto L6c
        L68:
            boolean r7 = androidx.compose.ui.input.pointer.PointerEventKt.changedToDownIgnoreConsumed(r7)
        L6c:
            if (r7 != 0) goto L6f
            goto L3e
        L6f:
            int r6 = r6 + 1
            goto L59
        L72:
            java.util.List r9 = r12.getChanges()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.awaitFirstDown(androidx.compose.ui.input.pointer.AwaitPointerEventScope, boolean, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return awaitFirstDown(awaitPointerEventScope, z10, continuation);
    }

    @Nullable
    public static final Object detectTapAndPress(@NotNull PointerInputScope pointerInputScope, @NotNull Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, @Nullable Function1<? super Offset, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new c(pointerInputScope, function3, function1, new i(pointerInputScope), null), continuation);
        return objCoroutineScope == ek.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectTapAndPress$default(PointerInputScope pointerInputScope, Function3 function3, Function1 function1, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            function3 = f3873a;
        }
        if ((i10 & 2) != 0) {
            function1 = null;
        }
        return detectTapAndPress(pointerInputScope, function3, function1, continuation);
    }

    @Nullable
    public static final Object detectTapGestures(@NotNull PointerInputScope pointerInputScope, @Nullable Function1<? super Offset, Unit> function1, @Nullable Function1<? super Offset, Unit> function2, @NotNull Function3<? super PressGestureScope, ? super Offset, ? super Continuation<? super Unit>, ? extends Object> function3, @Nullable Function1<? super Offset, Unit> function4, @NotNull Continuation<? super Unit> continuation) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new d(pointerInputScope, function2, function1, function3, function4, null), continuation);
        return objCoroutineScope == ek.a.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
    }

    public static /* synthetic */ Object detectTapGestures$default(PointerInputScope pointerInputScope, Function1 function1, Function1 function2, Function3 function3, Function1 function4, Continuation continuation, int i10, Object obj) {
        Function1 function5 = (i10 & 1) != 0 ? null : function1;
        Function1 function6 = (i10 & 2) != 0 ? null : function2;
        if ((i10 & 4) != 0) {
            function3 = f3873a;
        }
        return detectTapGestures(pointerInputScope, function5, function6, function3, (i10 & 8) != 0 ? null : function4, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c  */
    /* JADX WARN: Code duplicated, block: B:37:0x00bd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00de A[LOOP:1: B:23:0x0077->B:45:0x00de, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00ae A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bb -> B:13:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object waitForUpOrCancellation(@org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.AwaitPointerEventScope r18, @org.jetbrains.annotations.NotNull androidx.compose.ui.input.pointer.PointerEventPass r19, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super androidx.compose.ui.input.pointer.PointerInputChange> r20) {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.TapGestureDetectorKt.waitForUpOrCancellation(androidx.compose.ui.input.pointer.AwaitPointerEventScope, androidx.compose.ui.input.pointer.PointerEventPass, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object waitForUpOrCancellation$default(AwaitPointerEventScope awaitPointerEventScope, PointerEventPass pointerEventPass, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return waitForUpOrCancellation(awaitPointerEventScope, pointerEventPass, continuation);
    }

    public static /* synthetic */ Object awaitFirstDown$default(AwaitPointerEventScope awaitPointerEventScope, boolean z10, PointerEventPass pointerEventPass, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            pointerEventPass = PointerEventPass.Main;
        }
        return awaitFirstDown(awaitPointerEventScope, z10, pointerEventPass, continuation);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Maintained for binary compatibility. Use version with PointerEventPass instead.")
    public static final /* synthetic */ Object awaitFirstDown(AwaitPointerEventScope awaitPointerEventScope, boolean z10, Continuation continuation) {
        return awaitFirstDown(awaitPointerEventScope, z10, PointerEventPass.Main, continuation);
    }
}
