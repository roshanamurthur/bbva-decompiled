package com.bbva.push;

import android.content.Context;
import bk.g;
import com.bbva.push.executor.PushExecutor;
import com.bbva.push.handler.PushHandler;
import com.bbva.push.model.NotificationChannel;
import com.bbva.push.source.PushSource;
import com.bbva.tohu.android.product.valkyria.sdk.constants.TransactionType;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PushManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010!\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u0016¢\u0006\u0004\b4\u00105J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fR\u001a\u0010\u0015\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u001b\u001a\u00020\u00168\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\"\u0010'\u001a\u00020\u001c8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010\u001e\u001a\u0004\b%\u0010 \"\u0004\b&\u0010\"R(\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R(\u00103\u001a\b\u0012\u0004\u0012\u00020\t0(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010*\u001a\u0004\b1\u0010,\"\u0004\b2\u0010.¨\u00066"}, d2 = {"Lcom/bbva/push/PushManagerBuilder;", "", "Lcom/bbva/push/handler/PushHandler;", "handler", "", "addPushHandler", "", "handlersList", "addPushHandlers", "Lcom/bbva/push/source/PushSource;", "source", "addPushSource", "Landroid/content/Context;", "context", "Lcom/bbva/push/PushManager;", JsonPOJOBuilder.DEFAULT_BUILD_METHOD, "Lcom/bbva/push/executor/PushExecutor;", "a", "Lcom/bbva/push/executor/PushExecutor;", "getPushExecutor$push_release", "()Lcom/bbva/push/executor/PushExecutor;", "pushExecutor", "Lcom/bbva/push/model/NotificationChannel;", "b", "Lcom/bbva/push/model/NotificationChannel;", "getDefaultChannel$push_release", "()Lcom/bbva/push/model/NotificationChannel;", "defaultChannel", "", "c", TransactionType.TRANSACTION_TYPE_DRSP_CODE, "getDefaultIcon", "()I", "setDefaultIcon", "(I)V", "defaultIcon", "d", "getCacheCapacity", "setCacheCapacity", "cacheCapacity", "", "e", "Ljava/util/List;", "getHandlers$push_release", "()Ljava/util/List;", "setHandlers$push_release", "(Ljava/util/List;)V", "handlers", "f", "getSources$push_release", "setSources$push_release", "sources", "<init>", "(Lcom/bbva/push/executor/PushExecutor;Lcom/bbva/push/model/NotificationChannel;)V", "push_release"}, k = 1, mv = {1, 8, 0})
public final class PushManagerBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PushExecutor pushExecutor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final NotificationChannel defaultChannel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public int defaultIcon;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int cacheCapacity;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<PushHandler> handlers;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public List<PushSource> sources;

    public PushManagerBuilder(@NotNull PushExecutor pushExecutor, @NotNull NotificationChannel defaultChannel) {
        Intrinsics.checkNotNullParameter(pushExecutor, "pushExecutor");
        Intrinsics.checkNotNullParameter(defaultChannel, "defaultChannel");
        this.pushExecutor = pushExecutor;
        this.defaultChannel = defaultChannel;
        this.cacheCapacity = 5;
        this.handlers = new ArrayList();
        this.sources = new ArrayList();
    }

    public final void addPushHandler(@NotNull PushHandler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.handlers.add(handler);
    }

    public final void addPushHandlers(@NotNull List<? extends PushHandler> handlersList) {
        Intrinsics.checkNotNullParameter(handlersList, "handlersList");
        g.addAll(this.handlers, handlersList);
    }

    public final void addPushSource(@NotNull PushSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.sources.add(source);
    }

    @NotNull
    public final PushManager build(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return new PushManager(context, this);
    }

    public final int getCacheCapacity() {
        return this.cacheCapacity;
    }

    @NotNull
    /* JADX INFO: renamed from: getDefaultChannel$push_release, reason: from getter */
    public final NotificationChannel getDefaultChannel() {
        return this.defaultChannel;
    }

    public final int getDefaultIcon() {
        return this.defaultIcon;
    }

    @NotNull
    public final List<PushHandler> getHandlers$push_release() {
        return this.handlers;
    }

    @NotNull
    /* JADX INFO: renamed from: getPushExecutor$push_release, reason: from getter */
    public final PushExecutor getPushExecutor() {
        return this.pushExecutor;
    }

    @NotNull
    public final List<PushSource> getSources$push_release() {
        return this.sources;
    }

    public final void setCacheCapacity(int i10) {
        this.cacheCapacity = i10;
    }

    public final void setDefaultIcon(int i10) {
        this.defaultIcon = i10;
    }

    public final void setHandlers$push_release(@NotNull List<PushHandler> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.handlers = list;
    }

    public final void setSources$push_release(@NotNull List<PushSource> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.sources = list;
    }
}
