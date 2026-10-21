package com.bbva.document.scanner.presentation.preview;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: PreviewDocumentActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ PreviewDocumentActivity f29200p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PreviewDocumentActivity previewDocumentActivity) {
        super(1);
        this.f29200p0 = previewDocumentActivity;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        PreviewDocumentActivity.access$sendResult(this.f29200p0, PreviewResult.Retry.INSTANCE);
        return Unit.INSTANCE;
    }
}
