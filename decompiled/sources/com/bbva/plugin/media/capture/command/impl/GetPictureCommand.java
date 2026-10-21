package com.bbva.plugin.media.capture.command.impl;

import android.app.Activity;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityLauncher;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResult;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.media.capture.command.param.GetPictureParams;
import com.bbva.plugin.media.capture.command.param.GetPictureParamsKt;
import com.bbva.plugin.media.capture.command.param.GetPictureParamsValidator;
import com.bbva.plugin.media.capture.media.image.transformer.GrayscaleImageTransformer;
import com.bbva.plugin.media.capture.media.image.transformer.MonochromeImageTransformer;
import com.bbva.plugin.media.capture.model.MediaSource;
import com.bbva.plugin.media.capture.model.TempFile;
import com.bbva.plugin.media.capture.util.Constants;
import com.bbva.plugin.media.capture.util.FileUtils;
import hb.a;
import hb.b;
import hb.c;
import hb.d;
import hb.e;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: GetPictureCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\u000b"}, d2 = {"Lcom/bbva/plugin/media/capture/command/impl/GetPictureCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/media/capture/command/param/GetPictureParams;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "<init>", "()V", "Companion", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class GetPictureCommand extends AbstractCommand<GetPictureParams> {

    @NotNull
    public static final String EXTENSION = "extension";

    @NotNull
    public static final String FILE_BASE64 = "fileBase64";

    @NotNull
    public static final String NAME = "name";

    @NotNull
    public static final String PATH = "path";

    @NotNull
    public static final String SIZE = "size";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public GetPictureParams f35815p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CommandCallback f35816q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public TempFile f35817r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final CoroutineScope f35818s0;

    public GetPictureCommand() {
        super(GetPictureParams.class, new GetPictureParamsValidator());
        this.f35818s0 = CoroutineScopeKt.MainScope();
    }

    public static final void access$dispatchResult(GetPictureCommand getPictureCommand, ActivityResult activityResult) {
        getPictureCommand.getClass();
        if (activityResult instanceof ActivityResult.Success) {
            BuildersKt__Builders_commonKt.launch$default(getPictureCommand.f35818s0, null, null, new e(getPictureCommand, ((ActivityResult.Success) activityResult).getIntent(), null), 3, null);
            return;
        }
        if (activityResult instanceof ActivityResult.Cancel) {
            CommandCallback commandCallback = getPictureCommand.f35816q0;
            if (commandCallback != null) {
                commandCallback.sendError(Errors.ErrorCanceled);
            }
            TempFile tempFile = getPictureCommand.f35817r0;
            if (tempFile != null) {
                if (tempFile.getFile().exists()) {
                    tempFile.getFile().delete();
                }
                getPictureCommand.f35817r0 = null;
            }
            getPictureCommand.f35816q0 = null;
            getPictureCommand.f35815p0 = null;
        }
    }

    public static final JSONObject access$prepareJsonResult(GetPictureCommand getPictureCommand, TempFile tempFile, String str) throws JSONException {
        getPictureCommand.getClass();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", tempFile.getFile().getName());
        jSONObject.put("size", tempFile.getFile().length());
        jSONObject.put("extension", ik.e.getExtension(tempFile.getFile()));
        jSONObject.put("path", tempFile.getFile().getPath());
        if (GetPictureParamsKt.base64(getPictureCommand.f35815p0)) {
            jSONObject.put("fileBase64", str);
        }
        return jSONObject;
    }

    public static final void access$release(GetPictureCommand getPictureCommand) {
        TempFile tempFile = getPictureCommand.f35817r0;
        if (tempFile != null) {
            if (tempFile.getFile().exists()) {
                tempFile.getFile().delete();
            }
            getPictureCommand.f35817r0 = null;
        }
        getPictureCommand.f35816q0 = null;
        getPictureCommand.f35815p0 = null;
    }

    public static final List access$transformations(GetPictureCommand getPictureCommand, GetPictureParams getPictureParams) {
        getPictureCommand.getClass();
        ArrayList arrayList = new ArrayList();
        if (GetPictureParamsKt.grayscale(getPictureParams)) {
            arrayList.add(new GrayscaleImageTransformer());
        }
        if (GetPictureParamsKt.monochrome(getPictureParams)) {
            arrayList.add(new MonochromeImageTransformer(null, 1, null));
        }
        return arrayList;
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull GetPictureParams params, @NotNull CommandCallback callback) {
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Optional<Activity> activityOptional = this.mActivityContainer.get();
        Intrinsics.checkNotNullExpressionValue(activityOptional, "activityOptional");
        if (!activityOptional.isPresent()) {
            CommandCallback commandCallback = this.f35816q0;
            if (commandCallback != null) {
                commandCallback.sendError(Errors.ErrorNotAvailable);
                return;
            }
            return;
        }
        this.f35815p0 = params;
        this.f35816q0 = callback;
        String source = params.getSource();
        if (source == null) {
            return;
        }
        int iHashCode = source.hashCode();
        if (iHashCode != -1367751899) {
            if (iHashCode == -196315310 && source.equals(Constants.GALLERY_SRC)) {
                Activity activity = activityOptional.get();
                Intrinsics.checkNotNullExpressionValue(activity, "activityOptional.get()");
                new ActivityLauncher().create(c.f69362p0).listen(new d(this)).launch(activity);
                return;
            }
            return;
        }
        if (source.equals(Constants.CAMERA_SRC)) {
            Activity activity2 = activityOptional.get();
            Intrinsics.checkNotNullExpressionValue(activity2, "activityOptional.get()");
            Activity activity3 = activity2;
            this.f35817r0 = FileUtils.INSTANCE.createTempFile$media_capture_plugin_release(activity3, MediaSource.Image);
            new ActivityLauncher().create(new a(this)).listen(new b(this)).launch(activity3);
        }
    }
}
