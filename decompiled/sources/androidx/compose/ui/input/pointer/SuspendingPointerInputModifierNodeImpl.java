package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DpRect;
import androidx.compose.ui.unit.IntSize;
import com.bbva.sdkcatalog.openpay.plugin.data.error.ErrorCodes;
import e1.g;
import i1.n;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001>B3\u0012'\u0010$\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015¢\u0006\u0002\b\u0019ø\u0001\u0001¢\u0006\u0004\b=\u0010#J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0005H\u0016J-\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0013\u001a\u00020\u0005H\u0016JB\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00142'\u0010\u001a\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015¢\u0006\u0002\b\u0019H\u0096@ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cRo\u0010$\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015¢\u0006\u0002\b\u00192'\u0010\u001d\u001a#\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0017\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015¢\u0006\u0002\b\u00198\u0016@VX\u0096\u000eø\u0001\u0001¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0014\u00106\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u001d\u00109\u001a\u00020\u000e8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b7\u00108R\u001d\u0010<\u001a\u00020:8VX\u0096\u0004ø\u0001\u0001ø\u0001\u0000ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b;\u00108\u0082\u0002\u000f\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0002\b!¨\u0006?"}, d2 = {"Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNode;", "Landroidx/compose/ui/input/pointer/PointerInputScope;", "Landroidx/compose/ui/unit/Density;", "", "onDetach", "onDensityChange", "onViewConfigurationChange", "resetPointerInputHandler", "Landroidx/compose/ui/input/pointer/PointerEvent;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Landroidx/compose/ui/unit/IntSize;", "bounds", "onPointerEvent-H0pRuoY", "(Landroidx/compose/ui/input/pointer/PointerEvent;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "onPointerEvent", "onCancelPointerInput", "R", "Lkotlin/Function2;", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "awaitPointerEventScope", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "value", "H0", "Lkotlin/jvm/functions/Function2;", "getPointerInputHandler", "()Lkotlin/jvm/functions/Function2;", "setPointerInputHandler", "(Lkotlin/jvm/functions/Function2;)V", "pointerInputHandler", "", "O0", "Z", "getInterceptOutOfBoundsChildEvents", "()Z", "setInterceptOutOfBoundsChildEvents", "(Z)V", "interceptOutOfBoundsChildEvents", "", "getDensity", "()F", "density", "getFontScale", "fontScale", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "getSize-YbymL2g", "()J", "size", "Landroidx/compose/ui/geometry/Size;", "getExtendedTouchPadding-NH-jbRc", "extendedTouchPadding", "<init>", "a", "ui_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 TempListUtils.kt\nandroidx/compose/ui/TempListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,775:1\n519#1:806\n520#1:808\n522#1,4:810\n528#1:825\n531#1,3:837\n1182#2:776\n1161#2,2:777\n1182#2:779\n1161#2,2:780\n34#3:782\n34#3:807\n34#3:879\n146#4:783\n460#4,11:784\n492#4,11:795\n146#4:809\n460#4,11:814\n492#4,11:826\n728#4,2:880\n86#5,2:840\n33#5,6:842\n88#5:848\n86#5,2:849\n33#5,6:851\n88#5:857\n33#5,4:861\n38#5:868\n135#6,3:858\n138#6:865\n139#6:867\n140#6:869\n1#7:866\n314#8,9:870\n323#8,2:882\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl\n*L\n543#1:806\n543#1:808\n543#1:810,4\n543#1:825\n543#1:837,3\n435#1:776\n435#1:777,2\n444#1:779\n444#1:780,2\n519#1:782\n543#1:807\n611#1:879\n520#1:783\n525#1:784,11\n528#1:795,11\n543#1:809\n543#1:814,11\n543#1:826,11\n612#1:880,2\n569#1:840,2\n569#1:842,6\n569#1:848\n579#1:849,2\n579#1:851,6\n579#1:857\n582#1:861,4\n582#1:868\n582#1:858,3\n582#1:865\n582#1:867\n582#1:869\n582#1:866\n609#1:870,9\n609#1:882,2\n*E\n"})
public final class SuspendingPointerInputModifierNodeImpl extends Modifier.Node implements SuspendingPointerInputModifierNode, PointerInputScope, Density {

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    @NotNull
    public Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> pointerInputHandler;

