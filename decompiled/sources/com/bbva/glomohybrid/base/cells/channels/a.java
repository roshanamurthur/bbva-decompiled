package com.bbva.glomohybrid.base.cells.channels;

import android.os.Bundle;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: OpenExternalWebViewChannel.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends Lambda implements Function1<String, CharSequence> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Bundle f31195p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Bundle bundle) {
        super(1);
        this.f31195p0 = bundle;
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(String str) {
        String str2 = str;
        return androidx.camera.core.impl.utils.a.b(str2, "=", this.f31195p0.getString(str2));
    }
}
