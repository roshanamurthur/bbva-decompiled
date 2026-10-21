package com.facetec.sdk;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.bbva.component.dm.headers.EtagInterceptor;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.sl.ar.core.libmcrypt.exception.ErrorCodes;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
public final class lc implements km {
    private static final byte[] $$a = null;
    private static final int $$b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static int f42250c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private lh f42251e;

    static {
        init$0();
        f42250c = -1817348564;
    }

    public lc(lh lhVar) {
        this.f42251e = lhVar;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:41:0x01a7  */
    private static void a(int i10, int i11, int i12, String str, boolean z10, Object[] objArr) throws Throwable {
        int i13;
        Throwable cause;
        char[] charArray = str != null ? str.toCharArray() : str;
        gz gzVar = new gz();
        char[] cArr = new char[i12];
        int i14 = 0;
        gzVar.f41846c = 0;
        while (true) {
            int i15 = gzVar.f41846c;
            if (i15 >= i12) {
                break;
            }
            char c10 = charArray[i15];
            gzVar.f41844a = c10;
            char c11 = (char) (i10 + c10);
            cArr[i15] = c11;
            try {
                Object[] objArr2 = new Object[2];
                objArr2[1] = Integer.valueOf(f42250c);
                objArr2[i14] = Integer.valueOf(c11);
                Map map = bp.f40694x;
                Object method = map.get(1917901234);
                if (method == null) {
                    Class cls = (Class) bp.a(Color.alpha(i14) + 23, 1026 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (char) (Gravity.getAbsoluteGravity(i14, i14) + 38453));
                    byte b10 = (byte) i14;
                    byte b11 = b10;
                    Object[] objArr3 = new Object[1];
                    d(b10, b11, b11, objArr3);
                    String str2 = (String) objArr3[0];
                    Class<?> cls2 = Integer.TYPE;
                    method = cls.getMethod(str2, cls2, cls2);
                    map.put(1917901234, method);
                }
                cArr[i15] = ((Character) ((Method) method).invoke(null, objArr2)).charValue();
                Object[] objArr4 = {gzVar, gzVar};
                Object method2 = map.get(-1709307603);
                if (method2 == null) {
                    Class cls3 = (Class) bp.a(24 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), Color.red(0) + 765, (char) (36773 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))));
                    byte b12 = (byte) 0;
                    byte b13 = (byte) (b12 + 1);
                    Object[] objArr5 = new Object[1];
                    d(b12, b13, (byte) (b13 - 1), objArr5);
                    method2 = cls3.getMethod((String) objArr5[0], Object.class, Object.class);
                    map.put(-1709307603, method2);
                }
                ((Method) method2).invoke(null, objArr4);
                i14 = 0;
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
        if (i11 > 0) {
            gzVar.f41845b = i11;
            char[] cArr2 = new char[i12];
            i13 = 0;
            System.arraycopy(cArr, 0, cArr2, 0, i12);
            int i16 = gzVar.f41845b;
            System.arraycopy(cArr2, 0, cArr, i12 - i16, i16);
            int i17 = gzVar.f41845b;
            System.arraycopy(cArr2, i17, cArr, 0, i12 - i17);
        } else {
            i13 = 0;
        }
        if (z10) {
            char[] cArr3 = new char[i12];
            gzVar.f41846c = i13;
            while (true) {
                int i18 = gzVar.f41846c;
                if (i18 >= i12) {
                    break;
                }
                cArr3[i18] = cArr[(i12 - i18) - 1];
                Object[] objArr6 = {gzVar, gzVar};
                Map map2 = bp.f40694x;
                Object method3 = map2.get(-1709307603);
                if (method3 == null) {
                    Class cls4 = (Class) bp.a(TextUtils.lastIndexOf("", '0', 0, 0) + 25, 765 - TextUtils.indexOf("", "", 0, 0), (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 36773));
                    byte b14 = (byte) 0;
                    byte b15 = (byte) (b14 + 1);
                    Object[] objArr7 = new Object[1];
                    d(b14, b15, (byte) (b15 - 1), objArr7);
                    method3 = cls4.getMethod((String) objArr7[0], Object.class, Object.class);
                    map2.put(-1709307603, method3);
                }
                ((Method) method3).invoke(null, objArr6);
            }
            cArr = cArr3;
        }
        objArr[0] = new String(cArr);
    }

