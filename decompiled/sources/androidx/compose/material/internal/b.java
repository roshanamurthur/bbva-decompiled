package androidx.compose.material.internal;

import androidx.compose.ui.unit.IntSize;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: ExposedDropdownMenuPopup.kt */
/* JADX INFO: loaded from: classes.dex */
public final class b extends Lambda implements Function1<IntSize, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ PopupLayout f8792p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(PopupLayout popupLayout) {
        super(1);
        this.f8792p0 = popupLayout;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(IntSize intSize) {
        IntSize intSizeM4541boximpl = IntSize.m4541boximpl(intSize.getF18319a());
        PopupLayout popupLayout = this.f8792p0;
        popupLayout.m886setPopupContentSizefhxjrPA(intSizeM4541boximpl);
        popupLayout.updatePosition();
        return Unit.INSTANCE;
    }
}
