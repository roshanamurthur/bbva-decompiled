package com.facetec.sdk;

import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.exifinterface.media.ExifInterface;
import com.esotericsoftware.asm.Opcodes;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class gd implements gf {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f41768a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static char f41769b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f41770c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f41771d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f41772e;

    static {
        init$0();
        d();
        Object[] objArr = new Object[1];
        f((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "ꁢΈ낧衡", "෭\ued03鳈ض", (char) (13979 - ((byte) KeyEvent.getModifierMetaStateMask())), "ቄໜ泡幨徝ᬮԔ\udb98澗뜁\ud956趋欸佹", objArr);
        String str = (String) objArr[0];
        Object[] objArr2 = new Object[1];
        g("憷㉰懞伴蛿鍋⚱跩뉺몉狲慏욎湔年唽ᫀᷫꮇ૭⽎\u318f", (ViewConfiguration.getScrollBarSize() >> 8) + 1, objArr2);
        String str2 = (String) objArr2[0];
        Object[] objArr3 = new Object[1];
        f(((byte) KeyEvent.getModifierMetaStateMask()) + 1, "ꁢΈ낧衡", "Ⱅ넽ᣉ譤", (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 25623), "\ue210•礖ㄫ摕݉赫唒傿㛧医⮥\uecb2\ud927杛˨砹㪣\u1b4e붎쪘鈒㌬\ue508秮\ue238", objArr3);
        String str3 = (String) objArr3[0];
        Object[] objArr4 = new Object[1];
        f((ViewConfiguration.getPressedStateDuration() >> 16) - 1968299362, "ꁢΈ낧衡", "鹎긢梊궀", (char) (KeyEvent.keyCodeFromString("") + 32872), "廭ૻ硆", objArr4);
        String str4 = (String) objArr4[0];
        Object[] objArr5 = new Object[1];
        f(1609902667 - TextUtils.indexOf("", ""), "ꁢΈ낧衡", "䬫\uf52a穟粈", (char) (Process.getGidForName("") + 34939), "㚥癖頏秆\ue9ff퓚澷\uef66\uf505帨縬啢⊛ើ⮧鄑혅齤糆", objArr5);
        String str5 = (String) objArr5[0];
        Object[] objArr6 = new Object[1];
        f(TextUtils.indexOf((CharSequence) "", '0', 0) + 10756645, "ꁢΈ낧衡", "⓯ꐢ伀蟮", (char) (61006 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), "ҿ✻뺗", objArr6);
        String str6 = (String) objArr6[0];
        Object[] objArr7 = new Object[1];
        f((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1, "ꁢΈ낧衡", "틂\uec2c⫝\ua63f", (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), "俽࡛㽷⺴⧁ˏ鲣詋溑⡔\u0016識", objArr7);
        String str7 = (String) objArr7[0];
        Object[] objArr8 = new Object[1];
        f((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "ꁢΈ낧衡", "賐복ﰢꔼ", (char) TextUtils.getOffsetAfter("", 0), "홓\ue8ea▙\udd0c셫䣔\ud8a2䥟ᆣﲨ\uf78b䀪", objArr8);
        String str8 = (String) objArr8[0];
        Object[] objArr9 = new Object[1];
        g("ᠣ摹ᡉ씛탡쨃겢풬", -TextUtils.indexOf((CharSequence) "", '0', 0), objArr9);
        String str9 = (String) objArr9[0];
        Object[] objArr10 = new Object[1];
        g("\ud97d㎃\ud918旊蜆䌱౮嶟ઽ뭸堥넹繋澴璷蕍ꈊᰟ腹\uda9b鞣け\udd28", (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1, objArr10);
        String str10 = (String) objArr10[0];
        Object[] objArr11 = new Object[1];
        g("룗♃뢱욹鋛\u1a8f", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, objArr11);
        String str11 = (String) objArr11[0];
        Object[] objArr12 = new Object[1];
        f((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, "ꁢΈ낧衡", "⛘克\ud999㗎", (char) (View.resolveSizeAndState(0, 0, 0) + 52953), "\uf45f䋏䂖ﱹ", objArr12);
        f41771d = new String[]{str3, (String) objArr12[0], str5, str7, str9, str2, str8, str6, str4, str, str11, str10};
    }

    public static void d() {
        f41768a = -4423720917109608855L;
        f41772e = -2051027445;
        f41769b = (char) 52747;
        f41770c = 5171788941557599599L;
    }

    private static void f(int i10, String str, String str2, char c10, String str3, Object[] objArr) throws Throwable {
        char c11;
        char[] charArray = str3 != null ? str3.toCharArray() : str3;
        char[] charArray2 = str2 != null ? str2.toCharArray() : str2;
        char[] charArray3 = str != null ? str.toCharArray() : str;
        go goVar = new go();
        int length = charArray2.length;
        char[] cArr = new char[length];
        int length2 = charArray3.length;
        char[] cArr2 = new char[length2];
        int i11 = 0;
        System.arraycopy(charArray2, 0, cArr, 0, length);
        System.arraycopy(charArray3, 0, cArr2, 0, length2);
        cArr[0] = (char) (cArr[0] ^ c10);
        cArr2[2] = (char) (cArr2[2] + ((char) i10));
        int length3 = charArray.length;
        char[] cArr3 = new char[length3];
        goVar.f41794c = 0;
        while (goVar.f41794c < length3) {
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i11] = goVar;
                Map map = bp.f40694x;
                Object method = map.get(26369957);
                if (method == null) {
                    Class cls = (Class) bp.a((ViewConfiguration.getTapTimeout() >> 16) + 23, 767 - AndroidCharacter.getMirror('0'), (char) View.resolveSizeAndState(i11, i11, i11));
                    byte b10 = (byte) i11;
                    Object[] objArr3 = new Object[1];
                    h(b10, (byte) (b10 | 52), b10, objArr3);
                    String str4 = (String) objArr3[i11];
                    Class<?>[] clsArr = new Class[1];
                    clsArr[i11] = Object.class;
                    method = cls.getMethod(str4, clsArr);
                    map.put(26369957, method);
                }
                int iIntValue = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                Object[] objArr4 = new Object[1];
                objArr4[i11] = goVar;
                Object method2 = map.get(-1014658957);
                if (method2 == null) {
                    Class cls2 = (Class) bp.a(23 - Process.getGidForName(""), (Process.myPid() >> 22) + Opcodes.MULTIANEWARRAY, (char) (MotionEvent.axisFromString("") + 1));
                    Class<?>[] clsArr2 = new Class[1];
                    clsArr2[i11] = Object.class;
                    method2 = cls2.getMethod(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, clsArr2);
                    map.put(-1014658957, method2);
                }
                int iIntValue2 = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                Object[] objArr5 = {goVar, Integer.valueOf(cArr[goVar.f41794c % 4] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method3 = map.get(918635547);
                if (method3 == null) {
                    Class cls3 = (Class) bp.a((ViewConfiguration.getTapTimeout() >> 16) + 24, TextUtils.getTrimmedLength("") + 1316, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 41877));
                    byte b11 = (byte) 0;
                    Object[] objArr6 = new Object[1];
                    h(b11, (byte) (b11 | 55), b11, objArr6);
                    String str5 = (String) objArr6[0];
                    Class<?> cls4 = Integer.TYPE;
                    method3 = cls3.getMethod(str5, Object.class, cls4, cls4);
                    map.put(918635547, method3);
                }
                ((Method) method3).invoke(null, objArr5);
                Object[] objArr7 = {Integer.valueOf(cArr[iIntValue2] * 32718), Integer.valueOf(cArr2[iIntValue])};
                Object method4 = map.get(-1899743495);
                if (method4 != null) {
                    c11 = 2;
                } else {
                    Class cls5 = (Class) bp.a(View.MeasureSpec.getMode(0) + 24, 837 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr8 = new Object[1];
                    h(b12, b13, b13, objArr8);
                    String str6 = (String) objArr8[0];
                    c11 = 2;
                    Class<?> cls6 = Integer.TYPE;
                    method4 = cls5.getMethod(str6, cls6, cls6);
                    map.put(-1899743495, method4);
                }
                cArr2[iIntValue2] = ((Character) ((Method) method4).invoke(null, objArr7)).charValue();
                char c12 = goVar.f41793b;
                cArr[iIntValue2] = c12;
                int i12 = goVar.f41794c;
                cArr3[i12] = (char) (((((long) (c12 ^ charArray[i12])) ^ (f41768a ^ 5402764725387775499L)) ^ ((long) ((int) (((long) f41772e) ^ 5402764725387775499L)))) ^ ((long) ((char) (((long) f41769b) ^ 5402764725387775499L))));
                goVar.f41794c = i12 + 1;
                i11 = 0;
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void g(String str, int i10, Object[] objArr) throws Throwable {
        char[] charArray = str != null ? str.toCharArray() : str;
        ha haVar = new ha();
        char[] cArrB = ha.b(f41770c ^ (-7412675099708671612L), charArray, i10);
        haVar.f41863b = 4;
        while (true) {
            int i11 = haVar.f41863b;
            if (i11 >= cArrB.length) {
                objArr[0] = new String(cArrB, 4, cArrB.length - 4);
                return;
            }
            int i12 = i11 - 4;
            haVar.f41864c = i12;
            try {
                Object[] objArr2 = {Long.valueOf(cArrB[i11] ^ cArrB[i11 % 4]), Long.valueOf(i12), Long.valueOf(f41770c)};
                Map map = bp.f40694x;
                Object method = map.get(1967282843);
                if (method == null) {
                    Class cls = (Class) bp.a(((Process.getThreadPriority(0) + 20) >> 6) + 24, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 765, (char) (36772 - TextUtils.lastIndexOf("", '0', 0, 0)));
                    byte b10 = (byte) 0;
                    Object[] objArr3 = new Object[1];
                    h(b10, (byte) (b10 | 35), b10, objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Long.TYPE;
                    method = cls.getMethod(str2, cls2, cls2, cls2);
                    map.put(1967282843, method);
                }
                cArrB[i11] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {haVar, haVar};
                Object method2 = map.get(1724890883);
                if (method2 == null) {
                    method2 = ((Class) bp.a(TextUtils.indexOf((CharSequence) "", '0') + 25, View.MeasureSpec.getMode(0) + 269, (char) ((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 25686))).getMethod("h", Object.class, Object.class);
                    map.put(1724890883, method2);
                }
                ((Method) method2).invoke(null, objArr4);
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void h(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.facetec.sdk.gd.$$a
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r9 = r9 * 4
            int r9 = r9 + 1
            int r8 = r8 + 67
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L2f
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r10
            r10 = r9
            r9 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L2f:
            int r9 = -r9
            int r8 = r8 + r9
            int r7 = r7 + 1
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.gd.h(byte, short, int, java.lang.Object[]):void");
    }

    public static void init$0() {
        $$a = new byte[]{11, 99, -24, 72};
        $$b = 203;
    }

    @Override // com.facetec.sdk.gf
    public final void a(ga gaVar, int i10) throws IOException {
        gaVar.e(f41771d[i10]);
    }

    @Override // com.facetec.sdk.gf
    public final void b(ga gaVar, int i10) throws IOException {
        gaVar.c(f41771d[i10]);
    }
}
