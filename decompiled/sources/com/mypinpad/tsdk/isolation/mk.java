package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.app.NotificationCompat;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.bbva.tohu.android.product.valkyria.sdk.services.intents.GetTokenWithDelayService;
import com.bbva.tohu.android.product.valkyria.sdk.services.intents.GetTransactionHistoryIntentService;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.i18n.ErrorBundle;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0011\bÀ\u0002\u0018\u00002\u00020\u0001:\u0001>B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J+\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000eH\u0000¢\u0006\u0002\b\u0011J'\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0002\b\u0019J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\r\u0010 \u001a\u00020\fH\u0000¢\u0006\u0002\b!J\u001d\u0010\"\u001a\u00020\u001b2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0000¢\u0006\u0002\b$J\r\u0010%\u001a\u00020\u001bH\u0000¢\u0006\u0002\b&J\r\u0010'\u001a\u00020\u001bH\u0000¢\u0006\u0002\b(J\u0010\u0010)\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0010\u0010*\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J\u0010\u0010+\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002J)\u0010,\u001a\u00020\f2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0000¢\u0006\u0002\b0J'\u00101\u001a\u00020\u001b2\u0006\u00102\u001a\u00020\u00162\u0006\u00103\u001a\u00020.2\b\b\u0002\u00104\u001a\u00020\u000eH\u0000¢\u0006\u0002\b5J\u0015\u00106\u001a\u00020\f2\u0006\u00107\u001a\u00020\bH\u0000¢\u0006\u0002\b8J\r\u00109\u001a\u00020\fH\u0000¢\u0006\u0002\b:J\r\u0010;\u001a\u00020\fH\u0000¢\u0006\u0002\b<J\u0010\u0010=\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002R\u0014\u0010\u0003\u001a\u00020\u00048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006?"}, d2 = {"Lcom/mypinpad/tsdk/internal/attestation/Attestation;", "", "()V", "attestationApi", "Lcom/mypinpad/attestation/integration/AttestationModuleApi;", "getAttestationApi", "()Lcom/mypinpad/attestation/integration/AttestationModuleApi;", "attestationService", "Lcom/mypinpad/attestation/integration/AttestationService;", "config", "Lcom/mypinpad/tsdk/internal/attestation/Attestation$AttestationConfig;", "configure", "", "enableLocalAttestationForDebugBuilds", "", "bypassInstallationSource", "isDebugBuild", "configure$sdk_android_release", "debugLog", "logLevel", "Lcom/mypinpad/common/logging/LogLevel;", "message", "", "throwable", "", "debugLog$sdk_android_release", "filterSpecificLocalFailures", "Lcom/mypinpad/attestation/integration/AttestationResult;", "result", "failuresToBypass", "", "Lcom/mypinpad/attestation/integration/LocalAttestationType;", "initialiseLocalAttestation", "initialiseLocalAttestation$sdk_android_release", "localAttestation", "attestors", "localAttestation$sdk_android_release", "localAttestationFailureCheck", "localAttestationFailureCheck$sdk_android_release", "localAttestationLight", "localAttestationLight$sdk_android_release", "loggingLocalAttestationResult", "raiseEventLocal", "raiseEventRemote", "redactedLog", "opcode", "", ErrorBundle.DETAIL_ENTRY, "redactedLog$sdk_android_release", "remoteAttestation", "instanceId", "minTokenAvailabilityInMillis", "ignoreCache", "remoteAttestation$sdk_android_release", "setAttestationService", NotificationCompat.CATEGORY_SERVICE, "setAttestationService$sdk_android_release", "startContinuousAttestation", "startContinuousAttestation$sdk_android_release", "stopContinuousAttestation", "stopContinuousAttestation$sdk_android_release", "transformLocalAttestationResult", "AttestationConfig", "sdk-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAttestation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Attestation.kt\ncom/mypinpad/tsdk/internal/attestation/Attestation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,378:1\n1#2:379\n766#3:380\n857#3,2:381\n*S KotlinDebug\n*F\n+ 1 Attestation.kt\ncom/mypinpad/tsdk/internal/attestation/Attestation\n*L\n246#1:380\n246#1:381,2\n*E\n"})
public final class mk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static setChildIndicatorBounds f57090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static a f57091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f57092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f57093d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f57094e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f57095f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static byte[] f57096g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f57097h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f57098i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static int f57099j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static int f57100k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final byte[] f57101l = null;
    public static final int m = 0;

    @NotNull
    public static final mk setOnFocusChangeListener;

    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f57102d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f57103e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f57104f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f57105g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static int f57106h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final byte[] f57107i = null;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f57108a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f57109b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f57110c;

        static {
            c();
            f57105g = 0;
            f57106h = 1;
            f57103e = 0;
            f57104f = 1;
            f57102d = -8619797898741705519L;
        }

        public a(boolean z10, boolean z11, boolean z12) {
            this.f57108a = z10;
            this.f57109b = z11;
            this.f57110c = z12;
        }

        /* JADX WARN: Code duplicated, block: B:56:0x02d9  */
        /* JADX WARN: Code duplicated, block: B:57:0x02da  */
        public static void a(String str, int i10, Object[] objArr) throws Throwable {
            Throwable cause;
            char[] charArray = str.toCharArray();
            int i11 = f57106h + 71;
            f57105g = i11 % 128;
            int i12 = 2;
            int i13 = i11 % 2;
            setLayoutAnimation setlayoutanimation = new setLayoutAnimation();
            setlayoutanimation.setOnFocusChangeListener = i10;
            int length = charArray.length;
            long[] jArr = new long[length];
            int i14 = 0;
            setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
            while (true) {
                int i15 = setlayoutanimation.setCompoundDrawableTintBlendMode;
                if (i15 >= charArray.length) {
                    break;
                }
                int i16 = f57106h + 85;
                f57105g = i16 % 128;
                int i17 = i16 % i12;
                long j10 = f57102d;
                if (i17 != 0) {
                    char c10 = charArray[i15];
                    try {
                        Object[] objArr2 = new Object[3];
                        objArr2[i12] = setlayoutanimation;
                        objArr2[1] = setlayoutanimation;
                        objArr2[i14] = Integer.valueOf(c10);
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(-764403778);
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) ('0' - AndroidCharacter.getMirror('0')), 33 - TextUtils.indexOf("", "", i14, i14), 1195 - (ExpandableListView.getPackedPositionForGroup(i14) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i14) == 0L ? 0 : -1)));
                            byte b10 = (byte) 1;
                            byte b11 = (byte) (b10 - 1);
                            Object[] objArr3 = new Object[1];
                            b(b11, b11, b10, objArr3);
                            method = cls.getMethod((String) objArr3[0], Integer.TYPE, Object.class, Object.class);
                            map.put(-764403778, method);
                        }
                        jArr[i15] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() & (j10 % 1779209353347916695L);
                        Object[] objArr4 = {setlayoutanimation, setlayoutanimation};
                        Object method2 = map.get(645183118);
                        if (method2 == null) {
                            Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getWindowTouchSlop() >> 8), Color.alpha(0) + 44, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 727);
                            byte b12 = (byte) 0;
                            byte b13 = b12;
                            Object[] objArr5 = new Object[1];
                            b(b13, b13, b12, objArr5);
                            method2 = cls2.getMethod((String) objArr5[0], Object.class, Object.class);
                            map.put(645183118, method2);
                        }
                        ((Method) method2).invoke(null, objArr4);
                    } catch (Throwable th2) {
                        cause = th2.getCause();
                        if (cause != null) {
                            throw th2;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr6 = {Integer.valueOf(charArray[i15]), setlayoutanimation, setlayoutanimation};
                    Map map2 = setTextScaleX.setMaxEms;
                    Object method3 = map2.get(-764403778);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 32 - ImageFormat.getBitsPerPixel(0), 1195 - (ViewConfiguration.getTouchSlop() >> 8));
                        byte b14 = (byte) 1;
                        byte b15 = (byte) (b14 - 1);
                        Object[] objArr7 = new Object[1];
                        b(b15, b15, b14, objArr7);
                        method3 = cls3.getMethod((String) objArr7[0], Integer.TYPE, Object.class, Object.class);
                        map2.put(-764403778, method3);
                    }
                    jArr[i15] = ((Long) ((Method) method3).invoke(null, objArr6)).longValue() ^ (j10 ^ 1779209353347916695L);
                    Object[] objArr8 = {setlayoutanimation, setlayoutanimation};
                    Object method4 = map2.get(645183118);
                    if (method4 == null) {
                        Class cls4 = (Class) setTextScaleX.setX((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), TextUtils.indexOf("", "") + 44, (ViewConfiguration.getTouchSlop() >> 8) + 728);
                        byte b16 = (byte) 0;
                        byte b17 = b16;
                        Object[] objArr9 = new Object[1];
                        b(b17, b17, b16, objArr9);
                        method4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                        map2.put(645183118, method4);
                    }
                    ((Method) method4).invoke(null, objArr8);
                    charArray = charArray;
                }
                i12 = 2;
                i14 = 0;
                cause = th2.getCause();
                if (cause != null) {
                    throw th2;
                }
                throw cause;
            }
            char[] cArr = charArray;
            char[] cArr2 = new char[length];
            setlayoutanimation.setCompoundDrawableTintBlendMode = 0;
            while (true) {
                int i18 = setlayoutanimation.setCompoundDrawableTintBlendMode;
                char[] cArr3 = cArr;
                if (i18 >= cArr3.length) {
                    objArr[0] = new String(cArr2);
                    return;
                }
                int i19 = f57105g + 53;
                f57106h = i19 % 128;
                if (i19 % 2 == 0) {
                    cArr2[i18] = (char) jArr[i18];
                    Object[] objArr10 = {setlayoutanimation, setlayoutanimation};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method5 = map3.get(645183118);
                    if (method5 == null) {
                        Class cls5 = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionChild(0L) + 1), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 45, Color.green(0) + 728);
                        byte b18 = (byte) 0;
                        byte b19 = b18;
                        Object[] objArr11 = new Object[1];
                        b(b19, b19, b18, objArr11);
                        method5 = cls5.getMethod((String) objArr11[0], Object.class, Object.class);
                        map3.put(645183118, method5);
                    }
                    ((Method) method5).invoke(null, objArr10);
                    throw null;
                }
                cArr2[i18] = (char) jArr[i18];
                Object[] objArr12 = {setlayoutanimation, setlayoutanimation};
                Map map4 = setTextScaleX.setMaxEms;
                Object method6 = map4.get(645183118);
                if (method6 == null) {
                    Class cls6 = (Class) setTextScaleX.setX((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 44 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollBarSize() >> 8) + 728);
                    byte b20 = (byte) 0;
                    byte b21 = b20;
                    Object[] objArr13 = new Object[1];
                    b(b21, b21, b20, objArr13);
                    method6 = cls6.getMethod((String) objArr13[0], Object.class, Object.class);
                    map4.put(645183118, method6);
                }
                ((Method) method6).invoke(null, objArr12);
                cArr = cArr3;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002b  */
        /* JADX WARN: Code duplicated, block: B:8:0x0023  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0035). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void b(byte r7, byte r8, short r9, java.lang.Object[] r10) {
            /*
                int r9 = r9 * 3
                int r9 = r9 + 107
                int r7 = r7 * 4
                int r7 = 1 - r7
                int r8 = r8 * 4
                int r8 = 4 - r8
                byte[] r0 = new byte[r7]
                byte[] r1 = com.mypinpad.tsdk.i.mk.a.f57107i
                r2 = 0
                if (r1 != 0) goto L1b
                r3 = r1
                r4 = r2
                r1 = r0
                r0 = r10
                r10 = r9
                r9 = r8
                r8 = r7
                goto L35
            L1b:
                r3 = r2
            L1c:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r0[r3] = r5
                if (r4 != r7) goto L2b
                java.lang.String r7 = new java.lang.String
                r7.<init>(r0, r2)
                r10[r2] = r7
                return
            L2b:
                r3 = r1[r8]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                r10 = r9
                r9 = r6
            L35:
                int r7 = r7 + r10
                int r9 = r9 + 1
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r6 = r9
                r9 = r7
                r7 = r8
                r8 = r6
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.mk.a.b(byte, byte, short, java.lang.Object[]):void");
        }

        public static void c() {
            f57107i = new byte[]{72, 8, Constants.CVR_B1b85_0110_TERMINAL, -53};
        }

        public static /* synthetic */ Boolean d(Object[] objArr) {
            a aVar = (a) objArr[0];
            int i10 = f57104f + 97;
            f57103e = i10 % 128;
            int i11 = i10 % 2;
            boolean z10 = aVar.f57108a;
            if (i11 != 0) {
                int i12 = 18 / 0;
            }
            return Boolean.valueOf(z10);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                int i10 = f57104f + 121;
                f57103e = i10 % 128;
                int i11 = i10 % 2;
                return true;
            }
            if (!(obj instanceof a)) {
                int i12 = f57104f + 43;
                f57103e = i12 % 128;
                int i13 = i12 % 2;
                return false;
            }
            a aVar = (a) obj;
            if (this.f57108a != aVar.f57108a) {
                return false;
            }
            if (this.f57109b == aVar.f57109b) {
                return this.f57110c == aVar.f57110c;
            }
            int i14 = f57103e + 113;
            f57104f = i14 % 128;
            int i15 = i14 % 2;
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0 */
        /* JADX WARN: Type inference failed for: r0v1 */
        /* JADX WARN: Type inference failed for: r0v2, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3, types: [int] */
        /* JADX WARN: Type inference failed for: r1v5, types: [int] */
        /* JADX WARN: Type inference failed for: r1v6 */
        /* JADX WARN: Type inference failed for: r1v7 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v10 */
        /* JADX WARN: Type inference failed for: r2v9 */
        public final int hashCode() {
            ?? r1 = 1;
            boolean z10 = this.f57108a;
            ?? r3 = z10;
            if (z10) {
                r3 = 1;
            }
            int i10 = r3 * 31;
            boolean z11 = this.f57109b;
            boolean z12 = !z11 ? 1 : 0;
            ?? r4 = z11;
            if (z12 != 1) {
                int i11 = f57103e + 37;
                f57104f = i11 % 128;
                int i12 = i11 % 2;
                r4 = 1;
            }
            int i13 = (i10 + r4) * 31;
            boolean z13 = this.f57110c;
            if (z13) {
                int i14 = f57104f + 111;
                f57103e = i14 % 128;
                int i15 = i14 % 2;
            } else {
                r1 = z13;
            }
            return i13 + r1;
        }

        @NotNull
        public final String toString() throws Throwable {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            a("眇愽嬬㔎⼉\u1979\uf37d\ued5b읗놮ꮾ薠羝槫䏲㷎៑Ƒ鶴퐵츋렟鉠豺晢偞䪣⒲Ẏࢴ\ue2f0\udce3뛃ꃚ髌猪洮䜄ㄓ⭡\u0558ｎ\ue942쎇붷鞇膁篠嗔俬㧁Ꮧమ\ue62e큑", 5647 - TextUtils.getCapsMode("", 0, 0), objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(this.f57108a);
            Object[] objArr2 = new Object[1];
            a("睪徧⚦ർ퐲볢莳橲ㄇ᧡\ue0bf띹鸫曧䶤ᑨﬢ쏾ꪻ煻堁\u20fc\uf7a5\ude63ꔽ跺員", ((Process.getThreadPriority(0) + 20) >> 6) + 10433, objArr2);
            sb2.append(((String) objArr2[0]).intern());
            sb2.append(this.f57109b);
            Object[] objArr3 = new Object[1];
            a("睪榅䫩⮜ಎ\ued4c칶꼆耹拿䏭⓮֎\ue6a5윑", (Process.myTid() >> 22) + 7907, objArr3);
            sb2.append(((String) objArr3[0]).intern());
            sb2.append(this.f57110c);
            sb2.append(RootService.CLOSE_BRACKET);
            String string = sb2.toString();
            int i10 = f57103e + 33;
            f57104f = i10 % 128;
            if (i10 % 2 != 0) {
                return string;
            }
            throw null;
        }
    }

    static {
        e();
        f57099j = 0;
        f57100k = 1;
        f57097h = 0;
        f57098i = 1;
        d();
        setOnFocusChangeListener = new mk();
        f57091b = new a(false, false, false);
        int i10 = f57098i + 123;
        f57097h = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x024e  */
    /* JADX WARN: Code duplicated, block: B:47:0x024f  */
    public static void a(int i10, int i11, int i12, Object[] objArr) throws Throwable {
        int i13;
        int i14;
        Throwable cause;
        int i15 = f57099j + 119;
        f57100k = i15 % 128;
        int i16 = 2;
        if (i15 % 2 == 0) {
            "\ufffe\uffff\r\u0003\u0006\ufffb\u0003\u000e\u0003\b\u0003ﾺ\u000e\t\b".toCharArray();
            throw null;
        }
        char[] charArray = "\ufffe\uffff\r\u0003\u0006\ufffb\u0003\u000e\u0003\b\u0003ﾺ\u000e\t\b".toCharArray();
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr = new char[i10];
        int i17 = 0;
        getnavbartitlestring.setY = 0;
        while (true) {
            int i18 = getnavbartitlestring.setY;
            i13 = m;
            if (i18 >= i10) {
                break;
            }
            int i19 = f57099j + 11;
            f57100k = i19 % 128;
            int i20 = i19 % i16;
            char c10 = charArray[i18];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
            char c11 = (char) (i11 + c10);
            cArr[i18] = c11;
            try {
                Object[] objArr2 = new Object[i16];
                objArr2[1] = Integer.valueOf(f57092c);
                objArr2[i17] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) View.getDefaultSize(i17, i17), 42 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 484 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)));
                    byte b10 = (byte) (i13 - 2);
                    Object[] objArr3 = new Object[1];
                    c(f57101l[i17], b10, b10, objArr3);
                    String str = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr[i18] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (View.MeasureSpec.getSize(0) + 55966), 43 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "", 0) + 2268);
                    byte b11 = (byte) (i13 - 2);
                    Object[] objArr5 = new Object[1];
                    c((byte) (i13 | 45), b11, b11, objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                int i21 = f57100k + 19;
                f57099j = i21 % 128;
                int i22 = i21 % 2;
                charArray = charArray;
                i16 = 2;
                i17 = 0;
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
            getnavbartitlestring.setOnFocusChangeListener = i12;
            char[] cArr2 = new char[i10];
            i14 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, i10);
            int i23 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, 0, cArr, i10 - i23, i23);
            int i24 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr2, i24, cArr, 0, i10 - i24);
        } else {
            i14 = 0;
        }
        char[] cArr3 = new char[i10];
        getnavbartitlestring.setY = i14;
        while (true) {
            int i25 = getnavbartitlestring.setY;
            if (i25 >= i10) {
                int i26 = f57099j + 111;
                f57100k = i26 % 128;
                int i27 = i26 % 2;
                objArr[0] = new String(cArr3);
                return;
            }
            int i28 = f57100k + 3;
            f57099j = i28 % 128;
            if (i28 % 2 != 0) {
                cArr3[i25] = cArr[(i10 - i25) + 1];
                Object[] objArr6 = {getnavbartitlestring, getnavbartitlestring};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(1860518195);
                if (method3 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (55966 - (ViewConfiguration.getLongPressTimeout() >> 16)), View.MeasureSpec.getSize(0) + 43, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2267);
                    byte b12 = (byte) (i13 - 2);
                    Object[] objArr7 = new Object[1];
                    c((byte) (i13 | 45), b12, b12, objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1860518195, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            } else {
                cArr3[i25] = cArr[(i10 - i25) - 1];
                Object[] objArr8 = {getnavbartitlestring, getnavbartitlestring};
                Map map3 = setTextScaleX.setMaxEms;
                Object method4 = map3.get(1860518195);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (55966 - (ViewConfiguration.getTouchSlop() >> 8)), Color.rgb(0, 0, 0) + 16777259, (ViewConfiguration.getFadingEdgeLength() >> 16) + 2268);
                    byte b13 = (byte) (i13 - 2);
                    Object[] objArr9 = new Object[1];
                    c((byte) (i13 | 45), b13, b13, objArr9);
                    method4 = cls5.getMethod((String) objArr9[0], Object.class, Object.class);
                    map3.put(1860518195, method4);
                }
                ((Method) method4).invoke(null, objArr8);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0229 A[PHI: r3
      0x0229: PHI (r3v35 int) = (r3v10 int), (r3v38 int) binds: [B:53:0x0227, B:50:0x0214] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:55:0x022b A[PHI: r3
      0x022b: PHI (r3v11 int) = (r3v10 int), (r3v38 int) binds: [B:53:0x0227, B:50:0x0214] A[DONT_GENERATE, DONT_INLINE]] */
    public static void b(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
        int i13;
        int i14;
        boolean z10;
        int i15;
        setTextAlignment settextalignment = new setTextAlignment();
        StringBuilder sb2 = new StringBuilder();
        int i16 = 2;
        try {
            int i17 = 1;
            Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(f57094e)};
            Map map = setTextScaleX.setMaxEms;
            Object method = map.get(-769569468);
            int i18 = m;
            if (method == null) {
                Class cls = (Class) setTextScaleX.setX((char) View.getDefaultSize(0, 0), (Process.myPid() >> 22) + 49, 434 - ExpandableListView.getPackedPositionGroup(0L));
                byte b11 = (byte) (i18 + 1);
                byte b12 = (byte) (b11 - 3);
                Object[] objArr3 = new Object[1];
                c(b11, b12, b12, objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                method = cls.getMethod(str, cls2, cls2);
                map.put(-769569468, method);
            }
            int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
            boolean z11 = iIntValue == -1;
            if (z11) {
                byte[] bArr = f57096g;
                float f6 = 0.0f;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i19 = 0;
                    while (i19 < length) {
                        int i20 = f57099j + 99;
                        f57100k = i20 % 128;
                        if (i20 % i16 == 0) {
                            Object[] objArr4 = new Object[i17];
                            objArr4[0] = Integer.valueOf(bArr[i19]);
                            Map map2 = setTextScaleX.setMaxEms;
                            Object method2 = map2.get(510767826);
                            if (method2 == null) {
                                method2 = ((Class) setTextScaleX.setX((char) ((AudioTrack.getMaxVolume() > f6 ? 1 : (AudioTrack.getMaxVolume() == f6 ? 0 : -1)) + 49110), 41 - KeyEvent.keyCodeFromString(""), 51 - TextUtils.lastIndexOf("", '0', 0))).getMethod("s", Integer.TYPE);
                                map2.put(510767826, method2);
                            }
                            bArr2[i19] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                        } else {
                            length = length;
                            Object[] objArr5 = {Integer.valueOf(bArr[i19])};
                            Map map3 = setTextScaleX.setMaxEms;
                            Object method3 = map3.get(510767826);
                            if (method3 == null) {
                                method3 = ((Class) setTextScaleX.setX((char) (49111 - (Process.myTid() >> 22)), 41 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), KeyEvent.keyCodeFromString("") + 52)).getMethod("s", Integer.TYPE);
                                map3.put(510767826, method3);
                            }
                            bArr2[i19] = ((Byte) ((Method) method3).invoke(null, objArr5)).byteValue();
                            i19++;
                        }
                        length = length;
                        i16 = 2;
                        i17 = 1;
                        f6 = 0.0f;
                    }
                    bArr = bArr2;
                }
                bArr.getClass();
                byte[] bArr3 = f57096g;
                Object[] objArr6 = {Integer.valueOf(i12), Integer.valueOf(f57093d)};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(-769569468);
                if (method4 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), ((Process.getThreadPriority(0) + 20) >> 6) + 49, View.MeasureSpec.getMode(0) + 434);
                    byte b13 = (byte) (i18 + 1);
                    byte b14 = (byte) (b13 - 3);
                    Object[] objArr7 = new Object[1];
                    c(b13, b14, b14, objArr7);
                    String str2 = (String) objArr7[0];
                    Class<?> cls4 = Integer.TYPE;
                    method4 = cls3.getMethod(str2, cls4, cls4);
                    map4.put(-769569468, method4);
                }
                iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method4).invoke(null, objArr6)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) f57094e) ^ 7616081452308447380L)));
            }
            if (iIntValue > 0) {
                int i21 = f57100k + 119;
                f57099j = i21 % 128;
                if (i21 % 2 != 0) {
                    i13 = ((i12 * iIntValue) >>> 5) - ((int) (((long) f57093d) / 7616081452308447380L));
                    if (!z11) {
                        i14 = 0;
                    } else {
                        i14 = 1;
                    }
                } else {
                    i13 = ((i12 + iIntValue) - 2) + ((int) (((long) f57093d) ^ 7616081452308447380L));
                    if (z11) {
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                }
                settextalignment.setX = i13 + i14;
                Object[] objArr8 = {settextalignment, Integer.valueOf(i11), Integer.valueOf(f57095f), sb2};
                Map map5 = setTextScaleX.setMaxEms;
                Object method5 = map5.get(193260760);
                if (method5 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 41 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 2803);
                    byte b15 = (byte) (i18 - 2);
                    byte b16 = b15;
                    Object[] objArr9 = new Object[1];
                    c(b15, b16, b16, objArr9);
                    String str3 = (String) objArr9[0];
                    Class<?> cls6 = Integer.TYPE;
                    method5 = cls5.getMethod(str3, Object.class, cls6, cls6, Object.class);
                    map5.put(193260760, method5);
                }
                ((StringBuilder) ((Method) method5).invoke(null, objArr8)).append(settextalignment.setCompoundDrawableTintBlendMode);
                settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                byte[] bArr4 = f57096g;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i22 = 0;
                    while (i22 < length2) {
                        bArr5[i22] = (byte) (((long) bArr4[i22]) ^ 7616081452308447380L);
                        i22++;
                        int i23 = f57099j + 67;
                        f57100k = i23 % 128;
                        int i24 = i23 % 2;
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    i15 = 1;
                    z10 = true;
                } else {
                    z10 = false;
                    i15 = 1;
                }
                while (true) {
                    settextalignment.setDividerPadding = i15;
                    if (settextalignment.setDividerPadding >= iIntValue) {
                        break;
                    }
                    int i25 = f57099j + 19;
                    int i26 = i25 % 128;
                    f57100k = i26;
                    int i27 = i25 % 2;
                    if (!z10) {
                        settextalignment.setX--;
                        throw null;
                    }
                    int i28 = i26 + 35;
                    f57099j = i28 % 128;
                    if (i28 % 2 != 0) {
                        byte[] bArr6 = f57096g;
                        int i29 = settextalignment.setX;
                        settextalignment.setX = i29 << 1;
                        settextalignment.setCompoundDrawableTintBlendMode = (char) (settextalignment.setY << (((byte) (((byte) (((long) bArr6[i29]) - 7616081452308447380L)) << s4)) ^ b10));
                    } else {
                        byte[] bArr7 = f57096g;
                        int i30 = settextalignment.setX;
                        settextalignment.setX = i30 - 1;
                        settextalignment.setCompoundDrawableTintBlendMode = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr7[i30]) ^ 7616081452308447380L)) + s4)) ^ b10));
                    }
                    sb2.append(settextalignment.setCompoundDrawableTintBlendMode);
                    settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                    i15 = settextalignment.setDividerPadding + 1;
                }
            }
            String string = sb2.toString();
            int i31 = f57100k + 49;
            f57099j = i31 % 128;
            int i32 = i31 % 2;
            objArr[0] = string;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0031). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r0 = r8 + 1
            int r6 = 112 - r6
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.mk.f57101l
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L31
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L31:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r8 + 1
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.mk.c(byte, byte, byte, java.lang.Object[]):void");
    }

    public static void d() {
        f57092c = -443080042;
        f57093d = -1479032256;
        f57094e = -1454817107;
        f57095f = -1522832718;
        f57096g = new byte[]{107, 102, -98, 105, -97, 108, Constants.DIRECTORY_ENTRY, -97, Constants.FCI_TEMPLATE, -111, -35, 56, -111, -107, -38, 47, -106, 110, 103, -112, -103, 102, -57, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 107, -110, Constants.DIRECTORY_ENTRY, -121, 121, -107, -102, 101, -108, -89, -108};
    }

    public static void e() {
        f57101l = new byte[]{46, -94, 74, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG};
        m = 2;
    }

    public static void f(hashCode hashcode) throws Throwable {
        int i10 = f57098i + 19;
        f57097h = i10 % 128;
        if (i10 % 2 != 0) {
            j(hashcode);
            Intrinsics.areEqual(hashcode, hashCode.setOnFocusChangeListener.INSTANCE);
            throw null;
        }
        j(hashcode);
        if (Intrinsics.areEqual(hashcode, hashCode.setOnFocusChangeListener.INSTANCE)) {
            mu.setCompoundDrawableTintBlendMode(new Object[]{100012, null, null, 6}, -1968587119, 1968587120, 100012);
        } else if (hashcode instanceof hashCode.setX) {
            int i11 = f57098i + 11;
            f57097h = i11 % 128;
            if (i11 % 2 != 0) {
                hashCode.setX setx = (hashCode.setX) hashcode;
                throw null;
            }
            hashCode.setX setx2 = (hashCode.setX) hashcode;
            List list = (List) hashCode.setX.setX(new Object[]{setx2}, 1826201742, -1826201742, System.identityHashCode(setx2));
            mu.setCompoundDrawableTintBlendMode(new Object[]{100013, list != null ? (getDynamicButtonIconTextSpacingDp) mi.setX(new Object[]{list}, -456774774, 456774785, (int) System.currentTimeMillis()) : null, null, 4}, -1968587119, 1968587120, 100013);
        }
        List list2 = (List) mi.setX(new Object[]{hashcode}, -908642657, 908642670, (int) System.currentTimeMillis());
        if (!list2.isEmpty()) {
            int i12 = f57098i + 33;
            int i13 = i12 % 128;
            f57097h = i13;
            int i14 = i12 % 2;
            int i15 = i13 + 33;
            f57098i = i15 % 128;
            if (i15 % 2 == 0) {
                mu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(GetTransactionHistoryIntentService.JOB_ID), (getDynamicButtonIconTextSpacingDp) mi.setX(new Object[]{list2}, -456774774, 456774785, (int) System.currentTimeMillis()), null, 3}, -1968587119, 1968587120, GetTransactionHistoryIntentService.JOB_ID);
            } else {
                mu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(GetTransactionHistoryIntentService.JOB_ID), (getDynamicButtonIconTextSpacingDp) mi.setX(new Object[]{list2}, -456774774, 456774785, (int) System.currentTimeMillis()), null, 4}, -1968587119, 1968587120, GetTransactionHistoryIntentService.JOB_ID);
            }
        }
        int i16 = f57097h + 9;
        f57098i = i16 % 128;
        int i17 = i16 % 2;
    }

    @JvmName(name = "getAttestationApi")
    public static getValueQualifier g() {
        int i10 = f57097h + 15;
        f57098i = i10 % 128;
        if (i10 % 2 != 0) {
            return nf.setOnFocusChangeListener();
        }
        nf.setOnFocusChangeListener();
        throw null;
    }

    public static hashCode h(hashCode hashcode) {
        boolean z10;
        int i10 = f57098i + 71;
        f57097h = i10 % 128;
        int i11 = i10 % 2;
        a aVar = f57091b;
        Object[] objArr = {aVar};
        System.identityHashCode(aVar);
        if (!a.d(objArr).booleanValue()) {
            int i12 = f57097h + 33;
            f57098i = i12 % 128;
            int i13 = i12 % 2;
            a aVar2 = f57091b;
            aVar2.getClass();
            int i14 = a.f57103e + 19;
            a.f57104f = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
            if (!(!aVar2.f57110c)) {
                return hashCode.setOnFocusChangeListener.INSTANCE;
            }
        }
        getTransactionPortrait gettransactionportrait = getTransactionPortrait.setOnLongClickListener;
        a aVar3 = f57091b;
        aVar3.getClass();
        int i15 = a.f57103e + 65;
        a.f57104f = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 52 / 0;
        }
        if (!aVar3.f57109b) {
            gettransactionportrait = null;
        }
        List listListOfNotNull = CollectionsKt__CollectionsKt.listOfNotNull(gettransactionportrait);
        if (hashcode instanceof hashCode.setOnFocusChangeListener) {
            int i17 = f57097h + 113;
            int i18 = i17 % 128;
            f57098i = i18;
            int i19 = i17 % 2;
            int i20 = i18 + 97;
            f57097h = i20 % 128;
            if (i20 % 2 != 0) {
                throw null;
            }
        } else {
            if (!(hashcode instanceof hashCode.setX)) {
                throw new NoWhenBranchMatchedException();
            }
            hashCode.setX setx = (hashCode.setX) hashcode;
            List list = (List) hashCode.setX.setX(new Object[]{setx}, 1826201742, -1826201742, System.identityHashCode(setx));
            Intrinsics.checkNotNull(list);
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                setAutoSizeTextTypeUniformWithPresetSizes setautosizetexttypeuniformwithpresetsizes = (setAutoSizeTextTypeUniformWithPresetSizes) obj;
                if (listListOfNotNull.contains((getTransactionPortrait) setAutoSizeTextTypeUniformWithPresetSizes.setCompoundDrawableTintBlendMode(new Object[]{setautosizetexttypeuniformwithpresetsizes}, -2144215474, 2144215475, System.identityHashCode(setautosizetexttypeuniformwithpresetsizes)))) {
                    z10 = false;
                } else {
                    int i21 = f57098i + 65;
                    f57097h = i21 % 128;
                    int i22 = i21 % 2;
                    z10 = true;
                }
                if (!(!z10)) {
                    int i23 = f57097h + 95;
                    f57098i = i23 % 128;
                    int i24 = i23 % 2;
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                mu.setCompoundDrawableTintBlendMode(new Object[]{Integer.valueOf(GetTokenWithDelayService.JOB_ID), new setIndicatorBounds(new getDynamicButtonIconTextSpacingDp[]{(getDynamicButtonIconTextSpacingDp) mi.setX(new Object[]{list}, -456774774, 456774785, (int) System.currentTimeMillis())}, null, 2, null), null, 4}, -1968587119, 1968587120, GetTokenWithDelayService.JOB_ID);
                hashcode = hashCode.setOnFocusChangeListener.INSTANCE;
            } else {
                hashcode = new hashCode.setX((String) hashCode.setX.setX(new Object[]{setx}, 1995127706, -1995127705, System.identityHashCode(setx)), arrayList, null, 4, null);
            }
        }
        int i25 = f57098i + 61;
        f57097h = i25 % 128;
        int i26 = i25 % 2;
        return hashcode;
    }

    public static void j(hashCode hashcode) throws Throwable {
        int i10 = f57097h + 19;
        f57098i = i10 % 128;
        int i11 = i10 % 2;
        if (Intrinsics.areEqual(hashcode, hashCode.setOnFocusChangeListener.INSTANCE)) {
            pc.setY(new oy(mh.setX.ordinal()));
            return;
        }
        if (hashcode instanceof hashCode.setX) {
            hashCode.setX setx = (hashCode.setX) hashcode;
            pc.setY(new ou(null, null, 10071, getDisplayExponent.setY((String) hashCode.setX.setX(new Object[]{setx}, 1995127706, -1995127705, System.identityHashCode(setx))), 3, null));
        }
        int i12 = f57098i + 29;
        f57097h = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002f, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0032, code lost:
    
        if ((r9 instanceof com.mypinpad.tsdk.i.hashCode.setX) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        r9 = (com.mypinpad.tsdk.i.hashCode.setX) r9;
        com.mypinpad.tsdk.isolation.pc.setY(new com.mypinpad.tsdk.isolation.ou(null, null, 10072, com.mypinpad.tsdk.isolation.getDisplayExponent.setY((java.lang.String) com.mypinpad.tsdk.i.hashCode.setX.setX(new java.lang.Object[]{r9}, 1995127706, -1995127705, java.lang.System.identityHashCode(r9))), 3, null));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
    
        r9 = com.mypinpad.tsdk.isolation.mk.f57097h + 31;
        com.mypinpad.tsdk.isolation.mk.f57098i = r9 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0068, code lost:
    
        if ((r9 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        r9 = 18 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9, com.mypinpad.tsdk.i.hashCode.setOnFocusChangeListener.INSTANCE) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r9, com.mypinpad.tsdk.i.hashCode.setOnFocusChangeListener.INSTANCE) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        com.mypinpad.tsdk.isolation.pc.setY(new com.mypinpad.tsdk.isolation.oy(com.mypinpad.tsdk.isolation.mh.setDividerPadding.ordinal()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void k(com.mypinpad.tsdk.isolation.hashCode r9) throws java.lang.Throwable {
        /*
            int r0 = com.mypinpad.tsdk.isolation.mk.f57097h
            int r0 = r0 + 81
            int r1 = r0 % 128
            com.mypinpad.tsdk.isolation.mk.f57098i = r1
            int r0 = r0 % 2
            r1 = 0
            if (r0 != 0) goto L19
            com.mypinpad.tsdk.i.hashCode$setOnFocusChangeListener r0 = com.mypinpad.tsdk.i.hashCode.setOnFocusChangeListener.INSTANCE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r0)
            r2 = 80
            int r2 = r2 / r1
            if (r0 == 0) goto L30
            goto L21
        L19:
            com.mypinpad.tsdk.i.hashCode$setOnFocusChangeListener r0 = com.mypinpad.tsdk.i.hashCode.setOnFocusChangeListener.INSTANCE
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r0)
            if (r0 == 0) goto L30
        L21:
            com.mypinpad.tsdk.i.oy r9 = new com.mypinpad.tsdk.i.oy
            com.mypinpad.tsdk.i.mh r0 = com.mypinpad.tsdk.isolation.mh.setDividerPadding
            int r0 = r0.ordinal()
            r9.<init>(r0)
            com.mypinpad.tsdk.isolation.pc.setY(r9)
            return
        L30:
            boolean r0 = r9 instanceof com.mypinpad.tsdk.i.hashCode.setX
            if (r0 == 0) goto L5e
            com.mypinpad.tsdk.i.ou r0 = new com.mypinpad.tsdk.i.ou
            r3 = 0
            r4 = 0
            r5 = 10072(0x2758, float:1.4114E-41)
            com.mypinpad.tsdk.i.hashCode$setX r9 = (com.mypinpad.tsdk.i.hashCode.setX) r9
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r9
            int r9 = java.lang.System.identityHashCode(r9)
            r6 = 1995127706(0x76eb3b9a, float:2.3855442E33)
            r7 = -1995127705(0xffffffff8914c467, float:-1.79072E-33)
            java.lang.Object r9 = com.mypinpad.tsdk.i.hashCode.setX.setX(r2, r6, r7, r9)
            java.lang.String r9 = (java.lang.String) r9
            com.mypinpad.tsdk.i.getDynamicButtonIconTextSpacingDp r6 = com.mypinpad.tsdk.isolation.getDisplayExponent.setY(r9)
            r7 = 3
            r8 = 0
            r2 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.mypinpad.tsdk.isolation.pc.setY(r0)
        L5e:
            int r9 = com.mypinpad.tsdk.isolation.mk.f57097h
            int r9 = r9 + 31
            int r0 = r9 % 128
            com.mypinpad.tsdk.isolation.mk.f57098i = r0
            int r9 = r9 % 2
            if (r9 != 0) goto L6d
            r9 = 18
            int r9 = r9 / r1
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.mk.k(com.mypinpad.tsdk.i.hashCode):void");
    }

    public static Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        mq mqVar;
        int i13;
        int i14 = ~i12;
        int i15 = ~(i14 | i10);
        int i16 = ((i11 | i15) * 764) + (i11 * (-1527)) + (i10 * 765);
        int i17 = ~((~i10) | i11);
        int i18 = (((~(i10 | (~i11))) | i17 | i15) * 764) + (((~(i14 | i11)) | i17) * (-1528)) + i16;
        hashCode y7 = null;
        if (i18 == 1) {
            boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
            boolean zBooleanValue2 = ((Boolean) objArr[1]).booleanValue();
            boolean zBooleanValue3 = ((Boolean) objArr[2]).booleanValue();
            int i19 = f57098i + 13;
            f57097h = i19 % 128;
            int i20 = i19 % 2;
            a aVar = new a(zBooleanValue, zBooleanValue2, zBooleanValue3);
            int i21 = a.f57103e + 31;
            a.f57104f = i21 % 128;
            if (i21 % 2 == 0) {
                throw null;
            }
            f57091b = aVar;
            int i22 = f57098i + 59;
            f57097h = i22 % 128;
            if (i22 % 2 != 0) {
                int i23 = 91 / 0;
            }
        } else if (i18 != 2) {
            int iIntValue = ((Number) objArr[0]).intValue();
            String str = (String) objArr[1];
            Throwable th2 = (Throwable) objArr[2];
            int i24 = f57098i + 13;
            f57097h = i24 % 128;
            if (i24 % 2 != 0) {
                mqVar = mq.INSTANCE;
                i13 = iIntValue >>> 110000;
            } else {
                mqVar = mq.INSTANCE;
                i13 = iIntValue + 110000;
            }
            mqVar.setY(i13, str, th2);
            int i25 = f57097h + 17;
            f57098i = i25 % 128;
            int i26 = i25 % 2;
        } else {
            mk mkVar = (mk) objArr[0];
            String str2 = (String) objArr[1];
            int iIntValue2 = ((Number) objArr[2]).intValue();
            int i27 = f57098i + 115;
            f57097h = i27 % 128;
            int i28 = i27 % 2;
            y7 = mkVar.setY(str2, iIntValue2, false);
            int i29 = f57098i + 19;
            f57097h = i29 % 128;
            if (i29 % 2 != 0) {
                int i30 = 63 / 0;
            }
        }
        return y7;
    }

    public static void setOnFocusChangeListener(boolean z10, boolean z11, boolean z12, int i10) {
        if ((i10 & 1) != 0) {
            a aVar = f57091b;
            System.identityHashCode(aVar);
            z10 = a.d(new Object[]{aVar}).booleanValue();
        }
        if ((i10 & 2) != 0) {
            int i11 = f57097h + 45;
            f57098i = i11 % 128;
            int i12 = i11 % 2;
            a aVar2 = f57091b;
            aVar2.getClass();
            int i13 = a.f57103e + 65;
            a.f57104f = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 52 / 0;
            }
            z11 = aVar2.f57109b;
        }
        if ((i10 & 4) != 0) {
            int i15 = f57097h + 37;
            f57098i = i15 % 128;
            int i16 = i15 % 2;
            a aVar3 = f57091b;
            aVar3.getClass();
            int i17 = a.f57103e + 19;
            a.f57104f = i17 % 128;
            if (i17 % 2 == 0) {
                throw null;
            }
            z12 = aVar3.f57110c;
        }
        setDividerPadding(new Object[]{Boolean.valueOf(z10), Boolean.valueOf(z11), Boolean.valueOf(z12)}, -1155701672, 1155701673, (int) System.currentTimeMillis());
    }

    public static void setY(@NotNull setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay, @NotNull String str) {
        int i10 = f57098i + 95;
        f57097h = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(sethorizontalscrollbaroverlay, "");
            Intrinsics.checkNotNullParameter(str, "");
            ms msVar = ms.INSTANCE;
            mr mrVar = mr.setOnFocusChangeListener;
            msVar.setCompoundDrawableTintBlendMode(sethorizontalscrollbaroverlay, str);
            return;
        }
        Intrinsics.checkNotNullParameter(sethorizontalscrollbaroverlay, "");
        Intrinsics.checkNotNullParameter(str, "");
        ms msVar2 = ms.INSTANCE;
        mr mrVar2 = mr.setOnFocusChangeListener;
        msVar2.setCompoundDrawableTintBlendMode(sethorizontalscrollbaroverlay, str);
        throw null;
    }

    @NotNull
    public final synchronized hashCode i(@NotNull List<? extends getTransactionPortrait> list) {
        hashCode setx;
        hashCode hashcodeH;
        try {
            int i10 = f57098i + 61;
            f57097h = i10 % 128;
            int i11 = i10 % 2;
            Intrinsics.checkNotNullParameter(list, "");
            try {
                setx = g().setY(list).setCompoundDrawableTintBlendMode();
                int i12 = f57097h + 37;
                f57098i = i12 % 128;
                int i13 = i12 % 2;
            } catch (init unused) {
                Object[] objArr = new Object[1];
                a('?' - AndroidCharacter.getMirror('0'), 180 - Drawable.resolveOpacity(0, 0), 15 - TextUtils.getOffsetBefore("", 0), objArr);
                setx = new hashCode.setX(((String) objArr[0]).intern(), null, null, 6, null);
            }
            hashcodeH = h(setx);
            f(hashcodeH);
        } catch (Throwable th2) {
            throw th2;
        }
        return hashcodeH;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x003e, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        return i(kotlin.collections.CollectionsKt__CollectionsKt.emptyList());
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001c, code lost:
    
        if (r0.booleanValue() != true) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0028, code lost:
    
        if (r0.booleanValue() != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002a, code lost:
    
        r0 = i(bk.d.listOf(com.mypinpad.tsdk.isolation.getTransactionPortrait.getAmountFieldTextColor));
        r1 = com.mypinpad.tsdk.isolation.mk.f57098i + 113;
        com.mypinpad.tsdk.isolation.mk.f57097h = r1 % 128;
        r1 = r1 % 2;
     */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.mypinpad.tsdk.isolation.hashCode setCompoundDrawableTintBlendMode() {
        /*
            r3 = this;
            int r0 = com.mypinpad.tsdk.isolation.mk.f57097h
            int r0 = r0 + 71
            int r1 = r0 % 128
            com.mypinpad.tsdk.isolation.mk.f57098i = r1
            int r0 = r0 % 2
            java.lang.String r1 = ""
            if (r0 != 0) goto L1f
            java.lang.Boolean r0 = com.mypinpad.tsdk.isolation.mg.setCompoundDrawableTintBlendMode
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = r0.booleanValue()
            r1 = 56
            int r1 = r1 / 0
            r1 = 1
            if (r0 == r1) goto L2a
            goto L3f
        L1f:
            java.lang.Boolean r0 = com.mypinpad.tsdk.isolation.mg.setCompoundDrawableTintBlendMode
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3f
        L2a:
            com.mypinpad.tsdk.i.getTransactionPortrait r0 = com.mypinpad.tsdk.isolation.getTransactionPortrait.getAmountFieldTextColor
            java.util.List r0 = bk.d.listOf(r0)
            com.mypinpad.tsdk.i.hashCode r0 = r3.i(r0)
            int r1 = com.mypinpad.tsdk.isolation.mk.f57098i
            int r1 = r1 + 113
            int r2 = r1 % 128
            com.mypinpad.tsdk.isolation.mk.f57097h = r2
            int r1 = r1 % 2
            return r0
        L3f:
            java.util.List r0 = kotlin.collections.CollectionsKt__CollectionsKt.emptyList()
            com.mypinpad.tsdk.i.hashCode r0 = r3.i(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.mk.setCompoundDrawableTintBlendMode():com.mypinpad.tsdk.i.hashCode");
    }

    public final synchronized void setX() {
        pc.setY(new oy(mh.setCompoundDrawableTintBlendMode.ordinal()));
        getValueQualifier getvaluequalifierG = g();
        Duration durationOfHours = Duration.ofHours(1L);
        Intrinsics.checkNotNullExpressionValue(durationOfHours, "");
        getvaluequalifierG.setY(durationOfHours, CollectionsKt__CollectionsKt.listOf((Object[]) new getTransactionPortrait[]{getTransactionPortrait.setCompoundDrawableTintBlendMode, getTransactionPortrait.setIncludeFontPadding}));
        g().setY(CollectionsKt__CollectionsKt.listOf((Object[]) new getTransactionPortrait[]{getTransactionPortrait.setOnDragListener, getTransactionPortrait.setZ}));
        int i10 = f57097h + 65;
        f57098i = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 77 / 0;
        }
    }

    public static void setY() {
        int i10 = f57097h + 101;
        f57098i = i10 % 128;
        int i11 = i10 % 2;
        g().setDividerPadding();
        int i12 = f57098i + 119;
        f57097h = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    @NotNull
    public final synchronized hashCode setY(@NotNull String str, int i10, boolean z10) {
        hashCode setx;
        try {
            int i11 = f57097h + 47;
            f57098i = i11 % 128;
            int i12 = i11 % 2;
            Intrinsics.checkNotNullParameter(str, "");
            try {
                setChildIndicatorBounds setchildindicatorbounds = f57090a;
                if (setchildindicatorbounds != null) {
                    getValueQualifier onFocusChangeListener = nf.setOnFocusChangeListener();
                    UUID uuidFromString = UUID.fromString(str);
                    Intrinsics.checkNotNullExpressionValue(uuidFromString, "");
                    onFocusChangeListener.setOnFocusChangeListener((byte[]) vb.setY(new Object[]{uuidFromString}, 1288849308, -1288849306, (int) System.currentTimeMillis()));
                    setx = onFocusChangeListener.setDividerPadding(setchildindicatorbounds, i10, z10);
                    if (setx == null) {
                        Object[] objArr = new Object[1];
                        b((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 22, (byte) TextUtils.indexOf("", "", 0, 0), (short) (TextUtils.lastIndexOf("", '0') + 1), (-208808421) - KeyEvent.getDeadChar(0, 0), (-245269204) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr);
                        setx = new hashCode.setX(((String) objArr[0]).intern(), null, null, 6, null);
                    }
                    int i13 = f57098i + 13;
                    f57097h = i13 % 128;
                    int i14 = i13 % 2;
                } else {
                    Object[] objArr2 = new Object[1];
                    b((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) - 22, (byte) TextUtils.indexOf("", "", 0, 0), (short) (TextUtils.lastIndexOf("", '0') + 1), (-208808421) - KeyEvent.getDeadChar(0, 0), (-245269204) - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr2);
                    setx = new hashCode.setX(((String) objArr2[0]).intern(), null, null, 6, null);
                    int i15 = f57098i + 13;
                    f57097h = i15 % 128;
                    int i16 = i15 % 2;
                }
            } catch (init unused) {
                Object[] objArr3 = new Object[1];
                a(16 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 179, View.MeasureSpec.makeMeasureSpec(0, 0) + 15, objArr3);
                setx = new hashCode.setX(((String) objArr3[0]).intern(), null, null, 6, null);
            }
            k(setx);
            int i17 = f57098i + 123;
            f57097h = i17 % 128;
            if (i17 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return setx;
    }

    public static /* synthetic */ hashCode setOnFocusChangeListener(mk mkVar) {
        int i10 = f57098i + 47;
        f57097h = i10 % 128;
        int i11 = i10 % 2;
        List listMutableListOf = CollectionsKt__CollectionsKt.mutableListOf(getTransactionPortrait.setCompoundDrawableTintBlendMode, getTransactionPortrait.setOnFocusChangeListener, getTransactionPortrait.setY, getTransactionPortrait.setDividerPadding, getTransactionPortrait.setOnLongClickListener, getTransactionPortrait.setNavigationOnClickListener, getTransactionPortrait.setLayoutAnimation, getTransactionPortrait.setOnDragListener, getTransactionPortrait.getNavBarTitleString, getTransactionPortrait.setTextAlignment, getTransactionPortrait.setZ, getTransactionPortrait.setAlwaysDrawnWithCacheEnabled, getTransactionPortrait.setIncludeFontPadding);
        Boolean bool = mg.setCompoundDrawableTintBlendMode;
        Intrinsics.checkNotNullExpressionValue(bool, "");
        if (!(!bool.booleanValue())) {
            int i12 = f57097h + 113;
            f57098i = i12 % 128;
            int i13 = i12 % 2;
            listMutableListOf.add(getTransactionPortrait.UiMessageCallbackKtWhenMappings);
        }
        return mkVar.i(CollectionsKt___CollectionsKt.toList(listMutableListOf));
    }

    public static void setDividerPadding() {
        int i10 = f57097h + 79;
        f57098i = i10 % 128;
        if (i10 % 2 != 0) {
            g().setX();
        } else {
            g().setX();
            throw null;
        }
    }

    public final synchronized void setDividerPadding(@NotNull setChildIndicatorBounds setchildindicatorbounds) {
        int i10 = f57098i + 39;
        f57097h = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(setchildindicatorbounds, "");
            f57090a = setchildindicatorbounds;
            int i11 = f57097h + 55;
            f57098i = i11 % 128;
            int i12 = i11 % 2;
        } else {
            Intrinsics.checkNotNullParameter(setchildindicatorbounds, "");
            f57090a = setchildindicatorbounds;
            throw null;
        }
    }

    public static void setY(int i10, @Nullable String str, @Nullable Throwable th2) {
        setDividerPadding(new Object[]{Integer.valueOf(i10), str, th2}, 1893589161, -1893589161, i10);
    }

    @NotNull
    public final hashCode setOnFocusChangeListener() {
        List<? extends getTransactionPortrait> listListOf;
        int i10 = f57097h + 33;
        f57098i = i10 % 128;
        if (i10 % 2 == 0) {
            getTransactionPortrait[] gettransactionportraitArr = new getTransactionPortrait[4];
            gettransactionportraitArr[1] = getTransactionPortrait.setCompoundDrawableTintBlendMode;
            gettransactionportraitArr[1] = getTransactionPortrait.setIncludeFontPadding;
            gettransactionportraitArr[5] = getTransactionPortrait.setAlwaysDrawnWithCacheEnabled;
            gettransactionportraitArr[3] = getTransactionPortrait.setDividerPadding;
            gettransactionportraitArr[2] = getTransactionPortrait.getAmountFieldTextColor;
            listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) gettransactionportraitArr);
        } else {
            listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new getTransactionPortrait[]{getTransactionPortrait.setCompoundDrawableTintBlendMode, getTransactionPortrait.setIncludeFontPadding, getTransactionPortrait.setAlwaysDrawnWithCacheEnabled, getTransactionPortrait.setDividerPadding, getTransactionPortrait.getAmountFieldTextColor});
        }
        hashCode hashcodeI = i(listListOf);
        int i11 = f57097h + 95;
        f57098i = i11 % 128;
        if (i11 % 2 != 0) {
            return hashcodeI;
        }
        throw null;
    }

    public static /* synthetic */ hashCode setOnFocusChangeListener(mk mkVar, String str, int i10) {
        return (hashCode) setDividerPadding(new Object[]{mkVar, str, Integer.valueOf(i10)}, -538518537, 538518539, i10);
    }
}
