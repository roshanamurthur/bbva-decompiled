package he;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import com.google.android.material.R;
import com.google.android.material.color.ColorResourcesOverride;
import com.google.android.material.color.ThemeUtils;
import java.util.Map;

/* JADX INFO: compiled from: ResourcesLoaderColorResourcesOverride.java */
/* JADX INFO: loaded from: classes10.dex */
@RequiresApi(api = 30)
public final class d implements ColorResourcesOverride {

    /* JADX INFO: compiled from: ResourcesLoaderColorResourcesOverride.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f69416a = new d();
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    public final boolean applyIfPossible(Context context, Map<Integer, Integer> map) {
        if (!f.a(context, map)) {
            return false;
        }
        ThemeUtils.applyThemeOverlay(context, R.style.ThemeOverlay_Material3_PersonalizedColors);
        return true;
    }

    @Override // com.google.android.material.color.ColorResourcesOverride
    @NonNull
    public final Context wrapContextIfPossible(Context context, Map<Integer, Integer> map) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.ThemeOverlay_Material3_PersonalizedColors);
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        return f.a(contextThemeWrapper, map) ? contextThemeWrapper : context;
    }
}
