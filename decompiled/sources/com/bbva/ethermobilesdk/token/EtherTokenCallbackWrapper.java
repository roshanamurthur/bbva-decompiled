package com.bbva.ethermobilesdk.token;

import com.bbva.ethermobilesdk.token.model.EtherTokenResult;
import com.bbva.ethermobilesdk.token.model.OTP;
import com.bbva.ethermobilesdk.token.model.TokenActivation;
import com.bbva.ethermobilesdk.token.model.TokenActivationForm;
import com.bbva.ethermobilesdk.token.model.TokenDetail;
import com.bbva.ethermobilesdk.token.plugin.command.ActivateTokenCommand;
import com.bbva.ethermobilesdk.token.storage.Storage;
import com.bbva.library.digipassmanager.helpers.RepositoryHelper;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EtherTokenCallbackWrapper.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J5\u0010\f\u001a\u00020\u000b2-\u0010\n\u001a)\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0002J5\u0010\u000f\u001a\u00020\u000b2-\u0010\n\u001a)\u0012\u001f\u0012\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0002J7\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102'\u0010\n\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0002JS\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052'\u0010\n\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00170\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0002J7\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00052'\u0010\n\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\t0\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0002JM\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00052\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001c\u001a\u00020\u001b2'\u0010\n\u001a#\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u001d0\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t0\u0002J\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\t0\u00032\u0006\u0010\u001f\u001a\u00020\u0005R\u0014\u0010$\u001a\u00020!8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006)"}, d2 = {"Lcom/bbva/ethermobilesdk/token/EtherTokenCallbackWrapper;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/Function1;", "Lcom/bbva/ethermobilesdk/token/model/EtherTokenResult;", "", "", "Lkotlin/ParameterName;", "name", "result", "", "callback", "Lkotlinx/coroutines/Job;", "getTokenIds", "", "Lcom/bbva/ethermobilesdk/token/model/TokenDetail;", "getTokenIdsDetail", "Lcom/bbva/ethermobilesdk/token/model/TokenActivation;", "tokenActivation", RepositoryHelper.ACTIVE_TOKEN, "authCode", ActivateTokenCommand.TOKEN_ID, "deviceId", "protocolVersion", "Lcom/bbva/ethermobilesdk/token/model/TokenActivationForm;", "generateActivationForm", "deleteToken", ClientData.KEY_CHALLENGE, "", "nextWindow", "Lcom/bbva/ethermobilesdk/token/model/OTP;", "generateOtp", "ocraSuite", "setDefaultOcraSuite", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lcom/bbva/ethermobilesdk/token/storage/Storage;", "storage", "<init>", "(Lcom/bbva/ethermobilesdk/token/storage/Storage;)V", "ethertoken_release"}, k = 1, mv = {1, 8, 0})
public final class EtherTokenCallbackWrapper implements CoroutineScope {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f30062p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final EtherToken f30063q0;

