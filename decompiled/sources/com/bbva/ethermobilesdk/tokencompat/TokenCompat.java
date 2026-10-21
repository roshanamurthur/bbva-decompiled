package com.bbva.ethermobilesdk.tokencompat;

import com.bbva.ethermobilesdk.token.EtherToken;
import com.bbva.ethermobilesdk.token.model.EtherTokenResult;
import com.bbva.ethermobilesdk.token.model.OTP;
import com.bbva.ethermobilesdk.token.model.TokenActivation;
import com.bbva.ethermobilesdk.token.model.TokenActivationForm;
import com.bbva.ethermobilesdk.token.plugin.command.ActivateTokenCommand;
import com.bbva.ethermobilesdk.tokencompat.contract.SoftTokenClient;
import com.bbva.ethermobilesdk.tokencompat.extension.LegacyTokenExtensionsKt;
import com.bbva.ethermobilesdk.tokencompat.extension.LoggerKt;
import com.bbva.ethermobilesdk.tokencompat.model.TokenCompatActivationRequest;
import com.bbva.ethermobilesdk.tokencompat.model.TokenCompatActivationResponse;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.LegacyToken;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STArray;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STOathParam;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STOtp;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STParam;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STRC;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STRemainingTime;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STReturnCode;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.STToken;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenPub;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.TokenType;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.impl.STArrayImpl;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.impl.STParamImpl;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.impl.STRemainingTimeImpl;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.impl.STReturnCodeImpl;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.impl.STTokenImpl;
import com.bbva.ethermobilesdk.tokencompat.network.NetworkClient;
import com.bbva.ethermobilesdk.tokencompat.network.NetworkWorker;
import com.bbva.ethermobilesdk.tokencompat.network.impl.TokenCompatNetworkClientR1;
import com.bbva.ethermobilesdk.tokencompat.network.impl.TokenCompatNetworkClientR2;
import com.bbva.ethermobilesdk.tokencompat.storage.provider.TokenCompatStorageProvider;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.esotericsoftware.asm.Opcodes;
import com.google.android.gms.fido.u2f.api.common.ClientData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.l;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TokenCompat.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0001PB\u0019\b\u0000\u0012\u0006\u00105\u001a\u000200\u0012\u0006\u0010;\u001a\u000206¢\u0006\u0004\bK\u0010LB\u0011\b\u0016\u0012\u0006\u0010N\u001a\u00020M¢\u0006\u0004\bK\u0010OJ\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0004\u001a\u00020\u0003J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u0012\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0003H\u0016J\u0012\u0010\u0015\u001a\u00020\u00122\b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u0016J\u0018\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u0003H\u0016J@\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u00032\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cH\u0016J\u001a\u0010 \u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0016J.\u0010$\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\u0010!\u001a\u0004\u0018\u00010\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0016J.\u0010%\u001a\u00020#2\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\u0019\u001a\u0004\u0018\u00010\u00032\b\u0010!\u001a\u0004\u0018\u00010\u00032\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\u001a\u0010'\u001a\u00020&2\u0006\u0010\u000f\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010\u000bH\u0016J \u0010)\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00032\u0006\u0010(\u001a\u00020\u0003H\u0016J\u0018\u0010-\u001a\u00020,2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*H\u0016J \u0010/\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010+\u001a\u00020*2\u0006\u0010.\u001a\u00020\u0003H\u0016R\u001a\u00105\u001a\u0002008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010;\u001a\u0002068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010A\u001a\u00020<8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010DR<\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030F2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030F8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bG\u0010H\"\u0004\bI\u0010J¨\u0006Q"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompat;", "Lcom/bbva/ethermobilesdk/tokencompat/contract/SoftTokenClient;", "Lkotlinx/coroutines/CoroutineScope;", "", "ocraSuite", "Lcom/bbva/ethermobilesdk/token/model/EtherTokenResult;", "", "setDefaultOcraSuite", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "interceptor", "addInterceptor", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/TokenType;", "type", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STArray;", "getTokenList", "refToken", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STToken;", "getToken", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STReturnCode;", "deleteToken", "authPrefixFilter", "deleteTokens", "name", "setTokenDescription", "authCode", "pin", "deviceId", ActivateTokenCommand.TOKEN_ID, "", "headers", "registerToken", "uri", "registerTokenWithUri", ClientData.KEY_CHALLENGE, "tokenType", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STOtp;", "generateOTP", "generateNextOTP", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STRemainingTime;", "getRemainingTime", "newPin", "changePassword", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STOathParam;", "oathParam", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/STParam;", "getTokenOATHParam", "value", "setTokenOATHParam", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatStorage;", "p0", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatStorage;", "getStorage$ethertoken_compat_release", "()Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatStorage;", "storage", "Lcom/bbva/ethermobilesdk/tokencompat/network/NetworkClient;", "q0", "Lcom/bbva/ethermobilesdk/tokencompat/network/NetworkClient;", "getNetworkClient$ethertoken_compat_release", "()Lcom/bbva/ethermobilesdk/tokencompat/network/NetworkClient;", "networkClient", "Lcom/bbva/ethermobilesdk/token/EtherToken;", "s0", "Lcom/bbva/ethermobilesdk/token/EtherToken;", "getEtherToken$ethertoken_compat_release", "()Lcom/bbva/ethermobilesdk/token/EtherToken;", "etherToken", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "", "getHeaders", "()Ljava/util/Map;", "setHeaders", "(Ljava/util/Map;)V", "<init>", "(Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatStorage;Lcom/bbva/ethermobilesdk/tokencompat/network/NetworkClient;)V", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;", "config", "(Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig;)V", "Companion", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
public final class TokenCompat implements SoftTokenClient, CoroutineScope {

