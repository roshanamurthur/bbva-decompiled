package com.facetec.sdk;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.esotericsoftware.asm.Opcodes;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes9.dex */
class ap {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10;
    private static int $11;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f40352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    private static final Semaphore f40353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static volatile boolean f40354c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static /* synthetic */ boolean f40355d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f40356e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static int f40357f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int f40358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static int f40359h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static char f40360i;

    /* JADX INFO: renamed from: com.facetec.sdk.ap$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final /* synthetic */ int[] f40361e;

        static {
            int[] iArr = new int[ao.values().length];
            f40361e = iArr;
            try {
                iArr[ao.FT_EVENT_ENROLL_SESSION_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40361e[ao.FT_EVENT_MID_ENROLL_SESSION_GLASSES_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40361e[ao.FT_EVENT_ENROLL_SESSION_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40361e[ao.FT_EVENT_ENROLL_SESSION_FAIL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40361e[ao.FT_EVENT_ENROLL_SESSION_CANCEL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f40361e[ao.FT_EVENT_VERIFY_SESSION_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f40361e[ao.FT_EVENT_VERIFY_SESSION_SUCCESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f40361e[ao.FT_EVENT_VERIFY_SESSION_FAIL.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f40361e[ao.FT_EVENT_VERIFY_SESSION_CANCEL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f40361e[ao.FT_EVENT_AUTH_SESSION_START.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f40361e[ao.FT_EVENT_AUTH_SESSION_SUCCESS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f40361e[ao.FT_EVENT_AUTH_SESSION_FAIL.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f40361e[ao.FT_EVENT_AUTH_SESSION_CANCEL.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f40361e[ao.FT_EVENT_DIAGNOSTIC_UPLOAD_FAIL.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f40361e[ao.FT_EVENT_FACESCAN_SESSION_SUCCESS.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f40361e[ao.FT_EVENT_PHOENIX_SESSION_FAIL.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f40361e[ao.FT_EVENT_FACESCAN_SESSION_FAIL.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @ep(c = "event")
        private String f40369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        @ep(c = "diagnosticId")
        private String f40370b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        @ep(c = "diagnosticSessionId")
        private String f40371d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @ep(c = "time")
        private long f40372e;

        public e(String str, long j10, String str2, String str3) {
            this.f40369a = str;
            this.f40372e = j10;
            this.f40371d = str2;
            this.f40370b = str3;
        }
    }

    static {
        init$0();
        $10 = 0;
        $11 = 1;
        f40358g = 0;
        f40357f = 1;
        d();
        int i10 = f40357f + 41;
        f40358g = i10 % 128;
        int i11 = i10 % 2;
        f40355d = true;
        f40353b = new Semaphore(1);
        f40354c = false;
        int i12 = f40358g + 67;
        f40357f = i12 % 128;
        if (i12 % 2 == 0) {
            int i13 = 83 / 0;
        }
    }

    public static /* synthetic */ void b(Context context, String str, long j10, String str2, String str3) {
        int i10 = f40357f + 5;
        f40358g = i10 % 128;
        int i11 = i10 % 2;
        e(context, str, j10, str2, str3);
        int i12 = f40358g + 65;
        f40357f = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    public static void d(@NonNull Context context, @NonNull ao aoVar) {
        int i10 = f40358g + 13;
        f40357f = i10 % 128;
        int i11 = i10 % 2;
        c(new Object[]{context, aoVar, null}, 265414186, -265414186, (int) System.currentTimeMillis());
        int i12 = f40358g + 103;
        f40357f = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void e(final Context context, final String str, final String str2, final String str3, final boolean z10, final long j10, final Runnable runnable) throws Throwable {
        Object obj;
        kl klVarE = at.e(context);
        StringBuilder sb2 = new StringBuilder();
        Object[] objArr = new Object[1];
        j("ᭃ춲뚅龜䃬⦰ኊﭿ갢锎縀✪ࡍ\uf14d\udbb2貥疚廣ߵ\ue8d4톁먹挚名㴼\ue66f콉놽髨䎄㓜ᶷ웱꿉逾礡≐ଙﱠꕃ蹐炷妦ʊ\uebb8", (ViewConfiguration.getTouchSlop() >> 8) + 55021, objArr);
        sb2.append(((String) objArr[0]).intern());
        sb2.append(bg.f40538b);
        String string = sb2.toString();
        ki.c cVar = new ki.c();
        Object[] objArr2 = new Object[1];
        k((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 53243), "쾝", TextUtils.indexOf("", "", 0) + 146801193, "⤓쀂行鏏", "\u0000\u0000\u0000\u0000", objArr2);
        ki.c cVarB = cVar.b(((String) objArr2[0]).intern(), str);
        Object[] objArr3 = new Object[1];
        k((char) (31406 - (Process.myPid() >> 22)), "\udbc1\udbb0⼂䧦뱊糿\uda9f莁\uecc4娌䇨\uda8f謺罌㔴춱㪬䯕൘", View.combineMeasuredStates(0, 0) + 118341310, "뺀\u0dbe긇\uf07a", "\u0000\u0000\u0000\u0000", objArr3);
        cVarB.b(((String) objArr3[0]).intern(), str2);
        if (str3 != null) {
            int i10 = f40357f + 51;
            f40358g = i10 % 128;
            if (i10 % 2 != 0) {
                Object[] objArr4 = new Object[1];
                j("\u1b4f뎃䫈\ue10f롁傁\uefde蘘嵊\uf581賨嬄", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 1.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 1.0d ? 0 : -1)) + 43201, objArr4);
                obj = objArr4[0];
            } else {
                Object[] objArr5 = new Object[1];
                j("\u1b4f뎃䫈\ue10f롁傁\uefde蘘嵊\uf581賨嬄", (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 43201, objArr5);
                obj = objArr5[0];
            }
            cVarB.b(((String) obj).intern(), str3);
            int i11 = f40358g + 9;
            f40357f = i11 % 128;
            int i12 = i11 % 2;
        }
        try {
            klVarE.c(f.b(context, string).c(cVarB.d()).e()).e(new jy() { // from class: com.facetec.sdk.ap.2
                @Override // com.facetec.sdk.jy
                public final void a() {
                    if (z10) {
                        ap.b(context, str, j10, str2, str3);
                    }
                    Runnable runnable2 = runnable;
                    if (runnable2 != null) {
                        runnable2.run();
                    }
                }

                @Override // com.facetec.sdk.jy
                public final void e(kq kqVar) throws IOException {
                    if (ap.c()) {
                        ap.e(context);
                    }
                }
            });
        } catch (f.a unused) {
            e(context, str, j10, str2, str3);
        }
    }

    public static void init$0() {
        $$a = new byte[]{71, 15, -105, -126};
        $$b = ErrorCodes.ERR_CRY_BAD_PROTO;
    }

    /* JADX WARN: Code duplicated, block: B:61:0x028a  */
    /* JADX WARN: Code duplicated, block: B:62:0x028b  */
    private static void j(String str, int i10, Object[] objArr) throws Throwable {
        Throwable cause;
        int i11 = $11 + 11;
        $10 = i11 % 128;
        int i12 = 2;
        if (i11 % 2 != 0) {
            throw null;
        }
        char[] charArray = str != null ? str.toCharArray() : str;
        gw gwVar = new gw();
        gwVar.f41836e = i10;
        int length = charArray.length;
        long[] jArr = new long[length];
        gwVar.f41835a = 0;
        while (true) {
            int i13 = gwVar.f41835a;
            if (i13 >= charArray.length) {
                break;
            }
            int i14 = $11 + 9;
            $10 = i14 % 128;
            if (i14 % i12 != 0) {
                char c10 = charArray[i13];
                try {
                    Object[] objArr2 = new Object[3];
                    objArr2[i12] = gwVar;
                    objArr2[1] = gwVar;
                    objArr2[0] = Integer.valueOf(c10);
                    Map map = bp.f40694x;
                    Object method = map.get(346539884);
                    if (method == null) {
                        method = ((Class) bp.a(Drawable.resolveOpacity(0, 0) + 24, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 244, (char) ((Process.getThreadPriority(0) + 20) >> 6))).getMethod("r", Integer.TYPE, Object.class, Object.class);
                        map.put(346539884, method);
                    }
                    jArr[i13] = ((Long) ((Method) method).invoke(null, objArr2)).longValue() - (f40352a % (-4932774504156859221L));
                    Object[] objArr3 = {gwVar, gwVar};
                    Object method2 = map.get(593077425);
                    if (method2 == null) {
                        method2 = ((Class) bp.a(23 - ExpandableListView.getPackedPositionType(0L), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 149, (char) Drawable.resolveOpacity(0, 0))).getMethod("q", Object.class, Object.class);
                        map.put(593077425, method2);
                    }
                    ((Method) method2).invoke(null, objArr3);
                } catch (Throwable th2) {
                    cause = th2.getCause();
                    if (cause != null) {
                        throw th2;
                    }
                    throw cause;
                }
            } else {
                Object[] objArr4 = {Integer.valueOf(charArray[i13]), gwVar, gwVar};
                Map map2 = bp.f40694x;
                Object method3 = map2.get(346539884);
                if (method3 == null) {
                    method3 = ((Class) bp.a((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23, (ViewConfiguration.getLongPressTimeout() >> 16) + 245, (char) (ViewConfiguration.getLongPressTimeout() >> 16))).getMethod("r", Integer.TYPE, Object.class, Object.class);
                    map2.put(346539884, method3);
                }
                jArr[i13] = ((Long) ((Method) method3).invoke(null, objArr4)).longValue() ^ (f40352a ^ (-4932774504156859221L));
                Object[] objArr5 = {gwVar, gwVar};
                Object method4 = map2.get(593077425);
                if (method4 == null) {
                    method4 = ((Class) bp.a(23 - TextUtils.indexOf("", "", 0, 0), 198 - AndroidCharacter.getMirror('0'), (char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)))).getMethod("q", Object.class, Object.class);
                    map2.put(593077425, method4);
                }
                ((Method) method4).invoke(null, objArr5);
            }
            i12 = 2;
            cause = th2.getCause();
            if (cause != null) {
                throw th2;
            }
            throw cause;
        }
        char[] cArr = new char[length];
        gwVar.f41835a = 0;
        while (true) {
            int i15 = gwVar.f41835a;
            if (i15 >= charArray.length) {
                String str2 = new String(cArr);
                int i16 = $10 + 115;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                objArr[0] = str2;
                return;
            }
            int i18 = $10 + 87;
            $11 = i18 % 128;
            if (i18 % 2 == 0) {
                cArr[i15] = (char) jArr[i15];
                Object[] objArr6 = {gwVar, gwVar};
                Map map3 = bp.f40694x;
                Object method5 = map3.get(593077425);
                if (method5 == null) {
                    method5 = ((Class) bp.a(23 - (ViewConfiguration.getLongPressTimeout() >> 16), 150 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)))).getMethod("q", Object.class, Object.class);
                    map3.put(593077425, method5);
                }
                ((Method) method5).invoke(null, objArr6);
                int i19 = 47 / 0;
            } else {
                cArr[i15] = (char) jArr[i15];
                Object[] objArr7 = {gwVar, gwVar};
                Map map4 = bp.f40694x;
                Object method6 = map4.get(593077425);
                if (method6 == null) {
                    method6 = ((Class) bp.a(22 - Process.getGidForName(""), TextUtils.indexOf("", "", 0, 0) + 150, (char) KeyEvent.getDeadChar(0, 0))).getMethod("q", Object.class, Object.class);
                    map4.put(593077425, method6);
                }
                ((Method) method6).invoke(null, objArr7);
            }
        }
    }

    private static void k(char c10, String str, int i10, String str2, String str3, Object[] objArr) throws Throwable {
        char[] charArray;
        char c11;
        int i11 = $11;
        int i12 = i11 + 49;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        if (str3 != null) {
            int i14 = i11 + 79;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            charArray = str3.toCharArray();
        } else {
            charArray = str3;
        }
        char[] cArr = charArray;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        go goVar = new go();
        int length = charArray2.length;
        char[] cArr2 = new char[length];
        int length2 = cArr.length;
        char[] cArr3 = new char[length2];
        int i16 = 0;
        System.arraycopy(charArray2, 0, cArr2, 0, length);
        System.arraycopy(cArr, 0, cArr3, 0, length2);
        cArr2[0] = (char) (cArr2[0] ^ c10);
        cArr3[2] = (char) (cArr3[2] + ((char) i10));
        int length3 = charArray3.length;
        char[] cArr4 = new char[length3];
        goVar.f41794c = 0;
        while (goVar.f41794c < length3) {
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i16] = goVar;
                Map map = bp.f40694x;
                Object method = map.get(26369957);
                if (method == null) {
                    Class cls = (Class) bp.a(23 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 719 - (ViewConfiguration.getEdgeSlop() >> 16), (char) ((Process.getThreadPriority(i16) + 20) >> 6));
                    byte b10 = (byte) i16;
                    Object[] objArr3 = new Object[1];
                    l(b10, (byte) (b10 | 52), (byte) (-1), objArr3);
                    String str4 = (String) objArr3[i16];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i16] = Object.class;
                    method = cls.getMethod(str4, clsArr);
                    map.put(26369957, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = new Object[1];
                objArr4[i16] = goVar;
                Object method2 = map.get(-1014658957);
                if (method2 == null) {
                    Class cls2 = (Class) bp.a(ExpandableListView.getPackedPositionChild(0L) + 25, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + Opcodes.MULTIANEWARRAY, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                    Class<?>[] clsArr2 = new Class[1];
                    clsArr2[i16] = Object.class;
                    method2 = cls2.getMethod(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, clsArr2);
                    map.put(-1014658957, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                int i17 = cArr2[goVar.f41794c % 4] * 32718;
                Object[] objArr5 = new Object[3];
                objArr5[2] = Integer.valueOf(cArr3[iIntValue]);
                objArr5[1] = Integer.valueOf(i17);
                objArr5[i16] = goVar;
                Object method3 = map.get(918635547);
                if (method3 == null) {
                    Class cls3 = (Class) bp.a(23 - TextUtils.lastIndexOf("", '0', i16, i16), Color.blue(i16) + 1316, (char) (41875 - ExpandableListView.getPackedPositionChild(0L)));
                    byte b11 = (byte) i16;
                    Object[] objArr6 = new Object[1];
                    l(b11, (byte) (b11 | 55), (byte) (-1), objArr6);
                    String str5 = (String) objArr6[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str5, Object.class, cls4, cls4);
                    map.put(918635547, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                Object[] objArr7 = {Integer.valueOf(cArr2[iIntValue2] * 32718), Integer.valueOf(cArr3[iIntValue])};
                Object method4 = map.get(-1899743495);
                if (method4 != null) {
                    c11 = 2;
                } else {
                    Class cls5 = (Class) bp.a(25 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 837, (char) (Process.myTid() >> 22));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr8 = new Object[1];
                    l(b12, b13, (byte) (b13 - 1), objArr8);
                    String str6 = (String) objArr8[0];
                    c11 = 2;
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str6, cls6, cls6);
                    map.put(-1899743495, method4);
                }
                cArr3[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c12 = goVar.f41793b;
                cArr2[iIntValue2] = c12;
                int i18 = goVar.f41794c;
                cArr4[i18] = (char) (((((long) (c12 ^ charArray3[i18])) ^ (f40356e ^ 5402764725387775499L)) ^ ((long) ((int) (((long) f40359h) ^ 5402764725387775499L)))) ^ ((long) ((char) (((long) f40360i) ^ 5402764725387775499L))));
                goVar.f41794c = i18 + 1;
                length3 = length3;
                i16 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void l(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.facetec.sdk.ap.$$a
            int r6 = r6 * 3
            int r1 = 1 - r6
            int r7 = r7 + 67
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            int r8 = r8 + 1
            r4 = r0[r8]
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r6 = r6 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.ap.l(short, byte, int, java.lang.Object[]):void");
    }

    private static void a(Context context, List<e> list) throws Throwable {
        Object[] objArr = new Object[1];
        j("ᭃ铲Ѕ둜◬핰䔊\uf6bf昢ᙎ螀㝪ꝍ傍쀲灥\ue19a鄣ŵ는⊁퉹䎚\uf3cd挼Ჯ賉㱽귨巄최绷\ueef1鸉྾뿡⽐\udf59䣠\uf803桐᧷褦㥊ꪸ娭쩛箎\ueb37魟ᒏ萹", 36781 - TextUtils.indexOf("", "", 0), objArr);
        try {
            at.e(context).c(f.e(context, ((String) objArr[0]).intern(), list)).e(new jy() { // from class: com.facetec.sdk.ap.5
                @Override // com.facetec.sdk.jy
                public final void a() {
                }

                @Override // com.facetec.sdk.jy
                public final void e(kq kqVar) throws IOException {
                }
            });
            int i10 = f40357f + 89;
            f40358g = i10 % 128;
            int i11 = i10 % 2;
        } catch (f.a e5) {
            TextUtils.indexOf((CharSequence) "", '0', 0);
            View.MeasureSpec.getSize(0);
            e5.getMessage();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b(Context context) throws Throwable {
        List<e> listD;
        int i10 = f40358g + 37;
        f40357f = i10 % 128;
        try {
            try {
                if (i10 % 2 == 0) {
                    Semaphore semaphore = f40353b;
                    semaphore.acquire();
                    d(context, Boolean.TRUE);
                    semaphore.release();
                    throw null;
                }
                Semaphore semaphore2 = f40353b;
                semaphore2.acquire();
                listD = d(context, Boolean.TRUE);
                semaphore2.release();
                if (listD != null) {
                    int i11 = f40358g + 123;
                    f40357f = i11 % 128;
                    if (i11 % 2 == 0) {
                        listD.isEmpty();
                        throw null;
                    }
                    if (listD.isEmpty()) {
                        return;
                    }
                    a(context, listD);
                }
            } catch (Exception e5) {
                e5.printStackTrace();
                f40353b.release();
                listD = null;
            }
        } catch (Throwable th2) {
            f40353b.release();
            throw th2;
        }
    }

    public static /* synthetic */ Object c(Object[] objArr, int i10, int i11, int i12) {
        String str;
        int i13 = ~i10;
        int i14 = ~i11;
        int i15 = i13 | i14;
        int i16 = ~i15;
        int i17 = ~i12;
        int i18 = (((~(i10 | i14 | i12)) | (~(i11 | i13)) | (~(i13 | i17))) * 168) + ((~(i15 | i12)) * 168) + ((i16 | (~(i14 | i17))) * 168) + (i11 * (-167)) + (i10 * (-167));
        if (i18 == 1) {
            int i19 = f40357f + 97;
            f40358g = i19 % 128;
            int i20 = i19 % 2;
            boolean z10 = f40354c;
            int i21 = f40358g + 25;
            f40357f = i21 % 128;
            int i22 = i21 % 2;
            return Boolean.valueOf(z10);
        }
        if (i18 == 2) {
            return c(objArr);
        }
        final Context context = (Context) objArr[0];
        ao aoVar = (ao) objArr[1];
        final Runnable runnable = (Runnable) objArr[2];
        if (!bg.a()) {
            return null;
        }
        final String strB = bx.b(a(aoVar));
        final long time = new Date().getTime();
        if (aoVar.a()) {
            str = cc.f40802c;
        } else {
            int i23 = f40358g + 27;
            f40357f = i23 % 128;
            int i24 = i23 % 2;
            str = null;
        }
        final String str2 = cc.f40801a;
        if (bg.f40538b == null) {
            int i25 = f40357f + 65;
            f40358g = i25 % 128;
            int i26 = i25 % 2;
            e(context, strB, time, str2, str);
        }
        final String str3 = str;
        cx.b(new Runnable() { // from class: com.facetec.sdk.e1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                ap.e(context, strB, str2, str3, true, time, runnable);
            }
        });
        return null;
    }

    @NonNull
    private static List<e> d(@NonNull Context context, Boolean bool) throws Exception {
        File file = new File(context.getCacheDir(), e());
        if (file.exists()) {
            e[] eVarArr = (e[]) new dv().e(new String(bf.d(file, d(context)), StandardCharsets.UTF_8), e[].class);
            if (bool.booleanValue()) {
                int i10 = f40357f + 15;
                f40358g = i10 % 128;
                int i11 = i10 % 2;
                file.delete();
                f40354c = false;
                int i12 = f40358g + 45;
                f40357f = i12 % 128;
                int i13 = i12 % 2;
            }
            return new ArrayList(Arrays.asList(eVarArr));
        }
        return new ArrayList();
    }

    private static String a(ao aoVar) throws Throwable {
        switch (AnonymousClass1.f40361e[aoVar.ordinal()]) {
            case 1:
                Object[] objArr = new Object[1];
                j("ᭁ", (ViewConfiguration.getWindowTouchSlop() >> 8) + 52069, objArr);
                return ((String) objArr[0]).intern();
            case 2:
                Object[] objArr2 = new Object[1];
                k((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 26486), "\uda0c", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) - 1251414732, "㐩棭瞵婧", "\u0000\u0000\u0000\u0000", objArr2);
                String strIntern = ((String) objArr2[0]).intern();
                int i10 = f40358g + 81;
                f40357f = i10 % 128;
                int i11 = i10 % 2;
                return strIntern;
            case 3:
                Object[] objArr3 = new Object[1];
                k((char) ((KeyEvent.getMaxKeyCode() >> 16) + 42328), "㐊", ExpandableListView.getPackedPositionGroup(0L) - 391754790, "\udacdꙋ壨熥", "\u0000\u0000\u0000\u0000", objArr3);
                return ((String) objArr3[0]).intern();
            case 4:
                Object[] objArr4 = new Object[1];
                k((char) (16609 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), "柮", 1091478928 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), "輁ລ\ue141䁀", "\u0000\u0000\u0000\u0000", objArr4);
                String strIntern2 = ((String) objArr4[0]).intern();
                int i12 = f40358g + 67;
                f40357f = i12 % 128;
                if (i12 % 2 != 0) {
                    return strIntern2;
                }
                throw null;
            case 5:
                Object[] objArr5 = new Object[1];
                j("᭛", 10434 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr5);
                return ((String) objArr5[0]).intern();
            case 6:
                Object[] objArr6 = new Object[1];
                k((char) (64063 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), "뚬", 355830464 - (ViewConfiguration.getKeyRepeatDelay() >> 16), "샂㖊㼕죺", "\u0000\u0000\u0000\u0000", objArr6);
                return ((String) objArr6[0]).intern();
            case 7:
                Object[] objArr7 = new Object[1];
                j("᭟", 31147 - Color.blue(0), objArr7);
                return ((String) objArr7[0]).intern();
            case 8:
                Object[] objArr8 = new Object[1];
                k((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 517), "ᴢ", 1650661348 - View.resolveSizeAndState(0, 0, 0), "\ue46a挗բ뤂", "\u0000\u0000\u0000\u0000", objArr8);
                return ((String) objArr8[0]).intern();
            case 9:
                Object[] objArr9 = new Object[1];
                j("᭝", 11131 - TextUtils.getTrimmedLength(""), objArr9);
                return ((String) objArr9[0]).intern();
            case 10:
                Object[] objArr10 = new Object[1];
                j("ᭊ", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 57943, objArr10);
                return ((String) objArr10[0]).intern();
            case 11:
                Object[] objArr11 = new Object[1];
                k((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 3402), "ᖿ", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1100434205, "Ở靋䭁匍", "\u0000\u0000\u0000\u0000", objArr11);
                return ((String) objArr11[0]).intern();
            case 12:
                Object[] objArr12 = new Object[1];
                k((char) (61841 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "婍", (ViewConfiguration.getTouchSlop() >> 8) - 762522810, "䘠賓鋒胱", "\u0000\u0000\u0000\u0000", objArr12);
                return ((String) objArr12[0]).intern();
            case 13:
                Object[] objArr13 = new Object[1];
                j("\u1b4f", 18583 - (ViewConfiguration.getEdgeSlop() >> 16), objArr13);
                return ((String) objArr13[0]).intern();
            case 14:
                Object[] objArr14 = new Object[1];
                j("᭒", 20249 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), objArr14);
                return ((String) objArr14[0]).intern();
            case 15:
                Object[] objArr15 = new Object[1];
                j("᭓", 32633 - (ViewConfiguration.getScrollDefaultDelay() >> 16), objArr15);
                String strIntern3 = ((String) objArr15[0]).intern();
                int i13 = f40357f + 73;
                f40358g = i13 % 128;
                int i14 = i13 % 2;
                return strIntern3;
            case 16:
                Object[] objArr16 = new Object[1];
                k((char) ((-16772769) - Color.rgb(0, 0, 0)), "蕞", 1507444844 - Color.blue(0), "汣\ud9c8彙䈑", "\u0000\u0000\u0000\u0000", objArr16);
                return ((String) objArr16[0]).intern();
            case 17:
                Object[] objArr17 = new Object[1];
                j("᭑", 37591 - Color.blue(0), objArr17);
                return ((String) objArr17[0]).intern();
            default:
                if (f40355d) {
                    Object[] objArr18 = new Object[1];
                    k((char) (64504 - (ViewConfiguration.getPressedStateDuration() >> 16)), "닒%", TextUtils.indexOf("", "", 0, 0), "곛ꁘ\uf80f⫻", "\u0000\u0000\u0000\u0000", objArr18);
                    return ((String) objArr18[0]).intern();
                }
                throw new AssertionError();
        }
    }

    public static void e(@NonNull Context context) {
        int i10 = f40358g + 95;
        f40357f = i10 % 128;
        int i11 = i10 % 2;
        cx.b(new f1(context.getApplicationContext(), 0));
        int i12 = f40358g + 81;
        f40357f = i12 % 128;
        int i13 = i12 % 2;
    }

    private static /* synthetic */ Object c(Object[] objArr) {
        Semaphore semaphore;
        Context context = (Context) objArr[0];
        List list = (List) objArr[1];
        int i10 = f40357f + 125;
        f40358g = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                semaphore = f40353b;
                semaphore.acquire();
                List<e> listD = d(context, Boolean.FALSE);
                listD.addAll(list);
                c(context, listD);
            } else {
                semaphore = f40353b;
                semaphore.acquire();
                List<e> listD2 = d(context, Boolean.FALSE);
                listD2.addAll(list);
                c(context, listD2);
            }
            f40354c = true;
            semaphore.release();
            int i11 = f40358g + 111;
            f40357f = i11 % 128;
            if (i11 % 2 != 0) {
                return null;
            }
            throw null;
        } catch (Exception e5) {
            e5.printStackTrace();
            return null;
        } finally {
            f40353b.release();
        }
    }

    private static void e(@NonNull Context context, String str, long j10, String str2, String str3) {
        c(new Object[]{context, Collections.singletonList(new e(str, j10, str2, str3))}, -410905704, 410905706, (int) System.currentTimeMillis());
        int i10 = f40358g + 105;
        f40357f = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    private static byte[] d(Context context) throws Exception {
        int i10 = f40358g + 109;
        f40357f = i10 % 128;
        int i11 = i10 % 2;
        byte[] bArrC = d.c(context);
        Object[] objArr = new Object[1];
        j("᭮忼鈌횦\u09db䰮肎שּׂ㹀狪딄\ue9e0Ⳕ杣\udb86Ḷ兞问", TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 17570, objArr);
        byte[] bArrC2 = bi.c(bArrC, ((String) objArr[0]).intern());
        int i12 = f40358g + 39;
        f40357f = i12 % 128;
        if (i12 % 2 != 0) {
            return bArrC2;
        }
        throw null;
    }

    @NonNull
    private static String e() throws Throwable {
        Object obj;
        int i10 = f40357f + 11;
        f40358g = i10 % 128;
        if (i10 % 2 != 0) {
            Object[] objArr = new Object[1];
            j("᭑횡肎狩ⳠḰ졄먎琳♠ᆔ쎆뷴濄姯\u0b78알띐慄岿ອ", (-16724507) >> Color.rgb(1, 0, 0), objArr);
            obj = objArr[0];
        } else {
            Object[] objArr2 = new Object[1];
            j("᭑횡肎狩ⳠḰ졄먎琳♠ᆔ쎆뷴濄姯\u0b78알띐慄岿ອ", (-16724507) - Color.rgb(0, 0, 0), objArr2);
            obj = objArr2[0];
        }
        return ((String) obj).intern();
    }

    public static void d() {
        f40352a = -1803388775242174592L;
        f40356e = 5402764725387775499L;
        f40359h = -2051027445;
        f40360i = (char) 55837;
    }

    private static void d(@NonNull Context context, @NonNull List<e> list) {
        c(new Object[]{context, list}, -410905704, 410905706, (int) System.currentTimeMillis());
    }

    public static void d(@NonNull Context context, @NonNull ao aoVar, @Nullable Runnable runnable) {
        c(new Object[]{context, aoVar, runnable}, 265414186, -265414186, (int) System.currentTimeMillis());
    }

    private static void c(@NonNull Context context, List<e> list) throws Exception {
        String strE = new dv().e(list);
        bf.c(new File(context.getCacheDir(), e()), d(context), strE.getBytes(StandardCharsets.UTF_8));
        int i10 = f40357f + 119;
        f40358g = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ boolean c() {
        return ((Boolean) c(new Object[0], 1638844814, -1638844813, (int) System.currentTimeMillis())).booleanValue();
    }
}
