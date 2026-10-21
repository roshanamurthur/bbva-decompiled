package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.ConnectivityManager;
import android.net.ProxyInfo;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import bk.p;
import com.bbva.component.request.header.customerid.CustomerIdInterceptor;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.bbva.zoomauth.facialauth.FacialAuthFragment;
import com.mypinpad.tsdk.api.errors.TerminalException;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Future;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001Bk\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u000fJ\u0010\u00103\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J \u00107\u001a\u0002062\u0006\u00108\u001a\u0002092\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u00020<H\u0016J\u0012\u0010=\u001a\u0004\u0018\u00010>2\u0006\u0010?\u001a\u00020@H\u0002J\n\u0010A\u001a\u0004\u0018\u00010\u0003H\u0016J\u0010\u0010B\u001a\u0002092\u0006\u0010C\u001a\u00020DH\u0016J$\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020D2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010KH\u0002J\u0018\u0010L\u001a\u0002062\u0006\u0010M\u001a\u0002092\u0006\u0010;\u001a\u00020NH\u0016J\u001c\u0010O\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u0002090P2\u0006\u0010Q\u001a\u000204H\u0016J\u0018\u0010R\u001a\u00020S2\u0006\u0010Q\u001a\u0002042\u0006\u0010;\u001a\u00020<H\u0016J$\u0010T\u001a\u00020U2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020D2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010KH\u0002J0\u0010V\u001a\u00020W2\u0006\u0010;\u001a\u00020X2\u0006\u0010Y\u001a\u0002092\u0006\u0010Z\u001a\u0002092\u0006\u0010[\u001a\u0002092\u0006\u0010\\\u001a\u000209H\u0016J\"\u0010]\u001a\u00020^2\u0006\u0010!\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 2\b\u0010_\u001a\u0004\u0018\u00010`H\u0016J\u0010\u0010a\u001a\u00020@2\u0006\u0010b\u001a\u00020\u0003H\u0016J \u0010c\u001a\u00020d2\u0006\u0010;\u001a\u00020X2\u0006\u0010[\u001a\u0002092\u0006\u0010e\u001a\u00020\u0003H\u0016J$\u0010f\u001a\u00020^2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020D2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010KH\u0002J \u0010g\u001a\u00020h2\u0006\u0010;\u001a\u00020X2\u0006\u0010i\u001a\u00020K2\u0006\u0010j\u001a\u000209H\u0016R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0011\"\u0004\b\u001a\u0010\u0013R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0011\"\u0004\b\u001c\u0010\u0013R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u0082.¢\u0006\u0002\n\u0000R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b#\u0010\u0015\"\u0004\b$\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0011\"\u0004\b*\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0011\"\u0004\b,\u0010\u0013R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006k"}, d2 = {"Lcom/mypinpad/tsdk/internal/remote/SdkSecurityNetworkService;", "Lcom/mypinpad/security/integration/SecurityNetworkService;", "identityServiceUrl", "", "identityServiceSha256Pin", "", "identityServiceType", "Lcom/mypinpad/tsdk/internal/utils/EndpointUtils$IdentityEndpointType;", "timeoutMs", "", CustomerIdInterceptor.CLIENT_ID, "scope", "clientSecret", "baseUrl", "baseUrlSha256Pin", "(Ljava/lang/String;[Ljava/lang/String;Lcom/mypinpad/tsdk/internal/utils/EndpointUtils$IdentityEndpointType;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "getBaseUrl", "()Ljava/lang/String;", "setBaseUrl", "(Ljava/lang/String;)V", "getBaseUrlSha256Pin", "()[Ljava/lang/String;", "setBaseUrlSha256Pin", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "getClientId", "setClientId", "getClientSecret", "setClientSecret", "connectionManager", "Lcom/mypinpad/tsdk/internal/remote/ConnectionManager;", "context", "Landroid/content/Context;", "entropyProvider", "Lcom/mypinpad/security/integration/EntropyProvider;", "getIdentityServiceSha256Pin", "setIdentityServiceSha256Pin", "getIdentityServiceType", "()Lcom/mypinpad/tsdk/internal/utils/EndpointUtils$IdentityEndpointType;", "setIdentityServiceType", "(Lcom/mypinpad/tsdk/internal/utils/EndpointUtils$IdentityEndpointType;)V", "getIdentityServiceUrl", "setIdentityServiceUrl", "getScope", "setScope", "getTimeoutMs", "()J", "setTimeoutMs", "(J)V", "transactionService", "Lcom/mypinpad/tsdk/internal/terminal/authorisation/TransactionService;", "executeRequest", "Lcom/mypinpad/security/integration/Response;", "request", "Lcom/mypinpad/security/integration/Request;", "getAuthorizePinPurchaseRequest", "pinPayload", "", "encryptedPek", "session", "Lcom/mypinpad/security/integration/SecurityAuthorizePinSession;", "getContentType", "Lokhttp3/MediaType;", "encryptedEndpoint", "", "getCustomerId", "getEntropy", "size", "", "getJsonOrHandleUnexpectedResponse", "Lorg/json/JSONObject;", "httpNetworkResponse", "Lcom/mypinpad/tsdk/internal/remote/HttpNetworkResponse;", "internalErrorCode", "transactionId", "Ljava/util/UUID;", "getPadMaterialRequest", FacialAuthFragment.PUBLIC_KEY, "Lcom/mypinpad/security/integration/SecurityTransactionSession;", "getPadMaterialResponse", "Lkotlin/Pair;", DigipassManagerConstants.KEY_RESPONSE, "getPurchaseResult", "Lcom/mypinpad/security/integration/PurchaseResult;", "handleUnexpectedStatusCode", "", "initialAgreement", "Lcom/mypinpad/security/integration/InitialAgreementResponse;", "Lcom/mypinpad/security/integration/SecurityProvisionSession;", "instanceIdSignature", "instanceMutPubKey", "instanceEcdhPublicKey", "instanceEcdhSignature", "initialise", "", "logger", "Lcom/mypinpad/common/logging/Logger;", "isEncryptedEndpoint", "url", "newAgreement", "Lcom/mypinpad/security/integration/NewAgreementResponse;", "signature", "raiseErrorEvent", "rollAgreement", "Lcom/mypinpad/security/integration/RollAgreementResponse;", "keyId", "instanceEcdhPubKeyEncr", "sdk-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSdkSecurityNetworkService.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SdkSecurityNetworkService.kt\ncom/mypinpad/tsdk/internal/remote/SdkSecurityNetworkService\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 HttpNetworkResponse.kt\ncom/mypinpad/tsdk/internal/remote/HttpNetworkResponseKt\n+ 4 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n*L\n1#1,471:1\n1#2:472\n50#3,4:473\n54#3:485\n57#3,3:486\n7#4,8:477\n7#4,8:489\n*S KotlinDebug\n*F\n+ 1 SdkSecurityNetworkService.kt\ncom/mypinpad/tsdk/internal/remote/SdkSecurityNetworkService\n*L\n372#1:473,4\n372#1:485\n393#1:486,3\n372#1:477,8\n393#1:489,8\n*E\n"})
public final class qn implements getAmountFieldBgColor {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char[] f57890e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final char f57891f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final char f57892g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final char f57893h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final char f57894i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final char f57895j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f57896k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static int f57897l;
    public static int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f57898n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f57899o = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f57900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final pu f57901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public setRecyclerListener f57902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public ti f57903d;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a extends FunctionReferenceImpl implements Function3<pw, Integer, UUID, JSONObject> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final char[] f57904p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final char f57905q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f57906r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f57907s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final int f57908t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final byte[] f57909u0 = null;

        static {
            c();
            f57908t0 = 1;
            f57906r0 = 0;
            f57907s0 = 1;
            f57905q0 = (char) 53959;
            f57904p0 = new char[]{59190, 59157, 59185, 59186, 59251, 59171, 59194, 59184, 59183, 59182, 59144, 59252, 59176, 59170, 59155, 59150, 59189, 59177, 59198, 59193, 59145, 59199, 59167, 59156, 59153, 59188, 59191, 59159, 59180, 59192, 59179, 59250, 59154, 59196, 59232, 59181};
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public a(Object obj) throws Throwable {
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 33, "\u001e\u0015\u0006\u001a\r\u0018\u0011\u0016\f\u000f\n\f\u0014\u001b\u0015\f\f\u0016\u0000#\u0017\u0018\u0006\u0014\u0016\u0015\u0018\u0012\u001f\u0018\u0011\r㘽", (byte) (MotionEvent.axisFromString("") + 63), objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a((ViewConfiguration.getEdgeSlop() >> 16) + 128, "\u001e\u0015\u0006\u001a\r\u0018\u0011\u0016\f\u000f\n\f\u0014\u001b\u0015\f\f\u0016\u0000#\u0017\u0018\u0006\u0014\u0016\u0015\u0018\u0012\u001f\u0018\u0011\r\u0016\u0000\u001c\u0018\u0018\u0001\u0006\u0005\f\u001f\u0004\u000f\u0000\f\u0017\t\u0006\u000e\u0013\t\t\u0005\u000e\n\u0017\f\f\n\u001d\b\f\u0017\u0001\u0018\u0006\u0014\b\u0011㙤㙤\u001f\u0000\u0014\u0006\u001d\u001a\r\u000b\u0015\u0013\u0012\u0000\u001c\r\u0012\u0018#!\u001a\u0003\u000b\u001e\u0007\u0006\n\t\u0002\u001b\t\u0011\u000e!\u001c\u0004!\u0019\u001d\r#\t\u0000\u000e\u001c\r\u0006\u001d\u000b\u0016\u0005\u0013\u0014\u0001\u0017\u0018\n ", (byte) (118 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), objArr2);
            super(3, obj, qn.class, strIntern, ((String) objArr2[0]).intern(), 0);
        }

        public static void a(int i10, String str, byte b10, Object[] objArr) throws Throwable {
            int i11;
            boolean z10;
            char[] charArray = str.toCharArray();
            setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
            char[] cArr = f57904p0;
            int i12 = 290255894;
            int i13 = 7;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i14 = 0;
                while (i14 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i14])};
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(Integer.valueOf(i12));
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) Color.green(0), 46 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1116 - (Process.myPid() >> 22));
                            byte b11 = (byte) 0;
                            Object[] objArr3 = new Object[1];
                            b(b11, b11, (byte) i13, objArr3);
                            method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                            map.put(290255894, method);
                        }
                        cArr2[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        i14++;
                        i12 = 290255894;
                        i13 = 7;
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
            Object[] objArr4 = {Integer.valueOf(f57905q0)};
            Map map2 = setTextScaleX.setMaxEms;
            Object method2 = map2.get(290255894);
            if (method2 == null) {
                Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.getTrimmedLength("") + 45, 1116 - KeyEvent.normalizeMetaState(0));
                byte b12 = (byte) 0;
                Object[] objArr5 = new Object[1];
                b(b12, b12, (byte) 7, objArr5);
                method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                map2.put(290255894, method2);
            }
            char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
            char[] cArr3 = new char[i10];
            int i15 = i10 % 2;
            int i16 = f57908t0;
            int i17 = 2;
            if (i15 != 0) {
                int i18 = i16 + 1;
                int i19 = i18 % 128;
                if (i18 % 2 != 0) {
                    i11 = i10 + 65;
                    cArr3[i11] = (char) (charArray[i11] * b10);
                } else {
                    i11 = i10 - 1;
                    cArr3[i11] = (char) (charArray[i11] - b10);
                }
            } else {
                i11 = i10;
            }
            if (i11 > 1) {
                setincludefontpadding.setDividerPadding = 0;
                while (true) {
                    int i20 = setincludefontpadding.setDividerPadding;
                    if (i20 >= i11) {
                        break;
                    }
                    int i21 = i16 + 45;
                    int i22 = i21 % 128;
                    int i23 = i21 % i17;
                    char c10 = charArray[i20];
                    setincludefontpadding.setY = c10;
                    int i24 = i20 + 1;
                    char c11 = charArray[i24];
                    setincludefontpadding.setCompoundDrawableTintBlendMode = c11;
                    if (c10 == c11) {
                        int i25 = i16 + 83;
                        int i26 = i25 % 128;
                        if (i25 % i17 != 0) {
                            cArr3[i20] = (char) (c10 << b10);
                            cArr3[i20 << 1] = (char) (c11 >>> b10);
                        } else {
                            cArr3[i20] = (char) (c10 - b10);
                            cArr3[i24] = (char) (c11 - b10);
                        }
                        charArray = charArray;
                        z10 = true;
                    } else {
                        Object[] objArr6 = new Object[13];
                        objArr6[12] = setincludefontpadding;
                        objArr6[11] = Integer.valueOf(cCharValue);
                        objArr6[10] = setincludefontpadding;
                        objArr6[9] = setincludefontpadding;
                        objArr6[8] = Integer.valueOf(cCharValue);
                        objArr6[7] = setincludefontpadding;
                        objArr6[6] = setincludefontpadding;
                        objArr6[5] = Integer.valueOf(cCharValue);
                        objArr6[4] = setincludefontpadding;
                        objArr6[3] = setincludefontpadding;
                        objArr6[i17] = Integer.valueOf(cCharValue);
                        objArr6[1] = setincludefontpadding;
                        objArr6[0] = setincludefontpadding;
                        Map map3 = setTextScaleX.setMaxEms;
                        Object method3 = map3.get(180437302);
                        if (method3 == null) {
                            Class cls3 = (Class) setTextScaleX.setX((char) (Process.myTid() >> 22), 26 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (Process.myTid() >> 22) + 2311);
                            byte length2 = (byte) f57909u0.length;
                            byte b13 = (byte) (length2 - 4);
                            Object[] objArr7 = new Object[1];
                            b(b13, b13, length2, objArr7);
                            String str2 = (String) objArr7[0];
                            Class<?> cls4 = Integer.TYPE;
                            method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                            map3.put(180437302, method3);
                        }
                        int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                        int i27 = setincludefontpadding.setNavigationOnClickListener;
                        if (iIntValue == i27) {
                            Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                            Object method4 = map3.get(1989802713);
                            if (method4 == null) {
                                Class cls5 = (Class) setTextScaleX.setX((char) (49103 - TextUtils.getTrimmedLength("")), 34 - MotionEvent.axisFromString(""), Color.alpha(0) + 2545);
                                byte b14 = (byte) 0;
                                byte b15 = b14;
                                Object[] objArr9 = new Object[1];
                                b(b15, b15, b14, objArr9);
                                String str3 = (String) objArr9[0];
                                Class<?> cls6 = Integer.TYPE;
                                method4 = cls5.getMethod(str3, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                                map3.put(1989802713, method4);
                            }
                            int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                            int i28 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                            int i29 = setincludefontpadding.setDividerPadding;
                            cArr3[i29] = cArr[iIntValue2];
                            cArr3[i29 + 1] = cArr[i28];
                        } else {
                            int i30 = setincludefontpadding.setX;
                            int i31 = setincludefontpadding.setOnFocusChangeListener;
                            if (i30 == i31) {
                                int iA = androidx.activity.a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                                setincludefontpadding.setOnLongClickListener = iA;
                                int iA2 = androidx.activity.a.a(i27, cCharValue, 1, cCharValue);
                                setincludefontpadding.setNavigationOnClickListener = iA2;
                                int i32 = (i31 * cCharValue) + iA2;
                                int i33 = setincludefontpadding.setDividerPadding;
                                cArr3[i33] = cArr[(i30 * cCharValue) + iA];
                                cArr3[i33 + 1] = cArr[i32];
                            } else {
                                int i34 = (i30 * cCharValue) + i27;
                                int i35 = (i31 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                                int i36 = setincludefontpadding.setDividerPadding;
                                cArr3[i36] = cArr[i34];
                                z10 = true;
                                cArr3[i36 + 1] = cArr[i35];
                            }
                        }
                        z10 = true;
                    }
                    setincludefontpadding.setDividerPadding += 2;
                    charArray = charArray;
                    i17 = 2;
                }
            }
            int i37 = 0;
            while (i37 < i10) {
                cArr3[i37] = (char) (cArr3[i37] ^ 13722);
                i37++;
                int i38 = i16 + 25;
                int i39 = i38 % 128;
                int i40 = i38 % 2;
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(byte r7, int r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = 106 - r9
                int r7 = r7 * 4
                int r7 = 4 - r7
                int r8 = r8 * 3
                int r8 = 1 - r8
                byte[] r0 = new byte[r8]
                byte[] r1 = com.mypinpad.tsdk.i.qn.a.f57909u0
                r2 = 0
                if (r1 != 0) goto L18
                r9 = r7
                r3 = r1
                r4 = r2
                r1 = r0
                r0 = r10
                r10 = r8
                goto L30
            L18:
                r3 = r2
            L19:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r0[r3] = r5
                if (r4 != r8) goto L28
                java.lang.String r7 = new java.lang.String
                r7.<init>(r0, r2)
                r10[r2] = r7
                return
            L28:
                r3 = r1[r7]
                r6 = r10
                r10 = r8
                r8 = r3
                r3 = r1
                r1 = r0
                r0 = r6
            L30:
                int r7 = r7 + 1
                int r9 = r9 + r8
                r8 = r10
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.qn.a.b(byte, int, short, java.lang.Object[]):void");
        }

        public static void c() {
            f57909u0 = new byte[]{113, 16, 76, 90};
        }

        @NotNull
        public final JSONObject d(@NotNull pw pwVar, int i10, @Nullable UUID uuid) throws Throwable {
            int i11 = f57906r0 + 31;
            f57907s0 = i11 % 128;
            int i12 = i11 % 2;
            Intrinsics.checkNotNullParameter(pwVar, "");
            JSONObject onFocusChangeListener = qn.setOnFocusChangeListener((qn) this.receiver, pwVar, i10, uuid);
            int i13 = f57907s0 + 77;
            f57906r0 = i13 % 128;
            if (i13 % 2 != 0) {
                int i14 = 43 / 0;
            }
            return onFocusChangeListener;
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ JSONObject invoke(pw pwVar, Integer num, UUID uuid) throws Throwable {
            int i10 = f57907s0 + 121;
            f57906r0 = i10 % 128;
            int i11 = i10 % 2;
            JSONObject jSONObjectD = d(pwVar, num.intValue(), uuid);
            if (i11 != 0) {
                int i12 = 62 / 0;
            }
            int i13 = f57906r0 + 57;
            f57907s0 = i13 % 128;
            if (i13 % 2 != 0) {
                return jSONObjectD;
            }
            throw null;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function3 {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final long f57910p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static final int f57911q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static final int f57912r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static final byte[] f57913s0 = null;

        static {
            b();
            f57912r0 = 1;
            f57911q0 = 1;
            f57910p0 = -3166519339842962971L;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public b(Object obj) throws Throwable {
            Object[] objArr = new Object[1];
            a("߅ޭꙧ\uf33c䙦䆣\uec7c빩十ఠ፵\uea91깰夕롈ᝲ爛\uf5e1䔵䁫吶້ሉ\ued53꼸寖뻃ᘰ𣏕\uf4a8", ViewConfiguration.getMinimumFlingVelocity() >> 16, objArr);
            String strIntern = ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            a("﹙︱῍䪖꽏ꋵՕ崿ꫝ떊臭ে埬\ue0bf兡\uf424\u0082䱋개ꌽ궪띣ﬠฅ嚤\ue27c埪\uf566͍䴂ꊙꁭ걢렰林༖奴\ue3ce咑﮸ȟ仟ꎨꚍ꽦맳ﺢ\u0de5寊\ue4d0啐\uf8f7Ӎ侲ꁳ\ua7df뇰몣ｆሻ媌\ue64a䨞洛ޤ儰ꄑꐍ낭밇\ufdef፴嵅\ue718䣦﹛٢刕ꟴꪲ댑뷐\uf297ᆪ尜\ue8ac䦈ﲽऻ叮ꑟꯨ떆뺒\uf345ᛈ廭\ue9f0乌\ufdecௐ啳ꕚ\ua878뒽聅\uf028ᜟ憨\ueb28伽쉠\u0a4f嘘鮖ꥏ띖脾\uf6e5ᐊ", 1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr2);
            super(3, obj, qn.class, strIntern, ((String) objArr2[0]).intern(), 0);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0113 A[Catch: all -> 0x0140, TryCatch #0 {all -> 0x0140, blocks: (B:8:0x003f, B:12:0x009d, B:14:0x00ac, B:24:0x0136, B:17:0x00c2, B:21:0x010c, B:23:0x0113, B:27:0x0142, B:11:0x0066), top: B:38:0x003f }] */
        /* JADX WARN: Code duplicated, block: B:27:0x0142 A[Catch: all -> 0x0140, TRY_LEAVE, TryCatch #0 {all -> 0x0140, blocks: (B:8:0x003f, B:12:0x009d, B:14:0x00ac, B:24:0x0136, B:17:0x00c2, B:21:0x010c, B:23:0x0113, B:27:0x0142, B:11:0x0066), top: B:38:0x003f }] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0148 -> B:29:0x0154). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void a(java.lang.String r23, int r24, java.lang.Object[] r25) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 379
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.qn.b.a(java.lang.String, int, java.lang.Object[]):void");
        }

        public static void b() {
            f57913s0 = new byte[]{Constants.FCI_TEMPLATE, 62, -91, 75};
        }

        @NotNull
        public final Void c(@NotNull pw pwVar, int i10, @Nullable UUID uuid) {
            Intrinsics.checkNotNullParameter(pwVar, "");
            qn.setY((qn) this.receiver, pwVar, i10, uuid);
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function3
        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            int i10 = f57911q0;
            int i11 = i10 + 101;
            int i12 = i11 % 128;
            int i13 = i11 % 2;
            Void voidC = c((pw) obj, ((Number) obj2).intValue(), (UUID) obj3);
            int i14 = i10 + 71;
            int i15 = i14 % 128;
            if (i14 % 2 != 0) {
                int i16 = 53 / 0;
            }
            return voidC;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Pair;", "", "", "Lcom/mypinpad/tsdk/internal/remote/ProxySetting;", "invoke", "()Lkotlin/Pair;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    public static final class c extends Lambda implements Function0<Pair<? extends String, ? extends Integer>> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f57914q0 = 0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f57915r0 = 1;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Context f57916p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Context context) {
            super(0);
            this.f57916p0 = context;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0052  */
        /* JADX WARN: Code duplicated, block: B:12:0x0058  */
        /* JADX WARN: Code duplicated, block: B:14:0x0089  */
        /* JADX WARN: Code duplicated, block: B:21:? A[RETURN, SYNTHETIC] */
        public static /* synthetic */ Pair a(Object[] objArr, int i10, int i11, int i12) {
            ProxyInfo defaultProxy;
            Pair pair;
            int i13;
            int i14 = ~i11;
            int i15 = ~i12;
            if ((((~(i10 | i12)) | (~((~i10) | i15)) | (~(i11 | i12))) * 831) + ((~(i14 | i10 | i12)) * (-1662)) + (((~(i14 | i15)) | (~(i10 | i11 | i12))) * (-831)) + (i11 * 832) + (i10 * (-830)) == 1) {
                c cVar = (c) objArr[0];
                int i16 = f57914q0;
                int i17 = (i16 & 5) + (i16 | 5);
                f57915r0 = i17 % 128;
                int i18 = i17 % 2;
                Pair pairA = a(new Object[]{cVar}, 815323155, -815323155, System.identityHashCode(cVar));
                int i19 = f57914q0 + 29;
                f57915r0 = i19 % 128;
                if (i19 % 2 != 0) {
                    return pairA;
                }
                throw null;
            }
            c cVar2 = (c) objArr[0];
            int i20 = f57914q0;
            int i21 = i20 & 111;
            int i22 = (i20 ^ 111) | i21;
            int i23 = (i21 & i22) + (i22 | i21);
            f57915r0 = i23 % 128;
            int i24 = i23 % 2;
            ConnectivityManager connectivityManager = (ConnectivityManager) cVar2.f57916p0.getSystemService(ConnectivityManager.class);
            if (i24 == 0) {
                int i25 = 10 / 0;
                if (connectivityManager != null) {
                    defaultProxy = connectivityManager.getDefaultProxy();
                    if (defaultProxy != null) {
                        String host = defaultProxy.getHost();
                        Intrinsics.checkNotNullExpressionValue(host, "");
                        pair = new Pair(host, Integer.valueOf(defaultProxy.getPort()));
                        int i26 = f57915r0;
                        int i27 = i26 & 53;
                        int i28 = ((i26 ^ 53) | i27) << 1;
                        int i29 = -((i26 | 53) & (~i27));
                        i13 = ((i28 | i29) << 1) - (i29 ^ i28);
                        f57914q0 = i13 % 128;
                        if (i13 % 2 != 0) {
                            return pair;
                        }
                        int i30 = 3 / 0;
                        return pair;
                    }
                }
            } else if (connectivityManager != null) {
                defaultProxy = connectivityManager.getDefaultProxy();
                if (defaultProxy != null) {
                    String host2 = defaultProxy.getHost();
                    Intrinsics.checkNotNullExpressionValue(host2, "");
                    pair = new Pair(host2, Integer.valueOf(defaultProxy.getPort()));
                    int i210 = f57915r0;
                    int i211 = i210 & 53;
                    int i212 = ((i210 ^ 53) | i211) << 1;
                    int i213 = -((i210 | 53) & (~i211));
                    i13 = ((i212 | i213) << 1) - (i213 ^ i212);
                    f57914q0 = i13 % 128;
                    if (i13 % 2 != 0) {
                        return pair;
                    }
                    int i31 = 3 / 0;
                    return pair;
                }
            }
            int i32 = f57915r0;
            int i33 = (-2) - ((((i32 | 86) << 1) - (i32 ^ 86)) ^ (-1));
            f57914q0 = i33 % 128;
            int i34 = i33 % 2;
            return null;
        }

        @Override // kotlin.jvm.functions.Function0
        public final /* synthetic */ Pair<? extends String, ? extends Integer> invoke() {
            return a(new Object[]{this}, 984992610, -984992609, System.identityHashCode(this));
        }
    }

    public /* synthetic */ class d extends AdaptedFunctionReference implements Function2<pw, Integer, JSONObject> {
        public static final byte[] E0 = null;
        public static final long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static int f57917w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static int f57918x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static final int f57919y0;

        static {
            c();
            f57919y0 = 1;
            f57917w0 = 0;
            f57918x0 = 1;
            v0 = -7060452991482421313L;
        }

        /* JADX WARN: Code duplicated, block: B:32:0x0177  */
        /* JADX WARN: Code duplicated, block: B:33:0x0178  */
        public static void a(String str, int i10, Object[] objArr) throws Throwable {
            Throwable cause;
            int i11 = f57919y0;
            int i12 = i11 + 57;
            int i13 = i12 % 128;
            char c10 = 2;
            int i14 = i12 % 2;
            int i15 = i11 + 49;
            int i16 = i15 % 128;
            int i17 = i15 % 2;
            char[] charArray = str.toCharArray();
            setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
            setlayoutanimation.setOnFocusChangeListener = i10;
            int length = charArray.length;
            long[] jArr = new long[length];
            int i18 = 0;
            setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
            while (true) {
                int i19 = setlayoutanimation.setCompoundDrawableTintBlendMode;
                if (i19 >= charArray.length) {
                    break;
                }
                char c11 = charArray[i19];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[c10] = setlayoutanimation;
                    objArr2[1] = setlayoutanimation;
                    objArr2[i18] = Integer.valueOf(c11);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-764403778);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (TypedValue.complexToFloat(i18) > 0.0f ? 1 : (TypedValue.complexToFloat(i18) == 0.0f ? 0 : -1)), 33 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (TypedValue.complexToFloat(i18) > 0.0f ? 1 : (TypedValue.complexToFloat(i18) == 0.0f ? 0 : -1)) + 1195);
                        byte b10 = (byte) 1;
                        byte b11 = (byte) (b10 - 1);
                        Object[] objArr3 = new Object[1];
                        b(b10, b11, b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                        map.put(-764403778, method);
                    }
                    jArr[i19] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() ^ (v0 ^ 1779209353347916695L);
                    Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                    Object method2 = map.get(645183118);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 44 - KeyEvent.keyCodeFromString(""), View.MeasureSpec.getMode(0) + 728);
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        b(b12, b13, b13, objArr5);
                        method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                        map.put(645183118, method2);
                    }
                    ((Method) method2).invoke(null, objArr4);
                    c10 = 2;
                    i18 = 0;
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
                int i20 = setlayoutanimation.setCompoundDrawableTintBlendMode;
                if (i20 >= charArray.length) {
                    String str2 = new String(cArr);
                    int i21 = i11 + 117;
                    int i22 = i21 % 128;
                    int i23 = i21 % 2;
                    objArr[0] = str2;
                    return;
                }
                cArr[i20] = (char) jArr[i20];
                Object[] objArr6 = {setlayoutanimation, setlayoutanimation};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(645183118);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 44, TextUtils.getOffsetAfter("", 0) + 728);
                    byte b14 = (byte) 0;
                    byte b15 = b14;
                    Object[] objArr7 = new Object[1];
                    b(b14, b15, b15, objArr7);
                    method3 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(645183118, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0026  */
        /* JADX WARN: Code duplicated, block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(int r5, short r6, short r7, java.lang.Object[] r8) {
            /*
                int r7 = r7 * 2
                int r0 = 1 - r7
                int r6 = r6 * 2
                int r6 = r6 + 4
                int r5 = r5 * 3
                int r5 = r5 + 107
                byte[] r0 = new byte[r0]
                r1 = 0
                int r7 = 0 - r7
                byte[] r2 = com.mypinpad.tsdk.i.qn.d.E0
                if (r2 != 0) goto L18
                r4 = r6
                r3 = r1
                goto L2a
            L18:
                r3 = r1
            L19:
                byte r4 = (byte) r5
                r0[r3] = r4
                if (r3 != r7) goto L26
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r1)
                r8[r1] = r5
                return
            L26:
                int r3 = r3 + 1
                r4 = r2[r6]
            L2a:
                int r6 = r6 + 1
                int r5 = r5 + r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.qn.d.b(int, short, short, java.lang.Object[]):void");
        }

        public static void c() {
            E0 = new byte[]{58, 74, 17, 39};
        }

        @NotNull
        public final JSONObject d(@NotNull pw pwVar, int i10) throws Throwable {
            int i11 = f57917w0 + 37;
            f57918x0 = i11 % 128;
            int i12 = i11 % 2;
            Intrinsics.checkNotNullParameter(pwVar, "");
            int i13 = f57917w0 + 19;
            f57918x0 = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            JSONObject jSONObjectE = qn.e(pwVar, i10);
            int i14 = f57918x0 + 41;
            f57917w0 = i14 % 128;
            int i15 = i14 % 2;
            return jSONObjectE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ JSONObject invoke(pw pwVar, Integer num) throws Throwable {
            int i10 = f57918x0 + 83;
            f57917w0 = i10 % 128;
            int i11 = i10 % 2;
            JSONObject jSONObjectD = d(pwVar, num.intValue());
            if (i11 != 0) {
                int i12 = 79 / 0;
            }
            int i13 = f57918x0 + 117;
            f57917w0 = i13 % 128;
            if (i13 % 2 == 0) {
                return jSONObjectD;
            }
            throw null;
        }
    }

    public /* synthetic */ class e extends AdaptedFunctionReference implements Function2 {
        public static int E0;
        public static final byte[] F0 = null;
        public static final long v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static int f57920w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static int f57921x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static int f57922y0;

        static {
            b();
            f57922y0 = 0;
            E0 = 1;
            f57920w0 = 0;
            f57921x0 = 1;
            v0 = 7006258800707441893L;
        }

        /* JADX WARN: Code duplicated, block: B:24:0x0102 A[Catch: all -> 0x0136, TryCatch #0 {all -> 0x0136, blocks: (B:8:0x003c, B:12:0x0063, B:13:0x009a, B:15:0x00a9, B:25:0x0124, B:18:0x00bd, B:22:0x00fd, B:24:0x0102, B:30:0x013d), top: B:41:0x003c }] */
        /* JADX WARN: Code duplicated, block: B:29:0x0138  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x013f -> B:32:0x014a). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void a(java.lang.String r21, int r22, java.lang.Object[] r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 368
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.qn.e.a(java.lang.String, int, java.lang.Object[]):void");
        }

        public static void b() {
            F0 = new byte[]{Constants.CVR_B1b85_0110_TERMINAL, UtilitiesSDKConstants.SRP_LABEL_ENC, -21, -9};
        }

        @NotNull
        public final void c(@NotNull pw pwVar, int i10) {
            Intrinsics.checkNotNullParameter(pwVar, "");
            int i11 = f57921x0;
            int i12 = i11 + 123;
            f57920w0 = i12 % 128;
            int i13 = i12 % 2;
            Object obj = this.receiver;
            int i14 = i11 + 45;
            f57920w0 = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 28 / 0;
            }
            qn.g(pwVar, i10);
            throw new KotlinNothingValueException();
        }

        @Override // kotlin.jvm.functions.Function2
        public final /* synthetic */ Object invoke(Object obj, Object obj2) {
            int i10 = f57920w0 + 125;
            f57921x0 = i10 % 128;
            int i11 = i10 % 2;
            c((pw) obj, ((Number) obj2).intValue());
            throw null;
        }
    }

    static {
        d();
        m = 0;
        f57898n = 1;
        f57896k = 0;
        f57897l = 1;
        f57891f = (char) 53956;
        f57890e = new char[]{59190, 59179, 59199, 59183, 59189, 59194, 59252, 59177, 59195, 59193, 59186, 59184, 59176, 59144, 59185, 59170, 59147, 59151, 59188, 59191, 59196, 59192, 59198, 59154, 59156};
        f57895j = (char) 18698;
        f57894i = (char) 55261;
        f57892g = (char) 39835;
        f57893h = (char) 13206;
    }

    @JvmOverloads
    public qn(@NotNull String str, @NotNull String[] strArr, @NotNull um.setX setx, long j10, @NotNull String str2, @NotNull String str3, @NotNull String str4, @NotNull String str5, @NotNull String[] strArr2) throws Throwable {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(strArr, "");
        Intrinsics.checkNotNullParameter(setx, "");
        Intrinsics.checkNotNullParameter(str2, "");
        Intrinsics.checkNotNullParameter(str3, "");
        Intrinsics.checkNotNullParameter(str4, "");
        Intrinsics.checkNotNullParameter(str5, "");
        Intrinsics.checkNotNullParameter(strArr2, "");
        this.f57900a = str5;
        Object[] objArr = new Object[1];
        d.a("籏Ⱎ\udcfa貛㴗\uedd8鶴丢ﻂ꺋彷࿗뾨桳ᣇ좠祶⧎\ud986話㨱\uea84魾䬸ﮄꑡ吣Қ때攠ᗼ왖瘭", Process.getGidForName("") + 20564, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        d.a("籏츮ᢚ歋뗗ި刔鳒\uef42㤛讗혇⃨獃봧ྰ婶ꓞ\uf6a6䄁鏱\ude54⣞窨씄៑扃갪ﺌ䥰鯜\ue5a6〭苃쵂ῂ榫됊ڵ児ꌩ\ued83㡿諧한✮熆밪໌墨\uab1a\uf5fa䀛鈾\udca4⼙秥쑑ᘨ悘데\ufd90侠騐\ue485㝤臚펤ṋ棏뭎ԩ垀ꉝ\uecd3㽝褻\udb80♰烎슊ഞ忭ꩁ\uf43b䚙鄙\ue3e8⸛砊쪪ᕳ柝놩ﰓ人饽\uebdf㖧耍튫ᵲ漏릴є嚈ꃿ\uf305㶃衽\udac5⓪眒쇨\u0c51帿\ua8dbﭝ䗙遢\ue20eⲬ罤짓᮹昜냦̎", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 45666, objArr2);
        d dVar = new d(2, this, qn.class, strIntern, ((String) objArr2[0]).intern(), 0);
        Object[] objArr3 = new Object[1];
        e.a("\ue907\ue96f瘰乫ጽꀤ挧࣮ঃ潷㈮脖⢲豂儓拵䯜겶灮䏬櫴춞青ⓔ跺\uea81래ַ갓\u0bff", ViewConfiguration.getScrollBarFadeDuration() >> 16, objArr3);
        String strIntern2 = ((String) objArr3[0]).intern();
        Object[] objArr4 = new Object[1];
        e.a("۹ڑ䚼继ꖮ㦻햴酱\ue67d忻蒽ᢉ음볎\ue780ﭪꐢ鰺웽\uda73蔊ﴒ⇁뵋戄\uda0dċ鰨䏭㭳恸缣\u20c2ᡁ䌕幘ǔ禿ꉰ㻶\ueebf暮赉ǃ쿆䞂\uec43\ue0ab꽪꒡쾱쎹豭藃⺒ꊑ浐\ue2d2ধ蕵䨬숻棿摛⬄⍁䯰䝃ࠍvꬎ☺\ue9e5慩訇क훂乤锕\ue9fc랱꾡\uf476죤钼賝흩꯳疛\ued9f㚾誦唦쫣ᆤ涆㉍⮁炭䲢፰ଂ去⼶\uf01d栴닉๑턈䥙鷜ᄮ뻯뙩ﵷ\uf001鿶靏\udc04퍄", ViewConfiguration.getFadingEdgeLength() >> 16, objArr4);
        this.f57901b = qj.setDividerPadding(str5, strArr2, str, strArr, setx, j10, str2, str3, str4, dVar, new e(2, this, qn.class, strIntern2, ((String) objArr4[0]).intern(), 0));
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0131  */
    /* JADX WARN: Code duplicated, block: B:39:0x014c  */
    /* JADX WARN: Code duplicated, block: B:44:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:49:0x0211  */
    /* JADX WARN: Code duplicated, block: B:52:0x025e  */
    /* JADX WARN: Code duplicated, block: B:53:0x025f A[Catch: all -> 0x008e, TryCatch #0 {all -> 0x008e, blocks: (B:7:0x0028, B:11:0x0077, B:10:0x003d, B:17:0x0094, B:21:0x00e4, B:40:0x014e, B:45:0x01a2, B:46:0x0200, B:50:0x021d, B:54:0x02c3, B:53:0x025f, B:20:0x00ad), top: B:70:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:58:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:59:0x0311  */
    public static void a(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        Map map;
        Object method;
        int iIntValue;
        int i12;
        int i13;
        int i14;
        Object method2;
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = f57890e;
        int i15 = 2;
        int i16 = 290255894;
        int i17 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i18 = 0;
            while (i18 < length) {
                int i19 = m + 65;
                f57898n = i19 % 128;
                int i20 = i19 % i15;
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i17] = Integer.valueOf(cArr[i18]);
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method3 = map2.get(Integer.valueOf(i16));
                    if (method3 == null) {
                        Class cls = (Class) setTextScaleX.setX((char) View.MeasureSpec.getMode(i17), TextUtils.lastIndexOf("", '0') + 46, 1116 - View.MeasureSpec.makeMeasureSpec(i17, i17));
                        byte b11 = (byte) i17;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        c(b11, b12, b12, objArr3);
                        method3 = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map2.put(290255894, method3);
                    }
                    cArr2[i18] = ((Character) ((Method) method3).invoke(null, objArr2)).charValue();
                    i18++;
                    i15 = 2;
                    i16 = 290255894;
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
        Object[] objArr4 = {Integer.valueOf(f57891f)};
        Map map3 = setTextScaleX.setMaxEms;
        Object method4 = map3.get(290255894);
        if (method4 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) Color.blue(0), View.MeasureSpec.getMode(0) + 45, View.MeasureSpec.makeMeasureSpec(0, 0) + 1116);
            byte b13 = (byte) 0;
            byte b14 = b13;
            Object[] objArr5 = new Object[1];
            c(b13, b14, b14, objArr5);
            method4 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map3.put(290255894, method4);
        }
        char cCharValue = ((Character) ((Method) method4).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
        } else {
            i11 = i10;
        }
        char c10 = 7;
        if (i11 > 1) {
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i21 = setincludefontpadding.setDividerPadding;
                if (i21 >= i11) {
                    break;
                }
                int i22 = f57898n;
                int i23 = i22 + 45;
                m = i23 % 128;
                if (i23 % 2 != 0) {
                    char c11 = charArray[i21];
                    setincludefontpadding.setY = c11;
                    char c12 = charArray[i21 >> 1];
                    setincludefontpadding.setCompoundDrawableTintBlendMode = c12;
                    if (c11 == c12) {
                        int i24 = i22 + 81;
                        m = i24 % 128;
                        int i25 = i24 % 2;
                        cArr3[i21] = (char) (setincludefontpadding.setY - b10);
                        cArr3[i21 + 1] = (char) (setincludefontpadding.setCompoundDrawableTintBlendMode - b10);
                    } else {
                        Object[] objArr6 = new Object[13];
                        objArr6[12] = setincludefontpadding;
                        objArr6[11] = Integer.valueOf(cCharValue);
                        objArr6[10] = setincludefontpadding;
                        objArr6[9] = setincludefontpadding;
                        objArr6[8] = Integer.valueOf(cCharValue);
                        objArr6[c10] = setincludefontpadding;
                        objArr6[6] = setincludefontpadding;
                        objArr6[5] = Integer.valueOf(cCharValue);
                        objArr6[4] = setincludefontpadding;
                        objArr6[3] = setincludefontpadding;
                        objArr6[2] = Integer.valueOf(cCharValue);
                        objArr6[1] = setincludefontpadding;
                        objArr6[0] = setincludefontpadding;
                        map = setTextScaleX.setMaxEms;
                        method = map.get(180437302);
                        if (method == null) {
                            Class cls3 = (Class) setTextScaleX.setX((char) Drawable.resolveOpacity(0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 27, View.resolveSize(0, 0) + 2311);
                            byte b15 = (byte) 3;
                            byte b16 = (byte) (b15 - 3);
                            Object[] objArr7 = new Object[1];
                            c(b15, b16, b16, objArr7);
                            String str2 = (String) objArr7[0];
                            Class<?> cls4 = Integer.TYPE;
                            method = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                            map.put(180437302, method);
                        }
                        iIntValue = ((Integer) ((Method) method).invoke(null, objArr6)).intValue();
                        i12 = setincludefontpadding.setNavigationOnClickListener;
                        if (iIntValue == i12) {
                            int i26 = m + 51;
                            f57898n = i26 % 128;
                            int i27 = i26 % 2;
                            Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                            method2 = map.get(1989802713);
                            if (method2 != null) {
                                Class cls5 = (Class) setTextScaleX.setX((char) (TextUtils.getTrimmedLength("") + 49103), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 35, 2546 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                byte b17 = (byte) 0;
                                Object[] objArr9 = new Object[1];
                                c((byte) 7, b17, b17, objArr9);
                                String str3 = (String) objArr9[0];
                                Class<?> cls6 = Integer.TYPE;
                                method2 = cls5.getMethod(str3, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                                map.put(1989802713, method2);
                            }
                            int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr8)).intValue();
                            int i28 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                            int i29 = setincludefontpadding.setDividerPadding;
                            cArr3[i29] = cArr[iIntValue2];
                            cArr3[i29 + 1] = cArr[i28];
                        } else {
                            i13 = setincludefontpadding.setX;
                            i14 = setincludefontpadding.setOnFocusChangeListener;
                            if (i13 == i14) {
                                int iA = androidx.activity.a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                                setincludefontpadding.setOnLongClickListener = iA;
                                int iA2 = androidx.activity.a.a(i12, cCharValue, 1, cCharValue);
                                setincludefontpadding.setNavigationOnClickListener = iA2;
                                int i30 = (i14 * cCharValue) + iA2;
                                int i31 = setincludefontpadding.setDividerPadding;
                                cArr3[i31] = cArr[(i13 * cCharValue) + iA];
                                cArr3[i31 + 1] = cArr[i30];
                                int i32 = f57898n + 69;
                                m = i32 % 128;
                                int i33 = i32 % 2;
                            } else {
                                int i34 = (i13 * cCharValue) + i12;
                                int i35 = (i14 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                                int i36 = setincludefontpadding.setDividerPadding;
                                cArr3[i36] = cArr[i34];
                                cArr3[i36 + 1] = cArr[i35];
                            }
                        }
                    }
                } else {
                    char c13 = charArray[i21];
                    setincludefontpadding.setY = c13;
                    char c14 = charArray[i21 + 1];
                    setincludefontpadding.setCompoundDrawableTintBlendMode = c14;
                    if (c13 == c14) {
                        int i210 = i22 + 81;
                        m = i210 % 128;
                        int i211 = i210 % 2;
                        cArr3[i21] = (char) (setincludefontpadding.setY - b10);
                        cArr3[i21 + 1] = (char) (setincludefontpadding.setCompoundDrawableTintBlendMode - b10);
                    } else {
                        Object[] objArr10 = new Object[13];
                        objArr10[12] = setincludefontpadding;
                        objArr10[11] = Integer.valueOf(cCharValue);
                        objArr10[10] = setincludefontpadding;
                        objArr10[9] = setincludefontpadding;
                        objArr10[8] = Integer.valueOf(cCharValue);
                        objArr10[c10] = setincludefontpadding;
                        objArr10[6] = setincludefontpadding;
                        objArr10[5] = Integer.valueOf(cCharValue);
                        objArr10[4] = setincludefontpadding;
                        objArr10[3] = setincludefontpadding;
                        objArr10[2] = Integer.valueOf(cCharValue);
                        objArr10[1] = setincludefontpadding;
                        objArr10[0] = setincludefontpadding;
                        map = setTextScaleX.setMaxEms;
                        method = map.get(180437302);
                        if (method == null) {
                            Class cls7 = (Class) setTextScaleX.setX((char) Drawable.resolveOpacity(0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 27, View.resolveSize(0, 0) + 2311);
                            byte b18 = (byte) 3;
                            byte b19 = (byte) (b18 - 3);
                            Object[] objArr11 = new Object[1];
                            c(b18, b19, b19, objArr11);
                            String str4 = (String) objArr11[0];
                            Class<?> cls8 = Integer.TYPE;
                            method = cls7.getMethod(str4, Object.class, Object.class, cls8, Object.class, Object.class, cls8, Object.class, Object.class, cls8, Object.class, Object.class, cls8, Object.class);
                            map.put(180437302, method);
                        }
                        iIntValue = ((Integer) ((Method) method).invoke(null, objArr10)).intValue();
                        i12 = setincludefontpadding.setNavigationOnClickListener;
                        if (iIntValue == i12) {
                            int i212 = m + 51;
                            f57898n = i212 % 128;
                            int i213 = i212 % 2;
                            Object[] objArr12 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                            method2 = map.get(1989802713);
                            if (method2 != null) {
                                Class cls9 = (Class) setTextScaleX.setX((char) (TextUtils.getTrimmedLength("") + 49103), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 35, 2546 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                                byte b110 = (byte) 0;
                                Object[] objArr13 = new Object[1];
                                c((byte) 7, b110, b110, objArr13);
                                String str5 = (String) objArr13[0];
                                Class<?> cls10 = Integer.TYPE;
                                method2 = cls9.getMethod(str5, Object.class, Object.class, cls10, cls10, Object.class, Object.class, cls10, cls10, Object.class, cls10, Object.class);
                                map.put(1989802713, method2);
                            }
                            int iIntValue3 = ((Integer) ((Method) method2).invoke(null, objArr12)).intValue();
                            int i214 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                            int i215 = setincludefontpadding.setDividerPadding;
                            cArr3[i215] = cArr[iIntValue3];
                            cArr3[i215 + 1] = cArr[i214];
                        } else {
                            i13 = setincludefontpadding.setX;
                            i14 = setincludefontpadding.setOnFocusChangeListener;
                            if (i13 == i14) {
                                int iA3 = androidx.activity.a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                                setincludefontpadding.setOnLongClickListener = iA3;
                                int iA4 = androidx.activity.a.a(i12, cCharValue, 1, cCharValue);
                                setincludefontpadding.setNavigationOnClickListener = iA4;
                                int i37 = (i14 * cCharValue) + iA4;
                                int i38 = setincludefontpadding.setDividerPadding;
                                cArr3[i38] = cArr[(i13 * cCharValue) + iA3];
                                cArr3[i38 + 1] = cArr[i37];
                                int i39 = f57898n + 69;
                                m = i39 % 128;
                                int i310 = i39 % 2;
                            } else {
                                int i311 = (i13 * cCharValue) + i12;
                                int i312 = (i14 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                                int i313 = setincludefontpadding.setDividerPadding;
                                cArr3[i313] = cArr[i311];
                                cArr3[i313 + 1] = cArr[i312];
                            }
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
                c10 = 7;
            }
        }
        int i40 = 0;
        while (i40 < i10) {
            cArr3[i40] = (char) (cArr3[i40] ^ 13722);
            i40++;
            int i41 = m + 7;
            f57898n = i41 % 128;
            int i42 = i41 % 2;
        }
        objArr[0] = new String(cArr3);
    }

    public static void b(String str, int i10, Object[] objArr) throws Throwable {
        int i11 = m;
        int i12 = i11 + 35;
        f57898n = i12 % 128;
        char c10 = 2;
        int i13 = i12 % 2;
        int i14 = i11 + 27;
        f57898n = i14 % 128;
        if (i14 % 2 == 0) {
            str.toCharArray();
            throw null;
        }
        char[] charArray = str.toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        int i15 = 0;
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i16 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i16 >= charArray.length) {
                objArr[0] = new String(cArr, 0, i10);
                return;
            }
            cArr2[i15] = charArray[i16];
            cArr2[1] = charArray[i16 + 1];
            int i17 = 58224;
            int i18 = i15;
            while (i18 < 16) {
                char c11 = cArr2[1];
                char c12 = cArr2[i15];
                char[] cArr3 = cArr2;
                int i19 = (c12 + i17) ^ ((c12 << 4) + ((char) (((long) f57894i) ^ 4333817592127744003L)));
                int i20 = c12 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(f57895j);
                    objArr2[c10] = Integer.valueOf(i20);
                    objArr2[1] = Integer.valueOf(i19);
                    objArr2[0] = Integer.valueOf(c11);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    byte[] bArr = f57899o;
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (48535 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Color.argb(0, 0, 0, 0) + 47, 2672 - TextUtils.getTrimmedLength(""));
                        byte length = (byte) bArr.length;
                        byte b10 = (byte) (length - 4);
                        Object[] objArr3 = new Object[1];
                        c(length, b10, b10, objArr3);
                        String str2 = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr4 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i17) ^ ((cCharValue << 4) + ((char) (((long) f57892g) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f57893h)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (48534 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), ((byte) KeyEvent.getModifierMetaStateMask()) + 48, 2672 - View.MeasureSpec.makeMeasureSpec(0, 0));
                        byte length2 = (byte) bArr.length;
                        byte b11 = (byte) (length2 - 4);
                        Object[] objArr5 = new Object[1];
                        c(length2, b11, b11, objArr5);
                        String str3 = (String) objArr5[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                    i17 -= 40503;
                    i18++;
                    int i21 = m + 39;
                    f57898n = i21 % 128;
                    int i22 = i21 % 2;
                    cArr2 = cArr3;
                    c10 = 2;
                    i15 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            char[] cArr4 = cArr2;
            int i23 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i23] = cArr4[0];
            cArr[i23 + 1] = cArr4[1];
            Object[] objArr6 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 == null) {
                Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 38 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 2146);
                byte b12 = (byte) 0;
                Object[] objArr7 = new Object[1];
                c((byte) 6, b12, b12, objArr7);
                method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr6);
            int i24 = m + 53;
            f57898n = i24 % 128;
            c10 = 2;
            int i25 = i24 % 2;
            cArr2 = cArr4;
            i15 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 4
            int r7 = 3 - r7
            int r6 = r6 + 99
            int r8 = r8 * 2
            int r0 = 1 - r8
            byte[] r0 = new byte[r0]
            r1 = 0
            int r8 = 0 - r8
            byte[] r2 = com.mypinpad.tsdk.isolation.qn.f57899o
            if (r2 != 0) goto L1a
            r6 = r7
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            goto L36
        L1a:
            r3 = r1
        L1b:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2c
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2c:
            r3 = r2[r7]
            r5 = r8
            r8 = r6
            r6 = r7
            r7 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L36:
            int r7 = -r7
            int r7 = r7 + r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.qn.c(int, int, short, java.lang.Object[]):void");
    }

    public static void d() {
        f57899o = new byte[]{85, -69, 57, -93};
    }

    public static /* synthetic */ JSONObject e(pw pwVar, int i10) throws Throwable {
        int i11 = f57896k + 85;
        f57897l = i11 % 128;
        int i12 = i11 % 2;
        JSONObject jSONObjectF = f(pwVar, i10, null);
        int i13 = f57896k + 69;
        f57897l = i13 % 128;
        if (i13 % 2 != 0) {
            return jSONObjectF;
        }
        throw null;
    }

    public static JSONObject f(pw pwVar, int i10, UUID uuid) throws Throwable {
        int i11 = f57896k + 15;
        f57897l = i11 % 128;
        int i12 = i11 % 2;
        try {
            JSONObject onFocusChangeListener = pwVar.setOnFocusChangeListener();
            if (onFocusChangeListener != null) {
                int i13 = f57896k + 17;
                f57897l = i13 % 128;
                if (i13 % 2 != 0) {
                    return onFocusChangeListener;
                }
                throw null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i10);
            sb2.append(AbstractJsonLexerKt.COMMA);
            sb2.append(pwVar.setX());
            mu.setCompoundDrawableTintBlendMode(new Object[]{180003, getDisplayExponent.setY(sb2.toString()), null, 4}, -1968587119, 1968587120, 180003);
            TerminalException terminalException = new TerminalException(i10, pwVar.setX(), null);
            mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException;
        } catch (Throwable th2) {
            pc.setY(new ou(uuid, Integer.valueOf(pwVar.setY()), i10, getDisplayExponent.setCompoundDrawableTintBlendMode(getDisplayExponent.setY(pwVar.setX()), mw.setDividerPadding(th2))));
            throw th2;
        }
    }

    public static /* synthetic */ void g(pw pwVar, int i10) {
        int i11 = f57896k + 115;
        f57897l = i11 % 128;
        if (i11 % 2 != 0) {
        } else {
            throw null;
        }
    }

    public static void h(pw pwVar, int i10, UUID uuid) throws Throwable {
        pc.setY(new ou(uuid, Integer.valueOf(pwVar.setY()), i10, getDisplayExponent.setY(pwVar.setX())));
        int i11 = f57897l + 47;
        f57896k = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006f, code lost:
    
        if (r1 != 201) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0089, code lost:
    
        if (r1 != 201) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x008c, code lost:
    
        g(com.mypinpad.tsdk.isolation.qj.setCompoundDrawableTintBlendMode(r0), 10062);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x009a, code lost:
    
        throw new kotlin.KotlinNothingValueException();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object setCompoundDrawableTintBlendMode(java.lang.Object[] r16, int r17, int r18, int r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 858
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.qn.setCompoundDrawableTintBlendMode(java.lang.Object[], int, int, int):java.lang.Object");
    }

    public static final /* synthetic */ JSONObject setOnFocusChangeListener(qn qnVar, pw pwVar, int i10, UUID uuid) throws Throwable {
        int i11 = f57897l + 49;
        f57896k = i11 % 128;
        int i12 = i11 % 2;
        JSONObject jSONObjectF = f(pwVar, i10, uuid);
        int i13 = f57896k + 17;
        f57897l = i13 % 128;
        int i14 = i13 % 2;
        return jSONObjectF;
    }

    public static final /* synthetic */ Void setY(qn qnVar, pw pwVar, int i10, UUID uuid) {
        Void r10;
        int i11 = f57896k + 37;
        f57897l = i11 % 128;
        if (i11 % 2 == 0) {
            r10 = (Void) setCompoundDrawableTintBlendMode(new Object[]{pwVar, Integer.valueOf(i10), uuid}, 1921389451, -1921389450, i10);
            int i12 = 15 / 0;
        } else {
            r10 = (Void) setCompoundDrawableTintBlendMode(new Object[]{pwVar, Integer.valueOf(i10), uuid}, 1921389451, -1921389450, i10);
        }
        int i13 = f57897l + 51;
        f57896k = i13 % 128;
        int i14 = i13 % 2;
        return r10;
    }

    @Override // com.mypinpad.tsdk.isolation.getAmountFieldBgColor
    @NotNull
    public final AuthorizationGrant setDividerPadding(@NotNull setVerticalScrollbarPosition setverticalscrollbarposition, @NotNull byte[] bArr, @NotNull String str) throws Throwable {
        JSONObject jSONObjectE;
        Intrinsics.checkNotNullParameter(setverticalscrollbarposition, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(str, "");
        yk.setDividerPadding setdividerpadding = new yk.setDividerPadding();
        uo uoVar = uo.INSTANCE;
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        b("ꈲ\u1ae2\uf4e8䬉垔瞞ꗏწ븯뼳騭⩓龜︱鲎亏", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 16, objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append((String) qk.setX(new Object[]{setverticalscrollbarposition}, 1371471483, -1371471482, (int) System.currentTimeMillis()));
        Object[] objArr2 = new Object[1];
        b("迆ಅ㊯倈얁狘ꄗ濖ڟ\ue17b", 11 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr2);
        sb2.append(((String) objArr2[0]).intern());
        pw pwVar = (pw) ((Future) pu.setCompoundDrawableTintBlendMode(new Object[]{this.f57901b, (yk) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 721744858, -721744846, System.identityHashCode(setdividerpadding))}, -144039891, 144039892, (int) System.currentTimeMillis())).get();
        if (pwVar.setY() != 200) {
            Intrinsics.checkNotNullExpressionValue(pwVar, "");
            g(pwVar, 10064);
            throw new KotlinNothingValueException();
        }
        int i10 = f57896k + 15;
        f57897l = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullExpressionValue(pwVar, "");
            jSONObjectE = e(pwVar, 24546);
        } else {
            Intrinsics.checkNotNullExpressionValue(pwVar, "");
            jSONObjectE = e(pwVar, 10064);
        }
        return oq.setOnFocusChangeListener(jSONObjectE);
    }

    @Override // com.mypinpad.tsdk.isolation.getAmountFieldBgColor
    public final void setX(@NotNull setRecyclerListener setrecyclerlistener, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(setrecyclerlistener, "");
        Intrinsics.checkNotNullParameter(context, "");
        this.f57902c = setrecyclerlistener;
        this.f57901b.setY(new c(context));
        int i10 = f57896k + 59;
        f57897l = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // com.mypinpad.tsdk.isolation.getAmountFieldBgColor
    @NotNull
    public final Pair<byte[], byte[]> setOnFocusChangeListener(@NotNull getPinPadPortrait getpinpadportrait) {
        return (Pair) setCompoundDrawableTintBlendMode(new Object[]{this, getpinpadportrait}, 1907945337, -1907945337, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getAmountFieldBgColor
    @NotNull
    public final synchronized getVersion setY(@NotNull getPinPadPortrait getpinpadportrait, @NotNull setMinimumHeight setminimumheight) {
        getVersion getversion;
        try {
            int i10 = f57897l + 83;
            f57896k = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.checkNotNullParameter(getpinpadportrait, "");
            Intrinsics.checkNotNullParameter(setminimumheight, "");
            int iIntValue = ((Integer) getPinPadPortrait.setCompoundDrawableTintBlendMode(new Object[]{getpinpadportrait}, -717849782, 717849786, System.identityHashCode(getpinpadportrait))).intValue();
            if (iIntValue != 200 && iIntValue != 201) {
                throw new KotlinNothingValueException();
            }
            int compoundDrawableTintBlendMode = getpinpadportrait.setCompoundDrawableTintBlendMode();
            Map<String, String> dividerPadding = getpinpadportrait.setDividerPadding();
            String x4 = getpinpadportrait.setX();
            yj.setX setx = yj.setOnFocusChangeListener;
            Object[] objArr = new Object[1];
            a(TextUtils.indexOf((CharSequence) "", '0') + 17, "\u0006\u0000\u0004\u0010\u000b\u0014\b\u0000\r\u000f\u0001\t\n\r\u0013\u0003", (byte) (100 - Color.blue(0)), objArr);
            pw pwVar = new pw(compoundDrawableTintBlendMode, dividerPadding, x4, (yj) yj.setX.setDividerPadding(new Object[]{((String) objArr[0]).intern()}, -2934678, 2934679, (int) System.currentTimeMillis()));
            ti tiVar = this.f57903d;
            Intrinsics.checkNotNull(tiVar);
            ti.setOnFocusChangeListener setonfocuschangelistener = (ti.setOnFocusChangeListener) ti.setDividerPadding(new Object[]{tiVar, pwVar, (String) qk.setX(new Object[]{setminimumheight}, 825133211, -825133205, (int) System.currentTimeMillis())}, -1660614105, 1660614105, System.identityHashCode(tiVar));
            String str = (String) ti.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, 388383715, -388383713, System.identityHashCode(setonfocuschangelistener));
            String string = ((UUID) ti.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1488568400, 1488568400, System.identityHashCode(setonfocuschangelistener))).toString();
            Intrinsics.checkNotNullExpressionValue(string, "");
            String string2 = ((UUID) ti.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1770764320, 1770764324, System.identityHashCode(setonfocuschangelistener))).toString();
            Intrinsics.checkNotNullExpressionValue(string2, "");
            getversion = new getVersion(str, string, string2, (byte[]) ti.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, 1392057310, -1392057309, System.identityHashCode(setonfocuschangelistener)), (byte[]) ti.setOnFocusChangeListener.setOnFocusChangeListener(new Object[]{setonfocuschangelistener}, -1484013095, 1484013098, System.identityHashCode(setonfocuschangelistener)));
            int i12 = f57897l + 109;
            f57896k = i12 % 128;
            int i13 = i12 % 2;
        } catch (Throwable th2) {
            throw th2;
        }
        return getversion;
    }

    @Override // com.mypinpad.tsdk.isolation.getAmountFieldBgColor
    @NotNull
    public final synchronized setInterpolator setX(@NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull setMinimumHeight setminimumheight) {
        qg qgVar;
        so soVar;
        setInterpolator y7;
        try {
            Intrinsics.checkNotNullParameter(bArr, "");
            Intrinsics.checkNotNullParameter(bArr2, "");
            Intrinsics.checkNotNullParameter(setminimumheight, "");
            UUID uuidFromString = UUID.fromString((String) qk.setX(new Object[]{setminimumheight}, -1994259398, 1994259407, (int) System.currentTimeMillis()));
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "");
            ti tiVar = new ti(new op(uuidFromString), (String) qk.setX(new Object[]{setminimumheight}, 1076225677, -1076225673, (int) System.currentTimeMillis()), this.f57900a, new a(this), new b(this));
            this.f57903d = tiVar;
            Intrinsics.checkNotNull(tiVar);
            byte[] bArr3 = (byte[]) qk.setX(new Object[]{setminimumheight}, -1228852118, 1228852118, (int) System.currentTimeMillis());
            if (setminimumheight instanceof qg) {
                int i10 = f57896k + 49;
                f57897l = i10 % 128;
                int i11 = i10 % 2;
                qgVar = (qg) setminimumheight;
            } else {
                qgVar = null;
            }
            if (qgVar == null || (soVar = (so) qg.setX(new Object[]{qgVar}, 822459484, -822459482, System.identityHashCode(qgVar))) == null) {
                soVar = so.setY;
            }
            UUID uuidFromString2 = UUID.fromString((String) qk.setX(new Object[]{setminimumheight}, 825133211, -825133205, (int) System.currentTimeMillis()));
            String str = (String) qk.setX(new Object[]{setminimumheight}, -675386460, 675386462, (int) System.currentTimeMillis());
            byte[] bArr4 = (byte[]) qk.setX(new Object[]{setminimumheight}, -960080336, 960080343, (int) System.currentTimeMillis());
            UUID uuidFromString3 = ((String) qk.setX(new Object[]{setminimumheight}, 1929994622, -1929994614, (int) System.currentTimeMillis())) != null ? UUID.fromString((String) qk.setX(new Object[]{setminimumheight}, 1929994622, -1929994614, (int) System.currentTimeMillis())) : null;
            Intrinsics.checkNotNullExpressionValue(uuidFromString2, "");
            y7 = qj.setY(tiVar.setDividerPadding(soVar, uuidFromString2, bArr3, bArr, bArr2, str, bArr4, uuidFromString3), TransactionNotAuthorisedReason.setY);
            int i12 = f57896k + 59;
            f57897l = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return y7;
    }

    @Override // com.mypinpad.tsdk.isolation.getAmountFieldBgColor
    @NotNull
    public final setInterpolator setX(@NotNull byte[] bArr, @NotNull setLabelFor setlabelfor) throws Throwable {
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(setlabelfor, "");
        String string = ((UUID) qk.setX(new Object[]{setlabelfor}, -1300245567, 1300245572, (int) System.currentTimeMillis())).toString();
        Intrinsics.checkNotNullExpressionValue(string, "");
        pc.setY(new pa(string));
        Object[] objArr = new Object[1];
        a(10 - (ViewConfiguration.getPressedStateDuration() >> 16), "\u000e\u0000\r\u0002\t\u0000\u0016\u0017\u0016\u0003", (byte) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 121), objArr);
        Map mapMapOf = p.mapOf(TuplesKt.to(((String) objArr[0]).intern(), (String) qk.setX(new Object[]{setlabelfor}, -140577881, 140577884, (int) System.currentTimeMillis())));
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f57900a);
        Object[] objArr2 = new Object[1];
        b("칀戶㹎ꃚ⑵➼꺉\uf273\u0fdfø", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 9, objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append((UUID) qk.setX(new Object[]{setlabelfor}, -1300245567, 1300245572, (int) System.currentTimeMillis()));
        String string2 = sb2.toString();
        JSONObject jSONObject = new JSONObject();
        Object[] objArr3 = new Object[1];
        b("\ue2e5쭮꼓轷㔾蒃\udcc1┹犟謧∶⪟鋐죡ꌗ\ufe1fญ讗", 18 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr3);
        String string3 = jSONObject.put(((String) objArr3[0]).intern(), (String) ux.setCompoundDrawableTintBlendMode(new Object[]{bArr}, 1019201663, -1019201662, (int) System.currentTimeMillis())).toString();
        Intrinsics.checkNotNullExpressionValue(string3, "");
        Metadata metadata = new Metadata(l.encodeToByteArray(string3));
        Object[] objArr4 = new Object[1];
        a(Color.rgb(0, 0, 0) + 16777220, "\u0013\u0015\f\u0012", (byte) (23 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), objArr4);
        setInterpolator setinterpolator = new setInterpolator(mapMapOf, string2, metadata, ((String) objArr4[0]).intern(), null, 16, null);
        int i10 = f57896k + 87;
        f57897l = i10 % 128;
        int i11 = i10 % 2;
        return setinterpolator;
    }

    @Override // com.mypinpad.tsdk.isolation.getAmountFieldBgColor
    @NotNull
    public final setLineBreakWordStyle setY(@NotNull setVerticalScrollbarPosition setverticalscrollbarposition, @NotNull byte[] bArr, @NotNull byte[] bArr2, @NotNull byte[] bArr3, @NotNull byte[] bArr4) throws Throwable {
        Object y7;
        Intrinsics.checkNotNullParameter(setverticalscrollbarposition, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        Intrinsics.checkNotNullParameter(bArr2, "");
        Intrinsics.checkNotNullParameter(bArr3, "");
        Intrinsics.checkNotNullParameter(bArr4, "");
        yk.setDividerPadding setdividerpadding = new yk.setDividerPadding();
        uo uoVar = uo.INSTANCE;
        Object[] objArr = new Object[1];
        a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 25, "\u000b\u0001\u0005\u0011\u0002\u0004\u0005\u000b\u0002\u000e\u0000\b\u0001\u0018\u0015\u0007\n\u0000\f\u0002\u0014\u0002\u0018\u0002㙞", (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 112), objArr);
        oq oqVar = oq.INSTANCE;
        pw pwVar = (pw) ((Future) pu.setCompoundDrawableTintBlendMode(new Object[]{this.f57901b, (yk) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 721744858, -721744846, System.identityHashCode(setdividerpadding))}, -144039891, 144039892, (int) System.currentTimeMillis())).get();
        if (pwVar.setY() == 200) {
            int i10 = f57897l + 47;
            f57896k = i10 % 128;
            if (i10 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(pwVar, "");
                y7 = oq.setY(new Object[]{e(pwVar, 26331)}, -1488828002, 1488828002, (int) System.currentTimeMillis());
            } else {
                Intrinsics.checkNotNullExpressionValue(pwVar, "");
                y7 = oq.setY(new Object[]{e(pwVar, 10065)}, -1488828002, 1488828002, (int) System.currentTimeMillis());
            }
            return (setLineBreakWordStyle) y7;
        }
        Intrinsics.checkNotNullExpressionValue(pwVar, "");
        g(pwVar, 10065);
        throw new KotlinNothingValueException();
    }

    @Override // com.mypinpad.tsdk.isolation.getAmountFieldBgColor
    @NotNull
    public final byte[] setX(int i10) throws Throwable {
        yk.setDividerPadding setdividerpadding = new yk.setDividerPadding();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f57900a);
        Object[] objArr = new Object[1];
        b("칀戶㹎ꃚꕿ畎ڟ\ue17b非媜\uf100떜鑦큰䅤艌嚺\uf6f1\u07bf绱", (Process.myPid() >> 22) + 19, objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(64);
        pw pwVar = (pw) ((Future) pu.setCompoundDrawableTintBlendMode(new Object[]{this.f57901b, (yk) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 721744858, -721744846, System.identityHashCode(setdividerpadding))}, -144039891, 144039892, (int) System.currentTimeMillis())).get();
        if (pwVar.setY() == 200) {
            int i11 = f57897l + 37;
            f57896k = i11 % 128;
            int i12 = i11 % 2;
            Intrinsics.checkNotNullExpressionValue(pwVar, "");
            JSONObject jSONObjectE = e(pwVar, 10063);
            abw.Companion companion = abw.INSTANCE;
            Object[] objArr2 = new Object[1];
            b("霪칓놠狁༖䅏ญ讗", 8 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), objArr2);
            String string = jSONObjectE.getString(((String) objArr2[0]).intern());
            Intrinsics.checkNotNullExpressionValue(string, "");
            abw abwVar = (abw) abw.Companion.setOnFocusChangeListener(new Object[]{string}, 1346172271, -1346172270, (int) System.currentTimeMillis());
            Intrinsics.checkNotNull(abwVar);
            byte[] z10 = abwVar.setZ();
            int i13 = f57896k + 99;
            f57897l = i13 % 128;
            int i14 = i13 % 2;
            return z10;
        }
        Intrinsics.checkNotNullExpressionValue(pwVar, "");
        g(pwVar, 10063);
        throw new KotlinNothingValueException();
    }

    @Override // com.mypinpad.tsdk.isolation.getAmountFieldBgColor
    public final boolean setCompoundDrawableTintBlendMode(@NotNull String str) {
        int i10 = f57896k + 13;
        f57897l = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(str, "");
            py.setCompoundDrawableTintBlendMode(str);
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        boolean compoundDrawableTintBlendMode = py.setCompoundDrawableTintBlendMode(str);
        int i11 = f57897l + 49;
        f57896k = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 8 / 0;
        }
        return compoundDrawableTintBlendMode;
    }

    @Override // com.mypinpad.tsdk.isolation.getAmountFieldBgColor
    @NotNull
    public final getPinPadPortrait setY(@NotNull setInterpolator setinterpolator) {
        return (getPinPadPortrait) setCompoundDrawableTintBlendMode(new Object[]{this, setinterpolator}, 477902256, -477902254, System.identityHashCode(this));
    }

    @Override // com.mypinpad.tsdk.isolation.getAmountFieldBgColor
    @Nullable
    public final String setCompoundDrawableTintBlendMode() {
        int i10 = f57896k + 79;
        f57897l = i10 % 128;
        int i11 = i10 % 2;
        String x4 = this.f57901b.setX();
        int i12 = f57896k + 107;
        f57897l = i12 % 128;
        if (i12 % 2 != 0) {
            return x4;
        }
        throw null;
    }

    @Override // com.mypinpad.tsdk.isolation.getAmountFieldBgColor
    @NotNull
    public final setFocusedByDefault setX(@NotNull setVerticalScrollbarPosition setverticalscrollbarposition, @NotNull UUID uuid, @NotNull byte[] bArr) throws Throwable {
        JSONObject jSONObjectE;
        Intrinsics.checkNotNullParameter(setverticalscrollbarposition, "");
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(bArr, "");
        yk.setDividerPadding setdividerpadding = new yk.setDividerPadding();
        uo uoVar = uo.INSTANCE;
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        b("ꈲ\u1ae2\uf4e8䬉垔瞞ꗏწ븯뼳騭⩓龜︱鲎亏", ExpandableListView.getPackedPositionType(0L) + 16, objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append((String) qk.setX(new Object[]{setverticalscrollbarposition}, 1371471483, -1371471482, (int) System.currentTimeMillis()));
        Object[] objArr2 = new Object[1];
        b("迆ಅ㊯倈얁狘ꄗ濖ڟ\ue17b", Color.red(0) + 10, objArr2);
        sb2.append(((String) objArr2[0]).intern());
        pw pwVar = (pw) ((Future) pu.setCompoundDrawableTintBlendMode(new Object[]{this.f57901b, (yk) yk.setDividerPadding.setOnFocusChangeListener(new Object[]{setdividerpadding}, 721744858, -721744846, System.identityHashCode(setdividerpadding))}, -144039891, 144039892, (int) System.currentTimeMillis())).get();
        if (pwVar.setY() == 200) {
            int i10 = f57897l + 79;
            f57896k = i10 % 128;
            if (i10 % 2 != 0) {
                Intrinsics.checkNotNullExpressionValue(pwVar, "");
                jSONObjectE = e(pwVar, 23075);
            } else {
                Intrinsics.checkNotNullExpressionValue(pwVar, "");
                jSONObjectE = e(pwVar, 10066);
            }
            return oq.setY(jSONObjectE);
        }
        Intrinsics.checkNotNullExpressionValue(pwVar, "");
        g(pwVar, 10066);
        throw new KotlinNothingValueException();
    }
}
