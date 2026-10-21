package com.bbva.push.firebase;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.bbva.plugin.push.command.UnregisterCommand;
import com.bbva.push.creator.DefaultNotificationCreator;
import com.bbva.push.creator.NotificationCreator;
import com.bbva.push.firebase.model.Configuration;
import com.bbva.push.firebase.model.ConfigurationKt;
import com.bbva.push.handler.PushHandler;
import com.bbva.push.inbox.Inbox;
import com.bbva.push.model.NotificationChannel;
import com.bbva.push.model.Push;
import com.bbva.push.model.RawMessage;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseOptions;
import com.google.firebase.ktx.Firebase;
import com.google.firebase.ktx.FirebaseKt;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.RemoteMessage;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ManualFirebasePushHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0012\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J*\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u000e\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u001e\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0016J!\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u000fJ\u001b\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001aJ\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0012H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u000fR\u0014\u0010\u001f\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/bbva/push/firebase/ManualFirebasePushHandler;", "Lcom/bbva/push/handler/PushHandler;", "Landroid/content/Context;", "context", "Lcom/bbva/push/model/Push;", "push", "", "defaultIcon", "Lcom/bbva/push/model/NotificationChannel;", "defaultChannel", "Landroidx/core/app/NotificationCompat$Builder;", "createNotification", "", "canHandlePush", "register", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", UnregisterCommand.ID, "", "", "", "configurationOptions", "", "configure", "getConfiguration", "topic", "subscribeToTopic", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unsubscribeFromTopic", "token", "getId", "()Ljava/lang/String;", "id", "handlerId", "Lcom/google/firebase/FirebaseOptions;", "options", "Lcom/bbva/push/creator/NotificationCreator;", "notificationCreator", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lcom/google/firebase/FirebaseOptions;Lcom/bbva/push/creator/NotificationCreator;)V", "firebase-push_release"}, k = 1, mv = {1, 8, 0})
public class ManualFirebasePushHandler implements PushHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Context f36221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f36222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    public final NotificationCreator f36223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public String f36224d;

    /* JADX INFO: compiled from: ManualFirebasePushHandler.kt */
    public static final class a extends Lambda implements Function1<FirebaseMessaging, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f36225p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, ? extends Object> map) {
            super(1);
            this.f36225p0 = map;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(FirebaseMessaging firebaseMessaging) {
            FirebaseMessaging it = firebaseMessaging;
            Intrinsics.checkNotNullParameter(it, "it");
            Configuration configuration = ConfigurationKt.toConfiguration(this.f36225p0);
            it.setAutoInitEnabled(configuration.isAutoInitEnabled());
            it.setNotificationDelegationEnabled(configuration.isNotificationDelegationEnabled());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ManualFirebasePushHandler.kt */
    public static final class b extends Lambda implements Function1<FirebaseMessaging, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f36226p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Continuation<Boolean> f36227q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, SafeContinuation safeContinuation) {
            super(1);
            this.f36226p0 = str;
            this.f36227q0 = safeContinuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(FirebaseMessaging firebaseMessaging) {
            FirebaseMessaging it = firebaseMessaging;
            Intrinsics.checkNotNullParameter(it, "it");
            it.subscribeToTopic(this.f36226p0).addOnCompleteListener(new com.bbva.push.firebase.c(this.f36227q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: ManualFirebasePushHandler.kt */
    public static final class c extends Lambda implements Function1<FirebaseMessaging, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f36228p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Continuation<Boolean> f36229q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, SafeContinuation safeContinuation) {
            super(1);
            this.f36228p0 = str;
            this.f36229q0 = safeContinuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(FirebaseMessaging firebaseMessaging) {
            FirebaseMessaging it = firebaseMessaging;
            Intrinsics.checkNotNullParameter(it, "it");
            it.unsubscribeFromTopic(this.f36228p0).addOnCompleteListener(new d(this.f36229q0));
            return Unit.INSTANCE;
        }
    }

    public ManualFirebasePushHandler(@NotNull Context context, @NotNull String handlerId, @Nullable FirebaseOptions firebaseOptions, @NotNull NotificationCreator notificationCreator) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(handlerId, "handlerId");
        Intrinsics.checkNotNullParameter(notificationCreator, "notificationCreator");
        this.f36221a = context;
        this.f36222b = handlerId;
        this.f36223c = notificationCreator;
        if (firebaseOptions != null) {
            this.f36224d = firebaseOptions.getApplicationId();
            FirebaseKt.initialize(Firebase.INSTANCE, context, firebaseOptions, handlerId);
        }
    }

    public final void a(Function1 function1) {
        Object obj = FirebaseKt.app(Firebase.INSTANCE, this.f36222b).get(FirebaseMessaging.class);
        Intrinsics.checkNotNullExpressionValue(obj, "Firebase.app(handlerId)\n…aseMessaging::class.java)");
        function1.invoke(obj);
        Unit unit = Unit.INSTANCE;
    }

    @Override // com.bbva.push.handler.PushHandler
    public boolean canHandlePush(@NotNull Push push) {
        Intrinsics.checkNotNullParameter(push, "push");
        if (this.f36224d == null) {
            return false;
        }
        RawMessage rawMessage = push.getNotification().getRawMessage();
        Object raw = rawMessage != null ? rawMessage.getRaw() : null;
        if (raw instanceof RemoteMessage) {
            RemoteMessage remoteMessage = (RemoteMessage) raw;
            if (remoteMessage.getFrom() != null) {
                String str = this.f36224d;
                Intrinsics.checkNotNull(str);
                String from = remoteMessage.getFrom();
                Intrinsics.checkNotNull(from);
                return StringsKt__StringsKt.contains$default((CharSequence) str, (CharSequence) from, false, 2, (Object) null);
            }
        }
        return false;
    }

    @Override // com.bbva.push.handler.PushHandler
    public void configure(@NotNull Map<String, ? extends Object> configurationOptions) {
        Intrinsics.checkNotNullParameter(configurationOptions, "configurationOptions");
        if (this.f36224d != null) {
            a(new a(configurationOptions));
            return;
        }
        FirebaseOptions firebaseOptions = ConfigurationKt.toFirebaseOptions(configurationOptions);
        if (firebaseOptions != null) {
            this.f36224d = firebaseOptions.getApplicationId();
            FirebaseKt.initialize(Firebase.INSTANCE, this.f36221a, firebaseOptions, this.f36222b);
        }
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public NotificationCompat.Builder createNotification(@NotNull Context context, @NotNull Push push, int defaultIcon, @NotNull NotificationChannel defaultChannel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(push, "push");
        Intrinsics.checkNotNullParameter(defaultChannel, "defaultChannel");
        return this.f36223c.createNotificationBuilder(context, defaultIcon, defaultChannel, push);
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public Object getConfiguration(@NotNull Continuation<? super Map<String, ? extends Object>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        a(new pb.b(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.bbva.push.handler.PushHandler
    @NotNull
    /* JADX INFO: renamed from: getId, reason: from getter */
    public String getF36222b() {
        return this.f36222b;
    }

    @Override // com.bbva.push.handler.PushHandler
    @NotNull
    public Inbox getInbox() {
        return PushHandler.DefaultImpls.getInbox(this);
    }

    @Override // com.bbva.push.handler.PushHandler
    public void onNewToken(@NotNull String str) {
        PushHandler.DefaultImpls.onNewToken(this, str);
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public Object register(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(true);
    }

    @Nullable
    public final Object subscribeToTopic(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        a(new b(str, safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public Object token(@NotNull Continuation<? super String> continuation) {
        return Tasks.await(((FirebaseMessaging) FirebaseKt.app(Firebase.INSTANCE, this.f36222b).get(FirebaseMessaging.class)).getToken());
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public Object unregister(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(false);
    }

    @Nullable
    public final Object unsubscribeFromTopic(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        a(new c(str, safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public /* synthetic */ ManualFirebasePushHandler(Context context, String str, FirebaseOptions firebaseOptions, NotificationCreator notificationCreator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? null : firebaseOptions, (i10 & 8) != 0 ? new DefaultNotificationCreator() : notificationCreator);
    }
}
