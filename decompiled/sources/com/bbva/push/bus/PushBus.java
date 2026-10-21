package com.bbva.push.bus;

import com.bbva.push.model.Push;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: PushBus.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001e\u0010\u0007\u001a\u00020\u00042\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005J\u0006\u0010\b\u001a\u00020\u0004J\u000e\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0003J\u001e\u0010\r\u001a\u00020\u00042\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\fJ\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000b¨\u0006\u0013"}, d2 = {"Lcom/bbva/push/bus/PushBus;", "", "Lkotlin/Function1;", "", "", "Lcom/bbva/push/bus/TokenObserver;", "observer", "observeTokenUpdates", "removeTokenUpdatesObserver", "token", "onNewToken", "Lcom/bbva/push/model/Push;", "Lcom/bbva/push/bus/PushObserver;", "observeNewPushes", "removePushesObserver", "push", "onNewPush", "<init>", "()V", "push_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPushBus.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PushBus.kt\ncom/bbva/push/bus/PushBus\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,70:1\n1#2:71\n*E\n"})
public final class PushBus {

    @NotNull
    public static final PushBus INSTANCE = new PushBus();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public static Function1<? super String, Unit> f36206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public static Function1<? super Push, Unit> f36207b;

    public final void observeNewPushes(@NotNull Function1<? super Push, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        f36207b = observer;
    }

    public final void observeTokenUpdates(@NotNull Function1<? super String, Unit> observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        f36206a = observer;
    }

    public final void onNewPush(@NotNull Push push) {
        Intrinsics.checkNotNullParameter(push, "push");
        Function1<? super Push, Unit> function1 = f36207b;
        if (function1 != null) {
            function1.invoke(push);
        }
    }

    public final void onNewToken(@NotNull String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        Function1<? super String, Unit> function1 = f36206a;
        if (function1 != null) {
            function1.invoke(token);
        }
    }

    public final void removePushesObserver() {
        f36207b = null;
    }

    public final void removeTokenUpdatesObserver() {
        f36206a = null;
    }
}
