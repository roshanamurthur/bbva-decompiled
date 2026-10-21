package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.HybridEncrypt;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.MonitoringUtil;
import com.google.crypto.tink.internal.MutableMonitoringRegistry;
import com.google.crypto.tink.monitoring.MonitoringClient;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public class HybridEncryptWrapper implements PrimitiveWrapper<HybridEncrypt, HybridEncrypt> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HybridEncryptWrapper f46580a = new HybridEncryptWrapper();

    public static class a implements HybridEncrypt {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrimitiveSet<HybridEncrypt> f46581a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MonitoringClient.Logger f46582b;

        public a(PrimitiveSet<HybridEncrypt> primitiveSet) {
            this.f46581a = primitiveSet;
            if (primitiveSet.hasAnnotations()) {
                this.f46582b = MutableMonitoringRegistry.globalInstance().getMonitoringClient().createLogger(MonitoringUtil.getMonitoringKeysetInfo(primitiveSet), "hybrid_encrypt", "encrypt");
            } else {
                this.f46582b = MonitoringUtil.DO_NOTHING_LOGGER;
            }
        }

        @Override // com.google.crypto.tink.HybridEncrypt
        public final byte[] encrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            PrimitiveSet<HybridEncrypt> primitiveSet = this.f46581a;
            PrimitiveSet.Entry<HybridEncrypt> primary = primitiveSet.getPrimary();
            MonitoringClient.Logger logger = this.f46582b;
            if (primary == null) {
                logger.logFailure();
                throw new GeneralSecurityException("keyset without primary key");
            }
            try {
                byte[] bArrConcat = Bytes.concat(primitiveSet.getPrimary().getIdentifier(), primitiveSet.getPrimary().getPrimitive().encrypt(bArr, bArr2));
                logger.log(primitiveSet.getPrimary().getKeyId(), bArr.length);
                return bArrConcat;
            } catch (GeneralSecurityException e5) {
                logger.logFailure();
                throw e5;
            }
        }
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(f46580a);
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<HybridEncrypt> getInputPrimitiveClass() {
        return HybridEncrypt.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<HybridEncrypt> getPrimitiveClass() {
        return HybridEncrypt.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public HybridEncrypt wrap(PrimitiveSet<HybridEncrypt> primitiveSet) {
        return new a(primitiveSet);
    }
}
