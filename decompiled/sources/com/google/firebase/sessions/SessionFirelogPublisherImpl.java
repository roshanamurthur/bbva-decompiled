package com.google.firebase.sessions;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.api.FirebaseSessionsDependencies;
import com.google.firebase.sessions.api.SessionSubscriber;
import com.google.firebase.sessions.settings.SessionsSettings;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.tasks.TasksKt;
import mg.g;
import mg.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SessionFirelogPublisher.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B/\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0013"}, d2 = {"Lcom/google/firebase/sessions/SessionFirelogPublisherImpl;", "Lcom/google/firebase/sessions/SessionFirelogPublisher;", "Lcom/google/firebase/sessions/SessionDetails;", "sessionDetails", "", "logSession", "Lcom/google/firebase/FirebaseApp;", "firebaseApp", "Lcom/google/firebase/installations/FirebaseInstallationsApi;", "firebaseInstallations", "Lcom/google/firebase/sessions/settings/SessionsSettings;", "sessionSettings", "Lcom/google/firebase/sessions/EventGDTLoggerInterface;", "eventGDTLogger", "Lkotlin/coroutines/CoroutineContext;", "backgroundDispatcher", "<init>", "(Lcom/google/firebase/FirebaseApp;Lcom/google/firebase/installations/FirebaseInstallationsApi;Lcom/google/firebase/sessions/settings/SessionsSettings;Lcom/google/firebase/sessions/EventGDTLoggerInterface;Lkotlin/coroutines/CoroutineContext;)V", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final class SessionFirelogPublisherImpl implements SessionFirelogPublisher {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final double f48855f = Math.random();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final FirebaseApp f48856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final FirebaseInstallationsApi f48857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final SessionsSettings f48858c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final EventGDTLoggerInterface f48859d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    public final CoroutineContext f48860e;

    /* JADX INFO: compiled from: SessionFirelogPublisher.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.SessionFirelogPublisherImpl$logSession$1", f = "SessionFirelogPublisher.kt", i = {}, l = {64, 72, 73}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public final /* synthetic */ SessionDetails E0;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public SessionFirelogPublisherImpl f48861p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public SessionEvents f48862q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public FirebaseApp f48863r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public SessionDetails f48864s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public SessionsSettings f48865t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public ProcessDetails f48866u0;
        public List v0;

        /* JADX INFO: renamed from: w0, reason: collision with root package name */
        public Map f48867w0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public int f48868x0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SessionDetails sessionDetails, Continuation<? super a> continuation) {
            super(2, continuation);
            this.E0 = sessionDetails;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return SessionFirelogPublisherImpl.this.new a(this.E0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00db A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x00dc  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            SessionsSettings sessionsSettings;
            SessionEvents sessionEvents;
            ProcessDetails processDetails;
            FirebaseApp firebaseApp;
            List<ProcessDetails> list;
            SessionDetails sessionDetails;
            SessionFirelogPublisherImpl sessionFirelogPublisherImpl;
            Map<SessionSubscriber.Name, ? extends SessionSubscriber> map;
            Object objAccess$getFirebaseInstallationId;
            List<ProcessDetails> list2;
            FirebaseApp firebaseApp2;
            SessionEvents sessionEvents2;
            Map<SessionSubscriber.Name, ? extends SessionSubscriber> map2;
            SessionDetails sessionDetails2;
            ProcessDetails processDetails2;
            SessionsSettings sessionsSettings2;
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f48868x0;
            SessionFirelogPublisherImpl sessionFirelogPublisherImpl2 = SessionFirelogPublisherImpl.this;
            if (i10 != 0) {
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else if (i10 == 2) {
                    list = this.v0;
                    processDetails = this.f48866u0;
                    sessionsSettings = this.f48865t0;
                    sessionDetails = this.f48864s0;
                    firebaseApp = this.f48863r0;
                    sessionEvents = this.f48862q0;
                    sessionFirelogPublisherImpl = this.f48861p0;
                    ResultKt.throwOnFailure(obj);
                    map = (Map) obj;
                    this.f48861p0 = sessionFirelogPublisherImpl;
                    this.f48862q0 = sessionEvents;
                    this.f48863r0 = firebaseApp;
                    this.f48864s0 = sessionDetails;
                    this.f48865t0 = sessionsSettings;
                    this.f48866u0 = processDetails;
                    this.v0 = list;
                    this.f48867w0 = map;
                    this.f48868x0 = 3;
                    objAccess$getFirebaseInstallationId = SessionFirelogPublisherImpl.access$getFirebaseInstallationId(sessionFirelogPublisherImpl2, this);
                    if (objAccess$getFirebaseInstallationId == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    list2 = list;
                    firebaseApp2 = firebaseApp;
                    sessionEvents2 = sessionEvents;
                    SessionDetails sessionDetails3 = sessionDetails;
                    map2 = map;
                    obj = objAccess$getFirebaseInstallationId;
                    sessionDetails2 = sessionDetails3;
                    SessionsSettings sessionsSettings3 = sessionsSettings;
                    processDetails2 = processDetails;
                    sessionsSettings2 = sessionsSettings3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Map<SessionSubscriber.Name, ? extends SessionSubscriber> map3 = this.f48867w0;
                    List<ProcessDetails> list3 = this.v0;
                    ProcessDetails processDetails3 = this.f48866u0;
                    sessionsSettings2 = this.f48865t0;
                    SessionDetails sessionDetails4 = this.f48864s0;
                    FirebaseApp firebaseApp3 = this.f48863r0;
                    SessionEvents sessionEvents3 = this.f48862q0;
                    SessionFirelogPublisherImpl sessionFirelogPublisherImpl3 = this.f48861p0;
                    ResultKt.throwOnFailure(obj);
                    sessionFirelogPublisherImpl = sessionFirelogPublisherImpl3;
                    map2 = map3;
                    sessionEvents2 = sessionEvents3;
                    list2 = list3;
                    firebaseApp2 = firebaseApp3;
                    processDetails2 = processDetails3;
                    sessionDetails2 = sessionDetails4;
                }
                Intrinsics.checkNotNullExpressionValue(obj, "getFirebaseInstallationId()");
                SessionFirelogPublisherImpl.access$attemptLoggingSessionEvent(sessionFirelogPublisherImpl, sessionEvents2.buildSession(firebaseApp2, sessionDetails2, sessionsSettings2, processDetails2, list2, map2, (String) obj));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            this.f48868x0 = 1;
            obj = SessionFirelogPublisherImpl.access$shouldLogSession(sessionFirelogPublisherImpl2, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            if (((Boolean) obj).booleanValue()) {
                SessionEvents sessionEvents4 = SessionEvents.INSTANCE;
                FirebaseApp firebaseApp4 = sessionFirelogPublisherImpl2.f48856a;
                sessionsSettings = sessionFirelogPublisherImpl2.f48858c;
                ProcessDetailsProvider processDetailsProvider = ProcessDetailsProvider.INSTANCE;
                Context applicationContext = sessionFirelogPublisherImpl2.f48856a.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "firebaseApp.applicationContext");
                ProcessDetails currentProcessDetails = processDetailsProvider.getCurrentProcessDetails(applicationContext);
                Context applicationContext2 = sessionFirelogPublisherImpl2.f48856a.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext2, "firebaseApp.applicationContext");
                List<ProcessDetails> appProcessDetails = processDetailsProvider.getAppProcessDetails(applicationContext2);
                FirebaseSessionsDependencies firebaseSessionsDependencies = FirebaseSessionsDependencies.INSTANCE;
                this.f48861p0 = sessionFirelogPublisherImpl2;
                this.f48862q0 = sessionEvents4;
                this.f48863r0 = firebaseApp4;
                SessionDetails sessionDetails5 = this.E0;
                this.f48864s0 = sessionDetails5;
                this.f48865t0 = sessionsSettings;
                this.f48866u0 = currentProcessDetails;
                this.v0 = appProcessDetails;
                this.f48868x0 = 2;
                Object registeredSubscribers$com_google_firebase_firebase_sessions = firebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
                if (registeredSubscribers$com_google_firebase_firebase_sessions == coroutine_suspended) {
                    return coroutine_suspended;
                }
                sessionEvents = sessionEvents4;
                obj = registeredSubscribers$com_google_firebase_firebase_sessions;
                processDetails = currentProcessDetails;
                firebaseApp = firebaseApp4;
                list = appProcessDetails;
                sessionDetails = sessionDetails5;
                sessionFirelogPublisherImpl = sessionFirelogPublisherImpl2;
                map = (Map) obj;
                this.f48861p0 = sessionFirelogPublisherImpl;
                this.f48862q0 = sessionEvents;
                this.f48863r0 = firebaseApp;
                this.f48864s0 = sessionDetails;
                this.f48865t0 = sessionsSettings;
                this.f48866u0 = processDetails;
                this.v0 = list;
                this.f48867w0 = map;
                this.f48868x0 = 3;
                objAccess$getFirebaseInstallationId = SessionFirelogPublisherImpl.access$getFirebaseInstallationId(sessionFirelogPublisherImpl2, this);
                if (objAccess$getFirebaseInstallationId == coroutine_suspended) {
                    return coroutine_suspended;
                }
                list2 = list;
                firebaseApp2 = firebaseApp;
                sessionEvents2 = sessionEvents;
                SessionDetails sessionDetails6 = sessionDetails;
                map2 = map;
                obj = objAccess$getFirebaseInstallationId;
                sessionDetails2 = sessionDetails6;
                SessionsSettings sessionsSettings4 = sessionsSettings;
                processDetails2 = processDetails;
                sessionsSettings2 = sessionsSettings4;
                Intrinsics.checkNotNullExpressionValue(obj, "getFirebaseInstallationId()");
                SessionFirelogPublisherImpl.access$attemptLoggingSessionEvent(sessionFirelogPublisherImpl, sessionEvents2.buildSession(firebaseApp2, sessionDetails2, sessionsSettings2, processDetails2, list2, map2, (String) obj));
            }
            return Unit.INSTANCE;
        }
    }

    public SessionFirelogPublisherImpl(@NotNull FirebaseApp firebaseApp, @NotNull FirebaseInstallationsApi firebaseInstallations, @NotNull SessionsSettings sessionSettings, @NotNull EventGDTLoggerInterface eventGDTLogger, @NotNull CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(firebaseInstallations, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(sessionSettings, "sessionSettings");
        Intrinsics.checkNotNullParameter(eventGDTLogger, "eventGDTLogger");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.f48856a = firebaseApp;
        this.f48857b = firebaseInstallations;
        this.f48858c = sessionSettings;
        this.f48859d = eventGDTLogger;
        this.f48860e = backgroundDispatcher;
    }

    public static final void access$attemptLoggingSessionEvent(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, SessionEvent sessionEvent) {
        sessionFirelogPublisherImpl.getClass();
        try {
            sessionFirelogPublisherImpl.f48859d.log(sessionEvent);
            sessionEvent.getSessionData().getSessionId();
        } catch (RuntimeException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$getFirebaseInstallationId(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, Continuation continuation) {
        g gVar;
        sessionFirelogPublisherImpl.getClass();
        if (continuation instanceof g) {
            gVar = (g) continuation;
            int i10 = gVar.f83467r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f83467r0 = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(sessionFirelogPublisherImpl, continuation);
            }
        } else {
            gVar = new g(sessionFirelogPublisherImpl, continuation);
        }
        Object objAwait = gVar.f83465p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = gVar.f83467r0;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(objAwait);
                Task<String> id = sessionFirelogPublisherImpl.f48857b.getId();
                Intrinsics.checkNotNullExpressionValue(id, "firebaseInstallations.id");
                gVar.f83467r0 = 1;
                objAwait = TasksKt.await(id, gVar);
                if (objAwait == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAwait);
            }
            return (String) objAwait;
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$shouldLogSession(SessionFirelogPublisherImpl sessionFirelogPublisherImpl, Continuation continuation) {
        h hVar;
        sessionFirelogPublisherImpl.getClass();
        if (continuation instanceof h) {
            hVar = (h) continuation;
            int i10 = hVar.f83471s0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f83471s0 = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(sessionFirelogPublisherImpl, continuation);
            }
        } else {
            hVar = new h(sessionFirelogPublisherImpl, continuation);
        }
        Object obj = hVar.f83469q0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = hVar.f83471s0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            hVar.f83468p0 = sessionFirelogPublisherImpl;
            hVar.f83471s0 = 1;
            if (sessionFirelogPublisherImpl.f48858c.updateSettings(hVar) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sessionFirelogPublisherImpl = hVar.f83468p0;
            ResultKt.throwOnFailure(obj);
        }
        if (sessionFirelogPublisherImpl.f48858c.getSessionsEnabled()) {
            return f48855f <= sessionFirelogPublisherImpl.f48858c.getSamplingRate() ? Boxing.boxBoolean(true) : Boxing.boxBoolean(false);
        }
        return Boxing.boxBoolean(false);
    }

    @Override // com.google.firebase.sessions.SessionFirelogPublisher
    public void logSession(@NotNull SessionDetails sessionDetails) {
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(this.f48860e), null, null, new a(sessionDetails, null), 3, null);
    }
}
