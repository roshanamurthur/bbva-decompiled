package com.google.firebase.sessions;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.PreferenceDataStoreDelegateKt;
import androidx.datastore.preferences.core.MutablePreferences;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import androidx.datastore.preferences.core.PreferencesKeys;
import androidx.datastore.preferences.core.PreferencesKt;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.zoomauth.facialauth.constant.AuthConstants;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference2Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionDatastore.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0002\r\u000eB\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/sessions/SessionDatastoreImpl;", "Lcom/google/firebase/sessions/SessionDatastore;", "", AuthConstants.SESSION_ID, "", "updateSessionId", "getCurrentSessionId", "Landroid/content/Context;", "context", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Landroid/content/Context;Lkotlin/coroutines/CoroutineContext;)V", "b", "c", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final class SessionDatastoreImpl implements SessionDatastore {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public static final b f48821e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Deprecated
    @NotNull
    public static final ReadOnlyProperty<Context, DataStore<Preferences>> f48822f = PreferenceDataStoreDelegateKt.preferencesDataStore$default(SessionDataStoreConfigs.INSTANCE.getSESSIONS_CONFIG_NAME(), null, null, null, 14, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f48823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f48824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final AtomicReference<FirebaseSessionsData> f48825c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final SessionDatastoreImpl$special$$inlined$map$1 f48826d;

    /* JADX INFO: compiled from: SessionDatastore.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.SessionDatastoreImpl$1", f = "SessionDatastore.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f48827p0;

        /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: SessionDatastore.kt */
        public static final class C0217a<T> implements FlowCollector {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ SessionDatastoreImpl f48829p0;

            public C0217a(SessionDatastoreImpl sessionDatastoreImpl) {
                this.f48829p0 = sessionDatastoreImpl;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                this.f48829p0.f48825c.set((FirebaseSessionsData) obj);
                return Unit.INSTANCE;
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SessionDatastoreImpl.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f48827p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SessionDatastoreImpl sessionDatastoreImpl = SessionDatastoreImpl.this;
                Flow flow = sessionDatastoreImpl.f48826d;
                C0217a c0217a = new C0217a(sessionDatastoreImpl);
                this.f48827p0 = 1;
                if (flow.collect(c0217a, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: SessionDatastore.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ KProperty<Object>[] f48830a = {Reflection.property2(new PropertyReference2Impl(b.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};
    }

    /* JADX INFO: compiled from: SessionDatastore.kt */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public static final Preferences.Key<String> f48831a = PreferencesKeys.stringKey(com.huawei.hms.feature.model.b.f50436f);
    }

    /* JADX INFO: compiled from: SessionDatastore.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.SessionDatastoreImpl$firebaseSessionDataFlow$1", f = "SessionDatastore.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Function3<FlowCollector<? super Preferences>, Throwable, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f48832p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public /* synthetic */ FlowCollector f48833q0;

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector<? super Preferences> flowCollector, Throwable th2, Continuation<? super Unit> continuation) {
            d dVar = new d(3, continuation);
            dVar.f48833q0 = flowCollector;
            return dVar.invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f48832p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = this.f48833q0;
                Preferences preferencesCreateEmpty = PreferencesFactory.createEmpty();
                this.f48833q0 = null;
                this.f48832p0 = 1;
                if (flowCollector.emit(preferencesCreateEmpty, this) == coroutine_suspended) {
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

    /* JADX INFO: compiled from: SessionDatastore.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1", f = "SessionDatastore.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f48834p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ String f48836r0;

        /* JADX INFO: compiled from: SessionDatastore.kt */
        @DebugMetadata(c = "com.google.firebase.sessions.SessionDatastoreImpl$updateSessionId$1$1", f = "SessionDatastore.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Function2<MutablePreferences, Continuation<? super Unit>, Object> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public /* synthetic */ Object f48837p0;

            /* JADX INFO: renamed from: q0, reason: collision with root package name */
            public final /* synthetic */ String f48838q0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f48838q0 = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @NotNull
            public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
                a aVar = new a(this.f48838q0, continuation);
                aVar.f48837p0 = obj;
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(MutablePreferences mutablePreferences, Continuation<? super Unit> continuation) {
                return ((a) create(mutablePreferences, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ek.a.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                MutablePreferences mutablePreferences = (MutablePreferences) this.f48837p0;
                Preferences.Key<String> key = c.f48831a;
                mutablePreferences.set(c.f48831a, this.f48838q0);
                return Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f48836r0 = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SessionDatastoreImpl.this.new e(this.f48836r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((e) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f48834p0;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                b bVar = SessionDatastoreImpl.f48821e;
                Context context = SessionDatastoreImpl.this.f48823a;
                bVar.getClass();
                DataStore dataStore = (DataStore) SessionDatastoreImpl.f48822f.getValue(context, b.f48830a[0]);
                a aVar = new a(this.f48836r0, null);
                this.f48834p0 = 1;
                if (PreferencesKt.edit(dataStore, aVar, this) == coroutine_suspended) {
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

    /* JADX WARN: Type inference failed for: r0v6, types: [com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1] */
    public SessionDatastoreImpl(@NotNull Context context, @NotNull CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.f48823a = context;
        this.f48824b = backgroundDispatcher;
        this.f48825c = new AtomicReference<>();
        f48821e.getClass();
        final Flow flowM5982catch = FlowKt.m5982catch(((DataStore) f48822f.getValue(context, b.f48830a[0])).getData(), new d(3, null));
        this.f48826d = new Flow<FirebaseSessionsData>() { // from class: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1

            /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: Emitters.kt */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0004\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "R", "value", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$1$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$map$$inlined$unsafeTransform$1$2"}, k = 3, mv = {1, 7, 1}, xi = 48)
            public static final class AnonymousClass2<T> implements FlowCollector {

                /* JADX INFO: renamed from: p0, reason: collision with root package name */
                public final /* synthetic */ FlowCollector f48841p0;

                /* JADX INFO: renamed from: q0, reason: collision with root package name */
                public final /* synthetic */ SessionDatastoreImpl f48842q0;

                /* JADX INFO: renamed from: com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2$1, reason: invalid class name */
                /* JADX INFO: compiled from: Emitters.kt */
                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                @DebugMetadata(c = "com.google.firebase.sessions.SessionDatastoreImpl$special$$inlined$map$1$2", f = "SessionDatastore.kt", i = {}, l = {224}, m = "emit", n = {}, s = {})
                public static final class AnonymousClass1 extends ContinuationImpl {

                    /* JADX INFO: renamed from: p0, reason: collision with root package name */
                    public /* synthetic */ Object f48843p0;

                    /* JADX INFO: renamed from: q0, reason: collision with root package name */
                    public int f48844q0;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.f48843p0 = obj;
                        this.f48844q0 |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, SessionDatastoreImpl sessionDatastoreImpl) {
                    this.f48841p0 = flowCollector;
                    this.f48842q0 = sessionDatastoreImpl;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(Object obj, @NotNull Continuation continuation) {
                    AnonymousClass1 anonymousClass1;
                    if (continuation instanceof AnonymousClass1) {
                        anonymousClass1 = (AnonymousClass1) continuation;
                        int i10 = anonymousClass1.f48844q0;
                        if ((i10 & Integer.MIN_VALUE) != 0) {
                            anonymousClass1.f48844q0 = i10 - Integer.MIN_VALUE;
                        } else {
                            anonymousClass1 = new AnonymousClass1(continuation);
                        }
                    } else {
                        anonymousClass1 = new AnonymousClass1(continuation);
                    }
                    Object obj2 = anonymousClass1.f48843p0;
                    Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
                    int i11 = anonymousClass1.f48844q0;
                    if (i11 == 0) {
                        ResultKt.throwOnFailure(obj2);
                        FirebaseSessionsData firebaseSessionsDataAccess$mapSessionsData = SessionDatastoreImpl.access$mapSessionsData(this.f48842q0, (Preferences) obj);
                        anonymousClass1.f48844q0 = 1;
                        if (this.f48841p0.emit(firebaseSessionsDataAccess$mapSessionsData, anonymousClass1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj2);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector<? super FirebaseSessionsData> flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowM5982catch.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == ek.a.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
            }
        };
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(backgroundDispatcher), null, null, new a(null), 3, null);
    }

    public static final FirebaseSessionsData access$mapSessionsData(SessionDatastoreImpl sessionDatastoreImpl, Preferences preferences) {
        sessionDatastoreImpl.getClass();
        return new FirebaseSessionsData((String) preferences.get(c.f48831a));
    }

    @Override // com.google.firebase.sessions.SessionDatastore
    @Nullable
    public String getCurrentSessionId() {
        FirebaseSessionsData firebaseSessionsData = this.f48825c.get();
        if (firebaseSessionsData != null) {
            return firebaseSessionsData.getSessionId();
        }
        return null;
    }

    @Override // com.google.firebase.sessions.SessionDatastore
    public void updateSessionId(@NotNull String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f48824b), null, null, new e(sessionId, null), 3, null);
    }
}