    /* JADX INFO: compiled from: EtherTokenCallbackWrapper.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.EtherTokenCallbackWrapper$activateToken$1", f = "EtherTokenCallbackWrapper.kt", i = {}, l = {53}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Function1 f30064p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f30065q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<EtherTokenResult<String>, Unit> f30066r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ EtherTokenCallbackWrapper f30067s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ TokenActivation f30068t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Function1<? super EtherTokenResult<String>, Unit> function1, EtherTokenCallbackWrapper etherTokenCallbackWrapper, TokenActivation tokenActivation, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f30066r0 = function1;
            this.f30067s0 = etherTokenCallbackWrapper;
            this.f30068t0 = tokenActivation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f30066r0, this.f30067s0, this.f30068t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Function1 function1;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f30065q0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                EtherToken etherToken = this.f30067s0.f30063q0;
                Function1<EtherTokenResult<String>, Unit> function2 = this.f30066r0;
                this.f30064p0 = function2;
                this.f30065q0 = 1;
                obj = etherToken.activateToken(this.f30068t0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = this.f30064p0;
                ResultKt.throwOnFailure(obj);
            }
            function1.invoke(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: EtherTokenCallbackWrapper.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.EtherTokenCallbackWrapper$deleteToken$1", f = "EtherTokenCallbackWrapper.kt", i = {}, l = {86}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Function1 f30069p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f30070q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<EtherTokenResult<Unit>, Unit> f30071r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ EtherTokenCallbackWrapper f30072s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f30073t0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Function1<? super EtherTokenResult<Unit>, Unit> function1, EtherTokenCallbackWrapper etherTokenCallbackWrapper, String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f30071r0 = function1;
            this.f30072s0 = etherTokenCallbackWrapper;
            this.f30073t0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f30071r0, this.f30072s0, this.f30073t0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Function1 function1;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f30070q0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                EtherToken etherToken = this.f30072s0.f30063q0;
                Function1<EtherTokenResult<Unit>, Unit> function2 = this.f30071r0;
                this.f30069p0 = function2;
                this.f30070q0 = 1;
                obj = etherToken.deleteToken(this.f30073t0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = this.f30069p0;
                ResultKt.throwOnFailure(obj);
            }
            function1.invoke(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: EtherTokenCallbackWrapper.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.EtherTokenCallbackWrapper$generateActivationForm$1", f = "EtherTokenCallbackWrapper.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Function1 f30074p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f30075q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<EtherTokenResult<TokenActivationForm>, Unit> f30076r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ EtherTokenCallbackWrapper f30077s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f30078t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ String f30079u0;
        public final /* synthetic */ String v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ String f30080w0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Function1<? super EtherTokenResult<TokenActivationForm>, Unit> function1, EtherTokenCallbackWrapper etherTokenCallbackWrapper, String str, String str2, String str3, String str4, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f30076r0 = function1;
            this.f30077s0 = etherTokenCallbackWrapper;
            this.f30078t0 = str;
            this.f30079u0 = str2;
            this.v0 = str3;
            this.f30080w0 = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.f30076r0, this.f30077s0, this.f30078t0, this.f30079u0, this.v0, this.f30080w0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Function1 function1;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f30075q0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                EtherToken etherToken = this.f30077s0.f30063q0;
                String str = this.f30078t0;
                String str2 = this.f30079u0;
                String str3 = this.v0;
                String str4 = this.f30080w0;
                Function1<EtherTokenResult<TokenActivationForm>, Unit> function2 = this.f30076r0;
                this.f30074p0 = function2;
                this.f30075q0 = 1;
                Object objGenerateActivationForm = etherToken.generateActivationForm(str, str2, str3, str4, this);
                if (objGenerateActivationForm == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function2;
                obj = objGenerateActivationForm;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = this.f30074p0;
                ResultKt.throwOnFailure(obj);
            }
            function1.invoke(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: EtherTokenCallbackWrapper.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.EtherTokenCallbackWrapper$generateOtp$1", f = "EtherTokenCallbackWrapper.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Function1 f30081p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f30082q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<EtherTokenResult<OTP>, Unit> f30083r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ EtherTokenCallbackWrapper f30084s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f30085t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ String f30086u0;
        public final /* synthetic */ boolean v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super EtherTokenResult<OTP>, Unit> function1, EtherTokenCallbackWrapper etherTokenCallbackWrapper, String str, String str2, boolean z10, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f30083r0 = function1;
            this.f30084s0 = etherTokenCallbackWrapper;
            this.f30085t0 = str;
            this.f30086u0 = str2;
            this.v0 = z10;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new d(this.f30083r0, this.f30084s0, this.f30085t0, this.f30086u0, this.v0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Function1 function1;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f30082q0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                EtherToken etherToken = this.f30084s0.f30063q0;
                Function1<EtherTokenResult<OTP>, Unit> function2 = this.f30083r0;
                this.f30081p0 = function2;
                this.f30082q0 = 1;
                obj = etherToken.generateOtp(this.f30085t0, this.f30086u0, this.v0, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = this.f30081p0;
                ResultKt.throwOnFailure(obj);
            }
            function1.invoke(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: EtherTokenCallbackWrapper.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.EtherTokenCallbackWrapper$getTokenIds$1", f = "EtherTokenCallbackWrapper.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Function1 f30087p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f30088q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<EtherTokenResult<Set<String>>, Unit> f30089r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ EtherTokenCallbackWrapper f30090s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public e(Function1<? super EtherTokenResult<Set<String>>, Unit> function1, EtherTokenCallbackWrapper etherTokenCallbackWrapper, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f30089r0 = function1;
            this.f30090s0 = etherTokenCallbackWrapper;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new e(this.f30089r0, this.f30090s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Function1 function1;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f30088q0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                EtherToken etherToken = this.f30090s0.f30063q0;
                Function1<EtherTokenResult<Set<String>>, Unit> function2 = this.f30089r0;
                this.f30087p0 = function2;
                this.f30088q0 = 1;
                obj = etherToken.getTokenIds(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = this.f30087p0;
                ResultKt.throwOnFailure(obj);
            }
            function1.invoke(obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: EtherTokenCallbackWrapper.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.EtherTokenCallbackWrapper$getTokenIdsDetail$1", f = "EtherTokenCallbackWrapper.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Function1 f30091p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f30092q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Function1<EtherTokenResult<List<TokenDetail>>, Unit> f30093r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ EtherTokenCallbackWrapper f30094s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Function1<? super EtherTokenResult<List<TokenDetail>>, Unit> function1, EtherTokenCallbackWrapper etherTokenCallbackWrapper, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f30093r0 = function1;
            this.f30094s0 = etherTokenCallbackWrapper;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.f30093r0, this.f30094s0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Function1 function1;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f30092q0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                EtherToken etherToken = this.f30094s0.f30063q0;
                Function1<EtherTokenResult<List<TokenDetail>>, Unit> function2 = this.f30093r0;
                this.f30091p0 = function2;
                this.f30092q0 = 1;
                obj = etherToken.getActivatedTokensDetail(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function1 = this.f30091p0;
                ResultKt.throwOnFailure(obj);
            }
            function1.invoke(obj);
            return Unit.INSTANCE;
        }
    }

    public EtherTokenCallbackWrapper(@NotNull Storage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f30062p0 = CoroutineScopeKt.MainScope();
        this.f30063q0 = new EtherToken(storage);
    }

    public static /* synthetic */ Job generateActivationForm$default(EtherTokenCallbackWrapper etherTokenCallbackWrapper, String str, String str2, String str3, String str4, Function1 function1, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str4 = null;
        }
        return etherTokenCallbackWrapper.generateActivationForm(str, str2, str3, str4, function1);
    }

    public static /* synthetic */ Job generateOtp$default(EtherTokenCallbackWrapper etherTokenCallbackWrapper, String str, String str2, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return etherTokenCallbackWrapper.generateOtp(str, str2, z10, function1);
    }

    @NotNull
    public final Job activateToken(@NotNull TokenActivation tokenActivation, @NotNull Function1<? super EtherTokenResult<String>, Unit> callback) {
        Intrinsics.checkNotNullParameter(tokenActivation, "tokenActivation");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new a(callback, this, tokenActivation, null), 3, null);
    }

    @NotNull
    public final Job deleteToken(@NotNull String tokenId, @NotNull Function1<? super EtherTokenResult<Unit>, Unit> callback) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(callback, this, tokenId, null), 3, null);
    }

