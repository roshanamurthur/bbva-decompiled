package com.noknok.android.client.utils;

import com.noknok.android.client.core.DefaultUserSelectionUI;

/* JADX INFO: loaded from: classes11.dex */
public abstract class UserSelectionUIFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UserSelectionUIFactory f63489a;

    public static UserSelectionUIFactory getInstance() {
        if (f63489a == null) {
            setInstance(new UserSelectionUIFactory() { // from class: com.noknok.android.client.utils.UserSelectionUIFactory.1
                @Override // com.noknok.android.client.utils.UserSelectionUIFactory
                public UserSelectionUI createUserSelectionUIInstance() {
                    return new DefaultUserSelectionUI();
                }
            });
        }
        return f63489a;
    }

    public static void setInstance(UserSelectionUIFactory userSelectionUIFactory) {
        synchronized (UserSelectionUIFactory.class) {
            f63489a = userSelectionUIFactory;
        }
    }

    public abstract UserSelectionUI createUserSelectionUIInstance();
}
