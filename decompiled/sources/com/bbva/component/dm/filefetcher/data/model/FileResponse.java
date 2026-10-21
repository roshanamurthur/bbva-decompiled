package com.bbva.component.dm.filefetcher.data.model;

import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FileResponse.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÆ\u0003J'\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/bbva/component/dm/filefetcher/data/model/FileResponse;", "", "", "component1", "component2", "Lcom/bbva/component/dm/filefetcher/data/model/FileType;", "component3", "actionResult", "filePath", "fileType", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getActionResult", "()Ljava/lang/String;", "b", "getFilePath", "c", "Lcom/bbva/component/dm/filefetcher/data/model/FileType;", "getFileType", "()Lcom/bbva/component/dm/filefetcher/data/model/FileType;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/bbva/component/dm/filefetcher/data/model/FileType;)V", "component-dm-filefetcher_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class FileResponse {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String actionResult;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String filePath;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FileType fileType;

    public FileResponse(@NotNull String str, @NotNull String str2, @NotNull FileType fileType) {
        this.actionResult = str;
        this.filePath = str2;
        this.fileType = fileType;
    }

    public static /* synthetic */ FileResponse copy$default(FileResponse fileResponse, String str, String str2, FileType fileType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fileResponse.actionResult;
        }
        if ((i10 & 2) != 0) {
            str2 = fileResponse.filePath;
        }
        if ((i10 & 4) != 0) {
            fileType = fileResponse.fileType;
        }
        return fileResponse.copy(str, str2, fileType);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActionResult() {
        return this.actionResult;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final FileType getFileType() {
        return this.fileType;
    }

    @NotNull
    public final FileResponse copy(@NotNull String actionResult, @NotNull String filePath, @NotNull FileType fileType) {
        return new FileResponse(actionResult, filePath, fileType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileResponse)) {
            return false;
        }
        FileResponse fileResponse = (FileResponse) other;
        return Intrinsics.areEqual(this.actionResult, fileResponse.actionResult) && Intrinsics.areEqual(this.filePath, fileResponse.filePath) && Intrinsics.areEqual(this.fileType, fileResponse.fileType);
    }

    @NotNull
    public final String getActionResult() {
        return this.actionResult;
    }

    @NotNull
    public final String getFilePath() {
        return this.filePath;
    }

    @NotNull
    public final FileType getFileType() {
        return this.fileType;
    }

    public int hashCode() {
        String str = this.actionResult;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.filePath;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        FileType fileType = this.fileType;
        return iHashCode2 + (fileType != null ? fileType.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FileResponse(actionResult=" + this.actionResult + ", filePath=" + this.filePath + ", fileType=" + this.fileType + ")";
    }
}
