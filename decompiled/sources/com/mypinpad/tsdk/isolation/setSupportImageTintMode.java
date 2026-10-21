package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.activity.a;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import com.noknok.android.client.asm.authenticator.KSUtils;
import java.lang.reflect.Method;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setSupportImageTintMode {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final char[] f60615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final char f60616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static int f60618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static int f60619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static int f60620i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final byte[] f60621j = null;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final List<getAmountOther> f60622a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Duration f60623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final List<getTransactionPortrait> f60624c;

    static {
        c();
        f60619h = 0;
        f60620i = 1;
        f60617f = 0;
        f60618g = 1;
        f60616e = (char) 53956;
        f60615d = new char[]{59198, 59188, 59259, 59181, 59160, 59176, 59186, 59162, 59255, 58561, 59189, 59154, 59191, 59183, 59192, 59238, 58560, 59251, 59197, 59159, 58563, 59196, 59182, 59194, 59177};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public setSupportImageTintMode(@NotNull List<getAmountOther> list, @NotNull Duration duration, @NotNull List<? extends getTransactionPortrait> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(duration, "");
        Intrinsics.checkNotNullParameter(list2, "");
        this.f60622a = list;
        this.f60623b = duration;
        this.f60624c = list2;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 4
            int r8 = r8 + 99
            int r7 = r7 * 3
            int r0 = r7 + 1
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.setSupportImageTintMode.f60621j
            r2 = 0
            if (r1 != 0) goto L19
            r8 = r7
            r3 = r1
            r4 = r2
            r7 = r6
            r1 = r0
            r0 = r9
            r9 = r8
            goto L33
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L33:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r7 + 1
            r7 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setSupportImageTintMode.a(byte, byte, short, java.lang.Object[]):void");
    }

    public static void b(int i10, String str, byte b10, Object[] objArr) throws Throwable {
        int i11;
        int i12 = f60619h + 41;
        f60620i = i12 % 128;
        int i13 = i12 % 2;
        char[] charArray = str.toCharArray();
        setIncludeFontPadding setincludefontpadding = new setIncludeFontPadding();
        char[] cArr = f60615d;
        long j10 = 0;
        int i14 = 290255894;
        int i15 = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i16 = 0;
            while (i16 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i15] = Integer.valueOf(cArr[i16]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(Integer.valueOf(i14));
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) ((-1) - (ExpandableListView.getPackedPositionForChild(i15, i15) > j10 ? 1 : (ExpandableListView.getPackedPositionForChild(i15, i15) == j10 ? 0 : -1))), 44 - Process.getGidForName(""), 1115 - TextUtils.indexOf((CharSequence) "", '0'));
                        byte b11 = (byte) i15;
                        byte b12 = b11;
                        Object[] objArr3 = new Object[1];
                        a(b11, b12, b12, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(290255894, method);
                    }
                    cArr2[i16] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    i16++;
                    j10 = 0;
                    i14 = 290255894;
                    i15 = 0;
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
        Object[] objArr4 = {Integer.valueOf(f60616e)};
        Map map2 = setTextScaleX.setMaxEms;
        Object method2 = map2.get(290255894);
        if (method2 == null) {
            Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 45 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1116 - (ViewConfiguration.getJumpTapTimeout() >> 16));
            byte b13 = (byte) 0;
            byte b14 = b13;
            Object[] objArr5 = new Object[1];
            a(b13, b14, b14, objArr5);
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
        if (i11 > 1) {
            setincludefontpadding.setDividerPadding = 0;
            while (true) {
                int i17 = setincludefontpadding.setDividerPadding;
                if (i17 >= i11) {
                    break;
                }
                char c10 = charArray[i17];
                setincludefontpadding.setY = c10;
                int i18 = i17 + 1;
                char c11 = charArray[i18];
                setincludefontpadding.setCompoundDrawableTintBlendMode = c11;
                if (c10 == c11) {
                    cArr3[i17] = (char) (c10 - b10);
                    cArr3[i18] = (char) (c11 - b10);
                } else {
                    Object[] objArr6 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                    Map map3 = setTextScaleX.setMaxEms;
                    Object method3 = map3.get(180437302);
                    if (method3 == null) {
                        Class cls3 = (Class) setTextScaleX.setX((char) Color.argb(0, 0, 0, 0), 27 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2311 - Color.argb(0, 0, 0, 0));
                        byte b15 = (byte) 0;
                        byte b16 = (byte) (b15 + 3);
                        Object[] objArr7 = new Object[1];
                        a(b15, (byte) (b16 - 3), b16, objArr7);
                        String str2 = (String) objArr7[0];
                        Class<?> cls4 = Integer.TYPE;
                        method3 = cls3.getMethod(str2, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class, Object.class, cls4, Object.class);
                        map3.put(180437302, method3);
                    }
                    int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                    int i19 = setincludefontpadding.setNavigationOnClickListener;
                    if (iIntValue == i19) {
                        Object[] objArr8 = {setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, setincludefontpadding, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), setincludefontpadding, Integer.valueOf(cCharValue), setincludefontpadding};
                        Object method4 = map3.get(1989802713);
                        if (method4 == null) {
                            Class cls5 = (Class) setTextScaleX.setX((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 49102), TextUtils.indexOf("", "", 0) + 35, 2545 - ExpandableListView.getPackedPositionType(0L));
                            byte b17 = (byte) 0;
                            Object[] objArr9 = new Object[1];
                            a(b17, b17, (byte) (b17 | 7), objArr9);
                            String str3 = (String) objArr9[0];
                            Class<?> cls6 = Integer.TYPE;
                            method4 = cls5.getMethod(str3, Object.class, Object.class, cls6, cls6, Object.class, Object.class, cls6, cls6, Object.class, cls6, Object.class);
                            map3.put(1989802713, method4);
                        }
                        int iIntValue2 = ((Integer) ((Method) method4).invoke(null, objArr8)).intValue();
                        int i20 = (setincludefontpadding.setOnFocusChangeListener * cCharValue) + setincludefontpadding.setNavigationOnClickListener;
                        int i21 = setincludefontpadding.setDividerPadding;
                        cArr3[i21] = cArr[iIntValue2];
                        cArr3[i21 + 1] = cArr[i20];
                        int i22 = f60620i + 73;
                        f60619h = i22 % 128;
                        int i23 = i22 % 2;
                    } else {
                        int i24 = setincludefontpadding.setX;
                        int i25 = setincludefontpadding.setOnFocusChangeListener;
                        if (i24 == i25) {
                            int iA = a.a(setincludefontpadding.setOnLongClickListener, cCharValue, 1, cCharValue);
                            setincludefontpadding.setOnLongClickListener = iA;
                            int iA2 = a.a(i19, cCharValue, 1, cCharValue);
                            setincludefontpadding.setNavigationOnClickListener = iA2;
                            int i26 = (i25 * cCharValue) + iA2;
                            int i27 = setincludefontpadding.setDividerPadding;
                            cArr3[i27] = cArr[(i24 * cCharValue) + iA];
                            cArr3[i27 + 1] = cArr[i26];
                        } else {
                            int i28 = (i24 * cCharValue) + i19;
                            int i29 = (i25 * cCharValue) + setincludefontpadding.setOnLongClickListener;
                            int i30 = setincludefontpadding.setDividerPadding;
                            cArr3[i30] = cArr[i28];
                            cArr3[i30 + 1] = cArr[i29];
                        }
                    }
                }
                setincludefontpadding.setDividerPadding += 2;
            }
        }
        int i31 = 0;
        while (i31 < i10) {
            int i32 = f60620i + 97;
            f60619h = i32 % 128;
            if (i32 % 2 != 0) {
                cArr3[i31] = (char) (cArr3[i31] ^ 3107);
                i31 += 89;
            } else {
                cArr3[i31] = (char) (cArr3[i31] ^ 13722);
                i31++;
            }
        }
        String str4 = new String(cArr3);
        int i33 = f60620i + 95;
        f60619h = i33 % 128;
        int i34 = i33 % 2;
        objArr[0] = str4;
    }

    public static void c() {
        f60621j = new byte[]{Constants.RESP_MSG_TEMPLATE_FORMAT_2, 31, KSUtils.PLAIN_BUFFER, 108};
    }

    @NotNull
    public static setSupportImageTintMode d(@NotNull List<getAmountOther> list, @NotNull Duration duration, @NotNull List<? extends getTransactionPortrait> list2) {
        Intrinsics.checkNotNullParameter(list, "");
        Intrinsics.checkNotNullParameter(duration, "");
        Intrinsics.checkNotNullParameter(list2, "");
        setSupportImageTintMode setsupportimagetintmode = new setSupportImageTintMode(list, duration, list2);
        int i10 = f60618g + 9;
        f60617f = i10 % 128;
        int i11 = i10 % 2;
        return setsupportimagetintmode;
    }

    public final boolean equals(@Nullable Object obj) {
        int i10 = f60617f;
        int i11 = i10 + 9;
        f60618g = i11 % 128;
        int i12 = i11 % 2;
        if (this == obj) {
            int i13 = i10 + 29;
            f60618g = i13 % 128;
            int i14 = i13 % 2;
            return true;
        }
        if (!(obj instanceof setSupportImageTintMode)) {
            return false;
        }
        setSupportImageTintMode setsupportimagetintmode = (setSupportImageTintMode) obj;
        if (!Intrinsics.areEqual(this.f60622a, setsupportimagetintmode.f60622a)) {
            return false;
        }
        if (Intrinsics.areEqual(this.f60623b, setsupportimagetintmode.f60623b)) {
            return Intrinsics.areEqual(this.f60624c, setsupportimagetintmode.f60624c);
        }
        int i15 = f60617f + 75;
        f60618g = i15 % 128;
        return i15 % 2 == 0;
    }

    public final int hashCode() {
        int i10 = f60617f + 63;
        f60618g = i10 % 128;
        int i11 = i10 % 2;
        int iHashCode = this.f60624c.hashCode() + ((this.f60623b.hashCode() + (this.f60622a.hashCode() * 31)) * 31);
        int i12 = f60618g + 17;
        f60617f = i12 % 128;
        int i13 = i12 % 2;
        return iHashCode;
    }

    @NotNull
    public final Duration setOnFocusChangeListener() {
        int i10 = f60618g;
        int i11 = i10 + 33;
        f60617f = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 5 / 0;
        }
        int i13 = i10 + 87;
        f60617f = i13 % 128;
        int i14 = i13 % 2;
        return this.f60623b;
    }

    @NotNull
    public final List<getTransactionPortrait> setX() {
        int i10 = f60617f;
        int i11 = i10 + 89;
        f60618g = i11 % 128;
        int i12 = i11 % 2;
        int i13 = i10 + 121;
        f60618g = i13 % 128;
        int i14 = i13 % 2;
        return this.f60624c;
    }

    @NotNull
    public final List<getAmountOther> setY() {
        int i10 = f60617f + 123;
        int i11 = i10 % 128;
        f60618g = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 57;
        f60617f = i13 % 128;
        int i14 = i13 % 2;
        return this.f60622a;
    }

    @NotNull
    public final String toString() {
        return (String) setX(new Object[]{this}, 513096554, -513096554, System.identityHashCode(this));
    }

    public static /* synthetic */ setSupportImageTintMode setOnFocusChangeListener(setSupportImageTintMode setsupportimagetintmode, Duration duration, List list) {
        int i10 = f60617f + 41;
        f60618g = i10 % 128;
        int i11 = i10 % 2;
        setSupportImageTintMode setsupportimagetintmodeD = d(setsupportimagetintmode.f60622a, duration, list);
        if (i11 == 0) {
            int i12 = 6 / 0;
        }
        return setsupportimagetintmodeD;
    }

    public static /* synthetic */ Object setX(Object[] objArr, int i10, int i11, int i12) throws Throwable {
        setSupportImageTintMode setsupportimagetintmode = (setSupportImageTintMode) objArr[0];
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr2 = new Object[1];
        b((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 38, "\u0010\u0004\r\u0018\u0011\f㘞㘞\u0005\n\u0012\u0003\u000b\b\u0000\u000b\u0000\u0002\r\u000f\u000b\u0001\u0012\u0016㘞㘞\u0005\n\u000b\u0003\u0004\t\u0000\u000b\u0010\b\u0014\u0006㗗", (byte) (ExpandableListView.getPackedPositionChild(0L) + 49), objArr2);
        sb2.append(((String) objArr2[0]).intern());
        sb2.append(setsupportimagetintmode.f60622a);
        Object[] objArr3 = new Object[1];
        b(Color.red(0) + 21, "\u0007\u0003\u000b\u0004\u000b\u000e\u0005\u000b\u0015\u0002\u0014\u0007\f\u000b\n\u0003\u0017\u0004\u0016\r㘍", (byte) (102 - TextUtils.getOffsetAfter("", 0)), objArr3);
        sb2.append(((String) objArr3[0]).intern());
        sb2.append(setsupportimagetintmode.f60623b);
        Object[] objArr4 = new Object[1];
        b(22 - View.combineMeasuredStates(0, 0), "\u0007\u0003\u000b\u0004\u000b\u000e\u0005\u000b\u0015\u0002\u0014\u0007\b\f\n\u0003\b\n\u0004\u0015\n\u0014", (byte) (30 - TextUtils.getOffsetBefore("", 0)), objArr4);
        sb2.append(((String) objArr4[0]).intern());
        sb2.append(setsupportimagetintmode.f60624c);
        sb2.append(RootService.CLOSE_BRACKET);
        String string = sb2.toString();
        int i13 = f60617f + 61;
        f60618g = i13 % 128;
        int i14 = i13 % 2;
        return string;
    }
}
