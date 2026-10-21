package com.adobe.marketing.mobile;

import java.util.TreeMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes2.dex */
class AndroidEventHistory implements EventHistory {
    private static final int COUNT_INDEX = 0;
    private static final String LOG_TAG = "AndroidEventHistory";
    private static final int OLDEST_INDEX = 1;
    private static final int THREAD_POOL_SIZE = 1;
    private final AndroidEventHistoryDatabase androidEventHistoryDatabase = new AndroidEventHistoryDatabase();
    private final ExecutorService executorService = Executors.newFixedThreadPool(1);

    @Override // com.adobe.marketing.mobile.EventHistory
    public void deleteEvents(final EventHistoryRequest[] eventHistoryRequestArr, final EventHistoryResultHandler<Integer> eventHistoryResultHandler) {
        this.executorService.submit(new Runnable() { // from class: com.adobe.marketing.mobile.AndroidEventHistory.3
            @Override // java.lang.Runnable
            public void run() {
                int iDelete = 0;
                for (EventHistoryRequest eventHistoryRequest : eventHistoryRequestArr) {
                    long j10 = eventHistoryRequest.fromDate;
                    long j11 = j10 == 0 ? 0L : j10;
                    long jCurrentTimeMillis = eventHistoryRequest.toDate;
                    if (jCurrentTimeMillis == 0) {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                    iDelete += AndroidEventHistory.this.androidEventHistoryDatabase.delete(StringEncoder.convertMapToDecimalHash(new TreeMap(EventDataFlattener.getFlattenedEventDataMask(eventHistoryRequest.mask))), j11, jCurrentTimeMillis);
                }
                eventHistoryResultHandler.call(Integer.valueOf(iDelete));
            }
        });
    }

    @Override // com.adobe.marketing.mobile.EventHistory
    public void getEvents(final EventHistoryRequest[] eventHistoryRequestArr, final boolean z10, final EventHistoryResultHandler<Integer> eventHistoryResultHandler) {
        this.executorService.submit(new Runnable() { // from class: com.adobe.marketing.mobile.AndroidEventHistory.2
            @Override // java.lang.Runnable
            public void run() {
                long j10 = 0;
                int i10 = 0;
                for (EventHistoryRequest eventHistoryRequest : eventHistoryRequestArr) {
                    long j11 = (!z10 || j10 == 0) ? eventHistoryRequest.fromDate : j10;
                    long jCurrentTimeMillis = eventHistoryRequest.toDate;
                    if (jCurrentTimeMillis == 0) {
                        jCurrentTimeMillis = System.currentTimeMillis();
                    }
                    long j12 = jCurrentTimeMillis;
                    long jConvertMapToDecimalHash = StringEncoder.convertMapToDecimalHash(new TreeMap(EventDataFlattener.getFlattenedEventDataMask(eventHistoryRequest.mask)));
                    DatabaseService.QueryResult queryResultSelect = AndroidEventHistory.this.androidEventHistoryDatabase.select(jConvertMapToDecimalHash, j11, j12);
                    try {
                        queryResultSelect.moveToFirst();
                        if (queryResultSelect.getInt(0) != 0) {
                            j10 = queryResultSelect.getLong(1);
                            i10 = z10 ? i10 + 1 : i10 + queryResultSelect.getInt(0);
                        }
                    } catch (Exception e5) {
                        Log.debug(AndroidEventHistory.LOG_TAG, "Exception occurred when attempting to retrieve events with eventHash %s from the EventHistoryDatabase: %s", Long.valueOf(jConvertMapToDecimalHash), e5.getMessage());
                    }
                }
                if (!z10) {
                    eventHistoryResultHandler.call(Integer.valueOf(i10));
                } else if (i10 == eventHistoryRequestArr.length) {
                    eventHistoryResultHandler.call(1);
                } else {
                    eventHistoryResultHandler.call(0);
                }
            }
        });
    }

    @Override // com.adobe.marketing.mobile.EventHistory
    public void recordEvent(Event event, final EventHistoryResultHandler<Boolean> eventHistoryResultHandler) {
        final long fnv1aHash = event.getData().toFnv1aHash(event.getMask());
        if (fnv1aHash == 0) {
            Log.debug(LOG_TAG, " The event with name \"%s\" has a fnv1a hash equal to 0. The event will not be recorded.", event.getName());
        } else {
            this.executorService.submit(new Runnable() { // from class: com.adobe.marketing.mobile.AndroidEventHistory.1
                @Override // java.lang.Runnable
                public void run() {
                    eventHistoryResultHandler.call(Boolean.valueOf(AndroidEventHistory.this.androidEventHistoryDatabase.insert(fnv1aHash)));
                }
            });
        }
    }
}
