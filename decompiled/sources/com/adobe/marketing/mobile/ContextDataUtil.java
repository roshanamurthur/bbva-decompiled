package com.adobe.marketing.mobile;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import mx.openpay.library.domain.util.Constant;

/* JADX INFO: loaded from: classes2.dex */
class ContextDataUtil {
    private static final String LOG_TAG = "ContextDataUtil";
    private static final int MAX_LIMIT = 250;
    private static final boolean[] contextDataMask = {false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, false, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false};
    private static final Map<String, String> contextDataKeyWhiteList = new HashMap(256);
    private static int contextDataKeyWhiteListCount = 0;

    private ContextDataUtil() {
    }

    private static void addValueToHashMap(Object obj, ContextData contextData, List<String> list, int i10) {
        if (contextData == null || list == null) {
            return;
        }
        int size = list.size();
        String str = i10 < size ? list.get(i10) : null;
        if (str == null) {
            return;
        }
        ContextData contextData2 = new ContextData();
        if (contextData.containsKey(str)) {
            contextData2 = contextData.get(str);
        }
        if (size - 1 == i10) {
            contextData2.value = obj;
            contextData.put(str, contextData2);
        } else {
            contextData.put(str, contextData2);
            addValueToHashMap(obj, contextData2, list, i10 + 1);
        }
    }

    public static String appendContextData(Map<String, String> map, String str) {
        if (!StringUtils.isNullOrEmpty(str) && map != null && !map.isEmpty()) {
            java.util.regex.Matcher matcher = Pattern.compile(".*(&c\\.(.*)&\\.c).*").matcher(str);
            try {
                if (!matcher.matches() || matcher.group(2) == null) {
                    StringBuilder sb2 = new StringBuilder(str);
                    HashMap map2 = new HashMap();
                    map2.put("c", translateContextData(map));
                    serializeToQueryString(map2, sb2);
                    return sb2.toString();
                }
            } catch (IllegalStateException e5) {
                Log.debug(LOG_TAG, "Context data matcher failed with %s", e5);
            } catch (IndexOutOfBoundsException e7) {
                Log.debug(LOG_TAG, "Context data matcher failed with %s", e7);
            }
            try {
                Map<String, String> mapDeserializeContextDataKeyValuePairs = deserializeContextDataKeyValuePairs(matcher.group(2));
                mapDeserializeContextDataKeyValuePairs.putAll(map);
                StringBuilder sb3 = new StringBuilder(str.substring(0, matcher.start(1)));
                HashMap map3 = new HashMap();
                map3.put("c", translateContextData(mapDeserializeContextDataKeyValuePairs));
                serializeToQueryString(map3, sb3);
                sb3.append(str.substring(matcher.end(1)));
                return sb3.toString();
            } catch (IllegalStateException e10) {
                Log.debug(LOG_TAG, "Context data matcher failed with %s", e10);
            } catch (IndexOutOfBoundsException e11) {
                Log.debug(LOG_TAG, "Context data matcher failed with %s", e11);
            }
        }
        return str;
    }

    public static Map<String, Object> cleanContextDataDictionary(Map<String, String> map) {
        HashMap map2 = new HashMap();
        if (map == null) {
            return map2;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String strCleanContextDataKey = cleanContextDataKey(entry.getKey());
            if (strCleanContextDataKey != null) {
                map2.put(strCleanContextDataKey, entry.getValue());
            }
        }
        return map2;
    }

