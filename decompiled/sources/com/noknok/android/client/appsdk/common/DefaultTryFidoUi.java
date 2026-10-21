package com.noknok.android.client.appsdk.common;

import android.content.Context;
import android.content.Intent;
import com.noknok.android.client.appsdk.R;
import com.noknok.android.client.utils.ActivityProxy;
import com.noknok.android.client.utils.Outcome;
import com.noknok.android.client.utils.TryFidoActivity;
import com.noknok.android.client.utils.UIConfigTags;
import com.noknok.android.client.utils.UiConfig;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class DefaultTryFidoUi implements ITryFidoUi {
    @Override // com.noknok.android.client.appsdk.common.ITryFidoUi
    public boolean openUI(ActivityProxy activityProxy) {
        Intent intentCreateIntent = activityProxy.createIntent(TryFidoActivity.class);
        Context applicationContext = activityProxy.getApplicationContext();
        List<String> list = UIConfigTags.LEVELS_TRY_FIDO_VIEW;
        intentCreateIntent.putExtra("KEY_PROMPT_TEXT", UiConfig.getText(applicationContext, list, UIConfigTags.TAG_TRY_FIDO_TITLE, R.string.nnl_common_try_passwordless_description));
        intentCreateIntent.putExtra("KEY_PROMPT_SUB_TEXT", UiConfig.getText(activityProxy.getApplicationContext(), list, UIConfigTags.TAG_TRY_FIDO_DESCRIPTION, R.string.nnl_common_try_passwordless_sub_description));
        intentCreateIntent.putExtra("KEY_POSITIVE_BUTTON", UiConfig.getText(activityProxy.getApplicationContext(), list, UIConfigTags.TAG_TRY_FIDO_BUTTON, R.string.nnl_common_try_passwordless));
        return ((Outcome) activityProxy.startActivityForResult(intentCreateIntent, null)).equals(Outcome.SUCCESS);
    }
}
