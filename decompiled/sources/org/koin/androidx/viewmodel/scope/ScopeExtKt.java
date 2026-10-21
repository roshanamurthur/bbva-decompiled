package org.koin.androidx.viewmodel.scope;

import android.os.Bundle;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: ScopeExt.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0000\u001a\f\u0012\u0004\u0012\u00020\u00020\u0001j\u0002`\u0003H\u0007*&\b\u0007\u0010\u0004\"\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0001B\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007¨\u0006\b"}, d2 = {"emptyState", "Lkotlin/Function0;", "Landroid/os/Bundle;", "Lorg/koin/androidx/viewmodel/scope/BundleDefinition;", "BundleDefinition", "Lkotlin/Deprecated;", "message", "Replaced by CreationExtras API", "koin-android_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
public final class ScopeExtKt {

    /* JADX INFO: compiled from: ScopeExt.kt */
    public static final class a extends Lambda implements Function0<Bundle> {

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        public static final a f92302p0 = new a(0);

        @Override // kotlin.jvm.functions.Function0
        public final Bundle invoke() {
            return new Bundle();
        }
    }

    @Deprecated(message = "Replaced by CreationExtras API")
    @NotNull
    public static final Function0<Bundle> emptyState() {
        return a.f92302p0;
    }

    @Deprecated(message = "Replaced by CreationExtras API")
    public static /* synthetic */ void BundleDefinition$annotations() {
    }
}
