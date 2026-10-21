package nc;

import com.bbva.videocapture.command.LaunchVideoCaptureCommand;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LaunchVideoCaptureCommand.kt */
/* JADX INFO: loaded from: classes9.dex */
@DebugMetadata(c = "com.bbva.videocapture.command.LaunchVideoCaptureCommand", f = "LaunchVideoCaptureCommand.kt", i = {}, l = {61}, m = "createUrl", n = {}, s = {})
public final class a extends ContinuationImpl {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public /* synthetic */ Object f84494p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ LaunchVideoCaptureCommand f84495q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f84496r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(LaunchVideoCaptureCommand launchVideoCaptureCommand, Continuation<? super a> continuation) {
        super(continuation);
        this.f84495q0 = launchVideoCaptureCommand;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.f84494p0 = obj;
        this.f84496r0 |= Integer.MIN_VALUE;
        return LaunchVideoCaptureCommand.access$createUrl(this.f84495q0, null, this);
    }
}
