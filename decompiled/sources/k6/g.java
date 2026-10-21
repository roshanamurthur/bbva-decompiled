package k6;

import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.dcaptureplugin.command.DocumentCapturable;
import com.bbva.dcaptureplugin.command.StopDocumentCaptureCommand;
import com.bbva.videocapture.command.StopVideoCaptureCommand;
import com.bbva.videocapture.command.VideoCapturable;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class g implements Function1 {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ int f79211p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CommandCallback f79212q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ AbstractCommand f79213r0;

    public /* synthetic */ g(AbstractCommand abstractCommand, CommandCallback commandCallback, int i10) {
        this.f79211p0 = i10;
        this.f79213r0 = abstractCommand;
        this.f79212q0 = commandCallback;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i10 = this.f79211p0;
        CommandCallback commandCallback = this.f79212q0;
        AbstractCommand abstractCommand = this.f79213r0;
        switch (i10) {
            case 0:
                return StopDocumentCaptureCommand.a((StopDocumentCaptureCommand) abstractCommand, commandCallback, (DocumentCapturable) obj);
            default:
                return StopVideoCaptureCommand.a((StopVideoCaptureCommand) abstractCommand, commandCallback, (VideoCapturable) obj);
        }
    }
}
