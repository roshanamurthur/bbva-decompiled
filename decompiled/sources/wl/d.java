package wl;

import java.io.IOException;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: DeflaterOutputStream.java */
/* JADX INFO: loaded from: classes12.dex */
public final class d extends c {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public byte[] f94290q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public Deflater f94291r0;

    @Override // wl.c
    public final void b() throws IOException {
        Deflater deflater = this.f94291r0;
        if (!deflater.finished()) {
            deflater.finish();
            while (!deflater.finished()) {
                Deflater deflater2 = this.f94291r0;
                byte[] bArr = this.f94290q0;
                int iDeflate = deflater2.deflate(bArr, 0, bArr.length);
                if (iDeflate > 0) {
                    super.write(bArr, 0, iDeflate);
                }
            }
        }
        deflater.end();
        super.b();
    }

    @Override // wl.c, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // wl.c, java.io.OutputStream
    public final void write(int i10) throws IOException {
        write(new byte[]{(byte) i10}, 0, 1);
    }

    @Override // wl.c, java.io.OutputStream
    public final void write(byte[] bArr, int i10, int i11) throws IOException {
        Deflater deflater = this.f94291r0;
        deflater.setInput(bArr, i10, i11);
        while (!deflater.needsInput()) {
            Deflater deflater2 = this.f94291r0;
            byte[] bArr2 = this.f94290q0;
            int iDeflate = deflater2.deflate(bArr2, 0, bArr2.length);
            if (iDeflate > 0) {
                super.write(bArr2, 0, iDeflate);
            }
        }
    }
}
