package kf;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.PublicKeyVerify;
import com.google.crypto.tink.internal.MonitoringUtil;
import com.google.crypto.tink.internal.MutableMonitoringRegistry;
import com.google.crypto.tink.monitoring.MonitoringClient;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;

/* JADX INFO: compiled from: PublicKeyVerifyWrapper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class c implements PrimitiveWrapper<PublicKeyVerify, PublicKeyVerify> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f79314a = Logger.getLogger(c.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f79315b = {0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f79316c = new c();

    /* JADX INFO: compiled from: PublicKeyVerifyWrapper.java */
    public static class a implements PublicKeyVerify {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrimitiveSet<PublicKeyVerify> f79317a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MonitoringClient.Logger f79318b;

        public a(PrimitiveSet<PublicKeyVerify> primitiveSet) {
            this.f79317a = primitiveSet;
            if (primitiveSet.hasAnnotations()) {
                this.f79318b = MutableMonitoringRegistry.globalInstance().getMonitoringClient().createLogger(MonitoringUtil.getMonitoringKeysetInfo(primitiveSet), "public_key_verify", "verify");
            } else {
                this.f79318b = MonitoringUtil.DO_NOTHING_LOGGER;
            }
        }

        @Override // com.google.crypto.tink.PublicKeyVerify
        public final void verify(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            int length = bArr.length;
            MonitoringClient.Logger logger = this.f79318b;
            if (length <= 5) {
                logger.logFailure();
                throw new GeneralSecurityException("signature too short");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            PrimitiveSet<PublicKeyVerify> primitiveSet = this.f79317a;
            for (PrimitiveSet.Entry<PublicKeyVerify> entry : primitiveSet.getPrimitive(bArrCopyOf)) {
                byte[] bArrConcat = entry.getOutputPrefixType().equals(OutputPrefixType.LEGACY) ? Bytes.concat(bArr2, c.f79315b) : bArr2;
                try {
                    entry.getPrimitive().verify(bArrCopyOfRange, bArrConcat);
                    logger.log(entry.getKeyId(), bArrConcat.length);
                    return;
                } catch (GeneralSecurityException e5) {
                    c.f79314a.info("signature prefix matches a key, but cannot verify: " + e5);
                }
            }
            for (PrimitiveSet.Entry<PublicKeyVerify> entry2 : primitiveSet.getRawPrimitives()) {
                try {
                    entry2.getPrimitive().verify(bArr, bArr2);
                    logger.log(entry2.getKeyId(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            logger.logFailure();
            throw new GeneralSecurityException("invalid signature");
        }
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Class<PublicKeyVerify> getInputPrimitiveClass() {
        return PublicKeyVerify.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Class<PublicKeyVerify> getPrimitiveClass() {
        return PublicKeyVerify.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final PublicKeyVerify wrap(PrimitiveSet<PublicKeyVerify> primitiveSet) throws GeneralSecurityException {
        return new a(primitiveSet);
    }
}
