package com.bbva.glomohybrid.cellsweb.presentation.verishow.channels;

import android.os.Bundle;
import androidx.camera.core.m0;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.bbva.cellscore.channel.model.Channel;
import com.bbva.cellscore.web.model.channel.WebChannel;
import com.bbva.glomohybrid.base.extensions.ChannelsExtensionsKt;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.datamodels.HearingDisabilitiesAssigmentInfo;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.datamodels.HearingDisabilitiesControlOnlyInfo;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.datamodels.HearingDisabilitiesUserInfo;
import com.bbva.glomohybrid.cellsweb.presentation.verishow.datamodels.HearingDisabilitiesVeriShowModel;
import com.google.firebase.dynamiclinks.DynamicLink;
import com.google.gson.Gson;
import com.mypinpad.tsdk.isolation.z1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: HearingDisabilitiesChannels.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0010\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0015H\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0006R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0006R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0006R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0006¨\u0006!"}, d2 = {"Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/channels/HearingDisabilitiesChannels;", "", "()V", "closeScreenTimerDisabilityVideocall", "Lcom/bbva/cellscore/channel/model/Channel;", "getCloseScreenTimerDisabilityVideocall", "()Lcom/bbva/cellscore/channel/model/Channel;", "disabilityVideocallStatusNetworkChannel", "", "getDisabilityVideocallStatusNetworkChannel", "disabilityVideocallVerishowLogout", "getDisabilityVideocallVerishowLogout", "getNetworkStatusDisabilityVideocallChannel", "getGetNetworkStatusDisabilityVideocallChannel", "startDisabilityVideocall", "getStartDisabilityVideocall", "userInfoDisabilityVideocall", "getUserInfoDisabilityVideocall", "waitingTimeEndedDisabilityVideocall", "getWaitingTimeEndedDisabilityVideocall", "getAssigmentInfoFrom", "Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/datamodels/HearingDisabilitiesAssigmentInfo;", "data", "Landroid/os/Bundle;", "getUserInfoDataFrom", "Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/datamodels/HearingDisabilitiesUserInfo;", "controlOnlyInfo", "Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/datamodels/HearingDisabilitiesControlOnlyInfo;", "getUserInfoFrom", "getVeriShowDataFrom", "Lcom/bbva/glomohybrid/cellsweb/presentation/verishow/datamodels/HearingDisabilitiesVeriShowModel;", "userInfo", "assignmentInfo", "CellsWeb_mexicoRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class HearingDisabilitiesChannels {

    @NotNull
    private static final Channel<Object> closeScreenTimerDisabilityVideocall;

    @NotNull
    private static final Channel<String> disabilityVideocallVerishowLogout;

    @NotNull
    private static final Channel<String> userInfoDisabilityVideocall;

    @NotNull
    private static final Channel<Object> waitingTimeEndedDisabilityVideocall;

    @NotNull
    public static final HearingDisabilitiesChannels INSTANCE = new HearingDisabilitiesChannels();

    @NotNull
    private static final Channel<Object> getNetworkStatusDisabilityVideocallChannel = z1.b("get_network_status_disability_videocall", "create(...)");

    @NotNull
    private static final Channel<String> disabilityVideocallStatusNetworkChannel = z1.b("disability_videocall_status_network", "create(...)");

    @NotNull
    private static final Channel<Object> startDisabilityVideocall = z1.b("start_disability_videocall", "create(...)");

    static {
        WebChannel webChannelCreate = new WebChannel.Builder("user_info_disability_videocall").toNativeObject(new m0(4)).create();
        Intrinsics.checkNotNullExpressionValue(webChannelCreate, "create(...)");
        userInfoDisabilityVideocall = ChannelsExtensionsKt.autoClean(webChannelCreate);
        disabilityVideocallVerishowLogout = z1.b("disability_videocall_veryshow_logout", "create(...)");
        closeScreenTimerDisabilityVideocall = z1.b("close_screen_timer_disability_videocall", "create(...)");
        waitingTimeEndedDisabilityVideocall = z1.b("waiting_time_ended_disability_videocall", "create(...)");
    }

    private HearingDisabilitiesChannels() {
    }

    private final HearingDisabilitiesAssigmentInfo getAssigmentInfoFrom(Bundle data) {
        Bundle bundle = data.getBundle("assignmentInfo");
        return new HearingDisabilitiesAssigmentInfo(bundle != null ? bundle.getString("account") : null, bundle != null ? bundle.getString("project") : null, bundle != null ? bundle.getString("token") : null);
    }

    private final HearingDisabilitiesUserInfo getUserInfoDataFrom(HearingDisabilitiesControlOnlyInfo controlOnlyInfo) {
        return new HearingDisabilitiesUserInfo(controlOnlyInfo.getCustomerNumber(), controlOnlyInfo.getCustomerNumber(), controlOnlyInfo);
    }

    private final HearingDisabilitiesControlOnlyInfo getUserInfoFrom(Bundle data) {
        Bundle bundle = data.getBundle("userInfo");
        Bundle bundle2 = bundle != null ? bundle.getBundle("controlOnlyInfo") : null;
        return new HearingDisabilitiesControlOnlyInfo(bundle2 != null ? bundle2.getString("nc") : null, bundle2 != null ? bundle2.getString("c") : null, bundle2 != null ? bundle2.getString(TypedValues.TransitionType.S_TO) : null, bundle2 != null ? bundle2.getString("e") : null, bundle2 != null ? bundle2.getString("t") : null, bundle2 != null ? bundle2.getString("ca") : null, bundle2 != null ? bundle2.getString("so") : null, bundle2 != null ? bundle2.getString("u") : null, bundle2 != null ? bundle2.getString("tm") : null, bundle2 != null ? bundle2.getString("td") : null, bundle2 != null ? bundle2.getString(DynamicLink.SocialMetaTagParameters.KEY_SOCIAL_TITLE) : null);
    }

    private final HearingDisabilitiesVeriShowModel getVeriShowDataFrom(HearingDisabilitiesUserInfo userInfo, HearingDisabilitiesAssigmentInfo assignmentInfo) {
        return new HearingDisabilitiesVeriShowModel(userInfo, assignmentInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String userInfoDisabilityVideocall$lambda$0(Bundle bundle) {
        HearingDisabilitiesChannels hearingDisabilitiesChannels = INSTANCE;
        Intrinsics.checkNotNull(bundle);
        return new Gson().toJson(hearingDisabilitiesChannels.getVeriShowDataFrom(hearingDisabilitiesChannels.getUserInfoDataFrom(hearingDisabilitiesChannels.getUserInfoFrom(bundle)), hearingDisabilitiesChannels.getAssigmentInfoFrom(bundle)));
    }

    @NotNull
    public final Channel<Object> getCloseScreenTimerDisabilityVideocall() {
        return closeScreenTimerDisabilityVideocall;
    }

    @NotNull
    public final Channel<String> getDisabilityVideocallStatusNetworkChannel() {
        return disabilityVideocallStatusNetworkChannel;
    }

    @NotNull
    public final Channel<String> getDisabilityVideocallVerishowLogout() {
        return disabilityVideocallVerishowLogout;
    }

    @NotNull
    public final Channel<Object> getGetNetworkStatusDisabilityVideocallChannel() {
        return getNetworkStatusDisabilityVideocallChannel;
    }

    @NotNull
    public final Channel<Object> getStartDisabilityVideocall() {
        return startDisabilityVideocall;
    }

    @NotNull
    public final Channel<String> getUserInfoDisabilityVideocall() {
        return userInfoDisabilityVideocall;
    }

    @NotNull
    public final Channel<Object> getWaitingTimeEndedDisabilityVideocall() {
        return waitingTimeEndedDisabilityVideocall;
    }
}
