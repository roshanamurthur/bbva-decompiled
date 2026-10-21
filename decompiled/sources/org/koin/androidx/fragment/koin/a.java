package org.koin.androidx.fragment.koin;

import androidx.fragment.app.FragmentFactory;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.koin.androidx.fragment.android.KoinFragmentFactory;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: KoinApplicationExt.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class a extends Lambda implements Function2<Scope, ParametersHolder, FragmentFactory> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a f92132p0 = new a(2);

    @Override // kotlin.jvm.functions.Function2
    public final FragmentFactory invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope single = scope;
        ParametersHolder it = parametersHolder;
        Intrinsics.checkNotNullParameter(single, "$this$single");
        Intrinsics.checkNotNullParameter(it, "it");
        return new KoinFragmentFactory(null, 1, null);
    }
}
