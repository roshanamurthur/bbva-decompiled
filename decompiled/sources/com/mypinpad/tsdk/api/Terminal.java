package com.mypinpad.tsdk.api;

import com.mypinpad.tsdk.api.callbacks.SessionActivationFailure;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001JS\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042 \u0010\u000b\u001a\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\t0\u0006j\u0002`\n2\u0010\u0010\u000e\u001a\f\u0012\u0004\u0012\u00020\t0\fj\u0002`\rH&¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011H&¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\tH&¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H'¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lcom/mypinpad/tsdk/api/Terminal;", "", "Ljava/util/UUID;", "merchantId", "", "emvConfiguration", "Lkotlin/Function2;", "Lcom/mypinpad/tsdk/api/TerminalSession;", "Lcom/mypinpad/tsdk/api/callbacks/SessionActivationFailure;", "", "Lcom/mypinpad/tsdk/api/callbacks/OnTerminalSessionActivate;", "onSessionActivate", "Lkotlin/Function0;", "Lcom/mypinpad/tsdk/api/callbacks/OnTerminalSessionTimeout;", "onSessionTimeout", "activateSession", "(Ljava/util/UUID;[BLkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "", "volume", "configBeepVolume", "(F)V", "dispose", "()V", "", "getInstallationId", "()Ljava/lang/String;", "getInstallationPublicKey", "()[B"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface Terminal {
    void activateSession(@NotNull UUID merchantId, @NotNull byte[] emvConfiguration, @NotNull Function2<? super TerminalSession, ? super SessionActivationFailure, Unit> onSessionActivate, @NotNull Function0<Unit> onSessionTimeout);

    void configBeepVolume(float volume);

    void dispose();

    @Nullable
    String getInstallationId();

    @Nullable
    byte[] getInstallationPublicKey();
}
