package com.mypinpad.tsdk.isolation;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import androidx.camera.camera2.internal.n1;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/mypinpad/tsdk/i/getTooFewDigitsMessage;", "Lcom/mypinpad/tsdk/i/setLayerType;", "", "p0", "<init>", "([B)V", "setX"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class getTooFewDigitsMessage extends setLayerType {

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static char[] f55961t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static char f55962u0;
    public static int v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static int f55963w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final byte[] f55964x0 = null;

    static {
        b();
        v0 = 0;
        f55963w0 = 1;
        e();
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getTooFewDigitsMessage(@NotNull byte[] bArr) throws Throwable {
        int i10;
        super(bArr, false, 2, null);
        String str = "";
        Intrinsics.checkNotNullParameter(bArr, "");
        int i11 = 0;
        if (bArr.length == 16) {
            return;
        }
        int iMyTid = Process.myTid() >> 22;
        int i12 = 19 - iMyTid;
        char modifierMetaStateMask = (byte) (47 - ((byte) KeyEvent.getModifierMetaStateMask()));
        char[] charArray = "\u0005\u0002\u0001\u0007\u0004\u0003\u000e\f\u000b\u000f\u0003\u0000\u0003\u000b\u000f\u0004\b\u0006㗤".toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = f55961t0;
        int i13 = 1;
        int i14 = 290255894;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i15 = 0;
            while (i15 < length) {
                try {
                    Object[] objArr = new Object[i13];
                    objArr[i11] = Integer.valueOf(cArr[i15]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i14));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) TextUtils.getCapsMode(str, i11, i11), (ViewConfiguration.getTouchSlop() >> 8) + 45, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1115);
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr2 = new Object[1];
                        a(b11, b10, b11, objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i15] = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    i15++;
                    str = str;
                    length = length;
                    i11 = 0;
                    i13 = 1;
                    i14 = 290255894;
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
        Object[] objArr3 = {Integer.valueOf(f55962u0)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 44, View.MeasureSpec.getSize(0) + 1116);
            byte b12 = (byte) 0;
            byte b13 = b12;
            Object[] objArr4 = new Object[1];
            a(b13, b12, b13, objArr4);
            method2 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
            map2.put(290255894, method2);
        }
        char cCharValue = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
        char[] cArr3 = new char[i12];
        if (i12 % 2 != 0) {
            i10 = 18 - iMyTid;
            cArr3[i10] = (char) (charArray[i10] - modifierMetaStateMask);
        } else {
            i10 = i12;
        }
        if (i10 > 1) {
            int i16 = v0 + 43;
            f55963w0 = i16 % 128;
            int i17 = i16 % 2;
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i18 = setincludefontpadding.setDividerPadding;
                if (i18 >= i10) {
                    break;
                }
                char c10 = charArray[i18];
                setincludefontpadding.setY = c10;
                int i19 = i18 + 1;
                char c11 = charArray[i19];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c11;
                if (c10 == c11) {
                    cArr3[i18] = (char) (c10 - modifierMetaStateMask);
                    cArr3[i19] = (char) (c11 - modifierMetaStateMask);
                } else {
                    Object[] objArr5 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 27 - (Process.myTid() >> 22), View.MeasureSpec.getMode(0) + 2311);
                        byte b14 = (byte) 0;
                        byte b15 = (byte) (b14 + 3);
                        Object[] objArr6 = new Object[1];
                        a(b15, b14, (byte) (b15 - 3), objArr6);
                        String str2 = (String) objArr6[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr5)).intValue();
                    int i20 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i20) {
                        int i21 = v0 + 29;
                        f55963w0 = i21 % 128;
                        int i22 = i21 % 2;
                        Object[] objArr7 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 == null) {
                            Class cls5 = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 49103), 35 - (Process.myPid() >> 22), 2545 - View.MeasureSpec.getSize(0));
                            byte b16 = (byte) 0;
                            Object[] objArr8 = new Object[1];
                            a((byte) (b16 | 7), b16, b16, objArr8);
                            String str3 = (String) objArr8[0];
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod(str3, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr7)).intValue();
                        int i23 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i24 = setincludefontpadding.setDividerPadding;
                        cArr3[i24] = cArr[iIntValue2];
                        cArr3[i24 + 1] = cArr[i23];
                    } else {
                        int i25 = setincludefontpadding.setX;
                        int i26 = setincludefontpadding.setOnFocusChangeListener;
                        if (i25 == i26) {
                            int i27 = v0 + 47;
                            f55963w0 = i27 % 128;
                            int i28 = i27 % 2;
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i20, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i29 = (i26 * cCharValue) + iA2;
                            int i30 = setincludefontpadding.setDividerPadding;
                            cArr3[i30] = cArr[(i25 * cCharValue) + iA];
                            cArr3[i30 + 1] = cArr[i29];
                        } else {
                            int i31 = (i25 * cCharValue) + i20;
                            int i32 = (i26 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i33 = setincludefontpadding.setDividerPadding;
                            cArr3[i33] = cArr[i31];
                            cArr3[i33 + 1] = cArr[i32];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
            }
        }
        int i34 = 0;
        while (i34 < i12) {
            int i35 = f55963w0 + 123;
            v0 = i35 % 128;
            if (i35 % 2 != 0) {
                cArr3[i34] = (char) (cArr3[i34] ^ 1506);
                i34 += 87;
            } else {
                cArr3[i34] = (char) (cArr3[i34] ^ 13722);
                i34++;
            }
        }
        throw new IllegalArgumentException(n1.f(cArr3).toString());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002d  */
    /* JADX WARN: Code duplicated, block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:11:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002d
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(int r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r7 = r7 + 99
            int r9 = r9 * 2
            int r9 = 3 - r9
            byte[] r0 = new byte[r8]
            byte[] r1 = com.mypinpad.tsdk.isolation.getTooFewDigitsMessage.f55964x0
            r2 = 0
            if (r1 != 0) goto L18
            r7 = r8
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L35
        L18:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L1c:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r0[r3] = r5
            if (r4 != r7) goto L2d
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r2)
            r10[r2] = r7
            return
        L2d:
            r3 = r1[r9]
            r6 = r10
            r10 = r9
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L35:
            int r9 = -r9
            int r8 = r8 + r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.getTooFewDigitsMessage.a(int, short, short, java.lang.Object[]):void");
    }

    public static void b() {
        f55964x0 = new byte[]{27, 123, 116, -20};
    }

    public static void e() {
        f55962u0 = (char) 53957;
        f55961t0 = new char[]{59199, 59194, 59182, 59186, 59183, 59191, 59165, 59198, 59253, 58560, 59189, 59178, 59190, 59259, 58561, 59177};
    }
}
