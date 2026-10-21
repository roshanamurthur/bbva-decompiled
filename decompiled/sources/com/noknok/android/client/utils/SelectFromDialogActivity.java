package com.noknok.android.client.utils;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import com.noknok.android.common.R;
import com.noknok.android.common.databinding.NnlSelectFromDialogLayoutBinding;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class SelectFromDialogActivity extends FragmentActivity {
    public static final String KEY_SHOW_WHEN_LOCKED = "KEY_SHOW_WHEN_LOCKED";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f63475a = false;

    public static class ListAdapter extends ArrayAdapter<String> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Activity f63476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f63477b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<String> f63478c;

        public ListAdapter(@NonNull Activity activity, int i10, @NonNull List<String> list) {
            super(activity, i10, list);
            this.f63476a = activity;
            this.f63477b = i10;
            this.f63478c = list;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @NonNull
        public View getView(int i10, @Nullable View view, @NonNull ViewGroup viewGroup) {
            if (view == null) {
                view = this.f63476a.getLayoutInflater().inflate(this.f63477b, viewGroup, false);
                new ViewWrapper(view).onShow();
            }
            ((TextView) view).setText(this.f63478c.get(i10));
            return view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AdapterView adapterView, View view, int i10, long j10) {
        ActivityInOutParams.setResult(this, Integer.valueOf(i10));
        finish();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Logger.i("SelectFromDialogActivity", "onAttachedToWindow");
        this.f63475a = true;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        Logger.i("SelectFromDialogActivity", "onBackPressed called");
        ActivityInOutParams.setResult(this, -1);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        Logger.i("SelectFromDialogActivity", "onConfigurationChanged called");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Logger.v("SelectFromDialogActivity", "onCreate");
        if (getIntent().getBooleanExtra("KEY_SHOW_WHEN_LOCKED", false)) {
            ShowWhenLocked.enable(this);
        }
        requestWindowFeature(1);
        NnlSelectFromDialogLayoutBinding nnlSelectFromDialogLayoutBindingInflate = NnlSelectFromDialogLayoutBinding.inflate(getLayoutInflater());
        setContentView(nnlSelectFromDialogLayoutBindingInflate.getRoot());
        new ViewWrapper(nnlSelectFromDialogLayoutBindingInflate.getRoot()).onShow();
        ActivityInOutParams.onActivityCreate(this);
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            throw new IllegalStateException("Unexpected empty bundle.");
        }
        ArrayList<String> stringArrayList = extras.getStringArrayList("DIALOGLIST");
        Logger.v("SelectFromDialogActivity", "items: " + stringArrayList);
        if (stringArrayList == null || stringArrayList.size() < 2) {
            throw new IllegalStateException("DIALOGLIST is not set");
        }
        String string = extras.getString("DIALOGTITLEID");
        Logger.v("SelectFromDialogActivity", "title: " + string);
        if (string == null || "".equals(string)) {
            throw new IllegalStateException("DIALOGTITLEID is not set");
        }
        nnlSelectFromDialogLayoutBindingInflate.dialogHeaderText.setText(string);
        nnlSelectFromDialogLayoutBindingInflate.dialogListView.setAdapter((android.widget.ListAdapter) new ListAdapter(this, R.layout.nnl_select_from_dialog_list_item, stringArrayList));
        nnlSelectFromDialogLayoutBindingInflate.dialogListView.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: com.noknok.android.client.utils.k
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                this.f63502p0.a(adapterView, view, i10, j10);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        Logger.i("SelectFromDialogActivity", "onPause called");
        super.onPause();
        if (this.f63475a) {
            ActivityInOutParams.setResult(this, -1);
            finish();
        }
    }
}
