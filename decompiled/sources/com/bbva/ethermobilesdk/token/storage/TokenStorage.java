package com.bbva.ethermobilesdk.token.storage;

import com.bbva.ethermobilesdk.plugin.command.jwe.JweRSAKeyPairCommand;
import com.bbva.ethermobilesdk.token.model.EtherTokenError;
import com.bbva.ethermobilesdk.token.model.EtherTokenErrorType;
import com.bbva.ethermobilesdk.token.model.OcraSuite;
import com.bbva.ethermobilesdk.token.model.Token;
import com.bbva.ethermobilesdk.token.model.TokenActivation;
import com.bbva.ethermobilesdk.token.model.TokenRSA;
import com.bbva.ethermobilesdk.token.plugin.command.ActivateTokenCommand;
import com.bbva.ethermobilesdk.token.storage.data.StorageToken;
import com.bbva.ethermobilesdk.token.storage.data.mapper.TokenMapper;
import com.google.gson.Gson;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TokenStorage.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0017¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0015R\u0017\u0010\u001c\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/bbva/ethermobilesdk/token/storage/TokenStorage;", "", "", ActivateTokenCommand.TOKEN_ID, "Lcom/bbva/ethermobilesdk/token/model/TokenActivation;", "activation", "Lcom/bbva/ethermobilesdk/token/model/OcraSuite;", "ocraSuite", "", "setTokenActivation", "(Ljava/lang/String;Lcom/bbva/ethermobilesdk/token/model/TokenActivation;Lcom/bbva/ethermobilesdk/token/model/OcraSuite;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/token/model/TokenRSA;", JweRSAKeyPairCommand.RSA, "setTokenRSA", "(Ljava/lang/String;Lcom/bbva/ethermobilesdk/token/model/TokenRSA;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getTokenIds", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "id", "Lcom/bbva/ethermobilesdk/token/model/Token;", "getToken", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteToken", "Lcom/bbva/ethermobilesdk/token/storage/Storage;", "a", "Lcom/bbva/ethermobilesdk/token/storage/Storage;", "getStorage", "()Lcom/bbva/ethermobilesdk/token/storage/Storage;", "storage", "<init>", "(Lcom/bbva/ethermobilesdk/token/storage/Storage;)V", "ethertoken_release"}, k = 1, mv = {1, 8, 0})
public final class TokenStorage {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Storage storage;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Gson f30203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final TokenMapper f30204c;

    /* JADX INFO: compiled from: TokenStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.storage.TokenStorage", f = "TokenStorage.kt", i = {0}, l = {35}, m = "getToken", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TokenStorage f30205p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f30206q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f30208s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30206q0 = obj;
            this.f30208s0 |= Integer.MIN_VALUE;
            return TokenStorage.this.getToken(null, this);
        }
    }

    /* JADX INFO: compiled from: TokenStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.token.storage.TokenStorage", f = "TokenStorage.kt", i = {0, 0, 0, 0}, l = {22, 23}, m = "setTokenActivation", n = {"this", ActivateTokenCommand.TOKEN_ID, "activation", "ocraSuite"}, s = {"L$0", "L$1", "L$2", "L$3"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TokenStorage f30209p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f30210q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public TokenActivation f30211r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public OcraSuite f30212s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f30213t0;
        public int v0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30213t0 = obj;
            this.v0 |= Integer.MIN_VALUE;
            return TokenStorage.this.setTokenActivation(null, null, null, this);
        }
    }

    public TokenStorage(@NotNull Storage storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.storage = storage;
        this.f30203b = new Gson();
        this.f30204c = new TokenMapper();
    }

    public final Object a(Token token, Continuation<? super Unit> continuation) {
        StorageToken data = this.f30204c.toData(token);
        String id = token.getId();
        String json = this.f30203b.toJson(data);
        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(tokenData)");
        Object objAdd = this.storage.add(id, json, continuation);
        return objAdd == ek.a.getCOROUTINE_SUSPENDED() ? objAdd : Unit.INSTANCE;
    }

    @Nullable
    public final Object deleteToken(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        Object objDelete = this.storage.delete(str, continuation);
        return objDelete == ek.a.getCOROUTINE_SUSPENDED() ? objDelete : Unit.INSTANCE;
    }

    @NotNull
    public final Storage getStorage() {
        return this.storage;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getToken(@NotNull String str, @NotNull Continuation<? super Token> continuation) throws EtherTokenError {
        a aVar;
        TokenStorage tokenStorage;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f30208s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f30208s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f30206q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f30208s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            aVar.f30205p0 = this;
            aVar.f30208s0 = 1;
            obj = this.storage.get(str, aVar);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            tokenStorage = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tokenStorage = aVar.f30205p0;
            ResultKt.throwOnFailure(obj);
        }
        StorageToken storageToken = (StorageToken) tokenStorage.f30203b.fromJson((String) obj, StorageToken.class);
        if (storageToken != null) {
            return tokenStorage.f30204c.toModel(storageToken);
        }
        throw new EtherTokenError(EtherTokenErrorType.TOKEN_NOT_FOUND, null, 2, null);
    }

    @Nullable
    public final Object getTokenIds(@NotNull Continuation<? super Set<String>> continuation) {
        return this.storage.ids(continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object setTokenActivation(@NotNull String str, @NotNull TokenActivation tokenActivation, @NotNull OcraSuite ocraSuite, @NotNull Continuation<? super Unit> continuation) throws EtherTokenError {
        b bVar;
        TokenStorage tokenStorage;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.v0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.v0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object token = bVar.f30213t0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.v0;
        if (i11 != 0) {
            if (i11 == 1) {
                ocraSuite = bVar.f30212s0;
                tokenActivation = bVar.f30211r0;
                str = bVar.f30210q0;
                tokenStorage = bVar.f30209p0;
                ResultKt.throwOnFailure(token);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(token);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(token);
        bVar.f30209p0 = this;
        bVar.f30210q0 = str;
        bVar.f30211r0 = tokenActivation;
        bVar.f30212s0 = ocraSuite;
        bVar.v0 = 1;
        token = getToken(str, bVar);
        if (token == coroutine_suspended) {
            return coroutine_suspended;
        }
        tokenStorage = this;
        Token token2 = new Token(str, ((Token) token).getRsa(), tokenActivation, ocraSuite);
        bVar.f30209p0 = null;
        bVar.f30210q0 = null;
        bVar.f30211r0 = null;
        bVar.f30212s0 = null;
        bVar.v0 = 2;
        if (tokenStorage.a(token2, bVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    public final Object setTokenRSA(@NotNull String str, @NotNull TokenRSA tokenRSA, @NotNull Continuation<? super Unit> continuation) {
        Object objA = a(new Token(str, tokenRSA, null, null, 12, null), continuation);
        return objA == ek.a.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }
}
