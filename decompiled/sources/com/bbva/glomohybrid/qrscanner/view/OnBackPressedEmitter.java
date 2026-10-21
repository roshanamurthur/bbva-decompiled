package com.bbva.glomohybrid.qrscanner.view;

import androidx.activity.OnBackPressedCallback;
import com.bbva.glomohybrid.qrscanner.viewmodel.GalleryViewModel;
import com.bbva.glomohybrid.qrscanner.viewmodel.QrContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: GalleryView.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/bbva/glomohybrid/qrscanner/view/OnBackPressedEmitter;", "Landroidx/activity/OnBackPressedCallback;", "", "handleOnBackPressed", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/GalleryViewModel;", "d", "Lcom/bbva/glomohybrid/qrscanner/viewmodel/GalleryViewModel;", "getViewModel", "()Lcom/bbva/glomohybrid/qrscanner/viewmodel/GalleryViewModel;", "viewModel", "<init>", "(Lcom/bbva/glomohybrid/qrscanner/viewmodel/GalleryViewModel;)V", "QRScanner_mexicoRelease"}, k = 1, mv = {1, 9, 0})
public final class OnBackPressedEmitter extends OnBackPressedCallback {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final GalleryViewModel viewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OnBackPressedEmitter(@NotNull GalleryViewModel viewModel) {
        super(true);
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        this.viewModel = viewModel;
    }

    @NotNull
    public final GalleryViewModel getViewModel() {
        return this.viewModel;
    }

    @Override // androidx.activity.OnBackPressedCallback
    public void handleOnBackPressed() {
        this.viewModel.setIntent(QrContract.Intent.CloseButtonClick.INSTANCE);
    }
}
