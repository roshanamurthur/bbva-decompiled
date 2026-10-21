package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GetProcessingOptionsCommandApdu;
import com.noknok.android.client.asm.authenticator.KSUtils;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i7 extends FunctionReferenceImpl implements Function3<setHorizontalScrollbarOverlay, String, Throwable, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f56344p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f56345q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f56346r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final byte[] f56347s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f56348t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f56349u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f56350w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final byte[] f56351x0 = null;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final int f56352y0 = 0;

    static {
        c();
        v0 = 0;
        f56350w0 = 1;
        f56348t0 = 0;
        f56349u0 = 1;
        f56344p0 = 282075822;
        f56345q0 = -1454817124;
        f56346r0 = 461511436;
        f56347s0 = new byte[]{-108, 108, -73, 113, 102, -121, 105, -107, Constants.CVR_B2b8765_1111_APP_DISABLED, -71, 122, 66, 109, -98, -107, 126, -100, 105, -98, -128, -79, 92, 109, -103, Constants.DIRECTORY_ENTRY, -87, 90, 127, KSUtils.PLAIN_BUFFER, 99, -118, -123, 64, 109, -111, 99, GenerateAcResponseApdu.DDA_HEADER, -75, UtilitiesSDKConstants.SRP_LABEL_ENC, 92, 109, -103, Constants.DIRECTORY_ENTRY, -87, 90, 127, KSUtils.PLAIN_BUFFER, 99, -118, -123, 91, -109, 123, -123, -115, 113, 108, -73, -119, 92, 109, -111, -106, -108, 108, -105, -87, 85, 107, -106, -108, GenerateAcResponseApdu.DDA_HEADER, -104, -96, Constants.STATE_ERROR, -105, 101, -106, -111, 109, 99, -104, -86, 86, GenerateAcResponseApdu.DDA_HEADER, -104, GetProcessingOptionsCommandApdu.COMMAND_TEMPLATE_TAG, UtilitiesSDKConstants.SRP_LABEL_ENC, 87, 102, -122, 104, 109, -109, 103, -121, Constants.FCI_TEMPLATE, Constants.FCI_TEMPLATE, 110, 105, -102, 98, -103, -106, Constants.CVR_B1b85_0110_TERMINAL, -109, 101, -37, 41, 108, -73, 113, 102, -121, 105, -107};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public i7(mk mkVar) throws Throwable {
        short sNormalizeMetaState = (short) KeyEvent.normalizeMetaState(0);
        Object[] objArr = new Object[1];
        a((-10) - TextUtils.indexOf((CharSequence) "", '0'), (byte) View.getDefaultSize(0, 0), sNormalizeMetaState, 1295295693 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1181130181 - TextUtils.lastIndexOf("", '0', 0), objArr);
        String strIntern = ((String) objArr[0]).intern();
        short deadChar = (short) KeyEvent.getDeadChar(0, 0);
        int offsetBefore = (-9) - TextUtils.getOffsetBefore("", 0);
        int iGreen = Color.green(0) + 1295295692;
        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1181130190;
        Object[] objArr2 = new Object[1];
        a(offsetBefore, (byte) TextUtils.indexOf("", "", 0, 0), deadChar, iGreen, packedPositionType, objArr2);
        super(3, mkVar, mk.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    public static void a(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
        Class<?> cls;
        byte[] bArr;
        int i13;
        boolean z10;
        byte[] bArr2;
        Class<?> cls2 = Object.class;
        int i14 = f56345q0;
        setTextAlignment settextalignment = new setTextAlignment();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i15 = 1;
            Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(i14)};
            int i16 = 0;
            Map map = setTextScaleX.setMaxEms;
            Object method = map.get(-769569468);
            int i17 = f56352y0;
            if (method == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) Color.alpha(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 50, 435 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                byte b11 = (byte) (i17 & 5);
                byte b12 = (byte) (b11 - 1);
                Object[] objArr3 = new Object[1];
                b(b11, b12, b12, objArr3);
                String str = (String) objArr3[0];
                Class<?> cls4 = Integer.TYPE;
                method = cls3.getMethod(str, cls4, cls4);
                map.put(-769569468, method);
            }
            int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
            int i18 = iIntValue == -1 ? 1 : 0;
            int i19 = f56344p0;
            byte[] bArr3 = f56347s0;
            if (i18 != 0) {
                if (bArr3 != null) {
                    int i20 = v0 + 21;
                    f56350w0 = i20 % 128;
                    int i21 = i20 % 2;
                    int length = bArr3.length;
                    bArr2 = new byte[length];
                    int i22 = 0;
                    while (i22 < length) {
                        Object[] objArr4 = new Object[i15];
                        objArr4[i16] = Integer.valueOf(bArr3[i22]);
                        Map map2 = setTextScaleX.setMaxEms;
                        Object method2 = map2.get(510767826);
                        if (method2 == null) {
                            method2 = ((Class) setTextScaleX.setX((char) (TextUtils.getOffsetBefore("", i16) + 49111), 41 - (ViewConfiguration.getEdgeSlop() >> 16), MotionEvent.axisFromString("") + 53)).getMethod("s", Integer.TYPE);
                            map2.put(510767826, method2);
                        }
                        bArr2[i22] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                        i22++;
                        cls2 = cls2;
                        length = length;
                        i15 = 1;
                        i16 = 0;
                    }
                    cls = cls2;
                } else {
                    cls = cls2;
                    bArr2 = bArr3;
                }
                bArr2.getClass();
                Object[] objArr5 = {Integer.valueOf(i12), Integer.valueOf(i19)};
                Map map3 = setTextScaleX.setMaxEms;
                Object method3 = map3.get(-769569468);
                if (method3 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) ((Process.getThreadPriority(0) + 20) >> 6), 49 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 434);
                    byte b13 = (byte) (i17 & 5);
                    byte b14 = (byte) (b13 - 1);
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    String str2 = (String) objArr6[0];
                    Class<?> cls6 = Integer.TYPE;
                    method3 = cls5.getMethod(str2, cls6, cls6);
                    map3.put(-769569468, method3);
                }
                iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) i14) ^ 7616081452308447380L)));
            } else {
                cls = cls2;
            }
            if (iIntValue > 0) {
                settextalignment.setX = ((i12 + iIntValue) - 2) + ((int) (((long) i19) ^ 7616081452308447380L)) + i18;
                Object[] objArr7 = {settextalignment, Integer.valueOf(i11), Integer.valueOf(f56346r0), sb2};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(193260760);
                if (method4 == null) {
                    Class cls7 = (Class) setTextScaleX.setX((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 43, 2803 - (ViewConfiguration.getTouchSlop() >> 8));
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, b16, objArr8);
                    String str3 = (String) objArr8[0];
                    Class<?> cls8 = Integer.TYPE;
                    method4 = cls7.getMethod(str3, cls, cls8, cls8, cls);
                    map4.put(193260760, method4);
                }
                ((StringBuilder) ((Method) method4).invoke(null, objArr7)).append(settextalignment.setCompoundDrawableTintBlendMode);
                settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                if (bArr3 != null) {
                    int length2 = bArr3.length;
                    bArr = new byte[length2];
                    for (int i23 = 0; i23 < length2; i23++) {
                        bArr[i23] = (byte) (((long) bArr3[i23]) ^ 7616081452308447380L);
                    }
                } else {
                    bArr = bArr3;
                }
                if (bArr != null) {
                    int i24 = v0 + 39;
                    f56350w0 = i24 % 128;
                    int i25 = i24 % 2;
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
                    int i26 = f56350w0 + 59;
                    v0 = i26 % 128;
                    if (i26 % 2 != 0) {
                        int i27 = settextalignment.setX;
                        settextalignment.setX = i27;
                        settextalignment.setCompoundDrawableTintBlendMode = (char) (settextalignment.setY / (((byte) (((byte) (((long) bArr3[i27]) | 7616081452308447380L)) >> s4)) ^ b10));
                    } else {
                        int i28 = settextalignment.setX;
                        settextalignment.setX = i28 - 1;
                        settextalignment.setCompoundDrawableTintBlendMode = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr3[i28]) ^ 7616081452308447380L)) + s4)) ^ b10));
                    }
                    sb2.append(settextalignment.setCompoundDrawableTintBlendMode);
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

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 4
            int r7 = r7 * 3
            int r0 = 1 - r7
            int r6 = r6 * 3
            int r6 = 112 - r6
            byte[] r0 = new byte[r0]
            r1 = 0
            int r7 = 0 - r7
            byte[] r2 = com.mypinpad.tsdk.isolation.i7.f56351x0
            if (r2 != 0) goto L1c
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L37
        L1c:
            r3 = r1
        L1d:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L2a:
            r4 = r2[r8]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L37:
            int r6 = r6 + r7
            int r7 = r9 + 1
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.i7.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f56351x0 = new byte[]{107, -84, 8, 70};
        f56352y0 = 243;
    }

    public final void d(@NotNull setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay, @NotNull String str) {
        int i10 = f56348t0 + 123;
        f56349u0 = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(sethorizontalscrollbaroverlay, "");
            Intrinsics.checkNotNullParameter(str, "");
            mk.setY(sethorizontalscrollbaroverlay, str);
            return;
        }
        Intrinsics.checkNotNullParameter(sethorizontalscrollbaroverlay, "");
        Intrinsics.checkNotNullParameter(str, "");
        mk.setY(sethorizontalscrollbaroverlay, str);
        int i11 = 22 / 0;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ Unit invoke(setHorizontalScrollbarOverlay sethorizontalscrollbaroverlay, String str, Throwable th2) {
        int i10 = f56348t0 + 63;
        f56349u0 = i10 % 128;
        int i11 = i10 % 2;
        d(sethorizontalscrollbaroverlay, str);
        if (i11 == 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i12 = f56349u0 + 17;
        f56348t0 = i12 % 128;
        int i13 = i12 % 2;
        return unit2;
    }
}
