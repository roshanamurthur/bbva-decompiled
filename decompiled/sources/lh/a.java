package lh;

import com.google.zxing.FormatException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.Version;

/* JADX INFO: compiled from: BitMatrixParser.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BitMatrix f83212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Version f83213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f83214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f83215d;

    public a(BitMatrix bitMatrix) throws FormatException {
        int height = bitMatrix.getHeight();
        if (height < 21 || (height & 3) != 1) {
            throw FormatException.getFormatInstance();
        }
        this.f83212a = bitMatrix;
    }

    public final int a(int i10, int i11, int i12) {
        boolean z10 = this.f83215d;
        BitMatrix bitMatrix = this.f83212a;
        return z10 ? bitMatrix.get(i11, i10) : bitMatrix.get(i10, i11) ? (i12 << 1) | 1 : i12 << 1;
    }

    public final d b() throws FormatException {
        d dVar = this.f83214c;
        if (dVar != null) {
            return dVar;
        }
        int iA = 0;
        int iA2 = 0;
        for (int i10 = 0; i10 < 6; i10++) {
            iA2 = a(i10, 8, iA2);
        }
        int iA3 = a(8, 7, a(8, 8, a(7, 8, iA2)));
        for (int i11 = 5; i11 >= 0; i11--) {
            iA3 = a(8, i11, iA3);
        }
        int height = this.f83212a.getHeight();
        int i12 = height - 7;
        for (int i13 = height - 1; i13 >= i12; i13--) {
            iA = a(8, i13, iA);
        }
        for (int i14 = height - 8; i14 < height; i14++) {
            iA = a(i14, 8, iA);
        }
        d dVarA = d.a(iA3, iA);
        if (dVarA == null) {
            dVarA = d.a(iA3 ^ 21522, iA ^ 21522);
        }
        this.f83214c = dVarA;
        if (dVarA != null) {
            return dVarA;
        }
        throw FormatException.getFormatInstance();
    }

    public final Version c() throws FormatException {
        Version version = this.f83213b;
        if (version != null) {
            return version;
        }
        int height = this.f83212a.getHeight();
        int i10 = (height - 17) / 4;
        if (i10 <= 6) {
            return Version.getVersionForNumber(i10);
        }
        int i11 = height - 11;
        int iA = 0;
        int iA2 = 0;
        for (int i12 = 5; i12 >= 0; i12--) {
            for (int i13 = height - 9; i13 >= i11; i13--) {
                iA2 = a(i13, i12, iA2);
            }
        }
        Version versionB = Version.b(iA2);
        if (versionB != null && versionB.getDimensionForVersion() == height) {
            this.f83213b = versionB;
            return versionB;
        }
        for (int i14 = 5; i14 >= 0; i14--) {
            for (int i15 = height - 9; i15 >= i11; i15--) {
                iA = a(i14, i15, iA);
            }
        }
        Version versionB2 = Version.b(iA);
        if (versionB2 == null || versionB2.getDimensionForVersion() != height) {
            throw FormatException.getFormatInstance();
        }
        this.f83213b = versionB2;
        return versionB2;
    }

    public final void d() {
        if (this.f83214c == null) {
            return;
        }
        b bVar = b.values()[this.f83214c.f83220b];
        BitMatrix bitMatrix = this.f83212a;
        int height = bitMatrix.getHeight();
        bVar.getClass();
        for (int i10 = 0; i10 < height; i10++) {
            for (int i11 = 0; i11 < height; i11++) {
                if (bVar.a(i10, i11)) {
                    bitMatrix.flip(i11, i10);
                }
            }
        }
    }
}
