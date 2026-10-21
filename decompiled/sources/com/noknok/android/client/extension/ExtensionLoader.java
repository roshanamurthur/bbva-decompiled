package com.noknok.android.client.extension;

import android.content.Context;
import com.google.gson.JsonElement;
import com.noknok.android.client.utils.AppSDKConfig;
import com.noknok.android.client.utils.Logger;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ExtensionLoader {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static ExtensionLoader f63305c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<IExtensionProcessor> f63306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f63307b;

    private ExtensionLoader(Context context) {
        this.f63307b = context;
    }

    public static synchronized ExtensionLoader getInstance(Context context) {
        try {
            if (f63305c == null) {
                f63305c = new ExtensionLoader(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f63305c;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public List<IExtensionProcessor> loadExtensions() {
        if (this.f63306a == null) {
            ArrayList arrayList = new ArrayList();
            this.f63306a = arrayList;
            arrayList.add(new PlayIntegrity(this.f63307b, null));
            this.f63306a.add(new LocationTracker(this.f63307b));
            this.f63306a.add(new JailBreakRiskSignal(this.f63307b));
            this.f63306a.add(new WifiNameExtProc(this.f63307b));
            this.f63306a.add(new MetricsExtProc(this.f63307b));
            JsonElement jsonElement = AppSDKConfig.getInstance(this.f63307b).get(AppSDKConfig.Key.customExtensions);
            if (jsonElement != null) {
                Iterator<JsonElement> it = jsonElement.getAsJsonArray().iterator();
                while (it.hasNext()) {
                    String asString = it.next().getAsString();
                    try {
                        this.f63306a.add((IExtensionProcessor) Class.forName(asString).asSubclass(IExtensionProcessor.class).getConstructor(Context.class).newInstance(this.f63307b));
                    } catch (ClassNotFoundException e5) {
                        e = e5;
                        Logger.e("ExtensionLoader", "Unable to load extension class :" + asString, e);
                    } catch (IllegalAccessException e7) {
                        e = e7;
                        Logger.e("ExtensionLoader", "Unable to load extension class :" + asString, e);
                    } catch (InstantiationException e10) {
                        e = e10;
                        Logger.e("ExtensionLoader", "Unable to load extension class :" + asString, e);
                    } catch (NoSuchMethodException e11) {
                        e = e11;
                        Logger.e("ExtensionLoader", "Unable to load extension class :" + asString, e);
                    } catch (RuntimeException e12) {
                        Logger.e("ExtensionLoader", "RuntimeException while loading extension class :" + asString, e12);
                    } catch (InvocationTargetException e13) {
                        e = e13;
                        Logger.e("ExtensionLoader", "Unable to load extension class :" + asString, e);
                    }
                }
            }
        }
        return this.f63306a;
    }
}
