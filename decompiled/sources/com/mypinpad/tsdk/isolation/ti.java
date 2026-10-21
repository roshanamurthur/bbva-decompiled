package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mypinpad.tsdk.api.errors.TerminalException;
import ie.v0;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.Supplier;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001:\u0002-.Bg\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020\u0004\u0012\u0006\u0010\u001e\u001a\u00020\u0004\u0012\"\b\u0002\u0010#\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\"0 \u0012\"\b\u0002\u0010&\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020%0 ¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0004H\u0002JP\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\bJ\u0016\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0004JV\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00160\u00192\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bJ\u0016\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0004J\f\u0010\u001d\u001a\u00020\u0013*\u00020\u0011H\u0002R\u0014\u0010\u001e\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR.\u0010#\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\"0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R.\u0010&\u001a\u001c\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020!\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020%0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u001f¨\u0006/"}, d2 = {"Lcom/mypinpad/tsdk/internal/terminal/authorisation/TransactionService;", "", "Lcom/mypinpad/tsdk/internal/sdk/models/SdkTransactionType;", "sdkTransactionType", "", "getRequestUrl", "id", "getStatusUrl", "Ljava/util/UUID;", "transactionId", "", "emvPayload", "pinBlock", "encryptedPek", "retrievalReferenceNumber", "metadata", "gatewayId", "Lokhttp3/Request;", "getTransactionRequest", "Lcom/mypinpad/tsdk/internal/remote/HttpNetworkResponse;", "httpNetworkResponse", "sdkTransactionId", "Lcom/mypinpad/tsdk/internal/terminal/authorisation/TransactionService$TransactionResult;", "handleTransactionResponse", "softposPinData", "Ljava/util/concurrent/CompletableFuture;", "transactionRequest", "", "updateStateRecord", "sendNetworkRequestThroughSecureProcess", "baseUrl", "Ljava/lang/String;", "Lkotlin/Function3;", "", "Lorg/json/JSONObject;", "getJsonOrHandleUnexpectedResponse", "Lkotlin/jvm/functions/Function3;", "", "handleUnexpectedStatusCode", "Lcom/mypinpad/tsdk/internal/merchant/MerchantId;", "merchantId", "Lcom/mypinpad/tsdk/internal/merchant/MerchantId;", "sdkInstanceId", "<init>", "(Lcom/mypinpad/tsdk/internal/merchant/MerchantId;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;)V", "Companion", "TransactionResult", "sdk-android_release"}, k = 1, mv = {1, 8, 0})
public final class ti {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static long f61064f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static char[] f61065g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static char f61066h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f61067i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f61068j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f61069k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f61070l;
    public static final byte[] m = null;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f61071n = 0;

    @NotNull
    public static final setCompoundDrawableTintBlendMode setOnFocusChangeListener;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final op f61072a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f61073b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f61074c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Function3<pw, Integer, UUID, JSONObject> f61075d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final Function3 f61076e;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u000b¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/pw;", "p0", "", "p1", "Ljava/util/UUID;", "p2", "Lorg/json/JSONObject;", "setOnFocusChangeListener", "(Lcom/mypinpad/tsdk/i/pw;ILjava/util/UUID;)Lorg/json/JSONObject;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTransactionService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionService.kt\ncom/mypinpad/tsdk/internal/terminal/authorisation/TransactionService$1\n+ 2 HttpNetworkResponse.kt\ncom/mypinpad/tsdk/internal/remote/HttpNetworkResponseKt\n+ 3 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n*L\n1#1,240:1\n50#2,4:241\n54#2:253\n7#3,8:245\n*S KotlinDebug\n*F\n+ 1 TransactionService.kt\ncom/mypinpad/tsdk/internal/terminal/authorisation/TransactionService$1\n*L\n36#1:241,4\n36#1:253\n36#1:245,8\n*E\n"})
    public static final class a extends Lambda implements Function3<pw, Integer, UUID, JSONObject> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f61077p0 = new a();

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f61078q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f61079r0 = 1;

        static {
            int i10 = f61078q0;
            int i11 = ((-1) << 1) - ((-1) ^ ((i10 ^ 56) + ((i10 & 56) << 1)));
            f61079r0 = i11 % 128;
            int i12 = i11 % 2;
        }

        public a() {
            super(3);
        }

