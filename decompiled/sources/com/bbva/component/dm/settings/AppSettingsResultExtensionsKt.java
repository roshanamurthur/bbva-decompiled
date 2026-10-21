package com.bbva.component.dm.settings;

import com.bbva.component.dm.settings.domain.model.AndroidAppStatus;
import com.bbva.component.dm.settings.domain.model.AppSettings;
import com.bbva.component.dm.settings.domain.model.AppSettingsResult;
import com.bbva.component.dm.settings.domain.model.AppStatus;
import com.bbva.component.dm.settings.domain.model.AppVersionsDataModel;
import com.bbva.component.dm.settings.domain.model.Configuration;
import com.bbva.component.dm.settings.domain.model.CustomerLoginsConfiguration;
import com.bbva.component.dm.settings.domain.model.CustomerLoginsConfigurationKt;
import com.bbva.component.dm.settings.domain.model.DeeplinkConfigModel;
import com.bbva.component.dm.settings.domain.model.GlomoContinuityUseCaseModel;
import com.bbva.component.dm.settings.domain.model.LandingConfiguration;
import com.bbva.component.dm.settings.domain.model.LoginLowCostConfiguration;
import com.bbva.component.dm.settings.domain.model.LoginLowCostConfigurationKt;
import com.bbva.component.dm.settings.domain.model.ScheduledShutdown;
import com.bbva.component.dm.settings.domain.model.SdkStatus;
import com.bbva.component.dm.settings.domain.model.SdkVersion;
import com.bbva.component.dm.settings.domain.model.SingleAppConfiguration;
import com.bbva.component.dm.settings.domain.model.VersionDataModel;
import com.bbva.component.dm.settings.domain.model.VisualMessageConfiguration;
import com.bbva.ethermobilesdk.devicechecker.emulator.EmulatorApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: AppSettingsResultExtensions.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000R\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u0004\u0018\u00010\u0002\u001a\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u0004*\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0016\u0010\u0007\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\u00022\u0006\u0010\t\u001a\u00020\n\u001a\u0016\u0010\u000b\u001a\u0004\u0018\u00010\f*\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u0006\u001a\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\u00022\u0006\u0010\u0010\u001a\u00020\u0006\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u0004\u0018\u00010\u0002\u001a\u000e\u0010\u0013\u001a\u0004\u0018\u00010\b*\u0004\u0018\u00010\u0002\u001a\u0014\u0010\u0014\u001a\u00020\u0015*\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0006\u001a\u0014\u0010\u0017\u001a\u00020\u0015*\u0004\u0018\u00010\u00022\u0006\u0010\u0016\u001a\u00020\u0006\u001a\f\u0010\u0018\u001a\u00020\u0015*\u0004\u0018\u00010\u0002\u001a\u0014\u0010\u0019\u001a\u00020\u0015*\u0004\u0018\u00010\u00022\u0006\u0010\u001a\u001a\u00020\n\u001a\u0014\u0010\u001b\u001a\u00020\u0015*\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u0006\u001a\u000e\u0010\u001c\u001a\u0004\u0018\u00010\u001d*\u0004\u0018\u00010\u0002\u001a\u0014\u0010\u001e\u001a\u00020\u0015*\u0004\u0018\u00010\u00022\u0006\u0010\u001f\u001a\u00020\n\u001a#\u0010 \u001a\u00020\u0015*\u0004\u0018\u00010\u00022\u0006\u0010\u001f\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010!\u001a\u000e\u0010\"\u001a\u0004\u0018\u00010#*\u0004\u0018\u00010\u0002¨\u0006$"}, d2 = {"customerLoginsConfiguration", "Lcom/bbva/component/dm/settings/domain/model/CustomerLoginsConfiguration;", "Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult;", "findContinuityUseCaseBy", "Lcom/bbva/component/dm/settings/domain/model/GlomoContinuityUseCaseModel;", "id", "", "getAppStatusMessageBy", "Lcom/bbva/component/dm/settings/domain/model/VisualMessageConfiguration;", EmulatorApi.SDK, "", "getDeeplinkConfig", "Lcom/bbva/component/dm/settings/domain/model/DeeplinkConfigModel;", "key", "getLandingConfigurationBy", "Lcom/bbva/component/dm/settings/domain/model/LandingConfiguration;", "segmentKey", "getScheduledShutdown", "Lcom/bbva/component/dm/settings/domain/model/ScheduledShutdown;", "getScheduledShutdownMessage", "isActiveCustomerLogins", "", "userDocument", "isActiveLoginLowCost", "isAllowLoginWithTsecError", "isAppAvailable", "currentSdkVersion", "isPublicDeeplink", "loginLowCostConfiguration", "Lcom/bbva/component/dm/settings/domain/model/LoginLowCostConfiguration;", "needAdviceForUpdate", "currentVersion", "needForceUpdate", "(Lcom/bbva/component/dm/settings/domain/model/AppSettingsResult;ILjava/lang/Integer;)Z", "singleAppConfiguration", "Lcom/bbva/component/dm/settings/domain/model/Configuration;", "cmp-dm-appsettings_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppSettingsResultExtensions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSettingsResultExtensions.kt\ncom/bbva/component/dm/settings/AppSettingsResultExtensionsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,102:1\n288#2,2:103\n766#2:106\n857#2,2:107\n2333#2,14:109\n288#2,2:123\n1#3:105\n*S KotlinDebug\n*F\n+ 1 AppSettingsResultExtensions.kt\ncom/bbva/component/dm/settings/AppSettingsResultExtensionsKt\n*L\n15#1:103,2\n45#1:106\n45#1:107,2\n46#1:109,14\n60#1:123,2\n*E\n"})
public final class AppSettingsResultExtensionsKt {
    @Nullable
    public static final CustomerLoginsConfiguration customerLoginsConfiguration(@Nullable AppSettingsResult appSettingsResult) {
        AppSettings data;
        if (appSettingsResult == null || (data = appSettingsResult.getData()) == null) {
            return null;
        }
        return data.getCustomerLoginsConfiguration();
    }