    @Nullable
    public Job I0;

    @NotNull
    public PointerEvent J0;

    @NotNull
    public final MutableVector<a<?>> K0;

    @NotNull
    public final MutableVector<a<?>> L0;

    @Nullable
    public PointerEvent M0;
    public long N0;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    public boolean interceptOutOfBoundsChildEvents;

    /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PointerEventPass.values().length];
            try {
                iArr[PointerEventPass.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PointerEventPass.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PointerEventPass.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
    @SourceDebugExtension({"SMAP\nSuspendingPointerInputFilter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine\n+ 2 JvmActuals.jvm.kt\nandroidx/compose/ui/platform/JvmActuals_jvmKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,775:1\n34#2:776\n735#3,2:777\n314#4,11:779\n*S KotlinDebug\n*F\n+ 1 SuspendingPointerInputFilter.kt\nandroidx/compose/ui/input/pointer/SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine\n*L\n681#1:776\n682#1:777,2\n689#1:779,11\n*E\n"})
    public final class a<R> implements AwaitPointerEventScope, Density, Continuation<R> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        @NotNull
        public final Continuation<R> f16468p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ SuspendingPointerInputModifierNodeImpl f16469q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        @Nullable
        public CancellableContinuation<? super PointerEvent> f16470r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        @NotNull
        public PointerEventPass f16471s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        @NotNull
        public final EmptyCoroutineContext f16472t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ SuspendingPointerInputModifierNodeImpl f16473u0;

        /* JADX INFO: renamed from: androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
        @DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", i = {0}, l = {728}, m = "withTimeout", n = {"job"}, s = {"L$0"})
        public static final class C0062a<T> extends ContinuationImpl {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public Job f16474p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public /* synthetic */ Object f16475q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ a<R> f16476r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public int f16477s0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0062a(a<R> aVar, Continuation<? super C0062a> continuation) {
                super(continuation);
                this.f16476r0 = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f16475q0 = obj;
                this.f16477s0 |= Integer.MIN_VALUE;
                return this.f16476r0.withTimeout(0L, null, this);
            }
        }

        /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
        @DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine$withTimeout$job$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {720, ErrorCodes.BLUETOOTH_PERMISSION}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f16478p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ long f16479q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ a<R> f16480r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j10, a<R> aVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f16479q0 = j10;
                this.f16480r0 = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                return new b(this.f16479q0, this.f16480r0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code duplicated, block: B:18:0x003f  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                CancellableContinuation<? super PointerEvent> cancellableContinuation;
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f16478p0;
                long j10 = this.f16479q0;
                if (i10 != 0) {
                    if (i10 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        if (i10 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    cancellableContinuation = this.f16480r0.f16470r0;
                    if (cancellableContinuation != null) {
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(new PointerEventTimeoutCancellationException(j10))));
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                this.f16478p0 = 1;
                if (DelayKt.delay(j10 - 1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                this.f16478p0 = 2;
                if (DelayKt.delay(1L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                cancellableContinuation = this.f16480r0.f16470r0;
                if (cancellableContinuation != null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(new PointerEventTimeoutCancellationException(j10))));
                }
                return Unit.INSTANCE;
            }
        }

        /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
        @DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$PointerEventHandlerCoroutine", f = "SuspendingPointerInputFilter.kt", i = {}, l = {699}, m = "withTimeoutOrNull", n = {}, s = {})
        public static final class c<T> extends ContinuationImpl {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public /* synthetic */ Object f16481p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ a<R> f16482q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public int f16483r0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(a<R> aVar, Continuation<? super c> continuation) {
                super(continuation);
                this.f16482q0 = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f16481p0 = obj;
                this.f16483r0 |= Integer.MIN_VALUE;
                return this.f16482q0.withTimeoutOrNull(0L, null, this);
            }
        }

        public a(@NotNull SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl, CancellableContinuationImpl completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            this.f16473u0 = suspendingPointerInputModifierNodeImpl;
            this.f16468p0 = completion;
            this.f16469q0 = suspendingPointerInputModifierNodeImpl;
            this.f16471s0 = PointerEventPass.Main;
            this.f16472t0 = EmptyCoroutineContext.INSTANCE;
        }

        public final void a(@NotNull PointerEvent event, @NotNull PointerEventPass pass) {
            CancellableContinuation<? super PointerEvent> cancellableContinuation;
            Intrinsics.checkNotNullParameter(event, "event");
            Intrinsics.checkNotNullParameter(pass, "pass");
            if (pass != this.f16471s0 || (cancellableContinuation = this.f16470r0) == null) {
                return;
            }
            this.f16470r0 = null;
            cancellableContinuation.resumeWith(Result.m5535constructorimpl(event));
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @Nullable
        public final Object awaitPointerEvent(@NotNull PointerEventPass pointerEventPass, @NotNull Continuation<? super PointerEvent> continuation) throws Throwable {
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
            cancellableContinuationImpl.initCancellability();
            this.f16471s0 = pointerEventPass;
            this.f16470r0 = cancellableContinuationImpl;
            Object result = cancellableContinuationImpl.getResult();
            if (result == ek.a.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return result;
        }

        @Override // kotlin.coroutines.Continuation
        @NotNull
        /* JADX INFO: renamed from: getContext */
        public final CoroutineContext getF79378p0() {
            return this.f16472t0;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @NotNull
        public final PointerEvent getCurrentEvent() {
            return this.f16473u0.J0;
        }

        @Override // androidx.compose.ui.unit.Density
        public final float getDensity() {
            return this.f16469q0.getDensity();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc */
        public final long mo3395getExtendedTouchPaddingNHjbRc() {
            return this.f16473u0.mo3498getExtendedTouchPaddingNHjbRc();
        }

        @Override // androidx.compose.ui.unit.Density
        public final float getFontScale() {
            return this.f16469q0.getFontScale();
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        /* JADX INFO: renamed from: getSize-YbymL2g */
        public final long mo3396getSizeYbymL2g() {
            return this.f16473u0.N0;
        }

        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @NotNull
        public final ViewConfiguration getViewConfiguration() {
            return this.f16473u0.getViewConfiguration();
        }

        @Override // kotlin.coroutines.Continuation
        public final void resumeWith(@NotNull Object obj) {
            MutableVector mutableVector = this.f16473u0.K0;
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f16473u0;
            synchronized (mutableVector) {
                suspendingPointerInputModifierNodeImpl.K0.remove(this);
                Unit unit = Unit.INSTANCE;
            }
            this.f16468p0.resumeWith(obj);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: roundToPx--R2X_6o */
        public final int mo412roundToPxR2X_6o(long j10) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f16469q0;
            suspendingPointerInputModifierNodeImpl.getClass();
            return x1.a.a(suspendingPointerInputModifierNodeImpl, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: roundToPx-0680j_4 */
        public final int mo413roundToPx0680j_4(float f6) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f16469q0;
            suspendingPointerInputModifierNodeImpl.getClass();
            return x1.a.b(suspendingPointerInputModifierNodeImpl, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toDp-GaN1DYA */
        public final float mo404toDpGaN1DYA(long j10) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f16469q0;
            suspendingPointerInputModifierNodeImpl.getClass();
            return x1.a.c(suspendingPointerInputModifierNodeImpl, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public final float mo405toDpu2uoSUM(float f6) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f16469q0;
            suspendingPointerInputModifierNodeImpl.getClass();
            return x1.a.d(suspendingPointerInputModifierNodeImpl, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toDpSize-k-rfVVM */
        public final long mo407toDpSizekrfVVM(long j10) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f16469q0;
            suspendingPointerInputModifierNodeImpl.getClass();
            return x1.a.f(suspendingPointerInputModifierNodeImpl, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toPx--R2X_6o */
        public final float mo414toPxR2X_6o(long j10) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f16469q0;
            suspendingPointerInputModifierNodeImpl.getClass();
            return x1.a.g(suspendingPointerInputModifierNodeImpl, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toPx-0680j_4 */
        public final float mo415toPx0680j_4(float f6) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f16469q0;
            suspendingPointerInputModifierNodeImpl.getClass();
            return x1.a.h(suspendingPointerInputModifierNodeImpl, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        @NotNull
        public final Rect toRect(@NotNull DpRect dpRect) {
            Intrinsics.checkNotNullParameter(dpRect, "<this>");
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f16469q0;
            suspendingPointerInputModifierNodeImpl.getClass();
            return x1.a.i(suspendingPointerInputModifierNodeImpl, dpRect);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toSize-XkaWNTQ */
        public final long mo408toSizeXkaWNTQ(long j10) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f16469q0;
            suspendingPointerInputModifierNodeImpl.getClass();
            return x1.a.j(suspendingPointerInputModifierNodeImpl, j10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toSp-0xMU5do */
        public final long mo409toSp0xMU5do(float f6) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f16469q0;
            suspendingPointerInputModifierNodeImpl.getClass();
            return x1.a.k(suspendingPointerInputModifierNodeImpl, f6);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public final long mo410toSpkPz2Gy4(float f6) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f16469q0;
            suspendingPointerInputModifierNodeImpl.getClass();
            return x1.a.l(suspendingPointerInputModifierNodeImpl, f6);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r11v3, types: [kotlinx.coroutines.Job] */
        /* JADX WARN: Type inference failed for: r11v6 */
        /* JADX WARN: Type inference failed for: r11v7 */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @Nullable
        public final <T> Object withTimeout(long j10, @NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
            C0062a c0062a;
            CancellableContinuation<? super PointerEvent> cancellableContinuation;
            if (continuation instanceof C0062a) {
                c0062a = (C0062a) continuation;
                int i10 = c0062a.f16477s0;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    c0062a.f16477s0 = i10 - Integer.MIN_VALUE;
                } else {
                    c0062a = new C0062a(this, continuation);
                }
            } else {
                c0062a = new C0062a(this, continuation);
            }
            Object objInvoke = c0062a.f16475q0;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i11 = c0062a.f16477s0;
            try {
                if (i11 == 0) {
                    ResultKt.throwOnFailure(objInvoke);
                    if (j10 <= 0 && (cancellableContinuation = this.f16470r0) != null) {
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m5535constructorimpl(ResultKt.createFailure(new PointerEventTimeoutCancellationException(j10))));
                    }
                    Job jobLaunch$default = BuildersKt__Builders_commonKt.launch$default(this.f16473u0.getCoroutineScope(), null, null, new b(j10, this, null), 3, null);
                    c0062a.f16474p0 = jobLaunch$default;
                    c0062a.f16477s0 = 1;
                    objInvoke = function2.invoke(this, c0062a);
                    j10 = jobLaunch$default;
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Job job = c0062a.f16474p0;
                    ResultKt.throwOnFailure(objInvoke);
                    j10 = job;
                }
                j10.cancel(e1.b.f68258p0);
                return objInvoke;
            } catch (Throwable th2) {
                j10.cancel(e1.b.f68258p0);
                throw th2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // androidx.compose.ui.input.pointer.AwaitPointerEventScope
        @Nullable
        public final <T> Object withTimeoutOrNull(long j10, @NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super T>, ? extends Object> function2, @NotNull Continuation<? super T> continuation) {
            c cVar;
            if (continuation instanceof c) {
                cVar = (c) continuation;
                int i10 = cVar.f16483r0;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    cVar.f16483r0 = i10 - Integer.MIN_VALUE;
                } else {
                    cVar = new c(this, continuation);
                }
            } else {
                cVar = new c(this, continuation);
            }
            Object objWithTimeout = cVar.f16481p0;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i11 = cVar.f16483r0;
            try {
                if (i11 == 0) {
                    ResultKt.throwOnFailure(objWithTimeout);
                    cVar.f16483r0 = 1;
                    objWithTimeout = withTimeout(j10, function2, cVar);
                    if (objWithTimeout == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(objWithTimeout);
                }
                return objWithTimeout;
            } catch (PointerEventTimeoutCancellationException unused) {
                return null;
            }
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toDp-u2uoSUM */
        public final float mo406toDpu2uoSUM(int i10) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f16469q0;
            suspendingPointerInputModifierNodeImpl.getClass();
            return x1.a.e(suspendingPointerInputModifierNodeImpl, i10);
        }

        @Override // androidx.compose.ui.unit.Density
        @Stable
        /* JADX INFO: renamed from: toSp-kPz2Gy4 */
        public final long mo411toSpkPz2Gy4(int i10) {
            SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = this.f16469q0;
            suspendingPointerInputModifierNodeImpl.getClass();
            return x1.a.m(suspendingPointerInputModifierNodeImpl, i10);
        }
    }

    /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
    public static final class b extends Lambda implements Function1<Throwable, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ a<R> f16484p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a<R> aVar) {
            super(1);
            this.f16484p0 = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Throwable th2) {
            Throwable th3 = th2;
            a<R> aVar = this.f16484p0;
            CancellableContinuation<? super PointerEvent> cancellableContinuation = aVar.f16470r0;
            if (cancellableContinuation != null) {
                cancellableContinuation.cancel(th3);
            }
            aVar.f16470r0 = null;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
    @DebugMetadata(c = "androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNodeImpl$onPointerEvent$1", f = "SuspendingPointerInputFilter.kt", i = {}, l = {562}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f16485p0;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SuspendingPointerInputModifierNodeImpl.this.new c(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f16485p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SuspendingPointerInputModifierNodeImpl suspendingPointerInputModifierNodeImpl = SuspendingPointerInputModifierNodeImpl.this;
                Function2<PointerInputScope, Continuation<? super Unit>, Object> pointerInputHandler = suspendingPointerInputModifierNodeImpl.getPointerInputHandler();
                this.f16485p0 = 1;
                if (pointerInputHandler.invoke(suspendingPointerInputModifierNodeImpl, this) == coroutine_suspended) {
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

    public SuspendingPointerInputModifierNodeImpl(@NotNull Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> pointerInputHandler) {
        Intrinsics.checkNotNullParameter(pointerInputHandler, "pointerInputHandler");
        this.pointerInputHandler = pointerInputHandler;
        this.J0 = SuspendingPointerInputFilterKt.f16467a;
        this.K0 = new MutableVector<>(new a[16], 0);
        this.L0 = new MutableVector<>(new a[16], 0);
        this.N0 = IntSize.INSTANCE.m4554getZeroYbymL2g();
    }

    public final void a(PointerEvent pointerEvent, PointerEventPass pointerEventPass) {
        MutableVector<a<?>> mutableVector;
        int size;
        synchronized (this.K0) {
            MutableVector<a<?>> mutableVector2 = this.L0;
            mutableVector2.addAll(mutableVector2.getSize(), this.K0);
        }
        try {
            int i10 = WhenMappings.$EnumSwitchMapping$0[pointerEventPass.ordinal()];
            if (i10 == 1 || i10 == 2) {
                MutableVector<a<?>> mutableVector3 = this.L0;
                int size2 = mutableVector3.getSize();
                if (size2 > 0) {
                    a<?>[] content = mutableVector3.getContent();
                    int i11 = 0;
                    do {
                        content[i11].a(pointerEvent, pointerEventPass);
                        i11++;
                    } while (i11 < size2);
                }
            } else if (i10 == 3 && (size = (mutableVector = this.L0).getSize()) > 0) {
                int i12 = size - 1;
                a<?>[] content2 = mutableVector.getContent();
                do {
                    content2[i12].a(pointerEvent, pointerEventPass);
                    i12--;
                } while (i12 >= 0);
            }
        } finally {
            this.L0.clear();
        }
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    @Nullable
    public <R> Object awaitPointerEventScope(@NotNull Function2<? super AwaitPointerEventScope, ? super Continuation<? super R>, ? extends Object> function2, @NotNull Continuation<? super R> continuation) throws Throwable {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        a aVar = new a(this, cancellableContinuationImpl);
        synchronized (this.K0) {
            this.K0.add(aVar);
            Continuation<Unit> continuationCreateCoroutine = ContinuationKt.createCoroutine(function2, aVar, aVar);
            Result.Companion companion = Result.INSTANCE;
            continuationCreateCoroutine.resumeWith(Result.m5535constructorimpl(Unit.INSTANCE));
        }
        cancellableContinuationImpl.invokeOnCancellation(new b(aVar));
        Object result = cancellableContinuationImpl.getResult();
        if (result == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getDensity();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* JADX INFO: renamed from: getExtendedTouchPadding-NH-jbRc */
    public long mo3498getExtendedTouchPaddingNHjbRc() {
        long j10 = x1.a.j(this, getViewConfiguration().mo3672getMinimumTouchTargetSizeMYxV2XQ());
        long n0 = getN0();
        return SizeKt.Size(Math.max(0.0f, Size.m2344getWidthimpl(j10) - IntSize.m4549getWidthimpl(n0)) / 2.0f, Math.max(0.0f, Size.m2341getHeightimpl(j10) - IntSize.m4548getHeightimpl(n0)) / 2.0f);
    }

    @Override // androidx.compose.ui.unit.Density
    public float getFontScale() {
        return DelegatableNodeKt.requireLayoutNode(this).getDensity().getFontScale();
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public boolean getInterceptOutOfBoundsChildEvents() {
        return this.interceptOutOfBoundsChildEvents;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    @NotNull
    public Function2<PointerInputScope, Continuation<? super Unit>, Object> getPointerInputHandler() {
        return this.pointerInputHandler;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    /* JADX INFO: renamed from: getSize-YbymL2g, reason: from getter */
    public long getN0() {
        return this.N0;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    @NotNull
    public ViewConfiguration getViewConfiguration() {
        return DelegatableNodeKt.requireLayoutNode(this).getViewConfiguration();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ boolean interceptOutOfBoundsChildEvents() {
        return n.a(this);
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onCancelPointerInput() {
        PointerEvent pointerEvent = this.M0;
        if (pointerEvent == null) {
            return;
        }
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!(!changes.get(i10).getPressed())) {
                List<PointerInputChange> changes2 = pointerEvent.getChanges();
                ArrayList arrayList = new ArrayList(changes2.size());
                int size2 = changes2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    PointerInputChange pointerInputChange = changes2.get(i11);
                    arrayList.add(new PointerInputChange(pointerInputChange.getId(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), 0, 0L, 1536, (DefaultConstructorMarker) null));
                }
                PointerEvent pointerEvent2 = new PointerEvent(arrayList);
                this.J0 = pointerEvent2;
                a(pointerEvent2, PointerEventPass.Initial);
                a(pointerEvent2, PointerEventPass.Main);
                a(pointerEvent2, PointerEventPass.Final);
                this.M0 = null;
                return;
            }
        }
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onDensityChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void onDetach() {
        resetPointerInputHandler();
        super.onDetach();
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    /* JADX INFO: renamed from: onPointerEvent-H0pRuoY */
    public void mo115onPointerEventH0pRuoY(@NotNull PointerEvent pointerEvent, @NotNull PointerEventPass pass, long bounds) {
        Intrinsics.checkNotNullParameter(pointerEvent, "pointerEvent");
        Intrinsics.checkNotNullParameter(pass, "pass");
        this.N0 = bounds;
        if (pass == PointerEventPass.Initial) {
            this.J0 = pointerEvent;
        }
        if (this.I0 == null) {
            this.I0 = BuildersKt__Builders_commonKt.launch$default(getCoroutineScope(), null, CoroutineStart.UNDISPATCHED, new c(null), 1, null);
        }
        a(pointerEvent, pass);
        List<PointerInputChange> changes = pointerEvent.getChanges();
        int size = changes.size();
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z10 = true;
                break;
            } else if (!PointerEventKt.changedToUpIgnoreConsumed(changes.get(i10))) {
                break;
            } else {
                i10++;
            }
        }
        if (!(!z10)) {
            pointerEvent = null;
        }
        this.M0 = pointerEvent;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public void onViewConfigurationChange() {
        resetPointerInputHandler();
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void resetPointerInputHandler() {
        Job job = this.I0;
        if (job != null) {
            job.cancel((CancellationException) new g("Pointer input was reset"));
            this.I0 = null;
        }
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx--R2X_6o */
    public final /* synthetic */ int mo412roundToPxR2X_6o(long j10) {
        return x1.a.a(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: roundToPx-0680j_4 */
    public final /* synthetic */ int mo413roundToPx0680j_4(float f6) {
        return x1.a.b(this, f6);
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputScope
    public void setInterceptOutOfBoundsChildEvents(boolean z10) {
        this.interceptOutOfBoundsChildEvents = z10;
    }

    @Override // androidx.compose.ui.input.pointer.SuspendingPointerInputModifierNode
    public void setPointerInputHandler(@NotNull Function2<? super PointerInputScope, ? super Continuation<? super Unit>, ? extends Object> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        resetPointerInputHandler();
        this.pointerInputHandler = value;
    }

    @Override // androidx.compose.ui.node.PointerInputModifierNode
    public final /* synthetic */ boolean sharePointerInputWithSiblings() {
        return n.d(this);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-GaN1DYA */
    public final /* synthetic */ float mo404toDpGaN1DYA(long j10) {
        return x1.a.c(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final /* synthetic */ float mo405toDpu2uoSUM(float f6) {
        return x1.a.d(this, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDpSize-k-rfVVM */
    public final /* synthetic */ long mo407toDpSizekrfVVM(long j10) {
        return x1.a.f(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx--R2X_6o */
    public final /* synthetic */ float mo414toPxR2X_6o(long j10) {
        return x1.a.g(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toPx-0680j_4 */
    public final /* synthetic */ float mo415toPx0680j_4(float f6) {
        return x1.a.h(this, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    public final /* synthetic */ Rect toRect(DpRect dpRect) {
        return x1.a.i(this, dpRect);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSize-XkaWNTQ */
    public final /* synthetic */ long mo408toSizeXkaWNTQ(long j10) {
        return x1.a.j(this, j10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-0xMU5do */
    public final /* synthetic */ long mo409toSp0xMU5do(float f6) {
        return x1.a.k(this, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final /* synthetic */ long mo410toSpkPz2Gy4(float f6) {
        return x1.a.l(this, f6);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toDp-u2uoSUM */
    public final /* synthetic */ float mo406toDpu2uoSUM(int i10) {
        return x1.a.e(this, i10);
    }

    @Override // androidx.compose.ui.unit.Density
    /* JADX INFO: renamed from: toSp-kPz2Gy4 */
    public final /* synthetic */ long mo411toSpkPz2Gy4(int i10) {
        return x1.a.m(this, i10);
    }
}
