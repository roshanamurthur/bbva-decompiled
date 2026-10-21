package com.bbva.semaas.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.geolocation.utils.ConstantsKt;
import com.google.android.gms.stats.CodePackage;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Properties.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b:\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/bbva/semaas/model/Properties;", "", "()V", "AAP", "", "AGGREGATION_DETAILS", "APP_COUNTRY", "APP_GLOBAL_ID", "APP_LANG", "APP_NAME", "APP_VERSION", "ARGUMENTS", "BUILD_VERSION", "CHANNEL", "DEVICE_BRANCH_ID", "DEVICE_BROWSER", "DEVICE_BROWSER_VERSION", "DEVICE_CONNECTION", "DEVICE_DOMAIN_INVOKER", "DEVICE_FORM_FACTOR", "DEVICE_GMT", "DEVICE_HEIGHT", "DEVICE_ID", "DEVICE_LATITUDE", "DEVICE_LONGITUDE", "DEVICE_NAME", "DEVICE_OS", "DEVICE_OS_LANG", "DEVICE_OS_VERSION", "DEVICE_PHONE_EXT", "DEVICE_PLACE_ID", "DEVICE_RESOLUTION", "DEVICE_WIDTH", "END_RENDER_TIME", "ENVIRONMENT", "FULL_DETAILS", "HTTP_STATUS_CODE_RESPONSE", "IDENTITY_CUSTOMER_ID", "IDENTITY_DOCUMENT_ID", "IDENTITY_EMULATOR_ID", "IDENTITY_SESSION_ID", "IDENTITY_USER_ID", "IDENTITY_USER_TYPE", "INTERACTION_ANI", "INTERACTION_CORRELATION_ID", "INTERACTION_FROM", "INTERACTION_ID", "INTERACTION_MEDIA_TYPE", "INTERACTION_SERVICE_QUEUE", "INTERACTION_S_DNIS", "INTERACTION_TO", CodePackage.LOCATION, "METHOD_SERVICE", "NET_WEIGHT_RESPONSE", "OBJECT_INTERACTION", "PATH_INTERACTION", "PATH_SERVICE", "REQUEST_MODE", "SOURCE_RESPONSE", "START_RENDER_TIME", "STATUS_ID", ConstantsKt.TYPE, "semaas_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Properties {

    @NotNull
    public static final String AAP = "aap";

    @NotNull
    public static final String AGGREGATION_DETAILS = "aggregationDetails";

    @NotNull
    public static final String APP_COUNTRY = "appCountry";

    @NotNull
    public static final String APP_GLOBAL_ID = "appGlobalId";

    @NotNull
    public static final String APP_LANG = "appLang";

    @NotNull
    public static final String APP_NAME = "appName";

    @NotNull
    public static final String APP_VERSION = "appVersion";

    @NotNull
    public static final String ARGUMENTS = "arguments";

    @NotNull
    public static final String BUILD_VERSION = "buildVersion";

    @NotNull
    public static final String CHANNEL = "channel";

    @NotNull
    public static final String DEVICE_BRANCH_ID = "device_branchId";

    @NotNull
    public static final String DEVICE_BROWSER = "device_browser";

    @NotNull
    public static final String DEVICE_BROWSER_VERSION = "device_browserVersion";

    @NotNull
    public static final String DEVICE_CONNECTION = "device_connection";

    @NotNull
    public static final String DEVICE_DOMAIN_INVOKER = "device_domainInvoker";

    @NotNull
    public static final String DEVICE_FORM_FACTOR = "device_formFactor";

    @NotNull
    public static final String DEVICE_GMT = "device_gmt";

    @NotNull
    public static final String DEVICE_HEIGHT = "device_height";

    @NotNull
    public static final String DEVICE_ID = "device_id";

    @NotNull
    public static final String DEVICE_LATITUDE = "device_latitude";

    @NotNull
    public static final String DEVICE_LONGITUDE = "device_longitude";

    @NotNull
    public static final String DEVICE_NAME = "device_name";

    @NotNull
    public static final String DEVICE_OS = "device_os";

    @NotNull
    public static final String DEVICE_OS_LANG = "device_osLang";

    @NotNull
    public static final String DEVICE_OS_VERSION = "device_osVersion";

    @NotNull
    public static final String DEVICE_PHONE_EXT = "device_phoneExt";

    @NotNull
    public static final String DEVICE_PLACE_ID = "device_placeId";

    @NotNull
    public static final String DEVICE_RESOLUTION = "device_resolution";

    @NotNull
    public static final String DEVICE_WIDTH = "device_width";

    @NotNull
    public static final String END_RENDER_TIME = "endRenderTime";

    @NotNull
    public static final String ENVIRONMENT = "environment";

    @NotNull
    public static final String FULL_DETAILS = "fullDetails";

    @NotNull
    public static final String HTTP_STATUS_CODE_RESPONSE = "httpStatusCodeResponse";

    @NotNull
    public static final String IDENTITY_CUSTOMER_ID = "identity_customerId";

    @NotNull
    public static final String IDENTITY_DOCUMENT_ID = "identity_documentId";

    @NotNull
    public static final String IDENTITY_EMULATOR_ID = "identity_emulatorId";

    @NotNull
    public static final String IDENTITY_SESSION_ID = "identity_sessionId";

    @NotNull
    public static final String IDENTITY_USER_ID = "identity_userId";

    @NotNull
    public static final String IDENTITY_USER_TYPE = "identity_userType";

    @NotNull
    public static final Properties INSTANCE = new Properties();

    @NotNull
    public static final String INTERACTION_ANI = "interaction_ani";

    @NotNull
    public static final String INTERACTION_CORRELATION_ID = "interaction_correlationId";

    @NotNull
    public static final String INTERACTION_FROM = "interaction_from";

    @NotNull
    public static final String INTERACTION_ID = "interaction_id";

    @NotNull
    public static final String INTERACTION_MEDIA_TYPE = "interaction_mediaType";

    @NotNull
    public static final String INTERACTION_SERVICE_QUEUE = "interaction_serviceQueue";

    @NotNull
    public static final String INTERACTION_S_DNIS = "interaction_sDnis";

    @NotNull
    public static final String INTERACTION_TO = "interaction_to";

    @NotNull
    public static final String LOCATION = "location";

    @NotNull
    public static final String METHOD_SERVICE = "methodService";

    @NotNull
    public static final String NET_WEIGHT_RESPONSE = "netWeightResponse";

    @NotNull
    public static final String OBJECT_INTERACTION = "objectInteraction";

    @NotNull
    public static final String PATH_INTERACTION = "pathInteraction";

    @NotNull
    public static final String PATH_SERVICE = "pathService";

    @NotNull
    public static final String REQUEST_MODE = "requestMode";

    @NotNull
    public static final String SOURCE_RESPONSE = "sourceResponse";

    @NotNull
    public static final String START_RENDER_TIME = "startRenderTime";

    @NotNull
    public static final String STATUS_ID = "statusId";

    @NotNull
    public static final String TYPE = "type";

    private Properties() {
    }
}
