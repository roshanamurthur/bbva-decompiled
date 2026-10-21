package com.google.firebase.sessions.api;

import androidx.annotation.VisibleForTesting;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FirebaseSessionsDependencies.kt */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0011J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u001f\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00020\tH\u0080@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lcom/google/firebase/sessions/api/FirebaseSessionsDependencies;", "", "Lcom/google/firebase/sessions/api/SessionSubscriber;", "subscriber", "", "register", "Lcom/google/firebase/sessions/api/SessionSubscriber$Name;", "subscriberName", "addDependency", "", "getRegisteredSubscribers$com_google_firebase_firebase_sessions", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRegisteredSubscribers", "getSubscriber$com_google_firebase_firebase_sessions", "(Lcom/google/firebase/sessions/api/SessionSubscriber$Name;)Lcom/google/firebase/sessions/api/SessionSubscriber;", "getSubscriber", "reset$com_google_firebase_firebase_sessions", "()V", "reset", "<init>", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final class FirebaseSessionsDependencies {

    @NotNull
    public static final FirebaseSessionsDependencies INSTANCE = new FirebaseSessionsDependencies();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<SessionSubscriber.Name, a> f48903a = Collections.synchronizedMap(new LinkedHashMap());

    /* JADX INFO: compiled from: FirebaseSessionsDependencies.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        public final Mutex f48904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public SessionSubscriber f48905b;

        public a(Mutex mutex) {
            Intrinsics.checkNotNullParameter(mutex, "mutex");
            this.f48904a = mutex;
            this.f48905b = null;
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f48904a, aVar.f48904a) && Intrinsics.areEqual(this.f48905b, aVar.f48905b);
        }

        public final int hashCode() {
            int iHashCode = this.f48904a.hashCode() * 31;
            SessionSubscriber sessionSubscriber = this.f48905b;
            return iHashCode + (sessionSubscriber == null ? 0 : sessionSubscriber.hashCode());
        }

        @NotNull
        public final String toString() {
            return "Dependency(mutex=" + this.f48904a + ", subscriber=" + this.f48905b + RootService.CLOSE_BRACKET;
        }
    }

    /* JADX INFO: compiled from: FirebaseSessionsDependencies.kt */
    @DebugMetadata(c = "com.google.firebase.sessions.api.FirebaseSessionsDependencies", f = "FirebaseSessionsDependencies.kt", i = {0, 0, 0}, l = {123}, m = "getRegisteredSubscribers$com_google_firebase_firebase_sessions", n = {"destination$iv$iv", "subscriberName", "$this$withLock_u24default$iv"}, s = {"L$0", "L$2", "L$3"})
    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public Map f48906p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public Iterator f48907q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public SessionSubscriber.Name f48908r0;

        /* JADX INFO: renamed from: s0, reason: collision with root package name */
        public Mutex f48909s0;

        /* JADX INFO: renamed from: t0, reason: collision with root package name */
        public Map f48910t0;

        /* JADX INFO: renamed from: u0, reason: collision with root package name */
        public Object f48911u0;
        public /* synthetic */ Object v0;

        /* JADX INFO: renamed from: x0, reason: collision with root package name */
        public int f48913x0;

        public b(Continuation<? super b> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.v0 = obj;
            this.f48913x0 |= Integer.MIN_VALUE;
            return FirebaseSessionsDependencies.this.getRegisteredSubscribers$com_google_firebase_firebase_sessions(this);
        }
    }

    public static a a(SessionSubscriber.Name name) {
        Map<SessionSubscriber.Name, a> dependencies = f48903a;
        Intrinsics.checkNotNullExpressionValue(dependencies, "dependencies");
        a aVar = dependencies.get(name);
        if (aVar != null) {
            Intrinsics.checkNotNullExpressionValue(aVar, "dependencies.getOrElse(s…load time.\"\n      )\n    }");
            return aVar;
        }
        throw new IllegalStateException("Cannot get dependency " + name + ". Dependencies should be added at class load time.");
    }

    @JvmStatic
    public static final void register(@NotNull SessionSubscriber subscriber) {
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        SessionSubscriber.Name sessionSubscriberName = subscriber.getSessionSubscriberName();
        INSTANCE.getClass();
        a aVarA = a(sessionSubscriberName);
        if (aVarA.f48905b != null) {
            Objects.toString(sessionSubscriberName);
            return;
        }
        aVarA.f48905b = subscriber;
        Objects.toString(sessionSubscriberName);
        Mutex.DefaultImpls.unlock$default(aVarA.f48904a, null, 1, null);
    }

    public final void addDependency(@NotNull SessionSubscriber.Name subscriberName) {
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        if (subscriberName == SessionSubscriber.Name.PERFORMANCE) {
            throw new IllegalArgumentException("Incompatible versions of Firebase Perf and Firebase Sessions.\nA safe combination would be:\n  firebase-sessions:1.1.0\n  firebase-crashlytics:18.5.0\n  firebase-perf:20.5.0\nFor more information contact Firebase Support.");
        }
        Map<SessionSubscriber.Name, a> dependencies = f48903a;
        if (dependencies.containsKey(subscriberName)) {
            Objects.toString(subscriberName);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(dependencies, "dependencies");
        dependencies.put(subscriberName, new a(MutexKt.Mutex(true)));
        Objects.toString(subscriberName);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x006b  */
    /* JADX WARN: Code duplicated, block: B:19:0x009b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x009c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x009c -> B:27:0x009d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getRegisteredSubscribers$com_google_firebase_firebase_sessions(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super java.util.Map<com.google.firebase.sessions.api.SessionSubscriber.Name, ? extends com.google.firebase.sessions.api.SessionSubscriber>> r11) {
        /*
            r10 = this;
            boolean r0 = r11 instanceof com.google.firebase.sessions.api.FirebaseSessionsDependencies.b
            if (r0 == 0) goto L13
            r0 = r11
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$b r0 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.b) r0
            int r1 = r0.f48913x0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f48913x0 = r1
            goto L18
        L13:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$b r0 = new com.google.firebase.sessions.api.FirebaseSessionsDependencies$b
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.v0
            java.lang.Object r1 = ek.a.getCOROUTINE_SUSPENDED()
            int r2 = r0.f48913x0
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 != r4) goto L3a
            java.lang.Object r2 = r0.f48911u0
            java.util.Map r5 = r0.f48910t0
            java.util.Map r5 = (java.util.Map) r5
            kotlinx.coroutines.sync.Mutex r6 = r0.f48909s0
            com.google.firebase.sessions.api.SessionSubscriber$Name r7 = r0.f48908r0
            java.util.Iterator r8 = r0.f48907q0
            java.util.Map r9 = r0.f48906p0
            java.util.Map r9 = (java.util.Map) r9
            kotlin.ResultKt.throwOnFailure(r11)
            goto L9d
        L3a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L42:
            kotlin.ResultKt.throwOnFailure(r11)
            java.util.Map<com.google.firebase.sessions.api.SessionSubscriber$Name, com.google.firebase.sessions.api.FirebaseSessionsDependencies$a> r11 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.f48903a
            java.lang.String r2 = "dependencies"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            int r5 = r11.size()
            int r5 = bk.p.mapCapacity(r5)
            r2.<init>(r5)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
            r8 = r11
            r5 = r2
        L65:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto Lb0
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r2 = r11.getKey()
            java.lang.Object r6 = r11.getKey()
            r7 = r6
            com.google.firebase.sessions.api.SessionSubscriber$Name r7 = (com.google.firebase.sessions.api.SessionSubscriber.Name) r7
            java.lang.Object r11 = r11.getValue()
            com.google.firebase.sessions.api.FirebaseSessionsDependencies$a r11 = (com.google.firebase.sessions.api.FirebaseSessionsDependencies.a) r11
            kotlinx.coroutines.sync.Mutex r6 = r11.f48904a
            r11 = r5
            java.util.Map r11 = (java.util.Map) r11
            r0.f48906p0 = r11
            r0.f48907q0 = r8
            r0.f48908r0 = r7
            r0.f48909s0 = r6
            r0.f48910t0 = r11
            r0.f48911u0 = r2
            r0.f48913x0 = r4
            java.lang.Object r11 = r6.lock(r3, r0)
            if (r11 != r1) goto L9c
            return r1
        L9c:
            r9 = r5
        L9d:
            com.google.firebase.sessions.api.FirebaseSessionsDependencies r11 = com.google.firebase.sessions.api.FirebaseSessionsDependencies.INSTANCE     // Catch: java.lang.Throwable -> Lab
            com.google.firebase.sessions.api.SessionSubscriber r11 = r11.getSubscriber$com_google_firebase_firebase_sessions(r7)     // Catch: java.lang.Throwable -> Lab
            r6.unlock(r3)
            r5.put(r2, r11)
            r5 = r9
            goto L65
        Lab:
            r11 = move-exception
            r6.unlock(r3)
            throw r11
        Lb0:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.sessions.api.FirebaseSessionsDependencies.getRegisteredSubscribers$com_google_firebase_firebase_sessions(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @VisibleForTesting
    @NotNull
    public final SessionSubscriber getSubscriber$com_google_firebase_firebase_sessions(@NotNull SessionSubscriber.Name subscriberName) {
        Intrinsics.checkNotNullParameter(subscriberName, "subscriberName");
        SessionSubscriber sessionSubscriber = a(subscriberName).f48905b;
        if (sessionSubscriber != null) {
            return sessionSubscriber;
        }
        throw new IllegalStateException("Subscriber " + subscriberName + " has not been registered.");
    }

    @VisibleForTesting
    public final void reset$com_google_firebase_firebase_sessions() {
        f48903a.clear();
    }
}
