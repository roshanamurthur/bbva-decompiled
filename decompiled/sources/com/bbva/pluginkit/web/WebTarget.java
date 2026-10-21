package com.bbva.pluginkit.web;

import com.bbva.cells.pluginkit.command.PluginTarget;
import com.bbva.cells.pluginkit.command.model.PluginResult;
import com.bbva.cells.pluginkit.postmessage.PostMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WebTarget.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u001c\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00022\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0016J\u0014\u0010\f\u001a\u00020\u00042\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\nH\u0016¨\u0006\u0012"}, d2 = {"Lcom/bbva/pluginkit/web/WebTarget;", "Lcom/bbva/cells/pluginkit/command/PluginTarget;", "", "url", "", "setTarget", "id", "Lcom/bbva/cells/pluginkit/command/model/PluginResult;", "result", "send", "Lcom/bbva/cells/pluginkit/postmessage/PostMessage;", "message", "sendPostMessage", "Lcom/bbva/pluginkit/web/WebSender;", "sender", "<init>", "(Lcom/bbva/pluginkit/web/WebSender;)V", "Companion", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public final class WebTarget implements PluginTarget {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f36111a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WebSender f36112b;

    public WebTarget(@NotNull WebSender sender) {
        Intrinsics.checkNotNullParameter(sender, "sender");
        this.f36112b = sender;
    }

    public static final /* synthetic */ String access$getUrl$p(WebTarget webTarget) {
        String str = webTarget.f36111a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("url");
        }
        return str;
    }

    @Override // com.bbva.cells.pluginkit.command.PluginTarget
    public void send(@NotNull String id, @NotNull PluginResult<?> result) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(result, "result");
        this.f36112b.send(l.replace$default(l.replace$default("javascript:window.CellsNativePlugins.pluginManager.pluginResponse('%id', %result)", "%id", id, false, 4, (Object) null), "%result", result.toString(), false, 4, (Object) null));
    }

    @Override // com.bbva.cells.pluginkit.command.PluginTarget
    public void sendPostMessage(@NotNull PostMessage<?> message) {
        Intrinsics.checkNotNullParameter(message, "message");
        if (!(this.f36111a != null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        String strReplace$default = l.replace$default("javascript:window.postMessage('%event','%urlcellsNativePlugin)", "%event", message.toString(), false, 4, (Object) null);
        String str = this.f36111a;
        if (str == null) {
            Intrinsics.throwUninitializedPropertyAccessException("url");
        }
        this.f36112b.send(l.replace$default(strReplace$default, "%url", str, false, 4, (Object) null));
    }

    @Override // com.bbva.cells.pluginkit.command.PluginTarget
    public void setTarget(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f36111a = url;
    }
}
