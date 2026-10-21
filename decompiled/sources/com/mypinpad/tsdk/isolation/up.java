package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.os.strictmode.Violation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.preference.b;
import com.bbva.tohu.android.product.valkyria.sdk.export.constants.PaymentStatus;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.Constants;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\t\u001a\u00020\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006J\u001c\u0010\u000b\u001a\u00020\b2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/mypinpad/tsdk/internal/utils/StrictModeHelper;", "", "()V", PaymentStatus.ENABLED, "", "logcatViolationListener", "Lkotlin/Function1;", "Landroid/os/strictmode/Violation;", "", "initialiseForCurrentThread", "violationListener", "initialiseForVM", "sdk-android_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class up {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f61395b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f61396c = 1;

    @NotNull
    public static final up setX = new up();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final Function1<Violation, Unit> f61394a = a.f61397p0;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/os/strictmode/Violation;", "p0", "", "a", "(Landroid/os/strictmode/Violation;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends Lambda implements Function1<Violation, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f61397p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public static int f61398q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public static int f61399r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public static int f61400s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public static final int f61401t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public static final byte[] f61402u0 = null;

        static {
            d();
            f61401t0 = 1;
            f61399r0 = 0;
            f61400s0 = 1;
            e();
            f61397p0 = new a(1);
            int i10 = f61400s0 + 107;
            f61399r0 = i10 % 128;
            if (i10 % 2 != 0) {
                int i11 = 28 / 0;
            }
        }

        public a() {
            super(1);
        }

        public static void b(int i10, int i11, int i12, String str, Object[] objArr) throws Throwable {
            int i13;
            int i14 = f61401t0;
            int i15 = i14 + 95;
            int i16 = i15 % 128;
            int i17 = 2;
            int i18 = i15 % 2;
            int i19 = i14 + 3;
            int i20 = i19 % 128;
            int i21 = i19 % 2;
            char[] charArray = str.toCharArray();
            getNavBarTitleString getnavbartitlestring = new getNavBarTitleString();
            char[] cArr = new char[i10];
            getnavbartitlestring.setY = 0;
            int i22 = i14 + 39;
            int i23 = i22 % 128;
            int i24 = i22 % 2;
            while (true) {
                int i25 = getnavbartitlestring.setY;
                if (i25 >= i10) {
                    break;
                }
                char c10 = charArray[i25];
                getnavbartitlestring.setCompoundDrawableTintBlendMode = c10;
                char c11 = (char) (i11 + c10);
                cArr[i25] = c11;
                try {
                    Object[] objArr2 = new Object[i17];
                    objArr2[1] = Integer.valueOf(f61398q0);
                    objArr2[0] = Integer.valueOf(c11);
                    Map map = setTextScaleX.setMaxEms;
                    Object method = map.get(133002375);
                    if (method == null) {
                        Class cls = (Class) setTextScaleX.setX((char) (ViewConfiguration.getScrollBarSize() >> 8), 40 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 484 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        byte b10 = (byte) 0;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        c((byte) (b11 + 1), b10, b11, objArr3);
                        String str2 = (String) objArr3[0];
                        Class<?> cls2 = Integer.TYPE;
                        method = cls.getMethod(str2, cls2, cls2);
                        map.put(133002375, method);
                    }
                    cArr[i25] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                    Object[] objArr4 = {getnavbartitlestring, getnavbartitlestring};
                    Object method2 = map.get(1860518195);
                    if (method2 != null) {
                        i13 = 2;
                    } else {
                        Class cls3 = (Class) setTextScaleX.setX((char) (55966 - (ViewConfiguration.getEdgeSlop() >> 16)), 43 - View.combineMeasuredStates(0, 0), 2268 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        byte b12 = (byte) 0;
                        byte b13 = b12;
                        Object[] objArr5 = new Object[1];
                        c(b13, b12, b13, objArr5);
                        i13 = 2;
                        method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                        map.put(1860518195, method2);
                    }
                    ((Method) method2).invoke(null, objArr4);
                    i17 = i13;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            if (i12 > 0) {
                getnavbartitlestring.setOnFocusChangeListener = i12;
                char[] cArr2 = new char[i10];
                System.arraycopy(cArr, 0, cArr2, 0, i10);
                int i26 = getnavbartitlestring.setOnFocusChangeListener;
                System.arraycopy(cArr2, 0, cArr, i10 - i26, i26);
                int i27 = getnavbartitlestring.setOnFocusChangeListener;
                System.arraycopy(cArr2, i27, cArr, 0, i10 - i27);
            }
            objArr[0] = new String(cArr);
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0028  */
        /* JADX WARN: Code duplicated, block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0035). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        public static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r6 = r6 + 65
                int r8 = r8 * 4
                int r0 = 1 - r8
                int r7 = r7 * 3
                int r7 = r7 + 4
                byte[] r0 = new byte[r0]
                r1 = 0
                int r8 = 0 - r8
                byte[] r2 = com.mypinpad.tsdk.i.up.a.f61402u0
                if (r2 != 0) goto L1a
                r4 = r1
                r3 = r2
                r2 = r0
                r0 = r9
                r9 = r8
                r8 = r7
                goto L35
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
                int r3 = r3 + 1
                r4 = r2[r7]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r2
                r2 = r0
                r0 = r9
                r9 = r8
                r8 = r5
            L35:
                int r6 = r6 + r7
                int r7 = r8 + 1
                r8 = r9
                r9 = r0
                r0 = r2
                r2 = r3
                r3 = r4
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.i.up.a.c(byte, short, short, java.lang.Object[]):void");
        }

        public static void d() {
            f61402u0 = new byte[]{94, Constants.CVR_B2b8765_1111_APP_DISABLED, 73, 34};
        }

        public static void e() {
            f61398q0 = -443079944;
        }

        public final void a(@NotNull Violation violation) throws Throwable {
            Intrinsics.checkNotNullParameter(violation, "");
            Object[] objArr = new Object[1];
            b(10 - KeyEvent.normalizeMetaState(0), 134 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 9 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "\f\u0003�\u000e\uffe7\t\ufffe\uffff￭\u000e", objArr);
            ((String) objArr[0]).intern();
            Object[] objArr2 = new Object[1];
            b(10 - Process.getGidForName(""), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 129, 4 - Color.red(0), "\u000e\r\uffd9\uffbf\u0015\b\u000e\u000b\u0000\u0013\b", objArr2);
            ((String) objArr2[0]).intern();
            Objects.toString(violation);
            int i10 = f61400s0 + 69;
            f61399r0 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public final /* synthetic */ Unit invoke(Violation violation) throws Throwable {
            int i10 = f61399r0 + 67;
            f61400s0 = i10 % 128;
            int i11 = i10 % 2;
            a(b.b(violation));
            Unit unit = Unit.INSTANCE;
            int i12 = f61400s0 + 71;
            f61399r0 = i12 % 128;
            if (i12 % 2 == 0) {
                return unit;
            }
            throw null;
        }
    }

    static {
        int i10 = f61395b + 7;
        f61396c = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ Object setOnFocusChangeListener(Object[] objArr, int i10, int i11, int i12) {
        int i13 = (i11 * (-929)) + (i10 * (-464));
        int i14 = ~i10;
        int i15 = i11 | i12;
        int i16 = ((i14 | i15) * 465) + ((i11 | (~(i12 | i14))) * 930) + (((~i15) | i14) * (-465)) + i13;
        if (i16 != 1) {
            Function1<Violation, Unit> function1 = f61394a;
            if (i16 == 2) {
                int i17 = f61396c;
                int i18 = ((i17 & (-34)) | ((~i17) & 33)) + ((i17 & 33) << 1);
                f61395b = i18 % 128;
                if (i18 % 2 != 0) {
                    setOnFocusChangeListener(new Object[]{function1}, -1446947939, 1446947940, (int) System.currentTimeMillis());
                    int i19 = 14 / 0;
                } else {
                    setOnFocusChangeListener(new Object[]{function1}, -1446947939, 1446947940, (int) System.currentTimeMillis());
                }
                int i20 = f61395b;
                int i21 = i20 & 119;
                int i22 = i20 | 119;
                int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
                f61396c = i23 % 128;
                if (i23 % 2 == 0) {
                    int i24 = 14 / 0;
                }
            } else if (i16 != 3) {
                Function1 function2 = (Function1) objArr[0];
                int i25 = f61395b;
                int i26 = ((i25 ^ 87) | (i25 & 87)) << 1;
                int i27 = -(((~i25) & 87) | (i25 & (-88)));
                int i28 = (i26 & i27) + (i27 | i26);
                f61396c = i28 % 128;
                if (i28 % 2 == 0) {
                    Intrinsics.checkNotNullParameter(function2, "");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(function2, "");
                int i29 = f61395b;
                int i30 = (i29 ^ 119) + ((i29 & 119) << 1);
                f61396c = i30 % 128;
                int i31 = i30 % 2;
            } else {
                int i32 = f61395b;
                int i33 = ((i32 ^ 64) + ((i32 & 64) << 1)) - 1;
                f61396c = i33 % 128;
                if (i33 % 2 == 0) {
                    setOnFocusChangeListener(new Object[]{function1}, -1760374547, 1760374547, (int) System.currentTimeMillis());
                    int i34 = 95 / 0;
                } else {
                    setOnFocusChangeListener(new Object[]{function1}, -1760374547, 1760374547, (int) System.currentTimeMillis());
                }
                int i35 = f61395b;
                int i36 = ((i35 | 40) << 1) - (i35 ^ 40);
                int i37 = (i36 ^ (-1)) + (i36 << 1);
                f61396c = i37 % 128;
                int i38 = i37 % 2;
            }
        } else {
            Function1 function3 = (Function1) objArr[0];
            int i39 = f61396c;
            int i40 = ((i39 ^ 41) | (i39 & 41)) << 1;
            int i41 = -(((~i39) & 41) | (i39 & (-42)));
            int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
            f61395b = i42 % 128;
            if (i42 % 2 != 0) {
                Intrinsics.checkNotNullParameter(function3, "");
                int i43 = 35 / 0;
            } else {
                Intrinsics.checkNotNullParameter(function3, "");
            }
            int i44 = f61395b;
            int i45 = ((i44 & 36) + (i44 | 36)) - 1;
            f61396c = i45 % 128;
            if (i45 % 2 == 0) {
                throw null;
            }
        }
        return null;
    }
}
