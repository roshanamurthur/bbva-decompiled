package com.bbva.ethermobile.help.kit.result;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a8\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0086@¢\u0006\u0002\u0010\t\u001a\u001d\u0010\n\u001a\u0004\u0018\u0001H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001¢\u0006\u0002\u0010\u000b\u001a\u001b\u0010\f\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001¢\u0006\u0002\u0010\u000b¨\u0006\r"}, d2 = {"catching", "Lcom/bbva/ethermobile/help/kit/result/Result;", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function0;", "suspendCatching", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOrNull", "(Lcom/bbva/ethermobile/help/kit/result/Result;)Ljava/lang/Object;", "getOrThrow", "help-kit_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ResultKt {

    /* JADX INFO: compiled from: Result.kt */
    @DebugMetadata(c = "com.bbva.ethermobile.help.kit.result.ResultKt", f = "Result.kt", i = {}, l = {28}, m = "suspendCatching", n = {}, s = {})
    public static final class a<T> extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f29276p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f29277q0;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29276p0 = obj;
            this.f29277q0 |= Integer.MIN_VALUE;
            return ResultKt.suspendCatching(null, this);
        }
    }

    @NotNull
    public static final <T> Result<T> catching(@NotNull Function0<? extends T> block) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(block.invoke()));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            objM5535constructorimpl = new Result.Error(thM5538exceptionOrNullimpl);
        }
        return (Result) objM5535constructorimpl;
    }

    @Nullable
    public static final <T> T getOrNull(@NotNull Result<T> result) {
        Intrinsics.checkNotNullParameter(result, "<this>");
        if (result instanceof Result.Success) {
            return (T) ((Result.Success) result).getValue();
        }
        if (result instanceof Result.Error) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final <T> T getOrThrow(@NotNull Result<T> result) throws Throwable {
        Intrinsics.checkNotNullParameter(result, "<this>");
        if (result instanceof Result.Success) {
            return (T) ((Result.Success) result).getValue();
        }
        if (result instanceof Result.Error) {
            throw ((Result.Error) result).getException();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object suspendCatching(@NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull Continuation<? super Result<T>> continuation) {
        a aVar;
        Object objM5535constructorimpl;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f29277q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f29277q0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objInvoke = aVar.f29276p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f29277q0;
        try {
            if (i11 == 0) {
                kotlin.ResultKt.throwOnFailure(objInvoke);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                aVar.f29277q0 = 1;
                objInvoke = function1.invoke(aVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.ResultKt.throwOnFailure(objInvoke);
            }
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(objInvoke));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(kotlin.ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        return thM5538exceptionOrNullimpl == null ? objM5535constructorimpl : new Result.Error(thM5538exceptionOrNullimpl);
    }
}
