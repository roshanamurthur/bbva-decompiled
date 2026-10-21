package com.google.crypto.tink.internal;

import com.google.crypto.tink.KeyStatus;
import com.google.crypto.tink.PrimitiveSet;
import com.google.crypto.tink.monitoring.MonitoringClient;
import com.google.crypto.tink.monitoring.MonitoringKeysetInfo;
import com.google.crypto.tink.proto.KeyStatusType;
import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public final class MonitoringUtil {
    public static final MonitoringClient.Logger DO_NOTHING_LOGGER = new b();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46654a;

        static {
            int[] iArr = new int[KeyStatusType.values().length];
            f46654a = iArr;
            try {
                iArr[KeyStatusType.ENABLED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46654a[KeyStatusType.DISABLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46654a[KeyStatusType.DESTROYED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static <P> MonitoringKeysetInfo getMonitoringKeysetInfo(PrimitiveSet<P> primitiveSet) {
        KeyStatus keyStatus;
        MonitoringKeysetInfo.Builder builderNewBuilder = MonitoringKeysetInfo.newBuilder();
        builderNewBuilder.setAnnotations(primitiveSet.getAnnotations());
        Iterator<List<PrimitiveSet.Entry<P>>> it = primitiveSet.getAll().iterator();
        while (it.hasNext()) {
            for (PrimitiveSet.Entry<P> entry : it.next()) {
                int i10 = a.f46654a[entry.getStatus().ordinal()];
                if (i10 == 1) {
                    keyStatus = KeyStatus.ENABLED;
                } else if (i10 == 2) {
                    keyStatus = KeyStatus.DISABLED;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    keyStatus = KeyStatus.DESTROYED;
                }
                int keyId = entry.getKeyId();
                String keyType = entry.getKeyType();
                if (keyType.startsWith("type.googleapis.com/google.crypto.")) {
                    keyType = keyType.substring(34);
                }
                builderNewBuilder.addEntry(keyStatus, keyId, keyType, entry.getOutputPrefixType().name());
            }
        }
        if (primitiveSet.getPrimary() != null) {
            builderNewBuilder.setPrimaryKeyId(primitiveSet.getPrimary().getKeyId());
        }
        try {
            return builderNewBuilder.build();
        } catch (GeneralSecurityException e5) {
            throw new IllegalStateException(e5);
        }
    }

    public static class b implements MonitoringClient.Logger {
        @Override // com.google.crypto.tink.monitoring.MonitoringClient.Logger
        public final void logFailure() {
        }

        @Override // com.google.crypto.tink.monitoring.MonitoringClient.Logger
        public final void log(int i10, long j10) {
        }
    }
}
