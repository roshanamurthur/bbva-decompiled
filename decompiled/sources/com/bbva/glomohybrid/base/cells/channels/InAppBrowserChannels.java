package com.bbva.glomohybrid.base.cells.channels;

import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.web.model.channel.WebChannel;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: InAppBrowserChannels.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR)\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/base/cells/channels/InAppBrowserChannels;", "", "Lcom/bbva/cellscore/channel/model/Channel;", "", "", "a", "Lcom/bbva/cellscore/channel/model/Channel;", "getOnboardingData", "()Lcom/bbva/cellscore/channel/model/Channel;", "onboardingData", "<init>", "()V", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class InAppBrowserChannels {

    @NotNull
    public static final InAppBrowserChannels INSTANCE = new InAppBrowserChannels();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final WebChannel f31171a;

    static {
        WebChannel webChannelCreate = new WebChannel.Builder("glomo_cuentalinea_onboarding_data").create();
        Intrinsics.checkNotNullExpressionValue(webChannelCreate, "create(...)");
        f31171a = webChannelCreate;
    }

    @NotNull
    public final Channel<Map<String, Object>> getOnboardingData() {
        return f31171a;
    }
}
