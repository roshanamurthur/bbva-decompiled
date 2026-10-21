package com.bbva.glomohybrid.base.file.viewmodel;

import android.annotation.SuppressLint;
import bk.q;
import com.bbva.cells.component.kit.common.ReactiveComponent;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.component.dm.filefetcher.data.model.FileFetchErrorResponse;
import com.bbva.component.dm.filefetcher.data.model.FileRequest;
import com.bbva.component.dm.filefetcher.data.model.FileResponse;
import com.bbva.glomohybrid.base.cells.CellsReactor;
import com.bbva.glomohybrid.base.cells.constants.ActionConstants;
import com.bbva.glomohybrid.base.file.channels.FileInteraction;
import com.bbva.glomohybrid.base.file.common.FileExporter;
import com.bbva.glomohybrid.base.file.infrastructure.FileActions;
import com.bbva.glomohybrid.base.file.infrastructure.resolver.FileNameResolver;
import com.bbva.glomohybrid.base.file.receipts.ReceiptsStore;
import com.bbva.glomohybrid.base.file.receipts.model.Receipt;
import com.bbva.glomoutils.Either;
import com.bbva.glomoutils.EitherKt;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import net.ipsoft.amelia.sdk.internal.c.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FileManagerComponent.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB\u001f\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tJ\u0018\u0010\u000e\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0002J\u000e\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\b\u0010\u0016\u001a\u00020\u0007H\u0016¨\u0006 "}, d2 = {"Lcom/bbva/glomohybrid/base/file/viewmodel/FileManagerComponent;", "Lcom/bbva/cells/component/kit/common/ReactiveComponent;", "", "getId", "Lcom/bbva/glomohybrid/base/file/infrastructure/FileActions;", "fileActions", "url", "", "downloadFile", "Lcom/bbva/component/dm/filefetcher/data/model/FileFetchErrorResponse;", "errorResponse", "errorDownloadingFile", "actionId", "errorMessage", "cannotOpenFile", "fileOpened", "Lcom/bbva/component/dm/filefetcher/data/model/FileResponse;", "it", "downloadedFile", "Lcom/bbva/glomohybrid/base/file/receipts/model/Receipt;", c.f84805j, "shareReceipt", "dispose", "Lcom/bbva/glomohybrid/base/file/common/FileExporter;", "fileExporter", "Lcom/bbva/glomohybrid/base/file/receipts/ReceiptsStore;", "receiptsStore", "Lcom/bbva/glomohybrid/base/file/infrastructure/resolver/FileNameResolver;", "fileNameResolver", "<init>", "(Lcom/bbva/glomohybrid/base/file/common/FileExporter;Lcom/bbva/glomohybrid/base/file/receipts/ReceiptsStore;Lcom/bbva/glomohybrid/base/file/infrastructure/resolver/FileNameResolver;)V", "Companion", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class FileManagerComponent extends ReactiveComponent {

    @NotNull
    public static final String ERROR_EMPTY_URL = "Empty url";

    @NotNull
    public static final String ID = "component-file-manager";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    @NotNull
    public final FileExporter f31381p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    @NotNull
    public final ReceiptsStore f31382q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    @NotNull
    public final FileNameResolver f31383r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    @NotNull
    public final CoroutineScope f31384s0;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Map<String, Object>> f31378t0 = new ActionSpec<>("action-view-external-file");

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<FileRequest> f31379u0 = new ActionSpec<>("action-download-file");

    @NotNull
    public static final ActionSpec<FileInteraction> v0 = new ActionSpec<>("native-action-download-file");

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    @NotNull
    public static final ActionSpec<Boolean> f31380w0 = new ActionSpec<>("action-close-session");

    /* JADX INFO: compiled from: FileManagerComponent.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0007R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R#\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00010\u000f0\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0007R\u000e\u0010\u0012\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0010X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/bbva/glomohybrid/base/file/viewmodel/FileManagerComponent$Companion;", "", "()V", "ACTION_CLOSE_SESSION", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "", "getACTION_CLOSE_SESSION", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "ACTION_DOWNLOAD_FILE", "Lcom/bbva/component/dm/filefetcher/data/model/FileRequest;", "getACTION_DOWNLOAD_FILE", "ACTION_NATIVE_DOWNLOAD_FILE", "Lcom/bbva/glomohybrid/base/file/channels/FileInteraction;", "getACTION_NATIVE_DOWNLOAD_FILE", "ACTION_OPEN_FILE", "", "", "getACTION_OPEN_FILE", "ERROR_EMPTY_URL", "ID", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ActionSpec<Boolean> getACTION_CLOSE_SESSION() {
            return FileManagerComponent.f31380w0;
        }

        @NotNull
        public final ActionSpec<FileRequest> getACTION_DOWNLOAD_FILE() {
            return FileManagerComponent.f31379u0;
        }

        @NotNull
        public final ActionSpec<FileInteraction> getACTION_NATIVE_DOWNLOAD_FILE() {
            return FileManagerComponent.v0;
        }

        @NotNull
        public final ActionSpec<Map<String, Object>> getACTION_OPEN_FILE() {
            return FileManagerComponent.f31378t0;
        }
    }

    /* JADX INFO: compiled from: FileManagerComponent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FileActions.values().length];
            try {
                iArr[FileActions.Monthly.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FileActions.Terms.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FileActions.PdfDocument.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: compiled from: FileManagerComponent.kt */
    @DebugMetadata(c = "com.bbva.glomohybrid.base.file.viewmodel.FileManagerComponent$shareReceipt$1", f = "FileManagerComponent.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nFileManagerComponent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileManagerComponent.kt\ncom/bbva/glomohybrid/base/file/viewmodel/FileManagerComponent$shareReceipt$1\n+ 2 Either.kt\ncom/bbva/glomoutils/EitherKt\n*L\n1#1,121:1\n25#2,3:122\n*S KotlinDebug\n*F\n+ 1 FileManagerComponent.kt\ncom/bbva/glomohybrid/base/file/viewmodel/FileManagerComponent$shareReceipt$1\n*L\n106#1:122,3\n*E\n"})
    public static final class a extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public int f31385p0;

        /* JADX INFO: renamed from: r0, reason: collision with root package name */
        public final /* synthetic */ Receipt f31387r0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Receipt receipt, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f31387r0 = receipt;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return FileManagerComponent.this.new a(this.f31387r0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = ek.a.getCOROUTINE_SUSPENDED();
            int i10 = this.f31385p0;
            FileManagerComponent fileManagerComponent = FileManagerComponent.this;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                ReceiptsStore receiptsStore = fileManagerComponent.f31382q0;
                Receipt receipt = this.f31387r0;
                String content = receipt.getContent();
                String name = receipt.getName();
                this.f31385p0 = 1;
                obj = receiptsStore.create(content, name, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Either either = (Either) obj;
            if (either instanceof Either.Right) {
                CellsReactor.fire(FileManagerComponent.ID, ActionConstants.INSTANCE.getACTION_SHARE_RECEIPT$Base_release(), fileManagerComponent.f31381p0.export((String) ((Either.Right) either).getValue()));
                EitherKt.right(Unit.INSTANCE);
            } else if (!(either instanceof Either.Left)) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    public FileManagerComponent(@NotNull FileExporter fileExporter, @NotNull ReceiptsStore receiptsStore, @NotNull FileNameResolver fileNameResolver) {
        Intrinsics.checkNotNullParameter(fileExporter, "fileExporter");
        Intrinsics.checkNotNullParameter(receiptsStore, "receiptsStore");
        Intrinsics.checkNotNullParameter(fileNameResolver, "fileNameResolver");
        this.f31381p0 = fileExporter;
        this.f31382q0 = receiptsStore;
        this.f31383r0 = fileNameResolver;
        this.f31384s0 = CoroutineScopeKt.MainScope();
    }

    public final void cannotOpenFile(@Nullable String actionId, @NotNull String errorMessage) {
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        FileActions fileActionsOf = FileActions.INSTANCE.of(actionId);
        if (fileActionsOf != null) {
            CellsReactor.fire(ID, fileActionsOf.getResultAction(), EitherKt.left(errorMessage));
            CellsReactor.fire(ID, fileActionsOf.getErrorAction(), errorMessage);
        }
    }

    @Override // com.bbva.cells.component.kit.common.ReactiveComponent, com.bbva.cells.component.kit.common.Disposable
    public void dispose() {
        super.dispose();
        CoroutineScopeKt.cancel$default(this.f31384s0, null, 1, null);
    }

    public final void downloadFile(@NotNull FileActions fileActions, @Nullable String url) {
        Intrinsics.checkNotNullParameter(fileActions, "fileActions");
        if (url == null || url.length() == 0) {
            CellsReactor.fire(ID, fileActions.getResultAction(), EitherKt.left(ERROR_EMPTY_URL));
            CellsReactor.fire(ID, fileActions.getErrorAction(), ERROR_EMPTY_URL);
        } else {
            CellsReactor.fire(ID, f31379u0, FileActions.toFileRequest$default(fileActions, url, this.f31383r0.getName(fileActions), null, 4, null));
        }
    }

    public final void downloadedFile(@NotNull FileResponse it) {
        Intrinsics.checkNotNullParameter(it, "it");
        FileActions fileActionsOf = FileActions.INSTANCE.of(it.getActionResult());
        int i10 = fileActionsOf == null ? -1 : WhenMappings.$EnumSwitchMapping$0[fileActionsOf.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            CellsReactor.fire(ID, f31378t0, q.mapOf(TuplesKt.to("type", "view"), TuplesKt.to("action", it.getActionResult()), TuplesKt.to("value", q.mapOf(TuplesKt.to("value", this.f31381p0.export(it.getFilePath())), TuplesKt.to("mime", it.getFileType().getMimeType()), TuplesKt.to("flags", 1)))));
        }
    }

    public final void errorDownloadingFile(@NotNull FileFetchErrorResponse errorResponse) {
        Intrinsics.checkNotNullParameter(errorResponse, "errorResponse");
        FileActions fileActionsOf = FileActions.INSTANCE.of(errorResponse.getActionResult());
        if (fileActionsOf != null) {
            ActionSpec<Either<String, Boolean>> resultAction = fileActionsOf.getResultAction();
            String message = errorResponse.getMessage();
            if (message == null) {
                message = "";
            }
            CellsReactor.fire(ID, resultAction, EitherKt.left(message));
            ActionSpec<String> errorAction = fileActionsOf.getErrorAction();
            String message2 = errorResponse.getMessage();
            CellsReactor.fire(ID, errorAction, message2 != null ? message2 : "");
        }
    }

    public final void fileOpened(@Nullable String actionId) {
        FileActions fileActionsOf = FileActions.INSTANCE.of(actionId);
        if (fileActionsOf != null) {
            CellsReactor.fire(ID, fileActionsOf.getResultAction(), EitherKt.right(Boolean.TRUE));
            CellsReactor.fire(ID, fileActionsOf.getSuccessAction(), "ok");
        }
    }

    @Override // com.bbva.cells.component.kit.common.Component
    @NotNull
    /* JADX INFO: renamed from: getId */
    public String getF32219p0() {
        return ID;
    }

    @SuppressLint({"CheckResult"})
    public final void shareReceipt(@NotNull Receipt receipt) {
        Intrinsics.checkNotNullParameter(receipt, "receipt");
        BuildersKt__Builders_commonKt.launch$default(this.f31384s0, null, null, new a(receipt, null), 3, null);
    }
}
