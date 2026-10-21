package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/mypinpad/tsdk/i/getGatewayId;", "", "", "setX", "()[B", "p0", "setCompoundDrawableTintBlendMode", "([B)[B", "", "setY", "()V", "Ljava/security/SecureRandom;", "Lcom/mypinpad/tsdk/i/setColorFilter;", "p1", "<init>", "(Ljava/security/SecureRandom;Lcom/mypinpad/tsdk/i/setColorFilter;)V"}, k = 1, mv = {1, 5, 1})
public final class getGatewayId {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f55844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f55845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f55846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f55847g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f55848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final byte[] f55849i = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SecureRandom f55850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final setColorFilter f55851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ans f55852c;

    static {
        c();
        f55847g = 0;
        f55848h = 1;
        f55845e = 0;
        f55846f = 1;
        d();
        INSTANCE = new Companion(null);
        int i10 = f55846f + 35;
        f55845e = i10 % 128;
        int i11 = i10 % 2;
    }

    public getGatewayId(@NotNull SecureRandom secureRandom, @NotNull setColorFilter setcolorfilter) {
        Intrinsics.checkNotNullParameter(secureRandom, "");
        Intrinsics.checkNotNullParameter(setcolorfilter, "");
        this.f55850a = secureRandom;
        this.f55851b = setcolorfilter;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:39:0x01bd  */
    public static void a(int i10, int i11, int i12, String str, boolean z10, Object[] objArr) throws Throwable {
        char[] cArr;
        Throwable cause;
        char[] charArray = str.toCharArray();
        getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
        char[] cArr2 = new char[i10];
        int i13 = 0;
        getnavbartitlestring.setY = 0;
        while (true) {
            int i14 = getnavbartitlestring.setY;
            if (i14 >= i10) {
                break;
            }
            int i15 = f55848h + 79;
            f55847g = i15 % 128;
            int i16 = i15 % 2;
            char c10 = charArray[i14];
            getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
            char c11 = (char) (i11 + c10);
            cArr2[i14] = c11;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(f55844d);
                objArr2[i13] = Integer.valueOf(c11);
                Map map = setTextScaleX.setMaxEms;
                Object method = map.get(133002375);
                if (method == null) {
                    Class cls = (Class) setTextScaleX.setX((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 41 - View.MeasureSpec.getSize(i13), 483 - View.resolveSize(i13, i13));
                    byte b10 = (byte) i13;
                    byte b11 = (byte) (b10 - 1);
                    Object[] objArr3 = new Object[1];
                    b(b10, b11, (byte) (b11 + 1), objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(133002375, method);
                }
                cArr2[i14] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                Object method2 = map.get(1860518195);
                if (method2 == null) {
                    Class cls3 = (Class) setTextScaleX.setX((char) (55965 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 43, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 2267);
                    byte b12 = (byte) 1;
                    byte b13 = (byte) (-b12);
                    Object[] objArr5 = new Object[1];
                    b(b12, b13, (byte) (b13 + 1), objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(1860518195, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i13 = 0;
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
            char[] cArr3 = new char[i10];
            System.arraycopy(cArr2, 0, cArr3, 0, i10);
            int i17 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr3, 0, cArr2, i10 - i17, i17);
            int i18 = getnavbartitlestring.setOnFocusChangeListener;
            System.arraycopy(cArr3, i18, cArr2, 0, i10 - i18);
        }
        if (z10) {
            int i19 = f55847g + 45;
            f55848h = i19 % 128;
            if (i19 % 2 == 0) {
                cArr = new char[i10];
                getnavbartitlestring.setY = 1;
            } else {
                cArr = new char[i10];
                getnavbartitlestring.setY = 0;
            }
            while (true) {
                int i20 = getnavbartitlestring.setY;
                if (i20 >= i10) {
                    break;
                }
                cArr[i20] = cArr2[(i10 - i20) - 1];
                Object[] objArr6 = {getnavbartitlestring, getnavbartitlestring};
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(1860518195);
                if (method3 == null) {
                    Class cls4 = (Class) setTextScaleX.setX((char) (55966 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), 42 - TextUtils.indexOf((CharSequence) "", '0', 0), 2267 - TextUtils.indexOf((CharSequence) "", '0'));
                    byte b14 = (byte) 1;
                    byte b15 = (byte) (-b14);
                    Object[] objArr7 = new Object[1];
                    b(b14, b15, (byte) (b15 + 1), objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(1860518195, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                int i21 = f55848h + 3;
                f55847g = i21 % 128;
                int i22 = i21 % 2;
            }
            cArr2 = cArr;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0026  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0026
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r0 = r8 + 1
            int r6 = 66 - r6
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.getGatewayId.f55849i
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L32
        L16:
            r3 = r2
        L17:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L32:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.getGatewayId.b(byte, byte, short, java.lang.Object[]):void");
    }

    public static void c() {
        f55849i = new byte[]{121, 93, 29, -92};
    }

    public static void d() {
        f55844d = -443079937;
    }

    @NotNull
    public final byte[] setCompoundDrawableTintBlendMode(@NotNull byte[] p4) {
        Intrinsics.checkNotNullParameter(p4, "");
        setColorFilter setcolorfilter = this.f55851b;
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 206, null, null, 6}, 1173867142, -1173867141, 206);
        aln alnVar = new aln();
        ans ansVar = this.f55852c;
        if (ansVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
            int i10 = f55845e + 47;
            f55846f = i10 % 128;
            int i11 = i10 % 2;
            ansVar = null;
        } else {
            int i12 = f55846f + 3;
            f55845e = i12 % 128;
            int i13 = i12 % 2;
        }
        aln.setOnFocusChangeListener(new Object[]{alnVar, ansVar}, 2132207906, -2132207906, System.identityHashCode(alnVar));
        setY();
        byte[] bArr = new byte[32];
        ajj ajjVar = (ajj) ajj.setCompoundDrawableTintBlendMode(new Object[]{(ady) ady.setNavigationOnClickListener(new Object[]{p4}, -1692126728, 1692126730, (int) System.currentTimeMillis())}, 909154525, -909154522, (int) System.currentTimeMillis());
        acz aczVar = (acz) ajj.setCompoundDrawableTintBlendMode(new Object[]{ajjVar}, -792808893, 792808894, System.identityHashCode(ajjVar));
        anx anxVar = new anx((byte[]) acz.setDividerPadding(new Object[]{aczVar}, -2004692391, 2004692392, System.identityHashCode(aczVar)));
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, Integer.valueOf(ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY), null, null, 6}, 1173867142, -1173867141, ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY);
        aln.setOnFocusChangeListener(new Object[]{alnVar, anxVar, bArr}, -1925988061, 1925988062, System.identityHashCode(alnVar));
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, Integer.valueOf(ErrorCodes.ERR_CRY_BAD_PROTO), null, null, 6}, 1173867142, -1173867141, ErrorCodes.ERR_CRY_BAD_PROTO);
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 207, null, null, 6}, 1173867142, -1173867141, 207);
        return bArr;
    }

    @NotNull
    public final byte[] setX() throws Throwable {
        setColorFilter setcolorfilter = this.f55851b;
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 204, null, null, 6}, 1173867142, -1173867141, 204);
        amh amhVar = new amh();
        amh.setDividerPadding(new Object[]{amhVar, new akw(this.f55850a)}, -1054919499, 1054919500, System.identityHashCode(amhVar));
        akj akjVar = (akj) amh.setDividerPadding(new Object[]{amhVar}, 1844319316, -1844319316, System.identityHashCode(amhVar));
        amw amwVar = (amw) akj.setDividerPadding(new Object[]{akjVar}, -1749934830, 1749934830, System.identityHashCode(akjVar));
        if (amwVar == null) {
            Object[] objArr = new Object[1];
            a(Color.alpha(0) + 94, 135 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 31, "\u0002\u000e\u0014ￏ\ufff9ￓￖￖￒￚ\ufff1\u0013\n\u0017\u0002\u0015\u0006￬\u0006\u001a\ufff1\u0002\u0013\u0002\u000e\u0006\u0015\u0006\u0013\u0014\u000f\u0016\r\r\uffc1\u0004\u0002\u000f\u000f\u0010\u0015\uffc1\u0003\u0006\uffc1\u0004\u0002\u0014\u0015\uffc1\u0015\u0010\uffc1\u000f\u0010\u000fￎ\u000f\u0016\r\r\uffc1\u0015\u001a\u0011\u0006\uffc1\u0010\u0013\bￏ\u0003\u0010\u0016\u000f\u0004\u001a\u0004\u0002\u0014\u0015\r\u0006ￏ\u0004\u0013\u001a\u0011\u0015\u0010ￏ\u0011\u0002\u0013", false, objArr);
            throw new NullPointerException(((String) objArr[0]).intern());
        }
        this.f55852c = (ans) amwVar;
        ady adyVarUiMessageCallbackKtWhenMappings = ((ajj) aoc.setY(new Object[]{(amw) akj.setDividerPadding(new Object[]{akjVar}, 1413033694, -1413033693, System.identityHashCode(akjVar))}, -1058795250, 1058795251, (int) System.currentTimeMillis())).UiMessageCallbackKtWhenMappings();
        Object[] objArr2 = new Object[1];
        a(TextUtils.getCapsMode("", 0, 0) + 3, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 111, TextUtils.getCapsMode("", 0, 0) + 1, "\ufffb\t￼", true, objArr2);
        byte[] bArr = (byte[]) adw.setOnLongClickListener(new Object[]{adyVarUiMessageCallbackKtWhenMappings, ((String) objArr2[0]).intern()}, -2049344731, 2049344731, System.identityHashCode(adyVarUiMessageCallbackKtWhenMappings));
        setColorFilter.setCompoundDrawableTintBlendMode(new Object[]{setcolorfilter, 205, null, null, 6}, 1173867142, -1173867141, 205);
        Intrinsics.checkNotNullExpressionValue(bArr, "");
        int i10 = f55845e + 59;
        f55846f = i10 % 128;
        if (i10 % 2 != 0) {
            return bArr;
        }
        throw null;
    }

    public final void setY() {
        this.f55852c = new ans(Random.INSTANCE.nextBytes(new byte[32]));
        int i10 = f55846f + 47;
        f55845e = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }
}
