package com.bbva.glomohybrid.files.strategy;

import android.net.Uri;
import com.bbva.glomohybrid.files.PathStrategy;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: ExternalPathStrategy.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/bbva/glomohybrid/files/strategy/ExternalPathStrategy;", "Lcom/bbva/glomohybrid/files/PathStrategy;", "Landroid/net/Uri;", "uri", "", "getName", "", "getLength", "(Landroid/net/Uri;)Ljava/lang/Long;", "Ljava/io/File;", "root", "<init>", "(Ljava/io/File;)V", "app_mexicoProdGoogleRelease"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nExternalPathStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExternalPathStrategy.kt\ncom/bbva/glomohybrid/files/strategy/ExternalPathStrategy\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,20:1\n1#2:21\n*E\n"})
public final class ExternalPathStrategy implements PathStrategy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final File f32168a;

    public ExternalPathStrategy(@NotNull File root) {
        Intrinsics.checkNotNullParameter(root, "root");
        this.f32168a = root;
    }

    @Override // com.bbva.glomohybrid.files.PathStrategy
    @Nullable
    public Long getLength(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String lastPathSegment = uri.getLastPathSegment();
        File file = lastPathSegment != null ? new File(this.f32168a, lastPathSegment) : null;
        if (file != null) {
            return Long.valueOf(file.length());
        }
        return null;
    }

    @Override // com.bbva.glomohybrid.files.PathStrategy
    @Nullable
    public String getName(@NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        String lastPathSegment = uri.getLastPathSegment();
        File file = lastPathSegment != null ? new File(this.f32168a, lastPathSegment) : null;
        if (file != null) {
            return file.getName();
        }
        return null;
    }
}
