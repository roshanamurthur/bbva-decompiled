package com.bbva.glomohybrid.base.cells.channels;

import com.bbva.cellscore.channel.model.Channel;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LoginChannels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/channels/LoginChannels;", "", "", "PASSWORD_QUALITY_CHANNEL_NAME", "Ljava/lang/String;", "LOGIN_FAILURE_ATTEMPTS_MAX", "LOGIN_PASSWORD_IS_AUTO_FILLED", "Lcom/bbva/cellscore/channel/model/Channel;", "", "a", "Lcom/bbva/cellscore/channel/model/Channel;", "getPhysicalPersonBusiness", "()Lcom/bbva/cellscore/channel/model/Channel;", "physicalPersonBusiness", "<init>", "()V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class LoginChannels {

    @NotNull
    public static final String LOGIN_FAILURE_ATTEMPTS_MAX = "login_failure_attempts_max";

    @NotNull
    public static final String LOGIN_PASSWORD_IS_AUTO_FILLED = "login_password_autofilled";

    @NotNull
    public static final String PASSWORD_QUALITY_CHANNEL_NAME = "global_password_definition";

    @NotNull
    public static final LoginChannels INSTANCE = new LoginChannels();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final Channel<Boolean> physicalPersonBusiness = z1.b("global_pfae_response_client_channel", "create(...)");

    @NotNull
    public final Channel<Boolean> getPhysicalPersonBusiness() {
        return physicalPersonBusiness;
    }
}
