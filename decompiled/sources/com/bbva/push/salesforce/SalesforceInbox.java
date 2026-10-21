package com.bbva.push.salesforce;

import androidx.camera.core.m1;
import com.bbva.push.inbox.Inbox;
import com.bbva.push.model.MessageBulk;
import com.bbva.push.salesforce.extension.SFMSDKKt;
import com.bbva.push.salesforce.tracker.SalesforceInboxTracker;
import com.bbva.push.tracker.Tracker;
import com.salesforce.marketingcloud.sfmcsdk.modules.push.PushModuleInterface;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: SalesforceInbox.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u0096\u0001J\u001c\u0010\u000e\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bH\u0016J\b\u0010\u000f\u001a\u00020\tH\u0016J\u0010\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\b\u0010\u0012\u001a\u00020\tH\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\u0013\u0010\u0015\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0017\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0014H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0003H\u0016\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/bbva/push/salesforce/SalesforceInbox;", "Lcom/bbva/push/inbox/Inbox;", "Lcom/bbva/push/tracker/Tracker;", "", "notificationId", "action", "", "", "data", "", "track", "Lkotlin/Function1;", "Lcom/bbva/push/model/MessageBulk;", "callback", "getMessages", "removeAllMessages", "id", "removeMessage", "setAllMessagesRead", "setMessageRead", "", "getAllMessagesCount", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllReadMessagesCount", "getAllUnreadMessagesCount", "setMessageUnread", "addFavorite", "removeFavorite", "tracker", "<init>", "(Lcom/bbva/push/tracker/Tracker;)V", "salesforce-push_release"}, k = 1, mv = {1, 9, 0})
public final class SalesforceInbox implements Inbox, Tracker {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Tracker f36252a;

