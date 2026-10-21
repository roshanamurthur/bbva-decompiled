package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.esotericsoftware.kryo.serializers.j;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.noknok.android.client.asm.authenticator.KSUtils;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.Supplier;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class setCameraDistance {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f59521k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f59522l;
    public static final int m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final byte[] f59523n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int[] f59524o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static int f59525p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f59526q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f59527r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f59528s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final byte[] f59529t = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final setIndeterminateTintList f59530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final UiMessage f59531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final setFocusableInTouchMode f59532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final junkify f59533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final setOnGroupClickListener f59534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final TsdkManualInitializer f59535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final getCurrencyCustomFormatting f59536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final setPointerIcon f59537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    public final setMin f59538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public final ThreadPoolExecutor f59539j;

    public /* synthetic */ class setY {
        public static final /* synthetic */ int[] setY;

        static {
            int[] iArr = new int[setAccessibilityTraversalAfter.values().length];
            iArr[setAccessibilityTraversalAfter.setX.ordinal()] = 1;
            iArr[setAccessibilityTraversalAfter.setDividerPadding.ordinal()] = 2;
            iArr[setAccessibilityTraversalAfter.setZ.ordinal()] = 3;
            iArr[setAccessibilityTraversalAfter.setOnLongClickListener.ordinal()] = 4;
            iArr[setAccessibilityTraversalAfter.setOnDragListener.ordinal()] = 5;
            iArr[setAccessibilityTraversalAfter.getNavBarTitleString.ordinal()] = 6;
            iArr[setAccessibilityTraversalAfter.setNavigationOnClickListener.ordinal()] = 7;
            iArr[setAccessibilityTraversalAfter.setCompoundDrawableTintBlendMode.ordinal()] = 8;
            iArr[setAccessibilityTraversalAfter.setLayoutAnimation.ordinal()] = 9;
            iArr[setAccessibilityTraversalAfter.setTextAlignment.ordinal()] = 10;
            iArr[setAccessibilityTraversalAfter.setIncludeFontPadding.ordinal()] = 11;
            iArr[setAccessibilityTraversalAfter.UiMessageCallbackKtWhenMappings.ordinal()] = 12;
            setY = iArr;
            int i10 = (1 - (-35)) - 1;
            int i11 = (i10 ^ (-1)) + (i10 << 1);
            int i12 = i11 % 128;
            int i13 = i11 % 2;
        }
    }

    static {
        c();
        f59527r = 0;
        f59528s = 1;
        f59525p = 0;
        f59526q = 1;
        f59521k = 831297650;
        f59522l = -1454817083;
        m = 1667981549;
        f59523n = new byte[]{88, 58, -105, -99, -46, 43, 121, -121, 105, -48, GenerateAcResponseApdu.DAD_ICC_DYNAMIC_DATA_LENGTH, 107, -110, Constants.DIRECTORY_ENTRY, -121, 121, -107, -102, 101, -108, -121, -43, 56, -123, GenerateAcResponseApdu.DDA_HEADER, 109, -108, 105, -104, -115, -107, -103, 101, -101, 108, -104, 123, -123, -123, 67, -111, -97, 99, -97, -106, 101, -110, -79, 68, -116, Constants.DIRECTORY_ENTRY, -120, 74, -105, Constants.FCI_TEMPLATE, -123, GenerateAcResponseApdu.DDA_HEADER, 109, -108, 105, -72, KSUtils.PLAIN_BUFFER, 84, 107, -110, Constants.DIRECTORY_ENTRY, -121, 123, -97, -106, 101, -110, -111, -81, 84, 107, -110, Constants.DIRECTORY_ENTRY, -121, 121, -107, -102, 101, -108, -121, -89, 94, -105, 101, -106, -111, 109, 99, -104, -85, 85, GenerateAcResponseApdu.DDA_HEADER, -104, -41, 47, Constants.DIRECTORY_ENTRY, 99, -111, Constants.CVR_B2b87_11_RFU, 32, -108, 99, -109, -43, 43, 107, -107, -38, 37, Constants.FCI_TEMPLATE, Constants.CVR_B2b87_11_RFU, 56, -107, -122, GenerateAcResponseApdu.DDA_HEADER, -41, 47, -105, -42, 56, -111, -107, -108, -103, GenerateAcResponseApdu.DDA_HEADER, -41, 32, -108, 99, -109, KSUtils.PLAIN_BUFFER, -107, -103, 101, -101, 108, -104, 123, -123, -123, 67, -109, -105, Constants.FCI_TEMPLATE, -123, GenerateAcResponseApdu.DDA_HEADER, 103, -99, -79, 70, -105, Constants.FCI_TEMPLATE, -123, GenerateAcResponseApdu.DDA_HEADER, 109, -108, 105, -72, KSUtils.PLAIN_BUFFER, 84, 107, -110, Constants.DIRECTORY_ENTRY, -121, 123, -97, -106, 101, -110, -111, -81, 84, 107, -110, Constants.DIRECTORY_ENTRY, -121, 121, -107, -102, 101, -108, -121, -89, 94, -105, 101, -106, -111, 109, 99, -104, -85, 85, GenerateAcResponseApdu.DDA_HEADER, -104, -41, 47, Constants.DIRECTORY_ENTRY, 99, -111, Constants.CVR_B2b87_11_RFU, 32, -108, 99, -109, -43, 43, 107, -107, -38, 37, Constants.FCI_TEMPLATE, Constants.CVR_B2b87_11_RFU, 56, -107, -122, GenerateAcResponseApdu.DDA_HEADER, -41, 47, -105, -42, 56, -111, -107, -108, -103, GenerateAcResponseApdu.DDA_HEADER, -41, 32, -108, 99, -109, -126, -107, -103, 101, -101, 108, -104, 123, -123, -123, 72, -100, 99, -106, -102, -121, 127, 109, 104, -70, 70, -105, Constants.FCI_TEMPLATE, -123, GenerateAcResponseApdu.DDA_HEADER, 109, -108, 105, -72, KSUtils.PLAIN_BUFFER, 84, 107, -110, Constants.DIRECTORY_ENTRY, -121, 123, -97, -106, 101, -110, -111, -81, 84, 107, -110, Constants.DIRECTORY_ENTRY, -121, 121, -107, -102, 101, -108, -121, -89, 94, -105, 101, -106, -111, 109, 99, -104, -85, 85, GenerateAcResponseApdu.DDA_HEADER, -104, -41, 47, Constants.DIRECTORY_ENTRY, 99, -111, Constants.CVR_B2b87_11_RFU, 32, -108, 99, -109, -43, 43, 107, -107, -38, 37, Constants.FCI_TEMPLATE, Constants.CVR_B2b87_11_RFU, 56, -107, -122, GenerateAcResponseApdu.DDA_HEADER, -41, 47, -105, -42, 56, -111, -107, -108, -103, GenerateAcResponseApdu.DDA_HEADER, -41, 32, -108, 99, -109, -113, -107, -103, 101, -101, 108, -104, 123, -123, -123, 113, -100, GenerateAcResponseApdu.DDA_HEADER, 105, -79, 74, 108, -112, KSUtils.PLAIN_BUFFER, 114, 107, -106, -108, GenerateAcResponseApdu.DDA_HEADER, -72, 69, -105, Constants.FCI_TEMPLATE, -123, GenerateAcResponseApdu.DDA_HEADER, 109, -108, 105, -72, KSUtils.PLAIN_BUFFER, 84, 107, -110, Constants.DIRECTORY_ENTRY, -121, 123, -97, -106, 101, -110, -111, -81, 84, 107, -110, Constants.DIRECTORY_ENTRY, -121, 121, -107, -102, 101, -108, -121, -89, 94, -105, 101, -106, -111, 109, 99, -104, -85, 85, GenerateAcResponseApdu.DDA_HEADER, -104, -41, 47, Constants.DIRECTORY_ENTRY, 99, -111, Constants.CVR_B2b87_11_RFU, 32, -108, 99, -109, -43, 43, 107, -107, -38, 37, Constants.FCI_TEMPLATE, Constants.CVR_B2b87_11_RFU, 56, -107, -122, GenerateAcResponseApdu.DDA_HEADER, -41, 47, -105, -42, 56, -111, -107, -108, -103, GenerateAcResponseApdu.DDA_HEADER, -41, 32, -108, 99, -109};
        f59524o = new int[]{764023377, -488770480, -431871302, -237573124, -2087920827, -218753622, -787428732, -2098302248, -136600625, 1535228055, -1402313087, -791191467, 87676677, -1598997983, -1180750968, 33409941, -1507043134, 2092000119};
    }

    public setCameraDistance(@NotNull setColorFilter setcolorfilter, @NotNull setIndeterminateTintList setindeterminatetintlist, @NotNull setHttpAuthUsernamePassword sethttpauthusernamepassword, @NotNull UiMessage uiMessage, @NotNull setFocusableInTouchMode setfocusableintouchmode, @NotNull junkify junkifyVar, @NotNull getView getview, @NotNull setOnGroupClickListener setongroupclicklistener, @NotNull TsdkManualInitializer tsdkManualInitializer, @NotNull getCurrencyCustomFormatting getcurrencycustomformatting, @NotNull TransactionErrorCause transactionErrorCause, @NotNull setPointerIcon setpointericon, @NotNull setMin setmin) {
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        Intrinsics.checkNotNullParameter(setindeterminatetintlist, "");
        Intrinsics.checkNotNullParameter(sethttpauthusernamepassword, "");
        Intrinsics.checkNotNullParameter(uiMessage, "");
        Intrinsics.checkNotNullParameter(setfocusableintouchmode, "");
        Intrinsics.checkNotNullParameter(junkifyVar, "");
        Intrinsics.checkNotNullParameter(getview, "");
        Intrinsics.checkNotNullParameter(setongroupclicklistener, "");
        Intrinsics.checkNotNullParameter(tsdkManualInitializer, "");
        Intrinsics.checkNotNullParameter(getcurrencycustomformatting, "");
        Intrinsics.checkNotNullParameter(transactionErrorCause, "");
        Intrinsics.checkNotNullParameter(setpointericon, "");
        Intrinsics.checkNotNullParameter(setmin, "");
        this.f59530a = setindeterminatetintlist;
        this.f59531b = uiMessage;
        this.f59532c = setfocusableintouchmode;
        this.f59533d = junkifyVar;
        this.f59534e = setongroupclicklistener;
        this.f59535f = tsdkManualInitializer;
        this.f59536g = getcurrencycustomformatting;
        this.f59537h = setpointericon;
        this.f59538i = setmin;
        this.f59539j = new ThreadPoolExecutor(0, 10, 5L, TimeUnit.SECONDS, new SynchronousQueue());
    }

    public static void a(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
        byte[] bArr;
        int i13;
        boolean z10;
        byte[] bArr2;
        int length;
        int i14 = f59522l;
        setTextAlignment settextalignment = new setTextAlignment();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i15 = 1;
            Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(i14)};
            char c10 = 0;
            Map map = setTextScaleX.setMaxEms;
            Object method = map.get(-769569468);
            if (method == null) {
                Class cls = (Class) setTextScaleX.setX((char) ExpandableListView.getPackedPositionGroup(0L), 49 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 435 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                byte b11 = (byte) (-1);
                byte b12 = (byte) (b11 + 4);
                Object[] objArr3 = new Object[1];
                b(b11, b12, (byte) (b12 - 3), objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                method = cls.getMethod(str, cls2, cls2);
                map.put(-769569468, method);
            }
            int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
            int i16 = iIntValue == -1 ? 1 : 0;
            int i17 = f59521k;
            byte[] bArr3 = f59523n;
            char c11 = '0';
            if (i16 != 0) {
                if (bArr3 != null) {
                    int i18 = f59528s + 77;
                    f59527r = i18 % 128;
                    if (i18 % 2 != 0) {
                        length = bArr3.length;
                        bArr2 = new byte[length];
                    } else {
                        length = bArr3.length;
                        bArr2 = new byte[length];
                    }
                    int i19 = 0;
                    while (i19 < length) {
                        Object[] objArr4 = new Object[i15];
                        objArr4[c10] = Integer.valueOf(bArr3[i19]);
                        Map map2 = setTextScaleX.setMaxEms;
                        Object method2 = map2.get(510767826);
                        if (method2 == null) {
                            method2 = ((Class) setTextScaleX.setX((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 49111), 40 - TextUtils.indexOf("", c11), (ViewConfiguration.getTouchSlop() >> 8) + 52)).getMethod("s", Integer.TYPE);
                            map2.put(510767826, method2);
                        }
                        bArr2[i19] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                        i19++;
                        int i20 = f59528s + 95;
                        f59527r = i20 % 128;
                        int i21 = i20 % 2;
                        length = length;
                        i15 = 1;
                        c10 = 0;
                        c11 = '0';
                    }
                } else {
                    bArr2 = bArr3;
                }
                bArr2.getClass();
                Object[] objArr5 = {Integer.valueOf(i12), Integer.valueOf(i17)};
                Map map3 = setTextScaleX.setMaxEms;
                Object method3 = map3.get(-769569468);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 49 - (Process.myTid() >> 22), KeyEvent.keyCodeFromString("") + 434);
                    byte b13 = (byte) (-1);
                    byte b14 = (byte) (b13 + 4);
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, (byte) (b14 - 3), objArr6);
                    String str2 = (String) objArr6[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str2, cls4, cls4);
                    map3.put(-769569468, method3);
                }
                iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) i14) ^ 7616081452308447380L)));
            }
            if (iIntValue > 0) {
                settextalignment.setX = ((i12 + iIntValue) - 2) + ((int) (((long) i17) ^ 7616081452308447380L)) + i16;
                Object[] objArr7 = {settextalignment, Integer.valueOf(i11), Integer.valueOf(m), sb2};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(193260760);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) Color.alpha(0), 41 - TextUtils.indexOf((CharSequence) "", '0', 0), 2803 - TextUtils.getCapsMode("", 0, 0));
                    byte b15 = (byte) (-1);
                    byte b16 = (byte) (b15 + 1);
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, b16, objArr8);
                    String str3 = (String) objArr8[0];
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str3, Object.class, cls6, cls6, Object.class);
                    map4.put(193260760, method4);
                }
                ((StringBuilder) ((Method) method4).invoke(null, objArr7)).append(settextalignment.setCompoundDrawableTintBlendMode);
                settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    bArr = new byte[length2];
                    for (int i22 = 0; i22 < length2; i22++) {
                        bArr[i22] = (byte) (((long) bArr3[i22]) ^ 7616081452308447380L);
                    }
                } else {
                    bArr = bArr3;
                }
                if (bArr != null) {
                    int i23 = f59527r + 125;
                    f59528s = i23 % 128;
                    int i24 = i23 % 2;
                    i13 = 1;
                    z10 = true;
                } else {
                    i13 = 1;
                    z10 = false;
                }
                while (true) {
                    settextalignment.setDividerPadding = i13;
                    if (settextalignment.setDividerPadding >= iIntValue) {
                        break;
                    }
                    if (!z10) {
                        settextalignment.setX--;
                        throw null;
                    }
                    int i25 = settextalignment.setX;
                    settextalignment.setX = i25 - 1;
                    char c12 = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr3[i25]) ^ 7616081452308447380L)) + s4)) ^ b10));
                    settextalignment.setCompoundDrawableTintBlendMode = c12;
                    sb2.append(c12);
                    settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                    i13 = settextalignment.setDividerPadding + 1;
                }
            }
            objArr[0] = sb2.toString();
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r8, byte r9, short r10, java.lang.Object[] r11) {
        /*
            int r9 = 112 - r9
            int r10 = r10 * 4
            int r10 = 1 - r10
            int r8 = r8 + 4
            byte[] r0 = new byte[r10]
            byte[] r1 = com.mypinpad.tsdk.isolation.setCameraDistance.f59529t
            r2 = 0
            if (r1 != 0) goto L16
            r9 = r8
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r11
            r11 = r10
            goto L33
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r0[r3] = r5
            if (r4 != r10) goto L26
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0, r2)
            r11[r2] = r8
            return
        L26:
            int r8 = r8 + 1
            r3 = r1[r8]
            r6 = r9
            r9 = r8
            r8 = r6
            r7 = r11
            r11 = r10
            r10 = r3
            r3 = r1
            r1 = r0
            r0 = r7
        L33:
            int r8 = r8 + r10
            r10 = r11
            r11 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setCameraDistance.b(byte, byte, short, java.lang.Object[]):void");
    }

    public static void c() {
        f59529t = new byte[]{59, 125, 28, -9};
    }

    public static /* synthetic */ Object setDividerPadding(Object[] objArr, int i10, int i11, int i12) {
        int i13 = ((i10 | (~(i11 | (~i12)))) * 56) + ((~(i10 | i11)) * (-56)) + (((~(i10 | i12)) | i11) * 56) + (i11 * (-55)) + (i10 * (-55));
        if (i13 == 1) {
            setCameraDistance setcameradistance = (setCameraDistance) objArr[0];
            setFriction setfriction = (setFriction) objArr[1];
            setImageBitmap setimagebitmap = new setImageBitmap(setcameradistance.f59535f.setDividerPadding((List) setFriction.setCompoundDrawableTintBlendMode(new Object[]{setfriction}, 355777135, -355777135, System.identityHashCode(setfriction))));
            int i14 = f59526q + 103;
            f59525p = i14 % 128;
            int i15 = i14 % 2;
            return setimagebitmap;
        }
        if (i13 != 2) {
            setOutlineProvider setoutlineprovider = new setOutlineProvider(((setCameraDistance) objArr[0]).f59531b.setY());
            int i16 = f59526q + 67;
            f59525p = i16 % 128;
            if (i16 % 2 == 0) {
                return setoutlineprovider;
            }
            throw null;
        }
        setHapticFeedbackEnabled sethapticfeedbackenabled = new setHapticFeedbackEnabled(((setCameraDistance) objArr[0]).f59530a.setOnFocusChangeListener());
        int i17 = f59525p + 95;
        f59526q = i17 % 128;
        if (i17 % 2 != 0) {
            return sethapticfeedbackenabled;
        }
        throw null;
    }

    @NotNull
    public final setMin setCompoundDrawableTintBlendMode() {
        int i10 = f59525p + 59;
        int i11 = i10 % 128;
        f59526q = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 21;
        f59525p = i13 % 128;
        int i14 = i13 % 2;
        setMin setmin = this.f59538i;
        if (i14 != 0) {
            int i15 = 99 / 0;
        }
        return setmin;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.mypinpad.tsdk.i.v8] */
    @NotNull
    public final Map<setAccessibilityTraversalAfter, setSubtitleTextAppearance> setY(@NotNull List<? extends setAccessibilityTraversalAfter> list, @NotNull final List<? extends setHorizontalScrollBarEnabled> list2, @NotNull final setChildIndicatorBounds setchildindicatorbounds) throws setScrollX {
        Exception cause;
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(list2, "");
        Intrinsics.checkNotNullParameter(setchildindicatorbounds, "");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<T> it = list.iterator();
        int i10 = f59526q + 111;
        f59525p = i10 % 128;
        int i11 = i10 % 2;
        while (!(!it.hasNext())) {
            int i12 = f59526q + 13;
            f59525p = i12 % 128;
            int i13 = i12 % 2;
            Object next = it.next();
            final setAccessibilityTraversalAfter setaccessibilitytraversalafter = (setAccessibilityTraversalAfter) next;
            try {
                setSubtitleTextAppearance setsubtitletextappearance = (setSubtitleTextAppearance) CompletableFuture.supplyAsync(new Supplier() { // from class: com.mypinpad.tsdk.i.v8
                    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v4 java.lang.NullPointerException, still in use, count: 2, list:
                          (r0v4 java.lang.NullPointerException) from 0x03fa: MOVE (r32v0 java.lang.NullPointerException) = (r0v4 java.lang.NullPointerException)
                          (r0v4 java.lang.NullPointerException) from 0x036e: PHI (r0v23 java.lang.NullPointerException) = (r0v4 java.lang.NullPointerException), (r0v29 java.lang.NullPointerException) binds: [B:52:0x0368, B:61:0x03e1] A[DONT_GENERATE, DONT_INLINE]
                        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
                        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
                        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
                        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
                        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
                        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
                        */
                    @Override // java.util.function.Supplier
                    public final java.lang.Object get() {
                        /*
                            Method dump skipped, instruction units count: 1890
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.v8.get():java.lang.Object");
                    }
                }, this.f59539j).get(2L, TimeUnit.MINUTES);
                int i14 = f59526q + 15;
                f59525p = i14 % 128;
                if (i14 % 2 != 0) {
                    linkedHashMap.put(next, setsubtitletextappearance);
                    throw null;
                }
                linkedHashMap.put(next, setsubtitletextappearance);
            } catch (Exception e5) {
                if ((e5 instanceof ExecutionException) || j.d(e5)) {
                    cause = e5;
                    cause = e5.getCause();
                }
                cause = e5;
                throw new setScrollX(setaccessibilitytraversalafter.setDividerPadding(), cause);
            }
        }
        return linkedHashMap;
    }
}
