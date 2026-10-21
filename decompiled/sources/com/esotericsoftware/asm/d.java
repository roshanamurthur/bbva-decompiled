package com.esotericsoftware.asm;

import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f39977i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Label f39978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f39979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f39980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int[] f39981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f39982e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39983f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39984g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int[] f39985h;

    static {
        int[] iArr = new int[202];
        for (int i10 = 0; i10 < 202; i10++) {
            iArr[i10] = "EFFFFFFFFGGFFFGGFFFEEFGFGFEEEEEEEEEEEEEEEEEEEEDEDEDDDDDCDCDEEEEEEEEEEEEEEEEEEEEBABABBBBDCFFFGGGEDCDCDCDCDCDCDCDCDCDCEEEEDDDDDDDCDCDCEFEFDDEEFFDEDEEEBDDBBDDDDDDCCCCCCCCEFEDDDCDCDEEEEEEEEEEFEEEEEEDDEEDDEE".charAt(i10) - 'E';
        }
        f39977i = iArr;
    }

    public static boolean h(ClassWriter classWriter, int i10, int[] iArr, int i11) {
        int iMin;
        int i12 = iArr[i11];
        if (i12 == i10) {
            return false;
        }
        if ((268435455 & i10) == 16777221) {
            if (i12 == 16777221) {
                return false;
            }
            i10 = 16777221;
        }
        if (i12 == 0) {
            iArr[i11] = i10;
            return true;
        }
        int i13 = i12 & 267386880;
        int iN = 16777216;
        if (i13 == 24117248 || (i12 & (-268435456)) != 0) {
            if (i10 == 16777221) {
                return false;
            }
            if ((i10 & (-1048576)) != ((-1048576) & i12)) {
                int i14 = i10 & 267386880;
                if (i14 == 24117248 || (i10 & (-268435456)) != 0) {
                    int i15 = i10 & (-268435456);
                    int i16 = ((i15 == 0 || i14 == 24117248) ? 0 : -268435456) + i15;
                    int i17 = i12 & (-268435456);
                    iMin = Math.min(i16, ((i17 == 0 || i13 == 24117248) ? 0 : -268435456) + i17);
                    iN = iMin | 24117248 | classWriter.n("java/lang/Object");
                }
            } else if (i13 == 24117248) {
                int i18 = (i10 & (-268435456)) | 24117248;
                int i19 = i10 & 1048575;
                int i20 = 1048575 & i12;
                f fVar = classWriter.f39899h;
                fVar.f39993b = 32;
                fVar.f39995d = ((long) i19) | (((long) i20) << 32);
                fVar.f39999h = (i19 + 32 + i20) & Integer.MAX_VALUE;
                f fVarG = classWriter.g(fVar);
                if (fVarG == null) {
                    f[] fVarArr = classWriter.f39902k;
                    fVar.f39994c = classWriter.n(classWriter.getCommonSuperClass(fVarArr[i19].f39996e, fVarArr[i20].f39996e));
                    fVarG = new f(0, fVar);
                    classWriter.m(fVarG);
                }
                iN = i18 | fVarG.f39994c;
            } else {
                iMin = (i12 & (-268435456)) - 268435456;
                iN = iMin | 24117248 | classWriter.n("java/lang/Object");
            }
        } else if (i12 == 16777221) {
            if ((i10 & 267386880) != 24117248 && (i10 & (-268435456)) == 0) {
                i10 = 16777216;
            }
            iN = i10;
        }
        if (i12 == iN) {
            return false;
        }
        iArr[i11] = iN;
        return true;
    }

    public static int i(ClassWriter classWriter, String str) {
        int iIndexOf = str.charAt(0) == '(' ? str.indexOf(41) + 1 : 0;
        char cCharAt = str.charAt(iIndexOf);
        int iN = 16777218;
        if (cCharAt == 'F') {
            return 16777218;
        }
        if (cCharAt == 'L') {
            return classWriter.n(str.substring(iIndexOf + 1, str.length() - 1)) | 24117248;
        }
        if (cCharAt != 'S') {
            if (cCharAt == 'V') {
                return 0;
            }
            if (cCharAt != 'Z' && cCharAt != 'I') {
                if (cCharAt == 'J') {
                    return 16777220;
                }
                switch (cCharAt) {
                    case 'B':
                    case 'C':
                        break;
                    case 'D':
                        return 16777219;
                    default:
                        int i10 = iIndexOf + 1;
                        while (str.charAt(i10) == '[') {
                            i10++;
                        }
                        char cCharAt2 = str.charAt(i10);
                        if (cCharAt2 != 'F') {
                            if (cCharAt2 == 'S') {
                                iN = 16777228;
                            } else if (cCharAt2 == 'Z') {
                                iN = 16777225;
                            } else if (cCharAt2 == 'I') {
                                iN = 16777217;
                            } else if (cCharAt2 != 'J') {
                                switch (cCharAt2) {
                                    case 'B':
                                        iN = 16777226;
                                        break;
                                    case 'C':
                                        iN = 16777227;
                                        break;
                                    case 'D':
                                        iN = 16777219;
                                        break;
                                    default:
                                        iN = classWriter.n(str.substring(i10 + 1, str.length() - 1)) | 24117248;
                                        break;
                                }
                            } else {
                                iN = 16777220;
                            }
                        }
                        return ((i10 - iIndexOf) << 28) | iN;
                }
            }
        }
        return 16777217;
    }

    public final int a() {
        int i10 = this.f39983f;
        if (i10 > 0) {
            int[] iArr = this.f39982e;
            int i11 = i10 - 1;
            this.f39983f = i11;
            return iArr[i11];
        }
        Label label = this.f39978a;
        int i12 = label.f39927f - 1;
        label.f39927f = i12;
        return (-i12) | 50331648;
    }

    public final int b(int i10) {
        int[] iArr = this.f39981d;
        if (iArr == null || i10 >= iArr.length) {
            return i10 | 33554432;
        }
        int i11 = iArr[i10];
        if (i11 != 0) {
            return i11;
        }
        int i12 = i10 | 33554432;
        iArr[i10] = i12;
        return i12;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004d A[LOOP:0: B:10:0x0022->B:21:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x004c A[SYNTHETIC] */
    public final int c(ClassWriter classWriter, int i10) {
        String str;
        int i11;
        if (i10 != 16777222) {
            if (((-1048576) & i10) == 25165824) {
                str = classWriter.f39902k[1048575 & i10].f39996e;
            }
            return i10;
        }
        str = classWriter.f39905o;
        int iN = classWriter.n(str) | 24117248;
        for (int i12 = 0; i12 < this.f39984g; i12++) {
            int i13 = this.f39985h[i12];
            int i14 = (-268435456) & i13;
            int i15 = 251658240 & i13;
            if (i15 == 33554432) {
                i11 = this.f39979b[i13 & 8388607];
            } else {
                if (i15 == 50331648) {
                    int[] iArr = this.f39980c;
                    i11 = iArr[iArr.length - (i13 & 8388607)];
                }
                if (i10 == i13) {
                    return iN;
                }
            }
            i13 = i11 + i14;
            if (i10 == i13) {
                return iN;
            }
        }
        return i10;
    }

    public final void d(int i10, int i11) {
        if (this.f39981d == null) {
            this.f39981d = new int[10];
        }
        int length = this.f39981d.length;
        if (i10 >= length) {
            int[] iArr = new int[Math.max(i10 + 1, length * 2)];
            System.arraycopy(this.f39981d, 0, iArr, 0, length);
            this.f39981d = iArr;
        }
        this.f39981d[i10] = i11;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:107:0x0223  */
    /* JADX WARN: Code duplicated, block: B:108:0x0228  */
    /* JADX WARN: Code duplicated, block: B:57:0x0114  */
    /* JADX WARN: Code duplicated, block: B:60:0x0120  */
    /* JADX WARN: Code duplicated, block: B:63:0x012b  */
    /* JADX WARN: Code duplicated, block: B:65:0x0133  */
    /* JADX WARN: Code duplicated, block: B:69:0x0145  */
    /* JADX WARN: Code duplicated, block: B:71:0x014d  */
    public final void e(int i10, int i11, ClassWriter classWriter, f fVar) {
        int iN;
        String str;
        int i12;
        int iB;
        int iA;
        int iA2;
        String strConcat;
        int iA3;
        int i13;
        int iN2;
        if (i10 != 198 && i10 != 199) {
            switch (i10) {
                case 0:
                    return;
                case 1:
                    iN = 16777221;
                    j(iN);
                    return;
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 16:
                case 17:
                    j(16777217);
                    return;
                case 9:
                case 10:
                    j(16777220);
                    j(16777216);
                    return;
                case 11:
                case 12:
                case 13:
                    j(16777218);
                    return;
                case 14:
                case 15:
                    j(16777219);
                    j(16777216);
                    return;
                case 18:
                    int i14 = fVar.f39993b;
                    if (i14 != 16) {
                        switch (i14) {
                            case 3:
                                j(16777217);
                                return;
                            case 4:
                                j(16777218);
                                return;
                            case 5:
                                j(16777220);
                                j(16777216);
                                return;
                            case 6:
                                j(16777219);
                                j(16777216);
                                return;
                            case 7:
                                str = "java/lang/Class";
                                break;
                            case 8:
                                str = "java/lang/String";
                                break;
                            default:
                                str = "java/lang/invoke/MethodHandle";
                                break;
                        }
                    } else {
                        str = "java/lang/invoke/MethodType";
                    }
                    iN = classWriter.n(str) | 24117248;
                    j(iN);
                    return;
                default:
                    switch (i10) {
                        case 21:
                            j(16777217);
                            return;
                        case 22:
                            j(16777220);
                            j(16777216);
                            return;
                        case 23:
                            j(16777218);
                            return;
                        case 24:
                            j(16777219);
                            j(16777216);
                            return;
                        case 25:
                            iN = b(i11);
                            j(iN);
                            return;
                        default:
                            switch (i10) {
                                case 46:
                                case 51:
                                case 52:
                                case 53:
                                    k(2);
                                    j(16777217);
                                    return;
                                case 47:
                                    k(2);
                                    j(16777220);
                                    j(16777216);
                                    return;
                                case 48:
                                    k(2);
                                    j(16777218);
                                    return;
                                case 49:
                                    k(2);
                                    j(16777219);
                                    j(16777216);
                                    return;
                                case 50:
                                    k(1);
                                    iN = a() - 268435456;
                                    j(iN);
                                    return;
                                case 54:
                                case 56:
                                case 58:
                                    d(i11, a());
                                    if (i11 > 0) {
                                        i12 = i11 - 1;
                                        iB = b(i12);
                                        if (iB != 16777220 && iB != 16777219) {
                                            if ((iB & 251658240) == 16777216) {
                                                return;
                                            }
                                            d(i12, iB | 8388608);
                                            return;
                                        }
                                        d(i12, 16777216);
                                        return;
                                    }
                                    return;
                                case 55:
                                case 57:
                                    k(1);
                                    d(i11, a());
                                    d(i11 + 1, 16777216);
                                    if (i11 > 0) {
                                        i12 = i11 - 1;
                                        iB = b(i12);
                                        if (iB != 16777220 && iB != 16777219) {
                                            if ((iB & 251658240) == 16777216) {
                                                return;
                                            }
                                            d(i12, iB | 8388608);
                                            return;
                                        }
                                        d(i12, 16777216);
                                        return;
                                    }
                                    return;
                                default:
                                    switch (i10) {
                                        case 79:
                                        case 81:
                                        case 83:
                                        case 84:
                                        case 85:
                                        case 86:
                                            k(3);
                                            return;
                                        case 80:
                                        case 82:
                                            k(4);
                                            return;
                                        case 87:
                                        case 153:
                                        case 154:
                                        case 155:
                                        case 156:
                                        case 157:
                                        case 158:
                                        case 170:
                                        case 171:
                                        case 172:
                                        case 174:
                                        case 176:
                                        case Opcodes.ATHROW /* 191 */:
                                        case Opcodes.MONITORENTER /* 194 */:
                                        case Opcodes.MONITOREXIT /* 195 */:
                                            break;
                                        case 88:
                                        case 159:
                                        case 160:
                                        case 161:
                                        case 162:
                                        case 163:
                                        case 164:
                                        case 165:
                                        case 166:
                                        case 173:
                                        case 175:
                                            k(2);
                                            return;
                                        case 89:
                                            iN = a();
                                            j(iN);
                                            j(iN);
                                            return;
                                        case 90:
                                            iN = a();
                                            iA = a();
                                            j(iN);
                                            j(iA);
                                            j(iN);
                                            return;
                                        case 91:
                                            iN = a();
                                            iA = a();
                                            iA2 = a();
                                            j(iN);
                                            j(iA2);
                                            j(iA);
                                            j(iN);
                                            return;
                                        case 92:
                                            iN = a();
                                            iA = a();
                                            j(iA);
                                            j(iN);
                                            j(iA);
                                            j(iN);
                                            return;
                                        case 93:
                                            iN = a();
                                            iA = a();
                                            iA2 = a();
                                            j(iA);
                                            j(iN);
                                            j(iA2);
                                            j(iA);
                                            j(iN);
                                            return;
                                        case 94:
                                            iN = a();
                                            iA = a();
                                            iA2 = a();
                                            int iA4 = a();
                                            j(iA);
                                            j(iN);
                                            j(iA4);
                                            j(iA2);
                                            j(iA);
                                            j(iN);
                                            return;
                                        case 95:
                                            int iA5 = a();
                                            int iA6 = a();
                                            j(iA5);
                                            j(iA6);
                                            return;
                                        case 96:
                                        case 100:
                                        case 104:
                                        case 108:
                                        case 112:
                                        case 120:
                                        case 122:
                                        case 124:
                                        case 126:
                                        case 128:
                                        case 130:
                                        case 136:
                                        case 142:
                                        case 149:
                                        case 150:
                                            k(2);
                                            j(16777217);
                                            return;
                                        case 97:
                                        case 101:
                                        case 105:
                                        case 109:
                                        case 113:
                                        case 127:
                                        case 129:
                                        case 131:
                                            k(4);
                                            j(16777220);
                                            j(16777216);
                                            return;
                                        case 98:
                                        case 102:
                                        case 106:
                                        case 110:
                                        case 114:
                                        case 137:
                                        case 144:
                                            k(2);
                                            j(16777218);
                                            return;
                                        case 99:
                                        case 103:
                                        case 107:
                                        case 111:
                                        case 115:
                                            k(4);
                                            j(16777219);
                                            j(16777216);
                                            return;
                                        case 116:
                                        case 117:
                                        case 118:
                                        case 119:
                                        case 145:
                                        case 146:
                                        case 147:
                                        case 167:
                                        case 177:
                                            return;
                                        case 121:
                                        case 123:
                                        case 125:
                                            k(3);
                                            j(16777220);
                                            j(16777216);
                                            return;
                                        case 132:
                                            d(i11, 16777217);
                                            return;
                                        case 133:
                                        case 140:
                                            k(1);
                                            j(16777220);
                                            j(16777216);
                                            return;
                                        case 134:
                                            k(1);
                                            j(16777218);
                                            return;
                                        case 135:
                                        case 141:
                                            k(1);
                                            j(16777219);
                                            j(16777216);
                                            return;
                                        case 138:
                                            k(2);
                                            j(16777219);
                                            j(16777216);
                                            return;
                                        case 139:
                                        case 190:
                                        case Opcodes.INSTANCEOF /* 193 */:
                                            k(1);
                                            j(16777217);
                                            return;
                                        case 143:
                                            k(2);
                                            j(16777220);
                                            j(16777216);
                                            return;
                                        case 148:
                                        case 151:
                                        case 152:
                                            k(4);
                                            j(16777217);
                                            return;
                                        case 168:
                                        case 169:
                                            throw new RuntimeException("JSR/RET are not supported with computeFrames option");
                                        case 178:
                                            f(classWriter, fVar.f39998g);
                                            return;
                                        case 179:
                                            g(fVar.f39998g);
                                            return;
                                        case 180:
                                            k(1);
                                            f(classWriter, fVar.f39998g);
                                            return;
                                        case 181:
                                            g(fVar.f39998g);
                                            a();
                                            return;
                                        case 182:
                                        case 183:
                                        case 184:
                                        case 185:
                                            g(fVar.f39998g);
                                            if (i10 != 184) {
                                                int iA7 = a();
                                                if (i10 == 183 && fVar.f39997f.charAt(0) == '<') {
                                                    if (this.f39985h == null) {
                                                        this.f39985h = new int[2];
                                                    }
                                                    int length = this.f39985h.length;
                                                    int i15 = this.f39984g;
                                                    if (i15 >= length) {
                                                        int[] iArr = new int[Math.max(i15 + 1, length * 2)];
                                                        System.arraycopy(this.f39985h, 0, iArr, 0, length);
                                                        this.f39985h = iArr;
                                                    }
                                                    int[] iArr2 = this.f39985h;
                                                    int i16 = this.f39984g;
                                                    this.f39984g = i16 + 1;
                                                    iArr2[i16] = iA7;
                                                }
                                            }
                                            f(classWriter, fVar.f39998g);
                                            return;
                                        case 186:
                                            g(fVar.f39997f);
                                            strConcat = fVar.f39997f;
                                            f(classWriter, strConcat);
                                            return;
                                        case 187:
                                            iA3 = classWriter.a(fVar.f39996e, i11);
                                            i13 = 25165824;
                                            iN2 = iA3 | i13;
                                            j(iN2);
                                            return;
                                        case 188:
                                            a();
                                            switch (i11) {
                                                case 4:
                                                    iN2 = 285212681;
                                                    break;
                                                case 5:
                                                    iN2 = 285212683;
                                                    break;
                                                case 6:
                                                    iN2 = 285212674;
                                                    break;
                                                case 7:
                                                    iN2 = 285212675;
                                                    break;
                                                case 8:
                                                    iN2 = 285212682;
                                                    break;
                                                case 9:
                                                    iN2 = 285212684;
                                                    break;
                                                case 10:
                                                    iN2 = 285212673;
                                                    break;
                                                default:
                                                    iN2 = 285212676;
                                                    break;
                                            }
                                            j(iN2);
                                            return;
                                        case 189:
                                            String str2 = fVar.f39996e;
                                            a();
                                            if (str2.charAt(0) == '[') {
                                                strConcat = Constant.BRACKET_OPEN.concat(str2);
                                                f(classWriter, strConcat);
                                                return;
                                            } else {
                                                i13 = 292552704;
                                                iA3 = classWriter.n(str2);
                                                iN2 = iA3 | i13;
                                                j(iN2);
                                                return;
                                            }
                                        case 192:
                                            strConcat = fVar.f39996e;
                                            a();
                                            if (strConcat.charAt(0) != '[') {
                                                iN2 = classWriter.n(strConcat) | 24117248;
                                                j(iN2);
                                                return;
                                            }
                                            f(classWriter, strConcat);
                                            return;
                                        default:
                                            k(i11);
                                            strConcat = fVar.f39996e;
                                            f(classWriter, strConcat);
                                            return;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        k(1);
    }

    public final void f(ClassWriter classWriter, String str) {
        int i10 = i(classWriter, str);
        if (i10 != 0) {
            j(i10);
            if (i10 == 16777220 || i10 == 16777219) {
                j(16777216);
            }
        }
    }

    public final void g(String str) {
        char cCharAt = str.charAt(0);
        if (cCharAt == '(') {
            k((Type.getArgumentsAndReturnSizes(str) >> 2) - 1);
        } else if (cCharAt == 'J' || cCharAt == 'D') {
            k(2);
        } else {
            k(1);
        }
    }

    public final void j(int i10) {
        if (this.f39982e == null) {
            this.f39982e = new int[10];
        }
        int length = this.f39982e.length;
        int i11 = this.f39983f;
        if (i11 >= length) {
            int[] iArr = new int[Math.max(i11 + 1, length * 2)];
            System.arraycopy(this.f39982e, 0, iArr, 0, length);
            this.f39982e = iArr;
        }
        int[] iArr2 = this.f39982e;
        int i12 = this.f39983f;
        int i13 = i12 + 1;
        this.f39983f = i13;
        iArr2[i12] = i10;
        Label label = this.f39978a;
        int i14 = label.f39927f + i13;
        if (i14 > label.f39928g) {
            label.f39928g = i14;
        }
    }

    public final void k(int i10) {
        int i11 = this.f39983f;
        if (i11 >= i10) {
            this.f39983f = i11 - i10;
            return;
        }
        this.f39978a.f39927f -= i10 - i11;
        this.f39983f = 0;
    }
}
