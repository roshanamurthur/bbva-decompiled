package com.bbva.screenshot.plugin;

import com.bbva.androidtoolkit.helper.LazyGetter;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.factory.CommandFactory;
import com.bbva.androidtoolkit.plugin.command.factory.CommandProvider;
import com.bbva.screenshot.Screenshot;
import com.bbva.screenshot.plugin.command.Capture;
import com.bbva.socialsharing.SocialSharing;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ScreenshotCommandFactory.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/bbva/screenshot/plugin/ScreenshotCommandFactory;", "Lcom/bbva/androidtoolkit/plugin/command/factory/CommandFactory;", "screenshot", "Lcom/bbva/androidtoolkit/helper/LazyGetter;", "Lcom/bbva/screenshot/Screenshot;", "socialSharing", "Lcom/bbva/socialsharing/SocialSharing;", "(Lcom/bbva/androidtoolkit/helper/LazyGetter;Lcom/bbva/androidtoolkit/helper/LazyGetter;)V", "screenshot-plugin_release"}, k = 1, mv = {1, 1, 13})
public final class ScreenshotCommandFactory extends CommandFactory {

    /* JADX INFO: compiled from: ScreenshotCommandFactory.kt */
    public static final class a implements CommandProvider {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LazyGetter f36366a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ LazyGetter f36367b;

        public a(LazyGetter lazyGetter, LazyGetter lazyGetter2) {
            this.f36366a = lazyGetter;
            this.f36367b = lazyGetter2;
        }

        @Override // com.bbva.androidtoolkit.plugin.command.factory.CommandProvider
        public final AbstractCommand create() {
            return new Capture(this.f36366a, this.f36367b);
        }
    }

    public ScreenshotCommandFactory(@NotNull LazyGetter<Screenshot> lazyGetter, @NotNull LazyGetter<SocialSharing> lazyGetter2) {
        addCommandProvider("capture", new a(lazyGetter, lazyGetter2));
    }
}
