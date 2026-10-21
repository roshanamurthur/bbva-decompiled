package l4;

import android.app.Activity;
import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import com.bbva.cellscore.helper.BundleHelper;
import com.bbva.cellscore.web.data.CellsMessage;
import com.bbva.cellscore.web.navigation.Route;
import com.bbva.cellscore.web.navigation.actions.NavigationAction;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: NavigationLaunchPage.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h implements NavigationAction {
    public abstract boolean a();

    public abstract boolean b();

    public ye.b c() {
        ye.a aVar = (ye.a) this;
        Map map = aVar.f94787b;
        if (map == null) {
            throw new IllegalStateException("Property \"splitInstallErrorCodeByModule\" has not been set");
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        if (mapUnmodifiableMap == null) {
            throw new NullPointerException("Null splitInstallErrorCodeByModule");
        }
        aVar.f94787b = mapUnmodifiableMap;
        return new ye.b(aVar.f94786a, aVar.f94787b);
    }

    @Override // com.bbva.cellscore.web.navigation.actions.NavigationAction
    public void execute(Activity activity, CellsMessage cellsMessage, Route route) {
        if (route == null) {
            return;
        }
        Intent intent = new Intent(activity, route.getActivity());
        Bundle bundle = (Bundle) BundleHelper.tryGetValue(cellsMessage.params());
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        int animationIn = route.getAnimationIn();
        int animationOut = route.getAnimationOut();
        if (animationIn == 0 && animationOut == 0) {
            activity.startActivity(intent);
        } else {
            activity.startActivity(intent, ActivityOptions.makeCustomAnimation(activity, animationIn, animationOut).toBundle());
        }
        if (a()) {
            activity.finishAffinity();
        } else if (b()) {
            activity.finish();
        }
    }
}
