package com.bbva.network.model.multipart;

import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: MultiPart.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lcom/bbva/network/model/multipart/PartBody;", "", "", "a", "Ljava/lang/String;", "getContentType", "()Ljava/lang/String;", "contentType", "ByteArrayBody", "FileBody", "Lcom/bbva/network/model/multipart/PartBody$ByteArrayBody;", "Lcom/bbva/network/model/multipart/PartBody$FileBody;", "network_release"}, k = 1, mv = {1, 8, 0})
public abstract class PartBody {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public final String contentType;

    /* JADX INFO: compiled from: MultiPart.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/bbva/network/model/multipart/PartBody$ByteArrayBody;", "Lcom/bbva/network/model/multipart/PartBody;", "", "b", "[B", "getContent", "()[B", "content", "", "contentType", "<init>", "([BLjava/lang/String;)V", "network_release"}, k = 1, mv = {1, 8, 0})
    public static final class ByteArrayBody extends PartBody {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final byte[] content;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ByteArrayBody(@NotNull byte[] content, @Nullable String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(content, "content");
            this.content = content;
        }

        @NotNull
        public final byte[] getContent() {
            return this.content;
        }

        public /* synthetic */ ByteArrayBody(byte[] bArr, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(bArr, (i10 & 2) != 0 ? null : str);
        }
    }

    /* JADX INFO: compiled from: MultiPart.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\f"}, d2 = {"Lcom/bbva/network/model/multipart/PartBody$FileBody;", "Lcom/bbva/network/model/multipart/PartBody;", "Ljava/io/File;", "b", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "file", "", "contentType", "<init>", "(Ljava/io/File;Ljava/lang/String;)V", "network_release"}, k = 1, mv = {1, 8, 0})
    public static final class FileBody extends PartBody {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final File file;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FileBody(@NotNull File file, @Nullable String str) {
            super(str, null);
            Intrinsics.checkNotNullParameter(file, "file");
            this.file = file;
        }

        @NotNull
        public final File getFile() {
            return this.file;
        }

        public /* synthetic */ FileBody(File file, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(file, (i10 & 2) != 0 ? null : str);
        }
    }

    public PartBody(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.contentType = str;
    }

    @Nullable
    public final String getContentType() {
        return this.contentType;
    }
}
