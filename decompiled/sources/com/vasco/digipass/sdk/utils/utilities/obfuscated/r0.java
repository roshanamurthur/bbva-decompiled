package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
class r0 extends InputStream {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final y f66289p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private boolean f66290q0 = true;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private InputStream f66291r0;

    public r0(y yVar) {
        this.f66289p0 = yVar;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        r rVar;
        int i12 = 0;
        if (this.f66291r0 == null) {
            if (!this.f66290q0 || (rVar = (r) this.f66289p0.a()) == null) {
                return -1;
            }
            this.f66290q0 = false;
            this.f66291r0 = rVar.b();
        }
        while (true) {
            int i13 = this.f66291r0.read(bArr, i10 + i12, i11 - i12);
            if (i13 >= 0) {
                i12 += i13;
                if (i12 == i11) {
                    return i12;
                }
            } else {
                r rVar2 = (r) this.f66289p0.a();
                if (rVar2 == null) {
                    this.f66291r0 = null;
                    if (i12 < 1) {
                        return -1;
                    }
                    return i12;
                }
                this.f66291r0 = rVar2.b();
            }
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        r rVar;
        if (this.f66291r0 == null) {
            if (!this.f66290q0 || (rVar = (r) this.f66289p0.a()) == null) {
                return -1;
            }
            this.f66290q0 = false;
            this.f66291r0 = rVar.b();
        }
        while (true) {
            int i10 = this.f66291r0.read();
            if (i10 >= 0) {
                return i10;
            }
            r rVar2 = (r) this.f66289p0.a();
            if (rVar2 == null) {
                this.f66291r0 = null;
                return -1;
            }
            this.f66291r0 = rVar2.b();
        }
    }
}
