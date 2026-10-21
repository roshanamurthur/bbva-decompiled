package com.bbva.smsregex.extractor.model;

import android.content.Intent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ConsentRequest.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/bbva/smsregex/extractor/model/ConsentRequest;", "", "Landroid/content/Intent;", "a", "Landroid/content/Intent;", "getBody", "()Landroid/content/Intent;", "body", "<init>", "(Landroid/content/Intent;)V", "smsregex_release"}, k = 1, mv = {1, 9, 0})
public final class ConsentRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Intent body;

    public ConsentRequest(@NotNull Intent body) {
        Intrinsics.checkNotNullParameter(body, "body");
        this.body = body;
    }

    @NotNull
    public final Intent getBody() {
        return this.body;
    }
}
