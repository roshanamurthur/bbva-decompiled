package com.bbva.component.dm.filefetcher.data.model;

import com.bbva.glomohybrid.documents.common.repository.dataSource.DiskFileDataSource;
import com.bbva.image.compressor.JpegCompressor;
import com.bbva.image.compressor.PngCompressor;
import com.veridas.Veridas;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileType.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u000b\f\r\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006\u0082\u0001\u0004\u000f\u0010\u0011\u0012¨\u0006\u0013"}, d2 = {"Lcom/bbva/component/dm/filefetcher/data/model/FileType;", "", "", "a", "Ljava/lang/String;", "getMimeType", "()Ljava/lang/String;", "mimeType", "b", "getExtension", "extension", "JPEG", "JPG", "PDF", "PNG", "Lcom/bbva/component/dm/filefetcher/data/model/FileType$PDF;", "Lcom/bbva/component/dm/filefetcher/data/model/FileType$PNG;", "Lcom/bbva/component/dm/filefetcher/data/model/FileType$JPG;", "Lcom/bbva/component/dm/filefetcher/data/model/FileType$JPEG;", "component-dm-filefetcher_release"}, k = 1, mv = {1, 4, 0})
public abstract class FileType {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String mimeType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String extension;

    /* JADX INFO: compiled from: FileType.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/dm/filefetcher/data/model/FileType$JPEG;", "Lcom/bbva/component/dm/filefetcher/data/model/FileType;", "()V", "component-dm-filefetcher_release"}, k = 1, mv = {1, 1, 15})
    public static final class JPEG extends FileType {
        public static final JPEG INSTANCE = new JPEG();

        public JPEG() {
            super(Veridas.JPEG_MIME_TYPE, JpegCompressor.ID, null);
        }
    }

    /* JADX INFO: compiled from: FileType.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/dm/filefetcher/data/model/FileType$JPG;", "Lcom/bbva/component/dm/filefetcher/data/model/FileType;", "()V", "component-dm-filefetcher_release"}, k = 1, mv = {1, 1, 15})
    public static final class JPG extends FileType {
        public static final JPG INSTANCE = new JPG();

        public JPG() {
            super("image/jpg", "jpg", null);
        }
    }

    /* JADX INFO: compiled from: FileType.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/dm/filefetcher/data/model/FileType$PDF;", "Lcom/bbva/component/dm/filefetcher/data/model/FileType;", "()V", "component-dm-filefetcher_release"}, k = 1, mv = {1, 1, 15})
    public static final class PDF extends FileType {
        public static final PDF INSTANCE = new PDF();

        public PDF() {
            super(DiskFileDataSource.APPLICATION_PDF, "pdf", null);
        }
    }

    /* JADX INFO: compiled from: FileType.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/bbva/component/dm/filefetcher/data/model/FileType$PNG;", "Lcom/bbva/component/dm/filefetcher/data/model/FileType;", "()V", "component-dm-filefetcher_release"}, k = 1, mv = {1, 1, 15})
    public static final class PNG extends FileType {
        public static final PNG INSTANCE = new PNG();

        public PNG() {
            super("image/png", PngCompressor.ID, null);
        }
    }

    public FileType(String str, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this.mimeType = str;
        this.extension = str2;
    }

    @NotNull
    public final String getExtension() {
        return this.extension;
    }

    @NotNull
    public final String getMimeType() {
        return this.mimeType;
    }
}
