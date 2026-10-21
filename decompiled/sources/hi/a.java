package hi;

import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JWEAlgorithm;
import com.nimbusds.jose.JWEProvider;
import com.nimbusds.jose.jca.JWEJCAContext;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: BaseJWEProvider.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class a implements JWEProvider {
    private final Set<JWEAlgorithm> algs;
    private final Set<EncryptionMethod> encs;
    private final JWEJCAContext jcaContext = new JWEJCAContext();

    public a(Set<JWEAlgorithm> set, Set<EncryptionMethod> set2) {
        if (set == null) {
            throw new IllegalArgumentException("The supported JWE algorithm set must not be null");
        }
        this.algs = Collections.unmodifiableSet(set);
        if (set2 == null) {
            throw new IllegalArgumentException("The supported encryption methods must not be null");
        }
        this.encs = set2;
    }

    @Override // com.nimbusds.jose.JWEProvider
    public Set<EncryptionMethod> supportedEncryptionMethods() {
        return this.encs;
    }

    @Override // com.nimbusds.jose.JWEProvider
    public Set<JWEAlgorithm> supportedJWEAlgorithms() {
        return this.algs;
    }

    @Override // com.nimbusds.jose.jca.JCAAware
    public JWEJCAContext getJCAContext() {
        return this.jcaContext;
    }
}
