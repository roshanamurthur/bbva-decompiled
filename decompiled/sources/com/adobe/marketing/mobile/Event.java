package com.adobe.marketing.mobile;

import androidx.collection.h;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes2.dex */
public final class Event {
    private EventData data;
    private int eventNumber;
    private String[] mask;
    private String name;
    private String pairID;
    private String responsePairID;
    private EventSource source;
    private long timestamp;
    private EventType type;
    private String uniqueIdentifier;
    static final Event SHARED_STATE_OLDEST = new Event(0);
    static final Event SHARED_STATE_NEWEST = new Event(Integer.MAX_VALUE);

    public static class Builder {
        private boolean didBuild;
        private Event event;

        public Builder(String str, EventType eventType, EventSource eventSource) {
            this(str, eventType, eventSource, (String[]) null);
        }

        private void throwIfAlreadyBuilt() {
            if (this.didBuild) {
                throw new UnsupportedOperationException("Event - attempted to call methods on Event.Builder after build() was called");
            }
        }

        public Event build() {
            throwIfAlreadyBuilt();
            this.didBuild = true;
            if (this.event.type == null || this.event.source == null) {
                return null;
            }
            if (this.event.timestamp == 0) {
                this.event.timestamp = System.currentTimeMillis();
            }
            return this.event;
        }

        public Builder setData(EventData eventData) {
            throwIfAlreadyBuilt();
            this.event.data = eventData;
            return this;
        }

        public Builder setEventData(Map<String, Object> map) {
            throwIfAlreadyBuilt();
            try {
                this.event.data = EventData.fromObjectMap(map);
            } catch (Exception e5) {
                Log.warning("EventBuilder", "Event data couldn't be serialized, empty data was set instead %s", e5);
                this.event.data = new EventData();
            }
            return this;
        }

        public Builder setEventNumber(int i10) {
            throwIfAlreadyBuilt();
            this.event.eventNumber = i10;
            return this;
        }

        public Builder setPairID(String str) {
            throwIfAlreadyBuilt();
            this.event.pairID = str;
            return this;
        }

        public Builder setResponsePairID(String str) {
            throwIfAlreadyBuilt();
            this.event.responsePairID = str;
            return this;
        }

        public Builder setTimestamp(long j10) {
            throwIfAlreadyBuilt();
            this.event.timestamp = j10;
            return this;
        }

        public Builder setUniqueIdentifier(String str) {
            if (str == null) {
                return this;
            }
            throwIfAlreadyBuilt();
            this.event.uniqueIdentifier = str;
            return this;
        }

        public Builder(String str, EventType eventType, EventSource eventSource, String[] strArr) {
            Event event = new Event();
            this.event = event;
            event.name = str;
            this.event.uniqueIdentifier = UUID.randomUUID().toString();
            this.event.type = eventType;
            this.event.source = eventSource;
            this.event.data = new EventData();
            this.event.responsePairID = UUID.randomUUID().toString();
            this.event.eventNumber = 0;
            this.event.mask = strArr;
            this.didBuild = false;
        }

        public Builder(String str, String str2, String str3) {
            this(str, EventType.get(str2), EventSource.get(str3), (String[]) null);
        }

        public Builder(String str, String str2, String str3, String[] strArr) {
            this(str, EventType.get(str2), EventSource.get(str3), strArr);
        }
    }

    private Event() {
    }

    public static int generateEventMask(EventType eventType, EventSource eventSource, String str) {
        if (!StringUtils.isNullOrEmpty(str)) {
            return str.hashCode();
        }
        return ("" + eventType.getName() + eventSource.getName()).hashCode();
    }

    public EventData getData() {
        return this.data;
    }

    public Map<String, Object> getEventData() {
        try {
            return this.data.toObjectMap();
        } catch (Exception e5) {
            Log.warning("EventBuilder", "An error occurred while retrieving the event data for %s and %s, %s", this.type.getName(), this.source.getName(), e5);
            return null;
        }
    }

    public int getEventMask() {
        return generateEventMask(this.type, this.source, this.pairID);
    }

    public int getEventNumber() {
        return this.eventNumber;
    }

    public EventSource getEventSource() {
        return this.source;
    }

    public EventType getEventType() {
        return this.type;
    }

    public String[] getMask() {
        return this.mask;
    }

    public String getName() {
        return this.name;
    }

    public String getPairID() {
        return this.pairID;
    }

    public String getResponsePairID() {
        return this.responsePairID;
    }

    public String getSource() {
        return this.source.getName();
    }

    public long getTimestamp() {
        return this.timestamp;
    }

    public long getTimestampInSeconds() {
        return TimeUnit.MILLISECONDS.toSeconds(this.timestamp);
    }

    public String getType() {
        return this.type.getName();
    }

    public String getUniqueIdentifier() {
        return this.uniqueIdentifier;
    }

    public void setEventNumber(int i10) {
        this.eventNumber = i10;
    }

    public void setPairId(String str) {
        this.pairID = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("{\n    class: Event,\n    name: ");
        sb2.append(this.name);
        sb2.append(",\n    eventNumber: ");
        sb2.append(this.eventNumber);
        sb2.append(",\n    uniqueIdentifier: ");
        sb2.append(this.uniqueIdentifier);
        sb2.append(",\n    source: ");
        sb2.append(this.source.getName());
        sb2.append(",\n    type: ");
        sb2.append(this.type.getName());
        sb2.append(",\n    pairId: ");
        sb2.append(this.pairID);
        sb2.append(",\n    responsePairId: ");
        sb2.append(this.responsePairID);
        sb2.append(",\n    timestamp: ");
        sb2.append(this.timestamp);
        sb2.append(",\n    data: ");
        sb2.append(this.data.prettyString(2));
        sb2.append("\n    mask: ");
        sb2.append(Arrays.toString(this.mask));
        sb2.append(",\n    fnv1aHash: ");
        return h.d(sb2, this.data.toFnv1aHash(this.mask), "\n}");
    }

    private Event(int i10) {
        this.eventNumber = i10;
    }

    @Deprecated
    public Event copy() {
        return this;
    }
}
