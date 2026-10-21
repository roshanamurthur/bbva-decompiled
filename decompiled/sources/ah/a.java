package ah;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.datamatrix.decoder.Version;

/* JADX INFO: compiled from: BitMatrixParser.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitMatrix f245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BitMatrix f246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Version f247c;

    public a(BitMatrix bitMatrix) throws FormatException {
        int height = bitMatrix.getHeight();
        if (height < 8 || height > 144 || (height & 1) != 0) {
            throw FormatException.getFormatInstance();
        }
        Version versionForDimensions = Version.getVersionForDimensions(bitMatrix.getHeight(), bitMatrix.getWidth());
        this.f247c = versionForDimensions;
        int symbolSizeRows = versionForDimensions.getSymbolSizeRows();
        int symbolSizeColumns = versionForDimensions.getSymbolSizeColumns();
        if (bitMatrix.getHeight() != symbolSizeRows) {
            throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
        }
        int dataRegionSizeRows = versionForDimensions.getDataRegionSizeRows();
        int dataRegionSizeColumns = versionForDimensions.getDataRegionSizeColumns();
        int i10 = symbolSizeRows / dataRegionSizeRows;
        int i11 = symbolSizeColumns / dataRegionSizeColumns;
        BitMatrix bitMatrix2 = new BitMatrix(i11 * dataRegionSizeColumns, i10 * dataRegionSizeRows);
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i12 * dataRegionSizeRows;
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = i14 * dataRegionSizeColumns;
                for (int i16 = 0; i16 < dataRegionSizeRows; i16++) {
                    int i17 = ((dataRegionSizeRows + 2) * i12) + 1 + i16;
                    int i18 = i13 + i16;
                    for (int i19 = 0; i19 < dataRegionSizeColumns; i19++) {
                        if (bitMatrix.get(((dataRegionSizeColumns + 2) * i14) + 1 + i19, i17)) {
                            bitMatrix2.set(i15 + i19, i18);
                        }
                    }
                }
            }
        }
        this.f245a = bitMatrix2;
        this.f246b = new BitMatrix(bitMatrix2.getWidth(), bitMatrix2.getHeight());
    }

    public final boolean a(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            i10 += i12;
            i11 += 4 - ((i12 + 4) & 7);
        }
        if (i11 < 0) {
            i11 += i13;
            i10 += 4 - ((i13 + 4) & 7);
        }
        this.f246b.set(i11, i10);
        return this.f245a.get(i11, i10);
    }

    public final int b(int i10, int i11, int i12, int i13) {
        int i14 = i10 - 2;
        int i15 = i11 - 2;
        int i16 = (a(i14, i15, i12, i13) ? 1 : 0) << 1;
        int i17 = i11 - 1;
        if (a(i14, i17, i12, i13)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        int i19 = i10 - 1;
        if (a(i19, i15, i12, i13)) {
            i18 |= 1;
        }
        int i20 = i18 << 1;
        if (a(i19, i17, i12, i13)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (a(i19, i11, i12, i13)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        if (a(i10, i15, i12, i13)) {
            i22 |= 1;
        }
        int i23 = i22 << 1;
        if (a(i10, i17, i12, i13)) {
            i23 |= 1;
        }
        int i24 = i23 << 1;
        return a(i10, i11, i12, i13) ? i24 | 1 : i24;
    }
}
