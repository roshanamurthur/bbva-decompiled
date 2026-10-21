package ff;

import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;

/* JADX INFO: compiled from: HpkeKem.java */
/* JADX INFO: loaded from: classes10.dex */
@Immutable
public interface h {
    byte[] a(byte[] bArr, k kVar) throws GeneralSecurityException;

    i b(byte[] bArr) throws GeneralSecurityException;

    byte[] c() throws GeneralSecurityException;
}
