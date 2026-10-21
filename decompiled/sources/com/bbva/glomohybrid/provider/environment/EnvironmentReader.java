package com.bbva.glomohybrid.provider.environment;

import android.content.Context;
import androidx.camera.camera2.internal.compat.u;
import bk.q;
import com.bbva.glomoconfig.GlobalConfig;
import com.bbva.glomoconfig.biocatch.BioCatchConfig;
import com.bbva.glomoconfig.lexisNexisTmx.LexisNexisTmxConfig;
import com.bbva.glomoconfig.login.DeviceCheckerPlayIntegrityRequestConfig;
import com.bbva.glomoconfig.softtoken.SoftTokenConfig;
import com.bbva.glomohybrid.base.AppBuildConfig;
import com.bbva.tohu.android.product.valkyria.sdk.constants.SqlContracts;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.noknok.android.client.appsdk_plus.IAppSDKPlus;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: EnvironmentReader.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/provider/environment/EnvironmentReader;", "", "Lcom/bbva/glomoconfig/GlobalConfig;", "b", "Lkotlin/Lazy;", "getEnvironment", "()Lcom/bbva/glomoconfig/GlobalConfig;", "environment", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nEnvironmentReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnvironmentReader.kt\ncom/bbva/glomohybrid/provider/environment/EnvironmentReader\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1789#2,3:177\n1789#2,3:181\n1#3:180\n*S KotlinDebug\n*F\n+ 1 EnvironmentReader.kt\ncom/bbva/glomohybrid/provider/environment/EnvironmentReader\n*L\n72#1:177,3\n150#1:181,3\n*E\n"})
public final class EnvironmentReader {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f33916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy environment;

