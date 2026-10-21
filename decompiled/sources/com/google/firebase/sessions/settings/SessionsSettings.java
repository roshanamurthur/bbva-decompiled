package com.google.firebase.sessions.settings;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.Preferences;
import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseKt;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.SessionDataStoreConfigs;
import com.google.firebase.sessions.SessionEvents;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionsSettings.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0017\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015B)\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001a\u001a\u00020\u0018\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u0014\u0010\u001dJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\u00020\r8Fø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings;", "", "", "updateSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "getSessionsEnabled", "()Z", "sessionsEnabled", "", "getSamplingRate", "()D", "samplingRate", "Lkotlin/time/Duration;", "getSessionRestartTimeout-UwyO8pc", "()J", "sessionRestartTimeout", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "localOverrideSettings", "remoteSettings", "<init>", "(Lcom/google/firebase/sessions/settings/SettingsProvider;Lcom/google/firebase/sessions/settings/SettingsProvider;)V", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "Lkotlin/coroutines/CoroutineContext;", "blockingDispatcher", "backgroundDispatcher", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallationsApi", "(Lcom/google/firebase/FirebaseApp;Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/installations/FirebaseInstallationsApi;)V", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final class SessionsSettings {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public static final ReadOnlyProperty<Context, DataStore<Preferences>> f48948c = PreferenceDataStoreDelegateKt.preferencesDataStore$default(SessionDataStoreConfigs.INSTANCE.getSETTINGS_CONFIG_NAME(), null, null, null, 14, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final SettingsProvider f48949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final SettingsProvider f48950b;

    /* JADX INFO: compiled from: SessionsSettings.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0005\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/google/firebase/sessions/settings/SessionsSettings$Companion;", "", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "getInstance", "()Lcom/google/firebase/sessions/settings/SessionsSettings;", "instance", "<init>", "()V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ KProperty<Object>[] f48951a = {Reflection.property2(new PropertyReference2Impl(Companion.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final DataStore access$getDataStore(Companion companion, Context context) {
            companion.getClass();
            return (DataStore) SessionsSettings.f48948c.getValue(context, f48951a[0]);
        }

        @NotNull
        public final SessionsSettings getInstance() {
            Object obj = FirebaseKt.getApp(Firebase.INSTANCE).get(SessionsSettings.class);
            Intrinsics.checkNotNullExpressionValue(obj, "Firebase.app[SessionsSettings::class.java]");
            return (SessionsSettings) obj;
        }
    }

    /* JADX INFO: compiled from: SessionsSettings.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SessionsSettings", f = "SessionsSettings.kt", i = {0}, l = {134, 135}, m = "updateSettings", n = {"this"}, s = {"L$0"})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SessionsSettings f48952p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ Object f48953q0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public int f48955s0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48953q0 = obj;
            this.f48955s0 |= Integer.MIN_VALUE;
            return SessionsSettings.this.updateSettings(this);
        }
    }

    public SessionsSettings(@NotNull SettingsProvider localOverrideSettings, @NotNull SettingsProvider remoteSettings) {
        Intrinsics.checkNotNullParameter(localOverrideSettings, "localOverrideSettings");
        Intrinsics.checkNotNullParameter(remoteSettings, "remoteSettings");
        this.f48949a = localOverrideSettings;
        this.f48950b = remoteSettings;
    }

    public final double getSamplingRate() {
        Double samplingRate = this.f48949a.getSamplingRate();
        if (samplingRate != null) {
            double dDoubleValue = samplingRate.doubleValue();
            if (0.0d <= dDoubleValue && dDoubleValue <= 1.0d) {
                return dDoubleValue;
            }
        }
        Double samplingRate2 = this.f48950b.getSamplingRate();
        if (samplingRate2 != null) {
            double dDoubleValue2 = samplingRate2.doubleValue();
            if (0.0d <= dDoubleValue2 && dDoubleValue2 <= 1.0d) {
                return dDoubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX INFO: renamed from: getSessionRestartTimeout-UwyO8pc, reason: not valid java name */
    public final long m5294getSessionRestartTimeoutUwyO8pc() {
        Duration durationMo5293getSessionRestartTimeoutFghU774 = this.f48949a.mo5293getSessionRestartTimeoutFghU774();
        if (durationMo5293getSessionRestartTimeoutFghU774 != null) {
            long jM5861unboximpl = durationMo5293getSessionRestartTimeoutFghU774.getF82384p0();
            if (Duration.m5840isPositiveimpl(jM5861unboximpl) && Duration.m5837isFiniteimpl(jM5861unboximpl)) {
                return jM5861unboximpl;
            }
        }
        Duration durationMo5293getSessionRestartTimeoutFghU775 = this.f48950b.mo5293getSessionRestartTimeoutFghU774();
        if (durationMo5293getSessionRestartTimeoutFghU775 != null) {
            long jM5861unboximpl2 = durationMo5293getSessionRestartTimeoutFghU775.getF82384p0();
            if (Duration.m5840isPositiveimpl(jM5861unboximpl2) && Duration.m5837isFiniteimpl(jM5861unboximpl2)) {
                return jM5861unboximpl2;
            }
        }
        Duration.Companion companion = Duration.INSTANCE;
        return DurationKt.toDuration(30, DurationUnit.MINUTES);
    }

    public final boolean getSessionsEnabled() {
        Boolean sessionEnabled = this.f48949a.getSessionEnabled();
        if (sessionEnabled != null) {
            return sessionEnabled.booleanValue();
        }
        Boolean sessionEnabled2 = this.f48950b.getSessionEnabled();
        if (sessionEnabled2 != null) {
            return sessionEnabled2.booleanValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    public final Object updateSettings(@NotNull Continuation<? super Unit> continuation) {
        a aVar;
        SessionsSettings sessionsSettings;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f48955s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f48955s0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object obj = aVar.f48953q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f48955s0;
        if (i11 != 0) {
            if (i11 == 1) {
                sessionsSettings = aVar.f48952p0;
                ResultKt.throwOnFailure(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        aVar.f48952p0 = this;
        aVar.f48955s0 = 1;
        if (this.f48949a.updateSettings(aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        sessionsSettings = this;
        SettingsProvider settingsProvider = sessionsSettings.f48950b;
        aVar.f48952p0 = null;
        aVar.f48955s0 = 2;
        if (settingsProvider.updateSettings(aVar) == coroutine_suspended) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SessionsSettings(@NotNull FirebaseApp firebaseApp, @NotNull CoroutineContext blockingDispatcher, @NotNull CoroutineContext backgroundDispatcher, @NotNull FirebaseInstallationsApi firebaseInstallationsApi) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(blockingDispatcher, "blockingDispatcher");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        Context applicationContext = firebaseApp.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "firebaseApp.applicationContext");
        ApplicationInfo applicationInfo = SessionEvents.INSTANCE.getApplicationInfo(firebaseApp);
        this(new LocalOverrideSettings(applicationContext), new RemoteSettings(backgroundDispatcher, firebaseInstallationsApi, applicationInfo, new RemoteSettingsFetcher(applicationInfo, blockingDispatcher, null, 4, null), Companion.access$getDataStore(INSTANCE, applicationContext)));
    }
}
