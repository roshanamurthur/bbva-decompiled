package com.bbva.network.constant;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Protocol;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: NetworkProtocol.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/network/constant/NetworkProtocol;", "", "", "protocol", "Ljava/lang/String;", "Companion", "HTTP_1_0", "HTTP_1_1", "HTTP_2", "H2_PRIOR_KNOWLEDGE", "QUIC", "SPDY_3", "network_release"}, k = 1, mv = {1, 8, 0})
public enum NetworkProtocol {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic"),
    SPDY_3("spdy/3.1");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String protocol;

    /* JADX INFO: compiled from: NetworkProtocol.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/network/constant/NetworkProtocol$Companion;", "", "()V", "from", "Lcom/bbva/network/constant/NetworkProtocol;", "protocol", "Lokhttp3/Protocol;", "from$network_release", "network_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: compiled from: NetworkProtocol.kt */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Protocol.values().length];
                try {
                    iArr[Protocol.HTTP_1_0.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Protocol.HTTP_1_1.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Protocol.HTTP_2.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Protocol.H2_PRIOR_KNOWLEDGE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Protocol.QUIC.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Protocol.SPDY_3.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NetworkProtocol from$network_release(@NotNull Protocol protocol) {
            Intrinsics.checkNotNullParameter(protocol, "protocol");
            switch (WhenMappings.$EnumSwitchMapping$0[protocol.ordinal()]) {
                case 1:
                    return NetworkProtocol.HTTP_1_0;
                case 2:
                    return NetworkProtocol.HTTP_1_1;
                case 3:
                    return NetworkProtocol.HTTP_2;
                case 4:
                    return NetworkProtocol.H2_PRIOR_KNOWLEDGE;
                case 5:
                    return NetworkProtocol.QUIC;
                case 6:
                    return NetworkProtocol.SPDY_3;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    NetworkProtocol(String str) {
        this.protocol = str;
    }
}
