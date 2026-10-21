package com.dasnano.vddocumentcapture.activities;

import android.os.Bundle;
import com.dasnano.vddocumentcapture.config.VDDocumentConfiguration;
import com.dasnano.vddocumentcapture.model.DocumentClassificationViewModel;
import com.veridas.activity.ActivityLifecycleAdapter;
import com.veridas.activity.DasActivity;
import com.veridas.display.DisplayOrientation;

/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractActivity extends DasActivity<VDDocumentConfiguration, DocumentClassificationViewModel> {

    public class a extends ActivityLifecycleAdapter {
        public a() {
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onBeforeCreated(DasActivity dasActivity, Bundle bundle) {
            AbstractActivity.f(AbstractActivity.this);
        }

        @Override // com.veridas.activity.ActivityLifecycleAdapter, com.veridas.activity.ActivityLifecycleListener
        public final void onResumed(DasActivity dasActivity) {
            AbstractActivity.f(AbstractActivity.this);
        }
    }

    public AbstractActivity() {
        addActivityLifecycleListener(new a());
    }

    public static void f(AbstractActivity abstractActivity) {
        DisplayOrientation requiredDisplayOrientation = abstractActivity.getRequiredDisplayOrientation();
        ((DocumentClassificationViewModel) abstractActivity.viewModel).setDisplayOrientation(requiredDisplayOrientation);
        if (requiredDisplayOrientation == DisplayOrientation.PORTRAIT) {
            abstractActivity.setRequestedOrientation(1);
        } else {
            abstractActivity.setRequestedOrientation(0);
        }
    }

    @Override // com.veridas.activity.DasActivity
    public Class<VDDocumentConfiguration> getConfigurationClass() {
        return VDDocumentConfiguration.class;
    }

    public abstract DisplayOrientation getRequiredDisplayOrientation();

    @Override // com.veridas.activity.DasActivity
    public Class<DocumentClassificationViewModel> getViewModelClass() {
        return DocumentClassificationViewModel.class;
    }
}
