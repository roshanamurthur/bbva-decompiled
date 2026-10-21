package com.bbva.component.dm.settings.domain.model;

import com.bbva.component.dm.analytics.constants.AnalyticsConstants;
import com.bbva.glomoconfig.constants.RouteConstants;
import com.bbva.glomohybrid.landing.data.mapper.LandingAEMContentMapper;
import com.bbva.tohu.android.product.valkyria.sdk.payments.paywave.ApplicationStatus;
import com.google.android.gms.common.Scopes;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LandingConfiguration.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001c\u0010\u0005\u001a\u00020\u0004*\u0012\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000j\u0002`\u0003H\u0000¨\u0006\u0006"}, d2 = {"", "", "", "Lcom/bbva/component/dm/settings/domain/model/Data;", "Lcom/bbva/component/dm/settings/domain/model/LandingConfiguration;", "asLandingConfiguration", "cmp-dm-appsettings_release"}, k = 2, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLandingConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LandingConfiguration.kt\ncom/bbva/component/dm/settings/domain/model/LandingConfigurationKt\n+ 2 MapExtensions.kt\ncom/bbva/glomoutils/MapExtensionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,97:1\n19#2:98\n12#2:99\n19#2:100\n19#2:101\n19#2:102\n19#2:103\n19#2:104\n19#2:105\n19#2:106\n19#2:107\n12#2:109\n19#2:110\n19#2:111\n19#2:112\n19#2:113\n19#2:114\n19#2:115\n19#2:116\n19#2:117\n19#2:128\n19#2:129\n19#2:130\n19#2:131\n19#2:132\n12#2:133\n1#3:108\n1#3:134\n1603#4,9:118\n1855#4:127\n1856#4:135\n1612#4:136\n*S KotlinDebug\n*F\n+ 1 LandingConfiguration.kt\ncom/bbva/component/dm/settings/domain/model/LandingConfigurationKt\n*L\n6#1:98\n7#1:99\n8#1:100\n9#1:101\n10#1:102\n11#1:103\n12#1:104\n13#1:105\n15#1:106\n17#1:107\n20#1:109\n43#1:110\n44#1:111\n45#1:112\n55#1:113\n56#1:114\n68#1:115\n69#1:116\n70#1:117\n85#1:128\n86#1:129\n90#1:130\n91#1:131\n92#1:132\n93#1:133\n84#1:134\n84#1:118,9\n84#1:127\n84#1:135\n84#1:136\n*E\n"})
public final class LandingConfigurationKt {
    public static final LandingHeaderConfiguration a(Map<String, ? extends Object> map) {
        Object obj = map.get("shortcuts");
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        Object obj2 = map.get("message");
        if (!(obj2 instanceof Map)) {
            obj2 = null;
        }
        Map map2 = (Map) obj2;
        return new LandingHeaderConfiguration(str, map2 != null ? VisualMessageConfigurationKt.asVisualMessageConfiguration(map2) : null);
    }

    /* JADX WARN: Code duplicated, block: B:125:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:93:0x0152  */
    @NotNull
    public static final LandingConfiguration asLandingConfiguration(@NotNull Map<String, ? extends Object> map) {
        LandingHeaderTypesConfiguration landingHeaderTypesConfiguration;
        LandingBackgrounds landingBackgrounds;
        ArrayList arrayList;
        LandingSectionConfiguration landingSectionConfiguration;
        Intrinsics.checkNotNullParameter(map, "<this>");
        Object obj = map.get(Scopes.PROFILE);
        if (!(obj instanceof String)) {
            obj = null;
        }
        String str = (String) obj;
        Object obj2 = map.get("segment");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        String str2 = (String) obj2;
        if (str2 == null) {
            str2 = "personal";
        }
        String str3 = str2;
        Object obj3 = map.get(AnalyticsConstants.Key.SEGMENT_DESCRIPTION);
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        String str4 = (String) obj3;
        Object obj4 = map.get(LandingAEMContentMapper.CONDITION);
        if (!(obj4 instanceof String)) {
            obj4 = null;
        }
        String str5 = (String) obj4;
        String str6 = "priority";
        Object obj5 = map.get("priority");
        if (!(obj5 instanceof Number)) {
            obj5 = null;
        }
        Number number = (Number) obj5;
        int iIntValue = number != null ? number.intValue() : Integer.MAX_VALUE;
        Object obj6 = map.get("avatar");
        if (!(obj6 instanceof String)) {
            obj6 = null;
        }
        String str7 = (String) obj6;
        Object obj7 = map.get("shortcuts");
        if (!(obj7 instanceof String)) {
            obj7 = null;
        }
        String str8 = (String) obj7;
        Object obj8 = map.get("header");
        if (!(obj8 instanceof Map)) {
            obj8 = null;
        }
        Map map2 = (Map) obj8;
        if (map2 != null) {
            Object obj9 = map2.get("default");
            if (!(obj9 instanceof Map)) {
                obj9 = null;
            }
            Map map3 = (Map) obj9;
            LandingHeaderConfiguration landingHeaderConfigurationA = map3 != null ? a(map3) : null;
            Object obj10 = map2.get(ApplicationStatus.STATUS_BLOCKED);
            if (!(obj10 instanceof Map)) {
                obj10 = null;
            }
            Map map4 = (Map) obj10;
            LandingHeaderConfiguration landingHeaderConfigurationA2 = map4 != null ? a(map4) : null;
            Object obj11 = map2.get("force-update");
            if (!(obj11 instanceof Map)) {
                obj11 = null;
            }
            Map map5 = (Map) obj11;
            landingHeaderTypesConfiguration = new LandingHeaderTypesConfiguration(landingHeaderConfigurationA, landingHeaderConfigurationA2, map5 != null ? a(map5) : null);
        } else {
            landingHeaderTypesConfiguration = null;
        }
        Object obj12 = map.get("background");
        if (!(obj12 instanceof Map)) {
            obj12 = null;
        }
        Map map6 = (Map) obj12;
        if (map6 != null) {
            Object obj13 = map6.get("landing");
            if (!(obj13 instanceof String)) {
                obj13 = null;
            }
            String str9 = (String) obj13;
            Object obj14 = map6.get("login");
            if (!(obj14 instanceof String)) {
                obj14 = null;
            }
            String str10 = (String) obj14;
            Object obj15 = map6.get(RouteConstants.DASHBOARD);
            if (!(obj15 instanceof String)) {
                obj15 = null;
            }
            landingBackgrounds = new LandingBackgrounds(str9, str10, (String) obj15);
        } else {
            landingBackgrounds = null;
        }
        Object obj16 = map.get("sections");
        if (!(obj16 instanceof List)) {
            obj16 = null;
        }
        List<Map> list = (List) obj16;
        if (list == null) {
            arrayList = null;
        } else {
            if (!(!list.isEmpty())) {
                list = null;
            }
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                for (Map map7 : list) {
                    Object obj17 = map7.get("type");
                    if (!(obj17 instanceof String)) {
                        obj17 = null;
                    }
                    String str11 = (String) obj17;
                    if (str11 == null) {
                        landingSectionConfiguration = null;
                    } else {
                        Object obj18 = map7.get(str6);
                        if (!(obj18 instanceof Number)) {
                            obj18 = null;
                        }
                        Number number2 = (Number) obj18;
                        if (number2 == null) {
                            landingSectionConfiguration = null;
                        } else {
                            int iIntValue2 = number2.intValue();
                            Object obj19 = map7.get("url");
                            if (!(obj19 instanceof String)) {
                                obj19 = null;
                            }
                            String str12 = (String) obj19;
                            Object obj20 = map7.get("reactivateInDays");
                            if (!(obj20 instanceof Number)) {
                                obj20 = null;
                            }
                            Number number3 = (Number) obj20;
                            Integer numValueOf = number3 != null ? Integer.valueOf(number3.intValue()) : null;
                            Object obj21 = map7.get("cleanCacheDate");
                            if (!(obj21 instanceof String)) {
                                obj21 = null;
                            }
                            String str13 = (String) obj21;
                            Boolean bool = Boolean.TRUE;
                            Object obj22 = map7.get("isVisibleByDefault");
                            if (!(obj22 instanceof Boolean)) {
                                obj22 = null;
                            }
                            Boolean bool2 = (Boolean) obj22;
                            if (bool2 != null) {
                                bool = bool2;
                            }
                            landingSectionConfiguration = new LandingSectionConfiguration(str11, iIntValue2, str12, numValueOf, str13, bool.booleanValue());
                        }
                    }
                    if (landingSectionConfiguration != null) {
                        arrayList2.add(landingSectionConfiguration);
                    }
                    str6 = str6;
                }
                arrayList = arrayList2;
            } else {
                arrayList = null;
            }
        }
        Boolean bool3 = Boolean.FALSE;
        Object obj23 = map.get("lightAccess");
        Boolean bool4 = (Boolean) (!(obj23 instanceof Boolean) ? null : obj23);
        if (bool4 != null) {
            bool3 = bool4;
        }
        return new LandingConfiguration(str, str3, str4, str5, iIntValue, str7, str8, landingHeaderTypesConfiguration, landingBackgrounds, arrayList, bool3.booleanValue());
    }
}
