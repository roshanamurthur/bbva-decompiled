package com.bbva.screenshot.plugin;

import com.bbva.androidtoolkit.helper.LazyGetter;
import com.bbva.androidtoolkit.plugin.Plugin;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.screenshot.Screenshot;
import com.bbva.socialsharing.SocialSharing;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ScreenshotPlugin.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \r2\u00020\u0001:\u0001\rB#\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000e"}, d2 = {"Lcom/bbva/screenshot/plugin/ScreenshotPlugin;", "Lcom/bbva/androidtoolkit/plugin/Plugin;", "", "getId", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "createCommandFactory", "Lcom/bbva/androidtoolkit/helper/LazyGetter;", "Lcom/bbva/screenshot/Screenshot;", "screenshot", "Lcom/bbva/socialsharing/SocialSharing;", "socialSharing", "<init>", "(Lcom/bbva/androidtoolkit/helper/LazyGetter;Lcom/bbva/androidtoolkit/helper/LazyGetter;)V", "Companion", "screenshot-plugin_release"}, k = 1, mv = {1, 4, 0})
public final class ScreenshotPlugin extends Plugin {

    @NotNull
    public static final String ID = "Screenshot";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LazyGetter<Screenshot> f36368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LazyGetter<SocialSharing> f36369b;

    public ScreenshotPlugin(@NotNull LazyGetter<Screenshot> lazyGetter, @NotNull LazyGetter<SocialSharing> lazyGetter2) {
        this.f36368a = lazyGetter;
        this.f36369b = lazyGetter2;
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public CommandFactory createCommandFactory() {
        return new ScreenshotCommandFactory(this.f36368a, this.f36369b);
    }

    @Override // com.bbva.androidtoolkit.plugin.Plugin
    @NotNull
    public String getId() {
        return ID;
    }
}
