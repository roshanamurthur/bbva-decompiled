package hh;

import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.fasterxml.jackson.core.JsonPointer;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: GeneralAppIdDecoder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitArray f69462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f69463b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StringBuilder f69464c;

    public r(BitArray bitArray) {
        l lVar = new l();
        lVar.f69448a = 0;
        lVar.f69449b = l.a.NUMERIC;
        this.f69463b = lVar;
        this.f69464c = new StringBuilder();
        this.f69462a = bitArray;
    }

    public static int c(int i10, int i11, BitArray bitArray) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (bitArray.get(i10 + i13)) {
                i12 |= 1 << ((i11 - i13) - 1);
            }
        }
        return i12;
    }

    public final String a(int i10, StringBuilder sb2) throws NotFoundException, FormatException {
        String str = null;
        while (true) {
            n nVarB = b(i10, str);
            String strA = q.a(nVarB.f69451b);
            if (strA != null) {
                sb2.append(strA);
            }
            String strValueOf = nVarB.f69453d ? String.valueOf(nVarB.f69452c) : null;
            int i11 = nVarB.f69456a;
            if (i10 == i11) {
                return sb2.toString();
            }
            i10 = i11;
            str = strValueOf;
        }
    }

    /* JADX WARN: Code duplicated, block: B:138:0x023b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0244  */
    /* JADX WARN: Code duplicated, block: B:141:0x024a  */
    /* JADX WARN: Code duplicated, block: B:163:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:166:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:167:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:171:0x02da  */
    /* JADX WARN: Code duplicated, block: B:172:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:175:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:178:0x030d A[LOOP:5: B:147:0x026d->B:178:0x030d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:182:0x031e  */
    /* JADX WARN: Code duplicated, block: B:184:0x0321  */
    /* JADX WARN: Code duplicated, block: B:186:0x0329  */
    /* JADX WARN: Code duplicated, block: B:189:0x0330 A[LOOP:6: B:183:0x031f->B:189:0x0330, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:197:0x034c A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:202:0x0356  */
    /* JADX WARN: Code duplicated, block: B:228:0x02d8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:229:0x02fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:231:0x0333 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x0333 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:233:0x033c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:55:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:56:0x00f7  */
    public final n b(int i10, String str) throws FormatException {
        int i11;
        k kVar;
        boolean z10;
        int i12;
        int i13;
        boolean z11;
        int i14;
        int i15;
        o oVar;
        int i16;
        int i17;
        int i18;
        n nVar;
        k kVar2;
        int iC;
        boolean z12;
        int iC2;
        int iC3;
        int iC4;
        char c10;
        m mVar;
        m mVar2;
        int i19;
        int iC5;
        int iC6;
        char c11;
        m mVar3;
        m mVar4;
        StringBuilder sb2 = this.f69464c;
        sb2.setLength(0);
        if (str != null) {
            sb2.append(str);
        }
        l lVar = this.f69463b;
        lVar.f69448a = i10;
        do {
            int i20 = lVar.f69448a;
            l.a aVar = lVar.f69449b;
            l.a aVar2 = l.a.ALPHA;
            BitArray bitArray = this.f69462a;
            if (aVar != aVar2) {
                if (aVar == l.a.ISO_IEC_646) {
                    while (true) {
                        int i21 = lVar.f69448a;
                        if (i21 + 5 <= bitArray.getSize() && (((iC2 = c(i21, 5, bitArray)) >= 5 && iC2 < 16) || (i21 + 7 <= bitArray.getSize() && (((iC3 = c(i21, 7, bitArray)) >= 64 && iC3 < 116) || (i21 + 8 <= bitArray.getSize() && (iC4 = c(i21, 8, bitArray)) >= 232 && iC4 < 253))))) {
                            int i22 = lVar.f69448a;
                            int iC7 = c(i22, 5, bitArray);
                            if (iC7 == 15) {
                                mVar2 = new m(i22 + 5, Typography.dollar);
                            } else {
                                if (iC7 < 5 || iC7 >= 15) {
                                    int iC8 = c(i22, 7, bitArray);
                                    if (iC8 >= 64 && iC8 < 90) {
                                        mVar = new m(i22 + 7, (char) (iC8 + 1));
                                    } else if (iC8 < 90 || iC8 >= 116) {
                                        switch (c(i22, 8, bitArray)) {
                                            case 232:
                                                c10 = '!';
                                                break;
                                            case 233:
                                                c10 = '\"';
                                                break;
                                            case 234:
                                                c10 = '%';
                                                break;
                                            case 235:
                                                c10 = Typography.amp;
                                                break;
                                            case 236:
                                                c10 = '\'';
                                                break;
                                            case 237:
                                                c10 = RootService.OPEN_BRACKET;
                                                break;
                                            case 238:
                                                c10 = RootService.CLOSE_BRACKET;
                                                break;
                                            case 239:
                                                c10 = '*';
                                                break;
                                            case 240:
                                                c10 = '+';
                                                break;
                                            case 241:
                                                c10 = AbstractJsonLexerKt.COMMA;
                                                break;
                                            case 242:
                                                c10 = '-';
                                                break;
                                            case 243:
                                                c10 = '.';
                                                break;
                                            case 244:
                                                c10 = JsonPointer.SEPARATOR;
                                                break;
                                            case 245:
                                                c10 = AbstractJsonLexerKt.COLON;
                                                break;
                                            case 246:
                                                c10 = ';';
                                                break;
                                            case 247:
                                                c10 = Typography.less;
                                                break;
                                            case 248:
                                                c10 = '=';
                                                break;
                                            case 249:
                                                c10 = Typography.greater;
                                                break;
                                            case 250:
                                                c10 = '?';
                                                break;
                                            case 251:
                                                c10 = '_';
                                                break;
                                            case 252:
                                                c10 = ' ';
                                                break;
                                            default:
                                                throw FormatException.getFormatInstance();
                                        }
                                        mVar = new m(i22 + 8, c10);
                                    } else {
                                        mVar = new m(i22 + 7, (char) (iC8 + 7));
                                    }
                                } else {
                                    mVar = new m(i22 + 5, (char) (iC7 + 43));
                                }
                                mVar2 = mVar;
                            }
                            int i23 = mVar2.f69456a;
                            lVar.f69448a = i23;
                            char c12 = mVar2.f69450b;
                            if (c12 == '$') {
                                kVar = new k(new n(i23, sb2.toString()), true);
                            } else {
                                sb2.append(c12);
                            }
                        } else {
                            int i24 = lVar.f69448a;
                            int i25 = i24 + 3;
                            if (i25 <= bitArray.getSize()) {
                                while (true) {
                                    if (i24 >= i25) {
                                        lVar.f69448a += 3;
                                        lVar.f69449b = l.a.NUMERIC;
                                    } else if (!bitArray.get(i24)) {
                                        i24++;
                                    } else if (d(lVar.f69448a)) {
                                        if (lVar.f69448a + 5 < bitArray.getSize()) {
                                            lVar.f69448a += 5;
                                        } else {
                                            lVar.f69448a = bitArray.getSize();
                                        }
                                        lVar.f69449b = l.a.ALPHA;
                                    }
                                }
                            } else if (d(lVar.f69448a)) {
                                if (lVar.f69448a + 5 < bitArray.getSize()) {
                                    lVar.f69448a += 5;
                                } else {
                                    lVar.f69448a = bitArray.getSize();
                                }
                                lVar.f69449b = l.a.ALPHA;
                            }
                            kVar = new k(null, false);
                        }
                    }
                    z12 = kVar.f69447b;
                } else {
                    while (true) {
                        int i26 = lVar.f69448a;
                        if (i26 + 7 <= bitArray.getSize()) {
                            int i27 = i26;
                            while (true) {
                                int i28 = i26 + 3;
                                if (i27 < i28) {
                                    if (!bitArray.get(i27)) {
                                        i27++;
                                    }
                                } else if (!bitArray.get(i28)) {
                                    i11 = lVar.f69448a;
                                    if (i11 + 1 <= bitArray.getSize()) {
                                        i12 = 0;
                                        while (true) {
                                            if (i12 >= 4) {
                                                i13 = i12 + i11;
                                                if (i13 < bitArray.getSize()) {
                                                    if (bitArray.get(i13)) {
                                                        i12++;
                                                    }
                                                }
                                            }
                                            lVar.f69449b = l.a.ALPHA;
                                            lVar.f69448a += 4;
                                        }
                                    }
                                    z10 = false;
                                    kVar = new k(null, false);
                                }
                                i14 = lVar.f69448a;
                                i15 = i14 + 7;
                                if (i15 > bitArray.getSize()) {
                                    iC = c(i14, 4, bitArray);
                                    if (iC == 0) {
                                        oVar = new o(bitArray.getSize(), 10, 10);
                                    } else {
                                        oVar = new o(bitArray.getSize(), iC - 1, 10);
                                    }
                                } else {
                                    int iC9 = c(i14, 7, bitArray) - 8;
                                    oVar = new o(i15, iC9 / 11, iC9 % 11);
                                }
                                i16 = oVar.f69456a;
                                lVar.f69448a = i16;
                                i17 = oVar.f69455c;
                                i18 = oVar.f69454b;
                                if (i18 == 10) {
                                    if (i17 == 10) {
                                        nVar = new n(i16, sb2.toString());
                                    } else {
                                        nVar = new n(i16, sb2.toString(), i17);
                                    }
                                    kVar2 = new k(nVar, true);
                                } else {
                                    sb2.append(i18);
                                    if (i17 == 10) {
                                        kVar2 = new k(new n(lVar.f69448a, sb2.toString()), true);
                                    } else {
                                        sb2.append(i17);
                                    }
                                }
                                kVar = kVar2;
                                z10 = false;
                            }
                        } else if (i26 + 4 <= bitArray.getSize()) {
                            i14 = lVar.f69448a;
                            i15 = i14 + 7;
                            if (i15 > bitArray.getSize()) {
                                iC = c(i14, 4, bitArray);
                                if (iC == 0) {
                                    oVar = new o(bitArray.getSize(), 10, 10);
                                } else {
                                    oVar = new o(bitArray.getSize(), iC - 1, 10);
                                }
                            } else {
                                int iC10 = c(i14, 7, bitArray) - 8;
                                oVar = new o(i15, iC10 / 11, iC10 % 11);
                            }
                            i16 = oVar.f69456a;
                            lVar.f69448a = i16;
                            i17 = oVar.f69455c;
                            i18 = oVar.f69454b;
                            if (i18 == 10) {
                                if (i17 == 10) {
                                    nVar = new n(i16, sb2.toString());
                                } else {
                                    nVar = new n(i16, sb2.toString(), i17);
                                }
                                kVar2 = new k(nVar, true);
                            } else {
                                sb2.append(i18);
                                if (i17 == 10) {
                                    kVar2 = new k(new n(lVar.f69448a, sb2.toString()), true);
                                } else {
                                    sb2.append(i17);
                                }
                            }
                            kVar = kVar2;
                            z10 = false;
                        } else {
                            i11 = lVar.f69448a;
                            if (i11 + 1 <= bitArray.getSize()) {
                                i12 = 0;
                                while (true) {
                                    if (i12 >= 4) {
                                        i13 = i12 + i11;
                                        if (i13 < bitArray.getSize()) {
                                            if (bitArray.get(i13)) {
                                                i12++;
                                            }
                                        }
                                    }
                                    lVar.f69449b = l.a.ALPHA;
                                    lVar.f69448a += 4;
                                }
                            }
                            z10 = false;
                            kVar = new k(null, false);
                        }
                        z11 = kVar.f69447b;
                    }
                }
                i19 = lVar.f69448a;
                if (i20 != i19 && !z11) {
                }
                n nVar2 = kVar.f69446a;
                return (nVar2 == null && nVar2.f69453d) ? new n(i19, sb2.toString(), nVar2.f69452c) : new n(i19, sb2.toString());
            }
            while (true) {
                int i29 = lVar.f69448a;
                if (i29 + 5 <= bitArray.getSize() && (((iC5 = c(i29, 5, bitArray)) >= 5 && iC5 < 16) || (i29 + 6 <= bitArray.getSize() && (iC6 = c(i29, 6, bitArray)) >= 16 && iC6 < 63))) {
                    int i30 = lVar.f69448a;
                    int iC11 = c(i30, 5, bitArray);
                    if (iC11 == 15) {
                        mVar4 = new m(i30 + 5, Typography.dollar);
                    } else {
                        if (iC11 < 5 || iC11 >= 15) {
                            int iC12 = c(i30, 6, bitArray);
                            if (iC12 < 32 || iC12 >= 58) {
                                switch (iC12) {
                                    case 58:
                                        c11 = '*';
                                        break;
                                    case 59:
                                        c11 = AbstractJsonLexerKt.COMMA;
                                        break;
                                    case 60:
                                        c11 = '-';
                                        break;
                                    case 61:
                                        c11 = '.';
                                        break;
                                    case 62:
                                        c11 = JsonPointer.SEPARATOR;
                                        break;
                                    default:
                                        throw new IllegalStateException("Decoding invalid alphanumeric value: ".concat(String.valueOf(iC12)));
                                }
                                mVar3 = new m(i30 + 6, c11);
                            } else {
                                mVar3 = new m(i30 + 6, (char) (iC12 + 33));
                            }
                        } else {
                            mVar3 = new m(i30 + 5, (char) (iC11 + 43));
                        }
                        mVar4 = mVar3;
                    }
                    int i31 = mVar4.f69456a;
                    lVar.f69448a = i31;
                    char c13 = mVar4.f69450b;
                    if (c13 == '$') {
                        kVar = new k(new n(i31, sb2.toString()), true);
                    } else {
                        sb2.append(c13);
                    }
                } else {
                    int i32 = lVar.f69448a;
                    int i33 = i32 + 3;
                    if (i33 <= bitArray.getSize()) {
                        while (true) {
                            if (i32 >= i33) {
                                lVar.f69448a += 3;
                                lVar.f69449b = l.a.NUMERIC;
                            } else if (!bitArray.get(i32)) {
                                i32++;
                            } else if (d(lVar.f69448a)) {
                                if (lVar.f69448a + 5 < bitArray.getSize()) {
                                    lVar.f69448a += 5;
                                } else {
                                    lVar.f69448a = bitArray.getSize();
                                }
                                lVar.f69449b = l.a.ISO_IEC_646;
                            }
                        }
                    } else if (d(lVar.f69448a)) {
                        if (lVar.f69448a + 5 < bitArray.getSize()) {
                            lVar.f69448a += 5;
                        } else {
                            lVar.f69448a = bitArray.getSize();
                        }
                        lVar.f69449b = l.a.ISO_IEC_646;
                    }
                    kVar = new k(null, false);
                }
            }
            z12 = kVar.f69447b;
            z11 = z12;
            z10 = false;
            i19 = lVar.f69448a;
            if (i20 != i19) {
            }
            n nVar3 = kVar.f69446a;
            if (nVar3 == null) {
            }
        } while (!z11);
        n nVar4 = kVar.f69446a;
        if (nVar4 == null) {
        }
    }

    public final boolean d(int i10) {
        int i11;
        int i12 = i10 + 1;
        BitArray bitArray = this.f69462a;
        if (i12 > bitArray.getSize()) {
            return false;
        }
        for (int i13 = 0; i13 < 5 && (i11 = i13 + i10) < bitArray.getSize(); i13++) {
            if (i13 == 2) {
                if (!bitArray.get(i10 + 2)) {
                    return false;
                }
            } else if (bitArray.get(i11)) {
                return false;
            }
        }
        return true;
    }
}
