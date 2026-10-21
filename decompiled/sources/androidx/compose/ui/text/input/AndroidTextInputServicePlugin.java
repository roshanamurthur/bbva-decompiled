package androidx.compose.ui.text.input;

import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q1.c;

/* JADX INFO: compiled from: AndroidTextInputServicePlugin.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/input/AndroidTextInputServicePlugin;", "Landroidx/compose/ui/text/input/PlatformTextInputPlugin;", "Landroidx/compose/ui/text/input/AndroidTextInputServicePlugin$Adapter;", "()V", "createAdapter", "platformTextInput", "Landroidx/compose/ui/text/input/PlatformTextInput;", "view", "Landroid/view/View;", "Adapter", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidTextInputServicePlugin implements PlatformTextInputPlugin<Adapter> {

    @NotNull
    public static final AndroidTextInputServicePlugin INSTANCE = new AndroidTextInputServicePlugin();

    /* JADX INFO: compiled from: AndroidTextInputServicePlugin.kt */
    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/text/input/AndroidTextInputServicePlugin$Adapter;", "Landroidx/compose/ui/text/input/PlatformTextInputAdapter;", "Landroid/view/inputmethod/EditorInfo;", "outAttrs", "Landroid/view/inputmethod/InputConnection;", "createInputConnection", "Landroidx/compose/ui/text/input/TextInputService;", "a", "Landroidx/compose/ui/text/input/TextInputService;", "getService", "()Landroidx/compose/ui/text/input/TextInputService;", NotificationCompat.CATEGORY_SERVICE, "Landroidx/compose/ui/text/input/TextInputServiceAndroid;", "androidService", "<init>", "(Landroidx/compose/ui/text/input/TextInputService;Landroidx/compose/ui/text/input/TextInputServiceAndroid;)V", "ui_release"}, k = 1, mv = {1, 8, 0})
    public static final class Adapter implements PlatformTextInputAdapter {
        public static final int $stable = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final TextInputService service;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final TextInputServiceAndroid f18047b;

        public Adapter(@NotNull TextInputService service, @NotNull TextInputServiceAndroid androidService) {
            Intrinsics.checkNotNullParameter(service, "service");
            Intrinsics.checkNotNullParameter(androidService, "androidService");
            this.service = service;
            this.f18047b = androidService;
        }

        @Override // androidx.compose.ui.text.input.PlatformTextInputAdapter
        @NotNull
        public InputConnection createInputConnection(@NotNull EditorInfo outAttrs) {
            Intrinsics.checkNotNullParameter(outAttrs, "outAttrs");
            return this.f18047b.createInputConnection(outAttrs);
        }

        @NotNull
        public final TextInputService getService() {
            return this.service;
        }

        @Override // androidx.compose.ui.text.input.PlatformTextInputAdapter
        public final /* synthetic */ void onDisposed() {
            c.a(this);
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputPlugin
    @NotNull
    public Adapter createAdapter(@NotNull PlatformTextInput platformTextInput, @NotNull View view) {
        Intrinsics.checkNotNullParameter(platformTextInput, "platformTextInput");
        Intrinsics.checkNotNullParameter(view, "view");
        TextInputServiceAndroid textInputServiceAndroid = new TextInputServiceAndroid(view, platformTextInput);
        return new Adapter(new TextInputService(textInputServiceAndroid), textInputServiceAndroid);
    }
}
