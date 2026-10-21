package com.bbva.push.model;

import androidx.annotation.Keep;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: InboxModel.kt */
/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/bbva/push/model/Message;", "", "id", "", "read", "", "favorite", "push", "Lcom/bbva/push/model/Push;", "(Ljava/lang/String;ZZLcom/bbva/push/model/Push;)V", "getFavorite", "()Z", "getId", "()Ljava/lang/String;", "getPush", "()Lcom/bbva/push/model/Push;", "getRead", "component1", "component2", "component3", "component4", "copy", "equals", "other", GenerateActivationFormCommand.HASH_CODE, "", "toString", "push_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Message {
    private final boolean favorite;

    @NotNull
    private final String id;

    @NotNull
    private final Push push;
    private final boolean read;

    public Message(@NotNull String id, boolean z10, boolean z11, @NotNull Push push) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(push, "push");
        this.id = id;
        this.read = z10;
        this.favorite = z11;
        this.push = push;
    }

    public static /* synthetic */ Message copy$default(Message message, String str, boolean z10, boolean z11, Push push, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = message.id;
        }
        if ((i10 & 2) != 0) {
            z10 = message.read;
        }
        if ((i10 & 4) != 0) {
            z11 = message.favorite;
        }
        if ((i10 & 8) != 0) {
            push = message.push;
        }
        return message.copy(str, z10, z11, push);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getFavorite() {
        return this.favorite;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Push getPush() {
        return this.push;
    }

    @NotNull
    public final Message copy(@NotNull String id, boolean read, boolean favorite, @NotNull Push push) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(push, "push");
        return new Message(id, read, favorite, push);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Message)) {
            return false;
        }
        Message message = (Message) other;
        return Intrinsics.areEqual(this.id, message.id) && this.read == message.read && this.favorite == message.favorite && Intrinsics.areEqual(this.push, message.push);
    }

    public final boolean getFavorite() {
        return this.favorite;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final Push getPush() {
        return this.push;
    }

    public final boolean getRead() {
        return this.read;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        boolean z10 = this.read;
        ?? r1 = z10;
        if (z10) {
            r1 = 1;
        }
        int i10 = (iHashCode + r1) * 31;
        boolean z11 = this.favorite;
        return this.push.hashCode() + ((i10 + (z11 ? 1 : z11)) * 31);
    }

    @NotNull
    public String toString() {
        return "Message(id=" + this.id + ", read=" + this.read + ", favorite=" + this.favorite + ", push=" + this.push + RootService.CLOSE_BRACKET;
    }
}
