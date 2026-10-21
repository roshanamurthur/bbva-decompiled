package com.bbva.glomohybrid.base.activity;

import com.bbva.showinfo.model.InfoSnackBar;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: BaseActivity.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a extends Lambda implements Function1<InfoSnackBar, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final a f31040p0 = new a(1);

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InfoSnackBar infoSnackBar) {
        InfoSnackBar snackBar = infoSnackBar;
        Intrinsics.checkNotNullParameter(snackBar, "$this$snackBar");
        return Unit.INSTANCE;
    }
}
