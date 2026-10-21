package com.bbva.glomohybrid.base.file.channels;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: FileInteractions.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/bbva/glomohybrid/base/file/channels/FileInteraction;", "", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "Monthly", "PdfDocument", "Receipt", "TermsAndConditions", "Unrecognized", "Lcom/bbva/glomohybrid/base/file/channels/FileInteraction$Monthly;", "Lcom/bbva/glomohybrid/base/file/channels/FileInteraction$PdfDocument;", "Lcom/bbva/glomohybrid/base/file/channels/FileInteraction$Receipt;", "Lcom/bbva/glomohybrid/base/file/channels/FileInteraction$TermsAndConditions;", "Lcom/bbva/glomohybrid/base/file/channels/FileInteraction$Unrecognized;", "Base_release"}, k = 1, mv = {1, 9, 0})
public abstract class FileInteraction {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String id;

    /* JADX INFO: compiled from: FileInteractions.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/base/file/channels/FileInteraction$Monthly;", "Lcom/bbva/glomohybrid/base/file/channels/FileInteraction;", "", "b", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "path", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final class Monthly extends FileInteraction {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Monthly(@NotNull String id, @NotNull String path) {
            super(id, null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(path, "path");
            this.path = path;
        }

        @NotNull
        public final String getPath() {
            return this.path;
        }
    }

    /* JADX INFO: compiled from: FileInteractions.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/base/file/channels/FileInteraction$PdfDocument;", "Lcom/bbva/glomohybrid/base/file/channels/FileInteraction;", "", "b", "Ljava/lang/String;", "getPath", "()Ljava/lang/String;", "path", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final class PdfDocument extends FileInteraction {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String path;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PdfDocument(@NotNull String id, @NotNull String path) {
            super(id, null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(path, "path");
            this.path = path;
        }

        @NotNull
        public final String getPath() {
            return this.path;
        }
    }

    /* JADX INFO: compiled from: FileInteractions.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/base/file/channels/FileInteraction$Receipt;", "Lcom/bbva/glomohybrid/base/file/channels/FileInteraction;", "", "b", "Ljava/lang/String;", "getContent", "()Ljava/lang/String;", "content", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final class Receipt extends FileInteraction {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Receipt(@NotNull String id, @NotNull String content) {
            super(id, null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        @NotNull
        public final String getContent() {
            return this.content;
        }
    }

    /* JADX INFO: compiled from: FileInteractions.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/bbva/glomohybrid/base/file/channels/FileInteraction$TermsAndConditions;", "Lcom/bbva/glomohybrid/base/file/channels/FileInteraction;", "", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "name", "id", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0})
    public static final class TermsAndConditions extends FileInteraction {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String name;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TermsAndConditions(@NotNull String id, @NotNull String name) {
            super(id, null);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(name, "name");
            this.name = name;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }
    }

    /* JADX INFO: compiled from: FileInteractions.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/glomohybrid/base/file/channels/FileInteraction$Unrecognized;", "Lcom/bbva/glomohybrid/base/file/channels/FileInteraction;", "id", "", "(Ljava/lang/String;)V", "Base_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Unrecognized extends FileInteraction {
        /* JADX WARN: Multi-variable type inference failed */
        public Unrecognized() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Unrecognized(@NotNull String id) {
            super(id, null);
            Intrinsics.checkNotNullParameter(id, "id");
        }

        public /* synthetic */ Unrecognized(String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? "" : str);
        }
    }

    public FileInteraction(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.id = str;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
