package ek;

import kotlin.NotImplementedError;
import kotlin.SinceKotlin;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Intrinsics.kt */
/* JADX INFO: loaded from: classes12.dex */
public class a extends IntrinsicsKt__IntrinsicsJvmKt {
    @NotNull
    public static Object getCOROUTINE_SUSPENDED() {
        return CoroutineSingletons.COROUTINE_SUSPENDED;
    }

    @SinceKotlin(version = "1.3")
    @InlineOnly
    private static final <T> Object suspendCoroutineUninterceptedOrReturn(Function1<? super Continuation<? super T>, ? extends Object> function1, Continuation<? super T> continuation) {
        throw new NotImplementedError("Implementation of suspendCoroutineUninterceptedOrReturn is intrinsic");
    }

    @SinceKotlin(version = "1.3")
    public static /* synthetic */ void getCOROUTINE_SUSPENDED$annotations() {
    }
}
