package p004if;

import com.google.crypto.tink.Mac;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.internal.MonitoringUtil;
import com.google.crypto.tink.internal.MutableMonitoringRegistry;
import com.google.crypto.tink.mac.MacKey;
import com.google.crypto.tink.monitoring.MonitoringClient;
import com.google.crypto.tink.monitoring.MonitoringKeysetInfo;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.crypto.tink.subtle.Bytes;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: compiled from: MacWrapper.java */
/* JADX INFO: loaded from: classes10.dex */
public final class a implements PrimitiveWrapper<Mac, Mac> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f69664a = Logger.getLogger(a.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f69665b = {0};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f69666c = new a();

    /* JADX INFO: renamed from: if.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: MacWrapper.java */
    public static class C0295a implements Mac {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final PrimitiveSet<Mac> f69667a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MonitoringClient.Logger f69668b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MonitoringClient.Logger f69669c;

        public C0295a(PrimitiveSet primitiveSet) {
            this.f69667a = primitiveSet;
            if (!primitiveSet.hasAnnotations()) {
                MonitoringClient.Logger logger = MonitoringUtil.DO_NOTHING_LOGGER;
                this.f69668b = logger;
                this.f69669c = logger;
            } else {
                MonitoringClient monitoringClient = MutableMonitoringRegistry.globalInstance().getMonitoringClient();
                MonitoringKeysetInfo monitoringKeysetInfo = MonitoringUtil.getMonitoringKeysetInfo(primitiveSet);
                this.f69668b = monitoringClient.createLogger(monitoringKeysetInfo, "mac", "compute");
                this.f69669c = monitoringClient.createLogger(monitoringKeysetInfo, "mac", "verify");
            }
        }

        @Override // com.google.crypto.tink.Mac
        public final byte[] computeMac(byte[] bArr) throws GeneralSecurityException {
            MonitoringClient.Logger logger = this.f69668b;
            PrimitiveSet<Mac> primitiveSet = this.f69667a;
            if (primitiveSet.getPrimary().getOutputPrefixType().equals(OutputPrefixType.LEGACY)) {
                bArr = Bytes.concat(bArr, a.f69665b);
            }
            try {
                byte[] bArrConcat = Bytes.concat(primitiveSet.getPrimary().getIdentifier(), primitiveSet.getPrimary().getPrimitive().computeMac(bArr));
                logger.log(primitiveSet.getPrimary().getKeyId(), bArr.length);
                return bArrConcat;
            } catch (GeneralSecurityException e5) {
                logger.logFailure();
                throw e5;
            }
        }

        @Override // com.google.crypto.tink.Mac
        public final void verifyMac(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
            int length = bArr.length;
            MonitoringClient.Logger logger = this.f69669c;
            if (length <= 5) {
                logger.logFailure();
                throw new GeneralSecurityException("tag too short");
            }
            byte[] bArrCopyOf = Arrays.copyOf(bArr, 5);
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
            PrimitiveSet<Mac> primitiveSet = this.f69667a;
            for (PrimitiveSet.Entry<Mac> entry : primitiveSet.getPrimitive(bArrCopyOf)) {
                byte[] bArrConcat = entry.getOutputPrefixType().equals(OutputPrefixType.LEGACY) ? Bytes.concat(bArr2, a.f69665b) : bArr2;
                try {
                    entry.getPrimitive().verifyMac(bArrCopyOfRange, bArrConcat);
                    logger.log(entry.getKeyId(), bArrConcat.length);
                    return;
                } catch (GeneralSecurityException e5) {
                    a.f69664a.info("tag prefix matches a key, but cannot verify: " + e5);
                }
            }
            for (PrimitiveSet.Entry<Mac> entry2 : primitiveSet.getRawPrimitives()) {
                try {
                    entry2.getPrimitive().verifyMac(bArr, bArr2);
                    logger.log(entry2.getKeyId(), bArr2.length);
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            logger.logFailure();
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Class<Mac> getInputPrimitiveClass() {
        return Mac.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Class<Mac> getPrimitiveClass() {
        return Mac.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public final Mac wrap(PrimitiveSet<Mac> primitiveSet) throws GeneralSecurityException {
        Iterator<List<PrimitiveSet.Entry<Mac>>> it = primitiveSet.getAll().iterator();
        while (it.hasNext()) {
            for (PrimitiveSet.Entry<Mac> entry : it.next()) {
                if (entry.getKey() instanceof MacKey) {
                    MacKey macKey = (MacKey) entry.getKey();
                    com.google.crypto.tink.util.Bytes bytesCopyFrom = com.google.crypto.tink.util.Bytes.copyFrom(entry.getIdentifier());
                    if (!bytesCopyFrom.equals(macKey.getOutputPrefix())) {
                        throw new GeneralSecurityException("Mac Key with parameters " + macKey.getParameters() + " has wrong output prefix (" + macKey.getOutputPrefix() + ") instead of (" + bytesCopyFrom + ")");
                    }
                }
            }
        }
        return new C0295a(primitiveSet);
    }
}
