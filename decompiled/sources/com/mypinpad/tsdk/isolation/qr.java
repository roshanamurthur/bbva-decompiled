package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.vierge.pinpadsdk.message.base.MessageUtils;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/mypinpad/tsdk/i/qr;", "", "Lorg/json/JSONObject;", "p0", "Lcom/mypinpad/tsdk/i/applicationCreated;", "setY", "(Lorg/json/JSONObject;)Lcom/mypinpad/tsdk/i/applicationCreated;", "<init>", "()V"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPayloadDeserializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PayloadDeserializer.kt\ncom/mypinpad/tsdk/internal/remote/attestation/serialization/PayloadDeserializer\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,77:1\n1603#2,9:78\n1855#2:87\n1856#2:89\n1612#2:90\n1#3:88\n*S KotlinDebug\n*F\n+ 1 PayloadDeserializer.kt\ncom/mypinpad/tsdk/internal/remote/attestation/serialization/PayloadDeserializer\n*L\n31#1:78,9\n31#1:87\n31#1:89\n31#1:90\n31#1:88\n*E\n"})
public final class qr {

    @NotNull
    public static final qr INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static char[] f57969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static char f57970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static long f57971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f57972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f57973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f57974f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f57975g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f57976h = null;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lorg/json/JSONObject;", "Lcom/mypinpad/tsdk/i/setIndeterminateDrawableTiled;", "d", "(Lorg/json/JSONObject;)Lcom/mypinpad/tsdk/i/setIndeterminateDrawableTiled;"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function1<JSONObject, setIndeterminateDrawableTiled> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f57977p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static char f57978q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static char f57979r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static char f57980s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static char f57981t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static int f57982u0;
        public static int v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public static int f57983w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public static int f57984x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public static final byte[] f57985y0 = null;

        static {
            c();
            f57983w0 = 0;
            f57984x0 = 1;
            f57982u0 = 0;
            v0 = 1;
            e();
            f57977p0 = new a(1);
            int i10 = f57982u0 + 125;
            v0 = i10 % 128;
            int i11 = i10 % 2;
        }

        public a() {
            super(1);
        }

