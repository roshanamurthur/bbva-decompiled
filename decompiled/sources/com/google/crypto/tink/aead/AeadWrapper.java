package com.google.crypto.tink.aead;

import com.google.crypto.tink.Aead;
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
public class AeadWrapper implements PrimitiveWrapper<Aead, Aead> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f46461a = Logger.getLogger(AeadWrapper.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AeadWrapper f46462b = new AeadWrapper();

    public static class a implements Aead {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrimitiveSet<Aead> f46463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MonitoringClient.Logger f46464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MonitoringClient.Logger f46465c;

        public a(PrimitiveSet primitiveSet) {
            this.f46463a = primitiveSet;
            if (!primitiveSet.hasAnnotations()) {
                MonitoringClient.Logger logger = MonitoringUtil.DO_NOTHING_LOGGER;
                this.f46464b = logger;
                this.f46465c = logger;
            } else {
                MonitoringClient monitoringClient = MutableMonitoringRegistry.globalInstance().getMonitoringClient();
                MonitoringKeysetInfo monitoringKeysetInfo = MonitoringUtil.getMonitoringKeysetInfo(primitiveSet);
                this.f46464b = monitoringClient.createLogger(monitoringKeysetInfo, "aead", "encrypt");
                this.f46465c = monitoringClient.createLogger(monitoringKeysetInfo, "aead", "decrypt");
            }
        }

        @Override // com.google.crypto.tink.Aead
        public final byte[] decrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            int length = bArr.length;
            PrimitiveSet<Aead> primitiveSet = this.f46463a;
            MonitoringClient.Logger logger = this.f46465c;
            if (length > 5) {
                byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (PrimitiveSet.Entry<Aead> entry : primitiveSet.getPrimitive(bArrCopyOf)) {
                    try {
                        byte[] bArrDecrypt = entry.getPrimitive().decrypt(bArrCopyOfRange, bArr2);
                        logger.log(entry.getKeyId(), bArrCopyOfRange.length);
                        return bArrDecrypt;
                    } catch (GeneralSecurityException e5) {
                        AeadWrapper.f46461a.info("ciphertext prefix matches a key, but cannot decrypt: " + e5);
                    }
                }
            }
            for (PrimitiveSet.Entry<Aead> entry2 : primitiveSet.getRawPrimitives()) {
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

        @Override // com.google.crypto.tink.Aead
        public final byte[] encrypt(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            MonitoringClient.Logger logger = this.f46464b;
            PrimitiveSet<Aead> primitiveSet = this.f46463a;
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
        Registry.registerPrimitiveWrapper(f46462b);
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<Aead> getInputPrimitiveClass() {
        return Aead.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<Aead> getPrimitiveClass() {
        return Aead.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Aead wrap(PrimitiveSet<Aead> primitiveSet) throws GeneralSecurityException {
        return new a(primitiveSet);
    }
}
