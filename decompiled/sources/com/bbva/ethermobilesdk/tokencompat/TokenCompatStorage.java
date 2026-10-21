package com.bbva.ethermobilesdk.tokencompat;

import android.content.Context;
import bk.q;
import com.bbva.component.dm.naturalauth.Constants;
import com.bbva.ethermobile.help.kit.error.ResultErrorType;
import com.bbva.ethermobilesdk.cipher.token.generator.RSAKeyGenerator;
import com.bbva.ethermobilesdk.token.storage.Storage;
import com.bbva.ethermobilesdk.token.storage.data.StorageToken;
import com.bbva.ethermobilesdk.tokencompat.coder.LegacyTokenCoder;
import com.bbva.ethermobilesdk.tokencompat.crypto.impl.CryptoProviderImpl;
import com.bbva.ethermobilesdk.tokencompat.extension.CipherKt;
import com.bbva.ethermobilesdk.tokencompat.extension.LoggerKt;
import com.bbva.ethermobilesdk.tokencompat.extension.StringKt;
import com.bbva.ethermobilesdk.tokencompat.extension.ThrowableKt;
import com.bbva.ethermobilesdk.tokencompat.model.StorageTokenBuilder;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.LegacyToken;
import com.bbva.ethermobilesdk.tokencompat.model.legacy.LegacyTokenBuilder;
import com.bbva.ethermobilesdk.tokencompat.service.RelayedService;
import com.bbva.ethermobilesdk.tokencompat.storage.LegacyStorage;
import com.bbva.ethermobilesdk.tokencompat.storage.provider.StorageProvider;
import com.bbva.ethermobilesdk.tokencompat.storage.provider.impl.LocalStorageProvider;
import com.bbva.ethermobilesdk.tokencompat.storage.provider.impl.SharedStorageProvider;
import com.bbva.plugin.naturalauthentication.NaturalAuthenticationCommandFactory;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.esotericsoftware.asm.Opcodes;
import com.google.gson.Gson;
import com.veridas.detect.ImageAnalysisKt;
import dk.e;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import mx.openpay.library.domain.util.Constant;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: TokenCompatStorage.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u0000 P2\u00020\u00012\u00020\u0002:\u0001PB#\b\u0000\u0012\u0006\u0010I\u001a\u00020H\u0012\u0006\u0010K\u001a\u00020J\u0012\b\b\u0002\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ#\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\r\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\tH\u0080@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u0013\u0010\u0012\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u000fJ\u001d\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0003H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u000fJ\u0019\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u0017H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0013J\u0019\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u0013J\u001f\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u001c0\u0017H\u0080@ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u0013R\u001a\u0010#\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010)\u001a\u00020$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010/\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u001a\u00102\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010 \u001a\u0004\b1\u0010\"R\u001a\u00107\u001a\u00020\u00018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001b\u0010=\u001a\u0002088@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R.\u0010C\u001a\u0004\u0018\u00010\u00032\b\u0010>\u001a\u0004\u0018\u00010\u00038\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b?\u0010 \u001a\u0004\b@\u0010\"\"\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010F\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006Q"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatStorage;", "Lcom/bbva/ethermobilesdk/token/storage/Storage;", "Lkotlinx/coroutines/CoroutineScope;", "", "key", "value", "", "add", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken;", "legacyToken", "addToken$ethertoken_compat_release", "(Ljava/lang/String;Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addToken", "delete", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteToken$ethertoken_compat_release", "deleteToken", Constants.deleteAll, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "get", "getToken$ethertoken_compat_release", "getToken", "", "getTokensList$ethertoken_compat_release", "getTokensList", "", RelayedService.KEY_IDS, "Lcom/bbva/ethermobile/help/kit/result/Result;", "getTokensOrThrow$ethertoken_compat_release", "getTokensOrThrow", "q0", "Ljava/lang/String;", "getDeviceInfo$ethertoken_compat_release", "()Ljava/lang/String;", "deviceInfo", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$UUIDType;", "r0", "Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$UUIDType;", "getUuidType$ethertoken_compat_release", "()Lcom/bbva/ethermobilesdk/tokencompat/model/legacy/LegacyToken$UUIDType;", "uuidType", "Lcom/bbva/ethermobilesdk/tokencompat/storage/LegacyStorage;", "s0", "Lcom/bbva/ethermobilesdk/tokencompat/storage/LegacyStorage;", "getStorage$ethertoken_compat_release", "()Lcom/bbva/ethermobilesdk/tokencompat/storage/LegacyStorage;", "storage", "t0", "getTokenKey$ethertoken_compat_release", "tokenKey", "u0", "Lcom/bbva/ethermobilesdk/token/storage/Storage;", "getTempStorage$ethertoken_compat_release", "()Lcom/bbva/ethermobilesdk/token/storage/Storage;", "tempStorage", "Ljava/security/KeyPair;", "v0", "Lkotlin/Lazy;", "getKeypair$ethertoken_compat_release", "()Ljava/security/KeyPair;", "keypair", "<set-?>", "w0", "getPin$ethertoken_compat_release", "setPin$ethertoken_compat_release", "(Ljava/lang/String;)V", "pin", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Landroid/content/Context;", "context", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$StorageMode;", "mode", "Lcom/bbva/ethermobilesdk/tokencompat/storage/provider/StorageProvider;", "provider", "<init>", "(Landroid/content/Context;Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$StorageMode;Lcom/bbva/ethermobilesdk/tokencompat/storage/provider/StorageProvider;)V", "Companion", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nTokenCompatStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TokenCompatStorage.kt\ncom/bbva/ethermobilesdk/tokencompat/TokenCompatStorage\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,314:1\n1549#2:315\n1620#2,3:316\n1549#2:332\n1620#2,3:333\n288#2,2:351\n1603#2,9:353\n1855#2:362\n1856#2:364\n1612#2:365\n1054#2:366\n1655#2,8:367\n1549#2:375\n1620#2,3:376\n1549#2:379\n1620#2,3:380\n135#3,9:319\n215#3:328\n216#3:330\n144#3:331\n135#3,9:336\n215#3:345\n216#3:347\n144#3:348\n1#4:329\n1#4:346\n1#4:363\n32#5,2:349\n*S KotlinDebug\n*F\n+ 1 TokenCompatStorage.kt\ncom/bbva/ethermobilesdk/tokencompat/TokenCompatStorage\n*L\n107#1:315\n107#1:316,3\n142#1:332\n142#1:333,3\n230#1:351,2\n242#1:353,9\n242#1:362\n242#1:364\n242#1:365\n252#1:366\n254#1:367,8\n268#1:375\n268#1:376,3\n281#1:379\n281#1:380,3\n118#1:319,9\n118#1:328\n118#1:330\n118#1:331\n154#1:336,9\n154#1:345\n154#1:347\n154#1:348\n118#1:329\n154#1:346\n242#1:363\n168#1:349,2\n*E\n"})
public class TokenCompatStorage implements Storage, CoroutineScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String KEYPAIR_ALGORITHM = "RSA";
    public static final int KEYPAIR_SIZE_BITS = 2048;

    @NotNull
    public static final String LOCAL_STORAGE_SCOPE = "com.bbva.ethermobile.tokencompat";

    @NotNull
    public static final String TOKEN_SEPARATOR = "#";
    public static final long UNKNOWN_INSTALLATION = 1622799979622L;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f30384p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String deviceInfo;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LegacyToken.UUIDType uuidType;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final LegacyStorage storage;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String tokenKey;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Storage tempStorage;

    /* JADX INFO: renamed from: v0, reason: from kotlin metadata */
    @NotNull
    public final Lazy keypair;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String pin;

    /* JADX INFO: compiled from: TokenCompatStorage.kt */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatStorage$Companion;", "", "()V", "KEYPAIR_ALGORITHM", "", "KEYPAIR_SIZE_BITS", "", "LOCAL_STORAGE_SCOPE", "TOKEN_SEPARATOR", "UNKNOWN_INSTALLATION", "", "provider", "Lcom/bbva/ethermobilesdk/tokencompat/storage/provider/StorageProvider;", "context", "Landroid/content/Context;", "mode", "Lcom/bbva/ethermobilesdk/tokencompat/TokenCompatConfig$StorageMode;", "ethertoken-compat_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: TokenCompatStorage.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TokenCompatConfig.StorageMode.values().length];
                try {
                    iArr[TokenCompatConfig.StorageMode.PRIVATE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TokenCompatConfig.StorageMode.SHARED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final StorageProvider provider(@NotNull Context context, @NotNull TokenCompatConfig.StorageMode mode) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(mode, "mode");
            int i10 = WhenMappings.$EnumSwitchMapping$0[mode.ordinal()];
            if (i10 == 1) {
                LoggerKt.log("Initialized in local storage mode");
                return new LocalStorageProvider(context);
            }
            if (i10 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            LoggerKt.log("Initialized in shared storage mode");
            return new SharedStorageProvider(context);
        }
    }

    /* JADX INFO: compiled from: TokenCompatStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage", f = "TokenCompatStorage.kt", i = {0, 1, 1, 1, 2, 2, 2, 2, 3}, l = {74, 78, 83, 84}, m = "add$suspendImpl", n = {"key", "key", "$this$add_u24lambda_u240", "token", "key", "$this$add_u24lambda_u240", "crypto", "needsPin", "key"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "I$0", "L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public String f30391p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public TokenCompatStorage f30392q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public Object f30393r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f30394s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public /* synthetic */ Object f30395t0;
        public int v0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30395t0 = obj;
            this.v0 |= Integer.MIN_VALUE;
            return TokenCompatStorage.a(TokenCompatStorage.this, null, null, this);
        }
    }

    /* JADX INFO: compiled from: TokenCompatStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage", f = "TokenCompatStorage.kt", i = {0, 0, 0}, l = {106, 127}, m = "addToken$ethertoken_compat_release", n = {"this", "key", "legacyToken"}, s = {"L$0", "L$1", "L$2"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TokenCompatStorage f30397p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f30398q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public LegacyToken f30399r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f30400s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f30402u0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30400s0 = obj;
            this.f30402u0 |= Integer.MIN_VALUE;
            return TokenCompatStorage.this.addToken$ethertoken_compat_release(null, null, this);
        }
    }

    /* JADX INFO: compiled from: TokenCompatStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage", f = "TokenCompatStorage.kt", i = {0, 0, 1, 1, 2}, l = {132, 133, 134}, m = "delete$suspendImpl", n = {"$this", "key", "$this", "key", "key"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
    public static final class c extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f30403p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f30404q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f30405r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f30407t0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30405r0 = obj;
            this.f30407t0 |= Integer.MIN_VALUE;
            return TokenCompatStorage.b(TokenCompatStorage.this, null, this);
        }
    }

    /* JADX INFO: compiled from: TokenCompatStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage", f = "TokenCompatStorage.kt", i = {0, 1, 1, 2, 3}, l = {168, 170, 171, 173, 174}, m = "deleteAll$suspendImpl", n = {"$this", "$this", "it", "$this", "$this"}, s = {"L$0", "L$0", "L$2", "L$0", "L$0"})
    public static final class d extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TokenCompatStorage f30408p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Iterator f30409q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public LegacyToken f30410r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f30411s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f30413u0;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30411s0 = obj;
            this.f30413u0 |= Integer.MIN_VALUE;
            return TokenCompatStorage.c(TokenCompatStorage.this, this);
        }
    }

    /* JADX INFO: compiled from: TokenCompatStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage", f = "TokenCompatStorage.kt", i = {0, 0}, l = {141, 163}, m = "deleteToken$ethertoken_compat_release", n = {"this", "key"}, s = {"L$0", "L$1"})
    public static final class e extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TokenCompatStorage f30414p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f30415q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f30416r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f30418t0;

        public e(Continuation<? super e> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30416r0 = obj;
            this.f30418t0 |= Integer.MIN_VALUE;
            return TokenCompatStorage.this.deleteToken$ethertoken_compat_release(null, this);
        }
    }

    /* JADX INFO: compiled from: TokenCompatStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage", f = "TokenCompatStorage.kt", i = {0, 0, 1, 1, 2, 2, 2, 3}, l = {184, 190, Opcodes.IFNONNULL, 203, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY}, m = "get$suspendImpl", n = {"$this", "key", "$this", "key", "$this", "key", "token", "key"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2", "L$0"})
    public static final class f extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f30419p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public String f30420q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public LegacyToken f30421r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f30422s0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public int f30424u0;

        public f(Continuation<? super f> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30422s0 = obj;
            this.f30424u0 |= Integer.MIN_VALUE;
            return TokenCompatStorage.d(TokenCompatStorage.this, null, this);
        }
    }

    /* JADX INFO: compiled from: TokenCompatStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage", f = "TokenCompatStorage.kt", i = {0}, l = {ImageAnalysisKt.OVER_EXPOSED_THRESHOLD}, m = "getToken$ethertoken_compat_release", n = {"key"}, s = {"L$0"})
    public static final class g extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public String f30425p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f30426q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f30428s0;

        public g(Continuation<? super g> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30426q0 = obj;
            this.f30428s0 |= Integer.MIN_VALUE;
            return TokenCompatStorage.this.getToken$ethertoken_compat_release(null, this);
        }
    }

    /* JADX INFO: compiled from: TokenCompatStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage", f = "TokenCompatStorage.kt", i = {0}, l = {238, 259}, m = "getTokensList$ethertoken_compat_release", n = {"this"}, s = {"L$0"})
    public static final class h extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public TokenCompatStorage f30429p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f30430q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f30432s0;

        public h(Continuation<? super h> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30430q0 = obj;
            this.f30432s0 |= Integer.MIN_VALUE;
            return TokenCompatStorage.this.getTokensList$ethertoken_compat_release(this);
        }
    }

    /* JADX INFO: compiled from: TokenCompatStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage", f = "TokenCompatStorage.kt", i = {0, 1}, l = {276, 284}, m = "getTokensOrThrow$ethertoken_compat_release", n = {"this", NaturalAuthenticationCommandFactory.ACTION_LIST_AUTHENTICATORS}, s = {"L$0", "L$0"})
    public static final class i extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f30433p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f30434q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f30436s0;

        public i(Continuation<? super i> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30434q0 = obj;
            this.f30436s0 |= Integer.MIN_VALUE;
            return TokenCompatStorage.this.getTokensOrThrow$ethertoken_compat_release(this);
        }
    }

    /* JADX INFO: compiled from: TokenCompatStorage.kt */
    @DebugMetadata(c = "com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage", f = "TokenCompatStorage.kt", i = {}, l = {268}, m = "ids$suspendImpl", n = {}, s = {})
    public static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f30437p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f30439r0;

        public j(Continuation<? super j> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f30437p0 = obj;
            this.f30439r0 |= Integer.MIN_VALUE;
            return TokenCompatStorage.e(TokenCompatStorage.this, this);
        }
    }

    /* JADX INFO: compiled from: TokenCompatStorage.kt */
    public static final class k extends Lambda implements Function0<KeyPair> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final k f30440p0 = new k(0);

        @Override // kotlin.jvm.functions.Function0
        public final KeyPair invoke() {
            return (KeyPair) CipherKt.valueOrThrow(RSAKeyGenerator.INSTANCE.generateRSAKeyPair("RSA", 2048));
        }
    }

    public TokenCompatStorage(@NotNull Context context, @NotNull TokenCompatConfig.StorageMode mode, @NotNull StorageProvider provider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.f30384p0 = CoroutineScopeKt.MainScope();
        this.deviceInfo = provider.getDeviceId();
        this.uuidType = provider.getUuidType();
        this.storage = provider.getStorage();
        this.tokenKey = provider.getTokenSerializationKey();
        this.tempStorage = provider.getTempStorage();
        this.keypair = LazyKt__LazyJVMKt.lazy(k.f30440p0);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00cb A[Catch: all -> 0x0039, TryCatch #2 {all -> 0x0039, blocks: (B:15:0x0034, B:62:0x0128, B:59:0x0112, B:45:0x00c3, B:47:0x00cb, B:48:0x00d8, B:50:0x00e2, B:54:0x00ea, B:32:0x006f, B:40:0x00af, B:35:0x0076, B:37:0x008e, B:42:0x00b2), top: B:75:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:56:0x010d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x010e  */
    /* JADX WARN: Code duplicated, block: B:67:0x0141  */
    /* JADX WARN: Code duplicated, block: B:69:0x0144  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v26 */
    public static /* synthetic */ Object a(TokenCompatStorage tokenCompatStorage, String str, String str2, Continuation<? super Unit> continuation) throws TokenCompatStorageError, ResultErrorType {
        a aVar;
        Object objM5535constructorimpl;
        String str3;
        Throwable thM5538exceptionOrNullimpl;
        StorageToken token;
        CryptoProviderImpl cryptoProviderImpl;
        String string;
        String str4;
        LegacyToken legacyToken;
        TokenCompatStorage tokenCompatStorage2;
        ?? r10;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.v0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.v0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = tokenCompatStorage.new a(continuation);
            }
        } else {
            aVar = tokenCompatStorage.new a(continuation);
        }
        Object obj = aVar.f30395t0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.v0;
        ?? r11 = 1;
        try {
            if (i11 != 0) {
                if (i11 == 1) {
                    String str5 = aVar.f30391p0;
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                if (i11 != 2) {
                    if (i11 == 3) {
                        int i12 = aVar.f30394s0;
                        CryptoProviderImpl cryptoProviderImpl2 = (CryptoProviderImpl) aVar.f30393r0;
                        TokenCompatStorage tokenCompatStorage3 = aVar.f30392q0;
                        String str6 = aVar.f30391p0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            tokenCompatStorage2 = tokenCompatStorage3;
                            cryptoProviderImpl = cryptoProviderImpl2;
                            str = str6;
                            r10 = i12;
                        } catch (Throwable th2) {
                            th = th2;
                            str = str6;
                            Result.Companion companion = Result.INSTANCE;
                            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th));
                        }
                    } else {
                        if (i11 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str = aVar.f30391p0;
                        ResultKt.throwOnFailure(obj);
                    }
                    objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
                    str3 = str;
                    thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                    if (thM5538exceptionOrNullimpl == null) {
                        return Unit.INSTANCE;
                    }
                    ThrowableKt.throwError(new TokenCompatStorageError.AddedToken(str3, 0, null, 6, null), thM5538exceptionOrNullimpl);
                    throw new KotlinNothingValueException();
                }
                StorageToken storageToken = (StorageToken) aVar.f30393r0;
                TokenCompatStorage tokenCompatStorage4 = aVar.f30392q0;
                String str7 = aVar.f30391p0;
                try {
                    ResultKt.throwOnFailure(obj);
                    token = storageToken;
                    tokenCompatStorage = tokenCompatStorage4;
                    str = str7;
                    String str8 = tokenCompatStorage.deviceInfo;
                    string = tokenCompatStorage.pin;
                    if (string == null) {
                        string = UUID.randomUUID().toString();
                        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
                    }
                    cryptoProviderImpl = new CryptoProviderImpl(str8, string, tokenCompatStorage.uuidType);
                    str4 = tokenCompatStorage.pin;
                    if (str4 != null || str4.length() <= 0) {
                        r11 = 0;
                    }
                    LegacyTokenBuilder legacyTokenBuilder = LegacyTokenBuilder.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(token, "token");
                    legacyToken = (LegacyToken) com.bbva.ethermobilesdk.tokencompat.extension.ResultKt.valueOrThrow(legacyTokenBuilder.build(token, cryptoProviderImpl, Boxing.boxBoolean(r11)));
                    aVar.f30391p0 = str;
                    aVar.f30392q0 = tokenCompatStorage;
                    aVar.f30393r0 = cryptoProviderImpl;
                    aVar.f30394s0 = r11;
                    aVar.v0 = 3;
                    if (tokenCompatStorage.addToken$ethertoken_compat_release(str, legacyToken, aVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    tokenCompatStorage2 = tokenCompatStorage;
                    r10 = r11;
                } catch (Throwable th3) {
                    th = th3;
                    str = str7;
                    Result.Companion companion2 = Result.INSTANCE;
                    objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th));
                }
                Result.Companion companion3 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th));
                str3 = str;
                thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                if (thM5538exceptionOrNullimpl == null) {
                    return Unit.INSTANCE;
                }
                ThrowableKt.throwError(new TokenCompatStorageError.AddedToken(str3, 0, null, 6, null), thM5538exceptionOrNullimpl);
                throw new KotlinNothingValueException();
            }
            ResultKt.throwOnFailure(obj);
            Result.Companion companion4 = Result.INSTANCE;
            token = (StorageToken) new Gson().fromJson(str2, StorageToken.class);
            Intrinsics.checkNotNullExpressionValue(token, "token");
            if (!TokenCompatStorageKt.access$isActive(token)) {
                LoggerKt.log("Adding inactive token [" + str + Constant.BRACKET_CLOSE);
                Storage storage = tokenCompatStorage.tempStorage;
                aVar.f30391p0 = str;
                aVar.v0 = 1;
                if (storage.add(str, str2, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            Storage storage2 = tokenCompatStorage.tempStorage;
            aVar.f30391p0 = str;
            aVar.f30392q0 = tokenCompatStorage;
            aVar.f30393r0 = token;
            aVar.v0 = 2;
            if (storage2.delete(str, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            String str9 = tokenCompatStorage.deviceInfo;
            string = tokenCompatStorage.pin;
            if (string == null) {
                string = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
            }
            cryptoProviderImpl = new CryptoProviderImpl(str9, string, tokenCompatStorage.uuidType);
            str4 = tokenCompatStorage.pin;
            if (str4 != null) {
                r11 = 0;
            } else {
                r11 = 0;
            }
            LegacyTokenBuilder legacyTokenBuilder2 = LegacyTokenBuilder.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(token, "token");
            legacyToken = (LegacyToken) com.bbva.ethermobilesdk.tokencompat.extension.ResultKt.valueOrThrow(legacyTokenBuilder2.build(token, cryptoProviderImpl, Boxing.boxBoolean(r11)));
            aVar.f30391p0 = str;
            aVar.f30392q0 = tokenCompatStorage;
            aVar.f30393r0 = cryptoProviderImpl;
            aVar.f30394s0 = r11;
            aVar.v0 = 3;
            if (tokenCompatStorage.addToken$ethertoken_compat_release(str, legacyToken, aVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            tokenCompatStorage2 = tokenCompatStorage;
            r10 = r11;
            if (r10 == 0) {
                LegacyStorage legacyStorage = tokenCompatStorage2.storage;
                String pin = cryptoProviderImpl.getPin();
                aVar.f30391p0 = str;
                aVar.f30392q0 = null;
                aVar.f30393r0 = null;
                aVar.v0 = 4;
                if (legacyStorage.add(str, pin, aVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            objM5535constructorimpl = Result.m5535constructorimpl(Unit.INSTANCE);
        } catch (Throwable th4) {
            th = th4;
        }
        str3 = str;
        thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
        if (thM5538exceptionOrNullimpl == null) {
            return Unit.INSTANCE;
        }
        ThrowableKt.throwError(new TokenCompatStorageError.AddedToken(str3, 0, null, 6, null), thM5538exceptionOrNullimpl);
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object b(TokenCompatStorage tokenCompatStorage, String str, Continuation<? super Unit> continuation) {
        c cVar;
        TokenCompatStorage tokenCompatStorage2;
        String str2;
        Storage storage;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f30407t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f30407t0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = tokenCompatStorage.new c(continuation);
            }
        } else {
            cVar = tokenCompatStorage.new c(continuation);
        }
        Object obj = cVar.f30405r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f30407t0;
        if (i11 != 0) {
            if (i11 == 1) {
                str = cVar.f30404q0;
                tokenCompatStorage = (TokenCompatStorage) cVar.f30403p0;
                ResultKt.throwOnFailure(obj);
            } else if (i11 == 2) {
                str2 = cVar.f30404q0;
                tokenCompatStorage2 = (TokenCompatStorage) cVar.f30403p0;
                ResultKt.throwOnFailure(obj);
                storage = tokenCompatStorage2.tempStorage;
                cVar.f30403p0 = str2;
                cVar.f30404q0 = null;
                cVar.f30407t0 = 3;
                if (storage.delete(str2, cVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) cVar.f30403p0;
                ResultKt.throwOnFailure(obj);
            }
            LoggerKt.log("Deleted token [" + str2 + Constant.BRACKET_CLOSE);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        LoggerKt.log("Deleting token [" + str + "]...");
        cVar.f30403p0 = tokenCompatStorage;
        cVar.f30404q0 = str;
        cVar.f30407t0 = 1;
        if (tokenCompatStorage.deleteToken$ethertoken_compat_release(str, cVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        LegacyStorage legacyStorage = tokenCompatStorage.storage;
        cVar.f30403p0 = tokenCompatStorage;
        cVar.f30404q0 = str;
        cVar.f30407t0 = 2;
        if (legacyStorage.delete(str, cVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        String str3 = str;
        tokenCompatStorage2 = tokenCompatStorage;
        str2 = str3;
        storage = tokenCompatStorage2.tempStorage;
        cVar.f30403p0 = str2;
        cVar.f30404q0 = null;
        cVar.f30407t0 = 3;
        if (storage.delete(str2, cVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        LoggerKt.log("Deleted token [" + str2 + Constant.BRACKET_CLOSE);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0081  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00cb -> B:20:0x004e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static /* synthetic */ java.lang.Object c(com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage r12, kotlin.coroutines.Continuation<? super kotlin.Unit> r13) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage.c(com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:45:0x0102  */
    /* JADX WARN: Code duplicated, block: B:47:0x0112 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:52:0x012a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0130  */
    /* JADX WARN: Code duplicated, block: B:56:0x013e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:57:0x013f  */
    /* JADX WARN: Code duplicated, block: B:59:0x0142  */
    /* JADX WARN: Code duplicated, block: B:62:0x0156  */
    /* JADX WARN: Code duplicated, block: B:64:0x016a  */
    /* JADX WARN: Code duplicated, block: B:66:0x0178 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:75:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:77:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:88:0x0188 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00d5, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object d(TokenCompatStorage tokenCompatStorage, String str, Continuation<? super String> continuation) throws TokenCompatStorageError, ResultErrorType {
        f fVar;
        TokenCompatStorage tokenCompatStorage2;
        String str2;
        LegacyToken legacyToken;
        String str3;
        String str4;
        Object objM5535constructorimpl;
        Throwable thM5538exceptionOrNullimpl;
        String str5;
        String str6;
        TokenCompatStorage tokenCompatStorage3 = tokenCompatStorage;
        String str7 = str;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i10 = fVar.f30424u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f30424u0 = i10 - Integer.MIN_VALUE;
            } else {
                fVar = tokenCompatStorage3.new f(continuation);
            }
        } else {
            fVar = tokenCompatStorage3.new f(continuation);
        }
        Object token$ethertoken_compat_release = fVar.f30422s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = fVar.f30424u0;
        int i12 = 3;
        String str8 = null;
        Object[] objArr = 0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(token$ethertoken_compat_release);
            LoggerKt.log("Retrieving token [" + str7 + "]...");
            Storage storage = tokenCompatStorage3.tempStorage;
            fVar.f30419p0 = tokenCompatStorage3;
            fVar.f30420q0 = str7;
            fVar.f30424u0 = 1;
            token$ethertoken_compat_release = storage.get(str7, fVar);
            if (token$ethertoken_compat_release == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 4) {
                            if (i11 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ResultKt.throwOnFailure(token$ethertoken_compat_release);
                            ThrowableKt.throwError$default(new TokenCompatStorageError.CrcDeviceInfo(0, str8, i12, objArr == true ? 1 : 0), null, 2, null);
                            throw new KotlinNothingValueException();
                        }
                        str6 = (String) fVar.f30419p0;
                        ResultKt.throwOnFailure(token$ethertoken_compat_release);
                        str5 = str6;
                        ThrowableKt.throwError$default(new TokenCompatStorageError.CrcPin(str5, 0, null, 6, null), null, 2, null);
                        throw new KotlinNothingValueException();
                    }
                    legacyToken = fVar.f30421r0;
                    String str9 = fVar.f30420q0;
                    tokenCompatStorage2 = (TokenCompatStorage) fVar.f30419p0;
                    ResultKt.throwOnFailure(token$ethertoken_compat_release);
                    str2 = str9;
                    str4 = (String) token$ethertoken_compat_release;
                    if (str4 == null) {
                        throw new TokenCompatStorageError.EmptyOrNullPin(str2, 0, null, 6, null);
                    }
                    if (!Intrinsics.areEqual(StringKt.crc32(str4), legacyToken.getExtraParams().getPinCRC())) {
                        if (legacyToken.getNeedsPin()) {
                            str5 = str2;
                        } else {
                            fVar.f30419p0 = str2;
                            fVar.f30420q0 = null;
                            fVar.f30421r0 = null;
                            fVar.f30424u0 = 4;
                            if (tokenCompatStorage2.delete(str2, fVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            str6 = str2;
                            str5 = str6;
                        }
                        ThrowableKt.throwError$default(new TokenCompatStorageError.CrcPin(str5, 0, null, 6, null), null, 2, null);
                        throw new KotlinNothingValueException();
                    }
                    if (!Intrinsics.areEqual(StringKt.crc32(tokenCompatStorage2.deviceInfo), legacyToken.getExtraParams().getUuidCRC())) {
                        fVar.f30419p0 = null;
                        fVar.f30420q0 = null;
                        fVar.f30421r0 = null;
                        fVar.f30424u0 = 5;
                        if (tokenCompatStorage2.delete(str2, fVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ThrowableKt.throwError$default(new TokenCompatStorageError.CrcDeviceInfo(0, str8, i12, objArr == true ? 1 : 0), null, 2, null);
                        throw new KotlinNothingValueException();
                    }
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        objM5535constructorimpl = Result.m5535constructorimpl(new Gson().toJson(StorageTokenBuilder.INSTANCE.build$ethertoken_compat_release(legacyToken, new CryptoProviderImpl(tokenCompatStorage2.deviceInfo, str4, tokenCompatStorage2.uuidType), tokenCompatStorage2.getKeypair$ethertoken_compat_release())));
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
                    }
                    thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                    if (thM5538exceptionOrNullimpl != null) {
                        ThrowableKt.throwError(new TokenCompatStorageError.DecryptToken(str2, 0, null, 6, null), thM5538exceptionOrNullimpl);
                        throw new KotlinNothingValueException();
                    }
                    str3 = (String) objM5535constructorimpl;
                    String str10 = str2;
                    if (str3 == null && str3.length() != 0) {
                        return str3;
                    }
                    ThrowableKt.throwError$default(new TokenCompatStorageError.NotFoundToken(str10, 0, null, 6, null), null, 2, null);
                    throw new KotlinNothingValueException();
                }
                String str11 = fVar.f30420q0;
                TokenCompatStorage tokenCompatStorage4 = (TokenCompatStorage) fVar.f30419p0;
                ResultKt.throwOnFailure(token$ethertoken_compat_release);
                str2 = str11;
                tokenCompatStorage2 = tokenCompatStorage4;
                legacyToken = (LegacyToken) token$ethertoken_compat_release;
                if (legacyToken != null) {
                    LoggerKt.log("Found token with id [" + str2 + Constant.BRACKET_CLOSE);
                    if (legacyToken.getNeedsPin()) {
                        str4 = tokenCompatStorage2.pin;
                        if (str4 == null) {
                            throw new TokenCompatStorageError.ManualPin(str2, 0, null, 6, null);
                        }
                    } else {
                        LegacyStorage legacyStorage = tokenCompatStorage2.storage;
                        fVar.f30419p0 = tokenCompatStorage2;
                        fVar.f30420q0 = str2;
                        fVar.f30421r0 = legacyToken;
                        fVar.f30424u0 = 3;
                        token$ethertoken_compat_release = legacyStorage.get(str2, fVar);
                        if (token$ethertoken_compat_release == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        str4 = (String) token$ethertoken_compat_release;
                        if (str4 == null) {
                            throw new TokenCompatStorageError.EmptyOrNullPin(str2, 0, null, 6, null);
                        }
                    }
                    if (!Intrinsics.areEqual(StringKt.crc32(str4), legacyToken.getExtraParams().getPinCRC())) {
                        if (legacyToken.getNeedsPin()) {
                            fVar.f30419p0 = str2;
                            fVar.f30420q0 = null;
                            fVar.f30421r0 = null;
                            fVar.f30424u0 = 4;
                            if (tokenCompatStorage2.delete(str2, fVar) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            str6 = str2;
                            str5 = str6;
                        } else {
                            str5 = str2;
                        }
                        ThrowableKt.throwError$default(new TokenCompatStorageError.CrcPin(str5, 0, null, 6, null), null, 2, null);
                        throw new KotlinNothingValueException();
                    }
                    if (!Intrinsics.areEqual(StringKt.crc32(tokenCompatStorage2.deviceInfo), legacyToken.getExtraParams().getUuidCRC())) {
                        fVar.f30419p0 = null;
                        fVar.f30420q0 = null;
                        fVar.f30421r0 = null;
                        fVar.f30424u0 = 5;
                        if (tokenCompatStorage2.delete(str2, fVar) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        ThrowableKt.throwError$default(new TokenCompatStorageError.CrcDeviceInfo(0, str8, i12, objArr == true ? 1 : 0), null, 2, null);
                        throw new KotlinNothingValueException();
                    }
                    Result.Companion companion3 = Result.INSTANCE;
                    objM5535constructorimpl = Result.m5535constructorimpl(new Gson().toJson(StorageTokenBuilder.INSTANCE.build$ethertoken_compat_release(legacyToken, new CryptoProviderImpl(tokenCompatStorage2.deviceInfo, str4, tokenCompatStorage2.uuidType), tokenCompatStorage2.getKeypair$ethertoken_compat_release())));
                    thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                    if (thM5538exceptionOrNullimpl != null) {
                        ThrowableKt.throwError(new TokenCompatStorageError.DecryptToken(str2, 0, null, 6, null), thM5538exceptionOrNullimpl);
                        throw new KotlinNothingValueException();
                    }
                    str3 = (String) objM5535constructorimpl;
                } else {
                    str3 = null;
                }
                String str12 = str2;
                if (str3 == null) {
                }
                ThrowableKt.throwError$default(new TokenCompatStorageError.NotFoundToken(str12, 0, null, 6, null), null, 2, null);
                throw new KotlinNothingValueException();
            }
            String str13 = fVar.f30420q0;
            TokenCompatStorage tokenCompatStorage5 = (TokenCompatStorage) fVar.f30419p0;
            ResultKt.throwOnFailure(token$ethertoken_compat_release);
            str7 = str13;
            tokenCompatStorage3 = tokenCompatStorage5;
        }
        String str14 = (String) token$ethertoken_compat_release;
        if (str14 != null && str14.length() != 0) {
            LoggerKt.log("Found inactive token with id [" + str7 + Constant.BRACKET_CLOSE);
            return str14;
        }
        fVar.f30419p0 = tokenCompatStorage3;
        fVar.f30420q0 = str7;
        fVar.f30424u0 = 2;
        token$ethertoken_compat_release = tokenCompatStorage3.getToken$ethertoken_compat_release(str7, fVar);
        if (token$ethertoken_compat_release == coroutine_suspended) {
            return coroutine_suspended;
        }
        tokenCompatStorage2 = tokenCompatStorage3;
        str2 = str7;
        legacyToken = (LegacyToken) token$ethertoken_compat_release;
        if (legacyToken != null) {
            LoggerKt.log("Found token with id [" + str2 + Constant.BRACKET_CLOSE);
            if (legacyToken.getNeedsPin()) {
                str4 = tokenCompatStorage2.pin;
                if (str4 == null) {
                    throw new TokenCompatStorageError.ManualPin(str2, 0, null, 6, null);
                }
            } else {
                LegacyStorage legacyStorage2 = tokenCompatStorage2.storage;
                fVar.f30419p0 = tokenCompatStorage2;
                fVar.f30420q0 = str2;
                fVar.f30421r0 = legacyToken;
                fVar.f30424u0 = 3;
                token$ethertoken_compat_release = legacyStorage2.get(str2, fVar);
                if (token$ethertoken_compat_release == coroutine_suspended) {
                    return coroutine_suspended;
                }
                str4 = (String) token$ethertoken_compat_release;
                if (str4 == null) {
                    throw new TokenCompatStorageError.EmptyOrNullPin(str2, 0, null, 6, null);
                }
            }
            if (!Intrinsics.areEqual(StringKt.crc32(str4), legacyToken.getExtraParams().getPinCRC())) {
                if (legacyToken.getNeedsPin()) {
                    fVar.f30419p0 = str2;
                    fVar.f30420q0 = null;
                    fVar.f30421r0 = null;
                    fVar.f30424u0 = 4;
                    if (tokenCompatStorage2.delete(str2, fVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str6 = str2;
                    str5 = str6;
                } else {
                    str5 = str2;
                }
                ThrowableKt.throwError$default(new TokenCompatStorageError.CrcPin(str5, 0, null, 6, null), null, 2, null);
                throw new KotlinNothingValueException();
            }
            if (!Intrinsics.areEqual(StringKt.crc32(tokenCompatStorage2.deviceInfo), legacyToken.getExtraParams().getUuidCRC())) {
                fVar.f30419p0 = null;
                fVar.f30420q0 = null;
                fVar.f30421r0 = null;
                fVar.f30424u0 = 5;
                if (tokenCompatStorage2.delete(str2, fVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                ThrowableKt.throwError$default(new TokenCompatStorageError.CrcDeviceInfo(0, str8, i12, objArr == true ? 1 : 0), null, 2, null);
                throw new KotlinNothingValueException();
            }
            Result.Companion companion4 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(new Gson().toJson(StorageTokenBuilder.INSTANCE.build$ethertoken_compat_release(legacyToken, new CryptoProviderImpl(tokenCompatStorage2.deviceInfo, str4, tokenCompatStorage2.uuidType), tokenCompatStorage2.getKeypair$ethertoken_compat_release())));
            thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
            if (thM5538exceptionOrNullimpl != null) {
                ThrowableKt.throwError(new TokenCompatStorageError.DecryptToken(str2, 0, null, 6, null), thM5538exceptionOrNullimpl);
                throw new KotlinNothingValueException();
            }
            str3 = (String) objM5535constructorimpl;
        } else {
            str3 = null;
        }
        String str15 = str2;
        if (str3 == null) {
        }
        ThrowableKt.throwError$default(new TokenCompatStorageError.NotFoundToken(str15, 0, null, 6, null), null, 2, null);
        throw new KotlinNothingValueException();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static /* synthetic */ Object e(TokenCompatStorage tokenCompatStorage, Continuation<? super Set<String>> continuation) throws TokenCompatStorageError {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i10 = jVar.f30439r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                jVar.f30439r0 = i10 - Integer.MIN_VALUE;
            } else {
                jVar = tokenCompatStorage.new j(continuation);
            }
        } else {
            jVar = tokenCompatStorage.new j(continuation);
        }
        Object tokensList$ethertoken_compat_release = jVar.f30437p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = jVar.f30439r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(tokensList$ethertoken_compat_release);
            jVar.f30439r0 = 1;
            tokensList$ethertoken_compat_release = tokenCompatStorage.getTokensList$ethertoken_compat_release(jVar);
            if (tokensList$ethertoken_compat_release == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(tokensList$ethertoken_compat_release);
        }
        Iterable iterable = (Iterable) tokensList$ethertoken_compat_release;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((LegacyToken) it.next()).getSerial());
        }
        return CollectionsKt___CollectionsKt.toMutableSet(arrayList);
    }

    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object add(@NotNull String str, @NotNull String str2, @NotNull Continuation<? super Unit> continuation) throws TokenCompatStorageError {
        return a(this, str, str2, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object addToken$ethertoken_compat_release(@NotNull String str, @NotNull LegacyToken legacyToken, @NotNull Continuation<? super Unit> continuation) throws TokenCompatStorageError, ResultErrorType {
        b bVar;
        String str2;
        LegacyToken legacyToken2;
        Object tokensList$ethertoken_compat_release;
        TokenCompatStorage tokenCompatStorage;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f30402u0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f30402u0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object obj = bVar.f30400s0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = bVar.f30402u0;
        if (i11 != 0) {
            if (i11 == 1) {
                legacyToken2 = bVar.f30399r0;
                String str3 = bVar.f30398q0;
                tokenCompatStorage = bVar.f30397p0;
                ResultKt.throwOnFailure(obj);
                tokensList$ethertoken_compat_release = obj;
                str2 = str3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        bVar.f30397p0 = this;
        str2 = str;
        bVar.f30398q0 = str2;
        legacyToken2 = legacyToken;
        bVar.f30399r0 = legacyToken2;
        bVar.f30402u0 = 1;
        tokensList$ethertoken_compat_release = getTokensList$ethertoken_compat_release(bVar);
        if (tokensList$ethertoken_compat_release == coroutine_suspended) {
            return coroutine_suspended;
        }
        tokenCompatStorage = this;
        Iterable<LegacyToken> iterable = (Iterable) tokensList$ethertoken_compat_release;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (LegacyToken legacyToken3 : iterable) {
            arrayList.add(TuplesKt.to(legacyToken3.getSerial(), legacyToken3));
        }
        Map mutableMap = q.toMutableMap(q.toMap(arrayList));
        if (mutableMap.containsKey(str2)) {
            LoggerKt.log("Replacing existing token [" + str2 + Constant.BRACKET_CLOSE);
        } else {
            LoggerKt.log("Adding token [" + str2 + Constant.BRACKET_CLOSE);
        }
        mutableMap.put(str2, legacyToken2);
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : mutableMap.entrySet()) {
            com.bbva.ethermobile.help.kit.result.Result<String> resultEncode = LegacyTokenCoder.INSTANCE.encode((LegacyToken) entry.getValue());
            if (!(resultEncode instanceof com.bbva.ethermobile.help.kit.result.Result.Success)) {
                if (!(resultEncode instanceof com.bbva.ethermobile.help.kit.result.Result.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                ThrowableKt.throwError(new TokenCompatStorageError.AddedToken((String) entry.getKey(), 0, null, 6, null), ((com.bbva.ethermobile.help.kit.result.Result.Error) resultEncode).getException());
                throw new KotlinNothingValueException();
            }
            String str4 = (String) ((com.bbva.ethermobile.help.kit.result.Result.Success) resultEncode).getValue();
            if (str4 != null) {
                arrayList2.add(str4);
            }
        }
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList2, "#", null, null, 0, null, null, 62, null);
        LegacyStorage legacyStorage = tokenCompatStorage.storage;
        bVar.f30397p0 = null;
        bVar.f30398q0 = null;
        bVar.f30399r0 = null;
        bVar.f30402u0 = 2;
        if (legacyStorage.add(tokenCompatStorage.tokenKey, strJoinToString$default, bVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object delete(@NotNull String str, @NotNull Continuation<? super Unit> continuation) {
        return b(this, str, continuation);
    }

    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object deleteAll(@NotNull Continuation<? super Unit> continuation) {
        return c(this, continuation);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Nullable
    public final Object deleteToken$ethertoken_compat_release(@NotNull String str, @NotNull Continuation<? super Unit> continuation) throws TokenCompatStorageError, ResultErrorType {
        e eVar;
        String str2;
        Object tokensList$ethertoken_compat_release;
        TokenCompatStorage tokenCompatStorage;
        if (continuation instanceof e) {
            eVar = (e) continuation;
            int i10 = eVar.f30418t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f30418t0 = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(continuation);
            }
        } else {
            eVar = new e(continuation);
        }
        Object obj = eVar.f30416r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = eVar.f30418t0;
        if (i11 != 0) {
            if (i11 == 1) {
                String str3 = eVar.f30415q0;
                tokenCompatStorage = eVar.f30414p0;
                ResultKt.throwOnFailure(obj);
                tokensList$ethertoken_compat_release = obj;
                str2 = str3;
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        eVar.f30414p0 = this;
        str2 = str;
        eVar.f30415q0 = str2;
        eVar.f30418t0 = 1;
        tokensList$ethertoken_compat_release = getTokensList$ethertoken_compat_release(eVar);
        if (tokensList$ethertoken_compat_release == coroutine_suspended) {
            return coroutine_suspended;
        }
        tokenCompatStorage = this;
        Iterable<LegacyToken> iterable = (Iterable) tokensList$ethertoken_compat_release;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
        for (LegacyToken legacyToken : iterable) {
            arrayList.add(TuplesKt.to(legacyToken.getSerial(), legacyToken));
        }
        Map mutableMap = q.toMutableMap(q.toMap(arrayList));
        if (!mutableMap.containsKey(str2)) {
            LoggerKt.log("Nothing to do!");
            return Unit.INSTANCE;
        }
        LoggerKt.log("Needs to delete [" + str2 + Constant.BRACKET_CLOSE);
        mutableMap.remove(str2);
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : mutableMap.entrySet()) {
            com.bbva.ethermobile.help.kit.result.Result<String> resultEncode = LegacyTokenCoder.INSTANCE.encode((LegacyToken) entry.getValue());
            if (!(resultEncode instanceof com.bbva.ethermobile.help.kit.result.Result.Success)) {
                if (!(resultEncode instanceof com.bbva.ethermobile.help.kit.result.Result.Error)) {
                    throw new NoWhenBranchMatchedException();
                }
                ThrowableKt.throwError(new TokenCompatStorageError.AddedToken((String) entry.getKey(), 0, null, 6, null), ((com.bbva.ethermobile.help.kit.result.Result.Error) resultEncode).getException());
                throw new KotlinNothingValueException();
            }
            String str4 = (String) ((com.bbva.ethermobile.help.kit.result.Result.Success) resultEncode).getValue();
            if (str4 != null) {
                arrayList2.add(str4);
            }
        }
        String strJoinToString$default = CollectionsKt___CollectionsKt.joinToString$default(arrayList2, "#", null, null, 0, null, null, 62, null);
        LegacyStorage legacyStorage = tokenCompatStorage.storage;
        eVar.f30414p0 = null;
        eVar.f30415q0 = null;
        eVar.f30418t0 = 2;
        if (legacyStorage.add(tokenCompatStorage.tokenKey, strJoinToString$default, eVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object get(@NotNull String str, @NotNull Continuation<? super String> continuation) throws TokenCompatStorageError {
        return d(this, str, continuation);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f30384p0.getCoroutineContext();
    }

    @NotNull
    /* JADX INFO: renamed from: getDeviceInfo$ethertoken_compat_release, reason: from getter */
    public final String getDeviceInfo() {
        return this.deviceInfo;
    }

    @NotNull
    public final KeyPair getKeypair$ethertoken_compat_release() {
        return (KeyPair) this.keypair.getValue();
    }

    @Nullable
    /* JADX INFO: renamed from: getPin$ethertoken_compat_release, reason: from getter */
    public final String getPin() {
        return this.pin;
    }

    @NotNull
    /* JADX INFO: renamed from: getStorage$ethertoken_compat_release, reason: from getter */
    public final LegacyStorage getStorage() {
        return this.storage;
    }

    @NotNull
    /* JADX INFO: renamed from: getTempStorage$ethertoken_compat_release, reason: from getter */
    public final Storage getTempStorage() {
        return this.tempStorage;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getToken$ethertoken_compat_release(@NotNull String str, @NotNull Continuation<? super LegacyToken> continuation) throws TokenCompatStorageError {
        g gVar;
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i10 = gVar.f30428s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f30428s0 = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(continuation);
            }
        } else {
            gVar = new g(continuation);
        }
        Object tokensList$ethertoken_compat_release = gVar.f30426q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = gVar.f30428s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(tokensList$ethertoken_compat_release);
            gVar.f30425p0 = str;
            gVar.f30428s0 = 1;
            tokensList$ethertoken_compat_release = getTokensList$ethertoken_compat_release(gVar);
            if (tokensList$ethertoken_compat_release == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = gVar.f30425p0;
            ResultKt.throwOnFailure(tokensList$ethertoken_compat_release);
        }
        for (Object obj : (Iterable) tokensList$ethertoken_compat_release) {
            if (Intrinsics.areEqual(((LegacyToken) obj).getSerial(), str)) {
                return obj;
            }
        }
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: getTokenKey$ethertoken_compat_release, reason: from getter */
    public final String getTokenKey() {
        return this.tokenKey;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0061 A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:16:0x0038, B:25:0x0050, B:26:0x005b, B:28:0x0061, B:30:0x006b, B:35:0x0086, B:31:0x0074, B:33:0x0078, B:36:0x008a, B:37:0x008f, B:38:0x0090, B:39:0x00a9, B:41:0x00af, B:43:0x00c0, B:44:0x00c4), top: B:59:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x006b A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:16:0x0038, B:25:0x0050, B:26:0x005b, B:28:0x0061, B:30:0x006b, B:35:0x0086, B:31:0x0074, B:33:0x0078, B:36:0x008a, B:37:0x008f, B:38:0x0090, B:39:0x00a9, B:41:0x00af, B:43:0x00c0, B:44:0x00c4), top: B:59:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0074 A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:16:0x0038, B:25:0x0050, B:26:0x005b, B:28:0x0061, B:30:0x006b, B:35:0x0086, B:31:0x0074, B:33:0x0078, B:36:0x008a, B:37:0x008f, B:38:0x0090, B:39:0x00a9, B:41:0x00af, B:43:0x00c0, B:44:0x00c4), top: B:59:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0078 A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:16:0x0038, B:25:0x0050, B:26:0x005b, B:28:0x0061, B:30:0x006b, B:35:0x0086, B:31:0x0074, B:33:0x0078, B:36:0x008a, B:37:0x008f, B:38:0x0090, B:39:0x00a9, B:41:0x00af, B:43:0x00c0, B:44:0x00c4), top: B:59:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00af A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:16:0x0038, B:25:0x0050, B:26:0x005b, B:28:0x0061, B:30:0x006b, B:35:0x0086, B:31:0x0074, B:33:0x0078, B:36:0x008a, B:37:0x008f, B:38:0x0090, B:39:0x00a9, B:41:0x00af, B:43:0x00c0, B:44:0x00c4), top: B:59:0x0038 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ed A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x008a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:61:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x005b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x00a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getTokensList$ethertoken_compat_release(@NotNull Continuation<? super List<LegacyToken>> continuation) throws TokenCompatStorageError {
        h hVar;
        TokenCompatStorage tokenCompatStorage;
        Object objM5535constructorimpl;
        Throwable thM5538exceptionOrNullimpl;
        LegacyStorage legacyStorage;
        ArrayList arrayList;
        HashSet hashSet;
        ArrayList arrayList2;
        LegacyToken legacyToken;
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i10 = hVar.f30432s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f30432s0 = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(continuation);
            }
        } else {
            hVar = new h(continuation);
        }
        Object tokensOrThrow$ethertoken_compat_release = hVar.f30430q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = hVar.f30432s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(tokensOrThrow$ethertoken_compat_release);
            try {
                Result.Companion companion = Result.INSTANCE;
                hVar.f30429p0 = this;
                hVar.f30432s0 = 1;
                tokensOrThrow$ethertoken_compat_release = getTokensOrThrow$ethertoken_compat_release(hVar);
                if (tokensOrThrow$ethertoken_compat_release == coroutine_suspended) {
                    return coroutine_suspended;
                }
                tokenCompatStorage = this;
                arrayList = new ArrayList();
                for (com.bbva.ethermobile.help.kit.result.Result result : (Iterable) tokensOrThrow$ethertoken_compat_release) {
                    if (result instanceof com.bbva.ethermobile.help.kit.result.Result.Success) {
                        legacyToken = (LegacyToken) ((com.bbva.ethermobile.help.kit.result.Result.Success) result).getValue();
                    } else {
                        if (result instanceof com.bbva.ethermobile.help.kit.result.Result.Error) {
                            throw new NoWhenBranchMatchedException();
                        }
                        LoggerKt.logError("Error decoding stored token", ((com.bbva.ethermobile.help.kit.result.Result.Error) result).getException());
                        legacyToken = null;
                    }
                    if (legacyToken != null) {
                        arrayList.add(legacyToken);
                    }
                }
                List listSortedWith = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage$getTokensList$lambda$14$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return e.compareValues(Long.valueOf(((LegacyToken) t11).getDateCreationMillis()), Long.valueOf(((LegacyToken) t10).getDateCreationMillis()));
                    }
                });
                hashSet = new HashSet();
                arrayList2 = new ArrayList();
                for (Object obj : listSortedWith) {
                    if (hashSet.add(((LegacyToken) obj).getSerial())) {
                        arrayList2.add(obj);
                    }
                }
                objM5535constructorimpl = Result.m5535constructorimpl(arrayList2);
                thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
                if (thM5538exceptionOrNullimpl == null) {
                    return objM5535constructorimpl;
                }
                LoggerKt.logError("Error reading tokens from storage", thM5538exceptionOrNullimpl);
                legacyStorage = tokenCompatStorage.storage;
                hVar.f30429p0 = null;
                hVar.f30432s0 = 2;
                if (legacyStorage.reset(hVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } catch (Throwable th2) {
                th = th2;
                tokenCompatStorage = this;
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th));
            }
        } else if (i11 == 1) {
            tokenCompatStorage = hVar.f30429p0;
            try {
                ResultKt.throwOnFailure(tokensOrThrow$ethertoken_compat_release);
                arrayList = new ArrayList();
                while (r10.hasNext()) {
                    if (result instanceof com.bbva.ethermobile.help.kit.result.Result.Success) {
                        legacyToken = (LegacyToken) ((com.bbva.ethermobile.help.kit.result.Result.Success) result).getValue();
                    } else {
                        if (result instanceof com.bbva.ethermobile.help.kit.result.Result.Error) {
                            throw new NoWhenBranchMatchedException();
                        }
                        LoggerKt.logError("Error decoding stored token", ((com.bbva.ethermobile.help.kit.result.Result.Error) result).getException());
                        legacyToken = null;
                    }
                    if (legacyToken != null) {
                        arrayList.add(legacyToken);
                    }
                }
                List listSortedWith2 = CollectionsKt___CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.bbva.ethermobilesdk.tokencompat.TokenCompatStorage$getTokensList$lambda$14$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t10, T t11) {
                        return e.compareValues(Long.valueOf(((LegacyToken) t11).getDateCreationMillis()), Long.valueOf(((LegacyToken) t10).getDateCreationMillis()));
                    }
                });
                hashSet = new HashSet();
                arrayList2 = new ArrayList();
                while (r10.hasNext()) {
                    if (hashSet.add(((LegacyToken) obj).getSerial())) {
                        arrayList2.add(obj);
                    }
                }
                objM5535constructorimpl = Result.m5535constructorimpl(arrayList2);
            } catch (Throwable th3) {
                th = th3;
                Result.Companion companion3 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th));
            }
            thM5538exceptionOrNullimpl = Result.m5538exceptionOrNullimpl(objM5535constructorimpl);
            if (thM5538exceptionOrNullimpl == null) {
                return objM5535constructorimpl;
            }
            LoggerKt.logError("Error reading tokens from storage", thM5538exceptionOrNullimpl);
            legacyStorage = tokenCompatStorage.storage;
            hVar.f30429p0 = null;
            hVar.f30432s0 = 2;
            if (legacyStorage.reset(hVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(tokensOrThrow$ethertoken_compat_release);
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getTokensOrThrow$ethertoken_compat_release(@NotNull Continuation<? super List<? extends com.bbva.ethermobile.help.kit.result.Result<LegacyToken>>> continuation) {
        i iVar;
        TokenCompatStorage tokenCompatStorage;
        List list;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i10 = iVar.f30436s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                iVar.f30436s0 = i10 - Integer.MIN_VALUE;
            } else {
                iVar = new i(continuation);
            }
        } else {
            iVar = new i(continuation);
        }
        Object obj = iVar.f30434q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = iVar.f30436s0;
        if (i11 != 0) {
            if (i11 == 1) {
                tokenCompatStorage = (TokenCompatStorage) iVar.f30433p0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                list = (List) iVar.f30433p0;
                ResultKt.throwOnFailure(obj);
            }
            return list;
        }
        ResultKt.throwOnFailure(obj);
        iVar.f30433p0 = this;
        iVar.f30436s0 = 1;
        obj = this.storage.get(this.tokenKey, iVar);
        if (obj == coroutine_suspended) {
            return coroutine_suspended;
        }
        tokenCompatStorage = this;
        String str = (String) obj;
        if (str == null || str.length() == 0) {
            return CollectionsKt__CollectionsKt.emptyList();
        }
        List listSplit$default = StringsKt__StringsKt.split$default((CharSequence) str, new String[]{"#"}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(LegacyTokenCoder.INSTANCE.decode((String) it.next()));
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        LegacyStorage legacyStorage = tokenCompatStorage.storage;
        iVar.f30433p0 = arrayList;
        iVar.f30436s0 = 2;
        if (legacyStorage.delete(tokenCompatStorage.tokenKey, iVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        list = arrayList;
        return list;
    }

    @NotNull
    /* JADX INFO: renamed from: getUuidType$ethertoken_compat_release, reason: from getter */
    public final LegacyToken.UUIDType getUuidType() {
        return this.uuidType;
    }

    @Override // com.bbva.ethermobilesdk.token.storage.Storage
    @Nullable
    public Object ids(@NotNull Continuation<? super Set<String>> continuation) throws TokenCompatStorageError {
        return e(this, continuation);
    }

    public final synchronized void setPin$ethertoken_compat_release(@Nullable String str) {
        this.pin = str;
    }

    public /* synthetic */ TokenCompatStorage(Context context, TokenCompatConfig.StorageMode storageMode, StorageProvider storageProvider, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, storageMode, (i10 & 4) != 0 ? INSTANCE.provider(context, storageMode) : storageProvider);
    }
}