    private static kq b(kq kqVar) {
        return (kqVar == null || kqVar.a() == null) ? kqVar : kqVar.j().c(null).c();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a  */
    /* JADX WARN: Code duplicated, block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:10:0x002a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private static void d(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            int r7 = r7 * 5
            int r7 = r7 + 101
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r1 = com.facetec.sdk.lc.$$a
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L1a
            r7 = r6
            r3 = r1
            r4 = r2
            r1 = r0
            r0 = r9
            r9 = r8
            goto L34
        L1a:
            r3 = r2
        L1b:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2a:
            r3 = r1[r8]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r9 = r8
            r8 = r5
        L34:
            int r6 = -r6
            int r6 = r6 + r8
            int r8 = r9 + 1
            r9 = r0
            r0 = r1
            r1 = r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facetec.sdk.lc.d(short, int, short, java.lang.Object[]):void");
    }

    private static boolean e(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || DigipassManagerConstants.KEY_CONTENT_TYPE.equalsIgnoreCase(str);
    }

    public static void init$0() {
        $$a = new byte[]{124, -5, 68, -34};
        $$b = 42;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0317  */
    /* JADX WARN: Code duplicated, block: B:121:0x0328  */
    /* JADX WARN: Code duplicated, block: B:127:0x033b  */
    /* JADX WARN: Code duplicated, block: B:129:0x0343  */
    /* JADX WARN: Code duplicated, block: B:131:0x035b  */
    /* JADX WARN: Code duplicated, block: B:145:0x0391  */
    /* JADX WARN: Code duplicated, block: B:153:0x03e1  */
    /* JADX WARN: Code duplicated, block: B:156:0x0406  */
    /* JADX WARN: Code duplicated, block: B:61:0x0183  */
    /* JADX WARN: Code duplicated, block: B:64:0x018d  */
    /* JADX WARN: Code duplicated, block: B:67:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:88:0x0206  */
    /* JADX WARN: Code duplicated, block: B:90:0x020a  */
    /* JADX WARN: Code duplicated, block: B:91:0x020d  */
    /* JADX WARN: Code duplicated, block: B:93:0x0213  */
    /* JADX WARN: Code duplicated, block: B:94:0x0216  */
    /* JADX WARN: Code duplicated, block: B:96:0x021a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0249  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v43, types: [com.facetec.sdk.kq, com.facetec.sdk.kr] */
    /* JADX WARN: Type inference failed for: r3v58 */
    @Override // com.facetec.sdk.km
    public final kq c(km.e eVar) throws Throwable {
        kq kqVarE;
        lf lfVar;
        long j10;
        long time;
        String string;
        long millis;
        long millis2;
        String str;
        String str2;
        long j11;
        kq.d dVarJ;
        lf lfVar2;
        kr krVar;
        kq kqVar;
        int i10;
        kq kqVarB;
        kq kqVarC;
        ns nsVarA;
        kj kjVarC;
        kj kjVarC2;
        kj.d dVar;
        int iA;
        int i11;
        int iA2;
        String strE;
        String strE2;
        String strC;
        String str3 = "";
        lh lhVar = this.f42251e;
        ?? r3 = 0;
        r3 = 0;
        if (lhVar != null) {
            eVar.d();
            kqVarE = lhVar.e();
        } else {
            kqVarE = null;
        }
        try {
            Object[] objArr = new Object[1];
            a(View.resolveSize(0, 0) + 202, (ViewConfiguration.getWindowTouchSlop() >> 8) + 2, 16 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), "\uffff\b\u000b\u0003\u0012\u0011\u0017\ufff1ￌ\u0005\f\uffff\nￌ\uffff\u0014", true, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(Color.rgb(0, 0, 0) + 16777425, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 11, AndroidCharacter.getMirror('0') - 31, "￫\u0000\u0004￼￤\u0000\u0003\u0003\u0000\n\ufffa\f\t\t￼\u0005\u000b", false, objArr2);
            lf.b bVar = new lf.b(((Long) cls.getMethod((String) objArr2[0], null).invoke(null, null)).longValue(), eVar.d(), kqVarE);
            if (bVar.f42280a != null) {
                if (!(bVar.f42284e.h() && bVar.f42280a.f42127b == null) && lf.d(bVar.f42280a, bVar.f42284e)) {
                    jx jxVarJ = bVar.f42284e.j();
                    if (jxVarJ.e() || lf.b.b(bVar.f42284e)) {
                        str3 = "";
                        lfVar = new lf(bVar.f42284e, null);
                    } else {
                        jx jxVarH = bVar.f42280a.h();
                        Date date = bVar.f42282c;
                        long jMax = date != null ? Math.max(0L, bVar.f42286g - date.getTime()) : 0L;
                        int i12 = bVar.f42290n;
                        if (i12 != -1) {
                            jMax = Math.max(jMax, TimeUnit.SECONDS.toMillis(i12));
                        }
                        long j12 = bVar.f42286g;
                        long j13 = jMax + (j12 - bVar.f42285f) + (bVar.f42281b - j12);
                        jx jxVarH2 = bVar.f42280a.h();
                        if (jxVarH2.d() != -1) {
                            time = TimeUnit.SECONDS.toMillis(jxVarH2.d());
                        } else {
                            if (bVar.f42287h != null) {
                                Date date2 = bVar.f42282c;
                                time = bVar.f42287h.getTime() - (date2 != null ? date2.getTime() : bVar.f42286g);
                                if (time <= 0) {
                                    time = 0;
                                }
                            } else if (bVar.f42288i != null) {
                                kk kkVarA = bVar.f42280a.b().a();
                                if (kkVarA.f42043c == null) {
                                    string = null;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    kk.e(sb2, kkVarA.f42043c);
                                    string = sb2.toString();
                                }
                                if (string == null) {
                                    Date date3 = bVar.f42282c;
                                    long time2 = (date3 != null ? date3.getTime() : bVar.f42285f) - bVar.f42288i.getTime();
                                    j10 = 0;
                                    if (time2 > 0) {
                                        time = time2 / 10;
                                    }
                                } else {
                                    j10 = 0;
                                }
                                time = j10;
                            } else {
                                j10 = 0;
                                time = j10;
                            }
                            if (jxVarJ.d() != -1) {
                                time = Math.min(time, TimeUnit.SECONDS.toMillis(jxVarJ.d()));
                            }
                            if (jxVarJ.i() != -1) {
                                millis = TimeUnit.SECONDS.toMillis(jxVarJ.i());
                            } else {
                                millis = 0;
                            }
                            if (!jxVarH.f() || jxVarJ.h() == -1) {
                                millis2 = 0;
                            } else {
                                millis2 = TimeUnit.SECONDS.toMillis(jxVarJ.h());
                            }
                            if (jxVarH.e()) {
                                str = bVar.f42291o;
                                if (str != null) {
                                    str2 = EtagInterceptor.HEADER_IF_NONE_MATCH;
                                } else {
                                    str2 = "If-Modified-Since";
                                    if (bVar.f42288i != null) {
                                        str = bVar.f42289j;
                                    } else if (bVar.f42282c != null) {
                                        str = bVar.f42283d;
                                    } else {
                                        r3 = 0;
                                        lfVar = new lf(bVar.f42284e, null);
                                    }
                                }
                                kj.d dVarB = bVar.f42284e.d().b();
                                kv.f42195e.b(dVarB, str2, str);
                                kr.a aVarB = bVar.f42284e.b();
                                aVarB.f42156a = dVarB.d().b();
                                lfVar = new lf(aVarB.e(), bVar.f42280a);
                                r3 = 0;
                            } else {
                                j11 = millis + j13;
                                if (j11 < millis2 + time) {
                                    dVarJ = bVar.f42280a.j();
                                    if (j11 >= time) {
                                        dVarJ.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                    }
                                    if (j13 > 86400000 && bVar.b()) {
                                        dVarJ.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                    }
                                    r3 = 0;
                                    lfVar = new lf(null, dVarJ.c());
                                } else {
                                    str = bVar.f42291o;
                                    if (str != null) {
                                        str2 = EtagInterceptor.HEADER_IF_NONE_MATCH;
                                    } else {
                                        str2 = "If-Modified-Since";
                                        if (bVar.f42288i != null) {
                                            str = bVar.f42289j;
                                        } else if (bVar.f42282c != null) {
                                            str = bVar.f42283d;
                                        } else {
                                            r3 = 0;
                                            lfVar = new lf(bVar.f42284e, null);
                                        }
                                    }
                                    kj.d dVarB2 = bVar.f42284e.d().b();
                                    kv.f42195e.b(dVarB2, str2, str);
                                    kr.a aVarB2 = bVar.f42284e.b();
                                    aVarB2.f42156a = dVarB2.d().b();
                                    lfVar = new lf(aVarB2.e(), bVar.f42280a);
                                    r3 = 0;
                                }
                            }
                        }
                        if (jxVarJ.d() != -1) {
                            time = Math.min(time, TimeUnit.SECONDS.toMillis(jxVarJ.d()));
                        }
                        if (jxVarJ.i() != -1) {
                            millis = TimeUnit.SECONDS.toMillis(jxVarJ.i());
                        } else {
                            millis = 0;
                        }
                        if (jxVarH.f()) {
                            millis2 = 0;
                        } else {
                            millis2 = 0;
                        }
                        if (jxVarH.e()) {
                            j11 = millis + j13;
                            if (j11 < millis2 + time) {
                                dVarJ = bVar.f42280a.j();
                                if (j11 >= time) {
                                    dVarJ.a("Warning", "110 HttpURLConnection \"Response is stale\"");
                                }
                                if (j13 > 86400000) {
                                    dVarJ.a("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                }
                                r3 = 0;
                                lfVar = new lf(null, dVarJ.c());
                            } else {
                                str = bVar.f42291o;
                                if (str != null) {
                                    str2 = EtagInterceptor.HEADER_IF_NONE_MATCH;
                                } else {
                                    str2 = "If-Modified-Since";
                                    if (bVar.f42288i != null) {
                                        str = bVar.f42289j;
                                    } else if (bVar.f42282c != null) {
                                        str = bVar.f42283d;
                                    } else {
                                        r3 = 0;
                                        lfVar = new lf(bVar.f42284e, null);
                                    }
                                }
                                kj.d dVarB3 = bVar.f42284e.d().b();
                                kv.f42195e.b(dVarB3, str2, str);
                                kr.a aVarB3 = bVar.f42284e.b();
                                aVarB3.f42156a = dVarB3.d().b();
                                lfVar = new lf(aVarB3.e(), bVar.f42280a);
                                r3 = 0;
                            }
                        } else {
                            str = bVar.f42291o;
                            if (str != null) {
                                str2 = EtagInterceptor.HEADER_IF_NONE_MATCH;
                            } else {
                                str2 = "If-Modified-Since";
                                if (bVar.f42288i != null) {
                                    str = bVar.f42289j;
                                } else if (bVar.f42282c != null) {
                                    str = bVar.f42283d;
                                } else {
                                    r3 = 0;
                                    lfVar = new lf(bVar.f42284e, null);
                                }
                            }
                            kj.d dVarB4 = bVar.f42284e.d().b();
                            kv.f42195e.b(dVarB4, str2, str);
                            kr.a aVarB4 = bVar.f42284e.b();
                            aVarB4.f42156a = dVarB4.d().b();
                            lfVar = new lf(aVarB4.e(), bVar.f42280a);
                            r3 = 0;
                        }
                    }
                } else {
                    lfVar2 = new lf(bVar.f42284e, null);
                }
                if (lfVar.f42278c != null && bVar.f42284e.j().j()) {
                    lfVar = new lf(r3, r3);
                }
                krVar = lfVar.f42278c;
                kqVar = lfVar.f42279e;
                if (kqVarE != null && kqVar == null) {
                    kz.a(kqVarE.a());
                }
                if (krVar != null && kqVar == null) {
                    kq.d dVarB5 = new kq.d().a(eVar.d()).e(ko.HTTP_1_1).d(504).d("Unsatisfiable Request (only-if-cached)").c(kz.f42209d).b(-1L);
                    try {
                        Object[] objArr3 = new Object[1];
                        a(202 - View.MeasureSpec.getSize(0), 3 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 16 - Color.blue(0), "\uffff\b\u000b\u0003\u0012\u0011\u0017\ufff1ￌ\u0005\f\uffff\nￌ\uffff\u0014", true, objArr3);
                        Class<?> cls2 = Class.forName((String) objArr3[0]);
                        Object[] objArr4 = new Object[1];
                        a(TextUtils.indexOf(str3, str3, 0, 0) + ErrorCodes.ERR_CRY_BAD_PROTO, 10 - TextUtils.getCapsMode(str3, 0, 0), 16 - TextUtils.lastIndexOf(str3, '0', 0, 0), "￫\u0000\u0004￼￤\u0000\u0003\u0003\u0000\n\ufffa\f\t\t￼\u0005\u000b", false, objArr4);
                        return dVarB5.d(((Long) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).longValue()).c();
                    } catch (Throwable th2) {
                        th = th2;
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                }
                if (krVar == null) {
                    return kqVar.j().d(b(kqVar)).c();
                }
                try {
                    kqVarB = eVar.b(krVar);
                    if (kqVarB == null && kqVarE != null) {
                        kz.a(kqVarE.a());
                    }
                    if (kqVar != null) {
                        if (kqVarB.e() == 304) {
                            kq.d dVarJ2 = kqVar.j();
                            kjVarC = kqVar.c();
                            kjVarC2 = kqVarB.c();
                            dVar = new kj.d();
                            iA = kjVarC.a();
                            for (i11 = 0; i11 < iA; i11++) {
                                strE2 = kjVarC.e(i11);
                                strC = kjVarC.c(i11);
                                if (("Warning".equalsIgnoreCase(strE2) || !strC.startsWith("1")) && (e(strE2) || !c(strE2) || kjVarC2.b(strE2) == null)) {
                                    kv.f42195e.b(dVar, strE2, strC);
                                }
                            }
                            iA2 = kjVarC2.a();
                            for (i10 = 0; i10 < iA2; i10++) {
                                strE = kjVarC2.e(i10);
                                if (e(strE) && c(strE)) {
                                    kv.f42195e.b(dVar, strE, kjVarC2.c(i10));
                                }
                            }
                            kq kqVarC2 = dVarJ2.e(dVar.d()).b(kqVarB.g()).d(kqVarB.i()).d(b(kqVar)).e(b(kqVarB)).c();
                            kqVarB.a().close();
                            return kqVarC2;
                        }
                        kz.a(kqVar.a());
                    }
                    kqVarC = kqVarB.j().d(b(kqVar)).e(b(kqVarB)).c();
                    if (this.f42251e != null) {
                        if (!lp.d(kqVarC) && lf.d(kqVarC, krVar)) {
                            final ky kyVarD = this.f42251e.d();
                            if (kyVarD == null || (nsVarA = kyVarD.a()) == null) {
                                return kqVarC;
                            }
                            final nh nhVarB = kqVarC.a().b();
                            final ni niVarC = no.c(nsVarA);
                            return kqVarC.j().c(new lw(kqVarC.d(DigipassManagerConstants.KEY_CONTENT_TYPE), kqVarC.a().c(), no.c(new nz() { // from class: com.facetec.sdk.lc.3

                                /* JADX INFO: renamed from: e, reason: collision with root package name */
                                private boolean f42256e;

                                @Override // com.facetec.sdk.nz
                                public final ny a() {
                                    return nhVarB.a();
                                }

                                @Override // com.facetec.sdk.nz, java.io.Closeable, java.lang.AutoCloseable
                                public final void close() throws IOException {
                                    if (!this.f42256e && !kz.c(this, TimeUnit.MILLISECONDS)) {
                                        this.f42256e = true;
                                    }
                                    nhVarB.close();
                                }

                                @Override // com.facetec.sdk.nz
                                public final long d(nb nbVar, long j14) throws IOException {
                                    try {
                                        long jD = nhVarB.d(nbVar, j14);
                                        if (jD != -1) {
                                            nbVar.d(niVarC.d(), nbVar.b() - jD, jD);
                                            niVarC.t();
                                            return jD;
                                        }
                                        if (!this.f42256e) {
                                            this.f42256e = true;
                                            niVarC.close();
                                        }
                                        return -1L;
                                    } catch (IOException e5) {
                                        if (!this.f42256e) {
                                            this.f42256e = true;
                                        }
                                        throw e5;
                                    }
                                }
                            }))).c();
                        }
                        lv.b(krVar.c());
                    }
                    return kqVarC;
                } catch (Throwable th3) {
                    if (kqVarE == null) {
                        throw th3;
                    }
                    kz.a(kqVarE.a());
                    throw th3;
                }
            }
            lfVar2 = new lf(bVar.f42284e, null);
            lf lfVar3 = lfVar2;
            str3 = "";
            lfVar = lfVar3;
            if (lfVar.f42278c != null) {
                lfVar = new lf(r3, r3);
            }
            krVar = lfVar.f42278c;
            kqVar = lfVar.f42279e;
            if (kqVarE != null) {
                kz.a(kqVarE.a());
            }
            if (krVar != null) {
            }
            if (krVar == null) {
                return kqVar.j().d(b(kqVar)).c();
            }
            kqVarB = eVar.b(krVar);
            if (kqVarB == null) {
                kz.a(kqVarE.a());
            }
            if (kqVar != null) {
                if (kqVarB.e() == 304) {
                    kq.d dVarJ3 = kqVar.j();
                    kjVarC = kqVar.c();
                    kjVarC2 = kqVarB.c();
                    dVar = new kj.d();
                    iA = kjVarC.a();
                    while (i11 < iA) {
                        strE2 = kjVarC.e(i11);
                        strC = kjVarC.c(i11);
                        if ("Warning".equalsIgnoreCase(strE2)) {
                            kv.f42195e.b(dVar, strE2, strC);
                        } else {
                            kv.f42195e.b(dVar, strE2, strC);
                        }
                    }
                    iA2 = kjVarC2.a();
                    while (i10 < iA2) {
                        strE = kjVarC2.e(i10);
                        if (e(strE)) {
                        }
                    }
                    kq kqVarC3 = dVarJ3.e(dVar.d()).b(kqVarB.g()).d(kqVarB.i()).d(b(kqVar)).e(b(kqVarB)).c();
                    kqVarB.a().close();
                    return kqVarC3;
                }
                kz.a(kqVar.a());
            }
            kqVarC = kqVarB.j().d(b(kqVar)).e(b(kqVarB)).c();
            if (this.f42251e != null) {
                if (!lp.d(kqVarC)) {
                }
                lv.b(krVar.c());
            }
            return kqVarC;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    private static boolean c(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }
}
