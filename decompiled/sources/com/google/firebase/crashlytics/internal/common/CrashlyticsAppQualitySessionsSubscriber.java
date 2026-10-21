package com.google.firebase.crashlytics.internal.common;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.persistence.FileStore;
import com.google.firebase.sessions.api.SessionSubscriber;
import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes10.dex */
public class CrashlyticsAppQualitySessionsSubscriber implements SessionSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DataCollectionArbiter f47718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xf.e f47719b;

    public CrashlyticsAppQualitySessionsSubscriber(DataCollectionArbiter dataCollectionArbiter, FileStore fileStore) {
        this.f47718a = dataCollectionArbiter;
        this.f47719b = new xf.e(fileStore);
    }

    @Nullable
    public String getAppQualitySessionId(@NonNull String str) {
        String strSubstring;
        xf.e eVar = this.f47719b;
        synchronized (eVar) {
            if (Objects.equals(eVar.f94612b, str)) {
                strSubstring = eVar.f94613c;
            } else {
                List<File> sessionFiles = eVar.f94611a.getSessionFiles(str, xf.e.f94609d);
                if (sessionFiles.isEmpty()) {
                    Logger.getLogger().w("Unable to read App Quality Sessions session id.");
                    strSubstring = null;
                } else {
                    strSubstring = ((File) Collections.min(sessionFiles, xf.e.f94610e)).getName().substring(4);
                }
            }
        }
        return strSubstring;
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    @NonNull
    public SessionSubscriber.Name getSessionSubscriberName() {
        return SessionSubscriber.Name.CRASHLYTICS;
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public boolean isDataCollectionEnabled() {
        return this.f47718a.isAutomaticDataCollectionEnabled();
    }

    @Override // com.google.firebase.sessions.api.SessionSubscriber
    public void onSessionChanged(@NonNull SessionSubscriber.SessionDetails sessionDetails) {
        Logger.getLogger().d("App Quality Sessions session changed: " + sessionDetails);
        xf.e eVar = this.f47719b;
        String sessionId = sessionDetails.getSessionId();
        synchronized (eVar) {
            if (!Objects.equals(eVar.f94613c, sessionId)) {
                xf.e.a(eVar.f94611a, eVar.f94612b, sessionId);
                eVar.f94613c = sessionId;
            }
        }
    }

    public void setSessionId(@Nullable String str) {
        xf.e eVar = this.f47719b;
        synchronized (eVar) {
            if (!Objects.equals(eVar.f94612b, str)) {
                xf.e.a(eVar.f94611a, str, eVar.f94613c);
                eVar.f94612b = str;
            }
        }
    }
}
