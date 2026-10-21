package com.bbva.glomohybrid.login.channels;

import com.bbva.cellscore.channel.model.Channel;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LegacyDataChannels.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/login/channels/LegacyDataChannels;", "", "Lcom/bbva/cellscore/channel/model/Channel;", "", "a", "Lcom/bbva/cellscore/channel/model/Channel;", "getSerialNumber", "()Lcom/bbva/cellscore/channel/model/Channel;", DigipassManagerConstants.KEY_SERIAL_NUMBER, "<init>", "()V", "Login_mexicoGoogleRelease"}, k = 1, mv = {1, 9, 0})
public final class LegacyDataChannels {

    @NotNull
    public static final LegacyDataChannels INSTANCE = new LegacyDataChannels();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Channel<String> serialNumber = z1.b("legacy_serial_number", "create(...)");

    @NotNull
    public final Channel<String> getSerialNumber() {
        return serialNumber;
    }
}
