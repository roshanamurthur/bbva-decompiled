package bh;

import com.google.zxing.datamatrix.encoder.SymbolInfo;

/* JADX INFO: compiled from: DataMatrixSymbolInfo144.java */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends SymbolInfo {
    @Override // com.google.zxing.datamatrix.encoder.SymbolInfo
    public final int getDataLengthForInterleavedBlock(int i10) {
        return i10 <= 8 ? 156 : 155;
    }

    @Override // com.google.zxing.datamatrix.encoder.SymbolInfo
    public final int getInterleavedBlockCount() {
        return 10;
    }
}
