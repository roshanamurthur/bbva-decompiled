package com.bbva.component.dm.security;

import android.content.Context;
import bk.q;
import com.bbva.ethermobilesdk.deviceinfo.DeviceInfo;
import com.bbva.ethermobilesdk.deviceinfo.component.Hardware;
import com.bbva.ethermobilesdk.deviceinfo.data.ApplicationVersion;
import com.bbva.ethermobilesdk.deviceinfo.data.ScreenDimensions;
import com.bbva.glomo.localstorage.DeviceIdDataSource;
import com.bbva.glomohybrid.base.extensions.ContextExtensionKt;
import com.bbva.glomohybrid.base.extensions.StringExtensionsKt;
import com.bbva.library.digipassmanager.constants.DigipassManagerConstants;
import com.bbva.network.interceptor.NetworkInterceptor;
import com.bbva.network.model.request.MutableNetworkRequest;
import com.bbva.network.model.response.MutableNetworkResponse;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSession;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SecurityInterceptor.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B'\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0014"}, d2 = {"Lcom/bbva/component/dm/security/SecurityInterceptor;", "Lcom/bbva/network/interceptor/NetworkInterceptor;", "Lcom/bbva/network/model/request/MutableNetworkRequest;", "request", "", "onRequest", "Lcom/bbva/network/model/response/MutableNetworkResponse;", DigipassManagerConstants.KEY_RESPONSE, "onResponse", "Lcom/bbva/component/dm/security/SecurityInterceptorConfig;", "configuration", "Landroid/content/Context;", "context", "Lcom/bbva/glomo/localstorage/DeviceIdDataSource;", "dataSource", "Lcom/bbva/ethermobilesdk/deviceinfo/DeviceInfo;", "deviceInfo", "<init>", "(Lcom/bbva/component/dm/security/SecurityInterceptorConfig;Landroid/content/Context;Lcom/bbva/glomo/localstorage/DeviceIdDataSource;Lcom/bbva/ethermobilesdk/deviceinfo/DeviceInfo;)V", "Companion", "component-dm-security_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nSecurityInterceptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SecurityInterceptor.kt\ncom/bbva/component/dm/security/SecurityInterceptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n1747#2,3:73\n*S KotlinDebug\n*F\n+ 1 SecurityInterceptor.kt\ncom/bbva/component/dm/security/SecurityInterceptor\n*L\n55#1:73,3\n*E\n"})
public final class SecurityInterceptor implements NetworkInterceptor {

    @NotNull
    public static final String BBVA_DEVICE_APP_NAME = "vnd.bbva.device.app-name";

    @NotNull
    public static final String BBVA_DEVICE_APP_VERSION = "vnd.bbva.device.app-version";

    @NotNull
    public static final String BBVA_DEVICE_DPI = "vnd.bbva.device.dpi";

    @NotNull
    public static final String BBVA_DEVICE_ID = "vnd.bbva.device-id";

    @NotNull
    public static final String BBVA_DEVICE_MODEL_MANUFACTURER = "vnd.bbva.device-model-facturer";

    @NotNull
    public static final String BBVA_DEVICE_MODEL_NAME = "vnd.bbva.device-model-name";

    @NotNull
    public static final String BBVA_DEVICE_OS_NAME = "vnd.bbva.device-os-name";

    @NotNull
    public static final String BBVA_DEVICE_OS_VERSION = "vnd.bbva.device-os-version";

    @NotNull
    public static final String BBVA_DEVICE_SCREEN_SIZE = "vnd.bbva.device-screen-size";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SecurityInterceptorConfig f27901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final Context f27902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final DeviceIdDataSource f27903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final DeviceInfo f27904d;

    public SecurityInterceptor(@NotNull SecurityInterceptorConfig configuration, @NotNull Context context, @NotNull DeviceIdDataSource dataSource, @NotNull DeviceInfo deviceInfo) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        this.f27901a = configuration;
        this.f27902b = context;
        this.f27903c = dataSource;
        this.f27904d = deviceInfo;
    }

    public static void a(MutableNetworkRequest mutableNetworkRequest, Pair pair) {
        mutableNetworkRequest.setHeaders(q.plus(mutableNetworkRequest.getHeaders(), pair));
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onRequest(@NotNull MutableNetworkRequest request) {
        String versionName;
        Intrinsics.checkNotNullParameter(request, "request");
        String url = request.getUrl();
        List<String> whiteList = this.f27901a.getWhiteList();
        if ((whiteList instanceof Collection) && whiteList.isEmpty()) {
            return;
        }
        Iterator<T> it = whiteList.iterator();
        while (it.hasNext()) {
            if (new Regex((String) it.next(), RegexOption.IGNORE_CASE).matches(url)) {
                a(request, TuplesKt.to(BBVA_DEVICE_OS_NAME, "Android"));
                DeviceInfo deviceInfo = this.f27904d;
                Hardware hardware = deviceInfo.getHardware();
                a(request, TuplesKt.to(BBVA_DEVICE_MODEL_NAME, hardware.getModel()));
                a(request, TuplesKt.to(BBVA_DEVICE_MODEL_MANUFACTURER, hardware.getManufacturer()));
                ScreenDimensions dimensions = deviceInfo.getScreen().getDimensions();
                a(request, TuplesKt.to(BBVA_DEVICE_SCREEN_SIZE, ((int) dimensions.getHeight()) + "x" + ((int) dimensions.getWidth())));
                a(request, TuplesKt.to(BBVA_DEVICE_DPI, dimensions.getScaleFactor()));
                a(request, TuplesKt.to(BBVA_DEVICE_OS_VERSION, deviceInfo.getSystem().getPlatform().getPlatformVersionName()));
                a(request, TuplesKt.to(BBVA_DEVICE_APP_NAME, StringExtensionsKt.removeAccents(ContextExtensionKt.getApplicationName(this.f27902b))));
                ApplicationVersion appVersion = deviceInfo.getCom.bbva.nativesettings.common.Constants.APPLICATION java.lang.String().getAppVersion();
                if (appVersion == null || (versionName = appVersion.getVersionName()) == null) {
                    versionName = "";
                }
                a(request, TuplesKt.to(BBVA_DEVICE_APP_VERSION, versionName));
                String deviceId = this.f27903c.getDeviceId();
                a(request, TuplesKt.to("vnd.bbva.device-id", deviceId != null ? deviceId : ""));
                return;
            }
        }
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public void onResponse(@NotNull MutableNetworkResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
    }

    @Override // com.bbva.network.interceptor.NetworkInterceptor
    public boolean verifyConnection(@NotNull String str, @NotNull SSLSession sSLSession) {
        return NetworkInterceptor.DefaultImpls.verifyConnection(this, str, sSLSession);
    }
}
