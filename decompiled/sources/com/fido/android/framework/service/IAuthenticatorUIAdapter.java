package com.fido.android.framework.service;

import android.graphics.drawable.Drawable;
import com.google.gson.annotations.Expose;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.Logger;
import com.noknok.android.uaf.framework.service.AuthenticatorManager;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public interface IAuthenticatorUIAdapter {

    public static class Adapters {
        protected static final String TAG = "IAuthenticatorUIAdapter";

        public static synchronized List<IAuthenticatorUIAdapter> getAll(ActivityProxy activityProxy) {
            ArrayList arrayList;
            arrayList = new ArrayList();
            try {
                int i10 = AuthenticatorManager.f63571i;
                arrayList.addAll((List) AuthenticatorManager.class.getDeclaredMethod("getAuthenticatorUIAdapters", String.class).invoke(AuthenticatorManager.class.getDeclaredMethod("instance", ActivityProxy.class).invoke(null, activityProxy), ""));
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e5) {
                Logger.e(TAG, "Failed to get the list of all authenticators UAF", e5);
            }
            return arrayList;
        }

        public static IAuthenticatorUIAdapter getAuthenticator(String str, ActivityProxy activityProxy) {
            for (IAuthenticatorUIAdapter iAuthenticatorUIAdapter : getAll(activityProxy)) {
                if (str.equals(iAuthenticatorUIAdapter.getId())) {
                    return iAuthenticatorUIAdapter;
                }
            }
            return null;
        }
    }

    public static class GetUIOut {

        @Expose
        public String Icon;

        @Expose
        public String Text;

        @Expose
        public String Title;

        @Expose
        public boolean hasSettings;
    }

    Drawable getIcon();

    String getId();

    GetUIOut getUI();

    boolean isEnabled();

    boolean isTokenRegistered();

    void openSettings(String str);

    void setEnabled(boolean z10);
}
