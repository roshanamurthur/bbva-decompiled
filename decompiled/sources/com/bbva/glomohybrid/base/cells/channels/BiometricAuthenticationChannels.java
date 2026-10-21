package com.bbva.glomohybrid.base.cells.channels;

import com.bbva.cellscore.channel.model.Channel;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: BiometricAuthenticationChannels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/channels/BiometricAuthenticationChannels;", "", "Lcom/bbva/cellscore/channel/model/Channel;", "", "a", "Lkotlin/Lazy;", "getRetryAuthChannel", "()Lcom/bbva/cellscore/channel/model/Channel;", "retryAuthChannel", "", "CHANNEL_FRIENDLY_FRAUD", "Ljava/lang/String;", "<init>", "()V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class BiometricAuthenticationChannels {

    @NotNull
    public static final String CHANNEL_FRIENDLY_FRAUD = "device_accesses_friendly_fraud";

    @NotNull
    public static final BiometricAuthenticationChannels INSTANCE = new BiometricAuthenticationChannels();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Lazy retryAuthChannel = LazyKt__LazyJVMKt.lazy(a.f31070p0);

    /* JADX INFO: compiled from: BiometricAuthenticationChannels.kt */
    public static final class a extends Lambda implements Function0<Channel<Boolean>> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f31070p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Channel<Boolean> invoke() {
            return new Channel<>("biometry-authentication-retry");
        }
    }

    @NotNull
    public final Channel<Boolean> getRetryAuthChannel() {
        return (Channel) retryAuthChannel.getValue();
    }
}
