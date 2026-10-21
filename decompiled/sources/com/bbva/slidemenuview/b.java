package com.bbva.slidemenuview;

import android.content.Context;
import com.bbva.slidemenuview.data.HeaderSubItemBuilder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: CountrySlideMenuView.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b extends Lambda implements Function1<HeaderSubItemBuilder, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ Context f36653p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context) {
        super(1);
        this.f36653p0 = context;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(HeaderSubItemBuilder headerSubItemBuilder) {
        HeaderSubItemBuilder headerSubItem = headerSubItemBuilder;
        Intrinsics.checkNotNullParameter(headerSubItem, "$this$headerSubItem");
        headerSubItem.setId(0);
        String string = this.f36653p0.getString(R.string.ui_menu_profile);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        headerSubItem.setText(string);
        headerSubItem.states(a.f36652p0);
        return Unit.INSTANCE;
    }
}
