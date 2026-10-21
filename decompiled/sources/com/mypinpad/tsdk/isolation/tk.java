package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.mypinpad.tsdk.api.errors.TerminalException;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/mypinpad/tsdk/i/tk;", "", "", "p0", "", "setCompoundDrawableTintBlendMode", "([B)V", "", "setY", "(Ljava/lang/String;)V", "<init>", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTerminalValidations.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TerminalValidations.kt\ncom/mypinpad/tsdk/internal/terminal/TerminalValidations\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n*L\n1#1,34:1\n7#2,8:35\n7#2,8:43\n*S KotlinDebug\n*F\n+ 1 TerminalValidations.kt\ncom/mypinpad/tsdk/internal/terminal/TerminalValidations\n*L\n18#1:35,8\n21#1:43,8\n*E\n"})
public final class tk {

    @NotNull
    public static final tk INSTANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f61123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static byte[] f61126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f61127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f61128f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f61129g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f61130h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f61131i = null;

    static {
        c();
        f61129g = 0;
        f61130h = 1;
        f61127e = 0;
        f61128f = 1;
        d();
        INSTANCE = new tk();
        int i10 = f61128f + 91;
        f61127e = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 76 / 0;
        }
    }

    public static void a(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
        int i13;
        int length;
        byte[] bArr;
        boolean z10;
        setTextAlignment settextalignment = new setTextAlignment();
        StringBuilder sb2 = new StringBuilder();
        int i14 = 2;
        try {
            Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(f61124b)};
            int i15 = 0;
            Map map = setTextScaleX.setMaxEms;
            Object method = map.get(-769569468);
            if (method == null) {
                Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 49, 434 - (ViewConfiguration.getTouchSlop() >> 8));
                byte b11 = (byte) 0;
                byte b12 = b11;
                Object[] objArr3 = new Object[1];
                b((byte) (b12 + 1), b11, b12, objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                method = cls.getMethod(str, cls2, cls2);
                map.put(-769569468, method);
            }
            int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i16 = f61129g + 43;
                f61130h = i16 % 128;
                int i17 = i16 % 2;
                i13 = 1;
            } else {
                i13 = 0;
            }
            if (i13 != 0) {
                byte[] bArr2 = f61126d;
                if (bArr2 != null) {
                    int i18 = f61129g + 53;
                    f61130h = i18 % 128;
                    if (i18 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i19 = 0;
                    while (i19 < length) {
                        int i20 = f61129g + 31;
                        f61130h = i20 % 128;
                        if (i20 % i14 == 0) {
                            Object[] objArr4 = new Object[1];
                            objArr4[i15] = Integer.valueOf(bArr2[i19]);
                            Map map2 = setTextScaleX.setMaxEms;
                            Object method2 = map2.get(510767826);
                            if (method2 == null) {
                                method2 = ((Class) setTextScaleX.setX((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 49111), (CdmaCellLocation.convertQuartSecToDecDegrees(i15) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i15) == 0.0d ? 0 : -1)) + 41, 52 - View.getDefaultSize(i15, i15))).getMethod("s", Integer.TYPE);
                                map2.put(510767826, method2);
                            }
                            bArr[i19] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                            i14 = 2;
                            i15 = 0;
                        } else {
                            Object[] objArr5 = {Integer.valueOf(bArr2[i19])};
                            Map map3 = setTextScaleX.setMaxEms;
                            Object method3 = map3.get(510767826);
                            if (method3 != null) {
                                z10 = false;
                            } else {
                                z10 = false;
                                method3 = ((Class) setTextScaleX.setX((char) (Gravity.getAbsoluteGravity(0, 0) + 49111), TextUtils.lastIndexOf("", '0', 0, 0) + 42, 52 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getMethod("s", Integer.TYPE);
                                map3.put(510767826, method3);
                            }
                            bArr[i19] = ((Byte) ((Method) method3).invoke(null, objArr5)).byteValue();
                            i19++;
                            i14 = 2;
                            i15 = 0;
                        }
                    }
                    bArr2 = bArr;
                }
                bArr2.getClass();
                byte[] bArr3 = f61126d;
                Object[] objArr6 = {Integer.valueOf(i12), Integer.valueOf(f61123a)};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(-769569468);
                if (method4 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 49, 433 - TextUtils.indexOf((CharSequence) "", '0', 0));
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr7 = new Object[1];
                    b((byte) (b14 + 1), b13, b14, objArr7);
                    String str2 = (String) objArr7[0];
                    Class<?> cls4 = Integer.TYPE;
                    method4 = cls3.getMethod(str2, cls4, cls4);
                    map4.put(-769569468, method4);
                }
                iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method4).invoke(null, objArr6)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) f61124b) ^ 7616081452308447380L)));
                int i21 = f61130h + 93;
                f61129g = i21 % 128;
                int i22 = i21 % 2;
            }
            if (iIntValue > 0) {
                settextalignment.setX = ((i12 + iIntValue) - 2) + ((int) (((long) f61123a) ^ 7616081452308447380L)) + i13;
                Object[] objArr8 = {settextalignment, Integer.valueOf(i11), Integer.valueOf(f61125c), sb2};
                Map map5 = setTextScaleX.setMaxEms;
                Object method5 = map5.get(193260760);
                if (method5 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 42, ((Process.getThreadPriority(0) + 20) >> 6) + 2803);
                    byte b15 = (byte) 0;
                    byte b16 = b15;
                    Object[] objArr9 = new Object[1];
                    b(b16, b15, b16, objArr9);
                    String str3 = (String) objArr9[0];
                    Class<?> cls6 = Integer.TYPE;
                    method5 = cls5.getMethod(str3, Object.class, cls6, cls6, Object.class);
                    map5.put(193260760, method5);
                }
                ((StringBuilder) ((Method) method5).invoke(null, objArr8)).append(settextalignment.setCompoundDrawableTintBlendMode);
                settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                byte[] bArr4 = f61126d;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i23 = 0; i23 < length2; i23++) {
                        bArr5[i23] = (byte) (((long) bArr4[i23]) ^ 7616081452308447380L);
                    }
                    bArr4 = bArr5;
                }
                boolean z11 = bArr4 != null;
                settextalignment.setDividerPadding = 1;
                while (settextalignment.setDividerPadding < iIntValue) {
                    int i24 = f61130h + 33;
                    f61129g = i24 % 128;
                    if (i24 % 2 != 0) {
                        throw null;
                    }
                    if (!z11) {
                        settextalignment.setX--;
                        throw null;
                    }
                    byte[] bArr6 = f61126d;
                    int i25 = settextalignment.setX;
                    settextalignment.setX = i25 - 1;
                    char c10 = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr6[i25]) ^ 7616081452308447380L)) + s4)) ^ b10));
                    settextalignment.setCompoundDrawableTintBlendMode = c10;
                    sb2.append(c10);
                    settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                    settextalignment.setDividerPadding++;
                    int i26 = f61130h + 53;
                    f61129g = i26 % 128;
                    int i27 = i26 % 2;
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

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            int r8 = r8 * 4
            int r0 = r8 + 1
            int r6 = r6 * 3
            int r6 = 112 - r6
            byte[] r0 = new byte[r0]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.tk.f61131i
            if (r2 != 0) goto L1a
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L36
        L1a:
            r3 = r1
        L1b:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r1)
            r9[r1] = r6
            return
        L28:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r2[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r2
            r2 = r0
            r0 = r9
            r9 = r5
        L36:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r8
            r8 = r9
            r9 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.tk.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f61131i = new byte[]{4, 27, -82, 100};
    }

    public static void d() {
        f61123a = 815502707;
        f61124b = -1454817101;
        f61125c = -790423936;
        f61126d = new byte[]{51, 52, DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE, -33, 48, 52, 121, -61, 7, 56, 12, 60, 12, -116, 127, -42, -66, -113, Constants.CVR_B1b85_0110_TERMINAL, -33, -98, 113, -1, 126, UtilitiesSDKConstants.SRP_LABEL_ENC, -113, 115, 76, Constants.FCI_TEMPLATE, 108, -102, 109, 109, -100, -102, 110, 109, -111, -104, -42, 57, -110, -74, 81, 76, GenerateAcResponseApdu.DDA_HEADER, Constants.RESP_MSG_TEMPLATE_FORMAT_2, -44, 75, 34, 123, 118, 110, 117, 124, 100, 98, 117, 110, 118, -87, 13, GenerateAcResponseApdu.DDA_HEADER, 123, 74, 100, 101, -94, Base64.padSymbol, 113, Constants.CVR_B1b85_0111_VERIFIED_CLOUD, 103, 109, -92, 13, 108, -94, 13, -108, 114, 117, -43, 49, 122, 75, 103, 122, 98, -90, 60, 127, 118, GenerateAcResponseApdu.DDA_HEADER, 118, -83, Constants.CVR_B1b41_1110_ONLINE_PIN, 99, -94, 56, 78, -108, 126, 100, 78, 104, 113, -108, -108, -108, -108};
    }

    public static void setCompoundDrawableTintBlendMode(@NotNull byte[] p4) {
        int i10 = f61127e;
        int i11 = i10 + 35;
        f61128f = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(p4, "");
        if (p4.length > 1024) {
            mr mrVar = mr.setTextAlignment;
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            a((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 24, (byte) ((Process.getThreadPriority(0) + 20) >> 6), (short) (19 - Color.argb(0, 0, 0, 0)), (-2041206183) - Color.green(0), 1714235973 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(p4.length);
            mt.setX(new Object[]{mrVar, sb2.toString()}, -855939515, 855939522, (int) System.currentTimeMillis());
        }
        int i13 = i10 + 35;
        f61128f = i13 % 128;
        int i14 = i13 % 2;
    }

    public static void setY(@NotNull String p4) {
        int i10 = f61127e;
        int i11 = i10 + 71;
        f61128f = i11 % 128;
        int i12 = i11 % 2;
        Intrinsics.checkNotNullParameter(p4, "");
        if (p4.length() != 12) {
            StringBuilder sb2 = new StringBuilder();
            Object[] objArr = new Object[1];
            a((-25) - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 98), KeyEvent.keyCodeFromString("") - 2041206184, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1714235928, objArr);
            sb2.append(((String) objArr[0]).intern());
            sb2.append(p4);
            TerminalException terminalException = new TerminalException(13, sb2.toString(), null);
            mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException;
        }
        Object[] objArr2 = new Object[1];
        a((-25) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ExpandableListView.getPackedPositionGroup(0L), (short) (Color.blue(0) - 30), View.getDefaultSize(0, 0) - 2041206198, 1714235941 - TextUtils.lastIndexOf("", '0', 0, 0), objArr2);
        if (new Regex(((String) objArr2[0]).intern()).matches(p4)) {
            int i13 = i10 + 1;
            f61128f = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
            return;
        }
        StringBuilder sb3 = new StringBuilder();
        Object[] objArr3 = new Object[1];
        a((-22) - Process.getGidForName(""), (byte) (Process.myTid() >> 22), (short) ((ViewConfiguration.getFadingEdgeLength() >> 16) - 1), (-2041206215) - TextUtils.lastIndexOf("", '0'), ExpandableListView.getPackedPositionChild(0L) + 1714235956, objArr3);
        sb3.append(((String) objArr3[0]).intern());
        sb3.append(p4);
        TerminalException terminalException2 = new TerminalException(13, sb3.toString(), null);
        mt.setX(new Object[]{terminalException2}, 1181816825, -1181816816, (int) System.currentTimeMillis());
        throw terminalException2;
    }
}
