package com.google.firebase.sessions;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.android.datatransport.TransportFactory;
import com.google.firebase.FirebaseApp;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.annotations.concurrent.Blocking;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.Qualified;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import com.google.firebase.sessions.settings.SessionsSettings;
import ig.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import mg.b;
import mg.c;
import mg.d;
import mg.e;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FirebaseSessionsRegistrar.kt */
/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0001\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0007\u0010\bJ6\u0010\u0006\u001a0\u0012,\u0012*\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0014\u0012\u000e\b\u0001\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u00030\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/google/firebase/sessions/FirebaseSessionsRegistrar;", "Lcom/google/firebase/components/ComponentRegistrar;", "", "Lcom/google/firebase/components/Component;", "", "kotlin.jvm.PlatformType", "getComponents", "<init>", "()V", "Companion", "a", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 7, 1})
public final class FirebaseSessionsRegistrar implements ComponentRegistrar {

    @Deprecated
    @NotNull
    private static final String LIBRARY_NAME = "fire-sessions";

    @NotNull
    private static final a Companion = new a();

    @Deprecated
    private static final Qualified<FirebaseApp> firebaseApp = Qualified.unqualified(FirebaseApp.class);

    @Deprecated
    private static final Qualified<FirebaseInstallationsApi> firebaseInstallationsApi = Qualified.unqualified(FirebaseInstallationsApi.class);

    @Deprecated
    private static final Qualified<CoroutineDispatcher> backgroundDispatcher = Qualified.qualified(Background.class, CoroutineDispatcher.class);

    @Deprecated
    private static final Qualified<CoroutineDispatcher> blockingDispatcher = Qualified.qualified(Blocking.class, CoroutineDispatcher.class);

    @Deprecated
    private static final Qualified<TransportFactory> transportFactory = Qualified.unqualified(TransportFactory.class);

    @Deprecated
    private static final Qualified<SessionFirelogPublisher> sessionFirelogPublisher = Qualified.unqualified(SessionFirelogPublisher.class);

    @Deprecated
    private static final Qualified<SessionGenerator> sessionGenerator = Qualified.unqualified(SessionGenerator.class);

    @Deprecated
    private static final Qualified<SessionsSettings> sessionsSettings = Qualified.unqualified(SessionsSettings.class);

