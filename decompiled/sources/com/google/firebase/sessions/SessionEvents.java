package com.google.firebase.sessions;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.google.firebase.FirebaseApp;
import com.google.firebase.encoders.DataEncoder;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: SessionEvents.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001c\u0010\u001dJT\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\b\b\u0002\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u001b\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lcom/google/firebase/sessions/SessionEvents;", "", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "Lcom/google/firebase/sessions/SessionDetails;", "sessionDetails", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "sessionsSettings", "Lcom/google/firebase/sessions/ProcessDetails;", "currentProcessDetails", "", "appProcessDetails", "", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "subscribers", "", "firebaseInstallationId", "Lcom/google/firebase/sessions/SessionEvent;", "buildSession", "Lcom/google/firebase/sessions/ApplicationInfo;", "getApplicationInfo", "Lcom/google/firebase/encoders/DataEncoder;", "a", "Lcom/google/firebase/encoders/DataEncoder;", "getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions", "()Lcom/google/firebase/encoders/DataEncoder;", "SESSION_EVENT_ENCODER", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final class SessionEvents {

    @NotNull
    public static final SessionEvents INSTANCE = new SessionEvents();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static final DataEncoder SESSION_EVENT_ENCODER;

    static {
        DataEncoder dataEncoderBuild = new JsonDataEncoderBuilder().configureWith(AutoSessionEventEncoder.CONFIG).ignoreNullValues(true).build();
        Intrinsics.checkNotNullExpressionValue(dataEncoderBuild, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        SESSION_EVENT_ENCODER = dataEncoderBuild;
    }

    @NotNull
    public final SessionEvent buildSession(@NotNull FirebaseApp firebaseApp, @NotNull SessionDetails sessionDetails, @NotNull SessionsSettings sessionsSettings, @NotNull ProcessDetails currentProcessDetails, @NotNull List<ProcessDetails> appProcessDetails, @NotNull Map<SessionSubscriber.Name, ? extends SessionSubscriber> subscribers, @NotNull String firebaseInstallationId) {
        DataCollectionState dataCollectionState;
        DataCollectionState dataCollectionState2;
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        Intrinsics.checkNotNullParameter(sessionsSettings, "sessionsSettings");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        Intrinsics.checkNotNullParameter(subscribers, "subscribers");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        EventType eventType = EventType.SESSION_START;
        String sessionId = sessionDetails.getSessionId();
        String firstSessionId = sessionDetails.getFirstSessionId();
        int sessionIndex = sessionDetails.getSessionIndex();
        long sessionStartTimestampUs = sessionDetails.getSessionStartTimestampUs();
        SessionSubscriber sessionSubscriber = subscribers.get(SessionSubscriber.Name.PERFORMANCE);
        if (sessionSubscriber == null) {
            dataCollectionState = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
        } else {
            dataCollectionState = sessionSubscriber.isDataCollectionEnabled() ? DataCollectionState.COLLECTION_ENABLED : DataCollectionState.COLLECTION_DISABLED;
        }
        SessionSubscriber sessionSubscriber2 = subscribers.get(SessionSubscriber.Name.CRASHLYTICS);
        if (sessionSubscriber2 == null) {
            dataCollectionState2 = DataCollectionState.COLLECTION_SDK_NOT_INSTALLED;
        } else {
            dataCollectionState2 = sessionSubscriber2.isDataCollectionEnabled() ? DataCollectionState.COLLECTION_ENABLED : DataCollectionState.COLLECTION_DISABLED;
        }
        return new SessionEvent(eventType, new SessionInfo(sessionId, firstSessionId, sessionIndex, sessionStartTimestampUs, new DataCollectionStatus(dataCollectionState, dataCollectionState2, sessionsSettings.getSamplingRate()), firebaseInstallationId), getApplicationInfo(firebaseApp));
    }

    @NotNull
    public final ApplicationInfo getApplicationInfo(@NotNull FirebaseApp firebaseApp) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Context applicationContext = firebaseApp.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "firebaseApp.applicationContext");
        String packageName = applicationContext.getPackageName();
        PackageInfo packageInfo = applicationContext.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String applicationId = firebaseApp.getOptions().getApplicationId();
        Intrinsics.checkNotNullExpressionValue(applicationId, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        LogEnvironment logEnvironment = LogEnvironment.LOG_ENVIRONMENT_PROD;
        Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
        String str = packageInfo.versionName;
        String str2 = str == null ? strValueOf : str;
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        ProcessDetailsProvider processDetailsProvider = ProcessDetailsProvider.INSTANCE;
        Context applicationContext2 = firebaseApp.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext2, "firebaseApp.applicationContext");
        ProcessDetails currentProcessDetails = processDetailsProvider.getCurrentProcessDetails(applicationContext2);
        Context applicationContext3 = firebaseApp.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext3, "firebaseApp.applicationContext");
        return new ApplicationInfo(applicationId, MODEL, "1.2.0", RELEASE, logEnvironment, new AndroidApplicationInfo(packageName, str2, strValueOf, MANUFACTURER, currentProcessDetails, processDetailsProvider.getAppProcessDetails(applicationContext3)));
    }

    @NotNull
    public final DataEncoder getSESSION_EVENT_ENCODER$com_google_firebase_firebase_sessions() {
        return SESSION_EVENT_ENCODER;
    }
}