    @NotNull
    public static final String DEFAULT_OCRA = "OCRA-1:HOTP-SHA256-6:QN08-T30S";

    @NotNull
    public static final String FIRST_GEN_VERSION = "1.0";

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final TokenCompatStorage storage;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NetworkClient networkClient;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f30300r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final EtherToken etherToken;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final String f30297t0 = TokenCompat.class.getName();

    /* JADX INFO: compiled from: TokenCompat.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\n \u0007*\u0004\u0018\u00010\u00040\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompat$Companion;", "", "()V", "DEFAULT_OCRA", "", "FIRST_GEN_VERSION", "TAG", "kotlin.jvm.PlatformType", "getTAG", "()Ljava/lang/String;", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getTAG() {
            return TokenCompat.f30297t0;
        }
    }

    /* JADX INFO: compiled from: TokenCompat.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TokenCompatConfig.EndpointConfig.Mode.values().length];
            try {
                iArr[TokenCompatConfig.EndpointConfig.Mode.R1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TokenCompatConfig.EndpointConfig.Mode.R2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: TokenCompat.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompat$deleteToken$1", f = "TokenCompat.kt", i = {}, l = {120}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super STReturnCode>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f30302p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f30303q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f30304r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ TokenCompat f30305s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(TokenCompat tokenCompat, String str, Continuation continuation) {
            super(2, continuation);
            this.f30304r0 = str;
            this.f30305s0 = tokenCompat;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            a aVar = new a(this.f30305s0, this.f30304r0, continuation);
            aVar.f30303q0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super STReturnCode> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM5535constructorimpl;
            String str;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f30302p0;
            String str2 = this.f30304r0;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    LoggerKt.log("Delete token [" + str2 + Constant.BRACKET_CLOSE);
                    TokenCompat tokenCompat = this.f30305s0;
                    Result.Companion companion = Result.INSTANCE;
                    TokenCompatStorage storage = tokenCompat.getStorage();
                    this.f30303q0 = str2;
                    this.f30302p0 = 1;
                    if (storage.delete(str2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str = str2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = (String) this.f30303q0;
                    ResultKt.throwOnFailure(obj);
                }
                LoggerKt.log("Deleted token [" + str + Constant.BRACKET_CLOSE);
                objM5535constructorimpl = Result.m5535constructorimpl(new STReturnCodeImpl.Ok(0, null, 3, null));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
            if (thM5538exceptionOrNullimpl != null) {
                LoggerKt.log("Failed to delete token [" + str2 + "]: " + thM5538exceptionOrNullimpl.getMessage());
                String localizedMessage = thM5538exceptionOrNullimpl.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "Unknown error";
                } else {
                    Intrinsics.checkNotNullExpressionValue(localizedMessage, "it.localizedMessage ?: \"Unknown error\"");
                }
                objM5535constructorimpl = new STReturnCodeImpl.TokenNotDeleted(localizedMessage, 0, null, 6, null);
            }
            return objM5535constructorimpl;
        }
    }

    /* JADX INFO: compiled from: TokenCompat.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompat$deleteTokens$1", f = "TokenCompat.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nTokenCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenCompat.kt\ncom/bbva/ethermobilesdk/tokencompat/TokenCompat$deleteTokens$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,348:1\n1#2:349\n766#3:350\n857#3,2:351\n1855#3,2:353\n*S KotlinDebug\n*F\n+ 1 TokenCompat.kt\ncom/bbva/ethermobilesdk/tokencompat/TokenCompat$deleteTokens$1\n*L\n145#1:350\n145#1:351,2\n149#1:353,2\n*E\n"})
    public static final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super STReturnCode>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f30306p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ TokenCompat f30307q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(TokenCompat tokenCompat, String str, Continuation continuation) {
            super(2, continuation);
            this.f30306p0 = str;
            this.f30307q0 = tokenCompat;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new b(this.f30307q0, this.f30306p0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super STReturnCode> continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Type inference failed for: r5v10, types: [T, com.bbva.ethermobilesdk.tokencompat.model.legacy.impl.STReturnCodeImpl$TokensNotDeleted] */
        /* JADX WARN: Type inference failed for: r7v2, types: [T, com.bbva.ethermobilesdk.tokencompat.model.legacy.impl.STReturnCodeImpl$Ok] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            String strConcat;
            String str;
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            String str2 = this.f30306p0;
            if (str2 == null || (strConcat = "with prefix ".concat(str2)) == null) {
                strConcat = "";
            }
            LoggerKt.log("Delete tokens ".concat(strConcat));
            TokenCompat tokenCompat = this.f30307q0;
            STArray tokenList = tokenCompat.getTokenList(null);
            List<TokenPub> value = tokenList.getValue();
            if (tokenList.getRc().getValue() != STRC.RC_OK.getValue()) {
                LoggerKt.logError$default("Delete tokens failed with code " + tokenList + ".rc: " + tokenList.getRc().getDescription(), null, 2, null);
                return tokenList.getRc();
            }
            List<TokenPub> list = value;
            if (list == null || list.isEmpty()) {
                LoggerKt.log("Delete tokens: token list is empty");
                return new STReturnCodeImpl.Ok(0, "No tokens deleted", 1, null);
            }
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            objectRef.element = new STReturnCodeImpl.Ok(0, null, 3, null);
            ArrayList<TokenPub> arrayList = new ArrayList();
            for (Object obj2 : value) {
                TokenPub tokenPub = (TokenPub) obj2;
                if (str2 == null || ((str = (String) CollectionsKt___CollectionsKt.lastOrNull(StringsKt__StringsKt.split$default((CharSequence) tokenPub.getSerial(), new String[]{Constant.DASH_STRING}, false, 0, 6, (Object) null))) != null && l.startsWith$default(str, str2, false, 2, null))) {
                    arrayList.add(obj2);
                }
            }
            for (TokenPub tokenPub2 : arrayList) {
                STReturnCode sTReturnCodeDeleteToken = tokenCompat.deleteToken(tokenPub2.getSerial());
                if (sTReturnCodeDeleteToken.getValue() != STRC.RC_OK.getValue()) {
                    LoggerKt.logError$default("Delete tokens failed to delete [" + tokenPub2.getSerial() + "] with code " + sTReturnCodeDeleteToken.getValue() + ": " + sTReturnCodeDeleteToken.getDescription(), null, 2, null);
                    objectRef.element = new STReturnCodeImpl.TokensNotDeleted(0, null, 3, null);
                }
            }
            return objectRef.element;
        }
    }

    /* JADX INFO: compiled from: TokenCompat.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompat$getRemainingTime$1", f = "TokenCompat.kt", i = {}, l = {313}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super STRemainingTime>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f30308p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f30310r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f30310r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TokenCompat.this.new c(this.f30310r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super STRemainingTime> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f30308p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                EtherToken etherToken = TokenCompat.this.getEtherToken();
                this.f30308p0 = 1;
                obj = etherToken.generateOtp(this.f30310r0, null, false, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            EtherTokenResult etherTokenResult = (EtherTokenResult) obj;
            if (etherTokenResult instanceof EtherTokenResult.Success) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                EtherTokenResult.Success success = (EtherTokenResult.Success) etherTokenResult;
                return new STRemainingTimeImpl.Ok((int) ((((OTP) success.getValue()).getValidUntil() - jCurrentTimeMillis >= 0 ? ((OTP) success.getValue()).getValidUntil() - jCurrentTimeMillis : 0L) / ((long) 1000)));
            }
            if (etherTokenResult instanceof EtherTokenResult.Error) {
                return new STRemainingTimeImpl.OtpNull();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: compiled from: TokenCompat.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompat$getToken$1", f = "TokenCompat.kt", i = {}, l = {108}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super STToken>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f30311p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f30312q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f30313r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ TokenCompat f30314s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TokenCompat tokenCompat, String str, Continuation continuation) {
            super(2, continuation);
            this.f30313r0 = str;
            this.f30314s0 = tokenCompat;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = new d(this.f30314s0, this.f30313r0, continuation);
            dVar.f30312q0 = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super STToken> continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM5535constructorimpl;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f30311p0;
            String str = this.f30313r0;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    LoggerKt.log("Get token [" + str + Constant.BRACKET_CLOSE);
                    TokenCompat tokenCompat = this.f30314s0;
                    Result.Companion companion = Result.INSTANCE;
                    TokenCompatStorage storage = tokenCompat.getStorage();
                    this.f30311p0 = 1;
                    obj = storage.getToken$ethertoken_compat_release(str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                LegacyToken legacyToken = (LegacyToken) obj;
                objM5535constructorimpl = Result.m5535constructorimpl(legacyToken != null ? new STTokenImpl.TokenValidResult(null, LegacyTokenExtensionsKt.toTokenPub(legacyToken), 1, null) : new STTokenImpl.TokenNotFound(null, null, 3, null));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            Throwable thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
            if (thM5538exceptionOrNullimpl == null) {
                return objM5535constructorimpl;
            }
            LoggerKt.logError$default(androidx.camera.core.impl.utils.c.a("Failed to get token [", str, "]: ", thM5538exceptionOrNullimpl.getMessage()), null, 2, null);
            return new STTokenImpl.TokenNotFound(null, null, 3, null);
        }
    }

    /* JADX INFO: compiled from: TokenCompat.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompat$getTokenList$1", f = "TokenCompat.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nTokenCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenCompat.kt\ncom/bbva/ethermobilesdk/tokencompat/TokenCompat$getTokenList$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,348:1\n1549#2:349\n1620#2,3:350\n*S KotlinDebug\n*F\n+ 1 TokenCompat.kt\ncom/bbva/ethermobilesdk/tokencompat/TokenCompat$getTokenList$1\n*L\n94#1:349\n94#1:350,3\n*E\n"})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super STArray>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f30315p0;

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TokenCompat.this.new e(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super STArray> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws TokenCompatStorageError {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f30315p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                LoggerKt.log("Get token list");
                TokenCompatStorage storage = TokenCompat.this.getStorage();
                this.f30315p0 = 1;
                obj = storage.getTokensList$ethertoken_compat_release(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(LegacyTokenExtensionsKt.toTokenPub((LegacyToken) it.next()));
            }
            if (!arrayList.isEmpty()) {
                return new STArrayImpl.ValidTokenResult(null, arrayList, 1, null);
            }
            LoggerKt.log("Token list is empty");
            return new STArrayImpl.EmptyTokenList(null, null, 3, null);
        }
    }

    /* JADX INFO: compiled from: TokenCompat.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompat$registerToken$1", f = "TokenCompat.kt", i = {}, l = {Opcodes.ATHROW, 240}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nTokenCompat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenCompat.kt\ncom/bbva/ethermobilesdk/tokencompat/TokenCompat$registerToken$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,348:1\n1#2:349\n*E\n"})
    public static final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super STToken>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f30317p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ String f30318q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f30319r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ TokenCompat f30320s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f30321t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ String f30322u0;
        public final /* synthetic */ Map<String, String> v0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, String str2, TokenCompat tokenCompat, String str3, String str4, Map<String, String> map, Continuation<? super f> continuation) {
            super(2, continuation);
            this.f30318q0 = str;
            this.f30319r0 = str2;
            this.f30320s0 = tokenCompat;
            this.f30321t0 = str3;
            this.f30322u0 = str4;
            this.v0 = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new f(this.f30318q0, this.f30319r0, this.f30320s0, this.f30321t0, this.f30322u0, this.v0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super STToken> continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:49:0x0194  */
        /* JADX WARN: Code duplicated, block: B:51:0x01a8  */
        /* JADX WARN: Code duplicated, block: B:54:0x01ce  */
        /* JADX WARN: Code duplicated, block: B:56:0x01d2  */
        /* JADX WARN: Code duplicated, block: B:58:0x01f9  */
        /* JADX WARN: Instruction removed from duplicated block: B:56:0x01d2, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objGenerateActivationForm;
            Object objActivateToken;
            Object obj2;
            EtherTokenResult etherTokenResult;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f30317p0;
            String str = this.f30319r0;
            TokenCompat tokenCompat = this.f30320s0;
            String str2 = this.f30318q0;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                    objGenerateActivationForm = obj;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    objActivateToken = obj;
                }
                etherTokenResult = (EtherTokenResult) objActivateToken;
                if (etherTokenResult instanceof EtherTokenResult.Error) {
                    EtherTokenResult.Error error = (EtherTokenResult.Error) etherTokenResult;
                    String message = error.getValue().getMessage();
                    Throwable ex = error.getValue().getEx();
                    obj2 = ex != null ? ex : "";
                    StringBuilder sbC = androidx.constraintlayout.core.parser.a.c("Failed to activate token [", str2, "]: ", message, " ");
                    sbC.append(obj2);
                    LoggerKt.logError(sbC.toString(), error.getValue().getEx());
                    return new STTokenImpl.BadActivation(error.getValue(), null, null, 6, null);
                }
                if (etherTokenResult instanceof EtherTokenResult.Success) {
                    throw new NoWhenBranchMatchedException();
                }
                EtherTokenResult.Success success = (EtherTokenResult.Success) etherTokenResult;
                LoggerKt.log("Token [" + success.getValue() + "] activated");
                return tokenCompat.getToken((String) success.getValue());
            }
            ResultKt.throwOnFailure(obj);
            LoggerKt.log("Register token [" + (str2 == null ? AbstractJsonLexerKt.NULL : str2) + "]...");
            if (str2 == null || str2.length() == 0) {
                LoggerKt.logError$default("Failed to register, tokenId is null", null, 2, null);
                return new STTokenImpl.InvalidEnrollParams(ActivateTokenCommand.TOKEN_ID, null, null, 6, null);
            }
            if (str == null || str.length() == 0) {
                LoggerKt.logError$default("Failed to register, deviceId is null", null, 2, null);
                return new STTokenImpl.InvalidEnrollParams("deviceId", null, null, 6, null);
            }
            TokenCompat.access$setPin(tokenCompat, this.f30321t0);
            EtherToken etherToken = tokenCompat.getEtherToken();
            String str3 = this.f30322u0;
            String str4 = this.f30318q0;
            String str5 = this.f30319r0;
            this.f30317p0 = 1;
            objGenerateActivationForm = etherToken.generateActivationForm(str3, str4, str5, "1.0", this);
            if (objGenerateActivationForm == coroutine_suspended) {
                return coroutine_suspended;
            }
            EtherTokenResult etherTokenResult2 = (EtherTokenResult) objGenerateActivationForm;
            if (etherTokenResult2 instanceof EtherTokenResult.Error) {
                EtherTokenResult.Error error2 = (EtherTokenResult.Error) etherTokenResult2;
                String message2 = error2.getValue().getMessage();
                Throwable ex2 = error2.getValue().getEx();
                obj2 = ex2 != null ? ex2 : "";
                StringBuilder sbC2 = androidx.constraintlayout.core.parser.a.c("Failed to generate activation form for token [", str2, "]: ", message2, " ");
                sbC2.append(obj2);
                LoggerKt.logError(sbC2.toString(), error2.getValue().getEx());
                return new STTokenImpl.EnrollParamsGeneration(error2.getValue(), null, null, 6, null);
            }
            if (!(etherTokenResult2 instanceof EtherTokenResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            LoggerKt.log("Generated activation form for [" + str2 + Constant.BRACKET_CLOSE);
            EtherTokenResult.Success success2 = (EtherTokenResult.Success) etherTokenResult2;
            TokenCompatActivationRequest tokenCompatActivationRequest = new TokenCompatActivationRequest(((TokenActivationForm) success2.getValue()).getData(), ((TokenActivationForm) success2.getValue()).getSalt(), str, tokenCompat.getNetworkClient().getConfig().getEndpoint().getOriginAppId());
            Map<String, String> map = this.v0;
            if (map != null) {
                tokenCompat.getNetworkClient().using(map);
            }
            LoggerKt.log("Calling activation endpoint...");
            com.bbva.ethermobile.help.kit.result.Result<TokenCompatActivationResponse> resultActivate = tokenCompat.getNetworkClient().activate(((TokenActivationForm) success2.getValue()).getTokenId(), ((TokenActivationForm) success2.getValue()).getHashCode(), tokenCompatActivationRequest, ((TokenActivationForm) success2.getValue()).getData());
            if (resultActivate instanceof com.bbva.ethermobile.help.kit.result.Result.Error) {
                com.bbva.ethermobile.help.kit.result.Result.Error error3 = (com.bbva.ethermobile.help.kit.result.Result.Error) resultActivate;
                LoggerKt.logError(androidx.camera.core.impl.utils.c.a("Failed to activate token [", str2, "]: ", error3.getException().getMessage()), error3.getException());
                return new STTokenImpl.BadEnroll(error3.getException(), null, null, 6, null);
            }
            if (!(resultActivate instanceof com.bbva.ethermobile.help.kit.result.Result.Success)) {
                throw new NoWhenBranchMatchedException();
            }
            LoggerKt.log("Success calling activation endpoint");
            TokenActivation tokenActivationAccess$toTokenActivation = TokenCompatKt.access$toTokenActivation((TokenCompatActivationResponse) ((com.bbva.ethermobile.help.kit.result.Result.Success) resultActivate).getValue(), str2);
            EtherToken etherToken2 = tokenCompat.getEtherToken();
            this.f30317p0 = 2;
            objActivateToken = etherToken2.activateToken(tokenActivationAccess$toTokenActivation, this);
            if (objActivateToken == coroutine_suspended) {
                return coroutine_suspended;
            }
            etherTokenResult = (EtherTokenResult) objActivateToken;
            if (etherTokenResult instanceof EtherTokenResult.Error) {
                EtherTokenResult.Error error4 = (EtherTokenResult.Error) etherTokenResult;
                String message3 = error4.getValue().getMessage();
                Throwable ex3 = error4.getValue().getEx();
                if (ex3 != null) {
                }
                StringBuilder sbC3 = androidx.constraintlayout.core.parser.a.c("Failed to activate token [", str2, "]: ", message3, " ");
                sbC3.append(obj2);
                LoggerKt.logError(sbC3.toString(), error4.getValue().getEx());
                return new STTokenImpl.BadActivation(error4.getValue(), null, null, 6, null);
            }
            if (etherTokenResult instanceof EtherTokenResult.Success) {
                throw new NoWhenBranchMatchedException();
            }
            EtherTokenResult.Success success3 = (EtherTokenResult.Success) etherTokenResult;
            LoggerKt.log("Token [" + success3.getValue() + "] activated");
            return tokenCompat.getToken((String) success3.getValue());
        }
    }

    /* JADX INFO: compiled from: TokenCompat.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompat$setTokenDescription$1", f = "TokenCompat.kt", i = {}, l = {163, 165}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super STToken>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TokenCompat f30323p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f30324q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f30325r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f30327t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ String f30328u0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, String str2, Continuation<? super g> continuation) {
            super(2, continuation);
            this.f30327t0 = str;
            this.f30328u0 = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return TokenCompat.this.new g(this.f30327t0, this.f30328u0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super STToken> continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws TokenCompatStorageError {
            STToken token;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f30325r0;
            String str = this.f30327t0;
            TokenCompat tokenCompat = TokenCompat.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = this.f30324q0;
                    tokenCompat = this.f30323p0;
                    ResultKt.throwOnFailure(obj);
                }
                token = tokenCompat.getToken(str);
                if (token != null) {
                    return token;
                }
                return new STTokenImpl.TokenNotFound(null, null, 3, null);
            }
            ResultKt.throwOnFailure(obj);
            TokenCompatStorage storage = tokenCompat.getStorage();
            this.f30325r0 = 1;
            obj = storage.getToken$ethertoken_compat_release(str, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            LegacyToken legacyToken = (LegacyToken) obj;
            if (legacyToken != null) {
                legacyToken.setName(this.f30328u0);
                TokenCompatStorage storage2 = tokenCompat.getStorage();
                this.f30323p0 = tokenCompat;
                this.f30324q0 = str;
                this.f30325r0 = 2;
                if (storage2.addToken$ethertoken_compat_release(str, legacyToken, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                token = tokenCompat.getToken(str);
                if (token != null) {
                    return token;
                }
            }
            return new STTokenImpl.TokenNotFound(null, null, 3, null);
        }
    }

    public TokenCompat(@NotNull TokenCompatStorage storage, @NotNull NetworkClient networkClient) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        this.storage = storage;
        this.networkClient = networkClient;
        this.f30300r0 = CoroutineScopeKt.MainScope();
        EtherToken etherToken = new EtherToken(storage);
        etherToken.setDefaultOcraSuite("OCRA-1:HOTP-SHA256-6:QN08-T30S");
        this.etherToken = etherToken;
    }

    public static final void access$setPin(TokenCompat tokenCompat, String str) {
        tokenCompat.storage.setPin$ethertoken_compat_release(str);
    }

    public final void addInterceptor(@NotNull NetworkInterceptor interceptor) {
        Intrinsics.checkNotNullParameter(interceptor, "interceptor");
        this.networkClient.addInterceptor(interceptor);
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.contract.SoftTokenClient
    @NotNull
    public STReturnCode changePassword(@NotNull String refToken, @NotNull String pin, @NotNull String newPin) {
        Intrinsics.checkNotNullParameter(refToken, "refToken");
        Intrinsics.checkNotNullParameter(pin, "pin");
        Intrinsics.checkNotNullParameter(newPin, "newPin");
        return new STReturnCodeImpl.FeatureUnavailable("changePassword(refToken, pin, newPin)", 0, null, 6, null);
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.contract.SoftTokenClient
    @NotNull
    public STReturnCode deleteToken(@NotNull String refToken) {
        Intrinsics.checkNotNullParameter(refToken, "refToken");
        return (STReturnCode) BuildersKt__BuildersKt.runBlocking$default(null, new a(this, refToken, null), 1, null);
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.contract.SoftTokenClient
    @NotNull
    public STReturnCode deleteTokens(@Nullable String authPrefixFilter) {
        return (STReturnCode) BuildersKt__BuildersKt.runBlocking$default(null, new b(this, authPrefixFilter, null), 1, null);
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.contract.SoftTokenClient
    @NotNull
    public STOtp generateNextOTP(@NotNull String refToken, @Nullable String pin, @Nullable String challenge, @Nullable TokenType type) {
        Intrinsics.checkNotNullParameter(refToken, "refToken");
        return (STOtp) BuildersKt__BuildersKt.runBlocking$default(null, new q7.a(this, pin, true, challenge, refToken, null), 1, null);
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.contract.SoftTokenClient
    @NotNull
    public STOtp generateOTP(@NotNull String refToken, @Nullable String pin, @Nullable String challenge, @Nullable TokenType tokenType) {
        Intrinsics.checkNotNullParameter(refToken, "refToken");
        return (STOtp) BuildersKt__BuildersKt.runBlocking$default(null, new q7.a(this, pin, false, challenge, refToken, null), 1, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f30300r0.getCoroutineContext();
    }

    @NotNull
    /* JADX INFO: renamed from: getEtherToken$ethertoken_compat_release, reason: from getter */
    public final EtherToken getEtherToken() {
        return this.etherToken;
    }

    @NotNull
    public final Map<String, String> getHeaders() {
        return this.networkClient.getHeaders();
    }

    @NotNull
    /* JADX INFO: renamed from: getNetworkClient$ethertoken_compat_release, reason: from getter */
    public final NetworkClient getNetworkClient() {
        return this.networkClient;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.contract.SoftTokenClient
    @NotNull
    public STRemainingTime getRemainingTime(@NotNull String refToken, @Nullable TokenType tokenType) {
        Intrinsics.checkNotNullParameter(refToken, "refToken");
        return (STRemainingTime) BuildersKt__BuildersKt.runBlocking$default(null, new c(refToken, null), 1, null);
    }

    @NotNull
    /* JADX INFO: renamed from: getStorage$ethertoken_compat_release, reason: from getter */
    public final TokenCompatStorage getStorage() {
        return this.storage;
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.contract.SoftTokenClient
    @NotNull
    public STToken getToken(@NotNull String refToken) {
        Intrinsics.checkNotNullParameter(refToken, "refToken");
        return (STToken) BuildersKt__BuildersKt.runBlocking$default(null, new d(this, refToken, null), 1, null);
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.contract.SoftTokenClient
    @NotNull
    public STArray getTokenList(@Nullable TokenType type) {
        return (STArray) BuildersKt__BuildersKt.runBlocking$default(null, new e(null), 1, null);
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.contract.SoftTokenClient
    @NotNull
    public STParam getTokenOATHParam(@NotNull String refToken, @NotNull STOathParam oathParam) {
        Intrinsics.checkNotNullParameter(refToken, "refToken");
        Intrinsics.checkNotNullParameter(oathParam, "oathParam");
        return new STParamImpl.FeatureUnavailable("getTokenOATHParam(refToken, oathParam)", null, null, 6, null);
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.contract.SoftTokenClient
    @NotNull
    public STToken registerToken(@NotNull String authCode, @Nullable String pin, @NotNull String deviceId, @NotNull String tokenId, @Nullable Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(authCode, "authCode");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(tokenId, "tokenId");
        return (STToken) BuildersKt__BuildersKt.runBlocking$default(null, new f(tokenId, deviceId, this, pin, authCode, headers, null), 1, null);
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.contract.SoftTokenClient
    @NotNull
    public STToken registerTokenWithUri(@NotNull String uri, @Nullable String pin) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        return new STTokenImpl.FeatureUnavailable("registerTokenWithUri(uri, pin)", null, null, 6, null);
    }

    @NotNull
    public final EtherTokenResult<Unit> setDefaultOcraSuite(@NotNull String ocraSuite) {
        Intrinsics.checkNotNullParameter(ocraSuite, "ocraSuite");
        return this.etherToken.setDefaultOcraSuite(ocraSuite);
    }

    public final void setHeaders(@NotNull Map<String, String> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        Map<String, String> headers = this.networkClient.getHeaders();
        headers.clear();
        headers.putAll(value);
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.contract.SoftTokenClient
    @NotNull
    public STToken setTokenDescription(@NotNull String refToken, @NotNull String name) {
        Intrinsics.checkNotNullParameter(refToken, "refToken");
        Intrinsics.checkNotNullParameter(name, "name");
        return (STToken) BuildersKt__BuildersKt.runBlocking$default(null, new g(refToken, name, null), 1, null);
    }

    @Override // com.bbva.ethermobilesdk.tokencompat.contract.SoftTokenClient
    @NotNull
    public STReturnCode setTokenOATHParam(@NotNull String refToken, @NotNull STOathParam oathParam, @NotNull String value) {
        Intrinsics.checkNotNullParameter(refToken, "refToken");
        Intrinsics.checkNotNullParameter(oathParam, "oathParam");
        Intrinsics.checkNotNullParameter(value, "value");
        return new STReturnCodeImpl.FeatureUnavailable("setTokenOATHParam(refToken, oathParam, value)", 0, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TokenCompat(@NotNull TokenCompatConfig config) {
        NetworkClient tokenCompatNetworkClientR1;
        Intrinsics.checkNotNullParameter(config, "config");
        TokenCompatStorage tokenCompatStorage = TokenCompatStorageProvider.INSTANCE.get$ethertoken_compat_release(config);
        int i10 = WhenMappings.$EnumSwitchMapping$0[config.getEndpoint().getMode().ordinal()];
        int i11 = 2;
        NetworkWorker networkWorker = null;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        if (i10 == 1) {
            tokenCompatNetworkClientR1 = new TokenCompatNetworkClientR1(new TokenCompatConfig(config.getContext(), null, config.getStorageMode(), config.getEndpoint(), null, 16, null), objArr2 == true ? 1 : 0, i11, objArr == true ? 1 : 0);
        } else {
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            tokenCompatNetworkClientR1 = new TokenCompatNetworkClientR2(config, networkWorker, i11, objArr3 == true ? 1 : 0);
        }
        this(tokenCompatStorage, tokenCompatNetworkClientR1);
    }
}
