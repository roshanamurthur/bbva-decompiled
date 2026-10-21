package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0007\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00128\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\r\u0010\u0015"}, d2 = {"Lcom/mypinpad/tsdk/i/ou;", "Lcom/mypinpad/tsdk/i/pf;", "Ljava/util/UUID;", "m", "Ljava/util/UUID;", "setY", "()Ljava/util/UUID;", "setCompoundDrawableTintBlendMode", "", "n", "Ljava/lang/Integer;", "setX", "()Ljava/lang/Integer;", "setOnFocusChangeListener", "o", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "()I", "setDividerPadding", "Lcom/mypinpad/tsdk/i/getDynamicButtonIconTextSpacingDp;", "p", "Lcom/mypinpad/tsdk/i/getDynamicButtonIconTextSpacingDp;", "()Lcom/mypinpad/tsdk/i/getDynamicButtonIconTextSpacingDp;", "p0", "p1", "p2", "p3", "<init>", "(Ljava/util/UUID;Ljava/lang/Integer;ILcom/mypinpad/tsdk/i/getDynamicButtonIconTextSpacingDp;)V"}, k = 1, mv = {1, 8, 0})
public final class ou extends pf {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int[] f57556q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static int f57557r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static int f57558s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static int f57559t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static int f57560u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final byte[] f57561v = null;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public final UUID setCompoundDrawableTintBlendMode;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Integer setOnFocusChangeListener;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final int setDividerPadding;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final getDynamicButtonIconTextSpacingDp setY;

    static {
        b();
        f57559t = 0;
        f57560u = 1;
        f57557r = 0;
        f57558s = 1;
        f57556q = new int[]{-529514393, 1851940597, 598329724, -874467985, 1040653828, -215275712, -1963038862, 1905912322, 16937250, -395979073, -1787144276, 524758078, -1577234257, -340022025, 311310230, 1049603355, 1020454702, 15754219};
    }

