package com.google.crypto.tink.prf;

import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.PrimitiveWrapper;
import com.google.crypto.tink.Registry;
import com.google.crypto.tink.internal.MonitoringUtil;
import com.google.crypto.tink.internal.MutableMonitoringRegistry;
import com.google.crypto.tink.monitoring.MonitoringClient;
import com.google.crypto.tink.proto.OutputPrefixType;
import com.google.errorprone.annotations.Immutable;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
@Immutable
public class PrfSetWrapper implements PrimitiveWrapper<Prf, PrfSet> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final PrfSetWrapper f46842a = new PrfSetWrapper();

    public static class a extends PrfSet {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Integer, Prf> f46843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46844b;

        /* JADX INFO: renamed from: com.google.crypto.tink.prf.PrfSetWrapper$a$a, reason: collision with other inner class name */
        @Immutable
        public static class C0204a implements Prf {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Prf f46845a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f46846b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final MonitoringClient.Logger f46847c;

            public C0204a(Prf prf, int i10, MonitoringClient.Logger logger) {
                this.f46845a = prf;
                this.f46846b = i10;
                this.f46847c = logger;
            }

            @Override // com.google.crypto.tink.prf.Prf
            public final byte[] compute(byte[] bArr, int i10) throws GeneralSecurityException {
                MonitoringClient.Logger logger = this.f46847c;
                try {
                    byte[] bArrCompute = this.f46845a.compute(bArr, i10);
                    logger.log(this.f46846b, bArr.length);
                    return bArrCompute;
                } catch (GeneralSecurityException e5) {
                    logger.logFailure();
                    throw e5;
                }
            }
        }

        public a(PrimitiveSet primitiveSet) throws GeneralSecurityException {
            if (primitiveSet.getRawPrimitives().isEmpty()) {
                throw new GeneralSecurityException("No primitives provided.");
            }
            if (primitiveSet.getPrimary() == null) {
                throw new GeneralSecurityException("Primary key not set.");
            }
            MonitoringClient.Logger loggerCreateLogger = primitiveSet.hasAnnotations() ? MutableMonitoringRegistry.globalInstance().getMonitoringClient().createLogger(MonitoringUtil.getMonitoringKeysetInfo(primitiveSet), "prf", "compute") : MonitoringUtil.DO_NOTHING_LOGGER;
            this.f46844b = primitiveSet.getPrimary().getKeyId();
            List<PrimitiveSet.Entry> rawPrimitives = primitiveSet.getRawPrimitives();
            HashMap map = new HashMap();
            for (PrimitiveSet.Entry entry : rawPrimitives) {
                if (!entry.getOutputPrefixType().equals(OutputPrefixType.RAW)) {
                    throw new GeneralSecurityException("Key " + entry.getKeyId() + " has non raw prefix type");
                }
                map.put(Integer.valueOf(entry.getKeyId()), new C0204a((Prf) entry.getPrimitive(), entry.getKeyId(), loggerCreateLogger));
            }
            this.f46843a = Collections.unmodifiableMap(map);
        }

        @Override // com.google.crypto.tink.prf.PrfSet
        public final Map<Integer, Prf> getPrfs() throws GeneralSecurityException {
            return this.f46843a;
        }

        @Override // com.google.crypto.tink.prf.PrfSet
        public final int getPrimaryId() {
            return this.f46844b;
        }
    }

    public static void register() throws GeneralSecurityException {
        Registry.registerPrimitiveWrapper(f46842a);
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<Prf> getInputPrimitiveClass() {
        return Prf.class;
    }

    @Override // com.google.crypto.tink.PrimitiveWrapper
    public Class<PrfSet> getPrimitiveClass() {
        return PrfSet.class;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.crypto.tink.PrimitiveWrapper
    public PrfSet wrap(PrimitiveSet<Prf> primitiveSet) throws GeneralSecurityException {
        return new a(primitiveSet);
    }
}