        public static void a(String str, int i10, Object[] objArr) throws Throwable {
            byte[] bArr;
            char[] charArray = str.toCharArray();
            int i11 = f57983w0 + 77;
            f57984x0 = i11 % 128;
            int i12 = 2;
            int i13 = i11 % 2;
            setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
            char[] cArr = new char[charArray.length];
            int i14 = 0;
            setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
            char[] cArr2 = new char[2];
            while (true) {
                int i15 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
                if (i15 >= charArray.length) {
                    objArr[0] = new String(cArr, 0, i10);
                    return;
                }
                cArr2[i14] = charArray[i15];
                cArr2[1] = charArray[i15 + 1];
                int i16 = 58224;
                int i17 = i14;
                while (true) {
                    bArr = f57985y0;
                    if (i17 >= 16) {
                        break;
                    }
                    int i18 = f57983w0 + 107;
                    f57984x0 = i18 % 128;
                    int i19 = i18 % i12;
                    char c10 = cArr2[1];
                    char c11 = cArr2[i14];
                    char[] cArr3 = cArr2;
                    int i20 = (c11 + i16) ^ ((c11 << 4) + ((char) (((long) f57980s0) ^ 4333817592127744003L)));
                    int i21 = c11 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(f57981t0);
                        objArr2[i12] = Integer.valueOf(i21);
                        objArr2[1] = Integer.valueOf(i20);
                        objArr2[0] = Integer.valueOf(c10);
                        Map map = setTextScaleX.setMaxEms;
                        Object method = map.get(-1434759016);
                        if (method == null) {
                            Class cls = (Class) setTextScaleX.setX((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 48533), ExpandableListView.getPackedPositionChild(0L) + 48, 2672 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                            byte b10 = (byte) (bArr[i12] + 1);
                            byte b11 = b10;
                            Object[] objArr3 = new Object[1];
                            b(b11, b10, b11, objArr3);
                            String str2 = (String) objArr3[0];
                            Class<?> cls2 = Integer.TYPE;
                            method = cls.getMethod(str2, cls2, cls2, cls2, cls2);
                            map.put(-1434759016, method);
                        }
                        char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        Object[] objArr4 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i16) ^ ((cCharValue << 4) + ((char) (((long) f57978q0) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f57979r0)};
                        Object method2 = map.get(-1434759016);
                        if (method2 == null) {
                            Class cls3 = (Class) setTextScaleX.setX((char) (48534 - TextUtils.getCapsMode("", 0, 0)), KeyEvent.getDeadChar(0, 0) + 47, 2671 - TextUtils.indexOf((CharSequence) "", '0'));
                            byte b12 = (byte) (bArr[2] + 1);
                            byte b13 = b12;
                            Object[] objArr5 = new Object[1];
                            b(b13, b12, b13, objArr5);
                            String str3 = (String) objArr5[0];
                            Class<?> cls4 = Integer.TYPE;
                            method2 = cls3.getMethod(str3, cls4, cls4, cls4, cls4);
                            map.put(-1434759016, method2);
                        }
                        cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        i16 -= 40503;
                        i17++;
                        cArr2 = cArr3;
                        i12 = 2;
                        i14 = 0;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                char[] cArr4 = cArr2;
                int i22 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
                cArr[i22] = cArr4[0];
                cArr[i22 + 1] = cArr4[1];
                Object[] objArr6 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(1396159716);
                if (method3 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getPressedStateDuration() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 37, Color.blue(0) + 2145);
                    byte b14 = (byte) (-bArr[2]);
                    byte b15 = (byte) (b14 - 1);
                    Object[] objArr7 = new Object[1];
                    b(b15, b14, b15, objArr7);
                    method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1396159716, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                int i23 = f57984x0 + 55;
                f57983w0 = i23 % 128;
                int i24 = i23 % 2;
                i12 = 2;
                cArr2 = cArr4;
                i14 = 0;
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
        public static void b(byte r7, short r8, short r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 3
                int r7 = 4 - r7
                int r9 = r9 * 3
                int r9 = 1 - r9
                int r8 = r8 * 2
                int r8 = r8 + 103
                byte[] r0 = new byte[r9]
                byte[] r1 = com.mypinpad.tsdk.i.qr.a.f57985y0
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
                byte r5 = (byte) r8
                r0[r3] = r5
                if (r4 != r9) goto L2b
                java.lang.String r7 = new java.lang.String
                r7.<init>(r0, r2)
                r10[r2] = r7
                return
            L2b:
                r3 = r1[r7]
                r6 = r8
                r8 = r7
                r7 = r3
                r3 = r1
                r1 = r0
                r0 = r10
                r10 = r9
                r9 = r6
            L35:
                int r7 = -r7
                int r7 = r7 + r9
                int r8 = r8 + 1
                r9 = r10
                r10 = r0
                r0 = r1
                r1 = r3
                r3 = r4
                r6 = r8
                r8 = r7
                r7 = r6
                goto L1c
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.qr.a.b(byte, short, short, java.lang.Object[]):void");
        }

        public static void c() {
            f57985y0 = new byte[]{27, 72, -1, 67};
        }

        public static void e() {
            f57981t0 = (char) 49795;
            f57980s0 = (char) 696;
            f57978q0 = (char) 22409;
            f57979r0 = (char) 37332;
        }

        @NotNull
        public final setIndeterminateDrawableTiled d(@NotNull JSONObject jSONObject) throws Throwable {
            Intrinsics.checkNotNullParameter(jSONObject, "");
            Object[] objArr = new Object[1];
            a("ᑐ臌鰁矈닡‧\u1ad9銠芇足", KeyEvent.normalizeMetaState(0) + 10, objArr);
            String string = jSONObject.getString(((String) objArr[0]).intern());
            Intrinsics.checkNotNullExpressionValue(string, "");
            Object[] objArr2 = new Object[1];
            a("㛢Ḥ\uee3c\udb4eꢫ揮ꄅ붗铠錿", Color.red(0) + 10, objArr2);
            int i10 = jSONObject.getInt(((String) objArr2[0]).intern());
            Object[] objArr3 = new Object[1];
            a("\udc6cᝌ࣏泠㎑✸䀖㰱\uf346難", Color.rgb(0, 0, 0) + 16777225, objArr3);
            String string2 = jSONObject.getString(((String) objArr3[0]).intern());
            Intrinsics.checkNotNullExpressionValue(string2, "");
            setIndeterminateDrawableTiled setindeterminatedrawabletiled = new setIndeterminateDrawableTiled(string, i10, string2);
            int i11 = f57982u0 + 99;
            v0 = i11 % 128;
            int i12 = i11 % 2;
            return setindeterminatedrawabletiled;
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ setIndeterminateDrawableTiled invoke(JSONObject jSONObject) throws Throwable {
            int i10 = v0 + 67;
            f57982u0 = i10 % 128;
            JSONObject jSONObject2 = jSONObject;
            if (i10 % 2 != 0) {
                d(jSONObject2);
                throw null;
            }
            setIndeterminateDrawableTiled setindeterminatedrawabletiledD = d(jSONObject2);
            int i11 = v0 + 125;
            f57982u0 = i11 % 128;
            int i12 = i11 % 2;
            return setindeterminatedrawabletiledD;
        }
    }

    static {
        d();
        f57974f = 0;
        f57975g = 1;
        f57972d = 0;
        f57973e = 1;
        e();
        INSTANCE = new qr();
        int i10 = f57973e + 123;
        f57972d = i10 % 128;
        int i11 = i10 % 2;
    }

    public static void a(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        int i12 = f57974f + 125;
        int i13 = i12 % 128;
        f57975g = i13;
        if (i12 % 2 == 0) {
            throw null;
        }
        int i14 = i13 + 121;
        f57974f = i14 % 128;
        if (i14 % 2 != 0) {
            str.toCharArray();
            throw null;
        }
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = f57969a;
        int i15 = -1;
        int i16 = 290255894;
        int i17 = 8;
        char c10 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i18 = 0;
            while (i18 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i18])};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i16));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getScrollBarSize() >> i17), 45 - View.MeasureSpec.getSize(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1116);
                        byte b11 = (byte) i15;
                        byte b12 = (byte) (b11 + 1);
                        Object[] objArr3 = new Object[1];
                        c(b12, b11, b12, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i18] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i18++;
                    i15 = -1;
                    i16 = 290255894;
                    i17 = 8;
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
        Object[] objArr4 = {Integer.valueOf(f57970b)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) Color.alpha(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 45, KeyEvent.keyCodeFromString("") + 1116);
            byte b13 = (byte) (-1);
            byte b14 = (byte) (b13 + 1);
            Object[] objArr5 = new Object[1];
            c(b14, b13, b14, objArr5);
            method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
        char[] cArr3 = new char[i10];
        if (i10 % 2 != 0) {
            int i19 = f57974f + 45;
            f57975g = i19 % 128;
            int i20 = i19 % 2;
            i11 = i10 - 1;
            cArr3[i11] = (char) (charArray[i11] - b10);
        } else {
            i11 = i10;
        }
        char c11 = '\t';
        if (i11 > 1) {
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i21 = setincludefontpadding.setDividerPadding;
                if (i21 >= i11) {
                    break;
                }
                int i22 = f57974f;
                int i23 = i22 + 57;
                f57975g = i23 % 128;
                int i24 = i23 % 2;
                char c12 = charArray[i21];
                setincludefontpadding.setY = c12;
                int i25 = i21 + 1;
                char c13 = charArray[i25];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c13;
                if (c12 == c13) {
                    cArr3[i21] = (char) (c12 - b10);
                    cArr3[i25] = (char) (c13 - b10);
                    int i26 = i22 + 77;
                    f57975g = i26 % 128;
                    int i27 = i26 % 2;
                } else {
                    Object[] objArr6 = new Object[13];
                    objArr6[12] = setincludefontpadding;
                    objArr6[11] = Integer.valueOf(cCharValue);
                    objArr6[10] = setincludefontpadding;
                    objArr6[c11] = setincludefontpadding;
                    objArr6[8] = Integer.valueOf(cCharValue);
                    objArr6[7] = setincludefontpadding;
                    objArr6[6] = setincludefontpadding;
                    objArr6[5] = Integer.valueOf(cCharValue);
                    objArr6[4] = setincludefontpadding;
                    objArr6[3] = setincludefontpadding;
                    objArr6[2] = Integer.valueOf(cCharValue);
                    objArr6[1] = setincludefontpadding;
                    objArr6[c10] = setincludefontpadding;
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.lastIndexOf("", '0') + 28, 2311 - (Process.myPid() >> 22));
                        byte b15 = (byte) (-1);
                        byte b16 = (byte) (b15 + 4);
                        Object[] objArr7 = new Object[1];
                        c((byte) (b16 - 3), b15, b16, objArr7);
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
                            Class cls5 = (Class) setTextScaleX.setX((char) ((Process.myPid() >> 22) + 49103), 35 - View.resolveSize(0, 0), 2544 - TextUtils.lastIndexOf("", '0', 0));
                            byte b17 = (byte) (-1);
                            Object[] objArr9 = new Object[1];
                            c((byte) 0, b17, (byte) (b17 & 7), objArr9);
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
                            int i33 = f57975g + 57;
                            f57974f = i33 % 128;
                            int i34 = i33 % 2;
                            int iA = androidx.activity.a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = androidx.activity.a.a(i28, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i35 = (i32 * cCharValue) + iA2;
                            int i36 = setincludefontpadding.setDividerPadding;
                            cArr3[i36] = cArr[(i31 * cCharValue) + iA];
                            cArr3[i36 + 1] = cArr[i35];
                        } else {
                            int i37 = (i31 * cCharValue) + i28;
                            int i38 = (i32 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i39 = setincludefontpadding.setDividerPadding;
                            cArr3[i39] = cArr[i37];
                            cArr3[i39 + 1] = cArr[i38];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
                c11 = '\t';
                c10 = 0;
            }
        }
        int i40 = f57974f + 9;
        f57975g = i40 % 128;
        int i41 = i40 % 2;
        for (int i42 = 0; i42 < i10; i42++) {
            cArr3[i42] = (char) (cArr3[i42] ^ 13722);
        }
        objArr[0] = new String(cArr3);
    }

