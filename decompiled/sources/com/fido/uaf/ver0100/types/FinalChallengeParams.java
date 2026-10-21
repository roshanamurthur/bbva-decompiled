package com.fido.uaf.ver0100.types;

import android.util.Base64;
import com.fido.uaf.ver0100.message.UafJson;
import com.google.gson.annotations.Expose;
import com.noknok.android.client.utils.Charsets;

/* JADX INFO: loaded from: classes9.dex */
public class FinalChallengeParams extends UafJson {

    @Expose
    public String appID;

    @Expose
    public String challenge;

    @Expose
    public ChannelBinding channelBinding;

    @Expose
    public String facetID;

    public FinalChallengeParams() {
    }

    public String getAppID() {
        return this.appID;
    }

    public String getChallenge() {
        return this.challenge;
    }

    public String getFacetID() {
        return this.facetID;
    }

    public String getFinalChallenge() {
        return Base64.encodeToString(stringify().getBytes(Charsets.utf8Charset), 11);
    }

    public ChannelBinding getTlsData() {
        return this.channelBinding;
    }

    public void setAppID(String str) {
        this.appID = str;
    }

    public void setChallenge(String str) {
        this.challenge = str;
    }

    public void setFacetID(String str) {
        this.facetID = str;
    }

    public void setTlsData(ChannelBinding channelBinding) {
        this.channelBinding = channelBinding;
    }

    public FinalChallengeParams(String str, String str2, String str3, ChannelBinding channelBinding) {
        this.appID = str;
        this.challenge = str2;
        this.facetID = str3;
        this.channelBinding = channelBinding;
    }
}
