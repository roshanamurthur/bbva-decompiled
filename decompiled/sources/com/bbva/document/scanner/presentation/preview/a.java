package com.bbva.document.scanner.presentation.preview;

import android.view.View;
import com.bbva.document.scanner.PreviewOptions;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: PreviewDocumentActivity.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class a extends Lambda implements Function1<View, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ PreviewDocumentActivity f29198p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ PreviewOptions f29199q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(PreviewDocumentActivity previewDocumentActivity, PreviewOptions previewOptions) {
        super(1);
        this.f29198p0 = previewDocumentActivity;
        this.f29199q0 = previewOptions;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        PreviewDocumentActivity.access$sendResult(this.f29198p0, new PreviewResult.Success(this.f29199q0.getPath()));
        return Unit.INSTANCE;
    }
}
