package k6;

import com.bbva.dcaptureplugin.command.LaunchDocumentCaptureCommand;
import com.bbva.dcaptureplugin.command.response.CachedCapturedDocument;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LaunchDocumentCaptureCommand.kt */
/* JADX INFO: loaded from: classes3.dex */
@DebugMetadata(c = "com.bbva.dcaptureplugin.command.LaunchDocumentCaptureCommand", f = "LaunchDocumentCaptureCommand.kt", i = {0}, l = {129}, m = "asDocumentCaptured", n = {"$this$asDocumentCaptured"}, s = {"L$0"})
public final class e extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CachedCapturedDocument f79205p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public /* synthetic */ Object f79206q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ LaunchDocumentCaptureCommand f79207r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f79208s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(LaunchDocumentCaptureCommand launchDocumentCaptureCommand, Continuation<? super e> continuation) {
        super(continuation);
        this.f79207r0 = launchDocumentCaptureCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f79206q0 = obj;
        this.f79208s0 |= Integer.MIN_VALUE;
        return LaunchDocumentCaptureCommand.access$asDocumentCaptured(this.f79207r0, null, this);
    }
}
