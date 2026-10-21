package com.mastercard.sonic.versionconfig;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mastercard.sonic.R;
import com.mastercard.sonic.model.VersionConfig;
import com.mastercard.sonic.network.NetworkManager;
import com.mastercard.sonic.utils.FileDirUtils;
import com.mastercard.sonic.utils.SharedPreferenceUtils;
import com.mastercard.sonic.utils.Utils;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: VersionConfigManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¨\u0006\u0010"}, d2 = {"Lcom/mastercard/sonic/versionconfig/VersionConfigManager;", "", "", "versionConfigUrl", "Lcom/mastercard/sonic/versionconfig/VersionConfigManager$VersionConfigCallback;", "callback", "", "getVersionConfig", "", "Lcom/mastercard/sonic/model/VersionConfig;", "readFromStoredVersionConfigFile", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "VersionConfigCallback", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nVersionConfigManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VersionConfigManager.kt\ncom/mastercard/sonic/versionconfig/VersionConfigManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Utils.kt\ncom/mastercard/sonic/utils/Utils$Companion\n*L\n1#1,116:1\n1#2:117\n111#3,2:118\n*S KotlinDebug\n*F\n+ 1 VersionConfigManager.kt\ncom/mastercard/sonic/versionconfig/VersionConfigManager\n*L\n109#1:118,2\n*E\n"})
public final class VersionConfigManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f51585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f51586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f51587c;

    /* JADX INFO: compiled from: VersionConfigManager.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/mastercard/sonic/versionconfig/VersionConfigManager$VersionConfigCallback;", "", "onDownloadCompleted", "", "versionConfig", "", "Lcom/mastercard/sonic/model/VersionConfig;", "sonic-sdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface VersionConfigCallback {
        void onDownloadCompleted(@NotNull List<VersionConfig> versionConfig);
    }

    public VersionConfigManager(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f51585a = context;
        this.f51586b = FileDirUtils.SONIC_SDK_VERSION_CONFIG_FILENAME;
        this.f51587c = TimeUnit.DAYS.toMillis(7L);
    }

    public static final List access$getFromStoredVersionConfigFile(VersionConfigManager versionConfigManager) {
        versionConfigManager.getClass();
        try {
            return versionConfigManager.readFromStoredVersionConfigFile();
        } catch (Exception e5) {
            e5.getMessage();
            return CollectionsKt__CollectionsKt.emptyList();
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [com.mastercard.sonic.versionconfig.VersionConfigManager$getVersionConfig$1] */
    public final void getVersionConfig(@NotNull String versionConfigUrl, @NotNull final VersionConfigCallback callback) {
        List<VersionConfig> listEmptyList;
        Intrinsics.checkNotNullParameter(versionConfigUrl, "versionConfigUrl");
        Intrinsics.checkNotNullParameter(callback, "callback");
        long previousVersionCheckDate = new SharedPreferenceUtils(this.f51585a).getPreviousVersionCheckDate();
        long jCurrentTimeMillis = System.currentTimeMillis() - previousVersionCheckDate;
        if (previousVersionCheckDate == 0 || jCurrentTimeMillis >= this.f51587c) {
            final ?? r1 = new VersionConfigDownloadCallback() { // from class: com.mastercard.sonic.versionconfig.VersionConfigManager.getVersionConfig.1
                @Override // com.mastercard.sonic.versionconfig.VersionConfigDownloadCallback
                public void onError(@NotNull String error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    callback.onDownloadCompleted(VersionConfigManager.access$getFromStoredVersionConfigFile(this));
                }

                @Override // com.mastercard.sonic.versionconfig.VersionConfigDownloadCallback
                public void onSuccess(@NotNull List<VersionConfig> versionConfig) {
                    Intrinsics.checkNotNullParameter(versionConfig, "versionConfig");
                    callback.onDownloadCompleted(versionConfig);
                }
            };
            NetworkManager networkManager = NetworkManager.INSTANCE;
            final String str = this.f51586b;
            networkManager.getRequest(versionConfigUrl, new NetworkManager.RequestCallback() { // from class: com.mastercard.sonic.versionconfig.VersionConfigManager$downloadVersionConfig$1
                @Override // com.mastercard.sonic.network.NetworkManager.RequestCallback
                public void onError(@NotNull String error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    r1.onError(error);
                }

                @Override // com.mastercard.sonic.network.NetworkManager.RequestCallback
                public void onSuccess(@NotNull String response) throws IOException {
                    Intrinsics.checkNotNullParameter(response, "response");
                    Utils.Companion companion = Utils.INSTANCE;
                    List<VersionConfig> list = (List) new Gson().fromJson(response, new TypeToken<List<? extends VersionConfig>>() { // from class: com.mastercard.sonic.versionconfig.VersionConfigManager$downloadVersionConfig$1$onSuccess$$inlined$parseJson$1
                    }.getType());
                    if (!list.isEmpty()) {
                        FileDirUtils fileDirUtils = FileDirUtils.INSTANCE;
                        String str2 = str;
                        VersionConfigManager versionConfigManager = this;
                        fileDirUtils.storeVersionConfigFile(response, str2, versionConfigManager.f51585a);
                        new SharedPreferenceUtils(versionConfigManager.f51585a).setVersionCheckDate();
                        versionConfigManager.getClass();
                    }
                    r1.onSuccess(list);
                }
            });
            return;
        }
        try {
            listEmptyList = readFromStoredVersionConfigFile();
        } catch (Exception e5) {
            e5.getMessage();
            listEmptyList = CollectionsKt__CollectionsKt.emptyList();
        }
        callback.onDownloadCompleted(listEmptyList);
    }

    @NotNull
    public final List<VersionConfig> readFromStoredVersionConfigFile() {
        InputStream inputStreamOpenRawResource;
        BufferedReader bufferedReader;
        StringBuilder sb2;
        Context context = this.f51585a;
        try {
            FileDirUtils fileDirUtils = FileDirUtils.INSTANCE;
            inputStreamOpenRawResource = new File(fileDirUtils.getSonicVersionConfigFilePath(context)).exists() ? new FileInputStream(new File(fileDirUtils.getSonicVersionConfigFilePath(context))) : context.getResources().openRawResource(R.raw.version_config);
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    String string = sb2.toString();
                    Intrinsics.checkNotNullExpressionValue(string, "stringBuilder.toString()");
                    Utils.Companion companion = Utils.INSTANCE;
                    return (List) new Gson().fromJson(string, new TypeToken<List<? extends VersionConfig>>() { // from class: com.mastercard.sonic.versionconfig.VersionConfigManager$readFromStoredVersionConfigFile$$inlined$parseJson$1
                    }.getType());
                }
                sb2.append(line);
            }
        } catch (Exception unused) {
            inputStreamOpenRawResource = context.getResources().openRawResource(R.raw.version_config);
        }
        bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpenRawResource));
        sb2 = new StringBuilder();
    }
}
