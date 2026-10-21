package com.noknok.android.client.utils;

import android.app.Activity;
import android.content.Intent;
import android.util.Base64;
import com.noknok.android.common.R;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class DefaultTransactionUI implements ITransactionUI {
    @Override // com.noknok.android.client.utils.ITransactionUI
    public final /* synthetic */ Outcome openUI(Activity activity, String str, String str2, Map map) {
        return h.a(this, activity, str, str2, map);
    }

    @Override // com.noknok.android.client.utils.ITransactionUI
    public Outcome openUI(ActivityProxy activityProxy, String str, String str2, Map<String, String> map) {
        if (!activityProxy.hasActivity()) {
            throw new IllegalArgumentException("Caller Activity is required for showing Transaction UI");
        }
        Intent intentCreateIntent = activityProxy.createIntent(ConfirmationActivity.class);
        if (str2.equals("image/png")) {
            intentCreateIntent.putExtra(ConfirmationActivity.KEY_PROMPT_IMG_64, str);
        } else {
            String str3 = new String(Base64.decode(str, 11), Charsets.utf8Charset);
            intentCreateIntent.putExtra("KEY_PROMPT_TEXT", UiConfig.getText(activityProxy.getApplicationContext(), UIConfigTags.LEVELS_TRANS_CONFIRMATION_VIEW, UIConfigTags.TAG_TRANS_CONFIRMATION_TITLE, R.string.nnl_transaction_title));
            intentCreateIntent.putExtra("KEY_PROMPT_SUB_TEXT", str3);
        }
        intentCreateIntent.putExtra("KEY_SHOW_WHEN_LOCKED", map != null ? Boolean.parseBoolean(map.get("KEY_SHOW_WHEN_LOCKED")) : false);
        return (Outcome) activityProxy.startActivityForResult(intentCreateIntent, null);
    }
}
