package org.bouncycastle.asn1;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes12.dex */
public class BERGenerator extends ASN1Generator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f86545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f86546b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f86547c;

    public BERGenerator(OutputStream outputStream) {
        super(outputStream);
        this.f86545a = false;
    }

    public final void a(int i10) throws IOException {
        this._out.write(i10);
        this._out.write(128);
    }

    @Override // org.bouncycastle.asn1.ASN1Generator
    public OutputStream getRawOutputStream() {
        return this._out;
    }

    public void writeBEREnd() throws IOException {
        this._out.write(0);
        this._out.write(0);
        if (this.f86545a && this.f86546b) {
            this._out.write(0);
            this._out.write(0);
        }
    }

    public void writeBERHeader(int i10) throws IOException {
        if (this.f86545a) {
            int i11 = this.f86547c;
            int i12 = i11 | 128;
            if (this.f86546b) {
                a(i11 | 160);
            } else {
                if ((i10 & 32) == 0) {
                    a(i12);
                    return;
                }
                i10 = i11 | 160;
            }
        }
        a(i10);
    }

    public BERGenerator(OutputStream outputStream, int i10, boolean z10) {
        super(outputStream);
        this.f86545a = true;
        this.f86546b = z10;
        this.f86547c = i10;
    }
}
