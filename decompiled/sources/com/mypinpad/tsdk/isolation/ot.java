package com.mypinpad.tsdk.isolation;

import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0005\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/mypinpad/tsdk/i/ot;", "Lcom/mypinpad/tsdk/i/pf;", "Ljava/util/UUID;", "m", "Ljava/util/UUID;", "setX", "()Ljava/util/UUID;", "setCompoundDrawableTintBlendMode", "", "n", "Ljava/lang/String;", "setY", "()Ljava/lang/String;", "Lcom/mypinpad/tsdk/i/getDynamicButtonIconTextSpacingDp;", "o", "Lcom/mypinpad/tsdk/i/getDynamicButtonIconTextSpacingDp;", "setDividerPadding", "()Lcom/mypinpad/tsdk/i/getDynamicButtonIconTextSpacingDp;", "p0", "p1", "p2", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/mypinpad/tsdk/i/getDynamicButtonIconTextSpacingDp;)V"}, k = 1, mv = {1, 8, 0})
public final class ot extends pf {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final char f57545p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final char f57546q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final char f57547r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final char f57548s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f57549t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f57550u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static int f57551v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final byte[] f57552w = null;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f57553x = 0;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final UUID setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String setX;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final getDynamicButtonIconTextSpacingDp setDividerPadding;

    static {
        b();
        f57550u = 0;
        f57551v = 1;
        f57549t = 0;
        f57548s = (char) 20878;
        f57547r = (char) 59109;
        f57545p = (char) 63756;
        f57546q = (char) 34199;
    }

    public ot(@NotNull UUID uuid, @NotNull String str, @Nullable getDynamicButtonIconTextSpacingDp getdynamicbuttonicontextspacingdp) throws Throwable {
        Intrinsics.checkNotNullParameter(uuid, "");
        Intrinsics.checkNotNullParameter(str, "");
        int i10 = 0;
        int i11 = 33 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
        int i12 = f57550u + 71;
        f57551v = i12 % 128;
        int i13 = 2;
        if (i12 % 2 == 0) {
            throw null;
        }
        char[] charArray = "偖ᰮ慢益鯏衛욀뜛昆没ꁺ㱌븋磢ὶ쵉ꚯ쐑邴묣\u0efc\uf28f뉏嵐北\u0fe3秚ฦ犯찭璼㊏〶ю".toCharArray();
        setAlwaysDrawnWithCacheEnabled setalwaysdrawnwithcacheenabled = new setAlwaysDrawnWithCacheEnabled();
        char[] cArr = new char[charArray.length];
        setalwaysdrawnwithcacheenabled.setOnFocusChangeListener = 0;
        char[] cArr2 = new char[2];
        while (true) {
            int i14 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            if (i14 >= charArray.length) {
                String str2 = new String(cArr, 0, i11);
                int i15 = f57551v + 117;
                f57550u = i15 % 128;
                int i16 = i15 % 2;
                super(null, str2.intern(), null, 0L, 13, null);
                this.setCompoundDrawableTintBlendMode = uuid;
                this.setX = str;
                this.setDividerPadding = getdynamicbuttonicontextspacingdp;
                return;
            }
            cArr2[i10] = charArray[i14];
            char c10 = 1;
            cArr2[1] = charArray[i14 + 1];
            int i17 = 58224;
            int i18 = i10;
            while (i18 < 16) {
                int i19 = f57550u + 27;
                f57551v = i19 % 128;
                int i20 = i19 % i13;
                char c11 = cArr2[c10];
                char c12 = cArr2[0];
                int i21 = (c12 + i17) ^ ((c12 << 4) + ((char) (((long) f57547r) ^ 4333817592127744003L)));
                int i22 = c12 >>> 5;
                char[] cArr3 = charArray;
                try {
                    Object[] objArr = {Integer.valueOf(c11), Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(f57548s)};
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(-1434759016);
                    int i23 = f57553x;
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 48534), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 47, (ViewConfiguration.getPressedStateDuration() >> 16) + 2672);
                        byte b10 = (byte) (i23 & 3);
                        byte b11 = (byte) (-b10);
                        Object[] objArr2 = new Object[1];
                        c((byte) (b11 + 1), b11, b10, objArr2);
                        String str3 = (String) objArr2[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str3, cls2, cls2, cls2, cls2);
                        map.put(-1434759016, method);
                    }
                    char cCharValue = ((Character) ((Method) method).invoke(null, objArr)).charValue();
                    cArr2[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr2[0]), Integer.valueOf((cCharValue + i17) ^ ((cCharValue << 4) + ((char) (((long) f57545p) ^ 4333817592127744003L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f57546q)};
                    Object method2 = map.get(-1434759016);
                    if (method2 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) (48533 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 47 - (ViewConfiguration.getPressedStateDuration() >> 16), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 2672);
                        byte b12 = (byte) (i23 & 3);
                        byte b13 = (byte) (-b12);
                        Object[] objArr4 = new Object[1];
                        c((byte) (b13 + 1), b13, b12, objArr4);
                        String str4 = (String) objArr4[0];
                        Class<?> cls4 = Integer.TYPE;
                        method2 = cls3.getMethod(str4, cls4, cls4, cls4, cls4);
                        map.put(-1434759016, method2);
                    }
                    cArr2[0] = ((Character) ((Method) method2).invoke(null, objArr3)).charValue();
                    i17 -= 40503;
                    i18++;
                    charArray = cArr3;
                    i11 = i11;
                    i13 = 2;
                    c10 = 1;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            int i24 = i11;
            char[] cArr4 = charArray;
            int i25 = setalwaysdrawnwithcacheenabled.setOnFocusChangeListener;
            cArr[i25] = cArr2[0];
            cArr[i25 + 1] = cArr2[1];
            Object[] objArr5 = {setalwaysdrawnwithcacheenabled, setalwaysdrawnwithcacheenabled};
            Map map2 = setTextScaleX.setMaxEms;
            Object method3 = map2.get(1396159716);
            if (method3 == null) {
                Class cls5 = (Class) setTextScaleX.setX((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 37 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getEdgeSlop() >> 16) + 2145);
                byte b14 = (byte) 0;
                byte b15 = (byte) (b14 - 1);
                Object[] objArr6 = new Object[1];
                c((byte) (b15 + 1), b15, b14, objArr6);
                method3 = cls5.getMethod((String) objArr6[0], Object.class, Object.class);
                map2.put(1396159716, method3);
            }
            ((Method) method3).invoke(null, objArr5);
            charArray = cArr4;
            i11 = i24;
            i10 = 0;
            i13 = 2;
        }
    }

