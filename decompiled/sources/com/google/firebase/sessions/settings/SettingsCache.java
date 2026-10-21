package com.google.firebase.sessions.settings;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SettingsCache.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!¢\u0006\u0004\b$\u0010%J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u000f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u001d\u0010\u001c\u001a\u00020\u000f2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010 \u001a\u00020\u000fH\u0081@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006&"}, d2 = {"Lcom/google/firebase/sessions/settings/SettingsCache;", "", "", "hasCacheExpired$com_google_firebase_firebase_sessions", "()Z", "hasCacheExpired", "sessionsEnabled", "()Ljava/lang/Boolean;", "", "sessionSamplingRate", "()Ljava/lang/Double;", "", "sessionRestartTimeout", "()Ljava/lang/Integer;", "enabled", "", "updateSettingsEnabled", "(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "rate", "updateSamplingRate", "(Ljava/lang/Double;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "timeoutInSeconds", "updateSessionRestartTimeout", "(Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cacheDurationInSeconds", "updateSessionCacheDuration", "", "cacheUpdatedTime", "updateSessionCacheUpdatedTime", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeConfigs$com_google_firebase_firebase_sessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeConfigs", "Landroidx/datastore/core/DataStore;", "Landroidx/datastore/preferences/core/Preferences;", "dataStore", "<init>", "(Landroidx/datastore/core/DataStore;)V", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final class SettingsCache {

    @Deprecated
    @NotNull
    public static final String TAG = "SettingsCache";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Preferences.Key<Boolean> f48956c = PreferencesKeys.booleanKey(LocalOverrideSettings.SESSIONS_ENABLED);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Preferences.Key<Double> f48957d = PreferencesKeys.doubleKey(LocalOverrideSettings.SAMPLING_RATE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Preferences.Key<Integer> f48958e = PreferencesKeys.intKey("firebase_sessions_restart_timeout");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Preferences.Key<Integer> f48959f = PreferencesKeys.intKey("firebase_sessions_cache_duration");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final Preferences.Key<Long> f48960g = PreferencesKeys.longKey("firebase_sessions_cache_updated_time");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final DataStore<Preferences> f48961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SessionConfigs f48962b;

    /* JADX INFO: compiled from: SettingsCache.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache$1", f = "SettingsCache.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SettingsCache f48963p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public int f48964q0;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SettingsCache.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SettingsCache settingsCache;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f48964q0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SettingsCache settingsCache2 = SettingsCache.this;
                Flow data = settingsCache2.f48961a.getData();
                this.f48963p0 = settingsCache2;
                this.f48964q0 = 1;
                Object objFirst = FlowKt.first(data, this);
                if (objFirst == coroutine_suspended) {
                    return coroutine_suspended;
                }
                settingsCache = settingsCache2;
                obj = objFirst;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                settingsCache = this.f48963p0;
                ResultKt.throwOnFailure(obj);
            }
            SettingsCache.access$updateSessionConfigs(settingsCache, ((Preferences) obj).toPreferences());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SettingsCache.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache$removeConfigs$2", f = "SettingsCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f48966p0;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            b bVar = SettingsCache.this.new b(continuation);
            bVar.f48966p0 = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((b) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.f48966p0;
            mutablePreferences.clear();
            SettingsCache.access$updateSessionConfigs(SettingsCache.this, mutablePreferences);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SettingsCache.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache", f = "SettingsCache.kt", i = {}, l = {112}, m = "updateConfigValue", n = {}, s = {})
    public static final class c<T> extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f48968p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f48970r0;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f48968p0 = obj;
            this.f48970r0 |= Integer.MIN_VALUE;
            return SettingsCache.this.a(null, null, this);
        }
    }

    /* JADX INFO: compiled from: SettingsCache.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.settings.SettingsCache$updateConfigValue$2", f = "SettingsCache.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f48971p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ T f48972q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Preferences.Key<T> f48973r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public final /* synthetic */ SettingsCache f48974s0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(SettingsCache settingsCache, Preferences.Key key, Object obj, Continuation continuation) {
            super(2, continuation);
            this.f48972q0 = obj;
            this.f48973r0 = key;
            this.f48974s0 = settingsCache;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            d dVar = new d(this.f48974s0, this.f48973r0, this.f48972q0, continuation);
            dVar.f48971p0 = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
            return ((d) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            MutablePreferences mutablePreferences = (MutablePreferences) this.f48971p0;
            Object obj2 = this.f48973r0;
            T t10 = this.f48972q0;
            if (t10 != 0) {
                mutablePreferences.set(obj2, t10);
            } else {
                mutablePreferences.remove(obj2);
            }
            SettingsCache.access$updateSessionConfigs(this.f48974s0, mutablePreferences);
            return Unit.INSTANCE;
        }
    }

    public SettingsCache(@NotNull DataStore<Preferences> dataStore) throws InterruptedException {
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        this.f48961a = dataStore;
        BuildersKt__BuildersKt.runBlocking$default(null, new a(null), 1, null);
    }

    public static final void access$updateSessionConfigs(SettingsCache settingsCache, Preferences preferences) {
        settingsCache.getClass();
        settingsCache.f48962b = new SessionConfigs((Boolean) preferences.get(f48956c), (Double) preferences.get(f48957d), (Integer) preferences.get(f48958e), (Integer) preferences.get(f48959f), (Long) preferences.get(f48960g));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final <T> Object a(Preferences.Key<T> key, T t10, Continuation<? super Unit> continuation) {
        c cVar;
        if (continuation instanceof c) {
            cVar = (c) continuation;
            int i10 = cVar.f48970r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f48970r0 = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(continuation);
            }
        } else {
            cVar = new c(continuation);
        }
        Object obj = cVar.f48968p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = cVar.f48970r0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                DataStore<Preferences> dataStore = this.f48961a;
                d dVar = new d(this, key, t10, null);
                cVar.f48970r0 = 1;
                if (PreferencesKt.edit(dataStore, dVar, cVar) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (IOException e5) {
            Log.w(TAG, "Failed to update cache config value: " + e5);
        }
        return Unit.INSTANCE;
    }

    public final boolean hasCacheExpired$com_google_firebase_firebase_sessions() {
        SessionConfigs sessionConfigs = this.f48962b;
        SessionConfigs sessionConfigs2 = null;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        Long cacheUpdatedTime = sessionConfigs.getCacheUpdatedTime();
        SessionConfigs sessionConfigs3 = this.f48962b;
        if (sessionConfigs3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
        } else {
            sessionConfigs2 = sessionConfigs3;
        }
        Integer cacheDuration = sessionConfigs2.getCacheDuration();
        return cacheUpdatedTime == null || cacheDuration == null || (System.currentTimeMillis() - cacheUpdatedTime.longValue()) / ((long) 1000) >= ((long) cacheDuration.intValue());
    }

    @VisibleForTesting
    @Nullable
    public final Object removeConfigs$com_google_firebase_firebase_sessions(@NotNull Continuation<? super Unit> continuation) {
        Object objEdit = PreferencesKt.edit(this.f48961a, new b(null), continuation);
        return objEdit == ek.a.getCOROUTINE_SUSPENDED() ? objEdit : Unit.INSTANCE;
    }

    @Nullable
    public final Integer sessionRestartTimeout() {
        SessionConfigs sessionConfigs = this.f48962b;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionRestartTimeout();
    }

    @Nullable
    public final Double sessionSamplingRate() {
        SessionConfigs sessionConfigs = this.f48962b;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionSamplingRate();
    }

    @Nullable
    public final Boolean sessionsEnabled() {
        SessionConfigs sessionConfigs = this.f48962b;
        if (sessionConfigs == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sessionConfigs");
            sessionConfigs = null;
        }
        return sessionConfigs.getSessionEnabled();
    }

    @Nullable
    public final Object updateSamplingRate(@Nullable Double d2, @NotNull Continuation<? super Unit> continuation) {
        Object objA = a(f48957d, d2, continuation);
        return objA == ek.a.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateSessionCacheDuration(@Nullable Integer num, @NotNull Continuation<? super Unit> continuation) {
        Object objA = a(f48959f, num, continuation);
        return objA == ek.a.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateSessionCacheUpdatedTime(@Nullable Long l6, @NotNull Continuation<? super Unit> continuation) {
        Object objA = a(f48960g, l6, continuation);
        return objA == ek.a.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateSessionRestartTimeout(@Nullable Integer num, @NotNull Continuation<? super Unit> continuation) {
        Object objA = a(f48958e, num, continuation);
        return objA == ek.a.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }

    @Nullable
    public final Object updateSettingsEnabled(@Nullable Boolean bool, @NotNull Continuation<? super Unit> continuation) {
        Object objA = a(f48956c, bool, continuation);
        return objA == ek.a.getCOROUTINE_SUSPENDED() ? objA : Unit.INSTANCE;
    }
}
