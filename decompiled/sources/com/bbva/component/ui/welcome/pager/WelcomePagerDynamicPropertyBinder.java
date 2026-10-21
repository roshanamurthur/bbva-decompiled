package com.bbva.component.ui.welcome.pager;

import c6.b;
import c6.c;
import com.bbva.cells.component.kit.ui.helper.ContextHelper;

/* JADX INFO: loaded from: classes2.dex */
public class WelcomePagerDynamicPropertyBinder {
    public static void a(WelcomePager welcomePager, WelcomePagerViewModel welcomePagerViewModel) {
        int i10 = 0;
        welcomePagerViewModel.newProperty("modes").observe(ContextHelper.getOwner(welcomePager.getContext()), new b(welcomePager, i10));
        welcomePagerViewModel.newProperty("pages").observe(ContextHelper.getOwner(welcomePager.getContext()), new c(welcomePager, i10));
    }
}
