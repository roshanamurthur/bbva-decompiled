package db;

import android.app.Application;
import android.net.Uri;
import android.webkit.MimeTypeMap;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.io.file.PathKt;
import com.bbva.plugin.filefetcher.command.FetchCommand;
import kotlin.Pair;
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
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: FetchCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@DebugMetadata(c = "com.bbva.plugin.filefetcher.command.FetchCommand$sendSuccessEvent$1", f = "FetchCommand.kt", i = {0, 0}, l = {75}, m = "invokeSuspend", n = {"$this$launch", "jsonObject"}, s = {"L$0", "L$1"})
public final class b extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public CoroutineScope f68160p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CoroutineScope f68161q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public JSONObject f68162r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public int f68163s0;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final /* synthetic */ FetchCommand f68164t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public final /* synthetic */ Uri f68165u0;
    public final /* synthetic */ CommandCallback v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(FetchCommand fetchCommand, Uri uri, CommandCallback commandCallback, Continuation continuation) {
        super(2, continuation);
        this.f68164t0 = fetchCommand;
        this.f68165u0 = uri;
        this.v0 = commandCallback;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        b bVar = new b(this.f68164t0, this.f68165u0, this.v0, continuation);
        bVar.f68160p0 = (CoroutineScope) obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws JSONException {
        JSONObject jSONObject;
        Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
        int i10 = this.f68163s0;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = this.f68160p0;
            JSONObject jSONObject2 = new JSONObject();
            FetchCommand fetchCommand = this.f68164t0;
            Uri uri = this.f68165u0;
            Pair pairAccess$getFileNameAndSize = FetchCommand.access$getFileNameAndSize(fetchCommand, uri);
            jSONObject2.put("name", pairAccess$getFileNameAndSize.getFirst());
            jSONObject2.put("size", ((Number) pairAccess$getFileNameAndSize.getSecond()).longValue());
            Application mApplication = ((AbstractCommand) fetchCommand).mApplication;
            Intrinsics.checkExpressionValueIsNotNull(mApplication, "mApplication");
            String path = PathKt.getPath(uri, mApplication);
            jSONObject2.put("path", path);
            String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(path);
            if (fileExtensionFromUrl == null) {
                fileExtensionFromUrl = "";
            }
            jSONObject2.put("extension", fileExtensionFromUrl);
            this.f68161q0 = coroutineScope;
            this.f68162r0 = jSONObject2;
            this.f68163s0 = 1;
            fetchCommand.getClass();
            obj = BuildersKt.withContext(Dispatchers.getIO(), new a(fetchCommand, uri, null), this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
            jSONObject = jSONObject2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jSONObject = this.f68162r0;
            ResultKt.throwOnFailure(obj);
        }
        String str = (String) obj;
        CommandCallback commandCallback = this.v0;
        if (str != null) {
            jSONObject.put("fileBase64", str);
            commandCallback.sendEvent(jSONObject);
        } else {
            commandCallback.sendError(Errors.ErrorDefault);
        }
        return Unit.INSTANCE;
    }
}
