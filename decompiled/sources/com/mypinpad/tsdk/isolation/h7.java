package com.mypinpad.tsdk.isolation;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.activity.a;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h7 extends FunctionReferenceImpl implements Function3<Integer, String, Throwable, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final char[] f56151p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final char f56152q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static int f56153r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static int f56154s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static int f56155t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static int f56156u0;
    public static final byte[] v0 = null;

    static {
        c();
        f56155t0 = 0;
        f56156u0 = 1;
        f56153r0 = 0;
        f56154s0 = 1;
        f56152q0 = (char) 53959;
        f56151p0 = new char[]{59193, 59184, 59144, 59154, 59198, 59191, 59263, 59180, 59187, 59183, 59195, 59185, 59197, 59232, 59250, 59176, 59151, 59252, 59186, 59140, 59192, 59251, 58563, 59189, 59177, 59188, 58561, 59181, 59199, 59159, 59196, 59149, 58565, 58560, 59194, 58562};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h7(mk mkVar) throws Throwable {
        Object[] objArr = new Object[1];
        a(TextUtils.lastIndexOf("", '0') + 12, "\u001c\u0000\"\u0004\u0015\b\n\"\u0018\u001a㘢", (byte) (37 - TextUtils.getCapsMode("", 0, 0)), objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        a((ViewConfiguration.getTouchSlop() >> 8) + 74, "\u001c\u0000\"\u0004\u0015\b\n\"\u0018\u001a\u0000\f\u0010\u001b\u0007\u0019#\u0016\u001d\u0019\u0018\u0013\u0019\u0016\u001c\u0000\u0000\u0005!\u0010\u0003\u0016\u0005\u001b\n#\u001c!\u0017\u000b#\u0016#\f\u0003\b\u001e\u0018\u0012#\u0011\u0019\n#\u001c!\u0017\u000b#\u0016#\f\u000e\n\u0019\u001a\n\u001f\u0001\u0000\u0001\u0010\r ", (byte) (102 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), objArr2);
        super(3, mkVar, mk.class, strIntern, ((String) objArr2[0]).intern(), 0);
    }

    public static void a(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = f56151p0;
        int i12 = 290255894;
        int i13 = 0;
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
                        Class cls = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", "", 0, 0), View.resolveSizeAndState(0, 0, 0) + 45, View.resolveSize(0, 0) + 1116);
                        byte b11 = (byte) 0;
                        Object[] objArr3 = new Object[1];
                        b(b11, (byte) (b11 | 7), b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i14++;
                    i12 = 290255894;
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
        Object[] objArr4 = {Integer.valueOf(f56152q0)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 44 - TextUtils.indexOf((CharSequence) "", '0'), 1115 - TextUtils.indexOf((CharSequence) "", '0'));
            byte b12 = (byte) 0;
            Object[] objArr5 = new Object[1];
            b(b12, (byte) (b12 | 7), b12, objArr5);
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
        int i15 = 2;
        if (i11 > 1) {
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i16 = setincludefontpadding.setDividerPadding;
                if (i16 >= i11) {
                    break;
                }
                char c10 = charArray[i16];
                setincludefontpadding.setY = c10;
                int i17 = i16 + 1;
                char c11 = charArray[i17];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c11;
                if (c10 == c11) {
                    cArr3[i16] = (char) (c10 - b10);
                    cArr3[i17] = (char) (c11 - b10);
                    int i18 = f56155t0 + 17;
                    f56156u0 = i18 % 128;
                    int i19 = i18 % i15;
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
                    objArr6[i15] = Integer.valueOf(cCharValue);
                    objArr6[1] = setincludefontpadding;
                    objArr6[i13] = setincludefontpadding;
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 27, View.getDefaultSize(i13, i13) + 2311);
                        byte length2 = (byte) v0.length;
                        Object[] objArr7 = new Object[1];
                        b((byte) i13, length2, (byte) (length2 - 4), objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i20 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i20) {
                        int i21 = f56156u0 + 51;
                        f56155t0 = i21 % 128;
                        int i22 = i21 % 2;
                        Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 == null) {
                            Class cls5 = (Class) setTextScaleX.setX((char) (KeyEvent.getDeadChar(0, 0) + 49103), 35 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.getTrimmedLength("") + 2545);
                            byte b13 = (byte) 0;
                            byte b14 = b13;
                            Object[] objArr9 = new Object[1];
                            b(b13, b14, b14, objArr9);
                            String str3 = (String) objArr9[0];
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod(str3, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i23 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i24 = setincludefontpadding.setDividerPadding;
                        cArr3[i24] = cArr[iIntValue2];
                        cArr3[i24 + 1] = cArr[i23];
                    } else {
                        int i25 = setincludefontpadding.setX;
                        int i26 = setincludefontpadding.setOnFocusChangeListener;
                        if (i25 == i26) {
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i20, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i27 = (i26 * cCharValue) + iA2;
                            int i28 = setincludefontpadding.setDividerPadding;
                            cArr3[i28] = cArr[(i25 * cCharValue) + iA];
                            cArr3[i28 + 1] = cArr[i27];
                        } else {
                            int i29 = (i25 * cCharValue) + i20;
                            int i30 = (i26 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i31 = setincludefontpadding.setDividerPadding;
                            cArr3[i31] = cArr[i29];
                            cArr3[i31 + 1] = cArr[i30];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
                int i32 = f56156u0 + 37;
                f56155t0 = i32 % 128;
                int i33 = i32 % 2;
                i13 = 0;
                i15 = 2;
            }
        }
        for (int i34 = 0; i34 < i10; i34++) {
            int i35 = f56155t0 + 51;
            f56156u0 = i35 % 128;
            int i36 = i35 % 2;
            cArr3[i34] = (char) (cArr3[i34] ^ 13722);
        }
        objArr[0] = new String(cArr3);
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
    public static void b(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 4
            int r8 = r8 + 4
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r7 = 106 - r7
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.h7.v0
            r2 = 0
            if (r1 != 0) goto L18
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r6
            goto L34
        L18:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1c:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L34:
            int r6 = r6 + r7
            int r7 = r9 + 1
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.h7.b(byte, short, short, java.lang.Object[]):void");
    }

    public static void c() {
        v0 = new byte[]{4, 27, -82, 100};
    }

    public final void d(int i10, @Nullable String str, @Nullable Throwable th2) {
        int i11 = f56153r0 + 121;
        f56154s0 = i11 % 128;
        if (i11 % 2 == 0) {
            mk.setDividerPadding(new Object[]{Integer.valueOf(i10), str, th2}, 1893589161, -1893589161, i10);
            throw null;
        }
        mk.setDividerPadding(new Object[]{Integer.valueOf(i10), str, th2}, 1893589161, -1893589161, i10);
        int i12 = f56153r0 + 53;
        f56154s0 = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // kotlin.jvm.functions.Function3
    public final /* synthetic */ Unit invoke(Integer num, String str, Throwable th2) {
        int i10 = f56154s0 + 57;
        f56153r0 = i10 % 128;
        int i11 = i10 % 2;
        d(num.intValue(), str, th2);
        if (i11 == 0) {
            return Unit.INSTANCE;
        }
        Unit unit = Unit.INSTANCE;
        throw null;
    }
}
