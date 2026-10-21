package com.bbva.selfiecapture.plugin.command;

import android.app.Application;
import android.content.Context;
import com.bbva.androidtoolkit.plugin.command.PermissionCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.filesystem.WebFile;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.selfiecapture.plugin.SelfieCapturePlugin;
import com.bbva.selfiecapture.plugin.command.LaunchSelfieCaptureCommand;
import com.bbva.selfiecapture.plugin.command.SelfieCapturable;
import com.bbva.selfiecapture.plugin.command.params.LaunchSelfieCaptureParams;
import com.bbva.selfiecapture.plugin.command.params.response.RepeatLiveChallenge;
import com.bbva.selfiecapture.plugin.command.params.response.SelfieCaptureResult;
import com.bbva.selfiecapture.plugin.di.InjectorKt;
import com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vb.d;

/* JADX INFO: compiled from: LaunchSelfieCaptureCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001\u001dB\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u001c\u0010\n\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\r\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\u0011\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00072\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0005H\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u001c\u0010\n\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00162\b\u0010\t\u001a\u0004\u0018\u00010\u0016H\u0016J\u001c\u0010\r\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\u00162\b\u0010\f\u001a\u0004\u0018\u00010\u0016H\u0016J\u001c\u0010\u0011\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u00162\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016R\u0014\u0010\u001a\u001a\u00020\u00178\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/bbva/selfiecapture/plugin/command/LaunchSelfieCaptureCommand;", "Lcom/bbva/androidtoolkit/plugin/command/PermissionCommand;", "Lcom/bbva/selfiecapture/plugin/command/params/LaunchSelfieCaptureParams;", "Lcom/dasnano/vdphotoselfiecapture/VDPhotoSelfieCapture$IVDPhotoSelfieCapture;", "Lkotlinx/coroutines/CoroutineScope;", "", "executeWithPermissionsGranted", "", "selfieImage", "faceImage", "VDPhotoSelfieAndFaceCaptured", "selfieByteArray", "faceByteArray", "VDPhotoSelfieAndFaceCapturedWithLiveDetection", "challengeVideo", "", "challengeWebVTT", "VDPhotoSelfieAndChallengeVideoCaptured", "VDPhotoSelfieChallengeFinishedWithError", "", "p0", "VDPhotoSelfieFinished", "Ljava/io/ByteArrayInputStream;", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "Companion", "selfie-capture-plugin_release"}, k = 1, mv = {2, 0, 0})
public final class LaunchSelfieCaptureCommand extends PermissionCommand<LaunchSelfieCaptureParams> implements VDPhotoSelfieCapture.IVDPhotoSelfieCapture, CoroutineScope {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f36457q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final ArrayList f36458r0;

    /* JADX INFO: compiled from: LaunchSelfieCaptureCommand.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/bbva/selfiecapture/plugin/command/LaunchSelfieCaptureCommand$Companion;", "", "<init>", "()V", "SELFIE_CAPTURE", "", "FACE_CAPTURE", "SELFIE_LIVE_CAPTURE", "FACE_LIVE_CAPTURE", "SELFIE_LIVE_CAPTURE_PRO", "SELFIE_LIVE_CAPTURE_PRO_ERROR", "JPEG", "MP4", "selfie-capture-plugin_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: compiled from: LaunchSelfieCaptureCommand.kt */
    @DebugMetadata(c = "com.bbva.selfiecapture.plugin.command.LaunchSelfieCaptureCommand", f = "LaunchSelfieCaptureCommand.kt", i = {}, l = {119}, m = "createUrl", n = {}, s = {})
    public static final class a extends ContinuationImpl {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f36459p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public int f36461r0;

        public a(Continuation<? super a> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f36459p0 = obj;
            this.f36461r0 |= Integer.MIN_VALUE;
            return LaunchSelfieCaptureCommand.this.b(null, null, this);
        }
    }

    public LaunchSelfieCaptureCommand() {
        super(LaunchSelfieCaptureParams.class, 2, "android.permission.CAMERA");
        this.f36457q0 = CoroutineScopeKt.MainScope();
        this.f36458r0 = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Unit a(LaunchSelfieCaptureCommand launchSelfieCaptureCommand, SelfieCapturable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Context applicationContext = launchSelfieCaptureCommand.mApplication.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        it.startSelfieCapture(launchSelfieCaptureCommand, applicationContext, ((LaunchSelfieCaptureParams) launchSelfieCaptureCommand.mParams).getConfiguration());
        return Unit.INSTANCE;
    }

    @Override // com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture.IVDPhotoSelfieCapture
    public void VDPhotoSelfieAndChallengeVideoCaptured(@Nullable ByteArrayInputStream challengeVideo, @Nullable String challengeWebVTT) {
    }

    @Override // com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture.IVDPhotoSelfieCapture
    public void VDPhotoSelfieAndFaceCaptured(@Nullable ByteArrayInputStream selfieImage, @Nullable ByteArrayInputStream faceImage) {
    }

    @Override // com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture.IVDPhotoSelfieCapture
    public void VDPhotoSelfieAndFaceCapturedWithLiveDetection(@Nullable ByteArrayInputStream selfieByteArray, @Nullable ByteArrayInputStream faceByteArray) {
    }

    @Override // com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture.IVDPhotoSelfieCapture
    public void VDPhotoSelfieChallengeFinishedWithError() {
        this.mPostMessenger.postMessage("PhotoSelfieChallengeFinishedWithError", RepeatLiveChallenge.INSTANCE);
    }

    @Override // com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture.IVDPhotoSelfieCapture
    public void VDPhotoSelfieFinished(boolean p4) {
        if (p4) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new d(this, null), 3, null);
        } else {
            this.mCommandCallback.sendError(Errors.ErrorCanceled);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(byte[] bArr, String str, Continuation<? super String> continuation) {
        a aVar;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f36461r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f36461r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(continuation);
            }
        } else {
            aVar = new a(continuation);
        }
        Object objFrom = aVar.f36459p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f36461r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objFrom);
            WebFile.Companion companion = WebFile.INSTANCE;
            Application mApplication = this.mApplication;
            Intrinsics.checkNotNullExpressionValue(mApplication, "mApplication");
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            aVar.f36461r0 = 1;
            objFrom = companion.from(mApplication, byteArrayInputStream, str, aVar);
            if (objFrom == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objFrom);
        }
        WebFile webFile = (WebFile) objFrom;
        return String.valueOf(webFile != null ? webFile.getUrl() : null);
    }

    @Override // com.bbva.androidtoolkit.plugin.command.PermissionCommand
    public void executeWithPermissionsGranted() {
        if (this.mParams == 0) {
            this.mCommandCallback.sendError(Errors.ErrorMalformedParam);
            return;
        }
        CommandCallback mCommandCallback = this.mCommandCallback;
        Intrinsics.checkNotNullExpressionValue(mCommandCallback, "mCommandCallback");
        InjectorKt.withSelfieCapture(mCommandCallback, new Function1() { // from class: vb.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return LaunchSelfieCaptureCommand.a(this.f94010p0, (SelfieCapturable) obj);
            }
        });
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f36457q0.getCoroutineContext();
    }

    @Override // com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture.IVDPhotoSelfieCapture
    public void VDPhotoSelfieAndChallengeVideoCaptured(@Nullable byte[] challengeVideo, @Nullable String challengeWebVTT) {
        if (challengeVideo == null || challengeWebVTT == null) {
            return;
        }
        this.f36458r0.add(new SelfieCaptureResult.CachedCapturedVideo("SelfieLiveCapturePro", challengeVideo, challengeWebVTT));
    }

    @Override // com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture.IVDPhotoSelfieCapture
    public void VDPhotoSelfieAndFaceCaptured(@Nullable byte[] selfieImage, @Nullable byte[] faceImage) {
        if (selfieImage == null || faceImage == null) {
            return;
        }
        ArrayList arrayList = this.f36458r0;
        arrayList.add(new SelfieCaptureResult.CachedCapturedImage(SelfieCapturePlugin.ID, selfieImage));
        arrayList.add(new SelfieCaptureResult.CachedCapturedImage("FaceCapture", faceImage));
    }

    @Override // com.dasnano.vdphotoselfiecapture.VDPhotoSelfieCapture.IVDPhotoSelfieCapture
    public void VDPhotoSelfieAndFaceCapturedWithLiveDetection(@Nullable byte[] selfieByteArray, @Nullable byte[] faceByteArray) {
        if (selfieByteArray == null || faceByteArray == null) {
            return;
        }
        ArrayList arrayList = this.f36458r0;
        arrayList.add(new SelfieCaptureResult.CachedCapturedImage("SelfieLiveCapture", selfieByteArray));
        arrayList.add(new SelfieCaptureResult.CachedCapturedImage("FaceLiveCapture", faceByteArray));
    }
}
