package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import xg.c;
import xg.d;

/* JADX INFO: loaded from: classes10.dex */
public final class HighLevelEncoder {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f49697b = {"UPPER", "LOWER", "DIGIT", "MIXED", "PUNCT"};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[][] f49698c = {new int[]{0, 327708, 327710, 327709, 656318}, new int[]{590318, 0, 327710, 327709, 656318}, new int[]{262158, 590300, 0, 590301, 932798}, new int[]{327709, 327708, 656318, 0, 327710}, new int[]{327711, 656380, 656382, 656381, 0}};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f49699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[][] f49700e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f49701a;

    public class a implements Comparator<c> {
        @Override // java.util.Comparator
        public final int compare(c cVar, c cVar2) {
            return cVar.f94648d - cVar2.f94648d;
        }
    }

    static {
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 5, 256);
        f49699d = iArr;
        iArr[0][32] = 1;
        for (int i10 = 65; i10 <= 90; i10++) {
            f49699d[0][i10] = i10 - 63;
        }
        f49699d[1][32] = 1;
        for (int i11 = 97; i11 <= 122; i11++) {
            f49699d[1][i11] = i11 - 95;
        }
        f49699d[2][32] = 1;
        for (int i12 = 48; i12 <= 57; i12++) {
            f49699d[2][i12] = i12 - 46;
        }
        int[] iArr2 = f49699d[2];
        iArr2[44] = 12;
        iArr2[46] = 13;
        int[] iArr3 = {0, 32, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 27, 28, 29, 30, 31, 64, 92, 94, 95, 96, 124, 126, 127};
        for (int i13 = 0; i13 < 28; i13++) {
            f49699d[3][iArr3[i13]] = i13;
        }
        int[] iArr4 = {0, 13, 0, 0, 0, 0, 33, 39, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 58, 59, 60, 61, 62, 63, 91, 93, 123, 125};
        for (int i14 = 0; i14 < 31; i14++) {
            int i15 = iArr4[i14];
            if (i15 > 0) {
                f49699d[4][i15] = i14;
            }
        }
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, 6, 6);
        f49700e = iArr5;
        for (int[] iArr6 : iArr5) {
            Arrays.fill(iArr6, -1);
        }
        int[][] iArr7 = f49700e;
        iArr7[0][4] = 0;
        int[] iArr8 = iArr7[1];
        iArr8[4] = 0;
        iArr8[0] = 28;
        iArr7[3][4] = 0;
        int[] iArr9 = iArr7[2];
        iArr9[4] = 0;
        iArr9[0] = 15;
    }

    public HighLevelEncoder(byte[] bArr) {
        this.f49701a = bArr;
    }

    public static LinkedList a(LinkedList linkedList) {
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            Iterator it2 = linkedList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    linkedList2.add(cVar);
                    break;
                }
                c cVar2 = (c) it2.next();
                if (cVar2.c(cVar)) {
                    break;
                }
                if (cVar.c(cVar2)) {
                    it2.remove();
                }
            }
        }
        return linkedList2;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002e  */
    public BitArray encode() {
        byte[] bArr;
        int i10;
        int i11;
        List<c> listSingletonList = Collections.singletonList(c.f94644e);
        int i12 = 0;
        while (true) {
            bArr = this.f49701a;
            if (i12 >= bArr.length) {
                break;
            }
            int i13 = i12 + 1;
            byte b10 = i13 < bArr.length ? bArr[i13] : (byte) 0;
            byte b11 = bArr[i12];
            int i14 = 2;
            if (b11 != 13) {
                if (b11 != 44) {
                    if (b11 != 46) {
                        if (b11 == 58 && b10 == 32) {
                            i10 = 5;
                        } else {
                            i10 = 0;
                        }
                    } else if (b10 == 32) {
                        i10 = 3;
                    } else {
                        i10 = 0;
                    }
                } else if (b10 == 32) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
            } else if (b10 == 10) {
                i10 = 2;
            } else {
                i10 = 0;
            }
            if (i10 > 0) {
                LinkedList linkedList = new LinkedList();
                for (c cVar : listSingletonList) {
                    c cVarB = cVar.b(i12);
                    linkedList.add(cVarB.d(4, i10));
                    if (cVar.f94645a != 4) {
                        linkedList.add(cVarB.e(4, i10));
                    }
                    if (i10 == 3 || i10 == 4) {
                        linkedList.add(cVarB.d(2, 16 - i10).d(2, 1));
                    }
                    if (cVar.f94647c > 0) {
                        linkedList.add(cVar.a(i12).a(i13));
                    }
                }
                listSingletonList = a(linkedList);
                i12 = i13;
            } else {
                LinkedList linkedList2 = new LinkedList();
                for (c cVar2 : listSingletonList) {
                    char c10 = (char) (bArr[i12] & 255);
                    int i15 = cVar2.f94645a;
                    int[][] iArr = f49699d;
                    boolean z10 = iArr[i15][c10] > 0;
                    c cVarB2 = null;
                    int i16 = 0;
                    while (true) {
                        i11 = cVar2.f94645a;
                        if (i16 > 4) {
                            break;
                        }
                        int i17 = iArr[i16][c10];
                        if (i17 > 0) {
                            if (cVarB2 == null) {
                                cVarB2 = cVar2.b(i12);
                            }
                            if (!z10 || i16 == i11 || i16 == i14) {
                                linkedList2.add(cVarB2.d(i16, i17));
                            }
                            if (!z10 && f49700e[i11][i16] >= 0) {
                                linkedList2.add(cVarB2.e(i16, i17));
                            }
                        }
                        i16++;
                        i14 = 2;
                    }
                    if (cVar2.f94647c > 0 || iArr[i11][c10] == 0) {
                        linkedList2.add(cVar2.a(i12));
                    }
                    i14 = 2;
                }
                listSingletonList = a(linkedList2);
            }
            i12++;
        }
        c cVar3 = (c) Collections.min(listSingletonList, new a());
        cVar3.getClass();
        LinkedList linkedList3 = new LinkedList();
        for (d dVar = cVar3.b(bArr.length).f94646b; dVar != null; dVar = dVar.f94650a) {
            linkedList3.addFirst(dVar);
        }
        BitArray bitArray = new BitArray();
        Iterator it = linkedList3.iterator();
        while (it.hasNext()) {
            ((d) it.next()).a(bitArray, bArr);
        }
        return bitArray;
    }
}
