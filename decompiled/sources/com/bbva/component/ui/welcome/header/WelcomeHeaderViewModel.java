package com.bbva.component.ui.welcome.header;

import android.app.Application;
import com.bbva.cells.component.kit.ui.viewmodel.ViewModel;
import com.bbva.nativesettings.common.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: compiled from: WelcomeHeaderViewModel.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/bbva/component/ui/welcome/header/WelcomeHeaderViewModel;", "Lcom/bbva/cells/component/kit/ui/viewmodel/ViewModel;", Constants.APPLICATION, "Landroid/app/Application;", "(Landroid/app/Application;)V", "component-ui-welcome_release"}, k = 1, mv = {1, 4, 0})
public final class WelcomeHeaderViewModel extends ViewModel {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WelcomeHeaderViewModel(@NotNull Application application) {
        super(application);
        Intrinsics.checkNotNullParameter(application, "application");
    }
}
