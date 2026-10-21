package com.bbva.push.firebase;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import bk.q;
import com.bbva.plugin.push.command.UnregisterCommand;
import com.bbva.push.creator.DefaultNotificationCreator;
import com.bbva.push.creator.NotificationCreator;
import com.bbva.push.firebase.model.Configuration;
import com.bbva.push.firebase.model.ConfigurationKt;
import com.bbva.push.handler.PushHandler;
import com.bbva.push.inbox.Inbox;
import com.bbva.push.model.NotificationChannel;
import com.bbva.push.model.Push;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.TuplesKt;
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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FirebasePushHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0001#B\u0011\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J*\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0013\u0010\u000e\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u000fJ\u001e\u0010\u0016\u001a\u00020\u00152\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0016J!\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u000fJ\u001b\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u0012H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006$"}, d2 = {"Lcom/bbva/push/firebase/FirebasePushHandler;", "Lcom/bbva/push/handler/PushHandler;", "Landroid/content/Context;", "context", "Lcom/bbva/push/model/Push;", "push", "", "defaultIcon", "Lcom/bbva/push/model/NotificationChannel;", "defaultChannel", "Landroidx/core/app/NotificationCompat$Builder;", "createNotification", "", "canHandlePush", "register", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", UnregisterCommand.ID, "", "", "", "configurationOptions", "", "configure", "getConfiguration", "topic", "subscribeToTopic", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unsubscribeFromTopic", "getId", "()Ljava/lang/String;", "id", "Lcom/bbva/push/creator/NotificationCreator;", "notificationCreator", "<init>", "(Lcom/bbva/push/creator/NotificationCreator;)V", "Companion", "firebase-push_release"}, k = 1, mv = {1, 8, 0})
public final class FirebasePushHandler implements PushHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final NotificationCreator f36208a;

    /* JADX INFO: compiled from: FirebasePushHandler.kt */
    public static final class a extends Lambda implements Function1<FirebaseMessaging, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f36209p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Map<String, ? extends Object> map) {
            super(1);
            this.f36209p0 = map;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(FirebaseMessaging firebaseMessaging) {
            FirebaseMessaging it = firebaseMessaging;
            Intrinsics.checkNotNullParameter(it, "it");
            Configuration configuration = ConfigurationKt.toConfiguration(this.f36209p0);
            it.setAutoInitEnabled(configuration.isAutoInitEnabled());
            it.setNotificationDelegationEnabled(configuration.isNotificationDelegationEnabled());
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: FirebasePushHandler.kt */
    public static final class b extends Lambda implements Function1<FirebaseMessaging, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f36210p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Continuation<Boolean> f36211q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, SafeContinuation safeContinuation) {
            super(1);
            this.f36210p0 = str;
            this.f36211q0 = safeContinuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(FirebaseMessaging firebaseMessaging) {
            FirebaseMessaging it = firebaseMessaging;
            Intrinsics.checkNotNullParameter(it, "it");
            it.subscribeToTopic(this.f36210p0).addOnCompleteListener(new com.bbva.push.firebase.a(this.f36211q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: FirebasePushHandler.kt */
    public static final class c extends Lambda implements Function1<FirebaseMessaging, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f36212p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Continuation<Boolean> f36213q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, SafeContinuation safeContinuation) {
            super(1);
            this.f36212p0 = str;
            this.f36213q0 = safeContinuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(FirebaseMessaging firebaseMessaging) {
            FirebaseMessaging it = firebaseMessaging;
            Intrinsics.checkNotNullParameter(it, "it");
            it.unsubscribeFromTopic(this.f36212p0).addOnCompleteListener(new com.bbva.push.firebase.b(this.f36213q0));
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FirebasePushHandler() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.bbva.push.handler.PushHandler
    public boolean canHandlePush(@NotNull Push push) {
        Intrinsics.checkNotNullParameter(push, "push");
        return true;
    }

    @Override // com.bbva.push.handler.PushHandler
    public void configure(@NotNull Map<String, ? extends Object> configurationOptions) {
        Intrinsics.checkNotNullParameter(configurationOptions, "configurationOptions");
        a aVar = new a(configurationOptions);
        FirebaseMessaging firebaseMessaging = FirebaseMessaging.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseMessaging, "getInstance()");
        aVar.invoke(firebaseMessaging);
        Unit unit = Unit.INSTANCE;
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public NotificationCompat.Builder createNotification(@NotNull Context context, @NotNull Push push, int defaultIcon, @NotNull NotificationChannel defaultChannel) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(push, "push");
        Intrinsics.checkNotNullParameter(defaultChannel, "defaultChannel");
        return this.f36208a.createNotificationBuilder(context, defaultIcon, defaultChannel, push);
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public Object getConfiguration(@NotNull Continuation<? super Map<String, ? extends Object>> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        FirebaseMessaging firebaseMessaging = FirebaseMessaging.getInstance();
        safeContinuation.resumeWith(Result.m5535constructorimpl(q.mapOf(TuplesKt.to("isAutoInitEnabled", Boxing.boxBoolean(firebaseMessaging.isAutoInitEnabled())), TuplesKt.to("isNotificationDelegationEnabled", Boxing.boxBoolean(firebaseMessaging.isNotificationDelegationEnabled())))));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.bbva.push.handler.PushHandler
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF36222b() {
        return "firebase";
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
        b bVar = new b(str, safeContinuation);
        FirebaseMessaging firebaseMessaging = FirebaseMessaging.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseMessaging, "getInstance()");
        bVar.invoke(firebaseMessaging);
        Unit unit = Unit.INSTANCE;
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public Object token(@NotNull Continuation<? super String> continuation) {
        return PushHandler.DefaultImpls.token(this, continuation);
    }

    @Override // com.bbva.push.handler.PushHandler
    @Nullable
    public Object unregister(@NotNull Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(false);
    }

    @Nullable
    public final Object unsubscribeFromTopic(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        c cVar = new c(str, safeContinuation);
        FirebaseMessaging firebaseMessaging = FirebaseMessaging.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseMessaging, "getInstance()");
        cVar.invoke(firebaseMessaging);
        Unit unit = Unit.INSTANCE;
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public FirebasePushHandler(@NotNull NotificationCreator notificationCreator) {
        Intrinsics.checkNotNullParameter(notificationCreator, "notificationCreator");
        this.f36208a = notificationCreator;
    }

    public /* synthetic */ FirebasePushHandler(NotificationCreator notificationCreator, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new DefaultNotificationCreator() : notificationCreator);
    }
}
