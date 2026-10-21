package org.bouncycastle.util.io.pem;

import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.processing.f;
import com.bbva.glomohybrid.base.deeplink.extensions.DeepLinkExtensionsKt;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import org.bouncycastle.util.encoders.Base64;

/* JADX INFO: loaded from: classes13.dex */
public class PemReader extends BufferedReader {
    public PemReader(Reader reader) {
        super(reader);
    }

    public PemObject readPemObject() throws IOException {
        String line;
        String strSubstring;
        int iIndexOf;
        String line2;
        do {
            line = readLine();
            if (line == null) {
                break;
            }
        } while (!line.startsWith("-----BEGIN "));
        if (line == null || (iIndexOf = (strSubstring = line.substring(11)).indexOf(45)) <= 0 || !strSubstring.endsWith("-----") || strSubstring.length() - iIndexOf != 5) {
            return null;
        }
        String strSubstring2 = strSubstring.substring(0, iIndexOf);
        String strD = f.d("-----END ", strSubstring2);
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        while (true) {
            line2 = readLine();
            if (line2 == null) {
                break;
            }
            if (line2.indexOf(DeepLinkExtensionsKt.DYNAMIC_LINK_DELIMITER) >= 0) {
                int iIndexOf2 = line2.indexOf(58);
                arrayList.add(new PemHeader(line2.substring(0, iIndexOf2), line2.substring(iIndexOf2 + 1).trim()));
            } else {
                if (line2.indexOf(strD) != -1) {
                    break;
                }
                stringBuffer.append(line2.trim());
            }
        }
        if (line2 != null) {
            return new PemObject(strSubstring2, arrayList, Base64.decode(stringBuffer.toString()));
        }
        throw new IOException(u.f(strD, " not found"));
    }
}
