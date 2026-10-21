package com.google.crypto.tink.hybrid;

import com.google.crypto.tink.HybridDecrypt;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.MonitoringUtil;
import com.google.crypto.tink.internal.MutableMonitoringRegistry;
import com.google.crypto.tink.monitoring.MonitoringClient;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public class HybridDecryptWrapper implements PrimitiveWrapper<HybridDecrypt, HybridDecrypt> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f46576a = Logger.getLogger(HybridDecryptWrapper.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HybridDecryptWrapper f46577b = new HybridDecryptWrapper();

    public static class a implements HybridDecrypt {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrimitiveSet<HybridDecrypt> f46578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MonitoringClient.Logger f46579b;

        public a(PrimitiveSet<HybridDecrypt> primitiveSet) {
            this.f46578a = primitiveSet;
            if (primitiveSet.hasAnnotations()) {
                this.f46579b = MutableMonitoringRegistry.globalInstance().getMonitoringClient().createLogger(MonitoringUtil.getMonitoringKeysetInfo(primitiveSet), "hybrid_decrypt", "decrypt");
            } else {
                this.f46579b = MonitoringUtil.DO_NOTHING_LOGGER;
            }
        }

        @Override // com.google.crypto.tink.HybridDecrypt
        public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            int length = bArr.length;
            PrimitiveSet<HybridDecrypt> primitiveSet = this.f46578a;
            MonitoringClient.Logger logger = this.f46579b;
            if (length > 5) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (PrimitiveSet.Entry<HybridDecrypt> entry : primitiveSet.getPrimitive(bArrCopyOfRange)) {
                    try {
                        byte[] bArrDecrypt = entry.getPrimitive().decrypt(bArrCopyOfRange2, bArr2);
                        logger.log(entry.getKeyId(), bArrCopyOfRange2.length);
                        return bArrDecrypt;
                    } catch (GeneralSecurityException e5) {
                        HybridDecryptWrapper.f46576a.info("ciphertext prefix matches a key, but cannot decrypt: " + e5.toString());
                    }
                }
            }
            for (PrimitiveSet.Entry<HybridDecrypt> entry2 : primitiveSet.getRawPrimitives()) {
                try {
                    byte[] bArrDecrypt2 = entry2.getPrimitive().decrypt(bArr, bArr2);
                    logger.log(entry2.getKeyId(), bArr.length);
                    return bArrDecrypt2;
                } catch (GeneralSecurityException unused) {
                }
            }
            logger.logFailure();
            throw new GeneralSecurityException("decryption failed");
        }
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(f46577b);
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<HybridDecrypt> getInputPrimitiveClass() {
        return HybridDecrypt.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<HybridDecrypt> getPrimitiveClass() {
        return HybridDecrypt.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public HybridDecrypt wrap(PrimitiveSet<HybridDecrypt> primitiveSet) {
        return new a(primitiveSet);
    }
}
