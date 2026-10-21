package com.akamai.botman;

import android.app.Application;
import android.os.Build;
import android.provider.Settings;
import android.webkit.JavascriptInterface;
import b4.o;
import b4.p;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.mastercard.mpsdk.mcbp.mcmlite.BuildConfig;
import java.io.BufferedReader;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes2.dex */
public class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Application f26332b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f26335e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String[] f26331a = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f26334d = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f26333c = Boolean.TRUE;

    public interface a {
        void a();
    }

    static {
        f.class.toString();
    }

    public f(Application application, a aVar) {
        this.f26332b = application;
        this.f26335e = aVar;
    }

    public static String a(String str) {
        try {
            Process processExec = Runtime.getRuntime().exec(str);
            processExec.waitFor();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream()));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    return sb2.toString();
                }
                sb2.append(line + RootService.LINE_BREAK);
            }
        } catch (Exception e5) {
            b4.f.a(e5);
            return null;
        }
    }

    @JavascriptInterface
    public String adbStatus() {
        try {
            return String.valueOf(Settings.Global.getInt(this.f26332b.getContentResolver(), "adb_enabled", 0));
        } catch (Exception e5) {
            b4.f.a(e5);
            return "-1";
        }
    }

    @JavascriptInterface
    public String androidId() {
        return p.d(this.f26332b);
    }

    @JavascriptInterface
    public String appIdentifier() {
        return this.f26332b.getPackageName();
    }

    @JavascriptInterface
    public String buildId() {
        return Build.ID;
    }

    @JavascriptInterface
    public String carrierName() {
        return "-1";
    }

    @JavascriptInterface
    public String cpuABI() {
        String[] strArr = Build.SUPPORTED_ABIS;
        return strArr.length > 0 ? strArr[0] : "Default_ABI";
    }

    @JavascriptInterface
    public String defaultBuildFingerPrintProperties() {
        String strA = a("getprop ro.build.fingerprint");
        return strA == null ? "default-build-fingerprint" : strA;
    }

    @JavascriptInterface
    public String deviceProperties() {
        String strA = a(RootService.GET_PROP);
        return strA == null ? "default-build-fingerprint" : strA;
    }

    @JavascriptInterface
    public void done() {
        this.f26335e.a();
    }

    @JavascriptInterface
    public String getServerSignals() {
        return e.f26324a + ", " + sdkVersion() + ", " + androidId() + ", " + buildId() + ", " + systemVersion() + ", " + model() + ", " + host();
    }

    @JavascriptInterface
    public String hardWareType() {
        return o.b(Build.HARDWARE);
    }

    @JavascriptInterface
    public String host() {
        return Build.HOST;
    }

    @JavascriptInterface
    public String isDebugEnabled() {
        try {
            return Settings.Secure.getInt(this.f26332b.getContentResolver(), "adb_enabled", 0) == 1 ? "true" : "false";
        } catch (Exception e5) {
            b4.f.a(e5);
            return BuildConfig.BUILD_TYPE;
        }
    }

    @JavascriptInterface
    public String model() {
        return Build.MODEL;
    }

    @JavascriptInterface
    public String mountFileProperties() {
        String strA = a("cat /proc/mounts");
        return strA == null ? "default-build-fingerprint" : strA;
    }

    @JavascriptInterface
    public String qemuProperties() {
        String strA = a("getprop ro.kernel.qemu");
        return strA == null ? "default-qemu" : strA;
    }

    @JavascriptInterface
    public String screenHeight() {
        return String.valueOf(this.f26332b.getResources().getDisplayMetrics().heightPixels);
    }

    @JavascriptInterface
    public String screenWidth() {
        return String.valueOf(this.f26332b.getResources().getDisplayMetrics().widthPixels);
    }

    @JavascriptInterface
    public String sdkVersion() {
        return "3.3.9";
    }

    @JavascriptInterface
    public void setDCIDisabled(Boolean bool) {
        this.f26333c = Boolean.valueOf(!bool.booleanValue());
    }

    @JavascriptInterface
    public void setOrder(String str) {
        if (str != null) {
            try {
                if (str.contains(",")) {
                    this.f26331a = str.split(",");
                }
            } catch (Exception e5) {
                this.f26331a = null;
                b4.f.a(e5);
            }
        }
    }

    @JavascriptInterface
    public void setSignal(String str) {
        this.f26334d = str;
        done();
    }

    @JavascriptInterface
    public String startTime() {
        return Long.toString(e.f26324a);
    }

    @JavascriptInterface
    public String systemVersion() {
        return Build.VERSION.RELEASE;
    }
}
