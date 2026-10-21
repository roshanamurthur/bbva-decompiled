package com.bbva.glomohybrid.provider.module;

import com.bancomer.mbanking.R;
import com.bbva.component.ui.modal.halfmodal.HalfModalComponent;
import com.bbva.glomohybrid.base.inappupdate.view.InAppUpdateModal;
import com.bbva.glomohybrid.base.inappupdate.view.model.InAppUpdateModalConfiguration;
import com.bbva.glomohybrid.inappupdate.view.InAppUpdateModalView;
import java.util.Map;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.scope.Scope;

/* JADX INFO: compiled from: PresentationModule.kt */
/* JADX INFO: loaded from: classes6.dex */
@SourceDebugExtension({"SMAP\nPresentationModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$presentationModule$1$14\n+ 2 ParametersHolder.kt\norg/koin/core/parameter/ParametersHolder\n+ 3 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,251:1\n44#2:252\n129#3,5:253\n*S KotlinDebug\n*F\n+ 1 PresentationModule.kt\ncom/bbva/glomohybrid/provider/module/PresentationModuleKt$presentationModule$1$14\n*L\n139#1:252\n147#1:253,5\n*E\n"})
public final class e6 extends Lambda implements Function2<Scope, ParametersHolder, InAppUpdateModal> {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final e6 f34043p0 = new e6(2);

    @Override // kotlin.jvm.functions.Function2
    public final InAppUpdateModal invoke(Scope scope, ParametersHolder parametersHolder) {
        Scope scope2 = scope;
        ParametersHolder parametersHolder2 = parametersHolder;
        return new InAppUpdateModalView(new InAppUpdateModalConfiguration(R.string.half_modal_inapp_update_message, R.string.half_modal_inapp_update_positive_button, R.string.half_modal_inapp_update_negative_button), PresentationModuleKt.activity((Map) parametersHolder2.elementAt(0, androidx.activity.a.f(scope2, "$this$factory", parametersHolder2, "<name for destructuring parameter 0>", Map.class))), (HalfModalComponent) scope2.get(Reflection.getOrCreateKotlinClass(HalfModalComponent.class), null, null));
    }
}
