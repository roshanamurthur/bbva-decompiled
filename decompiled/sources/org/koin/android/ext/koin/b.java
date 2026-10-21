package org.koin.android.ext.koin;

import android.content.Context;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: KoinExt.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class b extends Lambda implements Function2<Scope, ParametersHolder, Context> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Context f92078p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(2);
        this.f92078p0 = context;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Context invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return this.f92078p0;
    }
}
