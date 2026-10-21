package net.ipsoft.amelia.sdk;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class BpnExecutionEvent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BpnProcessEvent f84546b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class BpnProcessEvent {
        private static final /* synthetic */ BpnProcessEvent[] $VALUES;
        public static final BpnProcessEvent PROCESS_ABORTED_EVENT;
        public static final BpnProcessEvent PROCESS_COMPLETED_EVENT;
        public static final BpnProcessEvent PROCESS_RESUMED_EVENT;
        public static final BpnProcessEvent PROCESS_STARTED_EVENT;
        public static final BpnProcessEvent PROCESS_SUSPENDED_EVENT;
        public static final BpnProcessEvent TASK_COMPLETION_EVENT;
        public static final BpnProcessEvent TASK_STARTED_EVENT;

        static {
            BpnProcessEvent bpnProcessEvent = new BpnProcessEvent("PROCESS_STARTED_EVENT", 0);
            PROCESS_STARTED_EVENT = bpnProcessEvent;
            BpnProcessEvent bpnProcessEvent2 = new BpnProcessEvent("TASK_STARTED_EVENT", 1);
            TASK_STARTED_EVENT = bpnProcessEvent2;
            BpnProcessEvent bpnProcessEvent3 = new BpnProcessEvent("TASK_COMPLETION_EVENT", 2);
            TASK_COMPLETION_EVENT = bpnProcessEvent3;
            BpnProcessEvent bpnProcessEvent4 = new BpnProcessEvent("PROCESS_SUSPENDED_EVENT", 3);
            PROCESS_SUSPENDED_EVENT = bpnProcessEvent4;
            BpnProcessEvent bpnProcessEvent5 = new BpnProcessEvent("PROCESS_RESUMED_EVENT", 4);
            PROCESS_RESUMED_EVENT = bpnProcessEvent5;
            BpnProcessEvent bpnProcessEvent6 = new BpnProcessEvent("PROCESS_ABORTED_EVENT", 5);
            PROCESS_ABORTED_EVENT = bpnProcessEvent6;
            BpnProcessEvent bpnProcessEvent7 = new BpnProcessEvent("PROCESS_COMPLETED_EVENT", 6);
            PROCESS_COMPLETED_EVENT = bpnProcessEvent7;
            $VALUES = new BpnProcessEvent[]{bpnProcessEvent, bpnProcessEvent2, bpnProcessEvent3, bpnProcessEvent4, bpnProcessEvent5, bpnProcessEvent6, bpnProcessEvent7};
        }

        public BpnProcessEvent() {
            throw null;
        }

        public static BpnProcessEvent valueOf(String str) {
            return (BpnProcessEvent) Enum.valueOf(BpnProcessEvent.class, str);
        }

        public static BpnProcessEvent[] values() {
            return (BpnProcessEvent[]) $VALUES.clone();
        }
    }

    public BpnExecutionEvent(JsonReader jsonReader) throws IOException {
        BpnProcessEvent bpnProcessEvent;
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("name".equals(strNextName) && jsonReader.peek() != JsonToken.NULL) {
                String strNextString = jsonReader.nextString();
                if (strNextString.equals("ProcessStartedEvent")) {
                    bpnProcessEvent = BpnProcessEvent.PROCESS_STARTED_EVENT;
                } else if (strNextString.equals("TaskStartedEvent")) {
                    bpnProcessEvent = BpnProcessEvent.TASK_STARTED_EVENT;
                } else if (strNextString.equals("TaskCompletedEvent")) {
                    bpnProcessEvent = BpnProcessEvent.TASK_COMPLETION_EVENT;
                } else if (strNextString.equals("ProcessSuspendedEvent")) {
                    bpnProcessEvent = BpnProcessEvent.PROCESS_SUSPENDED_EVENT;
                } else if (strNextString.equals("ProcessResumedEvent")) {
                    bpnProcessEvent = BpnProcessEvent.PROCESS_RESUMED_EVENT;
                } else if (strNextString.equals("ProcessAbortedEvent")) {
                    bpnProcessEvent = BpnProcessEvent.PROCESS_ABORTED_EVENT;
                } else if (strNextString.equals("ProcessCompletedEvent")) {
                    bpnProcessEvent = BpnProcessEvent.PROCESS_COMPLETED_EVENT;
                } else {
                    jsonReader.skipValue();
                }
                this.f84546b = bpnProcessEvent;
            } else if (!"eventId".equals(strNextName) || jsonReader.peek() == JsonToken.NULL) {
                jsonReader.skipValue();
            } else {
                this.f84545a = jsonReader.nextString();
            }
        }
        jsonReader.endObject();
    }

    public BpnProcessEvent getBpnProcessEvent() {
        return this.f84546b;
    }

    public String getEventId() {
        return this.f84545a;
    }
}
