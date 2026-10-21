package pm;

import androidx.camera.camera2.internal.h0;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.util.encoders.Base64;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a[] f92701a;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92703b;

        public a(String str) {
            this.f92702a = h0.b("-----BEGIN ", str, "-----");
            this.f92703b = h0.b("-----END ", str, "-----");
        }
    }

    public b(String str) {
        this.f92701a = new a[]{new a(str), new a("X509 ".concat(str)), new a("PKCS7")};
    }

    public static String b(InputStream inputStream) throws IOException {
        int i10;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            i10 = inputStream.read();
            if (i10 != 13 && i10 != 10 && i10 >= 0) {
                stringBuffer.append((char) i10);
            } else if (i10 < 0 || stringBuffer.length() != 0) {
                break;
            }
        }
        if (i10 < 0) {
            if (stringBuffer.length() == 0) {
                return null;
            }
            return stringBuffer.toString();
        }
        if (i10 == 13) {
            inputStream.mark(1);
            int i11 = inputStream.read();
            if (i11 == 10) {
                inputStream.mark(1);
            }
            if (i11 > 0) {
                inputStream.reset();
            }
        }
        return stringBuffer.toString();
    }

    public final a a(String str) {
        int i10 = 0;
        while (true) {
            a[] aVarArr = this.f92701a;
            if (i10 == aVarArr.length) {
                return null;
            }
            a aVar = aVarArr[i10];
            if (str.startsWith(aVar.f92702a) || str.startsWith(aVar.f92703b)) {
                return aVar;
            }
            i10++;
        }
    }

    public final ASN1Sequence c(InputStream inputStream) throws IOException {
        StringBuffer stringBuffer = new StringBuffer();
        a aVarA = null;
        while (aVarA == null) {
            String strB = b(inputStream);
            if (strB == null) {
                break;
            }
            aVarA = a(strB);
            if (aVarA != null && !strB.startsWith(aVarA.f92702a)) {
                throw new IOException("malformed PEM data: found footer where header was expected");
            }
        }
        if (aVarA == null) {
            throw new IOException("malformed PEM data: no header found");
        }
        a aVarA2 = null;
        while (aVarA2 == null) {
            String strB2 = b(inputStream);
            if (strB2 == null) {
                break;
            }
            aVarA2 = a(strB2);
            if (aVarA2 == null) {
                stringBuffer.append(strB2);
            } else if (!strB2.startsWith(aVarA.f92703b)) {
                throw new IOException("malformed PEM data: header/footer mismatch");
            }
        }
        if (aVarA2 == null) {
            throw new IOException("malformed PEM data: no footer found");
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        try {
            return ASN1Sequence.getInstance(Base64.decode(stringBuffer.toString()));
        } catch (Exception unused) {
            throw new IOException("malformed PEM data encountered");
        }
    }
}
