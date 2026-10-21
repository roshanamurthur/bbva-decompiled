package com.google.android.gms.measurement.internal;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.salesforce.marketingcloud.notifications.NotificationMessage;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlinx.coroutines.DebugKt;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* JADX INFO: loaded from: classes9.dex */
final class zzge implements Callable {
    final /* synthetic */ zzau zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzgj zzc;

    public zzge(zzgj zzgjVar, zzau zzauVar, String str) {
        this.zzc = zzgjVar;
        this.zza = zzauVar;
        this.zzb = str;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0350 A[Catch: all -> 0x00a7, LOOP:2: B:101:0x034a->B:103:0x0350, LOOP_END, TryCatch #2 {all -> 0x00a7, blocks: (B:11:0x007f, B:13:0x008b, B:18:0x00aa, B:20:0x00b0, B:22:0x00c4, B:24:0x00db, B:25:0x00e2, B:27:0x00ec, B:28:0x00f9, B:30:0x0103, B:31:0x0110, B:33:0x011b, B:34:0x0123, B:36:0x013f, B:40:0x014c, B:42:0x0161, B:44:0x0171, B:46:0x0179, B:48:0x017f, B:49:0x0182, B:51:0x0191, B:53:0x01a5, B:55:0x01af, B:56:0x01c0, B:58:0x01c4, B:60:0x01cf, B:62:0x01e8, B:63:0x021f, B:65:0x0227, B:67:0x022d, B:71:0x0248, B:73:0x0252, B:74:0x025f, B:75:0x0271, B:77:0x0277, B:83:0x028d, B:86:0x02b8, B:88:0x02db, B:90:0x02e8, B:92:0x02f4, B:93:0x0307, B:95:0x030d, B:97:0x031f, B:99:0x0325, B:100:0x0343, B:101:0x034a, B:103:0x0350, B:104:0x0388, B:106:0x03ef, B:107:0x0409, B:109:0x0417, B:111:0x0462, B:112:0x0497, B:114:0x049d, B:116:0x04b0, B:117:0x04bd, B:119:0x0509, B:120:0x0517, B:122:0x051f, B:123:0x0522, B:125:0x052a, B:128:0x0533, B:127:0x0530, B:110:0x044d, B:85:0x0291, B:134:0x05ba, B:37:0x0143, B:39:0x0149), top: B:143:0x007f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:106:0x03ef A[Catch: all -> 0x00a7, TryCatch #2 {all -> 0x00a7, blocks: (B:11:0x007f, B:13:0x008b, B:18:0x00aa, B:20:0x00b0, B:22:0x00c4, B:24:0x00db, B:25:0x00e2, B:27:0x00ec, B:28:0x00f9, B:30:0x0103, B:31:0x0110, B:33:0x011b, B:34:0x0123, B:36:0x013f, B:40:0x014c, B:42:0x0161, B:44:0x0171, B:46:0x0179, B:48:0x017f, B:49:0x0182, B:51:0x0191, B:53:0x01a5, B:55:0x01af, B:56:0x01c0, B:58:0x01c4, B:60:0x01cf, B:62:0x01e8, B:63:0x021f, B:65:0x0227, B:67:0x022d, B:71:0x0248, B:73:0x0252, B:74:0x025f, B:75:0x0271, B:77:0x0277, B:83:0x028d, B:86:0x02b8, B:88:0x02db, B:90:0x02e8, B:92:0x02f4, B:93:0x0307, B:95:0x030d, B:97:0x031f, B:99:0x0325, B:100:0x0343, B:101:0x034a, B:103:0x0350, B:104:0x0388, B:106:0x03ef, B:107:0x0409, B:109:0x0417, B:111:0x0462, B:112:0x0497, B:114:0x049d, B:116:0x04b0, B:117:0x04bd, B:119:0x0509, B:120:0x0517, B:122:0x051f, B:123:0x0522, B:125:0x052a, B:128:0x0533, B:127:0x0530, B:110:0x044d, B:85:0x0291, B:134:0x05ba, B:37:0x0143, B:39:0x0149), top: B:143:0x007f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0417 A[Catch: all -> 0x00a7, TryCatch #2 {all -> 0x00a7, blocks: (B:11:0x007f, B:13:0x008b, B:18:0x00aa, B:20:0x00b0, B:22:0x00c4, B:24:0x00db, B:25:0x00e2, B:27:0x00ec, B:28:0x00f9, B:30:0x0103, B:31:0x0110, B:33:0x011b, B:34:0x0123, B:36:0x013f, B:40:0x014c, B:42:0x0161, B:44:0x0171, B:46:0x0179, B:48:0x017f, B:49:0x0182, B:51:0x0191, B:53:0x01a5, B:55:0x01af, B:56:0x01c0, B:58:0x01c4, B:60:0x01cf, B:62:0x01e8, B:63:0x021f, B:65:0x0227, B:67:0x022d, B:71:0x0248, B:73:0x0252, B:74:0x025f, B:75:0x0271, B:77:0x0277, B:83:0x028d, B:86:0x02b8, B:88:0x02db, B:90:0x02e8, B:92:0x02f4, B:93:0x0307, B:95:0x030d, B:97:0x031f, B:99:0x0325, B:100:0x0343, B:101:0x034a, B:103:0x0350, B:104:0x0388, B:106:0x03ef, B:107:0x0409, B:109:0x0417, B:111:0x0462, B:112:0x0497, B:114:0x049d, B:116:0x04b0, B:117:0x04bd, B:119:0x0509, B:120:0x0517, B:122:0x051f, B:123:0x0522, B:125:0x052a, B:128:0x0533, B:127:0x0530, B:110:0x044d, B:85:0x0291, B:134:0x05ba, B:37:0x0143, B:39:0x0149), top: B:143:0x007f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:110:0x044d A[Catch: all -> 0x00a7, TryCatch #2 {all -> 0x00a7, blocks: (B:11:0x007f, B:13:0x008b, B:18:0x00aa, B:20:0x00b0, B:22:0x00c4, B:24:0x00db, B:25:0x00e2, B:27:0x00ec, B:28:0x00f9, B:30:0x0103, B:31:0x0110, B:33:0x011b, B:34:0x0123, B:36:0x013f, B:40:0x014c, B:42:0x0161, B:44:0x0171, B:46:0x0179, B:48:0x017f, B:49:0x0182, B:51:0x0191, B:53:0x01a5, B:55:0x01af, B:56:0x01c0, B:58:0x01c4, B:60:0x01cf, B:62:0x01e8, B:63:0x021f, B:65:0x0227, B:67:0x022d, B:71:0x0248, B:73:0x0252, B:74:0x025f, B:75:0x0271, B:77:0x0277, B:83:0x028d, B:86:0x02b8, B:88:0x02db, B:90:0x02e8, B:92:0x02f4, B:93:0x0307, B:95:0x030d, B:97:0x031f, B:99:0x0325, B:100:0x0343, B:101:0x034a, B:103:0x0350, B:104:0x0388, B:106:0x03ef, B:107:0x0409, B:109:0x0417, B:111:0x0462, B:112:0x0497, B:114:0x049d, B:116:0x04b0, B:117:0x04bd, B:119:0x0509, B:120:0x0517, B:122:0x051f, B:123:0x0522, B:125:0x052a, B:128:0x0533, B:127:0x0530, B:110:0x044d, B:85:0x0291, B:134:0x05ba, B:37:0x0143, B:39:0x0149), top: B:143:0x007f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:114:0x049d A[Catch: all -> 0x00a7, TryCatch #2 {all -> 0x00a7, blocks: (B:11:0x007f, B:13:0x008b, B:18:0x00aa, B:20:0x00b0, B:22:0x00c4, B:24:0x00db, B:25:0x00e2, B:27:0x00ec, B:28:0x00f9, B:30:0x0103, B:31:0x0110, B:33:0x011b, B:34:0x0123, B:36:0x013f, B:40:0x014c, B:42:0x0161, B:44:0x0171, B:46:0x0179, B:48:0x017f, B:49:0x0182, B:51:0x0191, B:53:0x01a5, B:55:0x01af, B:56:0x01c0, B:58:0x01c4, B:60:0x01cf, B:62:0x01e8, B:63:0x021f, B:65:0x0227, B:67:0x022d, B:71:0x0248, B:73:0x0252, B:74:0x025f, B:75:0x0271, B:77:0x0277, B:83:0x028d, B:86:0x02b8, B:88:0x02db, B:90:0x02e8, B:92:0x02f4, B:93:0x0307, B:95:0x030d, B:97:0x031f, B:99:0x0325, B:100:0x0343, B:101:0x034a, B:103:0x0350, B:104:0x0388, B:106:0x03ef, B:107:0x0409, B:109:0x0417, B:111:0x0462, B:112:0x0497, B:114:0x049d, B:116:0x04b0, B:117:0x04bd, B:119:0x0509, B:120:0x0517, B:122:0x051f, B:123:0x0522, B:125:0x052a, B:128:0x0533, B:127:0x0530, B:110:0x044d, B:85:0x0291, B:134:0x05ba, B:37:0x0143, B:39:0x0149), top: B:143:0x007f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:119:0x0509 A[Catch: all -> 0x00a7, TryCatch #2 {all -> 0x00a7, blocks: (B:11:0x007f, B:13:0x008b, B:18:0x00aa, B:20:0x00b0, B:22:0x00c4, B:24:0x00db, B:25:0x00e2, B:27:0x00ec, B:28:0x00f9, B:30:0x0103, B:31:0x0110, B:33:0x011b, B:34:0x0123, B:36:0x013f, B:40:0x014c, B:42:0x0161, B:44:0x0171, B:46:0x0179, B:48:0x017f, B:49:0x0182, B:51:0x0191, B:53:0x01a5, B:55:0x01af, B:56:0x01c0, B:58:0x01c4, B:60:0x01cf, B:62:0x01e8, B:63:0x021f, B:65:0x0227, B:67:0x022d, B:71:0x0248, B:73:0x0252, B:74:0x025f, B:75:0x0271, B:77:0x0277, B:83:0x028d, B:86:0x02b8, B:88:0x02db, B:90:0x02e8, B:92:0x02f4, B:93:0x0307, B:95:0x030d, B:97:0x031f, B:99:0x0325, B:100:0x0343, B:101:0x034a, B:103:0x0350, B:104:0x0388, B:106:0x03ef, B:107:0x0409, B:109:0x0417, B:111:0x0462, B:112:0x0497, B:114:0x049d, B:116:0x04b0, B:117:0x04bd, B:119:0x0509, B:120:0x0517, B:122:0x051f, B:123:0x0522, B:125:0x052a, B:128:0x0533, B:127:0x0530, B:110:0x044d, B:85:0x0291, B:134:0x05ba, B:37:0x0143, B:39:0x0149), top: B:143:0x007f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:122:0x051f A[Catch: all -> 0x00a7, TryCatch #2 {all -> 0x00a7, blocks: (B:11:0x007f, B:13:0x008b, B:18:0x00aa, B:20:0x00b0, B:22:0x00c4, B:24:0x00db, B:25:0x00e2, B:27:0x00ec, B:28:0x00f9, B:30:0x0103, B:31:0x0110, B:33:0x011b, B:34:0x0123, B:36:0x013f, B:40:0x014c, B:42:0x0161, B:44:0x0171, B:46:0x0179, B:48:0x017f, B:49:0x0182, B:51:0x0191, B:53:0x01a5, B:55:0x01af, B:56:0x01c0, B:58:0x01c4, B:60:0x01cf, B:62:0x01e8, B:63:0x021f, B:65:0x0227, B:67:0x022d, B:71:0x0248, B:73:0x0252, B:74:0x025f, B:75:0x0271, B:77:0x0277, B:83:0x028d, B:86:0x02b8, B:88:0x02db, B:90:0x02e8, B:92:0x02f4, B:93:0x0307, B:95:0x030d, B:97:0x031f, B:99:0x0325, B:100:0x0343, B:101:0x034a, B:103:0x0350, B:104:0x0388, B:106:0x03ef, B:107:0x0409, B:109:0x0417, B:111:0x0462, B:112:0x0497, B:114:0x049d, B:116:0x04b0, B:117:0x04bd, B:119:0x0509, B:120:0x0517, B:122:0x051f, B:123:0x0522, B:125:0x052a, B:128:0x0533, B:127:0x0530, B:110:0x044d, B:85:0x0291, B:134:0x05ba, B:37:0x0143, B:39:0x0149), top: B:143:0x007f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:125:0x052a A[Catch: all -> 0x00a7, TryCatch #2 {all -> 0x00a7, blocks: (B:11:0x007f, B:13:0x008b, B:18:0x00aa, B:20:0x00b0, B:22:0x00c4, B:24:0x00db, B:25:0x00e2, B:27:0x00ec, B:28:0x00f9, B:30:0x0103, B:31:0x0110, B:33:0x011b, B:34:0x0123, B:36:0x013f, B:40:0x014c, B:42:0x0161, B:44:0x0171, B:46:0x0179, B:48:0x017f, B:49:0x0182, B:51:0x0191, B:53:0x01a5, B:55:0x01af, B:56:0x01c0, B:58:0x01c4, B:60:0x01cf, B:62:0x01e8, B:63:0x021f, B:65:0x0227, B:67:0x022d, B:71:0x0248, B:73:0x0252, B:74:0x025f, B:75:0x0271, B:77:0x0277, B:83:0x028d, B:86:0x02b8, B:88:0x02db, B:90:0x02e8, B:92:0x02f4, B:93:0x0307, B:95:0x030d, B:97:0x031f, B:99:0x0325, B:100:0x0343, B:101:0x034a, B:103:0x0350, B:104:0x0388, B:106:0x03ef, B:107:0x0409, B:109:0x0417, B:111:0x0462, B:112:0x0497, B:114:0x049d, B:116:0x04b0, B:117:0x04bd, B:119:0x0509, B:120:0x0517, B:122:0x051f, B:123:0x0522, B:125:0x052a, B:128:0x0533, B:127:0x0530, B:110:0x044d, B:85:0x0291, B:134:0x05ba, B:37:0x0143, B:39:0x0149), top: B:143:0x007f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x052e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:127:0x0530 A[Catch: all -> 0x00a7, TryCatch #2 {all -> 0x00a7, blocks: (B:11:0x007f, B:13:0x008b, B:18:0x00aa, B:20:0x00b0, B:22:0x00c4, B:24:0x00db, B:25:0x00e2, B:27:0x00ec, B:28:0x00f9, B:30:0x0103, B:31:0x0110, B:33:0x011b, B:34:0x0123, B:36:0x013f, B:40:0x014c, B:42:0x0161, B:44:0x0171, B:46:0x0179, B:48:0x017f, B:49:0x0182, B:51:0x0191, B:53:0x01a5, B:55:0x01af, B:56:0x01c0, B:58:0x01c4, B:60:0x01cf, B:62:0x01e8, B:63:0x021f, B:65:0x0227, B:67:0x022d, B:71:0x0248, B:73:0x0252, B:74:0x025f, B:75:0x0271, B:77:0x0277, B:83:0x028d, B:86:0x02b8, B:88:0x02db, B:90:0x02e8, B:92:0x02f4, B:93:0x0307, B:95:0x030d, B:97:0x031f, B:99:0x0325, B:100:0x0343, B:101:0x034a, B:103:0x0350, B:104:0x0388, B:106:0x03ef, B:107:0x0409, B:109:0x0417, B:111:0x0462, B:112:0x0497, B:114:0x049d, B:116:0x04b0, B:117:0x04bd, B:119:0x0509, B:120:0x0517, B:122:0x051f, B:123:0x0522, B:125:0x052a, B:128:0x0533, B:127:0x0530, B:110:0x044d, B:85:0x0291, B:134:0x05ba, B:37:0x0143, B:39:0x0149), top: B:143:0x007f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x0288 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:149:0x031f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x04b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x0497 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x01e8 A[Catch: all -> 0x00a7, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x00a7, blocks: (B:11:0x007f, B:13:0x008b, B:18:0x00aa, B:20:0x00b0, B:22:0x00c4, B:24:0x00db, B:25:0x00e2, B:27:0x00ec, B:28:0x00f9, B:30:0x0103, B:31:0x0110, B:33:0x011b, B:34:0x0123, B:36:0x013f, B:40:0x014c, B:42:0x0161, B:44:0x0171, B:46:0x0179, B:48:0x017f, B:49:0x0182, B:51:0x0191, B:53:0x01a5, B:55:0x01af, B:56:0x01c0, B:58:0x01c4, B:60:0x01cf, B:62:0x01e8, B:63:0x021f, B:65:0x0227, B:67:0x022d, B:71:0x0248, B:73:0x0252, B:74:0x025f, B:75:0x0271, B:77:0x0277, B:83:0x028d, B:86:0x02b8, B:88:0x02db, B:90:0x02e8, B:92:0x02f4, B:93:0x0307, B:95:0x030d, B:97:0x031f, B:99:0x0325, B:100:0x0343, B:101:0x034a, B:103:0x0350, B:104:0x0388, B:106:0x03ef, B:107:0x0409, B:109:0x0417, B:111:0x0462, B:112:0x0497, B:114:0x049d, B:116:0x04b0, B:117:0x04bd, B:119:0x0509, B:120:0x0517, B:122:0x051f, B:123:0x0522, B:125:0x052a, B:128:0x0533, B:127:0x0530, B:110:0x044d, B:85:0x0291, B:134:0x05ba, B:37:0x0143, B:39:0x0149), top: B:143:0x007f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0227 A[Catch: all -> 0x00a7, SecurityException -> 0x0245, TryCatch #0 {SecurityException -> 0x0245, blocks: (B:63:0x021f, B:65:0x0227, B:67:0x022d), top: B:139:0x021f, outer: #2 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x0252 A[Catch: all -> 0x00a7, TryCatch #2 {all -> 0x00a7, blocks: (B:11:0x007f, B:13:0x008b, B:18:0x00aa, B:20:0x00b0, B:22:0x00c4, B:24:0x00db, B:25:0x00e2, B:27:0x00ec, B:28:0x00f9, B:30:0x0103, B:31:0x0110, B:33:0x011b, B:34:0x0123, B:36:0x013f, B:40:0x014c, B:42:0x0161, B:44:0x0171, B:46:0x0179, B:48:0x017f, B:49:0x0182, B:51:0x0191, B:53:0x01a5, B:55:0x01af, B:56:0x01c0, B:58:0x01c4, B:60:0x01cf, B:62:0x01e8, B:63:0x021f, B:65:0x0227, B:67:0x022d, B:71:0x0248, B:73:0x0252, B:74:0x025f, B:75:0x0271, B:77:0x0277, B:83:0x028d, B:86:0x02b8, B:88:0x02db, B:90:0x02e8, B:92:0x02f4, B:93:0x0307, B:95:0x030d, B:97:0x031f, B:99:0x0325, B:100:0x0343, B:101:0x034a, B:103:0x0350, B:104:0x0388, B:106:0x03ef, B:107:0x0409, B:109:0x0417, B:111:0x0462, B:112:0x0497, B:114:0x049d, B:116:0x04b0, B:117:0x04bd, B:119:0x0509, B:120:0x0517, B:122:0x051f, B:123:0x0522, B:125:0x052a, B:128:0x0533, B:127:0x0530, B:110:0x044d, B:85:0x0291, B:134:0x05ba, B:37:0x0143, B:39:0x0149), top: B:143:0x007f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0277 A[Catch: all -> 0x00a7, TryCatch #2 {all -> 0x00a7, blocks: (B:11:0x007f, B:13:0x008b, B:18:0x00aa, B:20:0x00b0, B:22:0x00c4, B:24:0x00db, B:25:0x00e2, B:27:0x00ec, B:28:0x00f9, B:30:0x0103, B:31:0x0110, B:33:0x011b, B:34:0x0123, B:36:0x013f, B:40:0x014c, B:42:0x0161, B:44:0x0171, B:46:0x0179, B:48:0x017f, B:49:0x0182, B:51:0x0191, B:53:0x01a5, B:55:0x01af, B:56:0x01c0, B:58:0x01c4, B:60:0x01cf, B:62:0x01e8, B:63:0x021f, B:65:0x0227, B:67:0x022d, B:71:0x0248, B:73:0x0252, B:74:0x025f, B:75:0x0271, B:77:0x0277, B:83:0x028d, B:86:0x02b8, B:88:0x02db, B:90:0x02e8, B:92:0x02f4, B:93:0x0307, B:95:0x030d, B:97:0x031f, B:99:0x0325, B:100:0x0343, B:101:0x034a, B:103:0x0350, B:104:0x0388, B:106:0x03ef, B:107:0x0409, B:109:0x0417, B:111:0x0462, B:112:0x0497, B:114:0x049d, B:116:0x04b0, B:117:0x04bd, B:119:0x0509, B:120:0x0517, B:122:0x051f, B:123:0x0522, B:125:0x052a, B:128:0x0533, B:127:0x0530, B:110:0x044d, B:85:0x0291, B:134:0x05ba, B:37:0x0143, B:39:0x0149), top: B:143:0x007f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:83:0x028d A[Catch: all -> 0x00a7, TryCatch #2 {all -> 0x00a7, blocks: (B:11:0x007f, B:13:0x008b, B:18:0x00aa, B:20:0x00b0, B:22:0x00c4, B:24:0x00db, B:25:0x00e2, B:27:0x00ec, B:28:0x00f9, B:30:0x0103, B:31:0x0110, B:33:0x011b, B:34:0x0123, B:36:0x013f, B:40:0x014c, B:42:0x0161, B:44:0x0171, B:46:0x0179, B:48:0x017f, B:49:0x0182, B:51:0x0191, B:53:0x01a5, B:55:0x01af, B:56:0x01c0, B:58:0x01c4, B:60:0x01cf, B:62:0x01e8, B:63:0x021f, B:65:0x0227, B:67:0x022d, B:71:0x0248, B:73:0x0252, B:74:0x025f, B:75:0x0271, B:77:0x0277, B:83:0x028d, B:86:0x02b8, B:88:0x02db, B:90:0x02e8, B:92:0x02f4, B:93:0x0307, B:95:0x030d, B:97:0x031f, B:99:0x0325, B:100:0x0343, B:101:0x034a, B:103:0x0350, B:104:0x0388, B:106:0x03ef, B:107:0x0409, B:109:0x0417, B:111:0x0462, B:112:0x0497, B:114:0x049d, B:116:0x04b0, B:117:0x04bd, B:119:0x0509, B:120:0x0517, B:122:0x051f, B:123:0x0522, B:125:0x052a, B:128:0x0533, B:127:0x0530, B:110:0x044d, B:85:0x0291, B:134:0x05ba, B:37:0x0143, B:39:0x0149), top: B:143:0x007f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x0291 A[Catch: all -> 0x00a7, TryCatch #2 {all -> 0x00a7, blocks: (B:11:0x007f, B:13:0x008b, B:18:0x00aa, B:20:0x00b0, B:22:0x00c4, B:24:0x00db, B:25:0x00e2, B:27:0x00ec, B:28:0x00f9, B:30:0x0103, B:31:0x0110, B:33:0x011b, B:34:0x0123, B:36:0x013f, B:40:0x014c, B:42:0x0161, B:44:0x0171, B:46:0x0179, B:48:0x017f, B:49:0x0182, B:51:0x0191, B:53:0x01a5, B:55:0x01af, B:56:0x01c0, B:58:0x01c4, B:60:0x01cf, B:62:0x01e8, B:63:0x021f, B:65:0x0227, B:67:0x022d, B:71:0x0248, B:73:0x0252, B:74:0x025f, B:75:0x0271, B:77:0x0277, B:83:0x028d, B:86:0x02b8, B:88:0x02db, B:90:0x02e8, B:92:0x02f4, B:93:0x0307, B:95:0x030d, B:97:0x031f, B:99:0x0325, B:100:0x0343, B:101:0x034a, B:103:0x0350, B:104:0x0388, B:106:0x03ef, B:107:0x0409, B:109:0x0417, B:111:0x0462, B:112:0x0497, B:114:0x049d, B:116:0x04b0, B:117:0x04bd, B:119:0x0509, B:120:0x0517, B:122:0x051f, B:123:0x0522, B:125:0x052a, B:128:0x0533, B:127:0x0530, B:110:0x044d, B:85:0x0291, B:134:0x05ba, B:37:0x0143, B:39:0x0149), top: B:143:0x007f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:88:0x02db A[Catch: all -> 0x00a7, TryCatch #2 {all -> 0x00a7, blocks: (B:11:0x007f, B:13:0x008b, B:18:0x00aa, B:20:0x00b0, B:22:0x00c4, B:24:0x00db, B:25:0x00e2, B:27:0x00ec, B:28:0x00f9, B:30:0x0103, B:31:0x0110, B:33:0x011b, B:34:0x0123, B:36:0x013f, B:40:0x014c, B:42:0x0161, B:44:0x0171, B:46:0x0179, B:48:0x017f, B:49:0x0182, B:51:0x0191, B:53:0x01a5, B:55:0x01af, B:56:0x01c0, B:58:0x01c4, B:60:0x01cf, B:62:0x01e8, B:63:0x021f, B:65:0x0227, B:67:0x022d, B:71:0x0248, B:73:0x0252, B:74:0x025f, B:75:0x0271, B:77:0x0277, B:83:0x028d, B:86:0x02b8, B:88:0x02db, B:90:0x02e8, B:92:0x02f4, B:93:0x0307, B:95:0x030d, B:97:0x031f, B:99:0x0325, B:100:0x0343, B:101:0x034a, B:103:0x0350, B:104:0x0388, B:106:0x03ef, B:107:0x0409, B:109:0x0417, B:111:0x0462, B:112:0x0497, B:114:0x049d, B:116:0x04b0, B:117:0x04bd, B:119:0x0509, B:120:0x0517, B:122:0x051f, B:123:0x0522, B:125:0x052a, B:128:0x0533, B:127:0x0530, B:110:0x044d, B:85:0x0291, B:134:0x05ba, B:37:0x0143, B:39:0x0149), top: B:143:0x007f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x02e8 A[Catch: all -> 0x00a7, TryCatch #2 {all -> 0x00a7, blocks: (B:11:0x007f, B:13:0x008b, B:18:0x00aa, B:20:0x00b0, B:22:0x00c4, B:24:0x00db, B:25:0x00e2, B:27:0x00ec, B:28:0x00f9, B:30:0x0103, B:31:0x0110, B:33:0x011b, B:34:0x0123, B:36:0x013f, B:40:0x014c, B:42:0x0161, B:44:0x0171, B:46:0x0179, B:48:0x017f, B:49:0x0182, B:51:0x0191, B:53:0x01a5, B:55:0x01af, B:56:0x01c0, B:58:0x01c4, B:60:0x01cf, B:62:0x01e8, B:63:0x021f, B:65:0x0227, B:67:0x022d, B:71:0x0248, B:73:0x0252, B:74:0x025f, B:75:0x0271, B:77:0x0277, B:83:0x028d, B:86:0x02b8, B:88:0x02db, B:90:0x02e8, B:92:0x02f4, B:93:0x0307, B:95:0x030d, B:97:0x031f, B:99:0x0325, B:100:0x0343, B:101:0x034a, B:103:0x0350, B:104:0x0388, B:106:0x03ef, B:107:0x0409, B:109:0x0417, B:111:0x0462, B:112:0x0497, B:114:0x049d, B:116:0x04b0, B:117:0x04bd, B:119:0x0509, B:120:0x0517, B:122:0x051f, B:123:0x0522, B:125:0x052a, B:128:0x0533, B:127:0x0530, B:110:0x044d, B:85:0x0291, B:134:0x05ba, B:37:0x0143, B:39:0x0149), top: B:143:0x007f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x030d A[Catch: all -> 0x00a7, TryCatch #2 {all -> 0x00a7, blocks: (B:11:0x007f, B:13:0x008b, B:18:0x00aa, B:20:0x00b0, B:22:0x00c4, B:24:0x00db, B:25:0x00e2, B:27:0x00ec, B:28:0x00f9, B:30:0x0103, B:31:0x0110, B:33:0x011b, B:34:0x0123, B:36:0x013f, B:40:0x014c, B:42:0x0161, B:44:0x0171, B:46:0x0179, B:48:0x017f, B:49:0x0182, B:51:0x0191, B:53:0x01a5, B:55:0x01af, B:56:0x01c0, B:58:0x01c4, B:60:0x01cf, B:62:0x01e8, B:63:0x021f, B:65:0x0227, B:67:0x022d, B:71:0x0248, B:73:0x0252, B:74:0x025f, B:75:0x0271, B:77:0x0277, B:83:0x028d, B:86:0x02b8, B:88:0x02db, B:90:0x02e8, B:92:0x02f4, B:93:0x0307, B:95:0x030d, B:97:0x031f, B:99:0x0325, B:100:0x0343, B:101:0x034a, B:103:0x0350, B:104:0x0388, B:106:0x03ef, B:107:0x0409, B:109:0x0417, B:111:0x0462, B:112:0x0497, B:114:0x049d, B:116:0x04b0, B:117:0x04bd, B:119:0x0509, B:120:0x0517, B:122:0x051f, B:123:0x0522, B:125:0x052a, B:128:0x0533, B:127:0x0530, B:110:0x044d, B:85:0x0291, B:134:0x05ba, B:37:0x0143, B:39:0x0149), top: B:143:0x007f, inners: #0, #3 }] */
    /* JADX WARN: Code duplicated, block: B:98:0x0323 A[LOOP:1: B:93:0x0307->B:98:0x0323, LOOP_END] */
    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        byte[] bArr;
        zzkp zzkpVar;
        String strZzt;
        List listZzu;
        Iterator it;
        zzku zzkuVar;
        zzkr zzkrVarZzu;
        com.google.android.gms.internal.measurement.zzgh[] zzghVarArr;
        int i10;
        Bundle bundle;
        zzaq zzaqVarZzn;
        Object obj;
        zzaq zzaqVarZzc;
        long j10;
        zzap zzapVar;
        com.google.android.gms.internal.measurement.zzfn zzfnVarZze;
        zzar zzarVar;
        long jZzn;
        long jZzp;
        com.google.android.gms.internal.measurement.zzfr zzfrVarZze;
        Object objZzf;
        String strZzt2;
        Iterator it2;
        this.zzc.zza.zzA();
        zzib zzibVarZzr = this.zzc.zza.zzr();
        zzau zzauVar = this.zza;
        String str = this.zzb;
        zzibVarZzr.zzg();
        zzfr.zzO();
        Preconditions.checkNotNull(zzauVar);
        Preconditions.checkNotEmpty(str);
        if (!zzibVarZzr.zzs.zzf().zzs(str, zzdu.zzS)) {
            zzibVarZzr.zzs.zzay().zzc().zzb("Generating ScionPayload disabled. packageName", str);
            return new byte[0];
        }
        if (!"_iap".equals(zzauVar.zza) && !"_iapx".equals(zzauVar.zza)) {
            zzibVarZzr.zzs.zzay().zzc().zzc("Generating a payload for this event is not available. package_name, event_name", str, zzauVar.zza);
            return null;
        }
        com.google.android.gms.internal.measurement.zzfv zzfvVarZza = com.google.android.gms.internal.measurement.zzfw.zza();
        zzibVarZzr.zzf.zzi().zzw();
        try {
            zzg zzgVarZzj = zzibVarZzr.zzf.zzi().zzj(str);
            if (zzgVarZzj == null) {
                zzibVarZzr.zzs.zzay().zzc().zzb("Log and bundle not available. package_name", str);
                bArr = new byte[0];
                zzkpVar = zzibVarZzr.zzf;
            } else if (zzgVarZzj.zzah()) {
                com.google.android.gms.internal.measurement.zzfx zzfxVarZzu = com.google.android.gms.internal.measurement.zzfy.zzu();
                zzfxVarZzu.zzZ(1);
                zzfxVarZzu.zzV("android");
                if (!TextUtils.isEmpty(zzgVarZzj.zzt())) {
                    zzfxVarZzu.zzA(zzgVarZzj.zzt());
                }
                if (!TextUtils.isEmpty(zzgVarZzj.zzv())) {
                    zzfxVarZzu.zzC((String) Preconditions.checkNotNull(zzgVarZzj.zzv()));
                }
                if (!TextUtils.isEmpty(zzgVarZzj.zzw())) {
                    zzfxVarZzu.zzD((String) Preconditions.checkNotNull(zzgVarZzj.zzw()));
                }
                if (zzgVarZzj.zzb() != -2147483648L) {
                    zzfxVarZzu.zzE((int) zzgVarZzj.zzb());
                }
                zzfxVarZzu.zzR(zzgVarZzj.zzm());
                zzfxVarZzu.zzM(zzgVarZzj.zzk());
                String strZzy = zzgVarZzj.zzy();
                String strZzr = zzgVarZzj.zzr();
                if (!TextUtils.isEmpty(strZzy)) {
                    zzfxVarZzu.zzQ(strZzy);
                } else if (!TextUtils.isEmpty(strZzr)) {
                    zzfxVarZzu.zzy(strZzr);
                }
                zzah zzahVarZzh = zzibVarZzr.zzf.zzh(str);
                zzfxVarZzu.zzJ(zzgVarZzj.zzj());
                if (zzibVarZzr.zzs.zzJ() && zzibVarZzr.zzs.zzf().zzt(zzfxVarZzu.zzak()) && zzahVarZzh.zzi(zzag.AD_STORAGE) && !TextUtils.isEmpty(null)) {
                    zzfxVarZzu.zzL(null);
                }
                zzfxVarZzu.zzI(zzahVarZzh.zzh());
                if (!zzahVarZzh.zzi(zzag.AD_STORAGE)) {
                    zzibVarZzr.zzs.zzg().zzu();
                    zzfxVarZzu.zzK(Build.MODEL);
                    zzibVarZzr.zzs.zzg().zzu();
                    zzfxVarZzu.zzU(Build.VERSION.RELEASE);
                    zzfxVarZzu.zzae((int) zzibVarZzr.zzs.zzg().zzb());
                    zzfxVarZzu.zzai(zzibVarZzr.zzs.zzg().zzc());
                    if (zzahVarZzh.zzi(zzag.ANALYTICS_STORAGE)) {
                        zzfxVarZzu.zzB(zzib.zza((String) Preconditions.checkNotNull(zzgVarZzj.zzu()), Long.toString(zzauVar.zzd)));
                    }
                    if (!TextUtils.isEmpty(zzgVarZzj.zzx())) {
                        zzfxVarZzu.zzP((String) Preconditions.checkNotNull(zzgVarZzj.zzx()));
                    }
                    strZzt = zzgVarZzj.zzt();
                    listZzu = zzibVarZzr.zzf.zzi().zzu(strZzt);
                    it = listZzu.iterator();
                    do {
                        if (!it.hasNext()) {
                            zzkuVar = null;
                            break;
                        }
                        zzkuVar = (zzku) it.next();
                    } while (!"_lte".equals(zzkuVar.zzc));
                    if (zzkuVar != null) {
                        zzku zzkuVar2 = new zzku(strZzt, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lte", zzibVarZzr.zzs.zzav().currentTimeMillis(), 0L);
                        listZzu.add(zzkuVar2);
                        zzibVarZzr.zzf.zzi().zzL(zzkuVar2);
                    } else {
                        zzku zzkuVar3 = new zzku(strZzt, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lte", zzibVarZzr.zzs.zzav().currentTimeMillis(), 0L);
                        listZzu.add(zzkuVar3);
                        zzibVarZzr.zzf.zzi().zzL(zzkuVar3);
                    }
                    zzkrVarZzu = zzibVarZzr.zzf.zzu();
                    zzkrVarZzu.zzs.zzay().zzj().zza("Checking account type status for ad personalization signals");
                    if (zzkrVarZzu.zzs.zzg().zze()) {
                        strZzt2 = zzgVarZzj.zzt();
                        Preconditions.checkNotNull(strZzt2);
                        if (zzgVarZzj.zzag()) {
                            zzkrVarZzu.zzs.zzay().zzc().zza("Turning off ad personalization due to account type");
                            it2 = listZzu.iterator();
                            while (it2.hasNext()) {
                                if ("_npa".equals(((zzku) it2.next()).zzc)) {
                                    it2.remove();
                                    break;
                                }
                            }
                            listZzu.add(new zzku(strZzt2, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_npa", zzkrVarZzu.zzs.zzav().currentTimeMillis(), 1L));
                        }
                    }
                    zzghVarArr = new com.google.android.gms.internal.measurement.zzgh[listZzu.size()];
                    for (i10 = 0; i10 < listZzu.size(); i10++) {
                        com.google.android.gms.internal.measurement.zzgg zzggVarZzd = com.google.android.gms.internal.measurement.zzgh.zzd();
                        zzggVarZzd.zzf(((zzku) listZzu.get(i10)).zzc);
                        zzggVarZzd.zzg(((zzku) listZzu.get(i10)).zzd);
                        zzibVarZzr.zzf.zzu().zzu(zzggVarZzd, ((zzku) listZzu.get(i10)).zze);
                        zzghVarArr[i10] = (com.google.android.gms.internal.measurement.zzgh) zzggVarZzd.zzay();
                    }
                    zzfxVarZzu.zzi(Arrays.asList(zzghVarArr));
                    zzei zzeiVarZzb = zzei.zzb(zzauVar);
                    zzibVarZzr.zzs.zzv().zzK(zzeiVarZzb.zzd, zzibVarZzr.zzf.zzi().zzi(str));
                    zzibVarZzr.zzs.zzv().zzL(zzeiVarZzb, zzibVarZzr.zzs.zzf().zzd(str));
                    bundle = zzeiVarZzb.zzd;
                    bundle.putLong("_c", 1L);
                    zzibVarZzr.zzs.zzay().zzc().zza("Marking in-app purchase as real-time");
                    bundle.putLong(NotificationMessage.NOTIF_KEY_REQUEST_ID, 1L);
                    bundle.putString("_o", zzauVar.zzc);
                    if (zzibVarZzr.zzs.zzv().zzad(zzfxVarZzu.zzak())) {
                        zzibVarZzr.zzs.zzv().zzN(bundle, "_dbg", 1L);
                        zzibVarZzr.zzs.zzv().zzN(bundle, NotificationMessage.NOTIF_KEY_REQUEST_ID, 1L);
                    }
                    zzaqVarZzn = zzibVarZzr.zzf.zzi().zzn(str, zzauVar.zza);
                    if (zzaqVarZzn == null) {
                        obj = null;
                        zzaqVarZzc = new zzaq(str, zzauVar.zza, 0L, 0L, 0L, zzauVar.zzd, 0L, null, null, null, null);
                        j10 = 0;
                    } else {
                        obj = null;
                        long j11 = zzaqVarZzn.zzf;
                        zzaqVarZzc = zzaqVarZzn.zzc(zzauVar.zzd);
                        j10 = j11;
                    }
                    zzibVarZzr.zzf.zzi().zzE(zzaqVarZzc);
                    zzapVar = new zzap(zzibVarZzr.zzs, zzauVar.zzc, str, zzauVar.zza, zzauVar.zzd, j10, bundle);
                    zzfnVarZze = com.google.android.gms.internal.measurement.zzfo.zze();
                    zzfnVarZze.zzm(zzapVar.zzd);
                    zzfnVarZze.zzi(zzapVar.zzb);
                    zzfnVarZze.zzl(zzapVar.zze);
                    zzarVar = new zzar(zzapVar.zzf);
                    while (zzarVar.hasNext()) {
                        String next = zzarVar.next();
                        zzfrVarZze = com.google.android.gms.internal.measurement.zzfs.zze();
                        zzfrVarZze.zzj(next);
                        objZzf = zzapVar.zzf.zzf(next);
                        if (objZzf != null) {
                            zzibVarZzr.zzf.zzu().zzt(zzfrVarZze, objZzf);
                            zzfnVarZze.zze(zzfrVarZze);
                        }
                    }
                    zzfxVarZzu.zzj(zzfnVarZze);
                    com.google.android.gms.internal.measurement.zzfz zzfzVarZza = com.google.android.gms.internal.measurement.zzgb.zza();
                    com.google.android.gms.internal.measurement.zzfp zzfpVarZza = com.google.android.gms.internal.measurement.zzfq.zza();
                    zzfpVarZza.zza(zzaqVarZzc.zzc);
                    zzfpVarZza.zzb(zzauVar.zza);
                    zzfzVarZza.zza(zzfpVarZza);
                    zzfxVarZzu.zzW(zzfzVarZza);
                    zzfxVarZzu.zzf(zzibVarZzr.zzf.zzf().zza(zzgVarZzj.zzt(), Collections.emptyList(), zzfxVarZzu.zzan(), Long.valueOf(zzfnVarZze.zzc()), Long.valueOf(zzfnVarZze.zzc())));
                    if (zzfnVarZze.zzq()) {
                        zzfxVarZzu.zzad(zzfnVarZze.zzc());
                        zzfxVarZzu.zzN(zzfnVarZze.zzc());
                    }
                    jZzn = zzgVarZzj.zzn();
                    if (jZzn != 0) {
                        zzfxVarZzu.zzX(jZzn);
                    }
                    jZzp = zzgVarZzj.zzp();
                    if (jZzp != 0) {
                        zzfxVarZzu.zzY(jZzp);
                    } else if (jZzn != 0) {
                        zzfxVarZzu.zzY(jZzn);
                    }
                    zzgVarZzj.zzD();
                    zzfxVarZzu.zzF((int) zzgVarZzj.zzo());
                    zzibVarZzr.zzs.zzf().zzh();
                    zzfxVarZzu.zzag(55005L);
                    zzfxVarZzu.zzaf(zzibVarZzr.zzs.zzav().currentTimeMillis());
                    zzfxVarZzu.zzac(true);
                    zzfvVarZza.zza(zzfxVarZzu);
                    zzgVarZzj.zzab(zzfxVarZzu.zzd());
                    zzgVarZzj.zzZ(zzfxVarZzu.zzc());
                    zzibVarZzr.zzf.zzi().zzD(zzgVarZzj);
                    zzibVarZzr.zzf.zzi().zzC();
                    zzibVarZzr.zzf.zzi().zzx();
                    return zzibVarZzr.zzf.zzu().zzy(((com.google.android.gms.internal.measurement.zzfw) zzfvVarZza.zzay()).zzbq());
                }
                Pair pairZzd = zzibVarZzr.zzf.zzs().zzd(zzgVarZzj.zzt(), zzahVarZzh);
                if (!zzgVarZzj.zzag() || TextUtils.isEmpty((CharSequence) pairZzd.first)) {
                    zzibVarZzr.zzs.zzg().zzu();
                    zzfxVarZzu.zzK(Build.MODEL);
                    zzibVarZzr.zzs.zzg().zzu();
                    zzfxVarZzu.zzU(Build.VERSION.RELEASE);
                    zzfxVarZzu.zzae((int) zzibVarZzr.zzs.zzg().zzb());
                    zzfxVarZzu.zzai(zzibVarZzr.zzs.zzg().zzc());
                    try {
                        if (zzahVarZzh.zzi(zzag.ANALYTICS_STORAGE) && zzgVarZzj.zzu() != null) {
                            zzfxVarZzu.zzB(zzib.zza((String) Preconditions.checkNotNull(zzgVarZzj.zzu()), Long.toString(zzauVar.zzd)));
                        }
                        if (!TextUtils.isEmpty(zzgVarZzj.zzx())) {
                            zzfxVarZzu.zzP((String) Preconditions.checkNotNull(zzgVarZzj.zzx()));
                        }
                        strZzt = zzgVarZzj.zzt();
                        listZzu = zzibVarZzr.zzf.zzi().zzu(strZzt);
                        it = listZzu.iterator();
                        do {
                            if (!it.hasNext()) {
                                zzkuVar = null;
                                break;
                            }
                            zzkuVar = (zzku) it.next();
                        } while (!"_lte".equals(zzkuVar.zzc));
                        if (zzkuVar != null || zzkuVar.zze == null) {
                            zzku zzkuVar4 = new zzku(strZzt, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lte", zzibVarZzr.zzs.zzav().currentTimeMillis(), 0L);
                            listZzu.add(zzkuVar4);
                            zzibVarZzr.zzf.zzi().zzL(zzkuVar4);
                        }
                        zzkrVarZzu = zzibVarZzr.zzf.zzu();
                        zzkrVarZzu.zzs.zzay().zzj().zza("Checking account type status for ad personalization signals");
                        if (zzkrVarZzu.zzs.zzg().zze()) {
                            strZzt2 = zzgVarZzj.zzt();
                            Preconditions.checkNotNull(strZzt2);
                            if (zzgVarZzj.zzag() && zzkrVarZzu.zzf.zzo().zzk(strZzt2)) {
                                zzkrVarZzu.zzs.zzay().zzc().zza("Turning off ad personalization due to account type");
                                it2 = listZzu.iterator();
                                while (it2.hasNext()) {
                                    if ("_npa".equals(((zzku) it2.next()).zzc)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                listZzu.add(new zzku(strZzt2, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_npa", zzkrVarZzu.zzs.zzav().currentTimeMillis(), 1L));
                            }
                        }
                        zzghVarArr = new com.google.android.gms.internal.measurement.zzgh[listZzu.size()];
                        while (i10 < listZzu.size()) {
                            com.google.android.gms.internal.measurement.zzgg zzggVarZzd2 = com.google.android.gms.internal.measurement.zzgh.zzd();
                            zzggVarZzd2.zzf(((zzku) listZzu.get(i10)).zzc);
                            zzggVarZzd2.zzg(((zzku) listZzu.get(i10)).zzd);
                            zzibVarZzr.zzf.zzu().zzu(zzggVarZzd2, ((zzku) listZzu.get(i10)).zze);
                            zzghVarArr[i10] = (com.google.android.gms.internal.measurement.zzgh) zzggVarZzd2.zzay();
                        }
                        zzfxVarZzu.zzi(Arrays.asList(zzghVarArr));
                        zzei zzeiVarZzb2 = zzei.zzb(zzauVar);
                        zzibVarZzr.zzs.zzv().zzK(zzeiVarZzb2.zzd, zzibVarZzr.zzf.zzi().zzi(str));
                        zzibVarZzr.zzs.zzv().zzL(zzeiVarZzb2, zzibVarZzr.zzs.zzf().zzd(str));
                        bundle = zzeiVarZzb2.zzd;
                        bundle.putLong("_c", 1L);
                        zzibVarZzr.zzs.zzay().zzc().zza("Marking in-app purchase as real-time");
                        bundle.putLong(NotificationMessage.NOTIF_KEY_REQUEST_ID, 1L);
                        bundle.putString("_o", zzauVar.zzc);
                        if (zzibVarZzr.zzs.zzv().zzad(zzfxVarZzu.zzak())) {
                            zzibVarZzr.zzs.zzv().zzN(bundle, "_dbg", 1L);
                            zzibVarZzr.zzs.zzv().zzN(bundle, NotificationMessage.NOTIF_KEY_REQUEST_ID, 1L);
                        }
                        zzaqVarZzn = zzibVarZzr.zzf.zzi().zzn(str, zzauVar.zza);
                        if (zzaqVarZzn == null) {
                            obj = null;
                            zzaqVarZzc = new zzaq(str, zzauVar.zza, 0L, 0L, 0L, zzauVar.zzd, 0L, null, null, null, null);
                            j10 = 0;
                        } else {
                            obj = null;
                            long j12 = zzaqVarZzn.zzf;
                            zzaqVarZzc = zzaqVarZzn.zzc(zzauVar.zzd);
                            j10 = j12;
                        }
                        zzibVarZzr.zzf.zzi().zzE(zzaqVarZzc);
                        zzapVar = new zzap(zzibVarZzr.zzs, zzauVar.zzc, str, zzauVar.zza, zzauVar.zzd, j10, bundle);
                        zzfnVarZze = com.google.android.gms.internal.measurement.zzfo.zze();
                        zzfnVarZze.zzm(zzapVar.zzd);
                        zzfnVarZze.zzi(zzapVar.zzb);
                        zzfnVarZze.zzl(zzapVar.zze);
                        zzarVar = new zzar(zzapVar.zzf);
                        while (zzarVar.hasNext()) {
                            String next2 = zzarVar.next();
                            zzfrVarZze = com.google.android.gms.internal.measurement.zzfs.zze();
                            zzfrVarZze.zzj(next2);
                            objZzf = zzapVar.zzf.zzf(next2);
                            if (objZzf != null) {
                                zzibVarZzr.zzf.zzu().zzt(zzfrVarZze, objZzf);
                                zzfnVarZze.zze(zzfrVarZze);
                            }
                        }
                        zzfxVarZzu.zzj(zzfnVarZze);
                        com.google.android.gms.internal.measurement.zzfz zzfzVarZza2 = com.google.android.gms.internal.measurement.zzgb.zza();
                        com.google.android.gms.internal.measurement.zzfp zzfpVarZza2 = com.google.android.gms.internal.measurement.zzfq.zza();
                        zzfpVarZza2.zza(zzaqVarZzc.zzc);
                        zzfpVarZza2.zzb(zzauVar.zza);
                        zzfzVarZza2.zza(zzfpVarZza2);
                        zzfxVarZzu.zzW(zzfzVarZza2);
                        zzfxVarZzu.zzf(zzibVarZzr.zzf.zzf().zza(zzgVarZzj.zzt(), Collections.emptyList(), zzfxVarZzu.zzan(), Long.valueOf(zzfnVarZze.zzc()), Long.valueOf(zzfnVarZze.zzc())));
                        if (zzfnVarZze.zzq()) {
                            zzfxVarZzu.zzad(zzfnVarZze.zzc());
                            zzfxVarZzu.zzN(zzfnVarZze.zzc());
                        }
                        jZzn = zzgVarZzj.zzn();
                        if (jZzn != 0) {
                            zzfxVarZzu.zzX(jZzn);
                        }
                        jZzp = zzgVarZzj.zzp();
                        if (jZzp != 0) {
                            zzfxVarZzu.zzY(jZzp);
                        } else if (jZzn != 0) {
                            zzfxVarZzu.zzY(jZzn);
                        }
                        zzgVarZzj.zzD();
                        zzfxVarZzu.zzF((int) zzgVarZzj.zzo());
                        zzibVarZzr.zzs.zzf().zzh();
                        zzfxVarZzu.zzag(55005L);
                        zzfxVarZzu.zzaf(zzibVarZzr.zzs.zzav().currentTimeMillis());
                        zzfxVarZzu.zzac(true);
                        zzfvVarZza.zza(zzfxVarZzu);
                        zzgVarZzj.zzab(zzfxVarZzu.zzd());
                        zzgVarZzj.zzZ(zzfxVarZzu.zzc());
                        zzibVarZzr.zzf.zzi().zzD(zzgVarZzj);
                        zzibVarZzr.zzf.zzi().zzC();
                        zzibVarZzr.zzf.zzi().zzx();
                        try {
                            return zzibVarZzr.zzf.zzu().zzy(((com.google.android.gms.internal.measurement.zzfw) zzfvVarZza.zzay()).zzbq());
                        } catch (IOException e5) {
                            zzibVarZzr.zzs.zzay().zzd().zzc("Data loss. Failed to bundle and serialize. appId", zzeh.zzn(str), e5);
                            return obj;
                        }
                    } catch (SecurityException e7) {
                        zzibVarZzr.zzs.zzay().zzc().zzb("app instance id encryption failed", e7.getMessage());
                        bArr = new byte[0];
                        zzkpVar = zzibVarZzr.zzf;
                    }
                } else {
                    try {
                        zzfxVarZzu.zzaa(zzib.zza((String) pairZzd.first, Long.toString(zzauVar.zzd)));
                        Object obj2 = pairZzd.second;
                        if (obj2 != null) {
                            zzfxVarZzu.zzT(((Boolean) obj2).booleanValue());
                        }
                        zzibVarZzr.zzs.zzg().zzu();
                        zzfxVarZzu.zzK(Build.MODEL);
                        zzibVarZzr.zzs.zzg().zzu();
                        zzfxVarZzu.zzU(Build.VERSION.RELEASE);
                        zzfxVarZzu.zzae((int) zzibVarZzr.zzs.zzg().zzb());
                        zzfxVarZzu.zzai(zzibVarZzr.zzs.zzg().zzc());
                        if (zzahVarZzh.zzi(zzag.ANALYTICS_STORAGE)) {
                            zzfxVarZzu.zzB(zzib.zza((String) Preconditions.checkNotNull(zzgVarZzj.zzu()), Long.toString(zzauVar.zzd)));
                        }
                        if (!TextUtils.isEmpty(zzgVarZzj.zzx())) {
                            zzfxVarZzu.zzP((String) Preconditions.checkNotNull(zzgVarZzj.zzx()));
                        }
                        strZzt = zzgVarZzj.zzt();
                        listZzu = zzibVarZzr.zzf.zzi().zzu(strZzt);
                        it = listZzu.iterator();
                        do {
                            if (!it.hasNext()) {
                                zzkuVar = null;
                                break;
                            }
                            zzkuVar = (zzku) it.next();
                        } while (!"_lte".equals(zzkuVar.zzc));
                        if (zzkuVar != null) {
                            zzku zzkuVar5 = new zzku(strZzt, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lte", zzibVarZzr.zzs.zzav().currentTimeMillis(), 0L);
                            listZzu.add(zzkuVar5);
                            zzibVarZzr.zzf.zzi().zzL(zzkuVar5);
                        } else {
                            zzku zzkuVar6 = new zzku(strZzt, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_lte", zzibVarZzr.zzs.zzav().currentTimeMillis(), 0L);
                            listZzu.add(zzkuVar6);
                            zzibVarZzr.zzf.zzi().zzL(zzkuVar6);
                        }
                        zzkrVarZzu = zzibVarZzr.zzf.zzu();
                        zzkrVarZzu.zzs.zzay().zzj().zza("Checking account type status for ad personalization signals");
                        if (zzkrVarZzu.zzs.zzg().zze()) {
                            strZzt2 = zzgVarZzj.zzt();
                            Preconditions.checkNotNull(strZzt2);
                            if (zzgVarZzj.zzag()) {
                                zzkrVarZzu.zzs.zzay().zzc().zza("Turning off ad personalization due to account type");
                                it2 = listZzu.iterator();
                                while (it2.hasNext()) {
                                    if ("_npa".equals(((zzku) it2.next()).zzc)) {
                                        it2.remove();
                                        break;
                                    }
                                }
                                listZzu.add(new zzku(strZzt2, DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "_npa", zzkrVarZzu.zzs.zzav().currentTimeMillis(), 1L));
                            }
                        }
                        zzghVarArr = new com.google.android.gms.internal.measurement.zzgh[listZzu.size()];
                        while (i10 < listZzu.size()) {
                            com.google.android.gms.internal.measurement.zzgg zzggVarZzd3 = com.google.android.gms.internal.measurement.zzgh.zzd();
                            zzggVarZzd3.zzf(((zzku) listZzu.get(i10)).zzc);
                            zzggVarZzd3.zzg(((zzku) listZzu.get(i10)).zzd);
                            zzibVarZzr.zzf.zzu().zzu(zzggVarZzd3, ((zzku) listZzu.get(i10)).zze);
                            zzghVarArr[i10] = (com.google.android.gms.internal.measurement.zzgh) zzggVarZzd3.zzay();
                        }
                        zzfxVarZzu.zzi(Arrays.asList(zzghVarArr));
                        zzei zzeiVarZzb3 = zzei.zzb(zzauVar);
                        zzibVarZzr.zzs.zzv().zzK(zzeiVarZzb3.zzd, zzibVarZzr.zzf.zzi().zzi(str));
                        zzibVarZzr.zzs.zzv().zzL(zzeiVarZzb3, zzibVarZzr.zzs.zzf().zzd(str));
                        bundle = zzeiVarZzb3.zzd;
                        bundle.putLong("_c", 1L);
                        zzibVarZzr.zzs.zzay().zzc().zza("Marking in-app purchase as real-time");
                        bundle.putLong(NotificationMessage.NOTIF_KEY_REQUEST_ID, 1L);
                        bundle.putString("_o", zzauVar.zzc);
                        if (zzibVarZzr.zzs.zzv().zzad(zzfxVarZzu.zzak())) {
                            zzibVarZzr.zzs.zzv().zzN(bundle, "_dbg", 1L);
                            zzibVarZzr.zzs.zzv().zzN(bundle, NotificationMessage.NOTIF_KEY_REQUEST_ID, 1L);
                        }
                        zzaqVarZzn = zzibVarZzr.zzf.zzi().zzn(str, zzauVar.zza);
                        if (zzaqVarZzn == null) {
                            obj = null;
                            zzaqVarZzc = new zzaq(str, zzauVar.zza, 0L, 0L, 0L, zzauVar.zzd, 0L, null, null, null, null);
                            j10 = 0;
                        } else {
                            obj = null;
                            long j13 = zzaqVarZzn.zzf;
                            zzaqVarZzc = zzaqVarZzn.zzc(zzauVar.zzd);
                            j10 = j13;
                        }
                        zzibVarZzr.zzf.zzi().zzE(zzaqVarZzc);
                        zzapVar = new zzap(zzibVarZzr.zzs, zzauVar.zzc, str, zzauVar.zza, zzauVar.zzd, j10, bundle);
                        zzfnVarZze = com.google.android.gms.internal.measurement.zzfo.zze();
                        zzfnVarZze.zzm(zzapVar.zzd);
                        zzfnVarZze.zzi(zzapVar.zzb);
                        zzfnVarZze.zzl(zzapVar.zze);
                        zzarVar = new zzar(zzapVar.zzf);
                        while (zzarVar.hasNext()) {
                            String next3 = zzarVar.next();
                            zzfrVarZze = com.google.android.gms.internal.measurement.zzfs.zze();
                            zzfrVarZze.zzj(next3);
                            objZzf = zzapVar.zzf.zzf(next3);
                            if (objZzf != null) {
                                zzibVarZzr.zzf.zzu().zzt(zzfrVarZze, objZzf);
                                zzfnVarZze.zze(zzfrVarZze);
                            }
                        }
                        zzfxVarZzu.zzj(zzfnVarZze);
                        com.google.android.gms.internal.measurement.zzfz zzfzVarZza3 = com.google.android.gms.internal.measurement.zzgb.zza();
                        com.google.android.gms.internal.measurement.zzfp zzfpVarZza3 = com.google.android.gms.internal.measurement.zzfq.zza();
                        zzfpVarZza3.zza(zzaqVarZzc.zzc);
                        zzfpVarZza3.zzb(zzauVar.zza);
                        zzfzVarZza3.zza(zzfpVarZza3);
                        zzfxVarZzu.zzW(zzfzVarZza3);
                        zzfxVarZzu.zzf(zzibVarZzr.zzf.zzf().zza(zzgVarZzj.zzt(), Collections.emptyList(), zzfxVarZzu.zzan(), Long.valueOf(zzfnVarZze.zzc()), Long.valueOf(zzfnVarZze.zzc())));
                        if (zzfnVarZze.zzq()) {
                            zzfxVarZzu.zzad(zzfnVarZze.zzc());
                            zzfxVarZzu.zzN(zzfnVarZze.zzc());
                        }
                        jZzn = zzgVarZzj.zzn();
                        if (jZzn != 0) {
                            zzfxVarZzu.zzX(jZzn);
                        }
                        jZzp = zzgVarZzj.zzp();
                        if (jZzp != 0) {
                            zzfxVarZzu.zzY(jZzp);
                        } else if (jZzn != 0) {
                            zzfxVarZzu.zzY(jZzn);
                        }
                        zzgVarZzj.zzD();
                        zzfxVarZzu.zzF((int) zzgVarZzj.zzo());
                        zzibVarZzr.zzs.zzf().zzh();
                        zzfxVarZzu.zzag(55005L);
                        zzfxVarZzu.zzaf(zzibVarZzr.zzs.zzav().currentTimeMillis());
                        zzfxVarZzu.zzac(true);
                        zzfvVarZza.zza(zzfxVarZzu);
                        zzgVarZzj.zzab(zzfxVarZzu.zzd());
                        zzgVarZzj.zzZ(zzfxVarZzu.zzc());
                        zzibVarZzr.zzf.zzi().zzD(zzgVarZzj);
                        zzibVarZzr.zzf.zzi().zzC();
                        zzibVarZzr.zzf.zzi().zzx();
                        return zzibVarZzr.zzf.zzu().zzy(((com.google.android.gms.internal.measurement.zzfw) zzfvVarZza.zzay()).zzbq());
                    } catch (SecurityException e10) {
                        zzibVarZzr.zzs.zzay().zzc().zzb("Resettable device id encryption failed", e10.getMessage());
                        bArr = new byte[0];
                        zzkpVar = zzibVarZzr.zzf;
                    }
                }
            } else {
                zzibVarZzr.zzs.zzay().zzc().zzb("Log and bundle disabled. package_name", str);
                bArr = new byte[0];
                zzkpVar = zzibVarZzr.zzf;
            }
            zzkpVar.zzi().zzx();
            return bArr;
        } catch (Throwable th2) {
            zzibVarZzr.zzf.zzi().zzx();
            throw th2;
        }
    }
}
