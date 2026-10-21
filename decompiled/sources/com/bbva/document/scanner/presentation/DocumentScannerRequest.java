package com.bbva.document.scanner.presentation;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: Constants.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0010\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b\u0012\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R!\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/bbva/document/scanner/presentation/DocumentScannerRequest;", "", "Landroid/net/Uri;", "a", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "uri", "Ljava/lang/Class;", "Landroid/app/Activity;", "b", "Ljava/lang/Class;", "getTarget", "()Ljava/lang/Class;", "target", "Landroid/os/Bundle;", "c", "Landroid/os/Bundle;", "getParameters", "()Landroid/os/Bundle;", "parameters", "<init>", "(Landroid/net/Uri;Ljava/lang/Class;Landroid/os/Bundle;)V", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
public final class DocumentScannerRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Uri uri;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Class<? extends Activity> target;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Bundle parameters;

    public DocumentScannerRequest(@NotNull Uri uri, @NotNull Class<? extends Activity> target, @NotNull Bundle parameters) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(parameters, "parameters");
        this.uri = uri;
        this.target = target;
        this.parameters = parameters;
    }

    @NotNull
    public final Bundle getParameters() {
        return this.parameters;
    }

    @NotNull
    public final Class<? extends Activity> getTarget() {
        return this.target;
    }

    @NotNull
    public final Uri getUri() {
        return this.uri;
    }
}
