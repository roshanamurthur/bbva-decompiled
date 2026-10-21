package com.nimbusds.jose.proc;

import com.nimbusds.jose.Algorithm;
import com.nimbusds.jose.EncryptionMethod;
import com.nimbusds.jose.JOSEObject;
import com.nimbusds.jose.JWEObject;
import com.nimbusds.jose.JWSObject;
import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class JOSEMatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set<Class<? extends JOSEObject>> f62730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set<Algorithm> f62731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set<EncryptionMethod> f62732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set<URI> f62733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<String> f62734e;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Set<Class<? extends JOSEObject>> f62735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Set<Algorithm> f62736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Set<EncryptionMethod> f62737c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Set<URI> f62738d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Set<String> f62739e;

        public Builder algorithm(Algorithm algorithm) {
            if (algorithm == null) {
                this.f62736b = null;
            } else {
                this.f62736b = new HashSet(Collections.singletonList(algorithm));
            }
            return this;
        }

        public Builder algorithms(Algorithm... algorithmArr) {
            algorithms(new HashSet(Arrays.asList(algorithmArr)));
            return this;
        }

        public JOSEMatcher build() {
            return new JOSEMatcher(this.f62735a, this.f62736b, this.f62737c, this.f62738d, this.f62739e);
        }

        public Builder encryptionMethod(EncryptionMethod encryptionMethod) {
            if (encryptionMethod == null) {
                this.f62737c = null;
            } else {
                this.f62737c = new HashSet(Collections.singletonList(encryptionMethod));
            }
            return this;
        }

        public Builder encryptionMethods(EncryptionMethod... encryptionMethodArr) {
            encryptionMethods(new HashSet(Arrays.asList(encryptionMethodArr)));
            return this;
        }

        public Builder joseClass(Class<? extends JOSEObject> cls) {
            if (cls == null) {
                this.f62735a = null;
            } else {
                this.f62735a = new HashSet(Collections.singletonList(cls));
            }
            return this;
        }

        public Builder joseClasses(Class<? extends JOSEObject>... clsArr) {
            joseClasses(new HashSet(Arrays.asList(clsArr)));
            return this;
        }

        public Builder jwkURL(URI uri) {
            if (uri == null) {
                this.f62738d = null;
            } else {
                this.f62738d = new HashSet(Collections.singletonList(uri));
            }
            return this;
        }

        public Builder jwkURLs(URI... uriArr) {
            jwkURLs(new HashSet(Arrays.asList(uriArr)));
            return this;
        }

        public Builder keyID(String str) {
            if (str == null) {
                this.f62739e = null;
            } else {
                this.f62739e = new HashSet(Collections.singletonList(str));
            }
            return this;
        }

        public Builder keyIDs(String... strArr) {
            keyIDs(new HashSet(Arrays.asList(strArr)));
            return this;
        }

        public Builder algorithms(Set<Algorithm> set) {
            this.f62736b = set;
            return this;
        }

        public Builder encryptionMethods(Set<EncryptionMethod> set) {
            this.f62737c = set;
            return this;
        }

        public Builder joseClasses(Set<Class<? extends JOSEObject>> set) {
            this.f62735a = set;
            return this;
        }

        public Builder jwkURLs(Set<URI> set) {
            this.f62738d = set;
            return this;
        }

        public Builder keyIDs(Set<String> set) {
            this.f62739e = set;
            return this;
        }
    }

    public JOSEMatcher(Set<Class<? extends JOSEObject>> set, Set<Algorithm> set2, Set<EncryptionMethod> set3, Set<URI> set4, Set<String> set5) {
        this.f62730a = set;
        this.f62731b = set2;
        this.f62732c = set3;
        this.f62733d = set4;
        this.f62734e = set5;
    }

    public Set<Algorithm> getAlgorithms() {
        return this.f62731b;
    }

    public Set<EncryptionMethod> getEncryptionMethods() {
        return this.f62732c;
    }

    public Set<Class<? extends JOSEObject>> getJOSEClasses() {
        return this.f62730a;
    }

    public Set<URI> getJWKURLs() {
        return this.f62733d;
    }

    public Set<String> getKeyIDs() {
        return this.f62734e;
    }

    public boolean matches(JOSEObject jOSEObject) {
        Set<Class<? extends JOSEObject>> set = this.f62730a;
        if (set != null) {
            boolean z10 = false;
            for (Class<? extends JOSEObject> cls : set) {
                if (cls != null && cls.isInstance(jOSEObject)) {
                    z10 = true;
                }
            }
            if (!z10) {
                return false;
            }
        }
        Set<Algorithm> set2 = this.f62731b;
        if (set2 != null && !set2.contains(jOSEObject.getHeader().getAlgorithm())) {
            return false;
        }
        Set<EncryptionMethod> set3 = this.f62732c;
        if (set3 != null && (!(jOSEObject instanceof JWEObject) || !set3.contains(((JWEObject) jOSEObject).getHeader().getEncryptionMethod()))) {
            return false;
        }
        String keyID = null;
        Set<URI> set4 = this.f62733d;
        if (set4 != null) {
            if (!set4.contains(jOSEObject instanceof JWSObject ? ((JWSObject) jOSEObject).getHeader().getJWKURL() : jOSEObject instanceof JWEObject ? ((JWEObject) jOSEObject).getHeader().getJWKURL() : null)) {
                return false;
            }
        }
        Set<String> set5 = this.f62734e;
        if (set5 == null) {
            return true;
        }
        if (jOSEObject instanceof JWSObject) {
            keyID = ((JWSObject) jOSEObject).getHeader().getKeyID();
        } else if (jOSEObject instanceof JWEObject) {
            keyID = ((JWEObject) jOSEObject).getHeader().getKeyID();
        }
        return set5.contains(keyID);
    }
}
