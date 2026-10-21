package com.bbva.component.dm.settings.domain.model;

import bk.q;
import com.bbva.glomoconfig.constants.RouteConstants;
import com.bbva.glomohybrid.logs.LogKeysKt;
import com.bbva.network.model.ConnectionThreshold;
import com.bbva.network.model.SpeedThreshold;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: DataModels.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\"\u001d\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004*\"\u0010\t\"\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/component/dm/settings/domain/model/AppSettings;", "", "Lcom/bbva/component/dm/settings/domain/model/WebViewVersionDataModel;", "getWebViewVersions", "(Lcom/bbva/component/dm/settings/domain/model/AppSettings;)Ljava/util/List;", "webViewVersions", "", "", "", "Data", "cmp-dm-appsettings_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nDataModels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataModels.kt\ncom/bbva/component/dm/settings/domain/model/DataModelsKt\n+ 2 MapExtensions.kt\ncom/bbva/glomoutils/MapExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,512:1\n19#2:513\n12#2:514\n12#2:519\n12#2:520\n12#2:521\n12#2:522\n12#2:523\n12#2:524\n12#2:525\n12#2:526\n12#2:528\n12#2:529\n12#2:530\n12#2:531\n12#2:532\n12#2:533\n12#2:534\n12#2:535\n12#2:536\n12#2:537\n12#2:538\n12#2:543\n12#2:544\n12#2:545\n12#2:546\n12#2:547\n19#2:548\n12#2:549\n12#2:550\n12#2:551\n12#2:552\n12#2:553\n12#2:554\n12#2:555\n12#2:556\n12#2:557\n12#2:561\n12#2:562\n12#2:563\n12#2:565\n12#2:566\n19#2:567\n19#2:568\n19#2:569\n19#2:570\n12#2:571\n12#2:572\n12#2:576\n19#2:577\n19#2:578\n12#2:579\n12#2:580\n12#2:581\n12#2:582\n12#2:583\n12#2:588\n12#2:589\n1#3:515\n1549#4:516\n1620#4,2:517\n1622#4:527\n1549#4:539\n1620#4,3:540\n1549#4:558\n1620#4,2:559\n1622#4:564\n1747#4,3:573\n1549#4:584\n1620#4,3:585\n*S KotlinDebug\n*F\n+ 1 DataModels.kt\ncom/bbva/component/dm/settings/domain/model/DataModelsKt\n*L\n161#1:513\n162#1:514\n176#1:519\n177#1:520\n178#1:521\n179#1:522\n180#1:523\n181#1:524\n184#1:525\n187#1:526\n207#1:528\n212#1:529\n219#1:530\n240#1:531\n241#1:532\n252#1:533\n253#1:534\n266#1:535\n267#1:536\n268#1:537\n280#1:538\n290#1:543\n291#1:544\n292#1:545\n293#1:546\n308#1:547\n317#1:548\n321#1:549\n322#1:550\n324#1:551\n334#1:552\n341#1:553\n342#1:554\n355#1:555\n360#1:556\n361#1:557\n375#1:561\n378#1:562\n379#1:563\n393#1:565\n394#1:566\n425#1:567\n426#1:568\n427#1:569\n428#1:570\n439#1:571\n440#1:572\n443#1:576\n450#1:577\n459#1:578\n469#1:579\n479#1:580\n480#1:581\n481#1:582\n492#1:583\n505#1:588\n506#1:589\n174#1:516\n174#1:517,2\n174#1:527\n280#1:539\n280#1:540,3\n374#1:558\n374#1:559,2\n374#1:564\n441#1:573,3\n493#1:584\n493#1:585,3\n*E\n"})
public final class DataModelsKt {
    public static final VersionOperative a(Map<String, ? extends Object> map) {
        Double dValueOf = Double.valueOf(0.0d);
        Object obj = map.get("android");
        if (!(obj instanceof Double)) {
            obj = null;
        }
        Double d2 = (Double) obj;
        if (d2 != null) {
            dValueOf = d2;
        }
        return new VersionOperative((int) dValueOf.doubleValue());
    }

