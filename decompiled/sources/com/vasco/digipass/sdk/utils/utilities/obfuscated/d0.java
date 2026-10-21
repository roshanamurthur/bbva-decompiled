package com.vasco.digipass.sdk.utils.utilities.obfuscated;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.bouncycastle.asn1.ASN1Encoding;

/* JADX INFO: loaded from: classes9.dex */
public class d0 extends c {
    public d0(int i10, h hVar) {
        super(true, i10, a(hVar));
    }

    private static byte[] a(h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (int i10 = 0; i10 != hVar.a(); i10++) {
            try {
                byteArrayOutputStream.write(((o) hVar.a(i10)).getEncoded(ASN1Encoding.BER));
            } catch (IOException e5) {
                throw new t(ad.e.d("malformed object: ", e5), e5);
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @Override // com.vasco.digipass.sdk.utils.utilities.obfuscated.c, com.vasco.digipass.sdk.utils.utilities.obfuscated.u
    public void a(s sVar) throws IOException {
        sVar.a(this.f65955p0 ? 96 : 64, this.f65956q0);
        sVar.a(128);
        sVar.a(this.f65957r0);
        sVar.a(0);
        sVar.a(0);
    }
}
