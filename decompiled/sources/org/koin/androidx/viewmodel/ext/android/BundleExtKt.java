package org.koin.androidx.viewmodel.ext.android;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.annotation.KoinInternalApi;

/* JADX INFO: compiled from: BundleExt.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0007¨\u0006\u0005"}, d2 = {"toExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "Landroid/os/Bundle;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class BundleExtKt {
    @KoinInternalApi
    @Nullable
    public static final CreationExtras toExtras(@NotNull Bundle bundle, @NotNull ViewModelStoreOwner viewModelStoreOwner) {
        Object objM5535constructorimpl;
        Intrinsics.checkNotNullParameter(bundle, "<this>");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        if (bundle.keySet().isEmpty()) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(null, 1, null);
            mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, bundle);
            mutableCreationExtras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, viewModelStoreOwner);
            mutableCreationExtras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, (SavedStateRegistryOwner) viewModelStoreOwner);
            objM5535constructorimpl = Result.m5535constructorimpl(mutableCreationExtras);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM5535constructorimpl = Result.m5535constructorimpl(ResultKt.createFailure(th2));
        }
        return (CreationExtras) (Result.m5540isFailureimpl(objM5535constructorimpl) ? null : objM5535constructorimpl);
    }
}
