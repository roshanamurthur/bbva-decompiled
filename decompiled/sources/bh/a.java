package bh;

import android.util.Log;
import com.google.zxing.datamatrix.encoder.HighLevelEncoder;
import com.mypinpad.tsdk.isolation.r2;
import com.orhanobut.logger.LogAdapter;
import java.security.cert.X509CRL;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.jcajce.interfaces.BCX509Certificate;
import org.bouncycastle.x509.X509AttributeCertificate;

/* JADX INFO: compiled from: ASCIIEncoder.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements c, LogAdapter {
    public a(r2 r2Var) {
        ((Integer) r2.a(new Object[]{r2Var}, 2125025788, -2125025786, System.identityHashCode(r2Var))).intValue();
    }

    public static X500Name b(Object obj) {
        return obj instanceof X509Certificate ? f((X509Certificate) obj) : h((X500Principal) ((X509AttributeCertificate) obj).getIssuer().getPrincipals()[0]);
    }

    public static X500Name c(X509CRL x509crl) {
        if (x509crl != null) {
            return h(x509crl.getIssuerX500Principal());
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static X500Name f(X509Certificate x509Certificate) {
        if (!(x509Certificate instanceof BCX509Certificate)) {
            if (x509Certificate != 0) {
                return h(x509Certificate.getIssuerX500Principal());
            }
            throw new IllegalStateException();
        }
        X500Name issuerX500Name = ((BCX509Certificate) x509Certificate).getIssuerX500Name();
        if (issuerX500Name != null) {
            return issuerX500Name;
        }
        throw new IllegalStateException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static X500Name g(X509Certificate x509Certificate) {
        if (!(x509Certificate instanceof BCX509Certificate)) {
            return h(x509Certificate.getSubjectX500Principal());
        }
        X500Name subjectX500Name = ((BCX509Certificate) x509Certificate).getSubjectX500Name();
        if (subjectX500Name != null) {
            return subjectX500Name;
        }
        throw new IllegalStateException();
    }

    public static X500Name h(X500Principal x500Principal) {
        if (x500Principal == null) {
            throw new IllegalStateException();
        }
        byte[] encoded = x500Principal.getEncoded();
        if (encoded == null) {
            throw new IllegalStateException();
        }
        X500Name x500Name = X500Name.getInstance(encoded);
        if (x500Name != null) {
            return x500Name;
        }
        throw new IllegalStateException();
    }

    @Override // bh.c
    public void a(d dVar) {
        int i10 = dVar.f25221f;
        String str = dVar.f25216a;
        if (HighLevelEncoder.determineConsecutiveDigitCount(str, i10) >= 2) {
            char cCharAt = str.charAt(dVar.f25221f);
            char cCharAt2 = str.charAt(dVar.f25221f + 1);
            if (HighLevelEncoder.c(cCharAt) && HighLevelEncoder.c(cCharAt2)) {
                dVar.d((char) ((cCharAt2 - '0') + ((cCharAt - '0') * 10) + 130));
                dVar.f25221f += 2;
                return;
            } else {
                throw new IllegalArgumentException("not digits: " + cCharAt + cCharAt2);
            }
        }
        char cA = dVar.a();
        int iF = HighLevelEncoder.f(str, dVar.f25221f, 0);
        if (iF == 0) {
            if (!HighLevelEncoder.d(cA)) {
                dVar.d((char) (cA + 1));
                dVar.f25221f++;
                return;
            } else {
                dVar.d((char) 235);
                dVar.d((char) (cA - 127));
                dVar.f25221f++;
                return;
            }
        }
        if (iF == 1) {
            dVar.d((char) 230);
            dVar.f25222g = 1;
            return;
        }
        if (iF == 2) {
            dVar.d((char) 239);
            dVar.f25222g = 2;
            return;
        }
        if (iF == 3) {
            dVar.d((char) 238);
            dVar.f25222g = 3;
        } else if (iF == 4) {
            dVar.d((char) 240);
            dVar.f25222g = 4;
        } else {
            if (iF != 5) {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(iF)));
            }
            dVar.d((char) 231);
            dVar.f25222g = 5;
        }
    }

    @Override // com.orhanobut.logger.LogAdapter
    public void w(String str, String str2) {
        Log.w(str, str2);
    }

    @Override // com.orhanobut.logger.LogAdapter
    public void wtf(String str, String str2) {
        Log.wtf(str, str2);
    }

    @Override // com.orhanobut.logger.LogAdapter
    public void d(String str, String str2) {
    }

    @Override // com.orhanobut.logger.LogAdapter
    public void e(String str, String str2) {
    }

    @Override // com.orhanobut.logger.LogAdapter
    public void i(String str, String str2) {
    }

    @Override // com.orhanobut.logger.LogAdapter
    public void v(String str, String str2) {
    }
}
