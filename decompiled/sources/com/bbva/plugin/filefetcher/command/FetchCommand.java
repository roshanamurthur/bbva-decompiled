package com.bbva.plugin.filefetcher.command;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import bk.d;
import com.bbva.androidtoolkit.optional.Optional;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityCreatorRequest;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResult;
import com.bbva.androidtoolkit.plugin.activity.result.ActivityResultRequest;
import com.bbva.androidtoolkit.plugin.command.AbstractCommand;
import com.bbva.androidtoolkit.plugin.command.callback.CommandCallback;
import com.bbva.androidtoolkit.plugin.response.Errors;
import com.bbva.plugin.filefetcher.model.FetchDTO;
import com.bbva.plugin.filefetcher.model.FetchValidator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FetchCommand.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0014¨\u0006\r"}, d2 = {"Lcom/bbva/plugin/filefetcher/command/FetchCommand;", "Lcom/bbva/androidtoolkit/plugin/command/AbstractCommand;", "Lcom/bbva/plugin/filefetcher/model/FetchDTO;", "params", "Lcom/bbva/androidtoolkit/plugin/command/callback/CommandCallback;", "callback", "", "execute", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityCreatorRequest;", "activityLauncher", "<init>", "(Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityCreatorRequest;)V", "Companion", "filefetcher-plugin_release"}, k = 1, mv = {1, 4, 0})
public final class FetchCommand extends AbstractCommand<FetchDTO> {

    @NotNull
    public static final String EXTENSION = "extension";

    @NotNull
    public static final String FILE_BASE64 = "fileBase64";

    @NotNull
    public static final String ID = "fetch";

    @NotNull
    public static final String NAME = "name";

    @NotNull
    public static final String PATH = "path";

    @NotNull
    public static final String SIZE = "size";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final CoroutineScope f35632p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final ActivityCreatorRequest f35633q0;

    /* JADX INFO: compiled from: FetchCommand.kt */
    public static final class a extends Lambda implements Function1<ActivityResultRequest.Builder, Unit> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public final /* synthetic */ FetchDTO f35634p0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FetchDTO fetchDTO) {
            super(1);
            this.f35634p0 = fetchDTO;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResultRequest.Builder builder) {
            ActivityResultRequest.Builder builder2 = builder;
            builder2.setAction("android.intent.action.GET_CONTENT");
            builder2.setType(this.f35634p0.getContentType());
            builder2.setCategories(d.listOf("android.intent.category.OPENABLE"));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: compiled from: FetchCommand.kt */
    public static final class b extends Lambda implements Function1<ActivityResult, Unit> {

        /* JADX INFO: renamed from: q0, reason: collision with root package name */
        public final /* synthetic */ CommandCallback f35636q0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(CommandCallback commandCallback) {
            super(1);
            this.f35636q0 = commandCallback;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(ActivityResult activityResult) {
            ActivityResult activityResult2 = activityResult;
            boolean z10 = activityResult2 instanceof ActivityResult.Success;
            CommandCallback commandCallback = this.f35636q0;
            if (z10) {
                FetchCommand.access$sendSuccessEvent(FetchCommand.this, ((ActivityResult.Success) activityResult2).getIntent(), commandCallback);
            } else if (activityResult2 instanceof ActivityResult.Cancel) {
                commandCallback.sendError(Errors.ErrorCanceled);
            }
            return Unit.INSTANCE;
        }
    }

    public FetchCommand(@NotNull ActivityCreatorRequest activityCreatorRequest) {
        super(FetchDTO.class, new FetchValidator());
        this.f35633q0 = activityCreatorRequest;
        this.f35632p0 = CoroutineScopeKt.MainScope();
    }

    public static final Pair access$getFileNameAndSize(FetchCommand fetchCommand, Uri uri) {
        String string;
        long j10;
        Application mApplication = fetchCommand.mApplication;
        Intrinsics.checkExpressionValueIsNotNull(mApplication, "mApplication");
        Cursor cursorQuery = mApplication.getContentResolver().query(uri, new String[]{"_display_name", "_size"}, null, null, null);
        if (cursorQuery != null) {
            try {
                int columnIndex = cursorQuery.getColumnIndex("_display_name");
                int columnIndex2 = cursorQuery.getColumnIndex("_size");
                cursorQuery.moveToFirst();
                string = cursorQuery.getString(columnIndex);
                Intrinsics.checkExpressionValueIsNotNull(string, "cursor.getString(nameIndex)");
                j10 = cursorQuery.getLong(columnIndex2);
                Unit unit = Unit.INSTANCE;
                CloseableKt.closeFinally(cursorQuery, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    CloseableKt.closeFinally(cursorQuery, th2);
                    throw th3;
                }
            }
        } else {
            string = "";
            j10 = 0;
        }
        return new Pair(string, Long.valueOf(j10));
    }

    public static final void access$sendSuccessEvent(FetchCommand fetchCommand, Intent intent, CommandCallback commandCallback) {
        fetchCommand.getClass();
        Uri data = intent.getData();
        if (data != null) {
            BuildersKt__Builders_commonKt.launch$default(fetchCommand.f35632p0, null, null, new db.b(fetchCommand, data, commandCallback, null), 3, null);
        } else {
            commandCallback.sendError(Errors.ErrorDefault);
        }
    }

    @Override // com.bbva.androidtoolkit.plugin.command.AbstractCommand
    public void execute(@NotNull FetchDTO params, @NotNull CommandCallback callback) {
        Optional<Activity> optional = this.mActivityContainer.get();
        Activity activity = optional != null ? optional.get() : null;
        if (activity == null) {
            callback.sendError(Errors.ErrorNotAvailable);
        } else {
            this.f35633q0.create(new a(params)).listen(new b(callback)).launch(activity);
        }
    }
}
