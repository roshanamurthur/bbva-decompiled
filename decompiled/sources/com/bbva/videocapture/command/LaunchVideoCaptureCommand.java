package com.bbva.videocapture.command;

import android.app.Application;
import android.content.Context;
import com.bbva.androidtoolkit.plugin.command.PermissionCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.filesystem.WebFile;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.videocapture.VideoCapturePlugin;
import com.bbva.videocapture.command.params.LaunchVideoCaptureParams;
import com.bbva.videocapture.command.params.response.CachedCapturedVideo;
import com.bbva.videocapture.di.InjectorKt;
import com.dasnano.vdvideoselfiecapture.VDVideoSelfieCapture;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import k6.d;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import nc.a;
import nc.b;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: LaunchVideoCaptureCommand.kt */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0006\u001a\u00020\u0005H\u0014J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\nH\u0016R\u0014\u0010\u000f\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/bbva/videocapture/command/LaunchVideoCaptureCommand;", "Lcom/bbva/androidtoolkit/plugin/command/PermissionCommand;", "Lcom/bbva/videocapture/command/params/LaunchVideoCaptureParams;", "Lcom/dasnano/vdvideoselfiecapture/VDVideoSelfieCapture$IVDVideoSelfieCapture;", "Lkotlinx/coroutines/CoroutineScope;", "", "executeWithPermissionsGranted", "", "p0", "VDVideoSelfieFinished", "", "VDVideoSelfieCaptured", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "<init>", "()V", "video-capture-plugin_release"}, k = 1, mv = {2, 0, 0})
public final class LaunchVideoCaptureCommand extends PermissionCommand<LaunchVideoCaptureParams> implements VDVideoSelfieCapture.IVDVideoSelfieCapture, CoroutineScope {

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ CoroutineScope f37777q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final ArrayList f37778r0;

    public LaunchVideoCaptureCommand() {
        super(LaunchVideoCaptureParams.class, 2, "android.permission.CAMERA", "android.permission.RECORD_AUDIO");
        this.f37777q0 = CoroutineScopeKt.MainScope();
        this.f37778r0 = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Unit a(LaunchVideoCaptureCommand launchVideoCaptureCommand, VideoCapturable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Context applicationContext = launchVideoCaptureCommand.mApplication.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        T mParams = launchVideoCaptureCommand.mParams;
        Intrinsics.checkNotNullExpressionValue(mParams, "mParams");
        it.startVideoCapture(launchVideoCaptureCommand, applicationContext, (LaunchVideoCaptureParams) mParams);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    public static final Object access$createUrl(LaunchVideoCaptureCommand launchVideoCaptureCommand, byte[] bArr, Continuation continuation) {
        a aVar;
        launchVideoCaptureCommand.getClass();
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i10 = aVar.f84496r0;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f84496r0 = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(launchVideoCaptureCommand, continuation);
            }
        } else {
            aVar = new a(launchVideoCaptureCommand, continuation);
        }
        Object objFrom = aVar.f84494p0;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i11 = aVar.f84496r0;
        if (i11 == 0) {
            ResultKt.throwOnFailure(objFrom);
            WebFile.Companion companion = WebFile.INSTANCE;
            Application mApplication = launchVideoCaptureCommand.mApplication;
            Intrinsics.checkNotNullExpressionValue(mApplication, "mApplication");
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            aVar.f84496r0 = 1;
            objFrom = companion.from(mApplication, byteArrayInputStream, "mp4", aVar);
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

    @Override // com.dasnano.vdvideoselfiecapture.VDVideoSelfieCapture.IVDVideoSelfieCapture
    public void VDVideoSelfieCaptured(@NotNull byte[] p4) {
        Intrinsics.checkNotNullParameter(p4, "p0");
        this.f37778r0.add(new CachedCapturedVideo(VideoCapturePlugin.ID, p4));
    }

    @Override // com.dasnano.vdvideoselfiecapture.VDVideoSelfieCapture.IVDVideoSelfieCapture
    public void VDVideoSelfieFinished(boolean p4) {
        if (p4) {
            BuildersKt__Builders_commonKt.launch$default(this, null, null, new b(this, null), 3, null);
        } else {
            this.mCommandCallback.sendError(Errors.ErrorCanceled);
        }
    }

    @Override // com.bbva.androidtoolkit.plugin.command.PermissionCommand
    public void executeWithPermissionsGranted() {
        if (this.mParams != 0) {
            CommandCallback mCommandCallback = this.mCommandCallback;
            Intrinsics.checkNotNullExpressionValue(mCommandCallback, "mCommandCallback");
            InjectorKt.withVideoCapture(mCommandCallback, new d(this, 2));
        } else {
            CommandCallback commandCallback = this.mCommandCallback;
            if (commandCallback != null) {
                commandCallback.sendError(Errors.ErrorMalformedParam);
            }
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f37777q0.getCoroutineContext();
    }
}
