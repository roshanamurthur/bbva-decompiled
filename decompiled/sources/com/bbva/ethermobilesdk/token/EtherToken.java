package com.bbva.ethermobilesdk.token;

import com.bbva.ethermobile.elogger.EtherLogger;
import com.bbva.ethermobilesdk.token.logger.EtherTokenLoggerKt;
import com.bbva.ethermobilesdk.token.model.ActivateTokenRequest;
import com.bbva.ethermobilesdk.token.model.CreateActivationRequest;
import com.bbva.ethermobilesdk.token.model.DeleteTokenRequest;
import com.bbva.ethermobilesdk.token.model.EtherTokenError;
import com.bbva.ethermobilesdk.token.model.EtherTokenErrorType;
import com.bbva.ethermobilesdk.token.model.EtherTokenResult;
import com.bbva.ethermobilesdk.token.model.OTP;
import com.bbva.ethermobilesdk.token.model.OcraSuite;
import com.bbva.ethermobilesdk.token.model.TokenActivation;
import com.bbva.ethermobilesdk.token.model.TokenActivationForm;
import com.bbva.ethermobilesdk.token.model.TokenDetail;
import com.bbva.ethermobilesdk.token.ocra.OcraParser;
import com.bbva.ethermobilesdk.token.plugin.command.ActivateTokenCommand;
import com.bbva.ethermobilesdk.token.storage.Storage;
import com.bbva.ethermobilesdk.token.storage.TokenStorage;
import com.bbva.ethermobilesdk.token.time.TimeProvider;
import com.bbva.ethermobilesdk.token.trait.impl.ActivateTokenTrait;
import com.bbva.ethermobilesdk.token.trait.impl.CreateActivationTrait;
import com.bbva.ethermobilesdk.token.trait.impl.DeleteTokenTrait;
import com.bbva.ethermobilesdk.token.trait.impl.GetActivatedTokensDetailTrait;
import com.bbva.ethermobilesdk.token.trait.impl.GetTokenIdsTrait;
import com.bbva.library.digipassmanager.helpers.RepositoryHelper;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: EtherToken.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001f\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\tJ!\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J=\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0012\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J7\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00042\u0006\u0010\u0012\u001a\u00020\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u001bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lcom/bbva/ethermobilesdk/token/EtherToken;", "", "", "ocraSuite", "Lcom/bbva/ethermobilesdk/token/model/EtherTokenResult;", "", "setDefaultOcraSuite", "", "getTokenIds", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lcom/bbva/ethermobilesdk/token/model/TokenDetail;", "getActivatedTokensDetail", "Lcom/bbva/ethermobilesdk/token/model/TokenActivation;", "tokenActivation", RepositoryHelper.ACTIVE_TOKEN, "(Lcom/bbva/ethermobilesdk/token/model/TokenActivation;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "authCode", ActivateTokenCommand.TOKEN_ID, "deviceId", "protocolVersion", "Lcom/bbva/ethermobilesdk/token/model/TokenActivationForm;", "generateActivationForm", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", ClientData.KEY_CHALLENGE, "", "nextWindow", "Lcom/bbva/ethermobilesdk/token/model/OTP;", "generateOtp", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/token/storage/Storage;", "storage", "<init>", "(Lcom/bbva/ethermobilesdk/token/storage/Storage;)V", "ethertoken_release"}, k = 1, mv = {1, 8, 0})
public final class EtherToken {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final TokenStorage f30036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final TimeProvider f30037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public OcraSuite f30038c;

