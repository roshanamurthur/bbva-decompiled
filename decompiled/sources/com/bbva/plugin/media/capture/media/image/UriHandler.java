package com.bbva.plugin.media.capture.media.image;

import android.content.Context;
import android.net.Uri;
import com.bbva.io.file.FileIOKt;
import com.bbva.io.file.Source;
import com.bbva.plugin.media.capture.model.MediaSource;
import com.bbva.plugin.media.capture.model.TempFile;
import com.bbva.plugin.media.capture.util.FileUtils;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: UriHandler.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"Lcom/bbva/plugin/media/capture/media/image/UriHandler;", "", "()V", "execute", "Lcom/bbva/plugin/media/capture/model/TempFile;", "context", "Landroid/content/Context;", "originalUri", "Landroid/net/Uri;", "(Landroid/content/Context;Landroid/net/Uri;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "media-capture-plugin_release"}, k = 1, mv = {1, 4, 2})
public final class UriHandler {

    /* JADX INFO: compiled from: UriHandler.kt */
    @DebugMetadata(c = "com.bbva.plugin.media.capture.media.image.UriHandler$execute$2", f = "UriHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super TempFile>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public /* synthetic */ Object f35845p0;

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ Context f35846q0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Uri f35847r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, Uri uri, Continuation continuation) {
            super(2, continuation);
            this.f35846q0 = context;
            this.f35847r0 = uri;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> completion) {
            Intrinsics.checkNotNullParameter(completion, "completion");
            a aVar = new a(this.f35846q0, this.f35847r0, completion);
            aVar.f35845p0 = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super TempFile> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objM5535constructorimpl;
            Object objM5535constructorimpl2;
            ek.a.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            FileUtils fileUtils = FileUtils.INSTANCE;
            MediaSource mediaSource = MediaSource.Image;
            Context context = this.f35846q0;
            TempFile tempFileCreateTempFile$media_capture_plugin_release = fileUtils.createTempFile$media_capture_plugin_release(context, mediaSource);
            try {
                Result.Companion companion = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(context.getContentResolver().openInputStream(this.f35847r0));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m5541isSuccessimpl(objM5535constructorimpl)) {
                try {
                    InputStream inputStream = (InputStream) objM5535constructorimpl;
                    if (inputStream == null) {
                        throw new IllegalArgumentException();
                    }
                    FileIOKt.write(tempFileCreateTempFile$media_capture_plugin_release.getFile(), new Source.InputStreamSource(inputStream));
                    objM5535constructorimpl2 = Result.m5535constructorimpl(tempFileCreateTempFile$media_capture_plugin_release);
                } catch (Throwable th3) {
                    Result.Companion companion3 = Result.INSTANCE;
                    objM5535constructorimpl2 = Result.m5535constructorimpl(ResultKt.createFailure(th3));
                }
            } else {
                objM5535constructorimpl2 = Result.m5535constructorimpl(objM5535constructorimpl);
            }
            if (Result.m5540isFailureimpl(objM5535constructorimpl2)) {
                return null;
            }
            return objM5535constructorimpl2;
        }
    }

    @Nullable
    public final Object execute(@NotNull Context context, @Nullable Uri uri, @NotNull Continuation<? super TempFile> continuation) {
        if (uri == null) {
            return null;
        }
        return BuildersKt.withContext(Dispatchers.getIO(), new a(context, uri, null), continuation);
    }
}