    @Nullable
    public static final GlomoContinuityUseCaseModel findContinuityUseCaseBy(@Nullable AppSettingsResult appSettingsResult, @NotNull String id) {
        AppSettings data;
        List<GlomoContinuityUseCaseModel> glomoContinuityUseCases;
        Intrinsics.checkNotNullParameter(id, "id");
        Object obj = null;
        if (appSettingsResult == null || (data = appSettingsResult.getData()) == null || (glomoContinuityUseCases = data.getGlomoContinuityUseCases()) == null) {
            return null;
        }
        for (Object obj2 : glomoContinuityUseCases) {
            if (Intrinsics.areEqual(id, ((GlomoContinuityUseCaseModel) obj2).getId())) {
                obj = obj2;
                break;
            }
        }
        return (GlomoContinuityUseCaseModel) obj;
    }

    @Nullable
    public static final VisualMessageConfiguration getAppStatusMessageBy(@Nullable AppSettingsResult appSettingsResult, int i10) {
        AppSettings data;
        AppStatus appStatus;
        AndroidAppStatus android2;
        List<SdkStatus> bySdk;
        Object next;
        if (appSettingsResult == null || (data = appSettingsResult.getData()) == null || (appStatus = data.getAppStatus()) == null || (android2 = appStatus.getAndroid()) == null || (bySdk = android2.getBySdk()) == null) {
            return null;
        }
        Iterator<T> it = bySdk.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((SdkStatus) next).getSdk() != i10);
        SdkStatus sdkStatus = (SdkStatus) next;
        if (sdkStatus != null) {
            return sdkStatus.getMessage();
        }
        return null;
    }

    @Nullable
    public static final DeeplinkConfigModel getDeeplinkConfig(@Nullable AppSettingsResult appSettingsResult, @NotNull String key) {
        AppSettings data;
        List<DeeplinkConfigModel> deeplinkConfiguration;
        Intrinsics.checkNotNullParameter(key, "key");
        Object obj = null;
        if (appSettingsResult == null || (data = appSettingsResult.getData()) == null || (deeplinkConfiguration = data.getDeeplinkConfiguration()) == null) {
            return null;
        }
        for (Object obj2 : deeplinkConfiguration) {
            if (Intrinsics.areEqual(((DeeplinkConfigModel) obj2).getKey(), key)) {
                obj = obj2;
                break;
            }
        }
        return (DeeplinkConfigModel) obj;
    }

    @Nullable
    public static final LandingConfiguration getLandingConfigurationBy(@Nullable AppSettingsResult appSettingsResult, @NotNull String segmentKey) {
        AppSettings data;
        List<LandingConfiguration> landing;
        Intrinsics.checkNotNullParameter(segmentKey, "segmentKey");
        Object obj = null;
        if (appSettingsResult == null || (data = appSettingsResult.getData()) == null || (landing = data.getLanding()) == null) {
            return null;
        }
        for (Object obj2 : landing) {
            if (Intrinsics.areEqual(((LandingConfiguration) obj2).getSegment(), segmentKey)) {
                obj = obj2;
                break;
            }
        }
        return (LandingConfiguration) obj;
    }

    @Nullable
    public static final ScheduledShutdown getScheduledShutdown(@Nullable AppSettingsResult appSettingsResult) {
        AppSettings data;
        AppStatus appStatus;
        AndroidAppStatus android2;
        if (appSettingsResult == null || (data = appSettingsResult.getData()) == null || (appStatus = data.getAppStatus()) == null || (android2 = appStatus.getAndroid()) == null) {
            return null;
        }
        return android2.getScheduledShutdown();
    }

    @Nullable
    public static final VisualMessageConfiguration getScheduledShutdownMessage(@Nullable AppSettingsResult appSettingsResult) {
        AppSettings data;
        AppStatus appStatus;
        AndroidAppStatus android2;
        ScheduledShutdown scheduledShutdown;
        if (appSettingsResult == null || (data = appSettingsResult.getData()) == null || (appStatus = data.getAppStatus()) == null || (android2 = appStatus.getAndroid()) == null || (scheduledShutdown = android2.getScheduledShutdown()) == null) {
            return null;
        }
        return scheduledShutdown.getMessage();
    }

    public static final boolean isActiveCustomerLogins(@Nullable AppSettingsResult appSettingsResult, @NotNull String userDocument) {
        Intrinsics.checkNotNullParameter(userDocument, "userDocument");
        CustomerLoginsConfiguration customerLoginsConfiguration = customerLoginsConfiguration(appSettingsResult);
        if (customerLoginsConfiguration != null) {
            return CustomerLoginsConfigurationKt.findExceptionWithDocumentId(customerLoginsConfiguration, userDocument);
        }
        return false;
    }

    public static final boolean isActiveLoginLowCost(@Nullable AppSettingsResult appSettingsResult, @NotNull String userDocument) {
        Intrinsics.checkNotNullParameter(userDocument, "userDocument");
        LoginLowCostConfiguration loginLowCostConfiguration = loginLowCostConfiguration(appSettingsResult);
        if (loginLowCostConfiguration != null) {
            return LoginLowCostConfigurationKt.findExceptionWithDocumentId(loginLowCostConfiguration, userDocument);
        }
        return false;
    }

    public static final boolean isAllowLoginWithTsecError(@Nullable AppSettingsResult appSettingsResult) {
        AppSettings data;
        if (appSettingsResult == null || (data = appSettingsResult.getData()) == null) {
            return false;
        }
        return data.getAllowLoginWithTsecError();
    }

    public static final boolean isAppAvailable(@Nullable AppSettingsResult appSettingsResult, int i10) {
        AppSettings data;
        AppSettings data2;
        AppStatus appStatus;
        AndroidAppStatus android2;
        Object next;
        if (appSettingsResult == null || (data2 = appSettingsResult.getData()) == null || (appStatus = data2.getAppStatus()) == null || (android2 = appStatus.getAndroid()) == null) {
            if (appSettingsResult == null || (data = appSettingsResult.getData()) == null) {
                return true;
            }
            return data.isServiceAvailable();
        }
        List<SdkStatus> bySdk = android2.getBySdk();
        if (bySdk != null) {
            Iterator<T> it = bySdk.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((SdkStatus) next).getSdk() != i10);
            SdkStatus sdkStatus = (SdkStatus) next;
            if (sdkStatus != null) {
                return sdkStatus.getAvailable();
            }
        }
        return android2.getAvailable();
    }

    public static final boolean isPublicDeeplink(@Nullable AppSettingsResult appSettingsResult, @NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        DeeplinkConfigModel deeplinkConfig = getDeeplinkConfig(appSettingsResult, key);
        if (deeplinkConfig != null) {
            return deeplinkConfig.getPublic();
        }
        return false;
    }

    @Nullable
    public static final LoginLowCostConfiguration loginLowCostConfiguration(@Nullable AppSettingsResult appSettingsResult) {
        AppSettings data;
        if (appSettingsResult == null || (data = appSettingsResult.getData()) == null) {
            return null;
        }
        return data.getLoginLowCostConfiguration();
    }

    public static final boolean needAdviceForUpdate(@Nullable AppSettingsResult appSettingsResult, int i10) {
        AppSettings data;
        AppVersionsDataModel appVersion;
        VersionDataModel android2;
        Integer adviceVersion;
        return !needForceUpdate(appSettingsResult, i10, null) && ((appSettingsResult == null || (data = appSettingsResult.getData()) == null || (appVersion = data.getAppVersion()) == null || (android2 = appVersion.getAndroid()) == null || (adviceVersion = android2.getAdviceVersion()) == null) ? 0 : adviceVersion.intValue()) > i10;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0087  */
    /* JADX WARN: Code duplicated, block: B:40:0x008d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    public static final boolean needForceUpdate(@Nullable AppSettingsResult appSettingsResult, int i10, @Nullable Integer num) {
        AppSettings data;
        AppVersionsDataModel appVersion;
        VersionDataModel android2;
        Integer minVersion;
        int iIntValue;
        Object obj;
        if (appSettingsResult == null || (data = appSettingsResult.getData()) == null || (appVersion = data.getAppVersion()) == null || (android2 = appVersion.getAndroid()) == null) {
            return false;
        }
        int iIntValue2 = num != null ? num.intValue() : Integer.MAX_VALUE;
        List<SdkVersion> bySdk = android2.getBySdk();
        if (bySdk != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : bySdk) {
                if (iIntValue2 <= ((SdkVersion) obj2).getSdk()) {
                    arrayList.add(obj2);
                }
            }
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    int sdk = ((SdkVersion) next).getSdk();
                    do {
                        Object next2 = it.next();
                        int sdk2 = ((SdkVersion) next2).getSdk();
                        if (sdk > sdk2) {
                            next = next2;
                            sdk = sdk2;
                        }
                    } while (it.hasNext());
                }
                obj = next;
            } else {
                obj = null;
            }
            SdkVersion sdkVersion = (SdkVersion) obj;
            if (sdkVersion != null) {
                iIntValue = sdkVersion.getMinVersion();
            } else {
                minVersion = android2.getMinVersion();
                if (minVersion != null) {
                    iIntValue = minVersion.intValue();
                } else {
                    iIntValue = 0;
                }
            }
        } else {
            minVersion = android2.getMinVersion();
            if (minVersion != null) {
                iIntValue = minVersion.intValue();
            } else {
                iIntValue = 0;
            }
        }
        return iIntValue > i10;
    }

    @Nullable
    public static final Configuration singleAppConfiguration(@Nullable AppSettingsResult appSettingsResult) {
        AppSettings data;
        SingleAppConfiguration singleAppConfiguration;
        if (appSettingsResult == null || (data = appSettingsResult.getData()) == null || (singleAppConfiguration = data.getSingleAppConfiguration()) == null) {
            return null;
        }
        return singleAppConfiguration.getConfiguration();
    }
}
