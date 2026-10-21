package androidx.appcompat.widget;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ActionProvider;

/* JADX INFO: loaded from: classes.dex */
public class ShareActionProvider extends ActionProvider {
    public static final String DEFAULT_SHARE_HISTORY_FILE_NAME = "share_history.xml";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f1443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f1444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f1445g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public OnShareTargetSelectedListener f1446h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f1447i;

    public interface OnShareTargetSelectedListener {
        boolean onShareTargetSelected(ShareActionProvider shareActionProvider, Intent intent);
    }

    public class a implements ActivityChooserModel.OnChooseActivityListener {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActivityChooserModel.OnChooseActivityListener
        public final boolean onChooseActivity(ActivityChooserModel activityChooserModel, Intent intent) {
            ShareActionProvider shareActionProvider = ShareActionProvider.this;
            OnShareTargetSelectedListener onShareTargetSelectedListener = shareActionProvider.f1446h;
            if (onShareTargetSelectedListener == null) {
                return false;
            }
            onShareTargetSelectedListener.onShareTargetSelected(shareActionProvider, intent);
            return false;
        }
    }

    public class b implements MenuItem.OnMenuItemClickListener {
        public b() {
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            ShareActionProvider shareActionProvider = ShareActionProvider.this;
            Intent intentB = ActivityChooserModel.d(shareActionProvider.f1444f, shareActionProvider.f1445g).b(menuItem.getItemId());
            if (intentB == null) {
                return true;
            }
            String action = intentB.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                shareActionProvider.getClass();
                intentB.addFlags(134742016);
            }
            shareActionProvider.f1444f.startActivity(intentB);
            return true;
        }
    }

    public ShareActionProvider(Context context) {
        super(context);
        this.f1442d = 4;
        this.f1443e = new b();
        this.f1445g = DEFAULT_SHARE_HISTORY_FILE_NAME;
        this.f1444f = context;
    }

    public final void a() {
        if (this.f1446h == null) {
            return;
        }
        if (this.f1447i == null) {
            this.f1447i = new a();
        }
        ActivityChooserModel activityChooserModelD = ActivityChooserModel.d(this.f1444f, this.f1445g);
        a aVar = this.f1447i;
        synchronized (activityChooserModelD.f1090a) {
            activityChooserModelD.m = aVar;
        }
    }

    @Override // androidx.core.view.ActionProvider
    public boolean hasSubMenu() {
        return true;
    }

    @Override // androidx.core.view.ActionProvider
    public View onCreateActionView() {
        Context context = this.f1444f;
        ActivityChooserView activityChooserView = new ActivityChooserView(context);
        if (!activityChooserView.isInEditMode()) {
            activityChooserView.setActivityChooserModel(ActivityChooserModel.d(context, this.f1445g));
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.actionModeShareDrawable, typedValue, true);
        activityChooserView.setExpandActivityOverflowButtonDrawable(AppCompatResources.getDrawable(context, typedValue.resourceId));
        activityChooserView.setProvider(this);
        activityChooserView.setDefaultActionButtonContentDescription(R.string.abc_shareactionprovider_share_with_application);
        activityChooserView.setExpandActivityOverflowButtonContentDescription(R.string.abc_shareactionprovider_share_with);
        return activityChooserView;
    }

    @Override // androidx.core.view.ActionProvider
    public void onPrepareSubMenu(SubMenu subMenu) {
        b bVar;
        subMenu.clear();
        String str = this.f1445g;
        Context context = this.f1444f;
        ActivityChooserModel activityChooserModelD = ActivityChooserModel.d(context, str);
        PackageManager packageManager = context.getPackageManager();
        int iF = activityChooserModelD.f();
        int iMin = Math.min(iF, this.f1442d);
        int i10 = 0;
        while (true) {
            bVar = this.f1443e;
            if (i10 >= iMin) {
                break;
            }
            ResolveInfo resolveInfoE = activityChooserModelD.e(i10);
            subMenu.add(0, i10, i10, resolveInfoE.loadLabel(packageManager)).setIcon(resolveInfoE.loadIcon(packageManager)).setOnMenuItemClickListener(bVar);
            i10++;
        }
        if (iMin < iF) {
            SubMenu subMenuAddSubMenu = subMenu.addSubMenu(0, iMin, iMin, context.getString(R.string.abc_activity_chooser_view_see_all));
            for (int i11 = 0; i11 < iF; i11++) {
                ResolveInfo resolveInfoE2 = activityChooserModelD.e(i11);
                subMenuAddSubMenu.add(0, i11, i11, resolveInfoE2.loadLabel(packageManager)).setIcon(resolveInfoE2.loadIcon(packageManager)).setOnMenuItemClickListener(bVar);
            }
        }
    }

    public void setOnShareTargetSelectedListener(OnShareTargetSelectedListener onShareTargetSelectedListener) {
        this.f1446h = onShareTargetSelectedListener;
        a();
    }

    public void setShareHistoryFileName(String str) {
        this.f1445g = str;
        a();
    }

    public void setShareIntent(Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if ("android.intent.action.SEND".equals(action) || "android.intent.action.SEND_MULTIPLE".equals(action)) {
                intent.addFlags(134742016);
            }
        }
        ActivityChooserModel activityChooserModelD = ActivityChooserModel.d(this.f1444f, this.f1445g);
        synchronized (activityChooserModelD.f1090a) {
            try {
                if (activityChooserModelD.f1095f == intent) {
                    return;
                }
                activityChooserModelD.f1095f = intent;
                activityChooserModelD.f1101l = true;
                activityChooserModelD.c();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
