package com.google.firebase.crashlytics.internal.settings;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import bg.d;
import bg.e;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.common.DataCollectionArbiter;
import com.google.firebase.crashlytics.internal.common.DeliveryMechanism;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.firebase.crashlytics.internal.common.SystemCurrentTimeProvider;
import com.google.firebase.crashlytics.internal.network.HttpGetRequest;
import com.google.firebase.crashlytics.internal.network.HttpRequestFactory;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class SettingsController implements SettingsProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f48300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f48301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SettingsJsonParser f48302c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CurrentTimeProvider f48303d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CachedSettingsIo f48304e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e f48305f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final DataCollectionArbiter f48306g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference<Settings> f48307h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReference<TaskCompletionSource<Settings>> f48308i;

    public class a implements SuccessContinuation<Void, Void> {
        public a() {
        }

        @Override // com.google.android.gms.tasks.SuccessContinuation
        @NonNull
        public final Task<Void> then(@Nullable Void r12) throws Exception {
            JSONObject jSONObjectD;
            SettingsController settingsController = SettingsController.this;
            e eVar = settingsController.f48305f;
            d dVar = settingsController.f48301b;
            bg.a aVar = (bg.a) eVar;
            String str = aVar.f25204a;
            Logger logger = aVar.f25206c;
            try {
                HashMap mapC = bg.a.c(dVar);
                HttpGetRequest httpGetRequestHeader = aVar.f25205b.buildHttpGetRequest(str, mapC).header("User-Agent", "Crashlytics Android SDK/" + CrashlyticsCore.getVersion()).header("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
                bg.a.a(httpGetRequestHeader, dVar);
                logger.d("Requesting settings from " + str);
                logger.v("Settings query params were: " + mapC);
                jSONObjectD = aVar.d(httpGetRequestHeader.execute());
            } catch (IOException e5) {
                logger.e("Settings request failed.", e5);
                jSONObjectD = null;
            }
            if (jSONObjectD != null) {
                Settings settingsJson = settingsController.f48302c.parseSettingsJson(jSONObjectD);
                settingsController.f48304e.writeCachedSettings(settingsJson.expiresAtMillis, jSONObjectD);
                Logger.getLogger().d("Loaded settings: " + jSONObjectD.toString());
                String str2 = dVar.f25212f;
                SharedPreferences.Editor editorEdit = CommonUtils.getSharedPrefs(settingsController.f48300a).edit();
                editorEdit.putString("existing_instance_identifier", str2);
                editorEdit.apply();
                settingsController.f48307h.set(settingsJson);
                settingsController.f48308i.get().trySetResult(settingsJson);
            }
            return Tasks.forResult(null);
        }
    }

    public SettingsController(Context context, d dVar, SystemCurrentTimeProvider systemCurrentTimeProvider, SettingsJsonParser settingsJsonParser, CachedSettingsIo cachedSettingsIo, bg.a aVar, DataCollectionArbiter dataCollectionArbiter) {
        AtomicReference<Settings> atomicReference = new AtomicReference<>();
        this.f48307h = atomicReference;
        this.f48308i = new AtomicReference<>(new TaskCompletionSource());
        this.f48300a = context;
        this.f48301b = dVar;
        this.f48303d = systemCurrentTimeProvider;
        this.f48302c = settingsJsonParser;
        this.f48304e = cachedSettingsIo;
        this.f48305f = aVar;
        this.f48306g = dataCollectionArbiter;
        atomicReference.set(com.google.firebase.crashlytics.internal.settings.a.b(systemCurrentTimeProvider));
    }

    public static SettingsController create(Context context, String str, IdManager idManager, HttpRequestFactory httpRequestFactory, String str2, String str3, FileStore fileStore, DataCollectionArbiter dataCollectionArbiter) {
        String installerPackageName = idManager.getInstallerPackageName();
        SystemCurrentTimeProvider systemCurrentTimeProvider = new SystemCurrentTimeProvider();
        return new SettingsController(context, new d(str, idManager.getModelName(), idManager.getOsBuildVersionString(), idManager.getOsDisplayVersionString(), idManager, CommonUtils.createInstanceIdFrom(CommonUtils.getMappingFileId(context), str, str3, str2), str3, str2, DeliveryMechanism.determineFrom(installerPackageName).getId()), systemCurrentTimeProvider, new SettingsJsonParser(systemCurrentTimeProvider), new CachedSettingsIo(fileStore), new bg.a(String.format(Locale.US, "https://firebase-settings.crashlytics.com/spi/v2/platforms/android/gmp/%s/settings", str), httpRequestFactory), dataCollectionArbiter);
    }

    public final Settings a(bg.b bVar) throws Throwable {
        Settings settings = null;
        try {
            if (!bg.b.SKIP_CACHE_LOOKUP.equals(bVar)) {
                JSONObject cachedSettings = this.f48304e.readCachedSettings();
                if (cachedSettings != null) {
                    Settings settingsJson = this.f48302c.parseSettingsJson(cachedSettings);
                    if (settingsJson != null) {
                        Logger.getLogger().d("Loaded cached settings: " + cachedSettings.toString());
                        long currentTimeMillis = this.f48303d.getCurrentTimeMillis();
                        if (bg.b.IGNORE_CACHE_EXPIRATION.equals(bVar) || !settingsJson.isExpired(currentTimeMillis)) {
                            try {
                                Logger.getLogger().v("Returning cached settings.");
                                settings = settingsJson;
                            } catch (Exception e5) {
                                e = e5;
                                settings = settingsJson;
                                Logger.getLogger().e("Failed to get cached settings", e);
                            }
                        } else {
                            Logger.getLogger().v("Cached settings have expired.");
                        }
                    } else {
                        Logger.getLogger().e("Failed to parse cached settings data.", null);
                    }
                } else {
                    Logger.getLogger().d("No cached settings data found.");
                }
            }
        } catch (Exception e7) {
            e = e7;
        }
        return settings;
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public Task<Settings> getSettingsAsync() {
        return this.f48308i.get().getTask();
    }

    @Override // com.google.firebase.crashlytics.internal.settings.SettingsProvider
    public Settings getSettingsSync() {
        return this.f48307h.get();
    }

    public Task<Void> loadSettingsData(Executor executor) {
        return loadSettingsData(bg.b.USE_CACHE, executor);
    }

    public Task<Void> loadSettingsData(bg.b bVar, Executor executor) throws Throwable {
        Settings settingsA;
        boolean z10 = !CommonUtils.getSharedPrefs(this.f48300a).getString("existing_instance_identifier", "").equals(this.f48301b.f25212f);
        AtomicReference<TaskCompletionSource<Settings>> atomicReference = this.f48308i;
        AtomicReference<Settings> atomicReference2 = this.f48307h;
        if (!z10 && (settingsA = a(bVar)) != null) {
            atomicReference2.set(settingsA);
            atomicReference.get().trySetResult(settingsA);
            return Tasks.forResult(null);
        }
        Settings settingsA2 = a(bg.b.IGNORE_CACHE_EXPIRATION);
        if (settingsA2 != null) {
            atomicReference2.set(settingsA2);
            atomicReference.get().trySetResult(settingsA2);
        }
        return this.f48306g.waitForDataCollectionPermission(executor).onSuccessTask(executor, new a());
    }
}
