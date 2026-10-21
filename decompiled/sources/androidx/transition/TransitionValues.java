package androidx.transition;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.u;
import androidx.camera.core.processing.f;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class TransitionValues {

    @SuppressLint({"UnknownNullness"})
    public View view;
    public final Map<String, Object> values = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<Transition> f23710a = new ArrayList<>();

    @Deprecated
    public TransitionValues() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof TransitionValues)) {
            return false;
        }
        TransitionValues transitionValues = (TransitionValues) obj;
        return this.view == transitionValues.view && this.values.equals(transitionValues.values);
    }

    public int hashCode() {
        return this.values.hashCode() + (this.view.hashCode() * 31);
    }

    @NonNull
    public String toString() {
        StringBuilder sbE = f.e("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        sbE.append(this.view);
        sbE.append(RootService.LINE_BREAK);
        String strF = u.f(sbE.toString(), "    values:");
        for (String str : this.values.keySet()) {
            strF = strF + "    " + str + ": " + this.values.get(str) + RootService.LINE_BREAK;
        }
        return strF;
    }

    public TransitionValues(@NonNull View view) {
        this.view = view;
    }
}
