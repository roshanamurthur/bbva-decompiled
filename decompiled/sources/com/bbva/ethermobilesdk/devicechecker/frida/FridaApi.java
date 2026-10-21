package com.bbva.ethermobilesdk.devicechecker.frida;

import bk.q;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicechecker.p001native.DeviceCheckerNative;
import com.bbva.ethermobilesdk.devicechecker.util.ResultUtilKt;
import java.util.HashMap;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FridaApi.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J9\u0010\u0003\u001a*\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004j\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006`\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u0007H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\tJ\r\u0010\u000b\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\fJ\r\u0010\r\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u000eJ\r\u0010\u000f\u001a\u00020\u0007H\u0000¢\u0006\u0002\b\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/devicechecker/frida/FridaApi;", "", "()V", "isFridaCompleteDetected", "Ljava/util/HashMap;", "", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "Lkotlin/collections/HashMap;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isFridaDetected", "isFridaNamedPipesDetected", "isFridaNamedPipesDetected$devicechecker_release", "isFridaPathDetected", "isFridaPathDetected$devicechecker_release", "isFridaThreadsDetected", "isFridaThreadsDetected$devicechecker_release", "devicechecker_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FridaApi {

    /* JADX INFO: compiled from: FridaApi.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.frida.FridaApi$isFridaCompleteDetected$2", f = "FridaApi.kt", i = {}, l = {53, 54, 55}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HashMap<Integer, Result<Boolean>>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Pair[] f29433p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Pair[] f29434q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Integer f29435r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f29436s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f29437t0;

        /* JADX INFO: renamed from: com.bbva.ethermobilesdk.devicechecker.frida.FridaApi$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: FridaApi.kt */
        @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.frida.FridaApi$isFridaCompleteDetected$2$1", f = "FridaApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class C0123a extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ FridaApi f29439p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0123a(FridaApi fridaApi, Continuation<? super C0123a> continuation) {
                super(1, continuation);
                this.f29439p0 = fridaApi;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new C0123a(this.f29439p0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Boolean> continuation) {
                return ((C0123a) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.f29439p0.isFridaPathDetected$devicechecker_release());
            }
        }

        /* JADX INFO: compiled from: FridaApi.kt */
        @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.frida.FridaApi$isFridaCompleteDetected$2$2", f = "FridaApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ FridaApi f29440p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(FridaApi fridaApi, Continuation<? super b> continuation) {
                super(1, continuation);
                this.f29440p0 = fridaApi;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new b(this.f29440p0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Boolean> continuation) {
                return ((b) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.f29440p0.isFridaThreadsDetected$devicechecker_release());
            }
        }

        /* JADX INFO: compiled from: FridaApi.kt */
        @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.frida.FridaApi$isFridaCompleteDetected$2$3", f = "FridaApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Function1<Continuation<? super Boolean>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ FridaApi f29441p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(FridaApi fridaApi, Continuation<? super c> continuation) {
                super(1, continuation);
                this.f29441p0 = fridaApi;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@NotNull Continuation<?> continuation) {
                return new c(this.f29441p0, continuation);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Continuation<? super Boolean> continuation) {
                return ((c) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                return Boxing.boxBoolean(this.f29441p0.isFridaNamedPipesDetected$devicechecker_release());
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FridaApi.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HashMap<Integer, Result<Boolean>>> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00a5 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x00a6  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Pair[] pairArr;
            int i10;
            Integer numBoxInt;
            Pair[] pairArr2;
            Integer numBoxInt2;
            Pair[] pairArr3;
            Integer numBoxInt3;
            Object objCatchingAndLog;
            Integer num;
            Pair[] pairArr4;
            Pair[] pairArr5;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i11 = this.f29437t0;
            FridaApi fridaApi = FridaApi.this;
            int i12 = 2;
            int i13 = 1;
            if (i11 != 0) {
                if (i11 == 1) {
                    i10 = this.f29436s0;
                    numBoxInt = this.f29435r0;
                    Pair[] pairArr6 = this.f29434q0;
                    Pair[] pairArr7 = this.f29433p0;
                    ResultKt.throwOnFailure(obj);
                    pairArr2 = pairArr6;
                    pairArr = pairArr7;
                } else if (i11 == 2) {
                    i13 = this.f29436s0;
                    numBoxInt2 = this.f29435r0;
                    pairArr3 = this.f29434q0;
                    pairArr = this.f29433p0;
                    ResultKt.throwOnFailure(obj);
                    pairArr3[i13] = TuplesKt.to(numBoxInt2, obj);
                    numBoxInt3 = Boxing.boxInt(2);
                    c cVar = new c(fridaApi, null);
                    this.f29433p0 = pairArr;
                    this.f29434q0 = pairArr;
                    this.f29435r0 = numBoxInt3;
                    this.f29436s0 = 2;
                    this.f29437t0 = 3;
                    objCatchingAndLog = ResultUtilKt.catchingAndLog(cVar, this);
                    if (objCatchingAndLog == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    num = numBoxInt3;
                    obj = objCatchingAndLog;
                    pairArr4 = pairArr;
                    pairArr5 = pairArr4;
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i12 = this.f29436s0;
                    num = this.f29435r0;
                    pairArr4 = this.f29434q0;
                    pairArr5 = this.f29433p0;
                    ResultKt.throwOnFailure(obj);
                }
                pairArr4[i12] = TuplesKt.to(num, obj);
                return q.hashMapOf(pairArr5);
            }
            ResultKt.throwOnFailure(obj);
            pairArr = new Pair[3];
            i10 = 0;
            numBoxInt = Boxing.boxInt(0);
            C0123a c0123a = new C0123a(fridaApi, null);
            this.f29433p0 = pairArr;
            this.f29434q0 = pairArr;
            this.f29435r0 = numBoxInt;
            this.f29436s0 = 0;
            this.f29437t0 = 1;
            obj = ResultUtilKt.catchingAndLog(c0123a, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            pairArr2 = pairArr;
            pairArr2[i10] = TuplesKt.to(numBoxInt, obj);
            numBoxInt2 = Boxing.boxInt(1);
            b bVar = new b(fridaApi, null);
            this.f29433p0 = pairArr;
            this.f29434q0 = pairArr;
            this.f29435r0 = numBoxInt2;
            this.f29436s0 = 1;
            this.f29437t0 = 2;
            obj = ResultUtilKt.catchingAndLog(bVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            pairArr3 = pairArr;
            pairArr3[i13] = TuplesKt.to(numBoxInt2, obj);
            numBoxInt3 = Boxing.boxInt(2);
            c cVar2 = new c(fridaApi, null);
            this.f29433p0 = pairArr;
            this.f29434q0 = pairArr;
            this.f29435r0 = numBoxInt3;
            this.f29436s0 = 2;
            this.f29437t0 = 3;
            objCatchingAndLog = ResultUtilKt.catchingAndLog(cVar2, this);
            if (objCatchingAndLog == coroutine_suspended) {
                return coroutine_suspended;
            }
            num = numBoxInt3;
            obj = objCatchingAndLog;
            pairArr4 = pairArr;
            pairArr5 = pairArr4;
            pairArr4[i12] = TuplesKt.to(num, obj);
            return q.hashMapOf(pairArr5);
        }
    }

    /* JADX INFO: compiled from: FridaApi.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.frida.FridaApi$isFridaDetected$2", f = "FridaApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FridaApi.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            FridaApi fridaApi = FridaApi.this;
            return Boxing.boxBoolean(fridaApi.isFridaPathDetected$devicechecker_release() || fridaApi.isFridaThreadsDetected$devicechecker_release() || fridaApi.isFridaNamedPipesDetected$devicechecker_release());
        }
    }

    /* JADX INFO: compiled from: FridaApi.kt */
    public static final class c extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final c f29443p0 = new c(0);

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(new DeviceCheckerNative().isFridaNamedPipesDetected());
        }
    }

    /* JADX INFO: compiled from: FridaApi.kt */
    public static final class d extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final d f29444p0 = new d(0);

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(new DeviceCheckerNative().isFridaPathDetected());
        }
    }

    /* JADX INFO: compiled from: FridaApi.kt */
    public static final class e extends Lambda implements Function0<Integer> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f29445p0 = new e(0);

        @Override // kotlin.jvm.functions.Function0
        public final Integer invoke() {
            return Integer.valueOf(new DeviceCheckerNative().isFridaThreadsDetected());
        }
    }

    @Nullable
    public final Object isFridaCompleteDetected(@NotNull Continuation<? super HashMap<Integer, Result<Boolean>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new a(null), continuation);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use the isFridaCompleteDetected() method to check a complete detection", replaceWith = @ReplaceWith(expression = "isFridaCompleteDetected()", imports = {}))
    @Nullable
    public final Object isFridaDetected(@NotNull Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(null), continuation);
    }

    public final boolean isFridaNamedPipesDetected$devicechecker_release() {
        return ((Boolean) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow(com.bbva.ethermobilesdk.devicechecker.extension.ResultKt.toBooleanResult(com.bbva.ethermobile.help.kit.result.ResultKt.catching(c.f29443p0)))).booleanValue();
    }

    public final boolean isFridaPathDetected$devicechecker_release() {
        return ((Boolean) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow(com.bbva.ethermobilesdk.devicechecker.extension.ResultKt.toBooleanResult(com.bbva.ethermobile.help.kit.result.ResultKt.catching(d.f29444p0)))).booleanValue();
    }

    public final boolean isFridaThreadsDetected$devicechecker_release() {
        return ((Boolean) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow(com.bbva.ethermobilesdk.devicechecker.extension.ResultKt.toBooleanResult(com.bbva.ethermobile.help.kit.result.ResultKt.catching(e.f29445p0)))).booleanValue();
    }
}
