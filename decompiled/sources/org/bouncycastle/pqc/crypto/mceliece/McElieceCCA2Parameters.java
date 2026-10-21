package org.bouncycastle.pqc.crypto.mceliece;

/* JADX INFO: loaded from: classes13.dex */
public class McElieceCCA2Parameters extends McElieceParameters {

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final String f91132u0;

    public McElieceCCA2Parameters() {
        this(11, 50, "SHA-256");
    }

    public String getDigest() {
        return this.f91132u0;
    }

    public McElieceCCA2Parameters(int i10) {
        this(i10, "SHA-256");
    }

    public McElieceCCA2Parameters(int i10, int i11) {
        this(i10, i11, "SHA-256");
    }

    public McElieceCCA2Parameters(int i10, int i11, int i12) {
        this(i10, i11, i12, "SHA-256");
    }

    public McElieceCCA2Parameters(int i10, int i11, int i12, String str) {
        super(i10, i11, i12);
        this.f91132u0 = str;
    }

    public McElieceCCA2Parameters(int i10, int i11, String str) {
        super(i10, i11);
        this.f91132u0 = str;
    }

    public McElieceCCA2Parameters(int i10, String str) {
        super(i10);
        this.f91132u0 = str;
    }

    public McElieceCCA2Parameters(String str) {
        this(11, 50, str);
    }
}
