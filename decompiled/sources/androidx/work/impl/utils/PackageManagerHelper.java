package androidx.work.impl.utils;

import android.content.ComponentName;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.work.Logger;
import com.bbva.ui.component.menu.model.BaseMenuItem;

/* JADX INFO: loaded from: classes2.dex */
public class PackageManagerHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f24621a = Logger.tagWithPrefix("PackageManagerHelper");

    public static boolean isComponentExplicitlyEnabled(Context context, Class<?> cls) {
        return isComponentExplicitlyEnabled(context, cls.getName());
    }

    public static void setComponentEnabled(@NonNull Context context, @NonNull Class<?> cls, boolean z10) {
        String str = BaseMenuItem.STATE_DISABLED;
        String str2 = f24621a;
        try {
            context.getPackageManager().setComponentEnabledSetting(new ComponentName(context, cls.getName()), z10 ? 1 : 2, 1);
            Logger logger = Logger.get();
            Object[] objArr = new Object[2];
            objArr[0] = cls.getName();
            objArr[1] = z10 ? "enabled" : BaseMenuItem.STATE_DISABLED;
            logger.debug(str2, String.format("%s %s", objArr), new Throwable[0]);
        } catch (Exception e5) {
            Logger logger2 = Logger.get();
            Object[] objArr2 = new Object[2];
            objArr2[0] = cls.getName();
            if (z10) {
                str = "enabled";
            }
            objArr2[1] = str;
            logger2.debug(str2, String.format("%s could not be %s", objArr2), e5);
        }
    }

    public static boolean isComponentExplicitlyEnabled(Context context, String str) {
        return context.getPackageManager().getComponentEnabledSetting(new ComponentName(context, str)) == 1;
    }
}
