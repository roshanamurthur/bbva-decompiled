package com.google.crypto.tink.signature;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.PublicKeySign;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.MonitoringUtil;
import com.google.crypto.tink.internal.MutableMonitoringRegistry;
import com.google.crypto.tink.monitoring.MonitoringClient;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: classes10.dex */
public class PublicKeySignWrapper implements PrimitiveWrapper<PublicKeySign, PublicKeySign> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f47344a = {0};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PublicKeySignWrapper f47345b = new PublicKeySignWrapper();

    public static class a implements PublicKeySign {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrimitiveSet<PublicKeySign> f47346a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MonitoringClient.Logger f47347b;

        public a(PrimitiveSet<PublicKeySign> primitiveSet) {
            this.f47346a = primitiveSet;
            if (primitiveSet.hasAnnotations()) {
                this.f47347b = MutableMonitoringRegistry.globalInstance().getMonitoringClient().createLogger(MonitoringUtil.getMonitoringKeysetInfo(primitiveSet), "public_key_sign", "sign");
            } else {
                this.f47347b = MonitoringUtil.DO_NOTHING_LOGGER;
            }
        }

        @Override // com.google.crypto.tink.PublicKeySign
        public final byte[] sign(byte[] bArr) throws GeneralSecurityException {
            MonitoringClient.Logger logger = this.f47347b;
            PrimitiveSet<PublicKeySign> primitiveSet = this.f47346a;
            if (primitiveSet.getPrimary().getOutputPrefixType().equals(OutputPrefixType.LEGACY)) {
                bArr = Bytes.concat(bArr, PublicKeySignWrapper.f47344a);
            }
            try {
                byte[] bArrConcat = Bytes.concat(primitiveSet.getPrimary().getIdentifier(), primitiveSet.getPrimary().getPrimitive().sign(bArr));
                logger.log(primitiveSet.getPrimary().getKeyId(), bArr.length);
                return bArrConcat;
            } catch (GeneralSecurityException e5) {
                logger.logFailure();
                throw e5;
            }
        }
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(f47345b);
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<PublicKeySign> getInputPrimitiveClass() {
        return PublicKeySign.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<PublicKeySign> getPrimitiveClass() {
        return PublicKeySign.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public PublicKeySign wrap(PrimitiveSet<PublicKeySign> primitiveSet) {
        return new a(primitiveSet);
    }
}
