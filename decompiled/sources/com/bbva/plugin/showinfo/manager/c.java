package com.bbva.plugin.showinfo.manager;

import com.bbva.plugin.showinfo.data.ToastDTO;
import com.bbva.showinfo.model.InfoToast;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: InfoManager.kt */
/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nInfoManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InfoManager.kt\ncom/bbva/plugin/showinfo/manager/BasicInfoHandler$showToast$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,136:1\n1#2:137\n*E\n"})
public final class c extends Lambda implements Function1<InfoToast, Unit> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final /* synthetic */ ToastDTO f36030p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ToastDTO toastDTO) {
        super(1);
        this.f36030p0 = toastDTO;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InfoToast infoToast) {
        InfoToast toast = infoToast;
        Intrinsics.checkNotNullParameter(toast, "$this$toast");
        String content = this.f36030p0.getContent();
        if (content != null) {
            toast.setMessage(content);
        }
        return Unit.INSTANCE;
    }
}