    /* JADX INFO: compiled from: FirebaseSessionsRegistrar.kt */
    public static final class a {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getComponents$lambda-0, reason: not valid java name */
    public static final FirebaseSessions m5286getComponents$lambda0(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(obj, "container[firebaseApp]");
        Object obj2 = componentContainer.get(sessionsSettings);
        Intrinsics.checkNotNullExpressionValue(obj2, "container[sessionsSettings]");
        Object obj3 = componentContainer.get(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj3, "container[backgroundDispatcher]");
        return new FirebaseSessions((FirebaseApp) obj, (SessionsSettings) obj2, (CoroutineContext) obj3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getComponents$lambda-1, reason: not valid java name */
    public static final SessionGenerator m5287getComponents$lambda1(ComponentContainer componentContainer) {
        return new SessionGenerator(WallClock.INSTANCE, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getComponents$lambda-2, reason: not valid java name */
    public static final SessionFirelogPublisher m5288getComponents$lambda2(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(obj, "container[firebaseApp]");
        FirebaseApp firebaseApp2 = (FirebaseApp) obj;
        Object obj2 = componentContainer.get(firebaseInstallationsApi);
        Intrinsics.checkNotNullExpressionValue(obj2, "container[firebaseInstallationsApi]");
        FirebaseInstallationsApi firebaseInstallationsApi2 = (FirebaseInstallationsApi) obj2;
        Object obj3 = componentContainer.get(sessionsSettings);
        Intrinsics.checkNotNullExpressionValue(obj3, "container[sessionsSettings]");
        SessionsSettings sessionsSettings2 = (SessionsSettings) obj3;
        Provider provider = componentContainer.getProvider(transportFactory);
        Intrinsics.checkNotNullExpressionValue(provider, "container.getProvider(transportFactory)");
        EventGDTLogger eventGDTLogger = new EventGDTLogger(provider);
        Object obj4 = componentContainer.get(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj4, "container[backgroundDispatcher]");
        return new SessionFirelogPublisherImpl(firebaseApp2, firebaseInstallationsApi2, sessionsSettings2, eventGDTLogger, (CoroutineContext) obj4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getComponents$lambda-3, reason: not valid java name */
    public static final SessionsSettings m5289getComponents$lambda3(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(obj, "container[firebaseApp]");
        Object obj2 = componentContainer.get(blockingDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj2, "container[blockingDispatcher]");
        Object obj3 = componentContainer.get(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj3, "container[backgroundDispatcher]");
        Object obj4 = componentContainer.get(firebaseInstallationsApi);
        Intrinsics.checkNotNullExpressionValue(obj4, "container[firebaseInstallationsApi]");
        return new SessionsSettings((FirebaseApp) obj, (CoroutineContext) obj2, (CoroutineContext) obj3, (FirebaseInstallationsApi) obj4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getComponents$lambda-4, reason: not valid java name */
    public static final SessionDatastore m5290getComponents$lambda4(ComponentContainer componentContainer) {
        Context applicationContext = ((FirebaseApp) componentContainer.get(firebaseApp)).getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "container[firebaseApp].applicationContext");
        Object obj = componentContainer.get(backgroundDispatcher);
        Intrinsics.checkNotNullExpressionValue(obj, "container[backgroundDispatcher]");
        return new SessionDatastoreImpl(applicationContext, (CoroutineContext) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getComponents$lambda-5, reason: not valid java name */
    public static final SessionLifecycleServiceBinder m5291getComponents$lambda5(ComponentContainer componentContainer) {
        Object obj = componentContainer.get(firebaseApp);
        Intrinsics.checkNotNullExpressionValue(obj, "container[firebaseApp]");
        return new SessionLifecycleServiceBinderImpl((FirebaseApp) obj);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NotNull
    public List<Component<? extends Object>> getComponents() {
        Component.Builder builderName = Component.builder(FirebaseSessions.class).name(LIBRARY_NAME);
        Qualified<FirebaseApp> qualified = firebaseApp;
        Component.Builder builderAdd = builderName.add(Dependency.required(qualified));
        Qualified<SessionsSettings> qualified2 = sessionsSettings;
        Component.Builder builderAdd2 = builderAdd.add(Dependency.required(qualified2));
        Qualified<CoroutineDispatcher> qualified3 = backgroundDispatcher;
        Component.Builder builderAdd3 = Component.builder(SessionFirelogPublisher.class).name("session-publisher").add(Dependency.required(qualified));
        Qualified<FirebaseInstallationsApi> qualified4 = firebaseInstallationsApi;
        return CollectionsKt__CollectionsKt.listOf((Object[]) new Component[]{builderAdd2.add(Dependency.required(qualified3)).factory(new b()).eagerInDefaultApp().build(), Component.builder(SessionGenerator.class).name("session-generator").factory(new c()).build(), builderAdd3.add(Dependency.required(qualified4)).add(Dependency.required(qualified2)).add(Dependency.requiredProvider(transportFactory)).add(Dependency.required(qualified3)).factory(new d()).build(), Component.builder(SessionsSettings.class).name("sessions-settings").add(Dependency.required(qualified)).add(Dependency.required(blockingDispatcher)).add(Dependency.required(qualified3)).add(Dependency.required(qualified4)).factory(new f(2)).build(), Component.builder(SessionDatastore.class).name("sessions-datastore").add(Dependency.required(qualified)).add(Dependency.required(qualified3)).factory(new e()).build(), Component.builder(SessionLifecycleServiceBinder.class).name("sessions-service-binder").add(Dependency.required(qualified)).factory(new mg.f()).build(), LibraryVersionComponent.create(LIBRARY_NAME, "1.2.0")});
    }
}
