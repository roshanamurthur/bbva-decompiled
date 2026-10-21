package org.bouncycastle.crypto.parsers;

import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.crypto.KeyParser;
import org.bouncycastle.crypto.params.AsymmetricKeyParameter;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.util.io.Streams;

/* JADX INFO: loaded from: classes5.dex */
public class ECIESPublicKeyParser implements KeyParser {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ECDomainParameters f89397a;

    public ECIESPublicKeyParser(ECDomainParameters eCDomainParameters) {
        this.f89397a = eCDomainParameters;
    }

    @Override // org.bouncycastle.crypto.KeyParser
    public AsymmetricKeyParameter readKey(InputStream inputStream) throws IOException {
        byte[] bArr;
        int i10 = inputStream.read();
        if (i10 == 0) {
            throw new IOException("Sender's public key invalid.");
        }
        ECDomainParameters eCDomainParameters = this.f89397a;
        if (i10 == 2 || i10 == 3) {
            bArr = new byte[((eCDomainParameters.getCurve().getFieldSize() + 7) / 8) + 1];
        } else {
            if (i10 != 4 && i10 != 6 && i10 != 7) {
                throw new IOException("Sender's public key has invalid point encoding 0x" + Integer.toString(i10, 16));
            }
            bArr = new byte[(((eCDomainParameters.getCurve().getFieldSize() + 7) / 8) * 2) + 1];
        }
        bArr[0] = (byte) i10;
        Streams.readFully(inputStream, bArr, 1, bArr.length - 1);
        return new ECPublicKeyParameters(eCDomainParameters.getCurve().decodePoint(bArr), eCDomainParameters);
    }
}
