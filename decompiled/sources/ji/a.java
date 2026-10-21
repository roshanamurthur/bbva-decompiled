package ji;

import com.nimbusds.jose.jwk.source.JWKSource;
import com.nimbusds.jose.proc.SecurityContext;
import net.jcip.annotations.ThreadSafe;

/* JADX INFO: compiled from: AbstractJWKSelectorWithSource.java */
/* JADX INFO: loaded from: classes10.dex */
@ThreadSafe
public abstract class a<C extends SecurityContext> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JWKSource<C> f79093a;

    public a(JWKSource<C> jWKSource) {
        if (jWKSource == null) {
            throw new IllegalArgumentException("The JWK source must not be null");
        }
        this.f79093a = jWKSource;
    }

    public JWKSource<C> getJWKSource() {
        return this.f79093a;
    }
}
