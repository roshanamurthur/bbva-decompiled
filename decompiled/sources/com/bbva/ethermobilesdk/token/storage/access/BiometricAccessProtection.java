package com.bbva.ethermobilesdk.token.storage.access;

import androidx.fragment.app.FragmentActivity;
import com.bbva.biometrics.authenticator.Biometrics;
import com.bbva.biometrics.authenticator.data.AuthenticateResult;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.ethermobilesdk.token.storage.Storage;
import com.bbva.ethermobilesdk.tokencompat.service.RelayedService;
import com.bbva.glomohybrid.base.handler.BiometricsIntentHandler;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: BiometricAccessProtection.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\tJ\u0019\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u0005H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/bbva/ethermobilesdk/token/storage/access/BiometricAccessProtection;", "Lcom/bbva/ethermobilesdk/token/storage/Storage;", "", "key", "value", "", "add", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "", RelayedService.KEY_IDS, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", Constants.deleteAll, "Landroidx/fragment/app/FragmentActivity;", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Lcom/bbva/biometrics/authenticator/Biometrics;", BiometricsIntentHandler.ID, "storage", "<init>", "(Landroidx/fragment/app/FragmentActivity;Lcom/bbva/biometrics/authenticator/Biometrics;Lcom/bbva/ethermobilesdk/token/storage/Storage;)V", "ethertoken_release"}, k = 1, mv = {1, 8, 0})
public final class BiometricAccessProtection implements Storage {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final FragmentActivity f30215p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final Biometrics f30216q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final Storage f30217r0;

    /* JADX INFO: compiled from: BiometricAccessProtection.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.storage.access.BiometricAccessProtection", f = "BiometricAccessProtection.kt", i = {0, 0, 0}, l = {37, 37}, m = "add", n = {"this", "key", "value"}, s = {"L$0", "L$1", "L$2"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public BiometricAccessProtection f30218p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f30219q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public String f30220r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f30221s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f30223u0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30221s0 = obj;
            this.f30223u0 |= Integer.MIN_VALUE;
            return BiometricAccessProtection.this.add(null, null, this);
        }
    }

    /* JADX INFO: compiled from: BiometricAccessProtection.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.storage.access.BiometricAccessProtection", f = "BiometricAccessProtection.kt", i = {0, 0}, l = {47, 47}, m = "delete", n = {"this", "key"}, s = {"L$0", "L$1"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public BiometricAccessProtection f30224p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f30225q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f30226r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f30228t0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30226r0 = obj;
            this.f30228t0 |= Integer.MIN_VALUE;
            return BiometricAccessProtection.this.delete(null, this);
        }
    }

    /* JADX INFO: compiled from: BiometricAccessProtection.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.storage.access.BiometricAccessProtection", f = "BiometricAccessProtection.kt", i = {0}, l = {57, 57}, m = Constants.deleteAll, n = {"this"}, s = {"L$0"})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public BiometricAccessProtection f30229p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f30230q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f30232s0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30230q0 = obj;
            this.f30232s0 |= Integer.MIN_VALUE;
            return BiometricAccessProtection.this.deleteAll(this);
        }
    }

    /* JADX INFO: compiled from: BiometricAccessProtection.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.storage.access.BiometricAccessProtection", f = "BiometricAccessProtection.kt", i = {0, 0}, l = {42, 42}, m = "get", n = {"this", "key"}, s = {"L$0", "L$1"})
    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public BiometricAccessProtection f30233p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f30234q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f30235r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f30237t0;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30235r0 = obj;
            this.f30237t0 |= Integer.MIN_VALUE;
            return BiometricAccessProtection.this.get(null, this);
        }
    }

    /* JADX INFO: compiled from: BiometricAccessProtection.kt */
    public static final class e extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Continuation<Boolean> f30238p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(SafeContinuation safeContinuation) {
            super(0);
            this.f30238p0 = safeContinuation;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Result.Companion companion = Result.INSTANCE;
            this.f30238p0.resumeWith(Result.m5535constructorimpl(Boolean.TRUE));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BiometricAccessProtection.kt */
    public static final class f extends Lambda implements Function2<Integer, String, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Continuation<Boolean> f30239p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(SafeContinuation safeContinuation) {
            super(2);
            this.f30239p0 = safeContinuation;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(Integer num, String str) {
            num.intValue();
            Intrinsics.checkNotNullParameter(str, "<anonymous parameter 1>");
            Result.Companion companion = Result.INSTANCE;
            this.f30239p0.resumeWith(Result.m5535constructorimpl(Boolean.FALSE));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BiometricAccessProtection.kt */
    public static final class g extends Lambda implements Function0<Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f30240p0 = new g(0);

        @Override // kotlin.jvm.functions.Function0
        public final /* bridge */ /* synthetic */ Unit invoke() {
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: BiometricAccessProtection.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.storage.access.BiometricAccessProtection", f = "BiometricAccessProtection.kt", i = {0}, l = {52, 52}, m = RelayedService.KEY_IDS, n = {"this"}, s = {"L$0"})
    public static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public BiometricAccessProtection f30241p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f30242q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f30244s0;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30242q0 = obj;
            this.f30244s0 |= Integer.MIN_VALUE;
            return BiometricAccessProtection.this.ids(this);
        }
    }

    public BiometricAccessProtection(@NotNull FragmentActivity activity, @NotNull Biometrics biometrics, @NotNull Storage storage) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(biometrics, "biometrics");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f30215p0 = activity;
        this.f30216q0 = biometrics;
        this.f30217r0 = storage;
    }

