package com.bbva.glomohybrid.files.strategy;

import android.net.Uri;
import com.bbva.glomohybrid.files.PathStrategy;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: LocalPathStrategy.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/bbva/glomohybrid/files/strategy/LocalPathStrategy;", "Lcom/bbva/glomohybrid/files/PathStrategy;", "Landroid/net/Uri;", "uri", "", "getName", "", "getLength", "(Landroid/net/Uri;)Ljava/lang/Long;", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "name", "Ljava/io/File;", "root", "<init>", "(Ljava/io/File;Ljava/lang/String;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nLocalPathStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalPathStrategy.kt\ncom/bbva/glomohybrid/files/strategy/LocalPathStrategy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"})
public final class LocalPathStrategy implements PathStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final File f32169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final String name;

    public LocalPathStrategy(@NotNull File root, @NotNull String name) {
        Intrinsics.checkNotNullParameter(root, "root");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f32169a = root;
        this.name = name;
    }

    @Override // com.bbva.glomohybrid.files.PathStrategy
    @Nullable
    public Long getLength(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String encodedPath = uri.getEncodedPath();
        File file = encodedPath != null ? new File(this.f32169a, encodedPath) : null;
        if (file != null) {
            return Long.valueOf(file.length());
        }
        return null;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @Override // com.bbva.glomohybrid.files.PathStrategy
    @Nullable
    public String getName(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String encodedPath = uri.getEncodedPath();
        File file = encodedPath != null ? new File(this.f32169a, encodedPath) : null;
        if (file != null) {
            return file.getName();
        }
        return null;
    }
}
