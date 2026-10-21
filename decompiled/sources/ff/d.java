package ff;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: HpkeAead.java */
/* JADX INFO: loaded from: classes10.dex */
@Immutable
public interface d {
    int a();

    byte[] b() throws GeneralSecurityException;

    byte[] c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException;

    byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) throws GeneralSecurityException;

    void e();
}
