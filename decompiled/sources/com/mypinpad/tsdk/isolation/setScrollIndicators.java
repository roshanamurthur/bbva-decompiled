package com.mypinpad.tsdk.isolation;

import android.graphics.Color;
import android.view.ViewConfiguration;
import java.util.Arrays;
import kotlin.io.encoding.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class setScrollIndicators {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final byte[] f60499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static long f60500b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f60501c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f60502d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f60503e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static int f60504f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final byte[] f60505g = null;

    static {
        b();
        f60503e = 0;
        f60504f = 1;
        f60501c = 0;
        f60502d = 1;
        c();
        Object[] objArr = new Object[1];
        a("竝葏窜ꚾꝚ椞\ue27fŃ\uf054⥶眯鮳漌뱎\ufdefᓣ\udaf4䜖䋟愳冼짾힟糖콴岶屯睓㩌\ue76eℕ솝넪橬럅嫕Ⳛﴴ㳵휍鮚蟼膥‵ᅊઔᙵ뵽豪鵌鬅㞵ךּ⁴懕胍皱ꭱ\uf6aaᵘ\uedc1㶡篢陨嬑샑쀫\ue33c", 1 - Color.alpha(0), objArr);
        f60499a = l.encodeToByteArray(((String) objArr[0]).intern());
        Object[] objArr2 = new Object[1];
        a("䩶⯈䨷ह钯밗톊푊샿蛱䓚人徧Ꮙ츚쇪\uea5f\ue891焪됺愗晹\ue46a⼊\uffdf\uf331澚ꉚ૧䣩ዠᒔ膁엫萰远ᱱ劳ༀȄꬱ⡻뉐\uf53c⇡ꔓ▀桴볁㋋꣰\ue2bc쮑迳删嗄䘚Ӷ앟졑\udd6a鈦䠗䍡殺潖\uf3d8㙅", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, objArr2);
        l.encodeToByteArray(((String) objArr2[0]).intern());
        int i10 = f60501c + 11;
        f60502d = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0113 A[Catch: all -> 0x013d, TryCatch #0 {all -> 0x013d, blocks: (B:6:0x004e, B:10:0x00a7, B:12:0x00b6, B:22:0x0134, B:15:0x00ca, B:19:0x010c, B:21:0x0113, B:25:0x013f, B:9:0x0073), top: B:34:0x004e }] */
    /* JADX WARN: Code duplicated, block: B:25:0x013f A[Catch: all -> 0x013d, TRY_LEAVE, TryCatch #0 {all -> 0x013d, blocks: (B:6:0x004e, B:10:0x00a7, B:12:0x00b6, B:22:0x0134, B:15:0x00ca, B:19:0x010c, B:21:0x0113, B:25:0x013f, B:9:0x0073), top: B:34:0x004e }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0146 -> B:27:0x0150). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static void a(java.lang.String r21, int r22, java.lang.Object[] r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mypinpad.tsdk.isolation.setScrollIndicators.a(java.lang.String, int, java.lang.Object[]):void");
    }

    public static void b() {
        f60505g = new byte[]{121, 93, 29, -92};
    }

    public static void c() {
        f60500b = -563481256477323668L;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x009d  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:47:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:67:0x0101  */
    /* JADX WARN: Code duplicated, block: B:70:0x0117 A[LOOP:1: B:18:0x004f->B:70:0x0117, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0120 A[EDGE_INSN: B:99:0x0120->B:72:0x0120 BREAK  A[LOOP:1: B:18:0x004f->B:70:0x0117], SYNTHETIC] */
    @Nullable
    public static final byte[] setOnFocusChangeListener(@NotNull String str) {
        char c10;
        int i10;
        int i11;
        int i12;
        char c11;
        int i13;
        int i14;
        int i15;
        int i16 = f60502d + 73;
        f60501c = i16 % 128;
        if (i16 % 2 != 0) {
            Intrinsics.checkNotNullParameter(str, "");
            str.length();
            throw null;
        }
        Intrinsics.checkNotNullParameter(str, "");
        int length = str.length();
        while (true) {
            c10 = '\r';
            if (length <= 0) {
                break;
            }
            char cCharAt = str.charAt(length - 1);
            if (cCharAt != '=' && cCharAt != '\n' && cCharAt != '\r' && cCharAt != ' ') {
                int i17 = f60501c + 101;
                f60502d = i17 % 128;
                int i18 = i17 % 2;
                if (cCharAt != '\t') {
                    break;
                }
            }
            length--;
        }
        int i19 = (int) ((((long) length) * 6) / 8);
        byte[] bArr = new byte[i19];
        if (length > 0) {
            int i20 = 0;
            i10 = 0;
            i11 = 0;
            i12 = 0;
            while (true) {
                int i21 = i20 + 1;
                char cCharAt2 = str.charAt(i20);
                if ('A' > cCharAt2 || cCharAt2 > 'Z') {
                    if ('a' <= cCharAt2) {
                        int i22 = f60501c + 55;
                        int i23 = i22 % 128;
                        f60502d = i23;
                        int i24 = i22 % 2;
                        if (cCharAt2 <= 'z') {
                            i13 = cCharAt2 - 'G';
                        } else {
                            int i25 = i23 + 117;
                            f60501c = i25 % 128;
                            int i26 = i25 % 2;
                            if ('0' > cCharAt2 && cCharAt2 <= '9') {
                                i13 = cCharAt2 + 4;
                            } else if (cCharAt2 != '+') {
                                i14 = f60501c + 97;
                                f60502d = i14 % 128;
                                if (i14 % 2 == 0 ? cCharAt2 == '-' : cCharAt2 == 'H') {
                                    c11 = '\t';
                                    i13 = 62;
                                } else if (cCharAt2 != '/' || cCharAt2 == '_') {
                                    c11 = '\t';
                                    i13 = 63;
                                } else if (cCharAt2 == '\n' || cCharAt2 == '\r') {
                                    c11 = '\t';
                                } else {
                                    c11 = '\t';
                                    if (cCharAt2 != ' ' && cCharAt2 != '\t') {
                                        return null;
                                    }
                                }
                                i12 = (i12 << 6) | i13;
                                i11++;
                                if (i11 % 4 == 0) {
                                    i15 = f60501c + 45;
                                    f60502d = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        bArr[i10] = (byte) (i12 >> 96);
                                        int i27 = i10 >>> 1;
                                        bArr[i10] = (byte) (i12 + 57);
                                        bArr[i27] = (byte) i12;
                                        i10 = i27;
                                    } else {
                                        bArr[i10] = (byte) (i12 >> 16);
                                        int i28 = i10 + 2;
                                        bArr[i10 + 1] = (byte) (i12 >> 8);
                                        i10 += 3;
                                        bArr[i28] = (byte) i12;
                                    }
                                }
                            } else {
                                c11 = '\t';
                                i13 = 62;
                                i12 = (i12 << 6) | i13;
                                i11++;
                                if (i11 % 4 == 0) {
                                    i15 = f60501c + 45;
                                    f60502d = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        bArr[i10] = (byte) (i12 >> 96);
                                        int i29 = i10 >>> 1;
                                        bArr[i10] = (byte) (i12 + 57);
                                        bArr[i29] = (byte) i12;
                                        i10 = i29;
                                    } else {
                                        bArr[i10] = (byte) (i12 >> 16);
                                        int i210 = i10 + 2;
                                        bArr[i10 + 1] = (byte) (i12 >> 8);
                                        i10 += 3;
                                        bArr[i210] = (byte) i12;
                                    }
                                }
                            }
                        }
                    } else {
                        if ('0' > cCharAt2) {
                        }
                        if (cCharAt2 != '+') {
                            i14 = f60501c + 97;
                            f60502d = i14 % 128;
                            if (i14 % 2 == 0) {
                                if (cCharAt2 != '/') {
                                }
                                c11 = '\t';
                                i13 = 63;
                                i12 = (i12 << 6) | i13;
                                i11++;
                                if (i11 % 4 == 0) {
                                    i15 = f60501c + 45;
                                    f60502d = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        bArr[i10] = (byte) (i12 >> 96);
                                        int i211 = i10 >>> 1;
                                        bArr[i10] = (byte) (i12 + 57);
                                        bArr[i211] = (byte) i12;
                                        i10 = i211;
                                    } else {
                                        bArr[i10] = (byte) (i12 >> 16);
                                        int i212 = i10 + 2;
                                        bArr[i10 + 1] = (byte) (i12 >> 8);
                                        i10 += 3;
                                        bArr[i212] = (byte) i12;
                                    }
                                }
                            } else {
                                if (cCharAt2 != '/') {
                                }
                                c11 = '\t';
                                i13 = 63;
                                i12 = (i12 << 6) | i13;
                                i11++;
                                if (i11 % 4 == 0) {
                                    i15 = f60501c + 45;
                                    f60502d = i15 % 128;
                                    if (i15 % 2 == 0) {
                                        bArr[i10] = (byte) (i12 >> 96);
                                        int i213 = i10 >>> 1;
                                        bArr[i10] = (byte) (i12 + 57);
                                        bArr[i213] = (byte) i12;
                                        i10 = i213;
                                    } else {
                                        bArr[i10] = (byte) (i12 >> 16);
                                        int i214 = i10 + 2;
                                        bArr[i10 + 1] = (byte) (i12 >> 8);
                                        i10 += 3;
                                        bArr[i214] = (byte) i12;
                                    }
                                }
                            }
                        } else {
                            c11 = '\t';
                            i13 = 62;
                            i12 = (i12 << 6) | i13;
                            i11++;
                            if (i11 % 4 == 0) {
                                i15 = f60501c + 45;
                                f60502d = i15 % 128;
                                if (i15 % 2 == 0) {
                                    bArr[i10] = (byte) (i12 >> 96);
                                    int i215 = i10 >>> 1;
                                    bArr[i10] = (byte) (i12 + 57);
                                    bArr[i215] = (byte) i12;
                                    i10 = i215;
                                } else {
                                    bArr[i10] = (byte) (i12 >> 16);
                                    int i216 = i10 + 2;
                                    bArr[i10 + 1] = (byte) (i12 >> 8);
                                    i10 += 3;
                                    bArr[i216] = (byte) i12;
                                }
                            }
                        }
                    }
                    if (i21 >= length) {
                        break;
                    }
                    i20 = i21;
                    c10 = '\r';
                } else {
                    int i30 = f60501c + 71;
                    f60502d = i30 % 128;
                    int i31 = i30 % 2;
                    i13 = cCharAt2 - 'A';
                }
                c11 = '\t';
                i12 = (i12 << 6) | i13;
                i11++;
                if (i11 % 4 == 0) {
                    i15 = f60501c + 45;
                    f60502d = i15 % 128;
                    if (i15 % 2 == 0) {
                        bArr[i10] = (byte) (i12 >> 96);
                        int i217 = i10 >>> 1;
                        bArr[i10] = (byte) (i12 + 57);
                        bArr[i217] = (byte) i12;
                        i10 = i217;
                    } else {
                        bArr[i10] = (byte) (i12 >> 16);
                        int i218 = i10 + 2;
                        bArr[i10 + 1] = (byte) (i12 >> 8);
                        i10 += 3;
                        bArr[i218] = (byte) i12;
                    }
                }
                if (i21 >= length) {
                    break;
                    break;
                }
                i20 = i21;
                c10 = '\r';
            }
        } else {
            i10 = 0;
            i11 = 0;
            i12 = 0;
        }
        int i32 = i11 % 4;
        if (i32 == 1) {
            return null;
        }
        if (i32 == 2) {
            bArr[i10] = (byte) ((i12 << 12) >> 16);
            i10++;
        } else if (i32 == 3) {
            int i33 = i12 << 6;
            int i34 = i10 + 1;
            bArr[i10] = (byte) (i33 >> 16);
            i10 += 2;
            bArr[i34] = (byte) (i33 >> 8);
        }
        if (i10 != i19) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i10);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "");
            return bArrCopyOf;
        }
        int i35 = f60501c + 117;
        f60502d = i35 % 128;
        if (i35 % 2 == 0) {
            int i36 = 12 / 0;
        }
        return bArr;
    }

    public static String setX(byte[] bArr) {
        byte[] bArr2;
        int i10 = f60501c + 99;
        int i11 = i10 % 128;
        f60502d = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 17;
        f60501c = i13 % 128;
        int i14 = i13 % 2;
        Intrinsics.checkNotNullParameter(bArr, "");
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) << 2];
        int length = bArr.length - (bArr.length % 3);
        int i15 = 0;
        int i16 = 0;
        while (true) {
            bArr2 = f60499a;
            if (i15 >= length) {
                break;
            }
            int i17 = f60501c;
            int i18 = i17 + 93;
            f60502d = i18 % 128;
            int i19 = i18 % 2;
            byte b10 = bArr[i15];
            int i20 = i15 + 2;
            byte b11 = bArr[i15 + 1];
            i15 += 3;
            byte b12 = bArr[i20];
            bArr3[i16] = bArr2[(b10 & 255) >> 2];
            bArr3[i16 + 1] = bArr2[((b10 & 3) << 4) | ((b11 & 255) >> 4)];
            int i21 = i16 + 3;
            bArr3[i16 + 2] = bArr2[((b11 & 15) << 2) | ((b12 & 255) >> 6)];
            i16 += 4;
            bArr3[i21] = bArr2[b12 & 63];
            int i22 = i17 + 49;
            f60502d = i22 % 128;
            int i23 = i22 % 2;
        }
        int length2 = bArr.length - length;
        if (length2 == 1) {
            byte b13 = bArr[i15];
            bArr3[i16] = bArr2[(b13 & 255) >> 2];
            bArr3[i16 + 1] = bArr2[(b13 & 3) << 4];
            bArr3[i16 + 2] = Base64.padSymbol;
            bArr3[i16 + 3] = Base64.padSymbol;
        } else if (length2 == 2) {
            int i24 = i15 + 1;
            byte b14 = bArr[i15];
            byte b15 = bArr[i24];
            bArr3[i16] = bArr2[(b14 & 255) >> 2];
            bArr3[i16 + 1] = bArr2[((b14 & 3) << 4) | ((b15 & 255) >> 4)];
            bArr3[i16 + 2] = bArr2[(b15 & 15) << 2];
            bArr3[i16 + 3] = Base64.padSymbol;
            int i25 = f60501c + 59;
            f60502d = i25 % 128;
            int i26 = i25 % 2;
        }
        String str = new String(bArr3, Charsets.UTF_8);
        int i27 = f60502d + 19;
        f60501c = i27 % 128;
        if (i27 % 2 != 0) {
            int i28 = 46 / 0;
        }
        return str;
    }
}