    /* JADX INFO: compiled from: SalesforceInbox.kt */
    public static final class a extends Lambda implements Function1<PushModuleInterface, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Continuation<Integer> f36253p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SafeContinuation safeContinuation) {
            super(1);
            this.f36253p0 = safeContinuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PushModuleInterface pushModuleInterface) {
            PushModuleInterface pushModuleInterface2 = pushModuleInterface;
            Intrinsics.checkNotNullParameter(pushModuleInterface2, "pushModuleInterface");
            Result.Companion companion = Result.INSTANCE;
            this.f36253p0.resumeWith(Result.m5535constructorimpl(Integer.valueOf(pushModuleInterface2.getInboxMessageManager().getMessageCount())));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SalesforceInbox.kt */
    public static final class b extends Lambda implements Function1<PushModuleInterface, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Continuation<Integer> f36254p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(SafeContinuation safeContinuation) {
            super(1);
            this.f36254p0 = safeContinuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PushModuleInterface pushModuleInterface) {
            PushModuleInterface pushModuleInterface2 = pushModuleInterface;
            Intrinsics.checkNotNullParameter(pushModuleInterface2, "pushModuleInterface");
            Result.Companion companion = Result.INSTANCE;
            this.f36254p0.resumeWith(Result.m5535constructorimpl(Integer.valueOf(pushModuleInterface2.getInboxMessageManager().getReadMessageCount())));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SalesforceInbox.kt */
    public static final class c extends Lambda implements Function1<PushModuleInterface, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Continuation<Integer> f36255p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SafeContinuation safeContinuation) {
            super(1);
            this.f36255p0 = safeContinuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PushModuleInterface pushModuleInterface) {
            PushModuleInterface pushModuleInterface2 = pushModuleInterface;
            Intrinsics.checkNotNullParameter(pushModuleInterface2, "pushModuleInterface");
            Result.Companion companion = Result.INSTANCE;
            this.f36255p0.resumeWith(Result.m5535constructorimpl(Integer.valueOf(pushModuleInterface2.getInboxMessageManager().getUnreadMessageCount())));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SalesforceInbox.kt */
    @SourceDebugExtension({"SMAP\nSalesforceInbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SalesforceInbox.kt\ncom/bbva/push/salesforce/SalesforceInbox$getMessages$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1549#2:77\n1620#2,3:78\n*S KotlinDebug\n*F\n+ 1 SalesforceInbox.kt\ncom/bbva/push/salesforce/SalesforceInbox$getMessages$1\n*L\n22#1:77\n22#1:78,3\n*E\n"})
    public static final class d extends Lambda implements Function1<PushModuleInterface, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ Function1<MessageBulk, Unit> f36256p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(Function1<? super MessageBulk, Unit> function1) {
            super(1);
            this.f36256p0 = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PushModuleInterface pushModuleInterface) {
            PushModuleInterface pushModuleInterface2 = pushModuleInterface;
            Intrinsics.checkNotNullParameter(pushModuleInterface2, "pushModuleInterface");
            pushModuleInterface2.getInboxMessageManager().refreshInbox(new m1(pushModuleInterface2, this.f36256p0));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SalesforceInbox.kt */
    public static final class e extends Lambda implements Function1<PushModuleInterface, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final e f36257p0 = new e(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PushModuleInterface pushModuleInterface) {
            PushModuleInterface pushModuleInterface2 = pushModuleInterface;
            Intrinsics.checkNotNullParameter(pushModuleInterface2, "pushModuleInterface");
            pushModuleInterface2.getInboxMessageManager().markAllMessagesDeleted();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SalesforceInbox.kt */
    public static final class f extends Lambda implements Function1<PushModuleInterface, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f36258p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str) {
            super(1);
            this.f36258p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PushModuleInterface pushModuleInterface) {
            PushModuleInterface pushModuleInterface2 = pushModuleInterface;
            Intrinsics.checkNotNullParameter(pushModuleInterface2, "pushModuleInterface");
            pushModuleInterface2.getInboxMessageManager().deleteMessage(this.f36258p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SalesforceInbox.kt */
    public static final class g extends Lambda implements Function1<PushModuleInterface, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final g f36259p0 = new g(1);

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PushModuleInterface pushModuleInterface) {
            PushModuleInterface pushModuleInterface2 = pushModuleInterface;
            Intrinsics.checkNotNullParameter(pushModuleInterface2, "pushModuleInterface");
            pushModuleInterface2.getInboxMessageManager().markAllMessagesRead();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: SalesforceInbox.kt */
    public static final class h extends Lambda implements Function1<PushModuleInterface, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ String f36260p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str) {
            super(1);
            this.f36260p0 = str;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(PushModuleInterface pushModuleInterface) {
            PushModuleInterface pushModuleInterface2 = pushModuleInterface;
            Intrinsics.checkNotNullParameter(pushModuleInterface2, "pushModuleInterface");
            pushModuleInterface2.getInboxMessageManager().setMessageRead(this.f36260p0);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SalesforceInbox() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.bbva.push.inbox.Inbox
    public void addFavorite(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
    }

    @Override // com.bbva.push.inbox.Inbox
    @Nullable
    public Object getAllMessagesCount(@NotNull Continuation<? super Integer> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        SFMSDKKt.withMarketingCloudPushModule(new a(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.bbva.push.inbox.Inbox
    @Nullable
    public Object getAllReadMessagesCount(@NotNull Continuation<? super Integer> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        SFMSDKKt.withMarketingCloudPushModule(new b(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.bbva.push.inbox.Inbox
    @Nullable
    public Object getAllUnreadMessagesCount(@NotNull Continuation<? super Integer> continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt__IntrinsicsJvmKt.intercepted(continuation));
        SFMSDKKt.withMarketingCloudPushModule(new c(safeContinuation));
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == ek.a.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // com.bbva.push.inbox.Inbox
    public void getMessages(@NotNull Function1<? super MessageBulk, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        SFMSDKKt.withMarketingCloudPushModule(new d(callback));
    }

    @Override // com.bbva.push.inbox.Inbox
    public void removeAllMessages() {
        SFMSDKKt.withMarketingCloudPushModule(e.f36257p0);
    }

    @Override // com.bbva.push.inbox.Inbox
    public void removeFavorite(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
    }

    @Override // com.bbva.push.inbox.Inbox
    public void removeMessage(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        SFMSDKKt.withMarketingCloudPushModule(new f(id));
    }

    @Override // com.bbva.push.inbox.Inbox
    public void setAllMessagesRead() {
        SFMSDKKt.withMarketingCloudPushModule(g.f36259p0);
    }

    @Override // com.bbva.push.inbox.Inbox
    public void setMessageRead(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        SFMSDKKt.withMarketingCloudPushModule(new h(id));
    }

    @Override // com.bbva.push.inbox.Inbox
    public void setMessageUnread(@NotNull String id) {
        Intrinsics.checkNotNullParameter(id, "id");
    }

    @Override // com.bbva.push.inbox.Inbox, com.bbva.push.tracker.Tracker
    public void track(@NotNull String notificationId, @NotNull String action, @NotNull Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(notificationId, "notificationId");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(data, "data");
        this.f36252a.track(notificationId, action, data);
    }

    public SalesforceInbox(@NotNull Tracker tracker) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f36252a = tracker;
    }

    public /* synthetic */ SalesforceInbox(Tracker tracker, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new SalesforceInboxTracker() : tracker);
    }
}
