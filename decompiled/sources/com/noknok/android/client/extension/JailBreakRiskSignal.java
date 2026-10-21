package com.noknok.android.client.extension;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.bbva.ethermobilesdk.devicechecker.emulator.EmulatorApi;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.google.gson.Gson;
import com.google.gson.annotations.Expose;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.AppSDKConfig;
import java.io.File;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class JailBreakRiskSignal implements IExtensionProcessor {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static JailBreakParams f63313c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f63314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f63315b;

    /* JADX INFO: renamed from: com.noknok.android.client.extension.JailBreakRiskSignal$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f63316a;

        static {
            int[] iArr = new int[IExtensionProcessor.ExtensionMode.values().length];
            f63316a = iArr;
            try {
                iArr[IExtensionProcessor.ExtensionMode.never.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f63316a[IExtensionProcessor.ExtensionMode.requested.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f63316a[IExtensionProcessor.ExtensionMode.silently.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f63316a[IExtensionProcessor.ExtensionMode.always.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class JailBreakParams {

        @Expose
        public boolean isJailbroken;

        @Expose
        public int status;
    }

    public JailBreakRiskSignal(Context context) {
        f63313c = new JailBreakParams();
        this.f63314a = false;
        this.f63315b = context;
    }

    @Override // com.noknok.android.client.extension.IExtensionProcessor
    public void finish(IExtensionList iExtensionList, HashMap<IExtensionProcessor.ExtProcParamKey, String> map) {
        if (this.f63314a) {
            iExtensionList.addExtension("noknok.uaf.jailbreak", new Gson().toJson(f63313c), false);
            this.f63314a = false;
        }
    }

    @Override // com.noknok.android.client.extension.IExtensionProcessor
    public final /* synthetic */ void start(IExtensionList iExtensionList, HashMap map, Activity activity) {
        a.a(this, iExtensionList, map, activity);
    }

    @Override // com.noknok.android.client.extension.IExtensionProcessor
    public void start(IExtensionList iExtensionList, HashMap<IExtensionProcessor.ExtProcParamKey, String> map, ActivityProxy activityProxy) {
        String str;
        boolean z10 = false;
        boolean z11 = iExtensionList.getExtension("noknok.uaf.jailbreak") != null;
        int i10 = AnonymousClass1.f63316a[ExtensionConfigHelper.getConfigExtensionMode(this.f63315b, AppSDKConfig.Key.sendJailBreakRiskSignal.name(), map.get(IExtensionProcessor.ExtProcParamKey.EXT_OP_TYPE)).ordinal()];
        if (i10 != 2) {
            if (i10 != 3 && i10 != 4) {
                return;
            }
        } else if (!z11) {
            return;
        }
        JailBreakParams jailBreakParams = f63313c;
        if (Build.MODEL.contains("Android SDK") || Build.FINGERPRINT.contains("sdk_gphone") || Build.DEVICE.contains(EmulatorApi.GENERIC) || (((str = Build.TAGS) != null && str.contains(RootService.TEST_KEYS)) || new File("/system/app/Superuser.apk").exists())) {
            z10 = true;
            break;
        }
        String[] strArr = {"/sbin/su", "/system/bin/su", "/system/xbin/su", "/data/local/xbin/su", "/data/local/bin/su", "/system/sd/xbin/su", "/system/bin/failsafe/su", "/data/local/su"};
        for (int i11 = 0; i11 < 8; i11++) {
            if (new File(strArr[i11]).exists()) {
                z10 = true;
                break;
            }
        }
        jailBreakParams.isJailbroken = z10;
        if (z11) {
            iExtensionList.removeExtension("noknok.uaf.jailbreak");
        }
        this.f63314a = true;
    }
}
