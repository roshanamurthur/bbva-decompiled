package com.bbva.ethermobilesdk.token.trait;

import androidx.core.app.NotificationCompat;
import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobilesdk.cipher.softcipher.SoftCipher;
import com.bbva.ethermobilesdk.token.logger.EtherTokenLoggerKt;
import com.bbva.ethermobilesdk.token.model.EtherTokenResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Trait.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\b\u001a\u00028\u00012\u0006\u0010\u0004\u001a\u00028\u0000H¤@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\u0007R\u001a\u0010\u000e\u001a\u00020\t8\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/token/trait/Trait;", "Request", "Result", "", "request", "Lcom/bbva/ethermobilesdk/token/model/EtherTokenResult;", "execute", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", NotificationCompat.CATEGORY_CALL, "Lcom/bbva/ethermobilesdk/cipher/softcipher/SoftCipher;", "a", "Lcom/bbva/ethermobilesdk/cipher/softcipher/SoftCipher;", "getCipher", "()Lcom/bbva/ethermobilesdk/cipher/softcipher/SoftCipher;", "cipher", "<init>", "()V", "ethertoken_release"}, k = 1, mv = {1, 8, 0})
public abstract class Trait<Request, Result> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final SoftCipher cipher = new SoftCipher();

    /* JADX INFO: compiled from: Trait.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.trait.Trait", f = "Trait.kt", i = {0}, l = {21}, m = "execute", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Trait f30249p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f30250q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Trait<Request, Result> f30251r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f30252s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Trait<Request, Result> trait, Continuation<? super a> continuation) {
            super(continuation);
            this.f30251r0 = trait;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30250q0 = obj;
            this.f30252s0 |= Integer.MIN_VALUE;
            return this.f30251r0.execute(null, this);
        }
    }

    @Nullable
    public abstract Object call(Request request, @NotNull Continuation<? super Result> continuation);

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object execute(Request request, @NotNull Continuation<? super EtherTokenResult<Result>> continuation) {
        a aVar;
        Object obj;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f30252s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f30252s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, continuation);
            }
        } else {
            aVar = new a(this, continuation);
        }
        Object objCall = aVar.f30250q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f30252s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objCall);
            try {
                aVar.f30249p0 = this;
                aVar.f30252s0 = 1;
                objCall = call(request, aVar);
                if (objCall == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj = this;
            } catch (Throwable th2) {
                th = th2;
                obj = this;
                EtherTokenLoggerKt.logEtherTokenError(EtherLogger.INSTANCE, th, obj.getClass());
                return new EtherTokenResult.Error(TraitKt.access$toEtherTokenError(th));
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = aVar.f30249p0;
            try {
                ResultKt.throwOnFailure(objCall);
                obj = obj;
            } catch (Throwable th3) {
                th = th3;
                EtherTokenLoggerKt.logEtherTokenError(EtherLogger.INSTANCE, th, obj.getClass());
                return new EtherTokenResult.Error(TraitKt.access$toEtherTokenError(th));
            }
        }
        return new EtherTokenResult.Success(objCall);
    }

    @NotNull
    public final SoftCipher getCipher() {
        return this.cipher;
    }
}
