package com.mypinpad.tsdk.isolation;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.nfc.NfcAdapter;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fasterxml.jackson.core.json.ByteSourceJsonBootstrapper;
import com.mypinpad.tsdk.api.errors.TerminalException;
import java.lang.reflect.Method;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@SourceDebugExtension({"SMAP\nAndroidHostNfcListener.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidHostNfcListener.kt\ncom/mypinpad/tsdk/internal/host/android/AndroidHostNfcListenerKt\n+ 2 ExceptionProcessing.kt\ncom/mypinpad/tsdk/internal/error/ExceptionProcessingKt\n*L\n1#1,157:1\n7#2,8:158\n7#2,8:166\n7#2,8:174\n7#2,8:182\n*S KotlinDebug\n*F\n+ 1 AndroidHostNfcListener.kt\ncom/mypinpad/tsdk/internal/host/android/AndroidHostNfcListenerKt\n*L\n128#1:158,8\n132#1:166,8\n136#1:174,8\n141#1:182,8\n*E\n"})
public final class ob {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f57433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f57434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f57435c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f57436d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f57437e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final byte[] f57438f = null;

    static {
        c();
        f57436d = 0;
        f57437e = 1;
        f57434b = 0;
        f57435c = 1;
        f57433a = new int[]{-689341647, 935418343, -1050669645, -191272504, -922657946, -903537926, -969122848, -685270565, -1397013743, 868304656, -1662350068, 2107729411, 1789640392, 2133425667, 1493075668, -1427973891, 1616408943, 724311941};
    }

