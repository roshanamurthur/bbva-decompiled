package com.google.zxing.datamatrix.encoder;

import bh.b;
import com.bbva.sl.ar.android.libkeymanagement.exception.ReturnCode;
import com.google.zxing.Dimension;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes10.dex */
public class SymbolInfo {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static SymbolInfo[] f49891g = {new SymbolInfo(false, 3, 5, 8, 8, 1), new SymbolInfo(false, 5, 7, 10, 10, 1), new SymbolInfo(true, 5, 7, 16, 6, 1), new SymbolInfo(false, 8, 10, 12, 12, 1), new SymbolInfo(true, 10, 11, 14, 6, 2), new SymbolInfo(false, 12, 12, 14, 14, 1), new SymbolInfo(true, 16, 14, 24, 10, 1), new SymbolInfo(false, 18, 14, 16, 16, 1), new SymbolInfo(false, 22, 18, 18, 18, 1), new SymbolInfo(true, 22, 18, 16, 10, 2), new SymbolInfo(false, 30, 20, 20, 20, 1), new SymbolInfo(true, 32, 24, 16, 14, 2), new SymbolInfo(false, 36, 24, 22, 22, 1), new SymbolInfo(false, 44, 28, 24, 24, 1), new SymbolInfo(true, 49, 28, 22, 14, 2), new SymbolInfo(false, 62, 36, 14, 14, 4), new SymbolInfo(false, 86, 42, 16, 16, 4), new SymbolInfo(false, 114, 48, 18, 18, 4), new SymbolInfo(false, 144, 56, 20, 20, 4), new SymbolInfo(false, 174, 68, 22, 22, 4), new SymbolInfo(204, 84, 24, 24, 4, 102, 42, false), new SymbolInfo(280, 112, 14, 14, 16, 140, 56, false), new SymbolInfo(368, 144, 16, 16, 16, 92, 36, false), new SymbolInfo(456, 192, 18, 18, 16, 114, 48, false), new SymbolInfo(576, 224, 20, 20, 16, 144, 56, false), new SymbolInfo(696, 272, 22, 22, 16, 174, 68, false), new SymbolInfo(816, 336, 24, 24, 16, 136, 56, false), new SymbolInfo(1050, Constant.ERROR_CODE_408, 18, 18, 36, 175, 68, false), new SymbolInfo(ReturnCode.ERR_CONFIG_SSL_RES_NOT_FOUND, 496, 20, 20, 36, 163, 62, false), new b(1558, 620, 22, 22, 36, -1, 62, false)};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f49892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f49894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f49895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f49896e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f49897f;
    public final int matrixHeight;
    public final int matrixWidth;

    public SymbolInfo(boolean z10, int i10, int i11, int i12, int i13, int i14) {
        this(i10, i11, i12, i13, i14, i10, i11, z10);
    }

    public static SymbolInfo lookup(int i10) {
        return lookup(i10, SymbolShapeHint.FORCE_NONE, null, null, true);
    }

    public static void overrideSymbolSet(SymbolInfo[] symbolInfoArr) {
        f49891g = symbolInfoArr;
    }

    public final int a() {
        int i10 = 1;
        int i11 = this.f49895d;
        if (i11 != 1) {
            i10 = 2;
            if (i11 != 2 && i11 != 4) {
                if (i11 == 16) {
                    return 4;
                }
                if (i11 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i10;
    }

    public final int b() {
        int i10 = this.f49895d;
        if (i10 == 1 || i10 == 2) {
            return 1;
        }
        if (i10 == 4) {
            return 2;
        }
        if (i10 == 16) {
            return 4;
        }
        if (i10 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public int getCodewordCount() {
        return this.f49893b + this.f49894c;
    }

    public final int getDataCapacity() {
        return this.f49893b;
    }

    public int getDataLengthForInterleavedBlock(int i10) {
        return this.f49896e;
    }

    public final int getErrorCodewords() {
        return this.f49894c;
    }

    public final int getErrorLengthForInterleavedBlock(int i10) {
        return this.f49897f;
    }

    public int getInterleavedBlockCount() {
        return this.f49893b / this.f49896e;
    }

    public final int getSymbolDataHeight() {
        return b() * this.matrixHeight;
    }

    public final int getSymbolDataWidth() {
        return a() * this.matrixWidth;
    }

    public final int getSymbolHeight() {
        return getSymbolDataHeight() + (b() << 1);
    }

    public final int getSymbolWidth() {
        return getSymbolDataWidth() + (a() << 1);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f49892a ? "Rectangular Symbol:" : "Square Symbol:");
        sb2.append(" data region ");
        sb2.append(this.matrixWidth);
        sb2.append('x');
        sb2.append(this.matrixHeight);
        sb2.append(", symbol size ");
        sb2.append(getSymbolWidth());
        sb2.append('x');
        sb2.append(getSymbolHeight());
        sb2.append(", symbol data size ");
        sb2.append(getSymbolDataWidth());
        sb2.append('x');
        sb2.append(getSymbolDataHeight());
        sb2.append(", codewords ");
        sb2.append(this.f49893b);
        sb2.append('+');
        sb2.append(this.f49894c);
        return sb2.toString();
    }

    public SymbolInfo(int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z10) {
        this.f49892a = z10;
        this.f49893b = i10;
        this.f49894c = i11;
        this.matrixWidth = i12;
        this.matrixHeight = i13;
        this.f49895d = i14;
        this.f49896e = i15;
        this.f49897f = i16;
    }

    public static SymbolInfo lookup(int i10, boolean z10, boolean z11) {
        return lookup(i10, z10 ? SymbolShapeHint.FORCE_NONE : SymbolShapeHint.FORCE_SQUARE, null, null, z11);
    }

    public static SymbolInfo lookup(int i10, SymbolShapeHint symbolShapeHint) {
        return lookup(i10, symbolShapeHint, null, null, true);
    }

    public static SymbolInfo lookup(int i10, SymbolShapeHint symbolShapeHint, Dimension dimension, Dimension dimension2, boolean z10) {
        for (SymbolInfo symbolInfo : f49891g) {
            if (!(symbolShapeHint == SymbolShapeHint.FORCE_SQUARE && symbolInfo.f49892a) && ((symbolShapeHint != SymbolShapeHint.FORCE_RECTANGLE || symbolInfo.f49892a) && ((dimension == null || (symbolInfo.getSymbolWidth() >= dimension.getWidth() && symbolInfo.getSymbolHeight() >= dimension.getHeight())) && ((dimension2 == null || (symbolInfo.getSymbolWidth() <= dimension2.getWidth() && symbolInfo.getSymbolHeight() <= dimension2.getHeight())) && i10 <= symbolInfo.f49893b)))) {
                return symbolInfo;
            }
        }
        if (z10) {
            throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i10)));
        }
        return null;
    }
}