    public /* synthetic */ ou(UUID uuid, Integer num, int i10, getDynamicButtonIconTextSpacingDp getdynamicbuttonicontextspacingdp, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : uuid, (i11 & 2) != 0 ? null : num, i10, (i11 & 8) != 0 ? null : getdynamicbuttonicontextspacingdp);
    }

    public static void b() {
        f57561v = new byte[]{42, 50, -1, -90};
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002c  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0037). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void c(int r8, short r9, short r10, java.lang.Object[] r11) {
        /*
            int r9 = r9 * 4
            int r9 = r9 + 104
            int r8 = r8 * 3
            int r8 = 3 - r8
            int r10 = r10 * 2
            int r10 = 1 - r10
            byte[] r0 = new byte[r10]
            r1 = 0
            byte[] r2 = com.mypinpad.tsdk.isolation.ou.f57561v
            if (r2 != 0) goto L1a
            r9 = r8
            r4 = r1
            r3 = r2
            r2 = r0
            r0 = r11
            r11 = r10
            goto L37
        L1a:
            r3 = r1
        L1b:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r0[r3] = r5
            if (r4 != r10) goto L2c
            java.lang.String r8 = new java.lang.String
            r8.<init>(r0, r1)
            r11[r1] = r8
            return
        L2c:
            r3 = r2[r8]
            r6 = r9
            r9 = r8
            r8 = r6
            r7 = r11
            r11 = r10
            r10 = r3
            r3 = r2
            r2 = r0
            r0 = r7
        L37:
            int r10 = -r10
            int r8 = r8 + r10
            r10 = r11
            r11 = r0
            r0 = r2
            r2 = r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ou.c(int, short, short, java.lang.Object[]):void");
    }

    @JvmName(name = "setCompoundDrawableTintBlendMode")
    public final int setCompoundDrawableTintBlendMode() {
        int i10 = f57557r + 77;
        f57558s = i10 % 128;
        if (i10 % 2 != 0) {
            return this.setDividerPadding;
        }
        throw null;
    }

    @JvmName(name = "setOnFocusChangeListener")
    @Nullable
    public final getDynamicButtonIconTextSpacingDp setOnFocusChangeListener() {
        int i10 = f57558s + 67;
        int i11 = i10 % 128;
        f57557r = i11;
        if (i10 % 2 != 0) {
            int i12 = 19 / 0;
        }
        int i13 = i11 + 125;
        f57558s = i13 % 128;
        if (i13 % 2 != 0) {
            return this.setY;
        }
        throw null;
    }

    @JvmName(name = "setX")
    @Nullable
    public final Integer setX() {
        int i10 = f57557r;
        int i11 = i10 + 1;
        f57558s = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 91;
        f57558s = i13 % 128;
        if (i13 % 2 != 0) {
            return this.setOnFocusChangeListener;
        }
        throw null;
    }

    @JvmName(name = "setY")
    @Nullable
    public final UUID setY() {
        int i10 = f57557r;
        int i11 = i10 + 7;
        f57558s = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        int i12 = i10 + 47;
        f57558s = i12 % 128;
        int i13 = i12 % 2;
        return this.setCompoundDrawableTintBlendMode;
    }

    public ou(@Nullable UUID uuid, @Nullable Integer num, int i10, @Nullable getDynamicButtonIconTextSpacingDp getdynamicbuttonicontextspacingdp) throws Throwable {
        int i11;
        char[] cArr;
        int[] iArr;
        byte[] bArr;
        long j10;
        int[] iArr2 = {635047332, 1035157728, 323170602, 1509492173, 1621129990, -1687579492, 854506509, -116686371, -946706291, 812665946};
        int i12 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 18;
        setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
        char[] cArr2 = new char[4];
        char[] cArr3 = new char[20];
        int i13 = 1;
        int[] iArr3 = f57556q;
        byte[] bArr2 = f57561v;
        int i14 = 0;
        if (iArr3 != null) {
            int length = iArr3.length;
            iArr = new int[length];
            int i15 = 0;
            while (i15 < length) {
                try {
                    Object[] objArr = new Object[i13];
                    objArr[i14] = Integer.valueOf(iArr3[i15]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(1833429914);
                    if (method != null) {
                        j10 = 0;
                    } else {
                        j10 = 0;
                        Class cls = (Class) setTextScaleX.setX((char) TextUtils.indexOf("", ""), KeyEvent.normalizeMetaState(i14) + 44, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 727);
                        byte b10 = (byte) (bArr2[2] + 1);
                        byte b11 = b10;
                        Object[] objArr2 = new Object[1];
                        c(b11, b10, b11, objArr2);
                        method = cls.getMethod((String) objArr2[0], Integer.TYPE);
                        map.put(1833429914, method);
                    }
                    iArr[i15] = ((Integer) ((Method) method).invoke(null, objArr)).intValue();
                    i15++;
                    i14 = 0;
                    i13 = 1;
                    length = length;
                    i12 = i12;
                    cArr3 = cArr3;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            i11 = i12;
            cArr = cArr3;
        } else {
            i11 = i12;
            cArr = cArr3;
            iArr = iArr3;
        }
        int length2 = iArr.length;
        int[] iArr4 = new int[length2];
        if (iArr3 != null) {
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int i16 = f57559t + 33;
            f57560u = i16 % 128;
            int i17 = 2;
            int i18 = i16 % 2;
            int i19 = 0;
            while (i19 < length3) {
                int i20 = f57559t + 97;
                f57560u = i20 % 128;
                int i21 = i20 % i17;
                Object[] objArr3 = {Integer.valueOf(iArr3[i19])};
                Map map2 = setTextScaleX.setMaxEms;
                Object method2 = map2.get(1833429914);
                if (method2 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTouchSlop() >> 8), 44 - View.MeasureSpec.getSize(0), (ViewConfiguration.getEdgeSlop() >> 16) + 728);
                    byte b12 = (byte) (bArr2[2] + 1);
                    byte b13 = b12;
                    Object[] objArr4 = new Object[1];
                    c(b13, b12, b13, objArr4);
                    method2 = cls2.getMethod((String) objArr4[0], Integer.TYPE);
                    map2.put(1833429914, method2);
                }
                iArr5[i19] = ((Integer) ((Method) method2).invoke(null, objArr3)).intValue();
                i19++;
                length3 = length3;
                iArr3 = iArr3;
                bArr2 = bArr2;
                i17 = 2;
            }
            bArr = bArr2;
            int i22 = f57559t + 79;
            f57560u = i22 % 128;
            int i23 = i22 % 2;
            iArr3 = iArr5;
        } else {
            bArr = bArr2;
        }
        char c10 = 0;
        System.arraycopy(iArr3, 0, iArr4, 0, length2);
        setonlongclicklistener.setDividerPadding = 0;
        while (true) {
            int i24 = setonlongclicklistener.setDividerPadding;
            if (i24 >= 10) {
                break;
            }
            int i25 = iArr2[i24];
            char c11 = (char) (i25 >> 16);
            cArr2[c10] = c11;
            char c12 = (char) i25;
            cArr2[1] = c12;
            int i26 = iArr2[i24 + 1];
            char c13 = (char) (i26 >> 16);
            cArr2[2] = c13;
            char c14 = (char) i26;
            cArr2[3] = c14;
            setonlongclicklistener.setY = (c11 << 16) + c12;
            setonlongclicklistener.setCompoundDrawableTintBlendMode = (c13 << 16) + c14;
            setOnLongClickListener.setX(iArr4);
            int i27 = 0;
            for (int i28 = 16; i27 < i28; i28 = 16) {
                int i29 = setonlongclicklistener.setY ^ iArr4[i27];
                setonlongclicklistener.setY = i29;
                Object[] objArr5 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i29)), setonlongclicklistener, setonlongclicklistener};
                Map map3 = setTextScaleX.setMaxEms;
                Object method3 = map3.get(-350984188);
                if (method3 == null) {
                    method3 = ((Class) setTextScaleX.setX((char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.getOffsetAfter("", 0) + 41, KeyEvent.normalizeMetaState(0) + 180)).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                    map3.put(-350984188, method3);
                }
                int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr5)).intValue();
                setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
                i27++;
                int i30 = f57560u + 61;
                f57559t = i30 % 128;
                int i31 = i30 % 2;
            }
            int i32 = setonlongclicklistener.setY;
            int i33 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
            int i34 = i32 ^ iArr4[16];
            setonlongclicklistener.setCompoundDrawableTintBlendMode = i34;
            int i35 = i33 ^ iArr4[17];
            setonlongclicklistener.setY = i35;
            cArr2[0] = (char) (i35 >>> 16);
            cArr2[1] = (char) i35;
            cArr2[2] = (char) (i34 >>> 16);
            cArr2[3] = (char) i34;
            setOnLongClickListener.setX(iArr4);
            int i36 = setonlongclicklistener.setDividerPadding * 2;
            cArr[i36] = cArr2[0];
            cArr[i36 + 1] = cArr2[1];
            cArr[i36 + 2] = cArr2[2];
            cArr[i36 + 3] = cArr2[3];
            Object[] objArr6 = {setonlongclicklistener, setonlongclicklistener};
            Map map4 = setTextScaleX.setMaxEms;
            Object method4 = map4.get(-147294223);
            if (method4 == null) {
                Class cls3 = (Class) setTextScaleX.setX((char) (AndroidCharacter.getMirror('0') - '0'), 41 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 483 - Color.argb(0, 0, 0, 0));
                byte b14 = (byte) (-bArr[2]);
                byte b15 = (byte) (b14 - 1);
                Object[] objArr7 = new Object[1];
                c(b15, b14, b15, objArr7);
                method4 = cls3.getMethod((String) objArr7[0], Object.class, Object.class);
                map4.put(-147294223, method4);
            }
            ((Method) method4).invoke(null, objArr6);
            c10 = 0;
        }
        String str = new String(cArr, 0, i11);
        int i37 = f57560u + 49;
        f57559t = i37 % 128;
        if (i37 % 2 != 0) {
            throw null;
        }
        super(null, str.intern(), null, 0L, 13, null);
        this.setCompoundDrawableTintBlendMode = uuid;
        this.setOnFocusChangeListener = num;
        this.setDividerPadding = i10;
        this.setY = getdynamicbuttonicontextspacingdp;
    }
}
