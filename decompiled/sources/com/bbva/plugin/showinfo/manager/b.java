package com.bbva.plugin.showinfo.manager;

import com.bbva.plugin.showinfo.MapperKt;
import com.bbva.plugin.showinfo.data.SnackBarDTO;
import com.bbva.showinfo.model.InfoSnackBar;
import com.bbva.showinfo.model.SnackBarType;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: compiled from: InfoManager.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class b extends Lambda implements Function1<InfoSnackBar, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ SnackBarDTO f36027p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final /* synthetic */ Map<String, Integer> f36028q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final /* synthetic */ Function0<Unit> f36029r0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(SnackBarDTO snackBarDTO, Map<String, Integer> map, Function0<Unit> function0) {
        super(1);
        this.f36027p0 = snackBarDTO;
        this.f36028q0 = map;
        this.f36029r0 = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InfoSnackBar infoSnackBar) {
        InfoSnackBar snackBar = infoSnackBar;
        Intrinsics.checkNotNullParameter(snackBar, "$this$snackBar");
        SnackBarDTO snackBarDTO = this.f36027p0;
        snackBar.setId(snackBarDTO.getId());
        snackBar.setType(SnackBarType.INSTANCE.fromValue(snackBarDTO.getType()));
        snackBar.setImages(this.f36028q0);
        snackBar.setMessage(snackBarDTO.getMessage());
        snackBar.setMessageAccessibility(snackBarDTO.getMessageAccessibility());
        snackBar.setDuration(MapperKt.toSnackbarDuration(snackBarDTO.getDuration()));
        snackBar.setActionName(snackBarDTO.getButtonTitle());
        snackBar.setActionListenToUserDidTap(snackBarDTO.getListenToUserDidTapOnSnackbarButton());
        snackBar.setOnActionClickListener(this.f36029r0);
        return Unit.INSTANCE;
    }
}
