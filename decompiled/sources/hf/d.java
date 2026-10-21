package hf;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.jwt.JwtPublicKeySign;
import com.google.crypto.tink.jwt.JwtPublicKeySignInternal;
import com.google.crypto.tink.jwt.RawJwt;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: JwtPublicKeySignWrapper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements PrimitiveWrapper<JwtPublicKeySignInternal, JwtPublicKeySign> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f69419a = new d();

    /* JADX INFO: compiled from: JwtPublicKeySignWrapper.java */
    @Immutable
    public static class a implements JwtPublicKeySign {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrimitiveSet<JwtPublicKeySignInternal> f69420a;

        public a(PrimitiveSet<JwtPublicKeySignInternal> primitiveSet) {
            this.f69420a = primitiveSet;
        }

        @Override // com.google.crypto.tink.jwt.JwtPublicKeySign
        public final String signAndEncode(RawJwt rawJwt) throws GeneralSecurityException {
            PrimitiveSet<JwtPublicKeySignInternal> primitiveSet = this.f69420a;
            PrimitiveSet.Entry<JwtPublicKeySignInternal> primary = primitiveSet.getPrimary();
            return primitiveSet.getPrimary().getPrimitive().signAndEncodeWithKid(rawJwt, com.google.crypto.tink.jwt.d.c(primary.getKeyId(), primary.getOutputPrefixType()));
        }
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Class<JwtPublicKeySignInternal> getInputPrimitiveClass() {
        return JwtPublicKeySignInternal.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Class<JwtPublicKeySign> getPrimitiveClass() {
        return JwtPublicKeySign.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final JwtPublicKeySign wrap(PrimitiveSet<JwtPublicKeySignInternal> primitiveSet) throws GeneralSecurityException {
        if (primitiveSet.getPrimary() == null) {
            throw new GeneralSecurityException("Primitive set has no primary.");
        }
        Iterator<List<PrimitiveSet.Entry<JwtPublicKeySignInternal>>> it = primitiveSet.getAll().iterator();
        while (it.hasNext()) {
            for (PrimitiveSet.Entry<JwtPublicKeySignInternal> entry : it.next()) {
                if (entry.getOutputPrefixType() != OutputPrefixType.RAW && entry.getOutputPrefixType() != OutputPrefixType.TINK) {
                    throw new GeneralSecurityException("unsupported OutputPrefixType");
                }
            }
        }
        return new a(primitiveSet);
    }
}
