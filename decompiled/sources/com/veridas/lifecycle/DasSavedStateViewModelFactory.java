package com.veridas.lifecycle;

import android.content.res.Resources;
import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.savedstate.SavedStateRegistryOwner;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: DasSavedStateViewModelFactory.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0006\u0012\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/veridas/lifecycle/DasSavedStateViewModelFactory;", "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "Landroidx/lifecycle/ViewModel;", ExifInterface.GPS_DIRECTION_TRUE, "", "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/SavedStateHandle;", "handle", "create", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "Landroid/content/res/Resources;", "e", "Landroid/content/res/Resources;", "getResources", "()Landroid/content/res/Resources;", "resources", "Landroidx/savedstate/SavedStateRegistryOwner;", "owner", "Landroid/os/Bundle;", "defaultArgs", "configurationClass", "<init>", "(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;Ljava/lang/Class;Landroid/content/res/Resources;)V", "common-core_release"}, k = 1, mv = {1, 9, 0})
public final class DasSavedStateViewModelFactory extends AbstractSavedStateViewModelFactory {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    public final Class<?> f67217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Resources resources;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DasSavedStateViewModelFactory(@NotNull SavedStateRegistryOwner owner, @NotNull Bundle defaultArgs, @NotNull Class<?> configurationClass, @NotNull Resources resources) {
        super(owner, defaultArgs);
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(defaultArgs, "defaultArgs");
        Intrinsics.checkNotNullParameter(configurationClass, "configurationClass");
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.f67217d = configurationClass;
        this.resources = resources;
    }

    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    @NotNull
    public <T extends ViewModel> T create(@NotNull String key, @NotNull Class<T> modelClass, @NotNull SavedStateHandle handle) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(handle, "handle");
        Class<?> cls = this.f67217d;
        T tNewInstance = modelClass.getConstructor(SavedStateHandle.class, cls).newInstance(handle, cls.getConstructor(Resources.class).newInstance(this.resources));
        Intrinsics.checkNotNullExpressionValue(tNewInstance, "newInstance(...)");
        return tNewInstance;
    }

    @NotNull
    public final Resources getResources() {
        return this.resources;
    }
}
