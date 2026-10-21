package com.bbva.component.ui.welcome.header;

import b6.a;
import com.bbva.cells.component.kit.ui.helper.ContextHelper;
import n4.h;
import n4.i;

/* JADX INFO: loaded from: classes2.dex */
public class WelcomeHeaderDynamicPropertyBinder {
    public static void a(WelcomeHeader welcomeHeader, WelcomeHeaderViewModel welcomeHeaderViewModel) {
        int i10 = 1;
        welcomeHeaderViewModel.newProperty("welcomeHeaderTitle").observe(ContextHelper.getOwner(welcomeHeader.getContext()), new h(welcomeHeader, i10));
        welcomeHeaderViewModel.newProperty("welcomeHeaderDescription").observe(ContextHelper.getOwner(welcomeHeader.getContext()), new i(welcomeHeader, i10));
        welcomeHeaderViewModel.newProperty("welcomeHeaderUserName").observe(ContextHelper.getOwner(welcomeHeader.getContext()), new a(welcomeHeader, 0));
    }
}
