package com.bbva.component.ui.welcome.footer;

import com.bbva.cells.component.kit.ui.helper.ContextHelper;
import n4.e;
import n4.f;
import n4.g;

/* JADX INFO: loaded from: classes2.dex */
public class WelcomeFooterDynamicPropertyBinder {
    public static void a(WelcomeFooter welcomeFooter, WelcomeFooterViewModel welcomeFooterViewModel) {
        int i10 = 1;
        welcomeFooterViewModel.newProperty("topButton").observe(ContextHelper.getOwner(welcomeFooter.getContext()), new e(welcomeFooter, i10));
        welcomeFooterViewModel.newProperty("bottomButton").observe(ContextHelper.getOwner(welcomeFooter.getContext()), new f(welcomeFooter, i10));
        welcomeFooterViewModel.newProperty("termsAndConditions").observe(ContextHelper.getOwner(welcomeFooter.getContext()), new g(welcomeFooter, i10));
    }
}
