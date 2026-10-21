package com.google.crypto.tink.daead;

import com.google.crypto.tink.DeterministicAead;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.MonitoringUtil;
import com.google.crypto.tink.internal.MutableMonitoringRegistry;
import com.google.crypto.tink.monitoring.MonitoringClient;
import com.google.crypto.tink.monitoring.MonitoringKeysetInfo;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public class DeterministicAeadWrapper implements PrimitiveWrapper<DeterministicAead, DeterministicAead> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f46568a = Logger.getLogger(DeterministicAeadWrapper.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final DeterministicAeadWrapper f46569b = new DeterministicAeadWrapper();

    public static class a implements DeterministicAead {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrimitiveSet<DeterministicAead> f46570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MonitoringClient.Logger f46571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MonitoringClient.Logger f46572c;

        public a(PrimitiveSet<DeterministicAead> primitiveSet) {
            this.f46570a = primitiveSet;
            if (!primitiveSet.hasAnnotations()) {
                MonitoringClient.Logger logger = MonitoringUtil.DO_NOTHING_LOGGER;
                this.f46571b = logger;
                this.f46572c = logger;
            } else {
                MonitoringClient monitoringClient = MutableMonitoringRegistry.globalInstance().getMonitoringClient();
                MonitoringKeysetInfo monitoringKeysetInfo = MonitoringUtil.getMonitoringKeysetInfo(primitiveSet);
                this.f46571b = monitoringClient.createLogger(monitoringKeysetInfo, "daead", "encrypt");
                this.f46572c = monitoringClient.createLogger(monitoringKeysetInfo, "daead", "decrypt");
            }
        }

        @Override // com.google.crypto.tink.DeterministicAead
        public final byte[] decryptDeterministically(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            int length = bArr.length;
            PrimitiveSet<DeterministicAead> primitiveSet = this.f46570a;
            MonitoringClient.Logger logger = this.f46572c;
            if (length > 5) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (PrimitiveSet.Entry<DeterministicAead> entry : primitiveSet.getPrimitive(bArrCopyOf)) {
                    try {
                        byte[] bArrDecryptDeterministically = entry.getPrimitive().decryptDeterministically(bArrCopyOfRange, bArr2);
                        logger.log(entry.getKeyId(), bArrCopyOfRange.length);
                        return bArrDecryptDeterministically;
                    } catch (GeneralSecurityException e5) {
                        DeterministicAeadWrapper.f46568a.info("ciphertext prefix matches a key, but cannot decrypt: " + e5);
                    }
                }
            }
            for (PrimitiveSet.Entry<DeterministicAead> entry2 : primitiveSet.getRawPrimitives()) {
                try {
                    byte[] bArrDecryptDeterministically2 = entry2.getPrimitive().decryptDeterministically(bArr, bArr2);
                    logger.log(entry2.getKeyId(), bArr.length);
                    return bArrDecryptDeterministically2;
                } catch (GeneralSecurityException unused) {
                }
            }
            logger.logFailure();
            throw new GeneralSecurityException("decryption failed");
        }

        @Override // com.google.crypto.tink.DeterministicAead
        public final byte[] encryptDeterministically(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            MonitoringClient.Logger logger = this.f46571b;
            PrimitiveSet<DeterministicAead> primitiveSet = this.f46570a;
            try {
                byte[] bArrConcat = Bytes.concat(primitiveSet.getPrimary().getIdentifier(), primitiveSet.getPrimary().getPrimitive().encryptDeterministically(bArr, bArr2));
                logger.log(primitiveSet.getPrimary().getKeyId(), bArr.length);
                return bArrConcat;
            } catch (GeneralSecurityException e5) {
                logger.logFailure();
                throw e5;
            }
        }
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(f46569b);
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<DeterministicAead> getInputPrimitiveClass() {
        return DeterministicAead.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<DeterministicAead> getPrimitiveClass() {
        return DeterministicAead.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public DeterministicAead wrap(PrimitiveSet<DeterministicAead> primitiveSet) {
        return new a(primitiveSet);
    }
}
