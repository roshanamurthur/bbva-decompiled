package com.bbva.cellscore.web.reader;

import android.content.Context;
import androidx.camera.camera2.internal.compat.u;
import com.bbva.cellscore.web.data.CellsPage;
import com.bbva.cellscore.web.data.GlobalDefinition;
import com.bbva.cellscore.web.deserializer.CellsPageDeserializer;
import com.bbva.cellscore.web.deserializer.model.RouteReaderConfig;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class RouteReader {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f27223b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, String> f27225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f27226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GlobalDefinition f27227f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f27228g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CellsPageDeserializer f27222a = new CellsPageDeserializer();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f27224c = new HashMap();

    public RouteReader(Context context, RouteReaderConfig routeReaderConfig) {
        this.f27223b = context;
        this.f27226e = routeReaderConfig.getFlavor();
        this.f27225d = routeReaderConfig.getGlobalConfiguration();
        this.f27228g = routeReaderConfig.getIsMergeEnable();
    }

    public static String a(String str, String str2) {
        if (str == null) {
            str = "main";
        }
        return u.f(str, str2);
    }

    public final CellsPage b(String str, String str2) {
        String strConcat;
        if (str == null) {
            strConcat = "main/";
        } else {
            try {
                strConcat = str.concat("/");
            } catch (Exception unused) {
                return CellsPage.EMPTY;
            }
        }
        return this.f27222a.deserialize(this.f27223b.getAssets().open("routes/" + strConcat + str2 + ".json"));
    }

    public CellsPage readRoute(String str) {
        HashMap map = this.f27224c;
        CellsPage cellsPage = (CellsPage) map.get(a(this.f27226e, str));
        if (cellsPage != null) {
            return cellsPage;
        }
        CellsPage cellsPageB = b(this.f27226e, str);
        CellsPage cellsPage2 = CellsPage.EMPTY;
        boolean z10 = this.f27228g;
        if (cellsPageB == cellsPage2 && !z10) {
            return cellsPage2;
        }
        if (z10) {
            CellsPage cellsPageB2 = (CellsPage) map.get(a(null, str));
            if (cellsPageB2 == null) {
                cellsPageB2 = b(null, str);
                map.put(a(null, str), cellsPageB2);
            }
            cellsPageB = cellsPageB2.merge(cellsPageB);
        }
        if (this.f27227f == null) {
            try {
                this.f27227f = this.f27222a.deserializeGlobalProperties(this.f27223b.getAssets().open("routes/common/global.json"));
            } catch (Exception unused) {
                this.f27227f = new GlobalDefinition();
            }
        }
        CellsPage cellsPageReplace = this.f27227f.replace(cellsPageB, this.f27225d);
        map.put(a(this.f27226e, str), cellsPageReplace);
        return cellsPageReplace;
    }

    public void setFlavor(String str) {
        this.f27226e = str;
    }
}
