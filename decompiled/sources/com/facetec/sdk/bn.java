package com.facetec.sdk;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.bbva.sl.ar.android.sslpinning.result.ResultCode;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import com.esotericsoftware.asm.Opcodes;
import com.mastercard.sonic.StatusCode;
import com.vasco.digipass.sdk.DigipassSDKConstants;
import com.vasco.digipass.sdk.utils.utilities.UtilitiesSDKConstants;
import com.veridas.detect.ImageAnalysisKt;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class bn {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static final byte[] $$d = null;
    private static final int $$e = 0;
    private static int $10;
    private static int $11;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final List<String> f40661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f40662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f40663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f40664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f40665e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static long f40666f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static int[] f40667g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static char[] f40668h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static boolean f40669i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String[] f40670j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static int f40671k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte[] f40672l = null;
    private static final int m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static int f40673n;

    public static final class e {
        private static final byte[] $$a = null;
        private static final int $$b = 0;
        private static int $10;
        private static int $11;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static char f40674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Boolean f40675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static char f40676c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static char f40677d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static char f40678e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final byte[] f40679f = null;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static int f40680g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f40681h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int f40682i;

        static {
            init$0();
            $10 = 0;
            $11 = 1;
            d();
            f40680g = 0;
            f40682i = 1;
            f40674a = (char) 16380;
            f40677d = (char) 32237;
            f40678e = (char) 8167;
            f40676c = (char) 49250;
        }

        public static void d() {
            byte[] bArr = new byte[1124];
            System.arraycopy("Mã|Æú\u0003ýù\u0004ýø\u0005ý÷\u0006ýö\u0007ýù\u0004ýõ\býô\týó\nýò\u000bó\týúÿ\u0002ó\týúþ\u0003ò\nýúý\u0004ýúü\u0005ùÿ\u0002ýúû\u0006ùþ\u0003ýúú\u0007ùý\u0004ýúù\býúø\týú÷\nùü\u0005ùû\u0006ùú\u0007ýúö\u000bùù\bù÷\nýù\u0000\u0002ýùÿ\u0003ýùþ\u0004ùö\u000bø\u0000\u0002ýùý\u0005ýùü\u0006øÿ\u0003ýùû\u0007ýùú\býùù\týùø\nýù÷\u000bøþ\u0004ýø\u0001\u0002øü\u0006øû\u0007ùý\u0004ýúù\býúø\týø\u0000\u0003ýøÿ\u0004ýøþ\u0005ýøý\u0006ýøü\u0007ýò\u000býøû\bøù\týøú\týøù\nýøø\u000býøù\nýù\u0004ýõ\býô\tøø\nø÷\u000bý÷\u0002\u0002÷\u0001\u0002÷\u0000\u0003ø÷\u000býøù\nøø\nø÷\u000býúö\u000bý÷\u0001\u0003÷ÿ\u0004÷þ\u0005ý÷\u0000\u0004÷ý\u0006ý÷ÿ\u0005ý÷þ\u0006ý÷ý\u0007ý÷ý\u0007ý÷\u0001\u0003÷û\b÷ú\t÷ù\n÷\u0000\u0003ý÷\u0000\u0004÷ý\u0006ý÷ü\bý÷û\tý÷ú\ný÷ù\u000býù\u0004ö\u0002\u0002ö\u0001\u0003ø÷\u000býö\u0003\u0002ýö\u0002\u0003ýö\u0001\u0004ýö\u0000\u0005ö\u0000\u0004÷ù\n÷\u0000\u0003ýöÿ\u0006öÿ\u0005÷\u0000\u0003ýöþ\u0007ýöý\býöü\týöü\týöû\nöý\u0007ýöú\u000böü\býöú\u000býõ\u0004\u0002öü\býõ\u0003\u0003öý\u0007ýõ\u0003\u0007é\u00131À\tñ\u00057ÙÝ\u0000\u0007ù\u0005\u0001\u0002\u0001ó\u0007é\u00131À\tñ\u00057ãÙø\rü\u0000ñ\u0013óõ\u000e\u0014çùø\u001cóóõ\u000e\u0007é\u00131À\tñ\u00057êÑþ\u0001\u0005\u0002ññþ\u0001\u0005\u0002ñ\u0016óóõ\u000e\u0003ó÷\fñ\bð\u0001\u0004\u00034Éòÿø\rõøDéÒÿø\rë\u0002\u0000ï\"íüö\bø\u0000\u0016êñ\u000bø\u0000ñ\u0000ï\"íüö\bø\u0000\u0015ëò\u0006ñ\bð\u0001\u0004\u00034Éòÿø\rõøD¼\u0001=Üíüö\bø\u0000\u0016êñ\u000bø\u0000ñ\u0000ï\"íüö\bø\u0000\u001aÙ\u0006õñ\bð\u0001\u0004\u00034Éòÿø\rõøD¼\u0001=Üíüö\bø\u0000\u001aÙ\u0006õ\b\u0000÷\u000bëý\u0001\u000bðñ\bð\u0001\u0004\u00034Åó\u000fï\u0006ý\u0004îCéÒ\u0001ûû\u000bÿùø\rñ\u0002\u0007é\u00131¹\f\u0000ì\u0001\u0007óùIÉüñüDéÜñü\t\u0001û\u0004\u0000ë\r\u001dãüí\u0003û÷\u0000ï)Ùùý\u0011ñ\tüñ\bð\u0001\u0004\u00034Éòÿø\rõøD¼\u0001=Ùè\u0000÷\u000bëý\u0001\u000b\u0003+Ç\u0003\r\"Íþ\u000fæ\u0007é\u00131Ãø?êÇ\u0003\r\"Íþ\u000fæ.Ùüùÿ\u001fÝ\u0000\u000b\u0002ò\u0000õ\u0007ñ\u000fë\r Üñü\t\u0001û\u0004\u0000ë\r\u0007é\u00131Ãø?ãÙüùÿ\u001fÝ\u0000\u000b\u0002ò\u0007é\u00131¹\f\u0000ì\u0001\u0007óùIÉüñüDÔ!\u0003õôÜñü\t\u0001û\u0004\u0000ë\r\u0000ï\u001fÜ\u0011ö\u0003\u0000í\u001a!\u0003þÞÜ\u0007ù\tø÷\ró\u0007é\u0013çH¹\f\u0000ì\u0001\u0007óùIËêÿ\n8´A\u0003þ\u0000Ô!\u0003þÞÜ\u0007ù\tø÷\ró\u0000ï$ëò\u0006ñ\bð\u0001\u0004\u00034¶\u000b\u0002ìGÖë\u0002ì2Òÿ\u0006û\u0000ð\u0001\u000fë\tøÿ\u0000ï\u0018éþ\u0000(Òÿø\u0000\u0001\u0001÷\u001déú\u0006ôøÿòÿø\u0011öùù\u0007é\u00131À\tñ\u00057éÙ\u0005í\u001dìòú\u000eõ\tü\u0000û\u000e\u0007é\u00131À\tñ\u00057Øêô\u0001ö\u0014ýô\u0005ü\u0007ùø\u001fÝ\u0011üö\u0015à\u000füü\u0007é\u00131¹\f\u0000ì\u0001\u0007óùIÉüñüDéÜñü\t\u0001û\u0004\u0000ë\r\u001eË\u0013üóú\tøÿñ\bð\u0001\u0004\u00034Éòÿø\rõøD¼\u0001=Üíüö\bø\u0000\u0016êñ\u000bø\u0000ñLÔëò\u0006\u0015Ýù,Õø\u0005\b\u001dË\u0013üóú\tøÿ".getBytes("ISO-8859-1"), 0, bArr, 0, 1124);
            f40679f = bArr;
            f40681h = 101;
        }

        public static void init$0() {
            $$a = new byte[]{27, 92, 98, 63};
            $$b = 111;
        }

        /* JADX WARN: Code duplicated, block: B:10:0x0021  */
        /* JADX WARN: Code duplicated, block: B:8:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0021
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void j(int r7, short r8, byte r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 + 4
                int r9 = 118 - r9
                int r8 = 431 - r8
                byte[] r0 = com.facetec.sdk.bn.e.f40679f
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L11
                r3 = r9
                r5 = r2
                r9 = r8
                goto L26
            L11:
                r3 = r2
            L12:
                byte r4 = (byte) r9
                int r5 = r3 + 1
                r1[r3] = r4
                if (r5 != r8) goto L21
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L21:
                r3 = r0[r7]
                r6 = r9
                r9 = r8
                r8 = r6
            L26:
                int r3 = -r3
                int r8 = r8 + r3
                int r7 = r7 + 1
                int r8 = r8 + (-2)
                r3 = r5
                r6 = r9
                r9 = r8
                r8 = r6
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bn.e.j(int, short, byte, java.lang.Object[]):void");
        }

        private static void k(String str, int i10, Object[] objArr) throws Throwable {
            char[] charArray;
            int i11;
            int i12 = $10;
            int i13 = i12 + 71;
            $11 = i13 % 128;
            int i14 = 2;
            int i15 = i13 % 2;
            if (str != null) {
                int i16 = i12 + 15;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                charArray = str.toCharArray();
            } else {
                charArray = str;
            }
            char[] cArr = charArray;
            gu guVar = new gu();
            char[] cArr2 = new char[cArr.length];
            guVar.f41827b = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i18 = guVar.f41827b;
                if (i18 >= cArr.length) {
                    String str2 = new String(cArr2, 0, i10);
                    int i19 = $10 + 9;
                    $11 = i19 % 128;
                    int i20 = i19 % 2;
                    objArr[0] = str2;
                    return;
                }
                int i21 = $10 + 53;
                $11 = i21 % 128;
                if (i21 % i14 == 0) {
                    cArr3[0] = cArr[i18];
                    cArr3[0] = cArr[i18];
                    i11 = 1;
                } else {
                    cArr3[0] = cArr[i18];
                    cArr3[1] = cArr[i18 + 1];
                    i11 = 0;
                }
                int i22 = 58224;
                while (i11 < 16) {
                    int i23 = $11 + 43;
                    $10 = i23 % 128;
                    int i24 = i23 % i14;
                    char c10 = cArr3[1];
                    char c11 = cArr3[0];
                    int i25 = (c11 + i22) ^ ((c11 << 4) + ((char) (((long) f40678e) ^ (-6773320768317835938L))));
                    int i26 = c11 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[3] = Integer.valueOf(f40676c);
                        objArr2[i14] = Integer.valueOf(i26);
                        objArr2[1] = Integer.valueOf(i25);
                        objArr2[0] = Integer.valueOf(c10);
                        Map map = bp.f40694x;
                        Object method = map.get(753387582);
                        if (method == null) {
                            Class cls = (Class) bp.a(23 - ((byte) KeyEvent.getModifierMetaStateMask()), 1120 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))));
                            byte b10 = (byte) 0;
                            byte b11 = b10;
                            Object[] objArr3 = new Object[1];
                            l(b10, b11, b11, objArr3);
                            String str3 = (String) objArr3[0];
                            Class<?> cls2 = Integer.TYPE;
                            method = cls.getMethod(str3, cls2, cls2, cls2, cls2);
                            map.put(753387582, method);
                        }
                        char cCharValue = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        Object[] objArr4 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i22) ^ ((cCharValue << 4) + ((char) (((long) f40674a) ^ (-6773320768317835938L))))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(f40677d)};
                        Object method2 = map.get(753387582);
                        if (method2 == null) {
                            Class cls3 = (Class) bp.a(23 - ((byte) KeyEvent.getModifierMetaStateMask()), View.resolveSize(0, 0) + 1119, (char) View.getDefaultSize(0, 0));
                            byte b12 = (byte) 0;
                            byte b13 = b12;
                            Object[] objArr5 = new Object[1];
                            l(b12, b13, b13, objArr5);
                            String str4 = (String) objArr5[0];
                            Class<?> cls4 = Integer.TYPE;
                            method2 = cls3.getMethod(str4, cls4, cls4, cls4, cls4);
                            map.put(753387582, method2);
                        }
                        cArr3[0] = ((Character) ((Method) method2).invoke(null, objArr4)).charValue();
                        i22 -= 40503;
                        i11++;
                        i14 = 2;
                    } catch (Throwable th2) {
                        Throwable cause = th2.getCause();
                        if (cause == null) {
                            throw th2;
                        }
                        throw cause;
                    }
                }
                int i27 = guVar.f41827b;
                cArr2[i27] = cArr3[0];
                cArr2[i27 + 1] = cArr3[1];
                Object[] objArr6 = {guVar, guVar};
                Map map2 = bp.f40694x;
                Object method3 = map2.get(52059537);
                if (method3 == null) {
                    Class cls5 = (Class) bp.a(24 - Color.green(0), 435 - ((Process.getThreadPriority(0) + 20) >> 6), (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 10109));
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 1);
                    Object[] objArr7 = new Object[1];
                    l(b14, b15, (byte) (b15 - 1), objArr7);
                    method3 = cls5.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(52059537, method3);
                }
                ((Method) method3).invoke(null, objArr6);
                i14 = 2;
            }
        }

        /* JADX WARN: Code duplicated, block: B:10:0x002c  */
        /* JADX WARN: Code duplicated, block: B:8:0x0024  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:11:0x0031). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002c
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        private static void l(short r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 4
                int r0 = 1 - r8
                int r6 = r6 * 4
                int r6 = r6 + 4
                byte[] r1 = com.facetec.sdk.bn.e.$$a
                int r7 = r7 * 2
                int r7 = r7 + 69
                byte[] r0 = new byte[r0]
                r2 = 0
                int r8 = 0 - r8
                if (r1 != 0) goto L19
                r3 = r7
                r4 = r2
                r7 = r6
                goto L31
            L19:
                r3 = r2
            L1a:
                r5 = r7
                r7 = r6
                r6 = r5
                byte r4 = (byte) r6
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L2c
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L2c:
                r3 = r1[r7]
                r5 = r7
                r7 = r6
                r6 = r5
            L31:
                int r6 = r6 + 1
                int r7 = r7 + r3
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bn.e.l(short, short, short, java.lang.Object[]):void");
        }

        /*  JADX ERROR: Type inference failed
            jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 32241. Try increasing type updates limit count.
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
            */
        public static synchronized boolean d(android.content.Context r23) {
            /*
                Method dump skipped, instruction units count: 3224
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bn.e.d(android.content.Context):boolean");
        }
    }

    static {
        init$1();
        $10 = 0;
        $11 = 1;
        init$0();
        j();
        f40673n = 0;
        f40671k = 1;
        d();
        ViewConfiguration.getKeyRepeatTimeout();
        Color.argb(0, 0, 0, 0);
        TextUtils.getOffsetAfter("", 0);
        f40665e = 0;
        f40663c = 0;
        f40661a = new ArrayList();
        f40664d = 0;
        f40662b = false;
        f40669i = false;
        Object[] objArr = new Object[1];
        p(new int[]{859503515, -1509812099, 1768009465, 281356056, -807170912, 1060901909, 1154918918, 1453168573}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 16, objArr);
        String strIntern = ((String) objArr[0]).intern();
        Object[] objArr2 = new Object[1];
        p(new int[]{1552060898, -2009331869, -571229637, 248379042, -1070251028, -1183889420}, TextUtils.lastIndexOf("", '0', 0) + 12, objArr2);
        String strIntern2 = ((String) objArr2[0]).intern();
        Object[] objArr3 = new Object[1];
        q((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 44202), 59 - MotionEvent.axisFromString(""), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14, objArr3);
        f40670j = new String[]{strIntern, strIntern2, ((String) objArr3[0]).intern()};
        int i10 = f40673n + 17;
        f40671k = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 61 / 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x0296  */
    /* JADX WARN: Code duplicated, block: B:146:0x02e1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x02ee A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static synchronized void a$24662222(Enum r19, boolean z10) {
        dk dkVar;
        int i10;
        int i11;
        dk dkVar2 = new dk(r19, z10 ? 1 : 0);
        byte[] bArr = f40672l;
        int i12 = 1;
        Object[] objArr = new Object[1];
        o(bArr[46], bArr[10], (short) 614, objArr);
        char c10 = 0;
        String str = (String) objArr[0];
        int i13 = m;
        byte b10 = bArr[5];
        Object[] objArr2 = new Object[1];
        o((short) (i13 | 25), b10, (short) (b10 | DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c11 = 2018;
            short s4 = (short) 789;
            Object[] objArr4 = new Object[1];
            o((short) (i13 | 25), (byte) (-bArr[2018]), s4, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            o((short) 204, (byte) (bArr[3] - 1), (short) StatusCode.SUCCESS, objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            o((short) (i13 | 25), (byte) (-bArr[2018]), s4, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i14 = 0;
            while (i14 < objArr7.length) {
                Object[] objArr8 = new Object[i12];
                objArr8[c10] = objArr7[i14];
                short s7 = (short) ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY;
                byte[] bArr2 = f40672l;
                short s9 = (short) 788;
                Object[] objArr9 = new Object[i12];
                o(s7, (byte) (-bArr2[c11]), s9, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[c10]);
                Object[] objArr10 = new Object[i12];
                o((short) 224, (byte) 74, (short) 798, objArr10);
                String str3 = (String) objArr10[0];
                Class<?>[] clsArr = new Class[i12];
                int i15 = m;
                Object[] objArr11 = objArr7;
                dk dkVar3 = dkVar2;
                Object[] objArr12 = new Object[1];
                o((short) (i15 | 25), (byte) (-bArr2[2018]), s4, objArr12);
                clsArr[0] = Class.forName((String) objArr12[0]);
                Object objInvoke = cls2.getMethod(str3, clsArr).invoke(null, objArr8);
                Object[] objArr13 = new Object[1];
                o(s7, (byte) (-bArr2[2018]), s9, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                o((short) (i15 | 66), (byte) (bArr2[4670] + 1), (short) 797, objArr14);
                iArr[i14] = ((Integer) cls3.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                i14++;
                c11 = 2018;
                dkVar2 = dkVar3;
                objArr7 = objArr11;
                c10 = 0;
                i12 = 1;
            }
            dk dkVar4 = dkVar2;
            int i16 = 0;
            while (true) {
                int i17 = i16 + 1;
                try {
                    dkVar = dkVar4;
                    try {
                        int iA = dkVar.a(iArr[i16]);
                        i16 = 11;
                        switch (iA) {
                            case -30:
                                i16 = 53;
                                dkVar4 = dkVar;
                                break;
                            case -29:
                                dkVar.a(22);
                                int i18 = dkVar.f41238a;
                                if (i18 == 59 || i18 != 77) {
                                    i16 = 22;
                                } else {
                                    i10 = 43;
                                    i16 = i10;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -28:
                                i16 = 48;
                                dkVar4 = dkVar;
                                break;
                            case -27:
                                dkVar.a(22);
                                int i19 = dkVar.f41238a;
                                if (i19 != 7 && i19 == 35) {
                                    i16 = 5;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -26:
                                try {
                                    dkVar.f41241d = 1;
                                    try {
                                        dkVar.a(5);
                                        dkVar.a(6);
                                        dkVar.f41241d = dkVar.f41243f.hashCode();
                                        try {
                                            dkVar.a(3);
                                            i16 = i17;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (i17 >= 44) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (i17 >= 44) {
                                    }
                                    throw th;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -25:
                                dkVar.a(19);
                                throw ((Throwable) dkVar.f41243f);
                            case -24:
                                i16 = 54;
                                dkVar4 = dkVar;
                                break;
                            case -23:
                                i16 = 56;
                                dkVar4 = dkVar;
                                break;
                            case -22:
                                dkVar.a(2);
                                if (dkVar.f41238a == 0) {
                                    i10 = 41;
                                    i16 = i10;
                                } else {
                                    i16 = i17;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -21:
                                dkVar.f41241d = 1;
                                dkVar.a(5);
                                dkVar.a(7);
                                f40673n = dkVar.f41238a;
                                i16 = i17;
                                dkVar4 = dkVar;
                                break;
                            case -20:
                                dkVar.f41241d = f40671k;
                                i11 = 3;
                                try {
                                    dkVar.a(i11);
                                    i16 = i17;
                                } catch (Throwable th5) {
                                    th = th5;
                                    if (i17 >= 44 || i17 > 48) {
                                        throw th;
                                    }
                                    dkVar.f41245h = th;
                                    dkVar.a(27);
                                    i16 = 42;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -19:
                                dkVar4 = dkVar;
                                i16 = 1;
                                break;
                            case -18:
                                i16 = 33;
                                dkVar4 = dkVar;
                                break;
                            case -17:
                                dkVar.a(16);
                                if (dkVar.f41238a == 0) {
                                    i10 = 32;
                                    i16 = i10;
                                } else {
                                    i16 = i17;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -16:
                                dkVar.f41241d = 1;
                                dkVar.a(5);
                                dkVar.a(7);
                                f40671k = dkVar.f41238a;
                                i16 = i17;
                                dkVar4 = dkVar;
                                break;
                            case -15:
                                dkVar.f41241d = f40673n;
                                i11 = 3;
                                dkVar.a(i11);
                                i16 = i17;
                                dkVar4 = dkVar;
                                break;
                            case -14:
                                break;
                            case -13:
                                i16 = 24;
                                dkVar4 = dkVar;
                                break;
                            case -12:
                                i16 = 34;
                                dkVar4 = dkVar;
                                break;
                            case -11:
                                a();
                                i16 = i17;
                                dkVar4 = dkVar;
                                break;
                            case -10:
                                dkVar.f41241d = 1;
                                dkVar.a(5);
                                dkVar.a(7);
                                f40663c = dkVar.f41238a;
                                i16 = i17;
                                dkVar4 = dkVar;
                                break;
                            case -9:
                                dkVar.f41241d = f40663c;
                                i11 = 3;
                                dkVar.a(i11);
                                i16 = i17;
                                dkVar4 = dkVar;
                                break;
                            case -8:
                                dkVar4 = dkVar;
                                break;
                            case -7:
                                try {
                                    dkVar.f41241d = 1;
                                    try {
                                        dkVar.a(5);
                                        dkVar.a(7);
                                        f40665e = dkVar.f41238a;
                                        i16 = i17;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        if (i17 >= 44) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    if (i17 >= 44) {
                                    }
                                    throw th;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -6:
                                try {
                                    dkVar.f41241d = 1;
                                    try {
                                        dkVar.a(5);
                                        try {
                                            dkVar.a(6);
                                            try {
                                                dkVar.f41241d = ((Class) bp.a(Color.blue(0) + 26, (-1) - ExpandableListView.getPackedPositionChild(0L), (char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))))).getDeclaredField("f").getInt(dkVar.f41243f);
                                                i11 = 3;
                                                dkVar.a(i11);
                                                i16 = i17;
                                            } catch (Throwable th8) {
                                                th = th8;
                                                if (i17 >= 44) {
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                            if (i17 >= 44) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        if (i17 >= 44) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    if (i17 >= 44) {
                                    }
                                    throw th;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -5:
                                dkVar.f41241d = f40665e;
                                try {
                                    dkVar.a(3);
                                    i16 = i17;
                                } catch (Throwable th12) {
                                    th = th12;
                                    if (i17 >= 44) {
                                    }
                                    throw th;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -4:
                                i16 = 49;
                                dkVar4 = dkVar;
                                break;
                            case -3:
                                i16 = 51;
                                dkVar4 = dkVar;
                                break;
                            case -2:
                                dkVar.a(2);
                                if (dkVar.f41238a == 0) {
                                    i10 = 4;
                                    i16 = i10;
                                } else {
                                    i16 = i17;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -1:
                                i16 = 18;
                                dkVar4 = dkVar;
                                break;
                            default:
                                i16 = i17;
                                dkVar4 = dkVar;
                                break;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        if (i17 >= 44) {
                        }
                        throw th;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    dkVar = dkVar4;
                }
            }
        } catch (Throwable th15) {
            Throwable cause = th15.getCause();
            if (cause == null) {
                throw th15;
            }
            throw cause;
        }
    }

    public static /* synthetic */ Object c(Object[] objArr, int i10, int i11, int i12) {
        return a(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:119:0x02aa A[PHI: r2 r6
      0x02aa: PHI (r2v7 int) = (r2v5 int), (r2v8 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int) binds: [B:149:0x031b, B:135:0x02f1, B:123:0x02b9, B:118:0x02a0, B:102:0x025c, B:64:0x01ff, B:25:0x0163] A[DONT_GENERATE, DONT_INLINE]
      0x02aa: PHI (r6v7 com.facetec.sdk.dk) = 
      (r6v5 com.facetec.sdk.dk)
      (r6v8 com.facetec.sdk.dk)
      (r6v8 com.facetec.sdk.dk)
      (r6v8 com.facetec.sdk.dk)
      (r6v8 com.facetec.sdk.dk)
      (r6v8 com.facetec.sdk.dk)
      (r6v8 com.facetec.sdk.dk)
     binds: [B:149:0x031b, B:135:0x02f1, B:123:0x02b9, B:118:0x02a0, B:102:0x025c, B:64:0x01ff, B:25:0x0163] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:143:0x030e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:145:0x0313  */
    /* JADX WARN: Code duplicated, block: B:147:0x0317 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:195:0x0323 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static synchronized void d(long j10, long j11) {
        dk dkVar;
        int i10;
        int i11;
        dk dkVar2 = new dk(j10, j11);
        byte[] bArr = f40672l;
        int i12 = 1;
        Object[] objArr = new Object[1];
        o((short) 4980, bArr[10], (short) TypedValues.MotionType.TYPE_ANIMATE_CIRCLEANGLE_TO, objArr);
        char c10 = 0;
        String str = (String) objArr[0];
        int i13 = m;
        byte b10 = bArr[5];
        Object[] objArr2 = new Object[1];
        o((short) (i13 | 25), b10, (short) (b10 | DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c11 = 2018;
            short s4 = (short) 789;
            Object[] objArr4 = new Object[1];
            o((short) (i13 | 25), (byte) (-bArr[2018]), s4, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            o((short) 204, (byte) (bArr[3] - 1), (short) StatusCode.SUCCESS, objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            o((short) (i13 | 25), (byte) (-bArr[2018]), s4, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i14 = 0;
            while (i14 < objArr7.length) {
                Object[] objArr8 = new Object[i12];
                objArr8[c10] = objArr7[i14];
                short s7 = (short) ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY;
                byte[] bArr2 = f40672l;
                short s9 = (short) 788;
                Object[] objArr9 = new Object[i12];
                o(s7, (byte) (-bArr2[c11]), s9, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[c10]);
                Object[] objArr10 = new Object[i12];
                o((short) 224, (byte) 74, (short) 798, objArr10);
                String str3 = (String) objArr10[0];
                Class<?>[] clsArr = new Class[i12];
                int i15 = m;
                Object[] objArr11 = objArr7;
                dk dkVar3 = dkVar2;
                Object[] objArr12 = new Object[1];
                o((short) (i15 | 25), (byte) (-bArr2[2018]), s4, objArr12);
                clsArr[0] = Class.forName((String) objArr12[0]);
                Object objInvoke = cls2.getMethod(str3, clsArr).invoke(null, objArr8);
                Object[] objArr13 = new Object[1];
                o(s7, (byte) (-bArr2[2018]), s9, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                o((short) (i15 | 66), (byte) (bArr2[4670] + 1), (short) 797, objArr14);
                iArr[i14] = ((Integer) cls3.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                i14++;
                c11 = 2018;
                dkVar2 = dkVar3;
                objArr7 = objArr11;
                c10 = 0;
                i12 = 1;
            }
            dk dkVar4 = dkVar2;
            int i16 = 0;
            while (true) {
                int i17 = i16 + 1;
                try {
                    dkVar = dkVar4;
                    try {
                        switch (dkVar.a(iArr[i16])) {
                            case -25:
                                i16 = 56;
                                dkVar4 = dkVar;
                                break;
                            case -24:
                                dkVar.a(22);
                                if (dkVar.f41238a != 1) {
                                    i17 = 40;
                                    i16 = i17;
                                } else {
                                    i16 = 1;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -23:
                                i16 = 51;
                                dkVar4 = dkVar;
                                break;
                            case -22:
                                dkVar.a(22);
                                i16 = dkVar.f41238a != 0 ? 24 : 12;
                                dkVar4 = dkVar;
                                break;
                            case -21:
                                i16 = 57;
                                dkVar4 = dkVar;
                                break;
                            case -20:
                                i16 = 59;
                                dkVar4 = dkVar;
                                break;
                            case -19:
                                dkVar.a(2);
                                if (dkVar.f41238a == 0) {
                                    i16 = 38;
                                } else {
                                    i16 = i17;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -18:
                                dkVar.f41241d = 1;
                                try {
                                    dkVar.a(5);
                                    dkVar.a(7);
                                    f40673n = dkVar.f41238a;
                                } catch (Throwable th2) {
                                    th = th2;
                                    i10 = 25;
                                    if (i17 < i10) {
                                        if (i17 >= 46) {
                                        }
                                        throw th;
                                    }
                                    if (i17 >= 46) {
                                    }
                                    throw th;
                                    dkVar.f41245h = th;
                                    dkVar.a(27);
                                }
                                i16 = i17;
                                dkVar4 = dkVar;
                                break;
                            case -17:
                                dkVar.f41241d = f40671k;
                                dkVar.a(3);
                                i16 = i17;
                                dkVar4 = dkVar;
                                break;
                            case -16:
                                dkVar.f41241d = 1;
                                dkVar.a(5);
                                dkVar.a(6);
                                dkVar.f41241d = dkVar.f41243f.hashCode();
                                i11 = 3;
                                try {
                                    dkVar.a(i11);
                                } catch (Throwable th3) {
                                    th = th3;
                                    i10 = 25;
                                    if (i17 < i10) {
                                        if (i17 >= 46) {
                                        }
                                        throw th;
                                    }
                                    if (i17 >= 46) {
                                    }
                                    throw th;
                                    dkVar.f41245h = th;
                                    dkVar.a(27);
                                }
                                i16 = i17;
                                dkVar4 = dkVar;
                                break;
                            case -15:
                                dkVar.a(19);
                                throw ((Throwable) dkVar.f41243f);
                            case -14:
                                dkVar4 = dkVar;
                                i16 = 52;
                                break;
                            case -13:
                                i16 = 54;
                                dkVar4 = dkVar;
                                break;
                            case -12:
                                dkVar.a(16);
                                if (dkVar.f41238a == 0) {
                                    i16 = 22;
                                } else {
                                    i16 = i17;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -11:
                                dkVar.f41241d = 1;
                                dkVar.a(5);
                                dkVar.a(7);
                                f40671k = dkVar.f41238a;
                                i16 = i17;
                                dkVar4 = dkVar;
                                break;
                            case -10:
                                dkVar.f41241d = f40673n;
                                i11 = 3;
                                dkVar.a(i11);
                                i16 = i17;
                                dkVar4 = dkVar;
                                break;
                            case -9:
                                break;
                            case -8:
                                i16 = 29;
                                dkVar4 = dkVar;
                                break;
                            case -7:
                                i16 = 14;
                                dkVar4 = dkVar;
                                break;
                            case -6:
                                b();
                                i16 = i17;
                                dkVar4 = dkVar;
                                break;
                            case -5:
                                try {
                                    dkVar.f41241d = 1;
                                    try {
                                        dkVar.a(5);
                                        dkVar.a(7);
                                        f40664d = dkVar.f41238a;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        i10 = 25;
                                        if (i17 < i10) {
                                            if (i17 >= 46) {
                                            }
                                            throw th;
                                        }
                                        if (i17 >= 46) {
                                        }
                                        throw th;
                                        dkVar.f41245h = th;
                                        dkVar.a(27);
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    i10 = 25;
                                    if (i17 < i10) {
                                        if (i17 >= 46) {
                                        }
                                        throw th;
                                    }
                                    if (i17 >= 46) {
                                    }
                                    throw th;
                                    dkVar.f41245h = th;
                                    dkVar.a(27);
                                }
                                i16 = i17;
                                dkVar4 = dkVar;
                                break;
                            case -4:
                                try {
                                    dkVar.f41241d = 1;
                                    try {
                                        dkVar.a(5);
                                        try {
                                            dkVar.a(6);
                                            try {
                                                dkVar.f41241d = ((Class) bp.a(View.combineMeasuredStates(0, 0) + 26, 52 - Color.alpha(0), (char) (ViewConfiguration.getTouchSlop() >> 8))).getField("i").getInt(dkVar.f41243f);
                                                i11 = 3;
                                                dkVar.a(i11);
                                            } catch (Throwable th6) {
                                                th = th6;
                                                i10 = 25;
                                                if (i17 < i10) {
                                                    if (i17 >= 46) {
                                                    }
                                                    throw th;
                                                }
                                                if (i17 >= 46) {
                                                }
                                                throw th;
                                                dkVar.f41245h = th;
                                                dkVar.a(27);
                                                i16 = i17;
                                                dkVar4 = dkVar;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            i10 = 25;
                                            if (i17 < i10) {
                                                if (i17 >= 46) {
                                                }
                                                throw th;
                                            }
                                            if (i17 >= 46) {
                                            }
                                            throw th;
                                            dkVar.f41245h = th;
                                            dkVar.a(27);
                                            i16 = i17;
                                            dkVar4 = dkVar;
                                        }
                                    } catch (Throwable th8) {
                                        th = th8;
                                        i10 = 25;
                                        if (i17 < i10) {
                                            if (i17 >= 46) {
                                            }
                                            throw th;
                                        }
                                        if (i17 >= 46) {
                                        }
                                        throw th;
                                        dkVar.f41245h = th;
                                        dkVar.a(27);
                                    }
                                } catch (Throwable th9) {
                                    th = th9;
                                    i10 = 25;
                                    if (i17 < i10) {
                                        if (i17 >= 46) {
                                        }
                                        throw th;
                                    }
                                    if (i17 >= 46) {
                                    }
                                    throw th;
                                    dkVar.f41245h = th;
                                    dkVar.a(27);
                                }
                                i16 = i17;
                                dkVar4 = dkVar;
                                break;
                            case -3:
                                try {
                                    try {
                                        try {
                                            dkVar.f41245h = ((Class) bp.a((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 25, TextUtils.lastIndexOf("", '0', 0, 0) + 53, (char) (KeyEvent.getMaxKeyCode() >> 16))).getField("b").get(null);
                                            dkVar.a(43);
                                        } catch (Throwable th10) {
                                            th = th10;
                                            i10 = 25;
                                            if (i17 < i10) {
                                                if (i17 >= 46) {
                                                }
                                                throw th;
                                            }
                                            if (i17 >= 46) {
                                            }
                                            throw th;
                                            dkVar.f41245h = th;
                                            dkVar.a(27);
                                        }
                                    } catch (Throwable th11) {
                                        th = th11;
                                        i10 = 25;
                                        if (i17 < i10) {
                                            if (i17 >= 46) {
                                            }
                                            throw th;
                                        }
                                        if (i17 >= 46) {
                                        }
                                        throw th;
                                        dkVar.f41245h = th;
                                        dkVar.a(27);
                                    }
                                } catch (Throwable th12) {
                                    th = th12;
                                }
                                i16 = i17;
                                dkVar4 = dkVar;
                                break;
                            case -2:
                                try {
                                    dkVar.f41241d = f40664d;
                                    try {
                                        dkVar.a(3);
                                    } catch (Throwable th13) {
                                        th = th13;
                                        i10 = 25;
                                        if (i17 < i10) {
                                            if (i17 >= 46) {
                                            }
                                            throw th;
                                        }
                                        if (i17 >= 46) {
                                        }
                                        throw th;
                                        dkVar.f41245h = th;
                                        dkVar.a(27);
                                    }
                                } catch (Throwable th14) {
                                    th = th14;
                                }
                                i16 = i17;
                                dkVar4 = dkVar;
                                break;
                            case -1:
                                dkVar4 = dkVar;
                                i16 = 8;
                                break;
                            default:
                                i16 = i17;
                                dkVar4 = dkVar;
                                break;
                        }
                    } catch (Throwable th15) {
                        th = th15;
                        i10 = 25;
                        if (i17 < i10 && i17 <= 29) {
                            i17 = 23;
                        } else {
                            if (i17 >= 46 || i17 > 51) {
                                throw th;
                            }
                            i17 = 39;
                        }
                        dkVar.f41245h = th;
                        dkVar.a(27);
                        i16 = i17;
                        dkVar4 = dkVar;
                    }
                } catch (Throwable th16) {
                    th = th16;
                    dkVar = dkVar4;
                }
            }
        } catch (Throwable th17) {
            Throwable cause = th17.getCause();
            if (cause == null) {
                throw th17;
            }
            throw cause;
        }
    }

    public static void e() throws Throwable {
        dk dkVar = new dk();
        byte[] bArr = f40672l;
        byte b10 = bArr[10];
        Object[] objArr = new Object[1];
        o((short) 4126, b10, (short) (b10 | 710), objArr);
        int i10 = 0;
        String str = (String) objArr[0];
        int i11 = m;
        byte b11 = bArr[5];
        Object[] objArr2 = new Object[1];
        o((short) (i11 | 25), b11, (short) (b11 | DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c10 = 2018;
            short s4 = (short) 789;
            Object[] objArr4 = new Object[1];
            o((short) (i11 | 25), (byte) (-bArr[2018]), s4, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            o((short) 204, (byte) (bArr[3] - 1), (short) StatusCode.SUCCESS, objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            o((short) (i11 | 25), (byte) (-bArr[2018]), s4, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i12 = 0;
            while (i12 < objArr7.length) {
                Object[] objArr8 = new Object[1];
                objArr8[i10] = objArr7[i12];
                short s7 = (short) ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY;
                byte[] bArr2 = f40672l;
                short s9 = (short) 788;
                Object[] objArr9 = new Object[1];
                o(s7, (byte) (-bArr2[c10]), s9, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[i10]);
                Object[] objArr10 = new Object[1];
                o((short) 224, (byte) 74, (short) 798, objArr10);
                String str3 = (String) objArr10[i10];
                int i13 = m;
                Object[] objArr11 = objArr7;
                Object[] objArr12 = new Object[1];
                o((short) (i13 | 25), (byte) (-bArr2[2018]), s4, objArr12);
                Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr12[0])).invoke(null, objArr8);
                Object[] objArr13 = new Object[1];
                o(s7, (byte) (-bArr2[2018]), s9, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                o((short) (i13 | 66), (byte) (bArr2[4670] + 1), (short) 797, objArr14);
                iArr[i12] = ((Integer) cls3.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                i12++;
                c10 = 2018;
                i10 = 0;
                objArr7 = objArr11;
            }
            while (true) {
                int i14 = i10 + 1;
                try {
                    switch (dkVar.a(iArr[i10])) {
                        case -12:
                            i10 = 25;
                            break;
                        case -11:
                            dkVar.a(22);
                            int i15 = dkVar.f41238a;
                            i14 = 20;
                            i10 = (i15 == 0 || i15 != 1) ? i14 : 6;
                            break;
                        case -10:
                            dkVar.a(19);
                            throw ((Throwable) dkVar.f41243f);
                        case -9:
                            i10 = 26;
                            break;
                        case -8:
                            i10 = 28;
                            break;
                        case -7:
                            dkVar.a(16);
                            if (dkVar.f41238a == 0) {
                                i10 = 18;
                            }
                            break;
                        case -6:
                            dkVar.f41241d = 1;
                            try {
                                dkVar.a(5);
                                dkVar.a(7);
                                f40671k = dkVar.f41238a;
                            } catch (Throwable th2) {
                                th = th2;
                                if (i14 >= 21) {
                                }
                                throw th;
                            }
                            break;
                        case -5:
                            dkVar.f41241d = f40673n;
                            try {
                                dkVar.a(3);
                            } catch (Throwable th3) {
                                th = th3;
                                if (i14 >= 21 || i14 > 25) {
                                    throw th;
                                }
                                dkVar.f41245h = th;
                                dkVar.a(27);
                                i10 = 19;
                            }
                            break;
                        case -4:
                            return;
                        case -3:
                            i10 = 1;
                            break;
                        case -2:
                            i10 = 8;
                            break;
                        case -1:
                            i10 = 2;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            Throwable cause = th5.getCause();
            if (cause == null) {
                throw th5;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:107:0x025a  */
    /* JADX WARN: Code duplicated, block: B:121:0x028e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0291  */
    /* JADX WARN: Code duplicated, block: B:137:0x02c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x02ca A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static synchronized boolean e$f57910a(Enum r19) {
        dk dkVar;
        int i10;
        boolean z10;
        char c10;
        int i11;
        dk dkVar2 = new dk(r19);
        int i12 = m;
        byte[] bArr = f40672l;
        int i13 = 1;
        Object[] objArr = new Object[1];
        o((short) (i12 | 73), bArr[10], (short) TypedValues.MotionType.TYPE_DRAW_PATH, objArr);
        char c11 = 0;
        String str = (String) objArr[0];
        byte b10 = bArr[5];
        Object[] objArr2 = new Object[1];
        o((short) (i12 | 25), b10, (short) (b10 | DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c12 = 2018;
            short s4 = (short) 789;
            Object[] objArr4 = new Object[1];
            o((short) (i12 | 25), (byte) (-bArr[2018]), s4, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            o((short) 204, (byte) (bArr[3] - 1), (short) StatusCode.SUCCESS, objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            o((short) (i12 | 25), (byte) (-bArr[2018]), s4, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i14 = 0;
            while (i14 < objArr7.length) {
                Object[] objArr8 = new Object[i13];
                objArr8[c11] = objArr7[i14];
                short s7 = (short) ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY;
                byte[] bArr2 = f40672l;
                short s9 = (short) 788;
                Object[] objArr9 = new Object[i13];
                o(s7, (byte) (-bArr2[c12]), s9, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[c11]);
                Object[] objArr10 = new Object[i13];
                o((short) 224, (byte) 74, (short) 798, objArr10);
                String str3 = (String) objArr10[0];
                Class<?>[] clsArr = new Class[i13];
                int i15 = m;
                Object[] objArr11 = objArr7;
                dk dkVar3 = dkVar2;
                Object[] objArr12 = new Object[1];
                o((short) (i15 | 25), (byte) (-bArr2[2018]), s4, objArr12);
                clsArr[0] = Class.forName((String) objArr12[0]);
                Object objInvoke = cls2.getMethod(str3, clsArr).invoke(null, objArr8);
                Object[] objArr13 = new Object[1];
                o(s7, (byte) (-bArr2[2018]), s9, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                o((short) (i15 | 66), (byte) (bArr2[4670] + 1), (short) 797, objArr14);
                iArr[i14] = ((Integer) cls3.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                i14++;
                c12 = 2018;
                dkVar2 = dkVar3;
                objArr7 = objArr11;
                c11 = 0;
                i13 = 1;
            }
            dk dkVar4 = dkVar2;
            int i16 = 0;
            while (true) {
                int i17 = i16 + 1;
                try {
                    dkVar = dkVar4;
                    try {
                        switch (dkVar.a(iArr[i16])) {
                            case -27:
                                i16 = 55;
                                dkVar4 = dkVar;
                                break;
                            case -26:
                                try {
                                    dkVar.a(22);
                                    int i18 = dkVar.f41238a;
                                    if (i18 == 13 || i18 != 94) {
                                        i16 = 8;
                                    } else {
                                        i16 = 10;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (i17 >= 31) {
                                    }
                                    throw th;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -25:
                                i16 = 50;
                                dkVar4 = dkVar;
                                break;
                            case -24:
                                dkVar.a(22);
                                int i19 = dkVar.f41238a;
                                if (i19 == 0 || i19 != 1) {
                                    i16 = 8;
                                } else {
                                    i16 = 10;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -23:
                                i16 = 15;
                                dkVar4 = dkVar;
                                break;
                            case -22:
                                i16 = 49;
                                dkVar4 = dkVar;
                                break;
                            case -21:
                                dkVar.a(16);
                                if (dkVar.f41238a == 0) {
                                    i10 = 48;
                                    i16 = i10;
                                } else {
                                    i16 = i17;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -20:
                                try {
                                    dkVar.f41241d = 1;
                                    try {
                                        dkVar.a(5);
                                        dkVar.a(7);
                                        f40671k = dkVar.f41238a;
                                        i16 = i17;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        if (i17 >= 31) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (i17 >= 31 || i17 > 37) {
                                        throw th;
                                    }
                                    dkVar.f41245h = th;
                                    dkVar.a(27);
                                    i16 = 26;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -19:
                                dkVar.f41241d = f40673n;
                                dkVar.a(3);
                                i16 = i17;
                                dkVar4 = dkVar;
                                break;
                            case -18:
                                i16 = 56;
                                dkVar4 = dkVar;
                                break;
                            case -17:
                                i16 = 58;
                                dkVar4 = dkVar;
                                break;
                            case -16:
                                dkVar.a(29);
                                if (dkVar.f41238a == 0) {
                                    i10 = 36;
                                    i16 = i10;
                                } else {
                                    i16 = i17;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -15:
                                dkVar.a(19);
                                throw ((Throwable) dkVar.f41243f);
                            case -14:
                                dkVar4 = dkVar;
                                i16 = 1;
                                break;
                            case -13:
                                i16 = 27;
                                dkVar4 = dkVar;
                                break;
                            case -12:
                                dkVar.a(2);
                                if (dkVar.f41238a == 0) {
                                    i16 = 25;
                                } else {
                                    i16 = i17;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -11:
                                z10 = true;
                                try {
                                    dkVar.f41241d = 1;
                                    c10 = 5;
                                    try {
                                        dkVar.a(5);
                                        dkVar.a(7);
                                        f40673n = dkVar.f41238a;
                                        i16 = i17;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        if (i17 >= 31) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    if (i17 >= 31) {
                                    }
                                    throw th;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -10:
                                dkVar.f41241d = f40671k;
                                i11 = 3;
                                try {
                                    dkVar.a(i11);
                                    i16 = i17;
                                } catch (Throwable th7) {
                                    th = th7;
                                    if (i17 >= 31) {
                                    }
                                    throw th;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -9:
                                i16 = 17;
                                dkVar4 = dkVar;
                                break;
                            case -8:
                                dkVar.a(31);
                                break;
                            case -7:
                                i16 = 37;
                                dkVar4 = dkVar;
                                break;
                            case -6:
                                i16 = 51;
                                dkVar4 = dkVar;
                                break;
                            case -5:
                                i16 = 53;
                                dkVar4 = dkVar;
                                break;
                            case -4:
                                dkVar.a(29);
                                if (dkVar.f41238a == 0) {
                                    i16 = 7;
                                } else {
                                    i16 = i17;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -3:
                                z10 = true;
                                try {
                                    dkVar.f41241d = 1;
                                    c10 = 5;
                                    try {
                                        dkVar.a(5);
                                        try {
                                            dkVar.a(6);
                                            try {
                                                dkVar.f41241d = ((Class) bp.a(KeyEvent.normalizeMetaState(0) + 26, Process.myTid() >> 22, (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)))).getField("f").getInt(dkVar.f41243f);
                                                i11 = 3;
                                                dkVar.a(i11);
                                                i16 = i17;
                                            } catch (Throwable th8) {
                                                th = th8;
                                                if (i17 >= 31) {
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        if (i17 >= 31) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    if (i17 >= 31) {
                                    }
                                    throw th;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -2:
                                dkVar.f41241d = f40665e;
                                try {
                                    dkVar.a(3);
                                    i16 = i17;
                                } catch (Throwable th12) {
                                    th = th12;
                                    if (i17 >= 31) {
                                    }
                                    throw th;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -1:
                                i16 = 12;
                                dkVar4 = dkVar;
                                break;
                            default:
                                i16 = i17;
                                dkVar4 = dkVar;
                                break;
                        }
                    } catch (Throwable th13) {
                        th = th13;
                        if (i17 >= 31) {
                        }
                        throw th;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    dkVar = dkVar4;
                }
            }
        } catch (Throwable th15) {
            Throwable cause = th15.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th15;
        }
        return dkVar.f41238a != 0;
    }

    public static void init$0() {
        $$a = new byte[]{41, UtilitiesSDKConstants.SRP_LABEL_MAC, -97, -39};
        $$b = 134;
    }

    public static void init$1() {
        $$d = new byte[]{27, 92, 98, 63};
        $$e = 186;
    }

    public static void j() {
        byte[] bArr = new byte[5183];
        System.arraycopy("\u000bcèH÷\u0000ö\u0000úö\u0001úõ\u0002úô\u0003úó\u0004ó\u0003úò\u0005ï\u0007úñ\u0006úð\u0007úï\bó\u0003úò\u0005ï\u0007ú÷üÿú÷û\u0000ú÷ú\u0001î\bî\böüÿú÷ù\u0002öû\u0000ú÷ø\u0003ú÷÷\u0004öú\u0001öù\u0002öø\u0003ú÷ö\u0005ö÷\u0004ú÷õ\u0006ú÷ô\u0007ú÷ó\bú÷ó\búöýÿöõ\u0006öô\u0007úöü\u0000ö÷\u0004úöû\u0001úöú\u0002úöù\u0003úöø\u0004öû\u0000õýÿúö÷\u0005õü\u0000ú÷ø\u0003úöö\u0006õú\u0002úöõ\u0007õù\u0003úöõ\u0007úöô\bõø\u0004úõþÿõ÷\u0005úõþ\u0004æ\u0010.½\u0006î\u00024ÖÚý\u0004ö\u0002þÿþð\u0004æ\u0010.½\u0006î\u00024àÖõ\nùýî\u0010ðò\u000b\u0011äöõ\u0019ððò\u000b÷\u0000úö\u0001ó\u0003úõ\u0002õõ\u0007úô\u0003úó\u0004úò\u0005ôþÿúñ\u0006ôü\u0001úð\u0007ôû\u0002õü\u0000úï\böû\u0000úð\u0007ú÷üÿôú\u0003ôù\u0004öô\u0007ú÷û\u0000ö÷\u0004ú÷ú\u0001ú÷ù\u0002ú÷ø\u0003ú÷÷\u0004úö\u0001ó\u0003úõ\u0002õõ\u0007ôø\u0005ô÷\u0006õü\u0000ú÷ö\u0005ú÷õ\u0006ú÷ô\u0007ú÷ó\bôö\u0007öù\u0002ôù\u0004ôõ\bóÿÿúöýÿî\bóÿÿúöü\u0000úöû\u0001úöú\u0002úöú\u0002úöù\u0003ôþÿúöø\u0004ôü\u0001úöø\u0004úö÷\u0005óþ\u0000úöö\u0006óý\u0001úöö÷\u0000úö\u0001ôþÿúõ\u0002úô\u0003óû\u0003úó\u0004úò\u0005úñ\u0006úð\u0007úô\u0003óû\u0003úï\bõü\u0000ú÷üÿó\u0003ú÷û\u0000óû\u0003ú÷ú\u0001ú÷ù\u0002ú÷ø\u0003ôû\u0002õü\u0000ú÷÷\u0004ôû\u0002õü\u0000ú÷ö\u0005ú÷õ\u0006óú\u0004óù\u0005ôõ\bóÿÿú÷ô\u0007ö÷\u0004ú÷ó\búöýÿúöü\u0000úöü\u0000úöû\u0001óø\u0006öô\u0007úöú\u0002î\bóÿÿúöù\u0003úöø\u0004úö÷\u0005úö÷\u0005úöö\u0006ó÷\u0007úöõ\u0007óö\búöõ\u0004æ\u0010.´ü\u0006ø9ÝÞñúïüõ\u000eóöö\u0004æ\u0010.½\u0006î\u00024Úèó\u0000ýêøû÷\u0000úö\u0001úõ\u0002úô\u0003úó\u0004úò\u0005úñ\u0006î\búð\u0007úï\bú÷üÿúð\u0007ú÷û\u0000ú÷ú\u0001úð\u0007ú÷ù\u0002ú÷ø\u0003ú÷÷\u0004ú÷ö\u0005ú÷õ\u0006ú÷ô\u0007î\bî\böüÿú÷ó\böû\u0000úò\u0005úöýÿò\u0000ÿöô\u0007úöü\u0000î\bóÿÿúöû\u0001úöú\u0002úöù\u0003úöø\u0004úö\u0001õýÿòÿ\u0000úö÷\u0005úô\u0003úó\u0004úöýÿòþ\u0001òý\u0002óÿÿúöü\u0000î\bóÿÿúöö\u0006úöõ\u0007úöô\búöø\u0004öû\u0000òü\u0003òû\u0004úò\u0005úõþÿôü\u0001úõý\u0000ôþÿúõý\u0000úõü\u0001ôþÿúõû\u0002ôü\u0001úõûø\u00064¿òÿü;ßòÿü\bÊû\fã\u0004æ\u0010.´ü\u0006ø9æÏþû\u0002ýê\u0006õü\u0000\u0017Úý\u0004ö\u0002÷\u0000ó\u0003úö\u0001úõ\u0002õü\u0000úô\u0003úó\u0004òú\u0005öüÿúò\u0005öû\u0000úñ\u0006úð\u0007òù\u0006òø\u0007óÿÿúï\bö÷\u0004ú÷üÿú÷û\u0000ú÷ú\u0001ú÷ú\u0001ú÷ù\u0002ò÷\bôõ\bóÿÿú÷ø\u0003î\bóÿÿú÷÷\u0004ú÷ö\u0005ú÷õ\u0006ú÷õ÷\u0000ñ\u0001ÿúö\u0001úõ\u0002ó\u0003úô\u0003úó\u0004ñ\u0000\u0000úò\u0005ñÿ\u0001úñ\u0006úð\u0007úï\bú÷üÿú÷û\u0000ú÷ú\u0001ñþ\u0002ú÷ú\u0001ñý\u0003ôü\u0001ú÷ù\u0002ñû\u0005ú÷ø\u0003ñú\u0006úó\u0004ñù\u0007ú÷÷\u0004ñÿ\u0001ú÷ö\u0005úð\u0007úï\bú÷õ\u0006ú÷ô\u0007ú÷ó\bñø\búöýÿó\u0003úöü\u0000ôþÿôü\u0001ôü\u0001úöû\u0001öù\u0002úñ\u0006úð\u0007úï\búöú\u0002úöù\u0003ú÷ú\u0001ð\u0002ÿú÷ú\u0001ó\u0003úöø\u0004ð\u0001\u0000ôü\u0001úö÷\u0005öù\u0002úñ\u0006úð\u0007úï\búöö\u0006úöõ\u0007úöô\bð\u0000\u0001ú÷ú\u0001ó\u0003ð\u0001\u0000úõþÿðÿ\u0002úõý\u0000ðþ\u0003ðý\u0004ú÷ø\u0003ðþ\u0003ðý\u0004ú÷ö\u0005úð\u0007úï\búõü\u0001úõû\u0002ú÷ú\u0001ðü\u0005ðû\u0006úõú\u0003ðú\u0007ú÷ù\u0002ðù\bôü\u0001úõù\u0004ðþ\u0003ï\u0003ÿúõø\u0005ï\u0002\u0000öù\u0002ú÷ö\u0005úð\u0007úï\búõ÷\u0006úõö\u0007ú÷ú\u0001ï\u0001\u0001ú÷ú\u0001ö\u0000úõõ\búôÿÿúôþ\u0000úôý\u0001ï\u0007úôü\u0002úôû\u0003úôÿÿúôú\u0004úôý\u0001ï\u0007úôü\u0002úôû\u0003úôÿÿúôù\u0005úôý\u0001ï\u0007úôü\u0002úôû\u0003úôÿÿúôø\u0006úôý\u0001ï\u0007úôü\u0002úô÷\u0007úôÿÿúôö\búôý\u0001ï\u0007úôü\u0002úó\u0000ÿúôÿÿúóÿ\u0000úôý\u0001ï\u0007úôü\u0002úóþ\u0001úôû\u0003òú\u0005öüÿúóý\u0002öû\u0000úôû\u0003òú\u0005óÿÿõü\u0000ú÷ú\u0001öû\u0000úôû\u0003î\bö÷\u0004õü\u0000ú÷ú\u0001úóü\u0003ï\u0000\u0002öù\u0002òø\u0007óÿÿúóû\u0004î\bóÿÿúóú\u0005úóù\u0006úóø\u0007ï\u0001\u0001ú÷ú\u0001úóü\u0003ïÿ\u0003ôõ\bóÿÿúóû\u0004î\bóÿÿúó÷\búò\u0001ÿúò\u0000\u0000úòÿ\u0001öû\u0000õýÿúö\u0001õü\u0000úôû\u0003úòþ\u0002ïþ\u0004öù\u0002ôù\u0004öô\u0007úòý\u0003ö÷\u0004úòü\u0004úòû\u0005úòú\u0006úòú\u0006úóü\u0003ïý\u0005öù\u0002ôù\u0004ôõ\bóÿÿúóû\u0004î\bóÿÿúòù\u0007úòø\búñ\u0002ÿúñ\u0002ÿúòþ\u0002ïü\u0006òý\u0002óÿÿúòý\u0003î\bóÿÿúñ\u0001\u0000úñ\u0000\u0001úñÿ\u0002úñÿ\u0002úñþ\u0003ôþÿúñý\u0004ôü\u0001úñý\u0004úñü\u0005ïû\u0007úñû\u0006ïú\búñû\u0006úñú\u0007î\u0004ÿúñù\bî\u0003\u0000úñùî\u0005íþ\u0001\u00001µ\nèÿAÕêèÿ\u001aÜ\u0006øôö\u0005úè$ä\u0004æ\u0010.½\u0006î\u00024æÖ\u0002ê\u001aéï÷\u000bò\u0006ùöõ\nîÿî\u0005íþ\u0001\u00001³\bÿéDÓèÿéïý\u0006ôö\u0004\u0013ãÿéùþ\bü\fÚ\u000eè\níî\u0005íþ\u0001\u00001º÷@ÖÕ\u0001ú\nó%Òø\u0007óô\u0006ìø\tü\rèÿðó\u0006÷\u0003\u0012èîú÷\bíÿþñ\f\råê\u0010î\u0005íþ\u0001\u00001³\bÿéDÓèÿéNÒãÿéùþ\b\rÞ\u0006ý\u0007ñ\u0001\u0013ãÿéùþ\b\rÞ\u0006ýî\u0005íþ\u0001\u00001Âð\fì\u0003ú\u0001ë@à×\u0007õý\u001aÒø\u0000\u0007èýì-Ôðü\u001eæî\u001dâì\u000eôî\u0005íþ\u0001\u00001³\bÿéDÓèÿé/Ïü\u0003øýíþ\fè\u0006õüýì(Öø\büð&Ùê\u0006õü\u001eáç æ÷\u0003ñõüî\u0005íþ\u0001\u00001²\t\u0000øýìAäÈ\u0003\nî\u0005þúñ\u0002\u0014Þñú\u0019èÿéýì\u001fêùó\u0001ü\u000fÜ÷\u0005ð\u0006õü#Òø&Ðþõ\u0000ýì+Ðõ\u000eñ\u0002\fîì\u0017æ÷\u0003ñõü÷\u0000úö\u0001úõ\u0002úô\u0003úó\u0004úò\u0005î\u0002\u0001úñ\u0006úð\u0007úï\bú÷üÿî\u0000\u0003îÿ\u0004îþ\u0005îý\u0006ú÷û\u0000îü\u0007ú÷ú\u0001ú÷ù\u0002ú÷ø\u0003öüûÿöüú\u0000ú÷÷\u0004ú÷ö\u0005î\bú÷õ\u0006ðþ\u0003öüù\u0001ú÷ô\u0007ú÷ó\búöýÿúöü\u0000úöû\u0001úöú\u0002úöù\u0003úöø\u0004úö÷\u0005ï\u0007úöö\u0006úöõ\u0007öüø\u0002úöô\bôþÿúõþÿúöù\u0003úöø\u0004úö÷\u0005õõ\u0007úõý\u0000úõü\u0001úó\u0004úöù\u0003úõû\u0002úõú\u0003úõù\u0004úõø\u0005ôü\u0001úõþÿúó\u0004ö\u0000úõ÷\u0006úõö\u0007úõõ\bó\u0003úôÿÿúôþ\u0000úôý\u0001úôü\u0002òú\u0005öüÿúôû\u0003ôû\u0002õü\u0000úöô\bòú\u0005óÿÿõü\u0000úõõ\bî\bî\bóÿÿõü\u0000ú÷ø\u0003úôú\u0004ï\u0000\u0002òý\u0002óÿÿúôù\u0005î\bóÿÿúôø\u0006úô÷\u0007úôö\búò\u0005ïû\u0007úó\u0000ÿúóÿ\u0000úóþ\u0001úôú\u0004öü÷\u0003òý\u0002óÿÿúôù\u0005ö÷\u0004úóý\u0002úóü\u0003úóû\u0004úóû\u0004úóú\u0005öüö\u0004ôù\u0004ôõ\bóÿÿúóù\u0006ö÷\u0004úóø\u0007úó÷\búò\u0001ÿúò\u0000\u0000ó\u0003úôÿÿöüõ\u0005õü\u0000úôþ\u0000úòÿ\u0001öüô\u0006úòþ\u0002öüó\u0007úòþ\u0002úòý\u0003ôþÿúòü\u0004ôü\u0001úòü\u0004úòû\u0005ôþÿúòú\u0006ôü\u0001úòú\u0006úòù\u0007ôü\u0001úòø\bôþÿúòø\búñ\u0002ÿöüò\búñ\u0001\u0000öûüÿúñ\u0001î\u0005íþ\u0001\u00001º÷@çÈ\u0007ø\u0003;É\fîú\u0005õü\nôç\u0011öõî\u0005íþ\u0001\u00001º÷@çÈ\u0007ø\u0003ù\u0000ûüøù\nüà\u0019úôñ\u0000\u001eØó\rî*Ýé\tú\u000eêùü\u0017éð\u0007÷\u0000úö\u0001úõ\u0002úô\u0003úó\u0004úò\u0005úñ\u0006úð\u0007úï\búö\u0001ú÷üÿú÷û\u0000ú÷ú\u0001ú÷ù\u0002ôþÿú÷ø\u0003ú÷÷\u0004ú÷ö\u0005î\bî\böüÿú÷õ\u0006î\bî\böüÿú÷ô\u0007ú÷ó\böûû\u0000öô\u0007úöýÿî\bóÿÿúöü\u0000úöû\u0001úöú\u0002úöú\u0002úöù\u0003öûú\u0001òý\u0002óÿÿúöø\u0004ö÷\u0004úö÷\u0005úöö\u0006úöõ\u0007úöõ\u0007úöô\bôü\u0001úõþÿôþÿúõþÿúõý\u0000öûù\u0002úõü\u0001öûø\u0003úõü\u0001úõû\u0002öûù\u0002úõú\u0003öû÷\u0004úõú÷\u0000úö\u0001úõ\u0002öûö\u0005ö\u0000úô\u0003úó\u0004úò\u0005úñ\u0006úð\u0007úï\bú÷üÿï\u0007ú÷û\u0000ú÷ú\u0001öûô\u0007ú÷ù\u0002ú÷ø\u0003ú÷÷\u0004ú÷ö\u0005úð\u0007ú÷õ\u0006ú÷üÿï\u0007ú÷û\u0000ú÷ô\u0007öûó\bö\u0000ú÷ó\búöýÿúöü\u0000úöû\u0001úð\u0007úöú\u0002ú÷üÿï\u0007ú÷û\u0000úöû\u0001öûó\bö\u0000ú÷ù\u0002úöù\u0003úöø\u0004úö÷\u0005úð\u0007ú÷õ\u0006ú÷üÿï\u0007ú÷û\u0000úöö\u0006öúýÿúöõ\u0007öúýÿúöô\búõþÿõü\u0000úõý\u0000ôû\u0002õü\u0000úõü\u0001öû\u0000úõû\u0002î\bö÷\u0004õü\u0000úñ\u0006úõú\u0003öúü\u0000ôõ\bóÿÿúõù\u0004ö÷\u0004úõø\u0005úõ÷\u0006úõö\u0007úõö\u0007úõõ\böúû\u0001òø\u0007óÿÿúôÿÿî\bóÿÿúôþ\u0000úôý\u0001úôü\u0002úôü\u0002úõú\u0003öúú\u0002òø\u0007óÿÿúõù\u0004ö÷\u0004úôû\u0003úôú\u0004úôù\u0005úôù\u0005úôø\u0006ôþÿúô÷\u0007ôü\u0001úô÷\u0007úôö\bôü\u0001úó\u0000ÿôþÿúó\u0000\u0004æ\u0010.´ü\u0006ø9×ìî\u0005ðý\u0004èÿ&Öõ÷\u0000úö\u0001úõ\u0002úô\u0003ï\u0007úó\u0004ó\u0003ôü\u0001úò\u0005úñ\u0006ôû\u0002õü\u0000úð\u0007öû\u0000úï\bú÷üÿöúù\u0003öù\u0002öø\u0003ú÷û\u0000î\bóÿÿú÷ú\u0001ú÷ù\u0002ú÷ø\u0003ú÷ø\u0003ú÷÷\u0004õø\u0004öù\u0002öø\u0003ú÷ö\u0005î\bóÿÿú÷õ\u0006ú÷ô\u0007ú÷ó\búöýÿöû\u0000öúø\u0004úï\búöü\u0000öú÷\u0005úöû\u0001ïü\u0006úöû÷\u0000ó\u0003ö\u0000úö\u0001öúö\u0006ó\u0003öúõ\u0007úõ\u0002úô\u0003òú\u0005óÿÿõü\u0000úó\u0004öû\u0000úò\u0005úñ\u0006öúô\böø\u0003úð\u0007ö÷\u0004úï\bú÷üÿú÷û\u0000ú÷û÷\u0000ó\u0003úö\u0001úõ\u0002úô\u0003úó\u0004úò\u0005ó\u0003ö\u0000úñ\u0006ö\u0000úð\u0007úï\bú÷üÿôþÿú÷û\u0000ôü\u0001ú÷û\u0000ú÷ú\u0001ú÷ù\u0002ú÷ø\u0003ö\u0000ú÷÷\u0004ö\u0000ú÷ö\u0005ú÷õ\u0006ú÷ô\u0007ôþÿú÷ó\bôü\u0001úöýÿúöü\u0000úöû\u0001úöú\u0002úöù\u0003õü\u0000úöø\u0004úö÷\u0005öùý\u0000úöö\u0006öùü\u0001úöõ\u0007õü\u0000ðþ\u0003úöô\bõü\u0000úõþÿõü\u0000úõý\u0000úõü\u0001úõû\u0002ï\u0007úõú\u0003ó\u0003ôü\u0001úõù\u0004úõø\u0005úõ÷\u0006î\bö÷\u0004õü\u0000úõö\u0007öû\u0000úõ÷\u0006òú\u0005óÿÿõü\u0000úõõ\bî\bî\bóÿÿõü\u0000ú÷ó\búôÿÿöùû\u0002öø\u0003úôþ\u0000ö÷\u0004úôý\u0001úôü\u0002úôû\u0003úôû\u0003úôú\u0004öùú\u0003óù\u0005öô\u0007úôù\u0005î\bóÿÿúôø\u0006úô÷\u0007úôö\búôö\búôú\u0004öùù\u0004ôù\u0004öô\u0007úôù\u0005î\bóÿÿúó\u0000ÿúóÿ\u0000úóþ\u0001úóþ\u0001úóý\u0002ôü\u0001úóü\u0003ôþÿúóü\u0003úóû\u0004öû÷\u0004úóú\u0005î\u0003\u0000úóú\u0005úóù\u0006öùø\u0005úóø\u0007öûù\u0002úóøýì\u001cëìþþû%Üê'àøú\u001cÊþ\fè\u0006õüî\u0005íþ\u0001\u00001º÷@ÙÙþ\u0007ùíûýì(Ù\u0000\u0019Òø\u001fèï\u0003ýì\u001fêùó\u0001ü\u000fÜ÷\u0005ð\u0006õü\u0015Ö\u0004\u0006ýì\u001bçñ\bÿø\u000fÙ\u0004õø\u0004ðöýì\u001fêùó\u0001ü\u000fÜ÷\u0005ð\u0006õü&Öúø\u0003÷\u0000úö\u0001òú\u0005óÿÿõü\u0000úõ\u0002öû\u0000úô\u0003úó\u0004öù÷\u0006ôù\u0004ôõ\bóÿÿúò\u0005î\bóÿÿúñ\u0006úð\u0007úï\bú÷üÿöû\u0000õýÿöùö\u0007õü\u0000úô\u0003ú÷û\u0000ôþÿú÷ú\u0001ôü\u0001ú÷ú÷\u0000úö\u0001úõ\u0002úô\u0003úó\u0004úò\u0005úñ\u0006ôü\u0001öùõ\búð\u0007öøÿÿúï\böøþ\u0000ú÷üÿðþ\u0003ðý\u0004öøý\u0001ú÷û\u0000öøü\u0002ú÷ú\u0001ú÷ù\u0002ú÷ø\u0003öøû\u0003öøú\u0004ú÷÷\u0004ú÷ö\u0005ú÷õ\u0006ú÷ô\u0007óû\u0003ú÷ó\búöýÿúöü\u0000úöû\u0001úöú\u0002öøû\u0003öøù\u0005ôü\u0001îý\u0006úöù\u0003îü\u0007úöø\u0004úö÷\u0005úöö\u0006öøø\u0006öø÷\u0007öøö\búöõ\u0007ú÷÷\u0004úöô\búõþÿúõý\u0000ö÷\u0000ÿúöö\u0006öüø\u0002úõü\u0001úö\u0001ö÷ÿ\u0000úõû\u0002úõú\u0003ôû\u0002õü\u0000úõù\u0004ôû\u0002õü\u0000úöù\u0003öû\u0000úõú\u0003úõø\u0005ö÷þ\u0001òø\u0007óÿÿúõ÷\u0006ö÷\u0004úõö\u0007úõõ\búôÿÿúôÿÿúõø\u0005ö÷ý\u0002òø\u0007óÿÿúõ÷\u0006ö÷\u0004úôþ\u0000úôý\u0001úôü\u0002úôü\u0002úôû\u0003ôþÿúôú\u0004ôü\u0001úôú\u0004úôù\u0005ö÷ü\u0003úôø\u0006ö÷û\u0004úôø\u0006úô÷\u0007ôü\u0001úôö\bôþÿúôöî\u0005íþ\u0001\u00001³\bÿéDâÐ\fæ\bðöýì.Úêÿþòü\n\u0019Ð\fæ\bðöýì*Ô\u0006ìø\tü\u001cÎö\u001cæ÷\u0003ô\u0006ìø\tü\rèÿðó\u0006÷\u0003\u0004æ\u0010.Àõ<ãØø\u0002è\nñúüñ*Öò\býê\u0000øô÷\u0000öúýÿúö\u0001úõ\u0002î\bî\bóÿÿõü\u0000úô\u0003öû\u0000úó\u0004úò\u0005ö÷ú\u0005ôõ\bóÿÿúñ\u0006ö÷\u0004úð\u0007úï\bú÷üÿú÷û\u0000öû\u0000ö÷ù\u0006î\u0003\u0000òû\u0004úó\u0004úò\u0005ö÷ø\u0007öô\u0007úñ\u0006î\bóÿÿú÷ú\u0001ú÷ù\u0002ú÷ø\u0003ú÷û\u0000ó\u0003ö\u0000úö\u0001ö÷÷\bî\u0003\u0000ô÷\u0006õü\u0000úõ\u0002ú÷÷\u0004ôü\u0001ú÷ö\u0005ôþÿú÷ö\u0005ú÷õ\u0006öö\u0001ÿú÷ô\u0007õú\u0002ú÷ô÷\u0000ó\u0003ôþÿúö\u0001úõ\u0002ôû\u0002õü\u0000úô\u0003öû\u0000úó\u0004úò\u0005öö\u0000\u0000öô\u0007úñ\u0006ö÷\u0004úð\u0007úï\bú÷üÿú÷üÿú÷û\u0000ööÿ\u0001öù\u0002öø\u0003ú÷ú\u0001î\bóÿÿú÷ù\u0002ú÷ø\u0003ú÷÷\u0004ööþ\u0002úö\u0001úõ\u0002ú÷ö\u0005ööý\u0003ú÷õ\u0006öüó\u0007ú÷õ÷\u0000úö\u0001úõ\u0002úô\u0003ï\u0007úó\u0004úò\u0005úñ\u0006î\bî\böüÿúð\u0007öû\u0000úï\bú÷üÿööü\u0004öô\u0007ú÷û\u0000î\bóÿÿú÷ú\u0001ú÷ù\u0002ú÷ø\u0003ú÷÷\u0004öû\u0000õýÿú÷ö\u0005õü\u0000úï\bú÷õ\u0006ööû\u0005ôõ\bóÿÿú÷ô\u0007î\bóÿÿú÷ó\búöýÿúöü\u0000ú÷÷\u0004úö\u0001úõ\u0002úô\u0003ï\u0007úó\u0004úò\u0005ööú\u0006î\u0003\u0000ô÷\u0006õü\u0000úñ\u0006úöû\u0001ôü\u0001úöú\u0002ôþÿúöú\u0002úöù\u0003ööù\u0007úöø\u0004õ÷\u0005úöø".getBytes("ISO-8859-1"), 0, bArr, 0, 5183);
        f40672l = bArr;
        m = 164;
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0027  */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0027
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void o(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 44
            int r0 = 805 - r8
            byte[] r1 = com.facetec.sdk.bn.f40672l
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r8 = 804 - r8
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r7
            r7 = r6
            goto L34
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L34:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-5)
            r8 = r9
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bn.o(short, byte, short, java.lang.Object[]):void");
    }

    private static void p(int[] iArr, int i10, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        gx gxVar = new gx();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = f40667g;
        int i11 = 36774;
        float f6 = 0.0f;
        int i12 = 835167305;
        int i13 = 16;
        int i14 = 1;
        int i15 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i16 = 0;
            while (i16 < length2) {
                try {
                    Object[] objArr2 = new Object[i14];
                    objArr2[i15] = Integer.valueOf(iArr3[i16]);
                    Map map = bp.f40694x;
                    Object method = map.get(Integer.valueOf(i12));
                    if (method == null) {
                        Class cls = (Class) bp.a((ViewConfiguration.getKeyRepeatDelay() >> i13) + 24, 766 - (AudioTrack.getMaxVolume() > f6 ? 1 : (AudioTrack.getMaxVolume() == f6 ? 0 : -1)), (char) (ExpandableListView.getPackedPositionChild(0L) + i11));
                        byte b10 = (byte) i15;
                        byte b11 = b10;
                        Object[] objArr3 = new Object[1];
                        s(b10, b11, b11, objArr3);
                        method = cls.getMethod((String) objArr3[0], Integer.TYPE);
                        map.put(835167305, method);
                    }
                    iArr4[i16] = ((Integer) ((Method) method).invoke(null, objArr2)).intValue();
                    i16++;
                    i11 = 36774;
                    f6 = 0.0f;
                    i12 = 835167305;
                    i13 = 16;
                    i14 = 1;
                    i15 = 0;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        throw th2;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = f40667g;
        if (iArr6 != null) {
            int i17 = $11 + 65;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i18 = 0;
            while (i18 < length) {
                int i19 = $11 + 105;
                $10 = i19 % 128;
                int i20 = i19 % 2;
                Object[] objArr4 = {Integer.valueOf(iArr6[i18])};
                Map map2 = bp.f40694x;
                Object method2 = map2.get(835167305);
                if (method2 == null) {
                    Class cls2 = (Class) bp.a((ViewConfiguration.getTouchSlop() >> 8) + 24, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 765, (char) (36774 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))));
                    byte b12 = (byte) 0;
                    byte b13 = b12;
                    Object[] objArr5 = new Object[1];
                    s(b12, b13, b13, objArr5);
                    method2 = cls2.getMethod((String) objArr5[0], Integer.TYPE);
                    map2.put(835167305, method2);
                }
                iArr2[i18] = ((Integer) ((Method) method2).invoke(null, objArr4)).intValue();
                i18++;
                int i21 = $10 + 39;
                $11 = i21 % 128;
                int i22 = i21 % 2;
                iArr6 = iArr6;
                length = length;
            }
            int i23 = $11 + 75;
            $10 = i23 % 128;
            int i24 = i23 % 2;
            iArr6 = iArr2;
        }
        char c10 = 0;
        System.arraycopy(iArr6, 0, iArr5, 0, length3);
        gxVar.f41838c = 0;
        while (true) {
            int i25 = gxVar.f41838c;
            if (i25 >= iArr.length) {
                objArr[0] = new String(cArr2, 0, i10);
                return;
            }
            int i26 = iArr[i25];
            char c11 = (char) (i26 >> 16);
            cArr[c10] = c11;
            char c12 = (char) i26;
            cArr[1] = c12;
            char c13 = (char) (iArr[i25 + 1] >> 16);
            cArr[2] = c13;
            char c14 = (char) iArr[i25 + 1];
            cArr[3] = c14;
            gxVar.f41839d = (c11 << 16) + c12;
            gxVar.f41837a = (c13 << 16) + c14;
            gx.b(iArr5);
            int i27 = 0;
            for (int i28 = 16; i27 < i28; i28 = 16) {
                int i29 = gxVar.f41839d ^ iArr5[i27];
                gxVar.f41839d = i29;
                Object[] objArr6 = {gxVar, Integer.valueOf(gx.e(i29)), gxVar, gxVar};
                Map map3 = bp.f40694x;
                Object method3 = map3.get(147461875);
                if (method3 == null) {
                    Class cls3 = (Class) bp.a(Color.rgb(0, 0, 0) + 16777239, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1024, (char) (((Process.getThreadPriority(0) + 20) >> 6) + 38453));
                    byte length4 = (byte) $$d.length;
                    byte b14 = (byte) (length4 - 4);
                    Object[] objArr7 = new Object[1];
                    s(length4, b14, b14, objArr7);
                    method3 = cls3.getMethod((String) objArr7[0], Object.class, Integer.TYPE, Object.class, Object.class);
                    map3.put(147461875, method3);
                }
                int iIntValue = ((Integer) ((Method) method3).invoke(null, objArr6)).intValue();
                gxVar.f41839d = gxVar.f41837a;
                gxVar.f41837a = iIntValue;
                i27++;
            }
            int i30 = gxVar.f41839d;
            int i31 = gxVar.f41837a;
            int i32 = i30 ^ iArr5[16];
            gxVar.f41837a = i32;
            int i33 = i31 ^ iArr5[17];
            gxVar.f41839d = i33;
            cArr[0] = (char) (i33 >>> 16);
            cArr[1] = (char) i33;
            cArr[2] = (char) (i32 >>> 16);
            cArr[3] = (char) i32;
            gx.b(iArr5);
            int i34 = gxVar.f41838c;
            cArr2[i34 * 2] = cArr[0];
            cArr2[(i34 * 2) + 1] = cArr[1];
            cArr2[(i34 * 2) + 2] = cArr[2];
            cArr2[(i34 * 2) + 3] = cArr[3];
            Object[] objArr8 = {gxVar, gxVar};
            Map map4 = bp.f40694x;
            Object method4 = map4.get(-1856717708);
            if (method4 == null) {
                Class cls4 = (Class) bp.a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 23, TextUtils.lastIndexOf("", '0', 0) + 790, (char) (View.resolveSize(0, 0) + 26624));
                byte b15 = (byte) 3;
                byte b16 = (byte) (b15 - 3);
                Object[] objArr9 = new Object[1];
                s(b15, b16, b16, objArr9);
                method4 = cls4.getMethod((String) objArr9[0], Object.class, Object.class);
                map4.put(-1856717708, method4);
            }
            ((Method) method4).invoke(null, objArr8);
            c10 = 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x022c  */
    /* JADX WARN: Code duplicated, block: B:48:0x022d  */
    private static void q(char c10, int i10, int i11, Object[] objArr) throws Throwable {
        Throwable cause;
        gt gtVar = new gt();
        long[] jArr = new long[i11];
        gtVar.f41826d = 0;
        while (true) {
            int i12 = gtVar.f41826d;
            if (i12 >= i11) {
                break;
            }
            int i13 = $11 + 69;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr2 = {Integer.valueOf(f40668h[i10 + i12])};
                Map map = bp.f40694x;
                Object method = map.get(-167668390);
                if (method == null) {
                    method = ((Class) bp.a(25 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 245 - TextUtils.getOffsetAfter("", 0), (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))))).getMethod("d", Integer.TYPE);
                    map.put(-167668390, method);
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) method).invoke(null, objArr2)).longValue()), Long.valueOf(gtVar.f41826d), Long.valueOf(f40666f), Integer.valueOf(c10)};
                Object method2 = map.get(-1565725271);
                if (method2 == null) {
                    Class cls = (Class) bp.a((Process.myPid() >> 22) + 24, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1673, (char) (View.MeasureSpec.getSize(0) + 58390));
                    byte b10 = (byte) 0;
                    Object[] objArr4 = new Object[1];
                    s((byte) 22, b10, b10, objArr4);
                    String str = (String) objArr4[0];
                    Class<?> cls2 = Long.TYPE;
                    method2 = cls.getMethod(str, cls2, cls2, cls2, Integer.TYPE);
                    map.put(-1565725271, method2);
                }
                jArr[i12] = ((Long) ((Method) method2).invoke(null, objArr3)).longValue();
                Object[] objArr5 = {gtVar, gtVar};
                Object method3 = map.get(453950717);
                if (method3 == null) {
                    method3 = ((Class) bp.a(TextUtils.indexOf("", "", 0, 0) + 24, 269 - KeyEvent.normalizeMetaState(0), (char) (25686 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))))).getMethod("b", Object.class, Object.class);
                    map.put(453950717, method3);
                }
                ((Method) method3).invoke(null, objArr5);
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
        char[] cArr = new char[i11];
        gtVar.f41826d = 0;
        while (true) {
            int i15 = gtVar.f41826d;
            if (i15 >= i11) {
                objArr[0] = new String(cArr);
                return;
            }
            int i16 = $10 + 23;
            $11 = i16 % 128;
            if (i16 % 2 == 0) {
                cArr[i15] = (char) jArr[i15];
                Object[] objArr6 = {gtVar, gtVar};
                Map map2 = bp.f40694x;
                Object method4 = map2.get(453950717);
                if (method4 == null) {
                    method4 = ((Class) bp.a(24 - (ViewConfiguration.getLongPressTimeout() >> 16), (Process.myTid() >> 22) + 269, (char) (25686 - ((Process.getThreadPriority(0) + 20) >> 6)))).getMethod("b", Object.class, Object.class);
                    map2.put(453950717, method4);
                }
                ((Method) method4).invoke(null, objArr6);
                throw null;
            }
            cArr[i15] = (char) jArr[i15];
            Object[] objArr7 = {gtVar, gtVar};
            Map map3 = bp.f40694x;
            Object method5 = map3.get(453950717);
            if (method5 == null) {
                method5 = ((Class) bp.a(24 - TextUtils.getOffsetBefore("", 0), 269 - KeyEvent.keyCodeFromString(""), (char) (25686 - KeyEvent.normalizeMetaState(0)))).getMethod("b", Object.class, Object.class);
                map3.put(453950717, method5);
            }
            ((Method) method5).invoke(null, objArr7);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0023  */
    /* JADX WARN: Code duplicated, block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0023
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void r(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 97
            byte[] r0 = com.facetec.sdk.bn.$$a
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r7 = r7 * 3
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L15
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r8 = r8 + 1
            int r7 = r7 + r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bn.r(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0028  */
    /* JADX WARN: Code duplicated, block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x0036). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x0028
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void s(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.facetec.sdk.bn.$$d
            int r7 = 121 - r7
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r9 = r9 * 3
            int r1 = 1 - r9
            byte[] r1 = new byte[r1]
            r2 = 0
            int r9 = 0 - r9
            if (r0 != 0) goto L1a
            r7 = r8
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r10
            r10 = r9
            goto L36
        L1a:
            r3 = r2
        L1b:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
            r6 = r10
            r10 = r9
            r9 = r4
            r4 = r3
            r3 = r1
            r1 = r0
            r0 = r6
        L36:
            int r8 = r8 + r9
            int r7 = r7 + 1
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.bn.s(short, int, byte, java.lang.Object[]):void");
    }

    private static /* synthetic */ Object a(Object[] objArr) throws Throwable {
        Object obj;
        char c10 = 0;
        dk dkVar = new dk((Context) objArr[0], (String) objArr[1], (Exception) objArr[2]);
        byte[] bArr = f40672l;
        byte b10 = bArr[10];
        Object[] objArr2 = new Object[1];
        o((short) 433, b10, (short) (b10 | 626), objArr2);
        String str = (String) objArr2[0];
        int i10 = m;
        byte b11 = bArr[5];
        Object[] objArr3 = new Object[1];
        o((short) (i10 | 25), b11, (short) (b11 | DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE), objArr3);
        try {
            Object[] objArr4 = {(String) objArr3[0]};
            char c11 = 2018;
            short s4 = (short) 789;
            Object[] objArr5 = new Object[1];
            o((short) (i10 | 25), (byte) (-bArr[2018]), s4, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            o((short) 204, (byte) (bArr[3] - 1), (short) StatusCode.SUCCESS, objArr6);
            String str2 = (String) objArr6[0];
            Object[] objArr7 = new Object[1];
            o((short) (i10 | 25), (byte) (-bArr[2018]), s4, objArr7);
            Object[] objArr8 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr7[0])).invoke(str, objArr4);
            int[] iArr = new int[objArr8.length];
            int i11 = 0;
            while (i11 < objArr8.length) {
                Object[] objArr9 = new Object[1];
                objArr9[c10] = objArr8[i11];
                short s7 = (short) ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY;
                byte[] bArr2 = f40672l;
                short s9 = (short) 788;
                Object[] objArr10 = new Object[1];
                o(s7, (byte) (-bArr2[c11]), s9, objArr10);
                Class<?> cls2 = Class.forName((String) objArr10[c10]);
                Object[] objArr11 = new Object[1];
                o((short) 224, (byte) 74, (short) 798, objArr11);
                String str3 = (String) objArr11[c10];
                int i12 = m;
                Object[] objArr12 = objArr8;
                Object[] objArr13 = new Object[1];
                o((short) (i12 | 25), (byte) (-bArr2[2018]), s4, objArr13);
                Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr13[0])).invoke(null, objArr9);
                Object[] objArr14 = new Object[1];
                o(s7, (byte) (-bArr2[2018]), s9, objArr14);
                Class<?> cls3 = Class.forName((String) objArr14[0]);
                Object[] objArr15 = new Object[1];
                o((short) (i12 | 66), (byte) (bArr2[4670] + 1), (short) 797, objArr15);
                iArr[i11] = ((Integer) cls3.getMethod((String) objArr15[0], null).invoke(objInvoke, null)).intValue();
                i11++;
                objArr8 = objArr12;
                c10 = 0;
                c11 = 2018;
            }
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                switch (dkVar.a(iArr[i13])) {
                    case -28:
                        i14 = 48;
                        break;
                    case -27:
                        dkVar.a(22);
                        i14 = dkVar.f41238a != 18 ? 38 : 15;
                        break;
                    case -26:
                        i13 = 10;
                        break;
                    case -25:
                        i14 = 47;
                        break;
                    case -24:
                        dkVar.a(16);
                        if (dkVar.f41238a == 0) {
                            i14 = 46;
                        }
                        break;
                    case -23:
                        dkVar.f41241d = 1;
                        dkVar.a(5);
                        dkVar.a(7);
                        f40671k = dkVar.f41238a;
                        break;
                    case -22:
                        dkVar.f41241d = f40673n;
                        dkVar.a(3);
                        break;
                    case -21:
                        i13 = 1;
                        break;
                    case -20:
                        i14 = 37;
                        break;
                    case -19:
                        dkVar.a(2);
                        if (dkVar.f41238a == 0) {
                            i14 = 36;
                        }
                        break;
                    case -18:
                        dkVar.f41241d = 1;
                        dkVar.a(5);
                        dkVar.a(7);
                        f40673n = dkVar.f41238a;
                        break;
                    case -17:
                        dkVar.f41241d = f40671k;
                        dkVar.a(3);
                        break;
                    case -16:
                        i13 = 15;
                        break;
                    case -15:
                        i14 = 27;
                        break;
                    case -14:
                        return null;
                    case -13:
                        a();
                        break;
                    case -12:
                        dkVar.f41241d = 3;
                        dkVar.a(5);
                        dkVar.a(6);
                        Context context = (Context) dkVar.f41243f;
                        dkVar.a(6);
                        com.facetec.sdk.e eVar = (com.facetec.sdk.e) dkVar.f41243f;
                        dkVar.a(6);
                        t.c(context, eVar, (String) dkVar.f41243f);
                        break;
                    case -11:
                        dkVar.f41245h = com.facetec.sdk.e.UNEXPECTED_HOOK_CHECK_ERROR;
                        dkVar.a(43);
                        break;
                    case -10:
                        i13 = 24;
                        break;
                    case -9:
                        dkVar.f41241d = 2;
                        dkVar.a(5);
                        dkVar.a(6);
                        Object obj2 = dkVar.f41243f;
                        dkVar.a(6);
                        Object[] objArr16 = {dkVar.f41243f};
                        short s10 = (short) TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS;
                        byte[] bArr3 = f40672l;
                        Object[] objArr17 = new Object[1];
                        o(s10, (byte) (-bArr3[2018]), (short) 791, objArr17);
                        Class<?> cls4 = Class.forName((String) objArr17[0]);
                        Object[] objArr18 = new Object[1];
                        o((short) 645, (byte) (bArr3[202] + 1), (short) ResultCode.ERROR_UPDATER_SSL, objArr18);
                        String str4 = (String) objArr18[0];
                        Object[] objArr19 = new Object[1];
                        o((short) 630, (byte) (-bArr3[2018]), s4, objArr19);
                        dkVar.f41241d = ((Boolean) cls4.getMethod(str4, Class.forName((String) objArr19[0])).invoke(obj2, objArr16)).booleanValue() ? 1 : 0;
                        dkVar.a(3);
                        break;
                    case -8:
                        i13 = 49;
                        break;
                    case -7:
                        i13 = 51;
                        break;
                    case -6:
                        dkVar.a(16);
                        i13 = dkVar.f41238a == 0 ? 9 : i14;
                        break;
                    case -5:
                        dkVar.f41241d = 2;
                        dkVar.a(5);
                        dkVar.a(6);
                        Object obj3 = dkVar.f41243f;
                        dkVar.a(6);
                        Object[] objArr20 = {dkVar.f41243f};
                        short s11 = (short) TypedValues.MotionType.TYPE_QUANTIZE_MOTIONSTEPS;
                        byte[] bArr4 = f40672l;
                        Object[] objArr21 = new Object[1];
                        o(s11, (byte) (-bArr4[2018]), (short) 791, objArr21);
                        Class<?> cls5 = Class.forName((String) objArr21[0]);
                        Object[] objArr22 = new Object[1];
                        o((short) 623, (byte) (-bArr4[2723]), (short) 797, objArr22);
                        String str5 = (String) objArr22[0];
                        Object[] objArr23 = new Object[1];
                        o((short) 630, (byte) (-bArr4[2018]), s4, objArr23);
                        dkVar.f41241d = ((Boolean) cls5.getMethod(str5, Class.forName((String) objArr23[0])).invoke(obj3, objArr20)).booleanValue() ? 1 : 0;
                        dkVar.a(3);
                        break;
                    case -4:
                        obj = f40661a;
                        dkVar.f41245h = obj;
                        dkVar.a(43);
                        break;
                    case -3:
                        dkVar.f41241d = 2;
                        dkVar.a(5);
                        dkVar.a(6);
                        Enum r1 = (Enum) dkVar.f41243f;
                        dkVar.a(7);
                        a$24662222(r1, dkVar.f41238a != 0);
                        break;
                    case -2:
                        obj = ((Class) bp.a(26 - (ViewConfiguration.getFadingEdgeLength() >> 16), ExpandableListView.getPackedPositionGroup(0L), (char) (KeyEvent.getMaxKeyCode() >> 16))).getField("h").get(null);
                        dkVar.f41245h = obj;
                        dkVar.a(43);
                        break;
                    case -1:
                        i13 = 21;
                        break;
                    default:
                        break;
                }
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:62:0x021a A[PHI: r2
      0x021a: PHI (r2v17 int) = 
      (r2v6 int)
      (r2v8 int)
      (r2v9 int)
      (r2v10 int)
      (r2v12 int)
      (r2v13 int)
      (r2v14 int)
      (r2v15 int)
      (r2v5 int)
      (r2v16 int)
      (r2v5 int)
      (r2v5 int)
      (r2v5 int)
      (r2v5 int)
      (r2v5 int)
      (r2v5 int)
     binds: [B:83:0x026d, B:82:0x026a, B:81:0x0268, B:78:0x0256, B:77:0x0253, B:76:0x0251, B:67:0x022e, B:66:0x0229, B:64:0x0224, B:65:0x0226, B:61:0x020b, B:56:0x01f2, B:38:0x01a7, B:32:0x0183, B:26:0x016e, B:20:0x0158] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Failed to find 'out' block for switch in B:18:0x0154. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public static synchronized void b() {
        int i10;
        try {
            dk dkVar = new dk();
            byte[] bArr = f40672l;
            int i11 = 1;
            Object[] objArr = new Object[1];
            o((short) 2778, bArr[10], (short) 592, objArr);
            int i12 = 0;
            String str = (String) objArr[0];
            int i13 = m;
            byte b10 = bArr[5];
            Object[] objArr2 = new Object[1];
            o((short) (i13 | 25), b10, (short) (b10 | DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE), objArr2);
            try {
                Object[] objArr3 = {(String) objArr2[0]};
                char c10 = 2018;
                short s4 = (short) 789;
                Object[] objArr4 = new Object[1];
                o((short) (i13 | 25), (byte) (-bArr[2018]), s4, objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                o((short) 204, (byte) (bArr[3] - 1), (short) StatusCode.SUCCESS, objArr5);
                String str2 = (String) objArr5[0];
                Object[] objArr6 = new Object[1];
                o((short) (i13 | 25), (byte) (-bArr[2018]), s4, objArr6);
                Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
                int[] iArr = new int[objArr7.length];
                int i14 = 0;
                while (i14 < objArr7.length) {
                    Object[] objArr8 = new Object[i11];
                    objArr8[i12] = objArr7[i14];
                    short s7 = (short) ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY;
                    byte[] bArr2 = f40672l;
                    short s9 = (short) 788;
                    Object[] objArr9 = new Object[i11];
                    o(s7, (byte) (-bArr2[c10]), s9, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[i12]);
                    Object[] objArr10 = new Object[i11];
                    o((short) 224, (byte) 74, (short) 798, objArr10);
                    String str3 = (String) objArr10[0];
                    Class<?>[] clsArr = new Class[i11];
                    int i15 = m;
                    dk dkVar2 = dkVar;
                    Object[] objArr11 = objArr7;
                    Object[] objArr12 = new Object[1];
                    o((short) (i15 | 25), (byte) (-bArr2[2018]), s4, objArr12);
                    clsArr[0] = Class.forName((String) objArr12[0]);
                    Object objInvoke = cls2.getMethod(str3, clsArr).invoke(null, objArr8);
                    Object[] objArr13 = new Object[1];
                    o(s7, (byte) (-bArr2[2018]), s9, objArr13);
                    Class<?> cls3 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    o((short) (i15 | 66), (byte) (bArr2[4670] + 1), (short) 797, objArr14);
                    iArr[i14] = ((Integer) cls3.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                    i14++;
                    i12 = 0;
                    dkVar = dkVar2;
                    i11 = 1;
                    c10 = 2018;
                    objArr7 = objArr11;
                }
                dk dkVar3 = dkVar;
                int i16 = i12;
                int i17 = i16;
                while (true) {
                    int i18 = i17 + 1;
                    dkVar3 = dkVar3;
                    int i19 = 17;
                    switch (dkVar3.a(iArr[i17])) {
                        case -34:
                            i18 = 56;
                            i17 = i18;
                            break;
                        case -33:
                            dkVar3.a(22);
                            i18 = dkVar3.f41238a != 55 ? 17 : 36;
                            i17 = i18;
                            break;
                        case -32:
                            i18 = 51;
                            i17 = i18;
                            break;
                        case -31:
                            dkVar3.a(22);
                            i18 = dkVar3.f41238a != 46 ? 9 : 26;
                            i17 = i18;
                            break;
                        case -30:
                            i17 = 46;
                            break;
                        case -29:
                            dkVar3.a(22);
                            int i20 = dkVar3.f41238a;
                            if (i20 != 0 && i20 == 1) {
                                i19 = 9;
                            }
                            i17 = i19;
                            break;
                        case -28:
                            i18 = 14;
                            i17 = i18;
                            break;
                        case -27:
                            i18 = 45;
                            i17 = i18;
                            break;
                        case -26:
                            dkVar3.a(16);
                            if (dkVar3.f41238a == 0) {
                                i18 = 44;
                            }
                            i17 = i18;
                            break;
                        case -25:
                            dkVar3.f41241d = 1;
                            dkVar3.a(5);
                            dkVar3.a(7);
                            f40671k = dkVar3.f41238a;
                            i17 = i18;
                            break;
                        case -24:
                            dkVar3.f41241d = f40673n;
                            dkVar3.a(3);
                            i17 = i18;
                            break;
                        case -23:
                            i17 = 5;
                            break;
                        case -22:
                            i17 = 35;
                            break;
                        case -21:
                            dkVar3.a(2);
                            if (dkVar3.f41238a == 0) {
                                i17 = 34;
                            } else {
                                i17 = i18;
                            }
                            break;
                        case -20:
                            dkVar3.f41241d = 1;
                            dkVar3.a(5);
                            dkVar3.a(7);
                            f40673n = dkVar3.f41238a;
                            i17 = i18;
                            break;
                        case -19:
                            dkVar3.f41241d = f40671k;
                            i10 = 3;
                            dkVar3.a(i10);
                            i17 = i18;
                            break;
                        case -18:
                            i17 = i19;
                            break;
                        case -17:
                            i17 = 1;
                            break;
                        case -16:
                            break;
                        case -15:
                            i17 = 22;
                            break;
                        case -14:
                            dkVar3.f41241d = 1;
                            dkVar3.a(5);
                            dkVar3.a(7);
                            f40669i = dkVar3.f41238a != 0 ? 1 : i16;
                            i17 = i18;
                            break;
                        case -13:
                            i17 = 57;
                            break;
                        case -12:
                            i17 = 59;
                            break;
                        case -11:
                            dkVar3.a(2);
                            if (dkVar3.f41238a == 0) {
                                i17 = 13;
                            } else {
                                i17 = i18;
                            }
                            break;
                        case -10:
                            dkVar3.f41241d = 1;
                            dkVar3.a(5);
                            dkVar3.a(7);
                            dkVar3.f41241d = ch.e(dkVar3.f41238a) ? 1 : 0;
                            i10 = 3;
                            dkVar3.a(i10);
                            i17 = i18;
                            break;
                        case -9:
                            i17 = 47;
                            break;
                        case -8:
                            i17 = 49;
                            break;
                        case -7:
                            dkVar3.a(16);
                            if (dkVar3.f41238a == 0) {
                                i17 = 8;
                            } else {
                                i17 = i18;
                            }
                            break;
                        case -6:
                            dkVar3.f41241d = f40669i ? 1 : 0;
                            i10 = 3;
                            dkVar3.a(i10);
                            i17 = i18;
                            break;
                        case -5:
                            i17 = 52;
                            break;
                        case -4:
                            i17 = 54;
                            break;
                        case -3:
                            dkVar3.a(16);
                            if (dkVar3.f41238a == 0) {
                                i17 = 4;
                            } else {
                                i17 = i18;
                            }
                            break;
                        case -2:
                            dkVar3.f41241d = f40664d;
                            i10 = 3;
                            dkVar3.a(i10);
                            i17 = i18;
                            break;
                        case -1:
                            i17 = 18;
                            break;
                        default:
                            i17 = i18;
                            break;
                    }
                }
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v101 */
    /* JADX WARN: Type inference failed for: r1v102, types: [int] */
    /* JADX WARN: Type inference failed for: r1v145 */
    /* JADX WARN: Type inference failed for: r1v146 */
    /* JADX WARN: Type inference failed for: r1v147 */
    public static void c() throws Throwable {
        Object objNewInstance;
        Long l6;
        ?? BooleanValue;
        dk dkVar = new dk();
        byte[] bArr = f40672l;
        byte b10 = bArr[10];
        int i10 = m;
        Object[] objArr = new Object[1];
        o((short) 4219, b10, (short) (i10 | 266), objArr);
        char c10 = 0;
        String str = (String) objArr[0];
        byte b11 = bArr[5];
        Object[] objArr2 = new Object[1];
        o((short) (i10 | 25), b11, (short) (b11 | DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c11 = 2018;
            short s4 = (short) 789;
            Object[] objArr4 = new Object[1];
            o((short) (i10 | 25), (byte) (-bArr[2018]), s4, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            o((short) 204, (byte) (bArr[3] - 1), (short) StatusCode.SUCCESS, objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            o((short) (i10 | 25), (byte) (-bArr[2018]), s4, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i11 = 0;
            while (i11 < objArr7.length) {
                Object[] objArr8 = new Object[1];
                objArr8[c10] = objArr7[i11];
                short s7 = (short) ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY;
                byte[] bArr2 = f40672l;
                short s9 = (short) 788;
                Object[] objArr9 = new Object[1];
                o(s7, (byte) (-bArr2[c11]), s9, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[c10]);
                Object[] objArr10 = new Object[1];
                o((short) 224, (byte) 74, (short) 798, objArr10);
                String str3 = (String) objArr10[c10];
                int i12 = m;
                Object[] objArr11 = objArr7;
                Object[] objArr12 = new Object[1];
                o((short) (i12 | 25), (byte) (-bArr2[2018]), s4, objArr12);
                Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr12[0])).invoke(null, objArr8);
                Object[] objArr13 = new Object[1];
                o(s7, (byte) (-bArr2[2018]), s9, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                o((short) (i12 | 66), (byte) (bArr2[4670] + 1), (short) 797, objArr14);
                iArr[i11] = ((Integer) cls3.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                i11++;
                objArr7 = objArr11;
                c10 = 0;
                c11 = 2018;
            }
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                switch (dkVar.a(iArr[i13])) {
                    case -49:
                        i14 = 97;
                        break;
                    case -48:
                        dkVar.a(22);
                        int i15 = dkVar.f41238a;
                        i13 = (i15 == 0 || i15 != 1) ? 55 : 28;
                        break;
                    case -47:
                        i14 = 92;
                        break;
                    case -46:
                        dkVar.a(22);
                        int i16 = dkVar.f41238a;
                        i14 = (i16 == 28 || i16 != 68) ? 33 : 55;
                        break;
                    case -45:
                        i14 = 87;
                        break;
                    case -44:
                        dkVar.a(22);
                        i14 = dkVar.f41238a != 0 ? 53 : 67;
                        break;
                    case -43:
                        i14 = 62;
                        break;
                    case -42:
                        i14 = 86;
                        break;
                    case -41:
                        dkVar.a(2);
                        if (dkVar.f41238a == 0) {
                            i14 = 85;
                        }
                        break;
                    case -40:
                        i14 = 51;
                        break;
                    case -39:
                        i14 = 76;
                        break;
                    case -38:
                        dkVar.a(2);
                        if (dkVar.f41238a == 0) {
                            i14 = 75;
                        }
                        break;
                    case -37:
                        dkVar.f41241d = 1;
                        dkVar.a(5);
                        dkVar.a(7);
                        f40673n = dkVar.f41238a;
                        break;
                    case -36:
                        dkVar.f41241d = f40671k;
                        dkVar.a(3);
                        break;
                    case -35:
                        i13 = 1;
                        break;
                    case -34:
                        return;
                    case -33:
                        dkVar.f41241d = 2;
                        dkVar.a(5);
                        dkVar.a(6);
                        Enum r4 = (Enum) dkVar.f41243f;
                        dkVar.a(7);
                        a$24662222(r4, dkVar.f41238a != 0);
                        break;
                    case -32:
                        i14 = 77;
                        break;
                    case -31:
                        i14 = 88;
                        break;
                    case -30:
                        i14 = 90;
                        break;
                    case -29:
                        dkVar.a(2);
                        if (dkVar.f41238a == 0) {
                            i14 = 50;
                        }
                        break;
                    case -28:
                        dkVar.f41241d = 2;
                        dkVar.a(5);
                        dkVar.a(6);
                        Object obj = dkVar.f41243f;
                        dkVar.a(6);
                        Object[] objArr15 = {obj, dkVar.f41243f};
                        short s10 = (short) 4659;
                        byte[] bArr3 = f40672l;
                        short s11 = (short) 793;
                        Object[] objArr16 = new Object[1];
                        o(s10, (byte) (-bArr3[2018]), s11, objArr16);
                        Class<?> cls4 = Class.forName((String) objArr16[0]);
                        Object[] objArr17 = new Object[1];
                        o(s10, (byte) (-bArr3[2018]), s11, objArr17);
                        Object[] objArr18 = new Object[1];
                        o((short) (m | 25), (byte) (-bArr3[2018]), s4, objArr18);
                        dkVar.f41245h = cls4.getDeclaredConstructor(Class.forName((String) objArr17[0]), Class.forName((String) objArr18[0])).newInstance(objArr15);
                        dkVar.a(43);
                        break;
                    case -27:
                        i13 = 55;
                        break;
                    case -26:
                        i13 = 43;
                        break;
                    case -25:
                        dkVar.a(99);
                        i13 = dkVar.f41238a == 0 ? 42 : i14;
                        break;
                    case -24:
                        i13 = 39;
                        break;
                    case -23:
                        dkVar.f41245h = f40670j;
                        dkVar.a(43);
                        break;
                    case -22:
                        i13 = 93;
                        break;
                    case -21:
                        i13 = 95;
                        break;
                    case -20:
                        dkVar.a(2);
                        if (dkVar.f41238a == 0) {
                            i13 = 32;
                        }
                        break;
                    case -19:
                        dkVar.f41241d = 1;
                        dkVar.a(5);
                        dkVar.a(6);
                        Object obj2 = dkVar.f41243f;
                        short s12 = (short) 4659;
                        byte[] bArr4 = f40672l;
                        Object[] objArr19 = new Object[1];
                        o(s12, (byte) (-bArr4[2018]), (short) 793, objArr19);
                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                        Object[] objArr20 = new Object[1];
                        o((short) 4675, (byte) (bArr4[4670] + 1), (short) 794, objArr20);
                        dkVar.f41241d = ((Boolean) cls5.getMethod((String) objArr20[0], null).invoke(obj2, null)).booleanValue() ? 1 : 0;
                        dkVar.a(3);
                        break;
                    case -18:
                        i13 = 98;
                        break;
                    case -17:
                        i13 = 100;
                        break;
                    case -16:
                        dkVar.a(2);
                        if (dkVar.f41238a == 0) {
                            i13 = 27;
                        }
                        break;
                    case -15:
                        dkVar.f41241d = 1;
                        dkVar.a(5);
                        dkVar.a(6);
                        Object obj3 = dkVar.f41243f;
                        short s13 = (short) 4659;
                        byte[] bArr5 = f40672l;
                        Object[] objArr21 = new Object[1];
                        o(s13, (byte) (-bArr5[2018]), (short) 793, objArr21);
                        Class<?> cls6 = Class.forName((String) objArr21[0]);
                        Object[] objArr22 = new Object[1];
                        o((short) 4670, bArr5[623], (short) 799, objArr22);
                        BooleanValue = ((Boolean) cls6.getMethod((String) objArr22[0], null).invoke(obj3, null)).booleanValue();
                        dkVar.f41241d = BooleanValue;
                        dkVar.a(3);
                        break;
                    case -14:
                        dkVar.f41241d = 1;
                        dkVar.a(5);
                        dkVar.a(6);
                        Object[] objArr23 = {dkVar.f41243f};
                        byte[] bArr6 = f40672l;
                        Object[] objArr24 = new Object[1];
                        o((short) 4659, (byte) (-bArr6[2018]), (short) 793, objArr24);
                        Class<?> cls7 = Class.forName((String) objArr24[0]);
                        Object[] objArr25 = new Object[1];
                        o((short) (m | 25), (byte) (-bArr6[2018]), s4, objArr25);
                        objNewInstance = cls7.getDeclaredConstructor(Class.forName((String) objArr25[0])).newInstance(objArr23);
                        dkVar.f41245h = objNewInstance;
                        dkVar.a(43);
                        break;
                    case -13:
                        dkVar.f41241d = 1;
                        dkVar.a(5);
                        dkVar.a(6);
                        Object obj4 = dkVar.f41243f;
                        short s14 = (short) (m | 25);
                        byte[] bArr7 = f40672l;
                        Object[] objArr26 = new Object[1];
                        o(s14, (byte) (-bArr7[2018]), s4, objArr26);
                        Class<?> cls8 = Class.forName((String) objArr26[0]);
                        Object[] objArr27 = new Object[1];
                        o((short) 1873, (byte) (bArr7[4670] + 1), (short) 799, objArr27);
                        objNewInstance = cls8.getMethod((String) objArr27[0], null).invoke(obj4, null);
                        dkVar.f41245h = objNewInstance;
                        dkVar.a(43);
                        break;
                    case -12:
                        dkVar.f41241d = 3;
                        dkVar.a(5);
                        dkVar.a(7);
                        char c12 = (char) dkVar.f41238a;
                        dkVar.a(7);
                        int i17 = dkVar.f41238a;
                        dkVar.a(7);
                        Object[] objArr28 = new Object[1];
                        q(c12, i17, dkVar.f41238a, objArr28);
                        dkVar.f41245h = (String) objArr28[0];
                        dkVar.a(43);
                        break;
                    case -11:
                        short s15 = (short) 1914;
                        byte[] bArr8 = f40672l;
                        Object[] objArr29 = new Object[1];
                        o(s15, (byte) (bArr8[202] + 1), (short) 783, objArr29);
                        Class<?> cls9 = Class.forName((String) objArr29[0]);
                        Object[] objArr30 = new Object[1];
                        o((short) 4645, bArr8[623], (short) 790, objArr30);
                        l6 = (Long) cls9.getMethod((String) objArr30[0], null).invoke(null, null);
                        dkVar.f41239b = l6.longValue();
                        dkVar.a(65);
                        break;
                    case -10:
                        byte[] bArr9 = f40672l;
                        Object[] objArr31 = new Object[1];
                        o((short) 4040, (byte) (bArr9[202] + 1), (short) 787, objArr31);
                        Class<?> cls10 = Class.forName((String) objArr31[0]);
                        Object[] objArr32 = new Object[1];
                        o((short) 4629, bArr9[885], (short) 788, objArr32);
                        l6 = (Long) cls10.getMethod((String) objArr32[0], null).invoke(null, null);
                        dkVar.f41239b = l6.longValue();
                        dkVar.a(65);
                        break;
                    case -9:
                        dkVar.f41241d = 2;
                        dkVar.a(5);
                        dkVar.a(7);
                        int i18 = dkVar.f41238a;
                        dkVar.a(7);
                        Object[] objArr33 = {Integer.valueOf(i18), Integer.valueOf(dkVar.f41238a)};
                        byte[] bArr10 = f40672l;
                        Object[] objArr34 = new Object[1];
                        o((short) 4593, (byte) (bArr10[202] + 1), (short) 785, objArr34);
                        Class<?> cls11 = Class.forName((String) objArr34[0]);
                        Object[] objArr35 = new Object[1];
                        o((short) 4612, bArr10[885], (short) 787, objArr35);
                        String str4 = (String) objArr35[0];
                        Class<?> cls12 = Integer.TYPE;
                        BooleanValue = ((Integer) cls11.getMethod(str4, cls12, cls12).invoke(null, objArr33)).intValue();
                        dkVar.f41241d = BooleanValue;
                        dkVar.a(3);
                        break;
                    case -8:
                        BooleanValue = 49163;
                        dkVar.f41241d = BooleanValue;
                        dkVar.a(3);
                        break;
                    case -7:
                        i13 = 65;
                        break;
                    case -6:
                        i13 = 7;
                        break;
                    case -5:
                        i13 = 6;
                        break;
                    case -4:
                        dkVar.a(2);
                        if (dkVar.f41238a == 0) {
                            i13 = 5;
                        }
                        break;
                    case -3:
                        dkVar.f41241d = 1;
                        dkVar.a(5);
                        dkVar.a(6);
                        BooleanValue = e$f57910a((Enum) dkVar.f41243f);
                        dkVar.f41241d = BooleanValue;
                        dkVar.a(3);
                        break;
                    case -2:
                        objNewInstance = ((Class) bp.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 26, ImageFormat.getBitsPerPixel(0) + 1, (char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))))).getField("j").get(null);
                        dkVar.f41245h = objNewInstance;
                        dkVar.a(43);
                        break;
                    case -1:
                        i13 = 59;
                        break;
                    default:
                        break;
                }
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public static void d() {
        f40667g = new int[]{1073182626, 633350678, 66953007, 1814124275, 431957351, -998721585, -1469923405, -1185997574, -1359079661, 1329699520, 789350477, -1012476072, -1985534739, 1219283354, -755043270, 585630554, 263854551, 1552942025};
        f40668h = new char[]{32905, 32927, 32923, 40726, 65513, 24195, 48573, 7268, 31501, 55843, 15083, 39380, 63619, 32937, 57424, 16703, 41488, 1002, 25778, 50584, 9591, 34317, 59153, 18680, 43473, 2728, 27254, 52041, 11296, 36105, 61077, 20394, 45197, 4200, 28987, 53853, 13291, 38082, 62849, 21821, 46660, 5921, 30969, 55762, 15026, 39816, 64337, 23676, 16585, 8282, 33079, 25114, 50151, 42225, 1429, 58735, 17995, 10011, 35044, 27087, 11307, 19702, 60821, 3751, 44872, 51216, 26940, 35327, 10997, 19376, 58447, 1398, 42569, 50892, 26616};
        f40666f = -6632631973077524427L;
    }

    private static void e(Context context, int i10) throws Throwable {
        dk dkVar = new dk(context, i10);
        byte[] bArr = f40672l;
        byte b10 = bArr[10];
        Object[] objArr = new Object[1];
        o((short) 3534, b10, (short) (b10 | 730), objArr);
        char c10 = 0;
        String str = (String) objArr[0];
        int i11 = m;
        byte b11 = bArr[5];
        Object[] objArr2 = new Object[1];
        o((short) (i11 | 25), b11, (short) (b11 | DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c11 = 2018;
            short s4 = (short) 789;
            Object[] objArr4 = new Object[1];
            o((short) (i11 | 25), (byte) (-bArr[2018]), s4, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            o((short) 204, (byte) (bArr[3] - 1), (short) StatusCode.SUCCESS, objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            o((short) (i11 | 25), (byte) (-bArr[2018]), s4, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i12 = 0;
            while (i12 < objArr7.length) {
                Object[] objArr8 = new Object[1];
                objArr8[c10] = objArr7[i12];
                short s7 = (short) ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY;
                byte[] bArr2 = f40672l;
                short s9 = (short) 788;
                Object[] objArr9 = new Object[1];
                o(s7, (byte) (-bArr2[c11]), s9, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[c10]);
                Object[] objArr10 = new Object[1];
                o((short) 224, (byte) 74, (short) 798, objArr10);
                String str3 = (String) objArr10[c10];
                int i13 = m;
                Object[] objArr11 = objArr7;
                Object[] objArr12 = new Object[1];
                o((short) (i13 | 25), (byte) (-bArr2[2018]), s4, objArr12);
                Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr12[0])).invoke(null, objArr8);
                Object[] objArr13 = new Object[1];
                o(s7, (byte) (-bArr2[2018]), s9, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                o((short) (i13 | 66), (byte) (bArr2[4670] + 1), (short) 797, objArr14);
                iArr[i12] = ((Integer) cls3.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                i12++;
                c11 = 2018;
                objArr7 = objArr11;
                c10 = 0;
            }
            int i14 = 0;
            while (true) {
                int i15 = i14 + 1;
                switch (dkVar.a(iArr[i14])) {
                    case -11:
                        i15 = 13;
                        i14 = i15;
                        break;
                    case -10:
                        i15 = 23;
                        i14 = i15;
                        break;
                    case -9:
                        dkVar.a(16);
                        if (dkVar.f41238a == 0) {
                            i15 = 22;
                        }
                        i14 = i15;
                        break;
                    case -8:
                        dkVar.f41241d = 1;
                        dkVar.a(5);
                        dkVar.a(7);
                        f40671k = dkVar.f41238a;
                        i14 = i15;
                        break;
                    case -7:
                        dkVar.f41241d = f40673n;
                        dkVar.a(3);
                        i14 = i15;
                        break;
                    case -6:
                        return;
                    case -5:
                        i14 = 1;
                        break;
                    case -4:
                        i15 = 15;
                        i14 = i15;
                        break;
                    case -3:
                        dkVar.f41241d = 3;
                        dkVar.a(5);
                        dkVar.a(6);
                        Context context2 = (Context) dkVar.f41243f;
                        dkVar.a(7);
                        int i16 = dkVar.f41238a;
                        dkVar.a(6);
                        Object[] objArr15 = {context2, Integer.valueOf(i16), dkVar.f41243f};
                        Map map = bp.f40694x;
                        Object method = map.get(1689934722);
                        if (method == null) {
                            Class cls4 = (Class) bp.a(TextUtils.getOffsetAfter("", 0) + 24, 483 - (ViewConfiguration.getFadingEdgeLength() >> 16), (char) (ViewConfiguration.getJumpTapTimeout() >> 16));
                            byte b12 = (byte) 3;
                            byte b13 = (byte) (b12 - 3);
                            Object[] objArr16 = new Object[1];
                            r(b12, b13, b13, objArr16);
                            method = cls4.getMethod((String) objArr16[0], Context.class, Integer.TYPE, (Class) bp.a(TextUtils.indexOf((CharSequence) "", '0') + 32, 569 - (Process.myPid() >> 22), (char) Color.green(0)));
                            map.put(1689934722, method);
                        }
                        ((Method) method).invoke(null, objArr15);
                        i14 = i15;
                        break;
                    case -2:
                        dkVar.f41241d = 2;
                        dkVar.a(5);
                        dkVar.a(6);
                        Context context3 = (Context) dkVar.f41243f;
                        dkVar.a(7);
                        try {
                            Object[] objArr17 = {context3, Integer.valueOf(dkVar.f41238a)};
                            Map map2 = bp.f40694x;
                            Object declaredConstructor = map2.get(-1305832333);
                            if (declaredConstructor == null) {
                                declaredConstructor = ((Class) bp.a(TextUtils.getOffsetAfter("", 0) + 26, View.MeasureSpec.getMode(0) + 26, (char) (ExpandableListView.getPackedPositionGroup(0L) + 54935))).getDeclaredConstructor(Context.class, Integer.TYPE);
                                map2.put(-1305832333, declaredConstructor);
                            }
                            dkVar.f41245h = ((Constructor) declaredConstructor).newInstance(objArr17);
                            dkVar.a(43);
                            i14 = i15;
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                        break;
                    case -1:
                        i14 = 9;
                        break;
                    default:
                        i14 = i15;
                        break;
                }
            }
        } catch (Throwable th3) {
            Throwable cause2 = th3.getCause();
            if (cause2 == null) {
                throw th3;
            }
            throw cause2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0139. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(Context context) throws Throwable {
        int i10;
        dk dkVar = new dk(context);
        byte[] bArr = f40672l;
        Object[] objArr = new Object[1];
        o((short) 4858, bArr[10], (short) 682, objArr);
        int i11 = 0;
        String str = (String) objArr[0];
        int i12 = m;
        byte b10 = bArr[5];
        Object[] objArr2 = new Object[1];
        o((short) (i12 | 25), b10, (short) (b10 | DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c10 = 2018;
            short s4 = (short) 789;
            Object[] objArr4 = new Object[1];
            o((short) (i12 | 25), (byte) (-bArr[2018]), s4, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            o((short) 204, (byte) (bArr[3] - 1), (short) StatusCode.SUCCESS, objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            o((short) (i12 | 25), (byte) (-bArr[2018]), s4, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i13 = 0;
            while (i13 < objArr7.length) {
                Object[] objArr8 = new Object[1];
                objArr8[i11] = objArr7[i13];
                short s7 = (short) ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY;
                byte[] bArr2 = f40672l;
                short s9 = (short) 788;
                Object[] objArr9 = new Object[1];
                o(s7, (byte) (-bArr2[c10]), s9, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[i11]);
                Object[] objArr10 = new Object[1];
                o((short) 224, (byte) 74, (short) 798, objArr10);
                String str3 = (String) objArr10[i11];
                int i14 = m;
                Object[] objArr11 = objArr7;
                Object[] objArr12 = new Object[1];
                o((short) (i14 | 25), (byte) (-bArr2[2018]), s4, objArr12);
                Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr12[0])).invoke(null, objArr8);
                Object[] objArr13 = new Object[1];
                o(s7, (byte) (-bArr2[2018]), s9, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                o((short) (i14 | 66), (byte) (bArr2[4670] + 1), (short) 797, objArr14);
                iArr[i13] = ((Integer) cls3.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                i13++;
                c10 = 2018;
                i11 = 0;
                objArr7 = objArr11;
            }
            int i15 = i11;
            while (true) {
                int i16 = i11 + 1;
                switch (dkVar.a(iArr[i11])) {
                    case -17:
                        i16 = 32;
                        break;
                    case -16:
                        dkVar.a(22);
                        i16 = dkVar.f41238a != 41 ? 1 : 29;
                        break;
                    case -15:
                        i16 = 33;
                        break;
                    case -14:
                        i16 = 35;
                        break;
                    case -13:
                        dkVar.a(2);
                        if (dkVar.f41238a == 0) {
                            i16 = 28;
                        }
                        break;
                    case -12:
                        dkVar.f41241d = 1;
                        dkVar.a(5);
                        dkVar.a(7);
                        f40673n = dkVar.f41238a;
                        break;
                    case -11:
                        i10 = f40671k;
                        dkVar.f41241d = i10;
                        dkVar.a(3);
                        break;
                    case -10:
                        i11 = 8;
                        break;
                    case -9:
                        i11 = 18;
                        break;
                    case -8:
                        dkVar.a(16);
                        i11 = dkVar.f41238a == 0 ? 17 : i16;
                        break;
                    case -7:
                        dkVar.f41241d = 1;
                        dkVar.a(5);
                        dkVar.a(7);
                        f40671k = dkVar.f41238a;
                        break;
                    case -6:
                        i10 = f40673n;
                        dkVar.f41241d = i10;
                        dkVar.a(3);
                        break;
                    case -5:
                        break;
                    case -4:
                        i11 = 19;
                        break;
                    case -3:
                        i11 = 10;
                        break;
                    case -2:
                        dkVar.f41241d = 2;
                        dkVar.a(5);
                        dkVar.a(6);
                        Context context2 = (Context) dkVar.f41243f;
                        dkVar.a(7);
                        a(context2, dkVar.f41238a != 0 ? 1 : i15);
                        break;
                    case -1:
                        i11 = 5;
                        break;
                    default:
                        break;
                }
                return;
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:123:0x064e A[PHI: r2
      0x064e: PHI (r2v27 int) = 
      (r2v7 int)
      (r2v10 int)
      (r2v11 int)
      (r2v12 int)
      (r2v15 int)
      (r2v16 int)
      (r2v19 int)
      (r2v20 int)
      (r2v21 int)
      (r2v22 int)
      (r2v6 int)
      (r2v23 int)
      (r2v24 int)
      (r2v6 int)
      (r2v25 int)
      (r2v6 int)
      (r2v6 int)
      (r2v6 int)
      (r2v6 int)
      (r2v6 int)
      (r2v6 int)
      (r2v6 int)
      (r2v6 int)
      (r2v6 int)
      (r2v6 int)
     binds: [B:150:0x06f3, B:149:0x06ed, B:146:0x06d0, B:145:0x06cc, B:144:0x06c9, B:139:0x06ab, B:137:0x06a5, B:138:0x06a8, B:133:0x068a, B:132:0x0681, B:130:0x067c, B:131:0x067e, B:127:0x0661, B:125:0x065c, B:126:0x065e, B:122:0x063b, B:117:0x0617, B:100:0x05a2, B:81:0x03bb, B:69:0x02eb, B:62:0x02d0, B:46:0x023e, B:40:0x0226, B:25:0x018a, B:19:0x015f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:145:0x06cc  */
    private static synchronized void c(Context context, int i10) {
        int i11;
        int i12;
        int i13;
        Object obj;
        Object obj2;
        try {
            dk dkVar = new dk(context, i10);
            byte[] bArr = f40672l;
            int i14 = 1;
            Object[] objArr = new Object[1];
            o((short) 3607, bArr[10], (short) 394, objArr);
            char c10 = 0;
            String str = (String) objArr[0];
            int i15 = m;
            byte b10 = bArr[5];
            Object[] objArr2 = new Object[1];
            o((short) (i15 | 25), b10, (short) (b10 | DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE), objArr2);
            try {
                Object[] objArr3 = {(String) objArr2[0]};
                char c11 = 2018;
                short s4 = (short) 789;
                Object[] objArr4 = new Object[1];
                o((short) (i15 | 25), (byte) (-bArr[2018]), s4, objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                o((short) 204, (byte) (bArr[3] - 1), (short) StatusCode.SUCCESS, objArr5);
                String str2 = (String) objArr5[0];
                Object[] objArr6 = new Object[1];
                o((short) (i15 | 25), (byte) (-bArr[2018]), s4, objArr6);
                Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
                int[] iArr = new int[objArr7.length];
                int i16 = 0;
                while (i16 < objArr7.length) {
                    Object[] objArr8 = new Object[i14];
                    objArr8[c10] = objArr7[i16];
                    short s7 = (short) ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY;
                    byte[] bArr2 = f40672l;
                    short s9 = (short) 788;
                    Object[] objArr9 = new Object[i14];
                    o(s7, (byte) (-bArr2[c11]), s9, objArr9);
                    Class<?> cls2 = Class.forName((String) objArr9[c10]);
                    Object[] objArr10 = new Object[i14];
                    o((short) 224, (byte) 74, (short) 798, objArr10);
                    String str3 = (String) objArr10[0];
                    Class<?>[] clsArr = new Class[i14];
                    int i17 = m;
                    dk dkVar2 = dkVar;
                    Object[] objArr11 = objArr7;
                    Object[] objArr12 = new Object[1];
                    o((short) (i17 | 25), (byte) (-bArr2[2018]), s4, objArr12);
                    clsArr[0] = Class.forName((String) objArr12[0]);
                    Object objInvoke = cls2.getMethod(str3, clsArr).invoke(null, objArr8);
                    Object[] objArr13 = new Object[1];
                    o(s7, (byte) (-bArr2[2018]), s9, objArr13);
                    Class<?> cls3 = Class.forName((String) objArr13[0]);
                    Object[] objArr14 = new Object[1];
                    o((short) (i17 | 66), (byte) (bArr2[4670] + 1), (short) 797, objArr14);
                    iArr[i16] = ((Integer) cls3.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                    i16++;
                    objArr7 = objArr11;
                    dkVar = dkVar2;
                    c10 = 0;
                    i14 = 1;
                    c11 = 2018;
                }
                dk dkVar3 = dkVar;
                int i18 = 0;
                while (true) {
                    int i19 = i18 + 1;
                    dkVar3 = dkVar3;
                    switch (dkVar3.a(iArr[i18])) {
                        case -58:
                            i19 = 114;
                            i18 = i19;
                            break;
                        case -57:
                            dkVar3.a(22);
                            if (dkVar3.f41238a != 63) {
                                i19 = 21;
                            } else {
                                i19 = 57;
                            }
                            i18 = i19;
                            break;
                        case -56:
                            i19 = 109;
                            i18 = i19;
                            break;
                        case -55:
                            dkVar3.a(22);
                            int i20 = dkVar3.f41238a;
                            if (i20 == 0 || i20 != 55) {
                                i19 = 34;
                            } else {
                                i19 = 57;
                            }
                            i18 = i19;
                            break;
                        case -54:
                            i19 = 104;
                            i18 = i19;
                            break;
                        case -53:
                            dkVar3.a(22);
                            int i21 = dkVar3.f41238a;
                            i19 = (i21 == 0 || i21 != 1) ? 29 : 93;
                            i18 = i19;
                            break;
                        case -52:
                            i19 = 27;
                            i18 = i19;
                            break;
                        case -51:
                            i19 = 103;
                            i18 = i19;
                            break;
                        case -50:
                            dkVar3.a(16);
                            if (dkVar3.f41238a == 0) {
                                i19 = 102;
                            }
                            i18 = i19;
                            break;
                        case -49:
                            i18 = 1;
                            break;
                        case -48:
                            i19 = 92;
                            i18 = i19;
                            break;
                        case -47:
                            dkVar3.a(16);
                            if (dkVar3.f41238a == 0) {
                                i19 = 91;
                            }
                            i18 = i19;
                            break;
                        case -46:
                            dkVar3.f41241d = 1;
                            dkVar3.a(5);
                            dkVar3.a(7);
                            f40671k = dkVar3.f41238a;
                            i18 = i19;
                            break;
                        case -45:
                            dkVar3.f41241d = f40673n;
                            dkVar3.a(3);
                            i18 = i19;
                            break;
                        case -44:
                            i18 = 68;
                            break;
                        case -43:
                            i18 = 81;
                            break;
                        case -42:
                            dkVar3.a(2);
                            if (dkVar3.f41238a == 0) {
                                i18 = 80;
                            } else {
                                i18 = i19;
                            }
                            break;
                        case -41:
                            dkVar3.f41241d = 1;
                            dkVar3.a(5);
                            dkVar3.a(7);
                            f40673n = dkVar3.f41238a;
                            i18 = i19;
                            break;
                        case -40:
                            dkVar3.f41241d = f40671k;
                            i11 = 3;
                            dkVar3.a(i11);
                            i18 = i19;
                            break;
                        case -39:
                            i18 = 57;
                            break;
                        case -38:
                            i18 = 82;
                            break;
                        case -37:
                            break;
                        case -36:
                            i18 = 64;
                            break;
                        case -35:
                            dkVar3.f41241d = 2;
                            dkVar3.a(5);
                            dkVar3.a(6);
                            Context context2 = (Context) dkVar3.f41243f;
                            dkVar3.a(7);
                            a(context2, dkVar3.f41238a != 0);
                            i18 = i19;
                            break;
                        case -34:
                            dkVar3.f41241d = 1;
                            dkVar3.a(5);
                            dkVar3.a(7);
                            f40664d = dkVar3.f41238a;
                            i18 = i19;
                            break;
                        case -33:
                            dkVar3.f41241d = 1;
                            dkVar3.a(5);
                            dkVar3.a(6);
                            dkVar3.f41241d = ((Class) bp.a(26 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 52, (char) Color.alpha(0))).getField("i").getInt(dkVar3.f41243f);
                            i11 = 3;
                            dkVar3.a(i11);
                            i18 = i19;
                            break;
                        case -32:
                            dkVar3.f41245h = ((Class) bp.a((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 25, 52 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (char) Drawable.resolveOpacity(0, 0))).getField("f").get(null);
                            dkVar3.a(43);
                            i18 = i19;
                            break;
                        case -31:
                            dkVar3.f41241d = f40664d;
                            i12 = 3;
                            dkVar3.a(i12);
                            i18 = i19;
                            break;
                        case -30:
                            short s10 = (short) 1914;
                            byte[] bArr3 = f40672l;
                            Object[] objArr15 = new Object[1];
                            o(s10, (byte) (bArr3[202] + 1), (short) 783, objArr15);
                            Class<?> cls4 = Class.forName((String) objArr15[0]);
                            Object[] objArr16 = new Object[1];
                            o((short) 1935, bArr3[623], (short) 785, objArr16);
                            dkVar3.f41239b = ((Long) cls4.getMethod((String) objArr16[0], null).invoke(null, null)).longValue();
                            dkVar3.a(65);
                            i18 = i19;
                            break;
                        case -29:
                            dkVar3.f41241d = 1;
                            dkVar3.a(5);
                            dkVar3.a(130);
                            Object[] objArr17 = {Long.valueOf(dkVar3.f41242e)};
                            byte[] bArr4 = f40672l;
                            Object[] objArr18 = new Object[1];
                            o((short) 2100, (byte) (bArr4[202] + 1), (short) 772, objArr18);
                            Class<?> cls5 = Class.forName((String) objArr18[0]);
                            Object[] objArr19 = new Object[1];
                            o((short) 4105, bArr4[885], (short) 783, objArr19);
                            dkVar3.f41241d = ((Integer) cls5.getMethod((String) objArr19[0], Long.TYPE).invoke(null, objArr17)).intValue();
                            i12 = 3;
                            dkVar3.a(i12);
                            i18 = i19;
                            break;
                        case -28:
                            dkVar3.f41241d = 1;
                            dkVar3.a(5);
                            dkVar3.a(7);
                            Object[] objArr20 = {Integer.valueOf(dkVar3.f41238a)};
                            byte[] bArr5 = f40672l;
                            Object[] objArr21 = new Object[1];
                            o((short) 4040, (byte) (bArr5[202] + 1), (short) 787, objArr21);
                            Class<?> cls6 = Class.forName((String) objArr21[0]);
                            Object[] objArr22 = new Object[1];
                            o((short) 4089, bArr5[885], (short) 788, objArr22);
                            dkVar3.f41241d = ((Integer) cls6.getMethod((String) objArr22[0], Integer.TYPE).invoke(null, objArr20)).intValue();
                            i12 = 3;
                            dkVar3.a(i12);
                            i18 = i19;
                            break;
                        case -27:
                            dkVar3.f41241d = 1;
                            dkVar3.a(5);
                            dkVar3.a(130);
                            Object[] objArr23 = {Long.valueOf(dkVar3.f41242e)};
                            byte[] bArr6 = f40672l;
                            Object[] objArr24 = new Object[1];
                            o((short) 2100, (byte) (bArr6[202] + 1), (short) 772, objArr24);
                            Class<?> cls7 = Class.forName((String) objArr24[0]);
                            Object[] objArr25 = new Object[1];
                            o((short) (m | 3905), bArr6[885], (short) 784, objArr25);
                            dkVar3.f41241d = ((Integer) cls7.getMethod((String) objArr25[0], Long.TYPE).invoke(null, objArr23)).intValue();
                            i12 = 3;
                            dkVar3.a(i12);
                            i18 = i19;
                            break;
                        case -26:
                            dkVar3.f41241d = 1;
                            dkVar3.a(5);
                            dkVar3.a(6);
                            Object[] objArr26 = {dkVar3.f41243f};
                            byte[] bArr7 = f40672l;
                            Object[] objArr27 = new Object[1];
                            o((short) 4040, (byte) (bArr7[202] + 1), (short) 787, objArr27);
                            Class<?> cls8 = Class.forName((String) objArr27[0]);
                            Object[] objArr28 = new Object[1];
                            o((short) 4057, bArr7[885], (short) 792, objArr28);
                            String str4 = (String) objArr28[0];
                            Object[] objArr29 = new Object[1];
                            o((short) (m | 25), (byte) (-bArr7[2018]), s4, objArr29);
                            dkVar3.f41241d = ((Integer) cls8.getMethod(str4, Class.forName((String) objArr29[0])).invoke(null, objArr26)).intValue();
                            i12 = 3;
                            dkVar3.a(i12);
                            i18 = i19;
                            break;
                        case -25:
                            dkVar3.f41245h = "";
                            dkVar3.a(43);
                            i18 = i19;
                            break;
                        case -24:
                            short s11 = (short) (m | 1883);
                            Object[] objArr30 = new Object[1];
                            o(s11, (byte) (s11 & 53), (short) 775, objArr30);
                            Class<?> cls9 = Class.forName((String) objArr30[0]);
                            Object[] objArr31 = new Object[1];
                            o((short) 4017, f40672l[885], (short) 781, objArr31);
                            dkVar3.f41241d = ((Integer) cls9.getMethod((String) objArr31[0], null).invoke(null, null)).intValue();
                            i13 = 3;
                            dkVar3.a(i13);
                            i18 = i19;
                            break;
                        case -23:
                            i18 = 110;
                            break;
                        case -22:
                            i18 = 112;
                            break;
                        case -21:
                            dkVar3.a(2);
                            if (dkVar3.f41238a == 0) {
                                i18 = 33;
                            } else {
                                i18 = i19;
                            }
                            break;
                        case -20:
                            i18 = 73;
                            break;
                        case -19:
                            i18 = 31;
                            break;
                        case -18:
                            i18 = 105;
                            break;
                        case -17:
                            i18 = 107;
                            break;
                        case -16:
                            dkVar3.a(117);
                            if (dkVar3.f41238a == 0) {
                                i18 = 26;
                            } else {
                                i18 = i19;
                            }
                            break;
                        case -15:
                            dkVar3.f41241d = 1;
                            dkVar3.a(5);
                            dkVar3.a(7);
                            Object[] objArr32 = {Integer.valueOf(dkVar3.f41238a)};
                            Map map = bp.f40694x;
                            Object obj3 = map.get(-871979101);
                            if (obj3 != null) {
                                obj = obj3;
                            } else {
                                Class cls10 = (Class) bp.a((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 23, 341 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (char) (ExpandableListView.getPackedPositionType(0L) + 34193));
                                byte b11 = (byte) 3;
                                byte b12 = (byte) (b11 - 3);
                                Object[] objArr33 = new Object[1];
                                r(b11, b12, b12, objArr33);
                                Method method = cls10.getMethod((String) objArr33[0], Integer.TYPE);
                                map.put(-871979101, method);
                                obj = method;
                            }
                            dkVar3.f41241d = ((Integer) ((Method) obj).invoke(null, objArr32)).intValue();
                            i13 = 3;
                            dkVar3.a(i13);
                            i18 = i19;
                            break;
                        case -14:
                            i18 = 115;
                            break;
                        case -13:
                            i18 = 117;
                            break;
                        case -12:
                            dkVar3.a(2);
                            if (dkVar3.f41238a == 0) {
                                i18 = 20;
                            } else {
                                i18 = i19;
                            }
                            break;
                        case -11:
                            i18 = 18;
                            break;
                        case -10:
                            i18 = 16;
                            break;
                        case -9:
                            i18 = 14;
                            break;
                        case -8:
                            dkVar3.a(117);
                            if (dkVar3.f41238a == 0) {
                                i18 = 13;
                            } else {
                                i18 = i19;
                            }
                            break;
                        case -7:
                            dkVar3.f41241d = 2;
                            dkVar3.a(5);
                            dkVar3.a(6);
                            Context context3 = (Context) dkVar3.f41243f;
                            dkVar3.a(7);
                            try {
                                Object[] objArr34 = {context3, Integer.valueOf(dkVar3.f41238a)};
                                Map map2 = bp.f40694x;
                                Object obj4 = map2.get(1655192615);
                                if (obj4 != null) {
                                    obj2 = obj4;
                                } else {
                                    Class cls11 = (Class) bp.a((ViewConfiguration.getTapTimeout() >> 16) + 23, 340 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) (Color.argb(0, 0, 0, 0) + 34193));
                                    byte b13 = (byte) 3;
                                    byte b14 = (byte) (b13 - 3);
                                    Object[] objArr35 = new Object[1];
                                    r(b13, b14, b14, objArr35);
                                    Method method2 = cls11.getMethod((String) objArr35[0], Context.class, Integer.TYPE);
                                    map2.put(1655192615, method2);
                                    obj2 = method2;
                                }
                                dkVar3.f41241d = ((Integer) ((Method) obj2).invoke(null, objArr34)).intValue();
                                i13 = 3;
                                dkVar3.a(i13);
                                i18 = i19;
                            } catch (Throwable th2) {
                                Throwable cause = th2.getCause();
                                if (cause == null) {
                                    throw th2;
                                }
                                throw cause;
                            }
                            break;
                        case -6:
                            i18 = 62;
                            break;
                        case -5:
                            i18 = 7;
                            break;
                        case -4:
                            i18 = 6;
                            break;
                        case -3:
                            dkVar3.a(2);
                            if (dkVar3.f41238a == 0) {
                                i18 = 5;
                            } else {
                                i18 = i19;
                            }
                            break;
                        case -2:
                            dkVar3.f41241d = 1;
                            dkVar3.a(5);
                            dkVar3.a(6);
                            dkVar3.f41241d = e.d((Context) dkVar3.f41243f) ? 1 : 0;
                            i13 = 3;
                            dkVar3.a(i13);
                            i18 = i19;
                            break;
                        case -1:
                            i18 = 58;
                            break;
                        default:
                            i18 = i19;
                            break;
                    }
                }
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 == null) {
                    throw th3;
                }
                throw cause2;
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:107:0x020d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:69:0x01f7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:71:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:73:0x0200 A[ADDED_TO_REGION] */
    public static /* synthetic */ void d(Context context, int i10) throws Throwable {
        dk dkVar = new dk(context, i10);
        byte[] bArr = f40672l;
        byte b10 = bArr[10];
        Object[] objArr = new Object[1];
        o((short) 4685, b10, (short) (b10 | 630), objArr);
        int i11 = 0;
        String str = (String) objArr[0];
        int i12 = m;
        byte b11 = bArr[5];
        Object[] objArr2 = new Object[1];
        o((short) (i12 | 25), b11, (short) (b11 | DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c10 = 2018;
            short s4 = (short) 789;
            Object[] objArr4 = new Object[1];
            o((short) (i12 | 25), (byte) (-bArr[2018]), s4, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            o((short) 204, (byte) (bArr[3] - 1), (short) StatusCode.SUCCESS, objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            o((short) (i12 | 25), (byte) (-bArr[2018]), s4, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i13 = 0;
            while (i13 < objArr7.length) {
                Object[] objArr8 = new Object[1];
                objArr8[i11] = objArr7[i13];
                short s7 = (short) ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY;
                byte[] bArr2 = f40672l;
                short s9 = (short) 788;
                Object[] objArr9 = new Object[1];
                o(s7, (byte) (-bArr2[c10]), s9, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[i11]);
                Object[] objArr10 = new Object[1];
                o((short) 224, (byte) 74, (short) 798, objArr10);
                String str3 = (String) objArr10[i11];
                int i14 = m;
                Object[] objArr11 = objArr7;
                Object[] objArr12 = new Object[1];
                o((short) (i14 | 25), (byte) (-bArr2[2018]), s4, objArr12);
                Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr12[0])).invoke(null, objArr8);
                Object[] objArr13 = new Object[1];
                o(s7, (byte) (-bArr2[2018]), s9, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                o((short) (i14 | 66), (byte) (bArr2[4670] + 1), (short) 797, objArr14);
                iArr[i13] = ((Integer) cls3.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                i13++;
                c10 = 2018;
                i11 = 0;
                objArr7 = objArr11;
            }
            while (true) {
                int i15 = i11 + 1;
                try {
                    switch (dkVar.a(iArr[i11])) {
                        case -18:
                            i11 = 49;
                            break;
                        case -17:
                            dkVar.a(22);
                            int i16 = dkVar.f41238a;
                            i15 = 36;
                            i11 = (i16 == 7 || i16 != 88) ? i15 : 1;
                            break;
                        case -16:
                            i11 = 44;
                            break;
                        case -15:
                            dkVar.a(22);
                            i11 = dkVar.f41238a != 0 ? 21 : 9;
                            break;
                        case -14:
                            i11 = 50;
                            break;
                        case -13:
                            i11 = 52;
                            break;
                        case -12:
                            dkVar.a(2);
                            if (dkVar.f41238a == 0) {
                                i11 = 34;
                            }
                            break;
                        case -11:
                            dkVar.a(19);
                            throw ((Throwable) dkVar.f41243f);
                        case -10:
                            i11 = 45;
                            break;
                        case -9:
                            i11 = 47;
                            break;
                        case -8:
                            dkVar.a(2);
                            if (dkVar.f41238a == 0) {
                                i11 = 19;
                            }
                            break;
                        case -7:
                            dkVar.f41241d = 1;
                            try {
                                dkVar.a(5);
                                dkVar.a(7);
                                f40673n = dkVar.f41238a;
                            } catch (Throwable th2) {
                                th = th2;
                                if (i15 < 22) {
                                    if (i15 >= 39) {
                                    }
                                    throw th;
                                }
                                if (i15 >= 39) {
                                }
                                throw th;
                                dkVar.f41245h = th;
                                dkVar.a(27);
                            }
                            break;
                        case -6:
                            dkVar.f41241d = f40671k;
                            try {
                                dkVar.a(3);
                            } catch (Throwable th3) {
                                th = th3;
                                if (i15 < 22) {
                                    if (i15 >= 39) {
                                    }
                                    throw th;
                                }
                                if (i15 >= 39) {
                                }
                                throw th;
                                dkVar.f41245h = th;
                                dkVar.a(27);
                            }
                            break;
                        case -5:
                            return;
                        case -4:
                            i11 = 26;
                            break;
                        case -3:
                            i11 = 11;
                            break;
                        case -2:
                            dkVar.f41241d = 2;
                            try {
                                dkVar.a(5);
                                dkVar.a(6);
                                Context context2 = (Context) dkVar.f41243f;
                                dkVar.a(7);
                                c(context2, dkVar.f41238a);
                            } catch (Throwable th4) {
                                th = th4;
                                if (i15 < 22 && i15 <= 26) {
                                    i15 = 20;
                                } else {
                                    if (i15 >= 39 || i15 > 44) {
                                        throw th;
                                    }
                                    i15 = 35;
                                }
                                dkVar.f41245h = th;
                                dkVar.a(27);
                            }
                            break;
                        case -1:
                            i11 = 4;
                            break;
                        default:
                            break;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            }
        } catch (Throwable th6) {
            Throwable cause = th6.getCause();
            if (cause == null) {
                throw th6;
            }
            throw cause;
        }
    }

    /* JADX WARN: Code duplicated, block: B:122:0x029d  */
    /* JADX WARN: Code duplicated, block: B:146:0x02f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:198:0x0303 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static synchronized void e(Context context) {
        dk dkVar;
        int i10;
        boolean z10;
        char c10;
        dk dkVar2 = new dk(context);
        byte[] bArr = f40672l;
        byte b10 = bArr[10];
        int i11 = 1;
        Object[] objArr = new Object[1];
        o((short) 3387, b10, (short) (b10 | 656), objArr);
        char c11 = 0;
        String str = (String) objArr[0];
        int i12 = m;
        byte b11 = bArr[5];
        Object[] objArr2 = new Object[1];
        o((short) (i12 | 25), b11, (short) (b11 | DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c12 = 2018;
            short s4 = (short) 789;
            Object[] objArr4 = new Object[1];
            o((short) (i12 | 25), (byte) (-bArr[2018]), s4, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            o((short) 204, (byte) (bArr[3] - 1), (short) StatusCode.SUCCESS, objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            o((short) (i12 | 25), (byte) (-bArr[2018]), s4, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i13 = 0;
            while (i13 < objArr7.length) {
                Object[] objArr8 = new Object[i11];
                objArr8[c11] = objArr7[i13];
                short s7 = (short) ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY;
                byte[] bArr2 = f40672l;
                short s9 = (short) 788;
                Object[] objArr9 = new Object[i11];
                o(s7, (byte) (-bArr2[c12]), s9, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[c11]);
                Object[] objArr10 = new Object[i11];
                o((short) 224, (byte) 74, (short) 798, objArr10);
                String str3 = (String) objArr10[0];
                Class<?>[] clsArr = new Class[i11];
                int i14 = m;
                Object[] objArr11 = objArr7;
                dk dkVar3 = dkVar2;
                Object[] objArr12 = new Object[1];
                o((short) (i14 | 25), (byte) (-bArr2[2018]), s4, objArr12);
                clsArr[0] = Class.forName((String) objArr12[0]);
                Object objInvoke = cls2.getMethod(str3, clsArr).invoke(null, objArr8);
                Object[] objArr13 = new Object[1];
                o(s7, (byte) (-bArr2[2018]), s9, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                o((short) (i14 | 66), (byte) (bArr2[4670] + 1), (short) 797, objArr14);
                iArr[i13] = ((Integer) cls3.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                i13++;
                c12 = 2018;
                dkVar2 = dkVar3;
                objArr7 = objArr11;
                c11 = 0;
                i11 = 1;
            }
            dk dkVar4 = dkVar2;
            int i15 = 0;
            while (true) {
                int i16 = i15 + 1;
                int i17 = 40;
                try {
                    dkVar = dkVar4;
                    try {
                        switch (dkVar.a(iArr[i15])) {
                            case -22:
                                dkVar4 = dkVar;
                                break;
                            case -21:
                                dkVar.a(22);
                                int i18 = dkVar.f41238a;
                                i17 = 37;
                                i15 = (i18 == 29 || i18 != 95) ? i17 : 13;
                                dkVar4 = dkVar;
                                break;
                            case -20:
                                dkVar.a(19);
                                throw ((Throwable) dkVar.f41243f);
                            case -19:
                                i15 = 41;
                                dkVar4 = dkVar;
                                break;
                            case -18:
                                dkVar4 = dkVar;
                                i15 = 43;
                                break;
                            case -17:
                                dkVar.a(2);
                                if (dkVar.f41238a == 0) {
                                    i15 = 35;
                                } else {
                                    i15 = i16;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -16:
                                try {
                                    dkVar.f41241d = 1;
                                    try {
                                        dkVar.a(5);
                                        dkVar.a(7);
                                        f40673n = dkVar.f41238a;
                                        i15 = i16;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (i16 >= 38) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (i16 >= 38) {
                                    }
                                    throw th;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -15:
                                dkVar.f41241d = f40671k;
                                try {
                                    dkVar.a(3);
                                    i15 = i16;
                                } catch (Throwable th4) {
                                    th = th4;
                                    if (i16 >= 38) {
                                    }
                                    throw th;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -14:
                                dkVar4 = dkVar;
                                i15 = 1;
                                break;
                            case -13:
                                dkVar4 = dkVar;
                                i15 = 25;
                                break;
                            case -12:
                                dkVar.a(16);
                                if (dkVar.f41238a == 0) {
                                    i15 = 24;
                                } else {
                                    i15 = i16;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -11:
                                dkVar.f41241d = 1;
                                dkVar.a(5);
                                dkVar.a(7);
                                f40671k = dkVar.f41238a;
                                i15 = i16;
                                dkVar4 = dkVar;
                                break;
                            case -10:
                                dkVar.f41241d = f40673n;
                                i10 = 3;
                                try {
                                    dkVar.a(i10);
                                    i15 = i16;
                                } catch (Throwable th5) {
                                    th = th5;
                                    if (i16 >= 38) {
                                    }
                                    throw th;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -9:
                                break;
                            case -8:
                                i15 = 15;
                                dkVar4 = dkVar;
                                break;
                            case -7:
                                dkVar4 = dkVar;
                                i15 = 26;
                                break;
                            case -6:
                                dkVar.f41241d = 2;
                                dkVar.a(5);
                                dkVar.a(6);
                                Context context2 = (Context) dkVar.f41243f;
                                dkVar.a(7);
                                a(context2, dkVar.f41238a != 0);
                                i15 = i16;
                                dkVar4 = dkVar;
                                break;
                            case -5:
                                z10 = true;
                                try {
                                    dkVar.f41241d = 1;
                                    c10 = 5;
                                    try {
                                        dkVar.a(5);
                                        dkVar.a(7);
                                        f40664d = dkVar.f41238a;
                                        i15 = i16;
                                    } catch (Throwable th6) {
                                        th = th6;
                                        if (i16 >= 38) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    if (i16 >= 38) {
                                    }
                                    throw th;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -4:
                                z10 = true;
                                try {
                                    dkVar.f41241d = 1;
                                    c10 = 5;
                                    try {
                                        dkVar.a(5);
                                        try {
                                            dkVar.a(6);
                                            try {
                                                dkVar.f41241d = ((Class) bp.a(26 - Color.red(0), View.MeasureSpec.getSize(0) + 52, (char) KeyEvent.getDeadChar(0, 0))).getField("i").getInt(dkVar.f41243f);
                                                i10 = 3;
                                                dkVar.a(i10);
                                                i15 = i16;
                                            } catch (Throwable th8) {
                                                th = th8;
                                                if (i16 >= 38) {
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th9) {
                                            th = th9;
                                        }
                                    } catch (Throwable th10) {
                                        th = th10;
                                        if (i16 >= 38 || i16 > 40) {
                                            throw th;
                                        }
                                        dkVar.f41245h = th;
                                        dkVar.a(27);
                                        i15 = 36;
                                    }
                                } catch (Throwable th11) {
                                    th = th11;
                                    if (i16 >= 38) {
                                    }
                                    throw th;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -3:
                                try {
                                    try {
                                        try {
                                            dkVar.f41245h = ((Class) bp.a(TextUtils.indexOf("", "", 0, 0) + 26, (ViewConfiguration.getFadingEdgeLength() >> 16) + 52, (char) (ExpandableListView.getPackedPositionChild(0L) + 1))).getField("b").get(null);
                                            dkVar.a(43);
                                            i15 = i16;
                                        } catch (Throwable th12) {
                                            th = th12;
                                            if (i16 >= 38) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                    }
                                } catch (Throwable th14) {
                                    th = th14;
                                    if (i16 >= 38) {
                                    }
                                    throw th;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -2:
                                dkVar.f41241d = f40664d;
                                try {
                                    dkVar.a(3);
                                    i15 = i16;
                                } catch (Throwable th15) {
                                    th = th15;
                                    if (i16 >= 38) {
                                    }
                                    throw th;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -1:
                                dkVar4 = dkVar;
                                i15 = 10;
                                break;
                            default:
                                i15 = i16;
                                dkVar4 = dkVar;
                                break;
                        }
                    } catch (Throwable th16) {
                        th = th16;
                        if (i16 >= 38) {
                        }
                        throw th;
                    }
                } catch (Throwable th17) {
                    th = th17;
                    dkVar = dkVar4;
                }
            }
        } catch (Throwable th18) {
            Throwable cause = th18.getCause();
            if (cause == null) {
                throw th18;
            }
            throw cause;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:278:0x0671  */
    /* JADX WARN: Code duplicated, block: B:318:0x076e  */
    /* JADX WARN: Code duplicated, block: B:385:0x077d A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:42:0x0185  */
    private static synchronized void a(Context context, boolean z10) {
        int i10;
        char c10;
        int i11;
        int i12;
        dk dkVar = new dk(context, z10 ? 1 : 0);
        byte[] bArr = f40672l;
        Object[] objArr = new Object[1];
        o((short) 2174, bArr[10], (short) 276, objArr);
        char c11 = 0;
        String str = (String) objArr[0];
        int i13 = m;
        byte b10 = bArr[5];
        Object[] objArr2 = new Object[1];
        o((short) (i13 | 25), b10, (short) (b10 | DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c12 = 2018;
            short s4 = (short) 789;
            Object[] objArr4 = new Object[1];
            o((short) (i13 | 25), (byte) (-bArr[2018]), s4, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            o((short) 204, (byte) (bArr[3] - 1), (short) StatusCode.SUCCESS, objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            o((short) (i13 | 25), (byte) (-bArr[2018]), s4, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i14 = 0;
            while (i14 < objArr7.length) {
                Object[] objArr8 = new Object[1];
                objArr8[c11] = objArr7[i14];
                short s7 = (short) ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY;
                byte[] bArr2 = f40672l;
                short s9 = (short) 788;
                Object[] objArr9 = new Object[1];
                o(s7, (byte) (-bArr2[c12]), s9, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[c11]);
                Object[] objArr10 = new Object[1];
                o((short) 224, (byte) 74, (short) 798, objArr10);
                String str3 = (String) objArr10[c11];
                int i15 = m;
                Object[] objArr11 = objArr7;
                Object[] objArr12 = new Object[1];
                o((short) (i15 | 25), (byte) (-bArr2[2018]), s4, objArr12);
                Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr12[0])).invoke(null, objArr8);
                Object[] objArr13 = new Object[1];
                o(s7, (byte) (-bArr2[2018]), s9, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                o((short) (i15 | 66), (byte) (bArr2[4670] + 1), (short) 797, objArr14);
                iArr[i14] = ((Integer) cls3.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                i14++;
                objArr7 = objArr11;
                c11 = 0;
                c12 = 2018;
            }
            int i16 = 0;
            while (true) {
                int i17 = i16 + 1;
                try {
                    switch (dkVar.a(iArr[i16])) {
                        case -71:
                            i16 = 144;
                            break;
                        case -70:
                            dkVar.a(22);
                            if (dkVar.f41238a != 34) {
                                i16 = 59;
                            } else {
                                i16 = 56;
                            }
                            break;
                        case -69:
                            i16 = 139;
                            break;
                        case -68:
                            dkVar.a(22);
                            if (dkVar.f41238a != 0) {
                                i16 = 10;
                            } else {
                                i16 = 59;
                            }
                            break;
                        case -67:
                            i16 = 134;
                            break;
                        case -66:
                            dkVar.a(22);
                            int i18 = dkVar.f41238a;
                            i16 = (i18 == 0 || i18 != 1) ? 119 : 63;
                            break;
                        case -65:
                            i16 = 129;
                            break;
                        case -64:
                            dkVar.a(22);
                            if (dkVar.f41238a != 0) {
                                i16 = 59;
                            } else {
                                i16 = 10;
                            }
                            break;
                        case -63:
                            i16 = 124;
                            break;
                        case -62:
                            dkVar.a(22);
                            int i19 = dkVar.f41238a;
                            i16 = (i19 == 41 || i19 != 75) ? 93 : 5;
                            break;
                        case -61:
                            dkVar.a(19);
                            throw ((Throwable) dkVar.f41243f);
                        case -60:
                            i16 = 135;
                            break;
                        case -59:
                            i16 = 137;
                            break;
                        case -58:
                            dkVar.a(16);
                            if (dkVar.f41238a == 0) {
                                i16 = 117;
                            } else {
                                i16 = i17;
                            }
                            break;
                        case -57:
                            dkVar.f41241d = 1;
                            try {
                                dkVar.a(5);
                                dkVar.a(7);
                                f40671k = dkVar.f41238a;
                                i16 = i17;
                            } catch (Throwable th2) {
                                th = th2;
                                if (i17 >= 121) {
                                }
                                throw th;
                            }
                            break;
                        case -56:
                            dkVar.f41241d = f40673n;
                            dkVar.a(3);
                            i16 = i17;
                            break;
                        case -55:
                            i16 = 20;
                            break;
                        case -54:
                            i16 = 107;
                            break;
                        case -53:
                            dkVar.a(2);
                            if (dkVar.f41238a == 0) {
                                i16 = 106;
                            } else {
                                i16 = i17;
                            }
                            break;
                        case -52:
                            i16 = 140;
                            break;
                        case -51:
                            i16 = 142;
                            break;
                        case -50:
                            dkVar.a(93);
                            if (dkVar.f41238a == 0) {
                                i16 = 97;
                            } else {
                                i16 = i17;
                            }
                            break;
                        case -49:
                            i16 = 125;
                            break;
                        case -48:
                            i16 = 127;
                            break;
                        case -47:
                            dkVar.a(2);
                            if (dkVar.f41238a == 0) {
                                i16 = 92;
                            } else {
                                i16 = i17;
                            }
                            break;
                        case -46:
                            dkVar.f41241d = 1;
                            dkVar.a(5);
                            dkVar.a(7);
                            f40673n = dkVar.f41238a;
                            i16 = i17;
                            break;
                        case -45:
                            dkVar.f41241d = f40671k;
                            i10 = 3;
                            try {
                                dkVar.a(i10);
                                i16 = i17;
                            } catch (Throwable th3) {
                                th = th3;
                                if (i17 >= 121) {
                                }
                                throw th;
                            }
                            break;
                        case -44:
                            i16 = 1;
                            break;
                        case -43:
                            break;
                        case -42:
                            b();
                            i16 = i17;
                            break;
                        case -41:
                            i16 = 74;
                            break;
                        case -40:
                            dkVar.f41241d = 1;
                            dkVar.a(5);
                            dkVar.a(6);
                            d((Context) dkVar.f41243f);
                            i16 = i17;
                            break;
                        case -39:
                            i16 = 66;
                            break;
                        case -38:
                            i16 = 108;
                            break;
                        case -37:
                            dkVar.a(2);
                            if (dkVar.f41238a == 0) {
                                i16 = 62;
                            } else {
                                i16 = i17;
                            }
                            break;
                        case -36:
                            i16 = 145;
                            break;
                        case -35:
                            i16 = 147;
                            break;
                        case -34:
                            dkVar.a(16);
                            if (dkVar.f41238a == 0) {
                                i16 = 55;
                            } else {
                                i16 = i17;
                            }
                            break;
                        case -33:
                            dkVar.f41241d = 1;
                            dkVar.a(5);
                            dkVar.a(7);
                            dkVar.f41241d = ch.e(dkVar.f41238a) ? 1 : 0;
                            i10 = 3;
                            dkVar.a(i10);
                            i16 = i17;
                            break;
                        case -32:
                            i16 = 51;
                            break;
                        case -31:
                            dkVar.a(29);
                            if (dkVar.f41238a == 0) {
                                i16 = 50;
                            } else {
                                i16 = i17;
                            }
                            break;
                        case -30:
                            dkVar.f41241d = 1;
                            dkVar.a(5);
                            dkVar.a(7);
                            f40662b = dkVar.f41238a != 0;
                            i16 = i17;
                            break;
                        case -29:
                            i16 = 16;
                            break;
                        case -28:
                            i16 = 78;
                            break;
                        case -27:
                            dkVar.f41241d = 1;
                            c10 = 5;
                            try {
                                dkVar.a(5);
                                dkVar.a(7);
                                f40664d = dkVar.f41238a;
                                i16 = i17;
                            } catch (Throwable th4) {
                                th = th4;
                                if (i17 >= 121) {
                                }
                                throw th;
                            }
                            break;
                        case -26:
                            try {
                                dkVar.f41241d = 1;
                                c10 = 5;
                                try {
                                    dkVar.a(5);
                                    dkVar.a(6);
                                    try {
                                        dkVar.f41241d = ((Class) bp.a((ViewConfiguration.getScrollDefaultDelay() >> 16) + 26, TextUtils.lastIndexOf("", '0', 0) + 53, (char) Color.green(0))).getField("i").getInt(dkVar.f41243f);
                                        i10 = 3;
                                        dkVar.a(i10);
                                        i16 = i17;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        if (i17 >= 121) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    if (i17 >= 121) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th7) {
                                th = th7;
                            }
                            break;
                        case -25:
                            try {
                                dkVar.f41245h = ((Class) bp.a(TextUtils.getOffsetBefore("", 0) + 26, 52 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1))).getField("d").get(null);
                                dkVar.a(43);
                                i16 = i17;
                            } catch (Throwable th8) {
                                th = th8;
                                if (i17 >= 121) {
                                }
                                throw th;
                            }
                            break;
                        case -24:
                            dkVar.f41241d = f40664d;
                            i11 = 3;
                            try {
                                dkVar.a(i11);
                                i16 = i17;
                            } catch (Throwable th9) {
                                th = th9;
                                if (i17 >= 121) {
                                }
                                throw th;
                            }
                            break;
                        case -23:
                            i16 = 40;
                            break;
                        case -22:
                            i16 = 34;
                            break;
                        case -21:
                            dkVar.a(2);
                            if (dkVar.f41238a == 0) {
                                i16 = 33;
                            } else {
                                i16 = i17;
                            }
                            break;
                        case -20:
                            try {
                                dkVar.f41241d = 2;
                                try {
                                    dkVar.a(5);
                                    dkVar.a(6);
                                    Object obj = dkVar.f41243f;
                                    dkVar.a(6);
                                    try {
                                        Object[] objArr15 = {dkVar.f41243f};
                                        int i20 = m;
                                        short s10 = (short) (i20 | 25);
                                        byte[] bArr3 = f40672l;
                                        try {
                                            Object[] objArr16 = new Object[1];
                                            o(s10, (byte) (-bArr3[2018]), s4, objArr16);
                                            Class<?> cls4 = Class.forName((String) objArr16[0]);
                                            Object[] objArr17 = new Object[1];
                                            o((short) 2769, (byte) (bArr3[3] - 1), (short) 795, objArr17);
                                            String str4 = (String) objArr17[0];
                                            Class<?>[] clsArr = new Class[1];
                                            try {
                                                Object[] objArr18 = new Object[1];
                                                o((short) (i20 | 25), (byte) (-bArr3[2018]), s4, objArr18);
                                                clsArr[0] = Class.forName((String) objArr18[0]);
                                                try {
                                                    dkVar.f41241d = ((Boolean) cls4.getMethod(str4, clsArr).invoke(obj, objArr15)).booleanValue() ? 1 : 0;
                                                    i11 = 3;
                                                    dkVar.a(i11);
                                                    i16 = i17;
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    if (i17 >= 121) {
                                                    }
                                                    throw th;
                                                }
                                            } catch (Throwable th11) {
                                                th = th11;
                                                Throwable cause = th.getCause();
                                                if (cause == null) {
                                                    throw th;
                                                }
                                                throw cause;
                                            }
                                        } catch (Throwable th12) {
                                            th = th12;
                                        }
                                    } catch (Throwable th13) {
                                        th = th13;
                                    }
                                } catch (Throwable th14) {
                                    th = th14;
                                    if (i17 >= 121) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th15) {
                                th = th15;
                            }
                            break;
                        case -19:
                            try {
                                dkVar.f41241d = 1;
                                try {
                                    dkVar.a(5);
                                    dkVar.a(6);
                                    Object obj2 = dkVar.f41243f;
                                    try {
                                        short s11 = (short) (m | 25);
                                        byte[] bArr4 = f40672l;
                                        Object[] objArr19 = new Object[1];
                                        o(s11, (byte) (-bArr4[2018]), s4, objArr19);
                                        Class<?> cls5 = Class.forName((String) objArr19[0]);
                                        try {
                                            Object[] objArr20 = new Object[1];
                                            o((short) 1873, (byte) (bArr4[4670] + 1), (short) 799, objArr20);
                                            try {
                                                dkVar.f41245h = cls5.getMethod((String) objArr20[0], null).invoke(obj2, null);
                                                dkVar.a(43);
                                                i16 = i17;
                                            } catch (Throwable th16) {
                                                th = th16;
                                                if (i17 >= 121) {
                                                }
                                                throw th;
                                            }
                                        } catch (Throwable th17) {
                                            th = th17;
                                            Throwable cause2 = th.getCause();
                                            if (cause2 == null) {
                                                throw th;
                                            }
                                            throw cause2;
                                        }
                                    } catch (Throwable th18) {
                                        th = th18;
                                    }
                                } catch (Throwable th19) {
                                    th = th19;
                                    if (i17 >= 121 || i17 > 124) {
                                        throw th;
                                    }
                                    dkVar.f41245h = th;
                                    dkVar.a(27);
                                    i16 = 118;
                                }
                            } catch (Throwable th20) {
                                th = th20;
                            }
                            break;
                        case -18:
                            dkVar.f41241d = 2;
                            dkVar.a(5);
                            dkVar.a(6);
                            int[] iArr2 = (int[]) dkVar.f41243f;
                            dkVar.a(7);
                            Object[] objArr21 = new Object[1];
                            p(iArr2, dkVar.f41238a, objArr21);
                            dkVar.f41245h = (String) objArr21[0];
                            dkVar.a(43);
                            i16 = i17;
                            break;
                        case -17:
                            short s12 = (short) 1914;
                            try {
                                byte[] bArr5 = f40672l;
                                Object[] objArr22 = new Object[1];
                                o(s12, (byte) (bArr5[202] + 1), (short) 783, objArr22);
                                Class<?> cls6 = Class.forName((String) objArr22[0]);
                                Object[] objArr23 = new Object[1];
                                o((short) 1935, bArr5[623], (short) 785, objArr23);
                                dkVar.f41239b = ((Long) cls6.getMethod((String) objArr23[0], null).invoke(null, null)).longValue();
                                dkVar.a(65);
                                i16 = i17;
                            } catch (Throwable th21) {
                                Throwable cause3 = th21.getCause();
                                if (cause3 == null) {
                                    throw th21;
                                }
                                throw cause3;
                            }
                            break;
                        case -16:
                            dkVar.f41245h = new int[]{-139498618, -704966523};
                            dkVar.a(43);
                            i16 = i17;
                            break;
                        case -15:
                            dkVar.f41241d = 1;
                            try {
                                dkVar.a(5);
                                dkVar.a(6);
                                Object obj3 = dkVar.f41243f;
                                try {
                                    short s13 = (short) (m | 25);
                                    byte[] bArr6 = f40672l;
                                    Object[] objArr24 = new Object[1];
                                    o(s13, (byte) (-bArr6[2018]), s4, objArr24);
                                    Class<?> cls7 = Class.forName((String) objArr24[0]);
                                    Object[] objArr25 = new Object[1];
                                    o((short) 2759, bArr6[3], (short) 794, objArr25);
                                    dkVar.f41245h = cls7.getMethod((String) objArr25[0], null).invoke(obj3, null);
                                    dkVar.a(43);
                                    i16 = i17;
                                } catch (Throwable th22) {
                                    Throwable cause4 = th22.getCause();
                                    if (cause4 == null) {
                                        throw th22;
                                    }
                                    throw cause4;
                                }
                            } catch (Throwable th23) {
                                th = th23;
                                if (i17 >= 121) {
                                }
                                throw th;
                            }
                            break;
                        case -14:
                            i16 = 42;
                            break;
                        case -13:
                            i16 = 98;
                            break;
                        case -12:
                            dkVar.a(99);
                            if (dkVar.f41238a == 0) {
                                i16 = 19;
                            } else {
                                i16 = i17;
                            }
                            break;
                        case -11:
                            i16 = 71;
                            break;
                        case -10:
                            byte[] bArr7 = f40672l;
                            Object[] objArr26 = new Object[1];
                            o((short) 2731, (byte) (bArr7[202] + 1), s4, objArr26);
                            Class<?> cls8 = Class.forName((String) objArr26[0]);
                            Object[] objArr27 = new Object[1];
                            o((short) 2746, bArr7[4033], (short) 791, objArr27);
                            dkVar.f41245h = cls8.getField((String) objArr27[0]).get(null);
                            dkVar.a(43);
                            i16 = i17;
                            break;
                        case -9:
                            i16 = 130;
                            break;
                        case -8:
                            i16 = 132;
                            break;
                        case -7:
                            dkVar.a(93);
                            if (dkVar.f41238a == 0) {
                                i16 = 9;
                            } else {
                                i16 = i17;
                            }
                            break;
                        case -6:
                            byte[] bArr8 = f40672l;
                            Object[] objArr28 = new Object[1];
                            o((short) 2702, (byte) (bArr8[202] + 1), (short) 781, objArr28);
                            try {
                                Class<?> cls9 = Class.forName((String) objArr28[0]);
                                Object[] objArr29 = new Object[1];
                                o((short) (m | 2561), bArr8[4033], (short) 798, objArr29);
                                try {
                                    try {
                                        dkVar.f41241d = cls9.getField((String) objArr29[0]).getInt(null);
                                        i12 = 3;
                                        try {
                                            dkVar.a(i12);
                                            i16 = i17;
                                        } catch (Throwable th24) {
                                            th = th24;
                                            if (i17 >= 121) {
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th25) {
                                        th = th25;
                                        if (i17 >= 121) {
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th26) {
                                    th = th26;
                                    if (i17 >= 121) {
                                    }
                                    throw th;
                                }
                            } catch (Throwable th27) {
                                th = th27;
                            }
                            break;
                        case -5:
                            i16 = 59;
                            break;
                        case -4:
                            i16 = 83;
                            break;
                        case -3:
                            dkVar.a(16);
                            if (dkVar.f41238a == 0) {
                                i16 = 4;
                            } else {
                                i16 = i17;
                            }
                            break;
                        case -2:
                            dkVar.f41241d = f40662b ? 1 : 0;
                            i12 = 3;
                            dkVar.a(i12);
                            i16 = i17;
                            break;
                        case -1:
                            i16 = 68;
                            break;
                        default:
                            i16 = i17;
                            break;
                    }
                } catch (Throwable th28) {
                    th = th28;
                }
            }
        } catch (Throwable th29) {
            Throwable cause5 = th29.getCause();
            if (cause5 == null) {
                throw th29;
            }
            throw cause5;
        }
    }

    /* JADX WARN: Code duplicated, block: B:132:0x034c  */
    /* JADX WARN: Code duplicated, block: B:188:0x04ed A[Catch: all -> 0x04d8, TryCatch #29 {all -> 0x04d8, blocks: (B:166:0x04bb, B:186:0x04e7, B:188:0x04ed, B:189:0x04ee, B:202:0x0517, B:205:0x052a, B:208:0x0530, B:209:0x0534, B:217:0x054e, B:223:0x0575, B:224:0x0586, B:227:0x0590), top: B:601:0x04bb }] */
    /* JADX WARN: Code duplicated, block: B:189:0x04ee A[Catch: all -> 0x04d8, TRY_LEAVE, TryCatch #29 {all -> 0x04d8, blocks: (B:166:0x04bb, B:186:0x04e7, B:188:0x04ed, B:189:0x04ee, B:202:0x0517, B:205:0x052a, B:208:0x0530, B:209:0x0534, B:217:0x054e, B:223:0x0575, B:224:0x0586, B:227:0x0590), top: B:601:0x04bb }] */
    /* JADX WARN: Code duplicated, block: B:251:0x062a A[PHI: r14
      0x062a: PHI (r14v65 char) = (r14v57 char), (r14v60 char), (r14v63 char), (r14v67 char) binds: [B:328:0x08c8, B:303:0x07e3, B:272:0x06e6, B:249:0x0625] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:490:0x0bea A[PHI: r3 r4 r7 r8
      0x0bea: PHI (r3v15 int) = 
      (r3v14 int)
      (r3v16 int)
      (r3v19 int)
      (r3v21 int)
      (r3v22 int)
      (r3v23 int)
      (r3v27 int)
      (r3v28 int)
      (r3v12 int)
      (r3v29 int)
      (r3v30 int)
      (r3v12 int)
      (r3v31 int)
      (r3v32 int)
      (r3v33 int)
      (r3v12 int)
      (r3v34 int)
      (r3v12 int)
      (r3v12 int)
      (r3v12 int)
      (r3v12 int)
      (r3v12 int)
     binds: [B:536:0x0d25, B:526:0x0cfa, B:521:0x0cd5, B:520:0x0cd1, B:519:0x0ccb, B:516:0x0ca8, B:509:0x0c79, B:508:0x0c6a, B:506:0x0c65, B:507:0x0c67, B:503:0x0c3b, B:501:0x0c36, B:502:0x0c38, B:499:0x0c18, B:498:0x0c0a, B:496:0x0c05, B:497:0x0c07, B:489:0x0be0, B:473:0x0b8d, B:468:0x0b65, B:171:0x04c9, B:25:0x015d] A[DONT_GENERATE, DONT_INLINE]
      0x0bea: PHI (r4v9 com.facetec.sdk.dk) = 
      (r4v7 com.facetec.sdk.dk)
      (r4v10 com.facetec.sdk.dk)
      (r4v10 com.facetec.sdk.dk)
      (r4v10 com.facetec.sdk.dk)
      (r4v10 com.facetec.sdk.dk)
      (r4v10 com.facetec.sdk.dk)
      (r4v10 com.facetec.sdk.dk)
      (r4v10 com.facetec.sdk.dk)
      (r4v10 com.facetec.sdk.dk)
      (r4v10 com.facetec.sdk.dk)
      (r4v10 com.facetec.sdk.dk)
      (r4v10 com.facetec.sdk.dk)
      (r4v10 com.facetec.sdk.dk)
      (r4v10 com.facetec.sdk.dk)
      (r4v10 com.facetec.sdk.dk)
      (r4v10 com.facetec.sdk.dk)
      (r4v10 com.facetec.sdk.dk)
      (r4v10 com.facetec.sdk.dk)
      (r4v10 com.facetec.sdk.dk)
      (r4v10 com.facetec.sdk.dk)
      (r4v10 com.facetec.sdk.dk)
      (r4v10 com.facetec.sdk.dk)
     binds: [B:536:0x0d25, B:526:0x0cfa, B:521:0x0cd5, B:520:0x0cd1, B:519:0x0ccb, B:516:0x0ca8, B:509:0x0c79, B:508:0x0c6a, B:506:0x0c65, B:507:0x0c67, B:503:0x0c3b, B:501:0x0c36, B:502:0x0c38, B:499:0x0c18, B:498:0x0c0a, B:496:0x0c05, B:497:0x0c07, B:489:0x0be0, B:473:0x0b8d, B:468:0x0b65, B:171:0x04c9, B:25:0x015d] A[DONT_GENERATE, DONT_INLINE]
      0x0bea: PHI (r7v11 int) = 
      (r7v8 int)
      (r7v14 int)
      (r7v16 int)
      (r7v17 int)
      (r7v17 int)
      (r7v18 int)
      (r7v23 int)
      (r7v24 int)
      (r7v25 int)
      (r7v25 int)
      (r7v26 int)
      (r7v27 int)
      (r7v27 int)
      (r7v28 int)
      (r7v29 int)
      (r7v30 int)
      (r7v30 int)
      (r7v31 int)
      (r7v36 int)
      (r7v39 int)
      (r7v112 int)
      (r7v167 int)
     binds: [B:536:0x0d25, B:526:0x0cfa, B:521:0x0cd5, B:520:0x0cd1, B:519:0x0ccb, B:516:0x0ca8, B:509:0x0c79, B:508:0x0c6a, B:506:0x0c65, B:507:0x0c67, B:503:0x0c3b, B:501:0x0c36, B:502:0x0c38, B:499:0x0c18, B:498:0x0c0a, B:496:0x0c05, B:497:0x0c07, B:489:0x0be0, B:473:0x0b8d, B:468:0x0b65, B:171:0x04c9, B:25:0x015d] A[DONT_GENERATE, DONT_INLINE]
      0x0bea: PHI (r8v19 char) = 
      (r8v16 char)
      (r8v22 char)
      (r8v24 char)
      (r8v25 char)
      (r8v25 char)
      (r8v26 char)
      (r8v31 char)
      (r8v32 char)
      (r8v33 char)
      (r8v33 char)
      (r8v34 char)
      (r8v35 char)
      (r8v35 char)
      (r8v36 char)
      (r8v37 char)
      (r8v38 char)
      (r8v38 char)
      (r8v39 char)
      (r8v44 char)
      (r8v47 char)
      (r8v116 char)
      (r8v173 char)
     binds: [B:536:0x0d25, B:526:0x0cfa, B:521:0x0cd5, B:520:0x0cd1, B:519:0x0ccb, B:516:0x0ca8, B:509:0x0c79, B:508:0x0c6a, B:506:0x0c65, B:507:0x0c67, B:503:0x0c3b, B:501:0x0c36, B:502:0x0c38, B:499:0x0c18, B:498:0x0c0a, B:496:0x0c05, B:497:0x0c07, B:489:0x0be0, B:473:0x0b8d, B:468:0x0b65, B:171:0x04c9, B:25:0x015d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:512:0x0c9a A[PHI: r7 r8
      0x0c9a: PHI (r7v21 int) = (r7v15 int), (r7v22 int) binds: [B:523:0x0cf4, B:511:0x0c98] A[DONT_GENERATE, DONT_INLINE]
      0x0c9a: PHI (r8v29 char) = (r8v23 char), (r8v30 char) binds: [B:523:0x0cf4, B:511:0x0c98] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:534:0x0d21  */
    /* JADX WARN: Code duplicated, block: B:536:0x0d25 A[Catch: all -> 0x0137, TRY_ENTER, TryCatch #11 {, blocks: (B:4:0x0003, B:6:0x008a, B:7:0x008e, B:9:0x0095, B:11:0x0129, B:536:0x0d25, B:537:0x0d30, B:538:0x0d31, B:540:0x0d37, B:541:0x0d38, B:5:0x0037, B:10:0x0097), top: B:566:0x0003, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:684:0x0d30 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:685:0x0d30 A[SYNTHETIC] */
    public static synchronized void c(String str) {
        int i10;
        char c10;
        Throwable th2;
        char c11;
        int i11;
        int i12;
        Throwable th3;
        char c12;
        int i13;
        char c13;
        Throwable th4;
        Throwable cause;
        int i14;
        char c14;
        dk dkVar = new dk(str);
        int i15 = m;
        byte[] bArr = f40672l;
        int i16 = 1;
        Object[] objArr = new Object[1];
        o((short) (i15 | 857), bArr[10], bArr[5], objArr);
        char c15 = 0;
        String str2 = (String) objArr[0];
        byte b10 = bArr[5];
        Object[] objArr2 = new Object[1];
        o((short) (i15 | 25), b10, (short) (b10 | DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c16 = 2018;
            short s4 = (short) 789;
            Object[] objArr4 = new Object[1];
            o((short) (i15 | 25), (byte) (-bArr[2018]), s4, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            o((short) 204, (byte) (bArr[3] - 1), (short) StatusCode.SUCCESS, objArr5);
            String str3 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            o((short) (i15 | 25), (byte) (-bArr[2018]), s4, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str3, Class.forName((String) objArr6[0])).invoke(str2, objArr3);
            int[] iArr = new int[objArr7.length];
            int i17 = 0;
            while (true) {
                i10 = 798;
                c10 = 788;
                if (i17 >= objArr7.length) {
                    break;
                }
                Object[] objArr8 = new Object[i16];
                objArr8[c15] = objArr7[i17];
                short s7 = (short) ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY;
                byte[] bArr2 = f40672l;
                short s9 = (short) 788;
                Object[] objArr9 = new Object[i16];
                o(s7, (byte) (-bArr2[c16]), s9, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[c15]);
                Object[] objArr10 = new Object[i16];
                o((short) 224, (byte) 74, (short) 798, objArr10);
                String str4 = (String) objArr10[0];
                Class<?>[] clsArr = new Class[i16];
                int i18 = m;
                dk dkVar2 = dkVar;
                Object[] objArr11 = objArr7;
                Object[] objArr12 = new Object[1];
                o((short) (i18 | 25), (byte) (-bArr2[2018]), s4, objArr12);
                clsArr[0] = Class.forName((String) objArr12[0]);
                Object objInvoke = cls2.getMethod(str4, clsArr).invoke(null, objArr8);
                Object[] objArr13 = new Object[1];
                o(s7, (byte) (-bArr2[2018]), s9, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                o((short) (i18 | 66), (byte) (bArr2[4670] + 1), (short) 797, objArr14);
                iArr[i17] = ((Integer) cls3.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                i17++;
                objArr7 = objArr11;
                dkVar = dkVar2;
                c15 = 0;
                i16 = 1;
                c16 = 2018;
            }
            dk dkVar3 = dkVar;
            int i19 = 0;
            while (true) {
                int i20 = i19 + 1;
                try {
                    dkVar3 = dkVar3;
                    try {
                        switch (dkVar3.a(iArr[i19])) {
                            case -79:
                                i10 = i10;
                                c10 = c10;
                                i20 = ImageAnalysisKt.OVER_EXPOSED_THRESHOLD;
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -78:
                                i10 = i10;
                                c11 = c10;
                                dkVar3.a(22);
                                if (dkVar3.f41238a != 0) {
                                    i12 = 102;
                                } else {
                                    i11 = 63;
                                    i12 = i11;
                                }
                                dkVar3 = dkVar3;
                                c10 = c11;
                                i19 = i12;
                                i10 = i10;
                                break;
                            case -77:
                                i10 = i10;
                                c10 = c10;
                                i20 = 225;
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -76:
                                i10 = i10;
                                c10 = c10;
                                dkVar3.a(22);
                                i20 = dkVar3.f41238a != 70 ? 150 : 180;
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -75:
                                i10 = i10;
                                c10 = c10;
                                i20 = 220;
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -74:
                                i10 = i10;
                                c11 = c10;
                                dkVar3.a(22);
                                if (dkVar3.f41238a != 0) {
                                    i12 = 102;
                                } else {
                                    i11 = ErrorCodes.ERR_CRY_BAD_PROTO;
                                    i12 = i11;
                                }
                                dkVar3 = dkVar3;
                                c10 = c11;
                                i19 = i12;
                                i10 = i10;
                                break;
                            case -73:
                                i10 = i10;
                                c10 = c10;
                                i20 = 34;
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -72:
                                i10 = i10;
                                c10 = c10;
                                i20 = 219;
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -71:
                                i10 = i10;
                                c10 = c10;
                                dkVar3.a(16);
                                if (dkVar3.f41238a == 0) {
                                    i20 = 218;
                                }
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -70:
                                dkVar3 = dkVar3;
                                i19 = 1;
                                break;
                            case -69:
                                i10 = i10;
                                c10 = c10;
                                i20 = ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY;
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -68:
                                i10 = i10;
                                c10 = c10;
                                dkVar3.a(2);
                                if (dkVar3.f41238a == 0) {
                                    i20 = 207;
                                }
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -67:
                                i10 = i10;
                                c10 = c10;
                                i20 = 144;
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -66:
                                i10 = i10;
                                c10 = c10;
                                i20 = Opcodes.MONITOREXIT;
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -65:
                                i10 = i10;
                                c10 = c10;
                                dkVar3.a(16);
                                if (dkVar3.f41238a == 0) {
                                    i20 = Opcodes.MONITORENTER;
                                }
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -64:
                                i10 = i10;
                                c10 = c10;
                                try {
                                    dkVar3.f41241d = 1;
                                    try {
                                        dkVar3.a(5);
                                        dkVar3.a(7);
                                        f40671k = dkVar3.f41238a;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        th2 = th;
                                        if (i20 >= 181) {
                                            throw th2;
                                        }
                                        if (i20 <= 185) {
                                            throw th2;
                                        }
                                        dkVar3.f41245h = th2;
                                        dkVar3.a(27);
                                        i20 = 179;
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    th2 = th;
                                    if (i20 >= 181) {
                                        throw th2;
                                    }
                                    if (i20 <= 185) {
                                        throw th2;
                                    }
                                    dkVar3.f41245h = th2;
                                    dkVar3.a(27);
                                    i20 = 179;
                                    i19 = i20;
                                    dkVar3 = dkVar3;
                                    c10 = c10;
                                    i10 = i10;
                                }
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -63:
                                i10 = i10;
                                c10 = c10;
                                try {
                                    dkVar3.f41241d = f40673n;
                                    dkVar3.a(3);
                                } catch (Throwable th7) {
                                    th = th7;
                                    th2 = th;
                                    if (i20 >= 181) {
                                        throw th2;
                                    }
                                    if (i20 <= 185) {
                                        throw th2;
                                    }
                                    dkVar3.f41245h = th2;
                                    dkVar3.a(27);
                                    i20 = 179;
                                }
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -62:
                                i10 = i10;
                                c10 = c10;
                                dkVar3.a(19);
                                throw ((Throwable) dkVar3.f41243f);
                            case -61:
                                i10 = i10;
                                c10 = c10;
                                i19 = 226;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -60:
                                i10 = i10;
                                c10 = c10;
                                i19 = 228;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -59:
                                i10 = i10;
                                c10 = c10;
                                dkVar3.a(2);
                                if (dkVar3.f41238a == 0) {
                                    i19 = 178;
                                } else {
                                    i19 = i20;
                                }
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -58:
                                i10 = i10;
                                c10 = c10;
                                i19 = 100;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -57:
                                i10 = i10;
                                c10 = c10;
                                i19 = 167;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -56:
                                i10 = i10;
                                c10 = c10;
                                dkVar3.a(2);
                                if (dkVar3.f41238a == 0) {
                                    i19 = 166;
                                } else {
                                    i19 = i20;
                                }
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -55:
                                i10 = i10;
                                c10 = c10;
                                try {
                                    dkVar3.f41241d = 1;
                                    try {
                                        dkVar3.a(5);
                                        dkVar3.a(7);
                                        f40673n = dkVar3.f41238a;
                                    } catch (Throwable th8) {
                                        th2 = th8;
                                        if (i20 >= 181) {
                                            throw th2;
                                        }
                                        if (i20 <= 185) {
                                            throw th2;
                                        }
                                        dkVar3.f41245h = th2;
                                        dkVar3.a(27);
                                        i20 = 179;
                                    }
                                } catch (Throwable th9) {
                                    th2 = th9;
                                    if (i20 >= 181) {
                                        throw th2;
                                    }
                                    if (i20 <= 185) {
                                        throw th2;
                                    }
                                    dkVar3.f41245h = th2;
                                    dkVar3.a(27);
                                    i20 = 179;
                                    i19 = i20;
                                    dkVar3 = dkVar3;
                                    c10 = c10;
                                    i10 = i10;
                                    break;
                                }
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -54:
                                i10 = i10;
                                c10 = c10;
                                dkVar3.f41241d = f40671k;
                                try {
                                    dkVar3.a(3);
                                } catch (Throwable th10) {
                                    th = th10;
                                    th2 = th;
                                    if (i20 >= 181) {
                                        throw th2;
                                    }
                                    if (i20 <= 185) {
                                        throw th2;
                                    }
                                    dkVar3.f41245h = th2;
                                    dkVar3.a(27);
                                    i20 = 179;
                                }
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -53:
                                i10 = i10;
                                c10 = c10;
                                i19 = 196;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -52:
                                i10 = i10;
                                c10 = c10;
                                i19 = 140;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -51:
                                i10 = i10;
                                c10 = c10;
                                try {
                                    try {
                                        try {
                                            dkVar3.f41245h = ((Class) bp.a(26 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.getCapsMode("", 0, 0) + 52, (char) (KeyEvent.getMaxKeyCode() >> 16))).getField("e").get(null);
                                            dkVar3.a(43);
                                        } catch (Throwable th11) {
                                            th3 = th11;
                                            th2 = th3;
                                            if (i20 >= 181) {
                                                throw th2;
                                            }
                                            if (i20 <= 185) {
                                                throw th2;
                                            }
                                            dkVar3.f41245h = th2;
                                            dkVar3.a(27);
                                            i20 = 179;
                                        }
                                    } catch (Throwable th12) {
                                        th3 = th12;
                                        th2 = th3;
                                        if (i20 >= 181) {
                                            throw th2;
                                        }
                                        if (i20 <= 185) {
                                            throw th2;
                                        }
                                        dkVar3.f41245h = th2;
                                        dkVar3.a(27);
                                        i20 = 179;
                                    }
                                } catch (Throwable th13) {
                                    th3 = th13;
                                }
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -50:
                                i19 = 169;
                                dkVar3 = dkVar3;
                                i10 = i10;
                                break;
                            case -49:
                                i10 = i10;
                                c10 = c10;
                                try {
                                    dkVar3.f41245h = ((Class) bp.a(26 - TextUtils.getOffsetBefore("", 0), View.MeasureSpec.getSize(0) + 52, (char) View.MeasureSpec.getMode(0))).getField("b").get(null);
                                    dkVar3.a(43);
                                } catch (Throwable th14) {
                                    th = th14;
                                    th2 = th;
                                    if (i20 >= 181) {
                                        throw th2;
                                    }
                                    if (i20 <= 185) {
                                        throw th2;
                                    }
                                    dkVar3.f41245h = th2;
                                    dkVar3.a(27);
                                    i20 = 179;
                                }
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -48:
                                i19 = 185;
                                dkVar3 = dkVar3;
                                i10 = i10;
                                break;
                            case -47:
                                i10 = i10;
                                c10 = c10;
                                dkVar3.f41245h = ((Class) bp.a(26 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 52, (char) (ViewConfiguration.getKeyRepeatDelay() >> 16))).getField("a").get(null);
                                dkVar3.a(43);
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -46:
                                i10 = i10;
                                c10 = c10;
                                try {
                                    dkVar3.f41245h = ((Class) bp.a(26 - View.getDefaultSize(0, 0), 52 - (ViewConfiguration.getEdgeSlop() >> 16), (char) View.MeasureSpec.getSize(0))).getField("c").get(null);
                                    dkVar3.a(43);
                                } catch (Throwable th15) {
                                    th2 = th15;
                                    if (i20 >= 181) {
                                        throw th2;
                                    }
                                    if (i20 <= 185) {
                                        throw th2;
                                    }
                                    dkVar3.f41245h = th2;
                                    dkVar3.a(27);
                                    i20 = 179;
                                }
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -45:
                                i10 = i10;
                                c10 = c10;
                                try {
                                    try {
                                        dkVar3.f41245h = ((Class) bp.a(26 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 51 - Process.getGidForName(""), (char) TextUtils.getCapsMode("", 0, 0))).getField("f").get(null);
                                        dkVar3.a(43);
                                    } catch (Throwable th16) {
                                        th = th16;
                                        th2 = th;
                                        if (i20 >= 181) {
                                            throw th2;
                                        }
                                        if (i20 <= 185) {
                                            throw th2;
                                        }
                                        dkVar3.f41245h = th2;
                                        dkVar3.a(27);
                                        i20 = 179;
                                    }
                                } catch (Throwable th17) {
                                    th2 = th17;
                                    if (i20 >= 181) {
                                        throw th2;
                                    }
                                    if (i20 <= 185) {
                                        throw th2;
                                    }
                                    dkVar3.f41245h = th2;
                                    dkVar3.a(27);
                                    i20 = 179;
                                }
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -44:
                                break;
                            case -43:
                                i10 = i10;
                                c10 = c10;
                                dkVar3.f41241d = 1;
                                dkVar3.a(5);
                                dkVar3.a(7);
                                f40664d = dkVar3.f41238a;
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -42:
                                i10 = i10;
                                c10 = c10;
                                try {
                                    dkVar3.f41241d = 1;
                                    try {
                                        dkVar3.a(5);
                                        try {
                                            dkVar3.a(6);
                                            dkVar3.f41241d = ((Class) bp.a((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26, 53 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (char) (Process.myTid() >> 22))).getField("i").getInt(dkVar3.f41243f);
                                            try {
                                                dkVar3.a(3);
                                            } catch (Throwable th18) {
                                                th2 = th18;
                                                if (i20 >= 181) {
                                                    throw th2;
                                                }
                                                if (i20 <= 185) {
                                                    throw th2;
                                                }
                                                dkVar3.f41245h = th2;
                                                dkVar3.a(27);
                                                i20 = 179;
                                            }
                                        } catch (Throwable th19) {
                                            th2 = th19;
                                        }
                                    } catch (Throwable th20) {
                                        th2 = th20;
                                        if (i20 >= 181) {
                                            throw th2;
                                        }
                                        if (i20 <= 185) {
                                            throw th2;
                                        }
                                        dkVar3.f41245h = th2;
                                        dkVar3.a(27);
                                        i20 = 179;
                                    }
                                } catch (Throwable th21) {
                                    th2 = th21;
                                    if (i20 >= 181) {
                                        throw th2;
                                    }
                                    if (i20 <= 185) {
                                        throw th2;
                                    }
                                    dkVar3.f41245h = th2;
                                    dkVar3.a(27);
                                    i20 = 179;
                                }
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -41:
                                c12 = c10;
                                try {
                                    try {
                                        dkVar3.f41245h = ((Class) bp.a(TextUtils.getOffsetAfter("", 0) + 26, 52 - Drawable.resolveOpacity(0, 0), (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1))).getField("j").get(null);
                                        dkVar3.a(43);
                                        c10 = c12;
                                        i10 = 798;
                                    } catch (Throwable th22) {
                                        th = th22;
                                        c10 = c12;
                                        i10 = 798;
                                        th2 = th;
                                        if (i20 >= 181) {
                                            throw th2;
                                        }
                                        if (i20 <= 185) {
                                            throw th2;
                                        }
                                        dkVar3.f41245h = th2;
                                        dkVar3.a(27);
                                        i20 = 179;
                                    }
                                } catch (Throwable th23) {
                                    th = th23;
                                    c10 = c12;
                                    i10 = 798;
                                    th2 = th;
                                    if (i20 >= 181) {
                                        throw th2;
                                    }
                                    if (i20 <= 185) {
                                        throw th2;
                                    }
                                    dkVar3.f41245h = th2;
                                    dkVar3.a(27);
                                    i20 = 179;
                                }
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -40:
                                c12 = c10;
                                dkVar3.f41241d = f40664d;
                                i13 = 3;
                                try {
                                    dkVar3.a(i13);
                                    c10 = c12;
                                    i10 = 798;
                                } catch (Throwable th24) {
                                    th2 = th24;
                                    c10 = c12;
                                    i10 = 798;
                                    if (i20 >= 181) {
                                        throw th2;
                                    }
                                    if (i20 <= 185) {
                                        throw th2;
                                    }
                                    dkVar3.f41245h = th2;
                                    dkVar3.a(27);
                                    i20 = 179;
                                }
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -39:
                                c14 = c10;
                                dkVar3.a(22);
                                int i21 = dkVar3.f41238a;
                                if (i21 == 0) {
                                    i19 = 104;
                                } else if (i21 == 1) {
                                    i19 = 110;
                                } else if (i21 == 2) {
                                    i19 = 116;
                                } else if (i21 == 3) {
                                    i19 = 122;
                                } else if (i21 != 4) {
                                    i19 = i21 != 5 ? 140 : 134;
                                } else {
                                    i19 = 128;
                                }
                                c10 = c14;
                                i10 = 798;
                                break;
                            case -38:
                                i19 = 156;
                                i10 = 798;
                                break;
                            case -37:
                                c14 = c10;
                                dkVar3.a(2);
                                if (dkVar3.f41238a == 0) {
                                    i19 = 99;
                                } else {
                                    i19 = i20;
                                }
                                c10 = c14;
                                i10 = 798;
                                break;
                            case -36:
                                c12 = c10;
                                try {
                                    short s10 = (short) (m | 1883);
                                    Object[] objArr15 = new Object[1];
                                    o(s10, (byte) (s10 & 53), (short) 775, objArr15);
                                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                                    Object[] objArr16 = new Object[1];
                                    o((short) 2156, f40672l[885], (short) 786, objArr16);
                                    dkVar3.f41241d = ((Integer) cls4.getMethod((String) objArr16[0], null).invoke(null, null)).intValue();
                                    i13 = 3;
                                    dkVar3.a(i13);
                                    c10 = c12;
                                    i10 = 798;
                                    i19 = i20;
                                    dkVar3 = dkVar3;
                                    c10 = c10;
                                    i10 = i10;
                                } catch (Throwable th25) {
                                    Throwable cause2 = th25.getCause();
                                    if (cause2 == null) {
                                        throw th25;
                                    }
                                    throw cause2;
                                }
                                break;
                            case -35:
                                c12 = c10;
                                dkVar3.f41241d = 1;
                                dkVar3.a(5);
                                dkVar3.a(7);
                                try {
                                    Object[] objArr17 = {Integer.valueOf(dkVar3.f41238a)};
                                    byte[] bArr3 = f40672l;
                                    Object[] objArr18 = new Object[1];
                                    o((short) 2100, (byte) (bArr3[202] + 1), (short) 772, objArr18);
                                    Class<?> cls5 = Class.forName((String) objArr18[0]);
                                    Object[] objArr19 = new Object[1];
                                    o((short) 2132, bArr3[885], (short) 780, objArr19);
                                    dkVar3.f41239b = ((Long) cls5.getMethod((String) objArr19[0], Integer.TYPE).invoke(null, objArr17)).longValue();
                                    dkVar3.a(65);
                                    c10 = c12;
                                    i10 = 798;
                                    i19 = i20;
                                    dkVar3 = dkVar3;
                                    c10 = c10;
                                    i10 = i10;
                                } catch (Throwable th26) {
                                    Throwable cause3 = th26.getCause();
                                    if (cause3 == null) {
                                        throw th26;
                                    }
                                    throw cause3;
                                }
                                break;
                            case -34:
                                i19 = 152;
                                i10 = 798;
                                break;
                            case -33:
                                i19 = 81;
                                i10 = 798;
                                break;
                            case -32:
                                c14 = c10;
                                dkVar3.a(2);
                                if (dkVar3.f41238a == 0) {
                                    i19 = 80;
                                } else {
                                    i19 = i20;
                                }
                                c10 = c14;
                                i10 = 798;
                                break;
                            case -31:
                                c12 = c10;
                                try {
                                    short s11 = (short) (m | 1883);
                                    Object[] objArr20 = new Object[1];
                                    o(s11, (byte) (s11 & 53), (short) 775, objArr20);
                                    Class<?> cls6 = Class.forName((String) objArr20[0]);
                                    Object[] objArr21 = new Object[1];
                                    o((short) 2076, f40672l[885], (short) 780, objArr21);
                                    dkVar3.f41239b = ((Long) cls6.getMethod((String) objArr21[0], null).invoke(null, null)).longValue();
                                    dkVar3.a(65);
                                    c10 = c12;
                                    i10 = 798;
                                    i19 = i20;
                                    dkVar3 = dkVar3;
                                    c10 = c10;
                                    i10 = i10;
                                } catch (Throwable th27) {
                                    Throwable cause4 = th27.getCause();
                                    if (cause4 == null) {
                                        throw th27;
                                    }
                                    throw cause4;
                                }
                                break;
                            case -30:
                                c12 = c10;
                                try {
                                    dkVar3.f41241d = 1;
                                    try {
                                        dkVar3.a(5);
                                        dkVar3.a(7);
                                        try {
                                            Object[] objArr22 = {Integer.valueOf(dkVar3.f41238a)};
                                            byte[] bArr4 = f40672l;
                                            Object[] objArr23 = new Object[1];
                                            o((short) 2006, (byte) (bArr4[202] + 1), (short) 777, objArr23);
                                            Class<?> cls7 = Class.forName((String) objArr23[0]);
                                            Object[] objArr24 = new Object[1];
                                            o((short) 2033, bArr4[885], (short) 790, objArr24);
                                            dkVar3.f41241d = ((Integer) cls7.getMethod((String) objArr24[0], Integer.TYPE).invoke(null, objArr22)).intValue();
                                            i13 = 3;
                                            dkVar3.a(i13);
                                            c10 = c12;
                                            i10 = 798;
                                        } catch (Throwable th28) {
                                            Throwable cause5 = th28.getCause();
                                            if (cause5 == null) {
                                                throw th28;
                                            }
                                            throw cause5;
                                        }
                                    } catch (Throwable th29) {
                                        th = th29;
                                        c10 = c12;
                                        i10 = 798;
                                        th2 = th;
                                        if (i20 >= 181) {
                                            throw th2;
                                        }
                                        if (i20 <= 185) {
                                            throw th2;
                                        }
                                        dkVar3.f41245h = th2;
                                        dkVar3.a(27);
                                        i20 = 179;
                                    }
                                } catch (Throwable th30) {
                                    th2 = th30;
                                    c10 = c12;
                                    i10 = 798;
                                    if (i20 >= 181) {
                                        throw th2;
                                    }
                                    if (i20 <= 185) {
                                        throw th2;
                                    }
                                    dkVar3.f41245h = th2;
                                    dkVar3.a(27);
                                    i20 = 179;
                                }
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -29:
                                i19 = 231;
                                i10 = 798;
                                break;
                            case -28:
                                i19 = 233;
                                i10 = 798;
                                break;
                            case -27:
                                c14 = c10;
                                dkVar3.a(2);
                                if (dkVar3.f41238a == 0) {
                                    i19 = 62;
                                } else {
                                    i19 = i20;
                                }
                                c10 = c14;
                                i10 = 798;
                                break;
                            case -26:
                                c12 = c10;
                                dkVar3.f41241d = 2;
                                try {
                                    dkVar3.a(5);
                                    dkVar3.a(7);
                                    int i22 = dkVar3.f41238a;
                                    dkVar3.a(7);
                                    try {
                                        Object[] objArr25 = {Integer.valueOf(i22), Integer.valueOf(dkVar3.f41238a)};
                                        short s12 = (short) (m | ReturnCode.ERR_MANAGEMENT);
                                        byte[] bArr5 = f40672l;
                                        Object[] objArr26 = new Object[1];
                                        o(s12, (byte) (bArr5[202] + 1), (short) 776, objArr26);
                                        Class<?> cls8 = Class.forName((String) objArr26[0]);
                                        Object[] objArr27 = new Object[1];
                                        o((short) 1992, bArr5[1841], (short) 790, objArr27);
                                        String str5 = (String) objArr27[0];
                                        Class<?> cls9 = Integer.TYPE;
                                        dkVar3.f41241d = ((Integer) cls8.getMethod(str5, cls9, cls9).invoke(null, objArr25)).intValue();
                                        i13 = 3;
                                        dkVar3.a(i13);
                                        c10 = c12;
                                        i10 = 798;
                                    } catch (Throwable th31) {
                                        Throwable cause6 = th31.getCause();
                                        if (cause6 == null) {
                                            throw th31;
                                        }
                                        throw cause6;
                                    }
                                } catch (Throwable th32) {
                                    th2 = th32;
                                    c10 = c12;
                                    i10 = 798;
                                    if (i20 >= 181) {
                                        throw th2;
                                    }
                                    if (i20 <= 185) {
                                        throw th2;
                                    }
                                    dkVar3.f41245h = th2;
                                    dkVar3.a(27);
                                    i20 = 179;
                                }
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -25:
                                c12 = c10;
                                dkVar3.f41245h = new int[]{-731295362, -1019590280};
                                dkVar3.a(43);
                                c10 = c12;
                                i10 = 798;
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -24:
                                i19 = 49;
                                i10 = 798;
                                break;
                            case -23:
                                c14 = c10;
                                dkVar3.a(2);
                                if (dkVar3.f41238a == 0) {
                                    i19 = 48;
                                } else {
                                    i19 = i20;
                                }
                                c10 = c14;
                                i10 = 798;
                                break;
                            case -22:
                                dkVar3.f41241d = 2;
                                dkVar3.a(5);
                                dkVar3.a(7);
                                int i23 = dkVar3.f41238a;
                                dkVar3.a(7);
                                try {
                                    Object[] objArr28 = {Integer.valueOf(i23), Integer.valueOf(dkVar3.f41238a)};
                                    short s13 = (short) 1878;
                                    byte[] bArr6 = f40672l;
                                    c12 = 788;
                                    try {
                                        Object[] objArr29 = new Object[1];
                                        o(s13, (byte) (bArr6[202] + 1), (short) 788, objArr29);
                                        Class<?> cls10 = Class.forName((String) objArr29[0]);
                                        Object[] objArr30 = new Object[1];
                                        o((short) 1954, (byte) (-bArr6[1926]), (short) 794, objArr30);
                                        String str6 = (String) objArr30[0];
                                        Class<?> cls11 = Integer.TYPE;
                                        try {
                                            dkVar3.f41241d = ((Integer) cls10.getMethod(str6, cls11, cls11).invoke(null, objArr28)).intValue();
                                            i13 = 3;
                                            dkVar3.a(i13);
                                            c10 = c12;
                                            i10 = 798;
                                        } catch (Throwable th33) {
                                            th2 = th33;
                                            c10 = c12;
                                            i10 = 798;
                                            if (i20 >= 181) {
                                                throw th2;
                                            }
                                            if (i20 <= 185) {
                                                throw th2;
                                            }
                                            dkVar3.f41245h = th2;
                                            dkVar3.a(27);
                                            i20 = 179;
                                            i19 = i20;
                                            dkVar3 = dkVar3;
                                            c10 = c10;
                                            i10 = i10;
                                        }
                                        i19 = i20;
                                        dkVar3 = dkVar3;
                                        c10 = c10;
                                        i10 = i10;
                                    } catch (Throwable th34) {
                                        th = th34;
                                        Throwable th35 = th;
                                        Throwable cause7 = th35.getCause();
                                        if (cause7 == null) {
                                            throw th35;
                                        }
                                        throw cause7;
                                    }
                                } catch (Throwable th36) {
                                    th = th36;
                                }
                                break;
                            case -21:
                                dkVar3.f41245h = new int[]{1554394192, -182521111};
                                dkVar3.a(43);
                                i10 = 798;
                                c10 = 788;
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -20:
                                i19 = 146;
                                dkVar3 = dkVar3;
                                i10 = 798;
                                c10 = 788;
                                break;
                            case -19:
                                i19 = 221;
                                dkVar3 = dkVar3;
                                i10 = 798;
                                c10 = 788;
                                break;
                            case -18:
                                i19 = 223;
                                dkVar3 = dkVar3;
                                i10 = 798;
                                c10 = 788;
                                break;
                            case -17:
                                dkVar3.a(2);
                                if (dkVar3.f41238a == 0) {
                                    i19 = 33;
                                } else {
                                    i19 = i20;
                                }
                                dkVar3 = dkVar3;
                                i10 = 798;
                                c10 = 788;
                                break;
                            case -16:
                                dkVar3.f41241d = 3;
                                c13 = 5;
                                try {
                                    dkVar3.a(5);
                                    dkVar3.a(7);
                                    char c17 = (char) dkVar3.f41238a;
                                    dkVar3.a(7);
                                    int i24 = dkVar3.f41238a;
                                    dkVar3.a(7);
                                    try {
                                        Object[] objArr31 = new Object[1];
                                        q(c17, i24, dkVar3.f41238a, objArr31);
                                        try {
                                            dkVar3.f41245h = (String) objArr31[0];
                                            dkVar3.a(43);
                                            i10 = 798;
                                            c10 = 788;
                                        } catch (Throwable th37) {
                                            th2 = th37;
                                            i10 = 798;
                                            c10 = 788;
                                            if (i20 >= 181) {
                                                throw th2;
                                            }
                                            if (i20 <= 185) {
                                                throw th2;
                                            }
                                            dkVar3.f41245h = th2;
                                            dkVar3.a(27);
                                            i20 = 179;
                                        }
                                    } catch (Throwable th38) {
                                        th2 = th38;
                                        i10 = 798;
                                        c10 = 788;
                                        if (i20 >= 181) {
                                            throw th2;
                                        }
                                        if (i20 <= 185) {
                                            throw th2;
                                        }
                                        dkVar3.f41245h = th2;
                                        dkVar3.a(27);
                                        i20 = 179;
                                    }
                                } catch (Throwable th39) {
                                    th = th39;
                                    th2 = th;
                                    i10 = 798;
                                    c10 = 788;
                                    if (i20 >= 181) {
                                        throw th2;
                                    }
                                    if (i20 <= 185) {
                                        throw th2;
                                    }
                                    dkVar3.f41245h = th2;
                                    dkVar3.a(27);
                                    i20 = 179;
                                }
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -15:
                                try {
                                    dkVar3.f41241d = 3;
                                    c13 = 5;
                                    try {
                                        dkVar3.a(5);
                                        try {
                                            dkVar3.a(6);
                                            Object obj = dkVar3.f41243f;
                                            dkVar3.a(7);
                                            char c18 = (char) dkVar3.f41238a;
                                            dkVar3.a(7);
                                            try {
                                                Object[] objArr32 = {obj, Character.valueOf(c18), Integer.valueOf(dkVar3.f41238a)};
                                                byte[] bArr7 = f40672l;
                                                short s14 = (short) 783;
                                                Object[] objArr33 = new Object[1];
                                                o((short) 1825, (byte) (bArr7[202] + 1), s14, objArr33);
                                                Class<?> cls12 = Class.forName((String) objArr33[0]);
                                                try {
                                                    Object[] objArr34 = new Object[1];
                                                    o((short) 1846, (byte) (bArr7[4670] + 1), (short) 798, objArr34);
                                                    String str7 = (String) objArr34[0];
                                                    Class<?>[] clsArr2 = new Class[3];
                                                    try {
                                                        Object[] objArr35 = new Object[1];
                                                        o((short) 1852, (byte) (-bArr7[2018]), s14, objArr35);
                                                        clsArr2[0] = Class.forName((String) objArr35[0]);
                                                        clsArr2[1] = Character.TYPE;
                                                        clsArr2[2] = Integer.TYPE;
                                                        try {
                                                            dkVar3.f41241d = ((Integer) cls12.getMethod(str7, clsArr2).invoke(null, objArr32)).intValue();
                                                            try {
                                                                dkVar3.a(3);
                                                                i10 = 798;
                                                                c10 = 788;
                                                            } catch (Throwable th40) {
                                                                th = th40;
                                                                th2 = th;
                                                                i10 = 798;
                                                                c10 = 788;
                                                                if (i20 >= 181) {
                                                                    throw th2;
                                                                }
                                                                if (i20 <= 185) {
                                                                    throw th2;
                                                                }
                                                                dkVar3.f41245h = th2;
                                                                dkVar3.a(27);
                                                                i20 = 179;
                                                            }
                                                        } catch (Throwable th41) {
                                                            th = th41;
                                                            th2 = th;
                                                            i10 = 798;
                                                            c10 = 788;
                                                            if (i20 >= 181) {
                                                                throw th2;
                                                            }
                                                            if (i20 <= 185) {
                                                                throw th2;
                                                            }
                                                            dkVar3.f41245h = th2;
                                                            dkVar3.a(27);
                                                            i20 = 179;
                                                        }
                                                    } catch (Throwable th42) {
                                                        th = th42;
                                                        th4 = th;
                                                        cause = th4.getCause();
                                                        if (cause != null) {
                                                            throw th4;
                                                        }
                                                        throw cause;
                                                    }
                                                } catch (Throwable th43) {
                                                    th = th43;
                                                    th4 = th;
                                                    cause = th4.getCause();
                                                    if (cause != null) {
                                                        throw th4;
                                                    }
                                                    throw cause;
                                                }
                                            } catch (Throwable th44) {
                                                th = th44;
                                            }
                                        } catch (Throwable th45) {
                                            th = th45;
                                        }
                                    } catch (Throwable th46) {
                                        th = th46;
                                        th2 = th;
                                        i10 = 798;
                                        c10 = 788;
                                        if (i20 >= 181) {
                                            throw th2;
                                        }
                                        if (i20 <= 185) {
                                            throw th2;
                                        }
                                        dkVar3.f41245h = th2;
                                        dkVar3.a(27);
                                        i20 = 179;
                                    }
                                } catch (Throwable th47) {
                                    th = th47;
                                }
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -14:
                                short s15 = (short) 1914;
                                try {
                                    byte[] bArr8 = f40672l;
                                    Object[] objArr36 = new Object[1];
                                    o(s15, (byte) (bArr8[202] + 1), (short) 783, objArr36);
                                    Class<?> cls13 = Class.forName((String) objArr36[0]);
                                    Object[] objArr37 = new Object[1];
                                    o((short) 1935, bArr8[623], (short) 785, objArr37);
                                    dkVar3.f41239b = ((Long) cls13.getMethod((String) objArr37[0], null).invoke(null, null)).longValue();
                                    dkVar3.a(65);
                                    i10 = 798;
                                    c10 = 788;
                                    i19 = i20;
                                    dkVar3 = dkVar3;
                                    c10 = c10;
                                    i10 = i10;
                                } catch (Throwable th48) {
                                    Throwable cause8 = th48.getCause();
                                    if (cause8 == null) {
                                        throw th48;
                                    }
                                    throw cause8;
                                }
                                break;
                            case -13:
                                dkVar3.f41241d = 2;
                                dkVar3.a(5);
                                dkVar3.a(7);
                                int i25 = dkVar3.f41238a;
                                dkVar3.a(7);
                                try {
                                    Object[] objArr38 = {Integer.valueOf(i25), Integer.valueOf(dkVar3.f41238a)};
                                    byte[] bArr9 = f40672l;
                                    Object[] objArr39 = new Object[1];
                                    o((short) 1878, (byte) (bArr9[202] + 1), (short) 788, objArr39);
                                    Class<?> cls14 = Class.forName((String) objArr39[0]);
                                    Object[] objArr40 = new Object[1];
                                    o((short) 1894, (byte) (-bArr9[2723]), (short) 784, objArr40);
                                    String str8 = (String) objArr40[0];
                                    Class<?> cls15 = Integer.TYPE;
                                    dkVar3.f41241d = ((Integer) cls14.getMethod(str8, cls15, cls15).invoke(null, objArr38)).intValue();
                                    i14 = 3;
                                    try {
                                        dkVar3.a(i14);
                                        i10 = 798;
                                        c10 = 788;
                                    } catch (Throwable th49) {
                                        th2 = th49;
                                        i10 = 798;
                                        c10 = 788;
                                        if (i20 >= 181) {
                                            throw th2;
                                        }
                                        if (i20 <= 185) {
                                            throw th2;
                                        }
                                        dkVar3.f41245h = th2;
                                        dkVar3.a(27);
                                        i20 = 179;
                                    }
                                    i19 = i20;
                                    dkVar3 = dkVar3;
                                    c10 = c10;
                                    i10 = i10;
                                } catch (Throwable th50) {
                                    Throwable cause9 = th50.getCause();
                                    if (cause9 == null) {
                                        throw th50;
                                    }
                                    throw cause9;
                                }
                                break;
                            case -12:
                                dkVar3 = dkVar3;
                                i19 = 102;
                                break;
                            case -11:
                                dkVar3 = dkVar3;
                                i19 = 16;
                                break;
                            case -10:
                                dkVar3.a(2);
                                if (dkVar3.f41238a == 0) {
                                    i19 = 15;
                                } else {
                                    i19 = i20;
                                }
                                dkVar3 = dkVar3;
                                i10 = 798;
                                c10 = 788;
                                break;
                            case -9:
                                dkVar3.f41241d = 2;
                                dkVar3.a(5);
                                dkVar3.a(6);
                                Object obj2 = dkVar3.f41243f;
                                dkVar3.a(6);
                                dkVar3.f41241d = obj2.equals(dkVar3.f41243f) ? 1 : 0;
                                i14 = 3;
                                dkVar3.a(i14);
                                i10 = 798;
                                c10 = 788;
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -8:
                                try {
                                    dkVar3.f41241d = 1;
                                    dkVar3.a(5);
                                    dkVar3.a(6);
                                    Object obj3 = dkVar3.f41243f;
                                    try {
                                        short s16 = (short) (m | 25);
                                        byte[] bArr10 = f40672l;
                                        Object[] objArr41 = new Object[1];
                                        o(s16, (byte) (-bArr10[2018]), s4, objArr41);
                                        Class<?> cls16 = Class.forName((String) objArr41[0]);
                                        Object[] objArr42 = new Object[1];
                                        o((short) 1873, (byte) (bArr10[4670] + 1), (short) 799, objArr42);
                                        dkVar3.f41245h = cls16.getMethod((String) objArr42[0], null).invoke(obj3, null);
                                        dkVar3.a(43);
                                        i10 = 798;
                                        c10 = 788;
                                        i19 = i20;
                                        dkVar3 = dkVar3;
                                        c10 = c10;
                                        i10 = i10;
                                    } catch (Throwable th51) {
                                        Throwable cause10 = th51.getCause();
                                        if (cause10 == null) {
                                            throw th51;
                                        }
                                        throw cause10;
                                    }
                                } catch (Throwable th52) {
                                    th2 = th52;
                                    i10 = 798;
                                    c10 = 788;
                                    if (i20 >= 181) {
                                        throw th2;
                                    }
                                    if (i20 <= 185) {
                                        throw th2;
                                    }
                                    dkVar3.f41245h = th2;
                                    dkVar3.a(27);
                                    i20 = 179;
                                }
                                break;
                            case -7:
                                dkVar3.f41241d = 2;
                                try {
                                    dkVar3.a(5);
                                    dkVar3.a(6);
                                    int[] iArr2 = (int[]) dkVar3.f41243f;
                                    dkVar3.a(7);
                                    try {
                                        Object[] objArr43 = new Object[1];
                                        p(iArr2, dkVar3.f41238a, objArr43);
                                        try {
                                            dkVar3.f41245h = (String) objArr43[0];
                                            dkVar3.a(43);
                                            i10 = 798;
                                            c10 = 788;
                                        } catch (Throwable th53) {
                                            th2 = th53;
                                            i10 = 798;
                                            c10 = 788;
                                            if (i20 >= 181) {
                                                throw th2;
                                            }
                                            if (i20 <= 185) {
                                                throw th2;
                                            }
                                            dkVar3.f41245h = th2;
                                            dkVar3.a(27);
                                            i20 = 179;
                                        }
                                    } catch (Throwable th54) {
                                        th2 = th54;
                                        i10 = 798;
                                        c10 = 788;
                                        if (i20 >= 181) {
                                            throw th2;
                                        }
                                        if (i20 <= 185) {
                                            throw th2;
                                        }
                                        dkVar3.f41245h = th2;
                                        dkVar3.a(27);
                                        i20 = 179;
                                        i19 = i20;
                                        dkVar3 = dkVar3;
                                        c10 = c10;
                                        i10 = i10;
                                        break;
                                    }
                                } catch (Throwable th55) {
                                    th2 = th55;
                                    i10 = 798;
                                    c10 = 788;
                                    if (i20 >= 181) {
                                        throw th2;
                                    }
                                    if (i20 <= 185) {
                                        throw th2;
                                    }
                                    dkVar3.f41245h = th2;
                                    dkVar3.a(27);
                                    i20 = 179;
                                }
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -6:
                                dkVar3.f41241d = 2;
                                dkVar3.a(5);
                                dkVar3.a(6);
                                Object obj4 = dkVar3.f41243f;
                                dkVar3.a(7);
                                try {
                                    Object[] objArr44 = {obj4, Character.valueOf((char) dkVar3.f41238a)};
                                    byte[] bArr11 = f40672l;
                                    short s17 = (short) 783;
                                    Object[] objArr45 = new Object[1];
                                    o((short) 1825, (byte) (bArr11[202] + 1), s17, objArr45);
                                    Class<?> cls17 = Class.forName((String) objArr45[0]);
                                    short s18 = (short) i10;
                                    Object[] objArr46 = new Object[1];
                                    o((short) 1846, (byte) (bArr11[4670] + 1), s18, objArr46);
                                    String str9 = (String) objArr46[0];
                                    Object[] objArr47 = new Object[1];
                                    o((short) 1852, (byte) (-bArr11[2018]), s17, objArr47);
                                    try {
                                        dkVar3.f41241d = ((Integer) cls17.getMethod(str9, Class.forName((String) objArr47[0]), Character.TYPE).invoke(null, objArr44)).intValue();
                                        i14 = 3;
                                        dkVar3.a(i14);
                                        i10 = 798;
                                        c10 = 788;
                                    } catch (Throwable th56) {
                                        th2 = th56;
                                        i10 = 798;
                                        c10 = 788;
                                        if (i20 >= 181) {
                                            throw th2;
                                        }
                                        if (i20 <= 185) {
                                            throw th2;
                                        }
                                        dkVar3.f41245h = th2;
                                        dkVar3.a(27);
                                        i20 = 179;
                                    }
                                    i19 = i20;
                                    dkVar3 = dkVar3;
                                    c10 = c10;
                                    i10 = i10;
                                } catch (Throwable th57) {
                                    Throwable cause11 = th57.getCause();
                                    if (cause11 == null) {
                                        throw th57;
                                    }
                                    throw cause11;
                                }
                                break;
                            case -5:
                                dkVar3.f41245h = "";
                                dkVar3.a(43);
                                i10 = i10;
                                c10 = c10;
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -4:
                                dkVar3.f41245h = new int[]{1120577506, -1541891296};
                                dkVar3.a(43);
                                i10 = i10;
                                c10 = c10;
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -3:
                                dkVar3.a(22);
                                int i26 = dkVar3.f41238a;
                                if (i26 == 97) {
                                    i19 = 4;
                                } else if (i26 == 104) {
                                    i19 = 51;
                                } else if (i26 == 114) {
                                    i19 = 65;
                                } else if (i26 == 118) {
                                    i19 = 84;
                                } else if (i26 != 100) {
                                    i19 = i26 != 101 ? 102 : 36;
                                } else {
                                    i19 = 18;
                                }
                                dkVar3 = dkVar3;
                                break;
                            case -2:
                                try {
                                    dkVar3.f41241d = 1;
                                    try {
                                        dkVar3.a(5);
                                        try {
                                            dkVar3.a(6);
                                            dkVar3.f41241d = dkVar3.f41243f.hashCode();
                                            try {
                                                dkVar3.a(3);
                                                i10 = i10;
                                                c10 = c10;
                                            } catch (Throwable th58) {
                                                th2 = th58;
                                                i10 = i10;
                                                c10 = c10;
                                                if (i20 >= 181) {
                                                    throw th2;
                                                }
                                                if (i20 <= 185) {
                                                    throw th2;
                                                }
                                                dkVar3.f41245h = th2;
                                                dkVar3.a(27);
                                                i20 = 179;
                                            }
                                        } catch (Throwable th59) {
                                            th2 = th59;
                                            i10 = i10;
                                            c10 = c10;
                                        }
                                    } catch (Throwable th60) {
                                        th2 = th60;
                                        i10 = i10;
                                        c10 = c10;
                                        if (i20 >= 181) {
                                            throw th2;
                                        }
                                        if (i20 <= 185) {
                                            throw th2;
                                        }
                                        dkVar3.f41245h = th2;
                                        dkVar3.a(27);
                                        i20 = 179;
                                    }
                                } catch (Throwable th61) {
                                    th2 = th61;
                                    i10 = i10;
                                    c10 = c10;
                                    if (i20 >= 181) {
                                        throw th2;
                                    }
                                    if (i20 <= 185) {
                                        throw th2;
                                    }
                                    dkVar3.f41245h = th2;
                                    dkVar3.a(27);
                                    i20 = 179;
                                }
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                            case -1:
                                i19 = 141;
                                dkVar3 = dkVar3;
                                break;
                            default:
                                i10 = i10;
                                c10 = c10;
                                i19 = i20;
                                dkVar3 = dkVar3;
                                c10 = c10;
                                i10 = i10;
                                break;
                        }
                    } catch (Throwable th62) {
                        th = th62;
                        th2 = th;
                        if (i20 >= 181) {
                            throw th2;
                        }
                        if (i20 <= 185) {
                            throw th2;
                        }
                        dkVar3.f41245h = th2;
                        dkVar3.a(27);
                        i20 = 179;
                        i19 = i20;
                        dkVar3 = dkVar3;
                        c10 = c10;
                        i10 = i10;
                    }
                } catch (Throwable th63) {
                    th = th63;
                    dkVar3 = dkVar3;
                }
            }
        } catch (Throwable th64) {
            Throwable cause12 = th64.getCause();
            if (cause12 == null) {
                throw th64;
            }
            throw cause12;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:47:0x02fb A[PHI: r2
      0x02fb: PHI (r2v29 int) = 
      (r2v5 int)
      (r2v8 int)
      (r2v9 int)
      (r2v12 int)
      (r2v13 int)
      (r2v14 int)
      (r2v15 int)
      (r2v4 int)
      (r2v16 int)
      (r2v17 int)
      (r2v18 int)
      (r2v4 int)
      (r2v19 int)
      (r2v4 int)
      (r2v20 int)
      (r2v21 int)
      (r2v4 int)
      (r2v22 int)
      (r2v23 int)
      (r2v4 int)
      (r2v24 int)
      (r2v25 int)
      (r2v26 int)
      (r2v4 int)
      (r2v27 int)
      (r2v4 int)
      (r2v4 int)
      (r2v28 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
      (r2v4 int)
     binds: [B:124:0x05e0, B:123:0x05dc, B:120:0x05c3, B:118:0x05bc, B:119:0x05c0, B:114:0x05a1, B:113:0x0597, B:111:0x0591, B:112:0x0593, B:109:0x057c, B:108:0x0572, B:106:0x056c, B:107:0x056e, B:104:0x054d, B:102:0x053e, B:101:0x0536, B:99:0x0530, B:100:0x0532, B:92:0x04f8, B:89:0x04a8, B:88:0x04a4, B:86:0x0498, B:85:0x0490, B:83:0x048b, B:84:0x048d, B:74:0x043f, B:56:0x037e, B:46:0x02f6, B:45:0x02e2, B:37:0x0260, B:25:0x01d0, B:15:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    private static void d(Context context) throws Throwable {
        int i10;
        Object objD;
        Integer num;
        Class cls;
        String str;
        int iIntValue;
        dk dkVar = new dk(context);
        int i11 = m;
        byte[] bArr = f40672l;
        Object[] objArr = new Object[1];
        o((short) (i11 | 2826), bArr[10], (short) (i11 | 264), objArr);
        char c10 = 0;
        String str2 = (String) objArr[0];
        byte b10 = bArr[5];
        Object[] objArr2 = new Object[1];
        o((short) (i11 | 25), b10, (short) (b10 | DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c11 = 2018;
            short s4 = (short) 789;
            Object[] objArr4 = new Object[1];
            o((short) (i11 | 25), (byte) (-bArr[2018]), s4, objArr4);
            Class<?> cls2 = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            o((short) 204, (byte) (bArr[3] - 1), (short) StatusCode.SUCCESS, objArr5);
            String str3 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            o((short) (i11 | 25), (byte) (-bArr[2018]), s4, objArr6);
            Object[] objArr7 = (Object[]) cls2.getMethod(str3, Class.forName((String) objArr6[0])).invoke(str2, objArr3);
            int[] iArr = new int[objArr7.length];
            int i12 = 0;
            while (i12 < objArr7.length) {
                Object[] objArr8 = new Object[1];
                objArr8[c10] = objArr7[i12];
                short s7 = (short) ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY;
                byte[] bArr2 = f40672l;
                short s9 = (short) 788;
                Object[] objArr9 = new Object[1];
                o(s7, (byte) (-bArr2[c11]), s9, objArr9);
                Class<?> cls3 = Class.forName((String) objArr9[c10]);
                Object[] objArr10 = new Object[1];
                o((short) 224, (byte) 74, (short) 798, objArr10);
                String str4 = (String) objArr10[c10];
                int i13 = m;
                Object[] objArr11 = objArr7;
                Object[] objArr12 = new Object[1];
                o((short) (i13 | 25), (byte) (-bArr2[2018]), s4, objArr12);
                Object objInvoke = cls3.getMethod(str4, Class.forName((String) objArr12[0])).invoke(null, objArr8);
                Object[] objArr13 = new Object[1];
                o(s7, (byte) (-bArr2[2018]), s9, objArr13);
                Class<?> cls4 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                o((short) (i13 | 66), (byte) (bArr2[4670] + 1), (short) 797, objArr14);
                iArr[i12] = ((Integer) cls4.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                i12++;
                objArr7 = objArr11;
                c10 = 0;
                c11 = 2018;
            }
            int i14 = 0;
            while (true) {
                int i15 = i14 + 1;
                switch (dkVar.a(iArr[i14])) {
                    case -50:
                        i15 = 102;
                        i14 = i15;
                        break;
                    case -49:
                        dkVar.a(22);
                        i15 = dkVar.f41238a != 0 ? 87 : 50;
                        i14 = i15;
                        break;
                    case -48:
                        i15 = 97;
                        i14 = i15;
                        break;
                    case -47:
                        dkVar.a(22);
                        int i16 = dkVar.f41238a;
                        i15 = (i16 == 0 || i16 != 1) ? 20 : 26;
                        i14 = i15;
                        break;
                    case -46:
                        i15 = 44;
                        i14 = i15;
                        break;
                    case -45:
                        i15 = 96;
                        i14 = i15;
                        break;
                    case -44:
                        dkVar.a(2);
                        if (dkVar.f41238a == 0) {
                            i15 = 95;
                        }
                        i14 = i15;
                        break;
                    case -43:
                        i15 = 9;
                        i14 = i15;
                        break;
                    case -42:
                        i15 = 86;
                        i14 = i15;
                        break;
                    case -41:
                        dkVar.a(16);
                        if (dkVar.f41238a == 0) {
                            i15 = 85;
                        }
                        i14 = i15;
                        break;
                    case -40:
                        dkVar.f41241d = 1;
                        dkVar.a(5);
                        dkVar.a(7);
                        f40671k = dkVar.f41238a;
                        i14 = i15;
                        break;
                    case -39:
                        i10 = f40673n;
                        dkVar.f41241d = i10;
                        dkVar.a(3);
                        i14 = i15;
                        break;
                    case -38:
                        i15 = 60;
                        i14 = i15;
                        break;
                    case -37:
                        i15 = 75;
                        i14 = i15;
                        break;
                    case -36:
                        dkVar.a(2);
                        if (dkVar.f41238a == 0) {
                            i15 = 74;
                        }
                        i14 = i15;
                        break;
                    case -35:
                        dkVar.f41241d = 1;
                        dkVar.a(5);
                        dkVar.a(7);
                        f40673n = dkVar.f41238a;
                        i14 = i15;
                        break;
                    case -34:
                        i10 = f40671k;
                        dkVar.f41241d = i10;
                        dkVar.a(3);
                        i14 = i15;
                        break;
                    case -33:
                        return;
                    case -32:
                        i14 = 1;
                        break;
                    case -31:
                        i15 = 66;
                        i14 = i15;
                        break;
                    case -30:
                        dkVar.f41241d = 1;
                        dkVar.a(5);
                        dkVar.a(6);
                        objD = cx.d((Runnable) dkVar.f41243f);
                        dkVar.f41245h = objD;
                        dkVar.a(43);
                        i14 = i15;
                        break;
                    case -29:
                        dkVar.f41241d = 2;
                        dkVar.a(5);
                        dkVar.a(6);
                        final Context context2 = (Context) dkVar.f41243f;
                        dkVar.a(7);
                        final int i17 = dkVar.f41238a;
                        dkVar.f41245h = new Runnable() { // from class: com.facetec.sdk.x5
                            @Override // java.lang.Runnable
                            public final void run() throws Throwable {
                                bn.d(context2, i17);
                            }
                        };
                        dkVar.a(43);
                        i14 = i15;
                        break;
                    case -28:
                        dkVar.f41241d = 2;
                        dkVar.a(5);
                        dkVar.a(6);
                        Context context3 = (Context) dkVar.f41243f;
                        dkVar.a(7);
                        e(context3, dkVar.f41238a);
                        i14 = i15;
                        break;
                    case -27:
                        i14 = i15;
                        break;
                    case -26:
                        i15 = 103;
                        i14 = i15;
                        break;
                    case -25:
                        i15 = 105;
                        i14 = i15;
                        break;
                    case -24:
                        dkVar.a(117);
                        if (dkVar.f41238a == 0) {
                            i15 = 43;
                        }
                        i14 = i15;
                        break;
                    case -23:
                        objD = ((Class) bp.a(26 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.getOffsetBefore("", 0) + 52, (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1))).getField("a").get(null);
                        dkVar.f41245h = objD;
                        dkVar.a(43);
                        i14 = i15;
                        break;
                    case -22:
                        i14 = 38;
                        break;
                    case -21:
                        i14 = 32;
                        break;
                    case -20:
                        dkVar.a(117);
                        if (dkVar.f41238a == 0) {
                            i14 = 31;
                        } else {
                            i14 = i15;
                        }
                        break;
                    case -19:
                        dkVar.f41241d = 2;
                        dkVar.a(5);
                        dkVar.a(6);
                        Context context4 = (Context) dkVar.f41243f;
                        dkVar.a(7);
                        Object[] objArr15 = {context4, Integer.valueOf(dkVar.f41238a)};
                        Map map = bp.f40694x;
                        Object method = map.get(-1760563864);
                        if (method == null) {
                            Class cls5 = (Class) bp.a(View.resolveSize(0, 0) + 23, 388 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (char) (Process.myTid() >> 22));
                            byte b11 = (byte) 0;
                            byte b12 = b11;
                            Object[] objArr16 = new Object[1];
                            r(b11, b12, b12, objArr16);
                            method = cls5.getMethod((String) objArr16[0], Context.class, Integer.TYPE);
                            map.put(-1760563864, method);
                        }
                        num = (Integer) ((Method) method).invoke(null, objArr15);
                        iIntValue = num.intValue();
                        dkVar.f41241d = iIntValue;
                        dkVar.a(3);
                        i14 = i15;
                        break;
                    case -18:
                        i14 = 26;
                        break;
                    case -17:
                        cls = (Class) bp.a(TextUtils.indexOf("", "", 0) + 26, View.MeasureSpec.getMode(0) + 52, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1));
                        str = "e";
                        dkVar.f41245h = cls.getField(str).get(null);
                        dkVar.a(43);
                        i14 = i15;
                        break;
                    case -16:
                        i14 = 98;
                        break;
                    case -15:
                        i14 = 100;
                        break;
                    case -14:
                        dkVar.a(117);
                        if (dkVar.f41238a == 0) {
                            i14 = 19;
                        } else {
                            i14 = i15;
                        }
                        break;
                    case -13:
                        dkVar.f41241d = 2;
                        dkVar.a(5);
                        dkVar.a(6);
                        Context context5 = (Context) dkVar.f41243f;
                        dkVar.a(7);
                        Object[] objArr17 = {context5, Integer.valueOf(dkVar.f41238a)};
                        Map map2 = bp.f40694x;
                        Object method2 = map2.get(1507967401);
                        if (method2 == null) {
                            Class cls6 = (Class) bp.a(23 - TextUtils.indexOf((CharSequence) "", '0', 0), Color.blue(0) + 765, (char) (ImageFormat.getBitsPerPixel(0) + 36774));
                            byte b13 = (byte) 0;
                            byte b14 = b13;
                            Object[] objArr18 = new Object[1];
                            r(b13, b14, b14, objArr18);
                            method2 = cls6.getMethod((String) objArr18[0], Context.class, Integer.TYPE);
                            map2.put(1507967401, method2);
                        }
                        num = (Integer) ((Method) method2).invoke(null, objArr17);
                        iIntValue = num.intValue();
                        dkVar.f41241d = iIntValue;
                        dkVar.a(3);
                        i14 = i15;
                        break;
                    case -12:
                        i15 = 62;
                        i14 = i15;
                        break;
                    case -11:
                        dkVar.f41241d = 1;
                        dkVar.a(5);
                        dkVar.a(7);
                        f40664d = dkVar.f41238a;
                        i14 = i15;
                        break;
                    case -10:
                        dkVar.f41241d = 1;
                        dkVar.a(5);
                        dkVar.a(6);
                        iIntValue = ((Class) bp.a(25 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 52 - (ViewConfiguration.getTapTimeout() >> 16), (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1))).getField("i").getInt(dkVar.f41243f);
                        dkVar.f41241d = iIntValue;
                        dkVar.a(3);
                        i14 = i15;
                        break;
                    case -9:
                        cls = (Class) bp.a((ViewConfiguration.getFadingEdgeLength() >> 16) + 26, 51 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (char) Color.green(0));
                        str = "c";
                        dkVar.f41245h = cls.getField(str).get(null);
                        dkVar.a(43);
                        i14 = i15;
                        break;
                    case -8:
                        iIntValue = f40664d;
                        dkVar.f41241d = iIntValue;
                        dkVar.a(3);
                        i14 = i15;
                        break;
                    case -7:
                        i14 = 15;
                        break;
                    case -6:
                        i14 = 76;
                        break;
                    case -5:
                        dkVar.a(117);
                        if (dkVar.f41238a == 0) {
                            i14 = 8;
                        } else {
                            i14 = i15;
                        }
                        break;
                    case -4:
                        dkVar.f41241d = 2;
                        dkVar.a(5);
                        dkVar.a(6);
                        Context context6 = (Context) dkVar.f41243f;
                        dkVar.a(7);
                        try {
                            Object[] objArr19 = {context6, Integer.valueOf(dkVar.f41238a)};
                            Map map3 = bp.f40694x;
                            Object method3 = map3.get(-1072783208);
                            if (method3 == null) {
                                Class cls7 = (Class) bp.a(24 - (ViewConfiguration.getLongPressTimeout() >> 16), KeyEvent.keyCodeFromString("") + 364, (char) ((ViewConfiguration.getTouchSlop() >> 8) + 11988));
                                byte b15 = (byte) ($$b & 11);
                                byte b16 = (byte) (b15 - 2);
                                Object[] objArr20 = new Object[1];
                                r(b15, b16, b16, objArr20);
                                method3 = cls7.getMethod((String) objArr20[0], Context.class, Integer.TYPE);
                                map3.put(-1072783208, method3);
                            }
                            num = (Integer) ((Method) method3).invoke(null, objArr19);
                            iIntValue = num.intValue();
                            dkVar.f41241d = iIntValue;
                            dkVar.a(3);
                            i14 = i15;
                        } catch (Throwable th2) {
                            Throwable cause = th2.getCause();
                            if (cause == null) {
                                throw th2;
                            }
                            throw cause;
                        }
                        break;
                    case -3:
                        dkVar.f41241d = 1;
                        dkVar.a(5);
                        dkVar.a(6);
                        Object obj = dkVar.f41243f;
                        short s10 = (short) 3366;
                        byte[] bArr3 = f40672l;
                        Object[] objArr21 = new Object[1];
                        o(s10, (byte) (-bArr3[2018]), s4, objArr21);
                        Class<?> cls8 = Class.forName((String) objArr21[0]);
                        Object[] objArr22 = new Object[1];
                        o((short) 3381, (byte) (bArr3[1841] + 1), (short) 798, objArr22);
                        iIntValue = ((Integer) cls8.getMethod((String) objArr22[0], null).invoke(obj, null)).intValue();
                        dkVar.f41241d = iIntValue;
                        dkVar.a(3);
                        i14 = i15;
                        break;
                    case -2:
                        Object[] objArr23 = new Object[1];
                        o((short) 3366, (byte) (-f40672l[2018]), s4, objArr23);
                        dkVar.f41245h = Class.forName((String) objArr23[0]).getDeclaredConstructor(null).newInstance(null);
                        dkVar.a(43);
                        i14 = i15;
                        break;
                    case -1:
                        i14 = 57;
                        break;
                    default:
                        i14 = i15;
                        break;
                }
            }
        } catch (Throwable th3) {
            Throwable cause2 = th3.getCause();
            if (cause2 == null) {
                throw th3;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:120:0x02d6 A[Catch: all -> 0x02bc, TryCatch #7 {all -> 0x02bc, blocks: (B:103:0x02b4, B:118:0x02d0, B:120:0x02d6, B:121:0x02d7, B:128:0x02f0, B:131:0x02fc), top: B:218:0x02b4 }] */
    /* JADX WARN: Code duplicated, block: B:121:0x02d7 A[Catch: all -> 0x02bc, TryCatch #7 {all -> 0x02bc, blocks: (B:103:0x02b4, B:118:0x02d0, B:120:0x02d6, B:121:0x02d7, B:128:0x02f0, B:131:0x02fc), top: B:218:0x02b4 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x034c A[PHI: r2 r7
      0x034c: PHI (r2v7 int) = (r2v5 int), (r2v8 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int), (r2v3 int) binds: [B:197:0x0435, B:177:0x03ec, B:170:0x03bc, B:165:0x03a5, B:157:0x0364, B:150:0x0342, B:67:0x023f, B:37:0x0192, B:23:0x0162] A[DONT_GENERATE, DONT_INLINE]
      0x034c: PHI (r7v17 com.facetec.sdk.dk) = 
      (r7v13 com.facetec.sdk.dk)
      (r7v18 com.facetec.sdk.dk)
      (r7v18 com.facetec.sdk.dk)
      (r7v18 com.facetec.sdk.dk)
      (r7v18 com.facetec.sdk.dk)
      (r7v18 com.facetec.sdk.dk)
      (r7v18 com.facetec.sdk.dk)
      (r7v18 com.facetec.sdk.dk)
      (r7v18 com.facetec.sdk.dk)
     binds: [B:197:0x0435, B:177:0x03ec, B:170:0x03bc, B:165:0x03a5, B:157:0x0364, B:150:0x0342, B:67:0x023f, B:37:0x0192, B:23:0x0162] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:191:0x0428 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:193:0x042d  */
    /* JADX WARN: Code duplicated, block: B:195:0x0431 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:261:0x043c A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    public static synchronized void a() {
        dk dkVar;
        char c10;
        Object obj;
        Throwable cause;
        int i10;
        dk dkVar2 = new dk();
        byte[] bArr = f40672l;
        int i11 = 1;
        Object[] objArr = new Object[1];
        o((short) 647, bArr[10], (short) 578, objArr);
        char c11 = 0;
        String str = (String) objArr[0];
        int i12 = m;
        byte b10 = bArr[5];
        Object[] objArr2 = new Object[1];
        o((short) (i12 | 25), b10, (short) (b10 | DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c12 = 2018;
            short s4 = (short) 789;
            Object[] objArr4 = new Object[1];
            o((short) (i12 | 25), (byte) (-bArr[2018]), s4, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            o((short) 204, (byte) (bArr[3] - 1), (short) StatusCode.SUCCESS, objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            o((short) (i12 | 25), (byte) (-bArr[2018]), s4, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i13 = 0;
            while (i13 < objArr7.length) {
                Object[] objArr8 = new Object[i11];
                objArr8[c11] = objArr7[i13];
                short s7 = (short) ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY;
                byte[] bArr2 = f40672l;
                short s9 = (short) 788;
                Object[] objArr9 = new Object[i11];
                o(s7, (byte) (-bArr2[c12]), s9, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[c11]);
                Object[] objArr10 = new Object[i11];
                o((short) 224, (byte) 74, (short) 798, objArr10);
                String str3 = (String) objArr10[0];
                Class<?>[] clsArr = new Class[i11];
                int i14 = m;
                Object[] objArr11 = objArr7;
                dk dkVar3 = dkVar2;
                Object[] objArr12 = new Object[1];
                o((short) (i14 | 25), (byte) (-bArr2[2018]), s4, objArr12);
                clsArr[0] = Class.forName((String) objArr12[0]);
                Object objInvoke = cls2.getMethod(str3, clsArr).invoke(null, objArr8);
                Object[] objArr13 = new Object[1];
                o(s7, (byte) (-bArr2[2018]), s9, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                o((short) (i14 | 66), (byte) (bArr2[4670] + 1), (short) 797, objArr14);
                iArr[i13] = ((Integer) cls3.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                i13++;
                dkVar2 = dkVar3;
                objArr7 = objArr11;
                c11 = 0;
                i11 = 1;
                c12 = 2018;
            }
            dk dkVar4 = dkVar2;
            int i15 = 0;
            while (true) {
                int i16 = i15 + 1;
                try {
                    dkVar = dkVar4;
                    try {
                        switch (dkVar.a(iArr[i15])) {
                            case -33:
                                i15 = 63;
                                dkVar4 = dkVar;
                                break;
                            case -32:
                                dkVar.a(22);
                                i15 = dkVar.f41238a != 0 ? 25 : 54;
                                dkVar4 = dkVar;
                                break;
                            case -31:
                                i15 = 58;
                                dkVar4 = dkVar;
                                break;
                            case -30:
                                try {
                                    dkVar.a(22);
                                    if (dkVar.f41238a != 0) {
                                        i16 = 37;
                                        i15 = i16;
                                    } else {
                                        i15 = 1;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    if (i16 < 38) {
                                        if (i16 >= 55) {
                                        }
                                        throw th;
                                    }
                                    if (i16 >= 55) {
                                    }
                                    throw th;
                                    dkVar.f41245h = th;
                                    dkVar.a(27);
                                }
                                dkVar4 = dkVar;
                                break;
                            case -29:
                                i15 = 64;
                                dkVar4 = dkVar;
                                break;
                            case -28:
                                i15 = 66;
                                dkVar4 = dkVar;
                                break;
                            case -27:
                                dkVar.a(2);
                                if (dkVar.f41238a == 0) {
                                    i15 = 52;
                                } else {
                                    i15 = i16;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -26:
                                c10 = 5;
                                try {
                                    dkVar.a(16);
                                    if (dkVar.f41238a == 0) {
                                        i15 = 42;
                                    } else {
                                        i15 = i16;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (i16 < 38) {
                                        if (i16 >= 55) {
                                        }
                                        throw th;
                                    }
                                    if (i16 >= 55) {
                                    }
                                    throw th;
                                    dkVar.f41245h = th;
                                    dkVar.a(27);
                                }
                                dkVar4 = dkVar;
                                break;
                            case -25:
                                c10 = 5;
                                obj = null;
                                dkVar.a(19);
                                throw ((Throwable) dkVar.f41243f);
                            case -24:
                                i15 = 59;
                                dkVar4 = dkVar;
                                break;
                            case -23:
                                i15 = 61;
                                dkVar4 = dkVar;
                                break;
                            case -22:
                                dkVar.a(2);
                                if (dkVar.f41238a == 0) {
                                    i15 = 35;
                                } else {
                                    i15 = i16;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -21:
                                obj = null;
                                try {
                                    dkVar.f41241d = 1;
                                    c10 = 5;
                                    try {
                                        dkVar.a(5);
                                        dkVar.a(7);
                                        f40673n = dkVar.f41238a;
                                    } catch (Throwable th4) {
                                        th = th4;
                                        if (i16 < 38) {
                                            if (i16 >= 55) {
                                            }
                                            throw th;
                                        }
                                        if (i16 >= 55) {
                                        }
                                        throw th;
                                        dkVar.f41245h = th;
                                        dkVar.a(27);
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    if (i16 < 38) {
                                        if (i16 >= 55) {
                                        }
                                        throw th;
                                    }
                                    if (i16 >= 55) {
                                    }
                                    throw th;
                                    dkVar.f41245h = th;
                                    dkVar.a(27);
                                }
                                i15 = i16;
                                dkVar4 = dkVar;
                                break;
                            case -20:
                                try {
                                    dkVar.f41241d = f40671k;
                                    try {
                                        dkVar.a(3);
                                    } catch (Throwable th6) {
                                        th = th6;
                                        if (i16 < 38) {
                                            if (i16 >= 55) {
                                            }
                                            throw th;
                                        }
                                        if (i16 >= 55) {
                                        }
                                        throw th;
                                        dkVar.f41245h = th;
                                        dkVar.a(27);
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                }
                                i15 = i16;
                                dkVar4 = dkVar;
                                break;
                            case -19:
                                i15 = 27;
                                dkVar4 = dkVar;
                                break;
                            case -18:
                                i15 = 43;
                                dkVar4 = dkVar;
                                break;
                            case -17:
                                dkVar.f41241d = 2;
                                c10 = 5;
                                try {
                                    dkVar.a(5);
                                    dkVar.a(6);
                                    String str4 = (String) dkVar.f41243f;
                                    dkVar.a(6);
                                    ch.J(str4, (String) dkVar.f41243f);
                                } catch (Throwable th8) {
                                    th = th8;
                                    if (i16 < 38) {
                                        if (i16 >= 55) {
                                        }
                                        throw th;
                                    }
                                    if (i16 >= 55) {
                                    }
                                    throw th;
                                    dkVar.f41245h = th;
                                    dkVar.a(27);
                                }
                                i15 = i16;
                                dkVar4 = dkVar;
                                break;
                            case -16:
                                try {
                                    dkVar.f41241d = 1;
                                    try {
                                        dkVar.a(5);
                                        try {
                                            dkVar.a(6);
                                            Object obj2 = dkVar.f41243f;
                                            short s10 = (short) 873;
                                            try {
                                                byte[] bArr3 = f40672l;
                                                Object[] objArr15 = new Object[1];
                                                o(s10, (byte) (-bArr3[198]), (short) 787, objArr15);
                                                try {
                                                    Class<?> cls4 = Class.forName((String) objArr15[0]);
                                                    try {
                                                        Object[] objArr16 = new Object[1];
                                                        o((short) StatusCode.ERROR_WHILE_PREPARING_HAPTICS, bArr3[3], (short) 797, objArr16);
                                                        try {
                                                            try {
                                                                try {
                                                                    dkVar.f41245h = cls4.getMethod((String) objArr16[0], null).invoke(obj2, null);
                                                                    dkVar.a(43);
                                                                } catch (Throwable th9) {
                                                                    th = th9;
                                                                    if (i16 < 38) {
                                                                        if (i16 >= 55) {
                                                                        }
                                                                        throw th;
                                                                    }
                                                                    if (i16 >= 55) {
                                                                    }
                                                                    throw th;
                                                                    dkVar.f41245h = th;
                                                                    dkVar.a(27);
                                                                }
                                                            } catch (Throwable th10) {
                                                                th = th10;
                                                                cause = th.getCause();
                                                                if (cause == null) {
                                                                    throw th;
                                                                }
                                                                throw cause;
                                                            }
                                                        } catch (Throwable th11) {
                                                            th = th11;
                                                            cause = th.getCause();
                                                            if (cause == null) {
                                                                throw th;
                                                            }
                                                            throw cause;
                                                        }
                                                    } catch (Throwable th12) {
                                                        th = th12;
                                                    }
                                                } catch (Throwable th13) {
                                                    th = th13;
                                                    cause = th.getCause();
                                                    if (cause == null) {
                                                        throw th;
                                                    }
                                                    throw cause;
                                                }
                                            } catch (Throwable th14) {
                                                th = th14;
                                            }
                                        } catch (Throwable th15) {
                                            th = th15;
                                            if (i16 < 38) {
                                                if (i16 >= 55) {
                                                }
                                                throw th;
                                            }
                                            if (i16 >= 55) {
                                            }
                                            throw th;
                                            dkVar.f41245h = th;
                                            dkVar.a(27);
                                            i15 = i16;
                                            dkVar4 = dkVar;
                                            break;
                                        }
                                    } catch (Throwable th16) {
                                        th = th16;
                                        if (i16 < 38) {
                                            if (i16 >= 55) {
                                            }
                                            throw th;
                                        }
                                        if (i16 >= 55) {
                                        }
                                        throw th;
                                        dkVar.f41245h = th;
                                        dkVar.a(27);
                                    }
                                } catch (Throwable th17) {
                                    th = th17;
                                    if (i16 < 38) {
                                        if (i16 >= 55) {
                                        }
                                        throw th;
                                    }
                                    if (i16 >= 55) {
                                    }
                                    throw th;
                                    dkVar.f41245h = th;
                                    dkVar.a(27);
                                }
                                i15 = i16;
                                dkVar4 = dkVar;
                                break;
                            case -15:
                                try {
                                    dkVar.f41241d = 1;
                                    try {
                                        dkVar.a(5);
                                        dkVar.a(6);
                                        try {
                                            Object[] objArr17 = {dkVar.f41243f};
                                            byte[] bArr4 = f40672l;
                                            Object[] objArr18 = new Object[1];
                                            o((short) 873, (byte) (-bArr4[198]), (short) 787, objArr18);
                                            Class<?> cls5 = Class.forName((String) objArr18[0]);
                                            Class<?>[] clsArr2 = new Class[1];
                                            try {
                                                Object[] objArr19 = new Object[1];
                                                o((short) 890, (byte) (-bArr4[2018]), (short) 785, objArr19);
                                                clsArr2[0] = Class.forName((String) objArr19[0]);
                                                try {
                                                    dkVar.f41245h = cls5.getDeclaredConstructor(clsArr2).newInstance(objArr17);
                                                    dkVar.a(43);
                                                } catch (Throwable th18) {
                                                    th = th18;
                                                    if (i16 < 38) {
                                                        if (i16 >= 55) {
                                                        }
                                                        throw th;
                                                    }
                                                    if (i16 >= 55) {
                                                    }
                                                    throw th;
                                                    dkVar.f41245h = th;
                                                    dkVar.a(27);
                                                }
                                            } catch (Throwable th19) {
                                                th = th19;
                                                Throwable cause2 = th.getCause();
                                                if (cause2 == null) {
                                                    throw th;
                                                }
                                                throw cause2;
                                            }
                                        } catch (Throwable th20) {
                                            th = th20;
                                        }
                                    } catch (Throwable th21) {
                                        th = th21;
                                        if (i16 < 38 && i16 <= 43) {
                                            i16 = 36;
                                        } else {
                                            if (i16 >= 55 || i16 > 58) {
                                                throw th;
                                            }
                                            i16 = 53;
                                        }
                                        dkVar.f41245h = th;
                                        dkVar.a(27);
                                    }
                                } catch (Throwable th22) {
                                    th = th22;
                                    if (i16 < 38) {
                                        if (i16 >= 55) {
                                        }
                                        throw th;
                                    }
                                    if (i16 >= 55) {
                                    }
                                    throw th;
                                    dkVar.f41245h = th;
                                    dkVar.a(27);
                                    i15 = i16;
                                    dkVar4 = dkVar;
                                    break;
                                }
                                i15 = i16;
                                dkVar4 = dkVar;
                                break;
                            case -14:
                                dkVar.f41245h = f40661a;
                                dkVar.a(43);
                                i15 = i16;
                                dkVar4 = dkVar;
                                break;
                            case -13:
                                dkVar.f41245h = ak.Z;
                                dkVar.a(43);
                                i15 = i16;
                                dkVar4 = dkVar;
                                break;
                            case -12:
                                dkVar.f41241d = f40665e;
                                i10 = 3;
                                try {
                                    dkVar.a(i10);
                                } catch (Throwable th23) {
                                    th = th23;
                                    if (i16 < 38) {
                                        if (i16 >= 55) {
                                        }
                                        throw th;
                                    }
                                    if (i16 >= 55) {
                                    }
                                    throw th;
                                    dkVar.f41245h = th;
                                    dkVar.a(27);
                                }
                                i15 = i16;
                                dkVar4 = dkVar;
                                break;
                            case -11:
                                dkVar.f41245h = ak.ab;
                                dkVar.a(43);
                                i15 = i16;
                                dkVar4 = dkVar;
                                break;
                            case -10:
                                dkVar.f41241d = f40663c;
                                i10 = 3;
                                dkVar.a(i10);
                                i15 = i16;
                                dkVar4 = dkVar;
                                break;
                            case -9:
                                dkVar.f41245h = ak.f40278aa;
                                dkVar.a(43);
                                i15 = i16;
                                dkVar4 = dkVar;
                                break;
                            case -8:
                                dkVar.f41241d = 2;
                                try {
                                    dkVar.a(5);
                                    dkVar.a(6);
                                    String str5 = (String) dkVar.f41243f;
                                    dkVar.a(7);
                                    ch.I(str5, dkVar.f41238a);
                                } catch (Throwable th24) {
                                    th = th24;
                                    if (i16 < 38) {
                                        if (i16 >= 55) {
                                        }
                                        throw th;
                                    }
                                    if (i16 >= 55) {
                                    }
                                    throw th;
                                    dkVar.f41245h = th;
                                    dkVar.a(27);
                                }
                                i15 = i16;
                                dkVar4 = dkVar;
                                break;
                            case -7:
                                dkVar.f41245h = ak.Y;
                                dkVar.a(43);
                                i15 = i16;
                                dkVar4 = dkVar;
                                break;
                            case -6:
                                break;
                            case -5:
                                dkVar4 = dkVar;
                                i15 = 6;
                                break;
                            case -4:
                                dkVar4 = dkVar;
                                i15 = 5;
                                break;
                            case -3:
                                dkVar.a(16);
                                if (dkVar.f41238a == 0) {
                                    i15 = 4;
                                } else {
                                    i15 = i16;
                                }
                                dkVar4 = dkVar;
                                break;
                            case -2:
                                dkVar.f41241d = ch.a() ? 1 : 0;
                                i10 = 3;
                                dkVar.a(i10);
                                i15 = i16;
                                dkVar4 = dkVar;
                                break;
                            case -1:
                                i15 = 21;
                                dkVar4 = dkVar;
                                break;
                            default:
                                i15 = i16;
                                dkVar4 = dkVar;
                                break;
                        }
                    } catch (Throwable th25) {
                        th = th25;
                        if (i16 < 38) {
                            if (i16 >= 55) {
                            }
                            throw th;
                        }
                        if (i16 >= 55) {
                        }
                        throw th;
                        dkVar.f41245h = th;
                        dkVar.a(27);
                        i15 = i16;
                        dkVar4 = dkVar;
                    }
                } catch (Throwable th26) {
                    th = th26;
                    dkVar = dkVar4;
                }
            }
        } catch (Throwable th27) {
            Throwable cause3 = th27.getCause();
            if (cause3 == null) {
                throw th27;
            }
            throw cause3;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x013b. Please report as an issue. */
    public static void c(Context context) throws Throwable {
        int i10;
        dk dkVar = new dk(context);
        byte[] bArr = f40672l;
        byte b10 = bArr[10];
        Object[] objArr = new Object[1];
        o((short) 916, b10, (short) (b10 | 698), objArr);
        int i11 = 0;
        String str = (String) objArr[0];
        int i12 = m;
        byte b11 = bArr[5];
        Object[] objArr2 = new Object[1];
        o((short) (i12 | 25), b11, (short) (b11 | DigipassSDKConstants.SECURE_CHANNEL_MESSAGE_TYPE_INFORMATION_MESSAGE), objArr2);
        try {
            Object[] objArr3 = {(String) objArr2[0]};
            char c10 = 2018;
            short s4 = (short) 789;
            Object[] objArr4 = new Object[1];
            o((short) (i12 | 25), (byte) (-bArr[2018]), s4, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            o((short) 204, (byte) (bArr[3] - 1), (short) StatusCode.SUCCESS, objArr5);
            String str2 = (String) objArr5[0];
            Object[] objArr6 = new Object[1];
            o((short) (i12 | 25), (byte) (-bArr[2018]), s4, objArr6);
            Object[] objArr7 = (Object[]) cls.getMethod(str2, Class.forName((String) objArr6[0])).invoke(str, objArr3);
            int[] iArr = new int[objArr7.length];
            int i13 = 0;
            while (i13 < objArr7.length) {
                Object[] objArr8 = new Object[1];
                objArr8[i11] = objArr7[i13];
                short s7 = (short) ErrorCodes.ERR_CRY_BAD_REC_RSA_PUBKEY;
                byte[] bArr2 = f40672l;
                short s9 = (short) 788;
                Object[] objArr9 = new Object[1];
                o(s7, (byte) (-bArr2[c10]), s9, objArr9);
                Class<?> cls2 = Class.forName((String) objArr9[i11]);
                Object[] objArr10 = new Object[1];
                o((short) 224, (byte) 74, (short) 798, objArr10);
                String str3 = (String) objArr10[i11];
                int i14 = m;
                Object[] objArr11 = objArr7;
                Object[] objArr12 = new Object[1];
                o((short) (i14 | 25), (byte) (-bArr2[2018]), s4, objArr12);
                Object objInvoke = cls2.getMethod(str3, Class.forName((String) objArr12[0])).invoke(null, objArr8);
                Object[] objArr13 = new Object[1];
                o(s7, (byte) (-bArr2[2018]), s9, objArr13);
                Class<?> cls3 = Class.forName((String) objArr13[0]);
                Object[] objArr14 = new Object[1];
                o((short) (i14 | 66), (byte) (bArr2[4670] + 1), (short) 797, objArr14);
                iArr[i13] = ((Integer) cls3.getMethod((String) objArr14[0], null).invoke(objInvoke, null)).intValue();
                i13++;
                c10 = 2018;
                i11 = 0;
                objArr7 = objArr11;
            }
            while (true) {
                int i15 = i11 + 1;
                switch (dkVar.a(iArr[i11])) {
                    case -17:
                        i11 = 1;
                        break;
                    case -16:
                        i15 = 32;
                        break;
                    case -15:
                        dkVar.a(16);
                        if (dkVar.f41238a == 0) {
                            i15 = 31;
                        }
                        break;
                    case -14:
                        dkVar.f41241d = 1;
                        dkVar.a(5);
                        dkVar.a(7);
                        f40671k = dkVar.f41238a;
                        break;
                    case -13:
                        i10 = f40673n;
                        dkVar.f41241d = i10;
                        dkVar.a(3);
                        break;
                    case -12:
                        i11 = 10;
                        break;
                    case -11:
                        i11 = 21;
                        break;
                    case -10:
                        dkVar.a(2);
                        i11 = dkVar.f41238a == 0 ? 20 : i15;
                        break;
                    case -9:
                        dkVar.f41241d = 1;
                        dkVar.a(5);
                        dkVar.a(7);
                        f40673n = dkVar.f41238a;
                        break;
                    case -8:
                        i10 = f40671k;
                        dkVar.f41241d = i10;
                        dkVar.a(3);
                        break;
                    case -7:
                        break;
                    case -6:
                        i11 = 22;
                        break;
                    case -5:
                        i11 = 12;
                        break;
                    case -4:
                        e();
                        break;
                    case -3:
                        dkVar.f41241d = 1;
                        dkVar.a(5);
                        dkVar.a(6);
                        dkVar.f41245h = cx.d((Runnable) dkVar.f41243f);
                        dkVar.a(43);
                        break;
                    case -2:
                        dkVar.f41241d = 1;
                        dkVar.a(5);
                        dkVar.a(6);
                        dkVar.f41245h = new l1((Context) dkVar.f41243f, 3);
                        dkVar.a(43);
                        break;
                    case -1:
                        i11 = 7;
                        break;
                    default:
                        break;
                }
                return;
            }
        } catch (Throwable th2) {
            Throwable cause = th2.getCause();
            if (cause == null) {
                throw th2;
            }
            throw cause;
        }
    }

    public static void c(Context context, String str, Exception exc) {
        c(new Object[]{context, str, exc}, -1113264220, 1113264220, (int) System.currentTimeMillis());
    }
}
