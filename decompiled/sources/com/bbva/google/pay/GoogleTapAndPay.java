package com.bbva.google.pay;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.util.Log;
import androidx.core.os.BundleKt;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityLauncher;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResult;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResultRequest;
import com.bbva.ethermobile.help.kit.result.Result;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.bbva.google.pay.model.CardPendingVerificationResult;
import com.bbva.google.pay.model.CardResult;
import com.bbva.google.pay.model.CardStatus;
import com.bbva.google.pay.model.PushDataResult;
import com.bbva.google.pay.utils.ExtensionsKt;
import com.bbva.google.pay.utils.TokenState;
import com.bbva.tohu.android.product.valkyria.sdk.constants.ProviderType;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tapandpay.TapAndPay;
import com.google.android.gms.tapandpay.TapAndPayClient;
import com.google.android.gms.tapandpay.issuer.IsTokenizedRequest;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tapandpay.issuer.ViewTokenRequest;
import com.google.android.gms.tasks.Tasks;
import com.google.gson.Gson;
import com.veridas.detect.ImageAnalysisKt;
import ek.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GoogleTapAndPay.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 R2\u00020\u0001:\u0001RB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J!\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJG\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJG\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u0010J]\u0010\u001e\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\n2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\nH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010 J#\u0010!\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\r2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010$J\u0010\u0010%\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\nH\u0002J\u0010\u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\nH\u0002J\u0010\u0010(\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0002J\u0010\u0010)\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\nH\u0002J\u0010\u0010*\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\nH\u0002J \u0010+\u001a\u00020,2\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J'\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u0010\u0010.\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u0014H\u0002J'\u00100\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u0010\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u00020#H\u0002J\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u0014H\u0002J!\u00106\u001a\u00020\u00112\u0012\u00107\u001a\n\u0012\u0006\b\u0001\u0012\u00020\n08\"\u00020\nH\u0002¢\u0006\u0002\u00109J'\u0010:\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u001bJ\u0016\u0010;\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010<\u001a\u00020\nH\u0002J'\u0010=\u001a\b\u0012\u0004\u0012\u00020?0>2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u000eJ?\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010AJ\u0014\u0010B\u001a\b\u0012\u0004\u0012\u00020\n0\u00102\u0006\u0010<\u001a\u00020\nJ(\u0010C\u001a\n D*\u0004\u0018\u00010\n0\n2\u0016\u0010E\u001a\u0012\u0012\u0004\u0012\u00020G0Fj\b\u0012\u0004\u0012\u00020G`HH\u0002J(\u0010I\u001a\n D*\u0004\u0018\u00010\n0\n2\u0016\u0010J\u001a\u0012\u0012\u0004\u0012\u00020K0Fj\b\u0012\u0004\u0012\u00020K`HH\u0002J\u0018\u0010L\u001a\n D*\u0004\u0018\u00010\n0\n2\u0006\u0010M\u001a\u00020NH\u0002J\"\u0010O\u001a\n D*\u0004\u0018\u00010\n0\n2\u0006\u0010P\u001a\u00020\n2\b\u0010Q\u001a\u0004\u0018\u00010\nH\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006S"}, d2 = {"Lcom/bbva/google/pay/GoogleTapAndPay;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "gSon", "Lcom/google/gson/Gson;", "tapAndPayClient", "Lcom/google/android/gms/tapandpay/TapAndPayClient;", "activeWalletId", "", "it", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "Landroid/app/Activity;", "(Lcom/google/android/gms/tapandpay/TapAndPayClient;Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callIsTokenized", "Lcom/bbva/ethermobile/help/kit/result/Result;", "", "activationData", GoogleTapAndPay.KEY_CARD_NETWORK, "", GoogleTapAndPay.KEY_TSP, GoogleTapAndPay.KEY_ALIAS, GoogleTapAndPay.KEY_PAN, "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callListToken", "panTruncated", "(Ljava/lang/String;Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "callPushTokenized", "cardsPendingVerification", "createCallActivityResult", "requestCode", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createWallet", "cause", "", "(Landroid/app/Activity;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fCardNetwork", "fCardNetworkBrand", "brand", "fPanLastFour", "fTokenProvider", "fTokenProviderBrand", "generateTokenizedRequest", "Lcom/google/android/gms/tapandpay/issuer/IsTokenizedRequest;", "getCardStatus", "getError", "error", "getPushData", "getStatusCodeApiException", "exception", "getTokenState", "Lcom/bbva/google/pay/utils/TokenState;", "token", "isNotValidParams", "params", "", "([Ljava/lang/String;)Z", "listCardStatus", "listTokens", "state", "listTokensCreateWallet", "", "Lcom/google/android/gms/tapandpay/issuer/TokenInfo;", "pushProvisioning", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/app/Activity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchCards", "serializeCards", "kotlin.jvm.PlatformType", "cards", "Ljava/util/ArrayList;", "Lcom/bbva/google/pay/model/CardResult;", "Lkotlin/collections/ArrayList;", "serializeCardsPendingResult", "cardsPending", "Lcom/bbva/google/pay/model/CardPendingVerificationResult;", "serializeCardsStatus", "cardStatus", "Lcom/bbva/google/pay/model/CardStatus;", "serializePushDataResult", "deviceId", "walletId", "Companion", "google-pay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGoogleTapAndPay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GoogleTapAndPay.kt\ncom/bbva/google/pay/GoogleTapAndPay\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,470:1\n288#2,2:471\n288#2,2:474\n1855#2,2:476\n1#3:473\n12744#4,2:478\n*S KotlinDebug\n*F\n+ 1 GoogleTapAndPay.kt\ncom/bbva/google/pay/GoogleTapAndPay\n*L\n74#1:471,2\n338#1:474,2\n356#1:476,2\n388#1:478,2\n*E\n"})
public final class GoogleTapAndPay {

