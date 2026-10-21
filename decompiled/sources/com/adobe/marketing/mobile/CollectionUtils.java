package com.adobe.marketing.mobile;

import ad.d;
import androidx.camera.camera2.internal.compat.u;
import androidx.collection.k;
import androidx.databinding.e;
import com.bbva.ethermobilesdk.devicechecker.root.service.RootService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import mx.openpay.library.domain.util.Constant;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: classes2.dex */
class CollectionUtils {
    private static final String SUFFIX_FOR_EACH_OBJECT = "[*]";

    public static List<Variant> addDataToList(List<Variant> list, List<Variant> list2) {
        if (list2.isEmpty()) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        for (Variant variant : list2) {
            VariantKind kind = variant.getKind();
            if (!VariantKind.NULL.equals(kind)) {
                if (!VariantKind.MAP.equals(kind) && !VariantKind.VECTOR.equals(kind)) {
                    Iterator<Variant> it = list.iterator();
                    do {
                        if (!it.hasNext()) {
                            arrayList.add(variant);
                            break;
                        }
                    } while (!it.next().equals(variant));
                } else {
                    arrayList.add(variant);
                }
            }
        }
        return arrayList;
    }

    public static Map<String, Variant> addDataToMap(Map<String, Variant> map, Map<String, Variant> map2) {
        return addDataToMap(map, map2, false, false);
    }

    public static Map<String, Variant> deleteIfEmpty(Map<String, Variant> map) {
        if (map.isEmpty()) {
            return map;
        }
        HashMap map2 = new HashMap(map);
        for (Map.Entry<String, Variant> entry : map.entrySet()) {
            String key = entry.getKey();
            VariantKind kind = entry.getValue().getKind();
            if (VariantKind.NULL.equals(kind)) {
                map2.remove(key);
            } else if (VariantKind.MAP.equals(kind)) {
                new HashMap();
                if (key.endsWith(SUFFIX_FOR_EACH_OBJECT)) {
                    map2.remove(key);
                } else {
                    try {
                        map2.put(key, Variant.fromVariantMap(deleteIfEmpty(map.get(key).getVariantMap())));
                    } catch (VariantException unused) {
                    }
                }
            }
        }
        return map2;
    }

    public static String getPrettyString(Map<String, Variant> map, int i10) {
        if (map.isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        for (Map.Entry<String, Variant> entry : map.entrySet()) {
            String key = entry.getKey();
            Variant value = entry.getValue();
            VariantKind kind = value.getKind();
            if (sb2.length() > 1) {
                sb2.append(",");
            }
            sb2.append(RootService.LINE_BREAK);
            sb2.append(getWhitespace(i10 * 4));
            if (VariantKind.NULL == kind) {
                k.e(sb2, "\"", key, "\"", " : null");
            } else if (VariantKind.STRING == kind) {
                k.e(sb2, "\"", key, "\"", " : ");
                sb2.append("\"");
                sb2.append(value.optString(""));
                sb2.append("\"");
            } else if (VariantKind.INTEGER == kind) {
                k.e(sb2, "\"", key, "\"", " : ");
                sb2.append(value.optInteger(0));
            } else if (VariantKind.LONG == kind) {
                k.e(sb2, "\"", key, "\"", " : ");
                sb2.append(value.optLong(0L));
            } else if (VariantKind.DOUBLE == kind) {
                k.e(sb2, "\"", key, "\"", " : ");
                sb2.append(value.optDouble(0.0d));
            } else if (VariantKind.BOOLEAN == kind) {
                k.e(sb2, "\"", key, "\"", " : ");
                sb2.append(value.optBoolean(false));
            } else if (VariantKind.MAP == kind) {
                Map<String, Variant> mapOptVariantMap = value.optVariantMap(new HashMap());
                if (mapOptVariantMap.size() <= 0) {
                    k.e(sb2, "\"", key, "\"", " : { }");
                } else {
                    sb2.append("\"");
                    sb2.append(key);
                    sb2.append("\"");
                    sb2.append(" : ");
                    sb2.append(getPrettyString(mapOptVariantMap, i10 + 1));
                }
            } else if (VariantKind.VECTOR == kind) {
                List<Variant> listOptVariantList = value.optVariantList(new ArrayList());
                if (listOptVariantList.size() <= 0) {
                    k.e(sb2, "\"", key, "\"", " : [ ]");
                } else {
                    sb2.append("\"");
                    sb2.append(key);
                    sb2.append("\"");
                    sb2.append(" : ");
                    sb2.append(getPrettyString(listOptVariantList, i10 + 1));
                }
            }
        }
        sb2.append(RootService.LINE_BREAK);
        return d.f(sb2, getWhitespace((i10 - 1) * 4), "}");
    }

    public static String getWhitespace(int i10) {
        StringBuilder sb2 = new StringBuilder();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(" ");
        }
        return sb2.toString();
    }

