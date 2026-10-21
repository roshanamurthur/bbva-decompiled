package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.OnGloballyPositionedModifier;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AwaitFirstLayoutModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier;", "Landroidx/compose/ui/layout/OnGloballyPositionedModifier;", "", "waitForFirstLayout", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "onGloballyPositioned", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nAwaitFirstLayoutModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AwaitFirstLayoutModifier.kt\nandroidx/compose/foundation/lazy/layout/AwaitFirstLayoutModifier\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,48:1\n1#2:49\n*E\n"})
public final class AwaitFirstLayoutModifier implements OnGloballyPositionedModifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public SafeContinuation f4918b;

    /* JADX INFO: compiled from: AwaitFirstLayoutModifier.kt */
    @DebugMetadata(c = "androidx.compose.foundation.lazy.layout.AwaitFirstLayoutModifier", f = "AwaitFirstLayoutModifier.kt", i = {0, 0}, l = {35}, m = "waitForFirstLayout", n = {"this", "oldContinuation"}, s = {"L$0", "L$1"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Continuation f4919p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f4920q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f4922s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f4920q0 = obj;
            this.f4922s0 |= Integer.MIN_VALUE;
            return AwaitFirstLayoutModifier.this.waitForFirstLayout(this);
        }
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean all(Function1 function1) {
        return u0.f.a(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ boolean any(Function1 function1) {
        return u0.f.b(this, function1);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldIn(Object obj, Function2 function2) {
        return u0.f.c(this, obj, function2);
    }

    @Override // androidx.compose.ui.Modifier.Element, androidx.compose.ui.Modifier
    public final /* synthetic */ Object foldOut(Object obj, Function2 function2) {
        return u0.f.d(this, obj, function2);
    }

    @Override // androidx.compose.ui.layout.OnGloballyPositionedModifier
    public void onGloballyPositioned(@NotNull LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        if (this.f4917a) {
            return;
        }
        this.f4917a = true;
        SafeContinuation safeContinuation = this.f4918b;
        if (safeContinuation != null) {
            Result.Companion companion = Result.INSTANCE;
            safeContinuation.resumeWith(Result.m5535constructorimpl(Unit.INSTANCE));
        }
        this.f4918b = null;
    }

    @Override // androidx.compose.ui.Modifier
    public final /* synthetic */ Modifier then(Modifier modifier) {
        return u0.e.a(this, modifier);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object waitForFirstLayout(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        Continuation continuation2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f4922s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f4922s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f4920q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f4922s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.f4917a) {
                SafeContinuation safeContinuation = this.f4918b;
                aVar.getClass();
                aVar.f4919p0 = safeContinuation;
                aVar.f4922s0 = 1;
                SafeContinuation safeContinuation2 = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(aVar));
                this.f4918b = safeContinuation2;
                Object orThrow = safeContinuation2.getOrThrow();
                if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(aVar);
                }
                if (orThrow == coroutine_suspended) {
                    return coroutine_suspended;
                }
                continuation2 = safeContinuation;
            }
            return Unit.INSTANCE;
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        continuation2 = aVar.f4919p0;
        ResultKt.throwOnFailure(obj);
        if (continuation2 != null) {
            Result.Companion companion = Result.INSTANCE;
            continuation2.resumeWith(Result.m5535constructorimpl(Unit.INSTANCE));
        }
        return Unit.INSTANCE;
    }
}
