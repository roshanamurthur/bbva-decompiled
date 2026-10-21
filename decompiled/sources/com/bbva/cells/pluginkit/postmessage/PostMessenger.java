package com.bbva.cells.pluginkit.postmessage;

import androidx.exifinterface.media.ExifInterface;
import com.bbva.cells.pluginkit.command.PluginTarget;
import com.bbva.notifications.model.constants.BanxicoConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PostMessenger.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J1\u0010\t\u001a\u00020\b\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0007\u001a\u00028\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/bbva/cells/pluginkit/postmessage/PostMessenger;", "", ExifInterface.GPS_DIRECTION_TRUE, "", "action", "Lkotlinx/serialization/KSerializer;", "serializer", BanxicoConstants.KEY_HISTORICAL_PAYLOAD, "", "postMessage", "(Ljava/lang/String;Lkotlinx/serialization/KSerializer;Ljava/lang/Object;)V", "origin", "pluginName", "Lcom/bbva/cells/pluginkit/command/PluginTarget;", "target", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/cells/pluginkit/command/PluginTarget;)V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public final class PostMessenger {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f26846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PluginTarget f26847c;

    public PostMessenger(@NotNull String origin, @NotNull String pluginName, @NotNull PluginTarget target) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(pluginName, "pluginName");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f26845a = origin;
        this.f26846b = pluginName;
        this.f26847c = target;
    }

    public final <T> void postMessage(@NotNull String action, @NotNull KSerializer<T> serializer, T payload) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        this.f26847c.sendPostMessage(new PostMessage<>(serializer, new PostMessageContent(this.f26846b, this.f26845a, action, payload)));
    }
}
