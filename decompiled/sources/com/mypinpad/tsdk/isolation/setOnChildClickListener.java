package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.security.keystore.KeyExpiredException;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.ethermobilesdk.plugin.command.hash.HashCommand;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.time.Clock;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.UByte;
import kotlin.UInt;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.ranges.c;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0002=>BK\u0012\u0006\u0010-\u001a\u00020,\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u00106\u001a\u000205\u0012\b\u00100\u001a\u0004\u0018\u00010/\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u00109\u001a\u000208\u0012\b\b\u0002\u0010\"\u001a\u00020!¢\u0006\u0004\b;\u0010<J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\t\u001a\u0004\u0018\u00010\bJ\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0005J\u0006\u0010\r\u001a\u00020\fJ\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0013\u001a\u00020\u0012J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\bH\u0002J\u000e\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0005J\u0016\u0010\u001b\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\bJ\u0010\u0010\r\u001a\u00020\f*\u00060\fj\u0002`\u001cH\u0002J \u0010 \u001a\u00020\u001f*\u00060\fj\u0002`\u001c2\u0006\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\fH\u0002R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010*\u001a\u00060\fj\u0002`\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00100\u001a\u0004\u0018\u00010/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00109\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006?"}, d2 = {"Lcom/mypinpad/security/implementation/keyagreement/KeyManager;", "", "", "cleanUpProvisioning", "deprovision", "", "emvPayload", "encryptEmvPayload", "", "getCustomerId", "getIdentity", "getIdentityPublicKey", "", "getKeyAvailability", "Lcom/mypinpad/security/integration/SecurityProvisionSession;", "session", "keyAgreement", "keyRolling", "", "forceRoll", "provision", "provisioning", "renewExpiredKeys", "data", "sign", "configuration", HashCommand.ID, "validateEmvConfig", "Lcom/mypinpad/security/implementation/keyagreement/KeyAgreementDate;", "lifetime", "rollWindow", "Lcom/mypinpad/security/implementation/keyagreement/KeyManager$KeyStatus;", "getStatus", "Ljava/time/Clock;", "clock", "Ljava/time/Clock;", "Lcom/mypinpad/security/implementation/crypto/CryptographyApi;", "cryptography", "Lcom/mypinpad/security/implementation/crypto/CryptographyApi;", "Lcom/mypinpad/security/implementation/keyagreement/IdentityProvider;", "identityProvider", "Lcom/mypinpad/security/implementation/keyagreement/IdentityProvider;", "keyAgreementDate", "J", "Lcom/mypinpad/security/implementation/keyagreement/LocalStorageProvider;", "localStorageProvider", "Lcom/mypinpad/security/implementation/keyagreement/LocalStorageProvider;", "Lcom/mypinpad/common/logging/Logger;", "logger", "Lcom/mypinpad/common/logging/Logger;", "Lcom/mypinpad/security/implementation/handlers/SecurityNetworkServiceProvider;", "securityNetworkServiceProvider", "Lcom/mypinpad/security/implementation/handlers/SecurityNetworkServiceProvider;", "Lcom/mypinpad/security/implementation/keyagreement/SharedSecretKeyProvider;", "sharedSecretKeyProvider", "Lcom/mypinpad/security/implementation/keyagreement/SharedSecretKeyProvider;", "Lcom/mypinpad/security/implementation/keyagreement/X509CertificateProvider;", "x509CertificateProvider", "Lcom/mypinpad/security/implementation/keyagreement/X509CertificateProvider;", "<init>", "(Lcom/mypinpad/security/implementation/keyagreement/LocalStorageProvider;Lcom/mypinpad/security/implementation/crypto/CryptographyApi;Lcom/mypinpad/security/implementation/keyagreement/SharedSecretKeyProvider;Lcom/mypinpad/common/logging/Logger;Lcom/mypinpad/security/implementation/handlers/SecurityNetworkServiceProvider;Lcom/mypinpad/security/implementation/keyagreement/IdentityProvider;Lcom/mypinpad/security/implementation/keyagreement/X509CertificateProvider;Ljava/time/Clock;)V", "Companion", "KeyStatus", "android-security-module.implementation"}, k = 1, mv = {1, 5, 1})
public final class setOnChildClickListener {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f60185j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static char[] f60186k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static long f60187l;
    public static int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static int f60188n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static int f60189o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f60190p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final byte[] f60191q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f60192r = 0;

    @NotNull
    public static final setY setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final getScope f60193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setDivider f60194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AsiaPacificEndpoint f60195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final setColorFilter f60196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final setProgressBackgroundTintBlendMode f60197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final setMinimumWidth f60198f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final startTransactiondefault f60199g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final Clock f60200h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f60201i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004"}, d2 = {"Lcom/mypinpad/tsdk/i/setOnChildClickListener$a;", "", "setDividerPadding", "setX", "setOnFocusChangeListener"}, k = 1, mv = {1, 5, 1})
    public static final class a {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;
        private static final /* synthetic */ a[] setCompoundDrawableTintBlendMode;
        public static final a setDividerPadding;
        private static int setOnDragListener;
        public static final a setOnFocusChangeListener;
        private static int setOnLongClickListener;
        public static final a setX;
        private static int[] setY;

        static {
            c();
            $10 = 0;
            $11 = 1;
            setOnLongClickListener = 0;
            setOnDragListener = 1;
            d();
            Object[] objArr = new Object[1];
            a(new int[]{1005537904, -118769807, 385377462, 931738574, 1156500889, 917023104, 1663988448, 403844532}, 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr);
            a aVar = new a(((String) objArr[0]).intern(), 0);
            setDividerPadding = aVar;
            Object[] objArr2 = new Object[1];
            a(new int[]{1005537904, -118769807, 385377462, 931738574, 220268458, 330055158, -380560312, -1927897341, 197365926, 827413942}, TextUtils.lastIndexOf("", '0', 0, 0) + 19, objArr2);
            a aVar2 = new a(((String) objArr2[0]).intern(), 1);
            setX = aVar2;
            Object[] objArr3 = new Object[1];
            a(new int[]{1005537904, -118769807, 385377462, 931738574, -1572169055, -766692666, 1373082448, -1230110807}, TextUtils.getOffsetAfter("", 0) + 16, objArr3);
            a aVar3 = new a(((String) objArr3[0]).intern(), 2);
            setOnFocusChangeListener = aVar3;
            int i10 = setOnDragListener;
            int i11 = i10 + 21;
            setOnLongClickListener = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i10 + 121;
            int i14 = i13 % 128;
            setOnLongClickListener = i14;
            int i15 = i13 % 2;
            setCompoundDrawableTintBlendMode = new a[]{aVar, aVar2, aVar3};
            int i16 = i14 + 3;
            setOnDragListener = i16 % 128;
            if (i16 % 2 == 0) {
                int i17 = 59 / 0;
            }
        }

        public a() {
            throw null;
        }

