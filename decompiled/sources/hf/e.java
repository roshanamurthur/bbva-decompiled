package hf;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.jwt.JwtInvalidException;
import com.google.crypto.tink.jwt.JwtPublicKeyVerify;
import com.google.crypto.tink.jwt.JwtPublicKeyVerifyInternal;
import com.google.crypto.tink.jwt.JwtValidator;
import com.google.crypto.tink.jwt.VerifiedJwt;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: JwtPublicKeyVerifyWrapper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class e implements PrimitiveWrapper<JwtPublicKeyVerifyInternal, JwtPublicKeyVerify> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f69421a = new e();

    /* JADX INFO: compiled from: JwtPublicKeyVerifyWrapper.java */
    @Immutable
    public static class a implements JwtPublicKeyVerify {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrimitiveSet<JwtPublicKeyVerifyInternal> f69422a;

        public a(PrimitiveSet<JwtPublicKeyVerifyInternal> primitiveSet) {
            this.f69422a = primitiveSet;
        }

        @Override // com.google.crypto.tink.jwt.JwtPublicKeyVerify
        public final VerifiedJwt verifyAndDecode(String str, JwtValidator jwtValidator) throws GeneralSecurityException {
            Iterator<List<PrimitiveSet.Entry<JwtPublicKeyVerifyInternal>>> it = this.f69422a.getAll().iterator();
            GeneralSecurityException generalSecurityException = null;
            while (it.hasNext()) {
                for (PrimitiveSet.Entry<JwtPublicKeyVerifyInternal> entry : it.next()) {
                    try {
                        return entry.getPrimitive().verifyAndDecodeWithKid(str, jwtValidator, com.google.crypto.tink.jwt.d.c(entry.getKeyId(), entry.getOutputPrefixType()));
                    } catch (GeneralSecurityException e5) {
                        if (e5 instanceof JwtInvalidException) {
                            generalSecurityException = e5;
                        }
                    }
                }
            }
            if (generalSecurityException != null) {
                throw generalSecurityException;
            }
            throw new GeneralSecurityException("invalid JWT");
        }
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Class<JwtPublicKeyVerifyInternal> getInputPrimitiveClass() {
        return JwtPublicKeyVerifyInternal.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Class<JwtPublicKeyVerify> getPrimitiveClass() {
        return JwtPublicKeyVerify.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final JwtPublicKeyVerify wrap(PrimitiveSet<JwtPublicKeyVerifyInternal> primitiveSet) throws GeneralSecurityException {
        Iterator<List<PrimitiveSet.Entry<JwtPublicKeyVerifyInternal>>> it = primitiveSet.getAll().iterator();
        while (it.hasNext()) {
            for (PrimitiveSet.Entry<JwtPublicKeyVerifyInternal> entry : it.next()) {
                if (entry.getOutputPrefixType() != OutputPrefixType.RAW && entry.getOutputPrefixType() != OutputPrefixType.TINK) {
                    throw new GeneralSecurityException("unsupported OutputPrefixType");
                }
            }
        }
        return new a(primitiveSet);
    }
}
