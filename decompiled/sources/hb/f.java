package hb;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.plugin.media.capture.command.impl.GetPictureCommand;
import com.bbva.plugin.media.capture.media.image.UriHandler;
import com.bbva.plugin.media.capture.model.TempFile;
import com.bbva.plugin.media.capture.util.Constants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: GetPictureCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@DebugMetadata(c = "com.bbva.plugin.media.capture.command.impl.GetPictureCommand$uriOf$2", f = "GetPictureCommand.kt", i = {}, l = {161}, m = "invokeSuspend", n = {}, s = {})
public final class f extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TempFile>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public int f69368p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ GetPictureCommand f69369q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ String f69370r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final /* synthetic */ Intent f69371s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(GetPictureCommand getPictureCommand, String str, Intent intent, Continuation continuation) {
        super(2, continuation);
        this.f69369q0 = getPictureCommand;
        this.f69370r0 = str;
        this.f69371s0 = intent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
        Intrinsics.checkNotNullParameter(completion, "completion");
        return new f(this.f69369q0, this.f69370r0, this.f69371s0, completion);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TempFile> continuation) {
        return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f69368p0;
        GetPictureCommand getPictureCommand = this.f69369q0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            String str = this.f69370r0;
            int iHashCode = str.hashCode();
            if (iHashCode == -1367751899) {
                if (str.equals(Constants.CAMERA_SRC)) {
                    return getPictureCommand.f35817r0;
                }
                return null;
            }
            if (iHashCode != -196315310 || !str.equals(Constants.GALLERY_SRC)) {
                return null;
            }
            UriHandler uriHandler = new UriHandler();
            Application mApplication = ((AbstractCommand) getPictureCommand).mApplication;
            Intrinsics.checkNotNullExpressionValue(mApplication, "mApplication");
            Intent intent = this.f69371s0;
            Uri data = intent != null ? intent.getData() : null;
            this.f69368p0 = 1;
            obj = uriHandler.execute(mApplication, data, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        TempFile tempFile = (TempFile) obj;
        getPictureCommand.f35817r0 = tempFile;
        return tempFile;
    }
}
