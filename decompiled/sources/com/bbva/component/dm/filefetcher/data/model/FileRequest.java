package com.bbva.component.dm.filefetcher.data.model;

import bk.q;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FileRequest.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b(\u0010)J\u001a\u0010\u0005\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002J\t\u0010\u0006\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\tHÆ\u0003J\u0015\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003JG\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\t2\u0014\b\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0013HÖ\u0001J\u0013\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\r\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u000e\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006*"}, d2 = {"Lcom/bbva/component/dm/filefetcher/data/model/FileRequest;", "", "", "", "headers", "withAppendedHeaders", "component1", "component2", "component3", "Lcom/bbva/component/dm/filefetcher/data/model/FileType;", "component4", "component5", "actionResult", "url", "fileName", "fileType", "requestHeaders", "copy", "toString", "", GenerateActivationFormCommand.HASH_CODE, "other", "", "equals", "a", "Ljava/lang/String;", "getActionResult", "()Ljava/lang/String;", "b", "getUrl", "c", "getFileName", "d", "Lcom/bbva/component/dm/filefetcher/data/model/FileType;", "getFileType", "()Lcom/bbva/component/dm/filefetcher/data/model/FileType;", "e", "Ljava/util/Map;", "getRequestHeaders", "()Ljava/util/Map;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/bbva/component/dm/filefetcher/data/model/FileType;Ljava/util/Map;)V", "component-dm-filefetcher_release"}, k = 1, mv = {1, 4, 0})
public final /* data */ class FileRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String actionResult;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String url;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String fileName;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final FileType fileType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Map<String, String> requestHeaders;

    public FileRequest(@NotNull String str, @NotNull String str2, @NotNull String str3, @NotNull FileType fileType, @NotNull Map<String, String> map) {
        this.actionResult = str;
        this.url = str2;
        this.fileName = str3;
        this.fileType = fileType;
        this.requestHeaders = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FileRequest copy$default(FileRequest fileRequest, String str, String str2, String str3, FileType fileType, Map map, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = fileRequest.actionResult;
        }
        if ((i10 & 2) != 0) {
            str2 = fileRequest.url;
        }
        String str4 = str2;
        if ((i10 & 4) != 0) {
            str3 = fileRequest.fileName;
        }
        String str5 = str3;
        if ((i10 & 8) != 0) {
            fileType = fileRequest.fileType;
        }
        FileType fileType2 = fileType;
        if ((i10 & 16) != 0) {
            map = fileRequest.requestHeaders;
        }
        return fileRequest.copy(str, str4, str5, fileType2, map);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getActionResult() {
        return this.actionResult;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFileName() {
        return this.fileName;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final FileType getFileType() {
        return this.fileType;
    }

    @NotNull
    public final Map<String, String> component5() {
        return this.requestHeaders;
    }

    @NotNull
    public final FileRequest copy(@NotNull String actionResult, @NotNull String url, @NotNull String fileName, @NotNull FileType fileType, @NotNull Map<String, String> requestHeaders) {
        return new FileRequest(actionResult, url, fileName, fileType, requestHeaders);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FileRequest)) {
            return false;
        }
        FileRequest fileRequest = (FileRequest) other;
        return Intrinsics.areEqual(this.actionResult, fileRequest.actionResult) && Intrinsics.areEqual(this.url, fileRequest.url) && Intrinsics.areEqual(this.fileName, fileRequest.fileName) && Intrinsics.areEqual(this.fileType, fileRequest.fileType) && Intrinsics.areEqual(this.requestHeaders, fileRequest.requestHeaders);
    }

    @NotNull
    public final String getActionResult() {
        return this.actionResult;
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
    public final Map<String, String> getRequestHeaders() {
        return this.requestHeaders;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        String str = this.actionResult;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.url;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.fileName;
        int iHashCode3 = (iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        FileType fileType = this.fileType;
        int iHashCode4 = (iHashCode3 + (fileType != null ? fileType.hashCode() : 0)) * 31;
        Map<String, String> map = this.requestHeaders;
        return iHashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FileRequest(actionResult=" + this.actionResult + ", url=" + this.url + ", fileName=" + this.fileName + ", fileType=" + this.fileType + ", requestHeaders=" + this.requestHeaders + ")";
    }

    @NotNull
    public final FileRequest withAppendedHeaders(@NotNull Map<String, String> headers) {
        return copy$default(this, null, null, null, null, q.plus(this.requestHeaders, headers), 15, null);
    }

    public /* synthetic */ FileRequest(String str, String str2, String str3, FileType fileType, Map map, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, fileType, (i10 & 16) != 0 ? new HashMap() : map);
    }
}