        public static /* synthetic */ JSONObject a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            int i13 = ~((~i10) | i11);
            int i14 = ~i12;
            int i15 = (((~(i14 | i11)) | i13) * (-1188)) + (i11 * (-1187)) + (i10 * 595);
            int i16 = ~i11;
            int i17 = (~(i12 | i16)) | i13;
            int i18 = ~(i14 | i10);
            if ((((~(i10 | i16)) | (~(i16 | i14)) | i18) * 594) + ((i17 | i18) * 594) + i15 == 1) {
                a aVar = (a) objArr[0];
                Object obj = objArr[1];
                Object obj2 = objArr[2];
                Object obj3 = objArr[3];
                int i19 = f61079r0;
                int i20 = i19 & 3;
                int i21 = -(-((i19 ^ 3) | i20));
                int i22 = (i20 & i21) + (i21 | i20);
                f61078q0 = i22 % 128;
                int i23 = i22 % 2;
                int iIntValue = ((Number) obj2).intValue();
                JSONObject jSONObjectA = a(new Object[]{aVar, (pw) obj, Integer.valueOf(iIntValue), (UUID) obj3}, 385032422, -385032422, iIntValue);
                int i24 = f61078q0;
                int i25 = i24 & 27;
                int i26 = -(-((i24 ^ 27) | i25));
                int i27 = (i25 ^ i26) + ((i26 & i25) << 1);
                f61079r0 = i27 % 128;
                int i28 = i27 % 2;
                return jSONObjectA;
            }
            pw pwVar = (pw) objArr[1];
            int iIntValue2 = ((Number) objArr[2]).intValue();
            UUID uuid = (UUID) objArr[3];
            int i29 = f61079r0;
            int i30 = (i29 & (-126)) | ((~i29) & 125);
            int i31 = (i29 & 125) << 1;
            int i32 = ((i30 | i31) << 1) - (i31 ^ i30);
            f61078q0 = i32 % 128;
            int i33 = i32 % 2;
            Intrinsics.checkNotNullParameter(pwVar, "");
            try {
                JSONObject onFocusChangeListener = pwVar.setOnFocusChangeListener();
                if (onFocusChangeListener == null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iIntValue2);
                    sb2.append(AbstractJsonLexerKt.COMMA);
                    sb2.append(pwVar.setX());
                    mu.setCompoundDrawableTintBlendMode(new Object[]{180003, getDisplayExponent.setY(sb2.toString()), null, 4}, -1968587119, 1968587120, 180003);
                    TerminalException terminalException = new TerminalException(iIntValue2, pwVar.setX(), null);
                    mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
                    throw terminalException;
                }
                int i34 = f61079r0;
                int i35 = ((i34 | 79) << 1) - (i34 ^ 79);
                f61078q0 = i35 % 128;
                int i36 = i35 % 2;
                int i37 = ((i34 ^ 119) | (i34 & 119)) << 1;
                int i38 = -(((~i34) & 119) | (i34 & (-120)));
                int i39 = (i37 & i38) + (i38 | i37);
                int i40 = i39 % 128;
                f61078q0 = i40;
                if (i39 % 2 != 0) {
                    throw null;
                }
                int i41 = i40 + 83;
                f61079r0 = i41 % 128;
                int i42 = i41 % 2;
                return onFocusChangeListener;
            } catch (Throwable th2) {
                pc.setY(new ou(uuid, Integer.valueOf(pwVar.setY()), iIntValue2, getDisplayExponent.setCompoundDrawableTintBlendMode(pwVar, mw.setDividerPadding(th2))));
                throw th2;
            }
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ JSONObject invoke(pw pwVar, Integer num, UUID uuid) {
            return a(new Object[]{this, pwVar, num, uuid}, 872364599, -872364598, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u000b¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/mypinpad/tsdk/i/pw;", "p0", "", "p1", "Ljava/util/UUID;", "p2", "", "setCompoundDrawableTintBlendMode", "(Lcom/mypinpad/tsdk/i/pw;ILjava/util/UUID;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTransactionService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionService.kt\ncom/mypinpad/tsdk/internal/terminal/authorisation/TransactionService$2\n+ 2 HttpNetworkResponse.kt\ncom/mypinpad/tsdk/internal/remote/HttpNetworkResponseKt\n+ 3 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n*L\n1#1,240:1\n57#2,3:241\n7#3,8:244\n*S KotlinDebug\n*F\n+ 1 TransactionService.kt\ncom/mypinpad/tsdk/internal/terminal/authorisation/TransactionService$2\n*L\n58#1:241,3\n58#1:244,8\n*E\n"})
    public static final class b extends Lambda implements Function3 {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final b f61080p0 = new b();

        static {
            int i10 = (8 << 1) - 9;
            int i11 = i10 % 128;
            int i12 = i10 % 2;
        }

        public b() {
            super(3);
        }

        public static /* synthetic */ Void a(Object[] objArr, int i10, int i11, int i12) throws Throwable {
            int i13 = ~((~i10) | i11);
            if ((((~(i10 | i12)) | (~((~i11) | i10)) | i13) * 70) + ((~(i10 | i11 | i12)) * 70) + (((~(i11 | i12)) | i13) * (-140)) + (i11 * (-69)) + (i10 * 71) == 1) {
                b bVar = (b) objArr[0];
                Object obj = objArr[1];
                Object obj2 = objArr[2];
                Object obj3 = objArr[3];
                int iIntValue = ((Number) obj2).intValue();
                return a(new Object[]{bVar, (pw) obj, Integer.valueOf(iIntValue), (UUID) obj3}, -933566945, 933566945, iIntValue);
            }
            pw pwVar = (pw) objArr[1];
            int iIntValue2 = ((Number) objArr[2]).intValue();
            UUID uuid = (UUID) objArr[3];
            Intrinsics.checkNotNullParameter(pwVar, "");
            pc.setY(new ou(uuid, Integer.valueOf(pwVar.setY()), iIntValue2, pwVar));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(iIntValue2);
            sb2.append(AbstractJsonLexerKt.COMMA);
            sb2.append(pwVar.setX());
            mu.setCompoundDrawableTintBlendMode(new Object[]{180004, getDisplayExponent.setY(sb2.toString()), null, 4}, -1968587119, 1968587120, 180004);
            TerminalException terminalException = new TerminalException(iIntValue2, pwVar.setX(), null);
            mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException;
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a(new Object[]{this, obj, obj2, obj3}, 1011081458, -1011081457, System.identityHashCode(this));
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/ti$setCompoundDrawableTintBlendMode;", "", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class setCompoundDrawableTintBlendMode {
        public setCompoundDrawableTintBlendMode() {
        }

        public /* synthetic */ setCompoundDrawableTintBlendMode(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public /* synthetic */ class setX {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f61088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f61089b;
        public static final /* synthetic */ int[] setCompoundDrawableTintBlendMode;

        static {
            int[] iArr = new int[so.values().length];
            try {
                iArr[so.setY.ordinal()] = 1;
                f61089b = 67 % 128;
                int i10 = 67 % 2;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[so.setOnFocusChangeListener.ordinal()] = 2;
                int i11 = f61089b;
                int i12 = i11 & 55;
                int i13 = (i11 | 55) & (~i12);
                int i14 = i12 << 1;
                int i15 = (i13 ^ i14) + ((i13 & i14) << 1);
                f61088a = i15 % 128;
                int i16 = i15 % 2;
            } catch (NoSuchFieldError unused2) {
            }
            setCompoundDrawableTintBlendMode = iArr;
            int i17 = f61088a + 97;
            f61089b = i17 % 128;
            if (i17 % 2 == 0) {
                throw null;
            }
        }
    }

    static {
        d();
        f61069k = 0;
        f61070l = 1;
        f61067i = 0;
        f61068j = 1;
        e();
        setOnFocusChangeListener = new setCompoundDrawableTintBlendMode(null);
        int i10 = f61068j + 101;
        f61067i = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ti(@NotNull op opVar, @NotNull String str, @NotNull String str2, @NotNull Function3<? super pw, ? super Integer, ? super UUID, ? extends JSONObject> function3, @NotNull Function3 function4) {
        Intrinsics.checkNotNullParameter(opVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(function3, "");
        Intrinsics.checkNotNullParameter(function4, "");
        this.f61072a = opVar;
        this.f61073b = str;
        this.f61074c = str2;
        this.f61075d = function3;
        this.f61076e = function4;
    }

    public static void a(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        int i12 = f61069k + 81;
        f61070l = i12 % 128;
        int i13 = i12 % 2;
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = f61065g;
        int i14 = 1;
        char c10 = '0';
        int i15 = 290255894;
        int i16 = 11;
        int i17 = 0;
        if (cArr != null) {
            int i18 = f61069k + 69;
            f61070l = i18 % 128;
            int i19 = i18 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i20 = 0;
            while (i20 < length) {
                try {
                    Object[] objArr2 = new Object[i14];
                    objArr2[i17] = Integer.valueOf(cArr[i20]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i15));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (TypedValue.complexToFraction(i17, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(i17, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 45 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 1115 - TextUtils.indexOf("", c10, i17, i17));
                        byte b11 = (byte) i17;
                        Object[] objArr3 = new Object[1];
                        c((byte) i16, b11, b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i20] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i20++;
                    int i21 = f61069k + 23;
                    f61070l = i21 % 128;
                    int i22 = i21 % 2;
                    i14 = 1;
                    c10 = '0';
                    i15 = 290255894;
                    i16 = 11;
                    i17 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(f61066h)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 45 - (Process.myPid() >> 22), KeyEvent.normalizeMetaState(0) + 1116);
            byte b12 = (byte) 0;
            Object[] objArr5 = new Object[1];
            c((byte) 11, b12, b12, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
        } else {
            i11 = i10;
        }
        if (i11 > 1) {
            int i23 = f61070l + 39;
            f61069k = i23 % 128;
            int i24 = i23 % 2;
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i25 = setincludefontpadding.setDividerPadding;
                if (i25 >= i11) {
                    break;
                }
                char c11 = charArray[i25];
                setincludefontpadding.setY = c11;
                int i26 = i25 + 1;
                char c12 = charArray[i26];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c12;
                if (c11 == c12) {
                    int i27 = f61069k + 31;
                    f61070l = i27 % 128;
                    if (i27 % 2 == 0) {
                        cArr3[i25] = (char) (c11 << b10);
                        cArr3[i25 << 1] = (char) (c12 - b10);
                    } else {
                        cArr3[i25] = (char) (c11 - b10);
                        cArr3[i26] = (char) (c12 - b10);
                    }
                } else {
                    Object[] objArr6 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) TextUtils.getCapsMode("", 0, 0), 27 - View.resolveSize(0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 2311);
                        byte b13 = (byte) 0;
                        Object[] objArr7 = new Object[1];
                        c((byte) 8, b13, b13, objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i28 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i28) {
                        Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 == null) {
                            Class cls5 = (Class) setTextScaleX.setX((char) (49103 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 36, View.MeasureSpec.getMode(0) + 2545);
                            byte length2 = (byte) m.length;
                            byte b14 = (byte) (length2 - 4);
                            Object[] objArr9 = new Object[1];
                            c(length2, b14, b14, objArr9);
                            String str3 = (String) objArr9[0];
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod(str3, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i29 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i30 = setincludefontpadding.setDividerPadding;
                        cArr3[i30] = cArr[iIntValue2];
                        cArr3[i30 + 1] = cArr[i29];
                    } else {
                        int i31 = setincludefontpadding.setX;
                        int i32 = setincludefontpadding.setOnFocusChangeListener;
                        if (i31 == i32) {
                            int iA = androidx.activity.a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = androidx.activity.a.a(i28, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i33 = (i32 * cCharValue) + iA2;
                            int i34 = setincludefontpadding.setDividerPadding;
                            cArr3[i34] = cArr[(i31 * cCharValue) + iA];
                            cArr3[i34 + 1] = cArr[i33];
                        } else {
                            int i35 = (i31 * cCharValue) + i28;
                            int i36 = (i32 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i37 = setincludefontpadding.setDividerPadding;
                            cArr3[i37] = cArr[i35];
                            cArr3[i37 + 1] = cArr[i36];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
            }
        }
        for (int i38 = 0; i38 < i10; i38++) {
            int i39 = f61069k + 47;
            f61070l = i39 % 128;
            int i40 = i39 % 2;
            cArr3[i38] = (char) (cArr3[i38] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0182  */
    /* JADX WARN: Code duplicated, block: B:33:0x0183  */
    public static void b(String str, int i10, Object[] objArr) throws Throwable {
        int i11;
        Throwable cause;
        int i12 = f61070l + 79;
        int i13 = i12 % 128;
        f61069k = i13;
        char c10 = 2;
        int i14 = i12 % 2;
        f61069k = i13;
        char[] charArray = str.toCharArray();
        setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
        setlayoutanimation.setOnFocusChangeListener = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i15 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            int length2 = charArray.length;
            i11 = f61071n;
            if (i15 >= length2) {
                break;
            }
            char c11 = charArray[i15];
            try {
                Object[] objArr2 = new Object[3];
                objArr2[c10] = setlayoutanimation;
                objArr2[1] = setlayoutanimation;
                objArr2[0] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(-764403778);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getEdgeSlop() >> 16) + 33, (Process.myPid() >> 22) + 1195);
                    byte b10 = (byte) 0;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    c(b10, b11, b11, objArr3);
                    method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                    map.put(-764403778, method);
                }
                jArr[i15] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (f61064f ^ 1779209353347916695L);
                Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                Object method2 = map.get(645183118);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (ImageFormat.getBitsPerPixel(0) + 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 44, 728 - View.resolveSizeAndState(0, 0, 0));
                    byte b12 = (byte) (i11 & 11);
                    byte b13 = (byte) (b12 - 3);
                    Object[] objArr5 = new Object[1];
                    c(b12, b13, b13, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(645183118, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                c10 = 2;
            } catch (Throwable th2) {
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = new char[length];
        setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
        while (true) {
            int i16 = setlayoutanimation.setCompoundDrawableTintBlendMode;
            if (i16 >= charArray.length) {
                objArr[0] = new String(cArr);
                return;
            }
            cArr[i16] = (char) jArr[i16];
            Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(645183118);
            if (method3 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getFadingEdgeLength() >> 16) + 44, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 727);
                byte b14 = (byte) (i11 & 11);
                byte b15 = (byte) (b14 - 3);
                Object[] objArr7 = new Object[1];
                c(b14, b15, b15, objArr7);
                method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(645183118, method3);
            }
            ((Method) method3).invoke(null, objArr6);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r9 = r9 * 4
            int r9 = r9 + 1
            int r7 = 110 - r7
            byte[] r0 = new byte[r9]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.ti.m
            if (r2 != 0) goto L18
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            goto L34
        L18:
            r3 = r1
            r6 = r8
            r8 = r7
            r7 = r6
        L1c:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r0[r3] = r5
            if (r4 != r9) goto L2b
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L2b:
            r3 = r2[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r6
        L34:
            int r8 = r8 + r7
            int r7 = r9 + 1
            r9 = r10
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ti.c(int, int, short, java.lang.Object[]):void");
    }

    public static void d() {
        m = new byte[]{125, -24, -123, 69};
        f61071n = 71;
    }

    public static void e() {
        f61064f = -2275116359406164989L;
        f61066h = (char) 53959;
        f61065g = new char[]{59176, 59179, 59187, 58563, 59191, 59181, 59177, 59189, 59185, 59190, 58561, 59183, 59188, 59147, 59182, 59197, 59178, 59170, 59199, 59154, 59145, 59186, 59252, 59193, 59195, 59194, 59196, 58565, 59157, 58564, 58560, 59184, 59180, 59192, 59198, 58562};
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        ti tiVar = (ti) objArr[0];
        pw pwVar = (pw) objArr[1];
        String str = (String) objArr[2];
        int i13 = f61068j + 117;
        f61067i = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(pwVar, "");
        Intrinsics.checkNotNullParameter(str, "");
        mu.setCompoundDrawableTintBlendMode(new Object[]{180001, pwVar, null, 4}, -1968587119, 1968587120, 180001);
        if (pwVar.setY() != 201) {
            mr mrVar = mr.setOnFocusChangeListener;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr2 = new Object[1];
            b("蟁糭營皩殸悂敽婁彉吿䥒丛䋥䟌㲦ㆢ㚊⭠\u206f━ᨻἘᐊ࣠ආʋ", 64279 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), objArr2);
            sb2.append(((String) objArr2[0]).intern());
            sb2.append(pwVar.setY());
            mt.setX(new Object[]{sb2.toString()}, 1760239564, -1760239563, (int) System.currentTimeMillis());
            tiVar.f61076e.invoke(pwVar, 10069, UUID.fromString(str));
            throw new KotlinNothingValueException();
        }
        ye.Companion companion = ye.INSTANCE;
        ye yeVar = (ye) ye.Companion.setX(new Object[]{pwVar.setCompoundDrawableTintBlendMode()}, -1788511693, 1788511697, (int) System.currentTimeMillis());
        Object[] objArr3 = new Object[1];
        b("蟧ꈆ찈\uf607အ㨤搻踜ꡈ", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 9720, objArr3);
        String str2 = (String) ye.setCompoundDrawableTintBlendMode(new Object[]{yeVar, ((String) objArr3[0]).intern()}, 914142416, -914142409, System.identityHashCode(yeVar));
        if (str2 != null) {
            mr mrVar2 = mr.setChildDivider;
            StringBuilder sb3 = new StringBuilder();
            Object[] objArr4 = new Object[1];
            b("蟆Հ芅\u0ff7贿એ韁ᔦ鈼῟鴛ᩬꞽ─ꉌ⾮고⩵란㓅눯㽼벂㨀읩䒯수佖첫䧼휊", 33457 - Color.green(0), objArr4);
            sb3.append(((String) objArr4[0]).intern());
            sb3.append(str2);
            mt.setX(new Object[]{mrVar2, sb3.toString()}, 1819066882, -1819066874, (int) System.currentTimeMillis());
            int i15 = f61067i + 21;
            f61068j = i15 % 128;
            int i16 = i15 % 2;
        }
        JSONObject jSONObjectInvoke = tiVar.f61075d.invoke(pwVar, 10069, UUID.fromString(str));
        Object[] objArr5 = new Object[1];
        b("蟳狢淎墴县了㥧㑧⽉ᨨᔂ\u0006\ufaee\uf5cc\ue0b3", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 62742, objArr5);
        JSONObject jSONObject = jSONObjectInvoke.getJSONObject(((String) objArr5[0]).intern());
        Object[] objArr6 = new Object[1];
        b("蟽焛", TextUtils.lastIndexOf("", '0', 0, 0) + 63212, objArr6);
        UUID uuidFromString = UUID.fromString(jSONObjectInvoke.getString(((String) objArr6[0]).intern()));
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "");
        Object[] objArr7 = new Object[1];
        b("蟽焛", Process.getGidForName("") + 63212, objArr7);
        UUID uuidFromString2 = UUID.fromString(jSONObject.getString(((String) objArr7[0]).intern()));
        Intrinsics.checkNotNullExpressionValue(uuidFromString2, "");
        Intrinsics.checkNotNullExpressionValue(jSONObject, "");
        Object[] objArr8 = new Object[1];
        b("蟱歔庸䇁㕅ᢆ௪｀\ue292헲뤳겫鿩茤皎姘䴥ろ", 60589 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), objArr8);
        byte[] bArr = (byte[]) va.setX(new Object[]{jSONObject, ((String) objArr8[0]).intern()}, 1760386962, -1760386962, (int) System.currentTimeMillis());
        Object[] objArr9 = new Object[1];
        b("蟹䇢ெ헌", 50708 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr9);
        return new setOnFocusChangeListener(str, uuidFromString, uuidFromString2, bArr, (byte[]) va.setX(new Object[]{jSONObject, ((String) objArr9[0]).intern()}, -649889507, 649889508, (int) System.currentTimeMillis()));
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.mypinpad.tsdk.i.m9] */
    public static CompletableFuture setX(ti tiVar, byte[] bArr, so soVar, UUID uuid, String str, byte[] bArr2, UUID uuid2) throws Throwable {
        int i10 = f61067i + 81;
        f61068j = i10 % 128;
        int i11 = i10 % 2;
        tiVar.getClass();
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(soVar, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        final yk dividerPadding = tiVar.setDividerPadding(soVar, uuid, bArr, null, null, str, bArr2, uuid2);
        CompletableFuture completableFutureThenApply = CompletableFuture.supplyAsync(new Supplier() { // from class: com.mypinpad.tsdk.i.m9
            @Override // java.util.function.Supplier
            public final Object get() {
                yk ykVar = dividerPadding;
                int i12 = ti.f61067i + 99;
                ti.f61068j = i12 % 128;
                int i13 = i12 % 2;
                Intrinsics.checkNotNullParameter(ykVar, "");
                ss ssVar = ss.setCompoundDrawableTintBlendMode;
                pw compoundDrawableTintBlendMode = qj.setCompoundDrawableTintBlendMode((getPinPadPortrait) ss.setX(new Object[]{qj.setY(ykVar, TransactionNotAuthorisedReason.setY)}, -1384554940, 1384554946, (int) System.currentTimeMillis()));
                int i14 = ti.f61068j + 25;
                ti.f61067i = i14 % 128;
                if (i14 % 2 == 0) {
                    return compoundDrawableTintBlendMode;
                }
                throw null;
            }
        }).thenApply((Function) new v0(new n9(tiVar, uuid), 1));
        Intrinsics.checkNotNullExpressionValue(completableFutureThenApply, "");
        int i12 = f61068j;
        int i13 = i12 + 51;
        f61067i = i13 % 128;
        int i14 = i13 % 2;
        int i15 = i12 + 93;
        f61067i = i15 % 128;
        int i16 = i15 % 2;
        return completableFutureThenApply;
    }

    @NotNull
    public final setOnFocusChangeListener setCompoundDrawableTintBlendMode(@NotNull pw pwVar, @NotNull String str) {
        return (setOnFocusChangeListener) setDividerPadding(new Object[]{this, pwVar, str}, -1660614105, 1660614105, System.identityHashCode(this));
    }

    public /* synthetic */ ti(op opVar, String str, String str2, Function3 function3, Function3 function4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(opVar, str, str2, (i10 & 8) != 0 ? a.f61077p0 : function3, (i10 & 16) != 0 ? b.f61080p0 : function4);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\f\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0005\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\n\u001a\u0004\b\r\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u000e\u0010\u0013"}, d2 = {"Lcom/mypinpad/tsdk/i/ti$setOnFocusChangeListener;", "", "", "a", "Ljava/lang/String;", "setCompoundDrawableTintBlendMode", "()Ljava/lang/String;", "setDividerPadding", "Ljava/util/UUID;", "b", "Ljava/util/UUID;", "()Ljava/util/UUID;", "c", "setOnFocusChangeListener", "setX", "", "d", "[B", "setY", "()[B", "e", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;[B[B)V"}, k = 1, mv = {1, 8, 0})
    public static final class setOnFocusChangeListener {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f61081f = 0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f61082g = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String setDividerPadding;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final UUID setCompoundDrawableTintBlendMode;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final UUID setX;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final byte[] setY;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @Nullable
        public final byte[] setOnFocusChangeListener;

        public setOnFocusChangeListener(@NotNull String str, @NotNull UUID uuid, @NotNull UUID uuid2, @NotNull byte[] bArr, @Nullable byte[] bArr2) {
            Intrinsics.checkNotNullParameter(str, "");
            Intrinsics.checkNotNullParameter(uuid, "");
            Intrinsics.checkNotNullParameter(uuid2, "");
            Intrinsics.checkNotNullParameter(bArr, "");
            this.setDividerPadding = str;
            this.setCompoundDrawableTintBlendMode = uuid;
            this.setX = uuid2;
            this.setY = bArr;
            this.setOnFocusChangeListener = bArr2;
        }

        public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
            int i13 = ~i10;
            int i14 = ~i11;
            int i15 = (((~(i13 | i12)) | i14) * TypedValues.AttributesType.TYPE_PIVOT_TARGET) + (((~(i10 | i12)) | (~(i14 | i10))) * (-318)) + (((~(i11 | (~i12) | i10)) | (~(i13 | i14 | i12))) * (-318)) + (i11 * 319) + (i10 * (-317));
            if (i15 == 1) {
                setOnFocusChangeListener setonfocuschangelistener = (setOnFocusChangeListener) objArr[0];
                int i16 = f61082g;
                int i17 = i16 + 14;
                int i18 = (i17 ^ (-1)) + (i17 << 1);
                f61081f = i18 % 128;
                int i19 = i18 % 2;
                byte[] bArr = setonfocuschangelistener.setY;
                int i20 = (i16 & 31) + (i16 | 31);
                f61081f = i20 % 128;
                if (i20 % 2 == 0) {
                    return bArr;
                }
                int i21 = 21 / 0;
                return bArr;
            }
            if (i15 == 2) {
                setOnFocusChangeListener setonfocuschangelistener2 = (setOnFocusChangeListener) objArr[0];
                int i22 = f61082g + 61;
                int i23 = i22 % 128;
                f61081f = i23;
                int i24 = i22 % 2;
                String str = setonfocuschangelistener2.setDividerPadding;
                int i25 = i23 & 61;
                int i26 = i23 | 61;
                int i27 = ((i25 | i26) << 1) - (i25 ^ i26);
                f61082g = i27 % 128;
                if (i27 % 2 != 0) {
                    return str;
                }
                throw null;
            }
            if (i15 == 3) {
                setOnFocusChangeListener setonfocuschangelistener3 = (setOnFocusChangeListener) objArr[0];
                int i28 = f61081f;
                int i29 = ((i28 | 81) << 1) - (i28 ^ 81);
                int i30 = i29 % 128;
                f61082g = i30;
                int i31 = i29 % 2;
                byte[] bArr2 = setonfocuschangelistener3.setOnFocusChangeListener;
                int i32 = (((i30 | 115) << 1) - (~(-(((~i30) & 115) | (i30 & (-116)))))) - 1;
                f61081f = i32 % 128;
                int i33 = i32 % 2;
                return bArr2;
            }
            if (i15 == 4) {
                setOnFocusChangeListener setonfocuschangelistener4 = (setOnFocusChangeListener) objArr[0];
                int i34 = f61082g;
                int i35 = i34 & 119;
                int i36 = i35 + ((i34 ^ 119) | i35);
                f61081f = i36 % 128;
                int i37 = i36 % 2;
                UUID uuid = setonfocuschangelistener4.setX;
                if (i37 == 0) {
                    return uuid;
                }
                int i38 = 62 / 0;
                return uuid;
            }
            setOnFocusChangeListener setonfocuschangelistener5 = (setOnFocusChangeListener) objArr[0];
            int i39 = f61081f;
            int i40 = ((i39 ^ 112) + ((i39 & 112) << 1)) - 1;
            int i41 = i40 % 128;
            f61082g = i41;
            int i42 = i40 % 2;
            UUID uuid2 = setonfocuschangelistener5.setCompoundDrawableTintBlendMode;
            int i43 = i41 & 79;
            int i44 = -(-((i41 ^ 79) | i43));
            int i45 = (i43 ^ i44) + ((i44 & i43) << 1);
            f61081f = i45 % 128;
            int i46 = i45 % 2;
            return uuid2;
        }

        @JvmName(name = "setCompoundDrawableTintBlendMode")
        @NotNull
        public final String setCompoundDrawableTintBlendMode() {
            return (String) setOnFocusChangeListener(new Object[]{this}, 388383715, -388383713, System.identityHashCode(this));
        }

        @JvmName(name = "setDividerPadding")
        @NotNull
        public final UUID setDividerPadding() {
            return (UUID) setOnFocusChangeListener(new Object[]{this}, -1488568400, 1488568400, System.identityHashCode(this));
        }

        @JvmName(name = "setX")
        @Nullable
        public final byte[] setX() {
            return (byte[]) setOnFocusChangeListener(new Object[]{this}, -1484013095, 1484013098, System.identityHashCode(this));
        }

        @JvmName(name = "setY")
        @NotNull
        public final byte[] setY() {
            return (byte[]) setOnFocusChangeListener(new Object[]{this}, 1392057310, -1392057309, System.identityHashCode(this));
        }

        @JvmName(name = "setOnFocusChangeListener")
        @NotNull
        public final UUID setOnFocusChangeListener() {
            return (UUID) setOnFocusChangeListener(new Object[]{this}, -1770764320, 1770764324, System.identityHashCode(this));
        }
    }

    @NotNull
    public final yk setDividerPadding(@NotNull so soVar, @NotNull UUID uuid, @NotNull byte[] bArr, @Nullable byte[] bArr2, @Nullable byte[] bArr3, @Nullable String str, @Nullable byte[] bArr4, @Nullable UUID uuid2) throws Throwable {
        String strIntern;
        String str2;
        Object obj;
        Intrinsics.checkNotNullParameter(soVar, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        yk.setDividerPadding setdividerpadding = new yk.setDividerPadding();
        int i10 = f61068j + 21;
        f61067i = i10 % 128;
        int i11 = i10 % 2;
        int i12 = setX.setCompoundDrawableTintBlendMode[soVar.ordinal()];
        if (i12 == 1) {
            Object[] objArr = new Object[1];
            b("螻㦼צּ볮绗〣\uf1c3뎛甯㛏\ue87bꨎ段", 48731 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr);
            strIntern = ((String) objArr[0]).intern();
        } else if (i12 == 2) {
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getWindowTouchSlop() >> 8) + 11, "\u0012\u0004\u0013\u001e\u0012\n!\u0010\r\b㘔", (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 23), objArr2);
            strIntern = ((String) objArr2[0]).intern();
            int i13 = f61068j + 109;
            f61067i = i13 % 128;
            int i14 = i13 % 2;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        uo uoVar = uo.INSTANCE;
        Object[] objArr3 = new Object[1];
        a(View.resolveSizeAndState(0, 0, 0) + 10, "\u0013\t\u0005\u0006\u001f\r\"#\u0014\u0013", (byte) (TextUtils.indexOf("", "", 0) + 59), objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        String str3 = this.f61073b;
        yo.Companion companion = yo.INSTANCE;
        JSONObject jSONObject = new JSONObject();
        Object[] objArr4 = new Object[1];
        a(AndroidCharacter.getMirror('0') - '!', "\u0013\t\u0005\u0006\u001f\r\"#\u0016 \u0011\u000f\u001e\u0004㙣", (byte) (116 - TextUtils.lastIndexOf("", '0', 0)), objArr4);
        String strIntern3 = ((String) objArr4[0]).intern();
        JSONObject jSONObject2 = new JSONObject();
        Object[] objArr5 = new Object[1];
        b("蟽焛", (ViewConfiguration.getWindowTouchSlop() >> 8) + 63211, objArr5);
        JSONObject jSONObjectPut = jSONObject2.put(((String) objArr5[0]).intern(), uuid);
        Object[] objArr6 = new Object[1];
        a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9, "\u0013\t\u0005\u0006\u001f\r\"#\u0014\u0013", (byte) (59 - View.MeasureSpec.getMode(0)), objArr6);
        JSONObject jSONObjectPut2 = jSONObjectPut.put(((String) objArr6[0]).intern(), str3);
        Object[] objArr7 = new Object[1];
        a((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10, "\n!\t\u001e\u0001\u001a\b\u0006\u0014\u0013", (byte) (54 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), objArr7);
        String strIntern4 = ((String) objArr7[0]).intern();
        op opVar = this.f61072a;
        JSONObject jSONObjectPut3 = jSONObjectPut2.put(strIntern4, ((UUID) op.setX(new Object[]{opVar}, 917018311, -917018311, System.identityHashCode(opVar))).toString());
        Object[] objArr8 = new Object[1];
        a(Drawable.resolveOpacity(0, 0) + 17, "!\n\u0002\u0017\u0004\u0016\u0010 \u0005\u0006\u0013\u001f\u0010\u0005\r\u0018㘴", (byte) (53 - TextUtils.lastIndexOf("", '0', 0)), objArr8);
        String strIntern5 = ((String) objArr8[0]).intern();
        Boolean bool = mg.setCompoundDrawableTintBlendMode;
        Intrinsics.checkNotNullExpressionValue(bool, "");
        if (bool.booleanValue()) {
            int i15 = f61068j + 99;
            f61067i = i15 % 128;
            int i16 = i15 % 2;
            ss ssVar = ss.setCompoundDrawableTintBlendMode;
            str2 = (String) ux.setCompoundDrawableTintBlendMode(new Object[]{(byte[]) ss.setX(new Object[]{bArr}, -1453369223, 1453369225, (int) System.currentTimeMillis())}, -907784665, 907784665, (int) System.currentTimeMillis());
        } else {
            str2 = (String) ux.setCompoundDrawableTintBlendMode(new Object[]{bArr}, -907784665, 907784665, (int) System.currentTimeMillis());
            int i17 = f61068j + 35;
            f61067i = i17 % 128;
            int i18 = i17 % 2;
        }
        JSONObject jSONObjectPut4 = jSONObjectPut3.put(strIntern5, str2);
        if (bArr2 != null) {
            Object[] objArr9 = new Object[1];
            b("蟤硚碴", Color.rgb(0, 0, 0) + 16842663, objArr9);
            String strIntern6 = ((String) objArr9[0]).intern();
            JSONObject jSONObject3 = new JSONObject();
            Object[] objArr10 = new Object[1];
            a(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 8, "\u0007\u001f\u0010\u0005\r\u0018㙖", (byte) (88 - (ViewConfiguration.getTouchSlop() >> 8)), objArr10);
            JSONObject jSONObjectPut5 = jSONObject3.put(((String) objArr10[0]).intern(), (String) ux.setCompoundDrawableTintBlendMode(new Object[]{bArr2}, 1019201663, -1019201662, (int) System.currentTimeMillis()));
            Object[] objArr11 = new Object[1];
            a((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11, "\u001f\n\u001e\t\r\u0005\n#\u0013\f# ", (byte) (15 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), objArr11);
            String strIntern7 = ((String) objArr11[0]).intern();
            Intrinsics.checkNotNull(bArr3);
            JSONObject jSONObjectPut6 = jSONObjectPut5.put(strIntern7, (String) ux.setCompoundDrawableTintBlendMode(new Object[]{bArr3}, 1019201663, -1019201662, (int) System.currentTimeMillis()));
            Object[] objArr12 = new Object[1];
            b("蟠㥘搜믮", 48822 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr12);
            String strIntern8 = ((String) objArr12[0]).intern();
            Object[] objArr13 = new Object[1];
            b("蟇颠뤤\ud9b1﨨᪼㬥", 8059 - ExpandableListView.getPackedPositionGroup(0L), objArr13);
            jSONObjectPut4.put(strIntern6, jSONObjectPut6.put(strIntern8, ((String) objArr13[0]).intern()));
        }
        if (str != null) {
            Object[] objArr14 = new Object[1];
            a((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24, "\n\u001e\u0006\u0007\u0016!\u0001\u001d\u0002\u0016!\u0010\u001e\n\u001f\n\"#\u001a\u0010\u000b\u0015\u001e\n", (byte) (9 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), objArr14);
            jSONObjectPut4.put(((String) objArr14[0]).intern(), str);
        }
        if (bArr4 != null) {
            Object[] objArr15 = new Object[1];
            b("蟹䇢ெ헌", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 50706, objArr15);
            jSONObjectPut4.put(((String) objArr15[0]).intern(), (String) ux.setCompoundDrawableTintBlendMode(new Object[]{bArr4}, 1019201663, -1019201662, (int) System.currentTimeMillis()));
        }
        if (uuid2 != null) {
            int i19 = f61068j + 15;
            f61067i = i19 % 128;
            if (i19 % 2 != 0) {
                Object[] objArr16 = new Object[1];
                a(93 >> Drawable.resolveOpacity(0, 1), "\u001b\u001a\n#\u001f\u001a\r\u0017㙒", (byte) (107 << (PointF.length(0.0f, 2.0f) > 1.0f ? 1 : (PointF.length(0.0f, 2.0f) == 1.0f ? 0 : -1))), objArr16);
                obj = objArr16[0];
            } else {
                Object[] objArr17 = new Object[1];
                a(Drawable.resolveOpacity(0, 0) + 9, "\u001b\u001a\n#\u001f\u001a\r\u0017㙒", (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 84), objArr17);
                obj = objArr17[0];
            }
            jSONObjectPut4.put(((String) obj).intern(), uuid2.toString());
        }
        Unit unit = Unit.INSTANCE;
        String string = jSONObject.put(strIntern3, jSONObjectPut4).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        yj.setX setx = yj.setOnFocusChangeListener;
        Object[] objArr18 = new Object[1];
        b("蟵瑱絮\uf037狩\uf5ae桫\ueb03淕\ue096捈\ue64c壂\udb66帽탱", 32069 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr18);
        return (yk) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 721744858, -721744846, System.identityHashCode(setdividerpadding));
    }
}
