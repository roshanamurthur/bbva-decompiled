package com.bbva.document.scanner.presentation.preview;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.p;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.bbva.document.scanner.CaptureOptions;
import com.bbva.document.scanner.domain.ProcessImageUseCase;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: PreviewDocumentViewModelFactory.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/bbva/document/scanner/presentation/preview/PreviewDocumentViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Lcom/bbva/document/scanner/CaptureOptions;", "options", "<init>", "(Lcom/bbva/document/scanner/CaptureOptions;)V", "document-scanner_release"}, k = 1, mv = {1, 8, 0})
public final class PreviewDocumentViewModelFactory implements ViewModelProvider.Factory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final ProcessImageUseCase f29195a;

    public PreviewDocumentViewModelFactory(@NotNull CaptureOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f29195a = new ProcessImageUseCase(options.getCompression(), options.getTransformations());
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(Class cls, CreationExtras creationExtras) {
        return p.b(this, cls, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(KClass kClass, CreationExtras creationExtras) {
        return p.c(this, kClass, creationExtras);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    @NotNull
    public <T extends ViewModel> T create(@NotNull Class<T> modelClass) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        T tNewInstance = modelClass.getDeclaredConstructor(ProcessImageUseCase.class).newInstance(this.f29195a);
        Intrinsics.checkNotNullExpressionValue(tNewInstance, "modelClass.getDeclaredCo…    .newInstance(useCase)");
        return tNewInstance;
    }
}