    /* JADX INFO: compiled from: EnvironmentReader.kt */
    @SourceDebugExtension({"SMAP\nEnvironmentReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnvironmentReader.kt\ncom/bbva/glomohybrid/provider/environment/EnvironmentReader$environment$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
    public static final class a extends Lambda implements Function0<GlobalConfig> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final GlobalConfig invoke() throws IOException {
            EnvironmentReader environmentReader = EnvironmentReader.this;
            InputStream inputStreamOpen = environmentReader.f33916a.getAssets().open("routes/common/global.json");
            Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
            byte[] bytes = ByteStreamsKt.readBytes(inputStreamOpen);
            Charset charsetDefaultCharset = Charset.defaultCharset();
            Intrinsics.checkNotNullExpressionValue(charsetDefaultCharset, "defaultCharset(...)");
            return EnvironmentReader.access$map(environmentReader, new String(bytes, charsetDefaultCharset));
        }
    }

    public EnvironmentReader(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f33916a = context;
        this.environment = LazyKt__LazyJVMKt.lazy(new a());
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0242  */
    /* JADX WARN: Code duplicated, block: B:102:0x0247  */
    /* JADX WARN: Code duplicated, block: B:113:0x026c  */
    /* JADX WARN: Code duplicated, block: B:115:0x026f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:117:0x0278  */
    /* JADX WARN: Code duplicated, block: B:120:0x0281  */
    /* JADX WARN: Code duplicated, block: B:121:0x0296  */
    /* JADX WARN: Code duplicated, block: B:124:0x029b  */
    /* JADX WARN: Code duplicated, block: B:125:0x029e  */
    /* JADX WARN: Code duplicated, block: B:127:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:129:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:137:0x02e7  */
    /* JADX WARN: Code duplicated, block: B:139:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:141:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:142:0x02f8  */
    /* JADX WARN: Code duplicated, block: B:144:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:146:0x0303  */
    /* JADX WARN: Code duplicated, block: B:147:0x0308  */
    /* JADX WARN: Code duplicated, block: B:150:0x0311  */
    /* JADX WARN: Code duplicated, block: B:151:0x0316  */
    /* JADX WARN: Code duplicated, block: B:154:0x031f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0328  */
    /* JADX WARN: Code duplicated, block: B:157:0x032b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:162:0x033d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0342  */
    /* JADX WARN: Code duplicated, block: B:166:0x034b  */
    /* JADX WARN: Code duplicated, block: B:168:0x034e  */
    /* JADX WARN: Code duplicated, block: B:171:0x035b  */
    /* JADX WARN: Code duplicated, block: B:174:0x035f  */
    /* JADX WARN: Code duplicated, block: B:176:0x0362  */
    /* JADX WARN: Code duplicated, block: B:179:0x036f  */
    /* JADX WARN: Code duplicated, block: B:182:0x0378  */
    /* JADX WARN: Code duplicated, block: B:183:0x03a6  */
    /* JADX WARN: Code duplicated, block: B:81:0x0204  */
    /* JADX WARN: Code duplicated, block: B:85:0x0210  */
    public static final GlobalConfig access$map(EnvironmentReader environmentReader, String str) {
        String asString;
        String asString2;
        Pair pair;
        String asString3;
        String asString4;
        Pair pair2;
        JsonObject asJsonObject;
        Pair pair3;
        String asString5;
        String asString6;
        Pair pair4;
        JsonObject asJsonObject2;
        String asString7;
        String str2;
        SoftTokenConfig softTokenConfig;
        JsonObject asJsonObject3;
        BioCatchConfig bioCatchConfig;
        BioCatchConfig bioCatchConfig2;
        JsonObject asJsonObject4;
        String asString8;
        long asLong;
        LexisNexisTmxConfig lexisNexisTmxConfig;
        JsonElement jsonElement;
        JsonElement jsonElement2;
        JsonElement jsonElement3;
        String asString9;
        JsonElement jsonElement4;
        String asString10;
        JsonElement jsonElement5;
        Boolean boolValueOf;
        String asString11;
        SoftTokenConfig softTokenConfig2;
        JsonElement jsonElement6;
        JsonObject asJsonObject5;
        JsonElement jsonElement7;
        JsonElement jsonElement8;
        JsonObject asJsonObject6;
        JsonElement jsonElement9;
        JsonObject asJsonObject7;
        JsonElement jsonElement10;
        JsonElement jsonElement11;
        JsonObject asJsonObject8;
        JsonElement jsonElement12;
        JsonObject asJsonObject9;
        JsonElement jsonElement13;
        JsonElement jsonElement14;
        JsonObject asJsonObject10;
        JsonElement jsonElement15;
        environmentReader.getClass();
        JsonObject asJsonObject11 = JsonParser.parseString(str).getAsJsonObject();
        JsonObject asJsonObject12 = asJsonObject11.getAsJsonObject(SqlContracts.TokenEntry.API);
        JsonObject asJsonObject13 = asJsonObject12.getAsJsonObject("host");
        JsonObject asJsonObject14 = asJsonObject12.getAsJsonObject("paths");
        JsonObject asJsonObject15 = asJsonObject11.getAsJsonObject("softToken");
        JsonObject asJsonObject16 = asJsonObject11.getAsJsonObject("bioCatch");
        if (asJsonObject16 == null) {
            asJsonObject16 = null;
        }
        JsonObject asJsonObject17 = asJsonObject11.getAsJsonObject("deviceManager");
        if (asJsonObject17 == null) {
            asJsonObject17 = null;
        }
        JsonObject asJsonObject18 = asJsonObject11.getAsJsonObject("lexis_nexis_tmx");
        if (asJsonObject18 == null) {
            asJsonObject18 = null;
        }
        AppBuildConfig appBuildConfig = AppBuildConfig.INSTANCE;
        String asString12 = asJsonObject13.get(appBuildConfig.getFLAVOR_environment()).getAsString();
        Intrinsics.checkNotNullExpressionValue(asString12, "getAsString(...)");
        Intrinsics.checkNotNull(asJsonObject14);
        JsonObject asJsonObject19 = asJsonObject14.getAsJsonObject(asJsonObject14.has(appBuildConfig.getFLAVOR_environment()) ? appBuildConfig.getFLAVOR_environment() : "default");
        Intrinsics.checkNotNullExpressionValue(asJsonObject19, "getAsJsonObject(...)");
        Set<Map.Entry<String, JsonElement>> setEntrySet = asJsonObject19.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "entrySet(...)");
        Map mapEmptyMap = q.emptyMap();
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            mapEmptyMap = q.plus(mapEmptyMap, TuplesKt.to(entry.getKey(), ((JsonElement) entry.getValue()).getAsString()));
        }
        JsonObject asJsonObject20 = asJsonObject11.getAsJsonObject("settings");
        Intrinsics.checkNotNullExpressionValue(asJsonObject20, "getAsJsonObject(...)");
        String asString13 = asJsonObject20.get("host").getAsJsonObject().get(AppBuildConfig.INSTANCE.getFLAVOR_environment()).getAsString();
        Set<Map.Entry<String, JsonElement>> setEntrySet2 = asJsonObject20.get("path").getAsJsonObject().entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet2, "entrySet(...)");
        Map mapEmptyMap2 = q.emptyMap();
        Iterator it2 = setEntrySet2.iterator();
        Map mapPlus = mapEmptyMap2;
        while (it2.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it2.next();
            Iterator it3 = it2;
            JsonElement jsonElement16 = ((JsonElement) entry2.getValue()).getAsJsonObject().get(AppBuildConfig.INSTANCE.getFLAVOR_environment());
            mapPlus = q.plus(mapPlus, TuplesKt.to(entry2.getKey(), asString13 + jsonElement16.getAsString()));
            it2 = it3;
        }
        JsonObject asJsonObject21 = asJsonObject11.getAsJsonObject("aem");
        Intrinsics.checkNotNullExpressionValue(asJsonObject21, "getAsJsonObject(...)");
        JsonObject asJsonObject22 = asJsonObject21.get("host").getAsJsonObject();
        AppBuildConfig appBuildConfig2 = AppBuildConfig.INSTANCE;
        String asString14 = asJsonObject22.get(appBuildConfig2.getFLAVOR_environment()).getAsString();
        Intrinsics.checkNotNullExpressionValue(asString14, "getAsString(...)");
        JsonObject asJsonObject23 = asJsonObject11.getAsJsonObject(VDVideoSelfieConfiguration.ONBOARDING);
        if (asJsonObject23 == null || (jsonElement14 = asJsonObject23.get("host")) == null || (asJsonObject10 = jsonElement14.getAsJsonObject()) == null || (jsonElement15 = asJsonObject10.get(appBuildConfig2.getFLAVOR_environment())) == null || (asString = jsonElement15.getAsString()) == null || !(!l.isBlank(asString))) {
            asString = null;
        }
        if (asJsonObject23 == null || (jsonElement12 = asJsonObject23.get("path")) == null || (asJsonObject9 = jsonElement12.getAsJsonObject()) == null || (jsonElement13 = asJsonObject9.get(appBuildConfig2.getFLAVOR_environment())) == null || (asString2 = jsonElement13.getAsString()) == null || !(!l.isBlank(asString2))) {
            asString2 = null;
        }
        Pair pair5 = (asString == null || asString2 == null) ? null : new Pair(asString, asString2);
        JsonObject asJsonObject24 = asJsonObject11.getAsJsonObject("gema");
        if (asJsonObject24 != null && (jsonElement11 = asJsonObject24.get("host")) != null && (asJsonObject8 = jsonElement11.getAsJsonObject()) != null) {
            pair = pair5;
            JsonElement jsonElement17 = asJsonObject8.get(appBuildConfig2.getFLAVOR_environment());
            if (jsonElement17 == null || (asString3 = jsonElement17.getAsString()) == null || !(!l.isBlank(asString3))) {
            }
            if (asJsonObject24 != null || (jsonElement9 = asJsonObject24.get("path")) == null || (asJsonObject7 = jsonElement9.getAsJsonObject()) == null || (jsonElement10 = asJsonObject7.get(appBuildConfig2.getFLAVOR_environment())) == null || (asString4 = jsonElement10.getAsString()) == null || !(!l.isBlank(asString4))) {
                asString4 = null;
            }
            if (asString3 != null || asString4 == null) {
                pair2 = null;
            } else {
                pair2 = new Pair(asString3, asString4);
            }
            asJsonObject = asJsonObject11.getAsJsonObject("single-sign-on");
            if (asJsonObject == null && (jsonElement8 = asJsonObject.get("host")) != null && (asJsonObject6 = jsonElement8.getAsJsonObject()) != null) {
                pair3 = pair2;
                JsonElement jsonElement18 = asJsonObject6.get(appBuildConfig2.getFLAVOR_environment());
                if (jsonElement18 == null || (asString5 = jsonElement18.getAsString()) == null || !(!l.isBlank(asString5))) {
                }
                if (asJsonObject != null || (jsonElement6 = asJsonObject.get("path")) == null || (asJsonObject5 = jsonElement6.getAsJsonObject()) == null || (jsonElement7 = asJsonObject5.get(appBuildConfig2.getFLAVOR_environment())) == null || (asString6 = jsonElement7.getAsString()) == null || !(!l.isBlank(asString6))) {
                    asString6 = null;
                }
                if (asString5 != null || asString6 == null) {
                    pair4 = null;
                } else {
                    pair4 = new Pair(asString5, asString6);
                }
                asJsonObject2 = asJsonObject11.getAsJsonObject("verishow");
                if (asJsonObject2 != null) {
                    asString7 = asJsonObject2.get("host").getAsJsonObject().get(appBuildConfig2.getFLAVOR_environment()).getAsString();
                } else {
                    asString7 = null;
                }
                if (asString7 == null) {
                    str2 = "";
                } else {
                    str2 = asString7;
                }
                if (asJsonObject15 != null) {
                    String asString15 = asJsonObject15.get("host").getAsJsonObject().get(appBuildConfig2.getFLAVOR_environment()).getAsString();
                    String asString16 = asJsonObject15.get("path").getAsString();
                    asString11 = asJsonObject15.get("appId").getAsString();
                    String strF = u.f(asString15, asString16);
                    if (asString11 != null || l.isBlank(asString11) || strF == null || l.isBlank(strF)) {
                        softTokenConfig2 = null;
                    } else {
                        Intrinsics.checkNotNull(asString11);
                        softTokenConfig2 = new SoftTokenConfig(strF, asString11);
                    }
                    softTokenConfig = softTokenConfig2;
                } else {
                    softTokenConfig = null;
                }
                if (asJsonObject16 != null) {
                    asJsonObject3 = asJsonObject16.getAsJsonObject(appBuildConfig2.getFLAVOR_environment());
                } else {
                    asJsonObject3 = null;
                }
                if (asJsonObject3 != null) {
                    jsonElement3 = asJsonObject3.get("wuptUrl");
                    if (jsonElement3 != null) {
                        asString9 = jsonElement3.getAsString();
                    } else {
                        asString9 = null;
                    }
                    jsonElement4 = asJsonObject3.get("cid");
                    if (jsonElement4 != null) {
                        asString10 = jsonElement4.getAsString();
                    } else {
                        asString10 = null;
                    }
                    jsonElement5 = asJsonObject3.get("enableHybridSolution");
                    if (jsonElement5 != null) {
                        boolValueOf = Boolean.valueOf(jsonElement5.getAsBoolean());
                    } else {
                        boolValueOf = null;
                    }
                    if (asString9 != null || asString10 == null || boolValueOf == null) {
                        bioCatchConfig2 = null;
                    } else {
                        bioCatchConfig = new BioCatchConfig(asString9, asString10, boolValueOf.booleanValue());
                    }
                    if (asJsonObject17 != null) {
                        asJsonObject4 = asJsonObject17.getAsJsonObject(appBuildConfig2.getFLAVOR_environment());
                    } else {
                        asJsonObject4 = null;
                    }
                    if (asJsonObject4 != null || (jsonElement2 = asJsonObject4.get(IAppSDKPlus.EXTRA_KEY_NONCE)) == null) {
                        asString8 = null;
                    } else {
                        asString8 = jsonElement2.getAsString();
                    }
                    String str3 = asString8 != null ? asString8 : "";
                    if (asJsonObject4 != null || (jsonElement = asJsonObject4.get("cloudProjectNumber")) == null) {
                        asLong = 0;
                    } else {
                        asLong = jsonElement.getAsLong();
                    }
                    DeviceCheckerPlayIntegrityRequestConfig deviceCheckerPlayIntegrityRequestConfig = new DeviceCheckerPlayIntegrityRequestConfig(str3, asLong);
                    if (asJsonObject18 != null) {
                        String fLAVOR_environment = appBuildConfig2.getFLAVOR_environment();
                        String asString17 = asJsonObject18.getAsJsonObject("org_id").get(fLAVOR_environment).getAsString();
                        Intrinsics.checkNotNullExpressionValue(asString17, "getAsString(...)");
                        String asString18 = asJsonObject18.getAsJsonObject("fingerprint_server").get(fLAVOR_environment).getAsString();
                        Intrinsics.checkNotNullExpressionValue(asString18, "getAsString(...)");
                        lexisNexisTmxConfig = new LexisNexisTmxConfig(asString17, asString18);
                    } else {
                        lexisNexisTmxConfig = null;
                    }
                    return new GlobalConfig(asString12, mapEmptyMap, mapPlus, asString14, pair, pair3, pair4, str2, softTokenConfig, bioCatchConfig2, deviceCheckerPlayIntegrityRequestConfig, lexisNexisTmxConfig);
                }
                bioCatchConfig = null;
                bioCatchConfig2 = bioCatchConfig;
                if (asJsonObject17 != null) {
                    asJsonObject4 = asJsonObject17.getAsJsonObject(appBuildConfig2.getFLAVOR_environment());
                } else {
                    asJsonObject4 = null;
                }
                if (asJsonObject4 != null) {
                    asString8 = null;
                } else {
                    asString8 = null;
                }
                if (asString8 != null) {
                }
                if (asJsonObject4 != null) {
                    asLong = 0;
                } else {
                    asLong = 0;
                }
                DeviceCheckerPlayIntegrityRequestConfig deviceCheckerPlayIntegrityRequestConfig2 = new DeviceCheckerPlayIntegrityRequestConfig(str3, asLong);
                if (asJsonObject18 != null) {
                    String fLAVOR_environment2 = appBuildConfig2.getFLAVOR_environment();
                    String asString19 = asJsonObject18.getAsJsonObject("org_id").get(fLAVOR_environment2).getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString19, "getAsString(...)");
                    String asString110 = asJsonObject18.getAsJsonObject("fingerprint_server").get(fLAVOR_environment2).getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString110, "getAsString(...)");
                    lexisNexisTmxConfig = new LexisNexisTmxConfig(asString19, asString110);
                } else {
                    lexisNexisTmxConfig = null;
                }
                return new GlobalConfig(asString12, mapEmptyMap, mapPlus, asString14, pair, pair3, pair4, str2, softTokenConfig, bioCatchConfig2, deviceCheckerPlayIntegrityRequestConfig2, lexisNexisTmxConfig);
            }
            pair3 = pair2;
            asString5 = null;
            if (asJsonObject != null) {
                asString6 = null;
            } else {
                asString6 = null;
            }
            if (asString5 != null) {
                pair4 = null;
            } else {
                pair4 = null;
            }
            asJsonObject2 = asJsonObject11.getAsJsonObject("verishow");
            if (asJsonObject2 != null) {
                asString7 = asJsonObject2.get("host").getAsJsonObject().get(appBuildConfig2.getFLAVOR_environment()).getAsString();
            } else {
                asString7 = null;
            }
            if (asString7 == null) {
                str2 = "";
            } else {
                str2 = asString7;
            }
            if (asJsonObject15 != null) {
                String asString111 = asJsonObject15.get("host").getAsJsonObject().get(appBuildConfig2.getFLAVOR_environment()).getAsString();
                String asString112 = asJsonObject15.get("path").getAsString();
                asString11 = asJsonObject15.get("appId").getAsString();
                String strF2 = u.f(asString111, asString112);
                if (asString11 != null) {
                    softTokenConfig2 = null;
                } else {
                    softTokenConfig2 = null;
                }
                softTokenConfig = softTokenConfig2;
            } else {
                softTokenConfig = null;
            }
            if (asJsonObject16 != null) {
                asJsonObject3 = asJsonObject16.getAsJsonObject(appBuildConfig2.getFLAVOR_environment());
            } else {
                asJsonObject3 = null;
            }
            if (asJsonObject3 != null) {
                jsonElement3 = asJsonObject3.get("wuptUrl");
                if (jsonElement3 != null) {
                    asString9 = jsonElement3.getAsString();
                } else {
                    asString9 = null;
                }
                jsonElement4 = asJsonObject3.get("cid");
                if (jsonElement4 != null) {
                    asString10 = jsonElement4.getAsString();
                } else {
                    asString10 = null;
                }
                jsonElement5 = asJsonObject3.get("enableHybridSolution");
                if (jsonElement5 != null) {
                    boolValueOf = Boolean.valueOf(jsonElement5.getAsBoolean());
                } else {
                    boolValueOf = null;
                }
                if (asString9 != null) {
                }
                bioCatchConfig2 = null;
                if (asJsonObject17 != null) {
                    asJsonObject4 = asJsonObject17.getAsJsonObject(appBuildConfig2.getFLAVOR_environment());
                } else {
                    asJsonObject4 = null;
                }
                if (asJsonObject4 != null) {
                    asString8 = null;
                } else {
                    asString8 = null;
                }
                if (asString8 != null) {
                }
                if (asJsonObject4 != null) {
                    asLong = 0;
                } else {
                    asLong = 0;
                }
                DeviceCheckerPlayIntegrityRequestConfig deviceCheckerPlayIntegrityRequestConfig3 = new DeviceCheckerPlayIntegrityRequestConfig(str3, asLong);
                if (asJsonObject18 != null) {
                    String fLAVOR_environment3 = appBuildConfig2.getFLAVOR_environment();
                    String asString113 = asJsonObject18.getAsJsonObject("org_id").get(fLAVOR_environment3).getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString113, "getAsString(...)");
                    String asString114 = asJsonObject18.getAsJsonObject("fingerprint_server").get(fLAVOR_environment3).getAsString();
                    Intrinsics.checkNotNullExpressionValue(asString114, "getAsString(...)");
                    lexisNexisTmxConfig = new LexisNexisTmxConfig(asString113, asString114);
                } else {
                    lexisNexisTmxConfig = null;
                }
                return new GlobalConfig(asString12, mapEmptyMap, mapPlus, asString14, pair, pair3, pair4, str2, softTokenConfig, bioCatchConfig2, deviceCheckerPlayIntegrityRequestConfig3, lexisNexisTmxConfig);
            }
            bioCatchConfig = null;
            bioCatchConfig2 = bioCatchConfig;
            if (asJsonObject17 != null) {
                asJsonObject4 = asJsonObject17.getAsJsonObject(appBuildConfig2.getFLAVOR_environment());
            } else {
                asJsonObject4 = null;
            }
            if (asJsonObject4 != null) {
                asString8 = null;
            } else {
                asString8 = null;
            }
            if (asString8 != null) {
            }
            if (asJsonObject4 != null) {
                asLong = 0;
            } else {
                asLong = 0;
            }
            DeviceCheckerPlayIntegrityRequestConfig deviceCheckerPlayIntegrityRequestConfig4 = new DeviceCheckerPlayIntegrityRequestConfig(str3, asLong);
            if (asJsonObject18 != null) {
                String fLAVOR_environment4 = appBuildConfig2.getFLAVOR_environment();
                String asString115 = asJsonObject18.getAsJsonObject("org_id").get(fLAVOR_environment4).getAsString();
                Intrinsics.checkNotNullExpressionValue(asString115, "getAsString(...)");
                String asString116 = asJsonObject18.getAsJsonObject("fingerprint_server").get(fLAVOR_environment4).getAsString();
                Intrinsics.checkNotNullExpressionValue(asString116, "getAsString(...)");
                lexisNexisTmxConfig = new LexisNexisTmxConfig(asString115, asString116);
            } else {
                lexisNexisTmxConfig = null;
            }
            return new GlobalConfig(asString12, mapEmptyMap, mapPlus, asString14, pair, pair3, pair4, str2, softTokenConfig, bioCatchConfig2, deviceCheckerPlayIntegrityRequestConfig4, lexisNexisTmxConfig);
        }
        pair = pair5;
        asString3 = null;
        if (asJsonObject24 != null) {
            asString4 = null;
        } else {
            asString4 = null;
        }
        if (asString3 != null) {
            pair2 = null;
        } else {
            pair2 = null;
        }
        asJsonObject = asJsonObject11.getAsJsonObject("single-sign-on");
        if (asJsonObject == null) {
            pair3 = pair2;
            asString5 = null;
        } else {
            pair3 = pair2;
            asString5 = null;
        }
        if (asJsonObject != null) {
            asString6 = null;
        } else {
            asString6 = null;
        }
        if (asString5 != null) {
            pair4 = null;
        } else {
            pair4 = null;
        }
        asJsonObject2 = asJsonObject11.getAsJsonObject("verishow");
        if (asJsonObject2 != null) {
            asString7 = asJsonObject2.get("host").getAsJsonObject().get(appBuildConfig2.getFLAVOR_environment()).getAsString();
        } else {
            asString7 = null;
        }
        if (asString7 == null) {
            str2 = "";
        } else {
            str2 = asString7;
        }
        if (asJsonObject15 != null) {
            String asString117 = asJsonObject15.get("host").getAsJsonObject().get(appBuildConfig2.getFLAVOR_environment()).getAsString();
            String asString118 = asJsonObject15.get("path").getAsString();
            asString11 = asJsonObject15.get("appId").getAsString();
            String strF3 = u.f(asString117, asString118);
            if (asString11 != null) {
                softTokenConfig2 = null;
            } else {
                softTokenConfig2 = null;
            }
            softTokenConfig = softTokenConfig2;
        } else {
            softTokenConfig = null;
        }
        if (asJsonObject16 != null) {
            asJsonObject3 = asJsonObject16.getAsJsonObject(appBuildConfig2.getFLAVOR_environment());
        } else {
            asJsonObject3 = null;
        }
        if (asJsonObject3 != null) {
            jsonElement3 = asJsonObject3.get("wuptUrl");
            if (jsonElement3 != null) {
                asString9 = jsonElement3.getAsString();
            } else {
                asString9 = null;
            }
            jsonElement4 = asJsonObject3.get("cid");
            if (jsonElement4 != null) {
                asString10 = jsonElement4.getAsString();
            } else {
                asString10 = null;
            }
            jsonElement5 = asJsonObject3.get("enableHybridSolution");
            if (jsonElement5 != null) {
                boolValueOf = Boolean.valueOf(jsonElement5.getAsBoolean());
            } else {
                boolValueOf = null;
            }
            if (asString9 != null) {
            }
            bioCatchConfig2 = null;
            if (asJsonObject17 != null) {
                asJsonObject4 = asJsonObject17.getAsJsonObject(appBuildConfig2.getFLAVOR_environment());
            } else {
                asJsonObject4 = null;
            }
            if (asJsonObject4 != null) {
                asString8 = null;
            } else {
                asString8 = null;
            }
            if (asString8 != null) {
            }
            if (asJsonObject4 != null) {
                asLong = 0;
            } else {
                asLong = 0;
            }
            DeviceCheckerPlayIntegrityRequestConfig deviceCheckerPlayIntegrityRequestConfig5 = new DeviceCheckerPlayIntegrityRequestConfig(str3, asLong);
            if (asJsonObject18 != null) {
                String fLAVOR_environment5 = appBuildConfig2.getFLAVOR_environment();
                String asString119 = asJsonObject18.getAsJsonObject("org_id").get(fLAVOR_environment5).getAsString();
                Intrinsics.checkNotNullExpressionValue(asString119, "getAsString(...)");
                String asString1110 = asJsonObject18.getAsJsonObject("fingerprint_server").get(fLAVOR_environment5).getAsString();
                Intrinsics.checkNotNullExpressionValue(asString1110, "getAsString(...)");
                lexisNexisTmxConfig = new LexisNexisTmxConfig(asString119, asString1110);
            } else {
                lexisNexisTmxConfig = null;
            }
            return new GlobalConfig(asString12, mapEmptyMap, mapPlus, asString14, pair, pair3, pair4, str2, softTokenConfig, bioCatchConfig2, deviceCheckerPlayIntegrityRequestConfig5, lexisNexisTmxConfig);
        }
        bioCatchConfig = null;
        bioCatchConfig2 = bioCatchConfig;
        if (asJsonObject17 != null) {
            asJsonObject4 = asJsonObject17.getAsJsonObject(appBuildConfig2.getFLAVOR_environment());
        } else {
            asJsonObject4 = null;
        }
        if (asJsonObject4 != null) {
            asString8 = null;
        } else {
            asString8 = null;
        }
        if (asString8 != null) {
        }
        if (asJsonObject4 != null) {
            asLong = 0;
        } else {
            asLong = 0;
        }
        DeviceCheckerPlayIntegrityRequestConfig deviceCheckerPlayIntegrityRequestConfig6 = new DeviceCheckerPlayIntegrityRequestConfig(str3, asLong);
        if (asJsonObject18 != null) {
            String fLAVOR_environment6 = appBuildConfig2.getFLAVOR_environment();
            String asString1111 = asJsonObject18.getAsJsonObject("org_id").get(fLAVOR_environment6).getAsString();
            Intrinsics.checkNotNullExpressionValue(asString1111, "getAsString(...)");
            String asString1112 = asJsonObject18.getAsJsonObject("fingerprint_server").get(fLAVOR_environment6).getAsString();
            Intrinsics.checkNotNullExpressionValue(asString1112, "getAsString(...)");
            lexisNexisTmxConfig = new LexisNexisTmxConfig(asString1111, asString1112);
        } else {
            lexisNexisTmxConfig = null;
        }
        return new GlobalConfig(asString12, mapEmptyMap, mapPlus, asString14, pair, pair3, pair4, str2, softTokenConfig, bioCatchConfig2, deviceCheckerPlayIntegrityRequestConfig6, lexisNexisTmxConfig);
    }

    @NotNull
    public final GlobalConfig getEnvironment() {
        return (GlobalConfig) this.environment.getValue();
    }
}
