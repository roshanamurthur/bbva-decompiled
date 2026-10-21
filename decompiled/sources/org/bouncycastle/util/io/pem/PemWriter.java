package org.bouncycastle.util.io.pem;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Writer;
import org.bouncycastle.util.Strings;
import org.bouncycastle.util.encoders.Base64;

/* JADX INFO: loaded from: classes13.dex */
public class PemWriter extends BufferedWriter {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final int f91665p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final char[] f91666q0;

    public PemWriter(Writer writer) {
        super(writer);
        this.f91666q0 = new char[64];
        String strLineSeparator = Strings.lineSeparator();
        this.f91665p0 = strLineSeparator != null ? strLineSeparator.length() : 2;
    }

    public int getOutputSize(PemObject pemObject) {
        int length = pemObject.getType().length() + 10;
        int i10 = this.f91665p0;
        int length2 = ((length + i10) * 2) + 10;
        if (!pemObject.getHeaders().isEmpty()) {
            for (PemHeader pemHeader : pemObject.getHeaders()) {
                length2 += pemHeader.getValue().length() + pemHeader.getName().length() + 2 + i10;
            }
            length2 += i10;
        }
        int length3 = ((pemObject.getContent().length + 2) / 3) * 4;
        return (((length3 + 63) / 64) * i10) + length3 + length2;
    }

    public void writeObject(PemObjectGenerator pemObjectGenerator) throws IOException {
        char[] cArr;
        int i10;
        PemObject pemObjectGenerate = pemObjectGenerator.generate();
        write("-----BEGIN " + pemObjectGenerate.getType() + "-----");
        newLine();
        if (!pemObjectGenerate.getHeaders().isEmpty()) {
            for (PemHeader pemHeader : pemObjectGenerate.getHeaders()) {
                write(pemHeader.getName());
                write(": ");
                write(pemHeader.getValue());
                newLine();
            }
            newLine();
        }
        byte[] bArrEncode = Base64.encode(pemObjectGenerate.getContent());
        int length = 0;
        while (length < bArrEncode.length) {
            int i11 = 0;
            while (true) {
                cArr = this.f91666q0;
                if (i11 == cArr.length || (i10 = length + i11) >= bArrEncode.length) {
                    break;
                }
                cArr[i11] = (char) bArrEncode[i10];
                i11++;
            }
            write(cArr, 0, i11);
            newLine();
            length += cArr.length;
        }
        write("-----END " + pemObjectGenerate.getType() + "-----");
        newLine();
    }
}
