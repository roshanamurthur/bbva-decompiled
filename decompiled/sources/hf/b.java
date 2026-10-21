package hf;

import com.google.crypto.tink.jwt.JwtValidator;
import com.google.crypto.tink.jwt.RawJwt;
import com.google.crypto.tink.jwt.VerifiedJwt;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Optional;

/* JADX INFO: compiled from: JwtMacInternal.java */
/* JADX INFO: loaded from: classes10.dex */
@Immutable
public interface b {
    VerifiedJwt a(String str, JwtValidator jwtValidator, Optional<String> optional) throws GeneralSecurityException;

    String b(RawJwt rawJwt, Optional<String> optional) throws GeneralSecurityException;
}
