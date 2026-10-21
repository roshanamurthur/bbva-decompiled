package androidx.datastore.preferences.protobuf;

import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: TextFormatEscaper.java */
/* JADX INFO: loaded from: classes2.dex */
public final class s0 implements bh.c {
    public static String b(StringBuilder sb2) {
        int length = sb2.length();
        if (length == 0) {
            throw new IllegalStateException("StringBuilder must not be empty");
        }
        int iCharAt = (sb2.charAt(0) << 18) + ((length >= 2 ? sb2.charAt(1) : (char) 0) << '\f') + ((length >= 3 ? sb2.charAt(2) : (char) 0) << 6) + (length >= 4 ? sb2.charAt(3) : (char) 0);
        char c10 = (char) ((iCharAt >> 16) & 255);
        char c11 = (char) ((iCharAt >> 8) & 255);
        char c12 = (char) (iCharAt & 255);
        StringBuilder sb3 = new StringBuilder(3);
        sb3.append(c10);
        if (length >= 2) {
            sb3.append(c11);
        }
        if (length >= 3) {
            sb3.append(c12);
        }
        return sb3.toString();
    }

    public static String c(ByteString byteString) {
        StringBuilder sb2 = new StringBuilder(byteString.size());
        for (int i10 = 0; i10 < byteString.size(); i10++) {
            byte bByteAt = byteString.byteAt(i10);
            if (bByteAt == 34) {
                sb2.append("\\\"");
            } else if (bByteAt == 39) {
                sb2.append("\\'");
            } else if (bByteAt != 92) {
                switch (bByteAt) {
                    case 7:
                        sb2.append("\\a");
                        break;
                    case 8:
                        sb2.append("\\b");
                        break;
                    case 9:
                        sb2.append("\\t");
                        break;
                    case 10:
                        sb2.append("\\n");
                        break;
                    case 11:
                        sb2.append("\\v");
                        break;
                    case 12:
                        sb2.append("\\f");
                        break;
                    case 13:
                        sb2.append("\\r");
                        break;
                    default:
                        if (bByteAt < 32 || bByteAt > 126) {
                            sb2.append(AbstractJsonLexerKt.STRING_ESC);
                            sb2.append((char) (((bByteAt >>> 6) & 3) + 48));
                            sb2.append((char) (((bByteAt >>> 3) & 7) + 48));
                            sb2.append((char) ((bByteAt & 7) + 48));
                        } else {
                            sb2.append((char) bByteAt);
                        }
                        break;
                }
            } else {
                sb2.append("\\\\");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b6 A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:23:0x005a, B:28:0x0067, B:30:0x0085, B:39:0x00a5, B:45:0x00b6, B:47:0x00cc, B:50:0x00e3, B:49:0x00db, B:52:0x00e8, B:53:0x00ef), top: B:56:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:47:0x00cc A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:23:0x005a, B:28:0x0067, B:30:0x0085, B:39:0x00a5, B:45:0x00b6, B:47:0x00cc, B:50:0x00e3, B:49:0x00db, B:52:0x00e8, B:53:0x00ef), top: B:56:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x00db A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:23:0x005a, B:28:0x0067, B:30:0x0085, B:39:0x00a5, B:45:0x00b6, B:47:0x00cc, B:50:0x00e3, B:49:0x00db, B:52:0x00e8, B:53:0x00ef), top: B:56:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3 A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:23:0x005a, B:28:0x0067, B:30:0x0085, B:39:0x00a5, B:45:0x00b6, B:47:0x00cc, B:50:0x00e3, B:49:0x00db, B:52:0x00e8, B:53:0x00ef), top: B:56:0x005a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00e8 A[Catch: all -> 0x0099, TryCatch #0 {all -> 0x0099, blocks: (B:23:0x005a, B:28:0x0067, B:30:0x0085, B:39:0x00a5, B:45:0x00b6, B:47:0x00cc, B:50:0x00e3, B:49:0x00db, B:52:0x00e8, B:53:0x00ef), top: B:56:0x005a }] */
    @Override // bh.c
    public void a(bh.d dVar) {
        String str;
        StringBuilder sb2;
        boolean z10;
        int i10;
        String strB;
        StringBuilder sb3 = new StringBuilder();
        while (true) {
            boolean zB = dVar.b();
            str = dVar.f25216a;
            sb2 = dVar.f25220e;
            z10 = true;
            if (!zB) {
                break;
            }
            char cA = dVar.a();
            if (cA >= ' ' && cA <= '?') {
                sb3.append(cA);
            } else {
                if (cA < '@' || cA > '^') {
                    HighLevelEncoder.b(cA);
                    throw null;
                }
                sb3.append((char) (cA - '@'));
            }
            dVar.f25221f++;
            if (sb3.length() >= 4) {
                sb2.append(b(sb3));
                sb3.delete(0, 4);
                if (HighLevelEncoder.f(str, dVar.f25221f, 4) != 4) {
                    dVar.f25222g = 0;
                    break;
                }
            }
        }
        sb3.append((char) 31);
        try {
            int length = sb3.length();
            if (length == 0) {
                dVar.f25222g = 0;
                return;
            }
            if (length == 1) {
                dVar.c(sb2.length());
                int dataCapacity = dVar.f25223h.getDataCapacity() - sb2.length();
                int length2 = (str.length() - dVar.f25224i) - dVar.f25221f;
                if (length2 > dataCapacity) {
                    dVar.c(sb2.length() + 1);
                    dataCapacity = dVar.f25223h.getDataCapacity() - sb2.length();
                }
                if (length2 > dataCapacity || dataCapacity > 2) {
                    if (length <= 4) {
                        throw new IllegalStateException("Count must not exceed 4");
                    }
                    i10 = length - 1;
                    strB = b(sb3);
                    if ((!dVar.b()) || i10 > 2) {
                        z10 = false;
                    }
                    if (i10 <= 2) {
                        dVar.c(sb2.length() + i10);
                        if (dVar.f25223h.getDataCapacity() - sb2.length() >= 3) {
                            dVar.c(sb2.length() + strB.length());
                        } else if (z10) {
                            dVar.f25223h = null;
                            dVar.f25221f -= i10;
                        }
                        sb2.append(strB);
                    } else if (z10) {
                        dVar.f25223h = null;
                        dVar.f25221f -= i10;
                    } else {
                        sb2.append(strB);
                    }
                }
            } else {
                if (length <= 4) {
                    throw new IllegalStateException("Count must not exceed 4");
                }
                i10 = length - 1;
                strB = b(sb3);
                if (!dVar.b()) {
                    z10 = false;
                } else {
                    z10 = false;
                }
                if (i10 <= 2) {
                    dVar.c(sb2.length() + i10);
                    if (dVar.f25223h.getDataCapacity() - sb2.length() >= 3) {
                        dVar.c(sb2.length() + strB.length());
                    } else if (z10) {
                        dVar.f25223h = null;
                        dVar.f25221f -= i10;
                    }
                    sb2.append(strB);
                } else if (z10) {
                    dVar.f25223h = null;
                    dVar.f25221f -= i10;
                } else {
                    sb2.append(strB);
                }
            }
            dVar.f25222g = 0;
        } catch (Throwable th2) {
            dVar.f25222g = 0;
            throw th2;
        }
    }
}
