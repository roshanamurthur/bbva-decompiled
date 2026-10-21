package com.bbva.ethermobilesdk.deviceinfo.plugin;

import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import j6.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import z6.a;
import z6.b;
import z6.d;
import z6.e;
import z6.f;
import z6.g;
import z6.h;
import z6.i;
import z6.j;
import z6.k;
import z6.l;
import z6.m;
import z6.n;
import z6.o;
import z6.p;
import z6.q;
import z6.r;
import z6.s;
import z6.t;
import z6.u;
import z6.v;

/* JADX INFO: compiled from: DeviceInfoCommandFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/bbva/ethermobilesdk/deviceinfo/plugin/DeviceInfoCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "()V", "Companion", "deviceinfo-plugin_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DeviceInfoCommandFactory extends CommandFactory {

    @NotNull
    public static final String ACTION_GET_APPLICATION_VERSION = "getapplicationversion";

    @NotNull
    public static final String ACTION_GET_BATTERY_LEVEL = "getbatterylevel";

    @NotNull
    public static final String ACTION_GET_BRIGHTNESS_LEVEL = "getbrightnesslevel";

    @NotNull
    public static final String ACTION_GET_COUNTRY = "getcountry";

    @NotNull
    public static final String ACTION_GET_CURRENT_DATE = "getcurrentdate";

    @NotNull
    public static final String ACTION_GET_CURRENT_SYSTEM_THEME = "getcurrentsystemtheme";

    @NotNull
    public static final String ACTION_GET_CURRENT_TIME = "getcurrenttime";

    @NotNull
    public static final String ACTION_GET_CURRENT_TIME_ZONE = "gettimezone";

    @NotNull
    public static final String ACTION_GET_DEVICE_ID = "getdeviceid";

    @NotNull
    public static final String ACTION_GET_DEVICE_MODEL = "getdevicemodel";

    @NotNull
    public static final String ACTION_GET_FINGERPRINT = "getcollidefingerprint";

    @NotNull
    public static final String ACTION_GET_LANGUAGE = "getlanguage";

    @NotNull
    public static final String ACTION_GET_MANUFACTURER = "getmanufacturer";

    @NotNull
    public static final String ACTION_GET_NETWORK_TYPE = "getnetworktype";

    @NotNull
    public static final String ACTION_GET_NFC_STATUS = "getnfcstatus";

    @NotNull
    public static final String ACTION_GET_PLATFORM = "getplatform";

    @NotNull
    public static final String ACTION_GET_PROVIDER_NAME = "getprovidername";

    @NotNull
    public static final String ACTION_GET_RAM_USAGE = "getramusage";

    @NotNull
    public static final String ACTION_GET_REGION = "getregion";

    @NotNull
    public static final String ACTION_GET_SCREENDIMENSIONS = "getscreendimensions";

    @NotNull
    public static final String ACTION_GET_SCREEN_ORIENTATION = "getscreenorientation";

    @NotNull
    public static final String ACTION_GET_STORAGE_USAGE = "getstorageusage";

    @NotNull
    public static final String ACTION_GET_SYSTEM_PROPERTIES = "getsystemproperties";

    @NotNull
    public static final String ACTION_GET_TRUE_TIME = "gettruetime";

    @NotNull
    public static final String ACTION_GET_WEB_VIEW_VERSION = "getwebviewversion";

    @NotNull
    public static final String ACTION_GET_WIFI_SECURITY = "iswifisecure";

    @NotNull
    public static final String ACTION_IS_AUTOMATIC_DATE_AND_TIME = "isautomaticdateandtime";

    @NotNull
    public static final String ACTION_IS_AUTOMATIC_ZONE = "isautomaticzoneenabled";

    @NotNull
    public static final String ACTION_IS_BLUETOOTH_ENABLED = "isbluetoothenabled";

    @NotNull
    public static final String ACTION_IS_DEVICE_SECURE = "isdevicesecure";

    @NotNull
    public static final String ACTION_IS_GOOGLE_PLAY_SERVICES_AVAILABLE = "isgoogleplayservicesavailable";

    @NotNull
    public static final String ACTION_IS_SCREEN_LOCKED = "isscreenlocked";

    @NotNull
    public static final String IS_MICROPHONE_PRESENT = "ismicrophonepresent";

    public DeviceInfoCommandFactory() {
        int i10 = 0;
        addCommandProvider(ACTION_GET_APPLICATION_VERSION, new a(0));
        int i11 = 1;
        addCommandProvider(ACTION_GET_WEB_VIEW_VERSION, new q6.a(1));
        addCommandProvider(ACTION_GET_DEVICE_MODEL, new c(i11));
        addCommandProvider(ACTION_GET_SYSTEM_PROPERTIES, new k(i10));
        addCommandProvider(ACTION_GET_PLATFORM, new m(0));
        addCommandProvider(ACTION_GET_MANUFACTURER, new n(0));
        addCommandProvider(ACTION_GET_BATTERY_LEVEL, new a(1));
        addCommandProvider(ACTION_GET_BRIGHTNESS_LEVEL, new l(1));
        addCommandProvider(ACTION_GET_COUNTRY, new o(1));
        addCommandProvider(ACTION_GET_CURRENT_DATE, new p(1));
        addCommandProvider(ACTION_GET_LANGUAGE, new l(0));
        addCommandProvider(ACTION_GET_NETWORK_TYPE, new o(0));
        addCommandProvider(ACTION_GET_SCREEN_ORIENTATION, new p(0));
        addCommandProvider(ACTION_GET_PROVIDER_NAME, new q(0));
        addCommandProvider(ACTION_GET_RAM_USAGE, new r(0));
        addCommandProvider(ACTION_GET_REGION, new s(0));
        addCommandProvider(ACTION_GET_STORAGE_USAGE, new t(0));
        addCommandProvider(ACTION_GET_CURRENT_TIME, new u(0));
        addCommandProvider(ACTION_GET_CURRENT_TIME_ZONE, new v(0));
        addCommandProvider(ACTION_GET_SCREENDIMENSIONS, new b(0));
        addCommandProvider(ACTION_IS_SCREEN_LOCKED, new q6.b(1));
        addCommandProvider(ACTION_IS_AUTOMATIC_DATE_AND_TIME, new z6.c(i10));
        addCommandProvider(ACTION_IS_AUTOMATIC_ZONE, new d(i10));
        addCommandProvider(ACTION_IS_BLUETOOTH_ENABLED, new e(i10));
        addCommandProvider(IS_MICROPHONE_PRESENT, new f(0));
        addCommandProvider(ACTION_GET_NFC_STATUS, new g(0));
        addCommandProvider(ACTION_GET_CURRENT_SYSTEM_THEME, new h(0));
        addCommandProvider(ACTION_IS_GOOGLE_PLAY_SERVICES_AVAILABLE, new i(0));
        addCommandProvider(ACTION_GET_TRUE_TIME, new j6.a(i11));
        addCommandProvider("getdeviceid", new j6.b(i11));
        addCommandProvider(ACTION_IS_DEVICE_SECURE, new j6.d(i11));
        addCommandProvider(ACTION_GET_FINGERPRINT, new j6.e(i11));
        addCommandProvider(ACTION_GET_WIFI_SECURITY, new j(i10));
    }
}
