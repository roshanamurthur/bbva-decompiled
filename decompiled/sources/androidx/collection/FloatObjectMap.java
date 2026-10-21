package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import androidx.exifinterface.media.ExifInterface;
import com.bbva.ethermobilesdk.token.plugin.command.GenerateActivationFormCommand;
import com.bbva.securesharing.plugin.SecureSharingCommandFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mastercard.sonic.androidsvg.SVGParser;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: compiled from: FloatObjectMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J&\u0010\u0018\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u001bH\u0086\bø\u0001\u0000J\u0006\u0010\u001d\u001a\u00020\u0019J&\u0010\u001d\u001a\u00020\u00192\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u001bH\u0086\bø\u0001\u0000J\u0011\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001cH\u0086\u0002J\u000e\u0010 \u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001cJ\u0013\u0010!\u001a\u00020\u00192\u0006\u0010\"\u001a\u00028\u0000¢\u0006\u0002\u0010#J\u0006\u0010$\u001a\u00020\u0005J&\u0010$\u001a\u00020\u00052\u0018\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00190\u001bH\u0086\bø\u0001\u0000J\u0013\u0010%\u001a\u00020\u00192\b\u0010&\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\u0016\u0010'\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u001cH\u0080\b¢\u0006\u0002\b(JD\u0010)\u001a\u00020*26\u0010+\u001a2\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020*0\u001bH\u0086\bø\u0001\u0000J/\u0010.\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(0\u0012\u0004\u0012\u00020*0/H\u0081\bø\u0001\u0000J/\u00101\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020*0/H\u0086\bø\u0001\u0000J/\u00102\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020*0/H\u0086\bø\u0001\u0000J\u0018\u00103\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u001f\u001a\u00020\u001cH\u0086\u0002¢\u0006\u0002\u00104J\u001b\u00105\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u00106\u001a\u00028\u0000¢\u0006\u0002\u00107J'\u00108\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00020\u001c2\f\u00106\u001a\b\u0012\u0004\u0012\u00028\u000009H\u0086\bø\u0001\u0000¢\u0006\u0002\u0010:J\b\u0010;\u001a\u00020\u0005H\u0016J\u0006\u0010<\u001a\u00020\u0019J\u0006\u0010=\u001a\u00020\u0019J:\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020A2\b\b\u0002\u0010B\u001a\u00020A2\b\b\u0002\u0010C\u001a\u00020A2\b\b\u0002\u0010D\u001a\u00020\u00052\b\b\u0002\u0010E\u001a\u00020AH\u0007Jx\u0010>\u001a\u00020?2\b\b\u0002\u0010@\u001a\u00020A2\b\b\u0002\u0010B\u001a\u00020A2\b\b\u0002\u0010C\u001a\u00020A2\b\b\u0002\u0010D\u001a\u00020\u00052\b\b\u0002\u0010E\u001a\u00020A28\b\u0004\u0010F\u001a2\u0012\u0013\u0012\u00110\u001c¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\u001f\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\"\u0012\u0004\u0012\u00020A0\u001bH\u0087\bø\u0001\u0000J\u0006\u0010G\u001a\u00020\u0019J\b\u0010H\u001a\u00020?H\u0016R\u0018\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u0018\u0010\u0007\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\b\u0010\u0003R\u0011\u0010\t\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\r8\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u0003R\u0018\u0010\u000f\u001a\u00020\u00108\u0000@\u0000X\u0081\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0003R\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u000bR\"\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00158\u0000@\u0000X\u0081\u000e¢\u0006\n\n\u0002\u0010\u0017\u0012\u0004\b\u0016\u0010\u0003\u0082\u0001\u0001I\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006J"}, d2 = {"Landroidx/collection/FloatObjectMap;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "()V", "_capacity", "", "get_capacity$collection$annotations", "_size", "get_size$collection$annotations", "capacity", "getCapacity", "()I", "keys", "", "getKeys$annotations", "metadata", "", "getMetadata$annotations", "size", "getSize", "values", "", "getValues$annotations", "[Ljava/lang/Object;", SVGParser.XML_STYLESHEET_ATTR_MEDIA_ALL, "", "predicate", "Lkotlin/Function2;", "", "any", SecureSharingCommandFactory.ACTION_CONTAINS_VALUE, "key", "containsKey", "containsValue", "value", "(Ljava/lang/Object;)Z", "count", "equals", "other", "findKeyIndex", "findKeyIndex$collection", "forEach", "", "block", "Lkotlin/ParameterName;", "name", "forEachIndexed", "Lkotlin/Function1;", FirebaseAnalytics.Param.INDEX, "forEachKey", "forEachValue", "get", "(F)Ljava/lang/Object;", "getOrDefault", "defaultValue", "(FLjava/lang/Object;)Ljava/lang/Object;", "getOrElse", "Lkotlin/Function0;", "(FLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", GenerateActivationFormCommand.HASH_CODE, "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "Landroidx/collection/MutableFloatObjectMap;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFloatObjectMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatObjectMap.kt\nandroidx/collection/FloatObjectMap\n+ 2 FloatSet.kt\nandroidx/collection/FloatSetKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1018:1\n619#1:1019\n620#1:1023\n622#1,2:1025\n624#1,4:1028\n628#1:1035\n629#1:1039\n630#1:1041\n631#1,4:1044\n637#1:1049\n638#1,8:1051\n619#1:1059\n620#1:1063\n622#1,2:1065\n624#1,4:1068\n628#1:1075\n629#1:1079\n630#1:1081\n631#1,4:1084\n637#1:1089\n638#1,8:1091\n354#1,6:1101\n364#1,3:1108\n367#1,9:1112\n354#1,6:1121\n364#1,3:1128\n367#1,9:1132\n354#1,6:1141\n364#1,3:1148\n367#1,9:1152\n382#1,4:1161\n354#1,6:1165\n364#1,3:1172\n367#1,2:1176\n387#1,2:1178\n370#1,6:1180\n389#1:1186\n382#1,4:1187\n354#1,6:1191\n364#1,3:1198\n367#1,2:1202\n387#1,2:1204\n370#1,6:1206\n389#1:1212\n382#1,4:1213\n354#1,6:1217\n364#1,3:1224\n367#1,2:1228\n387#1,2:1230\n370#1,6:1232\n389#1:1238\n619#1:1239\n620#1:1243\n622#1,2:1245\n624#1,4:1248\n628#1:1255\n629#1:1259\n630#1:1261\n631#1,4:1264\n637#1:1269\n638#1,8:1271\n619#1:1279\n620#1:1283\n622#1,2:1285\n624#1,4:1288\n628#1:1295\n629#1:1299\n630#1:1301\n631#1,4:1304\n637#1:1309\n638#1,8:1311\n408#1,3:1319\n354#1,6:1322\n364#1,3:1329\n367#1,2:1333\n412#1,2:1335\n370#1,6:1337\n414#1:1343\n382#1,4:1344\n354#1,6:1348\n364#1,3:1355\n367#1,2:1359\n387#1,2:1361\n370#1,6:1363\n389#1:1369\n382#1,4:1370\n354#1,6:1374\n364#1,3:1381\n367#1,2:1385\n387#1,2:1387\n370#1,6:1389\n389#1:1395\n382#1,4:1396\n354#1,6:1400\n364#1,3:1407\n367#1,2:1411\n387#1,2:1413\n370#1,6:1415\n389#1:1421\n382#1,4:1422\n354#1,6:1426\n364#1,3:1433\n367#1,2:1437\n387#1,2:1439\n370#1,6:1441\n389#1:1447\n382#1,4:1448\n354#1,6:1452\n364#1,3:1459\n367#1,2:1463\n387#1,2:1465\n370#1,6:1467\n389#1:1473\n382#1,4:1474\n354#1,6:1478\n364#1,3:1485\n367#1,2:1489\n387#1,2:1491\n370#1,6:1493\n389#1:1499\n518#1,11:1516\n382#1,4:1527\n354#1,6:1531\n364#1,3:1538\n367#1,2:1542\n387#1:1544\n529#1,10:1545\n388#1:1555\n370#1,6:1556\n389#1:1562\n539#1,2:1563\n518#1,11:1565\n382#1,4:1576\n354#1,6:1580\n364#1,3:1587\n367#1,2:1591\n387#1:1593\n529#1,10:1594\n388#1:1604\n370#1,6:1605\n389#1:1611\n539#1,2:1612\n518#1,11:1614\n382#1,4:1625\n354#1,6:1629\n364#1,3:1636\n367#1,2:1640\n387#1:1642\n529#1,10:1643\n388#1:1653\n370#1,6:1654\n389#1:1660\n539#1,2:1661\n518#1,11:1663\n382#1,4:1674\n354#1,6:1678\n364#1,3:1685\n367#1,2:1689\n387#1:1691\n529#1,10:1692\n388#1:1702\n370#1,6:1703\n389#1:1709\n539#1,2:1710\n518#1,11:1712\n382#1,4:1723\n354#1,6:1727\n364#1,3:1734\n367#1,2:1738\n387#1:1740\n529#1,10:1741\n388#1:1751\n370#1,6:1752\n389#1:1758\n539#1,2:1759\n833#2,3:1020\n833#2,3:1060\n833#2,3:1240\n833#2,3:1280\n833#2,3:1500\n1603#3:1024\n1599#3:1027\n1779#3,3:1032\n1793#3,3:1036\n1717#3:1040\n1705#3:1042\n1699#3:1043\n1712#3:1048\n1802#3:1050\n1603#3:1064\n1599#3:1067\n1779#3,3:1072\n1793#3,3:1076\n1717#3:1080\n1705#3:1082\n1699#3:1083\n1712#3:1088\n1802#3:1090\n1810#3:1099\n1672#3:1100\n1810#3:1107\n1672#3:1111\n1810#3:1127\n1672#3:1131\n1810#3:1147\n1672#3:1151\n1810#3:1171\n1672#3:1175\n1810#3:1197\n1672#3:1201\n1810#3:1223\n1672#3:1227\n1603#3:1244\n1599#3:1247\n1779#3,3:1252\n1793#3,3:1256\n1717#3:1260\n1705#3:1262\n1699#3:1263\n1712#3:1268\n1802#3:1270\n1603#3:1284\n1599#3:1287\n1779#3,3:1292\n1793#3,3:1296\n1717#3:1300\n1705#3:1302\n1699#3:1303\n1712#3:1308\n1802#3:1310\n1810#3:1328\n1672#3:1332\n1810#3:1354\n1672#3:1358\n1810#3:1380\n1672#3:1384\n1810#3:1406\n1672#3:1410\n1810#3:1432\n1672#3:1436\n1810#3:1458\n1672#3:1462\n1810#3:1484\n1672#3:1488\n1603#3:1503\n1599#3:1504\n1779#3,3:1505\n1793#3,3:1508\n1717#3:1511\n1705#3:1512\n1699#3:1513\n1712#3:1514\n1802#3:1515\n1810#3:1537\n1672#3:1541\n1810#3:1586\n1672#3:1590\n1810#3:1635\n1672#3:1639\n1810#3:1684\n1672#3:1688\n1810#3:1733\n1672#3:1737\n*S KotlinDebug\n*F\n+ 1 FloatObjectMap.kt\nandroidx/collection/FloatObjectMap\n*L\n321#1:1019\n321#1:1023\n321#1:1025,2\n321#1:1028,4\n321#1:1035\n321#1:1039\n321#1:1041\n321#1:1044,4\n321#1:1049\n321#1:1051,8\n331#1:1059\n331#1:1063\n331#1:1065,2\n331#1:1068,4\n331#1:1075\n331#1:1079\n331#1:1081\n331#1:1084,4\n331#1:1089\n331#1:1091,8\n385#1:1101,6\n385#1:1108,3\n385#1:1112,9\n398#1:1121,6\n398#1:1128,3\n398#1:1132,9\n410#1:1141,6\n410#1:1148,3\n410#1:1152,9\n420#1:1161,4\n420#1:1165,6\n420#1:1172,3\n420#1:1176,2\n420#1:1178,2\n420#1:1180,6\n420#1:1186\n430#1:1187,4\n430#1:1191,6\n430#1:1198,3\n430#1:1202,2\n430#1:1204,2\n430#1:1206,6\n430#1:1212\n446#1:1213,4\n446#1:1217,6\n446#1:1224,3\n446#1:1228,2\n446#1:1230,2\n446#1:1232,6\n446#1:1238\n456#1:1239\n456#1:1243\n456#1:1245,2\n456#1:1248,4\n456#1:1255\n456#1:1259\n456#1:1261\n456#1:1264,4\n456#1:1269\n456#1:1271,8\n462#1:1279\n462#1:1283\n462#1:1285,2\n462#1:1288,4\n462#1:1295\n462#1:1299\n462#1:1301\n462#1:1304,4\n462#1:1309\n462#1:1311,8\n469#1:1319,3\n469#1:1322,6\n469#1:1329,3\n469#1:1333,2\n469#1:1335,2\n469#1:1337,6\n469#1:1343\n493#1:1344,4\n493#1:1348,6\n493#1:1355,3\n493#1:1359,2\n493#1:1361,2\n493#1:1363,6\n493#1:1369\n528#1:1370,4\n528#1:1374,6\n528#1:1381,3\n528#1:1385,2\n528#1:1387,2\n528#1:1389,6\n528#1:1395\n528#1:1396,4\n528#1:1400,6\n528#1:1407,3\n528#1:1411,2\n528#1:1413,2\n528#1:1415,6\n528#1:1421\n549#1:1422,4\n549#1:1426,6\n549#1:1433,3\n549#1:1437,2\n549#1:1439,2\n549#1:1441,6\n549#1:1447\n575#1:1448,4\n575#1:1452,6\n575#1:1459,3\n575#1:1463,2\n575#1:1465,2\n575#1:1467,6\n575#1:1473\n601#1:1474,4\n601#1:1478,6\n601#1:1485,3\n601#1:1489,2\n601#1:1491,2\n601#1:1493,6\n601#1:1499\n-1#1:1516,11\n-1#1:1527,4\n-1#1:1531,6\n-1#1:1538,3\n-1#1:1542,2\n-1#1:1544\n-1#1:1545,10\n-1#1:1555\n-1#1:1556,6\n-1#1:1562\n-1#1:1563,2\n-1#1:1565,11\n-1#1:1576,4\n-1#1:1580,6\n-1#1:1587,3\n-1#1:1591,2\n-1#1:1593\n-1#1:1594,10\n-1#1:1604\n-1#1:1605,6\n-1#1:1611\n-1#1:1612,2\n-1#1:1614,11\n-1#1:1625,4\n-1#1:1629,6\n-1#1:1636,3\n-1#1:1640,2\n-1#1:1642\n-1#1:1643,10\n-1#1:1653\n-1#1:1654,6\n-1#1:1660\n-1#1:1661,2\n-1#1:1663,11\n-1#1:1674,4\n-1#1:1678,6\n-1#1:1685,3\n-1#1:1689,2\n-1#1:1691\n-1#1:1692,10\n-1#1:1702\n-1#1:1703,6\n-1#1:1709\n-1#1:1710,2\n-1#1:1712,11\n-1#1:1723,4\n-1#1:1727,6\n-1#1:1734,3\n-1#1:1738,2\n-1#1:1740\n-1#1:1741,10\n-1#1:1751\n-1#1:1752,6\n-1#1:1758\n-1#1:1759,2\n321#1:1020,3\n331#1:1060,3\n456#1:1240,3\n462#1:1280,3\n619#1:1500,3\n321#1:1024\n321#1:1027\n321#1:1032,3\n321#1:1036,3\n321#1:1040\n321#1:1042\n321#1:1043\n321#1:1048\n321#1:1050\n331#1:1064\n331#1:1067\n331#1:1072,3\n331#1:1076,3\n331#1:1080\n331#1:1082\n331#1:1083\n331#1:1088\n331#1:1090\n359#1:1099\n366#1:1100\n385#1:1107\n385#1:1111\n398#1:1127\n398#1:1131\n410#1:1147\n410#1:1151\n420#1:1171\n420#1:1175\n430#1:1197\n430#1:1201\n446#1:1223\n446#1:1227\n456#1:1244\n456#1:1247\n456#1:1252,3\n456#1:1256,3\n456#1:1260\n456#1:1262\n456#1:1263\n456#1:1268\n456#1:1270\n462#1:1284\n462#1:1287\n462#1:1292,3\n462#1:1296,3\n462#1:1300\n462#1:1302\n462#1:1303\n462#1:1308\n462#1:1310\n469#1:1328\n469#1:1332\n493#1:1354\n493#1:1358\n528#1:1380\n528#1:1384\n528#1:1406\n528#1:1410\n549#1:1432\n549#1:1436\n575#1:1458\n575#1:1462\n601#1:1484\n601#1:1488\n620#1:1503\n623#1:1504\n627#1:1505,3\n628#1:1508,3\n629#1:1511\n630#1:1512\n630#1:1513\n634#1:1514\n637#1:1515\n-1#1:1537\n-1#1:1541\n-1#1:1586\n-1#1:1590\n-1#1:1635\n-1#1:1639\n-1#1:1684\n-1#1:1688\n-1#1:1733\n-1#1:1737\n*E\n"})
public abstract class FloatObjectMap<V> {

    @JvmField
    public int _capacity;

    @JvmField
    public int _size;

    @JvmField
    @NotNull
    public float[] keys;

    @JvmField
    @NotNull
    public long[] metadata;

    @JvmField
    @NotNull
    public Object[] values;

    public /* synthetic */ FloatObjectMap(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ String joinToString$default(FloatObjectMap floatObjectMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i11 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence5 = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence charSequence6 = (i11 & 4) == 0 ? charSequence3 : "";
        if ((i11 & 8) != 0) {
            i10 = -1;
        }
        int i12 = i10;
        if ((i11 & 16) != 0) {
            charSequence4 = "...";
        }
        return floatObjectMap.joinToString(charSequence, charSequence5, charSequence6, i12, charSequence4);
    }

    public final boolean all(@NotNull Function2<? super Float, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        if (!predicate.invoke(Float.valueOf(fArr[i13]), objArr[i13]).booleanValue()) {
                            return false;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final boolean contains(float key) {
        int iFloatToIntBits = Float.floatToIntBits(key) * ScatterMapKt.MurmurHashC1;
        int i10 = iFloatToIntBits ^ (iFloatToIntBits << 16);
        int i11 = i10 & 127;
        int i12 = this._capacity;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * ScatterMapKt.BitmaskLsb) ^ j10;
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros >= 0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    public final boolean containsKey(float key) {
        int iFloatToIntBits = Float.floatToIntBits(key) * ScatterMapKt.MurmurHashC1;
        int i10 = iFloatToIntBits ^ (iFloatToIntBits << 16);
        int i11 = i10 & 127;
        int i12 = this._capacity;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * ScatterMapKt.BitmaskLsb) ^ j10;
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros >= 0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return false;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x0045 A[LOOP:0: B:5:0x000b->B:18:0x0045, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0048 A[SYNTHETIC] */
    public final boolean containsValue(V value) {
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128 && Intrinsics.areEqual(value, objArr[(i10 << 3) + i12])) {
                            return true;
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return false;
    }

    public final int count() {
        return get_size();
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[LOOP:0: B:14:0x0027->B:33:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[EDGE_INSN: B:35:0x0078->B:34:0x0078 BREAK  A[LOOP:0: B:14:0x0027->B:33:0x0075], SYNTHETIC] */
    public boolean equals(@Nullable Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof FloatObjectMap)) {
            return false;
        }
        FloatObjectMap floatObjectMap = (FloatObjectMap) other;
        if (floatObjectMap.get_size() != get_size()) {
            return false;
        }
        float[] fArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            float f6 = fArr[i13];
                            Object obj = objArr[i13];
                            if (obj == null) {
                                if (floatObjectMap.get(f6) != null || !floatObjectMap.containsKey(f6)) {
                                    return false;
                                }
                            } else if (!Intrinsics.areEqual(obj, floatObjectMap.get(f6))) {
                                return false;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return true;
    }

    public final int findKeyIndex$collection(float key) {
        int iFloatToIntBits = Float.floatToIntBits(key) * ScatterMapKt.MurmurHashC1;
        int i10 = iFloatToIntBits ^ (iFloatToIntBits << 16);
        int i11 = i10 & 127;
        int i12 = this._capacity;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * ScatterMapKt.BitmaskLsb) ^ j10;
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
    }

    public final void forEach(@NotNull Function2<? super Float, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        block.invoke(Float.valueOf(fArr[i13]), objArr[i13]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @PublishedApi
    public final void forEachIndexed(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        c.a(i10 << 3, i12, block);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void forEachKey(@NotNull Function1<? super Float, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        float[] fArr = this.keys;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(Float.valueOf(fArr[(i10 << 3) + i12]));
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void forEachValue(@NotNull Function1<? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Nullable
    public final V get(float key) {
        int iNumberOfTrailingZeros;
        int iFloatToIntBits = Float.floatToIntBits(key) * ScatterMapKt.MurmurHashC1;
        int i10 = iFloatToIntBits ^ (iFloatToIntBits << 16);
        int i11 = i10 & 127;
        int i12 = this._capacity;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * ScatterMapKt.BitmaskLsb) ^ j10;
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return (V) this.values[iNumberOfTrailingZeros];
        }
        return null;
    }

    /* JADX INFO: renamed from: getCapacity, reason: from getter */
    public final int get_capacity() {
        return this._capacity;
    }

    public final V getOrDefault(float key, V defaultValue) {
        int iNumberOfTrailingZeros;
        int iFloatToIntBits = Float.floatToIntBits(key) * ScatterMapKt.MurmurHashC1;
        int i10 = iFloatToIntBits ^ (iFloatToIntBits << 16);
        int i11 = i10 & 127;
        int i12 = this._capacity;
        int i13 = (i10 >>> 7) & i12;
        int i14 = 0;
        loop0: while (true) {
            long[] jArr = this.metadata;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            long j10 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j11 = (((long) i11) * ScatterMapKt.BitmaskLsb) ^ j10;
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i13) & i12;
                if (this.keys[iNumberOfTrailingZeros] == key) {
                    break loop0;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i14 += 8;
            i13 = (i13 + i14) & i12;
        }
        return iNumberOfTrailingZeros >= 0 ? (V) this.values[iNumberOfTrailingZeros] : defaultValue;
    }

    public final V getOrElse(float key, @NotNull Function0<? extends V> defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        V v3 = get(key);
        return v3 == null ? defaultValue.invoke() : v3;
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final int get_size() {
        return this._size;
    }

    public int hashCode() {
        float[] fArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int iHashCode = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i11 << 3) + i13;
                            float f6 = fArr[i14];
                            Object obj = objArr[i14];
                            iHashCode += (obj != null ? obj.hashCode() : 0) ^ Float.floatToIntBits(f6);
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        return iHashCode;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    i10 = iHashCode;
                }
            }
        }
        return i10;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString() {
        return joinToString$default(this, null, null, null, 0, null, 31, null);
    }

    public final boolean none() {
        return this._size == 0;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x006e A[DONT_INVERT, PHI: r8
      0x006e: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0030, B:22:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0070 A[LOOP:0: B:9:0x0022->B:24:0x0070, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[EDGE_INSN: B:28:0x0073->B:25:0x0073 BREAK  A[LOOP:0: B:9:0x0022->B:24:0x0070], SYNTHETIC] */
    @NotNull
    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder("{");
        float[] fArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i10 != length) {
                        break;
                        break;
                    }
                    i10++;
                } else {
                    int i12 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j10) < 128) {
                            int i14 = (i10 << 3) + i13;
                            float f6 = fArr[i14];
                            Object obj = objArr[i14];
                            sb2.append(f6);
                            sb2.append("=");
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb2.append(obj);
                            i11++;
                            if (i11 < this._size) {
                                sb2.append(", ");
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                    if (i10 != length) {
                        break;
                    }
                    i10++;
                }
            }
        }
        return androidx.appcompat.app.i.b(sb2, AbstractJsonLexerKt.END_OBJ, "s.append('}').toString()");
    }

    public FloatObjectMap() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.keys = FloatSetKt.getEmptyFloatArray();
        this.values = ContainerHelpersKt.EMPTY_OBJECTS;
    }

    public static /* synthetic */ String joinToString$default(FloatObjectMap floatObjectMap, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i10, CharSequence charSequence4, Function2 function2, int i11, Object obj) {
        long[] jArr;
        int i12;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        CharSequence separator = (i11 & 1) != 0 ? ", " : charSequence;
        CharSequence prefix = (i11 & 2) != 0 ? "" : charSequence2;
        CharSequence postfix = (i11 & 4) == 0 ? charSequence3 : "";
        int i13 = (i11 & 8) != 0 ? -1 : i10;
        CharSequence charSequence5 = (i11 & 16) != 0 ? "..." : charSequence4;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        StringBuilder sbC = androidx.camera.core.impl.utils.c.c(charSequence5, "truncated", function2, "transform", prefix);
        float[] fArr = floatObjectMap.keys;
        Object[] objArr = floatObjectMap.values;
        long[] jArr2 = floatObjectMap.metadata;
        int length = jArr2.length - 2;
        if (length < 0) {
            sbC.append(postfix);
            break;
        }
        int i14 = 0;
        int i15 = 0;
        loop0: while (true) {
            long j10 = jArr2[i14];
            int i16 = i14;
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i17 = 8;
                int i18 = 8 - ((~(i16 - length)) >>> 31);
                int i19 = 0;
                while (i19 < i18) {
                    if ((j10 & 255) < 128) {
                        int i20 = (i16 << 3) + i19;
                        float f6 = fArr[i20];
                        Object obj2 = objArr[i20];
                        if (i15 == i13) {
                            sbC.append(charSequence5);
                            break loop0;
                        }
                        if (i15 != 0) {
                            sbC.append(separator);
                        }
                        sbC.append((CharSequence) function2.invoke(Float.valueOf(f6), obj2));
                        i15++;
                        i12 = 8;
                    } else {
                        i12 = i17;
                    }
                    j10 >>= i12;
                    i19++;
                    i17 = i12;
                    jArr2 = jArr2;
                }
                jArr = jArr2;
                if (i18 == i17) {
                }
                sbC.append(postfix);
                break;
            }
            jArr = jArr2;
            if (i16 == length) {
                sbC.append(postfix);
                break;
            }
            i14 = i16 + 1;
            jArr2 = jArr;
        }
        String string = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x005a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x005c A[LOOP:0: B:5:0x0016->B:18:0x005c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x005f A[SYNTHETIC] */
    public final boolean any(@NotNull Function2<? super Float, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i10 = 0;
            while (true) {
                long j10 = jArr[i10];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    for (int i12 = 0; i12 < i11; i12++) {
                        if ((255 & j10) < 128) {
                            int i13 = (i10 << 3) + i12;
                            if (predicate.invoke(Float.valueOf(fArr[i13]), objArr[i13]).booleanValue()) {
                                return true;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i11 == 8) {
                        if (i10 != length) {
                            i10++;
                        }
                    }
                } else if (i10 != length) {
                    i10++;
                }
            }
        }
        return false;
    }

    public final int count(@NotNull Function2<? super Float, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        float[] fArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        int i10 = 0;
        if (length >= 0) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                long j10 = jArr[i11];
                if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i13 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((255 & j10) < 128) {
                            int i15 = (i11 << 3) + i14;
                            if (predicate.invoke(Float.valueOf(fArr[i15]), objArr[i15]).booleanValue()) {
                                i12++;
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i13 != 8) {
                        return i12;
                    }
                }
                if (i11 != length) {
                    i11++;
                } else {
                    i10 = i12;
                }
            }
        }
        return i10;
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        return joinToString$default(this, separator, null, null, 0, null, 30, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return joinToString$default(this, separator, prefix, null, 0, null, 28, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, 0, null, 24, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int i10) {
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        return joinToString$default(this, separator, prefix, postfix, i10, null, 16, null);
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated) {
        float[] fArr;
        int i10;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        StringBuilder sbD = androidx.camera.core.impl.utils.b.d(postfix, "postfix", truncated, "truncated", prefix);
        float[] fArr2 = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sbD.append(postfix);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        float f6 = fArr2[i16];
                        Object obj = objArr[i16];
                        if (i12 == limit) {
                            sbD.append(truncated);
                            break loop0;
                        }
                        if (i12 != 0) {
                            sbD.append(separator);
                        }
                        sbD.append(f6);
                        sbD.append('=');
                        sbD.append(obj);
                        i12++;
                        i10 = 8;
                    } else {
                        i10 = i13;
                    }
                    j10 >>= i10;
                    i15++;
                    i13 = i10;
                    fArr2 = fArr2;
                }
                fArr = fArr2;
                if (i14 == i13) {
                }
                sbD.append(postfix);
                break;
            }
            fArr = fArr2;
            if (i11 == length) {
                sbD.append(postfix);
                break;
            }
            i11++;
            fArr2 = fArr;
        }
        String string = sbD.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @PublishedApi
    public static /* synthetic */ void getKeys$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getMetadata$annotations() {
    }

    @PublishedApi
    public static /* synthetic */ void getValues$annotations() {
    }

    public static /* synthetic */ void get_capacity$collection$annotations() {
    }

    public static /* synthetic */ void get_size$collection$annotations() {
    }

    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence postfix, int limit, @NotNull CharSequence truncated, @NotNull Function2<? super Float, ? super V, ? extends CharSequence> transform) {
        float[] fArr;
        CharSequence separator2 = separator;
        Intrinsics.checkNotNullParameter(separator2, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        Intrinsics.checkNotNullParameter(postfix, "postfix");
        StringBuilder sbC = androidx.camera.core.impl.utils.c.c(truncated, "truncated", transform, "transform", prefix);
        float[] fArr2 = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sbC.append(postfix);
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j10 = jArr[i10];
            int i12 = i10;
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i13 = 8 - ((~(i12 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((j10 & 255) < 128) {
                        int i15 = (i12 << 3) + i14;
                        float f6 = fArr2[i15];
                        Object obj = objArr[i15];
                        if (i11 == limit) {
                            sbC.append(truncated);
                            break loop0;
                        }
                        if (i11 != 0) {
                            sbC.append(separator2);
                        }
                        sbC.append(transform.invoke(Float.valueOf(f6), obj));
                        i11++;
                    }
                    j10 >>= 8;
                    i14++;
                    separator2 = separator;
                    fArr2 = fArr2;
                }
                fArr = fArr2;
                if (i13 == 8) {
                }
                sbC.append(postfix);
                break;
            }
            fArr = fArr2;
            if (i12 == length) {
                sbC.append(postfix);
                break;
            }
            i10 = i12 + 1;
            separator2 = separator;
            fArr2 = fArr;
        }
        String string = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0088 A[DONT_INVERT, PHI: r11
      0x0088: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x003c, B:20:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x008a A[LOOP:0: B:5:0x002b->B:22:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x008f A[SYNTHETIC] */
    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence charSequence, int i10, @NotNull Function2<? super Float, ? super V, ? extends CharSequence> function2) {
        int i11;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        StringBuilder sbC = androidx.camera.core.impl.utils.c.c(charSequence, "postfix", function2, "transform", prefix);
        float[] fArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sbC.append(charSequence);
            break;
        }
        int i12 = 0;
        int i13 = 0;
        loop0: while (true) {
            long j10 = jArr[i12];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i12 == length) {
                    sbC.append(charSequence);
                    break;
                }
                i12++;
            } else {
                int i14 = 8;
                int i15 = 8 - ((~(i12 - length)) >>> 31);
                int i16 = 0;
                while (i16 < i15) {
                    if ((j10 & 255) < 128) {
                        int i17 = (i12 << 3) + i16;
                        float f6 = fArr[i17];
                        Object obj = objArr[i17];
                        if (i13 == i10) {
                            sbC.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i13 != 0) {
                            sbC.append(separator);
                        }
                        sbC.append(function2.invoke(Float.valueOf(f6), obj));
                        i13++;
                        i11 = 8;
                    } else {
                        i11 = i14;
                    }
                    j10 >>= i11;
                    i16++;
                    i14 = i11;
                }
                if (i15 == i14) {
                    if (i12 == length) {
                        i12++;
                    }
                }
                sbC.append(charSequence);
                break;
            }
        }
        String string = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0087 A[DONT_INVERT, PHI: r11
      0x0087: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x003c, B:20:0x0085] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0089 A[LOOP:0: B:5:0x002b->B:22:0x0089, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x008e A[SYNTHETIC] */
    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence prefix, @NotNull CharSequence charSequence, @NotNull Function2<? super Float, ? super V, ? extends CharSequence> function2) {
        int i10;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        StringBuilder sbC = androidx.camera.core.impl.utils.c.c(charSequence, "postfix", function2, "transform", prefix);
        float[] fArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sbC.append(charSequence);
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i11 == length) {
                    sbC.append(charSequence);
                    break;
                }
                i11++;
            } else {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        float f6 = fArr[i16];
                        Object obj = objArr[i16];
                        if (i12 == -1) {
                            sbC.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sbC.append(separator);
                        }
                        sbC.append(function2.invoke(Float.valueOf(f6), obj));
                        i12++;
                        i10 = 8;
                    } else {
                        i10 = i13;
                    }
                    j10 >>= i10;
                    i15++;
                    i13 = i10;
                }
                if (i14 == i13) {
                    if (i11 == length) {
                        i11++;
                    }
                }
                sbC.append(charSequence);
                break;
            }
        }
        String string = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x007b A[DONT_INVERT, PHI: r10
      0x007b: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x0032, B:20:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x007d A[LOOP:0: B:5:0x0024->B:22:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0080 A[SYNTHETIC] */
    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull CharSequence charSequence, @NotNull Function2<? super Float, ? super V, ? extends CharSequence> function2) {
        int i10;
        Intrinsics.checkNotNullParameter(separator, "separator");
        StringBuilder sbC = androidx.camera.core.impl.utils.c.c(charSequence, "prefix", function2, "transform", charSequence);
        float[] fArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sbC.append((CharSequence) "");
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i11 == length) {
                    sbC.append((CharSequence) "");
                    break;
                }
                i11++;
            } else {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        float f6 = fArr[i16];
                        Object obj = objArr[i16];
                        if (i12 == -1) {
                            sbC.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sbC.append(separator);
                        }
                        sbC.append(function2.invoke(Float.valueOf(f6), obj));
                        i12++;
                        i10 = 8;
                    } else {
                        i10 = i13;
                    }
                    j10 >>= i10;
                    i15++;
                    i13 = i10;
                }
                if (i14 == i13) {
                    if (i11 == length) {
                        i11++;
                    }
                }
                sbC.append((CharSequence) "");
                break;
            }
        }
        String string = sbC.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0082 A[DONT_INVERT, PHI: r11
      0x0082: PHI (r11v2 int) = (r11v1 int), (r11v3 int) binds: [B:6:0x0037, B:20:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0084 A[LOOP:0: B:5:0x0026->B:22:0x0084, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0089 A[SYNTHETIC] */
    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull CharSequence separator, @NotNull Function2<? super Float, ? super V, ? extends CharSequence> transform) {
        int i10;
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder("");
        float[] fArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i11 == length) {
                    sb2.append((CharSequence) "");
                    break;
                }
                i11++;
            } else {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        float f6 = fArr[i16];
                        Object obj = objArr[i16];
                        if (i12 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append(separator);
                        }
                        sb2.append(transform.invoke(Float.valueOf(f6), obj));
                        i12++;
                        i10 = 8;
                    } else {
                        i10 = i13;
                    }
                    j10 >>= i10;
                    i15++;
                    i13 = i10;
                }
                if (i14 == i13) {
                    if (i11 == length) {
                        i11++;
                    }
                }
                sb2.append((CharSequence) "");
                break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0077 A[DONT_INVERT, PHI: r10
      0x0077: PHI (r10v2 int) = (r10v1 int), (r10v3 int) binds: [B:6:0x002c, B:20:0x0075] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0079 A[LOOP:0: B:5:0x001e->B:22:0x0079, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x007c A[SYNTHETIC] */
    @JvmOverloads
    @NotNull
    public final String joinToString(@NotNull Function2<? super Float, ? super V, ? extends CharSequence> transform) {
        int i10;
        Intrinsics.checkNotNullParameter(transform, "transform");
        StringBuilder sb2 = new StringBuilder("");
        float[] fArr = this.keys;
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            sb2.append((CharSequence) "");
            break;
        }
        int i11 = 0;
        int i12 = 0;
        loop0: while (true) {
            long j10 = jArr[i11];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) == -9187201950435737472L) {
                if (i11 == length) {
                    sb2.append((CharSequence) "");
                    break;
                }
                i11++;
            } else {
                int i13 = 8;
                int i14 = 8 - ((~(i11 - length)) >>> 31);
                int i15 = 0;
                while (i15 < i14) {
                    if ((j10 & 255) < 128) {
                        int i16 = (i11 << 3) + i15;
                        float f6 = fArr[i16];
                        Object obj = objArr[i16];
                        if (i12 == -1) {
                            sb2.append((CharSequence) "...");
                            break loop0;
                        }
                        if (i12 != 0) {
                            sb2.append((CharSequence) ", ");
                        }
                        sb2.append(transform.invoke(Float.valueOf(f6), obj));
                        i12++;
                        i10 = 8;
                    } else {
                        i10 = i13;
                    }
                    j10 >>= i10;
                    i15++;
                    i13 = i10;
                }
                if (i14 == i13) {
                    if (i11 == length) {
                        i11++;
                    }
                }
                sb2.append((CharSequence) "");
                break;
            }
        }
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
