package com.noknok.android.client.extension;

import android.app.Activity;
import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.noknok.android.client.metrics.Tabulator;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.AppSDKConfig;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class MetricsExtProc implements IExtensionProcessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f63327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f63328b;

    /* JADX INFO: renamed from: com.noknok.android.client.extension.MetricsExtProc$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63329a;

        static {
            int[] iArr = new int[IExtensionProcessor.ExtensionMode.values().length];
            f63329a = iArr;
            try {
                iArr[IExtensionProcessor.ExtensionMode.never.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63329a[IExtensionProcessor.ExtensionMode.requested.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63329a[IExtensionProcessor.ExtensionMode.silently.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63329a[IExtensionProcessor.ExtensionMode.always.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public MetricsExtProc(Context context) {
        this.f63327a = context.getApplicationContext();
    }

    @Override // com.noknok.android.client.extension.IExtensionProcessor
    public void finish(IExtensionList iExtensionList, HashMap<IExtensionProcessor.ExtProcParamKey, String> map) {
        if (this.f63328b) {
            iExtensionList.addExtension(ExtensionManager.METRICS_EXT_ID, new Gson().toJson((JsonElement) Tabulator.getInstance().getReport(this.f63327a)), false);
            this.f63328b = false;
        }
    }

    @Override // com.noknok.android.client.extension.IExtensionProcessor
    public final /* synthetic */ void start(IExtensionList iExtensionList, HashMap map, Activity activity) {
        a.a(this, iExtensionList, map, activity);
    }

    @Override // com.noknok.android.client.extension.IExtensionProcessor
    public void start(IExtensionList iExtensionList, HashMap<IExtensionProcessor.ExtProcParamKey, String> map, ActivityProxy activityProxy) {
        this.f63328b = false;
        boolean z10 = iExtensionList.getExtension(ExtensionManager.METRICS_EXT_ID) != null;
        int i10 = AnonymousClass1.f63329a[ExtensionConfigHelper.getConfigExtensionMode(this.f63327a, AppSDKConfig.Key.sendMetrics.name(), map.get(IExtensionProcessor.ExtProcParamKey.EXT_OP_TYPE)).ordinal()];
        if (i10 == 2) {
            if (z10) {
                this.f63328b = true;
            }
        } else if (i10 == 3 || i10 == 4) {
            this.f63328b = true;
        }
    }
}