    @NotNull
    public static final String KEY_ALIAS = "alias";

    @NotNull
    public static final String KEY_CARD_NETWORK = "cardNetwork";

    @NotNull
    public static final String KEY_OPC = "opc";

    @NotNull
    public static final String KEY_PAN = "pan";

    @NotNull
    public static final String KEY_REQUEST_CODE = "requestCode";

    @NotNull
    public static final String KEY_TSP = "tokenServiceProvider";
    public static final int REQUEST_CODE_PUSH_TOKENIZE = 2023;
    public static final int REQUEST_CREATE_WALLET = 2024;

    @NotNull
    public static final String TAG = "GPayLib";

    @NotNull
    private final Gson gSon;

    @Nullable
    private TapAndPayClient tapAndPayClient;

    /* JADX INFO: renamed from: com.bbva.google.pay.GoogleTapAndPay$activeWalletId$1, reason: invalid class name */
    /* JADX INFO: compiled from: GoogleTapAndPay.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.bbva.google.pay.GoogleTapAndPay", f = "GoogleTapAndPay.kt", i = {0, 0}, l = {148}, m = "activeWalletId", n = {"this", "it"}, s = {"L$0", "L$1"})
    public static final class AnonymousClass1 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoogleTapAndPay.this.activeWalletId(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.bbva.google.pay.GoogleTapAndPay$callIsTokenized$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: GoogleTapAndPay.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.bbva.google.pay.GoogleTapAndPay", f = "GoogleTapAndPay.kt", i = {0}, l = {ImageAnalysisKt.OVER_EXPOSED_THRESHOLD}, m = "callIsTokenized", n = {"this"}, s = {"L$0"})
    public static final class C05671 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C05671(Continuation<? super C05671> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoogleTapAndPay.this.callIsTokenized(null, 0, 0, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.bbva.google.pay.GoogleTapAndPay$callListToken$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: GoogleTapAndPay.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.bbva.google.pay.GoogleTapAndPay", f = "GoogleTapAndPay.kt", i = {0, 0, 0, 0, 1, 1}, l = {72, 78}, m = "callListToken", n = {"this", "panTruncated", ConstantsKt.DETECTED_ACTIVITY_EXTRA_ID, "it", "this", "hardwareId"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
    public static final class C05681 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C05681(Continuation<? super C05681> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoogleTapAndPay.this.callListToken(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.bbva.google.pay.GoogleTapAndPay$callPushTokenized$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: GoogleTapAndPay.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.bbva.google.pay.GoogleTapAndPay", f = "GoogleTapAndPay.kt", i = {0}, l = {258}, m = "callPushTokenized", n = {"this"}, s = {"L$0"})
    public static final class C05691 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C05691(Continuation<? super C05691> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoogleTapAndPay.this.callPushTokenized(null, 0, 0, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.bbva.google.pay.GoogleTapAndPay$createWallet$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: GoogleTapAndPay.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.bbva.google.pay.GoogleTapAndPay", f = "GoogleTapAndPay.kt", i = {0}, l = {120}, m = "createWallet", n = {"cause"}, s = {"L$0"})
    public static final class C05701 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C05701(Continuation<? super C05701> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoogleTapAndPay.this.createWallet(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.bbva.google.pay.GoogleTapAndPay$getCardStatus$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: GoogleTapAndPay.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.bbva.google.pay.GoogleTapAndPay", f = "GoogleTapAndPay.kt", i = {}, l = {324}, m = "getCardStatus", n = {}, s = {})
    public static final class C05711 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        public C05711(Continuation<? super C05711> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoogleTapAndPay.this.getCardStatus(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.bbva.google.pay.GoogleTapAndPay$listCardStatus$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: GoogleTapAndPay.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.bbva.google.pay.GoogleTapAndPay", f = "GoogleTapAndPay.kt", i = {0, 0}, l = {336}, m = "listCardStatus", n = {"this", GoogleTapAndPay.KEY_PAN}, s = {"L$0", "L$1"})
    public static final class C05721 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C05721(Continuation<? super C05721> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoogleTapAndPay.this.listCardStatus(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.bbva.google.pay.GoogleTapAndPay$listTokensCreateWallet$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: GoogleTapAndPay.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "com.bbva.google.pay.GoogleTapAndPay", f = "GoogleTapAndPay.kt", i = {0, 0}, l = {104}, m = "listTokensCreateWallet", n = {"this", "it"}, s = {"L$0", "L$1"})
    public static final class C05731 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C05731(Continuation<? super C05731> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return GoogleTapAndPay.this.listTokensCreateWallet(null, null, this);
        }
    }

    public GoogleTapAndPay(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.gSon = new Gson();
        this.tapAndPayClient = TapAndPay.getClient(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object activeWalletId(TapAndPayClient tapAndPayClient, Activity activity, Continuation<? super String> continuation) throws Exception {
        AnonymousClass1 anonymousClass1;
        GoogleTapAndPay googleTapAndPay;
        if (continuation instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) continuation;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(continuation);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(continuation);
        }
        Object objCreateWallet = anonymousClass1.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objCreateWallet);
            try {
                Object objAwait = Tasks.await(tapAndPayClient.getActiveWalletId());
                Intrinsics.checkNotNullExpressionValue(objAwait, "{\n            Tasks.awai…activeWalletId)\n        }");
                return (String) objAwait;
            } catch (Exception e5) {
                Throwable cause = e5.getCause();
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = tapAndPayClient;
                anonymousClass1.label = 1;
                objCreateWallet = createWallet(activity, cause, anonymousClass1);
                if (objCreateWallet == coroutine_suspended) {
                    return coroutine_suspended;
                }
                googleTapAndPay = this;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tapAndPayClient = (TapAndPayClient) anonymousClass1.L$1;
            googleTapAndPay = (GoogleTapAndPay) anonymousClass1.L$0;
            ResultKt.throwOnFailure(objCreateWallet);
        }
        int iIntValue = ((Number) objCreateWallet).intValue();
        if (iIntValue != -1) {
            throw new Exception(googleTapAndPay.getError(iIntValue));
        }
        Object objAwait2 = Tasks.await(tapAndPayClient.getActiveWalletId());
        Intrinsics.checkNotNullExpressionValue(objAwait2, "await(it.activeWalletId)");
        return objAwait2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final Object callIsTokenized(String str, int i10, int i11, String str2, String str3, Activity activity, Continuation<? super Result<Boolean>> continuation) {
        C05671 c05671;
        GoogleTapAndPay googleTapAndPay;
        if (continuation instanceof C05671) {
            c05671 = (C05671) continuation;
            int i12 = c05671.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c05671.label = i12 - Integer.MIN_VALUE;
            } else {
                c05671 = new C05671(continuation);
            }
        } else {
            c05671 = new C05671(continuation);
        }
        C05671 c05672 = c05671;
        Object objCallPushTokenized = c05672.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i13 = c05672.label;
        if (i13 != 0) {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            googleTapAndPay = (GoogleTapAndPay) c05672.L$0;
            try {
                ResultKt.throwOnFailure(objCallPushTokenized);
            } catch (Exception e5) {
                e = e5;
                e.toString();
                return new Result.Error(new Exception(googleTapAndPay.getError(googleTapAndPay.getStatusCodeApiException(e))));
            }
        }
        ResultKt.throwOnFailure(objCallPushTokenized);
        try {
            TapAndPayClient tapAndPayClient = this.tapAndPayClient;
            if (tapAndPayClient == null) {
                return new Result.Error(new IllegalArgumentException(new Exception("INIT_CALL_IS_NEEDED")));
            }
            Boolean tokenized = (Boolean) Tasks.await(tapAndPayClient.isTokenized(generateTokenizedRequest(str3, i10, i11)));
            Intrinsics.checkNotNullExpressionValue(tokenized, "tokenized");
            if (tokenized.booleanValue()) {
                return new Result.Error(new Exception("CARD_ALREADY_TOKENIZED"));
            }
            c05672.L$0 = this;
            c05672.label = 1;
            objCallPushTokenized = callPushTokenized(str, i10, i11, str2, str3, activity, c05672);
            return objCallPushTokenized == coroutine_suspended ? coroutine_suspended : objCallPushTokenized;
        } catch (Exception e7) {
            e = e7;
            googleTapAndPay = this;
            e.toString();
            return new Result.Error(new Exception(googleTapAndPay.getError(googleTapAndPay.getStatusCodeApiException(e))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x0088 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:43:0x00ba, B:31:0x0079, B:32:0x0081, B:34:0x0088, B:38:0x009b, B:40:0x009f, B:45:0x00d0), top: B:53:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x009f A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:43:0x00ba, B:31:0x0079, B:32:0x0081, B:34:0x0088, B:38:0x009b, B:40:0x009f, B:45:0x00d0), top: B:53:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00b9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x00d0 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0030, B:43:0x00ba, B:31:0x0079, B:32:0x0081, B:34:0x0088, B:38:0x009b, B:40:0x009f, B:45:0x00d0), top: B:53:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:57:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v9 */
    public final Object callListToken(String str, Activity activity, Continuation<? super Result<String>> continuation) {
        C05681 c05681;
        TapAndPayClient tapAndPayClient;
        Object obj;
        Activity activity2;
        GoogleTapAndPay googleTapAndPay;
        Iterator it;
        Object next;
        TokenInfo tokenInfo;
        String hardwareId;
        GoogleTapAndPay googleTapAndPay2;
        if (continuation instanceof C05681) {
            c05681 = (C05681) continuation;
            int i10 = c05681.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c05681.label = i10 - Integer.MIN_VALUE;
            } else {
                c05681 = new C05681(continuation);
            }
        } else {
            c05681 = new C05681(continuation);
        }
        Object objActiveWalletId = c05681.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c05681.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objActiveWalletId);
                try {
                    tapAndPayClient = this.tapAndPayClient;
                    if (tapAndPayClient == null) {
                        return new Result.Error(new IllegalArgumentException(new Exception("INIT_CALL_IS_NEEDED")));
                    }
                    c05681.L$0 = this;
                    c05681.L$1 = str;
                    c05681.L$2 = activity;
                    c05681.L$3 = tapAndPayClient;
                    c05681.label = 1;
                    Object objListTokensCreateWallet = listTokensCreateWallet(tapAndPayClient, activity, c05681);
                    if (objListTokensCreateWallet == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = objListTokensCreateWallet;
                    activity2 = activity;
                    googleTapAndPay = this;
                    it = ((List) obj).iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(((TokenInfo) next).getFpanLastFour(), str));
                    tokenInfo = (TokenInfo) next;
                    if (tokenInfo == null) {
                        ViewTokenRequest viewTokenRequestBuild = new ViewTokenRequest.Builder().setTokenServiceProvider(tokenInfo.getTokenServiceProvider()).setIssuerTokenId(tokenInfo.getIssuerTokenId()).build();
                        Intrinsics.checkNotNullExpressionValue(viewTokenRequestBuild, "Builder()\n              …                 .build()");
                        ((PendingIntent) Tasks.await(tapAndPayClient.viewToken(viewTokenRequestBuild))).send();
                        return new Result.Error(new Exception("CARD_ALREADY_TOKENIZED"));
                    }
                    hardwareId = (String) Tasks.await(tapAndPayClient.getStableHardwareId());
                    c05681.L$0 = googleTapAndPay;
                    c05681.L$1 = hardwareId;
                    c05681.L$2 = null;
                    c05681.L$3 = null;
                    c05681.label = 2;
                    objActiveWalletId = googleTapAndPay.activeWalletId(tapAndPayClient, activity2, c05681);
                    if (objActiveWalletId == coroutine_suspended) {
                        googleTapAndPay2 = googleTapAndPay;
                        return coroutine_suspended;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    activity = this;
                    th.toString();
                    return new Result.Error(new Exception(activity.getError(activity.getStatusCodeApiException(th))));
                }
            } else if (i11 == 1) {
                TapAndPayClient tapAndPayClient2 = (TapAndPayClient) c05681.L$3;
                Activity activity3 = (Activity) c05681.L$2;
                String str2 = (String) c05681.L$1;
                GoogleTapAndPay googleTapAndPay3 = (GoogleTapAndPay) c05681.L$0;
                try {
                    ResultKt.throwOnFailure(objActiveWalletId);
                    tapAndPayClient = tapAndPayClient2;
                    str = str2;
                    activity2 = activity3;
                    googleTapAndPay = googleTapAndPay3;
                    obj = objActiveWalletId;
                    it = ((List) obj).iterator();
                    do {
                        if (it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.areEqual(((TokenInfo) next).getFpanLastFour(), str));
                    tokenInfo = (TokenInfo) next;
                    if (tokenInfo == null) {
                        ViewTokenRequest viewTokenRequestBuild2 = new ViewTokenRequest.Builder().setTokenServiceProvider(tokenInfo.getTokenServiceProvider()).setIssuerTokenId(tokenInfo.getIssuerTokenId()).build();
                        Intrinsics.checkNotNullExpressionValue(viewTokenRequestBuild2, "Builder()\n              …                 .build()");
                        ((PendingIntent) Tasks.await(tapAndPayClient.viewToken(viewTokenRequestBuild2))).send();
                        return new Result.Error(new Exception("CARD_ALREADY_TOKENIZED"));
                    }
                    hardwareId = (String) Tasks.await(tapAndPayClient.getStableHardwareId());
                    c05681.L$0 = googleTapAndPay;
                    c05681.L$1 = hardwareId;
                    c05681.L$2 = null;
                    c05681.L$3 = null;
                    c05681.label = 2;
                    objActiveWalletId = googleTapAndPay.activeWalletId(tapAndPayClient, activity2, c05681);
                    if (objActiveWalletId == coroutine_suspended) {
                        googleTapAndPay2 = googleTapAndPay;
                        return coroutine_suspended;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    activity = googleTapAndPay3;
                    th.toString();
                    return new Result.Error(new Exception(activity.getError(activity.getStatusCodeApiException(th))));
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hardwareId = (String) c05681.L$1;
                GoogleTapAndPay googleTapAndPay4 = (GoogleTapAndPay) c05681.L$0;
                ResultKt.throwOnFailure(objActiveWalletId);
                googleTapAndPay2 = googleTapAndPay4;
            }
            googleTapAndPay2 = googleTapAndPay;
            Intrinsics.checkNotNullExpressionValue(hardwareId, "hardwareId");
            String strSerializePushDataResult = googleTapAndPay2.serializePushDataResult(hardwareId, (String) objActiveWalletId);
            Intrinsics.checkNotNullExpressionValue(strSerializePushDataResult, "serializePushDataResult(hardwareId, walletId)");
            return new Result.Success(strSerializePushDataResult);
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0017  */
    public final Object callPushTokenized(String str, int i10, int i11, String str2, String str3, Activity activity, Continuation<? super Result<Boolean>> continuation) {
        C05691 c05691;
        GoogleTapAndPay googleTapAndPay;
        if (continuation instanceof C05691) {
            c05691 = (C05691) continuation;
            int i12 = c05691.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c05691.label = i12 - Integer.MIN_VALUE;
            } else {
                c05691 = new C05691(continuation);
            }
        } else {
            c05691 = new C05691(continuation);
        }
        C05691 c05692 = c05691;
        Object objCreateCallActivityResult = c05692.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i13 = c05692.label;
        if (i13 == 0) {
            ResultKt.throwOnFailure(objCreateCallActivityResult);
            Integer numBoxInt = Boxing.boxInt(i10);
            Integer numBoxInt2 = Boxing.boxInt(i11);
            c05692.L$0 = this;
            c05692.label = 1;
            objCreateCallActivityResult = createCallActivityResult(activity, "REQUEST_CODE_PUSH_TOKENIZE", str, numBoxInt, numBoxInt2, str2, str3, c05692);
            if (objCreateCallActivityResult == coroutine_suspended) {
                return coroutine_suspended;
            }
            googleTapAndPay = this;
        } else {
            if (i13 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            googleTapAndPay = (GoogleTapAndPay) c05692.L$0;
            ResultKt.throwOnFailure(objCreateCallActivityResult);
        }
        int iIntValue = ((Number) objCreateCallActivityResult).intValue();
        return iIntValue == -1 ? new Result.Success(Boxing.boxBoolean(true)) : new Result.Error(new Exception(googleTapAndPay.getError(iIntValue)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object createCallActivityResult(Activity activity, final String str, final String str2, final Integer num, final Integer num2, final String str3, final String str4, Continuation<? super Integer> continuation) {
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        new ActivityLauncher().create(new Function1<ActivityResultRequest.Builder, Unit>() { // from class: com.bbva.google.pay.GoogleTapAndPay$createCallActivityResult$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ActivityResultRequest.Builder builder) {
                invoke2(builder);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ActivityResultRequest.Builder create) {
                Intrinsics.checkNotNullParameter(create, "$this$create");
                create.setExtras(Intrinsics.areEqual(str, "REQUEST_CREATE_WALLET") ? BundleKt.bundleOf(TuplesKt.to("requestCode", str)) : BundleKt.bundleOf(TuplesKt.to("requestCode", str), TuplesKt.to(GoogleTapAndPay.KEY_OPC, str2), TuplesKt.to(GoogleTapAndPay.KEY_CARD_NETWORK, num), TuplesKt.to(GoogleTapAndPay.KEY_TSP, num2), TuplesKt.to(GoogleTapAndPay.KEY_ALIAS, str3), TuplesKt.to(GoogleTapAndPay.KEY_PAN, str4)));
                create.setTarget(GooglePayActivity.class);
            }
        }).listen(new Function1<ActivityResult, Unit>() { // from class: com.bbva.google.pay.GoogleTapAndPay$createCallActivityResult$2$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ActivityResult activityResult) {
                invoke2(activityResult);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ActivityResult it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it instanceof ActivityResult.Success) {
                    Continuation<Integer> continuation2 = safeContinuation;
                    kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                    continuation2.resumeWith(kotlin.Result.m5535constructorimpl(Integer.valueOf(((ActivityResult.Success) it).getResultCode())));
                } else if (it instanceof ActivityResult.Cancel) {
                    Continuation<Integer> continuation3 = safeContinuation;
                    kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                    continuation3.resumeWith(kotlin.Result.m5535constructorimpl(ResultKt.createFailure(new Exception("INTERNAL_ERROR"))));
                }
            }
        }).launch(activity);
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public static /* synthetic */ Object createCallActivityResult$default(GoogleTapAndPay googleTapAndPay, Activity activity, String str, String str2, Integer num, Integer num2, String str3, String str4, Continuation continuation, int i10, Object obj) {
        return googleTapAndPay.createCallActivityResult(activity, str, (i10 & 4) != 0 ? null : str2, (i10 & 8) != 0 ? -1 : num, (i10 & 16) != 0 ? null : num2, (i10 & 32) != 0 ? null : str3, (i10 & 64) != 0 ? null : str4, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object createWallet(Activity activity, Throwable th2, Continuation<? super Integer> continuation) throws Exception {
        C05701 c05701;
        if (continuation instanceof C05701) {
            c05701 = (C05701) continuation;
            int i10 = c05701.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c05701.label = i10 - Integer.MIN_VALUE;
            } else {
                c05701 = new C05701(continuation);
            }
        } else {
            c05701 = new C05701(continuation);
        }
        C05701 c05702 = c05701;
        Object objCreateCallActivityResult$default = c05702.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c05702.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objCreateCallActivityResult$default);
            if (!(th2 instanceof ApiException)) {
                Objects.toString(th2);
                throw new Exception(getError(8));
            }
            ApiException apiException = (ApiException) th2;
            String message = apiException.getMessage();
            if (message != null) {
                Boxing.boxInt(Log.i(TAG, "message: ".concat(message)));
            }
            apiException.getStatusCode();
            if (apiException.getStatusCode() == 15002) {
                c05702.L$0 = th2;
                c05702.label = 1;
                objCreateCallActivityResult$default = createCallActivityResult$default(this, activity, "REQUEST_CREATE_WALLET", null, null, null, null, null, c05702, 124, null);
                if (objCreateCallActivityResult$default == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Boxing.boxInt(((ApiException) th2).getStatusCode());
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        th2 = (Throwable) c05702.L$0;
        ResultKt.throwOnFailure(objCreateCallActivityResult$default);
        int iIntValue = ((Number) objCreateCallActivityResult$default).intValue();
        if (iIntValue == -1) {
            return Boxing.boxInt(iIntValue);
        }
        return Boxing.boxInt(((ApiException) th2).getStatusCode());
    }

    private final int fCardNetwork(String pan) {
        if (!ExtensionsKt.isValidPan(pan)) {
            return 0;
        }
        if (l.startsWith$default(pan, "4", false, 2, null)) {
            return 4;
        }
        if (l.startsWith$default(pan, "5", false, 2, null)) {
            return 3;
        }
        return (l.startsWith$default(pan, "34", false, 2, null) || l.startsWith$default(pan, "37", false, 2, null)) ? 1 : 0;
    }

    private final int fCardNetworkBrand(String brand) {
        int iHashCode = brand.hashCode();
        if (iHashCode != -891831603) {
            if (iHashCode != 2634817) {
                if (iHashCode == 1512044081 && brand.equals("AMERICAN_EXPRESS")) {
                    return 1;
                }
            } else if (brand.equals(ProviderType.PROVIDER_ID_VISA)) {
                return 4;
            }
        } else if (brand.equals("MASTER_CARD")) {
            return 3;
        }
        return 0;
    }

    private final String fPanLastFour(String pan) {
        if (pan.length() <= 0 || !(ExtensionsKt.isAmex(pan) || ExtensionsKt.isVisaOrMc(pan))) {
            return "";
        }
        String strSubstring = pan.substring(pan.length() - 4, pan.length());
        Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }

    private final int fTokenProvider(String pan) {
        if (!ExtensionsKt.isValidPan(pan)) {
            return 0;
        }
        if (l.startsWith$default(pan, "4", false, 2, null)) {
            return 4;
        }
        if (l.startsWith$default(pan, "5", false, 2, null)) {
            return 3;
        }
        return (l.startsWith$default(pan, "34", false, 2, null) || l.startsWith$default(pan, "37", false, 2, null)) ? 2 : 0;
    }

    private final int fTokenProviderBrand(String brand) {
        int iHashCode = brand.hashCode();
        if (iHashCode != -891831603) {
            if (iHashCode != 2634817) {
                if (iHashCode == 1512044081 && brand.equals("AMERICAN_EXPRESS")) {
                    return 2;
                }
            } else if (brand.equals(ProviderType.PROVIDER_ID_VISA)) {
                return 4;
            }
        } else if (brand.equals("MASTER_CARD")) {
            return 3;
        }
        return 0;
    }

    private final IsTokenizedRequest generateTokenizedRequest(String pan, int cardNetwork, int tokenServiceProvider) {
        IsTokenizedRequest isTokenizedRequestBuild = new IsTokenizedRequest.Builder().setIdentifier(fPanLastFour(pan)).setNetwork(cardNetwork).setTokenServiceProvider(tokenServiceProvider).build();
        Intrinsics.checkNotNullExpressionValue(isTokenizedRequestBuild, "Builder()\n            .s…der)\n            .build()");
        return isTokenizedRequestBuild;
    }

    private final String getError(int error) {
        if (error == 4) {
            return "TOKENIZATION_ERROR";
        }
        if (error != 7) {
            if (error == 15 || error == 22) {
                return "TIME_OUT_ERROR";
            }
            if (error == 15002) {
                return "WALLET_ERROR";
            }
            if (error != 19 && error != 20) {
                return "INTERNAL_ERROR";
            }
        }
        return "NETWORK_ERROR";
    }

    private final int getStatusCodeApiException(Throwable exception) {
        Throwable cause = exception.getCause();
        ApiException apiException = new ApiException(new Status(0, exception.getMessage()));
        if (cause instanceof ApiException) {
            apiException = (ApiException) cause;
        } else if (exception instanceof ApiException) {
            apiException = (ApiException) exception;
        }
        return apiException.getStatusCode();
    }

    private final TokenState getTokenState(int token) {
        if (token == 1) {
            return TokenState.NOT_ADDED;
        }
        if (token == 2) {
            return TokenState.NOT_ADDED;
        }
        if (token == 3) {
            return TokenState.PENDING_VERIFICATION;
        }
        if (token != 4) {
            return token != 5 ? TokenState.EMPTY : TokenState.ADDED;
        }
        return TokenState.ADDED;
    }

    private final boolean isNotValidParams(String... params) {
        for (String str : params) {
            if (str.length() == 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object listCardStatus(String str, Activity activity, Continuation<? super Result<String>> continuation) throws Exception {
        C05721 c05721;
        GoogleTapAndPay googleTapAndPay;
        Object next;
        if (continuation instanceof C05721) {
            c05721 = (C05721) continuation;
            int i10 = c05721.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c05721.label = i10 - Integer.MIN_VALUE;
            } else {
                c05721 = new C05721(continuation);
            }
        } else {
            c05721 = new C05721(continuation);
        }
        Object objListTokensCreateWallet = c05721.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c05721.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objListTokensCreateWallet);
            TapAndPayClient tapAndPayClient = this.tapAndPayClient;
            if (tapAndPayClient == null) {
                return new Result.Error(new IllegalArgumentException(new Exception("INIT_CALL_IS_NEEDED")));
            }
            c05721.L$0 = this;
            c05721.L$1 = str;
            c05721.label = 1;
            objListTokensCreateWallet = listTokensCreateWallet(tapAndPayClient, activity, c05721);
            if (objListTokensCreateWallet == coroutine_suspended) {
                return coroutine_suspended;
            }
            googleTapAndPay = this;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) c05721.L$1;
            googleTapAndPay = (GoogleTapAndPay) c05721.L$0;
            ResultKt.throwOnFailure(objListTokensCreateWallet);
        }
        Iterator it = ((List) objListTokensCreateWallet).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!Intrinsics.areEqual(((TokenInfo) next).getFpanLastFour(), ExtensionsKt.lastFourDigits(str)));
        TokenInfo tokenInfo = (TokenInfo) next;
        String strSerializeCardsStatus = googleTapAndPay.serializeCardsStatus(tokenInfo == null ? new CardStatus(TokenState.NOT_ADDED, null, 2, null) : new CardStatus(googleTapAndPay.getTokenState(tokenInfo.getTokenState()), tokenInfo.getIssuerTokenId()));
        Intrinsics.checkNotNullExpressionValue(strSerializeCardsStatus, "serializeCardsStatus(cardStatus)");
        return new Result.Success(strSerializeCardsStatus);
    }

    private final Result<String> listTokens(String state) {
        TapAndPayClient tapAndPayClient = this.tapAndPayClient;
        if (tapAndPayClient == null) {
            return new Result.Error(new IllegalArgumentException(new Exception("INIT_CALL_IS_NEEDED")));
        }
        List<TokenInfo> tokens = (List) Tasks.await(tapAndPayClient.listTokens());
        ArrayList<CardResult> arrayList = new ArrayList<>();
        Intrinsics.checkNotNullExpressionValue(tokens, "tokens");
        for (TokenInfo tokenInfo : tokens) {
            TokenState tokenState = getTokenState(tokenInfo.getTokenState());
            if (state.length() == 0 || (state.length() > 0 && Intrinsics.areEqual(tokenState.toString(), state))) {
                String fpanLastFour = tokenInfo.getFpanLastFour();
                Intrinsics.checkNotNullExpressionValue(fpanLastFour, "token.fpanLastFour");
                boolean isDefaultToken = tokenInfo.getIsDefaultToken();
                String issuerTokenId = tokenInfo.getIssuerTokenId();
                Intrinsics.checkNotNullExpressionValue(issuerTokenId, "token.issuerTokenId");
                arrayList.add(new CardResult(fpanLastFour, isDefaultToken, tokenState, issuerTokenId));
            }
        }
        String strSerializeCards = serializeCards(arrayList);
        Intrinsics.checkNotNullExpressionValue(strSerializeCards, "serializeCards(cardsAddList)");
        return new Result.Success(strSerializeCards);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object listTokensCreateWallet(TapAndPayClient tapAndPayClient, Activity activity, Continuation<? super List<TokenInfo>> continuation) throws Exception {
        C05731 c05731;
        GoogleTapAndPay googleTapAndPay;
        if (continuation instanceof C05731) {
            c05731 = (C05731) continuation;
            int i10 = c05731.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c05731.label = i10 - Integer.MIN_VALUE;
            } else {
                c05731 = new C05731(continuation);
            }
        } else {
            c05731 = new C05731(continuation);
        }
        Object objCreateWallet = c05731.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c05731.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objCreateWallet);
            try {
                Object objAwait = Tasks.await(tapAndPayClient.listTokens());
                Intrinsics.checkNotNullExpressionValue(objAwait, "{\n            Tasks.awai…t.listTokens())\n        }");
                return (List) objAwait;
            } catch (Exception e5) {
                Throwable cause = e5.getCause();
                c05731.L$0 = this;
                c05731.L$1 = tapAndPayClient;
                c05731.label = 1;
                objCreateWallet = createWallet(activity, cause, c05731);
                if (objCreateWallet == coroutine_suspended) {
                    return coroutine_suspended;
                }
                googleTapAndPay = this;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tapAndPayClient = (TapAndPayClient) c05731.L$1;
            googleTapAndPay = (GoogleTapAndPay) c05731.L$0;
            ResultKt.throwOnFailure(objCreateWallet);
        }
        int iIntValue = ((Number) objCreateWallet).intValue();
        if (iIntValue != -1) {
            throw new Exception(googleTapAndPay.getError(iIntValue));
        }
        Object objAwait2 = Tasks.await(tapAndPayClient.listTokens());
        Intrinsics.checkNotNullExpressionValue(objAwait2, "await(it.listTokens())");
        return objAwait2;
    }

    private final String serializeCards(ArrayList<CardResult> cards) {
        return this.gSon.toJson(cards);
    }

    private final String serializeCardsPendingResult(ArrayList<CardPendingVerificationResult> cardsPending) {
        return this.gSon.toJson(cardsPending);
    }

    private final String serializeCardsStatus(CardStatus cardStatus) {
        return this.gSon.toJson(cardStatus);
    }

    private final String serializePushDataResult(String deviceId, String walletId) {
        return this.gSon.toJson(new PushDataResult(deviceId, walletId));
    }

    @NotNull
    public final Result<String> cardsPendingVerification() {
        try {
            TapAndPayClient tapAndPayClient = this.tapAndPayClient;
            if (tapAndPayClient == null) {
                return new Result.Error(new IllegalArgumentException(new Exception("INIT_CALL_IS_NEEDED")));
            }
            List<TokenInfo> list = (List) Tasks.await(tapAndPayClient.listTokens());
            ArrayList<CardPendingVerificationResult> arrayList = new ArrayList<>();
            for (TokenInfo tokenInfo : list) {
                if (tokenInfo.getTokenState() == 3) {
                    String fpanLastFour = tokenInfo.getFpanLastFour();
                    Intrinsics.checkNotNullExpressionValue(fpanLastFour, "token.fpanLastFour");
                    String issuerTokenId = tokenInfo.getIssuerTokenId();
                    Intrinsics.checkNotNullExpressionValue(issuerTokenId, "token.issuerTokenId");
                    arrayList.add(new CardPendingVerificationResult(fpanLastFour, issuerTokenId));
                }
            }
            String strSerializeCardsPendingResult = serializeCardsPendingResult(arrayList);
            Intrinsics.checkNotNullExpressionValue(strSerializeCardsPendingResult, "serializeCardsPendingResult(cardsPendingList)");
            return new Result.Success(strSerializeCardsPendingResult);
        } catch (Throwable th2) {
            th2.toString();
            return new Result.Error(new Exception(getError(getStatusCodeApiException(th2))));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object getCardStatus(@NotNull String str, @NotNull Activity activity, @NotNull Continuation<? super Result<String>> continuation) {
        C05711 c05711;
        if (continuation instanceof C05711) {
            c05711 = (C05711) continuation;
            int i10 = c05711.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c05711.label = i10 - Integer.MIN_VALUE;
            } else {
                c05711 = new C05711(continuation);
            }
        } else {
            c05711 = new C05711(continuation);
        }
        Object objListCardStatus = c05711.result;
        Object coroutine_suspended = a.getCOROUTINE_SUSPENDED();
        int i11 = c05711.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objListCardStatus);
                if (!ExtensionsKt.isValidPan(str)) {
                    return new Result.Error(new IllegalArgumentException(new Exception("INVALID_PARAMETERS")));
                }
                c05711.label = 1;
                objListCardStatus = listCardStatus(str, activity, c05711);
                if (objListCardStatus == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objListCardStatus);
            }
            return (Result) objListCardStatus;
        } catch (Throwable th2) {
            th2.toString();
            return new Result.Error(th2);
        }
    }

    @Nullable
    public final Object getPushData(@NotNull String str, @NotNull Activity activity, @NotNull Continuation<? super Result<String>> continuation) {
        if (isNotValidParams(str)) {
            return new Result.Error(new IllegalArgumentException(new Exception("MANDATORY_PARAMETERS_MISSING")));
        }
        return !ExtensionsKt.isValidPanTruncated(str) ? new Result.Error(new IllegalArgumentException(new Exception("INVALID_PARAMETERS"))) : callListToken(str, activity, continuation);
    }

    @Nullable
    public final Object pushProvisioning(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull Activity activity, @NotNull Continuation<? super Result<Boolean>> continuation) {
        if (isNotValidParams(str, str2, str4)) {
            return new Result.Error(new IllegalArgumentException(new Exception("MANDATORY_PARAMETERS_MISSING")));
        }
        if (ExtensionsKt.isValidPan(str)) {
            return callIsTokenized(str4, ExtensionsKt.isValidBrand(str3) ? fCardNetworkBrand(str3) : fCardNetwork(str), ExtensionsKt.isValidBrand(str3) ? fTokenProviderBrand(str3) : fTokenProvider(str), str2, str, activity, continuation);
        }
        return new Result.Error(new IllegalArgumentException(new Exception("INVALID_PARAMETERS")));
    }

    @NotNull
    public final Result<String> searchCards(@NotNull String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.length() != 0 && (state.length() <= 0 || !(Intrinsics.areEqual(state, "ADDED") || Intrinsics.areEqual(state, "PENDING_VERIFICATION")))) {
            return new Result.Error(new Exception("INVALID_PARAMETERS"));
        }
        try {
            return listTokens(state);
        } catch (Throwable th2) {
            th2.toString();
            return new Result.Error(new Exception(getError(getStatusCodeApiException(th2))));
        }
    }
}
