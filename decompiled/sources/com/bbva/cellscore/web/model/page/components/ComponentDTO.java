package com.bbva.cellscore.web.model.page.components;

import com.bbva.glomohybrid.logs.LogKeysKt;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class ComponentDTO {
    public static final String CROSS_COMPONENT = "CC";
    public static final String DATA_MANAGER = "DM";
    public static final String UI = "UI";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SerializedName("zone")
    String f27143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SerializedName("familyPath")
    String f27144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SerializedName("tagName")
    String f27145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SerializedName("type")
    String f27146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SerializedName(LogKeysKt.PROPERTIES)
    Map<String, Object> f27147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SerializedName("featureFlags")
    List<FeatureFlagDTO> f27148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SerializedName("connections")
    ConnectionDTO f27149g;

    public String getFamilyPath() {
        return this.f27144b;
    }

    public List<FeatureFlagDTO> getFeatureFlags() {
        return this.f27148f;
    }

    public List<ChannelDTO> getInChannels() {
        ChannelConnectionDTO in2;
        ConnectionDTO connectionDTO = this.f27149g;
        List<ChannelDTO> channelDTOs = (connectionDTO == null || (in2 = connectionDTO.getIn()) == null) ? null : in2.getChannelDTOs();
        return channelDTOs != null ? channelDTOs : new ArrayList();
    }

    public List<ChannelDTO> getOutChannels() {
        ChannelConnectionDTO out;
        ConnectionDTO connectionDTO = this.f27149g;
        List<ChannelDTO> channelDTOs = (connectionDTO == null || (out = connectionDTO.getOut()) == null) ? null : out.getChannelDTOs();
        return channelDTOs != null ? channelDTOs : new ArrayList();
    }

    public Map<String, Object> getProperties() {
        return this.f27147e;
    }

    public String getTag() {
        return this.f27145c;
    }

    public String getType() {
        return this.f27146d;
    }

    public String getZone() {
        return this.f27143a;
    }
}
