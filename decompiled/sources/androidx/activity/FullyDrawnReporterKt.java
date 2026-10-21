package androidx.activity;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FullyDrawnReporter.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a3\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u001c\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\b"}, d2 = {"reportWhenComplete", "", "Landroidx/activity/FullyDrawnReporter;", "reporter", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Landroidx/activity/FullyDrawnReporter;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FullyDrawnReporterKt {

    /* JADX INFO: compiled from: FullyDrawnReporter.kt */
    @DebugMetadata(c = "androidx.activity.FullyDrawnReporterKt", f = "FullyDrawnReporter.kt", i = {0}, l = {185}, m = "reportWhenComplete", n = {"$this$reportWhenComplete"}, s = {"L$0"})
    @SourceDebugExtension({"SMAP\nFullyDrawnReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FullyDrawnReporter.kt\nandroidx/activity/FullyDrawnReporterKt$reportWhenComplete$1\n*L\n1#1,190:1\n*E\n"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public FullyDrawnReporter f325p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f326q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f327r0;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f326q0 = obj;
            this.f327r0 |= Integer.MIN_VALUE;
            return FullyDrawnReporterKt.reportWhenComplete(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Unit] */
    @Nullable
    public static final Object reportWhenComplete(@NotNull FullyDrawnReporter fullyDrawnReporter, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> function1, @NotNull Continuation<? super Unit> continuation) {
        a aVar;
        FullyDrawnReporter fullyDrawnReporter2;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f327r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f327r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f326q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f327r0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                fullyDrawnReporter.addReporter();
                if (fullyDrawnReporter.isFullyDrawnReported()) {
                    return Unit.INSTANCE;
                }
                aVar.f325p0 = fullyDrawnReporter;
                aVar.f327r0 = 1;
                if (function1.invoke(aVar) == coroutine_suspended) {
                    fullyDrawnReporter2 = fullyDrawnReporter;
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                FullyDrawnReporter fullyDrawnReporter3 = aVar.f325p0;
                ResultKt.throwOnFailure(obj);
                fullyDrawnReporter2 = fullyDrawnReporter3;
            }
            fullyDrawnReporter2 = fullyDrawnReporter;
            InlineMarker.finallyStart(1);
            fullyDrawnReporter2.removeReporter();
            InlineMarker.finallyEnd(1);
            fullyDrawnReporter = Unit.INSTANCE;
            return fullyDrawnReporter;
        } catch (Throwable th2) {
            InlineMarker.finallyStart(1);
            fullyDrawnReporter.removeReporter();
            InlineMarker.finallyEnd(1);
            throw th2;
        }
    }
}
