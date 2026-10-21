package com.bbva.cells.pluginkit.postmessage;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.Json;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: Model.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B#\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u000f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005HÆ\u0003J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007HÆ\u0003J/\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007HÆ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÖ\u0003R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/bbva/cells/pluginkit/postmessage/PostMessage;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "toString", "Lkotlinx/serialization/KSerializer;", "component1", "Lcom/bbva/cells/pluginkit/postmessage/PostMessageContent;", "component2", "serializer", "content", "copy", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Lkotlinx/serialization/KSerializer;", "getSerializer", "()Lkotlinx/serialization/KSerializer;", "b", "Lcom/bbva/cells/pluginkit/postmessage/PostMessageContent;", "getContent", "()Lcom/bbva/cells/pluginkit/postmessage/PostMessageContent;", "<init>", "(Lkotlinx/serialization/KSerializer;Lcom/bbva/cells/pluginkit/postmessage/PostMessageContent;)V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public final /* data */ class PostMessage<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final KSerializer<T> serializer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final PostMessageContent<T> content;

    public PostMessage(@NotNull KSerializer<T> serializer, @NotNull PostMessageContent<T> content) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(content, "content");
        this.serializer = serializer;
        this.content = content;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PostMessage copy$default(PostMessage postMessage, KSerializer kSerializer, PostMessageContent postMessageContent, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kSerializer = postMessage.serializer;
        }
        if ((i10 & 2) != 0) {
            postMessageContent = postMessage.content;
        }
        return postMessage.copy(kSerializer, postMessageContent);
    }

    @NotNull
    public final KSerializer<T> component1() {
        return this.serializer;
    }

    @NotNull
    public final PostMessageContent<T> component2() {
        return this.content;
    }

    @NotNull
    public final PostMessage<T> copy(@NotNull KSerializer<T> serializer, @NotNull PostMessageContent<T> content) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        Intrinsics.checkNotNullParameter(content, "content");
        return new PostMessage<>(serializer, content);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PostMessage)) {
            return false;
        }
        PostMessage postMessage = (PostMessage) other;
        return Intrinsics.areEqual(this.serializer, postMessage.serializer) && Intrinsics.areEqual(this.content, postMessage.content);
    }

    @NotNull
    public final PostMessageContent<T> getContent() {
        return this.content;
    }

    @NotNull
    public final KSerializer<T> getSerializer() {
        return this.serializer;
    }

    public int hashCode() {
        KSerializer<T> kSerializer = this.serializer;
        int iHashCode = (kSerializer != null ? kSerializer.hashCode() : 0) * 31;
        PostMessageContent<T> postMessageContent = this.content;
        return iHashCode + (postMessageContent != null ? postMessageContent.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return Json.INSTANCE.encodeToString(PostMessageContent.INSTANCE.serializer(this.serializer), this.content);
    }
}