    public static void b(String str, int i10, Object[] objArr) throws Throwable {
        int i11 = f57974f + 47;
        f57975g = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        char[] charArray = str.toCharArray();
        int i12 = f57975g + 73;
        f57974f = i12 % 128;
        int i13 = i12 % 2;
        setOnDragListener setondraglistener = new setOnDragListener();
        char[] y7 = setOnDragListener.setY(f57971c ^ 2122665171656649951L, charArray, i10);
        setondraglistener.setDividerPadding = 4;
        int i14 = f57975g + 121;
        f57974f = i14 % 128;
        int i15 = i14 % 2;
        while (true) {
            int i16 = setondraglistener.setDividerPadding;
            if (i16 >= y7.length) {
                objArr[0] = new String(y7, 4, y7.length - 4);
                return;
            }
            int i17 = i16 - 4;
            setondraglistener.setX = i17;
            try {
                Object[] objArr2 = {Long.valueOf(y7[i16] ^ y7[i16 % 4]), Long.valueOf(i17), Long.valueOf(f57971c)};
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(2144228148);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) (9780 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 44 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 3187 - (ViewConfiguration.getTouchSlop() >> 8));
                    Class<?> cls2 = Long.TYPE;
                    method = cls.getMethod("y", cls2, cls2, cls2);
                    map.put(2144228148, method);
                }
                y7[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {setondraglistener, setondraglistener};
                Object method2 = map.get(-62642757);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), 52 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 3029);
                    byte b10 = (byte) (-1);
                    Object[] objArr4 = new Object[1];
                    c((byte) 0, b10, (byte) (b10 & MessageUtils.MESSAGE_18_DC2), objArr4);
                    method2 = cls3.getMethod((String) objArr4[0], Object.class, Object.class);
                    map.put(-62642757, method2);
                }
                ((Method) method2).invoke(null, objArr3);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0029  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0029
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            int r9 = r9 + 99
            int r7 = r7 * 2
            int r7 = r7 + 1
            byte[] r0 = new byte[r7]
            byte[] r1 = com.mypinpad.tsdk.isolation.qr.f57976h
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            r8 = r7
            goto L33
        L17:
            r3 = r2
        L18:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r0[r3] = r5
            if (r4 != r7) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r1[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r6
        L33:
            int r7 = -r7
            int r7 = r7 + r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.qr.c(int, short, short, java.lang.Object[]):void");
    }

    public static void d() {
        f57976h = new byte[]{27, Constants.RESP_MSG_TEMPLATE_FORMAT_2, 45, -113};
    }

    public static void e() {
        f57970b = (char) 53956;
        f57969a = new char[]{59184, 59190, 59182, 59186, 59154, 59176, 59187, 59170, 59179, 59196, 59162, 59183, 59191, 59160, 59188, 59198, 59189, 59152, 59199, 59194, 59254, 59151, 59192, 59178, 59177};
        f57971c = 8422110059321058524L;
    }

    public static Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        setHorizontalScrollBarEnabled setsupportbackgroundtintlist;
        setHorizontalScrollBarEnabled setlogodescription;
        JSONArray jSONArray = (JSONArray) objArr[0];
        if (jSONArray != null) {
            IntRange intRange = new IntRange(0, jSONArray.length() - 1);
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = intRange.iterator();
            while (it.hasNext()) {
                int i13 = f57973e + 47;
                f57972d = i13 % 128;
                int i14 = i13 % 2;
                JSONObject jSONObject = jSONArray.getJSONObject(((IntIterator) it).nextInt());
                Object[] objArr2 = new Object[1];
                a((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4, "\u0011\u000f\u0000\u0010", (byte) (32 - (Process.myTid() >> 22)), objArr2);
                String strOptString = jSONObject.optString(((String) objArr2[0]).intern());
                Object[] objArr3 = new Object[1];
                b("黚ᄱ麾奓\ue039㷢灋\ue58a", (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1, objArr3);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(((String) objArr3[0]).intern());
                if (jSONObjectOptJSONObject == null) {
                    setsupportbackgroundtintlist = null;
                } else {
                    Intrinsics.checkNotNullExpressionValue(jSONObjectOptJSONObject, "");
                    if (strOptString != null) {
                        int i15 = f57973e + 65;
                        f57972d = i15 % 128;
                        int i16 = i15 % 2;
                        switch (strOptString.hashCode()) {
                            case -33617329:
                                Object[] objArr4 = new Object[1];
                                a(22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u000b\u000f\u0013\u0017\r\u0004\u000f\u0017\u0012\u0010\u0005\f㘕㘕\u0014\n\u000e\u0010\r\u0001\u000b\u0013", (byte) (38 - TextUtils.indexOf((CharSequence) "", '0')), objArr4);
                                if (!strOptString.equals(((String) objArr4[0]).intern())) {
                                    setsupportbackgroundtintlist = null;
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(strOptString, "");
                                    Object[] objArr5 = new Object[1];
                                    a(TextUtils.getOffsetAfter("", 0) + 9, "\u0015\u0007\u0011\u000e\n\u0011\u0013\u0006㘟", (byte) (ExpandableListView.getPackedPositionChild(0L) + 33), objArr5);
                                    setlogodescription = new setLogoDescription(strOptString, mp.setOnFocusChangeListener(jSONObjectOptJSONObject, ((String) objArr5[0]).intern()));
                                    int i17 = f57973e + 49;
                                    f57972d = i17 % 128;
                                    int i18 = i17 % 2;
                                    setsupportbackgroundtintlist = setlogodescription;
                                }
                                break;
                            case 442354101:
                                Object[] objArr6 = new Object[1];
                                b("륍벓뤙\uf4f5꣮⡦館퓲裩ࡻ兩㢚㓌\ue8f6\uf002\ue84d\ud90eᓦ죕졜㤈瓌⣘", 1 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), objArr6);
                                if (!strOptString.equals(((String) objArr6[0]).intern())) {
                                    setsupportbackgroundtintlist = null;
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(strOptString, "");
                                    Object[] objArr7 = new Object[1];
                                    a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6, "\u0004\u0018\u0011\u0013\u000b\u0004", (byte) (95 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), objArr7);
                                    byte[] onFocusChangeListener = mp.setOnFocusChangeListener(jSONObjectOptJSONObject, ((String) objArr7[0]).intern());
                                    Object[] objArr8 = new Object[1];
                                    b("쯪ኣ쮄嫏椭긦\ueb83聾癌", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), objArr8);
                                    setlogodescription = new setBreakStrategy(strOptString, onFocusChangeListener, mp.setOnFocusChangeListener(jSONObjectOptJSONObject, ((String) objArr8[0]).intern()));
                                    int i19 = f57973e + 91;
                                    f57972d = i19 % 128;
                                    if (i19 % 2 != 0) {
                                        throw null;
                                    }
                                    setsupportbackgroundtintlist = setlogodescription;
                                }
                                break;
                            case 606512987:
                                Object[] objArr9 = new Object[1];
                                b("ᆮ扮ᇯ⨃嬡難㇍ਈ笵\uda2b処쭃\uea19ᬼ∓㩋燃쨧㬝ᩛ釹ꨯ\udb1c穞뇫", (ViewConfiguration.getTapTimeout() >> 16) + 1, objArr9);
                                if (!strOptString.equals(((String) objArr9[0]).intern())) {
                                    setsupportbackgroundtintlist = null;
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(strOptString, "");
                                    Object[] objArr10 = new Object[1];
                                    b("쯪ኣ쮄嫏椭긦\ueb83聾癌", TextUtils.indexOf("", "", 0) + 1, objArr10);
                                    String string = jSONObjectOptJSONObject.getString(((String) objArr10[0]).intern());
                                    Intrinsics.checkNotNullExpressionValue(string, "");
                                    Object[] objArr11 = new Object[1];
                                    b("鐵\uda66鑒鈊\ue654\uf187둕눌왬톐푂瘽刈ꙇ⧩㆘\uf463爮虽ᆡᑦሡ晅熥㑤㈻䘚凞", 1 - (ViewConfiguration.getTouchSlop() >> 8), objArr11);
                                    setsupportbackgroundtintlist = new setSupportBackgroundTintList(strOptString, string, jSONObjectOptJSONObject.getLong(((String) objArr11[0]).intern()));
                                    int i20 = f57972d + 99;
                                    f57973e = i20 % 128;
                                    if (i20 % 2 == 0) {
                                        throw null;
                                    }
                                }
                                break;
                            case 827693193:
                                Object[] objArr12 = new Object[1];
                                b("眥덀睤שּׂ씍컧坆\udb26\ue519\ueea4㝹啯㬲蔃᚜໘ᝢᬓꔪ⻃\uf76c笰䔶介흭嬚敃溭뜞", -TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr12);
                                if (!strOptString.equals(((String) objArr12[0]).intern())) {
                                    setsupportbackgroundtintlist = null;
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(strOptString, "");
                                    Object[] objArr13 = new Object[1];
                                    a(4 - TextUtils.lastIndexOf("", '0'), "\t\u0012\u0010\u000b㘬", (byte) (67 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), objArr13);
                                    setsupportbackgroundtintlist = new setFriction(strOptString, mp.setCompoundDrawableTintBlendMode(jSONObjectOptJSONObject, ((String) objArr13[0]).intern()));
                                    int i21 = f57973e + 81;
                                    f57972d = i21 % 128;
                                    int i22 = i21 % 2;
                                }
                                break;
                            case 1909367001:
                                Object[] objArr14 = new Object[1];
                                a(((byte) KeyEvent.getModifierMetaStateMask()) + 17, "\u000e\n㙯㙯\u000b\u0013\u0015\u0016\u0004\u0002\u0012\n\u0005\u0010\u0014\u0002", (byte) (120 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), objArr14);
                                if (!strOptString.equals(((String) objArr14[0]).intern())) {
                                    setsupportbackgroundtintlist = null;
                                } else {
                                    Intrinsics.checkNotNullExpressionValue(strOptString, "");
                                    Object[] objArr15 = new Object[1];
                                    b("篿쬊箌荬᧑\u0fde宖ꍷ㧢⿀㮄覥䍅姒힡쿭ᮾ", -TextUtils.lastIndexOf("", '0'), objArr15);
                                    setsupportbackgroundtintlist = new setDividerHeight(strOptString, jSONObjectOptJSONObject.getLong(((String) objArr15[0]).intern()));
                                    int i23 = f57973e + 99;
                                    f57972d = i23 % 128;
                                    int i24 = i23 % 2;
                                }
                                break;
                            default:
                                setsupportbackgroundtintlist = null;
                                break;
                        }
                    } else {
                        setsupportbackgroundtintlist = null;
                    }
                }
                if (setsupportbackgroundtintlist != null) {
                    int i25 = f57972d + 121;
                    f57973e = i25 % 128;
                    if (i25 % 2 == 0) {
                        arrayList.add(setsupportbackgroundtintlist);
                        throw null;
                    }
                    arrayList.add(setsupportbackgroundtintlist);
                }
            }
            List list = CollectionsKt___CollectionsKt.toList(arrayList);
            if (list != null) {
                return list;
            }
        }
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @NotNull
    public static applicationCreated setY(@NotNull JSONObject p4) {
        Intrinsics.checkNotNullParameter(p4, "");
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf("", "") + 10, "\u0001\u0012\u0006\n\u000f\u0011\u0014\u0011\u0003\u0013", (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 44), objArr);
        String string = p4.getString(((String) objArr[0]).intern());
        Intrinsics.checkNotNullExpressionValue(string, "");
        Object[] objArr2 = new Object[1];
        b("캉\ueeda컨ꚷ㿉羯\ueefc蚦\u1fd5徬軃꾮暤翃ꟊ뾞껁䚉忷", (ViewConfiguration.getWindowTouchSlop() >> 8) + 1, objArr2);
        List dividerPadding = mp.setDividerPadding(p4, ((String) objArr2[0]).intern(), (Function1) a.f57977p0);
        Object[] objArr3 = new Object[1];
        a(TextUtils.getTrimmedLength("") + 16, "\u0014\u0013\u0016\u0003\u0004\u0017\u0010\u0013\u000b\u000f\u0011\u000e\b\u0006\u0014\n", (byte) (View.MeasureSpec.getSize(0) + 52), objArr3);
        List<String> compoundDrawableTintBlendMode = mp.setCompoundDrawableTintBlendMode(p4, ((String) objArr3[0]).intern());
        Object[] objArr4 = new Object[1];
        b("웛僸울ᢔ횯괍\ue6b2㢔\uf6a3贔蚬䛅\ud88d隋畨洨ꚍ\uf8be뚂䴠䚟颮嚁ⴢ", View.resolveSize(0, 0) + 1, objArr4);
        List list = (List) setOnFocusChangeListener(new Object[]{p4.optJSONArray(((String) objArr4[0]).intern())}, -693924214, 693924214, (int) System.currentTimeMillis());
        Object[] objArr5 = new Object[1];
        a(View.resolveSize(0, 0) + 9, "\b\u0000\u0006\u0013\u0010\u000e\u0004\u0016㙩", (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 107), objArr5);
        String string2 = p4.getString(((String) objArr5[0]).intern());
        Intrinsics.checkNotNullExpressionValue(string2, "");
        applicationCreated applicationcreated = new applicationCreated(string, dividerPadding, compoundDrawableTintBlendMode, list, string2, null, null, 96, null);
        int i10 = f57973e + 5;
        f57972d = i10 % 128;
        int i11 = i10 % 2;
        return applicationcreated;
    }
}
