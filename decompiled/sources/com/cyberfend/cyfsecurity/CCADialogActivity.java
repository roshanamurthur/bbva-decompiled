package com.cyberfend.cyfsecurity;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.akamai.botman.ae;

/* JADX INFO: loaded from: classes9.dex */
public class CCADialogActivity extends AppCompatActivity {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Button f39227p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public CircleProgressBar f39228q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final a f39229r0 = new a();

    public class b implements View.OnClickListener {
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            com.akamai.botman.a.a();
            com.akamai.botman.a.b();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_ccadialog);
        setFinishOnTouchOutside(false);
        this.f39228q0 = (CircleProgressBar) findViewById(R.id.dialogActivity_dialog_progressBar);
        String stringExtra = getIntent().getStringExtra("CCA Title");
        String stringExtra2 = getIntent().getStringExtra("CCA Message");
        String stringExtra3 = getIntent().getStringExtra("CCA Cancel Button");
        ((TextView) findViewById(R.id.dialogActivity_dialog_title)).setText(stringExtra);
        ((TextView) findViewById(R.id.dialogActivity_dialog_message)).setText(stringExtra2);
        Button button = (Button) findViewById(R.id.dialogActivity_dialog_button);
        this.f39227p0 = button;
        button.setText(stringExtra3);
        this.f39227p0.setOnClickListener(new b());
        int intExtra = getIntent().getIntExtra("Theme Color", getResources().getColor(R.color.akamaiCCAcolorPrimary));
        this.f39227p0.setTextColor(intExtra);
        this.f39228q0.setProgressBarColor(intExtra);
        final com.akamai.botman.a aVarA = com.akamai.botman.a.a();
        aVarA.f26254a = this.f39229r0;
        ae.b bVar = new ae.b() { // from class: com.akamai.botman.a.1
            @Override // com.akamai.botman.ae.b
            public final void a(float f6) {
                a aVar = a.this;
                aVar.f26255b = f6;
                aVar.f26254a.a(f6);
            }

            @Override // com.akamai.botman.ae.b
            public final void b() {
                a.this.f26257d.onChallengeActionSuccess();
            }

            @Override // com.akamai.botman.ae.b
            public final void c() {
                a.this.f26257d.onChallengeActionCancel();
            }

            @Override // com.akamai.botman.ae.b
            public final void a(String str) {
                a.this.f26257d.onChallengeActionFailure(str);
            }

            @Override // com.akamai.botman.ae.b
            public final void a() {
                a aVar = a.this;
                if (aVar.f26258e == 0) {
                    return;
                }
                aVar.f26254a.a();
                synchronized (this) {
                    a aVar2 = a.this;
                    aVar2.f26258e = 0;
                    aVar2.f26255b = 0.0f;
                }
            }
        };
        ae aeVarA = ae.a();
        String str = aVarA.f26256c;
        aeVarA.f26270a = bVar;
        int i10 = aeVarA.f26274d;
        if (i10 != 1 && i10 != 3) {
            aeVarA.f26271b = str;
            aeVarA.a(100L, 1);
        }
        aVarA.f26254a.a(aVarA.f26255b);
    }

    public class a implements com.akamai.botman.a.InterfaceC0118a {

        /* JADX INFO: renamed from: com.cyberfend.cyfsecurity.CCADialogActivity$a$a, reason: collision with other inner class name */
        public class RunnableC0184a implements Runnable {

            /* JADX INFO: renamed from: p0, reason: collision with root package name */
            public final /* synthetic */ float f39231p0;

            public RunnableC0184a(float f6) {
                this.f39231p0 = f6;
            }

            @Override // java.lang.Runnable
            public final void run() {
                CCADialogActivity.this.f39228q0.setProgress(this.f39231p0);
            }
        }

        public a() {
        }

        @Override // com.akamai.botman.a.InterfaceC0118a
        public final void a() {
            CCADialogActivity cCADialogActivity = CCADialogActivity.this;
            cCADialogActivity.f39228q0.f39249x0.removeCallbacksAndMessages(null);
            cCADialogActivity.finish();
        }

        @Override // com.akamai.botman.a.InterfaceC0118a
        public final void a(float f6) {
            new Handler(Looper.getMainLooper()).post(new RunnableC0184a(f6));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
    }
}
