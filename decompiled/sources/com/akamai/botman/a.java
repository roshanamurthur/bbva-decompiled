package com.akamai.botman;

import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.util.TypedValue;
import com.cyberfend.cyfsecurity.CCADialogActivity;
import com.cyberfend.cyfsecurity.R;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f26253f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC0118a f26254a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f26255b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f26256c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CYFMonitor.ChallengeActionCallback f26257d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f26258e;

    /* JADX INFO: renamed from: com.akamai.botman.a$a, reason: collision with other inner class name */
    public interface InterfaceC0118a {
        void a();

        void a(float f6);
    }

    public static a a() {
        return f26253f;
    }

    public static void b() {
        ae aeVarA = ae.a();
        int i10 = aeVarA.f26274d;
        if (i10 == 1) {
            aeVarA.d(2);
        } else if (i10 == 3) {
            aeVarA.d(0);
        }
    }

    public final boolean a(Context context, String str, String str2, String str3, CYFMonitor.ChallengeActionCallback challengeActionCallback, String str4) {
        if (this.f26258e == 1 || challengeActionCallback == null) {
            return false;
        }
        this.f26257d = challengeActionCallback;
        if (ae.a().f26273c == null || ae.a().f26273c.equals("")) {
            this.f26257d.onChallengeActionFailure("CCA is not configured");
            return false;
        }
        this.f26256c = str4;
        Intent intent = new Intent(context, (Class<?>) CCADialogActivity.class);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(new TypedValue().data, new int[]{R.attr.colorPrimary});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        intent.putExtra("CCA Title", str);
        intent.putExtra("CCA Message", str2);
        intent.putExtra("CCA Cancel Button", str3);
        intent.putExtra("Theme Color", color);
        context.startActivity(intent);
        synchronized (this) {
            this.f26258e = 1;
        }
        return true;
    }
}
