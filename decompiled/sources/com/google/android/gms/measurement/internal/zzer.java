package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.bbva.ethermobilesdk.tokencompat.storage.local.SharedPrefsStorage;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
public final class zzer {
    final /* synthetic */ zzew zza;
    private final String zzb;
    private final Bundle zzc;
    private Bundle zzd;

    public zzer(zzew zzewVar, String str, Bundle bundle) {
        this.zza = zzewVar;
        Preconditions.checkNotEmpty("default_event_parameters");
        this.zzb = "default_event_parameters";
        this.zzc = new Bundle();
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    @WorkerThread
    public final Bundle zza() {
        byte b10;
        if (this.zzd == null) {
            String string = this.zza.zza().getString(this.zzb, null);
            if (string != null) {
                try {
                    Bundle bundle = new Bundle();
                    JSONArray jSONArray = new JSONArray(string);
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        try {
                            JSONObject jSONObject = jSONArray.getJSONObject(i10);
                            String string2 = jSONObject.getString("n");
                            String string3 = jSONObject.getString("t");
                            int iHashCode = string3.hashCode();
                            if (iHashCode != 100) {
                                if (iHashCode != 108) {
                                    if (iHashCode == 115 && string3.equals("s")) {
                                        b10 = 0;
                                    } else {
                                        b10 = -1;
                                    }
                                } else if (string3.equals("l")) {
                                    b10 = 2;
                                } else {
                                    b10 = -1;
                                }
                            } else if (string3.equals("d")) {
                                b10 = 1;
                            } else {
                                b10 = -1;
                            }
                            if (b10 == 0) {
                                bundle.putString(string2, jSONObject.getString(SharedPrefsStorage.VERSION_KEY));
                            } else if (b10 == 1) {
                                bundle.putDouble(string2, Double.parseDouble(jSONObject.getString(SharedPrefsStorage.VERSION_KEY)));
                            } else if (b10 != 2) {
                                this.zza.zzs.zzay().zzd().zzb("Unrecognized persisted bundle type. Type", string3);
                            } else {
                                bundle.putLong(string2, Long.parseLong(jSONObject.getString(SharedPrefsStorage.VERSION_KEY)));
                            }
                        } catch (NumberFormatException | JSONException unused) {
                            this.zza.zzs.zzay().zzd().zza("Error reading value from SharedPreferences. Value dropped");
                        }
                    }
                    this.zzd = bundle;
                } catch (JSONException unused2) {
                    bc.org.bouncycastle.math.ec.custom.sec.a.e(this.zza.zzs, "Error loading bundle from SharedPreferences. Values will be lost");
                }
            }
            if (this.zzd == null) {
                this.zzd = this.zzc;
            }
        }
        return this.zzd;
    }

    @WorkerThread
    public final void zzb(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        SharedPreferences.Editor editorEdit = this.zza.zza().edit();
        if (bundle.size() == 0) {
            editorEdit.remove(this.zzb);
        } else {
            String str = this.zzb;
            JSONArray jSONArray = new JSONArray();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj != null) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("n", str2);
                        jSONObject.put(SharedPrefsStorage.VERSION_KEY, obj.toString());
                        if (obj instanceof String) {
                            jSONObject.put("t", "s");
                        } else if (obj instanceof Long) {
                            jSONObject.put("t", "l");
                        } else if (obj instanceof Double) {
                            jSONObject.put("t", "d");
                        } else {
                            this.zza.zzs.zzay().zzd().zzb("Cannot serialize bundle value to SharedPreferences. Type", obj.getClass());
                        }
                        jSONArray.put(jSONObject);
                    } catch (JSONException e5) {
                        this.zza.zzs.zzay().zzd().zzb("Cannot serialize bundle value to SharedPreferences", e5);
                    }
                }
            }
            editorEdit.putString(str, jSONArray.toString());
        }
        editorEdit.apply();
        this.zzd = bundle;
    }
}
