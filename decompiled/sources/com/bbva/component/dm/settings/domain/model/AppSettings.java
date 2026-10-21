package com.bbva.component.dm.settings.domain.model;

import bk.q;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.network.model.ConnectionThreshold;
import com.bbva.semaas.model.Properties;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002j\u0002`\u0004¢\u0006\u0004\ba\u0010bJ\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002j\u0002`\u0004J\u0019\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002j\u0002`\u0004HÆ\u0003J#\u0010\b\u001a\u00020\u00002\u0018\b\u0002\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002j\u0002`\u0004HÆ\u0001J\t\u0010\t\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R*\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002j\u0002`\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010#\u001a\u0004\u0018\u00010 8F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0013\u0010$\u001a\u0004\u0018\u00010\r8F¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0013\u0010)\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010-\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u00101\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u00105\u001a\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u00109\u001a\u0004\u0018\u0001068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0019\u0010<\u001a\n\u0012\u0004\u0012\u00020:\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b;\u0010\u001eR\u0013\u0010@\u001a\u0004\u0018\u00010=8F¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0013\u0010D\u001a\u0004\u0018\u00010A8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010E\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u0011\u0010J\u001a\u00020G8F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0019\u0010M\u001a\n\u0012\u0004\u0012\u00020K\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\bL\u0010\u001eR\u0013\u0010Q\u001a\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0011\u0010S\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bR\u0010FR\u0013\u0010W\u001a\u0004\u0018\u00010T8F¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0011\u0010Y\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bX\u0010FR\u0019\u0010\\\u001a\n\u0012\u0004\u0012\u00020Z\u0018\u00010\u001b8F¢\u0006\u0006\u001a\u0004\b[\u0010\u001eR\u0013\u0010`\u001a\u0004\u0018\u00010]8F¢\u0006\u0006\u001a\u0004\b^\u0010_¨\u0006c"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/AppSettings;", "", "", "", "Lcom/bbva/component/dm/settings/domain/model/Data;", "toMap", "component1", "data", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/util/Map;", "getData", "()Ljava/util/Map;", "Lcom/bbva/component/dm/settings/domain/model/AppVersionsDataModel;", "getAppVersion", "()Lcom/bbva/component/dm/settings/domain/model/AppVersionsDataModel;", Properties.APP_VERSION, "Lcom/bbva/component/dm/settings/domain/model/DependenciesVersionDataModel;", "getDependenciesVersion", "()Lcom/bbva/component/dm/settings/domain/model/DependenciesVersionDataModel;", "dependenciesVersion", "", "Lcom/bbva/component/dm/settings/domain/model/TermsAndConditionsDataModel;", "getTerms", "()Ljava/util/List;", "terms", "Lcom/bbva/component/dm/settings/domain/model/BackgroundCustom;", "getBackgroundCustom", "()Lcom/bbva/component/dm/settings/domain/model/BackgroundCustom;", "backgroundCustom", "isRestrictiveModeON", "()Ljava/lang/Boolean;", "Lcom/bbva/component/dm/settings/domain/model/TraceSettings;", "getTraceSettings", "()Lcom/bbva/component/dm/settings/domain/model/TraceSettings;", "traceSettings", "Lcom/bbva/component/dm/settings/domain/model/HeartCampaign;", "getHeartCampaign", "()Lcom/bbva/component/dm/settings/domain/model/HeartCampaign;", "heartCampaign", "Lcom/bbva/component/dm/settings/domain/model/SingleAppConfiguration;", "getSingleAppConfiguration", "()Lcom/bbva/component/dm/settings/domain/model/SingleAppConfiguration;", "singleAppConfiguration", "Lcom/bbva/component/dm/settings/domain/model/CustomerLoginsConfiguration;", "getCustomerLoginsConfiguration", "()Lcom/bbva/component/dm/settings/domain/model/CustomerLoginsConfiguration;", "customerLoginsConfiguration", "Lcom/bbva/component/dm/settings/domain/model/LoginLowCostConfiguration;", "getLoginLowCostConfiguration", "()Lcom/bbva/component/dm/settings/domain/model/LoginLowCostConfiguration;", "loginLowCostConfiguration", "Lcom/bbva/component/dm/settings/domain/model/LandingConfiguration;", "getLanding", "landing", "Lcom/bbva/component/dm/settings/domain/model/Contact;", "getContact", "()Lcom/bbva/component/dm/settings/domain/model/Contact;", "contact", "Lcom/bbva/component/dm/settings/domain/model/SmartAssistanceCredentials;", "getSmartAssistantEncryptedKey", "()Lcom/bbva/component/dm/settings/domain/model/SmartAssistanceCredentials;", "smartAssistantEncryptedKey", "isServiceAvailable", "()Z", "Lcom/bbva/component/dm/settings/domain/model/AppStatus;", "getAppStatus", "()Lcom/bbva/component/dm/settings/domain/model/AppStatus;", "appStatus", "Lcom/bbva/component/dm/settings/domain/model/GlomoContinuityUseCaseModel;", "getGlomoContinuityUseCases", "glomoContinuityUseCases", "Lcom/bbva/component/dm/settings/domain/model/NotificationFieldConfig;", "getNotificationFieldConfig", "()Lcom/bbva/component/dm/settings/domain/model/NotificationFieldConfig;", "notificationFieldConfig", "getQuickLoginEnabled", "quickLoginEnabled", "Lcom/bbva/component/dm/settings/domain/model/InAppBrowserDataModel;", "getInAppBrowser", "()Lcom/bbva/component/dm/settings/domain/model/InAppBrowserDataModel;", "inAppBrowser", "getAllowLoginWithTsecError", "allowLoginWithTsecError", "Lcom/bbva/component/dm/settings/domain/model/DeeplinkConfigModel;", "getDeeplinkConfiguration", "deeplinkConfiguration", "Lcom/bbva/network/model/ConnectionThreshold;", "getNetworkSpeedConfiguration", "()Lcom/bbva/network/model/ConnectionThreshold;", "networkSpeedConfiguration", "<init>", "(Ljava/util/Map;)V", "cmp-dm-appsettings_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDataModels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataModels.kt\ncom/bbva/component/dm/settings/domain/model/AppSettings\n+ 2 MapExtensions.kt\ncom/bbva/glomoutils/MapExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,512:1\n12#2:513\n12#2:515\n12#2:516\n12#2:521\n12#2:522\n12#2:523\n12#2:524\n12#2:525\n12#2:526\n19#2:527\n12#2:532\n12#2:533\n12#2:534\n12#2:535\n12#2:536\n12#2:550\n19#2:551\n12#2:552\n12#2:553\n12#2:558\n12#2:559\n1#3:514\n1#3:547\n1549#4:517\n1620#4,3:518\n1549#4:528\n1620#4,3:529\n1603#4,9:537\n1855#4:546\n1856#4:548\n1612#4:549\n1549#4:554\n1620#4,3:555\n*S KotlinDebug\n*F\n+ 1 DataModels.kt\ncom/bbva/component/dm/settings/domain/model/AppSettings\n*L\n17#1:513\n24#1:515\n31#1:516\n38#1:521\n48#1:522\n55#1:523\n62#1:524\n69#1:525\n76#1:526\n83#1:527\n89#1:532\n96#1:533\n102#1:534\n106#1:535\n113#1:536\n122#1:550\n132#1:551\n139#1:552\n144#1:553\n152#1:558\n153#1:559\n116#1:547\n32#1:517\n32#1:518,3\n84#1:528\n84#1:529,3\n116#1:537,9\n116#1:546\n116#1:548\n116#1:549\n147#1:554\n147#1:555,3\n*E\n"})
public final /* data */ class AppSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @SerializedName("data")
    @NotNull
    private final Map<String, Object> data;

    public AppSettings(@NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AppSettings copy$default(AppSettings appSettings, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            map = appSettings.data;
        }
        return appSettings.copy(map);
    }

    @NotNull
    public final Map<String, Object> component1() {
        return this.data;
    }

    @NotNull
    public final AppSettings copy(@NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return new AppSettings(data);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AppSettings) && Intrinsics.areEqual(this.data, ((AppSettings) other).data);
    }

    public final boolean getAllowLoginWithTsecError() {
        Map<String, Object> map = this.data;
        Boolean bool = Boolean.FALSE;
        Object obj = map.get("continueAfterTsecError");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool2 = (Boolean) obj;
        if (bool2 != null) {
            bool = bool2;
        }
        return bool.booleanValue();
    }

    @NotNull
    public final AppStatus getAppStatus() {
        Map<String, Object> map = this.data;
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get("appStatus");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        return AppStatusConfigurationKt.asAppStatusDataModel(mapEmptyMap.isEmpty() ^ true ? mapEmptyMap : null);
    }

    @Nullable
    public final AppVersionsDataModel getAppVersion() {
        Map<String, Object> map = this.data;
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get(Properties.APP_VERSION);
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        if (!(!mapEmptyMap.isEmpty())) {
            mapEmptyMap = null;
        }
        if (mapEmptyMap != null) {
            return AppVersionConfigurationKt.asAppVersionsDataModel(mapEmptyMap);
        }
        return null;
    }

    @Nullable
    public final BackgroundCustom getBackgroundCustom() {
        Map<String, Object> map = this.data;
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get("backgroundCustomization");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        if (!(!mapEmptyMap.isEmpty())) {
            mapEmptyMap = null;
        }
        if (mapEmptyMap != null) {
            return DataModelsKt.access$asBackgroundCustom(mapEmptyMap);
        }
        return null;
    }

    @Nullable
    public final Contact getContact() {
        Map<String, Object> map = this.data;
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get("contact");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        if (!(!mapEmptyMap.isEmpty())) {
            mapEmptyMap = null;
        }
        if (mapEmptyMap != null) {
            return DataModelsKt.access$asContact(mapEmptyMap);
        }
        return null;
    }

    @Nullable
    public final CustomerLoginsConfiguration getCustomerLoginsConfiguration() {
        Map<String, Object> map = this.data;
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get("customerLoginsConfiguration");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        if (!(!mapEmptyMap.isEmpty())) {
            mapEmptyMap = null;
        }
        if (mapEmptyMap != null) {
            return DataModelsKt.access$asCustomerLoginsConfiguration(mapEmptyMap);
        }
        return null;
    }

    @NotNull
    public final Map<String, Object> getData() {
        return this.data;
    }

    @Nullable
    public final List<DeeplinkConfigModel> getDeeplinkConfiguration() {
        Map<String, Object> map = this.data;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Object obj = map.get("shortcutConfiguration");
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            listEmptyList = list;
        }
        List list2 = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(DeeplinkConfigurationKt.asDeeplinkConfigModel((Map) it.next()));
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return null;
    }

    @Nullable
    public final DependenciesVersionDataModel getDependenciesVersion() {
        Map<String, Object> map = this.data;
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get("dependenciesVersion");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        if (!(!mapEmptyMap.isEmpty())) {
            mapEmptyMap = null;
        }
        if (mapEmptyMap != null) {
            return DataModelsKt.access$asDependenciesVersion(mapEmptyMap);
        }
        return null;
    }

    @Nullable
    public final List<GlomoContinuityUseCaseModel> getGlomoContinuityUseCases() {
        Map<String, Object> map = this.data;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Object obj = map.get("glomoContinuityUseCases");
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            listEmptyList = list;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listEmptyList.iterator();
        while (it.hasNext()) {
            GlomoContinuityUseCaseModel glomoContinuityUseCaseModelAccess$asContinuityUseCaseModel = DataModelsKt.access$asContinuityUseCaseModel((Map) it.next());
            if (glomoContinuityUseCaseModelAccess$asContinuityUseCaseModel != null) {
                arrayList.add(glomoContinuityUseCaseModelAccess$asContinuityUseCaseModel);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return null;
    }

    @Nullable
    public final HeartCampaign getHeartCampaign() {
        Map<String, Object> map = this.data;
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get("heartCampaign");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        if (!(!mapEmptyMap.isEmpty())) {
            mapEmptyMap = null;
        }
        if (mapEmptyMap != null) {
            return DataModelsKt.access$asHeartCampaign(mapEmptyMap);
        }
        return null;
    }

    @Nullable
    public final InAppBrowserDataModel getInAppBrowser() {
        Object obj = this.data.get("inAppBrowser");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map = (Map) obj;
        if (map == null) {
            return null;
        }
        if (!(!map.isEmpty())) {
            map = null;
        }
        if (map != null) {
            return DataModelsKt.access$asInAppBrowserConfigModel(map);
        }
        return null;
    }

    @Nullable
    public final List<LandingConfiguration> getLanding() {
        Object obj = this.data.get("landing");
        ArrayList arrayList = null;
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            List list2 = list;
            arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(LandingConfigurationKt.asLandingConfiguration((Map) it.next()));
            }
        }
        return arrayList;
    }

    @Nullable
    public final LoginLowCostConfiguration getLoginLowCostConfiguration() {
        Map<String, Object> map = this.data;
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get("loginLowCostConfiguration");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        if (!(!mapEmptyMap.isEmpty())) {
            mapEmptyMap = null;
        }
        if (mapEmptyMap != null) {
            return DataModelsKt.access$asLoginLowCostConfiguration(mapEmptyMap);
        }
        return null;
    }

    @Nullable
    public final ConnectionThreshold getNetworkSpeedConfiguration() {
        Map<String, Object> map = this.data;
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get("networkSpeedConfiguration");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        Map mapEmptyMap2 = q.emptyMap();
        Object obj2 = mapEmptyMap.get("Android");
        if (!(obj2 instanceof Map)) {
            obj2 = null;
        }
        Map map3 = (Map) obj2;
        if (map3 != null) {
            mapEmptyMap2 = map3;
        }
        if (!(!mapEmptyMap2.isEmpty())) {
            mapEmptyMap2 = null;
        }
        if (mapEmptyMap2 != null) {
            return DataModelsKt.access$asNetworkSpeedConfiguration(mapEmptyMap2);
        }
        return null;
    }

    @Nullable
    public final NotificationFieldConfig getNotificationFieldConfig() {
        Map<String, Object> map = this.data;
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get("notificationFieldConfig");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        if (!(!mapEmptyMap.isEmpty())) {
            mapEmptyMap = null;
        }
        if (mapEmptyMap != null) {
            return DataModelsKt.access$asNotificationFieldConfig(mapEmptyMap);
        }
        return null;
    }

    public final boolean getQuickLoginEnabled() {
        Object obj = this.data.get("quickFidoAuthEnabled");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Nullable
    public final SingleAppConfiguration getSingleAppConfiguration() {
        Map<String, Object> map = this.data;
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get("singleAppConfiguration");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        if (!(!mapEmptyMap.isEmpty())) {
            mapEmptyMap = null;
        }
        if (mapEmptyMap != null) {
            return DataModelsKt.access$asSingleAppConfiguration(mapEmptyMap);
        }
        return null;
    }

    @Nullable
    public final SmartAssistanceCredentials getSmartAssistantEncryptedKey() {
        Map<String, Object> map = this.data;
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get("smartAssistantEncryptedKey");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        if (!(!mapEmptyMap.isEmpty())) {
            mapEmptyMap = null;
        }
        if (mapEmptyMap != null) {
            return DataModelsKt.access$asSmartAssistanceData(mapEmptyMap);
        }
        return null;
    }

    @Nullable
    public final List<TermsAndConditionsDataModel> getTerms() {
        Map<String, Object> map = this.data;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Object obj = map.get("termsAndConditions");
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            listEmptyList = list;
        }
        List list2 = listEmptyList;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(DataModelsKt.access$asTermsAndConditionsDataModel((Map) it.next()));
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        return null;
    }

    @Nullable
    public final TraceSettings getTraceSettings() {
        Map<String, Object> map = this.data;
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get("traceSettings");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        if (!(!mapEmptyMap.isEmpty())) {
            mapEmptyMap = null;
        }
        if (mapEmptyMap != null) {
            return DataModelsKt.access$asTraceSettings(mapEmptyMap);
        }
        return null;
    }

    public int hashCode() {
        return this.data.hashCode();
    }

    @Nullable
    public final Boolean isRestrictiveModeON() {
        return (Boolean) this.data.get("isRestrictiveModeON");
    }

    public final boolean isServiceAvailable() {
        Map<String, Object> map = this.data;
        Boolean bool = Boolean.TRUE;
        Object obj = map.get("isAppAvailable");
        if (!(obj instanceof Boolean)) {
            obj = null;
        }
        Boolean bool2 = (Boolean) obj;
        if (bool2 != null) {
            bool = bool2;
        }
        return bool.booleanValue();
    }

    @NotNull
    public final Map<String, Object> toMap() {
        return this.data;
    }

    @NotNull
    public String toString() {
        return "AppSettings(data=" + this.data + ")";
    }
}
