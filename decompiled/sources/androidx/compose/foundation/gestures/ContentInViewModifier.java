package androidx.compose.foundation.gestures;

import androidx.camera.camera2.internal.h0;
import androidx.compose.foundation.FocusedBoundsKt;
import androidx.compose.foundation.relocation.BringIntoViewResponder;
import androidx.compose.foundation.relocation.BringIntoViewResponderKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnPlacedModifier;
import androidx.compose.ui.layout.OnRemeasuredModifier;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.esotericsoftware.asm.Opcodes;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.CharsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.JobKt__JobKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import u.o;
import u0.f;

/* JADX INFO: compiled from: ContentInViewModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001#B'\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J#\u0010\t\u001a\u00020\b2\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0007H\u0096@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016J\u001d\u0010\u0012\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006$"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewModifier;", "Landroidx/compose/foundation/relocation/BringIntoViewResponder;", "Landroidx/compose/ui/layout/OnRemeasuredModifier;", "Landroidx/compose/ui/layout/OnPlacedModifier;", "Landroidx/compose/ui/geometry/Rect;", "localRect", "calculateRectForParent", "Lkotlin/Function0;", "", "bringChildIntoView", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onPlaced", "Landroidx/compose/ui/unit/IntSize;", "size", "onRemeasured-ozmzZPI", "(J)V", "onRemeasured", "Landroidx/compose/ui/Modifier;", "m", "Landroidx/compose/ui/Modifier;", "getModifier", "()Landroidx/compose/ui/Modifier;", "modifier", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/ScrollableState;", "scrollState", "", "reverseDirection", "<init>", "(Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/ScrollableState;Z)V", "Request", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nContentInViewModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 5 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,427:1\n314#2,11:428\n1#3:439\n106#4,2:440\n108#4:453\n492#5,11:442\n*S KotlinDebug\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier\n*L\n129#1:428,11\n326#1:440,2\n326#1:453\n326#1:442,11\n*E\n"})
public final class ContentInViewModifier implements BringIntoViewResponder, OnRemeasuredModifier, OnPlacedModifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f3511a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Orientation f3512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ScrollableState f3513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f3514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final BringIntoViewRequestPriorityQueue f3515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public LayoutCoordinates f3516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    public LayoutCoordinates f3517g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public Rect f3518h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3519i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f3520j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f3521k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public final UpdatableAnimationState f3522l;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Modifier modifier;

    /* JADX INFO: compiled from: ContentInViewModifier.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/compose/foundation/gestures/ContentInViewModifier$Request;", "", "", "toString", "Lkotlin/Function0;", "Landroidx/compose/ui/geometry/Rect;", "a", "Lkotlin/jvm/functions/Function0;", "getCurrentBounds", "()Lkotlin/jvm/functions/Function0;", "currentBounds", "Lkotlinx/coroutines/CancellableContinuation;", "", "b", "Lkotlinx/coroutines/CancellableContinuation;", "getContinuation", "()Lkotlinx/coroutines/CancellableContinuation;", "continuation", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlinx/coroutines/CancellableContinuation;)V", "foundation_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nContentInViewModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier$Request\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,427:1\n1#2:428\n*E\n"})
    public static final class Request {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final Function0<Rect> currentBounds;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final CancellableContinuation<Unit> continuation;

        /* JADX WARN: Multi-variable type inference failed */
        public Request(@NotNull Function0<Rect> currentBounds, @NotNull CancellableContinuation<? super Unit> continuation) {
            Intrinsics.checkNotNullParameter(currentBounds, "currentBounds");
            Intrinsics.checkNotNullParameter(continuation, "continuation");
            this.currentBounds = currentBounds;
            this.continuation = continuation;
        }

        @NotNull
        public final CancellableContinuation<Unit> getContinuation() {
            return this.continuation;
        }

        @NotNull
        public final Function0<Rect> getCurrentBounds() {
            return this.currentBounds;
        }

        @NotNull
        public String toString() {
            String strB;
            CancellableContinuation<Unit> cancellableContinuation = this.continuation;
            CoroutineName coroutineName = (CoroutineName) cancellableContinuation.getF79378p0().get(CoroutineName.INSTANCE);
            String name = coroutineName != null ? coroutineName.getName() : null;
            StringBuilder sb2 = new StringBuilder("Request@");
            String string = Integer.toString(hashCode(), CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(string, "toString(this, checkRadix(radix))");
            sb2.append(string);
            if (name == null || (strB = h0.b(Constant.BRACKET_OPEN, name, "](")) == null) {
                strB = "(";
            }
            sb2.append(strB);
            sb2.append("currentBounds()=");
            sb2.append(this.currentBounds.invoke());
            sb2.append(", continuation=");
            sb2.append(cancellableContinuation);
            sb2.append(RootService.CLOSE_BRACKET);
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: ContentInViewModifier.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Orientation.values().length];
            try {
                iArr[Orientation.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Orientation.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: ContentInViewModifier.kt */
    @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1", f = "ContentInViewModifier.kt", i = {}, l = {Opcodes.INSTANCEOF}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f3525p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f3526q0;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ContentInViewModifier.kt */
        @DebugMetadata(c = "androidx.compose.foundation.gestures.ContentInViewModifier$launchAnimation$1$1", f = "ContentInViewModifier.kt", i = {}, l = {Opcodes.IFNULL}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0012a extends SuspendLambda implements Function2<ScrollScope, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public int f3528p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public /* synthetic */ Object f3529q0;

            /* JADX INFO: renamed from: r0, reason: collision with root package name */
            public final /* synthetic */ ContentInViewModifier f3530r0;

            /* JADX INFO: renamed from: s0, reason: collision with root package name */
            public final /* synthetic */ Job f3531s0;

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: ContentInViewModifier.kt */
            public static final class C0013a extends Lambda implements Function1<Float, Unit> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ ContentInViewModifier f3532p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ ScrollScope f3533q0;

                /* JADX INFO: renamed from: r0, reason: collision with root package name */
                public final /* synthetic */ Job f3534r0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0013a(ContentInViewModifier contentInViewModifier, ScrollScope scrollScope, Job job) {
                    super(1);
                    this.f3532p0 = contentInViewModifier;
                    this.f3533q0 = scrollScope;
                    this.f3534r0 = job;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Unit invoke(Float f6) {
                    float fFloatValue = f6.floatValue();
                    float f10 = this.f3532p0.f3514d ? 1.0f : -1.0f;
                    float fScrollBy = this.f3533q0.scrollBy(f10 * fFloatValue) * f10;
                    if (fScrollBy < fFloatValue) {
                        JobKt__JobKt.cancel$default(this.f3534r0, "Scroll animation cancelled because scroll was not consumed (" + fScrollBy + " < " + fFloatValue + RootService.CLOSE_BRACKET, null, 2, null);
                    }
                    return Unit.INSTANCE;
                }
            }

            /* JADX INFO: renamed from: androidx.compose.foundation.gestures.ContentInViewModifier$a$a$b */
            /* JADX INFO: compiled from: ContentInViewModifier.kt */
            @SourceDebugExtension({"SMAP\nContentInViewModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier$launchAnimation$1$1$2\n+ 2 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,427:1\n118#2,4:428\n123#2,4:433\n48#3:432\n*S KotlinDebug\n*F\n+ 1 ContentInViewModifier.kt\nandroidx/compose/foundation/gestures/ContentInViewModifier$launchAnimation$1$1$2\n*L\n236#1:428,4\n236#1:433,4\n236#1:432\n*E\n"})
            public static final class b extends Lambda implements Function0<Unit> {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ ContentInViewModifier f3535p0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(ContentInViewModifier contentInViewModifier) {
                    super(0);
                    this.f3535p0 = contentInViewModifier;
                }

                @Override // kotlin.jvm.functions.Function0
                public final Unit invoke() {
                    Rect rectC;
                    Rect rectInvoke;
                    ContentInViewModifier contentInViewModifier = this.f3535p0;
                    BringIntoViewRequestPriorityQueue bringIntoViewRequestPriorityQueue = contentInViewModifier.f3515e;
                    while (bringIntoViewRequestPriorityQueue.f3508a.isNotEmpty() && ((rectInvoke = ((Request) bringIntoViewRequestPriorityQueue.f3508a.last()).getCurrentBounds().invoke()) == null || Offset.m2272equalsimpl0(contentInViewModifier.f(contentInViewModifier.f3520j, rectInvoke), Offset.INSTANCE.m2291getZeroF1C5BW0()))) {
                        ((Request) bringIntoViewRequestPriorityQueue.f3508a.removeAt(bringIntoViewRequestPriorityQueue.f3508a.getSize() - 1)).getContinuation().resumeWith(Result.m5535constructorimpl(Unit.INSTANCE));
                    }
                    if (contentInViewModifier.f3519i && (rectC = contentInViewModifier.c()) != null && Offset.m2272equalsimpl0(contentInViewModifier.f(contentInViewModifier.f3520j, rectC), Offset.INSTANCE.m2291getZeroF1C5BW0())) {
                        contentInViewModifier.f3519i = false;
                    }
                    contentInViewModifier.f3522l.setValue(ContentInViewModifier.access$calculateScrollDelta(contentInViewModifier));
                    return Unit.INSTANCE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0012a(ContentInViewModifier contentInViewModifier, Job job, Continuation<? super C0012a> continuation) {
                super(2, continuation);
                this.f3530r0 = contentInViewModifier;
                this.f3531s0 = job;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                C0012a c0012a = new C0012a(this.f3530r0, this.f3531s0, continuation);
                c0012a.f3529q0 = obj;
                return c0012a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ScrollScope scrollScope, Continuation<? super Unit> continuation) {
                return ((C0012a) create(scrollScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                int i10 = this.f3528p0;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    ScrollScope scrollScope = (ScrollScope) this.f3529q0;
                    ContentInViewModifier contentInViewModifier = this.f3530r0;
                    contentInViewModifier.f3522l.setValue(ContentInViewModifier.access$calculateScrollDelta(contentInViewModifier));
                    UpdatableAnimationState updatableAnimationState = contentInViewModifier.f3522l;
                    C0013a c0013a = new C0013a(contentInViewModifier, scrollScope, this.f3531s0);
                    b bVar = new b(contentInViewModifier);
                    this.f3528p0 = 1;
                    if (updatableAnimationState.animateToZero(c0013a, bVar, this) == coroutine_suspended) {
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

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = ContentInViewModifier.this.new a(continuation);
            aVar.f3526q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f3525p0;
            ContentInViewModifier contentInViewModifier = ContentInViewModifier.this;
            try {
                try {
                    if (i10 == 0) {
                        ResultKt.throwOnFailure(obj);
                        Job job = JobKt.getJob(((CoroutineScope) this.f3526q0).getCoroutineContext());
                        contentInViewModifier.f3521k = true;
                        ScrollableState scrollableState = contentInViewModifier.f3513c;
                        C0012a c0012a = new C0012a(contentInViewModifier, job, null);
                        this.f3525p0 = 1;
                        if (o.e(scrollableState, null, c0012a, this, 1, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    contentInViewModifier.f3515e.resumeAndRemoveAll();
                    contentInViewModifier.f3521k = false;
                    contentInViewModifier.f3515e.cancelAndRemoveAll(null);
                    contentInViewModifier.f3519i = false;
                    return Unit.INSTANCE;
                } catch (CancellationException e5) {
                    throw e5;
                }
            } catch (Throwable th2) {
                contentInViewModifier.f3521k = false;
                contentInViewModifier.f3515e.cancelAndRemoveAll(null);
                contentInViewModifier.f3519i = false;
                throw th2;
            }
        }
    }

    /* JADX INFO: compiled from: ContentInViewModifier.kt */
    public static final class b extends Lambda implements Function1<LayoutCoordinates, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(LayoutCoordinates layoutCoordinates) {
            ContentInViewModifier.this.f3517g = layoutCoordinates;
            return Unit.INSTANCE;
        }
    }

    public ContentInViewModifier(@NotNull CoroutineScope scope, @NotNull Orientation orientation, @NotNull ScrollableState scrollState, boolean z10) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        Intrinsics.checkNotNullParameter(scrollState, "scrollState");
        this.f3511a = scope;
        this.f3512b = orientation;
        this.f3513c = scrollState;
        this.f3514d = z10;
        this.f3515e = new BringIntoViewRequestPriorityQueue();
        this.f3520j = IntSize.INSTANCE.m4554getZeroYbymL2g();
        this.f3522l = new UpdatableAnimationState();
        this.modifier = BringIntoViewResponderKt.bringIntoViewResponder(FocusedBoundsKt.onFocusedBoundsChanged(this, new b()), this);
    }

    public static final float access$calculateScrollDelta(ContentInViewModifier contentInViewModifier) {
        Rect rect;
        float fE;
        int iCompare;
        if (IntSize.m4547equalsimpl0(contentInViewModifier.f3520j, IntSize.INSTANCE.m4554getZeroYbymL2g())) {
            return 0.0f;
        }
        MutableVector mutableVector = contentInViewModifier.f3515e.f3508a;
        int size = mutableVector.getSize();
        Orientation orientation = contentInViewModifier.f3512b;
        if (size > 0) {
            int i10 = size - 1;
            Object[] content = mutableVector.getContent();
            rect = null;
            do {
                Rect rectInvoke = ((Request) content[i10]).getCurrentBounds().invoke();
                if (rectInvoke != null) {
                    long jM2308getSizeNHjbRc = rectInvoke.m2308getSizeNHjbRc();
                    long jM4559toSizeozmzZPI = IntSizeKt.m4559toSizeozmzZPI(contentInViewModifier.f3520j);
                    int i11 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
                    if (i11 == 1) {
                        iCompare = Float.compare(Size.m2341getHeightimpl(jM2308getSizeNHjbRc), Size.m2341getHeightimpl(jM4559toSizeozmzZPI));
                    } else {
                        if (i11 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iCompare = Float.compare(Size.m2344getWidthimpl(jM2308getSizeNHjbRc), Size.m2344getWidthimpl(jM4559toSizeozmzZPI));
                    }
                    if (iCompare > 0) {
                        break;
                    }
                    rect = rectInvoke;
                    i10--;
                } else {
                    i10--;
                }
            } while (i10 >= 0);
        } else {
            rect = null;
        }
        if (rect == null) {
            Rect rectC = contentInViewModifier.f3519i ? contentInViewModifier.c() : null;
            if (rectC == null) {
                return 0.0f;
            }
            rect = rectC;
        }
        long jM4559toSizeozmzZPI2 = IntSizeKt.m4559toSizeozmzZPI(contentInViewModifier.f3520j);
        int i12 = WhenMappings.$EnumSwitchMapping$0[orientation.ordinal()];
        if (i12 == 1) {
            fE = e(rect.getTop(), rect.getBottom(), Size.m2341getHeightimpl(jM4559toSizeozmzZPI2));
        } else {
            if (i12 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            fE = e(rect.getLeft(), rect.getRight(), Size.m2344getWidthimpl(jM4559toSizeozmzZPI2));
        }
        return fE;
    }

    public static float e(float f6, float f10, float f11) {
        if ((f6 >= 0.0f && f10 <= f11) || (f6 < 0.0f && f10 > f11)) {
            return 0.0f;
        }
        float f12 = f10 - f11;
        return Math.abs(f6) < Math.abs(f12) ? f6 : f12;
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(Function1 function1) {
        return f.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(Function1 function1) {
        return f.b(this, function1);
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    @Nullable
    public Object bringChildIntoView(@NotNull Function0<Rect> function0, @NotNull Continuation<? super Unit> continuation) throws Throwable {
        Rect rectInvoke = function0.invoke();
        if (rectInvoke == null || Offset.m2272equalsimpl0(f(this.f3520j, rectInvoke), Offset.INSTANCE.m2291getZeroF1C5BW0())) {
            return Unit.INSTANCE;
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        if (this.f3515e.enqueue(new Request(function0, cancellableContinuationImpl)) && !this.f3521k) {
            d();
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result == ek.a.getCOROUTINE_SUSPENDED() ? result : Unit.INSTANCE;
    }

    public final Rect c() {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.f3516f;
        if (layoutCoordinates2 != null) {
            if (!layoutCoordinates2.isAttached()) {
                layoutCoordinates2 = null;
            }
            if (layoutCoordinates2 != null && (layoutCoordinates = this.f3517g) != null) {
                if (!layoutCoordinates.isAttached()) {
                    layoutCoordinates = null;
                }
                if (layoutCoordinates != null) {
                    return layoutCoordinates2.localBoundingBoxOf(layoutCoordinates, false);
                }
            }
        }
        return null;
    }

    @Override // androidx.compose.foundation.relocation.BringIntoViewResponder
    @NotNull
    public Rect calculateRectForParent(@NotNull Rect localRect) {
        Intrinsics.checkNotNullParameter(localRect, "localRect");
        if (!IntSize.m4547equalsimpl0(this.f3520j, IntSize.INSTANCE.m4554getZeroYbymL2g())) {
            return localRect.m2312translatek4lQ0M(Offset.m2284unaryMinusF1C5BW0(f(this.f3520j, localRect)));
        }
        throw new IllegalStateException("Expected BringIntoViewRequester to not be used before parents are placed.".toString());
    }

    public final void d() {
        if (!(!this.f3521k)) {
            throw new IllegalStateException("Check failed.".toString());
        }
        BuildersKt__Builders_commonKt.launch$default(this.f3511a, null, CoroutineStart.UNDISPATCHED, new a(null), 1, null);
    }

    public final long f(long j10, Rect rect) {
        long jM4559toSizeozmzZPI = IntSizeKt.m4559toSizeozmzZPI(j10);
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.f3512b.ordinal()];
        if (i10 == 1) {
            return OffsetKt.Offset(0.0f, e(rect.getTop(), rect.getBottom(), Size.m2341getHeightimpl(jM4559toSizeozmzZPI)));
        }
        if (i10 == 2) {
            return OffsetKt.Offset(e(rect.getLeft(), rect.getRight(), Size.m2344getWidthimpl(jM4559toSizeozmzZPI)), 0.0f);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return f.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return f.d(this, obj, function2);
    }

    @NotNull
    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // androidx.compose.ui.layout.OnPlacedModifier
    public void onPlaced(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        this.f3516f = coordinates;
    }

    @Override // androidx.compose.ui.layout.OnRemeasuredModifier
    /* JADX INFO: renamed from: onRemeasured-ozmzZPI, reason: not valid java name */
    public void mo176onRemeasuredozmzZPI(long size) {
        int iCompare;
        Rect rectC;
        long j10 = this.f3520j;
        this.f3520j = size;
        int i10 = WhenMappings.$EnumSwitchMapping$0[this.f3512b.ordinal()];
        if (i10 == 1) {
            iCompare = Intrinsics.compare(IntSize.m4548getHeightimpl(size), IntSize.m4548getHeightimpl(j10));
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            iCompare = Intrinsics.compare(IntSize.m4549getWidthimpl(size), IntSize.m4549getWidthimpl(j10));
        }
        if (iCompare < 0 && (rectC = c()) != null) {
            Rect rect = this.f3518h;
            if (rect == null) {
                rect = rectC;
            }
            if (!this.f3521k && !this.f3519i) {
                long jF = f(j10, rect);
                Offset.Companion companion = Offset.INSTANCE;
                if (Offset.m2272equalsimpl0(jF, companion.m2291getZeroF1C5BW0()) && !Offset.m2272equalsimpl0(f(size, rectC), companion.m2291getZeroF1C5BW0())) {
                    this.f3519i = true;
                    d();
                }
            }
            this.f3518h = rectC;
        }
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return u0.e.a(this, modifier);
    }
}
