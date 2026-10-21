package org.bouncycastle.jce.provider;

import androidx.camera.camera2.internal.h0;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1InputStream;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.util.encoders.Base64;

/* JADX INFO: loaded from: classes8.dex */
public class PEMUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f90428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f90429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f90430d;

    public PEMUtil(String str) {
        this.f90427a = h0.b("-----BEGIN ", str, "-----");
        this.f90428b = h0.b("-----BEGIN X509 ", str, "-----");
        this.f90429c = h0.b("-----END ", str, "-----");
        this.f90430d = h0.b("-----END X509 ", str, "-----");
    }

    public static String a(InputStream inputStream) throws IOException {
        int i10;
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            i10 = inputStream.read();
            if (i10 == 13 || i10 == 10 || i10 < 0) {
                if (i10 < 0 || stringBuffer.length() != 0) {
                    break;
                }
            } else if (i10 != 13) {
                stringBuffer.append((char) i10);
            }
        }
        if (i10 < 0) {
            return null;
        }
        return stringBuffer.toString();
    }

    public final ASN1Sequence b(InputStream inputStream) throws IOException {
        String strA;
        StringBuffer stringBuffer = new StringBuffer();
        do {
            strA = a(inputStream);
            if (strA == null || strA.startsWith(this.f90427a)) {
                break;
            }
        } while (!strA.startsWith(this.f90428b));
        while (true) {
            String strA2 = a(inputStream);
            if (strA2 == null || strA2.startsWith(this.f90429c) || strA2.startsWith(this.f90430d)) {
                break;
            }
            stringBuffer.append(strA2);
        }
        if (stringBuffer.length() == 0) {
            return null;
        }
        ASN1Primitive object = new ASN1InputStream(Base64.decode(stringBuffer.toString())).readObject();
        if (object instanceof ASN1Sequence) {
            return (ASN1Sequence) object;
        }
        throw new IOException("malformed PEM data encountered");
    }
}
