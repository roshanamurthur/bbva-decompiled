package hf;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.jwt.JwtInvalidException;
import com.google.crypto.tink.jwt.JwtMac;
import com.google.crypto.tink.jwt.JwtValidator;
import com.google.crypto.tink.jwt.RawJwt;
import com.google.crypto.tink.jwt.VerifiedJwt;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: JwtMacWrapper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements PrimitiveWrapper<b, JwtMac> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f69417a = new c();

    /* JADX INFO: compiled from: JwtMacWrapper.java */
    @Immutable
    public static class a implements JwtMac {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrimitiveSet<b> f69418a;

        public a(PrimitiveSet primitiveSet) {
            this.f69418a = primitiveSet;
        }

        @Override // com.google.crypto.tink.jwt.JwtMac
        public final String computeMacAndEncode(RawJwt rawJwt) throws GeneralSecurityException {
            PrimitiveSet.Entry<b> primary = this.f69418a.getPrimary();
            return primary.getPrimitive().b(rawJwt, com.google.crypto.tink.jwt.d.c(primary.getKeyId(), primary.getOutputPrefixType()));
        }

        @Override // com.google.crypto.tink.jwt.JwtMac
        public final VerifiedJwt verifyMacAndDecode(String str, JwtValidator jwtValidator) throws GeneralSecurityException {
            Iterator<List<PrimitiveSet.Entry<b>>> it = this.f69418a.getAll().iterator();
            GeneralSecurityException generalSecurityException = null;
            while (it.hasNext()) {
                for (PrimitiveSet.Entry<b> entry : it.next()) {
                    try {
                        return entry.getPrimitive().a(str, jwtValidator, com.google.crypto.tink.jwt.d.c(entry.getKeyId(), entry.getOutputPrefixType()));
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
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Class<b> getInputPrimitiveClass() {
        return b.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Class<JwtMac> getPrimitiveClass() {
        return JwtMac.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final JwtMac wrap(PrimitiveSet<b> primitiveSet) throws GeneralSecurityException {
        if (primitiveSet.getPrimary() == null) {
            throw new GeneralSecurityException("Primitive set has no primary.");
        }
        Iterator<List<PrimitiveSet.Entry<b>>> it = primitiveSet.getAll().iterator();
        while (it.hasNext()) {
            for (PrimitiveSet.Entry<b> entry : it.next()) {
                if (entry.getOutputPrefixType() != OutputPrefixType.RAW && entry.getOutputPrefixType() != OutputPrefixType.TINK) {
                    throw new GeneralSecurityException("unsupported OutputPrefixType");
                }
            }
        }
        return new a(primitiveSet);
    }
}
