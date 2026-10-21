package com.noknok.android.client.appsdk;

import android.app.Activity;
import com.google.gson.annotations.Expose;
import com.noknok.android.client.extension.IExtensionList;
import com.noknok.android.client.utils.ActivityProxy;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class FidoIn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Activity f62868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ActivityProxy f62869b;

    @Expose
    public Map<String, String> channelBindings;
    public IExtensionList extensions;

    @Expose
    public String fidoRequest;

    @Expose
    public String origin;
    public boolean remote;

    @Expose
    public String requestParams;

    @Expose
    public String serverURL;

    @Expose
    public String uafIntent;
    public String userDisplayName;
    public String userName;

    @Expose
    public boolean checkPolicyOnly = false;

    @Expose
    public boolean deferredCommit = false;
    public boolean regUsedOnThisDevice = true;
    public boolean sharedPasskeyEnabled = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f62870c = true;

    public void finishActivity() {
        if (this.f62870c) {
            return;
        }
        this.f62869b.finish();
        this.f62869b = null;
        this.f62870c = true;
    }

    public ActivityProxy getCallerActivityProxy() {
        if (this.f62869b == null) {
            this.f62870c = false;
            this.f62869b = ActivityProxy.createFromActivity(this.f62868a);
        }
        return this.f62869b;
    }

    @Deprecated
    public FidoIn setCallerActivity(Activity activity) {
        this.f62868a = activity;
        return this;
    }

    public FidoIn setCallerActivityProxy(ActivityProxy activityProxy) {
        this.f62869b = activityProxy;
        return this;
    }
}