    public static boolean keyExistsAndValueIsNull(String str, Map<String, Variant> map) {
        if (str == null || str.isEmpty() || !map.containsKey(str)) {
            return false;
        }
        Variant variant = map.get(str);
        return variant == null || variant.getKind() == VariantKind.NULL;
    }

    public static Map<String, Variant> addDataToMap(Map<String, Variant> map, Map<String, Variant> map2, boolean z10, boolean z11) {
        if (map2.isEmpty()) {
            return map;
        }
        HashMap map3 = new HashMap(map);
        for (Map.Entry<String, Variant> entry : map2.entrySet()) {
            String key = entry.getKey();
            Variant value = entry.getValue();
            VariantKind kind = value.getKind();
            if (z10 && keyExistsAndValueIsNull(key, map)) {
                map3.remove(key);
            } else if (!VariantKind.NULL.equals(kind)) {
                VariantKind variantKind = VariantKind.MAP;
                if (variantKind.equals(kind)) {
                    Map<String, Variant> mapOptVariantMap = value.optVariantMap(new HashMap());
                    if (key.endsWith(SUFFIX_FOR_EACH_OBJECT)) {
                        String strC = e.c(key, 3, 0);
                        List<Variant> arrayList = new ArrayList<>();
                        if (map.containsKey(strC)) {
                            try {
                                arrayList = map.get(strC).getVariantList();
                            } catch (VariantException unused) {
                            }
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (Variant variant : arrayList) {
                            if (VariantKind.MAP.equals(variant.getKind())) {
                                arrayList2.add(Variant.fromVariantMap(addDataToMap(variant.optVariantMap(null), mapOptVariantMap, z10, z11)));
                            } else {
                                arrayList2.add(variant);
                            }
                        }
                        map3.put(strC, Variant.fromVariantList(arrayList2));
                    } else {
                        Map<String, Variant> map4 = new HashMap<>();
                        if (map.containsKey(key)) {
                            map4 = map.get(key).getVariantMap();
                        }
                        map3.put(key, Variant.fromVariantMap(addDataToMap(map4, mapOptVariantMap, z10, z11)));
                    }
                } else if (VariantKind.VECTOR.equals(kind)) {
                    List<Variant> variantList = value.getVariantList();
                    String strF = u.f(key, SUFFIX_FOR_EACH_OBJECT);
                    if (!z11 || !map.containsKey(strF)) {
                        List<Variant> arrayList3 = new ArrayList<>();
                        if (map.containsKey(key)) {
                            arrayList3 = map.get(key).getVariantList();
                        }
                        map3.put(key, Variant.fromVariantList(addDataToList(arrayList3, value.optVariantList(new ArrayList()))));
                    } else if (variantKind.equals(map.get(strF).getKind())) {
                        Map<String, Variant> mapOptVariantMap2 = map.get(strF).optVariantMap(new HashMap());
                        ArrayList arrayList4 = new ArrayList();
                        for (Variant variant2 : variantList) {
                            if (VariantKind.MAP.equals(variant2.getKind())) {
                                arrayList4.add(Variant.fromVariantMap(addDataToMap(mapOptVariantMap2, variant2.optVariantMap(null), z10, z11)));
                            } else {
                                arrayList4.add(variant2);
                            }
                        }
                        map3.put(key, Variant.fromVariantList(arrayList4));
                    }
                } else if (!map.containsKey(key)) {
                    map3.put(key, value);
                }
            }
        }
        return z10 ? deleteIfEmpty(map3) : map3;
    }

    public static String getPrettyString(List<Variant> list, int i10) {
        if (list.isEmpty()) {
            return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
        StringBuilder sb2 = new StringBuilder(Constant.BRACKET_OPEN);
        for (Variant variant : list) {
            VariantKind kind = variant.getKind();
            if (sb2.length() > 1) {
                sb2.append(",");
            }
            sb2.append(RootService.LINE_BREAK);
            sb2.append(getWhitespace(i10 * 4));
            if (VariantKind.NULL == kind) {
                sb2.append(AbstractJsonLexerKt.NULL);
            } else if (VariantKind.STRING == kind) {
                sb2.append("\"");
                sb2.append(variant.optString(""));
                sb2.append("\"");
            } else if (VariantKind.INTEGER == kind) {
                sb2.append(variant.optInteger(0));
            } else if (VariantKind.LONG == kind) {
                sb2.append(variant.optLong(0L));
            } else if (VariantKind.DOUBLE == kind) {
                sb2.append(variant.optDouble(0.0d));
            } else if (VariantKind.BOOLEAN == kind) {
                sb2.append(variant.optBoolean(false));
            } else if (VariantKind.MAP == kind) {
                sb2.append(getPrettyString(variant.optVariantMap(new HashMap()), i10 + 1));
            } else if (VariantKind.VECTOR == kind) {
                sb2.append(getPrettyString(variant.optVariantList(new ArrayList()), i10 + 1));
            }
        }
        sb2.append(RootService.LINE_BREAK);
        return d.f(sb2, getWhitespace((i10 - 1) * 4), Constant.BRACKET_CLOSE);
    }
}
