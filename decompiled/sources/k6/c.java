package k6;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.dcaptureplugin.command.DocumentCapturable;
import com.bbva.videocapture.command.VideoCapturable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f79201p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f79202q0;

    public /* synthetic */ c(int i10, CommandCallback commandCallback) {
        this.f79201p0 = i10;
        this.f79202q0 = commandCallback;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f79201p0;
        CommandCallback commandCallback = this.f79202q0;
        switch (i10) {
            case 0:
                DocumentCapturable it = (DocumentCapturable) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                commandCallback.sendEvent(it.getVersion());
                break;
            default:
                VideoCapturable it2 = (VideoCapturable) obj;
                Intrinsics.checkNotNullParameter(it2, "it");
                commandCallback.sendEvent(it2.getVersion());
                break;
        }
        return Unit.INSTANCE;
    }
}
