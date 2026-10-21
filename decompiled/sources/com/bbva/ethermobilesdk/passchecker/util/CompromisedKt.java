package com.bbva.ethermobilesdk.passchecker.util;

import android.content.Context;
import com.bbva.ethermobilesdk.passchecker.network.HaveBeenPwnedKt;
import com.bbva.glomohybrid.login.domain.usecase.ValidatePasswordQualityUseCase;
import com.bbva.network.NetworkWorker;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Compromised.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001aE\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0080@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroid/content/Context;", "context", "Lcom/bbva/network/NetworkWorker;", "networkWorker", "", "disableCompromised", "", "timeout", "", "password", ValidatePasswordQualityUseCase.KEY_PASSWORD_COMPROMISED, "(Landroid/content/Context;Lcom/bbva/network/NetworkWorker;ZLjava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "passchecker_release"}, k = 2, mv = {1, 8, 0})
public final class CompromisedKt {

    /* JADX INFO: compiled from: Compromised.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.passchecker.util.CompromisedKt", f = "Compromised.kt", i = {}, l = {19}, m = ValidatePasswordQualityUseCase.KEY_PASSWORD_COMPROMISED, n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f29906p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f29907q0;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f29906p0 = obj;
            this.f29907q0 |= Integer.MIN_VALUE;
            return CompromisedKt.compromised(null, null, false, null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public static final Object compromised(@NotNull Context context, @Nullable NetworkWorker networkWorker, boolean z10, @Nullable Integer num, @NotNull String str, @NotNull Continuation<? super Integer> continuation) {
        a aVar;
        Object objM5535constructorimpl;
        int iIntValue;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f29907q0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f29907q0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objHaveBeenPwned = aVar.f29906p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f29907q0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objHaveBeenPwned);
                Result.Companion companion = Result.INSTANCE;
                if (z10) {
                    iIntValue = -1;
                } else {
                    int iIntValue2 = num != null ? num.intValue() : 1;
                    aVar.f29907q0 = 1;
                    objHaveBeenPwned = HaveBeenPwnedKt.haveBeenPwned(context, str, networkWorker, iIntValue2, aVar);
                    if (objHaveBeenPwned == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                objM5535constructorimpl = Result.m5535constructorimpl(Boxing.boxInt(iIntValue));
                if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) == null) {
                    return objM5535constructorimpl;
                }
                return Boxing.boxInt(-2);
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objHaveBeenPwned);
            iIntValue = ((Number) com.bbva.ethermobile.help.kit.result.ResultKt.getOrThrow((com.bbva.ethermobile.help.kit.result.Result) objHaveBeenPwned)).intValue();
            objM5535constructorimpl = Result.m5535constructorimpl(Boxing.boxInt(iIntValue));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m5538exceptionOrNullimpl(objM5535constructorimpl) == null) {
            return objM5535constructorimpl;
        }
        return Boxing.boxInt(-2);
    }

    public static /* synthetic */ Object compromised$default(Context context, NetworkWorker networkWorker, boolean z10, Integer num, String str, Continuation continuation, int i10, Object obj) {
        NetworkWorker networkWorker2 = (i10 & 2) != 0 ? null : networkWorker;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return compromised(context, networkWorker2, z10, (i10 & 8) != 0 ? null : num, str, continuation);
    }
}
