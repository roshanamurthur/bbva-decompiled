package org.bouncycastle.asn1;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes12.dex */
public class DERSequenceGenerator extends DERGenerator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ByteArrayOutputStream f86575d;

    public DERSequenceGenerator(OutputStream outputStream) throws IOException {
        super(outputStream);
        this.f86575d = new ByteArrayOutputStream();
    }

    public void addObject(ASN1Encodable aSN1Encodable) throws IOException {
        aSN1Encodable.toASN1Primitive().encodeTo(this.f86575d, ASN1Encoding.DER);
    }

    public void close() throws IOException {
        byte[] byteArray = this.f86575d.toByteArray();
        if (!this.f86565a) {
            DERGenerator.a(this._out, 48, byteArray);
            return;
        }
        int i10 = this.f86567c;
        if (!this.f86566b) {
            DERGenerator.a(this._out, i10 | 160, byteArray);
            return;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        DERGenerator.a(byteArrayOutputStream, 48, byteArray);
        DERGenerator.a(this._out, i10 | 160, byteArrayOutputStream.toByteArray());
    }

    @Override // org.bouncycastle.asn1.ASN1Generator
    public OutputStream getRawOutputStream() {
        return this.f86575d;
    }

    public DERSequenceGenerator(OutputStream outputStream, int i10, boolean z10) throws IOException {
        super(outputStream, i10, z10);
        this.f86575d = new ByteArrayOutputStream();
    }
}
