package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.widget.SpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes.dex */
public interface ThemedSpinnerAdapter extends SpinnerAdapter {

    public static final class Helper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f1493a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LayoutInflater f1494b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public LayoutInflater f1495c;

        public Helper(@NonNull Context context) {
            this.f1493a = context;
            this.f1494b = LayoutInflater.from(context);
        }

        @NonNull
        public LayoutInflater getDropDownViewInflater() {
            LayoutInflater layoutInflater = this.f1495c;
            return layoutInflater != null ? layoutInflater : this.f1494b;
        }

        @Nullable
        public Resources.Theme getDropDownViewTheme() {
            LayoutInflater layoutInflater = this.f1495c;
            if (layoutInflater == null) {
                return null;
            }
            return layoutInflater.getContext().getTheme();
        }

        public void setDropDownViewTheme(@Nullable Resources.Theme theme) {
            if (theme == null) {
                this.f1495c = null;
                return;
            }
            Context context = this.f1493a;
            if (theme.equals(context.getTheme())) {
                this.f1495c = this.f1494b;
            } else {
                this.f1495c = LayoutInflater.from(new ContextThemeWrapper(context, theme));
            }
        }
    }

    @Nullable
    Resources.Theme getDropDownViewTheme();

    void setDropDownViewTheme(@Nullable Resources.Theme theme);
}
