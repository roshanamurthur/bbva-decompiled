package com.noknok.android.client.appsdk_plus;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class RestParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f62956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SessionData f62957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f62958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f62959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<String, String> f62960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HashMap<String, String> f62961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<String> f62962g;

    public Map<String, String> getChannelBindings() {
        return this.f62960e;
    }

    public HashMap<String, String> getExtras() {
        return this.f62961f;
    }

    public String getServerUrl() {
        return this.f62956a;
    }

    public SessionData getSessionData() {
        return this.f62957b;
    }

    public List<String> getSessionKeys() {
        return this.f62958c;
    }

    public List<String> getStateCookie() {
        return this.f62962g;
    }

    public String getTlsCert() {
        return this.f62959d;
    }

    public RestParams setChannelBindings(Map<String, String> map) {
        this.f62960e = map;
        return this;
    }

    public RestParams setExtras(HashMap<String, String> map) {
        this.f62961f = map;
        return this;
    }

    public RestParams setServerUrl(String str) {
        this.f62956a = str;
        return this;
    }

    public RestParams setSessionData(SessionData sessionData) {
        this.f62957b = sessionData;
        return this;
    }

    public RestParams setSessionKeys(List<String> list) {
        this.f62958c = list;
        return this;
    }

    public RestParams setStateCookie(List<String> list) {
        this.f62962g = list;
        return this;
    }

    public RestParams setTlsCert(String str) {
        this.f62959d = str;
        return this;
    }
}
