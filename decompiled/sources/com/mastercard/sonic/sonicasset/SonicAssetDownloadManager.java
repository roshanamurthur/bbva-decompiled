package com.mastercard.sonic.sonicasset;

import android.content.Context;
import com.mastercard.sonic.BuildConfig;
import com.mastercard.sonic.model.Analytics;
import com.mastercard.sonic.model.CueConfig;
import com.mastercard.sonic.model.VersionConfig;
import com.mastercard.sonic.network.NetworkManager;
import com.mastercard.sonic.utils.FileDirUtils;
import com.mastercard.sonic.utils.SharedPreferenceUtils;
import com.veridas.contextualdata.ContextualDataConstants;
import java.io.File;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.GlobalScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: compiled from: SonicAssetDownloadManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\bR\"\u0010\u0013\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0017\u001a\u00020\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010\"\u0004\b\u0016\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/mastercard/sonic/sonicasset/SonicAssetDownloadManager;", "", "", ContextualDataConstants.CD_SDK_VERSION, "clientCue", "", "Lcom/mastercard/sonic/model/VersionConfig;", "versionConfigList", "", "checkForDownload", "isHapticsEnabled", "", "downloadAssetsInParallel", "i", "Z", "getAssetDownloadCompleted$sonic_sdk_release", "()Z", "setAssetDownloadCompleted$sonic_sdk_release", "(Z)V", "assetDownloadCompleted", "j", "isValidCueName$sonic_sdk_release", "setValidCueName$sonic_sdk_release", "isValidCueName", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
public final class SonicAssetDownloadManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f51542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f51543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final String f51544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final String f51545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f51546e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final String f51547f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public final String f51548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public final String f51549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public volatile boolean assetDownloadCompleted;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public boolean isValidCueName;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public JSONObject f51552k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    public String f51553l;
    public String m;

    /* JADX INFO: compiled from: SonicAssetDownloadManager.kt */
    @DebugMetadata(c = "com.mastercard.sonic.sonicasset.SonicAssetDownloadManager$downloadAssetsInParallel$1", f = "SonicAssetDownloadManager.kt", i = {1, 2, 2, 3, 3, 3}, l = {114, 116, 118, 120}, m = "invokeSuspend", n = {"animationDownloaded", "animationDownloaded", "soundDownloaded", "animationDownloaded", "soundDownloaded", "playConfigDownloaded"}, s = {"Z$0", "Z$0", "Z$1", "Z$0", "Z$1", "Z$2"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ String E0;
        public final /* synthetic */ File F0;
        public final /* synthetic */ SonicAssetDownloadManager G0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public boolean f51554p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public boolean f51555q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public boolean f51556r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f51557s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public final /* synthetic */ String f51558t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public final /* synthetic */ File f51559u0;
        public final /* synthetic */ String v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public final /* synthetic */ File f51560w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public final /* synthetic */ String f51561x0;

        /* JADX INFO: renamed from: y0, reason: collision with root package name */
        public final /* synthetic */ File f51562y0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, File file, String str2, File file2, String str3, File file3, String str4, File file4, SonicAssetDownloadManager sonicAssetDownloadManager, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f51558t0 = str;
            this.f51559u0 = file;
            this.v0 = str2;
            this.f51560w0 = file2;
            this.f51561x0 = str3;
            this.f51562y0 = file3;
            this.E0 = str4;
            this.F0 = file4;
            this.G0 = sonicAssetDownloadManager;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new a(this.f51558t0, this.f51559u0, this.v0, this.f51560w0, this.f51561x0, this.f51562y0, this.E0, this.F0, this.G0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x007a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:23:0x007b  */
        /* JADX WARN: Code duplicated, block: B:26:0x0099 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:27:0x009a  */
        /* JADX WARN: Code duplicated, block: B:34:0x00bd  */
        /* JADX WARN: Code duplicated, block: B:37:0x00cc  */
        /* JADX WARN: Code duplicated, block: B:40:0x00dc  */
        /* JADX WARN: Instruction removed from duplicated block: B:34:0x00bd, please report this as an issue */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean zBooleanValue;
            boolean zBooleanValue2;
            Object objDownloadFile;
            boolean z10;
            boolean z11;
            boolean zBooleanValue3;
            Object objDownloadFile2;
            boolean z12;
            boolean z13;
            SonicAssetDownloadManager sonicAssetDownloadManager;
            String str;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f51557s0;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i10 == 2) {
                    zBooleanValue = this.f51554p0;
                    ResultKt.throwOnFailure(obj);
                    zBooleanValue2 = ((Boolean) obj).booleanValue();
                    NetworkManager networkManager = NetworkManager.INSTANCE;
                    this.f51554p0 = zBooleanValue;
                    this.f51555q0 = zBooleanValue2;
                    this.f51557s0 = 3;
                    objDownloadFile = networkManager.downloadFile(this.f51561x0, this.f51562y0, this);
                    if (objDownloadFile == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    boolean z14 = zBooleanValue;
                    z10 = zBooleanValue2;
                    obj = objDownloadFile;
                    z11 = z14;
                    zBooleanValue3 = ((Boolean) obj).booleanValue();
                    NetworkManager networkManager2 = NetworkManager.INSTANCE;
                    this.f51554p0 = z11;
                    this.f51555q0 = z10;
                    this.f51556r0 = zBooleanValue3;
                    this.f51557s0 = 4;
                    objDownloadFile2 = networkManager2.downloadFile(this.E0, this.F0, this);
                    if (objDownloadFile2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z12 = zBooleanValue3;
                    obj = objDownloadFile2;
                    z13 = z11;
                } else if (i10 == 3) {
                    z10 = this.f51555q0;
                    z11 = this.f51554p0;
                    ResultKt.throwOnFailure(obj);
                    zBooleanValue3 = ((Boolean) obj).booleanValue();
                    NetworkManager networkManager3 = NetworkManager.INSTANCE;
                    this.f51554p0 = z11;
                    this.f51555q0 = z10;
                    this.f51556r0 = zBooleanValue3;
                    this.f51557s0 = 4;
                    objDownloadFile2 = networkManager3.downloadFile(this.E0, this.F0, this);
                    if (objDownloadFile2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    z12 = zBooleanValue3;
                    obj = objDownloadFile2;
                    z13 = z11;
                } else {
                    if (i10 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z12 = this.f51556r0;
                    z10 = this.f51555q0;
                    z13 = this.f51554p0;
                    ResultKt.throwOnFailure(obj);
                }
                ((Boolean) obj).booleanValue();
                if (z13 && z10 && z12) {
                    FileDirUtils fileDirUtils = FileDirUtils.INSTANCE;
                    sonicAssetDownloadManager = this.G0;
                    sonicAssetDownloadManager.setAssetDownloadCompleted$sonic_sdk_release(fileDirUtils.moveFromTempToActive(sonicAssetDownloadManager.f51542a));
                    if (sonicAssetDownloadManager.getAssetDownloadCompleted()) {
                        String strOptString = sonicAssetDownloadManager.f51552k.optString("version", "");
                        String str2 = strOptString != null ? strOptString : "";
                        SharedPreferenceUtils sharedPreferenceUtils = new SharedPreferenceUtils(sonicAssetDownloadManager.f51542a);
                        str = sonicAssetDownloadManager.m;
                        if (str == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("sonicCue");
                            str = null;
                        }
                        sharedPreferenceUtils.setLocalAnimationVersion(str2, str);
                    }
                }
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            NetworkManager networkManager4 = NetworkManager.INSTANCE;
            this.f51557s0 = 1;
            obj = networkManager4.downloadFile(this.f51558t0, this.f51559u0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            zBooleanValue = ((Boolean) obj).booleanValue();
            NetworkManager networkManager5 = NetworkManager.INSTANCE;
            this.f51554p0 = zBooleanValue;
            this.f51557s0 = 2;
            obj = networkManager5.downloadFile(this.v0, this.f51560w0, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            zBooleanValue2 = ((Boolean) obj).booleanValue();
            NetworkManager networkManager6 = NetworkManager.INSTANCE;
            this.f51554p0 = zBooleanValue;
            this.f51555q0 = zBooleanValue2;
            this.f51557s0 = 3;
            objDownloadFile = networkManager6.downloadFile(this.f51561x0, this.f51562y0, this);
            if (objDownloadFile == coroutine_suspended) {
                return coroutine_suspended;
            }
            boolean z15 = zBooleanValue;
            z10 = zBooleanValue2;
            obj = objDownloadFile;
            z11 = z15;
            zBooleanValue3 = ((Boolean) obj).booleanValue();
            NetworkManager networkManager7 = NetworkManager.INSTANCE;
            this.f51554p0 = z11;
            this.f51555q0 = z10;
            this.f51556r0 = zBooleanValue3;
            this.f51557s0 = 4;
            objDownloadFile2 = networkManager7.downloadFile(this.E0, this.F0, this);
            if (objDownloadFile2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            z12 = zBooleanValue3;
            obj = objDownloadFile2;
            z13 = z11;
            ((Boolean) obj).booleanValue();
            if (z13) {
                FileDirUtils fileDirUtils2 = FileDirUtils.INSTANCE;
                sonicAssetDownloadManager = this.G0;
                sonicAssetDownloadManager.setAssetDownloadCompleted$sonic_sdk_release(fileDirUtils2.moveFromTempToActive(sonicAssetDownloadManager.f51542a));
                if (sonicAssetDownloadManager.getAssetDownloadCompleted()) {
                    String strOptString2 = sonicAssetDownloadManager.f51552k.optString("version", "");
                    if (strOptString2 != null) {
                    }
                    SharedPreferenceUtils sharedPreferenceUtils2 = new SharedPreferenceUtils(sonicAssetDownloadManager.f51542a);
                    str = sonicAssetDownloadManager.m;
                    if (str == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("sonicCue");
                        str = null;
                    }
                    sharedPreferenceUtils2.setLocalAnimationVersion(str2, str);
                }
            }
            return Unit.INSTANCE;
        }
    }

    public SonicAssetDownloadManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51542a = context;
        this.f51543b = BuildConfig.REMOTE_CONFIG_URL;
        this.f51544c = FileDirUtils.SONIC_SDK_ASSET_ANIMATION_FILENAME;
        this.f51545d = FileDirUtils.SONIC_SDK_ASSET_SOUND_FILENAME;
        this.f51546e = FileDirUtils.SONIC_SDK_ASSET_PLAY_CONFIG_FILENAME;
        this.f51547f = "/";
        this.f51548g = FileDirUtils.SONIC_SDK_ASSETS_PATH;
        this.f51549h = FileDirUtils.SONIC_ASSET_HAPTICS_FILENAME;
        this.f51552k = new JSONObject();
        this.f51553l = "";
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0078  */
    public final boolean checkForDownload(@NotNull String sdkVersion, @NotNull String clientCue, @NotNull List<VersionConfig> versionConfigList) {
        boolean z10;
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(clientCue, "clientCue");
        Intrinsics.checkNotNullParameter(versionConfigList, "versionConfigList");
        this.m = clientCue;
        if (versionConfigList.isEmpty()) {
            return false;
        }
        for (VersionConfig versionConfig : versionConfigList) {
            if (versionConfig.getSdkVersionList().contains(sdkVersion)) {
                this.isValidCueName = versionConfig.getCuesMap().keySet().contains(clientCue);
                CueConfig cueConfig = versionConfig.getCuesMap().get(clientCue);
                JSONObject jSONObject = cueConfig != null ? cueConfig.getJSONObject() : null;
                Context context = this.f51542a;
                String existingAnimationVersion = new SharedPreferenceUtils(context).getExistingAnimationVersion(clientCue);
                if (jSONObject != null) {
                    this.f51552k = jSONObject;
                    if (existingAnimationVersion.length() != 0 && Intrinsics.areEqual(existingAnimationVersion, jSONObject.getString("version"))) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                } else {
                    z10 = false;
                }
                String string = jSONObject != null ? jSONObject.getString(this.f51548g) : null;
                if (string == null) {
                    string = "";
                }
                this.f51553l = string;
                Analytics analytics = versionConfig.getAnalytics();
                boolean enable = analytics.getEnable();
                String frequency = analytics.getFrequency();
                String url = analytics.getUrl();
                SharedPreferenceUtils sharedPreferenceUtils = new SharedPreferenceUtils(context);
                sharedPreferenceUtils.setIsAnalyticsEnabled(enable);
                sharedPreferenceUtils.setAnalyticsFrequency(frequency.charAt(0));
                sharedPreferenceUtils.setAnalyticsUrl(url);
                return z10;
            }
        }
        return false;
    }

    public final void downloadAssetsInParallel(boolean isHapticsEnabled) throws IOException {
        String str = this.f51553l;
        StringBuilder sb2 = new StringBuilder();
        String str2 = this.f51543b;
        sb2.append(str2);
        sb2.append(str);
        String str3 = this.f51547f;
        sb2.append(str3);
        String str4 = this.f51544c;
        sb2.append(str4);
        String string = sb2.toString();
        String str5 = this.f51553l;
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str2);
        sb3.append(str5);
        sb3.append(str3);
        String str6 = this.f51545d;
        sb3.append(str6);
        String string2 = sb3.toString();
        String str7 = this.f51553l;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str2);
        sb4.append(str7);
        sb4.append(str3);
        String str8 = this.f51546e;
        sb4.append(str8);
        String string3 = sb4.toString();
        String str9 = this.f51553l;
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str2);
        sb5.append(str9);
        sb5.append(str3);
        String str10 = this.f51549h;
        sb5.append(str10);
        String string4 = sb5.toString();
        String sonicDirAssetTempPath = FileDirUtils.INSTANCE.getSonicDirAssetTempPath(this.f51542a);
        File file = new File(sonicDirAssetTempPath, str4);
        file.createNewFile();
        File file2 = new File(sonicDirAssetTempPath, str6);
        file2.createNewFile();
        File file3 = new File(sonicDirAssetTempPath, str8);
        file3.createNewFile();
        File file4 = new File(sonicDirAssetTempPath, str10);
        file4.createNewFile();
        BuildersKt__Builders_commonKt.launch$default(GlobalScope.INSTANCE, null, null, new a(string, file, string2, file2, string3, file3, string4, file4, this, null), 3, null);
    }

    /* JADX INFO: renamed from: getAssetDownloadCompleted$sonic_sdk_release, reason: from getter */
    public final boolean getAssetDownloadCompleted() {
        return this.assetDownloadCompleted;
    }

    /* JADX INFO: renamed from: isValidCueName$sonic_sdk_release, reason: from getter */
    public final boolean getIsValidCueName() {
        return this.isValidCueName;
    }

    public final void setAssetDownloadCompleted$sonic_sdk_release(boolean z10) {
        this.assetDownloadCompleted = z10;
    }

    public final void setValidCueName$sonic_sdk_release(boolean z10) {
        this.isValidCueName = z10;
    }
}
