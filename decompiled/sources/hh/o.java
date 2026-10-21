package hh;

import com.google.zxing.FormatException;

/* JADX INFO: compiled from: DecodedNumeric.java */
/* JADX INFO: loaded from: classes10.dex */
public final class o extends p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f69454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f69455c;

    public o(int i10, int i11, int i12) throws FormatException {
        super(i10);
        if (i11 < 0 || i11 > 10 || i12 < 0 || i12 > 10) {
            throw FormatException.getFormatInstance();
        }
        this.f69454b = i11;
        this.f69455c = i12;
    }
}