    public static void b() {
        f57552w = new byte[]{59, 125, 28, -9};
        f57553x = 245;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 1
            int r9 = r9 * 2
            int r9 = 105 - r9
            int r8 = r8 + 4
            byte[] r0 = new byte[r7]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.ot.f57552w
            if (r2 != 0) goto L18
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r9
            r9 = r8
            goto L33
        L18:
            r3 = r1
        L19:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r0[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L2a
            java.lang.String r7 = new java.lang.String
            r7.<init>(r0, r1)
            r10[r1] = r7
            return
        L2a:
            r3 = r2[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r2
            r2 = r0
            r0 = r10
            r10 = r6
        L33:
            int r8 = r8 + r10
            r10 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ot.c(byte, int, short, java.lang.Object[]):void");
    }

    @JvmName(name = "setDividerPadding")
    @Nullable
    public final getDynamicButtonIconTextSpacingDp setDividerPadding() {
        int i10 = f57549t + 63;
        int i11 = i10 % 128;
        int i12 = i10 % 2;
        int i13 = i11 + 43;
        f57549t = i13 % 128;
        int i14 = i13 % 2;
        getDynamicButtonIconTextSpacingDp getdynamicbuttonicontextspacingdp = this.setDividerPadding;
        if (i14 != 0) {
            int i15 = 60 / 0;
        }
        return getdynamicbuttonicontextspacingdp;
    }

    @JvmName(name = "setX")
    @NotNull
    public final UUID setX() {
        int i10 = f57549t + 7;
        int i11 = i10 % 128;
        if (i10 % 2 != 0) {
            return this.setCompoundDrawableTintBlendMode;
        }
        throw null;
    }

    @JvmName(name = "setY")
    @NotNull
    public final String setY() {
        int i10 = f57549t;
        int i11 = i10 + 95;
        int i12 = i11 % 128;
        if (i11 % 2 == 0) {
            int i13 = 41 / 0;
        }
        int i14 = i10 + 19;
        int i15 = i14 % 128;
        int i16 = i14 % 2;
        return this.setX;
    }
}
