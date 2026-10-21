package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import com.google.zxing.common.BitArray;
import hh.a;
import hh.b;
import hh.c;
import hh.d;
import hh.e;
import hh.g;
import hh.j;
import hh.r;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractExpandedDecoder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitArray f49981a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f49982b;

    public AbstractExpandedDecoder(BitArray bitArray) {
        this.f49981a = bitArray;
        this.f49982b = new r(bitArray);
    }

    public static AbstractExpandedDecoder createDecoder(BitArray bitArray) {
        if (bitArray.get(1)) {
            return new g(bitArray);
        }
        if (!bitArray.get(2)) {
            return new j(bitArray);
        }
        int iC = r.c(1, 4, bitArray);
        if (iC == 4) {
            return new a(bitArray);
        }
        if (iC == 5) {
            return new b(bitArray);
        }
        int iC2 = r.c(1, 5, bitArray);
        if (iC2 == 12) {
            return new c(bitArray);
        }
        if (iC2 == 13) {
            return new d(bitArray);
        }
        switch (r.c(1, 7, bitArray)) {
            case 56:
                return new e(bitArray, "310", "11");
            case 57:
                return new e(bitArray, "320", "11");
            case 58:
                return new e(bitArray, "310", "13");
            case 59:
                return new e(bitArray, "320", "13");
            case 60:
                return new e(bitArray, "310", "15");
            case 61:
                return new e(bitArray, "320", "15");
            case 62:
                return new e(bitArray, "310", "17");
            case 63:
                return new e(bitArray, "320", "17");
            default:
                throw new IllegalStateException("unknown decoder: ".concat(String.valueOf(bitArray)));
        }
    }

    public final r getGeneralDecoder() {
        return this.f49982b;
    }

    public final BitArray getInformation() {
        return this.f49981a;
    }

    public abstract String parseInformation() throws NotFoundException, FormatException;
}
