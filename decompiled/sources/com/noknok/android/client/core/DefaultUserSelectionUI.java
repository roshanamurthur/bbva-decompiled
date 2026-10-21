package com.noknok.android.client.core;

import android.content.Intent;
import com.noknok.android.asmsdk.R;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.SelectFromDialogActivity;
import com.noknok.android.client.utils.UIConfigTags;
import com.noknok.android.client.utils.UiConfig;
import com.noknok.android.client.utils.UserSelectionUI;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public class DefaultUserSelectionUI extends UserSelectionUI {
    @Override // com.noknok.android.client.utils.UserSelectionUI
    public int openUI(ActivityProxy activityProxy, ArrayList<String> arrayList, boolean z10) {
        if (!activityProxy.hasActivity()) {
            throw new IllegalArgumentException("Caller Activity is required for openning User selection UI");
        }
        Intent intentCreateIntent = activityProxy.createIntent(SelectFromDialogActivity.class);
        intentCreateIntent.putStringArrayListExtra("DIALOGLIST", arrayList);
        intentCreateIntent.putExtra("DIALOGTITLEID", UiConfig.getText(activityProxy.getApplicationContext(), UIConfigTags.LEVELS_SELECT_ACCOUNT_VIEW, UIConfigTags.TAG_SELECT_ACCOUNT_TITLE, R.string.nnl_asmsdk_select_user));
        intentCreateIntent.putExtra("KEY_SHOW_WHEN_LOCKED", z10);
        return ((Integer) activityProxy.startActivityForResult(intentCreateIntent, null)).intValue();
    }
}