    /* JADX INFO: compiled from: EtherToken.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.EtherToken$1", f = "EtherToken.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EtherToken.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            EtherToken.this.f30037b.initialize();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: EtherToken.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.EtherToken$activateToken$2", f = "EtherToken.kt", i = {}, l = {90}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EtherTokenResult<String>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f30040p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ TokenActivation f30042r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TokenActivation tokenActivation, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f30042r0 = tokenActivation;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EtherToken.this.new b(this.f30042r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super EtherTokenResult<String>> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f30040p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                EtherToken etherToken = EtherToken.this;
                ActivateTokenTrait activateTokenTrait = new ActivateTokenTrait(etherToken.f30036a, etherToken.f30038c);
                ActivateTokenRequest activateTokenRequest = new ActivateTokenRequest(this.f30042r0);
                this.f30040p0 = 1;
                obj = activateTokenTrait.execute(activateTokenRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: compiled from: EtherToken.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.EtherToken$deleteToken$2", f = "EtherToken.kt", i = {}, l = {124}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EtherTokenResult<Unit>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f30043p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f30045r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f30045r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EtherToken.this.new c(this.f30045r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super EtherTokenResult<Unit>> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f30043p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                DeleteTokenTrait deleteTokenTrait = new DeleteTokenTrait(EtherToken.this.f30036a);
                DeleteTokenRequest deleteTokenRequest = new DeleteTokenRequest(this.f30045r0);
                this.f30043p0 = 1;
                obj = deleteTokenTrait.execute(deleteTokenRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: compiled from: EtherToken.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.EtherToken$generateActivationForm$2", f = "EtherToken.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EtherTokenResult<TokenActivationForm>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f30046p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f30048r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ String f30049s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f30050t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ String f30051u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, String str2, String str3, String str4, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f30048r0 = str;
            this.f30049s0 = str2;
            this.f30050t0 = str3;
            this.f30051u0 = str4;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EtherToken.this.new d(this.f30048r0, this.f30049s0, this.f30050t0, this.f30051u0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super EtherTokenResult<TokenActivationForm>> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f30046p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                CreateActivationTrait createActivationTrait = new CreateActivationTrait(EtherToken.this.f30036a);
                String str = this.f30051u0;
                if (str == null) {
                    str = "1.0";
                }
                CreateActivationRequest createActivationRequest = new CreateActivationRequest(this.f30048r0, this.f30049s0, this.f30050t0, str);
                this.f30046p0 = 1;
                obj = createActivationTrait.execute(createActivationRequest, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: compiled from: EtherToken.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.EtherToken", f = "EtherToken.kt", i = {0, 0, 0, 1, 1, 1}, l = {144, 146, 150, 152}, m = "generateOtp", n = {"this", ActivateTokenCommand.TOKEN_ID, "nextWindow", "this", ActivateTokenCommand.TOKEN_ID, "nextWindow"}, s = {"L$0", "L$1", "Z$0", "L$0", "L$1", "Z$0"})
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public EtherToken f30052p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f30053q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f30054r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f30055s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f30057u0;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30055s0 = obj;
            this.f30057u0 |= Integer.MIN_VALUE;
            return EtherToken.this.generateOtp(null, null, false, this);
        }
    }

    /* JADX INFO: compiled from: EtherToken.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.EtherToken$getActivatedTokensDetail$2", f = "EtherToken.kt", i = {}, l = {77}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EtherTokenResult<List<? extends TokenDetail>>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f30058p0;

        public f(Continuation<? super f> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EtherToken.this.new f(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super EtherTokenResult<List<? extends TokenDetail>>> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f30058p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                GetActivatedTokensDetailTrait getActivatedTokensDetailTrait = new GetActivatedTokensDetailTrait(EtherToken.this.f30036a);
                Unit unit = Unit.INSTANCE;
                this.f30058p0 = 1;
                obj = getActivatedTokensDetailTrait.execute(unit, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: compiled from: EtherToken.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.EtherToken$getTokenIds$2", f = "EtherToken.kt", i = {}, l = {67}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super EtherTokenResult<Set<? extends String>>>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f30060p0;

        public g(Continuation<? super g> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return EtherToken.this.new g(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super EtherTokenResult<Set<? extends String>>> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f30060p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                GetTokenIdsTrait getTokenIdsTrait = new GetTokenIdsTrait(EtherToken.this.f30036a);
                Unit unit = Unit.INSTANCE;
                this.f30060p0 = 1;
                obj = getTokenIdsTrait.execute(unit, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return obj;
        }
    }

    public EtherToken(@NotNull Storage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f30036a = new TokenStorage(storage);
        this.f30037b = new TimeProvider();
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new a(null), 3, null);
    }

    public static final Object access$executeChallengeRequest(EtherToken etherToken, String str, String str2, int i10, Continuation continuation) {
        etherToken.getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new o7.a(etherToken, str, str2, i10, null), continuation);
    }

    public static final Object access$executeOtpRequest(EtherToken etherToken, String str, int i10, Continuation continuation) {
        etherToken.getClass();
        return BuildersKt.withContext(Dispatchers.getIO(), new o7.b(etherToken, str, i10, null), continuation);
    }

    public static /* synthetic */ Object generateActivationForm$default(EtherToken etherToken, String str, String str2, String str3, String str4, Continuation continuation, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            str4 = null;
        }
        return etherToken.generateActivationForm(str, str2, str3, str4, continuation);
    }

    public static /* synthetic */ Object generateOtp$default(EtherToken etherToken, String str, String str2, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = null;
        }
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return etherToken.generateOtp(str, str2, z10, continuation);
    }

    @Nullable
    public final Object activateToken(@NotNull TokenActivation tokenActivation, @NotNull Continuation<? super EtherTokenResult<String>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new b(tokenActivation, null), continuation);
    }

    @Nullable
    public final Object deleteToken(@NotNull String str, @NotNull Continuation<? super EtherTokenResult<Unit>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new c(str, null), continuation);
    }

    @Nullable
    public final Object generateActivationForm(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, @NotNull Continuation<? super EtherTokenResult<TokenActivationForm>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new d(str2, str3, str, str4, null), continuation);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00d9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:43:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f6 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x001c  */
    @Nullable
    public final Object generateOtp(@NotNull String str, @Nullable String str2, boolean z10, @NotNull Continuation<? super EtherTokenResult<OTP>> continuation) {
        e eVar;
        EtherToken etherToken;
        String str3;
        boolean z11;
        EtherTokenResult etherTokenResult;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i10 = eVar.f30057u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f30057u0 = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        e eVar2 = eVar;
        Object objWithContext = eVar2.f30055s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar2.f30057u0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objWithContext);
            if (str2 == null) {
                etherToken = this;
                str3 = str;
                z11 = z10;
            } else if (z10) {
                eVar2.f30052p0 = this;
                eVar2.f30053q0 = str;
                eVar2.f30054r0 = z10;
                eVar2.f30057u0 = 2;
                objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new o7.a(this, str, str2, 1, null), eVar2);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                etherToken = this;
                str3 = str;
                z11 = z10;
                etherTokenResult = (EtherTokenResult) objWithContext;
            } else {
                eVar2.f30052p0 = this;
                eVar2.f30053q0 = str;
                eVar2.f30054r0 = z10;
                eVar2.f30057u0 = 1;
                objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new o7.a(this, str, str2, 0, null), eVar2);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                etherToken = this;
                str3 = str;
                z11 = z10;
                etherTokenResult = (EtherTokenResult) objWithContext;
            }
            if (z11) {
                eVar2.f30052p0 = null;
                eVar2.f30053q0 = null;
                eVar2.f30057u0 = 4;
                etherToken.getClass();
                objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new o7.b(etherToken, str3, 1, null), eVar2);
                if (objWithContext == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (EtherTokenResult) objWithContext;
            }
            eVar2.f30052p0 = null;
            eVar2.f30053q0 = null;
            eVar2.f30057u0 = 3;
            etherToken.getClass();
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new o7.b(etherToken, str3, 0, null), eVar2);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (EtherTokenResult) objWithContext;
        }
        if (i11 == 1) {
            z11 = eVar2.f30054r0;
            str3 = eVar2.f30053q0;
            etherToken = eVar2.f30052p0;
            ResultKt.throwOnFailure(objWithContext);
            etherTokenResult = (EtherTokenResult) objWithContext;
        } else {
            if (i11 != 2) {
                if (i11 == 3) {
                    ResultKt.throwOnFailure(objWithContext);
                    return (EtherTokenResult) objWithContext;
                }
                if (i11 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objWithContext);
                return (EtherTokenResult) objWithContext;
            }
            z11 = eVar2.f30054r0;
            str3 = eVar2.f30053q0;
            etherToken = eVar2.f30052p0;
            ResultKt.throwOnFailure(objWithContext);
            etherTokenResult = (EtherTokenResult) objWithContext;
        }
        if (etherTokenResult != null) {
            return etherTokenResult;
        }
        if (z11) {
            eVar2.f30052p0 = null;
            eVar2.f30053q0 = null;
            eVar2.f30057u0 = 3;
            etherToken.getClass();
            objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new o7.b(etherToken, str3, 0, null), eVar2);
            if (objWithContext == coroutine_suspended) {
                return coroutine_suspended;
            }
            return (EtherTokenResult) objWithContext;
        }
        eVar2.f30052p0 = null;
        eVar2.f30053q0 = null;
        eVar2.f30057u0 = 4;
        etherToken.getClass();
        objWithContext = BuildersKt.withContext(Dispatchers.getIO(), new o7.b(etherToken, str3, 1, null), eVar2);
        if (objWithContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        return (EtherTokenResult) objWithContext;
    }

    @Nullable
    public final Object getActivatedTokensDetail(@NotNull Continuation<? super EtherTokenResult<List<TokenDetail>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new f(null), continuation);
    }

    @Nullable
    public final Object getTokenIds(@NotNull Continuation<? super EtherTokenResult<Set<String>>> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new g(null), continuation);
    }

    @NotNull
    public final EtherTokenResult<Unit> setDefaultOcraSuite(@NotNull String ocraSuite) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(ocraSuite, "ocraSuite");
        try {
            Result.Companion companion = Result.INSTANCE;
            this.f30038c = new OcraParser().parse(ocraSuite);
            objM5535constructorimpl = Result.m5535constructorimpl(new EtherTokenResult.Success(Unit.INSTANCE));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl != null) {
            EtherTokenLoggerKt.logEtherTokenError(EtherLogger.INSTANCE, thM5538exceptionOrNullimpl, EtherToken.class);
            objM5535constructorimpl = new EtherTokenResult.Error(new EtherTokenError(EtherTokenErrorType.INVALID_OCRA_SUITE, thM5538exceptionOrNullimpl));
        }
        return (EtherTokenResult) objM5535constructorimpl;
    }
}
