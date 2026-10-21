package com.bbva.glomoconfig;

import com.bbva.glomoconfig.biocatch.BioCatchConfig;
import com.bbva.glomoconfig.lexisNexisTmx.LexisNexisTmxConfig;
import com.bbva.glomoconfig.login.DeviceCheckerPlayIntegrityRequestConfig;
import com.bbva.glomoconfig.softtoken.SoftTokenConfig;
import com.dasnano.vdvideoselfiecapture.config.VDVideoSelfieConfiguration;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GlobalConfig.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001Bµ\u0001\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0015\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0014\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010 \u0012\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010 \u0012\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010 \u0012\u0006\u0010.\u001a\u00020\u0002\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000105\u0012\u0006\u0010?\u001a\u00020\u000e\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010@¢\u0006\u0004\bF\u0010GJ\u000e\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002J\b\u0010\b\u001a\u0004\u0018\u00010\u0002J\b\u0010\t\u001a\u0004\u0018\u00010\u0002J\b\u0010\n\u001a\u0004\u0018\u00010\u0002J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002J\b\u0010\f\u001a\u0004\u0018\u00010\u0002J\b\u0010\r\u001a\u0004\u0018\u00010\u0002J\u0006\u0010\u000f\u001a\u00020\u000eR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R%\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R%\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R%\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b)\u0010\"\u001a\u0004\b*\u0010$R\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b,\u0010\u0011\u001a\u0004\b-\u0010\u0013R\u0019\u00104\u001a\u0004\u0018\u00010/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u0010:\u001a\u0004\u0018\u0001058\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0017\u0010?\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u0019\u0010E\u001a\u0004\u0018\u00010@8\u0006¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lcom/bbva/glomoconfig/GlobalConfig;", "", "", "key", "completeUrl", "pathName", "namedPath", "settings", "onboardingHost", "getGemaHost", "getGemaPath", "getSingleSingOnHost", "getSingleSingOnPath", "onboardingUrl", "Lcom/bbva/glomoconfig/login/DeviceCheckerPlayIntegrityRequestConfig;", "deviceManagerConfig", "a", "Ljava/lang/String;", "getHost", "()Ljava/lang/String;", "host", "", "b", "Ljava/util/Map;", "getPaths", "()Ljava/util/Map;", "paths", "c", "getSettings", "d", "getAem", "aem", "Lkotlin/Pair;", "e", "Lkotlin/Pair;", "getOnboarding", "()Lkotlin/Pair;", VDVideoSelfieConfiguration.ONBOARDING, "f", "getGema", "gema", "g", "getSingle", "single", "h", "getVerishow", "verishow", "Lcom/bbva/glomoconfig/softtoken/SoftTokenConfig;", "i", "Lcom/bbva/glomoconfig/softtoken/SoftTokenConfig;", "getSoftTokenConfig", "()Lcom/bbva/glomoconfig/softtoken/SoftTokenConfig;", "softTokenConfig", "Lcom/bbva/glomoconfig/biocatch/BioCatchConfig;", "j", "Lcom/bbva/glomoconfig/biocatch/BioCatchConfig;", "getBioCatch", "()Lcom/bbva/glomoconfig/biocatch/BioCatchConfig;", "bioCatch", "k", "Lcom/bbva/glomoconfig/login/DeviceCheckerPlayIntegrityRequestConfig;", "getDeviceManager", "()Lcom/bbva/glomoconfig/login/DeviceCheckerPlayIntegrityRequestConfig;", "deviceManager", "Lcom/bbva/glomoconfig/lexisNexisTmx/LexisNexisTmxConfig;", "l", "Lcom/bbva/glomoconfig/lexisNexisTmx/LexisNexisTmxConfig;", "getLexisNexisTmxConfig", "()Lcom/bbva/glomoconfig/lexisNexisTmx/LexisNexisTmxConfig;", "lexisNexisTmxConfig", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lkotlin/Pair;Lkotlin/Pair;Lkotlin/Pair;Ljava/lang/String;Lcom/bbva/glomoconfig/softtoken/SoftTokenConfig;Lcom/bbva/glomoconfig/biocatch/BioCatchConfig;Lcom/bbva/glomoconfig/login/DeviceCheckerPlayIntegrityRequestConfig;Lcom/bbva/glomoconfig/lexisNexisTmx/LexisNexisTmxConfig;)V", "gl-config_mexicoRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nGlobalConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GlobalConfig.kt\ncom/bbva/glomoconfig/GlobalConfig\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,64:1\n1#2:65\n*E\n"})
public final class GlobalConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String host;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> paths;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> settings;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String aem;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Pair<String, String> onboarding;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Pair<String, String> gema;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final Pair<String, String> single;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String verishow;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final SoftTokenConfig softTokenConfig;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final BioCatchConfig bioCatch;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final DeviceCheckerPlayIntegrityRequestConfig deviceManager;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final LexisNexisTmxConfig lexisNexisTmxConfig;

    public GlobalConfig(@NotNull String host, @NotNull Map<String, String> paths, @NotNull Map<String, String> settings, @NotNull String aem, @Nullable Pair<String, String> pair, @Nullable Pair<String, String> pair2, @Nullable Pair<String, String> pair3, @NotNull String verishow, @Nullable SoftTokenConfig softTokenConfig, @Nullable BioCatchConfig bioCatchConfig, @NotNull DeviceCheckerPlayIntegrityRequestConfig deviceManager, @Nullable LexisNexisTmxConfig lexisNexisTmxConfig) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(paths, "paths");
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(aem, "aem");
        Intrinsics.checkNotNullParameter(verishow, "verishow");
        Intrinsics.checkNotNullParameter(deviceManager, "deviceManager");
        this.host = host;
        this.paths = paths;
        this.settings = settings;
        this.aem = aem;
        this.onboarding = pair;
        this.gema = pair2;
        this.single = pair3;
        this.verishow = verishow;
        this.softTokenConfig = softTokenConfig;
        this.bioCatch = bioCatchConfig;
        this.deviceManager = deviceManager;
        this.lexisNexisTmxConfig = lexisNexisTmxConfig;
    }

    @NotNull
    public final String completeUrl(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        String str = this.paths.get(key);
        if (str == null) {
            str = "";
        }
        return this.host + ((Object) str);
    }

    @NotNull
    /* JADX INFO: renamed from: deviceManagerConfig, reason: from getter */
    public final DeviceCheckerPlayIntegrityRequestConfig getDeviceManager() {
        return this.deviceManager;
    }

    @NotNull
    public final String getAem() {
        return this.aem;
    }

    @Nullable
    public final BioCatchConfig getBioCatch() {
        return this.bioCatch;
    }

    @NotNull
    public final DeviceCheckerPlayIntegrityRequestConfig getDeviceManager() {
        return this.deviceManager;
    }

    @Nullable
    public final Pair<String, String> getGema() {
        return this.gema;
    }

    @Nullable
    public final String getGemaHost() {
        Pair<String, String> pair = this.gema;
        if (pair != null) {
            return pair.getFirst();
        }
        return null;
    }

    @Nullable
    public final String getGemaPath() {
        Pair<String, String> pair = this.gema;
        if (pair != null) {
            return pair.getSecond();
        }
        return null;
    }

    @NotNull
    public final String getHost() {
        return this.host;
    }

    @Nullable
    public final LexisNexisTmxConfig getLexisNexisTmxConfig() {
        return this.lexisNexisTmxConfig;
    }

    @Nullable
    public final Pair<String, String> getOnboarding() {
        return this.onboarding;
    }

    @NotNull
    public final Map<String, String> getPaths() {
        return this.paths;
    }

    @NotNull
    public final Map<String, String> getSettings() {
        return this.settings;
    }

    @Nullable
    public final Pair<String, String> getSingle() {
        return this.single;
    }

    @Nullable
    public final String getSingleSingOnHost() {
        Pair<String, String> pair = this.single;
        if (pair != null) {
            return pair.getFirst();
        }
        return null;
    }

    @Nullable
    public final String getSingleSingOnPath() {
        Pair<String, String> pair = this.single;
        if (pair != null) {
            return pair.getSecond();
        }
        return null;
    }

    @Nullable
    public final SoftTokenConfig getSoftTokenConfig() {
        return this.softTokenConfig;
    }

    @NotNull
    public final String getVerishow() {
        return this.verishow;
    }

    @NotNull
    public final String namedPath(@NotNull String pathName) {
        Intrinsics.checkNotNullParameter(pathName, "pathName");
        String str = this.paths.get(pathName);
        return str == null ? "" : str;
    }

    @Nullable
    public final String onboardingHost() {
        Pair<String, String> pair = this.onboarding;
        if (pair != null) {
            return pair.getFirst();
        }
        return null;
    }

    @Nullable
    public final String onboardingUrl() {
        Pair<String, String> pair = this.onboarding;
        if (pair == null) {
            return null;
        }
        String first = pair.getFirst();
        String second = pair.getSecond();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) first);
        sb2.append((Object) second);
        return sb2.toString();
    }

    @NotNull
    public final String settings(@NotNull String pathName) {
        Intrinsics.checkNotNullParameter(pathName, "pathName");
        String str = this.settings.get(pathName);
        return str == null ? "" : str;
    }

    public /* synthetic */ GlobalConfig(String str, Map map, Map map2, String str2, Pair pair, Pair pair2, Pair pair3, String str3, SoftTokenConfig softTokenConfig, BioCatchConfig bioCatchConfig, DeviceCheckerPlayIntegrityRequestConfig deviceCheckerPlayIntegrityRequestConfig, LexisNexisTmxConfig lexisNexisTmxConfig, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, map2, str2, pair, pair2, pair3, str3, (i10 & 256) != 0 ? null : softTokenConfig, (i10 & 512) != 0 ? null : bioCatchConfig, deviceCheckerPlayIntegrityRequestConfig, (i10 & 2048) != 0 ? null : lexisNexisTmxConfig);
    }
}
