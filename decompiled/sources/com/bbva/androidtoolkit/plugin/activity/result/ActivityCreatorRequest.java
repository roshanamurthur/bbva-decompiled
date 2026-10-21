package com.bbva.androidtoolkit.plugin.activity.result;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ActivityLauncher.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\u00020\u00032\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\b\bH&¨\u0006\t"}, d2 = {"Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityCreatorRequest;", "", "create", "Lcom/bbva/androidtoolkit/plugin/activity/result/ComponentResultCallback;", "request", "Lkotlin/Function1;", "Lcom/bbva/androidtoolkit/plugin/activity/result/ActivityResultRequest$Builder;", "", "Lkotlin/ExtensionFunctionType;", "toolkit_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface ActivityCreatorRequest {
    @NotNull
    ComponentResultCallback create(@NotNull Function1<? super ActivityResultRequest.Builder, Unit> request);
}