    public static final BackgroundCustom access$asBackgroundCustom(Map map) {
        Object obj = map.get("loginImageUrl");
        DashboardBackground dashboardBackground = null;
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            str = null;
        }
        Map mapEmptyMap = q.emptyMap();
        Object obj2 = map.get(RouteConstants.DASHBOARD);
        if (!(obj2 instanceof Map)) {
            obj2 = null;
        }
        Map map2 = (Map) obj2;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        if (!(!mapEmptyMap.isEmpty())) {
            mapEmptyMap = null;
        }
        if (mapEmptyMap != null) {
            Object obj3 = mapEmptyMap.get("type");
            if (!(obj3 instanceof String)) {
                obj3 = null;
            }
            String str2 = (String) obj3;
            if (str2 == null) {
                str2 = null;
            }
            Object obj4 = mapEmptyMap.get("colourCode");
            if (!(obj4 instanceof String)) {
                obj4 = null;
            }
            String str3 = (String) obj4;
            if (str3 == null) {
                str3 = null;
            }
            Object obj5 = mapEmptyMap.get("imageUrl");
            if (!(obj5 instanceof String)) {
                obj5 = null;
            }
            String str4 = (String) obj5;
            dashboardBackground = new DashboardBackground(str2, str3, str4 != null ? str4 : null);
        }
        return new BackgroundCustom(str, dashboardBackground);
    }

    public static final Contact access$asContact(Map map) {
        Object obj = map.get("phone");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        Object obj2 = map.get("androidRejetedCardNumber");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str2 = (String) obj2;
        Object obj3 = map.get("ivrNumber");
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        String str3 = (String) obj3;
        Object obj4 = map.get("ivrWelcome");
        return new Contact(str, str2, str3, (String) (obj4 instanceof String ? obj4 : null));
    }

    public static final GlomoContinuityUseCaseModel access$asContinuityUseCaseModel(Map map) {
        Object obj = map.get("id");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        Object obj2 = map.get("name");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str2 = (String) obj2;
        String str3 = str2 != null ? str2 : "";
        List listListOf = CollectionsKt__CollectionsKt.listOf((Object[]) new String[]{str, str3});
        if (!(listListOf instanceof Collection) || !listListOf.isEmpty()) {
            Iterator it = listListOf.iterator();
            while (it.hasNext()) {
                if (((String) it.next()).length() == 0) {
                    return null;
                }
            }
        }
        Boolean bool = Boolean.FALSE;
        Object obj3 = map.get("isCodified");
        Boolean bool2 = (Boolean) (obj3 instanceof Boolean ? obj3 : null);
        if (bool2 != null) {
            bool = bool2;
        }
        return new GlomoContinuityUseCaseModel(str, str3, bool.booleanValue());
    }

    public static final CustomerLoginsConfiguration access$asCustomerLoginsConfiguration(Map map) {
        Object obj = map.get("exceptionRegularExpression");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        return new CustomerLoginsConfiguration(str);
    }

    public static final DependenciesVersionDataModel access$asDependenciesVersion(Map map) {
        Map mapEmptyMap = q.emptyMap();
        Object obj = map.get("android");
        AndroidDependenciesVersionDataModel androidDependenciesVersionDataModel = null;
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
            List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            Object obj2 = mapEmptyMap.get("webview");
            if (!(obj2 instanceof List)) {
                obj2 = null;
            }
            List list = (List) obj2;
            if (list != null) {
                listEmptyList = list;
            }
            List<Map> list2 = listEmptyList;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (Map map3 : list2) {
                Object obj3 = map3.get("minVersion");
                if (!(obj3 instanceof String)) {
                    obj3 = null;
                }
                String str = (String) obj3;
                if (str == null) {
                    str = "";
                }
                Map mapEmptyMap2 = q.emptyMap();
                Object obj4 = map3.get("packageIds");
                if (!(obj4 instanceof Map)) {
                    obj4 = null;
                }
                Map map4 = (Map) obj4;
                if (map4 != null) {
                    mapEmptyMap2 = map4;
                }
                arrayList.add(new WebViewVersionDataModel(str, mapEmptyMap2));
            }
            androidDependenciesVersionDataModel = new AndroidDependenciesVersionDataModel(arrayList.isEmpty() ^ true ? arrayList : null);
        }
        return new DependenciesVersionDataModel(androidDependenciesVersionDataModel);
    }

    public static final HeartCampaign access$asHeartCampaign(Map map) {
        Double dValueOf = Double.valueOf(0.0d);
        Object obj = map.get(LogKeysKt.END_DATE);
        if (!(obj instanceof Double)) {
            obj = null;
        }
        Double d2 = (Double) obj;
        if (d2 != null) {
            dValueOf = d2;
        }
        return new HeartCampaign(Long.valueOf((long) dValueOf.doubleValue()));
    }

    public static final InAppBrowserDataModel access$asInAppBrowserConfigModel(Map map) {
        Object obj = map.get("whitelist");
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list == null) {
            return null;
        }
        return new InAppBrowserDataModel(list);
    }

    public static final LoginLowCostConfiguration access$asLoginLowCostConfiguration(Map map) {
        Object obj = map.get("exceptionRegularExpression");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        Object obj2 = map.get("valueAAP");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str2 = (String) obj2;
        return new LoginLowCostConfiguration(str, str2 != null ? str2 : null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final ConnectionThreshold access$asNetworkSpeedConfiguration(Map map) {
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        SpeedThreshold speedThreshold = new ConnectionThreshold(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0).getSpeedThreshold();
        Number numberValueOf = Integer.valueOf(speedThreshold.getLow());
        Object obj = map.get("low");
        if (!(obj instanceof Number)) {
            obj = null;
        }
        Number number = (Number) obj;
        if (number != null) {
            numberValueOf = number;
        }
        int iIntValue = numberValueOf.intValue();
        Number numberValueOf2 = Integer.valueOf(speedThreshold.getModerate());
        Object obj2 = map.get("moderate");
        if (!(obj2 instanceof Number)) {
            obj2 = null;
        }
        Number number2 = (Number) obj2;
        if (number2 != null) {
            numberValueOf2 = number2;
        }
        int iIntValue2 = numberValueOf2.intValue();
        Number numberValueOf3 = Integer.valueOf(speedThreshold.getHigh());
        Object obj3 = map.get("high");
        if (!(obj3 instanceof Number)) {
            obj3 = null;
        }
        Number number3 = (Number) obj3;
        if (number3 != null) {
            numberValueOf3 = number3;
        }
        return new ConnectionThreshold(new SpeedThreshold(iIntValue, iIntValue2, numberValueOf3.intValue()), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0);
    }

    public static final NotificationFieldConfig access$asNotificationFieldConfig(Map map) {
        OperativeParams operativeParams;
        Object objM5535constructorimpl;
        Object obj = map.get("functionalBlocks");
        ArrayList arrayList = null;
        if (!(obj instanceof ArrayList)) {
            obj = null;
        }
        ArrayList arrayList2 = (ArrayList) obj;
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Object obj2 = map.get("operativesShortcuts");
        if (!(obj2 instanceof List)) {
            obj2 = null;
        }
        List list = (List) obj2;
        if (list != null) {
            listEmptyList = list;
        }
        if (!(!listEmptyList.isEmpty())) {
            listEmptyList = null;
        }
        if (listEmptyList != null) {
            List<Map> list2 = listEmptyList;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (Map map2 : list2) {
                Object obj3 = map2.get("id");
                if (!(obj3 instanceof String)) {
                    obj3 = null;
                }
                String str = (String) obj3;
                String str2 = str == null ? "" : str;
                Object obj4 = map2.get("icon");
                if (!(obj4 instanceof String)) {
                    obj4 = null;
                }
                String str3 = (String) obj4;
                String str4 = str3 == null ? "" : str3;
                Object obj5 = map2.get("title");
                if (!(obj5 instanceof String)) {
                    obj5 = null;
                }
                String str5 = (String) obj5;
                String str6 = str5 == null ? "" : str5;
                Object obj6 = map2.get("routeType");
                if (!(obj6 instanceof String)) {
                    obj6 = null;
                }
                String str7 = (String) obj6;
                String str8 = str7 == null ? "" : str7;
                Boolean bool = Boolean.TRUE;
                Object obj7 = map2.get("webManager");
                if (!(obj7 instanceof Boolean)) {
                    obj7 = null;
                }
                Boolean bool2 = (Boolean) obj7;
                Boolean bool3 = bool2 == null ? bool : bool2;
                Map mapEmptyMap = q.emptyMap();
                Object obj8 = map2.get("params");
                if (!(obj8 instanceof Map)) {
                    obj8 = null;
                }
                Map map3 = (Map) obj8;
                if (map3 != null) {
                    mapEmptyMap = map3;
                }
                if (!(!mapEmptyMap.isEmpty())) {
                    mapEmptyMap = null;
                }
                if (mapEmptyMap != null) {
                    Object obj9 = mapEmptyMap.get("action");
                    if (!(obj9 instanceof String)) {
                        obj9 = null;
                    }
                    String str9 = (String) obj9;
                    if (str9 == null) {
                        str9 = "UNKNOWN";
                    }
                    String upperCase = str9.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        objM5535constructorimpl = Result.m5535constructorimpl(OperativeParamAction.valueOf(upperCase));
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
                    }
                    if (Result.m5540isFailureimpl(objM5535constructorimpl)) {
                        objM5535constructorimpl = null;
                    }
                    OperativeParamAction operativeParamAction = (OperativeParamAction) objM5535constructorimpl;
                    if (operativeParamAction == null) {
                        operativeParamAction = OperativeParamAction.UNKNOWN;
                    }
                    Map mapEmptyMap2 = q.emptyMap();
                    Object obj10 = mapEmptyMap.get("config");
                    if (!(obj10 instanceof Map)) {
                        obj10 = null;
                    }
                    Map map4 = (Map) obj10;
                    if (map4 != null) {
                        mapEmptyMap2 = map4;
                    }
                    operativeParams = new OperativeParams(operativeParamAction, mapEmptyMap2);
                } else {
                    operativeParams = null;
                }
                Map mapEmptyMap3 = q.emptyMap();
                Object obj11 = map2.get("minVersion");
                if (!(obj11 instanceof Map)) {
                    obj11 = null;
                }
                Map map5 = (Map) obj11;
                if (map5 != null) {
                    mapEmptyMap3 = map5;
                }
                if (!(!mapEmptyMap3.isEmpty())) {
                    mapEmptyMap3 = null;
                }
                VersionOperative versionOperativeA = mapEmptyMap3 != null ? a(mapEmptyMap3) : null;
                Map mapEmptyMap4 = q.emptyMap();
                Object obj12 = map2.get("maxVersion");
                if (!(obj12 instanceof Map)) {
                    obj12 = null;
                }
                Map map6 = (Map) obj12;
                if (map6 != null) {
                    mapEmptyMap4 = map6;
                }
                if (!(!mapEmptyMap4.isEmpty())) {
                    mapEmptyMap4 = null;
                }
                arrayList3.add(new Operative(str2, str4, str6, str8, bool3, operativeParams, versionOperativeA, mapEmptyMap4 != null ? a(mapEmptyMap4) : null));
            }
            arrayList = arrayList3;
        }
        return new NotificationFieldConfig(arrayList2, arrayList);
    }

    public static final SingleAppConfiguration access$asSingleAppConfiguration(Map map) {
        Configuration configuration;
        ArrayList arrayList;
        Object obj = map.get("configuration");
        if (!(obj instanceof Map)) {
            obj = null;
        }
        Map map2 = (Map) obj;
        if (map2 != null) {
            List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
            Object obj2 = map2.get("exceptions");
            if (!(obj2 instanceof List)) {
                obj2 = null;
            }
            List list = (List) obj2;
            if (list != null) {
                listEmptyList = list;
            }
            if (!(!listEmptyList.isEmpty())) {
                listEmptyList = null;
            }
            if (listEmptyList != null) {
                List<Map> list2 = listEmptyList;
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                for (Map map3 : list2) {
                    Map mapEmptyMap = q.emptyMap();
                    Object obj3 = map3.get("when");
                    if (!(obj3 instanceof Map)) {
                        obj3 = null;
                    }
                    Map map4 = (Map) obj3;
                    if (map4 != null) {
                        mapEmptyMap = map4;
                    }
                    List listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
                    Object obj4 = mapEmptyMap.get("includes");
                    if (!(obj4 instanceof List)) {
                        obj4 = null;
                    }
                    List list3 = (List) obj4;
                    if (list3 != null) {
                        listEmptyList2 = list3;
                    }
                    List listEmptyList3 = CollectionsKt__CollectionsKt.emptyList();
                    Object obj5 = mapEmptyMap.get("in");
                    if (!(obj5 instanceof List)) {
                        obj5 = null;
                    }
                    List list4 = (List) obj5;
                    if (list4 != null) {
                        listEmptyList3 = list4;
                    }
                    WhenClause whenClause = new WhenClause(listEmptyList2, listEmptyList3);
                    Object obj6 = map3.get("valueAAP");
                    if (!(obj6 instanceof String)) {
                        obj6 = null;
                    }
                    String str = (String) obj6;
                    if (str == null) {
                        str = "";
                    }
                    Object obj7 = map3.get("valueHOST");
                    if (!(obj7 instanceof String)) {
                        obj7 = null;
                    }
                    String str2 = (String) obj7;
                    if (str2 == null) {
                        str2 = "";
                    }
                    arrayList.add(new Exceptions(str, str2, whenClause));
                }
            } else {
                arrayList = null;
            }
            Object obj8 = map2.get("defaultAAP");
            if (!(obj8 instanceof String)) {
                obj8 = null;
            }
            String str3 = (String) obj8;
            if (str3 == null) {
                str3 = "";
            }
            Object obj9 = map2.get("defaultHOST");
            if (!(obj9 instanceof String)) {
                obj9 = null;
            }
            String str4 = (String) obj9;
            if (str4 == null) {
                str4 = "";
            }
            configuration = new Configuration(str3, str4, arrayList);
        } else {
            configuration = null;
        }
        Boolean bool = Boolean.FALSE;
        Object obj10 = map.get("isActive");
        if (!(obj10 instanceof Boolean)) {
            obj10 = null;
        }
        Boolean bool2 = (Boolean) obj10;
        if (bool2 != null) {
            bool = bool2;
        }
        boolean zBooleanValue = bool.booleanValue();
        Object obj11 = map.get("loginGEMAImageUrl");
        if (!(obj11 instanceof String)) {
            obj11 = null;
        }
        String str5 = (String) obj11;
        String str6 = str5 != null ? str5 : "";
        if (str6.length() <= 0) {
            str6 = null;
        }
        List listEmptyList4 = CollectionsKt__CollectionsKt.emptyList();
        Object obj12 = map.get("excludedVersions");
        if (!(obj12 instanceof List)) {
            obj12 = null;
        }
        List list5 = (List) obj12;
        if (list5 != null) {
            listEmptyList4 = list5;
        }
        return new SingleAppConfiguration(zBooleanValue, str6, listEmptyList4.isEmpty() ^ true ? listEmptyList4 : null, configuration);
    }

    public static final SmartAssistanceCredentials access$asSmartAssistanceData(Map map) {
        Object obj = map.get("android");
        if (!(obj instanceof String)) {
            obj = null;
        }
        return new SmartAssistanceCredentials((String) obj);
    }

    public static final TermsAndConditionsDataModel access$asTermsAndConditionsDataModel(Map map) {
        Object obj = map.get("name");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        if (str == null) {
            str = "";
        }
        Object obj2 = map.get("id");
        String str2 = (String) (obj2 instanceof String ? obj2 : null);
        return new TermsAndConditionsDataModel(str, str2 != null ? str2 : "");
    }

    public static final TraceSettings access$asTraceSettings(Map map) {
        List listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        Object obj = map.get("observablesPages");
        AvailableVersions availableVersions = null;
        ArrayList arrayList = null;
        if (!(obj instanceof List)) {
            obj = null;
        }
        List list = (List) obj;
        if (list != null) {
            listEmptyList = list;
        }
        List listEmptyList2 = CollectionsKt__CollectionsKt.emptyList();
        Object obj2 = map.get("nativeLevels");
        if (!(obj2 instanceof List)) {
            obj2 = null;
        }
        List list2 = (List) obj2;
        if (list2 != null) {
            listEmptyList2 = list2;
        }
        List listEmptyList3 = CollectionsKt__CollectionsKt.emptyList();
        Object obj3 = map.get("webLevels");
        if (!(obj3 instanceof List)) {
            obj3 = null;
        }
        List list3 = (List) obj3;
        if (list3 != null) {
            listEmptyList3 = list3;
        }
        Map mapEmptyMap = q.emptyMap();
        Object obj4 = map.get("versions");
        if (!(obj4 instanceof Map)) {
            obj4 = null;
        }
        Map map2 = (Map) obj4;
        if (map2 != null) {
            mapEmptyMap = map2;
        }
        if (!(!mapEmptyMap.isEmpty())) {
            mapEmptyMap = null;
        }
        if (mapEmptyMap != null) {
            Object obj5 = mapEmptyMap.get("Android");
            if (!(obj5 instanceof List)) {
                obj5 = null;
            }
            List list4 = (List) obj5;
            if (list4 == null) {
                list4 = null;
            }
            if (list4 != null) {
                List list5 = list4;
                arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, 10));
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf((int) ((Number) it.next()).doubleValue()));
                }
            }
            availableVersions = new AvailableVersions(arrayList);
        }
        return new TraceSettings(listEmptyList, listEmptyList2, listEmptyList3, availableVersions);
    }

    @Nullable
    public static final List<WebViewVersionDataModel> getWebViewVersions(@NotNull AppSettings appSettings) {
        AndroidDependenciesVersionDataModel android2;
        Intrinsics.checkNotNullParameter(appSettings, "<this>");
        DependenciesVersionDataModel dependenciesVersion = appSettings.getDependenciesVersion();
        if (dependenciesVersion == null || (android2 = dependenciesVersion.getAndroid()) == null) {
            return null;
        }
        return android2.getWebview();
    }
}
