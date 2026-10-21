package k6;

import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.dcaptureplugin.command.DocumentCapturable;
import com.bbva.dcaptureplugin.command.LaunchDocumentCaptureCommand;
import com.bbva.selfiecapture.plugin.command.SelfieCapturable;
import com.bbva.videocapture.command.LaunchVideoCaptureCommand;
import com.bbva.videocapture.command.VideoCapturable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f79203p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Object f79204q0;

    public /* synthetic */ d(Object obj, int i10) {
        this.f79203p0 = i10;
        this.f79204q0 = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f79203p0;
        Object obj2 = this.f79204q0;
        switch (i10) {
            case 0:
                return LaunchDocumentCaptureCommand.a((LaunchDocumentCaptureCommand) obj2, (DocumentCapturable) obj);
            case 1:
                SelfieCapturable it = (SelfieCapturable) obj;
                Intrinsics.checkNotNullParameter(it, "it");
                ((CommandCallback) obj2).sendEvent(it.getNextChallenge());
                return Unit.INSTANCE;
            default:
                return LaunchVideoCaptureCommand.a((LaunchVideoCaptureCommand) obj2, (VideoCapturable) obj);
        }
    }
}
