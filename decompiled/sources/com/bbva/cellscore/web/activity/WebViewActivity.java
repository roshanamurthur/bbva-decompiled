package com.bbva.cellscore.web.activity;

import android.app.Activity;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import com.bbva.cells.component.kit.model.ActionSpec;
import com.bbva.cellscore.R;
import com.bbva.cellscore.app.Reactor;

/* JADX INFO: loaded from: classes2.dex */
public class WebViewActivity extends Activity implements LifecycleOwner {
    public static final String ID = "component-id-cells-web-activity";
    public static final String ROUTE = "/webview";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final LifecycleRegistry f27059p0 = new LifecycleRegistry(this);
    public static final ActionSpec<Void> ON_RESUME = new ActionSpec<>("on-resume");
    public static final ActionSpec<Void> ON_BACK = new ActionSpec<>("on-back");

    public int getLayout() {
        return R.layout.activity_webview;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return this.f27059p0;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        Reactor.in(ID).doAction(ON_BACK).fire();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getLayout());
    }

    @Override // android.app.Activity
    public void onResume() {
        Reactor.in(ID).doAction(ON_RESUME).fire();
        super.onResume();
    }
}
