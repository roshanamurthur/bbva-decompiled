package com.bbva.glomohybrid.base.file.infrastructure;

import b8.a;
import b8.b;
import b8.c;
import bk.q;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.component.dm.filefetcher.data.model.FileRequest;
import com.bbva.component.dm.filefetcher.data.model.FileType;
import com.bbva.glomoutils.Either;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'Monthly' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: FileActions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001%J.\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0005R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R/\u0010\u001b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00160\u00150\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR'\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u00148FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0018\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001d\u0010\u001aR'\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b!\u0010\u0018\u0012\u0004\b#\u0010\u001f\u001a\u0004\b\"\u0010\u001aj\u0002\b&j\u0002\b'j\u0002\b(¨\u0006)"}, d2 = {"Lcom/bbva/glomohybrid/base/file/infrastructure/FileActions;", "", "", "url", "customFileName", "", "headers", "Lcom/bbva/component/dm/filefetcher/data/model/FileRequest;", "toFileRequest", "actionName", "Ljava/lang/String;", "getActionName", "()Ljava/lang/String;", "fileName", "getFileName", "Lcom/bbva/component/dm/filefetcher/data/model/FileType;", "fileType", "Lcom/bbva/component/dm/filefetcher/data/model/FileType;", "getFileType", "()Lcom/bbva/component/dm/filefetcher/data/model/FileType;", "Lcom/bbva/cells/component/kit/model/ActionSpec;", "Lcom/bbva/glomoutils/Either;", "", "resultAction$delegate", "Lkotlin/Lazy;", "getResultAction", "()Lcom/bbva/cells/component/kit/model/ActionSpec;", "resultAction", "successAction$delegate", "getSuccessAction", "getSuccessAction$annotations", "()V", "successAction", "errorAction$delegate", "getErrorAction", "getErrorAction$annotations", "errorAction", "Companion", "Monthly", "Terms", "PdfDocument", "Base_release"}, k = 1, mv = {1, 9, 0})
public final class FileActions {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FileActions[] $VALUES;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final FileActions Monthly;
    public static final FileActions PdfDocument;
    public static final FileActions Terms;

    @NotNull
    private final String actionName;

    /* JADX INFO: renamed from: errorAction$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy errorAction;

    @NotNull
    private final String fileName;

    @NotNull
    private final FileType fileType;

    /* JADX INFO: renamed from: resultAction$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy resultAction;

    /* JADX INFO: renamed from: successAction$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy successAction;

    /* JADX INFO: compiled from: FileActions.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¨\u0006\u0007"}, d2 = {"Lcom/bbva/glomohybrid/base/file/infrastructure/FileActions$Companion;", "", "()V", "of", "Lcom/bbva/glomohybrid/base/file/infrastructure/FileActions;", "actionName", "", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nFileActions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileActions.kt\ncom/bbva/glomohybrid/base/file/infrastructure/FileActions$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,41:1\n1#2:42\n*E\n"})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final FileActions of(@Nullable String actionName) {
            for (FileActions fileActions : FileActions.values()) {
                if (Intrinsics.areEqual(fileActions.getActionName(), actionName)) {
                    return fileActions;
                }
            }
            return null;
        }
    }

    static {
        FileType.PDF pdf = FileType.PDF.INSTANCE;
        FileActions fileActions = new FileActions("Monthly", 0, "download-monthly", "monthly_statement", pdf);
        Monthly = fileActions;
        FileActions fileActions2 = new FileActions("Terms", 1, "download-terms-and-conditions", "terms_and_conditions", pdf);
        Terms = fileActions2;
        FileActions fileActions3 = new FileActions("PdfDocument", 2, "download-pdf-document", "document", pdf);
        PdfDocument = fileActions3;
        FileActions[] fileActionsArr = {fileActions, fileActions2, fileActions3};
        $VALUES = fileActionsArr;
        $ENTRIES = EnumEntriesKt.enumEntries(fileActionsArr);
        INSTANCE = new Companion(null);
    }

    public FileActions(String str, int i10, String str2, String str3, FileType.PDF pdf) {
        super(str, i10);
        this.actionName = str2;
        this.fileName = str3;
        this.fileType = pdf;
        this.resultAction = LazyKt__LazyJVMKt.lazy(new b(this));
        this.successAction = LazyKt__LazyJVMKt.lazy(new c(this));
        this.errorAction = LazyKt__LazyJVMKt.lazy(new a(this));
    }

    @NotNull
    public static EnumEntries<FileActions> getEntries() {
        return $ENTRIES;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FileRequest toFileRequest$default(FileActions fileActions, String str, String str2, Map map, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toFileRequest");
        }
        if ((i10 & 2) != 0) {
            str2 = fileActions.fileName;
        }
        if ((i10 & 4) != 0) {
            map = q.emptyMap();
        }
        return fileActions.toFileRequest(str, str2, map);
    }

    public static FileActions valueOf(String str) {
        return (FileActions) Enum.valueOf(FileActions.class, str);
    }

    public static FileActions[] values() {
        return (FileActions[]) $VALUES.clone();
    }

    @NotNull
    public final String getActionName() {
        return this.actionName;
    }

    @NotNull
    public final ActionSpec<String> getErrorAction() {
        return (ActionSpec) this.errorAction.getValue();
    }

    @NotNull
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    public final FileType getFileType() {
        return this.fileType;
    }

    @NotNull
    public final ActionSpec<Either<String, Boolean>> getResultAction() {
        return (ActionSpec) this.resultAction.getValue();
    }

    @NotNull
    public final ActionSpec<String> getSuccessAction() {
        return (ActionSpec) this.successAction.getValue();
    }

    @NotNull
    public final FileRequest toFileRequest(@NotNull String url, @NotNull String customFileName, @NotNull Map<String, String> headers) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(customFileName, "customFileName");
        Intrinsics.checkNotNullParameter(headers, "headers");
        return new FileRequest(this.actionName, url, customFileName, this.fileType, headers);
    }

    @Deprecated(message = "Should be removed when Web implements the new implementation")
    public static /* synthetic */ void getErrorAction$annotations() {
    }

    @Deprecated(message = "Should be removed when Web implements the new implementation")
    public static /* synthetic */ void getSuccessAction$annotations() {
    }
}
