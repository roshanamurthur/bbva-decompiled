package com.google.crypto.tink.config.internal;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
public final class TinkFipsUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f46565a = Logger.getLogger(TinkFipsUtil.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicBoolean f46566b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static abstract class AlgorithmFipsCompatibility {
        private static final /* synthetic */ AlgorithmFipsCompatibility[] $VALUES;
        public static final AlgorithmFipsCompatibility ALGORITHM_NOT_FIPS;
        public static final AlgorithmFipsCompatibility ALGORITHM_REQUIRES_BORINGCRYPTO;

        public final enum a extends AlgorithmFipsCompatibility {
            public a() {
                super("ALGORITHM_NOT_FIPS", 0);
            }

            @Override // com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility
            public final boolean isCompatible() {
                return !TinkFipsUtil.useOnlyFips();
            }
        }

        public final enum b extends AlgorithmFipsCompatibility {
            public b() {
                super("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            }

            @Override // com.google.crypto.tink.config.internal.TinkFipsUtil.AlgorithmFipsCompatibility
            public final boolean isCompatible() {
                return !TinkFipsUtil.useOnlyFips() || TinkFipsUtil.fipsModuleAvailable();
            }
        }

        static {
            a aVar = new a();
            ALGORITHM_NOT_FIPS = aVar;
            b bVar = new b();
            ALGORITHM_REQUIRES_BORINGCRYPTO = bVar;
            $VALUES = new AlgorithmFipsCompatibility[]{aVar, bVar};
        }

        public AlgorithmFipsCompatibility() {
            throw null;
        }

        public static AlgorithmFipsCompatibility valueOf(String str) {
            return (AlgorithmFipsCompatibility) Enum.valueOf(AlgorithmFipsCompatibility.class, str);
        }

        public static AlgorithmFipsCompatibility[] values() {
            return (AlgorithmFipsCompatibility[]) $VALUES.clone();
        }

        public abstract boolean isCompatible();
    }

    public static boolean fipsModuleAvailable() {
        Boolean bool;
        try {
            bool = (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            f46565a.info("Conscrypt is not available or does not support checking for FIPS build.");
            bool = Boolean.FALSE;
        }
        return bool.booleanValue();
    }

    public static void setFipsRestricted() {
        f46566b.set(true);
    }

    public static void unsetFipsRestricted() {
        f46566b.set(false);
    }

    public static boolean useOnlyFips() {
        return f46566b.get();
    }
}
