package com.google.firebase.sessions.settings;

import android.os.Build;
import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.Preferences;
import bk.q;
import com.google.android.gms.tasks.Task;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Regex;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import kotlinx.coroutines.tasks.TasksKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: RemoteSettings.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d¢\u0006\u0004\b \u0010!J\u0013\u0010\u0003\u001a\u00020\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u000f\u0010\t\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0010\u001a\u0004\u0018\u00010\r8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\""}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "", "updateSettings", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isSettingsStale", "clearCachedSettings$com_google_firebase_firebase_sessions", "()V", "clearCachedSettings", "getSessionEnabled", "()Ljava/lang/Boolean;", "sessionEnabled", "Lkotlin/time/Duration;", "getSessionRestartTimeout-FghU774", "()Lkotlin/time/Duration;", "sessionRestartTimeout", "", "getSamplingRate", "()Ljava/lang/Double;", "samplingRate", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallationsApi", "Lcom/google/firebase/sessions/ApplicationInfo;", "appInfo", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "configsFetcher", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "dataStore", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/ApplicationInfo;Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;Landroidx/datastore/core/DataStore;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final class RemoteSettings implements SettingsProvider {

    @Deprecated
    @NotNull
    public static final String FORWARD_SLASH_STRING = "/";

    @Deprecated
    @NotNull
    public static final String TAG = "SessionConfigFetcher";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f48916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FirebaseInstallationsApi f48917b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final ApplicationInfo f48918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final CrashlyticsSettingsFetcher f48919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final SettingsCache f48920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    public final Mutex f48921f;

    /* JADX INFO: compiled from: RemoteSettings.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings$clearCachedSettings$1", f = "RemoteSettings.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f48922p0;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return RemoteSettings.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f48922p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SettingsCache settingsCache = RemoteSettings.this.f48920e;
                this.f48922p0 = 1;
                if (settingsCache.removeConfigs$com_google_firebase_firebase_sessions(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: RemoteSettings.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings", f = "RemoteSettings.kt", i = {0, 0, 1, 1, 2}, l = {170, 76, 94}, m = "updateSettings", n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Object f48924p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Mutex f48925q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public /* synthetic */ Object f48926r0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public int f48928t0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48926r0 = obj;
            this.f48928t0 |= Integer.MIN_VALUE;
            return RemoteSettings.this.updateSettings(this);
        }
    }

    /* JADX INFO: compiled from: RemoteSettings.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$1", f = "RemoteSettings.kt", i = {0, 0, 0, 1, 1, 2}, l = {125, 128, 131, 133, 134, 136}, m = "invokeSuspend", n = {"sessionSamplingRate", "sessionTimeoutSeconds", "cacheDuration", "sessionSamplingRate", "cacheDuration", "cacheDuration"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$0"})
    public static final class c extends SuspendLambda implements Function2<JSONObject, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Ref.ObjectRef f48929p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Ref.ObjectRef f48930q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f48931r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public /* synthetic */ Object f48932s0;

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            c cVar = RemoteSettings.this.new c(continuation);
            cVar.f48932s0 = obj;
            return cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(JSONObject jSONObject, Continuation<? super Unit> continuation) {
            return ((c) create(jSONObject, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:40:0x00d9  */
        /* JADX WARN: Code duplicated, block: B:42:0x00f3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:45:0x00fa  */
        /* JADX WARN: Code duplicated, block: B:47:0x0114 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:50:0x011b  */
        /* JADX WARN: Code duplicated, block: B:52:0x0135 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:54:0x0139  */
        /* JADX WARN: Code duplicated, block: B:56:0x013c  */
        /* JADX WARN: Code duplicated, block: B:58:0x0156 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:61:0x0172 A[RETURN] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r13v8, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r1v5, types: [T, java.lang.Integer] */
        /* JADX WARN: Type inference failed for: r2v4, types: [T, java.lang.Double] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws JSONException {
            Ref.ObjectRef objectRef;
            Boolean bool;
            Ref.ObjectRef objectRef2;
            Ref.ObjectRef objectRef3;
            Ref.ObjectRef objectRef4;
            Ref.ObjectRef objectRef5;
            Integer num;
            SettingsCache settingsCache;
            Integer num2;
            Double d2;
            SettingsCache settingsCache2;
            Double d3;
            Integer num3;
            Unit unit;
            SettingsCache settingsCache3;
            Integer num4;
            SettingsCache settingsCache4;
            Integer numBoxInt;
            SettingsCache settingsCache5;
            Long lBoxLong;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f48931r0;
            RemoteSettings remoteSettings = RemoteSettings.this;
            switch (i10) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    JSONObject jSONObject = (JSONObject) this.f48932s0;
                    Objects.toString(jSONObject);
                    Ref.ObjectRef objectRef6 = new Ref.ObjectRef();
                    objectRef = new Ref.ObjectRef();
                    Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
                    if (jSONObject.has("app_quality")) {
                        Object obj2 = jSONObject.get("app_quality");
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type org.json.JSONObject");
                        JSONObject jSONObject2 = (JSONObject) obj2;
                        try {
                            bool = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                            try {
                                if (jSONObject2.has("sampling_rate")) {
                                    objectRef6.element = (Double) jSONObject2.get("sampling_rate");
                                }
                                if (jSONObject2.has("session_timeout_seconds")) {
                                    objectRef.element = (Integer) jSONObject2.get("session_timeout_seconds");
                                }
                                if (jSONObject2.has("cache_duration")) {
                                    objectRef7.element = (Integer) jSONObject2.get("cache_duration");
                                }
                                break;
                            } catch (JSONException unused) {
                            }
                        } catch (JSONException unused2) {
                            bool = null;
                        }
                        break;
                    } else {
                        bool = null;
                    }
                    if (bool != null) {
                        bool.booleanValue();
                        SettingsCache settingsCache6 = remoteSettings.f48920e;
                        this.f48932s0 = objectRef6;
                        this.f48929p0 = objectRef;
                        this.f48930q0 = objectRef7;
                        this.f48931r0 = 1;
                        if (settingsCache6.updateSettingsEnabled(bool, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        objectRef4 = objectRef6;
                        objectRef5 = objectRef;
                        objectRef3 = objectRef7;
                        objectRef = objectRef5;
                        objectRef2 = objectRef4;
                    } else {
                        objectRef2 = objectRef6;
                        objectRef3 = objectRef7;
                    }
                    num = (Integer) objectRef.element;
                    if (num != null) {
                        num.intValue();
                        settingsCache = remoteSettings.f48920e;
                        num2 = (Integer) objectRef.element;
                        this.f48932s0 = objectRef2;
                        this.f48929p0 = objectRef3;
                        this.f48930q0 = null;
                        this.f48931r0 = 2;
                        if (settingsCache.updateSessionRestartTimeout(num2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    d2 = (Double) objectRef2.element;
                    if (d2 != null) {
                        d2.doubleValue();
                        settingsCache2 = remoteSettings.f48920e;
                        d3 = (Double) objectRef2.element;
                        this.f48932s0 = objectRef3;
                        this.f48929p0 = null;
                        this.f48930q0 = null;
                        this.f48931r0 = 3;
                        if (settingsCache2.updateSamplingRate(d3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    num3 = (Integer) objectRef3.element;
                    if (num3 != null) {
                        num3.intValue();
                        settingsCache3 = remoteSettings.f48920e;
                        num4 = (Integer) objectRef3.element;
                        this.f48932s0 = null;
                        this.f48929p0 = null;
                        this.f48930q0 = null;
                        this.f48931r0 = 4;
                        if (settingsCache3.updateSessionCacheDuration(num4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        settingsCache4 = remoteSettings.f48920e;
                        numBoxInt = Boxing.boxInt(86400);
                        this.f48932s0 = null;
                        this.f48929p0 = null;
                        this.f48930q0 = null;
                        this.f48931r0 = 5;
                        if (settingsCache4.updateSessionCacheDuration(numBoxInt, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    settingsCache5 = remoteSettings.f48920e;
                    lBoxLong = Boxing.boxLong(System.currentTimeMillis());
                    this.f48932s0 = null;
                    this.f48929p0 = null;
                    this.f48930q0 = null;
                    this.f48931r0 = 6;
                    if (settingsCache5.updateSessionCacheUpdatedTime(lBoxLong, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 1:
                    objectRef3 = this.f48930q0;
                    objectRef5 = this.f48929p0;
                    objectRef4 = (Ref.ObjectRef) this.f48932s0;
                    ResultKt.throwOnFailure(obj);
                    objectRef = objectRef5;
                    objectRef2 = objectRef4;
                    num = (Integer) objectRef.element;
                    if (num != null) {
                        num.intValue();
                        settingsCache = remoteSettings.f48920e;
                        num2 = (Integer) objectRef.element;
                        this.f48932s0 = objectRef2;
                        this.f48929p0 = objectRef3;
                        this.f48930q0 = null;
                        this.f48931r0 = 2;
                        if (settingsCache.updateSessionRestartTimeout(num2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    d2 = (Double) objectRef2.element;
                    if (d2 != null) {
                        d2.doubleValue();
                        settingsCache2 = remoteSettings.f48920e;
                        d3 = (Double) objectRef2.element;
                        this.f48932s0 = objectRef3;
                        this.f48929p0 = null;
                        this.f48930q0 = null;
                        this.f48931r0 = 3;
                        if (settingsCache2.updateSamplingRate(d3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    num3 = (Integer) objectRef3.element;
                    if (num3 != null) {
                        num3.intValue();
                        settingsCache3 = remoteSettings.f48920e;
                        num4 = (Integer) objectRef3.element;
                        this.f48932s0 = null;
                        this.f48929p0 = null;
                        this.f48930q0 = null;
                        this.f48931r0 = 4;
                        if (settingsCache3.updateSessionCacheDuration(num4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        settingsCache4 = remoteSettings.f48920e;
                        numBoxInt = Boxing.boxInt(86400);
                        this.f48932s0 = null;
                        this.f48929p0 = null;
                        this.f48930q0 = null;
                        this.f48931r0 = 5;
                        if (settingsCache4.updateSessionCacheDuration(numBoxInt, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    settingsCache5 = remoteSettings.f48920e;
                    lBoxLong = Boxing.boxLong(System.currentTimeMillis());
                    this.f48932s0 = null;
                    this.f48929p0 = null;
                    this.f48930q0 = null;
                    this.f48931r0 = 6;
                    if (settingsCache5.updateSessionCacheUpdatedTime(lBoxLong, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 2:
                    objectRef3 = this.f48929p0;
                    objectRef2 = (Ref.ObjectRef) this.f48932s0;
                    ResultKt.throwOnFailure(obj);
                    d2 = (Double) objectRef2.element;
                    if (d2 != null) {
                        d2.doubleValue();
                        settingsCache2 = remoteSettings.f48920e;
                        d3 = (Double) objectRef2.element;
                        this.f48932s0 = objectRef3;
                        this.f48929p0 = null;
                        this.f48930q0 = null;
                        this.f48931r0 = 3;
                        if (settingsCache2.updateSamplingRate(d3, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    num3 = (Integer) objectRef3.element;
                    if (num3 != null) {
                        num3.intValue();
                        settingsCache3 = remoteSettings.f48920e;
                        num4 = (Integer) objectRef3.element;
                        this.f48932s0 = null;
                        this.f48929p0 = null;
                        this.f48930q0 = null;
                        this.f48931r0 = 4;
                        if (settingsCache3.updateSessionCacheDuration(num4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        settingsCache4 = remoteSettings.f48920e;
                        numBoxInt = Boxing.boxInt(86400);
                        this.f48932s0 = null;
                        this.f48929p0 = null;
                        this.f48930q0 = null;
                        this.f48931r0 = 5;
                        if (settingsCache4.updateSessionCacheDuration(numBoxInt, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    settingsCache5 = remoteSettings.f48920e;
                    lBoxLong = Boxing.boxLong(System.currentTimeMillis());
                    this.f48932s0 = null;
                    this.f48929p0 = null;
                    this.f48930q0 = null;
                    this.f48931r0 = 6;
                    if (settingsCache5.updateSessionCacheUpdatedTime(lBoxLong, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 3:
                    objectRef3 = (Ref.ObjectRef) this.f48932s0;
                    ResultKt.throwOnFailure(obj);
                    num3 = (Integer) objectRef3.element;
                    if (num3 != null) {
                        num3.intValue();
                        settingsCache3 = remoteSettings.f48920e;
                        num4 = (Integer) objectRef3.element;
                        this.f48932s0 = null;
                        this.f48929p0 = null;
                        this.f48930q0 = null;
                        this.f48931r0 = 4;
                        if (settingsCache3.updateSessionCacheDuration(num4, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        unit = Unit.INSTANCE;
                    } else {
                        unit = null;
                    }
                    if (unit == null) {
                        settingsCache4 = remoteSettings.f48920e;
                        numBoxInt = Boxing.boxInt(86400);
                        this.f48932s0 = null;
                        this.f48929p0 = null;
                        this.f48930q0 = null;
                        this.f48931r0 = 5;
                        if (settingsCache4.updateSessionCacheDuration(numBoxInt, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    settingsCache5 = remoteSettings.f48920e;
                    lBoxLong = Boxing.boxLong(System.currentTimeMillis());
                    this.f48932s0 = null;
                    this.f48929p0 = null;
                    this.f48930q0 = null;
                    this.f48931r0 = 6;
                    if (settingsCache5.updateSessionCacheUpdatedTime(lBoxLong, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 4:
                    ResultKt.throwOnFailure(obj);
                    unit = Unit.INSTANCE;
                    if (unit == null) {
                        settingsCache4 = remoteSettings.f48920e;
                        numBoxInt = Boxing.boxInt(86400);
                        this.f48932s0 = null;
                        this.f48929p0 = null;
                        this.f48930q0 = null;
                        this.f48931r0 = 5;
                        if (settingsCache4.updateSessionCacheDuration(numBoxInt, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    settingsCache5 = remoteSettings.f48920e;
                    lBoxLong = Boxing.boxLong(System.currentTimeMillis());
                    this.f48932s0 = null;
                    this.f48929p0 = null;
                    this.f48930q0 = null;
                    this.f48931r0 = 6;
                    if (settingsCache5.updateSessionCacheUpdatedTime(lBoxLong, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 5:
                    ResultKt.throwOnFailure(obj);
                    settingsCache5 = remoteSettings.f48920e;
                    lBoxLong = Boxing.boxLong(System.currentTimeMillis());
                    this.f48932s0 = null;
                    this.f48929p0 = null;
                    this.f48930q0 = null;
                    this.f48931r0 = 6;
                    if (settingsCache5.updateSessionCacheUpdatedTime(lBoxLong, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return Unit.INSTANCE;
                case 6:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: compiled from: RemoteSettings.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.settings.RemoteSettings$updateSettings$2$2", f = "RemoteSettings.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<String, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f48934p0;

        public d() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = new d(2, continuation);
            dVar.f48934p0 = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(String str, Continuation<? super Unit> continuation) {
            return ((d) create(str, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
    }

    public RemoteSettings(@NotNull CoroutineContext backgroundDispatcher, @NotNull FirebaseInstallationsApi firebaseInstallationsApi, @NotNull ApplicationInfo appInfo, @NotNull CrashlyticsSettingsFetcher configsFetcher, @NotNull DataStore<Preferences> dataStore) {
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        Intrinsics.checkNotNullParameter(firebaseInstallationsApi, "firebaseInstallationsApi");
        Intrinsics.checkNotNullParameter(appInfo, "appInfo");
        Intrinsics.checkNotNullParameter(configsFetcher, "configsFetcher");
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.f48916a = backgroundDispatcher;
        this.f48917b = firebaseInstallationsApi;
        this.f48918c = appInfo;
        this.f48919d = configsFetcher;
        this.f48920e = new SettingsCache(dataStore);
        this.f48921f = MutexKt.Mutex$default(false, 1, null);
    }

    @VisibleForTesting
    public final void clearCachedSettings$com_google_firebase_firebase_sessions() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f48916a), null, null, new a(null), 3, null);
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Double getSamplingRate() {
        return this.f48920e.sessionSamplingRate();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Boolean getSessionEnabled() {
        return this.f48920e.sessionsEnabled();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    /* JADX INFO: renamed from: getSessionRestartTimeout-FghU774 */
    public Duration mo5293getSessionRestartTimeoutFghU774() {
        Integer numSessionRestartTimeout = this.f48920e.sessionRestartTimeout();
        if (numSessionRestartTimeout == null) {
            return null;
        }
        Duration.Companion companion = Duration.INSTANCE;
        return Duration.m5809boximpl(DurationKt.toDuration(numSessionRestartTimeout.intValue(), DurationUnit.SECONDS));
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean isSettingsStale() {
        return this.f48920e.hasCacheExpired$com_google_firebase_firebase_sessions();
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00af A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:21:0x004e, B:44:0x00ab, B:46:0x00af, B:50:0x00bd, B:36:0x0085, B:38:0x008d, B:41:0x0093), top: B:59:0x002c }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:52:0x0152 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:53:0x0153  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v14, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r6v0, types: [int] */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Object updateSettings(@NotNull Continuation<? super Unit> continuation) throws Throwable {
        b bVar;
        ?? r3;
        Mutex mutex;
        RemoteSettings remoteSettings;
        String str;
        Map<String, String> mapMapOf;
        CrashlyticsSettingsFetcher crashlyticsSettingsFetcher;
        c cVar;
        d dVar;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i10 = bVar.f48928t0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f48928t0 = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objAwait = bVar.f48926r0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        ?? r10 = bVar.f48928t0;
        try {
            if (r10 == 0) {
                ResultKt.throwOnFailure(objAwait);
                Mutex mutex2 = this.f48921f;
                if (!mutex2.isLocked() && !this.f48920e.hasCacheExpired$com_google_firebase_firebase_sessions()) {
                    return Unit.INSTANCE;
                }
                bVar.f48924p0 = this;
                bVar.f48925q0 = mutex2;
                bVar.f48928t0 = 1;
                if (mutex2.lock(null, bVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                mutex = mutex2;
                remoteSettings = this;
            } else {
                if (r10 != 1) {
                    if (r10 != 2) {
                        if (r10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r3 = (Mutex) bVar.f48924p0;
                        try {
                            ResultKt.throwOnFailure(objAwait);
                            r3 = r3;
                            Unit unit = Unit.INSTANCE;
                            r3.unlock(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th2) {
                            th = th2;
                            r3.unlock(null);
                            throw th;
                        }
                    }
                    mutex = bVar.f48925q0;
                    remoteSettings = (RemoteSettings) bVar.f48924p0;
                    ResultKt.throwOnFailure(objAwait);
                    str = (String) objAwait;
                    if (str == null) {
                        Log.w(TAG, "Error getting Firebase Installation ID. Skipping this Session Event.");
                        Unit unit2 = Unit.INSTANCE;
                        mutex.unlock(null);
                        return unit2;
                    }
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    String str2 = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
                    Intrinsics.checkNotNullExpressionValue(str2, "format(format, *args)");
                    remoteSettings.getClass();
                    String INCREMENTAL = Build.VERSION.INCREMENTAL;
                    Intrinsics.checkNotNullExpressionValue(INCREMENTAL, "INCREMENTAL");
                    String RELEASE = Build.VERSION.RELEASE;
                    Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
                    mapMapOf = q.mapOf(TuplesKt.to("X-Crashlytics-Installation-ID", str), TuplesKt.to("X-Crashlytics-Device-Model", new Regex("/").replace(str2, "")), TuplesKt.to("X-Crashlytics-OS-Build-Version", new Regex("/").replace(INCREMENTAL, "")), TuplesKt.to("X-Crashlytics-OS-Display-Version", new Regex("/").replace(RELEASE, "")), TuplesKt.to("X-Crashlytics-API-Client-Version", remoteSettings.f48918c.getSessionSdkVersion()));
                    crashlyticsSettingsFetcher = remoteSettings.f48919d;
                    cVar = remoteSettings.new c(null);
                    dVar = new d(2, null);
                    bVar.f48924p0 = mutex;
                    bVar.f48925q0 = null;
                    bVar.f48928t0 = 3;
                    if (crashlyticsSettingsFetcher.doConfigFetch(mapMapOf, cVar, dVar, bVar) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    r3 = mutex;
                    Unit unit3 = Unit.INSTANCE;
                    r3.unlock(null);
                    return Unit.INSTANCE;
                }
                mutex = bVar.f48925q0;
                remoteSettings = (RemoteSettings) bVar.f48924p0;
                ResultKt.throwOnFailure(objAwait);
            }
            if (!remoteSettings.f48920e.hasCacheExpired$com_google_firebase_firebase_sessions()) {
                Unit unit4 = Unit.INSTANCE;
                mutex.unlock(null);
                return unit4;
            }
            Task<String> id = remoteSettings.f48917b.getId();
            Intrinsics.checkNotNullExpressionValue(id, "firebaseInstallationsApi.id");
            bVar.f48924p0 = remoteSettings;
            bVar.f48925q0 = mutex;
            bVar.f48928t0 = 2;
            objAwait = TasksKt.await(id, bVar);
            if (objAwait == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = (String) objAwait;
            if (str == null) {
                Log.w(TAG, "Error getting Firebase Installation ID. Skipping this Session Event.");
                Unit unit5 = Unit.INSTANCE;
                mutex.unlock(null);
                return unit5;
            }
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String str3 = String.format("%s/%s", Arrays.copyOf(new Object[]{Build.MANUFACTURER, Build.MODEL}, 2));
            Intrinsics.checkNotNullExpressionValue(str3, "format(format, *args)");
            remoteSettings.getClass();
            String INCREMENTAL2 = Build.VERSION.INCREMENTAL;
            Intrinsics.checkNotNullExpressionValue(INCREMENTAL2, "INCREMENTAL");
            String RELEASE2 = Build.VERSION.RELEASE;
            Intrinsics.checkNotNullExpressionValue(RELEASE2, "RELEASE");
            mapMapOf = q.mapOf(TuplesKt.to("X-Crashlytics-Installation-ID", str), TuplesKt.to("X-Crashlytics-Device-Model", new Regex("/").replace(str3, "")), TuplesKt.to("X-Crashlytics-OS-Build-Version", new Regex("/").replace(INCREMENTAL2, "")), TuplesKt.to("X-Crashlytics-OS-Display-Version", new Regex("/").replace(RELEASE2, "")), TuplesKt.to("X-Crashlytics-API-Client-Version", remoteSettings.f48918c.getSessionSdkVersion()));
            crashlyticsSettingsFetcher = remoteSettings.f48919d;
            cVar = remoteSettings.new c(null);
            dVar = new d(2, null);
            bVar.f48924p0 = mutex;
            bVar.f48925q0 = null;
            bVar.f48928t0 = 3;
            if (crashlyticsSettingsFetcher.doConfigFetch(mapMapOf, cVar, dVar, bVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
            r3 = mutex;
            Unit unit6 = Unit.INSTANCE;
            r3.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th3) {
            th = th3;
            r3 = r10;
        }
    }
}
