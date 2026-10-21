package com.bbva.ethermobilesdk.devicechecker.util;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.devicechecker.logger.DeviceCheckerLoggerKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ResultUtil.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u001a;\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u001c\u0010\u0003\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0004H\u0080@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a(\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0004H\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"catchingAndLog", "Lcom/bbva/ethermobile/help/kit/result/Result;", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "catchingAndSuppress", "", "throwable", "", "devicechecker_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nResultUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResultUtil.kt\ncom/bbva/ethermobilesdk/devicechecker/util/ResultUtilKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,27:1\n1#2:28\n*E\n"})
public final class ResultUtilKt {

    /* JADX INFO: compiled from: ResultUtil.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.devicechecker.util.ResultUtilKt", f = "ResultUtil.kt", i = {}, l = {22}, m = "catchingAndLog", n = {}, s = {})
    public static final class a<T> extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f29510p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f29511q0;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29510p0 = obj;
            this.f29511q0 |= Integer.MIN_VALUE;
            return ResultUtilKt.catchingAndLog(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final <T> Object catchingAndLog(@NotNull Function1<? super Continuation<? super T>, ? extends Object> function1, @NotNull Continuation<? super Result<T>> continuation) {
        a aVar;
        Object objM5535constructorimpl;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f29511q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f29511q0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objInvoke = aVar.f29510p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f29511q0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objInvoke);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                aVar.f29511q0 = 1;
                objInvoke = function1.invoke(aVar);
                if (objInvoke == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objInvoke);
            }
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(new Result.Success(objInvoke));
        } catch (Throwable th2) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return objM5535constructorimpl;
        }
        DeviceCheckerLoggerKt.logDeviceCheckerError(EtherLogger.INSTANCE, thM5538exceptionOrNullimpl, new PropertyReference1Impl() { // from class: com.bbva.ethermobilesdk.devicechecker.util.ResultUtilKt.b
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            @Nullable
            public final Object get(@Nullable Object obj) {
                return obj.getClass();
            }
        }.getClass());
        return new Result.Error(thM5538exceptionOrNullimpl);
    }

    public static final void catchingAndSuppress(@Nullable Throwable th2, @NotNull Function1<? super Unit, Unit> block) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(block, "block");
        try {
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(block);
        } catch (Throwable th3) {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            objM5535constructorimpl = kotlin.Result.m5535constructorimpl(ResultKt.createFailure(th3));
        }
        if (kotlin.Result.m5538exceptionOrNullimpl(objM5535constructorimpl) == null || th2 == null) {
            return;
        }
        DeviceCheckerLoggerKt.logDeviceCheckerError(EtherLogger.INSTANCE, th2, new PropertyReference1Impl() { // from class: com.bbva.ethermobilesdk.devicechecker.util.ResultUtilKt.c
            @Override // kotlin.jvm.internal.PropertyReference1Impl, kotlin.reflect.KProperty1
            @Nullable
            public final Object get(@Nullable Object obj) {
                return obj.getClass();
            }
        }.getClass());
    }

    public static /* synthetic */ void catchingAndSuppress$default(Throwable th2, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            th2 = null;
        }
        catchingAndSuppress(th2, function1);
    }
}