    @NotNull
    public final Job generateActivationForm(@NotNull String authCode, @NotNull String tokenId, @NotNull String deviceId, @Nullable String protocolVersion, @NotNull Function1<? super EtherTokenResult<TokenActivationForm>, Unit> callback) {
        Intrinsics.checkNotNullParameter(authCode, "authCode");
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new c(callback, this, authCode, tokenId, deviceId, protocolVersion, null), 3, null);
    }

    @NotNull
    public final Job generateOtp(@NotNull String tokenId, @Nullable String challenge, boolean nextWindow, @NotNull Function1<? super EtherTokenResult<OTP>, Unit> callback) {
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new d(callback, this, tokenId, challenge, nextWindow, null), 3, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f30062p0.getCoroutineContext();
    }

    @NotNull
    public final Job getTokenIds(@NotNull Function1<? super EtherTokenResult<Set<String>>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new e(callback, this, null), 3, null);
    }

    @NotNull
    public final Job getTokenIdsDetail(@NotNull Function1<? super EtherTokenResult<List<TokenDetail>>, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new f(callback, this, null), 3, null);
    }

    @NotNull
    public final EtherTokenResult<Unit> setDefaultOcraSuite(@NotNull String ocraSuite) {
        Intrinsics.checkNotNullParameter(ocraSuite, "ocraSuite");
        return this.f30063q0.setDefaultOcraSuite(ocraSuite);
    }
}