        public static void a(int[] iArr, int i10, Object[] objArr) throws Throwable {
            int length;
            int[] iArr2;
            int i11;
            setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr3 = setY;
            int i12 = 1833429914;
            int i13 = 0;
            if (iArr3 != null) {
                int i14 = $11 + 87;
                $10 = i14 % 128;
                if (i14 % 2 != 0) {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i11 = 1;
                } else {
                    length = iArr3.length;
                    iArr2 = new int[length];
                    i11 = 0;
                }
                while (i11 < length) {
                    try {
                        Object[] objArr2 = new Object[1];
                        objArr2[i13] = Integer.valueOf(iArr3[i11]);
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(Integer.valueOf(i12));
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTouchSlop() >> 8), Color.green(i13) + 44, 728 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                            byte b10 = (byte) i13;
                            byte b11 = (byte) (b10 - 1);
                            Object[] objArr3 = new Object[1];
                            b(b11, (byte) (-b11), b10, objArr3);
                            method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                            map.put(1833429914, method);
                        }
                        iArr2[i11] = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                        i11++;
                        int i15 = $11 + 125;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                        i12 = 1833429914;
                        i13 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                iArr3 = iArr2;
            }
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = setY;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i17 = 0;
                while (i17 < length3) {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i17])};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method2 = map2.get(1833429914);
                    if (method2 == null) {
                        Class cls2 = (Class) setTextScaleX.setX((char) ((-1) - TextUtils.lastIndexOf("", '0')), 44 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 728 - (KeyEvent.getMaxKeyCode() >> 16));
                        byte b12 = (byte) 0;
                        byte b13 = (byte) (b12 - 1);
                        Object[] objArr5 = new Object[1];
                        b(b13, (byte) (-b13), b12, objArr5);
                        method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                        map2.put(1833429914, method2);
                    }
                    iArr6[i17] = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                    i17++;
                    iArr5 = iArr5;
                    length3 = length3;
                }
                int i18 = $10 + 75;
                $11 = i18 % 128;
                int i19 = i18 % 2;
                iArr5 = iArr6;
            }
            System.arraycopy(iArr5, 0, iArr4, 0, length2);
            setonlongclicklistener.setDividerPadding = 0;
            while (true) {
                int i20 = setonlongclicklistener.setDividerPadding;
                if (i20 >= iArr.length) {
                    objArr[0] = new String(cArr2, 0, i10);
                    return;
                }
                int i21 = $11 + 45;
                $10 = i21 % 128;
                int i22 = i21 % 2;
                int i23 = iArr[i20];
                char c10 = (char) (i23 >> 16);
                cArr[0] = c10;
                char c11 = (char) i23;
                cArr[1] = c11;
                int i24 = iArr[i20 + 1];
                char c12 = (char) (i24 >> 16);
                cArr[2] = c12;
                char c13 = (char) i24;
                cArr[3] = c13;
                setonlongclicklistener.setY = (c10 << 16) + c11;
                setonlongclicklistener.setCompoundDrawableTintBlendMode = (c12 << 16) + c13;
                setOnLongClickListener.setX(iArr4);
                int i25 = 0;
                for (int i26 = 16; i25 < i26; i26 = 16) {
                    int i27 = setonlongclicklistener.setY ^ iArr4[i25];
                    setonlongclicklistener.setY = i27;
                    Object[] objArr6 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i27)), setonlongclicklistener, setonlongclicklistener};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(-350984188);
                    if (method3 == null) {
                        method3 = ((Class) setTextScaleX.setX((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 40, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 180)).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                        map3.put(-350984188, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                    setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
                    i25++;
                }
                int i28 = setonlongclicklistener.setY;
                int i29 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                int i30 = i28 ^ iArr4[16];
                setonlongclicklistener.setCompoundDrawableTintBlendMode = i30;
                int i31 = i29 ^ iArr4[17];
                setonlongclicklistener.setY = i31;
                cArr[0] = (char) (i31 >>> 16);
                cArr[1] = (char) i31;
                cArr[2] = (char) (i30 >>> 16);
                cArr[3] = (char) i30;
                setOnLongClickListener.setX(iArr4);
                int i32 = setonlongclicklistener.setDividerPadding * 2;
                cArr2[i32] = cArr[0];
                cArr2[i32 + 1] = cArr[1];
                cArr2[i32 + 2] = cArr[2];
                cArr2[i32 + 3] = cArr[3];
                Object[] objArr7 = {setonlongclicklistener, setonlongclicklistener};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(-147294223);
                if (method4 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollBarSize() >> 8) + 41, 483 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 - 1);
                    Object[] objArr8 = new Object[1];
                    b(b15, (byte) (b15 + 1), b14, objArr8);
                    method4 = cls3.getMethod((String) objArr8[0], Object.class, Object.class);
                    map4.put(-147294223, method4);
                }
                ((Method) method4).invoke(null, objArr7);
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0027  */
        /* JADX WARN: Code duplicated, block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(int r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 4
                int r7 = 108 - r7
                int r8 = r8 * 4
                int r0 = 1 - r8
                int r6 = r6 + 4
                byte[] r1 = com.mypinpad.tsdk.i.setOnChildClickListener.a.$$a
                byte[] r0 = new byte[r0]
                r2 = 0
                int r8 = 0 - r8
                if (r1 != 0) goto L17
                r4 = r7
                r3 = r2
                r7 = r6
                goto L2e
            L17:
                r3 = r2
            L18:
                int r6 = r6 + 1
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L27:
                int r3 = r3 + 1
                r4 = r1[r6]
                r5 = r7
                r7 = r6
                r6 = r5
            L2e:
                int r6 = r6 + r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.setOnChildClickListener.a.b(int, int, short, java.lang.Object[]):void");
        }

        public static void c() {
            $$a = new byte[]{58, 35, -30, 127};
            $$b = 132;
        }

        public static void d() {
            setY = new int[]{-11581522, -996773222, 1338069226, -1451083424, -716868089, -1478113149, -1906185739, -1247256338, 166428231, 1693654782, -1949572948, -894471257, 100970683, 835262808, 132394871, -799158102, -1313453356, -839404784};
        }

        public static a valueOf(String str) {
            int i10 = setOnLongClickListener + 33;
            setOnDragListener = i10 % 128;
            if (i10 % 2 != 0) {
                return (a) Enum.valueOf(a.class, str);
            }
            Enum.valueOf(a.class, str);
            throw null;
        }

        public static a[] values() {
            int i10 = setOnLongClickListener + 95;
            setOnDragListener = i10 % 128;
            if (i10 % 2 == 0) {
                throw null;
            }
            a[] aVarArr = (a[]) setCompoundDrawableTintBlendMode.clone();
            int i11 = setOnDragListener + 23;
            setOnLongClickListener = i11 % 128;
            int i12 = i11 % 2;
            return aVarArr;
        }
    }

    public /* synthetic */ class setDividerPadding {
        public static final /* synthetic */ int[] setX;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.setOnFocusChangeListener.ordinal()] = 1;
            iArr[a.setX.ordinal()] = 2;
            iArr[a.setDividerPadding.ordinal()] = 3;
            setX = iArr;
            int i10 = 1 & 21;
            int i11 = (~i10) & (1 | 21);
            int i12 = -(-(i10 << 1));
            int i13 = (i11 & i12) + (i12 | i11);
            int i14 = i13 % 128;
            int i15 = i13 % 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/mypinpad/tsdk/i/setOnChildClickListener$setY;", "", "<init>", "()V"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class setY {
        public setY() {
        }

        public /* synthetic */ setY(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        d();
        f60189o = 0;
        f60190p = 1;
        m = 0;
        f60188n = 1;
        h();
        Process.getThreadPriority(0);
        TextUtils.indexOf("", "", 0, 0);
        TextUtils.lastIndexOf("", '0', 0);
        setCompoundDrawableTintBlendMode = new setY(null);
        int i10 = f60188n + 105;
        m = i10 % 128;
        int i11 = i10 % 2;
    }

    public setOnChildClickListener(getScope getscope, setDivider setdivider, AsiaPacificEndpoint asiaPacificEndpoint, setColorFilter setcolorfilter, setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode, setMinimumWidth setminimumwidth, startTransactiondefault starttransactiondefault, Clock clock, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i10 & 128) != 0) {
            clock = Clock.systemUTC();
            Intrinsics.checkNotNullExpressionValue(clock, "");
        }
        Intrinsics.checkNotNullParameter(getscope, "");
        Intrinsics.checkNotNullParameter(setdivider, "");
        Intrinsics.checkNotNullParameter(asiaPacificEndpoint, "");
        Intrinsics.checkNotNullParameter(setprogressbackgroundtintblendmode, "");
        Intrinsics.checkNotNullParameter(setminimumwidth, "");
        Intrinsics.checkNotNullParameter(starttransactiondefault, "");
        Intrinsics.checkNotNullParameter(clock, "");
        this.f60193a = getscope;
        this.f60194b = setdivider;
        this.f60195c = asiaPacificEndpoint;
        this.f60196d = setcolorfilter;
        this.f60197e = setprogressbackgroundtintblendmode;
        this.f60198f = setminimumwidth;
        this.f60199g = starttransactiondefault;
        this.f60200h = clock;
        this.f60201i = -1L;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:36:0x01b7  */
    public static void a(int i10, int i11, int i12, String str, boolean z10, Object[] objArr) throws Throwable {
        Throwable cause;
        int i13 = f60190p + 123;
        f60189o = i13 % 128;
        int i14 = 2;
        int i15 = i13 % 2;
        char[] charArray = str.toCharArray();
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[i10];
        int i16 = 0;
        getnavbartitlestring.setY = 0;
        while (true) {
            int i17 = getnavbartitlestring.setY;
            if (i17 >= i10) {
                break;
            }
            char c10 = charArray[i17];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
            char c11 = (char) (i11 + c10);
            cArr[i17] = c11;
            try {
                Object[] objArr2 = new Object[i14];
                objArr2[1] = Integer.valueOf(f60185j);
                objArr2[i16] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) View.MeasureSpec.makeMeasureSpec(i16, i16), 41 - Color.argb(i16, i16, i16, i16), 483 - Color.green(i16));
                    byte b10 = (byte) i16;
                    Object[] objArr3 = new Object[1];
                    c((byte) 6, b10, b10, objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i17] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (TextUtils.lastIndexOf("", '0') + 55967), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 42, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 2268);
                    byte b11 = (byte) 0;
                    Object[] objArr5 = new Object[1];
                    c((byte) 7, b11, b11, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                int i18 = f60190p + 79;
                f60189o = i18 % 128;
                int i19 = i18 % 2;
                i14 = 2;
                i16 = 0;
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
        if (i12 > 0) {
            int i20 = f60190p + 75;
            f60189o = i20 % 128;
            int i21 = i20 % 2;
            getnavbartitlestring.setOnFocusChangeListener = i12;
            char[] cArr2 = new char[i10];
            System.arraycopy(cArr, 0, cArr2, 0, i10);
            int i22 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, i10 - i22, i22);
            int i23 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i23, cArr, 0, i10 - i23);
        }
        if (z10) {
            int i24 = f60189o + 55;
            f60190p = i24 % 128;
            int i25 = i24 % 2;
            char[] cArr3 = new char[i10];
            getnavbartitlestring.setY = 0;
            while (true) {
                int i26 = getnavbartitlestring.setY;
                if (i26 >= i10) {
                    break;
                }
                cArr3[i26] = cArr[(i10 - i26) - 1];
                Object[] objArr6 = {getnavbartitlestring, getnavbartitlestring};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(1860518195);
                if (method3 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (55965 - TextUtils.lastIndexOf("", '0', 0)), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 43, TextUtils.lastIndexOf("", '0', 0) + 2269);
                    byte b12 = (byte) 0;
                    Object[] objArr7 = new Object[1];
                    c((byte) 7, b12, b12, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1860518195, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:39:0x01f1  */
    public static void b(char c10, int i10, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        setCompoundDrawableTintBlendMode setcompounddrawabletintblendmode = new setCompoundDrawableTintBlendMode();
        long[] jArr = new long[i11];
        int i12 = 0;
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i13 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i13 >= i11) {
                break;
            }
            int i14 = f60190p + 33;
            f60189o = i14 % 128;
            int i15 = i14 % 2;
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i12] = Integer.valueOf(f60186k[i10 + i13]);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(1832327647);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 44 - TextUtils.getOffsetAfter("", i12), KeyEvent.getDeadChar(i12, i12) + 728);
                    byte b10 = (byte) (f60192r & 23);
                    byte b11 = (byte) (b10 - 5);
                    Object[] objArr3 = new Object[1];
                    c(b10, b11, b11, objArr3);
                    String str = (String) objArr3[i12];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i12] = Integer.TYPE;
                    method = cls.getMethod(str, clsArr);
                    map.put(1832327647, method);
                }
                Object[] objArr4 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(setcompounddrawabletintblendmode.setDividerPadding), Long.valueOf(f60187l), Integer.valueOf(c10)};
                Object method2 = map.get(2012362404);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (TextUtils.indexOf((CharSequence) "", '0') + 46117), View.MeasureSpec.getSize(0) + 43, 1776 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                    byte length = (byte) f60191q.length;
                    byte b12 = (byte) (length - 4);
                    Object[] objArr5 = new Object[1];
                    c(length, b12, b12, objArr5);
                    String str2 = (String) objArr5[0];
                    Class<?> cls3 = Long.TYPE;
                    method2 = cls2.getMethod(str2, cls3, cls3, cls3, Integer.TYPE);
                    map.put(2012362404, method2);
                }
                jArr[i13] = ((Long) ((Method) method2).invoke(null, objArr4)).longValue();
                Object[] objArr6 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
                Object method3 = map.get(1606688712);
                if (method3 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) View.MeasureSpec.makeMeasureSpec(0, 0), Color.rgb(0, 0, 0) + 16777243, 2311 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr7 = new Object[1];
                    c(b13, b14, b14, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map.put(1606688712, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                i12 = 0;
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
        char[] cArr = new char[i11];
        setcompounddrawabletintblendmode.setDividerPadding = 0;
        while (true) {
            int i16 = setcompounddrawabletintblendmode.setDividerPadding;
            if (i16 >= i11) {
                objArr[0] = new String(cArr);
                return;
            }
            int i17 = f60190p + 63;
            f60189o = i17 % 128;
            int i18 = i17 % 2;
            cArr[i16] = (char) jArr[i16];
            Object[] objArr8 = {setcompounddrawabletintblendmode, setcompounddrawabletintblendmode};
            Map map2 = setTextScaleX.setMaxEms;
            Object method4 = map2.get(1606688712);
            if (method4 == null) {
                Class cls5 = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", ""), 27 - (KeyEvent.getMaxKeyCode() >> 16), 2311 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                byte b15 = (byte) 0;
                byte b16 = b15;
                Object[] objArr9 = new Object[1];
                c(b15, b16, b16, objArr9);
                method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                map2.put(1606688712, method4);
            }
            ((Method) method4).invoke(null, objArr8);
        }
    }

    public static void c(byte b10, byte b11, byte b12, Object[] objArr) {
        int i10 = b11 * 3;
        int i11 = 72 - b10;
        int i12 = 3 - (b12 * 2);
        byte[] bArr = new byte[1 - i10];
        int i13 = 0 - i10;
        byte[] bArr2 = f60191q;
        int i14 = -1;
        if (bArr2 == null) {
            int i15 = i13 + (-i12);
            i12 = i12;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i14 = -1;
            i13 = i13;
            i11 = i15;
        }
        while (true) {
            int i16 = i14 + 1;
            int i17 = i12 + 1;
            bArr[i16] = (byte) i11;
            if (i16 == i13) {
                objArr[0] = new String(bArr, 0);
                return;
            }
            i12 = i17;
            objArr = objArr;
            bArr = bArr;
            bArr2 = bArr2;
            i14 = i16;
            i13 = i13;
            i11 += -bArr2[i17];
        }
    }

    public static void d() {
        f60191q = new byte[]{46, -94, 74, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG};
        f60192r = 237;
    }

    public static void h() {
        f60185j = -443079995;
        f60187l = 5085120185911948635L;
        f60186k = new char[]{50778, 13626, 8443, 8101, 2917, 1563, 30102, 24735, 23617, 19218, 18095, 45688, 41274, 40162, 35731, 34640, 61954, 57823, 56524, 53305, 9072, 13989, 2471, 7486, 4163, 25495, 30421, 18947, 23902, 20733, 42032, 46952, 35500, 40404, 5851, 58770, 61511, 53061, 56269, 54964, 42344, 45092, 36077, 39842, 38419, 25299, 29072, 19467, 23350, 22508, 8869, 12583, 3130, 6298, 5916, 57869, 65221, 52721, 55403, 55095, 41959, 48831, 36113, 39391, 38065, 25420, 32307, 19173, 22971, 21617, 50807, 13630, 8427, 8169, 2930, 1552, 30170, 24705, 23617, 19207, 28350, 40439, 34850, 46880, 41888, 44741, 56671, 51282, 62604, 58310, 61050, 6844, 50814, 13614, 8422, 8169, 2923, 1562, 30159, 24781, 23638, 19212, 18102, 45693, 41261, 40163, 35806, 34641, 61977, 57806, 56514, 51245, 51199, 13039, 11872, 7442, 2246, 1936, 29519, 28211, 23991, 18811, 17442, 25013, 37621, 34593, 47229, 44193, 41425, 53781, 51016, 64457, 60622, 57711, 5541, 1701, 15148, 11355, 8332, 21900, 17934, 31578, 28649, 24633, 38269, 35235, 47833, 50796, 13609, 8445, 8127, 2921, 1548, 30175, 24706, 23626, 19210, 18100, 45686, 19654, 49050, 43611, 38160, 33213, 33465, 29168, 25637, 23335, 20399, 17110, 12554, 9286, 6287, 4032, 625, 63153, 58866};
    }

    public static /* synthetic */ Object setY(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = ~(i13 | i14);
        if ((i15 * 446) + (((~(i10 | i14 | i12)) | (~(i11 | i13))) * 446) + (((~((~i12) | i14)) | i15) * 446) + (i11 * (-445)) + (i10 * (-445)) != 1) {
            setOnChildClickListener setonchildclicklistener = (setOnChildClickListener) objArr[0];
            int i16 = m + 33;
            f60188n = i16 % 128;
            int i17 = i16 % 2;
            String onFocusChangeListener = setonchildclicklistener.f60197e.setOnFocusChangeListener();
            int i18 = m + 11;
            f60188n = i18 % 128;
            int i19 = i18 % 2;
            return onFocusChangeListener;
        }
        setOnChildClickListener setonchildclicklistener2 = (setOnChildClickListener) objArr[0];
        setVerticalScrollbarPosition setverticalscrollbarposition = (setVerticalScrollbarPosition) objArr[1];
        int i20 = f60188n + 25;
        m = i20 % 128;
        int i21 = i20 % 2;
        if (setonchildclicklistener2.f60196d != null) {
            Object[] objArr2 = new Object[1];
            b((char) (View.getDefaultSize(0, 0) + 17614), 164 - (Process.myPid() >> 22), (Process.myPid() >> 22) + 13, objArr2);
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr2[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
        }
        setColorFilter setcolorfilter = setonchildclicklistener2.f60196d;
        if (setcolorfilter != null) {
            int i22 = m + 47;
            f60188n = i22 % 128;
            if (i22 % 2 == 0) {
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 46, null, null, 10}, 1173867142, -1173867141, 46);
            } else {
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 20, null, null, 6}, 1173867142, -1173867141, 20);
            }
        }
        setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode = setonchildclicklistener2.f60197e;
        byte[] x4 = setprogressbackgroundtintblendmode.setX();
        setDivider setdivider = setonchildclicklistener2.f60194b;
        byte[] dividerPadding = setdivider.setDividerPadding(x4);
        String dividerPadding2 = setonchildclicklistener2.setDividerPadding(dividerPadding);
        setdivider.setOnFocusChangeListener(dividerPadding, setonchildclicklistener2.setX(), (byte[]) setSecondaryProgressTintList.setY(new Object[]{dividerPadding2}, -1211050824, 1211050824, (int) System.currentTimeMillis()));
        AuthorizationGrant compoundDrawableTintBlendMode = setprogressbackgroundtintblendmode.setCompoundDrawableTintBlendMode(setverticalscrollbarposition, dividerPadding, dividerPadding2);
        setdivider.setOnFocusChangeListener((byte[]) AuthorizationGrant.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode}, 1939688577, -1939688575, System.identityHashCode(compoundDrawableTintBlendMode)), setonchildclicklistener2.f60199g.setOnFocusChangeListener(), (byte[]) AuthorizationGrant.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode}, 1656898012, -1656898012, System.identityHashCode(compoundDrawableTintBlendMode)));
        byte[] y7 = setdivider.setY((byte[]) AuthorizationGrant.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode}, 1939688577, -1939688575, System.identityHashCode(compoundDrawableTintBlendMode)));
        setdivider.setX(y7);
        Random.INSTANCE.nextBytes(y7);
        setdivider.setOnFocusChangeListener(setdivider.setX((byte[]) AuthorizationGrant.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode}, 1916864640, -1916864637, System.identityHashCode(compoundDrawableTintBlendMode)), (byte[]) setTextClassifier.setCompoundDrawableTintBlendMode(new Object[]{(UUID) AuthorizationGrant.setOnFocusChangeListener(new Object[]{compoundDrawableTintBlendMode}, 1410255014, -1410255013, System.identityHashCode(compoundDrawableTintBlendMode))}, 230957076, -230957076, (int) System.currentTimeMillis())));
        setonchildclicklistener2.f60201i = setonchildclicklistener2.f60200h.millis();
        return null;
    }

    public final a e(long j10) {
        int i10 = m + 77;
        f60188n = i10 % 128;
        int i11 = i10 % 2;
        long j11 = j10 + 86400000;
        long jMillis = this.f60200h.millis();
        if (j11 >= jMillis) {
            return j11 < jMillis + 3600000 ? a.setX : a.setDividerPadding;
        }
        a aVar = a.setOnFocusChangeListener;
        int i12 = m + 1;
        f60188n = i12 % 128;
        int i13 = i12 % 2;
        return aVar;
    }

    public final void f(setVerticalScrollbarPosition setverticalscrollbarposition) throws Throwable {
        setColorFilter setcolorfilter = this.f60196d;
        if (setcolorfilter != null) {
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getDoubleTapTimeout() >> 16) + 11, (ViewConfiguration.getFadingEdgeLength() >> 16) + 130, (Process.myPid() >> 22) + 2, "\u0000\u0006\u0002\t\u0004\u0007\u0007\n\rﾻ\u0014", true, objArr);
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
        }
        if (setcolorfilter != null) {
            int i10 = f60188n + 63;
            m = i10 % 128;
            int i11 = i10 % 2;
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 19, null, null, 6}, 1173867142, -1173867141, 19);
        }
        setDivider setdivider = this.f60194b;
        byte[] dividerPadding = setdivider.setDividerPadding(new byte[0]);
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "");
        setFocusedByDefault dividerPadding2 = this.f60197e.setDividerPadding(setverticalscrollbarposition, uuidRandomUUID, setdivider.setCompoundDrawableTintBlendMode(dividerPadding, (byte[]) setTextClassifier.setCompoundDrawableTintBlendMode(new Object[]{uuidRandomUUID}, 230957076, -230957076, (int) System.currentTimeMillis())));
        byte[] y7 = setdivider.setY(setdivider.setX((byte[]) setFocusedByDefault.setX(new Object[]{dividerPadding2}, 519690448, -519690446, System.identityHashCode(dividerPadding2)), (byte[]) setTextClassifier.setCompoundDrawableTintBlendMode(new Object[]{(UUID) setFocusedByDefault.setX(new Object[]{dividerPadding2}, -1383088519, 1383088520, System.identityHashCode(dividerPadding2))}, 230957076, -230957076, (int) System.currentTimeMillis())));
        setdivider.setX(y7);
        Random.INSTANCE.nextBytes(y7);
        setdivider.setOnFocusChangeListener(setdivider.setX((byte[]) setFocusedByDefault.setX(new Object[]{dividerPadding2}, 1162022211, -1162022211, System.identityHashCode(dividerPadding2)), (byte[]) setTextClassifier.setCompoundDrawableTintBlendMode(new Object[]{(UUID) setFocusedByDefault.setX(new Object[]{dividerPadding2}, 109010771, -109010768, System.identityHashCode(dividerPadding2))}, 230957076, -230957076, (int) System.currentTimeMillis())));
        this.f60201i = this.f60200h.millis();
        int i12 = m + 43;
        f60188n = i12 % 128;
        int i13 = i12 % 2;
    }

    public final String g() throws Throwable {
        int i10 = m;
        int i11 = i10 + 101;
        f60188n = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 15;
        f60188n = i13 % 128;
        int i14 = i13 % 2;
        setOnFocusChangeListener();
        this.f60195c.setY();
        int i15 = f60188n + 115;
        m = i15 % 128;
        if (i15 % 2 != 0) {
            throw null;
        }
        String x4 = this.f60198f.setX();
        int i16 = m + 97;
        f60188n = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = 48 / 0;
        }
        return x4;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:101:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:102:0x02f3  */
    /* JADX WARN: Code duplicated, block: B:103:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:104:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:105:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:106:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:107:0x0302  */
    /* JADX WARN: Code duplicated, block: B:108:0x0305  */
    /* JADX WARN: Code duplicated, block: B:109:0x0308  */
    /* JADX WARN: Code duplicated, block: B:110:0x030b  */
    /* JADX WARN: Code duplicated, block: B:170:0x0292 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x02d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:68:0x027e  */
    /* JADX WARN: Code duplicated, block: B:71:0x0286  */
    /* JADX WARN: Code duplicated, block: B:75:0x029c  */
    /* JADX WARN: Code duplicated, block: B:76:0x029f  */
    /* JADX WARN: Code duplicated, block: B:77:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:78:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:79:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:80:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:81:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:82:0x02b1  */
    /* JADX WARN: Code duplicated, block: B:83:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:84:0x02b7  */
    /* JADX WARN: Code duplicated, block: B:85:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:86:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:87:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:88:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:89:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:90:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:95:0x02de  */
    /* JADX WARN: Code duplicated, block: B:96:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:97:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:98:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:99:0x02ea  */
    public final void i(setVerticalScrollbarPosition setverticalscrollbarposition) throws Throwable {
        boolean z10;
        String str;
        char c10;
        char c11;
        String str2;
        char c12;
        char c13;
        char[] cArr;
        int i10;
        String str3;
        byte b10;
        char c14;
        byte b11;
        char c15;
        int i11 = m + 63;
        f60188n = i11 % 128;
        int i12 = i11 % 2;
        if (this.f60196d != null) {
            Object[] objArr = new Object[1];
            b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 147 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 12 - Color.green(0), objArr);
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
        }
        setColorFilter setcolorfilter = this.f60196d;
        if (setcolorfilter != null) {
            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 18, null, null, 6}, 1173867142, -1173867141, 18);
        }
        byte[] x4 = this.f60197e.setX();
        setDivider setdivider = this.f60194b;
        byte[] dividerPadding = setdivider.setDividerPadding(x4);
        String dividerPadding2 = setDividerPadding(dividerPadding);
        byte[] x6 = setX();
        Boolean bool = component25.setY;
        Intrinsics.checkNotNullExpressionValue(bool, "");
        boolean zBooleanValue = bool.booleanValue();
        getScope getscope = this.f60193a;
        if (!zBooleanValue) {
            byte[] bArr = (byte[]) setSecondaryProgressTintList.setY(new Object[]{getscope.setX()}, -1211050824, 1211050824, (int) System.currentTimeMillis());
            byte[] bArr2 = (byte[]) setSecondaryProgressTintList.setY(new Object[]{dividerPadding2}, -1211050824, 1211050824, (int) System.currentTimeMillis());
            setProgressBackgroundTintBlendMode setprogressbackgroundtintblendmode = this.f60197e;
            setOnKeyListener setonkeylistener = (setOnKeyListener) setProgressBackgroundTintBlendMode.setCompoundDrawableTintBlendMode(new Object[]{setprogressbackgroundtintblendmode, setverticalscrollbarposition, bArr, x6, dividerPadding, bArr2}, 2094592149, -2094592149, System.identityHashCode(setprogressbackgroundtintblendmode));
            byte[] bArr3 = (byte[]) setOnKeyListener.setOnFocusChangeListener(new Object[]{setonkeylistener}, -865119755, 865119757, System.identityHashCode(setonkeylistener));
            UUID uuidFromString = UUID.fromString(setDividerPadding());
            Intrinsics.checkNotNullExpressionValue(uuidFromString, "");
            setdivider.setOnFocusChangeListener((byte[]) setTextClassifier.setCompoundDrawableTintBlendMode(new Object[]{uuidFromString}, 230957076, -230957076, (int) System.currentTimeMillis()), bArr3, (byte[]) setLineBreakWordStyle.setDividerPadding(new Object[]{setonkeylistener}, 218655140, -218655137, System.identityHashCode(setonkeylistener)));
            setdivider.setOnFocusChangeListener((byte[]) setLineBreakWordStyle.setDividerPadding(new Object[]{setonkeylistener}, 2030043801, -2030043799, System.identityHashCode(setonkeylistener)), bArr3, (byte[]) setLineBreakWordStyle.setDividerPadding(new Object[]{setonkeylistener}, 1837279069, -1837279064, System.identityHashCode(setonkeylistener)));
            this.f60199g.setOnFocusChangeListener(bArr3);
            byte[] y7 = setdivider.setY((byte[]) setLineBreakWordStyle.setDividerPadding(new Object[]{setonkeylistener}, 2030043801, -2030043799, System.identityHashCode(setonkeylistener)));
            setdivider.setX(y7);
            Random.INSTANCE.nextBytes(y7);
            setdivider.setOnFocusChangeListener(setdivider.setX((byte[]) setLineBreakWordStyle.setDividerPadding(new Object[]{setonkeylistener}, -2041063060, 2041063061, System.identityHashCode(setonkeylistener)), (byte[]) setTextClassifier.setCompoundDrawableTintBlendMode(new Object[]{(UUID) setOnKeyListener.setOnFocusChangeListener(new Object[]{setonkeylistener}, -1719547469, 1719547469, System.identityHashCode(setonkeylistener))}, 230957076, -230957076, (int) System.currentTimeMillis())));
            byte[] bArr4 = (byte[]) setOnKeyListener.setOnFocusChangeListener(new Object[]{setonkeylistener}, -206333591, 206333592, System.identityHashCode(setonkeylistener));
            if (bArr4.length == 0) {
                int i13 = m + 77;
                f60188n = i13 % 128;
                int i14 = i13 % 2;
                z10 = true;
            } else {
                z10 = false;
            }
            if (!(!z10)) {
                str = "";
            } else {
                char[] cArr2 = new char[bArr4.length << 1];
                for (int i15 = 0; i15 < bArr4.length; i15++) {
                    byte b12 = bArr4[i15];
                    int i16 = i15 << 1;
                    byte b13 = (byte) ((b12 >>> 4) & 15);
                    switch (b13) {
                        case 0:
                            c10 = '0';
                            break;
                        case 1:
                            c10 = '1';
                            break;
                        case 2:
                            c10 = '2';
                            break;
                        case 3:
                            c10 = '3';
                            break;
                        case 4:
                            c10 = '4';
                            break;
                        case 5:
                            c10 = '5';
                            break;
                        case 6:
                            c10 = '6';
                            break;
                        case 7:
                            c10 = '7';
                            break;
                        case 8:
                            c10 = '8';
                            break;
                        case 9:
                            c10 = '9';
                            break;
                        case 10:
                            c10 = 'a';
                            break;
                        case 11:
                            c10 = 'b';
                            break;
                        case 12:
                            c10 = 'c';
                            break;
                        case 13:
                            c10 = 'd';
                            break;
                        case 14:
                            c10 = 'e';
                            break;
                        case 15:
                            c10 = 'f';
                            break;
                        default:
                            throw new IllegalArgumentException(String.valueOf((int) b13));
                    }
                    cArr2[i16] = c10;
                    int i17 = i16 + 1;
                    byte b14 = (byte) (b12 & 15);
                    switch (b14) {
                        case 0:
                            c11 = '0';
                            break;
                        case 1:
                            c11 = '1';
                            break;
                        case 2:
                            c11 = '2';
                            break;
                        case 3:
                            c11 = '3';
                            break;
                        case 4:
                            c11 = '4';
                            break;
                        case 5:
                            c11 = '5';
                            break;
                        case 6:
                            c11 = '6';
                            break;
                        case 7:
                            c11 = '7';
                            break;
                        case 8:
                            c11 = '8';
                            break;
                        case 9:
                            c11 = '9';
                            break;
                        case 10:
                            c11 = 'a';
                            break;
                        case 11:
                            c11 = 'b';
                            break;
                        case 12:
                            c11 = 'c';
                            break;
                        case 13:
                            c11 = 'd';
                            break;
                        case 14:
                            c11 = 'e';
                            break;
                        case 15:
                            c11 = 'f';
                            break;
                        default:
                            throw new IllegalArgumentException(String.valueOf((int) b14));
                    }
                    cArr2[i17] = c11;
                }
                str = new String(cArr2);
            }
            getscope.setX(str);
            getscope.setOnFocusChangeListener(true);
            return;
        }
        setWillNotDraw y10 = this.f60197e.setY(setverticalscrollbarposition, (byte[]) setSecondaryProgressTintList.setY(new Object[]{getscope.setX()}, -1211050824, 1211050824, (int) System.currentTimeMillis()), x6, dividerPadding, (byte[]) setSecondaryProgressTintList.setY(new Object[]{dividerPadding2}, -1211050824, 1211050824, (int) System.currentTimeMillis()));
        byte[] bArr5 = (byte[]) setWillNotDraw.setOnFocusChangeListener(new Object[]{y10}, 53632450, -53632449, System.identityHashCode(y10));
        Object[] objArr2 = new Object[1];
        b((char) (Color.red(0) + 35466), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 158, 6 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), objArr2);
        String strIntern = ((String) objArr2[0]).intern();
        startTransactiondefault starttransactiondefault = this.f60199g;
        byte[] bArr6 = (byte[]) startTransactiondefault.setDividerPadding(new Object[]{starttransactiondefault, bArr5, strIntern}, 134364618, -134364618, System.identityHashCode(starttransactiondefault));
        this.f60199g.setOnFocusChangeListener(bArr6);
        setdivider.setOnFocusChangeListener((byte[]) setWillNotDraw.setOnFocusChangeListener(new Object[]{y10}, -1967924734, 1967924737, System.identityHashCode(y10)), bArr6, (byte[]) setWillNotDraw.setOnFocusChangeListener(new Object[]{y10}, 1125145203, -1125145201, System.identityHashCode(y10)));
        byte[] bArr7 = (byte[]) setWillNotDraw.setOnFocusChangeListener(new Object[]{y10}, -1967924734, 1967924737, System.identityHashCode(y10));
        if (bArr7.length == 0) {
            int i18 = f60188n + 21;
            m = i18 % 128;
            if (i18 % 2 != 0) {
                throw null;
            }
            str2 = "";
        } else {
            char[] cArr3 = new char[bArr7.length << 1];
            for (int i19 = 0; i19 < bArr7.length; i19++) {
                int i20 = f60188n + 43;
                m = i20 % 128;
                int i21 = i20 % 2;
                byte b15 = bArr7[i19];
                int i22 = i19 << 1;
                byte b16 = (byte) ((b15 >>> 4) & 15);
                switch (b16) {
                    case 0:
                        c12 = '0';
                        break;
                    case 1:
                        c12 = '1';
                        break;
                    case 2:
                        c12 = '2';
                        break;
                    case 3:
                        c12 = '3';
                        break;
                    case 4:
                        c12 = '4';
                        break;
                    case 5:
                        c12 = '5';
                        break;
                    case 6:
                        c12 = '6';
                        break;
                    case 7:
                        c12 = '7';
                        break;
                    case 8:
                        c12 = '8';
                        break;
                    case 9:
                        c12 = '9';
                        break;
                    case 10:
                        c12 = 'a';
                        break;
                    case 11:
                        c12 = 'b';
                        break;
                    case 12:
                        c12 = 'c';
                        break;
                    case 13:
                        c12 = 'd';
                        break;
                    case 14:
                        c12 = 'e';
                        break;
                    case 15:
                        c12 = 'f';
                        break;
                    default:
                        throw new IllegalArgumentException(String.valueOf((int) b16));
                }
                cArr3[i22] = c12;
                int i23 = i22 + 1;
                byte b17 = (byte) (b15 & 15);
                switch (b17) {
                    case 0:
                        c13 = '0';
                        break;
                    case 1:
                        c13 = '1';
                        break;
                    case 2:
                        c13 = '2';
                        break;
                    case 3:
                        c13 = '3';
                        break;
                    case 4:
                        c13 = '4';
                        break;
                    case 5:
                        c13 = '5';
                        break;
                    case 6:
                        c13 = '6';
                        break;
                    case 7:
                        c13 = '7';
                        break;
                    case 8:
                        c13 = '8';
                        break;
                    case 9:
                        c13 = '9';
                        break;
                    case 10:
                        c13 = 'a';
                        break;
                    case 11:
                        c13 = 'b';
                        break;
                    case 12:
                        c13 = 'c';
                        break;
                    case 13:
                        c13 = 'd';
                        break;
                    case 14:
                        c13 = 'e';
                        break;
                    case 15:
                        c13 = 'f';
                        break;
                    default:
                        throw new IllegalArgumentException(String.valueOf((int) b17));
                }
                cArr3[i23] = c13;
            }
            str2 = new String(cArr3);
        }
        getscope.setY(str2);
        setdivider.setOnFocusChangeListener((byte[]) setLineBreakWordStyle.setDividerPadding(new Object[]{y10}, 1068036593, -1068036589, System.identityHashCode(y10)), bArr6, (byte[]) setLineBreakWordStyle.setDividerPadding(new Object[]{y10}, 1983093524, -1983093524, System.identityHashCode(y10)));
        byte[] bArr8 = (byte[]) setLineBreakWordStyle.setDividerPadding(new Object[]{y10}, 1068036593, -1068036589, System.identityHashCode(y10));
        if (bArr8.length == 0) {
            int i24 = f60188n + 9;
            m = i24 % 128;
            if (i24 % 2 != 0) {
                cArr = new char[bArr8.length << 1];
                for (i10 = 0; i10 < bArr8.length; i10++) {
                    byte b18 = bArr8[i10];
                    int i25 = i10 << 1;
                    b10 = (byte) ((b18 >>> 4) & 15);
                    switch (b10) {
                        case 0:
                            c14 = '0';
                            break;
                        case 1:
                            c14 = '1';
                            break;
                        case 2:
                            c14 = '2';
                            break;
                        case 3:
                            c14 = '3';
                            break;
                        case 4:
                            c14 = '4';
                            break;
                        case 5:
                            c14 = '5';
                            break;
                        case 6:
                            c14 = '6';
                            break;
                        case 7:
                            c14 = '7';
                            break;
                        case 8:
                            c14 = '8';
                            break;
                        case 9:
                            c14 = '9';
                            break;
                        case 10:
                            c14 = 'a';
                            break;
                        case 11:
                            c14 = 'b';
                            break;
                        case 12:
                            c14 = 'c';
                            break;
                        case 13:
                            c14 = 'd';
                            break;
                        case 14:
                            c14 = 'e';
                            break;
                        case 15:
                            c14 = 'f';
                            break;
                        default:
                            throw new IllegalArgumentException(String.valueOf((int) b10));
                    }
                    cArr[i25] = c14;
                    int i26 = i25 + 1;
                    b11 = (byte) (b18 & 15);
                    switch (b11) {
                        case 0:
                            c15 = '0';
                            break;
                        case 1:
                            c15 = '1';
                            break;
                        case 2:
                            c15 = '2';
                            break;
                        case 3:
                            c15 = '3';
                            break;
                        case 4:
                            c15 = '4';
                            break;
                        case 5:
                            c15 = '5';
                            break;
                        case 6:
                            c15 = '6';
                            break;
                        case 7:
                            c15 = '7';
                            break;
                        case 8:
                            c15 = '8';
                            break;
                        case 9:
                            c15 = '9';
                            break;
                        case 10:
                            c15 = 'a';
                            break;
                        case 11:
                            c15 = 'b';
                            break;
                        case 12:
                            c15 = 'c';
                            break;
                        case 13:
                            c15 = 'd';
                            break;
                        case 14:
                            c15 = 'e';
                            break;
                        case 15:
                            c15 = 'f';
                            break;
                        default:
                            throw new IllegalArgumentException(String.valueOf((int) b11));
                    }
                    cArr[i26] = c15;
                }
                str3 = new String(cArr);
            } else {
                str3 = "";
            }
        } else {
            cArr = new char[bArr8.length << 1];
            while (i10 < bArr8.length) {
                byte b19 = bArr8[i10];
                int i27 = i10 << 1;
                b10 = (byte) ((b19 >>> 4) & 15);
                switch (b10) {
                    case 0:
                        c14 = '0';
                        break;
                    case 1:
                        c14 = '1';
                        break;
                    case 2:
                        c14 = '2';
                        break;
                    case 3:
                        c14 = '3';
                        break;
                    case 4:
                        c14 = '4';
                        break;
                    case 5:
                        c14 = '5';
                        break;
                    case 6:
                        c14 = '6';
                        break;
                    case 7:
                        c14 = '7';
                        break;
                    case 8:
                        c14 = '8';
                        break;
                    case 9:
                        c14 = '9';
                        break;
                    case 10:
                        c14 = 'a';
                        break;
                    case 11:
                        c14 = 'b';
                        break;
                    case 12:
                        c14 = 'c';
                        break;
                    case 13:
                        c14 = 'd';
                        break;
                    case 14:
                        c14 = 'e';
                        break;
                    case 15:
                        c14 = 'f';
                        break;
                    default:
                        throw new IllegalArgumentException(String.valueOf((int) b10));
                }
                cArr[i27] = c14;
                int i28 = i27 + 1;
                b11 = (byte) (b19 & 15);
                switch (b11) {
                    case 0:
                        c15 = '0';
                        break;
                    case 1:
                        c15 = '1';
                        break;
                    case 2:
                        c15 = '2';
                        break;
                    case 3:
                        c15 = '3';
                        break;
                    case 4:
                        c15 = '4';
                        break;
                    case 5:
                        c15 = '5';
                        break;
                    case 6:
                        c15 = '6';
                        break;
                    case 7:
                        c15 = '7';
                        break;
                    case 8:
                        c15 = '8';
                        break;
                    case 9:
                        c15 = '9';
                        break;
                    case 10:
                        c15 = 'a';
                        break;
                    case 11:
                        c15 = 'b';
                        break;
                    case 12:
                        c15 = 'c';
                        break;
                    case 13:
                        c15 = 'd';
                        break;
                    case 14:
                        c15 = 'e';
                        break;
                    case 15:
                        c15 = 'f';
                        break;
                    default:
                        throw new IllegalArgumentException(String.valueOf((int) b11));
                }
                cArr[i28] = c15;
            }
            str3 = new String(cArr);
        }
        getscope.setDividerPadding(str3);
        UUID uuidFromString2 = UUID.fromString(setDividerPadding());
        Intrinsics.checkNotNullExpressionValue(uuidFromString2, "");
        setdivider.setOnFocusChangeListener((byte[]) setTextClassifier.setCompoundDrawableTintBlendMode(new Object[]{uuidFromString2}, 230957076, -230957076, (int) System.currentTimeMillis()), bArr6, (byte[]) setLineBreakWordStyle.setDividerPadding(new Object[]{y10}, 218655140, -218655137, System.identityHashCode(y10)));
        setdivider.setOnFocusChangeListener((byte[]) setLineBreakWordStyle.setDividerPadding(new Object[]{y10}, 2030043801, -2030043799, System.identityHashCode(y10)), bArr6, (byte[]) setLineBreakWordStyle.setDividerPadding(new Object[]{y10}, 1837279069, -1837279064, System.identityHashCode(y10)));
        byte[] y11 = setdivider.setY((byte[]) setLineBreakWordStyle.setDividerPadding(new Object[]{y10}, 2030043801, -2030043799, System.identityHashCode(y10)));
        setdivider.setX(y11);
        Random.INSTANCE.nextBytes(y11);
        setdivider.setOnFocusChangeListener(setdivider.setX((byte[]) setLineBreakWordStyle.setDividerPadding(new Object[]{y10}, -2041063060, 2041063061, System.identityHashCode(y10)), (byte[]) setTextClassifier.setCompoundDrawableTintBlendMode(new Object[]{(UUID) setWillNotDraw.setOnFocusChangeListener(new Object[]{y10}, 1609564975, -1609564971, System.identityHashCode(y10))}, 230957076, -230957076, (int) System.currentTimeMillis())));
        getscope.setX(new String(setdivider.setX((byte[]) setWillNotDraw.setOnFocusChangeListener(new Object[]{y10}, 1704641920, -1704641915, System.identityHashCode(y10)), (byte[]) setTextClassifier.setCompoundDrawableTintBlendMode(new Object[]{(UUID) setWillNotDraw.setOnFocusChangeListener(new Object[]{y10}, 68908064, -68908064, System.identityHashCode(y10))}, 230957076, -230957076, (int) System.currentTimeMillis())), Charsets.UTF_8));
        getscope.setOnFocusChangeListener(true);
    }

    public final long j(long j10) {
        int i10 = m + 111;
        f60188n = i10 % 128;
        int i11 = i10 % 2;
        long jMillis = (j10 + 86400000) - this.f60200h.millis();
        if (jMillis > 0) {
            int i12 = f60188n + 65;
            m = i12 % 128;
            int i13 = i12 % 2;
            return jMillis;
        }
        int i14 = f60188n + 39;
        m = i14 % 128;
        if (i14 % 2 == 0) {
            return 0L;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00de  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f7  */
    public final boolean setCompoundDrawableTintBlendMode(@NotNull String str, @NotNull String str2) throws Throwable {
        char c10;
        char c11;
        byte b10;
        int i10;
        String str3 = "";
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String strReplace = setNetworkAvailable.setY().replace(this.f60193a.setOnLongClickListener(), "");
        if (strReplace.length() % 2 != 0) {
            Object[] objArr = new Object[1];
            b((char) View.getDefaultSize(0, 0), ViewConfiguration.getPressedStateDuration() >> 16, (ViewConfiguration.getFadingEdgeLength() >> 16) + 19, objArr);
            throw new IllegalArgumentException(((String) objArr[0]).intern().toString());
        }
        byte[] bArr = new byte[strReplace.length() / 2];
        for (int i11 = 0; i11 < strReplace.length(); i11 += 2) {
            int i12 = i11 / 2;
            Pair pair = TuplesKt.to(Character.valueOf(strReplace.charAt(i11)), Character.valueOf(strReplace.charAt(i11 + 1)));
            char cCharValue = ((Character) pair.getFirst()).charValue();
            if (cCharValue == '0') {
                b10 = 0;
            } else if (cCharValue == '1') {
                int i13 = m + 13;
                f60188n = i13 % 128;
                int i14 = i13 % 2;
                b10 = 1;
            } else if (cCharValue == '2') {
                b10 = 2;
            } else if (cCharValue == '3') {
                int i15 = m + 5;
                f60188n = i15 % 128;
                int i16 = i15 % 2;
                b10 = 3;
            } else if (cCharValue == '4') {
                b10 = 4;
            } else if (cCharValue == '5') {
                b10 = 5;
            } else if (cCharValue == '6') {
                b10 = 6;
            } else if (cCharValue == '7') {
                b10 = 7;
            } else if (cCharValue == '8') {
                int i17 = f60188n + 103;
                m = i17 % 128;
                int i18 = i17 % 2;
                b10 = 8;
            } else if (cCharValue == '9') {
                b10 = 9;
            } else if (cCharValue == 'a' || cCharValue == 'A') {
                b10 = 10;
            } else if (cCharValue == 'b') {
                int i19 = m + 15;
                f60188n = i19 % 128;
                if (i19 % 2 == 0) {
                    b10 = Constants.CVR_B1b85_0110_TERMINAL;
                } else {
                    b10 = 11;
                }
            } else if (cCharValue == 'B') {
                b10 = 11;
            } else if (cCharValue == 'c') {
                int i20 = f60188n + 13;
                m = i20 % 128;
                if (i20 % 2 != 0) {
                    b10 = 50;
                } else {
                    b10 = 12;
                }
            } else if (cCharValue == 'C') {
                b10 = 12;
            } else if (cCharValue == 'd' || cCharValue == 'D') {
                b10 = 13;
            } else if (cCharValue == 'e' || cCharValue == 'E') {
                b10 = Constants.CVR_B1b41_1110_ONLINE_PIN;
            } else {
                if (cCharValue == 'f') {
                    int i21 = m + 59;
                    f60188n = i21 % 128;
                    if (i21 % 2 == 0) {
                        b10 = 121;
                    }
                } else if (cCharValue != 'F') {
                    throw new IllegalArgumentException(String.valueOf(cCharValue));
                }
                b10 = 15;
            }
            int iM5570constructorimpl = UInt.m5570constructorimpl(UInt.m5570constructorimpl(UByte.m5545constructorimpl((byte) 16) & 255) * UInt.m5570constructorimpl(UByte.m5545constructorimpl(b10) & 255));
            char cCharValue2 = ((Character) pair.getSecond()).charValue();
            if (cCharValue2 == '0') {
                i10 = 0;
            } else if (cCharValue2 == '1') {
                i10 = 1;
            } else if (cCharValue2 == '2') {
                i10 = 2;
            } else if (cCharValue2 == '3') {
                int i22 = m + 1;
                f60188n = i22 % 128;
                int i23 = i22 % 2;
                i10 = 3;
            } else if (cCharValue2 == '4') {
                i10 = 4;
            } else if (cCharValue2 == '5') {
                int i24 = f60188n + 117;
                m = i24 % 128;
                int i25 = i24 % 2;
                i10 = 5;
            } else if (cCharValue2 == '6') {
                i10 = 6;
            } else if (cCharValue2 == '7') {
                i10 = 7;
            } else if (cCharValue2 == '8') {
                i10 = 8;
            } else if (cCharValue2 == '9') {
                int i26 = m + 1;
                f60188n = i26 % 128;
                i10 = i26 % 2 == 0 ? 118 : 9;
            } else if (cCharValue2 == 'a' || cCharValue2 == 'A') {
                i10 = 10;
            } else if (cCharValue2 == 'b' || cCharValue2 == 'B') {
                i10 = 11;
            } else if (cCharValue2 == 'c' || cCharValue2 == 'C') {
                i10 = 12;
            } else if (cCharValue2 == 'd') {
                i10 = 13;
            } else if (cCharValue2 == 'D') {
                int i27 = m + 109;
                f60188n = i27 % 128;
                int i28 = i27 % 2;
                i10 = 13;
            } else if (cCharValue2 == 'e' || cCharValue2 == 'E') {
                i10 = 14;
            } else {
                if (cCharValue2 != 'f' && cCharValue2 != 'F') {
                    throw new IllegalArgumentException(String.valueOf(cCharValue2));
                }
                i10 = 15;
            }
            bArr[i12] = (byte) UInt.m5570constructorimpl(UInt.m5570constructorimpl(i10) + iM5570constructorimpl);
        }
        TerminalSdkConfiguration terminalSdkConfiguration = new TerminalSdkConfiguration(bArr);
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "");
        byte[] bArr2 = (byte[]) TerminalSdkConfiguration.setCompoundDrawableTintBlendMode(new Object[]{terminalSdkConfiguration, bytes}, 1126200817, -1126200817, System.identityHashCode(terminalSdkConfiguration));
        if (bArr2.length != 0) {
            char[] cArr = new char[bArr2.length << 1];
            for (int i29 = 0; i29 < bArr2.length; i29++) {
                byte b11 = bArr2[i29];
                int i30 = i29 << 1;
                byte b12 = (byte) ((b11 >>> 4) & 15);
                switch (b12) {
                    case 0:
                        c10 = '0';
                        break;
                    case 1:
                        c10 = '1';
                        break;
                    case 2:
                        c10 = '2';
                        break;
                    case 3:
                        c10 = '3';
                        break;
                    case 4:
                        c10 = '4';
                        break;
                    case 5:
                        c10 = '5';
                        break;
                    case 6:
                        c10 = '6';
                        break;
                    case 7:
                        c10 = '7';
                        break;
                    case 8:
                        c10 = '8';
                        break;
                    case 9:
                        c10 = '9';
                        break;
                    case 10:
                        c10 = 'a';
                        break;
                    case 11:
                        c10 = 'b';
                        break;
                    case 12:
                        c10 = 'c';
                        break;
                    case 13:
                        c10 = 'd';
                        break;
                    case 14:
                        c10 = 'e';
                        break;
                    case 15:
                        c10 = 'f';
                        break;
                    default:
                        throw new IllegalArgumentException(String.valueOf((int) b12));
                }
                cArr[i30] = c10;
                int i31 = i30 + 1;
                byte b13 = (byte) (b11 & 15);
                switch (b13) {
                    case 0:
                        c11 = '0';
                        break;
                    case 1:
                        c11 = '1';
                        break;
                    case 2:
                        c11 = '2';
                        break;
                    case 3:
                        c11 = '3';
                        break;
                    case 4:
                        c11 = '4';
                        break;
                    case 5:
                        c11 = '5';
                        break;
                    case 6:
                        c11 = '6';
                        break;
                    case 7:
                        c11 = '7';
                        break;
                    case 8:
                        c11 = '8';
                        break;
                    case 9:
                        c11 = '9';
                        break;
                    case 10:
                        c11 = 'a';
                        break;
                    case 11:
                        c11 = 'b';
                        break;
                    case 12:
                        c11 = 'c';
                        break;
                    case 13:
                        c11 = 'd';
                        break;
                    case 14:
                        c11 = 'e';
                        break;
                    case 15:
                        c11 = 'f';
                        break;
                    default:
                        throw new IllegalArgumentException(String.valueOf((int) b13));
                }
                cArr[i31] = c11;
            }
            str3 = new String(cArr);
        }
        boolean zAreEqual = Intrinsics.areEqual(str2, str3);
        Random.INSTANCE.nextBytes(bArr);
        return zAreEqual;
    }

    @NotNull
    public final String setDividerPadding() throws Exception {
        try {
            return this.f60198f.setOnFocusChangeListener();
        } catch (Exception e5) {
            if (!(e5 instanceof setHorizontalScrollbarTrackDrawable)) {
                boolean z10 = e5 instanceof getErrorCode;
                int i10 = f60188n + 109;
                m = i10 % 128;
                int i11 = i10 % 2;
                if (!z10) {
                    throw e5;
                }
            }
            setColorFilter setcolorfilter = this.f60196d;
            if (setcolorfilter != null) {
                int i12 = m + 73;
                f60188n = i12 % 128;
                if (i12 % 2 == 0) {
                    Object[] objArr = new Object[1];
                    a(101 - (ViewConfiguration.getDoubleTapTimeout() / 87), 111 / TextUtils.lastIndexOf("", (char) 11, 0, 1), 30 >>> (ViewConfiguration.getMinimumFlingVelocity() >> 116), "\u0015\u0000\u000b\b\u0003ￋ\uffbf\u0011\u0004\r\u0004\u0016\b\r\u0006￨\u0003\u0004\r\u0013\b\u0013\u0018\uffbf\n\u0004\u0018\uffbf\b\r", true, objArr);
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
                } else {
                    Object[] objArr2 = new Object[1];
                    a(30 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 125 - TextUtils.lastIndexOf("", '0', 0, 0), 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\u0015\u0000\u000b\b\u0003ￋ\uffbf\u0011\u0004\r\u0004\u0016\b\r\u0006￨\u0003\u0004\r\u0013\b\u0013\u0018\uffbf\n\u0004\u0018\uffbf\b\r", false, objArr2);
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr2[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
                }
            }
            if (setcolorfilter != null) {
                int i13 = f60188n + 3;
                m = i13 % 128;
                int i14 = i13 % 2;
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 45, null, null, 6}, 1173867142, -1173867141, 45);
            }
            return g();
        }
    }

    public final synchronized void setOnFocusChangeListener() {
        try {
            setColorFilter setcolorfilter = this.f60196d;
            if (setcolorfilter != null) {
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 22, null, null, 6}, 1173867142, -1173867141, 22);
                int i10 = m + 49;
                f60188n = i10 % 128;
                int i11 = i10 % 2;
            }
            this.f60194b.setOnFocusChangeListener();
            this.f60193a.setX("");
            this.f60193a.setDividerPadding("", "");
            this.f60193a.setY("");
            this.f60193a.setDividerPadding("");
            this.f60193a.setOnFocusChangeListener(false);
            int i12 = m + 33;
            f60188n = i12 % 128;
            if (i12 % 2 == 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @NotNull
    public final byte[] setX() {
        int i10 = f60188n + 119;
        m = i10 % 128;
        int i11 = i10 % 2;
        setMinimumWidth setminimumwidth = this.f60198f;
        if (i11 != 0) {
            setminimumwidth.setY();
            throw null;
        }
        byte[] y7 = setminimumwidth.setY();
        int i12 = f60188n + 99;
        m = i12 % 128;
        int i13 = i12 % 2;
        return y7;
    }

    @NotNull
    public final String setDividerPadding(@NotNull byte[] bArr) {
        int i10 = f60188n + 57;
        m = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        String onFocusChangeListener = this.f60198f.setOnFocusChangeListener(bArr);
        int i12 = m + 81;
        f60188n = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 99 / 0;
        }
        return onFocusChangeListener;
    }

    public final synchronized long setCompoundDrawableTintBlendMode() {
        long j10;
        int i10 = f60188n + 7;
        m = i10 % 128;
        int i11 = i10 % 2;
        j10 = j(this.f60201i);
        int i12 = f60188n + 63;
        m = i12 % 128;
        int i13 = i12 % 2;
        return j10;
    }

    @NotNull
    public final byte[] setY(@NotNull byte[] bArr) throws Throwable {
        byte b10;
        int i10;
        Intrinsics.checkNotNullParameter(bArr, "");
        String strReplace = setNetworkAvailable.setY().replace(this.f60193a.setOnFocusChangeListener(), "");
        char c10 = '0';
        if (strReplace.length() % 2 == 0) {
            int i11 = m + 59;
            f60188n = i11 % 128;
            int i12 = i11 % 2;
            byte[] bArr2 = new byte[strReplace.length() / 2];
            int i13 = 0;
            while (i13 < strReplace.length()) {
                int i14 = i13 / 2;
                Pair pair = TuplesKt.to(Character.valueOf(strReplace.charAt(i13)), Character.valueOf(strReplace.charAt(i13 + 1)));
                char cCharValue = ((Character) pair.getFirst()).charValue();
                if (cCharValue == c10) {
                    int i15 = f60188n + 73;
                    m = i15 % 128;
                    int i16 = i15 % 2;
                    b10 = 0;
                } else if (cCharValue == '1') {
                    b10 = 1;
                } else if (cCharValue == '2') {
                    int i17 = m + 59;
                    f60188n = i17 % 128;
                    int i18 = i17 % 2;
                    b10 = 2;
                } else if (cCharValue == '3') {
                    b10 = 3;
                } else if (cCharValue == '4') {
                    int i19 = f60188n + 1;
                    m = i19 % 128;
                    int i20 = i19 % 2;
                    b10 = 4;
                } else if (cCharValue == '5') {
                    b10 = 5;
                } else if (cCharValue == '6') {
                    b10 = 6;
                } else if (cCharValue == '7') {
                    int i21 = f60188n + 119;
                    m = i21 % 128;
                    b10 = i21 % 2 != 0 ? (byte) 120 : (byte) 7;
                } else if (cCharValue == '8') {
                    b10 = 8;
                } else if (cCharValue == '9') {
                    b10 = 9;
                } else if (cCharValue == 'a' || cCharValue == 'A') {
                    b10 = 10;
                } else if (cCharValue == 'b' || cCharValue == 'B') {
                    b10 = 11;
                } else if (cCharValue == 'c' || cCharValue == 'C') {
                    b10 = 12;
                } else if (cCharValue == 'd' || cCharValue == 'D') {
                    b10 = 13;
                } else if (cCharValue == 'e' || cCharValue == 'E') {
                    b10 = 14;
                } else {
                    if (cCharValue == 'f') {
                        int i22 = m + 69;
                        f60188n = i22 % 128;
                        int i23 = i22 % 2;
                    } else {
                        if (cCharValue != 'F') {
                            throw new IllegalArgumentException(String.valueOf(cCharValue));
                        }
                        int i24 = f60188n + 107;
                        m = i24 % 128;
                        if (i24 % 2 != 0) {
                            b10 = MessageUtils.MESSAGE_30_RS;
                        }
                    }
                    b10 = 15;
                }
                int iM5570constructorimpl = UInt.m5570constructorimpl(UInt.m5570constructorimpl(UByte.m5545constructorimpl((byte) 16) & 255) * UInt.m5570constructorimpl(UByte.m5545constructorimpl(b10) & 255));
                char cCharValue2 = ((Character) pair.getSecond()).charValue();
                if (cCharValue2 == '0') {
                    i10 = 0;
                } else if (cCharValue2 == '1') {
                    i10 = 1;
                } else if (cCharValue2 == '2') {
                    i10 = 2;
                } else if (cCharValue2 == '3') {
                    i10 = 3;
                } else if (cCharValue2 == '4') {
                    i10 = 4;
                } else if (cCharValue2 == '5') {
                    i10 = 5;
                } else if (cCharValue2 == '6') {
                    i10 = 6;
                } else if (cCharValue2 == '7') {
                    i10 = 7;
                } else if (cCharValue2 == '8') {
                    i10 = 8;
                } else if (cCharValue2 == '9') {
                    i10 = 9;
                } else {
                    if (cCharValue2 == 'a') {
                        int i25 = m + 43;
                        f60188n = i25 % 128;
                        int i26 = i25 % 2;
                    } else if (cCharValue2 != 'A') {
                        if (cCharValue2 == 'b' || cCharValue2 == 'B') {
                            i10 = 11;
                        } else if (cCharValue2 == 'c' || cCharValue2 == 'C') {
                            i10 = 12;
                        } else if (cCharValue2 == 'd' || cCharValue2 == 'D') {
                            i10 = 13;
                        } else if (cCharValue2 == 'e') {
                            i10 = 14;
                        } else if (cCharValue2 == 'E') {
                            int i27 = f60188n + 59;
                            m = i27 % 128;
                            int i28 = i27 % 2;
                            i10 = 14;
                        } else {
                            if (cCharValue2 == 'f') {
                                int i29 = m + 121;
                                f60188n = i29 % 128;
                                if (i29 % 2 == 0) {
                                    i10 = 110;
                                }
                            } else if (cCharValue2 != 'F') {
                                throw new IllegalArgumentException(String.valueOf(cCharValue2));
                            }
                            i10 = 15;
                        }
                    }
                    i10 = 10;
                }
                bArr2[i14] = (byte) UInt.m5570constructorimpl(UInt.m5570constructorimpl(i10) + iM5570constructorimpl);
                i13 += 2;
                c10 = '0';
            }
            ahx ahxVar = (ahx) ahx.setCompoundDrawableTintBlendMode(new Object[]{bArr2}, 1906174166, -1906174164, (int) System.currentTimeMillis());
            anw anwVar = new anw((BigInteger) ahx.setCompoundDrawableTintBlendMode(new Object[]{ahxVar}, 397751114, -397751113, System.identityHashCode(ahxVar)), (BigInteger) ahx.setCompoundDrawableTintBlendMode(new Object[]{ahxVar}, 389614071, -389614068, System.identityHashCode(ahxVar)));
            amd amdVar = new amd(new amf());
            amdVar.setX(true, anwVar);
            byte[] bArrPlus = new byte[0];
            for (int i30 = 0; i30 < bArr.length; i30 += 245) {
                byte[] onFocusChangeListener = amdVar.setOnFocusChangeListener(bArr, i30, c.coerceAtMost(bArr.length - i30, 245));
                Intrinsics.checkNotNullExpressionValue(onFocusChangeListener, "");
                bArrPlus = ArraysKt___ArraysJvmKt.plus(bArrPlus, onFocusChangeListener);
            }
            return bArrPlus;
        }
        Object[] objArr = new Object[1];
        b((char) TextUtils.getOffsetBefore("", 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 18 - TextUtils.indexOf((CharSequence) "", '0'), objArr);
        throw new IllegalArgumentException(((String) objArr[0]).intern().toString());
    }

    public final synchronized void setCompoundDrawableTintBlendMode(@NotNull setVerticalScrollbarPosition setverticalscrollbarposition, boolean z10) {
        Intrinsics.checkNotNullParameter(setverticalscrollbarposition, "");
        try {
            if (!this.f60193a.setNavigationOnClickListener()) {
                int i10 = f60188n + 117;
                m = i10 % 128;
                if (i10 % 2 == 0) {
                    i(setverticalscrollbarposition);
                    if (this.f60196d != null) {
                        Object[] objArr = new Object[1];
                        b((char) (View.resolveSizeAndState(0, 0, 0) + 5710), 18 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15, objArr);
                        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
                    }
                } else {
                    i(setverticalscrollbarposition);
                    throw null;
                }
            } else if (this.f60194b.setX()) {
                int i11 = setDividerPadding.setX[e(this.f60201i).ordinal()];
                if (i11 == 1) {
                    setY(new Object[]{this, setverticalscrollbarposition}, -1704222589, 1704222590, System.identityHashCode(this));
                    if (this.f60196d != null) {
                        Object[] objArr2 = new Object[1];
                        a(32 - (ViewConfiguration.getScrollBarSize() >> 8), 124 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), 8 - TextUtils.lastIndexOf("", '0'), "\u0006\u0006\u0013\b\u0002\uffc1\u001a\u0006\f\u0005\u0006\u0013\n\u0011\u0019\u0006\uffc1\u001a\u0006\f\uffc1\u0010\u0015\uffc1\u0006\u0016\u0005\uffc1\u0015\u000f\u0006\u000e", true, objArr2);
                        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr2[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
                    }
                } else {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            if (this.f60196d != null) {
                                Object[] objArr3 = new Object[1];
                                b((char) (43209 - KeyEvent.normalizeMetaState(0)), ((Process.getThreadPriority(0) + 20) >> 6) + 80, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12, objArr3);
                                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr3[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
                            }
                            if (z10) {
                                int i12 = m + 97;
                                f60188n = i12 % 128;
                                int i13 = i12 % 2;
                                f(setverticalscrollbarposition);
                                if (this.f60196d != null) {
                                    Object[] objArr4 = new Object[1];
                                    b((char) Color.green(0), 92 - TextUtils.indexOf("", "", 0, 0), 31 - Color.blue(0), objArr4);
                                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr4[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
                                }
                            }
                        }
                        return;
                    }
                    f(setverticalscrollbarposition);
                    if (this.f60196d != null) {
                        int i14 = m + 19;
                        f60188n = i14 % 128;
                        if (i14 % 2 == 0) {
                            Object[] objArr5 = new Object[1];
                            b((char) (ViewConfiguration.getScrollBarFadeDuration() / 125), (TypedValue.complexToFraction(0, 1.0f, 1.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 1.0f, 1.0f) == 0.0f ? 0 : -1)) + 77, 39 % (ViewConfiguration.getTouchSlop() % 115), objArr5);
                            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr5[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
                        } else {
                            Object[] objArr6 = new Object[1];
                            b((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 70, 10 - (ViewConfiguration.getTouchSlop() >> 8), objArr6);
                            setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr6[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
                        }
                    }
                }
            } else {
                setY(new Object[]{this, setverticalscrollbarposition}, -1704222589, 1704222590, System.identityHashCode(this));
                if (this.f60196d != null) {
                    Object[] objArr7 = new Object[1];
                    b((char) (53420 - View.MeasureSpec.makeMeasureSpec(0, 0)), 34 - Color.green(0), 36 - TextUtils.indexOf("", ""), objArr7);
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr7[0]).intern()}, 2065174743, -2065174734, (int) System.currentTimeMillis());
                }
            }
        } catch (Exception e5) {
            if (this.f60196d != null) {
                Object[] objArr8 = new Object[1];
                a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 18, 132 - TextUtils.indexOf("", ""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 9, "\u0002\u0007\u0000ﾹ\uffff\ufffa\u0002\u0005\ufffe�\t\u000b\b\u000f\u0002\f\u0002\b\u0007", false, objArr8);
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr8[0]).intern()}, -821746216, 821746227, (int) System.currentTimeMillis());
            }
            setColorFilter setcolorfilter = this.f60196d;
            if (setcolorfilter != null) {
                setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 21, getDisplayExponent.setY(setDividerPadding()), e5}, -1999045713, 1999045717, 21);
                int i15 = m + 83;
                f60188n = i15 % 128;
                int i16 = i15 % 2;
            }
            if ((!(e5 instanceof setAutoLinkMask)) && !(e5 instanceof KeyExpiredException)) {
                throw e5;
            }
            if (this.f60196d != null) {
                int i17 = f60188n + 53;
                m = i17 % 128;
                if (i17 % 2 != 0) {
                    Object[] objArr9 = new Object[1];
                    b((char) (42944 % (ViewConfiguration.getTouchSlop() + 21)), 27 % (AudioTrack.getMinVolume() > 2.0f ? 1 : (AudioTrack.getMinVolume() == 2.0f ? 0 : -1)), 123 << (Process.myTid() + 80), objArr9);
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr9[0]).intern()}, 44246425, -44246418, (int) System.currentTimeMillis());
                } else {
                    Object[] objArr10 = new Object[1];
                    b((char) ((ViewConfiguration.getTouchSlop() >> 8) + 42944), 123 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 24 - (Process.myTid() >> 22), objArr10);
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{((String) objArr10[0]).intern()}, 44246425, -44246418, (int) System.currentTimeMillis());
                }
            }
            setColorFilter setcolorfilter2 = this.f60196d;
            if (setcolorfilter2 != null) {
                int i18 = f60188n + 19;
                m = i18 % 128;
                if (i18 % 2 != 0) {
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter2, 66, null, null, 8}, 1173867142, -1173867141, 66);
                } else {
                    setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter2, 27, null, null, 6}, 1173867142, -1173867141, 27);
                }
            }
            g();
            i(setverticalscrollbarposition);
        }
    }

    @Nullable
    public final String setY() {
        return (String) setY(new Object[]{this}, 659333055, -659333055, System.identityHashCode(this));
    }
}
