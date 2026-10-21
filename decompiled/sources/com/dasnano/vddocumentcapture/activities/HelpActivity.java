package com.dasnano.vddocumentcapture.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.text.HtmlCompat;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import com.dasnano.vddocumentcapture.R;
import com.dasnano.vddocumentcapture.config.VDDocumentConfiguration;
import com.veridas.activity.ActivityLifecycleAdapter;
import com.veridas.activity.DasActivity;
import com.veridas.config.Configuration;
import com.veridas.config.InvalidDisplayOrientationException;
import com.veridas.config.PropertyNameNotFoundException;
import com.veridas.display.DisplayOrientation;
import com.veridas.log.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
public abstract class HelpActivity extends AbstractActivity {

    public class a extends ActivityLifecycleAdapter {
        public a() {
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onCreated(DasActivity dasActivity, Bundle bundle) {
            HelpActivity.this.created(bundle);
        }
    }

    public class b implements View.OnClickListener {
        public b() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            HelpActivity.this.finish();
        }
    }

    public HelpActivity() {
        addActivityLifecycleListener(new a());
    }

    public static void start(Context context, Configuration configuration, List<String> list) {
        try {
            Intent intent = new Intent(context, (Class<?>) (configuration.getDisplayOrientation("screenorientation") == DisplayOrientation.PORTRAIT ? PortraitHelpActivity.class : LandscapeHelpActivity.class));
            intent.putStringArrayListExtra("com.veridas.documentCapture.helpActivity.documents", new ArrayList<>(list));
            DasActivity.startActivity(context, intent, configuration);
        } catch (InvalidDisplayOrientationException e5) {
            e = e5;
            Log.e("UserVisualHelpManager", e);
        } catch (PropertyNameNotFoundException e7) {
            e = e7;
            Log.e("UserVisualHelpManager", e);
        }
    }

    public void created(Bundle bundle) {
        VDDocumentConfiguration configuration = getConfiguration();
        setContentView(R.layout.activity_help);
        TextView textView = (TextView) findViewById(R.id.vd_document_text_view);
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = getIntent().getStringArrayListExtra("com.veridas.documentCapture.helpActivity.documents").iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            sb2.append(RootService.LINE_BREAK);
        }
        try {
            textView.setText(HtmlCompat.fromHtml(configuration.getString(VDDocumentConfiguration.USER_HELP_TEXT), 0));
        } catch (PropertyNameNotFoundException e5) {
            Log.e(getClass().getSimpleName(), e5);
        }
        ((TextView) findViewById(R.id.vd_document_documents_text_view)).setText(HtmlCompat.fromHtml(sb2.toString(), 0));
        ((Button) findViewById(R.id.vd_document_back_button)).setOnClickListener(new b());
    }
}
