package com.bbva.io.file;

import java.io.InputStream;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Source.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/bbva/io/file/Source;", "", "()V", "Base64Source", "ByteArraySource", "InputStreamSource", "StringSource", "Lcom/bbva/io/file/Source$InputStreamSource;", "Lcom/bbva/io/file/Source$Base64Source;", "Lcom/bbva/io/file/Source$ByteArraySource;", "Lcom/bbva/io/file/Source$StringSource;", "io_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public abstract class Source {

    /* JADX INFO: compiled from: Source.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/io/file/Source$Base64Source;", "Lcom/bbva/io/file/Source;", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;)V", "io_release"}, k = 1, mv = {1, 6, 0})
    public static final class Base64Source extends Source {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Base64Source(@NotNull String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: Source.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/io/file/Source$ByteArraySource;", "Lcom/bbva/io/file/Source;", "", "a", "[B", "getValue", "()[B", "value", "<init>", "([B)V", "io_release"}, k = 1, mv = {1, 6, 0})
    public static final class ByteArraySource extends Source {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final byte[] value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ByteArraySource(@NotNull byte[] value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        @NotNull
        public final byte[] getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: Source.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/io/file/Source$InputStreamSource;", "Lcom/bbva/io/file/Source;", "Ljava/io/InputStream;", "a", "Ljava/io/InputStream;", "getValue", "()Ljava/io/InputStream;", "value", "<init>", "(Ljava/io/InputStream;)V", "io_release"}, k = 1, mv = {1, 6, 0})
    public static final class InputStreamSource extends Source {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final InputStream value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InputStreamSource(@NotNull InputStream value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        @NotNull
        public final InputStream getValue() {
            return this.value;
        }
    }

    /* JADX INFO: compiled from: Source.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/io/file/Source$StringSource;", "Lcom/bbva/io/file/Source;", "", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;)V", "io_release"}, k = 1, mv = {1, 6, 0})
    public static final class StringSource extends Source {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @NotNull
        public final String value;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public StringSource(@NotNull String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        @NotNull
        public final String getValue() {
            return this.value;
        }
    }

    public Source() {
    }

    public /* synthetic */ Source(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
