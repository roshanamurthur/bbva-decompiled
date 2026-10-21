package com.bbva.androidtoolkit.plugin.filesystem;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.io.ByteStreamsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: WebFile.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\r\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/bbva/androidtoolkit/plugin/filesystem/WebFile;", "", "Ljava/io/File;", "a", "Ljava/io/File;", "getFile", "()Ljava/io/File;", "file", "Ljava/net/URL;", "b", "Ljava/net/URL;", "getUrl", "()Ljava/net/URL;", "url", "Companion", "toolkit_release"}, k = 1, mv = {1, 8, 0})
public final class WebFile {

    @NotNull
    public static final String BASE_URL = "https://appassets.androidplatform.net/public";

    @NotNull
    public static final String CACHE_FOLDER = "cells_plugin";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final File file;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final URL url;

    public WebFile(File file, URL url, DefaultConstructorMarker defaultConstructorMarker) {
        this.file = file;
        this.url = url;
    }

    @NotNull
    public final File getFile() {
        return this.file;
    }

    @NotNull
    public final URL getUrl() {
        return this.url;
    }

    /* JADX INFO: compiled from: WebFile.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ-\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\fJ\u0018\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\u0006R\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/bbva/androidtoolkit/plugin/filesystem/WebFile$Companion;", "", "Landroid/content/Context;", "context", "Ljava/io/InputStream;", "input", "", "extension", "Lcom/bbva/androidtoolkit/plugin/filesystem/WebFile;", "from", "(Landroid/content/Context;Ljava/io/InputStream;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "content", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "url", "BASE_URL", "Ljava/lang/String;", "CACHE_FOLDER", "<init>", "()V", "toolkit_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {

        /* JADX INFO: compiled from: WebFile.kt */
        public static final class a extends Lambda implements Function1<FileOutputStream, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ InputStream f26530p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InputStream inputStream) {
                super(1);
                this.f26530p0 = inputStream;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(FileOutputStream fileOutputStream) {
                FileOutputStream output = fileOutputStream;
                Intrinsics.checkNotNullParameter(output, "output");
                InputStream inputStream = this.f26530p0;
                try {
                    ByteStreamsKt.copyTo$default(inputStream, output, 0, 2, null);
                    Unit unit = Unit.INSTANCE;
                    CloseableKt.closeFinally(inputStream, null);
                    return Unit.INSTANCE;
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        CloseableKt.closeFinally(inputStream, th2);
                        throw th3;
                    }
                }
            }
        }

        /* JADX INFO: compiled from: WebFile.kt */
        public static final class b extends Lambda implements Function1<FileOutputStream, Unit> {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ String f26531p0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str) {
                super(1);
                this.f26531p0 = str;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Unit invoke(FileOutputStream fileOutputStream) throws IOException {
                FileOutputStream it = fileOutputStream;
                Intrinsics.checkNotNullParameter(it, "it");
                byte[] bytes = this.f26531p0.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                it.write(bytes);
                return Unit.INSTANCE;
            }
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final Object access$from(Companion companion, Context context, String str, Function1 function1, Continuation continuation) {
            companion.getClass();
            return BuildersKt.withContext(Dispatchers.getIO(), new com.bbva.androidtoolkit.plugin.filesystem.a(context, str, function1, null), continuation);
        }

        @Nullable
        public final Object from(@NotNull Context context, @NotNull InputStream inputStream, @NotNull String str, @NotNull Continuation<? super WebFile> continuation) {
            return BuildersKt.withContext(Dispatchers.getIO(), new com.bbva.androidtoolkit.plugin.filesystem.a(context, str, new a(inputStream), null), continuation);
        }

        @Nullable
        public final Object from(@NotNull Context context, @NotNull String str, @NotNull String str2, @NotNull Continuation<? super WebFile> continuation) {
            return BuildersKt.withContext(Dispatchers.getIO(), new com.bbva.androidtoolkit.plugin.filesystem.a(context, str2, new b(str), null), continuation);
        }

        @Nullable
        public final WebFile from(@NotNull Context context, @NotNull String url) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(url, "url");
            try {
                Result.Companion companion = Result.INSTANCE;
                URL url2 = new URL(url);
                String name = new File(url2.getFile()).getName();
                return new WebFile(new File(context.getCacheDir(), "cells_plugin/" + name), url2, null);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                Object objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
                return (WebFile) (Result.m5540isFailureimpl(objM5535constructorimpl) ? null : objM5535constructorimpl);
            }
        }
    }
}
