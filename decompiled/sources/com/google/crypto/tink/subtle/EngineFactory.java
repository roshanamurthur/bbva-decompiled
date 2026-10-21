package com.google.crypto.tink.subtle;

import com.google.android.gms.security.ProviderInstaller;
import com.google.crypto.tink.config.internal.TinkFipsUtil;
import com.google.crypto.tink.subtle.EngineWrapper;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes10.dex */
public final class EngineFactory<T_WRAPPER extends EngineWrapper<JcePrimitiveT>, JcePrimitiveT> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d<JcePrimitiveT> f47464a;
    public static final EngineFactory<EngineWrapper.TCipher, Cipher> CIPHER = new EngineFactory<>(new EngineWrapper.TCipher());
    public static final EngineFactory<EngineWrapper.TMac, Mac> MAC = new EngineFactory<>(new EngineWrapper.TMac());
    public static final EngineFactory<EngineWrapper.TSignature, Signature> SIGNATURE = new EngineFactory<>(new EngineWrapper.TSignature());
    public static final EngineFactory<EngineWrapper.TMessageDigest, MessageDigest> MESSAGE_DIGEST = new EngineFactory<>(new EngineWrapper.TMessageDigest());
    public static final EngineFactory<EngineWrapper.TKeyAgreement, KeyAgreement> KEY_AGREEMENT = new EngineFactory<>(new EngineWrapper.TKeyAgreement());
    public static final EngineFactory<EngineWrapper.TKeyPairGenerator, KeyPairGenerator> KEY_PAIR_GENERATOR = new EngineFactory<>(new EngineWrapper.TKeyPairGenerator());
    public static final EngineFactory<EngineWrapper.TKeyFactory, KeyFactory> KEY_FACTORY = new EngineFactory<>(new EngineWrapper.TKeyFactory());

    public static class a<JcePrimitiveT> implements d<JcePrimitiveT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EngineWrapper<JcePrimitiveT> f47465a;

        public a(EngineWrapper engineWrapper) {
            this.f47465a = engineWrapper;
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.d
        public final JcePrimitiveT a(String str, List<Provider> list) throws GeneralSecurityException {
            return b(str);
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.d
        public final JcePrimitiveT b(String str) throws GeneralSecurityException {
            Iterator<Provider> it = EngineFactory.toProviderList(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL").iterator();
            Exception exc = null;
            while (true) {
                boolean zHasNext = it.hasNext();
                EngineWrapper<JcePrimitiveT> engineWrapper = this.f47465a;
                if (!zHasNext) {
                    return engineWrapper.getInstance(str, null);
                }
                try {
                    return engineWrapper.getInstance(str, it.next());
                } catch (Exception e5) {
                    if (exc == null) {
                        exc = e5;
                    }
                }
            }
        }
    }

    public static class b<JcePrimitiveT> implements d<JcePrimitiveT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EngineWrapper<JcePrimitiveT> f47466a;

        public b(EngineWrapper engineWrapper) {
            this.f47466a = engineWrapper;
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.d
        public final JcePrimitiveT a(String str, List<Provider> list) throws GeneralSecurityException {
            Iterator<Provider> it = list.iterator();
            while (it.hasNext()) {
                try {
                    return this.f47466a.getInstance(str, it.next());
                } catch (Exception unused) {
                }
            }
            return b(str);
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.d
        public final JcePrimitiveT b(String str) throws GeneralSecurityException {
            return this.f47466a.getInstance(str, null);
        }
    }

    public static class c<JcePrimitiveT> implements d<JcePrimitiveT> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EngineWrapper<JcePrimitiveT> f47467a;

        public c(EngineWrapper engineWrapper) {
            this.f47467a = engineWrapper;
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.d
        public final JcePrimitiveT a(String str, List<Provider> list) throws GeneralSecurityException {
            return b(str);
        }

        @Override // com.google.crypto.tink.subtle.EngineFactory.d
        public final JcePrimitiveT b(String str) throws GeneralSecurityException {
            Iterator<Provider> it = EngineFactory.toProviderList(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL", "Conscrypt").iterator();
            Exception exc = null;
            while (it.hasNext()) {
                try {
                    return this.f47467a.getInstance(str, it.next());
                } catch (Exception e5) {
                    if (exc == null) {
                        exc = e5;
                    }
                }
            }
            throw new GeneralSecurityException("No good Provider found.", exc);
        }
    }

    public interface d<JcePrimitiveT> {
        JcePrimitiveT a(String str, List<Provider> list) throws GeneralSecurityException;

        JcePrimitiveT b(String str) throws GeneralSecurityException;
    }

    public EngineFactory(T_WRAPPER t_wrapper) {
        if (TinkFipsUtil.useOnlyFips()) {
            this.f47464a = new c(t_wrapper);
        } else if (SubtleUtil.isAndroid()) {
            this.f47464a = new a(t_wrapper);
        } else {
            this.f47464a = new b(t_wrapper);
        }
    }

    public static List<Provider> toProviderList(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        return arrayList;
    }

    public JcePrimitiveT getInstance(String str) throws GeneralSecurityException {
        return this.f47464a.b(str);
    }
}