    @NotNull
    public static final NfcAdapter P_(@NotNull Context context) throws Throwable {
        int i10 = f57435c + 47;
        f57434b = i10 % 128;
        int i11 = i10 % 2;
        Intrinsics.checkNotNullParameter(context, "");
        Object[] objArr = new Object[1];
        a(new int[]{596412193, 33158817, -915508412, -1677590031, 1117855848, -1410926025, 845276953, 833941788, 1907292576, -725445876, 1706658996, -39186819}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22, objArr);
        if (context.checkSelfPermission(((String) objArr[0]).intern()) != 0) {
            TerminalException terminalException = new TerminalException(7, null, null);
            mt.setX(new Object[]{terminalException}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException;
        }
        int i12 = f57434b;
        int i13 = i12 + 115;
        f57435c = i13 % 128;
        int i14 = i13 % 2;
        int i15 = i12 + 87;
        f57435c = i15 % 128;
        if (i15 % 2 == 0) {
            int i16 = 14 / 0;
        }
        PackageManager packageManager = context.getPackageManager();
        Object[] objArr2 = new Object[1];
        a(new int[]{596412193, 33158817, -915508412, -1677590031, -1788684085, -328631285, -1961813127, -743541968, 221673415, 1231048597}, 19 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr2);
        if (!packageManager.hasSystemFeature(((String) objArr2[0]).intern())) {
            TerminalException terminalException2 = new TerminalException(8, null, null);
            mt.setX(new Object[]{terminalException2}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException2;
        }
        NfcAdapter defaultAdapter = NfcAdapter.getDefaultAdapter(context);
        if (defaultAdapter == null) {
            TerminalException terminalException3 = new TerminalException(9, null, null);
            mt.setX(new Object[]{terminalException3}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException3;
        }
        if (!defaultAdapter.isEnabled()) {
            TerminalException terminalException4 = new TerminalException(10, null, null);
            mt.setX(new Object[]{terminalException4}, 1181816825, -1181816816, (int) System.currentTimeMillis());
            throw terminalException4;
        }
        int i17 = f57434b + 81;
        f57435c = i17 % 128;
        int i18 = i17 % 2;
        return defaultAdapter;
    }

    public static void a(int[] iArr, int i10, Object[] objArr) throws Throwable {
        int[] iArr2;
        Object method;
        setOnLongClickListener setonlongclicklistener = new setOnLongClickListener();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f57433a;
        int i11 = 1;
        int i12 = 1833429914;
        int i13 = 0;
        if (iArr3 != null) {
            int i14 = f57436d + 69;
            f57437e = i14 % 128;
            int i15 = i14 % 2;
            int length = iArr3.length;
            iArr2 = new int[length];
            int i16 = 0;
            while (i16 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[i13] = Integer.valueOf(iArr3[i16]);
                    Map map = setTextScaleX.setMaxEms;
                    Object method2 = map.get(Integer.valueOf(i12));
                    if (method2 == null) {
                        Class cls = (Class) setTextScaleX.setX((char) Color.green(i13), 44 - View.getDefaultSize(i13, i13), 728 - Color.argb(i13, i13, i13, i13));
                        byte b10 = (byte) i13;
                        byte b11 = (byte) (b10 + 1);
                        Object[] objArr3 = new Object[1];
                        b(b11, b10, (byte) (b11 - 1), objArr3);
                        method2 = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(1833429914, method2);
                    }
                    iArr2[i16] = ((Integer) ((Method) method2).invoke(null, objArr2)).intValue();
                    i16++;
                    int i17 = f57437e + 45;
                    f57436d = i17 % 128;
                    int i18 = i17 % 2;
                    i12 = 1833429914;
                    i13 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
        } else {
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int i19 = 16;
        long j10 = 0;
        if (iArr3 != null) {
            int length3 = iArr3.length;
            int[] iArr5 = new int[length3];
            int i20 = 0;
            while (i20 < length3) {
                Object[] objArr4 = new Object[i11];
                objArr4[0] = Integer.valueOf(iArr3[i20]);
                Map map2 = setTextScaleX.setMaxEms;
                Object method3 = map2.get(1833429914);
                if (method3 == null) {
                    Class cls2 = (Class) setTextScaleX.setX((char) (ViewConfiguration.getTapTimeout() >> i19), 45 - (ViewConfiguration.getGlobalActionKeyTimeout() > j10 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j10 ? 0 : -1)), 729 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 + 1);
                    Object[] objArr5 = new Object[1];
                    b(b13, b12, (byte) (b13 - 1), objArr5);
                    method3 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                    map2.put(1833429914, method3);
                }
                iArr5[i20] = ((Integer) ((Method) method3).invoke(null, objArr4)).intValue();
                i20++;
                iArr3 = iArr3;
                length3 = length3;
                i11 = 1;
                i19 = 16;
                j10 = 0;
            }
            iArr3 = iArr5;
        }
        char c10 = 0;
        System.arraycopy(iArr3, 0, iArr4, 0, length2);
        setonlongclicklistener.setDividerPadding = 0;
        while (true) {
            int i21 = setonlongclicklistener.setDividerPadding;
            if (i21 >= iArr.length) {
                break;
            }
            int i22 = iArr[i21];
            char c11 = (char) (i22 >> 16);
            cArr[c10] = c11;
            char c12 = (char) i22;
            cArr[1] = c12;
            int i23 = iArr[i21 + 1];
            char c13 = (char) (i23 >> 16);
            cArr[2] = c13;
            char c14 = (char) i23;
            cArr[3] = c14;
            setonlongclicklistener.setY = (c11 << 16) + c12;
            setonlongclicklistener.setCompoundDrawableTintBlendMode = (c13 << 16) + c14;
            setOnLongClickListener.setX(iArr4);
            int i24 = 0;
            for (int i25 = 16; i24 < i25; i25 = 16) {
                int i26 = setonlongclicklistener.setY ^ iArr4[i24];
                setonlongclicklistener.setY = i26;
                Object[] objArr6 = {setonlongclicklistener, Integer.valueOf(setOnLongClickListener.setCompoundDrawableTintBlendMode(i26)), setonlongclicklistener, setonlongclicklistener};
                Map map3 = setTextScaleX.setMaxEms;
                Object method4 = map3.get(-350984188);
                if (method4 == null) {
                    method4 = ((Class) setTextScaleX.setX((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 41 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), 228 - AndroidCharacter.getMirror('0'))).getMethod("o", Object.class, Integer.TYPE, Object.class, Object.class);
                    map3.put(-350984188, method4);
                }
                int iIntValue = ((Integer) ((Method) method4).invoke(null, objArr6)).intValue();
                setonlongclicklistener.setY = setonlongclicklistener.setCompoundDrawableTintBlendMode;
                setonlongclicklistener.setCompoundDrawableTintBlendMode = iIntValue;
                i24++;
            }
            int i27 = setonlongclicklistener.setY;
            int i28 = setonlongclicklistener.setCompoundDrawableTintBlendMode;
            int i29 = i27 ^ iArr4[16];
            setonlongclicklistener.setCompoundDrawableTintBlendMode = i29;
            int i30 = i28 ^ iArr4[17];
            setonlongclicklistener.setY = i30;
            cArr[0] = (char) (i30 >>> 16);
            cArr[1] = (char) i30;
            cArr[2] = (char) (i29 >>> 16);
            cArr[3] = (char) i29;
            setOnLongClickListener.setX(iArr4);
            int i31 = setonlongclicklistener.setDividerPadding * 2;
            cArr2[i31] = cArr[0];
            cArr2[i31 + 1] = cArr[1];
            cArr2[i31 + 2] = cArr[2];
            cArr2[i31 + 3] = cArr[3];
            Object[] objArr7 = {setonlongclicklistener, setonlongclicklistener};
            Map map4 = setTextScaleX.setMaxEms;
            Object obj = map4.get(-147294223);
            if (obj != null) {
                method = obj;
            } else {
                Class cls3 = (Class) setTextScaleX.setX((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 41 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 483 - TextUtils.getTrimmedLength(""));
                byte b14 = (byte) 0;
                byte b15 = b14;
                Object[] objArr8 = new Object[1];
                b(b15, b14, b15, objArr8);
                method = cls3.getMethod((String) objArr8[0], Object.class, Object.class);
                map4.put(-147294223, method);
            }
            ((Method) method).invoke(null, objArr7);
            c10 = 0;
        }
        String str = new String(cArr2, 0, i10);
        int i32 = f57436d + 29;
        f57437e = i32 % 128;
        if (i32 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void b(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r6 = r6 * 4
            int r6 = 108 - r6
            byte[] r0 = new byte[r0]
            byte[] r1 = com.mypinpad.tsdk.isolation.ob.f57438f
            r2 = 0
            if (r1 != 0) goto L1a
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            goto L36
        L1a:
            r3 = r2
        L1b:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r5
        L36:
            int r6 = r6 + r7
            r7 = r8
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.ob.b(byte, int, short, java.lang.Object[]):void");
    }

    public static void c() {
        f57438f = new byte[]{118, 91, ByteSourceJsonBootstrapper.UTF8_BOM_3, -74};
    }
}
