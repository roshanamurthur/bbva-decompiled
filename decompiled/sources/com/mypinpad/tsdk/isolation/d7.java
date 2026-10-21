package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.mastercard.mpsdk.mcbp.mcmlite.apdu.emv.GenerateAcResponseApdu;
import com.noknok.android.client.asm.authenticator.KSUtils;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class d7 extends FunctionReferenceImpl implements Function3<Integer, String, Throwable, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f55112p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int f55113q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f55114r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final byte[] f55115s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f55116t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f55117u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f55118w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final byte[] f55119x0 = null;

    static {
        c();
        v0 = 0;
        f55118w0 = 1;
        f55116t0 = 0;
        f55117u0 = 1;
        f55112p0 = 294865829;
        f55113q0 = -1454817065;
        f55114r0 = -1370632279;
        f55115s0 = new byte[]{108, -73, 124, 107, 101, -123, -106, 105, 107, 103, -71, 122, 66, 109, -98, -107, 126, -100, 105, -98, -128, -79, 92, 109, -103, Constants.DIRECTORY_ENTRY, -87, 90, 127, KSUtils.PLAIN_BUFFER, 99, -118, -123, 64, 109, -111, 99, GenerateAcResponseApdu.DDA_HEADER, -75, UtilitiesSDKConstants.SRP_LABEL_ENC, 92, 109, -103, Constants.DIRECTORY_ENTRY, -87, 90, 127, KSUtils.PLAIN_BUFFER, 99, -118, -105, -75, 87, 102, -122, 104, 109, -109, 103, -121, Constants.FCI_TEMPLATE, Constants.FCI_TEMPLATE, 110, 105, -102, 98, -103, -106, Constants.CVR_B1b85_0110_TERMINAL, -109, 101, -37, 41, 108, -73, 124, 107, 101, -123, -106, 105, 107, 103, -108, -108};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public d7(mj mjVar) throws Throwable {
        short sMakeMeasureSpec = (short) View.MeasureSpec.makeMeasureSpec(0, 0);
        Object[] objArr = new Object[1];
        a((-16777272) - Color.rgb(0, 0, 0), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), sMakeMeasureSpec, (-117739210) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1193669839 - (Process.myTid() >> 22), objArr);
        String strIntern = ((String) objArr[0]).intern();
        short keyRepeatTimeout = (short) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
        Object[] objArr2 = new Object[1];
        a(8 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), keyRepeatTimeout, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 117739211, MotionEvent.axisFromString("") + 1193669850, objArr2);
        super(3, mjVar, mj.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    public static void a(int i10, byte b10, short s4, int i11, int i12, Object[] objArr) throws Throwable {
        byte[] bArr;
        byte[] bArr2;
        int length;
        int i13;
        int i14 = f55113q0;
        setTextAlignment settextalignment = new setTextAlignment();
        StringBuilder sb2 = new StringBuilder();
        try {
            int i15 = 1;
            Object[] objArr2 = {Integer.valueOf(i10), Integer.valueOf(i14)};
            int i16 = 0;
            Map map = setTextScaleX.setMaxEms;
            Object method = map.get(-769569468);
            if (method == null) {
                Class cls = (Class) setTextScaleX.setX((char) ('0' - AndroidCharacter.getMirror('0')), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 50, (ViewConfiguration.getEdgeSlop() >> 16) + 434);
                byte b11 = (byte) 0;
                byte b12 = b11;
                Object[] objArr3 = new Object[1];
                b(b11, b12, b12, objArr3);
                String str = (String) objArr3[0];
                Class<?> cls2 = Integer.TYPE;
                method = cls.getMethod(str, cls2, cls2);
                map.put(-769569468, method);
            }
            int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
            int i17 = iIntValue == -1 ? 1 : 0;
            int i18 = f55112p0;
            byte[] bArr3 = f55115s0;
            if (i17 != 0) {
                int i19 = f55118w0 + 71;
                int i20 = i19 % 128;
                v0 = i20;
                int i21 = i19 % 2;
                if (bArr3 != null) {
                    int i22 = i20 + 3;
                    f55118w0 = i22 % 128;
                    if (i22 % 2 == 0) {
                        length = bArr3.length;
                        bArr2 = new byte[length];
                        i13 = 1;
                    } else {
                        length = bArr3.length;
                        bArr2 = new byte[length];
                        i13 = 0;
                    }
                    while (i13 < length) {
                        Object[] objArr4 = new Object[i15];
                        objArr4[i16] = Integer.valueOf(bArr3[i13]);
                        Map map2 = setTextScaleX.setMaxEms;
                        Object method2 = map2.get(510767826);
                        if (method2 == null) {
                            method2 = ((Class) setTextScaleX.setX((char) (View.combineMeasuredStates(i16, i16) + 49111), 41 - (Process.myPid() >> 22), 52 - TextUtils.getOffsetAfter("", i16))).getMethod("s", Integer.TYPE);
                            map2.put(510767826, method2);
                        }
                        bArr2[i13] = ((Byte) ((Method) method2).invoke(null, objArr4)).byteValue();
                        i13++;
                        length = length;
                        i15 = 1;
                        i16 = 0;
                    }
                } else {
                    bArr2 = bArr3;
                }
                bArr2.getClass();
                int i23 = f55118w0 + 121;
                v0 = i23 % 128;
                int i24 = i23 % 2;
                Object[] objArr5 = {Integer.valueOf(i12), Integer.valueOf(i18)};
                Map map3 = setTextScaleX.setMaxEms;
                Object method3 = map3.get(-769569468);
                if (method3 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getPressedStateDuration() >> 16), 49 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0', 0) + 435);
                    byte b13 = (byte) 0;
                    byte b14 = b13;
                    Object[] objArr6 = new Object[1];
                    b(b13, b14, b14, objArr6);
                    String str2 = (String) objArr6[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str2, cls4, cls4);
                    map3.put(-769569468, method3);
                }
                iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) method3).invoke(null, objArr5)).intValue()]) ^ 7616081452308447380L)) + ((int) (((long) i14) ^ 7616081452308447380L)));
            }
            if (iIntValue > 0) {
                settextalignment.setX = ((i12 + iIntValue) - 2) + ((int) (((long) i18) ^ 7616081452308447380L)) + i17;
                Object[] objArr7 = {settextalignment, Integer.valueOf(i11), Integer.valueOf(f55114r0), sb2};
                Map map4 = setTextScaleX.setMaxEms;
                Object method4 = map4.get(193260760);
                if (method4 == null) {
                    Class cls5 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 42 - View.resolveSizeAndState(0, 0, 0), 2804 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    byte b15 = (byte) 0;
                    byte b16 = (byte) (b15 + 1);
                    Object[] objArr8 = new Object[1];
                    b(b15, b16, (byte) (b16 - 1), objArr8);
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
                    for (int i25 = 0; i25 < length2; i25++) {
                        bArr[i25] = (byte) (((long) bArr3[i25]) ^ 7616081452308447380L);
                    }
                } else {
                    bArr = bArr3;
                }
                int i26 = 1;
                int i27 = bArr != null ? 1 : 0;
                settextalignment.setDividerPadding = 1;
                while (settextalignment.setDividerPadding < iIntValue) {
                    if (i27 != i26) {
                        settextalignment.setX -= i26;
                        throw null;
                    }
                    int i28 = f55118w0 + 115;
                    v0 = i28 % 128;
                    int i29 = i28 % 2;
                    int i30 = settextalignment.setX;
                    settextalignment.setX = i30 - 1;
                    char c10 = (char) (settextalignment.setY + (((byte) (((byte) (((long) bArr3[i30]) ^ 7616081452308447380L)) + s4)) ^ b10));
                    settextalignment.setCompoundDrawableTintBlendMode = c10;
                    sb2.append(c10);
                    settextalignment.setY = settextalignment.setCompoundDrawableTintBlendMode;
                    settextalignment.setDividerPadding++;
                    i26 = 1;
                }
            }
            String string = sb2.toString();
            int i31 = v0 + 39;
            f55118w0 = i31 % 128;
            if (i31 % 2 == 0) {
                throw null;
            }
            objArr[0] = string;
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002b
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r7 = r7 * 3
            int r7 = r7 + 109
            int r8 = r8 * 3
            int r0 = r8 + 1
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.d7.f55119x0
            r2 = 0
            if (r1 != 0) goto L1b
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L37
        L1b:
            r3 = r2
        L1c:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2b:
            int r6 = r6 + 1
            r3 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L37:
            int r6 = r6 + r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.d7.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f55119x0 = new byte[]{10, -11, -56, -115};
    }

    public final void d(int i10, @Nullable String str, @Nullable Throwable th2) {
        int i11 = f55117u0 + 33;
        f55116t0 = i11 % 128;
        int i12 = i11 % 2;
        mj.setX(new Object[]{Integer.valueOf(i10), str, th2}, 1488875720, -1488875720, i10);
        int i13 = f55117u0 + 57;
        f55116t0 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ Unit invoke(Integer num, String str, Throwable th2) {
        int i10 = f55117u0 + 95;
        f55116t0 = i10 % 128;
        int i11 = i10 % 2;
        d(num.intValue(), str, th2);
        if (i11 != 0) {
            Unit unit = Unit.INSTANCE;
            throw null;
        }
        Unit unit2 = Unit.INSTANCE;
        int i12 = f55116t0 + 71;
        f55117u0 = i12 % 128;
        int i13 = i12 % 2;
        return unit2;
    }
}