    public final Object a(Continuation<? super Boolean> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        Biometrics biometrics = this.f30216q0;
        FragmentActivity fragmentActivity = this.f30215p0;
        if (biometrics.canAuthenticate(fragmentActivity) instanceof AuthenticateResult.Success) {
            biometrics.show(fragmentActivity, new e(safeContinuation), new f(safeContinuation), g.f30240p0);
        } else {
            Result.Companion companion = Result.INSTANCE;
            safeContinuation.resumeWith(Result.m5535constructorimpl(Boxing.boxBoolean(false)));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object add(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) throws IllegalAccessException {
        a aVar;
        BiometricAccessProtection biometricAccessProtection;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f30223u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f30223u0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objA = aVar.f30221s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f30223u0;
        if (i11 != 0) {
            if (i11 == 1) {
                str2 = aVar.f30220r0;
                str = aVar.f30219q0;
                biometricAccessProtection = aVar.f30218p0;
                ResultKt.throwOnFailure(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objA);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objA);
        aVar.f30218p0 = this;
        aVar.f30219q0 = str;
        aVar.f30220r0 = str2;
        aVar.f30223u0 = 1;
        objA = a(aVar);
        if (objA == coroutine_suspended) {
            return coroutine_suspended;
        }
        biometricAccessProtection = this;
        if (!((Boolean) objA).booleanValue()) {
            throw new IllegalAccessException();
        }
        Storage storage = biometricAccessProtection.f30217r0;
        aVar.f30218p0 = null;
        aVar.f30219q0 = null;
        aVar.f30220r0 = null;
        aVar.f30223u0 = 2;
        if (storage.add(str, str2, aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object delete(@NotNull String str, @NotNull Continuation<? super Unit> continuation) throws IllegalAccessException {
        b bVar;
        BiometricAccessProtection biometricAccessProtection;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f30228t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f30228t0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objA = bVar.f30226r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f30228t0;
        if (i11 != 0) {
            if (i11 == 1) {
                str = bVar.f30225q0;
                biometricAccessProtection = bVar.f30224p0;
                ResultKt.throwOnFailure(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objA);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objA);
        bVar.f30224p0 = this;
        bVar.f30225q0 = str;
        bVar.f30228t0 = 1;
        objA = a(bVar);
        if (objA == coroutine_suspended) {
            return coroutine_suspended;
        }
        biometricAccessProtection = this;
        if (!((Boolean) objA).booleanValue()) {
            throw new IllegalAccessException();
        }
        Storage storage = biometricAccessProtection.f30217r0;
        bVar.f30224p0 = null;
        bVar.f30225q0 = null;
        bVar.f30228t0 = 2;
        if (storage.delete(str, bVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object deleteAll(@NotNull Continuation<? super Unit> continuation) throws IllegalAccessException {
        c cVar;
        BiometricAccessProtection biometricAccessProtection;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f30232s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f30232s0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object objA = cVar.f30230q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f30232s0;
        if (i11 != 0) {
            if (i11 == 1) {
                biometricAccessProtection = cVar.f30229p0;
                ResultKt.throwOnFailure(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objA);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(objA);
        cVar.f30229p0 = this;
        cVar.f30232s0 = 1;
        objA = a(cVar);
        if (objA == coroutine_suspended) {
            return coroutine_suspended;
        }
        biometricAccessProtection = this;
        if (!((Boolean) objA).booleanValue()) {
            throw new IllegalAccessException();
        }
        Storage storage = biometricAccessProtection.f30217r0;
        cVar.f30229p0 = null;
        cVar.f30232s0 = 2;
        if (storage.deleteAll(cVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object get(@NotNull String str, @NotNull Continuation<? super String> continuation) throws IllegalAccessException {
        d dVar;
        BiometricAccessProtection biometricAccessProtection;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i10 = dVar.f30237t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f30237t0 = i10 - Integer.MIN_VALUE;
            } else {
                dVar = new d(continuation);
            }
        } else {
            dVar = new d(continuation);
        }
        Object objA = dVar.f30235r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = dVar.f30237t0;
        if (i11 != 0) {
            if (i11 == 1) {
                str = dVar.f30234q0;
                biometricAccessProtection = dVar.f30233p0;
                ResultKt.throwOnFailure(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objA);
            }
        }
        ResultKt.throwOnFailure(objA);
        dVar.f30233p0 = this;
        dVar.f30234q0 = str;
        dVar.f30237t0 = 1;
        objA = a(dVar);
        if (objA == coroutine_suspended) {
            return coroutine_suspended;
        }
        biometricAccessProtection = this;
        if (!((Boolean) objA).booleanValue()) {
            throw new IllegalAccessException();
        }
        Storage storage = biometricAccessProtection.f30217r0;
        dVar.f30233p0 = null;
        dVar.f30234q0 = null;
        dVar.f30237t0 = 2;
        objA = storage.get(str, dVar);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object ids(@NotNull Continuation<? super Set<String>> continuation) throws IllegalAccessException {
        h hVar;
        BiometricAccessProtection biometricAccessProtection;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i10 = hVar.f30244s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f30244s0 = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object objA = hVar.f30242q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = hVar.f30244s0;
        if (i11 != 0) {
            if (i11 == 1) {
                biometricAccessProtection = hVar.f30241p0;
                ResultKt.throwOnFailure(objA);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objA);
            }
        }
        ResultKt.throwOnFailure(objA);
        hVar.f30241p0 = this;
        hVar.f30244s0 = 1;
        objA = a(hVar);
        if (objA == coroutine_suspended) {
            return coroutine_suspended;
        }
        biometricAccessProtection = this;
        if (!((Boolean) objA).booleanValue()) {
            throw new IllegalAccessException();
        }
        Storage storage = biometricAccessProtection.f30217r0;
        hVar.f30241p0 = null;
        hVar.f30244s0 = 2;
        objA = storage.ids(hVar);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }
}
