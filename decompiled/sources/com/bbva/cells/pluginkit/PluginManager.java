package com.bbva.cells.pluginkit;

import com.bbva.cells.pluginkit.command.PluginTarget;
import com.bbva.cells.pluginkit.command.model.Errors;
import com.bbva.cells.pluginkit.command.model.PluginResult;
import com.bbva.cells.pluginkit.command.model.ResultCode;
import com.bbva.cells.pluginkit.postmessage.PostMessenger;
import com.bbva.cells.pluginkit.provider.PlatformProvider;
import com.bbva.cells.pluginkit.provider.PluginProviderKt;
import com.bbva.cells.pluginkit.provider.XPluginFactory;
import com.bbva.cells.pluginkit.web.WebCommunicator;
import com.bbva.pluginkit.web.WebTarget;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PluginManager.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR*\u0010\n\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/bbva/cells/pluginkit/PluginManager;", "", "", "value", "a", "Ljava/lang/String;", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "url", "Lcom/bbva/cells/pluginkit/provider/XPluginFactory;", "b", "Lcom/bbva/cells/pluginkit/provider/XPluginFactory;", "getPluginFactory", "()Lcom/bbva/cells/pluginkit/provider/XPluginFactory;", "setPluginFactory", "(Lcom/bbva/cells/pluginkit/provider/XPluginFactory;)V", "pluginFactory", "Lcom/bbva/cells/pluginkit/web/WebCommunicator;", "communicator", "Lcom/bbva/cells/pluginkit/provider/PlatformProvider;", "provider", "Lcom/bbva/cells/pluginkit/command/PluginTarget;", "target", "<init>", "(Lcom/bbva/cells/pluginkit/web/WebCommunicator;Lcom/bbva/cells/pluginkit/provider/PlatformProvider;Lcom/bbva/cells/pluginkit/command/PluginTarget;)V", "pluginkit_release"}, k = 1, mv = {1, 4, 1})
public final class PluginManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public XPluginFactory pluginFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f26782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PlatformProvider f26783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final PluginTarget f26784e;

    /* JADX INFO: compiled from: PluginManager.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements Function1<String, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(String str) {
            String p4 = str;
            Intrinsics.checkNotNullParameter(p4, "p1");
            PluginManager.access$execute((PluginManager) this.receiver, p4);
            return Unit.INSTANCE;
        }
    }

    public PluginManager(@NotNull WebCommunicator communicator, @NotNull PlatformProvider provider, @NotNull PluginTarget target) {
        Intrinsics.checkNotNullParameter(communicator, "communicator");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(target, "target");
        this.f26783d = provider;
        this.f26784e = target;
        this.url = "";
        this.pluginFactory = PluginProviderKt.pluginFactoryOf(new Pair[0]);
        this.f26782c = new LinkedHashMap();
        communicator.onMessageReceive(new a(1, this, PluginManager.class, "execute", "execute(Ljava/lang/String;)V", 0));
    }

    public static final void access$execute(PluginManager pluginManager, String str) {
        pluginManager.getClass();
        PluginRequest pluginRequest = (PluginRequest) Json.INSTANCE.decodeFromString(PluginRequest.INSTANCE.serializer(), str);
        LinkedHashMap linkedHashMap = pluginManager.f26782c;
        XPlugin xPlugin = (XPlugin) linkedHashMap.get(pluginRequest.getPluginId());
        PluginTarget pluginTarget = pluginManager.f26784e;
        if (xPlugin == null) {
            xPlugin = pluginManager.pluginFactory.get(pluginRequest.getPluginId());
            if (xPlugin == null) {
                pluginTarget.send(pluginRequest.getId(), new PluginResult<>(ResultCode.ERROR, Errors.INSTANCE.serializer(), Errors.ErrorNotAvailable));
            } else {
                xPlugin.init(pluginManager.f26783d, new PostMessenger("cellsNativePlugin", xPlugin.getId(), pluginTarget));
                linkedHashMap.put(pluginRequest.getPluginId(), xPlugin);
            }
        }
        if (xPlugin != null) {
            String id = pluginRequest.getId();
            String actionId = pluginRequest.getActionId();
            JsonElement payload = pluginRequest.getPayload();
            xPlugin.execute(id, actionId, payload != null ? payload.toString() : null, pluginTarget);
        }
    }

    @NotNull
    public final XPluginFactory getPluginFactory() {
        return this.pluginFactory;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public final void setPluginFactory(@NotNull XPluginFactory xPluginFactory) {
        Intrinsics.checkNotNullParameter(xPluginFactory, "<set-?>");
        this.pluginFactory = xPluginFactory;
    }

    public final void setUrl(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.f26784e.setTarget(value);
    }

    public /* synthetic */ PluginManager(WebCommunicator webCommunicator, PlatformProvider platformProvider, PluginTarget pluginTarget, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(webCommunicator, platformProvider, (i10 & 4) != 0 ? new WebTarget(webCommunicator) : pluginTarget);
    }
}