    public static String cleanContextDataKey(String str) {
        if (str == null) {
            return null;
        }
        Map<String, String> map = contextDataKeyWhiteList;
        synchronized (map) {
            try {
                String str2 = map.get(str);
                if (str2 != null) {
                    return str2;
                }
                try {
                    byte[] bytes = str.getBytes("UTF-8");
                    byte[] bArr = new byte[bytes.length];
                    int i10 = 0;
                    byte b10 = 0;
                    for (byte b11 : bytes) {
                        if ((b11 != 46 || b10 != 46) && contextDataMask[b11 & 255]) {
                            bArr[i10] = b11;
                            i10++;
                            b10 = b11;
                        }
                    }
                    if (i10 == 0) {
                        return null;
                    }
                    int i11 = bArr[0] == 46 ? 1 : 0;
                    int i12 = (i10 - (bArr[i10 + (-1)] == 46 ? 1 : 0)) - i11;
                    if (i12 <= 0) {
                        return null;
                    }
                    String str3 = new String(bArr, i11, i12, "UTF-8");
                    Map<String, String> map2 = contextDataKeyWhiteList;
                    synchronized (map2) {
                        try {
                            if (contextDataKeyWhiteListCount > 250) {
                                map2.clear();
                                contextDataKeyWhiteListCount = 0;
                            }
                            map2.put(str, str3);
                            contextDataKeyWhiteListCount++;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    return str3;
                } catch (UnsupportedEncodingException e5) {
                    Log.error(LOG_TAG, "Unable to clean context data key (%s)", e5);
                    return null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private static String contextDataStringPath(List<String> list, String str) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
        }
        sb2.append(str);
        return sb2.toString();
    }

    public static Map<String, String> deserializeContextDataKeyValuePairs(String str) {
        HashMap map = new HashMap(64);
        ArrayList arrayList = new ArrayList(16);
        for (String str2 : str.split("&")) {
            if (str2.endsWith(Constant.DOT_STRING) && !str2.contains("=")) {
                arrayList.add(str2);
            } else if (!str2.startsWith(Constant.DOT_STRING)) {
                String[] strArrSplit = str2.split("=");
                if (strArrSplit.length == 2) {
                    try {
                        map.put(contextDataStringPath(arrayList, strArrSplit[0]), URLDecoder.decode(strArrSplit[1], "UTF-8"));
                    } catch (UnsupportedEncodingException e5) {
                        Log.warning(LOG_TAG, "Appending the context data information failed with %s", e5);
                    }
                }
            } else if (!arrayList.isEmpty()) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        return map;
    }

    public static String join(Iterable<?> iterable, String str) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<?> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (!it.hasNext()) {
                break;
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    private static void serializeKeyValuePair(String str, Object obj, StringBuilder sb2) {
        if (str == null || obj == null || (obj instanceof ContextData) || str.length() <= 0) {
            return;
        }
        if (!(obj instanceof String) || ((String) obj).length() > 0) {
            sb2.append("&");
            sb2.append(str);
            sb2.append("=");
            if (obj instanceof List) {
                sb2.append(UrlUtilities.urlEncode(join((List) obj, ",")));
            } else {
                sb2.append(UrlUtilities.urlEncode(obj.toString()));
            }
        }
    }

    public static void serializeToQueryString(Map<String, Object> map, StringBuilder sb2) {
        if (map == null) {
            return;
        }
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String strUrlEncode = UrlUtilities.urlEncode(entry.getKey());
            if (strUrlEncode != null) {
                Object value = entry.getValue();
                if (value instanceof ContextData) {
                    ContextData contextData = (ContextData) value;
                    Object obj = contextData.value;
                    if (obj != null) {
                        serializeKeyValuePair(strUrlEncode, obj, sb2);
                    }
                    Map<String, Object> map2 = contextData.data;
                    if (map2 != null && map2.size() > 0) {
                        sb2.append("&");
                        sb2.append(strUrlEncode);
                        sb2.append(Constant.DOT_STRING);
                        serializeToQueryString(contextData.data, sb2);
                        sb2.append("&.");
                        sb2.append(strUrlEncode);
                    }
                } else {
                    serializeKeyValuePair(strUrlEncode, value, sb2);
                }
            }
        }
    }

    public static ContextData translateContextData(Map<String, String> map) {
        ContextData contextData = new ContextData();
        for (Map.Entry<String, Object> entry : cleanContextDataDictionary(map).entrySet()) {
            String key = entry.getKey();
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                int iIndexOf = key.indexOf(46, i10);
                if (iIndexOf >= 0) {
                    arrayList.add(key.substring(i10, iIndexOf));
                    i10 = iIndexOf + 1;
                }
            }
            arrayList.add(key.substring(i10, key.length()));
            addValueToHashMap(entry.getValue(), contextData, arrayList, 0);
        }
        return contextData;
    }
}
